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

public class ffw extends bpb<Runnable> implements ezt {
   static ffw E;
   private static final Logger F = LogUtils.getLogger();
   public static final boolean a = ac.k() == ac.a.d;
   private static final int G = 10;
   public static final akk b = new akk("default");
   public static final akk c = new akk("uniform");
   public static final akk d = new akk("alt");
   private static final akk H = new akk("regional_compliancies.json");
   private static final CompletableFuture<azk> I = CompletableFuture.completedFuture(azk.a);
   private static final wu J = wu.c("multiplayer.socialInteractions.not_available");
   public static final String e = "Please make sure you have up-to-date drivers (see aka.ms/mcdriver for instructions).";
   private final long K = Double.doubleToLongBits(Math.PI);
   private final Path L;
   private final CompletableFuture<ProfileResult> M;
   private final gpr N;
   private final DataFixer O;
   private final gex P;
   private final ezs Q;
   private final ffn.b R = new ffn.b(20.0F, 0L, this::a);
   private final gel S;
   public final ged f;
   private final gjm T;
   private final gkm U;
   public final gbv g;
   private final fgj V;
   public final fhf h;
   public final fhf i;
   public final gdy j;
   public final ghr k;
   private final AtomicReference<aqz> W = new AtomicReference<>();
   public final fhg l;
   public final fga m;
   private final ffs X;
   public final ffx n;
   public final ffv o;
   private fft Y = fft.a;
   public final File p;
   private final String Z;
   private final String aa;
   private final Proxy ab;
   private final eqk ac;
   private final boolean ad;
   private final boolean ae;
   private final boolean af;
   private final att ag;
   private final asm ah;
   private final gsg ai;
   private final ath aj;
   private final gqy ak;
   private final fgy al;
   private final fhc am;
   private final eza an;
   private final guj ao;
   private final gue ap;
   private final fkj aq;
   private final gqs ar;
   private final gdz as;
   private final fgc at = new fgc(H, ffw::b);
   private final YggdrasilAuthenticationService au;
   private final MinecraftSessionService av;
   private final UserApiService aw;
   private final CompletableFuture<UserProperties> ax;
   private final gqr ay;
   private final grx az;
   private final gez aA;
   private final gqp aB;
   private final gqo aC;
   private final gqn aD;
   private final fhi aE;
   private final fke aF;
   private final gvm aG;
   private final fsa aH;
   private final fxm aI;
   private final gge aJ;
   private final gun aK;
   private final fyx aL;
   private final fcu aM;
   private final gdp aN;
   @Nullable
   public fyu q;
   @Nullable
   public fyl r;
   @Nullable
   public gdh s;
   @Nullable
   private gts aO;
   @Nullable
   private vp aP;
   private boolean aQ;
   @Nullable
   public bsh t;
   @Nullable
   public bsh u;
   @Nullable
   public ewf v;
   private int aR;
   protected int w;
   private volatile boolean aS;
   private long aT = ac.d();
   private long aU;
   private int aV;
   public boolean x;
   @Nullable
   public fnl y;
   @Nullable
   private fnf aW;
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
   private fkf bg;
   private bmv bh = bms.a;
   private int bi;
   private final bmp bj = new bmp(ac.c, () -> this.bi);
   @Nullable
   private bmu bk;
   private boj bl = boi.a;
   private final fgf bm = new fgf();
   private long bn;
   private double bo;
   @Nullable
   private fah.a bp;
   private final ffo bq;
   private final fzf br;
   private fzu bs;
   private final ffk bt;
   private final evx bu;
   private boolean bv;
   private final long bw;
   private long bx;
   private String by = "root";

   public ffw(ftg $$0) {
      super("Client");
      E = this;
      this.bw = System.currentTimeMillis();
      this.p = $$0.c.a;
      File $$1 = $$0.c.c;
      this.L = $$0.c.b.toPath();
      this.Z = $$0.d.b;
      this.aa = $$0.d.c;
      Path $$2 = this.p.toPath();
      this.bu = eqk.a($$2.resolve("allowed_symlinks.txt"));
      gqh $$3 = new gqh($$0.c.a(), this.bu);
      this.ai = new gsg(this, $$2.resolve("downloads"), $$0.a);
      atj $$4 = new atc(this.L, ask.a, ati.b, this.bu);
      this.aj = new ath($$3, this.ai.a(), $$4);
      this.ah = $$3.a();
      this.ab = $$0.a.d;
      this.au = new YggdrasilAuthenticationService(this.ab);
      this.av = this.au.createMinecraftSessionService();
      this.V = $$0.a.a;
      this.M = CompletableFuture.supplyAsync(() -> this.av.fetchProfile(this.V.b(), true), ac.i());
      this.aw = this.a(this.au, $$0);
      this.ax = CompletableFuture.supplyAsync(() -> {
         try {
            return this.aw.fetchProperties();
         } catch (AuthenticationException var2x) {
            F.error("Failed to fetch user properties", var2x);
            return UserApiService.OFFLINE_PROPERTIES;
         }
      }, ac.i());
      F.info("Setting user: {}", this.V.c());
      F.debug("(Session ID is {})", this.V.a());
      this.ad = $$0.d.a;
      this.ae = !$$0.d.d;
      this.af = !$$0.d.e;
      this.aO = null;
      xz.a(ffu::a);
      this.O = azp.a();
      this.aF = new fke(this);
      this.aY = Thread.currentThread();
      this.m = new fga(this, this.p);
      RenderSystem.setShaderGlintAlpha(this.m.an().c());
      this.aZ = true;
      this.aG = new gvm(this, this.m);
      this.X = new ffs($$2, this.O);
      F.info("Backend library: {}", RenderSystem.getBackendDescription());
      ezf $$5;
      if (this.m.p > 0 && this.m.o > 0) {
         $$5 = new ezf(this.m.o, this.m.p, $$0.b.c, $$0.b.d, $$0.b.e);
      } else {
         $$5 = $$0.b;
      }

      ac.c = RenderSystem.initBackendSystem();
      this.P = new gex(this);
      this.Q = this.P.a($$5, this.m.k, this.bd());
      this.a(true);
      guy.a.b(guu.A);

      try {
         this.Q.a(this.ah, aa.b().g() ? ezi.a : ezi.b);
      } catch (IOException var13) {
         F.error("Couldn't set icon", var13);
      }

      this.Q.a(this.m.h().c());
      this.n = new ffx(this);
      this.n.a(this.Q.i());
      this.o = new ffv(this);
      this.o.a(this.Q.i());
      RenderSystem.initRenderer(this.m.u, false);
      this.an = new eyx(this.Q.k(), this.Q.l());
      this.an.a(0.0F, 0.0F, 0.0F, 0.0F);
      this.an.b(a);
      this.ag = new att(ask.a);
      this.aj.a();
      this.m.b(this.aj);
      this.ak = new gqy(this.m.ac, $$0x -> {
         if (this.s != null) {
            this.s.h.A();
         }
      });
      this.ag.a(this.ak);
      this.N = new gpr(this.ag);
      this.ag.a(this.N);
      this.ay = new gqr(this.N, $$1.toPath().resolve("skins"), this.av, this);
      this.ac = new eqk($$2.resolve("saves"), $$2.resolve("backups"), this.bu, this.O);
      this.bt = new ffk($$2);
      this.ao = new guj(this.m);
      this.ag.a(this.ao);
      this.ar = new gqs(this.V);
      this.ag.a(this.ar);
      this.ap = new gue(this);
      this.aq = new fkj(this.N);
      this.h = this.aq.a();
      this.i = this.aq.b();
      this.ag.a(this.aq);
      this.g();
      this.ag.a(new gqk());
      this.ag.a(new gqj());
      this.Q.a("Startup");
      RenderSystem.setupDefaultState(0, 0, this.Q.k(), this.Q.l());
      this.Q.a("Post startup");
      this.al = fgy.a();
      this.am = fhc.a(this.al);
      this.az = new grx(this.N, this.al, this.m.C().c());
      this.ag.a(this.az);
      this.aI = new fxm();
      this.ag.a(this.aI);
      this.aJ = new gge(this.h, this.aI, this::ao, this::ar, this::ap);
      this.ag.a(this.aJ);
      gds $$8 = new gds(this.aJ, this.aI);
      this.ag.a($$8);
      this.U = new gkm(this, this.N, this.az, this.am, $$8);
      this.ag.a(this.U);

      try {
         int $$9 = Runtime.getRuntime().availableProcessors();
         faq.a();
         this.S = new gel($$9);
      } catch (OutOfMemoryError var12) {
         TinyFileDialogs.tinyfd_messageBox(
            "Minecraft",
            "Oh no! The game was unable to allocate memory off-heap while trying to start. You may try to free some memory by closing other applications on your computer, check that your system meets the minimum requirements, and try again. If the problem persists, please visit: https://aka.ms/Minecraft-Support",
            "ok",
            "error",
            true
         );
         throw new fth("Unable to allocate render buffers", var12);
      }

      this.aH = new fsa(this, this.aw);
      this.aA = new gez(this.az.b(), $$8, this.al);
      this.ag.a(this.aA);
      this.T = new gjm(this, this.N, this.U, this.aA, this.h, this.m, this.aI);
      this.ag.a(this.T);
      this.g = new gbv(this.r, this.N);
      this.ag.a(this.g);
      this.aB = new gqp(this.N);
      this.ag.a(this.aB);
      this.aC = new gqo(this.N);
      this.ag.a(this.aC);
      this.aD = new gqn(this.N);
      this.ag.a(this.aD);
      this.aE = new fhi(this.N);
      this.ag.a(this.aE);
      this.j = new gdy(this, this.T.d(), this.ag, this.S);
      this.ag.a(this.j.d());
      this.f = new ged(this, this.T, this.aJ, this.S);
      this.ag.a(this.f);
      this.as = new gdz();
      this.ag.a(this.as);
      this.ag.a(this.at);
      this.l = new fhg(this);
      this.k = new ghr(this);
      fbe $$11 = fbe.a(this);
      this.aM = new fcu($$11);
      RenderSystem.setErrorCallback(this::a);
      if (this.an.c != this.Q.k() || this.an.d != this.Q.l()) {
         StringBuilder $$12 = new StringBuilder(
            "Recovering from unsupported resolution ("
               + this.Q.k()
               + "x"
               + this.Q.l()
               + ").\nPlease make sure you have up-to-date drivers (see aka.ms/mcdriver for instructions)."
         );
         if (ezg.b()) {
            $$12.append("\n\nReported GL debug messages:\n").append(String.join("\n", ezg.a()));
         }

         this.Q.a(this.an.c, this.an.d);
         TinyFileDialogs.tinyfd_messageBox("Minecraft", $$12.toString(), "ok", "error", false);
      } else if (this.m.aa().c() && !this.Q.j()) {
         this.Q.h();
         this.m.aa().a(this.Q.j());
      }

      this.Q.a(this.m.N().c());
      this.Q.b(this.m.G().c());
      this.Q.c();
      this.a();
      this.j.a(this.ah.d());
      this.aK = new gun(this, this.aw, this.V);
      this.aL = fyx.a(this.aw, this.V, $$2);
      this.bq = new ffo(this);
      this.bq.a(this.m.as().c() != ffy.a);
      this.br = new fzf(this);
      this.br.a(this.m.A().c());
      this.bs = fzu.a(fzr.a(), this.aw);
      fnb.a(this);
      this.a(new fmw(wu.c("gui.loadingMinecraft")));
      List<asi> $$13 = this.aj.g();
      this.bm.a(fgf.b.a, $$13);
      ats $$14 = this.ag.a(ac.g(), this, I, $$13);
      guy.a.a(guu.C);
      ffw.b $$15 = new ffw.b($$11, $$0.e);
      this.a(new fnb(this, $$14, $$1x -> ac.a($$1x, $$1xx -> this.a($$1xx, $$15), () -> {
            if (aa.aU) {
               this.bg();
            }

            this.bm.a();
            this.a($$15);
         }), false));
      this.aN = gdp.a($$0.e.b());
   }

   private void a(@Nullable ffw.b $$0) {
      if (!this.bv) {
         this.bv = true;
         this.b($$0);
      }
   }

   private void b(@Nullable ffw.b $$0) {
      Runnable $$1 = this.c($$0);
      guy.a.b(guu.C);
      guy.a.b(guu.z);
      guy.a.a(this.aK.a());
      $$1.run();
   }

   public boolean c() {
      return this.bv;
   }

   private Runnable c(@Nullable ffw.b $$0) {
      List<Function<Runnable, fnl>> $$1 = new ArrayList<>();
      this.a($$1);
      Runnable $$2 = () -> {
         if ($$0 != null && $$0.b().a()) {
            gdo.a(this, $$0.b(), $$0.a());
         } else {
            this.a(new fnn(true));
         }
      };

      for (Function<Runnable, fnl> $$3 : Lists.reverse($$1)) {
         fnl $$4 = $$3.apply($$2);
         $$2 = () -> this.a($$4);
      }

      return $$2;
   }

   private void a(List<Function<Runnable, fnl>> $$0) {
      if (this.m.ad) {
         $$0.add($$0x -> new fmd(this.m, $$0x));
      }

      BanDetails $$1 = this.H();
      if ($$1 != null) {
         $$0.add($$1x -> fmg.a($$1xx -> {
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
            $$0.add($$1x -> fmg.a($$3.getName(), $$1x));
         }

         if ($$4.contains(ProfileActionType.USING_BANNED_SKIN)) {
            $$0.add(fmg::a);
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
      $$0.append(aa.b().c());
      fym $$1 = this.L();
      if ($$1 != null && $$1.k().i()) {
         $$0.append(" - ");
         fyz $$2 = this.S();
         if (this.aO != null && !this.aO.r()) {
            $$0.append(gqw.a("title.singleplayer"));
         } else if ($$2 != null && $$2.e()) {
            $$0.append(gqw.a("title.multiplayer.realms"));
         } else if (this.aO == null && ($$2 == null || !$$2.d())) {
            $$0.append(gqw.a("title.multiplayer.other"));
         } else {
            $$0.append(gqw.a("title.multiplayer.lan"));
         }
      }

      return $$0.toString();
   }

   private UserApiService a(YggdrasilAuthenticationService $$0, ftg $$1) {
      return $$1.a.a.g() != fgj.a.c ? UserApiService.OFFLINE : $$0.createUserApiService($$1.a.a.d());
   }

   public static ayf e() {
      return ayf.a("vanilla", ClientBrandRetriever::getClientModName, "Client", ffw.class);
   }

   private void a(Throwable $$0, @Nullable ffw.b $$1) {
      if (this.aj.d().size() > 1) {
         this.a($$0, null, $$1);
      } else {
         ac.a($$0);
      }
   }

   public void a(Throwable $$0, @Nullable wu $$1, @Nullable ffw.b $$2) {
      F.info("Caught error loading resourcepacks, removing all selected resourcepacks", $$0);
      this.bm.a($$0);
      this.ai.b();
      this.aj.b(Collections.emptyList());
      this.m.i.clear();
      this.m.j.clear();
      this.m.av();
      this.a(true, $$2).thenRun(() -> this.a($$1));
   }

   private void be() {
      this.a(null);
      if (this.r != null) {
         this.r.Y();
         this.y();
      }

      this.a(new fnn());
      this.a(null);
   }

   private void a(@Nullable wu $$0) {
      fke $$1 = this.aw();
      fkc.b($$1, fkc.a.c, wu.c("resourcePack.load_fail"), $$0);
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
               bmy $$1 = bmy.a("Renderer");
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
               this.a(new fne());
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
      this.aq.a(this.m);
   }

   private void a(int $$0, long $$1) {
      this.m.N().a(false);
      this.m.av();
   }

   public eza h() {
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

   public static void a(@Nullable ffw $$0, File $$1, o $$2) {
      File $$3 = new File($$1, "crash-reports");
      File $$4 = new File($$3, "crash-" + ac.f() + "-client.txt");
      akm.a($$2.e());
      if ($$0 != null) {
         $$0.ao.h();
      }

      if ($$2.f() != null) {
         akm.a("#@!@# Game crashed! Crash report saved to: #@!@# " + $$2.f());
         System.exit(-1);
      } else if ($$2.a($$4)) {
         akm.a("#@!@# Game crashed! Crash report saved to: #@!@# " + $$4.getAbsolutePath());
         System.exit(-1);
      } else {
         akm.a("#@?@# Game crashed! Crash report could not be saved. #@?@#");
         System.exit(-2);
      }
   }

   public boolean k() {
      return this.m.P().c();
   }

   public CompletableFuture<Void> l() {
      return this.a(false, null);
   }

   private CompletableFuture<Void> a(boolean $$0, @Nullable ffw.b $$1) {
      if (this.bf != null) {
         return this.bf;
      } else {
         CompletableFuture<Void> $$2 = new CompletableFuture<>();
         if (!$$0 && this.aW instanceof fnb) {
            this.bf = $$2;
            return $$2;
         } else {
            this.aj.a();
            List<asi> $$3 = this.aj.g();
            if (!$$0) {
               this.bm.a(fgf.b.b, $$3);
            }

            this.a(new fnb(this, this.ag.a(ac.g(), this, I, $$3), $$3x -> ac.a($$3x, $$2xx -> {
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
      gey $$1 = this.ao().a();
      grr $$2 = $$1.a().a();

      for (dfi $$3 : lq.e) {
         UnmodifiableIterator $$10 = $$3.l().a().iterator();

         while ($$10.hasNext()) {
            dsl $$4 = (dsl)$$10.next();
            if ($$4.l() == dlo.c) {
               grr $$5 = $$1.b($$4);
               if ($$5 == $$2) {
                  F.debug("Missing model for: {}", $$4);
                  $$0 = true;
               }
            }
         }
      }

      gpq $$6 = $$2.e();

      for (dfi $$7 : lq.e) {
         UnmodifiableIterator var17 = $$7.l().a().iterator();

         while (var17.hasNext()) {
            dsl $$8 = (dsl)var17.next();
            gpq $$9 = $$1.a($$8);
            if (!$$8.i() && $$9 == $$6) {
               F.debug("Missing particle icon for: {}", $$8);
            }
         }
      }

      for (cty $$10 : lq.g) {
         cud $$11 = $$10.w();
         String $$12 = $$11.t();
         String $$13 = wu.c($$12).getString();
         if ($$13.toLowerCase(Locale.ROOT).equals($$10.a())) {
            F.debug("Missing translation for: {} {} {}", new Object[]{$$11, $$12, $$10});
         }
      }

      $$0 |= fnc.a();
      $$0 |= gjp.a();
      if ($$0) {
         throw new IllegalStateException("Your game data is foobar, fix the errors above!");
      }
   }

   public eqk m() {
      return this.ac;
   }

   private void a(String $$0) {
      ffw.a $$1 = this.J();
      if (!$$1.a(this.T())) {
         if (this.l.b()) {
            this.l.b(false);
            this.a(new fmi($$0x -> {
               if ($$0x) {
                  ac.k().a("https://aka.ms/JavaAccountSettings");
               }

               this.a(null);
            }, ffw.a.e, "https://aka.ms/JavaAccountSettings", true));
         } else {
            wu $$2 = $$1.a();
            this.l.a($$2, false);
            this.bq.c($$2);
            this.l.b($$1 == ffw.a.d);
         }
      } else {
         this.a(new fmh($$0));
      }
   }

   public void a(@Nullable fnl $$0) {
      if (aa.aU && Thread.currentThread() != this.aY) {
         F.error("setScreen called from non-game thread");
      }

      if (this.y != null) {
         this.y.j();
      } else {
         this.a(fft.a);
      }

      if ($$0 == null && this.aX) {
         throw new IllegalStateException("Trying to return to in-game GUI during disconnection");
      } else {
         if ($$0 == null && this.r == null) {
            $$0 = new fnn();
         } else if ($$0 == null && this.s.ez()) {
            if (this.s.o()) {
               $$0 = new fmp(null, this.r.k().l());
            } else {
               this.s.fY();
            }
         }

         this.y = $$0;
         if (this.y != null) {
            this.y.aH_();
         }

         fak.a();
         if ($$0 != null) {
            this.n.j();
            ffu.b();
            $$0.b(this, this.Q.o(), this.Q.p());
            this.x = false;
         } else {
            this.ao.i();
            this.n.i();
         }

         this.d();
      }
   }

   public void a(@Nullable fnf $$0) {
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
         ac.c = System::nanoTime;
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
         fkv.b();
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
      if (this.Q.b()) {
         this.q();
      }

      if (this.bf != null && !(this.aW instanceof fnb)) {
         CompletableFuture<Void> $$1 = this.bf;
         this.bf = null;
         this.l().thenRun(() -> $$1.complete(null));
      }

      Runnable $$2;
      while (($$2 = this.be.poll()) != null) {
         $$2.run();
      }

      int $$3 = this.R.a(ac.c(), $$0);
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
      long $$5 = ac.d();
      boolean $$7;
      if (!this.aN().d() && !this.bl.e()) {
         $$7 = false;
         this.bo = 0.0;
      } else {
         $$7 = this.bp == null || this.bp.b();
         if ($$7) {
            fah.a().ifPresent(fah::b);
         }
      }

      RenderSystem.clear(16640, a);
      this.an.a(true);
      gdx.a();
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
         fhh $$8 = new fhh(this, this.S.c());
         this.a($$8, this.bk);
         $$8.e();
         this.bh.c();
      }

      this.bh.a("blit");
      this.an.e();
      this.an.a(this.Q.k(), this.Q.l());
      this.bc = ac.d() - $$5;
      if ($$7) {
         fah.a().ifPresent($$0x -> this.bp = $$0x.c());
      }

      this.bh.b("updateDisplay");
      this.Q.e();
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
      long $$10 = ac.d();
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

      while (ac.c() >= this.aU + 1000L) {
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
            this.m.i().c() == ffj.a ? "" : (this.m.i().c() == ffj.b ? " fast-clouds" : " fancy-clouds"),
            this.m.E().c(),
            $$12
         );
         this.aU += 1000L;
         this.aV = 0;
      }

      this.bh.c();
   }

   private bmv a(boolean $$0, @Nullable bmy $$1) {
      if (!$$0) {
         this.bj.b();
         if (!this.bl.e() && $$1 == null) {
            return bms.a;
         }
      }

      bmv $$2;
      if ($$0) {
         if (!this.bj.a()) {
            this.bi = 0;
            this.bj.c();
         }

         this.bi++;
         $$2 = this.bj.d();
      } else {
         $$2 = bms.a;
      }

      if (this.bl.e()) {
         $$2 = bmv.a($$2, this.bl.f());
      }

      return bmy.a($$2, $$1);
   }

   private void b(boolean $$0, @Nullable bmy $$1) {
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
         this.y.a(this, this.Q.o(), this.Q.p());
      }

      eza $$1 = this.h();
      $$1.a(this.Q.k(), this.Q.l(), a);
      this.j.a(this.Q.k(), this.Q.l());
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
      return this.r != null || this.y == null && this.aW == null ? this.Q.d() : 60;
   }

   private void bi() {
      try {
         aye.b();
         this.f.p();
      } catch (Throwable var3) {
      }

      try {
         System.gc();
         if (this.aQ && this.aO != null) {
            this.aO.a(true);
         }

         this.b((fnl)(new fmw(wu.c("menu.savingLevel"))));
      } catch (Throwable var2) {
      }

      System.gc();
   }

   public boolean a(Consumer<wu> $$0) {
      if (this.bl.e()) {
         this.bj();
         return false;
      } else {
         Consumer<bmu> $$1 = $$1x -> {
            if ($$1x != bmq.a) {
               int $$2x = $$1x.f();
               double $$3x = (double)$$1x.g() / (double)azh.a;
               this.execute(
                  () -> $$0.accept(
                        wu.a("commands.debug.stopped", String.format(Locale.ROOT, "%.2f", $$3x), $$2x, String.format(Locale.ROOT, "%.2f", (double)$$2x / $$3x))
                     )
               );
            }
         };
         Consumer<Path> $$2 = $$1x -> {
            wu $$2x = wu.b($$1x.toString()).a(n.t).a($$1xx -> $$1xx.a(new ws(ws.a.b, $$1x.toFile().getParent())));
            this.execute(() -> $$0.accept(wu.a("debug.profiling.stop", $$2x)));
         };
         ab $$3 = a(new ab(), this, this.ak, this.Z, this.m);
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
            CompletableFuture.allOf($$6, $$7).thenRunAsync(() -> $$4.accept(ImmutableList.of($$6.join(), $$7.join())), ac.h());
            this.aO.a($$0x -> {
            }, $$7::complete);
            $$5 = $$6::complete;
         }

         this.bl = boh.a(new gdm(ac.c, this.f), ac.c, ac.h(), new bon("client"), $$1x -> {
            this.bl = boi.a;
            $$1.accept($$1x);
         }, $$5);
         return true;
      }
   }

   private void bj() {
      this.bl.a();
      if (this.aO != null) {
         this.aO.aY();
      }
   }

   private void bk() {
      this.bl.b();
      if (this.aO != null) {
         this.aO.aZ();
      }
   }

   private Path a(ab $$0, List<Path> $$1) {
      String $$2;
      if (this.T()) {
         $$2 = this.V().bc().e();
      } else {
         fyz $$3 = this.S();
         $$2 = $$3 != null ? $$3.a : "unknown";
      }

      Path $$7;
      try {
         String $$5 = String.format(Locale.ROOT, "%s-%s-%s", ac.f(), $$2, aa.b().b());
         String $$6 = v.a(bon.a, $$5, ".zip");
         $$7 = bon.a.resolve($$6);
      } catch (IOException var21) {
         throw new UncheckedIOException(var21);
      }

      try (axr $$10 = new axr($$7)) {
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
      if (this.bk != null) {
         List<bmx> $$1 = this.bk.a(this.by);
         if (!$$1.isEmpty()) {
            bmx $$2 = $$1.remove(0);
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

   private void a(fhh $$0, bmu $$1) {
      List<bmx> $$2 = $$1.a(this.by);
      bmx $$3 = $$2.remove(0);
      RenderSystem.clear(256, a);
      RenderSystem.setShader(gdy::p);
      Matrix4f $$4 = new Matrix4f().setOrtho(0.0F, (float)this.Q.k(), (float)this.Q.l(), 0.0F, 1000.0F, 3000.0F);
      RenderSystem.setProjectionMatrix($$4, faw.b);
      Matrix4fStack $$5 = RenderSystem.getModelViewStack();
      $$5.pushMatrix();
      $$5.translation(0.0F, 0.0F, -2000.0F);
      RenderSystem.applyModelViewMatrix();
      RenderSystem.lineWidth(1.0F);
      faq $$6 = faq.b();
      faj $$7 = $$6.d();
      int $$8 = 160;
      int $$9 = this.Q.k() - 160 - 10;
      int $$10 = this.Q.l() - 320;
      RenderSystem.enableBlend();
      $$7.a(fat.b.h, fam.n);
      $$7.a((double)((float)$$9 - 176.0F), (double)((float)$$10 - 96.0F - 16.0F), 0.0).a(200, 0, 0, 0).e();
      $$7.a((double)((float)$$9 - 176.0F), (double)($$10 + 320), 0.0).a(200, 0, 0, 0).e();
      $$7.a((double)((float)$$9 + 176.0F), (double)($$10 + 320), 0.0).a(200, 0, 0, 0).e();
      $$7.a((double)((float)$$9 + 176.0F), (double)((float)$$10 - 96.0F - 16.0F), 0.0).a(200, 0, 0, 0).e();
      $$6.c();
      RenderSystem.disableBlend();
      double $$11 = 0.0;

      for (bmx $$12 : $$2) {
         int $$13 = ayg.a($$12.a / 4.0) + 1;
         $$7.a(fat.b.g, fam.n);
         int $$14 = $$12.a();
         int $$15 = $$14 >> 16 & 0xFF;
         int $$16 = $$14 >> 8 & 0xFF;
         int $$17 = $$14 & 0xFF;
         $$7.a((double)$$9, (double)$$10, 0.0).a($$15, $$16, $$17, 255).e();

         for (int $$18 = $$13; $$18 >= 0; $$18--) {
            float $$19 = (float)(($$11 + $$12.a * (double)$$18 / (double)$$13) * (float) (Math.PI * 2) / 100.0);
            float $$20 = ayg.a($$19) * 160.0F;
            float $$21 = ayg.b($$19) * 160.0F * 0.5F;
            $$7.a((double)((float)$$9 + $$20), (double)((float)$$10 - $$21), 0.0).a($$15, $$16, $$17, 255).e();
         }

         $$6.c();
         $$7.a(fat.b.f, fam.n);

         for (int $$22 = $$13; $$22 >= 0; $$22--) {
            float $$23 = (float)(($$11 + $$12.a * (double)$$22 / (double)$$13) * (float) (Math.PI * 2) / 100.0);
            float $$24 = ayg.a($$23) * 160.0F;
            float $$25 = ayg.b($$23) * 160.0F * 0.5F;
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
      String $$27 = bmu.b($$3.d);
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
         bmx $$31 = $$2.get($$30);
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
      this.aZ = false;
   }

   public boolean r() {
      return this.aZ;
   }

   public void b(boolean $$0) {
      if (this.y == null) {
         boolean $$1 = this.U() && !this.aO.r();
         if ($$1) {
            this.a(new fng(!$$0));
            this.ao.e();
         } else {
            this.a(new fng(true));
         }
      }
   }

   private void d(boolean $$0) {
      if (!$$0) {
         this.w = 0;
      }

      if (this.w <= 0 && !this.s.ft()) {
         if ($$0 && this.v != null && this.v.c() == ewf.a.b) {
            ewd $$1 = (ewd)this.v;
            ja $$2 = $$1.a();
            if (!this.r.a_($$2).i()) {
               jf $$3 = $$1.b();
               if (this.q.b($$2, $$3)) {
                  this.g.a($$2, $$3);
                  this.s.a(bqg.a);
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
         cud $$0 = this.s.b(bqg.a);
         if (!$$0.a(this.r.J())) {
            return false;
         } else {
            boolean $$1 = false;
            switch (this.v.c()) {
               case c:
                  this.q.a(this.s, ((ewe)this.v).a());
                  break;
               case b:
                  ewd $$2 = (ewd)this.v;
                  ja $$3 = $$2.a();
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

                  this.s.gu();
            }

            this.s.a(bqg.a);
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

            for (bqg $$0 : bqg.values()) {
               cud $$1 = this.s.b($$0);
               if (!$$1.a(this.r.J())) {
                  return;
               }

               if (this.v != null) {
                  switch (this.v.c()) {
                     case c:
                        ewe $$2 = (ewe)this.v;
                        bsh $$3 = $$2.a();
                        if (!this.r.C_().a($$3.dr())) {
                           return;
                        }

                        bqh $$4 = this.q.a(this.s, $$3, $$2, $$0);
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
                        ewd $$5 = (ewd)this.v;
                        int $$6 = $$1.H();
                        bqh $$7 = this.q.a(this.s, $$0, $$5);
                        if ($$7.a()) {
                           if ($$7.b()) {
                              this.s.a($$0);
                              if (!$$1.e() && ($$1.H() != $$6 || this.q.f())) {
                                 this.j.c.a($$0);
                              }
                           }

                           return;
                        }

                        if ($$7 == bqh.f) {
                           return;
                        }
                  }
               }

               if (!$$1.e()) {
                  bqh $$8 = this.q.a(this.s, $$0);
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

   public gue s() {
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
         if (this.y instanceof fmy $$0 && !this.s.fJ()) {
            $$0.m();
         }
      } else if (this.s.ez() && !(this.y instanceof fmp)) {
         this.a(null);
      } else if (this.s.fJ() && this.r != null) {
         this.a(new fmy());
      }

      if (this.y != null) {
         this.w = 10000;
      }

      if (this.y != null) {
         fnl.a(() -> this.y.e(), "Ticking screen", this.y.getClass().getCanonicalName());
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
               wu $$1 = wu.c("tutorial.socialInteractions.title");
               wu $$2 = wu.a("tutorial.socialInteractions.description", gvm.a("socialInteractions"));
               this.bg = new fkf(fkf.a.f, $$1, $$2, true);
               this.aG.a(this.bg, 160);
               this.m.s = true;
               this.m.av();
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

         this.bh.b("animateTick");
         if (!this.aS && this.bn()) {
            this.r.b(this.s.dv(), this.s.dx(), this.s.dB());
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
         ffh $$0 = this.m.aA();
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
               this.s.ga().k = $$1;
            } else {
               fop.a(this, $$1, $$3, $$2);
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

            this.a(new fsc());
         }
      }

      while (this.m.D.g()) {
         if (this.q.g()) {
            this.s.i();
         } else {
            this.aG.a();
            this.a(new fpb(this.s));
         }
      }

      while (this.m.S.g()) {
         this.a(new fnv(this.s.h.p()));
      }

      while (this.m.E.g()) {
         if (!this.s.N_()) {
            this.L().b(new ahf(ahf.a.g, ja.c, jf.a));
         }
      }

      while (this.m.F.g()) {
         if (!this.s.N_() && this.s.a(fnl.r())) {
            this.s.a(bqg.a);
         }
      }

      while (this.m.J.g()) {
         this.a("");
      }

      if (this.y == null && this.aW == null && this.m.L.g()) {
         this.a("/");
      }

      boolean $$4 = false;
      if (this.s.ft()) {
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

      if (this.m.G.e() && this.aR == 0 && !this.s.ft()) {
         this.bm();
      }

      this.d(this.y == null && !$$4 && this.m.H.e() && this.n.h());
   }

   public gun u() {
      return this.aK;
   }

   public double v() {
      return this.bo;
   }

   public fyx w() {
      return this.aL;
   }

   public fss x() {
      return new fss(this, this.ac);
   }

   public void a(eqk.c $$0, ath $$1, alh $$2, boolean $$3) {
      this.y();
      this.W.set(null);
      Instant $$4 = Instant.now();

      try {
         $$0.a($$2.c().a(), $$2.d());
         ale $$5 = ale.a(this.au, this.p);
         $$5.f().a(this);
         drd.a($$5, this);
         auf.a(false);
         this.aO = MinecraftServer.a((Function<Thread, gts>)($$4x -> new gts($$4x, this, $$0, $$1, $$2, $$5, $$0xx -> {
               aqz $$1xx = aqz.b($$0xx + 0);
               this.W.set($$1xx);
               return aqy.a($$1xx, this.be::add);
            })));
         this.aQ = true;
         this.a(fzr.a());
         this.aN.a(gdp.c.a, $$0.f(), $$2.d().e());
      } catch (Throwable var11) {
         o $$7 = o.a(var11, "Starting integrated server");
         p $$8 = $$7.a("Starting integrated server");
         $$8.a("Level ID", $$0.f());
         $$8.a("Level Name", () -> $$2.d().e());
         throw new y($$7);
      }

      while (this.W.get() == null) {
         Thread.yield();
      }

      fmz $$9 = new fmz(this.W.get());
      this.a($$9);
      this.bh.a("waitForServer");

      for (; !this.aO.ak() || this.aW != null; this.bf()) {
         $$9.e();
         this.c(false);

         try {
            Thread.sleep(16L);
         } catch (InterruptedException var10) {
         }
      }

      this.bh.c();
      Duration $$10 = Duration.between($$4, Instant.now());
      SocketAddress $$11 = this.aO.aj().a();
      vp $$12 = vp.a($$11);
      $$12.a($$11.toString(), 0, new fyk($$12, this, null, null, $$3, $$10, $$0x -> {
      }, null));
      $$12.a(new air(this.X().c(), this.X().b()));
      this.aP = $$12;
   }

   public void a(fyl $$0, fnj.a $$1) {
      this.e(new fnj(() -> false, $$1));
      this.r = $$0;
      this.a($$0);
      if (!this.aQ) {
         ale $$2 = ale.a(this.au, this.p);
         $$2.f().a(this);
         drd.a($$2, this);
         auf.a(false);
      }
   }

   public void y() {
      this.a(new fni(true), false);
   }

   public void b(fnl $$0) {
      this.a($$0, false);
   }

   public void a(fnl $$0, boolean $$1) {
      fym $$2 = this.L();
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

      gts $$3 = this.aO;
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

               while (!$$3.I()) {
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

      drd.b();
   }

   public void z() {
      this.ai.i();
      this.bB();
   }

   public void c(fnl $$0) {
      fym $$1 = this.L();
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

      drd.b();
   }

   private void e(fnl $$0) {
      this.bh.a("forcedTick");
      this.ao.f();
      this.t = null;
      this.aP = null;
      this.a($$0);
      this.c(false);
      this.bh.c();
   }

   public void d(fnl $$0) {
      this.bh.a("forcedTick");
      this.a($$0);
      this.c(false);
      this.bh.c();
   }

   private void a(@Nullable fyl $$0) {
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
      return aa.aU ? false : this.bq().flag(UserFlag.TELEMETRY_ENABLED);
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
      return this.J().a(false) ? this.aH.c($$0) : (this.s == null || !$$0.equals(this.s.cB())) && !$$0.equals(ac.e);
   }

   public ffw.a J() {
      if (this.m.m().c() == cmj.c) {
         return ffw.a.b;
      } else if (!this.af) {
         return ffw.a.c;
      } else {
         return !this.bq().flag(UserFlag.CHAT_ALLOWED) ? ffw.a.d : ffw.a.a;
      }
   }

   public final boolean K() {
      return this.ad;
   }

   @Nullable
   public fym L() {
      return this.s == null ? null : this.s.h;
   }

   public static boolean M() {
      return !E.m.Y;
   }

   public static boolean N() {
      return E.m.j().c().a() >= ffp.b.a();
   }

   public static boolean O() {
      return !E.j.a() && E.m.j().c().a() >= ffp.c.a();
   }

   public static boolean P() {
      return E.m.k().c();
   }

   private void br() {
      if (this.v != null && this.v.c() != ewf.a.a) {
         boolean $$0 = this.s.gb().d;
         dpq $$1 = null;
         ewf.a $$2 = this.v.c();
         cud $$6;
         if ($$2 == ewf.a.b) {
            ja $$3 = ((ewd)this.v).a();
            dsl $$4 = this.r.a_($$3);
            if ($$4.i()) {
               return;
            }

            dfi $$5 = $$4.b();
            $$6 = $$5.a((dcj)this.r, $$3, $$4);
            if ($$6.e()) {
               return;
            }

            if ($$0 && fnl.r() && $$4.t()) {
               $$1 = this.r.c_($$3);
            }
         } else {
            if ($$2 != ewf.a.c || !$$0) {
               return;
            }

            bsh $$7 = ((ewe)this.v).a();
            $$6 = $$7.dE();
            if ($$6 == null) {
               return;
            }
         }

         if ($$6.e()) {
            String $$10 = "";
            if ($$2 == ewf.a.b) {
               $$10 = lq.e.b(this.r.a_(((ewd)this.v).a()).b()).toString();
            } else if ($$2 == ewf.a.c) {
               $$10 = lq.f.b(((ewe)this.v).a().am()).toString();
            }

            F.warn("Picking on: [{}] {} gave null item", $$2, $$10);
         } else {
            cmk $$11 = this.s.ga();
            if ($$1 != null) {
               this.a($$6, $$1, this.r.H_());
            }

            int $$12 = $$11.c($$6);
            if ($$0) {
               $$11.b($$6);
               this.q.a(this.s.b(bqg.a), 36 + $$11.k);
            } else if ($$12 != -1) {
               if (cmk.d($$12)) {
                  $$11.k = $$12;
               } else {
                  this.q.a($$12);
               }
            }
         }
      }
   }

   private void a(cud $$0, dpq $$1, jx $$2) {
      tx $$3 = $$1.f($$2);
      $$1.a($$3);
      csc.a($$0, $$1.r(), $$3);
      $$0.b($$1.s());
   }

   public o d(o $$0) {
      ab $$1 = $$0.g();
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

   public static void a(@Nullable ffw $$0, @Nullable gqy $$1, String $$2, @Nullable fga $$3, o $$4) {
      ab $$5 = $$4.g();
      a($$5, $$0, $$1, $$2, $$3);
   }

   private static String a(double $$0) {
      return String.format(Locale.ROOT, "%.3fs", $$0);
   }

   private void a(p $$0) {
      $$0.a("JVM uptime", () -> a((double)ManagementFactory.getRuntimeMXBean().getUptime() / 1000.0));
      $$0.a("Wall uptime", () -> a((double)(System.currentTimeMillis() - this.bw) / 1000.0));
      $$0.a("High-res time", () -> a((double)ac.c() / 1000.0));
      $$0.a("Client ticks", () -> String.format(Locale.ROOT, "%d ticks / %.3fs", this.bx, (double)this.bx / 20.0));
   }

   private static ab a(ab $$0, @Nullable ffw $$1, @Nullable gqy $$2, String $$3, @Nullable fga $$4) {
      $$0.a("Launched Version", () -> $$3);
      String $$5 = bc();
      if ($$5 != null) {
         $$0.a("Launcher name", $$5);
      }

      $$0.a("Backend library", RenderSystem::getBackendDescription);
      $$0.a("Backend API", RenderSystem::getApiDescription);
      $$0.a("Window size", () -> $$1 != null ? $$1.Q.k() + "x" + $$1.Q.l() : "<not initialized>");
      $$0.a("GL Caps", RenderSystem::getCapsString);
      $$0.a("GL debug messages", () -> ezg.b() ? String.join("\n", ezg.a()) : "<disabled>");
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
         $$0.a("Resource Packs", () -> ath.a($$1.ac().f()));
      }

      if ($$2 != null) {
         $$0.a("Current Language", () -> $$2.a());
      }

      $$0.a("Locale", String.valueOf(Locale.getDefault()));
      $$0.a("CPU", ezh::b);
      return $$0;
   }

   public static ffw Q() {
      return E;
   }

   public CompletableFuture<Void> R() {
      return this.a(this::l).thenCompose($$0 -> (CompletionStage<Void>)$$0);
   }

   public void a(fzr $$0) {
      if (!this.bs.a($$0)) {
         this.bs = fzu.a($$0, this.aw);
      }
   }

   @Nullable
   public fyz S() {
      return x.a(this.L(), fym::w);
   }

   public boolean T() {
      return this.aQ;
   }

   public boolean U() {
      return this.aQ && this.aO != null;
   }

   @Nullable
   public gts V() {
      return this.aO;
   }

   public boolean W() {
      gts $$0 = this.V();
      return $$0 != null && !$$0.r();
   }

   public boolean b(UUID $$0) {
      return $$0.equals(this.X().b());
   }

   public fgj X() {
      return this.V;
   }

   public GameProfile Y() {
      ProfileResult $$0 = this.M.join();
      return $$0 != null ? $$0.profile() : new GameProfile(this.V.b(), this.V.c());
   }

   public Proxy Z() {
      return this.ab;
   }

   public gpr aa() {
      return this.N;
   }

   public atw ab() {
      return this.ag;
   }

   public ath ac() {
      return this.aj;
   }

   public asm ad() {
      return this.ah;
   }

   public gsg ae() {
      return this.ai;
   }

   public Path af() {
      return this.L;
   }

   public gqy ag() {
      return this.ak;
   }

   public Function<akk, gpq> a(akk $$0) {
      return this.az.a($$0)::a;
   }

   public boolean ah() {
      return this.aS;
   }

   public gdz ai() {
      return this.as;
   }

   public guj aj() {
      return this.ao;
   }

   public ave ak() {
      ave $$0 = x.a(this.y, fnl::C);
      if ($$0 != null) {
         return $$0;
      } else if (this.s != null) {
         if (this.s.dR().af() == dcg.j) {
            return this.l.j().b() ? avf.d : avf.e;
         } else {
            jj<ddg> $$1 = this.s.dR().t(this.s.dr());
            if (!this.ap.c(avf.f) && (!this.s.bl() || !$$1.a(avv.Z))) {
               return this.s.dR().af() != dcg.i && this.s.gb().d && this.s.gb().c ? avf.b : $$1.a().o().orElse(avf.g);
            } else {
               return avf.f;
            }
         }
      } else {
         return avf.a;
      }
   }

   public MinecraftSessionService al() {
      return this.av;
   }

   public gqr am() {
      return this.ay;
   }

   @Nullable
   public bsh an() {
      return this.t;
   }

   public void a(bsh $$0) {
      this.t = $$0;
      this.j.a($$0);
   }

   public boolean b(bsh $$0) {
      return $$0.ci() || this.s != null && this.s.N_() && this.m.R.e() && $$0.am() == bsn.by;
   }

   @Override
   protected Thread aA() {
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

   public gez ao() {
      return this.aA;
   }

   public gjm ap() {
      return this.T;
   }

   public gge aq() {
      return this.aJ;
   }

   public gkm ar() {
      return this.U;
   }

   public DataFixer as() {
      return this.O;
   }

   public ffn at() {
      return this.R;
   }

   public fgy au() {
      return this.al;
   }

   public boolean av() {
      return this.s != null && this.s.gq() || this.m.V().c();
   }

   public fke aw() {
      return this.aF;
   }

   public gvm ax() {
      return this.aG;
   }

   public boolean ay() {
      return this.bd;
   }

   public ffs aB() {
      return this.X;
   }

   public grx aC() {
      return this.az;
   }

   public gqp aD() {
      return this.aB;
   }

   public gqo aE() {
      return this.aC;
   }

   public gqn aF() {
      return this.aD;
   }

   public fhi aG() {
      return this.aE;
   }

   @Override
   public void a(boolean $$0) {
      this.bd = $$0;
   }

   public wu a(File $$0, int $$1, int $$2) {
      int $$3 = this.Q.k();
      int $$4 = this.Q.l();
      eza $$5 = new ezb($$1, $$2, true, a);
      float $$6 = this.s.dJ();
      float $$7 = this.s.dH();
      float $$8 = this.s.P;
      float $$9 = this.s.O;
      this.j.b(false);

      xi var12;
      try {
         this.j.c(true);
         this.f.e();
         this.Q.b($$1);
         this.Q.c($$2);

         for (int $$10 = 0; $$10 < 6; $$10++) {
            switch ($$10) {
               case 0:
                  this.s.s($$7);
                  this.s.t(0.0F);
                  break;
               case 1:
                  this.s.s(($$7 + 90.0F) % 360.0F);
                  this.s.t(0.0F);
                  break;
               case 2:
                  this.s.s(($$7 + 180.0F) % 360.0F);
                  this.s.t(0.0F);
                  break;
               case 3:
                  this.s.s(($$7 - 90.0F) % 360.0F);
                  this.s.t(0.0F);
                  break;
               case 4:
                  this.s.s($$7);
                  this.s.t(-90.0F);
                  break;
               case 5:
               default:
                  this.s.s($$7);
                  this.s.t(90.0F);
            }

            this.s.O = this.s.dH();
            this.s.P = this.s.dJ();
            $$5.a(true);
            this.j.a(ffn.b);

            try {
               Thread.sleep(10L);
            } catch (InterruptedException var17) {
            }

            fgg.a($$0, "panorama_" + $$10 + ".png", $$5, $$0x -> {
            });
         }

         wu $$11 = wu.b($$0.getName()).a(n.t).a($$1x -> $$1x.a(new ws(ws.a.b, $$0.getAbsolutePath())));
         return wu.a("screenshot.success", $$11);
      } catch (Exception var18) {
         F.error("Couldn't save image", var18);
         var12 = wu.a("screenshot.failure", var18.getMessage());
      } finally {
         this.s.t($$6);
         this.s.s($$7);
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

   private wu a(File $$0, int $$1, int $$2, int $$3, int $$4) {
      try {
         ByteBuffer $$5 = ezh.a($$1 * $$2 * 3);
         fgg $$6 = new fgg($$0, $$3, $$4, $$2);
         float $$7 = (float)$$3 / (float)$$1;
         float $$8 = (float)$$4 / (float)$$2;
         float $$9 = $$7 > $$8 ? $$7 : $$8;

         for (int $$10 = ($$4 - 1) / $$2 * $$2; $$10 >= 0; $$10 -= $$2) {
            for (int $$11 = 0; $$11 < $$3; $$11 += $$1) {
               RenderSystem.setShaderTexture(0, gpp.e);
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
         ezh.a($$5);
         wu $$15 = wu.b($$14.getName()).a(n.t).a($$1x -> $$1x.a(new ws(ws.a.b, $$14.getAbsolutePath())));
         return wu.a("screenshot.success", $$15);
      } catch (Exception var15) {
         F.warn("Couldn't save screenshot", var15);
         return wu.a("screenshot.failure", var15.getMessage());
      }
   }

   public bmv aH() {
      return this.bh;
   }

   @Nullable
   public aqz aI() {
      return this.W.get();
   }

   public gqs aJ() {
      return this.ar;
   }

   @Nullable
   public fnf aK() {
      return this.aW;
   }

   public fsa aL() {
      return this.aH;
   }

   public ezs aM() {
      return this.Q;
   }

   public fic aN() {
      return this.l.k();
   }

   public gel aO() {
      return this.S;
   }

   public void b(int $$0) {
      this.az.a($$0);
   }

   public fxm aP() {
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
   public ayt aS() {
      return ayt.a(this.au.getServicesKeySet(), ServicesKeyType.PROFILE_KEY);
   }

   public boolean aT() {
      return !this.au.getServicesKeySet().keys(ServicesKeyType.PROFILE_KEY).isEmpty();
   }

   public fft aU() {
      return this.Y;
   }

   public void a(fft $$0) {
      this.Y = $$0;
   }

   public ffo aV() {
      return this.bq;
   }

   public fzf aW() {
      return this.br;
   }

   public fzu aX() {
      return this.bs;
   }

   public fcu aY() {
      return this.aM;
   }

   public gdp aZ() {
      return this.aN;
   }

   public ffk ba() {
      return this.bt;
   }

   public evx bb() {
      return this.bu;
   }

   private float a(float $$0) {
      if (this.r != null) {
         bqs $$1 = this.r.s();
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
      a(wt.a) {
         @Override
         public boolean a(boolean $$0) {
            return true;
         }
      },
      b(wu.c("chat.disabled.options").a(n.m)) {
         @Override
         public boolean a(boolean $$0) {
            return false;
         }
      },
      c(wu.c("chat.disabled.launcher").a(n.m)) {
         @Override
         public boolean a(boolean $$0) {
            return $$0;
         }
      },
      d(wu.a("chat.disabled.profile", wu.d(ffw.E.m.J.h())).a(n.m)) {
         @Override
         public boolean a(boolean $$0) {
            return $$0;
         }
      };

      static final wu e = wu.c("chat.disabled.profile.moreInfo");
      private final wu f;

      a(final wu $$0) {
         this.f = $$0;
      }

      public wu a() {
         return this.f;
      }

      public abstract boolean a(boolean var1);
   }

   static record b(fbe a, ftg.c b) {
   }
}
