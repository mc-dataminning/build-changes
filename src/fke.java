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

public class fke extends brd<Runnable> implements fdv {
   static fke F;
   private static final Logger G = LogUtils.getLogger();
   public static final boolean a = ae.m() == ae.a.d;
   private static final int H = 10;
   public static final alj b = alj.b("default");
   public static final alj c = alj.b("uniform");
   public static final alj d = alj.b("alt");
   private static final alj I = alj.b("regional_compliancies.json");
   private static final CompletableFuture<bas> J = CompletableFuture.completedFuture(bas.a);
   private static final xj K = xj.c("multiplayer.socialInteractions.not_available");
   public static final String e = "Please make sure you have up-to-date drivers (see aka.ms/mcdriver for instructions).";
   private final long L = Double.doubleToLongBits(Math.PI);
   private final Path M;
   private final CompletableFuture<ProfileResult> N;
   private final gzf O;
   private final gjx P;
   private final DataFixer Q;
   private final gkf R;
   private final fdu S;
   private final fju.b T = new fju.b(20.0F, 0L, this::a);
   private final gjo U;
   public final gjc f;
   private final gpi V;
   private final gqi W;
   private final gjf X;
   public final ggq g;
   private final fkr Y;
   public final flo h;
   public final flo i;
   public final giw j;
   public final gng l;
   private final AtomicReference<asd> Z = new AtomicReference<>();
   public final flp m;
   public final fki n;
   private final fjz aa;
   public final fkf o;
   public final fkd p;
   private fkb ab = fkb.a;
   public final File q;
   private final String ac;
   private final String ad;
   private final Proxy ae;
   private final eub af;
   private final boolean ag;
   private final boolean ah;
   private final boolean ai;
   private final ava aj;
   private final ats ak;
   private final hcd al;
   private final aun am;
   private final han an;
   private final flg ao;
   private final flk ap;
   private final fdb aq;
   @Nullable
   private final fcc ar;
   private final heg as;
   private final heb at;
   private final fou au;
   private final hah av;
   private final gix aw;
   private final fkj ax = new fkj(I, fke::a);
   private final YggdrasilAuthenticationService ay;
   private final MinecraftSessionService az;
   private final UserApiService aA;
   private final CompletableFuture<UserProperties> aB;
   private final hag aC;
   private final hbt aD;
   private final gkj aE;
   private final hbl aF;
   private final hae aG;
   private final had aH;
   private final hac aI;
   private final hab aJ;
   private final flr aK;
   private final foo aL;
   private final hfi aM;
   private final fwm aN;
   private final gch aO;
   private final glq aP;
   private final hek aQ;
   private final gdt aR;
   private final fhf aS;
   private final gik aT;
   @Nullable
   public gdq r;
   @Nullable
   public gdh s;
   @Nullable
   public gic t;
   @Nullable
   private hdp aU;
   @Nullable
   private wd aV;
   private boolean aW;
   @Nullable
   public bul u;
   @Nullable
   public bul v;
   @Nullable
   public ezw w;
   private int aX;
   protected int x;
   private volatile boolean aY;
   private long aZ = ae.d();
   private long ba;
   private int bb;
   public boolean y;
   @Nullable
   public frw z;
   @Nullable
   private frq bc;
   private boolean bd;
   Thread be;
   private volatile boolean bf;
   @Nullable
   private Supplier<o> bg;
   private static int bh;
   public String A = "";
   private long bi;
   private final fdi bj;
   public boolean B;
   public boolean C;
   public boolean D;
   public boolean E = true;
   private boolean bk;
   private final Queue<Runnable> bl = Queues.newConcurrentLinkedQueue();
   @Nullable
   private CompletableFuture<Void> bm;
   @Nullable
   private fop bn;
   private int bo;
   private final bon bp = new bon(ae.c, () -> this.bo);
   private bqk bq = bqj.a;
   private final fkm br = new fkm();
   private long bs;
   private double bt;
   @Nullable
   private fek.a bu;
   private final fjv bv;
   private final gea bw;
   private gep bx;
   private final fjr by;
   private final ezo bz;
   private boolean bA;
   private final long bB;
   private long bC;

   public fke(final fxw $$0) {
      super("Client");
      F = this;
      this.bB = System.currentTimeMillis();
      this.q = $$0.c.a;
      File $$1 = $$0.c.c;
      this.M = $$0.c.b.toPath();
      this.ac = $$0.d.b;
      this.ad = $$0.d.c;
      Path $$2 = this.q.toPath();
      this.bz = eub.a($$2.resolve("allowed_symlinks.txt"));
      gzv $$3 = new gzv($$0.c.a(), this.bz);
      this.al = new hcd(this, $$2.resolve("downloads"), $$0.a);
      aup $$4 = new aui(this.M, atq.a, auo.b, this.bz);
      this.am = new aun($$3, this.al.a(), $$4);
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
      yo.a(fkc::a);
      this.Q = bax.a();
      this.aL = new foo(this);
      this.be = Thread.currentThread();
      this.n = new fki(this, this.q);
      RenderSystem.setShaderGlintAlpha(this.n.ap().c());
      this.bf = true;
      this.aM = new hfi(this, this.n);
      this.aa = new fjz($$2, this.Q);
      G.info("Backend library: {}", RenderSystem.getBackendDescription());
      fdh $$5;
      if (this.n.p > 0 && this.n.o > 0) {
         $$5 = new fdh(this.n.o, this.n.p, $$0.b.c, $$0.b.d, $$0.b.e);
      } else {
         $$5 = $$0.b;
      }

      ae.c = RenderSystem.initBackendSystem();
      this.R = new gkf(this);
      this.S = this.R.a($$5, this.n.k, this.bh());
      this.a(true);
      this.S.a(new Runnable() {
         private boolean c;

         @Override
         public void run() {
            if (!this.c) {
               this.c = true;
               fde.a($$0.c.a, fke.this.be.threadId());
            }
         }
      });
      hev.a.b(her.A);

      try {
         this.S.a(this.ak, ab.b().g() ? fdl.a : fdl.b);
      } catch (IOException var13) {
         G.error("Couldn't set icon", var13);
      }

      this.o = new fkf(this);
      this.o.a(this.S.h());
      this.p = new fkd(this);
      this.p.a(this.S.h());
      RenderSystem.initRenderer(this.n.t, false);
      this.aq = new fcz(this.S.k(), this.S.l());
      this.aq.a(0.0F, 0.0F, 0.0F, 0.0F);
      this.aq.f();
      this.aj = new ava(atq.a);
      this.am.a();
      this.n.b(this.am);
      this.an = new han(this.n.ab, $$0x -> {
         if (this.t != null) {
            this.t.i.C();
         }
      });
      this.aj.a(this.an);
      this.O = new gzf(this.aj);
      this.aj.a(this.O);
      this.P = new gjx(this.O, this::a);
      this.aj.a(this.P);
      this.aC = new hag(this.O, $$1.toPath().resolve("skins"), this.az, this);
      this.af = new eub($$2.resolve("saves"), $$2.resolve("backups"), this.bz, this.Q);
      this.by = new fjr($$2);
      this.as = new heg(this.n);
      this.aj.a(this.as);
      this.av = new hah(this.Y);
      this.aj.a(this.av);
      this.at = new heb(this);
      this.au = new fou(this.O);
      this.h = this.au.a();
      this.i = this.au.b();
      this.aj.a(this.au);
      this.g();
      this.aj.a(new gzy());
      this.aj.a(new gzx());
      this.S.a("Startup");
      RenderSystem.setupDefaultState(0, 0, this.S.k(), this.S.l());
      this.S.a("Post startup");
      this.ao = flg.a();
      this.ap = flk.a(this.ao);
      this.aD = new hbt(this.O, this.ao, this.n.D().c());
      this.aj.a(this.aD);
      this.aO = new gch();
      this.aj.a(this.aO);
      this.aF = new hbl();
      this.aj.a(this.aF);
      this.aP = new glq(this.h, this.aO, this::ap, this::as, this::aq);
      this.aj.a(this.aP);
      gin $$8 = new gin(this.aP, this.aO);
      this.aj.a($$8);
      this.W = new gqi(this.aD, this.ap, $$8);
      this.aj.a(this.W);
      this.aI = new hac(this.O);
      this.aJ = new hab(this.O);
      this.aj.a(this.aJ);
      this.X = new gjf(this.aJ, this.aI);

      try {
         int $$9 = Runtime.getRuntime().availableProcessors();
         fet.a();
         this.U = new gjo($$9);
      } catch (OutOfMemoryError var12) {
         TinyFileDialogs.tinyfd_messageBox(
            "Minecraft",
            "Oh no! The game was unable to allocate memory off-heap while trying to start. You may try to free some memory by closing other applications on your computer, check that your system meets the minimum requirements, and try again. If the problem persists, please visit: "
               + ayi.k,
            "ok",
            "error",
            true
         );
         throw new fxx("Unable to allocate render buffers", var12);
      }

      this.aN = new fwm(this, this.aA);
      this.aE = new gkj(this.aD.b(), $$8, this.ao);
      this.aj.a(this.aE);
      this.V = new gpi(this, this.O, this.W, this.X, this.aE, this.h, this.n, this.aO, this.aF);
      this.aj.a(this.V);
      this.g = new ggq(this.s, this.O);
      this.aj.a(this.g);
      this.aG = new hae(this.O);
      this.aj.a(this.aG);
      this.aH = new had(this.O);
      this.aj.a(this.aH);
      this.aK = new flr(this.O);
      this.aj.a(this.aK);
      this.j = new giw(this, this.V.d(), this.aj, this.U);
      this.f = new gjc(this, this.V, this.aP, this.U);
      this.aj.a(this.f);
      this.aj.a(this.f.z());
      this.aw = new gix();
      this.aj.a(this.aw);
      this.aj.a(this.ax);
      this.m = new flp(this);
      this.l = new gng(this);
      ffh $$11 = ffh.a(this);
      this.aS = new fhf($$11);
      RenderSystem.setErrorCallback(this::a);
      if (this.aq.c != this.S.k() || this.aq.d != this.S.l()) {
         StringBuilder $$12 = new StringBuilder(
            "Recovering from unsupported resolution ("
               + this.S.k()
               + "x"
               + this.S.l()
               + ").\nPlease make sure you have up-to-date drivers (see aka.ms/mcdriver for instructions)."
         );
         if (fdj.b()) {
            $$12.append("\n\nReported GL debug messages:\n").append(String.join("\n", fdj.a()));
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
      this.aQ = new hek(this, this.aA, this.Y);
      this.aR = gdt.a(this.aA, this.Y, $$2);
      this.bv = new fjv(this);
      this.bv.a(this.n.au().c() != fkg.a);
      this.bw = new gea(this);
      this.bw.a(this.n.B().c());
      this.bx = gep.a(gem.a(), this.aA);
      frm.a(this);
      this.a((frw)(new frh(xj.c("gui.loadingMinecraft"))));
      List<ato> $$13 = this.am.h();
      this.br.a(fkm.b.a, $$13);
      auz $$14 = this.aj.a(ae.g().a("resourceLoad"), this, J, $$13);
      hev.a.a(her.C);
      fke.b $$15 = new fke.b($$11, $$0.e);
      this.a((frq)(new frm(this, $$14, $$1x -> ae.a($$1x, $$1xx -> this.a($$1xx, $$15), () -> {
            if (ab.aU) {
               this.bk();
            }

            this.br.a();
            this.a($$15);
         }), false)));
      this.aT = gik.a($$0.e.b());
      this.bj = new fdi(this.n, this);
      if (TracyClient.isAvailable() && $$0.d.f) {
         this.ar = new fcc();
      } else {
         this.ar = null;
      }
   }

   private void a(@Nullable fke.b $$0) {
      if (!this.bA) {
         this.bA = true;
         this.b($$0);
      }
   }

   private void b(@Nullable fke.b $$0) {
      Runnable $$1 = this.c($$0);
      hev.a.b(her.C);
      hev.a.b(her.z);
      hev.a.a(this.aQ.a());
      $$1.run();
   }

   public boolean c() {
      return this.bA;
   }

   private Runnable c(@Nullable fke.b $$0) {
      List<Function<Runnable, frw>> $$1 = new ArrayList<>();
      this.a($$1);
      Runnable $$2 = () -> {
         if ($$0 != null && $$0.b().a()) {
            gij.a(this, $$0.b(), $$0.a());
         } else {
            this.a((frw)(new fry(true)));
         }
      };

      for (Function<Runnable, frw> $$3 : Lists.reverse($$1)) {
         frw $$4 = $$3.apply($$2);
         $$2 = () -> this.a($$4);
      }

      return $$2;
   }

   private void a(List<Function<Runnable, frw>> $$0) {
      if (this.n.ac) {
         $$0.add($$0x -> new fqo(this.n, $$0x));
      }

      BanDetails $$1 = this.H();
      if ($$1 != null) {
         $$0.add($$1x -> fqr.a($$1xx -> {
               if ($$1xx) {
                  ae.m().a(ayi.n);
               }

               $$1x.run();
            }, $$1));
      }

      ProfileResult $$2 = this.N.join();
      if ($$2 != null) {
         GameProfile $$3 = $$2.profile();
         Set<ProfileActionType> $$4 = $$2.actions();
         if ($$4.contains(ProfileActionType.FORCED_NAME_CHANGE)) {
            $$0.add($$1x -> fqr.a($$3.getName(), $$1x));
         }

         if ($$4.contains(ProfileActionType.USING_BANNED_SKIN)) {
            $$0.add(fqr::a);
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
      gdi $$1 = this.L();
      if ($$1 != null && $$1.k().i()) {
         $$0.append(" - ");
         gdv $$2 = this.S();
         if (this.aU != null && !this.aU.r()) {
            $$0.append(hal.a("title.singleplayer"));
         } else if ($$2 != null && $$2.e()) {
            $$0.append(hal.a("title.multiplayer.realms"));
         } else if (this.aU == null && ($$2 == null || !$$2.d())) {
            $$0.append(hal.a("title.multiplayer.other"));
         } else {
            $$0.append(hal.a("title.multiplayer.lan"));
         }
      }

      return $$0.toString();
   }

   private UserApiService a(YggdrasilAuthenticationService $$0, fxw $$1) {
      return $$1.a.a.g() != fkr.a.c ? UserApiService.OFFLINE : $$0.createUserApiService($$1.a.a.d());
   }

   public static azl e() {
      return azl.a("vanilla", ClientBrandRetriever::getClientModName, "Client", fke.class);
   }

   private void a(Throwable $$0, @Nullable fke.b $$1) {
      if (this.am.e().size() > 1) {
         this.a($$0, null, $$1);
      } else {
         ae.a($$0);
      }
   }

   public void a(Throwable $$0, @Nullable xj $$1, @Nullable fke.b $$2) {
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
         this.s.aa();
         this.y();
      }

      this.a((frw)(new fry()));
      this.a(null);
   }

   private void a(@Nullable xj $$0) {
      foo $$1 = this.aA();
      fom.b($$1, fom.a.c, xj.c("resourcePack.load_fail"), $$0);
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
         this.a($$0, xj.c("resourcePack.runtime_failure"), null);
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
               box $$2 = box.a("Renderer");
               boolean $$3 = this.aQ().e();

               try (bot.a $$4 = bot.a(this.a($$3, $$2))) {
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
               this.a((frw)(new frp()));
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

   public fdb h() {
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
      all.a($$1.a(y.a));
      if ($$1.e() != null) {
         all.a("#@!@# Game crashed! Crash report saved to: #@!@# " + $$1.e().toAbsolutePath());
         return -1;
      } else if ($$1.a($$3, y.a)) {
         all.a("#@!@# Game crashed! Crash report saved to: #@!@# " + $$3.toAbsolutePath());
         return -1;
      } else {
         all.a("#@?@# Game crashed! Crash report could not be saved. #@?@#");
         return -2;
      }
   }

   public static void a(@Nullable fke $$0, File $$1, o $$2) {
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

   private CompletableFuture<Void> a(boolean $$0, @Nullable fke.b $$1) {
      if (this.bm != null) {
         return this.bm;
      } else {
         CompletableFuture<Void> $$2 = new CompletableFuture<>();
         if (!$$0 && this.bc instanceof frm) {
            this.bm = $$2;
            return $$2;
         } else {
            this.am.a();
            List<ato> $$3 = this.am.h();
            if (!$$0) {
               this.br.a(fkm.b.b, $$3);
            }

            this.a((frq)(new frm(this, this.aj.a(ae.g().a("resourceLoad"), this, J, $$3), $$3x -> ae.a($$3x, $$2xx -> {
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
      gki $$1 = this.ap().a();
      hbg $$2 = $$1.a().a();

      for (diq $$3 : lz.e) {
         UnmodifiableIterator $$7 = $$3.l().a().iterator();

         while ($$7.hasNext()) {
            dvv $$4 = (dvv)$$7.next();
            if ($$4.o() == dow.c) {
               hbg $$5 = $$1.b($$4);
               if ($$5 == $$2) {
                  G.debug("Missing model for: {}", $$4);
                  $$0 = true;
               }
            }
         }
      }

      gze $$6 = $$2.e();

      for (diq $$7 : lz.e) {
         UnmodifiableIterator var15 = $$7.l().a().iterator();

         while (var15.hasNext()) {
            dvv $$8 = (dvv)var15.next();
            gze $$9 = $$1.a($$8);
            if (!$$8.l() && $$9 == $$6) {
               G.debug("Missing particle icon for: {}", $$8);
            }
         }
      }

      lz.g.c().forEach($$0x -> {
         cwi $$1x = (cwi)$$0x.a();
         String $$2x = $$1x.m();
         String $$3x = xj.c($$2x).getString();
         if ($$3x.toLowerCase(Locale.ROOT).equals($$1x.m())) {
            G.debug("Missing translation for: {} {} {}", new Object[]{$$0x.h().a(), $$2x, $$1x});
         }
      });
      $$0 |= frn.a();
      $$0 |= gpl.a();
      if ($$0) {
         throw new IllegalStateException("Your game data is foobar, fix the errors above!");
      }
   }

   public eub m() {
      return this.af;
   }

   private void a(String $$0) {
      fke.a $$1 = this.J();
      if (!$$1.a(this.T())) {
         if (this.m.b()) {
            this.m.b(false);
            this.a((frw)(new fqt($$0x -> {
               if ($$0x) {
                  ae.m().a(ayi.g);
               }

               this.a(null);
            }, fke.a.e, ayi.g, true)));
         } else {
            xj $$2 = $$1.a();
            this.m.a($$2, false);
            this.bv.c($$2);
            this.m.b($$1 == fke.a.d);
         }
      } else {
         this.a((frw)(new fqs($$0)));
      }
   }

   public void a(@Nullable frw $$0) {
      if (ab.aU && Thread.currentThread() != this.be) {
         G.error("setScreen called from non-game thread");
      }

      if (this.z != null) {
         this.z.j();
      } else {
         this.a(fkb.a);
      }

      if ($$0 == null && this.bd) {
         throw new IllegalStateException("Trying to return to in-game GUI during disconnection");
      } else {
         if ($$0 == null && this.s == null) {
            $$0 = new fry();
         } else if ($$0 == null && this.t.eE()) {
            if (this.t.t()) {
               $$0 = new fra(null, this.s.j().l());
            } else {
               this.t.ge();
            }
         }

         this.z = $$0;
         if (this.z != null) {
            this.z.aI_();
         }

         fen.a();
         if ($$0 != null) {
            this.o.j();
            fkc.b();
            $$0.b(this, this.S.o(), this.S.p());
            this.y = false;
         } else {
            this.as.i();
            this.o.i();
         }

         this.d();
      }
   }

   public void a(@Nullable frq $$0) {
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
               this.s.aa();
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

         fpg.b();
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

      if (this.bm != null && !(this.bc instanceof frm)) {
         CompletableFuture<Void> $$1 = this.bm;
         this.bm = null;
         this.l().thenRun(() -> $$1.complete(null));
      }

      Runnable $$2;
      while (($$2 = this.bl.poll()) != null) {
         $$2.run();
      }

      int $$3 = this.T.a(ae.c(), $$0);
      bou $$4 = bot.a();
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
            fek.a().ifPresent(fek::b);
         }
      }

      RenderSystem.clear(16640);
      this.aq.a(true);
      RenderSystem.setShaderFog(giu.a);
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
         fek.a().ifPresent($$0x -> this.bu = $$0x.c());
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
            this.n.j().c() == fjq.a ? "" : (this.n.j().c() == fjq.b ? " fast-clouds" : " fancy-clouds"),
            this.n.F().c(),
            $$12
         );
         this.ba += 1000L;
         this.bb = 0;
      }

      $$4.c();
   }

   private bou a(boolean $$0, @Nullable box $$1) {
      if (!$$0) {
         this.bp.b();
         if (!this.bq.e() && $$1 == null) {
            return boq.a;
         }
      }

      bou $$2;
      if ($$0) {
         if (!this.bp.a()) {
            this.bo = 0;
            this.bp.c();
         }

         this.bo++;
         $$2 = this.bp.d();
      } else {
         $$2 = boq.a;
      }

      if (this.bq.e()) {
         $$2 = bou.a($$2, this.bq.f());
      }

      return box.a($$2, $$1);
   }

   private void b(boolean $$0, @Nullable box $$1) {
      if ($$1 != null) {
         $$1.b();
      }

      fnw $$2 = this.aQ().o();
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

      fdb $$1 = this.h();
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
         azk.b();
      } catch (Throwable var3) {
      }

      try {
         System.gc();
         if (this.aW && this.aU != null) {
            this.aU.a(true);
         }

         this.b(new frh(xj.c("menu.savingLevel")));
      } catch (Throwable var2) {
      }

      System.gc();
   }

   public boolean b(Consumer<xj> $$0) {
      if (this.bq.e()) {
         this.bm();
         return false;
      } else {
         Consumer<bos> $$1 = $$1x -> {
            if ($$1x != boo.a) {
               int $$2x = $$1x.f();
               double $$3x = (double)$$1x.g() / (double)bao.a;
               this.execute(
                  () -> $$0.accept(
                        xj.a("commands.debug.stopped", String.format(Locale.ROOT, "%.2f", $$3x), $$2x, String.format(Locale.ROOT, "%.2f", (double)$$2x / $$3x))
                     )
               );
            }
         };
         Consumer<Path> $$2 = $$1x -> {
            xj $$2x = xj.b($$1x.toString()).a(n.t).a($$1xx -> $$1xx.a(new xh(xh.a.b, $$1x.toFile().getParent())));
            this.execute(() -> $$0.accept(xj.a("debug.profiling.stop", $$2x)));
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

         this.bq = bqi.a(new gih(ae.c, this.f), ae.c, ae.h(), new bqo("client"), $$1x -> {
            this.bq = bqj.a;
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
         gdv $$3 = this.S();
         $$2 = $$3 != null ? $$3.a : "unknown";
      }

      Path $$7;
      try {
         String $$5 = String.format(Locale.ROOT, "%s-%s-%s", ae.f(), $$2, ab.b().b());
         String $$6 = v.a(bqo.a, $$5, ".zip");
         $$7 = bqo.a.resolve($$6);
      } catch (IOException var21) {
         throw new UncheckedIOException(var21);
      }

      try (ayx $$10 = new ayx($$7)) {
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
            this.a((frw)(new frr(!$$0)));
            this.as.e();
         } else {
            this.a((frw)(new frr(true)));
         }
      }
   }

   private void d(boolean $$0) {
      if (!$$0) {
         this.x = 0;
      }

      if (this.x <= 0 && !this.t.fx()) {
         if ($$0 && this.w != null && this.w.d() == ezw.a.b) {
            ezu $$1 = (ezu)this.w;
            jh $$2 = $$1.b();
            if (!this.s.a_($$2).l()) {
               jm $$3 = $$1.c();
               if (this.r.b($$2, $$3)) {
                  this.g.a($$2, $$3);
                  this.t.a(bsj.a);
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
         cwm $$0 = this.t.b(bsj.a);
         if (!$$0.a(this.s.J())) {
            return false;
         } else {
            boolean $$1 = false;
            switch (this.w.d()) {
               case c:
                  this.r.a(this.t, ((ezv)this.w).a());
                  break;
               case b:
                  ezu $$2 = (ezu)this.w;
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

                  this.t.gB();
            }

            this.t.a(bsj.a);
            return $$1;
         }
      }
   }

   private void bp() {
      if (!this.r.k()) {
         this.aX = 4;
         if (!this.t.D()) {
            if (this.w == null) {
               G.warn("Null returned as 'hitResult', this shouldn't happen!");
            }

            for (bsj $$0 : bsj.values()) {
               cwm $$1 = this.t.b($$0);
               if (!$$1.a(this.s.J())) {
                  return;
               }

               if (this.w != null) {
                  switch (this.w.d()) {
                     case c:
                        ezv $$2 = (ezv)this.w;
                        bul $$3 = $$2.a();
                        if (!this.s.E_().a($$3.dv())) {
                           return;
                        }

                        bsk $$4 = this.r.a(this.t, $$3, $$2, $$0);
                        if (!$$4.a()) {
                           $$4 = this.r.a(this.t, $$3, $$0);
                        }

                        if ($$4 instanceof bsk.d $$5) {
                           if ($$5.e() == bsk.e.b) {
                              this.t.a($$0);
                           }

                           return;
                        }
                        break;
                     case b:
                        ezu $$6 = (ezu)this.w;
                        int $$7 = $$1.L();
                        bsk $$8 = this.r.a(this.t, $$0, $$6);
                        if ($$8 instanceof bsk.d $$9) {
                           if ($$9.e() == bsk.e.b) {
                              this.t.a($$0);
                              if (!$$1.f() && ($$1.L() != $$7 || this.r.f())) {
                                 this.j.c.a($$0);
                              }
                           }

                           return;
                        }

                        if ($$8 instanceof bsk.a) {
                           return;
                        }
                  }
               }

               if (!$$1.f() && this.r.a(this.t, $$0) instanceof bsk.d $$11) {
                  if ($$11.e() == bsk.e.b) {
                     this.t.a($$0);
                  }

                  this.j.c.a($$0);
                  return;
               }
            }
         }
      }
   }

   public heb s() {
      return this.at;
   }

   public void t() {
      this.bC++;
      if (this.s != null && !this.aY) {
         this.s.t().m();
      }

      if (this.aX > 0) {
         this.aX--;
      }

      bou $$0 = bot.a();
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
         if (this.z instanceof frj $$1 && !this.t.fP()) {
            $$1.m();
         }
      } else if (this.t.eE() && !(this.z instanceof fra)) {
         this.a(null);
      } else if (this.t.fP() && this.s != null) {
         this.a((frw)(new frj()));
      }

      if (this.z != null) {
         this.x = 10000;
      }

      if (this.z != null) {
         frw.a(() -> this.z.e(), "Ticking screen", this.z.getClass().getCanonicalName());
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
               xj $$2 = xj.c("tutorial.socialInteractions.title");
               xj $$3 = xj.a("tutorial.socialInteractions.description", hfi.a("socialInteractions"));
               this.bn = new fop(fop.a.f, $$2, $$3, true, 8000);
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
            this.s.b(this.t.dz(), this.t.dB(), this.t.dF());
         }

         $$0.b("particles");
         if (!this.aY && this.bq()) {
            this.g.b();
         }

         gdi $$7 = this.L();
         if ($$7 != null && !this.aY) {
            $$7.b(ahi.a);
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
      return this.s == null || this.s.t().i();
   }

   private boolean br() {
      return !this.aW || this.aU != null && this.aU.r();
   }

   private void bs() {
      while (this.n.N.g()) {
         fjo $$0 = this.n.aD();
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
            if (this.t.Y_()) {
               this.m.g().a($$1);
            } else if (!this.t.b() || this.z != null || !$$3 && !$$2) {
               this.t.gg().j = $$1;
            } else {
               ftb.a(this, $$1, $$3, $$2);
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

            this.a((frw)(new fwo()));
         }
      }

      while (this.n.C.g()) {
         if (this.r.g()) {
            this.t.l();
         } else {
            this.aM.a();
            this.a((frw)(new ftm(this.t)));
         }
      }

      while (this.n.R.g()) {
         this.a((frw)(new fsg(this.t.i.p())));
      }

      while (this.n.D.g()) {
         if (!this.t.Y_()) {
            this.L().b(new aib(aib.a.g, jh.c, jm.a));
         }
      }

      while (this.n.E.g()) {
         if (!this.t.Y_() && this.t.a(frw.s())) {
            this.t.a(bsj.a);
         }
      }

      while (this.n.I.g()) {
         this.a("");
      }

      if (this.z == null && this.bc == null && this.n.K.g()) {
         this.a("/");
      }

      boolean $$4 = false;
      if (this.t.fx()) {
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

      if (this.n.F.e() && this.aX == 0 && !this.t.fx()) {
         this.bp();
      }

      this.d(this.z == null && !$$4 && this.n.G.e() && this.o.h());
   }

   public hek u() {
      return this.aQ;
   }

   public double v() {
      return this.bt;
   }

   public gdt w() {
      return this.aR;
   }

   public fxi x() {
      return new fxi(this, this.af);
   }

   public void a(eub.c $$0, aun $$1, ami $$2, boolean $$3) {
      this.y();
      this.Z.set(null);
      Instant $$4 = Instant.now();

      try {
         $$0.a($$2.c().a(), $$2.d());
         ame $$5 = ame.a(this.ay, this.q);
         $$5.f().a(this);
         dum.a($$5, this);
         avm.a(false);
         this.aU = MinecraftServer.a((Function<Thread, hdp>)($$4x -> new hdp($$4x, this, $$0, $$1, $$2, $$5, $$0xx -> {
               asd $$1xx = asd.b($$0xx + 0);
               this.Z.set($$1xx);
               return asc.a($$1xx, this.bl::add);
            })));
         this.aW = true;
         this.a(gem.a());
         this.aT.a(gik.c.a, $$0.f(), $$2.d().e());
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

      frk $$9 = new frk(this.Z.get());
      bou $$10 = bot.a();
      this.a((frw)$$9);
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
      wd $$13 = wd.a($$12);
      $$13.a($$12.toString(), 0, new gdg($$13, this, null, null, $$3, $$11, $$0x -> {
      }, null));
      $$13.a(new ajo(this.X().c(), this.X().b()));
      this.aV = $$13;
   }

   public void a(gdh $$0, fru.a $$1) {
      this.e(new fru(() -> false, $$1));
      this.s = $$0;
      this.a($$0);
      if (!this.aW) {
         ame $$2 = ame.a(this.ay, this.q);
         $$2.f().a(this);
         dum.a($$2, this);
         avm.a(false);
      }
   }

   public void y() {
      this.a(new frt(true), false);
   }

   public void b(frw $$0) {
      this.a($$0, false);
   }

   public void a(frw $$0, boolean $$1) {
      gdi $$2 = this.L();
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

      hdp $$3 = this.aU;
      this.aU = null;
      this.j.h();
      this.r = null;
      this.bv.b();
      this.bd = true;

      try {
         this.e($$0);
         if (this.s != null) {
            if ($$3 != null) {
               bou $$4 = bot.a();
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

      dum.b();
   }

   public void z() {
      this.al.i();
      this.bA();
   }

   public void c(frw $$0) {
      gdi $$1 = this.L();
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

      dum.b();
   }

   private void e(frw $$0) {
      bou $$1 = bot.a();
      $$1.a("forcedTick");
      this.as.f();
      this.u = null;
      this.aV = null;
      this.a($$0);
      this.c(false);
      $$1.c();
   }

   public void d(frw $$0) {
      try (boz $$1 = bot.a().d("forcedTick")) {
         this.a($$0);
         this.c(false);
      }
   }

   private void a(@Nullable gdh $$0) {
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
      return ab.aU ? false : this.bt().flag(UserFlag.TELEMETRY_ENABLED);
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
      return this.J().a(false) ? this.aN.c($$0) : (this.t == null || !$$0.equals(this.t.cG())) && !$$0.equals(ae.e);
   }

   public fke.a J() {
      if (this.n.n().c() == cor.c) {
         return fke.a.b;
      } else if (!this.ai) {
         return fke.a.c;
      } else {
         return !this.bt().flag(UserFlag.CHAT_ALLOWED) ? fke.a.d : fke.a.a;
      }
   }

   public final boolean K() {
      return this.ag;
   }

   @Nullable
   public gdi L() {
      return this.t == null ? null : this.t.i;
   }

   public static boolean M() {
      return !F.n.X;
   }

   public static boolean N() {
      return F.n.k().c().b() >= fjw.b.b();
   }

   public static boolean O() {
      return !F.j.a() && F.n.k().c().b() >= fjw.c.b();
   }

   public static boolean P() {
      return F.n.l().c();
   }

   private void bu() {
      if (this.w != null && this.w.d() != ezw.a.a) {
         boolean $$0 = this.t.gh().d;
         dsy $$1 = null;
         ezw.a $$2 = this.w.d();
         cwm $$6;
         if ($$2 == ezw.a.b) {
            jh $$3 = ((ezu)this.w).b();
            dvv $$4 = this.s.a_($$3);
            if ($$4.l()) {
               return;
            }

            diq $$5 = $$4.b();
            $$6 = $$5.a((dfp)this.s, $$3, $$4);
            if ($$6.f()) {
               return;
            }

            if ($$0 && frw.s() && $$4.x()) {
               $$1 = this.s.c_($$3);
            }
         } else {
            if ($$2 != ezw.a.c || !$$0) {
               return;
            }

            bul $$7 = ((ezv)this.w).a();
            $$6 = $$7.dI();
            if ($$6 == null) {
               return;
            }
         }

         if ($$6.f()) {
            String $$10 = "";
            if ($$2 == ezw.a.b) {
               $$10 = lz.e.b(this.s.a_(((ezu)this.w).b()).b()).toString();
            } else if ($$2 == ezw.a.c) {
               $$10 = lz.f.b(((ezv)this.w).a().aq()).toString();
            }

            G.warn("Picking on: [{}] {} gave null item", $$2, $$10);
         } else {
            cot $$11 = this.t.gg();
            if ($$1 != null) {
               this.a($$6, $$1, this.s.J_());
            }

            int $$12 = $$11.c($$6);
            if ($$0) {
               $$11.b($$6);
               this.r.a(this.t.b(bsj.a), 36 + $$11.j);
            } else if ($$12 != -1) {
               if (cot.d($$12)) {
                  $$11.j = $$12;
               } else {
                  this.r.a($$12);
               }
            }
         }
      }
   }

   private void a(cwm $$0, dsy $$1, ke $$2) {
      ul $$3 = $$1.f($$2);
      $$1.a($$3);
      cus.a($$0, $$1.q(), $$3);
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

   public static void a(@Nullable fke $$0, @Nullable han $$1, String $$2, @Nullable fki $$3, o $$4) {
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

   private static ac a(ac $$0, @Nullable fke $$1, @Nullable han $$2, String $$3, @Nullable fki $$4) {
      $$0.a("Launched Version", () -> $$3);
      String $$5 = bg();
      if ($$5 != null) {
         $$0.a("Launcher name", $$5);
      }

      $$0.a("Backend library", RenderSystem::getBackendDescription);
      $$0.a("Backend API", RenderSystem::getApiDescription);
      $$0.a("Window size", () -> $$1 != null ? $$1.S.k() + "x" + $$1.S.l() : "<not initialized>");
      $$0.a("GFLW Platform", fdu::a);
      $$0.a("GL Caps", RenderSystem::getCapsString);
      $$0.a("GL debug messages", () -> fdj.b() ? String.join("\n", fdj.a()) : "<disabled>");
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
         $$0.a("Resource Packs", () -> aun.a($$1.ad().g()));
      }

      if ($$2 != null) {
         $$0.a("Current Language", () -> $$2.a());
      }

      $$0.a("Locale", String.valueOf(Locale.getDefault()));
      $$0.a("System encoding", () -> System.getProperty("sun.jnu.encoding", "<not set>"));
      $$0.a("File encoding", () -> System.getProperty("file.encoding", "<not set>"));
      $$0.a("CPU", fdk::b);
      return $$0;
   }

   public static fke Q() {
      return F;
   }

   public CompletableFuture<Void> R() {
      return this.a(this::l).thenCompose($$0 -> (CompletionStage<Void>)$$0);
   }

   public void a(gem $$0) {
      if (!this.bx.a($$0)) {
         this.bx = gep.a($$0, this.aA);
      }
   }

   @Nullable
   public gdv S() {
      return x.a(this.L(), gdi::x);
   }

   public boolean T() {
      return this.aW;
   }

   public boolean U() {
      return this.aW && this.aU != null;
   }

   @Nullable
   public hdp V() {
      return this.aU;
   }

   public boolean W() {
      hdp $$0 = this.V();
      return $$0 != null && !$$0.r();
   }

   public boolean b(UUID $$0) {
      return $$0.equals(this.X().b());
   }

   public fkr X() {
      return this.Y;
   }

   public GameProfile Y() {
      ProfileResult $$0 = this.N.join();
      return $$0 != null ? $$0.profile() : new GameProfile(this.Y.b(), this.Y.c());
   }

   public Proxy Z() {
      return this.ae;
   }

   public gzf aa() {
      return this.O;
   }

   public gjx ab() {
      return this.P;
   }

   public avd ac() {
      return this.aj;
   }

   public aun ad() {
      return this.am;
   }

   public ats ae() {
      return this.ak;
   }

   public hcd af() {
      return this.al;
   }

   public Path ag() {
      return this.M;
   }

   public han ah() {
      return this.an;
   }

   public Function<alj, gze> a(alj $$0) {
      return this.aD.a($$0)::a;
   }

   public boolean ai() {
      return this.aY;
   }

   public gix aj() {
      return this.aw;
   }

   public heg ak() {
      return this.as;
   }

   public awk al() {
      awk $$0 = x.a(this.z, frw::E);
      if ($$0 != null) {
         return $$0;
      } else if (this.t != null) {
         if (this.t.dV().ag() == dfm.k) {
            return this.m.j().b() ? awl.d : awl.e;
         } else {
            jq<dgo> $$1 = this.t.dV().t(this.t.dv());
            if (!this.at.c(awl.f) && (!this.t.bo() || !$$1.a(axb.Z))) {
               return this.t.dV().ag() != dfm.j && this.t.gh().d && this.t.gh().c ? awl.b : $$1.a().o().orElse(awl.g);
            } else {
               return awl.f;
            }
         }
      } else {
         return awl.a;
      }
   }

   public MinecraftSessionService am() {
      return this.az;
   }

   public hag an() {
      return this.aC;
   }

   @Nullable
   public bul ao() {
      return this.u;
   }

   public void a(bul $$0) {
      this.u = $$0;
      this.j.a($$0);
   }

   public boolean b(bul $$0) {
      return $$0.co() || this.t != null && this.t.Y_() && this.n.Q.e() && $$0.aq() == bus.bO;
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

   public gkj ap() {
      return this.aE;
   }

   public gpi aq() {
      return this.V;
   }

   public glq ar() {
      return this.aP;
   }

   public gqi as() {
      return this.W;
   }

   public gjf at() {
      return this.X;
   }

   public DataFixer au() {
      return this.Q;
   }

   public fju av() {
      return this.T;
   }

   public flg aw() {
      return this.ao;
   }

   public boolean az() {
      return this.t != null && this.t.gx() || this.n.X().c();
   }

   public foo aA() {
      return this.aL;
   }

   public hfi aB() {
      return this.aM;
   }

   public boolean aC() {
      return this.bk;
   }

   public fjz aD() {
      return this.aa;
   }

   public hbt aE() {
      return this.aD;
   }

   public hae aF() {
      return this.aG;
   }

   public had aG() {
      return this.aH;
   }

   public hac aH() {
      return this.aI;
   }

   public hab aI() {
      return this.aJ;
   }

   public flr aJ() {
      return this.aK;
   }

   @Override
   public void a(boolean $$0) {
      this.bk = $$0;
   }

   public xj a(File $$0, int $$1, int $$2) {
      int $$3 = this.S.k();
      int $$4 = this.S.l();
      fdb $$5 = new fdc($$1, $$2, true);
      float $$6 = this.t.dN();
      float $$7 = this.t.dL();
      float $$8 = this.t.O;
      float $$9 = this.t.N;
      this.j.b(false);

      xx var12;
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

            this.t.N = this.t.dL();
            this.t.O = this.t.dN();
            $$5.a(true);
            this.j.a(fju.b);

            try {
               Thread.sleep(10L);
            } catch (InterruptedException var17) {
            }

            fkn.a($$0, "panorama_" + $$10 + ".png", $$5, $$0x -> {
            });
         }

         xj $$11 = xj.b($$0.getName()).a(n.t).a($$1x -> $$1x.a(new xh(xh.a.b, $$0.getAbsolutePath())));
         return xj.a("screenshot.success", $$11);
      } catch (Exception var18) {
         G.error("Couldn't save image", var18);
         var12 = xj.a("screenshot.failure", var18.getMessage());
      } finally {
         this.t.w($$6);
         this.t.v($$7);
         this.t.O = $$8;
         this.t.N = $$9;
         this.j.b(true);
         this.S.a($$3);
         this.S.b($$4);
         $$5.a();
         this.j.c(false);
         this.h().a(true);
      }

      return var12;
   }

   private xj a(File $$0, int $$1, int $$2, int $$3, int $$4) {
      try {
         ByteBuffer $$5 = fdk.a($$1 * $$2 * 3);
         fkn $$6 = new fkn($$0, $$3, $$4, $$2);
         float $$7 = (float)$$3 / (float)$$1;
         float $$8 = (float)$$4 / (float)$$2;
         float $$9 = $$7 > $$8 ? $$7 : $$8;

         for (int $$10 = ($$4 - 1) / $$2 * $$2; $$10 >= 0; $$10 -= $$2) {
            for (int $$11 = 0; $$11 < $$3; $$11 += $$1) {
               RenderSystem.setShaderTexture(0, gzd.d);
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
         fdk.a($$5);
         xj $$15 = xj.b($$14.getName()).a(n.t).a($$1x -> $$1x.a(new xh(xh.a.b, $$14.getAbsolutePath())));
         return xj.a("screenshot.success", $$15);
      } catch (Exception var15) {
         G.warn("Couldn't save screenshot", var15);
         return xj.a("screenshot.failure", var15.getMessage());
      }
   }

   @Nullable
   public asd aK() {
      return this.Z.get();
   }

   public hah aL() {
      return this.av;
   }

   @Nullable
   public frq aM() {
      return this.bc;
   }

   public fwm aN() {
      return this.aN;
   }

   public fdu aO() {
      return this.S;
   }

   public fdi aP() {
      return this.bj;
   }

   public fml aQ() {
      return this.m.k();
   }

   public gjo aR() {
      return this.U;
   }

   public void a(int $$0) {
      this.aD.a($$0);
   }

   public gch aS() {
      return this.aO;
   }

   public hbl aT() {
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
   public azz aW() {
      return azz.a(this.ay.getServicesKeySet(), ServicesKeyType.PROFILE_KEY);
   }

   public boolean aX() {
      return !this.ay.getServicesKeySet().keys(ServicesKeyType.PROFILE_KEY).isEmpty();
   }

   public fkb aY() {
      return this.ab;
   }

   public void a(fkb $$0) {
      this.ab = $$0;
   }

   public fjv aZ() {
      return this.bv;
   }

   public gea ba() {
      return this.bw;
   }

   public gep bb() {
      return this.bx;
   }

   public fhf bc() {
      return this.aS;
   }

   public gik bd() {
      return this.aT;
   }

   public fjr be() {
      return this.by;
   }

   public ezo bf() {
      return this.bz;
   }

   private float a(float $$0) {
      if (this.s != null) {
         bst $$1 = this.s.t();
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
      a(xi.a) {
         @Override
         public boolean a(boolean $$0) {
            return true;
         }
      },
      b(xj.c("chat.disabled.options").a(n.m)) {
         @Override
         public boolean a(boolean $$0) {
            return false;
         }
      },
      c(xj.c("chat.disabled.launcher").a(n.m)) {
         @Override
         public boolean a(boolean $$0) {
            return $$0;
         }
      },
      d(xj.a("chat.disabled.profile", xj.d(fke.F.n.I.h())).a(n.m)) {
         @Override
         public boolean a(boolean $$0) {
            return $$0;
         }
      };

      static final xj e = xj.c("chat.disabled.profile.moreInfo");
      private final xj f;

      a(final xj $$0) {
         this.f = $$0;
      }

      public xj a() {
         return this.f;
      }

      public abstract boolean a(boolean var1);
   }

   static record b(ffh a, fxw.c b) {
   }
}
