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

public class fdz extends boo<Runnable> implements exx {
   static fdz E;
   private static final Logger F = LogUtils.getLogger();
   public static final boolean a = ac.k() == ac.a.d;
   private static final int G = 10;
   public static final akm b = new akm("default");
   public static final akm c = new akm("uniform");
   public static final akm d = new akm("alt");
   private static final akm H = new akm("regional_compliancies.json");
   private static final CompletableFuture<azf> I = CompletableFuture.completedFuture(azf.a);
   private static final wx J = wx.b("(+NBT)");
   private static final wx K = wx.c("multiplayer.socialInteractions.not_available");
   public static final String e = "Please make sure you have up-to-date drivers (see aka.ms/mcdriver for instructions).";
   private final long L = Double.doubleToLongBits(Math.PI);
   private final Path M;
   private final CompletableFuture<ProfileResult> N;
   private final gnw O;
   private final DataFixer P;
   private final gdc Q;
   private final exw R;
   private final fem S = new fem(20.0F, 0L, this::a);
   private final gcq T;
   public final gci f;
   private final ghr U;
   private final gir V;
   public final gaa g;
   private final grv W = new grv();
   private final feo X;
   public final ffk h;
   public final ffk i;
   public final gcd j;
   public final gfw k;
   private final AtomicReference<aqz> Y = new AtomicReference<>();
   public final ffl l;
   public final fed m;
   private final fdv Z;
   public final fea n;
   public final fdy o;
   private fdw aa = fdw.a;
   public final File p;
   private final String ab;
   private final String ac;
   private final Proxy ad;
   private final eov ae;
   private final boolean af;
   private final boolean ag;
   private final boolean ah;
   private final boolean ai;
   private final att aj;
   private final asm ak;
   private final gql al;
   private final ath am;
   private final gpd an;
   private final ffd ao;
   private final ffh ap;
   private final exe aq;
   private final gsn ar;
   private final gsi as;
   private final fio at;
   private final gox au;
   private final gce av;
   private final fef aw = new fef(H, fdz::b);
   private final YggdrasilAuthenticationService ax;
   private final MinecraftSessionService ay;
   private final UserApiService az;
   private final CompletableFuture<UserProperties> aA;
   private final gow aB;
   private final gqc aC;
   private final gde aD;
   private final gou aE;
   private final got aF;
   private final gos aG;
   private final ffn aH;
   private final fij aI;
   private final gtq aJ;
   private final fqg aK;
   private final fvs aL;
   private final gej aM;
   private final gsr aN;
   private final fxd aO;
   private final fay aP;
   private final gbu aQ;
   @Nullable
   public fxa q;
   @Nullable
   public fwr r;
   @Nullable
   public gbm s;
   @Nullable
   private gsa aR;
   @Nullable
   private vv aS;
   private boolean aT;
   @Nullable
   public bru t;
   @Nullable
   public bru u;
   @Nullable
   public eui v;
   private int aU;
   protected int w;
   private volatile boolean aV;
   private float aW;
   private long aX = ac.d();
   private long aY;
   private int aZ;
   public boolean x;
   @Nullable
   public fly y;
   @Nullable
   private fls ba;
   private boolean bb;
   private Thread bc;
   private volatile boolean bd;
   @Nullable
   private Supplier<o> be;
   private static int bf;
   public String z = "";
   private long bg;
   public boolean A;
   public boolean B;
   public boolean C;
   public boolean D = true;
   private boolean bh;
   private final Queue<Runnable> bi = Queues.newConcurrentLinkedQueue();
   @Nullable
   private CompletableFuture<Void> bj;
   @Nullable
   private fik bk;
   private bmi bl = bmf.a;
   private int bm;
   private final bmc bn = new bmc(ac.c, () -> this.bm);
   @Nullable
   private bmh bo;
   private bnw bp = bnv.a;
   private final fej bq = new fej();
   private long br;
   private double bs;
   @Nullable
   private eyl.a bt;
   private final feh bu;
   private final fdr bv;
   private final fxk bw;
   private fxz bx;
   private final fdo by;
   private final eua bz;
   private boolean bA;
   private final long bB;
   private long bC;
   private String bD = "root";

   public fdz(frm $$0) {
      super("Client");
      E = this;
      this.bB = System.currentTimeMillis();
      this.p = $$0.c.a;
      File $$1 = $$0.c.c;
      this.M = $$0.c.b.toPath();
      this.ab = $$0.d.b;
      this.ac = $$0.d.c;
      Path $$2 = this.p.toPath();
      this.bz = eov.a($$2.resolve("allowed_symlinks.txt"));
      gom $$3 = new gom($$0.c.a(), this.bz);
      this.al = new gql(this, $$2.resolve("downloads"), $$0.a);
      atj $$4 = new atc(this.M, ask.a, ati.b, this.bz);
      this.am = new ath($$3, this.al.a(), $$4);
      this.ak = $$3.a();
      this.ad = $$0.a.d;
      this.ax = new YggdrasilAuthenticationService(this.ad);
      this.ay = this.ax.createMinecraftSessionService();
      this.X = $$0.a.a;
      this.N = CompletableFuture.supplyAsync(() -> this.ay.fetchProfile(this.X.b(), true), ac.i());
      this.az = this.a(this.ax, $$0);
      this.aA = CompletableFuture.supplyAsync(() -> {
         try {
            return this.az.fetchProperties();
         } catch (AuthenticationException var2x) {
            F.error("Failed to fetch user properties", var2x);
            return UserApiService.OFFLINE_PROPERTIES;
         }
      }, ac.i());
      F.info("Setting user: {}", this.X.c());
      F.debug("(Session ID is {})", this.X.a());
      this.ag = $$0.d.a;
      this.ah = !$$0.d.d;
      this.ai = !$$0.d.e;
      this.af = bk();
      this.aR = null;
      yc.a(fdx::a);
      this.P = azk.a();
      this.aI = new fij(this);
      this.bc = Thread.currentThread();
      this.m = new fed(this, this.p);
      RenderSystem.setShaderGlintAlpha(this.m.an().c());
      this.bd = true;
      this.aJ = new gtq(this, this.m);
      this.Z = new fdv($$2, this.P);
      F.info("Backend library: {}", RenderSystem.getBackendDescription());
      exj $$5;
      if (this.m.p > 0 && this.m.o > 0) {
         $$5 = new exj(this.m.o, this.m.p, $$0.b.c, $$0.b.d, $$0.b.e);
      } else {
         $$5 = $$0.b;
      }

      ac.c = RenderSystem.initBackendSystem();
      this.Q = new gdc(this);
      this.R = this.Q.a($$5, this.m.k, this.bh());
      this.a(true);
      gtc.a.b(gsy.A);

      try {
         this.R.a(this.ak, aa.b().g() ? exm.a : exm.b);
      } catch (IOException var13) {
         F.error("Couldn't set icon", var13);
      }

      this.R.a(this.m.h().c());
      this.n = new fea(this);
      this.n.a(this.R.i());
      this.o = new fdy(this);
      this.o.a(this.R.i());
      RenderSystem.initRenderer(this.m.u, false);
      this.aq = new exb(this.R.k(), this.R.l());
      this.aq.a(0.0F, 0.0F, 0.0F, 0.0F);
      this.aq.b(a);
      this.aj = new att(ask.a);
      this.am.a();
      this.m.b(this.am);
      this.an = new gpd(this.m.ad);
      this.aj.a(this.an);
      this.O = new gnw(this.aj);
      this.aj.a(this.O);
      this.aB = new gow(this.O, $$1.toPath().resolve("skins"), this.ay, this);
      this.ae = new eov($$2.resolve("saves"), $$2.resolve("backups"), this.bz, this.P);
      this.by = new fdo($$2);
      this.ar = new gsn(this.m);
      this.aj.a(this.ar);
      this.au = new gox(this.X);
      this.aj.a(this.au);
      this.as = new gsi(this);
      this.at = new fio(this.O);
      this.h = this.at.a();
      this.i = this.at.b();
      this.aj.a(this.at);
      this.g();
      this.aj.a(new gop());
      this.aj.a(new goo());
      this.R.a("Startup");
      RenderSystem.setupDefaultState(0, 0, this.R.k(), this.R.l());
      this.R.a("Post startup");
      this.ao = ffd.a();
      this.ap = ffh.a(this.ao);
      this.aC = new gqc(this.O, this.ao, this.m.C().c());
      this.aj.a(this.aC);
      this.aL = new fvs();
      this.aj.a(this.aL);
      this.aM = new gej(this.h, this.aL, this::ap, this::as, this::aq);
      this.aj.a(this.aM);
      gbx $$8 = new gbx(this.aM, this.aL);
      this.aj.a($$8);
      this.V = new gir(this, this.O, this.aC, this.ap, $$8);
      this.aj.a(this.V);

      try {
         int $$9 = Runtime.getRuntime().availableProcessors();
         int $$10 = this.ah() ? $$9 : Math.min($$9, 4);
         eyu.a();
         this.T = new gcq($$10);
      } catch (OutOfMemoryError var12) {
         TinyFileDialogs.tinyfd_messageBox(
            "Minecraft",
            "Oh no! The game was unable to allocate memory off-heap while trying to start. You may try to free some memory by closing other applications on your computer, check that your system meets the minimum requirements, and try again. If the problem persists, please visit: https://aka.ms/Minecraft-Support",
            "ok",
            "error",
            true
         );
         throw new frn("Unable to allocate render buffers", var12);
      }

      this.aK = new fqg(this, this.az);
      this.aD = new gde(this.aC.b(), $$8, this.ao);
      this.aj.a(this.aD);
      this.U = new ghr(this, this.O, this.V, this.aD, this.h, this.m, this.aL);
      this.aj.a(this.U);
      this.g = new gaa(this.r, this.O);
      this.aj.a(this.g);
      this.aE = new gou(this.O);
      this.aj.a(this.aE);
      this.aF = new got(this.O);
      this.aj.a(this.aF);
      this.aG = new gos(this.O);
      this.aj.a(this.aG);
      this.aH = new ffn(this.O);
      this.aj.a(this.aH);
      this.j = new gcd(this, this.U.d(), this.aj, this.T);
      this.aj.a(this.j.e());
      this.f = new gci(this, this.U, this.aM, this.T);
      this.aj.a(this.f);
      this.bj();
      this.aj.a(this.W);
      this.av = new gce();
      this.aj.a(this.av);
      this.aj.a(this.aw);
      this.l = new ffl(this);
      this.k = new gfw(this);
      ezi $$12 = ezi.a(this);
      this.aP = new fay($$12);
      RenderSystem.setErrorCallback(this::a);
      if (this.aq.c != this.R.k() || this.aq.d != this.R.l()) {
         StringBuilder $$13 = new StringBuilder(
            "Recovering from unsupported resolution ("
               + this.R.k()
               + "x"
               + this.R.l()
               + ").\nPlease make sure you have up-to-date drivers (see aka.ms/mcdriver for instructions)."
         );
         if (exk.b()) {
            $$13.append("\n\nReported GL debug messages:\n").append(String.join("\n", exk.a()));
         }

         this.R.a(this.aq.c, this.aq.d);
         TinyFileDialogs.tinyfd_messageBox("Minecraft", $$13.toString(), "ok", "error", false);
      } else if (this.m.aa().c() && !this.R.j()) {
         this.R.h();
         this.m.aa().a(this.R.j());
      }

      this.R.a(this.m.N().c());
      this.R.b(this.m.G().c());
      this.R.c();
      this.a();
      this.j.a(this.ak.d());
      this.aN = new gsr(this, this.az, this.X);
      this.aO = fxd.a(this.az, this.X, $$2);
      this.bu = new feh(this);
      this.bv = new fdr(this);
      this.bv.a(this.m.as().c() != feb.a);
      this.bw = new fxk(this);
      this.bw.a(this.m.A().c());
      this.bx = fxz.a(fxw.a(), this.az);
      flk.a(this);
      this.a(new fle(wx.c("gui.loadingMinecraft")));
      List<asi> $$14 = this.am.g();
      this.bq.a(fej.b.a, $$14);
      ats $$15 = this.aj.a(ac.g(), this, I, $$14);
      gtc.a.a(gsy.C);
      fdz.b $$16 = new fdz.b($$12, $$0.e);
      this.a(new flk(this, $$15, $$1x -> ac.a($$1x, $$1xx -> this.a($$1xx, $$16), () -> {
            if (aa.aX) {
               this.bm();
            }

            this.bq.a();
            this.a($$16);
         }), false));
      this.aQ = gbu.a($$0.e.b());
   }

   private void a(@Nullable fdz.b $$0) {
      if (!this.bA) {
         this.bA = true;
         this.b($$0);
      }
   }

   private void b(@Nullable fdz.b $$0) {
      Runnable $$1 = this.c($$0);
      gtc.a.b(gsy.C);
      gtc.a.b(gsy.z);
      gtc.a.a(this.aN.a());
      $$1.run();
   }

   public boolean c() {
      return this.bA;
   }

   private Runnable c(@Nullable fdz.b $$0) {
      List<Function<Runnable, fly>> $$1 = new ArrayList<>();
      this.a($$1);
      Runnable $$2 = () -> {
         if ($$0 != null && $$0.b().a()) {
            gbt.a(this, $$0.b(), $$0.a());
         } else {
            this.a(new fmd(true));
         }
      };

      for (Function<Runnable, fly> $$3 : Lists.reverse($$1)) {
         fly $$4 = $$3.apply($$2);
         $$2 = () -> this.a($$4);
      }

      return $$2;
   }

   private void a(List<Function<Runnable, fly>> $$0) {
      if (this.m.ae) {
         $$0.add($$0x -> new fki(this.m, $$0x));
      }

      BanDetails $$1 = this.H();
      if ($$1 != null) {
         $$0.add($$1x -> fkm.a($$1xx -> {
               if ($$1xx) {
                  ac.k().a("https://aka.ms/mcjavamoderation");
               }

               $$1x.run();
            }, $$1));
      }

      ProfileResult $$2 = this.N.join();
      if ($$2 != null) {
         GameProfile $$3 = $$2.profile();
         Set<ProfileActionType> $$4 = $$2.actions();
         if ($$4.contains(ProfileActionType.FORCED_NAME_CHANGE)) {
            $$0.add($$1x -> fkm.a($$3.getName(), $$1x));
         }

         if ($$4.contains(ProfileActionType.USING_BANNED_SKIN)) {
            $$0.add(fkm::a);
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
      this.R.b(this.bh());
   }

   private String bh() {
      StringBuilder $$0 = new StringBuilder("Minecraft");
      if (e().a()) {
         $$0.append("*");
      }

      $$0.append(" ");
      $$0.append(aa.b().c());
      fws $$1 = this.L();
      if ($$1 != null && $$1.l().i()) {
         $$0.append(" - ");
         fxf $$2 = this.S();
         if (this.aR != null && !this.aR.r()) {
            $$0.append(gpb.a("title.singleplayer"));
         } else if ($$2 != null && $$2.e()) {
            $$0.append(gpb.a("title.multiplayer.realms"));
         } else if (this.aR == null && ($$2 == null || !$$2.d())) {
            $$0.append(gpb.a("title.multiplayer.other"));
         } else {
            $$0.append(gpb.a("title.multiplayer.lan"));
         }
      }

      return $$0.toString();
   }

   private UserApiService a(YggdrasilAuthenticationService $$0, frm $$1) {
      return $$1.a.a.g() != feo.a.c ? UserApiService.OFFLINE : $$0.createUserApiService($$1.a.a.d());
   }

   public static ayc e() {
      return ayc.a("vanilla", ClientBrandRetriever::getClientModName, "Client", fdz.class);
   }

   private void a(Throwable $$0, @Nullable fdz.b $$1) {
      if (this.am.d().size() > 1) {
         this.a($$0, null, $$1);
      } else {
         ac.a($$0);
      }
   }

   public void a(Throwable $$0, @Nullable wx $$1, @Nullable fdz.b $$2) {
      F.info("Caught error loading resourcepacks, removing all selected resourcepacks", $$0);
      this.bq.a($$0);
      this.al.b();
      this.am.a(Collections.emptyList());
      this.m.i.clear();
      this.m.j.clear();
      this.m.av();
      this.a(true, $$2).thenRun(() -> this.a($$1));
   }

   private void bi() {
      this.a(null);
      if (this.r != null) {
         this.r.X();
         this.y();
      }

      this.a(new fmd());
      this.a(null);
   }

   private void a(@Nullable wx $$0) {
      fij $$1 = this.aA();
      fih.b($$1, fih.a.c, wx.c("resourcePack.load_fail"), $$0);
   }

   public void f() {
      this.bc = Thread.currentThread();
      if (Runtime.getRuntime().availableProcessors() > 4) {
         this.bc.setPriority(10);
      }

      try {
         boolean $$0 = false;

         while (this.bd) {
            this.bl();

            try {
               bml $$1 = bml.a("Renderer");
               boolean $$2 = this.aQ().e();
               this.bl = this.a($$2, $$1);
               this.bl.a();
               this.bp.c();
               this.c(!$$0);
               this.bp.d();
               this.bl.b();
               this.b($$2, $$1);
            } catch (OutOfMemoryError var4) {
               if ($$0) {
                  throw var4;
               }

               this.bo();
               this.a(new flr());
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
      this.at.a(this.m);
   }

   private void bj() {
      this.W
         .a(
            grv.a,
            $$0 -> new gro<>(
                  $$0x -> $$0x.a(null, cvh.a.a.c()).stream().map($$0xx -> n.a($$0xx.getString()).trim()).filter($$0xx -> !$$0xx.isEmpty()),
                  $$0x -> Stream.of(le.h.b($$0x.g())),
                  $$0
               )
         );
      this.W.a(grv.b, $$0 -> new grp<>($$0x -> $$0x.i().map(awl::b), $$0));
      this.W
         .a(
            grv.c,
            $$0 -> new gro<>(
                  $$0x -> $$0x.e()
                        .stream()
                        .flatMap($$1 -> $$1.b().a($$0x.a()).a(null, cvh.a.a).stream())
                        .map($$0xx -> n.a($$0xx.getString()).trim())
                        .filter($$0xx -> !$$0xx.isEmpty()),
                  $$0x -> $$0x.e().stream().map($$1 -> le.h.b($$1.b().a($$0x.a()).g())),
                  $$0
               )
         );
      csa.e().a($$0 -> {
         this.a(grv.a, $$0);
         this.a(grv.b, $$0);
      });
   }

   private void a(int $$0, long $$1) {
      this.m.N().a(false);
      this.m.av();
   }

   private static boolean bk() {
      String[] $$0 = new String[]{"sun.arch.data.model", "com.ibm.vm.bitmode", "os.arch"};

      for (String $$1 : $$0) {
         String $$2 = System.getProperty($$1);
         if ($$2 != null && $$2.contains("64")) {
            return true;
         }
      }

      return false;
   }

   public exe h() {
      return this.aq;
   }

   public String i() {
      return this.ab;
   }

   public String j() {
      return this.ac;
   }

   public void a(o $$0) {
      this.be = () -> this.d($$0);
   }

   public void b(o $$0) {
      this.be = () -> $$0;
   }

   private void bl() {
      if (this.be != null) {
         a(this, this.p, this.be.get());
      }
   }

   public void c(o $$0) {
      o $$1 = this.d($$0);
      this.bo();
      a(this, this.p, $$1);
   }

   public static void a(@Nullable fdz $$0, File $$1, o $$2) {
      File $$3 = new File($$1, "crash-reports");
      File $$4 = new File($$3, "crash-" + ac.f() + "-client.txt");
      ako.a($$2.e());
      if ($$0 != null) {
         $$0.ar.h();
      }

      if ($$2.f() != null) {
         ako.a("#@!@# Game crashed! Crash report saved to: #@!@# " + $$2.f());
         System.exit(-1);
      } else if ($$2.a($$4)) {
         ako.a("#@!@# Game crashed! Crash report saved to: #@!@# " + $$4.getAbsolutePath());
         System.exit(-1);
      } else {
         ako.a("#@?@# Game crashed! Crash report could not be saved. #@?@#");
         System.exit(-2);
      }
   }

   public boolean k() {
      return this.m.P().c();
   }

   public CompletableFuture<Void> l() {
      return this.a(false, null);
   }

   private CompletableFuture<Void> a(boolean $$0, @Nullable fdz.b $$1) {
      if (this.bj != null) {
         return this.bj;
      } else {
         CompletableFuture<Void> $$2 = new CompletableFuture<>();
         if (!$$0 && this.ba instanceof flk) {
            this.bj = $$2;
            return $$2;
         } else {
            this.am.a();
            List<asi> $$3 = this.am.g();
            if (!$$0) {
               this.bq.a(fej.b.b, $$3);
            }

            this.a(new flk(this, this.aj.a(ac.g(), this, I, $$3), $$3x -> ac.a($$3x, $$2xx -> {
                  if ($$0) {
                     this.al.c();
                     this.bi();
                  } else {
                     this.a($$2xx, $$1);
                  }
               }, () -> {
                  this.f.f();
                  this.bq.a();
                  this.al.d();
                  $$2.complete(null);
                  this.a($$1);
               }), !$$0));
            return $$2;
         }
      }
   }

   private void bm() {
      boolean $$0 = false;
      gdd $$1 = this.ap().a();
      gpw $$2 = $$1.a().a();

      for (ddy $$3 : le.e) {
         UnmodifiableIterator $$10 = $$3.m().a().iterator();

         while ($$10.hasNext()) {
            drb $$4 = (drb)$$10.next();
            if ($$4.l() == dke.c) {
               gpw $$5 = $$1.b($$4);
               if ($$5 == $$2) {
                  F.debug("Missing model for: {}", $$4);
                  $$0 = true;
               }
            }
         }
      }

      gnv $$6 = $$2.e();

      for (ddy $$7 : le.e) {
         UnmodifiableIterator var17 = $$7.m().a().iterator();

         while (var17.hasNext()) {
            drb $$8 = (drb)var17.next();
            gnv $$9 = $$1.a($$8);
            if (!$$8.i() && $$9 == $$6) {
               F.debug("Missing particle icon for: {}", $$8);
            }
         }
      }

      for (ctj $$10 : le.h) {
         cto $$11 = $$10.v();
         String $$12 = $$11.t();
         String $$13 = wx.c($$12).getString();
         if ($$13.toLowerCase(Locale.ROOT).equals($$10.a())) {
            F.debug("Missing translation for: {} {} {}", new Object[]{$$11, $$12, $$10});
         }
      }

      $$0 |= fll.a();
      $$0 |= ghu.a();
      if ($$0) {
         throw new IllegalStateException("Your game data is foobar, fix the errors above!");
      }
   }

   public eov m() {
      return this.ae;
   }

   private void a(String $$0) {
      fdz.a $$1 = this.J();
      if (!$$1.a(this.T())) {
         if (this.l.b()) {
            this.l.b(false);
            this.a(new fkp($$0x -> {
               if ($$0x) {
                  ac.k().a("https://aka.ms/JavaAccountSettings");
               }

               this.a(null);
            }, fdz.a.e, "https://aka.ms/JavaAccountSettings", true));
         } else {
            wx $$2 = $$1.a();
            this.l.a($$2, false);
            this.bv.c($$2);
            this.l.b($$1 == fdz.a.d);
         }
      } else {
         this.a(new fko($$0));
      }
   }

   public void a(@Nullable fly $$0) {
      if (aa.aX && Thread.currentThread() != this.bc) {
         F.error("setScreen called from non-game thread");
      }

      if (this.y != null) {
         this.y.j();
      } else {
         this.a(fdw.a);
      }

      if ($$0 == null && this.bb) {
         throw new IllegalStateException("Trying to return to in-game GUI during disconnection");
      } else {
         if ($$0 == null && this.r == null) {
            $$0 = new fmd();
         } else if ($$0 == null && this.s.eB()) {
            if (this.s.o()) {
               $$0 = new fkw(null, this.r.k().l());
            } else {
               this.s.ga();
            }
         }

         this.y = $$0;
         if (this.y != null) {
            this.y.aF_();
         }

         eyo.a();
         if ($$0 != null) {
            this.n.j();
            fdx.b();
            $$0.b(this, this.R.o(), this.R.p());
            this.x = false;
         } else {
            this.ar.i();
            this.n.i();
         }

         this.d();
      }
   }

   public void a(@Nullable fls $$0) {
      this.ba = $$0;
   }

   public void n() {
      try {
         F.info("Stopping!");

         try {
            this.bv.c();
         } catch (Throwable var7) {
         }

         try {
            if (this.r != null) {
               this.r.X();
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
         this.aN.close();
         this.aw.close();
         this.aC.close();
         this.at.close();
         this.j.close();
         this.f.close();
         this.ar.g();
         this.g.a();
         this.aF.close();
         this.aE.close();
         this.aG.close();
         this.aH.close();
         this.O.close();
         this.aj.close();
         fja.b();
         ac.j();
      } catch (Throwable var5) {
         F.error("Shutdown failure!", var5);
         throw var5;
      } finally {
         this.Q.close();
         this.R.close();
      }
   }

   private void c(boolean $$0) {
      this.R.a("Pre render");
      long $$1 = ac.d();
      if (this.R.b()) {
         this.q();
      }

      if (this.bj != null && !(this.ba instanceof flk)) {
         CompletableFuture<Void> $$2 = this.bj;
         this.bj = null;
         this.l().thenRun(() -> $$2.complete(null));
      }

      Runnable $$3;
      while (($$3 = this.bi.poll()) != null) {
         $$3.run();
      }

      if ($$0) {
         int $$4 = this.S.a(ac.c());
         this.bl.a("scheduledExecutables");
         this.bz();
         this.bl.c();
         this.bl.a("tick");

         for (int $$5 = 0; $$5 < Math.min(10, $$4); $$5++) {
            this.bl.d("clientTick");
            this.t();
         }

         this.bl.c();
      }

      this.R.a("Render");
      this.bl.a("sound");
      this.ar.a(this.j.m());
      this.bl.c();
      this.bl.a("render");
      long $$6 = ac.d();
      boolean $$8;
      if (!this.aQ().d() && !this.bp.e()) {
         $$8 = false;
         this.bs = 0.0;
      } else {
         $$8 = this.bt == null || this.bt.b();
         if ($$8) {
            eyl.a().ifPresent(eyl::b);
         }
      }

      RenderSystem.clear(16640, a);
      this.aq.a(true);
      gcc.a();
      this.bl.a("display");
      RenderSystem.enableCull();
      this.bl.b("mouse");
      this.n.a();
      this.bl.c();
      if (!this.x) {
         this.bl.b("gameRenderer");
         this.j.a(this.aV ? this.aW : this.S.a, $$1, $$0);
         this.bl.c();
      }

      if (this.bo != null) {
         this.bl.a("fpsPie");
         ffm $$9 = new ffm(this, this.T.c());
         this.a($$9, this.bo);
         $$9.e();
         this.bl.c();
      }

      this.bl.a("blit");
      this.aq.e();
      this.aq.a(this.R.k(), this.R.l());
      this.bg = ac.d() - $$6;
      if ($$8) {
         eyl.a().ifPresent($$0x -> this.bt = $$0x.c());
      }

      this.bl.b("updateDisplay");
      this.R.e();
      int $$10 = this.bn();
      if ($$10 < 260) {
         RenderSystem.limitDisplayFPS($$10);
      }

      this.bl.b("yield");
      Thread.yield();
      this.bl.c();
      this.R.a("Post render");
      this.aZ++;
      boolean $$11 = this.U() && (this.y != null && this.y.k() || this.ba != null && this.ba.a()) && !this.aR.r();
      if (this.aV != $$11) {
         if ($$11) {
            this.aW = this.S.a;
         } else {
            this.S.a = this.aW;
         }

         this.aV = $$11;
      }

      long $$12 = ac.d();
      long $$13 = $$12 - this.aX;
      if ($$8) {
         this.br = $$13;
      }

      this.aQ().a($$13);
      this.aX = $$12;
      this.bl.a("fpsUpdate");
      if (this.bt != null && this.bt.b()) {
         this.bs = (double)this.bt.c() * 100.0 / (double)this.br;
      }

      while (ac.c() >= this.aY + 1000L) {
         String $$14;
         if (this.bs > 0.0) {
            $$14 = " GPU: " + (this.bs > 100.0 ? n.m + "100%" : Math.round(this.bs) + "%");
         } else {
            $$14 = "";
         }

         bf = this.aZ;
         this.z = String.format(
            Locale.ROOT,
            "%d fps T: %s%s%s%s B: %d%s",
            bf,
            $$10 == 260 ? "inf" : $$10,
            this.m.N().c() ? " vsync " : " ",
            this.m.j().c(),
            this.m.i().c() == fdn.a ? "" : (this.m.i().c() == fdn.b ? " fast-clouds" : " fancy-clouds"),
            this.m.E().c(),
            $$14
         );
         this.aY += 1000L;
         this.aZ = 0;
      }

      this.bl.c();
   }

   private bmi a(boolean $$0, @Nullable bml $$1) {
      if (!$$0) {
         this.bn.b();
         if (!this.bp.e() && $$1 == null) {
            return bmf.a;
         }
      }

      bmi $$2;
      if ($$0) {
         if (!this.bn.a()) {
            this.bm = 0;
            this.bn.c();
         }

         this.bm++;
         $$2 = this.bn.d();
      } else {
         $$2 = bmf.a;
      }

      if (this.bp.e()) {
         $$2 = bmi.a($$2, this.bp.f());
      }

      return bml.a($$2, $$1);
   }

   private void b(boolean $$0, @Nullable bml $$1) {
      if ($$1 != null) {
         $$1.b();
      }

      if ($$0) {
         this.bo = this.bn.e();
      } else {
         this.bo = null;
      }

      this.bl = this.bn.d();
   }

   @Override
   public void a() {
      int $$0 = this.R.a(this.m.aq().c(), this.k());
      this.R.a((double)$$0);
      if (this.y != null) {
         this.y.a(this, this.R.o(), this.R.p());
      }

      exe $$1 = this.h();
      $$1.a(this.R.k(), this.R.l(), a);
      this.j.a(this.R.k(), this.R.l());
      this.n.g();
   }

   @Override
   public void b() {
      this.n.k();
   }

   public int o() {
      return bf;
   }

   public long p() {
      return this.bg;
   }

   private int bn() {
      return this.r != null || this.y == null && this.ba == null ? this.R.d() : 60;
   }

   private void bo() {
      try {
         ayb.b();
         this.f.p();
      } catch (Throwable var3) {
      }

      try {
         System.gc();
         if (this.aT && this.aR != null) {
            this.aR.a(true);
         }

         this.b((fly)(new fle(wx.c("menu.savingLevel"))));
      } catch (Throwable var2) {
      }

      System.gc();
   }

   public boolean a(Consumer<wx> $$0) {
      if (this.bp.e()) {
         this.bp();
         return false;
      } else {
         Consumer<bmh> $$1 = $$1x -> {
            if ($$1x != bmd.a) {
               int $$2x = $$1x.f();
               double $$3x = (double)$$1x.g() / (double)azc.a;
               this.execute(
                  () -> $$0.accept(
                        wx.a("commands.debug.stopped", String.format(Locale.ROOT, "%.2f", $$3x), $$2x, String.format(Locale.ROOT, "%.2f", (double)$$2x / $$3x))
                     )
               );
            }
         };
         Consumer<Path> $$2 = $$1x -> {
            wx $$2x = wx.b($$1x.toString()).a(n.t).a($$1xx -> $$1xx.a(new wv(wv.a.b, $$1x.toFile().getParent())));
            this.execute(() -> $$0.accept(wx.a("debug.profiling.stop", $$2x)));
         };
         ab $$3 = a(new ab(), this, this.an, this.ab, this.m);
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
            CompletableFuture.allOf($$6, $$7).thenRunAsync(() -> $$4.accept(ImmutableList.of($$6.join(), $$7.join())), ac.h());
            this.aR.a($$0x -> {
            }, $$7::complete);
            $$5 = $$6::complete;
         }

         this.bp = bnu.a(new gbr(ac.c, this.f), ac.c, ac.h(), new boa("client"), $$1x -> {
            this.bp = bnv.a;
            $$1.accept($$1x);
         }, $$5);
         return true;
      }
   }

   private void bp() {
      this.bp.a();
      if (this.aR != null) {
         this.aR.aX();
      }
   }

   private void bq() {
      this.bp.b();
      if (this.aR != null) {
         this.aR.aY();
      }
   }

   private Path a(ab $$0, List<Path> $$1) {
      String $$2;
      if (this.T()) {
         $$2 = this.V().bb().e();
      } else {
         fxf $$3 = this.S();
         $$2 = $$3 != null ? $$3.a : "unknown";
      }

      Path $$7;
      try {
         String $$5 = String.format(Locale.ROOT, "%s-%s-%s", ac.f(), $$2, aa.b().b());
         String $$6 = v.a(boa.a, $$5, ".zip");
         $$7 = boa.a.resolve($$6);
      } catch (IOException var21) {
         throw new UncheckedIOException(var21);
      }

      try (axp $$10 = new axp($$7)) {
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
      if (this.bo != null) {
         List<bmk> $$1 = this.bo.a(this.bD);
         if (!$$1.isEmpty()) {
            bmk $$2 = $$1.remove(0);
            if ($$0 == 0) {
               if (!$$2.d.isEmpty()) {
                  int $$3 = this.bD.lastIndexOf(30);
                  if ($$3 >= 0) {
                     this.bD = this.bD.substring(0, $$3);
                  }
               }
            } else {
               $$0--;
               if ($$0 < $$1.size() && !"unspecified".equals($$1.get($$0).d)) {
                  if (!this.bD.isEmpty()) {
                     this.bD = this.bD + "\u001e";
                  }

                  this.bD = this.bD + $$1.get($$0).d;
               }
            }
         }
      }
   }

   private void a(ffm $$0, bmh $$1) {
      List<bmk> $$2 = $$1.a(this.bD);
      bmk $$3 = $$2.remove(0);
      RenderSystem.clear(256, a);
      RenderSystem.setShader(gcd::q);
      Matrix4f $$4 = new Matrix4f().setOrtho(0.0F, (float)this.R.k(), (float)this.R.l(), 0.0F, 1000.0F, 3000.0F);
      RenderSystem.setProjectionMatrix($$4, eza.b);
      Matrix4fStack $$5 = RenderSystem.getModelViewStack();
      $$5.pushMatrix();
      $$5.translation(0.0F, 0.0F, -2000.0F);
      RenderSystem.applyModelViewMatrix();
      RenderSystem.lineWidth(1.0F);
      eyu $$6 = eyu.b();
      eyn $$7 = $$6.d();
      int $$8 = 160;
      int $$9 = this.R.k() - 160 - 10;
      int $$10 = this.R.l() - 320;
      RenderSystem.enableBlend();
      $$7.a(eyx.b.h, eyq.n);
      $$7.a((double)((float)$$9 - 176.0F), (double)((float)$$10 - 96.0F - 16.0F), 0.0).a(200, 0, 0, 0).e();
      $$7.a((double)((float)$$9 - 176.0F), (double)($$10 + 320), 0.0).a(200, 0, 0, 0).e();
      $$7.a((double)((float)$$9 + 176.0F), (double)($$10 + 320), 0.0).a(200, 0, 0, 0).e();
      $$7.a((double)((float)$$9 + 176.0F), (double)((float)$$10 - 96.0F - 16.0F), 0.0).a(200, 0, 0, 0).e();
      $$6.c();
      RenderSystem.disableBlend();
      double $$11 = 0.0;

      for (bmk $$12 : $$2) {
         int $$13 = ayd.a($$12.a / 4.0) + 1;
         $$7.a(eyx.b.g, eyq.n);
         int $$14 = $$12.a();
         int $$15 = $$14 >> 16 & 0xFF;
         int $$16 = $$14 >> 8 & 0xFF;
         int $$17 = $$14 & 0xFF;
         $$7.a((double)$$9, (double)$$10, 0.0).a($$15, $$16, $$17, 255).e();

         for (int $$18 = $$13; $$18 >= 0; $$18--) {
            float $$19 = (float)(($$11 + $$12.a * (double)$$18 / (double)$$13) * (float) (Math.PI * 2) / 100.0);
            float $$20 = ayd.a($$19) * 160.0F;
            float $$21 = ayd.b($$19) * 160.0F * 0.5F;
            $$7.a((double)((float)$$9 + $$20), (double)((float)$$10 - $$21), 0.0).a($$15, $$16, $$17, 255).e();
         }

         $$6.c();
         $$7.a(eyx.b.f, eyq.n);

         for (int $$22 = $$13; $$22 >= 0; $$22--) {
            float $$23 = (float)(($$11 + $$12.a * (double)$$22 / (double)$$13) * (float) (Math.PI * 2) / 100.0);
            float $$24 = ayd.a($$23) * 160.0F;
            float $$25 = ayd.b($$23) * 160.0F * 0.5F;
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
      String $$27 = bmh.b($$3.d);
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
         bmk $$31 = $$2.get($$30);
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
      this.bd = false;
   }

   public boolean r() {
      return this.bd;
   }

   public void b(boolean $$0) {
      if (this.y == null) {
         boolean $$1 = this.U() && !this.aR.r();
         if ($$1) {
            this.a(new flt(!$$0));
            this.ar.e();
         } else {
            this.a(new flt(true));
         }
      }
   }

   private void d(boolean $$0) {
      if (!$$0) {
         this.w = 0;
      }

      if (this.w <= 0 && !this.s.fv()) {
         if ($$0 && this.v != null && this.v.c() == eui.a.b) {
            eug $$1 = (eug)this.v;
            io $$2 = $$1.a();
            if (!this.r.a_($$2).i()) {
               it $$3 = $$1.b();
               if (this.q.b($$2, $$3)) {
                  this.g.a($$2, $$3);
                  this.s.a(bpt.a);
               }
            }
         } else {
            this.q.b();
         }
      }
   }

   private boolean br() {
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
         cto $$0 = this.s.b(bpt.a);
         if (!$$0.a(this.r.J())) {
            return false;
         } else {
            boolean $$1 = false;
            switch (this.v.c()) {
               case c:
                  this.q.a(this.s, ((euh)this.v).a());
                  break;
               case b:
                  eug $$2 = (eug)this.v;
                  io $$3 = $$2.a();
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

            this.s.a(bpt.a);
            return $$1;
         }
      }
   }

   private void bs() {
      if (!this.q.k()) {
         this.aU = 4;
         if (!this.s.B()) {
            if (this.v == null) {
               F.warn("Null returned as 'hitResult', this shouldn't happen!");
            }

            for (bpt $$0 : bpt.values()) {
               cto $$1 = this.s.b($$0);
               if (!$$1.a(this.r.J())) {
                  return;
               }

               if (this.v != null) {
                  switch (this.v.c()) {
                     case c:
                        euh $$2 = (euh)this.v;
                        bru $$3 = $$2.a();
                        if (!this.r.C_().a($$3.dp())) {
                           return;
                        }

                        bpu $$4 = this.q.a(this.s, $$3, $$2, $$0);
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
                        eug $$5 = (eug)this.v;
                        int $$6 = $$1.I();
                        bpu $$7 = this.q.a(this.s, $$0, $$5);
                        if ($$7.a()) {
                           if ($$7.b()) {
                              this.s.a($$0);
                              if (!$$1.e() && ($$1.I() != $$6 || this.q.f())) {
                                 this.j.b.a($$0);
                              }
                           }

                           return;
                        }

                        if ($$7 == bpu.e) {
                           return;
                        }
                  }
               }

               if (!$$1.e()) {
                  bpu $$8 = this.q.a(this.s, $$0);
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

   public gsi s() {
      return this.as;
   }

   public void t() {
      this.bC++;
      if (this.r != null && !this.aV) {
         this.r.s().m();
      }

      if (this.aU > 0) {
         this.aU--;
      }

      this.bl.a("gui");
      this.bw.a();
      this.l.a(this.aV);
      this.bl.c();
      this.j.b(1.0F);
      this.aJ.a(this.r, this.v);
      this.bl.a("gameMode");
      if (!this.aV && this.r != null) {
         this.q.c();
      }

      this.bl.b("textures");
      boolean $$0 = this.r == null || this.r.s().i();
      if ($$0) {
         this.O.e();
      }

      if (this.y != null || this.s == null) {
         if (this.y instanceof flg $$1 && !this.s.fL()) {
            $$1.m();
         }
      } else if (this.s.eB() && !(this.y instanceof fkw)) {
         this.a(null);
      } else if (this.s.fL() && this.r != null) {
         this.a(new flg());
      }

      if (this.y != null) {
         this.w = 10000;
      }

      if (this.y != null) {
         fly.a(() -> this.y.e(), "Ticking screen", this.y.getClass().getCanonicalName());
      }

      if (!this.aQ().d()) {
         this.l.l();
      }

      if (this.ba == null && this.y == null) {
         this.bl.b("Keybindings");
         this.bB();
         if (this.w > 0) {
            this.w--;
         }
      }

      if (this.r != null) {
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
            this.r.f();
         }
      } else if (this.j.g() != null) {
         this.j.b();
      }

      if (!this.aV) {
         this.as.a();
      }

      this.ar.a(this.aV);
      if (this.r != null) {
         if (!this.aV) {
            if (!this.m.s && this.bt()) {
               wx $$2 = wx.c("tutorial.socialInteractions.title");
               wx $$3 = wx.a("tutorial.socialInteractions.description", gtq.a("socialInteractions"));
               this.bk = new fik(fik.a.f, $$2, $$3, true);
               this.aJ.a(this.bk, 160);
               this.m.s = true;
               this.m.av();
            }

            this.aJ.d();

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

         this.bl.b("animateTick");
         if (!this.aV && $$0) {
            this.r.b(this.s.dt(), this.s.dv(), this.s.dz());
         }

         this.bl.b("particles");
         if (!this.aV && $$0) {
            this.g.b();
         }
      } else if (this.aS != null) {
         this.bl.b("pendingConnection");
         this.aS.b();
      }

      this.bl.b("keyboard");
      this.o.b();
      this.bl.c();
   }

   private boolean bt() {
      return !this.aT || this.aR != null && this.aR.r();
   }

   private void bB() {
      while (this.m.P.g()) {
         fdl $$0 = this.m.aA();
         this.m.a(this.m.aA().c());
         if ($$0.a() != this.m.aA().a()) {
            this.j.a(this.m.aA().a() ? this.ao() : null);
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
               this.s.gc().k = $$1;
            } else {
               fnl.a(this, $$1, $$3, $$2);
            }
         }
      }

      while (this.m.N.g()) {
         if (!this.bt()) {
            this.s.a(K, true);
            this.bv.c(K);
         } else {
            if (this.bk != null) {
               this.aJ.a(this.bk);
               this.bk = null;
            }

            this.a(new fqi());
         }
      }

      while (this.m.E.g()) {
         if (this.q.g()) {
            this.s.i();
         } else {
            this.aJ.a();
            this.a(new fnw(this.s));
         }
      }

      while (this.m.T.g()) {
         this.a(new fmn(this.s.h.q()));
      }

      while (this.m.F.g()) {
         if (!this.s.N_()) {
            this.L().b(new ahh(ahh.a.g, io.c, it.a));
         }
      }

      while (this.m.G.g()) {
         if (!this.s.N_() && this.s.a(fly.r())) {
            this.s.a(bpt.a);
         }
      }

      while (this.m.K.g()) {
         this.a("");
      }

      if (this.y == null && this.ba == null && this.m.M.g()) {
         this.a("/");
      }

      boolean $$4 = false;
      if (this.s.fv()) {
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
            $$4 |= this.br();
         }

         while (this.m.H.g()) {
            this.bs();
         }

         while (this.m.J.g()) {
            this.bD();
         }
      }

      if (this.m.H.e() && this.aU == 0 && !this.s.fv()) {
         this.bs();
      }

      this.d(this.y == null && !$$4 && this.m.I.e() && this.n.h());
   }

   public gsr u() {
      return this.aN;
   }

   public double v() {
      return this.bs;
   }

   public fxd w() {
      return this.aO;
   }

   public fqy x() {
      return new fqy(this, this.ae);
   }

   public void a(eov.c $$0, ath $$1, alj $$2, boolean $$3) {
      this.y();
      this.Y.set(null);
      Instant $$4 = Instant.now();

      try {
         $$0.a($$2.c().a(), $$2.d());
         alg $$5 = alg.a(this.ax, this.p);
         $$5.f().a(this);
         dps.a($$5, this);
         auf.a(false);
         this.aR = MinecraftServer.a((Function<Thread, gsa>)($$4x -> new gsa($$4x, this, $$0, $$1, $$2, $$5, $$0xx -> {
               aqz $$1xx = aqz.b($$0xx + 0);
               this.Y.set($$1xx);
               return aqy.a($$1xx, this.bi::add);
            })));
         this.aT = true;
         this.a(fxw.a());
         this.aQ.a(gbu.c.a, $$0.f(), $$2.d().e());
      } catch (Throwable var11) {
         o $$7 = o.a(var11, "Starting integrated server");
         p $$8 = $$7.a("Starting integrated server");
         $$8.a("Level ID", $$0.f());
         $$8.a("Level Name", () -> $$2.d().e());
         throw new y($$7);
      }

      while (this.Y.get() == null) {
         Thread.yield();
      }

      fli $$9 = new fli(this.Y.get());
      this.a($$9);
      this.bl.a("waitForServer");

      for (; !this.aR.aj() || this.ba != null; this.bl()) {
         $$9.e();
         this.c(false);

         try {
            Thread.sleep(16L);
         } catch (InterruptedException var10) {
         }
      }

      this.bl.c();
      Duration $$10 = Duration.between($$4, Instant.now());
      SocketAddress $$11 = this.aR.ai().a();
      vv $$12 = vv.a($$11);
      $$12.a($$11.toString(), 0, new fwq($$12, this, null, null, $$3, $$10, $$0x -> {
      }, null));
      $$12.a(new ait(this.X().c(), this.X().b()));
      this.aS = $$12;
   }

   public void a(fwr $$0) {
      flv $$1 = new flv(true);
      $$1.a(wx.c("connect.joining"));
      this.e($$1);
      this.r = $$0;
      this.b($$0);
      if (!this.aT) {
         alg $$2 = alg.a(this.ax, this.p);
         $$2.f().a(this);
         dps.a($$2, this);
         auf.a(false);
      }
   }

   public void y() {
      this.a(new flv(true), false);
   }

   public void b(fly $$0) {
      this.a($$0, false);
   }

   public void a(fly $$0, boolean $$1) {
      fws $$2 = this.L();
      if ($$2 != null) {
         this.by();
         $$2.i();
         if (!$$1) {
            this.B();
         }
      }

      this.aK.b();
      if (this.bp.e()) {
         this.bq();
      }

      gsa $$3 = this.aR;
      this.aR = null;
      this.j.i();
      this.q = null;
      this.bv.b();
      this.bb = true;

      try {
         this.e($$0);
         if (this.r != null) {
            if ($$3 != null) {
               this.bl.a("waitForServer");

               while (!$$3.H()) {
                  this.c(false);
               }

               this.bl.c();
            }

            this.l.i();
            this.aT = false;
         }

         this.r = null;
         this.b(null);
         this.s = null;
      } finally {
         this.bb = false;
      }

      dps.b();
   }

   public void B() {
      this.al.i();
      this.bz();
   }

   public void c(fly $$0) {
      fws $$1 = this.L();
      if ($$1 != null) {
         $$1.j();
      }

      if (this.bp.e()) {
         this.bq();
      }

      this.j.i();
      this.q = null;
      this.bv.b();
      this.bb = true;

      try {
         this.e($$0);
         this.l.i();
         this.r = null;
         this.b(null);
         this.s = null;
      } finally {
         this.bb = false;
      }

      dps.b();
   }

   private void e(fly $$0) {
      this.bl.a("forcedTick");
      this.ar.f();
      this.t = null;
      this.aS = null;
      this.a($$0);
      this.c(false);
      this.bl.c();
   }

   public void d(fly $$0) {
      this.bl.a("forcedTick");
      this.a($$0);
      this.c(false);
      this.bl.c();
   }

   private void b(@Nullable fwr $$0) {
      this.f.a($$0);
      this.g.a($$0);
      this.aM.a($$0);
      this.d();
   }

   private UserProperties bC() {
      return this.aA.join();
   }

   public boolean C() {
      return this.D() && this.m.ai().c();
   }

   public boolean D() {
      return this.E() && this.bC().flag(UserFlag.OPTIONAL_TELEMETRY_AVAILABLE);
   }

   public boolean E() {
      return aa.aX ? false : this.bC().flag(UserFlag.TELEMETRY_ENABLED);
   }

   public boolean F() {
      return this.ah && this.bC().flag(UserFlag.SERVERS_ALLOWED) && this.H() == null && !this.I();
   }

   public boolean G() {
      return this.bC().flag(UserFlag.REALMS_ALLOWED) && this.H() == null;
   }

   @Nullable
   public BanDetails H() {
      return (BanDetails)this.bC().bannedScopes().get("MULTIPLAYER");
   }

   public boolean I() {
      ProfileResult $$0 = this.N.getNow(null);
      return $$0 != null && $$0.actions().contains(ProfileActionType.FORCED_NAME_CHANGE);
   }

   public boolean a(UUID $$0) {
      return this.J().a(false) ? this.aK.c($$0) : (this.s == null || !$$0.equals(this.s.cz())) && !$$0.equals(ac.e);
   }

   public fdz.a J() {
      if (this.m.m().c() == clu.c) {
         return fdz.a.b;
      } else if (!this.ai) {
         return fdz.a.c;
      } else {
         return !this.bC().flag(UserFlag.CHAT_ALLOWED) ? fdz.a.d : fdz.a.a;
      }
   }

   public final boolean K() {
      return this.ag;
   }

   @Nullable
   public fws L() {
      return this.s == null ? null : this.s.h;
   }

   public static boolean M() {
      return !E.m.Z;
   }

   public static boolean N() {
      return E.m.j().c().a() >= fds.b.a();
   }

   public static boolean O() {
      return !E.j.a() && E.m.j().c().a() >= fds.c.a();
   }

   public static boolean P() {
      return E.m.k().c();
   }

   private void bD() {
      if (this.v != null && this.v.c() != eui.a.a) {
         boolean $$0 = this.s.gd().d;
         dog $$1 = null;
         eui.a $$2 = this.v.c();
         cto $$6;
         if ($$2 == eui.a.b) {
            io $$3 = ((eug)this.v).a();
            drb $$4 = this.r.a_($$3);
            if ($$4.i()) {
               return;
            }

            ddy $$5 = $$4.b();
            $$6 = $$5.a((dba)this.r, $$3, $$4);
            if ($$6.e()) {
               return;
            }

            if ($$0 && fly.r() && $$4.t()) {
               $$1 = this.r.c_($$3);
            }
         } else {
            if ($$2 != eui.a.c || !$$0) {
               return;
            }

            bru $$7 = ((euh)this.v).a();
            $$6 = $$7.dC();
            if ($$6 == null) {
               return;
            }
         }

         if ($$6.e()) {
            String $$10 = "";
            if ($$2 == eui.a.b) {
               $$10 = le.e.b(this.r.a_(((eug)this.v).a()).b()).toString();
            } else if ($$2 == eui.a.c) {
               $$10 = le.g.b(((euh)this.v).a().ak()).toString();
            }

            F.warn("Picking on: [{}] {} gave null item", $$2, $$10);
         } else {
            clv $$11 = this.s.gc();
            if ($$1 != null) {
               this.a($$6, $$1, this.r.H_());
            }

            int $$12 = $$11.c($$6);
            if ($$0) {
               $$11.b($$6);
               this.q.a(this.s.b(bpt.a), 36 + $$11.k);
            } else if ($$12 != -1) {
               if (clv.d($$12)) {
                  $$11.k = $$12;
               } else {
                  this.q.a($$12);
               }
            }
         }
      }
   }

   private void a(cto $$0, dog $$1, jl $$2) {
      ud $$3 = $$1.e($$2);
      $$1.a($$3);
      crm.a($$0, $$1.r(), $$3);
      $$0.a($$1.s());
      $$0.a(kb.h, cwl.a, J, cwl::a);
   }

   public o d(o $$0) {
      ab $$1 = $$0.g();
      a($$1, this, this.an, this.ab, this.m);
      this.a($$0.a("Uptime"));
      if (this.r != null) {
         this.r.a($$0);
      }

      if (this.aR != null) {
         this.aR.b($$1);
      }

      this.bq.a($$0);
      return $$0;
   }

   public static void a(@Nullable fdz $$0, @Nullable gpd $$1, String $$2, @Nullable fed $$3, o $$4) {
      ab $$5 = $$4.g();
      a($$5, $$0, $$1, $$2, $$3);
   }

   private static String a(double $$0) {
      return String.format(Locale.ROOT, "%.3fs", $$0);
   }

   private void a(p $$0) {
      $$0.a("JVM uptime", () -> a((double)ManagementFactory.getRuntimeMXBean().getUptime() / 1000.0));
      $$0.a("Wall uptime", () -> a((double)(System.currentTimeMillis() - this.bB) / 1000.0));
      $$0.a("High-res time", () -> a((double)ac.c() / 1000.0));
      $$0.a("Client ticks", () -> String.format(Locale.ROOT, "%d ticks / %.3fs", this.bC, (double)this.bC / 20.0));
   }

   private static ab a(ab $$0, @Nullable fdz $$1, @Nullable gpd $$2, String $$3, @Nullable fed $$4) {
      $$0.a("Launched Version", () -> $$3);
      String $$5 = bg();
      if ($$5 != null) {
         $$0.a("Launcher name", $$5);
      }

      $$0.a("Backend library", RenderSystem::getBackendDescription);
      $$0.a("Backend API", RenderSystem::getApiDescription);
      $$0.a("Window size", () -> $$1 != null ? $$1.R.k() + "x" + $$1.R.l() : "<not initialized>");
      $$0.a("GL Caps", RenderSystem::getCapsString);
      $$0.a("GL debug messages", () -> exk.b() ? String.join("\n", exk.a()) : "<disabled>");
      $$0.a("Using VBOs", () -> "Yes");
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

         $$0.a("Graphics mode", $$4.j().c().toString());
         $$0.a("Render Distance", $$4.aD() + "/" + $$4.e().c() + " chunks");
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
      $$0.a("CPU", exl::b);
      return $$0;
   }

   public static fdz Q() {
      return E;
   }

   public CompletableFuture<Void> R() {
      return this.a(this::l).thenCompose($$0 -> (CompletionStage<Void>)$$0);
   }

   public void a(fxw $$0) {
      if (!this.bx.a($$0)) {
         this.bx = fxz.a($$0, this.az);
      }
   }

   @Nullable
   public fxf S() {
      return x.a(this.L(), fws::x);
   }

   public boolean T() {
      return this.aT;
   }

   public boolean U() {
      return this.aT && this.aR != null;
   }

   @Nullable
   public gsa V() {
      return this.aR;
   }

   public boolean W() {
      gsa $$0 = this.V();
      return $$0 != null && !$$0.r();
   }

   public boolean b(UUID $$0) {
      return $$0.equals(this.X().b());
   }

   public feo X() {
      return this.X;
   }

   public GameProfile Y() {
      ProfileResult $$0 = this.N.join();
      return $$0 != null ? $$0.profile() : new GameProfile(this.X.b(), this.X.c());
   }

   public Proxy Z() {
      return this.ad;
   }

   public gnw aa() {
      return this.O;
   }

   public atw ab() {
      return this.aj;
   }

   public ath ac() {
      return this.am;
   }

   public asm ad() {
      return this.ak;
   }

   public gql ae() {
      return this.al;
   }

   public Path af() {
      return this.M;
   }

   public gpd ag() {
      return this.an;
   }

   public Function<akm, gnv> a(akm $$0) {
      return this.aC.a($$0)::a;
   }

   public boolean ah() {
      return this.af;
   }

   public boolean ai() {
      return this.aV;
   }

   public gce aj() {
      return this.av;
   }

   public gsn ak() {
      return this.ar;
   }

   public ave al() {
      ave $$0 = x.a(this.y, fly::B);
      if ($$0 != null) {
         return $$0;
      } else if (this.s != null) {
         if (this.s.dP().ae() == dax.j) {
            return this.l.j().b() ? avf.d : avf.e;
         } else {
            ix<dbw> $$1 = this.s.dP().t(this.s.dp());
            if (!this.as.c(avf.f) && (!this.s.bj() || !$$1.a(avv.Z))) {
               return this.s.dP().ae() != dax.i && this.s.gd().d && this.s.gd().c ? avf.b : $$1.a().o().orElse(avf.g);
            } else {
               return avf.f;
            }
         }
      } else {
         return avf.a;
      }
   }

   public MinecraftSessionService am() {
      return this.ay;
   }

   public gow an() {
      return this.aB;
   }

   @Nullable
   public bru ao() {
      return this.t;
   }

   public void a(bru $$0) {
      this.t = $$0;
      this.j.a($$0);
   }

   public boolean b(bru $$0) {
      return $$0.cg() || this.s != null && this.s.N_() && this.m.S.e() && $$0.ak() == bsa.by;
   }

   @Override
   protected Thread az() {
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

   public gde ap() {
      return this.aD;
   }

   public ghr aq() {
      return this.U;
   }

   public gej ar() {
      return this.aM;
   }

   public gir as() {
      return this.V;
   }

   public <T> grw<T> a(grv.a<T> $$0) {
      return this.W.a($$0);
   }

   public <T> void a(grv.a<T> $$0, List<T> $$1) {
      this.W.a($$0, $$1);
   }

   public DataFixer at() {
      return this.P;
   }

   public float au() {
      return this.S.a;
   }

   public float av() {
      return this.S.b;
   }

   public ffd aw() {
      return this.ao;
   }

   public boolean ax() {
      return this.s != null && this.s.gs() || this.m.V().c();
   }

   public fij aA() {
      return this.aI;
   }

   public gtq aB() {
      return this.aJ;
   }

   public boolean aC() {
      return this.bh;
   }

   public fdv aD() {
      return this.Z;
   }

   public gqc aE() {
      return this.aC;
   }

   public gou aF() {
      return this.aE;
   }

   public got aG() {
      return this.aF;
   }

   public gos aH() {
      return this.aG;
   }

   public ffn aI() {
      return this.aH;
   }

   @Override
   public void a(boolean $$0) {
      this.bh = $$0;
   }

   public wx a(File $$0, int $$1, int $$2) {
      int $$3 = this.R.k();
      int $$4 = this.R.l();
      exe $$5 = new exf($$1, $$2, true, a);
      float $$6 = this.s.dH();
      float $$7 = this.s.dF();
      float $$8 = this.s.P;
      float $$9 = this.s.O;
      this.j.b(false);

      xl var12;
      try {
         this.j.c(true);
         this.f.e();
         this.R.b($$1);
         this.R.c($$2);

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

            fek.a($$0, "panorama_" + $$10 + ".png", $$5, $$0x -> {
            });
         }

         wx $$11 = wx.b($$0.getName()).a(n.t).a($$1x -> $$1x.a(new wv(wv.a.b, $$0.getAbsolutePath())));
         return wx.a("screenshot.success", $$11);
      } catch (Exception var18) {
         F.error("Couldn't save image", var18);
         var12 = wx.a("screenshot.failure", var18.getMessage());
      } finally {
         this.s.s($$6);
         this.s.r($$7);
         this.s.P = $$8;
         this.s.O = $$9;
         this.j.b(true);
         this.R.b($$3);
         this.R.c($$4);
         $$5.a();
         this.j.c(false);
         this.f.e();
         this.h().a(true);
      }

      return var12;
   }

   private wx a(File $$0, int $$1, int $$2, int $$3, int $$4) {
      try {
         ByteBuffer $$5 = exl.a($$1 * $$2 * 3);
         fek $$6 = new fek($$0, $$3, $$4, $$2);
         float $$7 = (float)$$3 / (float)$$1;
         float $$8 = (float)$$4 / (float)$$2;
         float $$9 = $$7 > $$8 ? $$7 : $$8;

         for (int $$10 = ($$4 - 1) / $$2 * $$2; $$10 >= 0; $$10 -= $$2) {
            for (int $$11 = 0; $$11 < $$3; $$11 += $$1) {
               RenderSystem.setShaderTexture(0, gnu.e);
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
         exl.a($$5);
         wx $$15 = wx.b($$14.getName()).a(n.t).a($$1x -> $$1x.a(new wv(wv.a.b, $$14.getAbsolutePath())));
         return wx.a("screenshot.success", $$15);
      } catch (Exception var15) {
         F.warn("Couldn't save screenshot", var15);
         return wx.a("screenshot.failure", var15.getMessage());
      }
   }

   public bmi aJ() {
      return this.bl;
   }

   @Nullable
   public aqz aK() {
      return this.Y.get();
   }

   public gox aL() {
      return this.au;
   }

   @Nullable
   public fls aM() {
      return this.ba;
   }

   public fqg aN() {
      return this.aK;
   }

   public boolean aO() {
      return false;
   }

   public exw aP() {
      return this.R;
   }

   public fgh aQ() {
      return this.l.k();
   }

   public gcq aR() {
      return this.T;
   }

   public void b(int $$0) {
      this.aC.a($$0);
   }

   public fvs aS() {
      return this.aL;
   }

   public boolean aT() {
      return this.bC().flag(UserFlag.PROFANITY_FILTER_ENABLED);
   }

   public void aU() {
      this.aK.a();
      this.w().a();
   }

   public feh aV() {
      return this.bu;
   }

   @Nullable
   public ayp aW() {
      return ayp.a(this.ax.getServicesKeySet(), ServicesKeyType.PROFILE_KEY);
   }

   public boolean aX() {
      return !this.ax.getServicesKeySet().keys(ServicesKeyType.PROFILE_KEY).isEmpty();
   }

   public fdw aY() {
      return this.aa;
   }

   public void a(fdw $$0) {
      this.aa = $$0;
   }

   public fdr aZ() {
      return this.bv;
   }

   public fxk ba() {
      return this.bw;
   }

   public fxz bb() {
      return this.bx;
   }

   public fay bc() {
      return this.aP;
   }

   public gbu bd() {
      return this.aQ;
   }

   public fdo be() {
      return this.by;
   }

   public eua bf() {
      return this.bz;
   }

   private float a(float $$0) {
      if (this.r != null) {
         bqf $$1 = this.r.s();
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
      a(ww.a) {
         @Override
         public boolean a(boolean $$0) {
            return true;
         }
      },
      b(wx.c("chat.disabled.options").a(n.m)) {
         @Override
         public boolean a(boolean $$0) {
            return false;
         }
      },
      c(wx.c("chat.disabled.launcher").a(n.m)) {
         @Override
         public boolean a(boolean $$0) {
            return $$0;
         }
      },
      d(wx.a("chat.disabled.profile", wx.d(fdz.E.m.K.h())).a(n.m)) {
         @Override
         public boolean a(boolean $$0) {
            return $$0;
         }
      };

      static final wx e = wx.c("chat.disabled.profile.moreInfo");
      private final wx f;

      a(wx $$0) {
         this.f = $$0;
      }

      public wx a() {
         return this.f;
      }

      public abstract boolean a(boolean var1);
   }

   static record b(ezi a, frm.c b) {
   }
}
