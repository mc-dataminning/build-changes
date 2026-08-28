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

public class fji extends bqw<Runnable> implements fdf {
   static fji F;
   private static final Logger G = LogUtils.getLogger();
   public static final boolean a = ae.m() == ae.a.d;
   private static final int H = 10;
   public static final ali b = ali.b("default");
   public static final ali c = ali.b("uniform");
   public static final ali d = ali.b("alt");
   private static final ali I = ali.b("regional_compliancies.json");
   private static final CompletableFuture<bap> J = CompletableFuture.completedFuture(bap.a);
   private static final xi K = xi.c("multiplayer.socialInteractions.not_available");
   public static final String e = "Please make sure you have up-to-date drivers (see aka.ms/mcdriver for instructions).";
   private final long L = Double.doubleToLongBits(Math.PI);
   private final Path M;
   private final CompletableFuture<ProfileResult> N;
   private final gye O;
   private final giy P;
   private final DataFixer Q;
   private final gjg R;
   private final fde S;
   private final fiy.b T = new fiy.b(20.0F, 0L, this::a);
   private final gip U;
   public final gid f;
   private final goi V;
   private final gpi W;
   private final gig X;
   public final gfr g;
   private final fjv Y;
   public final fks h;
   public final fks i;
   public final ghx j;
   public final gmh l;
   private final AtomicReference<asb> Z = new AtomicReference<>();
   public final fkt m;
   public final fjm n;
   private final fjd aa;
   public final fjj o;
   public final fjh p;
   private fjf ab = fjf.a;
   public final File q;
   private final String ac;
   private final String ad;
   private final Proxy ae;
   private final etq af;
   private final boolean ag;
   private final boolean ah;
   private final boolean ai;
   private final auy aj;
   private final atq ak;
   private final hbc al;
   private final aul am;
   private final gzm an;
   private final fkk ao;
   private final fko ap;
   private final fcl aq;
   @Nullable
   private final fbr ar;
   private final hdf as;
   private final hda at;
   private final fnx au;
   private final gzg av;
   private final ghy aw;
   private final fjn ax = new fjn(I, fji::a);
   private final YggdrasilAuthenticationService ay;
   private final MinecraftSessionService az;
   private final UserApiService aA;
   private final CompletableFuture<UserProperties> aB;
   private final gzf aC;
   private final has aD;
   private final gjk aE;
   private final hak aF;
   private final gzd aG;
   private final gzc aH;
   private final gzb aI;
   private final gza aJ;
   private final fkv aK;
   private final fns aL;
   private final heh aM;
   private final fvp aN;
   private final gbi aO;
   private final gkr aP;
   private final hdj aQ;
   private final gcu aR;
   private final fgf aS;
   private final ghl aT;
   @Nullable
   public gcr r;
   @Nullable
   public gci s;
   @Nullable
   public ghd t;
   @Nullable
   private hco aU;
   @Nullable
   private wc aV;
   private boolean aW;
   @Nullable
   public bue u;
   @Nullable
   public bue v;
   @Nullable
   public ezl w;
   private int aX;
   protected int x;
   private volatile boolean aY;
   private long aZ = ae.d();
   private long ba;
   private int bb;
   public boolean y;
   @Nullable
   public fra z;
   @Nullable
   private fqu bc;
   private boolean bd;
   Thread be;
   private volatile boolean bf;
   @Nullable
   private Supplier<o> bg;
   private static int bh;
   public String A = "";
   private long bi;
   private final fcs bj;
   public boolean B;
   public boolean C;
   public boolean D;
   public boolean E = true;
   private boolean bk;
   private final Queue<Runnable> bl = Queues.newConcurrentLinkedQueue();
   @Nullable
   private CompletableFuture<Void> bm;
   @Nullable
   private fnt bn;
   private int bo;
   private final bog bp = new bog(ae.c, () -> this.bo);
   private bqd bq = bqc.a;
   private final fjq br = new fjq();
   private long bs;
   private double bt;
   @Nullable
   private fdu.a bu;
   private final fiz bv;
   private final gdb bw;
   private gdq bx;
   private final fiv by;
   private final ezd bz;
   private boolean bA;
   private final long bB;
   private long bC;

   public fji(final fwy $$0) {
      super("Client");
      F = this;
      this.bB = System.currentTimeMillis();
      this.q = $$0.c.a;
      File $$1 = $$0.c.c;
      this.M = $$0.c.b.toPath();
      this.ac = $$0.d.b;
      this.ad = $$0.d.c;
      Path $$2 = this.q.toPath();
      this.bz = etq.a($$2.resolve("allowed_symlinks.txt"));
      gyu $$3 = new gyu($$0.c.a(), this.bz);
      this.al = new hbc(this, $$2.resolve("downloads"), $$0.a);
      aun $$4 = new aug(this.M, ato.a, aum.b, this.bz);
      this.am = new aul($$3, this.al.a(), $$4);
      this.ak = $$3.a();
      this.ae = $$0.a.d;
      this.ay = new YggdrasilAuthenticationService(this.ae);
      this.az = this.ay.createMinecraftSessionService();
      this.Y = $$0.a.a;
      this.N = CompletableFuture.supplyAsync(() -> this.az.fetchProfile(this.Y.b(), true), ae.i());
      this.aA = this.a(this.ay, $$0);
      this.aB = CompletableFuture.supplyAsync(() -> {
         try {
            return this.aA.fetchProperties();
         } catch (AuthenticationException var2x) {
            G.error("Failed to fetch user properties", var2x);
            return UserApiService.OFFLINE_PROPERTIES;
         }
      }, ae.i());
      G.info("Setting user: {}", this.Y.c());
      G.debug("(Session ID is {})", this.Y.a());
      this.ag = $$0.d.a;
      this.ah = !$$0.d.d;
      this.ai = !$$0.d.e;
      this.aU = null;
      yn.a(fjg::a);
      this.Q = bau.a();
      this.aL = new fns(this);
      this.be = Thread.currentThread();
      this.n = new fjm(this, this.q);
      RenderSystem.setShaderGlintAlpha(this.n.ap().c());
      this.bf = true;
      this.aM = new heh(this, this.n);
      this.aa = new fjd($$2, this.Q);
      G.info("Backend library: {}", RenderSystem.getBackendDescription());
      fcr $$5;
      if (this.n.p > 0 && this.n.o > 0) {
         $$5 = new fcr(this.n.o, this.n.p, $$0.b.c, $$0.b.d, $$0.b.e);
      } else {
         $$5 = $$0.b;
      }

      ae.c = RenderSystem.initBackendSystem();
      this.R = new gjg(this);
      this.S = this.R.a($$5, this.n.k, this.bh());
      this.a(true);
      this.S.a(new Runnable() {
         private boolean c;

         @Override
         public void run() {
            if (!this.c) {
               this.c = true;
               fco.a($$0.c.a, fji.this.be.threadId());
            }
         }
      });
      hdu.a.b(hdq.A);

      try {
         this.S.a(this.ak, ab.b().g() ? fcv.a : fcv.b);
      } catch (IOException var13) {
         G.error("Couldn't set icon", var13);
      }

      this.o = new fjj(this);
      this.o.a(this.S.h());
      this.p = new fjh(this);
      this.p.a(this.S.h());
      RenderSystem.initRenderer(this.n.t, false);
      this.aq = new fcj(this.S.k(), this.S.l());
      this.aq.a(0.0F, 0.0F, 0.0F, 0.0F);
      this.aq.f();
      this.aj = new auy(ato.a);
      this.am.a();
      this.n.b(this.am);
      this.an = new gzm(this.n.ab, $$0x -> {
         if (this.t != null) {
            this.t.j.C();
         }
      });
      this.aj.a(this.an);
      this.O = new gye(this.aj);
      this.aj.a(this.O);
      this.P = new giy(this.O, this::a);
      this.aj.a(this.P);
      this.aC = new gzf(this.O, $$1.toPath().resolve("skins"), this.az, this);
      this.af = new etq($$2.resolve("saves"), $$2.resolve("backups"), this.bz, this.Q);
      this.by = new fiv($$2);
      this.as = new hdf(this.n);
      this.aj.a(this.as);
      this.av = new gzg(this.Y);
      this.aj.a(this.av);
      this.at = new hda(this);
      this.au = new fnx(this.O);
      this.h = this.au.a();
      this.i = this.au.b();
      this.aj.a(this.au);
      this.g();
      this.aj.a(new gyx());
      this.aj.a(new gyw());
      this.S.a("Startup");
      RenderSystem.setupDefaultState(0, 0, this.S.k(), this.S.l());
      this.S.a("Post startup");
      this.ao = fkk.a();
      this.ap = fko.a(this.ao);
      this.aD = new has(this.O, this.ao, this.n.D().c());
      this.aj.a(this.aD);
      this.aO = new gbi();
      this.aj.a(this.aO);
      this.aF = new hak();
      this.aj.a(this.aF);
      this.aP = new gkr(this.h, this.aO, this::ap, this::as, this::aq);
      this.aj.a(this.aP);
      gho $$8 = new gho(this.aP, this.aO);
      this.aj.a($$8);
      this.W = new gpi(this.aD, this.ap, $$8);
      this.aj.a(this.W);
      this.aI = new gzb(this.O);
      this.aJ = new gza(this.O);
      this.aj.a(this.aJ);
      this.X = new gig(this.aJ, this.aI);

      try {
         int $$9 = Runtime.getRuntime().availableProcessors();
         fed.a();
         this.U = new gip($$9);
      } catch (OutOfMemoryError var12) {
         TinyFileDialogs.tinyfd_messageBox(
            "Minecraft",
            "Oh no! The game was unable to allocate memory off-heap while trying to start. You may try to free some memory by closing other applications on your computer, check that your system meets the minimum requirements, and try again. If the problem persists, please visit: "
               + ayg.k,
            "ok",
            "error",
            true
         );
         throw new fwz("Unable to allocate render buffers", var12);
      }

      this.aN = new fvp(this, this.aA);
      this.aE = new gjk(this.aD.b(), $$8, this.ao);
      this.aj.a(this.aE);
      this.V = new goi(this, this.O, this.W, this.X, this.aE, this.h, this.n, this.aO, this.aF);
      this.aj.a(this.V);
      this.g = new gfr(this.s, this.O);
      this.aj.a(this.g);
      this.aG = new gzd(this.O);
      this.aj.a(this.aG);
      this.aH = new gzc(this.O);
      this.aj.a(this.aH);
      this.aK = new fkv(this.O);
      this.aj.a(this.aK);
      this.j = new ghx(this, this.V.d(), this.aj, this.U);
      this.f = new gid(this, this.V, this.aP, this.U);
      this.aj.a(this.f);
      this.aj.a(this.f.z());
      this.aw = new ghy();
      this.aj.a(this.aw);
      this.aj.a(this.ax);
      this.m = new fkt(this);
      this.l = new gmh(this);
      fer $$11 = fer.a(this);
      this.aS = new fgf($$11);
      RenderSystem.setErrorCallback(this::a);
      if (this.aq.c != this.S.k() || this.aq.d != this.S.l()) {
         StringBuilder $$12 = new StringBuilder(
            "Recovering from unsupported resolution ("
               + this.S.k()
               + "x"
               + this.S.l()
               + ").\nPlease make sure you have up-to-date drivers (see aka.ms/mcdriver for instructions)."
         );
         if (fct.b()) {
            $$12.append("\n\nReported GL debug messages:\n").append(String.join("\n", fct.a()));
         }

         this.S.a(this.aq.c, this.aq.d);
         TinyFileDialogs.tinyfd_messageBox("Minecraft", $$12.toString(), "ok", "error", false);
      } else if (this.n.ac().c() && !this.S.i()) {
         this.S.g();
         this.n.ac().a(this.S.i());
      }

      this.S.a(this.n.P().c());
      this.S.b(this.n.H().c());
      this.S.d();
      this.a();
      this.j.a(this.ak.d());
      this.aQ = new hdj(this, this.aA, this.Y);
      this.aR = gcu.a(this.aA, this.Y, $$2);
      this.bv = new fiz(this);
      this.bv.a(this.n.au().c() != fjk.a);
      this.bw = new gdb(this);
      this.bw.a(this.n.B().c());
      this.bx = gdq.a(gdn.a(), this.aA);
      fqq.a(this);
      this.a((fra)(new fql(xi.c("gui.loadingMinecraft"))));
      List<atm> $$13 = this.am.h();
      this.br.a(fjq.b.a, $$13);
      auw $$14 = this.aj.a(ae.g().a("resourceLoad"), this, J, $$13);
      hdu.a.a(hdq.C);
      fji.b $$15 = new fji.b($$11, $$0.e);
      this.a((fqu)(new fqq(this, $$14, $$1x -> ae.a($$1x, $$1xx -> this.a($$1xx, $$15), () -> {
            if (ab.aV) {
               this.bk();
            }

            this.br.a();
            this.a($$15);
         }), false)));
      this.aT = ghl.a($$0.e.b());
      this.bj = new fcs(this.n, this);
      if (TracyClient.isAvailable() && $$0.d.f) {
         this.ar = new fbr();
      } else {
         this.ar = null;
      }
   }

   private void a(@Nullable fji.b $$0) {
      if (!this.bA) {
         this.bA = true;
         this.b($$0);
      }
   }

   private void b(@Nullable fji.b $$0) {
      Runnable $$1 = this.c($$0);
      hdu.a.b(hdq.C);
      hdu.a.b(hdq.z);
      hdu.a.a(this.aQ.a());
      $$1.run();
   }

   public boolean c() {
      return this.bA;
   }

   private Runnable c(@Nullable fji.b $$0) {
      List<Function<Runnable, fra>> $$1 = new ArrayList<>();
      this.a($$1);
      Runnable $$2 = () -> {
         if ($$0 != null && $$0.b().a()) {
            ghk.a(this, $$0.b(), $$0.a());
         } else {
            this.a((fra)(new frc(true)));
         }
      };

      for (Function<Runnable, fra> $$3 : Lists.reverse($$1)) {
         fra $$4 = $$3.apply($$2);
         $$2 = () -> this.a($$4);
      }

      return $$2;
   }

   private void a(List<Function<Runnable, fra>> $$0) {
      if (this.n.ac) {
         $$0.add($$0x -> new fps(this.n, $$0x));
      }

      BanDetails $$1 = this.H();
      if ($$1 != null) {
         $$0.add($$1x -> fpv.a($$1xx -> {
               if ($$1xx) {
                  ae.m().a(ayg.n);
               }

               $$1x.run();
            }, $$1));
      }

      ProfileResult $$2 = this.N.join();
      if ($$2 != null) {
         GameProfile $$3 = $$2.profile();
         Set<ProfileActionType> $$4 = $$2.actions();
         if ($$4.contains(ProfileActionType.FORCED_NAME_CHANGE)) {
            $$0.add($$1x -> fpv.a($$3.getName(), $$1x));
         }

         if ($$4.contains(ProfileActionType.USING_BANNED_SKIN)) {
            $$0.add(fpv::a);
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
      gcj $$1 = this.L();
      if ($$1 != null && $$1.k().i()) {
         $$0.append(" - ");
         gcw $$2 = this.S();
         if (this.aU != null && !this.aU.r()) {
            $$0.append(gzk.a("title.singleplayer"));
         } else if ($$2 != null && $$2.e()) {
            $$0.append(gzk.a("title.multiplayer.realms"));
         } else if (this.aU == null && ($$2 == null || !$$2.d())) {
            $$0.append(gzk.a("title.multiplayer.other"));
         } else {
            $$0.append(gzk.a("title.multiplayer.lan"));
         }
      }

      return $$0.toString();
   }

   private UserApiService a(YggdrasilAuthenticationService $$0, fwy $$1) {
      return $$1.a.a.g() != fjv.a.c ? UserApiService.OFFLINE : $$0.createUserApiService($$1.a.a.d());
   }

   public static azj e() {
      return azj.a("vanilla", ClientBrandRetriever::getClientModName, "Client", fji.class);
   }

   private void a(Throwable $$0, @Nullable fji.b $$1) {
      if (this.am.e().size() > 1) {
         this.a($$0, null, $$1);
      } else {
         ae.a($$0);
      }
   }

   public void a(Throwable $$0, @Nullable xi $$1, @Nullable fji.b $$2) {
      G.info("Caught error loading resourcepacks, removing all selected resourcepacks", $$0);
      this.br.a($$0);
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

      this.a((fra)(new frc()));
      this.a(null);
   }

   private void a(@Nullable xi $$0) {
      fns $$1 = this.aA();
      fnq.b($$1, fnq.a.c, xi.c("resourcePack.load_fail"), $$0);
   }

   public void a(Exception $$0) {
      if (!this.am.b()) {
         if (this.am.e().size() <= 1) {
            G.error(LogUtils.FATAL_MARKER, $$0.getMessage(), $$0);
            this.c(new o($$0.getMessage(), $$0));
         } else {
            this.a_(this::bi);
         }
      } else {
         this.a($$0, xi.c("resourcePack.runtime_failure"), null);
      }
   }

   public void f() {
      this.be = Thread.currentThread();
      if (Runtime.getRuntime().availableProcessors() > 4) {
         this.be.setPriority(10);
      }

      DiscontinuousFrame $$0 = TracyClient.createDiscontinuousFrame("Client Tick");

      try {
         boolean $$1 = false;

         while (this.bf) {
            this.bj();

            try {
               boq $$2 = boq.a("Renderer");
               boolean $$3 = this.aQ().e();

               try (bom.a $$4 = bom.a(this.a($$3, $$2))) {
                  this.bq.c();
                  $$0.start();
                  this.c(!$$1);
                  $$0.end();
                  this.bq.d();
               }

               this.b($$3, $$2);
            } catch (OutOfMemoryError var10) {
               if ($$1) {
                  throw var10;
               }

               this.bl();
               this.a((fra)(new fqt()));
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
      this.n.P().a(false);
      this.n.ay();
   }

   public fcl h() {
      return this.aq;
   }

   public String i() {
      return this.ac;
   }

   public String j() {
      return this.ad;
   }

   public void a(o $$0) {
      this.bg = () -> this.d($$0);
   }

   public void b(o $$0) {
      this.bg = () -> $$0;
   }

   private void bj() {
      if (this.bg != null) {
         a(this, this.q, this.bg.get());
      }
   }

   public void c(o $$0) {
      o $$1 = this.d($$0);
      this.bl();
      a(this, this.q, $$1);
   }

   public static int a(File $$0, o $$1) {
      Path $$2 = $$0.toPath().resolve("crash-reports");
      Path $$3 = $$2.resolve("crash-" + ae.f() + "-client.txt");
      alk.a($$1.a(y.a));
      if ($$1.e() != null) {
         alk.a("#@!@# Game crashed! Crash report saved to: #@!@# " + $$1.e().toAbsolutePath());
         return -1;
      } else if ($$1.a($$3, y.a)) {
         alk.a("#@!@# Game crashed! Crash report saved to: #@!@# " + $$3.toAbsolutePath());
         return -1;
      } else {
         alk.a("#@?@# Game crashed! Crash report could not be saved. #@?@#");
         return -2;
      }
   }

   public static void a(@Nullable fji $$0, File $$1, o $$2) {
      int $$3 = a($$1, $$2);
      if ($$0 != null) {
         $$0.as.h();
      }

      System.exit($$3);
   }

   public boolean k() {
      return this.n.R().c();
   }

   public CompletableFuture<Void> l() {
      return this.a(false, null);
   }

   private CompletableFuture<Void> a(boolean $$0, @Nullable fji.b $$1) {
      if (this.bm != null) {
         return this.bm;
      } else {
         CompletableFuture<Void> $$2 = new CompletableFuture<>();
         if (!$$0 && this.bc instanceof fqq) {
            this.bm = $$2;
            return $$2;
         } else {
            this.am.a();
            List<atm> $$3 = this.am.h();
            if (!$$0) {
               this.br.a(fjq.b.b, $$3);
            }

            this.a((fqu)(new fqq(this, this.aj.a(ae.g().a("resourceLoad"), this, J, $$3), $$3x -> ae.a($$3x, $$2xx -> {
                  if ($$0) {
                     this.al.c();
                     this.bi();
                  } else {
                     this.a($$2xx, $$1);
                  }
               }, () -> {
                  this.f.e();
                  this.br.a();
                  this.al.d();
                  $$2.complete(null);
                  this.a($$1);
               }), !$$0)));
            return $$2;
         }
      }
   }

   private void bk() {
      boolean $$0 = false;
      gjj $$1 = this.ap().a();
      haf $$2 = $$1.a().a();

      for (die $$3 : ly.e) {
         UnmodifiableIterator $$7 = $$3.l().a().iterator();

         while ($$7.hasNext()) {
            dvj $$4 = (dvj)$$7.next();
            if ($$4.o() == dok.c) {
               haf $$5 = $$1.b($$4);
               if ($$5 == $$2) {
                  G.debug("Missing model for: {}", $$4);
                  $$0 = true;
               }
            }
         }
      }

      gyd $$6 = $$2.e();

      for (die $$7 : ly.e) {
         UnmodifiableIterator var15 = $$7.l().a().iterator();

         while (var15.hasNext()) {
            dvj $$8 = (dvj)var15.next();
            gyd $$9 = $$1.a($$8);
            if (!$$8.l() && $$9 == $$6) {
               G.debug("Missing particle icon for: {}", $$8);
            }
         }
      }

      ly.g.c().forEach($$0x -> {
         cvx $$1x = (cvx)$$0x.a();
         String $$2x = $$1x.m();
         String $$3x = xi.c($$2x).getString();
         if ($$3x.toLowerCase(Locale.ROOT).equals($$1x.m())) {
            G.debug("Missing translation for: {} {} {}", new Object[]{$$0x.h().a(), $$2x, $$1x});
         }
      });
      $$0 |= fqr.a();
      $$0 |= gol.a();
      if ($$0) {
         throw new IllegalStateException("Your game data is foobar, fix the errors above!");
      }
   }

   public etq m() {
      return this.af;
   }

   private void a(String $$0) {
      fji.a $$1 = this.J();
      if (!$$1.a(this.T())) {
         if (this.m.b()) {
            this.m.b(false);
            this.a((fra)(new fpx($$0x -> {
               if ($$0x) {
                  ae.m().a(ayg.g);
               }

               this.a(null);
            }, fji.a.e, ayg.g, true)));
         } else {
            xi $$2 = $$1.a();
            this.m.a($$2, false);
            this.bv.c($$2);
            this.m.b($$1 == fji.a.d);
         }
      } else {
         this.a((fra)(new fpw($$0)));
      }
   }

   public void a(@Nullable fra $$0) {
      if (ab.aV && Thread.currentThread() != this.be) {
         G.error("setScreen called from non-game thread");
      }

      if (this.z != null) {
         this.z.j();
      } else {
         this.a(fjf.a);
      }

      if ($$0 == null && this.bd) {
         throw new IllegalStateException("Trying to return to in-game GUI during disconnection");
      } else {
         if ($$0 == null && this.s == null) {
            $$0 = new frc();
         } else if ($$0 == null && this.t.eH()) {
            if (this.t.m()) {
               $$0 = new fqe(null, this.s.j().l());
            } else {
               this.t.gi();
            }
         }

         this.z = $$0;
         if (this.z != null) {
            this.z.aJ_();
         }

         fdx.a();
         if ($$0 != null) {
            this.o.j();
            fjg.b();
            $$0.b(this, this.S.o(), this.S.p());
            this.y = false;
         } else {
            this.as.i();
            this.o.i();
         }

         this.d();
      }
   }

   public void a(@Nullable fqu $$0) {
      this.bc = $$0;
   }

   public void n() {
      try {
         G.info("Stopping!");

         try {
            this.bv.c();
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
         ae.c = System::nanoTime;
         if (this.bg == null) {
            System.exit(0);
         }
      }
   }

   @Override
   public void close() {
      if (this.bu != null) {
         this.bu.a();
      }

      try {
         this.aQ.close();
         this.ax.close();
         this.aD.close();
         this.au.close();
         this.j.close();
         this.P.close();
         this.f.close();
         this.as.g();
         this.g.a();
         this.aH.close();
         this.aG.close();
         this.aJ.close();
         this.aK.close();
         this.aI.close();
         this.O.close();
         this.aj.close();
         if (this.ar != null) {
            this.ar.close();
         }

         foj.b();
         ae.j();
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

      if (this.bm != null && !(this.bc instanceof fqq)) {
         CompletableFuture<Void> $$1 = this.bm;
         this.bm = null;
         this.l().thenRun(() -> $$1.complete(null));
      }

      Runnable $$2;
      while (($$2 = this.bl.poll()) != null) {
         $$2.run();
      }

      int $$3 = this.T.a(ae.c(), $$0);
      bon $$4 = bom.a();
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
      this.aL.a();
      $$4.b("render");
      long $$6 = ae.d();
      boolean $$8;
      if (!this.aQ().d() && !this.bq.e()) {
         $$8 = false;
         this.bt = 0.0;
      } else {
         $$8 = this.bu == null || this.bu.b();
         if ($$8) {
            fdu.a().ifPresent(fdu::b);
         }
      }

      RenderSystem.clear(16640);
      this.aq.a(true);
      RenderSystem.setShaderFog(ghv.a);
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
      this.aq.c(this.S.k(), this.S.l());
      this.bi = ae.d() - $$6;
      if ($$8) {
         fdu.a().ifPresent($$0x -> this.bu = $$0x.c());
      }

      $$4.b("updateDisplay");
      if (this.ar != null) {
         this.ar.a();
         this.ar.a(this.aq);
      }

      this.S.a(this.ar);
      int $$9 = this.bj.a();
      if ($$9 < 260) {
         RenderSystem.limitDisplayFPS($$9);
      }

      $$4.b("yield");
      Thread.yield();
      $$4.c();
      this.S.a("Post render");
      this.bb++;
      this.aY = this.U() && (this.z != null && this.z.k() || this.bc != null && this.bc.a()) && !this.aU.r();
      this.T.b(this.aY);
      this.T.c(!this.bq());
      long $$10 = ae.d();
      long $$11 = $$10 - this.aZ;
      if ($$8) {
         this.bs = $$11;
      }

      this.aQ().a($$11);
      this.aZ = $$10;
      $$4.a("fpsUpdate");
      if (this.bu != null && this.bu.b()) {
         this.bt = (double)this.bu.c() * 100.0 / (double)this.bs;
      }

      while (ae.c() >= this.ba + 1000L) {
         String $$12;
         if (this.bt > 0.0) {
            $$12 = " GPU: " + (this.bt > 100.0 ? n.m + "100%" : Math.round(this.bt) + "%");
         } else {
            $$12 = "";
         }

         bh = this.bb;
         this.A = String.format(
            Locale.ROOT,
            "%d fps T: %s%s%s%s B: %d%s",
            bh,
            $$9 == 260 ? "inf" : $$9,
            this.n.P().c() ? " vsync " : " ",
            this.n.k().c(),
            this.n.j().c() == fiu.a ? "" : (this.n.j().c() == fiu.b ? " fast-clouds" : " fancy-clouds"),
            this.n.F().c(),
            $$12
         );
         this.ba += 1000L;
         this.bb = 0;
      }

      $$4.c();
   }

   private bon a(boolean $$0, @Nullable boq $$1) {
      if (!$$0) {
         this.bp.b();
         if (!this.bq.e() && $$1 == null) {
            return boj.a;
         }
      }

      bon $$2;
      if ($$0) {
         if (!this.bp.a()) {
            this.bo = 0;
            this.bp.c();
         }

         this.bo++;
         $$2 = this.bp.d();
      } else {
         $$2 = boj.a;
      }

      if (this.bq.e()) {
         $$2 = bon.a($$2, this.bq.f());
      }

      return boq.a($$2, $$1);
   }

   private void b(boolean $$0, @Nullable boq $$1) {
      if ($$1 != null) {
         $$1.b();
      }

      fna $$2 = this.aQ().o();
      if ($$0) {
         $$2.a(this.bp.e());
      } else {
         $$2.a(null);
      }
   }

   @Override
   public void a() {
      int $$0 = this.S.a(this.n.as().c(), this.k());
      this.S.a((double)$$0);
      if (this.z != null) {
         this.z.a(this, this.S.o(), this.S.p());
      }

      fcl $$1 = this.h();
      $$1.a(this.S.k(), this.S.l());
      this.j.a(this.S.k(), this.S.l());
      this.o.g();
   }

   @Override
   public void b() {
      this.o.k();
   }

   public int o() {
      return bh;
   }

   public long p() {
      return this.bi;
   }

   private void bl() {
      try {
         azi.b();
      } catch (Throwable var3) {
      }

      try {
         System.gc();
         if (this.aW && this.aU != null) {
            this.aU.a(true);
         }

         this.b(new fql(xi.c("menu.savingLevel")));
      } catch (Throwable var2) {
      }

      System.gc();
   }

   public boolean b(Consumer<xi> $$0) {
      if (this.bq.e()) {
         this.bm();
         return false;
      } else {
         Consumer<bol> $$1 = $$1x -> {
            if ($$1x != boh.a) {
               int $$2x = $$1x.f();
               double $$3x = (double)$$1x.g() / (double)bal.a;
               this.execute(
                  () -> $$0.accept(
                        xi.a("commands.debug.stopped", String.format(Locale.ROOT, "%.2f", $$3x), $$2x, String.format(Locale.ROOT, "%.2f", (double)$$2x / $$3x))
                     )
               );
            }
         };
         Consumer<Path> $$2 = $$1x -> {
            xi $$2x = xi.b($$1x.toString()).a(n.t).a($$1xx -> $$1xx.a(new xg(xg.a.b, $$1x.toFile().getParent())));
            this.execute(() -> $$0.accept(xi.a("debug.profiling.stop", $$2x)));
         };
         ac $$3 = a(new ac(), this, this.an, this.ac, this.n);
         Consumer<List<Path>> $$4 = $$2x -> {
            Path $$3x = this.a($$3, $$2x);
            $$2.accept($$3x);
         };
         Consumer<Path> $$5;
         if (this.aU == null) {
            $$5 = $$1x -> $$4.accept(ImmutableList.of($$1x));
         } else {
            this.aU.b($$3);
            CompletableFuture<Path> $$6 = new CompletableFuture<>();
            CompletableFuture<Path> $$7 = new CompletableFuture<>();
            CompletableFuture.allOf($$6, $$7).thenRunAsync(() -> $$4.accept(ImmutableList.of($$6.join(), $$7.join())), ae.h());
            this.aU.a($$0x -> {
            }, $$7::complete);
            $$5 = $$6::complete;
         }

         this.bq = bqb.a(new ghi(ae.c, this.f), ae.c, ae.h(), new bqh("client"), $$1x -> {
            this.bq = bqc.a;
            $$1.accept($$1x);
         }, $$5);
         return true;
      }
   }

   private void bm() {
      this.bq.a();
      if (this.aU != null) {
         this.aU.aV();
      }
   }

   private void bn() {
      this.bq.b();
      if (this.aU != null) {
         this.aU.aW();
      }
   }

   private Path a(ac $$0, List<Path> $$1) {
      String $$2;
      if (this.T()) {
         $$2 = this.V().aZ().e();
      } else {
         gcw $$3 = this.S();
         $$2 = $$3 != null ? $$3.a : "unknown";
      }

      Path $$7;
      try {
         String $$5 = String.format(Locale.ROOT, "%s-%s-%s", ae.f(), $$2, ab.b().b());
         String $$6 = v.a(bqh.a, $$5, ".zip");
         $$7 = bqh.a.resolve($$6);
      } catch (IOException var21) {
         throw new UncheckedIOException(var21);
      }

      try (ayv $$10 = new ayv($$7)) {
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
      this.bf = false;
   }

   public boolean r() {
      return this.bf;
   }

   public void b(boolean $$0) {
      if (this.z == null) {
         boolean $$1 = this.U() && !this.aU.r();
         if ($$1) {
            this.a((fra)(new fqv(!$$0)));
            this.as.e();
         } else {
            this.a((fra)(new fqv(true)));
         }
      }
   }

   private void d(boolean $$0) {
      if (!$$0) {
         this.x = 0;
      }

      if (this.x <= 0 && !this.t.fB()) {
         if ($$0 && this.w != null && this.w.d() == ezl.a.b) {
            ezj $$1 = (ezj)this.w;
            jh $$2 = $$1.b();
            if (!this.s.a_($$2).l()) {
               jm $$3 = $$1.c();
               if (this.r.b($$2, $$3)) {
                  this.g.a($$2, $$3);
                  this.t.a(bsc.a);
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
         cwb $$0 = this.t.b(bsc.a);
         if (!$$0.a(this.s.J())) {
            return false;
         } else {
            boolean $$1 = false;
            switch (this.w.d()) {
               case c:
                  this.r.a(this.t, ((ezk)this.w).a());
                  break;
               case b:
                  ezj $$2 = (ezj)this.w;
                  jh $$3 = $$2.b();
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

            this.t.a(bsc.a);
            return $$1;
         }
      }
   }

   private void bp() {
      if (!this.r.k()) {
         this.aX = 4;
         if (!this.t.C()) {
            if (this.w == null) {
               G.warn("Null returned as 'hitResult', this shouldn't happen!");
            }

            for (bsc $$0 : bsc.values()) {
               cwb $$1 = this.t.b($$0);
               if (!$$1.a(this.s.J())) {
                  return;
               }

               if (this.w != null) {
                  switch (this.w.d()) {
                     case c:
                        ezk $$2 = (ezk)this.w;
                        bue $$3 = $$2.a();
                        if (!this.s.C_().a($$3.dx())) {
                           return;
                        }

                        bsd $$4 = this.r.a(this.t, $$3, $$2, $$0);
                        if (!$$4.a()) {
                           $$4 = this.r.a(this.t, $$3, $$0);
                        }

                        if ($$4 instanceof bsd.d $$5) {
                           if ($$5.e() == bsd.e.b) {
                              this.t.a($$0);
                           }

                           return;
                        }
                        break;
                     case b:
                        ezj $$6 = (ezj)this.w;
                        int $$7 = $$1.L();
                        bsd $$8 = this.r.a(this.t, $$0, $$6);
                        if ($$8 instanceof bsd.d $$9) {
                           if ($$9.e() == bsd.e.b) {
                              this.t.a($$0);
                              if (!$$1.f() && ($$1.L() != $$7 || this.r.f())) {
                                 this.j.c.a($$0);
                              }
                           }

                           return;
                        }

                        if ($$8 instanceof bsd.a) {
                           return;
                        }
                  }
               }

               if (!$$1.f() && this.r.a(this.t, $$0) instanceof bsd.d $$11) {
                  if ($$11.e() == bsd.e.b) {
                     this.t.a($$0);
                  }

                  this.j.c.a($$0);
                  return;
               }
            }
         }
      }
   }

   public hda s() {
      return this.at;
   }

   public void t() {
      this.bC++;
      if (this.s != null && !this.aY) {
         this.s.s().m();
      }

      if (this.aX > 0) {
         this.aX--;
      }

      bon $$0 = bom.a();
      $$0.a("gui");
      this.bw.a();
      this.m.a(this.aY);
      $$0.c();
      this.j.a(1.0F);
      this.aM.a(this.s, this.w);
      $$0.a("gameMode");
      if (!this.aY && this.s != null) {
         this.r.c();
      }

      $$0.b("textures");
      if (this.bq()) {
         this.O.f();
      }

      if (this.z != null || this.t == null) {
         if (this.z instanceof fqn $$1 && !this.t.fT()) {
            $$1.m();
         }
      } else if (this.t.eH() && !(this.z instanceof fqe)) {
         this.a(null);
      } else if (this.t.fT() && this.s != null) {
         this.a((fra)(new fqn()));
      }

      if (this.z != null) {
         this.x = 10000;
      }

      if (this.z != null) {
         fra.a(() -> this.z.e(), "Ticking screen", this.z.getClass().getCanonicalName());
      }

      if (!this.aQ().d()) {
         this.m.l();
      }

      if (this.bc == null && this.z == null) {
         $$0.b("Keybindings");
         this.bs();
         if (this.x > 0) {
            this.x--;
         }
      }

      if (this.s != null) {
         $$0.b("gameRenderer");
         if (!this.aY) {
            this.j.e();
         }

         $$0.b("levelRenderer");
         if (!this.aY) {
            this.f.n();
         }

         $$0.b("level");
         if (!this.aY) {
            this.s.e();
         }
      } else if (this.j.f() != null) {
         this.j.b();
      }

      if (!this.aY) {
         this.at.a();
      }

      this.as.a(this.aY);
      if (this.s != null) {
         if (!this.aY) {
            if (!this.n.s && this.br()) {
               xi $$2 = xi.c("tutorial.socialInteractions.title");
               xi $$3 = xi.a("tutorial.socialInteractions.description", heh.a("socialInteractions"));
               this.bn = new fnt(fnt.a.f, $$2, $$3, true, 8000);
               this.aL.a(this.bn);
               this.n.s = true;
               this.n.ay();
            }

            this.aM.d();

            try {
               this.s.a(() -> true);
            } catch (Throwable var5) {
               o $$5 = o.a(var5, "Exception in world tick");
               if (this.s == null) {
                  p $$6 = $$5.a("Affected level");
                  $$6.a("Problem", "Level is null!");
               } else {
                  this.s.a($$5);
               }

               throw new z($$5);
            }
         }

         $$0.b("animateTick");
         if (!this.aY && this.bq()) {
            this.s.b(this.t.dB(), this.t.dD(), this.t.dH());
         }

         $$0.b("particles");
         if (!this.aY && this.bq()) {
            this.g.b();
         }

         gcj $$7 = this.L();
         if ($$7 != null && !this.aY) {
            $$7.b(ahh.a);
         }
      } else if (this.aV != null) {
         $$0.b("pendingConnection");
         this.aV.b();
      }

      $$0.b("keyboard");
      this.p.b();
      $$0.c();
   }

   private boolean bq() {
      return this.s == null || this.s.s().i();
   }

   private boolean br() {
      return !this.aW || this.aU != null && this.aU.r();
   }

   private void bs() {
      while (this.n.N.g()) {
         fis $$0 = this.n.aD();
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
            if (this.t.R_()) {
               this.m.g().a($$1);
            } else if (!this.t.f() || this.z != null || !$$3 && !$$2) {
               this.t.gk().j = $$1;
            } else {
               fse.a(this, $$1, $$3, $$2);
            }
         }
      }

      while (this.n.L.g()) {
         if (!this.br()) {
            this.t.a(K, true);
            this.bv.c(K);
         } else {
            if (this.bn != null) {
               this.bn.d();
               this.bn = null;
            }

            this.a((fra)(new fvr()));
         }
      }

      while (this.n.C.g()) {
         if (this.r.g()) {
            this.t.h();
         } else {
            this.aM.a();
            this.a((fra)(new fsp(this.t)));
         }
      }

      while (this.n.R.g()) {
         this.a((fra)(new frk(this.t.j.p())));
      }

      while (this.n.D.g()) {
         if (!this.t.R_()) {
            this.L().b(new aia(aia.a.g, jh.c, jm.a));
         }
      }

      while (this.n.E.g()) {
         if (!this.t.R_() && this.t.a(fra.s())) {
            this.t.a(bsc.a);
         }
      }

      while (this.n.I.g()) {
         this.a("");
      }

      if (this.z == null && this.bc == null && this.n.K.g()) {
         this.a("/");
      }

      boolean $$4 = false;
      if (this.t.fB()) {
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

      if (this.n.F.e() && this.aX == 0 && !this.t.fB()) {
         this.bp();
      }

      this.d(this.z == null && !$$4 && this.n.G.e() && this.o.h());
   }

   public hdj u() {
      return this.aQ;
   }

   public double v() {
      return this.bt;
   }

   public gcu w() {
      return this.aR;
   }

   public fwk x() {
      return new fwk(this, this.af);
   }

   public void a(etq.c $$0, aul $$1, amh $$2, boolean $$3) {
      this.y();
      this.Z.set(null);
      Instant $$4 = Instant.now();

      try {
         $$0.a($$2.c().a(), $$2.d());
         amd $$5 = amd.a(this.ay, this.q);
         $$5.f().a(this);
         dua.a($$5, this);
         avk.a(false);
         this.aU = MinecraftServer.a((Function<Thread, hco>)($$4x -> new hco($$4x, this, $$0, $$1, $$2, $$5, $$0xx -> {
               asb $$1xx = asb.b($$0xx + 0);
               this.Z.set($$1xx);
               return asa.a($$1xx, this.bl::add);
            })));
         this.aW = true;
         this.a(gdn.a());
         this.aT.a(ghl.c.a, $$0.f(), $$2.d().e());
      } catch (Throwable var12) {
         o $$7 = o.a(var12, "Starting integrated server");
         p $$8 = $$7.a("Starting integrated server");
         $$8.a("Level ID", $$0.f());
         $$8.a("Level Name", () -> $$2.d().e());
         throw new z($$7);
      }

      while (this.Z.get() == null) {
         Thread.yield();
      }

      fqo $$9 = new fqo(this.Z.get());
      bon $$10 = bom.a();
      this.a((fra)$$9);
      $$10.a("waitForServer");

      for (; !this.aU.ai() || this.bc != null; this.bj()) {
         $$9.e();
         this.c(false);

         try {
            Thread.sleep(16L);
         } catch (InterruptedException var11) {
         }
      }

      $$10.c();
      Duration $$11 = Duration.between($$4, Instant.now());
      SocketAddress $$12 = this.aU.ah().a();
      wc $$13 = wc.a($$12);
      $$13.a($$12.toString(), 0, new gch($$13, this, null, null, $$3, $$11, $$0x -> {
      }, null));
      $$13.a(new ajn(this.X().c(), this.X().b()));
      this.aV = $$13;
   }

   public void a(gci $$0, fqy.a $$1) {
      this.e(new fqy(() -> false, $$1));
      this.s = $$0;
      this.a($$0);
      if (!this.aW) {
         amd $$2 = amd.a(this.ay, this.q);
         $$2.f().a(this);
         dua.a($$2, this);
         avk.a(false);
      }
   }

   public void y() {
      this.a(new fqx(true), false);
   }

   public void b(fra $$0) {
      this.a($$0, false);
   }

   public void a(fra $$0, boolean $$1) {
      gcj $$2 = this.L();
      if ($$2 != null) {
         this.bz();
         $$2.h();
         if (!$$1) {
            this.z();
         }
      }

      this.aN.b();
      if (this.bq.e()) {
         this.bn();
      }

      hco $$3 = this.aU;
      this.aU = null;
      this.j.h();
      this.r = null;
      this.bv.b();
      this.bd = true;

      try {
         this.e($$0);
         if (this.s != null) {
            if ($$3 != null) {
               bon $$4 = bom.a();
               $$4.a("waitForServer");

               while (!$$3.I()) {
                  this.c(false);
               }

               $$4.c();
            }

            this.m.i();
            this.aW = false;
         }

         this.s = null;
         this.a(null);
         this.t = null;
      } finally {
         this.bd = false;
      }

      dua.b();
   }

   public void z() {
      this.al.i();
      this.bA();
   }

   public void c(fra $$0) {
      gcj $$1 = this.L();
      if ($$1 != null) {
         $$1.i();
      }

      if (this.bq.e()) {
         this.bn();
      }

      this.j.h();
      this.r = null;
      this.bv.b();
      this.bd = true;

      try {
         this.e($$0);
         this.m.i();
         this.s = null;
         this.a(null);
         this.t = null;
      } finally {
         this.bd = false;
      }

      dua.b();
   }

   private void e(fra $$0) {
      bon $$1 = bom.a();
      $$1.a("forcedTick");
      this.as.f();
      this.u = null;
      this.aV = null;
      this.a($$0);
      this.c(false);
      $$1.c();
   }

   public void d(fra $$0) {
      try (bos $$1 = bom.a().d("forcedTick")) {
         this.a($$0);
         this.c(false);
      }
   }

   private void a(@Nullable gci $$0) {
      this.f.a($$0);
      this.g.a($$0);
      this.aP.a($$0);
      this.d();
   }

   private UserProperties bt() {
      return this.aB.join();
   }

   public boolean C() {
      return this.D() && this.n.ak().c();
   }

   public boolean D() {
      return this.E() && this.bt().flag(UserFlag.OPTIONAL_TELEMETRY_AVAILABLE);
   }

   public boolean E() {
      return ab.aV ? false : this.bt().flag(UserFlag.TELEMETRY_ENABLED);
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
      return this.J().a(false) ? this.aN.c($$0) : (this.t == null || !$$0.equals(this.t.cH())) && !$$0.equals(ae.e);
   }

   public fji.a J() {
      if (this.n.n().c() == coj.c) {
         return fji.a.b;
      } else if (!this.ai) {
         return fji.a.c;
      } else {
         return !this.bt().flag(UserFlag.CHAT_ALLOWED) ? fji.a.d : fji.a.a;
      }
   }

   public final boolean K() {
      return this.ag;
   }

   @Nullable
   public gcj L() {
      return this.t == null ? null : this.t.j;
   }

   public static boolean M() {
      return !F.n.X;
   }

   public static boolean N() {
      return F.n.k().c().b() >= fja.b.b();
   }

   public static boolean O() {
      return !F.j.a() && F.n.k().c().b() >= fja.c.b();
   }

   public static boolean P() {
      return F.n.l().c();
   }

   private void bu() {
      if (this.w != null && this.w.d() != ezl.a.a) {
         boolean $$0 = this.t.gl().d;
         dsm $$1 = null;
         ezl.a $$2 = this.w.d();
         cwb $$6;
         if ($$2 == ezl.a.b) {
            jh $$3 = ((ezj)this.w).b();
            dvj $$4 = this.s.a_($$3);
            if ($$4.l()) {
               return;
            }

            die $$5 = $$4.b();
            $$6 = $$5.a((dfe)this.s, $$3, $$4);
            if ($$6.f()) {
               return;
            }

            if ($$0 && fra.s() && $$4.x()) {
               $$1 = this.s.c_($$3);
            }
         } else {
            if ($$2 != ezl.a.c || !$$0) {
               return;
            }

            bue $$7 = ((ezk)this.w).a();
            $$6 = $$7.dK();
            if ($$6 == null) {
               return;
            }
         }

         if ($$6.f()) {
            String $$10 = "";
            if ($$2 == ezl.a.b) {
               $$10 = ly.e.b(this.s.a_(((ezj)this.w).b()).b()).toString();
            } else if ($$2 == ezl.a.c) {
               $$10 = ly.f.b(((ezk)this.w).a().ar()).toString();
            }

            G.warn("Picking on: [{}] {} gave null item", $$2, $$10);
         } else {
            col $$11 = this.t.gk();
            if ($$1 != null) {
               this.a($$6, $$1, this.s.H_());
            }

            int $$12 = $$11.c($$6);
            if ($$0) {
               $$11.b($$6);
               this.r.a(this.t.b(bsc.a), 36 + $$11.j);
            } else if ($$12 != -1) {
               if (col.d($$12)) {
                  $$11.j = $$12;
               } else {
                  this.r.a($$12);
               }
            }
         }
      }
   }

   private void a(cwb $$0, dsm $$1, ke $$2) {
      uk $$3 = $$1.f($$2);
      $$1.a($$3);
      cuh.a($$0, $$1.q(), $$3);
      $$0.b($$1.r());
   }

   public o d(o $$0) {
      ac $$1 = $$0.f();
      a($$1, this, this.an, this.ac, this.n);
      this.a($$0.a("Uptime"));
      if (this.s != null) {
         this.s.a($$0);
      }

      if (this.aU != null) {
         this.aU.b($$1);
      }

      this.br.a($$0);
      return $$0;
   }

   public static void a(@Nullable fji $$0, @Nullable gzm $$1, String $$2, @Nullable fjm $$3, o $$4) {
      ac $$5 = $$4.f();
      a($$5, $$0, $$1, $$2, $$3);
   }

   private static String a(double $$0) {
      return String.format(Locale.ROOT, "%.3fs", $$0);
   }

   private void a(p $$0) {
      $$0.a("JVM uptime", () -> a((double)ManagementFactory.getRuntimeMXBean().getUptime() / 1000.0));
      $$0.a("Wall uptime", () -> a((double)(System.currentTimeMillis() - this.bB) / 1000.0));
      $$0.a("High-res time", () -> a((double)ae.c() / 1000.0));
      $$0.a("Client ticks", () -> String.format(Locale.ROOT, "%d ticks / %.3fs", this.bC, (double)this.bC / 20.0));
   }

   private static ac a(ac $$0, @Nullable fji $$1, @Nullable gzm $$2, String $$3, @Nullable fjm $$4) {
      $$0.a("Launched Version", () -> $$3);
      String $$5 = bg();
      if ($$5 != null) {
         $$0.a("Launcher name", $$5);
      }

      $$0.a("Backend library", RenderSystem::getBackendDescription);
      $$0.a("Backend API", RenderSystem::getApiDescription);
      $$0.a("Window size", () -> $$1 != null ? $$1.S.k() + "x" + $$1.S.l() : "<not initialized>");
      $$0.a("GFLW Platform", fde::a);
      $$0.a("GL Caps", RenderSystem::getCapsString);
      $$0.a("GL debug messages", () -> fct.b() ? String.join("\n", fct.a()) : "<disabled>");
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
         $$0.a("Resource Packs", () -> aul.a($$1.ad().g()));
      }

      if ($$2 != null) {
         $$0.a("Current Language", () -> $$2.a());
      }

      $$0.a("Locale", String.valueOf(Locale.getDefault()));
      $$0.a("System encoding", () -> System.getProperty("sun.jnu.encoding", "<not set>"));
      $$0.a("File encoding", () -> System.getProperty("file.encoding", "<not set>"));
      $$0.a("CPU", fcu::b);
      return $$0;
   }

   public static fji Q() {
      return F;
   }

   public CompletableFuture<Void> R() {
      return this.a(this::l).thenCompose($$0 -> (CompletionStage<Void>)$$0);
   }

   public void a(gdn $$0) {
      if (!this.bx.a($$0)) {
         this.bx = gdq.a($$0, this.aA);
      }
   }

   @Nullable
   public gcw S() {
      return x.a(this.L(), gcj::x);
   }

   public boolean T() {
      return this.aW;
   }

   public boolean U() {
      return this.aW && this.aU != null;
   }

   @Nullable
   public hco V() {
      return this.aU;
   }

   public boolean W() {
      hco $$0 = this.V();
      return $$0 != null && !$$0.r();
   }

   public boolean b(UUID $$0) {
      return $$0.equals(this.X().b());
   }

   public fjv X() {
      return this.Y;
   }

   public GameProfile Y() {
      ProfileResult $$0 = this.N.join();
      return $$0 != null ? $$0.profile() : new GameProfile(this.Y.b(), this.Y.c());
   }

   public Proxy Z() {
      return this.ae;
   }

   public gye aa() {
      return this.O;
   }

   public giy ab() {
      return this.P;
   }

   public avb ac() {
      return this.aj;
   }

   public aul ad() {
      return this.am;
   }

   public atq ae() {
      return this.ak;
   }

   public hbc af() {
      return this.al;
   }

   public Path ag() {
      return this.M;
   }

   public gzm ah() {
      return this.an;
   }

   public Function<ali, gyd> a(ali $$0) {
      return this.aD.a($$0)::a;
   }

   public boolean ai() {
      return this.aY;
   }

   public ghy aj() {
      return this.aw;
   }

   public hdf ak() {
      return this.as;
   }

   public awi al() {
      awi $$0 = x.a(this.z, fra::C);
      if ($$0 != null) {
         return $$0;
      } else if (this.t != null) {
         if (this.t.dX().ag() == dfb.k) {
            return this.m.j().b() ? awj.d : awj.e;
         } else {
            jq<dgc> $$1 = this.t.dX().t(this.t.dx());
            if (!this.at.c(awj.f) && (!this.t.bp() || !$$1.a(awz.Z))) {
               return this.t.dX().ag() != dfb.j && this.t.gl().d && this.t.gl().c ? awj.b : $$1.a().o().orElse(awj.g);
            } else {
               return awj.f;
            }
         }
      } else {
         return awj.a;
      }
   }

   public MinecraftSessionService am() {
      return this.az;
   }

   public gzf an() {
      return this.aC;
   }

   @Nullable
   public bue ao() {
      return this.u;
   }

   public void a(bue $$0) {
      this.u = $$0;
      this.j.a($$0);
   }

   public boolean b(bue $$0) {
      return $$0.cp() || this.t != null && this.t.R_() && this.n.Q.e() && $$0.ar() == bul.by;
   }

   @Override
   protected Thread ay() {
      return this.be;
   }

   @Override
   public Runnable f(Runnable $$0) {
      return $$0;
   }

   @Override
   protected boolean e(Runnable $$0) {
      return true;
   }

   public gjk ap() {
      return this.aE;
   }

   public goi aq() {
      return this.V;
   }

   public gkr ar() {
      return this.aP;
   }

   public gpi as() {
      return this.W;
   }

   public gig at() {
      return this.X;
   }

   public DataFixer au() {
      return this.Q;
   }

   public fiy av() {
      return this.T;
   }

   public fkk aw() {
      return this.ao;
   }

   public boolean az() {
      return this.t != null && this.t.gA() || this.n.X().c();
   }

   public fns aA() {
      return this.aL;
   }

   public heh aB() {
      return this.aM;
   }

   public boolean aC() {
      return this.bk;
   }

   public fjd aD() {
      return this.aa;
   }

   public has aE() {
      return this.aD;
   }

   public gzd aF() {
      return this.aG;
   }

   public gzc aG() {
      return this.aH;
   }

   public gzb aH() {
      return this.aI;
   }

   public gza aI() {
      return this.aJ;
   }

   public fkv aJ() {
      return this.aK;
   }

   @Override
   public void a(boolean $$0) {
      this.bk = $$0;
   }

   public xi a(File $$0, int $$1, int $$2) {
      int $$3 = this.S.k();
      int $$4 = this.S.l();
      fcl $$5 = new fcm($$1, $$2, true);
      float $$6 = this.t.dP();
      float $$7 = this.t.dN();
      float $$8 = this.t.P;
      float $$9 = this.t.O;
      this.j.b(false);

      xw var12;
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

            this.t.O = this.t.dN();
            this.t.P = this.t.dP();
            $$5.a(true);
            this.j.a(fiy.b);

            try {
               Thread.sleep(10L);
            } catch (InterruptedException var17) {
            }

            fjr.a($$0, "panorama_" + $$10 + ".png", $$5, $$0x -> {
            });
         }

         xi $$11 = xi.b($$0.getName()).a(n.t).a($$1x -> $$1x.a(new xg(xg.a.b, $$0.getAbsolutePath())));
         return xi.a("screenshot.success", $$11);
      } catch (Exception var18) {
         G.error("Couldn't save image", var18);
         var12 = xi.a("screenshot.failure", var18.getMessage());
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

   private xi a(File $$0, int $$1, int $$2, int $$3, int $$4) {
      try {
         ByteBuffer $$5 = fcu.a($$1 * $$2 * 3);
         fjr $$6 = new fjr($$0, $$3, $$4, $$2);
         float $$7 = (float)$$3 / (float)$$1;
         float $$8 = (float)$$4 / (float)$$2;
         float $$9 = $$7 > $$8 ? $$7 : $$8;

         for (int $$10 = ($$4 - 1) / $$2 * $$2; $$10 >= 0; $$10 -= $$2) {
            for (int $$11 = 0; $$11 < $$3; $$11 += $$1) {
               RenderSystem.setShaderTexture(0, gyc.d);
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
         fcu.a($$5);
         xi $$15 = xi.b($$14.getName()).a(n.t).a($$1x -> $$1x.a(new xg(xg.a.b, $$14.getAbsolutePath())));
         return xi.a("screenshot.success", $$15);
      } catch (Exception var15) {
         G.warn("Couldn't save screenshot", var15);
         return xi.a("screenshot.failure", var15.getMessage());
      }
   }

   @Nullable
   public asb aK() {
      return this.Z.get();
   }

   public gzg aL() {
      return this.av;
   }

   @Nullable
   public fqu aM() {
      return this.bc;
   }

   public fvp aN() {
      return this.aN;
   }

   public fde aO() {
      return this.S;
   }

   public fcs aP() {
      return this.bj;
   }

   public flp aQ() {
      return this.m.k();
   }

   public gip aR() {
      return this.U;
   }

   public void a(int $$0) {
      this.aD.a($$0);
   }

   public gbi aS() {
      return this.aO;
   }

   public hak aT() {
      return this.aF;
   }

   public boolean aU() {
      return this.bt().flag(UserFlag.PROFANITY_FILTER_ENABLED);
   }

   public void aV() {
      this.aN.a();
      this.w().a();
   }

   @Nullable
   public azx aW() {
      return azx.a(this.ay.getServicesKeySet(), ServicesKeyType.PROFILE_KEY);
   }

   public boolean aX() {
      return !this.ay.getServicesKeySet().keys(ServicesKeyType.PROFILE_KEY).isEmpty();
   }

   public fjf aY() {
      return this.ab;
   }

   public void a(fjf $$0) {
      this.ab = $$0;
   }

   public fiz aZ() {
      return this.bv;
   }

   public gdb ba() {
      return this.bw;
   }

   public gdq bb() {
      return this.bx;
   }

   public fgf bc() {
      return this.aS;
   }

   public ghl bd() {
      return this.aT;
   }

   public fiv be() {
      return this.by;
   }

   public ezd bf() {
      return this.bz;
   }

   private float a(float $$0) {
      if (this.s != null) {
         bsm $$1 = this.s.s();
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
      a(xh.a) {
         @Override
         public boolean a(boolean $$0) {
            return true;
         }
      },
      b(xi.c("chat.disabled.options").a(n.m)) {
         @Override
         public boolean a(boolean $$0) {
            return false;
         }
      },
      c(xi.c("chat.disabled.launcher").a(n.m)) {
         @Override
         public boolean a(boolean $$0) {
            return $$0;
         }
      },
      d(xi.a("chat.disabled.profile", xi.d(fji.F.n.I.h())).a(n.m)) {
         @Override
         public boolean a(boolean $$0) {
            return $$0;
         }
      };

      static final xi e = xi.c("chat.disabled.profile.moreInfo");
      private final xi f;

      a(final xi $$0) {
         this.f = $$0;
      }

      public xi a() {
         return this.f;
      }

      public abstract boolean a(boolean var1);
   }

   static record b(fer a, fwy.c b) {
   }
}
