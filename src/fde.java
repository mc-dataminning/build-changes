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

public class fde extends bog<Runnable> implements exc {
   static fde E;
   private static final Logger F = LogUtils.getLogger();
   public static final boolean a = ac.j() == ac.a.d;
   private static final int G = 10;
   public static final akh b = new akh("default");
   public static final akh c = new akh("uniform");
   public static final akh d = new akh("alt");
   private static final akh H = new akh("regional_compliancies.json");
   private static final CompletableFuture<azb> I = CompletableFuture.completedFuture(azb.a);
   private static final wu J = wu.b("(+NBT)");
   private static final wu K = wu.c("multiplayer.socialInteractions.not_available");
   public static final String e = "Please make sure you have up-to-date drivers (see aka.ms/mcdriver for instructions).";
   private final long L = Double.doubleToLongBits(Math.PI);
   private final Path M;
   private final CompletableFuture<ProfileResult> N;
   private final gmz O;
   private final DataFixer P;
   private final gcg Q;
   private final exb R;
   private final fdr S = new fdr(20.0F, 0L, this::a);
   private final gbu T;
   public final gbm f;
   private final ggv U;
   private final ghv V;
   public final fze g;
   private final gqy W = new gqy();
   private final fdt X;
   public final fep h;
   public final fep i;
   public final gbh j;
   public final gfa k;
   private final AtomicReference<aqu> Y = new AtomicReference<>();
   public final feq l;
   public final fdi m;
   private final fda Z;
   public final fdf n;
   public final fdd o;
   private fdb aa = fdb.a;
   public final File p;
   private final String ab;
   private final String ac;
   private final Proxy ad;
   private final eob ae;
   private final boolean af;
   private final boolean ag;
   private final boolean ah;
   private final boolean ai;
   private final ato aj;
   private final ash ak;
   private final gpo al;
   private final atc am;
   private final gog an;
   private final fei ao;
   private final fem ap;
   private final ewj aq;
   private final grq ar;
   private final grl as;
   private final fht at;
   private final goa au;
   private final gbi av;
   private final fdk aw = new fdk(H, fde::b);
   private final YggdrasilAuthenticationService ax;
   private final MinecraftSessionService ay;
   private final UserApiService az;
   private final CompletableFuture<UserProperties> aA;
   private final gnz aB;
   private final gpf aC;
   private final gci aD;
   private final gnx aE;
   private final gnw aF;
   private final gnv aG;
   private final fes aH;
   private final fho aI;
   private final gst aJ;
   private final fpl aK;
   private final fux aL;
   private final gdn aM;
   private final gru aN;
   private final fwi aO;
   private final fad aP;
   private final gay aQ;
   @Nullable
   public fwf q;
   @Nullable
   public fvw r;
   @Nullable
   public gaq s;
   @Nullable
   private grd aR;
   @Nullable
   private vs aS;
   private boolean aT;
   @Nullable
   public brh t;
   @Nullable
   public brh u;
   @Nullable
   public etn v;
   private int aU;
   protected int w;
   private volatile boolean aV;
   private float aW;
   private long aX = ac.c();
   private long aY;
   private int aZ;
   public boolean x;
   @Nullable
   public fld y;
   @Nullable
   private fkx ba;
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
   private fhp bk;
   private bma bl = blx.a;
   private int bm;
   private final blu bn = new blu(ac.c, () -> this.bm);
   @Nullable
   private blz bo;
   private bno bp = bnn.a;
   private final fdo bq = new fdo();
   private long br;
   private double bs;
   @Nullable
   private exq.a bt;
   private final fdm bu;
   private final fcw bv;
   private final fwp bw;
   private fxe bx;
   private final fct by;
   private final etf bz;
   private boolean bA;
   private final long bB;
   private long bC;
   private String bD = "root";

   public fde(fqr $$0) {
      super("Client");
      E = this;
      this.bB = System.currentTimeMillis();
      this.p = $$0.c.a;
      File $$1 = $$0.c.c;
      this.M = $$0.c.b.toPath();
      this.ab = $$0.d.b;
      this.ac = $$0.d.c;
      Path $$2 = this.p.toPath();
      this.bz = eob.a($$2.resolve("allowed_symlinks.txt"));
      gnp $$3 = new gnp($$0.c.a(), this.bz);
      this.al = new gpo(this, $$2.resolve("downloads"), $$0.a);
      ate $$4 = new asx(this.M, asf.a, atd.b, this.bz);
      this.am = new atc($$3, this.al.a(), $$4);
      this.ak = $$3.a();
      this.ad = $$0.a.d;
      this.ax = new YggdrasilAuthenticationService(this.ad);
      this.ay = this.ax.createMinecraftSessionService();
      this.X = $$0.a.a;
      this.N = CompletableFuture.supplyAsync(() -> this.ay.fetchProfile(this.X.b(), true), ac.h());
      this.az = this.a(this.ax, $$0);
      this.aA = CompletableFuture.supplyAsync(() -> {
         try {
            return this.az.fetchProperties();
         } catch (AuthenticationException var2x) {
            F.error("Failed to fetch user properties", var2x);
            return UserApiService.OFFLINE_PROPERTIES;
         }
      }, ac.h());
      F.info("Setting user: {}", this.X.c());
      F.debug("(Session ID is {})", this.X.a());
      this.ag = $$0.d.a;
      this.ah = !$$0.d.d;
      this.ai = !$$0.d.e;
      this.af = bk();
      this.aR = null;
      xz.a(fdc::a);
      this.P = azg.a();
      this.aI = new fho(this);
      this.bc = Thread.currentThread();
      this.m = new fdi(this, this.p);
      RenderSystem.setShaderGlintAlpha(this.m.an().c());
      this.bd = true;
      this.aJ = new gst(this, this.m);
      this.Z = new fda($$2, this.P);
      F.info("Backend library: {}", RenderSystem.getBackendDescription());
      ewo $$5;
      if (this.m.p > 0 && this.m.o > 0) {
         $$5 = new ewo(this.m.o, this.m.p, $$0.b.c, $$0.b.d, $$0.b.e);
      } else {
         $$5 = $$0.b;
      }

      ac.c = RenderSystem.initBackendSystem();
      this.Q = new gcg(this);
      this.R = this.Q.a($$5, this.m.k, this.bh());
      this.a(true);
      gsf.a.b(gsb.A);

      try {
         this.R.a(this.ak, aa.b().g() ? ewr.a : ewr.b);
      } catch (IOException var13) {
         F.error("Couldn't set icon", var13);
      }

      this.R.a(this.m.h().c());
      this.n = new fdf(this);
      this.n.a(this.R.i());
      this.o = new fdd(this);
      this.o.a(this.R.i());
      RenderSystem.initRenderer(this.m.u, false);
      this.aq = new ewg(this.R.k(), this.R.l());
      this.aq.a(0.0F, 0.0F, 0.0F, 0.0F);
      this.aq.b(a);
      this.aj = new ato(asf.a);
      this.am.a();
      this.m.b(this.am);
      this.an = new gog(this.m.ad);
      this.aj.a(this.an);
      this.O = new gmz(this.aj);
      this.aj.a(this.O);
      this.aB = new gnz(this.O, $$1.toPath().resolve("skins"), this.ay, this);
      this.ae = new eob($$2.resolve("saves"), $$2.resolve("backups"), this.bz, this.P);
      this.by = new fct($$2);
      this.ar = new grq(this.m);
      this.aj.a(this.ar);
      this.au = new goa(this.X);
      this.aj.a(this.au);
      this.as = new grl(this);
      this.at = new fht(this.O);
      this.h = this.at.a();
      this.i = this.at.b();
      this.aj.a(this.at);
      this.g();
      this.aj.a(new gns());
      this.aj.a(new gnr());
      this.R.a("Startup");
      RenderSystem.setupDefaultState(0, 0, this.R.k(), this.R.l());
      this.R.a("Post startup");
      this.ao = fei.a();
      this.ap = fem.a(this.ao);
      this.aC = new gpf(this.O, this.ao, this.m.C().c());
      this.aj.a(this.aC);
      this.aL = new fux();
      this.aj.a(this.aL);
      this.aM = new gdn(this.h, this.aL, this::ap, this::as, this::aq);
      this.aj.a(this.aM);
      gbb $$8 = new gbb(this.aM, this.aL);
      this.aj.a($$8);
      this.V = new ghv(this, this.O, this.aC, this.ap, $$8);
      this.aj.a(this.V);

      try {
         int $$9 = Runtime.getRuntime().availableProcessors();
         int $$10 = this.ah() ? $$9 : Math.min($$9, 4);
         exz.a();
         this.T = new gbu($$10);
      } catch (OutOfMemoryError var12) {
         TinyFileDialogs.tinyfd_messageBox(
            "Minecraft",
            "Oh no! The game was unable to allocate memory off-heap while trying to start. You may try to free some memory by closing other applications on your computer, check that your system meets the minimum requirements, and try again. If the problem persists, please visit: https://aka.ms/Minecraft-Support",
            "ok",
            "error",
            true
         );
         throw new fqs("Unable to allocate render buffers", var12);
      }

      this.aK = new fpl(this, this.az);
      this.aD = new gci(this.aC.b(), $$8, this.ao);
      this.aj.a(this.aD);
      this.U = new ggv(this, this.O, this.V, this.aD, this.h, this.m, this.aL);
      this.aj.a(this.U);
      this.g = new fze(this.r, this.O);
      this.aj.a(this.g);
      this.aE = new gnx(this.O);
      this.aj.a(this.aE);
      this.aF = new gnw(this.O);
      this.aj.a(this.aF);
      this.aG = new gnv(this.O);
      this.aj.a(this.aG);
      this.aH = new fes(this.O);
      this.aj.a(this.aH);
      this.j = new gbh(this, this.U.d(), this.aj, this.T);
      this.aj.a(this.j.e());
      this.f = new gbm(this, this.U, this.aM, this.T);
      this.aj.a(this.f);
      this.bj();
      this.aj.a(this.W);
      this.av = new gbi();
      this.aj.a(this.av);
      this.aj.a(this.aw);
      this.l = new feq(this);
      this.k = new gfa(this);
      eyn $$12 = eyn.a(this);
      this.aP = new fad($$12);
      RenderSystem.setErrorCallback(this::a);
      if (this.aq.c != this.R.k() || this.aq.d != this.R.l()) {
         StringBuilder $$13 = new StringBuilder(
            "Recovering from unsupported resolution ("
               + this.R.k()
               + "x"
               + this.R.l()
               + ").\nPlease make sure you have up-to-date drivers (see aka.ms/mcdriver for instructions)."
         );
         if (ewp.b()) {
            $$13.append("\n\nReported GL debug messages:\n").append(String.join("\n", ewp.a()));
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
      this.aN = new gru(this, this.az, this.X);
      this.aO = fwi.a(this.az, this.X, $$2);
      this.bu = new fdm(this);
      this.bv = new fcw(this);
      this.bv.a(this.m.as().c() != fdg.a);
      this.bw = new fwp(this);
      this.bw.a(this.m.A().c());
      this.bx = fxe.a(fxb.a(), this.az);
      fkp.a(this);
      this.a(new fkj(wu.c("gui.loadingMinecraft")));
      List<asd> $$14 = this.am.g();
      this.bq.a(fdo.b.a, $$14);
      atn $$15 = this.aj.a(ac.f(), this, I, $$14);
      gsf.a.a(gsb.C);
      fde.b $$16 = new fde.b($$12, $$0.e);
      this.a(new fkp(this, $$15, $$1x -> ac.a($$1x, $$1xx -> this.a($$1xx, $$16), () -> {
            if (aa.aX) {
               this.bm();
            }

            this.bq.a();
            this.a($$16);
         }), false));
      this.aQ = gay.a($$0.e.b());
   }

   private void a(@Nullable fde.b $$0) {
      if (!this.bA) {
         this.bA = true;
         this.b($$0);
      }
   }

   private void b(@Nullable fde.b $$0) {
      Runnable $$1 = this.c($$0);
      gsf.a.b(gsb.C);
      gsf.a.b(gsb.z);
      gsf.a.a(this.aN.a());
      $$1.run();
   }

   public boolean c() {
      return this.bA;
   }

   private Runnable c(@Nullable fde.b $$0) {
      List<Function<Runnable, fld>> $$1 = new ArrayList<>();
      this.a($$1);
      Runnable $$2 = () -> {
         if ($$0 != null && $$0.b().a()) {
            gax.a(this, $$0.b(), $$0.a());
         } else {
            this.a(new fli(true));
         }
      };

      for (Function<Runnable, fld> $$3 : Lists.reverse($$1)) {
         fld $$4 = $$3.apply($$2);
         $$2 = () -> this.a($$4);
      }

      return $$2;
   }

   private void a(List<Function<Runnable, fld>> $$0) {
      if (this.m.ae) {
         $$0.add($$0x -> new fjn(this.m, $$0x));
      }

      BanDetails $$1 = this.H();
      if ($$1 != null) {
         $$0.add($$1x -> fjr.a($$1xx -> {
               if ($$1xx) {
                  ac.j().a("https://aka.ms/mcjavamoderation");
               }

               $$1x.run();
            }, $$1));
      }

      ProfileResult $$2 = this.N.join();
      if ($$2 != null) {
         GameProfile $$3 = $$2.profile();
         Set<ProfileActionType> $$4 = $$2.actions();
         if ($$4.contains(ProfileActionType.FORCED_NAME_CHANGE)) {
            $$0.add($$1x -> fjr.a($$3.getName(), $$1x));
         }

         if ($$4.contains(ProfileActionType.USING_BANNED_SKIN)) {
            $$0.add(fjr::a);
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
      fvx $$1 = this.L();
      if ($$1 != null && $$1.l().i()) {
         $$0.append(" - ");
         fwk $$2 = this.S();
         if (this.aR != null && !this.aR.r()) {
            $$0.append(goe.a("title.singleplayer"));
         } else if ($$2 != null && $$2.e()) {
            $$0.append(goe.a("title.multiplayer.realms"));
         } else if (this.aR == null && ($$2 == null || !$$2.d())) {
            $$0.append(goe.a("title.multiplayer.other"));
         } else {
            $$0.append(goe.a("title.multiplayer.lan"));
         }
      }

      return $$0.toString();
   }

   private UserApiService a(YggdrasilAuthenticationService $$0, fqr $$1) {
      return $$0.createUserApiService($$1.a.a.d());
   }

   public static axy e() {
      return axy.a("vanilla", ClientBrandRetriever::getClientModName, "Client", fde.class);
   }

   private void a(Throwable $$0, @Nullable fde.b $$1) {
      if (this.am.d().size() > 1) {
         this.a($$0, null, $$1);
      } else {
         ac.a($$0);
      }
   }

   public void a(Throwable $$0, @Nullable wu $$1, @Nullable fde.b $$2) {
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

      this.a(new fli());
      this.a(null);
   }

   private void a(@Nullable wu $$0) {
      fho $$1 = this.aA();
      fhm.b($$1, fhm.a.c, wu.c("resourcePack.load_fail"), $$0);
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
               bmd $$1 = bmd.a("Renderer");
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
               this.a(new fkw());
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
            gqy.a,
            $$0 -> new gqr<>(
                  $$0x -> $$0x.a(null, cuq.a.a.c()).stream().map($$0xx -> n.a($$0xx.getString()).trim()).filter($$0xx -> !$$0xx.isEmpty()),
                  $$0x -> Stream.of(ld.h.b($$0x.f())),
                  $$0
               )
         );
      this.W.a(gqy.b, $$0 -> new gqs<>($$0x -> $$0x.h().map(awg::b), $$0));
      this.W
         .a(
            gqy.c,
            $$0 -> new gqr<>(
                  $$0x -> $$0x.e()
                        .stream()
                        .flatMap($$1 -> $$1.b().a($$0x.a()).a(null, cuq.a.a).stream())
                        .map($$0xx -> n.a($$0xx.getString()).trim())
                        .filter($$0xx -> !$$0xx.isEmpty()),
                  $$0x -> $$0x.e().stream().map($$1 -> ld.h.b($$1.b().a($$0x.a()).f())),
                  $$0
               )
         );
      crl.e().a($$0 -> {
         this.a(gqy.a, $$0);
         this.a(gqy.b, $$0);
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

   public ewj h() {
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

   public static void a(@Nullable fde $$0, File $$1, o $$2) {
      File $$3 = new File($$1, "crash-reports");
      File $$4 = new File($$3, "crash-" + ac.e() + "-client.txt");
      akj.a($$2.e());
      if ($$0 != null) {
         $$0.ar.h();
      }

      if ($$2.f() != null) {
         akj.a("#@!@# Game crashed! Crash report saved to: #@!@# " + $$2.f());
         System.exit(-1);
      } else if ($$2.a($$4)) {
         akj.a("#@!@# Game crashed! Crash report saved to: #@!@# " + $$4.getAbsolutePath());
         System.exit(-1);
      } else {
         akj.a("#@?@# Game crashed! Crash report could not be saved. #@?@#");
         System.exit(-2);
      }
   }

   public boolean k() {
      return this.m.P().c();
   }

   public CompletableFuture<Void> l() {
      return this.a(false, null);
   }

   private CompletableFuture<Void> a(boolean $$0, @Nullable fde.b $$1) {
      if (this.bj != null) {
         return this.bj;
      } else {
         CompletableFuture<Void> $$2 = new CompletableFuture<>();
         if (!$$0 && this.ba instanceof fkp) {
            this.bj = $$2;
            return $$2;
         } else {
            this.am.a();
            List<asd> $$3 = this.am.g();
            if (!$$0) {
               this.bq.a(fdo.b.b, $$3);
            }

            this.a(new fkp(this, this.aj.a(ac.f(), this, I, $$3), $$3x -> ac.a($$3x, $$2xx -> {
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
      gch $$1 = this.ap().a();
      goz $$2 = $$1.a().a();

      for (dde $$3 : ld.e) {
         UnmodifiableIterator $$10 = $$3.l().a().iterator();

         while ($$10.hasNext()) {
            dqh $$4 = (dqh)$$10.next();
            if ($$4.l() == djk.c) {
               goz $$5 = $$1.b($$4);
               if ($$5 == $$2) {
                  F.debug("Missing model for: {}", $$4);
                  $$0 = true;
               }
            }
         }
      }

      gmy $$6 = $$2.e();

      for (dde $$7 : ld.e) {
         UnmodifiableIterator var17 = $$7.l().a().iterator();

         while (var17.hasNext()) {
            dqh $$8 = (dqh)var17.next();
            gmy $$9 = $$1.a($$8);
            if (!$$8.i() && $$9 == $$6) {
               F.debug("Missing particle icon for: {}", $$8);
            }
         }
      }

      for (csu $$10 : ld.h) {
         csz $$11 = $$10.v();
         String $$12 = $$11.s();
         String $$13 = wu.c($$12).getString();
         if ($$13.toLowerCase(Locale.ROOT).equals($$10.a())) {
            F.debug("Missing translation for: {} {} {}", new Object[]{$$11, $$12, $$10});
         }
      }

      $$0 |= fkq.a();
      $$0 |= ggy.a();
      if ($$0) {
         throw new IllegalStateException("Your game data is foobar, fix the errors above!");
      }
   }

   public eob m() {
      return this.ae;
   }

   private void a(String $$0) {
      fde.a $$1 = this.J();
      if (!$$1.a(this.T())) {
         if (this.l.b()) {
            this.l.b(false);
            this.a(new fju($$0x -> {
               if ($$0x) {
                  ac.j().a("https://aka.ms/JavaAccountSettings");
               }

               this.a(null);
            }, fde.a.e, "https://aka.ms/JavaAccountSettings", true));
         } else {
            wu $$2 = $$1.a();
            this.l.a($$2, false);
            this.bv.c($$2);
            this.l.b($$1 == fde.a.d);
         }
      } else {
         this.a(new fjt($$0));
      }
   }

   public void a(@Nullable fld $$0) {
      if (aa.aX && Thread.currentThread() != this.bc) {
         F.error("setScreen called from non-game thread");
      }

      if (this.y != null) {
         this.y.j();
      } else {
         this.a(fdb.a);
      }

      if ($$0 == null && this.bb) {
         throw new IllegalStateException("Trying to return to in-game GUI during disconnection");
      } else {
         if ($$0 == null && this.r == null) {
            $$0 = new fli();
         } else if ($$0 == null && this.s.ez()) {
            if (this.s.o()) {
               $$0 = new fkb(null, this.r.k().l());
            } else {
               this.s.fY();
            }
         }

         this.y = $$0;
         if (this.y != null) {
            this.y.aF_();
         }

         ext.a();
         if ($$0 != null) {
            this.n.j();
            fdc.b();
            $$0.b(this, this.R.o(), this.R.p());
            this.x = false;
         } else {
            this.ar.i();
            this.n.i();
         }

         this.d();
      }
   }

   public void a(@Nullable fkx $$0) {
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
         fif.b();
         ac.i();
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
      long $$1 = ac.c();
      if (this.R.b()) {
         this.q();
      }

      if (this.bj != null && !(this.ba instanceof fkp)) {
         CompletableFuture<Void> $$2 = this.bj;
         this.bj = null;
         this.l().thenRun(() -> $$2.complete(null));
      }

      Runnable $$3;
      while (($$3 = this.bi.poll()) != null) {
         $$3.run();
      }

      if ($$0) {
         int $$4 = this.S.a(ac.b());
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
      long $$6 = ac.c();
      boolean $$8;
      if (!this.aQ().d() && !this.bp.e()) {
         $$8 = false;
         this.bs = 0.0;
      } else {
         $$8 = this.bt == null || this.bt.b();
         if ($$8) {
            exq.a().ifPresent(exq::b);
         }
      }

      RenderSystem.clear(16640, a);
      this.aq.a(true);
      gbg.a();
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
         fer $$9 = new fer(this, this.T.c());
         this.a($$9, this.bo);
         $$9.e();
         this.bl.c();
      }

      this.bl.a("blit");
      this.aq.e();
      this.aq.a(this.R.k(), this.R.l());
      this.bg = ac.c() - $$6;
      if ($$8) {
         exq.a().ifPresent($$0x -> this.bt = $$0x.c());
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

      long $$12 = ac.c();
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

      while (ac.b() >= this.aY + 1000L) {
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
            this.m.i().c() == fcs.a ? "" : (this.m.i().c() == fcs.b ? " fast-clouds" : " fancy-clouds"),
            this.m.E().c(),
            $$14
         );
         this.aY += 1000L;
         this.aZ = 0;
      }

      this.bl.c();
   }

   private bma a(boolean $$0, @Nullable bmd $$1) {
      if (!$$0) {
         this.bn.b();
         if (!this.bp.e() && $$1 == null) {
            return blx.a;
         }
      }

      bma $$2;
      if ($$0) {
         if (!this.bn.a()) {
            this.bm = 0;
            this.bn.c();
         }

         this.bm++;
         $$2 = this.bn.d();
      } else {
         $$2 = blx.a;
      }

      if (this.bp.e()) {
         $$2 = bma.a($$2, this.bp.f());
      }

      return bmd.a($$2, $$1);
   }

   private void b(boolean $$0, @Nullable bmd $$1) {
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

      ewj $$1 = this.h();
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
         axx.b();
         this.f.p();
      } catch (Throwable var3) {
      }

      try {
         System.gc();
         if (this.aT && this.aR != null) {
            this.aR.a(true);
         }

         this.b((fld)(new fkj(wu.c("menu.savingLevel"))));
      } catch (Throwable var2) {
      }

      System.gc();
   }

   public boolean a(Consumer<wu> $$0) {
      if (this.bp.e()) {
         this.bp();
         return false;
      } else {
         Consumer<blz> $$1 = $$1x -> {
            if ($$1x != blv.a) {
               int $$2x = $$1x.f();
               double $$3x = (double)$$1x.g() / (double)ayy.a;
               this.execute(
                  () -> $$0.accept(
                        wu.a("commands.debug.stopped", String.format(Locale.ROOT, "%.2f", $$3x), $$2x, String.format(Locale.ROOT, "%.2f", (double)$$2x / $$3x))
                     )
               );
            }
         };
         Consumer<Path> $$2 = $$1x -> {
            wu $$2x = wu.b($$1x.toString()).a(n.t).a($$1xx -> $$1xx.a(new ws(ws.a.b, $$1x.toFile().getParent())));
            this.execute(() -> $$0.accept(wu.a("debug.profiling.stop", $$2x)));
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
            CompletableFuture.allOf($$6, $$7).thenRunAsync(() -> $$4.accept(ImmutableList.of($$6.join(), $$7.join())), ac.g());
            this.aR.a($$0x -> {
            }, $$7::complete);
            $$5 = $$6::complete;
         }

         this.bp = bnm.a(new gav(ac.c, this.f), ac.c, ac.g(), new bns("client"), $$1x -> {
            this.bp = bnn.a;
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
         fwk $$3 = this.S();
         $$2 = $$3 != null ? $$3.a : "unknown";
      }

      Path $$7;
      try {
         String $$5 = String.format(Locale.ROOT, "%s-%s-%s", ac.e(), $$2, aa.b().b());
         String $$6 = v.a(bns.a, $$5, ".zip");
         $$7 = bns.a.resolve($$6);
      } catch (IOException var21) {
         throw new UncheckedIOException(var21);
      }

      try (axk $$10 = new axk($$7)) {
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
         List<bmc> $$1 = this.bo.a(this.bD);
         if (!$$1.isEmpty()) {
            bmc $$2 = $$1.remove(0);
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

   private void a(fer $$0, blz $$1) {
      List<bmc> $$2 = $$1.a(this.bD);
      bmc $$3 = $$2.remove(0);
      RenderSystem.clear(256, a);
      RenderSystem.setShader(gbh::q);
      Matrix4f $$4 = new Matrix4f().setOrtho(0.0F, (float)this.R.k(), (float)this.R.l(), 0.0F, 1000.0F, 3000.0F);
      RenderSystem.setProjectionMatrix($$4, eyf.b);
      Matrix4fStack $$5 = RenderSystem.getModelViewStack();
      $$5.pushMatrix();
      $$5.translation(0.0F, 0.0F, -2000.0F);
      RenderSystem.applyModelViewMatrix();
      RenderSystem.lineWidth(1.0F);
      exz $$6 = exz.b();
      exs $$7 = $$6.d();
      int $$8 = 160;
      int $$9 = this.R.k() - 160 - 10;
      int $$10 = this.R.l() - 320;
      RenderSystem.enableBlend();
      $$7.a(eyc.b.h, exv.n);
      $$7.a((double)((float)$$9 - 176.0F), (double)((float)$$10 - 96.0F - 16.0F), 0.0).a(200, 0, 0, 0).e();
      $$7.a((double)((float)$$9 - 176.0F), (double)($$10 + 320), 0.0).a(200, 0, 0, 0).e();
      $$7.a((double)((float)$$9 + 176.0F), (double)($$10 + 320), 0.0).a(200, 0, 0, 0).e();
      $$7.a((double)((float)$$9 + 176.0F), (double)((float)$$10 - 96.0F - 16.0F), 0.0).a(200, 0, 0, 0).e();
      $$6.c();
      RenderSystem.disableBlend();
      double $$11 = 0.0;

      for (bmc $$12 : $$2) {
         int $$13 = axz.a($$12.a / 4.0) + 1;
         $$7.a(eyc.b.g, exv.n);
         int $$14 = $$12.a();
         int $$15 = $$14 >> 16 & 0xFF;
         int $$16 = $$14 >> 8 & 0xFF;
         int $$17 = $$14 & 0xFF;
         $$7.a((double)$$9, (double)$$10, 0.0).a($$15, $$16, $$17, 255).e();

         for (int $$18 = $$13; $$18 >= 0; $$18--) {
            float $$19 = (float)(($$11 + $$12.a * (double)$$18 / (double)$$13) * (float) (Math.PI * 2) / 100.0);
            float $$20 = axz.a($$19) * 160.0F;
            float $$21 = axz.b($$19) * 160.0F * 0.5F;
            $$7.a((double)((float)$$9 + $$20), (double)((float)$$10 - $$21), 0.0).a($$15, $$16, $$17, 255).e();
         }

         $$6.c();
         $$7.a(eyc.b.f, exv.n);

         for (int $$22 = $$13; $$22 >= 0; $$22--) {
            float $$23 = (float)(($$11 + $$12.a * (double)$$22 / (double)$$13) * (float) (Math.PI * 2) / 100.0);
            float $$24 = axz.a($$23) * 160.0F;
            float $$25 = axz.b($$23) * 160.0F * 0.5F;
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
      String $$27 = blz.b($$3.d);
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
         bmc $$31 = $$2.get($$30);
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
            this.a(new fky(!$$0));
            this.ar.e();
         } else {
            this.a(new fky(true));
         }
      }
   }

   private void d(boolean $$0) {
      if (!$$0) {
         this.w = 0;
      }

      if (this.w <= 0 && !this.s.ft()) {
         if ($$0 && this.v != null && this.v.c() == etn.a.b) {
            etl $$1 = (etl)this.v;
            in $$2 = $$1.a();
            if (!this.r.a_($$2).i()) {
               is $$3 = $$1.b();
               if (this.q.b($$2, $$3)) {
                  this.g.a($$2, $$3);
                  this.s.a(bpl.a);
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
         csz $$0 = this.s.b(bpl.a);
         if (!$$0.a(this.r.J())) {
            return false;
         } else {
            boolean $$1 = false;
            switch (this.v.c()) {
               case c:
                  this.q.a(this.s, ((etm)this.v).a());
                  break;
               case b:
                  etl $$2 = (etl)this.v;
                  in $$3 = $$2.a();
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

                  this.s.gu();
            }

            this.s.a(bpl.a);
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

            for (bpl $$0 : bpl.values()) {
               csz $$1 = this.s.b($$0);
               if (!$$1.a(this.r.J())) {
                  return;
               }

               if (this.v != null) {
                  switch (this.v.c()) {
                     case c:
                        etm $$2 = (etm)this.v;
                        brh $$3 = $$2.a();
                        if (!this.r.C_().a($$3.dn())) {
                           return;
                        }

                        bpm $$4 = this.q.a(this.s, $$3, $$2, $$0);
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
                        etl $$5 = (etl)this.v;
                        int $$6 = $$1.G();
                        bpm $$7 = this.q.a(this.s, $$0, $$5);
                        if ($$7.a()) {
                           if ($$7.b()) {
                              this.s.a($$0);
                              if (!$$1.d() && ($$1.G() != $$6 || this.q.f())) {
                                 this.j.b.a($$0);
                              }
                           }

                           return;
                        }

                        if ($$7 == bpm.e) {
                           return;
                        }
                  }
               }

               if (!$$1.d()) {
                  bpm $$8 = this.q.a(this.s, $$0);
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

   public grl s() {
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
         if (this.y instanceof fkl $$1 && !this.s.fJ()) {
            $$1.m();
         }
      } else if (this.s.ez() && !(this.y instanceof fkb)) {
         this.a(null);
      } else if (this.s.fJ() && this.r != null) {
         this.a(new fkl());
      }

      if (this.y != null) {
         this.w = 10000;
      }

      if (this.y != null) {
         fld.a(() -> this.y.e(), "Ticking screen", this.y.getClass().getCanonicalName());
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
               wu $$2 = wu.c("tutorial.socialInteractions.title");
               wu $$3 = wu.a("tutorial.socialInteractions.description", gst.a("socialInteractions"));
               this.bk = new fhp(fhp.a.f, $$2, $$3, true);
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
            this.r.b(this.s.dr(), this.s.dt(), this.s.dx());
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
         fcq $$0 = this.m.aA();
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
               this.s.ga().k = $$1;
            } else {
               fmq.a(this, $$1, $$3, $$2);
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

            this.a(new fpn());
         }
      }

      while (this.m.E.g()) {
         if (this.q.g()) {
            this.s.i();
         } else {
            this.aJ.a();
            this.a(new fnb(this.s));
         }
      }

      while (this.m.T.g()) {
         this.a(new fls(this.s.h.q()));
      }

      while (this.m.F.g()) {
         if (!this.s.N_()) {
            this.L().b(new ahc(ahc.a.g, in.c, is.a));
         }
      }

      while (this.m.G.g()) {
         if (!this.s.N_() && this.s.a(fld.r())) {
            this.s.a(bpl.a);
         }
      }

      while (this.m.K.g()) {
         this.a("");
      }

      if (this.y == null && this.ba == null && this.m.M.g()) {
         this.a("/");
      }

      boolean $$4 = false;
      if (this.s.ft()) {
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

      if (this.m.H.e() && this.aU == 0 && !this.s.ft()) {
         this.bs();
      }

      this.d(this.y == null && !$$4 && this.m.I.e() && this.n.h());
   }

   public gru u() {
      return this.aN;
   }

   public double v() {
      return this.bs;
   }

   public fwi w() {
      return this.aO;
   }

   public fqd x() {
      return new fqd(this, this.ae);
   }

   public void a(eob.c $$0, atc $$1, ale $$2, boolean $$3) {
      this.y();
      this.Y.set(null);
      Instant $$4 = Instant.now();

      try {
         $$0.a($$2.c().a(), $$2.d());
         alb $$5 = alb.a(this.ax, this.p);
         $$5.f().a(this);
         doy.a($$5, this);
         aua.a(false);
         this.aR = MinecraftServer.a((Function<Thread, grd>)($$4x -> new grd($$4x, this, $$0, $$1, $$2, $$5, $$0xx -> {
               aqu $$1xx = aqu.b($$0xx + 0);
               this.Y.set($$1xx);
               return aqt.a($$1xx, this.bi::add);
            })));
         this.aT = true;
         this.a(fxb.a());
         this.aQ.a(gay.c.a, $$0.f(), $$2.d().e());
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

      fkn $$9 = new fkn(this.Y.get());
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
      vs $$12 = vs.a($$11);
      $$12.a($$11.toString(), 0, new fvv($$12, this, null, null, $$3, $$10, $$0x -> {
      }, null));
      $$12.a(new aio(this.X().c(), this.X().b()));
      this.aS = $$12;
   }

   public void a(fvw $$0) {
      fla $$1 = new fla(true);
      $$1.a(wu.c("connect.joining"));
      this.e($$1);
      this.r = $$0;
      this.b($$0);
      if (!this.aT) {
         alb $$2 = alb.a(this.ax, this.p);
         $$2.f().a(this);
         doy.a($$2, this);
         aua.a(false);
      }
   }

   public void y() {
      this.a(new fla(true), false);
   }

   public void b(fld $$0) {
      this.a($$0, false);
   }

   public void a(fld $$0, boolean $$1) {
      fvx $$2 = this.L();
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

      grd $$3 = this.aR;
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

      doy.b();
   }

   public void B() {
      this.al.i();
      this.bz();
   }

   public void c(fld $$0) {
      fvx $$1 = this.L();
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

      doy.b();
   }

   private void e(fld $$0) {
      this.bl.a("forcedTick");
      this.ar.f();
      this.t = null;
      this.aS = null;
      this.a($$0);
      this.c(false);
      this.bl.c();
   }

   public void d(fld $$0) {
      this.bl.a("forcedTick");
      this.a($$0);
      this.c(false);
      this.bl.c();
   }

   private void b(@Nullable fvw $$0) {
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
      return this.J().a(false) ? this.aK.c($$0) : (this.s == null || !$$0.equals(this.s.cx())) && !$$0.equals(ac.e);
   }

   public fde.a J() {
      if (this.m.m().c() == clf.c) {
         return fde.a.b;
      } else if (!this.ai) {
         return fde.a.c;
      } else {
         return !this.bC().flag(UserFlag.CHAT_ALLOWED) ? fde.a.d : fde.a.a;
      }
   }

   public final boolean K() {
      return this.ag;
   }

   @Nullable
   public fvx L() {
      return this.s == null ? null : this.s.h;
   }

   public static boolean M() {
      return !E.m.Z;
   }

   public static boolean N() {
      return E.m.j().c().a() >= fcx.b.a();
   }

   public static boolean O() {
      return !E.j.a() && E.m.j().c().a() >= fcx.c.a();
   }

   public static boolean P() {
      return E.m.k().c();
   }

   private void bD() {
      if (this.v != null && this.v.c() != etn.a.a) {
         boolean $$0 = this.s.gb().d;
         dnm $$1 = null;
         etn.a $$2 = this.v.c();
         csz $$6;
         if ($$2 == etn.a.b) {
            in $$3 = ((etl)this.v).a();
            dqh $$4 = this.r.a_($$3);
            if ($$4.i()) {
               return;
            }

            dde $$5 = $$4.b();
            $$6 = $$5.a((dag)this.r, $$3, $$4);
            if ($$6.d()) {
               return;
            }

            if ($$0 && fld.r() && $$4.t()) {
               $$1 = this.r.c_($$3);
            }
         } else {
            if ($$2 != etn.a.c || !$$0) {
               return;
            }

            brh $$7 = ((etm)this.v).a();
            $$6 = $$7.dA();
            if ($$6 == null) {
               return;
            }
         }

         if ($$6.d()) {
            String $$10 = "";
            if ($$2 == etn.a.b) {
               $$10 = ld.e.b(this.r.a_(((etl)this.v).a()).b()).toString();
            } else if ($$2 == etn.a.c) {
               $$10 = ld.g.b(((etm)this.v).a().ai()).toString();
            }

            F.warn("Picking on: [{}] {} gave null item", $$2, $$10);
         } else {
            clg $$11 = this.s.ga();
            if ($$1 != null) {
               this.a($$6, $$1, this.r.H_());
            }

            int $$12 = $$11.c($$6);
            if ($$0) {
               $$11.b($$6);
               this.q.a(this.s.b(bpl.a), 36 + $$11.k);
            } else if ($$12 != -1) {
               if (clg.d($$12)) {
                  $$11.k = $$12;
               } else {
                  this.q.a($$12);
               }
            }
         }
      }
   }

   private void a(csz $$0, dnm $$1, jk $$2) {
      ua $$3 = $$1.b($$2);
      $$1.a($$3);
      cqx.a($$0, $$1.r(), $$3);
      $$0.a($$1.s());
      $$0.a(ka.g, cvu.a, J, cvu::a);
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

   public static void a(@Nullable fde $$0, @Nullable gog $$1, String $$2, @Nullable fdi $$3, o $$4) {
      ab $$5 = $$4.g();
      a($$5, $$0, $$1, $$2, $$3);
   }

   private static String a(double $$0) {
      return String.format(Locale.ROOT, "%.3fs", $$0);
   }

   private void a(p $$0) {
      $$0.a("JVM uptime", () -> a((double)ManagementFactory.getRuntimeMXBean().getUptime() / 1000.0));
      $$0.a("Wall uptime", () -> a((double)(System.currentTimeMillis() - this.bB) / 1000.0));
      $$0.a("High-res time", () -> a((double)ac.b() / 1000.0));
      $$0.a("Client ticks", () -> String.format(Locale.ROOT, "%d ticks / %.3fs", this.bC, (double)this.bC / 20.0));
   }

   private static ab a(ab $$0, @Nullable fde $$1, @Nullable gog $$2, String $$3, @Nullable fdi $$4) {
      $$0.a("Launched Version", () -> $$3);
      String $$5 = bg();
      if ($$5 != null) {
         $$0.a("Launcher name", $$5);
      }

      $$0.a("Backend library", RenderSystem::getBackendDescription);
      $$0.a("Backend API", RenderSystem::getApiDescription);
      $$0.a("Window size", () -> $$1 != null ? $$1.R.k() + "x" + $$1.R.l() : "<not initialized>");
      $$0.a("GL Caps", RenderSystem::getCapsString);
      $$0.a("GL debug messages", () -> ewp.b() ? String.join("\n", ewp.a()) : "<disabled>");
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
      $$0.a("CPU", ewq::b);
      return $$0;
   }

   public static fde Q() {
      return E;
   }

   public CompletableFuture<Void> R() {
      return this.a(this::l).thenCompose($$0 -> (CompletionStage<Void>)$$0);
   }

   public void a(fxb $$0) {
      if (!this.bx.a($$0)) {
         this.bx = fxe.a($$0, this.az);
      }
   }

   @Nullable
   public fwk S() {
      return x.a(this.L(), fvx::x);
   }

   public boolean T() {
      return this.aT;
   }

   public boolean U() {
      return this.aT && this.aR != null;
   }

   @Nullable
   public grd V() {
      return this.aR;
   }

   public boolean W() {
      grd $$0 = this.V();
      return $$0 != null && !$$0.r();
   }

   public boolean b(UUID $$0) {
      return $$0.equals(this.X().b());
   }

   public fdt X() {
      return this.X;
   }

   public GameProfile Y() {
      ProfileResult $$0 = this.N.join();
      return $$0 != null ? $$0.profile() : new GameProfile(this.X.b(), this.X.c());
   }

   public Proxy Z() {
      return this.ad;
   }

   public gmz aa() {
      return this.O;
   }

   public atr ab() {
      return this.aj;
   }

   public atc ac() {
      return this.am;
   }

   public ash ad() {
      return this.ak;
   }

   public gpo ae() {
      return this.al;
   }

   public Path af() {
      return this.M;
   }

   public gog ag() {
      return this.an;
   }

   public Function<akh, gmy> a(akh $$0) {
      return this.aC.a($$0)::a;
   }

   public boolean ah() {
      return this.af;
   }

   public boolean ai() {
      return this.aV;
   }

   public gbi aj() {
      return this.av;
   }

   public grq ak() {
      return this.ar;
   }

   public auz al() {
      auz $$0 = x.a(this.y, fld::B);
      if ($$0 != null) {
         return $$0;
      } else if (this.s != null) {
         if (this.s.dN().ae() == dad.j) {
            return this.l.j().b() ? ava.d : ava.e;
         } else {
            iw<dbc> $$1 = this.s.dN().t(this.s.dn());
            if (!this.as.c(ava.f) && (!this.s.bh() || !$$1.a(avq.Z))) {
               return this.s.dN().ae() != dad.i && this.s.gb().d && this.s.gb().c ? ava.b : $$1.a().o().orElse(ava.g);
            } else {
               return ava.f;
            }
         }
      } else {
         return ava.a;
      }
   }

   public MinecraftSessionService am() {
      return this.ay;
   }

   public gnz an() {
      return this.aB;
   }

   @Nullable
   public brh ao() {
      return this.t;
   }

   public void a(brh $$0) {
      this.t = $$0;
      this.j.a($$0);
   }

   public boolean b(brh $$0) {
      return $$0.ce() || this.s != null && this.s.N_() && this.m.S.e() && $$0.ai() == brn.bx;
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

   public gci ap() {
      return this.aD;
   }

   public ggv aq() {
      return this.U;
   }

   public gdn ar() {
      return this.aM;
   }

   public ghv as() {
      return this.V;
   }

   public <T> gqz<T> a(gqy.a<T> $$0) {
      return this.W.a($$0);
   }

   public <T> void a(gqy.a<T> $$0, List<T> $$1) {
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

   public fei aw() {
      return this.ao;
   }

   public boolean ax() {
      return this.s != null && this.s.gq() || this.m.V().c();
   }

   public fho aA() {
      return this.aI;
   }

   public gst aB() {
      return this.aJ;
   }

   public boolean aC() {
      return this.bh;
   }

   public fda aD() {
      return this.Z;
   }

   public gpf aE() {
      return this.aC;
   }

   public gnx aF() {
      return this.aE;
   }

   public gnw aG() {
      return this.aF;
   }

   public gnv aH() {
      return this.aG;
   }

   public fes aI() {
      return this.aH;
   }

   @Override
   public void a(boolean $$0) {
      this.bh = $$0;
   }

   public wu a(File $$0, int $$1, int $$2) {
      int $$3 = this.R.k();
      int $$4 = this.R.l();
      ewj $$5 = new ewk($$1, $$2, true, a);
      float $$6 = this.s.dF();
      float $$7 = this.s.dD();
      float $$8 = this.s.P;
      float $$9 = this.s.O;
      this.j.b(false);

      xi var12;
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

            this.s.O = this.s.dD();
            this.s.P = this.s.dF();
            $$5.a(true);
            this.j.a(1.0F, 0L);

            try {
               Thread.sleep(10L);
            } catch (InterruptedException var17) {
            }

            fdp.a($$0, "panorama_" + $$10 + ".png", $$5, $$0x -> {
            });
         }

         wu $$11 = wu.b($$0.getName()).a(n.t).a($$1x -> $$1x.a(new ws(ws.a.b, $$0.getAbsolutePath())));
         return wu.a("screenshot.success", $$11);
      } catch (Exception var18) {
         F.error("Couldn't save image", var18);
         var12 = wu.a("screenshot.failure", var18.getMessage());
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

   private wu a(File $$0, int $$1, int $$2, int $$3, int $$4) {
      try {
         ByteBuffer $$5 = ewq.a($$1 * $$2 * 3);
         fdp $$6 = new fdp($$0, $$3, $$4, $$2);
         float $$7 = (float)$$3 / (float)$$1;
         float $$8 = (float)$$4 / (float)$$2;
         float $$9 = $$7 > $$8 ? $$7 : $$8;

         for (int $$10 = ($$4 - 1) / $$2 * $$2; $$10 >= 0; $$10 -= $$2) {
            for (int $$11 = 0; $$11 < $$3; $$11 += $$1) {
               RenderSystem.setShaderTexture(0, gmx.e);
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
         ewq.a($$5);
         wu $$15 = wu.b($$14.getName()).a(n.t).a($$1x -> $$1x.a(new ws(ws.a.b, $$14.getAbsolutePath())));
         return wu.a("screenshot.success", $$15);
      } catch (Exception var15) {
         F.warn("Couldn't save screenshot", var15);
         return wu.a("screenshot.failure", var15.getMessage());
      }
   }

   public bma aJ() {
      return this.bl;
   }

   @Nullable
   public aqu aK() {
      return this.Y.get();
   }

   public goa aL() {
      return this.au;
   }

   @Nullable
   public fkx aM() {
      return this.ba;
   }

   public fpl aN() {
      return this.aK;
   }

   public boolean aO() {
      return false;
   }

   public exb aP() {
      return this.R;
   }

   public ffm aQ() {
      return this.l.k();
   }

   public gbu aR() {
      return this.T;
   }

   public void b(int $$0) {
      this.aC.a($$0);
   }

   public fux aS() {
      return this.aL;
   }

   public boolean aT() {
      return this.bC().flag(UserFlag.PROFANITY_FILTER_ENABLED);
   }

   public void aU() {
      this.aK.a();
      this.w().a();
   }

   public fdm aV() {
      return this.bu;
   }

   @Nullable
   public ayl aW() {
      return ayl.a(this.ax.getServicesKeySet(), ServicesKeyType.PROFILE_KEY);
   }

   public boolean aX() {
      return !this.ax.getServicesKeySet().keys(ServicesKeyType.PROFILE_KEY).isEmpty();
   }

   public fdb aY() {
      return this.aa;
   }

   public void a(fdb $$0) {
      this.aa = $$0;
   }

   public fcw aZ() {
      return this.bv;
   }

   public fwp ba() {
      return this.bw;
   }

   public fxe bb() {
      return this.bx;
   }

   public fad bc() {
      return this.aP;
   }

   public gay bd() {
      return this.aQ;
   }

   public fct be() {
      return this.by;
   }

   public etf bf() {
      return this.bz;
   }

   private float a(float $$0) {
      if (this.r != null) {
         bpx $$1 = this.r.s();
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
      a(wt.a) {
         @Override
         public boolean a(boolean $$0) {
            return true;
         }
      },
      b(wu.c("chat.disabled.options").a(n.m)) {
         @Override
         public boolean a(boolean $$0) {
            return false;
         }
      },
      c(wu.c("chat.disabled.launcher").a(n.m)) {
         @Override
         public boolean a(boolean $$0) {
            return $$0;
         }
      },
      d(wu.a("chat.disabled.profile", wu.d(fde.E.m.K.h())).a(n.m)) {
         @Override
         public boolean a(boolean $$0) {
            return $$0;
         }
      };

      static final wu e = wu.c("chat.disabled.profile.moreInfo");
      private final wu f;

      a(wu $$0) {
         this.f = $$0;
      }

      public wu a() {
         return this.f;
      }

      public abstract boolean a(boolean var1);
   }

   static record b(eyn a, fqr.c b) {
   }
}
