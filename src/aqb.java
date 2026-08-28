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

public class aqb extends MinecraftServer implements alw {
   static final Logger k = LogUtils.getLogger();
   private static final int l = 5000;
   private static final int m = 2;
   private final List<alj> n = Collections.synchronizedList(Lists.newArrayList());
   @Nullable
   private avt o;
   private final avq p;
   @Nullable
   private avv q;
   private final aqd r;
   @Nullable
   private aqh s;
   @Nullable
   private final asl t;
   @Nullable
   private blx u;
   @Nullable
   private blu v;

   public aqb(Thread $$0, epx.c $$1, aua $$2, amc $$3, aqd $$4, DataFixer $$5, alz $$6, arp $$7) {
      super($$0, $$1, $$2, $$3, Proxy.NO_PROXY, $$5, $$6, $$7);
      this.r = $$4;
      this.p = new avq(this);
      this.t = asl.a($$4.a().S);
   }

   @Override
   public boolean e() throws IOException {
      Thread $$0 = new Thread("Server console handler") {
         @Override
         public void run() {
            BufferedReader $$0 = new BufferedReader(new InputStreamReader(System.in, StandardCharsets.UTF_8));

            String $$1;
            try {
               while (!aqb.this.ag() && aqb.this.x() && ($$1 = $$0.readLine()) != null) {
                  aqb.this.a($$1, aqb.this.aI());
               }
            } catch (IOException var4) {
               aqb.k.error("Exception handling console input", var4);
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
      aqc $$1 = this.r.a();
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

      if (this.bt()) {
         this.au().c();
      }

      if (!avc.e(this)) {
         return false;
      } else {
         this.a(new aqa(this, this.bd(), this.g));
         this.v = new blu(this.br());
         this.u = new blx(bma.values().length, this.v, blw.a);
         long $$4 = ac.d();
         dqu.a(this.i, this);
         auz.a(this.Z());
         k.info("Preparing level \"{}\"", this.s());
         this.t_();
         long $$5 = ac.d() - $$4;
         String $$6 = String.format(Locale.ROOT, "%.3fs", (double)$$5 / 1.0E9);
         k.info("Done ({})! For help, type \"help\"", $$6);
         if ($$1.o != null) {
            this.aM().a(dbv.A).a($$1.o, this);
         }

         if ($$1.p) {
            k.info("Starting GS4 status listener");
            this.o = avt.a(this);
         }

         if ($$1.r) {
            k.info("Starting remote control listener");
            this.q = avv.a(this);
         }

         if (this.bu() > 0L) {
            Thread $$7 = new Thread(new aqe(this));
            $$7.setUncaughtExceptionHandler(new s(k));
            $$7.setName("Server Watchdog");
            $$7.setDaemon(true);
            $$7.start();
         }

         if ($$1.O) {
            bmf.a(this);
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
   public aqc a() {
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
      aqc $$1 = this.a();

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
      this.bq();
   }

   @Override
   public boolean G() {
      return this.a().v;
   }

   public void a(String $$0, ep $$1) {
      this.n.add(new alj($$0, $$1));
   }

   @Override
   public void bq() {
      while (!this.n.isEmpty()) {
         alj $$0 = this.n.remove(0);
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

   public aqa br() {
      return (aqa)super.ah();
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
   public void bs() {
      if (this.s == null) {
         this.s = aqh.a(this);
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
   public boolean a(arf $$0, iz $$1, cmy $$2) {
      if ($$0.af() != dbz.h) {
         return false;
      } else if (this.br().k().c()) {
         return false;
      } else if (this.br().f($$2.gb())) {
         return false;
      } else if (this.am() <= 0) {
         return false;
      } else {
         iz $$3 = $$0.V();
         int $$4 = ayz.a($$1.u() - $$3.u());
         int $$5 = ayz.a($$1.w() - $$3.w());
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
      this.r.a($$1 -> $$1.V.a(this.bc(), $$0));
   }

   @Override
   public boolean m() {
      return this.a().J;
   }

   @Override
   public boolean U_() {
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
      aqc $$0 = this.a();
      return $$0.X && $$0.a && this.i.b();
   }

   @Override
   public boolean bn() {
      return this.a().Y;
   }

   @Override
   protected boolean bt() {
      boolean $$0 = false;

      for (int $$1 = 0; !$$0 && $$1 <= 2; $$1++) {
         if ($$1 > 0) {
            k.warn("Encountered a problem while converting the user banlist, retrying in a few seconds");
            this.bC();
         }

         $$0 = avc.a((MinecraftServer)this);
      }

      boolean $$2 = false;

      for (int var7 = 0; !$$2 && var7 <= 2; var7++) {
         if (var7 > 0) {
            k.warn("Encountered a problem while converting the ip banlist, retrying in a few seconds");
            this.bC();
         }

         $$2 = avc.b(this);
      }

      boolean $$3 = false;

      for (int var8 = 0; !$$3 && var8 <= 2; var8++) {
         if (var8 > 0) {
            k.warn("Encountered a problem while converting the op list, retrying in a few seconds");
            this.bC();
         }

         $$3 = avc.c(this);
      }

      boolean $$4 = false;

      for (int var9 = 0; !$$4 && var9 <= 2; var9++) {
         if (var9 > 0) {
            k.warn("Encountered a problem while converting the whitelist, retrying in a few seconds");
            this.bC();
         }

         $$4 = avc.d(this);
      }

      boolean $$5 = false;

      for (int var10 = 0; !$$5 && var10 <= 2; var10++) {
         if (var10 > 0) {
            k.warn("Encountered a problem while converting the player save files, retrying in a few seconds");
            this.bC();
         }

         $$5 = avc.a(this);
      }

      return $$0 || $$2 || $$3 || $$4 || $$5;
   }

   private void bC() {
      try {
         Thread.sleep(5000L);
      } catch (InterruptedException var2) {
      }
   }

   public long bu() {
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
      this.r.a($$1 -> $$1.W.a(this.bc(), $$0));
   }

   @Override
   public void v() {
      super.v();
      ac.j();
      dqu.b();
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
      return this.f.f();
   }

   @Override
   public boolean aZ() {
      return this.r.a().M;
   }

   @Override
   public ask a(arg $$0) {
      return this.t != null ? this.t.a($$0.gb()) : ask.a;
   }

   @Nullable
   @Override
   public dbw bf() {
      return this.r.a().i ? this.j.k() : null;
   }

   @Override
   public Optional<MinecraftServer.b> X() {
      return this.r.a().T;
   }

   @Override
   public void aU() {
      super.aU();
      this.v.a(this.al());
   }

   @Override
   public bly f() {
      return this.u;
   }

   @Override
   public boolean g() {
      return this.v.a(blw.a);
   }

   @Override
   public void a(arg $$0, blw $$1) {
      this.v.a($$0, $$1);
   }

   @Override
   public boolean bo() {
      return this.r.a().aa;
   }
}
