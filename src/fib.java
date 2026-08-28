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

public class fib extends bqe<Runnable> implements fbt {
   static fib F;
   private static final Logger G = LogUtils.getLogger();
   public static final boolean a = ad.m() == ad.a.d;
   private static final int H = 10;
   public static final alb b = alb.b("default");
   public static final alb c = alb.b("uniform");
   public static final alb d = alb.b("alt");
   private static final alb I = alb.b("regional_compliancies.json");
   private static final CompletableFuture<bah> J = CompletableFuture.completedFuture(bah.a);
   private static final xd K = xd.c("multiplayer.socialInteractions.not_available");
   public static final String e = "Please make sure you have up-to-date drivers (see aka.ms/mcdriver for instructions).";
   private final long L = Double.doubleToLongBits(Math.PI);
   private final Path M;
   private final CompletableFuture<ProfileResult> N;
   private final gwl O;
   private final DataFixer P;
   private final ghq Q;
   private final fbs R;
   private final fhr.b S = new fhr.b(20.0F, 0L, this::a);
   private final ghc T;
   public final ggr f;
   private final gmq U;
   private final gnq V;
   private final ggu W;
   public final geg g;
   private final fio X;
   public final fjl h;
   public final fjl i;
   public final ggl j;
   public final gkq l;
   private final AtomicReference<art> Y = new AtomicReference<>();
   public final fjm m;
   public final fif n;
   private final fhw Z;
   public final fic o;
   public final fia p;
   private fhy aa = fhy.a;
   public final File q;
   private final String ab;
   private final String ac;
   private final Proxy ad;
   private final esh ae;
   private final boolean af;
   private final boolean ag;
   private final boolean ah;
   private final aup ai;
   private final ati aj;
   private final gzg ak;
   private final aud al;
   private final gxt am;
   private final fjd an;
   private final fjh ao;
   private final faz ap;
   private final hbj aq;
   private final hbe ar;
   private final fmq as;
   private final gxn at;
   private final ggm au;
   private final fig av = new fig(I, fib::b);
   private final YggdrasilAuthenticationService aw;
   private final MinecraftSessionService ax;
   private final UserApiService ay;
   private final CompletableFuture<UserProperties> az;
   private final gxm aA;
   private final gyw aB;
   private final ghu aC;
   private final gxk aD;
   private final gxj aE;
   private final gxi aF;
   private final gxh aG;
   private final fjo aH;
   private final fml aI;
   private final hcl aJ;
   private final fui aK;
   private final fzx aL;
   private final gjb aM;
   private final hbn aN;
   private final gbj aO;
   private final fey aP;
   private final gga aQ;
   @Nullable
   public gbg r;
   @Nullable
   public gax s;
   @Nullable
   public gfs t;
   @Nullable
   private has aR;
   @Nullable
   private vx aS;
   private boolean aT;
   @Nullable
   public btj u;
   @Nullable
   public btj v;
   @Nullable
   public eyc w;
   private int aU;
   protected int x;
   private volatile boolean aV;
   private long aW = ad.d();
   private long aX;
   private int aY;
   public boolean y;
   @Nullable
   public fpt z;
   @Nullable
   private fpn aZ;
   private boolean ba;
   Thread bb;
   private volatile boolean bc;
   @Nullable
   private Supplier<o> bd;
   private static int be;
   public String A = "";
   private long bf;
   private final fbg bg;
   public boolean B;
   public boolean C;
   public boolean D;
   public boolean E = true;
   private boolean bh;
   private final Queue<Runnable> bi = Queues.newConcurrentLinkedQueue();
   @Nullable
   private CompletableFuture<Void> bj;
   @Nullable
   private fmm bk;
   private bny bl = bnv.a;
   private int bm;
   private final bns bn = new bns(ad.c, () -> this.bm);
   private bpm bo = bpl.a;
   private final fij bp = new fij();
   private long bq;
   private double br;
   @Nullable
   private fcn.a bs;
   private final fhs bt;
   private final gbq bu;
   private gcf bv;
   private final fho bw;
   private final exu bx;
   private boolean by;
   private final long bz;
   private long bA;

   public fib(final fvo $$0) {
      super("Client");
      F = this;
      this.bz = System.currentTimeMillis();
      this.q = $$0.c.a;
      File $$1 = $$0.c.c;
      this.M = $$0.c.b.toPath();
      this.ab = $$0.d.b;
      this.ac = $$0.d.c;
      Path $$2 = this.q.toPath();
      this.bx = esh.a($$2.resolve("allowed_symlinks.txt"));
      gxb $$3 = new gxb($$0.c.a(), this.bx);
      this.ak = new gzg(this, $$2.resolve("downloads"), $$0.a);
      auf $$4 = new aty(this.M, atg.a, aue.b, this.bx);
      this.al = new aud($$3, this.ak.a(), $$4);
      this.aj = $$3.a();
      this.ad = $$0.a.d;
      this.aw = new YggdrasilAuthenticationService(this.ad);
      this.ax = this.aw.createMinecraftSessionService();
      this.X = $$0.a.a;
      this.N = CompletableFuture.supplyAsync(() -> this.ax.fetchProfile(this.X.b(), true), ad.i());
      this.ay = this.a(this.aw, $$0);
      this.az = CompletableFuture.supplyAsync(() -> {
         try {
            return this.ay.fetchProperties();
         } catch (AuthenticationException var2x) {
            G.error("Failed to fetch user properties", var2x);
            return UserApiService.OFFLINE_PROPERTIES;
         }
      }, ad.i());
      G.info("Setting user: {}", this.X.c());
      G.debug("(Session ID is {})", this.X.a());
      this.af = $$0.d.a;
      this.ag = !$$0.d.d;
      this.ah = !$$0.d.e;
      this.aR = null;
      yi.a(fhz::a);
      this.P = bam.a();
      this.aI = new fml(this);
      this.bb = Thread.currentThread();
      this.n = new fif(this, this.q);
      RenderSystem.setShaderGlintAlpha(this.n.ap().c());
      this.bc = true;
      this.aJ = new hcl(this, this.n);
      this.Z = new fhw($$2, this.P);
      G.info("Backend library: {}", RenderSystem.getBackendDescription());
      fbf $$5;
      if (this.n.p > 0 && this.n.o > 0) {
         $$5 = new fbf(this.n.o, this.n.p, $$0.b.c, $$0.b.d, $$0.b.e);
      } else {
         $$5 = $$0.b;
      }

      ad.c = RenderSystem.initBackendSystem();
      this.Q = new ghq(this);
      this.R = this.Q.a($$5, this.n.k, this.bg());
      this.a(true);
      this.R.a(new Runnable() {
         private boolean c;

         @Override
         public void run() {
            if (!this.c) {
               this.c = true;
               fbc.a($$0.c.a, fib.this.bb.threadId());
            }
         }
      });
      hby.a.b(hbu.A);

      try {
         this.R.a(this.aj, ab.b().g() ? fbj.a : fbj.b);
      } catch (IOException var13) {
         G.error("Couldn't set icon", var13);
      }

      this.o = new fic(this);
      this.o.a(this.R.i());
      this.p = new fia(this);
      this.p.a(this.R.i());
      RenderSystem.initRenderer(this.n.t, false);
      this.ap = new fax(this.R.l(), this.R.m());
      this.ap.a(0.0F, 0.0F, 0.0F, 0.0F);
      this.ap.f();
      this.ai = new aup(atg.a);
      this.al.a();
      this.n.b(this.al);
      this.am = new gxt(this.n.ab, $$0x -> {
         if (this.t != null) {
            this.t.cx.C();
         }
      });
      this.ai.a(this.am);
      this.O = new gwl(this.ai);
      this.ai.a(this.O);
      this.aA = new gxm(this.O, $$1.toPath().resolve("skins"), this.ax, this);
      this.ae = new esh($$2.resolve("saves"), $$2.resolve("backups"), this.bx, this.P);
      this.bw = new fho($$2);
      this.aq = new hbj(this.n);
      this.ai.a(this.aq);
      this.at = new gxn(this.X);
      this.ai.a(this.at);
      this.ar = new hbe(this);
      this.as = new fmq(this.O);
      this.h = this.as.a();
      this.i = this.as.b();
      this.ai.a(this.as);
      this.g();
      this.ai.a(new gxe());
      this.ai.a(new gxd());
      this.R.a("Startup");
      RenderSystem.setupDefaultState(0, 0, this.R.l(), this.R.m());
      this.R.a("Post startup");
      this.an = fjd.a();
      this.ao = fjh.a(this.an);
      this.aB = new gyw(this.O, this.an, this.n.D().c());
      this.ai.a(this.aB);
      this.aL = new fzx();
      this.ai.a(this.aL);
      this.aM = new gjb(this.h, this.aL, this::ao, this::ar, this::ap);
      this.ai.a(this.aM);
      ggd $$8 = new ggd(this.aM, this.aL);
      this.ai.a($$8);
      this.V = new gnq(this, this.O, this.aB, this.ao, $$8);
      this.ai.a(this.V);
      this.aF = new gxi(this.O);
      this.aG = new gxh(this.O);
      this.ai.a(this.aG);
      this.W = new ggu(this.aG, this.aF);

      try {
         int $$9 = Runtime.getRuntime().availableProcessors();
         fcw.a();
         this.T = new ghc($$9);
      } catch (OutOfMemoryError var12) {
         TinyFileDialogs.tinyfd_messageBox(
            "Minecraft",
            "Oh no! The game was unable to allocate memory off-heap while trying to start. You may try to free some memory by closing other applications on your computer, check that your system meets the minimum requirements, and try again. If the problem persists, please visit: "
               + axy.k,
            "ok",
            "error",
            true
         );
         throw new fvp("Unable to allocate render buffers", var12);
      }

      this.aK = new fui(this, this.ay);
      this.aC = new ghu(this.aB.b(), $$8, this.an);
      this.ai.a(this.aC);
      this.U = new gmq(this, this.O, this.V, this.W, this.aC, this.h, this.n, this.aL);
      this.ai.a(this.U);
      this.g = new geg(this.s, this.O);
      this.ai.a(this.g);
      this.aD = new gxk(this.O);
      this.ai.a(this.aD);
      this.aE = new gxj(this.O);
      this.ai.a(this.aE);
      this.aH = new fjo(this.O);
      this.ai.a(this.aH);
      this.j = new ggl(this, this.U.d(), this.ai, this.T);
      this.ai.a(this.j.e());
      this.f = new ggr(this, this.U, this.aM, this.T);
      this.ai.a(this.f);
      this.ai.a(this.f.A());
      this.au = new ggm();
      this.ai.a(this.au);
      this.ai.a(this.av);
      this.m = new fjm(this);
      this.l = new gkq(this);
      fdk $$11 = fdk.a(this);
      this.aP = new fey($$11);
      RenderSystem.setErrorCallback(this::a);
      if (this.ap.c != this.R.l() || this.ap.d != this.R.m()) {
         StringBuilder $$12 = new StringBuilder(
            "Recovering from unsupported resolution ("
               + this.R.l()
               + "x"
               + this.R.m()
               + ").\nPlease make sure you have up-to-date drivers (see aka.ms/mcdriver for instructions)."
         );
         if (fbh.b()) {
            $$12.append("\n\nReported GL debug messages:\n").append(String.join("\n", fbh.a()));
         }

         this.R.a(this.ap.c, this.ap.d);
         TinyFileDialogs.tinyfd_messageBox("Minecraft", $$12.toString(), "ok", "error", false);
      } else if (this.n.ac().c() && !this.R.j()) {
         this.R.h();
         this.n.ac().a(this.R.j());
      }

      this.R.a(this.n.P().c());
      this.R.b(this.n.H().c());
      this.R.d();
      this.a();
      this.j.a(this.aj.d());
      this.aN = new hbn(this, this.ay, this.X);
      this.aO = gbj.a(this.ay, this.X, $$2);
      this.bt = new fhs(this);
      this.bt.a(this.n.au().c() != fid.a);
      this.bu = new gbq(this);
      this.bu.a(this.n.B().c());
      this.bv = gcf.a(gcc.a(), this.ay);
      fpj.a(this);
      this.a(new fpe(xd.c("gui.loadingMinecraft")));
      List<ate> $$13 = this.al.g();
      this.bp.a(fij.b.a, $$13);
      auo $$14 = this.ai.a(ad.g(), this, J, $$13);
      hby.a.a(hbu.C);
      fib.b $$15 = new fib.b($$11, $$0.e);
      this.a(new fpj(this, $$14, $$1x -> ad.a($$1x, $$1xx -> this.a($$1xx, $$15), () -> {
            if (ab.aW) {
               this.bj();
            }

            this.bp.a();
            this.a($$15);
         }), false));
      this.aQ = gga.a($$0.e.b());
      this.bg = new fbg(this.n, this);
   }

   private void a(@Nullable fib.b $$0) {
      if (!this.by) {
         this.by = true;
         this.b($$0);
      }
   }

   private void b(@Nullable fib.b $$0) {
      Runnable $$1 = this.c($$0);
      hby.a.b(hbu.C);
      hby.a.b(hbu.z);
      hby.a.a(this.aN.a());
      $$1.run();
   }

   public boolean c() {
      return this.by;
   }

   private Runnable c(@Nullable fib.b $$0) {
      List<Function<Runnable, fpt>> $$1 = new ArrayList<>();
      this.a($$1);
      Runnable $$2 = () -> {
         if ($$0 != null && $$0.b().a()) {
            gfz.a(this, $$0.b(), $$0.a());
         } else {
            this.a(new fpv(true));
         }
      };

      for (Function<Runnable, fpt> $$3 : Lists.reverse($$1)) {
         fpt $$4 = $$3.apply($$2);
         $$2 = () -> this.a($$4);
      }

      return $$2;
   }

   private void a(List<Function<Runnable, fpt>> $$0) {
      if (this.n.ac) {
         $$0.add($$0x -> new fok(this.n, $$0x));
      }

      BanDetails $$1 = this.H();
      if ($$1 != null) {
         $$0.add($$1x -> fon.a($$1xx -> {
               if ($$1xx) {
                  ad.m().a(axy.n);
               }

               $$1x.run();
            }, $$1));
      }

      ProfileResult $$2 = this.N.join();
      if ($$2 != null) {
         GameProfile $$3 = $$2.profile();
         Set<ProfileActionType> $$4 = $$2.actions();
         if ($$4.contains(ProfileActionType.FORCED_NAME_CHANGE)) {
            $$0.add($$1x -> fon.a($$3.getName(), $$1x));
         }

         if ($$4.contains(ProfileActionType.USING_BANNED_SKIN)) {
            $$0.add(fon::a);
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
      this.R.b(this.bg());
   }

   private String bg() {
      StringBuilder $$0 = new StringBuilder("Minecraft");
      if (e().a()) {
         $$0.append("*");
      }

      $$0.append(" ");
      $$0.append(ab.b().c());
      gay $$1 = this.L();
      if ($$1 != null && $$1.k().i()) {
         $$0.append(" - ");
         gbl $$2 = this.S();
         if (this.aR != null && !this.aR.r()) {
            $$0.append(gxr.a("title.singleplayer"));
         } else if ($$2 != null && $$2.e()) {
            $$0.append(gxr.a("title.multiplayer.realms"));
         } else if (this.aR == null && ($$2 == null || !$$2.d())) {
            $$0.append(gxr.a("title.multiplayer.other"));
         } else {
            $$0.append(gxr.a("title.multiplayer.lan"));
         }
      }

      return $$0.toString();
   }

   private UserApiService a(YggdrasilAuthenticationService $$0, fvo $$1) {
      return $$1.a.a.g() != fio.a.c ? UserApiService.OFFLINE : $$0.createUserApiService($$1.a.a.d());
   }

   public static azb e() {
      return azb.a("vanilla", ClientBrandRetriever::getClientModName, "Client", fib.class);
   }

   private void a(Throwable $$0, @Nullable fib.b $$1) {
      if (this.al.d().size() > 1) {
         this.a($$0, null, $$1);
      } else {
         ad.a($$0);
      }
   }

   public void a(Throwable $$0, @Nullable xd $$1, @Nullable fib.b $$2) {
      G.info("Caught error loading resourcepacks, removing all selected resourcepacks", $$0);
      this.bp.a($$0);
      this.ak.b();
      this.al.b(Collections.emptyList());
      this.n.i.clear();
      this.n.j.clear();
      this.n.ay();
      this.a(true, $$2).thenRun(() -> this.a($$1));
   }

   private void bh() {
      this.a(null);
      if (this.s != null) {
         this.s.Z();
         this.y();
      }

      this.a(new fpv());
      this.a(null);
   }

   private void a(@Nullable xd $$0) {
      fml $$1 = this.az();
      fmj.b($$1, fmj.a.c, xd.c("resourcePack.load_fail"), $$0);
   }

   public void f() {
      this.bb = Thread.currentThread();
      if (Runtime.getRuntime().availableProcessors() > 4) {
         this.bb.setPriority(10);
      }

      try {
         boolean $$0 = false;

         while (this.bc) {
            this.bi();

            try {
               bob $$1 = bob.a("Renderer");
               boolean $$2 = this.aQ().e();
               this.bl = this.a($$2, $$1);
               this.bl.a();
               this.bo.c();
               this.c(!$$0);
               this.bo.d();
               this.bl.b();
               this.b($$2, $$1);
            } catch (OutOfMemoryError var4) {
               if ($$0) {
                  throw var4;
               }

               this.bk();
               this.a(new fpm());
               System.gc();
               G.error(LogUtils.FATAL_MARKER, "Out of memory", var4);
               $$0 = true;
            }
         }
      } catch (z var5) {
         G.error(LogUtils.FATAL_MARKER, "Reported exception thrown!", var5);
         this.c(var5.a());
      } catch (Throwable var6) {
         G.error(LogUtils.FATAL_MARKER, "Unreported exception thrown!", var6);
         this.c(new o("Unexpected error", var6));
      }
   }

   void g() {
      this.as.a(this.n);
   }

   private void a(int $$0, long $$1) {
      this.n.P().a(false);
      this.n.ay();
   }

   public faz h() {
      return this.ap;
   }

   public String i() {
      return this.ab;
   }

   public String j() {
      return this.ac;
   }

   public void a(o $$0) {
      this.bd = () -> this.d($$0);
   }

   public void b(o $$0) {
      this.bd = () -> $$0;
   }

   private void bi() {
      if (this.bd != null) {
         a(this, this.q, this.bd.get());
      }
   }

   public void c(o $$0) {
      o $$1 = this.d($$0);
      this.bk();
      a(this, this.q, $$1);
   }

   public static int a(File $$0, o $$1) {
      Path $$2 = $$0.toPath().resolve("crash-reports");
      Path $$3 = $$2.resolve("crash-" + ad.f() + "-client.txt");
      ald.a($$1.a(y.a));
      if ($$1.e() != null) {
         ald.a("#@!@# Game crashed! Crash report saved to: #@!@# " + $$1.e().toAbsolutePath());
         return -1;
      } else if ($$1.a($$3, y.a)) {
         ald.a("#@!@# Game crashed! Crash report saved to: #@!@# " + $$3.toAbsolutePath());
         return -1;
      } else {
         ald.a("#@?@# Game crashed! Crash report could not be saved. #@?@#");
         return -2;
      }
   }

   public static void a(@Nullable fib $$0, File $$1, o $$2) {
      int $$3 = a($$1, $$2);
      if ($$0 != null) {
         $$0.aq.h();
      }

      System.exit($$3);
   }

   public boolean k() {
      return this.n.R().c();
   }

   public CompletableFuture<Void> l() {
      return this.a(false, null);
   }

   private CompletableFuture<Void> a(boolean $$0, @Nullable fib.b $$1) {
      if (this.bj != null) {
         return this.bj;
      } else {
         CompletableFuture<Void> $$2 = new CompletableFuture<>();
         if (!$$0 && this.aZ instanceof fpj) {
            this.bj = $$2;
            return $$2;
         } else {
            this.al.a();
            List<ate> $$3 = this.al.g();
            if (!$$0) {
               this.bp.a(fij.b.b, $$3);
            }

            this.a(new fpj(this, this.ai.a(ad.g(), this, J, $$3), $$3x -> ad.a($$3x, $$2xx -> {
                  if ($$0) {
                     this.ak.c();
                     this.bh();
                  } else {
                     this.a($$2xx, $$1);
                  }
               }, () -> {
                  this.f.f();
                  this.bp.a();
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
      ght $$1 = this.ao().a();
      gym $$2 = $$1.a().a();

      for (dgv $$3 : lu.e) {
         UnmodifiableIterator $$10 = $$3.l().a().iterator();

         while ($$10.hasNext()) {
            dua $$4 = (dua)$$10.next();
            if ($$4.o() == dnc.c) {
               gym $$5 = $$1.b($$4);
               if ($$5 == $$2) {
                  G.debug("Missing model for: {}", $$4);
                  $$0 = true;
               }
            }
         }
      }

      gwk $$6 = $$2.e();

      for (dgv $$7 : lu.e) {
         UnmodifiableIterator var17 = $$7.l().a().iterator();

         while (var17.hasNext()) {
            dua $$8 = (dua)var17.next();
            gwk $$9 = $$1.a($$8);
            if (!$$8.l() && $$9 == $$6) {
               G.debug("Missing particle icon for: {}", $$8);
            }
         }
      }

      for (cvg $$10 : lu.g) {
         cvl $$11 = $$10.w();
         String $$12 = $$11.v();
         String $$13 = xd.c($$12).getString();
         if ($$13.toLowerCase(Locale.ROOT).equals($$10.a())) {
            G.debug("Missing translation for: {} {} {}", new Object[]{$$11, $$12, $$10});
         }
      }

      $$0 |= fpk.a();
      $$0 |= gmt.a();
      if ($$0) {
         throw new IllegalStateException("Your game data is foobar, fix the errors above!");
      }
   }

   public esh m() {
      return this.ae;
   }

   private void a(String $$0) {
      fib.a $$1 = this.J();
      if (!$$1.a(this.T())) {
         if (this.m.b()) {
            this.m.b(false);
            this.a(new fop($$0x -> {
               if ($$0x) {
                  ad.m().a(axy.g);
               }

               this.a(null);
            }, fib.a.e, axy.g, true));
         } else {
            xd $$2 = $$1.a();
            this.m.a($$2, false);
            this.bt.c($$2);
            this.m.b($$1 == fib.a.d);
         }
      } else {
         this.a(new foo($$0));
      }
   }

   public void a(@Nullable fpt $$0) {
      if (ab.aW && Thread.currentThread() != this.bb) {
         G.error("setScreen called from non-game thread");
      }

      if (this.z != null) {
         this.z.j();
      } else {
         this.a(fhy.a);
      }

      if ($$0 == null && this.ba) {
         throw new IllegalStateException("Trying to return to in-game GUI during disconnection");
      } else {
         if ($$0 == null && this.s == null) {
            $$0 = new fpv();
         } else if ($$0 == null && this.t.eB()) {
            if (this.t.m()) {
               $$0 = new fox(null, this.s.j().l());
            } else {
               this.t.ga();
            }
         }

         this.z = $$0;
         if (this.z != null) {
            this.z.aL_();
         }

         fcq.a();
         if ($$0 != null) {
            this.o.j();
            fhz.b();
            $$0.b(this, this.R.p(), this.R.q());
            this.y = false;
         } else {
            this.aq.i();
            this.o.i();
         }

         this.d();
      }
   }

   public void a(@Nullable fpn $$0) {
      this.aZ = $$0;
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
         ad.c = System::nanoTime;
         if (this.bd == null) {
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
         this.aN.close();
         this.av.close();
         this.aB.close();
         this.as.close();
         this.j.close();
         this.f.close();
         this.aq.g();
         this.g.a();
         this.aE.close();
         this.aD.close();
         this.aG.close();
         this.aH.close();
         this.aF.close();
         this.O.close();
         this.ai.close();
         fnc.b();
         ad.j();
      } catch (Throwable var5) {
         G.error("Shutdown failure!", var5);
         throw var5;
      } finally {
         this.Q.close();
         this.R.close();
      }
   }

   private void c(boolean $$0) {
      this.R.a("Pre render");
      if (this.R.c()) {
         this.q();
      }

      if (this.bj != null && !(this.aZ instanceof fpj)) {
         CompletableFuture<Void> $$1 = this.bj;
         this.bj = null;
         this.l().thenRun(() -> $$1.complete(null));
      }

      Runnable $$2;
      while (($$2 = this.bi.poll()) != null) {
         $$2.run();
      }

      int $$3 = this.S.a(ad.c(), $$0);
      if ($$0) {
         this.bl.a("scheduledExecutables");
         this.bC();
         this.bl.c();
         this.bl.a("tick");

         for (int $$4 = 0; $$4 < Math.min(10, $$3); $$4++) {
            this.bl.d("clientTick");
            this.t();
         }

         this.bl.c();
      }

      this.R.a("Render");
      this.bl.a("sound");
      this.aq.a(this.j.l());
      this.bl.b("toasts");
      this.aI.a();
      this.bl.b("render");
      long $$5 = ad.d();
      boolean $$7;
      if (!this.aQ().d() && !this.bo.e()) {
         $$7 = false;
         this.br = 0.0;
      } else {
         $$7 = this.bs == null || this.bs.b();
         if ($$7) {
            fcn.a().ifPresent(fcn::b);
         }
      }

      RenderSystem.clear(16640);
      this.ap.a(true);
      RenderSystem.setShaderFog(ggj.a);
      this.bl.a("display");
      RenderSystem.enableCull();
      this.bl.b("mouse");
      this.o.a();
      this.bl.c();
      if (!this.y) {
         this.bl.b("gameRenderer");
         this.j.a(this.S, $$0);
         this.bl.c();
      }

      this.bl.a("blit");
      this.ap.e();
      this.ap.c(this.R.l(), this.R.m());
      this.bf = ad.d() - $$5;
      if ($$7) {
         fcn.a().ifPresent($$0x -> this.bs = $$0x.c());
      }

      this.bl.b("updateDisplay");
      this.R.e();
      int $$8 = this.bg.a();
      if ($$8 < 260) {
         RenderSystem.limitDisplayFPS($$8);
      }

      this.bl.b("yield");
      Thread.yield();
      this.bl.c();
      this.R.a("Post render");
      this.aY++;
      this.aV = this.U() && (this.z != null && this.z.k() || this.aZ != null && this.aZ.a()) && !this.aR.r();
      this.S.b(this.aV);
      this.S.c(!this.bp());
      long $$9 = ad.d();
      long $$10 = $$9 - this.aW;
      if ($$7) {
         this.bq = $$10;
      }

      this.aQ().a($$10);
      this.aW = $$9;
      this.bl.a("fpsUpdate");
      if (this.bs != null && this.bs.b()) {
         this.br = (double)this.bs.c() * 100.0 / (double)this.bq;
      }

      while (ad.c() >= this.aX + 1000L) {
         String $$11;
         if (this.br > 0.0) {
            $$11 = " GPU: " + (this.br > 100.0 ? n.m + "100%" : Math.round(this.br) + "%");
         } else {
            $$11 = "";
         }

         be = this.aY;
         this.A = String.format(
            Locale.ROOT,
            "%d fps T: %s%s%s%s B: %d%s",
            be,
            $$8 == 260 ? "inf" : $$8,
            this.n.P().c() ? " vsync " : " ",
            this.n.k().c(),
            this.n.j().c() == fhn.a ? "" : (this.n.j().c() == fhn.b ? " fast-clouds" : " fancy-clouds"),
            this.n.F().c(),
            $$11
         );
         this.aX += 1000L;
         this.aY = 0;
      }

      this.bl.c();
   }

   private bny a(boolean $$0, @Nullable bob $$1) {
      if (!$$0) {
         this.bn.b();
         if (!this.bo.e() && $$1 == null) {
            return bnv.a;
         }
      }

      bny $$2;
      if ($$0) {
         if (!this.bn.a()) {
            this.bm = 0;
            this.bn.c();
         }

         this.bm++;
         $$2 = this.bn.d();
      } else {
         $$2 = bnv.a;
      }

      if (this.bo.e()) {
         $$2 = bny.a($$2, this.bo.f());
      }

      return bob.a($$2, $$1);
   }

   private void b(boolean $$0, @Nullable bob $$1) {
      if ($$1 != null) {
         $$1.b();
      }

      flt $$2 = this.aQ().o();
      if ($$0) {
         $$2.a(this.bn.e());
      } else {
         $$2.a(null);
      }

      this.bl = this.bn.d();
   }

   @Override
   public void a() {
      int $$0 = this.R.a(this.n.as().c(), this.k());
      this.R.a((double)$$0);
      if (this.z != null) {
         this.z.a(this, this.R.p(), this.R.q());
      }

      faz $$1 = this.h();
      $$1.a(this.R.l(), this.R.m());
      this.j.a(this.R.l(), this.R.m());
      this.o.g();
   }

   @Override
   public void b() {
      this.o.k();
   }

   public int o() {
      return be;
   }

   public long p() {
      return this.bf;
   }

   private void bk() {
      try {
         aza.b();
      } catch (Throwable var3) {
      }

      try {
         System.gc();
         if (this.aT && this.aR != null) {
            this.aR.a(true);
         }

         this.b((fpt)(new fpe(xd.c("menu.savingLevel"))));
      } catch (Throwable var2) {
      }

      System.gc();
   }

   public boolean a(Consumer<xd> $$0) {
      if (this.bo.e()) {
         this.bl();
         return false;
      } else {
         Consumer<bnx> $$1 = $$1x -> {
            if ($$1x != bnt.a) {
               int $$2x = $$1x.f();
               double $$3x = (double)$$1x.g() / (double)bad.a;
               this.execute(
                  () -> $$0.accept(
                        xd.a("commands.debug.stopped", String.format(Locale.ROOT, "%.2f", $$3x), $$2x, String.format(Locale.ROOT, "%.2f", (double)$$2x / $$3x))
                     )
               );
            }
         };
         Consumer<Path> $$2 = $$1x -> {
            xd $$2x = xd.b($$1x.toString()).a(n.t).a($$1xx -> $$1xx.a(new xb(xb.a.b, $$1x.toFile().getParent())));
            this.execute(() -> $$0.accept(xd.a("debug.profiling.stop", $$2x)));
         };
         ac $$3 = a(new ac(), this, this.am, this.ab, this.n);
         Consumer<List<Path>> $$4 = $$2x -> {
            Path $$3x = this.a($$3, $$2x);
            $$2.accept($$3x);
         };
         Consumer<Path> $$5;
         if (this.aR == null) {
            $$5 = $$1x -> $$4.accept(ImmutableList.of($$1x));
         } else {
            this.aR.b($$3);
            CompletableFuture<Path> $$6 = new CompletableFuture<>();
            CompletableFuture<Path> $$7 = new CompletableFuture<>();
            CompletableFuture.allOf($$6, $$7).thenRunAsync(() -> $$4.accept(ImmutableList.of($$6.join(), $$7.join())), ad.h());
            this.aR.a($$0x -> {
            }, $$7::complete);
            $$5 = $$6::complete;
         }

         this.bo = bpk.a(new gfx(ad.c, this.f), ad.c, ad.h(), new bpq("client"), $$1x -> {
            this.bo = bpl.a;
            $$1.accept($$1x);
         }, $$5);
         return true;
      }
   }

   private void bl() {
      this.bo.a();
      if (this.aR != null) {
         this.aR.aW();
      }
   }

   private void bm() {
      this.bo.b();
      if (this.aR != null) {
         this.aR.aX();
      }
   }

   private Path a(ac $$0, List<Path> $$1) {
      String $$2;
      if (this.T()) {
         $$2 = this.V().ba().e();
      } else {
         gbl $$3 = this.S();
         $$2 = $$3 != null ? $$3.a : "unknown";
      }

      Path $$7;
      try {
         String $$5 = String.format(Locale.ROOT, "%s-%s-%s", ad.f(), $$2, ab.b().b());
         String $$6 = v.a(bpq.a, $$5, ".zip");
         $$7 = bpq.a.resolve($$6);
      } catch (IOException var21) {
         throw new UncheckedIOException(var21);
      }

      try (ayn $$10 = new ayn($$7)) {
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
      this.bc = false;
   }

   public boolean r() {
      return this.bc;
   }

   public void b(boolean $$0) {
      if (this.z == null) {
         boolean $$1 = this.U() && !this.aR.r();
         if ($$1) {
            this.a(new fpo(!$$0));
            this.aq.e();
         } else {
            this.a(new fpo(true));
         }
      }
   }

   private void d(boolean $$0) {
      if (!$$0) {
         this.x = 0;
      }

      if (this.x <= 0 && !this.t.fv()) {
         if ($$0 && this.w != null && this.w.c() == eyc.a.b) {
            eya $$1 = (eya)this.w;
            je $$2 = $$1.a();
            if (!this.s.a_($$2).l()) {
               jj $$3 = $$1.b();
               if (this.r.b($$2, $$3)) {
                  this.g.a($$2, $$3);
                  this.t.a(brj.a);
               }
            }
         } else {
            this.r.b();
         }
      }
   }

   private boolean bn() {
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
         cvl $$0 = this.t.b(brj.a);
         if (!$$0.a(this.s.J())) {
            return false;
         } else {
            boolean $$1 = false;
            switch (this.w.c()) {
               case c:
                  this.r.a(this.t, ((eyb)this.w).a());
                  break;
               case b:
                  eya $$2 = (eya)this.w;
                  je $$3 = $$2.a();
                  if (!this.s.a_($$3).l()) {
                     this.r.a($$3, $$2.b());
                     if (this.s.a_($$3).l()) {
                        $$1 = true;
                     }
                     break;
                  }
               case a:
                  if (this.r.e()) {
                     this.x = 10;
                  }

                  this.t.gw();
            }

            this.t.a(brj.a);
            return $$1;
         }
      }
   }

   private void bo() {
      if (!this.r.k()) {
         this.aU = 4;
         if (!this.t.C()) {
            if (this.w == null) {
               G.warn("Null returned as 'hitResult', this shouldn't happen!");
            }

            for (brj $$0 : brj.values()) {
               cvl $$1 = this.t.b($$0);
               if (!$$1.a(this.s.J())) {
                  return;
               }

               if (this.w != null) {
                  switch (this.w.c()) {
                     case c:
                        eyb $$2 = (eyb)this.w;
                        btj $$3 = $$2.a();
                        if (!this.s.A_().a($$3.ds())) {
                           return;
                        }

                        brk $$4 = this.r.a(this.t, $$3, $$2, $$0);
                        if (!$$4.a()) {
                           $$4 = this.r.a(this.t, $$3, $$0);
                        }

                        if ($$4 instanceof brk.d $$5) {
                           if ($$5.e() == brk.e.b) {
                              this.t.a($$0);
                           }

                           return;
                        }
                        break;
                     case b:
                        eya $$6 = (eya)this.w;
                        int $$7 = $$1.J();
                        brk $$8 = this.r.a(this.t, $$0, $$6);
                        if ($$8 instanceof brk.d $$9) {
                           if ($$9.e() == brk.e.b) {
                              this.t.a($$0);
                              if (!$$1.f() && ($$1.J() != $$7 || this.r.f())) {
                                 this.j.c.a($$0);
                              }
                           }

                           return;
                        }

                        if ($$8 instanceof brk.a) {
                           return;
                        }
                  }
               }

               if (!$$1.f() && this.r.a(this.t, $$0) instanceof brk.d $$11) {
                  if ($$11.e() == brk.e.b) {
                     this.t.a($$0);
                  }

                  this.j.c.a($$0);
                  return;
               }
            }
         }
      }
   }

   public hbe s() {
      return this.ar;
   }

   public void t() {
      this.bA++;
      if (this.s != null && !this.aV) {
         this.s.s().m();
      }

      if (this.aU > 0) {
         this.aU--;
      }

      this.bl.a("gui");
      this.bu.a();
      this.m.a(this.aV);
      this.bl.c();
      this.j.a(1.0F);
      this.aJ.a(this.s, this.w);
      this.bl.a("gameMode");
      if (!this.aV && this.s != null) {
         this.r.c();
      }

      this.bl.b("textures");
      if (this.bp()) {
         this.O.f();
      }

      if (this.z != null || this.t == null) {
         if (this.z instanceof fpg $$0 && !this.t.fL()) {
            $$0.m();
         }
      } else if (this.t.eB() && !(this.z instanceof fox)) {
         this.a(null);
      } else if (this.t.fL() && this.s != null) {
         this.a(new fpg());
      }

      if (this.z != null) {
         this.x = 10000;
      }

      if (this.z != null) {
         fpt.a(() -> this.z.e(), "Ticking screen", this.z.getClass().getCanonicalName());
      }

      if (!this.aQ().d()) {
         this.m.l();
      }

      if (this.aZ == null && this.z == null) {
         this.bl.b("Keybindings");
         this.br();
         if (this.x > 0) {
            this.x--;
         }
      }

      if (this.s != null) {
         this.bl.b("gameRenderer");
         if (!this.aV) {
            this.j.f();
         }

         this.bl.b("levelRenderer");
         if (!this.aV) {
            this.f.o();
         }

         this.bl.b("level");
         if (!this.aV) {
            this.s.e();
         }
      } else if (this.j.g() != null) {
         this.j.b();
      }

      if (!this.aV) {
         this.ar.a();
      }

      this.aq.a(this.aV);
      if (this.s != null) {
         if (!this.aV) {
            if (!this.n.s && this.bq()) {
               xd $$1 = xd.c("tutorial.socialInteractions.title");
               xd $$2 = xd.a("tutorial.socialInteractions.description", hcl.a("socialInteractions"));
               this.bk = new fmm(fmm.a.f, $$1, $$2, true, 8000);
               this.aI.a(this.bk);
               this.n.s = true;
               this.n.ay();
            }

            this.aJ.d();

            try {
               this.s.a(() -> true);
            } catch (Throwable var4) {
               o $$4 = o.a(var4, "Exception in world tick");
               if (this.s == null) {
                  p $$5 = $$4.a("Affected level");
                  $$5.a("Problem", "Level is null!");
               } else {
                  this.s.a($$4);
               }

               throw new z($$4);
            }
         }

         this.bl.b("animateTick");
         if (!this.aV && this.bp()) {
            this.s.b(this.t.dw(), this.t.dy(), this.t.dC());
         }

         this.bl.b("particles");
         if (!this.aV && this.bp()) {
            this.g.b();
         }

         gay $$6 = this.L();
         if ($$6 != null && !this.aV) {
            $$6.b(ahc.a);
         }
      } else if (this.aS != null) {
         this.bl.b("pendingConnection");
         this.aS.b();
      }

      this.bl.b("keyboard");
      this.p.b();
      this.bl.c();
   }

   private boolean bp() {
      return this.s == null || this.s.s().i();
   }

   private boolean bq() {
      return !this.aT || this.aR != null && this.aR.r();
   }

   private void br() {
      while (this.n.N.g()) {
         fhl $$0 = this.n.aD();
         this.n.a(this.n.aD().c());
         if ($$0.a() != this.n.aD().a()) {
            this.j.a(this.n.aD().a() ? this.an() : null);
         }

         this.f.q();
      }

      while (this.n.O.g()) {
         this.n.Z = !this.n.Z;
      }

      for (int $$1 = 0; $$1 < 9; $$1++) {
         boolean $$2 = this.n.T.e();
         boolean $$3 = this.n.U.e();
         if (this.n.S[$$1].g()) {
            if (this.t.P_()) {
               this.m.g().a($$1);
            } else if (!this.t.f() || this.z != null || !$$3 && !$$2) {
               this.t.gc().j = $$1;
            } else {
               fqx.a(this, $$1, $$3, $$2);
            }
         }
      }

      while (this.n.L.g()) {
         if (!this.bq()) {
            this.t.a(K, true);
            this.bt.c(K);
         } else {
            if (this.bk != null) {
               this.bk.d();
               this.bk = null;
            }

            this.a(new fuk());
         }
      }

      while (this.n.C.g()) {
         if (this.r.g()) {
            this.t.h();
         } else {
            this.aJ.a();
            this.a(new fri(this.t));
         }
      }

      while (this.n.R.g()) {
         this.a(new fqd(this.t.cx.p()));
      }

      while (this.n.D.g()) {
         if (!this.t.P_()) {
            this.L().b(new ahv(ahv.a.g, je.c, jj.a));
         }
      }

      while (this.n.E.g()) {
         if (!this.t.P_() && this.t.b(fpt.s())) {
            this.t.a(brj.a);
         }
      }

      while (this.n.I.g()) {
         this.a("");
      }

      if (this.z == null && this.aZ == null && this.n.K.g()) {
         this.a("/");
      }

      boolean $$4 = false;
      if (this.t.fv()) {
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
            $$4 |= this.bn();
         }

         while (this.n.F.g()) {
            this.bo();
         }

         while (this.n.H.g()) {
            this.bt();
         }
      }

      if (this.n.F.e() && this.aU == 0 && !this.t.fv()) {
         this.bo();
      }

      this.d(this.z == null && !$$4 && this.n.G.e() && this.o.h());
   }

   public hbn u() {
      return this.aN;
   }

   public double v() {
      return this.br;
   }

   public gbj w() {
      return this.aO;
   }

   public fva x() {
      return new fva(this, this.ae);
   }

   public void a(esh.c $$0, aud $$1, ama $$2, boolean $$3) {
      this.y();
      this.Y.set(null);
      Instant $$4 = Instant.now();

      try {
         $$0.a($$2.c().a(), $$2.d());
         alw $$5 = alw.a(this.aw, this.q);
         $$5.f().a(this);
         dss.a($$5, this);
         avc.a(false);
         this.aR = MinecraftServer.a((Function<Thread, has>)($$4x -> new has($$4x, this, $$0, $$1, $$2, $$5, $$0xx -> {
               art $$1xx = art.b($$0xx + 0);
               this.Y.set($$1xx);
               return ars.a($$1xx, this.bi::add);
            })));
         this.aT = true;
         this.a(gcc.a());
         this.aQ.a(gga.c.a, $$0.f(), $$2.d().e());
      } catch (Throwable var11) {
         o $$7 = o.a(var11, "Starting integrated server");
         p $$8 = $$7.a("Starting integrated server");
         $$8.a("Level ID", $$0.f());
         $$8.a("Level Name", () -> $$2.d().e());
         throw new z($$7);
      }

      while (this.Y.get() == null) {
         Thread.yield();
      }

      fph $$9 = new fph(this.Y.get());
      this.a($$9);
      this.bl.a("waitForServer");

      for (; !this.aR.ai() || this.aZ != null; this.bi()) {
         $$9.e();
         this.c(false);

         try {
            Thread.sleep(16L);
         } catch (InterruptedException var10) {
         }
      }

      this.bl.c();
      Duration $$10 = Duration.between($$4, Instant.now());
      SocketAddress $$11 = this.aR.ah().a();
      vx $$12 = vx.a($$11);
      $$12.a($$11.toString(), 0, new gaw($$12, this, null, null, $$3, $$10, $$0x -> {
      }, null));
      $$12.a(new aji(this.X().c(), this.X().b()));
      this.aS = $$12;
   }

   public void a(gax $$0, fpr.a $$1) {
      this.e(new fpr(() -> false, $$1));
      this.s = $$0;
      this.a($$0);
      if (!this.aT) {
         alw $$2 = alw.a(this.aw, this.q);
         $$2.f().a(this);
         dss.a($$2, this);
         avc.a(false);
      }
   }

   public void y() {
      this.a(new fpq(true), false);
   }

   public void b(fpt $$0) {
      this.a($$0, false);
   }

   public void a(fpt $$0, boolean $$1) {
      gay $$2 = this.L();
      if ($$2 != null) {
         this.bB();
         $$2.h();
         if (!$$1) {
            this.z();
         }
      }

      this.aK.b();
      if (this.bo.e()) {
         this.bm();
      }

      has $$3 = this.aR;
      this.aR = null;
      this.j.i();
      this.r = null;
      this.bt.b();
      this.ba = true;

      try {
         this.e($$0);
         if (this.s != null) {
            if ($$3 != null) {
               this.bl.a("waitForServer");

               while (!$$3.I()) {
                  this.c(false);
               }

               this.bl.c();
            }

            this.m.i();
            this.aT = false;
         }

         this.s = null;
         this.a(null);
         this.t = null;
      } finally {
         this.ba = false;
      }

      dss.b();
   }

   public void z() {
      this.ak.i();
      this.bC();
   }

   public void c(fpt $$0) {
      gay $$1 = this.L();
      if ($$1 != null) {
         $$1.i();
      }

      if (this.bo.e()) {
         this.bm();
      }

      this.j.i();
      this.r = null;
      this.bt.b();
      this.ba = true;

      try {
         this.e($$0);
         this.m.i();
         this.s = null;
         this.a(null);
         this.t = null;
      } finally {
         this.ba = false;
      }

      dss.b();
   }

   private void e(fpt $$0) {
      this.bl.a("forcedTick");
      this.aq.f();
      this.u = null;
      this.aS = null;
      this.a($$0);
      this.c(false);
      this.bl.c();
   }

   public void d(fpt $$0) {
      this.bl.a("forcedTick");
      this.a($$0);
      this.c(false);
      this.bl.c();
   }

   private void a(@Nullable gax $$0) {
      this.f.a($$0);
      this.g.a($$0);
      this.aM.a($$0);
      this.d();
   }

   private UserProperties bs() {
      return this.az.join();
   }

   public boolean C() {
      return this.D() && this.n.ak().c();
   }

   public boolean D() {
      return this.E() && this.bs().flag(UserFlag.OPTIONAL_TELEMETRY_AVAILABLE);
   }

   public boolean E() {
      return ab.aW ? false : this.bs().flag(UserFlag.TELEMETRY_ENABLED);
   }

   public boolean F() {
      return this.ag && this.bs().flag(UserFlag.SERVERS_ALLOWED) && this.H() == null && !this.I();
   }

   public boolean G() {
      return this.bs().flag(UserFlag.REALMS_ALLOWED) && this.H() == null;
   }

   @Nullable
   public BanDetails H() {
      return (BanDetails)this.bs().bannedScopes().get("MULTIPLAYER");
   }

   public boolean I() {
      ProfileResult $$0 = this.N.getNow(null);
      return $$0 != null && $$0.actions().contains(ProfileActionType.FORCED_NAME_CHANGE);
   }

   public boolean a(UUID $$0) {
      return this.J().a(false) ? this.aK.c($$0) : (this.t == null || !$$0.equals(this.t.cD())) && !$$0.equals(ad.e);
   }

   public fib.a J() {
      if (this.n.n().c() == cnn.c) {
         return fib.a.b;
      } else if (!this.ah) {
         return fib.a.c;
      } else {
         return !this.bs().flag(UserFlag.CHAT_ALLOWED) ? fib.a.d : fib.a.a;
      }
   }

   public final boolean K() {
      return this.af;
   }

   @Nullable
   public gay L() {
      return this.t == null ? null : this.t.cx;
   }

   public static boolean M() {
      return !F.n.X;
   }

   public static boolean N() {
      return F.n.k().c().b() >= fht.b.b();
   }

   public static boolean O() {
      return !F.j.a() && F.n.k().c().b() >= fht.c.b();
   }

   public static boolean P() {
      return F.n.l().c();
   }

   private void bt() {
      if (this.w != null && this.w.c() != eyc.a.a) {
         boolean $$0 = this.t.gd().d;
         dre $$1 = null;
         eyc.a $$2 = this.w.c();
         cvl $$6;
         if ($$2 == eyc.a.b) {
            je $$3 = ((eya)this.w).a();
            dua $$4 = this.s.a_($$3);
            if ($$4.l()) {
               return;
            }

            dgv $$5 = $$4.b();
            $$6 = $$5.a((ddv)this.s, $$3, $$4);
            if ($$6.f()) {
               return;
            }

            if ($$0 && fpt.s() && $$4.x()) {
               $$1 = this.s.c_($$3);
            }
         } else {
            if ($$2 != eyc.a.c || !$$0) {
               return;
            }

            btj $$7 = ((eyb)this.w).a();
            $$6 = $$7.dF();
            if ($$6 == null) {
               return;
            }
         }

         if ($$6.f()) {
            String $$10 = "";
            if ($$2 == eyc.a.b) {
               $$10 = lu.e.b(this.s.a_(((eya)this.w).a()).b()).toString();
            } else if ($$2 == eyc.a.c) {
               $$10 = lu.f.b(((eyb)this.w).a().ao()).toString();
            }

            G.warn("Picking on: [{}] {} gave null item", $$2, $$10);
         } else {
            cno $$11 = this.t.gc();
            if ($$1 != null) {
               this.a($$6, $$1, this.s.F_());
            }

            int $$12 = $$11.c($$6);
            if ($$0) {
               $$11.b($$6);
               this.r.a(this.t.b(brj.a), 36 + $$11.j);
            } else if ($$12 != -1) {
               if (cno.d($$12)) {
                  $$11.j = $$12;
               } else {
                  this.r.a($$12);
               }
            }
         }
      }
   }

   private void a(cvl $$0, dre $$1, kb $$2) {
      uf $$3 = $$1.f($$2);
      $$1.a($$3);
      ctl.a($$0, $$1.q(), $$3);
      $$0.b($$1.r());
   }

   public o d(o $$0) {
      ac $$1 = $$0.f();
      a($$1, this, this.am, this.ab, this.n);
      this.a($$0.a("Uptime"));
      if (this.s != null) {
         this.s.a($$0);
      }

      if (this.aR != null) {
         this.aR.b($$1);
      }

      this.bp.a($$0);
      return $$0;
   }

   public static void a(@Nullable fib $$0, @Nullable gxt $$1, String $$2, @Nullable fif $$3, o $$4) {
      ac $$5 = $$4.f();
      a($$5, $$0, $$1, $$2, $$3);
   }

   private static String a(double $$0) {
      return String.format(Locale.ROOT, "%.3fs", $$0);
   }

   private void a(p $$0) {
      $$0.a("JVM uptime", () -> a((double)ManagementFactory.getRuntimeMXBean().getUptime() / 1000.0));
      $$0.a("Wall uptime", () -> a((double)(System.currentTimeMillis() - this.bz) / 1000.0));
      $$0.a("High-res time", () -> a((double)ad.c() / 1000.0));
      $$0.a("Client ticks", () -> String.format(Locale.ROOT, "%d ticks / %.3fs", this.bA, (double)this.bA / 20.0));
   }

   private static ac a(ac $$0, @Nullable fib $$1, @Nullable gxt $$2, String $$3, @Nullable fif $$4) {
      $$0.a("Launched Version", () -> $$3);
      String $$5 = bf();
      if ($$5 != null) {
         $$0.a("Launcher name", $$5);
      }

      $$0.a("Backend library", RenderSystem::getBackendDescription);
      $$0.a("Backend API", RenderSystem::getApiDescription);
      $$0.a("Window size", () -> $$1 != null ? $$1.R.l() + "x" + $$1.R.m() : "<not initialized>");
      $$0.a("GFLW Platform", fbs::a);
      $$0.a("GL Caps", RenderSystem::getCapsString);
      $$0.a("GL debug messages", () -> fbh.b() ? String.join("\n", fbh.a()) : "<disabled>");
      $$0.a("Is Modded", () -> e().b());
      $$0.a("Universe", () -> $$1 != null ? Long.toHexString($$1.L) : "404");
      $$0.a("Type", "Client (map_client.txt)");
      if ($$4 != null) {
         if ($$1 != null) {
            String $$6 = $$1.ai().m();
            if ($$6 != null) {
               $$0.a("GPU Warnings", $$6);
            }
         }

         $$0.a("Graphics mode", $$4.k().c().toString());
         $$0.a("Render Distance", $$4.aG() + "/" + $$4.e().c() + " chunks");
      }

      if ($$1 != null) {
         $$0.a("Resource Packs", () -> aud.a($$1.ac().f()));
      }

      if ($$2 != null) {
         $$0.a("Current Language", () -> $$2.a());
      }

      $$0.a("Locale", String.valueOf(Locale.getDefault()));
      $$0.a("System encoding", () -> System.getProperty("sun.jnu.encoding", "<not set>"));
      $$0.a("File encoding", () -> System.getProperty("file.encoding", "<not set>"));
      $$0.a("CPU", fbi::b);
      return $$0;
   }

   public static fib Q() {
      return F;
   }

   public CompletableFuture<Void> R() {
      return this.a(this::l).thenCompose($$0 -> (CompletionStage<Void>)$$0);
   }

   public void a(gcc $$0) {
      if (!this.bv.a($$0)) {
         this.bv = gcf.a($$0, this.ay);
      }
   }

   @Nullable
   public gbl S() {
      return x.a(this.L(), gay::x);
   }

   public boolean T() {
      return this.aT;
   }

   public boolean U() {
      return this.aT && this.aR != null;
   }

   @Nullable
   public has V() {
      return this.aR;
   }

   public boolean W() {
      has $$0 = this.V();
      return $$0 != null && !$$0.r();
   }

   public boolean b(UUID $$0) {
      return $$0.equals(this.X().b());
   }

   public fio X() {
      return this.X;
   }

   public GameProfile Y() {
      ProfileResult $$0 = this.N.join();
      return $$0 != null ? $$0.profile() : new GameProfile(this.X.b(), this.X.c());
   }

   public Proxy Z() {
      return this.ad;
   }

   public gwl aa() {
      return this.O;
   }

   public aus ab() {
      return this.ai;
   }

   public aud ac() {
      return this.al;
   }

   public ati ad() {
      return this.aj;
   }

   public gzg ae() {
      return this.ak;
   }

   public Path af() {
      return this.M;
   }

   public gxt ag() {
      return this.am;
   }

   public Function<alb, gwk> a(alb $$0) {
      return this.aB.a($$0)::a;
   }

   public boolean ah() {
      return this.aV;
   }

   public ggm ai() {
      return this.au;
   }

   public hbj aj() {
      return this.aq;
   }

   public awa ak() {
      awa $$0 = x.a(this.z, fpt::C);
      if ($$0 != null) {
         return $$0;
      } else if (this.t != null) {
         if (this.t.dS().ag() == dds.j) {
            return this.m.j().b() ? awb.d : awb.e;
         } else {
            jn<det> $$1 = this.t.dS().t(this.t.ds());
            if (!this.ar.c(awb.f) && (!this.t.bn() || !$$1.a(awr.Z))) {
               return this.t.dS().ag() != dds.i && this.t.gd().d && this.t.gd().c ? awb.b : $$1.a().o().orElse(awb.g);
            } else {
               return awb.f;
            }
         }
      } else {
         return awb.a;
      }
   }

   public MinecraftSessionService al() {
      return this.ax;
   }

   public gxm am() {
      return this.aA;
   }

   @Nullable
   public btj an() {
      return this.u;
   }

   public void a(btj $$0) {
      this.u = $$0;
      this.j.a($$0);
   }

   public boolean b(btj $$0) {
      return $$0.cl() || this.t != null && this.t.P_() && this.n.Q.e() && $$0.ao() == btq.by;
   }

   @Override
   protected Thread ay() {
      return this.bb;
   }

   @Override
   protected Runnable f(Runnable $$0) {
      return $$0;
   }

   @Override
   protected boolean e(Runnable $$0) {
      return true;
   }

   public ghu ao() {
      return this.aC;
   }

   public gmq ap() {
      return this.U;
   }

   public gjb aq() {
      return this.aM;
   }

   public gnq ar() {
      return this.V;
   }

   public ggu as() {
      return this.W;
   }

   public DataFixer at() {
      return this.P;
   }

   public fhr au() {
      return this.S;
   }

   public fjd av() {
      return this.an;
   }

   public boolean aw() {
      return this.t != null && this.t.gs() || this.n.X().c();
   }

   public fml az() {
      return this.aI;
   }

   public hcl aA() {
      return this.aJ;
   }

   public boolean aB() {
      return this.bh;
   }

   public fhw aC() {
      return this.Z;
   }

   public gyw aD() {
      return this.aB;
   }

   public gxk aE() {
      return this.aD;
   }

   public gxj aF() {
      return this.aE;
   }

   public gxi aG() {
      return this.aF;
   }

   public gxh aH() {
      return this.aG;
   }

   public fjo aI() {
      return this.aH;
   }

   @Override
   public void a(boolean $$0) {
      this.bh = $$0;
   }

   public xd a(File $$0, int $$1, int $$2) {
      int $$3 = this.R.l();
      int $$4 = this.R.m();
      faz $$5 = new fba($$1, $$2, true);
      float $$6 = this.t.dK();
      float $$7 = this.t.dI();
      float $$8 = this.t.P;
      float $$9 = this.t.O;
      this.j.b(false);

      xr var12;
      try {
         this.j.c(true);
         this.f.e();
         this.R.a($$1);
         this.R.b($$2);

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

            this.t.O = this.t.dI();
            this.t.P = this.t.dK();
            $$5.a(true);
            this.j.a(fhr.b);

            try {
               Thread.sleep(10L);
            } catch (InterruptedException var17) {
            }

            fik.a($$0, "panorama_" + $$10 + ".png", $$5, $$0x -> {
            });
         }

         xd $$11 = xd.b($$0.getName()).a(n.t).a($$1x -> $$1x.a(new xb(xb.a.b, $$0.getAbsolutePath())));
         return xd.a("screenshot.success", $$11);
      } catch (Exception var18) {
         G.error("Couldn't save image", var18);
         var12 = xd.a("screenshot.failure", var18.getMessage());
      } finally {
         this.t.w($$6);
         this.t.v($$7);
         this.t.P = $$8;
         this.t.O = $$9;
         this.j.b(true);
         this.R.a($$3);
         this.R.b($$4);
         $$5.a();
         this.j.c(false);
         this.f.e();
         this.h().a(true);
      }

      return var12;
   }

   private xd a(File $$0, int $$1, int $$2, int $$3, int $$4) {
      try {
         ByteBuffer $$5 = fbi.a($$1 * $$2 * 3);
         fik $$6 = new fik($$0, $$3, $$4, $$2);
         float $$7 = (float)$$3 / (float)$$1;
         float $$8 = (float)$$4 / (float)$$2;
         float $$9 = $$7 > $$8 ? $$7 : $$8;

         for (int $$10 = ($$4 - 1) / $$2 * $$2; $$10 >= 0; $$10 -= $$2) {
            for (int $$11 = 0; $$11 < $$3; $$11 += $$1) {
               RenderSystem.setShaderTexture(0, gwj.d);
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
         fbi.a($$5);
         xd $$15 = xd.b($$14.getName()).a(n.t).a($$1x -> $$1x.a(new xb(xb.a.b, $$14.getAbsolutePath())));
         return xd.a("screenshot.success", $$15);
      } catch (Exception var15) {
         G.warn("Couldn't save screenshot", var15);
         return xd.a("screenshot.failure", var15.getMessage());
      }
   }

   public bny aJ() {
      return this.bl;
   }

   @Nullable
   public art aK() {
      return this.Y.get();
   }

   public gxn aL() {
      return this.at;
   }

   @Nullable
   public fpn aM() {
      return this.aZ;
   }

   public fui aN() {
      return this.aK;
   }

   public fbs aO() {
      return this.R;
   }

   public fbg aP() {
      return this.bg;
   }

   public fki aQ() {
      return this.m.k();
   }

   public ghc aR() {
      return this.T;
   }

   public void a(int $$0) {
      this.aB.a($$0);
   }

   public fzx aS() {
      return this.aL;
   }

   public boolean aT() {
      return this.bs().flag(UserFlag.PROFANITY_FILTER_ENABLED);
   }

   public void aU() {
      this.aK.a();
      this.w().a();
   }

   @Nullable
   public azp aV() {
      return azp.a(this.aw.getServicesKeySet(), ServicesKeyType.PROFILE_KEY);
   }

   public boolean aW() {
      return !this.aw.getServicesKeySet().keys(ServicesKeyType.PROFILE_KEY).isEmpty();
   }

   public fhy aX() {
      return this.aa;
   }

   public void a(fhy $$0) {
      this.aa = $$0;
   }

   public fhs aY() {
      return this.bt;
   }

   public gbq aZ() {
      return this.bu;
   }

   public gcf ba() {
      return this.bv;
   }

   public fey bb() {
      return this.aP;
   }

   public gga bc() {
      return this.aQ;
   }

   public fho bd() {
      return this.bw;
   }

   public exu be() {
      return this.bx;
   }

   private float a(float $$0) {
      if (this.s != null) {
         brt $$1 = this.s.s();
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
      a(xc.a) {
         @Override
         public boolean a(boolean $$0) {
            return true;
         }
      },
      b(xd.c("chat.disabled.options").a(n.m)) {
         @Override
         public boolean a(boolean $$0) {
            return false;
         }
      },
      c(xd.c("chat.disabled.launcher").a(n.m)) {
         @Override
         public boolean a(boolean $$0) {
            return $$0;
         }
      },
      d(xd.a("chat.disabled.profile", xd.d(fib.F.n.I.h())).a(n.m)) {
         @Override
         public boolean a(boolean $$0) {
            return $$0;
         }
      };

      static final xd e = xd.c("chat.disabled.profile.moreInfo");
      private final xd f;

      a(final xd $$0) {
         this.f = $$0;
      }

      public xd a() {
         return this.f;
      }

      public abstract boolean a(boolean var1);
   }

   static record b(fdk a, fvo.c b) {
   }
}
