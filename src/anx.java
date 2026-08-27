import com.google.common.collect.Lists;
import com.mojang.authlib.GameProfile;
import com.mojang.datafixers.DataFixer;
import com.mojang.logging.LogUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Writer;
import java.net.InetAddress;
import java.net.Proxy;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class anx extends MinecraftServer implements ajs {
   static final Logger k = LogUtils.getLogger();
   private static final int l = 5000;
   private static final int m = 2;
   private final List<ajg> n = Collections.synchronizedList(Lists.newArrayList());
   @Nullable
   private ati o;
   private final atf p;
   @Nullable
   private atk q;
   private final anz r;
   @Nullable
   private aod s;
   @Nullable
   private final aqf t;
   @Nullable
   private bik u;
   @Nullable
   private bih v;

   public anx(Thread $$0, ejo.c $$1, arq $$2, ajy $$3, anz $$4, DataFixer $$5, ajv $$6, apk $$7) {
      super($$0, $$1, $$2, $$3, Proxy.NO_PROXY, $$5, $$6, $$7);
      this.r = $$4;
      this.p = new atf(this);
      this.t = aqf.a($$4.a().S);
   }

   @Override
   public boolean e() throws IOException {
      Thread $$0 = new Thread("Server console handler") {
         @Override
         public void run() {
            BufferedReader $$0 = new BufferedReader(new InputStreamReader(System.in, StandardCharsets.UTF_8));

            String $$1;
            try {
               while (!anx.this.ag() && anx.this.x() && ($$1 = $$0.readLine()) != null) {
                  anx.this.a($$1, anx.this.aI());
               }
            } catch (IOException var4) {
               anx.k.error("Exception handling console input", var4);
            }
         }
      };
      $$0.setDaemon(true);
      $$0.setUncaughtExceptionHandler(new r(k));
      $$0.start();
      k.info("Starting minecraft server version {}", aa.b().c());
      if (Runtime.getRuntime().maxMemory() / 1024L / 1024L < 512L) {
         k.warn("To start the server with more ram, launch it as \"java -Xmx1024M -Xms1024M -jar minecraft_server.jar\"");
      }

      k.info("Loading properties");
      any $$1 = this.r.a();
      if (this.T()) {
         this.a_("127.0.0.1");
      } else {
         this.d($$1.a);
         this.e($$1.b);
         this.a_($$1.c);
      }

      this.f($$1.f);
      this.g($$1.g);
      this.d($$1.h);
      super.c($$1.V.get());
      this.h($$1.j);
      this.j.a($$1.l);
      k.info("Default game type: {}", $$1.l);
      InetAddress $$2 = null;
      if (!this.w().isEmpty()) {
         $$2 = InetAddress.getByName(this.w());
      }

      if (this.R() < 0) {
         this.a($$1.n);
      }

      this.U();
      k.info("Starting Minecraft server on {}:{}", this.w().isEmpty() ? "*" : this.w(), this.R());

      try {
         this.ai().a($$2, this.R());
      } catch (IOException var10) {
         k.warn("**** FAILED TO BIND TO PORT!");
         k.warn("The exception was: {}", var10.toString());
         k.warn("Perhaps a server is already running on that port?");
         return false;
      }

      if (!this.Z()) {
         k.warn("**** SERVER IS RUNNING IN OFFLINE/INSECURE MODE!");
         k.warn("The server will make no attempt to authenticate usernames. Beware.");
         k.warn(
            "While this makes the game possible to play without internet access, it also opens up the ability for hackers to connect with any username they choose."
         );
         k.warn("To change this, set \"online-mode\" to \"true\" in the server.properties file.");
      }

      if (this.bs()) {
         this.au().c();
      }

      if (!asr.e(this)) {
         return false;
      } else {
         this.a(new anw(this, this.be(), this.g));
         this.v = new bih(this.bq());
         this.u = new bik(bin.values().length, this.v, bij.a);
         long $$4 = ac.c();
         dkw.a(this.i, this);
         aso.a(this.Z());
         k.info("Preparing level \"{}\"", this.s());
         this.u_();
         long $$5 = ac.c() - $$4;
         String $$6 = String.format(Locale.ROOT, "%.3fs", (double)$$5 / 1.0E9);
         k.info("Done ({})! For help, type \"help\"", $$6);
         if ($$1.o != null) {
            this.aN().a(cwa.A).a($$1.o, this);
         }

         if ($$1.p) {
            k.info("Starting GS4 status listener");
            this.o = ati.a(this);
         }

         if ($$1.r) {
            k.info("Starting remote control listener");
            this.q = atk.a(this);
         }

         if (this.bt() > 0L) {
            Thread $$7 = new Thread(new aoa(this));
            $$7.setUncaughtExceptionHandler(new s(k));
            $$7.setName("Server Watchdog");
            $$7.setDaemon(true);
            $$7.start();
         }

         if ($$1.O) {
            bis.a(this);
            k.info("JMX monitoring enabled");
         }

         return true;
      }
   }

   @Override
   public boolean ab() {
      return this.a().d && super.ab();
   }

   @Override
   public boolean V() {
      return this.r.a().w && super.V();
   }

   @Override
   public boolean ac() {
      return this.r.a().e && super.ac();
   }

   @Override
   public any a() {
      return this.r.a();
   }

   @Override
   public void t() {
      this.a(this.a().k, true);
   }

   @Override
   public boolean j() {
      return this.a().u;
   }

   @Override
   public ab a(ab $$0) {
      $$0.a("Is Modded", () -> this.P().b());
      $$0.a("Type", () -> "Dedicated Server (map_server.txt)");
      return $$0;
   }

   @Override
   public void a(Path $$0) throws IOException {
      any $$1 = this.a();

      try (Writer $$2 = Files.newBufferedWriter($$0)) {
         $$2.write(String.format(Locale.ROOT, "sync-chunk-writes=%s%n", $$1.M));
         $$2.write(String.format(Locale.ROOT, "gamemode=%s%n", $$1.l));
         $$2.write(String.format(Locale.ROOT, "spawn-monsters=%s%n", $$1.w));
         $$2.write(String.format(Locale.ROOT, "entity-broadcast-range-percentage=%d%n", $$1.R));
         $$2.write(String.format(Locale.ROOT, "max-world-size=%d%n", $$1.L));
         $$2.write(String.format(Locale.ROOT, "spawn-npcs=%s%n", $$1.e));
         $$2.write(String.format(Locale.ROOT, "view-distance=%d%n", $$1.F));
         $$2.write(String.format(Locale.ROOT, "simulation-distance=%d%n", $$1.G));
         $$2.write(String.format(Locale.ROOT, "spawn-animals=%s%n", $$1.d));
         $$2.write(String.format(Locale.ROOT, "generate-structures=%s%n", $$1.Z.c()));
         $$2.write(String.format(Locale.ROOT, "use-native=%s%n", $$1.x));
         $$2.write(String.format(Locale.ROOT, "rate-limit=%d%n", $$1.E));
      }
   }

   @Override
   public void i() {
      if (this.t != null) {
         this.t.close();
      }

      if (this.s != null) {
         this.s.b();
      }

      if (this.q != null) {
         this.q.b();
      }

      if (this.o != null) {
         this.o.b();
      }
   }

   @Override
   public void b(BooleanSupplier $$0) {
      super.b($$0);
      this.bp();
   }

   @Override
   public boolean G() {
      return this.a().v;
   }

   public void a(String $$0, du $$1) {
      this.n.add(new ajg($$0, $$1));
   }

   @Override
   public void bp() {
      while (!this.n.isEmpty()) {
         ajg $$0 = this.n.remove(0);
         this.aH().a($$0.b, $$0.a);
      }
   }

   @Override
   public boolean n() {
      return true;
   }

   @Override
   public int o() {
      return this.a().E;
   }

   @Override
   public boolean p() {
      return this.a().x;
   }

   public anw bq() {
      return (anw)super.ah();
   }

   @Override
   public boolean r() {
      return true;
   }

   @Override
   public String b() {
      return this.w();
   }

   @Override
   public int d() {
      return this.R();
   }

   @Override
   public String h() {
      return this.af();
   }

   @Override
   public void br() {
      if (this.s == null) {
         this.s = aod.a(this);
      }
   }

   @Override
   public boolean ak() {
      return this.s != null;
   }

   @Override
   public boolean q() {
      return this.a().y;
   }

   @Override
   public int am() {
      return this.a().z;
   }

   @Override
   public boolean a(apa $$0, ib $$1, cia $$2) {
      if ($$0.ad() != cwe.h) {
         return false;
      } else if (this.bq().k().c()) {
         return false;
      } else if (this.bq().f($$2.fU())) {
         return false;
      } else if (this.am() <= 0) {
         return false;
      } else {
         ib $$3 = $$0.T();
         int $$4 = awm.a($$1.u() - $$3.u());
         int $$5 = awm.a($$1.w() - $$3.w());
         int $$6 = Math.max($$4, $$5);
         return $$6 <= this.am();
      }
   }

   @Override
   public boolean an() {
      return this.a().P;
   }

   @Override
   public boolean ao() {
      return this.a().Q;
   }

   @Override
   public int k() {
      return this.a().A;
   }

   @Override
   public int l() {
      return this.a().B;
   }

   @Override
   public void c(int $$0) {
      super.c($$0);
      this.r.a($$1 -> $$1.V.a(this.bd(), $$0));
   }

   @Override
   public boolean m() {
      return this.a().J;
   }

   @Override
   public boolean W_() {
      return this.a().K;
   }

   @Override
   public int ax() {
      return this.a().L;
   }

   @Override
   public int aA() {
      return this.a().I;
   }

   @Override
   public boolean aB() {
      any $$0 = this.a();
      return $$0.X && $$0.a && this.i.b();
   }

   @Override
   public boolean bn() {
      return this.a().Y;
   }

   @Override
   protected boolean bs() {
      boolean $$0 = false;

      for (int $$1 = 0; !$$0 && $$1 <= 2; $$1++) {
         if ($$1 > 0) {
            k.warn("Encountered a problem while converting the user banlist, retrying in a few seconds");
            this.bB();
         }

         $$0 = asr.a((MinecraftServer)this);
      }

      boolean $$2 = false;

      for (int var7 = 0; !$$2 && var7 <= 2; var7++) {
         if (var7 > 0) {
            k.warn("Encountered a problem while converting the ip banlist, retrying in a few seconds");
            this.bB();
         }

         $$2 = asr.b(this);
      }

      boolean $$3 = false;

      for (int var8 = 0; !$$3 && var8 <= 2; var8++) {
         if (var8 > 0) {
            k.warn("Encountered a problem while converting the op list, retrying in a few seconds");
            this.bB();
         }

         $$3 = asr.c(this);
      }

      boolean $$4 = false;

      for (int var9 = 0; !$$4 && var9 <= 2; var9++) {
         if (var9 > 0) {
            k.warn("Encountered a problem while converting the whitelist, retrying in a few seconds");
            this.bB();
         }

         $$4 = asr.d(this);
      }

      boolean $$5 = false;

      for (int var10 = 0; !$$5 && var10 <= 2; var10++) {
         if (var10 > 0) {
            k.warn("Encountered a problem while converting the player save files, retrying in a few seconds");
            this.bB();
         }

         $$5 = asr.a(this);
      }

      return $$0 || $$2 || $$3 || $$4 || $$5;
   }

   private void bB() {
      try {
         Thread.sleep(5000L);
      } catch (InterruptedException var2) {
      }
   }

   public long bt() {
      return this.a().C;
   }

   @Override
   public int bl() {
      return this.a().D;
   }

   @Override
   public String u() {
      return "";
   }

   @Override
   public String a(String $$0) {
      this.p.e();
      this.h(() -> this.aH().a(this.p.g(), $$0));
      return this.p.f();
   }

   public void i(boolean $$0) {
      this.r.a($$1 -> $$1.W.a(this.bd(), $$0));
   }

   @Override
   public void v() {
      super.v();
      ac.i();
      dkw.b();
   }

   @Override
   public boolean a(GameProfile $$0) {
      return false;
   }

   @Override
   public int b(int $$0) {
      return this.a().R * $$0 / 100;
   }

   @Override
   public String s() {
      return this.f.d();
   }

   @Override
   public boolean ba() {
      return this.r.a().M;
   }

   @Override
   public aqe a(apb $$0) {
      return this.t != null ? this.t.a($$0.fU()) : aqe.a;
   }

   @Nullable
   @Override
   public cwb bf() {
      return this.r.a().i ? this.j.k() : null;
   }

   @Override
   public Optional<MinecraftServer.b> X() {
      return this.r.a().T;
   }

   @Override
   public void aV() {
      super.aV();
      this.v.a(this.al());
   }

   @Override
   public bil f() {
      return this.u;
   }

   @Override
   public boolean g() {
      return this.v.a(bij.a);
   }

   @Override
   public void a(apb $$0, bij $$1) {
      this.v.a($$0, $$1);
   }

   @Override
   public boolean bo() {
      return this.r.a().aa;
   }
}
