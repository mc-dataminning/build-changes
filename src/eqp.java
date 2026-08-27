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

public class eqp extends bfy<Runnable> implements eko {
   static eqp E;
   private static final Logger F = LogUtils.getLogger();
   public static final boolean a = ac.i() == ac.a.d;
   private static final int G = 10;
   public static final aez b = new aez("default");
   public static final aez c = new aez("uniform");
   public static final aez d = new aez("alt");
   private static final aez H = new aez("regional_compliancies.json");
   private static final CompletableFuture<atc> I = CompletableFuture.completedFuture(atc.a);
   private static final tl J = tl.c("multiplayer.socialInteractions.not_available");
   public static final String e = "Please make sure you have up-to-date drivers (see aka.ms/mcdriver for instructions).";
   private final long K = Double.doubleToLongBits(Math.PI);
   private final Path L;
   private final CompletableFuture<ProfileResult> M;
   private final fzb N;
   private final DataFixer O;
   private final fos P;
   private final ekn Q;
   private final erc R = new erc(20.0F, 0L);
   private final fog S;
   public final fny f;
   private final ftb T;
   private final fub U;
   public final fls g;
   private final gcu V = new gcu();
   private final ere W;
   public final erx h;
   public final erx i;
   public final fnt j;
   public final frj k;
   private final AtomicReference<alg> X = new AtomicReference<>();
   public final ery l;
   public final eqt m;
   private final eql Y;
   public final eqq n;
   public final eqo o;
   private eqm Z = eqm.a;
   public final File p;
   private final String aa;
   private final String ab;
   private final Proxy ac;
   private final eca ad;
   private final boolean ae;
   private final boolean af;
   private final boolean ag;
   private final boolean ah;
   private final ant ai;
   private final amn aj;
   private final fzt ak;
   private final anh al;
   private final gai am;
   private final erq an;
   private final eru ao;
   private final ejv ap;
   private final gdm aq;
   private final gdh ar;
   private final euy as;
   private final gac at;
   private final fnu au;
   private final eqv av = new eqv(H, eqp::b);
   private final YggdrasilAuthenticationService aw;
   private final MinecraftSessionService ax;
   private final UserApiService ay;
   private final gab az;
   private final gbh aA;
   private final fou aB;
   private final fzz aC;
   private final fzy aD;
   private final esa aE;
   private final eut aF;
   private final gep aG;
   private final fcl aH;
   private final fht aI;
   private final fpz aJ;
   private final gdq aK;
   private final fjc aL;
   private final enp aM;
   private final fnk aN;
   @Nullable
   public fiz q;
   @Nullable
   public fis r;
   @Nullable
   public fnc s;
   @Nullable
   private gcz aO;
   @Nullable
   private sm aP;
   private boolean aQ;
   @Nullable
   public biw t;
   @Nullable
   public biw u;
   @Nullable
   public ehf v;
   private int aR;
   protected int w;
   private volatile boolean aS;
   private float aT;
   private long aU = ac.c();
   private long aV;
   private int aW;
   public boolean x;
   @Nullable
   public eye y;
   @Nullable
   private exz aX;
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
   private euu bh;
   private bdv bi = bds.a;
   private int bj;
   private final bdp bk = new bdp(ac.b, () -> this.bj);
   @Nullable
   private bdu bl;
   private bfg bm = bff.a;
   private final eqz bn = new eqz();
   private long bo;
   private double bp;
   @Nullable
   private elc.a bq;
   private final eqx br;
   private final eqh bs;
   private final fjg bt;
   private fjv bu;
   private final eqe bv;
   private final egx bw;
   private boolean bx;
   private final long by;
   private long bz;
   private String bA = "root";

   public eqp(fdr $$0) {
      super("Client");
      E = this;
      this.by = System.currentTimeMillis();
      this.p = $$0.c.a;
      File $$1 = $$0.c.c;
      this.L = $$0.c.b.toPath();
      this.aa = $$0.d.b;
      this.ab = $$0.d.c;
      Path $$2 = this.p.toPath();
      this.bw = eca.a($$2.resolve("allowed_symlinks.txt"));
      fzr $$3 = new fzr($$0.c.a(), this.bw);
      this.ak = new fzt(new File(this.p, "server-resource-packs"));
      anj $$4 = new and(this.L, aml.a, ani.b, this.bw);
      this.al = new anh($$3, this.ak, $$4);
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
      uq.a(eqn::a);
      this.O = ath.a();
      this.aF = new eut(this);
      this.aZ = Thread.currentThread();
      this.m = new eqt(this, this.p);
      RenderSystem.setShaderGlintAlpha(this.m.aj().c());
      this.ba = true;
      this.aG = new gep(this, this.m);
      this.Y = new eql(this.p, this.O);
      F.info("Backend library: {}", RenderSystem.getBackendDescription());
      eka $$5;
      if (this.m.p > 0 && this.m.o > 0) {
         $$5 = new eka(this.m.o, this.m.p, $$0.b.c, $$0.b.d, $$0.b.e);
      } else {
         $$5 = $$0.b;
      }

      ac.b = RenderSystem.initBackendSystem();
      this.P = new fos(this);
      this.Q = this.P.a($$5, this.m.k, this.bc());
      this.a(true);
      geb.a.b(gdx.A);

      try {
         this.Q.a(this.aj, aa.b().g() ? ekd.a : ekd.b);
      } catch (IOException var12) {
         F.error("Couldn't set icon", var12);
      }

      this.Q.a(this.m.g().c());
      this.n = new eqq(this);
      this.n.a(this.Q.i());
      this.o = new eqo(this);
      this.o.a(this.Q.i());
      RenderSystem.initRenderer(this.m.u, false);
      this.ap = new ejs(this.Q.k(), this.Q.l());
      this.ap.a(0.0F, 0.0F, 0.0F, 0.0F);
      this.ap.b(a);
      this.ai = new ant(aml.a);
      this.al.a();
      this.m.b(this.al);
      this.am = new gai(this.m.ad);
      this.ai.a(this.am);
      this.N = new fzb(this.ai);
      this.ai.a(this.N);
      this.az = new gab(this.N, $$1.toPath().resolve("skins"), this.ax, this);
      this.ad = new eca($$2.resolve("saves"), $$2.resolve("backups"), this.bw, this.O);
      this.bv = new eqe($$2);
      this.aq = new gdm(this.m);
      this.ai.a(this.aq);
      this.at = new gac(this.W);
      this.ai.a(this.at);
      this.ar = new gdh(this);
      this.as = new euy(this.N);
      this.h = this.as.a();
      this.i = this.as.b();
      this.ai.a(this.as);
      this.b(this.j());
      this.ai.a(new fzv());
      this.ai.a(new fzu());
      this.Q.a("Startup");
      RenderSystem.setupDefaultState(0, 0, this.Q.k(), this.Q.l());
      this.Q.a("Post startup");
      this.an = erq.a();
      this.ao = eru.a(this.an);
      this.aA = new gbh(this.N, this.an, this.m.z().c());
      this.ai.a(this.aA);
      this.aI = new fht();
      this.ai.a(this.aI);
      this.aJ = new fpz(this.h, this.aI, this::an, this::aq, this::ao);
      this.ai.a(this.aJ);
      fnn $$8 = new fnn(this.aJ, this.aI);
      this.ai.a($$8);
      this.U = new fub(this, this.N, this.aA, this.ao, $$8);
      this.ai.a(this.U);
      this.S = new fog();
      this.aH = new fcl(this, this.ay);
      this.aB = new fou(this.aA.b(), $$8, this.an);
      this.ai.a(this.aB);
      this.T = new ftb(this, this.N, this.U, this.aB, this.h, this.m, this.aI);
      this.ai.a(this.T);
      this.j = new fnt(this, this.T.d(), this.ai, this.S);
      this.ai.a(this.j.e());
      this.f = new fny(this, this.T, this.aJ, this.S);
      this.ai.a(this.f);
      this.be();
      this.ai.a(this.V);
      this.g = new fls(this.r, this.N);
      this.ai.a(this.g);
      this.aC = new fzz(this.N);
      this.ai.a(this.aC);
      this.aD = new fzy(this.N);
      this.ai.a(this.aD);
      this.aE = new esa(this.N);
      this.ai.a(this.aE);
      this.au = new fnu();
      this.ai.a(this.au);
      this.ai.a(this.av);
      this.l = new ery(this, this.U);
      this.k = new frj(this);
      elz $$9 = elz.a(this);
      this.aM = new enp($$9);
      RenderSystem.setErrorCallback(this::a);
      if (this.ap.c != this.Q.k() || this.ap.d != this.Q.l()) {
         StringBuilder $$10 = new StringBuilder(
            "Recovering from unsupported resolution ("
               + this.Q.k()
               + "x"
               + this.Q.l()
               + ").\nPlease make sure you have up-to-date drivers (see aka.ms/mcdriver for instructions)."
         );
         if (ekb.b()) {
            $$10.append("\n\nReported GL debug messages:\n").append(String.join("\n", ekb.a()));
         }

         this.Q.a(this.ap.c, this.ap.d);
         TinyFileDialogs.tinyfd_messageBox("Minecraft", $$10.toString(), "ok", "error", false);
      } else if (this.m.W().c() && !this.Q.j()) {
         this.Q.h();
         this.m.W().a(this.Q.j());
      }

      this.Q.a(this.m.K().c());
      this.Q.b(this.m.D().c());
      this.Q.c();
      this.a();
      this.j.a(this.aj.c());
      this.aK = new gdq(this, this.ay, this.W);
      this.aL = fjc.a(this.ay, this.W, $$2);
      this.br = new eqx(this);
      this.bs = new eqh(this);
      this.bs.a(this.m.ao().c() != eqr.a);
      this.bt = new fjg(this);
      this.bt.a(this.m.x().c());
      this.bu = fjv.a(fjs.a(), this.ay);
      exr.a(this);
      this.a(new exl(tl.c("gui.loadingMinecraft")));
      List<amk> $$11 = this.al.g();
      this.bn.a(eqz.b.a, $$11);
      ans $$12 = this.ai.a(ac.f(), this, I, $$11);
      geb.a.a(gdx.C);
      eqp.b $$13 = new eqp.b($$9, $$0.e);
      this.a(new exr(this, $$12, $$1x -> ac.a($$1x, $$1xx -> this.a($$1xx, $$13), () -> {
            if (aa.aT) {
               this.bg();
            }

            this.bn.a();
            this.a($$13);
         }), false));
      this.aN = fnk.a($$0.e.b());
   }

   private void a(@Nullable eqp.b $$0) {
      if (!this.bx) {
         this.bx = true;
         this.b($$0);
      }
   }

   private void b(@Nullable eqp.b $$0) {
      Runnable $$1 = this.c($$0);
      geb.a.b(gdx.C);
      geb.a.b(gdx.z);
      geb.a.a(this.aK.a());
      $$1.run();
   }

   public boolean c() {
      return this.bx;
   }

   private Runnable c(@Nullable eqp.b $$0) {
      List<Function<Runnable, eye>> $$1 = new ArrayList<>();
      this.a($$1);
      Runnable $$2 = () -> {
         if ($$0 != null && $$0.b().a()) {
            fnj.a(this, $$0.b(), $$0.a());
         } else {
            this.a(new eyj(true));
         }
      };

      for (Function<Runnable, eye> $$3 : Lists.reverse($$1)) {
         eye $$4 = $$3.apply($$2);
         $$2 = () -> this.a($$4);
      }

      return $$2;
   }

   private void a(List<Function<Runnable, eye>> $$0) {
      if (this.m.ae) {
         $$0.add($$0x -> new ewq(this.m, $$0x));
      }

      BanDetails $$1 = this.F();
      if ($$1 != null) {
         $$0.add($$1x -> ewu.a($$1xx -> {
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
            $$0.add($$1x -> ewu.a($$3.getName(), $$1x));
         }

         if ($$4.contains(ProfileActionType.USING_BANNED_SKIN)) {
            $$0.add(ewu::a);
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
      fit $$1 = this.J();
      if ($$1 != null && $$1.m().k()) {
         $$0.append(" - ");
         fjd $$2 = this.Q();
         if (this.aO != null && !this.aO.p()) {
            $$0.append(gag.a("title.singleplayer"));
         } else if ($$2 != null && $$2.e()) {
            $$0.append(gag.a("title.multiplayer.realms"));
         } else if (this.aO == null && ($$2 == null || !$$2.d())) {
            $$0.append(gag.a("title.multiplayer.other"));
         } else {
            $$0.append(gag.a("title.multiplayer.lan"));
         }
      }

      return $$0.toString();
   }

   private UserApiService a(YggdrasilAuthenticationService $$0, fdr $$1) {
      try {
         return $$0.createUserApiService($$1.a.a.d());
      } catch (AuthenticationException var4) {
         F.error("Failed to verify authentication", var4);
         return UserApiService.OFFLINE;
      }
   }

   public static asa e() {
      return asa.a("vanilla", ClientBrandRetriever::getClientModName, "Client", eqp.class);
   }

   private void a(Throwable $$0, @Nullable eqp.b $$1) {
      if (this.al.d().size() > 1) {
         this.a($$0, null, $$1);
      } else {
         ac.a($$0);
      }
   }

   public void a(Throwable $$0, @Nullable tl $$1, @Nullable eqp.b $$2) {
      F.info("Caught error loading resourcepacks, removing all selected resourcepacks", $$0);
      this.bn.a($$0);
      this.al.a(Collections.emptyList());
      this.m.i.clear();
      this.m.j.clear();
      this.m.ar();
      this.a(true, $$2).thenRun(() -> this.a($$1));
   }

   private void bd() {
      this.a(null);
      if (this.r != null) {
         this.r.U();
         this.z();
      }

      this.a(new eyj());
      this.a(null);
   }

   private void a(@Nullable tl $$0) {
      eut $$1 = this.ay();
      eur.b($$1, eur.a.d, tl.c("resourcePack.load_fail"), $$0);
   }

   public void f() {
      this.aZ = Thread.currentThread();
      if (Runtime.getRuntime().availableProcessors() > 4) {
         this.aZ.setPriority(10);
      }

      try {
         boolean $$0 = false;

         while (this.ba) {
            if (this.bb != null) {
               c(this.bb.get());
               return;
            }

            try {
               bdy $$1 = bdy.a("Renderer");
               boolean $$2 = this.aN().e();
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

               this.p();
               this.a(new exy());
               System.gc();
               F.error(LogUtils.FATAL_MARKER, "Out of memory", var4);
               $$0 = true;
            }
         }
      } catch (y var5) {
         this.d(var5.a());
         this.p();
         F.error(LogUtils.FATAL_MARKER, "Reported exception thrown!", var5);
         c(var5.a());
      } catch (Throwable var6) {
         o $$6 = this.d(new o("Unexpected error", var6));
         F.error(LogUtils.FATAL_MARKER, "Unreported exception thrown!", var6);
         this.p();
         c($$6);
      }
   }

   void b(boolean $$0) {
      this.as.a($$0 ? ImmutableMap.of(b, c) : ImmutableMap.of());
   }

   private void be() {
      this.V
         .a(
            gcu.a,
            $$0 -> new gcn<>(
                  $$0x -> $$0x.a(null, clc.a.a.c()).stream().map($$0xx -> n.a($$0xx.getString()).trim()).filter($$0xx -> !$$0xx.isEmpty()),
                  $$0x -> Stream.of(jb.i.b($$0x.d())),
                  $$0
               )
         );
      this.V.a(gcu.b, $$0 -> new gco<>($$0x -> $$0x.f().map(aqk::b), $$0));
      this.V
         .a(
            gcu.c,
            $$0 -> new gcn<>(
                  $$0x -> $$0x.e()
                        .stream()
                        .flatMap($$1 -> $$1.b().a($$0x.a()).a(null, clc.a.a).stream())
                        .map($$0xx -> n.a($$0xx.getString()).trim())
                        .filter($$0xx -> !$$0xx.isEmpty()),
                  $$0x -> $$0x.e().stream().map($$1 -> jb.i.b($$1.b().a($$0x.a()).d())),
                  $$0
               )
         );
      chs.e().a($$0 -> {
         this.a(gcu.a, $$0);
         this.a(gcu.b, $$0);
      });
   }

   private void a(int $$0, long $$1) {
      this.m.K().a(false);
      this.m.ar();
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

   public ejv g() {
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

   public static void c(o $$0) {
      File $$1 = new File(O().p, "crash-reports");
      File $$2 = new File($$1, "crash-" + ac.e() + "-client.txt");
      afb.a($$0.e());
      if ($$0.f() != null) {
         afb.a("#@!@# Game crashed! Crash report saved to: #@!@# " + $$0.f());
         System.exit(-1);
      } else if ($$0.a($$2)) {
         afb.a("#@!@# Game crashed! Crash report saved to: #@!@# " + $$2.getAbsolutePath());
         System.exit(-1);
      } else {
         afb.a("#@?@# Game crashed! Crash report could not be saved. #@?@#");
         System.exit(-2);
      }
   }

   public boolean j() {
      return this.m.M().c();
   }

   public CompletableFuture<Void> k() {
      return this.a(false, null);
   }

   private CompletableFuture<Void> a(boolean $$0, @Nullable eqp.b $$1) {
      if (this.bg != null) {
         return this.bg;
      } else {
         CompletableFuture<Void> $$2 = new CompletableFuture<>();
         if (!$$0 && this.aX instanceof exr) {
            this.bg = $$2;
            return $$2;
         } else {
            this.al.a();
            List<amk> $$3 = this.al.g();
            if (!$$0) {
               this.bn.a(eqz.b.b, $$3);
            }

            this.a(new exr(this, this.ai.a(ac.f(), this, I, $$3), $$3x -> ac.a($$3x, $$2xx -> {
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

   private void bg() {
      boolean $$0 = false;
      fot $$1 = this.an().a();
      gbb $$2 = $$1.a().a();

      for (ctc $$3 : jb.f) {
         UnmodifiableIterator $$10 = $$3.n().a().iterator();

         while ($$10.hasNext()) {
            dfd $$4 = (dfd)$$10.next();
            if ($$4.l() == czg.c) {
               gbb $$5 = $$1.b($$4);
               if ($$5 == $$2) {
                  F.debug("Missing model for: {}", $$4);
                  $$0 = true;
               }
            }
         }
      }

      fza $$6 = $$2.e();

      for (ctc $$7 : jb.f) {
         UnmodifiableIterator var17 = $$7.n().a().iterator();

         while (var17.hasNext()) {
            dfd $$8 = (dfd)var17.next();
            fza $$9 = $$1.a($$8);
            if (!$$8.i() && $$9 == $$6) {
               F.debug("Missing particle icon for: {}", $$8);
            }
         }
      }

      for (cjg $$10 : jb.i) {
         cjl $$11 = $$10.ai_();
         String $$12 = $$11.q();
         String $$13 = tl.c($$12).getString();
         if ($$13.toLowerCase(Locale.ROOT).equals($$10.a())) {
            F.debug("Missing translation for: {} {} {}", new Object[]{$$11, $$12, $$10});
         }
      }

      $$0 |= exs.a();
      $$0 |= fte.a();
      if ($$0) {
         throw new IllegalStateException("Your game data is foobar, fix the errors above!");
      }
   }

   public eca l() {
      return this.ad;
   }

   private void a(String $$0) {
      eqp.a $$1 = this.H();
      if (!$$1.a(this.R())) {
         if (this.l.b()) {
            this.l.b(false);
            this.a(new ewx($$0x -> {
               if ($$0x) {
                  ac.i().a("https://aka.ms/JavaAccountSettings");
               }

               this.a(null);
            }, eqp.a.e, "https://aka.ms/JavaAccountSettings", true));
         } else {
            tl $$2 = $$1.a();
            this.l.a($$2, false);
            this.bs.c($$2);
            this.l.b($$1 == eqp.a.d);
         }
      } else {
         this.a(new eww($$0));
      }
   }

   public void a(@Nullable eye $$0) {
      if (aa.aT && Thread.currentThread() != this.aZ) {
         F.error("setScreen called from non-game thread");
      }

      if (this.y != null) {
         this.y.h();
      }

      if ($$0 == null && this.aY) {
         throw new IllegalStateException("Trying to return to in-game GUI during disconnection");
      } else {
         if ($$0 == null && this.r == null) {
            $$0 = new eyj();
         } else if ($$0 == null && this.s.ev()) {
            if (this.s.o()) {
               $$0 = new exe(null, this.r.k().n());
            } else {
               this.s.fQ();
            }
         }

         this.y = $$0;
         if (this.y != null) {
            this.y.aA_();
         }

         elf.a();
         if ($$0 != null) {
            this.n.j();
            eqn.b();
            $$0.b(this, this.Q.o(), this.Q.p());
            this.x = false;
         } else {
            this.aq.g();
            this.n.i();
         }

         this.d();
      }
   }

   public void a(@Nullable exz $$0) {
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
               this.r.U();
            }

            this.z();
         } catch (Throwable var6) {
         }

         if (this.y != null) {
            this.y.h();
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
         this.q();
      }

      if (this.bg != null && !(this.aX instanceof exr)) {
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
         this.bp();
         this.bi.c();
         this.bi.a("tick");

         for (int $$5 = 0; $$5 < Math.min(10, $$4); $$5++) {
            this.bi.d("clientTick");
            this.t();
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
      if (!this.aN().d() && !this.bm.e()) {
         $$8 = false;
         this.bp = 0.0;
      } else {
         $$8 = this.bq == null || this.bq.b();
         if ($$8) {
            elc.a().ifPresent(elc::b);
         }
      }

      RenderSystem.clear(16640, a);
      this.ap.a(true);
      fns.a();
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
         erz $$9 = new erz(this, this.S.b());
         this.a($$9, this.bl);
         $$9.e();
         this.bi.c();
      }

      this.bi.a("blit");
      this.ap.e();
      this.ap.a(this.Q.k(), this.Q.l());
      this.bd = ac.c() - $$6;
      if ($$8) {
         elc.a().ifPresent($$0x -> this.bq = $$0x.c());
      }

      this.bi.b("updateDisplay");
      this.Q.e();
      int $$10 = this.bh();
      if ($$10 < 260) {
         RenderSystem.limitDisplayFPS($$10);
      }

      this.bi.b("yield");
      Thread.yield();
      this.bi.c();
      this.Q.a("Post render");
      this.aW++;
      boolean $$11 = this.S() && (this.y != null && this.y.j() || this.aX != null && this.aX.a()) && !this.aO.p();
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

      this.aN().a($$13);
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
            this.m.K().c() ? " vsync" : "",
            this.m.i().c(),
            this.m.h().c() == eqd.a ? "" : (this.m.h().c() == eqd.b ? " fast-clouds" : " fancy-clouds"),
            this.m.B().c(),
            $$14
         );
         this.aV += 1000L;
         this.aW = 0;
      }

      this.bi.c();
   }

   private bdv a(boolean $$0, @Nullable bdy $$1) {
      if (!$$0) {
         this.bk.b();
         if (!this.bm.e() && $$1 == null) {
            return bds.a;
         }
      }

      bdv $$2;
      if ($$0) {
         if (!this.bk.a()) {
            this.bj = 0;
            this.bk.c();
         }

         this.bj++;
         $$2 = this.bk.d();
      } else {
         $$2 = bds.a;
      }

      if (this.bm.e()) {
         $$2 = bdv.a($$2, this.bm.f());
      }

      return bdy.a($$2, $$1);
   }

   private void b(boolean $$0, @Nullable bdy $$1) {
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
      int $$0 = this.Q.a(this.m.am().c(), this.j());
      this.Q.a((double)$$0);
      if (this.y != null) {
         this.y.a(this, this.Q.o(), this.Q.p());
      }

      ejv $$1 = this.g();
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

   private int bh() {
      return this.r != null || this.y == null && this.aX == null ? this.Q.d() : 60;
   }

   public void p() {
      try {
         arz.b();
         this.f.p();
      } catch (Throwable var3) {
      }

      try {
         System.gc();
         if (this.aQ && this.aO != null) {
            this.aO.a(true);
         }

         this.b((eye)(new exl(tl.c("menu.savingLevel"))));
      } catch (Throwable var2) {
      }

      System.gc();
   }

   public boolean a(Consumer<tl> $$0) {
      if (this.bm.e()) {
         this.bi();
         return false;
      } else {
         Consumer<bdu> $$1 = $$1x -> {
            if ($$1x != bdq.a) {
               int $$2x = $$1x.f();
               double $$3x = (double)$$1x.g() / (double)asz.a;
               this.execute(
                  () -> $$0.accept(
                        tl.a("commands.debug.stopped", String.format(Locale.ROOT, "%.2f", $$3x), $$2x, String.format(Locale.ROOT, "%.2f", (double)$$2x / $$3x))
                     )
               );
            }
         };
         Consumer<Path> $$2 = $$1x -> {
            tl $$2x = tl.b($$1x.toString()).a(n.t).a($$1xx -> $$1xx.a(new tj(tj.a.b, $$1x.toFile().getParent())));
            this.execute(() -> $$0.accept(tl.a("debug.profiling.stop", $$2x)));
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

         this.bm = bfe.a(new fnh(ac.b, this.f), ac.b, ac.g(), new bfk("client"), $$1x -> {
            this.bm = bff.a;
            $$1.accept($$1x);
         }, $$5);
         return true;
      }
   }

   private void bi() {
      this.bm.a();
      if (this.aO != null) {
         this.aO.aP();
      }
   }

   private void bj() {
      this.bm.b();
      if (this.aO != null) {
         this.aO.aQ();
      }
   }

   private Path a(ab $$0, List<Path> $$1) {
      String $$2;
      if (this.R()) {
         $$2 = this.T().aT().g();
      } else {
         fjd $$3 = this.Q();
         $$2 = $$3 != null ? $$3.a : "unknown";
      }

      Path $$7;
      try {
         String $$5 = String.format(Locale.ROOT, "%s-%s-%s", ac.e(), $$2, aa.b().b());
         String $$6 = v.a(bfk.a, $$5, ".zip");
         $$7 = bfk.a.resolve($$6);
      } catch (IOException var21) {
         throw new UncheckedIOException(var21);
      }

      try (arm $$10 = new arm($$7)) {
         $$10.a(Paths.get("system.txt"), $$0.a());
         $$10.a(Paths.get("client").resolve(this.m.ax().getName()), this.m.ay());
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
         List<bdx> $$1 = this.bl.a(this.bA);
         if (!$$1.isEmpty()) {
            bdx $$2 = $$1.remove(0);
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

   private void a(erz $$0, bdu $$1) {
      List<bdx> $$2 = $$1.a(this.bA);
      bdx $$3 = $$2.remove(0);
      RenderSystem.clear(256, a);
      RenderSystem.setShader(fnt::q);
      Matrix4f $$4 = new Matrix4f().setOrtho(0.0F, (float)this.Q.k(), (float)this.Q.l(), 0.0F, 1000.0F, 3000.0F);
      RenderSystem.setProjectionMatrix($$4, elr.b);
      elj $$5 = RenderSystem.getModelViewStack();
      $$5.a();
      $$5.e();
      $$5.a(0.0F, 0.0F, -2000.0F);
      RenderSystem.applyModelViewMatrix();
      RenderSystem.lineWidth(1.0F);
      ell $$6 = ell.a();
      ele $$7 = $$6.c();
      int $$8 = 160;
      int $$9 = this.Q.k() - 160 - 10;
      int $$10 = this.Q.l() - 320;
      RenderSystem.enableBlend();
      $$7.a(elo.b.h, elh.n);
      $$7.a((double)((float)$$9 - 176.0F), (double)((float)$$10 - 96.0F - 16.0F), 0.0).a(200, 0, 0, 0).e();
      $$7.a((double)((float)$$9 - 176.0F), (double)($$10 + 320), 0.0).a(200, 0, 0, 0).e();
      $$7.a((double)((float)$$9 + 176.0F), (double)($$10 + 320), 0.0).a(200, 0, 0, 0).e();
      $$7.a((double)((float)$$9 + 176.0F), (double)((float)$$10 - 96.0F - 16.0F), 0.0).a(200, 0, 0, 0).e();
      $$6.b();
      RenderSystem.disableBlend();
      double $$11 = 0.0;

      for (bdx $$12 : $$2) {
         int $$13 = asb.a($$12.a / 4.0) + 1;
         $$7.a(elo.b.g, elh.n);
         int $$14 = $$12.a();
         int $$15 = $$14 >> 16 & 0xFF;
         int $$16 = $$14 >> 8 & 0xFF;
         int $$17 = $$14 & 0xFF;
         $$7.a((double)$$9, (double)$$10, 0.0).a($$15, $$16, $$17, 255).e();

         for (int $$18 = $$13; $$18 >= 0; $$18--) {
            float $$19 = (float)(($$11 + $$12.a * (double)$$18 / (double)$$13) * (float) (Math.PI * 2) / 100.0);
            float $$20 = asb.a($$19) * 160.0F;
            float $$21 = asb.b($$19) * 160.0F * 0.5F;
            $$7.a((double)((float)$$9 + $$20), (double)((float)$$10 - $$21), 0.0).a($$15, $$16, $$17, 255).e();
         }

         $$6.b();
         $$7.a(elo.b.f, elh.n);

         for (int $$22 = $$13; $$22 >= 0; $$22--) {
            float $$23 = (float)(($$11 + $$12.a * (double)$$22 / (double)$$13) * (float) (Math.PI * 2) / 100.0);
            float $$24 = asb.a($$23) * 160.0F;
            float $$25 = asb.b($$23) * 160.0F * 0.5F;
            if (!($$25 > 0.0F)) {
               $$7.a((double)((float)$$9 + $$24), (double)((float)$$10 - $$25), 0.0).a($$15 >> 1, $$16 >> 1, $$17 >> 1, 255).e();
               $$7.a((double)((float)$$9 + $$24), (double)((float)$$10 - $$25 + 10.0F), 0.0).a($$15 >> 1, $$16 >> 1, $$17 >> 1, 255).e();
            }
         }

         $$6.b();
         $$11 += $$12.a;
      }

      DecimalFormat $$26 = new DecimalFormat("##0.00");
      $$26.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.ROOT));
      String $$27 = bdu.b($$3.d);
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
         bdx $$31 = $$2.get($$30);
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

   public void q() {
      this.ba = false;
   }

   public boolean r() {
      return this.ba;
   }

   public void c(boolean $$0) {
      if (this.y == null) {
         boolean $$1 = this.S() && !this.aO.p();
         if ($$1) {
            this.a(new eya(!$$0));
            this.aq.d();
         } else {
            this.a(new eya(true));
         }
      }
   }

   private void e(boolean $$0) {
      if (!$$0) {
         this.w = 0;
      }

      if (this.w <= 0 && !this.s.fn()) {
         if ($$0 && this.v != null && this.v.c() == ehf.a.b) {
            ehd $$1 = (ehd)this.v;
            gw $$2 = $$1.a();
            if (!this.r.a_($$2).i()) {
               ha $$3 = $$1.b();
               if (this.q.b($$2, $$3)) {
                  this.g.a($$2, $$3);
                  this.s.a(bhd.a);
               }
            }
         } else {
            this.q.b();
         }
      }
   }

   private boolean bs() {
      if (this.w > 0) {
         return false;
      } else if (this.v == null) {
         F.error("Null returned as 'hitResult', this shouldn't happen!");
         if (this.q.f()) {
            this.w = 10;
         }

         return false;
      } else if (this.s.y()) {
         return false;
      } else {
         cjl $$0 = this.s.b(bhd.a);
         if (!$$0.a(this.r.G())) {
            return false;
         } else {
            boolean $$1 = false;
            switch (this.v.c()) {
               case c:
                  this.q.a(this.s, ((ehe)this.v).a());
                  break;
               case b:
                  ehd $$2 = (ehd)this.v;
                  gw $$3 = $$2.a();
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

            this.s.a(bhd.a);
            return $$1;
         }
      }
   }

   private void bt() {
      if (!this.q.m()) {
         this.aR = 4;
         if (!this.s.y()) {
            if (this.v == null) {
               F.warn("Null returned as 'hitResult', this shouldn't happen!");
            }

            for (bhd $$0 : bhd.values()) {
               cjl $$1 = this.s.b($$0);
               if (!$$1.a(this.r.G())) {
                  return;
               }

               if (this.v != null) {
                  switch (this.v.c()) {
                     case c:
                        ehe $$2 = (ehe)this.v;
                        biw $$3 = $$2.a();
                        if (!this.r.B_().a($$3.dl())) {
                           return;
                        }

                        bhe $$4 = this.q.a(this.s, $$3, $$2, $$0);
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
                        ehd $$5 = (ehd)this.v;
                        int $$6 = $$1.L();
                        bhe $$7 = this.q.a(this.s, $$0, $$5);
                        if ($$7.a()) {
                           if ($$7.b()) {
                              this.s.a($$0);
                              if (!$$1.b() && ($$1.L() != $$6 || this.q.g())) {
                                 this.j.b.a($$0);
                              }
                           }

                           return;
                        }

                        if ($$7 == bhe.e) {
                           return;
                        }
                  }
               }

               if (!$$1.b()) {
                  bhe $$8 = this.q.a(this.s, $$0);
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

   public gdh s() {
      return this.ar;
   }

   public void t() {
      this.bz++;
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
      this.N.e();
      if (this.y != null || this.s == null) {
         if (this.y instanceof exn $$0 && !this.s.fD()) {
            $$0.l();
         }
      } else if (this.s.ev() && !(this.y instanceof exe)) {
         this.a(null);
      } else if (this.s.fD() && this.r != null) {
         this.a(new exn());
      }

      if (this.y != null) {
         this.w = 10000;
      }

      if (this.y != null) {
         eye.a(() -> this.y.c(), "Ticking screen", this.y.getClass().getCanonicalName());
      }

      if (!this.aN().d()) {
         this.l.l();
      }

      if (this.aX == null && this.y == null) {
         this.bi.b("Keybindings");
         this.bv();
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
            if (!this.m.s && this.bu()) {
               tl $$1 = tl.c("tutorial.socialInteractions.title");
               tl $$2 = tl.a("tutorial.socialInteractions.description", gep.a("socialInteractions"));
               this.bh = new euu(euu.a.f, $$1, $$2, true);
               this.aG.a(this.bh, 160);
               this.m.s = true;
               this.m.ar();
            }

            this.aG.d();

            try {
               this.r.a(() -> true);
            } catch (Throwable var4) {
               o $$4 = o.a(var4, "Exception in world tick");
               if (this.r == null) {
                  p $$5 = $$4.a("Affected level");
                  $$5.a("Problem", "Level is null!");
               } else {
                  this.r.a($$4);
               }

               throw new y($$4);
            }
         }

         this.bi.b("animateTick");
         if (!this.aS && this.r != null) {
            this.r.b(this.s.dp(), this.s.dr(), this.s.dv());
         }

         this.bi.b("particles");
         if (!this.aS) {
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

   private boolean bu() {
      return !this.aQ || this.aO != null && this.aO.p();
   }

   private void bv() {
      while (this.m.P.g()) {
         eqb $$0 = this.m.aw();
         this.m.a(this.m.aw().c());
         if ($$0.a() != this.m.aw().a()) {
            this.j.a(this.m.aw().a() ? this.am() : null);
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
            if (this.s.M_()) {
               this.l.g().a($$1);
            } else if (!this.s.f() || this.y != null || !$$3 && !$$2) {
               this.s.fS().l = $$1;
            } else {
               ezr.a(this, $$1, $$3, $$2);
            }
         }
      }

      while (this.m.N.g()) {
         if (!this.bu()) {
            this.s.a(J, true);
            this.bs.c(J);
         } else {
            if (this.bh != null) {
               this.aG.a(this.bh);
               this.bh = null;
            }

            this.a(new fcn());
         }
      }

      while (this.m.E.g()) {
         if (this.q.i()) {
            this.s.i();
         } else {
            this.aG.a();
            this.a(new fac(this.s));
         }
      }

      while (this.m.T.g()) {
         this.a(new eyu(this.s.cn.r()));
      }

      while (this.m.F.g()) {
         if (!this.s.M_()) {
            this.J().b(new acf(acf.a.g, gw.b, ha.a));
         }
      }

      while (this.m.G.g()) {
         if (!this.s.M_() && this.s.a(eye.p())) {
            this.s.a(bhd.a);
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
            $$4 |= this.bs();
         }

         while (this.m.H.g()) {
            this.bt();
         }

         while (this.m.J.g()) {
            this.bw();
         }
      }

      if (this.m.H.e() && this.aR == 0 && !this.s.fn()) {
         this.bt();
      }

      this.e(this.y == null && !$$4 && this.m.I.e() && this.n.h());
   }

   public gdq u() {
      return this.aK;
   }

   public double v() {
      return this.bp;
   }

   public fjc w() {
      return this.aL;
   }

   public fdd y() {
      return new fdd(this, this.ad);
   }

   public void a(String $$0, eca.c $$1, anh $$2, afu $$3, boolean $$4) {
      this.z();
      this.X.set(null);
      Instant $$5 = Instant.now();

      try {
         $$1.a($$3.c().a(), $$3.d());
         afr $$6 = afr.a(this.aw, this.p);
         $$6.e().a(this);
         dej.a($$6, this);
         aof.a(false);
         this.aO = MinecraftServer.a((Function<Thread, gcz>)($$4x -> new gcz($$4x, this, $$1, $$2, $$3, $$6, $$0xx -> {
               alg $$1xx = new alg($$0xx + 0);
               this.X.set($$1xx);
               return alf.a($$1xx, this.bf::add);
            })));
         this.aQ = true;
         this.a(fjs.a());
         this.aN.a(fnk.c.a, $$0, $$3.d().g());
      } catch (Throwable var12) {
         o $$8 = o.a(var12, "Starting integrated server");
         p $$9 = $$8.a("Starting integrated server");
         $$9.a("Level ID", $$0);
         $$9.a("Level Name", () -> $$3.d().g());
         throw new y($$8);
      }

      while (this.X.get() == null) {
         Thread.yield();
      }

      exp $$10 = new exp(this.X.get());
      this.a($$10);
      this.bi.a("waitForServer");

      while (!this.aO.ae()) {
         $$10.c();
         this.d(false);

         try {
            Thread.sleep(16L);
         } catch (InterruptedException var11) {
         }

         if (this.bb != null) {
            c(this.bb.get());
            return;
         }
      }

      this.bi.c();
      Duration $$11 = Duration.between($$5, Instant.now());
      SocketAddress $$12 = this.aO.ad().a();
      sm $$13 = sm.a($$12);
      $$13.a($$12.toString(), 0, new fir($$13, this, null, null, $$4, $$11, $$0x -> {
      }));
      $$13.a(new adn(this.V().c(), this.V().b()));
      this.aP = $$13;
   }

   public void a(fis $$0) {
      eyc $$1 = new eyc(true);
      $$1.a(tl.c("connect.joining"));
      this.e($$1);
      this.r = $$0;
      this.b($$0);
      if (!this.aQ) {
         afr $$2 = afr.a(this.aw, this.p);
         $$2.e().a(this);
         dej.a($$2, this);
         aof.a(false);
      }
   }

   public void z() {
      this.b((eye)(new eyc(true)));
   }

   public void b(eye $$0) {
      fit $$1 = this.J();
      if ($$1 != null) {
         this.bo();
         $$1.j();
      }

      this.aH.b();
      if (this.bm.e()) {
         this.bj();
      }

      gcz $$2 = this.aO;
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

               while (!$$2.C()) {
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

      dej.c();
   }

   public void c(eye $$0) {
      fit $$1 = this.J();
      if ($$1 != null) {
         $$1.k();
      }

      if (this.bm.e()) {
         this.bj();
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

      dej.c();
   }

   private void e(eye $$0) {
      this.bi.a("forcedTick");
      this.aq.e();
      this.t = null;
      this.aP = null;
      this.a($$0);
      this.d(false);
      this.bi.c();
   }

   public void d(eye $$0) {
      this.bi.a("forcedTick");
      this.a($$0);
      this.d(false);
      this.bi.c();
   }

   private void b(@Nullable fis $$0) {
      this.f.a($$0);
      this.g.a($$0);
      this.aJ.a($$0);
      this.d();
   }

   public boolean A() {
      return this.B() && this.m.ae().c();
   }

   public boolean B() {
      return this.C() && this.ay.properties().flag(UserFlag.OPTIONAL_TELEMETRY_AVAILABLE);
   }

   public boolean C() {
      return this.ay.properties().flag(UserFlag.TELEMETRY_ENABLED);
   }

   public boolean D() {
      return this.ag && this.ay.properties().flag(UserFlag.SERVERS_ALLOWED) && this.F() == null && !this.G();
   }

   public boolean E() {
      return this.ay.properties().flag(UserFlag.REALMS_ALLOWED) && this.F() == null;
   }

   @Nullable
   public BanDetails F() {
      return (BanDetails)this.ay.properties().bannedScopes().get("MULTIPLAYER");
   }

   public boolean G() {
      ProfileResult $$0 = this.M.getNow(null);
      return $$0 != null && $$0.actions().contains(ProfileActionType.FORCED_NAME_CHANGE);
   }

   public boolean a(UUID $$0) {
      return this.H().a(false) ? this.aH.c($$0) : (this.s == null || !$$0.equals(this.s.cv())) && !$$0.equals(ac.d);
   }

   public eqp.a H() {
      if (this.m.l().c() == cby.c) {
         return eqp.a.b;
      } else if (!this.ah) {
         return eqp.a.c;
      } else {
         return !this.ay.properties().flag(UserFlag.CHAT_ALLOWED) ? eqp.a.d : eqp.a.a;
      }
   }

   public final boolean I() {
      return this.af;
   }

   @Nullable
   public fit J() {
      return this.s == null ? null : this.s.cn;
   }

   public static boolean K() {
      return !E.m.Z;
   }

   public static boolean L() {
      return E.m.i().c().a() >= eqi.b.a();
   }

   public static boolean M() {
      return !E.j.a() && E.m.i().c().a() >= eqi.c.a();
   }

   public static boolean N() {
      return E.m.j().c();
   }

   private void bw() {
      if (this.v != null && this.v.c() != ehf.a.a) {
         boolean $$0 = this.s.fT().d;
         dcz $$1 = null;
         ehf.a $$2 = this.v.c();
         cjl $$6;
         if ($$2 == ehf.a.b) {
            gw $$3 = ((ehd)this.v).a();
            dfd $$4 = this.r.a_($$3);
            if ($$4.i()) {
               return;
            }

            ctc $$5 = $$4.b();
            $$6 = $$5.a((cqe)this.r, $$3, $$4);
            if ($$6.b()) {
               return;
            }

            if ($$0 && eye.p() && $$4.t()) {
               $$1 = this.r.c_($$3);
            }
         } else {
            if ($$2 != ehf.a.c || !$$0) {
               return;
            }

            biw $$7 = ((ehe)this.v).a();
            $$6 = $$7.dy();
            if ($$6 == null) {
               return;
            }
         }

         if ($$6.b()) {
            String $$10 = "";
            if ($$2 == ehf.a.b) {
               $$10 = jb.f.b(this.r.a_(((ehd)this.v).a()).b()).toString();
            } else if ($$2 == ehf.a.c) {
               $$10 = jb.h.b(((ehe)this.v).a().ag()).toString();
            }

            F.warn("Picking on: [{}] {} gave null item", $$2, $$10);
         } else {
            cbz $$11 = this.s.fS();
            if ($$1 != null) {
               this.a($$6, $$1);
            }

            int $$12 = $$11.b($$6);
            if ($$0) {
               $$11.a($$6);
               this.q.a(this.s.b(bhd.a), 36 + $$11.l);
            } else if ($$12 != -1) {
               if (cbz.d($$12)) {
                  $$11.l = $$12;
               } else {
                  this.q.a($$12);
               }
            }
         }
      }
   }

   private void a(cjl $$0, dcz $$1) {
      qw $$2 = $$1.m();
      che.a($$0, $$1.u(), $$2);
      if ($$0.d() instanceof cjz && $$2.e("SkullOwner")) {
         qw $$3 = $$2.p("SkullOwner");
         qw $$4 = $$0.w();
         $$4.a("SkullOwner", $$3);
         qw $$5 = $$4.p("BlockEntityTag");
         $$5.r("SkullOwner");
         $$5.r("x");
         $$5.r("y");
         $$5.r("z");
      } else {
         qw $$6 = new qw();
         rc $$7 = new rc();
         $$7.add(ro.a("\"(+NBT)\""));
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

   public static void a(@Nullable eqp $$0, @Nullable gai $$1, String $$2, @Nullable eqt $$3, o $$4) {
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

   private static ab a(ab $$0, @Nullable eqp $$1, @Nullable gai $$2, String $$3, eqt $$4) {
      $$0.a("Launched Version", () -> $$3);
      $$0.a("Backend library", RenderSystem::getBackendDescription);
      $$0.a("Backend API", RenderSystem::getApiDescription);
      $$0.a("Window size", () -> $$1 != null ? $$1.Q.k() + "x" + $$1.Q.l() : "<not initialized>");
      $$0.a("GL Caps", RenderSystem::getCapsString);
      $$0.a("GL debug messages", () -> ekb.b() ? String.join("\n", ekb.a()) : "<disabled>");
      $$0.a("Using VBOs", () -> "Yes");
      $$0.a("Is Modded", () -> e().b());
      $$0.a("Universe", () -> Long.toHexString($$1.K));
      $$0.a("Type", "Client (map_client.txt)");
      if ($$4 != null) {
         if (E != null) {
            String $$5 = E.ah().m();
            if ($$5 != null) {
               $$0.a("GPU Warnings", $$5);
            }
         }

         $$0.a("Graphics mode", $$4.i().c().toString());
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
      $$0.a("CPU", ekc::b);
      return $$0;
   }

   public static eqp O() {
      return E;
   }

   public CompletableFuture<Void> P() {
      return this.a(this::k).thenCompose($$0 -> (CompletionStage<Void>)$$0);
   }

   public void a(fjs $$0) {
      if (!this.bu.a($$0)) {
         this.bu = fjv.a($$0, this.ay);
      }
   }

   @Nullable
   public fjd Q() {
      return x.a(this.J(), fit::x);
   }

   public boolean R() {
      return this.aQ;
   }

   public boolean S() {
      return this.aQ && this.aO != null;
   }

   @Nullable
   public gcz T() {
      return this.aO;
   }

   public boolean U() {
      gcz $$0 = this.T();
      return $$0 != null && !$$0.p();
   }

   public boolean b(UUID $$0) {
      return $$0.equals(this.V().b());
   }

   public ere V() {
      return this.W;
   }

   public GameProfile W() {
      ProfileResult $$0 = this.M.join();
      return $$0 != null ? $$0.profile() : new GameProfile(this.W.b(), this.W.c());
   }

   public Proxy X() {
      return this.ac;
   }

   public fzb Y() {
      return this.N;
   }

   public anw Z() {
      return this.ai;
   }

   public anh aa() {
      return this.al;
   }

   public amn ab() {
      return this.aj;
   }

   public fzt ac() {
      return this.ak;
   }

   public Path ad() {
      return this.L;
   }

   public gai ae() {
      return this.am;
   }

   public Function<aez, fza> a(aez $$0) {
      return this.aA.a($$0)::a;
   }

   public boolean af() {
      return this.ae;
   }

   public boolean ag() {
      return this.aS;
   }

   public fnu ah() {
      return this.au;
   }

   public gdm ai() {
      return this.aq;
   }

   public apd aj() {
      apd $$0 = x.a(this.y, eye::C);
      if ($$0 != null) {
         return $$0;
      } else if (this.s != null) {
         if (this.s.dL().ac() == cqb.j) {
            return this.l.j().b() ? ape.d : ape.e;
         } else {
            he<cqz> $$1 = this.s.dL().s(this.s.dl());
            if (!this.ar.c(ape.f) && (!this.s.bc() || !$$1.a(apu.Y))) {
               return this.s.dL().ac() != cqb.i && this.s.fT().d && this.s.fT().c ? ape.b : $$1.a().o().orElse(ape.g);
            } else {
               return ape.f;
            }
         }
      } else {
         return ape.a;
      }
   }

   public MinecraftSessionService ak() {
      return this.ax;
   }

   public gab al() {
      return this.az;
   }

   @Nullable
   public biw am() {
      return this.t;
   }

   public void a(biw $$0) {
      this.t = $$0;
      this.j.a($$0);
   }

   public boolean b(biw $$0) {
      return $$0.cc() || this.s != null && this.s.M_() && this.m.S.e() && $$0.ag() == bja.bt;
   }

   @Override
   protected Thread au() {
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

   public fou an() {
      return this.aB;
   }

   public ftb ao() {
      return this.T;
   }

   public fpz ap() {
      return this.aJ;
   }

   public fub aq() {
      return this.U;
   }

   public <T> gcv<T> a(gcu.a<T> $$0) {
      return this.V.a($$0);
   }

   public <T> void a(gcu.a<T> $$0, List<T> $$1) {
      this.V.a($$0, $$1);
   }

   public DataFixer ar() {
      return this.O;
   }

   public float as() {
      return this.R.a;
   }

   public float av() {
      return this.R.b;
   }

   public erq aw() {
      return this.an;
   }

   public boolean ax() {
      return this.s != null && this.s.gi() || this.m.R().c();
   }

   public eut ay() {
      return this.aF;
   }

   public gep az() {
      return this.aG;
   }

   public boolean aA() {
      return this.be;
   }

   public eql aB() {
      return this.Y;
   }

   public gbh aC() {
      return this.aA;
   }

   public fzz aD() {
      return this.aC;
   }

   public fzy aE() {
      return this.aD;
   }

   public esa aF() {
      return this.aE;
   }

   @Override
   public void a(boolean $$0) {
      this.be = $$0;
   }

   public tl a(File $$0, int $$1, int $$2) {
      int $$3 = this.Q.k();
      int $$4 = this.Q.l();
      ejv $$5 = new ejw($$1, $$2, true, a);
      float $$6 = this.s.dD();
      float $$7 = this.s.dB();
      float $$8 = this.s.O;
      float $$9 = this.s.N;
      this.j.b(false);

      tz var12;
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

            this.s.N = this.s.dB();
            this.s.O = this.s.dD();
            $$5.a(true);
            this.j.a(1.0F, 0L, new elj());

            try {
               Thread.sleep(10L);
            } catch (InterruptedException var17) {
            }

            era.a($$0, "panorama_" + $$10 + ".png", $$5, $$0x -> {
            });
         }

         tl $$11 = tl.b($$0.getName()).a(n.t).a($$1x -> $$1x.a(new tj(tj.a.b, $$0.getAbsolutePath())));
         return tl.a("screenshot.success", $$11);
      } catch (Exception var18) {
         F.error("Couldn't save image", var18);
         var12 = tl.a("screenshot.failure", var18.getMessage());
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

   private tl a(File $$0, int $$1, int $$2, int $$3, int $$4) {
      try {
         ByteBuffer $$5 = ekc.a($$1 * $$2 * 3);
         era $$6 = new era($$0, $$3, $$4, $$2);
         float $$7 = (float)$$3 / (float)$$1;
         float $$8 = (float)$$4 / (float)$$2;
         float $$9 = $$7 > $$8 ? $$7 : $$8;

         for (int $$10 = ($$4 - 1) / $$2 * $$2; $$10 >= 0; $$10 -= $$2) {
            for (int $$11 = 0; $$11 < $$3; $$11 += $$1) {
               RenderSystem.setShaderTexture(0, fyz.e);
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
         ekc.a($$5);
         tl $$15 = tl.b($$14.getName()).a(n.t).a($$1x -> $$1x.a(new tj(tj.a.b, $$14.getAbsolutePath())));
         return tl.a("screenshot.success", $$15);
      } catch (Exception var15) {
         F.warn("Couldn't save screenshot", var15);
         return tl.a("screenshot.failure", var15.getMessage());
      }
   }

   public bdv aG() {
      return this.bi;
   }

   @Nullable
   public alg aH() {
      return this.X.get();
   }

   public gac aI() {
      return this.at;
   }

   @Nullable
   public exz aJ() {
      return this.aX;
   }

   public fcl aK() {
      return this.aH;
   }

   public boolean aL() {
      return false;
   }

   public ekn aM() {
      return this.Q;
   }

   public ess aN() {
      return this.l.k();
   }

   public fog aO() {
      return this.S;
   }

   public void b(int $$0) {
      this.aA.a($$0);
   }

   public fht aP() {
      return this.aI;
   }

   public boolean aQ() {
      return this.ay.properties().flag(UserFlag.PROFANITY_FILTER_ENABLED);
   }

   public void aR() {
      this.aH.a();
      this.w().a();
   }

   public eqx aS() {
      return this.br;
   }

   @Nullable
   public asm aT() {
      return asm.a(this.aw.getServicesKeySet(), ServicesKeyType.PROFILE_KEY);
   }

   public eqm aU() {
      return this.Z;
   }

   public void a(eqm $$0) {
      this.Z = $$0;
   }

   public eqh aV() {
      return this.bs;
   }

   public fjg aW() {
      return this.bt;
   }

   public fjv aX() {
      return this.bu;
   }

   public enp aY() {
      return this.aM;
   }

   public fnk aZ() {
      return this.aN;
   }

   public eqe ba() {
      return this.bv;
   }

   public egx bb() {
      return this.bw;
   }

   public static enum a {
      a(tk.a) {
         @Override
         public boolean a(boolean $$0) {
            return true;
         }
      },
      b(tl.c("chat.disabled.options").a(n.m)) {
         @Override
         public boolean a(boolean $$0) {
            return false;
         }
      },
      c(tl.c("chat.disabled.launcher").a(n.m)) {
         @Override
         public boolean a(boolean $$0) {
            return $$0;
         }
      },
      d(tl.a("chat.disabled.profile", tl.d(eqp.E.m.K.h())).a(n.m)) {
         @Override
         public boolean a(boolean $$0) {
            return $$0;
         }
      };

      static final tl e = tl.c("chat.disabled.profile.moreInfo");
      private final tl f;

      a(tl $$0) {
         this.f = $$0;
      }

      public tl a() {
         return this.f;
      }

      public abstract boolean a(boolean var1);
   }

   static record b(elz a, fdr.c b) {
   }
}
