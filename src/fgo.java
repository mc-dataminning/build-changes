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
import javax.annotation.Nullable;
import net.minecraft.client.ClientBrandRetriever;
import net.minecraft.server.MinecraftServer;
import org.apache.commons.io.FileUtils;
import org.joml.Matrix4f;
import org.joml.Matrix4fStack;
import org.lwjgl.util.tinyfd.TinyFileDialogs;
import org.slf4j.Logger;

public class fgo extends bpl<Runnable> implements fan {
   static fgo E;
   private static final Logger F = LogUtils.getLogger();
   public static final boolean a = ad.k() == ad.a.d;
   private static final int G = 10;
   public static final akr b = akr.b("default");
   public static final akr c = akr.b("uniform");
   public static final akr d = akr.b("alt");
   private static final akr H = akr.b("regional_compliancies.json");
   private static final CompletableFuture<azs> I = CompletableFuture.completedFuture(azs.a);
   private static final wz J = wz.c("multiplayer.socialInteractions.not_available");
   public static final String e = "Please make sure you have up-to-date drivers (see aka.ms/mcdriver for instructions).";
   private final long K = Double.doubleToLongBits(Math.PI);
   private final Path L;
   private final CompletableFuture<ProfileResult> M;
   private final gqm N;
   private final DataFixer O;
   private final gfr P;
   private final fam Q;
   private final fgf.b R = new fgf.b(20.0F, 0L, this::a);
   private final gff S;
   public final gex f;
   private final gkh T;
   private final glh U;
   public final gcp g;
   private final fhb V;
   public final fhx h;
   public final fhx i;
   public final ges j;
   public final gim k;
   private final AtomicReference<arh> W = new AtomicReference<>();
   public final fhy l;
   public final fgs m;
   private final fgk X;
   public final fgp n;
   public final fgn o;
   private fgl Y = fgl.a;
   public final File p;
   private final String Z;
   private final String aa;
   private final Proxy ab;
   private final erf ac;
   private final boolean ad;
   private final boolean ae;
   private final boolean af;
   private final aub ag;
   private final asu ah;
   private final gtc ai;
   private final atp aj;
   private final grt ak;
   private final fhq al;
   private final fhu am;
   private final ezv an;
   private final gvf ao;
   private final gva ap;
   private final flb aq;
   private final grn ar;
   private final get as;
   private final fgu at = new fgu(H, fgo::b);
   private final YggdrasilAuthenticationService au;
   private final MinecraftSessionService av;
   private final UserApiService aw;
   private final CompletableFuture<UserProperties> ax;
   private final grm ay;
   private final gst az;
   private final gft aA;
   private final grk aB;
   private final grj aC;
   private final gri aD;
   private final fia aE;
   private final fkw aF;
   private final gwi aG;
   private final fsu aH;
   private final fyg aI;
   private final ggy aJ;
   private final gvj aK;
   private final fzr aL;
   private final fdm aM;
   private final gej aN;
   @Nullable
   public fzo q;
   @Nullable
   public fzf r;
   @Nullable
   public geb s;
   @Nullable
   private guo aO;
   @Nullable
   private vt aP;
   private boolean aQ;
   @Nullable
   public bsr t;
   @Nullable
   public bsr u;
   @Nullable
   public exa v;
   private int aR;
   protected int w;
   private volatile boolean aS;
   private long aT = ad.d();
   private long aU;
   private int aV;
   public boolean x;
   @Nullable
   public fod y;
   @Nullable
   private fnx aW;
   private boolean aX;
   private Thread aY;
   private volatile boolean aZ;
   @Nullable
   private Supplier<o> ba;
   private static int bb;
   public String z = "";
   private long bc;
   public boolean A;
   public boolean B;
   public boolean C;
   public boolean D = true;
   private boolean bd;
   private final Queue<Runnable> be = Queues.newConcurrentLinkedQueue();
   @Nullable
   private CompletableFuture<Void> bf;
   @Nullable
   private fkx bg;
   private bnf bh = bnc.a;
   private int bi;
   private final bmz bj = new bmz(ad.c, () -> this.bi);
   @Nullable
   private bne bk;
   private bot bl = bos.a;
   private final fgx bm = new fgx();
   private long bn;
   private double bo;
   @Nullable
   private fbb.a bp;
   private final fgg bq;
   private final fzz br;
   private gao bs;
   private final fgc bt;
   private final ews bu;
   private boolean bv;
   private final long bw;
   private long bx;
   private String by = "root";

   public fgo(fua $$0) {
      super("Client");
      E = this;
      this.bw = System.currentTimeMillis();
      this.p = $$0.c.a;
      File $$1 = $$0.c.c;
      this.L = $$0.c.b.toPath();
      this.Z = $$0.d.b;
      this.aa = $$0.d.c;
      Path $$2 = this.p.toPath();
      this.bu = erf.a($$2.resolve("allowed_symlinks.txt"));
      grc $$3 = new grc($$0.c.a(), this.bu);
      this.ai = new gtc(this, $$2.resolve("downloads"), $$0.a);
      atr $$4 = new atk(this.L, ass.a, atq.b, this.bu);
      this.aj = new atp($$3, this.ai.a(), $$4);
      this.ah = $$3.a();
      this.ab = $$0.a.d;
      this.au = new YggdrasilAuthenticationService(this.ab);
      this.av = this.au.createMinecraftSessionService();
      this.V = $$0.a.a;
      this.M = CompletableFuture.supplyAsync(() -> this.av.fetchProfile(this.V.b(), true), ad.i());
      this.aw = this.a(this.au, $$0);
      this.ax = CompletableFuture.supplyAsync(() -> {
         try {
            return this.aw.fetchProperties();
         } catch (AuthenticationException var2x) {
            F.error("Failed to fetch user properties", var2x);
            return UserApiService.OFFLINE_PROPERTIES;
         }
      }, ad.i());
      F.info("Setting user: {}", this.V.c());
      F.debug("(Session ID is {})", this.V.a());
      this.ad = $$0.d.a;
      this.ae = !$$0.d.d;
      this.af = !$$0.d.e;
      this.aO = null;
      ye.a(fgm::a);
      this.O = azx.a();
      this.aF = new fkw(this);
      this.aY = Thread.currentThread();
      this.m = new fgs(this, this.p);
      RenderSystem.setShaderGlintAlpha(this.m.an().c());
      this.aZ = true;
      this.aG = new gwi(this, this.m);
      this.X = new fgk($$2, this.O);
      F.info("Backend library: {}", RenderSystem.getBackendDescription());
      faa $$5;
      if (this.m.p > 0 && this.m.o > 0) {
         $$5 = new faa(this.m.o, this.m.p, $$0.b.c, $$0.b.d, $$0.b.e);
      } else {
         $$5 = $$0.b;
      }

      ad.c = RenderSystem.initBackendSystem();
      this.P = new gfr(this);
      this.Q = this.P.a($$5, this.m.k, this.bd());
      this.a(true);
      gvu.a.b(gvq.A);

      try {
         this.Q.a(this.ah, ab.b().g() ? fad.a : fad.b);
      } catch (IOException var13) {
         F.error("Couldn't set icon", var13);
      }

      this.Q.a(this.m.h().c());
      this.n = new fgp(this);
      this.n.a(this.Q.j());
      this.o = new fgn(this);
      this.o.a(this.Q.j());
      RenderSystem.initRenderer(this.m.u, false);
      this.an = new ezs(this.Q.l(), this.Q.m());
      this.an.a(0.0F, 0.0F, 0.0F, 0.0F);
      this.an.b(a);
      this.ag = new aub(ass.a);
      this.aj.a();
      this.m.b(this.aj);
      this.ak = new grt(this.m.ac, $$0x -> {
         if (this.s != null) {
            this.s.h.A();
         }
      });
      this.ag.a(this.ak);
      this.N = new gqm(this.ag);
      this.ag.a(this.N);
      this.ay = new grm(this.N, $$1.toPath().resolve("skins"), this.av, this);
      this.ac = new erf($$2.resolve("saves"), $$2.resolve("backups"), this.bu, this.O);
      this.bt = new fgc($$2);
      this.ao = new gvf(this.m);
      this.ag.a(this.ao);
      this.ar = new grn(this.V);
      this.ag.a(this.ar);
      this.ap = new gva(this);
      this.aq = new flb(this.N);
      this.h = this.aq.a();
      this.i = this.aq.b();
      this.ag.a(this.aq);
      this.g();
      this.ag.a(new grf());
      this.ag.a(new gre());
      this.Q.a("Startup");
      RenderSystem.setupDefaultState(0, 0, this.Q.l(), this.Q.m());
      this.Q.a("Post startup");
      this.al = fhq.a();
      this.am = fhu.a(this.al);
      this.az = new gst(this.N, this.al, this.m.C().c());
      this.ag.a(this.az);
      this.aI = new fyg();
      this.ag.a(this.aI);
      this.aJ = new ggy(this.h, this.aI, this::ao, this::ar, this::ap);
      this.ag.a(this.aJ);
      gem $$8 = new gem(this.aJ, this.aI);
      this.ag.a($$8);
      this.U = new glh(this, this.N, this.az, this.am, $$8);
      this.ag.a(this.U);

      try {
         int $$9 = Runtime.getRuntime().availableProcessors();
         fbk.a();
         this.S = new gff($$9);
      } catch (OutOfMemoryError var12) {
         TinyFileDialogs.tinyfd_messageBox(
            "Minecraft",
            "Oh no! The game was unable to allocate memory off-heap while trying to start. You may try to free some memory by closing other applications on your computer, check that your system meets the minimum requirements, and try again. If the problem persists, please visit: "
               + axj.k,
            "ok",
            "error",
            true
         );
         throw new fub("Unable to allocate render buffers", var12);
      }

      this.aH = new fsu(this, this.aw);
      this.aA = new gft(this.az.b(), $$8, this.al);
      this.ag.a(this.aA);
      this.T = new gkh(this, this.N, this.U, this.aA, this.h, this.m, this.aI);
      this.ag.a(this.T);
      this.g = new gcp(this.r, this.N);
      this.ag.a(this.g);
      this.aB = new grk(this.N);
      this.ag.a(this.aB);
      this.aC = new grj(this.N);
      this.ag.a(this.aC);
      this.aD = new gri(this.N);
      this.ag.a(this.aD);
      this.aE = new fia(this.N);
      this.ag.a(this.aE);
      this.j = new ges(this, this.T.d(), this.ag, this.S);
      this.ag.a(this.j.d());
      this.f = new gex(this, this.T, this.aJ, this.S);
      this.ag.a(this.f);
      this.as = new get();
      this.ag.a(this.as);
      this.ag.a(this.at);
      this.l = new fhy(this);
      this.k = new gim(this);
      fby $$11 = fby.a(this);
      this.aM = new fdm($$11);
      RenderSystem.setErrorCallback(this::a);
      if (this.an.c != this.Q.l() || this.an.d != this.Q.m()) {
         StringBuilder $$12 = new StringBuilder(
            "Recovering from unsupported resolution ("
               + this.Q.l()
               + "x"
               + this.Q.m()
               + ").\nPlease make sure you have up-to-date drivers (see aka.ms/mcdriver for instructions)."
         );
         if (fab.b()) {
            $$12.append("\n\nReported GL debug messages:\n").append(String.join("\n", fab.a()));
         }

         this.Q.a(this.an.c, this.an.d);
         TinyFileDialogs.tinyfd_messageBox("Minecraft", $$12.toString(), "ok", "error", false);
      } else if (this.m.aa().c() && !this.Q.k()) {
         this.Q.i();
         this.m.aa().a(this.Q.k());
      }

      this.Q.a(this.m.N().c());
      this.Q.b(this.m.G().c());
      this.Q.d();
      this.a();
      this.j.a(this.ah.d());
      this.aK = new gvj(this, this.aw, this.V);
      this.aL = fzr.a(this.aw, this.V, $$2);
      this.bq = new fgg(this);
      this.bq.a(this.m.as().c() != fgq.a);
      this.br = new fzz(this);
      this.br.a(this.m.A().c());
      this.bs = gao.a(gal.a(), this.aw);
      fnt.a(this);
      this.a(new fno(wz.c("gui.loadingMinecraft")));
      List<asq> $$13 = this.aj.g();
      this.bm.a(fgx.b.a, $$13);
      aua $$14 = this.ag.a(ad.g(), this, I, $$13);
      gvu.a.a(gvq.C);
      fgo.b $$15 = new fgo.b($$11, $$0.e);
      this.a(new fnt(this, $$14, $$1x -> ad.a($$1x, $$1xx -> this.a($$1xx, $$15), () -> {
            if (ab.aU) {
               this.bg();
            }

            this.bm.a();
            this.a($$15);
         }), false));
      this.aN = gej.a($$0.e.b());
   }

   private void a(@Nullable fgo.b $$0) {
      if (!this.bv) {
         this.bv = true;
         this.b($$0);
      }
   }

   private void b(@Nullable fgo.b $$0) {
      Runnable $$1 = this.c($$0);
      gvu.a.b(gvq.C);
      gvu.a.b(gvq.z);
      gvu.a.a(this.aK.a());
      $$1.run();
   }

   public boolean c() {
      return this.bv;
   }

   private Runnable c(@Nullable fgo.b $$0) {
      List<Function<Runnable, fod>> $$1 = new ArrayList<>();
      this.a($$1);
      Runnable $$2 = () -> {
         if ($$0 != null && $$0.b().a()) {
            gei.a(this, $$0.b(), $$0.a());
         } else {
            this.a(new fof(true));
         }
      };

      for (Function<Runnable, fod> $$3 : Lists.reverse($$1)) {
         fod $$4 = $$3.apply($$2);
         $$2 = () -> this.a($$4);
      }

      return $$2;
   }

   private void a(List<Function<Runnable, fod>> $$0) {
      if (this.m.ad) {
         $$0.add($$0x -> new fmv(this.m, $$0x));
      }

      BanDetails $$1 = this.H();
      if ($$1 != null) {
         $$0.add($$1x -> fmy.a($$1xx -> {
               if ($$1xx) {
                  ad.k().a(axj.n);
               }

               $$1x.run();
            }, $$1));
      }

      ProfileResult $$2 = this.M.join();
      if ($$2 != null) {
         GameProfile $$3 = $$2.profile();
         Set<ProfileActionType> $$4 = $$2.actions();
         if ($$4.contains(ProfileActionType.FORCED_NAME_CHANGE)) {
            $$0.add($$1x -> fmy.a($$3.getName(), $$1x));
         }

         if ($$4.contains(ProfileActionType.USING_BANNED_SKIN)) {
            $$0.add(fmy::a);
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
      this.Q.b(this.bd());
   }

   private String bd() {
      StringBuilder $$0 = new StringBuilder("Minecraft");
      if (e().a()) {
         $$0.append("*");
      }

      $$0.append(" ");
      $$0.append(ab.b().c());
      fzg $$1 = this.L();
      if ($$1 != null && $$1.k().i()) {
         $$0.append(" - ");
         fzt $$2 = this.S();
         if (this.aO != null && !this.aO.r()) {
            $$0.append(grr.a("title.singleplayer"));
         } else if ($$2 != null && $$2.e()) {
            $$0.append(grr.a("title.multiplayer.realms"));
         } else if (this.aO == null && ($$2 == null || !$$2.d())) {
            $$0.append(grr.a("title.multiplayer.other"));
         } else {
            $$0.append(grr.a("title.multiplayer.lan"));
         }
      }

      return $$0.toString();
   }

   private UserApiService a(YggdrasilAuthenticationService $$0, fua $$1) {
      return $$1.a.a.g() != fhb.a.c ? UserApiService.OFFLINE : $$0.createUserApiService($$1.a.a.d());
   }

   public static ayn e() {
      return ayn.a("vanilla", ClientBrandRetriever::getClientModName, "Client", fgo.class);
   }

   private void a(Throwable $$0, @Nullable fgo.b $$1) {
      if (this.aj.d().size() > 1) {
         this.a($$0, null, $$1);
      } else {
         ad.a($$0);
      }
   }

   public void a(Throwable $$0, @Nullable wz $$1, @Nullable fgo.b $$2) {
      F.info("Caught error loading resourcepacks, removing all selected resourcepacks", $$0);
      this.bm.a($$0);
      this.ai.b();
      this.aj.b(Collections.emptyList());
      this.m.i.clear();
      this.m.j.clear();
      this.m.aw();
      this.a(true, $$2).thenRun(() -> this.a($$1));
   }

   private void be() {
      this.a(null);
      if (this.r != null) {
         this.r.Y();
         this.y();
      }

      this.a(new fof());
      this.a(null);
   }

   private void a(@Nullable wz $$0) {
      fkw $$1 = this.aw();
      fku.b($$1, fku.a.c, wz.c("resourcePack.load_fail"), $$0);
   }

   public void f() {
      this.aY = Thread.currentThread();
      if (Runtime.getRuntime().availableProcessors() > 4) {
         this.aY.setPriority(10);
      }

      try {
         boolean $$0 = false;

         while (this.aZ) {
            this.bf();

            try {
               bni $$1 = bni.a("Renderer");
               boolean $$2 = this.aN().e();
               this.bh = this.a($$2, $$1);
               this.bh.a();
               this.bl.c();
               this.c(!$$0);
               this.bl.d();
               this.bh.b();
               this.b($$2, $$1);
            } catch (OutOfMemoryError var4) {
               if ($$0) {
                  throw var4;
               }

               this.bi();
               this.a(new fnw());
               System.gc();
               F.error(LogUtils.FATAL_MARKER, "Out of memory", var4);
               $$0 = true;
            }
         }
      } catch (z var5) {
         F.error(LogUtils.FATAL_MARKER, "Reported exception thrown!", var5);
         this.c(var5.a());
      } catch (Throwable var6) {
         F.error(LogUtils.FATAL_MARKER, "Unreported exception thrown!", var6);
         this.c(new o("Unexpected error", var6));
      }
   }

   void g() {
      this.aq.a(this.m);
   }

   private void a(int $$0, long $$1) {
      this.m.N().a(false);
      this.m.aw();
   }

   public ezv h() {
      return this.an;
   }

   public String i() {
      return this.Z;
   }

   public String j() {
      return this.aa;
   }

   public void a(o $$0) {
      this.ba = () -> this.d($$0);
   }

   public void b(o $$0) {
      this.ba = () -> $$0;
   }

   private void bf() {
      if (this.ba != null) {
         a(this, this.p, this.ba.get());
      }
   }

   public void c(o $$0) {
      o $$1 = this.d($$0);
      this.bi();
      a(this, this.p, $$1);
   }

   public static void a(@Nullable fgo $$0, File $$1, o $$2) {
      Path $$3 = $$1.toPath().resolve("crash-reports");
      Path $$4 = $$3.resolve("crash-" + ad.f() + "-client.txt");
      akt.a($$2.a(y.a));
      if ($$0 != null) {
         $$0.ao.h();
      }

      if ($$2.e() != null) {
         akt.a("#@!@# Game crashed! Crash report saved to: #@!@# " + $$2.e().toAbsolutePath());
         System.exit(-1);
      } else if ($$2.a($$4, y.a)) {
         akt.a("#@!@# Game crashed! Crash report saved to: #@!@# " + $$4.toAbsolutePath());
         System.exit(-1);
      } else {
         akt.a("#@?@# Game crashed! Crash report could not be saved. #@?@#");
         System.exit(-2);
      }
   }

   public boolean k() {
      return this.m.P().c();
   }

   public CompletableFuture<Void> l() {
      return this.a(false, null);
   }

   private CompletableFuture<Void> a(boolean $$0, @Nullable fgo.b $$1) {
      if (this.bf != null) {
         return this.bf;
      } else {
         CompletableFuture<Void> $$2 = new CompletableFuture<>();
         if (!$$0 && this.aW instanceof fnt) {
            this.bf = $$2;
            return $$2;
         } else {
            this.aj.a();
            List<asq> $$3 = this.aj.g();
            if (!$$0) {
               this.bm.a(fgx.b.b, $$3);
            }

            this.a(new fnt(this, this.ag.a(ad.g(), this, I, $$3), $$3x -> ad.a($$3x, $$2xx -> {
                  if ($$0) {
                     this.ai.c();
                     this.be();
                  } else {
                     this.a($$2xx, $$1);
                  }
               }, () -> {
                  this.f.f();
                  this.bm.a();
                  this.ai.d();
                  $$2.complete(null);
                  this.a($$1);
               }), !$$0));
            return $$2;
         }
      }
   }

   private void bg() {
      boolean $$0 = false;
      gfs $$1 = this.ao().a();
      gsm $$2 = $$1.a().a();

      for (dfy $$3 : lt.e) {
         UnmodifiableIterator $$10 = $$3.l().a().iterator();

         while ($$10.hasNext()) {
            dtc $$4 = (dtc)$$10.next();
            if ($$4.l() == dmf.c) {
               gsm $$5 = $$1.b($$4);
               if ($$5 == $$2) {
                  F.debug("Missing model for: {}", $$4);
                  $$0 = true;
               }
            }
         }
      }

      gql $$6 = $$2.e();

      for (dfy $$7 : lt.e) {
         UnmodifiableIterator var17 = $$7.l().a().iterator();

         while (var17.hasNext()) {
            dtc $$8 = (dtc)var17.next();
            gql $$9 = $$1.a($$8);
            if (!$$8.i() && $$9 == $$6) {
               F.debug("Missing particle icon for: {}", $$8);
            }
         }
      }

      for (cul $$10 : lt.g) {
         cuq $$11 = $$10.w();
         String $$12 = $$11.t();
         String $$13 = wz.c($$12).getString();
         if ($$13.toLowerCase(Locale.ROOT).equals($$10.a())) {
            F.debug("Missing translation for: {} {} {}", new Object[]{$$11, $$12, $$10});
         }
      }

      $$0 |= fnu.a();
      $$0 |= gkk.a();
      if ($$0) {
         throw new IllegalStateException("Your game data is foobar, fix the errors above!");
      }
   }

   public erf m() {
      return this.ac;
   }

   private void a(String $$0) {
      fgo.a $$1 = this.J();
      if (!$$1.a(this.T())) {
         if (this.l.b()) {
            this.l.b(false);
            this.a(new fna($$0x -> {
               if ($$0x) {
                  ad.k().a(axj.g);
               }

               this.a(null);
            }, fgo.a.e, axj.g, true));
         } else {
            wz $$2 = $$1.a();
            this.l.a($$2, false);
            this.bq.c($$2);
            this.l.b($$1 == fgo.a.d);
         }
      } else {
         this.a(new fmz($$0));
      }
   }

   public void a(@Nullable fod $$0) {
      if (ab.aU && Thread.currentThread() != this.aY) {
         F.error("setScreen called from non-game thread");
      }

      if (this.y != null) {
         this.y.j();
      } else {
         this.a(fgl.a);
      }

      if ($$0 == null && this.aX) {
         throw new IllegalStateException("Trying to return to in-game GUI during disconnection");
      } else {
         if ($$0 == null && this.r == null) {
            $$0 = new fof();
         } else if ($$0 == null && this.s.ex()) {
            if (this.s.o()) {
               $$0 = new fnh(null, this.r.k().l());
            } else {
               this.s.fW();
            }
         }

         this.y = $$0;
         if (this.y != null) {
            this.y.aL_();
         }

         fbe.a();
         if ($$0 != null) {
            this.n.j();
            fgm.b();
            $$0.b(this, this.Q.p(), this.Q.q());
            this.x = false;
         } else {
            this.ao.i();
            this.n.i();
         }

         this.d();
      }
   }

   public void a(@Nullable fnx $$0) {
      this.aW = $$0;
   }

   public void n() {
      try {
         F.info("Stopping!");

         try {
            this.bq.c();
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
         ad.c = System::nanoTime;
         if (this.ba == null) {
            System.exit(0);
         }
      }
   }

   @Override
   public void close() {
      if (this.bp != null) {
         this.bp.a();
      }

      try {
         this.aK.close();
         this.at.close();
         this.az.close();
         this.aq.close();
         this.j.close();
         this.f.close();
         this.ao.g();
         this.g.a();
         this.aC.close();
         this.aB.close();
         this.aD.close();
         this.aE.close();
         this.N.close();
         this.ag.close();
         fln.b();
         ad.j();
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
      if (this.Q.c()) {
         this.q();
      }

      if (this.bf != null && !(this.aW instanceof fnt)) {
         CompletableFuture<Void> $$1 = this.bf;
         this.bf = null;
         this.l().thenRun(() -> $$1.complete(null));
      }

      Runnable $$2;
      while (($$2 = this.be.poll()) != null) {
         $$2.run();
      }

      int $$3 = this.R.a(ad.c(), $$0);
      if ($$0) {
         this.bh.a("scheduledExecutables");
         this.bB();
         this.bh.c();
         this.bh.a("tick");

         for (int $$4 = 0; $$4 < Math.min(10, $$3); $$4++) {
            this.bh.d("clientTick");
            this.t();
         }

         this.bh.c();
      }

      this.Q.a("Render");
      this.bh.a("sound");
      this.ao.a(this.j.l());
      this.bh.c();
      this.bh.a("render");
      long $$5 = ad.d();
      boolean $$7;
      if (!this.aN().d() && !this.bl.e()) {
         $$7 = false;
         this.bo = 0.0;
      } else {
         $$7 = this.bp == null || this.bp.b();
         if ($$7) {
            fbb.a().ifPresent(fbb::b);
         }
      }

      RenderSystem.clear(16640, a);
      this.an.a(true);
      ger.a();
      this.bh.a("display");
      RenderSystem.enableCull();
      this.bh.b("mouse");
      this.n.a();
      this.bh.c();
      if (!this.x) {
         this.bh.b("gameRenderer");
         this.j.a(this.R, $$0);
         this.bh.c();
      }

      if (this.bk != null) {
         this.bh.a("fpsPie");
         fhz $$8 = new fhz(this, this.S.c());
         this.a($$8, this.bk);
         $$8.e();
         this.bh.c();
      }

      this.bh.a("blit");
      this.an.e();
      this.an.a(this.Q.l(), this.Q.m());
      this.bc = ad.d() - $$5;
      if ($$7) {
         fbb.a().ifPresent($$0x -> this.bp = $$0x.c());
      }

      this.bh.b("updateDisplay");
      this.Q.f();
      int $$9 = this.bh();
      if ($$9 < 260) {
         RenderSystem.limitDisplayFPS($$9);
      }

      this.bh.b("yield");
      Thread.yield();
      this.bh.c();
      this.Q.a("Post render");
      this.aV++;
      this.aS = this.U() && (this.y != null && this.y.k() || this.aW != null && this.aW.a()) && !this.aO.r();
      this.R.b(this.aS);
      this.R.c(!this.bn());
      long $$10 = ad.d();
      long $$11 = $$10 - this.aT;
      if ($$7) {
         this.bn = $$11;
      }

      this.aN().a($$11);
      this.aT = $$10;
      this.bh.a("fpsUpdate");
      if (this.bp != null && this.bp.b()) {
         this.bo = (double)this.bp.c() * 100.0 / (double)this.bn;
      }

      while (ad.c() >= this.aU + 1000L) {
         String $$12;
         if (this.bo > 0.0) {
            $$12 = " GPU: " + (this.bo > 100.0 ? n.m + "100%" : Math.round(this.bo) + "%");
         } else {
            $$12 = "";
         }

         bb = this.aV;
         this.z = String.format(
            Locale.ROOT,
            "%d fps T: %s%s%s%s B: %d%s",
            bb,
            $$9 == 260 ? "inf" : $$9,
            this.m.N().c() ? " vsync " : " ",
            this.m.j().c(),
            this.m.i().c() == fgb.a ? "" : (this.m.i().c() == fgb.b ? " fast-clouds" : " fancy-clouds"),
            this.m.E().c(),
            $$12
         );
         this.aU += 1000L;
         this.aV = 0;
      }

      this.bh.c();
   }

   private bnf a(boolean $$0, @Nullable bni $$1) {
      if (!$$0) {
         this.bj.b();
         if (!this.bl.e() && $$1 == null) {
            return bnc.a;
         }
      }

      bnf $$2;
      if ($$0) {
         if (!this.bj.a()) {
            this.bi = 0;
            this.bj.c();
         }

         this.bi++;
         $$2 = this.bj.d();
      } else {
         $$2 = bnc.a;
      }

      if (this.bl.e()) {
         $$2 = bnf.a($$2, this.bl.f());
      }

      return bni.a($$2, $$1);
   }

   private void b(boolean $$0, @Nullable bni $$1) {
      if ($$1 != null) {
         $$1.b();
      }

      if ($$0) {
         this.bk = this.bj.e();
      } else {
         this.bk = null;
      }

      this.bh = this.bj.d();
   }

   @Override
   public void a() {
      int $$0 = this.Q.a(this.m.aq().c(), this.k());
      this.Q.a((double)$$0);
      if (this.y != null) {
         this.y.a(this, this.Q.p(), this.Q.q());
      }

      ezv $$1 = this.h();
      $$1.a(this.Q.l(), this.Q.m(), a);
      this.j.a(this.Q.l(), this.Q.m());
      this.n.g();
   }

   @Override
   public void b() {
      this.n.k();
   }

   public int o() {
      return bb;
   }

   public long p() {
      return this.bc;
   }

   private int bh() {
      return this.r != null || this.y == null && this.aW == null ? this.Q.e() : 60;
   }

   private void bi() {
      try {
         aym.b();
         this.f.p();
      } catch (Throwable var3) {
      }

      try {
         System.gc();
         if (this.aQ && this.aO != null) {
            this.aO.a(true);
         }

         this.b((fod)(new fno(wz.c("menu.savingLevel"))));
      } catch (Throwable var2) {
      }

      System.gc();
   }

   public boolean a(Consumer<wz> $$0) {
      if (this.bl.e()) {
         this.bj();
         return false;
      } else {
         Consumer<bne> $$1 = $$1x -> {
            if ($$1x != bna.a) {
               int $$2x = $$1x.f();
               double $$3x = (double)$$1x.g() / (double)azp.a;
               this.execute(
                  () -> $$0.accept(
                        wz.a("commands.debug.stopped", String.format(Locale.ROOT, "%.2f", $$3x), $$2x, String.format(Locale.ROOT, "%.2f", (double)$$2x / $$3x))
                     )
               );
            }
         };
         Consumer<Path> $$2 = $$1x -> {
            wz $$2x = wz.b($$1x.toString()).a(n.t).a($$1xx -> $$1xx.a(new wx(wx.a.b, $$1x.toFile().getParent())));
            this.execute(() -> $$0.accept(wz.a("debug.profiling.stop", $$2x)));
         };
         ac $$3 = a(new ac(), this, this.ak, this.Z, this.m);
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
            CompletableFuture.allOf($$6, $$7).thenRunAsync(() -> $$4.accept(ImmutableList.of($$6.join(), $$7.join())), ad.h());
            this.aO.a($$0x -> {
            }, $$7::complete);
            $$5 = $$6::complete;
         }

         this.bl = bor.a(new geg(ad.c, this.f), ad.c, ad.h(), new box("client"), $$1x -> {
            this.bl = bos.a;
            $$1.accept($$1x);
         }, $$5);
         return true;
      }
   }

   private void bj() {
      this.bl.a();
      if (this.aO != null) {
         this.aO.aX();
      }
   }

   private void bk() {
      this.bl.b();
      if (this.aO != null) {
         this.aO.aY();
      }
   }

   private Path a(ac $$0, List<Path> $$1) {
      String $$2;
      if (this.T()) {
         $$2 = this.V().bb().e();
      } else {
         fzt $$3 = this.S();
         $$2 = $$3 != null ? $$3.a : "unknown";
      }

      Path $$7;
      try {
         String $$5 = String.format(Locale.ROOT, "%s-%s-%s", ad.f(), $$2, ab.b().b());
         String $$6 = v.a(box.a, $$5, ".zip");
         $$7 = box.a.resolve($$6);
      } catch (IOException var21) {
         throw new UncheckedIOException(var21);
      }

      try (axz $$10 = new axz($$7)) {
         $$10.a(Paths.get("system.txt"), $$0.a());
         $$10.a(Paths.get("client").resolve(this.m.aC().getName()), this.m.aD());
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
      if (this.bk != null) {
         List<bnh> $$1 = this.bk.a(this.by);
         if (!$$1.isEmpty()) {
            bnh $$2 = $$1.remove(0);
            if ($$0 == 0) {
               if (!$$2.d.isEmpty()) {
                  int $$3 = this.by.lastIndexOf(30);
                  if ($$3 >= 0) {
                     this.by = this.by.substring(0, $$3);
                  }
               }
            } else {
               $$0--;
               if ($$0 < $$1.size() && !"unspecified".equals($$1.get($$0).d)) {
                  if (!this.by.isEmpty()) {
                     this.by = this.by + "\u001e";
                  }

                  this.by = this.by + $$1.get($$0).d;
               }
            }
         }
      }
   }

   private void a(fhz $$0, bne $$1) {
      List<bnh> $$2 = $$1.a(this.by);
      bnh $$3 = $$2.removeFirst();
      RenderSystem.clear(256, a);
      RenderSystem.setShader(ges::p);
      Matrix4f $$4 = new Matrix4f().setOrtho(0.0F, (float)this.Q.l(), (float)this.Q.m(), 0.0F, 1000.0F, 3000.0F);
      RenderSystem.setProjectionMatrix($$4, fbq.b);
      fbk $$5 = fbk.b();
      Matrix4fStack $$6 = RenderSystem.getModelViewStack();
      $$6.pushMatrix();
      $$6.translation(0.0F, 0.0F, -2000.0F);
      RenderSystem.applyModelViewMatrix();
      int $$7 = 160;
      int $$8 = this.Q.l() - 160 - 10;
      int $$9 = this.Q.m() - 320;
      double $$10 = 0.0;

      for (bnh $$11 : $$2) {
         int $$12 = ayo.a($$11.a / 4.0) + 1;
         fbd $$13 = $$5.a(fbn.c.g, fbg.f);
         int $$14 = axy.b.e($$11.a());
         int $$15 = axy.b.a($$14, -8355712);
         $$13.a((float)$$8, (float)$$9, 0.0F).a($$14);

         for (int $$16 = $$12; $$16 >= 0; $$16--) {
            float $$17 = (float)(($$10 + $$11.a * (double)$$16 / (double)$$12) * (float) (Math.PI * 2) / 100.0);
            float $$18 = ayo.a($$17) * 160.0F;
            float $$19 = ayo.b($$17) * 160.0F * 0.5F;
            $$13.a((float)$$8 + $$18, (float)$$9 - $$19, 0.0F).a($$14);
         }

         fbe.a($$13.b());
         $$13 = $$5.a(fbn.c.f, fbg.f);

         for (int $$20 = $$12; $$20 >= 0; $$20--) {
            float $$21 = (float)(($$10 + $$11.a * (double)$$20 / (double)$$12) * (float) (Math.PI * 2) / 100.0);
            float $$22 = ayo.a($$21) * 160.0F;
            float $$23 = ayo.b($$21) * 160.0F * 0.5F;
            if (!($$23 > 0.0F)) {
               $$13.a((float)$$8 + $$22, (float)$$9 - $$23, 0.0F).a($$15);
               $$13.a((float)$$8 + $$22, (float)$$9 - $$23 + 10.0F, 0.0F).a($$15);
            }
         }

         fbh $$24 = $$13.a();
         if ($$24 != null) {
            fbe.a($$24);
         }

         $$10 += $$11.a;
      }

      DecimalFormat $$25 = new DecimalFormat("##0.00");
      $$25.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.ROOT));
      String $$26 = bne.b($$3.d);
      String $$27 = "";
      if (!"unspecified".equals($$26)) {
         $$27 = $$27 + "[0] ";
      }

      if ($$26.isEmpty()) {
         $$27 = $$27 + "ROOT ";
      } else {
         $$27 = $$27 + $$26 + " ";
      }

      int $$28 = 16777215;
      $$0.b(this.h, $$27, $$8 - 160, $$9 - 80 - 16, 16777215);
      $$27 = $$25.format($$3.b) + "%";
      $$0.b(this.h, $$27, $$8 + 160 - this.h.b($$27), $$9 - 80 - 16, 16777215);

      for (int $$29 = 0; $$29 < $$2.size(); $$29++) {
         bnh $$30 = $$2.get($$29);
         StringBuilder $$31 = new StringBuilder();
         if ("unspecified".equals($$30.d)) {
            $$31.append("[?] ");
         } else {
            $$31.append("[").append($$29 + 1).append("] ");
         }

         String $$32 = $$31.append($$30.d).toString();
         $$0.b(this.h, $$32, $$8 - 160, $$9 + 80 + $$29 * 8 + 20, $$30.a());
         $$32 = $$25.format($$30.a) + "%";
         $$0.b(this.h, $$32, $$8 + 160 - 50 - this.h.b($$32), $$9 + 80 + $$29 * 8 + 20, $$30.a());
         $$32 = $$25.format($$30.b) + "%";
         $$0.b(this.h, $$32, $$8 + 160 - this.h.b($$32), $$9 + 80 + $$29 * 8 + 20, $$30.a());
      }

      $$6.popMatrix();
      RenderSystem.applyModelViewMatrix();
   }

   public void q() {
      this.aZ = false;
   }

   public boolean r() {
      return this.aZ;
   }

   public void b(boolean $$0) {
      if (this.y == null) {
         boolean $$1 = this.U() && !this.aO.r();
         if ($$1) {
            this.a(new fny(!$$0));
            this.ao.e();
         } else {
            this.a(new fny(true));
         }
      }
   }

   private void d(boolean $$0) {
      if (!$$0) {
         this.w = 0;
      }

      if (this.w <= 0 && !this.s.fr()) {
         if ($$0 && this.v != null && this.v.c() == exa.a.b) {
            ewy $$1 = (ewy)this.v;
            jd $$2 = $$1.a();
            if (!this.r.a_($$2).i()) {
               ji $$3 = $$1.b();
               if (this.q.b($$2, $$3)) {
                  this.g.a($$2, $$3);
                  this.s.a(bqq.a);
               }
            }
         } else {
            this.q.b();
         }
      }
   }

   private boolean bl() {
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
         cuq $$0 = this.s.b(bqq.a);
         if (!$$0.a(this.r.J())) {
            return false;
         } else {
            boolean $$1 = false;
            switch (this.v.c()) {
               case c:
                  this.q.a(this.s, ((ewz)this.v).a());
                  break;
               case b:
                  ewy $$2 = (ewy)this.v;
                  jd $$3 = $$2.a();
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

                  this.s.gs();
            }

            this.s.a(bqq.a);
            return $$1;
         }
      }
   }

   private void bm() {
      if (!this.q.k()) {
         this.aR = 4;
         if (!this.s.B()) {
            if (this.v == null) {
               F.warn("Null returned as 'hitResult', this shouldn't happen!");
            }

            for (bqq $$0 : bqq.values()) {
               cuq $$1 = this.s.b($$0);
               if (!$$1.a(this.r.J())) {
                  return;
               }

               if (this.v != null) {
                  switch (this.v.c()) {
                     case c:
                        ewz $$2 = (ewz)this.v;
                        bsr $$3 = $$2.a();
                        if (!this.r.C_().a($$3.do())) {
                           return;
                        }

                        bqr $$4 = this.q.a(this.s, $$3, $$2, $$0);
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
                        ewy $$5 = (ewy)this.v;
                        int $$6 = $$1.H();
                        bqr $$7 = this.q.a(this.s, $$0, $$5);
                        if ($$7.a()) {
                           if ($$7.b()) {
                              this.s.a($$0);
                              if (!$$1.e() && ($$1.H() != $$6 || this.q.f())) {
                                 this.j.c.a($$0);
                              }
                           }

                           return;
                        }

                        if ($$7 == bqr.f) {
                           return;
                        }
                  }
               }

               if (!$$1.e()) {
                  bqr $$8 = this.q.a(this.s, $$0);
                  if ($$8.a()) {
                     if ($$8.b()) {
                        this.s.a($$0);
                     }

                     this.j.c.a($$0);
                     return;
                  }
               }
            }
         }
      }
   }

   public gva s() {
      return this.ap;
   }

   public void t() {
      this.bx++;
      if (this.r != null && !this.aS) {
         this.r.s().m();
      }

      if (this.aR > 0) {
         this.aR--;
      }

      this.bh.a("gui");
      this.br.a();
      this.l.a(this.aS);
      this.bh.c();
      this.j.b(1.0F);
      this.aG.a(this.r, this.v);
      this.bh.a("gameMode");
      if (!this.aS && this.r != null) {
         this.q.c();
      }

      this.bh.b("textures");
      if (this.bn()) {
         this.N.e();
      }

      if (this.y != null || this.s == null) {
         if (this.y instanceof fnq $$0 && !this.s.fH()) {
            $$0.m();
         }
      } else if (this.s.ex() && !(this.y instanceof fnh)) {
         this.a(null);
      } else if (this.s.fH() && this.r != null) {
         this.a(new fnq());
      }

      if (this.y != null) {
         this.w = 10000;
      }

      if (this.y != null) {
         fod.a(() -> this.y.e(), "Ticking screen", this.y.getClass().getCanonicalName());
      }

      if (!this.aN().d()) {
         this.l.l();
      }

      if (this.aW == null && this.y == null) {
         this.bh.b("Keybindings");
         this.bp();
         if (this.w > 0) {
            this.w--;
         }
      }

      if (this.r != null) {
         this.bh.b("gameRenderer");
         if (!this.aS) {
            this.j.e();
         }

         this.bh.b("levelRenderer");
         if (!this.aS) {
            this.f.o();
         }

         this.bh.b("level");
         if (!this.aS) {
            this.r.f();
         }
      } else if (this.j.f() != null) {
         this.j.b();
      }

      if (!this.aS) {
         this.ap.a();
      }

      this.ao.a(this.aS);
      if (this.r != null) {
         if (!this.aS) {
            if (!this.m.s && this.bo()) {
               wz $$1 = wz.c("tutorial.socialInteractions.title");
               wz $$2 = wz.a("tutorial.socialInteractions.description", gwi.a("socialInteractions"));
               this.bg = new fkx(fkx.a.f, $$1, $$2, true);
               this.aG.a(this.bg, 160);
               this.m.s = true;
               this.m.aw();
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

               throw new z($$4);
            }
         }

         this.bh.b("animateTick");
         if (!this.aS && this.bn()) {
            this.r.b(this.s.ds(), this.s.du(), this.s.dy());
         }

         this.bh.b("particles");
         if (!this.aS && this.bn()) {
            this.g.b();
         }
      } else if (this.aP != null) {
         this.bh.b("pendingConnection");
         this.aP.b();
      }

      this.bh.b("keyboard");
      this.o.b();
      this.bh.c();
   }

   private boolean bn() {
      return this.r == null || this.r.s().i();
   }

   private boolean bo() {
      return !this.aQ || this.aO != null && this.aO.r();
   }

   private void bp() {
      while (this.m.O.g()) {
         ffz $$0 = this.m.aB();
         this.m.a(this.m.aB().c());
         if ($$0.a() != this.m.aB().a()) {
            this.j.a(this.m.aB().a() ? this.an() : null);
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
            if (this.s.R_()) {
               this.l.g().a($$1);
            } else if (!this.s.f() || this.y != null || !$$3 && !$$2) {
               this.s.fY().k = $$1;
            } else {
               fpi.a(this, $$1, $$3, $$2);
            }
         }
      }

      while (this.m.M.g()) {
         if (!this.bo()) {
            this.s.a(J, true);
            this.bq.c(J);
         } else {
            if (this.bg != null) {
               this.aG.a(this.bg);
               this.bg = null;
            }

            this.a(new fsw());
         }
      }

      while (this.m.D.g()) {
         if (this.q.g()) {
            this.s.i();
         } else {
            this.aG.a();
            this.a(new fpt(this.s));
         }
      }

      while (this.m.S.g()) {
         this.a(new fon(this.s.h.p()));
      }

      while (this.m.E.g()) {
         if (!this.s.R_()) {
            this.L().b(new ahm(ahm.a.g, jd.c, ji.a));
         }
      }

      while (this.m.F.g()) {
         if (!this.s.R_() && this.s.a(fod.r())) {
            this.s.a(bqq.a);
         }
      }

      while (this.m.J.g()) {
         this.a("");
      }

      if (this.y == null && this.aW == null && this.m.L.g()) {
         this.a("/");
      }

      boolean $$4 = false;
      if (this.s.fr()) {
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
            $$4 |= this.bl();
         }

         while (this.m.G.g()) {
            this.bm();
         }

         while (this.m.I.g()) {
            this.br();
         }
      }

      if (this.m.G.e() && this.aR == 0 && !this.s.fr()) {
         this.bm();
      }

      this.d(this.y == null && !$$4 && this.m.H.e() && this.n.h());
   }

   public gvj u() {
      return this.aK;
   }

   public double v() {
      return this.bo;
   }

   public fzr w() {
      return this.aL;
   }

   public ftm x() {
      return new ftm(this, this.ac);
   }

   public void a(erf.c $$0, atp $$1, alp $$2, boolean $$3) {
      this.y();
      this.W.set(null);
      Instant $$4 = Instant.now();

      try {
         $$0.a($$2.c().a(), $$2.d());
         alm $$5 = alm.a(this.au, this.p);
         $$5.f().a(this);
         dru.a($$5, this);
         aun.a(false);
         this.aO = MinecraftServer.a((Function<Thread, guo>)($$4x -> new guo($$4x, this, $$0, $$1, $$2, $$5, $$0xx -> {
               arh $$1xx = arh.b($$0xx + 0);
               this.W.set($$1xx);
               return arg.a($$1xx, this.be::add);
            })));
         this.aQ = true;
         this.a(gal.a());
         this.aN.a(gej.c.a, $$0.f(), $$2.d().e());
      } catch (Throwable var11) {
         o $$7 = o.a(var11, "Starting integrated server");
         p $$8 = $$7.a("Starting integrated server");
         $$8.a("Level ID", $$0.f());
         $$8.a("Level Name", () -> $$2.d().e());
         throw new z($$7);
      }

      while (this.W.get() == null) {
         Thread.yield();
      }

      fnr $$9 = new fnr(this.W.get());
      this.a($$9);
      this.bh.a("waitForServer");

      for (; !this.aO.aj() || this.aW != null; this.bf()) {
         $$9.e();
         this.c(false);

         try {
            Thread.sleep(16L);
         } catch (InterruptedException var10) {
         }
      }

      this.bh.c();
      Duration $$10 = Duration.between($$4, Instant.now());
      SocketAddress $$11 = this.aO.ai().a();
      vt $$12 = vt.a($$11);
      $$12.a($$11.toString(), 0, new fze($$12, this, null, null, $$3, $$10, $$0x -> {
      }, null));
      $$12.a(new aiy(this.X().c(), this.X().b()));
      this.aP = $$12;
   }

   public void a(fzf $$0, fob.a $$1) {
      this.e(new fob(() -> false, $$1));
      this.r = $$0;
      this.a($$0);
      if (!this.aQ) {
         alm $$2 = alm.a(this.au, this.p);
         $$2.f().a(this);
         dru.a($$2, this);
         aun.a(false);
      }
   }

   public void y() {
      this.a(new foa(true), false);
   }

   public void b(fod $$0) {
      this.a($$0, false);
   }

   public void a(fod $$0, boolean $$1) {
      fzg $$2 = this.L();
      if ($$2 != null) {
         this.bA();
         $$2.h();
         if (!$$1) {
            this.z();
         }
      }

      this.aH.b();
      if (this.bl.e()) {
         this.bk();
      }

      guo $$3 = this.aO;
      this.aO = null;
      this.j.h();
      this.q = null;
      this.bq.b();
      this.aX = true;

      try {
         this.e($$0);
         if (this.r != null) {
            if ($$3 != null) {
               this.bh.a("waitForServer");

               while (!$$3.H()) {
                  this.c(false);
               }

               this.bh.c();
            }

            this.l.i();
            this.aQ = false;
         }

         this.r = null;
         this.a(null);
         this.s = null;
      } finally {
         this.aX = false;
      }

      dru.b();
   }

   public void z() {
      this.ai.i();
      this.bB();
   }

   public void c(fod $$0) {
      fzg $$1 = this.L();
      if ($$1 != null) {
         $$1.i();
      }

      if (this.bl.e()) {
         this.bk();
      }

      this.j.h();
      this.q = null;
      this.bq.b();
      this.aX = true;

      try {
         this.e($$0);
         this.l.i();
         this.r = null;
         this.a(null);
         this.s = null;
      } finally {
         this.aX = false;
      }

      dru.b();
   }

   private void e(fod $$0) {
      this.bh.a("forcedTick");
      this.ao.f();
      this.t = null;
      this.aP = null;
      this.a($$0);
      this.c(false);
      this.bh.c();
   }

   public void d(fod $$0) {
      this.bh.a("forcedTick");
      this.a($$0);
      this.c(false);
      this.bh.c();
   }

   private void a(@Nullable fzf $$0) {
      this.f.a($$0);
      this.g.a($$0);
      this.aJ.a($$0);
      this.d();
   }

   private UserProperties bq() {
      return this.ax.join();
   }

   public boolean C() {
      return this.D() && this.m.ai().c();
   }

   public boolean D() {
      return this.E() && this.bq().flag(UserFlag.OPTIONAL_TELEMETRY_AVAILABLE);
   }

   public boolean E() {
      return ab.aU ? false : this.bq().flag(UserFlag.TELEMETRY_ENABLED);
   }

   public boolean F() {
      return this.ae && this.bq().flag(UserFlag.SERVERS_ALLOWED) && this.H() == null && !this.I();
   }

   public boolean G() {
      return this.bq().flag(UserFlag.REALMS_ALLOWED) && this.H() == null;
   }

   @Nullable
   public BanDetails H() {
      return (BanDetails)this.bq().bannedScopes().get("MULTIPLAYER");
   }

   public boolean I() {
      ProfileResult $$0 = this.M.getNow(null);
      return $$0 != null && $$0.actions().contains(ProfileActionType.FORCED_NAME_CHANGE);
   }

   public boolean a(UUID $$0) {
      return this.J().a(false) ? this.aH.c($$0) : (this.s == null || !$$0.equals(this.s.cz())) && !$$0.equals(ad.e);
   }

   public fgo.a J() {
      if (this.m.m().c() == cmv.c) {
         return fgo.a.b;
      } else if (!this.af) {
         return fgo.a.c;
      } else {
         return !this.bq().flag(UserFlag.CHAT_ALLOWED) ? fgo.a.d : fgo.a.a;
      }
   }

   public final boolean K() {
      return this.ad;
   }

   @Nullable
   public fzg L() {
      return this.s == null ? null : this.s.h;
   }

   public static boolean M() {
      return !E.m.Y;
   }

   public static boolean N() {
      return E.m.j().c().a() >= fgh.b.a();
   }

   public static boolean O() {
      return !E.j.a() && E.m.j().c().a() >= fgh.c.a();
   }

   public static boolean P() {
      return E.m.k().c();
   }

   private void br() {
      if (this.v != null && this.v.c() != exa.a.a) {
         boolean $$0 = this.s.fZ().d;
         dqh $$1 = null;
         exa.a $$2 = this.v.c();
         cuq $$6;
         if ($$2 == exa.a.b) {
            jd $$3 = ((ewy)this.v).a();
            dtc $$4 = this.r.a_($$3);
            if ($$4.i()) {
               return;
            }

            dfy $$5 = $$4.b();
            $$6 = $$5.a((dcz)this.r, $$3, $$4);
            if ($$6.e()) {
               return;
            }

            if ($$0 && fod.r() && $$4.t()) {
               $$1 = this.r.c_($$3);
            }
         } else {
            if ($$2 != exa.a.c || !$$0) {
               return;
            }

            bsr $$7 = ((ewz)this.v).a();
            $$6 = $$7.dB();
            if ($$6 == null) {
               return;
            }
         }

         if ($$6.e()) {
            String $$10 = "";
            if ($$2 == exa.a.b) {
               $$10 = lt.e.b(this.r.a_(((ewy)this.v).a()).b()).toString();
            } else if ($$2 == exa.a.c) {
               $$10 = lt.f.b(((ewz)this.v).a().am()).toString();
            }

            F.warn("Picking on: [{}] {} gave null item", $$2, $$10);
         } else {
            cmw $$11 = this.s.fY();
            if ($$1 != null) {
               this.a($$6, $$1, this.r.H_());
            }

            int $$12 = $$11.c($$6);
            if ($$0) {
               $$11.b($$6);
               this.q.a(this.s.b(bqq.a), 36 + $$11.k);
            } else if ($$12 != -1) {
               if (cmw.d($$12)) {
                  $$11.k = $$12;
               } else {
                  this.q.a($$12);
               }
            }
         }
      }
   }

   private void a(cuq $$0, dqh $$1, ka $$2) {
      ub $$3 = $$1.f($$2);
      $$1.a($$3);
      cso.a($$0, $$1.r(), $$3);
      $$0.b($$1.s());
   }

   public o d(o $$0) {
      ac $$1 = $$0.f();
      a($$1, this, this.ak, this.Z, this.m);
      this.a($$0.a("Uptime"));
      if (this.r != null) {
         this.r.a($$0);
      }

      if (this.aO != null) {
         this.aO.b($$1);
      }

      this.bm.a($$0);
      return $$0;
   }

   public static void a(@Nullable fgo $$0, @Nullable grt $$1, String $$2, @Nullable fgs $$3, o $$4) {
      ac $$5 = $$4.f();
      a($$5, $$0, $$1, $$2, $$3);
   }

   private static String a(double $$0) {
      return String.format(Locale.ROOT, "%.3fs", $$0);
   }

   private void a(p $$0) {
      $$0.a("JVM uptime", () -> a((double)ManagementFactory.getRuntimeMXBean().getUptime() / 1000.0));
      $$0.a("Wall uptime", () -> a((double)(System.currentTimeMillis() - this.bw) / 1000.0));
      $$0.a("High-res time", () -> a((double)ad.c() / 1000.0));
      $$0.a("Client ticks", () -> String.format(Locale.ROOT, "%d ticks / %.3fs", this.bx, (double)this.bx / 20.0));
   }

   private static ac a(ac $$0, @Nullable fgo $$1, @Nullable grt $$2, String $$3, @Nullable fgs $$4) {
      $$0.a("Launched Version", () -> $$3);
      String $$5 = bc();
      if ($$5 != null) {
         $$0.a("Launcher name", $$5);
      }

      $$0.a("Backend library", RenderSystem::getBackendDescription);
      $$0.a("Backend API", RenderSystem::getApiDescription);
      $$0.a("Window size", () -> $$1 != null ? $$1.Q.l() + "x" + $$1.Q.m() : "<not initialized>");
      $$0.a("GFLW Platform", fam::a);
      $$0.a("GL Caps", RenderSystem::getCapsString);
      $$0.a("GL debug messages", () -> fab.b() ? String.join("\n", fab.a()) : "<disabled>");
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
         $$0.a("Render Distance", $$4.aE() + "/" + $$4.e().c() + " chunks");
      }

      if ($$1 != null) {
         $$0.a("Resource Packs", () -> atp.a($$1.ac().f()));
      }

      if ($$2 != null) {
         $$0.a("Current Language", () -> $$2.a());
      }

      $$0.a("Locale", String.valueOf(Locale.getDefault()));
      $$0.a("System encoding", () -> System.getProperty("sun.jnu.encoding", "<not set>"));
      $$0.a("File encoding", () -> System.getProperty("file.encoding", "<not set>"));
      $$0.a("CPU", fac::b);
      return $$0;
   }

   public static fgo Q() {
      return E;
   }

   public CompletableFuture<Void> R() {
      return this.a(this::l).thenCompose($$0 -> (CompletionStage<Void>)$$0);
   }

   public void a(gal $$0) {
      if (!this.bs.a($$0)) {
         this.bs = gao.a($$0, this.aw);
      }
   }

   @Nullable
   public fzt S() {
      return x.a(this.L(), fzg::w);
   }

   public boolean T() {
      return this.aQ;
   }

   public boolean U() {
      return this.aQ && this.aO != null;
   }

   @Nullable
   public guo V() {
      return this.aO;
   }

   public boolean W() {
      guo $$0 = this.V();
      return $$0 != null && !$$0.r();
   }

   public boolean b(UUID $$0) {
      return $$0.equals(this.X().b());
   }

   public fhb X() {
      return this.V;
   }

   public GameProfile Y() {
      ProfileResult $$0 = this.M.join();
      return $$0 != null ? $$0.profile() : new GameProfile(this.V.b(), this.V.c());
   }

   public Proxy Z() {
      return this.ab;
   }

   public gqm aa() {
      return this.N;
   }

   public aue ab() {
      return this.ag;
   }

   public atp ac() {
      return this.aj;
   }

   public asu ad() {
      return this.ah;
   }

   public gtc ae() {
      return this.ai;
   }

   public Path af() {
      return this.L;
   }

   public grt ag() {
      return this.ak;
   }

   public Function<akr, gql> a(akr $$0) {
      return this.az.a($$0)::a;
   }

   public boolean ah() {
      return this.aS;
   }

   public get ai() {
      return this.as;
   }

   public gvf aj() {
      return this.ao;
   }

   public avm ak() {
      avm $$0 = x.a(this.y, fod::B);
      if ($$0 != null) {
         return $$0;
      } else if (this.s != null) {
         if (this.s.dO().af() == dcw.j) {
            return this.l.j().b() ? avn.d : avn.e;
         } else {
            jm<ddw> $$1 = this.s.dO().t(this.s.do());
            if (!this.ap.c(avn.f) && (!this.s.bk() || !$$1.a(awd.Z))) {
               return this.s.dO().af() != dcw.i && this.s.fZ().d && this.s.fZ().c ? avn.b : $$1.a().o().orElse(avn.g);
            } else {
               return avn.f;
            }
         }
      } else {
         return avn.a;
      }
   }

   public MinecraftSessionService al() {
      return this.av;
   }

   public grm am() {
      return this.ay;
   }

   @Nullable
   public bsr an() {
      return this.t;
   }

   public void a(bsr $$0) {
      this.t = $$0;
      this.j.a($$0);
   }

   public boolean b(bsr $$0) {
      return $$0.ch() || this.s != null && this.s.R_() && this.m.R.e() && $$0.am() == bsx.by;
   }

   @Override
   protected Thread az() {
      return this.aY;
   }

   @Override
   protected Runnable f(Runnable $$0) {
      return $$0;
   }

   @Override
   protected boolean e(Runnable $$0) {
      return true;
   }

   public gft ao() {
      return this.aA;
   }

   public gkh ap() {
      return this.T;
   }

   public ggy aq() {
      return this.aJ;
   }

   public glh ar() {
      return this.U;
   }

   public DataFixer as() {
      return this.O;
   }

   public fgf at() {
      return this.R;
   }

   public fhq au() {
      return this.al;
   }

   public boolean av() {
      return this.s != null && this.s.go() || this.m.V().c();
   }

   public fkw aw() {
      return this.aF;
   }

   public gwi ax() {
      return this.aG;
   }

   public boolean aA() {
      return this.bd;
   }

   public fgk aB() {
      return this.X;
   }

   public gst aC() {
      return this.az;
   }

   public grk aD() {
      return this.aB;
   }

   public grj aE() {
      return this.aC;
   }

   public gri aF() {
      return this.aD;
   }

   public fia aG() {
      return this.aE;
   }

   @Override
   public void a(boolean $$0) {
      this.bd = $$0;
   }

   public wz a(File $$0, int $$1, int $$2) {
      int $$3 = this.Q.l();
      int $$4 = this.Q.m();
      ezv $$5 = new ezw($$1, $$2, true, a);
      float $$6 = this.s.dG();
      float $$7 = this.s.dE();
      float $$8 = this.s.P;
      float $$9 = this.s.O;
      this.j.b(false);

      xn var12;
      try {
         this.j.c(true);
         this.f.e();
         this.Q.b($$1);
         this.Q.c($$2);

         for (int $$10 = 0; $$10 < 6; $$10++) {
            switch ($$10) {
               case 0:
                  this.s.t($$7);
                  this.s.u(0.0F);
                  break;
               case 1:
                  this.s.t(($$7 + 90.0F) % 360.0F);
                  this.s.u(0.0F);
                  break;
               case 2:
                  this.s.t(($$7 + 180.0F) % 360.0F);
                  this.s.u(0.0F);
                  break;
               case 3:
                  this.s.t(($$7 - 90.0F) % 360.0F);
                  this.s.u(0.0F);
                  break;
               case 4:
                  this.s.t($$7);
                  this.s.u(-90.0F);
                  break;
               case 5:
               default:
                  this.s.t($$7);
                  this.s.u(90.0F);
            }

            this.s.O = this.s.dE();
            this.s.P = this.s.dG();
            $$5.a(true);
            this.j.a(fgf.b);

            try {
               Thread.sleep(10L);
            } catch (InterruptedException var17) {
            }

            fgy.a($$0, "panorama_" + $$10 + ".png", $$5, $$0x -> {
            });
         }

         wz $$11 = wz.b($$0.getName()).a(n.t).a($$1x -> $$1x.a(new wx(wx.a.b, $$0.getAbsolutePath())));
         return wz.a("screenshot.success", $$11);
      } catch (Exception var18) {
         F.error("Couldn't save image", var18);
         var12 = wz.a("screenshot.failure", var18.getMessage());
      } finally {
         this.s.u($$6);
         this.s.t($$7);
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

   private wz a(File $$0, int $$1, int $$2, int $$3, int $$4) {
      try {
         ByteBuffer $$5 = fac.a($$1 * $$2 * 3);
         fgy $$6 = new fgy($$0, $$3, $$4, $$2);
         float $$7 = (float)$$3 / (float)$$1;
         float $$8 = (float)$$4 / (float)$$2;
         float $$9 = $$7 > $$8 ? $$7 : $$8;

         for (int $$10 = ($$4 - 1) / $$2 * $$2; $$10 >= 0; $$10 -= $$2) {
            for (int $$11 = 0; $$11 < $$3; $$11 += $$1) {
               RenderSystem.setShaderTexture(0, gqk.e);
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
         fac.a($$5);
         wz $$15 = wz.b($$14.getName()).a(n.t).a($$1x -> $$1x.a(new wx(wx.a.b, $$14.getAbsolutePath())));
         return wz.a("screenshot.success", $$15);
      } catch (Exception var15) {
         F.warn("Couldn't save screenshot", var15);
         return wz.a("screenshot.failure", var15.getMessage());
      }
   }

   public bnf aH() {
      return this.bh;
   }

   @Nullable
   public arh aI() {
      return this.W.get();
   }

   public grn aJ() {
      return this.ar;
   }

   @Nullable
   public fnx aK() {
      return this.aW;
   }

   public fsu aL() {
      return this.aH;
   }

   public fam aM() {
      return this.Q;
   }

   public fiu aN() {
      return this.l.k();
   }

   public gff aO() {
      return this.S;
   }

   public void b(int $$0) {
      this.az.a($$0);
   }

   public fyg aP() {
      return this.aI;
   }

   public boolean aQ() {
      return this.bq().flag(UserFlag.PROFANITY_FILTER_ENABLED);
   }

   public void aR() {
      this.aH.a();
      this.w().a();
   }

   @Nullable
   public azb aS() {
      return azb.a(this.au.getServicesKeySet(), ServicesKeyType.PROFILE_KEY);
   }

   public boolean aT() {
      return !this.au.getServicesKeySet().keys(ServicesKeyType.PROFILE_KEY).isEmpty();
   }

   public fgl aU() {
      return this.Y;
   }

   public void a(fgl $$0) {
      this.Y = $$0;
   }

   public fgg aV() {
      return this.bq;
   }

   public fzz aW() {
      return this.br;
   }

   public gao aX() {
      return this.bs;
   }

   public fdm aY() {
      return this.aM;
   }

   public gej aZ() {
      return this.aN;
   }

   public fgc ba() {
      return this.bt;
   }

   public ews bb() {
      return this.bu;
   }

   private float a(float $$0) {
      if (this.r != null) {
         brc $$1 = this.r.s();
         if ($$1.i()) {
            return Math.max($$0, $$1.g());
         }
      }

      return $$0;
   }

   @Nullable
   public static String bc() {
      return System.getProperty("minecraft.launcher.brand");
   }

   public static enum a {
      a(wy.a) {
         @Override
         public boolean a(boolean $$0) {
            return true;
         }
      },
      b(wz.c("chat.disabled.options").a(n.m)) {
         @Override
         public boolean a(boolean $$0) {
            return false;
         }
      },
      c(wz.c("chat.disabled.launcher").a(n.m)) {
         @Override
         public boolean a(boolean $$0) {
            return $$0;
         }
      },
      d(wz.a("chat.disabled.profile", wz.d(fgo.E.m.J.h())).a(n.m)) {
         @Override
         public boolean a(boolean $$0) {
            return $$0;
         }
      };

      static final wz e = wz.c("chat.disabled.profile.moreInfo");
      private final wz f;

      a(final wz $$0) {
         this.f = $$0;
      }

      public wz a() {
         return this.f;
      }

      public abstract boolean a(boolean var1);
   }

   static record b(fby a, fua.c b) {
   }
}
