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

public class flj extends brc<Runnable> implements fey {
   static flj F;
   private static final Logger G = LogUtils.getLogger();
   public static final boolean a = af.m() == af.a.d;
   private static final int H = 10;
   public static final aku b = aku.b("default");
   public static final aku c = aku.b("uniform");
   public static final aku d = aku.b("alt");
   private static final aku I = aku.b("regional_compliancies.json");
   private static final CompletableFuture<baf> J = CompletableFuture.completedFuture(baf.a);
   private static final wo K = wo.c("multiplayer.socialInteractions.not_available");
   public static final String e = "Please make sure you have up-to-date drivers (see aka.ms/mcdriver for instructions).";
   private final long L = Double.doubleToLongBits(Math.PI);
   private final Path M;
   private final CompletableFuture<ProfileResult> N;
   private final hek O;
   private final gmo P;
   private final DataFixer Q;
   private final gmx R;
   private final fex S;
   private final fkz.b T = new fkz.b(20.0F, 0L, this::a);
   private final gmf U;
   public final glt f;
   private final gsa V;
   private final hbj W;
   private final gta X;
   private final glw Y;
   public final gji g;
   private final flv Z;
   public final fob h;
   public final fob i;
   public final glo j;
   public final gpx l;
   private final AtomicReference<arq> aa = new AtomicReference<>();
   public final foc m;
   public final fln n;
   private final fle ab;
   public final flk o;
   public final fli p;
   private flg ac = flg.a;
   public final File q;
   private final String ad;
   private final String ae;
   private final Proxy af;
   private final evf ag;
   private final boolean ah;
   private final boolean ai;
   private final boolean aj;
   private final aum ak;
   private final atf al;
   private final hhk am;
   private final aua an;
   private final hfs ao;
   private final fml ap;
   private final fee aq;
   @Nullable
   private final fdf ar;
   private final hjo as;
   private final hjj at;
   private final fri au;
   private final hfm av;
   private final glp aw;
   private final flo ax = new flo(I, flj::a);
   private final YggdrasilAuthenticationService ay;
   private final MinecraftSessionService az;
   private final UserApiService aA;
   private final CompletableFuture<UserProperties> aB;
   private final hfl aC;
   private final hgz aD;
   private final gnb aE;
   private final hfj aF;
   private final hfi aG;
   private final hfh aH;
   private final hfg aI;
   private final foe aJ;
   private final frd aK;
   private final hkq aL;
   private final fza aM;
   private final goh aN;
   private final hjs aO;
   private final ggl aP;
   private final fij aQ;
   private final gld aR;
   @Nullable
   public ggi r;
   @Nullable
   public gfy s;
   @Nullable
   public gkv t;
   @Nullable
   private hiw aS;
   @Nullable
   private vi aT;
   private boolean aU;
   @Nullable
   public buk u;
   @Nullable
   public buk v;
   @Nullable
   public fay w;
   private int aV;
   protected int x;
   private volatile boolean aW;
   private long aX = af.d();
   private long aY;
   private int aZ;
   public boolean y;
   @Nullable
   public fuk z;
   @Nullable
   private fue ba;
   private boolean bb;
   Thread bc;
   private volatile boolean bd;
   @Nullable
   private Supplier<o> be;
   private static int bf;
   public String A = "";
   private long bg;
   private final fel bh;
   public boolean B;
   public boolean C;
   public boolean D;
   public boolean E = true;
   private boolean bi;
   private final Queue<Runnable> bj = Queues.newConcurrentLinkedQueue();
   @Nullable
   private CompletableFuture<Void> bk;
   @Nullable
   private fre bl;
   private int bm;
   private final bol bn = new bol(af.c, () -> this.bm);
   private bqj bo = bqi.a;
   private final flq bp = new flq();
   private long bq;
   private double br;
   @Nullable
   private ffn.a bs;
   private final fla bt;
   private final ggs bu;
   private ghh bv;
   private final fkw bw;
   private final faq bx;
   private boolean by;
   private final long bz;
   private long bA;

   public flj(final gak $$0) {
      super("Client");
      F = this;
      this.bz = System.currentTimeMillis();
      this.q = $$0.c.a;
      File $$1 = $$0.c.c;
      this.M = $$0.c.b.toPath();
      this.ad = $$0.d.b;
      this.ae = $$0.d.c;
      Path $$2 = this.q.toPath();
      this.bx = evf.a($$2.resolve("allowed_symlinks.txt"));
      hfa $$3 = new hfa($$0.c.a(), this.bx);
      this.am = new hhk(this, $$2.resolve("downloads"), $$0.a);
      auc $$4 = new atv(this.M, atd.a, aub.b, this.bx);
      this.an = new aua($$3, this.am.a(), $$4);
      this.al = $$3.a();
      this.af = $$0.a.d;
      this.ay = new YggdrasilAuthenticationService(this.af);
      this.az = this.ay.createMinecraftSessionService();
      this.Z = $$0.a.a;
      this.N = CompletableFuture.supplyAsync(() -> this.az.fetchProfile(this.Z.b(), true), af.i());
      this.aA = this.a(this.ay, $$0);
      this.aB = CompletableFuture.supplyAsync(() -> {
         try {
            return this.aA.fetchProperties();
         } catch (AuthenticationException var2x) {
            G.error("Failed to fetch user properties", var2x);
            return UserApiService.OFFLINE_PROPERTIES;
         }
      }, af.i());
      G.info("Setting user: {}", this.Z.c());
      G.debug("(Session ID is {})", this.Z.a());
      this.ah = $$0.d.a;
      this.ai = !$$0.d.d;
      this.aj = !$$0.d.e;
      this.aS = null;
      xt.a(flh::a);
      this.Q = bao.a();
      this.aK = new frd(this);
      this.bc = Thread.currentThread();
      this.n = new fln(this, this.q);
      RenderSystem.setShaderGlintAlpha(this.n.aq().c());
      this.bd = true;
      this.aL = new hkq(this, this.n);
      this.ab = new fle($$2, this.Q);
      G.info("Backend library: {}", RenderSystem.getBackendDescription());
      fek $$5;
      if (this.n.p > 0 && this.n.o > 0) {
         $$5 = new fek(this.n.o, this.n.p, $$0.b.c, $$0.b.d, $$0.b.e);
      } else {
         $$5 = $$0.b;
      }

      af.c = RenderSystem.initBackendSystem();
      this.R = new gmx(this);
      this.S = this.R.a($$5, this.n.k, this.bh());
      this.a(true);
      this.S.a(new Runnable() {
         private boolean c;

         @Override
         public void run() {
            if (!this.c) {
               this.c = true;
               feh.a($$0.c.a, flj.this.bc.threadId());
            }
         }
      });
      hkd.a.b(hjz.A);

      try {
         this.S.a(this.al, ab.b().g() ? feo.a : feo.b);
      } catch (IOException var13) {
         G.error("Couldn't set icon", var13);
      }

      this.o = new flk(this);
      this.o.a(this.S.h());
      this.p = new fli(this);
      this.p.a(this.S.h());
      RenderSystem.initRenderer(this.n.t, false);
      this.aq = new fec(this.S.k(), this.S.l());
      this.aq.a(0.0F, 0.0F, 0.0F, 0.0F);
      this.aq.f();
      this.ak = new aum(atd.a);
      this.an.a();
      this.n.b(this.an);
      this.ao = new hfs(this.n.ab, $$0x -> {
         if (this.t != null) {
            this.t.j.C();
         }
      });
      this.ak.a(this.ao);
      this.O = new hek(this.ak);
      this.ak.a(this.O);
      this.P = new gmo(this.O, this::a);
      this.ak.a(this.P);
      this.aC = new hfl(this.O, $$1.toPath().resolve("skins"), this.az, this);
      this.ag = new evf($$2.resolve("saves"), $$2.resolve("backups"), this.bx, this.Q);
      this.bw = new fkw($$2);
      this.as = new hjo(this.n);
      this.ak.a(this.as);
      this.av = new hfm(this.Z);
      this.ak.a(this.av);
      this.at = new hjj(this);
      this.au = new fri(this.O);
      this.h = this.au.a();
      this.i = this.au.b();
      this.ak.a(this.au);
      this.g();
      this.ak.a(new hfd());
      this.ak.a(new hfc());
      this.S.a("Startup");
      RenderSystem.setupDefaultState(0, 0, this.S.k(), this.S.l());
      this.S.a("Post startup");
      this.ap = fml.a();
      this.aD = new hgz(this.O, this.ap, this.n.E().c());
      this.ak.a(this.aD);
      hgp $$8 = new hgp();
      this.ak.a($$8);
      this.W = new hbj(this.aD);
      this.X = new gta(this.W);
      this.aH = new hfh(this.O);
      this.aI = new hfg(this.O);
      this.ak.a(this.aI);
      this.Y = new glw(this.aI, this.aH);

      try {
         int $$9 = Runtime.getRuntime().availableProcessors();
         ffw.a();
         this.U = new gmf($$9);
      } catch (OutOfMemoryError var12) {
         TinyFileDialogs.tinyfd_messageBox(
            "Minecraft",
            "Oh no! The game was unable to allocate memory off-heap while trying to start. You may try to free some memory by closing other applications on your computer, check that your system meets the minimum requirements, and try again. If the problem persists, please visit: "
               + axv.k,
            "ok",
            "error",
            true
         );
         throw new gal("Unable to allocate render buffers", var12);
      }

      this.aM = new fza(this, this.aA);
      this.aE = new gnb(this.aD.b(), this.aD.d(), this.ap);
      this.ak.a(this.aE);
      this.V = new gsa(this, this.O, this.W, this.X, this.Y, this.aE, this.h, this.n, this.aD.e(), $$8);
      this.ak.a(this.V);
      this.aN = new goh(this.h, this.aD.e(), this.aE, this.W, this.X, this.V);
      this.ak.a(this.aN);
      this.g = new gji(this.s, this.O);
      this.ak.a(this.g);
      this.aF = new hfj(this.O);
      this.ak.a(this.aF);
      this.aG = new hfi(this.O);
      this.ak.a(this.aG);
      this.aJ = new foe(this.O);
      this.ak.a(this.aJ);
      this.j = new glo(this, this.V.d(), this.ak, this.U);
      this.f = new glt(this, this.V, this.aN, this.U);
      this.ak.a(this.f);
      this.ak.a(this.f.z());
      this.aw = new glp();
      this.ak.a(this.aw);
      this.ak.a(this.ax);
      this.m = new foc(this);
      this.l = new gpx(this);
      fgk $$11 = fgk.a(this);
      this.aQ = new fij($$11);
      RenderSystem.setErrorCallback(this::a);
      if (this.aq.c != this.S.k() || this.aq.d != this.S.l()) {
         StringBuilder $$12 = new StringBuilder(
            "Recovering from unsupported resolution ("
               + this.S.k()
               + "x"
               + this.S.l()
               + ").\nPlease make sure you have up-to-date drivers (see aka.ms/mcdriver for instructions)."
         );
         if (fem.b()) {
            $$12.append("\n\nReported GL debug messages:\n").append(String.join("\n", fem.a()));
         }

         this.S.a(this.aq.c, this.aq.d);
         TinyFileDialogs.tinyfd_messageBox("Minecraft", $$12.toString(), "ok", "error", false);
      } else if (this.n.ad().c() && !this.S.i()) {
         this.S.g();
         this.n.ad().a(this.S.i());
      }

      this.S.a(this.n.Q().c());
      this.S.b(this.n.I().c());
      this.S.d();
      this.a();
      this.j.a(this.al.d());
      this.aO = new hjs(this, this.aA, this.Z);
      this.aP = ggl.a(this.aA, this.Z, $$2);
      this.bt = new fla(this);
      this.bt.a(this.n.av().c() != fll.a);
      this.bu = new ggs(this);
      this.bu.a(this.n.C().c());
      this.bv = ghh.a(ghe.a(), this.aA);
      fua.a(this);
      this.a((fuk)(new ftv(wo.c("gui.loadingMinecraft"))));
      List<atb> $$13 = this.an.h();
      this.bp.a(flq.b.a, $$13);
      aul $$14 = this.ak.a(af.g().a("resourceLoad"), this, J, $$13);
      hkd.a.a(hjz.C);
      flj.b $$15 = new flj.b($$11, $$0.e);
      this.a((fue)(new fua(this, $$14, $$1x -> af.a($$1x, $$1xx -> this.a($$1xx, $$15), () -> {
            if (ab.aU) {
               this.bk();
            }

            this.bp.a();
            this.a($$15);
         }), false)));
      this.aR = gld.a($$0.e.b());
      this.bh = new fel(this.n, this);
      if (TracyClient.isAvailable() && $$0.d.f) {
         this.ar = new fdf();
      } else {
         this.ar = null;
      }
   }

   private void a(@Nullable flj.b $$0) {
      if (!this.by) {
         this.by = true;
         this.b($$0);
      }
   }

   private void b(@Nullable flj.b $$0) {
      Runnable $$1 = this.c($$0);
      hkd.a.b(hjz.C);
      hkd.a.b(hjz.z);
      hkd.a.a(this.aO.a());
      $$1.run();
   }

   public boolean c() {
      return this.by;
   }

   private Runnable c(@Nullable flj.b $$0) {
      List<Function<Runnable, fuk>> $$1 = new ArrayList<>();
      this.a($$1);
      Runnable $$2 = () -> {
         if ($$0 != null && $$0.b().a()) {
            glc.a(this, $$0.b(), $$0.a());
         } else {
            this.a((fuk)(new fum(true)));
         }
      };

      for (Function<Runnable, fuk> $$3 : Lists.reverse($$1)) {
         fuk $$4 = $$3.apply($$2);
         $$2 = () -> this.a($$4);
      }

      return $$2;
   }

   private void a(List<Function<Runnable, fuk>> $$0) {
      if (this.n.ac) {
         $$0.add($$0x -> new ftc(this.n, $$0x));
      }

      BanDetails $$1 = this.H();
      if ($$1 != null) {
         $$0.add($$1x -> ftf.a($$1xx -> {
               if ($$1xx) {
                  af.m().a(axv.n);
               }

               $$1x.run();
            }, $$1));
      }

      ProfileResult $$2 = this.N.join();
      if ($$2 != null) {
         GameProfile $$3 = $$2.profile();
         Set<ProfileActionType> $$4 = $$2.actions();
         if ($$4.contains(ProfileActionType.FORCED_NAME_CHANGE)) {
            $$0.add($$1x -> ftf.a($$3.getName(), $$1x));
         }

         if ($$4.contains(ProfileActionType.USING_BANNED_SKIN)) {
            $$0.add(ftf::a);
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
      gfz $$1 = this.L();
      if ($$1 != null && $$1.k().i()) {
         $$0.append(" - ");
         ggn $$2 = this.S();
         if (this.aS != null && !this.aS.r()) {
            $$0.append(hfq.a("title.singleplayer"));
         } else if ($$2 != null && $$2.e()) {
            $$0.append(hfq.a("title.multiplayer.realms"));
         } else if (this.aS == null && ($$2 == null || !$$2.d())) {
            $$0.append(hfq.a("title.multiplayer.other"));
         } else {
            $$0.append(hfq.a("title.multiplayer.lan"));
         }
      }

      return $$0.toString();
   }

   private UserApiService a(YggdrasilAuthenticationService $$0, gak $$1) {
      return $$1.a.a.g() != flv.a.c ? UserApiService.OFFLINE : $$0.createUserApiService($$1.a.a.d());
   }

   public static ayy e() {
      return ayy.a("vanilla", ClientBrandRetriever::getClientModName, "Client", flj.class);
   }

   private void a(Throwable $$0, @Nullable flj.b $$1) {
      if (this.an.e().size() > 1) {
         this.a($$0, null, $$1);
      } else {
         af.a($$0);
      }
   }

   public void a(Throwable $$0, @Nullable wo $$1, @Nullable flj.b $$2) {
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
         this.s.ac();
         this.y();
      }

      this.a((fuk)(new fum()));
      this.a(null);
   }

   private void a(@Nullable wo $$0) {
      frd $$1 = this.aA();
      frb.b($$1, frb.a.c, wo.c("resourcePack.load_fail"), $$0);
   }

   public void a(Exception $$0) {
      if (!this.an.b()) {
         if (this.an.e().size() <= 1) {
            G.error(LogUtils.FATAL_MARKER, $$0.getMessage(), $$0);
            this.c(new o($$0.getMessage(), $$0));
         } else {
            this.a_(this::bi);
         }
      } else {
         this.a($$0, wo.c("resourcePack.runtime_failure"), null);
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
               bov $$2 = bov.a("Renderer");
               boolean $$3 = this.aQ().e();

               try (bor.a $$4 = bor.a(this.a($$3, $$2))) {
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
               this.a((fuk)(new fud()));
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
      this.n.Q().a(false);
      this.n.az();
   }

   public fee h() {
      return this.aq;
   }

   public String i() {
      return this.ad;
   }

   public String j() {
      return this.ae;
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
      ayx.b();
      o $$1 = this.d($$0);
      this.bl();
      a(this, this.q, $$1);
   }

   public static int a(File $$0, o $$1) {
      Path $$2 = $$0.toPath().resolve("crash-reports");
      Path $$3 = $$2.resolve("crash-" + af.f() + "-client.txt");
      akw.a($$1.a(y.a));
      if ($$1.e() != null) {
         akw.a("#@!@# Game crashed! Crash report saved to: #@!@# " + $$1.e().toAbsolutePath());
         return -1;
      } else if ($$1.a($$3, y.a)) {
         akw.a("#@!@# Game crashed! Crash report saved to: #@!@# " + $$3.toAbsolutePath());
         return -1;
      } else {
         akw.a("#@?@# Game crashed! Crash report could not be saved. #@?@#");
         return -2;
      }
   }

   public static void a(@Nullable flj $$0, File $$1, o $$2) {
      int $$3 = a($$1, $$2);
      if ($$0 != null) {
         $$0.as.h();
      }

      System.exit($$3);
   }

   public boolean k() {
      return this.n.S().c();
   }

   public CompletableFuture<Void> l() {
      return this.a(false, null);
   }

   private CompletableFuture<Void> a(boolean $$0, @Nullable flj.b $$1) {
      if (this.bk != null) {
         return this.bk;
      } else {
         CompletableFuture<Void> $$2 = new CompletableFuture<>();
         if (!$$0 && this.ba instanceof fua) {
            this.bk = $$2;
            return $$2;
         } else {
            this.an.a();
            List<atb> $$3 = this.an.h();
            if (!$$0) {
               this.bp.a(flq.b.b, $$3);
            }

            this.a((fue)(new fua(this, this.ak.a(af.g().a("resourceLoad"), this, J, $$3), $$3x -> af.a($$3x, $$2xx -> {
                  if ($$0) {
                     this.am.c();
                     this.bi();
                  } else {
                     this.a($$2xx, $$1);
                  }
               }, () -> {
                  this.f.e();
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
      gna $$1 = this.ap().a();
      hgl $$2 = $$1.a().a();

      for (djm $$3 : mb.e) {
         UnmodifiableIterator $$7 = $$3.l().a().iterator();

         while ($$7.hasNext()) {
            dwx $$4 = (dwx)$$7.next();
            if ($$4.o() == dpx.c) {
               hgl $$5 = $$1.b($$4);
               if ($$5 == $$2) {
                  G.debug("Missing model for: {}", $$4);
                  $$0 = true;
               }
            }
         }
      }

      hej $$6 = $$2.d();

      for (djm $$7 : mb.e) {
         UnmodifiableIterator var15 = $$7.l().a().iterator();

         while (var15.hasNext()) {
            dwx $$8 = (dwx)var15.next();
            hej $$9 = $$1.a($$8);
            if (!$$8.l() && $$9 == $$6) {
               G.debug("Missing particle icon for: {}", $$8);
            }
         }
      }

      mb.g.c().forEach($$0x -> {
         cwl $$1x = (cwl)$$0x.a();
         String $$2x = $$1x.l();
         String $$3x = wo.c($$2x).getString();
         if ($$3x.toLowerCase(Locale.ROOT).equals($$1x.l())) {
            G.debug("Missing translation for: {} {} {}", new Object[]{$$0x.h().a(), $$2x, $$1x});
         }
      });
      $$0 |= fub.a();
      $$0 |= gsd.a();
      if ($$0) {
         throw new IllegalStateException("Your game data is foobar, fix the errors above!");
      }
   }

   public evf m() {
      return this.ag;
   }

   private void a(String $$0) {
      flj.a $$1 = this.J();
      if (!$$1.a(this.T())) {
         if (this.m.b()) {
            this.m.b(false);
            this.a((fuk)(new fth($$0x -> {
               if ($$0x) {
                  af.m().a(axv.g);
               }

               this.a(null);
            }, flj.a.e, axv.g, true)));
         } else {
            wo $$2 = $$1.a();
            this.m.a($$2, false);
            this.bt.c($$2);
            this.m.b($$1 == flj.a.d);
         }
      } else {
         this.a((fuk)(new ftg($$0)));
      }
   }

   public void a(@Nullable fuk $$0) {
      if (ab.aU && Thread.currentThread() != this.bc) {
         G.error("setScreen called from non-game thread");
      }

      if (this.z != null) {
         this.z.aI_();
      } else {
         this.a(flg.a);
      }

      if ($$0 == null && this.bb) {
         throw new IllegalStateException("Trying to return to in-game GUI during disconnection");
      } else {
         if ($$0 == null && this.s == null) {
            $$0 = new fum();
         } else if ($$0 == null && this.t.eF()) {
            if (this.t.t()) {
               $$0 = new fto(null, this.s.k().l());
            } else {
               this.t.gg();
            }
         }

         this.z = $$0;
         if (this.z != null) {
            this.z.aJ_();
         }

         ffq.a();
         if ($$0 != null) {
            this.o.j();
            flh.b();
            $$0.b(this, this.S.o(), this.S.p());
            this.y = false;
         } else {
            this.as.i();
            this.o.i();
         }

         this.d();
      }
   }

   public void a(@Nullable fue $$0) {
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
               this.s.ac();
            }

            this.y();
         } catch (Throwable var6) {
         }

         if (this.z != null) {
            this.z.aI_();
         }

         this.close();
      } finally {
         af.c = System::nanoTime;
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
         this.as.g();
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

         fru.b();
         af.j();
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

      if (this.bk != null && !(this.ba instanceof fua)) {
         CompletableFuture<Void> $$1 = this.bk;
         this.bk = null;
         this.l().thenRun(() -> $$1.complete(null));
      }

      Runnable $$2;
      while (($$2 = this.bj.poll()) != null) {
         $$2.run();
      }

      int $$3 = this.T.a(af.c(), $$0);
      bos $$4 = bor.a();
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
      this.aK.a();
      $$4.b("render");
      long $$6 = af.d();
      boolean $$8;
      if (!this.aQ().d() && !this.bo.e()) {
         $$8 = false;
         this.br = 0.0;
      } else {
         $$8 = this.bs == null || this.bs.b();
         if ($$8) {
            ffn.a().ifPresent(ffn::b);
         }
      }

      RenderSystem.clear(16640);
      this.aq.a(true);
      RenderSystem.setShaderFog(glm.a);
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
      this.bg = af.d() - $$6;
      if ($$8) {
         ffn.a().ifPresent($$0x -> this.bs = $$0x.c());
      }

      $$4.b("updateDisplay");
      if (this.ar != null) {
         this.ar.a();
         this.ar.a(this.aq);
      }

      this.S.a(this.ar);
      int $$9 = this.bh.a();
      if ($$9 < 260) {
         RenderSystem.limitDisplayFPS($$9);
      }

      $$4.b("yield");
      Thread.yield();
      $$4.c();
      this.S.a("Post render");
      this.aZ++;
      this.aW = this.U() && (this.z != null && this.z.k() || this.ba != null && this.ba.a()) && !this.aS.r();
      this.T.b(this.aW);
      this.T.c(!this.bq());
      long $$10 = af.d();
      long $$11 = $$10 - this.aX;
      if ($$8) {
         this.bq = $$11;
      }

      this.aQ().a($$11);
      this.aX = $$10;
      $$4.a("fpsUpdate");
      if (this.bs != null && this.bs.b()) {
         this.br = (double)this.bs.c() * 100.0 / (double)this.bq;
      }

      while (af.c() >= this.aY + 1000L) {
         String $$12;
         if (this.br > 0.0) {
            $$12 = " GPU: " + (this.br > 100.0 ? n.m + "100%" : Math.round(this.br) + "%");
         } else {
            $$12 = "";
         }

         bf = this.aZ;
         this.A = String.format(
            Locale.ROOT,
            "%d fps T: %s%s%s%s B: %d%s",
            bf,
            $$9 == 260 ? "inf" : $$9,
            this.n.Q().c() ? " vsync " : " ",
            this.n.k().c(),
            this.n.j().c() == fkv.a ? "" : (this.n.j().c() == fkv.b ? " fast-clouds" : " fancy-clouds"),
            this.n.G().c(),
            $$12
         );
         this.aY += 1000L;
         this.aZ = 0;
      }

      $$4.c();
   }

   private bos a(boolean $$0, @Nullable bov $$1) {
      if (!$$0) {
         this.bn.b();
         if (!this.bo.e() && $$1 == null) {
            return boo.a;
         }
      }

      bos $$2;
      if ($$0) {
         if (!this.bn.a()) {
            this.bm = 0;
            this.bn.c();
         }

         this.bm++;
         $$2 = this.bn.d();
      } else {
         $$2 = boo.a;
      }

      if (this.bo.e()) {
         $$2 = bos.a($$2, this.bo.f());
      }

      return bov.a($$2, $$1);
   }

   private void b(boolean $$0, @Nullable bov $$1) {
      if ($$1 != null) {
         $$1.b();
      }

      fql $$2 = this.aQ().o();
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

      fee $$1 = this.h();
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
      ayx.b();

      try {
         if (this.aU && this.aS != null) {
            this.aS.a(true);
         }

         this.b(new ftv(wo.c("menu.savingLevel")));
      } catch (Throwable var2) {
      }

      System.gc();
   }

   public boolean b(Consumer<wo> $$0) {
      if (this.bo.e()) {
         this.bm();
         return false;
      } else {
         Consumer<boq> $$1 = $$1x -> {
            if ($$1x != bom.a) {
               int $$2x = $$1x.f();
               double $$3x = (double)$$1x.g() / (double)bab.a;
               this.execute(
                  () -> $$0.accept(
                        wo.a("commands.debug.stopped", String.format(Locale.ROOT, "%.2f", $$3x), $$2x, String.format(Locale.ROOT, "%.2f", (double)$$2x / $$3x))
                     )
               );
            }
         };
         Consumer<Path> $$2 = $$1x -> {
            wo $$2x = wo.b($$1x.toString()).a(n.t).a($$1xx -> $$1xx.a(new wm(wm.a.b, $$1x.toFile().getParent())));
            this.execute(() -> $$0.accept(wo.a("debug.profiling.stop", $$2x)));
         };
         ad $$3 = a(new ad(), this, this.ao, this.ad, this.n);
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
            CompletableFuture.allOf($$6, $$7).thenRunAsync(() -> $$4.accept(ImmutableList.of($$6.join(), $$7.join())), af.h());
            this.aS.a($$0x -> {
            }, $$7::complete);
            $$5 = $$6::complete;
         }

         this.bo = bqh.a(new gla(af.c, this.f), af.c, af.h(), new bqn("client"), $$1x -> {
            this.bo = bqi.a;
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

   private Path a(ad $$0, List<Path> $$1) {
      String $$2;
      if (this.T()) {
         $$2 = this.V().aZ().e();
      } else {
         ggn $$3 = this.S();
         $$2 = $$3 != null ? $$3.a : "unknown";
      }

      Path $$7;
      try {
         String $$5 = String.format(Locale.ROOT, "%s-%s-%s", af.f(), $$2, ab.b().b());
         String $$6 = v.a(bqn.a, $$5, ".zip");
         $$7 = bqn.a.resolve($$6);
      } catch (IOException var21) {
         throw new UncheckedIOException(var21);
      }

      try (ayk $$10 = new ayk($$7)) {
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
            this.a((fuk)(new fuf(!$$0)));
            this.as.e();
         } else {
            this.a((fuk)(new fuf(true)));
         }
      }
   }

   private void d(boolean $$0) {
      if (!$$0) {
         this.x = 0;
      }

      if (this.x <= 0 && !this.t.fz()) {
         if ($$0 && this.w != null && this.w.d() == fay.a.b) {
            faw $$1 = (faw)this.w;
            ji $$2 = $$1.b();
            if (!this.s.a_($$2).l()) {
               jn $$3 = $$1.c();
               if (this.r.b($$2, $$3)) {
                  this.g.a($$2, $$3);
                  this.t.a(bsi.a);
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
      } else if (this.t.D()) {
         return false;
      } else {
         cwp $$0 = this.t.b(bsi.a);
         if (!$$0.a(this.s.K())) {
            return false;
         } else {
            boolean $$1 = false;
            switch (this.w.d()) {
               case c:
                  this.r.a(this.t, ((fax)this.w).a());
                  break;
               case b:
                  faw $$2 = (faw)this.w;
                  ji $$3 = $$2.b();
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

                  this.t.gD();
            }

            this.t.a(bsi.a);
            return $$1;
         }
      }
   }

   private void bp() {
      if (!this.r.k()) {
         this.aV = 4;
         if (!this.t.D()) {
            if (this.w == null) {
               G.warn("Null returned as 'hitResult', this shouldn't happen!");
            }

            for (bsi $$0 : bsi.values()) {
               cwp $$1 = this.t.b($$0);
               if (!$$1.a(this.s.K())) {
                  return;
               }

               if (this.w != null) {
                  switch (this.w.d()) {
                     case c:
                        fax $$2 = (fax)this.w;
                        buk $$3 = $$2.a();
                        if (!this.s.F_().a($$3.dw())) {
                           return;
                        }

                        bsj $$4 = this.r.a(this.t, $$3, $$2, $$0);
                        if (!$$4.a()) {
                           $$4 = this.r.a(this.t, $$3, $$0);
                        }

                        if ($$4 instanceof bsj.d $$5) {
                           if ($$5.e() == bsj.e.b) {
                              this.t.a($$0);
                           }

                           return;
                        }
                        break;
                     case b:
                        faw $$6 = (faw)this.w;
                        int $$7 = $$1.M();
                        bsj $$8 = this.r.a(this.t, $$0, $$6);
                        if ($$8 instanceof bsj.d $$9) {
                           if ($$9.e() == bsj.e.b) {
                              this.t.a($$0);
                              if (!$$1.f() && ($$1.M() != $$7 || this.r.f())) {
                                 this.j.c.a($$0);
                              }
                           }

                           return;
                        }

                        if ($$8 instanceof bsj.a) {
                           return;
                        }
                  }
               }

               if (!$$1.f() && this.r.a(this.t, $$0) instanceof bsj.d $$11) {
                  if ($$11.e() == bsj.e.b) {
                     this.t.a($$0);
                  }

                  this.j.c.a($$0);
                  return;
               }
            }
         }
      }
   }

   public hjj s() {
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

      bos $$0 = bor.a();
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
         this.O.f();
      }

      if (this.z != null || this.t == null) {
         if (this.z instanceof ftx $$1 && !this.t.fR()) {
            $$1.m();
         }
      } else if (this.t.eF() && !(this.z instanceof fto)) {
         this.a(null);
      } else if (this.t.fR() && this.s != null) {
         this.a((fuk)(new ftx()));
      }

      if (this.z != null) {
         this.x = 10000;
      }

      if (this.z != null) {
         try {
            this.z.e();
         } catch (Throwable var5) {
            o $$3 = o.a(var5, "Ticking screen");
            this.z.a($$3);
            throw new z($$3);
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
            this.f.n();
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
               wo $$4 = wo.c("tutorial.socialInteractions.title");
               wo $$5 = wo.a("tutorial.socialInteractions.description", hkq.a("socialInteractions"));
               this.bl = new fre(this.h, fre.a.f, $$4, $$5, true, 8000);
               this.aK.a(this.bl);
               this.n.s = true;
               this.n.az();
            }

            this.aL.d();

            try {
               this.s.a(() -> true);
            } catch (Throwable var6) {
               o $$7 = o.a(var6, "Exception in world tick");
               if (this.s == null) {
                  p $$8 = $$7.a("Affected level");
                  $$8.a("Problem", "Level is null!");
               } else {
                  this.s.a($$7);
               }

               throw new z($$7);
            }
         }

         $$0.b("animateTick");
         if (!this.aW && this.bq()) {
            this.s.b(this.t.dA(), this.t.dC(), this.t.dG());
         }

         $$0.b("particles");
         if (!this.aW && this.bq()) {
            this.g.b();
         }

         gfz $$9 = this.L();
         if ($$9 != null && !this.aW) {
            $$9.b(agr.a);
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
         fks $$0 = this.n.aE();
         this.n.a(this.n.aE().c());
         if ($$0.a() != this.n.aE().a()) {
            this.j.a(this.n.aE().a() ? this.ao() : null);
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
            if (this.t.Z_()) {
               this.m.g().a($$1);
            } else if (!this.t.b() || this.z != null || !$$3 && !$$2) {
               this.t.gi().j = $$1;
            } else {
               fvp.a(this, $$1, $$3, $$2);
            }
         }
      }

      while (this.n.L.g()) {
         if (!this.br()) {
            this.t.a(K, true);
            this.bt.c(K);
         } else {
            if (this.bl != null) {
               this.bl.d();
               this.bl = null;
            }

            this.a((fuk)(new fzc()));
         }
      }

      while (this.n.C.g()) {
         if (this.r.g()) {
            this.t.l();
         } else {
            this.aL.a();
            this.a((fuk)(new fwa(this.t)));
         }
      }

      while (this.n.R.g()) {
         this.a((fuk)(new fuu(this.t.j.p())));
      }

      while (this.n.D.g()) {
         if (!this.t.Z_()) {
            this.L().b(new ahl(ahl.a.g, ji.c, jn.a));
         }
      }

      while (this.n.E.g()) {
         if (!this.t.Z_() && this.t.a(fuk.s())) {
            this.t.a(bsi.a);
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

   public hjs u() {
      return this.aO;
   }

   public double v() {
      return this.br;
   }

   public ggl w() {
      return this.aP;
   }

   public fzw x() {
      return new fzw(this, this.ag);
   }

   public void a(evf.c $$0, aua $$1, alt $$2, boolean $$3) {
      this.y();
      this.aa.set(null);
      Instant $$4 = Instant.now();

      try {
         $$0.a($$2.c().a(), $$2.d());
         alp $$5 = alp.a(this.ay, this.q);
         $$5.f().a(this);
         dvo.a($$5, this);
         auz.a(false);
         this.aS = MinecraftServer.a((Function<Thread, hiw>)($$4x -> new hiw($$4x, this, $$0, $$1, $$2, $$5, $$0xx -> {
               arq $$1xx = arq.b($$0xx + 0);
               this.aa.set($$1xx);
               return arp.a($$1xx, this.bj::add);
            })));
         this.aU = true;
         this.a(ghe.a());
         this.aR.a(gld.c.a, $$0.f(), $$2.d().e());
      } catch (Throwable var12) {
         o $$7 = o.a(var12, "Starting integrated server");
         p $$8 = $$7.a("Starting integrated server");
         $$8.a("Level ID", $$0.f());
         $$8.a("Level Name", () -> $$2.d().e());
         throw new z($$7);
      }

      while (this.aa.get() == null) {
         Thread.yield();
      }

      fty $$9 = new fty(this.aa.get());
      bos $$10 = bor.a();
      this.a((fuk)$$9);
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
      vi $$13 = vi.a($$12);
      $$13.a($$12.toString(), 0, new gfx($$13, this, null, null, $$3, $$11, $$0x -> {
      }, null));
      $$13.a(new aiz(this.X().c(), this.X().b()));
      this.aT = $$13;
   }

   public void a(gfy $$0, fui.a $$1) {
      this.e(new fui(() -> false, $$1));
      this.s = $$0;
      this.a($$0);
      if (!this.aU) {
         alp $$2 = alp.a(this.ay, this.q);
         $$2.f().a(this);
         dvo.a($$2, this);
         auz.a(false);
      }
   }

   public void y() {
      this.a(new fuh(true), false);
   }

   public void b(fuk $$0) {
      this.a($$0, false);
   }

   public void a(fuk $$0, boolean $$1) {
      gfz $$2 = this.L();
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

      hiw $$3 = this.aS;
      this.aS = null;
      this.j.h();
      this.r = null;
      this.bt.b();
      this.bb = true;

      try {
         this.e($$0);
         if (this.s != null) {
            if ($$3 != null) {
               bos $$4 = bor.a();
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

      dvo.b();
   }

   public void z() {
      this.am.i();
      this.bA();
   }

   public void c(fuk $$0) {
      gfz $$1 = this.L();
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

      dvo.b();
   }

   private void e(fuk $$0) {
      bos $$1 = bor.a();
      $$1.a("forcedTick");
      this.as.f();
      this.u = null;
      this.aT = null;
      this.a($$0);
      this.c(false);
      $$1.c();
   }

   public void d(fuk $$0) {
      try (box $$1 = bor.a().d("forcedTick")) {
         this.a($$0);
         this.c(false);
      }
   }

   private void a(@Nullable gfy $$0) {
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
      return ab.aU ? false : this.bt().flag(UserFlag.TELEMETRY_ENABLED);
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
      return this.J().a(false) ? this.aM.c($$0) : (this.t == null || !$$0.equals(this.t.cG())) && !$$0.equals(af.e);
   }

   public flj.a J() {
      if (this.n.n().c() == cou.c) {
         return flj.a.b;
      } else if (!this.aj) {
         return flj.a.c;
      } else {
         return !this.bt().flag(UserFlag.CHAT_ALLOWED) ? flj.a.d : flj.a.a;
      }
   }

   public final boolean K() {
      return this.ah;
   }

   @Nullable
   public gfz L() {
      return this.t == null ? null : this.t.j;
   }

   public static boolean M() {
      return !F.n.X;
   }

   public static boolean N() {
      return F.n.k().c().b() >= flb.b.b();
   }

   public static boolean O() {
      return !F.j.a() && F.n.k().c().b() >= flb.c.b();
   }

   public static boolean P() {
      return F.n.l().c();
   }

   private void bu() {
      if (this.w != null && this.w.d() != fay.a.a) {
         boolean $$0 = fuk.s();
         fay var10000 = this.w;
         Objects.requireNonNull(this.w);
         Object var2 = var10000;
         switch (var2) {
            case faw $$1:
               this.r.a($$1.b(), $$0);
               break;
            case fax $$2:
               this.r.a($$2.a(), $$0);
               break;
         }
      }
   }

   public o d(o $$0) {
      ad $$1 = $$0.f();

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

   public static void a(@Nullable flj $$0, @Nullable hfs $$1, String $$2, @Nullable fln $$3, o $$4) {
      ad $$5 = $$4.f();
      a($$5, $$0, $$1, $$2, $$3);
   }

   private static String a(double $$0) {
      return String.format(Locale.ROOT, "%.3fs", $$0);
   }

   private void a(p $$0) {
      $$0.a("JVM uptime", () -> a((double)ManagementFactory.getRuntimeMXBean().getUptime() / 1000.0));
      $$0.a("Wall uptime", () -> a((double)(System.currentTimeMillis() - this.bz) / 1000.0));
      $$0.a("High-res time", () -> a((double)af.c() / 1000.0));
      $$0.a("Client ticks", () -> String.format(Locale.ROOT, "%d ticks / %.3fs", this.bA, (double)this.bA / 20.0));
   }

   private static ad a(ad $$0, @Nullable flj $$1, @Nullable hfs $$2, String $$3, @Nullable fln $$4) {
      $$0.a("Launched Version", () -> $$3);
      String $$5 = bg();
      if ($$5 != null) {
         $$0.a("Launcher name", $$5);
      }

      $$0.a("Backend library", RenderSystem::getBackendDescription);
      $$0.a("Backend API", RenderSystem::getApiDescription);
      $$0.a("Window size", () -> $$1 != null ? $$1.S.k() + "x" + $$1.S.l() : "<not initialized>");
      $$0.a("GFLW Platform", fex::a);
      $$0.a("GL Caps", RenderSystem::getCapsString);
      $$0.a("GL debug messages", () -> fem.b() ? String.join("\n", fem.a()) : "<disabled>");
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
         $$0.a("Render Distance", $$4.aH() + "/" + $$4.e().c() + " chunks");
      }

      if ($$1 != null) {
         $$0.a("Resource Packs", () -> aua.a($$1.ad().g()));
      }

      if ($$2 != null) {
         $$0.a("Current Language", () -> $$2.a());
      }

      $$0.a("Locale", String.valueOf(Locale.getDefault()));
      $$0.a("System encoding", () -> System.getProperty("sun.jnu.encoding", "<not set>"));
      $$0.a("File encoding", () -> System.getProperty("file.encoding", "<not set>"));
      $$0.a("CPU", fen::b);
      return $$0;
   }

   public static flj Q() {
      return F;
   }

   public CompletableFuture<Void> R() {
      return this.a(this::l).thenCompose($$0 -> (CompletionStage<Void>)$$0);
   }

   public void a(ghe $$0) {
      if (!this.bv.a($$0)) {
         this.bv = ghh.a($$0, this.aA);
      }
   }

   @Nullable
   public ggn S() {
      return x.a(this.L(), gfz::x);
   }

   public boolean T() {
      return this.aU;
   }

   public boolean U() {
      return this.aU && this.aS != null;
   }

   @Nullable
   public hiw V() {
      return this.aS;
   }

   public boolean W() {
      hiw $$0 = this.V();
      return $$0 != null && !$$0.r();
   }

   public boolean b(UUID $$0) {
      return $$0.equals(this.X().b());
   }

   public flv X() {
      return this.Z;
   }

   public GameProfile Y() {
      ProfileResult $$0 = this.N.join();
      return $$0 != null ? $$0.profile() : new GameProfile(this.Z.b(), this.Z.c());
   }

   public Proxy Z() {
      return this.af;
   }

   public hek aa() {
      return this.O;
   }

   public gmo ab() {
      return this.P;
   }

   public aup ac() {
      return this.ak;
   }

   public aua ad() {
      return this.an;
   }

   public atf ae() {
      return this.al;
   }

   public hhk af() {
      return this.am;
   }

   public Path ag() {
      return this.M;
   }

   public hfs ah() {
      return this.ao;
   }

   public Function<aku, hej> a(aku $$0) {
      return this.aD.b($$0)::a;
   }

   public boolean ai() {
      return this.aW;
   }

   public glp aj() {
      return this.aw;
   }

   public hjo ak() {
      return this.as;
   }

   public hji al() {
      avx $$0 = x.a(this.z, fuk::D);
      if ($$0 != null) {
         return new hji($$0);
      } else if (this.t != null) {
         dgi $$1 = this.t.dW();
         if ($$1.ai() == dgi.k) {
            return this.m.j().b() ? new hji(avy.d) : new hji(avy.e);
         } else {
            jr<dhk> $$2 = $$1.t(this.t.dw());
            float $$3 = $$2.a().p();
            if (!this.at.b(avy.f) && (!this.t.bo() || !$$2.a(awo.Z))) {
               if ($$1.ai() != dgi.j && this.t.gj().d && this.t.gj().c) {
                  return new hji(avy.b, $$3);
               } else {
                  Optional<bqr<avx>> $$4 = $$2.a().o();
                  if ($$4.isPresent()) {
                     Optional<avx> $$5 = $$4.get().a($$1.A);
                     return new hji($$5.orElse(null), $$3);
                  } else {
                     return new hji(avy.g, $$3);
                  }
               }
            } else {
               return new hji(avy.f, $$3);
            }
         }
      } else {
         return new hji(avy.a);
      }
   }

   public MinecraftSessionService am() {
      return this.az;
   }

   public hfl an() {
      return this.aC;
   }

   @Nullable
   public buk ao() {
      return this.u;
   }

   public void a(buk $$0) {
      this.u = $$0;
      this.j.a($$0);
   }

   public boolean b(buk $$0) {
      return $$0.co() || this.t != null && this.t.Z_() && this.n.Q.e() && $$0.aq() == bur.bS;
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

   public gnb ap() {
      return this.aE;
   }

   public gsa aq() {
      return this.V;
   }

   public goh ar() {
      return this.aN;
   }

   public gta as() {
      return this.X;
   }

   public glw at() {
      return this.Y;
   }

   public DataFixer au() {
      return this.Q;
   }

   public fkz av() {
      return this.T;
   }

   public fml aw() {
      return this.ap;
   }

   public boolean az() {
      return this.t != null && this.t.gz() || this.n.Y().c();
   }

   public frd aA() {
      return this.aK;
   }

   public hkq aB() {
      return this.aL;
   }

   public boolean aC() {
      return this.bi;
   }

   public fle aD() {
      return this.ab;
   }

   public hgz aE() {
      return this.aD;
   }

   public hfj aF() {
      return this.aF;
   }

   public hfi aG() {
      return this.aG;
   }

   public hfh aH() {
      return this.aH;
   }

   public hfg aI() {
      return this.aI;
   }

   public foe aJ() {
      return this.aJ;
   }

   @Override
   public void a(boolean $$0) {
      this.bi = $$0;
   }

   public wo a(File $$0, int $$1, int $$2) {
      int $$3 = this.S.k();
      int $$4 = this.S.l();
      fee $$5 = this.h();
      float $$6 = this.t.dO();
      float $$7 = this.t.dM();
      float $$8 = this.t.O;
      float $$9 = this.t.N;
      this.j.b(false);

      xc var12;
      try {
         this.j.c(true);
         this.S.a($$1);
         this.S.b($$2);
         $$5.a($$1, $$2);

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

            this.t.N = this.t.dM();
            this.t.O = this.t.dO();
            $$5.a(true);
            this.j.a(fkz.b);

            try {
               Thread.sleep(10L);
            } catch (InterruptedException var17) {
            }

            flr.a($$0, "panorama_" + $$10 + ".png", $$5, $$0x -> {
            });
         }

         wo $$11 = wo.b($$0.getName()).a(n.t).a($$1x -> $$1x.a(new wm(wm.a.b, $$0.getAbsolutePath())));
         return wo.a("screenshot.success", $$11);
      } catch (Exception var18) {
         G.error("Couldn't save image", var18);
         var12 = wo.a("screenshot.failure", var18.getMessage());
      } finally {
         this.t.w($$6);
         this.t.v($$7);
         this.t.O = $$8;
         this.t.N = $$9;
         this.j.b(true);
         this.S.a($$3);
         this.S.b($$4);
         $$5.a($$3, $$4);
         this.j.c(false);
         this.h().a(true);
      }

      return var12;
   }

   private wo a(File $$0, int $$1, int $$2, int $$3, int $$4) {
      try {
         ByteBuffer $$5 = fen.a($$1 * $$2 * 3);
         flr $$6 = new flr($$0, $$3, $$4, $$2);
         float $$7 = (float)$$3 / (float)$$1;
         float $$8 = (float)$$4 / (float)$$2;
         float $$9 = $$7 > $$8 ? $$7 : $$8;

         for (int $$10 = ($$4 - 1) / $$2 * $$2; $$10 >= 0; $$10 -= $$2) {
            for (int $$11 = 0; $$11 < $$3; $$11 += $$1) {
               RenderSystem.setShaderTexture(0, hei.d);
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
         fen.a($$5);
         wo $$15 = wo.b($$14.getName()).a(n.t).a($$1x -> $$1x.a(new wm(wm.a.b, $$14.getAbsolutePath())));
         return wo.a("screenshot.success", $$15);
      } catch (Exception var15) {
         G.warn("Couldn't save screenshot", var15);
         return wo.a("screenshot.failure", var15.getMessage());
      }
   }

   @Nullable
   public arq aK() {
      return this.aa.get();
   }

   public hfm aL() {
      return this.av;
   }

   @Nullable
   public fue aM() {
      return this.ba;
   }

   public fza aN() {
      return this.aM;
   }

   public fex aO() {
      return this.S;
   }

   public fel aP() {
      return this.bh;
   }

   public fpa aQ() {
      return this.m.k();
   }

   public gmf aR() {
      return this.U;
   }

   public void a(int $$0) {
      this.aD.a($$0);
   }

   public gey aS() {
      return this.aD.e().get();
   }

   public boolean aT() {
      return this.bt().flag(UserFlag.PROFANITY_FILTER_ENABLED);
   }

   public void aU() {
      this.aM.a();
      this.w().a();
   }

   @Nullable
   public azm aV() {
      return azm.a(this.ay.getServicesKeySet(), ServicesKeyType.PROFILE_KEY);
   }

   public boolean aW() {
      return !this.ay.getServicesKeySet().keys(ServicesKeyType.PROFILE_KEY).isEmpty();
   }

   public flg aX() {
      return this.ac;
   }

   public void a(flg $$0) {
      this.ac = $$0;
   }

   public fla aY() {
      return this.bt;
   }

   public ggs aZ() {
      return this.bu;
   }

   public ghh ba() {
      return this.bv;
   }

   public fij bb() {
      return this.aQ;
   }

   public gld bc() {
      return this.aR;
   }

   public fkw bd() {
      return this.bw;
   }

   public faq be() {
      return this.bx;
   }

   private float a(float $$0) {
      if (this.s != null) {
         bss $$1 = this.s.u();
         if ($$1.i()) {
            return Math.max($$0, $$1.g());
         }
      }

      return $$0;
   }

   public hbj bf() {
      return this.W;
   }

   @Nullable
   public static String bg() {
      return System.getProperty("minecraft.launcher.brand");
   }

   public static enum a {
      a(wn.a) {
         @Override
         public boolean a(boolean $$0) {
            return true;
         }
      },
      b(wo.c("chat.disabled.options").a(n.m)) {
         @Override
         public boolean a(boolean $$0) {
            return false;
         }
      },
      c(wo.c("chat.disabled.launcher").a(n.m)) {
         @Override
         public boolean a(boolean $$0) {
            return $$0;
         }
      },
      d(wo.a("chat.disabled.profile", wo.d(flj.F.n.I.h())).a(n.m)) {
         @Override
         public boolean a(boolean $$0) {
            return $$0;
         }
      };

      static final wo e = wo.c("chat.disabled.profile.moreInfo");
      private final wo f;

      a(final wo $$0) {
         this.f = $$0;
      }

      public wo a() {
         return this.f;
      }

      public abstract boolean a(boolean var1);
   }

   static record b(fgk a, gak.c b) {
   }
}
