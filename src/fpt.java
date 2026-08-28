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

public class fpt extends bsz<Runnable> implements fjd {
   static fpt F;
   private static final Logger G = LogUtils.getLogger();
   public static final boolean a = ag.n() == ag.a.d;
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
   private final hjs O;
   private final grj P;
   private final DataFixer Q;
   private final grq R;
   private final fjc S;
   private final fpj.b T = new fpj.b(20.0F, 0L, this::a);
   private final gqz U;
   public final gqm f;
   private final gww V;
   private final hgg W;
   private final gxw X;
   private final gqp Y;
   public final gob g;
   private final fqf Z;
   public final fsk h;
   public final fsk i;
   public final gqh j;
   public final gut l;
   private final AtomicReference<ase> aa = new AtomicReference<>();
   public final fsl m;
   public final fpx n;
   private final fpo ab;
   public final fpu o;
   public final fps p;
   private fpq ac = fpq.a;
   public final File q;
   private final String ad;
   private final String ae;
   private final Proxy af;
   private final ezh ag;
   private final boolean ah;
   private final boolean ai;
   private final boolean aj;
   private final ava ak;
   private final att al;
   private final hmq am;
   private final aun an;
   private final hla ao;
   private final fqv ap;
   private final fij aq;
   @Nullable
   private final fhi ar;
   private final hou as;
   private final hop at;
   private final fvq au;
   private final hku av;
   private final gqi aw;
   private final fpy ax = new fpy(I, fpt::a);
   private final YggdrasilAuthenticationService ay;
   private final MinecraftSessionService az;
   private final UserApiService aA;
   private final CompletableFuture<UserProperties> aB;
   private final hkt aC;
   private final hme aD;
   private final gru aE;
   private final hkr aF;
   private final hkq aG;
   private final hkp aH;
   private final hko aI;
   private final fsn aJ;
   private final fvl aK;
   private final hpw aL;
   private final gdk aM;
   private final gtc aN;
   private final hoy aO;
   private final gld aP;
   private final fms aQ;
   private final gpw aR;
   @Nullable
   public gla r;
   @Nullable
   public gkq s;
   @Nullable
   public gpo t;
   @Nullable
   private hoc aS;
   @Nullable
   private vr aT;
   private boolean aU;
   @Nullable
   public bwi u;
   @Nullable
   public bwi v;
   @Nullable
   public ffa w;
   private int aV;
   protected int x;
   private volatile boolean aW;
   private long aX = ag.d();
   private long aY;
   private int aZ;
   public boolean y;
   @Nullable
   public fys z;
   @Nullable
   private fym ba;
   private boolean bb;
   Thread bc;
   private volatile boolean bd;
   @Nullable
   private Supplier<p> be;
   private static int bf;
   public String A = "";
   private long bg;
   private final fiq bh;
   public boolean B;
   public boolean C;
   public boolean D;
   public boolean E = true;
   private boolean bi;
   private final Queue<Runnable> bj = Queues.newConcurrentLinkedQueue();
   @Nullable
   private CompletableFuture<Void> bk;
   @Nullable
   private fvm bl;
   private int bm;
   private final bqj bn;
   private bsh bo = bsg.a;
   private final fqa bp = new fqa();
   private long bq;
   private double br;
   @Nullable
   private fjs.a bs;
   private final fpk bt;
   private final glk bu;
   private glz bv;
   private final fpg bw;
   private final fes bx;
   private boolean by;
   private final long bz;
   private long bA;

   public fpt(final geu $$0) {
      super("Client");
      F = this;
      this.bz = System.currentTimeMillis();
      this.q = $$0.c.a;
      File $$1 = $$0.c.c;
      this.M = $$0.c.b.toPath();
      this.ad = $$0.d.b;
      this.ae = $$0.d.c;
      Path $$2 = this.q.toPath();
      this.bx = ezh.a($$2.resolve("allowed_symlinks.txt"));
      hkh $$3 = new hkh($$0.c.a(), this.bx);
      this.am = new hmq(this, $$2.resolve("downloads"), $$0.a);
      aup $$4 = new aui(this.M, atr.a, auo.b, this.bx);
      this.an = new aun($$3, this.am.a(), $$4);
      this.al = $$3.a();
      this.af = $$0.a.d;
      this.ay = new YggdrasilAuthenticationService(this.af);
      this.az = this.ay.createMinecraftSessionService();
      this.Z = $$0.a.a;
      this.N = CompletableFuture.supplyAsync(() -> this.az.fetchProfile(this.Z.b(), true), ag.j());
      this.aA = this.a(this.ay, $$0);
      this.aB = CompletableFuture.supplyAsync(() -> {
         try {
            return this.aA.fetchProperties();
         } catch (AuthenticationException var2x) {
            G.error("Failed to fetch user properties", var2x);
            return UserApiService.OFFLINE_PROPERTIES;
         }
      }, ag.j());
      G.info("Setting user: {}", this.Z.c());
      G.debug("(Session ID is {})", this.Z.a());
      this.ah = $$0.d.a;
      this.ai = !$$0.d.d;
      this.aj = !$$0.d.e;
      this.aS = null;
      yd.a(fpr::a);
      this.Q = bbc.a();
      this.aK = new fvl(this);
      this.bc = Thread.currentThread();
      this.n = new fpx(this, this.q);
      boolean $$5 = this.n.ae;
      this.n.ae = false;
      this.n.az();
      RenderSystem.setShaderGlintAlpha(this.n.aq().c());
      this.bd = true;
      this.aL = new hpw(this, this.n);
      this.ab = new fpo($$2, this.Q);
      G.info("Backend library: {}", RenderSystem.getBackendDescription());
      fip $$6 = $$0.b;
      if (this.n.p > 0 && this.n.o > 0) {
         $$6 = $$0.b.a(this.n.o, this.n.p);
      }

      if (!$$5) {
         $$6 = $$6.a(false);
         this.n.k = null;
         G.warn("Detected unexpected shutdown during last game startup: resetting fullscreen mode");
      }

      ag.c = RenderSystem.initBackendSystem();
      this.R = new grq(this);
      this.S = this.R.a($$6, this.n.k, this.bh());
      this.a(true);
      this.S.a(new Runnable() {
         private boolean c;

         @Override
         public void run() {
            if (!this.c) {
               this.c = true;
               fim.a($$0.c.a, fpt.this.bc.threadId());
            }
         }
      });
      hpj.a.b(hpf.A);

      try {
         this.S.a(this.al, ac.b().g() ? fit.a : fit.b);
      } catch (IOException var14) {
         G.error("Couldn't set icon", var14);
      }

      this.o = new fpu(this);
      this.o.a(this.S.h());
      this.p = new fps(this);
      this.p.a(this.S.h());
      RenderSystem.initRenderer(this.n.t, false);
      this.aq = new fig(this.S.k(), this.S.l());
      this.aq.a(0.0F, 0.0F, 0.0F, 0.0F);
      this.aq.f();
      this.ak = new ava(atr.a);
      this.an.a();
      this.n.b(this.an);
      this.ao = new hla(this.n.ab, $$0x -> {
         if (this.t != null) {
            this.t.j.C();
         }
      });
      this.ak.a(this.ao);
      this.O = new hjs(this.ak);
      this.ak.a(this.O);
      this.P = new grj(this.O, this::a);
      this.ak.a(this.P);
      this.aC = new hkt($$1.toPath().resolve("skins"), this.az, this);
      this.ag = new ezh($$2.resolve("saves"), $$2.resolve("backups"), this.bx, this.Q);
      this.bw = new fpg($$2);
      this.as = new hou(this.n);
      this.ak.a(this.as);
      this.av = new hku(this.Z);
      this.ak.a(this.av);
      this.at = new hop(this);
      this.au = new fvq(this.O);
      this.h = this.au.a();
      this.i = this.au.b();
      this.ak.a(this.au);
      this.g();
      this.ak.a(new hkl());
      this.ak.a(new hkk());
      this.ak.a(new hkj());
      this.S.a("Startup");
      RenderSystem.setupDefaultState(0, 0, this.S.k(), this.S.l());
      this.S.a("Post startup");
      this.ap = fqv.a();
      this.aD = new hme(this.O, this.ap, this.n.E().c());
      this.ak.a(this.aD);
      hlv $$8 = new hlv();
      this.ak.a($$8);
      this.W = new hgg(this.aD);
      this.X = new gxw(this.W);
      this.aH = new hkp(this.O);
      this.aI = new hko(this.O);
      this.ak.a(this.aI);
      this.Y = new gqp(this.aI, this.aH);

      try {
         int $$9 = Runtime.getRuntime().availableProcessors();
         fkf.a();
         this.U = new gqz($$9);
      } catch (OutOfMemoryError var13) {
         TinyFileDialogs.tinyfd_messageBox(
            "Minecraft",
            "Oh no! The game was unable to allocate memory off-heap while trying to start. You may try to free some memory by closing other applications on your computer, check that your system meets the minimum requirements, and try again. If the problem persists, please visit: "
               + ayh.k,
            "ok",
            "error",
            true
         );
         throw new gev("Unable to allocate render buffers", var13);
      }

      this.aM = new gdk(this, this.aA);
      this.aE = new gru(this.aD.b(), this.aD.c(), this.ap);
      this.ak.a(this.aE);
      this.V = new gww(this, this.O, this.W, this.X, this.Y, this.aE, this.h, this.n, this.aD.d(), $$8);
      this.ak.a(this.V);
      this.aN = new gtc(this.h, this.aD.d(), this.aE, this.W, this.X, this.V);
      this.ak.a(this.aN);
      this.g = new gob(this.s, this.O);
      this.ak.a(this.g);
      this.aF = new hkr(this.O);
      this.ak.a(this.aF);
      this.aG = new hkq(this.O);
      this.ak.a(this.aG);
      this.aJ = new fsn(this.O);
      this.ak.a(this.aJ);
      this.j = new gqh(this, this.V.c(), this.ak, this.U);
      this.f = new gqm(this, this.V, this.aN, this.U);
      this.ak.a(this.f);
      this.ak.a(this.f.y());
      this.aw = new gqi();
      this.ak.a(this.aw);
      this.ak.a(this.ax);
      this.m = new fsl(this);
      this.l = new gut(this);
      fkt $$11 = fkt.a(this);
      this.aQ = new fms($$11);
      RenderSystem.setErrorCallback(this::a);
      if (this.aq.c != this.S.k() || this.aq.d != this.S.l()) {
         StringBuilder $$12 = new StringBuilder(
            "Recovering from unsupported resolution ("
               + this.S.k()
               + "x"
               + this.S.l()
               + ").\nPlease make sure you have up-to-date drivers (see aka.ms/mcdriver for instructions)."
         );
         if (fir.b()) {
            $$12.append("\n\nReported GL debug messages:\n").append(String.join("\n", fir.a()));
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
      this.aO = new hoy(this, this.aA, this.Z);
      this.aP = gld.a(this.aA, this.Z, $$2);
      this.bt = new fpk(this);
      this.bt.a(this.n.av().c() != fpv.a);
      this.bu = new glk(this);
      this.bu.a(this.n.C().c());
      this.bv = glz.a(glw.a(), this.aA);
      fyu.a(this.O);
      fyi.a(this.O);
      this.a((fys)(new fyd(wy.c("gui.loadingMinecraft"))));
      List<atp> $$13 = this.an.h();
      this.bp.a(fqa.b.a, $$13);
      auz $$14 = this.ak.a(ag.h().a("resourceLoad"), this, J, $$13);
      hpj.a.a(hpf.C);
      fpt.b $$15 = new fpt.b($$11, $$0.e);
      this.a((fym)(new fyi(this, $$14, $$1x -> ag.a($$1x, $$1xx -> this.a($$1xx, $$15), () -> {
            if (ac.aV) {
               this.bk();
            }

            this.bp.a();
            this.a($$15);
         }), false)));
      this.aR = gpw.a($$0.e.b());
      this.bh = new fiq(this.n, this);
      this.bn = new bqj(ag.c, () -> this.bm, this.bh::c);
      if (TracyClient.isAvailable() && $$0.d.f) {
         this.ar = new fhi();
      } else {
         this.ar = null;
      }
   }

   private void a(@Nullable fpt.b $$0) {
      if (!this.by) {
         this.by = true;
         this.b($$0);
      }
   }

   private void b(@Nullable fpt.b $$0) {
      Runnable $$1 = this.c($$0);
      hpj.a.b(hpf.C);
      hpj.a.b(hpf.z);
      hpj.a.a(this.aO.a());
      $$1.run();
      this.n.ae = true;
      this.n.az();
   }

   public boolean c() {
      return this.by;
   }

   private Runnable c(@Nullable fpt.b $$0) {
      List<Function<Runnable, fys>> $$1 = new ArrayList<>();
      this.a($$1);
      Runnable $$2 = () -> {
         if ($$0 != null && $$0.b().a()) {
            gpv.a(this, $$0.b(), $$0.a());
         } else {
            this.a((fys)(new fyu(true)));
         }
      };

      for (Function<Runnable, fys> $$3 : Lists.reverse($$1)) {
         fys $$4 = $$3.apply($$2);
         $$2 = () -> this.a($$4);
      }

      return $$2;
   }

   private void a(List<Function<Runnable, fys>> $$0) {
      if (this.n.ac) {
         $$0.add($$0x -> new fxk(this.n, $$0x));
      }

      BanDetails $$1 = this.H();
      if ($$1 != null) {
         $$0.add($$1x -> fxn.a($$1xx -> {
               if ($$1xx) {
                  ag.n().a(ayh.n);
               }

               $$1x.run();
            }, $$1));
      }

      ProfileResult $$2 = this.N.join();
      if ($$2 != null) {
         GameProfile $$3 = $$2.profile();
         Set<ProfileActionType> $$4 = $$2.actions();
         if ($$4.contains(ProfileActionType.FORCED_NAME_CHANGE)) {
            $$0.add($$1x -> fxn.a($$3.getName(), $$1x));
         }

         if ($$4.contains(ProfileActionType.USING_BANNED_SKIN)) {
            $$0.add(fxn::a);
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
      $$0.append(ac.b().c());
      gkr $$1 = this.L();
      if ($$1 != null && $$1.k().i()) {
         $$0.append(" - ");
         glf $$2 = this.S();
         if (this.aS != null && !this.aS.r()) {
            $$0.append(hky.a("title.singleplayer"));
         } else if ($$2 != null && $$2.e()) {
            $$0.append(hky.a("title.multiplayer.realms"));
         } else if (this.aS == null && ($$2 == null || !$$2.d())) {
            $$0.append(hky.a("title.multiplayer.other"));
         } else {
            $$0.append(hky.a("title.multiplayer.lan"));
         }
      }

      return $$0.toString();
   }

   private UserApiService a(YggdrasilAuthenticationService $$0, geu $$1) {
      return $$1.a.a.g() != fqf.a.c ? UserApiService.OFFLINE : $$0.createUserApiService($$1.a.a.d());
   }

   public static azl e() {
      return azl.a("vanilla", ClientBrandRetriever::getClientModName, "Client", fpt.class);
   }

   private void a(Throwable $$0, @Nullable fpt.b $$1) {
      if (this.an.e().size() > 1) {
         this.a($$0, null, $$1);
      } else {
         ag.a($$0);
      }
   }

   public void a(Throwable $$0, @Nullable wy $$1, @Nullable fpt.b $$2) {
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

      this.a((fys)(new fyu()));
      this.a(null);
   }

   private void a(@Nullable wy $$0) {
      fvl $$1 = this.aA();
      fvj.b($$1, fvj.a.c, wy.c("resourcePack.load_fail"), $$0);
   }

   public void a(Exception $$0) {
      if (!this.an.b()) {
         if (this.an.e().size() <= 1) {
            G.error(LogUtils.FATAL_MARKER, $$0.getMessage(), $$0);
            this.c(new p($$0.getMessage(), $$0));
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
               bqt $$2 = bqt.a("Renderer");
               boolean $$3 = this.aQ().e();

               try (bqp.a $$4 = bqp.a(this.a($$3, $$2))) {
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
               this.a((fys)(new fyl()));
               System.gc();
               G.error(LogUtils.FATAL_MARKER, "Out of memory", var10);
               $$1 = true;
            }
         }
      } catch (aa var11) {
         G.error(LogUtils.FATAL_MARKER, "Reported exception thrown!", var11);
         this.c(var11.a());
      } catch (Throwable var12) {
         G.error(LogUtils.FATAL_MARKER, "Unreported exception thrown!", var12);
         this.c(new p("Unexpected error", var12));
      }
   }

   void g() {
      this.au.a(this.n);
   }

   private void a(int $$0, long $$1) {
      this.n.Q().a(false);
      this.n.az();
   }

   public fij h() {
      return this.aq;
   }

   public String i() {
      return this.ad;
   }

   public String j() {
      return this.ae;
   }

   public void a(p $$0) {
      this.be = () -> this.d($$0);
   }

   public void b(p $$0) {
      this.be = () -> $$0;
   }

   private void bj() {
      if (this.be != null) {
         a(this, this.q, this.be.get());
      }
   }

   public void c(p $$0) {
      azk.b();
      p $$1 = this.d($$0);
      this.bl();
      a(this, this.q, $$1);
   }

   public static int a(File $$0, p $$1) {
      Path $$2 = $$0.toPath().resolve("crash-reports");
      Path $$3 = $$2.resolve("crash-" + ag.f() + "-client.txt");
      ali.a($$1.a(z.a));
      if ($$1.e() != null) {
         ali.a("#@!@# Game crashed! Crash report saved to: #@!@# " + $$1.e().toAbsolutePath());
         return -1;
      } else if ($$1.a($$3, z.a)) {
         ali.a("#@!@# Game crashed! Crash report saved to: #@!@# " + $$3.toAbsolutePath());
         return -1;
      } else {
         ali.a("#@?@# Game crashed! Crash report could not be saved. #@?@#");
         return -2;
      }
   }

   public static void a(@Nullable fpt $$0, File $$1, p $$2) {
      int $$3 = a($$1, $$2);
      if ($$0 != null) {
         $$0.as.g();
      }

      System.exit($$3);
   }

   public boolean k() {
      return this.n.S().c();
   }

   public CompletableFuture<Void> l() {
      return this.a(false, null);
   }

   private CompletableFuture<Void> a(boolean $$0, @Nullable fpt.b $$1) {
      if (this.bk != null) {
         return this.bk;
      } else {
         CompletableFuture<Void> $$2 = new CompletableFuture<>();
         if (!$$0 && this.ba instanceof fyi) {
            this.bk = $$2;
            return $$2;
         } else {
            this.an.a();
            List<atp> $$3 = this.an.h();
            if (!$$0) {
               this.bp.a(fqa.b.b, $$3);
            }

            this.a((fym)(new fyi(this, this.ak.a(ag.h().a("resourceLoad"), this, J, $$3), $$3x -> ag.a($$3x, $$2xx -> {
                  if ($$0) {
                     this.am.c();
                     this.bi();
                  } else {
                     this.a($$2xx, $$1);
                  }
               }, () -> {
                  this.f.d();
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
      grt $$1 = this.ap().a();
      gsd $$2 = $$1.a().a();

      for (dmr $$3 : mg.e) {
         UnmodifiableIterator $$7 = $$3.l().a().iterator();

         while ($$7.hasNext()) {
            eat $$4 = (eat)$$7.next();
            if ($$4.o() == dte.b) {
               gsd $$5 = $$1.b($$4);
               if ($$5 == $$2) {
                  G.debug("Missing model for: {}", $$4);
                  $$0 = true;
               }
            }
         }
      }

      hjq $$6 = $$2.b();

      for (dmr $$7 : mg.e) {
         UnmodifiableIterator var15 = $$7.l().a().iterator();

         while (var15.hasNext()) {
            eat $$8 = (eat)var15.next();
            hjq $$9 = $$1.a($$8);
            if (!$$8.l() && $$9 == $$6) {
               G.debug("Missing particle icon for: {}", $$8);
            }
         }
      }

      mg.g.c().forEach($$0x -> {
         czj $$1x = (czj)$$0x.a();
         String $$2x = $$1x.j();
         String $$3x = wy.c($$2x).getString();
         if ($$3x.toLowerCase(Locale.ROOT).equals($$1x.j())) {
            G.debug("Missing translation for: {} {} {}", new Object[]{$$0x.h().a(), $$2x, $$1x});
         }
      });
      $$0 |= fyj.a();
      $$0 |= gwz.a();
      if ($$0) {
         throw new IllegalStateException("Your game data is foobar, fix the errors above!");
      }
   }

   public ezh m() {
      return this.ag;
   }

   private void a(String $$0) {
      fpt.a $$1 = this.J();
      if (!$$1.a(this.T())) {
         if (this.m.b()) {
            this.m.b(false);
            this.a((fys)(new fxp($$0x -> {
               if ($$0x) {
                  ag.n().a(ayh.g);
               }

               this.a(null);
            }, fpt.a.e, ayh.g, true)));
         } else {
            wy $$2 = $$1.a();
            this.m.a($$2, false);
            this.bt.c($$2);
            this.m.b($$1 == fpt.a.d);
         }
      } else {
         this.a((fys)(new fxo($$0)));
      }
   }

   public void a(@Nullable fys $$0) {
      if (ac.aV && Thread.currentThread() != this.bc) {
         G.error("setScreen called from non-game thread");
      }

      if (this.z != null) {
         this.z.aF_();
      } else {
         this.a(fpq.a);
      }

      if ($$0 == null && this.bb) {
         throw new IllegalStateException("Trying to return to in-game GUI during disconnection");
      } else {
         if ($$0 == null && this.s == null) {
            $$0 = new fyu();
         } else if ($$0 == null && this.t.eG()) {
            if (this.t.n()) {
               $$0 = new fxw(null, this.s.k().l());
            } else {
               this.t.gf();
            }
         }

         this.z = $$0;
         if (this.z != null) {
            this.z.aG_();
         }

         if ($$0 != null) {
            this.o.j();
            fpr.b();
            $$0.b(this, this.S.o(), this.S.p());
            this.y = false;
         } else {
            this.as.h();
            this.o.i();
         }

         this.d();
      }
   }

   public void a(@Nullable fym $$0) {
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
         ag.c = System::nanoTime;
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
         this.as.f();
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

         fwc.b();
         ag.k();
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

      if (this.bk != null && !(this.ba instanceof fyi)) {
         CompletableFuture<Void> $$1 = this.bk;
         this.bk = null;
         this.l().thenRun(() -> $$1.complete(null));
      }

      Runnable $$2;
      while (($$2 = this.bj.poll()) != null) {
         $$2.run();
      }

      int $$3 = this.T.a(ag.c(), $$0);
      bqq $$4 = bqp.a();
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
      $$4.a("gpuAsync");
      RenderSystem.executePendingTasks();
      $$4.b("sound");
      this.as.a(this.j.k());
      $$4.b("toasts");
      this.aK.a();
      $$4.b("render");
      long $$6 = ag.d();
      boolean $$8;
      if (!this.aQ().d() && !this.bo.e()) {
         $$8 = false;
         this.br = 0.0;
      } else {
         $$8 = this.bs == null || this.bs.b();
         if ($$8) {
            fjs.a().ifPresent(fjs::b);
         }
      }

      RenderSystem.clear(16640);
      this.aq.a(true);
      RenderSystem.setShaderFog(gqf.a);
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
      this.aq.d();
      if (!this.S.u()) {
         this.aq.c(this.S.k(), this.S.l());
      }

      this.bg = ag.d() - $$6;
      if ($$8) {
         fjs.a().ifPresent($$0x -> this.bs = $$0x.c());
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
      long $$10 = ag.d();
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

      while (ag.c() >= this.aY + 1000L) {
         String $$12;
         if (this.br > 0.0) {
            $$12 = " GPU: " + (this.br > 100.0 ? o.m + "100%" : Math.round(this.br) + "%");
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
            this.n.j().c() == fpf.a ? "" : (this.n.j().c() == fpf.b ? " fast-clouds" : " fancy-clouds"),
            this.n.G().c(),
            $$12
         );
         this.aY += 1000L;
         this.aZ = 0;
      }

      $$4.c();
   }

   private bqq a(boolean $$0, @Nullable bqt $$1) {
      if (!$$0) {
         this.bn.b();
         if (!this.bo.e() && $$1 == null) {
            return bqm.a;
         }
      }

      bqq $$2;
      if ($$0) {
         if (!this.bn.a()) {
            this.bm = 0;
            this.bn.c();
         }

         this.bm++;
         $$2 = this.bn.d();
      } else {
         $$2 = bqm.a;
      }

      if (this.bo.e()) {
         $$2 = bqq.a($$2, this.bo.f());
      }

      return bqt.a($$2, $$1);
   }

   private void b(boolean $$0, @Nullable bqt $$1) {
      if ($$1 != null) {
         $$1.b();
      }

      fut $$2 = this.aQ().o();
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

      fij $$1 = this.h();
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

         this.b(new fyd(wy.c("menu.savingLevel")));
      } catch (Throwable var2) {
      }

      System.gc();
   }

   public boolean b(Consumer<wy> $$0) {
      if (this.bo.e()) {
         this.bm();
         return false;
      } else {
         Consumer<bqo> $$1 = $$1x -> {
            if ($$1x != bqk.a) {
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
            wy $$2x = wy.b($$1x.toString()).a(o.t).a($$1xx -> $$1xx.a(new ww.d($$1x.getParent())));
            this.execute(() -> $$0.accept(wy.a("debug.profiling.stop", $$2x)));
         };
         ae $$3 = a(new ae(), this, this.ao, this.ad, this.n);
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
            CompletableFuture.allOf($$6, $$7).thenRunAsync(() -> $$4.accept(ImmutableList.of($$6.join(), $$7.join())), ag.i());
            this.aS.a($$0x -> {
            }, $$7::complete);
            $$5 = $$6::complete;
         }

         this.bo = bsf.a(new gpt(ag.c, this.f), ag.c, ag.i(), new bsl("client"), $$1x -> {
            this.bo = bsg.a;
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

   private Path a(ae $$0, List<Path> $$1) {
      String $$2;
      if (this.T()) {
         $$2 = this.V().aZ().e();
      } else {
         glf $$3 = this.S();
         $$2 = $$3 != null ? $$3.a : "unknown";
      }

      Path $$7;
      try {
         String $$5 = String.format(Locale.ROOT, "%s-%s-%s", ag.f(), $$2, ac.b().b());
         String $$6 = w.a(bsl.a, $$5, ".zip");
         $$7 = bsl.a.resolve($$6);
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
            this.a((fys)(new fyn(!$$0)));
            this.as.d();
         } else {
            this.a((fys)(new fyn(true)));
         }
      }
   }

   private void d(boolean $$0) {
      if (!$$0) {
         this.x = 0;
      }

      if (this.x <= 0 && !this.t.fy()) {
         if ($$0 && this.w != null && this.w.d() == ffa.a.b) {
            fey $$1 = (fey)this.w;
            iv $$2 = $$1.b();
            if (!this.s.a_($$2).l()) {
               jb $$3 = $$1.c();
               if (this.r.b($$2, $$3)) {
                  this.g.a($$2, $$3);
                  this.t.a(buf.a);
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
         czn $$0 = this.t.b(buf.a);
         if (!$$0.a(this.s.K())) {
            return false;
         } else {
            boolean $$1 = false;
            switch (this.w.d()) {
               case c:
                  this.r.a(this.t, ((fez)this.w).a());
                  break;
               case b:
                  fey $$2 = (fey)this.w;
                  iv $$3 = $$2.b();
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

            this.t.a(buf.a);
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

            for (buf $$0 : buf.values()) {
               czn $$1 = this.t.b($$0);
               if (!$$1.a(this.s.K())) {
                  return;
               }

               if (this.w != null) {
                  switch (this.w.d()) {
                     case c:
                        fez $$2 = (fez)this.w;
                        bwi $$3 = $$2.a();
                        if (!this.s.A_().a($$3.du())) {
                           return;
                        }

                        bug $$4 = this.r.a(this.t, $$3, $$2, $$0);
                        if (!$$4.a()) {
                           $$4 = this.r.a(this.t, $$3, $$0);
                        }

                        if ($$4 instanceof bug.d $$5) {
                           if ($$5.e() == bug.e.b) {
                              this.t.a($$0);
                           }

                           return;
                        }
                        break;
                     case b:
                        fey $$6 = (fey)this.w;
                        int $$7 = $$1.M();
                        bug $$8 = this.r.a(this.t, $$0, $$6);
                        if ($$8 instanceof bug.d $$9) {
                           if ($$9.e() == bug.e.b) {
                              this.t.a($$0);
                              if (!$$1.f() && ($$1.M() != $$7 || this.t.fU())) {
                                 this.j.c.a($$0);
                              }
                           }

                           return;
                        }

                        if ($$8 instanceof bug.a) {
                           return;
                        }
                  }
               }

               if (!$$1.f() && this.r.a(this.t, $$0) instanceof bug.d $$11) {
                  if ($$11.e() == bug.e.b) {
                     this.t.a($$0);
                  }

                  this.j.c.a($$0);
                  return;
               }
            }
         }
      }
   }

   public hop s() {
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

      bqq $$0 = bqp.a();
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
         this.O.d();
      }

      if (this.z != null || this.t == null) {
         if (this.z instanceof fyf $$1 && !this.t.fQ()) {
            $$1.m();
         }
      } else if (this.t.eG() && !(this.z instanceof fxw)) {
         this.a(null);
      } else if (this.t.fQ() && this.s != null) {
         this.a((fys)(new fyf()));
      }

      if (this.z != null) {
         this.x = 10000;
      }

      if (this.z != null) {
         try {
            this.z.e();
         } catch (Throwable var5) {
            p $$3 = p.a(var5, "Ticking screen");
            this.z.a($$3);
            throw new aa($$3);
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
            this.f.m();
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
               wy $$5 = wy.a("tutorial.socialInteractions.description", hpw.a("socialInteractions"));
               this.bl = new fvm(this.h, fvm.a.f, $$4, $$5, true, 8000);
               this.aK.a(this.bl);
               this.n.s = true;
               this.n.az();
            }

            this.aL.d();

            try {
               this.s.a(() -> true);
            } catch (Throwable var6) {
               p $$7 = p.a(var6, "Exception in world tick");
               if (this.s == null) {
                  q $$8 = $$7.a("Affected level");
                  $$8.a("Problem", "Level is null!");
               } else {
                  this.s.a($$7);
               }

               throw new aa($$7);
            }
         }

         $$0.b("animateTick");
         if (!this.aW && this.bq()) {
            this.s.b(this.t.dy(), this.t.dA(), this.t.dE());
         }

         $$0.b("particles");
         if (!this.aW && this.bq()) {
            this.g.b();
         }

         gkr $$9 = this.L();
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
         fpc $$0 = this.n.aE();
         this.n.a(this.n.aE().c());
         if ($$0.a() != this.n.aE().a()) {
            this.j.a(this.n.aE().a() ? this.ao() : null);
         }

         this.f.o();
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
            } else if (!this.t.fU() || this.z != null || !$$3 && !$$2) {
               this.t.gi().c($$1);
            } else {
               fzx.a(this, $$1, $$3, $$2);
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

            this.a((fys)(new gdm()));
         }
      }

      while (this.n.C.g()) {
         if (this.r.f()) {
            this.t.i();
         } else {
            this.aL.a();
            this.a((fys)(new gai(this.t)));
         }
      }

      while (this.n.R.g()) {
         this.a((fys)(new fzc(this.t.j.p())));
      }

      while (this.n.D.g()) {
         if (!this.t.V_()) {
            this.L().b(new ahv(ahv.a.g, iv.c, jb.a));
         }
      }

      while (this.n.E.g()) {
         if (!this.t.V_() && this.t.a(fys.s())) {
            this.t.a(buf.a);
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

   public hoy u() {
      return this.aO;
   }

   public double v() {
      return this.br;
   }

   public gld w() {
      return this.aP;
   }

   public geg x() {
      return new geg(this, this.ag);
   }

   public void a(ezh.c $$0, aun $$1, amf $$2, boolean $$3) {
      this.y();
      this.aa.set(null);
      Instant $$4 = Instant.now();

      try {
         $$0.a($$2.c().a(), $$2.d());
         amb $$5 = amb.a(this.ay, this.q);
         $$5.f().a(this);
         dzh.a($$5, this);
         avm.a(false);
         this.aS = MinecraftServer.a((Function<Thread, hoc>)($$4x -> new hoc($$4x, this, $$0, $$1, $$2, $$5, $$0xx -> {
               ase $$1xx = ase.b($$0xx + 0);
               this.aa.set($$1xx);
               return asd.a($$1xx, this.bj::add);
            })));
         this.aU = true;
         this.a(glw.a());
         this.aR.a(gpw.c.a, $$0.f(), $$2.d().e());
      } catch (Throwable var12) {
         p $$7 = p.a(var12, "Starting integrated server");
         q $$8 = $$7.a("Starting integrated server");
         $$8.a("Level ID", $$0.f());
         $$8.a("Level Name", () -> $$2.d().e());
         throw new aa($$7);
      }

      while (this.aa.get() == null) {
         Thread.yield();
      }

      fyg $$9 = new fyg(this.aa.get());
      bqq $$10 = bqp.a();
      this.a((fys)$$9);
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
      $$13.a($$12.toString(), 0, new gkp($$13, this, null, null, $$3, $$11, $$0x -> {
      }, null));
      $$13.a(new ajl(this.X().c(), this.X().b()));
      this.aT = $$13;
   }

   public void a(gkq $$0, fyq.a $$1) {
      this.e(new fyq(() -> false, $$1));
      this.s = $$0;
      this.a($$0);
      if (!this.aU) {
         amb $$2 = amb.a(this.ay, this.q);
         $$2.f().a(this);
         dzh.a($$2, this);
         avm.a(false);
      }
   }

   public void y() {
      this.a(new fyp(true), false);
   }

   public void b(fys $$0) {
      this.a($$0, false);
   }

   public void a(fys $$0, boolean $$1) {
      gkr $$2 = this.L();
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

      hoc $$3 = this.aS;
      this.aS = null;
      this.j.h();
      this.r = null;
      this.bt.b();
      this.bb = true;

      try {
         this.e($$0);
         if (this.s != null) {
            if ($$3 != null) {
               bqq $$4 = bqp.a();
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

      dzh.a();
   }

   public void z() {
      this.am.i();
      this.bA();
   }

   public void c(fys $$0) {
      gkr $$1 = this.L();
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

      dzh.a();
   }

   private void e(fys $$0) {
      bqq $$1 = bqp.a();
      $$1.a("forcedTick");
      this.as.e();
      this.u = null;
      this.aT = null;
      this.a($$0);
      this.c(false);
      $$1.c();
   }

   public void d(fys $$0) {
      try (bqv $$1 = bqp.a().d("forcedTick")) {
         this.a($$0);
         this.c(false);
      }
   }

   private void a(@Nullable gkq $$0) {
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
      return ac.aV ? false : this.bt().flag(UserFlag.TELEMETRY_ENABLED);
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
      return this.J().a(false) ? this.aM.c($$0) : (this.t == null || !$$0.equals(this.t.cF())) && !$$0.equals(ag.e);
   }

   public fpt.a J() {
      if (this.n.n().c() == crj.c) {
         return fpt.a.b;
      } else if (!this.aj) {
         return fpt.a.c;
      } else {
         return !this.bt().flag(UserFlag.CHAT_ALLOWED) ? fpt.a.d : fpt.a.a;
      }
   }

   public final boolean K() {
      return this.ah;
   }

   @Nullable
   public gkr L() {
      return this.t == null ? null : this.t.j;
   }

   public static boolean M() {
      return !F.n.X;
   }

   public static boolean N() {
      return F.n.k().c().b() >= fpl.b.b();
   }

   public static boolean O() {
      return !F.j.a() && F.n.k().c().b() >= fpl.c.b();
   }

   public static boolean P() {
      return F.n.l().c();
   }

   private void bu() {
      if (this.w != null && this.w.d() != ffa.a.a) {
         boolean $$0 = fys.s();
         ffa var10000 = this.w;
         Objects.requireNonNull(this.w);
         Object var2 = var10000;
         switch (var2) {
            case fey $$1:
               this.r.a($$1.b(), $$0);
               break;
            case fez $$2:
               this.r.a($$2.a(), $$0);
               break;
         }
      }
   }

   public p d(p $$0) {
      ae $$1 = $$0.f();

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

   public static void a(@Nullable fpt $$0, @Nullable hla $$1, String $$2, @Nullable fpx $$3, p $$4) {
      ae $$5 = $$4.f();
      a($$5, $$0, $$1, $$2, $$3);
   }

   private static String a(double $$0) {
      return String.format(Locale.ROOT, "%.3fs", $$0);
   }

   private void a(q $$0) {
      $$0.a("JVM uptime", () -> a((double)ManagementFactory.getRuntimeMXBean().getUptime() / 1000.0));
      $$0.a("Wall uptime", () -> a((double)(System.currentTimeMillis() - this.bz) / 1000.0));
      $$0.a("High-res time", () -> a((double)ag.c() / 1000.0));
      $$0.a("Client ticks", () -> String.format(Locale.ROOT, "%d ticks / %.3fs", this.bA, (double)this.bA / 20.0));
   }

   private static ae a(ae $$0, @Nullable fpt $$1, @Nullable hla $$2, String $$3, @Nullable fpx $$4) {
      $$0.a("Launched Version", () -> $$3);
      String $$5 = bg();
      if ($$5 != null) {
         $$0.a("Launcher name", $$5);
      }

      $$0.a("Backend library", RenderSystem::getBackendDescription);
      $$0.a("Backend API", RenderSystem::getApiDescription);
      $$0.a("Window size", () -> $$1 != null ? $$1.S.k() + "x" + $$1.S.l() : "<not initialized>");
      $$0.a("GFLW Platform", fjc::a);
      $$0.a("GL Caps", RenderSystem::getCapsString);
      $$0.a("GL debug messages", () -> fir.b() ? String.join("\n", fir.a()) : "<disabled>");
      $$0.a("Is Modded", () -> e().b());
      $$0.a("Universe", () -> $$1 != null ? Long.toHexString($$1.L) : "404");
      $$0.a("Type", "Client (map_client.txt)");
      if ($$4 != null) {
         if ($$1 != null) {
            String $$6 = $$1.aj().l();
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
      $$0.a("CPU", fis::b);
      return $$0;
   }

   public static fpt Q() {
      return F;
   }

   public CompletableFuture<Void> R() {
      return this.a(this::l).thenCompose($$0 -> (CompletionStage<Void>)$$0);
   }

   public void a(glw $$0) {
      if (!this.bv.a($$0)) {
         this.bv = glz.a($$0, this.aA);
      }
   }

   @Nullable
   public glf S() {
      return y.a(this.L(), gkr::x);
   }

   public boolean T() {
      return this.aU;
   }

   public boolean U() {
      return this.aU && this.aS != null;
   }

   @Nullable
   public hoc V() {
      return this.aS;
   }

   public boolean W() {
      hoc $$0 = this.V();
      return $$0 != null && !$$0.r();
   }

   public boolean b(UUID $$0) {
      return $$0.equals(this.X().b());
   }

   public fqf X() {
      return this.Z;
   }

   public GameProfile Y() {
      ProfileResult $$0 = this.N.join();
      return $$0 != null ? $$0.profile() : new GameProfile(this.Z.b(), this.Z.c());
   }

   public Proxy Z() {
      return this.af;
   }

   public hjs aa() {
      return this.O;
   }

   public grj ab() {
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

   public hmq af() {
      return this.am;
   }

   public Path ag() {
      return this.M;
   }

   public hla ah() {
      return this.ao;
   }

   public Function<alg, hjq> a(alg $$0) {
      return this.aD.c($$0)::a;
   }

   public boolean ai() {
      return this.aW;
   }

   public gqi aj() {
      return this.aw;
   }

   public hou ak() {
      return this.as;
   }

   public hoo al() {
      awk $$0 = y.a(this.z, fys::D);
      if ($$0 != null) {
         return new hoo($$0);
      } else if (this.t != null) {
         djm $$1 = this.t.dU();
         if ($$1.aj() == djm.k) {
            return this.m.j().b() ? new hoo(awl.d) : new hoo(awl.e);
         } else {
            jf<dkp> $$2 = $$1.u(this.t.du());
            float $$3 = $$2.a().q();
            if (!this.at.b(awl.f) && (!this.t.bl() || !$$2.a(axb.Z))) {
               if ($$1.aj() != djm.j && this.t.gj().d && this.t.gj().c) {
                  return new hoo(awl.b, $$3);
               } else {
                  Optional<bsq<awk>> $$4 = $$2.a().p();
                  if ($$4.isPresent()) {
                     Optional<awk> $$5 = $$4.get().a($$1.A);
                     return new hoo($$5.orElse(null), $$3);
                  } else {
                     return new hoo(awl.g, $$3);
                  }
               }
            } else {
               return new hoo(awl.f, $$3);
            }
         }
      } else {
         return new hoo(awl.a);
      }
   }

   public MinecraftSessionService am() {
      return this.az;
   }

   public hkt an() {
      return this.aC;
   }

   @Nullable
   public bwi ao() {
      return this.u;
   }

   public void a(bwi $$0) {
      this.u = $$0;
      this.j.a($$0);
   }

   public boolean b(bwi $$0) {
      return $$0.cm() || this.t != null && this.t.V_() && this.n.Q.e() && $$0.an() == bwr.bS;
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

   public gru ap() {
      return this.aE;
   }

   public gww aq() {
      return this.V;
   }

   public gtc ar() {
      return this.aN;
   }

   public gxw as() {
      return this.X;
   }

   public gqp at() {
      return this.Y;
   }

   public DataFixer au() {
      return this.Q;
   }

   public fpj av() {
      return this.T;
   }

   public fqv aw() {
      return this.ap;
   }

   public boolean az() {
      return this.t != null && this.t.gz() || this.n.Y().c();
   }

   public fvl aA() {
      return this.aK;
   }

   public hpw aB() {
      return this.aL;
   }

   public boolean aC() {
      return this.bi;
   }

   public fpo aD() {
      return this.ab;
   }

   public hme aE() {
      return this.aD;
   }

   public hkr aF() {
      return this.aF;
   }

   public hkq aG() {
      return this.aG;
   }

   public hkp aH() {
      return this.aH;
   }

   public hko aI() {
      return this.aI;
   }

   public fsn aJ() {
      return this.aJ;
   }

   @Override
   public void a(boolean $$0) {
      this.bi = $$0;
   }

   public wy a(File $$0, int $$1, int $$2) {
      int $$3 = this.S.k();
      int $$4 = this.S.l();
      fij $$5 = this.h();
      float $$6 = this.t.dM();
      float $$7 = this.t.dK();
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

            this.t.N = this.t.dK();
            this.t.O = this.t.dM();
            $$5.a(true);
            this.j.a(fpj.b);

            try {
               Thread.sleep(10L);
            } catch (InterruptedException var17) {
            }

            fqb.a($$0, "panorama_" + $$10 + ".png", $$5, $$0x -> {
            });
         }

         wy $$11 = wy.b($$0.getName()).a(o.t).a($$1x -> $$1x.a(new ww.d($$0.getAbsoluteFile())));
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

   @Nullable
   public ase aK() {
      return this.aa.get();
   }

   public hku aL() {
      return this.av;
   }

   @Nullable
   public fym aM() {
      return this.ba;
   }

   public gdk aN() {
      return this.aM;
   }

   public fjc aO() {
      return this.S;
   }

   public fiq aP() {
      return this.bh;
   }

   public fti aQ() {
      return this.m.k();
   }

   public gqz aR() {
      return this.U;
   }

   public void a(int $$0) {
      this.aD.a($$0);
   }

   public gjp aS() {
      return this.aD.d().get();
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

   public fpq aX() {
      return this.ac;
   }

   public void a(fpq $$0) {
      this.ac = $$0;
   }

   public fpk aY() {
      return this.bt;
   }

   public glk aZ() {
      return this.bu;
   }

   public glz ba() {
      return this.bv;
   }

   public fms bb() {
      return this.aQ;
   }

   public gpw bc() {
      return this.aR;
   }

   public fpg bd() {
      return this.bw;
   }

   public fes be() {
      return this.bx;
   }

   private float a(float $$0) {
      if (this.s != null) {
         bup $$1 = this.s.u();
         if ($$1.i()) {
            return Math.max($$0, $$1.g());
         }
      }

      return $$0;
   }

   public hgg bf() {
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
      b(wy.c("chat.disabled.options").a(o.m)) {
         @Override
         public boolean a(boolean $$0) {
            return false;
         }
      },
      c(wy.c("chat.disabled.launcher").a(o.m)) {
         @Override
         public boolean a(boolean $$0) {
            return $$0;
         }
      },
      d(wy.a("chat.disabled.profile", wy.d(fpt.F.n.I.h())).a(o.m)) {
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

   static record b(fkt a, geu.c b) {
   }
}
