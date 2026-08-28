import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Queues;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.exceptions.AuthenticationException;
import com.mojang.authlib.minecraft.BanDetails;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import com.mojang.authlib.minecraft.UserApiService;
import com.mojang.authlib.minecraft.UserApiService.UserFlag;
import com.mojang.authlib.minecraft.UserApiService.UserProperties;
import com.mojang.authlib.yggdrasil.ProfileActionType;
import com.mojang.authlib.yggdrasil.ProfileResult;
import com.mojang.authlib.yggdrasil.ServicesKeyType;
import com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.datafixers.DataFixer;
import com.mojang.logging.LogUtils;
import java.io.File;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.lang.management.ManagementFactory;
import java.net.Proxy;
import java.net.SocketAddress;
import java.nio.ByteBuffer;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.Queue;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import net.minecraft.client.ClientBrandRetriever;
import net.minecraft.server.MinecraftServer;
import org.apache.commons.io.FileUtils;
import org.lwjgl.util.tinyfd.TinyFileDialogs;
import org.slf4j.Logger;

public class fip extends bqm<Runnable> implements fcm {
   static fip F;
   private static final Logger G = LogUtils.getLogger();
   public static final boolean a = ad.m() == ad.a.d;
   private static final int H = 10;
   public static final ale b = ale.b("default");
   public static final ale c = ale.b("uniform");
   public static final ale d = ale.b("alt");
   private static final ale I = ale.b("regional_compliancies.json");
   private static final CompletableFuture<bak> J = CompletableFuture.completedFuture(bak.a);
   private static final xe K = xe.c("multiplayer.socialInteractions.not_available");
   public static final String e = "Please make sure you have up-to-date drivers (see aka.ms/mcdriver for instructions).";
   private final long L = Double.doubleToLongBits(Math.PI);
   private final Path M;
   private final CompletableFuture<ProfileResult> N;
   private final gxh O;
   private final gic P;
   private final DataFixer Q;
   private final gik R;
   private final fcl S;
   private final fif.b T = new fif.b(20.0F, 0L, this::a);
   private final ght U;
   public final ghh f;
   private final gnm V;
   private final gom W;
   private final ghk X;
   public final gev g;
   private final fjc Y;
   public final fjz h;
   public final fjz i;
   public final ghb j;
   public final gll l;
   private final AtomicReference<arw> Z = new AtomicReference<>();
   public final fka m;
   public final fit n;
   private final fik aa;
   public final fiq o;
   public final fio p;
   private fim ab = fim.a;
   public final File q;
   private final String ac;
   private final String ad;
   private final Proxy ae;
   private final esz af;
   private final boolean ag;
   private final boolean ah;
   private final boolean ai;
   private final aus aj;
   private final atl ak;
   private final hac al;
   private final aug am;
   private final gyp an;
   private final fjr ao;
   private final fjv ap;
   private final fbs aq;
   private final hcf ar;
   private final hca as;
   private final fne at;
   private final gyj au;
   private final ghc av;
   private final fiu aw = new fiu(I, fip::b);
   private final YggdrasilAuthenticationService ax;
   private final MinecraftSessionService ay;
   private final UserApiService az;
   private final CompletableFuture<UserProperties> aA;
   private final gyi aB;
   private final gzs aC;
   private final gio aD;
   private final gyg aE;
   private final gyf aF;
   private final gye aG;
   private final gyd aH;
   private final fkc aI;
   private final fmz aJ;
   private final hdh aK;
   private final fuw aL;
   private final gam aM;
   private final gjv aN;
   private final hcj aO;
   private final gby aP;
   private final ffm aQ;
   private final ggp aR;
   @Nullable
   public gbv r;
   @Nullable
   public gbm s;
   @Nullable
   public ggh t;
   @Nullable
   private hbo aS;
   @Nullable
   private vy aT;
   private boolean aU;
   @Nullable
   public btr u;
   @Nullable
   public btr v;
   @Nullable
   public eyu w;
   private int aV;
   protected int x;
   private volatile boolean aW;
   private long aX = ad.d();
   private long aY;
   private int aZ;
   public boolean y;
   @Nullable
   public fqh z;
   @Nullable
   private fqb ba;
   private boolean bb;
   Thread bc;
   private volatile boolean bd;
   @Nullable
   private Supplier<o> be;
   private static int bf;
   public String A = "";
   private long bg;
   private final fbz bh;
   public boolean B;
   public boolean C;
   public boolean D;
   public boolean E = true;
   private boolean bi;
   private final Queue<Runnable> bj = Queues.newConcurrentLinkedQueue();
   @Nullable
   private CompletableFuture<Void> bk;
   @Nullable
   private fna bl;
   private bog bm = bod.a;
   private int bn;
   private final boa bo = new boa(ad.c, () -> this.bn);
   private bpu bp = bpt.a;
   private final fix bq = new fix();
   private long br;
   private double bs;
   @Nullable
   private fdb.a bt;
   private final fig bu;
   private final gcf bv;
   private gcu bw;
   private final fic bx;
   private final eym by;
   private boolean bz;
   private final long bA;
   private long bB;

   public fip(final fwc $$0) {
      super("Client");
      F = this;
      this.bA = System.currentTimeMillis();
      this.q = $$0.c.a;
      File $$1 = $$0.c.c;
      this.M = $$0.c.b.toPath();
      this.ac = $$0.d.b;
      this.ad = $$0.d.c;
      Path $$2 = this.q.toPath();
      this.by = esz.a($$2.resolve("allowed_symlinks.txt"));
      gxx $$3 = new gxx($$0.c.a(), this.by);
      this.al = new hac(this, $$2.resolve("downloads"), $$0.a);
      aui $$4 = new aub(this.M, atj.a, auh.b, this.by);
      this.am = new aug($$3, this.al.a(), $$4);
      this.ak = $$3.a();
      this.ae = $$0.a.d;
      this.ax = new YggdrasilAuthenticationService(this.ae);
      this.ay = this.ax.createMinecraftSessionService();
      this.Y = $$0.a.a;
      this.N = CompletableFuture.supplyAsync(() -> this.ay.fetchProfile(this.Y.b(), true), ad.i());
      this.az = this.a(this.ax, $$0);
      this.aA = CompletableFuture.supplyAsync(() -> {
         try {
            return this.az.fetchProperties();
         } catch (AuthenticationException var2x) {
            G.error("Failed to fetch user properties", var2x);
            return UserApiService.OFFLINE_PROPERTIES;
         }
      }, ad.i());
      G.info("Setting user: {}", this.Y.c());
      G.debug("(Session ID is {})", this.Y.a());
      this.ag = $$0.d.a;
      this.ah = !$$0.d.d;
      this.ai = !$$0.d.e;
      this.aS = null;
      yj.a(fin::a);
      this.Q = bap.a();
      this.aJ = new fmz(this);
      this.bc = Thread.currentThread();
      this.n = new fit(this, this.q);
      RenderSystem.setShaderGlintAlpha(this.n.ap().c());
      this.bd = true;
      this.aK = new hdh(this, this.n);
      this.aa = new fik($$2, this.Q);
      G.info("Backend library: {}", RenderSystem.getBackendDescription());
      fby $$5;
      if (this.n.p > 0 && this.n.o > 0) {
         $$5 = new fby(this.n.o, this.n.p, $$0.b.c, $$0.b.d, $$0.b.e);
      } else {
         $$5 = $$0.b;
      }

      ad.c = RenderSystem.initBackendSystem();
      this.R = new gik(this);
      this.S = this.R.a($$5, this.n.k, this.bh());
      this.a(true);
      this.S.a(new Runnable() {
         private boolean c;

         @Override
         public void run() {
            if (!this.c) {
               this.c = true;
               fbv.a($$0.c.a, fip.this.bc.threadId());
            }
         }
      });
      hcu.a.b(hcq.A);

      try {
         this.S.a(this.ak, ab.b().g() ? fcc.a : fcc.b);
      } catch (IOException var13) {
         G.error("Couldn't set icon", var13);
      }

      this.o = new fiq(this);
      this.o.a(this.S.i());
      this.p = new fio(this);
      this.p.a(this.S.i());
      RenderSystem.initRenderer(this.n.t, false);
      this.aq = new fbq(this.S.l(), this.S.m());
      this.aq.a(0.0F, 0.0F, 0.0F, 0.0F);
      this.aq.f();
      this.aj = new aus(atj.a);
      this.am.a();
      this.n.b(this.am);
      this.an = new gyp(this.n.ab, $$0x -> {
         if (this.t != null) {
            this.t.cw.C();
         }
      });
      this.aj.a(this.an);
      this.O = new gxh(this.aj);
      this.aj.a(this.O);
      this.P = new gic(this.O, this::a);
      this.aj.a(this.P);
      this.aB = new gyi(this.O, $$1.toPath().resolve("skins"), this.ay, this);
      this.af = new esz($$2.resolve("saves"), $$2.resolve("backups"), this.by, this.Q);
      this.bx = new fic($$2);
      this.ar = new hcf(this.n);
      this.aj.a(this.ar);
      this.au = new gyj(this.Y);
      this.aj.a(this.au);
      this.as = new hca(this);
      this.at = new fne(this.O);
      this.h = this.at.a();
      this.i = this.at.b();
      this.aj.a(this.at);
      this.g();
      this.aj.a(new gya());
      this.aj.a(new gxz());
      this.S.a("Startup");
      RenderSystem.setupDefaultState(0, 0, this.S.l(), this.S.m());
      this.S.a("Post startup");
      this.ao = fjr.a();
      this.ap = fjv.a(this.ao);
      this.aC = new gzs(this.O, this.ao, this.n.D().c());
      this.aj.a(this.aC);
      this.aM = new gam();
      this.aj.a(this.aM);
      this.aN = new gjv(this.h, this.aM, this::ap, this::as, this::aq);
      this.aj.a(this.aN);
      ggs $$8 = new ggs(this.aN, this.aM);
      this.aj.a($$8);
      this.W = new gom(this, this.O, this.aC, this.ap, $$8);
      this.aj.a(this.W);
      this.aG = new gye(this.O);
      this.aH = new gyd(this.O);
      this.aj.a(this.aH);
      this.X = new ghk(this.aH, this.aG);

      try {
         int $$9 = Runtime.getRuntime().availableProcessors();
         fdk.a();
         this.U = new ght($$9);
      } catch (OutOfMemoryError var12) {
         TinyFileDialogs.tinyfd_messageBox(
            "Minecraft",
            "Oh no! The game was unable to allocate memory off-heap while trying to start. You may try to free some memory by closing other applications on your computer, check that your system meets the minimum requirements, and try again. If the problem persists, please visit: "
               + ayb.k,
            "ok",
            "error",
            true
         );
         throw new fwd("Unable to allocate render buffers", var12);
      }

      this.aL = new fuw(this, this.az);
      this.aD = new gio(this.aC.b(), $$8, this.ao);
      this.aj.a(this.aD);
      this.V = new gnm(this, this.O, this.W, this.X, this.aD, this.h, this.n, this.aM);
      this.aj.a(this.V);
      this.g = new gev(this.s, this.O);
      this.aj.a(this.g);
      this.aE = new gyg(this.O);
      this.aj.a(this.aE);
      this.aF = new gyf(this.O);
      this.aj.a(this.aF);
      this.aI = new fkc(this.O);
      this.aj.a(this.aI);
      this.j = new ghb(this, this.V.d(), this.aj, this.U);
      this.f = new ghh(this, this.V, this.aN, this.U);
      this.aj.a(this.f);
      this.aj.a(this.f.z());
      this.av = new ghc();
      this.aj.a(this.av);
      this.aj.a(this.aw);
      this.m = new fka(this);
      this.l = new gll(this);
      fdy $$11 = fdy.a(this);
      this.aQ = new ffm($$11);
      RenderSystem.setErrorCallback(this::a);
      if (this.aq.c != this.S.l() || this.aq.d != this.S.m()) {
         StringBuilder $$12 = new StringBuilder(
            "Recovering from unsupported resolution ("
               + this.S.l()
               + "x"
               + this.S.m()
               + ").\nPlease make sure you have up-to-date drivers (see aka.ms/mcdriver for instructions)."
         );
         if (fca.b()) {
            $$12.append("\n\nReported GL debug messages:\n").append(String.join("\n", fca.a()));
         }

         this.S.a(this.aq.c, this.aq.d);
         TinyFileDialogs.tinyfd_messageBox("Minecraft", $$12.toString(), "ok", "error", false);
      } else if (this.n.ac().c() && !this.S.j()) {
         this.S.h();
         this.n.ac().a(this.S.j());
      }

      this.S.a(this.n.P().c());
      this.S.b(this.n.H().c());
      this.S.d();
      this.a();
      this.j.a(this.ak.d());
      this.aO = new hcj(this, this.az, this.Y);
      this.aP = gby.a(this.az, this.Y, $$2);
      this.bu = new fig(this);
      this.bu.a(this.n.au().c() != fir.a);
      this.bv = new gcf(this);
      this.bv.a(this.n.B().c());
      this.bw = gcu.a(gcr.a(), this.az);
      fpx.a(this);
      this.a(new fps(xe.c("gui.loadingMinecraft")));
      List<ath> $$13 = this.am.g();
      this.bq.a(fix.b.a, $$13);
      aur $$14 = this.aj.a(ad.g(), this, J, $$13);
      hcu.a.a(hcq.C);
      fip.b $$15 = new fip.b($$11, $$0.e);
      this.a(new fpx(this, $$14, $$1x -> ad.a($$1x, $$1xx -> this.a($$1xx, $$15), () -> {
            if (ab.aW) {
               this.bk();
            }

            this.bq.a();
            this.a($$15);
         }), false));
      this.aR = ggp.a($$0.e.b());
      this.bh = new fbz(this.n, this);
   }

   private void a(@Nullable fip.b $$0) {
      if (!this.bz) {
         this.bz = true;
         this.b($$0);
      }
   }

   private void b(@Nullable fip.b $$0) {
      Runnable $$1 = this.c($$0);
      hcu.a.b(hcq.C);
      hcu.a.b(hcq.z);
      hcu.a.a(this.aO.a());
      $$1.run();
   }

   public boolean c() {
      return this.bz;
   }

   private Runnable c(@Nullable fip.b $$0) {
      List<Function<Runnable, fqh>> $$1 = new ArrayList<>();
      this.a($$1);
      Runnable $$2 = () -> {
         if ($$0 != null && $$0.b().a()) {
            ggo.a(this, $$0.b(), $$0.a());
         } else {
            this.a(new fqj(true));
         }
      };

      for (Function<Runnable, fqh> $$3 : Lists.reverse($$1)) {
         fqh $$4 = $$3.apply($$2);
         $$2 = () -> this.a($$4);
      }

      return $$2;
   }

   private void a(List<Function<Runnable, fqh>> $$0) {
      if (this.n.ac) {
         $$0.add($$0x -> new foz(this.n, $$0x));
      }

      BanDetails $$1 = this.H();
      if ($$1 != null) {
         $$0.add($$1x -> fpc.a($$1xx -> {
               if ($$1xx) {
                  ad.m().a(ayb.n);
               }

               $$1x.run();
            }, $$1));
      }

      ProfileResult $$2 = this.N.join();
      if ($$2 != null) {
         GameProfile $$3 = $$2.profile();
         Set<ProfileActionType> $$4 = $$2.actions();
         if ($$4.contains(ProfileActionType.FORCED_NAME_CHANGE)) {
            $$0.add($$1x -> fpc.a($$3.getName(), $$1x));
         }

         if ($$4.contains(ProfileActionType.USING_BANNED_SKIN)) {
            $$0.add(fpc::a);
         }
      }
   }

   private static boolean b(Object $$0) {
      try {
         return Locale.getDefault().getISO3Country().equals($$0);
      } catch (MissingResourceException var2) {
         return false;
      }
   }

   public void d() {
      this.S.b(this.bh());
   }

   private String bh() {
      StringBuilder $$0 = new StringBuilder("Minecraft");
      if (e().a()) {
         $$0.append("*");
      }

      $$0.append(" ");
      $$0.append(ab.b().c());
      gbn $$1 = this.L();
      if ($$1 != null && $$1.k().i()) {
         $$0.append(" - ");
         gca $$2 = this.S();
         if (this.aS != null && !this.aS.r()) {
            $$0.append(gyn.a("title.singleplayer"));
         } else if ($$2 != null && $$2.e()) {
            $$0.append(gyn.a("title.multiplayer.realms"));
         } else if (this.aS == null && ($$2 == null || !$$2.d())) {
            $$0.append(gyn.a("title.multiplayer.other"));
         } else {
            $$0.append(gyn.a("title.multiplayer.lan"));
         }
      }

      return $$0.toString();
   }

   private UserApiService a(YggdrasilAuthenticationService $$0, fwc $$1) {
      return $$1.a.a.g() != fjc.a.c ? UserApiService.OFFLINE : $$0.createUserApiService($$1.a.a.d());
   }

   public static aze e() {
      return aze.a("vanilla", ClientBrandRetriever::getClientModName, "Client", fip.class);
   }

   private void a(Throwable $$0, @Nullable fip.b $$1) {
      if (this.am.d().size() > 1) {
         this.a($$0, null, $$1);
      } else {
         ad.a($$0);
      }
   }

   public void a(Throwable $$0, @Nullable xe $$1, @Nullable fip.b $$2) {
      G.info("Caught error loading resourcepacks, removing all selected resourcepacks", $$0);
      this.bq.a($$0);
      this.al.b();
      this.am.b(Collections.emptyList());
      this.n.i.clear();
      this.n.j.clear();
      this.n.ay();
      this.a(true, $$2).thenRun(() -> this.a($$1));
   }

   private void bi() {
      this.a(null);
      if (this.s != null) {
         this.s.Z();
         this.y();
      }

      this.a(new fqj());
      this.a(null);
   }

   private void a(@Nullable xe $$0) {
      fmz $$1 = this.aA();
      fmx.b($$1, fmx.a.c, xe.c("resourcePack.load_fail"), $$0);
   }

   public void a(Exception $$0) {
      if (this.ad().d().size() <= 1) {
         G.error(LogUtils.FATAL_MARKER, $$0.getMessage(), $$0);
         this.c(new o($$0.getMessage(), $$0));
      } else {
         this.a($$0, xe.c("resourcePack.runtime_failure"), null);
      }
   }

   public void f() {
      this.bc = Thread.currentThread();
      if (Runtime.getRuntime().availableProcessors() > 4) {
         this.bc.setPriority(10);
      }

      try {
         boolean $$0 = false;

         while (this.bd) {
            this.bj();

            try {
               boj $$1 = boj.a("Renderer");
               boolean $$2 = this.aR().e();
               this.bm = this.a($$2, $$1);
               this.bm.a();
               this.bp.c();
               this.c(!$$0);
               this.bp.d();
               this.bm.b();
               this.b($$2, $$1);
            } catch (OutOfMemoryError var4) {
               if ($$0) {
                  throw var4;
               }

               this.bl();
               this.a(new fqa());
               System.gc();
               G.error(LogUtils.FATAL_MARKER, "Out of memory", var4);
               $$0 = true;
            }
         }
      } catch (z var5) {
         G.error(LogUtils.FATAL_MARKER, "Reported exception thrown!", var5);
         this.c(var5.a());
      } catch (Throwable var6) {
         G.error(LogUtils.FATAL_MARKER, "Unreported exception thrown!", var6);
         this.c(new o("Unexpected error", var6));
      }
   }

   void g() {
      this.at.a(this.n);
   }

   private void a(int $$0, long $$1) {
      this.n.P().a(false);
      this.n.ay();
   }

   public fbs h() {
      return this.aq;
   }

   public String i() {
      return this.ac;
   }

   public String j() {
      return this.ad;
   }

   public void a(o $$0) {
      this.be = () -> this.d($$0);
   }

   public void b(o $$0) {
      this.be = () -> $$0;
   }

   private void bj() {
      if (this.be != null) {
         a(this, this.q, this.be.get());
      }
   }

   public void c(o $$0) {
      o $$1 = this.d($$0);
      this.bl();
      a(this, this.q, $$1);
   }

   public static int a(File $$0, o $$1) {
      Path $$2 = $$0.toPath().resolve("crash-reports");
      Path $$3 = $$2.resolve("crash-" + ad.f() + "-client.txt");
      alg.a($$1.a(y.a));
      if ($$1.e() != null) {
         alg.a("#@!@# Game crashed! Crash report saved to: #@!@# " + $$1.e().toAbsolutePath());
         return -1;
      } else if ($$1.a($$3, y.a)) {
         alg.a("#@!@# Game crashed! Crash report saved to: #@!@# " + $$3.toAbsolutePath());
         return -1;
      } else {
         alg.a("#@?@# Game crashed! Crash report could not be saved. #@?@#");
         return -2;
      }
   }

   public static void a(@Nullable fip $$0, File $$1, o $$2) {
      int $$3 = a($$1, $$2);
      if ($$0 != null) {
         $$0.ar.h();
      }

      System.exit($$3);
   }

   public boolean k() {
      return this.n.R().c();
   }

   public CompletableFuture<Void> l() {
      return this.a(false, null);
   }

   private CompletableFuture<Void> a(boolean $$0, @Nullable fip.b $$1) {
      if (this.bk != null) {
         return this.bk;
      } else {
         CompletableFuture<Void> $$2 = new CompletableFuture<>();
         if (!$$0 && this.ba instanceof fpx) {
            this.bk = $$2;
            return $$2;
         } else {
            this.am.a();
            List<ath> $$3 = this.am.g();
            if (!$$0) {
               this.bq.a(fix.b.b, $$3);
            }

            this.a(new fpx(this, this.aj.a(ad.g(), this, J, $$3), $$3x -> ad.a($$3x, $$2xx -> {
                  if ($$0) {
                     this.al.c();
                     this.bi();
                  } else {
                     this.a($$2xx, $$1);
                  }
               }, () -> {
                  this.f.e();
                  this.bq.a();
                  this.al.d();
                  $$2.complete(null);
                  this.a($$1);
               }), !$$0));
            return $$2;
         }
      }
   }

   private void bk() {
      boolean $$0 = false;
      gin $$1 = this.ap().a();
      gzi $$2 = $$1.a().a();

      for (dhm $$3 : lv.e) {
         UnmodifiableIterator $$10 = $$3.k().a().iterator();

         while ($$10.hasNext()) {
            dus $$4 = (dus)$$10.next();
            if ($$4.o() == dnt.c) {
               gzi $$5 = $$1.b($$4);
               if ($$5 == $$2) {
                  G.debug("Missing model for: {}", $$4);
                  $$0 = true;
               }
            }
         }
      }

      gxg $$6 = $$2.e();

      for (dhm $$7 : lv.e) {
         UnmodifiableIterator var17 = $$7.k().a().iterator();

         while (var17.hasNext()) {
            dus $$8 = (dus)var17.next();
            gxg $$9 = $$1.a($$8);
            if (!$$8.l() && $$9 == $$6) {
               G.debug("Missing particle icon for: {}", $$8);
            }
         }
      }

      for (cvn $$10 : lv.g) {
         cvs $$11 = $$10.v();
         String $$12 = $$11.v();
         String $$13 = xe.c($$12).getString();
         if ($$13.toLowerCase(Locale.ROOT).equals($$10.a())) {
            G.debug("Missing translation for: {} {} {}", new Object[]{$$11, $$12, $$10});
         }
      }

      $$0 |= fpy.a();
      $$0 |= gnp.a();
      if ($$0) {
         throw new IllegalStateException("Your game data is foobar, fix the errors above!");
      }
   }

   public esz m() {
      return this.af;
   }

   private void a(String $$0) {
      fip.a $$1 = this.J();
      if (!$$1.a(this.T())) {
         if (this.m.b()) {
            this.m.b(false);
            this.a(new fpe($$0x -> {
               if ($$0x) {
                  ad.m().a(ayb.g);
               }

               this.a(null);
            }, fip.a.e, ayb.g, true));
         } else {
            xe $$2 = $$1.a();
            this.m.a($$2, false);
            this.bu.c($$2);
            this.m.b($$1 == fip.a.d);
         }
      } else {
         this.a(new fpd($$0));
      }
   }

   public void a(@Nullable fqh $$0) {
      if (ab.aW && Thread.currentThread() != this.bc) {
         G.error("setScreen called from non-game thread");
      }

      if (this.z != null) {
         this.z.j();
      } else {
         this.a(fim.a);
      }

      if ($$0 == null && this.bb) {
         throw new IllegalStateException("Trying to return to in-game GUI during disconnection");
      } else {
         if ($$0 == null && this.s == null) {
            $$0 = new fqj();
         } else if ($$0 == null && this.t.eC()) {
            if (this.t.m()) {
               $$0 = new fpl(null, this.s.j().l());
            } else {
               this.t.gb();
            }
         }

         this.z = $$0;
         if (this.z != null) {
            this.z.aK_();
         }

         fde.a();
         if ($$0 != null) {
            this.o.j();
            fin.b();
            $$0.b(this, this.S.p(), this.S.q());
            this.y = false;
         } else {
            this.ar.i();
            this.o.i();
         }

         this.d();
      }
   }

   public void a(@Nullable fqb $$0) {
      this.ba = $$0;
   }

   public void n() {
      try {
         G.info("Stopping!");

         try {
            this.bu.c();
         } catch (Throwable var7) {
         }

         try {
            if (this.s != null) {
               this.s.Z();
            }

            this.y();
         } catch (Throwable var6) {
         }

         if (this.z != null) {
            this.z.j();
         }

         this.close();
      } finally {
         ad.c = System::nanoTime;
         if (this.be == null) {
            System.exit(0);
         }
      }
   }

   @Override
   public void close() {
      if (this.bt != null) {
         this.bt.a();
      }

      try {
         this.aO.close();
         this.aw.close();
         this.aC.close();
         this.at.close();
         this.j.close();
         this.P.close();
         this.f.close();
         this.ar.g();
         this.g.a();
         this.aF.close();
         this.aE.close();
         this.aH.close();
         this.aI.close();
         this.aG.close();
         this.O.close();
         this.aj.close();
         fnq.b();
         ad.j();
      } catch (Throwable var5) {
         G.error("Shutdown failure!", var5);
         throw var5;
      } finally {
         this.R.close();
         this.S.close();
      }
   }

   private void c(boolean $$0) {
      this.S.a("Pre render");
      if (this.S.c()) {
         this.q();
      }

      if (this.bk != null && !(this.ba instanceof fpx)) {
         CompletableFuture<Void> $$1 = this.bk;
         this.bk = null;
         this.l().thenRun(() -> $$1.complete(null));
      }

      Runnable $$2;
      while (($$2 = this.bj.poll()) != null) {
         $$2.run();
      }

      int $$3 = this.T.a(ad.c(), $$0);
      if ($$0) {
         this.bm.a("scheduledExecutables");
         this.bC();
         this.bm.c();
         this.bm.a("tick");

         for (int $$4 = 0; $$4 < Math.min(10, $$3); $$4++) {
            this.bm.d("clientTick");
            this.t();
         }

         this.bm.c();
      }

      this.S.a("Render");
      this.bm.a("sound");
      this.ar.a(this.j.k());
      this.bm.b("toasts");
      this.aJ.a();
      this.bm.b("render");
      long $$5 = ad.d();
      boolean $$7;
      if (!this.aR().d() && !this.bp.e()) {
         $$7 = false;
         this.bs = 0.0;
      } else {
         $$7 = this.bt == null || this.bt.b();
         if ($$7) {
            fdb.a().ifPresent(fdb::b);
         }
      }

      RenderSystem.clear(16640);
      this.aq.a(true);
      RenderSystem.setShaderFog(ggz.a);
      this.bm.a("display");
      RenderSystem.enableCull();
      this.bm.b("mouse");
      this.o.a();
      this.bm.c();
      if (!this.y) {
         this.bm.b("gameRenderer");
         this.j.a(this.T, $$0);
         this.bm.c();
      }

      this.bm.a("blit");
      this.aq.e();
      this.aq.c(this.S.l(), this.S.m());
      this.bg = ad.d() - $$5;
      if ($$7) {
         fdb.a().ifPresent($$0x -> this.bt = $$0x.c());
      }

      this.bm.b("updateDisplay");
      this.S.e();
      int $$8 = this.bh.a();
      if ($$8 < 260) {
         RenderSystem.limitDisplayFPS($$8);
      }

      this.bm.b("yield");
      Thread.yield();
      this.bm.c();
      this.S.a("Post render");
      this.aZ++;
      this.aW = this.U() && (this.z != null && this.z.k() || this.ba != null && this.ba.a()) && !this.aS.r();
      this.T.b(this.aW);
      this.T.c(!this.bq());
      long $$9 = ad.d();
      long $$10 = $$9 - this.aX;
      if ($$7) {
         this.br = $$10;
      }

      this.aR().a($$10);
      this.aX = $$9;
      this.bm.a("fpsUpdate");
      if (this.bt != null && this.bt.b()) {
         this.bs = (double)this.bt.c() * 100.0 / (double)this.br;
      }

      while (ad.c() >= this.aY + 1000L) {
         String $$11;
         if (this.bs > 0.0) {
            $$11 = " GPU: " + (this.bs > 100.0 ? n.m + "100%" : Math.round(this.bs) + "%");
         } else {
            $$11 = "";
         }

         bf = this.aZ;
         this.A = String.format(
            Locale.ROOT,
            "%d fps T: %s%s%s%s B: %d%s",
            bf,
            $$8 == 260 ? "inf" : $$8,
            this.n.P().c() ? " vsync " : " ",
            this.n.k().c(),
            this.n.j().c() == fib.a ? "" : (this.n.j().c() == fib.b ? " fast-clouds" : " fancy-clouds"),
            this.n.F().c(),
            $$11
         );
         this.aY += 1000L;
         this.aZ = 0;
      }

      this.bm.c();
   }

   private bog a(boolean $$0, @Nullable boj $$1) {
      if (!$$0) {
         this.bo.b();
         if (!this.bp.e() && $$1 == null) {
            return bod.a;
         }
      }

      bog $$2;
      if ($$0) {
         if (!this.bo.a()) {
            this.bn = 0;
            this.bo.c();
         }

         this.bn++;
         $$2 = this.bo.d();
      } else {
         $$2 = bod.a;
      }

      if (this.bp.e()) {
         $$2 = bog.a($$2, this.bp.f());
      }

      return boj.a($$2, $$1);
   }

   private void b(boolean $$0, @Nullable boj $$1) {
      if ($$1 != null) {
         $$1.b();
      }

      fmh $$2 = this.aR().o();
      if ($$0) {
         $$2.a(this.bo.e());
      } else {
         $$2.a(null);
      }

      this.bm = this.bo.d();
   }

   @Override
   public void a() {
      int $$0 = this.S.a(this.n.as().c(), this.k());
      this.S.a((double)$$0);
      if (this.z != null) {
         this.z.a(this, this.S.p(), this.S.q());
      }

      fbs $$1 = this.h();
      $$1.a(this.S.l(), this.S.m());
      this.j.a(this.S.l(), this.S.m());
      this.o.g();
   }

   @Override
   public void b() {
      this.o.k();
   }

   public int o() {
      return bf;
   }

   public long p() {
      return this.bg;
   }

   private void bl() {
      try {
         azd.b();
      } catch (Throwable var3) {
      }

      try {
         System.gc();
         if (this.aU && this.aS != null) {
            this.aS.a(true);
         }

         this.b((fqh)(new fps(xe.c("menu.savingLevel"))));
      } catch (Throwable var2) {
      }

      System.gc();
   }

   public boolean a(Consumer<xe> $$0) {
      if (this.bp.e()) {
         this.bm();
         return false;
      } else {
         Consumer<bof> $$1 = $$1x -> {
            if ($$1x != bob.a) {
               int $$2x = $$1x.f();
               double $$3x = (double)$$1x.g() / (double)bag.a;
               this.execute(
                  () -> $$0.accept(
                        xe.a("commands.debug.stopped", String.format(Locale.ROOT, "%.2f", $$3x), $$2x, String.format(Locale.ROOT, "%.2f", (double)$$2x / $$3x))
                     )
               );
            }
         };
         Consumer<Path> $$2 = $$1x -> {
            xe $$2x = xe.b($$1x.toString()).a(n.t).a($$1xx -> $$1xx.a(new xc(xc.a.b, $$1x.toFile().getParent())));
            this.execute(() -> $$0.accept(xe.a("debug.profiling.stop", $$2x)));
         };
         ac $$3 = a(new ac(), this, this.an, this.ac, this.n);
         Consumer<List<Path>> $$4 = $$2x -> {
            Path $$3x = this.a($$3, $$2x);
            $$2.accept($$3x);
         };
         Consumer<Path> $$5;
         if (this.aS == null) {
            $$5 = $$1x -> $$4.accept(ImmutableList.of($$1x));
         } else {
            this.aS.b($$3);
            CompletableFuture<Path> $$6 = new CompletableFuture<>();
            CompletableFuture<Path> $$7 = new CompletableFuture<>();
            CompletableFuture.allOf($$6, $$7).thenRunAsync(() -> $$4.accept(ImmutableList.of($$6.join(), $$7.join())), ad.h());
            this.aS.a($$0x -> {
            }, $$7::complete);
            $$5 = $$6::complete;
         }

         this.bp = bps.a(new ggm(ad.c, this.f), ad.c, ad.h(), new bpy("client"), $$1x -> {
            this.bp = bpt.a;
            $$1.accept($$1x);
         }, $$5);
         return true;
      }
   }

   private void bm() {
      this.bp.a();
      if (this.aS != null) {
         this.aS.aW();
      }
   }

   private void bn() {
      this.bp.b();
      if (this.aS != null) {
         this.aS.aX();
      }
   }

   private Path a(ac $$0, List<Path> $$1) {
      String $$2;
      if (this.T()) {
         $$2 = this.V().ba().e();
      } else {
         gca $$3 = this.S();
         $$2 = $$3 != null ? $$3.a : "unknown";
      }

      Path $$7;
      try {
         String $$5 = String.format(Locale.ROOT, "%s-%s-%s", ad.f(), $$2, ab.b().b());
         String $$6 = v.a(bpy.a, $$5, ".zip");
         $$7 = bpy.a.resolve($$6);
      } catch (IOException var21) {
         throw new UncheckedIOException(var21);
      }

      try (ayq $$10 = new ayq($$7)) {
         $$10.a(Paths.get("system.txt"), $$0.a());
         $$10.a(Paths.get("client").resolve(this.n.aE().getName()), this.n.aF());
         $$1.forEach($$10::a);
      } finally {
         for (Path $$13 : $$1) {
            try {
               FileUtils.forceDelete($$13.toFile());
            } catch (IOException var18) {
               G.warn("Failed to delete temporary profiling result {}", $$13, var18);
            }
         }
      }

      return $$7;
   }

   public void q() {
      this.bd = false;
   }

   public boolean r() {
      return this.bd;
   }

   public void b(boolean $$0) {
      if (this.z == null) {
         boolean $$1 = this.U() && !this.aS.r();
         if ($$1) {
            this.a(new fqc(!$$0));
            this.ar.e();
         } else {
            this.a(new fqc(true));
         }
      }
   }

   private void d(boolean $$0) {
      if (!$$0) {
         this.x = 0;
      }

      if (this.x <= 0 && !this.t.fv()) {
         if ($$0 && this.w != null && this.w.d() == eyu.a.b) {
            eys $$1 = (eys)this.w;
            jf $$2 = $$1.b();
            if (!this.s.a_($$2).l()) {
               jk $$3 = $$1.c();
               if (this.r.b($$2, $$3)) {
                  this.g.a($$2, $$3);
                  this.t.a(brr.a);
               }
            }
         } else {
            this.r.b();
         }
      }
   }

   private boolean bo() {
      if (this.x > 0) {
         return false;
      } else if (this.w == null) {
         G.error("Null returned as 'hitResult', this shouldn't happen!");
         if (this.r.e()) {
            this.x = 10;
         }

         return false;
      } else if (this.t.C()) {
         return false;
      } else {
         cvs $$0 = this.t.b(brr.a);
         if (!$$0.a(this.s.J())) {
            return false;
         } else {
            boolean $$1 = false;
            switch (this.w.d()) {
               case c:
                  this.r.a(this.t, ((eyt)this.w).a());
                  break;
               case b:
                  eys $$2 = (eys)this.w;
                  jf $$3 = $$2.b();
                  if (!this.s.a_($$3).l()) {
                     this.r.a($$3, $$2.c());
                     if (this.s.a_($$3).l()) {
                        $$1 = true;
                     }
                     break;
                  }
               case a:
                  if (this.r.e()) {
                     this.x = 10;
                  }

                  this.t.gx();
            }

            this.t.a(brr.a);
            return $$1;
         }
      }
   }

   private void bp() {
      if (!this.r.k()) {
         this.aV = 4;
         if (!this.t.C()) {
            if (this.w == null) {
               G.warn("Null returned as 'hitResult', this shouldn't happen!");
            }

            for (brr $$0 : brr.values()) {
               cvs $$1 = this.t.b($$0);
               if (!$$1.a(this.s.J())) {
                  return;
               }

               if (this.w != null) {
                  switch (this.w.d()) {
                     case c:
                        eyt $$2 = (eyt)this.w;
                        btr $$3 = $$2.a();
                        if (!this.s.B_().a($$3.ds())) {
                           return;
                        }

                        brs $$4 = this.r.a(this.t, $$3, $$2, $$0);
                        if (!$$4.a()) {
                           $$4 = this.r.a(this.t, $$3, $$0);
                        }

                        if ($$4 instanceof brs.d $$5) {
                           if ($$5.e() == brs.e.b) {
                              this.t.a($$0);
                           }

                           return;
                        }
                        break;
                     case b:
                        eys $$6 = (eys)this.w;
                        int $$7 = $$1.K();
                        brs $$8 = this.r.a(this.t, $$0, $$6);
                        if ($$8 instanceof brs.d $$9) {
                           if ($$9.e() == brs.e.b) {
                              this.t.a($$0);
                              if (!$$1.f() && ($$1.K() != $$7 || this.r.f())) {
                                 this.j.c.a($$0);
                              }
                           }

                           return;
                        }

                        if ($$8 instanceof brs.a) {
                           return;
                        }
                  }
               }

               if (!$$1.f() && this.r.a(this.t, $$0) instanceof brs.d $$11) {
                  if ($$11.e() == brs.e.b) {
                     this.t.a($$0);
                  }

                  this.j.c.a($$0);
                  return;
               }
            }
         }
      }
   }

   public hca s() {
      return this.as;
   }

   public void t() {
      this.bB++;
      if (this.s != null && !this.aW) {
         this.s.s().m();
      }

      if (this.aV > 0) {
         this.aV--;
      }

      this.bm.a("gui");
      this.bv.a();
      this.m.a(this.aW);
      this.bm.c();
      this.j.a(1.0F);
      this.aK.a(this.s, this.w);
      this.bm.a("gameMode");
      if (!this.aW && this.s != null) {
         this.r.c();
      }

      this.bm.b("textures");
      if (this.bq()) {
         this.O.f();
      }

      if (this.z != null || this.t == null) {
         if (this.z instanceof fpu $$0 && !this.t.fN()) {
            $$0.m();
         }
      } else if (this.t.eC() && !(this.z instanceof fpl)) {
         this.a(null);
      } else if (this.t.fN() && this.s != null) {
         this.a(new fpu());
      }

      if (this.z != null) {
         this.x = 10000;
      }

      if (this.z != null) {
         fqh.a(() -> this.z.e(), "Ticking screen", this.z.getClass().getCanonicalName());
      }

      if (!this.aR().d()) {
         this.m.l();
      }

      if (this.ba == null && this.z == null) {
         this.bm.b("Keybindings");
         this.bs();
         if (this.x > 0) {
            this.x--;
         }
      }

      if (this.s != null) {
         this.bm.b("gameRenderer");
         if (!this.aW) {
            this.j.e();
         }

         this.bm.b("levelRenderer");
         if (!this.aW) {
            this.f.n();
         }

         this.bm.b("level");
         if (!this.aW) {
            this.s.e();
         }
      } else if (this.j.f() != null) {
         this.j.b();
      }

      if (!this.aW) {
         this.as.a();
      }

      this.ar.a(this.aW);
      if (this.s != null) {
         if (!this.aW) {
            if (!this.n.s && this.br()) {
               xe $$1 = xe.c("tutorial.socialInteractions.title");
               xe $$2 = xe.a("tutorial.socialInteractions.description", hdh.a("socialInteractions"));
               this.bl = new fna(fna.a.f, $$1, $$2, true, 8000);
               this.aJ.a(this.bl);
               this.n.s = true;
               this.n.ay();
            }

            this.aK.d();

            try {
               this.s.a(() -> true);
            } catch (Throwable var4) {
               o $$4 = o.a(var4, "Exception in world tick");
               if (this.s == null) {
                  p $$5 = $$4.a("Affected level");
                  $$5.a("Problem", "Level is null!");
               } else {
                  this.s.a($$4);
               }

               throw new z($$4);
            }
         }

         this.bm.b("animateTick");
         if (!this.aW && this.bq()) {
            this.s.b(this.t.dw(), this.t.dy(), this.t.dC());
         }

         this.bm.b("particles");
         if (!this.aW && this.bq()) {
            this.g.b();
         }

         gbn $$6 = this.L();
         if ($$6 != null && !this.aW) {
            $$6.b(ahd.a);
         }
      } else if (this.aT != null) {
         this.bm.b("pendingConnection");
         this.aT.b();
      }

      this.bm.b("keyboard");
      this.p.b();
      this.bm.c();
   }

   private boolean bq() {
      return this.s == null || this.s.s().i();
   }

   private boolean br() {
      return !this.aU || this.aS != null && this.aS.r();
   }

   private void bs() {
      while (this.n.N.g()) {
         fhz $$0 = this.n.aD();
         this.n.a(this.n.aD().c());
         if ($$0.a() != this.n.aD().a()) {
            this.j.a(this.n.aD().a() ? this.ao() : null);
         }

         this.f.p();
      }

      while (this.n.O.g()) {
         this.n.Z = !this.n.Z;
      }

      for (int $$1 = 0; $$1 < 9; $$1++) {
         boolean $$2 = this.n.T.e();
         boolean $$3 = this.n.U.e();
         if (this.n.S[$$1].g()) {
            if (this.t.Q_()) {
               this.m.g().a($$1);
            } else if (!this.t.f() || this.z != null || !$$3 && !$$2) {
               this.t.gd().j = $$1;
            } else {
               frl.a(this, $$1, $$3, $$2);
            }
         }
      }

      while (this.n.L.g()) {
         if (!this.br()) {
            this.t.a(K, true);
            this.bu.c(K);
         } else {
            if (this.bl != null) {
               this.bl.d();
               this.bl = null;
            }

            this.a(new fuy());
         }
      }

      while (this.n.C.g()) {
         if (this.r.g()) {
            this.t.h();
         } else {
            this.aK.a();
            this.a(new frw(this.t));
         }
      }

      while (this.n.R.g()) {
         this.a(new fqr(this.t.cw.p()));
      }

      while (this.n.D.g()) {
         if (!this.t.Q_()) {
            this.L().b(new ahw(ahw.a.g, jf.c, jk.a));
         }
      }

      while (this.n.E.g()) {
         if (!this.t.Q_() && this.t.a(fqh.s())) {
            this.t.a(brr.a);
         }
      }

      while (this.n.I.g()) {
         this.a("");
      }

      if (this.z == null && this.ba == null && this.n.K.g()) {
         this.a("/");
      }

      boolean $$4 = false;
      if (this.t.fv()) {
         if (!this.n.F.e()) {
            this.r.b(this.t);
         }

         while (this.n.G.g()) {
         }

         while (this.n.F.g()) {
         }

         while (this.n.H.g()) {
         }
      } else {
         while (this.n.G.g()) {
            $$4 |= this.bo();
         }

         while (this.n.F.g()) {
            this.bp();
         }

         while (this.n.H.g()) {
            this.bu();
         }
      }

      if (this.n.F.e() && this.aV == 0 && !this.t.fv()) {
         this.bp();
      }

      this.d(this.z == null && !$$4 && this.n.G.e() && this.o.h());
   }

   public hcj u() {
      return this.aO;
   }

   public double v() {
      return this.bs;
   }

   public gby w() {
      return this.aP;
   }

   public fvo x() {
      return new fvo(this, this.af);
   }

   public void a(esz.c $$0, aug $$1, amd $$2, boolean $$3) {
      this.y();
      this.Z.set(null);
      Instant $$4 = Instant.now();

      try {
         $$0.a($$2.c().a(), $$2.d());
         alz $$5 = alz.a(this.ax, this.q);
         $$5.f().a(this);
         dtj.a($$5, this);
         avf.a(false);
         this.aS = MinecraftServer.a((Function<Thread, hbo>)($$4x -> new hbo($$4x, this, $$0, $$1, $$2, $$5, $$0xx -> {
               arw $$1xx = arw.b($$0xx + 0);
               this.Z.set($$1xx);
               return arv.a($$1xx, this.bj::add);
            })));
         this.aU = true;
         this.a(gcr.a());
         this.aR.a(ggp.c.a, $$0.f(), $$2.d().e());
      } catch (Throwable var11) {
         o $$7 = o.a(var11, "Starting integrated server");
         p $$8 = $$7.a("Starting integrated server");
         $$8.a("Level ID", $$0.f());
         $$8.a("Level Name", () -> $$2.d().e());
         throw new z($$7);
      }

      while (this.Z.get() == null) {
         Thread.yield();
      }

      fpv $$9 = new fpv(this.Z.get());
      this.a($$9);
      this.bm.a("waitForServer");

      for (; !this.aS.ai() || this.ba != null; this.bj()) {
         $$9.e();
         this.c(false);

         try {
            Thread.sleep(16L);
         } catch (InterruptedException var10) {
         }
      }

      this.bm.c();
      Duration $$10 = Duration.between($$4, Instant.now());
      SocketAddress $$11 = this.aS.ah().a();
      vy $$12 = vy.a($$11);
      $$12.a($$11.toString(), 0, new gbl($$12, this, null, null, $$3, $$10, $$0x -> {
      }, null));
      $$12.a(new ajj(this.X().c(), this.X().b()));
      this.aT = $$12;
   }

   public void a(gbm $$0, fqf.a $$1) {
      this.e(new fqf(() -> false, $$1));
      this.s = $$0;
      this.a($$0);
      if (!this.aU) {
         alz $$2 = alz.a(this.ax, this.q);
         $$2.f().a(this);
         dtj.a($$2, this);
         avf.a(false);
      }
   }

   public void y() {
      this.a(new fqe(true), false);
   }

   public void b(fqh $$0) {
      this.a($$0, false);
   }

   public void a(fqh $$0, boolean $$1) {
      gbn $$2 = this.L();
      if ($$2 != null) {
         this.bB();
         $$2.h();
         if (!$$1) {
            this.z();
         }
      }

      this.aL.b();
      if (this.bp.e()) {
         this.bn();
      }

      hbo $$3 = this.aS;
      this.aS = null;
      this.j.h();
      this.r = null;
      this.bu.b();
      this.bb = true;

      try {
         this.e($$0);
         if (this.s != null) {
            if ($$3 != null) {
               this.bm.a("waitForServer");

               while (!$$3.I()) {
                  this.c(false);
               }

               this.bm.c();
            }

            this.m.i();
            this.aU = false;
         }

         this.s = null;
         this.a(null);
         this.t = null;
      } finally {
         this.bb = false;
      }

      dtj.b();
   }

   public void z() {
      this.al.i();
      this.bC();
   }

   public void c(fqh $$0) {
      gbn $$1 = this.L();
      if ($$1 != null) {
         $$1.i();
      }

      if (this.bp.e()) {
         this.bn();
      }

      this.j.h();
      this.r = null;
      this.bu.b();
      this.bb = true;

      try {
         this.e($$0);
         this.m.i();
         this.s = null;
         this.a(null);
         this.t = null;
      } finally {
         this.bb = false;
      }

      dtj.b();
   }

   private void e(fqh $$0) {
      this.bm.a("forcedTick");
      this.ar.f();
      this.u = null;
      this.aT = null;
      this.a($$0);
      this.c(false);
      this.bm.c();
   }

   public void d(fqh $$0) {
      this.bm.a("forcedTick");
      this.a($$0);
      this.c(false);
      this.bm.c();
   }

   private void a(@Nullable gbm $$0) {
      this.f.a($$0);
      this.g.a($$0);
      this.aN.a($$0);
      this.d();
   }

   private UserProperties bt() {
      return this.aA.join();
   }

   public boolean C() {
      return this.D() && this.n.ak().c();
   }

   public boolean D() {
      return this.E() && this.bt().flag(UserFlag.OPTIONAL_TELEMETRY_AVAILABLE);
   }

   public boolean E() {
      return ab.aW ? false : this.bt().flag(UserFlag.TELEMETRY_ENABLED);
   }

   public boolean F() {
      return this.ah && this.bt().flag(UserFlag.SERVERS_ALLOWED) && this.H() == null && !this.I();
   }

   public boolean G() {
      return this.bt().flag(UserFlag.REALMS_ALLOWED) && this.H() == null;
   }

   @Nullable
   public BanDetails H() {
      return (BanDetails)this.bt().bannedScopes().get("MULTIPLAYER");
   }

   public boolean I() {
      ProfileResult $$0 = this.N.getNow(null);
      return $$0 != null && $$0.actions().contains(ProfileActionType.FORCED_NAME_CHANGE);
   }

   public boolean a(UUID $$0) {
      return this.J().a(false) ? this.aL.c($$0) : (this.t == null || !$$0.equals(this.t.cD())) && !$$0.equals(ad.e);
   }

   public fip.a J() {
      if (this.n.n().c() == cnv.c) {
         return fip.a.b;
      } else if (!this.ai) {
         return fip.a.c;
      } else {
         return !this.bt().flag(UserFlag.CHAT_ALLOWED) ? fip.a.d : fip.a.a;
      }
   }

   public final boolean K() {
      return this.ag;
   }

   @Nullable
   public gbn L() {
      return this.t == null ? null : this.t.cw;
   }

   public static boolean M() {
      return !F.n.X;
   }

   public static boolean N() {
      return F.n.k().c().b() >= fih.b.b();
   }

   public static boolean O() {
      return !F.j.a() && F.n.k().c().b() >= fih.c.b();
   }

   public static boolean P() {
      return F.n.l().c();
   }

   private void bu() {
      if (this.w != null && this.w.d() != eyu.a.a) {
         boolean $$0 = this.t.ge().d;
         drv $$1 = null;
         eyu.a $$2 = this.w.d();
         cvs $$6;
         if ($$2 == eyu.a.b) {
            jf $$3 = ((eys)this.w).b();
            dus $$4 = this.s.a_($$3);
            if ($$4.l()) {
               return;
            }

            dhm $$5 = $$4.b();
            $$6 = $$5.a((dem)this.s, $$3, $$4);
            if ($$6.f()) {
               return;
            }

            if ($$0 && fqh.s() && $$4.x()) {
               $$1 = this.s.c_($$3);
            }
         } else {
            if ($$2 != eyu.a.c || !$$0) {
               return;
            }

            btr $$7 = ((eyt)this.w).a();
            $$6 = $$7.dF();
            if ($$6 == null) {
               return;
            }
         }

         if ($$6.f()) {
            String $$10 = "";
            if ($$2 == eyu.a.b) {
               $$10 = lv.e.b(this.s.a_(((eys)this.w).b()).b()).toString();
            } else if ($$2 == eyu.a.c) {
               $$10 = lv.f.b(((eyt)this.w).a().ao()).toString();
            }

            G.warn("Picking on: [{}] {} gave null item", $$2, $$10);
         } else {
            cnw $$11 = this.t.gd();
            if ($$1 != null) {
               this.a($$6, $$1, this.s.G_());
            }

            int $$12 = $$11.c($$6);
            if ($$0) {
               $$11.b($$6);
               this.r.a(this.t.b(brr.a), 36 + $$11.j);
            } else if ($$12 != -1) {
               if (cnw.d($$12)) {
                  $$11.j = $$12;
               } else {
                  this.r.a($$12);
               }
            }
         }
      }
   }

   private void a(cvs $$0, drv $$1, kc $$2) {
      ug $$3 = $$1.f($$2);
      $$1.a($$3);
      ctu.a($$0, $$1.q(), $$3);
      $$0.b($$1.r());
   }

   public o d(o $$0) {
      ac $$1 = $$0.f();
      a($$1, this, this.an, this.ac, this.n);
      this.a($$0.a("Uptime"));
      if (this.s != null) {
         this.s.a($$0);
      }

      if (this.aS != null) {
         this.aS.b($$1);
      }

      this.bq.a($$0);
      return $$0;
   }

   public static void a(@Nullable fip $$0, @Nullable gyp $$1, String $$2, @Nullable fit $$3, o $$4) {
      ac $$5 = $$4.f();
      a($$5, $$0, $$1, $$2, $$3);
   }

   private static String a(double $$0) {
      return String.format(Locale.ROOT, "%.3fs", $$0);
   }

   private void a(p $$0) {
      $$0.a("JVM uptime", () -> a((double)ManagementFactory.getRuntimeMXBean().getUptime() / 1000.0));
      $$0.a("Wall uptime", () -> a((double)(System.currentTimeMillis() - this.bA) / 1000.0));
      $$0.a("High-res time", () -> a((double)ad.c() / 1000.0));
      $$0.a("Client ticks", () -> String.format(Locale.ROOT, "%d ticks / %.3fs", this.bB, (double)this.bB / 20.0));
   }

   private static ac a(ac $$0, @Nullable fip $$1, @Nullable gyp $$2, String $$3, @Nullable fit $$4) {
      $$0.a("Launched Version", () -> $$3);
      String $$5 = bg();
      if ($$5 != null) {
         $$0.a("Launcher name", $$5);
      }

      $$0.a("Backend library", RenderSystem::getBackendDescription);
      $$0.a("Backend API", RenderSystem::getApiDescription);
      $$0.a("Window size", () -> $$1 != null ? $$1.S.l() + "x" + $$1.S.m() : "<not initialized>");
      $$0.a("GFLW Platform", fcl::a);
      $$0.a("GL Caps", RenderSystem::getCapsString);
      $$0.a("GL debug messages", () -> fca.b() ? String.join("\n", fca.a()) : "<disabled>");
      $$0.a("Is Modded", () -> e().b());
      $$0.a("Universe", () -> $$1 != null ? Long.toHexString($$1.L) : "404");
      $$0.a("Type", "Client (map_client.txt)");
      if ($$4 != null) {
         if ($$1 != null) {
            String $$6 = $$1.aj().m();
            if ($$6 != null) {
               $$0.a("GPU Warnings", $$6);
            }
         }

         $$0.a("Graphics mode", $$4.k().c().toString());
         $$0.a("Render Distance", $$4.aG() + "/" + $$4.e().c() + " chunks");
      }

      if ($$1 != null) {
         $$0.a("Resource Packs", () -> aug.a($$1.ad().f()));
      }

      if ($$2 != null) {
         $$0.a("Current Language", () -> $$2.a());
      }

      $$0.a("Locale", String.valueOf(Locale.getDefault()));
      $$0.a("System encoding", () -> System.getProperty("sun.jnu.encoding", "<not set>"));
      $$0.a("File encoding", () -> System.getProperty("file.encoding", "<not set>"));
      $$0.a("CPU", fcb::b);
      return $$0;
   }

   public static fip Q() {
      return F;
   }

   public CompletableFuture<Void> R() {
      return this.a(this::l).thenCompose($$0 -> (CompletionStage<Void>)$$0);
   }

   public void a(gcr $$0) {
      if (!this.bw.a($$0)) {
         this.bw = gcu.a($$0, this.az);
      }
   }

   @Nullable
   public gca S() {
      return x.a(this.L(), gbn::x);
   }

   public boolean T() {
      return this.aU;
   }

   public boolean U() {
      return this.aU && this.aS != null;
   }

   @Nullable
   public hbo V() {
      return this.aS;
   }

   public boolean W() {
      hbo $$0 = this.V();
      return $$0 != null && !$$0.r();
   }

   public boolean b(UUID $$0) {
      return $$0.equals(this.X().b());
   }

   public fjc X() {
      return this.Y;
   }

   public GameProfile Y() {
      ProfileResult $$0 = this.N.join();
      return $$0 != null ? $$0.profile() : new GameProfile(this.Y.b(), this.Y.c());
   }

   public Proxy Z() {
      return this.ae;
   }

   public gxh aa() {
      return this.O;
   }

   public gic ab() {
      return this.P;
   }

   public auv ac() {
      return this.aj;
   }

   public aug ad() {
      return this.am;
   }

   public atl ae() {
      return this.ak;
   }

   public hac af() {
      return this.al;
   }

   public Path ag() {
      return this.M;
   }

   public gyp ah() {
      return this.an;
   }

   public Function<ale, gxg> a(ale $$0) {
      return this.aC.a($$0)::a;
   }

   public boolean ai() {
      return this.aW;
   }

   public ghc aj() {
      return this.av;
   }

   public hcf ak() {
      return this.ar;
   }

   public awd al() {
      awd $$0 = x.a(this.z, fqh::C);
      if ($$0 != null) {
         return $$0;
      } else if (this.t != null) {
         if (this.t.dS().ag() == dej.j) {
            return this.m.j().b() ? awe.d : awe.e;
         } else {
            jo<dfk> $$1 = this.t.dS().t(this.t.ds());
            if (!this.as.c(awe.f) && (!this.t.bn() || !$$1.a(awu.Z))) {
               return this.t.dS().ag() != dej.i && this.t.ge().d && this.t.ge().c ? awe.b : $$1.a().o().orElse(awe.g);
            } else {
               return awe.f;
            }
         }
      } else {
         return awe.a;
      }
   }

   public MinecraftSessionService am() {
      return this.ay;
   }

   public gyi an() {
      return this.aB;
   }

   @Nullable
   public btr ao() {
      return this.u;
   }

   public void a(btr $$0) {
      this.u = $$0;
      this.j.a($$0);
   }

   public boolean b(btr $$0) {
      return $$0.cl() || this.t != null && this.t.Q_() && this.n.Q.e() && $$0.ao() == bty.by;
   }

   @Override
   protected Thread ay() {
      return this.bc;
   }

   @Override
   protected Runnable f(Runnable $$0) {
      return $$0;
   }

   @Override
   protected boolean e(Runnable $$0) {
      return true;
   }

   public gio ap() {
      return this.aD;
   }

   public gnm aq() {
      return this.V;
   }

   public gjv ar() {
      return this.aN;
   }

   public gom as() {
      return this.W;
   }

   public ghk at() {
      return this.X;
   }

   public DataFixer au() {
      return this.Q;
   }

   public fif av() {
      return this.T;
   }

   public fjr aw() {
      return this.ao;
   }

   public boolean az() {
      return this.t != null && this.t.gt() || this.n.X().c();
   }

   public fmz aA() {
      return this.aJ;
   }

   public hdh aB() {
      return this.aK;
   }

   public boolean aC() {
      return this.bi;
   }

   public fik aD() {
      return this.aa;
   }

   public gzs aE() {
      return this.aC;
   }

   public gyg aF() {
      return this.aE;
   }

   public gyf aG() {
      return this.aF;
   }

   public gye aH() {
      return this.aG;
   }

   public gyd aI() {
      return this.aH;
   }

   public fkc aJ() {
      return this.aI;
   }

   @Override
   public void a(boolean $$0) {
      this.bi = $$0;
   }

   public xe a(File $$0, int $$1, int $$2) {
      int $$3 = this.S.l();
      int $$4 = this.S.m();
      fbs $$5 = new fbt($$1, $$2, true);
      float $$6 = this.t.dK();
      float $$7 = this.t.dI();
      float $$8 = this.t.P;
      float $$9 = this.t.O;
      this.j.b(false);

      xs var12;
      try {
         this.j.c(true);
         this.S.a($$1);
         this.S.b($$2);

         for (int $$10 = 0; $$10 < 6; $$10++) {
            switch ($$10) {
               case 0:
                  this.t.v($$7);
                  this.t.w(0.0F);
                  break;
               case 1:
                  this.t.v(($$7 + 90.0F) % 360.0F);
                  this.t.w(0.0F);
                  break;
               case 2:
                  this.t.v(($$7 + 180.0F) % 360.0F);
                  this.t.w(0.0F);
                  break;
               case 3:
                  this.t.v(($$7 - 90.0F) % 360.0F);
                  this.t.w(0.0F);
                  break;
               case 4:
                  this.t.v($$7);
                  this.t.w(-90.0F);
                  break;
               case 5:
               default:
                  this.t.v($$7);
                  this.t.w(90.0F);
            }

            this.t.O = this.t.dI();
            this.t.P = this.t.dK();
            $$5.a(true);
            this.j.a(fif.b);

            try {
               Thread.sleep(10L);
            } catch (InterruptedException var17) {
            }

            fiy.a($$0, "panorama_" + $$10 + ".png", $$5, $$0x -> {
            });
         }

         xe $$11 = xe.b($$0.getName()).a(n.t).a($$1x -> $$1x.a(new xc(xc.a.b, $$0.getAbsolutePath())));
         return xe.a("screenshot.success", $$11);
      } catch (Exception var18) {
         G.error("Couldn't save image", var18);
         var12 = xe.a("screenshot.failure", var18.getMessage());
      } finally {
         this.t.w($$6);
         this.t.v($$7);
         this.t.P = $$8;
         this.t.O = $$9;
         this.j.b(true);
         this.S.a($$3);
         this.S.b($$4);
         $$5.a();
         this.j.c(false);
         this.h().a(true);
      }

      return var12;
   }

   private xe a(File $$0, int $$1, int $$2, int $$3, int $$4) {
      try {
         ByteBuffer $$5 = fcb.a($$1 * $$2 * 3);
         fiy $$6 = new fiy($$0, $$3, $$4, $$2);
         float $$7 = (float)$$3 / (float)$$1;
         float $$8 = (float)$$4 / (float)$$2;
         float $$9 = $$7 > $$8 ? $$7 : $$8;

         for (int $$10 = ($$4 - 1) / $$2 * $$2; $$10 >= 0; $$10 -= $$2) {
            for (int $$11 = 0; $$11 < $$3; $$11 += $$1) {
               RenderSystem.setShaderTexture(0, gxf.d);
               float $$12 = (float)($$3 - $$1) / 2.0F * 2.0F - (float)($$11 * 2);
               float $$13 = (float)($$4 - $$2) / 2.0F * 2.0F - (float)($$10 * 2);
               $$12 /= (float)$$1;
               $$13 /= (float)$$2;
               this.j.a($$9, $$12, $$13);
               $$5.clear();
               RenderSystem.pixelStore(3333, 1);
               RenderSystem.pixelStore(3317, 1);
               RenderSystem.readPixels(0, 0, $$1, $$2, 32992, 5121, $$5);
               $$6.a($$5, $$11, $$10, $$1, $$2);
            }

            $$6.a();
         }

         File $$14 = $$6.b();
         fcb.a($$5);
         xe $$15 = xe.b($$14.getName()).a(n.t).a($$1x -> $$1x.a(new xc(xc.a.b, $$14.getAbsolutePath())));
         return xe.a("screenshot.success", $$15);
      } catch (Exception var15) {
         G.warn("Couldn't save screenshot", var15);
         return xe.a("screenshot.failure", var15.getMessage());
      }
   }

   public bog aK() {
      return this.bm;
   }

   @Nullable
   public arw aL() {
      return this.Z.get();
   }

   public gyj aM() {
      return this.au;
   }

   @Nullable
   public fqb aN() {
      return this.ba;
   }

   public fuw aO() {
      return this.aL;
   }

   public fcl aP() {
      return this.S;
   }

   public fbz aQ() {
      return this.bh;
   }

   public fkw aR() {
      return this.m.k();
   }

   public ght aS() {
      return this.U;
   }

   public void a(int $$0) {
      this.aC.a($$0);
   }

   public gam aT() {
      return this.aM;
   }

   public boolean aU() {
      return this.bt().flag(UserFlag.PROFANITY_FILTER_ENABLED);
   }

   public void aV() {
      this.aL.a();
      this.w().a();
   }

   @Nullable
   public azs aW() {
      return azs.a(this.ax.getServicesKeySet(), ServicesKeyType.PROFILE_KEY);
   }

   public boolean aX() {
      return !this.ax.getServicesKeySet().keys(ServicesKeyType.PROFILE_KEY).isEmpty();
   }

   public fim aY() {
      return this.ab;
   }

   public void a(fim $$0) {
      this.ab = $$0;
   }

   public fig aZ() {
      return this.bu;
   }

   public gcf ba() {
      return this.bv;
   }

   public gcu bb() {
      return this.bw;
   }

   public ffm bc() {
      return this.aQ;
   }

   public ggp bd() {
      return this.aR;
   }

   public fic be() {
      return this.bx;
   }

   public eym bf() {
      return this.by;
   }

   private float a(float $$0) {
      if (this.s != null) {
         bsb $$1 = this.s.s();
         if ($$1.i()) {
            return Math.max($$0, $$1.g());
         }
      }

      return $$0;
   }

   @Nullable
   public static String bg() {
      return System.getProperty("minecraft.launcher.brand");
   }

   public static enum a {
      a(xd.a) {
         @Override
         public boolean a(boolean $$0) {
            return true;
         }
      },
      b(xe.c("chat.disabled.options").a(n.m)) {
         @Override
         public boolean a(boolean $$0) {
            return false;
         }
      },
      c(xe.c("chat.disabled.launcher").a(n.m)) {
         @Override
         public boolean a(boolean $$0) {
            return $$0;
         }
      },
      d(xe.a("chat.disabled.profile", xe.d(fip.F.n.I.h())).a(n.m)) {
         @Override
         public boolean a(boolean $$0) {
            return $$0;
         }
      };

      static final xe e = xe.c("chat.disabled.profile.moreInfo");
      private final xe f;

      a(final xe $$0) {
         this.f = $$0;
      }

      public xe a() {
         return this.f;
      }

      public abstract boolean a(boolean var1);
   }

   static record b(fdy a, fwc.c b) {
   }
}
