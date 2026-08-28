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

public class fja extends bqr<Runnable> implements fcx {
   static fja F;
   private static final Logger G = LogUtils.getLogger();
   public static final boolean a = ad.m() == ad.a.d;
   private static final int H = 10;
   public static final alh b = alh.b("default");
   public static final alh c = alh.b("uniform");
   public static final alh d = alh.b("alt");
   private static final alh I = alh.b("regional_compliancies.json");
   private static final CompletableFuture<bao> J = CompletableFuture.completedFuture(bao.a);
   private static final xh K = xh.c("multiplayer.socialInteractions.not_available");
   public static final String e = "Please make sure you have up-to-date drivers (see aka.ms/mcdriver for instructions).";
   private final long L = Double.doubleToLongBits(Math.PI);
   private final Path M;
   private final CompletableFuture<ProfileResult> N;
   private final gxt O;
   private final gin P;
   private final DataFixer Q;
   private final giv R;
   private final fcw S;
   private final fiq.b T = new fiq.b(20.0F, 0L, this::a);
   private final gie U;
   public final ghs f;
   private final gnx V;
   private final gox W;
   private final ghv X;
   public final gfg g;
   private final fjn Y;
   public final fkk h;
   public final fkk i;
   public final ghm j;
   public final glw l;
   private final AtomicReference<asa> Z = new AtomicReference<>();
   public final fkl m;
   public final fje n;
   private final fiv aa;
   public final fjb o;
   public final fiz p;
   private fix ab = fix.a;
   public final File q;
   private final String ac;
   private final String ad;
   private final Proxy ae;
   private final etk af;
   private final boolean ag;
   private final boolean ah;
   private final boolean ai;
   private final auw aj;
   private final atp ak;
   private final har al;
   private final auk am;
   private final gzb an;
   private final fkc ao;
   private final fkg ap;
   private final fcd aq;
   private final hcu ar;
   private final hcp as;
   private final fnp at;
   private final gyv au;
   private final ghn av;
   private final fjf aw = new fjf(I, fja::a);
   private final YggdrasilAuthenticationService ax;
   private final MinecraftSessionService ay;
   private final UserApiService az;
   private final CompletableFuture<UserProperties> aA;
   private final gyu aB;
   private final hah aC;
   private final giz aD;
   private final gzz aE;
   private final gys aF;
   private final gyr aG;
   private final gyq aH;
   private final gyp aI;
   private final fkn aJ;
   private final fnk aK;
   private final hdw aL;
   private final fvh aM;
   private final gax aN;
   private final gkg aO;
   private final hcy aP;
   private final gcj aQ;
   private final ffx aR;
   private final gha aS;
   @Nullable
   public gcg r;
   @Nullable
   public gbx s;
   @Nullable
   public ggs t;
   @Nullable
   private hcd aT;
   @Nullable
   private wb aU;
   private boolean aV;
   @Nullable
   public btz u;
   @Nullable
   public btz v;
   @Nullable
   public ezf w;
   private int aW;
   protected int x;
   private volatile boolean aX;
   private long aY = ad.d();
   private long aZ;
   private int ba;
   public boolean y;
   @Nullable
   public fqs z;
   @Nullable
   private fqm bb;
   private boolean bc;
   Thread bd;
   private volatile boolean be;
   @Nullable
   private Supplier<o> bf;
   private static int bg;
   public String A = "";
   private long bh;
   private final fck bi;
   public boolean B;
   public boolean C;
   public boolean D;
   public boolean E = true;
   private boolean bj;
   private final Queue<Runnable> bk = Queues.newConcurrentLinkedQueue();
   @Nullable
   private CompletableFuture<Void> bl;
   @Nullable
   private fnl bm;
   private bok bn = boh.a;
   private int bo;
   private final boe bp = new boe(ad.c, () -> this.bo);
   private bpy bq = bpx.a;
   private final fji br = new fji();
   private long bs;
   private double bt;
   @Nullable
   private fdm.a bu;
   private final fir bv;
   private final gcq bw;
   private gdf bx;
   private final fin by;
   private final eyx bz;
   private boolean bA;
   private final long bB;
   private long bC;

   public fja(final fwn $$0) {
      super("Client");
      F = this;
      this.bB = System.currentTimeMillis();
      this.q = $$0.c.a;
      File $$1 = $$0.c.c;
      this.M = $$0.c.b.toPath();
      this.ac = $$0.d.b;
      this.ad = $$0.d.c;
      Path $$2 = this.q.toPath();
      this.bz = etk.a($$2.resolve("allowed_symlinks.txt"));
      gyj $$3 = new gyj($$0.c.a(), this.bz);
      this.al = new har(this, $$2.resolve("downloads"), $$0.a);
      aum $$4 = new auf(this.M, atn.a, aul.b, this.bz);
      this.am = new auk($$3, this.al.a(), $$4);
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
      this.aT = null;
      ym.a(fiy::a);
      this.Q = bat.a();
      this.aK = new fnk(this);
      this.bd = Thread.currentThread();
      this.n = new fje(this, this.q);
      RenderSystem.setShaderGlintAlpha(this.n.ap().c());
      this.be = true;
      this.aL = new hdw(this, this.n);
      this.aa = new fiv($$2, this.Q);
      G.info("Backend library: {}", RenderSystem.getBackendDescription());
      fcj $$5;
      if (this.n.p > 0 && this.n.o > 0) {
         $$5 = new fcj(this.n.o, this.n.p, $$0.b.c, $$0.b.d, $$0.b.e);
      } else {
         $$5 = $$0.b;
      }

      ad.c = RenderSystem.initBackendSystem();
      this.R = new giv(this);
      this.S = this.R.a($$5, this.n.k, this.bi());
      this.a(true);
      this.S.a(new Runnable() {
         private boolean c;

         @Override
         public void run() {
            if (!this.c) {
               this.c = true;
               fcg.a($$0.c.a, fja.this.bd.threadId());
            }
         }
      });
      hdj.a.b(hdf.A);

      try {
         this.S.a(this.ak, ab.b().g() ? fcn.a : fcn.b);
      } catch (IOException var13) {
         G.error("Couldn't set icon", var13);
      }

      this.o = new fjb(this);
      this.o.a(this.S.i());
      this.p = new fiz(this);
      this.p.a(this.S.i());
      RenderSystem.initRenderer(this.n.t, false);
      this.aq = new fcb(this.S.l(), this.S.m());
      this.aq.a(0.0F, 0.0F, 0.0F, 0.0F);
      this.aq.f();
      this.aj = new auw(atn.a);
      this.am.a();
      this.n.b(this.am);
      this.an = new gzb(this.n.ab, $$0x -> {
         if (this.t != null) {
            this.t.cw.C();
         }
      });
      this.aj.a(this.an);
      this.O = new gxt(this.aj);
      this.aj.a(this.O);
      this.P = new gin(this.O, this::a);
      this.aj.a(this.P);
      this.aB = new gyu(this.O, $$1.toPath().resolve("skins"), this.ay, this);
      this.af = new etk($$2.resolve("saves"), $$2.resolve("backups"), this.bz, this.Q);
      this.by = new fin($$2);
      this.ar = new hcu(this.n);
      this.aj.a(this.ar);
      this.au = new gyv(this.Y);
      this.aj.a(this.au);
      this.as = new hcp(this);
      this.at = new fnp(this.O);
      this.h = this.at.a();
      this.i = this.at.b();
      this.aj.a(this.at);
      this.g();
      this.aj.a(new gym());
      this.aj.a(new gyl());
      this.S.a("Startup");
      RenderSystem.setupDefaultState(0, 0, this.S.l(), this.S.m());
      this.S.a("Post startup");
      this.ao = fkc.a();
      this.ap = fkg.a(this.ao);
      this.aC = new hah(this.O, this.ao, this.n.D().c());
      this.aj.a(this.aC);
      this.aN = new gax();
      this.aj.a(this.aN);
      this.aE = new gzz();
      this.aj.a(this.aE);
      this.aO = new gkg(this.h, this.aN, this::ap, this::as, this::aq);
      this.aj.a(this.aO);
      ghd $$8 = new ghd(this.aO, this.aN);
      this.aj.a($$8);
      this.W = new gox(this.aC, this.ap, $$8);
      this.aj.a(this.W);
      this.aH = new gyq(this.O);
      this.aI = new gyp(this.O);
      this.aj.a(this.aI);
      this.X = new ghv(this.aI, this.aH);

      try {
         int $$9 = Runtime.getRuntime().availableProcessors();
         fdv.a();
         this.U = new gie($$9);
      } catch (OutOfMemoryError var12) {
         TinyFileDialogs.tinyfd_messageBox(
            "Minecraft",
            "Oh no! The game was unable to allocate memory off-heap while trying to start. You may try to free some memory by closing other applications on your computer, check that your system meets the minimum requirements, and try again. If the problem persists, please visit: "
               + ayf.k,
            "ok",
            "error",
            true
         );
         throw new fwo("Unable to allocate render buffers", var12);
      }

      this.aM = new fvh(this, this.az);
      this.aD = new giz(this.aC.b(), $$8, this.ao);
      this.aj.a(this.aD);
      this.V = new gnx(this, this.O, this.W, this.X, this.aD, this.h, this.n, this.aN, this.aE);
      this.aj.a(this.V);
      this.g = new gfg(this.s, this.O);
      this.aj.a(this.g);
      this.aF = new gys(this.O);
      this.aj.a(this.aF);
      this.aG = new gyr(this.O);
      this.aj.a(this.aG);
      this.aJ = new fkn(this.O);
      this.aj.a(this.aJ);
      this.j = new ghm(this, this.V.d(), this.aj, this.U);
      this.f = new ghs(this, this.V, this.aO, this.U);
      this.aj.a(this.f);
      this.aj.a(this.f.z());
      this.av = new ghn();
      this.aj.a(this.av);
      this.aj.a(this.aw);
      this.m = new fkl(this);
      this.l = new glw(this);
      fej $$11 = fej.a(this);
      this.aR = new ffx($$11);
      RenderSystem.setErrorCallback(this::a);
      if (this.aq.c != this.S.l() || this.aq.d != this.S.m()) {
         StringBuilder $$12 = new StringBuilder(
            "Recovering from unsupported resolution ("
               + this.S.l()
               + "x"
               + this.S.m()
               + ").\nPlease make sure you have up-to-date drivers (see aka.ms/mcdriver for instructions)."
         );
         if (fcl.b()) {
            $$12.append("\n\nReported GL debug messages:\n").append(String.join("\n", fcl.a()));
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
      this.aP = new hcy(this, this.az, this.Y);
      this.aQ = gcj.a(this.az, this.Y, $$2);
      this.bv = new fir(this);
      this.bv.a(this.n.au().c() != fjc.a);
      this.bw = new gcq(this);
      this.bw.a(this.n.B().c());
      this.bx = gdf.a(gdc.a(), this.az);
      fqi.a(this);
      this.a((fqs)(new fqd(xh.c("gui.loadingMinecraft"))));
      List<atl> $$13 = this.am.h();
      this.br.a(fji.b.a, $$13);
      auv $$14 = this.aj.a(ad.g(), this, J, $$13);
      hdj.a.a(hdf.C);
      fja.b $$15 = new fja.b($$11, $$0.e);
      this.a((fqm)(new fqi(this, $$14, $$1x -> ad.a($$1x, $$1xx -> this.a($$1xx, $$15), () -> {
            if (ab.aW) {
               this.bl();
            }

            this.br.a();
            this.a($$15);
         }), false)));
      this.aS = gha.a($$0.e.b());
      this.bi = new fck(this.n, this);
   }

   private void a(@Nullable fja.b $$0) {
      if (!this.bA) {
         this.bA = true;
         this.b($$0);
      }
   }

   private void b(@Nullable fja.b $$0) {
      Runnable $$1 = this.c($$0);
      hdj.a.b(hdf.C);
      hdj.a.b(hdf.z);
      hdj.a.a(this.aP.a());
      $$1.run();
   }

   public boolean c() {
      return this.bA;
   }

   private Runnable c(@Nullable fja.b $$0) {
      List<Function<Runnable, fqs>> $$1 = new ArrayList<>();
      this.a($$1);
      Runnable $$2 = () -> {
         if ($$0 != null && $$0.b().a()) {
            ggz.a(this, $$0.b(), $$0.a());
         } else {
            this.a((fqs)(new fqu(true)));
         }
      };

      for (Function<Runnable, fqs> $$3 : Lists.reverse($$1)) {
         fqs $$4 = $$3.apply($$2);
         $$2 = () -> this.a($$4);
      }

      return $$2;
   }

   private void a(List<Function<Runnable, fqs>> $$0) {
      if (this.n.ac) {
         $$0.add($$0x -> new fpk(this.n, $$0x));
      }

      BanDetails $$1 = this.H();
      if ($$1 != null) {
         $$0.add($$1x -> fpn.a($$1xx -> {
               if ($$1xx) {
                  ad.m().a(ayf.n);
               }

               $$1x.run();
            }, $$1));
      }

      ProfileResult $$2 = this.N.join();
      if ($$2 != null) {
         GameProfile $$3 = $$2.profile();
         Set<ProfileActionType> $$4 = $$2.actions();
         if ($$4.contains(ProfileActionType.FORCED_NAME_CHANGE)) {
            $$0.add($$1x -> fpn.a($$3.getName(), $$1x));
         }

         if ($$4.contains(ProfileActionType.USING_BANNED_SKIN)) {
            $$0.add(fpn::a);
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
      this.S.b(this.bi());
   }

   private String bi() {
      StringBuilder $$0 = new StringBuilder("Minecraft");
      if (e().a()) {
         $$0.append("*");
      }

      $$0.append(" ");
      $$0.append(ab.b().c());
      gby $$1 = this.L();
      if ($$1 != null && $$1.k().i()) {
         $$0.append(" - ");
         gcl $$2 = this.S();
         if (this.aT != null && !this.aT.r()) {
            $$0.append(gyz.a("title.singleplayer"));
         } else if ($$2 != null && $$2.e()) {
            $$0.append(gyz.a("title.multiplayer.realms"));
         } else if (this.aT == null && ($$2 == null || !$$2.d())) {
            $$0.append(gyz.a("title.multiplayer.other"));
         } else {
            $$0.append(gyz.a("title.multiplayer.lan"));
         }
      }

      return $$0.toString();
   }

   private UserApiService a(YggdrasilAuthenticationService $$0, fwn $$1) {
      return $$1.a.a.g() != fjn.a.c ? UserApiService.OFFLINE : $$0.createUserApiService($$1.a.a.d());
   }

   public static azi e() {
      return azi.a("vanilla", ClientBrandRetriever::getClientModName, "Client", fja.class);
   }

   private void a(Throwable $$0, @Nullable fja.b $$1) {
      if (this.am.e().size() > 1) {
         this.a($$0, null, $$1);
      } else {
         ad.a($$0);
      }
   }

   public void a(Throwable $$0, @Nullable xh $$1, @Nullable fja.b $$2) {
      G.info("Caught error loading resourcepacks, removing all selected resourcepacks", $$0);
      this.br.a($$0);
      this.al.b();
      this.am.b(Collections.emptyList());
      this.n.i.clear();
      this.n.j.clear();
      this.n.ay();
      this.a(true, $$2).thenRun(() -> this.a($$1));
   }

   private void bj() {
      this.a(null);
      if (this.s != null) {
         this.s.Z();
         this.y();
      }

      this.a((fqs)(new fqu()));
      this.a(null);
   }

   private void a(@Nullable xh $$0) {
      fnk $$1 = this.aA();
      fni.b($$1, fni.a.c, xh.c("resourcePack.load_fail"), $$0);
   }

   public void a(Exception $$0) {
      if (!this.am.b()) {
         if (this.am.e().size() <= 1) {
            G.error(LogUtils.FATAL_MARKER, $$0.getMessage(), $$0);
            this.c(new o($$0.getMessage(), $$0));
         } else {
            this.a_(this::bj);
         }
      } else {
         this.a($$0, xh.c("resourcePack.runtime_failure"), null);
      }
   }

   public void f() {
      this.bd = Thread.currentThread();
      if (Runtime.getRuntime().availableProcessors() > 4) {
         this.bd.setPriority(10);
      }

      try {
         boolean $$0 = false;

         while (this.be) {
            this.bk();

            try {
               bon $$1 = bon.a("Renderer");
               boolean $$2 = this.aR().e();
               this.bn = this.a($$2, $$1);
               this.bn.a();
               this.bq.c();
               this.c(!$$0);
               this.bq.d();
               this.bn.b();
               this.b($$2, $$1);
            } catch (OutOfMemoryError var4) {
               if ($$0) {
                  throw var4;
               }

               this.bm();
               this.a((fqs)(new fql()));
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

   public fcd h() {
      return this.aq;
   }

   public String i() {
      return this.ac;
   }

   public String j() {
      return this.ad;
   }

   public void a(o $$0) {
      this.bf = () -> this.d($$0);
   }

   public void b(o $$0) {
      this.bf = () -> $$0;
   }

   private void bk() {
      if (this.bf != null) {
         a(this, this.q, this.bf.get());
      }
   }

   public void c(o $$0) {
      o $$1 = this.d($$0);
      this.bm();
      a(this, this.q, $$1);
   }

   public static int a(File $$0, o $$1) {
      Path $$2 = $$0.toPath().resolve("crash-reports");
      Path $$3 = $$2.resolve("crash-" + ad.f() + "-client.txt");
      alj.a($$1.a(y.a));
      if ($$1.e() != null) {
         alj.a("#@!@# Game crashed! Crash report saved to: #@!@# " + $$1.e().toAbsolutePath());
         return -1;
      } else if ($$1.a($$3, y.a)) {
         alj.a("#@!@# Game crashed! Crash report saved to: #@!@# " + $$3.toAbsolutePath());
         return -1;
      } else {
         alj.a("#@?@# Game crashed! Crash report could not be saved. #@?@#");
         return -2;
      }
   }

   public static void a(@Nullable fja $$0, File $$1, o $$2) {
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

   private CompletableFuture<Void> a(boolean $$0, @Nullable fja.b $$1) {
      if (this.bl != null) {
         return this.bl;
      } else {
         CompletableFuture<Void> $$2 = new CompletableFuture<>();
         if (!$$0 && this.bb instanceof fqi) {
            this.bl = $$2;
            return $$2;
         } else {
            this.am.a();
            List<atl> $$3 = this.am.h();
            if (!$$0) {
               this.br.a(fji.b.b, $$3);
            }

            this.a((fqm)(new fqi(this, this.aj.a(ad.g(), this, J, $$3), $$3x -> ad.a($$3x, $$2xx -> {
                  if ($$0) {
                     this.al.c();
                     this.bj();
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

   private void bl() {
      boolean $$0 = false;
      giy $$1 = this.ap().a();
      gzu $$2 = $$1.a().a();

      for (dhy $$3 : lx.e) {
         UnmodifiableIterator $$7 = $$3.l().a().iterator();

         while ($$7.hasNext()) {
            dvd $$4 = (dvd)$$7.next();
            if ($$4.o() == doe.c) {
               gzu $$5 = $$1.b($$4);
               if ($$5 == $$2) {
                  G.debug("Missing model for: {}", $$4);
                  $$0 = true;
               }
            }
         }
      }

      gxs $$6 = $$2.e();

      for (dhy $$7 : lx.e) {
         UnmodifiableIterator var15 = $$7.l().a().iterator();

         while (var15.hasNext()) {
            dvd $$8 = (dvd)var15.next();
            gxs $$9 = $$1.a($$8);
            if (!$$8.l() && $$9 == $$6) {
               G.debug("Missing particle icon for: {}", $$8);
            }
         }
      }

      lx.g.c().forEach($$0x -> {
         cvt $$1x = (cvt)$$0x.a();
         String $$2x = $$1x.m();
         String $$3x = xh.c($$2x).getString();
         if ($$3x.toLowerCase(Locale.ROOT).equals($$1x.m())) {
            G.debug("Missing translation for: {} {} {}", new Object[]{$$0x.h().a(), $$2x, $$1x});
         }
      });
      $$0 |= fqj.a();
      $$0 |= goa.a();
      if ($$0) {
         throw new IllegalStateException("Your game data is foobar, fix the errors above!");
      }
   }

   public etk m() {
      return this.af;
   }

   private void a(String $$0) {
      fja.a $$1 = this.J();
      if (!$$1.a(this.T())) {
         if (this.m.b()) {
            this.m.b(false);
            this.a((fqs)(new fpp($$0x -> {
               if ($$0x) {
                  ad.m().a(ayf.g);
               }

               this.a(null);
            }, fja.a.e, ayf.g, true)));
         } else {
            xh $$2 = $$1.a();
            this.m.a($$2, false);
            this.bv.c($$2);
            this.m.b($$1 == fja.a.d);
         }
      } else {
         this.a((fqs)(new fpo($$0)));
      }
   }

   public void a(@Nullable fqs $$0) {
      if (ab.aW && Thread.currentThread() != this.bd) {
         G.error("setScreen called from non-game thread");
      }

      if (this.z != null) {
         this.z.j();
      } else {
         this.a(fix.a);
      }

      if ($$0 == null && this.bc) {
         throw new IllegalStateException("Trying to return to in-game GUI during disconnection");
      } else {
         if ($$0 == null && this.s == null) {
            $$0 = new fqu();
         } else if ($$0 == null && this.t.eH()) {
            if (this.t.m()) {
               $$0 = new fpw(null, this.s.j().l());
            } else {
               this.t.gi();
            }
         }

         this.z = $$0;
         if (this.z != null) {
            this.z.aK_();
         }

         fdp.a();
         if ($$0 != null) {
            this.o.j();
            fiy.b();
            $$0.b(this, this.S.p(), this.S.q());
            this.y = false;
         } else {
            this.ar.i();
            this.o.i();
         }

         this.d();
      }
   }

   public void a(@Nullable fqm $$0) {
      this.bb = $$0;
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
         ad.c = System::nanoTime;
         if (this.bf == null) {
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
         this.aP.close();
         this.aw.close();
         this.aC.close();
         this.at.close();
         this.j.close();
         this.P.close();
         this.f.close();
         this.ar.g();
         this.g.a();
         this.aG.close();
         this.aF.close();
         this.aI.close();
         this.aJ.close();
         this.aH.close();
         this.O.close();
         this.aj.close();
         fob.b();
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

      if (this.bl != null && !(this.bb instanceof fqi)) {
         CompletableFuture<Void> $$1 = this.bl;
         this.bl = null;
         this.l().thenRun(() -> $$1.complete(null));
      }

      Runnable $$2;
      while (($$2 = this.bk.poll()) != null) {
         $$2.run();
      }

      int $$3 = this.T.a(ad.c(), $$0);
      if ($$0) {
         this.bn.a("scheduledExecutables");
         this.bB();
         this.bn.c();
         this.bn.a("tick");

         for (int $$4 = 0; $$4 < Math.min(10, $$3); $$4++) {
            this.bn.d("clientTick");
            this.t();
         }

         this.bn.c();
      }

      this.S.a("Render");
      this.bn.a("sound");
      this.ar.a(this.j.k());
      this.bn.b("toasts");
      this.aK.a();
      this.bn.b("render");
      long $$5 = ad.d();
      boolean $$7;
      if (!this.aR().d() && !this.bq.e()) {
         $$7 = false;
         this.bt = 0.0;
      } else {
         $$7 = this.bu == null || this.bu.b();
         if ($$7) {
            fdm.a().ifPresent(fdm::b);
         }
      }

      RenderSystem.clear(16640);
      this.aq.a(true);
      RenderSystem.setShaderFog(ghk.a);
      this.bn.a("display");
      RenderSystem.enableCull();
      this.bn.b("mouse");
      this.o.a();
      this.bn.c();
      if (!this.y) {
         this.bn.b("gameRenderer");
         this.j.a(this.T, $$0);
         this.bn.c();
      }

      this.bn.a("blit");
      this.aq.e();
      this.aq.c(this.S.l(), this.S.m());
      this.bh = ad.d() - $$5;
      if ($$7) {
         fdm.a().ifPresent($$0x -> this.bu = $$0x.c());
      }

      this.bn.b("updateDisplay");
      this.S.e();
      int $$8 = this.bi.a();
      if ($$8 < 260) {
         RenderSystem.limitDisplayFPS($$8);
      }

      this.bn.b("yield");
      Thread.yield();
      this.bn.c();
      this.S.a("Post render");
      this.ba++;
      this.aX = this.U() && (this.z != null && this.z.k() || this.bb != null && this.bb.a()) && !this.aT.r();
      this.T.b(this.aX);
      this.T.c(!this.br());
      long $$9 = ad.d();
      long $$10 = $$9 - this.aY;
      if ($$7) {
         this.bs = $$10;
      }

      this.aR().a($$10);
      this.aY = $$9;
      this.bn.a("fpsUpdate");
      if (this.bu != null && this.bu.b()) {
         this.bt = (double)this.bu.c() * 100.0 / (double)this.bs;
      }

      while (ad.c() >= this.aZ + 1000L) {
         String $$11;
         if (this.bt > 0.0) {
            $$11 = " GPU: " + (this.bt > 100.0 ? n.m + "100%" : Math.round(this.bt) + "%");
         } else {
            $$11 = "";
         }

         bg = this.ba;
         this.A = String.format(
            Locale.ROOT,
            "%d fps T: %s%s%s%s B: %d%s",
            bg,
            $$8 == 260 ? "inf" : $$8,
            this.n.P().c() ? " vsync " : " ",
            this.n.k().c(),
            this.n.j().c() == fim.a ? "" : (this.n.j().c() == fim.b ? " fast-clouds" : " fancy-clouds"),
            this.n.F().c(),
            $$11
         );
         this.aZ += 1000L;
         this.ba = 0;
      }

      this.bn.c();
   }

   private bok a(boolean $$0, @Nullable bon $$1) {
      if (!$$0) {
         this.bp.b();
         if (!this.bq.e() && $$1 == null) {
            return boh.a;
         }
      }

      bok $$2;
      if ($$0) {
         if (!this.bp.a()) {
            this.bo = 0;
            this.bp.c();
         }

         this.bo++;
         $$2 = this.bp.d();
      } else {
         $$2 = boh.a;
      }

      if (this.bq.e()) {
         $$2 = bok.a($$2, this.bq.f());
      }

      return bon.a($$2, $$1);
   }

   private void b(boolean $$0, @Nullable bon $$1) {
      if ($$1 != null) {
         $$1.b();
      }

      fms $$2 = this.aR().o();
      if ($$0) {
         $$2.a(this.bp.e());
      } else {
         $$2.a(null);
      }

      this.bn = this.bp.d();
   }

   @Override
   public void a() {
      int $$0 = this.S.a(this.n.as().c(), this.k());
      this.S.a((double)$$0);
      if (this.z != null) {
         this.z.a(this, this.S.p(), this.S.q());
      }

      fcd $$1 = this.h();
      $$1.a(this.S.l(), this.S.m());
      this.j.a(this.S.l(), this.S.m());
      this.o.g();
   }

   @Override
   public void b() {
      this.o.k();
   }

   public int o() {
      return bg;
   }

   public long p() {
      return this.bh;
   }

   private void bm() {
      try {
         azh.b();
      } catch (Throwable var3) {
      }

      try {
         System.gc();
         if (this.aV && this.aT != null) {
            this.aT.a(true);
         }

         this.b(new fqd(xh.c("menu.savingLevel")));
      } catch (Throwable var2) {
      }

      System.gc();
   }

   public boolean b(Consumer<xh> $$0) {
      if (this.bq.e()) {
         this.bn();
         return false;
      } else {
         Consumer<boj> $$1 = $$1x -> {
            if ($$1x != bof.a) {
               int $$2x = $$1x.f();
               double $$3x = (double)$$1x.g() / (double)bak.a;
               this.execute(
                  () -> $$0.accept(
                        xh.a("commands.debug.stopped", String.format(Locale.ROOT, "%.2f", $$3x), $$2x, String.format(Locale.ROOT, "%.2f", (double)$$2x / $$3x))
                     )
               );
            }
         };
         Consumer<Path> $$2 = $$1x -> {
            xh $$2x = xh.b($$1x.toString()).a(n.t).a($$1xx -> $$1xx.a(new xf(xf.a.b, $$1x.toFile().getParent())));
            this.execute(() -> $$0.accept(xh.a("debug.profiling.stop", $$2x)));
         };
         ac $$3 = a(new ac(), this, this.an, this.ac, this.n);
         Consumer<List<Path>> $$4 = $$2x -> {
            Path $$3x = this.a($$3, $$2x);
            $$2.accept($$3x);
         };
         Consumer<Path> $$5;
         if (this.aT == null) {
            $$5 = $$1x -> $$4.accept(ImmutableList.of($$1x));
         } else {
            this.aT.b($$3);
            CompletableFuture<Path> $$6 = new CompletableFuture<>();
            CompletableFuture<Path> $$7 = new CompletableFuture<>();
            CompletableFuture.allOf($$6, $$7).thenRunAsync(() -> $$4.accept(ImmutableList.of($$6.join(), $$7.join())), ad.h());
            this.aT.a($$0x -> {
            }, $$7::complete);
            $$5 = $$6::complete;
         }

         this.bq = bpw.a(new ggx(ad.c, this.f), ad.c, ad.h(), new bqc("client"), $$1x -> {
            this.bq = bpx.a;
            $$1.accept($$1x);
         }, $$5);
         return true;
      }
   }

   private void bn() {
      this.bq.a();
      if (this.aT != null) {
         this.aT.aW();
      }
   }

   private void bo() {
      this.bq.b();
      if (this.aT != null) {
         this.aT.aX();
      }
   }

   private Path a(ac $$0, List<Path> $$1) {
      String $$2;
      if (this.T()) {
         $$2 = this.V().ba().e();
      } else {
         gcl $$3 = this.S();
         $$2 = $$3 != null ? $$3.a : "unknown";
      }

      Path $$7;
      try {
         String $$5 = String.format(Locale.ROOT, "%s-%s-%s", ad.f(), $$2, ab.b().b());
         String $$6 = v.a(bqc.a, $$5, ".zip");
         $$7 = bqc.a.resolve($$6);
      } catch (IOException var21) {
         throw new UncheckedIOException(var21);
      }

      try (ayu $$10 = new ayu($$7)) {
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
      this.be = false;
   }

   public boolean r() {
      return this.be;
   }

   public void b(boolean $$0) {
      if (this.z == null) {
         boolean $$1 = this.U() && !this.aT.r();
         if ($$1) {
            this.a((fqs)(new fqn(!$$0)));
            this.ar.e();
         } else {
            this.a((fqs)(new fqn(true)));
         }
      }
   }

   private void d(boolean $$0) {
      if (!$$0) {
         this.x = 0;
      }

      if (this.x <= 0 && !this.t.fB()) {
         if ($$0 && this.w != null && this.w.d() == ezf.a.b) {
            ezd $$1 = (ezd)this.w;
            jg $$2 = $$1.b();
            if (!this.s.a_($$2).l()) {
               jl $$3 = $$1.c();
               if (this.r.b($$2, $$3)) {
                  this.g.a($$2, $$3);
                  this.t.a(brx.a);
               }
            }
         } else {
            this.r.b();
         }
      }
   }

   private boolean bp() {
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
         cvx $$0 = this.t.b(brx.a);
         if (!$$0.a(this.s.J())) {
            return false;
         } else {
            boolean $$1 = false;
            switch (this.w.d()) {
               case c:
                  this.r.a(this.t, ((eze)this.w).a());
                  break;
               case b:
                  ezd $$2 = (ezd)this.w;
                  jg $$3 = $$2.b();
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

            this.t.a(brx.a);
            return $$1;
         }
      }
   }

   private void bq() {
      if (!this.r.k()) {
         this.aW = 4;
         if (!this.t.C()) {
            if (this.w == null) {
               G.warn("Null returned as 'hitResult', this shouldn't happen!");
            }

            for (brx $$0 : brx.values()) {
               cvx $$1 = this.t.b($$0);
               if (!$$1.a(this.s.J())) {
                  return;
               }

               if (this.w != null) {
                  switch (this.w.d()) {
                     case c:
                        eze $$2 = (eze)this.w;
                        btz $$3 = $$2.a();
                        if (!this.s.C_().a($$3.dx())) {
                           return;
                        }

                        bry $$4 = this.r.a(this.t, $$3, $$2, $$0);
                        if (!$$4.a()) {
                           $$4 = this.r.a(this.t, $$3, $$0);
                        }

                        if ($$4 instanceof bry.d $$5) {
                           if ($$5.e() == bry.e.b) {
                              this.t.a($$0);
                           }

                           return;
                        }
                        break;
                     case b:
                        ezd $$6 = (ezd)this.w;
                        int $$7 = $$1.L();
                        bry $$8 = this.r.a(this.t, $$0, $$6);
                        if ($$8 instanceof bry.d $$9) {
                           if ($$9.e() == bry.e.b) {
                              this.t.a($$0);
                              if (!$$1.f() && ($$1.L() != $$7 || this.r.f())) {
                                 this.j.c.a($$0);
                              }
                           }

                           return;
                        }

                        if ($$8 instanceof bry.a) {
                           return;
                        }
                  }
               }

               if (!$$1.f() && this.r.a(this.t, $$0) instanceof bry.d $$11) {
                  if ($$11.e() == bry.e.b) {
                     this.t.a($$0);
                  }

                  this.j.c.a($$0);
                  return;
               }
            }
         }
      }
   }

   public hcp s() {
      return this.as;
   }

   public void t() {
      this.bC++;
      if (this.s != null && !this.aX) {
         this.s.s().m();
      }

      if (this.aW > 0) {
         this.aW--;
      }

      this.bn.a("gui");
      this.bw.a();
      this.m.a(this.aX);
      this.bn.c();
      this.j.a(1.0F);
      this.aL.a(this.s, this.w);
      this.bn.a("gameMode");
      if (!this.aX && this.s != null) {
         this.r.c();
      }

      this.bn.b("textures");
      if (this.br()) {
         this.O.f();
      }

      if (this.z != null || this.t == null) {
         if (this.z instanceof fqf $$0 && !this.t.fT()) {
            $$0.m();
         }
      } else if (this.t.eH() && !(this.z instanceof fpw)) {
         this.a(null);
      } else if (this.t.fT() && this.s != null) {
         this.a((fqs)(new fqf()));
      }

      if (this.z != null) {
         this.x = 10000;
      }

      if (this.z != null) {
         fqs.a(() -> this.z.e(), "Ticking screen", this.z.getClass().getCanonicalName());
      }

      if (!this.aR().d()) {
         this.m.l();
      }

      if (this.bb == null && this.z == null) {
         this.bn.b("Keybindings");
         this.bt();
         if (this.x > 0) {
            this.x--;
         }
      }

      if (this.s != null) {
         this.bn.b("gameRenderer");
         if (!this.aX) {
            this.j.e();
         }

         this.bn.b("levelRenderer");
         if (!this.aX) {
            this.f.n();
         }

         this.bn.b("level");
         if (!this.aX) {
            this.s.e();
         }
      } else if (this.j.f() != null) {
         this.j.b();
      }

      if (!this.aX) {
         this.as.a();
      }

      this.ar.a(this.aX);
      if (this.s != null) {
         if (!this.aX) {
            if (!this.n.s && this.bs()) {
               xh $$1 = xh.c("tutorial.socialInteractions.title");
               xh $$2 = xh.a("tutorial.socialInteractions.description", hdw.a("socialInteractions"));
               this.bm = new fnl(fnl.a.f, $$1, $$2, true, 8000);
               this.aK.a(this.bm);
               this.n.s = true;
               this.n.ay();
            }

            this.aL.d();

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

         this.bn.b("animateTick");
         if (!this.aX && this.br()) {
            this.s.b(this.t.dB(), this.t.dD(), this.t.dH());
         }

         this.bn.b("particles");
         if (!this.aX && this.br()) {
            this.g.b();
         }

         gby $$6 = this.L();
         if ($$6 != null && !this.aX) {
            $$6.b(ahg.a);
         }
      } else if (this.aU != null) {
         this.bn.b("pendingConnection");
         this.aU.b();
      }

      this.bn.b("keyboard");
      this.p.b();
      this.bn.c();
   }

   private boolean br() {
      return this.s == null || this.s.s().i();
   }

   private boolean bs() {
      return !this.aV || this.aT != null && this.aT.r();
   }

   private void bt() {
      while (this.n.N.g()) {
         fik $$0 = this.n.aD();
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
               frw.a(this, $$1, $$3, $$2);
            }
         }
      }

      while (this.n.L.g()) {
         if (!this.bs()) {
            this.t.a(K, true);
            this.bv.c(K);
         } else {
            if (this.bm != null) {
               this.bm.d();
               this.bm = null;
            }

            this.a((fqs)(new fvj()));
         }
      }

      while (this.n.C.g()) {
         if (this.r.g()) {
            this.t.h();
         } else {
            this.aL.a();
            this.a((fqs)(new fsh(this.t)));
         }
      }

      while (this.n.R.g()) {
         this.a((fqs)(new frc(this.t.cw.p())));
      }

      while (this.n.D.g()) {
         if (!this.t.R_()) {
            this.L().b(new ahz(ahz.a.g, jg.c, jl.a));
         }
      }

      while (this.n.E.g()) {
         if (!this.t.R_() && this.t.a(fqs.s())) {
            this.t.a(brx.a);
         }
      }

      while (this.n.I.g()) {
         this.a("");
      }

      if (this.z == null && this.bb == null && this.n.K.g()) {
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
            $$4 |= this.bp();
         }

         while (this.n.F.g()) {
            this.bq();
         }

         while (this.n.H.g()) {
            this.bv();
         }
      }

      if (this.n.F.e() && this.aW == 0 && !this.t.fB()) {
         this.bq();
      }

      this.d(this.z == null && !$$4 && this.n.G.e() && this.o.h());
   }

   public hcy u() {
      return this.aP;
   }

   public double v() {
      return this.bt;
   }

   public gcj w() {
      return this.aQ;
   }

   public fvz x() {
      return new fvz(this, this.af);
   }

   public void a(etk.c $$0, auk $$1, amg $$2, boolean $$3) {
      this.y();
      this.Z.set(null);
      Instant $$4 = Instant.now();

      try {
         $$0.a($$2.c().a(), $$2.d());
         amc $$5 = amc.a(this.ax, this.q);
         $$5.f().a(this);
         dtu.a($$5, this);
         avj.a(false);
         this.aT = MinecraftServer.a((Function<Thread, hcd>)($$4x -> new hcd($$4x, this, $$0, $$1, $$2, $$5, $$0xx -> {
               asa $$1xx = asa.b($$0xx + 0);
               this.Z.set($$1xx);
               return arz.a($$1xx, this.bk::add);
            })));
         this.aV = true;
         this.a(gdc.a());
         this.aS.a(gha.c.a, $$0.f(), $$2.d().e());
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

      fqg $$9 = new fqg(this.Z.get());
      this.a((fqs)$$9);
      this.bn.a("waitForServer");

      for (; !this.aT.ai() || this.bb != null; this.bk()) {
         $$9.e();
         this.c(false);

         try {
            Thread.sleep(16L);
         } catch (InterruptedException var10) {
         }
      }

      this.bn.c();
      Duration $$10 = Duration.between($$4, Instant.now());
      SocketAddress $$11 = this.aT.ah().a();
      wb $$12 = wb.a($$11);
      $$12.a($$11.toString(), 0, new gbw($$12, this, null, null, $$3, $$10, $$0x -> {
      }, null));
      $$12.a(new ajm(this.X().c(), this.X().b()));
      this.aU = $$12;
   }

   public void a(gbx $$0, fqq.a $$1) {
      this.e(new fqq(() -> false, $$1));
      this.s = $$0;
      this.a($$0);
      if (!this.aV) {
         amc $$2 = amc.a(this.ax, this.q);
         $$2.f().a(this);
         dtu.a($$2, this);
         avj.a(false);
      }
   }

   public void y() {
      this.a(new fqp(true), false);
   }

   public void b(fqs $$0) {
      this.a($$0, false);
   }

   public void a(fqs $$0, boolean $$1) {
      gby $$2 = this.L();
      if ($$2 != null) {
         this.bA();
         $$2.h();
         if (!$$1) {
            this.z();
         }
      }

      this.aM.b();
      if (this.bq.e()) {
         this.bo();
      }

      hcd $$3 = this.aT;
      this.aT = null;
      this.j.h();
      this.r = null;
      this.bv.b();
      this.bc = true;

      try {
         this.e($$0);
         if (this.s != null) {
            if ($$3 != null) {
               this.bn.a("waitForServer");

               while (!$$3.I()) {
                  this.c(false);
               }

               this.bn.c();
            }

            this.m.i();
            this.aV = false;
         }

         this.s = null;
         this.a(null);
         this.t = null;
      } finally {
         this.bc = false;
      }

      dtu.b();
   }

   public void z() {
      this.al.i();
      this.bB();
   }

   public void c(fqs $$0) {
      gby $$1 = this.L();
      if ($$1 != null) {
         $$1.i();
      }

      if (this.bq.e()) {
         this.bo();
      }

      this.j.h();
      this.r = null;
      this.bv.b();
      this.bc = true;

      try {
         this.e($$0);
         this.m.i();
         this.s = null;
         this.a(null);
         this.t = null;
      } finally {
         this.bc = false;
      }

      dtu.b();
   }

   private void e(fqs $$0) {
      this.bn.a("forcedTick");
      this.ar.f();
      this.u = null;
      this.aU = null;
      this.a($$0);
      this.c(false);
      this.bn.c();
   }

   public void d(fqs $$0) {
      this.bn.a("forcedTick");
      this.a($$0);
      this.c(false);
      this.bn.c();
   }

   private void a(@Nullable gbx $$0) {
      this.f.a($$0);
      this.g.a($$0);
      this.aO.a($$0);
      this.d();
   }

   private UserProperties bu() {
      return this.aA.join();
   }

   public boolean C() {
      return this.D() && this.n.ak().c();
   }

   public boolean D() {
      return this.E() && this.bu().flag(UserFlag.OPTIONAL_TELEMETRY_AVAILABLE);
   }

   public boolean E() {
      return ab.aW ? false : this.bu().flag(UserFlag.TELEMETRY_ENABLED);
   }

   public boolean F() {
      return this.ah && this.bu().flag(UserFlag.SERVERS_ALLOWED) && this.H() == null && !this.I();
   }

   public boolean G() {
      return this.bu().flag(UserFlag.REALMS_ALLOWED) && this.H() == null;
   }

   @Nullable
   public BanDetails H() {
      return (BanDetails)this.bu().bannedScopes().get("MULTIPLAYER");
   }

   public boolean I() {
      ProfileResult $$0 = this.N.getNow(null);
      return $$0 != null && $$0.actions().contains(ProfileActionType.FORCED_NAME_CHANGE);
   }

   public boolean a(UUID $$0) {
      return this.J().a(false) ? this.aM.c($$0) : (this.t == null || !$$0.equals(this.t.cH())) && !$$0.equals(ad.e);
   }

   public fja.a J() {
      if (this.n.n().c() == coe.c) {
         return fja.a.b;
      } else if (!this.ai) {
         return fja.a.c;
      } else {
         return !this.bu().flag(UserFlag.CHAT_ALLOWED) ? fja.a.d : fja.a.a;
      }
   }

   public final boolean K() {
      return this.ag;
   }

   @Nullable
   public gby L() {
      return this.t == null ? null : this.t.cw;
   }

   public static boolean M() {
      return !F.n.X;
   }

   public static boolean N() {
      return F.n.k().c().b() >= fis.b.b();
   }

   public static boolean O() {
      return !F.j.a() && F.n.k().c().b() >= fis.c.b();
   }

   public static boolean P() {
      return F.n.l().c();
   }

   private void bv() {
      if (this.w != null && this.w.d() != ezf.a.a) {
         boolean $$0 = this.t.gl().d;
         dsg $$1 = null;
         ezf.a $$2 = this.w.d();
         cvx $$6;
         if ($$2 == ezf.a.b) {
            jg $$3 = ((ezd)this.w).b();
            dvd $$4 = this.s.a_($$3);
            if ($$4.l()) {
               return;
            }

            dhy $$5 = $$4.b();
            $$6 = $$5.a((dey)this.s, $$3, $$4);
            if ($$6.f()) {
               return;
            }

            if ($$0 && fqs.s() && $$4.x()) {
               $$1 = this.s.c_($$3);
            }
         } else {
            if ($$2 != ezf.a.c || !$$0) {
               return;
            }

            btz $$7 = ((eze)this.w).a();
            $$6 = $$7.dK();
            if ($$6 == null) {
               return;
            }
         }

         if ($$6.f()) {
            String $$10 = "";
            if ($$2 == ezf.a.b) {
               $$10 = lx.e.b(this.s.a_(((ezd)this.w).b()).b()).toString();
            } else if ($$2 == ezf.a.c) {
               $$10 = lx.f.b(((eze)this.w).a().aq()).toString();
            }

            G.warn("Picking on: [{}] {} gave null item", $$2, $$10);
         } else {
            cog $$11 = this.t.gk();
            if ($$1 != null) {
               this.a($$6, $$1, this.s.H_());
            }

            int $$12 = $$11.c($$6);
            if ($$0) {
               $$11.b($$6);
               this.r.a(this.t.b(brx.a), 36 + $$11.j);
            } else if ($$12 != -1) {
               if (cog.d($$12)) {
                  $$11.j = $$12;
               } else {
                  this.r.a($$12);
               }
            }
         }
      }
   }

   private void a(cvx $$0, dsg $$1, kd $$2) {
      uj $$3 = $$1.f($$2);
      $$1.a($$3);
      cuc.a($$0, $$1.q(), $$3);
      $$0.b($$1.r());
   }

   public o d(o $$0) {
      ac $$1 = $$0.f();
      a($$1, this, this.an, this.ac, this.n);
      this.a($$0.a("Uptime"));
      if (this.s != null) {
         this.s.a($$0);
      }

      if (this.aT != null) {
         this.aT.b($$1);
      }

      this.br.a($$0);
      return $$0;
   }

   public static void a(@Nullable fja $$0, @Nullable gzb $$1, String $$2, @Nullable fje $$3, o $$4) {
      ac $$5 = $$4.f();
      a($$5, $$0, $$1, $$2, $$3);
   }

   private static String a(double $$0) {
      return String.format(Locale.ROOT, "%.3fs", $$0);
   }

   private void a(p $$0) {
      $$0.a("JVM uptime", () -> a((double)ManagementFactory.getRuntimeMXBean().getUptime() / 1000.0));
      $$0.a("Wall uptime", () -> a((double)(System.currentTimeMillis() - this.bB) / 1000.0));
      $$0.a("High-res time", () -> a((double)ad.c() / 1000.0));
      $$0.a("Client ticks", () -> String.format(Locale.ROOT, "%d ticks / %.3fs", this.bC, (double)this.bC / 20.0));
   }

   private static ac a(ac $$0, @Nullable fja $$1, @Nullable gzb $$2, String $$3, @Nullable fje $$4) {
      $$0.a("Launched Version", () -> $$3);
      String $$5 = bh();
      if ($$5 != null) {
         $$0.a("Launcher name", $$5);
      }

      $$0.a("Backend library", RenderSystem::getBackendDescription);
      $$0.a("Backend API", RenderSystem::getApiDescription);
      $$0.a("Window size", () -> $$1 != null ? $$1.S.l() + "x" + $$1.S.m() : "<not initialized>");
      $$0.a("GFLW Platform", fcw::a);
      $$0.a("GL Caps", RenderSystem::getCapsString);
      $$0.a("GL debug messages", () -> fcl.b() ? String.join("\n", fcl.a()) : "<disabled>");
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
         $$0.a("Resource Packs", () -> auk.a($$1.ad().g()));
      }

      if ($$2 != null) {
         $$0.a("Current Language", () -> $$2.a());
      }

      $$0.a("Locale", String.valueOf(Locale.getDefault()));
      $$0.a("System encoding", () -> System.getProperty("sun.jnu.encoding", "<not set>"));
      $$0.a("File encoding", () -> System.getProperty("file.encoding", "<not set>"));
      $$0.a("CPU", fcm::b);
      return $$0;
   }

   public static fja Q() {
      return F;
   }

   public CompletableFuture<Void> R() {
      return this.a(this::l).thenCompose($$0 -> (CompletionStage<Void>)$$0);
   }

   public void a(gdc $$0) {
      if (!this.bx.a($$0)) {
         this.bx = gdf.a($$0, this.az);
      }
   }

   @Nullable
   public gcl S() {
      return x.a(this.L(), gby::x);
   }

   public boolean T() {
      return this.aV;
   }

   public boolean U() {
      return this.aV && this.aT != null;
   }

   @Nullable
   public hcd V() {
      return this.aT;
   }

   public boolean W() {
      hcd $$0 = this.V();
      return $$0 != null && !$$0.r();
   }

   public boolean b(UUID $$0) {
      return $$0.equals(this.X().b());
   }

   public fjn X() {
      return this.Y;
   }

   public GameProfile Y() {
      ProfileResult $$0 = this.N.join();
      return $$0 != null ? $$0.profile() : new GameProfile(this.Y.b(), this.Y.c());
   }

   public Proxy Z() {
      return this.ae;
   }

   public gxt aa() {
      return this.O;
   }

   public gin ab() {
      return this.P;
   }

   public ava ac() {
      return this.aj;
   }

   public auk ad() {
      return this.am;
   }

   public atp ae() {
      return this.ak;
   }

   public har af() {
      return this.al;
   }

   public Path ag() {
      return this.M;
   }

   public gzb ah() {
      return this.an;
   }

   public Function<alh, gxs> a(alh $$0) {
      return this.aC.a($$0)::a;
   }

   public boolean ai() {
      return this.aX;
   }

   public ghn aj() {
      return this.av;
   }

   public hcu ak() {
      return this.ar;
   }

   public awh al() {
      awh $$0 = x.a(this.z, fqs::C);
      if ($$0 != null) {
         return $$0;
      } else if (this.t != null) {
         if (this.t.dX().ag() == dev.k) {
            return this.m.j().b() ? awi.d : awi.e;
         } else {
            jp<dfw> $$1 = this.t.dX().t(this.t.dx());
            if (!this.as.c(awi.f) && (!this.t.bp() || !$$1.a(awy.Z))) {
               return this.t.dX().ag() != dev.j && this.t.gl().d && this.t.gl().c ? awi.b : $$1.a().o().orElse(awi.g);
            } else {
               return awi.f;
            }
         }
      } else {
         return awi.a;
      }
   }

   public MinecraftSessionService am() {
      return this.ay;
   }

   public gyu an() {
      return this.aB;
   }

   @Nullable
   public btz ao() {
      return this.u;
   }

   public void a(btz $$0) {
      this.u = $$0;
      this.j.a($$0);
   }

   public boolean b(btz $$0) {
      return $$0.cp() || this.t != null && this.t.R_() && this.n.Q.e() && $$0.aq() == bug.by;
   }

   @Override
   protected Thread ay() {
      return this.bd;
   }

   @Override
   public Runnable f(Runnable $$0) {
      return $$0;
   }

   @Override
   protected boolean e(Runnable $$0) {
      return true;
   }

   public giz ap() {
      return this.aD;
   }

   public gnx aq() {
      return this.V;
   }

   public gkg ar() {
      return this.aO;
   }

   public gox as() {
      return this.W;
   }

   public ghv at() {
      return this.X;
   }

   public DataFixer au() {
      return this.Q;
   }

   public fiq av() {
      return this.T;
   }

   public fkc aw() {
      return this.ao;
   }

   public boolean az() {
      return this.t != null && this.t.gA() || this.n.X().c();
   }

   public fnk aA() {
      return this.aK;
   }

   public hdw aB() {
      return this.aL;
   }

   public boolean aC() {
      return this.bj;
   }

   public fiv aD() {
      return this.aa;
   }

   public hah aE() {
      return this.aC;
   }

   public gys aF() {
      return this.aF;
   }

   public gyr aG() {
      return this.aG;
   }

   public gyq aH() {
      return this.aH;
   }

   public gyp aI() {
      return this.aI;
   }

   public fkn aJ() {
      return this.aJ;
   }

   @Override
   public void a(boolean $$0) {
      this.bj = $$0;
   }

   public xh a(File $$0, int $$1, int $$2) {
      int $$3 = this.S.l();
      int $$4 = this.S.m();
      fcd $$5 = new fce($$1, $$2, true);
      float $$6 = this.t.dP();
      float $$7 = this.t.dN();
      float $$8 = this.t.P;
      float $$9 = this.t.O;
      this.j.b(false);

      xv var12;
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
            this.j.a(fiq.b);

            try {
               Thread.sleep(10L);
            } catch (InterruptedException var17) {
            }

            fjj.a($$0, "panorama_" + $$10 + ".png", $$5, $$0x -> {
            });
         }

         xh $$11 = xh.b($$0.getName()).a(n.t).a($$1x -> $$1x.a(new xf(xf.a.b, $$0.getAbsolutePath())));
         return xh.a("screenshot.success", $$11);
      } catch (Exception var18) {
         G.error("Couldn't save image", var18);
         var12 = xh.a("screenshot.failure", var18.getMessage());
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

   private xh a(File $$0, int $$1, int $$2, int $$3, int $$4) {
      try {
         ByteBuffer $$5 = fcm.a($$1 * $$2 * 3);
         fjj $$6 = new fjj($$0, $$3, $$4, $$2);
         float $$7 = (float)$$3 / (float)$$1;
         float $$8 = (float)$$4 / (float)$$2;
         float $$9 = $$7 > $$8 ? $$7 : $$8;

         for (int $$10 = ($$4 - 1) / $$2 * $$2; $$10 >= 0; $$10 -= $$2) {
            for (int $$11 = 0; $$11 < $$3; $$11 += $$1) {
               RenderSystem.setShaderTexture(0, gxr.d);
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
         fcm.a($$5);
         xh $$15 = xh.b($$14.getName()).a(n.t).a($$1x -> $$1x.a(new xf(xf.a.b, $$14.getAbsolutePath())));
         return xh.a("screenshot.success", $$15);
      } catch (Exception var15) {
         G.warn("Couldn't save screenshot", var15);
         return xh.a("screenshot.failure", var15.getMessage());
      }
   }

   public bok aK() {
      return this.bn;
   }

   @Nullable
   public asa aL() {
      return this.Z.get();
   }

   public gyv aM() {
      return this.au;
   }

   @Nullable
   public fqm aN() {
      return this.bb;
   }

   public fvh aO() {
      return this.aM;
   }

   public fcw aP() {
      return this.S;
   }

   public fck aQ() {
      return this.bi;
   }

   public flh aR() {
      return this.m.k();
   }

   public gie aS() {
      return this.U;
   }

   public void a(int $$0) {
      this.aC.a($$0);
   }

   public gax aT() {
      return this.aN;
   }

   public gzz aU() {
      return this.aE;
   }

   public boolean aV() {
      return this.bu().flag(UserFlag.PROFANITY_FILTER_ENABLED);
   }

   public void aW() {
      this.aM.a();
      this.w().a();
   }

   @Nullable
   public azw aX() {
      return azw.a(this.ax.getServicesKeySet(), ServicesKeyType.PROFILE_KEY);
   }

   public boolean aY() {
      return !this.ax.getServicesKeySet().keys(ServicesKeyType.PROFILE_KEY).isEmpty();
   }

   public fix aZ() {
      return this.ab;
   }

   public void a(fix $$0) {
      this.ab = $$0;
   }

   public fir ba() {
      return this.bv;
   }

   public gcq bb() {
      return this.bw;
   }

   public gdf bc() {
      return this.bx;
   }

   public ffx bd() {
      return this.aR;
   }

   public gha be() {
      return this.aS;
   }

   public fin bf() {
      return this.by;
   }

   public eyx bg() {
      return this.bz;
   }

   private float a(float $$0) {
      if (this.s != null) {
         bsh $$1 = this.s.s();
         if ($$1.i()) {
            return Math.max($$0, $$1.g());
         }
      }

      return $$0;
   }

   @Nullable
   public static String bh() {
      return System.getProperty("minecraft.launcher.brand");
   }

   public static enum a {
      a(xg.a) {
         @Override
         public boolean a(boolean $$0) {
            return true;
         }
      },
      b(xh.c("chat.disabled.options").a(n.m)) {
         @Override
         public boolean a(boolean $$0) {
            return false;
         }
      },
      c(xh.c("chat.disabled.launcher").a(n.m)) {
         @Override
         public boolean a(boolean $$0) {
            return $$0;
         }
      },
      d(xh.a("chat.disabled.profile", xh.d(fja.F.n.I.h())).a(n.m)) {
         @Override
         public boolean a(boolean $$0) {
            return $$0;
         }
      };

      static final xh e = xh.c("chat.disabled.profile.moreInfo");
      private final xh f;

      a(final xh $$0) {
         this.f = $$0;
      }

      public xh a() {
         return this.f;
      }

      public abstract boolean a(boolean var1);
   }

   static record b(fej a, fwn.c b) {
   }
}
