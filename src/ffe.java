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

public class ffe extends bpn<Runnable> implements ezc {
   static ffe E;
   private static final Logger F = LogUtils.getLogger();
   public static final boolean a = ac.k() == ac.a.d;
   private static final int G = 10;
   public static final ale b = new ale("default");
   public static final ale c = new ale("uniform");
   public static final ale d = new ale("alt");
   private static final ale H = new ale("regional_compliancies.json");
   private static final CompletableFuture<bab> I = CompletableFuture.completedFuture(bab.a);
   private static final xo J = xo.c("multiplayer.socialInteractions.not_available");
   public static final String e = "Please make sure you have up-to-date drivers (see aka.ms/mcdriver for instructions).";
   private final long K = Double.doubleToLongBits(Math.PI);
   private final Path L;
   private final CompletableFuture<ProfileResult> M;
   private final goz N;
   private final DataFixer O;
   private final gef P;
   private final ezb Q;
   private final ffq R = new ffq(20.0F, 0L, this::a);
   private final gdt S;
   public final gdl f;
   private final giu T;
   private final gju U;
   public final gbd g;
   private final gsy V = new gsy();
   private final ffs W;
   public final fgo h;
   public final fgo i;
   public final gdg j;
   public final ggz k;
   private final AtomicReference<arr> X = new AtomicReference<>();
   public final fgp l;
   public final ffi m;
   private final ffa Y;
   public final fff n;
   public final ffd o;
   private ffb Z = ffb.a;
   public final File p;
   private final String aa;
   private final String ab;
   private final Proxy ac;
   private final epv ad;
   private final boolean ae;
   private final boolean af;
   private final boolean ag;
   private final aul ah;
   private final ate ai;
   private final gro aj;
   private final atz ak;
   private final gqg al;
   private final fgh am;
   private final fgl an;
   private final eyj ao;
   private final gtu ap;
   private final gtp aq;
   private final fjs ar;
   private final gqa as;
   private final gdh at;
   private final ffk au = new ffk(H, ffe::b);
   private final YggdrasilAuthenticationService av;
   private final MinecraftSessionService aw;
   private final UserApiService ax;
   private final CompletableFuture<UserProperties> ay;
   private final gpz az;
   private final grf aA;
   private final geh aB;
   private final gpx aC;
   private final gpw aD;
   private final gpv aE;
   private final fgr aF;
   private final fjn aG;
   private final gux aH;
   private final frj aI;
   private final fwv aJ;
   private final gfm aK;
   private final gty aL;
   private final fyg aM;
   private final fcd aN;
   private final gcx aO;
   @Nullable
   public fyd q;
   @Nullable
   public fxu r;
   @Nullable
   public gcp s;
   @Nullable
   private gtd aP;
   @Nullable
   private wj aQ;
   private boolean aR;
   @Nullable
   public bst t;
   @Nullable
   public bst u;
   @Nullable
   public evo v;
   private int aS;
   protected int w;
   private volatile boolean aT;
   private float aU;
   private long aV = ac.d();
   private long aW;
   private int aX;
   public boolean x;
   @Nullable
   public fnc y;
   @Nullable
   private fmw aY;
   private boolean aZ;
   private Thread ba;
   private volatile boolean bb;
   @Nullable
   private Supplier<o> bc;
   private static int bd;
   public String z = "";
   private long be;
   public boolean A;
   public boolean B;
   public boolean C;
   public boolean D = true;
   private boolean bf;
   private final Queue<Runnable> bg = Queues.newConcurrentLinkedQueue();
   @Nullable
   private CompletableFuture<Void> bh;
   @Nullable
   private fjo bi;
   private bnh bj = bne.a;
   private int bk;
   private final bnb bl = new bnb(ac.c, () -> this.bk);
   @Nullable
   private bng bm;
   private bov bn = bou.a;
   private final ffn bo = new ffn();
   private long bp;
   private double bq;
   @Nullable
   private ezq.a br;
   private final few bs;
   private final fyn bt;
   private fzc bu;
   private final fet bv;
   private final evg bw;
   private boolean bx;
   private final long by;
   private long bz;
   private String bA = "root";

   public ffe(fsp $$0) {
      super("Client");
      E = this;
      this.by = System.currentTimeMillis();
      this.p = $$0.c.a;
      File $$1 = $$0.c.c;
      this.L = $$0.c.b.toPath();
      this.aa = $$0.d.b;
      this.ab = $$0.d.c;
      Path $$2 = this.p.toPath();
      this.bw = epv.a($$2.resolve("allowed_symlinks.txt"));
      gpp $$3 = new gpp($$0.c.a(), this.bw);
      this.aj = new gro(this, $$2.resolve("downloads"), $$0.a);
      aub $$4 = new atu(this.L, atc.a, aua.b, this.bw);
      this.ak = new atz($$3, this.aj.a(), $$4);
      this.ai = $$3.a();
      this.ac = $$0.a.d;
      this.av = new YggdrasilAuthenticationService(this.ac);
      this.aw = this.av.createMinecraftSessionService();
      this.W = $$0.a.a;
      this.M = CompletableFuture.supplyAsync(() -> this.aw.fetchProfile(this.W.b(), true), ac.i());
      this.ax = this.a(this.av, $$0);
      this.ay = CompletableFuture.supplyAsync(() -> {
         try {
            return this.ax.fetchProperties();
         } catch (AuthenticationException var2x) {
            F.error("Failed to fetch user properties", var2x);
            return UserApiService.OFFLINE_PROPERTIES;
         }
      }, ac.i());
      F.info("Setting user: {}", this.W.c());
      F.debug("(Session ID is {})", this.W.a());
      this.ae = $$0.d.a;
      this.af = !$$0.d.d;
      this.ag = !$$0.d.e;
      this.aP = null;
      yt.a(ffc::a);
      this.O = bag.a();
      this.aG = new fjn(this);
      this.ba = Thread.currentThread();
      this.m = new ffi(this, this.p);
      RenderSystem.setShaderGlintAlpha(this.m.an().c());
      this.bb = true;
      this.aH = new gux(this, this.m);
      this.Y = new ffa($$2, this.O);
      F.info("Backend library: {}", RenderSystem.getBackendDescription());
      eyo $$5;
      if (this.m.p > 0 && this.m.o > 0) {
         $$5 = new eyo(this.m.o, this.m.p, $$0.b.c, $$0.b.d, $$0.b.e);
      } else {
         $$5 = $$0.b;
      }

      ac.c = RenderSystem.initBackendSystem();
      this.P = new gef(this);
      this.Q = this.P.a($$5, this.m.k, this.bf());
      this.a(true);
      guj.a.b(guf.A);

      try {
         this.Q.a(this.ai, aa.b().g() ? eyr.a : eyr.b);
      } catch (IOException var13) {
         F.error("Couldn't set icon", var13);
      }

      this.Q.a(this.m.h().c());
      this.n = new fff(this);
      this.n.a(this.Q.i());
      this.o = new ffd(this);
      this.o.a(this.Q.i());
      RenderSystem.initRenderer(this.m.u, false);
      this.ao = new eyg(this.Q.k(), this.Q.l());
      this.ao.a(0.0F, 0.0F, 0.0F, 0.0F);
      this.ao.b(a);
      this.ah = new aul(atc.a);
      this.ak.a();
      this.m.b(this.ak);
      this.al = new gqg(this.m.ac);
      this.ah.a(this.al);
      this.N = new goz(this.ah);
      this.ah.a(this.N);
      this.az = new gpz(this.N, $$1.toPath().resolve("skins"), this.aw, this);
      this.ad = new epv($$2.resolve("saves"), $$2.resolve("backups"), this.bw, this.O);
      this.bv = new fet($$2);
      this.ap = new gtu(this.m);
      this.ah.a(this.ap);
      this.as = new gqa(this.W);
      this.ah.a(this.as);
      this.aq = new gtp(this);
      this.ar = new fjs(this.N);
      this.h = this.ar.a();
      this.i = this.ar.b();
      this.ah.a(this.ar);
      this.g();
      this.ah.a(new gps());
      this.ah.a(new gpr());
      this.Q.a("Startup");
      RenderSystem.setupDefaultState(0, 0, this.Q.k(), this.Q.l());
      this.Q.a("Post startup");
      this.am = fgh.a();
      this.an = fgl.a(this.am);
      this.aA = new grf(this.N, this.am, this.m.C().c());
      this.ah.a(this.aA);
      this.aJ = new fwv();
      this.ah.a(this.aJ);
      this.aK = new gfm(this.h, this.aJ, this::ao, this::ar, this::ap);
      this.ah.a(this.aK);
      gda $$8 = new gda(this.aK, this.aJ);
      this.ah.a($$8);
      this.U = new gju(this, this.N, this.aA, this.an, $$8);
      this.ah.a(this.U);

      try {
         int $$9 = Runtime.getRuntime().availableProcessors();
         ezz.a();
         this.S = new gdt($$9);
      } catch (OutOfMemoryError var12) {
         TinyFileDialogs.tinyfd_messageBox(
            "Minecraft",
            "Oh no! The game was unable to allocate memory off-heap while trying to start. You may try to free some memory by closing other applications on your computer, check that your system meets the minimum requirements, and try again. If the problem persists, please visit: https://aka.ms/Minecraft-Support",
            "ok",
            "error",
            true
         );
         throw new fsq("Unable to allocate render buffers", var12);
      }

      this.aI = new frj(this, this.ax);
      this.aB = new geh(this.aA.b(), $$8, this.am);
      this.ah.a(this.aB);
      this.T = new giu(this, this.N, this.U, this.aB, this.h, this.m, this.aJ);
      this.ah.a(this.T);
      this.g = new gbd(this.r, this.N);
      this.ah.a(this.g);
      this.aC = new gpx(this.N);
      this.ah.a(this.aC);
      this.aD = new gpw(this.N);
      this.ah.a(this.aD);
      this.aE = new gpv(this.N);
      this.ah.a(this.aE);
      this.aF = new fgr(this.N);
      this.ah.a(this.aF);
      this.j = new gdg(this, this.T.d(), this.ah, this.S);
      this.ah.a(this.j.d());
      this.f = new gdl(this, this.T, this.aK, this.S);
      this.ah.a(this.f);
      this.bh();
      this.ah.a(this.V);
      this.at = new gdh();
      this.ah.a(this.at);
      this.ah.a(this.au);
      this.l = new fgp(this);
      this.k = new ggz(this);
      fan $$11 = fan.a(this);
      this.aN = new fcd($$11);
      RenderSystem.setErrorCallback(this::a);
      if (this.ao.c != this.Q.k() || this.ao.d != this.Q.l()) {
         StringBuilder $$12 = new StringBuilder(
            "Recovering from unsupported resolution ("
               + this.Q.k()
               + "x"
               + this.Q.l()
               + ").\nPlease make sure you have up-to-date drivers (see aka.ms/mcdriver for instructions)."
         );
         if (eyp.b()) {
            $$12.append("\n\nReported GL debug messages:\n").append(String.join("\n", eyp.a()));
         }

         this.Q.a(this.ao.c, this.ao.d);
         TinyFileDialogs.tinyfd_messageBox("Minecraft", $$12.toString(), "ok", "error", false);
      } else if (this.m.aa().c() && !this.Q.j()) {
         this.Q.h();
         this.m.aa().a(this.Q.j());
      }

      this.Q.a(this.m.N().c());
      this.Q.b(this.m.G().c());
      this.Q.c();
      this.a();
      this.j.a(this.ai.d());
      this.aL = new gty(this, this.ax, this.W);
      this.aM = fyg.a(this.ax, this.W, $$2);
      this.bs = new few(this);
      this.bs.a(this.m.as().c() != ffg.a);
      this.bt = new fyn(this);
      this.bt.a(this.m.A().c());
      this.bu = fzc.a(fyz.a(), this.ax);
      fmo.a(this);
      this.a(new fmi(xo.c("gui.loadingMinecraft")));
      List<ata> $$13 = this.ak.g();
      this.bo.a(ffn.b.a, $$13);
      auk $$14 = this.ah.a(ac.g(), this, I, $$13);
      guj.a.a(guf.C);
      ffe.b $$15 = new ffe.b($$11, $$0.e);
      this.a(new fmo(this, $$14, $$1x -> ac.a($$1x, $$1xx -> this.a($$1xx, $$15), () -> {
            if (aa.aX) {
               this.bj();
            }

            this.bo.a();
            this.a($$15);
         }), false));
      this.aO = gcx.a($$0.e.b());
   }

   private void a(@Nullable ffe.b $$0) {
      if (!this.bx) {
         this.bx = true;
         this.b($$0);
      }
   }

   private void b(@Nullable ffe.b $$0) {
      Runnable $$1 = this.c($$0);
      guj.a.b(guf.C);
      guj.a.b(guf.z);
      guj.a.a(this.aL.a());
      $$1.run();
   }

   public boolean c() {
      return this.bx;
   }

   private Runnable c(@Nullable ffe.b $$0) {
      List<Function<Runnable, fnc>> $$1 = new ArrayList<>();
      this.a($$1);
      Runnable $$2 = () -> {
         if ($$0 != null && $$0.b().a()) {
            gcw.a(this, $$0.b(), $$0.a());
         } else {
            this.a(new fnh(true));
         }
      };

      for (Function<Runnable, fnc> $$3 : Lists.reverse($$1)) {
         fnc $$4 = $$3.apply($$2);
         $$2 = () -> this.a($$4);
      }

      return $$2;
   }

   private void a(List<Function<Runnable, fnc>> $$0) {
      if (this.m.ad) {
         $$0.add($$0x -> new flm(this.m, $$0x));
      }

      BanDetails $$1 = this.H();
      if ($$1 != null) {
         $$0.add($$1x -> flq.a($$1xx -> {
               if ($$1xx) {
                  ac.k().a("https://aka.ms/mcjavamoderation");
               }

               $$1x.run();
            }, $$1));
      }

      ProfileResult $$2 = this.M.join();
      if ($$2 != null) {
         GameProfile $$3 = $$2.profile();
         Set<ProfileActionType> $$4 = $$2.actions();
         if ($$4.contains(ProfileActionType.FORCED_NAME_CHANGE)) {
            $$0.add($$1x -> flq.a($$3.getName(), $$1x));
         }

         if ($$4.contains(ProfileActionType.USING_BANNED_SKIN)) {
            $$0.add(flq::a);
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
      this.Q.b(this.bf());
   }

   private String bf() {
      StringBuilder $$0 = new StringBuilder("Minecraft");
      if (e().a()) {
         $$0.append("*");
      }

      $$0.append(" ");
      $$0.append(aa.b().c());
      fxv $$1 = this.L();
      if ($$1 != null && $$1.k().i()) {
         $$0.append(" - ");
         fyi $$2 = this.S();
         if (this.aP != null && !this.aP.r()) {
            $$0.append(gqe.a("title.singleplayer"));
         } else if ($$2 != null && $$2.e()) {
            $$0.append(gqe.a("title.multiplayer.realms"));
         } else if (this.aP == null && ($$2 == null || !$$2.d())) {
            $$0.append(gqe.a("title.multiplayer.other"));
         } else {
            $$0.append(gqe.a("title.multiplayer.lan"));
         }
      }

      return $$0.toString();
   }

   private UserApiService a(YggdrasilAuthenticationService $$0, fsp $$1) {
      return $$1.a.a.g() != ffs.a.c ? UserApiService.OFFLINE : $$0.createUserApiService($$1.a.a.d());
   }

   public static ayx e() {
      return ayx.a("vanilla", ClientBrandRetriever::getClientModName, "Client", ffe.class);
   }

   private void a(Throwable $$0, @Nullable ffe.b $$1) {
      if (this.ak.d().size() > 1) {
         this.a($$0, null, $$1);
      } else {
         ac.a($$0);
      }
   }

   public void a(Throwable $$0, @Nullable xo $$1, @Nullable ffe.b $$2) {
      F.info("Caught error loading resourcepacks, removing all selected resourcepacks", $$0);
      this.bo.a($$0);
      this.aj.b();
      this.ak.b(Collections.emptyList());
      this.m.i.clear();
      this.m.j.clear();
      this.m.av();
      this.a(true, $$2).thenRun(() -> this.a($$1));
   }

   private void bg() {
      this.a(null);
      if (this.r != null) {
         this.r.Y();
         this.y();
      }

      this.a(new fnh());
      this.a(null);
   }

   private void a(@Nullable xo $$0) {
      fjn $$1 = this.ax();
      fjl.b($$1, fjl.a.c, xo.c("resourcePack.load_fail"), $$0);
   }

   public void f() {
      this.ba = Thread.currentThread();
      if (Runtime.getRuntime().availableProcessors() > 4) {
         this.ba.setPriority(10);
      }

      try {
         boolean $$0 = false;

         while (this.bb) {
            this.bi();

            try {
               bnk $$1 = bnk.a("Renderer");
               boolean $$2 = this.aP().e();
               this.bj = this.a($$2, $$1);
               this.bj.a();
               this.bn.c();
               this.c(!$$0);
               this.bn.d();
               this.bj.b();
               this.b($$2, $$1);
            } catch (OutOfMemoryError var4) {
               if ($$0) {
                  throw var4;
               }

               this.bl();
               this.a(new fmv());
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
      this.ar.a(this.m);
   }

   private void bh() {
      this.V
         .a(
            gsy.a,
            $$0 -> new gsr<>(
                  $$0x -> $$0x.a(cuj.b.a, null, cwh.a.a.c()).stream().map($$0xx -> n.a($$0xx.getString()).trim()).filter($$0xx -> !$$0xx.isEmpty()),
                  $$0x -> Stream.of(lp.h.b($$0x.g())),
                  $$0
               )
         );
      this.V.a(gsy.b, $$0 -> new gss<>($$0x -> $$0x.i().map(axe::b), $$0));
      this.V
         .a(
            gsy.c,
            $$0 -> new gsr<>(
                  $$0x -> {
                     cuj.b $$1 = cuj.b.a($$0x.a());
                     return $$0x.e()
                        .stream()
                        .flatMap($$2 -> $$2.b().a($$0x.a()).a($$1, null, cwh.a.a).stream())
                        .map($$0xx -> n.a($$0xx.getString()).trim())
                        .filter($$0xx -> !$$0xx.isEmpty());
                  },
                  $$0x -> $$0x.e().stream().map($$1 -> lp.h.b($$1.b().a($$0x.a()).g())),
                  $$0
               )
         );
      cta.e().a($$0 -> {
         this.a(gsy.a, $$0);
         this.a(gsy.b, $$0);
      });
   }

   private void a(int $$0, long $$1) {
      this.m.N().a(false);
      this.m.av();
   }

   public eyj h() {
      return this.ao;
   }

   public String i() {
      return this.aa;
   }

   public String j() {
      return this.ab;
   }

   public void a(o $$0) {
      this.bc = () -> this.d($$0);
   }

   public void b(o $$0) {
      this.bc = () -> $$0;
   }

   private void bi() {
      if (this.bc != null) {
         a(this, this.p, this.bc.get());
      }
   }

   public void c(o $$0) {
      o $$1 = this.d($$0);
      this.bl();
      a(this, this.p, $$1);
   }

   public static void a(@Nullable ffe $$0, File $$1, o $$2) {
      File $$3 = new File($$1, "crash-reports");
      File $$4 = new File($$3, "crash-" + ac.f() + "-client.txt");
      alg.a($$2.e());
      if ($$0 != null) {
         $$0.ap.h();
      }

      if ($$2.f() != null) {
         alg.a("#@!@# Game crashed! Crash report saved to: #@!@# " + $$2.f());
         System.exit(-1);
      } else if ($$2.a($$4)) {
         alg.a("#@!@# Game crashed! Crash report saved to: #@!@# " + $$4.getAbsolutePath());
         System.exit(-1);
      } else {
         alg.a("#@?@# Game crashed! Crash report could not be saved. #@?@#");
         System.exit(-2);
      }
   }

   public boolean k() {
      return this.m.P().c();
   }

   public CompletableFuture<Void> l() {
      return this.a(false, null);
   }

   private CompletableFuture<Void> a(boolean $$0, @Nullable ffe.b $$1) {
      if (this.bh != null) {
         return this.bh;
      } else {
         CompletableFuture<Void> $$2 = new CompletableFuture<>();
         if (!$$0 && this.aY instanceof fmo) {
            this.bh = $$2;
            return $$2;
         } else {
            this.ak.a();
            List<ata> $$3 = this.ak.g();
            if (!$$0) {
               this.bo.a(ffn.b.b, $$3);
            }

            this.a(new fmo(this, this.ah.a(ac.g(), this, I, $$3), $$3x -> ac.a($$3x, $$2xx -> {
                  if ($$0) {
                     this.aj.c();
                     this.bg();
                  } else {
                     this.a($$2xx, $$1);
                  }
               }, () -> {
                  this.f.f();
                  this.bo.a();
                  this.aj.d();
                  $$2.complete(null);
                  this.a($$1);
               }), !$$0));
            return $$2;
         }
      }
   }

   private void bj() {
      boolean $$0 = false;
      geg $$1 = this.ao().a();
      gqz $$2 = $$1.a().a();

      for (dey $$3 : lp.e) {
         UnmodifiableIterator $$10 = $$3.l().a().iterator();

         while ($$10.hasNext()) {
            dsb $$4 = (dsb)$$10.next();
            if ($$4.l() == dle.c) {
               gqz $$5 = $$1.b($$4);
               if ($$5 == $$2) {
                  F.debug("Missing model for: {}", $$4);
                  $$0 = true;
               }
            }
         }
      }

      goy $$6 = $$2.e();

      for (dey $$7 : lp.e) {
         UnmodifiableIterator var17 = $$7.l().a().iterator();

         while (var17.hasNext()) {
            dsb $$8 = (dsb)var17.next();
            goy $$9 = $$1.a($$8);
            if (!$$8.i() && $$9 == $$6) {
               F.debug("Missing particle icon for: {}", $$8);
            }
         }
      }

      for (cuj $$10 : lp.h) {
         cuo $$11 = $$10.w();
         String $$12 = $$11.t();
         String $$13 = xo.c($$12).getString();
         if ($$13.toLowerCase(Locale.ROOT).equals($$10.a())) {
            F.debug("Missing translation for: {} {} {}", new Object[]{$$11, $$12, $$10});
         }
      }

      $$0 |= fmp.a();
      $$0 |= gix.a();
      if ($$0) {
         throw new IllegalStateException("Your game data is foobar, fix the errors above!");
      }
   }

   public epv m() {
      return this.ad;
   }

   private void a(String $$0) {
      ffe.a $$1 = this.J();
      if (!$$1.a(this.T())) {
         if (this.l.b()) {
            this.l.b(false);
            this.a(new flt($$0x -> {
               if ($$0x) {
                  ac.k().a("https://aka.ms/JavaAccountSettings");
               }

               this.a(null);
            }, ffe.a.e, "https://aka.ms/JavaAccountSettings", true));
         } else {
            xo $$2 = $$1.a();
            this.l.a($$2, false);
            this.bs.c($$2);
            this.l.b($$1 == ffe.a.d);
         }
      } else {
         this.a(new fls($$0));
      }
   }

   public void a(@Nullable fnc $$0) {
      if (aa.aX && Thread.currentThread() != this.ba) {
         F.error("setScreen called from non-game thread");
      }

      if (this.y != null) {
         this.y.j();
      } else {
         this.a(ffb.a);
      }

      if ($$0 == null && this.aZ) {
         throw new IllegalStateException("Trying to return to in-game GUI during disconnection");
      } else {
         if ($$0 == null && this.r == null) {
            $$0 = new fnh();
         } else if ($$0 == null && this.s.eB()) {
            if (this.s.o()) {
               $$0 = new fma(null, this.r.k().l());
            } else {
               this.s.ga();
            }
         }

         this.y = $$0;
         if (this.y != null) {
            this.y.aE_();
         }

         ezt.a();
         if ($$0 != null) {
            this.n.j();
            ffc.b();
            $$0.b(this, this.Q.o(), this.Q.p());
            this.x = false;
         } else {
            this.ap.i();
            this.n.i();
         }

         this.d();
      }
   }

   public void a(@Nullable fmw $$0) {
      this.aY = $$0;
   }

   public void n() {
      try {
         F.info("Stopping!");

         try {
            this.bs.c();
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
         ac.c = System::nanoTime;
         if (this.bc == null) {
            System.exit(0);
         }
      }
   }

   @Override
   public void close() {
      if (this.br != null) {
         this.br.a();
      }

      try {
         this.aL.close();
         this.au.close();
         this.aA.close();
         this.ar.close();
         this.j.close();
         this.f.close();
         this.ap.g();
         this.g.a();
         this.aD.close();
         this.aC.close();
         this.aE.close();
         this.aF.close();
         this.N.close();
         this.ah.close();
         fke.b();
         ac.j();
      } catch (Throwable var5) {
         F.error("Shutdown failure!", var5);
         throw var5;
      } finally {
         this.P.close();
         this.Q.close();
      }
   }

   private void c(boolean $$0) {
      this.Q.a("Pre render");
      long $$1 = ac.d();
      if (this.Q.b()) {
         this.q();
      }

      if (this.bh != null && !(this.aY instanceof fmo)) {
         CompletableFuture<Void> $$2 = this.bh;
         this.bh = null;
         this.l().thenRun(() -> $$2.complete(null));
      }

      Runnable $$3;
      while (($$3 = this.bg.poll()) != null) {
         $$3.run();
      }

      if ($$0) {
         int $$4 = this.R.a(ac.c());
         this.bj.a("scheduledExecutables");
         this.bA();
         this.bj.c();
         this.bj.a("tick");

         for (int $$5 = 0; $$5 < Math.min(10, $$4); $$5++) {
            this.bj.d("clientTick");
            this.t();
         }

         this.bj.c();
      }

      this.Q.a("Render");
      this.bj.a("sound");
      this.ap.a(this.j.l());
      this.bj.c();
      this.bj.a("render");
      long $$6 = ac.d();
      boolean $$8;
      if (!this.aP().d() && !this.bn.e()) {
         $$8 = false;
         this.bq = 0.0;
      } else {
         $$8 = this.br == null || this.br.b();
         if ($$8) {
            ezq.a().ifPresent(ezq::b);
         }
      }

      RenderSystem.clear(16640, a);
      this.ao.a(true);
      gdf.a();
      this.bj.a("display");
      RenderSystem.enableCull();
      this.bj.b("mouse");
      this.n.a();
      this.bj.c();
      if (!this.x) {
         this.bj.b("gameRenderer");
         this.j.a(this.aT ? this.aU : this.R.a, $$1, $$0);
         this.bj.c();
      }

      if (this.bm != null) {
         this.bj.a("fpsPie");
         fgq $$9 = new fgq(this, this.S.c());
         this.a($$9, this.bm);
         $$9.e();
         this.bj.c();
      }

      this.bj.a("blit");
      this.ao.e();
      this.ao.a(this.Q.k(), this.Q.l());
      this.be = ac.d() - $$6;
      if ($$8) {
         ezq.a().ifPresent($$0x -> this.br = $$0x.c());
      }

      this.bj.b("updateDisplay");
      this.Q.e();
      int $$10 = this.bk();
      if ($$10 < 260) {
         RenderSystem.limitDisplayFPS($$10);
      }

      this.bj.b("yield");
      Thread.yield();
      this.bj.c();
      this.Q.a("Post render");
      this.aX++;
      boolean $$11 = this.U() && (this.y != null && this.y.k() || this.aY != null && this.aY.a()) && !this.aP.r();
      if (this.aT != $$11) {
         if ($$11) {
            this.aU = this.R.a;
         } else {
            this.R.a = this.aU;
         }

         this.aT = $$11;
      }

      long $$12 = ac.d();
      long $$13 = $$12 - this.aV;
      if ($$8) {
         this.bp = $$13;
      }

      this.aP().a($$13);
      this.aV = $$12;
      this.bj.a("fpsUpdate");
      if (this.br != null && this.br.b()) {
         this.bq = (double)this.br.c() * 100.0 / (double)this.bp;
      }

      while (ac.c() >= this.aW + 1000L) {
         String $$14;
         if (this.bq > 0.0) {
            $$14 = " GPU: " + (this.bq > 100.0 ? n.m + "100%" : Math.round(this.bq) + "%");
         } else {
            $$14 = "";
         }

         bd = this.aX;
         this.z = String.format(
            Locale.ROOT,
            "%d fps T: %s%s%s%s B: %d%s",
            bd,
            $$10 == 260 ? "inf" : $$10,
            this.m.N().c() ? " vsync " : " ",
            this.m.j().c(),
            this.m.i().c() == fes.a ? "" : (this.m.i().c() == fes.b ? " fast-clouds" : " fancy-clouds"),
            this.m.E().c(),
            $$14
         );
         this.aW += 1000L;
         this.aX = 0;
      }

      this.bj.c();
   }

   private bnh a(boolean $$0, @Nullable bnk $$1) {
      if (!$$0) {
         this.bl.b();
         if (!this.bn.e() && $$1 == null) {
            return bne.a;
         }
      }

      bnh $$2;
      if ($$0) {
         if (!this.bl.a()) {
            this.bk = 0;
            this.bl.c();
         }

         this.bk++;
         $$2 = this.bl.d();
      } else {
         $$2 = bne.a;
      }

      if (this.bn.e()) {
         $$2 = bnh.a($$2, this.bn.f());
      }

      return bnk.a($$2, $$1);
   }

   private void b(boolean $$0, @Nullable bnk $$1) {
      if ($$1 != null) {
         $$1.b();
      }

      if ($$0) {
         this.bm = this.bl.e();
      } else {
         this.bm = null;
      }

      this.bj = this.bl.d();
   }

   @Override
   public void a() {
      int $$0 = this.Q.a(this.m.aq().c(), this.k());
      this.Q.a((double)$$0);
      if (this.y != null) {
         this.y.a(this, this.Q.o(), this.Q.p());
      }

      eyj $$1 = this.h();
      $$1.a(this.Q.k(), this.Q.l(), a);
      this.j.a(this.Q.k(), this.Q.l());
      this.n.g();
   }

   @Override
   public void b() {
      this.n.k();
   }

   public int o() {
      return bd;
   }

   public long p() {
      return this.be;
   }

   private int bk() {
      return this.r != null || this.y == null && this.aY == null ? this.Q.d() : 60;
   }

   private void bl() {
      try {
         ayw.b();
         this.f.p();
      } catch (Throwable var3) {
      }

      try {
         System.gc();
         if (this.aR && this.aP != null) {
            this.aP.a(true);
         }

         this.b((fnc)(new fmi(xo.c("menu.savingLevel"))));
      } catch (Throwable var2) {
      }

      System.gc();
   }

   public boolean a(Consumer<xo> $$0) {
      if (this.bn.e()) {
         this.bm();
         return false;
      } else {
         Consumer<bng> $$1 = $$1x -> {
            if ($$1x != bnc.a) {
               int $$2x = $$1x.f();
               double $$3x = (double)$$1x.g() / (double)azy.a;
               this.execute(
                  () -> $$0.accept(
                        xo.a("commands.debug.stopped", String.format(Locale.ROOT, "%.2f", $$3x), $$2x, String.format(Locale.ROOT, "%.2f", (double)$$2x / $$3x))
                     )
               );
            }
         };
         Consumer<Path> $$2 = $$1x -> {
            xo $$2x = xo.b($$1x.toString()).a(n.t).a($$1xx -> $$1xx.a(new xm(xm.a.b, $$1x.toFile().getParent())));
            this.execute(() -> $$0.accept(xo.a("debug.profiling.stop", $$2x)));
         };
         ab $$3 = a(new ab(), this, this.al, this.aa, this.m);
         Consumer<List<Path>> $$4 = $$2x -> {
            Path $$3x = this.a($$3, $$2x);
            $$2.accept($$3x);
         };
         Consumer<Path> $$5;
         if (this.aP == null) {
            $$5 = $$1x -> $$4.accept(ImmutableList.of($$1x));
         } else {
            this.aP.b($$3);
            CompletableFuture<Path> $$6 = new CompletableFuture<>();
            CompletableFuture<Path> $$7 = new CompletableFuture<>();
            CompletableFuture.allOf($$6, $$7).thenRunAsync(() -> $$4.accept(ImmutableList.of($$6.join(), $$7.join())), ac.h());
            this.aP.a($$0x -> {
            }, $$7::complete);
            $$5 = $$6::complete;
         }

         this.bn = bot.a(new gcu(ac.c, this.f), ac.c, ac.h(), new boz("client"), $$1x -> {
            this.bn = bou.a;
            $$1.accept($$1x);
         }, $$5);
         return true;
      }
   }

   private void bm() {
      this.bn.a();
      if (this.aP != null) {
         this.aP.aX();
      }
   }

   private void bn() {
      this.bn.b();
      if (this.aP != null) {
         this.aP.aY();
      }
   }

   private Path a(ab $$0, List<Path> $$1) {
      String $$2;
      if (this.T()) {
         $$2 = this.V().bb().e();
      } else {
         fyi $$3 = this.S();
         $$2 = $$3 != null ? $$3.a : "unknown";
      }

      Path $$7;
      try {
         String $$5 = String.format(Locale.ROOT, "%s-%s-%s", ac.f(), $$2, aa.b().b());
         String $$6 = v.a(boz.a, $$5, ".zip");
         $$7 = boz.a.resolve($$6);
      } catch (IOException var21) {
         throw new UncheckedIOException(var21);
      }

      try (ayj $$10 = new ayj($$7)) {
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
      if (this.bm != null) {
         List<bnj> $$1 = this.bm.a(this.bA);
         if (!$$1.isEmpty()) {
            bnj $$2 = $$1.remove(0);
            if ($$0 == 0) {
               if (!$$2.d.isEmpty()) {
                  int $$3 = this.bA.lastIndexOf(30);
                  if ($$3 >= 0) {
                     this.bA = this.bA.substring(0, $$3);
                  }
               }
            } else {
               $$0--;
               if ($$0 < $$1.size() && !"unspecified".equals($$1.get($$0).d)) {
                  if (!this.bA.isEmpty()) {
                     this.bA = this.bA + "\u001e";
                  }

                  this.bA = this.bA + $$1.get($$0).d;
               }
            }
         }
      }
   }

   private void a(fgq $$0, bng $$1) {
      List<bnj> $$2 = $$1.a(this.bA);
      bnj $$3 = $$2.remove(0);
      RenderSystem.clear(256, a);
      RenderSystem.setShader(gdg::p);
      Matrix4f $$4 = new Matrix4f().setOrtho(0.0F, (float)this.Q.k(), (float)this.Q.l(), 0.0F, 1000.0F, 3000.0F);
      RenderSystem.setProjectionMatrix($$4, faf.b);
      Matrix4fStack $$5 = RenderSystem.getModelViewStack();
      $$5.pushMatrix();
      $$5.translation(0.0F, 0.0F, -2000.0F);
      RenderSystem.applyModelViewMatrix();
      RenderSystem.lineWidth(1.0F);
      ezz $$6 = ezz.b();
      ezs $$7 = $$6.d();
      int $$8 = 160;
      int $$9 = this.Q.k() - 160 - 10;
      int $$10 = this.Q.l() - 320;
      RenderSystem.enableBlend();
      $$7.a(fac.b.h, ezv.n);
      $$7.a((double)((float)$$9 - 176.0F), (double)((float)$$10 - 96.0F - 16.0F), 0.0).a(200, 0, 0, 0).e();
      $$7.a((double)((float)$$9 - 176.0F), (double)($$10 + 320), 0.0).a(200, 0, 0, 0).e();
      $$7.a((double)((float)$$9 + 176.0F), (double)($$10 + 320), 0.0).a(200, 0, 0, 0).e();
      $$7.a((double)((float)$$9 + 176.0F), (double)((float)$$10 - 96.0F - 16.0F), 0.0).a(200, 0, 0, 0).e();
      $$6.c();
      RenderSystem.disableBlend();
      double $$11 = 0.0;

      for (bnj $$12 : $$2) {
         int $$13 = ayy.a($$12.a / 4.0) + 1;
         $$7.a(fac.b.g, ezv.n);
         int $$14 = $$12.a();
         int $$15 = $$14 >> 16 & 0xFF;
         int $$16 = $$14 >> 8 & 0xFF;
         int $$17 = $$14 & 0xFF;
         $$7.a((double)$$9, (double)$$10, 0.0).a($$15, $$16, $$17, 255).e();

         for (int $$18 = $$13; $$18 >= 0; $$18--) {
            float $$19 = (float)(($$11 + $$12.a * (double)$$18 / (double)$$13) * (float) (Math.PI * 2) / 100.0);
            float $$20 = ayy.a($$19) * 160.0F;
            float $$21 = ayy.b($$19) * 160.0F * 0.5F;
            $$7.a((double)((float)$$9 + $$20), (double)((float)$$10 - $$21), 0.0).a($$15, $$16, $$17, 255).e();
         }

         $$6.c();
         $$7.a(fac.b.f, ezv.n);

         for (int $$22 = $$13; $$22 >= 0; $$22--) {
            float $$23 = (float)(($$11 + $$12.a * (double)$$22 / (double)$$13) * (float) (Math.PI * 2) / 100.0);
            float $$24 = ayy.a($$23) * 160.0F;
            float $$25 = ayy.b($$23) * 160.0F * 0.5F;
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
      String $$27 = bng.b($$3.d);
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
         bnj $$31 = $$2.get($$30);
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
      this.bb = false;
   }

   public boolean r() {
      return this.bb;
   }

   public void b(boolean $$0) {
      if (this.y == null) {
         boolean $$1 = this.U() && !this.aP.r();
         if ($$1) {
            this.a(new fmx(!$$0));
            this.ap.e();
         } else {
            this.a(new fmx(true));
         }
      }
   }

   private void d(boolean $$0) {
      if (!$$0) {
         this.w = 0;
      }

      if (this.w <= 0 && !this.s.fv()) {
         if ($$0 && this.v != null && this.v.c() == evo.a.b) {
            evm $$1 = (evm)this.v;
            iz $$2 = $$1.a();
            if (!this.r.a_($$2).i()) {
               je $$3 = $$1.b();
               if (this.q.b($$2, $$3)) {
                  this.g.a($$2, $$3);
                  this.s.a(bqs.a);
               }
            }
         } else {
            this.q.b();
         }
      }
   }

   private boolean bo() {
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
         cuo $$0 = this.s.b(bqs.a);
         if (!$$0.a(this.r.J())) {
            return false;
         } else {
            boolean $$1 = false;
            switch (this.v.c()) {
               case c:
                  this.q.a(this.s, ((evn)this.v).a());
                  break;
               case b:
                  evm $$2 = (evm)this.v;
                  iz $$3 = $$2.a();
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

            this.s.a(bqs.a);
            return $$1;
         }
      }
   }

   private void bp() {
      if (!this.q.k()) {
         this.aS = 4;
         if (!this.s.B()) {
            if (this.v == null) {
               F.warn("Null returned as 'hitResult', this shouldn't happen!");
            }

            for (bqs $$0 : bqs.values()) {
               cuo $$1 = this.s.b($$0);
               if (!$$1.a(this.r.J())) {
                  return;
               }

               if (this.v != null) {
                  switch (this.v.c()) {
                     case c:
                        evn $$2 = (evn)this.v;
                        bst $$3 = $$2.a();
                        if (!this.r.C_().a($$3.dp())) {
                           return;
                        }

                        bqt $$4 = this.q.a(this.s, $$3, $$2, $$0);
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
                        evm $$5 = (evm)this.v;
                        int $$6 = $$1.I();
                        bqt $$7 = this.q.a(this.s, $$0, $$5);
                        if ($$7.a()) {
                           if ($$7.b()) {
                              this.s.a($$0);
                              if (!$$1.e() && ($$1.I() != $$6 || this.q.f())) {
                                 this.j.b.a($$0);
                              }
                           }

                           return;
                        }

                        if ($$7 == bqt.f) {
                           return;
                        }
                  }
               }

               if (!$$1.e()) {
                  bqt $$8 = this.q.a(this.s, $$0);
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

   public gtp s() {
      return this.aq;
   }

   public void t() {
      this.bz++;
      if (this.r != null && !this.aT) {
         this.r.s().m();
      }

      if (this.aS > 0) {
         this.aS--;
      }

      this.bj.a("gui");
      this.bt.a();
      this.l.a(this.aT);
      this.bj.c();
      this.j.b(1.0F);
      this.aH.a(this.r, this.v);
      this.bj.a("gameMode");
      if (!this.aT && this.r != null) {
         this.q.c();
      }

      this.bj.b("textures");
      boolean $$0 = this.r == null || this.r.s().i();
      if ($$0) {
         this.N.e();
      }

      if (this.y != null || this.s == null) {
         if (this.y instanceof fmk $$1 && !this.s.fL()) {
            $$1.m();
         }
      } else if (this.s.eB() && !(this.y instanceof fma)) {
         this.a(null);
      } else if (this.s.fL() && this.r != null) {
         this.a(new fmk());
      }

      if (this.y != null) {
         this.w = 10000;
      }

      if (this.y != null) {
         fnc.a(() -> this.y.e(), "Ticking screen", this.y.getClass().getCanonicalName());
      }

      if (!this.aP().d()) {
         this.l.l();
      }

      if (this.aY == null && this.y == null) {
         this.bj.b("Keybindings");
         this.br();
         if (this.w > 0) {
            this.w--;
         }
      }

      if (this.r != null) {
         this.bj.b("gameRenderer");
         if (!this.aT) {
            this.j.e();
         }

         this.bj.b("levelRenderer");
         if (!this.aT) {
            this.f.o();
         }

         this.bj.b("level");
         if (!this.aT) {
            this.r.f();
         }
      } else if (this.j.f() != null) {
         this.j.b();
      }

      if (!this.aT) {
         this.aq.a();
      }

      this.ap.a(this.aT);
      if (this.r != null) {
         if (!this.aT) {
            if (!this.m.s && this.bq()) {
               xo $$2 = xo.c("tutorial.socialInteractions.title");
               xo $$3 = xo.a("tutorial.socialInteractions.description", gux.a("socialInteractions"));
               this.bi = new fjo(fjo.a.f, $$2, $$3, true);
               this.aH.a(this.bi, 160);
               this.m.s = true;
               this.m.av();
            }

            this.aH.d();

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

         this.bj.b("animateTick");
         if (!this.aT && $$0) {
            this.r.b(this.s.dt(), this.s.dv(), this.s.dz());
         }

         this.bj.b("particles");
         if (!this.aT && $$0) {
            this.g.b();
         }
      } else if (this.aQ != null) {
         this.bj.b("pendingConnection");
         this.aQ.b();
      }

      this.bj.b("keyboard");
      this.o.b();
      this.bj.c();
   }

   private boolean bq() {
      return !this.aR || this.aP != null && this.aP.r();
   }

   private void br() {
      while (this.m.O.g()) {
         feq $$0 = this.m.aA();
         this.m.a(this.m.aA().c());
         if ($$0.a() != this.m.aA().a()) {
            this.j.a(this.m.aA().a() ? this.an() : null);
         }

         this.f.r();
      }

      while (this.m.P.g()) {
         this.m.aa = !this.m.aa;
      }

      for (int $$1 = 0; $$1 < 9; $$1++) {
         boolean $$2 = this.m.U.e();
         boolean $$3 = this.m.V.e();
         if (this.m.T[$$1].g()) {
            if (this.s.N_()) {
               this.l.g().a($$1);
            } else if (!this.s.f() || this.y != null || !$$3 && !$$2) {
               this.s.gc().k = $$1;
            } else {
               fop.a(this, $$1, $$3, $$2);
            }
         }
      }

      while (this.m.M.g()) {
         if (!this.bq()) {
            this.s.a(J, true);
            this.bs.c(J);
         } else {
            if (this.bi != null) {
               this.aH.a(this.bi);
               this.bi = null;
            }

            this.a(new frl());
         }
      }

      while (this.m.D.g()) {
         if (this.q.g()) {
            this.s.i();
         } else {
            this.aH.a();
            this.a(new fpb(this.s));
         }
      }

      while (this.m.S.g()) {
         this.a(new fnr(this.s.cz.p()));
      }

      while (this.m.E.g()) {
         if (!this.s.N_()) {
            this.L().b(new ahz(ahz.a.g, iz.c, je.a));
         }
      }

      while (this.m.F.g()) {
         if (!this.s.N_() && this.s.a(fnc.s())) {
            this.s.a(bqs.a);
         }
      }

      while (this.m.J.g()) {
         this.a("");
      }

      if (this.y == null && this.aY == null && this.m.L.g()) {
         this.a("/");
      }

      boolean $$4 = false;
      if (this.s.fv()) {
         if (!this.m.G.e()) {
            this.q.b(this.s);
         }

         while (this.m.H.g()) {
         }

         while (this.m.G.g()) {
         }

         while (this.m.I.g()) {
         }
      } else {
         while (this.m.H.g()) {
            $$4 |= this.bo();
         }

         while (this.m.G.g()) {
            this.bp();
         }

         while (this.m.I.g()) {
            this.bt();
         }
      }

      if (this.m.G.e() && this.aS == 0 && !this.s.fv()) {
         this.bp();
      }

      this.d(this.y == null && !$$4 && this.m.H.e() && this.n.h());
   }

   public gty u() {
      return this.aL;
   }

   public double v() {
      return this.bq;
   }

   public fyg w() {
      return this.aM;
   }

   public fsb x() {
      return new fsb(this, this.ad);
   }

   public void a(epv.c $$0, atz $$1, amb $$2, boolean $$3) {
      this.y();
      this.X.set(null);
      Instant $$4 = Instant.now();

      try {
         $$0.a($$2.c().a(), $$2.d());
         aly $$5 = aly.a(this.av, this.p);
         $$5.f().a(this);
         dqs.a($$5, this);
         auy.a(false);
         this.aP = MinecraftServer.a((Function<Thread, gtd>)($$4x -> new gtd($$4x, this, $$0, $$1, $$2, $$5, $$0xx -> {
               arr $$1xx = arr.b($$0xx + 0);
               this.X.set($$1xx);
               return arq.a($$1xx, this.bg::add);
            })));
         this.aR = true;
         this.a(fyz.a());
         this.aO.a(gcx.c.a, $$0.f(), $$2.d().e());
      } catch (Throwable var11) {
         o $$7 = o.a(var11, "Starting integrated server");
         p $$8 = $$7.a("Starting integrated server");
         $$8.a("Level ID", $$0.f());
         $$8.a("Level Name", () -> $$2.d().e());
         throw new y($$7);
      }

      while (this.X.get() == null) {
         Thread.yield();
      }

      fmm $$9 = new fmm(this.X.get());
      this.a($$9);
      this.bj.a("waitForServer");

      for (; !this.aP.aj() || this.aY != null; this.bi()) {
         $$9.e();
         this.c(false);

         try {
            Thread.sleep(16L);
         } catch (InterruptedException var10) {
         }
      }

      this.bj.c();
      Duration $$10 = Duration.between($$4, Instant.now());
      SocketAddress $$11 = this.aP.ai().a();
      wj $$12 = wj.a($$11);
      $$12.a($$11.toString(), 0, new fxt($$12, this, null, null, $$3, $$10, $$0x -> {
      }, null));
      $$12.a(new ajl(this.X().c(), this.X().b()));
      this.aQ = $$12;
   }

   public void a(fxu $$0, fna.a $$1) {
      this.e(new fna(() -> false, $$1));
      this.r = $$0;
      this.a($$0);
      if (!this.aR) {
         aly $$2 = aly.a(this.av, this.p);
         $$2.f().a(this);
         dqs.a($$2, this);
         auy.a(false);
      }
   }

   public void y() {
      this.a(new fmz(true), false);
   }

   public void b(fnc $$0) {
      this.a($$0, false);
   }

   public void a(fnc $$0, boolean $$1) {
      fxv $$2 = this.L();
      if ($$2 != null) {
         this.bz();
         $$2.h();
         if (!$$1) {
            this.B();
         }
      }

      this.aI.b();
      if (this.bn.e()) {
         this.bn();
      }

      gtd $$3 = this.aP;
      this.aP = null;
      this.j.h();
      this.q = null;
      this.bs.b();
      this.aZ = true;

      try {
         this.e($$0);
         if (this.r != null) {
            if ($$3 != null) {
               this.bj.a("waitForServer");

               while (!$$3.H()) {
                  this.c(false);
               }

               this.bj.c();
            }

            this.l.i();
            this.aR = false;
         }

         this.r = null;
         this.a(null);
         this.s = null;
      } finally {
         this.aZ = false;
      }

      dqs.b();
   }

   public void B() {
      this.aj.i();
      this.bA();
   }

   public void c(fnc $$0) {
      fxv $$1 = this.L();
      if ($$1 != null) {
         $$1.i();
      }

      if (this.bn.e()) {
         this.bn();
      }

      this.j.h();
      this.q = null;
      this.bs.b();
      this.aZ = true;

      try {
         this.e($$0);
         this.l.i();
         this.r = null;
         this.a(null);
         this.s = null;
      } finally {
         this.aZ = false;
      }

      dqs.b();
   }

   private void e(fnc $$0) {
      this.bj.a("forcedTick");
      this.ap.f();
      this.t = null;
      this.aQ = null;
      this.a($$0);
      this.c(false);
      this.bj.c();
   }

   public void d(fnc $$0) {
      this.bj.a("forcedTick");
      this.a($$0);
      this.c(false);
      this.bj.c();
   }

   private void a(@Nullable fxu $$0) {
      this.f.a($$0);
      this.g.a($$0);
      this.aK.a($$0);
      this.d();
   }

   private UserProperties bs() {
      return this.ay.join();
   }

   public boolean C() {
      return this.D() && this.m.ai().c();
   }

   public boolean D() {
      return this.E() && this.bs().flag(UserFlag.OPTIONAL_TELEMETRY_AVAILABLE);
   }

   public boolean E() {
      return aa.aX ? false : this.bs().flag(UserFlag.TELEMETRY_ENABLED);
   }

   public boolean F() {
      return this.af && this.bs().flag(UserFlag.SERVERS_ALLOWED) && this.H() == null && !this.I();
   }

   public boolean G() {
      return this.bs().flag(UserFlag.REALMS_ALLOWED) && this.H() == null;
   }

   @Nullable
   public BanDetails H() {
      return (BanDetails)this.bs().bannedScopes().get("MULTIPLAYER");
   }

   public boolean I() {
      ProfileResult $$0 = this.M.getNow(null);
      return $$0 != null && $$0.actions().contains(ProfileActionType.FORCED_NAME_CHANGE);
   }

   public boolean a(UUID $$0) {
      return this.J().a(false) ? this.aI.c($$0) : (this.s == null || !$$0.equals(this.s.cz())) && !$$0.equals(ac.e);
   }

   public ffe.a J() {
      if (this.m.m().c() == cmu.c) {
         return ffe.a.b;
      } else if (!this.ag) {
         return ffe.a.c;
      } else {
         return !this.bs().flag(UserFlag.CHAT_ALLOWED) ? ffe.a.d : ffe.a.a;
      }
   }

   public final boolean K() {
      return this.ae;
   }

   @Nullable
   public fxv L() {
      return this.s == null ? null : this.s.cz;
   }

   public static boolean M() {
      return !E.m.Y;
   }

   public static boolean N() {
      return E.m.j().c().a() >= fex.b.a();
   }

   public static boolean O() {
      return !E.j.a() && E.m.j().c().a() >= fex.c.a();
   }

   public static boolean P() {
      return E.m.k().c();
   }

   private void bt() {
      if (this.v != null && this.v.c() != evo.a.a) {
         boolean $$0 = this.s.gd().d;
         dpg $$1 = null;
         evo.a $$2 = this.v.c();
         cuo $$6;
         if ($$2 == evo.a.b) {
            iz $$3 = ((evm)this.v).a();
            dsb $$4 = this.r.a_($$3);
            if ($$4.i()) {
               return;
            }

            dey $$5 = $$4.b();
            $$6 = $$5.a((dca)this.r, $$3, $$4);
            if ($$6.e()) {
               return;
            }

            if ($$0 && fnc.s() && $$4.t()) {
               $$1 = this.r.c_($$3);
            }
         } else {
            if ($$2 != evo.a.c || !$$0) {
               return;
            }

            bst $$7 = ((evn)this.v).a();
            $$6 = $$7.dC();
            if ($$6 == null) {
               return;
            }
         }

         if ($$6.e()) {
            String $$10 = "";
            if ($$2 == evo.a.b) {
               $$10 = lp.e.b(this.r.a_(((evm)this.v).a()).b()).toString();
            } else if ($$2 == evo.a.c) {
               $$10 = lp.g.b(((evn)this.v).a().ak()).toString();
            }

            F.warn("Picking on: [{}] {} gave null item", $$2, $$10);
         } else {
            cmv $$11 = this.s.gc();
            if ($$1 != null) {
               this.a($$6, $$1, this.r.H_());
            }

            int $$12 = $$11.c($$6);
            if ($$0) {
               $$11.b($$6);
               this.q.a(this.s.b(bqs.a), 36 + $$11.k);
            } else if ($$12 != -1) {
               if (cmv.d($$12)) {
                  $$11.k = $$12;
               } else {
                  this.q.a($$12);
               }
            }
         }
      }
   }

   private void a(cuo $$0, dpg $$1, jw $$2) {
      ur $$3 = $$1.f($$2);
      $$1.a($$3);
      csm.a($$0, $$1.r(), $$3);
      $$0.b($$1.s());
   }

   public o d(o $$0) {
      ab $$1 = $$0.g();
      a($$1, this, this.al, this.aa, this.m);
      this.a($$0.a("Uptime"));
      if (this.r != null) {
         this.r.a($$0);
      }

      if (this.aP != null) {
         this.aP.b($$1);
      }

      this.bo.a($$0);
      return $$0;
   }

   public static void a(@Nullable ffe $$0, @Nullable gqg $$1, String $$2, @Nullable ffi $$3, o $$4) {
      ab $$5 = $$4.g();
      a($$5, $$0, $$1, $$2, $$3);
   }

   private static String a(double $$0) {
      return String.format(Locale.ROOT, "%.3fs", $$0);
   }

   private void a(p $$0) {
      $$0.a("JVM uptime", () -> a((double)ManagementFactory.getRuntimeMXBean().getUptime() / 1000.0));
      $$0.a("Wall uptime", () -> a((double)(System.currentTimeMillis() - this.by) / 1000.0));
      $$0.a("High-res time", () -> a((double)ac.c() / 1000.0));
      $$0.a("Client ticks", () -> String.format(Locale.ROOT, "%d ticks / %.3fs", this.bz, (double)this.bz / 20.0));
   }

   private static ab a(ab $$0, @Nullable ffe $$1, @Nullable gqg $$2, String $$3, @Nullable ffi $$4) {
      $$0.a("Launched Version", () -> $$3);
      String $$5 = be();
      if ($$5 != null) {
         $$0.a("Launcher name", $$5);
      }

      $$0.a("Backend library", RenderSystem::getBackendDescription);
      $$0.a("Backend API", RenderSystem::getApiDescription);
      $$0.a("Window size", () -> $$1 != null ? $$1.Q.k() + "x" + $$1.Q.l() : "<not initialized>");
      $$0.a("GL Caps", RenderSystem::getCapsString);
      $$0.a("GL debug messages", () -> eyp.b() ? String.join("\n", eyp.a()) : "<disabled>");
      $$0.a("Using VBOs", () -> "Yes");
      $$0.a("Is Modded", () -> e().b());
      $$0.a("Universe", () -> $$1 != null ? Long.toHexString($$1.K) : "404");
      $$0.a("Type", "Client (map_client.txt)");
      if ($$4 != null) {
         if ($$1 != null) {
            String $$6 = $$1.ai().m();
            if ($$6 != null) {
               $$0.a("GPU Warnings", $$6);
            }
         }

         $$0.a("Graphics mode", $$4.j().c().toString());
         $$0.a("Render Distance", $$4.aD() + "/" + $$4.e().c() + " chunks");
      }

      if ($$1 != null) {
         $$0.a("Resource Packs", () -> atz.a($$1.ac().f()));
      }

      if ($$2 != null) {
         $$0.a("Current Language", () -> $$2.a());
      }

      $$0.a("Locale", String.valueOf(Locale.getDefault()));
      $$0.a("CPU", eyq::b);
      return $$0;
   }

   public static ffe Q() {
      return E;
   }

   public CompletableFuture<Void> R() {
      return this.a(this::l).thenCompose($$0 -> (CompletionStage<Void>)$$0);
   }

   public void a(fyz $$0) {
      if (!this.bu.a($$0)) {
         this.bu = fzc.a($$0, this.ax);
      }
   }

   @Nullable
   public fyi S() {
      return x.a(this.L(), fxv::w);
   }

   public boolean T() {
      return this.aR;
   }

   public boolean U() {
      return this.aR && this.aP != null;
   }

   @Nullable
   public gtd V() {
      return this.aP;
   }

   public boolean W() {
      gtd $$0 = this.V();
      return $$0 != null && !$$0.r();
   }

   public boolean b(UUID $$0) {
      return $$0.equals(this.X().b());
   }

   public ffs X() {
      return this.W;
   }

   public GameProfile Y() {
      ProfileResult $$0 = this.M.join();
      return $$0 != null ? $$0.profile() : new GameProfile(this.W.b(), this.W.c());
   }

   public Proxy Z() {
      return this.ac;
   }

   public goz aa() {
      return this.N;
   }

   public auo ab() {
      return this.ah;
   }

   public atz ac() {
      return this.ak;
   }

   public ate ad() {
      return this.ai;
   }

   public gro ae() {
      return this.aj;
   }

   public Path af() {
      return this.L;
   }

   public gqg ag() {
      return this.al;
   }

   public Function<ale, goy> a(ale $$0) {
      return this.aA.a($$0)::a;
   }

   public boolean ah() {
      return this.aT;
   }

   public gdh ai() {
      return this.at;
   }

   public gtu aj() {
      return this.ap;
   }

   public avw ak() {
      avw $$0 = x.a(this.y, fnc::D);
      if ($$0 != null) {
         return $$0;
      } else if (this.s != null) {
         if (this.s.dP().af() == dbx.j) {
            return this.l.j().b() ? avx.d : avx.e;
         } else {
            ji<dcw> $$1 = this.s.dP().t(this.s.dp());
            if (!this.aq.c(avx.f) && (!this.s.bj() || !$$1.a(awn.Z))) {
               return this.s.dP().af() != dbx.i && this.s.gd().d && this.s.gd().c ? avx.b : $$1.a().o().orElse(avx.g);
            } else {
               return avx.f;
            }
         }
      } else {
         return avx.a;
      }
   }

   public MinecraftSessionService al() {
      return this.aw;
   }

   public gpz am() {
      return this.az;
   }

   @Nullable
   public bst an() {
      return this.t;
   }

   public void a(bst $$0) {
      this.t = $$0;
      this.j.a($$0);
   }

   public boolean b(bst $$0) {
      return $$0.cg() || this.s != null && this.s.N_() && this.m.R.e() && $$0.ak() == bsz.by;
   }

   @Override
   protected Thread az() {
      return this.ba;
   }

   @Override
   protected Runnable f(Runnable $$0) {
      return $$0;
   }

   @Override
   protected boolean e(Runnable $$0) {
      return true;
   }

   public geh ao() {
      return this.aB;
   }

   public giu ap() {
      return this.T;
   }

   public gfm aq() {
      return this.aK;
   }

   public gju ar() {
      return this.U;
   }

   public <T> gsz<T> a(gsy.a<T> $$0) {
      return this.V.a($$0);
   }

   public <T> void a(gsy.a<T> $$0, List<T> $$1) {
      this.V.a($$0, $$1);
   }

   public DataFixer as() {
      return this.O;
   }

   public float at() {
      return this.R.a;
   }

   public float au() {
      return this.R.b;
   }

   public fgh av() {
      return this.am;
   }

   public boolean aw() {
      return this.s != null && this.s.gs() || this.m.V().c();
   }

   public fjn ax() {
      return this.aG;
   }

   public gux aA() {
      return this.aH;
   }

   public boolean aB() {
      return this.bf;
   }

   public ffa aC() {
      return this.Y;
   }

   public grf aD() {
      return this.aA;
   }

   public gpx aE() {
      return this.aC;
   }

   public gpw aF() {
      return this.aD;
   }

   public gpv aG() {
      return this.aE;
   }

   public fgr aH() {
      return this.aF;
   }

   @Override
   public void a(boolean $$0) {
      this.bf = $$0;
   }

   public xo a(File $$0, int $$1, int $$2) {
      int $$3 = this.Q.k();
      int $$4 = this.Q.l();
      eyj $$5 = new eyk($$1, $$2, true, a);
      float $$6 = this.s.dH();
      float $$7 = this.s.dF();
      float $$8 = this.s.P;
      float $$9 = this.s.O;
      this.j.b(false);

      yc var12;
      try {
         this.j.c(true);
         this.f.e();
         this.Q.b($$1);
         this.Q.c($$2);

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

            ffo.a($$0, "panorama_" + $$10 + ".png", $$5, $$0x -> {
            });
         }

         xo $$11 = xo.b($$0.getName()).a(n.t).a($$1x -> $$1x.a(new xm(xm.a.b, $$0.getAbsolutePath())));
         return xo.a("screenshot.success", $$11);
      } catch (Exception var18) {
         F.error("Couldn't save image", var18);
         var12 = xo.a("screenshot.failure", var18.getMessage());
      } finally {
         this.s.s($$6);
         this.s.r($$7);
         this.s.P = $$8;
         this.s.O = $$9;
         this.j.b(true);
         this.Q.b($$3);
         this.Q.c($$4);
         $$5.a();
         this.j.c(false);
         this.f.e();
         this.h().a(true);
      }

      return var12;
   }

   private xo a(File $$0, int $$1, int $$2, int $$3, int $$4) {
      try {
         ByteBuffer $$5 = eyq.a($$1 * $$2 * 3);
         ffo $$6 = new ffo($$0, $$3, $$4, $$2);
         float $$7 = (float)$$3 / (float)$$1;
         float $$8 = (float)$$4 / (float)$$2;
         float $$9 = $$7 > $$8 ? $$7 : $$8;

         for (int $$10 = ($$4 - 1) / $$2 * $$2; $$10 >= 0; $$10 -= $$2) {
            for (int $$11 = 0; $$11 < $$3; $$11 += $$1) {
               RenderSystem.setShaderTexture(0, gox.e);
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
         eyq.a($$5);
         xo $$15 = xo.b($$14.getName()).a(n.t).a($$1x -> $$1x.a(new xm(xm.a.b, $$14.getAbsolutePath())));
         return xo.a("screenshot.success", $$15);
      } catch (Exception var15) {
         F.warn("Couldn't save screenshot", var15);
         return xo.a("screenshot.failure", var15.getMessage());
      }
   }

   public bnh aI() {
      return this.bj;
   }

   @Nullable
   public arr aJ() {
      return this.X.get();
   }

   public gqa aK() {
      return this.as;
   }

   @Nullable
   public fmw aL() {
      return this.aY;
   }

   public frj aM() {
      return this.aI;
   }

   public boolean aN() {
      return false;
   }

   public ezb aO() {
      return this.Q;
   }

   public fhl aP() {
      return this.l.k();
   }

   public gdt aQ() {
      return this.S;
   }

   public void b(int $$0) {
      this.aA.a($$0);
   }

   public fwv aR() {
      return this.aJ;
   }

   public boolean aS() {
      return this.bs().flag(UserFlag.PROFANITY_FILTER_ENABLED);
   }

   public void aT() {
      this.aI.a();
      this.w().a();
   }

   @Nullable
   public azl aU() {
      return azl.a(this.av.getServicesKeySet(), ServicesKeyType.PROFILE_KEY);
   }

   public boolean aV() {
      return !this.av.getServicesKeySet().keys(ServicesKeyType.PROFILE_KEY).isEmpty();
   }

   public ffb aW() {
      return this.Z;
   }

   public void a(ffb $$0) {
      this.Z = $$0;
   }

   public few aX() {
      return this.bs;
   }

   public fyn aY() {
      return this.bt;
   }

   public fzc aZ() {
      return this.bu;
   }

   public fcd ba() {
      return this.aN;
   }

   public gcx bb() {
      return this.aO;
   }

   public fet bc() {
      return this.bv;
   }

   public evg bd() {
      return this.bw;
   }

   private float a(float $$0) {
      if (this.r != null) {
         bre $$1 = this.r.s();
         if ($$1.i()) {
            return Math.max($$0, $$1.g());
         }
      }

      return $$0;
   }

   @Nullable
   public static String be() {
      return System.getProperty("minecraft.launcher.brand");
   }

   public static enum a {
      a(xn.a) {
         @Override
         public boolean a(boolean $$0) {
            return true;
         }
      },
      b(xo.c("chat.disabled.options").a(n.m)) {
         @Override
         public boolean a(boolean $$0) {
            return false;
         }
      },
      c(xo.c("chat.disabled.launcher").a(n.m)) {
         @Override
         public boolean a(boolean $$0) {
            return $$0;
         }
      },
      d(xo.a("chat.disabled.profile", xo.d(ffe.E.m.J.h())).a(n.m)) {
         @Override
         public boolean a(boolean $$0) {
            return $$0;
         }
      };

      static final xo e = xo.c("chat.disabled.profile.moreInfo");
      private final xo f;

      a(final xo $$0) {
         this.f = $$0;
      }

      public xo a() {
         return this.f;
      }

      public abstract boolean a(boolean var1);
   }

   static record b(fan a, fsp.c b) {
   }
}
