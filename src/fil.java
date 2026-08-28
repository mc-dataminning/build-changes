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

public class fil extends bqj<Runnable> implements fci {
   static fil F;
   private static final Logger G = LogUtils.getLogger();
   public static final boolean a = ad.m() == ad.a.d;
   private static final int H = 10;
   public static final alc b = alc.b("default");
   public static final alc c = alc.b("uniform");
   public static final alc d = alc.b("alt");
   private static final alc I = alc.b("regional_compliancies.json");
   private static final CompletableFuture<bai> J = CompletableFuture.completedFuture(bai.a);
   private static final xd K = xd.c("multiplayer.socialInteractions.not_available");
   public static final String e = "Please make sure you have up-to-date drivers (see aka.ms/mcdriver for instructions).";
   private final long L = Double.doubleToLongBits(Math.PI);
   private final Path M;
   private final CompletableFuture<ProfileResult> N;
   private final gxc O;
   private final ghx P;
   private final DataFixer Q;
   private final gif R;
   private final fch S;
   private final fib.b T = new fib.b(20.0F, 0L, this::a);
   private final gho U;
   public final ghc f;
   private final gnh V;
   private final goh W;
   private final ghf X;
   public final geq g;
   private final fiy Y;
   public final fjv h;
   public final fjv i;
   public final ggw j;
   public final glg l;
   private final AtomicReference<aru> Z = new AtomicReference<>();
   public final fjw m;
   public final fip n;
   private final fig aa;
   public final fim o;
   public final fik p;
   private fii ab = fii.a;
   public final File q;
   private final String ac;
   private final String ad;
   private final Proxy ae;
   private final esv af;
   private final boolean ag;
   private final boolean ah;
   private final boolean ai;
   private final auq aj;
   private final atj ak;
   private final gzx al;
   private final aue am;
   private final gyk an;
   private final fjn ao;
   private final fjr ap;
   private final fbo aq;
   private final hca ar;
   private final hbv as;
   private final fna at;
   private final gye au;
   private final ggx av;
   private final fiq aw = new fiq(I, fil::b);
   private final YggdrasilAuthenticationService ax;
   private final MinecraftSessionService ay;
   private final UserApiService az;
   private final CompletableFuture<UserProperties> aA;
   private final gyd aB;
   private final gzn aC;
   private final gij aD;
   private final gyb aE;
   private final gya aF;
   private final gxz aG;
   private final gxy aH;
   private final fjy aI;
   private final fmv aJ;
   private final hdc aK;
   private final fus aL;
   private final gah aM;
   private final gjq aN;
   private final hce aO;
   private final gbt aP;
   private final ffi aQ;
   private final ggk aR;
   @Nullable
   public gbq r;
   @Nullable
   public gbh s;
   @Nullable
   public ggc t;
   @Nullable
   private hbj aS;
   @Nullable
   private vx aT;
   private boolean aU;
   @Nullable
   public bto u;
   @Nullable
   public bto v;
   @Nullable
   public eyq w;
   private int aV;
   protected int x;
   private volatile boolean aW;
   private long aX = ad.d();
   private long aY;
   private int aZ;
   public boolean y;
   @Nullable
   public fqd z;
   @Nullable
   private fpx ba;
   private boolean bb;
   Thread bc;
   private volatile boolean bd;
   @Nullable
   private Supplier<o> be;
   private static int bf;
   public String A = "";
   private long bg;
   private final fbv bh;
   public boolean B;
   public boolean C;
   public boolean D;
   public boolean E = true;
   private boolean bi;
   private final Queue<Runnable> bj = Queues.newConcurrentLinkedQueue();
   @Nullable
   private CompletableFuture<Void> bk;
   @Nullable
   private fmw bl;
   private bod bm = boa.a;
   private int bn;
   private final bnx bo = new bnx(ad.c, () -> this.bn);
   private bpr bp = bpq.a;
   private final fit bq = new fit();
   private long br;
   private double bs;
   @Nullable
   private fcx.a bt;
   private final fic bu;
   private final gca bv;
   private gcp bw;
   private final fhy bx;
   private final eyi by;
   private boolean bz;
   private final long bA;
   private long bB;

   public fil(final fvy $$0) {
      super("Client");
      F = this;
      this.bA = System.currentTimeMillis();
      this.q = $$0.c.a;
      File $$1 = $$0.c.c;
      this.M = $$0.c.b.toPath();
      this.ac = $$0.d.b;
      this.ad = $$0.d.c;
      Path $$2 = this.q.toPath();
      this.by = esv.a($$2.resolve("allowed_symlinks.txt"));
      gxs $$3 = new gxs($$0.c.a(), this.by);
      this.al = new gzx(this, $$2.resolve("downloads"), $$0.a);
      aug $$4 = new atz(this.M, ath.a, auf.b, this.by);
      this.am = new aue($$3, this.al.a(), $$4);
      this.ak = $$3.a();
      this.ae = $$0.a.d;
      this.ax = new YggdrasilAuthenticationService(this.ae);
      this.ay = this.ax.createMinecraftSessionService();
      this.Y = $$0.a.a;
      this.N = CompletableFuture.supplyAsync(() -> this.ay.fetchProfile(this.Y.b(), true), ad.i());
      this.az = this.a(this.ax, $$0);
      this.aA = CompletableFuture.supplyAsync(() -> {
         try {
            return this.az.fetchProperties();
         } catch (AuthenticationException var2x) {
            G.error("Failed to fetch user properties", var2x);
            return UserApiService.OFFLINE_PROPERTIES;
         }
      }, ad.i());
      G.info("Setting user: {}", this.Y.c());
      G.debug("(Session ID is {})", this.Y.a());
      this.ag = $$0.d.a;
      this.ah = !$$0.d.d;
      this.ai = !$$0.d.e;
      this.aS = null;
      yi.a(fij::a);
      this.Q = ban.a();
      this.aJ = new fmv(this);
      this.bc = Thread.currentThread();
      this.n = new fip(this, this.q);
      RenderSystem.setShaderGlintAlpha(this.n.ap().c());
      this.bd = true;
      this.aK = new hdc(this, this.n);
      this.aa = new fig($$2, this.Q);
      G.info("Backend library: {}", RenderSystem.getBackendDescription());
      fbu $$5;
      if (this.n.p > 0 && this.n.o > 0) {
         $$5 = new fbu(this.n.o, this.n.p, $$0.b.c, $$0.b.d, $$0.b.e);
      } else {
         $$5 = $$0.b;
      }

      ad.c = RenderSystem.initBackendSystem();
      this.R = new gif(this);
      this.S = this.R.a($$5, this.n.k, this.bh());
      this.a(true);
      this.S.a(new Runnable() {
         private boolean c;

         @Override
         public void run() {
            if (!this.c) {
               this.c = true;
               fbr.a($$0.c.a, fil.this.bc.threadId());
            }
         }
      });
      hcp.a.b(hcl.A);

      try {
         this.S.a(this.ak, ab.b().g() ? fby.a : fby.b);
      } catch (IOException var13) {
         G.error("Couldn't set icon", var13);
      }

      this.o = new fim(this);
      this.o.a(this.S.i());
      this.p = new fik(this);
      this.p.a(this.S.i());
      RenderSystem.initRenderer(this.n.t, false);
      this.aq = new fbm(this.S.l(), this.S.m());
      this.aq.a(0.0F, 0.0F, 0.0F, 0.0F);
      this.aq.f();
      this.aj = new auq(ath.a);
      this.am.a();
      this.n.b(this.am);
      this.an = new gyk(this.n.ab, $$0x -> {
         if (this.t != null) {
            this.t.cw.C();
         }
      });
      this.aj.a(this.an);
      this.O = new gxc(this.aj);
      this.aj.a(this.O);
      this.P = new ghx(this.O);
      this.aj.a(this.P);
      this.aB = new gyd(this.O, $$1.toPath().resolve("skins"), this.ay, this);
      this.af = new esv($$2.resolve("saves"), $$2.resolve("backups"), this.by, this.Q);
      this.bx = new fhy($$2);
      this.ar = new hca(this.n);
      this.aj.a(this.ar);
      this.au = new gye(this.Y);
      this.aj.a(this.au);
      this.as = new hbv(this);
      this.at = new fna(this.O);
      this.h = this.at.a();
      this.i = this.at.b();
      this.aj.a(this.at);
      this.g();
      this.aj.a(new gxv());
      this.aj.a(new gxu());
      this.S.a("Startup");
      RenderSystem.setupDefaultState(0, 0, this.S.l(), this.S.m());
      this.S.a("Post startup");
      this.ao = fjn.a();
      this.ap = fjr.a(this.ao);
      this.aC = new gzn(this.O, this.ao, this.n.D().c());
      this.aj.a(this.aC);
      this.aM = new gah();
      this.aj.a(this.aM);
      this.aN = new gjq(this.h, this.aM, this::ap, this::as, this::aq);
      this.aj.a(this.aN);
      ggn $$8 = new ggn(this.aN, this.aM);
      this.aj.a($$8);
      this.W = new goh(this, this.O, this.aC, this.ap, $$8);
      this.aj.a(this.W);
      this.aG = new gxz(this.O);
      this.aH = new gxy(this.O);
      this.aj.a(this.aH);
      this.X = new ghf(this.aH, this.aG);

      try {
         int $$9 = Runtime.getRuntime().availableProcessors();
         fdg.a();
         this.U = new gho($$9);
      } catch (OutOfMemoryError var12) {
         TinyFileDialogs.tinyfd_messageBox(
            "Minecraft",
            "Oh no! The game was unable to allocate memory off-heap while trying to start. You may try to free some memory by closing other applications on your computer, check that your system meets the minimum requirements, and try again. If the problem persists, please visit: "
               + axz.k,
            "ok",
            "error",
            true
         );
         throw new fvz("Unable to allocate render buffers", var12);
      }

      this.aL = new fus(this, this.az);
      this.aD = new gij(this.aC.b(), $$8, this.ao);
      this.aj.a(this.aD);
      this.V = new gnh(this, this.O, this.W, this.X, this.aD, this.h, this.n, this.aM);
      this.aj.a(this.V);
      this.g = new geq(this.s, this.O);
      this.aj.a(this.g);
      this.aE = new gyb(this.O);
      this.aj.a(this.aE);
      this.aF = new gya(this.O);
      this.aj.a(this.aF);
      this.aI = new fjy(this.O);
      this.aj.a(this.aI);
      this.j = new ggw(this, this.V.d(), this.aj, this.U);
      this.f = new ghc(this, this.V, this.aN, this.U);
      this.aj.a(this.f);
      this.aj.a(this.f.z());
      this.av = new ggx();
      this.aj.a(this.av);
      this.aj.a(this.aw);
      this.m = new fjw(this);
      this.l = new glg(this);
      fdu $$11 = fdu.a(this);
      this.aQ = new ffi($$11);
      RenderSystem.setErrorCallback(this::a);
      if (this.aq.c != this.S.l() || this.aq.d != this.S.m()) {
         StringBuilder $$12 = new StringBuilder(
            "Recovering from unsupported resolution ("
               + this.S.l()
               + "x"
               + this.S.m()
               + ").\nPlease make sure you have up-to-date drivers (see aka.ms/mcdriver for instructions)."
         );
         if (fbw.b()) {
            $$12.append("\n\nReported GL debug messages:\n").append(String.join("\n", fbw.a()));
         }

         this.S.a(this.aq.c, this.aq.d);
         TinyFileDialogs.tinyfd_messageBox("Minecraft", $$12.toString(), "ok", "error", false);
      } else if (this.n.ac().c() && !this.S.j()) {
         this.S.h();
         this.n.ac().a(this.S.j());
      }

      this.S.a(this.n.P().c());
      this.S.b(this.n.H().c());
      this.S.d();
      this.a();
      this.j.a(this.ak.d());
      this.aO = new hce(this, this.az, this.Y);
      this.aP = gbt.a(this.az, this.Y, $$2);
      this.bu = new fic(this);
      this.bu.a(this.n.au().c() != fin.a);
      this.bv = new gca(this);
      this.bv.a(this.n.B().c());
      this.bw = gcp.a(gcm.a(), this.az);
      fpt.a(this);
      this.a(new fpo(xd.c("gui.loadingMinecraft")));
      List<atf> $$13 = this.am.g();
      this.bq.a(fit.b.a, $$13);
      aup $$14 = this.aj.a(ad.g(), this, J, $$13);
      hcp.a.a(hcl.C);
      fil.b $$15 = new fil.b($$11, $$0.e);
      this.a(new fpt(this, $$14, $$1x -> ad.a($$1x, $$1xx -> this.a($$1xx, $$15), () -> {
            if (ab.aW) {
               this.bk();
            }

            this.bq.a();
            this.a($$15);
         }), false));
      this.aR = ggk.a($$0.e.b());
      this.bh = new fbv(this.n, this);
   }

   private void a(@Nullable fil.b $$0) {
      if (!this.bz) {
         this.bz = true;
         this.b($$0);
      }
   }

   private void b(@Nullable fil.b $$0) {
      Runnable $$1 = this.c($$0);
      hcp.a.b(hcl.C);
      hcp.a.b(hcl.z);
      hcp.a.a(this.aO.a());
      $$1.run();
   }

   public boolean c() {
      return this.bz;
   }

   private Runnable c(@Nullable fil.b $$0) {
      List<Function<Runnable, fqd>> $$1 = new ArrayList<>();
      this.a($$1);
      Runnable $$2 = () -> {
         if ($$0 != null && $$0.b().a()) {
            ggj.a(this, $$0.b(), $$0.a());
         } else {
            this.a(new fqf(true));
         }
      };

      for (Function<Runnable, fqd> $$3 : Lists.reverse($$1)) {
         fqd $$4 = $$3.apply($$2);
         $$2 = () -> this.a($$4);
      }

      return $$2;
   }

   private void a(List<Function<Runnable, fqd>> $$0) {
      if (this.n.ac) {
         $$0.add($$0x -> new fov(this.n, $$0x));
      }

      BanDetails $$1 = this.H();
      if ($$1 != null) {
         $$0.add($$1x -> foy.a($$1xx -> {
               if ($$1xx) {
                  ad.m().a(axz.n);
               }

               $$1x.run();
            }, $$1));
      }

      ProfileResult $$2 = this.N.join();
      if ($$2 != null) {
         GameProfile $$3 = $$2.profile();
         Set<ProfileActionType> $$4 = $$2.actions();
         if ($$4.contains(ProfileActionType.FORCED_NAME_CHANGE)) {
            $$0.add($$1x -> foy.a($$3.getName(), $$1x));
         }

         if ($$4.contains(ProfileActionType.USING_BANNED_SKIN)) {
            $$0.add(foy::a);
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
      this.S.b(this.bh());
   }

   private String bh() {
      StringBuilder $$0 = new StringBuilder("Minecraft");
      if (e().a()) {
         $$0.append("*");
      }

      $$0.append(" ");
      $$0.append(ab.b().c());
      gbi $$1 = this.L();
      if ($$1 != null && $$1.k().i()) {
         $$0.append(" - ");
         gbv $$2 = this.S();
         if (this.aS != null && !this.aS.r()) {
            $$0.append(gyi.a("title.singleplayer"));
         } else if ($$2 != null && $$2.e()) {
            $$0.append(gyi.a("title.multiplayer.realms"));
         } else if (this.aS == null && ($$2 == null || !$$2.d())) {
            $$0.append(gyi.a("title.multiplayer.other"));
         } else {
            $$0.append(gyi.a("title.multiplayer.lan"));
         }
      }

      return $$0.toString();
   }

   private UserApiService a(YggdrasilAuthenticationService $$0, fvy $$1) {
      return $$1.a.a.g() != fiy.a.c ? UserApiService.OFFLINE : $$0.createUserApiService($$1.a.a.d());
   }

   public static azc e() {
      return azc.a("vanilla", ClientBrandRetriever::getClientModName, "Client", fil.class);
   }

   private void a(Throwable $$0, @Nullable fil.b $$1) {
      if (this.am.d().size() > 1) {
         this.a($$0, null, $$1);
      } else {
         ad.a($$0);
      }
   }

   public void a(Throwable $$0, @Nullable xd $$1, @Nullable fil.b $$2) {
      G.info("Caught error loading resourcepacks, removing all selected resourcepacks", $$0);
      this.bq.a($$0);
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

      this.a(new fqf());
      this.a(null);
   }

   private void a(@Nullable xd $$0) {
      fmv $$1 = this.aA();
      fmt.b($$1, fmt.a.c, xd.c("resourcePack.load_fail"), $$0);
   }

   public void f() {
      this.bc = Thread.currentThread();
      if (Runtime.getRuntime().availableProcessors() > 4) {
         this.bc.setPriority(10);
      }

      try {
         boolean $$0 = false;

         while (this.bd) {
            this.bj();

            try {
               bog $$1 = bog.a("Renderer");
               boolean $$2 = this.aR().e();
               this.bm = this.a($$2, $$1);
               this.bm.a();
               this.bp.c();
               this.c(!$$0);
               this.bp.d();
               this.bm.b();
               this.b($$2, $$1);
            } catch (OutOfMemoryError var4) {
               if ($$0) {
                  throw var4;
               }

               this.bl();
               this.a(new fpw());
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
      this.at.a(this.n);
   }

   private void a(int $$0, long $$1) {
      this.n.P().a(false);
      this.n.ay();
   }

   public fbo h() {
      return this.aq;
   }

   public String i() {
      return this.ac;
   }

   public String j() {
      return this.ad;
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
      o $$1 = this.d($$0);
      this.bl();
      a(this, this.q, $$1);
   }

   public static int a(File $$0, o $$1) {
      Path $$2 = $$0.toPath().resolve("crash-reports");
      Path $$3 = $$2.resolve("crash-" + ad.f() + "-client.txt");
      ale.a($$1.a(y.a));
      if ($$1.e() != null) {
         ale.a("#@!@# Game crashed! Crash report saved to: #@!@# " + $$1.e().toAbsolutePath());
         return -1;
      } else if ($$1.a($$3, y.a)) {
         ale.a("#@!@# Game crashed! Crash report saved to: #@!@# " + $$3.toAbsolutePath());
         return -1;
      } else {
         ale.a("#@?@# Game crashed! Crash report could not be saved. #@?@#");
         return -2;
      }
   }

   public static void a(@Nullable fil $$0, File $$1, o $$2) {
      int $$3 = a($$1, $$2);
      if ($$0 != null) {
         $$0.ar.h();
      }

      System.exit($$3);
   }

   public boolean k() {
      return this.n.R().c();
   }

   public CompletableFuture<Void> l() {
      return this.a(false, null);
   }

   private CompletableFuture<Void> a(boolean $$0, @Nullable fil.b $$1) {
      if (this.bk != null) {
         return this.bk;
      } else {
         CompletableFuture<Void> $$2 = new CompletableFuture<>();
         if (!$$0 && this.ba instanceof fpt) {
            this.bk = $$2;
            return $$2;
         } else {
            this.am.a();
            List<atf> $$3 = this.am.g();
            if (!$$0) {
               this.bq.a(fit.b.b, $$3);
            }

            this.a(new fpt(this, this.aj.a(ad.g(), this, J, $$3), $$3x -> ad.a($$3x, $$2xx -> {
                  if ($$0) {
                     this.al.c();
                     this.bi();
                  } else {
                     this.a($$2xx, $$1);
                  }
               }, () -> {
                  this.f.e();
                  this.bq.a();
                  this.al.d();
                  $$2.complete(null);
                  this.a($$1);
               }), !$$0));
            return $$2;
         }
      }
   }

   private void bk() {
      boolean $$0 = false;
      gii $$1 = this.ap().a();
      gzd $$2 = $$1.a().a();

      for (dhj $$3 : lu.e) {
         UnmodifiableIterator $$10 = $$3.n().a().iterator();

         while ($$10.hasNext()) {
            duo $$4 = (duo)$$10.next();
            if ($$4.o() == dnq.c) {
               gzd $$5 = $$1.b($$4);
               if ($$5 == $$2) {
                  G.debug("Missing model for: {}", $$4);
                  $$0 = true;
               }
            }
         }
      }

      gxb $$6 = $$2.e();

      for (dhj $$7 : lu.e) {
         UnmodifiableIterator var17 = $$7.n().a().iterator();

         while (var17.hasNext()) {
            duo $$8 = (duo)var17.next();
            gxb $$9 = $$1.a($$8);
            if (!$$8.l() && $$9 == $$6) {
               G.debug("Missing particle icon for: {}", $$8);
            }
         }
      }

      for (cvk $$10 : lu.g) {
         cvp $$11 = $$10.v();
         String $$12 = $$11.v();
         String $$13 = xd.c($$12).getString();
         if ($$13.toLowerCase(Locale.ROOT).equals($$10.a())) {
            G.debug("Missing translation for: {} {} {}", new Object[]{$$11, $$12, $$10});
         }
      }

      $$0 |= fpu.a();
      $$0 |= gnk.a();
      if ($$0) {
         throw new IllegalStateException("Your game data is foobar, fix the errors above!");
      }
   }

   public esv m() {
      return this.af;
   }

   private void a(String $$0) {
      fil.a $$1 = this.J();
      if (!$$1.a(this.T())) {
         if (this.m.b()) {
            this.m.b(false);
            this.a(new fpa($$0x -> {
               if ($$0x) {
                  ad.m().a(axz.g);
               }

               this.a(null);
            }, fil.a.e, axz.g, true));
         } else {
            xd $$2 = $$1.a();
            this.m.a($$2, false);
            this.bu.c($$2);
            this.m.b($$1 == fil.a.d);
         }
      } else {
         this.a(new foz($$0));
      }
   }

   public void a(@Nullable fqd $$0) {
      if (ab.aW && Thread.currentThread() != this.bc) {
         G.error("setScreen called from non-game thread");
      }

      if (this.z != null) {
         this.z.j();
      } else {
         this.a(fii.a);
      }

      if ($$0 == null && this.bb) {
         throw new IllegalStateException("Trying to return to in-game GUI during disconnection");
      } else {
         if ($$0 == null && this.s == null) {
            $$0 = new fqf();
         } else if ($$0 == null && this.t.eB()) {
            if (this.t.m()) {
               $$0 = new fph(null, this.s.j().l());
            } else {
               this.t.ga();
            }
         }

         this.z = $$0;
         if (this.z != null) {
            this.z.aJ_();
         }

         fda.a();
         if ($$0 != null) {
            this.o.j();
            fij.b();
            $$0.b(this, this.S.p(), this.S.q());
            this.y = false;
         } else {
            this.ar.i();
            this.o.i();
         }

         this.d();
      }
   }

   public void a(@Nullable fpx $$0) {
      this.ba = $$0;
   }

   public void n() {
      try {
         G.info("Stopping!");

         try {
            this.bu.c();
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
         if (this.be == null) {
            System.exit(0);
         }
      }
   }

   @Override
   public void close() {
      if (this.bt != null) {
         this.bt.a();
      }

      try {
         this.aO.close();
         this.aw.close();
         this.aC.close();
         this.at.close();
         this.j.close();
         this.P.close();
         this.f.close();
         this.ar.g();
         this.g.a();
         this.aF.close();
         this.aE.close();
         this.aH.close();
         this.aI.close();
         this.aG.close();
         this.O.close();
         this.aj.close();
         fnm.b();
         ad.j();
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

      if (this.bk != null && !(this.ba instanceof fpt)) {
         CompletableFuture<Void> $$1 = this.bk;
         this.bk = null;
         this.l().thenRun(() -> $$1.complete(null));
      }

      Runnable $$2;
      while (($$2 = this.bj.poll()) != null) {
         $$2.run();
      }

      int $$3 = this.T.a(ad.c(), $$0);
      if ($$0) {
         this.bm.a("scheduledExecutables");
         this.bC();
         this.bm.c();
         this.bm.a("tick");

         for (int $$4 = 0; $$4 < Math.min(10, $$3); $$4++) {
            this.bm.d("clientTick");
            this.t();
         }

         this.bm.c();
      }

      this.S.a("Render");
      this.bm.a("sound");
      this.ar.a(this.j.k());
      this.bm.b("toasts");
      this.aJ.a();
      this.bm.b("render");
      long $$5 = ad.d();
      boolean $$7;
      if (!this.aR().d() && !this.bp.e()) {
         $$7 = false;
         this.bs = 0.0;
      } else {
         $$7 = this.bt == null || this.bt.b();
         if ($$7) {
            fcx.a().ifPresent(fcx::b);
         }
      }

      RenderSystem.clear(16640);
      this.aq.a(true);
      RenderSystem.setShaderFog(ggu.a);
      this.bm.a("display");
      RenderSystem.enableCull();
      this.bm.b("mouse");
      this.o.a();
      this.bm.c();
      if (!this.y) {
         this.bm.b("gameRenderer");
         this.j.a(this.T, $$0);
         this.bm.c();
      }

      this.bm.a("blit");
      this.aq.e();
      this.aq.c(this.S.l(), this.S.m());
      this.bg = ad.d() - $$5;
      if ($$7) {
         fcx.a().ifPresent($$0x -> this.bt = $$0x.c());
      }

      this.bm.b("updateDisplay");
      this.S.e();
      int $$8 = this.bh.a();
      if ($$8 < 260) {
         RenderSystem.limitDisplayFPS($$8);
      }

      this.bm.b("yield");
      Thread.yield();
      this.bm.c();
      this.S.a("Post render");
      this.aZ++;
      this.aW = this.U() && (this.z != null && this.z.k() || this.ba != null && this.ba.a()) && !this.aS.r();
      this.T.b(this.aW);
      this.T.c(!this.bq());
      long $$9 = ad.d();
      long $$10 = $$9 - this.aX;
      if ($$7) {
         this.br = $$10;
      }

      this.aR().a($$10);
      this.aX = $$9;
      this.bm.a("fpsUpdate");
      if (this.bt != null && this.bt.b()) {
         this.bs = (double)this.bt.c() * 100.0 / (double)this.br;
      }

      while (ad.c() >= this.aY + 1000L) {
         String $$11;
         if (this.bs > 0.0) {
            $$11 = " GPU: " + (this.bs > 100.0 ? n.m + "100%" : Math.round(this.bs) + "%");
         } else {
            $$11 = "";
         }

         bf = this.aZ;
         this.A = String.format(
            Locale.ROOT,
            "%d fps T: %s%s%s%s B: %d%s",
            bf,
            $$8 == 260 ? "inf" : $$8,
            this.n.P().c() ? " vsync " : " ",
            this.n.k().c(),
            this.n.j().c() == fhx.a ? "" : (this.n.j().c() == fhx.b ? " fast-clouds" : " fancy-clouds"),
            this.n.F().c(),
            $$11
         );
         this.aY += 1000L;
         this.aZ = 0;
      }

      this.bm.c();
   }

   private bod a(boolean $$0, @Nullable bog $$1) {
      if (!$$0) {
         this.bo.b();
         if (!this.bp.e() && $$1 == null) {
            return boa.a;
         }
      }

      bod $$2;
      if ($$0) {
         if (!this.bo.a()) {
            this.bn = 0;
            this.bo.c();
         }

         this.bn++;
         $$2 = this.bo.d();
      } else {
         $$2 = boa.a;
      }

      if (this.bp.e()) {
         $$2 = bod.a($$2, this.bp.f());
      }

      return bog.a($$2, $$1);
   }

   private void b(boolean $$0, @Nullable bog $$1) {
      if ($$1 != null) {
         $$1.b();
      }

      fmd $$2 = this.aR().o();
      if ($$0) {
         $$2.a(this.bo.e());
      } else {
         $$2.a(null);
      }

      this.bm = this.bo.d();
   }

   @Override
   public void a() {
      int $$0 = this.S.a(this.n.as().c(), this.k());
      this.S.a((double)$$0);
      if (this.z != null) {
         this.z.a(this, this.S.p(), this.S.q());
      }

      fbo $$1 = this.h();
      $$1.a(this.S.l(), this.S.m());
      this.j.a(this.S.l(), this.S.m());
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
      try {
         azb.b();
      } catch (Throwable var3) {
      }

      try {
         System.gc();
         if (this.aU && this.aS != null) {
            this.aS.a(true);
         }

         this.b((fqd)(new fpo(xd.c("menu.savingLevel"))));
      } catch (Throwable var2) {
      }

      System.gc();
   }

   public boolean a(Consumer<xd> $$0) {
      if (this.bp.e()) {
         this.bm();
         return false;
      } else {
         Consumer<boc> $$1 = $$1x -> {
            if ($$1x != bny.a) {
               int $$2x = $$1x.f();
               double $$3x = (double)$$1x.g() / (double)bae.a;
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
         ac $$3 = a(new ac(), this, this.an, this.ac, this.n);
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
            CompletableFuture.allOf($$6, $$7).thenRunAsync(() -> $$4.accept(ImmutableList.of($$6.join(), $$7.join())), ad.h());
            this.aS.a($$0x -> {
            }, $$7::complete);
            $$5 = $$6::complete;
         }

         this.bp = bpp.a(new ggh(ad.c, this.f), ad.c, ad.h(), new bpv("client"), $$1x -> {
            this.bp = bpq.a;
            $$1.accept($$1x);
         }, $$5);
         return true;
      }
   }

   private void bm() {
      this.bp.a();
      if (this.aS != null) {
         this.aS.aW();
      }
   }

   private void bn() {
      this.bp.b();
      if (this.aS != null) {
         this.aS.aX();
      }
   }

   private Path a(ac $$0, List<Path> $$1) {
      String $$2;
      if (this.T()) {
         $$2 = this.V().ba().e();
      } else {
         gbv $$3 = this.S();
         $$2 = $$3 != null ? $$3.a : "unknown";
      }

      Path $$7;
      try {
         String $$5 = String.format(Locale.ROOT, "%s-%s-%s", ad.f(), $$2, ab.b().b());
         String $$6 = v.a(bpv.a, $$5, ".zip");
         $$7 = bpv.a.resolve($$6);
      } catch (IOException var21) {
         throw new UncheckedIOException(var21);
      }

      try (ayo $$10 = new ayo($$7)) {
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
      this.bd = false;
   }

   public boolean r() {
      return this.bd;
   }

   public void b(boolean $$0) {
      if (this.z == null) {
         boolean $$1 = this.U() && !this.aS.r();
         if ($$1) {
            this.a(new fpy(!$$0));
            this.ar.e();
         } else {
            this.a(new fpy(true));
         }
      }
   }

   private void d(boolean $$0) {
      if (!$$0) {
         this.x = 0;
      }

      if (this.x <= 0 && !this.t.fv()) {
         if ($$0 && this.w != null && this.w.d() == eyq.a.b) {
            eyo $$1 = (eyo)this.w;
            je $$2 = $$1.b();
            if (!this.s.a_($$2).l()) {
               jj $$3 = $$1.c();
               if (this.r.b($$2, $$3)) {
                  this.g.a($$2, $$3);
                  this.t.a(bro.a);
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
         cvp $$0 = this.t.b(bro.a);
         if (!$$0.a(this.s.J())) {
            return false;
         } else {
            boolean $$1 = false;
            switch (this.w.d()) {
               case c:
                  this.r.a(this.t, ((eyp)this.w).a());
                  break;
               case b:
                  eyo $$2 = (eyo)this.w;
                  je $$3 = $$2.b();
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

                  this.t.gw();
            }

            this.t.a(bro.a);
            return $$1;
         }
      }
   }

   private void bp() {
      if (!this.r.k()) {
         this.aV = 4;
         if (!this.t.C()) {
            if (this.w == null) {
               G.warn("Null returned as 'hitResult', this shouldn't happen!");
            }

            for (bro $$0 : bro.values()) {
               cvp $$1 = this.t.b($$0);
               if (!$$1.a(this.s.J())) {
                  return;
               }

               if (this.w != null) {
                  switch (this.w.d()) {
                     case c:
                        eyp $$2 = (eyp)this.w;
                        bto $$3 = $$2.a();
                        if (!this.s.A_().a($$3.ds())) {
                           return;
                        }

                        brp $$4 = this.r.a(this.t, $$3, $$2, $$0);
                        if (!$$4.a()) {
                           $$4 = this.r.a(this.t, $$3, $$0);
                        }

                        if ($$4 instanceof brp.d $$5) {
                           if ($$5.e() == brp.e.b) {
                              this.t.a($$0);
                           }

                           return;
                        }
                        break;
                     case b:
                        eyo $$6 = (eyo)this.w;
                        int $$7 = $$1.J();
                        brp $$8 = this.r.a(this.t, $$0, $$6);
                        if ($$8 instanceof brp.d $$9) {
                           if ($$9.e() == brp.e.b) {
                              this.t.a($$0);
                              if (!$$1.f() && ($$1.J() != $$7 || this.r.f())) {
                                 this.j.c.a($$0);
                              }
                           }

                           return;
                        }

                        if ($$8 instanceof brp.a) {
                           return;
                        }
                  }
               }

               if (!$$1.f() && this.r.a(this.t, $$0) instanceof brp.d $$11) {
                  if ($$11.e() == brp.e.b) {
                     this.t.a($$0);
                  }

                  this.j.c.a($$0);
                  return;
               }
            }
         }
      }
   }

   public hbv s() {
      return this.as;
   }

   public void t() {
      this.bB++;
      if (this.s != null && !this.aW) {
         this.s.s().m();
      }

      if (this.aV > 0) {
         this.aV--;
      }

      this.bm.a("gui");
      this.bv.a();
      this.m.a(this.aW);
      this.bm.c();
      this.j.a(1.0F);
      this.aK.a(this.s, this.w);
      this.bm.a("gameMode");
      if (!this.aW && this.s != null) {
         this.r.c();
      }

      this.bm.b("textures");
      if (this.bq()) {
         this.O.f();
      }

      if (this.z != null || this.t == null) {
         if (this.z instanceof fpq $$0 && !this.t.fM()) {
            $$0.m();
         }
      } else if (this.t.eB() && !(this.z instanceof fph)) {
         this.a(null);
      } else if (this.t.fM() && this.s != null) {
         this.a(new fpq());
      }

      if (this.z != null) {
         this.x = 10000;
      }

      if (this.z != null) {
         fqd.a(() -> this.z.e(), "Ticking screen", this.z.getClass().getCanonicalName());
      }

      if (!this.aR().d()) {
         this.m.l();
      }

      if (this.ba == null && this.z == null) {
         this.bm.b("Keybindings");
         this.bs();
         if (this.x > 0) {
            this.x--;
         }
      }

      if (this.s != null) {
         this.bm.b("gameRenderer");
         if (!this.aW) {
            this.j.e();
         }

         this.bm.b("levelRenderer");
         if (!this.aW) {
            this.f.n();
         }

         this.bm.b("level");
         if (!this.aW) {
            this.s.e();
         }
      } else if (this.j.f() != null) {
         this.j.b();
      }

      if (!this.aW) {
         this.as.a();
      }

      this.ar.a(this.aW);
      if (this.s != null) {
         if (!this.aW) {
            if (!this.n.s && this.br()) {
               xd $$1 = xd.c("tutorial.socialInteractions.title");
               xd $$2 = xd.a("tutorial.socialInteractions.description", hdc.a("socialInteractions"));
               this.bl = new fmw(fmw.a.f, $$1, $$2, true, 8000);
               this.aJ.a(this.bl);
               this.n.s = true;
               this.n.ay();
            }

            this.aK.d();

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

         this.bm.b("animateTick");
         if (!this.aW && this.bq()) {
            this.s.b(this.t.dw(), this.t.dy(), this.t.dC());
         }

         this.bm.b("particles");
         if (!this.aW && this.bq()) {
            this.g.b();
         }

         gbi $$6 = this.L();
         if ($$6 != null && !this.aW) {
            $$6.b(ahc.a);
         }
      } else if (this.aT != null) {
         this.bm.b("pendingConnection");
         this.aT.b();
      }

      this.bm.b("keyboard");
      this.p.b();
      this.bm.c();
   }

   private boolean bq() {
      return this.s == null || this.s.s().i();
   }

   private boolean br() {
      return !this.aU || this.aS != null && this.aS.r();
   }

   private void bs() {
      while (this.n.N.g()) {
         fhv $$0 = this.n.aD();
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
            if (this.t.P_()) {
               this.m.g().a($$1);
            } else if (!this.t.f() || this.z != null || !$$3 && !$$2) {
               this.t.gc().j = $$1;
            } else {
               frh.a(this, $$1, $$3, $$2);
            }
         }
      }

      while (this.n.L.g()) {
         if (!this.br()) {
            this.t.a(K, true);
            this.bu.c(K);
         } else {
            if (this.bl != null) {
               this.bl.d();
               this.bl = null;
            }

            this.a(new fuu());
         }
      }

      while (this.n.C.g()) {
         if (this.r.g()) {
            this.t.h();
         } else {
            this.aK.a();
            this.a(new frs(this.t));
         }
      }

      while (this.n.R.g()) {
         this.a(new fqn(this.t.cw.p()));
      }

      while (this.n.D.g()) {
         if (!this.t.P_()) {
            this.L().b(new ahv(ahv.a.g, je.c, jj.a));
         }
      }

      while (this.n.E.g()) {
         if (!this.t.P_() && this.t.a(fqd.s())) {
            this.t.a(bro.a);
         }
      }

      while (this.n.I.g()) {
         this.a("");
      }

      if (this.z == null && this.ba == null && this.n.K.g()) {
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
            $$4 |= this.bo();
         }

         while (this.n.F.g()) {
            this.bp();
         }

         while (this.n.H.g()) {
            this.bu();
         }
      }

      if (this.n.F.e() && this.aV == 0 && !this.t.fv()) {
         this.bp();
      }

      this.d(this.z == null && !$$4 && this.n.G.e() && this.o.h());
   }

   public hce u() {
      return this.aO;
   }

   public double v() {
      return this.bs;
   }

   public gbt w() {
      return this.aP;
   }

   public fvk x() {
      return new fvk(this, this.af);
   }

   public void a(esv.c $$0, aue $$1, amb $$2, boolean $$3) {
      this.y();
      this.Z.set(null);
      Instant $$4 = Instant.now();

      try {
         $$0.a($$2.c().a(), $$2.d());
         alx $$5 = alx.a(this.ax, this.q);
         $$5.f().a(this);
         dtg.a($$5, this);
         avd.a(false);
         this.aS = MinecraftServer.a((Function<Thread, hbj>)($$4x -> new hbj($$4x, this, $$0, $$1, $$2, $$5, $$0xx -> {
               aru $$1xx = aru.b($$0xx + 0);
               this.Z.set($$1xx);
               return art.a($$1xx, this.bj::add);
            })));
         this.aU = true;
         this.a(gcm.a());
         this.aR.a(ggk.c.a, $$0.f(), $$2.d().e());
      } catch (Throwable var11) {
         o $$7 = o.a(var11, "Starting integrated server");
         p $$8 = $$7.a("Starting integrated server");
         $$8.a("Level ID", $$0.f());
         $$8.a("Level Name", () -> $$2.d().e());
         throw new z($$7);
      }

      while (this.Z.get() == null) {
         Thread.yield();
      }

      fpr $$9 = new fpr(this.Z.get());
      this.a($$9);
      this.bm.a("waitForServer");

      for (; !this.aS.ai() || this.ba != null; this.bj()) {
         $$9.e();
         this.c(false);

         try {
            Thread.sleep(16L);
         } catch (InterruptedException var10) {
         }
      }

      this.bm.c();
      Duration $$10 = Duration.between($$4, Instant.now());
      SocketAddress $$11 = this.aS.ah().a();
      vx $$12 = vx.a($$11);
      $$12.a($$11.toString(), 0, new gbg($$12, this, null, null, $$3, $$10, $$0x -> {
      }, null));
      $$12.a(new aji(this.X().c(), this.X().b()));
      this.aT = $$12;
   }

   public void a(gbh $$0, fqb.a $$1) {
      this.e(new fqb(() -> false, $$1));
      this.s = $$0;
      this.a($$0);
      if (!this.aU) {
         alx $$2 = alx.a(this.ax, this.q);
         $$2.f().a(this);
         dtg.a($$2, this);
         avd.a(false);
      }
   }

   public void y() {
      this.a(new fqa(true), false);
   }

   public void b(fqd $$0) {
      this.a($$0, false);
   }

   public void a(fqd $$0, boolean $$1) {
      gbi $$2 = this.L();
      if ($$2 != null) {
         this.bB();
         $$2.h();
         if (!$$1) {
            this.z();
         }
      }

      this.aL.b();
      if (this.bp.e()) {
         this.bn();
      }

      hbj $$3 = this.aS;
      this.aS = null;
      this.j.h();
      this.r = null;
      this.bu.b();
      this.bb = true;

      try {
         this.e($$0);
         if (this.s != null) {
            if ($$3 != null) {
               this.bm.a("waitForServer");

               while (!$$3.I()) {
                  this.c(false);
               }

               this.bm.c();
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

      dtg.b();
   }

   public void z() {
      this.al.i();
      this.bC();
   }

   public void c(fqd $$0) {
      gbi $$1 = this.L();
      if ($$1 != null) {
         $$1.i();
      }

      if (this.bp.e()) {
         this.bn();
      }

      this.j.h();
      this.r = null;
      this.bu.b();
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

      dtg.b();
   }

   private void e(fqd $$0) {
      this.bm.a("forcedTick");
      this.ar.f();
      this.u = null;
      this.aT = null;
      this.a($$0);
      this.c(false);
      this.bm.c();
   }

   public void d(fqd $$0) {
      this.bm.a("forcedTick");
      this.a($$0);
      this.c(false);
      this.bm.c();
   }

   private void a(@Nullable gbh $$0) {
      this.f.a($$0);
      this.g.a($$0);
      this.aN.a($$0);
      this.d();
   }

   private UserProperties bt() {
      return this.aA.join();
   }

   public boolean C() {
      return this.D() && this.n.ak().c();
   }

   public boolean D() {
      return this.E() && this.bt().flag(UserFlag.OPTIONAL_TELEMETRY_AVAILABLE);
   }

   public boolean E() {
      return ab.aW ? false : this.bt().flag(UserFlag.TELEMETRY_ENABLED);
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
      return this.J().a(false) ? this.aL.c($$0) : (this.t == null || !$$0.equals(this.t.cD())) && !$$0.equals(ad.e);
   }

   public fil.a J() {
      if (this.n.n().c() == cns.c) {
         return fil.a.b;
      } else if (!this.ai) {
         return fil.a.c;
      } else {
         return !this.bt().flag(UserFlag.CHAT_ALLOWED) ? fil.a.d : fil.a.a;
      }
   }

   public final boolean K() {
      return this.ag;
   }

   @Nullable
   public gbi L() {
      return this.t == null ? null : this.t.cw;
   }

   public static boolean M() {
      return !F.n.X;
   }

   public static boolean N() {
      return F.n.k().c().b() >= fid.b.b();
   }

   public static boolean O() {
      return !F.j.a() && F.n.k().c().b() >= fid.c.b();
   }

   public static boolean P() {
      return F.n.l().c();
   }

   private void bu() {
      if (this.w != null && this.w.d() != eyq.a.a) {
         boolean $$0 = this.t.gd().d;
         drs $$1 = null;
         eyq.a $$2 = this.w.d();
         cvp $$6;
         if ($$2 == eyq.a.b) {
            je $$3 = ((eyo)this.w).b();
            duo $$4 = this.s.a_($$3);
            if ($$4.l()) {
               return;
            }

            dhj $$5 = $$4.b();
            $$6 = $$5.a((dej)this.s, $$3, $$4);
            if ($$6.f()) {
               return;
            }

            if ($$0 && fqd.s() && $$4.x()) {
               $$1 = this.s.c_($$3);
            }
         } else {
            if ($$2 != eyq.a.c || !$$0) {
               return;
            }

            bto $$7 = ((eyp)this.w).a();
            $$6 = $$7.dF();
            if ($$6 == null) {
               return;
            }
         }

         if ($$6.f()) {
            String $$10 = "";
            if ($$2 == eyq.a.b) {
               $$10 = lu.e.b(this.s.a_(((eyo)this.w).b()).b()).toString();
            } else if ($$2 == eyq.a.c) {
               $$10 = lu.f.b(((eyp)this.w).a().ao()).toString();
            }

            G.warn("Picking on: [{}] {} gave null item", $$2, $$10);
         } else {
            cnt $$11 = this.t.gc();
            if ($$1 != null) {
               this.a($$6, $$1, this.s.F_());
            }

            int $$12 = $$11.c($$6);
            if ($$0) {
               $$11.b($$6);
               this.r.a(this.t.b(bro.a), 36 + $$11.j);
            } else if ($$12 != -1) {
               if (cnt.d($$12)) {
                  $$11.j = $$12;
               } else {
                  this.r.a($$12);
               }
            }
         }
      }
   }

   private void a(cvp $$0, drs $$1, kb $$2) {
      uf $$3 = $$1.f($$2);
      $$1.a($$3);
      ctr.a($$0, $$1.q(), $$3);
      $$0.b($$1.r());
   }

   public o d(o $$0) {
      ac $$1 = $$0.f();
      a($$1, this, this.an, this.ac, this.n);
      this.a($$0.a("Uptime"));
      if (this.s != null) {
         this.s.a($$0);
      }

      if (this.aS != null) {
         this.aS.b($$1);
      }

      this.bq.a($$0);
      return $$0;
   }

   public static void a(@Nullable fil $$0, @Nullable gyk $$1, String $$2, @Nullable fip $$3, o $$4) {
      ac $$5 = $$4.f();
      a($$5, $$0, $$1, $$2, $$3);
   }

   private static String a(double $$0) {
      return String.format(Locale.ROOT, "%.3fs", $$0);
   }

   private void a(p $$0) {
      $$0.a("JVM uptime", () -> a((double)ManagementFactory.getRuntimeMXBean().getUptime() / 1000.0));
      $$0.a("Wall uptime", () -> a((double)(System.currentTimeMillis() - this.bA) / 1000.0));
      $$0.a("High-res time", () -> a((double)ad.c() / 1000.0));
      $$0.a("Client ticks", () -> String.format(Locale.ROOT, "%d ticks / %.3fs", this.bB, (double)this.bB / 20.0));
   }

   private static ac a(ac $$0, @Nullable fil $$1, @Nullable gyk $$2, String $$3, @Nullable fip $$4) {
      $$0.a("Launched Version", () -> $$3);
      String $$5 = bg();
      if ($$5 != null) {
         $$0.a("Launcher name", $$5);
      }

      $$0.a("Backend library", RenderSystem::getBackendDescription);
      $$0.a("Backend API", RenderSystem::getApiDescription);
      $$0.a("Window size", () -> $$1 != null ? $$1.S.l() + "x" + $$1.S.m() : "<not initialized>");
      $$0.a("GFLW Platform", fch::a);
      $$0.a("GL Caps", RenderSystem::getCapsString);
      $$0.a("GL debug messages", () -> fbw.b() ? String.join("\n", fbw.a()) : "<disabled>");
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
         $$0.a("Resource Packs", () -> aue.a($$1.ad().f()));
      }

      if ($$2 != null) {
         $$0.a("Current Language", () -> $$2.a());
      }

      $$0.a("Locale", String.valueOf(Locale.getDefault()));
      $$0.a("System encoding", () -> System.getProperty("sun.jnu.encoding", "<not set>"));
      $$0.a("File encoding", () -> System.getProperty("file.encoding", "<not set>"));
      $$0.a("CPU", fbx::b);
      return $$0;
   }

   public static fil Q() {
      return F;
   }

   public CompletableFuture<Void> R() {
      return this.a(this::l).thenCompose($$0 -> (CompletionStage<Void>)$$0);
   }

   public void a(gcm $$0) {
      if (!this.bw.a($$0)) {
         this.bw = gcp.a($$0, this.az);
      }
   }

   @Nullable
   public gbv S() {
      return x.a(this.L(), gbi::x);
   }

   public boolean T() {
      return this.aU;
   }

   public boolean U() {
      return this.aU && this.aS != null;
   }

   @Nullable
   public hbj V() {
      return this.aS;
   }

   public boolean W() {
      hbj $$0 = this.V();
      return $$0 != null && !$$0.r();
   }

   public boolean b(UUID $$0) {
      return $$0.equals(this.X().b());
   }

   public fiy X() {
      return this.Y;
   }

   public GameProfile Y() {
      ProfileResult $$0 = this.N.join();
      return $$0 != null ? $$0.profile() : new GameProfile(this.Y.b(), this.Y.c());
   }

   public Proxy Z() {
      return this.ae;
   }

   public gxc aa() {
      return this.O;
   }

   public ghx ab() {
      return this.P;
   }

   public aut ac() {
      return this.aj;
   }

   public aue ad() {
      return this.am;
   }

   public atj ae() {
      return this.ak;
   }

   public gzx af() {
      return this.al;
   }

   public Path ag() {
      return this.M;
   }

   public gyk ah() {
      return this.an;
   }

   public Function<alc, gxb> a(alc $$0) {
      return this.aC.a($$0)::a;
   }

   public boolean ai() {
      return this.aW;
   }

   public ggx aj() {
      return this.av;
   }

   public hca ak() {
      return this.ar;
   }

   public awb al() {
      awb $$0 = x.a(this.z, fqd::C);
      if ($$0 != null) {
         return $$0;
      } else if (this.t != null) {
         if (this.t.dS().ag() == deg.j) {
            return this.m.j().b() ? awc.d : awc.e;
         } else {
            jn<dfh> $$1 = this.t.dS().t(this.t.ds());
            if (!this.as.c(awc.f) && (!this.t.bn() || !$$1.a(aws.Z))) {
               return this.t.dS().ag() != deg.i && this.t.gd().d && this.t.gd().c ? awc.b : $$1.a().o().orElse(awc.g);
            } else {
               return awc.f;
            }
         }
      } else {
         return awc.a;
      }
   }

   public MinecraftSessionService am() {
      return this.ay;
   }

   public gyd an() {
      return this.aB;
   }

   @Nullable
   public bto ao() {
      return this.u;
   }

   public void a(bto $$0) {
      this.u = $$0;
      this.j.a($$0);
   }

   public boolean b(bto $$0) {
      return $$0.cl() || this.t != null && this.t.P_() && this.n.Q.e() && $$0.ao() == btv.by;
   }

   @Override
   protected Thread ay() {
      return this.bc;
   }

   @Override
   protected Runnable f(Runnable $$0) {
      return $$0;
   }

   @Override
   protected boolean e(Runnable $$0) {
      return true;
   }

   public gij ap() {
      return this.aD;
   }

   public gnh aq() {
      return this.V;
   }

   public gjq ar() {
      return this.aN;
   }

   public goh as() {
      return this.W;
   }

   public ghf at() {
      return this.X;
   }

   public DataFixer au() {
      return this.Q;
   }

   public fib av() {
      return this.T;
   }

   public fjn aw() {
      return this.ao;
   }

   public boolean az() {
      return this.t != null && this.t.gs() || this.n.X().c();
   }

   public fmv aA() {
      return this.aJ;
   }

   public hdc aB() {
      return this.aK;
   }

   public boolean aC() {
      return this.bi;
   }

   public fig aD() {
      return this.aa;
   }

   public gzn aE() {
      return this.aC;
   }

   public gyb aF() {
      return this.aE;
   }

   public gya aG() {
      return this.aF;
   }

   public gxz aH() {
      return this.aG;
   }

   public gxy aI() {
      return this.aH;
   }

   public fjy aJ() {
      return this.aI;
   }

   @Override
   public void a(boolean $$0) {
      this.bi = $$0;
   }

   public xd a(File $$0, int $$1, int $$2) {
      int $$3 = this.S.l();
      int $$4 = this.S.m();
      fbo $$5 = new fbp($$1, $$2, true);
      float $$6 = this.t.dK();
      float $$7 = this.t.dI();
      float $$8 = this.t.P;
      float $$9 = this.t.O;
      this.j.b(false);

      xr var12;
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

            this.t.O = this.t.dI();
            this.t.P = this.t.dK();
            $$5.a(true);
            this.j.a(fib.b);

            try {
               Thread.sleep(10L);
            } catch (InterruptedException var17) {
            }

            fiu.a($$0, "panorama_" + $$10 + ".png", $$5, $$0x -> {
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
         this.S.a($$3);
         this.S.b($$4);
         $$5.a();
         this.j.c(false);
         this.h().a(true);
      }

      return var12;
   }

   private xd a(File $$0, int $$1, int $$2, int $$3, int $$4) {
      try {
         ByteBuffer $$5 = fbx.a($$1 * $$2 * 3);
         fiu $$6 = new fiu($$0, $$3, $$4, $$2);
         float $$7 = (float)$$3 / (float)$$1;
         float $$8 = (float)$$4 / (float)$$2;
         float $$9 = $$7 > $$8 ? $$7 : $$8;

         for (int $$10 = ($$4 - 1) / $$2 * $$2; $$10 >= 0; $$10 -= $$2) {
            for (int $$11 = 0; $$11 < $$3; $$11 += $$1) {
               RenderSystem.setShaderTexture(0, gxa.d);
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
         fbx.a($$5);
         xd $$15 = xd.b($$14.getName()).a(n.t).a($$1x -> $$1x.a(new xb(xb.a.b, $$14.getAbsolutePath())));
         return xd.a("screenshot.success", $$15);
      } catch (Exception var15) {
         G.warn("Couldn't save screenshot", var15);
         return xd.a("screenshot.failure", var15.getMessage());
      }
   }

   public bod aK() {
      return this.bm;
   }

   @Nullable
   public aru aL() {
      return this.Z.get();
   }

   public gye aM() {
      return this.au;
   }

   @Nullable
   public fpx aN() {
      return this.ba;
   }

   public fus aO() {
      return this.aL;
   }

   public fch aP() {
      return this.S;
   }

   public fbv aQ() {
      return this.bh;
   }

   public fks aR() {
      return this.m.k();
   }

   public gho aS() {
      return this.U;
   }

   public void a(int $$0) {
      this.aC.a($$0);
   }

   public gah aT() {
      return this.aM;
   }

   public boolean aU() {
      return this.bt().flag(UserFlag.PROFANITY_FILTER_ENABLED);
   }

   public void aV() {
      this.aL.a();
      this.w().a();
   }

   @Nullable
   public azq aW() {
      return azq.a(this.ax.getServicesKeySet(), ServicesKeyType.PROFILE_KEY);
   }

   public boolean aX() {
      return !this.ax.getServicesKeySet().keys(ServicesKeyType.PROFILE_KEY).isEmpty();
   }

   public fii aY() {
      return this.ab;
   }

   public void a(fii $$0) {
      this.ab = $$0;
   }

   public fic aZ() {
      return this.bu;
   }

   public gca ba() {
      return this.bv;
   }

   public gcp bb() {
      return this.bw;
   }

   public ffi bc() {
      return this.aQ;
   }

   public ggk bd() {
      return this.aR;
   }

   public fhy be() {
      return this.bx;
   }

   public eyi bf() {
      return this.by;
   }

   private float a(float $$0) {
      if (this.s != null) {
         bry $$1 = this.s.s();
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
      d(xd.a("chat.disabled.profile", xd.d(fil.F.n.I.h())).a(n.m)) {
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

   static record b(fdu a, fvy.c b) {
   }
}
