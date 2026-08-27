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
import java.util.stream.Stream;
import javax.annotation.Nullable;
import net.minecraft.client.ClientBrandRetriever;
import net.minecraft.server.MinecraftServer;
import org.apache.commons.io.FileUtils;
import org.joml.Matrix4f;
import org.joml.Matrix4fStack;
import org.lwjgl.util.tinyfd.TinyFileDialogs;
import org.slf4j.Logger;

public class feb extends boq<Runnable> implements exz {
   static feb E;
   private static final Logger F = LogUtils.getLogger();
   public static final boolean a = ac.k() == ac.a.d;
   private static final int G = 10;
   public static final akn b = new akn("default");
   public static final akn c = new akn("uniform");
   public static final akn d = new akn("alt");
   private static final akn H = new akn("regional_compliancies.json");
   private static final CompletableFuture<azh> I = CompletableFuture.completedFuture(azh.a);
   private static final wx J = wx.b("(+NBT)");
   private static final wx K = wx.c("multiplayer.socialInteractions.not_available");
   public static final String e = "Please make sure you have up-to-date drivers (see aka.ms/mcdriver for instructions).";
   private final long L = Double.doubleToLongBits(Math.PI);
   private final Path M;
   private final CompletableFuture<ProfileResult> N;
   private final gnw O;
   private final DataFixer P;
   private final gdc Q;
   private final exy R;
   private final fen S = new fen(20.0F, 0L, this::a);
   private final gcq T;
   public final gci f;
   private final ghr U;
   private final gir V;
   public final gaa g;
   private final grv W = new grv();
   private final fep X;
   public final ffl h;
   public final ffl i;
   public final gcd j;
   public final gfw k;
   private final AtomicReference<ara> Y = new AtomicReference<>();
   public final ffm l;
   public final fef m;
   private final fdx Z;
   public final fec n;
   public final fea o;
   private fdy aa = fdy.a;
   public final File p;
   private final String ab;
   private final String ac;
   private final Proxy ad;
   private final eox ae;
   private final boolean af;
   private final boolean ag;
   private final boolean ah;
   private final atu ai;
   private final asn aj;
   private final gql ak;
   private final ati al;
   private final gpd am;
   private final ffe an;
   private final ffi ao;
   private final exg ap;
   private final gsn aq;
   private final gsi ar;
   private final fip as;
   private final gox at;
   private final gce au;
   private final feh av = new feh(H, feb::b);
   private final YggdrasilAuthenticationService aw;
   private final MinecraftSessionService ax;
   private final UserApiService ay;
   private final CompletableFuture<UserProperties> az;
   private final gow aA;
   private final gqc aB;
   private final gde aC;
   private final gou aD;
   private final got aE;
   private final gos aF;
   private final ffo aG;
   private final fik aH;
   private final gtq aI;
   private final fqg aJ;
   private final fvs aK;
   private final gej aL;
   private final gsr aM;
   private final fxd aN;
   private final fba aO;
   private final gbu aP;
   @Nullable
   public fxa q;
   @Nullable
   public fwr r;
   @Nullable
   public gbm s;
   @Nullable
   private gsa aQ;
   @Nullable
   private vv aR;
   private boolean aS;
   @Nullable
   public brw t;
   @Nullable
   public brw u;
   @Nullable
   public euk v;
   private int aT;
   protected int w;
   private volatile boolean aU;
   private float aV;
   private long aW = ac.d();
   private long aX;
   private int aY;
   public boolean x;
   @Nullable
   public flz y;
   @Nullable
   private flt aZ;
   private boolean ba;
   private Thread bb;
   private volatile boolean bc;
   @Nullable
   private Supplier<o> bd;
   private static int be;
   public String z = "";
   private long bf;
   public boolean A;
   public boolean B;
   public boolean C;
   public boolean D = true;
   private boolean bg;
   private final Queue<Runnable> bh = Queues.newConcurrentLinkedQueue();
   @Nullable
   private CompletableFuture<Void> bi;
   @Nullable
   private fil bj;
   private bmk bk = bmh.a;
   private int bl;
   private final bme bm = new bme(ac.c, () -> this.bl);
   @Nullable
   private bmj bn;
   private bny bo = bnx.a;
   private final fek bp = new fek();
   private long bq;
   private double br;
   @Nullable
   private eyn.a bs;
   private final fdt bt;
   private final fxk bu;
   private fxz bv;
   private final fdq bw;
   private final euc bx;
   private boolean by;
   private final long bz;
   private long bA;
   private String bB = "root";

   public feb(frm $$0) {
      super("Client");
      E = this;
      this.bz = System.currentTimeMillis();
      this.p = $$0.c.a;
      File $$1 = $$0.c.c;
      this.M = $$0.c.b.toPath();
      this.ab = $$0.d.b;
      this.ac = $$0.d.c;
      Path $$2 = this.p.toPath();
      this.bx = eox.a($$2.resolve("allowed_symlinks.txt"));
      gom $$3 = new gom($$0.c.a(), this.bx);
      this.ak = new gql(this, $$2.resolve("downloads"), $$0.a);
      atk $$4 = new atd(this.M, asl.a, atj.b, this.bx);
      this.al = new ati($$3, this.ak.a(), $$4);
      this.aj = $$3.a();
      this.ad = $$0.a.d;
      this.aw = new YggdrasilAuthenticationService(this.ad);
      this.ax = this.aw.createMinecraftSessionService();
      this.X = $$0.a.a;
      this.N = CompletableFuture.supplyAsync(() -> this.ax.fetchProfile(this.X.b(), true), ac.i());
      this.ay = this.a(this.aw, $$0);
      this.az = CompletableFuture.supplyAsync(() -> {
         try {
            return this.ay.fetchProperties();
         } catch (AuthenticationException var2x) {
            F.error("Failed to fetch user properties", var2x);
            return UserApiService.OFFLINE_PROPERTIES;
         }
      }, ac.i());
      F.info("Setting user: {}", this.X.c());
      F.debug("(Session ID is {})", this.X.a());
      this.af = $$0.d.a;
      this.ag = !$$0.d.d;
      this.ah = !$$0.d.e;
      this.aQ = null;
      yc.a(fdz::a);
      this.P = azm.a();
      this.aH = new fik(this);
      this.bb = Thread.currentThread();
      this.m = new fef(this, this.p);
      RenderSystem.setShaderGlintAlpha(this.m.an().c());
      this.bc = true;
      this.aI = new gtq(this, this.m);
      this.Z = new fdx($$2, this.P);
      F.info("Backend library: {}", RenderSystem.getBackendDescription());
      exl $$5;
      if (this.m.p > 0 && this.m.o > 0) {
         $$5 = new exl(this.m.o, this.m.p, $$0.b.c, $$0.b.d, $$0.b.e);
      } else {
         $$5 = $$0.b;
      }

      ac.c = RenderSystem.initBackendSystem();
      this.Q = new gdc(this);
      this.R = this.Q.a($$5, this.m.k, this.bf());
      this.a(true);
      gtc.a.b(gsy.A);

      try {
         this.R.a(this.aj, aa.b().g() ? exo.a : exo.b);
      } catch (IOException var13) {
         F.error("Couldn't set icon", var13);
      }

      this.R.a(this.m.h().c());
      this.n = new fec(this);
      this.n.a(this.R.i());
      this.o = new fea(this);
      this.o.a(this.R.i());
      RenderSystem.initRenderer(this.m.u, false);
      this.ap = new exd(this.R.k(), this.R.l());
      this.ap.a(0.0F, 0.0F, 0.0F, 0.0F);
      this.ap.b(a);
      this.ai = new atu(asl.a);
      this.al.a();
      this.m.b(this.al);
      this.am = new gpd(this.m.ac);
      this.ai.a(this.am);
      this.O = new gnw(this.ai);
      this.ai.a(this.O);
      this.aA = new gow(this.O, $$1.toPath().resolve("skins"), this.ax, this);
      this.ae = new eox($$2.resolve("saves"), $$2.resolve("backups"), this.bx, this.P);
      this.bw = new fdq($$2);
      this.aq = new gsn(this.m);
      this.ai.a(this.aq);
      this.at = new gox(this.X);
      this.ai.a(this.at);
      this.ar = new gsi(this);
      this.as = new fip(this.O);
      this.h = this.as.a();
      this.i = this.as.b();
      this.ai.a(this.as);
      this.g();
      this.ai.a(new gop());
      this.ai.a(new goo());
      this.R.a("Startup");
      RenderSystem.setupDefaultState(0, 0, this.R.k(), this.R.l());
      this.R.a("Post startup");
      this.an = ffe.a();
      this.ao = ffi.a(this.an);
      this.aB = new gqc(this.O, this.an, this.m.C().c());
      this.ai.a(this.aB);
      this.aK = new fvs();
      this.ai.a(this.aK);
      this.aL = new gej(this.h, this.aK, this::ao, this::ar, this::ap);
      this.ai.a(this.aL);
      gbx $$8 = new gbx(this.aL, this.aK);
      this.ai.a($$8);
      this.V = new gir(this, this.O, this.aB, this.ao, $$8);
      this.ai.a(this.V);

      try {
         int $$9 = Runtime.getRuntime().availableProcessors();
         eyw.a();
         this.T = new gcq($$9);
      } catch (OutOfMemoryError var12) {
         TinyFileDialogs.tinyfd_messageBox(
            "Minecraft",
            "Oh no! The game was unable to allocate memory off-heap while trying to start. You may try to free some memory by closing other applications on your computer, check that your system meets the minimum requirements, and try again. If the problem persists, please visit: https://aka.ms/Minecraft-Support",
            "ok",
            "error",
            true
         );
         throw new frn("Unable to allocate render buffers", var12);
      }

      this.aJ = new fqg(this, this.ay);
      this.aC = new gde(this.aB.b(), $$8, this.an);
      this.ai.a(this.aC);
      this.U = new ghr(this, this.O, this.V, this.aC, this.h, this.m, this.aK);
      this.ai.a(this.U);
      this.g = new gaa(this.r, this.O);
      this.ai.a(this.g);
      this.aD = new gou(this.O);
      this.ai.a(this.aD);
      this.aE = new got(this.O);
      this.ai.a(this.aE);
      this.aF = new gos(this.O);
      this.ai.a(this.aF);
      this.aG = new ffo(this.O);
      this.ai.a(this.aG);
      this.j = new gcd(this, this.U.d(), this.ai, this.T);
      this.ai.a(this.j.e());
      this.f = new gci(this, this.U, this.aL, this.T);
      this.ai.a(this.f);
      this.bh();
      this.ai.a(this.W);
      this.au = new gce();
      this.ai.a(this.au);
      this.ai.a(this.av);
      this.l = new ffm(this);
      this.k = new gfw(this);
      ezk $$11 = ezk.a(this);
      this.aO = new fba($$11);
      RenderSystem.setErrorCallback(this::a);
      if (this.ap.c != this.R.k() || this.ap.d != this.R.l()) {
         StringBuilder $$12 = new StringBuilder(
            "Recovering from unsupported resolution ("
               + this.R.k()
               + "x"
               + this.R.l()
               + ").\nPlease make sure you have up-to-date drivers (see aka.ms/mcdriver for instructions)."
         );
         if (exm.b()) {
            $$12.append("\n\nReported GL debug messages:\n").append(String.join("\n", exm.a()));
         }

         this.R.a(this.ap.c, this.ap.d);
         TinyFileDialogs.tinyfd_messageBox("Minecraft", $$12.toString(), "ok", "error", false);
      } else if (this.m.aa().c() && !this.R.j()) {
         this.R.h();
         this.m.aa().a(this.R.j());
      }

      this.R.a(this.m.N().c());
      this.R.b(this.m.G().c());
      this.R.c();
      this.a();
      this.j.a(this.aj.d());
      this.aM = new gsr(this, this.ay, this.X);
      this.aN = fxd.a(this.ay, this.X, $$2);
      this.bt = new fdt(this);
      this.bt.a(this.m.as().c() != fed.a);
      this.bu = new fxk(this);
      this.bu.a(this.m.A().c());
      this.bv = fxz.a(fxw.a(), this.ay);
      fll.a(this);
      this.a(new flf(wx.c("gui.loadingMinecraft")));
      List<asj> $$13 = this.al.g();
      this.bp.a(fek.b.a, $$13);
      att $$14 = this.ai.a(ac.g(), this, I, $$13);
      gtc.a.a(gsy.C);
      feb.b $$15 = new feb.b($$11, $$0.e);
      this.a(new fll(this, $$14, $$1x -> ac.a($$1x, $$1xx -> this.a($$1xx, $$15), () -> {
            if (aa.aX) {
               this.bj();
            }

            this.bp.a();
            this.a($$15);
         }), false));
      this.aP = gbu.a($$0.e.b());
   }

   private void a(@Nullable feb.b $$0) {
      if (!this.by) {
         this.by = true;
         this.b($$0);
      }
   }

   private void b(@Nullable feb.b $$0) {
      Runnable $$1 = this.c($$0);
      gtc.a.b(gsy.C);
      gtc.a.b(gsy.z);
      gtc.a.a(this.aM.a());
      $$1.run();
   }

   public boolean c() {
      return this.by;
   }

   private Runnable c(@Nullable feb.b $$0) {
      List<Function<Runnable, flz>> $$1 = new ArrayList<>();
      this.a($$1);
      Runnable $$2 = () -> {
         if ($$0 != null && $$0.b().a()) {
            gbt.a(this, $$0.b(), $$0.a());
         } else {
            this.a(new fme(true));
         }
      };

      for (Function<Runnable, flz> $$3 : Lists.reverse($$1)) {
         flz $$4 = $$3.apply($$2);
         $$2 = () -> this.a($$4);
      }

      return $$2;
   }

   private void a(List<Function<Runnable, flz>> $$0) {
      if (this.m.ad) {
         $$0.add($$0x -> new fkj(this.m, $$0x));
      }

      BanDetails $$1 = this.H();
      if ($$1 != null) {
         $$0.add($$1x -> fkn.a($$1xx -> {
               if ($$1xx) {
                  ac.k().a("https://aka.ms/mcjavamoderation");
               }

               $$1x.run();
            }, $$1));
      }

      ProfileResult $$2 = this.N.join();
      if ($$2 != null) {
         GameProfile $$3 = $$2.profile();
         Set<ProfileActionType> $$4 = $$2.actions();
         if ($$4.contains(ProfileActionType.FORCED_NAME_CHANGE)) {
            $$0.add($$1x -> fkn.a($$3.getName(), $$1x));
         }

         if ($$4.contains(ProfileActionType.USING_BANNED_SKIN)) {
            $$0.add(fkn::a);
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
      this.R.b(this.bf());
   }

   private String bf() {
      StringBuilder $$0 = new StringBuilder("Minecraft");
      if (e().a()) {
         $$0.append("*");
      }

      $$0.append(" ");
      $$0.append(aa.b().c());
      fws $$1 = this.L();
      if ($$1 != null && $$1.l().i()) {
         $$0.append(" - ");
         fxf $$2 = this.S();
         if (this.aQ != null && !this.aQ.r()) {
            $$0.append(gpb.a("title.singleplayer"));
         } else if ($$2 != null && $$2.e()) {
            $$0.append(gpb.a("title.multiplayer.realms"));
         } else if (this.aQ == null && ($$2 == null || !$$2.d())) {
            $$0.append(gpb.a("title.multiplayer.other"));
         } else {
            $$0.append(gpb.a("title.multiplayer.lan"));
         }
      }

      return $$0.toString();
   }

   private UserApiService a(YggdrasilAuthenticationService $$0, frm $$1) {
      return $$1.a.a.g() != fep.a.c ? UserApiService.OFFLINE : $$0.createUserApiService($$1.a.a.d());
   }

   public static aye e() {
      return aye.a("vanilla", ClientBrandRetriever::getClientModName, "Client", feb.class);
   }

   private void a(Throwable $$0, @Nullable feb.b $$1) {
      if (this.al.d().size() > 1) {
         this.a($$0, null, $$1);
      } else {
         ac.a($$0);
      }
   }

   public void a(Throwable $$0, @Nullable wx $$1, @Nullable feb.b $$2) {
      F.info("Caught error loading resourcepacks, removing all selected resourcepacks", $$0);
      this.bp.a($$0);
      this.ak.b();
      this.al.a(Collections.emptyList());
      this.m.i.clear();
      this.m.j.clear();
      this.m.av();
      this.a(true, $$2).thenRun(() -> this.a($$1));
   }

   private void bg() {
      this.a(null);
      if (this.r != null) {
         this.r.X();
         this.y();
      }

      this.a(new fme());
      this.a(null);
   }

   private void a(@Nullable wx $$0) {
      fik $$1 = this.ax();
      fii.b($$1, fii.a.c, wx.c("resourcePack.load_fail"), $$0);
   }

   public void f() {
      this.bb = Thread.currentThread();
      if (Runtime.getRuntime().availableProcessors() > 4) {
         this.bb.setPriority(10);
      }

      try {
         boolean $$0 = false;

         while (this.bc) {
            this.bi();

            try {
               bmn $$1 = bmn.a("Renderer");
               boolean $$2 = this.aP().e();
               this.bk = this.a($$2, $$1);
               this.bk.a();
               this.bo.c();
               this.c(!$$0);
               this.bo.d();
               this.bk.b();
               this.b($$2, $$1);
            } catch (OutOfMemoryError var4) {
               if ($$0) {
                  throw var4;
               }

               this.bl();
               this.a(new fls());
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
      this.as.a(this.m);
   }

   private void bh() {
      this.W
         .a(
            grv.a,
            $$0 -> new gro<>(
                  $$0x -> $$0x.a(ctl.b.a, null, cvj.a.a.c()).stream().map($$0xx -> n.a($$0xx.getString()).trim()).filter($$0xx -> !$$0xx.isEmpty()),
                  $$0x -> Stream.of(le.h.b($$0x.g())),
                  $$0
               )
         );
      this.W.a(grv.b, $$0 -> new grp<>($$0x -> $$0x.i().map(awm::b), $$0));
      this.W
         .a(
            grv.c,
            $$0 -> new gro<>(
                  $$0x -> {
                     ctl.b $$1 = ctl.b.a($$0x.a());
                     return $$0x.e()
                        .stream()
                        .flatMap($$2 -> $$2.b().a($$0x.a()).a($$1, null, cvj.a.a).stream())
                        .map($$0xx -> n.a($$0xx.getString()).trim())
                        .filter($$0xx -> !$$0xx.isEmpty());
                  },
                  $$0x -> $$0x.e().stream().map($$1 -> le.h.b($$1.b().a($$0x.a()).g())),
                  $$0
               )
         );
      csc.e().a($$0 -> {
         this.a(grv.a, $$0);
         this.a(grv.b, $$0);
      });
   }

   private void a(int $$0, long $$1) {
      this.m.N().a(false);
      this.m.av();
   }

   public exg h() {
      return this.ap;
   }

   public String i() {
      return this.ab;
   }

   public String j() {
      return this.ac;
   }

   public void a(o $$0) {
      this.bd = () -> this.d($$0);
   }

   public void b(o $$0) {
      this.bd = () -> $$0;
   }

   private void bi() {
      if (this.bd != null) {
         a(this, this.p, this.bd.get());
      }
   }

   public void c(o $$0) {
      o $$1 = this.d($$0);
      this.bl();
      a(this, this.p, $$1);
   }

   public static void a(@Nullable feb $$0, File $$1, o $$2) {
      File $$3 = new File($$1, "crash-reports");
      File $$4 = new File($$3, "crash-" + ac.f() + "-client.txt");
      akp.a($$2.e());
      if ($$0 != null) {
         $$0.aq.h();
      }

      if ($$2.f() != null) {
         akp.a("#@!@# Game crashed! Crash report saved to: #@!@# " + $$2.f());
         System.exit(-1);
      } else if ($$2.a($$4)) {
         akp.a("#@!@# Game crashed! Crash report saved to: #@!@# " + $$4.getAbsolutePath());
         System.exit(-1);
      } else {
         akp.a("#@?@# Game crashed! Crash report could not be saved. #@?@#");
         System.exit(-2);
      }
   }

   public boolean k() {
      return this.m.P().c();
   }

   public CompletableFuture<Void> l() {
      return this.a(false, null);
   }

   private CompletableFuture<Void> a(boolean $$0, @Nullable feb.b $$1) {
      if (this.bi != null) {
         return this.bi;
      } else {
         CompletableFuture<Void> $$2 = new CompletableFuture<>();
         if (!$$0 && this.aZ instanceof fll) {
            this.bi = $$2;
            return $$2;
         } else {
            this.al.a();
            List<asj> $$3 = this.al.g();
            if (!$$0) {
               this.bp.a(fek.b.b, $$3);
            }

            this.a(new fll(this, this.ai.a(ac.g(), this, I, $$3), $$3x -> ac.a($$3x, $$2xx -> {
                  if ($$0) {
                     this.ak.c();
                     this.bg();
                  } else {
                     this.a($$2xx, $$1);
                  }
               }, () -> {
                  this.f.f();
                  this.bp.a();
                  this.ak.d();
                  $$2.complete(null);
                  this.a($$1);
               }), !$$0));
            return $$2;
         }
      }
   }

   private void bj() {
      boolean $$0 = false;
      gdd $$1 = this.ao().a();
      gpw $$2 = $$1.a().a();

      for (dea $$3 : le.e) {
         UnmodifiableIterator $$10 = $$3.l().a().iterator();

         while ($$10.hasNext()) {
            drd $$4 = (drd)$$10.next();
            if ($$4.l() == dkg.c) {
               gpw $$5 = $$1.b($$4);
               if ($$5 == $$2) {
                  F.debug("Missing model for: {}", $$4);
                  $$0 = true;
               }
            }
         }
      }

      gnv $$6 = $$2.e();

      for (dea $$7 : le.e) {
         UnmodifiableIterator var17 = $$7.l().a().iterator();

         while (var17.hasNext()) {
            drd $$8 = (drd)var17.next();
            gnv $$9 = $$1.a($$8);
            if (!$$8.i() && $$9 == $$6) {
               F.debug("Missing particle icon for: {}", $$8);
            }
         }
      }

      for (ctl $$10 : le.h) {
         ctq $$11 = $$10.w();
         String $$12 = $$11.t();
         String $$13 = wx.c($$12).getString();
         if ($$13.toLowerCase(Locale.ROOT).equals($$10.a())) {
            F.debug("Missing translation for: {} {} {}", new Object[]{$$11, $$12, $$10});
         }
      }

      $$0 |= flm.a();
      $$0 |= ghu.a();
      if ($$0) {
         throw new IllegalStateException("Your game data is foobar, fix the errors above!");
      }
   }

   public eox m() {
      return this.ae;
   }

   private void a(String $$0) {
      feb.a $$1 = this.J();
      if (!$$1.a(this.T())) {
         if (this.l.b()) {
            this.l.b(false);
            this.a(new fkq($$0x -> {
               if ($$0x) {
                  ac.k().a("https://aka.ms/JavaAccountSettings");
               }

               this.a(null);
            }, feb.a.e, "https://aka.ms/JavaAccountSettings", true));
         } else {
            wx $$2 = $$1.a();
            this.l.a($$2, false);
            this.bt.c($$2);
            this.l.b($$1 == feb.a.d);
         }
      } else {
         this.a(new fkp($$0));
      }
   }

   public void a(@Nullable flz $$0) {
      if (aa.aX && Thread.currentThread() != this.bb) {
         F.error("setScreen called from non-game thread");
      }

      if (this.y != null) {
         this.y.j();
      } else {
         this.a(fdy.a);
      }

      if ($$0 == null && this.ba) {
         throw new IllegalStateException("Trying to return to in-game GUI during disconnection");
      } else {
         if ($$0 == null && this.r == null) {
            $$0 = new fme();
         } else if ($$0 == null && this.s.eB()) {
            if (this.s.o()) {
               $$0 = new fkx(null, this.r.k().l());
            } else {
               this.s.ga();
            }
         }

         this.y = $$0;
         if (this.y != null) {
            this.y.aG_();
         }

         eyq.a();
         if ($$0 != null) {
            this.n.j();
            fdz.b();
            $$0.b(this, this.R.o(), this.R.p());
            this.x = false;
         } else {
            this.aq.i();
            this.n.i();
         }

         this.d();
      }
   }

   public void a(@Nullable flt $$0) {
      this.aZ = $$0;
   }

   public void n() {
      try {
         F.info("Stopping!");

         try {
            this.bt.c();
         } catch (Throwable var7) {
         }

         try {
            if (this.r != null) {
               this.r.X();
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
         if (this.bd == null) {
            System.exit(0);
         }
      }
   }

   @Override
   public void close() {
      if (this.bs != null) {
         this.bs.a();
      }

      try {
         this.aM.close();
         this.av.close();
         this.aB.close();
         this.as.close();
         this.j.close();
         this.f.close();
         this.aq.g();
         this.g.a();
         this.aE.close();
         this.aD.close();
         this.aF.close();
         this.aG.close();
         this.O.close();
         this.ai.close();
         fjb.b();
         ac.j();
      } catch (Throwable var5) {
         F.error("Shutdown failure!", var5);
         throw var5;
      } finally {
         this.Q.close();
         this.R.close();
      }
   }

   private void c(boolean $$0) {
      this.R.a("Pre render");
      long $$1 = ac.d();
      if (this.R.b()) {
         this.q();
      }

      if (this.bi != null && !(this.aZ instanceof fll)) {
         CompletableFuture<Void> $$2 = this.bi;
         this.bi = null;
         this.l().thenRun(() -> $$2.complete(null));
      }

      Runnable $$3;
      while (($$3 = this.bh.poll()) != null) {
         $$3.run();
      }

      if ($$0) {
         int $$4 = this.S.a(ac.c());
         this.bk.a("scheduledExecutables");
         this.bz();
         this.bk.c();
         this.bk.a("tick");

         for (int $$5 = 0; $$5 < Math.min(10, $$4); $$5++) {
            this.bk.d("clientTick");
            this.t();
         }

         this.bk.c();
      }

      this.R.a("Render");
      this.bk.a("sound");
      this.aq.a(this.j.m());
      this.bk.c();
      this.bk.a("render");
      long $$6 = ac.d();
      boolean $$8;
      if (!this.aP().d() && !this.bo.e()) {
         $$8 = false;
         this.br = 0.0;
      } else {
         $$8 = this.bs == null || this.bs.b();
         if ($$8) {
            eyn.a().ifPresent(eyn::b);
         }
      }

      RenderSystem.clear(16640, a);
      this.ap.a(true);
      gcc.a();
      this.bk.a("display");
      RenderSystem.enableCull();
      this.bk.b("mouse");
      this.n.a();
      this.bk.c();
      if (!this.x) {
         this.bk.b("gameRenderer");
         this.j.a(this.aU ? this.aV : this.S.a, $$1, $$0);
         this.bk.c();
      }

      if (this.bn != null) {
         this.bk.a("fpsPie");
         ffn $$9 = new ffn(this, this.T.c());
         this.a($$9, this.bn);
         $$9.e();
         this.bk.c();
      }

      this.bk.a("blit");
      this.ap.e();
      this.ap.a(this.R.k(), this.R.l());
      this.bf = ac.d() - $$6;
      if ($$8) {
         eyn.a().ifPresent($$0x -> this.bs = $$0x.c());
      }

      this.bk.b("updateDisplay");
      this.R.e();
      int $$10 = this.bk();
      if ($$10 < 260) {
         RenderSystem.limitDisplayFPS($$10);
      }

      this.bk.b("yield");
      Thread.yield();
      this.bk.c();
      this.R.a("Post render");
      this.aY++;
      boolean $$11 = this.U() && (this.y != null && this.y.k() || this.aZ != null && this.aZ.a()) && !this.aQ.r();
      if (this.aU != $$11) {
         if ($$11) {
            this.aV = this.S.a;
         } else {
            this.S.a = this.aV;
         }

         this.aU = $$11;
      }

      long $$12 = ac.d();
      long $$13 = $$12 - this.aW;
      if ($$8) {
         this.bq = $$13;
      }

      this.aP().a($$13);
      this.aW = $$12;
      this.bk.a("fpsUpdate");
      if (this.bs != null && this.bs.b()) {
         this.br = (double)this.bs.c() * 100.0 / (double)this.bq;
      }

      while (ac.c() >= this.aX + 1000L) {
         String $$14;
         if (this.br > 0.0) {
            $$14 = " GPU: " + (this.br > 100.0 ? n.m + "100%" : Math.round(this.br) + "%");
         } else {
            $$14 = "";
         }

         be = this.aY;
         this.z = String.format(
            Locale.ROOT,
            "%d fps T: %s%s%s%s B: %d%s",
            be,
            $$10 == 260 ? "inf" : $$10,
            this.m.N().c() ? " vsync " : " ",
            this.m.j().c(),
            this.m.i().c() == fdp.a ? "" : (this.m.i().c() == fdp.b ? " fast-clouds" : " fancy-clouds"),
            this.m.E().c(),
            $$14
         );
         this.aX += 1000L;
         this.aY = 0;
      }

      this.bk.c();
   }

   private bmk a(boolean $$0, @Nullable bmn $$1) {
      if (!$$0) {
         this.bm.b();
         if (!this.bo.e() && $$1 == null) {
            return bmh.a;
         }
      }

      bmk $$2;
      if ($$0) {
         if (!this.bm.a()) {
            this.bl = 0;
            this.bm.c();
         }

         this.bl++;
         $$2 = this.bm.d();
      } else {
         $$2 = bmh.a;
      }

      if (this.bo.e()) {
         $$2 = bmk.a($$2, this.bo.f());
      }

      return bmn.a($$2, $$1);
   }

   private void b(boolean $$0, @Nullable bmn $$1) {
      if ($$1 != null) {
         $$1.b();
      }

      if ($$0) {
         this.bn = this.bm.e();
      } else {
         this.bn = null;
      }

      this.bk = this.bm.d();
   }

   @Override
   public void a() {
      int $$0 = this.R.a(this.m.aq().c(), this.k());
      this.R.a((double)$$0);
      if (this.y != null) {
         this.y.a(this, this.R.o(), this.R.p());
      }

      exg $$1 = this.h();
      $$1.a(this.R.k(), this.R.l(), a);
      this.j.a(this.R.k(), this.R.l());
      this.n.g();
   }

   @Override
   public void b() {
      this.n.k();
   }

   public int o() {
      return be;
   }

   public long p() {
      return this.bf;
   }

   private int bk() {
      return this.r != null || this.y == null && this.aZ == null ? this.R.d() : 60;
   }

   private void bl() {
      try {
         ayd.b();
         this.f.p();
      } catch (Throwable var3) {
      }

      try {
         System.gc();
         if (this.aS && this.aQ != null) {
            this.aQ.a(true);
         }

         this.b((flz)(new flf(wx.c("menu.savingLevel"))));
      } catch (Throwable var2) {
      }

      System.gc();
   }

   public boolean a(Consumer<wx> $$0) {
      if (this.bo.e()) {
         this.bm();
         return false;
      } else {
         Consumer<bmj> $$1 = $$1x -> {
            if ($$1x != bmf.a) {
               int $$2x = $$1x.f();
               double $$3x = (double)$$1x.g() / (double)aze.a;
               this.execute(
                  () -> $$0.accept(
                        wx.a("commands.debug.stopped", String.format(Locale.ROOT, "%.2f", $$3x), $$2x, String.format(Locale.ROOT, "%.2f", (double)$$2x / $$3x))
                     )
               );
            }
         };
         Consumer<Path> $$2 = $$1x -> {
            wx $$2x = wx.b($$1x.toString()).a(n.t).a($$1xx -> $$1xx.a(new wv(wv.a.b, $$1x.toFile().getParent())));
            this.execute(() -> $$0.accept(wx.a("debug.profiling.stop", $$2x)));
         };
         ab $$3 = a(new ab(), this, this.am, this.ab, this.m);
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
            CompletableFuture.allOf($$6, $$7).thenRunAsync(() -> $$4.accept(ImmutableList.of($$6.join(), $$7.join())), ac.h());
            this.aQ.a($$0x -> {
            }, $$7::complete);
            $$5 = $$6::complete;
         }

         this.bo = bnw.a(new gbr(ac.c, this.f), ac.c, ac.h(), new boc("client"), $$1x -> {
            this.bo = bnx.a;
            $$1.accept($$1x);
         }, $$5);
         return true;
      }
   }

   private void bm() {
      this.bo.a();
      if (this.aQ != null) {
         this.aQ.aX();
      }
   }

   private void bn() {
      this.bo.b();
      if (this.aQ != null) {
         this.aQ.aY();
      }
   }

   private Path a(ab $$0, List<Path> $$1) {
      String $$2;
      if (this.T()) {
         $$2 = this.V().bb().e();
      } else {
         fxf $$3 = this.S();
         $$2 = $$3 != null ? $$3.a : "unknown";
      }

      Path $$7;
      try {
         String $$5 = String.format(Locale.ROOT, "%s-%s-%s", ac.f(), $$2, aa.b().b());
         String $$6 = v.a(boc.a, $$5, ".zip");
         $$7 = boc.a.resolve($$6);
      } catch (IOException var21) {
         throw new UncheckedIOException(var21);
      }

      try (axq $$10 = new axq($$7)) {
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
      if (this.bn != null) {
         List<bmm> $$1 = this.bn.a(this.bB);
         if (!$$1.isEmpty()) {
            bmm $$2 = $$1.remove(0);
            if ($$0 == 0) {
               if (!$$2.d.isEmpty()) {
                  int $$3 = this.bB.lastIndexOf(30);
                  if ($$3 >= 0) {
                     this.bB = this.bB.substring(0, $$3);
                  }
               }
            } else {
               $$0--;
               if ($$0 < $$1.size() && !"unspecified".equals($$1.get($$0).d)) {
                  if (!this.bB.isEmpty()) {
                     this.bB = this.bB + "\u001e";
                  }

                  this.bB = this.bB + $$1.get($$0).d;
               }
            }
         }
      }
   }

   private void a(ffn $$0, bmj $$1) {
      List<bmm> $$2 = $$1.a(this.bB);
      bmm $$3 = $$2.remove(0);
      RenderSystem.clear(256, a);
      RenderSystem.setShader(gcd::q);
      Matrix4f $$4 = new Matrix4f().setOrtho(0.0F, (float)this.R.k(), (float)this.R.l(), 0.0F, 1000.0F, 3000.0F);
      RenderSystem.setProjectionMatrix($$4, ezc.b);
      Matrix4fStack $$5 = RenderSystem.getModelViewStack();
      $$5.pushMatrix();
      $$5.translation(0.0F, 0.0F, -2000.0F);
      RenderSystem.applyModelViewMatrix();
      RenderSystem.lineWidth(1.0F);
      eyw $$6 = eyw.b();
      eyp $$7 = $$6.d();
      int $$8 = 160;
      int $$9 = this.R.k() - 160 - 10;
      int $$10 = this.R.l() - 320;
      RenderSystem.enableBlend();
      $$7.a(eyz.b.h, eys.n);
      $$7.a((double)((float)$$9 - 176.0F), (double)((float)$$10 - 96.0F - 16.0F), 0.0).a(200, 0, 0, 0).e();
      $$7.a((double)((float)$$9 - 176.0F), (double)($$10 + 320), 0.0).a(200, 0, 0, 0).e();
      $$7.a((double)((float)$$9 + 176.0F), (double)($$10 + 320), 0.0).a(200, 0, 0, 0).e();
      $$7.a((double)((float)$$9 + 176.0F), (double)((float)$$10 - 96.0F - 16.0F), 0.0).a(200, 0, 0, 0).e();
      $$6.c();
      RenderSystem.disableBlend();
      double $$11 = 0.0;

      for (bmm $$12 : $$2) {
         int $$13 = ayf.a($$12.a / 4.0) + 1;
         $$7.a(eyz.b.g, eys.n);
         int $$14 = $$12.a();
         int $$15 = $$14 >> 16 & 0xFF;
         int $$16 = $$14 >> 8 & 0xFF;
         int $$17 = $$14 & 0xFF;
         $$7.a((double)$$9, (double)$$10, 0.0).a($$15, $$16, $$17, 255).e();

         for (int $$18 = $$13; $$18 >= 0; $$18--) {
            float $$19 = (float)(($$11 + $$12.a * (double)$$18 / (double)$$13) * (float) (Math.PI * 2) / 100.0);
            float $$20 = ayf.a($$19) * 160.0F;
            float $$21 = ayf.b($$19) * 160.0F * 0.5F;
            $$7.a((double)((float)$$9 + $$20), (double)((float)$$10 - $$21), 0.0).a($$15, $$16, $$17, 255).e();
         }

         $$6.c();
         $$7.a(eyz.b.f, eys.n);

         for (int $$22 = $$13; $$22 >= 0; $$22--) {
            float $$23 = (float)(($$11 + $$12.a * (double)$$22 / (double)$$13) * (float) (Math.PI * 2) / 100.0);
            float $$24 = ayf.a($$23) * 160.0F;
            float $$25 = ayf.b($$23) * 160.0F * 0.5F;
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
      String $$27 = bmj.b($$3.d);
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
         bmm $$31 = $$2.get($$30);
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
      this.bc = false;
   }

   public boolean r() {
      return this.bc;
   }

   public void b(boolean $$0) {
      if (this.y == null) {
         boolean $$1 = this.U() && !this.aQ.r();
         if ($$1) {
            this.a(new flu(!$$0));
            this.aq.e();
         } else {
            this.a(new flu(true));
         }
      }
   }

   private void d(boolean $$0) {
      if (!$$0) {
         this.w = 0;
      }

      if (this.w <= 0 && !this.s.fv()) {
         if ($$0 && this.v != null && this.v.c() == euk.a.b) {
            eui $$1 = (eui)this.v;
            io $$2 = $$1.a();
            if (!this.r.a_($$2).i()) {
               it $$3 = $$1.b();
               if (this.q.b($$2, $$3)) {
                  this.g.a($$2, $$3);
                  this.s.a(bpv.a);
               }
            }
         } else {
            this.q.b();
         }
      }
   }

   private boolean bo() {
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
         ctq $$0 = this.s.b(bpv.a);
         if (!$$0.a(this.r.J())) {
            return false;
         } else {
            boolean $$1 = false;
            switch (this.v.c()) {
               case c:
                  this.q.a(this.s, ((euj)this.v).a());
                  break;
               case b:
                  eui $$2 = (eui)this.v;
                  io $$3 = $$2.a();
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

                  this.s.gw();
            }

            this.s.a(bpv.a);
            return $$1;
         }
      }
   }

   private void bp() {
      if (!this.q.k()) {
         this.aT = 4;
         if (!this.s.B()) {
            if (this.v == null) {
               F.warn("Null returned as 'hitResult', this shouldn't happen!");
            }

            for (bpv $$0 : bpv.values()) {
               ctq $$1 = this.s.b($$0);
               if (!$$1.a(this.r.J())) {
                  return;
               }

               if (this.v != null) {
                  switch (this.v.c()) {
                     case c:
                        euj $$2 = (euj)this.v;
                        brw $$3 = $$2.a();
                        if (!this.r.C_().a($$3.dp())) {
                           return;
                        }

                        bpw $$4 = this.q.a(this.s, $$3, $$2, $$0);
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
                        eui $$5 = (eui)this.v;
                        int $$6 = $$1.I();
                        bpw $$7 = this.q.a(this.s, $$0, $$5);
                        if ($$7.a()) {
                           if ($$7.b()) {
                              this.s.a($$0);
                              if (!$$1.e() && ($$1.I() != $$6 || this.q.f())) {
                                 this.j.b.a($$0);
                              }
                           }

                           return;
                        }

                        if ($$7 == bpw.e) {
                           return;
                        }
                  }
               }

               if (!$$1.e()) {
                  bpw $$8 = this.q.a(this.s, $$0);
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

   public gsi s() {
      return this.ar;
   }

   public void t() {
      this.bA++;
      if (this.r != null && !this.aU) {
         this.r.s().m();
      }

      if (this.aT > 0) {
         this.aT--;
      }

      this.bk.a("gui");
      this.bu.a();
      this.l.a(this.aU);
      this.bk.c();
      this.j.b(1.0F);
      this.aI.a(this.r, this.v);
      this.bk.a("gameMode");
      if (!this.aU && this.r != null) {
         this.q.c();
      }

      this.bk.b("textures");
      boolean $$0 = this.r == null || this.r.s().i();
      if ($$0) {
         this.O.e();
      }

      if (this.y != null || this.s == null) {
         if (this.y instanceof flh $$1 && !this.s.fL()) {
            $$1.m();
         }
      } else if (this.s.eB() && !(this.y instanceof fkx)) {
         this.a(null);
      } else if (this.s.fL() && this.r != null) {
         this.a(new flh());
      }

      if (this.y != null) {
         this.w = 10000;
      }

      if (this.y != null) {
         flz.a(() -> this.y.e(), "Ticking screen", this.y.getClass().getCanonicalName());
      }

      if (!this.aP().d()) {
         this.l.l();
      }

      if (this.aZ == null && this.y == null) {
         this.bk.b("Keybindings");
         this.br();
         if (this.w > 0) {
            this.w--;
         }
      }

      if (this.r != null) {
         this.bk.b("gameRenderer");
         if (!this.aU) {
            this.j.f();
         }

         this.bk.b("levelRenderer");
         if (!this.aU) {
            this.f.o();
         }

         this.bk.b("level");
         if (!this.aU) {
            this.r.f();
         }
      } else if (this.j.g() != null) {
         this.j.b();
      }

      if (!this.aU) {
         this.ar.a();
      }

      this.aq.a(this.aU);
      if (this.r != null) {
         if (!this.aU) {
            if (!this.m.s && this.bq()) {
               wx $$2 = wx.c("tutorial.socialInteractions.title");
               wx $$3 = wx.a("tutorial.socialInteractions.description", gtq.a("socialInteractions"));
               this.bj = new fil(fil.a.f, $$2, $$3, true);
               this.aI.a(this.bj, 160);
               this.m.s = true;
               this.m.av();
            }

            this.aI.d();

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

         this.bk.b("animateTick");
         if (!this.aU && $$0) {
            this.r.b(this.s.dt(), this.s.dv(), this.s.dz());
         }

         this.bk.b("particles");
         if (!this.aU && $$0) {
            this.g.b();
         }
      } else if (this.aR != null) {
         this.bk.b("pendingConnection");
         this.aR.b();
      }

      this.bk.b("keyboard");
      this.o.b();
      this.bk.c();
   }

   private boolean bq() {
      return !this.aS || this.aQ != null && this.aQ.r();
   }

   private void br() {
      while (this.m.O.g()) {
         fdn $$0 = this.m.aA();
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
               this.s.gc().k = $$1;
            } else {
               fnm.a(this, $$1, $$3, $$2);
            }
         }
      }

      while (this.m.M.g()) {
         if (!this.bq()) {
            this.s.a(K, true);
            this.bt.c(K);
         } else {
            if (this.bj != null) {
               this.aI.a(this.bj);
               this.bj = null;
            }

            this.a(new fqi());
         }
      }

      while (this.m.D.g()) {
         if (this.q.g()) {
            this.s.i();
         } else {
            this.aI.a();
            this.a(new fnx(this.s));
         }
      }

      while (this.m.S.g()) {
         this.a(new fmo(this.s.cz.q()));
      }

      while (this.m.E.g()) {
         if (!this.s.N_()) {
            this.L().b(new ahi(ahi.a.g, io.c, it.a));
         }
      }

      while (this.m.F.g()) {
         if (!this.s.N_() && this.s.a(flz.r())) {
            this.s.a(bpv.a);
         }
      }

      while (this.m.J.g()) {
         this.a("");
      }

      if (this.y == null && this.aZ == null && this.m.L.g()) {
         this.a("/");
      }

      boolean $$4 = false;
      if (this.s.fv()) {
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
            $$4 |= this.bo();
         }

         while (this.m.G.g()) {
            this.bp();
         }

         while (this.m.I.g()) {
            this.bt();
         }
      }

      if (this.m.G.e() && this.aT == 0 && !this.s.fv()) {
         this.bp();
      }

      this.d(this.y == null && !$$4 && this.m.H.e() && this.n.h());
   }

   public gsr u() {
      return this.aM;
   }

   public double v() {
      return this.br;
   }

   public fxd w() {
      return this.aN;
   }

   public fqy x() {
      return new fqy(this, this.ae);
   }

   public void a(eox.c $$0, ati $$1, alk $$2, boolean $$3) {
      this.y();
      this.Y.set(null);
      Instant $$4 = Instant.now();

      try {
         $$0.a($$2.c().a(), $$2.d());
         alh $$5 = alh.a(this.aw, this.p);
         $$5.f().a(this);
         dpu.a($$5, this);
         aug.a(false);
         this.aQ = MinecraftServer.a((Function<Thread, gsa>)($$4x -> new gsa($$4x, this, $$0, $$1, $$2, $$5, $$0xx -> {
               ara $$1xx = ara.b($$0xx + 0);
               this.Y.set($$1xx);
               return aqz.a($$1xx, this.bh::add);
            })));
         this.aS = true;
         this.a(fxw.a());
         this.aP.a(gbu.c.a, $$0.f(), $$2.d().e());
      } catch (Throwable var11) {
         o $$7 = o.a(var11, "Starting integrated server");
         p $$8 = $$7.a("Starting integrated server");
         $$8.a("Level ID", $$0.f());
         $$8.a("Level Name", () -> $$2.d().e());
         throw new y($$7);
      }

      while (this.Y.get() == null) {
         Thread.yield();
      }

      flj $$9 = new flj(this.Y.get());
      this.a($$9);
      this.bk.a("waitForServer");

      for (; !this.aQ.aj() || this.aZ != null; this.bi()) {
         $$9.e();
         this.c(false);

         try {
            Thread.sleep(16L);
         } catch (InterruptedException var10) {
         }
      }

      this.bk.c();
      Duration $$10 = Duration.between($$4, Instant.now());
      SocketAddress $$11 = this.aQ.ai().a();
      vv $$12 = vv.a($$11);
      $$12.a($$11.toString(), 0, new fwq($$12, this, null, null, $$3, $$10, $$0x -> {
      }, null));
      $$12.a(new aiu(this.X().c(), this.X().b()));
      this.aR = $$12;
   }

   public void a(fwr $$0) {
      flw $$1 = new flw(true);
      $$1.a(wx.c("connect.joining"));
      this.e($$1);
      this.r = $$0;
      this.b($$0);
      if (!this.aS) {
         alh $$2 = alh.a(this.aw, this.p);
         $$2.f().a(this);
         dpu.a($$2, this);
         aug.a(false);
      }
   }

   public void y() {
      this.a(new flw(true), false);
   }

   public void b(flz $$0) {
      this.a($$0, false);
   }

   public void a(flz $$0, boolean $$1) {
      fws $$2 = this.L();
      if ($$2 != null) {
         this.by();
         $$2.i();
         if (!$$1) {
            this.B();
         }
      }

      this.aJ.b();
      if (this.bo.e()) {
         this.bn();
      }

      gsa $$3 = this.aQ;
      this.aQ = null;
      this.j.i();
      this.q = null;
      this.bt.b();
      this.ba = true;

      try {
         this.e($$0);
         if (this.r != null) {
            if ($$3 != null) {
               this.bk.a("waitForServer");

               while (!$$3.H()) {
                  this.c(false);
               }

               this.bk.c();
            }

            this.l.i();
            this.aS = false;
         }

         this.r = null;
         this.b(null);
         this.s = null;
      } finally {
         this.ba = false;
      }

      dpu.b();
   }

   public void B() {
      this.ak.i();
      this.bz();
   }

   public void c(flz $$0) {
      fws $$1 = this.L();
      if ($$1 != null) {
         $$1.j();
      }

      if (this.bo.e()) {
         this.bn();
      }

      this.j.i();
      this.q = null;
      this.bt.b();
      this.ba = true;

      try {
         this.e($$0);
         this.l.i();
         this.r = null;
         this.b(null);
         this.s = null;
      } finally {
         this.ba = false;
      }

      dpu.b();
   }

   private void e(flz $$0) {
      this.bk.a("forcedTick");
      this.aq.f();
      this.t = null;
      this.aR = null;
      this.a($$0);
      this.c(false);
      this.bk.c();
   }

   public void d(flz $$0) {
      this.bk.a("forcedTick");
      this.a($$0);
      this.c(false);
      this.bk.c();
   }

   private void b(@Nullable fwr $$0) {
      this.f.a($$0);
      this.g.a($$0);
      this.aL.a($$0);
      this.d();
   }

   private UserProperties bs() {
      return this.az.join();
   }

   public boolean C() {
      return this.D() && this.m.ai().c();
   }

   public boolean D() {
      return this.E() && this.bs().flag(UserFlag.OPTIONAL_TELEMETRY_AVAILABLE);
   }

   public boolean E() {
      return aa.aX ? false : this.bs().flag(UserFlag.TELEMETRY_ENABLED);
   }

   public boolean F() {
      return this.ag && this.bs().flag(UserFlag.SERVERS_ALLOWED) && this.H() == null && !this.I();
   }

   public boolean G() {
      return this.bs().flag(UserFlag.REALMS_ALLOWED) && this.H() == null;
   }

   @Nullable
   public BanDetails H() {
      return (BanDetails)this.bs().bannedScopes().get("MULTIPLAYER");
   }

   public boolean I() {
      ProfileResult $$0 = this.N.getNow(null);
      return $$0 != null && $$0.actions().contains(ProfileActionType.FORCED_NAME_CHANGE);
   }

   public boolean a(UUID $$0) {
      return this.J().a(false) ? this.aJ.c($$0) : (this.s == null || !$$0.equals(this.s.cz())) && !$$0.equals(ac.e);
   }

   public feb.a J() {
      if (this.m.m().c() == clw.c) {
         return feb.a.b;
      } else if (!this.ah) {
         return feb.a.c;
      } else {
         return !this.bs().flag(UserFlag.CHAT_ALLOWED) ? feb.a.d : feb.a.a;
      }
   }

   public final boolean K() {
      return this.af;
   }

   @Nullable
   public fws L() {
      return this.s == null ? null : this.s.cz;
   }

   public static boolean M() {
      return !E.m.Y;
   }

   public static boolean N() {
      return E.m.j().c().a() >= fdu.b.a();
   }

   public static boolean O() {
      return !E.j.a() && E.m.j().c().a() >= fdu.c.a();
   }

   public static boolean P() {
      return E.m.k().c();
   }

   private void bt() {
      if (this.v != null && this.v.c() != euk.a.a) {
         boolean $$0 = this.s.gd().d;
         doi $$1 = null;
         euk.a $$2 = this.v.c();
         ctq $$6;
         if ($$2 == euk.a.b) {
            io $$3 = ((eui)this.v).a();
            drd $$4 = this.r.a_($$3);
            if ($$4.i()) {
               return;
            }

            dea $$5 = $$4.b();
            $$6 = $$5.a((dbc)this.r, $$3, $$4);
            if ($$6.e()) {
               return;
            }

            if ($$0 && flz.r() && $$4.t()) {
               $$1 = this.r.c_($$3);
            }
         } else {
            if ($$2 != euk.a.c || !$$0) {
               return;
            }

            brw $$7 = ((euj)this.v).a();
            $$6 = $$7.dC();
            if ($$6 == null) {
               return;
            }
         }

         if ($$6.e()) {
            String $$10 = "";
            if ($$2 == euk.a.b) {
               $$10 = le.e.b(this.r.a_(((eui)this.v).a()).b()).toString();
            } else if ($$2 == euk.a.c) {
               $$10 = le.g.b(((euj)this.v).a().ak()).toString();
            }

            F.warn("Picking on: [{}] {} gave null item", $$2, $$10);
         } else {
            clx $$11 = this.s.gc();
            if ($$1 != null) {
               this.a($$6, $$1, this.r.H_());
            }

            int $$12 = $$11.c($$6);
            if ($$0) {
               $$11.b($$6);
               this.q.a(this.s.b(bpv.a), 36 + $$11.k);
            } else if ($$12 != -1) {
               if (clx.d($$12)) {
                  $$11.k = $$12;
               } else {
                  this.q.a($$12);
               }
            }
         }
      }
   }

   private void a(ctq $$0, doi $$1, jl $$2) {
      ud $$3 = $$1.f($$2);
      $$1.a($$3);
      cro.a($$0, $$1.r(), $$3);
      $$0.a($$1.s());
      $$0.a(kb.h, cwn.a, J, cwn::a);
   }

   public o d(o $$0) {
      ab $$1 = $$0.g();
      a($$1, this, this.am, this.ab, this.m);
      this.a($$0.a("Uptime"));
      if (this.r != null) {
         this.r.a($$0);
      }

      if (this.aQ != null) {
         this.aQ.b($$1);
      }

      this.bp.a($$0);
      return $$0;
   }

   public static void a(@Nullable feb $$0, @Nullable gpd $$1, String $$2, @Nullable fef $$3, o $$4) {
      ab $$5 = $$4.g();
      a($$5, $$0, $$1, $$2, $$3);
   }

   private static String a(double $$0) {
      return String.format(Locale.ROOT, "%.3fs", $$0);
   }

   private void a(p $$0) {
      $$0.a("JVM uptime", () -> a((double)ManagementFactory.getRuntimeMXBean().getUptime() / 1000.0));
      $$0.a("Wall uptime", () -> a((double)(System.currentTimeMillis() - this.bz) / 1000.0));
      $$0.a("High-res time", () -> a((double)ac.c() / 1000.0));
      $$0.a("Client ticks", () -> String.format(Locale.ROOT, "%d ticks / %.3fs", this.bA, (double)this.bA / 20.0));
   }

   private static ab a(ab $$0, @Nullable feb $$1, @Nullable gpd $$2, String $$3, @Nullable fef $$4) {
      $$0.a("Launched Version", () -> $$3);
      String $$5 = be();
      if ($$5 != null) {
         $$0.a("Launcher name", $$5);
      }

      $$0.a("Backend library", RenderSystem::getBackendDescription);
      $$0.a("Backend API", RenderSystem::getApiDescription);
      $$0.a("Window size", () -> $$1 != null ? $$1.R.k() + "x" + $$1.R.l() : "<not initialized>");
      $$0.a("GL Caps", RenderSystem::getCapsString);
      $$0.a("GL debug messages", () -> exm.b() ? String.join("\n", exm.a()) : "<disabled>");
      $$0.a("Using VBOs", () -> "Yes");
      $$0.a("Is Modded", () -> e().b());
      $$0.a("Universe", () -> $$1 != null ? Long.toHexString($$1.L) : "404");
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
      $$0.a("CPU", exn::b);
      return $$0;
   }

   public static feb Q() {
      return E;
   }

   public CompletableFuture<Void> R() {
      return this.a(this::l).thenCompose($$0 -> (CompletionStage<Void>)$$0);
   }

   public void a(fxw $$0) {
      if (!this.bv.a($$0)) {
         this.bv = fxz.a($$0, this.ay);
      }
   }

   @Nullable
   public fxf S() {
      return x.a(this.L(), fws::x);
   }

   public boolean T() {
      return this.aS;
   }

   public boolean U() {
      return this.aS && this.aQ != null;
   }

   @Nullable
   public gsa V() {
      return this.aQ;
   }

   public boolean W() {
      gsa $$0 = this.V();
      return $$0 != null && !$$0.r();
   }

   public boolean b(UUID $$0) {
      return $$0.equals(this.X().b());
   }

   public fep X() {
      return this.X;
   }

   public GameProfile Y() {
      ProfileResult $$0 = this.N.join();
      return $$0 != null ? $$0.profile() : new GameProfile(this.X.b(), this.X.c());
   }

   public Proxy Z() {
      return this.ad;
   }

   public gnw aa() {
      return this.O;
   }

   public atx ab() {
      return this.ai;
   }

   public ati ac() {
      return this.al;
   }

   public asn ad() {
      return this.aj;
   }

   public gql ae() {
      return this.ak;
   }

   public Path af() {
      return this.M;
   }

   public gpd ag() {
      return this.am;
   }

   public Function<akn, gnv> a(akn $$0) {
      return this.aB.a($$0)::a;
   }

   public boolean ah() {
      return this.aU;
   }

   public gce ai() {
      return this.au;
   }

   public gsn aj() {
      return this.aq;
   }

   public avf ak() {
      avf $$0 = x.a(this.y, flz::B);
      if ($$0 != null) {
         return $$0;
      } else if (this.s != null) {
         if (this.s.dP().ae() == daz.j) {
            return this.l.j().b() ? avg.d : avg.e;
         } else {
            ix<dby> $$1 = this.s.dP().t(this.s.dp());
            if (!this.ar.c(avg.f) && (!this.s.bj() || !$$1.a(avw.Z))) {
               return this.s.dP().ae() != daz.i && this.s.gd().d && this.s.gd().c ? avg.b : $$1.a().o().orElse(avg.g);
            } else {
               return avg.f;
            }
         }
      } else {
         return avg.a;
      }
   }

   public MinecraftSessionService al() {
      return this.ax;
   }

   public gow am() {
      return this.aA;
   }

   @Nullable
   public brw an() {
      return this.t;
   }

   public void a(brw $$0) {
      this.t = $$0;
      this.j.a($$0);
   }

   public boolean b(brw $$0) {
      return $$0.cg() || this.s != null && this.s.N_() && this.m.R.e() && $$0.ak() == bsc.by;
   }

   @Override
   protected Thread az() {
      return this.bb;
   }

   @Override
   protected Runnable f(Runnable $$0) {
      return $$0;
   }

   @Override
   protected boolean e(Runnable $$0) {
      return true;
   }

   public gde ao() {
      return this.aC;
   }

   public ghr ap() {
      return this.U;
   }

   public gej aq() {
      return this.aL;
   }

   public gir ar() {
      return this.V;
   }

   public <T> grw<T> a(grv.a<T> $$0) {
      return this.W.a($$0);
   }

   public <T> void a(grv.a<T> $$0, List<T> $$1) {
      this.W.a($$0, $$1);
   }

   public DataFixer as() {
      return this.P;
   }

   public float at() {
      return this.S.a;
   }

   public float au() {
      return this.S.b;
   }

   public ffe av() {
      return this.an;
   }

   public boolean aw() {
      return this.s != null && this.s.gs() || this.m.V().c();
   }

   public fik ax() {
      return this.aH;
   }

   public gtq aA() {
      return this.aI;
   }

   public boolean aB() {
      return this.bg;
   }

   public fdx aC() {
      return this.Z;
   }

   public gqc aD() {
      return this.aB;
   }

   public gou aE() {
      return this.aD;
   }

   public got aF() {
      return this.aE;
   }

   public gos aG() {
      return this.aF;
   }

   public ffo aH() {
      return this.aG;
   }

   @Override
   public void a(boolean $$0) {
      this.bg = $$0;
   }

   public wx a(File $$0, int $$1, int $$2) {
      int $$3 = this.R.k();
      int $$4 = this.R.l();
      exg $$5 = new exh($$1, $$2, true, a);
      float $$6 = this.s.dH();
      float $$7 = this.s.dF();
      float $$8 = this.s.P;
      float $$9 = this.s.O;
      this.j.b(false);

      xl var12;
      try {
         this.j.c(true);
         this.f.e();
         this.R.b($$1);
         this.R.c($$2);

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

            this.s.O = this.s.dF();
            this.s.P = this.s.dH();
            $$5.a(true);
            this.j.a(1.0F, 0L);

            try {
               Thread.sleep(10L);
            } catch (InterruptedException var17) {
            }

            fel.a($$0, "panorama_" + $$10 + ".png", $$5, $$0x -> {
            });
         }

         wx $$11 = wx.b($$0.getName()).a(n.t).a($$1x -> $$1x.a(new wv(wv.a.b, $$0.getAbsolutePath())));
         return wx.a("screenshot.success", $$11);
      } catch (Exception var18) {
         F.error("Couldn't save image", var18);
         var12 = wx.a("screenshot.failure", var18.getMessage());
      } finally {
         this.s.s($$6);
         this.s.r($$7);
         this.s.P = $$8;
         this.s.O = $$9;
         this.j.b(true);
         this.R.b($$3);
         this.R.c($$4);
         $$5.a();
         this.j.c(false);
         this.f.e();
         this.h().a(true);
      }

      return var12;
   }

   private wx a(File $$0, int $$1, int $$2, int $$3, int $$4) {
      try {
         ByteBuffer $$5 = exn.a($$1 * $$2 * 3);
         fel $$6 = new fel($$0, $$3, $$4, $$2);
         float $$7 = (float)$$3 / (float)$$1;
         float $$8 = (float)$$4 / (float)$$2;
         float $$9 = $$7 > $$8 ? $$7 : $$8;

         for (int $$10 = ($$4 - 1) / $$2 * $$2; $$10 >= 0; $$10 -= $$2) {
            for (int $$11 = 0; $$11 < $$3; $$11 += $$1) {
               RenderSystem.setShaderTexture(0, gnu.e);
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
         exn.a($$5);
         wx $$15 = wx.b($$14.getName()).a(n.t).a($$1x -> $$1x.a(new wv(wv.a.b, $$14.getAbsolutePath())));
         return wx.a("screenshot.success", $$15);
      } catch (Exception var15) {
         F.warn("Couldn't save screenshot", var15);
         return wx.a("screenshot.failure", var15.getMessage());
      }
   }

   public bmk aI() {
      return this.bk;
   }

   @Nullable
   public ara aJ() {
      return this.Y.get();
   }

   public gox aK() {
      return this.at;
   }

   @Nullable
   public flt aL() {
      return this.aZ;
   }

   public fqg aM() {
      return this.aJ;
   }

   public boolean aN() {
      return false;
   }

   public exy aO() {
      return this.R;
   }

   public fgi aP() {
      return this.l.k();
   }

   public gcq aQ() {
      return this.T;
   }

   public void b(int $$0) {
      this.aB.a($$0);
   }

   public fvs aR() {
      return this.aK;
   }

   public boolean aS() {
      return this.bs().flag(UserFlag.PROFANITY_FILTER_ENABLED);
   }

   public void aT() {
      this.aJ.a();
      this.w().a();
   }

   @Nullable
   public ayr aU() {
      return ayr.a(this.aw.getServicesKeySet(), ServicesKeyType.PROFILE_KEY);
   }

   public boolean aV() {
      return !this.aw.getServicesKeySet().keys(ServicesKeyType.PROFILE_KEY).isEmpty();
   }

   public fdy aW() {
      return this.aa;
   }

   public void a(fdy $$0) {
      this.aa = $$0;
   }

   public fdt aX() {
      return this.bt;
   }

   public fxk aY() {
      return this.bu;
   }

   public fxz aZ() {
      return this.bv;
   }

   public fba ba() {
      return this.aO;
   }

   public gbu bb() {
      return this.aP;
   }

   public fdq bc() {
      return this.bw;
   }

   public euc bd() {
      return this.bx;
   }

   private float a(float $$0) {
      if (this.r != null) {
         bqh $$1 = this.r.s();
         if ($$1.i()) {
            return Math.max($$0, $$1.g());
         }
      }

      return $$0;
   }

   @Nullable
   public static String be() {
      return System.getProperty("minecraft.launcher.brand");
   }

   public static enum a {
      a(ww.a) {
         @Override
         public boolean a(boolean $$0) {
            return true;
         }
      },
      b(wx.c("chat.disabled.options").a(n.m)) {
         @Override
         public boolean a(boolean $$0) {
            return false;
         }
      },
      c(wx.c("chat.disabled.launcher").a(n.m)) {
         @Override
         public boolean a(boolean $$0) {
            return $$0;
         }
      },
      d(wx.a("chat.disabled.profile", wx.d(feb.E.m.J.h())).a(n.m)) {
         @Override
         public boolean a(boolean $$0) {
            return $$0;
         }
      };

      static final wx e = wx.c("chat.disabled.profile.moreInfo");
      private final wx f;

      a(wx $$0) {
         this.f = $$0;
      }

      public wx a() {
         return this.f;
      }

      public abstract boolean a(boolean var1);
   }

   static record b(ezk a, frm.c b) {
   }
}
