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
import com.mojang.jtracy.DiscontinuousFrame;
import com.mojang.jtracy.TracyClient;
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
import java.util.Objects;
import java.util.Optional;
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

public class foz extends bsw<Runnable> implements fio {
   static foz F;
   private static final Logger G = LogUtils.getLogger();
   public static final boolean a = af.n() == af.a.d;
   private static final int H = 10;
   public static final alg b = alg.b("default");
   public static final alg c = alg.b("uniform");
   public static final alg d = alg.b("alt");
   private static final alg I = alg.b("regional_compliancies.json");
   private static final CompletableFuture<bau> J = CompletableFuture.completedFuture(bau.a);
   private static final wy K = wy.c("multiplayer.socialInteractions.not_available");
   public static final String e = "Please make sure you have up-to-date drivers (see aka.ms/mcdriver for instructions).";
   private final long L = Double.doubleToLongBits(Math.PI);
   private final Path M;
   private final CompletableFuture<ProfileResult> N;
   private final hiz O;
   private final gqr P;
   private final DataFixer Q;
   private final gra R;
   private final fin S;
   private final foo.b T = new foo.b(20.0F, 0L, this::a);
   private final gqi U;
   public final gpv f;
   private final gwf V;
   private final hfo W;
   private final gxf X;
   private final gpy Y;
   public final gnk g;
   private final fpl Z;
   public final frt h;
   public final frt i;
   public final gpq j;
   public final guc l;
   private final AtomicReference<ase> aa = new AtomicReference<>();
   public final fru m;
   public final fpd n;
   private final fou ab;
   public final fpa o;
   public final foy p;
   private fow ac = fow.a;
   public final File q;
   private final String ad;
   private final String ae;
   private final Proxy af;
   private final eyv ag;
   private final boolean ah;
   private final boolean ai;
   private final boolean aj;
   private final ava ak;
   private final att al;
   private final hlw am;
   private final aun an;
   private final hkg ao;
   private final fqb ap;
   private final fhu aq;
   @Nullable
   private final fgv ar;
   private final hoa as;
   private final hnv at;
   private final fuz au;
   private final hka av;
   private final gpr aw;
   private final fpe ax = new fpe(I, foz::a);
   private final YggdrasilAuthenticationService ay;
   private final MinecraftSessionService az;
   private final UserApiService aA;
   private final CompletableFuture<UserProperties> aB;
   private final hjz aC;
   private final hll aD;
   private final gre aE;
   private final hjx aF;
   private final hjw aG;
   private final hjv aH;
   private final hju aI;
   private final frw aJ;
   private final fuu aK;
   private final hpc aL;
   private final gct aM;
   private final gsl aN;
   private final hoe aO;
   private final gkm aP;
   private final fly aQ;
   private final gpf aR;
   @Nullable
   public gkj r;
   @Nullable
   public gjz s;
   @Nullable
   public gox t;
   @Nullable
   private hni aS;
   @Nullable
   private vr aT;
   private boolean aU;
   @Nullable
   public bwf u;
   @Nullable
   public bwf v;
   @Nullable
   public feo w;
   private int aV;
   protected int x;
   private volatile boolean aW;
   private long aX = af.d();
   private long aY;
   private int aZ;
   public boolean y;
   @Nullable
   public fyb z;
   @Nullable
   private fxv ba;
   private boolean bb;
   Thread bc;
   private volatile boolean bd;
   @Nullable
   private Supplier<o> be;
   private static int bf;
   public String A = "";
   private long bg;
   private final fib bh;
   public boolean B;
   public boolean C;
   public boolean D;
   public boolean E = true;
   private boolean bi;
   private final Queue<Runnable> bj = Queues.newConcurrentLinkedQueue();
   @Nullable
   private CompletableFuture<Void> bk;
   @Nullable
   private fuv bl;
   private int bm;
   private final bqh bn;
   private bsf bo = bse.a;
   private final fpg bp = new fpg();
   private long bq;
   private double br;
   @Nullable
   private fjd.a bs;
   private final fop bt;
   private final gkt bu;
   private gli bv;
   private final fol bw;
   private final feg bx;
   private boolean by;
   private final long bz;
   private long bA;

   public foz(final ged $$0) {
      super("Client");
      F = this;
      this.bz = System.currentTimeMillis();
      this.q = $$0.c.a;
      File $$1 = $$0.c.c;
      this.M = $$0.c.b.toPath();
      this.ad = $$0.d.b;
      this.ae = $$0.d.c;
      Path $$2 = this.q.toPath();
      this.bx = eyv.a($$2.resolve("allowed_symlinks.txt"));
      hjo $$3 = new hjo($$0.c.a(), this.bx);
      this.am = new hlw(this, $$2.resolve("downloads"), $$0.a);
      aup $$4 = new aui(this.M, atr.a, auo.b, this.bx);
      this.an = new aun($$3, this.am.a(), $$4);
      this.al = $$3.a();
      this.af = $$0.a.d;
      this.ay = new YggdrasilAuthenticationService(this.af);
      this.az = this.ay.createMinecraftSessionService();
      this.Z = $$0.a.a;
      this.N = CompletableFuture.supplyAsync(() -> this.az.fetchProfile(this.Z.b(), true), af.j());
      this.aA = this.a(this.ay, $$0);
      this.aB = CompletableFuture.supplyAsync(() -> {
         try {
            return this.aA.fetchProperties();
         } catch (AuthenticationException var2x) {
            G.error("Failed to fetch user properties", var2x);
            return UserApiService.OFFLINE_PROPERTIES;
         }
      }, af.j());
      G.info("Setting user: {}", this.Z.c());
      G.debug("(Session ID is {})", this.Z.a());
      this.ah = $$0.d.a;
      this.ai = !$$0.d.d;
      this.aj = !$$0.d.e;
      this.aS = null;
      yd.a(fox::a);
      this.Q = bbc.a();
      this.aK = new fuu(this);
      this.bc = Thread.currentThread();
      this.n = new fpd(this, this.q);
      boolean $$5 = this.n.ae;
      this.n.ae = false;
      this.n.az();
      RenderSystem.setShaderGlintAlpha(this.n.aq().c());
      this.bd = true;
      this.aL = new hpc(this, this.n);
      this.ab = new fou($$2, this.Q);
      G.info("Backend library: {}", RenderSystem.getBackendDescription());
      fia $$6 = $$0.b;
      if (this.n.p > 0 && this.n.o > 0) {
         $$6 = $$0.b.a(this.n.o, this.n.p);
      }

      if (!$$5) {
         $$6 = $$6.a(false);
         this.n.k = null;
         G.warn("Detected unexpected shutdown during last game startup: resetting fullscreen mode");
      }

      af.c = RenderSystem.initBackendSystem();
      this.R = new gra(this);
      this.S = this.R.a($$6, this.n.k, this.bh());
      this.a(true);
      this.S.a(new Runnable() {
         private boolean c;

         @Override
         public void run() {
            if (!this.c) {
               this.c = true;
               fhx.a($$0.c.a, foz.this.bc.threadId());
            }
         }
      });
      hop.a.b(hol.A);

      try {
         this.S.a(this.al, ab.b().g() ? fie.a : fie.b);
      } catch (IOException var14) {
         G.error("Couldn't set icon", var14);
      }

      this.o = new fpa(this);
      this.o.a(this.S.h());
      this.p = new foy(this);
      this.p.a(this.S.h());
      RenderSystem.initRenderer(this.n.t, false);
      this.aq = new fhs(this.S.k(), this.S.l());
      this.aq.a(0.0F, 0.0F, 0.0F, 0.0F);
      this.aq.f();
      this.ak = new ava(atr.a);
      this.an.a();
      this.n.b(this.an);
      this.ao = new hkg(this.n.ab, $$0x -> {
         if (this.t != null) {
            this.t.j.C();
         }
      });
      this.ak.a(this.ao);
      this.O = new hiz(this.ak);
      this.ak.a(this.O);
      this.P = new gqr(this.O, this::a);
      this.ak.a(this.P);
      this.aC = new hjz($$1.toPath().resolve("skins"), this.az, this);
      this.ag = new eyv($$2.resolve("saves"), $$2.resolve("backups"), this.bx, this.Q);
      this.bw = new fol($$2);
      this.as = new hoa(this.n);
      this.ak.a(this.as);
      this.av = new hka(this.Z);
      this.ak.a(this.av);
      this.at = new hnv(this);
      this.au = new fuz(this.O);
      this.h = this.au.a();
      this.i = this.au.b();
      this.ak.a(this.au);
      this.g();
      this.ak.a(new hjr());
      this.ak.a(new hjq());
      this.S.a("Startup");
      RenderSystem.setupDefaultState(0, 0, this.S.k(), this.S.l());
      this.S.a("Post startup");
      this.ap = fqb.a();
      this.aD = new hll(this.O, this.ap, this.n.E().c());
      this.ak.a(this.aD);
      hlc $$8 = new hlc();
      this.ak.a($$8);
      this.W = new hfo(this.aD);
      this.X = new gxf(this.W);
      this.aH = new hjv(this.O);
      this.aI = new hju(this.O);
      this.ak.a(this.aI);
      this.Y = new gpy(this.aI, this.aH);

      try {
         int $$9 = Runtime.getRuntime().availableProcessors();
         fjl.a();
         this.U = new gqi($$9);
      } catch (OutOfMemoryError var13) {
         TinyFileDialogs.tinyfd_messageBox(
            "Minecraft",
            "Oh no! The game was unable to allocate memory off-heap while trying to start. You may try to free some memory by closing other applications on your computer, check that your system meets the minimum requirements, and try again. If the problem persists, please visit: "
               + ayh.k,
            "ok",
            "error",
            true
         );
         throw new gee("Unable to allocate render buffers", var13);
      }

      this.aM = new gct(this, this.aA);
      this.aE = new gre(this.aD.b(), this.aD.d(), this.ap);
      this.ak.a(this.aE);
      this.V = new gwf(this, this.O, this.W, this.X, this.Y, this.aE, this.h, this.n, this.aD.e(), $$8);
      this.ak.a(this.V);
      this.aN = new gsl(this.h, this.aD.e(), this.aE, this.W, this.X, this.V);
      this.ak.a(this.aN);
      this.g = new gnk(this.s, this.O);
      this.ak.a(this.g);
      this.aF = new hjx(this.O);
      this.ak.a(this.aF);
      this.aG = new hjw(this.O);
      this.ak.a(this.aG);
      this.aJ = new frw(this.O);
      this.ak.a(this.aJ);
      this.j = new gpq(this, this.V.d(), this.ak, this.U);
      this.f = new gpv(this, this.V, this.aN, this.U);
      this.ak.a(this.f);
      this.ak.a(this.f.z());
      this.aw = new gpr();
      this.ak.a(this.aw);
      this.ak.a(this.ax);
      this.m = new fru(this);
      this.l = new guc(this);
      fjz $$11 = fjz.a(this);
      this.aQ = new fly($$11);
      RenderSystem.setErrorCallback(this::a);
      if (this.aq.c != this.S.k() || this.aq.d != this.S.l()) {
         StringBuilder $$12 = new StringBuilder(
            "Recovering from unsupported resolution ("
               + this.S.k()
               + "x"
               + this.S.l()
               + ").\nPlease make sure you have up-to-date drivers (see aka.ms/mcdriver for instructions)."
         );
         if (fic.b()) {
            $$12.append("\n\nReported GL debug messages:\n").append(String.join("\n", fic.a()));
         }

         this.S.a(this.aq.c, this.aq.d);
         TinyFileDialogs.tinyfd_messageBox("Minecraft", $$12.toString(), "ok", "error", false);
      } else if (this.n.ad().c() && !this.S.i()) {
         if ($$5) {
            this.S.g();
            this.n.ad().a(this.S.i());
         } else {
            this.n.ad().a(false);
         }
      }

      this.S.a(this.n.Q().c());
      this.S.b(this.n.I().c());
      this.S.d();
      this.a();
      this.j.a(this.al.d());
      this.aO = new hoe(this, this.aA, this.Z);
      this.aP = gkm.a(this.aA, this.Z, $$2);
      this.bt = new fop(this);
      this.bt.a(this.n.av().c() != fpb.a);
      this.bu = new gkt(this);
      this.bu.a(this.n.C().c());
      this.bv = gli.a(glf.a(), this.aA);
      fyd.a(this.O);
      fxr.a(this.O);
      this.a((fyb)(new fxm(wy.c("gui.loadingMinecraft"))));
      List<atp> $$13 = this.an.h();
      this.bp.a(fpg.b.a, $$13);
      auz $$14 = this.ak.a(af.h().a("resourceLoad"), this, J, $$13);
      hop.a.a(hol.C);
      foz.b $$15 = new foz.b($$11, $$0.e);
      this.a((fxv)(new fxr(this, $$14, $$1x -> af.a($$1x, $$1xx -> this.a($$1xx, $$15), () -> {
            if (ab.aU) {
               this.bk();
            }

            this.bp.a();
            this.a($$15);
         }), false)));
      this.aR = gpf.a($$0.e.b());
      this.bh = new fib(this.n, this);
      this.bn = new bqh(af.c, () -> this.bm, this.bh::c);
      if (TracyClient.isAvailable() && $$0.d.f) {
         this.ar = new fgv();
      } else {
         this.ar = null;
      }
   }

   private void a(@Nullable foz.b $$0) {
      if (!this.by) {
         this.by = true;
         this.b($$0);
      }
   }

   private void b(@Nullable foz.b $$0) {
      Runnable $$1 = this.c($$0);
      hop.a.b(hol.C);
      hop.a.b(hol.z);
      hop.a.a(this.aO.a());
      $$1.run();
      this.n.ae = true;
      this.n.az();
   }

   public boolean c() {
      return this.by;
   }

   private Runnable c(@Nullable foz.b $$0) {
      List<Function<Runnable, fyb>> $$1 = new ArrayList<>();
      this.a($$1);
      Runnable $$2 = () -> {
         if ($$0 != null && $$0.b().a()) {
            gpe.a(this, $$0.b(), $$0.a());
         } else {
            this.a((fyb)(new fyd(true)));
         }
      };

      for (Function<Runnable, fyb> $$3 : Lists.reverse($$1)) {
         fyb $$4 = $$3.apply($$2);
         $$2 = () -> this.a($$4);
      }

      return $$2;
   }

   private void a(List<Function<Runnable, fyb>> $$0) {
      if (this.n.ac) {
         $$0.add($$0x -> new fwt(this.n, $$0x));
      }

      BanDetails $$1 = this.H();
      if ($$1 != null) {
         $$0.add($$1x -> fww.a($$1xx -> {
               if ($$1xx) {
                  af.n().a(ayh.n);
               }

               $$1x.run();
            }, $$1));
      }

      ProfileResult $$2 = this.N.join();
      if ($$2 != null) {
         GameProfile $$3 = $$2.profile();
         Set<ProfileActionType> $$4 = $$2.actions();
         if ($$4.contains(ProfileActionType.FORCED_NAME_CHANGE)) {
            $$0.add($$1x -> fww.a($$3.getName(), $$1x));
         }

         if ($$4.contains(ProfileActionType.USING_BANNED_SKIN)) {
            $$0.add(fww::a);
         }
      }
   }

   private static boolean a(Object $$0) {
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
      gka $$1 = this.L();
      if ($$1 != null && $$1.k().i()) {
         $$0.append(" - ");
         gko $$2 = this.S();
         if (this.aS != null && !this.aS.r()) {
            $$0.append(hke.a("title.singleplayer"));
         } else if ($$2 != null && $$2.e()) {
            $$0.append(hke.a("title.multiplayer.realms"));
         } else if (this.aS == null && ($$2 == null || !$$2.d())) {
            $$0.append(hke.a("title.multiplayer.other"));
         } else {
            $$0.append(hke.a("title.multiplayer.lan"));
         }
      }

      return $$0.toString();
   }

   private UserApiService a(YggdrasilAuthenticationService $$0, ged $$1) {
      return $$1.a.a.g() != fpl.a.c ? UserApiService.OFFLINE : $$0.createUserApiService($$1.a.a.d());
   }

   public static azl e() {
      return azl.a("vanilla", ClientBrandRetriever::getClientModName, "Client", foz.class);
   }

   private void a(Throwable $$0, @Nullable foz.b $$1) {
      if (this.an.e().size() > 1) {
         this.a($$0, null, $$1);
      } else {
         af.a($$0);
      }
   }

   public void a(Throwable $$0, @Nullable wy $$1, @Nullable foz.b $$2) {
      G.info("Caught error loading resourcepacks, removing all selected resourcepacks", $$0);
      this.bp.a($$0);
      this.am.b();
      this.an.b(Collections.emptyList());
      this.n.i.clear();
      this.n.j.clear();
      this.n.az();
      this.a(true, $$2).thenRunAsync(() -> this.a($$1), this);
   }

   private void bi() {
      this.a(null);
      if (this.s != null) {
         this.s.ad();
         this.y();
      }

      this.a((fyb)(new fyd()));
      this.a(null);
   }

   private void a(@Nullable wy $$0) {
      fuu $$1 = this.aA();
      fus.b($$1, fus.a.c, wy.c("resourcePack.load_fail"), $$0);
   }

   public void a(Exception $$0) {
      if (!this.an.b()) {
         if (this.an.e().size() <= 1) {
            G.error(LogUtils.FATAL_MARKER, $$0.getMessage(), $$0);
            this.c(new o($$0.getMessage(), $$0));
         } else {
            this.a_(this::bi);
         }
      } else {
         this.a($$0, wy.c("resourcePack.runtime_failure"), null);
      }
   }

   public void f() {
      this.bc = Thread.currentThread();
      if (Runtime.getRuntime().availableProcessors() > 4) {
         this.bc.setPriority(10);
      }

      DiscontinuousFrame $$0 = TracyClient.createDiscontinuousFrame("Client Tick");

      try {
         boolean $$1 = false;

         while (this.bd) {
            this.bj();

            try {
               bqr $$2 = bqr.a("Renderer");
               boolean $$3 = this.aQ().e();

               try (bqn.a $$4 = bqn.a(this.a($$3, $$2))) {
                  this.bo.c();
                  $$0.start();
                  this.c(!$$1);
                  $$0.end();
                  this.bo.d();
               }

               this.b($$3, $$2);
            } catch (OutOfMemoryError var10) {
               if ($$1) {
                  throw var10;
               }

               this.bl();
               this.a((fyb)(new fxu()));
               System.gc();
               G.error(LogUtils.FATAL_MARKER, "Out of memory", var10);
               $$1 = true;
            }
         }
      } catch (z var11) {
         G.error(LogUtils.FATAL_MARKER, "Reported exception thrown!", var11);
         this.c(var11.a());
      } catch (Throwable var12) {
         G.error(LogUtils.FATAL_MARKER, "Unreported exception thrown!", var12);
         this.c(new o("Unexpected error", var12));
      }
   }

   void g() {
      this.au.a(this.n);
   }

   private void a(int $$0, long $$1) {
      this.n.Q().a(false);
      this.n.az();
   }

   public fhu h() {
      return this.aq;
   }

   public String i() {
      return this.ad;
   }

   public String j() {
      return this.ae;
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
      azk.b();
      o $$1 = this.d($$0);
      this.bl();
      a(this, this.q, $$1);
   }

   public static int a(File $$0, o $$1) {
      Path $$2 = $$0.toPath().resolve("crash-reports");
      Path $$3 = $$2.resolve("crash-" + af.f() + "-client.txt");
      ali.a($$1.a(y.a));
      if ($$1.e() != null) {
         ali.a("#@!@# Game crashed! Crash report saved to: #@!@# " + $$1.e().toAbsolutePath());
         return -1;
      } else if ($$1.a($$3, y.a)) {
         ali.a("#@!@# Game crashed! Crash report saved to: #@!@# " + $$3.toAbsolutePath());
         return -1;
      } else {
         ali.a("#@?@# Game crashed! Crash report could not be saved. #@?@#");
         return -2;
      }
   }

   public static void a(@Nullable foz $$0, File $$1, o $$2) {
      int $$3 = a($$1, $$2);
      if ($$0 != null) {
         $$0.as.h();
      }

      System.exit($$3);
   }

   public boolean k() {
      return this.n.S().c();
   }

   public CompletableFuture<Void> l() {
      return this.a(false, null);
   }

   private CompletableFuture<Void> a(boolean $$0, @Nullable foz.b $$1) {
      if (this.bk != null) {
         return this.bk;
      } else {
         CompletableFuture<Void> $$2 = new CompletableFuture<>();
         if (!$$0 && this.ba instanceof fxr) {
            this.bk = $$2;
            return $$2;
         } else {
            this.an.a();
            List<atp> $$3 = this.an.h();
            if (!$$0) {
               this.bp.a(fpg.b.b, $$3);
            }

            this.a((fxv)(new fxr(this, this.ak.a(af.h().a("resourceLoad"), this, J, $$3), $$3x -> af.a($$3x, $$2xx -> {
                  if ($$0) {
                     this.am.c();
                     this.bi();
                  } else {
                     this.a($$2xx, $$1);
                  }
               }, () -> {
                  this.f.e();
                  this.bp.a();
                  this.am.d();
                  $$2.complete(null);
                  this.a($$1);
               }), !$$0)));
            return $$2;
         }
      }
   }

   private void bk() {
      boolean $$0 = false;
      grd $$1 = this.ap().a();
      hkx $$2 = $$1.a().a();

      for (dmf $$3 : mf.e) {
         UnmodifiableIterator $$7 = $$3.l().a().iterator();

         while ($$7.hasNext()) {
            eah $$4 = (eah)$$7.next();
            if ($$4.o() == dss.b) {
               hkx $$5 = $$1.b($$4);
               if ($$5 == $$2) {
                  G.debug("Missing model for: {}", $$4);
                  $$0 = true;
               }
            }
         }
      }

      hix $$6 = $$2.d();

      for (dmf $$7 : mf.e) {
         UnmodifiableIterator var15 = $$7.l().a().iterator();

         while (var15.hasNext()) {
            eah $$8 = (eah)var15.next();
            hix $$9 = $$1.a($$8);
            if (!$$8.l() && $$9 == $$6) {
               G.debug("Missing particle icon for: {}", $$8);
            }
         }
      }

      mf.g.c().forEach($$0x -> {
         cyz $$1x = (cyz)$$0x.a();
         String $$2x = $$1x.j();
         String $$3x = wy.c($$2x).getString();
         if ($$3x.toLowerCase(Locale.ROOT).equals($$1x.j())) {
            G.debug("Missing translation for: {} {} {}", new Object[]{$$0x.h().a(), $$2x, $$1x});
         }
      });
      $$0 |= fxs.a();
      $$0 |= gwi.a();
      if ($$0) {
         throw new IllegalStateException("Your game data is foobar, fix the errors above!");
      }
   }

   public eyv m() {
      return this.ag;
   }

   private void a(String $$0) {
      foz.a $$1 = this.J();
      if (!$$1.a(this.T())) {
         if (this.m.b()) {
            this.m.b(false);
            this.a((fyb)(new fwy($$0x -> {
               if ($$0x) {
                  af.n().a(ayh.g);
               }

               this.a(null);
            }, foz.a.e, ayh.g, true)));
         } else {
            wy $$2 = $$1.a();
            this.m.a($$2, false);
            this.bt.c($$2);
            this.m.b($$1 == foz.a.d);
         }
      } else {
         this.a((fyb)(new fwx($$0)));
      }
   }

   public void a(@Nullable fyb $$0) {
      if (ab.aU && Thread.currentThread() != this.bc) {
         G.error("setScreen called from non-game thread");
      }

      if (this.z != null) {
         this.z.aF_();
      } else {
         this.a(fow.a);
      }

      if ($$0 == null && this.bb) {
         throw new IllegalStateException("Trying to return to in-game GUI during disconnection");
      } else {
         if ($$0 == null && this.s == null) {
            $$0 = new fyd();
         } else if ($$0 == null && this.t.eH()) {
            if (this.t.n()) {
               $$0 = new fxf(null, this.s.k().l());
            } else {
               this.t.gg();
            }
         }

         this.z = $$0;
         if (this.z != null) {
            this.z.aG_();
         }

         if ($$0 != null) {
            this.o.j();
            fox.b();
            $$0.b(this, this.S.o(), this.S.p());
            this.y = false;
         } else {
            this.as.i();
            this.o.i();
         }

         this.d();
      }
   }

   public void a(@Nullable fxv $$0) {
      this.ba = $$0;
   }

   public void n() {
      try {
         G.info("Stopping!");

         try {
            this.bt.c();
         } catch (Throwable var7) {
         }

         try {
            if (this.s != null) {
               this.s.ad();
            }

            this.y();
         } catch (Throwable var6) {
         }

         if (this.z != null) {
            this.z.aF_();
         }

         this.close();
      } finally {
         af.c = System::nanoTime;
         if (this.be == null) {
            System.exit(0);
         }
      }
   }

   @Override
   public void close() {
      if (this.bs != null) {
         this.bs.a();
      }

      try {
         this.aO.close();
         this.ax.close();
         this.aD.close();
         this.au.close();
         this.j.close();
         this.P.close();
         this.f.close();
         this.as.g();
         this.g.a();
         this.aG.close();
         this.aF.close();
         this.aI.close();
         this.aJ.close();
         this.aH.close();
         this.O.close();
         this.ak.close();
         if (this.ar != null) {
            this.ar.close();
         }

         fvl.b();
         af.k();
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

      if (this.bk != null && !(this.ba instanceof fxr)) {
         CompletableFuture<Void> $$1 = this.bk;
         this.bk = null;
         this.l().thenRun(() -> $$1.complete(null));
      }

      Runnable $$2;
      while (($$2 = this.bj.poll()) != null) {
         $$2.run();
      }

      int $$3 = this.T.a(af.c(), $$0);
      bqo $$4 = bqn.a();
      if ($$0) {
         $$4.a("scheduledExecutables");
         this.bA();
         $$4.c();
         $$4.a("tick");

         for (int $$5 = 0; $$5 < Math.min(10, $$3); $$5++) {
            $$4.f("clientTick");
            this.t();
         }

         $$4.c();
      }

      this.S.a("Render");
      $$4.a("sound");
      this.as.a(this.j.k());
      $$4.b("toasts");
      this.aK.a();
      $$4.b("render");
      long $$6 = af.d();
      boolean $$8;
      if (!this.aQ().d() && !this.bo.e()) {
         $$8 = false;
         this.br = 0.0;
      } else {
         $$8 = this.bs == null || this.bs.b();
         if ($$8) {
            fjd.a().ifPresent(fjd::b);
         }
      }

      RenderSystem.clear(16640);
      this.aq.a(true);
      RenderSystem.setShaderFog(gpo.a);
      $$4.a("display");
      RenderSystem.enableCull();
      $$4.b("mouse");
      this.o.a();
      $$4.c();
      if (!this.y) {
         $$4.b("gameRenderer");
         this.j.a(this.T, $$0);
         $$4.c();
      }

      $$4.a("blit");
      this.aq.e();
      if (!this.S.u()) {
         this.aq.c(this.S.k(), this.S.l());
      }

      this.bg = af.d() - $$6;
      if ($$8) {
         fjd.a().ifPresent($$0x -> this.bs = $$0x.c());
      }

      $$4.b("updateDisplay");
      if (this.ar != null) {
         this.ar.a();
         this.ar.a(this.aq);
      }

      this.S.a(this.ar);
      int $$9 = this.bh.a();
      if ($$9 < 260) {
         RenderSystem.limitDisplayFPS($$9);
      }

      $$4.b("yield");
      Thread.yield();
      $$4.c();
      this.S.a("Post render");
      this.aZ++;
      this.aW = this.U() && (this.z != null && this.z.k() || this.ba != null && this.ba.a()) && !this.aS.r();
      this.T.b(this.aW);
      this.T.c(!this.bq());
      long $$10 = af.d();
      long $$11 = $$10 - this.aX;
      if ($$8) {
         this.bq = $$11;
      }

      this.aQ().a($$11);
      this.aX = $$10;
      $$4.a("fpsUpdate");
      if (this.bs != null && this.bs.b()) {
         this.br = (double)this.bs.c() * 100.0 / (double)this.bq;
      }

      while (af.c() >= this.aY + 1000L) {
         String $$12;
         if (this.br > 0.0) {
            $$12 = " GPU: " + (this.br > 100.0 ? n.m + "100%" : Math.round(this.br) + "%");
         } else {
            $$12 = "";
         }

         bf = this.aZ;
         this.A = String.format(
            Locale.ROOT,
            "%d fps T: %s%s%s%s B: %d%s",
            bf,
            $$9 == 260 ? "inf" : $$9,
            this.n.Q().c() ? " vsync " : " ",
            this.n.k().c(),
            this.n.j().c() == fok.a ? "" : (this.n.j().c() == fok.b ? " fast-clouds" : " fancy-clouds"),
            this.n.G().c(),
            $$12
         );
         this.aY += 1000L;
         this.aZ = 0;
      }

      $$4.c();
   }

   private bqo a(boolean $$0, @Nullable bqr $$1) {
      if (!$$0) {
         this.bn.b();
         if (!this.bo.e() && $$1 == null) {
            return bqk.a;
         }
      }

      bqo $$2;
      if ($$0) {
         if (!this.bn.a()) {
            this.bm = 0;
            this.bn.c();
         }

         this.bm++;
         $$2 = this.bn.d();
      } else {
         $$2 = bqk.a;
      }

      if (this.bo.e()) {
         $$2 = bqo.a($$2, this.bo.f());
      }

      return bqr.a($$2, $$1);
   }

   private void b(boolean $$0, @Nullable bqr $$1) {
      if ($$1 != null) {
         $$1.b();
      }

      fuc $$2 = this.aQ().o();
      if ($$0) {
         $$2.a(this.bn.e());
      } else {
         $$2.a(null);
      }
   }

   @Override
   public void a() {
      int $$0 = this.S.a(this.n.at().c(), this.k());
      this.S.a((double)$$0);
      if (this.z != null) {
         this.z.a(this, this.S.o(), this.S.p());
      }

      fhu $$1 = this.h();
      $$1.a(this.S.k(), this.S.l());
      this.j.a(this.S.k(), this.S.l());
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
      azk.b();

      try {
         if (this.aU && this.aS != null) {
            this.aS.a(true);
         }

         this.b(new fxm(wy.c("menu.savingLevel")));
      } catch (Throwable var2) {
      }

      System.gc();
   }

   public boolean b(Consumer<wy> $$0) {
      if (this.bo.e()) {
         this.bm();
         return false;
      } else {
         Consumer<bqm> $$1 = $$1x -> {
            if ($$1x != bqi.a) {
               int $$2x = $$1x.f();
               double $$3x = (double)$$1x.g() / (double)baq.a;
               this.execute(
                  () -> $$0.accept(
                        wy.a("commands.debug.stopped", String.format(Locale.ROOT, "%.2f", $$3x), $$2x, String.format(Locale.ROOT, "%.2f", (double)$$2x / $$3x))
                     )
               );
            }
         };
         Consumer<Path> $$2 = $$1x -> {
            wy $$2x = wy.b($$1x.toString()).a(n.t).a($$1xx -> $$1xx.a(new ww.d($$1x.getParent())));
            this.execute(() -> $$0.accept(wy.a("debug.profiling.stop", $$2x)));
         };
         ad $$3 = a(new ad(), this, this.ao, this.ad, this.n);
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
            CompletableFuture.allOf($$6, $$7).thenRunAsync(() -> $$4.accept(ImmutableList.of($$6.join(), $$7.join())), af.i());
            this.aS.a($$0x -> {
            }, $$7::complete);
            $$5 = $$6::complete;
         }

         this.bo = bsd.a(new gpc(af.c, this.f), af.c, af.i(), new bsj("client"), $$1x -> {
            this.bo = bse.a;
            $$1.accept($$1x);
         }, $$5);
         return true;
      }
   }

   private void bm() {
      this.bo.a();
      if (this.aS != null) {
         this.aS.aV();
      }
   }

   private void bn() {
      this.bo.b();
      if (this.aS != null) {
         this.aS.aW();
      }
   }

   private Path a(ad $$0, List<Path> $$1) {
      String $$2;
      if (this.T()) {
         $$2 = this.V().aZ().e();
      } else {
         gko $$3 = this.S();
         $$2 = $$3 != null ? $$3.a : "unknown";
      }

      Path $$7;
      try {
         String $$5 = String.format(Locale.ROOT, "%s-%s-%s", af.f(), $$2, ab.b().b());
         String $$6 = v.a(bsj.a, $$5, ".zip");
         $$7 = bsj.a.resolve($$6);
      } catch (IOException var21) {
         throw new UncheckedIOException(var21);
      }

      try (ayx $$10 = new ayx($$7)) {
         $$10.a(Paths.get("system.txt"), $$0.a());
         $$10.a(Paths.get("client").resolve(this.n.aF().getName()), this.n.aG());
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
            this.a((fyb)(new fxw(!$$0)));
            this.as.e();
         } else {
            this.a((fyb)(new fxw(true)));
         }
      }
   }

   private void d(boolean $$0) {
      if (!$$0) {
         this.x = 0;
      }

      if (this.x <= 0 && !this.t.fz()) {
         if ($$0 && this.w != null && this.w.d() == feo.a.b) {
            fem $$1 = (fem)this.w;
            iu $$2 = $$1.b();
            if (!this.s.a_($$2).l()) {
               ja $$3 = $$1.c();
               if (this.r.b($$2, $$3)) {
                  this.g.a($$2, $$3);
                  this.t.a(buc.a);
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
      } else if (this.t.B()) {
         return false;
      } else {
         czd $$0 = this.t.b(buc.a);
         if (!$$0.a(this.s.K())) {
            return false;
         } else {
            boolean $$1 = false;
            switch (this.w.d()) {
               case c:
                  this.r.a(this.t, ((fen)this.w).a());
                  break;
               case b:
                  fem $$2 = (fem)this.w;
                  iu $$3 = $$2.b();
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

                  this.t.gE();
            }

            this.t.a(buc.a);
            return $$1;
         }
      }
   }

   private void bp() {
      if (!this.r.j()) {
         this.aV = 4;
         if (!this.t.B()) {
            if (this.w == null) {
               G.warn("Null returned as 'hitResult', this shouldn't happen!");
            }

            for (buc $$0 : buc.values()) {
               czd $$1 = this.t.b($$0);
               if (!$$1.a(this.s.K())) {
                  return;
               }

               if (this.w != null) {
                  switch (this.w.d()) {
                     case c:
                        fen $$2 = (fen)this.w;
                        bwf $$3 = $$2.a();
                        if (!this.s.A_().a($$3.dv())) {
                           return;
                        }

                        bud $$4 = this.r.a(this.t, $$3, $$2, $$0);
                        if (!$$4.a()) {
                           $$4 = this.r.a(this.t, $$3, $$0);
                        }

                        if ($$4 instanceof bud.d $$5) {
                           if ($$5.e() == bud.e.b) {
                              this.t.a($$0);
                           }

                           return;
                        }
                        break;
                     case b:
                        fem $$6 = (fem)this.w;
                        int $$7 = $$1.M();
                        bud $$8 = this.r.a(this.t, $$0, $$6);
                        if ($$8 instanceof bud.d $$9) {
                           if ($$9.e() == bud.e.b) {
                              this.t.a($$0);
                              if (!$$1.f() && ($$1.M() != $$7 || this.t.fV())) {
                                 this.j.c.a($$0);
                              }
                           }

                           return;
                        }

                        if ($$8 instanceof bud.a) {
                           return;
                        }
                  }
               }

               if (!$$1.f() && this.r.a(this.t, $$0) instanceof bud.d $$11) {
                  if ($$11.e() == bud.e.b) {
                     this.t.a($$0);
                  }

                  this.j.c.a($$0);
                  return;
               }
            }
         }
      }
   }

   public hnv s() {
      return this.at;
   }

   public void t() {
      this.bA++;
      if (this.s != null && !this.aW) {
         this.s.u().m();
      }

      if (this.aV > 0) {
         this.aV--;
      }

      bqo $$0 = bqn.a();
      $$0.a("gui");
      this.bu.a();
      this.m.a(this.aW);
      $$0.c();
      this.j.a(1.0F);
      this.aL.a(this.s, this.w);
      $$0.a("gameMode");
      if (!this.aW && this.s != null) {
         this.r.c();
      }

      $$0.b("textures");
      if (this.bq()) {
         this.O.e();
      }

      if (this.z != null || this.t == null) {
         if (this.z instanceof fxo $$1 && !this.t.fR()) {
            $$1.m();
         }
      } else if (this.t.eH() && !(this.z instanceof fxf)) {
         this.a(null);
      } else if (this.t.fR() && this.s != null) {
         this.a((fyb)(new fxo()));
      }

      if (this.z != null) {
         this.x = 10000;
      }

      if (this.z != null) {
         try {
            this.z.e();
         } catch (Throwable var5) {
            o $$3 = o.a(var5, "Ticking screen");
            this.z.a($$3);
            throw new z($$3);
         }
      }

      if (!this.aQ().d()) {
         this.m.l();
      }

      if (this.ba == null && this.z == null) {
         $$0.b("Keybindings");
         this.bs();
         if (this.x > 0) {
            this.x--;
         }
      }

      if (this.s != null) {
         $$0.b("gameRenderer");
         if (!this.aW) {
            this.j.e();
         }

         $$0.b("levelRenderer");
         if (!this.aW) {
            this.f.n();
         }

         $$0.b("level");
         if (!this.aW) {
            this.s.e();
         }
      } else if (this.j.f() != null) {
         this.j.b();
      }

      if (!this.aW) {
         this.at.a();
      }

      this.as.a(this.aW);
      if (this.s != null) {
         if (!this.aW) {
            if (!this.n.s && this.br()) {
               wy $$4 = wy.c("tutorial.socialInteractions.title");
               wy $$5 = wy.a("tutorial.socialInteractions.description", hpc.a("socialInteractions"));
               this.bl = new fuv(this.h, fuv.a.f, $$4, $$5, true, 8000);
               this.aK.a(this.bl);
               this.n.s = true;
               this.n.az();
            }

            this.aL.d();

            try {
               this.s.a(() -> true);
            } catch (Throwable var6) {
               o $$7 = o.a(var6, "Exception in world tick");
               if (this.s == null) {
                  p $$8 = $$7.a("Affected level");
                  $$8.a("Problem", "Level is null!");
               } else {
                  this.s.a($$7);
               }

               throw new z($$7);
            }
         }

         $$0.b("animateTick");
         if (!this.aW && this.bq()) {
            this.s.b(this.t.dz(), this.t.dB(), this.t.dF());
         }

         $$0.b("particles");
         if (!this.aW && this.bq()) {
            this.g.b();
         }

         gka $$9 = this.L();
         if ($$9 != null && !this.aW) {
            $$9.b(ahb.a);
         }
      } else if (this.aT != null) {
         $$0.b("pendingConnection");
         this.aT.b();
      }

      $$0.b("keyboard");
      this.p.b();
      $$0.c();
   }

   private boolean bq() {
      return this.s == null || this.s.u().i();
   }

   private boolean br() {
      return !this.aU || this.aS != null && this.aS.r();
   }

   private void bs() {
      while (this.n.N.g()) {
         foh $$0 = this.n.aE();
         this.n.a(this.n.aE().c());
         if ($$0.a() != this.n.aE().a()) {
            this.j.a(this.n.aE().a() ? this.ao() : null);
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
            if (this.t.V_()) {
               this.m.g().a($$1);
            } else if (!this.t.fV() || this.z != null || !$$3 && !$$2) {
               this.t.gj().c($$1);
            } else {
               fzg.a(this, $$1, $$3, $$2);
            }
         }
      }

      while (this.n.L.g()) {
         if (!this.br()) {
            this.t.a(K, true);
            this.bt.c(K);
         } else {
            if (this.bl != null) {
               this.bl.e();
               this.bl = null;
            }

            this.a((fyb)(new gcv()));
         }
      }

      while (this.n.C.g()) {
         if (this.r.f()) {
            this.t.i();
         } else {
            this.aL.a();
            this.a((fyb)(new fzr(this.t)));
         }
      }

      while (this.n.R.g()) {
         this.a((fyb)(new fyl(this.t.j.p())));
      }

      while (this.n.D.g()) {
         if (!this.t.V_()) {
            this.L().b(new ahv(ahv.a.g, iu.c, ja.a));
         }
      }

      while (this.n.E.g()) {
         if (!this.t.V_() && this.t.a(fyb.s())) {
            this.t.a(buc.a);
         }
      }

      while (this.n.I.g()) {
         this.a("");
      }

      if (this.z == null && this.ba == null && this.n.K.g()) {
         this.a("/");
      }

      boolean $$4 = false;
      if (this.t.fz()) {
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

      if (this.n.F.e() && this.aV == 0 && !this.t.fz()) {
         this.bp();
      }

      this.d(this.z == null && !$$4 && this.n.G.e() && this.o.h());
   }

   public hoe u() {
      return this.aO;
   }

   public double v() {
      return this.br;
   }

   public gkm w() {
      return this.aP;
   }

   public gdp x() {
      return new gdp(this, this.ag);
   }

   public void a(eyv.c $$0, aun $$1, amf $$2, boolean $$3) {
      this.y();
      this.aa.set(null);
      Instant $$4 = Instant.now();

      try {
         $$0.a($$2.c().a(), $$2.d());
         amb $$5 = amb.a(this.ay, this.q);
         $$5.f().a(this);
         dyv.a($$5, this);
         avm.a(false);
         this.aS = MinecraftServer.a((Function<Thread, hni>)($$4x -> new hni($$4x, this, $$0, $$1, $$2, $$5, $$0xx -> {
               ase $$1xx = ase.b($$0xx + 0);
               this.aa.set($$1xx);
               return asd.a($$1xx, this.bj::add);
            })));
         this.aU = true;
         this.a(glf.a());
         this.aR.a(gpf.c.a, $$0.f(), $$2.d().e());
      } catch (Throwable var12) {
         o $$7 = o.a(var12, "Starting integrated server");
         p $$8 = $$7.a("Starting integrated server");
         $$8.a("Level ID", $$0.f());
         $$8.a("Level Name", () -> $$2.d().e());
         throw new z($$7);
      }

      while (this.aa.get() == null) {
         Thread.yield();
      }

      fxp $$9 = new fxp(this.aa.get());
      bqo $$10 = bqn.a();
      this.a((fyb)$$9);
      $$10.a("waitForServer");

      for (; !this.aS.ai() || this.ba != null; this.bj()) {
         $$9.e();
         this.c(false);

         try {
            Thread.sleep(16L);
         } catch (InterruptedException var11) {
         }
      }

      $$10.c();
      Duration $$11 = Duration.between($$4, Instant.now());
      SocketAddress $$12 = this.aS.ah().a();
      vr $$13 = vr.a($$12);
      $$13.a($$12.toString(), 0, new gjy($$13, this, null, null, $$3, $$11, $$0x -> {
      }, null));
      $$13.a(new ajl(this.X().c(), this.X().b()));
      this.aT = $$13;
   }

   public void a(gjz $$0, fxz.a $$1) {
      this.e(new fxz(() -> false, $$1));
      this.s = $$0;
      this.a($$0);
      if (!this.aU) {
         amb $$2 = amb.a(this.ay, this.q);
         $$2.f().a(this);
         dyv.a($$2, this);
         avm.a(false);
      }
   }

   public void y() {
      this.a(new fxy(true), false);
   }

   public void b(fyb $$0) {
      this.a($$0, false);
   }

   public void a(fyb $$0, boolean $$1) {
      gka $$2 = this.L();
      if ($$2 != null) {
         this.bz();
         $$2.h();
         if (!$$1) {
            this.z();
         }
      }

      this.aM.b();
      if (this.bo.e()) {
         this.bn();
      }

      hni $$3 = this.aS;
      this.aS = null;
      this.j.h();
      this.r = null;
      this.bt.b();
      this.bb = true;

      try {
         this.e($$0);
         if (this.s != null) {
            if ($$3 != null) {
               bqo $$4 = bqn.a();
               $$4.a("waitForServer");

               while (!$$3.I()) {
                  this.c(false);
               }

               $$4.c();
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

      dyv.a();
   }

   public void z() {
      this.am.i();
      this.bA();
   }

   public void c(fyb $$0) {
      gka $$1 = this.L();
      if ($$1 != null) {
         $$1.i();
      }

      if (this.bo.e()) {
         this.bn();
      }

      this.j.h();
      this.r = null;
      this.bt.b();
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

      dyv.a();
   }

   private void e(fyb $$0) {
      bqo $$1 = bqn.a();
      $$1.a("forcedTick");
      this.as.f();
      this.u = null;
      this.aT = null;
      this.a($$0);
      this.c(false);
      $$1.c();
   }

   public void d(fyb $$0) {
      try (bqt $$1 = bqn.a().d("forcedTick")) {
         this.a($$0);
         this.c(false);
      }
   }

   private void a(@Nullable gjz $$0) {
      this.f.a($$0);
      this.g.a($$0);
      this.aN.a($$0);
      this.d();
   }

   private UserProperties bt() {
      return this.aB.join();
   }

   public boolean C() {
      return this.D() && this.n.al().c();
   }

   public boolean D() {
      return this.E() && this.bt().flag(UserFlag.OPTIONAL_TELEMETRY_AVAILABLE);
   }

   public boolean E() {
      return ab.aU ? false : this.bt().flag(UserFlag.TELEMETRY_ENABLED);
   }

   public boolean F() {
      return this.ai && this.bt().flag(UserFlag.SERVERS_ALLOWED) && this.H() == null && !this.I();
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
      return this.J().a(false) ? this.aM.c($$0) : (this.t == null || !$$0.equals(this.t.cG())) && !$$0.equals(af.e);
   }

   public foz.a J() {
      if (this.n.n().c() == cqz.c) {
         return foz.a.b;
      } else if (!this.aj) {
         return foz.a.c;
      } else {
         return !this.bt().flag(UserFlag.CHAT_ALLOWED) ? foz.a.d : foz.a.a;
      }
   }

   public final boolean K() {
      return this.ah;
   }

   @Nullable
   public gka L() {
      return this.t == null ? null : this.t.j;
   }

   public static boolean M() {
      return !F.n.X;
   }

   public static boolean N() {
      return F.n.k().c().b() >= foq.b.b();
   }

   public static boolean O() {
      return !F.j.a() && F.n.k().c().b() >= foq.c.b();
   }

   public static boolean P() {
      return F.n.l().c();
   }

   private void bu() {
      if (this.w != null && this.w.d() != feo.a.a) {
         boolean $$0 = fyb.s();
         feo var10000 = this.w;
         Objects.requireNonNull(this.w);
         Object var2 = var10000;
         switch (var2) {
            case fem $$1:
               this.r.a($$1.b(), $$0);
               break;
            case fen $$2:
               this.r.a($$2.a(), $$0);
               break;
         }
      }
   }

   public o d(o $$0) {
      ad $$1 = $$0.f();

      try {
         a($$1, this, this.ao, this.ad, this.n);
         this.a($$0.a("Uptime"));
         if (this.s != null) {
            this.s.a($$0);
         }

         if (this.aS != null) {
            this.aS.b($$1);
         }

         this.bp.a($$0);
      } catch (Throwable var4) {
         G.error("Failed to collect details", var4);
      }

      return $$0;
   }

   public static void a(@Nullable foz $$0, @Nullable hkg $$1, String $$2, @Nullable fpd $$3, o $$4) {
      ad $$5 = $$4.f();
      a($$5, $$0, $$1, $$2, $$3);
   }

   private static String a(double $$0) {
      return String.format(Locale.ROOT, "%.3fs", $$0);
   }

   private void a(p $$0) {
      $$0.a("JVM uptime", () -> a((double)ManagementFactory.getRuntimeMXBean().getUptime() / 1000.0));
      $$0.a("Wall uptime", () -> a((double)(System.currentTimeMillis() - this.bz) / 1000.0));
      $$0.a("High-res time", () -> a((double)af.c() / 1000.0));
      $$0.a("Client ticks", () -> String.format(Locale.ROOT, "%d ticks / %.3fs", this.bA, (double)this.bA / 20.0));
   }

   private static ad a(ad $$0, @Nullable foz $$1, @Nullable hkg $$2, String $$3, @Nullable fpd $$4) {
      $$0.a("Launched Version", () -> $$3);
      String $$5 = bg();
      if ($$5 != null) {
         $$0.a("Launcher name", $$5);
      }

      $$0.a("Backend library", RenderSystem::getBackendDescription);
      $$0.a("Backend API", RenderSystem::getApiDescription);
      $$0.a("Window size", () -> $$1 != null ? $$1.S.k() + "x" + $$1.S.l() : "<not initialized>");
      $$0.a("GFLW Platform", fin::a);
      $$0.a("GL Caps", RenderSystem::getCapsString);
      $$0.a("GL debug messages", () -> fic.b() ? String.join("\n", fic.a()) : "<disabled>");
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
         $$0.a("Render Distance", $$4.aH() + "/" + $$4.e().c() + " chunks");
      }

      if ($$1 != null) {
         $$0.a("Resource Packs", () -> aun.a($$1.ad().g()));
      }

      if ($$2 != null) {
         $$0.a("Current Language", () -> $$2.a());
      }

      $$0.a("Locale", String.valueOf(Locale.getDefault()));
      $$0.a("System encoding", () -> System.getProperty("sun.jnu.encoding", "<not set>"));
      $$0.a("File encoding", () -> System.getProperty("file.encoding", "<not set>"));
      $$0.a("CPU", fid::b);
      return $$0;
   }

   public static foz Q() {
      return F;
   }

   public CompletableFuture<Void> R() {
      return this.a(this::l).thenCompose($$0 -> (CompletionStage<Void>)$$0);
   }

   public void a(glf $$0) {
      if (!this.bv.a($$0)) {
         this.bv = gli.a($$0, this.aA);
      }
   }

   @Nullable
   public gko S() {
      return x.a(this.L(), gka::x);
   }

   public boolean T() {
      return this.aU;
   }

   public boolean U() {
      return this.aU && this.aS != null;
   }

   @Nullable
   public hni V() {
      return this.aS;
   }

   public boolean W() {
      hni $$0 = this.V();
      return $$0 != null && !$$0.r();
   }

   public boolean b(UUID $$0) {
      return $$0.equals(this.X().b());
   }

   public fpl X() {
      return this.Z;
   }

   public GameProfile Y() {
      ProfileResult $$0 = this.N.join();
      return $$0 != null ? $$0.profile() : new GameProfile(this.Z.b(), this.Z.c());
   }

   public Proxy Z() {
      return this.af;
   }

   public hiz aa() {
      return this.O;
   }

   public gqr ab() {
      return this.P;
   }

   public avd ac() {
      return this.ak;
   }

   public aun ad() {
      return this.an;
   }

   public att ae() {
      return this.al;
   }

   public hlw af() {
      return this.am;
   }

   public Path ag() {
      return this.M;
   }

   public hkg ah() {
      return this.ao;
   }

   public Function<alg, hix> a(alg $$0) {
      return this.aD.c($$0)::a;
   }

   public boolean ai() {
      return this.aW;
   }

   public gpr aj() {
      return this.aw;
   }

   public hoa ak() {
      return this.as;
   }

   public hnu al() {
      awk $$0 = x.a(this.z, fyb::D);
      if ($$0 != null) {
         return new hnu($$0);
      } else if (this.t != null) {
         dja $$1 = this.t.dV();
         if ($$1.aj() == dja.k) {
            return this.m.j().b() ? new hnu(awl.d) : new hnu(awl.e);
         } else {
            je<dkd> $$2 = $$1.u(this.t.dv());
            float $$3 = $$2.a().p();
            if (!this.at.b(awl.f) && (!this.t.bn() || !$$2.a(axb.Z))) {
               if ($$1.aj() != dja.j && this.t.gk().d && this.t.gk().c) {
                  return new hnu(awl.b, $$3);
               } else {
                  Optional<bso<awk>> $$4 = $$2.a().o();
                  if ($$4.isPresent()) {
                     Optional<awk> $$5 = $$4.get().a($$1.A);
                     return new hnu($$5.orElse(null), $$3);
                  } else {
                     return new hnu(awl.g, $$3);
                  }
               }
            } else {
               return new hnu(awl.f, $$3);
            }
         }
      } else {
         return new hnu(awl.a);
      }
   }

   public MinecraftSessionService am() {
      return this.az;
   }

   public hjz an() {
      return this.aC;
   }

   @Nullable
   public bwf ao() {
      return this.u;
   }

   public void a(bwf $$0) {
      this.u = $$0;
      this.j.a($$0);
   }

   public boolean b(bwf $$0) {
      return $$0.co() || this.t != null && this.t.V_() && this.n.Q.e() && $$0.aq() == bwo.bS;
   }

   @Override
   protected Thread ay() {
      return this.bc;
   }

   @Override
   public Runnable f(Runnable $$0) {
      return $$0;
   }

   @Override
   protected boolean e(Runnable $$0) {
      return true;
   }

   public gre ap() {
      return this.aE;
   }

   public gwf aq() {
      return this.V;
   }

   public gsl ar() {
      return this.aN;
   }

   public gxf as() {
      return this.X;
   }

   public gpy at() {
      return this.Y;
   }

   public DataFixer au() {
      return this.Q;
   }

   public foo av() {
      return this.T;
   }

   public fqb aw() {
      return this.ap;
   }

   public boolean az() {
      return this.t != null && this.t.gA() || this.n.Y().c();
   }

   public fuu aA() {
      return this.aK;
   }

   public hpc aB() {
      return this.aL;
   }

   public boolean aC() {
      return this.bi;
   }

   public fou aD() {
      return this.ab;
   }

   public hll aE() {
      return this.aD;
   }

   public hjx aF() {
      return this.aF;
   }

   public hjw aG() {
      return this.aG;
   }

   public hjv aH() {
      return this.aH;
   }

   public hju aI() {
      return this.aI;
   }

   public frw aJ() {
      return this.aJ;
   }

   @Override
   public void a(boolean $$0) {
      this.bi = $$0;
   }

   public wy a(File $$0, int $$1, int $$2) {
      int $$3 = this.S.k();
      int $$4 = this.S.l();
      fhu $$5 = this.h();
      float $$6 = this.t.dN();
      float $$7 = this.t.dL();
      float $$8 = this.t.O;
      float $$9 = this.t.N;
      this.j.b(false);

      xm var12;
      try {
         this.j.c(true);
         this.S.a($$1);
         this.S.b($$2);
         $$5.a($$1, $$2);

         for (int $$10 = 0; $$10 < 6; $$10++) {
            switch ($$10) {
               case 0:
                  this.t.w($$7);
                  this.t.x(0.0F);
                  break;
               case 1:
                  this.t.w(($$7 + 90.0F) % 360.0F);
                  this.t.x(0.0F);
                  break;
               case 2:
                  this.t.w(($$7 + 180.0F) % 360.0F);
                  this.t.x(0.0F);
                  break;
               case 3:
                  this.t.w(($$7 - 90.0F) % 360.0F);
                  this.t.x(0.0F);
                  break;
               case 4:
                  this.t.w($$7);
                  this.t.x(-90.0F);
                  break;
               case 5:
               default:
                  this.t.w($$7);
                  this.t.x(90.0F);
            }

            this.t.N = this.t.dL();
            this.t.O = this.t.dN();
            $$5.a(true);
            this.j.a(foo.b);

            try {
               Thread.sleep(10L);
            } catch (InterruptedException var17) {
            }

            fph.a($$0, "panorama_" + $$10 + ".png", $$5, $$0x -> {
            });
         }

         wy $$11 = wy.b($$0.getName()).a(n.t).a($$1x -> $$1x.a(new ww.d($$0.getAbsoluteFile())));
         return wy.a("screenshot.success", $$11);
      } catch (Exception var18) {
         G.error("Couldn't save image", var18);
         var12 = wy.a("screenshot.failure", var18.getMessage());
      } finally {
         this.t.x($$6);
         this.t.w($$7);
         this.t.O = $$8;
         this.t.N = $$9;
         this.j.b(true);
         this.S.a($$3);
         this.S.b($$4);
         $$5.a($$3, $$4);
         this.j.c(false);
         this.h().a(true);
      }

      return var12;
   }

   private wy a(File $$0, int $$1, int $$2, int $$3, int $$4) {
      try {
         ByteBuffer $$5 = fid.a($$1 * $$2 * 3);
         fph $$6 = new fph($$0, $$3, $$4, $$2);
         float $$7 = (float)$$3 / (float)$$1;
         float $$8 = (float)$$4 / (float)$$2;
         float $$9 = $$7 > $$8 ? $$7 : $$8;

         for (int $$10 = ($$4 - 1) / $$2 * $$2; $$10 >= 0; $$10 -= $$2) {
            for (int $$11 = 0; $$11 < $$3; $$11 += $$1) {
               RenderSystem.setShaderTexture(0, hiw.d);
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
         fid.a($$5);
         wy $$15 = wy.b($$14.getName()).a(n.t).a($$1x -> $$1x.a(new ww.d($$14.getAbsoluteFile())));
         return wy.a("screenshot.success", $$15);
      } catch (Exception var15) {
         G.warn("Couldn't save screenshot", var15);
         return wy.a("screenshot.failure", var15.getMessage());
      }
   }

   @Nullable
   public ase aK() {
      return this.aa.get();
   }

   public hka aL() {
      return this.av;
   }

   @Nullable
   public fxv aM() {
      return this.ba;
   }

   public gct aN() {
      return this.aM;
   }

   public fin aO() {
      return this.S;
   }

   public fib aP() {
      return this.bh;
   }

   public fsr aQ() {
      return this.m.k();
   }

   public gqi aR() {
      return this.U;
   }

   public void a(int $$0) {
      this.aD.a($$0);
   }

   public giy aS() {
      return this.aD.e().get();
   }

   public boolean aT() {
      return this.bt().flag(UserFlag.PROFANITY_FILTER_ENABLED);
   }

   public void aU() {
      this.aM.a();
      this.w().a();
   }

   @Nullable
   public bab aV() {
      return bab.a(this.ay.getServicesKeySet(), ServicesKeyType.PROFILE_KEY);
   }

   public boolean aW() {
      return !this.ay.getServicesKeySet().keys(ServicesKeyType.PROFILE_KEY).isEmpty();
   }

   public fow aX() {
      return this.ac;
   }

   public void a(fow $$0) {
      this.ac = $$0;
   }

   public fop aY() {
      return this.bt;
   }

   public gkt aZ() {
      return this.bu;
   }

   public gli ba() {
      return this.bv;
   }

   public fly bb() {
      return this.aQ;
   }

   public gpf bc() {
      return this.aR;
   }

   public fol bd() {
      return this.bw;
   }

   public feg be() {
      return this.bx;
   }

   private float a(float $$0) {
      if (this.s != null) {
         bum $$1 = this.s.u();
         if ($$1.i()) {
            return Math.max($$0, $$1.g());
         }
      }

      return $$0;
   }

   public hfo bf() {
      return this.W;
   }

   @Nullable
   public static String bg() {
      return System.getProperty("minecraft.launcher.brand");
   }

   public static enum a {
      a(wx.a) {
         @Override
         public boolean a(boolean $$0) {
            return true;
         }
      },
      b(wy.c("chat.disabled.options").a(n.m)) {
         @Override
         public boolean a(boolean $$0) {
            return false;
         }
      },
      c(wy.c("chat.disabled.launcher").a(n.m)) {
         @Override
         public boolean a(boolean $$0) {
            return $$0;
         }
      },
      d(wy.a("chat.disabled.profile", wy.d(foz.F.n.I.h())).a(n.m)) {
         @Override
         public boolean a(boolean $$0) {
            return $$0;
         }
      };

      static final wy e = wy.c("chat.disabled.profile.moreInfo");
      private final wy f;

      a(final wy $$0) {
         this.f = $$0;
      }

      public wy a() {
         return this.f;
      }

      public abstract boolean a(boolean var1);
   }

   static record b(fjz a, ged.c b) {
   }
}
