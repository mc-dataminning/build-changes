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
import org.joml.Matrix4fStack;
import org.lwjgl.util.tinyfd.TinyFileDialogs;
import org.slf4j.Logger;

public class eyk extends blf<Runnable> implements esi {
   static eyk E;
   private static final Logger F = LogUtils.getLogger();
   public static final boolean a = ac.j() == ac.a.d;
   private static final int G = 10;
   public static final ajc b = new ajc("default");
   public static final ajc c = new ajc("uniform");
   public static final ajc d = new ajc("alt");
   private static final ajc H = new ajc("regional_compliancies.json");
   private static final CompletableFuture<axo> I = CompletableFuture.completedFuture(axo.a);
   private static final vs J = vs.c("multiplayer.socialInteractions.not_available");
   public static final String e = "Please make sure you have up-to-date drivers (see aka.ms/mcdriver for instructions).";
   private final long K = Double.doubleToLongBits(Math.PI);
   private final Path L;
   private final CompletableFuture<ProfileResult> M;
   private final gia N;
   private final DataFixer O;
   private final fxi P;
   private final esh Q;
   private final eyx R = new eyx(20.0F, 0L, this::a);
   private final fww S;
   public final fwo f;
   private final gbw T;
   private final gcw U;
   public final fug g;
   private final gly V = new gly();
   private final eyz W;
   public final ezv h;
   public final ezv i;
   public final fwj j;
   public final gac k;
   private final AtomicReference<apn> X = new AtomicReference<>();
   public final ezw l;
   public final eyo m;
   private final eyg Y;
   public final eyl n;
   public final eyj o;
   private eyh Z = eyh.a;
   public final File p;
   private final String aa;
   private final String ab;
   private final Proxy ac;
   private final ejo ad;
   private final boolean ae;
   private final boolean af;
   private final boolean ag;
   private final boolean ah;
   private final asc ai;
   private final aqw aj;
   private final gko ak;
   private final arq al;
   private final gjg am;
   private final ezo an;
   private final ezs ao;
   private final erp ap;
   private final gmq aq;
   private final gml ar;
   private final fcz as;
   private final gja at;
   private final fwk au;
   private final eyq av = new eyq(H, eyk::b);
   private final YggdrasilAuthenticationService aw;
   private final MinecraftSessionService ax;
   private final UserApiService ay;
   private final CompletableFuture<UserProperties> az;
   private final giz aA;
   private final gkf aB;
   private final fxk aC;
   private final gix aD;
   private final giw aE;
   private final ezy aF;
   private final fcu aG;
   private final gnt aH;
   private final fkp aI;
   private final fqb aJ;
   private final fyp aK;
   private final gmu aL;
   private final frl aM;
   private final evj aN;
   private final fwa aO;
   @Nullable
   public fri q;
   @Nullable
   public fra r;
   @Nullable
   public fvs s;
   @Nullable
   private gmd aP;
   @Nullable
   private uq aQ;
   private boolean aR;
   @Nullable
   public bof t;
   @Nullable
   public bof u;
   @Nullable
   public eot v;
   private int aS;
   protected int w;
   private volatile boolean aT;
   private float aU;
   private long aV = ac.c();
   private long aW;
   private int aX;
   public boolean x;
   @Nullable
   public fgh y;
   @Nullable
   private fgb aY;
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
   private fcv bi;
   private bjc bj = biz.a;
   private int bk;
   private final biw bl = new biw(ac.b, () -> this.bk);
   @Nullable
   private bjb bm;
   private bkn bn = bkm.a;
   private final eyu bo = new eyu();
   private long bp;
   private double bq;
   @Nullable
   private esw.a br;
   private final eys bs;
   private final eyc bt;
   private final frr bu;
   private fsg bv;
   private final exz bw;
   private final eol bx;
   private boolean by;
   private final long bz;
   private long bA;
   private String bB = "root";

   public eyk(flv $$0) {
      super("Client");
      E = this;
      this.bz = System.currentTimeMillis();
      this.p = $$0.c.a;
      File $$1 = $$0.c.c;
      this.L = $$0.c.b.toPath();
      this.aa = $$0.d.b;
      this.ab = $$0.d.c;
      Path $$2 = this.p.toPath();
      this.bx = ejo.a($$2.resolve("allowed_symlinks.txt"));
      giq $$3 = new giq($$0.c.a(), this.bx);
      this.ak = new gko(this, $$2.resolve("downloads"), $$0.a);
      ars $$4 = new arm(this.L, aqu.a, arr.b, this.bx);
      this.al = new arq($$3, this.ak.a(), $$4);
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
      this.ae = bi();
      this.aP = null;
      wx.a(eyi::a);
      this.O = axt.a();
      this.aG = new fcu(this);
      this.ba = Thread.currentThread();
      this.m = new eyo(this, this.p);
      RenderSystem.setShaderGlintAlpha(this.m.ak().c());
      this.bb = true;
      this.aH = new gnt(this, this.m);
      this.Y = new eyg($$2, this.O);
      F.info("Backend library: {}", RenderSystem.getBackendDescription());
      eru $$5;
      if (this.m.p > 0 && this.m.o > 0) {
         $$5 = new eru(this.m.o, this.m.p, $$0.b.c, $$0.b.d, $$0.b.e);
      } else {
         $$5 = $$0.b;
      }

      ac.b = RenderSystem.initBackendSystem();
      this.P = new fxi(this);
      this.Q = this.P.a($$5, this.m.k, this.bf());
      this.a(true);
      gnf.a.b(gnb.A);

      try {
         this.Q.a(this.aj, aa.b().g() ? erx.a : erx.b);
      } catch (IOException var13) {
         F.error("Couldn't set icon", var13);
      }

      this.Q.a(this.m.h().c());
      this.n = new eyl(this);
      this.n.a(this.Q.i());
      this.o = new eyj(this);
      this.o.a(this.Q.i());
      RenderSystem.initRenderer(this.m.u, false);
      this.ap = new erm(this.Q.k(), this.Q.l());
      this.ap.a(0.0F, 0.0F, 0.0F, 0.0F);
      this.ap.b(a);
      this.ai = new asc(aqu.a);
      this.al.a();
      this.m.b(this.al);
      this.am = new gjg(this.m.ad);
      this.ai.a(this.am);
      this.N = new gia(this.ai);
      this.ai.a(this.N);
      this.aA = new giz(this.N, $$1.toPath().resolve("skins"), this.ax, this);
      this.ad = new ejo($$2.resolve("saves"), $$2.resolve("backups"), this.bx, this.O);
      this.bw = new exz($$2);
      this.aq = new gmq(this.m);
      this.ai.a(this.aq);
      this.at = new gja(this.W);
      this.ai.a(this.at);
      this.ar = new gml(this);
      this.as = new fcz(this.N);
      this.h = this.as.a();
      this.i = this.as.b();
      this.ai.a(this.as);
      this.b(this.j());
      this.ai.a(new git());
      this.ai.a(new gis());
      this.Q.a("Startup");
      RenderSystem.setupDefaultState(0, 0, this.Q.k(), this.Q.l());
      this.Q.a("Post startup");
      this.an = ezo.a();
      this.ao = ezs.a(this.an);
      this.aB = new gkf(this.N, this.an, this.m.A().c());
      this.ai.a(this.aB);
      this.aJ = new fqb();
      this.ai.a(this.aJ);
      this.aK = new fyp(this.h, this.aJ, this::ao, this::ar, this::ap);
      this.ai.a(this.aK);
      fwd $$8 = new fwd(this.aK, this.aJ);
      this.ai.a($$8);
      this.U = new gcw(this, this.N, this.aB, this.ao, $$8);
      this.ai.a(this.U);

      try {
         int $$9 = Runtime.getRuntime().availableProcessors();
         int $$10 = this.ag() ? $$9 : Math.min($$9, 4);
         etf.a();
         this.S = new fww($$10);
      } catch (OutOfMemoryError var12) {
         TinyFileDialogs.tinyfd_messageBox(
            "Minecraft",
            "Oh no! The game was unable to allocate memory off-heap while trying to start. You may try to free some memory by closing other applications on your computer, check that your system meets the minimum requirements, and try again. If the problem persists, please visit: https://aka.ms/Minecraft-Support",
            "ok",
            "error",
            true
         );
         throw new flw("Unable to allocate render buffers", var12);
      }

      this.aI = new fkp(this, this.ay);
      this.aC = new fxk(this.aB.b(), $$8, this.an);
      this.ai.a(this.aC);
      this.T = new gbw(this, this.N, this.U, this.aC, this.h, this.m, this.aJ);
      this.ai.a(this.T);
      this.j = new fwj(this, this.T.d(), this.ai, this.S);
      this.ai.a(this.j.e());
      this.f = new fwo(this, this.T, this.aK, this.S);
      this.ai.a(this.f);
      this.bh();
      this.ai.a(this.V);
      this.g = new fug(this.r, this.N);
      this.ai.a(this.g);
      this.aD = new gix(this.N);
      this.ai.a(this.aD);
      this.aE = new giw(this.N);
      this.ai.a(this.aE);
      this.aF = new ezy(this.N);
      this.ai.a(this.aF);
      this.au = new fwk();
      this.ai.a(this.au);
      this.ai.a(this.av);
      this.l = new ezw(this);
      this.k = new gac(this);
      ett $$12 = ett.a(this);
      this.aN = new evj($$12);
      RenderSystem.setErrorCallback(this::a);
      if (this.ap.c != this.Q.k() || this.ap.d != this.Q.l()) {
         StringBuilder $$13 = new StringBuilder(
            "Recovering from unsupported resolution ("
               + this.Q.k()
               + "x"
               + this.Q.l()
               + ").\nPlease make sure you have up-to-date drivers (see aka.ms/mcdriver for instructions)."
         );
         if (erv.b()) {
            $$13.append("\n\nReported GL debug messages:\n").append(String.join("\n", erv.a()));
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
      this.aL = new gmu(this, this.ay, this.W);
      this.aM = frl.a(this.ay, this.W, $$2);
      this.bs = new eys(this);
      this.bt = new eyc(this);
      this.bt.a(this.m.ap().c() != eym.a);
      this.bu = new frr(this);
      this.bu.a(this.m.y().c());
      this.bv = fsg.a(fsd.a(), this.ay);
      fft.a(this);
      this.a(new ffn(vs.c("gui.loadingMinecraft")));
      List<aqt> $$14 = this.al.g();
      this.bo.a(eyu.b.a, $$14);
      asb $$15 = this.ai.a(ac.f(), this, I, $$14);
      gnf.a.a(gnb.C);
      eyk.b $$16 = new eyk.b($$12, $$0.e);
      this.a(new fft(this, $$15, $$1x -> ac.a($$1x, $$1xx -> this.a($$1xx, $$16), () -> {
            if (aa.aV) {
               this.bk();
            }

            this.bo.a();
            this.a($$16);
         }), false));
      this.aO = fwa.a($$0.e.b());
   }

   private void a(@Nullable eyk.b $$0) {
      if (!this.by) {
         this.by = true;
         this.b($$0);
      }
   }

   private void b(@Nullable eyk.b $$0) {
      Runnable $$1 = this.c($$0);
      gnf.a.b(gnb.C);
      gnf.a.b(gnb.z);
      gnf.a.a(this.aL.a());
      $$1.run();
   }

   public boolean c() {
      return this.by;
   }

   private Runnable c(@Nullable eyk.b $$0) {
      List<Function<Runnable, fgh>> $$1 = new ArrayList<>();
      this.a($$1);
      Runnable $$2 = () -> {
         if ($$0 != null && $$0.b().a()) {
            fvz.a(this, $$0.b(), $$0.a());
         } else {
            this.a(new fgm(true));
         }
      };

      for (Function<Runnable, fgh> $$3 : Lists.reverse($$1)) {
         fgh $$4 = $$3.apply($$2);
         $$2 = () -> this.a($$4);
      }

      return $$2;
   }

   private void a(List<Function<Runnable, fgh>> $$0) {
      if (this.m.ae) {
         $$0.add($$0x -> new fes(this.m, $$0x));
      }

      BanDetails $$1 = this.G();
      if ($$1 != null) {
         $$0.add($$1x -> few.a($$1xx -> {
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
            $$0.add($$1x -> few.a($$3.getName(), $$1x));
         }

         if ($$4.contains(ProfileActionType.USING_BANNED_SKIN)) {
            $$0.add(few::a);
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
      this.Q.b(this.bf());
   }

   private String bf() {
      StringBuilder $$0 = new StringBuilder("Minecraft");
      if (e().a()) {
         $$0.append("*");
      }

      $$0.append(" ");
      $$0.append(aa.b().c());
      frb $$1 = this.K();
      if ($$1 != null && $$1.l().i()) {
         $$0.append(" - ");
         frn $$2 = this.R();
         if (this.aP != null && !this.aP.r()) {
            $$0.append(gje.a("title.singleplayer"));
         } else if ($$2 != null && $$2.e()) {
            $$0.append(gje.a("title.multiplayer.realms"));
         } else if (this.aP == null && ($$2 == null || !$$2.d())) {
            $$0.append(gje.a("title.multiplayer.other"));
         } else {
            $$0.append(gje.a("title.multiplayer.lan"));
         }
      }

      return $$0.toString();
   }

   private UserApiService a(YggdrasilAuthenticationService $$0, flv $$1) {
      return $$0.createUserApiService($$1.a.a.d());
   }

   public static awl e() {
      return awl.a("vanilla", ClientBrandRetriever::getClientModName, "Client", eyk.class);
   }

   private void a(Throwable $$0, @Nullable eyk.b $$1) {
      if (this.al.d().size() > 1) {
         this.a($$0, null, $$1);
      } else {
         ac.a($$0);
      }
   }

   public void a(Throwable $$0, @Nullable vs $$1, @Nullable eyk.b $$2) {
      F.info("Caught error loading resourcepacks, removing all selected resourcepacks", $$0);
      this.bo.a($$0);
      this.ak.b();
      this.al.a(Collections.emptyList());
      this.m.i.clear();
      this.m.j.clear();
      this.m.as();
      this.a(true, $$2).thenRun(() -> this.a($$1));
   }

   private void bg() {
      this.a(null);
      if (this.r != null) {
         this.r.W();
         this.x();
      }

      this.a(new fgm());
      this.a(null);
   }

   private void a(@Nullable vs $$0) {
      fcu $$1 = this.ax();
      fcs.b($$1, fcs.a.c, vs.c("resourcePack.load_fail"), $$0);
   }

   public void f() {
      this.ba = Thread.currentThread();
      if (Runtime.getRuntime().availableProcessors() > 4) {
         this.ba.setPriority(10);
      }

      try {
         boolean $$0 = false;

         while (this.bb) {
            this.bj();

            try {
               bjf $$1 = bjf.a("Renderer");
               boolean $$2 = this.aO().e();
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

               this.bm();
               this.a(new fga());
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

   private void bh() {
      this.V
         .a(
            gly.a,
            $$0 -> new glr<>(
                  $$0x -> $$0x.a(null, crh.a.a.c()).stream().map($$0xx -> n.a($$0xx.getString()).trim()).filter($$0xx -> !$$0xx.isEmpty()),
                  $$0x -> Stream.of(kh.h.b($$0x.d())),
                  $$0
               )
         );
      this.V.a(gly.b, $$0 -> new gls<>($$0x -> $$0x.f().map(aut::b), $$0));
      this.V
         .a(
            gly.c,
            $$0 -> new glr<>(
                  $$0x -> $$0x.e()
                        .stream()
                        .flatMap($$1 -> $$1.b().a($$0x.a()).a(null, crh.a.a).stream())
                        .map($$0xx -> n.a($$0xx.getString()).trim())
                        .filter($$0xx -> !$$0xx.isEmpty()),
                  $$0x -> $$0x.e().stream().map($$1 -> kh.h.b($$1.b().a($$0x.a()).d())),
                  $$0
               )
         );
      cnz.e().a($$0 -> {
         this.a(gly.a, $$0);
         this.a(gly.b, $$0);
      });
   }

   private void a(int $$0, long $$1) {
      this.m.L().a(false);
      this.m.as();
   }

   private static boolean bi() {
      String[] $$0 = new String[]{"sun.arch.data.model", "com.ibm.vm.bitmode", "os.arch"};

      for (String $$1 : $$0) {
         String $$2 = System.getProperty($$1);
         if ($$2 != null && $$2.contains("64")) {
            return true;
         }
      }

      return false;
   }

   public erp g() {
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

   private void bj() {
      if (this.bc != null) {
         a(this, this.p, this.bc.get());
      }
   }

   public void c(o $$0) {
      o $$1 = this.d($$0);
      this.bm();
      a(this, this.p, $$1);
   }

   public static void a(@Nullable eyk $$0, File $$1, o $$2) {
      File $$3 = new File($$1, "crash-reports");
      File $$4 = new File($$3, "crash-" + ac.e() + "-client.txt");
      aje.a($$2.e());
      if ($$0 != null) {
         $$0.aq.h();
      }

      if ($$2.f() != null) {
         aje.a("#@!@# Game crashed! Crash report saved to: #@!@# " + $$2.f());
         System.exit(-1);
      } else if ($$2.a($$4)) {
         aje.a("#@!@# Game crashed! Crash report saved to: #@!@# " + $$4.getAbsolutePath());
         System.exit(-1);
      } else {
         aje.a("#@?@# Game crashed! Crash report could not be saved. #@?@#");
         System.exit(-2);
      }
   }

   public boolean j() {
      return this.m.N().c();
   }

   public CompletableFuture<Void> k() {
      return this.a(false, null);
   }

   private CompletableFuture<Void> a(boolean $$0, @Nullable eyk.b $$1) {
      if (this.bh != null) {
         return this.bh;
      } else {
         CompletableFuture<Void> $$2 = new CompletableFuture<>();
         if (!$$0 && this.aY instanceof fft) {
            this.bh = $$2;
            return $$2;
         } else {
            this.al.a();
            List<aqt> $$3 = this.al.g();
            if (!$$0) {
               this.bo.a(eyu.b.b, $$3);
            }

            this.a(new fft(this, this.ai.a(ac.f(), this, I, $$3), $$3x -> ac.a($$3x, $$2xx -> {
                  if ($$0) {
                     this.ak.c();
                     this.bg();
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

   private void bk() {
      boolean $$0 = false;
      fxj $$1 = this.ao().a();
      gjz $$2 = $$1.a().a();

      for (czf $$3 : kh.e) {
         UnmodifiableIterator $$10 = $$3.n().a().iterator();

         while ($$10.hasNext()) {
            dme $$4 = (dme)$$10.next();
            if ($$4.l() == dfk.c) {
               gjz $$5 = $$1.b($$4);
               if ($$5 == $$2) {
                  F.debug("Missing model for: {}", $$4);
                  $$0 = true;
               }
            }
         }
      }

      ghz $$6 = $$2.e();

      for (czf $$7 : kh.e) {
         UnmodifiableIterator var17 = $$7.n().a().iterator();

         while (var17.hasNext()) {
            dme $$8 = (dme)var17.next();
            ghz $$9 = $$1.a($$8);
            if (!$$8.i() && $$9 == $$6) {
               F.debug("Missing particle icon for: {}", $$8);
            }
         }
      }

      for (cpl $$10 : kh.h) {
         cpq $$11 = $$10.an_();
         String $$12 = $$11.r();
         String $$13 = vs.c($$12).getString();
         if ($$13.toLowerCase(Locale.ROOT).equals($$10.a())) {
            F.debug("Missing translation for: {} {} {}", new Object[]{$$11, $$12, $$10});
         }
      }

      $$0 |= ffu.a();
      $$0 |= gbz.a();
      if ($$0) {
         throw new IllegalStateException("Your game data is foobar, fix the errors above!");
      }
   }

   public ejo l() {
      return this.ad;
   }

   private void a(String $$0) {
      eyk.a $$1 = this.I();
      if (!$$1.a(this.S())) {
         if (this.l.b()) {
            this.l.b(false);
            this.a(new fez($$0x -> {
               if ($$0x) {
                  ac.j().a("https://aka.ms/JavaAccountSettings");
               }

               this.a(null);
            }, eyk.a.e, "https://aka.ms/JavaAccountSettings", true));
         } else {
            vs $$2 = $$1.a();
            this.l.a($$2, false);
            this.bt.c($$2);
            this.l.b($$1 == eyk.a.d);
         }
      } else {
         this.a(new fey($$0));
      }
   }

   public void a(@Nullable fgh $$0) {
      if (aa.aV && Thread.currentThread() != this.ba) {
         F.error("setScreen called from non-game thread");
      }

      if (this.y != null) {
         this.y.k();
      }

      if ($$0 == null && this.aZ) {
         throw new IllegalStateException("Trying to return to in-game GUI during disconnection");
      } else {
         if ($$0 == null && this.r == null) {
            $$0 = new fgm();
         } else if ($$0 == null && this.s.ev()) {
            if (this.s.o()) {
               $$0 = new ffg(null, this.r.k().l());
            } else {
               this.s.fT();
            }
         }

         this.y = $$0;
         if (this.y != null) {
            this.y.aH_();
         }

         esz.a();
         if ($$0 != null) {
            this.n.j();
            eyi.b();
            $$0.b(this, this.Q.o(), this.Q.p());
            this.x = false;
         } else {
            this.aq.i();
            this.n.i();
         }

         this.d();
      }
   }

   public void a(@Nullable fgb $$0) {
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

            this.x();
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
         fdk.b();
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

      if (this.bh != null && !(this.aY instanceof fft)) {
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
         this.bz();
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
      if (!this.aO().d() && !this.bn.e()) {
         $$8 = false;
         this.bq = 0.0;
      } else {
         $$8 = this.br == null || this.br.b();
         if ($$8) {
            esw.a().ifPresent(esw::b);
         }
      }

      RenderSystem.clear(16640, a);
      this.ap.a(true);
      fwi.a();
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
         ezx $$9 = new ezx(this, this.S.c());
         this.a($$9, this.bm);
         $$9.e();
         this.bj.c();
      }

      this.bj.a("blit");
      this.ap.e();
      this.ap.a(this.Q.k(), this.Q.l());
      this.be = ac.c() - $$6;
      if ($$8) {
         esw.a().ifPresent($$0x -> this.br = $$0x.c());
      }

      this.bj.b("updateDisplay");
      this.Q.e();
      int $$10 = this.bl();
      if ($$10 < 260) {
         RenderSystem.limitDisplayFPS($$10);
      }

      this.bj.b("yield");
      Thread.yield();
      this.bj.c();
      this.Q.a("Post render");
      this.aX++;
      boolean $$11 = this.T() && (this.y != null && this.y.m() || this.aY != null && this.aY.a()) && !this.aP.r();
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

      this.aO().a($$13);
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
            this.m.i().c() == exy.a ? "" : (this.m.i().c() == exy.b ? " fast-clouds" : " fancy-clouds"),
            this.m.C().c(),
            $$14
         );
         this.aW += 1000L;
         this.aX = 0;
      }

      this.bj.c();
   }

   private bjc a(boolean $$0, @Nullable bjf $$1) {
      if (!$$0) {
         this.bl.b();
         if (!this.bn.e() && $$1 == null) {
            return biz.a;
         }
      }

      bjc $$2;
      if ($$0) {
         if (!this.bl.a()) {
            this.bk = 0;
            this.bl.c();
         }

         this.bk++;
         $$2 = this.bl.d();
      } else {
         $$2 = biz.a;
      }

      if (this.bn.e()) {
         $$2 = bjc.a($$2, this.bn.f());
      }

      return bjf.a($$2, $$1);
   }

   private void b(boolean $$0, @Nullable bjf $$1) {
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

      erp $$1 = this.g();
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

   private int bl() {
      return this.r != null || this.y == null && this.aY == null ? this.Q.d() : 60;
   }

   private void bm() {
      try {
         awk.b();
         this.f.p();
      } catch (Throwable var3) {
      }

      try {
         System.gc();
         if (this.aR && this.aP != null) {
            this.aP.a(true);
         }

         this.b((fgh)(new ffn(vs.c("menu.savingLevel"))));
      } catch (Throwable var2) {
      }

      System.gc();
   }

   public boolean a(Consumer<vs> $$0) {
      if (this.bn.e()) {
         this.bn();
         return false;
      } else {
         Consumer<bjb> $$1 = $$1x -> {
            if ($$1x != bix.a) {
               int $$2x = $$1x.f();
               double $$3x = (double)$$1x.g() / (double)axl.a;
               this.execute(
                  () -> $$0.accept(
                        vs.a("commands.debug.stopped", String.format(Locale.ROOT, "%.2f", $$3x), $$2x, String.format(Locale.ROOT, "%.2f", (double)$$2x / $$3x))
                     )
               );
            }
         };
         Consumer<Path> $$2 = $$1x -> {
            vs $$2x = vs.b($$1x.toString()).a(n.t).a($$1xx -> $$1xx.a(new vq(vq.a.b, $$1x.toFile().getParent())));
            this.execute(() -> $$0.accept(vs.a("debug.profiling.stop", $$2x)));
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

         this.bn = bkl.a(new fvx(ac.b, this.f), ac.b, ac.g(), new bkr("client"), $$1x -> {
            this.bn = bkm.a;
            $$1.accept($$1x);
         }, $$5);
         return true;
      }
   }

   private void bn() {
      this.bn.a();
      if (this.aP != null) {
         this.aP.aY();
      }
   }

   private void bo() {
      this.bn.b();
      if (this.aP != null) {
         this.aP.aZ();
      }
   }

   private Path a(ab $$0, List<Path> $$1) {
      String $$2;
      if (this.S()) {
         $$2 = this.U().bc().e();
      } else {
         frn $$3 = this.R();
         $$2 = $$3 != null ? $$3.a : "unknown";
      }

      Path $$7;
      try {
         String $$5 = String.format(Locale.ROOT, "%s-%s-%s", ac.e(), $$2, aa.b().b());
         String $$6 = v.a(bkr.a, $$5, ".zip");
         $$7 = bkr.a.resolve($$6);
      } catch (IOException var21) {
         throw new UncheckedIOException(var21);
      }

      try (avx $$10 = new avx($$7)) {
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
         List<bje> $$1 = this.bm.a(this.bB);
         if (!$$1.isEmpty()) {
            bje $$2 = $$1.remove(0);
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

   private void a(ezx $$0, bjb $$1) {
      List<bje> $$2 = $$1.a(this.bB);
      bje $$3 = $$2.remove(0);
      RenderSystem.clear(256, a);
      RenderSystem.setShader(fwj::q);
      Matrix4f $$4 = new Matrix4f().setOrtho(0.0F, (float)this.Q.k(), (float)this.Q.l(), 0.0F, 1000.0F, 3000.0F);
      RenderSystem.setProjectionMatrix($$4, etl.b);
      Matrix4fStack $$5 = RenderSystem.getModelViewStack();
      $$5.pushMatrix();
      $$5.translation(0.0F, 0.0F, -2000.0F);
      RenderSystem.applyModelViewMatrix();
      RenderSystem.lineWidth(1.0F);
      etf $$6 = etf.b();
      esy $$7 = $$6.d();
      int $$8 = 160;
      int $$9 = this.Q.k() - 160 - 10;
      int $$10 = this.Q.l() - 320;
      RenderSystem.enableBlend();
      $$7.a(eti.b.h, etb.n);
      $$7.a((double)((float)$$9 - 176.0F), (double)((float)$$10 - 96.0F - 16.0F), 0.0).a(200, 0, 0, 0).e();
      $$7.a((double)((float)$$9 - 176.0F), (double)($$10 + 320), 0.0).a(200, 0, 0, 0).e();
      $$7.a((double)((float)$$9 + 176.0F), (double)($$10 + 320), 0.0).a(200, 0, 0, 0).e();
      $$7.a((double)((float)$$9 + 176.0F), (double)((float)$$10 - 96.0F - 16.0F), 0.0).a(200, 0, 0, 0).e();
      $$6.c();
      RenderSystem.disableBlend();
      double $$11 = 0.0;

      for (bje $$12 : $$2) {
         int $$13 = awm.a($$12.a / 4.0) + 1;
         $$7.a(eti.b.g, etb.n);
         int $$14 = $$12.a();
         int $$15 = $$14 >> 16 & 0xFF;
         int $$16 = $$14 >> 8 & 0xFF;
         int $$17 = $$14 & 0xFF;
         $$7.a((double)$$9, (double)$$10, 0.0).a($$15, $$16, $$17, 255).e();

         for (int $$18 = $$13; $$18 >= 0; $$18--) {
            float $$19 = (float)(($$11 + $$12.a * (double)$$18 / (double)$$13) * (float) (Math.PI * 2) / 100.0);
            float $$20 = awm.a($$19) * 160.0F;
            float $$21 = awm.b($$19) * 160.0F * 0.5F;
            $$7.a((double)((float)$$9 + $$20), (double)((float)$$10 - $$21), 0.0).a($$15, $$16, $$17, 255).e();
         }

         $$6.c();
         $$7.a(eti.b.f, etb.n);

         for (int $$22 = $$13; $$22 >= 0; $$22--) {
            float $$23 = (float)(($$11 + $$12.a * (double)$$22 / (double)$$13) * (float) (Math.PI * 2) / 100.0);
            float $$24 = awm.a($$23) * 160.0F;
            float $$25 = awm.b($$23) * 160.0F * 0.5F;
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
      String $$27 = bjb.b($$3.d);
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
         bje $$31 = $$2.get($$30);
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

      $$5.popMatrix();
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
         boolean $$1 = this.T() && !this.aP.r();
         if ($$1) {
            this.a(new fgc(!$$0));
            this.aq.e();
         } else {
            this.a(new fgc(true));
         }
      }
   }

   private void e(boolean $$0) {
      if (!$$0) {
         this.w = 0;
      }

      if (this.w <= 0 && !this.s.fp()) {
         if ($$0 && this.v != null && this.v.c() == eot.a.b) {
            eor $$1 = (eor)this.v;
            ib $$2 = $$1.a();
            if (!this.r.a_($$2).i()) {
               ih $$3 = $$1.b();
               if (this.q.b($$2, $$3)) {
                  this.g.a($$2, $$3);
                  this.s.a(bmk.a);
               }
            }
         } else {
            this.q.b();
         }
      }
   }

   private boolean bp() {
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
         cpq $$0 = this.s.b(bmk.a);
         if (!$$0.a(this.r.I())) {
            return false;
         } else {
            boolean $$1 = false;
            switch (this.v.c()) {
               case c:
                  this.q.a(this.s, ((eos)this.v).a());
                  break;
               case b:
                  eor $$2 = (eor)this.v;
                  ib $$3 = $$2.a();
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

                  this.s.gp();
            }

            this.s.a(bmk.a);
            return $$1;
         }
      }
   }

   private void bq() {
      if (!this.q.k()) {
         this.aS = 4;
         if (!this.s.A()) {
            if (this.v == null) {
               F.warn("Null returned as 'hitResult', this shouldn't happen!");
            }

            for (bmk $$0 : bmk.values()) {
               cpq $$1 = this.s.b($$0);
               if (!$$1.a(this.r.I())) {
                  return;
               }

               if (this.v != null) {
                  switch (this.v.c()) {
                     case c:
                        eos $$2 = (eos)this.v;
                        bof $$3 = $$2.a();
                        if (!this.r.D_().a($$3.dj())) {
                           return;
                        }

                        bml $$4 = this.q.a(this.s, $$3, $$2, $$0);
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
                        eor $$5 = (eor)this.v;
                        int $$6 = $$1.M();
                        bml $$7 = this.q.a(this.s, $$0, $$5);
                        if ($$7.a()) {
                           if ($$7.b()) {
                              this.s.a($$0);
                              if (!$$1.b() && ($$1.M() != $$6 || this.q.f())) {
                                 this.j.b.a($$0);
                              }
                           }

                           return;
                        }

                        if ($$7 == bml.e) {
                           return;
                        }
                  }
               }

               if (!$$1.b()) {
                  bml $$8 = this.q.a(this.s, $$0);
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

   public gml r() {
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
         if (this.y instanceof ffp $$1 && !this.s.fF()) {
            $$1.o();
         }
      } else if (this.s.ev() && !(this.y instanceof ffg)) {
         this.a(null);
      } else if (this.s.fF() && this.r != null) {
         this.a(new ffp());
      }

      if (this.y != null) {
         this.w = 10000;
      }

      if (this.y != null) {
         fgh.a(() -> this.y.e(), "Ticking screen", this.y.getClass().getCanonicalName());
      }

      if (!this.aO().d()) {
         this.l.l();
      }

      if (this.aY == null && this.y == null) {
         this.bj.b("Keybindings");
         this.bs();
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
            if (!this.m.s && this.br()) {
               vs $$2 = vs.c("tutorial.socialInteractions.title");
               vs $$3 = vs.a("tutorial.socialInteractions.description", gnt.a("socialInteractions"));
               this.bi = new fcv(fcv.a.f, $$2, $$3, true);
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
            this.r.b(this.s.dn(), this.s.dp(), this.s.dt());
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

   private boolean br() {
      return !this.aR || this.aP != null && this.aP.r();
   }

   private void bs() {
      while (this.m.P.g()) {
         exw $$0 = this.m.ax();
         this.m.a(this.m.ax().c());
         if ($$0.a() != this.m.ax().a()) {
            this.j.a(this.m.ax().a() ? this.an() : null);
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
               this.s.fV().l = $$1;
            } else {
               fhv.a(this, $$1, $$3, $$2);
            }
         }
      }

      while (this.m.N.g()) {
         if (!this.br()) {
            this.s.a(J, true);
            this.bt.c(J);
         } else {
            if (this.bi != null) {
               this.aH.a(this.bi);
               this.bi = null;
            }

            this.a(new fkr());
         }
      }

      while (this.m.E.g()) {
         if (this.q.g()) {
            this.s.i();
         } else {
            this.aH.a();
            this.a(new fig(this.s));
         }
      }

      while (this.m.T.g()) {
         this.a(new fgx(this.s.cr.q()));
      }

      while (this.m.F.g()) {
         if (!this.s.P_()) {
            this.K().b(new afy(afy.a.g, ib.c, ih.a));
         }
      }

      while (this.m.G.g()) {
         if (!this.s.P_() && this.s.a(fgh.t())) {
            this.s.a(bmk.a);
         }
      }

      while (this.m.K.g()) {
         this.a("");
      }

      if (this.y == null && this.aY == null && this.m.M.g()) {
         this.a("/");
      }

      boolean $$4 = false;
      if (this.s.fp()) {
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
            $$4 |= this.bp();
         }

         while (this.m.H.g()) {
            this.bq();
         }

         while (this.m.J.g()) {
            this.bB();
         }
      }

      if (this.m.H.e() && this.aS == 0 && !this.s.fp()) {
         this.bq();
      }

      this.e(this.y == null && !$$4 && this.m.I.e() && this.n.h());
   }

   public gmu t() {
      return this.aL;
   }

   public double u() {
      return this.bq;
   }

   public frl v() {
      return this.aM;
   }

   public flh w() {
      return new flh(this, this.ad);
   }

   public void a(ejo.c $$0, arq $$1, ajy $$2, boolean $$3) {
      this.x();
      this.X.set(null);
      Instant $$4 = Instant.now();

      try {
         $$0.a($$2.c().a(), $$2.d());
         ajv $$5 = ajv.a(this.aw, this.p);
         $$5.f().a(this);
         dkw.a($$5, this);
         aso.a(false);
         this.aP = MinecraftServer.a((Function<Thread, gmd>)($$4x -> new gmd($$4x, this, $$0, $$1, $$2, $$5, $$0xx -> {
               apn $$1xx = apn.b($$0xx + 0);
               this.X.set($$1xx);
               return apm.a($$1xx, this.bg::add);
            })));
         this.aR = true;
         this.a(fsd.a());
         this.aO.a(fwa.c.a, $$0.d(), $$2.d().e());
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

      ffr $$9 = new ffr(this.X.get());
      this.a($$9);
      this.bj.a("waitForServer");

      for (; !this.aP.aj() || this.aY != null; this.bj()) {
         $$9.e();
         this.d(false);

         try {
            Thread.sleep(16L);
         } catch (InterruptedException var10) {
         }
      }

      this.bj.c();
      Duration $$10 = Duration.between($$4, Instant.now());
      SocketAddress $$11 = this.aP.ai().a();
      uq $$12 = uq.a($$11);
      $$12.a($$11.toString(), 0, new fqz($$12, this, null, null, $$3, $$10, $$0x -> {
      }, null));
      $$12.a(new ahk(this.W().c(), this.W().b()));
      this.aQ = $$12;
   }

   public void a(fra $$0) {
      fge $$1 = new fge(true);
      $$1.a(vs.c("connect.joining"));
      this.e($$1);
      this.r = $$0;
      this.b($$0);
      if (!this.aR) {
         ajv $$2 = ajv.a(this.aw, this.p);
         $$2.f().a(this);
         dkw.a($$2, this);
         aso.a(false);
      }
   }

   public void x() {
      this.a(new fge(true), false);
   }

   public void b(fgh $$0) {
      this.a($$0, false);
   }

   public void a(fgh $$0, boolean $$1) {
      frb $$2 = this.K();
      if ($$2 != null) {
         this.by();
         $$2.i();
         if (!$$1) {
            this.y();
         }
      }

      this.aI.b();
      if (this.bn.e()) {
         this.bo();
      }

      gmd $$3 = this.aP;
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

               while (!$$3.H()) {
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

      dkw.b();
   }

   public void y() {
      this.ak.i();
      this.bz();
   }

   public void c(fgh $$0) {
      frb $$1 = this.K();
      if ($$1 != null) {
         $$1.j();
      }

      if (this.bn.e()) {
         this.bo();
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

      dkw.b();
   }

   private void e(fgh $$0) {
      this.bj.a("forcedTick");
      this.aq.f();
      this.t = null;
      this.aQ = null;
      this.a($$0);
      this.d(false);
      this.bj.c();
   }

   public void d(fgh $$0) {
      this.bj.a("forcedTick");
      this.a($$0);
      this.d(false);
      this.bj.c();
   }

   private void b(@Nullable fra $$0) {
      this.f.a($$0);
      this.g.a($$0);
      this.aK.a($$0);
      this.d();
   }

   private UserProperties bt() {
      return this.az.join();
   }

   public boolean B() {
      return this.C() && this.m.af().c();
   }

   public boolean C() {
      return this.D() && this.bt().flag(UserFlag.OPTIONAL_TELEMETRY_AVAILABLE);
   }

   public boolean D() {
      return aa.aV ? false : this.bt().flag(UserFlag.TELEMETRY_ENABLED);
   }

   public boolean E() {
      return this.ag && this.bt().flag(UserFlag.SERVERS_ALLOWED) && this.G() == null && !this.H();
   }

   public boolean F() {
      return this.bt().flag(UserFlag.REALMS_ALLOWED) && this.G() == null;
   }

   @Nullable
   public BanDetails G() {
      return (BanDetails)this.bt().bannedScopes().get("MULTIPLAYER");
   }

   public boolean H() {
      ProfileResult $$0 = this.M.getNow(null);
      return $$0 != null && $$0.actions().contains(ProfileActionType.FORCED_NAME_CHANGE);
   }

   public boolean a(UUID $$0) {
      return this.I().a(false) ? this.aI.c($$0) : (this.s == null || !$$0.equals(this.s.ct())) && !$$0.equals(ac.d);
   }

   public eyk.a I() {
      if (this.m.m().c() == chy.c) {
         return eyk.a.b;
      } else if (!this.ah) {
         return eyk.a.c;
      } else {
         return !this.bt().flag(UserFlag.CHAT_ALLOWED) ? eyk.a.d : eyk.a.a;
      }
   }

   public final boolean J() {
      return this.af;
   }

   @Nullable
   public frb K() {
      return this.s == null ? null : this.s.cr;
   }

   public static boolean L() {
      return !E.m.Z;
   }

   public static boolean M() {
      return E.m.j().c().a() >= eyd.b.a();
   }

   public static boolean N() {
      return !E.j.a() && E.m.j().c().a() >= eyd.c.a();
   }

   public static boolean O() {
      return E.m.k().c();
   }

   private void bB() {
      if (this.v != null && this.v.c() != eot.a.a) {
         boolean $$0 = this.s.fW().d;
         djl $$1 = null;
         eot.a $$2 = this.v.c();
         cpq $$6;
         if ($$2 == eot.a.b) {
            ib $$3 = ((eor)this.v).a();
            dme $$4 = this.r.a_($$3);
            if ($$4.i()) {
               return;
            }

            czf $$5 = $$4.b();
            $$6 = $$5.a((cwh)this.r, $$3, $$4);
            if ($$6.b()) {
               return;
            }

            if ($$0 && fgh.t() && $$4.t()) {
               $$1 = this.r.c_($$3);
            }
         } else {
            if ($$2 != eot.a.c || !$$0) {
               return;
            }

            bof $$7 = ((eos)this.v).a();
            $$6 = $$7.dw();
            if ($$6 == null) {
               return;
            }
         }

         if ($$6.b()) {
            String $$10 = "";
            if ($$2 == eot.a.b) {
               $$10 = kh.e.b(this.r.a_(((eor)this.v).a()).b()).toString();
            } else if ($$2 == eot.a.c) {
               $$10 = kh.g.b(((eos)this.v).a().ai()).toString();
            }

            F.warn("Picking on: [{}] {} gave null item", $$2, $$10);
         } else {
            chz $$11 = this.s.fV();
            if ($$1 != null) {
               this.a($$6, $$1, this.r.I_());
            }

            int $$12 = $$11.b($$6);
            if ($$0) {
               $$11.a($$6);
               this.q.a(this.s.b(bmk.a), 36 + $$11.l);
            } else if ($$12 != -1) {
               if (chz.d($$12)) {
                  $$11.l = $$12;
               } else {
                  this.q.a($$12);
               }
            }
         }
      }
   }

   private void a(cpq $$0, djl $$1, iy $$2) {
      sy $$3 = $$1.b($$2);
      cnl.a($$0, $$1.r(), $$3);
      if ($$0.d() instanceof cqe && $$3.e("SkullOwner")) {
         sy $$4 = $$3.p("SkullOwner");
         sy $$5 = $$0.x();
         $$5.a("SkullOwner", $$4);
         sy $$6 = $$5.p("BlockEntityTag");
         $$6.r("SkullOwner");
         $$6.r("x");
         $$6.r("y");
         $$6.r("z");
      } else {
         sy $$7 = new sy();
         te $$8 = new te();
         $$8.add(tt.a("\"(+NBT)\""));
         $$7.a("Lore", $$8);
         $$0.a("display", $$7);
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

   public static void a(@Nullable eyk $$0, @Nullable gjg $$1, String $$2, @Nullable eyo $$3, o $$4) {
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

   private static ab a(ab $$0, @Nullable eyk $$1, @Nullable gjg $$2, String $$3, @Nullable eyo $$4) {
      $$0.a("Launched Version", () -> $$3);
      String $$5 = be();
      if ($$5 != null) {
         $$0.a("Launcher name", $$5);
      }

      $$0.a("Backend library", RenderSystem::getBackendDescription);
      $$0.a("Backend API", RenderSystem::getApiDescription);
      $$0.a("Window size", () -> $$1 != null ? $$1.Q.k() + "x" + $$1.Q.l() : "<not initialized>");
      $$0.a("GL Caps", RenderSystem::getCapsString);
      $$0.a("GL debug messages", () -> erv.b() ? String.join("\n", erv.a()) : "<disabled>");
      $$0.a("Using VBOs", () -> "Yes");
      $$0.a("Is Modded", () -> e().b());
      $$0.a("Universe", () -> $$1 != null ? Long.toHexString($$1.K) : "404");
      $$0.a("Type", "Client (map_client.txt)");
      if ($$4 != null) {
         if ($$1 != null) {
            String $$6 = $$1.ai().m();
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
      $$0.a("CPU", erw::b);
      return $$0;
   }

   public static eyk P() {
      return E;
   }

   public CompletableFuture<Void> Q() {
      return this.a(this::k).thenCompose($$0 -> (CompletionStage<Void>)$$0);
   }

   public void a(fsd $$0) {
      if (!this.bv.a($$0)) {
         this.bv = fsg.a($$0, this.ay);
      }
   }

   @Nullable
   public frn R() {
      return x.a(this.K(), frb::x);
   }

   public boolean S() {
      return this.aR;
   }

   public boolean T() {
      return this.aR && this.aP != null;
   }

   @Nullable
   public gmd U() {
      return this.aP;
   }

   public boolean V() {
      gmd $$0 = this.U();
      return $$0 != null && !$$0.r();
   }

   public boolean b(UUID $$0) {
      return $$0.equals(this.W().b());
   }

   public eyz W() {
      return this.W;
   }

   public GameProfile X() {
      ProfileResult $$0 = this.M.join();
      return $$0 != null ? $$0.profile() : new GameProfile(this.W.b(), this.W.c());
   }

   public Proxy Y() {
      return this.ac;
   }

   public gia Z() {
      return this.N;
   }

   public asf aa() {
      return this.ai;
   }

   public arq ab() {
      return this.al;
   }

   public aqw ac() {
      return this.aj;
   }

   public gko ad() {
      return this.ak;
   }

   public Path ae() {
      return this.L;
   }

   public gjg af() {
      return this.am;
   }

   public Function<ajc, ghz> a(ajc $$0) {
      return this.aB.a($$0)::a;
   }

   public boolean ag() {
      return this.ae;
   }

   public boolean ah() {
      return this.aT;
   }

   public fwk ai() {
      return this.au;
   }

   public gmq aj() {
      return this.aq;
   }

   public atm ak() {
      atm $$0 = x.a(this.y, fgh::D);
      if ($$0 != null) {
         return $$0;
      } else if (this.s != null) {
         if (this.s.dJ().ad() == cwe.j) {
            return this.l.j().b() ? atn.d : atn.e;
         } else {
            il<cxd> $$1 = this.s.dJ().t(this.s.dj());
            if (!this.ar.c(atn.f) && (!this.s.be() || !$$1.a(aud.Z))) {
               return this.s.dJ().ad() != cwe.i && this.s.fW().d && this.s.fW().c ? atn.b : $$1.a().o().orElse(atn.g);
            } else {
               return atn.f;
            }
         }
      } else {
         return atn.a;
      }
   }

   public MinecraftSessionService al() {
      return this.ax;
   }

   public giz am() {
      return this.aA;
   }

   @Nullable
   public bof an() {
      return this.t;
   }

   public void a(bof $$0) {
      this.t = $$0;
      this.j.a($$0);
   }

   public boolean b(bof $$0) {
      return $$0.ca() || this.s != null && this.s.P_() && this.m.S.e() && $$0.ai() == bol.bw;
   }

   @Override
   protected Thread az() {
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

   public fxk ao() {
      return this.aC;
   }

   public gbw ap() {
      return this.T;
   }

   public fyp aq() {
      return this.aK;
   }

   public gcw ar() {
      return this.U;
   }

   public <T> glz<T> a(gly.a<T> $$0) {
      return this.V.a($$0);
   }

   public <T> void a(gly.a<T> $$0, List<T> $$1) {
      this.V.a($$0, $$1);
   }

   public DataFixer as() {
      return this.O;
   }

   public float at() {
      return this.R.a;
   }

   public float au() {
      return this.R.b;
   }

   public ezo av() {
      return this.an;
   }

   public boolean aw() {
      return this.s != null && this.s.gl() || this.m.S().c();
   }

   public fcu ax() {
      return this.aG;
   }

   public gnt aA() {
      return this.aH;
   }

   public boolean aB() {
      return this.bf;
   }

   public eyg aC() {
      return this.Y;
   }

   public gkf aD() {
      return this.aB;
   }

   public gix aE() {
      return this.aD;
   }

   public giw aF() {
      return this.aE;
   }

   public ezy aG() {
      return this.aF;
   }

   @Override
   public void a(boolean $$0) {
      this.bf = $$0;
   }

   public vs a(File $$0, int $$1, int $$2) {
      int $$3 = this.Q.k();
      int $$4 = this.Q.l();
      erp $$5 = new erq($$1, $$2, true, a);
      float $$6 = this.s.dB();
      float $$7 = this.s.dz();
      float $$8 = this.s.N;
      float $$9 = this.s.M;
      this.j.b(false);

      wg var12;
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

            this.s.M = this.s.dz();
            this.s.N = this.s.dB();
            $$5.a(true);
            this.j.a(1.0F, 0L);

            try {
               Thread.sleep(10L);
            } catch (InterruptedException var17) {
            }

            eyv.a($$0, "panorama_" + $$10 + ".png", $$5, $$0x -> {
            });
         }

         vs $$11 = vs.b($$0.getName()).a(n.t).a($$1x -> $$1x.a(new vq(vq.a.b, $$0.getAbsolutePath())));
         return vs.a("screenshot.success", $$11);
      } catch (Exception var18) {
         F.error("Couldn't save image", var18);
         var12 = vs.a("screenshot.failure", var18.getMessage());
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

   private vs a(File $$0, int $$1, int $$2, int $$3, int $$4) {
      try {
         ByteBuffer $$5 = erw.a($$1 * $$2 * 3);
         eyv $$6 = new eyv($$0, $$3, $$4, $$2);
         float $$7 = (float)$$3 / (float)$$1;
         float $$8 = (float)$$4 / (float)$$2;
         float $$9 = $$7 > $$8 ? $$7 : $$8;

         for (int $$10 = ($$4 - 1) / $$2 * $$2; $$10 >= 0; $$10 -= $$2) {
            for (int $$11 = 0; $$11 < $$3; $$11 += $$1) {
               RenderSystem.setShaderTexture(0, ghy.e);
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
         erw.a($$5);
         vs $$15 = vs.b($$14.getName()).a(n.t).a($$1x -> $$1x.a(new vq(vq.a.b, $$14.getAbsolutePath())));
         return vs.a("screenshot.success", $$15);
      } catch (Exception var15) {
         F.warn("Couldn't save screenshot", var15);
         return vs.a("screenshot.failure", var15.getMessage());
      }
   }

   public bjc aH() {
      return this.bj;
   }

   @Nullable
   public apn aI() {
      return this.X.get();
   }

   public gja aJ() {
      return this.at;
   }

   @Nullable
   public fgb aK() {
      return this.aY;
   }

   public fkp aL() {
      return this.aI;
   }

   public boolean aM() {
      return false;
   }

   public esh aN() {
      return this.Q;
   }

   public fas aO() {
      return this.l.k();
   }

   public fww aP() {
      return this.S;
   }

   public void b(int $$0) {
      this.aB.a($$0);
   }

   public fqb aQ() {
      return this.aJ;
   }

   public boolean aR() {
      return this.bt().flag(UserFlag.PROFANITY_FILTER_ENABLED);
   }

   public void aS() {
      this.aI.a();
      this.v().a();
   }

   public eys aT() {
      return this.bs;
   }

   @Nullable
   public awy aU() {
      return awy.a(this.aw.getServicesKeySet(), ServicesKeyType.PROFILE_KEY);
   }

   public boolean aV() {
      return !this.aw.getServicesKeySet().keys(ServicesKeyType.PROFILE_KEY).isEmpty();
   }

   public eyh aW() {
      return this.Z;
   }

   public void a(eyh $$0) {
      this.Z = $$0;
   }

   public eyc aX() {
      return this.bt;
   }

   public frr aY() {
      return this.bu;
   }

   public fsg aZ() {
      return this.bv;
   }

   public evj ba() {
      return this.aN;
   }

   public fwa bb() {
      return this.aO;
   }

   public exz bc() {
      return this.bw;
   }

   public eol bd() {
      return this.bx;
   }

   private float a(float $$0) {
      if (this.r != null) {
         bmw $$1 = this.r.s();
         if ($$1.i()) {
            return Math.max($$0, $$1.g());
         }
      }

      return $$0;
   }

   @Nullable
   public static String be() {
      return System.getProperty("minecraft.launcher.brand");
   }

   public static enum a {
      a(vr.a) {
         @Override
         public boolean a(boolean $$0) {
            return true;
         }
      },
      b(vs.c("chat.disabled.options").a(n.m)) {
         @Override
         public boolean a(boolean $$0) {
            return false;
         }
      },
      c(vs.c("chat.disabled.launcher").a(n.m)) {
         @Override
         public boolean a(boolean $$0) {
            return $$0;
         }
      },
      d(vs.a("chat.disabled.profile", vs.d(eyk.E.m.K.h())).a(n.m)) {
         @Override
         public boolean a(boolean $$0) {
            return $$0;
         }
      };

      static final vs e = vs.c("chat.disabled.profile.moreInfo");
      private final vs f;

      a(vs $$0) {
         this.f = $$0;
      }

      public vs a() {
         return this.f;
      }

      public abstract boolean a(boolean var1);
   }

   static record b(ett a, flv.c b) {
   }
}
