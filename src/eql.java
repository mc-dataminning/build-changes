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

public class eql extends bfk<Runnable> implements ekk {
   static eql E;
   private static final Logger F = LogUtils.getLogger();
   public static final boolean a = ac.i() == ac.b.d;
   private static final int G = 10;
   public static final aer b = new aer("default");
   public static final aer c = new aer("uniform");
   public static final aer d = new aer("alt");
   private static final aer H = new aer("regional_compliancies.json");
   private static final CompletableFuture<asp> I = CompletableFuture.completedFuture(asp.a);
   private static final tf J = tf.c("multiplayer.socialInteractions.not_available");
   public static final String e = "Please make sure you have up-to-date drivers (see aka.ms/mcdriver for instructions).";
   private final Path K;
   private final CompletableFuture<ProfileResult> L;
   private final fyv M;
   private final DataFixer N;
   private final fol O;
   private final ekj P;
   private final eqy Q = new eqy(20.0F, 0L);
   private final foa R;
   public final fns f;
   private final fsv S;
   private final ftv T;
   public final flm g;
   private final gco U = new gco();
   private final era V;
   public final ert h;
   public final ert i;
   public final fnn j;
   public final frd k;
   private final AtomicReference<akx> W = new AtomicReference<>();
   public final eru l;
   public final eqp m;
   private final eqh X;
   public final eqm n;
   public final eqk o;
   private eqi Y = eqi.a;
   public final File p;
   private final String Z;
   private final String aa;
   private final Proxy ab;
   private final ebw ac;
   private final boolean ad;
   private final boolean ae;
   private final boolean af;
   private final boolean ag;
   private final anj ah;
   private final amd ai;
   private final fzn aj;
   private final amx ak;
   private final gac al;
   private final erm am;
   private final erq an;
   private final ejr ao;
   private final gdg ap;
   private final gdb aq;
   private final eut ar;
   private final fzw as;
   private final fno at;
   private final eqr au = new eqr(H, eql::b);
   private final YggdrasilAuthenticationService av;
   private final MinecraftSessionService aw;
   private final UserApiService ax;
   private final fzv ay;
   private final gbb az;
   private final fon aA;
   private final fzt aB;
   private final fzs aC;
   private final erw aD;
   private final euo aE;
   private final gej aF;
   private final fcg aG;
   private final fho aH;
   private final fpt aI;
   private final gdk aJ;
   private final fiw aK;
   private final enm aL;
   private final fne aM;
   @Nullable
   public fit q;
   @Nullable
   public fin r;
   @Nullable
   public fmw s;
   @Nullable
   private gct aN;
   @Nullable
   private sg aO;
   private boolean aP;
   @Nullable
   public bii t;
   @Nullable
   public bii u;
   @Nullable
   public ehb v;
   private int aQ;
   protected int w;
   private volatile boolean aR;
   private float aS;
   private long aT = ac.c();
   private long aU;
   private int aV;
   public boolean x;
   @Nullable
   public eya y;
   @Nullable
   private exu aW;
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
   private eup bf;
   private bdh bg = bde.a;
   private int bh;
   private final bdb bi = new bdb(ac.b, () -> this.bh);
   @Nullable
   private bdg bj;
   private bes bk = ber.a;
   private final eqv bl = new eqv();
   private long bm;
   private double bn;
   @Nullable
   private eky.a bo;
   private final eqt bp;
   private final eqd bq;
   private final fja br;
   private fjp bs;
   private final eqa bt;
   private final egt bu;
   private boolean bv;
   private String bw = "root";

   public eql(fdm $$0) {
      super("Client");
      E = this;
      this.p = $$0.c.a;
      File $$1 = $$0.c.c;
      this.K = $$0.c.b.toPath();
      this.Z = $$0.d.b;
      this.aa = $$0.d.c;
      Path $$2 = this.p.toPath();
      this.bu = ebw.a($$2.resolve("allowed_symlinks.txt"));
      fzl $$3 = new fzl($$0.c.a(), this.bu);
      this.aj = new fzn(new File(this.p, "server-resource-packs"));
      amz $$4 = new amt(this.K, amb.a, amy.b, this.bu);
      this.ak = new amx($$3, this.aj, $$4);
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
      uj.a(eqj::a);
      this.N = ast.a();
      this.aE = new euo(this);
      this.aX = Thread.currentThread();
      this.m = new eqp(this, this.p);
      RenderSystem.setShaderGlintAlpha(this.m.aj().c());
      this.aY = true;
      this.aF = new gej(this, this.m);
      this.X = new eqh(this.p, this.N);
      F.info("Backend library: {}", RenderSystem.getBackendDescription());
      ejw $$5;
      if (this.m.p > 0 && this.m.o > 0) {
         $$5 = new ejw(this.m.o, this.m.p, $$0.b.c, $$0.b.d, $$0.b.e);
      } else {
         $$5 = $$0.b;
      }

      ac.b = RenderSystem.initBackendSystem();
      this.O = new fol(this);
      this.P = this.O.a($$5, this.m.k, this.bc());
      this.a(true);
      gdv.a.b(gdr.A);

      try {
         this.P.a(this.ai, aa.b().g() ? ejz.a : ejz.b);
      } catch (IOException var12) {
         F.error("Couldn't set icon", var12);
      }

      this.P.a(this.m.g().c());
      this.n = new eqm(this);
      this.n.a(this.P.i());
      this.o = new eqk(this);
      this.o.a(this.P.i());
      RenderSystem.initRenderer(this.m.u, false);
      this.ao = new ejo(this.P.k(), this.P.l());
      this.ao.a(0.0F, 0.0F, 0.0F, 0.0F);
      this.ao.b(a);
      this.ah = new anj(amb.a);
      this.ak.a();
      this.m.b(this.ak);
      this.al = new gac(this.m.ad);
      this.ah.a(this.al);
      this.M = new fyv(this.ah);
      this.ah.a(this.M);
      this.ay = new fzv(this.M, $$1.toPath().resolve("skins"), this.aw, this);
      this.ac = new ebw($$2.resolve("saves"), $$2.resolve("backups"), this.bu, this.N);
      this.bt = new eqa($$2);
      this.ap = new gdg(this.m);
      this.ah.a(this.ap);
      this.as = new fzw(this.V);
      this.ah.a(this.as);
      this.aq = new gdb(this);
      this.ar = new eut(this.M);
      this.h = this.ar.a();
      this.i = this.ar.b();
      this.ah.a(this.ar);
      this.b(this.j());
      this.ah.a(new fzp());
      this.ah.a(new fzo());
      this.P.a("Startup");
      RenderSystem.setupDefaultState(0, 0, this.P.k(), this.P.l());
      this.P.a("Post startup");
      this.am = erm.a();
      this.an = erq.a(this.am);
      this.az = new gbb(this.M, this.am, this.m.z().c());
      this.ah.a(this.az);
      this.aH = new fho();
      this.ah.a(this.aH);
      this.aI = new fpt(this.h, this.aH, this::an, this::aq, this::ao);
      this.ah.a(this.aI);
      fnh $$8 = new fnh(this.aI, this.aH);
      this.ah.a($$8);
      this.T = new ftv(this, this.M, this.az, this.an, $$8);
      this.ah.a(this.T);
      this.R = new foa();
      this.aG = new fcg(this, this.ax);
      this.aA = new fon(this.az.b(), $$8, this.am);
      this.ah.a(this.aA);
      this.S = new fsv(this, this.M, this.T, this.aA, this.h, this.m, this.aH);
      this.ah.a(this.S);
      this.j = new fnn(this, this.S.d(), this.ah, this.R);
      this.ah.a(this.j.e());
      this.f = new fns(this, this.S, this.aI, this.R);
      this.ah.a(this.f);
      this.be();
      this.ah.a(this.U);
      this.g = new flm(this.r, this.M);
      this.ah.a(this.g);
      this.aB = new fzt(this.M);
      this.ah.a(this.aB);
      this.aC = new fzs(this.M);
      this.ah.a(this.aC);
      this.aD = new erw(this.M);
      this.ah.a(this.aD);
      this.at = new fno();
      this.ah.a(this.at);
      this.ah.a(this.au);
      this.l = new eru(this, this.T);
      this.k = new frd(this);
      elv $$9 = elv.a(this);
      this.aL = new enm($$9);
      RenderSystem.setErrorCallback(this::a);
      if (this.ao.c != this.P.k() || this.ao.d != this.P.l()) {
         StringBuilder $$10 = new StringBuilder(
            "Recovering from unsupported resolution ("
               + this.P.k()
               + "x"
               + this.P.l()
               + ").\nPlease make sure you have up-to-date drivers (see aka.ms/mcdriver for instructions)."
         );
         if (ejx.b()) {
            $$10.append("\n\nReported GL debug messages:\n").append(String.join("\n", ejx.a()));
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
      this.aJ = new gdk(this, this.ax, this.V);
      this.aK = fiw.a(this.ax, this.V, $$2);
      this.bp = new eqt(this);
      this.bq = new eqd(this);
      this.bq.a(this.m.ao().c() != eqn.a);
      this.br = new fja(this);
      this.br.a(this.m.x().c());
      this.bs = fjp.a(fjm.a(), this.ax);
      exm.a(this);
      List<ama> $$11 = this.ak.g();
      this.bl.a(eqv.b.a, $$11);
      ani $$12 = this.ah.a(ac.f(), this, I, $$11);
      gdv.a.a(gdr.C);
      eql.b $$13 = new eql.b($$9, $$0.e);
      this.a(new exm(this, $$12, $$1x -> ac.a($$1x, $$1xx -> this.a($$1xx, $$13), () -> {
            if (aa.aS) {
               this.bg();
            }

            this.bl.a();
            this.a($$13);
         }), false));
      this.aM = fne.a($$0.e.b());
   }

   private void a(@Nullable eql.b $$0) {
      if (!this.bv) {
         this.bv = true;
         this.b($$0);
      }
   }

   private void b(@Nullable eql.b $$0) {
      Runnable $$1 = this.c($$0);
      gdv.a.b(gdr.C);
      gdv.a.b(gdr.z);
      gdv.a.a(this.aJ.a());
      $$1.run();
   }

   public boolean c() {
      return this.bv;
   }

   private Runnable c(@Nullable eql.b $$0) {
      List<Function<Runnable, eya>> $$1 = new ArrayList<>();
      this.a($$1);
      Runnable $$2 = () -> {
         if ($$0 != null && $$0.b().a()) {
            fnd.a(this, $$0.b(), $$0.a());
         } else {
            this.a(new eyf(true));
         }
      };

      for (Function<Runnable, eya> $$3 : Lists.reverse($$1)) {
         eya $$4 = $$3.apply($$2);
         $$2 = () -> this.a($$4);
      }

      return $$2;
   }

   private void a(List<Function<Runnable, eya>> $$0) {
      if (this.m.ae) {
         $$0.add($$0x -> new ewl(this.m, $$0x));
      }

      BanDetails $$1 = this.F();
      if ($$1 != null) {
         $$0.add($$1x -> ewp.a($$1xx -> {
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
            $$0.add($$1x -> ewp.a($$3.getName(), $$1x));
         }

         if ($$4.contains(ProfileActionType.USING_BANNED_SKIN)) {
            $$0.add(ewp::a);
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
      fio $$1 = this.J();
      if ($$1 != null && $$1.l().k()) {
         $$0.append(" - ");
         fix $$2 = this.Q();
         if (this.aN != null && !this.aN.p()) {
            $$0.append(gaa.a("title.singleplayer"));
         } else if ($$2 != null && $$2.e()) {
            $$0.append(gaa.a("title.multiplayer.realms"));
         } else if (this.aN == null && ($$2 == null || !$$2.d())) {
            $$0.append(gaa.a("title.multiplayer.other"));
         } else {
            $$0.append(gaa.a("title.multiplayer.lan"));
         }
      }

      return $$0.toString();
   }

   private UserApiService a(YggdrasilAuthenticationService $$0, fdm $$1) {
      try {
         return $$0.createUserApiService($$1.a.a.d());
      } catch (AuthenticationException var4) {
         F.error("Failed to verify authentication", var4);
         return UserApiService.OFFLINE;
      }
   }

   public static aro e() {
      return aro.a("vanilla", ClientBrandRetriever::getClientModName, "Client", eql.class);
   }

   private void a(Throwable $$0, @Nullable eql.b $$1) {
      if (this.ak.d().size() > 1) {
         this.a($$0, null, $$1);
      } else {
         ac.a($$0);
      }
   }

   public void a(Throwable $$0, @Nullable tf $$1, @Nullable eql.b $$2) {
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

      this.a(new eyf());
      this.a(null);
   }

   private void a(@Nullable tf $$0) {
      euo $$1 = this.ay();
      eum.b($$1, eum.a.d, tf.c("resourcePack.load_fail"), $$0);
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
               bdk $$1 = bdk.a("Renderer");
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
               this.a(new ext());
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
            gco.a,
            $$0 -> new gch<>(
                  $$0x -> $$0x.a(null, cko.a.a.c()).stream().map($$0xx -> n.a($$0xx.getString()).trim()).filter($$0xx -> !$$0xx.isEmpty()),
                  $$0x -> Stream.of(jb.i.b($$0x.d())),
                  $$0
               )
         );
      this.U.a(gco.b, $$0 -> new gci<>($$0x -> $$0x.f().map(aqa::b), $$0));
      this.U
         .a(
            gco.c,
            $$0 -> new gch<>(
                  $$0x -> $$0x.e()
                        .stream()
                        .flatMap($$1 -> $$1.a($$0x.a()).a(null, cko.a.a).stream())
                        .map($$0xx -> n.a($$0xx.getString()).trim())
                        .filter($$0xx -> !$$0xx.isEmpty()),
                  $$0x -> $$0x.e().stream().map($$1 -> jb.i.b($$1.a($$0x.a()).d())),
                  $$0
               )
         );
      che.e().a($$0 -> {
         this.a(gco.a, $$0);
         this.a(gco.b, $$0);
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

   public ejr g() {
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
      aet.a($$0.e());
      if ($$0.f() != null) {
         aet.a("#@!@# Game crashed! Crash report saved to: #@!@# " + $$0.f());
         System.exit(-1);
      } else if ($$0.a($$2)) {
         aet.a("#@!@# Game crashed! Crash report saved to: #@!@# " + $$2.getAbsolutePath());
         System.exit(-1);
      } else {
         aet.a("#@?@# Game crashed! Crash report could not be saved. #@?@#");
         System.exit(-2);
      }
   }

   public boolean j() {
      return this.m.M().c();
   }

   public CompletableFuture<Void> k() {
      return this.a(false, null);
   }

   private CompletableFuture<Void> a(boolean $$0, @Nullable eql.b $$1) {
      if (this.be != null) {
         return this.be;
      } else {
         CompletableFuture<Void> $$2 = new CompletableFuture<>();
         if (!$$0 && this.aW instanceof exm) {
            this.be = $$2;
            return $$2;
         } else {
            this.ak.a();
            List<ama> $$3 = this.ak.g();
            if (!$$0) {
               this.bl.a(eqv.b.b, $$3);
            }

            this.a(new exm(this, this.ah.a(ac.f(), this, I, $$3), $$3x -> ac.a($$3x, $$2xx -> {
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
      fom $$1 = this.an().a();
      gav $$2 = $$1.a().a();

      for (csl $$3 : jb.f) {
         UnmodifiableIterator $$10 = $$3.l().a().iterator();

         while ($$10.hasNext()) {
            dez $$4 = (dez)$$10.next();
            if ($$4.l() == cyq.c) {
               gav $$5 = $$1.b($$4);
               if ($$5 == $$2) {
                  F.debug("Missing model for: {}", $$4);
                  $$0 = true;
               }
            }
         }
      }

      fyu $$6 = $$2.e();

      for (csl $$7 : jb.f) {
         UnmodifiableIterator var17 = $$7.l().a().iterator();

         while (var17.hasNext()) {
            dez $$8 = (dez)var17.next();
            fyu $$9 = $$1.a($$8);
            if (!$$8.i() && $$9 == $$6) {
               F.debug("Missing particle icon for: {}", $$8);
            }
         }
      }

      for (cis $$10 : jb.i) {
         cix $$11 = $$10.ad_();
         String $$12 = $$11.q();
         String $$13 = tf.c($$12).getString();
         if ($$13.toLowerCase(Locale.ROOT).equals($$10.a())) {
            F.debug("Missing translation for: {} {} {}", new Object[]{$$11, $$12, $$10});
         }
      }

      $$0 |= exn.a();
      $$0 |= fsy.a();
      if ($$0) {
         throw new IllegalStateException("Your game data is foobar, fix the errors above!");
      }
   }

   public ebw l() {
      return this.ac;
   }

   private void a(String $$0) {
      eql.a $$1 = this.H();
      if (!$$1.a(this.R())) {
         if (this.l.b()) {
            this.l.b(false);
            this.a(new ews($$0x -> {
               if ($$0x) {
                  ac.i().a("https://aka.ms/JavaAccountSettings");
               }

               this.a(null);
            }, eql.a.e, "https://aka.ms/JavaAccountSettings", true));
         } else {
            tf $$2 = $$1.a();
            this.l.a($$2, false);
            this.bq.c($$2);
            this.l.b($$1 == eql.a.d);
         }
      } else {
         this.a(new ewr($$0));
      }
   }

   public void a(@Nullable eya $$0) {
      if (aa.aS && Thread.currentThread() != this.aX) {
         F.error("setScreen called from non-game thread");
      }

      if (this.y != null) {
         this.y.h();
      }

      if ($$0 == null && this.r == null) {
         $$0 = new eyf();
      } else if ($$0 == null && this.s.eu()) {
         if (this.s.o()) {
            $$0 = new ewz(null, this.r.k().n());
         } else {
            this.s.fO();
         }
      }

      this.y = $$0;
      if (this.y != null) {
         this.y.au_();
      }

      elb.a();
      if ($$0 != null) {
         this.n.j();
         eqj.b();
         $$0.b(this, this.P.o(), this.P.p());
         this.x = false;
      } else {
         this.ap.g();
         this.n.i();
      }

      this.d();
   }

   public void a(@Nullable exu $$0) {
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
            this.y.h();
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

      if (this.be != null && !(this.aW instanceof exm)) {
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
            eky.a().ifPresent(eky::b);
         }
      }

      RenderSystem.clear(16640, a);
      this.ao.a(true);
      fnm.a();
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
         erv $$9 = new erv(this, this.R.b());
         this.a($$9, this.bj);
         $$9.e();
         this.bg.c();
      }

      this.bg.a("blit");
      this.ao.e();
      this.ao.a(this.P.k(), this.P.l());
      this.bb = ac.c() - $$6;
      if ($$8) {
         eky.a().ifPresent($$0x -> this.bo = $$0x.c());
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
            this.m.h().c() == epz.a ? "" : (this.m.h().c() == epz.b ? " fast-clouds" : " fancy-clouds"),
            this.m.B().c(),
            $$14
         );
         this.aU += 1000L;
         this.aV = 0;
      }

      this.bg.c();
   }

   private bdh a(boolean $$0, @Nullable bdk $$1) {
      if (!$$0) {
         this.bi.b();
         if (!this.bk.e() && $$1 == null) {
            return bde.a;
         }
      }

      bdh $$2;
      if ($$0) {
         if (!this.bi.a()) {
            this.bh = 0;
            this.bi.c();
         }

         this.bh++;
         $$2 = this.bi.d();
      } else {
         $$2 = bde.a;
      }

      if (this.bk.e()) {
         $$2 = bdh.a($$2, this.bk.f());
      }

      return bdk.a($$2, $$1);
   }

   private void b(boolean $$0, @Nullable bdk $$1) {
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

      ejr $$1 = this.g();
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
         arn.b();
         this.f.p();
      } catch (Throwable var3) {
      }

      try {
         System.gc();
         if (this.aP && this.aN != null) {
            this.aN.a(true);
         }

         this.b((eya)(new exg(tf.c("menu.savingLevel"))));
      } catch (Throwable var2) {
      }

      System.gc();
   }

   public boolean a(Consumer<tf> $$0) {
      if (this.bk.e()) {
         this.bi();
         return false;
      } else {
         Consumer<bdg> $$1 = $$1x -> {
            if ($$1x != bdc.a) {
               int $$2x = $$1x.f();
               double $$3x = (double)$$1x.g() / (double)asm.a;
               this.execute(
                  () -> $$0.accept(
                        tf.a("commands.debug.stopped", String.format(Locale.ROOT, "%.2f", $$3x), $$2x, String.format(Locale.ROOT, "%.2f", (double)$$2x / $$3x))
                     )
               );
            }
         };
         Consumer<Path> $$2 = $$1x -> {
            tf $$2x = tf.b($$1x.toString()).a(n.t).a($$1xx -> $$1xx.a(new td(td.a.b, $$1x.toFile().getParent())));
            this.execute(() -> $$0.accept(tf.a("debug.profiling.stop", $$2x)));
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

         this.bk = beq.a(new fnb(ac.b, this.f), ac.b, ac.g(), new bew("client"), $$1x -> {
            this.bk = ber.a;
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
         fix $$3 = this.Q();
         $$2 = $$3 != null ? $$3.a : "unknown";
      }

      Path $$7;
      try {
         String $$5 = String.format(Locale.ROOT, "%s-%s-%s", ac.e(), $$2, aa.b().b());
         String $$6 = v.a(bew.a, $$5, ".zip");
         $$7 = bew.a.resolve($$6);
      } catch (IOException var21) {
         throw new UncheckedIOException(var21);
      }

      try (arb $$10 = new arb($$7)) {
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
         List<bdj> $$1 = this.bj.a(this.bw);
         if (!$$1.isEmpty()) {
            bdj $$2 = $$1.remove(0);
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

   private void a(erv $$0, bdg $$1) {
      List<bdj> $$2 = $$1.a(this.bw);
      bdj $$3 = $$2.remove(0);
      RenderSystem.clear(256, a);
      RenderSystem.setShader(fnn::q);
      Matrix4f $$4 = new Matrix4f().setOrtho(0.0F, (float)this.P.k(), (float)this.P.l(), 0.0F, 1000.0F, 3000.0F);
      RenderSystem.setProjectionMatrix($$4, eln.b);
      elf $$5 = RenderSystem.getModelViewStack();
      $$5.a();
      $$5.e();
      $$5.a(0.0F, 0.0F, -2000.0F);
      RenderSystem.applyModelViewMatrix();
      RenderSystem.lineWidth(1.0F);
      elh $$6 = elh.a();
      ela $$7 = $$6.c();
      int $$8 = 160;
      int $$9 = this.P.k() - 160 - 10;
      int $$10 = this.P.l() - 320;
      RenderSystem.enableBlend();
      $$7.a(elk.b.h, eld.n);
      $$7.a((double)((float)$$9 - 176.0F), (double)((float)$$10 - 96.0F - 16.0F), 0.0).a(200, 0, 0, 0).e();
      $$7.a((double)((float)$$9 - 176.0F), (double)($$10 + 320), 0.0).a(200, 0, 0, 0).e();
      $$7.a((double)((float)$$9 + 176.0F), (double)($$10 + 320), 0.0).a(200, 0, 0, 0).e();
      $$7.a((double)((float)$$9 + 176.0F), (double)((float)$$10 - 96.0F - 16.0F), 0.0).a(200, 0, 0, 0).e();
      $$6.b();
      RenderSystem.disableBlend();
      double $$11 = 0.0;

      for (bdj $$12 : $$2) {
         int $$13 = arp.a($$12.a / 4.0) + 1;
         $$7.a(elk.b.g, eld.n);
         int $$14 = $$12.a();
         int $$15 = $$14 >> 16 & 0xFF;
         int $$16 = $$14 >> 8 & 0xFF;
         int $$17 = $$14 & 0xFF;
         $$7.a((double)$$9, (double)$$10, 0.0).a($$15, $$16, $$17, 255).e();

         for (int $$18 = $$13; $$18 >= 0; $$18--) {
            float $$19 = (float)(($$11 + $$12.a * (double)$$18 / (double)$$13) * (float) (Math.PI * 2) / 100.0);
            float $$20 = arp.a($$19) * 160.0F;
            float $$21 = arp.b($$19) * 160.0F * 0.5F;
            $$7.a((double)((float)$$9 + $$20), (double)((float)$$10 - $$21), 0.0).a($$15, $$16, $$17, 255).e();
         }

         $$6.b();
         $$7.a(elk.b.f, eld.n);

         for (int $$22 = $$13; $$22 >= 0; $$22--) {
            float $$23 = (float)(($$11 + $$12.a * (double)$$22 / (double)$$13) * (float) (Math.PI * 2) / 100.0);
            float $$24 = arp.a($$23) * 160.0F;
            float $$25 = arp.b($$23) * 160.0F * 0.5F;
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
      String $$27 = bdg.b($$3.d);
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
         bdj $$31 = $$2.get($$30);
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
            this.a(new exv(!$$0));
            this.ap.d();
         } else {
            this.a(new exv(true));
         }
      }
   }

   private void e(boolean $$0) {
      if (!$$0) {
         this.w = 0;
      }

      if (this.w <= 0 && !this.s.fl()) {
         if ($$0 && this.v != null && this.v.c() == ehb.a.b) {
            egz $$1 = (egz)this.v;
            gu $$2 = $$1.a();
            if (!this.r.a_($$2).i()) {
               ha $$3 = $$1.b();
               if (this.q.b($$2, $$3)) {
                  this.g.a($$2, $$3);
                  this.s.a(bgp.a);
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
         cix $$0 = this.s.b(bgp.a);
         if (!$$0.a(this.r.G())) {
            return false;
         } else {
            boolean $$1 = false;
            switch (this.v.c()) {
               case c:
                  this.q.a(this.s, ((eha)this.v).a());
                  break;
               case b:
                  egz $$2 = (egz)this.v;
                  gu $$3 = $$2.a();
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

            this.s.a(bgp.a);
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

            for (bgp $$0 : bgp.values()) {
               cix $$1 = this.s.b($$0);
               if (!$$1.a(this.r.G())) {
                  return;
               }

               if (this.v != null) {
                  switch (this.v.c()) {
                     case c:
                        eha $$2 = (eha)this.v;
                        bii $$3 = $$2.a();
                        if (!this.r.w_().a($$3.dk())) {
                           return;
                        }

                        bgq $$4 = this.q.a(this.s, $$3, $$2, $$0);
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
                        egz $$5 = (egz)this.v;
                        int $$6 = $$1.L();
                        bgq $$7 = this.q.a(this.s, $$0, $$5);
                        if ($$7.a()) {
                           if ($$7.b()) {
                              this.s.a($$0);
                              if (!$$1.b() && ($$1.L() != $$6 || this.q.g())) {
                                 this.j.b.a($$0);
                              }
                           }

                           return;
                        }

                        if ($$7 == bgq.e) {
                           return;
                        }
                  }
               }

               if (!$$1.b()) {
                  bgq $$8 = this.q.a(this.s, $$0);
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

   public gdb s() {
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
         if (this.y instanceof exi $$0 && !this.s.fB()) {
            $$0.k();
         }
      } else if (this.s.eu() && !(this.y instanceof ewz)) {
         this.a(null);
      } else if (this.s.fB() && this.r != null) {
         this.a(new exi());
      }

      if (this.y != null) {
         this.w = 10000;
      }

      if (this.y != null) {
         eya.a(() -> this.y.c(), "Ticking screen", this.y.getClass().getCanonicalName());
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
               tf $$1 = tf.c("tutorial.socialInteractions.title");
               tf $$2 = tf.a("tutorial.socialInteractions.description", gej.a("socialInteractions"));
               this.bf = new eup(eup.a.f, $$1, $$2, true);
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
         epx $$0 = this.m.av();
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
               ezm.a(this, $$1, $$3, $$2);
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

            this.a(new fci());
         }
      }

      while (this.m.E.g()) {
         if (this.q.i()) {
            this.s.i();
         } else {
            this.aF.a();
            this.a(new ezx(this.s));
         }
      }

      while (this.m.T.g()) {
         this.a(new eyp(this.s.cl.q()));
      }

      while (this.m.F.g()) {
         if (!this.s.G_()) {
            this.J().b(new abz(abz.a.g, gu.b, ha.a));
         }
      }

      while (this.m.G.g()) {
         if (!this.s.G_() && this.s.a(eya.p())) {
            this.s.a(bgp.a);
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

   public gdk u() {
      return this.aJ;
   }

   public double v() {
      return this.bn;
   }

   public fiw w() {
      return this.aK;
   }

   public fcy y() {
      return new fcy(this, this.ac);
   }

   public void a(String $$0, ebw.c $$1, amx $$2, afm $$3, boolean $$4) {
      this.z();
      this.W.set(null);
      Instant $$5 = Instant.now();

      try {
         $$1.a($$3.c().a(), $$3.d());
         afj $$6 = afj.a(this.av, this.p);
         $$6.e().a(this);
         ddv.a($$6, this);
         anv.a(false);
         this.aN = MinecraftServer.a((Function<Thread, gct>)($$4x -> new gct($$4x, this, $$1, $$2, $$3, $$6, $$0xx -> {
               akx $$1xx = new akx($$0xx + 0);
               this.W.set($$1xx);
               return akw.a($$1xx, this.bd::add);
            })));
         this.aP = true;
         this.a(fjm.a());
         this.aM.a(fne.c.a, $$0, $$3.d().g());
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

      exk $$10 = new exk(this.W.get());
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
      sg $$13 = sg.a($$12);
      $$13.a($$12.toString(), 0, new fim($$13, this, null, null, $$4, $$11, $$0x -> {
      }));
      $$13.a(new adh(this.V().c(), this.V().b()));
      this.aO = $$13;
   }

   public void a(fin $$0) {
      exy $$1 = new exy(true);
      $$1.a(tf.c("connect.joining"));
      this.e($$1);
      this.r = $$0;
      this.b($$0);
      if (!this.aP) {
         afj $$2 = afj.a(this.av, this.p);
         $$2.e().a(this);
         ddv.a($$2, this);
         anv.a(false);
      }
   }

   public void z() {
      this.b((eya)(new exy(true)));
   }

   public void b(eya $$0) {
      fio $$1 = this.J();
      if ($$1 != null) {
         this.bo();
         $$1.j();
      }

      this.aG.b();
      if (this.bk.e()) {
         this.bj();
      }

      gct $$2 = this.aN;
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
      ddv.c();
   }

   public void c(eya $$0) {
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
      ddv.c();
   }

   private void e(eya $$0) {
      this.bg.a("forcedTick");
      this.ap.e();
      this.t = null;
      this.aO = null;
      this.a($$0);
      this.d(false);
      this.bg.c();
   }

   public void d(eya $$0) {
      this.bg.a("forcedTick");
      this.a($$0);
      this.d(false);
      this.bg.c();
   }

   private void b(@Nullable fin $$0) {
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

   public eql.a H() {
      if (this.m.l().c() == cbk.c) {
         return eql.a.b;
      } else if (!this.ag) {
         return eql.a.c;
      } else {
         return !this.ax.properties().flag(UserFlag.CHAT_ALLOWED) ? eql.a.d : eql.a.a;
      }
   }

   public final boolean I() {
      return this.ae;
   }

   @Nullable
   public fio J() {
      return this.s == null ? null : this.s.cl;
   }

   public static boolean K() {
      return !E.m.Z;
   }

   public static boolean L() {
      return E.m.i().c().a() >= eqe.b.a();
   }

   public static boolean M() {
      return !E.j.a() && E.m.i().c().a() >= eqe.c.a();
   }

   public static boolean N() {
      return E.m.j().c();
   }

   private void bw() {
      if (this.v != null && this.v.c() != ehb.a.a) {
         boolean $$0 = this.s.fR().d;
         dcl $$1 = null;
         ehb.a $$2 = this.v.c();
         cix $$6;
         if ($$2 == ehb.a.b) {
            gu $$3 = ((egz)this.v).a();
            dez $$4 = this.r.a_($$3);
            if ($$4.i()) {
               return;
            }

            csl $$5 = $$4.b();
            $$6 = $$5.a((cor)this.r, $$3, $$4);
            if ($$6.b()) {
               return;
            }

            if ($$0 && eya.p() && $$4.t()) {
               $$1 = this.r.c_($$3);
            }
         } else {
            if ($$2 != ehb.a.c || !$$0) {
               return;
            }

            bii $$7 = ((eha)this.v).a();
            $$6 = $$7.dx();
            if ($$6 == null) {
               return;
            }
         }

         if ($$6.b()) {
            String $$10 = "";
            if ($$2 == ehb.a.b) {
               $$10 = jb.f.b(this.r.a_(((egz)this.v).a()).b()).toString();
            } else if ($$2 == ehb.a.c) {
               $$10 = jb.h.b(((eha)this.v).a().ag()).toString();
            }

            F.warn("Picking on: [{}] {} gave null item", $$2, $$10);
         } else {
            cbl $$11 = this.s.fQ();
            if ($$1 != null) {
               this.a($$6, $$1);
            }

            int $$12 = $$11.b($$6);
            if ($$0) {
               $$11.a($$6);
               this.q.a(this.s.b(bgp.a), 36 + $$11.l);
            } else if ($$12 != -1) {
               if (cbl.d($$12)) {
                  $$11.l = $$12;
               } else {
                  this.q.a($$12);
               }
            }
         }
      }
   }

   private void a(cix $$0, dcl $$1) {
      qr $$2 = $$1.m();
      cgq.a($$0, $$1.u(), $$2);
      if ($$0.d() instanceof cjl && $$2.e("SkullOwner")) {
         qr $$3 = $$2.p("SkullOwner");
         qr $$4 = $$0.w();
         $$4.a("SkullOwner", $$3);
         qr $$5 = $$4.p("BlockEntityTag");
         $$5.r("SkullOwner");
         $$5.r("x");
         $$5.r("y");
         $$5.r("z");
      } else {
         qr $$6 = new qr();
         qx $$7 = new qx();
         $$7.add(ri.a("\"(+NBT)\""));
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

   public static void a(@Nullable eql $$0, @Nullable gac $$1, String $$2, @Nullable eqp $$3, o $$4) {
      ab $$5 = $$4.g();
      a($$5, $$0, $$1, $$2, $$3);
   }

   private static ab a(ab $$0, @Nullable eql $$1, @Nullable gac $$2, String $$3, eqp $$4) {
      $$0.a("Launched Version", () -> $$3);
      $$0.a("Backend library", RenderSystem::getBackendDescription);
      $$0.a("Backend API", RenderSystem::getApiDescription);
      $$0.a("Window size", () -> $$1 != null ? $$1.P.k() + "x" + $$1.P.l() : "<not initialized>");
      $$0.a("GL Caps", RenderSystem::getCapsString);
      $$0.a("GL debug messages", () -> ejx.b() ? String.join("\n", ejx.a()) : "<disabled>");
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

      $$0.a("CPU", ejy::b);
      return $$0;
   }

   public static eql O() {
      return E;
   }

   public CompletableFuture<Void> P() {
      return this.a(this::k).thenCompose($$0 -> (CompletionStage<Void>)$$0);
   }

   public void a(fjm $$0) {
      if (!this.bs.a($$0)) {
         this.bs = fjp.a($$0, this.ax);
      }
   }

   @Nullable
   public fix Q() {
      return x.a(this.J(), fio::w);
   }

   public boolean R() {
      return this.aP;
   }

   public boolean S() {
      return this.aP && this.aN != null;
   }

   @Nullable
   public gct T() {
      return this.aN;
   }

   public boolean U() {
      gct $$0 = this.T();
      return $$0 != null && !$$0.p();
   }

   public boolean b(UUID $$0) {
      return $$0.equals(this.V().b());
   }

   public era V() {
      return this.V;
   }

   public GameProfile W() {
      ProfileResult $$0 = this.L.join();
      return $$0 != null ? $$0.profile() : new GameProfile(this.V.b(), this.V.c());
   }

   public Proxy X() {
      return this.ab;
   }

   public fyv Y() {
      return this.M;
   }

   public anm Z() {
      return this.ah;
   }

   public amx aa() {
      return this.ak;
   }

   public amd ab() {
      return this.ai;
   }

   public fzn ac() {
      return this.aj;
   }

   public Path ad() {
      return this.K;
   }

   public gac ae() {
      return this.al;
   }

   public Function<aer, fyu> a(aer $$0) {
      return this.az.a($$0)::a;
   }

   public boolean af() {
      return this.ad;
   }

   public boolean ag() {
      return this.aR;
   }

   public fno ah() {
      return this.at;
   }

   public gdg ai() {
      return this.ap;
   }

   public aot aj() {
      aot $$0 = x.a(this.y, eya::B);
      if ($$0 != null) {
         return $$0;
      } else if (this.s != null) {
         if (this.s.dK().ac() == cpl.j) {
            return this.l.j().b() ? aou.d : aou.e;
         } else {
            he<cqj> $$1 = this.s.dK().s(this.s.dk());
            if (!this.aq.c(aou.f) && (!this.s.bc() || !$$1.a(apk.Y))) {
               return this.s.dK().ac() != cpl.i && this.s.fR().d && this.s.fR().c ? aou.b : $$1.a().o().orElse(aou.g);
            } else {
               return aou.f;
            }
         }
      } else {
         return aou.a;
      }
   }

   public MinecraftSessionService ak() {
      return this.aw;
   }

   public fzv al() {
      return this.ay;
   }

   @Nullable
   public bii am() {
      return this.t;
   }

   public void a(bii $$0) {
      this.t = $$0;
      this.j.a($$0);
   }

   public boolean b(bii $$0) {
      return $$0.cc() || this.s != null && this.s.G_() && this.m.S.e() && $$0.ag() == bim.bt;
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

   public fon an() {
      return this.aA;
   }

   public fsv ao() {
      return this.S;
   }

   public fpt ap() {
      return this.aI;
   }

   public ftv aq() {
      return this.T;
   }

   public <T> gcp<T> a(gco.a<T> $$0) {
      return this.U.a($$0);
   }

   public <T> void a(gco.a<T> $$0, List<T> $$1) {
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

   public erm aw() {
      return this.am;
   }

   public boolean ax() {
      return this.s != null && this.s.gg() || this.m.R().c();
   }

   public euo ay() {
      return this.aE;
   }

   public gej az() {
      return this.aF;
   }

   public boolean aA() {
      return this.bc;
   }

   public eqh aB() {
      return this.X;
   }

   public gbb aC() {
      return this.az;
   }

   public fzt aD() {
      return this.aB;
   }

   public fzs aE() {
      return this.aC;
   }

   public erw aF() {
      return this.aD;
   }

   @Override
   public void a(boolean $$0) {
      this.bc = $$0;
   }

   public tf a(File $$0, int $$1, int $$2) {
      int $$3 = this.P.k();
      int $$4 = this.P.l();
      ejr $$5 = new ejs($$1, $$2, true, a);
      float $$6 = this.s.dC();
      float $$7 = this.s.dA();
      float $$8 = this.s.O;
      float $$9 = this.s.N;
      this.j.b(false);

      ts var12;
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
            this.j.a(1.0F, 0L, new elf());

            try {
               Thread.sleep(10L);
            } catch (InterruptedException var17) {
            }

            eqw.a($$0, "panorama_" + $$10 + ".png", $$5, $$0x -> {
            });
         }

         tf $$11 = tf.b($$0.getName()).a(n.t).a($$1x -> $$1x.a(new td(td.a.b, $$0.getAbsolutePath())));
         return tf.a("screenshot.success", $$11);
      } catch (Exception var18) {
         F.error("Couldn't save image", var18);
         var12 = tf.a("screenshot.failure", var18.getMessage());
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

   private tf a(File $$0, int $$1, int $$2, int $$3, int $$4) {
      try {
         ByteBuffer $$5 = ejy.a($$1 * $$2 * 3);
         eqw $$6 = new eqw($$0, $$3, $$4, $$2);
         float $$7 = (float)$$3 / (float)$$1;
         float $$8 = (float)$$4 / (float)$$2;
         float $$9 = $$7 > $$8 ? $$7 : $$8;

         for (int $$10 = ($$4 - 1) / $$2 * $$2; $$10 >= 0; $$10 -= $$2) {
            for (int $$11 = 0; $$11 < $$3; $$11 += $$1) {
               RenderSystem.setShaderTexture(0, fyt.e);
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
         ejy.a($$5);
         tf $$15 = tf.b($$14.getName()).a(n.t).a($$1x -> $$1x.a(new td(td.a.b, $$14.getAbsolutePath())));
         return tf.a("screenshot.success", $$15);
      } catch (Exception var15) {
         F.warn("Couldn't save screenshot", var15);
         return tf.a("screenshot.failure", var15.getMessage());
      }
   }

   public bdh aG() {
      return this.bg;
   }

   @Nullable
   public akx aH() {
      return this.W.get();
   }

   public fzw aI() {
      return this.as;
   }

   @Nullable
   public exu aJ() {
      return this.aW;
   }

   public fcg aK() {
      return this.aG;
   }

   public boolean aL() {
      return false;
   }

   public ekj aM() {
      return this.P;
   }

   public eso aN() {
      return this.l.k();
   }

   public foa aO() {
      return this.R;
   }

   public void b(int $$0) {
      this.az.a($$0);
   }

   public fho aP() {
      return this.aH;
   }

   public boolean aQ() {
      return this.ax.properties().flag(UserFlag.PROFANITY_FILTER_ENABLED);
   }

   public void aR() {
      this.aG.a();
      this.w().a();
   }

   public eqt aS() {
      return this.bp;
   }

   @Nullable
   public arz aT() {
      return arz.a(this.av.getServicesKeySet(), ServicesKeyType.PROFILE_KEY);
   }

   public eqi aU() {
      return this.Y;
   }

   public void a(eqi $$0) {
      this.Y = $$0;
   }

   public eqd aV() {
      return this.bq;
   }

   public fja aW() {
      return this.br;
   }

   public fjp aX() {
      return this.bs;
   }

   public enm aY() {
      return this.aL;
   }

   public fne aZ() {
      return this.aM;
   }

   public eqa ba() {
      return this.bt;
   }

   public egt bb() {
      return this.bu;
   }

   public static enum a {
      a(te.a) {
         @Override
         public boolean a(boolean $$0) {
            return true;
         }
      },
      b(tf.c("chat.disabled.options").a(n.m)) {
         @Override
         public boolean a(boolean $$0) {
            return false;
         }
      },
      c(tf.c("chat.disabled.launcher").a(n.m)) {
         @Override
         public boolean a(boolean $$0) {
            return $$0;
         }
      },
      d(tf.a("chat.disabled.profile", tf.d(eql.E.m.K.h())).a(n.m)) {
         @Override
         public boolean a(boolean $$0) {
            return $$0;
         }
      };

      static final tf e = tf.c("chat.disabled.profile.moreInfo");
      private final tf f;

      a(tf $$0) {
         this.f = $$0;
      }

      public tf a() {
         return this.f;
      }

      public abstract boolean a(boolean var1);
   }

   static record b(elv a, fdm.c b) {
   }
}
