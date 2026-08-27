import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Queues;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.exceptions.AuthenticationException;
import com.mojang.authlib.minecraft.BanDetails;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import com.mojang.authlib.minecraft.UserApiService;
import com.mojang.authlib.minecraft.UserApiService.UserFlag;
import com.mojang.authlib.properties.PropertyMap;
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
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.Queue;
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

public class eqn extends bfi<Runnable> implements ekm {
   static eqn F;
   private static final Logger G = LogUtils.getLogger();
   public static final boolean a = ac.i() == ac.b.d;
   private static final int H = 10;
   public static final aep b = new aep("default");
   public static final aep c = new aep("uniform");
   public static final aep d = new aep("alt");
   private static final aep I = new aep("regional_compliancies.json");
   private static final CompletableFuture<asn> J = CompletableFuture.completedFuture(asn.a);
   private static final te K = te.c("multiplayer.socialInteractions.not_available");
   public static final String e = "Please make sure you have up-to-date drivers (see aka.ms/mcdriver for instructions).";
   private final Path L;
   private final PropertyMap M;
   private final fyh N;
   private final DataFixer O;
   private final fnx P;
   private final ekl Q;
   private final era R = new era(20.0F, 0L);
   private final fnm S;
   public final fne f;
   private final fsh T;
   private final fth U;
   public final fky g;
   private final gca V = new gca();
   private final erc W;
   public final erv h;
   public final erv i;
   public final fmz j;
   public final fqp k;
   private final AtomicReference<akv> X = new AtomicReference<>();
   public final erw l;
   public final eqr m;
   private final eqj Y;
   public final eqo n;
   public final eqm o;
   private eqk Z = eqk.a;
   public final File p;
   private final String aa;
   private final String ab;
   private final Proxy ac;
   private final ebv ad;
   public final arc q = new arc();
   private final boolean ae;
   private final boolean af;
   private final boolean ag;
   private final boolean ah;
   private final anh ai;
   private final amb aj;
   private final fyz ak;
   private final amv al;
   private final fzo am;
   private final ero an;
   private final ers ao;
   private final ejt ap;
   private final gcs aq;
   private final gcn ar;
   private final eup as;
   private final fzi at;
   private final fna au;
   private final eqt av = new eqt(I, eqn::b);
   private final YggdrasilAuthenticationService aw;
   private final MinecraftSessionService ax;
   private final UserApiService ay;
   private final fzh az;
   private final gan aA;
   private final fnz aB;
   private final fzf aC;
   private final fze aD;
   private final ery aE;
   private final euk aF;
   private final gdv aG;
   private final fbx aH;
   private final fhf aI;
   private final fpf aJ;
   private final gcw aK;
   private final fim aL;
   private final eno aM;
   private final fmq aN;
   @Nullable
   public fik r;
   @Nullable
   public fie s;
   @Nullable
   public fmi t;
   @Nullable
   private gcf aO;
   @Nullable
   private sf aP;
   private boolean aQ;
   @Nullable
   public big u;
   @Nullable
   public big v;
   @Nullable
   public ehd w;
   private int aR;
   protected int x;
   private volatile boolean aS;
   private float aT;
   private long aU = ac.c();
   private long aV;
   private int aW;
   public boolean y;
   @Nullable
   public exv z;
   @Nullable
   private exp aX;
   private boolean aY;
   private Thread aZ;
   private volatile boolean ba;
   @Nullable
   private Supplier<o> bb;
   private static int bc;
   public String A = "";
   private long bd;
   public boolean B;
   public boolean C;
   public boolean D;
   public boolean E = true;
   private boolean be;
   private final Queue<Runnable> bf = Queues.newConcurrentLinkedQueue();
   @Nullable
   private CompletableFuture<Void> bg;
   @Nullable
   private eul bh;
   private bde bi = bdb.a;
   private int bj;
   private final bcy bk = new bcy(ac.a, () -> this.bj);
   @Nullable
   private bdd bl;
   private beq bm = bep.a;
   private final eqx bn = new eqx();
   private long bo;
   private double bp;
   @Nullable
   private ela.a bq;
   private final eqv br;
   private final eqf bs;
   private final fiq bt;
   private fjc bu;
   private final eqc bv;
   private final egv bw;
   private String bx = "root";

   public eqn(fdd $$0) {
      super("Client");
      F = this;
      this.p = $$0.c.a;
      File $$1 = $$0.c.c;
      this.L = $$0.c.b.toPath();
      this.aa = $$0.d.b;
      this.ab = $$0.d.c;
      this.M = $$0.a.c;
      Path $$2 = this.p.toPath();
      this.bw = ebv.a($$2.resolve("allowed_symlinks.txt"));
      fyx $$3 = new fyx($$0.c.a(), this.bw);
      this.ak = new fyz(new File(this.p, "server-resource-packs"));
      amx $$4 = new amr(this.L, alz.a, amw.b, this.bw);
      this.al = new amv($$3, this.ak, $$4);
      this.aj = $$3.a();
      this.ac = $$0.a.d;
      this.aw = new YggdrasilAuthenticationService(this.ac);
      this.ax = this.aw.createMinecraftSessionService();
      this.ay = this.a(this.aw, $$0);
      this.W = $$0.a.a;
      G.info("Setting user: {}", this.W.c());
      G.debug("(Session ID is {})", this.W.a());
      this.af = $$0.d.a;
      this.ag = !$$0.d.d;
      this.ah = !$$0.d.e;
      this.ae = bf();
      this.aO = null;
      ui.a(eql::a);
      this.O = asr.a();
      this.aF = new euk(this);
      this.aZ = Thread.currentThread();
      this.m = new eqr(this, this.p);
      RenderSystem.setShaderGlintAlpha(this.m.ai().c());
      this.ba = true;
      this.aG = new gdv(this, this.m);
      this.Y = new eqj(this.p, this.O);
      G.info("Backend library: {}", RenderSystem.getBackendDescription());
      ejy $$5;
      if (this.m.p > 0 && this.m.o > 0) {
         $$5 = new ejy(this.m.o, this.m.p, $$0.b.c, $$0.b.d, $$0.b.e);
      } else {
         $$5 = $$0.b;
      }

      ac.a = RenderSystem.initBackendSystem();
      this.P = new fnx(this);
      this.Q = this.P.a($$5, this.m.k, this.bc());
      this.a(true);
      gdh.a.b(gdd.A);

      try {
         this.Q.a(this.aj, aa.b().g() ? ekb.a : ekb.b);
      } catch (IOException var11) {
         G.error("Couldn't set icon", var11);
      }

      this.Q.a(this.m.g().c());
      this.n = new eqo(this);
      this.n.a(this.Q.i());
      this.o = new eqm(this);
      this.o.a(this.Q.i());
      RenderSystem.initRenderer(this.m.u, false);
      this.ap = new ejq(this.Q.k(), this.Q.l());
      this.ap.a(0.0F, 0.0F, 0.0F, 0.0F);
      this.ap.b(a);
      this.ai = new anh(alz.a);
      this.al.a();
      this.m.b(this.al);
      this.am = new fzo(this.m.ag);
      this.ai.a(this.am);
      this.N = new fyh(this.ai);
      this.ai.a(this.N);
      this.az = new fzh(this.N, $$1.toPath().resolve("skins"), this.ax, this);
      this.ad = new ebv($$2.resolve("saves"), $$2.resolve("backups"), this.bw, this.O);
      this.bv = new eqc($$2);
      this.aq = new gcs(this.m);
      this.ai.a(this.aq);
      this.at = new fzi(this.W);
      this.ai.a(this.at);
      this.ar = new gcn(this);
      this.as = new eup(this.N);
      this.h = this.as.a();
      this.i = this.as.b();
      this.ai.a(this.as);
      this.b(this.i());
      this.ai.a(new fzb());
      this.ai.a(new fza());
      this.Q.a("Startup");
      RenderSystem.setupDefaultState(0, 0, this.Q.k(), this.Q.l());
      this.Q.a("Post startup");
      this.an = ero.a();
      this.ao = ers.a(this.an);
      this.aA = new gan(this.N, this.an, this.m.y().c());
      this.ai.a(this.aA);
      this.aI = new fhf();
      this.ai.a(this.aI);
      this.aJ = new fpf(this.h, this.aI, this::am, this::ap, this::an);
      this.ai.a(this.aJ);
      fmt $$8 = new fmt(this.aJ, this.aI);
      this.ai.a($$8);
      this.U = new fth(this, this.N, this.aA, this.ao, $$8);
      this.ai.a(this.U);
      this.S = new fnm();
      this.aH = new fbx(this, this.ay);
      this.aB = new fnz(this.aA.b(), $$8, this.an);
      this.ai.a(this.aB);
      this.T = new fsh(this, this.N, this.U, this.aB, this.h, this.m, this.aI);
      this.ai.a(this.T);
      this.j = new fmz(this, this.T.d(), this.ai, this.S);
      this.ai.a(this.j.e());
      this.f = new fne(this, this.T, this.aJ, this.S);
      this.ai.a(this.f);
      this.be();
      this.ai.a(this.V);
      this.g = new fky(this.s, this.N);
      this.ai.a(this.g);
      this.aC = new fzf(this.N);
      this.ai.a(this.aC);
      this.aD = new fze(this.N);
      this.ai.a(this.aD);
      this.aE = new ery(this.N);
      this.ai.a(this.aE);
      this.au = new fna();
      this.ai.a(this.au);
      this.ai.a(this.av);
      this.l = new erw(this, this.U);
      this.k = new fqp(this);
      elx $$9 = elx.a(this);
      this.aM = new eno($$9);
      RenderSystem.setErrorCallback(this::a);
      if (this.ap.c != this.Q.k() || this.ap.d != this.Q.l()) {
         StringBuilder $$10 = new StringBuilder(
            "Recovering from unsupported resolution ("
               + this.Q.k()
               + "x"
               + this.Q.l()
               + ").\nPlease make sure you have up-to-date drivers (see aka.ms/mcdriver for instructions)."
         );
         if (ejz.b()) {
            $$10.append("\n\nReported GL debug messages:\n").append(String.join("\n", ejz.a()));
         }

         this.Q.a(this.ap.c, this.ap.d);
         TinyFileDialogs.tinyfd_messageBox("Minecraft", $$10.toString(), "ok", "error", false);
      } else if (this.m.V().c() && !this.Q.j()) {
         this.Q.h();
         this.m.V().a(this.Q.j());
      }

      this.Q.a(this.m.J().c());
      this.Q.b(this.m.C().c());
      this.Q.c();
      this.a();
      this.j.a(this.aj.c());
      this.aK = new gcw(this, this.ay, this.W);
      this.aL = fim.a(this.ay, this.W, $$2);
      this.br = new eqv(this);
      this.bs = new eqf(this);
      this.bs.a(this.m.an().c() != eqp.a);
      this.bt = new fiq(this);
      this.bt.a(this.m.w().c());
      this.bu = fjc.a(fja.a(), this.ay);
      exh.a(this);
      List<aly> $$11 = this.al.g();
      this.bn.a(eqx.b.a, $$11);
      ang $$12 = this.ai.a(ac.f(), this, J, $$11);
      gdh.a.a(gdd.C);
      this.a(new exh(this, $$12, $$0x -> ac.a($$0x, this::a, () -> {
            if (aa.aS) {
               this.bg();
            }

            this.bn.a();
            this.bb();
         }), false));
      this.aN = fmq.a($$0.e.b());
      if (this.E()) {
         this.a(ewk.a($$3x -> {
            if ($$3x) {
               ac.i().a("https://aka.ms/mcjavamoderation");
            }

            this.a($$9, $$12, $$0.e);
         }, this.F()));
      } else {
         this.a($$9, $$12, $$0.e);
      }
   }

   private void bb() {
      gdh.a.b(gdd.C);
      gdh.a.b(gdd.z);
      gdh.a.a(this.aK.a());
   }

   private void a(elx $$0, ang $$1, fdd.c $$2) {
      if ($$2.a()) {
         fmp.a(this, $$2, $$1, $$0);
      } else if (this.m.ah) {
         this.a(new ewg(this.m));
      } else {
         this.a(new eya(true));
      }
   }

   private static boolean b(Object $$0) {
      try {
         return Locale.getDefault().getISO3Country().equals($$0);
      } catch (MissingResourceException var2) {
         return false;
      }
   }

   public void c() {
      this.Q.b(this.bc());
   }

   private String bc() {
      StringBuilder $$0 = new StringBuilder("Minecraft");
      if (d().a()) {
         $$0.append("*");
      }

      $$0.append(" ");
      $$0.append(aa.b().c());
      fif $$1 = this.I();
      if ($$1 != null && $$1.l().k()) {
         $$0.append(" - ");
         fin $$2 = this.P();
         if (this.aO != null && !this.aO.p()) {
            $$0.append(fzm.a("title.singleplayer"));
         } else if ($$2 != null && $$2.e()) {
            $$0.append(fzm.a("title.multiplayer.realms"));
         } else if (this.aO == null && ($$2 == null || !$$2.d())) {
            $$0.append(fzm.a("title.multiplayer.other"));
         } else {
            $$0.append(fzm.a("title.multiplayer.lan"));
         }
      }

      return $$0.toString();
   }

   private UserApiService a(YggdrasilAuthenticationService $$0, fdd $$1) {
      try {
         return $$0.createUserApiService($$1.a.a.d());
      } catch (AuthenticationException var4) {
         G.error("Failed to verify authentication", var4);
         return UserApiService.OFFLINE;
      }
   }

   public static arn d() {
      return arn.a("vanilla", ClientBrandRetriever::getClientModName, "Client", eqn.class);
   }

   private void a(Throwable $$0) {
      if (this.al.d().size() > 1) {
         this.a($$0, null);
      } else {
         ac.a($$0);
      }
   }

   public void a(Throwable $$0, @Nullable te $$1) {
      G.info("Caught error loading resourcepacks, removing all selected resourcepacks", $$0);
      this.bn.a($$0);
      this.al.a(Collections.emptyList());
      this.m.i.clear();
      this.m.j.clear();
      this.m.aq();
      this.d(true).thenRun(() -> this.a($$1));
   }

   private void bd() {
      this.a(null);
      if (this.s != null) {
         this.s.U();
         this.y();
      }

      this.a(new eya());
      this.a(null);
   }

   private void a(@Nullable te $$0) {
      euk $$1 = this.ay();
      eui.b($$1, eui.a.d, te.c("resourcePack.load_fail"), $$0);
   }

   public void e() {
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
               bdh $$1 = bdh.a("Renderer");
               boolean $$2 = this.bh();
               this.bi = this.a($$2, $$1);
               this.bi.a();
               this.bm.c();
               this.e(!$$0);
               this.bm.d();
               this.bi.b();
               this.b($$2, $$1);
            } catch (OutOfMemoryError var4) {
               if ($$0) {
                  throw var4;
               }

               this.o();
               this.a(new exo());
               System.gc();
               G.error(LogUtils.FATAL_MARKER, "Out of memory", var4);
               $$0 = true;
            }
         }
      } catch (y var5) {
         this.d(var5.a());
         this.o();
         G.error(LogUtils.FATAL_MARKER, "Reported exception thrown!", var5);
         c(var5.a());
      } catch (Throwable var6) {
         o $$6 = this.d(new o("Unexpected error", var6));
         G.error(LogUtils.FATAL_MARKER, "Unreported exception thrown!", var6);
         this.o();
         c($$6);
      }
   }

   void b(boolean $$0) {
      this.as.a($$0 ? ImmutableMap.of(b, c) : ImmutableMap.of());
   }

   private void be() {
      this.V
         .a(
            gca.a,
            $$0 -> new gbt<>(
                  $$0x -> $$0x.a(null, ckn.a.a.c()).stream().map($$0xx -> n.a($$0xx.getString()).trim()).filter($$0xx -> !$$0xx.isEmpty()),
                  $$0x -> Stream.of(jc.i.b($$0x.d())),
                  $$0
               )
         );
      this.V.a(gca.b, $$0 -> new gbu<>($$0x -> $$0x.f().map(apy::b), $$0));
      this.V
         .a(
            gca.c,
            $$0 -> new gbt<>(
                  $$0x -> $$0x.e()
                        .stream()
                        .flatMap($$1 -> $$1.a($$0x.a()).a(null, ckn.a.a).stream())
                        .map($$0xx -> n.a($$0xx.getString()).trim())
                        .filter($$0xx -> !$$0xx.isEmpty()),
                  $$0x -> $$0x.e().stream().map($$1 -> jc.i.b($$1.a($$0x.a()).d())),
                  $$0
               )
         );
      chd.e().a($$0 -> {
         this.a(gca.a, $$0);
         this.a(gca.b, $$0);
      });
   }

   private void a(int $$0, long $$1) {
      this.m.J().a(false);
      this.m.aq();
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

   public ejt f() {
      return this.ap;
   }

   public String g() {
      return this.aa;
   }

   public String h() {
      return this.ab;
   }

   public void a(o $$0) {
      this.bb = () -> this.d($$0);
   }

   public void b(o $$0) {
      this.bb = () -> $$0;
   }

   public static void c(o $$0) {
      File $$1 = new File(N().p, "crash-reports");
      File $$2 = new File($$1, "crash-" + ac.e() + "-client.txt");
      aer.a($$0.e());
      if ($$0.f() != null) {
         aer.a("#@!@# Game crashed! Crash report saved to: #@!@# " + $$0.f());
         System.exit(-1);
      } else if ($$0.a($$2)) {
         aer.a("#@!@# Game crashed! Crash report saved to: #@!@# " + $$2.getAbsolutePath());
         System.exit(-1);
      } else {
         aer.a("#@?@# Game crashed! Crash report could not be saved. #@?@#");
         System.exit(-2);
      }
   }

   public boolean i() {
      return this.m.L().c();
   }

   public CompletableFuture<Void> j() {
      return this.d(false);
   }

   private CompletableFuture<Void> d(boolean $$0) {
      if (this.bg != null) {
         return this.bg;
      } else {
         CompletableFuture<Void> $$1 = new CompletableFuture<>();
         if (!$$0 && this.aX instanceof exh) {
            this.bg = $$1;
            return $$1;
         } else {
            this.al.a();
            List<aly> $$2 = this.al.g();
            if (!$$0) {
               this.bn.a(eqx.b.b, $$2);
            }

            this.a(new exh(this, this.ai.a(ac.f(), this, J, $$2), $$2x -> ac.a($$2x, $$1xx -> {
                  if ($$0) {
                     this.bd();
                  } else {
                     this.a($$1xx);
                  }
               }, () -> {
                  this.f.f();
                  this.bn.a();
                  $$1.complete(null);
               }), true));
            return $$1;
         }
      }
   }

   private void bg() {
      boolean $$0 = false;
      fny $$1 = this.am().a();
      gah $$2 = $$1.a().a();

      for (csk $$3 : jc.f) {
         UnmodifiableIterator $$10 = $$3.l().a().iterator();

         while ($$10.hasNext()) {
            dey $$4 = (dey)$$10.next();
            if ($$4.l() == cyp.c) {
               gah $$5 = $$1.b($$4);
               if ($$5 == $$2) {
                  G.debug("Missing model for: {}", $$4);
                  $$0 = true;
               }
            }
         }
      }

      fyg $$6 = $$2.e();

      for (csk $$7 : jc.f) {
         UnmodifiableIterator var17 = $$7.l().a().iterator();

         while (var17.hasNext()) {
            dey $$8 = (dey)var17.next();
            fyg $$9 = $$1.a($$8);
            if (!$$8.i() && $$9 == $$6) {
               G.debug("Missing particle icon for: {}", $$8);
            }
         }
      }

      for (cir $$10 : jc.i) {
         ciw $$11 = $$10.ae_();
         String $$12 = $$11.q();
         String $$13 = te.c($$12).getString();
         if ($$13.toLowerCase(Locale.ROOT).equals($$10.a())) {
            G.debug("Missing translation for: {} {} {}", new Object[]{$$11, $$12, $$10});
         }
      }

      $$0 |= exi.a();
      $$0 |= fsk.a();
      if ($$0) {
         throw new IllegalStateException("Your game data is foobar, fix the errors above!");
      }
   }

   public ebv k() {
      return this.ad;
   }

   private void a(String $$0) {
      eqn.a $$1 = this.G();
      if (!$$1.a(this.Q())) {
         if (this.l.b()) {
            this.l.b(false);
            this.a(new ewn($$0x -> {
               if ($$0x) {
                  ac.i().a("https://aka.ms/JavaAccountSettings");
               }

               this.a(null);
            }, eqn.a.e, "https://aka.ms/JavaAccountSettings", true));
         } else {
            te $$2 = $$1.a();
            this.l.a($$2, false);
            this.bs.c($$2);
            this.l.b($$1 == eqn.a.d);
         }
      } else {
         this.a(new ewm($$0));
      }
   }

   public void a(@Nullable exv $$0) {
      if (aa.aS && Thread.currentThread() != this.aZ) {
         G.error("setScreen called from non-game thread");
      }

      if (this.z != null) {
         this.z.h();
      }

      if ($$0 == null && this.s == null) {
         $$0 = new eya();
      } else if ($$0 == null && this.t.eu()) {
         if (this.t.o()) {
            $$0 = new ewu(null, this.s.k().n());
         } else {
            this.t.fO();
         }
      }

      this.z = $$0;
      if (this.z != null) {
         this.z.av_();
      }

      eld.a();
      if ($$0 != null) {
         this.n.j();
         eql.b();
         $$0.b(this, this.Q.o(), this.Q.p());
         this.y = false;
      } else {
         this.aq.g();
         this.n.i();
      }

      this.c();
   }

   public void a(@Nullable exp $$0) {
      this.aX = $$0;
   }

   public void l() {
      try {
         G.info("Stopping!");

         try {
            this.bs.c();
         } catch (Throwable var7) {
         }

         try {
            if (this.s != null) {
               this.s.U();
            }

            this.y();
         } catch (Throwable var6) {
         }

         if (this.z != null) {
            this.z.h();
         }

         this.close();
      } finally {
         ac.a = System::nanoTime;
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
         G.error("Shutdown failure!", var5);
         throw var5;
      } finally {
         this.P.close();
         this.Q.close();
      }
   }

   private void e(boolean $$0) {
      this.Q.a("Pre render");
      long $$1 = ac.c();
      if (this.Q.b()) {
         this.p();
      }

      if (this.bg != null && !(this.aX instanceof exh)) {
         CompletableFuture<Void> $$2 = this.bg;
         this.bg = null;
         this.j().thenRun(() -> $$2.complete(null));
      }

      Runnable $$3;
      while (($$3 = this.bf.poll()) != null) {
         $$3.run();
      }

      if ($$0) {
         int $$4 = this.R.a(ac.b());
         this.bi.a("scheduledExecutables");
         this.bq();
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
      if (!this.m.aa && !this.bm.e()) {
         $$8 = false;
         this.bp = 0.0;
      } else {
         $$8 = this.bq == null || this.bq.b();
         if ($$8) {
            ela.a().ifPresent(ela::b);
         }
      }

      RenderSystem.clear(16640, a);
      this.ap.a(true);
      fmy.a();
      this.bi.a("display");
      RenderSystem.enableCull();
      this.bi.c();
      if (!this.y) {
         this.bi.b("gameRenderer");
         this.j.a(this.aS ? this.aT : this.R.a, $$1, $$0);
         this.bi.c();
      }

      if (this.bl != null) {
         this.bi.a("fpsPie");
         erx $$9 = new erx(this, this.S.b());
         this.a($$9, this.bl);
         $$9.e();
         this.bi.c();
      }

      this.bi.a("blit");
      this.ap.e();
      this.ap.a(this.Q.k(), this.Q.l());
      this.bd = ac.c() - $$6;
      if ($$8) {
         ela.a().ifPresent($$0x -> this.bq = $$0x.c());
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
      boolean $$11 = this.R() && (this.z != null && this.z.j() || this.aX != null && this.aX.a()) && !this.aO.p();
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

      this.q.a($$13);
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
         this.A = String.format(
            Locale.ROOT,
            "%d fps T: %s%s%s%s B: %d%s",
            bc,
            $$10 == 260 ? "inf" : $$10,
            this.m.J().c() ? " vsync" : "",
            this.m.i().c(),
            this.m.h().c() == eqb.a ? "" : (this.m.h().c() == eqb.b ? " fast-clouds" : " fancy-clouds"),
            this.m.A().c(),
            $$14
         );
         this.aV += 1000L;
         this.aW = 0;
      }

      this.bi.c();
   }

   private boolean bh() {
      return this.m.aa && this.m.ab && !this.m.Z;
   }

   private bde a(boolean $$0, @Nullable bdh $$1) {
      if (!$$0) {
         this.bk.b();
         if (!this.bm.e() && $$1 == null) {
            return bdb.a;
         }
      }

      bde $$2;
      if ($$0) {
         if (!this.bk.a()) {
            this.bj = 0;
            this.bk.c();
         }

         this.bj++;
         $$2 = this.bk.d();
      } else {
         $$2 = bdb.a;
      }

      if (this.bm.e()) {
         $$2 = bde.a($$2, this.bm.f());
      }

      return bdh.a($$2, $$1);
   }

   private void b(boolean $$0, @Nullable bdh $$1) {
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
      int $$0 = this.Q.a(this.m.al().c(), this.i());
      this.Q.a((double)$$0);
      if (this.z != null) {
         this.z.a(this, this.Q.o(), this.Q.p());
      }

      ejt $$1 = this.f();
      $$1.a(this.Q.k(), this.Q.l(), a);
      this.j.a(this.Q.k(), this.Q.l());
      this.n.g();
   }

   @Override
   public void b() {
      this.n.k();
   }

   public int m() {
      return bc;
   }

   public long n() {
      return this.bd;
   }

   private int bi() {
      return this.s != null || this.z == null && this.aX == null ? this.Q.d() : 60;
   }

   public void o() {
      try {
         arm.b();
         this.f.p();
      } catch (Throwable var3) {
      }

      try {
         System.gc();
         if (this.aQ && this.aO != null) {
            this.aO.a(true);
         }

         this.b((exv)(new exb(te.c("menu.savingLevel"))));
      } catch (Throwable var2) {
      }

      System.gc();
   }

   public boolean a(Consumer<te> $$0) {
      if (this.bm.e()) {
         this.bj();
         return false;
      } else {
         Consumer<bdd> $$1 = $$1x -> {
            if ($$1x != bcz.a) {
               int $$2x = $$1x.f();
               double $$3x = (double)$$1x.g() / (double)ask.a;
               this.execute(
                  () -> $$0.accept(
                        te.a("commands.debug.stopped", String.format(Locale.ROOT, "%.2f", $$3x), $$2x, String.format(Locale.ROOT, "%.2f", (double)$$2x / $$3x))
                     )
               );
            }
         };
         Consumer<Path> $$2 = $$1x -> {
            te $$2x = te.b($$1x.toString()).a(n.t).a($$1xx -> $$1xx.a(new tc(tc.a.b, $$1x.toFile().getParent())));
            this.execute(() -> $$0.accept(te.a("debug.profiling.stop", $$2x)));
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

         this.bm = beo.a(new fmn(ac.a, this.f), ac.a, ac.g(), new beu("client"), $$1x -> {
            this.bm = bep.a;
            $$1.accept($$1x);
         }, $$5);
         return true;
      }
   }

   private void bj() {
      this.bm.a();
      if (this.aO != null) {
         this.aO.aQ();
      }
   }

   private void bk() {
      this.bm.b();
      if (this.aO != null) {
         this.aO.aR();
      }
   }

   private Path a(ab $$0, List<Path> $$1) {
      String $$2;
      if (this.Q()) {
         $$2 = this.S().aU().g();
      } else {
         fin $$3 = this.P();
         $$2 = $$3 != null ? $$3.a : "unknown";
      }

      Path $$7;
      try {
         String $$5 = String.format(Locale.ROOT, "%s-%s-%s", ac.e(), $$2, aa.b().b());
         String $$6 = v.a(beu.a, $$5, ".zip");
         $$7 = beu.a.resolve($$6);
      } catch (IOException var21) {
         throw new UncheckedIOException(var21);
      }

      try (aqz $$10 = new aqz($$7)) {
         $$10.a(Paths.get("system.txt"), $$0.a());
         $$10.a(Paths.get("client").resolve(this.m.av().getName()), this.m.aw());
         $$1.forEach($$10::a);
      } finally {
         for (Path $$13 : $$1) {
            try {
               FileUtils.forceDelete($$13.toFile());
            } catch (IOException var18) {
               G.warn("Failed to delete temporary profiling result {}", $$13, var18);
            }
         }
      }

      return $$7;
   }

   public void a(int $$0) {
      if (this.bl != null) {
         List<bdg> $$1 = this.bl.a(this.bx);
         if (!$$1.isEmpty()) {
            bdg $$2 = $$1.remove(0);
            if ($$0 == 0) {
               if (!$$2.d.isEmpty()) {
                  int $$3 = this.bx.lastIndexOf(30);
                  if ($$3 >= 0) {
                     this.bx = this.bx.substring(0, $$3);
                  }
               }
            } else {
               $$0--;
               if ($$0 < $$1.size() && !"unspecified".equals($$1.get($$0).d)) {
                  if (!this.bx.isEmpty()) {
                     this.bx = this.bx + "\u001e";
                  }

                  this.bx = this.bx + $$1.get($$0).d;
               }
            }
         }
      }
   }

   private void a(erx $$0, bdd $$1) {
      List<bdg> $$2 = $$1.a(this.bx);
      bdg $$3 = $$2.remove(0);
      RenderSystem.clear(256, a);
      RenderSystem.setShader(fmz::q);
      Matrix4f $$4 = new Matrix4f().setOrtho(0.0F, (float)this.Q.k(), (float)this.Q.l(), 0.0F, 1000.0F, 3000.0F);
      RenderSystem.setProjectionMatrix($$4, elp.b);
      elh $$5 = RenderSystem.getModelViewStack();
      $$5.a();
      $$5.e();
      $$5.a(0.0F, 0.0F, -2000.0F);
      RenderSystem.applyModelViewMatrix();
      RenderSystem.lineWidth(1.0F);
      elj $$6 = elj.a();
      elc $$7 = $$6.c();
      int $$8 = 160;
      int $$9 = this.Q.k() - 160 - 10;
      int $$10 = this.Q.l() - 320;
      RenderSystem.enableBlend();
      $$7.a(elm.b.h, elf.n);
      $$7.a((double)((float)$$9 - 176.0F), (double)((float)$$10 - 96.0F - 16.0F), 0.0).a(200, 0, 0, 0).e();
      $$7.a((double)((float)$$9 - 176.0F), (double)($$10 + 320), 0.0).a(200, 0, 0, 0).e();
      $$7.a((double)((float)$$9 + 176.0F), (double)($$10 + 320), 0.0).a(200, 0, 0, 0).e();
      $$7.a((double)((float)$$9 + 176.0F), (double)((float)$$10 - 96.0F - 16.0F), 0.0).a(200, 0, 0, 0).e();
      $$6.b();
      RenderSystem.disableBlend();
      double $$11 = 0.0;

      for (bdg $$12 : $$2) {
         int $$13 = aro.a($$12.a / 4.0) + 1;
         $$7.a(elm.b.g, elf.n);
         int $$14 = $$12.a();
         int $$15 = $$14 >> 16 & 0xFF;
         int $$16 = $$14 >> 8 & 0xFF;
         int $$17 = $$14 & 0xFF;
         $$7.a((double)$$9, (double)$$10, 0.0).a($$15, $$16, $$17, 255).e();

         for (int $$18 = $$13; $$18 >= 0; $$18--) {
            float $$19 = (float)(($$11 + $$12.a * (double)$$18 / (double)$$13) * (float) (Math.PI * 2) / 100.0);
            float $$20 = aro.a($$19) * 160.0F;
            float $$21 = aro.b($$19) * 160.0F * 0.5F;
            $$7.a((double)((float)$$9 + $$20), (double)((float)$$10 - $$21), 0.0).a($$15, $$16, $$17, 255).e();
         }

         $$6.b();
         $$7.a(elm.b.f, elf.n);

         for (int $$22 = $$13; $$22 >= 0; $$22--) {
            float $$23 = (float)(($$11 + $$12.a * (double)$$22 / (double)$$13) * (float) (Math.PI * 2) / 100.0);
            float $$24 = aro.a($$23) * 160.0F;
            float $$25 = aro.b($$23) * 160.0F * 0.5F;
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
      String $$27 = bdd.b($$3.d);
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
         bdg $$31 = $$2.get($$30);
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
      if (this.z == null) {
         boolean $$1 = this.R() && !this.aO.p();
         if ($$1) {
            this.a(new exq(!$$0));
            this.aq.d();
         } else {
            this.a(new exq(true));
         }
      }
   }

   private void f(boolean $$0) {
      if (!$$0) {
         this.x = 0;
      }

      if (this.x <= 0 && !this.t.fl()) {
         if ($$0 && this.w != null && this.w.c() == ehd.a.b) {
            ehb $$1 = (ehb)this.w;
            gv $$2 = $$1.a();
            if (!this.s.a_($$2).i()) {
               hb $$3 = $$1.b();
               if (this.r.b($$2, $$3)) {
                  this.g.a($$2, $$3);
                  this.t.a(bgn.a);
               }
            }
         } else {
            this.r.b();
         }
      }
   }

   private boolean bt() {
      if (this.x > 0) {
         return false;
      } else if (this.w == null) {
         G.error("Null returned as 'hitResult', this shouldn't happen!");
         if (this.r.f()) {
            this.x = 10;
         }

         return false;
      } else if (this.t.x()) {
         return false;
      } else {
         ciw $$0 = this.t.b(bgn.a);
         if (!$$0.a(this.s.G())) {
            return false;
         } else {
            boolean $$1 = false;
            switch (this.w.c()) {
               case c:
                  this.r.a(this.t, ((ehc)this.w).a());
                  break;
               case b:
                  ehb $$2 = (ehb)this.w;
                  gv $$3 = $$2.a();
                  if (!this.s.a_($$3).i()) {
                     this.r.a($$3, $$2.b());
                     if (this.s.a_($$3).i()) {
                        $$1 = true;
                     }
                     break;
                  }
               case a:
                  if (this.r.f()) {
                     this.x = 10;
                  }

                  this.t.gk();
            }

            this.t.a(bgn.a);
            return $$1;
         }
      }
   }

   private void bu() {
      if (!this.r.m()) {
         this.aR = 4;
         if (!this.t.x()) {
            if (this.w == null) {
               G.warn("Null returned as 'hitResult', this shouldn't happen!");
            }

            for (bgn $$0 : bgn.values()) {
               ciw $$1 = this.t.b($$0);
               if (!$$1.a(this.s.G())) {
                  return;
               }

               if (this.w != null) {
                  switch (this.w.c()) {
                     case c:
                        ehc $$2 = (ehc)this.w;
                        big $$3 = $$2.a();
                        if (!this.s.w_().a($$3.dk())) {
                           return;
                        }

                        bgo $$4 = this.r.a(this.t, $$3, $$2, $$0);
                        if (!$$4.a()) {
                           $$4 = this.r.a(this.t, $$3, $$0);
                        }

                        if ($$4.a()) {
                           if ($$4.b()) {
                              this.t.a($$0);
                           }

                           return;
                        }
                        break;
                     case b:
                        ehb $$5 = (ehb)this.w;
                        int $$6 = $$1.L();
                        bgo $$7 = this.r.a(this.t, $$0, $$5);
                        if ($$7.a()) {
                           if ($$7.b()) {
                              this.t.a($$0);
                              if (!$$1.b() && ($$1.L() != $$6 || this.r.g())) {
                                 this.j.b.a($$0);
                              }
                           }

                           return;
                        }

                        if ($$7 == bgo.e) {
                           return;
                        }
                  }
               }

               if (!$$1.b()) {
                  bgo $$8 = this.r.a(this.t, $$0);
                  if ($$8.a()) {
                     if ($$8.b()) {
                        this.t.a($$0);
                     }

                     this.j.b.a($$0);
                     return;
                  }
               }
            }
         }
      }
   }

   public gcn r() {
      return this.ar;
   }

   public void s() {
      if (this.aR > 0) {
         this.aR--;
      }

      this.bi.a("gui");
      this.bt.a();
      this.l.a(this.aS);
      this.bi.c();
      this.j.a(1.0F);
      this.aG.a(this.s, this.w);
      this.bi.a("gameMode");
      if (!this.aS && this.s != null) {
         this.r.d();
      }

      this.bi.b("textures");
      this.N.e();
      if (this.z != null || this.t == null) {
         if (this.z instanceof exd $$0 && !this.t.fB()) {
            $$0.k();
         }
      } else if (this.t.eu() && !(this.z instanceof ewu)) {
         this.a(null);
      } else if (this.t.fB() && this.s != null) {
         this.a(new exd());
      }

      if (this.z != null) {
         this.x = 10000;
      }

      if (this.z != null) {
         exv.a(() -> this.z.c(), "Ticking screen", this.z.getClass().getCanonicalName());
      }

      if (!this.m.aa) {
         this.l.k();
      }

      if (this.aX == null && this.z == null) {
         this.bi.b("Keybindings");
         this.bw();
         if (this.x > 0) {
            this.x--;
         }
      }

      if (this.s != null) {
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
            this.s.f();
         }
      } else if (this.j.g() != null) {
         this.j.b();
      }

      if (!this.aS) {
         this.ar.a();
      }

      this.aq.a(this.aS);
      if (this.s != null) {
         if (!this.aS) {
            if (!this.m.s && this.bv()) {
               te $$1 = te.c("tutorial.socialInteractions.title");
               te $$2 = te.a("tutorial.socialInteractions.description", gdv.a("socialInteractions"));
               this.bh = new eul(eul.a.f, $$1, $$2, true);
               this.aG.a(this.bh, 160);
               this.m.s = true;
               this.m.aq();
            }

            this.aG.d();

            try {
               this.s.a(() -> true);
            } catch (Throwable var4) {
               o $$4 = o.a(var4, "Exception in world tick");
               if (this.s == null) {
                  p $$5 = $$4.a("Affected level");
                  $$5.a("Problem", "Level is null!");
               } else {
                  this.s.a($$4);
               }

               throw new y($$4);
            }
         }

         this.bi.b("animateTick");
         if (!this.aS && this.s != null) {
            this.s.b(this.t.do(), this.t.dq(), this.t.du());
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

   private boolean bv() {
      return !this.aQ || this.aO != null && this.aO.p();
   }

   private void bw() {
      while (this.m.P.g()) {
         epz $$0 = this.m.au();
         this.m.a(this.m.au().c());
         if ($$0.a() != this.m.au().a()) {
            this.j.a(this.m.au().a() ? this.al() : null);
         }

         this.f.r();
      }

      while (this.m.Q.g()) {
         this.m.ae = !this.m.ae;
      }

      for (int $$1 = 0; $$1 < 9; $$1++) {
         boolean $$2 = this.m.V.e();
         boolean $$3 = this.m.W.e();
         if (this.m.U[$$1].g()) {
            if (this.t.G_()) {
               this.l.g().a($$1);
            } else if (!this.t.f() || this.z != null || !$$3 && !$$2) {
               this.t.fQ().l = $$1;
            } else {
               ezh.a(this, $$1, $$3, $$2);
            }
         }
      }

      while (this.m.N.g()) {
         if (!this.bv()) {
            this.t.a(K, true);
            this.bs.c(K);
         } else {
            if (this.bh != null) {
               this.aG.a(this.bh);
               this.bh = null;
            }

            this.a(new fbz());
         }
      }

      while (this.m.E.g()) {
         if (this.r.i()) {
            this.t.i();
         } else {
            this.aG.a();
            this.a(new ezs(this.t));
         }
      }

      while (this.m.T.g()) {
         this.a(new eyk(this.t.cl.q()));
      }

      while (this.m.F.g()) {
         if (!this.t.G_()) {
            this.I().b(new abx(abx.a.g, gv.b, hb.a));
         }
      }

      while (this.m.G.g()) {
         if (!this.t.G_() && this.t.a(exv.p())) {
            this.t.a(bgn.a);
         }
      }

      while (this.m.K.g()) {
         this.a("");
      }

      if (this.z == null && this.aX == null && this.m.M.g()) {
         this.a("/");
      }

      boolean $$4 = false;
      if (this.t.fl()) {
         if (!this.m.H.e()) {
            this.r.b(this.t);
         }

         while (this.m.I.g()) {
         }

         while (this.m.H.g()) {
         }

         while (this.m.J.g()) {
         }
      } else {
         while (this.m.I.g()) {
            $$4 |= this.bt();
         }

         while (this.m.H.g()) {
            this.bu();
         }

         while (this.m.J.g()) {
            this.bx();
         }
      }

      if (this.m.H.e() && this.aR == 0 && !this.t.fl()) {
         this.bu();
      }

      this.f(this.z == null && !$$4 && this.m.I.e() && this.n.h());
   }

   public gcw t() {
      return this.aK;
   }

   public double u() {
      return this.bp;
   }

   public fim v() {
      return this.aL;
   }

   public fcp w() {
      return new fcp(this, this.ad);
   }

   public void a(String $$0, ebv.c $$1, amv $$2, afk $$3, boolean $$4) {
      this.y();
      this.X.set(null);
      Instant $$5 = Instant.now();

      try {
         $$1.a($$3.c().a(), $$3.d());
         afh $$6 = afh.a(this.aw, this.p);
         $$6.e().a(this);
         ddu.a($$6, this);
         ant.a(false);
         this.aO = MinecraftServer.a((Function<Thread, gcf>)($$4x -> new gcf($$4x, this, $$1, $$2, $$3, $$6, $$0xx -> {
               akv $$1xx = new akv($$0xx + 0);
               this.X.set($$1xx);
               return aku.a($$1xx, this.bf::add);
            })));
         this.aQ = true;
         this.a(fja.a());
         this.aN.a(fmq.c.a, $$0, $$3.d().g());
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

      exf $$10 = new exf(this.X.get());
      this.a($$10);
      this.bi.a("waitForServer");

      while (!this.aO.ae()) {
         $$10.c();
         this.e(false);

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
      sf $$13 = sf.a($$12);
      $$13.a($$12.toString(), 0, new fid($$13, this, null, null, $$4, $$11, $$0x -> {
      }));
      $$13.a(new adf(this.U().c(), this.U().b()));
      this.aP = $$13;
   }

   public void a(fie $$0) {
      ext $$1 = new ext(true);
      $$1.a(te.c("connect.joining"));
      this.e($$1);
      this.s = $$0;
      this.b($$0);
      if (!this.aQ) {
         afh $$2 = afh.a(this.aw, this.p);
         $$2.e().a(this);
         ddu.a($$2, this);
         ant.a(false);
      }
   }

   public void y() {
      this.b((exv)(new ext(true)));
   }

   public void b(exv $$0) {
      fif $$1 = this.I();
      if ($$1 != null) {
         this.bp();
         $$1.j();
      }

      this.aH.b();
      if (this.bm.e()) {
         this.bk();
      }

      gcf $$2 = this.aO;
      this.aO = null;
      this.j.i();
      this.r = null;
      this.bs.b();
      this.e($$0);
      if (this.s != null) {
         if ($$2 != null) {
            this.bi.a("waitForServer");

            while (!$$2.C()) {
               this.e(false);
            }

            this.bi.c();
         }

         this.ak.a();
         this.l.i();
         this.aQ = false;
      }

      this.s = null;
      this.b(null);
      this.t = null;
      ddu.c();
   }

   public void c(exv $$0) {
      if (this.bm.e()) {
         this.bk();
      }

      this.j.i();
      this.r = null;
      this.bs.b();
      this.e($$0);
      this.l.i();
      this.ak.a();
      this.s = null;
      this.b(null);
      this.t = null;
      ddu.c();
   }

   private void e(exv $$0) {
      this.bi.a("forcedTick");
      this.aq.e();
      this.u = null;
      this.aP = null;
      this.a($$0);
      this.e(false);
      this.bi.c();
   }

   public void d(exv $$0) {
      this.bi.a("forcedTick");
      this.a($$0);
      this.e(false);
      this.bi.c();
   }

   private void b(@Nullable fie $$0) {
      this.f.a($$0);
      this.g.a($$0);
      this.aJ.a($$0);
      this.c();
   }

   public boolean z() {
      return this.A() && this.m.ad().c();
   }

   public boolean A() {
      return this.B() && this.ay.properties().flag(UserFlag.OPTIONAL_TELEMETRY_AVAILABLE);
   }

   public boolean B() {
      return this.ay.properties().flag(UserFlag.TELEMETRY_ENABLED);
   }

   public boolean C() {
      return this.ag && this.ay.properties().flag(UserFlag.SERVERS_ALLOWED) && this.F() == null;
   }

   public boolean D() {
      return this.ay.properties().flag(UserFlag.REALMS_ALLOWED) && this.F() == null;
   }

   public boolean E() {
      return this.F() != null;
   }

   @Nullable
   public BanDetails F() {
      return (BanDetails)this.ay.properties().bannedScopes().get("MULTIPLAYER");
   }

   public boolean a(UUID $$0) {
      return this.G().a(false) ? this.aH.c($$0) : (this.t == null || !$$0.equals(this.t.cv())) && !$$0.equals(ac.c);
   }

   public eqn.a G() {
      if (this.m.l().c() == cbj.c) {
         return eqn.a.b;
      } else if (!this.ah) {
         return eqn.a.c;
      } else {
         return !this.ay.properties().flag(UserFlag.CHAT_ALLOWED) ? eqn.a.d : eqn.a.a;
      }
   }

   public final boolean H() {
      return this.af;
   }

   @Nullable
   public fif I() {
      return this.t == null ? null : this.t.cl;
   }

   public static boolean J() {
      return !F.m.Z;
   }

   public static boolean K() {
      return F.m.i().c().a() >= eqg.b.a();
   }

   public static boolean L() {
      return !F.j.a() && F.m.i().c().a() >= eqg.c.a();
   }

   public static boolean M() {
      return F.m.j().c();
   }

   private void bx() {
      if (this.w != null && this.w.c() != ehd.a.a) {
         boolean $$0 = this.t.fR().d;
         dck $$1 = null;
         ehd.a $$2 = this.w.c();
         ciw $$6;
         if ($$2 == ehd.a.b) {
            gv $$3 = ((ehb)this.w).a();
            dey $$4 = this.s.a_($$3);
            if ($$4.i()) {
               return;
            }

            csk $$5 = $$4.b();
            $$6 = $$5.a((coq)this.s, $$3, $$4);
            if ($$6.b()) {
               return;
            }

            if ($$0 && exv.p() && $$4.t()) {
               $$1 = this.s.c_($$3);
            }
         } else {
            if ($$2 != ehd.a.c || !$$0) {
               return;
            }

            big $$7 = ((ehc)this.w).a();
            $$6 = $$7.dx();
            if ($$6 == null) {
               return;
            }
         }

         if ($$6.b()) {
            String $$10 = "";
            if ($$2 == ehd.a.b) {
               $$10 = jc.f.b(this.s.a_(((ehb)this.w).a()).b()).toString();
            } else if ($$2 == ehd.a.c) {
               $$10 = jc.h.b(((ehc)this.w).a().ag()).toString();
            }

            G.warn("Picking on: [{}] {} gave null item", $$2, $$10);
         } else {
            cbk $$11 = this.t.fQ();
            if ($$1 != null) {
               this.a($$6, $$1);
            }

            int $$12 = $$11.b($$6);
            if ($$0) {
               $$11.a($$6);
               this.r.a(this.t.b(bgn.a), 36 + $$11.l);
            } else if ($$12 != -1) {
               if (cbk.d($$12)) {
                  $$11.l = $$12;
               } else {
                  this.r.a($$12);
               }
            }
         }
      }
   }

   private void a(ciw $$0, dck $$1) {
      qs $$2 = $$1.m();
      cgp.a($$0, $$1.u(), $$2);
      if ($$0.d() instanceof cjk && $$2.e("SkullOwner")) {
         qs $$3 = $$2.p("SkullOwner");
         qs $$4 = $$0.w();
         $$4.a("SkullOwner", $$3);
         qs $$5 = $$4.p("BlockEntityTag");
         $$5.r("SkullOwner");
         $$5.r("x");
         $$5.r("y");
         $$5.r("z");
      } else {
         qs $$6 = new qs();
         qy $$7 = new qy();
         $$7.add(rj.a("\"(+NBT)\""));
         $$6.a("Lore", $$7);
         $$0.a("display", $$6);
      }
   }

   public o d(o $$0) {
      ab $$1 = $$0.g();
      a($$1, this, this.am, this.aa, this.m);
      if (this.s != null) {
         this.s.a($$0);
      }

      if (this.aO != null) {
         this.aO.b($$1);
      }

      this.bn.a($$0);
      return $$0;
   }

   public static void a(@Nullable eqn $$0, @Nullable fzo $$1, String $$2, @Nullable eqr $$3, o $$4) {
      ab $$5 = $$4.g();
      a($$5, $$0, $$1, $$2, $$3);
   }

   private static ab a(ab $$0, @Nullable eqn $$1, @Nullable fzo $$2, String $$3, eqr $$4) {
      $$0.a("Launched Version", () -> $$3);
      $$0.a("Backend library", RenderSystem::getBackendDescription);
      $$0.a("Backend API", RenderSystem::getApiDescription);
      $$0.a("Window size", () -> $$1 != null ? $$1.Q.k() + "x" + $$1.Q.l() : "<not initialized>");
      $$0.a("GL Caps", RenderSystem::getCapsString);
      $$0.a("GL debug messages", () -> ejz.b() ? String.join("\n", ejz.a()) : "<disabled>");
      $$0.a("Using VBOs", () -> "Yes");
      $$0.a("Is Modded", () -> d().b());
      $$0.a("Type", "Client (map_client.txt)");
      if ($$4 != null) {
         if (F != null) {
            String $$5 = F.ag().m();
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

      $$0.a("CPU", eka::b);
      return $$0;
   }

   public static eqn N() {
      return F;
   }

   public CompletableFuture<Void> O() {
      return this.a(this::j).thenCompose($$0 -> (CompletionStage<Void>)$$0);
   }

   public void a(fja $$0) {
      if (!this.bu.a($$0)) {
         this.bu = fjc.a($$0, this.ay);
      }
   }

   @Nullable
   public fin P() {
      return x.a(this.I(), fif::w);
   }

   public boolean Q() {
      return this.aQ;
   }

   public boolean R() {
      return this.aQ && this.aO != null;
   }

   @Nullable
   public gcf S() {
      return this.aO;
   }

   public boolean T() {
      gcf $$0 = this.S();
      return $$0 != null && !$$0.p();
   }

   public boolean b(UUID $$0) {
      return $$0.equals(this.U().b());
   }

   public erc U() {
      return this.W;
   }

   public PropertyMap V() {
      if (this.M.isEmpty()) {
         GameProfile $$0 = this.aj().fetchProfile(this.W.b(), false);
         if ($$0 != null) {
            this.M.putAll($$0.getProperties());
         }
      }

      return this.M;
   }

   public Proxy W() {
      return this.ac;
   }

   public fyh X() {
      return this.N;
   }

   public ank Y() {
      return this.ai;
   }

   public amv Z() {
      return this.al;
   }

   public amb aa() {
      return this.aj;
   }

   public fyz ab() {
      return this.ak;
   }

   public Path ac() {
      return this.L;
   }

   public fzo ad() {
      return this.am;
   }

   public Function<aep, fyg> a(aep $$0) {
      return this.aA.a($$0)::a;
   }

   public boolean ae() {
      return this.ae;
   }

   public boolean af() {
      return this.aS;
   }

   public fna ag() {
      return this.au;
   }

   public gcs ah() {
      return this.aq;
   }

   public aor ai() {
      aor $$0 = x.a(this.z, exv::A);
      if ($$0 != null) {
         return $$0;
      } else if (this.t != null) {
         if (this.t.dK().ac() == cpk.j) {
            return this.l.j().b() ? aos.d : aos.e;
         } else {
            hf<cqi> $$1 = this.t.dK().s(this.t.dk());
            if (!this.ar.c(aos.f) && (!this.t.bc() || !$$1.a(api.Y))) {
               return this.t.dK().ac() != cpk.i && this.t.fR().d && this.t.fR().c ? aos.b : $$1.a().o().orElse(aos.g);
            } else {
               return aos.f;
            }
         }
      } else {
         return aos.a;
      }
   }

   public MinecraftSessionService aj() {
      return this.ax;
   }

   public fzh ak() {
      return this.az;
   }

   @Nullable
   public big al() {
      return this.u;
   }

   public void a(big $$0) {
      this.u = $$0;
      this.j.a($$0);
   }

   public boolean b(big $$0) {
      return $$0.cc() || this.t != null && this.t.G_() && this.m.S.e() && $$0.ag() == bik.bt;
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

   public fnz am() {
      return this.aB;
   }

   public fsh an() {
      return this.T;
   }

   public fpf ao() {
      return this.aJ;
   }

   public fth ap() {
      return this.U;
   }

   public <T> gcb<T> a(gca.a<T> $$0) {
      return this.V.a($$0);
   }

   public <T> void a(gca.a<T> $$0, List<T> $$1) {
      this.V.a($$0, $$1);
   }

   public arc aq() {
      return this.q;
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

   public ero aw() {
      return this.an;
   }

   public boolean ax() {
      return this.t != null && this.t.gg() || this.m.Q().c();
   }

   public euk ay() {
      return this.aF;
   }

   public gdv az() {
      return this.aG;
   }

   public boolean aA() {
      return this.be;
   }

   public eqj aB() {
      return this.Y;
   }

   public gan aC() {
      return this.aA;
   }

   public fzf aD() {
      return this.aC;
   }

   public fze aE() {
      return this.aD;
   }

   public ery aF() {
      return this.aE;
   }

   @Override
   public void a(boolean $$0) {
      this.be = $$0;
   }

   public te a(File $$0, int $$1, int $$2) {
      int $$3 = this.Q.k();
      int $$4 = this.Q.l();
      ejt $$5 = new eju($$1, $$2, true, a);
      float $$6 = this.t.dC();
      float $$7 = this.t.dA();
      float $$8 = this.t.O;
      float $$9 = this.t.N;
      this.j.b(false);

      tr var12;
      try {
         this.j.c(true);
         this.f.e();
         this.Q.b($$1);
         this.Q.c($$2);

         for (int $$10 = 0; $$10 < 6; $$10++) {
            switch ($$10) {
               case 0:
                  this.t.r($$7);
                  this.t.s(0.0F);
                  break;
               case 1:
                  this.t.r(($$7 + 90.0F) % 360.0F);
                  this.t.s(0.0F);
                  break;
               case 2:
                  this.t.r(($$7 + 180.0F) % 360.0F);
                  this.t.s(0.0F);
                  break;
               case 3:
                  this.t.r(($$7 - 90.0F) % 360.0F);
                  this.t.s(0.0F);
                  break;
               case 4:
                  this.t.r($$7);
                  this.t.s(-90.0F);
                  break;
               case 5:
               default:
                  this.t.r($$7);
                  this.t.s(90.0F);
            }

            this.t.N = this.t.dA();
            this.t.O = this.t.dC();
            $$5.a(true);
            this.j.a(1.0F, 0L, new elh());

            try {
               Thread.sleep(10L);
            } catch (InterruptedException var17) {
            }

            eqy.a($$0, "panorama_" + $$10 + ".png", $$5, $$0x -> {
            });
         }

         te $$11 = te.b($$0.getName()).a(n.t).a($$1x -> $$1x.a(new tc(tc.a.b, $$0.getAbsolutePath())));
         return te.a("screenshot.success", $$11);
      } catch (Exception var18) {
         G.error("Couldn't save image", var18);
         var12 = te.a("screenshot.failure", var18.getMessage());
      } finally {
         this.t.s($$6);
         this.t.r($$7);
         this.t.O = $$8;
         this.t.N = $$9;
         this.j.b(true);
         this.Q.b($$3);
         this.Q.c($$4);
         $$5.a();
         this.j.c(false);
         this.f.e();
         this.f().a(true);
      }

      return var12;
   }

   private te a(File $$0, int $$1, int $$2, int $$3, int $$4) {
      try {
         ByteBuffer $$5 = eka.a($$1 * $$2 * 3);
         eqy $$6 = new eqy($$0, $$3, $$4, $$2);
         float $$7 = (float)$$3 / (float)$$1;
         float $$8 = (float)$$4 / (float)$$2;
         float $$9 = $$7 > $$8 ? $$7 : $$8;

         for (int $$10 = ($$4 - 1) / $$2 * $$2; $$10 >= 0; $$10 -= $$2) {
            for (int $$11 = 0; $$11 < $$3; $$11 += $$1) {
               RenderSystem.setShaderTexture(0, fyf.e);
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
         eka.a($$5);
         te $$15 = te.b($$14.getName()).a(n.t).a($$1x -> $$1x.a(new tc(tc.a.b, $$14.getAbsolutePath())));
         return te.a("screenshot.success", $$15);
      } catch (Exception var15) {
         G.warn("Couldn't save screenshot", var15);
         return te.a("screenshot.failure", var15.getMessage());
      }
   }

   public bde aG() {
      return this.bi;
   }

   @Nullable
   public akv aH() {
      return this.X.get();
   }

   public fzi aI() {
      return this.at;
   }

   @Nullable
   public exp aJ() {
      return this.aX;
   }

   public fbx aK() {
      return this.aH;
   }

   public boolean aL() {
      return false;
   }

   public ekl aM() {
      return this.Q;
   }

   public fnm aN() {
      return this.S;
   }

   public void b(int $$0) {
      this.aA.a($$0);
   }

   public fhf aO() {
      return this.aI;
   }

   public boolean aP() {
      return this.ay.properties().flag(UserFlag.PROFANITY_FILTER_ENABLED);
   }

   public void aQ() {
      this.aH.a();
      this.v().a();
   }

   public eqv aR() {
      return this.br;
   }

   @Nullable
   public arx aS() {
      return arx.a(this.aw.getServicesKeySet(), ServicesKeyType.PROFILE_KEY);
   }

   public eqk aT() {
      return this.Z;
   }

   public void a(eqk $$0) {
      this.Z = $$0;
   }

   public eqf aU() {
      return this.bs;
   }

   public fiq aV() {
      return this.bt;
   }

   public fjc aW() {
      return this.bu;
   }

   public eno aX() {
      return this.aM;
   }

   public fmq aY() {
      return this.aN;
   }

   public eqc aZ() {
      return this.bv;
   }

   public egv ba() {
      return this.bw;
   }

   public static enum a {
      a(td.a) {
         @Override
         public boolean a(boolean $$0) {
            return true;
         }
      },
      b(te.c("chat.disabled.options").a(n.m)) {
         @Override
         public boolean a(boolean $$0) {
            return false;
         }
      },
      c(te.c("chat.disabled.launcher").a(n.m)) {
         @Override
         public boolean a(boolean $$0) {
            return $$0;
         }
      },
      d(te.a("chat.disabled.profile", te.d(eqn.F.m.K.h())).a(n.m)) {
         @Override
         public boolean a(boolean $$0) {
            return $$0;
         }
      };

      static final te e = te.c("chat.disabled.profile.moreInfo");
      private final te f;

      a(te $$0) {
         this.f = $$0;
      }

      public te a() {
         return this.f;
      }

      public abstract boolean a(boolean var1);
   }
}
