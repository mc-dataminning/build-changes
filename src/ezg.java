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

public class ezg extends blw<Runnable> implements ete {
   static ezg E;
   private static final Logger F = LogUtils.getLogger();
   public static final boolean a = ac.j() == ac.a.d;
   private static final int G = 10;
   public static final ajh b = new ajh("default");
   public static final ajh c = new ajh("uniform");
   public static final ajh d = new ajh("alt");
   private static final ajh H = new ajh("regional_compliancies.json");
   private static final CompletableFuture<axy> I = CompletableFuture.completedFuture(axy.a);
   private static final vu J = vu.c("multiplayer.socialInteractions.not_available");
   public static final String e = "Please make sure you have up-to-date drivers (see aka.ms/mcdriver for instructions).";
   private final long K = Double.doubleToLongBits(Math.PI);
   private final Path L;
   private final CompletableFuture<ProfileResult> M;
   private final gja N;
   private final DataFixer O;
   private final fyi P;
   private final etd Q;
   private final ezt R = new ezt(20.0F, 0L, this::a);
   private final fxw S;
   public final fxo f;
   private final gcw T;
   private final gdw U;
   public final fvg g;
   private final gmy V = new gmy();
   private final ezv W;
   public final far h;
   public final far i;
   public final fxj j;
   public final gbc k;
   private final AtomicReference<aps> X = new AtomicReference<>();
   public final fas l;
   public final ezk m;
   private final ezc Y;
   public final ezh n;
   public final ezf o;
   private ezd Z = ezd.a;
   public final File p;
   private final String aa;
   private final String ab;
   private final Proxy ac;
   private final ekk ad;
   private final boolean ae;
   private final boolean af;
   private final boolean ag;
   private final boolean ah;
   private final asl ai;
   private final are aj;
   private final glo ak;
   private final arz al;
   private final gkg am;
   private final fak an;
   private final fao ao;
   private final esl ap;
   private final gnq aq;
   private final gnl ar;
   private final fdv as;
   private final gka at;
   private final fxk au;
   private final ezm av = new ezm(H, ezg::b);
   private final YggdrasilAuthenticationService aw;
   private final MinecraftSessionService ax;
   private final UserApiService ay;
   private final CompletableFuture<UserProperties> az;
   private final gjz aA;
   private final glf aB;
   private final fyk aC;
   private final gjx aD;
   private final gjw aE;
   private final fau aF;
   private final fdq aG;
   private final got aH;
   private final fln aI;
   private final fqz aJ;
   private final fzp aK;
   private final gnu aL;
   private final fsk aM;
   private final ewf aN;
   private final fxa aO;
   @Nullable
   public fsh q;
   @Nullable
   public fry r;
   @Nullable
   public fws s;
   @Nullable
   private gnd aP;
   @Nullable
   private us aQ;
   private boolean aR;
   @Nullable
   public bow t;
   @Nullable
   public bow u;
   @Nullable
   public epp v;
   private int aS;
   protected int w;
   private volatile boolean aT;
   private float aU;
   private long aV = ac.c();
   private long aW;
   private int aX;
   public boolean x;
   @Nullable
   public fhf y;
   @Nullable
   private fgz aY;
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
   private fdr bi;
   private bjq bj = bjn.a;
   private int bk;
   private final bjk bl = new bjk(ac.b, () -> this.bk);
   @Nullable
   private bjp bm;
   private ble bn = bld.a;
   private final ezq bo = new ezq();
   private long bp;
   private double bq;
   @Nullable
   private ets.a br;
   private final ezo bs;
   private final eyy bt;
   private final fsr bu;
   private ftg bv;
   private final eyv bw;
   private final eph bx;
   private boolean by;
   private final long bz;
   private long bA;
   private String bB = "root";

   public ezg(fmt $$0) {
      super("Client");
      E = this;
      this.bz = System.currentTimeMillis();
      this.p = $$0.c.a;
      File $$1 = $$0.c.c;
      this.L = $$0.c.b.toPath();
      this.aa = $$0.d.b;
      this.ab = $$0.d.c;
      Path $$2 = this.p.toPath();
      this.bx = ekk.a($$2.resolve("allowed_symlinks.txt"));
      gjq $$3 = new gjq($$0.c.a(), this.bx);
      this.ak = new glo(this, $$2.resolve("downloads"), $$0.a);
      asb $$4 = new aru(this.L, arc.a, asa.b, this.bx);
      this.al = new arz($$3, this.ak.a(), $$4);
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
      this.ae = bj();
      this.aP = null;
      wz.a(eze::a);
      this.O = ayd.a();
      this.aG = new fdq(this);
      this.ba = Thread.currentThread();
      this.m = new ezk(this, this.p);
      RenderSystem.setShaderGlintAlpha(this.m.al().c());
      this.bb = true;
      this.aH = new got(this, this.m);
      this.Y = new ezc($$2, this.O);
      F.info("Backend library: {}", RenderSystem.getBackendDescription());
      esq $$5;
      if (this.m.p > 0 && this.m.o > 0) {
         $$5 = new esq(this.m.o, this.m.p, $$0.b.c, $$0.b.d, $$0.b.e);
      } else {
         $$5 = $$0.b;
      }

      ac.b = RenderSystem.initBackendSystem();
      this.P = new fyi(this);
      this.Q = this.P.a($$5, this.m.k, this.bg());
      this.a(true);
      gof.a.b(gob.A);

      try {
         this.Q.a(this.aj, aa.b().g() ? est.a : est.b);
      } catch (IOException var13) {
         F.error("Couldn't set icon", var13);
      }

      this.Q.a(this.m.h().c());
      this.n = new ezh(this);
      this.n.a(this.Q.i());
      this.o = new ezf(this);
      this.o.a(this.Q.i());
      RenderSystem.initRenderer(this.m.u, false);
      this.ap = new esi(this.Q.k(), this.Q.l());
      this.ap.a(0.0F, 0.0F, 0.0F, 0.0F);
      this.ap.b(a);
      this.ai = new asl(arc.a);
      this.al.a();
      this.m.b(this.al);
      this.am = new gkg(this.m.ad);
      this.ai.a(this.am);
      this.N = new gja(this.ai);
      this.ai.a(this.N);
      this.aA = new gjz(this.N, $$1.toPath().resolve("skins"), this.ax, this);
      this.ad = new ekk($$2.resolve("saves"), $$2.resolve("backups"), this.bx, this.O);
      this.bw = new eyv($$2);
      this.aq = new gnq(this.m);
      this.ai.a(this.aq);
      this.at = new gka(this.W);
      this.ai.a(this.at);
      this.ar = new gnl(this);
      this.as = new fdv(this.N);
      this.h = this.as.a();
      this.i = this.as.b();
      this.ai.a(this.as);
      this.g();
      this.ai.a(new gjt());
      this.ai.a(new gjs());
      this.Q.a("Startup");
      RenderSystem.setupDefaultState(0, 0, this.Q.k(), this.Q.l());
      this.Q.a("Post startup");
      this.an = fak.a();
      this.ao = fao.a(this.an);
      this.aB = new glf(this.N, this.an, this.m.A().c());
      this.ai.a(this.aB);
      this.aJ = new fqz();
      this.ai.a(this.aJ);
      this.aK = new fzp(this.h, this.aJ, this::ap, this::as, this::aq);
      this.ai.a(this.aK);
      fxd $$8 = new fxd(this.aK, this.aJ);
      this.ai.a($$8);
      this.U = new gdw(this, this.N, this.aB, this.ao, $$8);
      this.ai.a(this.U);

      try {
         int $$9 = Runtime.getRuntime().availableProcessors();
         int $$10 = this.ah() ? $$9 : Math.min($$9, 4);
         eub.a();
         this.S = new fxw($$10);
      } catch (OutOfMemoryError var12) {
         TinyFileDialogs.tinyfd_messageBox(
            "Minecraft",
            "Oh no! The game was unable to allocate memory off-heap while trying to start. You may try to free some memory by closing other applications on your computer, check that your system meets the minimum requirements, and try again. If the problem persists, please visit: https://aka.ms/Minecraft-Support",
            "ok",
            "error",
            true
         );
         throw new fmu("Unable to allocate render buffers", var12);
      }

      this.aI = new fln(this, this.ay);
      this.aC = new fyk(this.aB.b(), $$8, this.an);
      this.ai.a(this.aC);
      this.T = new gcw(this, this.N, this.U, this.aC, this.h, this.m, this.aJ);
      this.ai.a(this.T);
      this.j = new fxj(this, this.T.d(), this.ai, this.S);
      this.ai.a(this.j.e());
      this.f = new fxo(this, this.T, this.aK, this.S);
      this.ai.a(this.f);
      this.bi();
      this.ai.a(this.V);
      this.g = new fvg(this.r, this.N);
      this.ai.a(this.g);
      this.aD = new gjx(this.N);
      this.ai.a(this.aD);
      this.aE = new gjw(this.N);
      this.ai.a(this.aE);
      this.aF = new fau(this.N);
      this.ai.a(this.aF);
      this.au = new fxk();
      this.ai.a(this.au);
      this.ai.a(this.av);
      this.l = new fas(this);
      this.k = new gbc(this);
      eup $$12 = eup.a(this);
      this.aN = new ewf($$12);
      RenderSystem.setErrorCallback(this::a);
      if (this.ap.c != this.Q.k() || this.ap.d != this.Q.l()) {
         StringBuilder $$13 = new StringBuilder(
            "Recovering from unsupported resolution ("
               + this.Q.k()
               + "x"
               + this.Q.l()
               + ").\nPlease make sure you have up-to-date drivers (see aka.ms/mcdriver for instructions)."
         );
         if (esr.b()) {
            $$13.append("\n\nReported GL debug messages:\n").append(String.join("\n", esr.a()));
         }

         this.Q.a(this.ap.c, this.ap.d);
         TinyFileDialogs.tinyfd_messageBox("Minecraft", $$13.toString(), "ok", "error", false);
      } else if (this.m.Y().c() && !this.Q.j()) {
         this.Q.h();
         this.m.Y().a(this.Q.j());
      }

      this.Q.a(this.m.L().c());
      this.Q.b(this.m.E().c());
      this.Q.c();
      this.a();
      this.j.a(this.aj.d());
      this.aL = new gnu(this, this.ay, this.W);
      this.aM = fsk.a(this.ay, this.W, $$2);
      this.bs = new ezo(this);
      this.bt = new eyy(this);
      this.bt.a(this.m.aq().c() != ezi.a);
      this.bu = new fsr(this);
      this.bu.a(this.m.y().c());
      this.bv = ftg.a(ftd.a(), this.ay);
      fgr.a(this);
      this.a(new fgl(vu.c("gui.loadingMinecraft")));
      List<ara> $$14 = this.al.g();
      this.bo.a(ezq.b.a, $$14);
      ask $$15 = this.ai.a(ac.f(), this, I, $$14);
      gof.a.a(gob.C);
      ezg.b $$16 = new ezg.b($$12, $$0.e);
      this.a(new fgr(this, $$15, $$1x -> ac.a($$1x, $$1xx -> this.a($$1xx, $$16), () -> {
            if (aa.aW) {
               this.bl();
            }

            this.bo.a();
            this.a($$16);
         }), false));
      this.aO = fxa.a($$0.e.b());
   }

   private void a(@Nullable ezg.b $$0) {
      if (!this.by) {
         this.by = true;
         this.b($$0);
      }
   }

   private void b(@Nullable ezg.b $$0) {
      Runnable $$1 = this.c($$0);
      gof.a.b(gob.C);
      gof.a.b(gob.z);
      gof.a.a(this.aL.a());
      $$1.run();
   }

   public boolean c() {
      return this.by;
   }

   private Runnable c(@Nullable ezg.b $$0) {
      List<Function<Runnable, fhf>> $$1 = new ArrayList<>();
      this.a($$1);
      Runnable $$2 = () -> {
         if ($$0 != null && $$0.b().a()) {
            fwz.a(this, $$0.b(), $$0.a());
         } else {
            this.a(new fhk(true));
         }
      };

      for (Function<Runnable, fhf> $$3 : Lists.reverse($$1)) {
         fhf $$4 = $$3.apply($$2);
         $$2 = () -> this.a($$4);
      }

      return $$2;
   }

   private void a(List<Function<Runnable, fhf>> $$0) {
      if (this.m.ae) {
         $$0.add($$0x -> new ffp(this.m, $$0x));
      }

      BanDetails $$1 = this.H();
      if ($$1 != null) {
         $$0.add($$1x -> fft.a($$1xx -> {
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
            $$0.add($$1x -> fft.a($$3.getName(), $$1x));
         }

         if ($$4.contains(ProfileActionType.USING_BANNED_SKIN)) {
            $$0.add(fft::a);
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
      this.Q.b(this.bg());
   }

   private String bg() {
      StringBuilder $$0 = new StringBuilder("Minecraft");
      if (e().a()) {
         $$0.append("*");
      }

      $$0.append(" ");
      $$0.append(aa.b().c());
      frz $$1 = this.L();
      if ($$1 != null && $$1.l().i()) {
         $$0.append(" - ");
         fsm $$2 = this.S();
         if (this.aP != null && !this.aP.r()) {
            $$0.append(gke.a("title.singleplayer"));
         } else if ($$2 != null && $$2.e()) {
            $$0.append(gke.a("title.multiplayer.realms"));
         } else if (this.aP == null && ($$2 == null || !$$2.d())) {
            $$0.append(gke.a("title.multiplayer.other"));
         } else {
            $$0.append(gke.a("title.multiplayer.lan"));
         }
      }

      return $$0.toString();
   }

   private UserApiService a(YggdrasilAuthenticationService $$0, fmt $$1) {
      return $$0.createUserApiService($$1.a.a.d());
   }

   public static awv e() {
      return awv.a("vanilla", ClientBrandRetriever::getClientModName, "Client", ezg.class);
   }

   private void a(Throwable $$0, @Nullable ezg.b $$1) {
      if (this.al.d().size() > 1) {
         this.a($$0, null, $$1);
      } else {
         ac.a($$0);
      }
   }

   public void a(Throwable $$0, @Nullable vu $$1, @Nullable ezg.b $$2) {
      F.info("Caught error loading resourcepacks, removing all selected resourcepacks", $$0);
      this.bo.a($$0);
      this.ak.b();
      this.al.a(Collections.emptyList());
      this.m.i.clear();
      this.m.j.clear();
      this.m.at();
      this.a(true, $$2).thenRun(() -> this.a($$1));
   }

   private void bh() {
      this.a(null);
      if (this.r != null) {
         this.r.W();
         this.y();
      }

      this.a(new fhk());
      this.a(null);
   }

   private void a(@Nullable vu $$0) {
      fdq $$1 = this.aA();
      fdo.b($$1, fdo.a.c, vu.c("resourcePack.load_fail"), $$0);
   }

   public void f() {
      this.ba = Thread.currentThread();
      if (Runtime.getRuntime().availableProcessors() > 4) {
         this.ba.setPriority(10);
      }

      try {
         boolean $$0 = false;

         while (this.bb) {
            this.bk();

            try {
               bjt $$1 = bjt.a("Renderer");
               boolean $$2 = this.aP().e();
               this.bj = this.a($$2, $$1);
               this.bj.a();
               this.bn.c();
               this.c(!$$0);
               this.bn.d();
               this.bj.b();
               this.b($$2, $$1);
            } catch (OutOfMemoryError var4) {
               if ($$0) {
                  throw var4;
               }

               this.bn();
               this.a(new fgy());
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

   void g() {
      this.as.a(this.m);
   }

   private void bi() {
      this.V
         .a(
            gmy.a,
            $$0 -> new gmr<>(
                  $$0x -> $$0x.a(null, csb.a.a.c()).stream().map($$0xx -> n.a($$0xx.getString()).trim()).filter($$0xx -> !$$0xx.isEmpty()),
                  $$0x -> Stream.of(ki.h.b($$0x.d())),
                  $$0
               )
         );
      this.V.a(gmy.b, $$0 -> new gms<>($$0x -> $$0x.f().map(avd::b), $$0));
      this.V
         .a(
            gmy.c,
            $$0 -> new gmr<>(
                  $$0x -> $$0x.e()
                        .stream()
                        .flatMap($$1 -> $$1.b().a($$0x.a()).a(null, csb.a.a).stream())
                        .map($$0xx -> n.a($$0xx.getString()).trim())
                        .filter($$0xx -> !$$0xx.isEmpty()),
                  $$0x -> $$0x.e().stream().map($$1 -> ki.h.b($$1.b().a($$0x.a()).d())),
                  $$0
               )
         );
      cou.e().a($$0 -> {
         this.a(gmy.a, $$0);
         this.a(gmy.b, $$0);
      });
   }

   private void a(int $$0, long $$1) {
      this.m.L().a(false);
      this.m.at();
   }

   private static boolean bj() {
      String[] $$0 = new String[]{"sun.arch.data.model", "com.ibm.vm.bitmode", "os.arch"};

      for (String $$1 : $$0) {
         String $$2 = System.getProperty($$1);
         if ($$2 != null && $$2.contains("64")) {
            return true;
         }
      }

      return false;
   }

   public esl h() {
      return this.ap;
   }

   public String i() {
      return this.aa;
   }

   public String j() {
      return this.ab;
   }

   public void a(o $$0) {
      this.bc = () -> this.d($$0);
   }

   public void b(o $$0) {
      this.bc = () -> $$0;
   }

   private void bk() {
      if (this.bc != null) {
         a(this, this.p, this.bc.get());
      }
   }

   public void c(o $$0) {
      o $$1 = this.d($$0);
      this.bn();
      a(this, this.p, $$1);
   }

   public static void a(@Nullable ezg $$0, File $$1, o $$2) {
      File $$3 = new File($$1, "crash-reports");
      File $$4 = new File($$3, "crash-" + ac.e() + "-client.txt");
      ajj.a($$2.e());
      if ($$0 != null) {
         $$0.aq.h();
      }

      if ($$2.f() != null) {
         ajj.a("#@!@# Game crashed! Crash report saved to: #@!@# " + $$2.f());
         System.exit(-1);
      } else if ($$2.a($$4)) {
         ajj.a("#@!@# Game crashed! Crash report saved to: #@!@# " + $$4.getAbsolutePath());
         System.exit(-1);
      } else {
         ajj.a("#@?@# Game crashed! Crash report could not be saved. #@?@#");
         System.exit(-2);
      }
   }

   public boolean k() {
      return this.m.N().c();
   }

   public CompletableFuture<Void> l() {
      return this.a(false, null);
   }

   private CompletableFuture<Void> a(boolean $$0, @Nullable ezg.b $$1) {
      if (this.bh != null) {
         return this.bh;
      } else {
         CompletableFuture<Void> $$2 = new CompletableFuture<>();
         if (!$$0 && this.aY instanceof fgr) {
            this.bh = $$2;
            return $$2;
         } else {
            this.al.a();
            List<ara> $$3 = this.al.g();
            if (!$$0) {
               this.bo.a(ezq.b.b, $$3);
            }

            this.a(new fgr(this, this.ai.a(ac.f(), this, I, $$3), $$3x -> ac.a($$3x, $$2xx -> {
                  if ($$0) {
                     this.ak.c();
                     this.bh();
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

   private void bl() {
      boolean $$0 = false;
      fyj $$1 = this.ap().a();
      gkz $$2 = $$1.a().a();

      for (daa $$3 : ki.e) {
         UnmodifiableIterator $$10 = $$3.n().a().iterator();

         while ($$10.hasNext()) {
            dmz $$4 = (dmz)$$10.next();
            if ($$4.l() == dgf.c) {
               gkz $$5 = $$1.b($$4);
               if ($$5 == $$2) {
                  F.debug("Missing model for: {}", $$4);
                  $$0 = true;
               }
            }
         }
      }

      giz $$6 = $$2.e();

      for (daa $$7 : ki.e) {
         UnmodifiableIterator var17 = $$7.n().a().iterator();

         while (var17.hasNext()) {
            dmz $$8 = (dmz)var17.next();
            giz $$9 = $$1.a($$8);
            if (!$$8.i() && $$9 == $$6) {
               F.debug("Missing particle icon for: {}", $$8);
            }
         }
      }

      for (cqf $$10 : ki.h) {
         cqk $$11 = $$10.am_();
         String $$12 = $$11.r();
         String $$13 = vu.c($$12).getString();
         if ($$13.toLowerCase(Locale.ROOT).equals($$10.a())) {
            F.debug("Missing translation for: {} {} {}", new Object[]{$$11, $$12, $$10});
         }
      }

      $$0 |= fgs.a();
      $$0 |= gcz.a();
      if ($$0) {
         throw new IllegalStateException("Your game data is foobar, fix the errors above!");
      }
   }

   public ekk m() {
      return this.ad;
   }

   private void a(String $$0) {
      ezg.a $$1 = this.J();
      if (!$$1.a(this.T())) {
         if (this.l.b()) {
            this.l.b(false);
            this.a(new ffw($$0x -> {
               if ($$0x) {
                  ac.j().a("https://aka.ms/JavaAccountSettings");
               }

               this.a(null);
            }, ezg.a.e, "https://aka.ms/JavaAccountSettings", true));
         } else {
            vu $$2 = $$1.a();
            this.l.a($$2, false);
            this.bt.c($$2);
            this.l.b($$1 == ezg.a.d);
         }
      } else {
         this.a(new ffv($$0));
      }
   }

   public void a(@Nullable fhf $$0) {
      if (aa.aW && Thread.currentThread() != this.ba) {
         F.error("setScreen called from non-game thread");
      }

      if (this.y != null) {
         this.y.k();
      }

      if ($$0 == null && this.aZ) {
         throw new IllegalStateException("Trying to return to in-game GUI during disconnection");
      } else {
         if ($$0 == null && this.r == null) {
            $$0 = new fhk();
         } else if ($$0 == null && this.s.ey()) {
            if (this.s.o()) {
               $$0 = new fgd(null, this.r.k().l());
            } else {
               this.s.fX();
            }
         }

         this.y = $$0;
         if (this.y != null) {
            this.y.aG_();
         }

         etv.a();
         if ($$0 != null) {
            this.n.j();
            eze.b();
            $$0.b(this, this.Q.o(), this.Q.p());
            this.x = false;
         } else {
            this.aq.i();
            this.n.i();
         }

         this.d();
      }
   }

   public void a(@Nullable fgz $$0) {
      this.aY = $$0;
   }

   public void n() {
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
         feh.b();
         ac.i();
      } catch (Throwable var5) {
         F.error("Shutdown failure!", var5);
         throw var5;
      } finally {
         this.P.close();
         this.Q.close();
      }
   }

   private void c(boolean $$0) {
      this.Q.a("Pre render");
      long $$1 = ac.c();
      if (this.Q.b()) {
         this.q();
      }

      if (this.bh != null && !(this.aY instanceof fgr)) {
         CompletableFuture<Void> $$2 = this.bh;
         this.bh = null;
         this.l().thenRun(() -> $$2.complete(null));
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
            this.t();
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
      if (!this.aP().d() && !this.bn.e()) {
         $$8 = false;
         this.bq = 0.0;
      } else {
         $$8 = this.br == null || this.br.b();
         if ($$8) {
            ets.a().ifPresent(ets::b);
         }
      }

      RenderSystem.clear(16640, a);
      this.ap.a(true);
      fxi.a();
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
         fat $$9 = new fat(this, this.S.c());
         this.a($$9, this.bm);
         $$9.e();
         this.bj.c();
      }

      this.bj.a("blit");
      this.ap.e();
      this.ap.a(this.Q.k(), this.Q.l());
      this.be = ac.c() - $$6;
      if ($$8) {
         ets.a().ifPresent($$0x -> this.br = $$0x.c());
      }

      this.bj.b("updateDisplay");
      this.Q.e();
      int $$10 = this.bm();
      if ($$10 < 260) {
         RenderSystem.limitDisplayFPS($$10);
      }

      this.bj.b("yield");
      Thread.yield();
      this.bj.c();
      this.Q.a("Post render");
      this.aX++;
      boolean $$11 = this.U() && (this.y != null && this.y.m() || this.aY != null && this.aY.a()) && !this.aP.r();
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

      this.aP().a($$13);
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
            this.m.i().c() == eyu.a ? "" : (this.m.i().c() == eyu.b ? " fast-clouds" : " fancy-clouds"),
            this.m.C().c(),
            $$14
         );
         this.aW += 1000L;
         this.aX = 0;
      }

      this.bj.c();
   }

   private bjq a(boolean $$0, @Nullable bjt $$1) {
      if (!$$0) {
         this.bl.b();
         if (!this.bn.e() && $$1 == null) {
            return bjn.a;
         }
      }

      bjq $$2;
      if ($$0) {
         if (!this.bl.a()) {
            this.bk = 0;
            this.bl.c();
         }

         this.bk++;
         $$2 = this.bl.d();
      } else {
         $$2 = bjn.a;
      }

      if (this.bn.e()) {
         $$2 = bjq.a($$2, this.bn.f());
      }

      return bjt.a($$2, $$1);
   }

   private void b(boolean $$0, @Nullable bjt $$1) {
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
      int $$0 = this.Q.a(this.m.ao().c(), this.k());
      this.Q.a((double)$$0);
      if (this.y != null) {
         this.y.a(this, this.Q.o(), this.Q.p());
      }

      esl $$1 = this.h();
      $$1.a(this.Q.k(), this.Q.l(), a);
      this.j.a(this.Q.k(), this.Q.l());
      this.n.g();
   }

   @Override
   public void b() {
      this.n.k();
   }

   public int o() {
      return bd;
   }

   public long p() {
      return this.be;
   }

   private int bm() {
      return this.r != null || this.y == null && this.aY == null ? this.Q.d() : 60;
   }

   private void bn() {
      try {
         awu.b();
         this.f.p();
      } catch (Throwable var3) {
      }

      try {
         System.gc();
         if (this.aR && this.aP != null) {
            this.aP.a(true);
         }

         this.b((fhf)(new fgl(vu.c("menu.savingLevel"))));
      } catch (Throwable var2) {
      }

      System.gc();
   }

   public boolean a(Consumer<vu> $$0) {
      if (this.bn.e()) {
         this.bo();
         return false;
      } else {
         Consumer<bjp> $$1 = $$1x -> {
            if ($$1x != bjl.a) {
               int $$2x = $$1x.f();
               double $$3x = (double)$$1x.g() / (double)axv.a;
               this.execute(
                  () -> $$0.accept(
                        vu.a("commands.debug.stopped", String.format(Locale.ROOT, "%.2f", $$3x), $$2x, String.format(Locale.ROOT, "%.2f", (double)$$2x / $$3x))
                     )
               );
            }
         };
         Consumer<Path> $$2 = $$1x -> {
            vu $$2x = vu.b($$1x.toString()).a(n.t).a($$1xx -> $$1xx.a(new vs(vs.a.b, $$1x.toFile().getParent())));
            this.execute(() -> $$0.accept(vu.a("debug.profiling.stop", $$2x)));
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

         this.bn = blc.a(new fwx(ac.b, this.f), ac.b, ac.g(), new bli("client"), $$1x -> {
            this.bn = bld.a;
            $$1.accept($$1x);
         }, $$5);
         return true;
      }
   }

   private void bo() {
      this.bn.a();
      if (this.aP != null) {
         this.aP.aY();
      }
   }

   private void bp() {
      this.bn.b();
      if (this.aP != null) {
         this.aP.aZ();
      }
   }

   private Path a(ab $$0, List<Path> $$1) {
      String $$2;
      if (this.T()) {
         $$2 = this.V().bc().e();
      } else {
         fsm $$3 = this.S();
         $$2 = $$3 != null ? $$3.a : "unknown";
      }

      Path $$7;
      try {
         String $$5 = String.format(Locale.ROOT, "%s-%s-%s", ac.e(), $$2, aa.b().b());
         String $$6 = v.a(bli.a, $$5, ".zip");
         $$7 = bli.a.resolve($$6);
      } catch (IOException var21) {
         throw new UncheckedIOException(var21);
      }

      try (awh $$10 = new awh($$7)) {
         $$10.a(Paths.get("system.txt"), $$0.a());
         $$10.a(Paths.get("client").resolve(this.m.az().getName()), this.m.aA());
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
         List<bjs> $$1 = this.bm.a(this.bB);
         if (!$$1.isEmpty()) {
            bjs $$2 = $$1.remove(0);
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

   private void a(fat $$0, bjp $$1) {
      List<bjs> $$2 = $$1.a(this.bB);
      bjs $$3 = $$2.remove(0);
      RenderSystem.clear(256, a);
      RenderSystem.setShader(fxj::q);
      Matrix4f $$4 = new Matrix4f().setOrtho(0.0F, (float)this.Q.k(), (float)this.Q.l(), 0.0F, 1000.0F, 3000.0F);
      RenderSystem.setProjectionMatrix($$4, euh.b);
      Matrix4fStack $$5 = RenderSystem.getModelViewStack();
      $$5.pushMatrix();
      $$5.translation(0.0F, 0.0F, -2000.0F);
      RenderSystem.applyModelViewMatrix();
      RenderSystem.lineWidth(1.0F);
      eub $$6 = eub.b();
      etu $$7 = $$6.d();
      int $$8 = 160;
      int $$9 = this.Q.k() - 160 - 10;
      int $$10 = this.Q.l() - 320;
      RenderSystem.enableBlend();
      $$7.a(eue.b.h, etx.n);
      $$7.a((double)((float)$$9 - 176.0F), (double)((float)$$10 - 96.0F - 16.0F), 0.0).a(200, 0, 0, 0).e();
      $$7.a((double)((float)$$9 - 176.0F), (double)($$10 + 320), 0.0).a(200, 0, 0, 0).e();
      $$7.a((double)((float)$$9 + 176.0F), (double)($$10 + 320), 0.0).a(200, 0, 0, 0).e();
      $$7.a((double)((float)$$9 + 176.0F), (double)((float)$$10 - 96.0F - 16.0F), 0.0).a(200, 0, 0, 0).e();
      $$6.c();
      RenderSystem.disableBlend();
      double $$11 = 0.0;

      for (bjs $$12 : $$2) {
         int $$13 = aww.a($$12.a / 4.0) + 1;
         $$7.a(eue.b.g, etx.n);
         int $$14 = $$12.a();
         int $$15 = $$14 >> 16 & 0xFF;
         int $$16 = $$14 >> 8 & 0xFF;
         int $$17 = $$14 & 0xFF;
         $$7.a((double)$$9, (double)$$10, 0.0).a($$15, $$16, $$17, 255).e();

         for (int $$18 = $$13; $$18 >= 0; $$18--) {
            float $$19 = (float)(($$11 + $$12.a * (double)$$18 / (double)$$13) * (float) (Math.PI * 2) / 100.0);
            float $$20 = aww.a($$19) * 160.0F;
            float $$21 = aww.b($$19) * 160.0F * 0.5F;
            $$7.a((double)((float)$$9 + $$20), (double)((float)$$10 - $$21), 0.0).a($$15, $$16, $$17, 255).e();
         }

         $$6.c();
         $$7.a(eue.b.f, etx.n);

         for (int $$22 = $$13; $$22 >= 0; $$22--) {
            float $$23 = (float)(($$11 + $$12.a * (double)$$22 / (double)$$13) * (float) (Math.PI * 2) / 100.0);
            float $$24 = aww.a($$23) * 160.0F;
            float $$25 = aww.b($$23) * 160.0F * 0.5F;
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
      String $$27 = bjp.b($$3.d);
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
         bjs $$31 = $$2.get($$30);
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

   public void q() {
      this.bb = false;
   }

   public boolean r() {
      return this.bb;
   }

   public void b(boolean $$0) {
      if (this.y == null) {
         boolean $$1 = this.U() && !this.aP.r();
         if ($$1) {
            this.a(new fha(!$$0));
            this.aq.e();
         } else {
            this.a(new fha(true));
         }
      }
   }

   private void d(boolean $$0) {
      if (!$$0) {
         this.w = 0;
      }

      if (this.w <= 0 && !this.s.fs()) {
         if ($$0 && this.v != null && this.v.c() == epp.a.b) {
            epn $$1 = (epn)this.v;
            ib $$2 = $$1.a();
            if (!this.r.a_($$2).i()) {
               ih $$3 = $$1.b();
               if (this.q.b($$2, $$3)) {
                  this.g.a($$2, $$3);
                  this.s.a(bnb.a);
               }
            }
         } else {
            this.q.b();
         }
      }
   }

   private boolean bq() {
      if (this.w > 0) {
         return false;
      } else if (this.v == null) {
         F.error("Null returned as 'hitResult', this shouldn't happen!");
         if (this.q.e()) {
            this.w = 10;
         }

         return false;
      } else if (this.s.B()) {
         return false;
      } else {
         cqk $$0 = this.s.b(bnb.a);
         if (!$$0.a(this.r.I())) {
            return false;
         } else {
            boolean $$1 = false;
            switch (this.v.c()) {
               case c:
                  this.q.a(this.s, ((epo)this.v).a());
                  break;
               case b:
                  epn $$2 = (epn)this.v;
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

                  this.s.gt();
            }

            this.s.a(bnb.a);
            return $$1;
         }
      }
   }

   private void br() {
      if (!this.q.k()) {
         this.aS = 4;
         if (!this.s.B()) {
            if (this.v == null) {
               F.warn("Null returned as 'hitResult', this shouldn't happen!");
            }

            for (bnb $$0 : bnb.values()) {
               cqk $$1 = this.s.b($$0);
               if (!$$1.a(this.r.I())) {
                  return;
               }

               if (this.v != null) {
                  switch (this.v.c()) {
                     case c:
                        epo $$2 = (epo)this.v;
                        bow $$3 = $$2.a();
                        if (!this.r.C_().a($$3.dm())) {
                           return;
                        }

                        bnc $$4 = this.q.a(this.s, $$3, $$2, $$0);
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
                        epn $$5 = (epn)this.v;
                        int $$6 = $$1.M();
                        bnc $$7 = this.q.a(this.s, $$0, $$5);
                        if ($$7.a()) {
                           if ($$7.b()) {
                              this.s.a($$0);
                              if (!$$1.b() && ($$1.M() != $$6 || this.q.f())) {
                                 this.j.b.a($$0);
                              }
                           }

                           return;
                        }

                        if ($$7 == bnc.e) {
                           return;
                        }
                  }
               }

               if (!$$1.b()) {
                  bnc $$8 = this.q.a(this.s, $$0);
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

   public gnl s() {
      return this.ar;
   }

   public void t() {
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
         if (this.y instanceof fgn $$1 && !this.s.fI()) {
            $$1.o();
         }
      } else if (this.s.ey() && !(this.y instanceof fgd)) {
         this.a(null);
      } else if (this.s.fI() && this.r != null) {
         this.a(new fgn());
      }

      if (this.y != null) {
         this.w = 10000;
      }

      if (this.y != null) {
         fhf.a(() -> this.y.e(), "Ticking screen", this.y.getClass().getCanonicalName());
      }

      if (!this.aP().d()) {
         this.l.l();
      }

      if (this.aY == null && this.y == null) {
         this.bj.b("Keybindings");
         this.bt();
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
            if (!this.m.s && this.bs()) {
               vu $$2 = vu.c("tutorial.socialInteractions.title");
               vu $$3 = vu.a("tutorial.socialInteractions.description", got.a("socialInteractions"));
               this.bi = new fdr(fdr.a.f, $$2, $$3, true);
               this.aH.a(this.bi, 160);
               this.m.s = true;
               this.m.at();
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

   private boolean bs() {
      return !this.aR || this.aP != null && this.aP.r();
   }

   private void bt() {
      while (this.m.P.g()) {
         eys $$0 = this.m.ay();
         this.m.a(this.m.ay().c());
         if ($$0.a() != this.m.ay().a()) {
            this.j.a(this.m.ay().a() ? this.ao() : null);
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
            if (this.s.N_()) {
               this.l.g().a($$1);
            } else if (!this.s.f() || this.y != null || !$$3 && !$$2) {
               this.s.fZ().l = $$1;
            } else {
               fit.a(this, $$1, $$3, $$2);
            }
         }
      }

      while (this.m.N.g()) {
         if (!this.bs()) {
            this.s.a(J, true);
            this.bt.c(J);
         } else {
            if (this.bi != null) {
               this.aH.a(this.bi);
               this.bi = null;
            }

            this.a(new flp());
         }
      }

      while (this.m.E.g()) {
         if (this.q.g()) {
            this.s.i();
         } else {
            this.aH.a();
            this.a(new fje(this.s));
         }
      }

      while (this.m.T.g()) {
         this.a(new fhv(this.s.cu.q()));
      }

      while (this.m.F.g()) {
         if (!this.s.N_()) {
            this.L().b(new agc(agc.a.g, ib.c, ih.a));
         }
      }

      while (this.m.G.g()) {
         if (!this.s.N_() && this.s.a(fhf.t())) {
            this.s.a(bnb.a);
         }
      }

      while (this.m.K.g()) {
         this.a("");
      }

      if (this.y == null && this.aY == null && this.m.M.g()) {
         this.a("/");
      }

      boolean $$4 = false;
      if (this.s.fs()) {
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
            $$4 |= this.bq();
         }

         while (this.m.H.g()) {
            this.br();
         }

         while (this.m.J.g()) {
            this.bC();
         }
      }

      if (this.m.H.e() && this.aS == 0 && !this.s.fs()) {
         this.br();
      }

      this.d(this.y == null && !$$4 && this.m.I.e() && this.n.h());
   }

   public gnu u() {
      return this.aL;
   }

   public double v() {
      return this.bq;
   }

   public fsk w() {
      return this.aM;
   }

   public fmf x() {
      return new fmf(this, this.ad);
   }

   public void a(ekk.c $$0, arz $$1, akd $$2, boolean $$3) {
      this.y();
      this.X.set(null);
      Instant $$4 = Instant.now();

      try {
         $$0.a($$2.c().a(), $$2.d());
         aka $$5 = aka.a(this.aw, this.p);
         $$5.f().a(this);
         dlr.a($$5, this);
         asx.a(false);
         this.aP = MinecraftServer.a((Function<Thread, gnd>)($$4x -> new gnd($$4x, this, $$0, $$1, $$2, $$5, $$0xx -> {
               aps $$1xx = aps.b($$0xx + 0);
               this.X.set($$1xx);
               return apr.a($$1xx, this.bg::add);
            })));
         this.aR = true;
         this.a(ftd.a());
         this.aO.a(fxa.c.a, $$0.d(), $$2.d().e());
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

      fgp $$9 = new fgp(this.X.get());
      this.a($$9);
      this.bj.a("waitForServer");

      for (; !this.aP.aj() || this.aY != null; this.bk()) {
         $$9.e();
         this.c(false);

         try {
            Thread.sleep(16L);
         } catch (InterruptedException var10) {
         }
      }

      this.bj.c();
      Duration $$10 = Duration.between($$4, Instant.now());
      SocketAddress $$11 = this.aP.ai().a();
      us $$12 = us.a($$11);
      $$12.a($$11.toString(), 0, new frx($$12, this, null, null, $$3, $$10, $$0x -> {
      }, null));
      $$12.a(new aho(this.X().c(), this.X().b()));
      this.aQ = $$12;
   }

   public void a(fry $$0) {
      fhc $$1 = new fhc(true);
      $$1.a(vu.c("connect.joining"));
      this.e($$1);
      this.r = $$0;
      this.b($$0);
      if (!this.aR) {
         aka $$2 = aka.a(this.aw, this.p);
         $$2.f().a(this);
         dlr.a($$2, this);
         asx.a(false);
      }
   }

   public void y() {
      this.a(new fhc(true), false);
   }

   public void b(fhf $$0) {
      this.a($$0, false);
   }

   public void a(fhf $$0, boolean $$1) {
      frz $$2 = this.L();
      if ($$2 != null) {
         this.by();
         $$2.i();
         if (!$$1) {
            this.B();
         }
      }

      this.aI.b();
      if (this.bn.e()) {
         this.bp();
      }

      gnd $$3 = this.aP;
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
                  this.c(false);
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

      dlr.b();
   }

   public void B() {
      this.ak.i();
      this.bz();
   }

   public void c(fhf $$0) {
      frz $$1 = this.L();
      if ($$1 != null) {
         $$1.j();
      }

      if (this.bn.e()) {
         this.bp();
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

      dlr.b();
   }

   private void e(fhf $$0) {
      this.bj.a("forcedTick");
      this.aq.f();
      this.t = null;
      this.aQ = null;
      this.a($$0);
      this.c(false);
      this.bj.c();
   }

   public void d(fhf $$0) {
      this.bj.a("forcedTick");
      this.a($$0);
      this.c(false);
      this.bj.c();
   }

   private void b(@Nullable fry $$0) {
      this.f.a($$0);
      this.g.a($$0);
      this.aK.a($$0);
      this.d();
   }

   private UserProperties bB() {
      return this.az.join();
   }

   public boolean C() {
      return this.D() && this.m.ag().c();
   }

   public boolean D() {
      return this.E() && this.bB().flag(UserFlag.OPTIONAL_TELEMETRY_AVAILABLE);
   }

   public boolean E() {
      return aa.aW ? false : this.bB().flag(UserFlag.TELEMETRY_ENABLED);
   }

   public boolean F() {
      return this.ag && this.bB().flag(UserFlag.SERVERS_ALLOWED) && this.H() == null && !this.I();
   }

   public boolean G() {
      return this.bB().flag(UserFlag.REALMS_ALLOWED) && this.H() == null;
   }

   @Nullable
   public BanDetails H() {
      return (BanDetails)this.bB().bannedScopes().get("MULTIPLAYER");
   }

   public boolean I() {
      ProfileResult $$0 = this.M.getNow(null);
      return $$0 != null && $$0.actions().contains(ProfileActionType.FORCED_NAME_CHANGE);
   }

   public boolean a(UUID $$0) {
      return this.J().a(false) ? this.aI.c($$0) : (this.s == null || !$$0.equals(this.s.cw())) && !$$0.equals(ac.d);
   }

   public ezg.a J() {
      if (this.m.m().c() == ciq.c) {
         return ezg.a.b;
      } else if (!this.ah) {
         return ezg.a.c;
      } else {
         return !this.bB().flag(UserFlag.CHAT_ALLOWED) ? ezg.a.d : ezg.a.a;
      }
   }

   public final boolean K() {
      return this.af;
   }

   @Nullable
   public frz L() {
      return this.s == null ? null : this.s.cu;
   }

   public static boolean M() {
      return !E.m.Z;
   }

   public static boolean N() {
      return E.m.j().c().a() >= eyz.b.a();
   }

   public static boolean O() {
      return !E.j.a() && E.m.j().c().a() >= eyz.c.a();
   }

   public static boolean P() {
      return E.m.k().c();
   }

   private void bC() {
      if (this.v != null && this.v.c() != epp.a.a) {
         boolean $$0 = this.s.ga().d;
         dkg $$1 = null;
         epp.a $$2 = this.v.c();
         cqk $$6;
         if ($$2 == epp.a.b) {
            ib $$3 = ((epn)this.v).a();
            dmz $$4 = this.r.a_($$3);
            if ($$4.i()) {
               return;
            }

            daa $$5 = $$4.b();
            $$6 = $$5.a((cxc)this.r, $$3, $$4);
            if ($$6.b()) {
               return;
            }

            if ($$0 && fhf.t() && $$4.t()) {
               $$1 = this.r.c_($$3);
            }
         } else {
            if ($$2 != epp.a.c || !$$0) {
               return;
            }

            bow $$7 = ((epo)this.v).a();
            $$6 = $$7.dz();
            if ($$6 == null) {
               return;
            }
         }

         if ($$6.b()) {
            String $$10 = "";
            if ($$2 == epp.a.b) {
               $$10 = ki.e.b(this.r.a_(((epn)this.v).a()).b()).toString();
            } else if ($$2 == epp.a.c) {
               $$10 = ki.g.b(((epo)this.v).a().ai()).toString();
            }

            F.warn("Picking on: [{}] {} gave null item", $$2, $$10);
         } else {
            cir $$11 = this.s.fZ();
            if ($$1 != null) {
               this.a($$6, $$1, this.r.H_());
            }

            int $$12 = $$11.b($$6);
            if ($$0) {
               $$11.a($$6);
               this.q.a(this.s.b(bnb.a), 36 + $$11.l);
            } else if ($$12 != -1) {
               if (cir.d($$12)) {
                  $$11.l = $$12;
               } else {
                  this.q.a($$12);
               }
            }
         }
      }
   }

   private void a(cqk $$0, dkg $$1, iz $$2) {
      ta $$3 = $$1.b($$2);
      cof.a($$0, $$1.r(), $$3);
      if ($$0.d() instanceof cqy && $$3.e("SkullOwner")) {
         ta $$4 = $$3.p("SkullOwner");
         ta $$5 = $$0.x();
         $$5.a("SkullOwner", $$4);
         ta $$6 = $$5.p("BlockEntityTag");
         $$6.r("SkullOwner");
         $$6.r("x");
         $$6.r("y");
         $$6.r("z");
      } else {
         ta $$7 = new ta();
         tg $$8 = new tg();
         $$8.add(tv.a("\"(+NBT)\""));
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

   public static void a(@Nullable ezg $$0, @Nullable gkg $$1, String $$2, @Nullable ezk $$3, o $$4) {
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

   private static ab a(ab $$0, @Nullable ezg $$1, @Nullable gkg $$2, String $$3, @Nullable ezk $$4) {
      $$0.a("Launched Version", () -> $$3);
      String $$5 = bf();
      if ($$5 != null) {
         $$0.a("Launcher name", $$5);
      }

      $$0.a("Backend library", RenderSystem::getBackendDescription);
      $$0.a("Backend API", RenderSystem::getApiDescription);
      $$0.a("Window size", () -> $$1 != null ? $$1.Q.k() + "x" + $$1.Q.l() : "<not initialized>");
      $$0.a("GL Caps", RenderSystem::getCapsString);
      $$0.a("GL debug messages", () -> esr.b() ? String.join("\n", esr.a()) : "<disabled>");
      $$0.a("Using VBOs", () -> "Yes");
      $$0.a("Is Modded", () -> e().b());
      $$0.a("Universe", () -> $$1 != null ? Long.toHexString($$1.K) : "404");
      $$0.a("Type", "Client (map_client.txt)");
      if ($$4 != null) {
         if ($$1 != null) {
            String $$6 = $$1.aj().m();
            if ($$6 != null) {
               $$0.a("GPU Warnings", $$6);
            }
         }

         $$0.a("Graphics mode", $$4.j().c().toString());
         $$0.a("Render Distance", $$4.aB() + "/" + $$4.e().c() + " chunks");
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
      $$0.a("CPU", ess::b);
      return $$0;
   }

   public static ezg Q() {
      return E;
   }

   public CompletableFuture<Void> R() {
      return this.a(this::l).thenCompose($$0 -> (CompletionStage<Void>)$$0);
   }

   public void a(ftd $$0) {
      if (!this.bv.a($$0)) {
         this.bv = ftg.a($$0, this.ay);
      }
   }

   @Nullable
   public fsm S() {
      return x.a(this.L(), frz::x);
   }

   public boolean T() {
      return this.aR;
   }

   public boolean U() {
      return this.aR && this.aP != null;
   }

   @Nullable
   public gnd V() {
      return this.aP;
   }

   public boolean W() {
      gnd $$0 = this.V();
      return $$0 != null && !$$0.r();
   }

   public boolean b(UUID $$0) {
      return $$0.equals(this.X().b());
   }

   public ezv X() {
      return this.W;
   }

   public GameProfile Y() {
      ProfileResult $$0 = this.M.join();
      return $$0 != null ? $$0.profile() : new GameProfile(this.W.b(), this.W.c());
   }

   public Proxy Z() {
      return this.ac;
   }

   public gja aa() {
      return this.N;
   }

   public aso ab() {
      return this.ai;
   }

   public arz ac() {
      return this.al;
   }

   public are ad() {
      return this.aj;
   }

   public glo ae() {
      return this.ak;
   }

   public Path af() {
      return this.L;
   }

   public gkg ag() {
      return this.am;
   }

   public Function<ajh, giz> a(ajh $$0) {
      return this.aB.a($$0)::a;
   }

   public boolean ah() {
      return this.ae;
   }

   public boolean ai() {
      return this.aT;
   }

   public fxk aj() {
      return this.au;
   }

   public gnq ak() {
      return this.aq;
   }

   public atv al() {
      atv $$0 = x.a(this.y, fhf::D);
      if ($$0 != null) {
         return $$0;
      } else if (this.s != null) {
         if (this.s.dM().ad() == cwz.j) {
            return this.l.j().b() ? atw.d : atw.e;
         } else {
            il<cxy> $$1 = this.s.dM().t(this.s.dm());
            if (!this.ar.c(atw.f) && (!this.s.bh() || !$$1.a(aum.Z))) {
               return this.s.dM().ad() != cwz.i && this.s.ga().d && this.s.ga().c ? atw.b : $$1.a().o().orElse(atw.g);
            } else {
               return atw.f;
            }
         }
      } else {
         return atw.a;
      }
   }

   public MinecraftSessionService am() {
      return this.ax;
   }

   public gjz an() {
      return this.aA;
   }

   @Nullable
   public bow ao() {
      return this.t;
   }

   public void a(bow $$0) {
      this.t = $$0;
      this.j.a($$0);
   }

   public boolean b(bow $$0) {
      return $$0.cd() || this.s != null && this.s.N_() && this.m.S.e() && $$0.ai() == bpc.bx;
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

   public fyk ap() {
      return this.aC;
   }

   public gcw aq() {
      return this.T;
   }

   public fzp ar() {
      return this.aK;
   }

   public gdw as() {
      return this.U;
   }

   public <T> gmz<T> a(gmy.a<T> $$0) {
      return this.V.a($$0);
   }

   public <T> void a(gmy.a<T> $$0, List<T> $$1) {
      this.V.a($$0, $$1);
   }

   public DataFixer at() {
      return this.O;
   }

   public float au() {
      return this.R.a;
   }

   public float av() {
      return this.R.b;
   }

   public fak aw() {
      return this.an;
   }

   public boolean ax() {
      return this.s != null && this.s.gp() || this.m.T().c();
   }

   public fdq aA() {
      return this.aG;
   }

   public got aB() {
      return this.aH;
   }

   public boolean aC() {
      return this.bf;
   }

   public ezc aD() {
      return this.Y;
   }

   public glf aE() {
      return this.aB;
   }

   public gjx aF() {
      return this.aD;
   }

   public gjw aG() {
      return this.aE;
   }

   public fau aH() {
      return this.aF;
   }

   @Override
   public void a(boolean $$0) {
      this.bf = $$0;
   }

   public vu a(File $$0, int $$1, int $$2) {
      int $$3 = this.Q.k();
      int $$4 = this.Q.l();
      esl $$5 = new esm($$1, $$2, true, a);
      float $$6 = this.s.dE();
      float $$7 = this.s.dC();
      float $$8 = this.s.O;
      float $$9 = this.s.N;
      this.j.b(false);

      wi var12;
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
            this.j.a(1.0F, 0L);

            try {
               Thread.sleep(10L);
            } catch (InterruptedException var17) {
            }

            ezr.a($$0, "panorama_" + $$10 + ".png", $$5, $$0x -> {
            });
         }

         vu $$11 = vu.b($$0.getName()).a(n.t).a($$1x -> $$1x.a(new vs(vs.a.b, $$0.getAbsolutePath())));
         return vu.a("screenshot.success", $$11);
      } catch (Exception var18) {
         F.error("Couldn't save image", var18);
         var12 = vu.a("screenshot.failure", var18.getMessage());
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
         this.h().a(true);
      }

      return var12;
   }

   private vu a(File $$0, int $$1, int $$2, int $$3, int $$4) {
      try {
         ByteBuffer $$5 = ess.a($$1 * $$2 * 3);
         ezr $$6 = new ezr($$0, $$3, $$4, $$2);
         float $$7 = (float)$$3 / (float)$$1;
         float $$8 = (float)$$4 / (float)$$2;
         float $$9 = $$7 > $$8 ? $$7 : $$8;

         for (int $$10 = ($$4 - 1) / $$2 * $$2; $$10 >= 0; $$10 -= $$2) {
            for (int $$11 = 0; $$11 < $$3; $$11 += $$1) {
               RenderSystem.setShaderTexture(0, giy.e);
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
         ess.a($$5);
         vu $$15 = vu.b($$14.getName()).a(n.t).a($$1x -> $$1x.a(new vs(vs.a.b, $$14.getAbsolutePath())));
         return vu.a("screenshot.success", $$15);
      } catch (Exception var15) {
         F.warn("Couldn't save screenshot", var15);
         return vu.a("screenshot.failure", var15.getMessage());
      }
   }

   public bjq aI() {
      return this.bj;
   }

   @Nullable
   public aps aJ() {
      return this.X.get();
   }

   public gka aK() {
      return this.at;
   }

   @Nullable
   public fgz aL() {
      return this.aY;
   }

   public fln aM() {
      return this.aI;
   }

   public boolean aN() {
      return false;
   }

   public etd aO() {
      return this.Q;
   }

   public fbo aP() {
      return this.l.k();
   }

   public fxw aQ() {
      return this.S;
   }

   public void b(int $$0) {
      this.aB.a($$0);
   }

   public fqz aR() {
      return this.aJ;
   }

   public boolean aS() {
      return this.bB().flag(UserFlag.PROFANITY_FILTER_ENABLED);
   }

   public void aT() {
      this.aI.a();
      this.w().a();
   }

   public ezo aU() {
      return this.bs;
   }

   @Nullable
   public axi aV() {
      return axi.a(this.aw.getServicesKeySet(), ServicesKeyType.PROFILE_KEY);
   }

   public boolean aW() {
      return !this.aw.getServicesKeySet().keys(ServicesKeyType.PROFILE_KEY).isEmpty();
   }

   public ezd aX() {
      return this.Z;
   }

   public void a(ezd $$0) {
      this.Z = $$0;
   }

   public eyy aY() {
      return this.bt;
   }

   public fsr aZ() {
      return this.bu;
   }

   public ftg ba() {
      return this.bv;
   }

   public ewf bb() {
      return this.aN;
   }

   public fxa bc() {
      return this.aO;
   }

   public eyv bd() {
      return this.bw;
   }

   public eph be() {
      return this.bx;
   }

   private float a(float $$0) {
      if (this.r != null) {
         bnn $$1 = this.r.s();
         if ($$1.i()) {
            return Math.max($$0, $$1.g());
         }
      }

      return $$0;
   }

   @Nullable
   public static String bf() {
      return System.getProperty("minecraft.launcher.brand");
   }

   public static enum a {
      a(vt.a) {
         @Override
         public boolean a(boolean $$0) {
            return true;
         }
      },
      b(vu.c("chat.disabled.options").a(n.m)) {
         @Override
         public boolean a(boolean $$0) {
            return false;
         }
      },
      c(vu.c("chat.disabled.launcher").a(n.m)) {
         @Override
         public boolean a(boolean $$0) {
            return $$0;
         }
      },
      d(vu.a("chat.disabled.profile", vu.d(ezg.E.m.K.h())).a(n.m)) {
         @Override
         public boolean a(boolean $$0) {
            return $$0;
         }
      };

      static final vu e = vu.c("chat.disabled.profile.moreInfo");
      private final vu f;

      a(vu $$0) {
         this.f = $$0;
      }

      public vu a() {
         return this.f;
      }

      public abstract boolean a(boolean var1);
   }

   static record b(eup a, fmt.c b) {
   }
}
