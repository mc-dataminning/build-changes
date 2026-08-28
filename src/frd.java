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
import com.mojang.blaze3d.platform.GLX;
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

public class frd extends btk<Runnable> implements fkl {
   static frd F;
   private static final Logger G = LogUtils.getLogger();
   public static final boolean a = ag.n() == ag.a.d;
   private static final int H = 10;
   public static final ali b = ali.b("default");
   public static final ali c = ali.b("uniform");
   public static final ali d = ali.b("alt");
   private static final ali I = ali.b("regional_compliancies.json");
   private static final CompletableFuture<baw> J = CompletableFuture.completedFuture(baw.a);
   private static final xa K = xa.c("multiplayer.socialInteractions.not_available");
   public static final String e = "Please make sure you have up-to-date drivers (see aka.ms/mcdriver for instructions).";
   private final long L = Double.doubleToLongBits(Math.PI);
   private final Path M;
   private final CompletableFuture<ProfileResult> N;
   private final hlc O;
   private final gss P;
   private final DataFixer Q;
   private final gsz R;
   private final fkk S;
   private final fqt.b T = new fqt.b(20.0F, 0L, this::a);
   private final gsi U;
   public final grv f;
   private final gyg V;
   private final hhq W;
   private final gzg X;
   private final gry Y;
   public final gpm g;
   private final frp Z;
   public final ftv h;
   public final ftv i;
   public final grq j;
   public final gwd l;
   private final AtomicReference<asg> aa = new AtomicReference<>();
   public final ftw m;
   public final frh n;
   private final fqy ab;
   public final fre o;
   public final frc p;
   private fra ac = fra.a;
   public final File q;
   private final String ad;
   private final String ae;
   private final Proxy af;
   private final ezv ag;
   private final boolean ah;
   private final boolean ai;
   private final boolean aj;
   private final avc ak;
   private final atv al;
   private final hnz am;
   private final aup an;
   private final hmk ao;
   private final fsf ap;
   private final fjq aq;
   @Nullable
   private final fhw ar;
   private final hqd as;
   private final hpy at;
   private final fxb au;
   private final hme av;
   private final grr aw;
   private final fri ax = new fri(I, frd::a);
   private final YggdrasilAuthenticationService ay;
   private final MinecraftSessionService az;
   private final UserApiService aA;
   private final CompletableFuture<UserProperties> aB;
   private final hmd aC;
   private final hno aD;
   private final gtd aE;
   private final hmb aF;
   private final hma aG;
   private final hlz aH;
   private final hly aI;
   private final fty aJ;
   private final fww aK;
   private final hrf aL;
   private final gev aM;
   private final gum aN;
   private final hqh aO;
   private final gmo aP;
   private final foc aQ;
   private final grh aR;
   @Nullable
   public gml r;
   @Nullable
   public gmb s;
   @Nullable
   public gqz t;
   @Nullable
   private hpl aS;
   @Nullable
   private vt aT;
   private boolean aU;
   @Nullable
   public bwt u;
   @Nullable
   public bwt v;
   @Nullable
   public ffo w;
   private int aV;
   protected int x;
   private volatile boolean aW;
   private long aX = ag.d();
   private long aY;
   private int aZ;
   public boolean y;
   @Nullable
   public gad z;
   @Nullable
   private fzx ba;
   private boolean bb;
   Thread bc;
   private volatile boolean bd;
   @Nullable
   private Supplier<p> be;
   private static int bf;
   public String A = "";
   private long bg;
   private final fjy bh;
   public boolean B;
   public boolean C;
   public boolean D;
   public boolean E = true;
   private boolean bi;
   private final Queue<Runnable> bj = Queues.newConcurrentLinkedQueue();
   @Nullable
   private CompletableFuture<Void> bk;
   @Nullable
   private fwx bl;
   private int bm;
   private final bqu bn;
   private bss bo = bsr.a;
   private final frk bp = new frk();
   private long bq;
   private double br;
   @Nullable
   private fld.a bs;
   private final fqu bt;
   private final gmv bu;
   private gnk bv;
   private final fqq bw;
   private final ffg bx;
   private boolean by;
   private final long bz;
   private long bA;

   public frd(final ggf $$0) {
      super("Client");
      F = this;
      this.bz = System.currentTimeMillis();
      this.q = $$0.c.a;
      File $$1 = $$0.c.c;
      this.M = $$0.c.b.toPath();
      this.ad = $$0.d.b;
      this.ae = $$0.d.c;
      Path $$2 = this.q.toPath();
      this.bx = ezv.a($$2.resolve("allowed_symlinks.txt"));
      hlr $$3 = new hlr($$0.c.a(), this.bx);
      this.am = new hnz(this, $$2.resolve("downloads"), $$0.a);
      aur $$4 = new auk(this.M, att.a, auq.b, this.bx);
      this.an = new aup($$3, this.am.a(), $$4);
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
      yf.a(frb::a);
      this.Q = bbe.a();
      this.aK = new fww(this);
      this.bc = Thread.currentThread();
      this.n = new frh(this, this.q);
      boolean $$5 = this.n.ae;
      this.n.ae = false;
      this.n.az();
      RenderSystem.setShaderGlintAlpha(this.n.aq().c());
      this.bd = true;
      this.aL = new hrf(this, this.n);
      this.ab = new fqy($$2, this.Q);
      G.info("Backend library: {}", RenderSystem.getBackendDescription());
      fjx $$6 = $$0.b;
      if (this.n.p > 0 && this.n.o > 0) {
         $$6 = $$0.b.a(this.n.o, this.n.p);
      }

      if (!$$5) {
         $$6 = $$6.a(false);
         this.n.k = null;
         G.warn("Detected unexpected shutdown during last game startup: resetting fullscreen mode");
      }

      ag.c = RenderSystem.initBackendSystem();
      this.R = new gsz(this);
      this.S = this.R.a($$6, this.n.k, this.bh());
      this.a(true);
      this.S.a(new Runnable() {
         private boolean c;

         @Override
         public void run() {
            if (!this.c) {
               this.c = true;
               fjt.a($$0.c.a, frd.this.bc.threadId());
            }
         }
      });
      hqs.a.b(hqo.A);

      try {
         this.S.a(this.al, ac.b().g() ? fjz.a : fjz.b);
      } catch (IOException var15) {
         G.error("Couldn't set icon", var15);
      }

      this.o = new fre(this);
      this.o.a(this.S.h());
      this.p = new frc(this);
      this.p.a(this.S.h());
      RenderSystem.initRenderer(this.S.h(), this.n.t, false, ($$0x, $$1x) -> this.ab().a($$0x, $$1x), $$0.d.g);
      G.info("Using optional rendering extensions: {}", String.join(", ", RenderSystem.getDevice().l()));
      this.aq = new fjn(this.S.k(), this.S.l());
      this.ak = new avc(att.a);
      this.an.a();
      this.n.b(this.an);
      this.ao = new hmk(this.n.ab, $$0x -> {
         if (this.t != null) {
            this.t.j.C();
         }
      });
      this.ak.a(this.ao);
      this.O = new hlc(this.ak);
      this.ak.a(this.O);
      this.P = new gss(this.O, this::a);
      this.ak.a(this.P);
      this.aC = new hmd($$1.toPath().resolve("skins"), this.az, this);
      this.ag = new ezv($$2.resolve("saves"), $$2.resolve("backups"), this.bx, this.Q);
      this.bw = new fqq($$2);
      this.as = new hqd(this.n);
      this.ak.a(this.as);
      this.av = new hme(this.Z);
      this.ak.a(this.av);
      this.at = new hpy(this);
      this.au = new fxb(this.O);
      this.h = this.au.a();
      this.i = this.au.b();
      this.ak.a(this.au);
      this.g();
      this.ak.a(new hlv());
      this.ak.a(new hlu());
      this.ak.a(new hlt());
      this.S.a("Startup");
      RenderSystem.setupDefaultState();
      this.S.a("Post startup");
      this.ap = fsf.a();
      this.aD = new hno(this.O, this.ap, this.n.E().c());
      this.ak.a(this.aD);
      hnf $$8 = new hnf();
      this.ak.a($$8);
      this.W = new hhq(this.aD);
      this.X = new gzg(this.W);
      this.aH = new hlz(this.O);
      this.aI = new hly(this.O);
      this.ak.a(this.aI);
      this.Y = new gry(this.aI, this.aH);

      try {
         int $$9 = Runtime.getRuntime().availableProcessors();
         flq.a();
         this.U = new gsi($$9);
      } catch (OutOfMemoryError var14) {
         TinyFileDialogs.tinyfd_messageBox(
            "Minecraft",
            "Oh no! The game was unable to allocate memory off-heap while trying to start. You may try to free some memory by closing other applications on your computer, check that your system meets the minimum requirements, and try again. If the problem persists, please visit: "
               + ayj.k,
            "ok",
            "error",
            true
         );
         throw new ggg("Unable to allocate render buffers", var14);
      }

      this.aM = new gev(this, this.aA);
      this.aE = new gtd(this.aD.b(), this.aD.c(), this.ap);
      this.ak.a(this.aE);
      this.V = new gyg(this, this.O, this.W, this.X, this.Y, this.aE, this.h, this.n, this.aD.d(), $$8);
      this.ak.a(this.V);
      this.aN = new gum(this.h, this.aD.d(), this.aE, this.W, this.X, this.V);
      this.ak.a(this.aN);
      this.g = new gpm(this.s, this.O);
      this.ak.a(this.g);
      this.aF = new hmb(this.O);
      this.ak.a(this.aF);
      this.aG = new hma(this.O);
      this.ak.a(this.aG);
      this.aJ = new fty(this.O);
      this.ak.a(this.aJ);
      this.j = new grq(this, this.V.c(), this.ak, this.U);
      this.f = new grv(this, this.V, this.aN, this.U);
      this.ak.a(this.f);
      this.ak.a(this.f.y());
      this.aw = new grr();
      this.ak.a(this.aw);
      this.ak.a(this.ax);
      this.m = new ftw(this);
      this.l = new gwd(this);
      fmd $$11 = fmd.a(this);
      this.aQ = new foc($$11);
      RenderSystem.setErrorCallback(this::a);
      if (this.aq.c != this.S.k() || this.aq.d != this.S.l()) {
         StringBuilder $$12 = new StringBuilder(
            "Recovering from unsupported resolution ("
               + this.S.k()
               + "x"
               + this.S.l()
               + ").\nPlease make sure you have up-to-date drivers (see aka.ms/mcdriver for instructions)."
         );

         try {
            fla $$13 = RenderSystem.getDevice();
            List<String> $$14 = $$13.d();
            if (!$$14.isEmpty()) {
               $$12.append("\n\nReported GL debug messages:\n").append(String.join("\n", $$14));
            }
         } catch (Throwable var13) {
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
      this.aO = new hqh(this, this.aA, this.Z);
      this.aP = gmo.a(this.aA, this.Z, $$2);
      this.bt = new fqu(this);
      this.bt.a(this.n.av().c() != frf.a);
      this.bu = new gmv(this);
      this.bu.a(this.n.C().c());
      this.bv = gnk.a(gnh.a(), this.aA);
      gaf.a(this.O);
      fzt.a(this.O);
      this.a((gad)(new fzo(xa.c("gui.loadingMinecraft"))));
      List<atr> $$15 = this.an.h();
      this.bp.a(frk.b.a, $$15);
      avb $$16 = this.ak.a(ag.h().a("resourceLoad"), this, J, $$15);
      hqs.a.a(hqo.C);
      frd.b $$17 = new frd.b($$11, $$0.e);
      this.a((fzx)(new fzt(this, $$16, $$1x -> ag.a($$1x, $$1xx -> this.a($$1xx, $$17), () -> {
            if (ac.aU) {
               this.bk();
            }

            this.bp.a();
            this.a($$17);
         }), false)));
      this.aR = grh.a($$0.e.b());
      this.bh = new fjy(this.n, this);
      this.bn = new bqu(ag.c, () -> this.bm, this.bh::c);
      if (TracyClient.isAvailable() && $$0.d.f) {
         this.ar = new fhw();
      } else {
         this.ar = null;
      }
   }

   private void a(@Nullable frd.b $$0) {
      if (!this.by) {
         this.by = true;
         this.b($$0);
      }
   }

   private void b(@Nullable frd.b $$0) {
      Runnable $$1 = this.c($$0);
      hqs.a.b(hqo.C);
      hqs.a.b(hqo.z);
      hqs.a.a(this.aO.a());
      $$1.run();
      this.n.ae = true;
      this.n.az();
   }

   public boolean c() {
      return this.by;
   }

   private Runnable c(@Nullable frd.b $$0) {
      List<Function<Runnable, gad>> $$1 = new ArrayList<>();
      this.a($$1);
      Runnable $$2 = () -> {
         if ($$0 != null && $$0.b().a()) {
            grg.a(this, $$0.b(), $$0.a());
         } else {
            this.a((gad)(new gaf(true)));
         }
      };

      for (Function<Runnable, gad> $$3 : Lists.reverse($$1)) {
         gad $$4 = $$3.apply($$2);
         $$2 = () -> this.a($$4);
      }

      return $$2;
   }

   private void a(List<Function<Runnable, gad>> $$0) {
      if (this.n.ac) {
         $$0.add($$0x -> new fyv(this.n, $$0x));
      }

      BanDetails $$1 = this.H();
      if ($$1 != null) {
         $$0.add($$1x -> fyy.a($$1xx -> {
               if ($$1xx) {
                  ag.n().a(ayj.n);
               }

               $$1x.run();
            }, $$1));
      }

      ProfileResult $$2 = this.N.join();
      if ($$2 != null) {
         GameProfile $$3 = $$2.profile();
         Set<ProfileActionType> $$4 = $$2.actions();
         if ($$4.contains(ProfileActionType.FORCED_NAME_CHANGE)) {
            $$0.add($$1x -> fyy.a($$3.getName(), $$1x));
         }

         if ($$4.contains(ProfileActionType.USING_BANNED_SKIN)) {
            $$0.add(fyy::a);
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
      gmc $$1 = this.L();
      if ($$1 != null && $$1.k().i()) {
         $$0.append(" - ");
         gmq $$2 = this.S();
         if (this.aS != null && !this.aS.r()) {
            $$0.append(hmi.a("title.singleplayer"));
         } else if ($$2 != null && $$2.e()) {
            $$0.append(hmi.a("title.multiplayer.realms"));
         } else if (this.aS == null && ($$2 == null || !$$2.d())) {
            $$0.append(hmi.a("title.multiplayer.other"));
         } else {
            $$0.append(hmi.a("title.multiplayer.lan"));
         }
      }

      return $$0.toString();
   }

   private UserApiService a(YggdrasilAuthenticationService $$0, ggf $$1) {
      return $$1.a.a.g() != frp.a.c ? UserApiService.OFFLINE : $$0.createUserApiService($$1.a.a.d());
   }

   public static azn e() {
      return azn.a("vanilla", ClientBrandRetriever::getClientModName, "Client", frd.class);
   }

   private void a(Throwable $$0, @Nullable frd.b $$1) {
      if (this.an.e().size() > 1) {
         this.a($$0, null, $$1);
      } else {
         ag.a($$0);
      }
   }

   public void a(Throwable $$0, @Nullable xa $$1, @Nullable frd.b $$2) {
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

      this.a((gad)(new gaf()));
      this.a(null);
   }

   private void a(@Nullable xa $$0) {
      fww $$1 = this.aA();
      fwu.b($$1, fwu.a.c, xa.c("resourcePack.load_fail"), $$0);
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
         this.a($$0, xa.c("resourcePack.runtime_failure"), null);
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
               bre $$2 = bre.a("Renderer");
               boolean $$3 = this.aQ().e();

               try (bra.a $$4 = bra.a(this.a($$3, $$2))) {
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
               this.a((gad)(new fzw()));
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

   public fjq h() {
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
      azm.b();
      p $$1 = this.d($$0);
      this.bl();
      a(this, this.q, $$1);
   }

   public static int a(File $$0, p $$1) {
      Path $$2 = $$0.toPath().resolve("crash-reports");
      Path $$3 = $$2.resolve("crash-" + ag.f() + "-client.txt");
      alk.a($$1.a(z.a));
      if ($$1.e() != null) {
         alk.a("#@!@# Game crashed! Crash report saved to: #@!@# " + $$1.e().toAbsolutePath());
         return -1;
      } else if ($$1.a($$3, z.a)) {
         alk.a("#@!@# Game crashed! Crash report saved to: #@!@# " + $$3.toAbsolutePath());
         return -1;
      } else {
         alk.a("#@?@# Game crashed! Crash report could not be saved. #@?@#");
         return -2;
      }
   }

   public static void a(@Nullable frd $$0, File $$1, p $$2) {
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

   private CompletableFuture<Void> a(boolean $$0, @Nullable frd.b $$1) {
      if (this.bk != null) {
         return this.bk;
      } else {
         CompletableFuture<Void> $$2 = new CompletableFuture<>();
         if (!$$0 && this.ba instanceof fzt) {
            this.bk = $$2;
            return $$2;
         } else {
            this.an.a();
            List<atr> $$3 = this.an.h();
            if (!$$0) {
               this.bp.a(frk.b.b, $$3);
            }

            this.a((fzx)(new fzt(this, this.ak.a(ag.h().a("resourceLoad"), this, J, $$3), $$3x -> ag.a($$3x, $$2xx -> {
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
      gtc $$1 = this.ap().a();
      gtn $$2 = $$1.a().a();

      for (dnc $$3 : mg.e) {
         UnmodifiableIterator $$7 = $$3.l().a().iterator();

         while ($$7.hasNext()) {
            ebe $$4 = (ebe)$$7.next();
            if ($$4.o() == dtp.b) {
               gtn $$5 = $$1.b($$4);
               if ($$5 == $$2) {
                  G.debug("Missing model for: {}", $$4);
                  $$0 = true;
               }
            }
         }
      }

      hla $$6 = $$2.a();

      for (dnc $$7 : mg.e) {
         UnmodifiableIterator var15 = $$7.l().a().iterator();

         while (var15.hasNext()) {
            ebe $$8 = (ebe)var15.next();
            hla $$9 = $$1.a($$8);
            if (!$$8.l() && $$9 == $$6) {
               G.debug("Missing particle icon for: {}", $$8);
            }
         }
      }

      mg.g.c().forEach($$0x -> {
         czu $$1x = (czu)$$0x.a();
         String $$2x = $$1x.j();
         String $$3x = xa.c($$2x).getString();
         if ($$3x.toLowerCase(Locale.ROOT).equals($$1x.j())) {
            G.debug("Missing translation for: {} {} {}", new Object[]{$$0x.h().a(), $$2x, $$1x});
         }
      });
      $$0 |= fzu.a();
      $$0 |= gyj.a();
      if ($$0) {
         throw new IllegalStateException("Your game data is foobar, fix the errors above!");
      }
   }

   public ezv m() {
      return this.ag;
   }

   private void a(String $$0) {
      frd.a $$1 = this.J();
      if (!$$1.a(this.T())) {
         if (this.m.b()) {
            this.m.b(false);
            this.a((gad)(new fza($$0x -> {
               if ($$0x) {
                  ag.n().a(ayj.g);
               }

               this.a(null);
            }, frd.a.e, ayj.g, true)));
         } else {
            xa $$2 = $$1.a();
            this.m.a($$2, false);
            this.bt.c($$2);
            this.m.b($$1 == frd.a.d);
         }
      } else {
         this.a((gad)(new fyz($$0)));
      }
   }

   public void a(@Nullable gad $$0) {
      if (ac.aU && Thread.currentThread() != this.bc) {
         G.error("setScreen called from non-game thread");
      }

      if (this.z != null) {
         this.z.aJ_();
      } else {
         this.a(fra.a);
      }

      if ($$0 == null && this.bb) {
         throw new IllegalStateException("Trying to return to in-game GUI during disconnection");
      } else {
         if ($$0 == null && this.s == null) {
            $$0 = new gaf();
         } else if ($$0 == null && this.t.eH()) {
            if (this.t.n()) {
               $$0 = new fzh(null, this.s.k().l());
            } else {
               this.t.gg();
            }
         }

         this.z = $$0;
         if (this.z != null) {
            this.z.aK_();
         }

         if ($$0 != null) {
            this.o.j();
            frb.b();
            $$0.b(this, this.S.o(), this.S.p());
            this.y = false;
         } else {
            this.as.h();
            this.o.i();
         }

         this.d();
      }
   }

   public void a(@Nullable fzx $$0) {
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
            this.z.aJ_();
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

         fxn.b();
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

      if (this.bk != null && !(this.ba instanceof fzt)) {
         CompletableFuture<Void> $$1 = this.bk;
         this.bk = null;
         this.l().thenRun(() -> $$1.complete(null));
      }

      Runnable $$2;
      while (($$2 = this.bj.poll()) != null) {
         $$2.run();
      }

      int $$3 = this.T.a(ag.c(), $$0);
      brb $$4 = bra.a();
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
            fld.a().ifPresent(fld::b);
         }
      }

      fjq $$9 = this.h();
      RenderSystem.getDevice().b().a($$9.d(), 0, $$9.e(), 1.0);
      RenderSystem.setShaderFog(gro.a);
      $$4.a("mouse");
      this.o.a();
      $$4.c();
      if (!this.y) {
         $$4.b("gameRenderer");
         this.j.a(this.T, $$0);
         $$4.c();
      }

      $$4.a("blit");
      if (!this.S.u()) {
         $$9.c();
      }

      this.bg = ag.d() - $$6;
      if ($$8) {
         fld.a().ifPresent($$0x -> this.bs = $$0x.c());
      }

      $$4.b("updateDisplay");
      if (this.ar != null) {
         this.ar.a();
         this.ar.a($$9);
      }

      this.S.a(this.ar);
      int $$10 = this.bh.a();
      if ($$10 < 260) {
         RenderSystem.limitDisplayFPS($$10);
      }

      $$4.b("yield");
      Thread.yield();
      $$4.c();
      this.S.a("Post render");
      this.aZ++;
      this.aW = this.U() && (this.z != null && this.z.k() || this.ba != null && this.ba.a()) && !this.aS.r();
      this.T.b(this.aW);
      this.T.c(!this.bq());
      long $$11 = ag.d();
      long $$12 = $$11 - this.aX;
      if ($$8) {
         this.bq = $$12;
      }

      this.aQ().a($$12);
      this.aX = $$11;
      $$4.a("fpsUpdate");
      if (this.bs != null && this.bs.b()) {
         this.br = (double)this.bs.c() * 100.0 / (double)this.bq;
      }

      while (ag.c() >= this.aY + 1000L) {
         String $$13;
         if (this.br > 0.0) {
            $$13 = " GPU: " + (this.br > 100.0 ? o.m + "100%" : Math.round(this.br) + "%");
         } else {
            $$13 = "";
         }

         bf = this.aZ;
         this.A = String.format(
            Locale.ROOT,
            "%d fps T: %s%s%s%s B: %d%s",
            bf,
            $$10 == 260 ? "inf" : $$10,
            this.n.Q().c() ? " vsync " : " ",
            this.n.k().c(),
            this.n.j().c() == fqp.a ? "" : (this.n.j().c() == fqp.b ? " fast-clouds" : " fancy-clouds"),
            this.n.G().c(),
            $$13
         );
         this.aY += 1000L;
         this.aZ = 0;
      }

      $$4.c();
   }

   private brb a(boolean $$0, @Nullable bre $$1) {
      if (!$$0) {
         this.bn.b();
         if (!this.bo.e() && $$1 == null) {
            return bqx.a;
         }
      }

      brb $$2;
      if ($$0) {
         if (!this.bn.a()) {
            this.bm = 0;
            this.bn.c();
         }

         this.bm++;
         $$2 = this.bn.d();
      } else {
         $$2 = bqx.a;
      }

      if (this.bo.e()) {
         $$2 = brb.a($$2, this.bo.f());
      }

      return bre.a($$2, $$1);
   }

   private void b(boolean $$0, @Nullable bre $$1) {
      if ($$1 != null) {
         $$1.b();
      }

      fwe $$2 = this.aQ().o();
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

      fjq $$1 = this.h();
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
      azm.b();

      try {
         if (this.aU && this.aS != null) {
            this.aS.a(true);
         }

         this.b(new fzo(xa.c("menu.savingLevel")));
      } catch (Throwable var2) {
      }

      System.gc();
   }

   public boolean b(Consumer<xa> $$0) {
      if (this.bo.e()) {
         this.bm();
         return false;
      } else {
         Consumer<bqz> $$1 = $$1x -> {
            if ($$1x != bqv.a) {
               int $$2x = $$1x.f();
               double $$3x = (double)$$1x.g() / (double)bas.a;
               this.execute(
                  () -> $$0.accept(
                        xa.a("commands.debug.stopped", String.format(Locale.ROOT, "%.2f", $$3x), $$2x, String.format(Locale.ROOT, "%.2f", (double)$$2x / $$3x))
                     )
               );
            }
         };
         Consumer<Path> $$2 = $$1x -> {
            xa $$2x = xa.b($$1x.toString()).a(o.t).a($$1xx -> $$1xx.a(new wy.d($$1x.getParent())));
            this.execute(() -> $$0.accept(xa.a("debug.profiling.stop", $$2x)));
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

         this.bo = bsq.a(new gre(ag.c, this.f), ag.c, ag.i(), new bsw("client"), $$1x -> {
            this.bo = bsr.a;
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
         gmq $$3 = this.S();
         $$2 = $$3 != null ? $$3.a : "unknown";
      }

      Path $$7;
      try {
         String $$5 = String.format(Locale.ROOT, "%s-%s-%s", ag.f(), $$2, ac.b().b());
         String $$6 = w.a(bsw.a, $$5, ".zip");
         $$7 = bsw.a.resolve($$6);
      } catch (IOException var21) {
         throw new UncheckedIOException(var21);
      }

      try (ayz $$10 = new ayz($$7)) {
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
            this.a((gad)(new fzy(!$$0)));
            this.as.d();
         } else {
            this.a((gad)(new fzy(true)));
         }
      }
   }

   private void d(boolean $$0) {
      if (!$$0) {
         this.x = 0;
      }

      if (this.x <= 0 && !this.t.fz()) {
         if ($$0 && this.w != null && this.w.d() == ffo.a.b) {
            ffm $$1 = (ffm)this.w;
            iv $$2 = $$1.b();
            if (!this.s.a_($$2).l()) {
               jb $$3 = $$1.c();
               if (this.r.b($$2, $$3)) {
                  this.g.a($$2, $$3);
                  this.t.a(buq.a);
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
         czy $$0 = this.t.b(buq.a);
         if (!$$0.a(this.s.K())) {
            return false;
         } else {
            boolean $$1 = false;
            switch (this.w.d()) {
               case c:
                  this.r.a(this.t, ((ffn)this.w).a());
                  break;
               case b:
                  ffm $$2 = (ffm)this.w;
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

                  this.t.gE();
            }

            this.t.a(buq.a);
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

            for (buq $$0 : buq.values()) {
               czy $$1 = this.t.b($$0);
               if (!$$1.a(this.s.K())) {
                  return;
               }

               if (this.w != null) {
                  switch (this.w.d()) {
                     case c:
                        ffn $$2 = (ffn)this.w;
                        bwt $$3 = $$2.a();
                        if (!this.s.E_().a($$3.dv())) {
                           return;
                        }

                        bur $$4 = this.r.a(this.t, $$3, $$2, $$0);
                        if (!$$4.a()) {
                           $$4 = this.r.a(this.t, $$3, $$0);
                        }

                        if ($$4 instanceof bur.d $$5) {
                           if ($$5.e() == bur.e.b) {
                              this.t.a($$0);
                           }

                           return;
                        }
                        break;
                     case b:
                        ffm $$6 = (ffm)this.w;
                        int $$7 = $$1.M();
                        bur $$8 = this.r.a(this.t, $$0, $$6);
                        if ($$8 instanceof bur.d $$9) {
                           if ($$9.e() == bur.e.b) {
                              this.t.a($$0);
                              if (!$$1.f() && ($$1.M() != $$7 || this.t.fV())) {
                                 this.j.c.a($$0);
                              }
                           }

                           return;
                        }

                        if ($$8 instanceof bur.a) {
                           return;
                        }
                  }
               }

               if (!$$1.f() && this.r.a(this.t, $$0) instanceof bur.d $$11) {
                  if ($$11.e() == bur.e.b) {
                     this.t.a($$0);
                  }

                  this.j.c.a($$0);
                  return;
               }
            }
         }
      }
   }

   public hpy s() {
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

      brb $$0 = bra.a();
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
         this.O.c();
      }

      if (this.z != null || this.t == null) {
         if (this.z instanceof fzq $$1 && !this.t.fR()) {
            $$1.m();
         }
      } else if (this.t.eH() && !(this.z instanceof fzh)) {
         this.a(null);
      } else if (this.t.fR() && this.s != null) {
         this.a((gad)(new fzq()));
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
               xa $$4 = xa.c("tutorial.socialInteractions.title");
               xa $$5 = xa.a("tutorial.socialInteractions.description", hrf.a("socialInteractions"));
               this.bl = new fwx(this.h, fwx.a.f, $$4, $$5, true, 8000);
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
            this.s.b(this.t.dz(), this.t.dB(), this.t.dF());
         }

         $$0.b("particles");
         if (!this.aW && this.bq()) {
            this.g.b();
         }

         gmc $$9 = this.L();
         if ($$9 != null && !this.aW) {
            $$9.b(ahd.a);
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
         fqm $$0 = this.n.aE();
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
            if (this.t.Z_()) {
               this.m.g().a($$1);
            } else if (!this.t.fV() || this.z != null || !$$3 && !$$2) {
               this.t.gj().c($$1);
            } else {
               gbi.a(this, $$1, $$3, $$2);
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

            this.a((gad)(new gex()));
         }
      }

      while (this.n.C.g()) {
         if (this.r.f()) {
            this.t.i();
         } else {
            this.aL.a();
            this.a((gad)(new gbt(this.t)));
         }
      }

      while (this.n.R.g()) {
         this.a((gad)(new gan(this.t.j.p())));
      }

      while (this.n.D.g()) {
         if (!this.t.Z_()) {
            this.L().b(new ahx(ahx.a.g, iv.c, jb.a));
         }
      }

      while (this.n.E.g()) {
         if (!this.t.Z_() && this.t.a(gad.s())) {
            this.t.a(buq.a);
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

   public hqh u() {
      return this.aO;
   }

   public double v() {
      return this.br;
   }

   public gmo w() {
      return this.aP;
   }

   public gfr x() {
      return new gfr(this, this.ag);
   }

   public void a(ezv.c $$0, aup $$1, amh $$2, boolean $$3) {
      this.y();
      this.aa.set(null);
      Instant $$4 = Instant.now();

      try {
         $$0.a($$2.c().a(), $$2.d());
         amd $$5 = amd.a(this.ay, this.q);
         $$5.f().a(this);
         dzs.a($$5, this);
         avo.a(false);
         this.aS = MinecraftServer.a((Function<Thread, hpl>)($$4x -> new hpl($$4x, this, $$0, $$1, $$2, $$5, $$0xx -> {
               asg $$1xx = asg.b($$0xx + 0);
               this.aa.set($$1xx);
               return asf.a($$1xx, this.bj::add);
            })));
         this.aU = true;
         this.a(gnh.a());
         this.aR.a(grh.c.a, $$0.f(), $$2.d().e());
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

      fzr $$9 = new fzr(this.aa.get());
      brb $$10 = bra.a();
      this.a((gad)$$9);
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
      vt $$13 = vt.a($$12);
      $$13.a($$12.toString(), 0, new gma($$13, this, null, null, $$3, $$11, $$0x -> {
      }, null));
      $$13.a(new ajn(this.X().c(), this.X().b()));
      this.aT = $$13;
   }

   public void a(gmb $$0, gab.a $$1) {
      this.e(new gab(() -> false, $$1));
      this.s = $$0;
      this.a($$0);
      if (!this.aU) {
         amd $$2 = amd.a(this.ay, this.q);
         $$2.f().a(this);
         dzs.a($$2, this);
         avo.a(false);
      }
   }

   public void y() {
      this.a(new gaa(true), false);
   }

   public void b(gad $$0) {
      this.a($$0, false);
   }

   public void a(gad $$0, boolean $$1) {
      gmc $$2 = this.L();
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

      hpl $$3 = this.aS;
      this.aS = null;
      this.j.h();
      this.r = null;
      this.bt.b();
      this.bb = true;

      try {
         this.e($$0);
         if (this.s != null) {
            if ($$3 != null) {
               brb $$4 = bra.a();
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

      dzs.a();
   }

   public void z() {
      this.am.i();
      this.bA();
   }

   public void c(gad $$0) {
      gmc $$1 = this.L();
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

      dzs.a();
   }

   private void e(gad $$0) {
      brb $$1 = bra.a();
      $$1.a("forcedTick");
      this.as.e();
      this.u = null;
      this.aT = null;
      this.a($$0);
      this.c(false);
      $$1.c();
   }

   public void d(gad $$0) {
      try (brg $$1 = bra.a().d("forcedTick")) {
         this.a($$0);
         this.c(false);
      }
   }

   private void a(@Nullable gmb $$0) {
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
      return ac.aU ? false : this.bt().flag(UserFlag.TELEMETRY_ENABLED);
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
      return this.J().a(false) ? this.aM.c($$0) : (this.t == null || !$$0.equals(this.t.cG())) && !$$0.equals(ag.e);
   }

   public frd.a J() {
      if (this.n.n().c() == cru.c) {
         return frd.a.b;
      } else if (!this.aj) {
         return frd.a.c;
      } else {
         return !this.bt().flag(UserFlag.CHAT_ALLOWED) ? frd.a.d : frd.a.a;
      }
   }

   public final boolean K() {
      return this.ah;
   }

   @Nullable
   public gmc L() {
      return this.t == null ? null : this.t.j;
   }

   public static boolean M() {
      return !F.n.X;
   }

   public static boolean N() {
      return F.n.k().c().b() >= fqv.b.b();
   }

   public static boolean O() {
      return !F.j.a() && F.n.k().c().b() >= fqv.c.b();
   }

   public static boolean P() {
      return F.n.l().c();
   }

   private void bu() {
      if (this.w != null && this.w.d() != ffo.a.a) {
         boolean $$0 = gad.s();
         ffo var10000 = this.w;
         Objects.requireNonNull(this.w);
         Object var2 = var10000;
         switch (var2) {
            case ffm $$1:
               this.r.a($$1.b(), $$0);
               break;
            case ffn $$2:
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

   public static void a(@Nullable frd $$0, @Nullable hmk $$1, String $$2, @Nullable frh $$3, p $$4) {
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

   private static ae a(ae $$0, @Nullable frd $$1, @Nullable hmk $$2, String $$3, @Nullable frh $$4) {
      $$0.a("Launched Version", () -> $$3);
      String $$5 = bg();
      if ($$5 != null) {
         $$0.a("Launcher name", $$5);
      }

      $$0.a("Backend library", RenderSystem::getBackendDescription);
      $$0.a("Backend API", RenderSystem::getApiDescription);
      $$0.a("Window size", () -> $$1 != null ? $$1.S.k() + "x" + $$1.S.l() : "<not initialized>");
      $$0.a("GFLW Platform", fkk::a);
      $$0.a("Render Extensions", () -> String.join(", ", RenderSystem.getDevice().l()));
      $$0.a("GL debug messages", () -> {
         fla $$0x = RenderSystem.tryGetDevice();
         if ($$0x == null) {
            return "<no renderer available>";
         } else {
            return $$0x.e() ? String.join("\n", $$0x.d()) : "<debugging unavailable>";
         }
      });
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
         $$0.a("Resource Packs", () -> aup.a($$1.ad().g()));
      }

      if ($$2 != null) {
         $$0.a("Current Language", () -> $$2.a());
      }

      $$0.a("Locale", String.valueOf(Locale.getDefault()));
      $$0.a("System encoding", () -> System.getProperty("sun.jnu.encoding", "<not set>"));
      $$0.a("File encoding", () -> System.getProperty("file.encoding", "<not set>"));
      $$0.a("CPU", GLX::_getCpuInfo);
      return $$0;
   }

   public static frd Q() {
      return F;
   }

   public CompletableFuture<Void> R() {
      return this.a(this::l).thenCompose($$0 -> (CompletionStage<Void>)$$0);
   }

   public void a(gnh $$0) {
      if (!this.bv.a($$0)) {
         this.bv = gnk.a($$0, this.aA);
      }
   }

   @Nullable
   public gmq S() {
      return y.a(this.L(), gmc::x);
   }

   public boolean T() {
      return this.aU;
   }

   public boolean U() {
      return this.aU && this.aS != null;
   }

   @Nullable
   public hpl V() {
      return this.aS;
   }

   public boolean W() {
      hpl $$0 = this.V();
      return $$0 != null && !$$0.r();
   }

   public boolean b(UUID $$0) {
      return $$0.equals(this.X().b());
   }

   public frp X() {
      return this.Z;
   }

   public GameProfile Y() {
      ProfileResult $$0 = this.N.join();
      return $$0 != null ? $$0.profile() : new GameProfile(this.Z.b(), this.Z.c());
   }

   public Proxy Z() {
      return this.af;
   }

   public hlc aa() {
      return this.O;
   }

   public gss ab() {
      return this.P;
   }

   public avf ac() {
      return this.ak;
   }

   public aup ad() {
      return this.an;
   }

   public atv ae() {
      return this.al;
   }

   public hnz af() {
      return this.am;
   }

   public Path ag() {
      return this.M;
   }

   public hmk ah() {
      return this.ao;
   }

   public Function<ali, hla> a(ali $$0) {
      return this.aD.c($$0)::a;
   }

   public boolean ai() {
      return this.aW;
   }

   public grr aj() {
      return this.aw;
   }

   public hqd ak() {
      return this.as;
   }

   public hpx al() {
      awm $$0 = y.a(this.z, gad::D);
      if ($$0 != null) {
         return new hpx($$0);
      } else if (this.t != null) {
         djx $$1 = this.t.dV();
         if ($$1.aj() == djx.k) {
            return this.m.j().b() ? new hpx(awn.d) : new hpx(awn.e);
         } else {
            jf<dla> $$2 = $$1.u(this.t.dv());
            float $$3 = $$2.a().q();
            if (!this.at.b(awn.f) && (!this.t.bm() || !$$2.a(axd.Z))) {
               if ($$1.aj() != djx.j && this.t.gk().d && this.t.gk().c) {
                  return new hpx(awn.b, $$3);
               } else {
                  Optional<btb<awm>> $$4 = $$2.a().p();
                  if ($$4.isPresent()) {
                     Optional<awm> $$5 = $$4.get().a($$1.A);
                     return new hpx($$5.orElse(null), $$3);
                  } else {
                     return new hpx(awn.g, $$3);
                  }
               }
            } else {
               return new hpx(awn.f, $$3);
            }
         }
      } else {
         return new hpx(awn.a);
      }
   }

   public MinecraftSessionService am() {
      return this.az;
   }

   public hmd an() {
      return this.aC;
   }

   @Nullable
   public bwt ao() {
      return this.u;
   }

   public void a(bwt $$0) {
      this.u = $$0;
      this.j.a($$0);
   }

   public boolean b(bwt $$0) {
      return $$0.cn() || this.t != null && this.t.Z_() && this.n.Q.e() && $$0.an() == bxc.bT;
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

   public gtd ap() {
      return this.aE;
   }

   public gyg aq() {
      return this.V;
   }

   public gum ar() {
      return this.aN;
   }

   public gzg as() {
      return this.X;
   }

   public gry at() {
      return this.Y;
   }

   public DataFixer au() {
      return this.Q;
   }

   public fqt av() {
      return this.T;
   }

   public fsf aw() {
      return this.ap;
   }

   public boolean az() {
      return this.t != null && this.t.gA() || this.n.Y().c();
   }

   public fww aA() {
      return this.aK;
   }

   public hrf aB() {
      return this.aL;
   }

   public boolean aC() {
      return this.bi;
   }

   public fqy aD() {
      return this.ab;
   }

   public hno aE() {
      return this.aD;
   }

   public hmb aF() {
      return this.aF;
   }

   public hma aG() {
      return this.aG;
   }

   public hlz aH() {
      return this.aH;
   }

   public hly aI() {
      return this.aI;
   }

   public fty aJ() {
      return this.aJ;
   }

   @Override
   public void a(boolean $$0) {
      this.bi = $$0;
   }

   public xa a(File $$0, int $$1, int $$2) {
      int $$3 = this.S.k();
      int $$4 = this.S.l();
      fjq $$5 = this.h();
      float $$6 = this.t.dN();
      float $$7 = this.t.dL();
      float $$8 = this.t.O;
      float $$9 = this.t.N;
      this.j.b(false);

      xo var12;
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
            this.j.a(fqt.b);

            try {
               Thread.sleep(10L);
            } catch (InterruptedException var17) {
            }

            frl.a($$0, "panorama_" + $$10 + ".png", $$5, $$0x -> {
            });
         }

         xa $$11 = xa.b($$0.getName()).a(o.t).a($$1x -> $$1x.a(new wy.d($$0.getAbsoluteFile())));
         return xa.a("screenshot.success", $$11);
      } catch (Exception var18) {
         G.error("Couldn't save image", var18);
         var12 = xa.a("screenshot.failure", var18.getMessage());
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
      }

      return var12;
   }

   @Nullable
   public asg aK() {
      return this.aa.get();
   }

   public hme aL() {
      return this.av;
   }

   @Nullable
   public fzx aM() {
      return this.ba;
   }

   public gev aN() {
      return this.aM;
   }

   public fkk aO() {
      return this.S;
   }

   public fjy aP() {
      return this.bh;
   }

   public fut aQ() {
      return this.m.k();
   }

   public gsi aR() {
      return this.U;
   }

   public void a(int $$0) {
      this.aD.a($$0);
   }

   public gla aS() {
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
   public bad aV() {
      return bad.a(this.ay.getServicesKeySet(), ServicesKeyType.PROFILE_KEY);
   }

   public boolean aW() {
      return !this.ay.getServicesKeySet().keys(ServicesKeyType.PROFILE_KEY).isEmpty();
   }

   public fra aX() {
      return this.ac;
   }

   public void a(fra $$0) {
      this.ac = $$0;
   }

   public fqu aY() {
      return this.bt;
   }

   public gmv aZ() {
      return this.bu;
   }

   public gnk ba() {
      return this.bv;
   }

   public foc bb() {
      return this.aQ;
   }

   public grh bc() {
      return this.aR;
   }

   public fqq bd() {
      return this.bw;
   }

   public ffg be() {
      return this.bx;
   }

   private float a(float $$0) {
      if (this.s != null) {
         bva $$1 = this.s.u();
         if ($$1.i()) {
            return Math.max($$0, $$1.g());
         }
      }

      return $$0;
   }

   public hhq bf() {
      return this.W;
   }

   @Nullable
   public static String bg() {
      return System.getProperty("minecraft.launcher.brand");
   }

   public static enum a {
      a(wz.a) {
         @Override
         public boolean a(boolean $$0) {
            return true;
         }
      },
      b(xa.c("chat.disabled.options").a(o.m)) {
         @Override
         public boolean a(boolean $$0) {
            return false;
         }
      },
      c(xa.c("chat.disabled.launcher").a(o.m)) {
         @Override
         public boolean a(boolean $$0) {
            return $$0;
         }
      },
      d(xa.a("chat.disabled.profile", xa.d(frd.F.n.I.h())).a(o.m)) {
         @Override
         public boolean a(boolean $$0) {
            return $$0;
         }
      };

      static final xa e = xa.c("chat.disabled.profile.moreInfo");
      private final xa f;

      a(final xa $$0) {
         this.f = $$0;
      }

      public xa a() {
         return this.f;
      }

      public abstract boolean a(boolean var1);
   }

   static record b(fmd a, ggf.c b) {
   }
}
