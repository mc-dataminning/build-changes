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

public class alm extends MinecraftServer implements ahj {
   static final Logger l = LogUtils.getLogger();
   private static final int m = 5000;
   private static final int n = 2;
   private final List<agx> o = Collections.synchronizedList(Lists.newArrayList());
   @Nullable
   private aqv p;
   private final aqs q;
   @Nullable
   private aqx r;
   private final alo s;
   @Nullable
   private als t;
   @Nullable
   private final anu u;

   public alm(Thread $$0, efu.c $$1, apd $$2, ahp $$3, alo $$4, DataFixer $$5, ahm $$6, amz $$7) {
      super($$0, $$1, $$2, $$3, Proxy.NO_PROXY, $$5, $$6, $$7);
      this.s = $$4;
      this.q = new aqs(this);
      this.u = anu.a($$4.a().R);
   }

   @Override
   public boolean e() throws IOException {
      Thread $$0 = new Thread("Server console handler") {
         @Override
         public void run() {
            BufferedReader $$0 = new BufferedReader(new InputStreamReader(System.in, StandardCharsets.UTF_8));

            String $$1;
            try {
               while (!alm.this.ad() && alm.this.v() && ($$1 = $$0.readLine()) != null) {
                  alm.this.a($$1, alm.this.aF());
               }
            } catch (IOException var4) {
               alm.l.error("Exception handling console input", var4);
            }
         }
      };
      $$0.setDaemon(true);
      $$0.setUncaughtExceptionHandler(new r(l));
      $$0.start();
      l.info("Starting minecraft server version {}", aa.b().c());
      if (Runtime.getRuntime().maxMemory() / 1024L / 1024L < 512L) {
         l.warn("To start the server with more ram, launch it as \"java -Xmx1024M -Xms1024M -jar minecraft_server.jar\"");
      }

      l.info("Loading properties");
      aln $$1 = this.s.a();
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
      this.k.a($$1.l);
      l.info("Default game type: {}", $$1.l);
      InetAddress $$2 = null;
      if (!this.u().isEmpty()) {
         $$2 = InetAddress.getByName(this.u());
      }

      if (this.O() < 0) {
         this.a($$1.n);
      }

      this.R();
      l.info("Starting Minecraft server on {}:{}", this.u().isEmpty() ? "*" : this.u(), this.O());

      try {
         this.af().a($$2, this.O());
      } catch (IOException var10) {
         l.warn("**** FAILED TO BIND TO PORT!");
         l.warn("The exception was: {}", var10.toString());
         l.warn("Perhaps a server is already running on that port?");
         return false;
      }

      if (!this.W()) {
         l.warn("**** SERVER IS RUNNING IN OFFLINE/INSECURE MODE!");
         l.warn("The server will make no attempt to authenticate usernames. Beware.");
         l.warn(
            "While this makes the game possible to play without internet access, it also opens up the ability for hackers to connect with any username they choose."
         );
         l.warn("To change this, set \"online-mode\" to \"true\" in the server.properties file.");
      }

      if (this.bn()) {
         this.ar().c();
      }

      if (!aqe.e(this)) {
         return false;
      } else {
         this.a(new all(this, this.ba(), this.h));
         long $$4 = ac.c();
         dho.a(this.j, this);
         aqb.a(this.W());
         l.info("Preparing level \"{}\"", this.q());
         this.u_();
         long $$5 = ac.c() - $$4;
         String $$6 = String.format(Locale.ROOT, "%.3fs", (double)$$5 / 1.0E9);
         l.info("Done ({})! For help, type \"help\"", $$6);
         if ($$1.o != null) {
            this.aK().a(csu.A).a($$1.o, this);
         }

         if ($$1.p) {
            l.info("Starting GS4 status listener");
            this.p = aqv.a(this);
         }

         if ($$1.r) {
            l.info("Starting remote control listener");
            this.r = aqx.a(this);
         }

         if (this.bo() > 0L) {
            Thread $$7 = new Thread(new alp(this));
            $$7.setUncaughtExceptionHandler(new s(l));
            $$7.setName("Server Watchdog");
            $$7.setDaemon(true);
            $$7.start();
         }

         if ($$1.N) {
            bfs.a(this);
            l.info("JMX monitoring enabled");
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
      return this.s.a().w && super.S();
   }

   @Override
   public boolean Z() {
      return this.s.a().e && super.Z();
   }

   @Override
   public aln a() {
      return this.s.a();
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
      aln $$1 = this.a();

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
      if (this.u != null) {
         this.u.close();
      }

      if (this.t != null) {
         this.t.b();
      }

      if (this.r != null) {
         this.r.b();
      }

      if (this.p != null) {
         this.p.b();
      }
   }

   @Override
   public void b(BooleanSupplier $$0) {
      super.b($$0);
      this.bk();
   }

   @Override
   public boolean D() {
      return this.a().v;
   }

   public void a(String $$0, ds $$1) {
      this.o.add(new agx($$0, $$1));
   }

   public void bk() {
      while (!this.o.isEmpty()) {
         agx $$0 = this.o.remove(0);
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

   public all bl() {
      return (all)super.ae();
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

   public void bm() {
      if (this.t == null) {
         this.t = als.a(this);
      }
   }

   @Override
   public boolean ah() {
      return this.t != null;
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
   public boolean a(amp $$0, hv $$1, cer $$2) {
      if ($$0.ad() != csy.h) {
         return false;
      } else if (this.bl().k().c()) {
         return false;
      } else if (this.bl().f($$2.fR())) {
         return false;
      } else if (this.aj() <= 0) {
         return false;
      } else {
         hv $$3 = $$0.S();
         int $$4 = aty.a($$1.u() - $$3.u());
         int $$5 = aty.a($$1.w() - $$3.w());
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
      this.s.a($$1 -> $$1.U.a(this.aZ(), $$0));
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
      aln $$0 = this.a();
      return $$0.W && $$0.a && this.j.a() != null;
   }

   @Override
   public boolean bj() {
      return this.a().X;
   }

   protected boolean bn() {
      boolean $$0 = false;

      for (int $$1 = 0; !$$0 && $$1 <= 2; $$1++) {
         if ($$1 > 0) {
            l.warn("Encountered a problem while converting the user banlist, retrying in a few seconds");
            this.bx();
         }

         $$0 = aqe.a((MinecraftServer)this);
      }

      boolean $$2 = false;

      for (int var7 = 0; !$$2 && var7 <= 2; var7++) {
         if (var7 > 0) {
            l.warn("Encountered a problem while converting the ip banlist, retrying in a few seconds");
            this.bx();
         }

         $$2 = aqe.b(this);
      }

      boolean $$3 = false;

      for (int var8 = 0; !$$3 && var8 <= 2; var8++) {
         if (var8 > 0) {
            l.warn("Encountered a problem while converting the op list, retrying in a few seconds");
            this.bx();
         }

         $$3 = aqe.c(this);
      }

      boolean $$4 = false;

      for (int var9 = 0; !$$4 && var9 <= 2; var9++) {
         if (var9 > 0) {
            l.warn("Encountered a problem while converting the whitelist, retrying in a few seconds");
            this.bx();
         }

         $$4 = aqe.d(this);
      }

      boolean $$5 = false;

      for (int var10 = 0; !$$5 && var10 <= 2; var10++) {
         if (var10 > 0) {
            l.warn("Encountered a problem while converting the player save files, retrying in a few seconds");
            this.bx();
         }

         $$5 = aqe.a(this);
      }

      return $$0 || $$2 || $$3 || $$4 || $$5;
   }

   private void bx() {
      try {
         Thread.sleep(5000L);
      } catch (InterruptedException var2) {
      }
   }

   public long bo() {
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
      this.q.e();
      this.h(() -> this.aE().a(this.q.g(), $$0));
      return this.q.f();
   }

   public void i(boolean $$0) {
      this.s.a($$1 -> $$1.V.a(this.aZ(), $$0));
   }

   @Override
   public void t() {
      super.t();
      ac.h();
      dho.c();
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
      return this.g.d();
   }

   @Override
   public boolean aW() {
      return this.s.a().M;
   }

   @Override
   public ant a(amq $$0) {
      return this.u != null ? this.u.a($$0.fR()) : ant.a;
   }

   @Nullable
   @Override
   public csv bb() {
      return this.s.a().i ? this.k.m() : null;
   }

   @Override
   public Optional<MinecraftServer.b> U() {
      return this.s.a().S;
   }
}
