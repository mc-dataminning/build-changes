import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
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
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
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
import java.util.stream.Stream;
import javax.annotation.Nullable;
import net.minecraft.client.ClientBrandRetriever;
import net.minecraft.server.MinecraftServer;
import org.apache.commons.io.FileUtils;
import org.joml.Matrix4f;
import org.lwjgl.util.tinyfd.TinyFileDialogs;
import org.slf4j.Logger;

public class exh extends bko<Runnable> implements erf {
   static exh E;
   private static final Logger F = LogUtils.getLogger();
   public static final boolean a = ac.j() == ac.a.d;
   private static final int G = 10;
   public static final aiy b = new aiy("default");
   public static final aiy c = new aiy("uniform");
   public static final aiy d = new aiy("alt");
   private static final aiy H = new aiy("regional_compliancies.json");
   private static final CompletableFuture<axk> I = CompletableFuture.completedFuture(axk.a);
   private static final vq J = vq.c("multiplayer.socialInteractions.not_available");
   public static final String e = "Please make sure you have up-to-date drivers (see aka.ms/mcdriver for instructions).";
   private final long K = Double.doubleToLongBits(Math.PI);
   private final Path L;
   private final CompletableFuture<ProfileResult> M;
   private final ggv N;
   private final DataFixer O;
   private final fwe P;
   private final ere Q;
   private final exu R = new exu(20.0F, 0L, this::a);
   private final fvs S;
   public final fvk f;
   private final gar T;
   private final gbr U;
   public final ftc g;
   private final gkt V = new gkt();
   private final exw W;
   public final eys h;
   public final eys i;
   public final fvf j;
   public final fyx k;
   private final AtomicReference<api> X = new AtomicReference<>();
   public final eyt l;
   public final exl m;
   private final exd Y;
   public final exi n;
   public final exg o;
   private exe Z = exe.a;
   public final File p;
   private final String aa;
   private final String ab;
   private final Proxy ac;
   private final eil ad;
   private final boolean ae;
   private final boolean af;
   private final boolean ag;
   private final boolean ah;
   private final arx ai;
   private final aqr aj;
   private final gjj ak;
   private final arl al;
   private final gib am;
   private final eyl an;
   private final eyp ao;
   private final eqm ap;
   private final gll aq;
   private final glg ar;
   private final fbw as;
   private final ghv at;
   private final fvg au;
   private final exn av = new exn(H, exh::b);
   private final YggdrasilAuthenticationService aw;
   private final MinecraftSessionService ax;
   private final UserApiService ay;
   private final CompletableFuture<UserProperties> az;
   private final ghu aA;
   private final gja aB;
   private final fwg aC;
   private final ghs aD;
   private final ghr aE;
   private final eyv aF;
   private final fbr aG;
   private final gmo aH;
   private final fjm aI;
   private final foy aJ;
   private final fxl aK;
   private final glp aL;
   private final fqh aM;
   private final eug aN;
   private final fuw aO;
   @Nullable
   public fqe q;
   @Nullable
   public fpx r;
   @Nullable
   public fuo s;
   @Nullable
   private gky aP;
   @Nullable
   private uo aQ;
   private boolean aR;
   @Nullable
   public bno t;
   @Nullable
   public bno u;
   @Nullable
   public enq v;
   private int aS;
   protected int w;
   private volatile boolean aT;
   private float aU;
   private long aV = ac.c();
   private long aW;
   private int aX;
   public boolean x;
   @Nullable
   public ffe y;
   @Nullable
   private fey aY;
   private boolean aZ;
   private Thread ba;
   private volatile boolean bb;
   @Nullable
   private Supplier<o> bc;
   private static int bd;
   public String z = "";
   private long be;
   public boolean A;
   public boolean B;
   public boolean C;
   public boolean D = true;
   private boolean bf;
   private final Queue<Runnable> bg = Queues.newConcurrentLinkedQueue();
   @Nullable
   private CompletableFuture<Void> bh;
   @Nullable
   private fbs bi;
   private bil bj = bii.a;
   private int bk;
   private final bif bl = new bif(ac.b, () -> this.bk);
   @Nullable
   private bik bm;
   private bjw bn = bjv.a;
   private final exr bo = new exr();
   private long bp;
   private double bq;
   @Nullable
   private ert.a br;
   private final exp bs;
   private final ewz bt;
   private final fqm bu;
   private frb bv;
   private final eww bw;
   private final eni bx;
   private boolean by;
   private final long bz;
   private long bA;
   private String bB = "root";

   public exh(fks $$0) {
      super("Client");
      E = this;
      this.bz = System.currentTimeMillis();
      this.p = $$0.c.a;
      File $$1 = $$0.c.c;
      this.L = $$0.c.b.toPath();
      this.aa = $$0.d.b;
      this.ab = $$0.d.c;
      Path $$2 = this.p.toPath();
      this.bx = eil.a($$2.resolve("allowed_symlinks.txt"));
      ghl $$3 = new ghl($$0.c.a(), this.bx);
      this.ak = new gjj(this, $$2.resolve("downloads"), $$0.a);
      arn $$4 = new arh(this.L, aqp.a, arm.b, this.bx);
      this.al = new arl($$3, this.ak.a(), $$4);
      this.aj = $$3.a();
      this.ac = $$0.a.d;
      this.aw = new YggdrasilAuthenticationService(this.ac);
      this.ax = this.aw.createMinecraftSessionService();
      this.W = $$0.a.a;
      this.M = CompletableFuture.supplyAsync(() -> this.ax.fetchProfile(this.W.b(), true), ac.h());
      this.ay = this.a(this.aw, $$0);
      this.az = CompletableFuture.supplyAsync(() -> {
         try {
            return this.ay.fetchProperties();
         } catch (AuthenticationException var2x) {
            F.error("Failed to fetch user properties", var2x);
            return UserApiService.OFFLINE_PROPERTIES;
         }
      }, ac.h());
      F.info("Setting user: {}", this.W.c());
      F.debug("(Session ID is {})", this.W.a());
      this.af = $$0.d.a;
      this.ag = !$$0.d.d;
      this.ah = !$$0.d.e;
      this.ae = bh();
      this.aP = null;
      wv.a(exf::a);
      this.O = axp.a();
      this.aG = new fbr(this);
      this.ba = Thread.currentThread();
      this.m = new exl(this, this.p);
      RenderSystem.setShaderGlintAlpha(this.m.ak().c());
      this.bb = true;
      this.aH = new gmo(this, this.m);
      this.Y = new exd($$2, this.O);
      F.info("Backend library: {}", RenderSystem.getBackendDescription());
      eqr $$5;
      if (this.m.p > 0 && this.m.o > 0) {
         $$5 = new eqr(this.m.o, this.m.p, $$0.b.c, $$0.b.d, $$0.b.e);
      } else {
         $$5 = $$0.b;
      }

      ac.b = RenderSystem.initBackendSystem();
      this.P = new fwe(this);
      this.Q = this.P.a($$5, this.m.k, this.be());
      this.a(true);
      gma.a.b(glw.A);

      try {
         this.Q.a(this.aj, aa.b().g() ? equ.a : equ.b);
      } catch (IOException var13) {
         F.error("Couldn't set icon", var13);
      }

      this.Q.a(this.m.h().c());
      this.n = new exi(this);
      this.n.a(this.Q.i());
      this.o = new exg(this);
      this.o.a(this.Q.i());
      RenderSystem.initRenderer(this.m.u, false);
      this.ap = new eqj(this.Q.k(), this.Q.l());
      this.ap.a(0.0F, 0.0F, 0.0F, 0.0F);
      this.ap.b(a);
      this.ai = new arx(aqp.a);
      this.al.a();
      this.m.b(this.al);
      this.am = new gib(this.m.ad);
      this.ai.a(this.am);
      this.N = new ggv(this.ai);
      this.ai.a(this.N);
      this.aA = new ghu(this.N, $$1.toPath().resolve("skins"), this.ax, this);
      this.ad = new eil($$2.resolve("saves"), $$2.resolve("backups"), this.bx, this.O);
      this.bw = new eww($$2);
      this.aq = new gll(this.m);
      this.ai.a(this.aq);
      this.at = new ghv(this.W);
      this.ai.a(this.at);
      this.ar = new glg(this);
      this.as = new fbw(this.N);
      this.h = this.as.a();
      this.i = this.as.b();
      this.ai.a(this.as);
      this.b(this.j());
      this.ai.a(new gho());
      this.ai.a(new ghn());
      this.Q.a("Startup");
      RenderSystem.setupDefaultState(0, 0, this.Q.k(), this.Q.l());
      this.Q.a("Post startup");
      this.an = eyl.a();
      this.ao = eyp.a(this.an);
      this.aB = new gja(this.N, this.an, this.m.A().c());
      this.ai.a(this.aB);
      this.aJ = new foy();
      this.ai.a(this.aJ);
      this.aK = new fxl(this.h, this.aJ, this::an, this::aq, this::ao);
      this.ai.a(this.aK);
      fuz $$8 = new fuz(this.aK, this.aJ);
      this.ai.a($$8);
      this.U = new gbr(this, this.N, this.aB, this.ao, $$8);
      this.ai.a(this.U);

      try {
         int $$9 = Runtime.getRuntime().availableProcessors();
         int $$10 = this.af() ? $$9 : Math.min($$9, 4);
         esc.a();
         this.S = new fvs($$10);
      } catch (OutOfMemoryError var12) {
         TinyFileDialogs.tinyfd_messageBox(
            "Minecraft",
            "Oh no! The game was unable to allocate memory off-heap while trying to start. You may try to free some memory by closing other applications on your computer, check that your system meets the minimum requirements, and try again. If the problem persists, please visit: https://aka.ms/Minecraft-Support",
            "ok",
            "error",
            true
         );
         throw new fkt("Unable to allocate render buffers", var12);
      }

      this.aI = new fjm(this, this.ay);
      this.aC = new fwg(this.aB.b(), $$8, this.an);
      this.ai.a(this.aC);
      this.T = new gar(this, this.N, this.U, this.aC, this.h, this.m, this.aJ);
      this.ai.a(this.T);
      this.j = new fvf(this, this.T.d(), this.ai, this.S);
      this.ai.a(this.j.e());
      this.f = new fvk(this, this.T, this.aK, this.S);
      this.ai.a(this.f);
      this.bg();
      this.ai.a(this.V);
      this.g = new ftc(this.r, this.N);
      this.ai.a(this.g);
      this.aD = new ghs(this.N);
      this.ai.a(this.aD);
      this.aE = new ghr(this.N);
      this.ai.a(this.aE);
      this.aF = new eyv(this.N);
      this.ai.a(this.aF);
      this.au = new fvg();
      this.ai.a(this.au);
      this.ai.a(this.av);
      this.l = new eyt(this);
      this.k = new fyx(this);
      esq $$12 = esq.a(this);
      this.aN = new eug($$12);
      RenderSystem.setErrorCallback(this::a);
      if (this.ap.c != this.Q.k() || this.ap.d != this.Q.l()) {
         StringBuilder $$13 = new StringBuilder(
            "Recovering from unsupported resolution ("
               + this.Q.k()
               + "x"
               + this.Q.l()
               + ").\nPlease make sure you have up-to-date drivers (see aka.ms/mcdriver for instructions)."
         );
         if (eqs.b()) {
            $$13.append("\n\nReported GL debug messages:\n").append(String.join("\n", eqs.a()));
         }

         this.Q.a(this.ap.c, this.ap.d);
         TinyFileDialogs.tinyfd_messageBox("Minecraft", $$13.toString(), "ok", "error", false);
      } else if (this.m.X().c() && !this.Q.j()) {
         this.Q.h();
         this.m.X().a(this.Q.j());
      }

      this.Q.a(this.m.L().c());
      this.Q.b(this.m.E().c());
      this.Q.c();
      this.a();
      this.j.a(this.aj.c());
      this.aL = new glp(this, this.ay, this.W);
      this.aM = fqh.a(this.ay, this.W, $$2);
      this.bs = new exp(this);
      this.bt = new ewz(this);
      this.bt.a(this.m.ap().c() != exj.a);
      this.bu = new fqm(this);
      this.bu.a(this.m.y().c());
      this.bv = frb.a(fqy.a(), this.ay);
      feq.a(this);
      this.a(new fek(vq.c("gui.loadingMinecraft")));
      List<aqo> $$14 = this.al.g();
      this.bo.a(exr.b.a, $$14);
      arw $$15 = this.ai.a(ac.f(), this, I, $$14);
      gma.a.a(glw.C);
      exh.b $$16 = new exh.b($$12, $$0.e);
      this.a(new feq(this, $$15, $$1x -> ac.a($$1x, $$1xx -> this.a($$1xx, $$16), () -> {
            if (aa.aU) {
               this.bj();
            }

            this.bo.a();
            this.a($$16);
         }), false));
      this.aO = fuw.a($$0.e.b());
   }

   private void a(@Nullable exh.b $$0) {
      if (!this.by) {
         this.by = true;
         this.b($$0);
      }
   }

   private void b(@Nullable exh.b $$0) {
      Runnable $$1 = this.c($$0);
      gma.a.b(glw.C);
      gma.a.b(glw.z);
      gma.a.a(this.aL.a());
      $$1.run();
   }

   public boolean c() {
      return this.by;
   }

   private Runnable c(@Nullable exh.b $$0) {
      List<Function<Runnable, ffe>> $$1 = new ArrayList<>();
      this.a($$1);
      Runnable $$2 = () -> {
         if ($$0 != null && $$0.b().a()) {
            fuv.a(this, $$0.b(), $$0.a());
         } else {
            this.a(new ffj(true));
         }
      };

      for (Function<Runnable, ffe> $$3 : Lists.reverse($$1)) {
         ffe $$4 = $$3.apply($$2);
         $$2 = () -> this.a($$4);
      }

      return $$2;
   }

   private void a(List<Function<Runnable, ffe>> $$0) {
      if (this.m.ae) {
         $$0.add($$0x -> new fdp(this.m, $$0x));
      }

      BanDetails $$1 = this.F();
      if ($$1 != null) {
         $$0.add($$1x -> fdt.a($$1xx -> {
               if ($$1xx) {
                  ac.j().a("https://aka.ms/mcjavamoderation");
               }

               $$1x.run();
            }, $$1));
      }

      ProfileResult $$2 = this.M.join();
      if ($$2 != null) {
         GameProfile $$3 = $$2.profile();
         Set<ProfileActionType> $$4 = $$2.actions();
         if ($$4.contains(ProfileActionType.FORCED_NAME_CHANGE)) {
            $$0.add($$1x -> fdt.a($$3.getName(), $$1x));
         }

         if ($$4.contains(ProfileActionType.USING_BANNED_SKIN)) {
            $$0.add(fdt::a);
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
      this.Q.b(this.be());
   }

   private String be() {
      StringBuilder $$0 = new StringBuilder("Minecraft");
      if (e().a()) {
         $$0.append("*");
      }

      $$0.append(" ");
      $$0.append(aa.b().c());
      fpy $$1 = this.J();
      if ($$1 != null && $$1.m().i()) {
         $$0.append(" - ");
         fqi $$2 = this.Q();
         if (this.aP != null && !this.aP.p()) {
            $$0.append(ghz.a("title.singleplayer"));
         } else if ($$2 != null && $$2.e()) {
            $$0.append(ghz.a("title.multiplayer.realms"));
         } else if (this.aP == null && ($$2 == null || !$$2.d())) {
            $$0.append(ghz.a("title.multiplayer.other"));
         } else {
            $$0.append(ghz.a("title.multiplayer.lan"));
         }
      }

      return $$0.toString();
   }

   private UserApiService a(YggdrasilAuthenticationService $$0, fks $$1) {
      return $$0.createUserApiService($$1.a.a.d());
   }

   public static awg e() {
      return awg.a("vanilla", ClientBrandRetriever::getClientModName, "Client", exh.class);
   }

   private void a(Throwable $$0, @Nullable exh.b $$1) {
      if (this.al.d().size() > 1) {
         this.a($$0, null, $$1);
      } else {
         ac.a($$0);
      }
   }

   public void a(Throwable $$0, @Nullable vq $$1, @Nullable exh.b $$2) {
      F.info("Caught error loading resourcepacks, removing all selected resourcepacks", $$0);
      this.bo.a($$0);
      this.ak.b();
      this.al.a(Collections.emptyList());
      this.m.i.clear();
      this.m.j.clear();
      this.m.as();
      this.a(true, $$2).thenRun(() -> this.a($$1));
   }

   private void bf() {
      this.a(null);
      if (this.r != null) {
         this.r.W();
         this.y();
      }

      this.a(new ffj());
      this.a(null);
   }

   private void a(@Nullable vq $$0) {
      fbr $$1 = this.ay();
      fbp.b($$1, fbp.a.c, vq.c("resourcePack.load_fail"), $$0);
   }

   public void f() {
      this.ba = Thread.currentThread();
      if (Runtime.getRuntime().availableProcessors() > 4) {
         this.ba.setPriority(10);
      }

      try {
         boolean $$0 = false;

         while (this.bb) {
            this.bi();

            try {
               bio $$1 = bio.a("Renderer");
               boolean $$2 = this.aN().e();
               this.bj = this.a($$2, $$1);
               this.bj.a();
               this.bn.c();
               this.d(!$$0);
               this.bn.d();
               this.bj.b();
               this.b($$2, $$1);
            } catch (OutOfMemoryError var4) {
               if ($$0) {
                  throw var4;
               }

               this.bl();
               this.a(new fex());
               System.gc();
               F.error(LogUtils.FATAL_MARKER, "Out of memory", var4);
               $$0 = true;
            }
         }
      } catch (y var5) {
         F.error(LogUtils.FATAL_MARKER, "Reported exception thrown!", var5);
         this.c(var5.a());
      } catch (Throwable var6) {
         F.error(LogUtils.FATAL_MARKER, "Unreported exception thrown!", var6);
         this.c(new o("Unexpected error", var6));
      }
   }

   void b(boolean $$0) {
      this.as.a($$0 ? ImmutableMap.of(b, c) : ImmutableMap.of());
   }

   private void bg() {
      this.V
         .a(
            gkt.a,
            $$0 -> new gkm<>(
                  $$0x -> $$0x.a(null, cqq.a.a.c()).stream().map($$0xx -> n.a($$0xx.getString()).trim()).filter($$0xx -> !$$0xx.isEmpty()),
                  $$0x -> Stream.of(kf.h.b($$0x.d())),
                  $$0
               )
         );
      this.V.a(gkt.b, $$0 -> new gkn<>($$0x -> $$0x.f().map(auo::b), $$0));
      this.V
         .a(
            gkt.c,
            $$0 -> new gkm<>(
                  $$0x -> $$0x.e()
                        .stream()
                        .flatMap($$1 -> $$1.b().a($$0x.a()).a(null, cqq.a.a).stream())
                        .map($$0xx -> n.a($$0xx.getString()).trim())
                        .filter($$0xx -> !$$0xx.isEmpty()),
                  $$0x -> $$0x.e().stream().map($$1 -> kf.h.b($$1.b().a($$0x.a()).d())),
                  $$0
               )
         );
      cng.e().a($$0 -> {
         this.a(gkt.a, $$0);
         this.a(gkt.b, $$0);
      });
   }

   private void a(int $$0, long $$1) {
      this.m.L().a(false);
      this.m.as();
   }

   private static boolean bh() {
      String[] $$0 = new String[]{"sun.arch.data.model", "com.ibm.vm.bitmode", "os.arch"};

      for (String $$1 : $$0) {
         String $$2 = System.getProperty($$1);
         if ($$2 != null && $$2.contains("64")) {
            return true;
         }
      }

      return false;
   }

   public eqm g() {
      return this.ap;
   }

   public String h() {
      return this.aa;
   }

   public String i() {
      return this.ab;
   }

   public void a(o $$0) {
      this.bc = () -> this.d($$0);
   }

   public void b(o $$0) {
      this.bc = () -> $$0;
   }

   private void bi() {
      if (this.bc != null) {
         a(this, this.p, this.bc.get());
      }
   }

   public void c(o $$0) {
      o $$1 = this.d($$0);
      this.bl();
      a(this, this.p, $$1);
   }

   public static void a(@Nullable exh $$0, File $$1, o $$2) {
      File $$3 = new File($$1, "crash-reports");
      File $$4 = new File($$3, "crash-" + ac.e() + "-client.txt");
      aja.a($$2.e());
      if ($$0 != null) {
         $$0.aq.h();
      }

      if ($$2.f() != null) {
         aja.a("#@!@# Game crashed! Crash report saved to: #@!@# " + $$2.f());
         System.exit(-1);
      } else if ($$2.a($$4)) {
         aja.a("#@!@# Game crashed! Crash report saved to: #@!@# " + $$4.getAbsolutePath());
         System.exit(-1);
      } else {
         aja.a("#@?@# Game crashed! Crash report could not be saved. #@?@#");
         System.exit(-2);
      }
   }

   public boolean j() {
      return this.m.N().c();
   }

   public CompletableFuture<Void> k() {
      return this.a(false, null);
   }

   private CompletableFuture<Void> a(boolean $$0, @Nullable exh.b $$1) {
      if (this.bh != null) {
         return this.bh;
      } else {
         CompletableFuture<Void> $$2 = new CompletableFuture<>();
         if (!$$0 && this.aY instanceof feq) {
            this.bh = $$2;
            return $$2;
         } else {
            this.al.a();
            List<aqo> $$3 = this.al.g();
            if (!$$0) {
               this.bo.a(exr.b.b, $$3);
            }

            this.a(new feq(this, this.ai.a(ac.f(), this, I, $$3), $$3x -> ac.a($$3x, $$2xx -> {
                  if ($$0) {
                     this.ak.c();
                     this.bf();
                  } else {
                     this.a($$2xx, $$1);
                  }
               }, () -> {
                  this.f.f();
                  this.bo.a();
                  this.ak.d();
                  $$2.complete(null);
                  this.a($$1);
               }), !$$0));
            return $$2;
         }
      }
   }

   private void bj() {
      boolean $$0 = false;
      fwf $$1 = this.an().a();
      giu $$2 = $$1.a().a();

      for (cyo $$3 : kf.e) {
         UnmodifiableIterator $$10 = $$3.n().a().iterator();

         while ($$10.hasNext()) {
            dlf $$4 = (dlf)$$10.next();
            if ($$4.l() == det.c) {
               giu $$5 = $$1.b($$4);
               if ($$5 == $$2) {
                  F.debug("Missing model for: {}", $$4);
                  $$0 = true;
               }
            }
         }
      }

      ggu $$6 = $$2.e();

      for (cyo $$7 : kf.e) {
         UnmodifiableIterator var17 = $$7.n().a().iterator();

         while (var17.hasNext()) {
            dlf $$8 = (dlf)var17.next();
            ggu $$9 = $$1.a($$8);
            if (!$$8.i() && $$9 == $$6) {
               F.debug("Missing particle icon for: {}", $$8);
            }
         }
      }

      for (cou $$10 : kf.h) {
         coz $$11 = $$10.ao_();
         String $$12 = $$11.r();
         String $$13 = vq.c($$12).getString();
         if ($$13.toLowerCase(Locale.ROOT).equals($$10.a())) {
            F.debug("Missing translation for: {} {} {}", new Object[]{$$11, $$12, $$10});
         }
      }

      $$0 |= fer.a();
      $$0 |= gau.a();
      if ($$0) {
         throw new IllegalStateException("Your game data is foobar, fix the errors above!");
      }
   }

   public eil l() {
      return this.ad;
   }

   private void a(String $$0) {
      exh.a $$1 = this.H();
      if (!$$1.a(this.R())) {
         if (this.l.b()) {
            this.l.b(false);
            this.a(new fdw($$0x -> {
               if ($$0x) {
                  ac.j().a("https://aka.ms/JavaAccountSettings");
               }

               this.a(null);
            }, exh.a.e, "https://aka.ms/JavaAccountSettings", true));
         } else {
            vq $$2 = $$1.a();
            this.l.a($$2, false);
            this.bt.c($$2);
            this.l.b($$1 == exh.a.d);
         }
      } else {
         this.a(new fdv($$0));
      }
   }

   public void a(@Nullable ffe $$0) {
      if (aa.aU && Thread.currentThread() != this.ba) {
         F.error("setScreen called from non-game thread");
      }

      if (this.y != null) {
         this.y.k();
      }

      if ($$0 == null && this.aZ) {
         throw new IllegalStateException("Trying to return to in-game GUI during disconnection");
      } else {
         if ($$0 == null && this.r == null) {
            $$0 = new ffj();
         } else if ($$0 == null && this.s.ex()) {
            if (this.s.o()) {
               $$0 = new fed(null, this.r.k().l());
            } else {
               this.s.fR();
            }
         }

         this.y = $$0;
         if (this.y != null) {
            this.y.aI_();
         }

         erw.a();
         if ($$0 != null) {
            this.n.j();
            exf.b();
            $$0.b(this, this.Q.o(), this.Q.p());
            this.x = false;
         } else {
            this.aq.i();
            this.n.i();
         }

         this.d();
      }
   }

   public void a(@Nullable fey $$0) {
      this.aY = $$0;
   }

   public void m() {
      try {
         F.info("Stopping!");

         try {
            this.bt.c();
         } catch (Throwable var7) {
         }

         try {
            if (this.r != null) {
               this.r.W();
            }

            this.y();
         } catch (Throwable var6) {
         }

         if (this.y != null) {
            this.y.k();
         }

         this.close();
      } finally {
         ac.b = System::nanoTime;
         if (this.bc == null) {
            System.exit(0);
         }
      }
   }

   @Override
   public void close() {
      if (this.br != null) {
         this.br.a();
      }

      try {
         this.aL.close();
         this.av.close();
         this.aB.close();
         this.as.close();
         this.j.close();
         this.f.close();
         this.aq.g();
         this.g.a();
         this.aE.close();
         this.aD.close();
         this.aF.close();
         this.N.close();
         this.ai.close();
         fch.b();
         ac.i();
      } catch (Throwable var5) {
         F.error("Shutdown failure!", var5);
         throw var5;
      } finally {
         this.P.close();
         this.Q.close();
      }
   }

   private void d(boolean $$0) {
      this.Q.a("Pre render");
      long $$1 = ac.c();
      if (this.Q.b()) {
         this.p();
      }

      if (this.bh != null && !(this.aY instanceof feq)) {
         CompletableFuture<Void> $$2 = this.bh;
         this.bh = null;
         this.k().thenRun(() -> $$2.complete(null));
      }

      Runnable $$3;
      while (($$3 = this.bg.poll()) != null) {
         $$3.run();
      }

      if ($$0) {
         int $$4 = this.R.a(ac.b());
         this.bj.a("scheduledExecutables");
         this.bv();
         this.bj.c();
         this.bj.a("tick");

         for (int $$5 = 0; $$5 < Math.min(10, $$4); $$5++) {
            this.bj.d("clientTick");
            this.s();
         }

         this.bj.c();
      }

      this.Q.a("Render");
      this.bj.a("sound");
      this.aq.a(this.j.m());
      this.bj.c();
      this.bj.a("render");
      long $$6 = ac.c();
      boolean $$8;
      if (!this.aN().d() && !this.bn.e()) {
         $$8 = false;
         this.bq = 0.0;
      } else {
         $$8 = this.br == null || this.br.b();
         if ($$8) {
            ert.a().ifPresent(ert::b);
         }
      }

      RenderSystem.clear(16640, a);
      this.ap.a(true);
      fve.a();
      this.bj.a("display");
      RenderSystem.enableCull();
      this.bj.b("mouse");
      this.n.a();
      this.bj.c();
      if (!this.x) {
         this.bj.b("gameRenderer");
         this.j.a(this.aT ? this.aU : this.R.a, $$1, $$0);
         this.bj.c();
      }

      if (this.bm != null) {
         this.bj.a("fpsPie");
         eyu $$9 = new eyu(this, this.S.c());
         this.a($$9, this.bm);
         $$9.e();
         this.bj.c();
      }

      this.bj.a("blit");
      this.ap.e();
      this.ap.a(this.Q.k(), this.Q.l());
      this.be = ac.c() - $$6;
      if ($$8) {
         ert.a().ifPresent($$0x -> this.br = $$0x.c());
      }

      this.bj.b("updateDisplay");
      this.Q.e();
      int $$10 = this.bk();
      if ($$10 < 260) {
         RenderSystem.limitDisplayFPS($$10);
      }

      this.bj.b("yield");
      Thread.yield();
      this.bj.c();
      this.Q.a("Post render");
      this.aX++;
      boolean $$11 = this.S() && (this.y != null && this.y.m() || this.aY != null && this.aY.a()) && !this.aP.p();
      if (this.aT != $$11) {
         if ($$11) {
            this.aU = this.R.a;
         } else {
            this.R.a = this.aU;
         }

         this.aT = $$11;
      }

      long $$12 = ac.c();
      long $$13 = $$12 - this.aV;
      if ($$8) {
         this.bp = $$13;
      }

      this.aN().a($$13);
      this.aV = $$12;
      this.bj.a("fpsUpdate");
      if (this.br != null && this.br.b()) {
         this.bq = (double)this.br.c() * 100.0 / (double)this.bp;
      }

      while (ac.b() >= this.aW + 1000L) {
         String $$14;
         if (this.bq > 0.0) {
            $$14 = " GPU: " + (this.bq > 100.0 ? n.m + "100%" : Math.round(this.bq) + "%");
         } else {
            $$14 = "";
         }

         bd = this.aX;
         this.z = String.format(
            Locale.ROOT,
            "%d fps T: %s%s%s%s B: %d%s",
            bd,
            $$10 == 260 ? "inf" : $$10,
            this.m.L().c() ? " vsync " : " ",
            this.m.j().c(),
            this.m.i().c() == ewv.a ? "" : (this.m.i().c() == ewv.b ? " fast-clouds" : " fancy-clouds"),
            this.m.C().c(),
            $$14
         );
         this.aW += 1000L;
         this.aX = 0;
      }

      this.bj.c();
   }

   private bil a(boolean $$0, @Nullable bio $$1) {
      if (!$$0) {
         this.bl.b();
         if (!this.bn.e() && $$1 == null) {
            return bii.a;
         }
      }

      bil $$2;
      if ($$0) {
         if (!this.bl.a()) {
            this.bk = 0;
            this.bl.c();
         }

         this.bk++;
         $$2 = this.bl.d();
      } else {
         $$2 = bii.a;
      }

      if (this.bn.e()) {
         $$2 = bil.a($$2, this.bn.f());
      }

      return bio.a($$2, $$1);
   }

   private void b(boolean $$0, @Nullable bio $$1) {
      if ($$1 != null) {
         $$1.b();
      }

      if ($$0) {
         this.bm = this.bl.e();
      } else {
         this.bm = null;
      }

      this.bj = this.bl.d();
   }

   @Override
   public void a() {
      int $$0 = this.Q.a(this.m.an().c(), this.j());
      this.Q.a((double)$$0);
      if (this.y != null) {
         this.y.a(this, this.Q.o(), this.Q.p());
      }

      eqm $$1 = this.g();
      $$1.a(this.Q.k(), this.Q.l(), a);
      this.j.a(this.Q.k(), this.Q.l());
      this.n.g();
   }

   @Override
   public void b() {
      this.n.k();
   }

   public int n() {
      return bd;
   }

   public long o() {
      return this.be;
   }

   private int bk() {
      return this.r != null || this.y == null && this.aY == null ? this.Q.d() : 60;
   }

   private void bl() {
      try {
         awf.b();
         this.f.p();
      } catch (Throwable var3) {
      }

      try {
         System.gc();
         if (this.aR && this.aP != null) {
            this.aP.a(true);
         }

         this.b((ffe)(new fek(vq.c("menu.savingLevel"))));
      } catch (Throwable var2) {
      }

      System.gc();
   }

   public boolean a(Consumer<vq> $$0) {
      if (this.bn.e()) {
         this.bm();
         return false;
      } else {
         Consumer<bik> $$1 = $$1x -> {
            if ($$1x != big.a) {
               int $$2x = $$1x.f();
               double $$3x = (double)$$1x.g() / (double)axh.a;
               this.execute(
                  () -> $$0.accept(
                        vq.a("commands.debug.stopped", String.format(Locale.ROOT, "%.2f", $$3x), $$2x, String.format(Locale.ROOT, "%.2f", (double)$$2x / $$3x))
                     )
               );
            }
         };
         Consumer<Path> $$2 = $$1x -> {
            vq $$2x = vq.b($$1x.toString()).a(n.t).a($$1xx -> $$1xx.a(new vo(vo.a.b, $$1x.toFile().getParent())));
            this.execute(() -> $$0.accept(vq.a("debug.profiling.stop", $$2x)));
         };
         ab $$3 = a(new ab(), this, this.am, this.aa, this.m);
         Consumer<List<Path>> $$4 = $$2x -> {
            Path $$3x = this.a($$3, $$2x);
            $$2.accept($$3x);
         };
         Consumer<Path> $$5;
         if (this.aP == null) {
            $$5 = $$1x -> $$4.accept(ImmutableList.of($$1x));
         } else {
            this.aP.b($$3);
            CompletableFuture<Path> $$6 = new CompletableFuture<>();
            CompletableFuture<Path> $$7 = new CompletableFuture<>();
            CompletableFuture.allOf($$6, $$7).thenRunAsync(() -> $$4.accept(ImmutableList.of($$6.join(), $$7.join())), ac.g());
            this.aP.a($$0x -> {
            }, $$7::complete);
            $$5 = $$6::complete;
         }

         this.bn = bju.a(new fut(ac.b, this.f), ac.b, ac.g(), new bka("client"), $$1x -> {
            this.bn = bjv.a;
            $$1.accept($$1x);
         }, $$5);
         return true;
      }
   }

   private void bm() {
      this.bn.a();
      if (this.aP != null) {
         this.aP.aU();
      }
   }

   private void bn() {
      this.bn.b();
      if (this.aP != null) {
         this.aP.aV();
      }
   }

   private Path a(ab $$0, List<Path> $$1) {
      String $$2;
      if (this.R()) {
         $$2 = this.T().aY().e();
      } else {
         fqi $$3 = this.Q();
         $$2 = $$3 != null ? $$3.a : "unknown";
      }

      Path $$7;
      try {
         String $$5 = String.format(Locale.ROOT, "%s-%s-%s", ac.e(), $$2, aa.b().b());
         String $$6 = v.a(bka.a, $$5, ".zip");
         $$7 = bka.a.resolve($$6);
      } catch (IOException var21) {
         throw new UncheckedIOException(var21);
      }

      try (avs $$10 = new avs($$7)) {
         $$10.a(Paths.get("system.txt"), $$0.a());
         $$10.a(Paths.get("client").resolve(this.m.ay().getName()), this.m.az());
         $$1.forEach($$10::a);
      } finally {
         for (Path $$13 : $$1) {
            try {
               FileUtils.forceDelete($$13.toFile());
            } catch (IOException var18) {
               F.warn("Failed to delete temporary profiling result {}", $$13, var18);
            }
         }
      }

      return $$7;
   }

   public void a(int $$0) {
      if (this.bm != null) {
         List<bin> $$1 = this.bm.a(this.bB);
         if (!$$1.isEmpty()) {
            bin $$2 = $$1.remove(0);
            if ($$0 == 0) {
               if (!$$2.d.isEmpty()) {
                  int $$3 = this.bB.lastIndexOf(30);
                  if ($$3 >= 0) {
                     this.bB = this.bB.substring(0, $$3);
                  }
               }
            } else {
               $$0--;
               if ($$0 < $$1.size() && !"unspecified".equals($$1.get($$0).d)) {
                  if (!this.bB.isEmpty()) {
                     this.bB = this.bB + "\u001e";
                  }

                  this.bB = this.bB + $$1.get($$0).d;
               }
            }
         }
      }
   }

   private void a(eyu $$0, bik $$1) {
      List<bin> $$2 = $$1.a(this.bB);
      bin $$3 = $$2.remove(0);
      RenderSystem.clear(256, a);
      RenderSystem.setShader(fvf::q);
      Matrix4f $$4 = new Matrix4f().setOrtho(0.0F, (float)this.Q.k(), (float)this.Q.l(), 0.0F, 1000.0F, 3000.0F);
      RenderSystem.setProjectionMatrix($$4, esi.b);
      esa $$5 = RenderSystem.getModelViewStack();
      $$5.a();
      $$5.e();
      $$5.a(0.0F, 0.0F, -2000.0F);
      RenderSystem.applyModelViewMatrix();
      RenderSystem.lineWidth(1.0F);
      esc $$6 = esc.b();
      erv $$7 = $$6.d();
      int $$8 = 160;
      int $$9 = this.Q.k() - 160 - 10;
      int $$10 = this.Q.l() - 320;
      RenderSystem.enableBlend();
      $$7.a(esf.b.h, ery.n);
      $$7.a((double)((float)$$9 - 176.0F), (double)((float)$$10 - 96.0F - 16.0F), 0.0).a(200, 0, 0, 0).e();
      $$7.a((double)((float)$$9 - 176.0F), (double)($$10 + 320), 0.0).a(200, 0, 0, 0).e();
      $$7.a((double)((float)$$9 + 176.0F), (double)($$10 + 320), 0.0).a(200, 0, 0, 0).e();
      $$7.a((double)((float)$$9 + 176.0F), (double)((float)$$10 - 96.0F - 16.0F), 0.0).a(200, 0, 0, 0).e();
      $$6.c();
      RenderSystem.disableBlend();
      double $$11 = 0.0;

      for (bin $$12 : $$2) {
         int $$13 = awh.a($$12.a / 4.0) + 1;
         $$7.a(esf.b.g, ery.n);
         int $$14 = $$12.a();
         int $$15 = $$14 >> 16 & 0xFF;
         int $$16 = $$14 >> 8 & 0xFF;
         int $$17 = $$14 & 0xFF;
         $$7.a((double)$$9, (double)$$10, 0.0).a($$15, $$16, $$17, 255).e();

         for (int $$18 = $$13; $$18 >= 0; $$18--) {
            float $$19 = (float)(($$11 + $$12.a * (double)$$18 / (double)$$13) * (float) (Math.PI * 2) / 100.0);
            float $$20 = awh.a($$19) * 160.0F;
            float $$21 = awh.b($$19) * 160.0F * 0.5F;
            $$7.a((double)((float)$$9 + $$20), (double)((float)$$10 - $$21), 0.0).a($$15, $$16, $$17, 255).e();
         }

         $$6.c();
         $$7.a(esf.b.f, ery.n);

         for (int $$22 = $$13; $$22 >= 0; $$22--) {
            float $$23 = (float)(($$11 + $$12.a * (double)$$22 / (double)$$13) * (float) (Math.PI * 2) / 100.0);
            float $$24 = awh.a($$23) * 160.0F;
            float $$25 = awh.b($$23) * 160.0F * 0.5F;
            if (!($$25 > 0.0F)) {
               $$7.a((double)((float)$$9 + $$24), (double)((float)$$10 - $$25), 0.0).a($$15 >> 1, $$16 >> 1, $$17 >> 1, 255).e();
               $$7.a((double)((float)$$9 + $$24), (double)((float)$$10 - $$25 + 10.0F), 0.0).a($$15 >> 1, $$16 >> 1, $$17 >> 1, 255).e();
            }
         }

         $$6.c();
         $$11 += $$12.a;
      }

      DecimalFormat $$26 = new DecimalFormat("##0.00");
      $$26.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.ROOT));
      String $$27 = bik.b($$3.d);
      String $$28 = "";
      if (!"unspecified".equals($$27)) {
         $$28 = $$28 + "[0] ";
      }

      if ($$27.isEmpty()) {
         $$28 = $$28 + "ROOT ";
      } else {
         $$28 = $$28 + $$27 + " ";
      }

      int $$29 = 16777215;
      $$0.b(this.h, $$28, $$9 - 160, $$10 - 80 - 16, 16777215);
      $$28 = $$26.format($$3.b) + "%";
      $$0.b(this.h, $$28, $$9 + 160 - this.h.b($$28), $$10 - 80 - 16, 16777215);

      for (int $$30 = 0; $$30 < $$2.size(); $$30++) {
         bin $$31 = $$2.get($$30);
         StringBuilder $$32 = new StringBuilder();
         if ("unspecified".equals($$31.d)) {
            $$32.append("[?] ");
         } else {
            $$32.append("[").append($$30 + 1).append("] ");
         }

         String $$33 = $$32.append($$31.d).toString();
         $$0.b(this.h, $$33, $$9 - 160, $$10 + 80 + $$30 * 8 + 20, $$31.a());
         $$33 = $$26.format($$31.a) + "%";
         $$0.b(this.h, $$33, $$9 + 160 - 50 - this.h.b($$33), $$10 + 80 + $$30 * 8 + 20, $$31.a());
         $$33 = $$26.format($$31.b) + "%";
         $$0.b(this.h, $$33, $$9 + 160 - this.h.b($$33), $$10 + 80 + $$30 * 8 + 20, $$31.a());
      }

      $$5.b();
      RenderSystem.applyModelViewMatrix();
   }

   public void p() {
      this.bb = false;
   }

   public boolean q() {
      return this.bb;
   }

   public void c(boolean $$0) {
      if (this.y == null) {
         boolean $$1 = this.S() && !this.aP.p();
         if ($$1) {
            this.a(new fez(!$$0));
            this.aq.e();
         } else {
            this.a(new fez(true));
         }
      }
   }

   private void e(boolean $$0) {
      if (!$$0) {
         this.w = 0;
      }

      if (this.w <= 0 && !this.s.fn()) {
         if ($$0 && this.v != null && this.v.c() == enq.a.b) {
            eno $$1 = (eno)this.v;
            hz $$2 = $$1.a();
            if (!this.r.a_($$2).i()) {
               ie $$3 = $$1.b();
               if (this.q.b($$2, $$3)) {
                  this.g.a($$2, $$3);
                  this.s.a(blt.a);
               }
            }
         } else {
            this.q.b();
         }
      }
   }

   private boolean bo() {
      if (this.w > 0) {
         return false;
      } else if (this.v == null) {
         F.error("Null returned as 'hitResult', this shouldn't happen!");
         if (this.q.e()) {
            this.w = 10;
         }

         return false;
      } else if (this.s.A()) {
         return false;
      } else {
         coz $$0 = this.s.b(blt.a);
         if (!$$0.a(this.r.I())) {
            return false;
         } else {
            boolean $$1 = false;
            switch (this.v.c()) {
               case c:
                  this.q.a(this.s, ((enp)this.v).a());
                  break;
               case b:
                  eno $$2 = (eno)this.v;
                  hz $$3 = $$2.a();
                  if (!this.r.a_($$3).i()) {
                     this.q.a($$3, $$2.b());
                     if (this.r.a_($$3).i()) {
                        $$1 = true;
                     }
                     break;
                  }
               case a:
                  if (this.q.e()) {
                     this.w = 10;
                  }

                  this.s.gn();
            }

            this.s.a(blt.a);
            return $$1;
         }
      }
   }

   private void bp() {
      if (!this.q.k()) {
         this.aS = 4;
         if (!this.s.A()) {
            if (this.v == null) {
               F.warn("Null returned as 'hitResult', this shouldn't happen!");
            }

            for (blt $$0 : blt.values()) {
               coz $$1 = this.s.b($$0);
               if (!$$1.a(this.r.I())) {
                  return;
               }

               if (this.v != null) {
                  switch (this.v.c()) {
                     case c:
                        enp $$2 = (enp)this.v;
                        bno $$3 = $$2.a();
                        if (!this.r.D_().a($$3.dm())) {
                           return;
                        }

                        blu $$4 = this.q.a(this.s, $$3, $$2, $$0);
                        if (!$$4.a()) {
                           $$4 = this.q.a(this.s, $$3, $$0);
                        }

                        if ($$4.a()) {
                           if ($$4.b()) {
                              this.s.a($$0);
                           }

                           return;
                        }
                        break;
                     case b:
                        eno $$5 = (eno)this.v;
                        int $$6 = $$1.M();
                        blu $$7 = this.q.a(this.s, $$0, $$5);
                        if ($$7.a()) {
                           if ($$7.b()) {
                              this.s.a($$0);
                              if (!$$1.b() && ($$1.M() != $$6 || this.q.f())) {
                                 this.j.b.a($$0);
                              }
                           }

                           return;
                        }

                        if ($$7 == blu.e) {
                           return;
                        }
                  }
               }

               if (!$$1.b()) {
                  blu $$8 = this.q.a(this.s, $$0);
                  if ($$8.a()) {
                     if ($$8.b()) {
                        this.s.a($$0);
                     }

                     this.j.b.a($$0);
                     return;
                  }
               }
            }
         }
      }
   }

   public glg r() {
      return this.ar;
   }

   public void s() {
      this.bA++;
      if (this.r != null && !this.aT) {
         this.r.s().m();
      }

      if (this.aS > 0) {
         this.aS--;
      }

      this.bj.a("gui");
      this.bu.a();
      this.l.a(this.aT);
      this.bj.c();
      this.j.a(1.0F);
      this.aH.a(this.r, this.v);
      this.bj.a("gameMode");
      if (!this.aT && this.r != null) {
         this.q.c();
      }

      this.bj.b("textures");
      boolean $$0 = this.r == null || this.r.s().i();
      if ($$0) {
         this.N.e();
      }

      if (this.y != null || this.s == null) {
         if (this.y instanceof fem $$1 && !this.s.fD()) {
            $$1.o();
         }
      } else if (this.s.ex() && !(this.y instanceof fed)) {
         this.a(null);
      } else if (this.s.fD() && this.r != null) {
         this.a(new fem());
      }

      if (this.y != null) {
         this.w = 10000;
      }

      if (this.y != null) {
         ffe.a(() -> this.y.e(), "Ticking screen", this.y.getClass().getCanonicalName());
      }

      if (!this.aN().d()) {
         this.l.l();
      }

      if (this.aY == null && this.y == null) {
         this.bj.b("Keybindings");
         this.bz();
         if (this.w > 0) {
            this.w--;
         }
      }

      if (this.r != null) {
         this.bj.b("gameRenderer");
         if (!this.aT) {
            this.j.f();
         }

         this.bj.b("levelRenderer");
         if (!this.aT) {
            this.f.o();
         }

         this.bj.b("level");
         if (!this.aT) {
            this.r.f();
         }
      } else if (this.j.g() != null) {
         this.j.b();
      }

      if (!this.aT) {
         this.ar.a();
      }

      this.aq.a(this.aT);
      if (this.r != null) {
         if (!this.aT) {
            if (!this.m.s && this.by()) {
               vq $$2 = vq.c("tutorial.socialInteractions.title");
               vq $$3 = vq.a("tutorial.socialInteractions.description", gmo.a("socialInteractions"));
               this.bi = new fbs(fbs.a.f, $$2, $$3, true);
               this.aH.a(this.bi, 160);
               this.m.s = true;
               this.m.as();
            }

            this.aH.d();

            try {
               this.r.a(() -> true);
            } catch (Throwable var5) {
               o $$5 = o.a(var5, "Exception in world tick");
               if (this.r == null) {
                  p $$6 = $$5.a("Affected level");
                  $$6.a("Problem", "Level is null!");
               } else {
                  this.r.a($$5);
               }

               throw new y($$5);
            }
         }

         this.bj.b("animateTick");
         if (!this.aT && $$0) {
            this.r.b(this.s.dq(), this.s.ds(), this.s.dw());
         }

         this.bj.b("particles");
         if (!this.aT && $$0) {
            this.g.b();
         }
      } else if (this.aQ != null) {
         this.bj.b("pendingConnection");
         this.aQ.b();
      }

      this.bj.b("keyboard");
      this.o.b();
      this.bj.c();
   }

   private boolean by() {
      return !this.aR || this.aP != null && this.aP.p();
   }

   private void bz() {
      while (this.m.P.g()) {
         ewt $$0 = this.m.ax();
         this.m.a(this.m.ax().c());
         if ($$0.a() != this.m.ax().a()) {
            this.j.a(this.m.ax().a() ? this.am() : null);
         }

         this.f.r();
      }

      while (this.m.Q.g()) {
         this.m.ab = !this.m.ab;
      }

      for (int $$1 = 0; $$1 < 9; $$1++) {
         boolean $$2 = this.m.V.e();
         boolean $$3 = this.m.W.e();
         if (this.m.U[$$1].g()) {
            if (this.s.P_()) {
               this.l.g().a($$1);
            } else if (!this.s.f() || this.y != null || !$$3 && !$$2) {
               this.s.fT().l = $$1;
            } else {
               fgs.a(this, $$1, $$3, $$2);
            }
         }
      }

      while (this.m.N.g()) {
         if (!this.by()) {
            this.s.a(J, true);
            this.bt.c(J);
         } else {
            if (this.bi != null) {
               this.aH.a(this.bi);
               this.bi = null;
            }

            this.a(new fjo());
         }
      }

      while (this.m.E.g()) {
         if (this.q.g()) {
            this.s.i();
         } else {
            this.aH.a();
            this.a(new fhd(this.s));
         }
      }

      while (this.m.T.g()) {
         this.a(new ffu(this.s.cq.r()));
      }

      while (this.m.F.g()) {
         if (!this.s.P_()) {
            this.J().b(new afu(afu.a.g, hz.c, ie.a));
         }
      }

      while (this.m.G.g()) {
         if (!this.s.P_() && this.s.a(ffe.t())) {
            this.s.a(blt.a);
         }
      }

      while (this.m.K.g()) {
         this.a("");
      }

      if (this.y == null && this.aY == null && this.m.M.g()) {
         this.a("/");
      }

      boolean $$4 = false;
      if (this.s.fn()) {
         if (!this.m.H.e()) {
            this.q.b(this.s);
         }

         while (this.m.I.g()) {
         }

         while (this.m.H.g()) {
         }

         while (this.m.J.g()) {
         }
      } else {
         while (this.m.I.g()) {
            $$4 |= this.bo();
         }

         while (this.m.H.g()) {
            this.bp();
         }

         while (this.m.J.g()) {
            this.bB();
         }
      }

      if (this.m.H.e() && this.aS == 0 && !this.s.fn()) {
         this.bp();
      }

      this.e(this.y == null && !$$4 && this.m.I.e() && this.n.h());
   }

   public glp t() {
      return this.aL;
   }

   public double u() {
      return this.bq;
   }

   public fqh v() {
      return this.aM;
   }

   public fke w() {
      return new fke(this, this.ad);
   }

   public void a(eil.c $$0, arl $$1, aju $$2, boolean $$3) {
      this.y();
      this.X.set(null);
      Instant $$4 = Instant.now();

      try {
         $$0.a($$2.c().a(), $$2.d());
         ajr $$5 = ajr.a(this.aw, this.p);
         $$5.f().a(this);
         dke.a($$5, this);
         asj.a(false);
         this.aP = MinecraftServer.a((Function<Thread, gky>)($$4x -> new gky($$4x, this, $$0, $$1, $$2, $$5, $$0xx -> {
               api $$1xx = api.b($$0xx + 0);
               this.X.set($$1xx);
               return aph.a($$1xx, this.bg::add);
            })));
         this.aR = true;
         this.a(fqy.a());
         this.aO.a(fuw.c.a, $$0.d(), $$2.d().e());
      } catch (Throwable var11) {
         o $$7 = o.a(var11, "Starting integrated server");
         p $$8 = $$7.a("Starting integrated server");
         $$8.a("Level ID", $$0.d());
         $$8.a("Level Name", () -> $$2.d().e());
         throw new y($$7);
      }

      while (this.X.get() == null) {
         Thread.yield();
      }

      feo $$9 = new feo(this.X.get());
      this.a($$9);
      this.bj.a("waitForServer");

      for (; !this.aP.ag() || this.aY != null; this.bi()) {
         $$9.e();
         this.d(false);

         try {
            Thread.sleep(16L);
         } catch (InterruptedException var10) {
         }
      }

      this.bj.c();
      Duration $$10 = Duration.between($$4, Instant.now());
      SocketAddress $$11 = this.aP.af().a();
      uo $$12 = uo.a($$11);
      $$12.a($$11.toString(), 0, new fpw($$12, this, null, null, $$3, $$10, $$0x -> {
      }, null));
      $$12.a(new ahg(this.V().c(), this.V().b()));
      this.aQ = $$12;
   }

   public void a(fpx $$0) {
      ffb $$1 = new ffb(true);
      $$1.a(vq.c("connect.joining"));
      this.e($$1);
      this.r = $$0;
      this.b($$0);
      if (!this.aR) {
         ajr $$2 = ajr.a(this.aw, this.p);
         $$2.f().a(this);
         dke.a($$2, this);
         asj.a(false);
      }
   }

   public void y() {
      this.a(new ffb(true), false);
   }

   public void b(ffe $$0) {
      this.a($$0, false);
   }

   public void a(ffe $$0, boolean $$1) {
      fpy $$2 = this.J();
      if ($$2 != null) {
         this.bu();
         $$2.j();
         if (!$$1) {
            this.z();
         }
      }

      this.aI.b();
      if (this.bn.e()) {
         this.bn();
      }

      gky $$3 = this.aP;
      this.aP = null;
      this.j.i();
      this.q = null;
      this.bt.b();
      this.aZ = true;

      try {
         this.e($$0);
         if (this.r != null) {
            if ($$3 != null) {
               this.bj.a("waitForServer");

               while (!$$3.E()) {
                  this.d(false);
               }

               this.bj.c();
            }

            this.l.i();
            this.aR = false;
         }

         this.r = null;
         this.b(null);
         this.s = null;
      } finally {
         this.aZ = false;
      }

      dke.c();
   }

   public void z() {
      this.ak.i();
      this.bv();
   }

   public void c(ffe $$0) {
      fpy $$1 = this.J();
      if ($$1 != null) {
         $$1.k();
      }

      if (this.bn.e()) {
         this.bn();
      }

      this.j.i();
      this.q = null;
      this.bt.b();
      this.aZ = true;

      try {
         this.e($$0);
         this.l.i();
         this.r = null;
         this.b(null);
         this.s = null;
      } finally {
         this.aZ = false;
      }

      dke.c();
   }

   private void e(ffe $$0) {
      this.bj.a("forcedTick");
      this.aq.f();
      this.t = null;
      this.aQ = null;
      this.a($$0);
      this.d(false);
      this.bj.c();
   }

   public void d(ffe $$0) {
      this.bj.a("forcedTick");
      this.a($$0);
      this.d(false);
      this.bj.c();
   }

   private void b(@Nullable fpx $$0) {
      this.f.a($$0);
      this.g.a($$0);
      this.aK.a($$0);
      this.d();
   }

   private UserProperties bA() {
      return this.az.join();
   }

   public boolean A() {
      return this.B() && this.m.af().c();
   }

   public boolean B() {
      return this.C() && this.bA().flag(UserFlag.OPTIONAL_TELEMETRY_AVAILABLE);
   }

   public boolean C() {
      return aa.aU ? false : this.bA().flag(UserFlag.TELEMETRY_ENABLED);
   }

   public boolean D() {
      return this.ag && this.bA().flag(UserFlag.SERVERS_ALLOWED) && this.F() == null && !this.G();
   }

   public boolean E() {
      return this.bA().flag(UserFlag.REALMS_ALLOWED) && this.F() == null;
   }

   @Nullable
   public BanDetails F() {
      return (BanDetails)this.bA().bannedScopes().get("MULTIPLAYER");
   }

   public boolean G() {
      ProfileResult $$0 = this.M.getNow(null);
      return $$0 != null && $$0.actions().contains(ProfileActionType.FORCED_NAME_CHANGE);
   }

   public boolean a(UUID $$0) {
      return this.H().a(false) ? this.aI.c($$0) : (this.s == null || !$$0.equals(this.s.cw())) && !$$0.equals(ac.d);
   }

   public exh.a H() {
      if (this.m.m().c() == chf.c) {
         return exh.a.b;
      } else if (!this.ah) {
         return exh.a.c;
      } else {
         return !this.bA().flag(UserFlag.CHAT_ALLOWED) ? exh.a.d : exh.a.a;
      }
   }

   public final boolean I() {
      return this.af;
   }

   @Nullable
   public fpy J() {
      return this.s == null ? null : this.s.cq;
   }

   public static boolean K() {
      return !E.m.Z;
   }

   public static boolean L() {
      return E.m.j().c().a() >= exa.b.a();
   }

   public static boolean M() {
      return !E.j.a() && E.m.j().c().a() >= exa.c.a();
   }

   public static boolean N() {
      return E.m.k().c();
   }

   private void bB() {
      if (this.v != null && this.v.c() != enq.a.a) {
         boolean $$0 = this.s.fU().d;
         dit $$1 = null;
         enq.a $$2 = this.v.c();
         coz $$6;
         if ($$2 == enq.a.b) {
            hz $$3 = ((eno)this.v).a();
            dlf $$4 = this.r.a_($$3);
            if ($$4.i()) {
               return;
            }

            cyo $$5 = $$4.b();
            $$6 = $$5.a((cvq)this.r, $$3, $$4);
            if ($$6.b()) {
               return;
            }

            if ($$0 && ffe.t() && $$4.t()) {
               $$1 = this.r.c_($$3);
            }
         } else {
            if ($$2 != enq.a.c || !$$0) {
               return;
            }

            bno $$7 = ((enp)this.v).a();
            $$6 = $$7.dz();
            if ($$6 == null) {
               return;
            }
         }

         if ($$6.b()) {
            String $$10 = "";
            if ($$2 == enq.a.b) {
               $$10 = kf.e.b(this.r.a_(((eno)this.v).a()).b()).toString();
            } else if ($$2 == enq.a.c) {
               $$10 = kf.g.b(((enp)this.v).a().ai()).toString();
            }

            F.warn("Picking on: [{}] {} gave null item", $$2, $$10);
         } else {
            chg $$11 = this.s.fT();
            if ($$1 != null) {
               this.a($$6, $$1);
            }

            int $$12 = $$11.b($$6);
            if ($$0) {
               $$11.a($$6);
               this.q.a(this.s.b(blt.a), 36 + $$11.l);
            } else if ($$12 != -1) {
               if (chg.d($$12)) {
                  $$11.l = $$12;
               } else {
                  this.q.a($$12);
               }
            }
         }
      }
   }

   private void a(coz $$0, dit $$1) {
      sw $$2 = $$1.o();
      cms.a($$0, $$1.v(), $$2);
      if ($$0.d() instanceof cpn && $$2.e("SkullOwner")) {
         sw $$3 = $$2.p("SkullOwner");
         sw $$4 = $$0.x();
         $$4.a("SkullOwner", $$3);
         sw $$5 = $$4.p("BlockEntityTag");
         $$5.r("SkullOwner");
         $$5.r("x");
         $$5.r("y");
         $$5.r("z");
      } else {
         sw $$6 = new sw();
         tc $$7 = new tc();
         $$7.add(tr.a("\"(+NBT)\""));
         $$6.a("Lore", $$7);
         $$0.a("display", $$6);
      }
   }

   public o d(o $$0) {
      ab $$1 = $$0.g();
      a($$1, this, this.am, this.aa, this.m);
      this.a($$0.a("Uptime"));
      if (this.r != null) {
         this.r.a($$0);
      }

      if (this.aP != null) {
         this.aP.b($$1);
      }

      this.bo.a($$0);
      return $$0;
   }

   public static void a(@Nullable exh $$0, @Nullable gib $$1, String $$2, @Nullable exl $$3, o $$4) {
      ab $$5 = $$4.g();
      a($$5, $$0, $$1, $$2, $$3);
   }

   private static String a(double $$0) {
      return String.format(Locale.ROOT, "%.3fs", $$0);
   }

   private void a(p $$0) {
      $$0.a("JVM uptime", () -> a((double)ManagementFactory.getRuntimeMXBean().getUptime() / 1000.0));
      $$0.a("Wall uptime", () -> a((double)(System.currentTimeMillis() - this.bz) / 1000.0));
      $$0.a("High-res time", () -> a((double)ac.b() / 1000.0));
      $$0.a("Client ticks", () -> String.format(Locale.ROOT, "%d ticks / %.3fs", this.bA, (double)this.bA / 20.0));
   }

   private static ab a(ab $$0, @Nullable exh $$1, @Nullable gib $$2, String $$3, @Nullable exl $$4) {
      $$0.a("Launched Version", () -> $$3);
      String $$5 = bd();
      if ($$5 != null) {
         $$0.a("Launcher name", $$5);
      }

      $$0.a("Backend library", RenderSystem::getBackendDescription);
      $$0.a("Backend API", RenderSystem::getApiDescription);
      $$0.a("Window size", () -> $$1 != null ? $$1.Q.k() + "x" + $$1.Q.l() : "<not initialized>");
      $$0.a("GL Caps", RenderSystem::getCapsString);
      $$0.a("GL debug messages", () -> eqs.b() ? String.join("\n", eqs.a()) : "<disabled>");
      $$0.a("Using VBOs", () -> "Yes");
      $$0.a("Is Modded", () -> e().b());
      $$0.a("Universe", () -> $$1 != null ? Long.toHexString($$1.K) : "404");
      $$0.a("Type", "Client (map_client.txt)");
      if ($$4 != null) {
         if ($$1 != null) {
            String $$6 = $$1.ah().m();
            if ($$6 != null) {
               $$0.a("GPU Warnings", $$6);
            }
         }

         $$0.a("Graphics mode", $$4.j().c().toString());
         $$0.a("Render Distance", $$4.aA() + "/" + $$4.e().c() + " chunks");
         $$0.a("Resource Packs", () -> {
            StringBuilder $$1x = new StringBuilder();

            for (String $$2x : $$4.i) {
               if ($$1x.length() > 0) {
                  $$1x.append(", ");
               }

               $$1x.append($$2x);
               if ($$4.j.contains($$2x)) {
                  $$1x.append(" (incompatible)");
               }
            }

            return $$1x.toString();
         });
      }

      if ($$2 != null) {
         $$0.a("Current Language", () -> $$2.a());
      }

      $$0.a("Locale", String.valueOf(Locale.getDefault()));
      $$0.a("CPU", eqt::b);
      return $$0;
   }

   public static exh O() {
      return E;
   }

   public CompletableFuture<Void> P() {
      return this.a(this::k).thenCompose($$0 -> (CompletionStage<Void>)$$0);
   }

   public void a(fqy $$0) {
      if (!this.bv.a($$0)) {
         this.bv = frb.a($$0, this.ay);
      }
   }

   @Nullable
   public fqi Q() {
      return x.a(this.J(), fpy::x);
   }

   public boolean R() {
      return this.aR;
   }

   public boolean S() {
      return this.aR && this.aP != null;
   }

   @Nullable
   public gky T() {
      return this.aP;
   }

   public boolean U() {
      gky $$0 = this.T();
      return $$0 != null && !$$0.p();
   }

   public boolean b(UUID $$0) {
      return $$0.equals(this.V().b());
   }

   public exw V() {
      return this.W;
   }

   public GameProfile W() {
      ProfileResult $$0 = this.M.join();
      return $$0 != null ? $$0.profile() : new GameProfile(this.W.b(), this.W.c());
   }

   public Proxy X() {
      return this.ac;
   }

   public ggv Y() {
      return this.N;
   }

   public asa Z() {
      return this.ai;
   }

   public arl aa() {
      return this.al;
   }

   public aqr ab() {
      return this.aj;
   }

   public gjj ac() {
      return this.ak;
   }

   public Path ad() {
      return this.L;
   }

   public gib ae() {
      return this.am;
   }

   public Function<aiy, ggu> a(aiy $$0) {
      return this.aB.a($$0)::a;
   }

   public boolean af() {
      return this.ae;
   }

   public boolean ag() {
      return this.aT;
   }

   public fvg ah() {
      return this.au;
   }

   public gll ai() {
      return this.aq;
   }

   public ath aj() {
      ath $$0 = x.a(this.y, ffe::D);
      if ($$0 != null) {
         return $$0;
      } else if (this.s != null) {
         if (this.s.dM().ae() == cvn.j) {
            return this.l.j().b() ? ati.d : ati.e;
         } else {
            ij<cwm> $$1 = this.s.dM().t(this.s.dm());
            if (!this.ar.c(ati.f) && (!this.s.be() || !$$1.a(aty.Z))) {
               return this.s.dM().ae() != cvn.i && this.s.fU().d && this.s.fU().c ? ati.b : $$1.a().o().orElse(ati.g);
            } else {
               return ati.f;
            }
         }
      } else {
         return ati.a;
      }
   }

   public MinecraftSessionService ak() {
      return this.ax;
   }

   public ghu al() {
      return this.aA;
   }

   @Nullable
   public bno am() {
      return this.t;
   }

   public void a(bno $$0) {
      this.t = $$0;
      this.j.a($$0);
   }

   public boolean b(bno $$0) {
      return $$0.cd() || this.s != null && this.s.P_() && this.m.S.e() && $$0.ai() == bnu.bw;
   }

   @Override
   protected Thread aw() {
      return this.ba;
   }

   @Override
   protected Runnable f(Runnable $$0) {
      return $$0;
   }

   @Override
   protected boolean e(Runnable $$0) {
      return true;
   }

   public fwg an() {
      return this.aC;
   }

   public gar ao() {
      return this.T;
   }

   public fxl ap() {
      return this.aK;
   }

   public gbr aq() {
      return this.U;
   }

   public <T> gku<T> a(gkt.a<T> $$0) {
      return this.V.a($$0);
   }

   public <T> void a(gkt.a<T> $$0, List<T> $$1) {
      this.V.a($$0, $$1);
   }

   public DataFixer ar() {
      return this.O;
   }

   public float as() {
      return this.R.a;
   }

   public float at() {
      return this.R.b;
   }

   public eyl au() {
      return this.an;
   }

   public boolean ax() {
      return this.s != null && this.s.gj() || this.m.S().c();
   }

   public fbr ay() {
      return this.aG;
   }

   public gmo az() {
      return this.aH;
   }

   public boolean aA() {
      return this.bf;
   }

   public exd aB() {
      return this.Y;
   }

   public gja aC() {
      return this.aB;
   }

   public ghs aD() {
      return this.aD;
   }

   public ghr aE() {
      return this.aE;
   }

   public eyv aF() {
      return this.aF;
   }

   @Override
   public void a(boolean $$0) {
      this.bf = $$0;
   }

   public vq a(File $$0, int $$1, int $$2) {
      int $$3 = this.Q.k();
      int $$4 = this.Q.l();
      eqm $$5 = new eqn($$1, $$2, true, a);
      float $$6 = this.s.dE();
      float $$7 = this.s.dC();
      float $$8 = this.s.N;
      float $$9 = this.s.M;
      this.j.b(false);

      we var12;
      try {
         this.j.c(true);
         this.f.e();
         this.Q.b($$1);
         this.Q.c($$2);

         for (int $$10 = 0; $$10 < 6; $$10++) {
            switch ($$10) {
               case 0:
                  this.s.r($$7);
                  this.s.s(0.0F);
                  break;
               case 1:
                  this.s.r(($$7 + 90.0F) % 360.0F);
                  this.s.s(0.0F);
                  break;
               case 2:
                  this.s.r(($$7 + 180.0F) % 360.0F);
                  this.s.s(0.0F);
                  break;
               case 3:
                  this.s.r(($$7 - 90.0F) % 360.0F);
                  this.s.s(0.0F);
                  break;
               case 4:
                  this.s.r($$7);
                  this.s.s(-90.0F);
                  break;
               case 5:
               default:
                  this.s.r($$7);
                  this.s.s(90.0F);
            }

            this.s.M = this.s.dC();
            this.s.N = this.s.dE();
            $$5.a(true);
            this.j.a(1.0F, 0L, new esa());

            try {
               Thread.sleep(10L);
            } catch (InterruptedException var17) {
            }

            exs.a($$0, "panorama_" + $$10 + ".png", $$5, $$0x -> {
            });
         }

         vq $$11 = vq.b($$0.getName()).a(n.t).a($$1x -> $$1x.a(new vo(vo.a.b, $$0.getAbsolutePath())));
         return vq.a("screenshot.success", $$11);
      } catch (Exception var18) {
         F.error("Couldn't save image", var18);
         var12 = vq.a("screenshot.failure", var18.getMessage());
      } finally {
         this.s.s($$6);
         this.s.r($$7);
         this.s.N = $$8;
         this.s.M = $$9;
         this.j.b(true);
         this.Q.b($$3);
         this.Q.c($$4);
         $$5.a();
         this.j.c(false);
         this.f.e();
         this.g().a(true);
      }

      return var12;
   }

   private vq a(File $$0, int $$1, int $$2, int $$3, int $$4) {
      try {
         ByteBuffer $$5 = eqt.a($$1 * $$2 * 3);
         exs $$6 = new exs($$0, $$3, $$4, $$2);
         float $$7 = (float)$$3 / (float)$$1;
         float $$8 = (float)$$4 / (float)$$2;
         float $$9 = $$7 > $$8 ? $$7 : $$8;

         for (int $$10 = ($$4 - 1) / $$2 * $$2; $$10 >= 0; $$10 -= $$2) {
            for (int $$11 = 0; $$11 < $$3; $$11 += $$1) {
               RenderSystem.setShaderTexture(0, ggt.e);
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
         eqt.a($$5);
         vq $$15 = vq.b($$14.getName()).a(n.t).a($$1x -> $$1x.a(new vo(vo.a.b, $$14.getAbsolutePath())));
         return vq.a("screenshot.success", $$15);
      } catch (Exception var15) {
         F.warn("Couldn't save screenshot", var15);
         return vq.a("screenshot.failure", var15.getMessage());
      }
   }

   public bil aG() {
      return this.bj;
   }

   @Nullable
   public api aH() {
      return this.X.get();
   }

   public ghv aI() {
      return this.at;
   }

   @Nullable
   public fey aJ() {
      return this.aY;
   }

   public fjm aK() {
      return this.aI;
   }

   public boolean aL() {
      return false;
   }

   public ere aM() {
      return this.Q;
   }

   public ezp aN() {
      return this.l.k();
   }

   public fvs aO() {
      return this.S;
   }

   public void b(int $$0) {
      this.aB.a($$0);
   }

   public foy aP() {
      return this.aJ;
   }

   public boolean aQ() {
      return this.bA().flag(UserFlag.PROFANITY_FILTER_ENABLED);
   }

   public void aR() {
      this.aI.a();
      this.v().a();
   }

   public exp aS() {
      return this.bs;
   }

   @Nullable
   public awu aT() {
      return awu.a(this.aw.getServicesKeySet(), ServicesKeyType.PROFILE_KEY);
   }

   public boolean aU() {
      return !this.aw.getServicesKeySet().keys(ServicesKeyType.PROFILE_KEY).isEmpty();
   }

   public exe aV() {
      return this.Z;
   }

   public void a(exe $$0) {
      this.Z = $$0;
   }

   public ewz aW() {
      return this.bt;
   }

   public fqm aX() {
      return this.bu;
   }

   public frb aY() {
      return this.bv;
   }

   public eug aZ() {
      return this.aN;
   }

   public fuw ba() {
      return this.aO;
   }

   public eww bb() {
      return this.bw;
   }

   public eni bc() {
      return this.bx;
   }

   private float a(float $$0) {
      if (this.r != null) {
         bmf $$1 = this.r.s();
         if ($$1.i()) {
            return Math.max($$0, $$1.g());
         }
      }

      return $$0;
   }

   @Nullable
   public static String bd() {
      return System.getProperty("minecraft.launcher.brand");
   }

   public static enum a {
      a(vp.a) {
         @Override
         public boolean a(boolean $$0) {
            return true;
         }
      },
      b(vq.c("chat.disabled.options").a(n.m)) {
         @Override
         public boolean a(boolean $$0) {
            return false;
         }
      },
      c(vq.c("chat.disabled.launcher").a(n.m)) {
         @Override
         public boolean a(boolean $$0) {
            return $$0;
         }
      },
      d(vq.a("chat.disabled.profile", vq.d(exh.E.m.K.h())).a(n.m)) {
         @Override
         public boolean a(boolean $$0) {
            return $$0;
         }
      };

      static final vq e = vq.c("chat.disabled.profile.moreInfo");
      private final vq f;

      a(vq $$0) {
         this.f = $$0;
      }

      public vq a() {
         return this.f;
      }

      public abstract boolean a(boolean var1);
   }

   static record b(esq a, fks.c b) {
   }
}
