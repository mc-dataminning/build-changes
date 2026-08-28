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

public class ffg extends bpp<Runnable> implements eze {
   static ffg E;
   private static final Logger F = LogUtils.getLogger();
   public static final boolean a = ac.k() == ac.a.d;
   private static final int G = 10;
   public static final alf b = new alf("default");
   public static final alf c = new alf("uniform");
   public static final alf d = new alf("alt");
   private static final alf H = new alf("regional_compliancies.json");
   private static final CompletableFuture<bac> I = CompletableFuture.completedFuture(bac.a);
   private static final xp J = xp.c("multiplayer.socialInteractions.not_available");
   public static final String e = "Please make sure you have up-to-date drivers (see aka.ms/mcdriver for instructions).";
   private final long K = Double.doubleToLongBits(Math.PI);
   private final Path L;
   private final CompletableFuture<ProfileResult> M;
   private final gpb N;
   private final DataFixer O;
   private final geh P;
   private final ezd Q;
   private final ffs R = new ffs(20.0F, 0L, this::a);
   private final gdv S;
   public final gdn f;
   private final giw T;
   private final gjw U;
   public final gbf g;
   private final gta V = new gta();
   private final ffu W;
   public final fgq h;
   public final fgq i;
   public final gdi j;
   public final ghb k;
   private final AtomicReference<ars> X = new AtomicReference<>();
   public final fgr l;
   public final ffk m;
   private final ffc Y;
   public final ffh n;
   public final fff o;
   private ffd Z = ffd.a;
   public final File p;
   private final String aa;
   private final String ab;
   private final Proxy ac;
   private final epx ad;
   private final boolean ae;
   private final boolean af;
   private final boolean ag;
   private final aum ah;
   private final atf ai;
   private final grq aj;
   private final aua ak;
   private final gqi al;
   private final fgj am;
   private final fgn an;
   private final eyl ao;
   private final gtw ap;
   private final gtr aq;
   private final fju ar;
   private final gqc as;
   private final gdj at;
   private final ffm au = new ffm(H, ffg::b);
   private final YggdrasilAuthenticationService av;
   private final MinecraftSessionService aw;
   private final UserApiService ax;
   private final CompletableFuture<UserProperties> ay;
   private final gqb az;
   private final grh aA;
   private final gej aB;
   private final gpz aC;
   private final gpy aD;
   private final gpx aE;
   private final fgt aF;
   private final fjp aG;
   private final guz aH;
   private final frl aI;
   private final fwx aJ;
   private final gfo aK;
   private final gua aL;
   private final fyi aM;
   private final fcf aN;
   private final gcz aO;
   @Nullable
   public fyf q;
   @Nullable
   public fxw r;
   @Nullable
   public gcr s;
   @Nullable
   private gtf aP;
   @Nullable
   private wk aQ;
   private boolean aR;
   @Nullable
   public bsv t;
   @Nullable
   public bsv u;
   @Nullable
   public evq v;
   private int aS;
   protected int w;
   private volatile boolean aT;
   private float aU;
   private long aV = ac.d();
   private long aW;
   private int aX;
   public boolean x;
   @Nullable
   public fne y;
   @Nullable
   private fmy aY;
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
   private fjq bi;
   private bnj bj = bng.a;
   private int bk;
   private final bnd bl = new bnd(ac.c, () -> this.bk);
   @Nullable
   private bni bm;
   private box bn = bow.a;
   private final ffp bo = new ffp();
   private long bp;
   private double bq;
   @Nullable
   private ezs.a br;
   private final fey bs;
   private final fyp bt;
   private fze bu;
   private final fev bv;
   private final evi bw;
   private boolean bx;
   private final long by;
   private long bz;
   private String bA = "root";

   public ffg(fsr $$0) {
      super("Client");
      E = this;
      this.by = System.currentTimeMillis();
      this.p = $$0.c.a;
      File $$1 = $$0.c.c;
      this.L = $$0.c.b.toPath();
      this.aa = $$0.d.b;
      this.ab = $$0.d.c;
      Path $$2 = this.p.toPath();
      this.bw = epx.a($$2.resolve("allowed_symlinks.txt"));
      gpr $$3 = new gpr($$0.c.a(), this.bw);
      this.aj = new grq(this, $$2.resolve("downloads"), $$0.a);
      auc $$4 = new atv(this.L, atd.a, aub.b, this.bw);
      this.ak = new aua($$3, this.aj.a(), $$4);
      this.ai = $$3.a();
      this.ac = $$0.a.d;
      this.av = new YggdrasilAuthenticationService(this.ac);
      this.aw = this.av.createMinecraftSessionService();
      this.W = $$0.a.a;
      this.M = CompletableFuture.supplyAsync(() -> this.aw.fetchProfile(this.W.b(), true), ac.i());
      this.ax = this.a(this.av, $$0);
      this.ay = CompletableFuture.supplyAsync(() -> {
         try {
            return this.ax.fetchProperties();
         } catch (AuthenticationException var2x) {
            F.error("Failed to fetch user properties", var2x);
            return UserApiService.OFFLINE_PROPERTIES;
         }
      }, ac.i());
      F.info("Setting user: {}", this.W.c());
      F.debug("(Session ID is {})", this.W.a());
      this.ae = $$0.d.a;
      this.af = !$$0.d.d;
      this.ag = !$$0.d.e;
      this.aP = null;
      yu.a(ffe::a);
      this.O = bah.a();
      this.aG = new fjp(this);
      this.ba = Thread.currentThread();
      this.m = new ffk(this, this.p);
      RenderSystem.setShaderGlintAlpha(this.m.an().c());
      this.bb = true;
      this.aH = new guz(this, this.m);
      this.Y = new ffc($$2, this.O);
      F.info("Backend library: {}", RenderSystem.getBackendDescription());
      eyq $$5;
      if (this.m.p > 0 && this.m.o > 0) {
         $$5 = new eyq(this.m.o, this.m.p, $$0.b.c, $$0.b.d, $$0.b.e);
      } else {
         $$5 = $$0.b;
      }

      ac.c = RenderSystem.initBackendSystem();
      this.P = new geh(this);
      this.Q = this.P.a($$5, this.m.k, this.bf());
      this.a(true);
      gul.a.b(guh.A);

      try {
         this.Q.a(this.ai, aa.b().g() ? eyt.a : eyt.b);
      } catch (IOException var13) {
         F.error("Couldn't set icon", var13);
      }

      this.Q.a(this.m.h().c());
      this.n = new ffh(this);
      this.n.a(this.Q.i());
      this.o = new fff(this);
      this.o.a(this.Q.i());
      RenderSystem.initRenderer(this.m.u, false);
      this.ao = new eyi(this.Q.k(), this.Q.l());
      this.ao.a(0.0F, 0.0F, 0.0F, 0.0F);
      this.ao.b(a);
      this.ah = new aum(atd.a);
      this.ak.a();
      this.m.b(this.ak);
      this.al = new gqi(this.m.ac);
      this.ah.a(this.al);
      this.N = new gpb(this.ah);
      this.ah.a(this.N);
      this.az = new gqb(this.N, $$1.toPath().resolve("skins"), this.aw, this);
      this.ad = new epx($$2.resolve("saves"), $$2.resolve("backups"), this.bw, this.O);
      this.bv = new fev($$2);
      this.ap = new gtw(this.m);
      this.ah.a(this.ap);
      this.as = new gqc(this.W);
      this.ah.a(this.as);
      this.aq = new gtr(this);
      this.ar = new fju(this.N);
      this.h = this.ar.a();
      this.i = this.ar.b();
      this.ah.a(this.ar);
      this.g();
      this.ah.a(new gpu());
      this.ah.a(new gpt());
      this.Q.a("Startup");
      RenderSystem.setupDefaultState(0, 0, this.Q.k(), this.Q.l());
      this.Q.a("Post startup");
      this.am = fgj.a();
      this.an = fgn.a(this.am);
      this.aA = new grh(this.N, this.am, this.m.C().c());
      this.ah.a(this.aA);
      this.aJ = new fwx();
      this.ah.a(this.aJ);
      this.aK = new gfo(this.h, this.aJ, this::ao, this::ar, this::ap);
      this.ah.a(this.aK);
      gdc $$8 = new gdc(this.aK, this.aJ);
      this.ah.a($$8);
      this.U = new gjw(this, this.N, this.aA, this.an, $$8);
      this.ah.a(this.U);

      try {
         int $$9 = Runtime.getRuntime().availableProcessors();
         fab.a();
         this.S = new gdv($$9);
      } catch (OutOfMemoryError var12) {
         TinyFileDialogs.tinyfd_messageBox(
            "Minecraft",
            "Oh no! The game was unable to allocate memory off-heap while trying to start. You may try to free some memory by closing other applications on your computer, check that your system meets the minimum requirements, and try again. If the problem persists, please visit: https://aka.ms/Minecraft-Support",
            "ok",
            "error",
            true
         );
         throw new fss("Unable to allocate render buffers", var12);
      }

      this.aI = new frl(this, this.ax);
      this.aB = new gej(this.aA.b(), $$8, this.am);
      this.ah.a(this.aB);
      this.T = new giw(this, this.N, this.U, this.aB, this.h, this.m, this.aJ);
      this.ah.a(this.T);
      this.g = new gbf(this.r, this.N);
      this.ah.a(this.g);
      this.aC = new gpz(this.N);
      this.ah.a(this.aC);
      this.aD = new gpy(this.N);
      this.ah.a(this.aD);
      this.aE = new gpx(this.N);
      this.ah.a(this.aE);
      this.aF = new fgt(this.N);
      this.ah.a(this.aF);
      this.j = new gdi(this, this.T.d(), this.ah, this.S);
      this.ah.a(this.j.d());
      this.f = new gdn(this, this.T, this.aK, this.S);
      this.ah.a(this.f);
      this.bh();
      this.ah.a(this.V);
      this.at = new gdj();
      this.ah.a(this.at);
      this.ah.a(this.au);
      this.l = new fgr(this);
      this.k = new ghb(this);
      fap $$11 = fap.a(this);
      this.aN = new fcf($$11);
      RenderSystem.setErrorCallback(this::a);
      if (this.ao.c != this.Q.k() || this.ao.d != this.Q.l()) {
         StringBuilder $$12 = new StringBuilder(
            "Recovering from unsupported resolution ("
               + this.Q.k()
               + "x"
               + this.Q.l()
               + ").\nPlease make sure you have up-to-date drivers (see aka.ms/mcdriver for instructions)."
         );
         if (eyr.b()) {
            $$12.append("\n\nReported GL debug messages:\n").append(String.join("\n", eyr.a()));
         }

         this.Q.a(this.ao.c, this.ao.d);
         TinyFileDialogs.tinyfd_messageBox("Minecraft", $$12.toString(), "ok", "error", false);
      } else if (this.m.aa().c() && !this.Q.j()) {
         this.Q.h();
         this.m.aa().a(this.Q.j());
      }

      this.Q.a(this.m.N().c());
      this.Q.b(this.m.G().c());
      this.Q.c();
      this.a();
      this.j.a(this.ai.d());
      this.aL = new gua(this, this.ax, this.W);
      this.aM = fyi.a(this.ax, this.W, $$2);
      this.bs = new fey(this);
      this.bs.a(this.m.as().c() != ffi.a);
      this.bt = new fyp(this);
      this.bt.a(this.m.A().c());
      this.bu = fze.a(fzb.a(), this.ax);
      fmq.a(this);
      this.a(new fmk(xp.c("gui.loadingMinecraft")));
      List<atb> $$13 = this.ak.g();
      this.bo.a(ffp.b.a, $$13);
      aul $$14 = this.ah.a(ac.g(), this, I, $$13);
      gul.a.a(guh.C);
      ffg.b $$15 = new ffg.b($$11, $$0.e);
      this.a(new fmq(this, $$14, $$1x -> ac.a($$1x, $$1xx -> this.a($$1xx, $$15), () -> {
            if (aa.aX) {
               this.bj();
            }

            this.bo.a();
            this.a($$15);
         }), false));
      this.aO = gcz.a($$0.e.b());
   }

   private void a(@Nullable ffg.b $$0) {
      if (!this.bx) {
         this.bx = true;
         this.b($$0);
      }
   }

   private void b(@Nullable ffg.b $$0) {
      Runnable $$1 = this.c($$0);
      gul.a.b(guh.C);
      gul.a.b(guh.z);
      gul.a.a(this.aL.a());
      $$1.run();
   }

   public boolean c() {
      return this.bx;
   }

   private Runnable c(@Nullable ffg.b $$0) {
      List<Function<Runnable, fne>> $$1 = new ArrayList<>();
      this.a($$1);
      Runnable $$2 = () -> {
         if ($$0 != null && $$0.b().a()) {
            gcy.a(this, $$0.b(), $$0.a());
         } else {
            this.a(new fnj(true));
         }
      };

      for (Function<Runnable, fne> $$3 : Lists.reverse($$1)) {
         fne $$4 = $$3.apply($$2);
         $$2 = () -> this.a($$4);
      }

      return $$2;
   }

   private void a(List<Function<Runnable, fne>> $$0) {
      if (this.m.ad) {
         $$0.add($$0x -> new flo(this.m, $$0x));
      }

      BanDetails $$1 = this.H();
      if ($$1 != null) {
         $$0.add($$1x -> fls.a($$1xx -> {
               if ($$1xx) {
                  ac.k().a("https://aka.ms/mcjavamoderation");
               }

               $$1x.run();
            }, $$1));
      }

      ProfileResult $$2 = this.M.join();
      if ($$2 != null) {
         GameProfile $$3 = $$2.profile();
         Set<ProfileActionType> $$4 = $$2.actions();
         if ($$4.contains(ProfileActionType.FORCED_NAME_CHANGE)) {
            $$0.add($$1x -> fls.a($$3.getName(), $$1x));
         }

         if ($$4.contains(ProfileActionType.USING_BANNED_SKIN)) {
            $$0.add(fls::a);
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
      fxx $$1 = this.L();
      if ($$1 != null && $$1.k().i()) {
         $$0.append(" - ");
         fyk $$2 = this.S();
         if (this.aP != null && !this.aP.r()) {
            $$0.append(gqg.a("title.singleplayer"));
         } else if ($$2 != null && $$2.e()) {
            $$0.append(gqg.a("title.multiplayer.realms"));
         } else if (this.aP == null && ($$2 == null || !$$2.d())) {
            $$0.append(gqg.a("title.multiplayer.other"));
         } else {
            $$0.append(gqg.a("title.multiplayer.lan"));
         }
      }

      return $$0.toString();
   }

   private UserApiService a(YggdrasilAuthenticationService $$0, fsr $$1) {
      return $$1.a.a.g() != ffu.a.c ? UserApiService.OFFLINE : $$0.createUserApiService($$1.a.a.d());
   }

   public static ayy e() {
      return ayy.a("vanilla", ClientBrandRetriever::getClientModName, "Client", ffg.class);
   }

   private void a(Throwable $$0, @Nullable ffg.b $$1) {
      if (this.ak.d().size() > 1) {
         this.a($$0, null, $$1);
      } else {
         ac.a($$0);
      }
   }

   public void a(Throwable $$0, @Nullable xp $$1, @Nullable ffg.b $$2) {
      F.info("Caught error loading resourcepacks, removing all selected resourcepacks", $$0);
      this.bo.a($$0);
      this.aj.b();
      this.ak.b(Collections.emptyList());
      this.m.i.clear();
      this.m.j.clear();
      this.m.av();
      this.a(true, $$2).thenRun(() -> this.a($$1));
   }

   private void bg() {
      this.a(null);
      if (this.r != null) {
         this.r.Y();
         this.y();
      }

      this.a(new fnj());
      this.a(null);
   }

   private void a(@Nullable xp $$0) {
      fjp $$1 = this.ax();
      fjn.b($$1, fjn.a.c, xp.c("resourcePack.load_fail"), $$0);
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
               bnm $$1 = bnm.a("Renderer");
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

               this.bl();
               this.a(new fmx());
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
      this.ar.a(this.m);
   }

   private void bh() {
      this.V
         .a(
            gta.a,
            $$0 -> new gst<>(
                  $$0x -> $$0x.a(cul.b.a, null, cwj.a.a.c()).stream().map($$0xx -> n.a($$0xx.getString()).trim()).filter($$0xx -> !$$0xx.isEmpty()),
                  $$0x -> Stream.of(lp.h.b($$0x.g())),
                  $$0
               )
         );
      this.V.a(gta.b, $$0 -> new gsu<>($$0x -> $$0x.i().map(axf::b), $$0));
      this.V
         .a(
            gta.c,
            $$0 -> new gst<>(
                  $$0x -> {
                     cul.b $$1 = cul.b.a($$0x.a());
                     return $$0x.e()
                        .stream()
                        .flatMap($$2 -> $$2.b().a($$0x.a()).a($$1, null, cwj.a.a).stream())
                        .map($$0xx -> n.a($$0xx.getString()).trim())
                        .filter($$0xx -> !$$0xx.isEmpty());
                  },
                  $$0x -> $$0x.e().stream().map($$1 -> lp.h.b($$1.b().a($$0x.a()).g())),
                  $$0
               )
         );
      ctc.e().a($$0 -> {
         this.a(gta.a, $$0);
         this.a(gta.b, $$0);
      });
   }

   private void a(int $$0, long $$1) {
      this.m.N().a(false);
      this.m.av();
   }

   public eyl h() {
      return this.ao;
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

   public static void a(@Nullable ffg $$0, File $$1, o $$2) {
      File $$3 = new File($$1, "crash-reports");
      File $$4 = new File($$3, "crash-" + ac.f() + "-client.txt");
      alh.a($$2.e());
      if ($$0 != null) {
         $$0.ap.h();
      }

      if ($$2.f() != null) {
         alh.a("#@!@# Game crashed! Crash report saved to: #@!@# " + $$2.f());
         System.exit(-1);
      } else if ($$2.a($$4)) {
         alh.a("#@!@# Game crashed! Crash report saved to: #@!@# " + $$4.getAbsolutePath());
         System.exit(-1);
      } else {
         alh.a("#@?@# Game crashed! Crash report could not be saved. #@?@#");
         System.exit(-2);
      }
   }

   public boolean k() {
      return this.m.P().c();
   }

   public CompletableFuture<Void> l() {
      return this.a(false, null);
   }

   private CompletableFuture<Void> a(boolean $$0, @Nullable ffg.b $$1) {
      if (this.bh != null) {
         return this.bh;
      } else {
         CompletableFuture<Void> $$2 = new CompletableFuture<>();
         if (!$$0 && this.aY instanceof fmq) {
            this.bh = $$2;
            return $$2;
         } else {
            this.ak.a();
            List<atb> $$3 = this.ak.g();
            if (!$$0) {
               this.bo.a(ffp.b.b, $$3);
            }

            this.a(new fmq(this, this.ah.a(ac.g(), this, I, $$3), $$3x -> ac.a($$3x, $$2xx -> {
                  if ($$0) {
                     this.aj.c();
                     this.bg();
                  } else {
                     this.a($$2xx, $$1);
                  }
               }, () -> {
                  this.f.f();
                  this.bo.a();
                  this.aj.d();
                  $$2.complete(null);
                  this.a($$1);
               }), !$$0));
            return $$2;
         }
      }
   }

   private void bj() {
      boolean $$0 = false;
      gei $$1 = this.ao().a();
      grb $$2 = $$1.a().a();

      for (dfa $$3 : lp.e) {
         UnmodifiableIterator $$10 = $$3.l().a().iterator();

         while ($$10.hasNext()) {
            dsd $$4 = (dsd)$$10.next();
            if ($$4.l() == dlg.c) {
               grb $$5 = $$1.b($$4);
               if ($$5 == $$2) {
                  F.debug("Missing model for: {}", $$4);
                  $$0 = true;
               }
            }
         }
      }

      gpa $$6 = $$2.e();

      for (dfa $$7 : lp.e) {
         UnmodifiableIterator var17 = $$7.l().a().iterator();

         while (var17.hasNext()) {
            dsd $$8 = (dsd)var17.next();
            gpa $$9 = $$1.a($$8);
            if (!$$8.i() && $$9 == $$6) {
               F.debug("Missing particle icon for: {}", $$8);
            }
         }
      }

      for (cul $$10 : lp.h) {
         cuq $$11 = $$10.w();
         String $$12 = $$11.t();
         String $$13 = xp.c($$12).getString();
         if ($$13.toLowerCase(Locale.ROOT).equals($$10.a())) {
            F.debug("Missing translation for: {} {} {}", new Object[]{$$11, $$12, $$10});
         }
      }

      $$0 |= fmr.a();
      $$0 |= giz.a();
      if ($$0) {
         throw new IllegalStateException("Your game data is foobar, fix the errors above!");
      }
   }

   public epx m() {
      return this.ad;
   }

   private void a(String $$0) {
      ffg.a $$1 = this.J();
      if (!$$1.a(this.T())) {
         if (this.l.b()) {
            this.l.b(false);
            this.a(new flv($$0x -> {
               if ($$0x) {
                  ac.k().a("https://aka.ms/JavaAccountSettings");
               }

               this.a(null);
            }, ffg.a.e, "https://aka.ms/JavaAccountSettings", true));
         } else {
            xp $$2 = $$1.a();
            this.l.a($$2, false);
            this.bs.c($$2);
            this.l.b($$1 == ffg.a.d);
         }
      } else {
         this.a(new flu($$0));
      }
   }

   public void a(@Nullable fne $$0) {
      if (aa.aX && Thread.currentThread() != this.ba) {
         F.error("setScreen called from non-game thread");
      }

      if (this.y != null) {
         this.y.j();
      } else {
         this.a(ffd.a);
      }

      if ($$0 == null && this.aZ) {
         throw new IllegalStateException("Trying to return to in-game GUI during disconnection");
      } else {
         if ($$0 == null && this.r == null) {
            $$0 = new fnj();
         } else if ($$0 == null && this.s.eB()) {
            if (this.s.o()) {
               $$0 = new fmc(null, this.r.k().l());
            } else {
               this.s.ga();
            }
         }

         this.y = $$0;
         if (this.y != null) {
            this.y.aE_();
         }

         ezv.a();
         if ($$0 != null) {
            this.n.j();
            ffe.b();
            $$0.b(this, this.Q.o(), this.Q.p());
            this.x = false;
         } else {
            this.ap.i();
            this.n.i();
         }

         this.d();
      }
   }

   public void a(@Nullable fmy $$0) {
      this.aY = $$0;
   }

   public void n() {
      try {
         F.info("Stopping!");

         try {
            this.bs.c();
         } catch (Throwable var7) {
         }

         try {
            if (this.r != null) {
               this.r.Y();
            }

            this.y();
         } catch (Throwable var6) {
         }

         if (this.y != null) {
            this.y.j();
         }

         this.close();
      } finally {
         ac.c = System::nanoTime;
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
         this.au.close();
         this.aA.close();
         this.ar.close();
         this.j.close();
         this.f.close();
         this.ap.g();
         this.g.a();
         this.aD.close();
         this.aC.close();
         this.aE.close();
         this.aF.close();
         this.N.close();
         this.ah.close();
         fkg.b();
         ac.j();
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
      long $$1 = ac.d();
      if (this.Q.b()) {
         this.q();
      }

      if (this.bh != null && !(this.aY instanceof fmq)) {
         CompletableFuture<Void> $$2 = this.bh;
         this.bh = null;
         this.l().thenRun(() -> $$2.complete(null));
      }

      Runnable $$3;
      while (($$3 = this.bg.poll()) != null) {
         $$3.run();
      }

      if ($$0) {
         int $$4 = this.R.a(ac.c());
         this.bj.a("scheduledExecutables");
         this.bA();
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
      this.ap.a(this.j.l());
      this.bj.c();
      this.bj.a("render");
      long $$6 = ac.d();
      boolean $$8;
      if (!this.aP().d() && !this.bn.e()) {
         $$8 = false;
         this.bq = 0.0;
      } else {
         $$8 = this.br == null || this.br.b();
         if ($$8) {
            ezs.a().ifPresent(ezs::b);
         }
      }

      RenderSystem.clear(16640, a);
      this.ao.a(true);
      gdh.a();
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
         fgs $$9 = new fgs(this, this.S.c());
         this.a($$9, this.bm);
         $$9.e();
         this.bj.c();
      }

      this.bj.a("blit");
      this.ao.e();
      this.ao.a(this.Q.k(), this.Q.l());
      this.be = ac.d() - $$6;
      if ($$8) {
         ezs.a().ifPresent($$0x -> this.br = $$0x.c());
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
      boolean $$11 = this.U() && (this.y != null && this.y.k() || this.aY != null && this.aY.a()) && !this.aP.r();
      if (this.aT != $$11) {
         if ($$11) {
            this.aU = this.R.a;
         } else {
            this.R.a = this.aU;
         }

         this.aT = $$11;
      }

      long $$12 = ac.d();
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

      while (ac.c() >= this.aW + 1000L) {
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
            this.m.N().c() ? " vsync " : " ",
            this.m.j().c(),
            this.m.i().c() == feu.a ? "" : (this.m.i().c() == feu.b ? " fast-clouds" : " fancy-clouds"),
            this.m.E().c(),
            $$14
         );
         this.aW += 1000L;
         this.aX = 0;
      }

      this.bj.c();
   }

   private bnj a(boolean $$0, @Nullable bnm $$1) {
      if (!$$0) {
         this.bl.b();
         if (!this.bn.e() && $$1 == null) {
            return bng.a;
         }
      }

      bnj $$2;
      if ($$0) {
         if (!this.bl.a()) {
            this.bk = 0;
            this.bl.c();
         }

         this.bk++;
         $$2 = this.bl.d();
      } else {
         $$2 = bng.a;
      }

      if (this.bn.e()) {
         $$2 = bnj.a($$2, this.bn.f());
      }

      return bnm.a($$2, $$1);
   }

   private void b(boolean $$0, @Nullable bnm $$1) {
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
      int $$0 = this.Q.a(this.m.aq().c(), this.k());
      this.Q.a((double)$$0);
      if (this.y != null) {
         this.y.a(this, this.Q.o(), this.Q.p());
      }

      eyl $$1 = this.h();
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

   private int bk() {
      return this.r != null || this.y == null && this.aY == null ? this.Q.d() : 60;
   }

   private void bl() {
      try {
         ayx.b();
         this.f.p();
      } catch (Throwable var3) {
      }

      try {
         System.gc();
         if (this.aR && this.aP != null) {
            this.aP.a(true);
         }

         this.b((fne)(new fmk(xp.c("menu.savingLevel"))));
      } catch (Throwable var2) {
      }

      System.gc();
   }

   public boolean a(Consumer<xp> $$0) {
      if (this.bn.e()) {
         this.bm();
         return false;
      } else {
         Consumer<bni> $$1 = $$1x -> {
            if ($$1x != bne.a) {
               int $$2x = $$1x.f();
               double $$3x = (double)$$1x.g() / (double)azz.a;
               this.execute(
                  () -> $$0.accept(
                        xp.a("commands.debug.stopped", String.format(Locale.ROOT, "%.2f", $$3x), $$2x, String.format(Locale.ROOT, "%.2f", (double)$$2x / $$3x))
                     )
               );
            }
         };
         Consumer<Path> $$2 = $$1x -> {
            xp $$2x = xp.b($$1x.toString()).a(n.t).a($$1xx -> $$1xx.a(new xn(xn.a.b, $$1x.toFile().getParent())));
            this.execute(() -> $$0.accept(xp.a("debug.profiling.stop", $$2x)));
         };
         ab $$3 = a(new ab(), this, this.al, this.aa, this.m);
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
            CompletableFuture.allOf($$6, $$7).thenRunAsync(() -> $$4.accept(ImmutableList.of($$6.join(), $$7.join())), ac.h());
            this.aP.a($$0x -> {
            }, $$7::complete);
            $$5 = $$6::complete;
         }

         this.bn = bov.a(new gcw(ac.c, this.f), ac.c, ac.h(), new bpb("client"), $$1x -> {
            this.bn = bow.a;
            $$1.accept($$1x);
         }, $$5);
         return true;
      }
   }

   private void bm() {
      this.bn.a();
      if (this.aP != null) {
         this.aP.aX();
      }
   }

   private void bn() {
      this.bn.b();
      if (this.aP != null) {
         this.aP.aY();
      }
   }

   private Path a(ab $$0, List<Path> $$1) {
      String $$2;
      if (this.T()) {
         $$2 = this.V().bb().e();
      } else {
         fyk $$3 = this.S();
         $$2 = $$3 != null ? $$3.a : "unknown";
      }

      Path $$7;
      try {
         String $$5 = String.format(Locale.ROOT, "%s-%s-%s", ac.f(), $$2, aa.b().b());
         String $$6 = v.a(bpb.a, $$5, ".zip");
         $$7 = bpb.a.resolve($$6);
      } catch (IOException var21) {
         throw new UncheckedIOException(var21);
      }

      try (ayk $$10 = new ayk($$7)) {
         $$10.a(Paths.get("system.txt"), $$0.a());
         $$10.a(Paths.get("client").resolve(this.m.aB().getName()), this.m.aC());
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
         List<bnl> $$1 = this.bm.a(this.bA);
         if (!$$1.isEmpty()) {
            bnl $$2 = $$1.remove(0);
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

   private void a(fgs $$0, bni $$1) {
      List<bnl> $$2 = $$1.a(this.bA);
      bnl $$3 = $$2.remove(0);
      RenderSystem.clear(256, a);
      RenderSystem.setShader(gdi::p);
      Matrix4f $$4 = new Matrix4f().setOrtho(0.0F, (float)this.Q.k(), (float)this.Q.l(), 0.0F, 1000.0F, 3000.0F);
      RenderSystem.setProjectionMatrix($$4, fah.b);
      Matrix4fStack $$5 = RenderSystem.getModelViewStack();
      $$5.pushMatrix();
      $$5.translation(0.0F, 0.0F, -2000.0F);
      RenderSystem.applyModelViewMatrix();
      RenderSystem.lineWidth(1.0F);
      fab $$6 = fab.b();
      ezu $$7 = $$6.d();
      int $$8 = 160;
      int $$9 = this.Q.k() - 160 - 10;
      int $$10 = this.Q.l() - 320;
      RenderSystem.enableBlend();
      $$7.a(fae.b.h, ezx.n);
      $$7.a((double)((float)$$9 - 176.0F), (double)((float)$$10 - 96.0F - 16.0F), 0.0).a(200, 0, 0, 0).e();
      $$7.a((double)((float)$$9 - 176.0F), (double)($$10 + 320), 0.0).a(200, 0, 0, 0).e();
      $$7.a((double)((float)$$9 + 176.0F), (double)($$10 + 320), 0.0).a(200, 0, 0, 0).e();
      $$7.a((double)((float)$$9 + 176.0F), (double)((float)$$10 - 96.0F - 16.0F), 0.0).a(200, 0, 0, 0).e();
      $$6.c();
      RenderSystem.disableBlend();
      double $$11 = 0.0;

      for (bnl $$12 : $$2) {
         int $$13 = ayz.a($$12.a / 4.0) + 1;
         $$7.a(fae.b.g, ezx.n);
         int $$14 = $$12.a();
         int $$15 = $$14 >> 16 & 0xFF;
         int $$16 = $$14 >> 8 & 0xFF;
         int $$17 = $$14 & 0xFF;
         $$7.a((double)$$9, (double)$$10, 0.0).a($$15, $$16, $$17, 255).e();

         for (int $$18 = $$13; $$18 >= 0; $$18--) {
            float $$19 = (float)(($$11 + $$12.a * (double)$$18 / (double)$$13) * (float) (Math.PI * 2) / 100.0);
            float $$20 = ayz.a($$19) * 160.0F;
            float $$21 = ayz.b($$19) * 160.0F * 0.5F;
            $$7.a((double)((float)$$9 + $$20), (double)((float)$$10 - $$21), 0.0).a($$15, $$16, $$17, 255).e();
         }

         $$6.c();
         $$7.a(fae.b.f, ezx.n);

         for (int $$22 = $$13; $$22 >= 0; $$22--) {
            float $$23 = (float)(($$11 + $$12.a * (double)$$22 / (double)$$13) * (float) (Math.PI * 2) / 100.0);
            float $$24 = ayz.a($$23) * 160.0F;
            float $$25 = ayz.b($$23) * 160.0F * 0.5F;
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
      String $$27 = bni.b($$3.d);
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
         bnl $$31 = $$2.get($$30);
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
            this.a(new fmz(!$$0));
            this.ap.e();
         } else {
            this.a(new fmz(true));
         }
      }
   }

   private void d(boolean $$0) {
      if (!$$0) {
         this.w = 0;
      }

      if (this.w <= 0 && !this.s.fv()) {
         if ($$0 && this.v != null && this.v.c() == evq.a.b) {
            evo $$1 = (evo)this.v;
            iz $$2 = $$1.a();
            if (!this.r.a_($$2).i()) {
               je $$3 = $$1.b();
               if (this.q.b($$2, $$3)) {
                  this.g.a($$2, $$3);
                  this.s.a(bqu.a);
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
      } else if (this.s.B()) {
         return false;
      } else {
         cuq $$0 = this.s.b(bqu.a);
         if (!$$0.a(this.r.J())) {
            return false;
         } else {
            boolean $$1 = false;
            switch (this.v.c()) {
               case c:
                  this.q.a(this.s, ((evp)this.v).a());
                  break;
               case b:
                  evo $$2 = (evo)this.v;
                  iz $$3 = $$2.a();
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

                  this.s.gw();
            }

            this.s.a(bqu.a);
            return $$1;
         }
      }
   }

   private void bp() {
      if (!this.q.k()) {
         this.aS = 4;
         if (!this.s.B()) {
            if (this.v == null) {
               F.warn("Null returned as 'hitResult', this shouldn't happen!");
            }

            for (bqu $$0 : bqu.values()) {
               cuq $$1 = this.s.b($$0);
               if (!$$1.a(this.r.J())) {
                  return;
               }

               if (this.v != null) {
                  switch (this.v.c()) {
                     case c:
                        evp $$2 = (evp)this.v;
                        bsv $$3 = $$2.a();
                        if (!this.r.C_().a($$3.dp())) {
                           return;
                        }

                        bqv $$4 = this.q.a(this.s, $$3, $$2, $$0);
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
                        evo $$5 = (evo)this.v;
                        int $$6 = $$1.I();
                        bqv $$7 = this.q.a(this.s, $$0, $$5);
                        if ($$7.a()) {
                           if ($$7.b()) {
                              this.s.a($$0);
                              if (!$$1.e() && ($$1.I() != $$6 || this.q.f())) {
                                 this.j.b.a($$0);
                              }
                           }

                           return;
                        }

                        if ($$7 == bqv.f) {
                           return;
                        }
                  }
               }

               if (!$$1.e()) {
                  bqv $$8 = this.q.a(this.s, $$0);
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

   public gtr s() {
      return this.aq;
   }

   public void t() {
      this.bz++;
      if (this.r != null && !this.aT) {
         this.r.s().m();
      }

      if (this.aS > 0) {
         this.aS--;
      }

      this.bj.a("gui");
      this.bt.a();
      this.l.a(this.aT);
      this.bj.c();
      this.j.b(1.0F);
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
         if (this.y instanceof fmm $$1 && !this.s.fL()) {
            $$1.m();
         }
      } else if (this.s.eB() && !(this.y instanceof fmc)) {
         this.a(null);
      } else if (this.s.fL() && this.r != null) {
         this.a(new fmm());
      }

      if (this.y != null) {
         this.w = 10000;
      }

      if (this.y != null) {
         fne.a(() -> this.y.e(), "Ticking screen", this.y.getClass().getCanonicalName());
      }

      if (!this.aP().d()) {
         this.l.l();
      }

      if (this.aY == null && this.y == null) {
         this.bj.b("Keybindings");
         this.br();
         if (this.w > 0) {
            this.w--;
         }
      }

      if (this.r != null) {
         this.bj.b("gameRenderer");
         if (!this.aT) {
            this.j.e();
         }

         this.bj.b("levelRenderer");
         if (!this.aT) {
            this.f.o();
         }

         this.bj.b("level");
         if (!this.aT) {
            this.r.f();
         }
      } else if (this.j.f() != null) {
         this.j.b();
      }

      if (!this.aT) {
         this.aq.a();
      }

      this.ap.a(this.aT);
      if (this.r != null) {
         if (!this.aT) {
            if (!this.m.s && this.bq()) {
               xp $$2 = xp.c("tutorial.socialInteractions.title");
               xp $$3 = xp.a("tutorial.socialInteractions.description", guz.a("socialInteractions"));
               this.bi = new fjq(fjq.a.f, $$2, $$3, true);
               this.aH.a(this.bi, 160);
               this.m.s = true;
               this.m.av();
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
            this.r.b(this.s.dt(), this.s.dv(), this.s.dz());
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

   private boolean bq() {
      return !this.aR || this.aP != null && this.aP.r();
   }

   private void br() {
      while (this.m.O.g()) {
         fes $$0 = this.m.aA();
         this.m.a(this.m.aA().c());
         if ($$0.a() != this.m.aA().a()) {
            this.j.a(this.m.aA().a() ? this.an() : null);
         }

         this.f.r();
      }

      while (this.m.P.g()) {
         this.m.aa = !this.m.aa;
      }

      for (int $$1 = 0; $$1 < 9; $$1++) {
         boolean $$2 = this.m.U.e();
         boolean $$3 = this.m.V.e();
         if (this.m.T[$$1].g()) {
            if (this.s.N_()) {
               this.l.g().a($$1);
            } else if (!this.s.f() || this.y != null || !$$3 && !$$2) {
               this.s.gc().k = $$1;
            } else {
               fos.a(this, $$1, $$3, $$2);
            }
         }
      }

      while (this.m.M.g()) {
         if (!this.bq()) {
            this.s.a(J, true);
            this.bs.c(J);
         } else {
            if (this.bi != null) {
               this.aH.a(this.bi);
               this.bi = null;
            }

            this.a(new frn());
         }
      }

      while (this.m.D.g()) {
         if (this.q.g()) {
            this.s.i();
         } else {
            this.aH.a();
            this.a(new fpd(this.s));
         }
      }

      while (this.m.S.g()) {
         this.a(new fnt(this.s.cz.p()));
      }

      while (this.m.E.g()) {
         if (!this.s.N_()) {
            this.L().b(new aia(aia.a.g, iz.c, je.a));
         }
      }

      while (this.m.F.g()) {
         if (!this.s.N_() && this.s.a(fne.s())) {
            this.s.a(bqu.a);
         }
      }

      while (this.m.J.g()) {
         this.a("");
      }

      if (this.y == null && this.aY == null && this.m.L.g()) {
         this.a("/");
      }

      boolean $$4 = false;
      if (this.s.fv()) {
         if (!this.m.G.e()) {
            this.q.b(this.s);
         }

         while (this.m.H.g()) {
         }

         while (this.m.G.g()) {
         }

         while (this.m.I.g()) {
         }
      } else {
         while (this.m.H.g()) {
            $$4 |= this.bo();
         }

         while (this.m.G.g()) {
            this.bp();
         }

         while (this.m.I.g()) {
            this.bt();
         }
      }

      if (this.m.G.e() && this.aS == 0 && !this.s.fv()) {
         this.bp();
      }

      this.d(this.y == null && !$$4 && this.m.H.e() && this.n.h());
   }

   public gua u() {
      return this.aL;
   }

   public double v() {
      return this.bq;
   }

   public fyi w() {
      return this.aM;
   }

   public fsd x() {
      return new fsd(this, this.ad);
   }

   public void a(epx.c $$0, aua $$1, amc $$2, boolean $$3) {
      this.y();
      this.X.set(null);
      Instant $$4 = Instant.now();

      try {
         $$0.a($$2.c().a(), $$2.d());
         alz $$5 = alz.a(this.av, this.p);
         $$5.f().a(this);
         dqu.a($$5, this);
         auz.a(false);
         this.aP = MinecraftServer.a((Function<Thread, gtf>)($$4x -> new gtf($$4x, this, $$0, $$1, $$2, $$5, $$0xx -> {
               ars $$1xx = ars.b($$0xx + 0);
               this.X.set($$1xx);
               return arr.a($$1xx, this.bg::add);
            })));
         this.aR = true;
         this.a(fzb.a());
         this.aO.a(gcz.c.a, $$0.f(), $$2.d().e());
      } catch (Throwable var11) {
         o $$7 = o.a(var11, "Starting integrated server");
         p $$8 = $$7.a("Starting integrated server");
         $$8.a("Level ID", $$0.f());
         $$8.a("Level Name", () -> $$2.d().e());
         throw new y($$7);
      }

      while (this.X.get() == null) {
         Thread.yield();
      }

      fmo $$9 = new fmo(this.X.get());
      this.a($$9);
      this.bj.a("waitForServer");

      for (; !this.aP.aj() || this.aY != null; this.bi()) {
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
      wk $$12 = wk.a($$11);
      $$12.a($$11.toString(), 0, new fxv($$12, this, null, null, $$3, $$10, $$0x -> {
      }, null));
      $$12.a(new ajm(this.X().c(), this.X().b()));
      this.aQ = $$12;
   }

   public void a(fxw $$0, fnc.a $$1) {
      this.e(new fnc(() -> false, $$1));
      this.r = $$0;
      this.a($$0);
      if (!this.aR) {
         alz $$2 = alz.a(this.av, this.p);
         $$2.f().a(this);
         dqu.a($$2, this);
         auz.a(false);
      }
   }

   public void y() {
      this.a(new fnb(true), false);
   }

   public void b(fne $$0) {
      this.a($$0, false);
   }

   public void a(fne $$0, boolean $$1) {
      fxx $$2 = this.L();
      if ($$2 != null) {
         this.bz();
         $$2.h();
         if (!$$1) {
            this.B();
         }
      }

      this.aI.b();
      if (this.bn.e()) {
         this.bn();
      }

      gtf $$3 = this.aP;
      this.aP = null;
      this.j.h();
      this.q = null;
      this.bs.b();
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
         this.a(null);
         this.s = null;
      } finally {
         this.aZ = false;
      }

      dqu.b();
   }

   public void B() {
      this.aj.i();
      this.bA();
   }

   public void c(fne $$0) {
      fxx $$1 = this.L();
      if ($$1 != null) {
         $$1.i();
      }

      if (this.bn.e()) {
         this.bn();
      }

      this.j.h();
      this.q = null;
      this.bs.b();
      this.aZ = true;

      try {
         this.e($$0);
         this.l.i();
         this.r = null;
         this.a(null);
         this.s = null;
      } finally {
         this.aZ = false;
      }

      dqu.b();
   }

   private void e(fne $$0) {
      this.bj.a("forcedTick");
      this.ap.f();
      this.t = null;
      this.aQ = null;
      this.a($$0);
      this.c(false);
      this.bj.c();
   }

   public void d(fne $$0) {
      this.bj.a("forcedTick");
      this.a($$0);
      this.c(false);
      this.bj.c();
   }

   private void a(@Nullable fxw $$0) {
      this.f.a($$0);
      this.g.a($$0);
      this.aK.a($$0);
      this.d();
   }

   private UserProperties bs() {
      return this.ay.join();
   }

   public boolean C() {
      return this.D() && this.m.ai().c();
   }

   public boolean D() {
      return this.E() && this.bs().flag(UserFlag.OPTIONAL_TELEMETRY_AVAILABLE);
   }

   public boolean E() {
      return aa.aX ? false : this.bs().flag(UserFlag.TELEMETRY_ENABLED);
   }

   public boolean F() {
      return this.af && this.bs().flag(UserFlag.SERVERS_ALLOWED) && this.H() == null && !this.I();
   }

   public boolean G() {
      return this.bs().flag(UserFlag.REALMS_ALLOWED) && this.H() == null;
   }

   @Nullable
   public BanDetails H() {
      return (BanDetails)this.bs().bannedScopes().get("MULTIPLAYER");
   }

   public boolean I() {
      ProfileResult $$0 = this.M.getNow(null);
      return $$0 != null && $$0.actions().contains(ProfileActionType.FORCED_NAME_CHANGE);
   }

   public boolean a(UUID $$0) {
      return this.J().a(false) ? this.aI.c($$0) : (this.s == null || !$$0.equals(this.s.cz())) && !$$0.equals(ac.e);
   }

   public ffg.a J() {
      if (this.m.m().c() == cmw.c) {
         return ffg.a.b;
      } else if (!this.ag) {
         return ffg.a.c;
      } else {
         return !this.bs().flag(UserFlag.CHAT_ALLOWED) ? ffg.a.d : ffg.a.a;
      }
   }

   public final boolean K() {
      return this.ae;
   }

   @Nullable
   public fxx L() {
      return this.s == null ? null : this.s.cz;
   }

   public static boolean M() {
      return !E.m.Y;
   }

   public static boolean N() {
      return E.m.j().c().a() >= fez.b.a();
   }

   public static boolean O() {
      return !E.j.a() && E.m.j().c().a() >= fez.c.a();
   }

   public static boolean P() {
      return E.m.k().c();
   }

   private void bt() {
      if (this.v != null && this.v.c() != evq.a.a) {
         boolean $$0 = this.s.gd().d;
         dpi $$1 = null;
         evq.a $$2 = this.v.c();
         cuq $$6;
         if ($$2 == evq.a.b) {
            iz $$3 = ((evo)this.v).a();
            dsd $$4 = this.r.a_($$3);
            if ($$4.i()) {
               return;
            }

            dfa $$5 = $$4.b();
            $$6 = $$5.a((dcc)this.r, $$3, $$4);
            if ($$6.e()) {
               return;
            }

            if ($$0 && fne.s() && $$4.t()) {
               $$1 = this.r.c_($$3);
            }
         } else {
            if ($$2 != evq.a.c || !$$0) {
               return;
            }

            bsv $$7 = ((evp)this.v).a();
            $$6 = $$7.dC();
            if ($$6 == null) {
               return;
            }
         }

         if ($$6.e()) {
            String $$10 = "";
            if ($$2 == evq.a.b) {
               $$10 = lp.e.b(this.r.a_(((evo)this.v).a()).b()).toString();
            } else if ($$2 == evq.a.c) {
               $$10 = lp.g.b(((evp)this.v).a().ak()).toString();
            }

            F.warn("Picking on: [{}] {} gave null item", $$2, $$10);
         } else {
            cmx $$11 = this.s.gc();
            if ($$1 != null) {
               this.a($$6, $$1, this.r.H_());
            }

            int $$12 = $$11.c($$6);
            if ($$0) {
               $$11.b($$6);
               this.q.a(this.s.b(bqu.a), 36 + $$11.k);
            } else if ($$12 != -1) {
               if (cmx.d($$12)) {
                  $$11.k = $$12;
               } else {
                  this.q.a($$12);
               }
            }
         }
      }
   }

   private void a(cuq $$0, dpi $$1, jw $$2) {
      us $$3 = $$1.f($$2);
      $$1.a($$3);
      cso.a($$0, $$1.r(), $$3);
      $$0.b($$1.s());
   }

   public o d(o $$0) {
      ab $$1 = $$0.g();
      a($$1, this, this.al, this.aa, this.m);
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

   public static void a(@Nullable ffg $$0, @Nullable gqi $$1, String $$2, @Nullable ffk $$3, o $$4) {
      ab $$5 = $$4.g();
      a($$5, $$0, $$1, $$2, $$3);
   }

   private static String a(double $$0) {
      return String.format(Locale.ROOT, "%.3fs", $$0);
   }

   private void a(p $$0) {
      $$0.a("JVM uptime", () -> a((double)ManagementFactory.getRuntimeMXBean().getUptime() / 1000.0));
      $$0.a("Wall uptime", () -> a((double)(System.currentTimeMillis() - this.by) / 1000.0));
      $$0.a("High-res time", () -> a((double)ac.c() / 1000.0));
      $$0.a("Client ticks", () -> String.format(Locale.ROOT, "%d ticks / %.3fs", this.bz, (double)this.bz / 20.0));
   }

   private static ab a(ab $$0, @Nullable ffg $$1, @Nullable gqi $$2, String $$3, @Nullable ffk $$4) {
      $$0.a("Launched Version", () -> $$3);
      String $$5 = be();
      if ($$5 != null) {
         $$0.a("Launcher name", $$5);
      }

      $$0.a("Backend library", RenderSystem::getBackendDescription);
      $$0.a("Backend API", RenderSystem::getApiDescription);
      $$0.a("Window size", () -> $$1 != null ? $$1.Q.k() + "x" + $$1.Q.l() : "<not initialized>");
      $$0.a("GL Caps", RenderSystem::getCapsString);
      $$0.a("GL debug messages", () -> eyr.b() ? String.join("\n", eyr.a()) : "<disabled>");
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
         $$0.a("Render Distance", $$4.aD() + "/" + $$4.e().c() + " chunks");
      }

      if ($$1 != null) {
         $$0.a("Resource Packs", () -> aua.a($$1.ac().f()));
      }

      if ($$2 != null) {
         $$0.a("Current Language", () -> $$2.a());
      }

      $$0.a("Locale", String.valueOf(Locale.getDefault()));
      $$0.a("CPU", eys::b);
      return $$0;
   }

   public static ffg Q() {
      return E;
   }

   public CompletableFuture<Void> R() {
      return this.a(this::l).thenCompose($$0 -> (CompletionStage<Void>)$$0);
   }

   public void a(fzb $$0) {
      if (!this.bu.a($$0)) {
         this.bu = fze.a($$0, this.ax);
      }
   }

   @Nullable
   public fyk S() {
      return x.a(this.L(), fxx::w);
   }

   public boolean T() {
      return this.aR;
   }

   public boolean U() {
      return this.aR && this.aP != null;
   }

   @Nullable
   public gtf V() {
      return this.aP;
   }

   public boolean W() {
      gtf $$0 = this.V();
      return $$0 != null && !$$0.r();
   }

   public boolean b(UUID $$0) {
      return $$0.equals(this.X().b());
   }

   public ffu X() {
      return this.W;
   }

   public GameProfile Y() {
      ProfileResult $$0 = this.M.join();
      return $$0 != null ? $$0.profile() : new GameProfile(this.W.b(), this.W.c());
   }

   public Proxy Z() {
      return this.ac;
   }

   public gpb aa() {
      return this.N;
   }

   public aup ab() {
      return this.ah;
   }

   public aua ac() {
      return this.ak;
   }

   public atf ad() {
      return this.ai;
   }

   public grq ae() {
      return this.aj;
   }

   public Path af() {
      return this.L;
   }

   public gqi ag() {
      return this.al;
   }

   public Function<alf, gpa> a(alf $$0) {
      return this.aA.a($$0)::a;
   }

   public boolean ah() {
      return this.aT;
   }

   public gdj ai() {
      return this.at;
   }

   public gtw aj() {
      return this.ap;
   }

   public avx ak() {
      avx $$0 = x.a(this.y, fne::D);
      if ($$0 != null) {
         return $$0;
      } else if (this.s != null) {
         if (this.s.dP().af() == dbz.j) {
            return this.l.j().b() ? avy.d : avy.e;
         } else {
            ji<dcy> $$1 = this.s.dP().t(this.s.dp());
            if (!this.aq.c(avy.f) && (!this.s.bj() || !$$1.a(awo.Z))) {
               return this.s.dP().af() != dbz.i && this.s.gd().d && this.s.gd().c ? avy.b : $$1.a().o().orElse(avy.g);
            } else {
               return avy.f;
            }
         }
      } else {
         return avy.a;
      }
   }

   public MinecraftSessionService al() {
      return this.aw;
   }

   public gqb am() {
      return this.az;
   }

   @Nullable
   public bsv an() {
      return this.t;
   }

   public void a(bsv $$0) {
      this.t = $$0;
      this.j.a($$0);
   }

   public boolean b(bsv $$0) {
      return $$0.cg() || this.s != null && this.s.N_() && this.m.R.e() && $$0.ak() == btb.by;
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

   public gej ao() {
      return this.aB;
   }

   public giw ap() {
      return this.T;
   }

   public gfo aq() {
      return this.aK;
   }

   public gjw ar() {
      return this.U;
   }

   public <T> gtb<T> a(gta.a<T> $$0) {
      return this.V.a($$0);
   }

   public <T> void a(gta.a<T> $$0, List<T> $$1) {
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

   public fgj av() {
      return this.am;
   }

   public boolean aw() {
      return this.s != null && this.s.gs() || this.m.V().c();
   }

   public fjp ax() {
      return this.aG;
   }

   public guz aA() {
      return this.aH;
   }

   public boolean aB() {
      return this.bf;
   }

   public ffc aC() {
      return this.Y;
   }

   public grh aD() {
      return this.aA;
   }

   public gpz aE() {
      return this.aC;
   }

   public gpy aF() {
      return this.aD;
   }

   public gpx aG() {
      return this.aE;
   }

   public fgt aH() {
      return this.aF;
   }

   @Override
   public void a(boolean $$0) {
      this.bf = $$0;
   }

   public xp a(File $$0, int $$1, int $$2) {
      int $$3 = this.Q.k();
      int $$4 = this.Q.l();
      eyl $$5 = new eym($$1, $$2, true, a);
      float $$6 = this.s.dH();
      float $$7 = this.s.dF();
      float $$8 = this.s.P;
      float $$9 = this.s.O;
      this.j.b(false);

      yd var12;
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

            this.s.O = this.s.dF();
            this.s.P = this.s.dH();
            $$5.a(true);
            this.j.a(1.0F, 0L);

            try {
               Thread.sleep(10L);
            } catch (InterruptedException var17) {
            }

            ffq.a($$0, "panorama_" + $$10 + ".png", $$5, $$0x -> {
            });
         }

         xp $$11 = xp.b($$0.getName()).a(n.t).a($$1x -> $$1x.a(new xn(xn.a.b, $$0.getAbsolutePath())));
         return xp.a("screenshot.success", $$11);
      } catch (Exception var18) {
         F.error("Couldn't save image", var18);
         var12 = xp.a("screenshot.failure", var18.getMessage());
      } finally {
         this.s.s($$6);
         this.s.r($$7);
         this.s.P = $$8;
         this.s.O = $$9;
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

   private xp a(File $$0, int $$1, int $$2, int $$3, int $$4) {
      try {
         ByteBuffer $$5 = eys.a($$1 * $$2 * 3);
         ffq $$6 = new ffq($$0, $$3, $$4, $$2);
         float $$7 = (float)$$3 / (float)$$1;
         float $$8 = (float)$$4 / (float)$$2;
         float $$9 = $$7 > $$8 ? $$7 : $$8;

         for (int $$10 = ($$4 - 1) / $$2 * $$2; $$10 >= 0; $$10 -= $$2) {
            for (int $$11 = 0; $$11 < $$3; $$11 += $$1) {
               RenderSystem.setShaderTexture(0, goz.e);
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
         eys.a($$5);
         xp $$15 = xp.b($$14.getName()).a(n.t).a($$1x -> $$1x.a(new xn(xn.a.b, $$14.getAbsolutePath())));
         return xp.a("screenshot.success", $$15);
      } catch (Exception var15) {
         F.warn("Couldn't save screenshot", var15);
         return xp.a("screenshot.failure", var15.getMessage());
      }
   }

   public bnj aI() {
      return this.bj;
   }

   @Nullable
   public ars aJ() {
      return this.X.get();
   }

   public gqc aK() {
      return this.as;
   }

   @Nullable
   public fmy aL() {
      return this.aY;
   }

   public frl aM() {
      return this.aI;
   }

   public boolean aN() {
      return false;
   }

   public ezd aO() {
      return this.Q;
   }

   public fhn aP() {
      return this.l.k();
   }

   public gdv aQ() {
      return this.S;
   }

   public void b(int $$0) {
      this.aA.a($$0);
   }

   public fwx aR() {
      return this.aJ;
   }

   public boolean aS() {
      return this.bs().flag(UserFlag.PROFANITY_FILTER_ENABLED);
   }

   public void aT() {
      this.aI.a();
      this.w().a();
   }

   @Nullable
   public azm aU() {
      return azm.a(this.av.getServicesKeySet(), ServicesKeyType.PROFILE_KEY);
   }

   public boolean aV() {
      return !this.av.getServicesKeySet().keys(ServicesKeyType.PROFILE_KEY).isEmpty();
   }

   public ffd aW() {
      return this.Z;
   }

   public void a(ffd $$0) {
      this.Z = $$0;
   }

   public fey aX() {
      return this.bs;
   }

   public fyp aY() {
      return this.bt;
   }

   public fze aZ() {
      return this.bu;
   }

   public fcf ba() {
      return this.aN;
   }

   public gcz bb() {
      return this.aO;
   }

   public fev bc() {
      return this.bv;
   }

   public evi bd() {
      return this.bw;
   }

   private float a(float $$0) {
      if (this.r != null) {
         brg $$1 = this.r.s();
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
      a(xo.a) {
         @Override
         public boolean a(boolean $$0) {
            return true;
         }
      },
      b(xp.c("chat.disabled.options").a(n.m)) {
         @Override
         public boolean a(boolean $$0) {
            return false;
         }
      },
      c(xp.c("chat.disabled.launcher").a(n.m)) {
         @Override
         public boolean a(boolean $$0) {
            return $$0;
         }
      },
      d(xp.a("chat.disabled.profile", xp.d(ffg.E.m.J.h())).a(n.m)) {
         @Override
         public boolean a(boolean $$0) {
            return $$0;
         }
      };

      static final xp e = xp.c("chat.disabled.profile.moreInfo");
      private final xp f;

      a(final xp $$0) {
         this.f = $$0;
      }

      public xp a() {
         return this.f;
      }

      public abstract boolean a(boolean var1);
   }

   static record b(fap a, fsr.c b) {
   }
}
