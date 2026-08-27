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

public class eqv extends bfs<Runnable> implements eku {
   static eqv E;
   private static final Logger F = LogUtils.getLogger();
   public static final boolean a = ac.i() == ac.b.d;
   private static final int G = 10;
   public static final aex b = new aex("default");
   public static final aex c = new aex("uniform");
   public static final aex d = new aex("alt");
   private static final aex H = new aex("regional_compliancies.json");
   private static final CompletableFuture<asx> I = CompletableFuture.completedFuture(asx.a);
   private static final tl J = tl.c("multiplayer.socialInteractions.not_available");
   public static final String e = "Please make sure you have up-to-date drivers (see aka.ms/mcdriver for instructions).";
   private final Path K;
   private final CompletableFuture<ProfileResult> L;
   private final fzf M;
   private final DataFixer N;
   private final fow O;
   private final ekt P;
   private final eri Q = new eri(20.0F, 0L);
   private final fok R;
   public final foc f;
   private final ftf S;
   private final fuf T;
   public final flw g;
   private final gcy U = new gcy();
   private final erk V;
   public final esd h;
   public final esd i;
   public final fnx j;
   public final frn k;
   private final AtomicReference<ale> W = new AtomicReference<>();
   public final ese l;
   public final eqz m;
   private final eqr X;
   public final eqw n;
   public final equ o;
   private eqs Y = eqs.a;
   public final File p;
   private final String Z;
   private final String aa;
   private final Proxy ab;
   private final ecg ac;
   private final boolean ad;
   private final boolean ae;
   private final boolean af;
   private final boolean ag;
   private final anr ah;
   private final aml ai;
   private final fzx aj;
   private final anf ak;
   private final gam al;
   private final erw am;
   private final esa an;
   private final ekb ao;
   private final gdq ap;
   private final gdl aq;
   private final evd ar;
   private final gag as;
   private final fny at;
   private final erb au = new erb(H, eqv::b);
   private final YggdrasilAuthenticationService av;
   private final MinecraftSessionService aw;
   private final UserApiService ax;
   private final gaf ay;
   private final gbl az;
   private final foy aA;
   private final gad aB;
   private final gac aC;
   private final esg aD;
   private final euy aE;
   private final get aF;
   private final fcq aG;
   private final fhy aH;
   private final fqd aI;
   private final gdu aJ;
   private final fjg aK;
   private final env aL;
   private final fno aM;
   @Nullable
   public fjd q;
   @Nullable
   public fix r;
   @Nullable
   public fng s;
   @Nullable
   private gdd aN;
   @Nullable
   private sm aO;
   private boolean aP;
   @Nullable
   public biq t;
   @Nullable
   public biq u;
   @Nullable
   public ehl v;
   private int aQ;
   protected int w;
   private volatile boolean aR;
   private float aS;
   private long aT = ac.c();
   private long aU;
   private int aV;
   public boolean x;
   @Nullable
   public eyk y;
   @Nullable
   private eye aW;
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
   private euz bf;
   private bdp bg = bdm.a;
   private int bh;
   private final bdj bi = new bdj(ac.b, () -> this.bh);
   @Nullable
   private bdo bj;
   private bfa bk = bez.a;
   private final erf bl = new erf();
   private long bm;
   private double bn;
   @Nullable
   private eli.a bo;
   private final erd bp;
   private final eqn bq;
   private final fjk br;
   private fjz bs;
   private final eqk bt;
   private final ehd bu;
   private boolean bv;
   private String bw = "root";

   public eqv(fdw $$0) {
      super("Client");
      E = this;
      this.p = $$0.c.a;
      File $$1 = $$0.c.c;
      this.K = $$0.c.b.toPath();
      this.Z = $$0.d.b;
      this.aa = $$0.d.c;
      Path $$2 = this.p.toPath();
      this.bu = ecg.a($$2.resolve("allowed_symlinks.txt"));
      fzv $$3 = new fzv($$0.c.a(), this.bu);
      this.aj = new fzx(new File(this.p, "server-resource-packs"));
      anh $$4 = new anb(this.K, amj.a, ang.b, this.bu);
      this.ak = new anf($$3, this.aj, $$4);
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
      up.a(eqt::a);
      this.N = atb.a();
      this.aE = new euy(this);
      this.aX = Thread.currentThread();
      this.m = new eqz(this, this.p);
      RenderSystem.setShaderGlintAlpha(this.m.aj().c());
      this.aY = true;
      this.aF = new get(this, this.m);
      this.X = new eqr(this.p, this.N);
      F.info("Backend library: {}", RenderSystem.getBackendDescription());
      ekg $$5;
      if (this.m.p > 0 && this.m.o > 0) {
         $$5 = new ekg(this.m.o, this.m.p, $$0.b.c, $$0.b.d, $$0.b.e);
      } else {
         $$5 = $$0.b;
      }

      ac.b = RenderSystem.initBackendSystem();
      this.O = new fow(this);
      this.P = this.O.a($$5, this.m.k, this.bc());
      this.a(true);
      gef.a.b(geb.A);

      try {
         this.P.a(this.ai, aa.b().g() ? ekj.a : ekj.b);
      } catch (IOException var12) {
         F.error("Couldn't set icon", var12);
      }

      this.P.a(this.m.g().c());
      this.n = new eqw(this);
      this.n.a(this.P.i());
      this.o = new equ(this);
      this.o.a(this.P.i());
      RenderSystem.initRenderer(this.m.u, false);
      this.ao = new ejy(this.P.k(), this.P.l());
      this.ao.a(0.0F, 0.0F, 0.0F, 0.0F);
      this.ao.b(a);
      this.ah = new anr(amj.a);
      this.ak.a();
      this.m.b(this.ak);
      this.al = new gam(this.m.ad);
      this.ah.a(this.al);
      this.M = new fzf(this.ah);
      this.ah.a(this.M);
      this.ay = new gaf(this.M, $$1.toPath().resolve("skins"), this.aw, this);
      this.ac = new ecg($$2.resolve("saves"), $$2.resolve("backups"), this.bu, this.N);
      this.bt = new eqk($$2);
      this.ap = new gdq(this.m);
      this.ah.a(this.ap);
      this.as = new gag(this.V);
      this.ah.a(this.as);
      this.aq = new gdl(this);
      this.ar = new evd(this.M);
      this.h = this.ar.a();
      this.i = this.ar.b();
      this.ah.a(this.ar);
      this.b(this.j());
      this.ah.a(new fzz());
      this.ah.a(new fzy());
      this.P.a("Startup");
      RenderSystem.setupDefaultState(0, 0, this.P.k(), this.P.l());
      this.P.a("Post startup");
      this.am = erw.a();
      this.an = esa.a(this.am);
      this.az = new gbl(this.M, this.am, this.m.z().c());
      this.ah.a(this.az);
      this.aH = new fhy();
      this.ah.a(this.aH);
      this.aI = new fqd(this.h, this.aH, this::an, this::aq, this::ao);
      this.ah.a(this.aI);
      fnr $$8 = new fnr(this.aI, this.aH);
      this.ah.a($$8);
      this.T = new fuf(this, this.M, this.az, this.an, $$8);
      this.ah.a(this.T);
      this.R = new fok();
      this.aG = new fcq(this, this.ax);
      this.aA = new foy(this.az.b(), $$8, this.am);
      this.ah.a(this.aA);
      this.S = new ftf(this, this.M, this.T, this.aA, this.h, this.m, this.aH);
      this.ah.a(this.S);
      this.j = new fnx(this, this.S.d(), this.ah, this.R);
      this.ah.a(this.j.e());
      this.f = new foc(this, this.S, this.aI, this.R);
      this.ah.a(this.f);
      this.be();
      this.ah.a(this.U);
      this.g = new flw(this.r, this.M);
      this.ah.a(this.g);
      this.aB = new gad(this.M);
      this.ah.a(this.aB);
      this.aC = new gac(this.M);
      this.ah.a(this.aC);
      this.aD = new esg(this.M);
      this.ah.a(this.aD);
      this.at = new fny();
      this.ah.a(this.at);
      this.ah.a(this.au);
      this.l = new ese(this, this.T);
      this.k = new frn(this);
      emf $$9 = emf.a(this);
      this.aL = new env($$9);
      RenderSystem.setErrorCallback(this::a);
      if (this.ao.c != this.P.k() || this.ao.d != this.P.l()) {
         StringBuilder $$10 = new StringBuilder(
            "Recovering from unsupported resolution ("
               + this.P.k()
               + "x"
               + this.P.l()
               + ").\nPlease make sure you have up-to-date drivers (see aka.ms/mcdriver for instructions)."
         );
         if (ekh.b()) {
            $$10.append("\n\nReported GL debug messages:\n").append(String.join("\n", ekh.a()));
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
      this.aJ = new gdu(this, this.ax, this.V);
      this.aK = fjg.a(this.ax, this.V, $$2);
      this.bp = new erd(this);
      this.bq = new eqn(this);
      this.bq.a(this.m.ao().c() != eqx.a);
      this.br = new fjk(this);
      this.br.a(this.m.x().c());
      this.bs = fjz.a(fjw.a(), this.ax);
      exw.a(this);
      List<ami> $$11 = this.ak.g();
      this.bl.a(erf.b.a, $$11);
      anq $$12 = this.ah.a(ac.f(), this, I, $$11);
      gef.a.a(geb.C);
      eqv.b $$13 = new eqv.b($$9, $$0.e);
      this.a(new exw(this, $$12, $$1x -> ac.a($$1x, $$1xx -> this.a($$1xx, $$13), () -> {
            if (aa.aT) {
               this.bg();
            }

            this.bl.a();
            this.a($$13);
         }), false));
      this.aM = fno.a($$0.e.b());
   }

   private void a(@Nullable eqv.b $$0) {
      if (!this.bv) {
         this.bv = true;
         this.b($$0);
      }
   }

   private void b(@Nullable eqv.b $$0) {
      Runnable $$1 = this.c($$0);
      gef.a.b(geb.C);
      gef.a.b(geb.z);
      gef.a.a(this.aJ.a());
      $$1.run();
   }

   public boolean c() {
      return this.bv;
   }

   private Runnable c(@Nullable eqv.b $$0) {
      List<Function<Runnable, eyk>> $$1 = new ArrayList<>();
      this.a($$1);
      Runnable $$2 = () -> {
         if ($$0 != null && $$0.b().a()) {
            fnn.a(this, $$0.b(), $$0.a());
         } else {
            this.a(new eyp(true));
         }
      };

      for (Function<Runnable, eyk> $$3 : Lists.reverse($$1)) {
         eyk $$4 = $$3.apply($$2);
         $$2 = () -> this.a($$4);
      }

      return $$2;
   }

   private void a(List<Function<Runnable, eyk>> $$0) {
      if (this.m.ae) {
         $$0.add($$0x -> new ewv(this.m, $$0x));
      }

      BanDetails $$1 = this.F();
      if ($$1 != null) {
         $$0.add($$1x -> ewz.a($$1xx -> {
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
            $$0.add($$1x -> ewz.a($$3.getName(), $$1x));
         }

         if ($$4.contains(ProfileActionType.USING_BANNED_SKIN)) {
            $$0.add(ewz::a);
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
      fiy $$1 = this.J();
      if ($$1 != null && $$1.l().k()) {
         $$0.append(" - ");
         fjh $$2 = this.Q();
         if (this.aN != null && !this.aN.p()) {
            $$0.append(gak.a("title.singleplayer"));
         } else if ($$2 != null && $$2.e()) {
            $$0.append(gak.a("title.multiplayer.realms"));
         } else if (this.aN == null && ($$2 == null || !$$2.d())) {
            $$0.append(gak.a("title.multiplayer.other"));
         } else {
            $$0.append(gak.a("title.multiplayer.lan"));
         }
      }

      return $$0.toString();
   }

   private UserApiService a(YggdrasilAuthenticationService $$0, fdw $$1) {
      try {
         return $$0.createUserApiService($$1.a.a.d());
      } catch (AuthenticationException var4) {
         F.error("Failed to verify authentication", var4);
         return UserApiService.OFFLINE;
      }
   }

   public static arw e() {
      return arw.a("vanilla", ClientBrandRetriever::getClientModName, "Client", eqv.class);
   }

   private void a(Throwable $$0, @Nullable eqv.b $$1) {
      if (this.ak.d().size() > 1) {
         this.a($$0, null, $$1);
      } else {
         ac.a($$0);
      }
   }

   public void a(Throwable $$0, @Nullable tl $$1, @Nullable eqv.b $$2) {
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

      this.a(new eyp());
      this.a(null);
   }

   private void a(@Nullable tl $$0) {
      euy $$1 = this.ay();
      euw.b($$1, euw.a.d, tl.c("resourcePack.load_fail"), $$0);
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
               bds $$1 = bds.a("Renderer");
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
               this.a(new eyd());
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
            gcy.a,
            $$0 -> new gcr<>(
                  $$0x -> $$0x.a(null, ckw.a.a.c()).stream().map($$0xx -> n.a($$0xx.getString()).trim()).filter($$0xx -> !$$0xx.isEmpty()),
                  $$0x -> Stream.of(jd.i.b($$0x.d())),
                  $$0
               )
         );
      this.U.a(gcy.b, $$0 -> new gcs<>($$0x -> $$0x.f().map(aqi::b), $$0));
      chm.e().a($$0 -> {
         this.a(gcy.a, $$0);
         this.a(gcy.b, $$0);
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

   public ekb g() {
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
      aez.a($$0.e());
      if ($$0.f() != null) {
         aez.a("#@!@# Game crashed! Crash report saved to: #@!@# " + $$0.f());
         System.exit(-1);
      } else if ($$0.a($$2)) {
         aez.a("#@!@# Game crashed! Crash report saved to: #@!@# " + $$2.getAbsolutePath());
         System.exit(-1);
      } else {
         aez.a("#@?@# Game crashed! Crash report could not be saved. #@?@#");
         System.exit(-2);
      }
   }

   public boolean j() {
      return this.m.M().c();
   }

   public CompletableFuture<Void> k() {
      return this.a(false, null);
   }

   private CompletableFuture<Void> a(boolean $$0, @Nullable eqv.b $$1) {
      if (this.be != null) {
         return this.be;
      } else {
         CompletableFuture<Void> $$2 = new CompletableFuture<>();
         if (!$$0 && this.aW instanceof exw) {
            this.be = $$2;
            return $$2;
         } else {
            this.ak.a();
            List<ami> $$3 = this.ak.g();
            if (!$$0) {
               this.bl.a(erf.b.b, $$3);
            }

            this.a(new exw(this, this.ah.a(ac.f(), this, I, $$3), $$3x -> ac.a($$3x, $$2xx -> {
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
      fox $$1 = this.an().a();
      gbf $$2 = $$1.a().a();

      for (csv $$3 : jd.f) {
         UnmodifiableIterator $$10 = $$3.l().a().iterator();

         while ($$10.hasNext()) {
            dfj $$4 = (dfj)$$10.next();
            if ($$4.l() == cza.c) {
               gbf $$5 = $$1.b($$4);
               if ($$5 == $$2) {
                  F.debug("Missing model for: {}", $$4);
                  $$0 = true;
               }
            }
         }
      }

      fze $$6 = $$2.e();

      for (csv $$7 : jd.f) {
         UnmodifiableIterator var17 = $$7.l().a().iterator();

         while (var17.hasNext()) {
            dfj $$8 = (dfj)var17.next();
            fze $$9 = $$1.a($$8);
            if (!$$8.i() && $$9 == $$6) {
               F.debug("Missing particle icon for: {}", $$8);
            }
         }
      }

      for (cja $$10 : jd.i) {
         cjf $$11 = $$10.ai_();
         String $$12 = $$11.q();
         String $$13 = tl.c($$12).getString();
         if ($$13.toLowerCase(Locale.ROOT).equals($$10.a())) {
            F.debug("Missing translation for: {} {} {}", new Object[]{$$11, $$12, $$10});
         }
      }

      $$0 |= exx.a();
      $$0 |= fti.a();
      if ($$0) {
         throw new IllegalStateException("Your game data is foobar, fix the errors above!");
      }
   }

   public ecg l() {
      return this.ac;
   }

   private void a(String $$0) {
      eqv.a $$1 = this.H();
      if (!$$1.a(this.R())) {
         if (this.l.b()) {
            this.l.b(false);
            this.a(new exc($$0x -> {
               if ($$0x) {
                  ac.i().a("https://aka.ms/JavaAccountSettings");
               }

               this.a(null);
            }, eqv.a.e, "https://aka.ms/JavaAccountSettings", true));
         } else {
            tl $$2 = $$1.a();
            this.l.a($$2, false);
            this.bq.c($$2);
            this.l.b($$1 == eqv.a.d);
         }
      } else {
         this.a(new exb($$0));
      }
   }

   public void a(@Nullable eyk $$0) {
      if (aa.aT && Thread.currentThread() != this.aX) {
         F.error("setScreen called from non-game thread");
      }

      if (this.y != null) {
         this.y.aA_();
      }

      if ($$0 == null && this.r == null) {
         $$0 = new eyp();
      } else if ($$0 == null && this.s.ev()) {
         if (this.s.o()) {
            $$0 = new exj(null, this.r.k().n());
         } else {
            this.s.fP();
         }
      }

      this.y = $$0;
      if (this.y != null) {
         this.y.aB_();
      }

      ell.a();
      if ($$0 != null) {
         this.n.j();
         eqt.b();
         $$0.b(this, this.P.o(), this.P.p());
         this.x = false;
      } else {
         this.ap.g();
         this.n.i();
      }

      this.d();
   }

   public void a(@Nullable eye $$0) {
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
            this.y.aA_();
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

      if (this.be != null && !(this.aW instanceof exw)) {
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
            eli.a().ifPresent(eli::b);
         }
      }

      RenderSystem.clear(16640, a);
      this.ao.a(true);
      fnw.a();
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
         esf $$9 = new esf(this, this.R.b());
         this.a($$9, this.bj);
         $$9.e();
         this.bg.c();
      }

      this.bg.a("blit");
      this.ao.e();
      this.ao.a(this.P.k(), this.P.l());
      this.bb = ac.c() - $$6;
      if ($$8) {
         eli.a().ifPresent($$0x -> this.bo = $$0x.c());
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
            this.m.h().c() == eqj.a ? "" : (this.m.h().c() == eqj.b ? " fast-clouds" : " fancy-clouds"),
            this.m.B().c(),
            $$14
         );
         this.aU += 1000L;
         this.aV = 0;
      }

      this.bg.c();
   }

   private bdp a(boolean $$0, @Nullable bds $$1) {
      if (!$$0) {
         this.bi.b();
         if (!this.bk.e() && $$1 == null) {
            return bdm.a;
         }
      }

      bdp $$2;
      if ($$0) {
         if (!this.bi.a()) {
            this.bh = 0;
            this.bi.c();
         }

         this.bh++;
         $$2 = this.bi.d();
      } else {
         $$2 = bdm.a;
      }

      if (this.bk.e()) {
         $$2 = bdp.a($$2, this.bk.f());
      }

      return bds.a($$2, $$1);
   }

   private void b(boolean $$0, @Nullable bds $$1) {
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

      ekb $$1 = this.g();
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
         arv.b();
         this.f.p();
      } catch (Throwable var3) {
      }

      try {
         System.gc();
         if (this.aP && this.aN != null) {
            this.aN.a(true);
         }

         this.b((eyk)(new exq(tl.c("menu.savingLevel"))));
      } catch (Throwable var2) {
      }

      System.gc();
   }

   public boolean a(Consumer<tl> $$0) {
      if (this.bk.e()) {
         this.bi();
         return false;
      } else {
         Consumer<bdo> $$1 = $$1x -> {
            if ($$1x != bdk.a) {
               int $$2x = $$1x.f();
               double $$3x = (double)$$1x.g() / (double)asu.a;
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

         this.bk = bey.a(new fnl(ac.b, this.f), ac.b, ac.g(), new bfe("client"), $$1x -> {
            this.bk = bez.a;
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
         fjh $$3 = this.Q();
         $$2 = $$3 != null ? $$3.a : "unknown";
      }

      Path $$7;
      try {
         String $$5 = String.format(Locale.ROOT, "%s-%s-%s", ac.e(), $$2, aa.b().b());
         String $$6 = v.a(bfe.a, $$5, ".zip");
         $$7 = bfe.a.resolve($$6);
      } catch (IOException var21) {
         throw new UncheckedIOException(var21);
      }

      try (arj $$10 = new arj($$7)) {
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
      if (this.bj != null) {
         List<bdr> $$1 = this.bj.a(this.bw);
         if (!$$1.isEmpty()) {
            bdr $$2 = $$1.remove(0);
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

   private void a(esf $$0, bdo $$1) {
      List<bdr> $$2 = $$1.a(this.bw);
      bdr $$3 = $$2.remove(0);
      RenderSystem.clear(256, a);
      RenderSystem.setShader(fnx::q);
      Matrix4f $$4 = new Matrix4f().setOrtho(0.0F, (float)this.P.k(), (float)this.P.l(), 0.0F, 1000.0F, 3000.0F);
      RenderSystem.setProjectionMatrix($$4, elx.b);
      elp $$5 = RenderSystem.getModelViewStack();
      $$5.a();
      $$5.e();
      $$5.a(0.0F, 0.0F, -2000.0F);
      RenderSystem.applyModelViewMatrix();
      RenderSystem.lineWidth(1.0F);
      elr $$6 = elr.a();
      elk $$7 = $$6.c();
      int $$8 = 160;
      int $$9 = this.P.k() - 160 - 10;
      int $$10 = this.P.l() - 320;
      RenderSystem.enableBlend();
      $$7.a(elu.b.h, eln.n);
      $$7.a((double)((float)$$9 - 176.0F), (double)((float)$$10 - 96.0F - 16.0F), 0.0).a(200, 0, 0, 0).e();
      $$7.a((double)((float)$$9 - 176.0F), (double)($$10 + 320), 0.0).a(200, 0, 0, 0).e();
      $$7.a((double)((float)$$9 + 176.0F), (double)($$10 + 320), 0.0).a(200, 0, 0, 0).e();
      $$7.a((double)((float)$$9 + 176.0F), (double)((float)$$10 - 96.0F - 16.0F), 0.0).a(200, 0, 0, 0).e();
      $$6.b();
      RenderSystem.disableBlend();
      double $$11 = 0.0;

      for (bdr $$12 : $$2) {
         int $$13 = arx.a($$12.a / 4.0) + 1;
         $$7.a(elu.b.g, eln.n);
         int $$14 = $$12.a();
         int $$15 = $$14 >> 16 & 0xFF;
         int $$16 = $$14 >> 8 & 0xFF;
         int $$17 = $$14 & 0xFF;
         $$7.a((double)$$9, (double)$$10, 0.0).a($$15, $$16, $$17, 255).e();

         for (int $$18 = $$13; $$18 >= 0; $$18--) {
            float $$19 = (float)(($$11 + $$12.a * (double)$$18 / (double)$$13) * (float) (Math.PI * 2) / 100.0);
            float $$20 = arx.a($$19) * 160.0F;
            float $$21 = arx.b($$19) * 160.0F * 0.5F;
            $$7.a((double)((float)$$9 + $$20), (double)((float)$$10 - $$21), 0.0).a($$15, $$16, $$17, 255).e();
         }

         $$6.b();
         $$7.a(elu.b.f, eln.n);

         for (int $$22 = $$13; $$22 >= 0; $$22--) {
            float $$23 = (float)(($$11 + $$12.a * (double)$$22 / (double)$$13) * (float) (Math.PI * 2) / 100.0);
            float $$24 = arx.a($$23) * 160.0F;
            float $$25 = arx.b($$23) * 160.0F * 0.5F;
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
      String $$27 = bdo.b($$3.d);
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
         bdr $$31 = $$2.get($$30);
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
            this.a(new eyf(!$$0));
            this.ap.d();
         } else {
            this.a(new eyf(true));
         }
      }
   }

   private void e(boolean $$0) {
      if (!$$0) {
         this.w = 0;
      }

      if (this.w <= 0 && !this.s.fm()) {
         if ($$0 && this.v != null && this.v.c() == ehl.a.b) {
            ehj $$1 = (ehj)this.v;
            gw $$2 = $$1.a();
            if (!this.r.a_($$2).i()) {
               hc $$3 = $$1.b();
               if (this.q.b($$2, $$3)) {
                  this.g.a($$2, $$3);
                  this.s.a(bgx.a);
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
         cjf $$0 = this.s.b(bgx.a);
         if (!$$0.a(this.r.G())) {
            return false;
         } else {
            boolean $$1 = false;
            switch (this.v.c()) {
               case c:
                  this.q.a(this.s, ((ehk)this.v).a());
                  break;
               case b:
                  ehj $$2 = (ehj)this.v;
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

                  this.s.gl();
            }

            this.s.a(bgx.a);
            return $$1;
         }
      }
   }

   private void bt() {
      if (!this.q.m()) {
         this.aQ = 4;
         if (!this.s.y()) {
            if (this.v == null) {
               F.warn("Null returned as 'hitResult', this shouldn't happen!");
            }

            for (bgx $$0 : bgx.values()) {
               cjf $$1 = this.s.b($$0);
               if (!$$1.a(this.r.G())) {
                  return;
               }

               if (this.v != null) {
                  switch (this.v.c()) {
                     case c:
                        ehk $$2 = (ehk)this.v;
                        biq $$3 = $$2.a();
                        if (!this.r.B_().a($$3.dl())) {
                           return;
                        }

                        bgy $$4 = this.q.a(this.s, $$3, $$2, $$0);
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
                        ehj $$5 = (ehj)this.v;
                        int $$6 = $$1.L();
                        bgy $$7 = this.q.a(this.s, $$0, $$5);
                        if ($$7.a()) {
                           if ($$7.b()) {
                              this.s.a($$0);
                              if (!$$1.b() && ($$1.L() != $$6 || this.q.g())) {
                                 this.j.b.a($$0);
                              }
                           }

                           return;
                        }

                        if ($$7 == bgy.e) {
                           return;
                        }
                  }
               }

               if (!$$1.b()) {
                  bgy $$8 = this.q.a(this.s, $$0);
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

   public gdl s() {
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
         if (this.y instanceof exs $$0 && !this.s.fC()) {
            $$0.k();
         }
      } else if (this.s.ev() && !(this.y instanceof exj)) {
         this.a(null);
      } else if (this.s.fC() && this.r != null) {
         this.a(new exs());
      }

      if (this.y != null) {
         this.w = 10000;
      }

      if (this.y != null) {
         eyk.a(() -> this.y.c(), "Ticking screen", this.y.getClass().getCanonicalName());
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
               tl $$1 = tl.c("tutorial.socialInteractions.title");
               tl $$2 = tl.a("tutorial.socialInteractions.description", get.a("socialInteractions"));
               this.bf = new euz(euz.a.f, $$1, $$2, true);
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
            this.r.b(this.s.dp(), this.s.dr(), this.s.dv());
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
         eqh $$0 = this.m.aw();
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
               this.s.fR().l = $$1;
            } else {
               ezw.a(this, $$1, $$3, $$2);
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

            this.a(new fcs());
         }
      }

      while (this.m.E.g()) {
         if (this.q.i()) {
            this.s.i();
         } else {
            this.aF.a();
            this.a(new fah(this.s));
         }
      }

      while (this.m.T.g()) {
         this.a(new eyz(this.s.cn.q()));
      }

      while (this.m.F.g()) {
         if (!this.s.M_()) {
            this.J().b(new acf(acf.a.g, gw.b, hc.a));
         }
      }

      while (this.m.G.g()) {
         if (!this.s.M_() && this.s.a(eyk.p())) {
            this.s.a(bgx.a);
         }
      }

      while (this.m.K.g()) {
         this.a("");
      }

      if (this.y == null && this.aW == null && this.m.M.g()) {
         this.a("/");
      }

      boolean $$4 = false;
      if (this.s.fm()) {
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

      if (this.m.H.e() && this.aQ == 0 && !this.s.fm()) {
         this.bt();
      }

      this.e(this.y == null && !$$4 && this.m.I.e() && this.n.h());
   }

   public gdu u() {
      return this.aJ;
   }

   public double v() {
      return this.bn;
   }

   public fjg w() {
      return this.aK;
   }

   public fdi y() {
      return new fdi(this, this.ac);
   }

   public void a(String $$0, ecg.c $$1, anf $$2, afs $$3, boolean $$4) {
      this.z();
      this.W.set(null);
      Instant $$5 = Instant.now();

      try {
         $$1.a($$3.c().a(), $$3.d());
         afp $$6 = afp.a(this.av, this.p);
         $$6.e().a(this);
         def.a($$6, this);
         aod.a(false);
         this.aN = MinecraftServer.a((Function<Thread, gdd>)($$4x -> new gdd($$4x, this, $$1, $$2, $$3, $$6, $$0xx -> {
               ale $$1xx = new ale($$0xx + 0);
               this.W.set($$1xx);
               return ald.a($$1xx, this.bd::add);
            })));
         this.aP = true;
         this.a(fjw.a());
         this.aM.a(fno.c.a, $$0, $$3.d().g());
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

      exu $$10 = new exu(this.W.get());
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
      sm $$13 = sm.a($$12);
      $$13.a($$12.toString(), 0, new fiw($$13, this, null, null, $$4, $$11, $$0x -> {
      }));
      $$13.a(new adn(this.V().c(), this.V().b()));
      this.aO = $$13;
   }

   public void a(fix $$0) {
      eyi $$1 = new eyi(true);
      $$1.a(tl.c("connect.joining"));
      this.e($$1);
      this.r = $$0;
      this.b($$0);
      if (!this.aP) {
         afp $$2 = afp.a(this.av, this.p);
         $$2.e().a(this);
         def.a($$2, this);
         aod.a(false);
      }
   }

   public void z() {
      this.b((eyk)(new eyi(true)));
   }

   public void b(eyk $$0) {
      fiy $$1 = this.J();
      if ($$1 != null) {
         this.bo();
         $$1.j();
      }

      this.aG.b();
      if (this.bk.e()) {
         this.bj();
      }

      gdd $$2 = this.aN;
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
      def.c();
   }

   public void c(eyk $$0) {
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
      def.c();
   }

   private void e(eyk $$0) {
      this.bg.a("forcedTick");
      this.ap.e();
      this.t = null;
      this.aO = null;
      this.a($$0);
      this.d(false);
      this.bg.c();
   }

   public void d(eyk $$0) {
      this.bg.a("forcedTick");
      this.a($$0);
      this.d(false);
      this.bg.c();
   }

   private void b(@Nullable fix $$0) {
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
      return this.H().a(false) ? this.aG.c($$0) : (this.s == null || !$$0.equals(this.s.cw())) && !$$0.equals(ac.d);
   }

   public eqv.a H() {
      if (this.m.l().c() == cbs.c) {
         return eqv.a.b;
      } else if (!this.ag) {
         return eqv.a.c;
      } else {
         return !this.ax.properties().flag(UserFlag.CHAT_ALLOWED) ? eqv.a.d : eqv.a.a;
      }
   }

   public final boolean I() {
      return this.ae;
   }

   @Nullable
   public fiy J() {
      return this.s == null ? null : this.s.cn;
   }

   public static boolean K() {
      return !E.m.Z;
   }

   public static boolean L() {
      return E.m.i().c().a() >= eqo.b.a();
   }

   public static boolean M() {
      return !E.j.a() && E.m.i().c().a() >= eqo.c.a();
   }

   public static boolean N() {
      return E.m.j().c();
   }

   private void bw() {
      if (this.v != null && this.v.c() != ehl.a.a) {
         boolean $$0 = this.s.fS().d;
         dcv $$1 = null;
         ehl.a $$2 = this.v.c();
         cjf $$6;
         if ($$2 == ehl.a.b) {
            gw $$3 = ((ehj)this.v).a();
            dfj $$4 = this.r.a_($$3);
            if ($$4.i()) {
               return;
            }

            csv $$5 = $$4.b();
            $$6 = $$5.a((cpb)this.r, $$3, $$4);
            if ($$6.b()) {
               return;
            }

            if ($$0 && eyk.p() && $$4.t()) {
               $$1 = this.r.c_($$3);
            }
         } else {
            if ($$2 != ehl.a.c || !$$0) {
               return;
            }

            biq $$7 = ((ehk)this.v).a();
            $$6 = $$7.dy();
            if ($$6 == null) {
               return;
            }
         }

         if ($$6.b()) {
            String $$10 = "";
            if ($$2 == ehl.a.b) {
               $$10 = jd.f.b(this.r.a_(((ehj)this.v).a()).b()).toString();
            } else if ($$2 == ehl.a.c) {
               $$10 = jd.h.b(((ehk)this.v).a().ah()).toString();
            }

            F.warn("Picking on: [{}] {} gave null item", $$2, $$10);
         } else {
            cbt $$11 = this.s.fR();
            if ($$1 != null) {
               this.a($$6, $$1);
            }

            int $$12 = $$11.b($$6);
            if ($$0) {
               $$11.a($$6);
               this.q.a(this.s.b(bgx.a), 36 + $$11.l);
            } else if ($$12 != -1) {
               if (cbt.d($$12)) {
                  $$11.l = $$12;
               } else {
                  this.q.a($$12);
               }
            }
         }
      }
   }

   private void a(cjf $$0, dcv $$1) {
      qx $$2 = $$1.m();
      cgy.a($$0, $$1.u(), $$2);
      if ($$0.d() instanceof cjt && $$2.e("SkullOwner")) {
         qx $$3 = $$2.p("SkullOwner");
         qx $$4 = $$0.w();
         $$4.a("SkullOwner", $$3);
         qx $$5 = $$4.p("BlockEntityTag");
         $$5.r("SkullOwner");
         $$5.r("x");
         $$5.r("y");
         $$5.r("z");
      } else {
         qx $$6 = new qx();
         rd $$7 = new rd();
         $$7.add(ro.a("\"(+NBT)\""));
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

   public static void a(@Nullable eqv $$0, @Nullable gam $$1, String $$2, @Nullable eqz $$3, o $$4) {
      ab $$5 = $$4.g();
      a($$5, $$0, $$1, $$2, $$3);
   }

   private static ab a(ab $$0, @Nullable eqv $$1, @Nullable gam $$2, String $$3, eqz $$4) {
      $$0.a("Launched Version", () -> $$3);
      $$0.a("Backend library", RenderSystem::getBackendDescription);
      $$0.a("Backend API", RenderSystem::getApiDescription);
      $$0.a("Window size", () -> $$1 != null ? $$1.P.k() + "x" + $$1.P.l() : "<not initialized>");
      $$0.a("GL Caps", RenderSystem::getCapsString);
      $$0.a("GL debug messages", () -> ekh.b() ? String.join("\n", ekh.a()) : "<disabled>");
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

      $$0.a("CPU", eki::b);
      return $$0;
   }

   public static eqv O() {
      return E;
   }

   public CompletableFuture<Void> P() {
      return this.a(this::k).thenCompose($$0 -> (CompletionStage<Void>)$$0);
   }

   public void a(fjw $$0) {
      if (!this.bs.a($$0)) {
         this.bs = fjz.a($$0, this.ax);
      }
   }

   @Nullable
   public fjh Q() {
      return x.a(this.J(), fiy::w);
   }

   public boolean R() {
      return this.aP;
   }

   public boolean S() {
      return this.aP && this.aN != null;
   }

   @Nullable
   public gdd T() {
      return this.aN;
   }

   public boolean U() {
      gdd $$0 = this.T();
      return $$0 != null && !$$0.p();
   }

   public boolean b(UUID $$0) {
      return $$0.equals(this.V().b());
   }

   public erk V() {
      return this.V;
   }

   public GameProfile W() {
      ProfileResult $$0 = this.L.join();
      return $$0 != null ? $$0.profile() : new GameProfile(this.V.b(), this.V.c());
   }

   public Proxy X() {
      return this.ab;
   }

   public fzf Y() {
      return this.M;
   }

   public anu Z() {
      return this.ah;
   }

   public anf aa() {
      return this.ak;
   }

   public aml ab() {
      return this.ai;
   }

   public fzx ac() {
      return this.aj;
   }

   public Path ad() {
      return this.K;
   }

   public gam ae() {
      return this.al;
   }

   public Function<aex, fze> a(aex $$0) {
      return this.az.a($$0)::a;
   }

   public boolean af() {
      return this.ad;
   }

   public boolean ag() {
      return this.aR;
   }

   public fny ah() {
      return this.at;
   }

   public gdq ai() {
      return this.ap;
   }

   public apb aj() {
      apb $$0 = x.a(this.y, eyk::B);
      if ($$0 != null) {
         return $$0;
      } else if (this.s != null) {
         if (this.s.dL().ac() == cpv.j) {
            return this.l.j().b() ? apc.d : apc.e;
         } else {
            hg<cqt> $$1 = this.s.dL().s(this.s.dl());
            if (!this.aq.c(apc.f) && (!this.s.bd() || !$$1.a(aps.Y))) {
               return this.s.dL().ac() != cpv.i && this.s.fS().d && this.s.fS().c ? apc.b : $$1.a().o().orElse(apc.g);
            } else {
               return apc.f;
            }
         }
      } else {
         return apc.a;
      }
   }

   public MinecraftSessionService ak() {
      return this.aw;
   }

   public gaf al() {
      return this.ay;
   }

   @Nullable
   public biq am() {
      return this.t;
   }

   public void a(biq $$0) {
      this.t = $$0;
      this.j.a($$0);
   }

   public boolean b(biq $$0) {
      return $$0.cd() || this.s != null && this.s.M_() && this.m.S.e() && $$0.ah() == biu.bt;
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

   public foy an() {
      return this.aA;
   }

   public ftf ao() {
      return this.S;
   }

   public fqd ap() {
      return this.aI;
   }

   public fuf aq() {
      return this.T;
   }

   public <T> gcz<T> a(gcy.a<T> $$0) {
      return this.U.a($$0);
   }

   public <T> void a(gcy.a<T> $$0, List<T> $$1) {
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

   public erw aw() {
      return this.am;
   }

   public boolean ax() {
      return this.s != null && this.s.gh() || this.m.R().c();
   }

   public euy ay() {
      return this.aE;
   }

   public get az() {
      return this.aF;
   }

   public boolean aA() {
      return this.bc;
   }

   public eqr aB() {
      return this.X;
   }

   public gbl aC() {
      return this.az;
   }

   public gad aD() {
      return this.aB;
   }

   public gac aE() {
      return this.aC;
   }

   public esg aF() {
      return this.aD;
   }

   @Override
   public void a(boolean $$0) {
      this.bc = $$0;
   }

   public tl a(File $$0, int $$1, int $$2) {
      int $$3 = this.P.k();
      int $$4 = this.P.l();
      ekb $$5 = new ekc($$1, $$2, true, a);
      float $$6 = this.s.dD();
      float $$7 = this.s.dB();
      float $$8 = this.s.O;
      float $$9 = this.s.N;
      this.j.b(false);

      ty var12;
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

            this.s.N = this.s.dB();
            this.s.O = this.s.dD();
            $$5.a(true);
            this.j.a(1.0F, 0L, new elp());

            try {
               Thread.sleep(10L);
            } catch (InterruptedException var17) {
            }

            erg.a($$0, "panorama_" + $$10 + ".png", $$5, $$0x -> {
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
         this.P.b($$3);
         this.P.c($$4);
         $$5.a();
         this.j.c(false);
         this.f.e();
         this.g().a(true);
      }

      return var12;
   }

   private tl a(File $$0, int $$1, int $$2, int $$3, int $$4) {
      try {
         ByteBuffer $$5 = eki.a($$1 * $$2 * 3);
         erg $$6 = new erg($$0, $$3, $$4, $$2);
         float $$7 = (float)$$3 / (float)$$1;
         float $$8 = (float)$$4 / (float)$$2;
         float $$9 = $$7 > $$8 ? $$7 : $$8;

         for (int $$10 = ($$4 - 1) / $$2 * $$2; $$10 >= 0; $$10 -= $$2) {
            for (int $$11 = 0; $$11 < $$3; $$11 += $$1) {
               RenderSystem.setShaderTexture(0, fzd.e);
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
         eki.a($$5);
         tl $$15 = tl.b($$14.getName()).a(n.t).a($$1x -> $$1x.a(new tj(tj.a.b, $$14.getAbsolutePath())));
         return tl.a("screenshot.success", $$15);
      } catch (Exception var15) {
         F.warn("Couldn't save screenshot", var15);
         return tl.a("screenshot.failure", var15.getMessage());
      }
   }

   public bdp aG() {
      return this.bg;
   }

   @Nullable
   public ale aH() {
      return this.W.get();
   }

   public gag aI() {
      return this.as;
   }

   @Nullable
   public eye aJ() {
      return this.aW;
   }

   public fcq aK() {
      return this.aG;
   }

   public boolean aL() {
      return false;
   }

   public ekt aM() {
      return this.P;
   }

   public esy aN() {
      return this.l.k();
   }

   public fok aO() {
      return this.R;
   }

   public void b(int $$0) {
      this.az.a($$0);
   }

   public fhy aP() {
      return this.aH;
   }

   public boolean aQ() {
      return this.ax.properties().flag(UserFlag.PROFANITY_FILTER_ENABLED);
   }

   public void aR() {
      this.aG.a();
      this.w().a();
   }

   public erd aS() {
      return this.bp;
   }

   @Nullable
   public ash aT() {
      return ash.a(this.av.getServicesKeySet(), ServicesKeyType.PROFILE_KEY);
   }

   public eqs aU() {
      return this.Y;
   }

   public void a(eqs $$0) {
      this.Y = $$0;
   }

   public eqn aV() {
      return this.bq;
   }

   public fjk aW() {
      return this.br;
   }

   public fjz aX() {
      return this.bs;
   }

   public env aY() {
      return this.aL;
   }

   public fno aZ() {
      return this.aM;
   }

   public eqk ba() {
      return this.bt;
   }

   public ehd bb() {
      return this.bu;
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
      d(tl.a("chat.disabled.profile", tl.d(eqv.E.m.K.h())).a(n.m)) {
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

   static record b(emf a, fdw.c b) {
   }
}
