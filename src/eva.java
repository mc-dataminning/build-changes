import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.google.common.collect.Queues;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.exceptions.AuthenticationException;
import com.mojang.authlib.minecraft.BanDetails;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import com.mojang.authlib.minecraft.UserApiService;
import com.mojang.authlib.minecraft.UserApiService.UserFlag;
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
import org.lwjgl.util.tinyfd.TinyFileDialogs;
import org.slf4j.Logger;

public class eva extends bip<Runnable> implements eoy {
   static eva E;
   private static final Logger F = LogUtils.getLogger();
   public static final boolean a = ac.i() == ac.a.d;
   private static final int G = 10;
   public static final ahd b = new ahd("default");
   public static final ahd c = new ahd("uniform");
   public static final ahd d = new ahd("alt");
   private static final ahd H = new ahd("regional_compliancies.json");
   private static final CompletableFuture<avm> I = CompletableFuture.completedFuture(avm.a);
   private static final vd J = vd.c("multiplayer.socialInteractions.not_available");
   public static final String e = "Please make sure you have up-to-date drivers (see aka.ms/mcdriver for instructions).";
   private final long K = Double.doubleToLongBits(Math.PI);
   private final Path L;
   private final CompletableFuture<ProfileResult> M;
   private final geg N;
   private final DataFixer O;
   private final ftr P;
   private final eox Q;
   private final evn R = new evn(20.0F, 0L, this::a);
   private final ftf S;
   public final fsx f;
   private final fyd T;
   private final fzd U;
   public final fqp g;
   private final ghz V = new ghz();
   private final evp W;
   public final ewk h;
   public final ewk i;
   public final fss j;
   public final fwk k;
   private final AtomicReference<anm> X = new AtomicReference<>();
   public final ewl l;
   public final eve m;
   private final euw Y;
   public final evb n;
   public final euz o;
   private eux Z = eux.a;
   public final File p;
   private final String aa;
   private final String ab;
   private final Proxy ac;
   private final egf ad;
   private final boolean ae;
   private final boolean af;
   private final boolean ag;
   private final boolean ah;
   private final apz ai;
   private final aot aj;
   private final gey ak;
   private final apn al;
   private final gfn am;
   private final ewd an;
   private final ewh ao;
   private final eof ap;
   private final gir aq;
   private final gim ar;
   private final ezm as;
   private final gfh at;
   private final fst au;
   private final evg av = new evg(H, eva::b);
   private final YggdrasilAuthenticationService aw;
   private final MinecraftSessionService ax;
   private final UserApiService ay;
   private final gfg az;
   private final ggm aA;
   private final ftt aB;
   private final gfe aC;
   private final gfd aD;
   private final ewn aE;
   private final ezh aF;
   private final gju aG;
   private final fhb aH;
   private final fml aI;
   private final fuy aJ;
   private final giv aK;
   private final fnu aL;
   private final erz aM;
   private final fsj aN;
   @Nullable
   public fnr q;
   @Nullable
   public fnk r;
   @Nullable
   public fsb s;
   @Nullable
   private gie aO;
   @Nullable
   private ue aP;
   private boolean aQ;
   @Nullable
   public blp t;
   @Nullable
   public blp u;
   @Nullable
   public elk v;
   private int aR;
   protected int w;
   private volatile boolean aS;
   private float aT;
   private long aU = ac.c();
   private long aV;
   private int aW;
   public boolean x;
   @Nullable
   public fct y;
   @Nullable
   private fcn aX;
   private boolean aY;
   private Thread aZ;
   private volatile boolean ba;
   @Nullable
   private Supplier<o> bb;
   private static int bc;
   public String z = "";
   private long bd;
   public boolean A;
   public boolean B;
   public boolean C;
   public boolean D = true;
   private boolean be;
   private final Queue<Runnable> bf = Queues.newConcurrentLinkedQueue();
   @Nullable
   private CompletableFuture<Void> bg;
   @Nullable
   private ezi bh;
   private bgm bi = bgj.a;
   private int bj;
   private final bgg bk = new bgg(ac.b, () -> this.bj);
   @Nullable
   private bgl bl;
   private bhx bm = bhw.a;
   private final evk bn = new evk();
   private long bo;
   private double bp;
   @Nullable
   private epm.a bq;
   private final evi br;
   private final eus bs;
   private final fny bt;
   private fon bu;
   private final eup bv;
   private final elc bw;
   private boolean bx;
   private final long by;
   private long bz;
   private String bA = "root";

   public eva(fih $$0) {
      super("Client");
      E = this;
      this.by = System.currentTimeMillis();
      this.p = $$0.c.a;
      File $$1 = $$0.c.c;
      this.L = $$0.c.b.toPath();
      this.aa = $$0.d.b;
      this.ab = $$0.d.c;
      Path $$2 = this.p.toPath();
      this.bw = egf.a($$2.resolve("allowed_symlinks.txt"));
      gew $$3 = new gew($$0.c.a(), this.bw);
      this.ak = new gey(new File(this.p, "server-resource-packs"));
      app $$4 = new apj(this.L, aor.a, apo.b, this.bw);
      this.al = new apn($$3, this.ak, $$4);
      this.aj = $$3.a();
      this.ac = $$0.a.d;
      this.aw = new YggdrasilAuthenticationService(this.ac);
      this.ax = this.aw.createMinecraftSessionService();
      this.W = $$0.a.a;
      this.M = CompletableFuture.supplyAsync(() -> this.ax.fetchProfile(this.W.b(), true), ac.g());
      this.ay = this.a(this.aw, $$0);
      F.info("Setting user: {}", this.W.c());
      F.debug("(Session ID is {})", this.W.a());
      this.af = $$0.d.a;
      this.ag = !$$0.d.d;
      this.ah = !$$0.d.e;
      this.ae = bf();
      this.aO = null;
      wi.a(euy::a);
      this.O = avr.a();
      this.aF = new ezh(this);
      this.aZ = Thread.currentThread();
      this.m = new eve(this, this.p);
      RenderSystem.setShaderGlintAlpha(this.m.ak().c());
      this.ba = true;
      this.aG = new gju(this, this.m);
      this.Y = new euw($$2, this.O);
      F.info("Backend library: {}", RenderSystem.getBackendDescription());
      eok $$5;
      if (this.m.p > 0 && this.m.o > 0) {
         $$5 = new eok(this.m.o, this.m.p, $$0.b.c, $$0.b.d, $$0.b.e);
      } else {
         $$5 = $$0.b;
      }

      ac.b = RenderSystem.initBackendSystem();
      this.P = new ftr(this);
      this.Q = this.P.a($$5, this.m.k, this.bc());
      this.a(true);
      gjg.a.b(gjc.A);

      try {
         this.Q.a(this.aj, aa.b().g() ? eon.a : eon.b);
      } catch (IOException var13) {
         F.error("Couldn't set icon", var13);
      }

      this.Q.a(this.m.h().c());
      this.n = new evb(this);
      this.n.a(this.Q.i());
      this.o = new euz(this);
      this.o.a(this.Q.i());
      RenderSystem.initRenderer(this.m.u, false);
      this.ap = new eoc(this.Q.k(), this.Q.l());
      this.ap.a(0.0F, 0.0F, 0.0F, 0.0F);
      this.ap.b(a);
      this.ai = new apz(aor.a);
      this.al.a();
      this.m.b(this.al);
      this.am = new gfn(this.m.ad);
      this.ai.a(this.am);
      this.N = new geg(this.ai);
      this.ai.a(this.N);
      this.az = new gfg(this.N, $$1.toPath().resolve("skins"), this.ax, this);
      this.ad = new egf($$2.resolve("saves"), $$2.resolve("backups"), this.bw, this.O);
      this.bv = new eup($$2);
      this.aq = new gir(this.m);
      this.ai.a(this.aq);
      this.at = new gfh(this.W);
      this.ai.a(this.at);
      this.ar = new gim(this);
      this.as = new ezm(this.N);
      this.h = this.as.a();
      this.i = this.as.b();
      this.ai.a(this.as);
      this.b(this.j());
      this.ai.a(new gfa());
      this.ai.a(new gez());
      this.Q.a("Startup");
      RenderSystem.setupDefaultState(0, 0, this.Q.k(), this.Q.l());
      this.Q.a("Post startup");
      this.an = ewd.a();
      this.ao = ewh.a(this.an);
      this.aA = new ggm(this.N, this.an, this.m.A().c());
      this.ai.a(this.aA);
      this.aI = new fml();
      this.ai.a(this.aI);
      this.aJ = new fuy(this.h, this.aI, this::am, this::ap, this::an);
      this.ai.a(this.aJ);
      fsm $$8 = new fsm(this.aJ, this.aI);
      this.ai.a($$8);
      this.U = new fzd(this, this.N, this.aA, this.ao, $$8);
      this.ai.a(this.U);

      try {
         int $$9 = Runtime.getRuntime().availableProcessors();
         int $$10 = this.ae() ? $$9 : Math.min($$9, 4);
         epv.a();
         this.S = new ftf($$10);
      } catch (OutOfMemoryError var12) {
         TinyFileDialogs.tinyfd_messageBox(
            "Minecraft",
            "Oh no! The game was unable to allocate memory off-heap while trying to start. You may try to free some memory by closing other applications on your computer, check that your system meets the minimum requirements, and try again. If the problem persists, please visit: https://aka.ms/Minecraft-Support",
            "ok",
            "error",
            true
         );
         throw new fii("Unable to allocate render buffers", var12);
      }

      this.aH = new fhb(this, this.ay);
      this.aB = new ftt(this.aA.b(), $$8, this.an);
      this.ai.a(this.aB);
      this.T = new fyd(this, this.N, this.U, this.aB, this.h, this.m, this.aI);
      this.ai.a(this.T);
      this.j = new fss(this, this.T.d(), this.ai, this.S);
      this.ai.a(this.j.e());
      this.f = new fsx(this, this.T, this.aJ, this.S);
      this.ai.a(this.f);
      this.be();
      this.ai.a(this.V);
      this.g = new fqp(this.r, this.N);
      this.ai.a(this.g);
      this.aC = new gfe(this.N);
      this.ai.a(this.aC);
      this.aD = new gfd(this.N);
      this.ai.a(this.aD);
      this.aE = new ewn(this.N);
      this.ai.a(this.aE);
      this.au = new fst();
      this.ai.a(this.au);
      this.ai.a(this.av);
      this.l = new ewl(this, this.U);
      this.k = new fwk(this);
      eqj $$12 = eqj.a(this);
      this.aM = new erz($$12);
      RenderSystem.setErrorCallback(this::a);
      if (this.ap.c != this.Q.k() || this.ap.d != this.Q.l()) {
         StringBuilder $$13 = new StringBuilder(
            "Recovering from unsupported resolution ("
               + this.Q.k()
               + "x"
               + this.Q.l()
               + ").\nPlease make sure you have up-to-date drivers (see aka.ms/mcdriver for instructions)."
         );
         if (eol.b()) {
            $$13.append("\n\nReported GL debug messages:\n").append(String.join("\n", eol.a()));
         }

         this.Q.a(this.ap.c, this.ap.d);
         TinyFileDialogs.tinyfd_messageBox("Minecraft", $$13.toString(), "ok", "error", false);
      } else if (this.m.X().c() && !this.Q.j()) {
         this.Q.h();
         this.m.X().a(this.Q.j());
      }

      this.Q.a(this.m.L().c());
      this.Q.b(this.m.E().c());
      this.Q.c();
      this.a();
      this.j.a(this.aj.c());
      this.aK = new giv(this, this.ay, this.W);
      this.aL = fnu.a(this.ay, this.W, $$2);
      this.br = new evi(this);
      this.bs = new eus(this);
      this.bs.a(this.m.ap().c() != evc.a);
      this.bt = new fny(this);
      this.bt.a(this.m.y().c());
      this.bu = fon.a(fok.a(), this.ay);
      fcf.a(this);
      this.a(new fbz(vd.c("gui.loadingMinecraft")));
      List<aoq> $$14 = this.al.g();
      this.bn.a(evk.b.a, $$14);
      apy $$15 = this.ai.a(ac.f(), this, I, $$14);
      gjg.a.a(gjc.C);
      eva.b $$16 = new eva.b($$12, $$0.e);
      this.a(new fcf(this, $$15, $$1x -> ac.a($$1x, $$1xx -> this.a($$1xx, $$16), () -> {
            if (aa.aW) {
               this.bh();
            }

            this.bn.a();
            this.a($$16);
         }), false));
      this.aN = fsj.a($$0.e.b());
   }

   private void a(@Nullable eva.b $$0) {
      if (!this.bx) {
         this.bx = true;
         this.b($$0);
      }
   }

   private void b(@Nullable eva.b $$0) {
      Runnable $$1 = this.c($$0);
      gjg.a.b(gjc.C);
      gjg.a.b(gjc.z);
      gjg.a.a(this.aK.a());
      $$1.run();
   }

   public boolean c() {
      return this.bx;
   }

   private Runnable c(@Nullable eva.b $$0) {
      List<Function<Runnable, fct>> $$1 = new ArrayList<>();
      this.a($$1);
      Runnable $$2 = () -> {
         if ($$0 != null && $$0.b().a()) {
            fsi.a(this, $$0.b(), $$0.a());
         } else {
            this.a(new fcy(true));
         }
      };

      for (Function<Runnable, fct> $$3 : Lists.reverse($$1)) {
         fct $$4 = $$3.apply($$2);
         $$2 = () -> this.a($$4);
      }

      return $$2;
   }

   private void a(List<Function<Runnable, fct>> $$0) {
      if (this.m.ae) {
         $$0.add($$0x -> new fbe(this.m, $$0x));
      }

      BanDetails $$1 = this.E();
      if ($$1 != null) {
         $$0.add($$1x -> fbi.a($$1xx -> {
               if ($$1xx) {
                  ac.i().a("https://aka.ms/mcjavamoderation");
               }

               $$1x.run();
            }, $$1));
      }

      ProfileResult $$2 = this.M.join();
      if ($$2 != null) {
         GameProfile $$3 = $$2.profile();
         Set<ProfileActionType> $$4 = $$2.actions();
         if ($$4.contains(ProfileActionType.FORCED_NAME_CHANGE)) {
            $$0.add($$1x -> fbi.a($$3.getName(), $$1x));
         }

         if ($$4.contains(ProfileActionType.USING_BANNED_SKIN)) {
            $$0.add(fbi::a);
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
      this.Q.b(this.bc());
   }

   private String bc() {
      StringBuilder $$0 = new StringBuilder("Minecraft");
      if (e().a()) {
         $$0.append("*");
      }

      $$0.append(" ");
      $$0.append(aa.b().c());
      fnl $$1 = this.I();
      if ($$1 != null && $$1.m().k()) {
         $$0.append(" - ");
         fnv $$2 = this.P();
         if (this.aO != null && !this.aO.p()) {
            $$0.append(gfl.a("title.singleplayer"));
         } else if ($$2 != null && $$2.e()) {
            $$0.append(gfl.a("title.multiplayer.realms"));
         } else if (this.aO == null && ($$2 == null || !$$2.d())) {
            $$0.append(gfl.a("title.multiplayer.other"));
         } else {
            $$0.append(gfl.a("title.multiplayer.lan"));
         }
      }

      return $$0.toString();
   }

   private UserApiService a(YggdrasilAuthenticationService $$0, fih $$1) {
      try {
         return $$0.createUserApiService($$1.a.a.d());
      } catch (AuthenticationException var4) {
         F.error("Failed to verify authentication", var4);
         return UserApiService.OFFLINE;
      }
   }

   public static auh e() {
      return auh.a("vanilla", ClientBrandRetriever::getClientModName, "Client", eva.class);
   }

   private void a(Throwable $$0, @Nullable eva.b $$1) {
      if (this.al.d().size() > 1) {
         this.a($$0, null, $$1);
      } else {
         ac.a($$0);
      }
   }

   public void a(Throwable $$0, @Nullable vd $$1, @Nullable eva.b $$2) {
      F.info("Caught error loading resourcepacks, removing all selected resourcepacks", $$0);
      this.bn.a($$0);
      this.al.a(Collections.emptyList());
      this.m.i.clear();
      this.m.j.clear();
      this.m.as();
      this.a(true, $$2).thenRun(() -> this.a($$1));
   }

   private void bd() {
      this.a(null);
      if (this.r != null) {
         this.r.W();
         this.y();
      }

      this.a(new fcy());
      this.a(null);
   }

   private void a(@Nullable vd $$0) {
      ezh $$1 = this.ax();
      ezf.b($$1, ezf.a.d, vd.c("resourcePack.load_fail"), $$0);
   }

   public void f() {
      this.aZ = Thread.currentThread();
      if (Runtime.getRuntime().availableProcessors() > 4) {
         this.aZ.setPriority(10);
      }

      try {
         boolean $$0 = false;

         while (this.ba) {
            this.bg();

            try {
               bgp $$1 = bgp.a("Renderer");
               boolean $$2 = this.aM().e();
               this.bi = this.a($$2, $$1);
               this.bi.a();
               this.bm.c();
               this.d(!$$0);
               this.bm.d();
               this.bi.b();
               this.b($$2, $$1);
            } catch (OutOfMemoryError var4) {
               if ($$0) {
                  throw var4;
               }

               this.bj();
               this.a(new fcm());
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

   void b(boolean $$0) {
      this.as.a($$0 ? ImmutableMap.of(b, c) : ImmutableMap.of());
   }

   private void be() {
      this.V
         .a(
            ghz.a,
            $$0 -> new ghs<>(
                  $$0x -> $$0x.a(null, coi.a.a.c()).stream().map($$0xx -> n.a($$0xx.getString()).trim()).filter($$0xx -> !$$0xx.isEmpty()),
                  $$0x -> Stream.of(kd.h.b($$0x.d())),
                  $$0
               )
         );
      this.V.a(ghz.b, $$0 -> new ght<>($$0x -> $$0x.f().map(asq::b), $$0));
      this.V
         .a(
            ghz.c,
            $$0 -> new ghs<>(
                  $$0x -> $$0x.e()
                        .stream()
                        .flatMap($$1 -> $$1.b().a($$0x.a()).a(null, coi.a.a).stream())
                        .map($$0xx -> n.a($$0xx.getString()).trim())
                        .filter($$0xx -> !$$0xx.isEmpty()),
                  $$0x -> $$0x.e().stream().map($$1 -> kd.h.b($$1.b().a($$0x.a()).d())),
                  $$0
               )
         );
      cky.e().a($$0 -> {
         this.a(ghz.a, $$0);
         this.a(ghz.b, $$0);
      });
   }

   private void a(int $$0, long $$1) {
      this.m.L().a(false);
      this.m.as();
   }

   private static boolean bf() {
      String[] $$0 = new String[]{"sun.arch.data.model", "com.ibm.vm.bitmode", "os.arch"};

      for (String $$1 : $$0) {
         String $$2 = System.getProperty($$1);
         if ($$2 != null && $$2.contains("64")) {
            return true;
         }
      }

      return false;
   }

   public eof g() {
      return this.ap;
   }

   public String h() {
      return this.aa;
   }

   public String i() {
      return this.ab;
   }

   public void a(o $$0) {
      this.bb = () -> this.d($$0);
   }

   public void b(o $$0) {
      this.bb = () -> $$0;
   }

   private void bg() {
      if (this.bb != null) {
         a(this, this.p, this.bb.get());
      }
   }

   public void c(o $$0) {
      o $$1 = this.d($$0);
      this.bj();
      a(this, this.p, $$1);
   }

   public static void a(@Nullable eva $$0, File $$1, o $$2) {
      File $$3 = new File($$1, "crash-reports");
      File $$4 = new File($$3, "crash-" + ac.e() + "-client.txt");
      ahf.a($$2.e());
      if ($$0 != null) {
         $$0.aq.g();
      }

      if ($$2.f() != null) {
         ahf.a("#@!@# Game crashed! Crash report saved to: #@!@# " + $$2.f());
         System.exit(-1);
      } else if ($$2.a($$4)) {
         ahf.a("#@!@# Game crashed! Crash report saved to: #@!@# " + $$4.getAbsolutePath());
         System.exit(-1);
      } else {
         ahf.a("#@?@# Game crashed! Crash report could not be saved. #@?@#");
         System.exit(-2);
      }
   }

   public boolean j() {
      return this.m.N().c();
   }

   public CompletableFuture<Void> k() {
      return this.a(false, null);
   }

   private CompletableFuture<Void> a(boolean $$0, @Nullable eva.b $$1) {
      if (this.bg != null) {
         return this.bg;
      } else {
         CompletableFuture<Void> $$2 = new CompletableFuture<>();
         if (!$$0 && this.aX instanceof fcf) {
            this.bg = $$2;
            return $$2;
         } else {
            this.al.a();
            List<aoq> $$3 = this.al.g();
            if (!$$0) {
               this.bn.a(evk.b.b, $$3);
            }

            this.a(new fcf(this, this.ai.a(ac.f(), this, I, $$3), $$3x -> ac.a($$3x, $$2xx -> {
                  if ($$0) {
                     this.bd();
                  } else {
                     this.a($$2xx, $$1);
                  }
               }, () -> {
                  this.f.f();
                  this.bn.a();
                  $$2.complete(null);
                  this.a($$1);
               }), !$$0));
            return $$2;
         }
      }
   }

   private void bh() {
      boolean $$0 = false;
      fts $$1 = this.am().a();
      ggg $$2 = $$1.a().a();

      for (cwj $$3 : kd.e) {
         UnmodifiableIterator $$10 = $$3.n().a().iterator();

         while ($$10.hasNext()) {
            dja $$4 = (dja)$$10.next();
            if ($$4.l() == dco.c) {
               ggg $$5 = $$1.b($$4);
               if ($$5 == $$2) {
                  F.debug("Missing model for: {}", $$4);
                  $$0 = true;
               }
            }
         }
      }

      gef $$6 = $$2.e();

      for (cwj $$7 : kd.e) {
         UnmodifiableIterator var17 = $$7.n().a().iterator();

         while (var17.hasNext()) {
            dja $$8 = (dja)var17.next();
            gef $$9 = $$1.a($$8);
            if (!$$8.i() && $$9 == $$6) {
               F.debug("Missing particle icon for: {}", $$8);
            }
         }
      }

      for (cmm $$10 : kd.h) {
         cmr $$11 = $$10.am_();
         String $$12 = $$11.q();
         String $$13 = vd.c($$12).getString();
         if ($$13.toLowerCase(Locale.ROOT).equals($$10.a())) {
            F.debug("Missing translation for: {} {} {}", new Object[]{$$11, $$12, $$10});
         }
      }

      $$0 |= fcg.a();
      $$0 |= fyg.a();
      if ($$0) {
         throw new IllegalStateException("Your game data is foobar, fix the errors above!");
      }
   }

   public egf l() {
      return this.ad;
   }

   private void a(String $$0) {
      eva.a $$1 = this.G();
      if (!$$1.a(this.Q())) {
         if (this.l.b()) {
            this.l.b(false);
            this.a(new fbl($$0x -> {
               if ($$0x) {
                  ac.i().a("https://aka.ms/JavaAccountSettings");
               }

               this.a(null);
            }, eva.a.e, "https://aka.ms/JavaAccountSettings", true));
         } else {
            vd $$2 = $$1.a();
            this.l.a($$2, false);
            this.bs.c($$2);
            this.l.b($$1 == eva.a.d);
         }
      } else {
         this.a(new fbk($$0));
      }
   }

   public void a(@Nullable fct $$0) {
      if (aa.aW && Thread.currentThread() != this.aZ) {
         F.error("setScreen called from non-game thread");
      }

      if (this.y != null) {
         this.y.j();
      }

      if ($$0 == null && this.aY) {
         throw new IllegalStateException("Trying to return to in-game GUI during disconnection");
      } else {
         if ($$0 == null && this.r == null) {
            $$0 = new fcy();
         } else if ($$0 == null && this.s.ew()) {
            if (this.s.o()) {
               $$0 = new fbs(null, this.r.k().n());
            } else {
               this.s.fQ();
            }
         }

         this.y = $$0;
         if (this.y != null) {
            this.y.aF_();
         }

         epp.a();
         if ($$0 != null) {
            this.n.j();
            euy.b();
            $$0.b(this, this.Q.o(), this.Q.p());
            this.x = false;
         } else {
            this.aq.h();
            this.n.i();
         }

         this.d();
      }
   }

   public void a(@Nullable fcn $$0) {
      this.aX = $$0;
   }

   public void m() {
      try {
         F.info("Stopping!");

         try {
            this.bs.c();
         } catch (Throwable var7) {
         }

         try {
            if (this.r != null) {
               this.r.W();
            }

            this.y();
         } catch (Throwable var6) {
         }

         if (this.y != null) {
            this.y.j();
         }

         this.close();
      } finally {
         ac.b = System::nanoTime;
         if (this.bb == null) {
            System.exit(0);
         }
      }
   }

   @Override
   public void close() {
      if (this.bq != null) {
         this.bq.a();
      }

      try {
         this.aK.close();
         this.av.close();
         this.aA.close();
         this.as.close();
         this.j.close();
         this.f.close();
         this.aq.f();
         this.g.a();
         this.aD.close();
         this.aC.close();
         this.aE.close();
         this.N.close();
         this.ai.close();
         ac.h();
      } catch (Throwable var5) {
         F.error("Shutdown failure!", var5);
         throw var5;
      } finally {
         this.P.close();
         this.Q.close();
      }
   }

   private void d(boolean $$0) {
      this.Q.a("Pre render");
      long $$1 = ac.c();
      if (this.Q.b()) {
         this.p();
      }

      if (this.bg != null && !(this.aX instanceof fcf)) {
         CompletableFuture<Void> $$2 = this.bg;
         this.bg = null;
         this.k().thenRun(() -> $$2.complete(null));
      }

      Runnable $$3;
      while (($$3 = this.bf.poll()) != null) {
         $$3.run();
      }

      if ($$0) {
         int $$4 = this.R.a(ac.b());
         this.bi.a("scheduledExecutables");
         this.bu();
         this.bi.c();
         this.bi.a("tick");

         for (int $$5 = 0; $$5 < Math.min(10, $$4); $$5++) {
            this.bi.d("clientTick");
            this.s();
         }

         this.bi.c();
      }

      this.n.a();
      this.Q.a("Render");
      this.bi.a("sound");
      this.aq.a(this.j.m());
      this.bi.c();
      this.bi.a("render");
      long $$6 = ac.c();
      boolean $$8;
      if (!this.aM().d() && !this.bm.e()) {
         $$8 = false;
         this.bp = 0.0;
      } else {
         $$8 = this.bq == null || this.bq.b();
         if ($$8) {
            epm.a().ifPresent(epm::b);
         }
      }

      RenderSystem.clear(16640, a);
      this.ap.a(true);
      fsr.a();
      this.bi.a("display");
      RenderSystem.enableCull();
      this.bi.c();
      if (!this.x) {
         this.bi.b("gameRenderer");
         this.j.a(this.aS ? this.aT : this.R.a, $$1, $$0);
         this.bi.c();
      }

      if (this.bl != null) {
         this.bi.a("fpsPie");
         ewm $$9 = new ewm(this, this.S.c());
         this.a($$9, this.bl);
         $$9.e();
         this.bi.c();
      }

      this.bi.a("blit");
      this.ap.e();
      this.ap.a(this.Q.k(), this.Q.l());
      this.bd = ac.c() - $$6;
      if ($$8) {
         epm.a().ifPresent($$0x -> this.bq = $$0x.c());
      }

      this.bi.b("updateDisplay");
      this.Q.e();
      int $$10 = this.bi();
      if ($$10 < 260) {
         RenderSystem.limitDisplayFPS($$10);
      }

      this.bi.b("yield");
      Thread.yield();
      this.bi.c();
      this.Q.a("Post render");
      this.aW++;
      boolean $$11 = this.R() && (this.y != null && this.y.k() || this.aX != null && this.aX.a()) && !this.aO.p();
      if (this.aS != $$11) {
         if (this.aS) {
            this.aT = this.R.a;
         } else {
            this.R.a = this.aT;
         }

         this.aS = $$11;
      }

      long $$12 = ac.c();
      long $$13 = $$12 - this.aU;
      if ($$8) {
         this.bo = $$13;
      }

      this.aM().a($$13);
      this.aU = $$12;
      this.bi.a("fpsUpdate");
      if (this.bq != null && this.bq.b()) {
         this.bp = (double)this.bq.c() * 100.0 / (double)this.bo;
      }

      while (ac.b() >= this.aV + 1000L) {
         String $$14;
         if (this.bp > 0.0) {
            $$14 = " GPU: " + (this.bp > 100.0 ? n.m + "100%" : Math.round(this.bp) + "%");
         } else {
            $$14 = "";
         }

         bc = this.aW;
         this.z = String.format(
            Locale.ROOT,
            "%d fps T: %s%s%s%s B: %d%s",
            bc,
            $$10 == 260 ? "inf" : $$10,
            this.m.L().c() ? " vsync" : "",
            this.m.j().c(),
            this.m.i().c() == euo.a ? "" : (this.m.i().c() == euo.b ? " fast-clouds" : " fancy-clouds"),
            this.m.C().c(),
            $$14
         );
         this.aV += 1000L;
         this.aW = 0;
      }

      this.bi.c();
   }

   private bgm a(boolean $$0, @Nullable bgp $$1) {
      if (!$$0) {
         this.bk.b();
         if (!this.bm.e() && $$1 == null) {
            return bgj.a;
         }
      }

      bgm $$2;
      if ($$0) {
         if (!this.bk.a()) {
            this.bj = 0;
            this.bk.c();
         }

         this.bj++;
         $$2 = this.bk.d();
      } else {
         $$2 = bgj.a;
      }

      if (this.bm.e()) {
         $$2 = bgm.a($$2, this.bm.f());
      }

      return bgp.a($$2, $$1);
   }

   private void b(boolean $$0, @Nullable bgp $$1) {
      if ($$1 != null) {
         $$1.b();
      }

      if ($$0) {
         this.bl = this.bk.e();
      } else {
         this.bl = null;
      }

      this.bi = this.bk.d();
   }

   @Override
   public void a() {
      int $$0 = this.Q.a(this.m.an().c(), this.j());
      this.Q.a((double)$$0);
      if (this.y != null) {
         this.y.a(this, this.Q.o(), this.Q.p());
      }

      eof $$1 = this.g();
      $$1.a(this.Q.k(), this.Q.l(), a);
      this.j.a(this.Q.k(), this.Q.l());
      this.n.g();
   }

   @Override
   public void b() {
      this.n.k();
   }

   public int n() {
      return bc;
   }

   public long o() {
      return this.bd;
   }

   private int bi() {
      return this.r != null || this.y == null && this.aX == null ? this.Q.d() : 60;
   }

   private void bj() {
      try {
         aug.b();
         this.f.p();
      } catch (Throwable var3) {
      }

      try {
         System.gc();
         if (this.aQ && this.aO != null) {
            this.aO.a(true);
         }

         this.b((fct)(new fbz(vd.c("menu.savingLevel"))));
      } catch (Throwable var2) {
      }

      System.gc();
   }

   public boolean a(Consumer<vd> $$0) {
      if (this.bm.e()) {
         this.bk();
         return false;
      } else {
         Consumer<bgl> $$1 = $$1x -> {
            if ($$1x != bgh.a) {
               int $$2x = $$1x.f();
               double $$3x = (double)$$1x.g() / (double)avj.a;
               this.execute(
                  () -> $$0.accept(
                        vd.a("commands.debug.stopped", String.format(Locale.ROOT, "%.2f", $$3x), $$2x, String.format(Locale.ROOT, "%.2f", (double)$$2x / $$3x))
                     )
               );
            }
         };
         Consumer<Path> $$2 = $$1x -> {
            vd $$2x = vd.b($$1x.toString()).a(n.t).a($$1xx -> $$1xx.a(new vb(vb.a.b, $$1x.toFile().getParent())));
            this.execute(() -> $$0.accept(vd.a("debug.profiling.stop", $$2x)));
         };
         ab $$3 = a(new ab(), this, this.am, this.aa, this.m);
         Consumer<List<Path>> $$4 = $$2x -> {
            Path $$3x = this.a($$3, $$2x);
            $$2.accept($$3x);
         };
         Consumer<Path> $$5;
         if (this.aO == null) {
            $$5 = $$1x -> $$4.accept(ImmutableList.of($$1x));
         } else {
            this.aO.b($$3);
            CompletableFuture<Path> $$6 = new CompletableFuture<>();
            CompletableFuture<Path> $$7 = new CompletableFuture<>();
            CompletableFuture.allOf($$6, $$7).thenRunAsync(() -> $$4.accept(ImmutableList.of($$6.join(), $$7.join())), ac.g());
            this.aO.a($$0x -> {
            }, $$7::complete);
            $$5 = $$6::complete;
         }

         this.bm = bhv.a(new fsg(ac.b, this.f), ac.b, ac.g(), new bib("client"), $$1x -> {
            this.bm = bhw.a;
            $$1.accept($$1x);
         }, $$5);
         return true;
      }
   }

   private void bk() {
      this.bm.a();
      if (this.aO != null) {
         this.aO.aU();
      }
   }

   private void bl() {
      this.bm.b();
      if (this.aO != null) {
         this.aO.aV();
      }
   }

   private Path a(ab $$0, List<Path> $$1) {
      String $$2;
      if (this.Q()) {
         $$2 = this.S().aY().g();
      } else {
         fnv $$3 = this.P();
         $$2 = $$3 != null ? $$3.a : "unknown";
      }

      Path $$7;
      try {
         String $$5 = String.format(Locale.ROOT, "%s-%s-%s", ac.e(), $$2, aa.b().b());
         String $$6 = v.a(bib.a, $$5, ".zip");
         $$7 = bib.a.resolve($$6);
      } catch (IOException var21) {
         throw new UncheckedIOException(var21);
      }

      try (att $$10 = new att($$7)) {
         $$10.a(Paths.get("system.txt"), $$0.a());
         $$10.a(Paths.get("client").resolve(this.m.ay().getName()), this.m.az());
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
      if (this.bl != null) {
         List<bgo> $$1 = this.bl.a(this.bA);
         if (!$$1.isEmpty()) {
            bgo $$2 = $$1.remove(0);
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

   private void a(ewm $$0, bgl $$1) {
      List<bgo> $$2 = $$1.a(this.bA);
      bgo $$3 = $$2.remove(0);
      RenderSystem.clear(256, a);
      RenderSystem.setShader(fss::q);
      Matrix4f $$4 = new Matrix4f().setOrtho(0.0F, (float)this.Q.k(), (float)this.Q.l(), 0.0F, 1000.0F, 3000.0F);
      RenderSystem.setProjectionMatrix($$4, eqb.b);
      ept $$5 = RenderSystem.getModelViewStack();
      $$5.a();
      $$5.e();
      $$5.a(0.0F, 0.0F, -2000.0F);
      RenderSystem.applyModelViewMatrix();
      RenderSystem.lineWidth(1.0F);
      epv $$6 = epv.b();
      epo $$7 = $$6.d();
      int $$8 = 160;
      int $$9 = this.Q.k() - 160 - 10;
      int $$10 = this.Q.l() - 320;
      RenderSystem.enableBlend();
      $$7.a(epy.b.h, epr.n);
      $$7.a((double)((float)$$9 - 176.0F), (double)((float)$$10 - 96.0F - 16.0F), 0.0).a(200, 0, 0, 0).e();
      $$7.a((double)((float)$$9 - 176.0F), (double)($$10 + 320), 0.0).a(200, 0, 0, 0).e();
      $$7.a((double)((float)$$9 + 176.0F), (double)($$10 + 320), 0.0).a(200, 0, 0, 0).e();
      $$7.a((double)((float)$$9 + 176.0F), (double)((float)$$10 - 96.0F - 16.0F), 0.0).a(200, 0, 0, 0).e();
      $$6.c();
      RenderSystem.disableBlend();
      double $$11 = 0.0;

      for (bgo $$12 : $$2) {
         int $$13 = aui.a($$12.a / 4.0) + 1;
         $$7.a(epy.b.g, epr.n);
         int $$14 = $$12.a();
         int $$15 = $$14 >> 16 & 0xFF;
         int $$16 = $$14 >> 8 & 0xFF;
         int $$17 = $$14 & 0xFF;
         $$7.a((double)$$9, (double)$$10, 0.0).a($$15, $$16, $$17, 255).e();

         for (int $$18 = $$13; $$18 >= 0; $$18--) {
            float $$19 = (float)(($$11 + $$12.a * (double)$$18 / (double)$$13) * (float) (Math.PI * 2) / 100.0);
            float $$20 = aui.a($$19) * 160.0F;
            float $$21 = aui.b($$19) * 160.0F * 0.5F;
            $$7.a((double)((float)$$9 + $$20), (double)((float)$$10 - $$21), 0.0).a($$15, $$16, $$17, 255).e();
         }

         $$6.c();
         $$7.a(epy.b.f, epr.n);

         for (int $$22 = $$13; $$22 >= 0; $$22--) {
            float $$23 = (float)(($$11 + $$12.a * (double)$$22 / (double)$$13) * (float) (Math.PI * 2) / 100.0);
            float $$24 = aui.a($$23) * 160.0F;
            float $$25 = aui.b($$23) * 160.0F * 0.5F;
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
      String $$27 = bgl.b($$3.d);
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
         bgo $$31 = $$2.get($$30);
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

      $$5.b();
      RenderSystem.applyModelViewMatrix();
   }

   public void p() {
      this.ba = false;
   }

   public boolean q() {
      return this.ba;
   }

   public void c(boolean $$0) {
      if (this.y == null) {
         boolean $$1 = this.R() && !this.aO.p();
         if ($$1) {
            this.a(new fco(!$$0));
            this.aq.d();
         } else {
            this.a(new fco(true));
         }
      }
   }

   private void e(boolean $$0) {
      if (!$$0) {
         this.w = 0;
      }

      if (this.w <= 0 && !this.s.fn()) {
         if ($$0 && this.v != null && this.v.c() == elk.a.b) {
            eli $$1 = (eli)this.v;
            hx $$2 = $$1.a();
            if (!this.r.a_($$2).i()) {
               ic $$3 = $$1.b();
               if (this.q.b($$2, $$3)) {
                  this.g.a($$2, $$3);
                  this.s.a(bju.a);
               }
            }
         } else {
            this.q.b();
         }
      }
   }

   private boolean bm() {
      if (this.w > 0) {
         return false;
      } else if (this.v == null) {
         F.error("Null returned as 'hitResult', this shouldn't happen!");
         if (this.q.f()) {
            this.w = 10;
         }

         return false;
      } else if (this.s.A()) {
         return false;
      } else {
         cmr $$0 = this.s.b(bju.a);
         if (!$$0.a(this.r.I())) {
            return false;
         } else {
            boolean $$1 = false;
            switch (this.v.c()) {
               case c:
                  this.q.a(this.s, ((elj)this.v).a());
                  break;
               case b:
                  eli $$2 = (eli)this.v;
                  hx $$3 = $$2.a();
                  if (!this.r.a_($$3).i()) {
                     this.q.a($$3, $$2.b());
                     if (this.r.a_($$3).i()) {
                        $$1 = true;
                     }
                     break;
                  }
               case a:
                  if (this.q.f()) {
                     this.w = 10;
                  }

                  this.s.gm();
            }

            this.s.a(bju.a);
            return $$1;
         }
      }
   }

   private void bn() {
      if (!this.q.m()) {
         this.aR = 4;
         if (!this.s.A()) {
            if (this.v == null) {
               F.warn("Null returned as 'hitResult', this shouldn't happen!");
            }

            for (bju $$0 : bju.values()) {
               cmr $$1 = this.s.b($$0);
               if (!$$1.a(this.r.I())) {
                  return;
               }

               if (this.v != null) {
                  switch (this.v.c()) {
                     case c:
                        elj $$2 = (elj)this.v;
                        blp $$3 = $$2.a();
                        if (!this.r.D_().a($$3.dm())) {
                           return;
                        }

                        bjv $$4 = this.q.a(this.s, $$3, $$2, $$0);
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
                        eli $$5 = (eli)this.v;
                        int $$6 = $$1.L();
                        bjv $$7 = this.q.a(this.s, $$0, $$5);
                        if ($$7.a()) {
                           if ($$7.b()) {
                              this.s.a($$0);
                              if (!$$1.b() && ($$1.L() != $$6 || this.q.g())) {
                                 this.j.b.a($$0);
                              }
                           }

                           return;
                        }

                        if ($$7 == bjv.e) {
                           return;
                        }
                  }
               }

               if (!$$1.b()) {
                  bjv $$8 = this.q.a(this.s, $$0);
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

   public gim r() {
      return this.ar;
   }

   public void s() {
      this.bz++;
      if (this.r != null && !this.aS) {
         this.r.s().m();
      }

      if (this.aR > 0) {
         this.aR--;
      }

      this.bi.a("gui");
      this.bt.a();
      this.l.a(this.aS);
      this.bi.c();
      this.j.a(1.0F);
      this.aG.a(this.r, this.v);
      this.bi.a("gameMode");
      if (!this.aS && this.r != null) {
         this.q.d();
      }

      this.bi.b("textures");
      boolean $$0 = this.r == null || this.r.s().i();
      if ($$0) {
         this.N.e();
      }

      if (this.y != null || this.s == null) {
         if (this.y instanceof fcb $$1 && !this.s.fD()) {
            $$1.n();
         }
      } else if (this.s.ew() && !(this.y instanceof fbs)) {
         this.a(null);
      } else if (this.s.fD() && this.r != null) {
         this.a(new fcb());
      }

      if (this.y != null) {
         this.w = 10000;
      }

      if (this.y != null) {
         fct.a(() -> this.y.d(), "Ticking screen", this.y.getClass().getCanonicalName());
      }

      if (!this.aM().d()) {
         this.l.l();
      }

      if (this.aX == null && this.y == null) {
         this.bi.b("Keybindings");
         this.bx();
         if (this.w > 0) {
            this.w--;
         }
      }

      if (this.r != null) {
         this.bi.b("gameRenderer");
         if (!this.aS) {
            this.j.f();
         }

         this.bi.b("levelRenderer");
         if (!this.aS) {
            this.f.o();
         }

         this.bi.b("level");
         if (!this.aS) {
            this.r.f();
         }
      } else if (this.j.g() != null) {
         this.j.b();
      }

      if (!this.aS) {
         this.ar.a();
      }

      this.aq.a(this.aS);
      if (this.r != null) {
         if (!this.aS) {
            if (!this.m.s && this.bo()) {
               vd $$2 = vd.c("tutorial.socialInteractions.title");
               vd $$3 = vd.a("tutorial.socialInteractions.description", gju.a("socialInteractions"));
               this.bh = new ezi(ezi.a.f, $$2, $$3, true);
               this.aG.a(this.bh, 160);
               this.m.s = true;
               this.m.as();
            }

            this.aG.d();

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

         this.bi.b("animateTick");
         if (!this.aS && $$0) {
            this.r.b(this.s.dq(), this.s.ds(), this.s.dw());
         }

         this.bi.b("particles");
         if (!this.aS && $$0) {
            this.g.b();
         }
      } else if (this.aP != null) {
         this.bi.b("pendingConnection");
         this.aP.d();
      }

      this.bi.b("keyboard");
      this.o.b();
      this.bi.c();
   }

   private boolean bo() {
      return !this.aQ || this.aO != null && this.aO.p();
   }

   private void bx() {
      while (this.m.P.g()) {
         eum $$0 = this.m.ax();
         this.m.a(this.m.ax().c());
         if ($$0.a() != this.m.ax().a()) {
            this.j.a(this.m.ax().a() ? this.al() : null);
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
            if (this.s.P_()) {
               this.l.g().a($$1);
            } else if (!this.s.f() || this.y != null || !$$3 && !$$2) {
               this.s.fS().l = $$1;
            } else {
               feh.a(this, $$1, $$3, $$2);
            }
         }
      }

      while (this.m.N.g()) {
         if (!this.bo()) {
            this.s.a(J, true);
            this.bs.c(J);
         } else {
            if (this.bh != null) {
               this.aG.a(this.bh);
               this.bh = null;
            }

            this.a(new fhd());
         }
      }

      while (this.m.E.g()) {
         if (this.q.i()) {
            this.s.i();
         } else {
            this.aG.a();
            this.a(new fes(this.s));
         }
      }

      while (this.m.T.g()) {
         this.a(new fdj(this.s.cn.r()));
      }

      while (this.m.F.g()) {
         if (!this.s.P_()) {
            this.I().b(new aej(aej.a.g, hx.b, ic.a));
         }
      }

      while (this.m.G.g()) {
         if (!this.s.P_() && this.s.a(fct.r())) {
            this.s.a(bju.a);
         }
      }

      while (this.m.K.g()) {
         this.a("");
      }

      if (this.y == null && this.aX == null && this.m.M.g()) {
         this.a("/");
      }

      boolean $$4 = false;
      if (this.s.fn()) {
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
            $$4 |= this.bm();
         }

         while (this.m.H.g()) {
            this.bn();
         }

         while (this.m.J.g()) {
            this.by();
         }
      }

      if (this.m.H.e() && this.aR == 0 && !this.s.fn()) {
         this.bn();
      }

      this.e(this.y == null && !$$4 && this.m.I.e() && this.n.h());
   }

   public giv t() {
      return this.aK;
   }

   public double u() {
      return this.bp;
   }

   public fnu v() {
      return this.aL;
   }

   public fht w() {
      return new fht(this, this.ad);
   }

   public void a(egf.c $$0, apn $$1, ahz $$2, boolean $$3) {
      this.y();
      this.X.set(null);
      Instant $$4 = Instant.now();

      try {
         $$0.a($$2.c().a(), $$2.d());
         ahw $$5 = ahw.a(this.aw, this.p);
         $$5.e().a(this);
         dhz.a($$5, this);
         aql.a(false);
         this.aO = MinecraftServer.a((Function<Thread, gie>)($$4x -> new gie($$4x, this, $$0, $$1, $$2, $$5, $$0xx -> {
               anm $$1xx = new anm($$0xx + 0);
               this.X.set($$1xx);
               return anl.a($$1xx, this.bf::add);
            })));
         this.aQ = true;
         this.a(fok.a());
         this.aN.a(fsj.c.a, $$0.d(), $$2.d().g());
      } catch (Throwable var11) {
         o $$7 = o.a(var11, "Starting integrated server");
         p $$8 = $$7.a("Starting integrated server");
         $$8.a("Level ID", $$0.d());
         $$8.a("Level Name", () -> $$2.d().g());
         throw new y($$7);
      }

      while (this.X.get() == null) {
         Thread.yield();
      }

      fcd $$9 = new fcd(this.X.get());
      this.a($$9);
      this.bi.a("waitForServer");

      for (; !this.aO.ag(); this.bg()) {
         $$9.d();
         this.d(false);

         try {
            Thread.sleep(16L);
         } catch (InterruptedException var10) {
         }
      }

      this.bi.c();
      Duration $$10 = Duration.between($$4, Instant.now());
      SocketAddress $$11 = this.aO.af().a();
      ue $$12 = ue.a($$11);
      $$12.a($$11.toString(), 0, new fnj($$12, this, null, null, $$3, $$10, $$0x -> {
      }));
      $$12.a(new afr(this.U().c(), this.U().b()));
      this.aP = $$12;
   }

   public void a(fnk $$0) {
      fcq $$1 = new fcq(true);
      $$1.a(vd.c("connect.joining"));
      this.e($$1);
      this.r = $$0;
      this.b($$0);
      if (!this.aQ) {
         ahw $$2 = ahw.a(this.aw, this.p);
         $$2.e().a(this);
         dhz.a($$2, this);
         aql.a(false);
      }
   }

   public void y() {
      this.b((fct)(new fcq(true)));
   }

   public void b(fct $$0) {
      fnl $$1 = this.I();
      if ($$1 != null) {
         this.bt();
         $$1.j();
      }

      this.aH.b();
      if (this.bm.e()) {
         this.bl();
      }

      gie $$2 = this.aO;
      this.aO = null;
      this.j.i();
      this.q = null;
      this.bs.b();
      this.aY = true;

      try {
         this.e($$0);
         if (this.r != null) {
            if ($$2 != null) {
               this.bi.a("waitForServer");

               while (!$$2.E()) {
                  this.d(false);
               }

               this.bi.c();
            }

            this.ak.a();
            this.l.i();
            this.aQ = false;
         }

         this.r = null;
         this.b(null);
         this.s = null;
      } finally {
         this.aY = false;
      }

      dhz.c();
   }

   public void c(fct $$0) {
      fnl $$1 = this.I();
      if ($$1 != null) {
         $$1.k();
      }

      if (this.bm.e()) {
         this.bl();
      }

      this.j.i();
      this.q = null;
      this.bs.b();
      this.aY = true;

      try {
         this.e($$0);
         this.l.i();
         this.ak.a();
         this.r = null;
         this.b(null);
         this.s = null;
      } finally {
         this.aY = false;
      }

      dhz.c();
   }

   private void e(fct $$0) {
      this.bi.a("forcedTick");
      this.aq.e();
      this.t = null;
      this.aP = null;
      this.a($$0);
      this.d(false);
      this.bi.c();
   }

   public void d(fct $$0) {
      this.bi.a("forcedTick");
      this.a($$0);
      this.d(false);
      this.bi.c();
   }

   private void b(@Nullable fnk $$0) {
      this.f.a($$0);
      this.g.a($$0);
      this.aJ.a($$0);
      this.d();
   }

   public boolean z() {
      return this.A() && this.m.af().c();
   }

   public boolean A() {
      return this.B() && this.ay.properties().flag(UserFlag.OPTIONAL_TELEMETRY_AVAILABLE);
   }

   public boolean B() {
      return this.ay.properties().flag(UserFlag.TELEMETRY_ENABLED);
   }

   public boolean C() {
      return this.ag && this.ay.properties().flag(UserFlag.SERVERS_ALLOWED) && this.E() == null && !this.F();
   }

   public boolean D() {
      return this.ay.properties().flag(UserFlag.REALMS_ALLOWED) && this.E() == null;
   }

   @Nullable
   public BanDetails E() {
      return (BanDetails)this.ay.properties().bannedScopes().get("MULTIPLAYER");
   }

   public boolean F() {
      ProfileResult $$0 = this.M.getNow(null);
      return $$0 != null && $$0.actions().contains(ProfileActionType.FORCED_NAME_CHANGE);
   }

   public boolean a(UUID $$0) {
      return this.G().a(false) ? this.aH.c($$0) : (this.s == null || !$$0.equals(this.s.cw())) && !$$0.equals(ac.d);
   }

   public eva.a G() {
      if (this.m.m().c() == cez.c) {
         return eva.a.b;
      } else if (!this.ah) {
         return eva.a.c;
      } else {
         return !this.ay.properties().flag(UserFlag.CHAT_ALLOWED) ? eva.a.d : eva.a.a;
      }
   }

   public final boolean H() {
      return this.af;
   }

   @Nullable
   public fnl I() {
      return this.s == null ? null : this.s.cn;
   }

   public static boolean J() {
      return !E.m.Z;
   }

   public static boolean K() {
      return E.m.j().c().a() >= eut.b.a();
   }

   public static boolean L() {
      return !E.j.a() && E.m.j().c().a() >= eut.c.a();
   }

   public static boolean M() {
      return E.m.k().c();
   }

   private void by() {
      if (this.v != null && this.v.c() != elk.a.a) {
         boolean $$0 = this.s.fT().d;
         dgo $$1 = null;
         elk.a $$2 = this.v.c();
         cmr $$6;
         if ($$2 == elk.a.b) {
            hx $$3 = ((eli)this.v).a();
            dja $$4 = this.r.a_($$3);
            if ($$4.i()) {
               return;
            }

            cwj $$5 = $$4.b();
            $$6 = $$5.a((ctl)this.r, $$3, $$4);
            if ($$6.b()) {
               return;
            }

            if ($$0 && fct.r() && $$4.t()) {
               $$1 = this.r.c_($$3);
            }
         } else {
            if ($$2 != elk.a.c || !$$0) {
               return;
            }

            blp $$7 = ((elj)this.v).a();
            $$6 = $$7.dz();
            if ($$6 == null) {
               return;
            }
         }

         if ($$6.b()) {
            String $$10 = "";
            if ($$2 == elk.a.b) {
               $$10 = kd.e.b(this.r.a_(((eli)this.v).a()).b()).toString();
            } else if ($$2 == elk.a.c) {
               $$10 = kd.g.b(((elj)this.v).a().ai()).toString();
            }

            F.warn("Picking on: [{}] {} gave null item", $$2, $$10);
         } else {
            cfa $$11 = this.s.fS();
            if ($$1 != null) {
               this.a($$6, $$1);
            }

            int $$12 = $$11.b($$6);
            if ($$0) {
               $$11.a($$6);
               this.q.a(this.s.b(bju.a), 36 + $$11.l);
            } else if ($$12 != -1) {
               if (cfa.d($$12)) {
                  $$11.l = $$12;
               } else {
                  this.q.a($$12);
               }
            }
         }
      }
   }

   private void a(cmr $$0, dgo $$1) {
      sl $$2 = $$1.o();
      ckk.a($$0, $$1.v(), $$2);
      if ($$0.d() instanceof cnf && $$2.e("SkullOwner")) {
         sl $$3 = $$2.p("SkullOwner");
         sl $$4 = $$0.w();
         $$4.a("SkullOwner", $$3);
         sl $$5 = $$4.p("BlockEntityTag");
         $$5.r("SkullOwner");
         $$5.r("x");
         $$5.r("y");
         $$5.r("z");
      } else {
         sl $$6 = new sl();
         sr $$7 = new sr();
         $$7.add(tg.a("\"(+NBT)\""));
         $$6.a("Lore", $$7);
         $$0.a("display", $$6);
      }
   }

   public o d(o $$0) {
      ab $$1 = $$0.g();
      a($$1, this, this.am, this.aa, this.m);
      this.a($$0.a("Uptime"));
      if (this.r != null) {
         this.r.a($$0);
      }

      if (this.aO != null) {
         this.aO.b($$1);
      }

      this.bn.a($$0);
      return $$0;
   }

   public static void a(@Nullable eva $$0, @Nullable gfn $$1, String $$2, @Nullable eve $$3, o $$4) {
      ab $$5 = $$4.g();
      a($$5, $$0, $$1, $$2, $$3);
   }

   private static String a(double $$0) {
      return String.format(Locale.ROOT, "%.3fs", $$0);
   }

   private void a(p $$0) {
      $$0.a("JVM uptime", () -> a((double)ManagementFactory.getRuntimeMXBean().getUptime() / 1000.0));
      $$0.a("Wall uptime", () -> a((double)(System.currentTimeMillis() - this.by) / 1000.0));
      $$0.a("High-res time", () -> a((double)ac.b() / 1000.0));
      $$0.a("Client ticks", () -> String.format(Locale.ROOT, "%d ticks / %.3fs", this.bz, (double)this.bz / 20.0));
   }

   private static ab a(ab $$0, @Nullable eva $$1, @Nullable gfn $$2, String $$3, @Nullable eve $$4) {
      $$0.a("Launched Version", () -> $$3);
      String $$5 = bb();
      if ($$5 != null) {
         $$0.a("Launcher name", $$5);
      }

      $$0.a("Backend library", RenderSystem::getBackendDescription);
      $$0.a("Backend API", RenderSystem::getApiDescription);
      $$0.a("Window size", () -> $$1 != null ? $$1.Q.k() + "x" + $$1.Q.l() : "<not initialized>");
      $$0.a("GL Caps", RenderSystem::getCapsString);
      $$0.a("GL debug messages", () -> eol.b() ? String.join("\n", eol.a()) : "<disabled>");
      $$0.a("Using VBOs", () -> "Yes");
      $$0.a("Is Modded", () -> e().b());
      $$0.a("Universe", () -> $$1 != null ? Long.toHexString($$1.K) : "404");
      $$0.a("Type", "Client (map_client.txt)");
      if ($$4 != null) {
         if ($$1 != null) {
            String $$6 = $$1.ag().m();
            if ($$6 != null) {
               $$0.a("GPU Warnings", $$6);
            }
         }

         $$0.a("Graphics mode", $$4.j().c().toString());
         $$0.a("Render Distance", $$4.aA() + "/" + $$4.e().c() + " chunks");
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
      $$0.a("CPU", eom::b);
      return $$0;
   }

   public static eva N() {
      return E;
   }

   public CompletableFuture<Void> O() {
      return this.a(this::k).thenCompose($$0 -> (CompletionStage<Void>)$$0);
   }

   public void a(fok $$0) {
      if (!this.bu.a($$0)) {
         this.bu = fon.a($$0, this.ay);
      }
   }

   @Nullable
   public fnv P() {
      return x.a(this.I(), fnl::x);
   }

   public boolean Q() {
      return this.aQ;
   }

   public boolean R() {
      return this.aQ && this.aO != null;
   }

   @Nullable
   public gie S() {
      return this.aO;
   }

   public boolean T() {
      gie $$0 = this.S();
      return $$0 != null && !$$0.p();
   }

   public boolean b(UUID $$0) {
      return $$0.equals(this.U().b());
   }

   public evp U() {
      return this.W;
   }

   public GameProfile V() {
      ProfileResult $$0 = this.M.join();
      return $$0 != null ? $$0.profile() : new GameProfile(this.W.b(), this.W.c());
   }

   public Proxy W() {
      return this.ac;
   }

   public geg X() {
      return this.N;
   }

   public aqc Y() {
      return this.ai;
   }

   public apn Z() {
      return this.al;
   }

   public aot aa() {
      return this.aj;
   }

   public gey ab() {
      return this.ak;
   }

   public Path ac() {
      return this.L;
   }

   public gfn ad() {
      return this.am;
   }

   public Function<ahd, gef> a(ahd $$0) {
      return this.aA.a($$0)::a;
   }

   public boolean ae() {
      return this.ae;
   }

   public boolean af() {
      return this.aS;
   }

   public fst ag() {
      return this.au;
   }

   public gir ah() {
      return this.aq;
   }

   public arj ai() {
      arj $$0 = x.a(this.y, fct::B);
      if ($$0 != null) {
         return $$0;
      } else if (this.s != null) {
         if (this.s.dM().ae() == cti.j) {
            return this.l.j().b() ? ark.d : ark.e;
         } else {
            ih<cuh> $$1 = this.s.dM().t(this.s.dm());
            if (!this.ar.c(ark.f) && (!this.s.be() || !$$1.a(asa.Z))) {
               return this.s.dM().ae() != cti.i && this.s.fT().d && this.s.fT().c ? ark.b : $$1.a().o().orElse(ark.g);
            } else {
               return ark.f;
            }
         }
      } else {
         return ark.a;
      }
   }

   public MinecraftSessionService aj() {
      return this.ax;
   }

   public gfg ak() {
      return this.az;
   }

   @Nullable
   public blp al() {
      return this.t;
   }

   public void a(blp $$0) {
      this.t = $$0;
      this.j.a($$0);
   }

   public boolean b(blp $$0) {
      return $$0.cd() || this.s != null && this.s.P_() && this.m.S.e() && $$0.ai() == blt.bv;
   }

   @Override
   protected Thread aw() {
      return this.aZ;
   }

   @Override
   protected Runnable f(Runnable $$0) {
      return $$0;
   }

   @Override
   protected boolean e(Runnable $$0) {
      return true;
   }

   public ftt am() {
      return this.aB;
   }

   public fyd an() {
      return this.T;
   }

   public fuy ao() {
      return this.aJ;
   }

   public fzd ap() {
      return this.U;
   }

   public <T> gia<T> a(ghz.a<T> $$0) {
      return this.V.a($$0);
   }

   public <T> void a(ghz.a<T> $$0, List<T> $$1) {
      this.V.a($$0, $$1);
   }

   public DataFixer aq() {
      return this.O;
   }

   public float ar() {
      return this.R.a;
   }

   public float as() {
      return this.R.b;
   }

   public ewd at() {
      return this.an;
   }

   public boolean au() {
      return this.s != null && this.s.gi() || this.m.S().c();
   }

   public ezh ax() {
      return this.aF;
   }

   public gju ay() {
      return this.aG;
   }

   public boolean az() {
      return this.be;
   }

   public euw aA() {
      return this.Y;
   }

   public ggm aB() {
      return this.aA;
   }

   public gfe aC() {
      return this.aC;
   }

   public gfd aD() {
      return this.aD;
   }

   public ewn aE() {
      return this.aE;
   }

   @Override
   public void a(boolean $$0) {
      this.be = $$0;
   }

   public vd a(File $$0, int $$1, int $$2) {
      int $$3 = this.Q.k();
      int $$4 = this.Q.l();
      eof $$5 = new eog($$1, $$2, true, a);
      float $$6 = this.s.dE();
      float $$7 = this.s.dC();
      float $$8 = this.s.O;
      float $$9 = this.s.N;
      this.j.b(false);

      vr var12;
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

            this.s.N = this.s.dC();
            this.s.O = this.s.dE();
            $$5.a(true);
            this.j.a(1.0F, 0L, new ept());

            try {
               Thread.sleep(10L);
            } catch (InterruptedException var17) {
            }

            evl.a($$0, "panorama_" + $$10 + ".png", $$5, $$0x -> {
            });
         }

         vd $$11 = vd.b($$0.getName()).a(n.t).a($$1x -> $$1x.a(new vb(vb.a.b, $$0.getAbsolutePath())));
         return vd.a("screenshot.success", $$11);
      } catch (Exception var18) {
         F.error("Couldn't save image", var18);
         var12 = vd.a("screenshot.failure", var18.getMessage());
      } finally {
         this.s.s($$6);
         this.s.r($$7);
         this.s.O = $$8;
         this.s.N = $$9;
         this.j.b(true);
         this.Q.b($$3);
         this.Q.c($$4);
         $$5.a();
         this.j.c(false);
         this.f.e();
         this.g().a(true);
      }

      return var12;
   }

   private vd a(File $$0, int $$1, int $$2, int $$3, int $$4) {
      try {
         ByteBuffer $$5 = eom.a($$1 * $$2 * 3);
         evl $$6 = new evl($$0, $$3, $$4, $$2);
         float $$7 = (float)$$3 / (float)$$1;
         float $$8 = (float)$$4 / (float)$$2;
         float $$9 = $$7 > $$8 ? $$7 : $$8;

         for (int $$10 = ($$4 - 1) / $$2 * $$2; $$10 >= 0; $$10 -= $$2) {
            for (int $$11 = 0; $$11 < $$3; $$11 += $$1) {
               RenderSystem.setShaderTexture(0, gee.e);
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
         eom.a($$5);
         vd $$15 = vd.b($$14.getName()).a(n.t).a($$1x -> $$1x.a(new vb(vb.a.b, $$14.getAbsolutePath())));
         return vd.a("screenshot.success", $$15);
      } catch (Exception var15) {
         F.warn("Couldn't save screenshot", var15);
         return vd.a("screenshot.failure", var15.getMessage());
      }
   }

   public bgm aF() {
      return this.bi;
   }

   @Nullable
   public anm aG() {
      return this.X.get();
   }

   public gfh aH() {
      return this.at;
   }

   @Nullable
   public fcn aI() {
      return this.aX;
   }

   public fhb aJ() {
      return this.aH;
   }

   public boolean aK() {
      return false;
   }

   public eox aL() {
      return this.Q;
   }

   public exg aM() {
      return this.l.k();
   }

   public ftf aN() {
      return this.S;
   }

   public void b(int $$0) {
      this.aA.a($$0);
   }

   public fml aO() {
      return this.aI;
   }

   public boolean aP() {
      return this.ay.properties().flag(UserFlag.PROFANITY_FILTER_ENABLED);
   }

   public void aQ() {
      this.aH.a();
      this.v().a();
   }

   public evi aR() {
      return this.br;
   }

   @Nullable
   public auv aS() {
      return auv.a(this.aw.getServicesKeySet(), ServicesKeyType.PROFILE_KEY);
   }

   public eux aT() {
      return this.Z;
   }

   public void a(eux $$0) {
      this.Z = $$0;
   }

   public eus aU() {
      return this.bs;
   }

   public fny aV() {
      return this.bt;
   }

   public fon aW() {
      return this.bu;
   }

   public erz aX() {
      return this.aM;
   }

   public fsj aY() {
      return this.aN;
   }

   public eup aZ() {
      return this.bv;
   }

   public elc ba() {
      return this.bw;
   }

   private float a(float $$0) {
      if (this.r != null) {
         bkf $$1 = this.r.s();
         if ($$1.i()) {
            return Math.max($$0, $$1.g());
         }
      }

      return $$0;
   }

   @Nullable
   public static String bb() {
      return System.getProperty("minecraft.launcher.brand");
   }

   public static enum a {
      a(vc.a) {
         @Override
         public boolean a(boolean $$0) {
            return true;
         }
      },
      b(vd.c("chat.disabled.options").a(n.m)) {
         @Override
         public boolean a(boolean $$0) {
            return false;
         }
      },
      c(vd.c("chat.disabled.launcher").a(n.m)) {
         @Override
         public boolean a(boolean $$0) {
            return $$0;
         }
      },
      d(vd.a("chat.disabled.profile", vd.d(eva.E.m.K.h())).a(n.m)) {
         @Override
         public boolean a(boolean $$0) {
            return $$0;
         }
      };

      static final vd e = vd.c("chat.disabled.profile.moreInfo");
      private final vd f;

      a(vd $$0) {
         this.f = $$0;
      }

      public vd a() {
         return this.f;
      }

      public abstract boolean a(boolean var1);
   }

   static record b(eqj a, fih.c b) {
   }
}
