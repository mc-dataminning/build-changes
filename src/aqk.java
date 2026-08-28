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
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class aqk extends MinecraftServer implements amb {
   static final Logger l = LogUtils.getLogger();
   private static final int m = 5000;
   private static final int n = 2;
   private final List<alo> o = Collections.synchronizedList(Lists.newArrayList());
   @Nullable
   private awk p;
   private final awh q;
   @Nullable
   private awm r;
   private final aqm s;
   @Nullable
   private aqq t;
   @Nullable
   private final atc u;
   @Nullable
   private bpg v;
   @Nullable
   private bpd w;
   private final amc x;

   public aqk(Thread $$0, ezx.c $$1, aur $$2, amj $$3, aqm $$4, DataFixer $$5, amf $$6, asf $$7) {
      super($$0, $$1, $$2, $$3, Proxy.NO_PROXY, $$5, $$6, $$7);
      this.s = $$4;
      this.q = new awh(this);
      this.u = atc.a($$4.a());
      this.x = a($$4);
   }

   @Override
   public boolean e() throws IOException {
      Thread $$0 = new Thread("Server console handler") {
         @Override
         public void run() {
            BufferedReader $$0 = new BufferedReader(new InputStreamReader(System.in, StandardCharsets.UTF_8));

            String $$1;
            try {
               while (!aqk.this.af() && aqk.this.x() && ($$1 = $$0.readLine()) != null) {
                  aqk.this.a($$1, aqk.this.aH());
               }
            } catch (IOException var4) {
               aqk.l.error("Exception handling console input", var4);
            }
         }
      };
      $$0.setDaemon(true);
      $$0.setUncaughtExceptionHandler(new s(l));
      $$0.start();
      l.info("Starting minecraft server version {}", ac.b().c());
      if (Runtime.getRuntime().maxMemory() / 1024L / 1024L < 512L) {
         l.warn("To start the server with more ram, launch it as \"java -Xmx1024M -Xms1024M -jar minecraft_server.jar\"");
      }

      l.info("Loading properties");
      aql $$1 = this.s.a();
      if (this.U()) {
         this.a_("127.0.0.1");
      } else {
         this.d($$1.a);
         this.e($$1.b);
         this.a_($$1.c);
      }

      this.f($$1.d);
      this.g($$1.e);
      this.d($$1.f);
      super.c($$1.V.get());
      this.h($$1.i);
      this.j.a($$1.k);
      l.info("Default game type: {}", $$1.k);
      InetAddress $$2 = null;
      if (!this.w().isEmpty()) {
         $$2 = InetAddress.getByName(this.w());
      }

      if (this.S() < 0) {
         this.a($$1.m);
      }

      this.V();
      l.info("Starting Minecraft server on {}:{}", this.w().isEmpty() ? "*" : this.w(), this.S());

      try {
         this.ah().a($$2, this.S());
      } catch (IOException var10) {
         l.warn("**** FAILED TO BIND TO PORT!");
         l.warn("The exception was: {}", var10.toString());
         l.warn("Perhaps a server is already running on that port?");
         return false;
      }

      if (!this.aa()) {
         l.warn("**** SERVER IS RUNNING IN OFFLINE/INSECURE MODE!");
         l.warn("The server will make no attempt to authenticate usernames. Beware.");
         l.warn(
            "While this makes the game possible to play without internet access, it also opens up the ability for hackers to connect with any username they choose."
         );
         l.warn("To change this, set \"online-mode\" to \"true\" in the server.properties file.");
      }

      if (this.bu()) {
         this.at().c();
      }

      if (!avt.e(this)) {
         return false;
      } else {
         this.a(new aqj(this, this.bb(), this.g));
         this.w = new bpd(this.bs());
         this.v = new bpg(bpj.values().length, this.w, bpf.a);
         long $$4 = ag.d();
         dzu.a(this.i, this);
         avq.a(this.aa());
         l.info("Preparing level \"{}\"", this.j());
         this.u_();
         long $$5 = ag.d() - $$4;
         String $$6 = String.format(Locale.ROOT, "%.3fs", (double)$$5 / 1.0E9);
         l.info("Done ({})! For help, type \"help\"", $$6);
         if ($$1.n != null) {
            this.aL().b(djv.C).a($$1.n, this);
         }

         if ($$1.o) {
            l.info("Starting GS4 status listener");
            this.p = awk.a(this);
         }

         if ($$1.q) {
            l.info("Starting remote control listener");
            this.r = awm.a(this);
         }

         if (this.bv() > 0L) {
            Thread $$7 = new Thread(new aqn(this));
            $$7.setUncaughtExceptionHandler(new t(l));
            $$7.setName("Server Watchdog");
            $$7.setDaemon(true);
            $$7.start();
         }

         if ($$1.N) {
            bpp.a(this);
            l.info("JMX monitoring enabled");
         }

         return true;
      }
   }

   @Override
   public boolean W() {
      return this.s.a().v && super.W();
   }

   @Override
   public aql a() {
      return this.s.a();
   }

   @Override
   public void t() {
      this.a(this.a().j, true);
   }

   @Override
   public ae a(ae $$0) {
      $$0.a("Is Modded", () -> this.Q().b());
      $$0.a("Type", () -> "Dedicated Server (map_server.txt)");
      return $$0;
   }

   @Override
   public void a(Path $$0) throws IOException {
      aql $$1 = this.a();

      try (Writer $$2 = Files.newBufferedWriter($$0)) {
         $$2.write(String.format(Locale.ROOT, "sync-chunk-writes=%s%n", $$1.L));
         $$2.write(String.format(Locale.ROOT, "gamemode=%s%n", $$1.k));
         $$2.write(String.format(Locale.ROOT, "spawn-monsters=%s%n", $$1.v));
         $$2.write(String.format(Locale.ROOT, "entity-broadcast-range-percentage=%d%n", $$1.Q));
         $$2.write(String.format(Locale.ROOT, "max-world-size=%d%n", $$1.K));
         $$2.write(String.format(Locale.ROOT, "view-distance=%d%n", $$1.E));
         $$2.write(String.format(Locale.ROOT, "simulation-distance=%d%n", $$1.F));
         $$2.write(String.format(Locale.ROOT, "generate-structures=%s%n", $$1.aa.d()));
         $$2.write(String.format(Locale.ROOT, "use-native=%s%n", $$1.w));
         $$2.write(String.format(Locale.ROOT, "rate-limit=%d%n", $$1.D));
      }
   }

   @Override
   public void i() {
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
   public void G() {
      super.G();
      this.br();
   }

   @Override
   public boolean a(djz $$0) {
      return $$0.aj() == djz.j ? this.a().u : true;
   }

   public void a(String $$0, ek $$1) {
      this.o.add(new alo($$0, $$1));
   }

   @Override
   public void br() {
      while (!this.o.isEmpty()) {
         alo $$0 = this.o.remove(0);
         this.aG().a($$0.b, $$0.a);
      }
   }

   @Override
   public boolean n() {
      return true;
   }

   @Override
   public int o() {
      return this.a().D;
   }

   @Override
   public boolean p() {
      return this.a().w;
   }

   public aqj bs() {
      return (aqj)super.ag();
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
      return this.S();
   }

   @Override
   public String h() {
      return this.ae();
   }

   @Override
   public void bt() {
      if (this.t == null) {
         this.t = aqq.a(this);
      }
   }

   @Override
   public boolean aj() {
      return this.t != null;
   }

   @Override
   public boolean q() {
      return this.a().x;
   }

   @Override
   public int al() {
      return this.a().y;
   }

   @Override
   public boolean a(aru $$0, iw $$1, crz $$2) {
      if ($$0.aj() != djz.i) {
         return false;
      } else if (this.bs().k().c()) {
         return false;
      } else if (this.bs().f($$2.gi())) {
         return false;
      } else if (this.al() <= 0) {
         return false;
      } else {
         iw $$3 = $$0.aa();
         int $$4 = azq.a($$1.u() - $$3.u());
         int $$5 = azq.a($$1.w() - $$3.w());
         int $$6 = Math.max($$4, $$5);
         return $$6 <= this.al();
      }
   }

   @Override
   public boolean am() {
      return this.a().O;
   }

   @Override
   public boolean an() {
      return this.a().P;
   }

   @Override
   public int k() {
      return this.a().z;
   }

   @Override
   public int l() {
      return this.a().A;
   }

   @Override
   public void c(int $$0) {
      super.c($$0);
      this.s.a($$1 -> $$1.V.a(this.ba(), $$0));
   }

   @Override
   public boolean m() {
      return this.a().I;
   }

   @Override
   public boolean c() {
      return this.a().J;
   }

   @Override
   public int aw() {
      return this.a().K;
   }

   @Override
   public int az() {
      return this.a().H;
   }

   @Override
   public boolean aA() {
      aql $$0 = this.a();
      return $$0.X && $$0.a && this.i.b();
   }

   @Override
   public boolean bl() {
      return this.a().Y;
   }

   @Override
   protected boolean bu() {
      boolean $$0 = false;

      for (int $$1 = 0; !$$0 && $$1 <= 2; $$1++) {
         if ($$1 > 0) {
            l.warn("Encountered a problem while converting the user banlist, retrying in a few seconds");
            this.bC();
         }

         $$0 = avt.a((MinecraftServer)this);
      }

      boolean $$2 = false;

      for (int var7 = 0; !$$2 && var7 <= 2; var7++) {
         if (var7 > 0) {
            l.warn("Encountered a problem while converting the ip banlist, retrying in a few seconds");
            this.bC();
         }

         $$2 = avt.b(this);
      }

      boolean $$3 = false;

      for (int var8 = 0; !$$3 && var8 <= 2; var8++) {
         if (var8 > 0) {
            l.warn("Encountered a problem while converting the op list, retrying in a few seconds");
            this.bC();
         }

         $$3 = avt.c(this);
      }

      boolean $$4 = false;

      for (int var9 = 0; !$$4 && var9 <= 2; var9++) {
         if (var9 > 0) {
            l.warn("Encountered a problem while converting the whitelist, retrying in a few seconds");
            this.bC();
         }

         $$4 = avt.d(this);
      }

      boolean $$5 = false;

      for (int var10 = 0; !$$5 && var10 <= 2; var10++) {
         if (var10 > 0) {
            l.warn("Encountered a problem while converting the player save files, retrying in a few seconds");
            this.bC();
         }

         $$5 = avt.a(this);
      }

      return $$0 || $$2 || $$3 || $$4 || $$5;
   }

   private void bC() {
      try {
         Thread.sleep(5000L);
      } catch (InterruptedException var2) {
      }
   }

   public long bv() {
      return this.a().B;
   }

   @Override
   public int bj() {
      return this.a().C;
   }

   @Override
   public String s() {
      return "";
   }

   @Override
   public String a(String $$0) {
      this.q.e();
      this.h(() -> this.aG().a(this.q.g(), $$0));
      return this.q.f();
   }

   public void i(boolean $$0) {
      this.s.a($$1 -> $$1.W.a(this.ba(), $$0));
   }

   @Override
   public void v() {
      super.v();
      ag.k();
      dzu.a();
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
   public String j() {
      return this.f.f();
   }

   @Override
   public boolean aX() {
      return this.s.a().L;
   }

   @Override
   public atd a(arv $$0) {
      return this.u != null ? this.u.a($$0.gi()) : atd.e;
   }

   @Nullable
   @Override
   public djw bd() {
      return this.s.a().h ? this.j.k() : null;
   }

   @Override
   public Optional<MinecraftServer.b> Y() {
      return this.s.a().T;
   }

   @Override
   public void aS() {
      super.aS();
      this.w.a(this.ak());
   }

   @Override
   public bph f() {
      return this.v;
   }

   @Override
   public boolean g() {
      return this.w.a(bpf.a);
   }

   @Override
   public void a(arv $$0, bpf $$1) {
      this.w.a($$0, $$1);
   }

   @Override
   public boolean bm() {
      return this.s.a().ab;
   }

   @Override
   public amc bp() {
      return this.x;
   }

   @Override
   public int bq() {
      return this.s.a().Z;
   }

   private static amc a(aqm $$0) {
      Optional<URI> $$1 = a($$0.a());
      return $$1.<amc>map($$0x -> new amc(List.of(amc.b.a.a($$0x)))).orElse(amc.a);
   }

   private static Optional<URI> a(aql $$0) {
      String $$1 = $$0.g;
      if ($$1.isEmpty()) {
         return Optional.empty();
      } else {
         try {
            return Optional.of(ag.a($$1));
         } catch (Exception var3) {
            l.warn("Failed to parse bug link {}", $$1, var3);
            return Optional.empty();
         }
      }
   }
}
