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

public class eqq extends bfn<Runnable> implements ekp {
   static eqq E;
   private static final Logger F = LogUtils.getLogger();
   public static final boolean a = ac.i() == ac.b.d;
   private static final int G = 10;
   public static final aeu b = new aeu("default");
   public static final aeu c = new aeu("uniform");
   public static final aeu d = new aeu("alt");
   private static final aeu H = new aeu("regional_compliancies.json");
   private static final CompletableFuture<ass> I = CompletableFuture.completedFuture(ass.a);
   private static final ti J = ti.c("multiplayer.socialInteractions.not_available");
   public static final String e = "Please make sure you have up-to-date drivers (see aka.ms/mcdriver for instructions).";
   private final Path K;
   private final CompletableFuture<ProfileResult> L;
   private final fza M;
   private final DataFixer N;
   private final foq O;
   private final eko P;
   private final erd Q = new erd(20.0F, 0L);
   private final fof R;
   public final fnx f;
   private final fta S;
   private final fua T;
   public final flr g;
   private final gct U = new gct();
   private final erf V;
   public final ery h;
   public final ery i;
   public final fns j;
   public final fri k;
   private final AtomicReference<ala> W = new AtomicReference<>();
   public final erz l;
   public final equ m;
   private final eqm X;
   public final eqr n;
   public final eqp o;
   private eqn Y = eqn.a;
   public final File p;
   private final String Z;
   private final String aa;
   private final Proxy ab;
   private final ecb ac;
   private final boolean ad;
   private final boolean ae;
   private final boolean af;
   private final boolean ag;
   private final anm ah;
   private final amg ai;
   private final fzs aj;
   private final ana ak;
   private final gah al;
   private final err am;
   private final erv an;
   private final ejw ao;
   private final gdl ap;
   private final gdg aq;
   private final euy ar;
   private final gab as;
   private final fnt at;
   private final eqw au = new eqw(H, eqq::b);
   private final YggdrasilAuthenticationService av;
   private final MinecraftSessionService aw;
   private final UserApiService ax;
   private final gaa ay;
   private final gbg az;
   private final fot aA;
   private final fzy aB;
   private final fzx aC;
   private final esb aD;
   private final eut aE;
   private final geo aF;
   private final fcl aG;
   private final fht aH;
   private final fpy aI;
   private final gdp aJ;
   private final fjb aK;
   private final enq aL;
   private final fnj aM;
   @Nullable
   public fiy q;
   @Nullable
   public fis r;
   @Nullable
   public fnb s;
   @Nullable
   private gcy aN;
   @Nullable
   private sj aO;
   private boolean aP;
   @Nullable
   public bil t;
   @Nullable
   public bil u;
   @Nullable
   public ehg v;
   private int aQ;
   protected int w;
   private volatile boolean aR;
   private float aS;
   private long aT = ac.c();
   private long aU;
   private int aV;
   public boolean x;
   @Nullable
   public eyf y;
   @Nullable
   private exz aW;
   private Thread aX;
   private volatile boolean aY;
   @Nullable
   private Supplier<o> aZ;
   private static int ba;
   public String z = "";
   private long bb;
   public boolean A;
   public boolean B;
   public boolean C;
   public boolean D = true;
   private boolean bc;
   private final Queue<Runnable> bd = Queues.newConcurrentLinkedQueue();
   @Nullable
   private CompletableFuture<Void> be;
   @Nullable
   private euu bf;
   private bdk bg = bdh.a;
   private int bh;
   private final bde bi = new bde(ac.b, () -> this.bh);
   @Nullable
   private bdj bj;
   private bev bk = beu.a;
   private final era bl = new era();
   private long bm;
   private double bn;
   @Nullable
   private eld.a bo;
   private final eqy bp;
   private final eqi bq;
   private final fjf br;
   private fju bs;
   private final eqf bt;
   private final egy bu;
   private boolean bv;
   private String bw = "root";

   public eqq(fdr $$0) {
      super("Client");
      E = this;
      this.p = $$0.c.a;
      File $$1 = $$0.c.c;
      this.K = $$0.c.b.toPath();
      this.Z = $$0.d.b;
      this.aa = $$0.d.c;
      Path $$2 = this.p.toPath();
      this.bu = ecb.a($$2.resolve("allowed_symlinks.txt"));
      fzq $$3 = new fzq($$0.c.a(), this.bu);
      this.aj = new fzs(new File(this.p, "server-resource-packs"));
      anc $$4 = new amw(this.K, ame.a, anb.b, this.bu);
      this.ak = new ana($$3, this.aj, $$4);
      this.ai = $$3.a();
      this.ab = $$0.a.d;
      this.av = new YggdrasilAuthenticationService(this.ab);
      this.aw = this.av.createMinecraftSessionService();
      this.V = $$0.a.a;
      this.L = CompletableFuture.supplyAsync(() -> this.aw.fetchProfile(this.V.b(), true), ac.g());
      this.ax = this.a(this.av, $$0);
      F.info("Setting user: {}", this.V.c());
      F.debug("(Session ID is {})", this.V.a());
      this.ae = $$0.d.a;
      this.af = !$$0.d.d;
      this.ag = !$$0.d.e;
      this.ad = bf();
      this.aN = null;
      um.a(eqo::a);
      this.N = asw.a();
      this.aE = new eut(this);
      this.aX = Thread.currentThread();
      this.m = new equ(this, this.p);
      RenderSystem.setShaderGlintAlpha(this.m.aj().c());
      this.aY = true;
      this.aF = new geo(this, this.m);
      this.X = new eqm(this.p, this.N);
      F.info("Backend library: {}", RenderSystem.getBackendDescription());
      ekb $$5;
      if (this.m.p > 0 && this.m.o > 0) {
         $$5 = new ekb(this.m.o, this.m.p, $$0.b.c, $$0.b.d, $$0.b.e);
      } else {
         $$5 = $$0.b;
      }

      ac.b = RenderSystem.initBackendSystem();
      this.O = new foq(this);
      this.P = this.O.a($$5, this.m.k, this.bc());
      this.a(true);
      gea.a.b(gdw.A);

      try {
         this.P.a(this.ai, aa.b().g() ? eke.a : eke.b);
      } catch (IOException var12) {
         F.error("Couldn't set icon", var12);
      }

      this.P.a(this.m.g().c());
      this.n = new eqr(this);
      this.n.a(this.P.i());
      this.o = new eqp(this);
      this.o.a(this.P.i());
      RenderSystem.initRenderer(this.m.u, false);
      this.ao = new ejt(this.P.k(), this.P.l());
      this.ao.a(0.0F, 0.0F, 0.0F, 0.0F);
      this.ao.b(a);
      this.ah = new anm(ame.a);
      this.ak.a();
      this.m.b(this.ak);
      this.al = new gah(this.m.ad);
      this.ah.a(this.al);
      this.M = new fza(this.ah);
      this.ah.a(this.M);
      this.ay = new gaa(this.M, $$1.toPath().resolve("skins"), this.aw, this);
      this.ac = new ecb($$2.resolve("saves"), $$2.resolve("backups"), this.bu, this.N);
      this.bt = new eqf($$2);
      this.ap = new gdl(this.m);
      this.ah.a(this.ap);
      this.as = new gab(this.V);
      this.ah.a(this.as);
      this.aq = new gdg(this);
      this.ar = new euy(this.M);
      this.h = this.ar.a();
      this.i = this.ar.b();
      this.ah.a(this.ar);
      this.b(this.j());
      this.ah.a(new fzu());
      this.ah.a(new fzt());
      this.P.a("Startup");
      RenderSystem.setupDefaultState(0, 0, this.P.k(), this.P.l());
      this.P.a("Post startup");
      this.am = err.a();
      this.an = erv.a(this.am);
      this.az = new gbg(this.M, this.am, this.m.z().c());
      this.ah.a(this.az);
      this.aH = new fht();
      this.ah.a(this.aH);
      this.aI = new fpy(this.h, this.aH, this::an, this::aq, this::ao);
      this.ah.a(this.aI);
      fnm $$8 = new fnm(this.aI, this.aH);
      this.ah.a($$8);
      this.T = new fua(this, this.M, this.az, this.an, $$8);
      this.ah.a(this.T);
      this.R = new fof();
      this.aG = new fcl(this, this.ax);
      this.aA = new fot(this.az.b(), $$8, this.am);
      this.ah.a(this.aA);
      this.S = new fta(this, this.M, this.T, this.aA, this.h, this.m, this.aH);
      this.ah.a(this.S);
      this.j = new fns(this, this.S.d(), this.ah, this.R);
      this.ah.a(this.j.e());
      this.f = new fnx(this, this.S, this.aI, this.R);
      this.ah.a(this.f);
      this.be();
      this.ah.a(this.U);
      this.g = new flr(this.r, this.M);
      this.ah.a(this.g);
      this.aB = new fzy(this.M);
      this.ah.a(this.aB);
      this.aC = new fzx(this.M);
      this.ah.a(this.aC);
      this.aD = new esb(this.M);
      this.ah.a(this.aD);
      this.at = new fnt();
      this.ah.a(this.at);
      this.ah.a(this.au);
      this.l = new erz(this, this.T);
      this.k = new fri(this);
      ema $$9 = ema.a(this);
      this.aL = new enq($$9);
      RenderSystem.setErrorCallback(this::a);
      if (this.ao.c != this.P.k() || this.ao.d != this.P.l()) {
         StringBuilder $$10 = new StringBuilder(
            "Recovering from unsupported resolution ("
               + this.P.k()
               + "x"
               + this.P.l()
               + ").\nPlease make sure you have up-to-date drivers (see aka.ms/mcdriver for instructions)."
         );
         if (ekc.b()) {
            $$10.append("\n\nReported GL debug messages:\n").append(String.join("\n", ekc.a()));
         }

         this.P.a(this.ao.c, this.ao.d);
         TinyFileDialogs.tinyfd_messageBox("Minecraft", $$10.toString(), "ok", "error", false);
      } else if (this.m.W().c() && !this.P.j()) {
         this.P.h();
         this.m.W().a(this.P.j());
      }

      this.P.a(this.m.K().c());
      this.P.b(this.m.D().c());
      this.P.c();
      this.a();
      this.j.a(this.ai.c());
      this.aJ = new gdp(this, this.ax, this.V);
      this.aK = fjb.a(this.ax, this.V, $$2);
      this.bp = new eqy(this);
      this.bq = new eqi(this);
      this.bq.a(this.m.ao().c() != eqs.a);
      this.br = new fjf(this);
      this.br.a(this.m.x().c());
      this.bs = fju.a(fjr.a(), this.ax);
      exr.a(this);
      List<amd> $$11 = this.ak.g();
      this.bl.a(era.b.a, $$11);
      anl $$12 = this.ah.a(ac.f(), this, I, $$11);
      gea.a.a(gdw.C);
      eqq.b $$13 = new eqq.b($$9, $$0.e);
      this.a(new exr(this, $$12, $$1x -> ac.a($$1x, $$1xx -> this.a($$1xx, $$13), () -> {
            if (aa.aS) {
               this.bg();
            }

            this.bl.a();
            this.a($$13);
         }), false));
      this.aM = fnj.a($$0.e.b());
   }

   private void a(@Nullable eqq.b $$0) {
      if (!this.bv) {
         this.bv = true;
         this.b($$0);
      }
   }

   private void b(@Nullable eqq.b $$0) {
      Runnable $$1 = this.c($$0);
      gea.a.b(gdw.C);
      gea.a.b(gdw.z);
      gea.a.a(this.aJ.a());
      $$1.run();
   }

   public boolean c() {
      return this.bv;
   }

   private Runnable c(@Nullable eqq.b $$0) {
      List<Function<Runnable, eyf>> $$1 = new ArrayList<>();
      this.a($$1);
      Runnable $$2 = () -> {
         if ($$0 != null && $$0.b().a()) {
            fni.a(this, $$0.b(), $$0.a());
         } else {
            this.a(new eyk(true));
         }
      };

      for (Function<Runnable, eyf> $$3 : Lists.reverse($$1)) {
         eyf $$4 = $$3.apply($$2);
         $$2 = () -> this.a($$4);
      }

      return $$2;
   }

   private void a(List<Function<Runnable, eyf>> $$0) {
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

      ProfileResult $$2 = this.L.join();
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
      this.P.b(this.bc());
   }

   private String bc() {
      StringBuilder $$0 = new StringBuilder("Minecraft");
      if (e().a()) {
         $$0.append("*");
      }

      $$0.append(" ");
      $$0.append(aa.b().c());
      fit $$1 = this.J();
      if ($$1 != null && $$1.l().k()) {
         $$0.append(" - ");
         fjc $$2 = this.Q();
         if (this.aN != null && !this.aN.p()) {
            $$0.append(gaf.a("title.singleplayer"));
         } else if ($$2 != null && $$2.e()) {
            $$0.append(gaf.a("title.multiplayer.realms"));
         } else if (this.aN == null && ($$2 == null || !$$2.d())) {
            $$0.append(gaf.a("title.multiplayer.other"));
         } else {
            $$0.append(gaf.a("title.multiplayer.lan"));
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

   public static arr e() {
      return arr.a("vanilla", ClientBrandRetriever::getClientModName, "Client", eqq.class);
   }

   private void a(Throwable $$0, @Nullable eqq.b $$1) {
      if (this.ak.d().size() > 1) {
         this.a($$0, null, $$1);
      } else {
         ac.a($$0);
      }
   }

   public void a(Throwable $$0, @Nullable ti $$1, @Nullable eqq.b $$2) {
      F.info("Caught error loading resourcepacks, removing all selected resourcepacks", $$0);
      this.bl.a($$0);
      this.ak.a(Collections.emptyList());
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

      this.a(new eyk());
      this.a(null);
   }

   private void a(@Nullable ti $$0) {
      eut $$1 = this.ay();
      eur.b($$1, eur.a.d, ti.c("resourcePack.load_fail"), $$0);
   }

   public void f() {
      this.aX = Thread.currentThread();
      if (Runtime.getRuntime().availableProcessors() > 4) {
         this.aX.setPriority(10);
      }

      try {
         boolean $$0 = false;

         while (this.aY) {
            if (this.aZ != null) {
               c(this.aZ.get());
               return;
            }

            try {
               bdn $$1 = bdn.a("Renderer");
               boolean $$2 = this.aN().e();
               this.bg = this.a($$2, $$1);
               this.bg.a();
               this.bk.c();
               this.d(!$$0);
               this.bk.d();
               this.bg.b();
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
      this.ar.a($$0 ? ImmutableMap.of(b, c) : ImmutableMap.of());
   }

   private void be() {
      this.U
         .a(
            gct.a,
            $$0 -> new gcm<>(
                  $$0x -> $$0x.a(null, ckr.a.a.c()).stream().map($$0xx -> n.a($$0xx.getString()).trim()).filter($$0xx -> !$$0xx.isEmpty()),
                  $$0x -> Stream.of(jd.i.b($$0x.d())),
                  $$0
               )
         );
      this.U.a(gct.b, $$0 -> new gcn<>($$0x -> $$0x.f().map(aqd::b), $$0));
      this.U
         .a(
            gct.c,
            $$0 -> new gcm<>(
                  $$0x -> $$0x.e()
                        .stream()
                        .flatMap($$1 -> $$1.b().a($$0x.a()).a(null, ckr.a.a).stream())
                        .map($$0xx -> n.a($$0xx.getString()).trim())
                        .filter($$0xx -> !$$0xx.isEmpty()),
                  $$0x -> $$0x.e().stream().map($$1 -> jd.i.b($$1.b().a($$0x.a()).d())),
                  $$0
               )
         );
      chh.e().a($$0 -> {
         this.a(gct.a, $$0);
         this.a(gct.b, $$0);
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

   public ejw g() {
      return this.ao;
   }

   public String h() {
      return this.Z;
   }

   public String i() {
      return this.aa;
   }

   public void a(o $$0) {
      this.aZ = () -> this.d($$0);
   }

   public void b(o $$0) {
      this.aZ = () -> $$0;
   }

   public static void c(o $$0) {
      File $$1 = new File(O().p, "crash-reports");
      File $$2 = new File($$1, "crash-" + ac.e() + "-client.txt");
      aew.a($$0.e());
      if ($$0.f() != null) {
         aew.a("#@!@# Game crashed! Crash report saved to: #@!@# " + $$0.f());
         System.exit(-1);
      } else if ($$0.a($$2)) {
         aew.a("#@!@# Game crashed! Crash report saved to: #@!@# " + $$2.getAbsolutePath());
         System.exit(-1);
      } else {
         aew.a("#@?@# Game crashed! Crash report could not be saved. #@?@#");
         System.exit(-2);
      }
   }

   public boolean j() {
      return this.m.M().c();
   }

   public CompletableFuture<Void> k() {
      return this.a(false, null);
   }

   private CompletableFuture<Void> a(boolean $$0, @Nullable eqq.b $$1) {
      if (this.be != null) {
         return this.be;
      } else {
         CompletableFuture<Void> $$2 = new CompletableFuture<>();
         if (!$$0 && this.aW instanceof exr) {
            this.be = $$2;
            return $$2;
         } else {
            this.ak.a();
            List<amd> $$3 = this.ak.g();
            if (!$$0) {
               this.bl.a(era.b.b, $$3);
            }

            this.a(new exr(this, this.ah.a(ac.f(), this, I, $$3), $$3x -> ac.a($$3x, $$2xx -> {
                  if ($$0) {
                     this.bd();
                  } else {
                     this.a($$2xx, $$1);
                  }
               }, () -> {
                  this.f.f();
                  this.bl.a();
                  $$2.complete(null);
                  this.a($$1);
               }), true));
            return $$2;
         }
      }
   }

   private void bg() {
      boolean $$0 = false;
      fos $$1 = this.an().a();
      gba $$2 = $$1.a().a();

      for (csq $$3 : jd.f) {
         UnmodifiableIterator $$10 = $$3.l().a().iterator();

         while ($$10.hasNext()) {
            dfe $$4 = (dfe)$$10.next();
            if ($$4.l() == cyv.c) {
               gba $$5 = $$1.b($$4);
               if ($$5 == $$2) {
                  F.debug("Missing model for: {}", $$4);
                  $$0 = true;
               }
            }
         }
      }

      fyz $$6 = $$2.e();

      for (csq $$7 : jd.f) {
         UnmodifiableIterator var17 = $$7.l().a().iterator();

         while (var17.hasNext()) {
            dfe $$8 = (dfe)var17.next();
            fyz $$9 = $$1.a($$8);
            if (!$$8.i() && $$9 == $$6) {
               F.debug("Missing particle icon for: {}", $$8);
            }
         }
      }

      for (civ $$10 : jd.i) {
         cja $$11 = $$10.ad_();
         String $$12 = $$11.q();
         String $$13 = ti.c($$12).getString();
         if ($$13.toLowerCase(Locale.ROOT).equals($$10.a())) {
            F.debug("Missing translation for: {} {} {}", new Object[]{$$11, $$12, $$10});
         }
      }

      $$0 |= exs.a();
      $$0 |= ftd.a();
      if ($$0) {
         throw new IllegalStateException("Your game data is foobar, fix the errors above!");
      }
   }

   public ecb l() {
      return this.ac;
   }

   private void a(String $$0) {
      eqq.a $$1 = this.H();
      if (!$$1.a(this.R())) {
         if (this.l.b()) {
            this.l.b(false);
            this.a(new ewx($$0x -> {
               if ($$0x) {
                  ac.i().a("https://aka.ms/JavaAccountSettings");
               }

               this.a(null);
            }, eqq.a.e, "https://aka.ms/JavaAccountSettings", true));
         } else {
            ti $$2 = $$1.a();
            this.l.a($$2, false);
            this.bq.c($$2);
            this.l.b($$1 == eqq.a.d);
         }
      } else {
         this.a(new eww($$0));
      }
   }

   public void a(@Nullable eyf $$0) {
      if (aa.aS && Thread.currentThread() != this.aX) {
         F.error("setScreen called from non-game thread");
      }

      if (this.y != null) {
         this.y.av_();
      }

      if ($$0 == null && this.r == null) {
         $$0 = new eyk();
      } else if ($$0 == null && this.s.eu()) {
         if (this.s.o()) {
            $$0 = new exe(null, this.r.k().n());
         } else {
            this.s.fO();
         }
      }

      this.y = $$0;
      if (this.y != null) {
         this.y.aw_();
      }

      elg.a();
      if ($$0 != null) {
         this.n.j();
         eqo.b();
         $$0.b(this, this.P.o(), this.P.p());
         this.x = false;
      } else {
         this.ap.g();
         this.n.i();
      }

      this.d();
   }

   public void a(@Nullable exz $$0) {
      this.aW = $$0;
   }

   public void m() {
      try {
         F.info("Stopping!");

         try {
            this.bq.c();
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
            this.y.av_();
         }

         this.close();
      } finally {
         ac.b = System::nanoTime;
         if (this.aZ == null) {
            System.exit(0);
         }
      }
   }

   @Override
   public void close() {
      if (this.bo != null) {
         this.bo.a();
      }

      try {
         this.aJ.close();
         this.au.close();
         this.az.close();
         this.ar.close();
         this.j.close();
         this.f.close();
         this.ap.f();
         this.g.a();
         this.aC.close();
         this.aB.close();
         this.aD.close();
         this.M.close();
         this.ah.close();
         ac.h();
      } catch (Throwable var5) {
         F.error("Shutdown failure!", var5);
         throw var5;
      } finally {
         this.O.close();
         this.P.close();
      }
   }

   private void d(boolean $$0) {
      this.P.a("Pre render");
      long $$1 = ac.c();
      if (this.P.b()) {
         this.q();
      }

      if (this.be != null && !(this.aW instanceof exr)) {
         CompletableFuture<Void> $$2 = this.be;
         this.be = null;
         this.k().thenRun(() -> $$2.complete(null));
      }

      Runnable $$3;
      while (($$3 = this.bd.poll()) != null) {
         $$3.run();
      }

      if ($$0) {
         int $$4 = this.Q.a(ac.b());
         this.bg.a("scheduledExecutables");
         this.bp();
         this.bg.c();
         this.bg.a("tick");

         for (int $$5 = 0; $$5 < Math.min(10, $$4); $$5++) {
            this.bg.d("clientTick");
            this.t();
         }

         this.bg.c();
      }

      this.n.a();
      this.P.a("Render");
      this.bg.a("sound");
      this.ap.a(this.j.m());
      this.bg.c();
      this.bg.a("render");
      long $$6 = ac.c();
      boolean $$8;
      if (!this.aN().d() && !this.bk.e()) {
         $$8 = false;
         this.bn = 0.0;
      } else {
         $$8 = this.bo == null || this.bo.b();
         if ($$8) {
            eld.a().ifPresent(eld::b);
         }
      }

      RenderSystem.clear(16640, a);
      this.ao.a(true);
      fnr.a();
      this.bg.a("display");
      RenderSystem.enableCull();
      this.bg.c();
      if (!this.x) {
         this.bg.b("gameRenderer");
         this.j.a(this.aR ? this.aS : this.Q.a, $$1, $$0);
         this.bg.c();
      }

      if (this.bj != null) {
         this.bg.a("fpsPie");
         esa $$9 = new esa(this, this.R.b());
         this.a($$9, this.bj);
         $$9.e();
         this.bg.c();
      }

      this.bg.a("blit");
      this.ao.e();
      this.ao.a(this.P.k(), this.P.l());
      this.bb = ac.c() - $$6;
      if ($$8) {
         eld.a().ifPresent($$0x -> this.bo = $$0x.c());
      }

      this.bg.b("updateDisplay");
      this.P.e();
      int $$10 = this.bh();
      if ($$10 < 260) {
         RenderSystem.limitDisplayFPS($$10);
      }

      this.bg.b("yield");
      Thread.yield();
      this.bg.c();
      this.P.a("Post render");
      this.aV++;
      boolean $$11 = this.S() && (this.y != null && this.y.j() || this.aW != null && this.aW.a()) && !this.aN.p();
      if (this.aR != $$11) {
         if (this.aR) {
            this.aS = this.Q.a;
         } else {
            this.Q.a = this.aS;
         }

         this.aR = $$11;
      }

      long $$12 = ac.c();
      long $$13 = $$12 - this.aT;
      if ($$8) {
         this.bm = $$13;
      }

      this.aN().a($$13);
      this.aT = $$12;
      this.bg.a("fpsUpdate");
      if (this.bo != null && this.bo.b()) {
         this.bn = (double)this.bo.c() * 100.0 / (double)this.bm;
      }

      while (ac.b() >= this.aU + 1000L) {
         String $$14;
         if (this.bn > 0.0) {
            $$14 = " GPU: " + (this.bn > 100.0 ? n.m + "100%" : Math.round(this.bn) + "%");
         } else {
            $$14 = "";
         }

         ba = this.aV;
         this.z = String.format(
            Locale.ROOT,
            "%d fps T: %s%s%s%s B: %d%s",
            ba,
            $$10 == 260 ? "inf" : $$10,
            this.m.K().c() ? " vsync" : "",
            this.m.i().c(),
            this.m.h().c() == eqe.a ? "" : (this.m.h().c() == eqe.b ? " fast-clouds" : " fancy-clouds"),
            this.m.B().c(),
            $$14
         );
         this.aU += 1000L;
         this.aV = 0;
      }

      this.bg.c();
   }

   private bdk a(boolean $$0, @Nullable bdn $$1) {
      if (!$$0) {
         this.bi.b();
         if (!this.bk.e() && $$1 == null) {
            return bdh.a;
         }
      }

      bdk $$2;
      if ($$0) {
         if (!this.bi.a()) {
            this.bh = 0;
            this.bi.c();
         }

         this.bh++;
         $$2 = this.bi.d();
      } else {
         $$2 = bdh.a;
      }

      if (this.bk.e()) {
         $$2 = bdk.a($$2, this.bk.f());
      }

      return bdn.a($$2, $$1);
   }

   private void b(boolean $$0, @Nullable bdn $$1) {
      if ($$1 != null) {
         $$1.b();
      }

      if ($$0) {
         this.bj = this.bi.e();
      } else {
         this.bj = null;
      }

      this.bg = this.bi.d();
   }

   @Override
   public void a() {
      int $$0 = this.P.a(this.m.am().c(), this.j());
      this.P.a((double)$$0);
      if (this.y != null) {
         this.y.a(this, this.P.o(), this.P.p());
      }

      ejw $$1 = this.g();
      $$1.a(this.P.k(), this.P.l(), a);
      this.j.a(this.P.k(), this.P.l());
      this.n.g();
   }

   @Override
   public void b() {
      this.n.k();
   }

   public int n() {
      return ba;
   }

   public long o() {
      return this.bb;
   }

   private int bh() {
      return this.r != null || this.y == null && this.aW == null ? this.P.d() : 60;
   }

   public void p() {
      try {
         arq.b();
         this.f.p();
      } catch (Throwable var3) {
      }

      try {
         System.gc();
         if (this.aP && this.aN != null) {
            this.aN.a(true);
         }

         this.b((eyf)(new exl(ti.c("menu.savingLevel"))));
      } catch (Throwable var2) {
      }

      System.gc();
   }

   public boolean a(Consumer<ti> $$0) {
      if (this.bk.e()) {
         this.bi();
         return false;
      } else {
         Consumer<bdj> $$1 = $$1x -> {
            if ($$1x != bdf.a) {
               int $$2x = $$1x.f();
               double $$3x = (double)$$1x.g() / (double)asp.a;
               this.execute(
                  () -> $$0.accept(
                        ti.a("commands.debug.stopped", String.format(Locale.ROOT, "%.2f", $$3x), $$2x, String.format(Locale.ROOT, "%.2f", (double)$$2x / $$3x))
                     )
               );
            }
         };
         Consumer<Path> $$2 = $$1x -> {
            ti $$2x = ti.b($$1x.toString()).a(n.t).a($$1xx -> $$1xx.a(new tg(tg.a.b, $$1x.toFile().getParent())));
            this.execute(() -> $$0.accept(ti.a("debug.profiling.stop", $$2x)));
         };
         ab $$3 = a(new ab(), this, this.al, this.Z, this.m);
         Consumer<List<Path>> $$4 = $$2x -> {
            Path $$3x = this.a($$3, $$2x);
            $$2.accept($$3x);
         };
         Consumer<Path> $$5;
         if (this.aN == null) {
            $$5 = $$1x -> $$4.accept(ImmutableList.of($$1x));
         } else {
            this.aN.b($$3);
            CompletableFuture<Path> $$6 = new CompletableFuture<>();
            CompletableFuture<Path> $$7 = new CompletableFuture<>();
            CompletableFuture.allOf($$6, $$7).thenRunAsync(() -> $$4.accept(ImmutableList.of($$6.join(), $$7.join())), ac.g());
            this.aN.a($$0x -> {
            }, $$7::complete);
            $$5 = $$6::complete;
         }

         this.bk = bet.a(new fng(ac.b, this.f), ac.b, ac.g(), new bez("client"), $$1x -> {
            this.bk = beu.a;
            $$1.accept($$1x);
         }, $$5);
         return true;
      }
   }

   private void bi() {
      this.bk.a();
      if (this.aN != null) {
         this.aN.aP();
      }
   }

   private void bj() {
      this.bk.b();
      if (this.aN != null) {
         this.aN.aQ();
      }
   }

   private Path a(ab $$0, List<Path> $$1) {
      String $$2;
      if (this.R()) {
         $$2 = this.T().aT().g();
      } else {
         fjc $$3 = this.Q();
         $$2 = $$3 != null ? $$3.a : "unknown";
      }

      Path $$7;
      try {
         String $$5 = String.format(Locale.ROOT, "%s-%s-%s", ac.e(), $$2, aa.b().b());
         String $$6 = v.a(bez.a, $$5, ".zip");
         $$7 = bez.a.resolve($$6);
      } catch (IOException var21) {
         throw new UncheckedIOException(var21);
      }

      try (are $$10 = new are($$7)) {
         $$10.a(Paths.get("system.txt"), $$0.a());
         $$10.a(Paths.get("client").resolve(this.m.aw().getName()), this.m.ax());
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
      if (this.bj != null) {
         List<bdm> $$1 = this.bj.a(this.bw);
         if (!$$1.isEmpty()) {
            bdm $$2 = $$1.remove(0);
            if ($$0 == 0) {
               if (!$$2.d.isEmpty()) {
                  int $$3 = this.bw.lastIndexOf(30);
                  if ($$3 >= 0) {
                     this.bw = this.bw.substring(0, $$3);
                  }
               }
            } else {
               $$0--;
               if ($$0 < $$1.size() && !"unspecified".equals($$1.get($$0).d)) {
                  if (!this.bw.isEmpty()) {
                     this.bw = this.bw + "\u001e";
                  }

                  this.bw = this.bw + $$1.get($$0).d;
               }
            }
         }
      }
   }

   private void a(esa $$0, bdj $$1) {
      List<bdm> $$2 = $$1.a(this.bw);
      bdm $$3 = $$2.remove(0);
      RenderSystem.clear(256, a);
      RenderSystem.setShader(fns::q);
      Matrix4f $$4 = new Matrix4f().setOrtho(0.0F, (float)this.P.k(), (float)this.P.l(), 0.0F, 1000.0F, 3000.0F);
      RenderSystem.setProjectionMatrix($$4, els.b);
      elk $$5 = RenderSystem.getModelViewStack();
      $$5.a();
      $$5.e();
      $$5.a(0.0F, 0.0F, -2000.0F);
      RenderSystem.applyModelViewMatrix();
      RenderSystem.lineWidth(1.0F);
      elm $$6 = elm.a();
      elf $$7 = $$6.c();
      int $$8 = 160;
      int $$9 = this.P.k() - 160 - 10;
      int $$10 = this.P.l() - 320;
      RenderSystem.enableBlend();
      $$7.a(elp.b.h, eli.n);
      $$7.a((double)((float)$$9 - 176.0F), (double)((float)$$10 - 96.0F - 16.0F), 0.0).a(200, 0, 0, 0).e();
      $$7.a((double)((float)$$9 - 176.0F), (double)($$10 + 320), 0.0).a(200, 0, 0, 0).e();
      $$7.a((double)((float)$$9 + 176.0F), (double)($$10 + 320), 0.0).a(200, 0, 0, 0).e();
      $$7.a((double)((float)$$9 + 176.0F), (double)((float)$$10 - 96.0F - 16.0F), 0.0).a(200, 0, 0, 0).e();
      $$6.b();
      RenderSystem.disableBlend();
      double $$11 = 0.0;

      for (bdm $$12 : $$2) {
         int $$13 = ars.a($$12.a / 4.0) + 1;
         $$7.a(elp.b.g, eli.n);
         int $$14 = $$12.a();
         int $$15 = $$14 >> 16 & 0xFF;
         int $$16 = $$14 >> 8 & 0xFF;
         int $$17 = $$14 & 0xFF;
         $$7.a((double)$$9, (double)$$10, 0.0).a($$15, $$16, $$17, 255).e();

         for (int $$18 = $$13; $$18 >= 0; $$18--) {
            float $$19 = (float)(($$11 + $$12.a * (double)$$18 / (double)$$13) * (float) (Math.PI * 2) / 100.0);
            float $$20 = ars.a($$19) * 160.0F;
            float $$21 = ars.b($$19) * 160.0F * 0.5F;
            $$7.a((double)((float)$$9 + $$20), (double)((float)$$10 - $$21), 0.0).a($$15, $$16, $$17, 255).e();
         }

         $$6.b();
         $$7.a(elp.b.f, eli.n);

         for (int $$22 = $$13; $$22 >= 0; $$22--) {
            float $$23 = (float)(($$11 + $$12.a * (double)$$22 / (double)$$13) * (float) (Math.PI * 2) / 100.0);
            float $$24 = ars.a($$23) * 160.0F;
            float $$25 = ars.b($$23) * 160.0F * 0.5F;
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
      String $$27 = bdj.b($$3.d);
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
         bdm $$31 = $$2.get($$30);
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
      this.aY = false;
   }

   public boolean r() {
      return this.aY;
   }

   public void c(boolean $$0) {
      if (this.y == null) {
         boolean $$1 = this.S() && !this.aN.p();
         if ($$1) {
            this.a(new eya(!$$0));
            this.ap.d();
         } else {
            this.a(new eya(true));
         }
      }
   }

   private void e(boolean $$0) {
      if (!$$0) {
         this.w = 0;
      }

      if (this.w <= 0 && !this.s.fl()) {
         if ($$0 && this.v != null && this.v.c() == ehg.a.b) {
            ehe $$1 = (ehe)this.v;
            gw $$2 = $$1.a();
            if (!this.r.a_($$2).i()) {
               hc $$3 = $$1.b();
               if (this.q.b($$2, $$3)) {
                  this.g.a($$2, $$3);
                  this.s.a(bgs.a);
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
      } else if (this.s.x()) {
         return false;
      } else {
         cja $$0 = this.s.b(bgs.a);
         if (!$$0.a(this.r.G())) {
            return false;
         } else {
            boolean $$1 = false;
            switch (this.v.c()) {
               case c:
                  this.q.a(this.s, ((ehf)this.v).a());
                  break;
               case b:
                  ehe $$2 = (ehe)this.v;
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

                  this.s.gk();
            }

            this.s.a(bgs.a);
            return $$1;
         }
      }
   }

   private void bt() {
      if (!this.q.m()) {
         this.aQ = 4;
         if (!this.s.x()) {
            if (this.v == null) {
               F.warn("Null returned as 'hitResult', this shouldn't happen!");
            }

            for (bgs $$0 : bgs.values()) {
               cja $$1 = this.s.b($$0);
               if (!$$1.a(this.r.G())) {
                  return;
               }

               if (this.v != null) {
                  switch (this.v.c()) {
                     case c:
                        ehf $$2 = (ehf)this.v;
                        bil $$3 = $$2.a();
                        if (!this.r.w_().a($$3.dk())) {
                           return;
                        }

                        bgt $$4 = this.q.a(this.s, $$3, $$2, $$0);
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
                        ehe $$5 = (ehe)this.v;
                        int $$6 = $$1.L();
                        bgt $$7 = this.q.a(this.s, $$0, $$5);
                        if ($$7.a()) {
                           if ($$7.b()) {
                              this.s.a($$0);
                              if (!$$1.b() && ($$1.L() != $$6 || this.q.g())) {
                                 this.j.b.a($$0);
                              }
                           }

                           return;
                        }

                        if ($$7 == bgt.e) {
                           return;
                        }
                  }
               }

               if (!$$1.b()) {
                  bgt $$8 = this.q.a(this.s, $$0);
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

   public gdg s() {
      return this.aq;
   }

   public void t() {
      if (this.aQ > 0) {
         this.aQ--;
      }

      this.bg.a("gui");
      this.br.a();
      this.l.a(this.aR);
      this.bg.c();
      this.j.a(1.0F);
      this.aF.a(this.r, this.v);
      this.bg.a("gameMode");
      if (!this.aR && this.r != null) {
         this.q.d();
      }

      this.bg.b("textures");
      this.M.e();
      if (this.y != null || this.s == null) {
         if (this.y instanceof exn $$0 && !this.s.fB()) {
            $$0.k();
         }
      } else if (this.s.eu() && !(this.y instanceof exe)) {
         this.a(null);
      } else if (this.s.fB() && this.r != null) {
         this.a(new exn());
      }

      if (this.y != null) {
         this.w = 10000;
      }

      if (this.y != null) {
         eyf.a(() -> this.y.c(), "Ticking screen", this.y.getClass().getCanonicalName());
      }

      if (!this.aN().d()) {
         this.l.l();
      }

      if (this.aW == null && this.y == null) {
         this.bg.b("Keybindings");
         this.bv();
         if (this.w > 0) {
            this.w--;
         }
      }

      if (this.r != null) {
         this.bg.b("gameRenderer");
         if (!this.aR) {
            this.j.f();
         }

         this.bg.b("levelRenderer");
         if (!this.aR) {
            this.f.o();
         }

         this.bg.b("level");
         if (!this.aR) {
            this.r.f();
         }
      } else if (this.j.g() != null) {
         this.j.b();
      }

      if (!this.aR) {
         this.aq.a();
      }

      this.ap.a(this.aR);
      if (this.r != null) {
         if (!this.aR) {
            if (!this.m.s && this.bu()) {
               ti $$1 = ti.c("tutorial.socialInteractions.title");
               ti $$2 = ti.a("tutorial.socialInteractions.description", geo.a("socialInteractions"));
               this.bf = new euu(euu.a.f, $$1, $$2, true);
               this.aF.a(this.bf, 160);
               this.m.s = true;
               this.m.ar();
            }

            this.aF.d();

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

         this.bg.b("animateTick");
         if (!this.aR && this.r != null) {
            this.r.b(this.s.do(), this.s.dq(), this.s.du());
         }

         this.bg.b("particles");
         if (!this.aR) {
            this.g.b();
         }
      } else if (this.aO != null) {
         this.bg.b("pendingConnection");
         this.aO.d();
      }

      this.bg.b("keyboard");
      this.o.b();
      this.bg.c();
   }

   private boolean bu() {
      return !this.aP || this.aN != null && this.aN.p();
   }

   private void bv() {
      while (this.m.P.g()) {
         eqc $$0 = this.m.av();
         this.m.a(this.m.av().c());
         if ($$0.a() != this.m.av().a()) {
            this.j.a(this.m.av().a() ? this.am() : null);
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
            if (this.s.G_()) {
               this.l.g().a($$1);
            } else if (!this.s.f() || this.y != null || !$$3 && !$$2) {
               this.s.fQ().l = $$1;
            } else {
               ezr.a(this, $$1, $$3, $$2);
            }
         }
      }

      while (this.m.N.g()) {
         if (!this.bu()) {
            this.s.a(J, true);
            this.bq.c(J);
         } else {
            if (this.bf != null) {
               this.aF.a(this.bf);
               this.bf = null;
            }

            this.a(new fcn());
         }
      }

      while (this.m.E.g()) {
         if (this.q.i()) {
            this.s.i();
         } else {
            this.aF.a();
            this.a(new fac(this.s));
         }
      }

      while (this.m.T.g()) {
         this.a(new eyu(this.s.cl.q()));
      }

      while (this.m.F.g()) {
         if (!this.s.G_()) {
            this.J().b(new acc(acc.a.g, gw.b, hc.a));
         }
      }

      while (this.m.G.g()) {
         if (!this.s.G_() && this.s.a(eyf.p())) {
            this.s.a(bgs.a);
         }
      }

      while (this.m.K.g()) {
         this.a("");
      }

      if (this.y == null && this.aW == null && this.m.M.g()) {
         this.a("/");
      }

      boolean $$4 = false;
      if (this.s.fl()) {
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

      if (this.m.H.e() && this.aQ == 0 && !this.s.fl()) {
         this.bt();
      }

      this.e(this.y == null && !$$4 && this.m.I.e() && this.n.h());
   }

   public gdp u() {
      return this.aJ;
   }

   public double v() {
      return this.bn;
   }

   public fjb w() {
      return this.aK;
   }

   public fdd y() {
      return new fdd(this, this.ac);
   }

   public void a(String $$0, ecb.c $$1, ana $$2, afp $$3, boolean $$4) {
      this.z();
      this.W.set(null);
      Instant $$5 = Instant.now();

      try {
         $$1.a($$3.c().a(), $$3.d());
         afm $$6 = afm.a(this.av, this.p);
         $$6.e().a(this);
         dea.a($$6, this);
         any.a(false);
         this.aN = MinecraftServer.a((Function<Thread, gcy>)($$4x -> new gcy($$4x, this, $$1, $$2, $$3, $$6, $$0xx -> {
               ala $$1xx = new ala($$0xx + 0);
               this.W.set($$1xx);
               return akz.a($$1xx, this.bd::add);
            })));
         this.aP = true;
         this.a(fjr.a());
         this.aM.a(fnj.c.a, $$0, $$3.d().g());
      } catch (Throwable var12) {
         o $$8 = o.a(var12, "Starting integrated server");
         p $$9 = $$8.a("Starting integrated server");
         $$9.a("Level ID", $$0);
         $$9.a("Level Name", () -> $$3.d().g());
         throw new y($$8);
      }

      while (this.W.get() == null) {
         Thread.yield();
      }

      exp $$10 = new exp(this.W.get());
      this.a($$10);
      this.bg.a("waitForServer");

      while (!this.aN.ae()) {
         $$10.c();
         this.d(false);

         try {
            Thread.sleep(16L);
         } catch (InterruptedException var11) {
         }

         if (this.aZ != null) {
            c(this.aZ.get());
            return;
         }
      }

      this.bg.c();
      Duration $$11 = Duration.between($$5, Instant.now());
      SocketAddress $$12 = this.aN.ad().a();
      sj $$13 = sj.a($$12);
      $$13.a($$12.toString(), 0, new fir($$13, this, null, null, $$4, $$11, $$0x -> {
      }));
      $$13.a(new adk(this.V().c(), this.V().b()));
      this.aO = $$13;
   }

   public void a(fis $$0) {
      eyd $$1 = new eyd(true);
      $$1.a(ti.c("connect.joining"));
      this.e($$1);
      this.r = $$0;
      this.b($$0);
      if (!this.aP) {
         afm $$2 = afm.a(this.av, this.p);
         $$2.e().a(this);
         dea.a($$2, this);
         any.a(false);
      }
   }

   public void z() {
      this.b((eyf)(new eyd(true)));
   }

   public void b(eyf $$0) {
      fit $$1 = this.J();
      if ($$1 != null) {
         this.bo();
         $$1.j();
      }

      this.aG.b();
      if (this.bk.e()) {
         this.bj();
      }

      gcy $$2 = this.aN;
      this.aN = null;
      this.j.i();
      this.q = null;
      this.bq.b();
      this.e($$0);
      if (this.r != null) {
         if ($$2 != null) {
            this.bg.a("waitForServer");

            while (!$$2.C()) {
               this.d(false);
            }

            this.bg.c();
         }

         this.aj.a();
         this.l.i();
         this.aP = false;
      }

      this.r = null;
      this.b(null);
      this.s = null;
      dea.c();
   }

   public void c(eyf $$0) {
      if (this.bk.e()) {
         this.bj();
      }

      this.j.i();
      this.q = null;
      this.bq.b();
      this.e($$0);
      this.l.i();
      this.aj.a();
      this.r = null;
      this.b(null);
      this.s = null;
      dea.c();
   }

   private void e(eyf $$0) {
      this.bg.a("forcedTick");
      this.ap.e();
      this.t = null;
      this.aO = null;
      this.a($$0);
      this.d(false);
      this.bg.c();
   }

   public void d(eyf $$0) {
      this.bg.a("forcedTick");
      this.a($$0);
      this.d(false);
      this.bg.c();
   }

   private void b(@Nullable fis $$0) {
      this.f.a($$0);
      this.g.a($$0);
      this.aI.a($$0);
      this.d();
   }

   public boolean A() {
      return this.B() && this.m.ae().c();
   }

   public boolean B() {
      return this.C() && this.ax.properties().flag(UserFlag.OPTIONAL_TELEMETRY_AVAILABLE);
   }

   public boolean C() {
      return this.ax.properties().flag(UserFlag.TELEMETRY_ENABLED);
   }

   public boolean D() {
      return this.af && this.ax.properties().flag(UserFlag.SERVERS_ALLOWED) && this.F() == null && !this.G();
   }

   public boolean E() {
      return this.ax.properties().flag(UserFlag.REALMS_ALLOWED) && this.F() == null;
   }

   @Nullable
   public BanDetails F() {
      return (BanDetails)this.ax.properties().bannedScopes().get("MULTIPLAYER");
   }

   public boolean G() {
      ProfileResult $$0 = this.L.getNow(null);
      return $$0 != null && $$0.actions().contains(ProfileActionType.FORCED_NAME_CHANGE);
   }

   public boolean a(UUID $$0) {
      return this.H().a(false) ? this.aG.c($$0) : (this.s == null || !$$0.equals(this.s.cv())) && !$$0.equals(ac.d);
   }

   public eqq.a H() {
      if (this.m.l().c() == cbn.c) {
         return eqq.a.b;
      } else if (!this.ag) {
         return eqq.a.c;
      } else {
         return !this.ax.properties().flag(UserFlag.CHAT_ALLOWED) ? eqq.a.d : eqq.a.a;
      }
   }

   public final boolean I() {
      return this.ae;
   }

   @Nullable
   public fit J() {
      return this.s == null ? null : this.s.cl;
   }

   public static boolean K() {
      return !E.m.Z;
   }

   public static boolean L() {
      return E.m.i().c().a() >= eqj.b.a();
   }

   public static boolean M() {
      return !E.j.a() && E.m.i().c().a() >= eqj.c.a();
   }

   public static boolean N() {
      return E.m.j().c();
   }

   private void bw() {
      if (this.v != null && this.v.c() != ehg.a.a) {
         boolean $$0 = this.s.fR().d;
         dcq $$1 = null;
         ehg.a $$2 = this.v.c();
         cja $$6;
         if ($$2 == ehg.a.b) {
            gw $$3 = ((ehe)this.v).a();
            dfe $$4 = this.r.a_($$3);
            if ($$4.i()) {
               return;
            }

            csq $$5 = $$4.b();
            $$6 = $$5.a((cow)this.r, $$3, $$4);
            if ($$6.b()) {
               return;
            }

            if ($$0 && eyf.p() && $$4.t()) {
               $$1 = this.r.c_($$3);
            }
         } else {
            if ($$2 != ehg.a.c || !$$0) {
               return;
            }

            bil $$7 = ((ehf)this.v).a();
            $$6 = $$7.dx();
            if ($$6 == null) {
               return;
            }
         }

         if ($$6.b()) {
            String $$10 = "";
            if ($$2 == ehg.a.b) {
               $$10 = jd.f.b(this.r.a_(((ehe)this.v).a()).b()).toString();
            } else if ($$2 == ehg.a.c) {
               $$10 = jd.h.b(((ehf)this.v).a().ag()).toString();
            }

            F.warn("Picking on: [{}] {} gave null item", $$2, $$10);
         } else {
            cbo $$11 = this.s.fQ();
            if ($$1 != null) {
               this.a($$6, $$1);
            }

            int $$12 = $$11.b($$6);
            if ($$0) {
               $$11.a($$6);
               this.q.a(this.s.b(bgs.a), 36 + $$11.l);
            } else if ($$12 != -1) {
               if (cbo.d($$12)) {
                  $$11.l = $$12;
               } else {
                  this.q.a($$12);
               }
            }
         }
      }
   }

   private void a(cja $$0, dcq $$1) {
      qu $$2 = $$1.m();
      cgt.a($$0, $$1.u(), $$2);
      if ($$0.d() instanceof cjo && $$2.e("SkullOwner")) {
         qu $$3 = $$2.p("SkullOwner");
         qu $$4 = $$0.w();
         $$4.a("SkullOwner", $$3);
         qu $$5 = $$4.p("BlockEntityTag");
         $$5.r("SkullOwner");
         $$5.r("x");
         $$5.r("y");
         $$5.r("z");
      } else {
         qu $$6 = new qu();
         ra $$7 = new ra();
         $$7.add(rl.a("\"(+NBT)\""));
         $$6.a("Lore", $$7);
         $$0.a("display", $$6);
      }
   }

   public o d(o $$0) {
      ab $$1 = $$0.g();
      a($$1, this, this.al, this.Z, this.m);
      if (this.r != null) {
         this.r.a($$0);
      }

      if (this.aN != null) {
         this.aN.b($$1);
      }

      this.bl.a($$0);
      return $$0;
   }

   public static void a(@Nullable eqq $$0, @Nullable gah $$1, String $$2, @Nullable equ $$3, o $$4) {
      ab $$5 = $$4.g();
      a($$5, $$0, $$1, $$2, $$3);
   }

   private static ab a(ab $$0, @Nullable eqq $$1, @Nullable gah $$2, String $$3, equ $$4) {
      $$0.a("Launched Version", () -> $$3);
      $$0.a("Backend library", RenderSystem::getBackendDescription);
      $$0.a("Backend API", RenderSystem::getApiDescription);
      $$0.a("Window size", () -> $$1 != null ? $$1.P.k() + "x" + $$1.P.l() : "<not initialized>");
      $$0.a("GL Caps", RenderSystem::getCapsString);
      $$0.a("GL debug messages", () -> ekc.b() ? String.join("\n", ekc.a()) : "<disabled>");
      $$0.a("Using VBOs", () -> "Yes");
      $$0.a("Is Modded", () -> e().b());
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

      $$0.a("CPU", ekd::b);
      return $$0;
   }

   public static eqq O() {
      return E;
   }

   public CompletableFuture<Void> P() {
      return this.a(this::k).thenCompose($$0 -> (CompletionStage<Void>)$$0);
   }

   public void a(fjr $$0) {
      if (!this.bs.a($$0)) {
         this.bs = fju.a($$0, this.ax);
      }
   }

   @Nullable
   public fjc Q() {
      return x.a(this.J(), fit::w);
   }

   public boolean R() {
      return this.aP;
   }

   public boolean S() {
      return this.aP && this.aN != null;
   }

   @Nullable
   public gcy T() {
      return this.aN;
   }

   public boolean U() {
      gcy $$0 = this.T();
      return $$0 != null && !$$0.p();
   }

   public boolean b(UUID $$0) {
      return $$0.equals(this.V().b());
   }

   public erf V() {
      return this.V;
   }

   public GameProfile W() {
      ProfileResult $$0 = this.L.join();
      return $$0 != null ? $$0.profile() : new GameProfile(this.V.b(), this.V.c());
   }

   public Proxy X() {
      return this.ab;
   }

   public fza Y() {
      return this.M;
   }

   public anp Z() {
      return this.ah;
   }

   public ana aa() {
      return this.ak;
   }

   public amg ab() {
      return this.ai;
   }

   public fzs ac() {
      return this.aj;
   }

   public Path ad() {
      return this.K;
   }

   public gah ae() {
      return this.al;
   }

   public Function<aeu, fyz> a(aeu $$0) {
      return this.az.a($$0)::a;
   }

   public boolean af() {
      return this.ad;
   }

   public boolean ag() {
      return this.aR;
   }

   public fnt ah() {
      return this.at;
   }

   public gdl ai() {
      return this.ap;
   }

   public aow aj() {
      aow $$0 = x.a(this.y, eyf::B);
      if ($$0 != null) {
         return $$0;
      } else if (this.s != null) {
         if (this.s.dK().ac() == cpq.j) {
            return this.l.j().b() ? aox.d : aox.e;
         } else {
            hg<cqo> $$1 = this.s.dK().s(this.s.dk());
            if (!this.aq.c(aox.f) && (!this.s.bc() || !$$1.a(apn.Y))) {
               return this.s.dK().ac() != cpq.i && this.s.fR().d && this.s.fR().c ? aox.b : $$1.a().o().orElse(aox.g);
            } else {
               return aox.f;
            }
         }
      } else {
         return aox.a;
      }
   }

   public MinecraftSessionService ak() {
      return this.aw;
   }

   public gaa al() {
      return this.ay;
   }

   @Nullable
   public bil am() {
      return this.t;
   }

   public void a(bil $$0) {
      this.t = $$0;
      this.j.a($$0);
   }

   public boolean b(bil $$0) {
      return $$0.cc() || this.s != null && this.s.G_() && this.m.S.e() && $$0.ag() == bip.bt;
   }

   @Override
   protected Thread au() {
      return this.aX;
   }

   @Override
   protected Runnable f(Runnable $$0) {
      return $$0;
   }

   @Override
   protected boolean e(Runnable $$0) {
      return true;
   }

   public fot an() {
      return this.aA;
   }

   public fta ao() {
      return this.S;
   }

   public fpy ap() {
      return this.aI;
   }

   public fua aq() {
      return this.T;
   }

   public <T> gcu<T> a(gct.a<T> $$0) {
      return this.U.a($$0);
   }

   public <T> void a(gct.a<T> $$0, List<T> $$1) {
      this.U.a($$0, $$1);
   }

   public DataFixer ar() {
      return this.N;
   }

   public float as() {
      return this.Q.a;
   }

   public float av() {
      return this.Q.b;
   }

   public err aw() {
      return this.am;
   }

   public boolean ax() {
      return this.s != null && this.s.gg() || this.m.R().c();
   }

   public eut ay() {
      return this.aE;
   }

   public geo az() {
      return this.aF;
   }

   public boolean aA() {
      return this.bc;
   }

   public eqm aB() {
      return this.X;
   }

   public gbg aC() {
      return this.az;
   }

   public fzy aD() {
      return this.aB;
   }

   public fzx aE() {
      return this.aC;
   }

   public esb aF() {
      return this.aD;
   }

   @Override
   public void a(boolean $$0) {
      this.bc = $$0;
   }

   public ti a(File $$0, int $$1, int $$2) {
      int $$3 = this.P.k();
      int $$4 = this.P.l();
      ejw $$5 = new ejx($$1, $$2, true, a);
      float $$6 = this.s.dC();
      float $$7 = this.s.dA();
      float $$8 = this.s.O;
      float $$9 = this.s.N;
      this.j.b(false);

      tv var12;
      try {
         this.j.c(true);
         this.f.e();
         this.P.b($$1);
         this.P.c($$2);

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

            this.s.N = this.s.dA();
            this.s.O = this.s.dC();
            $$5.a(true);
            this.j.a(1.0F, 0L, new elk());

            try {
               Thread.sleep(10L);
            } catch (InterruptedException var17) {
            }

            erb.a($$0, "panorama_" + $$10 + ".png", $$5, $$0x -> {
            });
         }

         ti $$11 = ti.b($$0.getName()).a(n.t).a($$1x -> $$1x.a(new tg(tg.a.b, $$0.getAbsolutePath())));
         return ti.a("screenshot.success", $$11);
      } catch (Exception var18) {
         F.error("Couldn't save image", var18);
         var12 = ti.a("screenshot.failure", var18.getMessage());
      } finally {
         this.s.s($$6);
         this.s.r($$7);
         this.s.O = $$8;
         this.s.N = $$9;
         this.j.b(true);
         this.P.b($$3);
         this.P.c($$4);
         $$5.a();
         this.j.c(false);
         this.f.e();
         this.g().a(true);
      }

      return var12;
   }

   private ti a(File $$0, int $$1, int $$2, int $$3, int $$4) {
      try {
         ByteBuffer $$5 = ekd.a($$1 * $$2 * 3);
         erb $$6 = new erb($$0, $$3, $$4, $$2);
         float $$7 = (float)$$3 / (float)$$1;
         float $$8 = (float)$$4 / (float)$$2;
         float $$9 = $$7 > $$8 ? $$7 : $$8;

         for (int $$10 = ($$4 - 1) / $$2 * $$2; $$10 >= 0; $$10 -= $$2) {
            for (int $$11 = 0; $$11 < $$3; $$11 += $$1) {
               RenderSystem.setShaderTexture(0, fyy.e);
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
         ekd.a($$5);
         ti $$15 = ti.b($$14.getName()).a(n.t).a($$1x -> $$1x.a(new tg(tg.a.b, $$14.getAbsolutePath())));
         return ti.a("screenshot.success", $$15);
      } catch (Exception var15) {
         F.warn("Couldn't save screenshot", var15);
         return ti.a("screenshot.failure", var15.getMessage());
      }
   }

   public bdk aG() {
      return this.bg;
   }

   @Nullable
   public ala aH() {
      return this.W.get();
   }

   public gab aI() {
      return this.as;
   }

   @Nullable
   public exz aJ() {
      return this.aW;
   }

   public fcl aK() {
      return this.aG;
   }

   public boolean aL() {
      return false;
   }

   public eko aM() {
      return this.P;
   }

   public est aN() {
      return this.l.k();
   }

   public fof aO() {
      return this.R;
   }

   public void b(int $$0) {
      this.az.a($$0);
   }

   public fht aP() {
      return this.aH;
   }

   public boolean aQ() {
      return this.ax.properties().flag(UserFlag.PROFANITY_FILTER_ENABLED);
   }

   public void aR() {
      this.aG.a();
      this.w().a();
   }

   public eqy aS() {
      return this.bp;
   }

   @Nullable
   public asc aT() {
      return asc.a(this.av.getServicesKeySet(), ServicesKeyType.PROFILE_KEY);
   }

   public eqn aU() {
      return this.Y;
   }

   public void a(eqn $$0) {
      this.Y = $$0;
   }

   public eqi aV() {
      return this.bq;
   }

   public fjf aW() {
      return this.br;
   }

   public fju aX() {
      return this.bs;
   }

   public enq aY() {
      return this.aL;
   }

   public fnj aZ() {
      return this.aM;
   }

   public eqf ba() {
      return this.bt;
   }

   public egy bb() {
      return this.bu;
   }

   public static enum a {
      a(th.a) {
         @Override
         public boolean a(boolean $$0) {
            return true;
         }
      },
      b(ti.c("chat.disabled.options").a(n.m)) {
         @Override
         public boolean a(boolean $$0) {
            return false;
         }
      },
      c(ti.c("chat.disabled.launcher").a(n.m)) {
         @Override
         public boolean a(boolean $$0) {
            return $$0;
         }
      },
      d(ti.a("chat.disabled.profile", ti.d(eqq.E.m.K.h())).a(n.m)) {
         @Override
         public boolean a(boolean $$0) {
            return $$0;
         }
      };

      static final ti e = ti.c("chat.disabled.profile.moreInfo");
      private final ti f;

      a(ti $$0) {
         this.f = $$0;
      }

      public ti a() {
         return this.f;
      }

      public abstract boolean a(boolean var1);
   }

   static record b(ema a, fdr.c b) {
   }
}
