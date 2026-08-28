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

public class fof extends bsr<Runnable> implements fhu {
   static fof F;
   private static final Logger G = LogUtils.getLogger();
   public static final boolean a = af.n() == af.a.d;
   private static final int H = 10;
   public static final ale b = ale.b("default");
   public static final ale c = ale.b("uniform");
   public static final ale d = ale.b("alt");
   private static final ale I = ale.b("regional_compliancies.json");
   private static final CompletableFuture<bas> J = CompletableFuture.completedFuture(bas.a);
   private static final ww K = ww.c("multiplayer.socialInteractions.not_available");
   public static final String e = "Please make sure you have up-to-date drivers (see aka.ms/mcdriver for instructions).";
   private final long L = Double.doubleToLongBits(Math.PI);
   private final Path M;
   private final CompletableFuture<ProfileResult> N;
   private final hib O;
   private final gpu P;
   private final DataFixer Q;
   private final gqd R;
   private final fht S;
   private final fnv.b T = new fnv.b(20.0F, 0L, this::a);
   private final gpl U;
   public final goy f;
   private final gvi V;
   private final heq W;
   private final gwi X;
   private final gpb Y;
   public final gmn g;
   private final fos Z;
   public final fra h;
   public final fra i;
   public final got j;
   public final gtf l;
   private final AtomicReference<asc> aa = new AtomicReference<>();
   public final frb m;
   public final foj n;
   private final foa ab;
   public final fog o;
   public final foe p;
   private foc ac = foc.a;
   public final File q;
   private final String ad;
   private final String ae;
   private final Proxy af;
   private final eyb ag;
   private final boolean ah;
   private final boolean ai;
   private final boolean aj;
   private final auy ak;
   private final atr al;
   private final hky am;
   private final aul an;
   private final hji ao;
   private final fpi ap;
   private final fha aq;
   @Nullable
   private final fgb ar;
   private final hnc as;
   private final hmx at;
   private final fug au;
   private final hjc av;
   private final gou aw;
   private final fok ax = new fok(I, fof::a);
   private final YggdrasilAuthenticationService ay;
   private final MinecraftSessionService az;
   private final UserApiService aA;
   private final CompletableFuture<UserProperties> aB;
   private final hjb aC;
   private final hkn aD;
   private final gqh aE;
   private final hiz aF;
   private final hiy aG;
   private final hix aH;
   private final hiw aI;
   private final frd aJ;
   private final fub aK;
   private final hoe aL;
   private final gca aM;
   private final gro aN;
   private final hng aO;
   private final gjq aP;
   private final flf aQ;
   private final goi aR;
   @Nullable
   public gjn r;
   @Nullable
   public gjd s;
   @Nullable
   public goa t;
   @Nullable
   private hmk aS;
   @Nullable
   private vp aT;
   private boolean aU;
   @Nullable
   public bwa u;
   @Nullable
   public bwa v;
   @Nullable
   public fdu w;
   private int aV;
   protected int x;
   private volatile boolean aW;
   private long aX = af.d();
   private long aY;
   private int aZ;
   public boolean y;
   @Nullable
   public fxi z;
   @Nullable
   private fxc ba;
   private boolean bb;
   Thread bc;
   private volatile boolean bd;
   @Nullable
   private Supplier<o> be;
   private static int bf;
   public String A = "";
   private long bg;
   private final fhh bh;
   public boolean B;
   public boolean C;
   public boolean D;
   public boolean E = true;
   private boolean bi;
   private final Queue<Runnable> bj = Queues.newConcurrentLinkedQueue();
   @Nullable
   private CompletableFuture<Void> bk;
   @Nullable
   private fuc bl;
   private int bm;
   private final bqc bn;
   private bsa bo = brz.a;
   private final fom bp = new fom();
   private long bq;
   private double br;
   @Nullable
   private fij.a bs;
   private final fnw bt;
   private final gjx bu;
   private gkm bv;
   private final fns bw;
   private final fdm bx;
   private boolean by;
   private final long bz;
   private long bA;

   public fof(final gdk $$0) {
      super("Client");
      F = this;
      this.bz = System.currentTimeMillis();
      this.q = $$0.c.a;
      File $$1 = $$0.c.c;
      this.M = $$0.c.b.toPath();
      this.ad = $$0.d.b;
      this.ae = $$0.d.c;
      Path $$2 = this.q.toPath();
      this.bx = eyb.a($$2.resolve("allowed_symlinks.txt"));
      hiq $$3 = new hiq($$0.c.a(), this.bx);
      this.am = new hky(this, $$2.resolve("downloads"), $$0.a);
      aun $$4 = new aug(this.M, atp.a, aum.b, this.bx);
      this.an = new aul($$3, this.am.a(), $$4);
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
      yb.a(fod::a);
      this.Q = bba.a();
      this.aK = new fub(this);
      this.bc = Thread.currentThread();
      this.n = new foj(this, this.q);
      boolean $$5 = this.n.ae;
      this.n.ae = false;
      this.n.az();
      RenderSystem.setShaderGlintAlpha(this.n.aq().c());
      this.bd = true;
      this.aL = new hoe(this, this.n);
      this.ab = new foa($$2, this.Q);
      G.info("Backend library: {}", RenderSystem.getBackendDescription());
      fhg $$6 = $$0.b;
      if (this.n.p > 0 && this.n.o > 0) {
         $$6 = $$0.b.a(this.n.o, this.n.p);
      }

      if (!$$5) {
         $$6 = $$6.a(false);
         this.n.k = null;
         G.warn("Detected unexpected shutdown during last game startup: resetting fullscreen mode");
      }

      af.c = RenderSystem.initBackendSystem();
      this.R = new gqd(this);
      this.S = this.R.a($$6, this.n.k, this.bh());
      this.a(true);
      this.S.a(new Runnable() {
         private boolean c;

         @Override
         public void run() {
            if (!this.c) {
               this.c = true;
               fhd.a($$0.c.a, fof.this.bc.threadId());
            }
         }
      });
      hnr.a.b(hnn.A);

      try {
         this.S.a(this.al, ab.b().g() ? fhk.a : fhk.b);
      } catch (IOException var14) {
         G.error("Couldn't set icon", var14);
      }

      this.o = new fog(this);
      this.o.a(this.S.h());
      this.p = new foe(this);
      this.p.a(this.S.h());
      RenderSystem.initRenderer(this.n.t, false);
      this.aq = new fgy(this.S.k(), this.S.l());
      this.aq.a(0.0F, 0.0F, 0.0F, 0.0F);
      this.aq.f();
      this.ak = new auy(atp.a);
      this.an.a();
      this.n.b(this.an);
      this.ao = new hji(this.n.ab, $$0x -> {
         if (this.t != null) {
            this.t.j.C();
         }
      });
      this.ak.a(this.ao);
      this.O = new hib(this.ak);
      this.ak.a(this.O);
      this.P = new gpu(this.O, this::a);
      this.ak.a(this.P);
      this.aC = new hjb($$1.toPath().resolve("skins"), this.az, this);
      this.ag = new eyb($$2.resolve("saves"), $$2.resolve("backups"), this.bx, this.Q);
      this.bw = new fns($$2);
      this.as = new hnc(this.n);
      this.ak.a(this.as);
      this.av = new hjc(this.Z);
      this.ak.a(this.av);
      this.at = new hmx(this);
      this.au = new fug(this.O);
      this.h = this.au.a();
      this.i = this.au.b();
      this.ak.a(this.au);
      this.g();
      this.ak.a(new hit());
      this.ak.a(new his());
      this.S.a("Startup");
      RenderSystem.setupDefaultState(0, 0, this.S.k(), this.S.l());
      this.S.a("Post startup");
      this.ap = fpi.a();
      this.aD = new hkn(this.O, this.ap, this.n.E().c());
      this.ak.a(this.aD);
      hke $$8 = new hke();
      this.ak.a($$8);
      this.W = new heq(this.aD);
      this.X = new gwi(this.W);
      this.aH = new hix(this.O);
      this.aI = new hiw(this.O);
      this.ak.a(this.aI);
      this.Y = new gpb(this.aI, this.aH);

      try {
         int $$9 = Runtime.getRuntime().availableProcessors();
         fis.a();
         this.U = new gpl($$9);
      } catch (OutOfMemoryError var13) {
         TinyFileDialogs.tinyfd_messageBox(
            "Minecraft",
            "Oh no! The game was unable to allocate memory off-heap while trying to start. You may try to free some memory by closing other applications on your computer, check that your system meets the minimum requirements, and try again. If the problem persists, please visit: "
               + ayf.k,
            "ok",
            "error",
            true
         );
         throw new gdl("Unable to allocate render buffers", var13);
      }

      this.aM = new gca(this, this.aA);
      this.aE = new gqh(this.aD.b(), this.aD.d(), this.ap);
      this.ak.a(this.aE);
      this.V = new gvi(this, this.O, this.W, this.X, this.Y, this.aE, this.h, this.n, this.aD.e(), $$8);
      this.ak.a(this.V);
      this.aN = new gro(this.h, this.aD.e(), this.aE, this.W, this.X, this.V);
      this.ak.a(this.aN);
      this.g = new gmn(this.s, this.O);
      this.ak.a(this.g);
      this.aF = new hiz(this.O);
      this.ak.a(this.aF);
      this.aG = new hiy(this.O);
      this.ak.a(this.aG);
      this.aJ = new frd(this.O);
      this.ak.a(this.aJ);
      this.j = new got(this, this.V.d(), this.ak, this.U);
      this.f = new goy(this, this.V, this.aN, this.U);
      this.ak.a(this.f);
      this.ak.a(this.f.z());
      this.aw = new gou();
      this.ak.a(this.aw);
      this.ak.a(this.ax);
      this.m = new frb(this);
      this.l = new gtf(this);
      fjg $$11 = fjg.a(this);
      this.aQ = new flf($$11);
      RenderSystem.setErrorCallback(this::a);
      if (this.aq.c != this.S.k() || this.aq.d != this.S.l()) {
         StringBuilder $$12 = new StringBuilder(
            "Recovering from unsupported resolution ("
               + this.S.k()
               + "x"
               + this.S.l()
               + ").\nPlease make sure you have up-to-date drivers (see aka.ms/mcdriver for instructions)."
         );
         if (fhi.b()) {
            $$12.append("\n\nReported GL debug messages:\n").append(String.join("\n", fhi.a()));
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
      this.aO = new hng(this, this.aA, this.Z);
      this.aP = gjq.a(this.aA, this.Z, $$2);
      this.bt = new fnw(this);
      this.bt.a(this.n.av().c() != foh.a);
      this.bu = new gjx(this);
      this.bu.a(this.n.C().c());
      this.bv = gkm.a(gkj.a(), this.aA);
      fxk.a(this.O);
      fwy.a(this.O);
      this.a((fxi)(new fwt(ww.c("gui.loadingMinecraft"))));
      List<atn> $$13 = this.an.h();
      this.bp.a(fom.b.a, $$13);
      auw $$14 = this.ak.a(af.h().a("resourceLoad"), this, J, $$13);
      hnr.a.a(hnn.C);
      fof.b $$15 = new fof.b($$11, $$0.e);
      this.a((fxc)(new fwy(this, $$14, $$1x -> af.a($$1x, $$1xx -> this.a($$1xx, $$15), () -> {
            if (ab.aU) {
               this.bk();
            }

            this.bp.a();
            this.a($$15);
         }), false)));
      this.aR = goi.a($$0.e.b());
      this.bh = new fhh(this.n, this);
      this.bn = new bqc(af.c, () -> this.bm, this.bh::c);
      if (TracyClient.isAvailable() && $$0.d.f) {
         this.ar = new fgb();
      } else {
         this.ar = null;
      }
   }

   private void a(@Nullable fof.b $$0) {
      if (!this.by) {
         this.by = true;
         this.b($$0);
      }
   }

   private void b(@Nullable fof.b $$0) {
      Runnable $$1 = this.c($$0);
      hnr.a.b(hnn.C);
      hnr.a.b(hnn.z);
      hnr.a.a(this.aO.a());
      $$1.run();
      this.n.ae = true;
      this.n.az();
   }

   public boolean c() {
      return this.by;
   }

   private Runnable c(@Nullable fof.b $$0) {
      List<Function<Runnable, fxi>> $$1 = new ArrayList<>();
      this.a($$1);
      Runnable $$2 = () -> {
         if ($$0 != null && $$0.b().a()) {
            goh.a(this, $$0.b(), $$0.a());
         } else {
            this.a((fxi)(new fxk(true)));
         }
      };

      for (Function<Runnable, fxi> $$3 : Lists.reverse($$1)) {
         fxi $$4 = $$3.apply($$2);
         $$2 = () -> this.a($$4);
      }

      return $$2;
   }

   private void a(List<Function<Runnable, fxi>> $$0) {
      if (this.n.ac) {
         $$0.add($$0x -> new fwa(this.n, $$0x));
      }

      BanDetails $$1 = this.H();
      if ($$1 != null) {
         $$0.add($$1x -> fwd.a($$1xx -> {
               if ($$1xx) {
                  af.n().a(ayf.n);
               }

               $$1x.run();
            }, $$1));
      }

      ProfileResult $$2 = this.N.join();
      if ($$2 != null) {
         GameProfile $$3 = $$2.profile();
         Set<ProfileActionType> $$4 = $$2.actions();
         if ($$4.contains(ProfileActionType.FORCED_NAME_CHANGE)) {
            $$0.add($$1x -> fwd.a($$3.getName(), $$1x));
         }

         if ($$4.contains(ProfileActionType.USING_BANNED_SKIN)) {
            $$0.add(fwd::a);
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
      gje $$1 = this.L();
      if ($$1 != null && $$1.k().i()) {
         $$0.append(" - ");
         gjs $$2 = this.S();
         if (this.aS != null && !this.aS.r()) {
            $$0.append(hjg.a("title.singleplayer"));
         } else if ($$2 != null && $$2.e()) {
            $$0.append(hjg.a("title.multiplayer.realms"));
         } else if (this.aS == null && ($$2 == null || !$$2.d())) {
            $$0.append(hjg.a("title.multiplayer.other"));
         } else {
            $$0.append(hjg.a("title.multiplayer.lan"));
         }
      }

      return $$0.toString();
   }

   private UserApiService a(YggdrasilAuthenticationService $$0, gdk $$1) {
      return $$1.a.a.g() != fos.a.c ? UserApiService.OFFLINE : $$0.createUserApiService($$1.a.a.d());
   }

   public static azj e() {
      return azj.a("vanilla", ClientBrandRetriever::getClientModName, "Client", fof.class);
   }

   private void a(Throwable $$0, @Nullable fof.b $$1) {
      if (this.an.e().size() > 1) {
         this.a($$0, null, $$1);
      } else {
         af.a($$0);
      }
   }

   public void a(Throwable $$0, @Nullable ww $$1, @Nullable fof.b $$2) {
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

      this.a((fxi)(new fxk()));
      this.a(null);
   }

   private void a(@Nullable ww $$0) {
      fub $$1 = this.aA();
      ftz.b($$1, ftz.a.c, ww.c("resourcePack.load_fail"), $$0);
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
         this.a($$0, ww.c("resourcePack.runtime_failure"), null);
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
               bqm $$2 = bqm.a("Renderer");
               boolean $$3 = this.aQ().e();

               try (bqi.a $$4 = bqi.a(this.a($$3, $$2))) {
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
               this.a((fxi)(new fxb()));
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

   public fha h() {
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
      azi.b();
      o $$1 = this.d($$0);
      this.bl();
      a(this, this.q, $$1);
   }

   public static int a(File $$0, o $$1) {
      Path $$2 = $$0.toPath().resolve("crash-reports");
      Path $$3 = $$2.resolve("crash-" + af.f() + "-client.txt");
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

   public static void a(@Nullable fof $$0, File $$1, o $$2) {
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

   private CompletableFuture<Void> a(boolean $$0, @Nullable fof.b $$1) {
      if (this.bk != null) {
         return this.bk;
      } else {
         CompletableFuture<Void> $$2 = new CompletableFuture<>();
         if (!$$0 && this.ba instanceof fwy) {
            this.bk = $$2;
            return $$2;
         } else {
            this.an.a();
            List<atn> $$3 = this.an.h();
            if (!$$0) {
               this.bp.a(fom.b.b, $$3);
            }

            this.a((fxc)(new fwy(this, this.ak.a(af.h().a("resourceLoad"), this, J, $$3), $$3x -> af.a($$3x, $$2xx -> {
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
      gqg $$1 = this.ap().a();
      hjz $$2 = $$1.a().a();

      for (dlu $$3 : mf.e) {
         UnmodifiableIterator $$7 = $$3.l().a().iterator();

         while ($$7.hasNext()) {
            dzo $$4 = (dzo)$$7.next();
            if ($$4.o() == dsf.b) {
               hjz $$5 = $$1.b($$4);
               if ($$5 == $$2) {
                  G.debug("Missing model for: {}", $$4);
                  $$0 = true;
               }
            }
         }
      }

      hhz $$6 = $$2.d();

      for (dlu $$7 : mf.e) {
         UnmodifiableIterator var15 = $$7.l().a().iterator();

         while (var15.hasNext()) {
            dzo $$8 = (dzo)var15.next();
            hhz $$9 = $$1.a($$8);
            if (!$$8.l() && $$9 == $$6) {
               G.debug("Missing particle icon for: {}", $$8);
            }
         }
      }

      mf.g.c().forEach($$0x -> {
         cyo $$1x = (cyo)$$0x.a();
         String $$2x = $$1x.j();
         String $$3x = ww.c($$2x).getString();
         if ($$3x.toLowerCase(Locale.ROOT).equals($$1x.j())) {
            G.debug("Missing translation for: {} {} {}", new Object[]{$$0x.h().a(), $$2x, $$1x});
         }
      });
      $$0 |= fwz.a();
      $$0 |= gvl.a();
      if ($$0) {
         throw new IllegalStateException("Your game data is foobar, fix the errors above!");
      }
   }

   public eyb m() {
      return this.ag;
   }

   private void a(String $$0) {
      fof.a $$1 = this.J();
      if (!$$1.a(this.T())) {
         if (this.m.b()) {
            this.m.b(false);
            this.a((fxi)(new fwf($$0x -> {
               if ($$0x) {
                  af.n().a(ayf.g);
               }

               this.a(null);
            }, fof.a.e, ayf.g, true)));
         } else {
            ww $$2 = $$1.a();
            this.m.a($$2, false);
            this.bt.c($$2);
            this.m.b($$1 == fof.a.d);
         }
      } else {
         this.a((fxi)(new fwe($$0)));
      }
   }

   public void a(@Nullable fxi $$0) {
      if (ab.aU && Thread.currentThread() != this.bc) {
         G.error("setScreen called from non-game thread");
      }

      if (this.z != null) {
         this.z.aE_();
      } else {
         this.a(foc.a);
      }

      if ($$0 == null && this.bb) {
         throw new IllegalStateException("Trying to return to in-game GUI during disconnection");
      } else {
         if ($$0 == null && this.s == null) {
            $$0 = new fxk();
         } else if ($$0 == null && this.t.eG()) {
            if (this.t.n()) {
               $$0 = new fwm(null, this.s.k().l());
            } else {
               this.t.gf();
            }
         }

         this.z = $$0;
         if (this.z != null) {
            this.z.aF_();
         }

         fim.a();
         if ($$0 != null) {
            this.o.j();
            fod.b();
            $$0.b(this, this.S.o(), this.S.p());
            this.y = false;
         } else {
            this.as.i();
            this.o.i();
         }

         this.d();
      }
   }

   public void a(@Nullable fxc $$0) {
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
            this.z.aE_();
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

         fus.b();
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

      if (this.bk != null && !(this.ba instanceof fwy)) {
         CompletableFuture<Void> $$1 = this.bk;
         this.bk = null;
         this.l().thenRun(() -> $$1.complete(null));
      }

      Runnable $$2;
      while (($$2 = this.bj.poll()) != null) {
         $$2.run();
      }

      int $$3 = this.T.a(af.c(), $$0);
      bqj $$4 = bqi.a();
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
            fij.a().ifPresent(fij::b);
         }
      }

      RenderSystem.clear(16640);
      this.aq.a(true);
      RenderSystem.setShaderFog(gor.a);
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
         fij.a().ifPresent($$0x -> this.bs = $$0x.c());
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
            this.n.j().c() == fnr.a ? "" : (this.n.j().c() == fnr.b ? " fast-clouds" : " fancy-clouds"),
            this.n.G().c(),
            $$12
         );
         this.aY += 1000L;
         this.aZ = 0;
      }

      $$4.c();
   }

   private bqj a(boolean $$0, @Nullable bqm $$1) {
      if (!$$0) {
         this.bn.b();
         if (!this.bo.e() && $$1 == null) {
            return bqf.a;
         }
      }

      bqj $$2;
      if ($$0) {
         if (!this.bn.a()) {
            this.bm = 0;
            this.bn.c();
         }

         this.bm++;
         $$2 = this.bn.d();
      } else {
         $$2 = bqf.a;
      }

      if (this.bo.e()) {
         $$2 = bqj.a($$2, this.bo.f());
      }

      return bqm.a($$2, $$1);
   }

   private void b(boolean $$0, @Nullable bqm $$1) {
      if ($$1 != null) {
         $$1.b();
      }

      ftj $$2 = this.aQ().o();
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

      fha $$1 = this.h();
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
      azi.b();

      try {
         if (this.aU && this.aS != null) {
            this.aS.a(true);
         }

         this.b(new fwt(ww.c("menu.savingLevel")));
      } catch (Throwable var2) {
      }

      System.gc();
   }

   public boolean b(Consumer<ww> $$0) {
      if (this.bo.e()) {
         this.bm();
         return false;
      } else {
         Consumer<bqh> $$1 = $$1x -> {
            if ($$1x != bqd.a) {
               int $$2x = $$1x.f();
               double $$3x = (double)$$1x.g() / (double)bao.a;
               this.execute(
                  () -> $$0.accept(
                        ww.a("commands.debug.stopped", String.format(Locale.ROOT, "%.2f", $$3x), $$2x, String.format(Locale.ROOT, "%.2f", (double)$$2x / $$3x))
                     )
               );
            }
         };
         Consumer<Path> $$2 = $$1x -> {
            ww $$2x = ww.b($$1x.toString()).a(n.t).a($$1xx -> $$1xx.a(new wu.d($$1x.getParent())));
            this.execute(() -> $$0.accept(ww.a("debug.profiling.stop", $$2x)));
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

         this.bo = bry.a(new gof(af.c, this.f), af.c, af.i(), new bse("client"), $$1x -> {
            this.bo = brz.a;
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
         gjs $$3 = this.S();
         $$2 = $$3 != null ? $$3.a : "unknown";
      }

      Path $$7;
      try {
         String $$5 = String.format(Locale.ROOT, "%s-%s-%s", af.f(), $$2, ab.b().b());
         String $$6 = v.a(bse.a, $$5, ".zip");
         $$7 = bse.a.resolve($$6);
      } catch (IOException var21) {
         throw new UncheckedIOException(var21);
      }

      try (ayv $$10 = new ayv($$7)) {
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
            this.a((fxi)(new fxd(!$$0)));
            this.as.e();
         } else {
            this.a((fxi)(new fxd(true)));
         }
      }
   }

   private void d(boolean $$0) {
      if (!$$0) {
         this.x = 0;
      }

      if (this.x <= 0 && !this.t.fy()) {
         if ($$0 && this.w != null && this.w.d() == fdu.a.b) {
            fds $$1 = (fds)this.w;
            iu $$2 = $$1.b();
            if (!this.s.a_($$2).l()) {
               ja $$3 = $$1.c();
               if (this.r.b($$2, $$3)) {
                  this.g.a($$2, $$3);
                  this.t.a(btx.a);
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
         cys $$0 = this.t.b(btx.a);
         if (!$$0.a(this.s.K())) {
            return false;
         } else {
            boolean $$1 = false;
            switch (this.w.d()) {
               case c:
                  this.r.a(this.t, ((fdt)this.w).a());
                  break;
               case b:
                  fds $$2 = (fds)this.w;
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

                  this.t.gD();
            }

            this.t.a(btx.a);
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

            for (btx $$0 : btx.values()) {
               cys $$1 = this.t.b($$0);
               if (!$$1.a(this.s.K())) {
                  return;
               }

               if (this.w != null) {
                  switch (this.w.d()) {
                     case c:
                        fdt $$2 = (fdt)this.w;
                        bwa $$3 = $$2.a();
                        if (!this.s.A_().a($$3.dv())) {
                           return;
                        }

                        bty $$4 = this.r.a(this.t, $$3, $$2, $$0);
                        if (!$$4.a()) {
                           $$4 = this.r.a(this.t, $$3, $$0);
                        }

                        if ($$4 instanceof bty.d $$5) {
                           if ($$5.e() == bty.e.b) {
                              this.t.a($$0);
                           }

                           return;
                        }
                        break;
                     case b:
                        fds $$6 = (fds)this.w;
                        int $$7 = $$1.M();
                        bty $$8 = this.r.a(this.t, $$0, $$6);
                        if ($$8 instanceof bty.d $$9) {
                           if ($$9.e() == bty.e.b) {
                              this.t.a($$0);
                              if (!$$1.f() && ($$1.M() != $$7 || this.t.fU())) {
                                 this.j.c.a($$0);
                              }
                           }

                           return;
                        }

                        if ($$8 instanceof bty.a) {
                           return;
                        }
                  }
               }

               if (!$$1.f() && this.r.a(this.t, $$0) instanceof bty.d $$11) {
                  if ($$11.e() == bty.e.b) {
                     this.t.a($$0);
                  }

                  this.j.c.a($$0);
                  return;
               }
            }
         }
      }
   }

   public hmx s() {
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

      bqj $$0 = bqi.a();
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
         if (this.z instanceof fwv $$1 && !this.t.fQ()) {
            $$1.m();
         }
      } else if (this.t.eG() && !(this.z instanceof fwm)) {
         this.a(null);
      } else if (this.t.fQ() && this.s != null) {
         this.a((fxi)(new fwv()));
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
               ww $$4 = ww.c("tutorial.socialInteractions.title");
               ww $$5 = ww.a("tutorial.socialInteractions.description", hoe.a("socialInteractions"));
               this.bl = new fuc(this.h, fuc.a.f, $$4, $$5, true, 8000);
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

         gje $$9 = this.L();
         if ($$9 != null && !this.aW) {
            $$9.b(agz.a);
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
         fno $$0 = this.n.aE();
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
            if (this.t.U_()) {
               this.m.g().a($$1);
            } else if (!this.t.fU() || this.z != null || !$$3 && !$$2) {
               this.t.gi().j = $$1;
            } else {
               fyn.a(this, $$1, $$3, $$2);
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

            this.a((fxi)(new gcc()));
         }
      }

      while (this.n.C.g()) {
         if (this.r.f()) {
            this.t.i();
         } else {
            this.aL.a();
            this.a((fxi)(new fyy(this.t)));
         }
      }

      while (this.n.R.g()) {
         this.a((fxi)(new fxs(this.t.j.p())));
      }

      while (this.n.D.g()) {
         if (!this.t.U_()) {
            this.L().b(new aht(aht.a.g, iu.c, ja.a));
         }
      }

      while (this.n.E.g()) {
         if (!this.t.U_() && this.t.a(fxi.s())) {
            this.t.a(btx.a);
         }
      }

      while (this.n.I.g()) {
         this.a("");
      }

      if (this.z == null && this.ba == null && this.n.K.g()) {
         this.a("/");
      }

      boolean $$4 = false;
      if (this.t.fy()) {
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

      if (this.n.F.e() && this.aV == 0 && !this.t.fy()) {
         this.bp();
      }

      this.d(this.z == null && !$$4 && this.n.G.e() && this.o.h());
   }

   public hng u() {
      return this.aO;
   }

   public double v() {
      return this.br;
   }

   public gjq w() {
      return this.aP;
   }

   public gcw x() {
      return new gcw(this, this.ag);
   }

   public void a(eyb.c $$0, aul $$1, amd $$2, boolean $$3) {
      this.y();
      this.aa.set(null);
      Instant $$4 = Instant.now();

      try {
         $$0.a($$2.c().a(), $$2.d());
         alz $$5 = alz.a(this.ay, this.q);
         $$5.f().a(this);
         dyd.a($$5, this);
         avk.a(false);
         this.aS = MinecraftServer.a((Function<Thread, hmk>)($$4x -> new hmk($$4x, this, $$0, $$1, $$2, $$5, $$0xx -> {
               asc $$1xx = asc.b($$0xx + 0);
               this.aa.set($$1xx);
               return asb.a($$1xx, this.bj::add);
            })));
         this.aU = true;
         this.a(gkj.a());
         this.aR.a(goi.c.a, $$0.f(), $$2.d().e());
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

      fww $$9 = new fww(this.aa.get());
      bqj $$10 = bqi.a();
      this.a((fxi)$$9);
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
      vp $$13 = vp.a($$12);
      $$13.a($$12.toString(), 0, new gjc($$13, this, null, null, $$3, $$11, $$0x -> {
      }, null));
      $$13.a(new ajj(this.X().c(), this.X().b()));
      this.aT = $$13;
   }

   public void a(gjd $$0, fxg.a $$1) {
      this.e(new fxg(() -> false, $$1));
      this.s = $$0;
      this.a($$0);
      if (!this.aU) {
         alz $$2 = alz.a(this.ay, this.q);
         $$2.f().a(this);
         dyd.a($$2, this);
         avk.a(false);
      }
   }

   public void y() {
      this.a(new fxf(true), false);
   }

   public void b(fxi $$0) {
      this.a($$0, false);
   }

   public void a(fxi $$0, boolean $$1) {
      gje $$2 = this.L();
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

      hmk $$3 = this.aS;
      this.aS = null;
      this.j.h();
      this.r = null;
      this.bt.b();
      this.bb = true;

      try {
         this.e($$0);
         if (this.s != null) {
            if ($$3 != null) {
               bqj $$4 = bqi.a();
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

      dyd.a();
   }

   public void z() {
      this.am.i();
      this.bA();
   }

   public void c(fxi $$0) {
      gje $$1 = this.L();
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

      dyd.a();
   }

   private void e(fxi $$0) {
      bqj $$1 = bqi.a();
      $$1.a("forcedTick");
      this.as.f();
      this.u = null;
      this.aT = null;
      this.a($$0);
      this.c(false);
      $$1.c();
   }

   public void d(fxi $$0) {
      try (bqo $$1 = bqi.a().d("forcedTick")) {
         this.a($$0);
         this.c(false);
      }
   }

   private void a(@Nullable gjd $$0) {
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

   public fof.a J() {
      if (this.n.n().c() == cqp.c) {
         return fof.a.b;
      } else if (!this.aj) {
         return fof.a.c;
      } else {
         return !this.bt().flag(UserFlag.CHAT_ALLOWED) ? fof.a.d : fof.a.a;
      }
   }

   public final boolean K() {
      return this.ah;
   }

   @Nullable
   public gje L() {
      return this.t == null ? null : this.t.j;
   }

   public static boolean M() {
      return !F.n.X;
   }

   public static boolean N() {
      return F.n.k().c().b() >= fnx.b.b();
   }

   public static boolean O() {
      return !F.j.a() && F.n.k().c().b() >= fnx.c.b();
   }

   public static boolean P() {
      return F.n.l().c();
   }

   private void bu() {
      if (this.w != null && this.w.d() != fdu.a.a) {
         boolean $$0 = fxi.s();
         fdu var10000 = this.w;
         Objects.requireNonNull(this.w);
         Object var2 = var10000;
         switch (var2) {
            case fds $$1:
               this.r.a($$1.b(), $$0);
               break;
            case fdt $$2:
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

   public static void a(@Nullable fof $$0, @Nullable hji $$1, String $$2, @Nullable foj $$3, o $$4) {
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

   private static ad a(ad $$0, @Nullable fof $$1, @Nullable hji $$2, String $$3, @Nullable foj $$4) {
      $$0.a("Launched Version", () -> $$3);
      String $$5 = bg();
      if ($$5 != null) {
         $$0.a("Launcher name", $$5);
      }

      $$0.a("Backend library", RenderSystem::getBackendDescription);
      $$0.a("Backend API", RenderSystem::getApiDescription);
      $$0.a("Window size", () -> $$1 != null ? $$1.S.k() + "x" + $$1.S.l() : "<not initialized>");
      $$0.a("GFLW Platform", fht::a);
      $$0.a("GL Caps", RenderSystem::getCapsString);
      $$0.a("GL debug messages", () -> fhi.b() ? String.join("\n", fhi.a()) : "<disabled>");
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
         $$0.a("Resource Packs", () -> aul.a($$1.ad().g()));
      }

      if ($$2 != null) {
         $$0.a("Current Language", () -> $$2.a());
      }

      $$0.a("Locale", String.valueOf(Locale.getDefault()));
      $$0.a("System encoding", () -> System.getProperty("sun.jnu.encoding", "<not set>"));
      $$0.a("File encoding", () -> System.getProperty("file.encoding", "<not set>"));
      $$0.a("CPU", fhj::b);
      return $$0;
   }

   public static fof Q() {
      return F;
   }

   public CompletableFuture<Void> R() {
      return this.a(this::l).thenCompose($$0 -> (CompletionStage<Void>)$$0);
   }

   public void a(gkj $$0) {
      if (!this.bv.a($$0)) {
         this.bv = gkm.a($$0, this.aA);
      }
   }

   @Nullable
   public gjs S() {
      return x.a(this.L(), gje::x);
   }

   public boolean T() {
      return this.aU;
   }

   public boolean U() {
      return this.aU && this.aS != null;
   }

   @Nullable
   public hmk V() {
      return this.aS;
   }

   public boolean W() {
      hmk $$0 = this.V();
      return $$0 != null && !$$0.r();
   }

   public boolean b(UUID $$0) {
      return $$0.equals(this.X().b());
   }

   public fos X() {
      return this.Z;
   }

   public GameProfile Y() {
      ProfileResult $$0 = this.N.join();
      return $$0 != null ? $$0.profile() : new GameProfile(this.Z.b(), this.Z.c());
   }

   public Proxy Z() {
      return this.af;
   }

   public hib aa() {
      return this.O;
   }

   public gpu ab() {
      return this.P;
   }

   public avb ac() {
      return this.ak;
   }

   public aul ad() {
      return this.an;
   }

   public atr ae() {
      return this.al;
   }

   public hky af() {
      return this.am;
   }

   public Path ag() {
      return this.M;
   }

   public hji ah() {
      return this.ao;
   }

   public Function<ale, hhz> a(ale $$0) {
      return this.aD.c($$0)::a;
   }

   public boolean ai() {
      return this.aW;
   }

   public gou aj() {
      return this.aw;
   }

   public hnc ak() {
      return this.as;
   }

   public hmw al() {
      awi $$0 = x.a(this.z, fxi::D);
      if ($$0 != null) {
         return new hmw($$0);
      } else if (this.t != null) {
         dip $$1 = this.t.dV();
         if ($$1.aj() == dip.k) {
            return this.m.j().b() ? new hmw(awj.d) : new hmw(awj.e);
         } else {
            je<djs> $$2 = $$1.u(this.t.dv());
            float $$3 = $$2.a().p();
            if (!this.at.b(awj.f) && (!this.t.bn() || !$$2.a(awz.Z))) {
               if ($$1.aj() != dip.j && this.t.gj().d && this.t.gj().c) {
                  return new hmw(awj.b, $$3);
               } else {
                  Optional<bsj<awi>> $$4 = $$2.a().o();
                  if ($$4.isPresent()) {
                     Optional<awi> $$5 = $$4.get().a($$1.A);
                     return new hmw($$5.orElse(null), $$3);
                  } else {
                     return new hmw(awj.g, $$3);
                  }
               }
            } else {
               return new hmw(awj.f, $$3);
            }
         }
      } else {
         return new hmw(awj.a);
      }
   }

   public MinecraftSessionService am() {
      return this.az;
   }

   public hjb an() {
      return this.aC;
   }

   @Nullable
   public bwa ao() {
      return this.u;
   }

   public void a(bwa $$0) {
      this.u = $$0;
      this.j.a($$0);
   }

   public boolean b(bwa $$0) {
      return $$0.co() || this.t != null && this.t.U_() && this.n.Q.e() && $$0.aq() == bwj.bS;
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

   public gqh ap() {
      return this.aE;
   }

   public gvi aq() {
      return this.V;
   }

   public gro ar() {
      return this.aN;
   }

   public gwi as() {
      return this.X;
   }

   public gpb at() {
      return this.Y;
   }

   public DataFixer au() {
      return this.Q;
   }

   public fnv av() {
      return this.T;
   }

   public fpi aw() {
      return this.ap;
   }

   public boolean az() {
      return this.t != null && this.t.gz() || this.n.Y().c();
   }

   public fub aA() {
      return this.aK;
   }

   public hoe aB() {
      return this.aL;
   }

   public boolean aC() {
      return this.bi;
   }

   public foa aD() {
      return this.ab;
   }

   public hkn aE() {
      return this.aD;
   }

   public hiz aF() {
      return this.aF;
   }

   public hiy aG() {
      return this.aG;
   }

   public hix aH() {
      return this.aH;
   }

   public hiw aI() {
      return this.aI;
   }

   public frd aJ() {
      return this.aJ;
   }

   @Override
   public void a(boolean $$0) {
      this.bi = $$0;
   }

   public ww a(File $$0, int $$1, int $$2) {
      int $$3 = this.S.k();
      int $$4 = this.S.l();
      fha $$5 = this.h();
      float $$6 = this.t.dN();
      float $$7 = this.t.dL();
      float $$8 = this.t.O;
      float $$9 = this.t.N;
      this.j.b(false);

      xk var12;
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
            this.j.a(fnv.b);

            try {
               Thread.sleep(10L);
            } catch (InterruptedException var17) {
            }

            fon.a($$0, "panorama_" + $$10 + ".png", $$5, $$0x -> {
            });
         }

         ww $$11 = ww.b($$0.getName()).a(n.t).a($$1x -> $$1x.a(new wu.d($$0.getAbsoluteFile())));
         return ww.a("screenshot.success", $$11);
      } catch (Exception var18) {
         G.error("Couldn't save image", var18);
         var12 = ww.a("screenshot.failure", var18.getMessage());
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

   private ww a(File $$0, int $$1, int $$2, int $$3, int $$4) {
      try {
         ByteBuffer $$5 = fhj.a($$1 * $$2 * 3);
         fon $$6 = new fon($$0, $$3, $$4, $$2);
         float $$7 = (float)$$3 / (float)$$1;
         float $$8 = (float)$$4 / (float)$$2;
         float $$9 = $$7 > $$8 ? $$7 : $$8;

         for (int $$10 = ($$4 - 1) / $$2 * $$2; $$10 >= 0; $$10 -= $$2) {
            for (int $$11 = 0; $$11 < $$3; $$11 += $$1) {
               RenderSystem.setShaderTexture(0, hhy.d);
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
         fhj.a($$5);
         ww $$15 = ww.b($$14.getName()).a(n.t).a($$1x -> $$1x.a(new wu.d($$14.getAbsoluteFile())));
         return ww.a("screenshot.success", $$15);
      } catch (Exception var15) {
         G.warn("Couldn't save screenshot", var15);
         return ww.a("screenshot.failure", var15.getMessage());
      }
   }

   @Nullable
   public asc aK() {
      return this.aa.get();
   }

   public hjc aL() {
      return this.av;
   }

   @Nullable
   public fxc aM() {
      return this.ba;
   }

   public gca aN() {
      return this.aM;
   }

   public fht aO() {
      return this.S;
   }

   public fhh aP() {
      return this.bh;
   }

   public fry aQ() {
      return this.m.k();
   }

   public gpl aR() {
      return this.U;
   }

   public void a(int $$0) {
      this.aD.a($$0);
   }

   public gic aS() {
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
   public azz aV() {
      return azz.a(this.ay.getServicesKeySet(), ServicesKeyType.PROFILE_KEY);
   }

   public boolean aW() {
      return !this.ay.getServicesKeySet().keys(ServicesKeyType.PROFILE_KEY).isEmpty();
   }

   public foc aX() {
      return this.ac;
   }

   public void a(foc $$0) {
      this.ac = $$0;
   }

   public fnw aY() {
      return this.bt;
   }

   public gjx aZ() {
      return this.bu;
   }

   public gkm ba() {
      return this.bv;
   }

   public flf bb() {
      return this.aQ;
   }

   public goi bc() {
      return this.aR;
   }

   public fns bd() {
      return this.bw;
   }

   public fdm be() {
      return this.bx;
   }

   private float a(float $$0) {
      if (this.s != null) {
         buh $$1 = this.s.u();
         if ($$1.i()) {
            return Math.max($$0, $$1.g());
         }
      }

      return $$0;
   }

   public heq bf() {
      return this.W;
   }

   @Nullable
   public static String bg() {
      return System.getProperty("minecraft.launcher.brand");
   }

   public static enum a {
      a(wv.a) {
         @Override
         public boolean a(boolean $$0) {
            return true;
         }
      },
      b(ww.c("chat.disabled.options").a(n.m)) {
         @Override
         public boolean a(boolean $$0) {
            return false;
         }
      },
      c(ww.c("chat.disabled.launcher").a(n.m)) {
         @Override
         public boolean a(boolean $$0) {
            return $$0;
         }
      },
      d(ww.a("chat.disabled.profile", ww.d(fof.F.n.I.h())).a(n.m)) {
         @Override
         public boolean a(boolean $$0) {
            return $$0;
         }
      };

      static final ww e = ww.c("chat.disabled.profile.moreInfo");
      private final ww f;

      a(final ww $$0) {
         this.f = $$0;
      }

      public ww a() {
         return this.f;
      }

      public abstract boolean a(boolean var1);
   }

   static record b(fjg a, gdk.c b) {
   }
}
