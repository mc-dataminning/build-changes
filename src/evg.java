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

public class evg extends biu<Runnable> implements epe {
   static evg E;
   private static final Logger F = LogUtils.getLogger();
   public static final boolean a = ac.j() == ac.a.d;
   private static final int G = 10;
   public static final ahg b = new ahg("default");
   public static final ahg c = new ahg("uniform");
   public static final ahg d = new ahg("alt");
   private static final ahg H = new ahg("regional_compliancies.json");
   private static final CompletableFuture<avr> I = CompletableFuture.completedFuture(avr.a);
   private static final vf J = vf.c("multiplayer.socialInteractions.not_available");
   public static final String e = "Please make sure you have up-to-date drivers (see aka.ms/mcdriver for instructions).";
   private final long K = Double.doubleToLongBits(Math.PI);
   private final Path L;
   private final CompletableFuture<ProfileResult> M;
   private final gem N;
   private final DataFixer O;
   private final ftx P;
   private final epd Q;
   private final evt R = new evt(20.0F, 0L, this::a);
   private final ftl S;
   public final ftd f;
   private final fyj T;
   private final fzj U;
   public final fqv g;
   private final gik V = new gik();
   private final evv W;
   public final ewq h;
   public final ewq i;
   public final fsy j;
   public final fwq k;
   private final AtomicReference<anq> X = new AtomicReference<>();
   public final ewr l;
   public final evk m;
   private final evc Y;
   public final evh n;
   public final evf o;
   private evd Z = evd.a;
   public final File p;
   private final String aa;
   private final String ab;
   private final Proxy ac;
   private final egl ad;
   private final boolean ae;
   private final boolean af;
   private final boolean ag;
   private final boolean ah;
   private final aqe ai;
   private final aoy aj;
   private final gha ak;
   private final aps al;
   private final gfs am;
   private final ewj an;
   private final ewn ao;
   private final eol ap;
   private final gjc aq;
   private final gix ar;
   private final ezs as;
   private final gfm at;
   private final fsz au;
   private final evm av = new evm(H, evg::b);
   private final YggdrasilAuthenticationService aw;
   private final MinecraftSessionService ax;
   private final UserApiService ay;
   private final gfl az;
   private final ggr aA;
   private final ftz aB;
   private final gfj aC;
   private final gfi aD;
   private final ewt aE;
   private final ezn aF;
   private final gkf aG;
   private final fhh aH;
   private final fmr aI;
   private final fve aJ;
   private final gjg aK;
   private final foa aL;
   private final esf aM;
   private final fsp aN;
   @Nullable
   public fnx q;
   @Nullable
   public fnq r;
   @Nullable
   public fsh s;
   @Nullable
   private gip aO;
   @Nullable
   private ug aP;
   private boolean aQ;
   @Nullable
   public blu t;
   @Nullable
   public blu u;
   @Nullable
   public elq v;
   private int aR;
   protected int w;
   private volatile boolean aS;
   private float aT;
   private long aU = ac.c();
   private long aV;
   private int aW;
   public boolean x;
   @Nullable
   public fcz y;
   @Nullable
   private fct aX;
   private boolean aY;
   private Thread aZ;
   private volatile boolean ba;
   @Nullable
   private Supplier<o> bb;
   private static int bc;
   public String z = "";
   private long bd;
   public boolean A;
   public boolean B;
   public boolean C;
   public boolean D = true;
   private boolean be;
   private final Queue<Runnable> bf = Queues.newConcurrentLinkedQueue();
   @Nullable
   private CompletableFuture<Void> bg;
   @Nullable
   private ezo bh;
   private bgr bi = bgo.a;
   private int bj;
   private final bgl bk = new bgl(ac.b, () -> this.bj);
   @Nullable
   private bgq bl;
   private bic bm = bib.a;
   private final evq bn = new evq();
   private long bo;
   private double bp;
   @Nullable
   private eps.a bq;
   private final evo br;
   private final euy bs;
   private final foe bt;
   private fou bu;
   private final euv bv;
   private final eli bw;
   private boolean bx;
   private final long by;
   private long bz;
   private String bA = "root";

   public evg(fin $$0) {
      super("Client");
      E = this;
      this.by = System.currentTimeMillis();
      this.p = $$0.c.a;
      File $$1 = $$0.c.c;
      this.L = $$0.c.b.toPath();
      this.aa = $$0.d.b;
      this.ab = $$0.d.c;
      Path $$2 = this.p.toPath();
      this.bw = egl.a($$2.resolve("allowed_symlinks.txt"));
      gfc $$3 = new gfc($$0.c.a(), this.bw);
      this.ak = new gha(this, $$2.resolve("downloads"), $$0.a);
      apu $$4 = new apo(this.L, aow.a, apt.b, this.bw);
      this.al = new aps($$3, this.ak.a(), $$4);
      this.aj = $$3.a();
      this.ac = $$0.a.d;
      this.aw = new YggdrasilAuthenticationService(this.ac);
      this.ax = this.aw.createMinecraftSessionService();
      this.W = $$0.a.a;
      this.M = CompletableFuture.supplyAsync(() -> this.ax.fetchProfile(this.W.b(), true), ac.g());
      this.ay = this.a(this.aw, $$0);
      F.info("Setting user: {}", this.W.c());
      F.debug("(Session ID is {})", this.W.a());
      this.af = $$0.d.a;
      this.ag = !$$0.d.d;
      this.ah = !$$0.d.e;
      this.ae = bg();
      this.aO = null;
      wk.a(eve::a);
      this.O = avw.a();
      this.aF = new ezn(this);
      this.aZ = Thread.currentThread();
      this.m = new evk(this, this.p);
      RenderSystem.setShaderGlintAlpha(this.m.ak().c());
      this.ba = true;
      this.aG = new gkf(this, this.m);
      this.Y = new evc($$2, this.O);
      F.info("Backend library: {}", RenderSystem.getBackendDescription());
      eoq $$5;
      if (this.m.p > 0 && this.m.o > 0) {
         $$5 = new eoq(this.m.o, this.m.p, $$0.b.c, $$0.b.d, $$0.b.e);
      } else {
         $$5 = $$0.b;
      }

      ac.b = RenderSystem.initBackendSystem();
      this.P = new ftx(this);
      this.Q = this.P.a($$5, this.m.k, this.bd());
      this.a(true);
      gjr.a.b(gjn.A);

      try {
         this.Q.a(this.aj, aa.b().g() ? eot.a : eot.b);
      } catch (IOException var13) {
         F.error("Couldn't set icon", var13);
      }

      this.Q.a(this.m.h().c());
      this.n = new evh(this);
      this.n.a(this.Q.i());
      this.o = new evf(this);
      this.o.a(this.Q.i());
      RenderSystem.initRenderer(this.m.u, false);
      this.ap = new eoi(this.Q.k(), this.Q.l());
      this.ap.a(0.0F, 0.0F, 0.0F, 0.0F);
      this.ap.b(a);
      this.ai = new aqe(aow.a);
      this.al.a();
      this.m.b(this.al);
      this.am = new gfs(this.m.ad);
      this.ai.a(this.am);
      this.N = new gem(this.ai);
      this.ai.a(this.N);
      this.az = new gfl(this.N, $$1.toPath().resolve("skins"), this.ax, this);
      this.ad = new egl($$2.resolve("saves"), $$2.resolve("backups"), this.bw, this.O);
      this.bv = new euv($$2);
      this.aq = new gjc(this.m);
      this.ai.a(this.aq);
      this.at = new gfm(this.W);
      this.ai.a(this.at);
      this.ar = new gix(this);
      this.as = new ezs(this.N);
      this.h = this.as.a();
      this.i = this.as.b();
      this.ai.a(this.as);
      this.b(this.j());
      this.ai.a(new gff());
      this.ai.a(new gfe());
      this.Q.a("Startup");
      RenderSystem.setupDefaultState(0, 0, this.Q.k(), this.Q.l());
      this.Q.a("Post startup");
      this.an = ewj.a();
      this.ao = ewn.a(this.an);
      this.aA = new ggr(this.N, this.an, this.m.A().c());
      this.ai.a(this.aA);
      this.aI = new fmr();
      this.ai.a(this.aI);
      this.aJ = new fve(this.h, this.aI, this::an, this::aq, this::ao);
      this.ai.a(this.aJ);
      fss $$8 = new fss(this.aJ, this.aI);
      this.ai.a($$8);
      this.U = new fzj(this, this.N, this.aA, this.ao, $$8);
      this.ai.a(this.U);

      try {
         int $$9 = Runtime.getRuntime().availableProcessors();
         int $$10 = this.af() ? $$9 : Math.min($$9, 4);
         eqb.a();
         this.S = new ftl($$10);
      } catch (OutOfMemoryError var12) {
         TinyFileDialogs.tinyfd_messageBox(
            "Minecraft",
            "Oh no! The game was unable to allocate memory off-heap while trying to start. You may try to free some memory by closing other applications on your computer, check that your system meets the minimum requirements, and try again. If the problem persists, please visit: https://aka.ms/Minecraft-Support",
            "ok",
            "error",
            true
         );
         throw new fio("Unable to allocate render buffers", var12);
      }

      this.aH = new fhh(this, this.ay);
      this.aB = new ftz(this.aA.b(), $$8, this.an);
      this.ai.a(this.aB);
      this.T = new fyj(this, this.N, this.U, this.aB, this.h, this.m, this.aI);
      this.ai.a(this.T);
      this.j = new fsy(this, this.T.d(), this.ai, this.S);
      this.ai.a(this.j.e());
      this.f = new ftd(this, this.T, this.aJ, this.S);
      this.ai.a(this.f);
      this.bf();
      this.ai.a(this.V);
      this.g = new fqv(this.r, this.N);
      this.ai.a(this.g);
      this.aC = new gfj(this.N);
      this.ai.a(this.aC);
      this.aD = new gfi(this.N);
      this.ai.a(this.aD);
      this.aE = new ewt(this.N);
      this.ai.a(this.aE);
      this.au = new fsz();
      this.ai.a(this.au);
      this.ai.a(this.av);
      this.l = new ewr(this, this.U);
      this.k = new fwq(this);
      eqp $$12 = eqp.a(this);
      this.aM = new esf($$12);
      RenderSystem.setErrorCallback(this::a);
      if (this.ap.c != this.Q.k() || this.ap.d != this.Q.l()) {
         StringBuilder $$13 = new StringBuilder(
            "Recovering from unsupported resolution ("
               + this.Q.k()
               + "x"
               + this.Q.l()
               + ").\nPlease make sure you have up-to-date drivers (see aka.ms/mcdriver for instructions)."
         );
         if (eor.b()) {
            $$13.append("\n\nReported GL debug messages:\n").append(String.join("\n", eor.a()));
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
      this.aK = new gjg(this, this.ay, this.W);
      this.aL = foa.a(this.ay, this.W, $$2);
      this.br = new evo(this);
      this.bs = new euy(this);
      this.bs.a(this.m.ap().c() != evi.a);
      this.bt = new foe(this);
      this.bt.a(this.m.y().c());
      this.bu = fou.a(foq.a(), this.ay);
      fcl.a(this);
      this.a(new fcf(vf.c("gui.loadingMinecraft")));
      List<aov> $$14 = this.al.g();
      this.bn.a(evq.b.a, $$14);
      aqd $$15 = this.ai.a(ac.f(), this, I, $$14);
      gjr.a.a(gjn.C);
      evg.b $$16 = new evg.b($$12, $$0.e);
      this.a(new fcl(this, $$15, $$1x -> ac.a($$1x, $$1xx -> this.a($$1xx, $$16), () -> {
            if (aa.aW) {
               this.bi();
            }

            this.bn.a();
            this.a($$16);
         }), false));
      this.aN = fsp.a($$0.e.b());
   }

   private void a(@Nullable evg.b $$0) {
      if (!this.bx) {
         this.bx = true;
         this.b($$0);
      }
   }

   private void b(@Nullable evg.b $$0) {
      Runnable $$1 = this.c($$0);
      gjr.a.b(gjn.C);
      gjr.a.b(gjn.z);
      gjr.a.a(this.aK.a());
      $$1.run();
   }

   public boolean c() {
      return this.bx;
   }

   private Runnable c(@Nullable evg.b $$0) {
      List<Function<Runnable, fcz>> $$1 = new ArrayList<>();
      this.a($$1);
      Runnable $$2 = () -> {
         if ($$0 != null && $$0.b().a()) {
            fso.a(this, $$0.b(), $$0.a());
         } else {
            this.a(new fde(true));
         }
      };

      for (Function<Runnable, fcz> $$3 : Lists.reverse($$1)) {
         fcz $$4 = $$3.apply($$2);
         $$2 = () -> this.a($$4);
      }

      return $$2;
   }

   private void a(List<Function<Runnable, fcz>> $$0) {
      if (this.m.ae) {
         $$0.add($$0x -> new fbk(this.m, $$0x));
      }

      BanDetails $$1 = this.F();
      if ($$1 != null) {
         $$0.add($$1x -> fbo.a($$1xx -> {
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
            $$0.add($$1x -> fbo.a($$3.getName(), $$1x));
         }

         if ($$4.contains(ProfileActionType.USING_BANNED_SKIN)) {
            $$0.add(fbo::a);
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
      this.Q.b(this.bd());
   }

   private String bd() {
      StringBuilder $$0 = new StringBuilder("Minecraft");
      if (e().a()) {
         $$0.append("*");
      }

      $$0.append(" ");
      $$0.append(aa.b().c());
      fnr $$1 = this.J();
      if ($$1 != null && $$1.m().k()) {
         $$0.append(" - ");
         fob $$2 = this.Q();
         if (this.aO != null && !this.aO.p()) {
            $$0.append(gfq.a("title.singleplayer"));
         } else if ($$2 != null && $$2.e()) {
            $$0.append(gfq.a("title.multiplayer.realms"));
         } else if (this.aO == null && ($$2 == null || !$$2.d())) {
            $$0.append(gfq.a("title.multiplayer.other"));
         } else {
            $$0.append(gfq.a("title.multiplayer.lan"));
         }
      }

      return $$0.toString();
   }

   private UserApiService a(YggdrasilAuthenticationService $$0, fin $$1) {
      try {
         return $$0.createUserApiService($$1.a.a.d());
      } catch (AuthenticationException var4) {
         F.error("Failed to verify authentication", var4);
         return UserApiService.OFFLINE;
      }
   }

   public static aum e() {
      return aum.a("vanilla", ClientBrandRetriever::getClientModName, "Client", evg.class);
   }

   private void a(Throwable $$0, @Nullable evg.b $$1) {
      if (this.al.d().size() > 1) {
         this.a($$0, null, $$1);
      } else {
         ac.a($$0);
      }
   }

   public void a(Throwable $$0, @Nullable vf $$1, @Nullable evg.b $$2) {
      F.info("Caught error loading resourcepacks, removing all selected resourcepacks", $$0);
      this.bn.a($$0);
      this.ak.b();
      this.al.a(Collections.emptyList());
      this.m.i.clear();
      this.m.j.clear();
      this.m.as();
      this.a(true, $$2).thenRun(() -> this.a($$1));
   }

   private void be() {
      this.a(null);
      if (this.r != null) {
         this.r.W();
         this.y();
      }

      this.a(new fde());
      this.a(null);
   }

   private void a(@Nullable vf $$0) {
      ezn $$1 = this.ay();
      ezl.b($$1, ezl.a.c, vf.c("resourcePack.load_fail"), $$0);
   }

   public void f() {
      this.aZ = Thread.currentThread();
      if (Runtime.getRuntime().availableProcessors() > 4) {
         this.aZ.setPriority(10);
      }

      try {
         boolean $$0 = false;

         while (this.ba) {
            this.bh();

            try {
               bgu $$1 = bgu.a("Renderer");
               boolean $$2 = this.aN().e();
               this.bi = this.a($$2, $$1);
               this.bi.a();
               this.bm.c();
               this.d(!$$0);
               this.bm.d();
               this.bi.b();
               this.b($$2, $$1);
            } catch (OutOfMemoryError var4) {
               if ($$0) {
                  throw var4;
               }

               this.bk();
               this.a(new fcs());
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

   private void bf() {
      this.V
         .a(
            gik.a,
            $$0 -> new gid<>(
                  $$0x -> $$0x.a(null, cop.a.a.c()).stream().map($$0xx -> n.a($$0xx.getString()).trim()).filter($$0xx -> !$$0xx.isEmpty()),
                  $$0x -> Stream.of(kd.h.b($$0x.d())),
                  $$0
               )
         );
      this.V.a(gik.b, $$0 -> new gie<>($$0x -> $$0x.f().map(asv::b), $$0));
      this.V
         .a(
            gik.c,
            $$0 -> new gid<>(
                  $$0x -> $$0x.e()
                        .stream()
                        .flatMap($$1 -> $$1.b().a($$0x.a()).a(null, cop.a.a).stream())
                        .map($$0xx -> n.a($$0xx.getString()).trim())
                        .filter($$0xx -> !$$0xx.isEmpty()),
                  $$0x -> $$0x.e().stream().map($$1 -> kd.h.b($$1.b().a($$0x.a()).d())),
                  $$0
               )
         );
      cle.e().a($$0 -> {
         this.a(gik.a, $$0);
         this.a(gik.b, $$0);
      });
   }

   private void a(int $$0, long $$1) {
      this.m.L().a(false);
      this.m.as();
   }

   private static boolean bg() {
      String[] $$0 = new String[]{"sun.arch.data.model", "com.ibm.vm.bitmode", "os.arch"};

      for (String $$1 : $$0) {
         String $$2 = System.getProperty($$1);
         if ($$2 != null && $$2.contains("64")) {
            return true;
         }
      }

      return false;
   }

   public eol g() {
      return this.ap;
   }

   public String h() {
      return this.aa;
   }

   public String i() {
      return this.ab;
   }

   public void a(o $$0) {
      this.bb = () -> this.d($$0);
   }

   public void b(o $$0) {
      this.bb = () -> $$0;
   }

   private void bh() {
      if (this.bb != null) {
         a(this, this.p, this.bb.get());
      }
   }

   public void c(o $$0) {
      o $$1 = this.d($$0);
      this.bk();
      a(this, this.p, $$1);
   }

   public static void a(@Nullable evg $$0, File $$1, o $$2) {
      File $$3 = new File($$1, "crash-reports");
      File $$4 = new File($$3, "crash-" + ac.e() + "-client.txt");
      ahi.a($$2.e());
      if ($$0 != null) {
         $$0.aq.g();
      }

      if ($$2.f() != null) {
         ahi.a("#@!@# Game crashed! Crash report saved to: #@!@# " + $$2.f());
         System.exit(-1);
      } else if ($$2.a($$4)) {
         ahi.a("#@!@# Game crashed! Crash report saved to: #@!@# " + $$4.getAbsolutePath());
         System.exit(-1);
      } else {
         ahi.a("#@?@# Game crashed! Crash report could not be saved. #@?@#");
         System.exit(-2);
      }
   }

   public boolean j() {
      return this.m.N().c();
   }

   public CompletableFuture<Void> k() {
      return this.a(false, null);
   }

   private CompletableFuture<Void> a(boolean $$0, @Nullable evg.b $$1) {
      if (this.bg != null) {
         return this.bg;
      } else {
         CompletableFuture<Void> $$2 = new CompletableFuture<>();
         if (!$$0 && this.aX instanceof fcl) {
            this.bg = $$2;
            return $$2;
         } else {
            this.al.a();
            List<aov> $$3 = this.al.g();
            if (!$$0) {
               this.bn.a(evq.b.b, $$3);
            }

            this.a(new fcl(this, this.ai.a(ac.f(), this, I, $$3), $$3x -> ac.a($$3x, $$2xx -> {
                  if ($$0) {
                     this.ak.c();
                     this.be();
                  } else {
                     this.a($$2xx, $$1);
                  }
               }, () -> {
                  this.f.f();
                  this.bn.a();
                  this.ak.d();
                  $$2.complete(null);
                  this.a($$1);
               }), !$$0));
            return $$2;
         }
      }
   }

   private void bi() {
      boolean $$0 = false;
      fty $$1 = this.an().a();
      ggl $$2 = $$1.a().a();

      for (cwp $$3 : kd.e) {
         UnmodifiableIterator $$10 = $$3.n().a().iterator();

         while ($$10.hasNext()) {
            djg $$4 = (djg)$$10.next();
            if ($$4.l() == dcu.c) {
               ggl $$5 = $$1.b($$4);
               if ($$5 == $$2) {
                  F.debug("Missing model for: {}", $$4);
                  $$0 = true;
               }
            }
         }
      }

      gel $$6 = $$2.e();

      for (cwp $$7 : kd.e) {
         UnmodifiableIterator var17 = $$7.n().a().iterator();

         while (var17.hasNext()) {
            djg $$8 = (djg)var17.next();
            gel $$9 = $$1.a($$8);
            if (!$$8.i() && $$9 == $$6) {
               F.debug("Missing particle icon for: {}", $$8);
            }
         }
      }

      for (cms $$10 : kd.h) {
         cmx $$11 = $$10.am_();
         String $$12 = $$11.q();
         String $$13 = vf.c($$12).getString();
         if ($$13.toLowerCase(Locale.ROOT).equals($$10.a())) {
            F.debug("Missing translation for: {} {} {}", new Object[]{$$11, $$12, $$10});
         }
      }

      $$0 |= fcm.a();
      $$0 |= fym.a();
      if ($$0) {
         throw new IllegalStateException("Your game data is foobar, fix the errors above!");
      }
   }

   public egl l() {
      return this.ad;
   }

   private void a(String $$0) {
      evg.a $$1 = this.H();
      if (!$$1.a(this.R())) {
         if (this.l.b()) {
            this.l.b(false);
            this.a(new fbr($$0x -> {
               if ($$0x) {
                  ac.j().a("https://aka.ms/JavaAccountSettings");
               }

               this.a(null);
            }, evg.a.e, "https://aka.ms/JavaAccountSettings", true));
         } else {
            vf $$2 = $$1.a();
            this.l.a($$2, false);
            this.bs.c($$2);
            this.l.b($$1 == evg.a.d);
         }
      } else {
         this.a(new fbq($$0));
      }
   }

   public void a(@Nullable fcz $$0) {
      if (aa.aW && Thread.currentThread() != this.aZ) {
         F.error("setScreen called from non-game thread");
      }

      if (this.y != null) {
         this.y.j();
      }

      if ($$0 == null && this.aY) {
         throw new IllegalStateException("Trying to return to in-game GUI during disconnection");
      } else {
         if ($$0 == null && this.r == null) {
            $$0 = new fde();
         } else if ($$0 == null && this.s.ew()) {
            if (this.s.o()) {
               $$0 = new fby(null, this.r.k().n());
            } else {
               this.s.fQ();
            }
         }

         this.y = $$0;
         if (this.y != null) {
            this.y.aF_();
         }

         epv.a();
         if ($$0 != null) {
            this.n.j();
            eve.b();
            $$0.b(this, this.Q.o(), this.Q.p());
            this.x = false;
         } else {
            this.aq.h();
            this.n.i();
         }

         this.d();
      }
   }

   public void a(@Nullable fct $$0) {
      this.aX = $$0;
   }

   public void m() {
      try {
         F.info("Stopping!");

         try {
            this.bs.c();
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
            this.y.j();
         }

         this.close();
      } finally {
         ac.b = System::nanoTime;
         if (this.bb == null) {
            System.exit(0);
         }
      }
   }

   @Override
   public void close() {
      if (this.bq != null) {
         this.bq.a();
      }

      try {
         this.aK.close();
         this.av.close();
         this.aA.close();
         this.as.close();
         this.j.close();
         this.f.close();
         this.aq.f();
         this.g.a();
         this.aD.close();
         this.aC.close();
         this.aE.close();
         this.N.close();
         this.ai.close();
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

      if (this.bg != null && !(this.aX instanceof fcl)) {
         CompletableFuture<Void> $$2 = this.bg;
         this.bg = null;
         this.k().thenRun(() -> $$2.complete(null));
      }

      Runnable $$3;
      while (($$3 = this.bf.poll()) != null) {
         $$3.run();
      }

      if ($$0) {
         int $$4 = this.R.a(ac.b());
         this.bi.a("scheduledExecutables");
         this.bu();
         this.bi.c();
         this.bi.a("tick");

         for (int $$5 = 0; $$5 < Math.min(10, $$4); $$5++) {
            this.bi.d("clientTick");
            this.s();
         }

         this.bi.c();
      }

      this.n.a();
      this.Q.a("Render");
      this.bi.a("sound");
      this.aq.a(this.j.m());
      this.bi.c();
      this.bi.a("render");
      long $$6 = ac.c();
      boolean $$8;
      if (!this.aN().d() && !this.bm.e()) {
         $$8 = false;
         this.bp = 0.0;
      } else {
         $$8 = this.bq == null || this.bq.b();
         if ($$8) {
            eps.a().ifPresent(eps::b);
         }
      }

      RenderSystem.clear(16640, a);
      this.ap.a(true);
      fsx.a();
      this.bi.a("display");
      RenderSystem.enableCull();
      this.bi.c();
      if (!this.x) {
         this.bi.b("gameRenderer");
         this.j.a(this.aS ? this.aT : this.R.a, $$1, $$0);
         this.bi.c();
      }

      if (this.bl != null) {
         this.bi.a("fpsPie");
         ews $$9 = new ews(this, this.S.c());
         this.a($$9, this.bl);
         $$9.e();
         this.bi.c();
      }

      this.bi.a("blit");
      this.ap.e();
      this.ap.a(this.Q.k(), this.Q.l());
      this.bd = ac.c() - $$6;
      if ($$8) {
         eps.a().ifPresent($$0x -> this.bq = $$0x.c());
      }

      this.bi.b("updateDisplay");
      this.Q.e();
      int $$10 = this.bj();
      if ($$10 < 260) {
         RenderSystem.limitDisplayFPS($$10);
      }

      this.bi.b("yield");
      Thread.yield();
      this.bi.c();
      this.Q.a("Post render");
      this.aW++;
      boolean $$11 = this.S() && (this.y != null && this.y.k() || this.aX != null && this.aX.a()) && !this.aO.p();
      if (this.aS != $$11) {
         if ($$11) {
            this.aT = this.R.a;
         } else {
            this.R.a = this.aT;
         }

         this.aS = $$11;
      }

      long $$12 = ac.c();
      long $$13 = $$12 - this.aU;
      if ($$8) {
         this.bo = $$13;
      }

      this.aN().a($$13);
      this.aU = $$12;
      this.bi.a("fpsUpdate");
      if (this.bq != null && this.bq.b()) {
         this.bp = (double)this.bq.c() * 100.0 / (double)this.bo;
      }

      while (ac.b() >= this.aV + 1000L) {
         String $$14;
         if (this.bp > 0.0) {
            $$14 = " GPU: " + (this.bp > 100.0 ? n.m + "100%" : Math.round(this.bp) + "%");
         } else {
            $$14 = "";
         }

         bc = this.aW;
         this.z = String.format(
            Locale.ROOT,
            "%d fps T: %s%s%s%s B: %d%s",
            bc,
            $$10 == 260 ? "inf" : $$10,
            this.m.L().c() ? " vsync" : "",
            this.m.j().c(),
            this.m.i().c() == euu.a ? "" : (this.m.i().c() == euu.b ? " fast-clouds" : " fancy-clouds"),
            this.m.C().c(),
            $$14
         );
         this.aV += 1000L;
         this.aW = 0;
      }

      this.bi.c();
   }

   private bgr a(boolean $$0, @Nullable bgu $$1) {
      if (!$$0) {
         this.bk.b();
         if (!this.bm.e() && $$1 == null) {
            return bgo.a;
         }
      }

      bgr $$2;
      if ($$0) {
         if (!this.bk.a()) {
            this.bj = 0;
            this.bk.c();
         }

         this.bj++;
         $$2 = this.bk.d();
      } else {
         $$2 = bgo.a;
      }

      if (this.bm.e()) {
         $$2 = bgr.a($$2, this.bm.f());
      }

      return bgu.a($$2, $$1);
   }

   private void b(boolean $$0, @Nullable bgu $$1) {
      if ($$1 != null) {
         $$1.b();
      }

      if ($$0) {
         this.bl = this.bk.e();
      } else {
         this.bl = null;
      }

      this.bi = this.bk.d();
   }

   @Override
   public void a() {
      int $$0 = this.Q.a(this.m.an().c(), this.j());
      this.Q.a((double)$$0);
      if (this.y != null) {
         this.y.a(this, this.Q.o(), this.Q.p());
      }

      eol $$1 = this.g();
      $$1.a(this.Q.k(), this.Q.l(), a);
      this.j.a(this.Q.k(), this.Q.l());
      this.n.g();
   }

   @Override
   public void b() {
      this.n.k();
   }

   public int n() {
      return bc;
   }

   public long o() {
      return this.bd;
   }

   private int bj() {
      return this.r != null || this.y == null && this.aX == null ? this.Q.d() : 60;
   }

   private void bk() {
      try {
         aul.b();
         this.f.p();
      } catch (Throwable var3) {
      }

      try {
         System.gc();
         if (this.aQ && this.aO != null) {
            this.aO.a(true);
         }

         this.b((fcz)(new fcf(vf.c("menu.savingLevel"))));
      } catch (Throwable var2) {
      }

      System.gc();
   }

   public boolean a(Consumer<vf> $$0) {
      if (this.bm.e()) {
         this.bl();
         return false;
      } else {
         Consumer<bgq> $$1 = $$1x -> {
            if ($$1x != bgm.a) {
               int $$2x = $$1x.f();
               double $$3x = (double)$$1x.g() / (double)avo.a;
               this.execute(
                  () -> $$0.accept(
                        vf.a("commands.debug.stopped", String.format(Locale.ROOT, "%.2f", $$3x), $$2x, String.format(Locale.ROOT, "%.2f", (double)$$2x / $$3x))
                     )
               );
            }
         };
         Consumer<Path> $$2 = $$1x -> {
            vf $$2x = vf.b($$1x.toString()).a(n.t).a($$1xx -> $$1xx.a(new vd(vd.a.b, $$1x.toFile().getParent())));
            this.execute(() -> $$0.accept(vf.a("debug.profiling.stop", $$2x)));
         };
         ab $$3 = a(new ab(), this, this.am, this.aa, this.m);
         Consumer<List<Path>> $$4 = $$2x -> {
            Path $$3x = this.a($$3, $$2x);
            $$2.accept($$3x);
         };
         Consumer<Path> $$5;
         if (this.aO == null) {
            $$5 = $$1x -> $$4.accept(ImmutableList.of($$1x));
         } else {
            this.aO.b($$3);
            CompletableFuture<Path> $$6 = new CompletableFuture<>();
            CompletableFuture<Path> $$7 = new CompletableFuture<>();
            CompletableFuture.allOf($$6, $$7).thenRunAsync(() -> $$4.accept(ImmutableList.of($$6.join(), $$7.join())), ac.g());
            this.aO.a($$0x -> {
            }, $$7::complete);
            $$5 = $$6::complete;
         }

         this.bm = bia.a(new fsm(ac.b, this.f), ac.b, ac.g(), new big("client"), $$1x -> {
            this.bm = bib.a;
            $$1.accept($$1x);
         }, $$5);
         return true;
      }
   }

   private void bl() {
      this.bm.a();
      if (this.aO != null) {
         this.aO.aU();
      }
   }

   private void bm() {
      this.bm.b();
      if (this.aO != null) {
         this.aO.aV();
      }
   }

   private Path a(ab $$0, List<Path> $$1) {
      String $$2;
      if (this.R()) {
         $$2 = this.T().aY().g();
      } else {
         fob $$3 = this.Q();
         $$2 = $$3 != null ? $$3.a : "unknown";
      }

      Path $$7;
      try {
         String $$5 = String.format(Locale.ROOT, "%s-%s-%s", ac.e(), $$2, aa.b().b());
         String $$6 = v.a(big.a, $$5, ".zip");
         $$7 = big.a.resolve($$6);
      } catch (IOException var21) {
         throw new UncheckedIOException(var21);
      }

      try (aty $$10 = new aty($$7)) {
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
      if (this.bl != null) {
         List<bgt> $$1 = this.bl.a(this.bA);
         if (!$$1.isEmpty()) {
            bgt $$2 = $$1.remove(0);
            if ($$0 == 0) {
               if (!$$2.d.isEmpty()) {
                  int $$3 = this.bA.lastIndexOf(30);
                  if ($$3 >= 0) {
                     this.bA = this.bA.substring(0, $$3);
                  }
               }
            } else {
               $$0--;
               if ($$0 < $$1.size() && !"unspecified".equals($$1.get($$0).d)) {
                  if (!this.bA.isEmpty()) {
                     this.bA = this.bA + "\u001e";
                  }

                  this.bA = this.bA + $$1.get($$0).d;
               }
            }
         }
      }
   }

   private void a(ews $$0, bgq $$1) {
      List<bgt> $$2 = $$1.a(this.bA);
      bgt $$3 = $$2.remove(0);
      RenderSystem.clear(256, a);
      RenderSystem.setShader(fsy::q);
      Matrix4f $$4 = new Matrix4f().setOrtho(0.0F, (float)this.Q.k(), (float)this.Q.l(), 0.0F, 1000.0F, 3000.0F);
      RenderSystem.setProjectionMatrix($$4, eqh.b);
      epz $$5 = RenderSystem.getModelViewStack();
      $$5.a();
      $$5.e();
      $$5.a(0.0F, 0.0F, -2000.0F);
      RenderSystem.applyModelViewMatrix();
      RenderSystem.lineWidth(1.0F);
      eqb $$6 = eqb.b();
      epu $$7 = $$6.d();
      int $$8 = 160;
      int $$9 = this.Q.k() - 160 - 10;
      int $$10 = this.Q.l() - 320;
      RenderSystem.enableBlend();
      $$7.a(eqe.b.h, epx.n);
      $$7.a((double)((float)$$9 - 176.0F), (double)((float)$$10 - 96.0F - 16.0F), 0.0).a(200, 0, 0, 0).e();
      $$7.a((double)((float)$$9 - 176.0F), (double)($$10 + 320), 0.0).a(200, 0, 0, 0).e();
      $$7.a((double)((float)$$9 + 176.0F), (double)($$10 + 320), 0.0).a(200, 0, 0, 0).e();
      $$7.a((double)((float)$$9 + 176.0F), (double)((float)$$10 - 96.0F - 16.0F), 0.0).a(200, 0, 0, 0).e();
      $$6.c();
      RenderSystem.disableBlend();
      double $$11 = 0.0;

      for (bgt $$12 : $$2) {
         int $$13 = aun.a($$12.a / 4.0) + 1;
         $$7.a(eqe.b.g, epx.n);
         int $$14 = $$12.a();
         int $$15 = $$14 >> 16 & 0xFF;
         int $$16 = $$14 >> 8 & 0xFF;
         int $$17 = $$14 & 0xFF;
         $$7.a((double)$$9, (double)$$10, 0.0).a($$15, $$16, $$17, 255).e();

         for (int $$18 = $$13; $$18 >= 0; $$18--) {
            float $$19 = (float)(($$11 + $$12.a * (double)$$18 / (double)$$13) * (float) (Math.PI * 2) / 100.0);
            float $$20 = aun.a($$19) * 160.0F;
            float $$21 = aun.b($$19) * 160.0F * 0.5F;
            $$7.a((double)((float)$$9 + $$20), (double)((float)$$10 - $$21), 0.0).a($$15, $$16, $$17, 255).e();
         }

         $$6.c();
         $$7.a(eqe.b.f, epx.n);

         for (int $$22 = $$13; $$22 >= 0; $$22--) {
            float $$23 = (float)(($$11 + $$12.a * (double)$$22 / (double)$$13) * (float) (Math.PI * 2) / 100.0);
            float $$24 = aun.a($$23) * 160.0F;
            float $$25 = aun.b($$23) * 160.0F * 0.5F;
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
      String $$27 = bgq.b($$3.d);
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
         bgt $$31 = $$2.get($$30);
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
      this.ba = false;
   }

   public boolean q() {
      return this.ba;
   }

   public void c(boolean $$0) {
      if (this.y == null) {
         boolean $$1 = this.S() && !this.aO.p();
         if ($$1) {
            this.a(new fcu(!$$0));
            this.aq.d();
         } else {
            this.a(new fcu(true));
         }
      }
   }

   private void e(boolean $$0) {
      if (!$$0) {
         this.w = 0;
      }

      if (this.w <= 0 && !this.s.fn()) {
         if ($$0 && this.v != null && this.v.c() == elq.a.b) {
            elo $$1 = (elo)this.v;
            hx $$2 = $$1.a();
            if (!this.r.a_($$2).i()) {
               ic $$3 = $$1.b();
               if (this.q.b($$2, $$3)) {
                  this.g.a($$2, $$3);
                  this.s.a(bjz.a);
               }
            }
         } else {
            this.q.b();
         }
      }
   }

   private boolean bn() {
      if (this.w > 0) {
         return false;
      } else if (this.v == null) {
         F.error("Null returned as 'hitResult', this shouldn't happen!");
         if (this.q.f()) {
            this.w = 10;
         }

         return false;
      } else if (this.s.A()) {
         return false;
      } else {
         cmx $$0 = this.s.b(bjz.a);
         if (!$$0.a(this.r.I())) {
            return false;
         } else {
            boolean $$1 = false;
            switch (this.v.c()) {
               case c:
                  this.q.a(this.s, ((elp)this.v).a());
                  break;
               case b:
                  elo $$2 = (elo)this.v;
                  hx $$3 = $$2.a();
                  if (!this.r.a_($$3).i()) {
                     this.q.a($$3, $$2.b());
                     if (this.r.a_($$3).i()) {
                        $$1 = true;
                     }
                     break;
                  }
               case a:
                  if (this.q.f()) {
                     this.w = 10;
                  }

                  this.s.gm();
            }

            this.s.a(bjz.a);
            return $$1;
         }
      }
   }

   private void bo() {
      if (!this.q.m()) {
         this.aR = 4;
         if (!this.s.A()) {
            if (this.v == null) {
               F.warn("Null returned as 'hitResult', this shouldn't happen!");
            }

            for (bjz $$0 : bjz.values()) {
               cmx $$1 = this.s.b($$0);
               if (!$$1.a(this.r.I())) {
                  return;
               }

               if (this.v != null) {
                  switch (this.v.c()) {
                     case c:
                        elp $$2 = (elp)this.v;
                        blu $$3 = $$2.a();
                        if (!this.r.D_().a($$3.dm())) {
                           return;
                        }

                        bka $$4 = this.q.a(this.s, $$3, $$2, $$0);
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
                        elo $$5 = (elo)this.v;
                        int $$6 = $$1.L();
                        bka $$7 = this.q.a(this.s, $$0, $$5);
                        if ($$7.a()) {
                           if ($$7.b()) {
                              this.s.a($$0);
                              if (!$$1.b() && ($$1.L() != $$6 || this.q.g())) {
                                 this.j.b.a($$0);
                              }
                           }

                           return;
                        }

                        if ($$7 == bka.e) {
                           return;
                        }
                  }
               }

               if (!$$1.b()) {
                  bka $$8 = this.q.a(this.s, $$0);
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

   public gix r() {
      return this.ar;
   }

   public void s() {
      this.bz++;
      if (this.r != null && !this.aS) {
         this.r.s().m();
      }

      if (this.aR > 0) {
         this.aR--;
      }

      this.bi.a("gui");
      this.bt.a();
      this.l.a(this.aS);
      this.bi.c();
      this.j.a(1.0F);
      this.aG.a(this.r, this.v);
      this.bi.a("gameMode");
      if (!this.aS && this.r != null) {
         this.q.d();
      }

      this.bi.b("textures");
      boolean $$0 = this.r == null || this.r.s().i();
      if ($$0) {
         this.N.e();
      }

      if (this.y != null || this.s == null) {
         if (this.y instanceof fch $$1 && !this.s.fD()) {
            $$1.n();
         }
      } else if (this.s.ew() && !(this.y instanceof fby)) {
         this.a(null);
      } else if (this.s.fD() && this.r != null) {
         this.a(new fch());
      }

      if (this.y != null) {
         this.w = 10000;
      }

      if (this.y != null) {
         fcz.a(() -> this.y.d(), "Ticking screen", this.y.getClass().getCanonicalName());
      }

      if (!this.aN().d()) {
         this.l.l();
      }

      if (this.aX == null && this.y == null) {
         this.bi.b("Keybindings");
         this.by();
         if (this.w > 0) {
            this.w--;
         }
      }

      if (this.r != null) {
         this.bi.b("gameRenderer");
         if (!this.aS) {
            this.j.f();
         }

         this.bi.b("levelRenderer");
         if (!this.aS) {
            this.f.o();
         }

         this.bi.b("level");
         if (!this.aS) {
            this.r.f();
         }
      } else if (this.j.g() != null) {
         this.j.b();
      }

      if (!this.aS) {
         this.ar.a();
      }

      this.aq.a(this.aS);
      if (this.r != null) {
         if (!this.aS) {
            if (!this.m.s && this.bx()) {
               vf $$2 = vf.c("tutorial.socialInteractions.title");
               vf $$3 = vf.a("tutorial.socialInteractions.description", gkf.a("socialInteractions"));
               this.bh = new ezo(ezo.a.f, $$2, $$3, true);
               this.aG.a(this.bh, 160);
               this.m.s = true;
               this.m.as();
            }

            this.aG.d();

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

         this.bi.b("animateTick");
         if (!this.aS && $$0) {
            this.r.b(this.s.dq(), this.s.ds(), this.s.dw());
         }

         this.bi.b("particles");
         if (!this.aS && $$0) {
            this.g.b();
         }
      } else if (this.aP != null) {
         this.bi.b("pendingConnection");
         this.aP.d();
      }

      this.bi.b("keyboard");
      this.o.b();
      this.bi.c();
   }

   private boolean bx() {
      return !this.aQ || this.aO != null && this.aO.p();
   }

   private void by() {
      while (this.m.P.g()) {
         eus $$0 = this.m.ax();
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
               this.s.fS().l = $$1;
            } else {
               fen.a(this, $$1, $$3, $$2);
            }
         }
      }

      while (this.m.N.g()) {
         if (!this.bx()) {
            this.s.a(J, true);
            this.bs.c(J);
         } else {
            if (this.bh != null) {
               this.aG.a(this.bh);
               this.bh = null;
            }

            this.a(new fhj());
         }
      }

      while (this.m.E.g()) {
         if (this.q.i()) {
            this.s.i();
         } else {
            this.aG.a();
            this.a(new fey(this.s));
         }
      }

      while (this.m.T.g()) {
         this.a(new fdp(this.s.cn.r()));
      }

      while (this.m.F.g()) {
         if (!this.s.P_()) {
            this.J().b(new aem(aem.a.g, hx.b, ic.a));
         }
      }

      while (this.m.G.g()) {
         if (!this.s.P_() && this.s.a(fcz.r())) {
            this.s.a(bjz.a);
         }
      }

      while (this.m.K.g()) {
         this.a("");
      }

      if (this.y == null && this.aX == null && this.m.M.g()) {
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
            $$4 |= this.bn();
         }

         while (this.m.H.g()) {
            this.bo();
         }

         while (this.m.J.g()) {
            this.bz();
         }
      }

      if (this.m.H.e() && this.aR == 0 && !this.s.fn()) {
         this.bo();
      }

      this.e(this.y == null && !$$4 && this.m.I.e() && this.n.h());
   }

   public gjg t() {
      return this.aK;
   }

   public double u() {
      return this.bp;
   }

   public foa v() {
      return this.aL;
   }

   public fhz w() {
      return new fhz(this, this.ad);
   }

   public void a(egl.c $$0, aps $$1, aic $$2, boolean $$3) {
      this.y();
      this.X.set(null);
      Instant $$4 = Instant.now();

      try {
         $$0.a($$2.c().a(), $$2.d());
         ahz $$5 = ahz.a(this.aw, this.p);
         $$5.e().a(this);
         dif.a($$5, this);
         aqq.a(false);
         this.aO = MinecraftServer.a((Function<Thread, gip>)($$4x -> new gip($$4x, this, $$0, $$1, $$2, $$5, $$0xx -> {
               anq $$1xx = new anq($$0xx + 0);
               this.X.set($$1xx);
               return anp.a($$1xx, this.bf::add);
            })));
         this.aQ = true;
         this.a(foq.a());
         this.aN.a(fsp.c.a, $$0.d(), $$2.d().g());
      } catch (Throwable var11) {
         o $$7 = o.a(var11, "Starting integrated server");
         p $$8 = $$7.a("Starting integrated server");
         $$8.a("Level ID", $$0.d());
         $$8.a("Level Name", () -> $$2.d().g());
         throw new y($$7);
      }

      while (this.X.get() == null) {
         Thread.yield();
      }

      fcj $$9 = new fcj(this.X.get());
      this.a($$9);
      this.bi.a("waitForServer");

      for (; !this.aO.ag() || this.aX != null; this.bh()) {
         $$9.d();
         this.d(false);

         try {
            Thread.sleep(16L);
         } catch (InterruptedException var10) {
         }
      }

      this.bi.c();
      Duration $$10 = Duration.between($$4, Instant.now());
      SocketAddress $$11 = this.aO.af().a();
      ug $$12 = ug.a($$11);
      $$12.a($$11.toString(), 0, new fnp($$12, this, null, null, $$3, $$10, $$0x -> {
      }));
      $$12.a(new afu(this.V().c(), this.V().b()));
      this.aP = $$12;
   }

   public void a(fnq $$0) {
      fcw $$1 = new fcw(true);
      $$1.a(vf.c("connect.joining"));
      this.e($$1);
      this.r = $$0;
      this.b($$0);
      if (!this.aQ) {
         ahz $$2 = ahz.a(this.aw, this.p);
         $$2.e().a(this);
         dif.a($$2, this);
         aqq.a(false);
      }
   }

   public void y() {
      this.b((fcz)(new fcw(true)));
   }

   public void b(fcz $$0) {
      fnr $$1 = this.J();
      if ($$1 != null) {
         this.bt();
         $$1.j();
         this.z();
      }

      this.aH.b();
      if (this.bm.e()) {
         this.bm();
      }

      gip $$2 = this.aO;
      this.aO = null;
      this.j.i();
      this.q = null;
      this.bs.b();
      this.aY = true;

      try {
         this.e($$0);
         if (this.r != null) {
            if ($$2 != null) {
               this.bi.a("waitForServer");

               while (!$$2.E()) {
                  this.d(false);
               }

               this.bi.c();
            }

            this.l.i();
            this.aQ = false;
         }

         this.r = null;
         this.b(null);
         this.s = null;
      } finally {
         this.aY = false;
      }

      dif.c();
   }

   public void z() {
      this.ak.i();
      this.bu();
   }

   public void c(fcz $$0) {
      fnr $$1 = this.J();
      if ($$1 != null) {
         $$1.k();
      }

      if (this.bm.e()) {
         this.bm();
      }

      this.j.i();
      this.q = null;
      this.bs.b();
      this.aY = true;

      try {
         this.e($$0);
         this.l.i();
         this.r = null;
         this.b(null);
         this.s = null;
      } finally {
         this.aY = false;
      }

      dif.c();
   }

   private void e(fcz $$0) {
      this.bi.a("forcedTick");
      this.aq.e();
      this.t = null;
      this.aP = null;
      this.a($$0);
      this.d(false);
      this.bi.c();
   }

   public void d(fcz $$0) {
      this.bi.a("forcedTick");
      this.a($$0);
      this.d(false);
      this.bi.c();
   }

   private void b(@Nullable fnq $$0) {
      this.f.a($$0);
      this.g.a($$0);
      this.aJ.a($$0);
      this.d();
   }

   public boolean A() {
      return this.B() && this.m.af().c();
   }

   public boolean B() {
      return this.C() && this.ay.properties().flag(UserFlag.OPTIONAL_TELEMETRY_AVAILABLE);
   }

   public boolean C() {
      return this.ay.properties().flag(UserFlag.TELEMETRY_ENABLED);
   }

   public boolean D() {
      return this.ag && this.ay.properties().flag(UserFlag.SERVERS_ALLOWED) && this.F() == null && !this.G();
   }

   public boolean E() {
      return this.ay.properties().flag(UserFlag.REALMS_ALLOWED) && this.F() == null;
   }

   @Nullable
   public BanDetails F() {
      return (BanDetails)this.ay.properties().bannedScopes().get("MULTIPLAYER");
   }

   public boolean G() {
      ProfileResult $$0 = this.M.getNow(null);
      return $$0 != null && $$0.actions().contains(ProfileActionType.FORCED_NAME_CHANGE);
   }

   public boolean a(UUID $$0) {
      return this.H().a(false) ? this.aH.c($$0) : (this.s == null || !$$0.equals(this.s.cw())) && !$$0.equals(ac.d);
   }

   public evg.a H() {
      if (this.m.m().c() == cff.c) {
         return evg.a.b;
      } else if (!this.ah) {
         return evg.a.c;
      } else {
         return !this.ay.properties().flag(UserFlag.CHAT_ALLOWED) ? evg.a.d : evg.a.a;
      }
   }

   public final boolean I() {
      return this.af;
   }

   @Nullable
   public fnr J() {
      return this.s == null ? null : this.s.cn;
   }

   public static boolean K() {
      return !E.m.Z;
   }

   public static boolean L() {
      return E.m.j().c().a() >= euz.b.a();
   }

   public static boolean M() {
      return !E.j.a() && E.m.j().c().a() >= euz.c.a();
   }

   public static boolean N() {
      return E.m.k().c();
   }

   private void bz() {
      if (this.v != null && this.v.c() != elq.a.a) {
         boolean $$0 = this.s.fT().d;
         dgu $$1 = null;
         elq.a $$2 = this.v.c();
         cmx $$6;
         if ($$2 == elq.a.b) {
            hx $$3 = ((elo)this.v).a();
            djg $$4 = this.r.a_($$3);
            if ($$4.i()) {
               return;
            }

            cwp $$5 = $$4.b();
            $$6 = $$5.a((ctr)this.r, $$3, $$4);
            if ($$6.b()) {
               return;
            }

            if ($$0 && fcz.r() && $$4.t()) {
               $$1 = this.r.c_($$3);
            }
         } else {
            if ($$2 != elq.a.c || !$$0) {
               return;
            }

            blu $$7 = ((elp)this.v).a();
            $$6 = $$7.dz();
            if ($$6 == null) {
               return;
            }
         }

         if ($$6.b()) {
            String $$10 = "";
            if ($$2 == elq.a.b) {
               $$10 = kd.e.b(this.r.a_(((elo)this.v).a()).b()).toString();
            } else if ($$2 == elq.a.c) {
               $$10 = kd.g.b(((elp)this.v).a().ai()).toString();
            }

            F.warn("Picking on: [{}] {} gave null item", $$2, $$10);
         } else {
            cfg $$11 = this.s.fS();
            if ($$1 != null) {
               this.a($$6, $$1);
            }

            int $$12 = $$11.b($$6);
            if ($$0) {
               $$11.a($$6);
               this.q.a(this.s.b(bjz.a), 36 + $$11.l);
            } else if ($$12 != -1) {
               if (cfg.d($$12)) {
                  $$11.l = $$12;
               } else {
                  this.q.a($$12);
               }
            }
         }
      }
   }

   private void a(cmx $$0, dgu $$1) {
      sn $$2 = $$1.o();
      ckq.a($$0, $$1.v(), $$2);
      if ($$0.d() instanceof cnl && $$2.e("SkullOwner")) {
         sn $$3 = $$2.p("SkullOwner");
         sn $$4 = $$0.w();
         $$4.a("SkullOwner", $$3);
         sn $$5 = $$4.p("BlockEntityTag");
         $$5.r("SkullOwner");
         $$5.r("x");
         $$5.r("y");
         $$5.r("z");
      } else {
         sn $$6 = new sn();
         st $$7 = new st();
         $$7.add(ti.a("\"(+NBT)\""));
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

      if (this.aO != null) {
         this.aO.b($$1);
      }

      this.bn.a($$0);
      return $$0;
   }

   public static void a(@Nullable evg $$0, @Nullable gfs $$1, String $$2, @Nullable evk $$3, o $$4) {
      ab $$5 = $$4.g();
      a($$5, $$0, $$1, $$2, $$3);
   }

   private static String a(double $$0) {
      return String.format(Locale.ROOT, "%.3fs", $$0);
   }

   private void a(p $$0) {
      $$0.a("JVM uptime", () -> a((double)ManagementFactory.getRuntimeMXBean().getUptime() / 1000.0));
      $$0.a("Wall uptime", () -> a((double)(System.currentTimeMillis() - this.by) / 1000.0));
      $$0.a("High-res time", () -> a((double)ac.b() / 1000.0));
      $$0.a("Client ticks", () -> String.format(Locale.ROOT, "%d ticks / %.3fs", this.bz, (double)this.bz / 20.0));
   }

   private static ab a(ab $$0, @Nullable evg $$1, @Nullable gfs $$2, String $$3, @Nullable evk $$4) {
      $$0.a("Launched Version", () -> $$3);
      String $$5 = bc();
      if ($$5 != null) {
         $$0.a("Launcher name", $$5);
      }

      $$0.a("Backend library", RenderSystem::getBackendDescription);
      $$0.a("Backend API", RenderSystem::getApiDescription);
      $$0.a("Window size", () -> $$1 != null ? $$1.Q.k() + "x" + $$1.Q.l() : "<not initialized>");
      $$0.a("GL Caps", RenderSystem::getCapsString);
      $$0.a("GL debug messages", () -> eor.b() ? String.join("\n", eor.a()) : "<disabled>");
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
      $$0.a("CPU", eos::b);
      return $$0;
   }

   public static evg O() {
      return E;
   }

   public CompletableFuture<Void> P() {
      return this.a(this::k).thenCompose($$0 -> (CompletionStage<Void>)$$0);
   }

   public void a(foq $$0) {
      if (!this.bu.a($$0)) {
         this.bu = fou.a($$0, this.ay);
      }
   }

   @Nullable
   public fob Q() {
      return x.a(this.J(), fnr::x);
   }

   public boolean R() {
      return this.aQ;
   }

   public boolean S() {
      return this.aQ && this.aO != null;
   }

   @Nullable
   public gip T() {
      return this.aO;
   }

   public boolean U() {
      gip $$0 = this.T();
      return $$0 != null && !$$0.p();
   }

   public boolean b(UUID $$0) {
      return $$0.equals(this.V().b());
   }

   public evv V() {
      return this.W;
   }

   public GameProfile W() {
      ProfileResult $$0 = this.M.join();
      return $$0 != null ? $$0.profile() : new GameProfile(this.W.b(), this.W.c());
   }

   public Proxy X() {
      return this.ac;
   }

   public gem Y() {
      return this.N;
   }

   public aqh Z() {
      return this.ai;
   }

   public aps aa() {
      return this.al;
   }

   public aoy ab() {
      return this.aj;
   }

   public gha ac() {
      return this.ak;
   }

   public Path ad() {
      return this.L;
   }

   public gfs ae() {
      return this.am;
   }

   public Function<ahg, gel> a(ahg $$0) {
      return this.aA.a($$0)::a;
   }

   public boolean af() {
      return this.ae;
   }

   public boolean ag() {
      return this.aS;
   }

   public fsz ah() {
      return this.au;
   }

   public gjc ai() {
      return this.aq;
   }

   public aro aj() {
      aro $$0 = x.a(this.y, fcz::B);
      if ($$0 != null) {
         return $$0;
      } else if (this.s != null) {
         if (this.s.dM().ae() == cto.j) {
            return this.l.j().b() ? arp.d : arp.e;
         } else {
            ih<cun> $$1 = this.s.dM().t(this.s.dm());
            if (!this.ar.c(arp.f) && (!this.s.be() || !$$1.a(asf.Z))) {
               return this.s.dM().ae() != cto.i && this.s.fT().d && this.s.fT().c ? arp.b : $$1.a().o().orElse(arp.g);
            } else {
               return arp.f;
            }
         }
      } else {
         return arp.a;
      }
   }

   public MinecraftSessionService ak() {
      return this.ax;
   }

   public gfl al() {
      return this.az;
   }

   @Nullable
   public blu am() {
      return this.t;
   }

   public void a(blu $$0) {
      this.t = $$0;
      this.j.a($$0);
   }

   public boolean b(blu $$0) {
      return $$0.cd() || this.s != null && this.s.P_() && this.m.S.e() && $$0.ai() == bly.bv;
   }

   @Override
   protected Thread aw() {
      return this.aZ;
   }

   @Override
   protected Runnable f(Runnable $$0) {
      return $$0;
   }

   @Override
   protected boolean e(Runnable $$0) {
      return true;
   }

   public ftz an() {
      return this.aB;
   }

   public fyj ao() {
      return this.T;
   }

   public fve ap() {
      return this.aJ;
   }

   public fzj aq() {
      return this.U;
   }

   public <T> gil<T> a(gik.a<T> $$0) {
      return this.V.a($$0);
   }

   public <T> void a(gik.a<T> $$0, List<T> $$1) {
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

   public ewj au() {
      return this.an;
   }

   public boolean ax() {
      return this.s != null && this.s.gi() || this.m.S().c();
   }

   public ezn ay() {
      return this.aF;
   }

   public gkf az() {
      return this.aG;
   }

   public boolean aA() {
      return this.be;
   }

   public evc aB() {
      return this.Y;
   }

   public ggr aC() {
      return this.aA;
   }

   public gfj aD() {
      return this.aC;
   }

   public gfi aE() {
      return this.aD;
   }

   public ewt aF() {
      return this.aE;
   }

   @Override
   public void a(boolean $$0) {
      this.be = $$0;
   }

   public vf a(File $$0, int $$1, int $$2) {
      int $$3 = this.Q.k();
      int $$4 = this.Q.l();
      eol $$5 = new eom($$1, $$2, true, a);
      float $$6 = this.s.dE();
      float $$7 = this.s.dC();
      float $$8 = this.s.O;
      float $$9 = this.s.N;
      this.j.b(false);

      vt var12;
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

            this.s.N = this.s.dC();
            this.s.O = this.s.dE();
            $$5.a(true);
            this.j.a(1.0F, 0L, new epz());

            try {
               Thread.sleep(10L);
            } catch (InterruptedException var17) {
            }

            evr.a($$0, "panorama_" + $$10 + ".png", $$5, $$0x -> {
            });
         }

         vf $$11 = vf.b($$0.getName()).a(n.t).a($$1x -> $$1x.a(new vd(vd.a.b, $$0.getAbsolutePath())));
         return vf.a("screenshot.success", $$11);
      } catch (Exception var18) {
         F.error("Couldn't save image", var18);
         var12 = vf.a("screenshot.failure", var18.getMessage());
      } finally {
         this.s.s($$6);
         this.s.r($$7);
         this.s.O = $$8;
         this.s.N = $$9;
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

   private vf a(File $$0, int $$1, int $$2, int $$3, int $$4) {
      try {
         ByteBuffer $$5 = eos.a($$1 * $$2 * 3);
         evr $$6 = new evr($$0, $$3, $$4, $$2);
         float $$7 = (float)$$3 / (float)$$1;
         float $$8 = (float)$$4 / (float)$$2;
         float $$9 = $$7 > $$8 ? $$7 : $$8;

         for (int $$10 = ($$4 - 1) / $$2 * $$2; $$10 >= 0; $$10 -= $$2) {
            for (int $$11 = 0; $$11 < $$3; $$11 += $$1) {
               RenderSystem.setShaderTexture(0, gek.e);
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
         eos.a($$5);
         vf $$15 = vf.b($$14.getName()).a(n.t).a($$1x -> $$1x.a(new vd(vd.a.b, $$14.getAbsolutePath())));
         return vf.a("screenshot.success", $$15);
      } catch (Exception var15) {
         F.warn("Couldn't save screenshot", var15);
         return vf.a("screenshot.failure", var15.getMessage());
      }
   }

   public bgr aG() {
      return this.bi;
   }

   @Nullable
   public anq aH() {
      return this.X.get();
   }

   public gfm aI() {
      return this.at;
   }

   @Nullable
   public fct aJ() {
      return this.aX;
   }

   public fhh aK() {
      return this.aH;
   }

   public boolean aL() {
      return false;
   }

   public epd aM() {
      return this.Q;
   }

   public exm aN() {
      return this.l.k();
   }

   public ftl aO() {
      return this.S;
   }

   public void b(int $$0) {
      this.aA.a($$0);
   }

   public fmr aP() {
      return this.aI;
   }

   public boolean aQ() {
      return this.ay.properties().flag(UserFlag.PROFANITY_FILTER_ENABLED);
   }

   public void aR() {
      this.aH.a();
      this.v().a();
   }

   public evo aS() {
      return this.br;
   }

   @Nullable
   public avb aT() {
      return avb.a(this.aw.getServicesKeySet(), ServicesKeyType.PROFILE_KEY);
   }

   public evd aU() {
      return this.Z;
   }

   public void a(evd $$0) {
      this.Z = $$0;
   }

   public euy aV() {
      return this.bs;
   }

   public foe aW() {
      return this.bt;
   }

   public fou aX() {
      return this.bu;
   }

   public esf aY() {
      return this.aM;
   }

   public fsp aZ() {
      return this.aN;
   }

   public euv ba() {
      return this.bv;
   }

   public eli bb() {
      return this.bw;
   }

   private float a(float $$0) {
      if (this.r != null) {
         bkk $$1 = this.r.s();
         if ($$1.i()) {
            return Math.max($$0, $$1.g());
         }
      }

      return $$0;
   }

   @Nullable
   public static String bc() {
      return System.getProperty("minecraft.launcher.brand");
   }

   public static enum a {
      a(ve.a) {
         @Override
         public boolean a(boolean $$0) {
            return true;
         }
      },
      b(vf.c("chat.disabled.options").a(n.m)) {
         @Override
         public boolean a(boolean $$0) {
            return false;
         }
      },
      c(vf.c("chat.disabled.launcher").a(n.m)) {
         @Override
         public boolean a(boolean $$0) {
            return $$0;
         }
      },
      d(vf.a("chat.disabled.profile", vf.d(evg.E.m.K.h())).a(n.m)) {
         @Override
         public boolean a(boolean $$0) {
            return $$0;
         }
      };

      static final vf e = vf.c("chat.disabled.profile.moreInfo");
      private final vf f;

      a(vf $$0) {
         this.f = $$0;
      }

      public vf a() {
         return this.f;
      }

      public abstract boolean a(boolean var1);
   }

   static record b(eqp a, fin.c b) {
   }
}
