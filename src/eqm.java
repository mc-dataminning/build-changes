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

public class eqm extends bfk<Runnable> implements ekl {
   static eqm H;
   private static final Logger I = LogUtils.getLogger();
   public static final boolean a = ac.i() == ac.b.d;
   private static final int J = 10;
   public static final aer b = new aer("default");
   public static final aer c = new aer("uniform");
   public static final aer d = new aer("alt");
   private static final aer K = new aer("regional_compliancies.json");
   private static final CompletableFuture<asp> L = CompletableFuture.completedFuture(asp.a);
   private static final tf M = tf.c("multiplayer.socialInteractions.not_available");
   public static final String e = "Please make sure you have up-to-date drivers (see aka.ms/mcdriver for instructions).";
   private final Path N;
   private final CompletableFuture<GameProfile> O;
   private final fym P;
   private final DataFixer Q;
   private final foc R;
   private final ekk S;
   private final eqz T = new eqz(20.0F, 0L);
   private final fnr U;
   public final fnj f;
   private final fsm V;
   private final ftm W;
   public final fld g;
   private final gcf X = new gcf();
   private final erb Y;
   public final eru h;
   public final eru i;
   public final fne j;
   public final fqu k;
   private final AtomicReference<akx> Z = new AtomicReference<>();
   public final erv l;
   public final eqq m;
   private final eqi aa;
   public final eqn n;
   public final eql o;
   private eqj ab = eqj.a;
   public final File p;
   private final String ac;
   private final String ad;
   private final Proxy ae;
   private final ebx af;
   public final arw q = new arw();
   public final arw r = new arw();
   public final arw s = new arw();
   private final boolean ag;
   private final boolean ah;
   private final boolean ai;
   private final boolean aj;
   private final anj ak;
   private final amd al;
   private final fze am;
   private final amx an;
   private final fzt ao;
   private final ern ap;
   private final err aq;
   private final ejs ar;
   private final gcx as;
   private final gcs at;
   private final eut au;
   private final fzn av;
   private final fnf aw;
   private final eqs ax = new eqs(K, eqm::b);
   private final YggdrasilAuthenticationService ay;
   private final MinecraftSessionService az;
   private final UserApiService aA;
   private final fzm aB;
   private final gas aC;
   private final foe aD;
   private final fzk aE;
   private final fzj aF;
   private final erx aG;
   private final euo aH;
   private final gea aI;
   private final fcb aJ;
   private final fhj aK;
   private final fpk aL;
   private final gdb aM;
   private final fir aN;
   private final enn aO;
   private final fmv aP;
   @Nullable
   public fio t;
   @Nullable
   public fii u;
   @Nullable
   public fmn v;
   @Nullable
   private gck aQ;
   @Nullable
   private sg aR;
   private boolean aS;
   @Nullable
   public bii w;
   @Nullable
   public bii x;
   @Nullable
   public ehc y;
   private int aT;
   protected int z;
   private volatile boolean aU;
   private float aV;
   private long aW = ac.c();
   private long aX;
   private int aY;
   public boolean A;
   @Nullable
   public exz B;
   @Nullable
   private ext aZ;
   private Thread ba;
   private volatile boolean bb;
   @Nullable
   private Supplier<o> bc;
   private static int bd;
   public String C = "";
   private long be;
   public boolean D;
   public boolean E;
   public boolean F;
   public boolean G = true;
   private boolean bf;
   private final Queue<Runnable> bg = Queues.newConcurrentLinkedQueue();
   @Nullable
   private CompletableFuture<Void> bh;
   @Nullable
   private eup bi;
   private bdh bj = bde.a;
   private int bk;
   private final bdb bl = new bdb(ac.b, () -> this.bk);
   @Nullable
   private bdg bm;
   private bes bn = ber.a;
   private final eqw bo = new eqw();
   private long bp;
   private double bq;
   @Nullable
   private ekz.a br;
   private final equ bs;
   private final eqe bt;
   private final fiv bu;
   private fjh bv;
   private final eqb bw;
   private final egu bx;
   private boolean by;
   private String bz = "root";

   public eqm(fdh $$0) {
      super("Client");
      H = this;
      this.p = $$0.c.a;
      File $$1 = $$0.c.c;
      this.N = $$0.c.b.toPath();
      this.ac = $$0.d.b;
      this.ad = $$0.d.c;
      Path $$2 = this.p.toPath();
      this.bx = ebx.a($$2.resolve("allowed_symlinks.txt"));
      fzc $$3 = new fzc($$0.c.a(), this.bx);
      this.am = new fze(new File(this.p, "server-resource-packs"));
      amz $$4 = new amt(this.N, amb.a, amy.b, this.bx);
      this.an = new amx($$3, this.am, $$4);
      this.al = $$3.a();
      this.ae = $$0.a.d;
      this.ay = new YggdrasilAuthenticationService(this.ae);
      this.az = this.ay.createMinecraftSessionService();
      this.Y = $$0.a.a;
      this.O = CompletableFuture.supplyAsync(() -> this.az.fetchProfile(this.Y.b(), true), ac.g());
      this.aA = this.a(this.ay, $$0);
      I.info("Setting user: {}", this.Y.c());
      I.debug("(Session ID is {})", this.Y.a());
      this.ah = $$0.d.a;
      this.ai = !$$0.d.d;
      this.aj = !$$0.d.e;
      this.ag = bh();
      this.aQ = null;
      uj.a(eqk::a);
      this.Q = ast.a();
      this.aH = new euo(this);
      this.ba = Thread.currentThread();
      this.m = new eqq(this, this.p);
      RenderSystem.setShaderGlintAlpha(this.m.ai().c());
      this.bb = true;
      this.aI = new gea(this, this.m);
      this.aa = new eqi(this.p, this.Q);
      I.info("Backend library: {}", RenderSystem.getBackendDescription());
      ejx $$5;
      if (this.m.p > 0 && this.m.o > 0) {
         $$5 = new ejx(this.m.o, this.m.p, $$0.b.c, $$0.b.d, $$0.b.e);
      } else {
         $$5 = $$0.b;
      }

      ac.b = RenderSystem.initBackendSystem();
      this.R = new foc(this);
      this.S = this.R.a($$5, this.m.k, this.be());
      this.a(true);
      gdm.a.b(gdi.A);

      try {
         this.S.a(this.al, aa.b().g() ? eka.a : eka.b);
      } catch (IOException var11) {
         I.error("Couldn't set icon", var11);
      }

      this.S.a(this.m.g().c());
      this.n = new eqn(this);
      this.n.a(this.S.i());
      this.o = new eql(this);
      this.o.a(this.S.i());
      RenderSystem.initRenderer(this.m.u, false);
      this.ar = new ejp(this.S.k(), this.S.l());
      this.ar.a(0.0F, 0.0F, 0.0F, 0.0F);
      this.ar.b(a);
      this.ak = new anj(amb.a);
      this.an.a();
      this.m.b(this.an);
      this.ao = new fzt(this.m.ah);
      this.ak.a(this.ao);
      this.P = new fym(this.ak);
      this.ak.a(this.P);
      this.aB = new fzm(this.P, $$1.toPath().resolve("skins"), this.az, this);
      this.af = new ebx($$2.resolve("saves"), $$2.resolve("backups"), this.bx, this.Q);
      this.bw = new eqb($$2);
      this.as = new gcx(this.m);
      this.ak.a(this.as);
      this.av = new fzn(this.Y);
      this.ak.a(this.av);
      this.at = new gcs(this);
      this.au = new eut(this.P);
      this.h = this.au.a();
      this.i = this.au.b();
      this.ak.a(this.au);
      this.b(this.j());
      this.ak.a(new fzg());
      this.ak.a(new fzf());
      this.S.a("Startup");
      RenderSystem.setupDefaultState(0, 0, this.S.k(), this.S.l());
      this.S.a("Post startup");
      this.ap = ern.a();
      this.aq = err.a(this.ap);
      this.aC = new gas(this.P, this.ap, this.m.y().c());
      this.ak.a(this.aC);
      this.aK = new fhj();
      this.ak.a(this.aK);
      this.aL = new fpk(this.h, this.aK, this::an, this::aq, this::ao);
      this.ak.a(this.aL);
      fmy $$8 = new fmy(this.aL, this.aK);
      this.ak.a($$8);
      this.W = new ftm(this, this.P, this.aC, this.aq, $$8);
      this.ak.a(this.W);
      this.U = new fnr();
      this.aJ = new fcb(this, this.aA);
      this.aD = new foe(this.aC.b(), $$8, this.ap);
      this.ak.a(this.aD);
      this.V = new fsm(this, this.P, this.W, this.aD, this.h, this.m, this.aK);
      this.ak.a(this.V);
      this.j = new fne(this, this.V.d(), this.ak, this.U);
      this.ak.a(this.j.e());
      this.f = new fnj(this, this.V, this.aL, this.U);
      this.ak.a(this.f);
      this.bg();
      this.ak.a(this.X);
      this.g = new fld(this.u, this.P);
      this.ak.a(this.g);
      this.aE = new fzk(this.P);
      this.ak.a(this.aE);
      this.aF = new fzj(this.P);
      this.ak.a(this.aF);
      this.aG = new erx(this.P);
      this.ak.a(this.aG);
      this.aw = new fnf();
      this.ak.a(this.aw);
      this.ak.a(this.ax);
      this.l = new erv(this, this.W);
      this.k = new fqu(this);
      elw $$9 = elw.a(this);
      this.aO = new enn($$9);
      RenderSystem.setErrorCallback(this::a);
      if (this.ar.c != this.S.k() || this.ar.d != this.S.l()) {
         StringBuilder $$10 = new StringBuilder(
            "Recovering from unsupported resolution ("
               + this.S.k()
               + "x"
               + this.S.l()
               + ").\nPlease make sure you have up-to-date drivers (see aka.ms/mcdriver for instructions)."
         );
         if (ejy.b()) {
            $$10.append("\n\nReported GL debug messages:\n").append(String.join("\n", ejy.a()));
         }

         this.S.a(this.ar.c, this.ar.d);
         TinyFileDialogs.tinyfd_messageBox("Minecraft", $$10.toString(), "ok", "error", false);
      } else if (this.m.V().c() && !this.S.j()) {
         this.S.h();
         this.m.V().a(this.S.j());
      }

      this.S.a(this.m.J().c());
      this.S.b(this.m.C().c());
      this.S.c();
      this.a();
      this.j.a(this.al.c());
      this.aM = new gdb(this, this.aA, this.Y);
      this.aN = fir.a(this.aA, this.Y, $$2);
      this.bs = new equ(this);
      this.bt = new eqe(this);
      this.bt.a(this.m.an().c() != eqo.a);
      this.bu = new fiv(this);
      this.bu.a(this.m.w().c());
      this.bv = fjh.a(fjf.a(), this.aA);
      exl.a(this);
      List<ama> $$11 = this.an.g();
      this.bo.a(eqw.b.a, $$11);
      ani $$12 = this.ak.a(ac.f(), this, L, $$11);
      gdm.a.a(gdi.C);
      this.a(new exl(this, $$12, $$0x -> ac.a($$0x, this::a, () -> {
            if (aa.aS) {
               this.bi();
            }

            this.bo.a();
            this.bc();
         }), false));
      this.aP = fmv.a($$0.e.b());
      if (this.F()) {
         this.a(ewo.a($$3x -> {
            if ($$3x) {
               ac.i().a("https://aka.ms/mcjavamoderation");
            }

            this.a($$9, $$12, $$0.e);
         }, this.G()));
      } else {
         this.a($$9, $$12, $$0.e);
      }
   }

   private void bc() {
      if (!this.by) {
         this.by = true;
         this.bd();
      }
   }

   private void bd() {
      gdm.a.b(gdi.C);
      gdm.a.b(gdi.z);
      gdm.a.a(this.aM.a());
   }

   public boolean c() {
      return this.by;
   }

   private void a(elw $$0, ani $$1, fdh.c $$2) {
      if ($$2.a()) {
         fmu.a(this, $$2, $$1, $$0);
      } else if (this.m.ai) {
         this.a(new ewk(this.m));
      } else {
         this.a(new eye(true));
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
      this.S.b(this.be());
   }

   private String be() {
      StringBuilder $$0 = new StringBuilder("Minecraft");
      if (e().a()) {
         $$0.append("*");
      }

      $$0.append(" ");
      $$0.append(aa.b().c());
      fij $$1 = this.J();
      if ($$1 != null && $$1.l().k()) {
         $$0.append(" - ");
         fis $$2 = this.Q();
         if (this.aQ != null && !this.aQ.p()) {
            $$0.append(fzr.a("title.singleplayer"));
         } else if ($$2 != null && $$2.e()) {
            $$0.append(fzr.a("title.multiplayer.realms"));
         } else if (this.aQ == null && ($$2 == null || !$$2.d())) {
            $$0.append(fzr.a("title.multiplayer.other"));
         } else {
            $$0.append(fzr.a("title.multiplayer.lan"));
         }
      }

      return $$0.toString();
   }

   private UserApiService a(YggdrasilAuthenticationService $$0, fdh $$1) {
      try {
         return $$0.createUserApiService($$1.a.a.d());
      } catch (AuthenticationException var4) {
         I.error("Failed to verify authentication", var4);
         return UserApiService.OFFLINE;
      }
   }

   public static aro e() {
      return aro.a("vanilla", ClientBrandRetriever::getClientModName, "Client", eqm.class);
   }

   private void a(Throwable $$0) {
      if (this.an.d().size() > 1) {
         this.a($$0, null);
      } else {
         ac.a($$0);
      }
   }

   public void a(Throwable $$0, @Nullable tf $$1) {
      I.info("Caught error loading resourcepacks, removing all selected resourcepacks", $$0);
      this.bo.a($$0);
      this.an.a(Collections.emptyList());
      this.m.i.clear();
      this.m.j.clear();
      this.m.aq();
      this.d(true).thenRun(() -> this.a($$1));
   }

   private void bf() {
      this.a(null);
      if (this.u != null) {
         this.u.U();
         this.z();
      }

      this.a(new eye());
      this.a(null);
   }

   private void a(@Nullable tf $$0) {
      euo $$1 = this.az();
      eum.b($$1, eum.a.d, tf.c("resourcePack.load_fail"), $$0);
   }

   public void f() {
      this.ba = Thread.currentThread();
      if (Runtime.getRuntime().availableProcessors() > 4) {
         this.ba.setPriority(10);
      }

      try {
         boolean $$0 = false;

         while (this.bb) {
            if (this.bc != null) {
               c(this.bc.get());
               return;
            }

            try {
               bdk $$1 = bdk.a("Renderer");
               boolean $$2 = this.bj();
               this.bj = this.a($$2, $$1);
               this.bj.a();
               this.bn.c();
               this.e(!$$0);
               this.bn.d();
               this.bj.b();
               this.b($$2, $$1);
            } catch (OutOfMemoryError var4) {
               if ($$0) {
                  throw var4;
               }

               this.p();
               this.a(new exs());
               System.gc();
               I.error(LogUtils.FATAL_MARKER, "Out of memory", var4);
               $$0 = true;
            }
         }
      } catch (y var5) {
         this.d(var5.a());
         this.p();
         I.error(LogUtils.FATAL_MARKER, "Reported exception thrown!", var5);
         c(var5.a());
      } catch (Throwable var6) {
         o $$6 = this.d(new o("Unexpected error", var6));
         I.error(LogUtils.FATAL_MARKER, "Unreported exception thrown!", var6);
         this.p();
         c($$6);
      }
   }

   void b(boolean $$0) {
      this.au.a($$0 ? ImmutableMap.of(b, c) : ImmutableMap.of());
   }

   private void bg() {
      this.X
         .a(
            gcf.a,
            $$0 -> new gby<>(
                  $$0x -> $$0x.a(null, ckp.a.a.c()).stream().map($$0xx -> n.a($$0xx.getString()).trim()).filter($$0xx -> !$$0xx.isEmpty()),
                  $$0x -> Stream.of(jb.i.b($$0x.d())),
                  $$0
               )
         );
      this.X.a(gcf.b, $$0 -> new gbz<>($$0x -> $$0x.f().map(aqa::b), $$0));
      this.X
         .a(
            gcf.c,
            $$0 -> new gby<>(
                  $$0x -> $$0x.e()
                        .stream()
                        .flatMap($$1 -> $$1.a($$0x.a()).a(null, ckp.a.a).stream())
                        .map($$0xx -> n.a($$0xx.getString()).trim())
                        .filter($$0xx -> !$$0xx.isEmpty()),
                  $$0x -> $$0x.e().stream().map($$1 -> jb.i.b($$1.a($$0x.a()).d())),
                  $$0
               )
         );
      chf.e().a($$0 -> {
         this.a(gcf.a, $$0);
         this.a(gcf.b, $$0);
      });
   }

   private void a(int $$0, long $$1) {
      this.m.J().a(false);
      this.m.aq();
   }

   private static boolean bh() {
      String[] $$0 = new String[]{"sun.arch.data.model", "com.ibm.vm.bitmode", "os.arch"};

      for (String $$1 : $$0) {
         String $$2 = System.getProperty($$1);
         if ($$2 != null && $$2.contains("64")) {
            return true;
         }
      }

      return false;
   }

   public ejs g() {
      return this.ar;
   }

   public String h() {
      return this.ac;
   }

   public String i() {
      return this.ad;
   }

   public void a(o $$0) {
      this.bc = () -> this.d($$0);
   }

   public void b(o $$0) {
      this.bc = () -> $$0;
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
      return this.m.L().c();
   }

   public CompletableFuture<Void> k() {
      return this.d(false);
   }

   private CompletableFuture<Void> d(boolean $$0) {
      if (this.bh != null) {
         return this.bh;
      } else {
         CompletableFuture<Void> $$1 = new CompletableFuture<>();
         if (!$$0 && this.aZ instanceof exl) {
            this.bh = $$1;
            return $$1;
         } else {
            this.an.a();
            List<ama> $$2 = this.an.g();
            if (!$$0) {
               this.bo.a(eqw.b.b, $$2);
            }

            this.a(new exl(this, this.ak.a(ac.f(), this, L, $$2), $$2x -> ac.a($$2x, $$1xx -> {
                  if ($$0) {
                     this.bf();
                  } else {
                     this.a($$1xx);
                  }
               }, () -> {
                  this.f.f();
                  this.bo.a();
                  $$1.complete(null);
                  this.bc();
               }), true));
            return $$1;
         }
      }
   }

   private void bi() {
      boolean $$0 = false;
      fod $$1 = this.an().a();
      gam $$2 = $$1.a().a();

      for (csm $$3 : jb.f) {
         UnmodifiableIterator $$10 = $$3.l().a().iterator();

         while ($$10.hasNext()) {
            dfa $$4 = (dfa)$$10.next();
            if ($$4.l() == cyr.c) {
               gam $$5 = $$1.b($$4);
               if ($$5 == $$2) {
                  I.debug("Missing model for: {}", $$4);
                  $$0 = true;
               }
            }
         }
      }

      fyl $$6 = $$2.e();

      for (csm $$7 : jb.f) {
         UnmodifiableIterator var17 = $$7.l().a().iterator();

         while (var17.hasNext()) {
            dfa $$8 = (dfa)var17.next();
            fyl $$9 = $$1.a($$8);
            if (!$$8.i() && $$9 == $$6) {
               I.debug("Missing particle icon for: {}", $$8);
            }
         }
      }

      for (cit $$10 : jb.i) {
         ciy $$11 = $$10.ae_();
         String $$12 = $$11.q();
         String $$13 = tf.c($$12).getString();
         if ($$13.toLowerCase(Locale.ROOT).equals($$10.a())) {
            I.debug("Missing translation for: {} {} {}", new Object[]{$$11, $$12, $$10});
         }
      }

      $$0 |= exm.a();
      $$0 |= fsp.a();
      if ($$0) {
         throw new IllegalStateException("Your game data is foobar, fix the errors above!");
      }
   }

   public ebx l() {
      return this.af;
   }

   private void a(String $$0) {
      eqm.a $$1 = this.H();
      if (!$$1.a(this.R())) {
         if (this.l.b()) {
            this.l.b(false);
            this.a(new ewr($$0x -> {
               if ($$0x) {
                  ac.i().a("https://aka.ms/JavaAccountSettings");
               }

               this.a(null);
            }, eqm.a.e, "https://aka.ms/JavaAccountSettings", true));
         } else {
            tf $$2 = $$1.a();
            this.l.a($$2, false);
            this.bt.c($$2);
            this.l.b($$1 == eqm.a.d);
         }
      } else {
         this.a(new ewq($$0));
      }
   }

   public void a(@Nullable exz $$0) {
      if (aa.aS && Thread.currentThread() != this.ba) {
         I.error("setScreen called from non-game thread");
      }

      if (this.B != null) {
         this.B.h();
      }

      if ($$0 == null && this.u == null) {
         $$0 = new eye();
      } else if ($$0 == null && this.v.eu()) {
         if (this.v.o()) {
            $$0 = new ewy(null, this.u.k().n());
         } else {
            this.v.fO();
         }
      }

      this.B = $$0;
      if (this.B != null) {
         this.B.av_();
      }

      elc.a();
      if ($$0 != null) {
         this.n.j();
         eqk.b();
         $$0.b(this, this.S.o(), this.S.p());
         this.A = false;
      } else {
         this.as.g();
         this.n.i();
      }

      this.d();
   }

   public void a(@Nullable ext $$0) {
      this.aZ = $$0;
   }

   public void m() {
      try {
         I.info("Stopping!");

         try {
            this.bt.c();
         } catch (Throwable var7) {
         }

         try {
            if (this.u != null) {
               this.u.U();
            }

            this.z();
         } catch (Throwable var6) {
         }

         if (this.B != null) {
            this.B.h();
         }

         this.close();
      } finally {
         ac.b = System::nanoTime;
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
         this.aM.close();
         this.ax.close();
         this.aC.close();
         this.au.close();
         this.j.close();
         this.f.close();
         this.as.f();
         this.g.a();
         this.aF.close();
         this.aE.close();
         this.aG.close();
         this.P.close();
         this.ak.close();
         ac.h();
      } catch (Throwable var5) {
         I.error("Shutdown failure!", var5);
         throw var5;
      } finally {
         this.R.close();
         this.S.close();
      }
   }

   private void e(boolean $$0) {
      this.S.a("Pre render");
      long $$1 = ac.c();
      if (this.S.b()) {
         this.q();
      }

      if (this.bh != null && !(this.aZ instanceof exl)) {
         CompletableFuture<Void> $$2 = this.bh;
         this.bh = null;
         this.k().thenRun(() -> $$2.complete(null));
      }

      Runnable $$3;
      while (($$3 = this.bg.poll()) != null) {
         $$3.run();
      }

      if ($$0) {
         int $$4 = this.T.a(ac.b());
         this.bj.a("scheduledExecutables");
         this.bq();
         this.bj.c();
         this.bj.a("tick");

         for (int $$5 = 0; $$5 < Math.min(10, $$4); $$5++) {
            this.bj.d("clientTick");
            this.t();
         }

         this.bj.c();
      }

      this.n.a();
      this.S.a("Render");
      this.bj.a("sound");
      this.as.a(this.j.m());
      this.bj.c();
      this.bj.a("render");
      long $$6 = ac.c();
      boolean $$8;
      if (!this.m.aa && !this.bn.e()) {
         $$8 = false;
         this.bq = 0.0;
      } else {
         $$8 = this.br == null || this.br.b();
         if ($$8) {
            ekz.a().ifPresent(ekz::b);
         }
      }

      RenderSystem.clear(16640, a);
      this.ar.a(true);
      fnd.a();
      this.bj.a("display");
      RenderSystem.enableCull();
      this.bj.c();
      if (!this.A) {
         this.bj.b("gameRenderer");
         this.j.a(this.aU ? this.aV : this.T.a, $$1, $$0);
         this.bj.c();
      }

      if (this.bm != null) {
         this.bj.a("fpsPie");
         erw $$9 = new erw(this, this.U.b());
         this.a($$9, this.bm);
         $$9.e();
         this.bj.c();
      }

      this.bj.a("blit");
      this.ar.e();
      this.ar.a(this.S.k(), this.S.l());
      this.be = ac.c() - $$6;
      if ($$8) {
         ekz.a().ifPresent($$0x -> this.br = $$0x.c());
      }

      this.bj.b("updateDisplay");
      this.S.e();
      int $$10 = this.bk();
      if ($$10 < 260) {
         RenderSystem.limitDisplayFPS($$10);
      }

      this.bj.b("yield");
      Thread.yield();
      this.bj.c();
      this.S.a("Post render");
      this.aY++;
      boolean $$11 = this.S() && (this.B != null && this.B.j() || this.aZ != null && this.aZ.a()) && !this.aQ.p();
      if (this.aU != $$11) {
         if (this.aU) {
            this.aV = this.T.a;
         } else {
            this.T.a = this.aV;
         }

         this.aU = $$11;
      }

      long $$12 = ac.c();
      long $$13 = $$12 - this.aW;
      if ($$8) {
         this.bp = $$13;
      }

      this.q.a($$13);
      this.aW = $$12;
      this.bj.a("fpsUpdate");
      if (this.br != null && this.br.b()) {
         this.bq = (double)this.br.c() * 100.0 / (double)this.bp;
      }

      while (ac.b() >= this.aX + 1000L) {
         String $$14;
         if (this.bq > 0.0) {
            $$14 = " GPU: " + (this.bq > 100.0 ? n.m + "100%" : Math.round(this.bq) + "%");
         } else {
            $$14 = "";
         }

         bd = this.aY;
         this.C = String.format(
            Locale.ROOT,
            "%d fps T: %s%s%s%s B: %d%s",
            bd,
            $$10 == 260 ? "inf" : $$10,
            this.m.J().c() ? " vsync" : "",
            this.m.i().c(),
            this.m.h().c() == eqa.a ? "" : (this.m.h().c() == eqa.b ? " fast-clouds" : " fancy-clouds"),
            this.m.A().c(),
            $$14
         );
         this.aX += 1000L;
         this.aY = 0;
      }

      this.bj.c();
   }

   private boolean bj() {
      return this.m.aa && this.m.ab && !this.m.Z;
   }

   private bdh a(boolean $$0, @Nullable bdk $$1) {
      if (!$$0) {
         this.bl.b();
         if (!this.bn.e() && $$1 == null) {
            return bde.a;
         }
      }

      bdh $$2;
      if ($$0) {
         if (!this.bl.a()) {
            this.bk = 0;
            this.bl.c();
         }

         this.bk++;
         $$2 = this.bl.d();
      } else {
         $$2 = bde.a;
      }

      if (this.bn.e()) {
         $$2 = bdh.a($$2, this.bn.f());
      }

      return bdk.a($$2, $$1);
   }

   private void b(boolean $$0, @Nullable bdk $$1) {
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
      int $$0 = this.S.a(this.m.al().c(), this.j());
      this.S.a((double)$$0);
      if (this.B != null) {
         this.B.a(this, this.S.o(), this.S.p());
      }

      ejs $$1 = this.g();
      $$1.a(this.S.k(), this.S.l(), a);
      this.j.a(this.S.k(), this.S.l());
      this.n.g();
   }

   @Override
   public void b() {
      this.n.k();
   }

   public int n() {
      return bd;
   }

   public long o() {
      return this.be;
   }

   private int bk() {
      return this.u != null || this.B == null && this.aZ == null ? this.S.d() : 60;
   }

   public void p() {
      try {
         arn.b();
         this.f.p();
      } catch (Throwable var3) {
      }

      try {
         System.gc();
         if (this.aS && this.aQ != null) {
            this.aQ.a(true);
         }

         this.b((exz)(new exf(tf.c("menu.savingLevel"))));
      } catch (Throwable var2) {
      }

      System.gc();
   }

   public boolean a(Consumer<tf> $$0) {
      if (this.bn.e()) {
         this.bt();
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
         ab $$3 = a(new ab(), this, this.ao, this.ac, this.m);
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

         this.bn = beq.a(new fms(ac.b, this.f), ac.b, ac.g(), new bew("client"), $$1x -> {
            this.bn = ber.a;
            $$1.accept($$1x);
         }, $$5);
         return true;
      }
   }

   private void bt() {
      this.bn.a();
      if (this.aQ != null) {
         this.aQ.aQ();
      }
   }

   private void bu() {
      this.bn.b();
      if (this.aQ != null) {
         this.aQ.aR();
      }
   }

   private Path a(ab $$0, List<Path> $$1) {
      String $$2;
      if (this.R()) {
         $$2 = this.T().aU().g();
      } else {
         fis $$3 = this.Q();
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
         $$10.a(Paths.get("client").resolve(this.m.av().getName()), this.m.aw());
         $$1.forEach($$10::a);
      } finally {
         for (Path $$13 : $$1) {
            try {
               FileUtils.forceDelete($$13.toFile());
            } catch (IOException var18) {
               I.warn("Failed to delete temporary profiling result {}", $$13, var18);
            }
         }
      }

      return $$7;
   }

   public void a(int $$0) {
      if (this.bm != null) {
         List<bdj> $$1 = this.bm.a(this.bz);
         if (!$$1.isEmpty()) {
            bdj $$2 = $$1.remove(0);
            if ($$0 == 0) {
               if (!$$2.d.isEmpty()) {
                  int $$3 = this.bz.lastIndexOf(30);
                  if ($$3 >= 0) {
                     this.bz = this.bz.substring(0, $$3);
                  }
               }
            } else {
               $$0--;
               if ($$0 < $$1.size() && !"unspecified".equals($$1.get($$0).d)) {
                  if (!this.bz.isEmpty()) {
                     this.bz = this.bz + "\u001e";
                  }

                  this.bz = this.bz + $$1.get($$0).d;
               }
            }
         }
      }
   }

   private void a(erw $$0, bdg $$1) {
      List<bdj> $$2 = $$1.a(this.bz);
      bdj $$3 = $$2.remove(0);
      RenderSystem.clear(256, a);
      RenderSystem.setShader(fne::q);
      Matrix4f $$4 = new Matrix4f().setOrtho(0.0F, (float)this.S.k(), (float)this.S.l(), 0.0F, 1000.0F, 3000.0F);
      RenderSystem.setProjectionMatrix($$4, elo.b);
      elg $$5 = RenderSystem.getModelViewStack();
      $$5.a();
      $$5.e();
      $$5.a(0.0F, 0.0F, -2000.0F);
      RenderSystem.applyModelViewMatrix();
      RenderSystem.lineWidth(1.0F);
      eli $$6 = eli.a();
      elb $$7 = $$6.c();
      int $$8 = 160;
      int $$9 = this.S.k() - 160 - 10;
      int $$10 = this.S.l() - 320;
      RenderSystem.enableBlend();
      $$7.a(ell.b.h, ele.n);
      $$7.a((double)((float)$$9 - 176.0F), (double)((float)$$10 - 96.0F - 16.0F), 0.0).a(200, 0, 0, 0).e();
      $$7.a((double)((float)$$9 - 176.0F), (double)($$10 + 320), 0.0).a(200, 0, 0, 0).e();
      $$7.a((double)((float)$$9 + 176.0F), (double)($$10 + 320), 0.0).a(200, 0, 0, 0).e();
      $$7.a((double)((float)$$9 + 176.0F), (double)((float)$$10 - 96.0F - 16.0F), 0.0).a(200, 0, 0, 0).e();
      $$6.b();
      RenderSystem.disableBlend();
      double $$11 = 0.0;

      for (bdj $$12 : $$2) {
         int $$13 = arp.a($$12.a / 4.0) + 1;
         $$7.a(ell.b.g, ele.n);
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
         $$7.a(ell.b.f, ele.n);

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
      this.bb = false;
   }

   public boolean r() {
      return this.bb;
   }

   public void c(boolean $$0) {
      if (this.B == null) {
         boolean $$1 = this.S() && !this.aQ.p();
         if ($$1) {
            this.a(new exu(!$$0));
            this.as.d();
         } else {
            this.a(new exu(true));
         }
      }
   }

   private void f(boolean $$0) {
      if (!$$0) {
         this.z = 0;
      }

      if (this.z <= 0 && !this.v.fl()) {
         if ($$0 && this.y != null && this.y.c() == ehc.a.b) {
            eha $$1 = (eha)this.y;
            gu $$2 = $$1.a();
            if (!this.u.a_($$2).i()) {
               ha $$3 = $$1.b();
               if (this.t.b($$2, $$3)) {
                  this.g.a($$2, $$3);
                  this.v.a(bgp.a);
               }
            }
         } else {
            this.t.b();
         }
      }
   }

   private boolean bv() {
      if (this.z > 0) {
         return false;
      } else if (this.y == null) {
         I.error("Null returned as 'hitResult', this shouldn't happen!");
         if (this.t.f()) {
            this.z = 10;
         }

         return false;
      } else if (this.v.x()) {
         return false;
      } else {
         ciy $$0 = this.v.b(bgp.a);
         if (!$$0.a(this.u.G())) {
            return false;
         } else {
            boolean $$1 = false;
            switch (this.y.c()) {
               case c:
                  this.t.a(this.v, ((ehb)this.y).a());
                  break;
               case b:
                  eha $$2 = (eha)this.y;
                  gu $$3 = $$2.a();
                  if (!this.u.a_($$3).i()) {
                     this.t.a($$3, $$2.b());
                     if (this.u.a_($$3).i()) {
                        $$1 = true;
                     }
                     break;
                  }
               case a:
                  if (this.t.f()) {
                     this.z = 10;
                  }

                  this.v.gk();
            }

            this.v.a(bgp.a);
            return $$1;
         }
      }
   }

   private void bw() {
      if (!this.t.m()) {
         this.aT = 4;
         if (!this.v.x()) {
            if (this.y == null) {
               I.warn("Null returned as 'hitResult', this shouldn't happen!");
            }

            for (bgp $$0 : bgp.values()) {
               ciy $$1 = this.v.b($$0);
               if (!$$1.a(this.u.G())) {
                  return;
               }

               if (this.y != null) {
                  switch (this.y.c()) {
                     case c:
                        ehb $$2 = (ehb)this.y;
                        bii $$3 = $$2.a();
                        if (!this.u.w_().a($$3.dk())) {
                           return;
                        }

                        bgq $$4 = this.t.a(this.v, $$3, $$2, $$0);
                        if (!$$4.a()) {
                           $$4 = this.t.a(this.v, $$3, $$0);
                        }

                        if ($$4.a()) {
                           if ($$4.b()) {
                              this.v.a($$0);
                           }

                           return;
                        }
                        break;
                     case b:
                        eha $$5 = (eha)this.y;
                        int $$6 = $$1.L();
                        bgq $$7 = this.t.a(this.v, $$0, $$5);
                        if ($$7.a()) {
                           if ($$7.b()) {
                              this.v.a($$0);
                              if (!$$1.b() && ($$1.L() != $$6 || this.t.g())) {
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
                  bgq $$8 = this.t.a(this.v, $$0);
                  if ($$8.a()) {
                     if ($$8.b()) {
                        this.v.a($$0);
                     }

                     this.j.b.a($$0);
                     return;
                  }
               }
            }
         }
      }
   }

   public gcs s() {
      return this.at;
   }

   public void t() {
      if (this.aT > 0) {
         this.aT--;
      }

      this.bj.a("gui");
      this.bu.a();
      this.l.a(this.aU);
      this.bj.c();
      this.j.a(1.0F);
      this.aI.a(this.u, this.y);
      this.bj.a("gameMode");
      if (!this.aU && this.u != null) {
         this.t.d();
      }

      this.bj.b("textures");
      this.P.e();
      if (this.B != null || this.v == null) {
         if (this.B instanceof exh $$0 && !this.v.fB()) {
            $$0.k();
         }
      } else if (this.v.eu() && !(this.B instanceof ewy)) {
         this.a(null);
      } else if (this.v.fB() && this.u != null) {
         this.a(new exh());
      }

      if (this.B != null) {
         this.z = 10000;
      }

      if (this.B != null) {
         exz.a(() -> this.B.c(), "Ticking screen", this.B.getClass().getCanonicalName());
      }

      if (!this.m.aa) {
         this.l.k();
      }

      if (this.aZ == null && this.B == null) {
         this.bj.b("Keybindings");
         this.by();
         if (this.z > 0) {
            this.z--;
         }
      }

      if (this.u != null) {
         this.bj.b("gameRenderer");
         if (!this.aU) {
            this.j.f();
         }

         this.bj.b("levelRenderer");
         if (!this.aU) {
            this.f.o();
         }

         this.bj.b("level");
         if (!this.aU) {
            this.u.f();
         }
      } else if (this.j.g() != null) {
         this.j.b();
      }

      if (!this.aU) {
         this.at.a();
      }

      this.as.a(this.aU);
      if (this.u != null) {
         if (!this.aU) {
            if (!this.m.s && this.bx()) {
               tf $$1 = tf.c("tutorial.socialInteractions.title");
               tf $$2 = tf.a("tutorial.socialInteractions.description", gea.a("socialInteractions"));
               this.bi = new eup(eup.a.f, $$1, $$2, true);
               this.aI.a(this.bi, 160);
               this.m.s = true;
               this.m.aq();
            }

            this.aI.d();

            try {
               this.u.a(() -> true);
            } catch (Throwable var4) {
               o $$4 = o.a(var4, "Exception in world tick");
               if (this.u == null) {
                  p $$5 = $$4.a("Affected level");
                  $$5.a("Problem", "Level is null!");
               } else {
                  this.u.a($$4);
               }

               throw new y($$4);
            }
         }

         this.bj.b("animateTick");
         if (!this.aU && this.u != null) {
            this.u.b(this.v.do(), this.v.dq(), this.v.du());
         }

         this.bj.b("particles");
         if (!this.aU) {
            this.g.b();
         }
      } else if (this.aR != null) {
         this.bj.b("pendingConnection");
         this.aR.d();
      }

      this.bj.b("keyboard");
      this.o.b();
      this.bj.c();
   }

   private boolean bx() {
      return !this.aS || this.aQ != null && this.aQ.p();
   }

   private void by() {
      while (this.m.P.g()) {
         epy $$0 = this.m.au();
         this.m.a(this.m.au().c());
         if ($$0.a() != this.m.au().a()) {
            this.j.a(this.m.au().a() ? this.am() : null);
         }

         this.f.r();
      }

      while (this.m.Q.g()) {
         this.m.af = !this.m.af;
      }

      for (int $$1 = 0; $$1 < 9; $$1++) {
         boolean $$2 = this.m.V.e();
         boolean $$3 = this.m.W.e();
         if (this.m.U[$$1].g()) {
            if (this.v.G_()) {
               this.l.g().a($$1);
            } else if (!this.v.f() || this.B != null || !$$3 && !$$2) {
               this.v.fQ().l = $$1;
            } else {
               ezl.a(this, $$1, $$3, $$2);
            }
         }
      }

      while (this.m.N.g()) {
         if (!this.bx()) {
            this.v.a(M, true);
            this.bt.c(M);
         } else {
            if (this.bi != null) {
               this.aI.a(this.bi);
               this.bi = null;
            }

            this.a(new fcd());
         }
      }

      while (this.m.E.g()) {
         if (this.t.i()) {
            this.v.i();
         } else {
            this.aI.a();
            this.a(new ezw(this.v));
         }
      }

      while (this.m.T.g()) {
         this.a(new eyo(this.v.cl.q()));
      }

      while (this.m.F.g()) {
         if (!this.v.G_()) {
            this.J().b(new abz(abz.a.g, gu.b, ha.a));
         }
      }

      while (this.m.G.g()) {
         if (!this.v.G_() && this.v.a(exz.p())) {
            this.v.a(bgp.a);
         }
      }

      while (this.m.K.g()) {
         this.a("");
      }

      if (this.B == null && this.aZ == null && this.m.M.g()) {
         this.a("/");
      }

      boolean $$4 = false;
      if (this.v.fl()) {
         if (!this.m.H.e()) {
            this.t.b(this.v);
         }

         while (this.m.I.g()) {
         }

         while (this.m.H.g()) {
         }

         while (this.m.J.g()) {
         }
      } else {
         while (this.m.I.g()) {
            $$4 |= this.bv();
         }

         while (this.m.H.g()) {
            this.bw();
         }

         while (this.m.J.g()) {
            this.bz();
         }
      }

      if (this.m.H.e() && this.aT == 0 && !this.v.fl()) {
         this.bw();
      }

      this.f(this.B == null && !$$4 && this.m.I.e() && this.n.h());
   }

   public gdb u() {
      return this.aM;
   }

   public double v() {
      return this.bq;
   }

   public fir w() {
      return this.aN;
   }

   public fct y() {
      return new fct(this, this.af);
   }

   public void a(String $$0, ebx.c $$1, amx $$2, afm $$3, boolean $$4) {
      this.z();
      this.Z.set(null);
      Instant $$5 = Instant.now();

      try {
         $$1.a($$3.c().a(), $$3.d());
         afj $$6 = afj.a(this.ay, this.p);
         $$6.e().a(this);
         ddw.a($$6, this);
         anv.a(false);
         this.aQ = MinecraftServer.a((Function<Thread, gck>)($$4x -> new gck($$4x, this, $$1, $$2, $$3, $$6, $$0xx -> {
               akx $$1xx = new akx($$0xx + 0);
               this.Z.set($$1xx);
               return akw.a($$1xx, this.bg::add);
            })));
         this.aS = true;
         this.a(fjf.a());
         this.aP.a(fmv.c.a, $$0, $$3.d().g());
      } catch (Throwable var12) {
         o $$8 = o.a(var12, "Starting integrated server");
         p $$9 = $$8.a("Starting integrated server");
         $$9.a("Level ID", $$0);
         $$9.a("Level Name", () -> $$3.d().g());
         throw new y($$8);
      }

      while (this.Z.get() == null) {
         Thread.yield();
      }

      exj $$10 = new exj(this.Z.get());
      this.a($$10);
      this.bj.a("waitForServer");

      while (!this.aQ.ae()) {
         $$10.c();
         this.e(false);

         try {
            Thread.sleep(16L);
         } catch (InterruptedException var11) {
         }

         if (this.bc != null) {
            c(this.bc.get());
            return;
         }
      }

      this.bj.c();
      Duration $$11 = Duration.between($$5, Instant.now());
      SocketAddress $$12 = this.aQ.ad().a();
      sg $$13 = sg.a($$12);
      $$13.a($$12.toString(), 0, new fih($$13, this, null, null, $$4, $$11, $$0x -> {
      }));
      $$13.a(new adh(this.V().c(), this.V().b()));
      this.aR = $$13;
   }

   public void a(fii $$0) {
      exx $$1 = new exx(true);
      $$1.a(tf.c("connect.joining"));
      this.e($$1);
      this.u = $$0;
      this.b($$0);
      if (!this.aS) {
         afj $$2 = afj.a(this.ay, this.p);
         $$2.e().a(this);
         ddw.a($$2, this);
         anv.a(false);
      }
   }

   public void z() {
      this.b((exz)(new exx(true)));
   }

   public void b(exz $$0) {
      fij $$1 = this.J();
      if ($$1 != null) {
         this.bp();
         $$1.j();
      }

      this.aJ.b();
      if (this.bn.e()) {
         this.bu();
      }

      gck $$2 = this.aQ;
      this.aQ = null;
      this.j.i();
      this.t = null;
      this.bt.b();
      this.e($$0);
      if (this.u != null) {
         if ($$2 != null) {
            this.bj.a("waitForServer");

            while (!$$2.C()) {
               this.e(false);
            }

            this.bj.c();
         }

         this.am.a();
         this.l.i();
         this.aS = false;
      }

      this.u = null;
      this.b(null);
      this.v = null;
      ddw.c();
      this.r.c();
      this.s.c();
   }

   public void c(exz $$0) {
      if (this.bn.e()) {
         this.bu();
      }

      this.j.i();
      this.t = null;
      this.bt.b();
      this.e($$0);
      this.l.i();
      this.am.a();
      this.u = null;
      this.b(null);
      this.v = null;
      ddw.c();
      this.r.c();
      this.s.c();
   }

   private void e(exz $$0) {
      this.bj.a("forcedTick");
      this.as.e();
      this.w = null;
      this.aR = null;
      this.a($$0);
      this.e(false);
      this.bj.c();
   }

   public void d(exz $$0) {
      this.bj.a("forcedTick");
      this.a($$0);
      this.e(false);
      this.bj.c();
   }

   private void b(@Nullable fii $$0) {
      this.f.a($$0);
      this.g.a($$0);
      this.aL.a($$0);
      this.d();
   }

   public boolean A() {
      return this.B() && this.m.ad().c();
   }

   public boolean B() {
      return this.C() && this.aA.properties().flag(UserFlag.OPTIONAL_TELEMETRY_AVAILABLE);
   }

   public boolean C() {
      return this.aA.properties().flag(UserFlag.TELEMETRY_ENABLED);
   }

   public boolean D() {
      return this.ai && this.aA.properties().flag(UserFlag.SERVERS_ALLOWED) && this.G() == null;
   }

   public boolean E() {
      return this.aA.properties().flag(UserFlag.REALMS_ALLOWED) && this.G() == null;
   }

   public boolean F() {
      return this.G() != null;
   }

   @Nullable
   public BanDetails G() {
      return (BanDetails)this.aA.properties().bannedScopes().get("MULTIPLAYER");
   }

   public boolean a(UUID $$0) {
      return this.H().a(false) ? this.aJ.c($$0) : (this.v == null || !$$0.equals(this.v.cv())) && !$$0.equals(ac.d);
   }

   public eqm.a H() {
      if (this.m.l().c() == cbl.c) {
         return eqm.a.b;
      } else if (!this.aj) {
         return eqm.a.c;
      } else {
         return !this.aA.properties().flag(UserFlag.CHAT_ALLOWED) ? eqm.a.d : eqm.a.a;
      }
   }

   public final boolean I() {
      return this.ah;
   }

   @Nullable
   public fij J() {
      return this.v == null ? null : this.v.cl;
   }

   public static boolean K() {
      return !H.m.Z;
   }

   public static boolean L() {
      return H.m.i().c().a() >= eqf.b.a();
   }

   public static boolean M() {
      return !H.j.a() && H.m.i().c().a() >= eqf.c.a();
   }

   public static boolean N() {
      return H.m.j().c();
   }

   private void bz() {
      if (this.y != null && this.y.c() != ehc.a.a) {
         boolean $$0 = this.v.fR().d;
         dcm $$1 = null;
         ehc.a $$2 = this.y.c();
         ciy $$6;
         if ($$2 == ehc.a.b) {
            gu $$3 = ((eha)this.y).a();
            dfa $$4 = this.u.a_($$3);
            if ($$4.i()) {
               return;
            }

            csm $$5 = $$4.b();
            $$6 = $$5.a((cos)this.u, $$3, $$4);
            if ($$6.b()) {
               return;
            }

            if ($$0 && exz.p() && $$4.t()) {
               $$1 = this.u.c_($$3);
            }
         } else {
            if ($$2 != ehc.a.c || !$$0) {
               return;
            }

            bii $$7 = ((ehb)this.y).a();
            $$6 = $$7.dx();
            if ($$6 == null) {
               return;
            }
         }

         if ($$6.b()) {
            String $$10 = "";
            if ($$2 == ehc.a.b) {
               $$10 = jb.f.b(this.u.a_(((eha)this.y).a()).b()).toString();
            } else if ($$2 == ehc.a.c) {
               $$10 = jb.h.b(((ehb)this.y).a().ag()).toString();
            }

            I.warn("Picking on: [{}] {} gave null item", $$2, $$10);
         } else {
            cbm $$11 = this.v.fQ();
            if ($$1 != null) {
               this.a($$6, $$1);
            }

            int $$12 = $$11.b($$6);
            if ($$0) {
               $$11.a($$6);
               this.t.a(this.v.b(bgp.a), 36 + $$11.l);
            } else if ($$12 != -1) {
               if (cbm.d($$12)) {
                  $$11.l = $$12;
               } else {
                  this.t.a($$12);
               }
            }
         }
      }
   }

   private void a(ciy $$0, dcm $$1) {
      qr $$2 = $$1.m();
      cgr.a($$0, $$1.u(), $$2);
      if ($$0.d() instanceof cjm && $$2.e("SkullOwner")) {
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
      a($$1, this, this.ao, this.ac, this.m);
      if (this.u != null) {
         this.u.a($$0);
      }

      if (this.aQ != null) {
         this.aQ.b($$1);
      }

      this.bo.a($$0);
      return $$0;
   }

   public static void a(@Nullable eqm $$0, @Nullable fzt $$1, String $$2, @Nullable eqq $$3, o $$4) {
      ab $$5 = $$4.g();
      a($$5, $$0, $$1, $$2, $$3);
   }

   private static ab a(ab $$0, @Nullable eqm $$1, @Nullable fzt $$2, String $$3, eqq $$4) {
      $$0.a("Launched Version", () -> $$3);
      $$0.a("Backend library", RenderSystem::getBackendDescription);
      $$0.a("Backend API", RenderSystem::getApiDescription);
      $$0.a("Window size", () -> $$1 != null ? $$1.S.k() + "x" + $$1.S.l() : "<not initialized>");
      $$0.a("GL Caps", RenderSystem::getCapsString);
      $$0.a("GL debug messages", () -> ejy.b() ? String.join("\n", ejy.a()) : "<disabled>");
      $$0.a("Using VBOs", () -> "Yes");
      $$0.a("Is Modded", () -> e().b());
      $$0.a("Type", "Client (map_client.txt)");
      if ($$4 != null) {
         if (H != null) {
            String $$5 = H.ah().m();
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

      $$0.a("CPU", ejz::b);
      return $$0;
   }

   public static eqm O() {
      return H;
   }

   public CompletableFuture<Void> P() {
      return this.a(this::k).thenCompose($$0 -> (CompletionStage<Void>)$$0);
   }

   public void a(fjf $$0) {
      if (!this.bv.a($$0)) {
         this.bv = fjh.a($$0, this.aA);
      }
   }

   @Nullable
   public fis Q() {
      return x.a(this.J(), fij::w);
   }

   public boolean R() {
      return this.aS;
   }

   public boolean S() {
      return this.aS && this.aQ != null;
   }

   @Nullable
   public gck T() {
      return this.aQ;
   }

   public boolean U() {
      gck $$0 = this.T();
      return $$0 != null && !$$0.p();
   }

   public boolean b(UUID $$0) {
      return $$0.equals(this.V().b());
   }

   public erb V() {
      return this.Y;
   }

   public GameProfile W() {
      GameProfile $$0 = this.O.join();
      return $$0 != null ? $$0 : new GameProfile(this.Y.b(), this.Y.c());
   }

   public Proxy X() {
      return this.ae;
   }

   public fym Y() {
      return this.P;
   }

   public anm Z() {
      return this.ak;
   }

   public amx aa() {
      return this.an;
   }

   public amd ab() {
      return this.al;
   }

   public fze ac() {
      return this.am;
   }

   public Path ad() {
      return this.N;
   }

   public fzt ae() {
      return this.ao;
   }

   public Function<aer, fyl> a(aer $$0) {
      return this.aC.a($$0)::a;
   }

   public boolean af() {
      return this.ag;
   }

   public boolean ag() {
      return this.aU;
   }

   public fnf ah() {
      return this.aw;
   }

   public gcx ai() {
      return this.as;
   }

   public aot aj() {
      aot $$0 = x.a(this.B, exz::A);
      if ($$0 != null) {
         return $$0;
      } else if (this.v != null) {
         if (this.v.dK().ac() == cpm.j) {
            return this.l.j().b() ? aou.d : aou.e;
         } else {
            he<cqk> $$1 = this.v.dK().s(this.v.dk());
            if (!this.at.c(aou.f) && (!this.v.bc() || !$$1.a(apk.Y))) {
               return this.v.dK().ac() != cpm.i && this.v.fR().d && this.v.fR().c ? aou.b : $$1.a().o().orElse(aou.g);
            } else {
               return aou.f;
            }
         }
      } else {
         return aou.a;
      }
   }

   public MinecraftSessionService ak() {
      return this.az;
   }

   public fzm al() {
      return this.aB;
   }

   @Nullable
   public bii am() {
      return this.w;
   }

   public void a(bii $$0) {
      this.w = $$0;
      this.j.a($$0);
   }

   public boolean b(bii $$0) {
      return $$0.cc() || this.v != null && this.v.G_() && this.m.S.e() && $$0.ag() == bim.bt;
   }

   @Override
   protected Thread au() {
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

   public foe an() {
      return this.aD;
   }

   public fsm ao() {
      return this.V;
   }

   public fpk ap() {
      return this.aL;
   }

   public ftm aq() {
      return this.W;
   }

   public <T> gcg<T> a(gcf.a<T> $$0) {
      return this.X.a($$0);
   }

   public <T> void a(gcf.a<T> $$0, List<T> $$1) {
      this.X.a($$0, $$1);
   }

   public arw ar() {
      return this.q;
   }

   public DataFixer as() {
      return this.Q;
   }

   public float av() {
      return this.T.a;
   }

   public float aw() {
      return this.T.b;
   }

   public ern ax() {
      return this.ap;
   }

   public boolean ay() {
      return this.v != null && this.v.gg() || this.m.Q().c();
   }

   public euo az() {
      return this.aH;
   }

   public gea aA() {
      return this.aI;
   }

   public boolean aB() {
      return this.bf;
   }

   public eqi aC() {
      return this.aa;
   }

   public gas aD() {
      return this.aC;
   }

   public fzk aE() {
      return this.aE;
   }

   public fzj aF() {
      return this.aF;
   }

   public erx aG() {
      return this.aG;
   }

   @Override
   public void a(boolean $$0) {
      this.bf = $$0;
   }

   public tf a(File $$0, int $$1, int $$2) {
      int $$3 = this.S.k();
      int $$4 = this.S.l();
      ejs $$5 = new ejt($$1, $$2, true, a);
      float $$6 = this.v.dC();
      float $$7 = this.v.dA();
      float $$8 = this.v.O;
      float $$9 = this.v.N;
      this.j.b(false);

      ts var12;
      try {
         this.j.c(true);
         this.f.e();
         this.S.b($$1);
         this.S.c($$2);

         for (int $$10 = 0; $$10 < 6; $$10++) {
            switch ($$10) {
               case 0:
                  this.v.r($$7);
                  this.v.s(0.0F);
                  break;
               case 1:
                  this.v.r(($$7 + 90.0F) % 360.0F);
                  this.v.s(0.0F);
                  break;
               case 2:
                  this.v.r(($$7 + 180.0F) % 360.0F);
                  this.v.s(0.0F);
                  break;
               case 3:
                  this.v.r(($$7 - 90.0F) % 360.0F);
                  this.v.s(0.0F);
                  break;
               case 4:
                  this.v.r($$7);
                  this.v.s(-90.0F);
                  break;
               case 5:
               default:
                  this.v.r($$7);
                  this.v.s(90.0F);
            }

            this.v.N = this.v.dA();
            this.v.O = this.v.dC();
            $$5.a(true);
            this.j.a(1.0F, 0L, new elg());

            try {
               Thread.sleep(10L);
            } catch (InterruptedException var17) {
            }

            eqx.a($$0, "panorama_" + $$10 + ".png", $$5, $$0x -> {
            });
         }

         tf $$11 = tf.b($$0.getName()).a(n.t).a($$1x -> $$1x.a(new td(td.a.b, $$0.getAbsolutePath())));
         return tf.a("screenshot.success", $$11);
      } catch (Exception var18) {
         I.error("Couldn't save image", var18);
         var12 = tf.a("screenshot.failure", var18.getMessage());
      } finally {
         this.v.s($$6);
         this.v.r($$7);
         this.v.O = $$8;
         this.v.N = $$9;
         this.j.b(true);
         this.S.b($$3);
         this.S.c($$4);
         $$5.a();
         this.j.c(false);
         this.f.e();
         this.g().a(true);
      }

      return var12;
   }

   private tf a(File $$0, int $$1, int $$2, int $$3, int $$4) {
      try {
         ByteBuffer $$5 = ejz.a($$1 * $$2 * 3);
         eqx $$6 = new eqx($$0, $$3, $$4, $$2);
         float $$7 = (float)$$3 / (float)$$1;
         float $$8 = (float)$$4 / (float)$$2;
         float $$9 = $$7 > $$8 ? $$7 : $$8;

         for (int $$10 = ($$4 - 1) / $$2 * $$2; $$10 >= 0; $$10 -= $$2) {
            for (int $$11 = 0; $$11 < $$3; $$11 += $$1) {
               RenderSystem.setShaderTexture(0, fyk.e);
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
         ejz.a($$5);
         tf $$15 = tf.b($$14.getName()).a(n.t).a($$1x -> $$1x.a(new td(td.a.b, $$14.getAbsolutePath())));
         return tf.a("screenshot.success", $$15);
      } catch (Exception var15) {
         I.warn("Couldn't save screenshot", var15);
         return tf.a("screenshot.failure", var15.getMessage());
      }
   }

   public bdh aH() {
      return this.bj;
   }

   @Nullable
   public akx aI() {
      return this.Z.get();
   }

   public fzn aJ() {
      return this.av;
   }

   @Nullable
   public ext aK() {
      return this.aZ;
   }

   public fcb aL() {
      return this.aJ;
   }

   public boolean aM() {
      return false;
   }

   public ekk aN() {
      return this.S;
   }

   public fnr aO() {
      return this.U;
   }

   public void b(int $$0) {
      this.aC.a($$0);
   }

   public fhj aP() {
      return this.aK;
   }

   public boolean aQ() {
      return this.aA.properties().flag(UserFlag.PROFANITY_FILTER_ENABLED);
   }

   public void aR() {
      this.aJ.a();
      this.w().a();
   }

   public equ aS() {
      return this.bs;
   }

   @Nullable
   public arz aT() {
      return arz.a(this.ay.getServicesKeySet(), ServicesKeyType.PROFILE_KEY);
   }

   public eqj aU() {
      return this.ab;
   }

   public void a(eqj $$0) {
      this.ab = $$0;
   }

   public eqe aV() {
      return this.bt;
   }

   public fiv aW() {
      return this.bu;
   }

   public fjh aX() {
      return this.bv;
   }

   public enn aY() {
      return this.aO;
   }

   public fmv aZ() {
      return this.aP;
   }

   public eqb ba() {
      return this.bw;
   }

   public egu bb() {
      return this.bx;
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
      d(tf.a("chat.disabled.profile", tf.d(eqm.H.m.K.h())).a(n.m)) {
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
}
