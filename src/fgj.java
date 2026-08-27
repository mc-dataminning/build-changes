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

public class fgj extends bou<Runnable> implements fah {
   static fgj E;
   private static final Logger F = LogUtils.getLogger();
   public static final boolean a = ad.j() == ad.a.d;
   private static final int G = 10;
   public static final akt b = new akt("default");
   public static final akt c = new akt("uniform");
   public static final akt d = new akt("alt");
   private static final akt H = new akt("regional_compliancies.json");
   private static final CompletableFuture<azo> I = CompletableFuture.completedFuture(azo.a);
   private static final xe J = xe.b("(+NBT)");
   private static final xe K = xe.c("multiplayer.socialInteractions.not_available");
   public static final String e = "Please make sure you have up-to-date drivers (see aka.ms/mcdriver for instructions).";
   private final long L = Double.doubleToLongBits(Math.PI);
   private final Path M;
   private final CompletableFuture<ProfileResult> N;
   private final gqz O;
   private final DataFixer P;
   private final gfy Q;
   private final fag R;
   private final fgw S = new fgw(20.0F, 0L, this::a);
   private final gfm T;
   public final gfe f;
   private final gko U;
   private final glp V;
   public final gcw g;
   private final guy W = new guy();
   private final fgy X;
   public final fhy h;
   public final fhy i;
   public final gez j;
   public final gis k;
   private final AtomicReference<arg> Y = new AtomicReference<>();
   public final fhz l;
   public final fgn m;
   private final fgf Z;
   public final fgk n;
   public final fgi o;
   private fgg aa = fgg.a;
   public final File p;
   private final String ab;
   private final String ac;
   private final Proxy ad;
   private final erf ae;
   private final boolean af;
   private final boolean ag;
   private final boolean ah;
   private final boolean ai;
   private final aua aj;
   private final ast ak;
   private final gto al;
   private final ato am;
   private final gsg an;
   private final fhn ao;
   private final fhr ap;
   private final ezo aq;
   private final gvq ar;
   private final gvl as;
   private final flc at;
   private final gsa au;
   private final gfa av;
   private final fgp aw = new fgp(H, fgj::b);
   private final YggdrasilAuthenticationService ax;
   private final MinecraftSessionService ay;
   private final UserApiService az;
   private final CompletableFuture<UserProperties> aA;
   private final grz aB;
   private final gtf aC;
   private final gga aD;
   private final grx aE;
   private final grw aF;
   private final grv aG;
   private final fib aH;
   private final fkx aI;
   private final gwt aJ;
   private final fsz aK;
   private final fyo aL;
   private final ghf aM;
   private final gvu aN;
   private final fzz aO;
   private final fdi aP;
   private final geq aQ;
   @Nullable
   public fzw q;
   @Nullable
   public fzn r;
   @Nullable
   public gei s;
   @Nullable
   private gvd aR;
   @Nullable
   private wc aS;
   private boolean aT;
   private final ayt aU = ayt.a();
   @Nullable
   public brv t;
   @Nullable
   public brv u;
   @Nullable
   public ews v;
   private int aV;
   protected int w;
   private volatile boolean aW;
   private float aX;
   private long aY = ad.c();
   private long aZ;
   private int ba;
   public boolean x;
   @Nullable
   public fon y;
   @Nullable
   private fog bb;
   private boolean bc;
   private Thread bd;
   private volatile boolean be;
   @Nullable
   private Supplier<o> bf;
   private static int bg;
   public String z = "";
   private long bh;
   public boolean A;
   public boolean B;
   public boolean C;
   public boolean D = true;
   private boolean bi;
   private final Queue<Runnable> bj = Queues.newConcurrentLinkedQueue();
   @Nullable
   private CompletableFuture<Void> bk;
   @Nullable
   private fky bl;
   private bmo bm = bml.a;
   private int bn;
   private final bmi bo = new bmi(ad.c, () -> this.bn);
   @Nullable
   private bmn bp;
   private boc bq = bob.a;
   private final fgt br = new fgt();
   private long bs;
   private double bt;
   @Nullable
   private fav.a bu;
   private final fgr bv;
   private final fgb bw;
   private final gag bx;
   private gav by;
   private final ffy bz;
   private final ewk bA;
   private boolean bB;
   private final long bC;
   private long bD;
   private String bE = "root";

   public fgj(fuf $$0) {
      super("Client");
      E = this;
      this.bC = System.currentTimeMillis();
      this.p = $$0.c.a;
      File $$1 = $$0.c.c;
      this.M = $$0.c.b.toPath();
      this.ab = $$0.d.b;
      this.ac = $$0.d.c;
      Path $$2 = this.p.toPath();
      this.bA = erf.a($$2.resolve("allowed_symlinks.txt"));
      grp $$3 = new grp($$0.c.a(), this.bA);
      this.al = new gto(this, $$2.resolve("downloads"), $$0.a);
      atq $$4 = new atj(this.M, asr.a, atp.b, this.bA);
      this.am = new ato($$3, this.al.a(), $$4);
      this.ak = $$3.a();
      this.ad = $$0.a.d;
      this.ax = new YggdrasilAuthenticationService(this.ad);
      this.ay = this.ax.createMinecraftSessionService();
      this.X = $$0.a.a;
      this.N = CompletableFuture.supplyAsync(() -> this.ay.fetchProfile(this.X.b(), true), ad.h());
      this.az = this.a(this.ax, $$0);
      this.aA = CompletableFuture.supplyAsync(() -> {
         try {
            return this.az.fetchProperties();
         } catch (AuthenticationException var2x) {
            F.error("Failed to fetch user properties", var2x);
            return UserApiService.OFFLINE_PROPERTIES;
         }
      }, ad.h());
      F.info("Setting user: {}", this.X.c());
      F.debug("(Session ID is {})", this.X.a());
      this.ag = $$0.d.a;
      this.ah = !$$0.d.d;
      this.ai = !$$0.d.e;
      this.af = bk();
      this.aR = null;
      yj.a(fgh::a);
      this.P = azt.a();
      this.aI = new fkx(this);
      this.bd = Thread.currentThread();
      this.m = new fgn(this, this.p);
      RenderSystem.setShaderGlintAlpha(this.m.an().c());
      this.be = true;
      this.aJ = new gwt(this, this.m);
      this.Z = new fgf($$2, this.P);
      F.info("Backend library: {}", RenderSystem.getBackendDescription());
      ezt $$5;
      if (this.m.p > 0 && this.m.o > 0) {
         $$5 = new ezt(this.m.o, this.m.p, $$0.b.c, $$0.b.d, $$0.b.e);
      } else {
         $$5 = $$0.b;
      }

      ad.c = RenderSystem.initBackendSystem();
      this.Q = new gfy(this);
      this.R = this.Q.a($$5, this.m.k, this.bh());
      this.a(true);
      gwf.a.b(gwb.A);

      try {
         this.R.a(this.ak, ab.b().g() ? ezw.a : ezw.b);
      } catch (IOException var13) {
         F.error("Couldn't set icon", var13);
      }

      this.R.a(this.m.h().c());
      this.n = new fgk(this);
      this.n.a(this.R.i());
      this.o = new fgi(this);
      this.o.a(this.R.i());
      RenderSystem.initRenderer(this.m.u, false);
      this.aq = new ezl(this.R.k(), this.R.l());
      this.aq.a(0.0F, 0.0F, 0.0F, 0.0F);
      this.aq.b(a);
      this.aj = new aua(asr.a);
      this.am.a();
      this.m.b(this.am);
      this.an = new gsg(this.m.ae);
      this.aj.a(this.an);
      this.O = new gqz(this.aj);
      this.aj.a(this.O);
      this.aB = new grz(this.O, $$1.toPath().resolve("skins"), this.ay, this);
      this.ae = new erf($$2.resolve("saves"), $$2.resolve("backups"), this.bA, this.P);
      this.bz = new ffy($$2);
      this.ar = new gvq(this.m);
      this.aj.a(this.ar);
      this.au = new gsa(this.X);
      this.aj.a(this.au);
      this.as = new gvl(this);
      this.at = new flc(this.O);
      this.h = this.at.a();
      this.i = this.at.b();
      this.aj.a(this.at);
      this.g();
      this.aj.a(new grs());
      this.aj.a(new grr());
      this.R.a("Startup");
      RenderSystem.setupDefaultState(0, 0, this.R.k(), this.R.l());
      this.R.a("Post startup");
      this.ao = fhn.a();
      this.ap = fhr.a(this.ao);
      this.aC = new gtf(this.O, this.ao, this.m.C().c());
      this.aj.a(this.aC);
      this.aL = new fyo();
      this.aj.a(this.aL);
      this.aM = new ghf(this.h, this.aL, this::ap, this::as, this::aq);
      this.aj.a(this.aM);
      get $$8 = new get(this.aM, this.aL);
      this.aj.a($$8);
      this.V = new glp(this, this.O, this.aC, this.ap, $$8);
      this.aj.a(this.V);

      try {
         int $$9 = Runtime.getRuntime().availableProcessors();
         int $$10 = this.ah() ? $$9 : Math.min($$9, 4);
         fbe.a();
         this.T = new gfm($$10);
      } catch (OutOfMemoryError var12) {
         TinyFileDialogs.tinyfd_messageBox(
            "Minecraft",
            "Oh no! The game was unable to allocate memory off-heap while trying to start. You may try to free some memory by closing other applications on your computer, check that your system meets the minimum requirements, and try again. If the problem persists, please visit: https://aka.ms/Minecraft-Support",
            "ok",
            "error",
            true
         );
         throw new fug("Unable to allocate render buffers", var12);
      }

      this.aK = new fsz(this, this.az);
      this.aD = new gga(this.aC.b(), $$8, this.ao);
      this.aj.a(this.aD);
      this.U = new gko(this, this.O, this.V, this.aD, this.h, this.m, this.aL);
      this.aj.a(this.U);
      this.g = new gcw(this.r, this.O);
      this.aj.a(this.g);
      this.aE = new grx(this.O);
      this.aj.a(this.aE);
      this.aF = new grw(this.O);
      this.aj.a(this.aF);
      this.aG = new grv(this.O);
      this.aj.a(this.aG);
      this.aH = new fib(this.O);
      this.aj.a(this.aH);
      this.j = new gez(this, this.U.d(), this.aj, this.T);
      this.aj.a(this.j.e());
      this.f = new gfe(this, this.U, this.aM, this.T);
      this.aj.a(this.f);
      this.bj();
      this.aj.a(this.W);
      this.av = new gfa();
      this.aj.a(this.av);
      this.aj.a(this.aw);
      this.l = new fhz(this);
      this.k = new gis(this);
      fbs $$12 = fbs.a(this);
      this.aP = new fdi($$12);
      RenderSystem.setErrorCallback(this::a);
      if (this.aq.c != this.R.k() || this.aq.d != this.R.l()) {
         StringBuilder $$13 = new StringBuilder(
            "Recovering from unsupported resolution ("
               + this.R.k()
               + "x"
               + this.R.l()
               + ").\nPlease make sure you have up-to-date drivers (see aka.ms/mcdriver for instructions)."
         );
         if (ezu.b()) {
            $$13.append("\n\nReported GL debug messages:\n").append(String.join("\n", ezu.a()));
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
      this.aN = new gvu(this, this.az, this.X);
      this.aO = fzz.a(this.az, this.X, $$2);
      this.bv = new fgr(this);
      this.bw = new fgb(this);
      this.bw.a(this.m.as().c() != fgl.a);
      this.bx = new gag(this);
      this.bx.a(this.m.A().c());
      this.by = gav.a(gas.a(), this.az);
      fny.a(this);
      this.a(new fns(xe.c("gui.loadingMinecraft")));
      List<asp> $$14 = this.am.g();
      this.br.a(fgt.b.a, $$14);
      atz $$15 = this.aj.a(ad.f(), this, I, $$14);
      gwf.a.a(gwb.C);
      fgj.b $$16 = new fgj.b($$12, $$0.e);
      this.a(new fny(this, $$15, $$1x -> ad.a($$1x, $$1xx -> this.a($$1xx, $$16), () -> {
            if (ab.aX) {
               this.bm();
            }

            this.br.a();
            this.a($$16);
         }), false));
      this.aQ = geq.a($$0.e.b());
   }

   private void a(@Nullable fgj.b $$0) {
      if (!this.bB) {
         this.bB = true;
         this.b($$0);
      }
   }

   private void b(@Nullable fgj.b $$0) {
      Runnable $$1 = this.c($$0);
      gwf.a.b(gwb.C);
      gwf.a.b(gwb.z);
      gwf.a.a(this.aN.a());
      $$1.run();
   }

   public boolean c() {
      return this.bB;
   }

   private Runnable c(@Nullable fgj.b $$0) {
      List<Function<Runnable, fon>> $$1 = new ArrayList<>();
      this.a($$1);
      Runnable $$2 = () -> {
         if ($$0 != null && $$0.b().a()) {
            gep.a(this, $$0.b(), $$0.a());
         } else {
            this.a(new fou(true));
         }
      };

      for (Function<Runnable, fon> $$3 : Lists.reverse($$1)) {
         fon $$4 = $$3.apply($$2);
         $$2 = () -> this.a($$4);
      }

      return $$2;
   }

   private void a(List<Function<Runnable, fon>> $$0) {
      if (this.m.af) {
         $$0.add($$0x -> new fmw(this.m, $$0x));
      }

      BanDetails $$1 = this.H();
      if ($$1 != null) {
         $$0.add($$1x -> fna.a($$1xx -> {
               if ($$1xx) {
                  ad.j().a("https://aka.ms/mcjavamoderation");
               }

               $$1x.run();
            }, $$1));
      }

      ProfileResult $$2 = this.N.join();
      if ($$2 != null) {
         GameProfile $$3 = $$2.profile();
         Set<ProfileActionType> $$4 = $$2.actions();
         if ($$4.contains(ProfileActionType.FORCED_NAME_CHANGE)) {
            $$0.add($$1x -> fna.a($$3.getName(), $$1x));
         }

         if ($$4.contains(ProfileActionType.USING_BANNED_SKIN)) {
            $$0.add(fna::a);
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
      $$0.append(ab.b().c());
      fzo $$1 = this.L();
      if ($$1 != null && $$1.l().i()) {
         $$0.append(" - ");
         gab $$2 = this.S();
         if (this.aR != null && !this.aR.r()) {
            $$0.append(gse.a("title.singleplayer"));
         } else if ($$2 != null && $$2.e()) {
            $$0.append(gse.a("title.multiplayer.realms"));
         } else if (this.aR == null && ($$2 == null || !$$2.d())) {
            $$0.append(gse.a("title.multiplayer.other"));
         } else {
            $$0.append(gse.a("title.multiplayer.lan"));
         }
      }

      return $$0.toString();
   }

   private UserApiService a(YggdrasilAuthenticationService $$0, fuf $$1) {
      return $$0.createUserApiService($$1.a.a.d());
   }

   public static ayl e() {
      return ayl.a("vanilla", ClientBrandRetriever::getClientModName, "Client", fgj.class);
   }

   private void a(Throwable $$0, @Nullable fgj.b $$1) {
      if (this.am.d().size() > 1) {
         this.a($$0, null, $$1);
      } else {
         ad.a($$0);
      }
   }

   public void a(Throwable $$0, @Nullable xe $$1, @Nullable fgj.b $$2) {
      F.info("Caught error loading resourcepacks, removing all selected resourcepacks", $$0);
      this.br.a($$0);
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
         this.r.Y();
         this.y();
      }

      this.a(new fou());
      this.a(null);
   }

   private void a(@Nullable xe $$0) {
      fkx $$1 = this.aA();
      fkv.b($$1, fkv.a.c, xe.c("resourcePack.load_fail"), $$0);
   }

   public void f() {
      this.bd = Thread.currentThread();
      if (Runtime.getRuntime().availableProcessors() > 4) {
         this.bd.setPriority(10);
      }

      try {
         boolean $$0 = false;

         while (this.be) {
            this.bl();

            try {
               bmr $$1 = bmr.a("Renderer");
               boolean $$2 = this.aQ().e();
               this.bm = this.a($$2, $$1);
               this.bm.a();
               this.bq.c();
               this.c(!$$0);
               this.bq.d();
               this.bm.b();
               this.b($$2, $$1);
            } catch (OutOfMemoryError var4) {
               if ($$0) {
                  throw var4;
               }

               this.bo();
               this.a(new fof());
               System.gc();
               F.error(LogUtils.FATAL_MARKER, "Out of memory", var4);
               $$0 = true;
            }
         }
      } catch (z var5) {
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
            guy.a,
            $$0 -> new gur<>(
                  $$0x -> $$0x.a(null, cwi.a.a.c()).stream().map($$0xx -> n.a($$0xx.getString()).trim()).filter($$0xx -> !$$0xx.isEmpty()),
                  $$0x -> Stream.of(lh.h.b($$0x.f())),
                  $$0
               )
         );
      this.W.a(guy.b, $$0 -> new gus<>($$0x -> $$0x.h().map(awt::b), $$0));
      this.W
         .a(
            guy.c,
            $$0 -> new gur<>(
                  $$0x -> $$0x.e()
                        .stream()
                        .flatMap($$1 -> $$1.b().a($$0x.a()).a(null, cwi.a.a).stream())
                        .map($$0xx -> n.a($$0xx.getString()).trim())
                        .filter($$0xx -> !$$0xx.isEmpty()),
                  $$0x -> $$0x.e().stream().map($$1 -> lh.h.b($$1.b().a($$0x.a()).f())),
                  $$0
               )
         );
      csr.e().a($$0 -> {
         this.a(guy.a, $$0);
         this.a(guy.b, $$0);
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

   public ezo h() {
      return this.aq;
   }

   public String i() {
      return this.ab;
   }

   public String j() {
      return this.ac;
   }

   public void a(o $$0) {
      this.bf = () -> this.d($$0);
   }

   public void b(o $$0) {
      this.bf = () -> $$0;
   }

   private void bl() {
      if (this.bf != null) {
         a(this, this.p, this.bf.get());
      }
   }

   public void c(o $$0) {
      o $$1 = this.d($$0);
      this.bo();
      a(this, this.p, $$1);
   }

   public static void a(@Nullable fgj $$0, File $$1, o $$2) {
      File $$3 = new File($$1, "crash-reports");
      File $$4 = new File($$3, "crash-" + ad.e() + "-client.txt");
      akv.a($$2.e());
      if ($$0 != null) {
         $$0.ar.h();
      }

      if ($$2.f() != null) {
         akv.a("#@!@# Game crashed! Crash report saved to: #@!@# " + $$2.f());
         System.exit(-1);
      } else if ($$2.a($$4)) {
         akv.a("#@!@# Game crashed! Crash report saved to: #@!@# " + $$4.getAbsolutePath());
         System.exit(-1);
      } else {
         akv.a("#@?@# Game crashed! Crash report could not be saved. #@?@#");
         System.exit(-2);
      }
   }

   public boolean k() {
      return this.m.P().c();
   }

   public CompletableFuture<Void> l() {
      return this.a(false, null);
   }

   private CompletableFuture<Void> a(boolean $$0, @Nullable fgj.b $$1) {
      if (this.bk != null) {
         return this.bk;
      } else {
         CompletableFuture<Void> $$2 = new CompletableFuture<>();
         if (!$$0 && this.bb instanceof fny) {
            this.bk = $$2;
            return $$2;
         } else {
            this.am.a();
            List<asp> $$3 = this.am.g();
            if (!$$0) {
               this.br.a(fgt.b.b, $$3);
            }

            this.a(new fny(this, this.aj.a(ad.f(), this, I, $$3), $$3x -> ad.a($$3x, $$2xx -> {
                  if ($$0) {
                     this.al.c();
                     this.bi();
                  } else {
                     this.a($$2xx, $$1);
                  }
               }, () -> {
                  this.f.f();
                  this.br.a();
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
      gfz $$1 = this.ap().a();
      gsz $$2 = $$1.a().a();

      for (dfc $$3 : lh.e) {
         UnmodifiableIterator $$10 = $$3.l().a().iterator();

         while ($$10.hasNext()) {
            dtc $$4 = (dtc)$$10.next();
            if ($$4.l() == dlw.c) {
               gsz $$5 = $$1.b($$4);
               if ($$5 == $$2) {
                  F.debug("Missing model for: {}", $$4);
                  $$0 = true;
               }
            }
         }
      }

      gqy $$6 = $$2.e();

      for (dfc $$7 : lh.e) {
         UnmodifiableIterator var17 = $$7.l().a().iterator();

         while (var17.hasNext()) {
            dtc $$8 = (dtc)var17.next();
            gqy $$9 = $$1.a($$8);
            if (!$$8.i() && $$9 == $$6) {
               F.debug("Missing particle icon for: {}", $$8);
            }
         }
      }

      for (cuc $$10 : lh.h) {
         cuh $$11 = $$10.v();
         String $$12 = $$11.s();
         String $$13 = xe.c($$12).getString();
         if ($$13.toLowerCase(Locale.ROOT).equals($$10.a())) {
            F.debug("Missing translation for: {} {} {}", new Object[]{$$11, $$12, $$10});
         }
      }

      $$0 |= fnz.a();
      $$0 |= gkr.a();
      if ($$0) {
         throw new IllegalStateException("Your game data is foobar, fix the errors above!");
      }
   }

   public erf m() {
      return this.ae;
   }

   private void a(String $$0) {
      fgj.a $$1 = this.J();
      if (!$$1.a(this.T())) {
         if (this.l.b()) {
            this.l.b(false);
            this.a(new fnd($$0x -> {
               if ($$0x) {
                  ad.j().a("https://aka.ms/JavaAccountSettings");
               }

               this.a(null);
            }, fgj.a.e, "https://aka.ms/JavaAccountSettings", true));
         } else {
            xe $$2 = $$1.a();
            this.l.a($$2, false);
            this.bw.c($$2);
            this.l.b($$1 == fgj.a.d);
         }
      } else {
         this.a(new fnc($$0));
      }
   }

   public void a(@Nullable fon $$0) {
      if (ab.aX && Thread.currentThread() != this.bd) {
         F.error("setScreen called from non-game thread");
      }

      if (this.y != null) {
         this.y.j();
      } else {
         this.a(fgg.a);
      }

      if ($$0 == null && this.bc) {
         throw new IllegalStateException("Trying to return to in-game GUI during disconnection");
      } else {
         if ($$0 == null && this.r == null) {
            $$0 = new fou();
         } else if ($$0 == null && this.s.eJ()) {
            if (this.s.o()) {
               $$0 = new fnk(null, this.r.k().l());
            } else {
               this.s.gj();
            }
         }

         this.y = $$0;
         if (this.y != null) {
            this.y.aF_();
         }

         fay.a();
         if ($$0 != null) {
            this.n.j();
            fgh.b();
            $$0.b(this, this.R.o(), this.R.p());
            this.x = false;
         } else {
            this.ar.i();
            this.n.i();
         }

         this.d();
      }
   }

   public void a(@Nullable fog $$0) {
      this.bb = $$0;
   }

   public void n() {
      try {
         F.info("Stopping!");

         try {
            this.bw.c();
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
         flo.b();
         ad.i();
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
      long $$1 = ad.c();
      if (this.R.b()) {
         this.q();
      }

      if (this.bk != null && !(this.bb instanceof fny)) {
         CompletableFuture<Void> $$2 = this.bk;
         this.bk = null;
         this.l().thenRun(() -> $$2.complete(null));
      }

      Runnable $$3;
      while (($$3 = this.bj.poll()) != null) {
         $$3.run();
      }

      if ($$0) {
         int $$4 = this.S.a(ad.b());
         this.bm.a("scheduledExecutables");
         this.bz();
         this.bm.c();
         this.bm.a("tick");

         for (int $$5 = 0; $$5 < Math.min(10, $$4); $$5++) {
            this.bm.d("clientTick");
            this.t();
         }

         this.bm.c();
      }

      this.R.a("Render");
      this.bm.a("sound");
      this.ar.a(this.j.m());
      this.bm.c();
      this.bm.a("render");
      long $$6 = ad.c();
      boolean $$8;
      if (!this.aQ().d() && !this.bq.e()) {
         $$8 = false;
         this.bt = 0.0;
      } else {
         $$8 = this.bu == null || this.bu.b();
         if ($$8) {
            fav.a().ifPresent(fav::b);
         }
      }

      RenderSystem.clear(16640, a);
      this.aq.a(true);
      gey.a();
      this.bm.a("display");
      RenderSystem.enableCull();
      this.bm.b("mouse");
      this.n.a();
      this.bm.c();
      if (!this.x) {
         this.bm.b("gameRenderer");
         this.j.a(this.aW ? this.aX : this.S.a, $$1, $$0);
         this.bm.c();
      }

      if (this.bp != null) {
         this.bm.a("fpsPie");
         fia $$9 = new fia(this, this.T.c());
         this.a($$9, this.bp);
         $$9.e();
         this.bm.c();
      }

      this.bm.a("blit");
      this.aq.e();
      this.aq.a(this.R.k(), this.R.l());
      this.bh = ad.c() - $$6;
      if ($$8) {
         fav.a().ifPresent($$0x -> this.bu = $$0x.c());
      }

      this.bm.b("updateDisplay");
      this.R.e();
      int $$10 = this.bn();
      if ($$10 < 260) {
         RenderSystem.limitDisplayFPS($$10);
      }

      this.bm.b("yield");
      Thread.yield();
      this.bm.c();
      this.R.a("Post render");
      this.ba++;
      boolean $$11 = this.U() && (this.y != null && this.y.k() || this.bb != null && this.bb.a()) && !this.aR.r();
      if (this.aW != $$11) {
         if ($$11) {
            this.aX = this.S.a;
         } else {
            this.S.a = this.aX;
         }

         this.aW = $$11;
      }

      long $$12 = ad.c();
      long $$13 = $$12 - this.aY;
      if ($$8) {
         this.bs = $$13;
      }

      this.aQ().a($$13);
      this.aY = $$12;
      this.bm.a("fpsUpdate");
      if (this.bu != null && this.bu.b()) {
         this.bt = (double)this.bu.c() * 100.0 / (double)this.bs;
      }

      while (ad.b() >= this.aZ + 1000L) {
         String $$14;
         if (this.bt > 0.0) {
            $$14 = " GPU: " + (this.bt > 100.0 ? n.m + "100%" : Math.round(this.bt) + "%");
         } else {
            $$14 = "";
         }

         bg = this.ba;
         this.z = String.format(
            Locale.ROOT,
            "%d fps T: %s%s%s%s B: %d%s",
            bg,
            $$10 == 260 ? "inf" : $$10,
            this.m.N().c() ? " vsync " : " ",
            this.m.j().c(),
            this.m.i().c() == ffx.a ? "" : (this.m.i().c() == ffx.b ? " fast-clouds" : " fancy-clouds"),
            this.m.E().c(),
            $$14
         );
         this.aZ += 1000L;
         this.ba = 0;
      }

      this.bm.c();
   }

   private bmo a(boolean $$0, @Nullable bmr $$1) {
      if (!$$0) {
         this.bo.b();
         if (!this.bq.e() && $$1 == null) {
            return bml.a;
         }
      }

      bmo $$2;
      if ($$0) {
         if (!this.bo.a()) {
            this.bn = 0;
            this.bo.c();
         }

         this.bn++;
         $$2 = this.bo.d();
      } else {
         $$2 = bml.a;
      }

      if (this.bq.e()) {
         $$2 = bmo.a($$2, this.bq.f());
      }

      return bmr.a($$2, $$1);
   }

   private void b(boolean $$0, @Nullable bmr $$1) {
      if ($$1 != null) {
         $$1.b();
      }

      if ($$0) {
         this.bp = this.bo.e();
      } else {
         this.bp = null;
      }

      this.bm = this.bo.d();
   }

   @Override
   public void a() {
      int $$0 = this.R.a(this.m.aq().c(), this.k());
      this.R.a((double)$$0);
      if (this.y != null) {
         this.y.a(this, this.R.o(), this.R.p());
      }

      ezo $$1 = this.h();
      $$1.a(this.R.k(), this.R.l(), a);
      this.j.a(this.R.k(), this.R.l());
      this.n.g();
   }

   @Override
   public void b() {
      this.n.k();
   }

   public int o() {
      return bg;
   }

   public long p() {
      return this.bh;
   }

   private int bn() {
      return this.r != null || this.y == null && this.bb == null ? this.R.d() : 60;
   }

   private void bo() {
      try {
         ayk.b();
         this.f.p();
      } catch (Throwable var3) {
      }

      try {
         System.gc();
         if (this.aT && this.aR != null) {
            this.aR.a(true);
         }

         this.b((fon)(new fns(xe.c("menu.savingLevel"))));
      } catch (Throwable var2) {
      }

      System.gc();
   }

   public boolean a(Consumer<xe> $$0) {
      if (this.bq.e()) {
         this.bp();
         return false;
      } else {
         Consumer<bmn> $$1 = $$1x -> {
            if ($$1x != bmj.a) {
               int $$2x = $$1x.f();
               double $$3x = (double)$$1x.g() / (double)azl.a;
               this.execute(
                  () -> $$0.accept(
                        xe.a("commands.debug.stopped", String.format(Locale.ROOT, "%.2f", $$3x), $$2x, String.format(Locale.ROOT, "%.2f", (double)$$2x / $$3x))
                     )
               );
            }
         };
         Consumer<Path> $$2 = $$1x -> {
            xe $$2x = xe.b($$1x.toString()).a(n.t).a($$1xx -> $$1xx.a(new xc(xc.a.b, $$1x.toFile().getParent())));
            this.execute(() -> $$0.accept(xe.a("debug.profiling.stop", $$2x)));
         };
         ac $$3 = a(new ac(), this, this.an, this.ab, this.m);
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
            CompletableFuture.allOf($$6, $$7).thenRunAsync(() -> $$4.accept(ImmutableList.of($$6.join(), $$7.join())), ad.g());
            this.aR.a($$0x -> {
            }, $$7::complete);
            $$5 = $$6::complete;
         }

         this.bq = boa.a(new gen(ad.c, this.f), ad.c, ad.g(), new bog("client"), $$1x -> {
            this.bq = bob.a;
            $$1.accept($$1x);
         }, $$5);
         return true;
      }
   }

   private void bp() {
      this.bq.a();
      if (this.aR != null) {
         this.aR.aX();
      }
   }

   private void bq() {
      this.bq.b();
      if (this.aR != null) {
         this.aR.aY();
      }
   }

   private Path a(ac $$0, List<Path> $$1) {
      String $$2;
      if (this.T()) {
         $$2 = this.V().bb().e();
      } else {
         gab $$3 = this.S();
         $$2 = $$3 != null ? $$3.a : "unknown";
      }

      Path $$7;
      try {
         String $$5 = String.format(Locale.ROOT, "%s-%s-%s", ad.e(), $$2, ab.b().b());
         String $$6 = v.a(bog.a, $$5, ".zip");
         $$7 = bog.a.resolve($$6);
      } catch (IOException var21) {
         throw new UncheckedIOException(var21);
      }

      try (axx $$10 = new axx($$7)) {
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
      if (this.bp != null) {
         List<bmq> $$1 = this.bp.a(this.bE);
         if (!$$1.isEmpty()) {
            bmq $$2 = $$1.remove(0);
            if ($$0 == 0) {
               if (!$$2.d.isEmpty()) {
                  int $$3 = this.bE.lastIndexOf(30);
                  if ($$3 >= 0) {
                     this.bE = this.bE.substring(0, $$3);
                  }
               }
            } else {
               $$0--;
               if ($$0 < $$1.size() && !"unspecified".equals($$1.get($$0).d)) {
                  if (!this.bE.isEmpty()) {
                     this.bE = this.bE + "\u001e";
                  }

                  this.bE = this.bE + $$1.get($$0).d;
               }
            }
         }
      }
   }

   private void a(fia $$0, bmn $$1) {
      List<bmq> $$2 = $$1.a(this.bE);
      bmq $$3 = $$2.remove(0);
      RenderSystem.clear(256, a);
      RenderSystem.setShader(gez::q);
      Matrix4f $$4 = new Matrix4f().setOrtho(0.0F, (float)this.R.k(), (float)this.R.l(), 0.0F, 1000.0F, 3000.0F);
      RenderSystem.setProjectionMatrix($$4, fbk.b);
      Matrix4fStack $$5 = RenderSystem.getModelViewStack();
      $$5.pushMatrix();
      $$5.translation(0.0F, 0.0F, -2000.0F);
      RenderSystem.applyModelViewMatrix();
      RenderSystem.lineWidth(1.0F);
      fbe $$6 = fbe.b();
      fax $$7 = $$6.d();
      int $$8 = 160;
      int $$9 = this.R.k() - 160 - 10;
      int $$10 = this.R.l() - 320;
      RenderSystem.enableBlend();
      $$7.a(fbh.b.h, fba.n);
      $$7.a((double)((float)$$9 - 176.0F), (double)((float)$$10 - 96.0F - 16.0F), 0.0).a(200, 0, 0, 0).e();
      $$7.a((double)((float)$$9 - 176.0F), (double)($$10 + 320), 0.0).a(200, 0, 0, 0).e();
      $$7.a((double)((float)$$9 + 176.0F), (double)($$10 + 320), 0.0).a(200, 0, 0, 0).e();
      $$7.a((double)((float)$$9 + 176.0F), (double)((float)$$10 - 96.0F - 16.0F), 0.0).a(200, 0, 0, 0).e();
      $$6.c();
      RenderSystem.disableBlend();
      double $$11 = 0.0;

      for (bmq $$12 : $$2) {
         int $$13 = aym.a($$12.a / 4.0) + 1;
         $$7.a(fbh.b.g, fba.n);
         int $$14 = $$12.a();
         int $$15 = $$14 >> 16 & 0xFF;
         int $$16 = $$14 >> 8 & 0xFF;
         int $$17 = $$14 & 0xFF;
         $$7.a((double)$$9, (double)$$10, 0.0).a($$15, $$16, $$17, 255).e();

         for (int $$18 = $$13; $$18 >= 0; $$18--) {
            float $$19 = (float)(($$11 + $$12.a * (double)$$18 / (double)$$13) * (float) (Math.PI * 2) / 100.0);
            float $$20 = aym.a($$19) * 160.0F;
            float $$21 = aym.b($$19) * 160.0F * 0.5F;
            $$7.a((double)((float)$$9 + $$20), (double)((float)$$10 - $$21), 0.0).a($$15, $$16, $$17, 255).e();
         }

         $$6.c();
         $$7.a(fbh.b.f, fba.n);

         for (int $$22 = $$13; $$22 >= 0; $$22--) {
            float $$23 = (float)(($$11 + $$12.a * (double)$$22 / (double)$$13) * (float) (Math.PI * 2) / 100.0);
            float $$24 = aym.a($$23) * 160.0F;
            float $$25 = aym.b($$23) * 160.0F * 0.5F;
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
      String $$27 = bmn.b($$3.d);
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
         bmq $$31 = $$2.get($$30);
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
      this.be = false;
   }

   public boolean r() {
      return this.be;
   }

   public void b(boolean $$0) {
      if (this.y == null) {
         boolean $$1 = this.U() && !this.aR.r();
         if ($$1) {
            this.a(new foh(!$$0));
            this.ar.e();
         } else {
            this.a(new foh(true));
         }
      }
   }

   private void d(boolean $$0) {
      if (!$$0) {
         this.w = 0;
      }

      if (this.w <= 0 && !this.s.fE()) {
         if ($$0 && this.v != null && this.v.c() == ews.a.b) {
            ewq $$1 = (ewq)this.v;
            ir $$2 = $$1.a();
            if (!this.r.a_($$2).i()) {
               iw $$3 = $$1.b();
               if (this.q.b($$2, $$3)) {
                  this.g.a($$2, $$3);
                  this.s.a(bpz.a);
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
         cuh $$0 = this.s.b(bpz.a);
         if (!$$0.a(this.r.K())) {
            return false;
         } else {
            boolean $$1 = false;
            switch (this.v.c()) {
               case c:
                  this.q.a(this.s, ((ewr)this.v).a());
                  break;
               case b:
                  ewq $$2 = (ewq)this.v;
                  ir $$3 = $$2.a();
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

                  this.s.gH();
            }

            this.s.a(bpz.a);
            return $$1;
         }
      }
   }

   private void bs() {
      if (!this.q.k()) {
         this.aV = 4;
         if (!this.s.B()) {
            if (this.v == null) {
               F.warn("Null returned as 'hitResult', this shouldn't happen!");
            }

            for (bpz $$0 : bpz.values()) {
               cuh $$1 = this.s.b($$0);
               if (!$$1.a(this.r.K())) {
                  return;
               }

               if (this.v != null) {
                  switch (this.v.c()) {
                     case c:
                        ewr $$2 = (ewr)this.v;
                        brv $$3 = $$2.a();
                        if (!this.r.D_().a($$3.du())) {
                           return;
                        }

                        bqa $$4 = this.q.a(this.s, $$3, $$2, $$0);
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
                        ewq $$5 = (ewq)this.v;
                        int $$6 = $$1.G();
                        bqa $$7 = this.q.a(this.s, $$0, $$5);
                        if ($$7.a()) {
                           if ($$7.b()) {
                              this.s.a($$0);
                              if (!$$1.d() && ($$1.G() != $$6 || this.q.f())) {
                                 this.j.b.a($$0);
                              }
                           }

                           return;
                        }

                        if ($$7 == bqa.e) {
                           return;
                        }
                  }
               }

               if (!$$1.d()) {
                  bqa $$8 = this.q.a(this.s, $$0);
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

   public gvl s() {
      return this.as;
   }

   public void t() {
      this.bD++;
      if (this.r != null && !this.aW) {
         this.r.s().m();
      }

      if (this.aV > 0) {
         this.aV--;
      }

      this.bm.a("gui");
      this.bx.a();
      this.l.a(this.aW);
      this.bm.c();
      this.j.b(1.0F);
      this.aJ.a(this.r, this.v);
      this.bm.a("gameMode");
      if (!this.aW && this.r != null) {
         this.q.c();
      }

      this.bm.b("textures");
      boolean $$0 = this.r == null || this.r.s().i();
      if ($$0) {
         this.O.e();
      }

      if (this.y != null || this.s == null) {
         if (this.y instanceof fnu $$1 && !this.s.fU()) {
            $$1.m();
         }
      } else if (this.s.eJ() && !(this.y instanceof fnk)) {
         this.a(null);
      } else if (this.s.fU() && this.r != null) {
         this.a(new fnu());
      }

      if (this.y != null) {
         this.w = 10000;
      }

      if (this.y != null) {
         fon.a(() -> this.y.e(), "Ticking screen", this.y.getClass().getCanonicalName());
      }

      if (!this.aQ().d()) {
         this.l.l();
      }

      if (this.bb == null && this.y == null) {
         this.bm.b("Keybindings");
         this.bB();
         if (this.w > 0) {
            this.w--;
         }
      }

      if (this.r != null) {
         this.bm.b("gameRenderer");
         if (!this.aW) {
            this.j.f();
         }

         this.bm.b("levelRenderer");
         if (!this.aW) {
            this.f.o();
         }

         this.bm.b("level");
         if (!this.aW) {
            this.r.f();
         }
      } else if (this.j.g() != null) {
         this.j.b();
      }

      if (!this.aW) {
         this.as.a();
      }

      this.ar.a(this.aW);
      if (this.r != null) {
         if (!this.aW) {
            if (!this.m.s && this.bt()) {
               xe $$2 = xe.c("tutorial.socialInteractions.title");
               xe $$3 = xe.a("tutorial.socialInteractions.description", gwt.a("socialInteractions"));
               this.bl = new fky(fky.a.f, $$2, $$3, true);
               this.aJ.a(this.bl, 160);
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

               throw new z($$5);
            }
         }

         this.bm.b("animateTick");
         if (!this.aW && $$0) {
            this.r.b(this.s.dy(), this.s.dA(), this.s.dE());
         }

         this.bm.b("particles");
         if (!this.aW && $$0) {
            this.g.b();
         }
      } else if (this.aS != null) {
         this.bm.b("pendingConnection");
         this.aS.b();
      }

      this.bm.b("keyboard");
      this.o.b();
      this.bm.c();
   }

   private boolean bt() {
      return !this.aT || this.aR != null && this.aR.r();
   }

   private void bB() {
      while (this.m.Q.g()) {
         ffv $$0 = this.m.aA();
         this.m.a(this.m.aA().c());
         if ($$0.a() != this.m.aA().a()) {
            this.j.a(this.m.aA().a() ? this.ao() : null);
         }

         this.f.r();
      }

      while (this.m.R.g()) {
         this.m.ac = !this.m.ac;
      }

      for (int $$1 = 0; $$1 < 9; $$1++) {
         boolean $$2 = this.m.W.e();
         boolean $$3 = this.m.X.e();
         if (this.m.V[$$1].g()) {
            if (this.s.O_()) {
               this.l.g().a($$1);
            } else if (!this.s.f() || this.y != null || !$$3 && !$$2) {
               this.s.gl().k = $$1;
            } else {
               fqc.a(this, $$1, $$3, $$2);
            }
         }
      }

      while (this.m.N.g()) {
         if (!this.bt()) {
            this.s.a(K, true);
            this.bw.c(K);
         } else {
            if (this.bl != null) {
               this.aJ.a(this.bl);
               this.bl = null;
            }

            this.a(new ftb());
         }
      }

      while (this.m.E.g()) {
         if (this.q.g()) {
            this.s.i();
         } else {
            this.aJ.a();
            this.a(new fqo(this.s));
         }
      }

      while (this.m.U.g()) {
         this.a(new fpe(this.s.h.q()));
      }

      while (this.m.F.g()) {
         if (!this.s.O_()) {
            this.L().b(new aho(aho.a.g, ir.c, iw.a));
         }
      }

      while (this.m.G.g()) {
         if (!this.s.O_() && this.s.a(fon.r())) {
            this.s.a(bpz.a);
         }
      }

      while (this.m.K.g()) {
         this.a("");
      }

      if (this.y == null && this.bb == null && this.m.M.g()) {
         this.a("/");
      }

      while (this.m.O.g()) {
         fgj.a $$4 = this.J();
         if ($$4.a(this.T())) {
            this.s.h.b("\ud83e\udd54".repeat(this.aU.a(1, 6)));
         }
      }

      boolean $$5 = false;
      if (this.s.fE()) {
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
            $$5 |= this.br();
         }

         while (this.m.H.g()) {
            this.bs();
         }

         while (this.m.J.g()) {
            this.bD();
         }
      }

      if (this.m.H.e() && this.aV == 0 && !this.s.fE()) {
         this.bs();
      }

      this.d(this.y == null && !$$5 && this.m.I.e() && this.n.h());
   }

   public gvu u() {
      return this.aN;
   }

   public double v() {
      return this.bt;
   }

   public fzz w() {
      return this.aO;
   }

   public ftr x() {
      return new ftr(this, this.ae);
   }

   public void a(erf.c $$0, ato $$1, alq $$2, boolean $$3) {
      this.y();
      this.Y.set(null);
      Instant $$4 = Instant.now();

      try {
         $$0.a($$2.c().a(), $$2.d());
         aln $$5 = aln.a(this.ax, this.p);
         $$5.f().a(this);
         drt.a($$5, this);
         aum.a(false);
         this.aR = MinecraftServer.a((Function<Thread, gvd>)($$4x -> new gvd($$4x, this, $$0, $$1, $$2, $$5, $$0xx -> {
               arg $$1xx = arg.b($$0xx + 0);
               this.Y.set($$1xx);
               return arf.a($$1xx, this.bj::add);
            })));
         this.aT = true;
         this.a(gas.a());
         this.aQ.a(geq.c.a, $$0.f(), $$2.d().e());
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

      fnw $$9 = new fnw(this.Y.get());
      this.a($$9);
      this.bm.a("waitForServer");

      for (; !this.aR.aj() || this.bb != null; this.bl()) {
         $$9.e();
         this.c(false);

         try {
            Thread.sleep(16L);
         } catch (InterruptedException var10) {
         }
      }

      this.bm.c();
      Duration $$10 = Duration.between($$4, Instant.now());
      SocketAddress $$11 = this.aR.ai().a();
      wc $$12 = wc.a($$11);
      $$12.a($$11.toString(), 0, new fzm($$12, this, null, null, $$3, $$10, $$0x -> {
      }, null));
      $$12.a(new aja(this.X().c(), this.X().b()));
      this.aS = $$12;
   }

   public void a(fzn $$0) {
      fok $$1 = new fok(true);
      $$1.a(xe.c("connect.joining"));
      this.e($$1);
      this.r = $$0;
      this.b($$0);
      if (!this.aT) {
         aln $$2 = aln.a(this.ax, this.p);
         $$2.f().a(this);
         drt.a($$2, this);
         aum.a(false);
      }
   }

   public void y() {
      this.a(new fok(true), false);
   }

   public void b(fon $$0) {
      this.a($$0, false);
   }

   public void a(fon $$0, boolean $$1) {
      fzo $$2 = this.L();
      if ($$2 != null) {
         this.by();
         $$2.i();
         if (!$$1) {
            this.B();
         }
      }

      this.aK.b();
      if (this.bq.e()) {
         this.bq();
      }

      gvd $$3 = this.aR;
      this.aR = null;
      this.j.i();
      this.q = null;
      this.bw.b();
      this.bc = true;

      try {
         this.e($$0);
         if (this.r != null) {
            if ($$3 != null) {
               this.bm.a("waitForServer");

               while (!$$3.H()) {
                  this.c(false);
               }

               this.bm.c();
            }

            this.l.i();
            this.aT = false;
         }

         this.r = null;
         this.b(null);
         this.s = null;
      } finally {
         this.bc = false;
      }

      drt.b();
   }

   public void B() {
      this.al.i();
      this.bz();
   }

   public void c(fon $$0) {
      fzo $$1 = this.L();
      if ($$1 != null) {
         $$1.j();
      }

      if (this.bq.e()) {
         this.bq();
      }

      this.j.i();
      this.q = null;
      this.bw.b();
      this.bc = true;

      try {
         this.e($$0);
         this.l.i();
         this.r = null;
         this.b(null);
         this.s = null;
      } finally {
         this.bc = false;
      }

      drt.b();
   }

   private void e(fon $$0) {
      this.bm.a("forcedTick");
      this.ar.f();
      this.t = null;
      this.aS = null;
      this.a($$0);
      this.c(false);
      this.bm.c();
   }

   public void d(fon $$0) {
      this.bm.a("forcedTick");
      this.a($$0);
      this.c(false);
      this.bm.c();
   }

   private void b(@Nullable fzn $$0) {
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
      return ab.aX ? false : this.bC().flag(UserFlag.TELEMETRY_ENABLED);
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
      return this.J().a(false) ? this.aK.c($$0) : (this.s == null || !$$0.equals(this.s.cE())) && !$$0.equals(ad.e);
   }

   public fgj.a J() {
      if (this.m.m().c() == clw.c) {
         return fgj.a.b;
      } else if (!this.ai) {
         return fgj.a.c;
      } else {
         return !this.bC().flag(UserFlag.CHAT_ALLOWED) ? fgj.a.d : fgj.a.a;
      }
   }

   public final boolean K() {
      return this.ag;
   }

   @Nullable
   public fzo L() {
      return this.s == null ? null : this.s.h;
   }

   public static boolean M() {
      return !E.m.aa;
   }

   public static boolean N() {
      return E.m.j().c().a() >= fgc.b.a();
   }

   public static boolean O() {
      return !E.j.a() && E.m.j().c().a() >= fgc.c.a();
   }

   public static boolean P() {
      return E.m.k().c();
   }

   private void bD() {
      if (this.v != null && this.v.c() != ews.a.a) {
         boolean $$0 = this.s.gm().d;
         dqc $$1 = null;
         ews.a $$2 = this.v.c();
         cuh $$6;
         if ($$2 == ews.a.b) {
            ir $$3 = ((ewq)this.v).a();
            dtc $$4 = this.r.a_($$3);
            if ($$4.i()) {
               return;
            }

            dfc $$5 = $$4.b();
            $$6 = $$5.a((dcd)this.r, $$3, $$4);
            if ($$6.d()) {
               return;
            }

            if ($$0 && fon.r() && $$4.t()) {
               $$1 = this.r.c_($$3);
            }
         } else {
            if ($$2 != ews.a.c || !$$0) {
               return;
            }

            brv $$7 = ((ewr)this.v).a();
            $$6 = $$7.dH();
            if ($$6 == null) {
               return;
            }
         }

         if ($$6.d()) {
            String $$10 = "";
            if ($$2 == ews.a.b) {
               $$10 = lh.e.b(this.r.a_(((ewq)this.v).a()).b()).toString();
            } else if ($$2 == ews.a.c) {
               $$10 = lh.g.b(((ewr)this.v).a().ak()).toString();
            }

            F.warn("Picking on: [{}] {} gave null item", $$2, $$10);
         } else {
            clx $$11 = this.s.gl();
            if ($$1 != null) {
               this.a($$6, $$1, this.r.I_());
            }

            int $$12 = $$11.c($$6);
            if ($$0) {
               $$11.b($$6);
               this.q.a(this.s.b(bpz.a), 36 + $$11.k);
            } else if ($$12 != -1) {
               if (clx.d($$12)) {
                  $$11.k = $$12;
               } else {
                  this.q.a($$12);
               }
            }
         }
      }
   }

   private void a(cuh $$0, dqc $$1, jo $$2) {
      uk $$3 = $$1.b($$2);
      $$1.a($$3);
      csc.a($$0, $$1.r(), $$3);
      $$0.a($$1.s());
      $$0.a(ke.g, cxn.a, J, cxn::a);
   }

   public o d(o $$0) {
      ac $$1 = $$0.g();
      a($$1, this, this.an, this.ab, this.m);
      this.a($$0.a("Uptime"));
      if (this.r != null) {
         this.r.a($$0);
      }

      if (this.aR != null) {
         this.aR.b($$1);
      }

      this.br.a($$0);
      return $$0;
   }

   public static void a(@Nullable fgj $$0, @Nullable gsg $$1, String $$2, @Nullable fgn $$3, o $$4) {
      ac $$5 = $$4.g();
      a($$5, $$0, $$1, $$2, $$3);
   }

   private static String a(double $$0) {
      return String.format(Locale.ROOT, "%.3fs", $$0);
   }

   private void a(p $$0) {
      $$0.a("JVM uptime", () -> a((double)ManagementFactory.getRuntimeMXBean().getUptime() / 1000.0));
      $$0.a("Wall uptime", () -> a((double)(System.currentTimeMillis() - this.bC) / 1000.0));
      $$0.a("High-res time", () -> a((double)ad.b() / 1000.0));
      $$0.a("Client ticks", () -> String.format(Locale.ROOT, "%d ticks / %.3fs", this.bD, (double)this.bD / 20.0));
   }

   private static ac a(ac $$0, @Nullable fgj $$1, @Nullable gsg $$2, String $$3, @Nullable fgn $$4) {
      $$0.a("Launched Version", () -> $$3);
      String $$5 = bg();
      if ($$5 != null) {
         $$0.a("Launcher name", $$5);
      }

      $$0.a("Backend library", RenderSystem::getBackendDescription);
      $$0.a("Backend API", RenderSystem::getApiDescription);
      $$0.a("Window size", () -> $$1 != null ? $$1.R.k() + "x" + $$1.R.l() : "<not initialized>");
      $$0.a("GL Caps", RenderSystem::getCapsString);
      $$0.a("GL debug messages", () -> ezu.b() ? String.join("\n", ezu.a()) : "<disabled>");
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
      $$0.a("CPU", ezv::b);
      return $$0;
   }

   public static fgj Q() {
      return E;
   }

   public CompletableFuture<Void> R() {
      return this.a(this::l).thenCompose($$0 -> (CompletionStage<Void>)$$0);
   }

   public void a(gas $$0) {
      if (!this.by.a($$0)) {
         this.by = gav.a($$0, this.az);
      }
   }

   @Nullable
   public gab S() {
      return y.a(this.L(), fzo::x);
   }

   public boolean T() {
      return this.aT;
   }

   public boolean U() {
      return this.aT && this.aR != null;
   }

   @Nullable
   public gvd V() {
      return this.aR;
   }

   public boolean W() {
      gvd $$0 = this.V();
      return $$0 != null && !$$0.r();
   }

   public boolean b(UUID $$0) {
      return $$0.equals(this.X().b());
   }

   public fgy X() {
      return this.X;
   }

   public GameProfile Y() {
      ProfileResult $$0 = this.N.join();
      return $$0 != null ? $$0.profile() : new GameProfile(this.X.b(), this.X.c());
   }

   public Proxy Z() {
      return this.ad;
   }

   public gqz aa() {
      return this.O;
   }

   public aud ab() {
      return this.aj;
   }

   public ato ac() {
      return this.am;
   }

   public ast ad() {
      return this.ak;
   }

   public gto ae() {
      return this.al;
   }

   public Path af() {
      return this.M;
   }

   public gsg ag() {
      return this.an;
   }

   public Function<akt, gqy> a(akt $$0) {
      return this.aC.a($$0)::a;
   }

   public boolean ah() {
      return this.af;
   }

   public boolean ai() {
      return this.aW;
   }

   public gfa aj() {
      return this.av;
   }

   public gvq ak() {
      return this.ar;
   }

   public avl al() {
      avl $$0 = y.a(this.y, fon::aL_);
      if ($$0 != null) {
         return $$0;
      } else if (this.s != null) {
         if (this.s.dU().af() == dca.j) {
            return this.l.j().b() ? avm.d : avm.e;
         } else {
            ja<dcz> $$1 = this.s.dU().t(this.s.du());
            if (!this.as.c(avm.f) && (!this.s.bn() || !$$1.a(awd.ad))) {
               return this.s.dU().af() != dca.i && this.s.gm().d && this.s.gm().c ? avm.b : $$1.a().o().orElse(avm.g);
            } else {
               return avm.f;
            }
         }
      } else {
         return avm.a;
      }
   }

   public MinecraftSessionService am() {
      return this.ay;
   }

   public grz an() {
      return this.aB;
   }

   @Nullable
   public brv ao() {
      return this.t;
   }

   public void a(brv $$0) {
      this.t = $$0;
      this.j.a($$0);
   }

   public boolean b(brv $$0) {
      return $$0.cl() || this.s != null && this.s.O_() && this.m.T.e() && $$0.ak() == bsb.bE;
   }

   @Override
   protected Thread az() {
      return this.bd;
   }

   @Override
   protected Runnable f(Runnable $$0) {
      return $$0;
   }

   @Override
   protected boolean e(Runnable $$0) {
      return true;
   }

   public gga ap() {
      return this.aD;
   }

   public gko aq() {
      return this.U;
   }

   public ghf ar() {
      return this.aM;
   }

   public glp as() {
      return this.V;
   }

   public <T> guz<T> a(guy.a<T> $$0) {
      return this.W.a($$0);
   }

   public <T> void a(guy.a<T> $$0, List<T> $$1) {
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

   public fhn aw() {
      return this.ao;
   }

   public boolean ax() {
      return this.s != null && this.s.gD() || this.m.V().c();
   }

   public fkx aA() {
      return this.aI;
   }

   public gwt aB() {
      return this.aJ;
   }

   public boolean aC() {
      return this.bi;
   }

   public fgf aD() {
      return this.Z;
   }

   public gtf aE() {
      return this.aC;
   }

   public grx aF() {
      return this.aE;
   }

   public grw aG() {
      return this.aF;
   }

   public grv aH() {
      return this.aG;
   }

   public fib aI() {
      return this.aH;
   }

   @Override
   public void a(boolean $$0) {
      this.bi = $$0;
   }

   public xe a(File $$0, int $$1, int $$2) {
      int $$3 = this.R.k();
      int $$4 = this.R.l();
      ezo $$5 = new ezp($$1, $$2, true, a);
      float $$6 = this.s.dM();
      float $$7 = this.s.dK();
      float $$8 = this.s.Q;
      float $$9 = this.s.P;
      this.j.b(false);

      xs var12;
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

            this.s.P = this.s.dK();
            this.s.Q = this.s.dM();
            $$5.a(true);
            this.j.a(1.0F, 0L);

            try {
               Thread.sleep(10L);
            } catch (InterruptedException var17) {
            }

            fgu.a($$0, "panorama_" + $$10 + ".png", $$5, $$0x -> {
            });
         }

         xe $$11 = xe.b($$0.getName()).a(n.t).a($$1x -> $$1x.a(new xc(xc.a.b, $$0.getAbsolutePath())));
         return xe.a("screenshot.success", $$11);
      } catch (Exception var18) {
         F.error("Couldn't save image", var18);
         var12 = xe.a("screenshot.failure", var18.getMessage());
      } finally {
         this.s.s($$6);
         this.s.r($$7);
         this.s.Q = $$8;
         this.s.P = $$9;
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

   private xe a(File $$0, int $$1, int $$2, int $$3, int $$4) {
      try {
         ByteBuffer $$5 = ezv.a($$1 * $$2 * 3);
         fgu $$6 = new fgu($$0, $$3, $$4, $$2);
         float $$7 = (float)$$3 / (float)$$1;
         float $$8 = (float)$$4 / (float)$$2;
         float $$9 = $$7 > $$8 ? $$7 : $$8;

         for (int $$10 = ($$4 - 1) / $$2 * $$2; $$10 >= 0; $$10 -= $$2) {
            for (int $$11 = 0; $$11 < $$3; $$11 += $$1) {
               RenderSystem.setShaderTexture(0, gqx.e);
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
         ezv.a($$5);
         xe $$15 = xe.b($$14.getName()).a(n.t).a($$1x -> $$1x.a(new xc(xc.a.b, $$14.getAbsolutePath())));
         return xe.a("screenshot.success", $$15);
      } catch (Exception var15) {
         F.warn("Couldn't save screenshot", var15);
         return xe.a("screenshot.failure", var15.getMessage());
      }
   }

   public bmo aJ() {
      return this.bm;
   }

   @Nullable
   public arg aK() {
      return this.Y.get();
   }

   public gsa aL() {
      return this.au;
   }

   @Nullable
   public fog aM() {
      return this.bb;
   }

   public fsz aN() {
      return this.aK;
   }

   public boolean aO() {
      return false;
   }

   public fag aP() {
      return this.R;
   }

   public fiv aQ() {
      return this.l.k();
   }

   public gfm aR() {
      return this.T;
   }

   public void b(int $$0) {
      this.aC.a($$0);
   }

   public fyo aS() {
      return this.aL;
   }

   public boolean aT() {
      return this.bC().flag(UserFlag.PROFANITY_FILTER_ENABLED);
   }

   public void aU() {
      this.aK.a();
      this.w().a();
   }

   public fgr aV() {
      return this.bv;
   }

   @Nullable
   public ayy aW() {
      return ayy.a(this.ax.getServicesKeySet(), ServicesKeyType.PROFILE_KEY);
   }

   public boolean aX() {
      return !this.ax.getServicesKeySet().keys(ServicesKeyType.PROFILE_KEY).isEmpty();
   }

   public fgg aY() {
      return this.aa;
   }

   public void a(fgg $$0) {
      this.aa = $$0;
   }

   public fgb aZ() {
      return this.bw;
   }

   public gag ba() {
      return this.bx;
   }

   public gav bb() {
      return this.by;
   }

   public fdi bc() {
      return this.aP;
   }

   public geq bd() {
      return this.aQ;
   }

   public ffy be() {
      return this.bz;
   }

   public ewk bf() {
      return this.bA;
   }

   private float a(float $$0) {
      if (this.r != null) {
         bql $$1 = this.r.s();
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
      a(xd.a) {
         @Override
         public boolean a(boolean $$0) {
            return true;
         }
      },
      b(xe.c("chat.disabled.options").a(n.m)) {
         @Override
         public boolean a(boolean $$0) {
            return false;
         }
      },
      c(xe.c("chat.disabled.launcher").a(n.m)) {
         @Override
         public boolean a(boolean $$0) {
            return $$0;
         }
      },
      d(xe.a("chat.disabled.profile", xe.d(fgj.E.m.K.h())).a(n.m)) {
         @Override
         public boolean a(boolean $$0) {
            return $$0;
         }
      };

      static final xe e = xe.c("chat.disabled.profile.moreInfo");
      private final xe f;

      a(xe $$0) {
         this.f = $$0;
      }

      public xe a() {
         return this.f;
      }

      public abstract boolean a(boolean var1);
   }

   static record b(fbs a, fuf.c b) {
   }
}
