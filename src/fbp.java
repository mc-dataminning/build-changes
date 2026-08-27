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

public class fbp extends bmu<Runnable> implements evn {
   static fbp E;
   private static final Logger F = LogUtils.getLogger();
   public static final boolean a = ac.j() == ac.a.d;
   private static final int G = 10;
   public static final ajt b = new ajt("default");
   public static final ajt c = new ajt("uniform");
   public static final ajt d = new ajt("alt");
   private static final ajt H = new ajt("regional_compliancies.json");
   private static final CompletableFuture<aym> I = CompletableFuture.completedFuture(aym.a);
   private static final wg J = wg.b("(+NBT)");
   private static final wg K = wg.c("multiplayer.socialInteractions.not_available");
   public static final String e = "Please make sure you have up-to-date drivers (see aka.ms/mcdriver for instructions).";
   private final long L = Double.doubleToLongBits(Math.PI);
   private final Path M;
   private final CompletableFuture<ProfileResult> N;
   private final glk O;
   private final DataFixer P;
   private final gar Q;
   private final evm R;
   private final fcc S = new fcc(20.0F, 0L, this::a);
   private final gaf T;
   public final fzx f;
   private final gfg U;
   private final ggg V;
   public final fxp g;
   private final gpi W = new gpi();
   private final fce X;
   public final fda h;
   public final fda i;
   public final fzs j;
   public final gdl k;
   private final AtomicReference<aqf> Y = new AtomicReference<>();
   public final fdb l;
   public final fbt m;
   private final fbl Z;
   public final fbq n;
   public final fbo o;
   private fbm aa = fbm.a;
   public final File p;
   private final String ab;
   private final String ac;
   private final Proxy ad;
   private final emr ae;
   private final boolean af;
   private final boolean ag;
   private final boolean ah;
   private final boolean ai;
   private final asz aj;
   private final ars ak;
   private final gny al;
   private final asn am;
   private final gmq an;
   private final fct ao;
   private final fcx ap;
   private final euu aq;
   private final gqa ar;
   private final gpv as;
   private final fge at;
   private final gmk au;
   private final fzt av;
   private final fbv aw = new fbv(H, fbp::b);
   private final YggdrasilAuthenticationService ax;
   private final MinecraftSessionService ay;
   private final UserApiService az;
   private final CompletableFuture<UserProperties> aA;
   private final gmj aB;
   private final gnp aC;
   private final gat aD;
   private final gmh aE;
   private final gmg aF;
   private final fdd aG;
   private final ffz aH;
   private final grd aI;
   private final fnv aJ;
   private final fti aK;
   private final gby aL;
   private final gqe aM;
   private final fut aN;
   private final eyo aO;
   private final fzj aP;
   @Nullable
   public fuq q;
   @Nullable
   public fuh r;
   @Nullable
   public fzb s;
   @Nullable
   private gpn aQ;
   @Nullable
   private ve aR;
   private boolean aS;
   @Nullable
   public bpv t;
   @Nullable
   public bpv u;
   @Nullable
   public ery v;
   private int aT;
   protected int w;
   private volatile boolean aU;
   private float aV;
   private long aW = ac.c();
   private long aX;
   private int aY;
   public boolean x;
   @Nullable
   public fjo y;
   @Nullable
   private fji aZ;
   private boolean ba;
   private Thread bb;
   private volatile boolean bc;
   @Nullable
   private Supplier<o> bd;
   private static int be;
   public String z = "";
   private long bf;
   public boolean A;
   public boolean B;
   public boolean C;
   public boolean D = true;
   private boolean bg;
   private final Queue<Runnable> bh = Queues.newConcurrentLinkedQueue();
   @Nullable
   private CompletableFuture<Void> bi;
   @Nullable
   private fga bj;
   private bko bk = bkl.a;
   private int bl;
   private final bki bm = new bki(ac.c, () -> this.bl);
   @Nullable
   private bkn bn;
   private bmc bo = bmb.a;
   private final fbz bp = new fbz();
   private long bq;
   private double br;
   @Nullable
   private ewb.a bs;
   private final fbx bt;
   private final fbh bu;
   private final fva bv;
   private fvp bw;
   private final fbe bx;
   private final erq by;
   private boolean bz;
   private final long bA;
   private long bB;
   private String bC = "root";

   public fbp(fpc $$0) {
      super("Client");
      E = this;
      this.bA = System.currentTimeMillis();
      this.p = $$0.c.a;
      File $$1 = $$0.c.c;
      this.M = $$0.c.b.toPath();
      this.ab = $$0.d.b;
      this.ac = $$0.d.c;
      Path $$2 = this.p.toPath();
      this.by = emr.a($$2.resolve("allowed_symlinks.txt"));
      gma $$3 = new gma($$0.c.a(), this.by);
      this.al = new gny(this, $$2.resolve("downloads"), $$0.a);
      asp $$4 = new asi(this.M, arq.a, aso.b, this.by);
      this.am = new asn($$3, this.al.a(), $$4);
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
      this.af = bj();
      this.aQ = null;
      xl.a(fbn::a);
      this.P = ayr.a();
      this.aH = new ffz(this);
      this.bb = Thread.currentThread();
      this.m = new fbt(this, this.p);
      RenderSystem.setShaderGlintAlpha(this.m.an().c());
      this.bc = true;
      this.aI = new grd(this, this.m);
      this.Z = new fbl($$2, this.P);
      F.info("Backend library: {}", RenderSystem.getBackendDescription());
      euz $$5;
      if (this.m.p > 0 && this.m.o > 0) {
         $$5 = new euz(this.m.o, this.m.p, $$0.b.c, $$0.b.d, $$0.b.e);
      } else {
         $$5 = $$0.b;
      }

      ac.c = RenderSystem.initBackendSystem();
      this.Q = new gar(this);
      this.R = this.Q.a($$5, this.m.k, this.bg());
      this.a(true);
      gqp.a.b(gql.A);

      try {
         this.R.a(this.ak, aa.b().g() ? evc.a : evc.b);
      } catch (IOException var13) {
         F.error("Couldn't set icon", var13);
      }

      this.R.a(this.m.h().c());
      this.n = new fbq(this);
      this.n.a(this.R.i());
      this.o = new fbo(this);
      this.o.a(this.R.i());
      RenderSystem.initRenderer(this.m.u, false);
      this.aq = new eur(this.R.k(), this.R.l());
      this.aq.a(0.0F, 0.0F, 0.0F, 0.0F);
      this.aq.b(a);
      this.aj = new asz(arq.a);
      this.am.a();
      this.m.b(this.am);
      this.an = new gmq(this.m.ad);
      this.aj.a(this.an);
      this.O = new glk(this.aj);
      this.aj.a(this.O);
      this.aB = new gmj(this.O, $$1.toPath().resolve("skins"), this.ay, this);
      this.ae = new emr($$2.resolve("saves"), $$2.resolve("backups"), this.by, this.P);
      this.bx = new fbe($$2);
      this.ar = new gqa(this.m);
      this.aj.a(this.ar);
      this.au = new gmk(this.X);
      this.aj.a(this.au);
      this.as = new gpv(this);
      this.at = new fge(this.O);
      this.h = this.at.a();
      this.i = this.at.b();
      this.aj.a(this.at);
      this.g();
      this.aj.a(new gmd());
      this.aj.a(new gmc());
      this.R.a("Startup");
      RenderSystem.setupDefaultState(0, 0, this.R.k(), this.R.l());
      this.R.a("Post startup");
      this.ao = fct.a();
      this.ap = fcx.a(this.ao);
      this.aC = new gnp(this.O, this.ao, this.m.C().c());
      this.aj.a(this.aC);
      this.aK = new fti();
      this.aj.a(this.aK);
      this.aL = new gby(this.h, this.aK, this::ap, this::as, this::aq);
      this.aj.a(this.aL);
      fzm $$8 = new fzm(this.aL, this.aK);
      this.aj.a($$8);
      this.V = new ggg(this, this.O, this.aC, this.ap, $$8);
      this.aj.a(this.V);

      try {
         int $$9 = Runtime.getRuntime().availableProcessors();
         int $$10 = this.ah() ? $$9 : Math.min($$9, 4);
         ewk.a();
         this.T = new gaf($$10);
      } catch (OutOfMemoryError var12) {
         TinyFileDialogs.tinyfd_messageBox(
            "Minecraft",
            "Oh no! The game was unable to allocate memory off-heap while trying to start. You may try to free some memory by closing other applications on your computer, check that your system meets the minimum requirements, and try again. If the problem persists, please visit: https://aka.ms/Minecraft-Support",
            "ok",
            "error",
            true
         );
         throw new fpd("Unable to allocate render buffers", var12);
      }

      this.aJ = new fnv(this, this.az);
      this.aD = new gat(this.aC.b(), $$8, this.ao);
      this.aj.a(this.aD);
      this.U = new gfg(this, this.O, this.V, this.aD, this.h, this.m, this.aK);
      this.aj.a(this.U);
      this.j = new fzs(this, this.U.d(), this.aj, this.T);
      this.aj.a(this.j.f());
      this.f = new fzx(this, this.U, this.aL, this.T);
      this.aj.a(this.f);
      this.bi();
      this.aj.a(this.W);
      this.g = new fxp(this.r, this.O);
      this.aj.a(this.g);
      this.aE = new gmh(this.O);
      this.aj.a(this.aE);
      this.aF = new gmg(this.O);
      this.aj.a(this.aF);
      this.aG = new fdd(this.O);
      this.aj.a(this.aG);
      this.av = new fzt();
      this.aj.a(this.av);
      this.aj.a(this.aw);
      this.l = new fdb(this);
      this.k = new gdl(this);
      ewy $$12 = ewy.a(this);
      this.aO = new eyo($$12);
      RenderSystem.setErrorCallback(this::a);
      if (this.aq.c != this.R.k() || this.aq.d != this.R.l()) {
         StringBuilder $$13 = new StringBuilder(
            "Recovering from unsupported resolution ("
               + this.R.k()
               + "x"
               + this.R.l()
               + ").\nPlease make sure you have up-to-date drivers (see aka.ms/mcdriver for instructions)."
         );
         if (eva.b()) {
            $$13.append("\n\nReported GL debug messages:\n").append(String.join("\n", eva.a()));
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
      this.aM = new gqe(this, this.az, this.X);
      this.aN = fut.a(this.az, this.X, $$2);
      this.bt = new fbx(this);
      this.bu = new fbh(this);
      this.bu.a(this.m.as().c() != fbr.a);
      this.bv = new fva(this);
      this.bv.a(this.m.A().c());
      this.bw = fvp.a(fvm.a(), this.az);
      fja.a(this);
      this.a(new fiu(wg.c("gui.loadingMinecraft")));
      List<aro> $$14 = this.am.g();
      this.bp.a(fbz.b.a, $$14);
      asy $$15 = this.aj.a(ac.f(), this, I, $$14);
      gqp.a.a(gql.C);
      fbp.b $$16 = new fbp.b($$12, $$0.e);
      this.a(new fja(this, $$15, $$1x -> ac.a($$1x, $$1xx -> this.a($$1xx, $$16), () -> {
            if (aa.aW) {
               this.bl();
            }

            this.bp.a();
            this.a($$16);
         }), false));
      this.aP = fzj.a($$0.e.b());
   }

   private void a(@Nullable fbp.b $$0) {
      if (!this.bz) {
         this.bz = true;
         this.b($$0);
      }
   }

   private void b(@Nullable fbp.b $$0) {
      Runnable $$1 = this.c($$0);
      gqp.a.b(gql.C);
      gqp.a.b(gql.z);
      gqp.a.a(this.aM.a());
      $$1.run();
   }

   public boolean c() {
      return this.bz;
   }

   private Runnable c(@Nullable fbp.b $$0) {
      List<Function<Runnable, fjo>> $$1 = new ArrayList<>();
      this.a($$1);
      Runnable $$2 = () -> {
         if ($$0 != null && $$0.b().a()) {
            fzi.a(this, $$0.b(), $$0.a());
         } else {
            this.a(new fjt(true));
         }
      };

      for (Function<Runnable, fjo> $$3 : Lists.reverse($$1)) {
         fjo $$4 = $$3.apply($$2);
         $$2 = () -> this.a($$4);
      }

      return $$2;
   }

   private void a(List<Function<Runnable, fjo>> $$0) {
      if (this.m.ae) {
         $$0.add($$0x -> new fhy(this.m, $$0x));
      }

      BanDetails $$1 = this.H();
      if ($$1 != null) {
         $$0.add($$1x -> fic.a($$1xx -> {
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
            $$0.add($$1x -> fic.a($$3.getName(), $$1x));
         }

         if ($$4.contains(ProfileActionType.USING_BANNED_SKIN)) {
            $$0.add(fic::a);
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
      $$0.append(aa.b().c());
      fui $$1 = this.L();
      if ($$1 != null && $$1.l().i()) {
         $$0.append(" - ");
         fuv $$2 = this.S();
         if (this.aQ != null && !this.aQ.r()) {
            $$0.append(gmo.a("title.singleplayer"));
         } else if ($$2 != null && $$2.e()) {
            $$0.append(gmo.a("title.multiplayer.realms"));
         } else if (this.aQ == null && ($$2 == null || !$$2.d())) {
            $$0.append(gmo.a("title.multiplayer.other"));
         } else {
            $$0.append(gmo.a("title.multiplayer.lan"));
         }
      }

      return $$0.toString();
   }

   private UserApiService a(YggdrasilAuthenticationService $$0, fpc $$1) {
      return $$0.createUserApiService($$1.a.a.d());
   }

   public static axj e() {
      return axj.a("vanilla", ClientBrandRetriever::getClientModName, "Client", fbp.class);
   }

   private void a(Throwable $$0, @Nullable fbp.b $$1) {
      if (this.am.d().size() > 1) {
         this.a($$0, null, $$1);
      } else {
         ac.a($$0);
      }
   }

   public void a(Throwable $$0, @Nullable wg $$1, @Nullable fbp.b $$2) {
      F.info("Caught error loading resourcepacks, removing all selected resourcepacks", $$0);
      this.bp.a($$0);
      this.al.b();
      this.am.a(Collections.emptyList());
      this.m.i.clear();
      this.m.j.clear();
      this.m.av();
      this.a(true, $$2).thenRun(() -> this.a($$1));
   }

   private void bh() {
      this.a(null);
      if (this.r != null) {
         this.r.X();
         this.y();
      }

      this.a(new fjt());
      this.a(null);
   }

   private void a(@Nullable wg $$0) {
      ffz $$1 = this.aA();
      ffx.b($$1, ffx.a.c, wg.c("resourcePack.load_fail"), $$0);
   }

   public void f() {
      this.bb = Thread.currentThread();
      if (Runtime.getRuntime().availableProcessors() > 4) {
         this.bb.setPriority(10);
      }

      try {
         boolean $$0 = false;

         while (this.bc) {
            this.bk();

            try {
               bkr $$1 = bkr.a("Renderer");
               boolean $$2 = this.aP().e();
               this.bk = this.a($$2, $$1);
               this.bk.a();
               this.bo.c();
               this.c(!$$0);
               this.bo.d();
               this.bk.b();
               this.b($$2, $$1);
            } catch (OutOfMemoryError var4) {
               if ($$0) {
                  throw var4;
               }

               this.bn();
               this.a(new fjh());
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

   private void bi() {
      this.W
         .a(
            gpi.a,
            $$0 -> new gpb<>(
                  $$0x -> $$0x.a(null, csz.a.a.c()).stream().map($$0xx -> n.a($$0xx.getString()).trim()).filter($$0xx -> !$$0xx.isEmpty()),
                  $$0x -> Stream.of(kr.h.b($$0x.f())),
                  $$0
               )
         );
      this.W.a(gpi.b, $$0 -> new gpc<>($$0x -> $$0x.h().map(avr::b), $$0));
      this.W
         .a(
            gpi.c,
            $$0 -> new gpb<>(
                  $$0x -> $$0x.e()
                        .stream()
                        .flatMap($$1 -> $$1.b().a($$0x.a()).a(null, csz.a.a).stream())
                        .map($$0xx -> n.a($$0xx.getString()).trim())
                        .filter($$0xx -> !$$0xx.isEmpty()),
                  $$0x -> $$0x.e().stream().map($$1 -> kr.h.b($$1.b().a($$0x.a()).f())),
                  $$0
               )
         );
      cpv.e().a($$0 -> {
         this.a(gpi.a, $$0);
         this.a(gpi.b, $$0);
      });
   }

   private void a(int $$0, long $$1) {
      this.m.N().a(false);
      this.m.av();
   }

   private static boolean bj() {
      String[] $$0 = new String[]{"sun.arch.data.model", "com.ibm.vm.bitmode", "os.arch"};

      for (String $$1 : $$0) {
         String $$2 = System.getProperty($$1);
         if ($$2 != null && $$2.contains("64")) {
            return true;
         }
      }

      return false;
   }

   public euu h() {
      return this.aq;
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

   private void bk() {
      if (this.bd != null) {
         a(this, this.p, this.bd.get());
      }
   }

   public void c(o $$0) {
      o $$1 = this.d($$0);
      this.bn();
      a(this, this.p, $$1);
   }

   public static void a(@Nullable fbp $$0, File $$1, o $$2) {
      File $$3 = new File($$1, "crash-reports");
      File $$4 = new File($$3, "crash-" + ac.e() + "-client.txt");
      ajv.a($$2.e());
      if ($$0 != null) {
         $$0.ar.h();
      }

      if ($$2.f() != null) {
         ajv.a("#@!@# Game crashed! Crash report saved to: #@!@# " + $$2.f());
         System.exit(-1);
      } else if ($$2.a($$4)) {
         ajv.a("#@!@# Game crashed! Crash report saved to: #@!@# " + $$4.getAbsolutePath());
         System.exit(-1);
      } else {
         ajv.a("#@?@# Game crashed! Crash report could not be saved. #@?@#");
         System.exit(-2);
      }
   }

   public boolean k() {
      return this.m.P().c();
   }

   public CompletableFuture<Void> l() {
      return this.a(false, null);
   }

   private CompletableFuture<Void> a(boolean $$0, @Nullable fbp.b $$1) {
      if (this.bi != null) {
         return this.bi;
      } else {
         CompletableFuture<Void> $$2 = new CompletableFuture<>();
         if (!$$0 && this.aZ instanceof fja) {
            this.bi = $$2;
            return $$2;
         } else {
            this.am.a();
            List<aro> $$3 = this.am.g();
            if (!$$0) {
               this.bp.a(fbz.b.b, $$3);
            }

            this.a(new fja(this, this.aj.a(ac.f(), this, I, $$3), $$3x -> ac.a($$3x, $$2xx -> {
                  if ($$0) {
                     this.al.c();
                     this.bh();
                  } else {
                     this.a($$2xx, $$1);
                  }
               }, () -> {
                  this.f.f();
                  this.bp.a();
                  this.al.d();
                  $$2.complete(null);
                  this.a($$1);
               }), !$$0));
            return $$2;
         }
      }
   }

   private void bl() {
      boolean $$0 = false;
      gas $$1 = this.ap().a();
      gnj $$2 = $$1.a().a();

      for (dby $$3 : kr.e) {
         UnmodifiableIterator $$10 = $$3.l().a().iterator();

         while ($$10.hasNext()) {
            doz $$4 = (doz)$$10.next();
            if ($$4.l() == did.c) {
               gnj $$5 = $$1.b($$4);
               if ($$5 == $$2) {
                  F.debug("Missing model for: {}", $$4);
                  $$0 = true;
               }
            }
         }
      }

      glj $$6 = $$2.e();

      for (dby $$7 : kr.e) {
         UnmodifiableIterator var17 = $$7.l().a().iterator();

         while (var17.hasNext()) {
            doz $$8 = (doz)var17.next();
            glj $$9 = $$1.a($$8);
            if (!$$8.i() && $$9 == $$6) {
               F.debug("Missing particle icon for: {}", $$8);
            }
         }
      }

      for (cre $$10 : kr.h) {
         crj $$11 = $$10.x();
         String $$12 = $$11.s();
         String $$13 = wg.c($$12).getString();
         if ($$13.toLowerCase(Locale.ROOT).equals($$10.a())) {
            F.debug("Missing translation for: {} {} {}", new Object[]{$$11, $$12, $$10});
         }
      }

      $$0 |= fjb.a();
      $$0 |= gfj.a();
      if ($$0) {
         throw new IllegalStateException("Your game data is foobar, fix the errors above!");
      }
   }

   public emr m() {
      return this.ae;
   }

   private void a(String $$0) {
      fbp.a $$1 = this.J();
      if (!$$1.a(this.T())) {
         if (this.l.b()) {
            this.l.b(false);
            this.a(new fif($$0x -> {
               if ($$0x) {
                  ac.j().a("https://aka.ms/JavaAccountSettings");
               }

               this.a(null);
            }, fbp.a.e, "https://aka.ms/JavaAccountSettings", true));
         } else {
            wg $$2 = $$1.a();
            this.l.a($$2, false);
            this.bu.c($$2);
            this.l.b($$1 == fbp.a.d);
         }
      } else {
         this.a(new fie($$0));
      }
   }

   public void a(@Nullable fjo $$0) {
      if (aa.aW && Thread.currentThread() != this.bb) {
         F.error("setScreen called from non-game thread");
      }

      if (this.y != null) {
         this.y.j();
      }

      if ($$0 == null && this.ba) {
         throw new IllegalStateException("Trying to return to in-game GUI during disconnection");
      } else {
         if ($$0 == null && this.r == null) {
            $$0 = new fjt();
         } else if ($$0 == null && this.s.ey()) {
            if (this.s.o()) {
               $$0 = new fim(null, this.r.k().l());
            } else {
               this.s.fX();
            }
         }

         this.y = $$0;
         if (this.y != null) {
            this.y.aG_();
         }

         ewe.a();
         if ($$0 != null) {
            this.n.j();
            fbn.b();
            $$0.b(this, this.R.o(), this.R.p());
            this.x = false;
         } else {
            this.ar.i();
            this.n.i();
         }

         this.d();
      }
   }

   public void a(@Nullable fji $$0) {
      this.aZ = $$0;
   }

   public void n() {
      try {
         F.info("Stopping!");

         try {
            this.bu.c();
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
         this.aM.close();
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
         this.O.close();
         this.aj.close();
         fgq.b();
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

      if (this.bi != null && !(this.aZ instanceof fja)) {
         CompletableFuture<Void> $$2 = this.bi;
         this.bi = null;
         this.l().thenRun(() -> $$2.complete(null));
      }

      Runnable $$3;
      while (($$3 = this.bh.poll()) != null) {
         $$3.run();
      }

      if ($$0) {
         int $$4 = this.S.a(ac.b());
         this.bk.a("scheduledExecutables");
         this.bz();
         this.bk.c();
         this.bk.a("tick");

         for (int $$5 = 0; $$5 < Math.min(10, $$4); $$5++) {
            this.bk.d("clientTick");
            this.t();
         }

         this.bk.c();
      }

      this.R.a("Render");
      this.bk.a("sound");
      this.ar.a(this.j.n());
      this.bk.c();
      this.bk.a("render");
      long $$6 = ac.c();
      boolean $$8;
      if (!this.aP().d() && !this.bo.e()) {
         $$8 = false;
         this.br = 0.0;
      } else {
         $$8 = this.bs == null || this.bs.b();
         if ($$8) {
            ewb.a().ifPresent(ewb::b);
         }
      }

      RenderSystem.clear(16640, a);
      this.aq.a(true);
      fzr.a();
      this.bk.a("display");
      RenderSystem.enableCull();
      this.bk.b("mouse");
      this.n.a();
      this.bk.c();
      if (!this.x) {
         this.bk.b("gameRenderer");
         this.j.a(this.aU ? this.aV : this.S.a, $$1, $$0);
         this.bk.c();
      }

      if (this.bn != null) {
         this.bk.a("fpsPie");
         fdc $$9 = new fdc(this, this.T.c());
         this.a($$9, this.bn);
         $$9.e();
         this.bk.c();
      }

      this.bk.a("blit");
      this.aq.e();
      this.aq.a(this.R.k(), this.R.l());
      this.bf = ac.c() - $$6;
      if ($$8) {
         ewb.a().ifPresent($$0x -> this.bs = $$0x.c());
      }

      this.bk.b("updateDisplay");
      this.R.e();
      int $$10 = this.bm();
      if ($$10 < 260) {
         RenderSystem.limitDisplayFPS($$10);
      }

      this.bk.b("yield");
      Thread.yield();
      this.bk.c();
      this.R.a("Post render");
      this.aY++;
      boolean $$11 = this.U() && (this.y != null && this.y.k() || this.aZ != null && this.aZ.a()) && !this.aQ.r();
      if (this.aU != $$11) {
         if ($$11) {
            this.aV = this.S.a;
         } else {
            this.S.a = this.aV;
         }

         this.aU = $$11;
      }

      long $$12 = ac.c();
      long $$13 = $$12 - this.aW;
      if ($$8) {
         this.bq = $$13;
      }

      this.aP().a($$13);
      this.aW = $$12;
      this.bk.a("fpsUpdate");
      if (this.bs != null && this.bs.b()) {
         this.br = (double)this.bs.c() * 100.0 / (double)this.bq;
      }

      while (ac.b() >= this.aX + 1000L) {
         String $$14;
         if (this.br > 0.0) {
            $$14 = " GPU: " + (this.br > 100.0 ? n.m + "100%" : Math.round(this.br) + "%");
         } else {
            $$14 = "";
         }

         be = this.aY;
         this.z = String.format(
            Locale.ROOT,
            "%d fps T: %s%s%s%s B: %d%s",
            be,
            $$10 == 260 ? "inf" : $$10,
            this.m.N().c() ? " vsync " : " ",
            this.m.j().c(),
            this.m.i().c() == fbd.a ? "" : (this.m.i().c() == fbd.b ? " fast-clouds" : " fancy-clouds"),
            this.m.E().c(),
            $$14
         );
         this.aX += 1000L;
         this.aY = 0;
      }

      this.bk.c();
   }

   private bko a(boolean $$0, @Nullable bkr $$1) {
      if (!$$0) {
         this.bm.b();
         if (!this.bo.e() && $$1 == null) {
            return bkl.a;
         }
      }

      bko $$2;
      if ($$0) {
         if (!this.bm.a()) {
            this.bl = 0;
            this.bm.c();
         }

         this.bl++;
         $$2 = this.bm.d();
      } else {
         $$2 = bkl.a;
      }

      if (this.bo.e()) {
         $$2 = bko.a($$2, this.bo.f());
      }

      return bkr.a($$2, $$1);
   }

   private void b(boolean $$0, @Nullable bkr $$1) {
      if ($$1 != null) {
         $$1.b();
      }

      if ($$0) {
         this.bn = this.bm.e();
      } else {
         this.bn = null;
      }

      this.bk = this.bm.d();
   }

   @Override
   public void a() {
      int $$0 = this.R.a(this.m.aq().c(), this.k());
      this.R.a((double)$$0);
      if (this.y != null) {
         this.y.a(this, this.R.o(), this.R.p());
      }

      euu $$1 = this.h();
      $$1.a(this.R.k(), this.R.l(), a);
      this.j.a(this.R.k(), this.R.l());
      this.n.g();
   }

   @Override
   public void b() {
      this.n.k();
   }

   public int o() {
      return be;
   }

   public long p() {
      return this.bf;
   }

   private int bm() {
      return this.r != null || this.y == null && this.aZ == null ? this.R.d() : 60;
   }

   private void bn() {
      try {
         axi.b();
         this.f.p();
      } catch (Throwable var3) {
      }

      try {
         System.gc();
         if (this.aS && this.aQ != null) {
            this.aQ.a(true);
         }

         this.b((fjo)(new fiu(wg.c("menu.savingLevel"))));
      } catch (Throwable var2) {
      }

      System.gc();
   }

   public boolean a(Consumer<wg> $$0) {
      if (this.bo.e()) {
         this.bo();
         return false;
      } else {
         Consumer<bkn> $$1 = $$1x -> {
            if ($$1x != bkj.a) {
               int $$2x = $$1x.f();
               double $$3x = (double)$$1x.g() / (double)ayj.a;
               this.execute(
                  () -> $$0.accept(
                        wg.a("commands.debug.stopped", String.format(Locale.ROOT, "%.2f", $$3x), $$2x, String.format(Locale.ROOT, "%.2f", (double)$$2x / $$3x))
                     )
               );
            }
         };
         Consumer<Path> $$2 = $$1x -> {
            wg $$2x = wg.b($$1x.toString()).a(n.t).a($$1xx -> $$1xx.a(new we(we.a.b, $$1x.toFile().getParent())));
            this.execute(() -> $$0.accept(wg.a("debug.profiling.stop", $$2x)));
         };
         ab $$3 = a(new ab(), this, this.an, this.ab, this.m);
         Consumer<List<Path>> $$4 = $$2x -> {
            Path $$3x = this.a($$3, $$2x);
            $$2.accept($$3x);
         };
         Consumer<Path> $$5;
         if (this.aQ == null) {
            $$5 = $$1x -> $$4.accept(ImmutableList.of($$1x));
         } else {
            this.aQ.b($$3);
            CompletableFuture<Path> $$6 = new CompletableFuture<>();
            CompletableFuture<Path> $$7 = new CompletableFuture<>();
            CompletableFuture.allOf($$6, $$7).thenRunAsync(() -> $$4.accept(ImmutableList.of($$6.join(), $$7.join())), ac.g());
            this.aQ.a($$0x -> {
            }, $$7::complete);
            $$5 = $$6::complete;
         }

         this.bo = bma.a(new fzg(ac.c, this.f), ac.c, ac.g(), new bmg("client"), $$1x -> {
            this.bo = bmb.a;
            $$1.accept($$1x);
         }, $$5);
         return true;
      }
   }

   private void bo() {
      this.bo.a();
      if (this.aQ != null) {
         this.aQ.aY();
      }
   }

   private void bp() {
      this.bo.b();
      if (this.aQ != null) {
         this.aQ.aZ();
      }
   }

   private Path a(ab $$0, List<Path> $$1) {
      String $$2;
      if (this.T()) {
         $$2 = this.V().bc().e();
      } else {
         fuv $$3 = this.S();
         $$2 = $$3 != null ? $$3.a : "unknown";
      }

      Path $$7;
      try {
         String $$5 = String.format(Locale.ROOT, "%s-%s-%s", ac.e(), $$2, aa.b().b());
         String $$6 = v.a(bmg.a, $$5, ".zip");
         $$7 = bmg.a.resolve($$6);
      } catch (IOException var21) {
         throw new UncheckedIOException(var21);
      }

      try (awv $$10 = new awv($$7)) {
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
      if (this.bn != null) {
         List<bkq> $$1 = this.bn.a(this.bC);
         if (!$$1.isEmpty()) {
            bkq $$2 = $$1.remove(0);
            if ($$0 == 0) {
               if (!$$2.d.isEmpty()) {
                  int $$3 = this.bC.lastIndexOf(30);
                  if ($$3 >= 0) {
                     this.bC = this.bC.substring(0, $$3);
                  }
               }
            } else {
               $$0--;
               if ($$0 < $$1.size() && !"unspecified".equals($$1.get($$0).d)) {
                  if (!this.bC.isEmpty()) {
                     this.bC = this.bC + "\u001e";
                  }

                  this.bC = this.bC + $$1.get($$0).d;
               }
            }
         }
      }
   }

   private void a(fdc $$0, bkn $$1) {
      List<bkq> $$2 = $$1.a(this.bC);
      bkq $$3 = $$2.remove(0);
      RenderSystem.clear(256, a);
      RenderSystem.setShader(fzs::r);
      Matrix4f $$4 = new Matrix4f().setOrtho(0.0F, (float)this.R.k(), (float)this.R.l(), 0.0F, 1000.0F, 3000.0F);
      RenderSystem.setProjectionMatrix($$4, ewq.b);
      Matrix4fStack $$5 = RenderSystem.getModelViewStack();
      $$5.pushMatrix();
      $$5.translation(0.0F, 0.0F, -2000.0F);
      RenderSystem.applyModelViewMatrix();
      RenderSystem.lineWidth(1.0F);
      ewk $$6 = ewk.b();
      ewd $$7 = $$6.d();
      int $$8 = 160;
      int $$9 = this.R.k() - 160 - 10;
      int $$10 = this.R.l() - 320;
      RenderSystem.enableBlend();
      $$7.a(ewn.b.h, ewg.n);
      $$7.a((double)((float)$$9 - 176.0F), (double)((float)$$10 - 96.0F - 16.0F), 0.0).a(200, 0, 0, 0).e();
      $$7.a((double)((float)$$9 - 176.0F), (double)($$10 + 320), 0.0).a(200, 0, 0, 0).e();
      $$7.a((double)((float)$$9 + 176.0F), (double)($$10 + 320), 0.0).a(200, 0, 0, 0).e();
      $$7.a((double)((float)$$9 + 176.0F), (double)((float)$$10 - 96.0F - 16.0F), 0.0).a(200, 0, 0, 0).e();
      $$6.c();
      RenderSystem.disableBlend();
      double $$11 = 0.0;

      for (bkq $$12 : $$2) {
         int $$13 = axk.a($$12.a / 4.0) + 1;
         $$7.a(ewn.b.g, ewg.n);
         int $$14 = $$12.a();
         int $$15 = $$14 >> 16 & 0xFF;
         int $$16 = $$14 >> 8 & 0xFF;
         int $$17 = $$14 & 0xFF;
         $$7.a((double)$$9, (double)$$10, 0.0).a($$15, $$16, $$17, 255).e();

         for (int $$18 = $$13; $$18 >= 0; $$18--) {
            float $$19 = (float)(($$11 + $$12.a * (double)$$18 / (double)$$13) * (float) (Math.PI * 2) / 100.0);
            float $$20 = axk.a($$19) * 160.0F;
            float $$21 = axk.b($$19) * 160.0F * 0.5F;
            $$7.a((double)((float)$$9 + $$20), (double)((float)$$10 - $$21), 0.0).a($$15, $$16, $$17, 255).e();
         }

         $$6.c();
         $$7.a(ewn.b.f, ewg.n);

         for (int $$22 = $$13; $$22 >= 0; $$22--) {
            float $$23 = (float)(($$11 + $$12.a * (double)$$22 / (double)$$13) * (float) (Math.PI * 2) / 100.0);
            float $$24 = axk.a($$23) * 160.0F;
            float $$25 = axk.b($$23) * 160.0F * 0.5F;
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
      String $$27 = bkn.b($$3.d);
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
         bkq $$31 = $$2.get($$30);
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
      this.bc = false;
   }

   public boolean r() {
      return this.bc;
   }

   public void b(boolean $$0) {
      if (this.y == null) {
         boolean $$1 = this.U() && !this.aQ.r();
         if ($$1) {
            this.a(new fjj(!$$0));
            this.ar.e();
         } else {
            this.a(new fjj(true));
         }
      }
   }

   private void d(boolean $$0) {
      if (!$$0) {
         this.w = 0;
      }

      if (this.w <= 0 && !this.s.fs()) {
         if ($$0 && this.v != null && this.v.c() == ery.a.b) {
            erw $$1 = (erw)this.v;
            ib $$2 = $$1.a();
            if (!this.r.a_($$2).i()) {
               ih $$3 = $$1.b();
               if (this.q.b($$2, $$3)) {
                  this.g.a($$2, $$3);
                  this.s.a(bnz.a);
               }
            }
         } else {
            this.q.b();
         }
      }
   }

   private boolean bq() {
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
         crj $$0 = this.s.b(bnz.a);
         if (!$$0.a(this.r.J())) {
            return false;
         } else {
            boolean $$1 = false;
            switch (this.v.c()) {
               case c:
                  this.q.a(this.s, ((erx)this.v).a());
                  break;
               case b:
                  erw $$2 = (erw)this.v;
                  ib $$3 = $$2.a();
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

                  this.s.gt();
            }

            this.s.a(bnz.a);
            return $$1;
         }
      }
   }

   private void br() {
      if (!this.q.k()) {
         this.aT = 4;
         if (!this.s.B()) {
            if (this.v == null) {
               F.warn("Null returned as 'hitResult', this shouldn't happen!");
            }

            for (bnz $$0 : bnz.values()) {
               crj $$1 = this.s.b($$0);
               if (!$$1.a(this.r.J())) {
                  return;
               }

               if (this.v != null) {
                  switch (this.v.c()) {
                     case c:
                        erx $$2 = (erx)this.v;
                        bpv $$3 = $$2.a();
                        if (!this.r.C_().a($$3.dm())) {
                           return;
                        }

                        boa $$4 = this.q.a(this.s, $$3, $$2, $$0);
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
                        erw $$5 = (erw)this.v;
                        int $$6 = $$1.G();
                        boa $$7 = this.q.a(this.s, $$0, $$5);
                        if ($$7.a()) {
                           if ($$7.b()) {
                              this.s.a($$0);
                              if (!$$1.d() && ($$1.G() != $$6 || this.q.f())) {
                                 this.j.b.a($$0);
                              }
                           }

                           return;
                        }

                        if ($$7 == boa.e) {
                           return;
                        }
                  }
               }

               if (!$$1.d()) {
                  boa $$8 = this.q.a(this.s, $$0);
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

   public gpv s() {
      return this.as;
   }

   public void t() {
      this.bB++;
      if (this.r != null && !this.aU) {
         this.r.s().m();
      }

      if (this.aT > 0) {
         this.aT--;
      }

      this.bk.a("gui");
      this.bv.a();
      this.l.a(this.aU);
      this.bk.c();
      this.j.b(1.0F);
      this.aI.a(this.r, this.v);
      this.bk.a("gameMode");
      if (!this.aU && this.r != null) {
         this.q.c();
      }

      this.bk.b("textures");
      boolean $$0 = this.r == null || this.r.s().i();
      if ($$0) {
         this.O.e();
      }

      if (this.y != null || this.s == null) {
         if (this.y instanceof fiw $$1 && !this.s.fI()) {
            $$1.m();
         }
      } else if (this.s.ey() && !(this.y instanceof fim)) {
         this.a(null);
      } else if (this.s.fI() && this.r != null) {
         this.a(new fiw());
      }

      if (this.y != null) {
         this.w = 10000;
      }

      if (this.y != null) {
         fjo.a(() -> this.y.e(), "Ticking screen", this.y.getClass().getCanonicalName());
      }

      if (!this.aP().d()) {
         this.l.l();
      }

      if (this.aZ == null && this.y == null) {
         this.bk.b("Keybindings");
         this.bt();
         if (this.w > 0) {
            this.w--;
         }
      }

      if (this.r != null) {
         this.bk.b("gameRenderer");
         if (!this.aU) {
            this.j.g();
         }

         this.bk.b("levelRenderer");
         if (!this.aU) {
            this.f.o();
         }

         this.bk.b("level");
         if (!this.aU) {
            this.r.f();
         }
      } else if (this.j.h() != null) {
         this.j.b();
      }

      if (!this.aU) {
         this.as.a();
      }

      this.ar.a(this.aU);
      if (this.r != null) {
         if (!this.aU) {
            if (!this.m.s && this.bs()) {
               wg $$2 = wg.c("tutorial.socialInteractions.title");
               wg $$3 = wg.a("tutorial.socialInteractions.description", grd.a("socialInteractions"));
               this.bj = new fga(fga.a.f, $$2, $$3, true);
               this.aI.a(this.bj, 160);
               this.m.s = true;
               this.m.av();
            }

            this.aI.d();

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

         this.bk.b("animateTick");
         if (!this.aU && $$0) {
            this.r.b(this.s.dq(), this.s.ds(), this.s.dw());
         }

         this.bk.b("particles");
         if (!this.aU && $$0) {
            this.g.b();
         }
      } else if (this.aR != null) {
         this.bk.b("pendingConnection");
         this.aR.b();
      }

      this.bk.b("keyboard");
      this.o.b();
      this.bk.c();
   }

   private boolean bs() {
      return !this.aS || this.aQ != null && this.aQ.r();
   }

   private void bt() {
      while (this.m.P.g()) {
         fbb $$0 = this.m.aA();
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
               this.s.fZ().l = $$1;
            } else {
               flb.a(this, $$1, $$3, $$2);
            }
         }
      }

      while (this.m.N.g()) {
         if (!this.bs()) {
            this.s.a(K, true);
            this.bu.c(K);
         } else {
            if (this.bj != null) {
               this.aI.a(this.bj);
               this.bj = null;
            }

            this.a(new fnx());
         }
      }

      while (this.m.E.g()) {
         if (this.q.g()) {
            this.s.i();
         } else {
            this.aI.a();
            this.a(new flm(this.s));
         }
      }

      while (this.m.T.g()) {
         this.a(new fkd(this.s.ct.q()));
      }

      while (this.m.F.g()) {
         if (!this.s.N_()) {
            this.L().b(new ago(ago.a.g, ib.c, ih.a));
         }
      }

      while (this.m.G.g()) {
         if (!this.s.N_() && this.s.a(fjo.r())) {
            this.s.a(bnz.a);
         }
      }

      while (this.m.K.g()) {
         this.a("");
      }

      if (this.y == null && this.aZ == null && this.m.M.g()) {
         this.a("/");
      }

      boolean $$4 = false;
      if (this.s.fs()) {
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
            $$4 |= this.bq();
         }

         while (this.m.H.g()) {
            this.br();
         }

         while (this.m.J.g()) {
            this.bC();
         }
      }

      if (this.m.H.e() && this.aT == 0 && !this.s.fs()) {
         this.br();
      }

      this.d(this.y == null && !$$4 && this.m.I.e() && this.n.h());
   }

   public gqe u() {
      return this.aM;
   }

   public double v() {
      return this.br;
   }

   public fut w() {
      return this.aN;
   }

   public fon x() {
      return new fon(this, this.ae);
   }

   public void a(emr.c $$0, asn $$1, akp $$2, boolean $$3) {
      this.y();
      this.Y.set(null);
      Instant $$4 = Instant.now();

      try {
         $$0.a($$2.c().a(), $$2.d());
         akm $$5 = akm.a(this.ax, this.p);
         $$5.f().a(this);
         dnr.a($$5, this);
         atl.a(false);
         this.aQ = MinecraftServer.a((Function<Thread, gpn>)($$4x -> new gpn($$4x, this, $$0, $$1, $$2, $$5, $$0xx -> {
               aqf $$1xx = aqf.b($$0xx + 0);
               this.Y.set($$1xx);
               return aqe.a($$1xx, this.bh::add);
            })));
         this.aS = true;
         this.a(fvm.a());
         this.aP.a(fzj.c.a, $$0.f(), $$2.d().e());
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

      fiy $$9 = new fiy(this.Y.get());
      this.a($$9);
      this.bk.a("waitForServer");

      for (; !this.aQ.aj() || this.aZ != null; this.bk()) {
         $$9.e();
         this.c(false);

         try {
            Thread.sleep(16L);
         } catch (InterruptedException var10) {
         }
      }

      this.bk.c();
      Duration $$10 = Duration.between($$4, Instant.now());
      SocketAddress $$11 = this.aQ.ai().a();
      ve $$12 = ve.a($$11);
      $$12.a($$11.toString(), 0, new fug($$12, this, null, null, $$3, $$10, $$0x -> {
      }, null));
      $$12.a(new aia(this.X().c(), this.X().b()));
      this.aR = $$12;
   }

   public void a(fuh $$0) {
      fjl $$1 = new fjl(true);
      $$1.a(wg.c("connect.joining"));
      this.e($$1);
      this.r = $$0;
      this.b($$0);
      if (!this.aS) {
         akm $$2 = akm.a(this.ax, this.p);
         $$2.f().a(this);
         dnr.a($$2, this);
         atl.a(false);
      }
   }

   public void y() {
      this.a(new fjl(true), false);
   }

   public void b(fjo $$0) {
      this.a($$0, false);
   }

   public void a(fjo $$0, boolean $$1) {
      fui $$2 = this.L();
      if ($$2 != null) {
         this.by();
         $$2.i();
         if (!$$1) {
            this.B();
         }
      }

      this.aJ.b();
      if (this.bo.e()) {
         this.bp();
      }

      gpn $$3 = this.aQ;
      this.aQ = null;
      this.j.j();
      this.q = null;
      this.bu.b();
      this.ba = true;

      try {
         this.e($$0);
         if (this.r != null) {
            if ($$3 != null) {
               this.bk.a("waitForServer");

               while (!$$3.H()) {
                  this.c(false);
               }

               this.bk.c();
            }

            this.l.i();
            this.aS = false;
         }

         this.r = null;
         this.b(null);
         this.s = null;
      } finally {
         this.ba = false;
      }

      dnr.b();
   }

   public void B() {
      this.al.i();
      this.bz();
   }

   public void c(fjo $$0) {
      fui $$1 = this.L();
      if ($$1 != null) {
         $$1.j();
      }

      if (this.bo.e()) {
         this.bp();
      }

      this.j.j();
      this.q = null;
      this.bu.b();
      this.ba = true;

      try {
         this.e($$0);
         this.l.i();
         this.r = null;
         this.b(null);
         this.s = null;
      } finally {
         this.ba = false;
      }

      dnr.b();
   }

   private void e(fjo $$0) {
      this.bk.a("forcedTick");
      this.ar.f();
      this.t = null;
      this.aR = null;
      this.a($$0);
      this.c(false);
      this.bk.c();
   }

   public void d(fjo $$0) {
      this.bk.a("forcedTick");
      this.a($$0);
      this.c(false);
      this.bk.c();
   }

   private void b(@Nullable fuh $$0) {
      this.f.a($$0);
      this.g.a($$0);
      this.aL.a($$0);
      this.d();
   }

   private UserProperties bB() {
      return this.aA.join();
   }

   public boolean C() {
      return this.D() && this.m.ai().c();
   }

   public boolean D() {
      return this.E() && this.bB().flag(UserFlag.OPTIONAL_TELEMETRY_AVAILABLE);
   }

   public boolean E() {
      return aa.aW ? false : this.bB().flag(UserFlag.TELEMETRY_ENABLED);
   }

   public boolean F() {
      return this.ah && this.bB().flag(UserFlag.SERVERS_ALLOWED) && this.H() == null && !this.I();
   }

   public boolean G() {
      return this.bB().flag(UserFlag.REALMS_ALLOWED) && this.H() == null;
   }

   @Nullable
   public BanDetails H() {
      return (BanDetails)this.bB().bannedScopes().get("MULTIPLAYER");
   }

   public boolean I() {
      ProfileResult $$0 = this.N.getNow(null);
      return $$0 != null && $$0.actions().contains(ProfileActionType.FORCED_NAME_CHANGE);
   }

   public boolean a(UUID $$0) {
      return this.J().a(false) ? this.aJ.c($$0) : (this.s == null || !$$0.equals(this.s.cw())) && !$$0.equals(ac.e);
   }

   public fbp.a J() {
      if (this.m.m().c() == cjr.c) {
         return fbp.a.b;
      } else if (!this.ai) {
         return fbp.a.c;
      } else {
         return !this.bB().flag(UserFlag.CHAT_ALLOWED) ? fbp.a.d : fbp.a.a;
      }
   }

   public final boolean K() {
      return this.ag;
   }

   @Nullable
   public fui L() {
      return this.s == null ? null : this.s.ct;
   }

   public static boolean M() {
      return !E.m.Z;
   }

   public static boolean N() {
      return E.m.j().c().a() >= fbi.b.a();
   }

   public static boolean O() {
      return !E.j.a() && E.m.j().c().a() >= fbi.c.a();
   }

   public static boolean P() {
      return E.m.k().c();
   }

   private void bC() {
      if (this.v != null && this.v.c() != ery.a.a) {
         boolean $$0 = this.s.ga().d;
         dmf $$1 = null;
         ery.a $$2 = this.v.c();
         crj $$6;
         if ($$2 == ery.a.b) {
            ib $$3 = ((erw)this.v).a();
            doz $$4 = this.r.a_($$3);
            if ($$4.i()) {
               return;
            }

            dby $$5 = $$4.b();
            $$6 = $$5.a((cza)this.r, $$3, $$4);
            if ($$6.d()) {
               return;
            }

            if ($$0 && fjo.r() && $$4.t()) {
               $$1 = this.r.c_($$3);
            }
         } else {
            if ($$2 != ery.a.c || !$$0) {
               return;
            }

            bpv $$7 = ((erx)this.v).a();
            $$6 = $$7.dz();
            if ($$6 == null) {
               return;
            }
         }

         if ($$6.d()) {
            String $$10 = "";
            if ($$2 == ery.a.b) {
               $$10 = kr.e.b(this.r.a_(((erw)this.v).a()).b()).toString();
            } else if ($$2 == ery.a.c) {
               $$10 = kr.g.b(((erx)this.v).a().ai()).toString();
            }

            F.warn("Picking on: [{}] {} gave null item", $$2, $$10);
         } else {
            cjs $$11 = this.s.fZ();
            if ($$1 != null) {
               this.a($$6, $$1, this.r.H_());
            }

            int $$12 = $$11.b($$6);
            if ($$0) {
               $$11.a($$6);
               this.q.a(this.s.b(bnz.a), 36 + $$11.l);
            } else if ($$12 != -1) {
               if (cjs.d($$12)) {
                  $$11.l = $$12;
               } else {
                  this.q.a($$12);
               }
            }
         }
      }
   }

   private void a(crj $$0, dmf $$1, iz $$2) {
      tm $$3 = $$1.b($$2);
      $$1.a($$3);
      cph.a($$0, $$1.r(), $$3);
      $$0.a($$1.s());
      $$0.a(jp.e, cub.a, J, cub::a);
   }

   public o d(o $$0) {
      ab $$1 = $$0.g();
      a($$1, this, this.an, this.ab, this.m);
      this.a($$0.a("Uptime"));
      if (this.r != null) {
         this.r.a($$0);
      }

      if (this.aQ != null) {
         this.aQ.b($$1);
      }

      this.bp.a($$0);
      return $$0;
   }

   public static void a(@Nullable fbp $$0, @Nullable gmq $$1, String $$2, @Nullable fbt $$3, o $$4) {
      ab $$5 = $$4.g();
      a($$5, $$0, $$1, $$2, $$3);
   }

   private static String a(double $$0) {
      return String.format(Locale.ROOT, "%.3fs", $$0);
   }

   private void a(p $$0) {
      $$0.a("JVM uptime", () -> a((double)ManagementFactory.getRuntimeMXBean().getUptime() / 1000.0));
      $$0.a("Wall uptime", () -> a((double)(System.currentTimeMillis() - this.bA) / 1000.0));
      $$0.a("High-res time", () -> a((double)ac.b() / 1000.0));
      $$0.a("Client ticks", () -> String.format(Locale.ROOT, "%d ticks / %.3fs", this.bB, (double)this.bB / 20.0));
   }

   private static ab a(ab $$0, @Nullable fbp $$1, @Nullable gmq $$2, String $$3, @Nullable fbt $$4) {
      $$0.a("Launched Version", () -> $$3);
      String $$5 = bf();
      if ($$5 != null) {
         $$0.a("Launcher name", $$5);
      }

      $$0.a("Backend library", RenderSystem::getBackendDescription);
      $$0.a("Backend API", RenderSystem::getApiDescription);
      $$0.a("Window size", () -> $$1 != null ? $$1.R.k() + "x" + $$1.R.l() : "<not initialized>");
      $$0.a("GL Caps", RenderSystem::getCapsString);
      $$0.a("GL debug messages", () -> eva.b() ? String.join("\n", eva.a()) : "<disabled>");
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
      $$0.a("CPU", evb::b);
      return $$0;
   }

   public static fbp Q() {
      return E;
   }

   public CompletableFuture<Void> R() {
      return this.a(this::l).thenCompose($$0 -> (CompletionStage<Void>)$$0);
   }

   public void a(fvm $$0) {
      if (!this.bw.a($$0)) {
         this.bw = fvp.a($$0, this.az);
      }
   }

   @Nullable
   public fuv S() {
      return x.a(this.L(), fui::x);
   }

   public boolean T() {
      return this.aS;
   }

   public boolean U() {
      return this.aS && this.aQ != null;
   }

   @Nullable
   public gpn V() {
      return this.aQ;
   }

   public boolean W() {
      gpn $$0 = this.V();
      return $$0 != null && !$$0.r();
   }

   public boolean b(UUID $$0) {
      return $$0.equals(this.X().b());
   }

   public fce X() {
      return this.X;
   }

   public GameProfile Y() {
      ProfileResult $$0 = this.N.join();
      return $$0 != null ? $$0.profile() : new GameProfile(this.X.b(), this.X.c());
   }

   public Proxy Z() {
      return this.ad;
   }

   public glk aa() {
      return this.O;
   }

   public atc ab() {
      return this.aj;
   }

   public asn ac() {
      return this.am;
   }

   public ars ad() {
      return this.ak;
   }

   public gny ae() {
      return this.al;
   }

   public Path af() {
      return this.M;
   }

   public gmq ag() {
      return this.an;
   }

   public Function<ajt, glj> a(ajt $$0) {
      return this.aC.a($$0)::a;
   }

   public boolean ah() {
      return this.af;
   }

   public boolean ai() {
      return this.aU;
   }

   public fzt aj() {
      return this.av;
   }

   public gqa ak() {
      return this.ar;
   }

   public auj al() {
      auj $$0 = x.a(this.y, fjo::B);
      if ($$0 != null) {
         return $$0;
      } else if (this.s != null) {
         if (this.s.dM().ae() == cyx.j) {
            return this.l.j().b() ? auk.d : auk.e;
         } else {
            il<czw> $$1 = this.s.dM().t(this.s.dm());
            if (!this.as.c(auk.f) && (!this.s.bh() || !$$1.a(avb.Z))) {
               return this.s.dM().ae() != cyx.i && this.s.ga().d && this.s.ga().c ? auk.b : $$1.a().o().orElse(auk.g);
            } else {
               return auk.f;
            }
         }
      } else {
         return auk.a;
      }
   }

   public MinecraftSessionService am() {
      return this.ay;
   }

   public gmj an() {
      return this.aB;
   }

   @Nullable
   public bpv ao() {
      return this.t;
   }

   public void a(bpv $$0) {
      this.t = $$0;
      this.j.a($$0);
   }

   public boolean b(bpv $$0) {
      return $$0.cd() || this.s != null && this.s.N_() && this.m.S.e() && $$0.ai() == bqb.bx;
   }

   @Override
   protected Thread az() {
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

   public gat ap() {
      return this.aD;
   }

   public gfg aq() {
      return this.U;
   }

   public gby ar() {
      return this.aL;
   }

   public ggg as() {
      return this.V;
   }

   public <T> gpj<T> a(gpi.a<T> $$0) {
      return this.W.a($$0);
   }

   public <T> void a(gpi.a<T> $$0, List<T> $$1) {
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

   public fct aw() {
      return this.ao;
   }

   public boolean ax() {
      return this.s != null && this.s.gp() || this.m.V().c();
   }

   public ffz aA() {
      return this.aH;
   }

   public grd aB() {
      return this.aI;
   }

   public boolean aC() {
      return this.bg;
   }

   public fbl aD() {
      return this.Z;
   }

   public gnp aE() {
      return this.aC;
   }

   public gmh aF() {
      return this.aE;
   }

   public gmg aG() {
      return this.aF;
   }

   public fdd aH() {
      return this.aG;
   }

   @Override
   public void a(boolean $$0) {
      this.bg = $$0;
   }

   public wg a(File $$0, int $$1, int $$2) {
      int $$3 = this.R.k();
      int $$4 = this.R.l();
      euu $$5 = new euv($$1, $$2, true, a);
      float $$6 = this.s.dE();
      float $$7 = this.s.dC();
      float $$8 = this.s.O;
      float $$9 = this.s.N;
      this.j.b(false);

      wu var12;
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

            this.s.N = this.s.dC();
            this.s.O = this.s.dE();
            $$5.a(true);
            this.j.a(1.0F, 0L);

            try {
               Thread.sleep(10L);
            } catch (InterruptedException var17) {
            }

            fca.a($$0, "panorama_" + $$10 + ".png", $$5, $$0x -> {
            });
         }

         wg $$11 = wg.b($$0.getName()).a(n.t).a($$1x -> $$1x.a(new we(we.a.b, $$0.getAbsolutePath())));
         return wg.a("screenshot.success", $$11);
      } catch (Exception var18) {
         F.error("Couldn't save image", var18);
         var12 = wg.a("screenshot.failure", var18.getMessage());
      } finally {
         this.s.s($$6);
         this.s.r($$7);
         this.s.O = $$8;
         this.s.N = $$9;
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

   private wg a(File $$0, int $$1, int $$2, int $$3, int $$4) {
      try {
         ByteBuffer $$5 = evb.a($$1 * $$2 * 3);
         fca $$6 = new fca($$0, $$3, $$4, $$2);
         float $$7 = (float)$$3 / (float)$$1;
         float $$8 = (float)$$4 / (float)$$2;
         float $$9 = $$7 > $$8 ? $$7 : $$8;

         for (int $$10 = ($$4 - 1) / $$2 * $$2; $$10 >= 0; $$10 -= $$2) {
            for (int $$11 = 0; $$11 < $$3; $$11 += $$1) {
               RenderSystem.setShaderTexture(0, gli.e);
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
         evb.a($$5);
         wg $$15 = wg.b($$14.getName()).a(n.t).a($$1x -> $$1x.a(new we(we.a.b, $$14.getAbsolutePath())));
         return wg.a("screenshot.success", $$15);
      } catch (Exception var15) {
         F.warn("Couldn't save screenshot", var15);
         return wg.a("screenshot.failure", var15.getMessage());
      }
   }

   public bko aI() {
      return this.bk;
   }

   @Nullable
   public aqf aJ() {
      return this.Y.get();
   }

   public gmk aK() {
      return this.au;
   }

   @Nullable
   public fji aL() {
      return this.aZ;
   }

   public fnv aM() {
      return this.aJ;
   }

   public boolean aN() {
      return false;
   }

   public evm aO() {
      return this.R;
   }

   public fdx aP() {
      return this.l.k();
   }

   public gaf aQ() {
      return this.T;
   }

   public void b(int $$0) {
      this.aC.a($$0);
   }

   public fti aR() {
      return this.aK;
   }

   public boolean aS() {
      return this.bB().flag(UserFlag.PROFANITY_FILTER_ENABLED);
   }

   public void aT() {
      this.aJ.a();
      this.w().a();
   }

   public fbx aU() {
      return this.bt;
   }

   @Nullable
   public axw aV() {
      return axw.a(this.ax.getServicesKeySet(), ServicesKeyType.PROFILE_KEY);
   }

   public boolean aW() {
      return !this.ax.getServicesKeySet().keys(ServicesKeyType.PROFILE_KEY).isEmpty();
   }

   public fbm aX() {
      return this.aa;
   }

   public void a(fbm $$0) {
      this.aa = $$0;
   }

   public fbh aY() {
      return this.bu;
   }

   public fva aZ() {
      return this.bv;
   }

   public fvp ba() {
      return this.bw;
   }

   public eyo bb() {
      return this.aO;
   }

   public fzj bc() {
      return this.aP;
   }

   public fbe bd() {
      return this.bx;
   }

   public erq be() {
      return this.by;
   }

   private float a(float $$0) {
      if (this.r != null) {
         bol $$1 = this.r.s();
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
      a(wf.a) {
         @Override
         public boolean a(boolean $$0) {
            return true;
         }
      },
      b(wg.c("chat.disabled.options").a(n.m)) {
         @Override
         public boolean a(boolean $$0) {
            return false;
         }
      },
      c(wg.c("chat.disabled.launcher").a(n.m)) {
         @Override
         public boolean a(boolean $$0) {
            return $$0;
         }
      },
      d(wg.a("chat.disabled.profile", wg.d(fbp.E.m.K.h())).a(n.m)) {
         @Override
         public boolean a(boolean $$0) {
            return $$0;
         }
      };

      static final wg e = wg.c("chat.disabled.profile.moreInfo");
      private final wg f;

      a(wg $$0) {
         this.f = $$0;
      }

      public wg a() {
         return this.f;
      }

      public abstract boolean a(boolean var1);
   }

   static record b(ewy a, fpc.c b) {
   }
}
