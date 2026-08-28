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

public class fgi extends bpk<Runnable> implements fah {
   static fgi E;
   private static final Logger F = LogUtils.getLogger();
   public static final boolean a = ad.k() == ad.a.d;
   private static final int G = 10;
   public static final akq b = akq.b("default");
   public static final akq c = akq.b("uniform");
   public static final akq d = akq.b("alt");
   private static final akq H = akq.b("regional_compliancies.json");
   private static final CompletableFuture<azr> I = CompletableFuture.completedFuture(azr.a);
   private static final wy J = wy.c("multiplayer.socialInteractions.not_available");
   public static final String e = "Please make sure you have up-to-date drivers (see aka.ms/mcdriver for instructions).";
   private final long K = Double.doubleToLongBits(Math.PI);
   private final Path L;
   private final CompletableFuture<ProfileResult> M;
   private final gqg N;
   private final DataFixer O;
   private final gfl P;
   private final fag Q;
   private final ffz.b R = new ffz.b(20.0F, 0L, this::a);
   private final gez S;
   public final ger f;
   private final gkb T;
   private final glb U;
   public final gcj g;
   private final fgv V;
   public final fhr h;
   public final fhr i;
   public final gem j;
   public final gig k;
   private final AtomicReference<arg> W = new AtomicReference<>();
   public final fhs l;
   public final fgm m;
   private final fge X;
   public final fgj n;
   public final fgh o;
   private fgf Y = fgf.a;
   public final File p;
   private final String Z;
   private final String aa;
   private final Proxy ab;
   private final eqz ac;
   private final boolean ad;
   private final boolean ae;
   private final boolean af;
   private final aua ag;
   private final ast ah;
   private final gsv ai;
   private final ato aj;
   private final grn ak;
   private final fhk al;
   private final fho am;
   private final ezp an;
   private final guy ao;
   private final gut ap;
   private final fkv aq;
   private final grh ar;
   private final gen as;
   private final fgo at = new fgo(H, fgi::b);
   private final YggdrasilAuthenticationService au;
   private final MinecraftSessionService av;
   private final UserApiService aw;
   private final CompletableFuture<UserProperties> ax;
   private final grg ay;
   private final gsm az;
   private final gfn aA;
   private final gre aB;
   private final grd aC;
   private final grc aD;
   private final fhu aE;
   private final fkq aF;
   private final gwb aG;
   private final fso aH;
   private final fya aI;
   private final ggs aJ;
   private final gvc aK;
   private final fzl aL;
   private final fdg aM;
   private final ged aN;
   @Nullable
   public fzi q;
   @Nullable
   public fyz r;
   @Nullable
   public gdv s;
   @Nullable
   private guh aO;
   @Nullable
   private vs aP;
   private boolean aQ;
   @Nullable
   public bsq t;
   @Nullable
   public bsq u;
   @Nullable
   public ewu v;
   private int aR;
   protected int w;
   private volatile boolean aS;
   private long aT = ad.d();
   private long aU;
   private int aV;
   public boolean x;
   @Nullable
   public fnx y;
   @Nullable
   private fnr aW;
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
   private fkr bg;
   private bne bh = bnb.a;
   private int bi;
   private final bmy bj = new bmy(ad.c, () -> this.bi);
   @Nullable
   private bnd bk;
   private bos bl = bor.a;
   private final fgr bm = new fgr();
   private long bn;
   private double bo;
   @Nullable
   private fav.a bp;
   private final fga bq;
   private final fzt br;
   private gai bs;
   private final ffw bt;
   private final ewm bu;
   private boolean bv;
   private final long bw;
   private long bx;
   private String by = "root";

   public fgi(ftu $$0) {
      super("Client");
      E = this;
      this.bw = System.currentTimeMillis();
      this.p = $$0.c.a;
      File $$1 = $$0.c.c;
      this.L = $$0.c.b.toPath();
      this.Z = $$0.d.b;
      this.aa = $$0.d.c;
      Path $$2 = this.p.toPath();
      this.bu = eqz.a($$2.resolve("allowed_symlinks.txt"));
      gqw $$3 = new gqw($$0.c.a(), this.bu);
      this.ai = new gsv(this, $$2.resolve("downloads"), $$0.a);
      atq $$4 = new atj(this.L, asr.a, atp.b, this.bu);
      this.aj = new ato($$3, this.ai.a(), $$4);
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
      yd.a(fgg::a);
      this.O = azw.a();
      this.aF = new fkq(this);
      this.aY = Thread.currentThread();
      this.m = new fgm(this, this.p);
      RenderSystem.setShaderGlintAlpha(this.m.an().c());
      this.aZ = true;
      this.aG = new gwb(this, this.m);
      this.X = new fge($$2, this.O);
      F.info("Backend library: {}", RenderSystem.getBackendDescription());
      ezu $$5;
      if (this.m.p > 0 && this.m.o > 0) {
         $$5 = new ezu(this.m.o, this.m.p, $$0.b.c, $$0.b.d, $$0.b.e);
      } else {
         $$5 = $$0.b;
      }

      ad.c = RenderSystem.initBackendSystem();
      this.P = new gfl(this);
      this.Q = this.P.a($$5, this.m.k, this.bd());
      this.a(true);
      gvn.a.b(gvj.A);

      try {
         this.Q.a(this.ah, ab.b().g() ? ezx.a : ezx.b);
      } catch (IOException var13) {
         F.error("Couldn't set icon", var13);
      }

      this.Q.a(this.m.h().c());
      this.n = new fgj(this);
      this.n.a(this.Q.j());
      this.o = new fgh(this);
      this.o.a(this.Q.j());
      RenderSystem.initRenderer(this.m.u, false);
      this.an = new ezm(this.Q.l(), this.Q.m());
      this.an.a(0.0F, 0.0F, 0.0F, 0.0F);
      this.an.b(a);
      this.ag = new aua(asr.a);
      this.aj.a();
      this.m.b(this.aj);
      this.ak = new grn(this.m.ac, $$0x -> {
         if (this.s != null) {
            this.s.h.A();
         }
      });
      this.ag.a(this.ak);
      this.N = new gqg(this.ag);
      this.ag.a(this.N);
      this.ay = new grg(this.N, $$1.toPath().resolve("skins"), this.av, this);
      this.ac = new eqz($$2.resolve("saves"), $$2.resolve("backups"), this.bu, this.O);
      this.bt = new ffw($$2);
      this.ao = new guy(this.m);
      this.ag.a(this.ao);
      this.ar = new grh(this.V);
      this.ag.a(this.ar);
      this.ap = new gut(this);
      this.aq = new fkv(this.N);
      this.h = this.aq.a();
      this.i = this.aq.b();
      this.ag.a(this.aq);
      this.g();
      this.ag.a(new gqz());
      this.ag.a(new gqy());
      this.Q.a("Startup");
      RenderSystem.setupDefaultState(0, 0, this.Q.l(), this.Q.m());
      this.Q.a("Post startup");
      this.al = fhk.a();
      this.am = fho.a(this.al);
      this.az = new gsm(this.N, this.al, this.m.C().c());
      this.ag.a(this.az);
      this.aI = new fya();
      this.ag.a(this.aI);
      this.aJ = new ggs(this.h, this.aI, this::ao, this::ar, this::ap);
      this.ag.a(this.aJ);
      geg $$8 = new geg(this.aJ, this.aI);
      this.ag.a($$8);
      this.U = new glb(this, this.N, this.az, this.am, $$8);
      this.ag.a(this.U);

      try {
         int $$9 = Runtime.getRuntime().availableProcessors();
         fbe.a();
         this.S = new gez($$9);
      } catch (OutOfMemoryError var12) {
         TinyFileDialogs.tinyfd_messageBox(
            "Minecraft",
            "Oh no! The game was unable to allocate memory off-heap while trying to start. You may try to free some memory by closing other applications on your computer, check that your system meets the minimum requirements, and try again. If the problem persists, please visit: https://aka.ms/Minecraft-Support",
            "ok",
            "error",
            true
         );
         throw new ftv("Unable to allocate render buffers", var12);
      }

      this.aH = new fso(this, this.aw);
      this.aA = new gfn(this.az.b(), $$8, this.al);
      this.ag.a(this.aA);
      this.T = new gkb(this, this.N, this.U, this.aA, this.h, this.m, this.aI);
      this.ag.a(this.T);
      this.g = new gcj(this.r, this.N);
      this.ag.a(this.g);
      this.aB = new gre(this.N);
      this.ag.a(this.aB);
      this.aC = new grd(this.N);
      this.ag.a(this.aC);
      this.aD = new grc(this.N);
      this.ag.a(this.aD);
      this.aE = new fhu(this.N);
      this.ag.a(this.aE);
      this.j = new gem(this, this.T.d(), this.ag, this.S);
      this.ag.a(this.j.d());
      this.f = new ger(this, this.T, this.aJ, this.S);
      this.ag.a(this.f);
      this.as = new gen();
      this.ag.a(this.as);
      this.ag.a(this.at);
      this.l = new fhs(this);
      this.k = new gig(this);
      fbs $$11 = fbs.a(this);
      this.aM = new fdg($$11);
      RenderSystem.setErrorCallback(this::a);
      if (this.an.c != this.Q.l() || this.an.d != this.Q.m()) {
         StringBuilder $$12 = new StringBuilder(
            "Recovering from unsupported resolution ("
               + this.Q.l()
               + "x"
               + this.Q.m()
               + ").\nPlease make sure you have up-to-date drivers (see aka.ms/mcdriver for instructions)."
         );
         if (ezv.b()) {
            $$12.append("\n\nReported GL debug messages:\n").append(String.join("\n", ezv.a()));
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
      this.aK = new gvc(this, this.aw, this.V);
      this.aL = fzl.a(this.aw, this.V, $$2);
      this.bq = new fga(this);
      this.bq.a(this.m.as().c() != fgk.a);
      this.br = new fzt(this);
      this.br.a(this.m.A().c());
      this.bs = gai.a(gaf.a(), this.aw);
      fnn.a(this);
      this.a(new fni(wy.c("gui.loadingMinecraft")));
      List<asp> $$13 = this.aj.g();
      this.bm.a(fgr.b.a, $$13);
      atz $$14 = this.ag.a(ad.g(), this, I, $$13);
      gvn.a.a(gvj.C);
      fgi.b $$15 = new fgi.b($$11, $$0.e);
      this.a(new fnn(this, $$14, $$1x -> ad.a($$1x, $$1xx -> this.a($$1xx, $$15), () -> {
            if (ab.aV) {
               this.bg();
            }

            this.bm.a();
            this.a($$15);
         }), false));
      this.aN = ged.a($$0.e.b());
   }

   private void a(@Nullable fgi.b $$0) {
      if (!this.bv) {
         this.bv = true;
         this.b($$0);
      }
   }

   private void b(@Nullable fgi.b $$0) {
      Runnable $$1 = this.c($$0);
      gvn.a.b(gvj.C);
      gvn.a.b(gvj.z);
      gvn.a.a(this.aK.a());
      $$1.run();
   }

   public boolean c() {
      return this.bv;
   }

   private Runnable c(@Nullable fgi.b $$0) {
      List<Function<Runnable, fnx>> $$1 = new ArrayList<>();
      this.a($$1);
      Runnable $$2 = () -> {
         if ($$0 != null && $$0.b().a()) {
            gec.a(this, $$0.b(), $$0.a());
         } else {
            this.a(new fnz(true));
         }
      };

      for (Function<Runnable, fnx> $$3 : Lists.reverse($$1)) {
         fnx $$4 = $$3.apply($$2);
         $$2 = () -> this.a($$4);
      }

      return $$2;
   }

   private void a(List<Function<Runnable, fnx>> $$0) {
      if (this.m.ad) {
         $$0.add($$0x -> new fmp(this.m, $$0x));
      }

      BanDetails $$1 = this.H();
      if ($$1 != null) {
         $$0.add($$1x -> fms.a($$1xx -> {
               if ($$1xx) {
                  ad.k().a("https://aka.ms/mcjavamoderation");
               }

               $$1x.run();
            }, $$1));
      }

      ProfileResult $$2 = this.M.join();
      if ($$2 != null) {
         GameProfile $$3 = $$2.profile();
         Set<ProfileActionType> $$4 = $$2.actions();
         if ($$4.contains(ProfileActionType.FORCED_NAME_CHANGE)) {
            $$0.add($$1x -> fms.a($$3.getName(), $$1x));
         }

         if ($$4.contains(ProfileActionType.USING_BANNED_SKIN)) {
            $$0.add(fms::a);
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
      fza $$1 = this.L();
      if ($$1 != null && $$1.k().i()) {
         $$0.append(" - ");
         fzn $$2 = this.S();
         if (this.aO != null && !this.aO.r()) {
            $$0.append(grl.a("title.singleplayer"));
         } else if ($$2 != null && $$2.e()) {
            $$0.append(grl.a("title.multiplayer.realms"));
         } else if (this.aO == null && ($$2 == null || !$$2.d())) {
            $$0.append(grl.a("title.multiplayer.other"));
         } else {
            $$0.append(grl.a("title.multiplayer.lan"));
         }
      }

      return $$0.toString();
   }

   private UserApiService a(YggdrasilAuthenticationService $$0, ftu $$1) {
      return $$1.a.a.g() != fgv.a.c ? UserApiService.OFFLINE : $$0.createUserApiService($$1.a.a.d());
   }

   public static aym e() {
      return aym.a("vanilla", ClientBrandRetriever::getClientModName, "Client", fgi.class);
   }

   private void a(Throwable $$0, @Nullable fgi.b $$1) {
      if (this.aj.d().size() > 1) {
         this.a($$0, null, $$1);
      } else {
         ad.a($$0);
      }
   }

   public void a(Throwable $$0, @Nullable wy $$1, @Nullable fgi.b $$2) {
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

      this.a(new fnz());
      this.a(null);
   }

   private void a(@Nullable wy $$0) {
      fkq $$1 = this.aw();
      fko.b($$1, fko.a.c, wy.c("resourcePack.load_fail"), $$0);
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
               bnh $$1 = bnh.a("Renderer");
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
               this.a(new fnq());
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
      this.m.av();
   }

   public ezp h() {
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

   public static void a(@Nullable fgi $$0, File $$1, o $$2) {
      Path $$3 = $$1.toPath().resolve("crash-reports");
      Path $$4 = $$3.resolve("crash-" + ad.f() + "-client.txt");
      aks.a($$2.a(y.a));
      if ($$0 != null) {
         $$0.ao.h();
      }

      if ($$2.e() != null) {
         aks.a("#@!@# Game crashed! Crash report saved to: #@!@# " + $$2.e().toAbsolutePath());
         System.exit(-1);
      } else if ($$2.a($$4, y.a)) {
         aks.a("#@!@# Game crashed! Crash report saved to: #@!@# " + $$4.toAbsolutePath());
         System.exit(-1);
      } else {
         aks.a("#@?@# Game crashed! Crash report could not be saved. #@?@#");
         System.exit(-2);
      }
   }

   public boolean k() {
      return this.m.P().c();
   }

   public CompletableFuture<Void> l() {
      return this.a(false, null);
   }

   private CompletableFuture<Void> a(boolean $$0, @Nullable fgi.b $$1) {
      if (this.bf != null) {
         return this.bf;
      } else {
         CompletableFuture<Void> $$2 = new CompletableFuture<>();
         if (!$$0 && this.aW instanceof fnn) {
            this.bf = $$2;
            return $$2;
         } else {
            this.aj.a();
            List<asp> $$3 = this.aj.g();
            if (!$$0) {
               this.bm.a(fgr.b.b, $$3);
            }

            this.a(new fnn(this, this.ag.a(ad.g(), this, I, $$3), $$3x -> ad.a($$3x, $$2xx -> {
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
      gfm $$1 = this.ao().a();
      gsg $$2 = $$1.a().a();

      for (dfw $$3 : lt.e) {
         UnmodifiableIterator $$10 = $$3.l().a().iterator();

         while ($$10.hasNext()) {
            dta $$4 = (dta)$$10.next();
            if ($$4.l() == dmd.c) {
               gsg $$5 = $$1.b($$4);
               if ($$5 == $$2) {
                  F.debug("Missing model for: {}", $$4);
                  $$0 = true;
               }
            }
         }
      }

      gqf $$6 = $$2.e();

      for (dfw $$7 : lt.e) {
         UnmodifiableIterator var17 = $$7.l().a().iterator();

         while (var17.hasNext()) {
            dta $$8 = (dta)var17.next();
            gqf $$9 = $$1.a($$8);
            if (!$$8.i() && $$9 == $$6) {
               F.debug("Missing particle icon for: {}", $$8);
            }
         }
      }

      for (cuj $$10 : lt.g) {
         cuo $$11 = $$10.w();
         String $$12 = $$11.t();
         String $$13 = wy.c($$12).getString();
         if ($$13.toLowerCase(Locale.ROOT).equals($$10.a())) {
            F.debug("Missing translation for: {} {} {}", new Object[]{$$11, $$12, $$10});
         }
      }

      $$0 |= fno.a();
      $$0 |= gke.a();
      if ($$0) {
         throw new IllegalStateException("Your game data is foobar, fix the errors above!");
      }
   }

   public eqz m() {
      return this.ac;
   }

   private void a(String $$0) {
      fgi.a $$1 = this.J();
      if (!$$1.a(this.T())) {
         if (this.l.b()) {
            this.l.b(false);
            this.a(new fmu($$0x -> {
               if ($$0x) {
                  ad.k().a("https://aka.ms/JavaAccountSettings");
               }

               this.a(null);
            }, fgi.a.e, "https://aka.ms/JavaAccountSettings", true));
         } else {
            wy $$2 = $$1.a();
            this.l.a($$2, false);
            this.bq.c($$2);
            this.l.b($$1 == fgi.a.d);
         }
      } else {
         this.a(new fmt($$0));
      }
   }

   public void a(@Nullable fnx $$0) {
      if (ab.aV && Thread.currentThread() != this.aY) {
         F.error("setScreen called from non-game thread");
      }

      if (this.y != null) {
         this.y.j();
      } else {
         this.a(fgf.a);
      }

      if ($$0 == null && this.aX) {
         throw new IllegalStateException("Trying to return to in-game GUI during disconnection");
      } else {
         if ($$0 == null && this.r == null) {
            $$0 = new fnz();
         } else if ($$0 == null && this.s.ey()) {
            if (this.s.o()) {
               $$0 = new fnb(null, this.r.k().l());
            } else {
               this.s.fX();
            }
         }

         this.y = $$0;
         if (this.y != null) {
            this.y.aH_();
         }

         fay.a();
         if ($$0 != null) {
            this.n.j();
            fgg.b();
            $$0.b(this, this.Q.p(), this.Q.q());
            this.x = false;
         } else {
            this.ao.i();
            this.n.i();
         }

         this.d();
      }
   }

   public void a(@Nullable fnr $$0) {
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
         flh.b();
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

      if (this.bf != null && !(this.aW instanceof fnn)) {
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
            fav.a().ifPresent(fav::b);
         }
      }

      RenderSystem.clear(16640, a);
      this.an.a(true);
      gel.a();
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
         fht $$8 = new fht(this, this.S.c());
         this.a($$8, this.bk);
         $$8.e();
         this.bh.c();
      }

      this.bh.a("blit");
      this.an.e();
      this.an.a(this.Q.l(), this.Q.m());
      this.bc = ad.d() - $$5;
      if ($$7) {
         fav.a().ifPresent($$0x -> this.bp = $$0x.c());
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
            this.m.i().c() == ffv.a ? "" : (this.m.i().c() == ffv.b ? " fast-clouds" : " fancy-clouds"),
            this.m.E().c(),
            $$12
         );
         this.aU += 1000L;
         this.aV = 0;
      }

      this.bh.c();
   }

   private bne a(boolean $$0, @Nullable bnh $$1) {
      if (!$$0) {
         this.bj.b();
         if (!this.bl.e() && $$1 == null) {
            return bnb.a;
         }
      }

      bne $$2;
      if ($$0) {
         if (!this.bj.a()) {
            this.bi = 0;
            this.bj.c();
         }

         this.bi++;
         $$2 = this.bj.d();
      } else {
         $$2 = bnb.a;
      }

      if (this.bl.e()) {
         $$2 = bne.a($$2, this.bl.f());
      }

      return bnh.a($$2, $$1);
   }

   private void b(boolean $$0, @Nullable bnh $$1) {
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

      ezp $$1 = this.h();
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
         ayl.b();
         this.f.p();
      } catch (Throwable var3) {
      }

      try {
         System.gc();
         if (this.aQ && this.aO != null) {
            this.aO.a(true);
         }

         this.b((fnx)(new fni(wy.c("menu.savingLevel"))));
      } catch (Throwable var2) {
      }

      System.gc();
   }

   public boolean a(Consumer<wy> $$0) {
      if (this.bl.e()) {
         this.bj();
         return false;
      } else {
         Consumer<bnd> $$1 = $$1x -> {
            if ($$1x != bmz.a) {
               int $$2x = $$1x.f();
               double $$3x = (double)$$1x.g() / (double)azo.a;
               this.execute(
                  () -> $$0.accept(
                        wy.a("commands.debug.stopped", String.format(Locale.ROOT, "%.2f", $$3x), $$2x, String.format(Locale.ROOT, "%.2f", (double)$$2x / $$3x))
                     )
               );
            }
         };
         Consumer<Path> $$2 = $$1x -> {
            wy $$2x = wy.b($$1x.toString()).a(n.t).a($$1xx -> $$1xx.a(new ww(ww.a.b, $$1x.toFile().getParent())));
            this.execute(() -> $$0.accept(wy.a("debug.profiling.stop", $$2x)));
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

         this.bl = boq.a(new gea(ad.c, this.f), ad.c, ad.h(), new bow("client"), $$1x -> {
            this.bl = bor.a;
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
         fzn $$3 = this.S();
         $$2 = $$3 != null ? $$3.a : "unknown";
      }

      Path $$7;
      try {
         String $$5 = String.format(Locale.ROOT, "%s-%s-%s", ad.f(), $$2, ab.b().b());
         String $$6 = v.a(bow.a, $$5, ".zip");
         $$7 = bow.a.resolve($$6);
      } catch (IOException var21) {
         throw new UncheckedIOException(var21);
      }

      try (axy $$10 = new axy($$7)) {
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
         List<bng> $$1 = this.bk.a(this.by);
         if (!$$1.isEmpty()) {
            bng $$2 = $$1.remove(0);
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

   private void a(fht $$0, bnd $$1) {
      List<bng> $$2 = $$1.a(this.by);
      bng $$3 = $$2.removeFirst();
      RenderSystem.clear(256, a);
      RenderSystem.setShader(gem::p);
      Matrix4f $$4 = new Matrix4f().setOrtho(0.0F, (float)this.Q.l(), (float)this.Q.m(), 0.0F, 1000.0F, 3000.0F);
      RenderSystem.setProjectionMatrix($$4, fbk.b);
      fbe $$5 = fbe.b();
      Matrix4fStack $$6 = RenderSystem.getModelViewStack();
      $$6.pushMatrix();
      $$6.translation(0.0F, 0.0F, -2000.0F);
      RenderSystem.applyModelViewMatrix();
      int $$7 = 160;
      int $$8 = this.Q.l() - 160 - 10;
      int $$9 = this.Q.m() - 320;
      double $$10 = 0.0;

      for (bng $$11 : $$2) {
         int $$12 = ayn.a($$11.a / 4.0) + 1;
         fax $$13 = $$5.a(fbh.c.g, fba.f);
         int $$14 = axx.b.e($$11.a());
         int $$15 = axx.b.a($$14, -8355712);
         $$13.a((float)$$8, (float)$$9, 0.0F).a($$14);

         for (int $$16 = $$12; $$16 >= 0; $$16--) {
            float $$17 = (float)(($$10 + $$11.a * (double)$$16 / (double)$$12) * (float) (Math.PI * 2) / 100.0);
            float $$18 = ayn.a($$17) * 160.0F;
            float $$19 = ayn.b($$17) * 160.0F * 0.5F;
            $$13.a((float)$$8 + $$18, (float)$$9 - $$19, 0.0F).a($$14);
         }

         fay.a($$13.b());
         $$13 = $$5.a(fbh.c.f, fba.f);

         for (int $$20 = $$12; $$20 >= 0; $$20--) {
            float $$21 = (float)(($$10 + $$11.a * (double)$$20 / (double)$$12) * (float) (Math.PI * 2) / 100.0);
            float $$22 = ayn.a($$21) * 160.0F;
            float $$23 = ayn.b($$21) * 160.0F * 0.5F;
            if (!($$23 > 0.0F)) {
               $$13.a((float)$$8 + $$22, (float)$$9 - $$23, 0.0F).a($$15);
               $$13.a((float)$$8 + $$22, (float)$$9 - $$23 + 10.0F, 0.0F).a($$15);
            }
         }

         fbb $$24 = $$13.a();
         if ($$24 != null) {
            fay.a($$24);
         }

         $$10 += $$11.a;
      }

      DecimalFormat $$25 = new DecimalFormat("##0.00");
      $$25.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.ROOT));
      String $$26 = bnd.b($$3.d);
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
         bng $$30 = $$2.get($$29);
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
            this.a(new fns(!$$0));
            this.ao.e();
         } else {
            this.a(new fns(true));
         }
      }
   }

   private void d(boolean $$0) {
      if (!$$0) {
         this.w = 0;
      }

      if (this.w <= 0 && !this.s.fs()) {
         if ($$0 && this.v != null && this.v.c() == ewu.a.b) {
            ews $$1 = (ews)this.v;
            jd $$2 = $$1.a();
            if (!this.r.a_($$2).i()) {
               ji $$3 = $$1.b();
               if (this.q.b($$2, $$3)) {
                  this.g.a($$2, $$3);
                  this.s.a(bqp.a);
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
      } else if (this.s.C()) {
         return false;
      } else {
         cuo $$0 = this.s.b(bqp.a);
         if (!$$0.a(this.r.J())) {
            return false;
         } else {
            boolean $$1 = false;
            switch (this.v.c()) {
               case c:
                  this.q.a(this.s, ((ewt)this.v).a());
                  break;
               case b:
                  ews $$2 = (ews)this.v;
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

                  this.s.gt();
            }

            this.s.a(bqp.a);
            return $$1;
         }
      }
   }

   private void bm() {
      if (!this.q.k()) {
         this.aR = 4;
         if (!this.s.C()) {
            if (this.v == null) {
               F.warn("Null returned as 'hitResult', this shouldn't happen!");
            }

            for (bqp $$0 : bqp.values()) {
               cuo $$1 = this.s.b($$0);
               if (!$$1.a(this.r.J())) {
                  return;
               }

               if (this.v != null) {
                  switch (this.v.c()) {
                     case c:
                        ewt $$2 = (ewt)this.v;
                        bsq $$3 = $$2.a();
                        if (!this.r.C_().a($$3.dq())) {
                           return;
                        }

                        bqq $$4 = this.q.a(this.s, $$3, $$2, $$0);
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
                        ews $$5 = (ews)this.v;
                        int $$6 = $$1.H();
                        bqq $$7 = this.q.a(this.s, $$0, $$5);
                        if ($$7.a()) {
                           if ($$7.b()) {
                              this.s.a($$0);
                              if (!$$1.e() && ($$1.H() != $$6 || this.q.f())) {
                                 this.j.c.a($$0);
                              }
                           }

                           return;
                        }

                        if ($$7 == bqq.f) {
                           return;
                        }
                  }
               }

               if (!$$1.e()) {
                  bqq $$8 = this.q.a(this.s, $$0);
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

   public gut s() {
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
         if (this.y instanceof fnk $$0 && !this.s.fI()) {
            $$0.m();
         }
      } else if (this.s.ey() && !(this.y instanceof fnb)) {
         this.a(null);
      } else if (this.s.fI() && this.r != null) {
         this.a(new fnk());
      }

      if (this.y != null) {
         this.w = 10000;
      }

      if (this.y != null) {
         fnx.a(() -> this.y.e(), "Ticking screen", this.y.getClass().getCanonicalName());
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
               wy $$1 = wy.c("tutorial.socialInteractions.title");
               wy $$2 = wy.a("tutorial.socialInteractions.description", gwb.a("socialInteractions"));
               this.bg = new fkr(fkr.a.f, $$1, $$2, true);
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

               throw new z($$4);
            }
         }

         this.bh.b("animateTick");
         if (!this.aS && this.bn()) {
            this.r.b(this.s.du(), this.s.dw(), this.s.dA());
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
         fft $$0 = this.m.aA();
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
               this.s.fZ().k = $$1;
            } else {
               fpc.a(this, $$1, $$3, $$2);
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

            this.a(new fsq());
         }
      }

      while (this.m.D.g()) {
         if (this.q.g()) {
            this.s.i();
         } else {
            this.aG.a();
            this.a(new fpn(this.s));
         }
      }

      while (this.m.S.g()) {
         this.a(new foh(this.s.h.p()));
      }

      while (this.m.E.g()) {
         if (!this.s.N_()) {
            this.L().b(new ahl(ahl.a.g, jd.c, ji.a));
         }
      }

      while (this.m.F.g()) {
         if (!this.s.N_() && this.s.a(fnx.r())) {
            this.s.a(bqp.a);
         }
      }

      while (this.m.J.g()) {
         this.a("");
      }

      if (this.y == null && this.aW == null && this.m.L.g()) {
         this.a("/");
      }

      boolean $$4 = false;
      if (this.s.fs()) {
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

      if (this.m.G.e() && this.aR == 0 && !this.s.fs()) {
         this.bm();
      }

      this.d(this.y == null && !$$4 && this.m.H.e() && this.n.h());
   }

   public gvc u() {
      return this.aK;
   }

   public double v() {
      return this.bo;
   }

   public fzl w() {
      return this.aL;
   }

   public ftg x() {
      return new ftg(this, this.ac);
   }

   public void a(eqz.c $$0, ato $$1, alo $$2, boolean $$3) {
      this.y();
      this.W.set(null);
      Instant $$4 = Instant.now();

      try {
         $$0.a($$2.c().a(), $$2.d());
         all $$5 = all.a(this.au, this.p);
         $$5.f().a(this);
         drs.a($$5, this);
         aum.a(false);
         this.aO = MinecraftServer.a((Function<Thread, guh>)($$4x -> new guh($$4x, this, $$0, $$1, $$2, $$5, $$0xx -> {
               arg $$1xx = arg.b($$0xx + 0);
               this.W.set($$1xx);
               return arf.a($$1xx, this.be::add);
            })));
         this.aQ = true;
         this.a(gaf.a());
         this.aN.a(ged.c.a, $$0.f(), $$2.d().e());
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

      fnl $$9 = new fnl(this.W.get());
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
      vs $$12 = vs.a($$11);
      $$12.a($$11.toString(), 0, new fyy($$12, this, null, null, $$3, $$10, $$0x -> {
      }, null));
      $$12.a(new aix(this.X().c(), this.X().b()));
      this.aP = $$12;
   }

   public void a(fyz $$0, fnv.a $$1) {
      this.e(new fnv(() -> false, $$1));
      this.r = $$0;
      this.a($$0);
      if (!this.aQ) {
         all $$2 = all.a(this.au, this.p);
         $$2.f().a(this);
         drs.a($$2, this);
         aum.a(false);
      }
   }

   public void y() {
      this.a(new fnu(true), false);
   }

   public void b(fnx $$0) {
      this.a($$0, false);
   }

   public void a(fnx $$0, boolean $$1) {
      fza $$2 = this.L();
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

      guh $$3 = this.aO;
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

      drs.b();
   }

   public void z() {
      this.ai.i();
      this.bB();
   }

   public void c(fnx $$0) {
      fza $$1 = this.L();
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

      drs.b();
   }

   private void e(fnx $$0) {
      this.bh.a("forcedTick");
      this.ao.f();
      this.t = null;
      this.aP = null;
      this.a($$0);
      this.c(false);
      this.bh.c();
   }

   public void d(fnx $$0) {
      this.bh.a("forcedTick");
      this.a($$0);
      this.c(false);
      this.bh.c();
   }

   private void a(@Nullable fyz $$0) {
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
      return ab.aV ? false : this.bq().flag(UserFlag.TELEMETRY_ENABLED);
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
      return this.J().a(false) ? this.aH.c($$0) : (this.s == null || !$$0.equals(this.s.cA())) && !$$0.equals(ad.e);
   }

   public fgi.a J() {
      if (this.m.m().c() == cmt.c) {
         return fgi.a.b;
      } else if (!this.af) {
         return fgi.a.c;
      } else {
         return !this.bq().flag(UserFlag.CHAT_ALLOWED) ? fgi.a.d : fgi.a.a;
      }
   }

   public final boolean K() {
      return this.ad;
   }

   @Nullable
   public fza L() {
      return this.s == null ? null : this.s.h;
   }

   public static boolean M() {
      return !E.m.Y;
   }

   public static boolean N() {
      return E.m.j().c().a() >= fgb.b.a();
   }

   public static boolean O() {
      return !E.j.a() && E.m.j().c().a() >= fgb.c.a();
   }

   public static boolean P() {
      return E.m.k().c();
   }

   private void br() {
      if (this.v != null && this.v.c() != ewu.a.a) {
         boolean $$0 = this.s.ga().d;
         dqf $$1 = null;
         ewu.a $$2 = this.v.c();
         cuo $$6;
         if ($$2 == ewu.a.b) {
            jd $$3 = ((ews)this.v).a();
            dta $$4 = this.r.a_($$3);
            if ($$4.i()) {
               return;
            }

            dfw $$5 = $$4.b();
            $$6 = $$5.a((dcx)this.r, $$3, $$4);
            if ($$6.e()) {
               return;
            }

            if ($$0 && fnx.r() && $$4.t()) {
               $$1 = this.r.c_($$3);
            }
         } else {
            if ($$2 != ewu.a.c || !$$0) {
               return;
            }

            bsq $$7 = ((ewt)this.v).a();
            $$6 = $$7.dD();
            if ($$6 == null) {
               return;
            }
         }

         if ($$6.e()) {
            String $$10 = "";
            if ($$2 == ewu.a.b) {
               $$10 = lt.e.b(this.r.a_(((ews)this.v).a()).b()).toString();
            } else if ($$2 == ewu.a.c) {
               $$10 = lt.f.b(((ewt)this.v).a().am()).toString();
            }

            F.warn("Picking on: [{}] {} gave null item", $$2, $$10);
         } else {
            cmu $$11 = this.s.fZ();
            if ($$1 != null) {
               this.a($$6, $$1, this.r.H_());
            }

            int $$12 = $$11.c($$6);
            if ($$0) {
               $$11.b($$6);
               this.q.a(this.s.b(bqp.a), 36 + $$11.k);
            } else if ($$12 != -1) {
               if (cmu.d($$12)) {
                  $$11.k = $$12;
               } else {
                  this.q.a($$12);
               }
            }
         }
      }
   }

   private void a(cuo $$0, dqf $$1, ka $$2) {
      ua $$3 = $$1.f($$2);
      $$1.a($$3);
      csm.a($$0, $$1.r(), $$3);
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

   public static void a(@Nullable fgi $$0, @Nullable grn $$1, String $$2, @Nullable fgm $$3, o $$4) {
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

   private static ac a(ac $$0, @Nullable fgi $$1, @Nullable grn $$2, String $$3, @Nullable fgm $$4) {
      $$0.a("Launched Version", () -> $$3);
      String $$5 = bc();
      if ($$5 != null) {
         $$0.a("Launcher name", $$5);
      }

      $$0.a("Backend library", RenderSystem::getBackendDescription);
      $$0.a("Backend API", RenderSystem::getApiDescription);
      $$0.a("Window size", () -> $$1 != null ? $$1.Q.l() + "x" + $$1.Q.m() : "<not initialized>");
      $$0.a("GFLW Platform", fag::a);
      $$0.a("GL Caps", RenderSystem::getCapsString);
      $$0.a("GL debug messages", () -> ezv.b() ? String.join("\n", ezv.a()) : "<disabled>");
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
         $$0.a("Resource Packs", () -> ato.a($$1.ac().f()));
      }

      if ($$2 != null) {
         $$0.a("Current Language", () -> $$2.a());
      }

      $$0.a("Locale", String.valueOf(Locale.getDefault()));
      $$0.a("System encoding", () -> System.getProperty("sun.jnu.encoding", "<not set>"));
      $$0.a("File encoding", () -> System.getProperty("file.encoding", "<not set>"));
      $$0.a("CPU", ezw::b);
      return $$0;
   }

   public static fgi Q() {
      return E;
   }

   public CompletableFuture<Void> R() {
      return this.a(this::l).thenCompose($$0 -> (CompletionStage<Void>)$$0);
   }

   public void a(gaf $$0) {
      if (!this.bs.a($$0)) {
         this.bs = gai.a($$0, this.aw);
      }
   }

   @Nullable
   public fzn S() {
      return x.a(this.L(), fza::w);
   }

   public boolean T() {
      return this.aQ;
   }

   public boolean U() {
      return this.aQ && this.aO != null;
   }

   @Nullable
   public guh V() {
      return this.aO;
   }

   public boolean W() {
      guh $$0 = this.V();
      return $$0 != null && !$$0.r();
   }

   public boolean b(UUID $$0) {
      return $$0.equals(this.X().b());
   }

   public fgv X() {
      return this.V;
   }

   public GameProfile Y() {
      ProfileResult $$0 = this.M.join();
      return $$0 != null ? $$0.profile() : new GameProfile(this.V.b(), this.V.c());
   }

   public Proxy Z() {
      return this.ab;
   }

   public gqg aa() {
      return this.N;
   }

   public aud ab() {
      return this.ag;
   }

   public ato ac() {
      return this.aj;
   }

   public ast ad() {
      return this.ah;
   }

   public gsv ae() {
      return this.ai;
   }

   public Path af() {
      return this.L;
   }

   public grn ag() {
      return this.ak;
   }

   public Function<akq, gqf> a(akq $$0) {
      return this.az.a($$0)::a;
   }

   public boolean ah() {
      return this.aS;
   }

   public gen ai() {
      return this.as;
   }

   public guy aj() {
      return this.ao;
   }

   public avl ak() {
      avl $$0 = x.a(this.y, fnx::C);
      if ($$0 != null) {
         return $$0;
      } else if (this.s != null) {
         if (this.s.dQ().af() == dcu.j) {
            return this.l.j().b() ? avm.d : avm.e;
         } else {
            jm<ddu> $$1 = this.s.dQ().t(this.s.dq());
            if (!this.ap.c(avm.f) && (!this.s.bk() || !$$1.a(awc.Z))) {
               return this.s.dQ().af() != dcu.i && this.s.ga().d && this.s.ga().c ? avm.b : $$1.a().o().orElse(avm.g);
            } else {
               return avm.f;
            }
         }
      } else {
         return avm.a;
      }
   }

   public MinecraftSessionService al() {
      return this.av;
   }

   public grg am() {
      return this.ay;
   }

   @Nullable
   public bsq an() {
      return this.t;
   }

   public void a(bsq $$0) {
      this.t = $$0;
      this.j.a($$0);
   }

   public boolean b(bsq $$0) {
      return $$0.ch() || this.s != null && this.s.N_() && this.m.R.e() && $$0.am() == bsw.by;
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

   public gfn ao() {
      return this.aA;
   }

   public gkb ap() {
      return this.T;
   }

   public ggs aq() {
      return this.aJ;
   }

   public glb ar() {
      return this.U;
   }

   public DataFixer as() {
      return this.O;
   }

   public ffz at() {
      return this.R;
   }

   public fhk au() {
      return this.al;
   }

   public boolean av() {
      return this.s != null && this.s.gp() || this.m.V().c();
   }

   public fkq aw() {
      return this.aF;
   }

   public gwb ax() {
      return this.aG;
   }

   public boolean aA() {
      return this.bd;
   }

   public fge aB() {
      return this.X;
   }

   public gsm aC() {
      return this.az;
   }

   public gre aD() {
      return this.aB;
   }

   public grd aE() {
      return this.aC;
   }

   public grc aF() {
      return this.aD;
   }

   public fhu aG() {
      return this.aE;
   }

   @Override
   public void a(boolean $$0) {
      this.bd = $$0;
   }

   public wy a(File $$0, int $$1, int $$2) {
      int $$3 = this.Q.l();
      int $$4 = this.Q.m();
      ezp $$5 = new ezq($$1, $$2, true, a);
      float $$6 = this.s.dI();
      float $$7 = this.s.dG();
      float $$8 = this.s.P;
      float $$9 = this.s.O;
      this.j.b(false);

      xm var12;
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

            this.s.O = this.s.dG();
            this.s.P = this.s.dI();
            $$5.a(true);
            this.j.a(ffz.b);

            try {
               Thread.sleep(10L);
            } catch (InterruptedException var17) {
            }

            fgs.a($$0, "panorama_" + $$10 + ".png", $$5, $$0x -> {
            });
         }

         wy $$11 = wy.b($$0.getName()).a(n.t).a($$1x -> $$1x.a(new ww(ww.a.b, $$0.getAbsolutePath())));
         return wy.a("screenshot.success", $$11);
      } catch (Exception var18) {
         F.error("Couldn't save image", var18);
         var12 = wy.a("screenshot.failure", var18.getMessage());
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

   private wy a(File $$0, int $$1, int $$2, int $$3, int $$4) {
      try {
         ByteBuffer $$5 = ezw.a($$1 * $$2 * 3);
         fgs $$6 = new fgs($$0, $$3, $$4, $$2);
         float $$7 = (float)$$3 / (float)$$1;
         float $$8 = (float)$$4 / (float)$$2;
         float $$9 = $$7 > $$8 ? $$7 : $$8;

         for (int $$10 = ($$4 - 1) / $$2 * $$2; $$10 >= 0; $$10 -= $$2) {
            for (int $$11 = 0; $$11 < $$3; $$11 += $$1) {
               RenderSystem.setShaderTexture(0, gqe.e);
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
         ezw.a($$5);
         wy $$15 = wy.b($$14.getName()).a(n.t).a($$1x -> $$1x.a(new ww(ww.a.b, $$14.getAbsolutePath())));
         return wy.a("screenshot.success", $$15);
      } catch (Exception var15) {
         F.warn("Couldn't save screenshot", var15);
         return wy.a("screenshot.failure", var15.getMessage());
      }
   }

   public bne aH() {
      return this.bh;
   }

   @Nullable
   public arg aI() {
      return this.W.get();
   }

   public grh aJ() {
      return this.ar;
   }

   @Nullable
   public fnr aK() {
      return this.aW;
   }

   public fso aL() {
      return this.aH;
   }

   public fag aM() {
      return this.Q;
   }

   public fio aN() {
      return this.l.k();
   }

   public gez aO() {
      return this.S;
   }

   public void b(int $$0) {
      this.az.a($$0);
   }

   public fya aP() {
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
   public aza aS() {
      return aza.a(this.au.getServicesKeySet(), ServicesKeyType.PROFILE_KEY);
   }

   public boolean aT() {
      return !this.au.getServicesKeySet().keys(ServicesKeyType.PROFILE_KEY).isEmpty();
   }

   public fgf aU() {
      return this.Y;
   }

   public void a(fgf $$0) {
      this.Y = $$0;
   }

   public fga aV() {
      return this.bq;
   }

   public fzt aW() {
      return this.br;
   }

   public gai aX() {
      return this.bs;
   }

   public fdg aY() {
      return this.aM;
   }

   public ged aZ() {
      return this.aN;
   }

   public ffw ba() {
      return this.bt;
   }

   public ewm bb() {
      return this.bu;
   }

   private float a(float $$0) {
      if (this.r != null) {
         brb $$1 = this.r.s();
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
      a(wx.a) {
         @Override
         public boolean a(boolean $$0) {
            return true;
         }
      },
      b(wy.c("chat.disabled.options").a(n.m)) {
         @Override
         public boolean a(boolean $$0) {
            return false;
         }
      },
      c(wy.c("chat.disabled.launcher").a(n.m)) {
         @Override
         public boolean a(boolean $$0) {
            return $$0;
         }
      },
      d(wy.a("chat.disabled.profile", wy.d(fgi.E.m.J.h())).a(n.m)) {
         @Override
         public boolean a(boolean $$0) {
            return $$0;
         }
      };

      static final wy e = wy.c("chat.disabled.profile.moreInfo");
      private final wy f;

      a(final wy $$0) {
         this.f = $$0;
      }

      public wy a() {
         return this.f;
      }

      public abstract boolean a(boolean var1);
   }

   static record b(fbs a, ftu.c b) {
   }
}
