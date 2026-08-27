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

public class ans extends MinecraftServer implements ajo {
   static final Logger k = LogUtils.getLogger();
   private static final int l = 5000;
   private static final int m = 2;
   private final List<ajc> n = Collections.synchronizedList(Lists.newArrayList());
   @Nullable
   private atd o;
   private final ata p;
   @Nullable
   private atf q;
   private final anu r;
   @Nullable
   private any s;
   @Nullable
   private final aqa t;

   public ans(Thread $$0, eil.c $$1, arl $$2, aju $$3, anu $$4, DataFixer $$5, ajr $$6, apf $$7) {
      super($$0, $$1, $$2, $$3, Proxy.NO_PROXY, $$5, $$6, $$7);
      this.r = $$4;
      this.p = new ata(this);
      this.t = aqa.a($$4.a().R);
   }

   @Override
   public boolean e() throws IOException {
      Thread $$0 = new Thread("Server console handler") {
         @Override
         public void run() {
            BufferedReader $$0 = new BufferedReader(new InputStreamReader(System.in, StandardCharsets.UTF_8));

            String $$1;
            try {
               while (!ans.this.ad() && ans.this.v() && ($$1 = $$0.readLine()) != null) {
                  ans.this.a($$1, ans.this.aF());
               }
            } catch (IOException var4) {
               ans.k.error("Exception handling console input", var4);
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
      ant $$1 = this.r.a();
      if (this.Q()) {
         this.a_("127.0.0.1");
      } else {
         this.d($$1.a);
         this.e($$1.b);
         this.a_($$1.c);
      }

      this.f($$1.f);
      this.g($$1.g);
      this.d($$1.h);
      super.c($$1.U.get());
      this.h($$1.j);
      this.j.a($$1.l);
      k.info("Default game type: {}", $$1.l);
      InetAddress $$2 = null;
      if (!this.u().isEmpty()) {
         $$2 = InetAddress.getByName(this.u());
      }

      if (this.O() < 0) {
         this.a($$1.n);
      }

      this.R();
      k.info("Starting Minecraft server on {}:{}", this.u().isEmpty() ? "*" : this.u(), this.O());

      try {
         this.af().a($$2, this.O());
      } catch (IOException var10) {
         k.warn("**** FAILED TO BIND TO PORT!");
         k.warn("The exception was: {}", var10.toString());
         k.warn("Perhaps a server is already running on that port?");
         return false;
      }

      if (!this.W()) {
         k.warn("**** SERVER IS RUNNING IN OFFLINE/INSECURE MODE!");
         k.warn("The server will make no attempt to authenticate usernames. Beware.");
         k.warn(
            "While this makes the game possible to play without internet access, it also opens up the ability for hackers to connect with any username they choose."
         );
         k.warn("To change this, set \"online-mode\" to \"true\" in the server.properties file.");
      }

      if (this.bo()) {
         this.ar().c();
      }

      if (!asm.e(this)) {
         return false;
      } else {
         this.a(new anr(this, this.ba(), this.g));
         long $$4 = ac.c();
         dke.a(this.i, this);
         asj.a(this.W());
         k.info("Preparing level \"{}\"", this.q());
         this.u_();
         long $$5 = ac.c() - $$4;
         String $$6 = String.format(Locale.ROOT, "%.3fs", (double)$$5 / 1.0E9);
         k.info("Done ({})! For help, type \"help\"", $$6);
         if ($$1.o != null) {
            this.aK().a(cvj.A).a($$1.o, this);
         }

         if ($$1.p) {
            k.info("Starting GS4 status listener");
            this.o = atd.a(this);
         }

         if ($$1.r) {
            k.info("Starting remote control listener");
            this.q = atf.a(this);
         }

         if (this.bp() > 0L) {
            Thread $$7 = new Thread(new anv(this));
            $$7.setUncaughtExceptionHandler(new s(k));
            $$7.setName("Server Watchdog");
            $$7.setDaemon(true);
            $$7.start();
         }

         if ($$1.N) {
            bib.a(this);
            k.info("JMX monitoring enabled");
         }

         return true;
      }
   }

   @Override
   public boolean Y() {
      return this.a().d && super.Y();
   }

   @Override
   public boolean S() {
      return this.r.a().w && super.S();
   }

   @Override
   public boolean Z() {
      return this.r.a().e && super.Z();
   }

   @Override
   public ant a() {
      return this.r.a();
   }

   @Override
   public void r() {
      this.a(this.a().k, true);
   }

   @Override
   public boolean h() {
      return this.a().u;
   }

   @Override
   public ab a(ab $$0) {
      $$0.a("Is Modded", () -> this.M().b());
      $$0.a("Type", () -> "Dedicated Server (map_server.txt)");
      return $$0;
   }

   @Override
   public void a(Path $$0) throws IOException {
      ant $$1 = this.a();

      try (Writer $$2 = Files.newBufferedWriter($$0)) {
         $$2.write(String.format(Locale.ROOT, "sync-chunk-writes=%s%n", $$1.M));
         $$2.write(String.format(Locale.ROOT, "gamemode=%s%n", $$1.l));
         $$2.write(String.format(Locale.ROOT, "spawn-monsters=%s%n", $$1.w));
         $$2.write(String.format(Locale.ROOT, "entity-broadcast-range-percentage=%d%n", $$1.Q));
         $$2.write(String.format(Locale.ROOT, "max-world-size=%d%n", $$1.L));
         $$2.write(String.format(Locale.ROOT, "spawn-npcs=%s%n", $$1.e));
         $$2.write(String.format(Locale.ROOT, "view-distance=%d%n", $$1.F));
         $$2.write(String.format(Locale.ROOT, "simulation-distance=%d%n", $$1.G));
         $$2.write(String.format(Locale.ROOT, "spawn-animals=%s%n", $$1.d));
         $$2.write(String.format(Locale.ROOT, "generate-structures=%s%n", $$1.Y.c()));
         $$2.write(String.format(Locale.ROOT, "use-native=%s%n", $$1.x));
         $$2.write(String.format(Locale.ROOT, "rate-limit=%d%n", $$1.E));
      }
   }

   @Override
   public void g() {
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
      this.bl();
   }

   @Override
   public boolean D() {
      return this.a().v;
   }

   public void a(String $$0, du $$1) {
      this.n.add(new ajc($$0, $$1));
   }

   public void bl() {
      while (!this.n.isEmpty()) {
         ajc $$0 = this.n.remove(0);
         this.aE().a($$0.b, $$0.a);
      }
   }

   @Override
   public boolean l() {
      return true;
   }

   @Override
   public int m() {
      return this.a().E;
   }

   @Override
   public boolean n() {
      return this.a().x;
   }

   public anr bm() {
      return (anr)super.ae();
   }

   @Override
   public boolean p() {
      return true;
   }

   @Override
   public String b() {
      return this.u();
   }

   @Override
   public int d() {
      return this.O();
   }

   @Override
   public String f() {
      return this.ac();
   }

   public void bn() {
      if (this.s == null) {
         this.s = any.a(this);
      }
   }

   @Override
   public boolean ah() {
      return this.s != null;
   }

   @Override
   public boolean o() {
      return this.a().y;
   }

   @Override
   public int aj() {
      return this.a().z;
   }

   @Override
   public boolean a(aov $$0, hz $$1, chh $$2) {
      if ($$0.ae() != cvn.h) {
         return false;
      } else if (this.bm().k().c()) {
         return false;
      } else if (this.bm().f($$2.fS())) {
         return false;
      } else if (this.aj() <= 0) {
         return false;
      } else {
         hz $$3 = $$0.T();
         int $$4 = awh.a($$1.u() - $$3.u());
         int $$5 = awh.a($$1.w() - $$3.w());
         int $$6 = Math.max($$4, $$5);
         return $$6 <= this.aj();
      }
   }

   @Override
   public boolean ak() {
      return this.a().O;
   }

   @Override
   public boolean al() {
      return this.a().P;
   }

   @Override
   public int i() {
      return this.a().A;
   }

   @Override
   public int j() {
      return this.a().B;
   }

   @Override
   public void c(int $$0) {
      super.c($$0);
      this.r.a($$1 -> $$1.U.a(this.aZ(), $$0));
   }

   @Override
   public boolean k() {
      return this.a().J;
   }

   @Override
   public boolean W_() {
      return this.a().K;
   }

   @Override
   public int au() {
      return this.a().L;
   }

   @Override
   public int ax() {
      return this.a().I;
   }

   @Override
   public boolean ay() {
      ant $$0 = this.a();
      return $$0.W && $$0.a && this.i.b();
   }

   @Override
   public boolean bj() {
      return this.a().X;
   }

   protected boolean bo() {
      boolean $$0 = false;

      for (int $$1 = 0; !$$0 && $$1 <= 2; $$1++) {
         if ($$1 > 0) {
            k.warn("Encountered a problem while converting the user banlist, retrying in a few seconds");
            this.by();
         }

         $$0 = asm.a((MinecraftServer)this);
      }

      boolean $$2 = false;

      for (int var7 = 0; !$$2 && var7 <= 2; var7++) {
         if (var7 > 0) {
            k.warn("Encountered a problem while converting the ip banlist, retrying in a few seconds");
            this.by();
         }

         $$2 = asm.b(this);
      }

      boolean $$3 = false;

      for (int var8 = 0; !$$3 && var8 <= 2; var8++) {
         if (var8 > 0) {
            k.warn("Encountered a problem while converting the op list, retrying in a few seconds");
            this.by();
         }

         $$3 = asm.c(this);
      }

      boolean $$4 = false;

      for (int var9 = 0; !$$4 && var9 <= 2; var9++) {
         if (var9 > 0) {
            k.warn("Encountered a problem while converting the whitelist, retrying in a few seconds");
            this.by();
         }

         $$4 = asm.d(this);
      }

      boolean $$5 = false;

      for (int var10 = 0; !$$5 && var10 <= 2; var10++) {
         if (var10 > 0) {
            k.warn("Encountered a problem while converting the player save files, retrying in a few seconds");
            this.by();
         }

         $$5 = asm.a(this);
      }

      return $$0 || $$2 || $$3 || $$4 || $$5;
   }

   private void by() {
      try {
         Thread.sleep(5000L);
      } catch (InterruptedException var2) {
      }
   }

   public long bp() {
      return this.a().C;
   }

   @Override
   public int bh() {
      return this.a().D;
   }

   @Override
   public String s() {
      return "";
   }

   @Override
   public String a(String $$0) {
      this.p.e();
      this.h(() -> this.aE().a(this.p.g(), $$0));
      return this.p.f();
   }

   public void i(boolean $$0) {
      this.r.a($$1 -> $$1.V.a(this.aZ(), $$0));
   }

   @Override
   public void t() {
      super.t();
      ac.i();
      dke.c();
   }

   @Override
   public boolean a(GameProfile $$0) {
      return false;
   }

   @Override
   public int b(int $$0) {
      return this.a().Q * $$0 / 100;
   }

   @Override
   public String q() {
      return this.f.d();
   }

   @Override
   public boolean aW() {
      return this.r.a().M;
   }

   @Override
   public apz a(aow $$0) {
      return this.t != null ? this.t.a($$0.fS()) : apz.a;
   }

   @Nullable
   @Override
   public cvk bb() {
      return this.r.a().i ? this.j.k() : null;
   }

   @Override
   public Optional<MinecraftServer.b> U() {
      return this.r.a().S;
   }

   @Override
   public boolean bk() {
      return this.r.a().Z;
   }
}
