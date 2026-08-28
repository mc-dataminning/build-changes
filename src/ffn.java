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

public class ffn extends box<Runnable> implements ezl {
   static ffn E;
   private static final Logger F = LogUtils.getLogger();
   public static final boolean a = ac.k() == ac.a.d;
   private static final int G = 10;
   public static final akk b = new akk("default");
   public static final akk c = new akk("uniform");
   public static final akk d = new akk("alt");
   private static final akk H = new akk("regional_compliancies.json");
   private static final CompletableFuture<azh> I = CompletableFuture.completedFuture(azh.a);
   private static final wu J = wu.c("multiplayer.socialInteractions.not_available");
   public static final String e = "Please make sure you have up-to-date drivers (see aka.ms/mcdriver for instructions).";
   private final long K = Double.doubleToLongBits(Math.PI);
   private final Path L;
   private final CompletableFuture<ProfileResult> M;
   private final gpj N;
   private final DataFixer O;
   private final gep P;
   private final ezk Q;
   private final ffz R = new ffz(20.0F, 0L, this::a);
   private final ged S;
   public final gdv f;
   private final gje T;
   private final gke U;
   public final gbn g;
   private final fgb V;
   public final fgx h;
   public final fgx i;
   public final gdq j;
   public final ghj k;
   private final AtomicReference<aqx> W = new AtomicReference<>();
   public final fgy l;
   public final ffr m;
   private final ffj X;
   public final ffo n;
   public final ffm o;
   private ffk Y = ffk.a;
   public final File p;
   private final String Z;
   private final String aa;
   private final Proxy ab;
   private final eqc ac;
   private final boolean ad;
   private final boolean ae;
   private final boolean af;
   private final atr ag;
   private final ask ah;
   private final gry ai;
   private final atf aj;
   private final gqq ak;
   private final fgq al;
   private final fgu am;
   private final eys an;
   private final gub ao;
   private final gtw ap;
   private final fkb aq;
   private final gqk ar;
   private final gdr as;
   private final fft at = new fft(H, ffn::b);
   private final YggdrasilAuthenticationService au;
   private final MinecraftSessionService av;
   private final UserApiService aw;
   private final CompletableFuture<UserProperties> ax;
   private final gqj ay;
   private final grp az;
   private final ger aA;
   private final gqh aB;
   private final gqg aC;
   private final gqf aD;
   private final fha aE;
   private final fjw aF;
   private final gve aG;
   private final frs aH;
   private final fxe aI;
   private final gfw aJ;
   private final guf aK;
   private final fyp aL;
   private final fcm aM;
   private final gdh aN;
   @Nullable
   public fym q;
   @Nullable
   public fyd r;
   @Nullable
   public gcz s;
   @Nullable
   private gtk aO;
   @Nullable
   private vp aP;
   private boolean aQ;
   @Nullable
   public bsd t;
   @Nullable
   public bsd u;
   @Nullable
   public evx v;
   private int aR;
   protected int w;
   private volatile boolean aS;
   private float aT;
   private long aU = ac.d();
   private long aV;
   private int aW;
   public boolean x;
   @Nullable
   public fnd y;
   @Nullable
   private fmx aX;
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
   private fjx bh;
   private bmr bi = bmo.a;
   private int bj;
   private final bml bk = new bml(ac.c, () -> this.bj);
   @Nullable
   private bmq bl;
   private bof bm = boe.a;
   private final ffw bn = new ffw();
   private long bo;
   private double bp;
   @Nullable
   private ezz.a bq;
   private final fff br;
   private final fyx bs;
   private fzm bt;
   private final ffc bu;
   private final evp bv;
   private boolean bw;
   private final long bx;
   private long by;
   private String bz = "root";

   public ffn(fsy $$0) {
      super("Client");
      E = this;
      this.bx = System.currentTimeMillis();
      this.p = $$0.c.a;
      File $$1 = $$0.c.c;
      this.L = $$0.c.b.toPath();
      this.Z = $$0.d.b;
      this.aa = $$0.d.c;
      Path $$2 = this.p.toPath();
      this.bv = eqc.a($$2.resolve("allowed_symlinks.txt"));
      gpz $$3 = new gpz($$0.c.a(), this.bv);
      this.ai = new gry(this, $$2.resolve("downloads"), $$0.a);
      ath $$4 = new ata(this.L, asi.a, atg.b, this.bv);
      this.aj = new atf($$3, this.ai.a(), $$4);
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
      xz.a(ffl::a);
      this.O = azm.a();
      this.aF = new fjw(this);
      this.aZ = Thread.currentThread();
      this.m = new ffr(this, this.p);
      RenderSystem.setShaderGlintAlpha(this.m.an().c());
      this.ba = true;
      this.aG = new gve(this, this.m);
      this.X = new ffj($$2, this.O);
      F.info("Backend library: {}", RenderSystem.getBackendDescription());
      eyx $$5;
      if (this.m.p > 0 && this.m.o > 0) {
         $$5 = new eyx(this.m.o, this.m.p, $$0.b.c, $$0.b.d, $$0.b.e);
      } else {
         $$5 = $$0.b;
      }

      ac.c = RenderSystem.initBackendSystem();
      this.P = new gep(this);
      this.Q = this.P.a($$5, this.m.k, this.bf());
      this.a(true);
      guq.a.b(gum.A);

      try {
         this.Q.a(this.ah, aa.b().g() ? eza.a : eza.b);
      } catch (IOException var13) {
         F.error("Couldn't set icon", var13);
      }

      this.Q.a(this.m.h().c());
      this.n = new ffo(this);
      this.n.a(this.Q.i());
      this.o = new ffm(this);
      this.o.a(this.Q.i());
      RenderSystem.initRenderer(this.m.u, false);
      this.an = new eyp(this.Q.k(), this.Q.l());
      this.an.a(0.0F, 0.0F, 0.0F, 0.0F);
      this.an.b(a);
      this.ag = new atr(asi.a);
      this.aj.a();
      this.m.b(this.aj);
      this.ak = new gqq(this.m.ac, $$0x -> {
         if (this.s != null) {
            this.s.cB.A();
         }
      });
      this.ag.a(this.ak);
      this.N = new gpj(this.ag);
      this.ag.a(this.N);
      this.ay = new gqj(this.N, $$1.toPath().resolve("skins"), this.av, this);
      this.ac = new eqc($$2.resolve("saves"), $$2.resolve("backups"), this.bv, this.O);
      this.bu = new ffc($$2);
      this.ao = new gub(this.m);
      this.ag.a(this.ao);
      this.ar = new gqk(this.V);
      this.ag.a(this.ar);
      this.ap = new gtw(this);
      this.aq = new fkb(this.N);
      this.h = this.aq.a();
      this.i = this.aq.b();
      this.ag.a(this.aq);
      this.g();
      this.ag.a(new gqc());
      this.ag.a(new gqb());
      this.Q.a("Startup");
      RenderSystem.setupDefaultState(0, 0, this.Q.k(), this.Q.l());
      this.Q.a("Post startup");
      this.al = fgq.a();
      this.am = fgu.a(this.al);
      this.az = new grp(this.N, this.al, this.m.C().c());
      this.ag.a(this.az);
      this.aI = new fxe();
      this.ag.a(this.aI);
      this.aJ = new gfw(this.h, this.aI, this::ao, this::ar, this::ap);
      this.ag.a(this.aJ);
      gdk $$8 = new gdk(this.aJ, this.aI);
      this.ag.a($$8);
      this.U = new gke(this, this.N, this.az, this.am, $$8);
      this.ag.a(this.U);

      try {
         int $$9 = Runtime.getRuntime().availableProcessors();
         fai.a();
         this.S = new ged($$9);
      } catch (OutOfMemoryError var12) {
         TinyFileDialogs.tinyfd_messageBox(
            "Minecraft",
            "Oh no! The game was unable to allocate memory off-heap while trying to start. You may try to free some memory by closing other applications on your computer, check that your system meets the minimum requirements, and try again. If the problem persists, please visit: https://aka.ms/Minecraft-Support",
            "ok",
            "error",
            true
         );
         throw new fsz("Unable to allocate render buffers", var12);
      }

      this.aH = new frs(this, this.aw);
      this.aA = new ger(this.az.b(), $$8, this.al);
      this.ag.a(this.aA);
      this.T = new gje(this, this.N, this.U, this.aA, this.h, this.m, this.aI);
      this.ag.a(this.T);
      this.g = new gbn(this.r, this.N);
      this.ag.a(this.g);
      this.aB = new gqh(this.N);
      this.ag.a(this.aB);
      this.aC = new gqg(this.N);
      this.ag.a(this.aC);
      this.aD = new gqf(this.N);
      this.ag.a(this.aD);
      this.aE = new fha(this.N);
      this.ag.a(this.aE);
      this.j = new gdq(this, this.T.d(), this.ag, this.S);
      this.ag.a(this.j.d());
      this.f = new gdv(this, this.T, this.aJ, this.S);
      this.ag.a(this.f);
      this.as = new gdr();
      this.ag.a(this.as);
      this.ag.a(this.at);
      this.l = new fgy(this);
      this.k = new ghj(this);
      faw $$11 = faw.a(this);
      this.aM = new fcm($$11);
      RenderSystem.setErrorCallback(this::a);
      if (this.an.c != this.Q.k() || this.an.d != this.Q.l()) {
         StringBuilder $$12 = new StringBuilder(
            "Recovering from unsupported resolution ("
               + this.Q.k()
               + "x"
               + this.Q.l()
               + ").\nPlease make sure you have up-to-date drivers (see aka.ms/mcdriver for instructions)."
         );
         if (eyy.b()) {
            $$12.append("\n\nReported GL debug messages:\n").append(String.join("\n", eyy.a()));
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
      this.aK = new guf(this, this.aw, this.V);
      this.aL = fyp.a(this.aw, this.V, $$2);
      this.br = new fff(this);
      this.br.a(this.m.as().c() != ffp.a);
      this.bs = new fyx(this);
      this.bs.a(this.m.A().c());
      this.bt = fzm.a(fzj.a(), this.aw);
      fmt.a(this);
      this.a(new fmo(wu.c("gui.loadingMinecraft")));
      List<asg> $$13 = this.aj.g();
      this.bn.a(ffw.b.a, $$13);
      atq $$14 = this.ag.a(ac.g(), this, I, $$13);
      guq.a.a(gum.C);
      ffn.b $$15 = new ffn.b($$11, $$0.e);
      this.a(new fmt(this, $$14, $$1x -> ac.a($$1x, $$1xx -> this.a($$1xx, $$15), () -> {
            if (aa.aX) {
               this.bi();
            }

            this.bn.a();
            this.a($$15);
         }), false));
      this.aN = gdh.a($$0.e.b());
   }

   private void a(@Nullable ffn.b $$0) {
      if (!this.bw) {
         this.bw = true;
         this.b($$0);
      }
   }

   private void b(@Nullable ffn.b $$0) {
      Runnable $$1 = this.c($$0);
      guq.a.b(gum.C);
      guq.a.b(gum.z);
      guq.a.a(this.aK.a());
      $$1.run();
   }

   public boolean c() {
      return this.bw;
   }

   private Runnable c(@Nullable ffn.b $$0) {
      List<Function<Runnable, fnd>> $$1 = new ArrayList<>();
      this.a($$1);
      Runnable $$2 = () -> {
         if ($$0 != null && $$0.b().a()) {
            gdg.a(this, $$0.b(), $$0.a());
         } else {
            this.a(new fnf(true));
         }
      };

      for (Function<Runnable, fnd> $$3 : Lists.reverse($$1)) {
         fnd $$4 = $$3.apply($$2);
         $$2 = () -> this.a($$4);
      }

      return $$2;
   }

   private void a(List<Function<Runnable, fnd>> $$0) {
      if (this.m.ad) {
         $$0.add($$0x -> new flv(this.m, $$0x));
      }

      BanDetails $$1 = this.H();
      if ($$1 != null) {
         $$0.add($$1x -> fly.a($$1xx -> {
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
            $$0.add($$1x -> fly.a($$3.getName(), $$1x));
         }

         if ($$4.contains(ProfileActionType.USING_BANNED_SKIN)) {
            $$0.add(fly::a);
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
      this.Q.b(this.bf());
   }

   private String bf() {
      StringBuilder $$0 = new StringBuilder("Minecraft");
      if (e().a()) {
         $$0.append("*");
      }

      $$0.append(" ");
      $$0.append(aa.b().c());
      fye $$1 = this.L();
      if ($$1 != null && $$1.k().i()) {
         $$0.append(" - ");
         fyr $$2 = this.S();
         if (this.aO != null && !this.aO.r()) {
            $$0.append(gqo.a("title.singleplayer"));
         } else if ($$2 != null && $$2.e()) {
            $$0.append(gqo.a("title.multiplayer.realms"));
         } else if (this.aO == null && ($$2 == null || !$$2.d())) {
            $$0.append(gqo.a("title.multiplayer.other"));
         } else {
            $$0.append(gqo.a("title.multiplayer.lan"));
         }
      }

      return $$0.toString();
   }

   private UserApiService a(YggdrasilAuthenticationService $$0, fsy $$1) {
      return $$1.a.a.g() != fgb.a.c ? UserApiService.OFFLINE : $$0.createUserApiService($$1.a.a.d());
   }

   public static ayd e() {
      return ayd.a("vanilla", ClientBrandRetriever::getClientModName, "Client", ffn.class);
   }

   private void a(Throwable $$0, @Nullable ffn.b $$1) {
      if (this.aj.d().size() > 1) {
         this.a($$0, null, $$1);
      } else {
         ac.a($$0);
      }
   }

   public void a(Throwable $$0, @Nullable wu $$1, @Nullable ffn.b $$2) {
      F.info("Caught error loading resourcepacks, removing all selected resourcepacks", $$0);
      this.bn.a($$0);
      this.ai.b();
      this.aj.b(Collections.emptyList());
      this.m.i.clear();
      this.m.j.clear();
      this.m.av();
      this.a(true, $$2).thenRun(() -> this.a($$1));
   }

   private void bg() {
      this.a(null);
      if (this.r != null) {
         this.r.Y();
         this.y();
      }

      this.a(new fnf());
      this.a(null);
   }

   private void a(@Nullable wu $$0) {
      fjw $$1 = this.ax();
      fju.b($$1, fju.a.c, wu.c("resourcePack.load_fail"), $$0);
   }

   public void f() {
      this.aZ = Thread.currentThread();
      if (Runtime.getRuntime().availableProcessors() > 4) {
         this.aZ.setPriority(10);
      }

      try {
         boolean $$0 = false;

         while (this.ba) {
            this.bh();

            try {
               bmu $$1 = bmu.a("Renderer");
               boolean $$2 = this.aP().e();
               this.bi = this.a($$2, $$1);
               this.bi.a();
               this.bm.c();
               this.c(!$$0);
               this.bm.d();
               this.bi.b();
               this.b($$2, $$1);
            } catch (OutOfMemoryError var4) {
               if ($$0) {
                  throw var4;
               }

               this.bk();
               this.a(new fmw());
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

   public eys h() {
      return this.an;
   }

   public String i() {
      return this.Z;
   }

   public String j() {
      return this.aa;
   }

   public void a(o $$0) {
      this.bb = () -> this.d($$0);
   }

   public void b(o $$0) {
      this.bb = () -> $$0;
   }

   private void bh() {
      if (this.bb != null) {
         a(this, this.p, this.bb.get());
      }
   }

   public void c(o $$0) {
      o $$1 = this.d($$0);
      this.bk();
      a(this, this.p, $$1);
   }

   public static void a(@Nullable ffn $$0, File $$1, o $$2) {
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

   private CompletableFuture<Void> a(boolean $$0, @Nullable ffn.b $$1) {
      if (this.bg != null) {
         return this.bg;
      } else {
         CompletableFuture<Void> $$2 = new CompletableFuture<>();
         if (!$$0 && this.aX instanceof fmt) {
            this.bg = $$2;
            return $$2;
         } else {
            this.aj.a();
            List<asg> $$3 = this.aj.g();
            if (!$$0) {
               this.bn.a(ffw.b.b, $$3);
            }

            this.a(new fmt(this, this.ag.a(ac.g(), this, I, $$3), $$3x -> ac.a($$3x, $$2xx -> {
                  if ($$0) {
                     this.ai.c();
                     this.bg();
                  } else {
                     this.a($$2xx, $$1);
                  }
               }, () -> {
                  this.f.f();
                  this.bn.a();
                  this.ai.d();
                  $$2.complete(null);
                  this.a($$1);
               }), !$$0));
            return $$2;
         }
      }
   }

   private void bi() {
      boolean $$0 = false;
      geq $$1 = this.ao().a();
      grj $$2 = $$1.a().a();

      for (dff $$3 : lq.e) {
         UnmodifiableIterator $$10 = $$3.l().a().iterator();

         while ($$10.hasNext()) {
            dsh $$4 = (dsh)$$10.next();
            if ($$4.l() == dll.c) {
               grj $$5 = $$1.b($$4);
               if ($$5 == $$2) {
                  F.debug("Missing model for: {}", $$4);
                  $$0 = true;
               }
            }
         }
      }

      gpi $$6 = $$2.e();

      for (dff $$7 : lq.e) {
         UnmodifiableIterator var17 = $$7.l().a().iterator();

         while (var17.hasNext()) {
            dsh $$8 = (dsh)var17.next();
            gpi $$9 = $$1.a($$8);
            if (!$$8.i() && $$9 == $$6) {
               F.debug("Missing particle icon for: {}", $$8);
            }
         }
      }

      for (ctv $$10 : lq.g) {
         cua $$11 = $$10.w();
         String $$12 = $$11.t();
         String $$13 = wu.c($$12).getString();
         if ($$13.toLowerCase(Locale.ROOT).equals($$10.a())) {
            F.debug("Missing translation for: {} {} {}", new Object[]{$$11, $$12, $$10});
         }
      }

      $$0 |= fmu.a();
      $$0 |= gjh.a();
      if ($$0) {
         throw new IllegalStateException("Your game data is foobar, fix the errors above!");
      }
   }

   public eqc m() {
      return this.ac;
   }

   private void a(String $$0) {
      ffn.a $$1 = this.J();
      if (!$$1.a(this.T())) {
         if (this.l.b()) {
            this.l.b(false);
            this.a(new fma($$0x -> {
               if ($$0x) {
                  ac.k().a("https://aka.ms/JavaAccountSettings");
               }

               this.a(null);
            }, ffn.a.e, "https://aka.ms/JavaAccountSettings", true));
         } else {
            wu $$2 = $$1.a();
            this.l.a($$2, false);
            this.br.c($$2);
            this.l.b($$1 == ffn.a.d);
         }
      } else {
         this.a(new flz($$0));
      }
   }

   public void a(@Nullable fnd $$0) {
      if (aa.aX && Thread.currentThread() != this.aZ) {
         F.error("setScreen called from non-game thread");
      }

      if (this.y != null) {
         this.y.j();
      } else {
         this.a(ffk.a);
      }

      if ($$0 == null && this.aY) {
         throw new IllegalStateException("Trying to return to in-game GUI during disconnection");
      } else {
         if ($$0 == null && this.r == null) {
            $$0 = new fnf();
         } else if ($$0 == null && this.s.ex()) {
            if (this.s.o()) {
               $$0 = new fmh(null, this.r.k().l());
            } else {
               this.s.fW();
            }
         }

         this.y = $$0;
         if (this.y != null) {
            this.y.aG_();
         }

         fac.a();
         if ($$0 != null) {
            this.n.j();
            ffl.b();
            $$0.b(this, this.Q.o(), this.Q.p());
            this.x = false;
         } else {
            this.ao.i();
            this.n.i();
         }

         this.d();
      }
   }

   public void a(@Nullable fmx $$0) {
      this.aX = $$0;
   }

   public void n() {
      try {
         F.info("Stopping!");

         try {
            this.br.c();
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
         fkn.b();
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
      long $$1 = ac.d();
      if (this.Q.b()) {
         this.q();
      }

      if (this.bg != null && !(this.aX instanceof fmt)) {
         CompletableFuture<Void> $$2 = this.bg;
         this.bg = null;
         this.l().thenRun(() -> $$2.complete(null));
      }

      Runnable $$3;
      while (($$3 = this.bf.poll()) != null) {
         $$3.run();
      }

      if ($$0) {
         int $$4 = this.R.a(ac.c());
         this.bi.a("scheduledExecutables");
         this.bA();
         this.bi.c();
         this.bi.a("tick");

         for (int $$5 = 0; $$5 < Math.min(10, $$4); $$5++) {
            this.bi.d("clientTick");
            this.t();
         }

         this.bi.c();
      }

      this.Q.a("Render");
      this.bi.a("sound");
      this.ao.a(this.j.l());
      this.bi.c();
      this.bi.a("render");
      long $$6 = ac.d();
      boolean $$8;
      if (!this.aP().d() && !this.bm.e()) {
         $$8 = false;
         this.bp = 0.0;
      } else {
         $$8 = this.bq == null || this.bq.b();
         if ($$8) {
            ezz.a().ifPresent(ezz::b);
         }
      }

      RenderSystem.clear(16640, a);
      this.an.a(true);
      gdp.a();
      this.bi.a("display");
      RenderSystem.enableCull();
      this.bi.b("mouse");
      this.n.a();
      this.bi.c();
      if (!this.x) {
         this.bi.b("gameRenderer");
         this.j.a(this.aS ? this.aT : this.R.a, $$1, $$0);
         this.bi.c();
      }

      if (this.bl != null) {
         this.bi.a("fpsPie");
         fgz $$9 = new fgz(this, this.S.c());
         this.a($$9, this.bl);
         $$9.e();
         this.bi.c();
      }

      this.bi.a("blit");
      this.an.e();
      this.an.a(this.Q.k(), this.Q.l());
      this.bd = ac.d() - $$6;
      if ($$8) {
         ezz.a().ifPresent($$0x -> this.bq = $$0x.c());
      }

      this.bi.b("updateDisplay");
      this.Q.e();
      int $$10 = this.bj();
      if ($$10 < 260) {
         RenderSystem.limitDisplayFPS($$10);
      }

      this.bi.b("yield");
      Thread.yield();
      this.bi.c();
      this.Q.a("Post render");
      this.aW++;
      boolean $$11 = this.U() && (this.y != null && this.y.k() || this.aX != null && this.aX.a()) && !this.aO.r();
      if (this.aS != $$11) {
         if ($$11) {
            this.aT = this.R.a;
         } else {
            this.R.a = this.aT;
         }

         this.aS = $$11;
      }

      long $$12 = ac.d();
      long $$13 = $$12 - this.aU;
      if ($$8) {
         this.bo = $$13;
      }

      this.aP().a($$13);
      this.aU = $$12;
      this.bi.a("fpsUpdate");
      if (this.bq != null && this.bq.b()) {
         this.bp = (double)this.bq.c() * 100.0 / (double)this.bo;
      }

      while (ac.c() >= this.aV + 1000L) {
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
            this.m.N().c() ? " vsync " : " ",
            this.m.j().c(),
            this.m.i().c() == ffb.a ? "" : (this.m.i().c() == ffb.b ? " fast-clouds" : " fancy-clouds"),
            this.m.E().c(),
            $$14
         );
         this.aV += 1000L;
         this.aW = 0;
      }

      this.bi.c();
   }

   private bmr a(boolean $$0, @Nullable bmu $$1) {
      if (!$$0) {
         this.bk.b();
         if (!this.bm.e() && $$1 == null) {
            return bmo.a;
         }
      }

      bmr $$2;
      if ($$0) {
         if (!this.bk.a()) {
            this.bj = 0;
            this.bk.c();
         }

         this.bj++;
         $$2 = this.bk.d();
      } else {
         $$2 = bmo.a;
      }

      if (this.bm.e()) {
         $$2 = bmr.a($$2, this.bm.f());
      }

      return bmu.a($$2, $$1);
   }

   private void b(boolean $$0, @Nullable bmu $$1) {
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
      int $$0 = this.Q.a(this.m.aq().c(), this.k());
      this.Q.a((double)$$0);
      if (this.y != null) {
         this.y.a(this, this.Q.o(), this.Q.p());
      }

      eys $$1 = this.h();
      $$1.a(this.Q.k(), this.Q.l(), a);
      this.j.a(this.Q.k(), this.Q.l());
      this.n.g();
   }

   @Override
   public void b() {
      this.n.k();
   }

   public int o() {
      return bc;
   }

   public long p() {
      return this.bd;
   }

   private int bj() {
      return this.r != null || this.y == null && this.aX == null ? this.Q.d() : 60;
   }

   private void bk() {
      try {
         ayc.b();
         this.f.p();
      } catch (Throwable var3) {
      }

      try {
         System.gc();
         if (this.aQ && this.aO != null) {
            this.aO.a(true);
         }

         this.b((fnd)(new fmo(wu.c("menu.savingLevel"))));
      } catch (Throwable var2) {
      }

      System.gc();
   }

   public boolean a(Consumer<wu> $$0) {
      if (this.bm.e()) {
         this.bl();
         return false;
      } else {
         Consumer<bmq> $$1 = $$1x -> {
            if ($$1x != bmm.a) {
               int $$2x = $$1x.f();
               double $$3x = (double)$$1x.g() / (double)aze.a;
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

         this.bm = bod.a(new gde(ac.c, this.f), ac.c, ac.h(), new boj("client"), $$1x -> {
            this.bm = boe.a;
            $$1.accept($$1x);
         }, $$5);
         return true;
      }
   }

   private void bl() {
      this.bm.a();
      if (this.aO != null) {
         this.aO.aX();
      }
   }

   private void bm() {
      this.bm.b();
      if (this.aO != null) {
         this.aO.aY();
      }
   }

   private Path a(ab $$0, List<Path> $$1) {
      String $$2;
      if (this.T()) {
         $$2 = this.V().bb().e();
      } else {
         fyr $$3 = this.S();
         $$2 = $$3 != null ? $$3.a : "unknown";
      }

      Path $$7;
      try {
         String $$5 = String.format(Locale.ROOT, "%s-%s-%s", ac.f(), $$2, aa.b().b());
         String $$6 = v.a(boj.a, $$5, ".zip");
         $$7 = boj.a.resolve($$6);
      } catch (IOException var21) {
         throw new UncheckedIOException(var21);
      }

      try (axp $$10 = new axp($$7)) {
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
      if (this.bl != null) {
         List<bmt> $$1 = this.bl.a(this.bz);
         if (!$$1.isEmpty()) {
            bmt $$2 = $$1.remove(0);
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

   private void a(fgz $$0, bmq $$1) {
      List<bmt> $$2 = $$1.a(this.bz);
      bmt $$3 = $$2.remove(0);
      RenderSystem.clear(256, a);
      RenderSystem.setShader(gdq::p);
      Matrix4f $$4 = new Matrix4f().setOrtho(0.0F, (float)this.Q.k(), (float)this.Q.l(), 0.0F, 1000.0F, 3000.0F);
      RenderSystem.setProjectionMatrix($$4, fao.b);
      Matrix4fStack $$5 = RenderSystem.getModelViewStack();
      $$5.pushMatrix();
      $$5.translation(0.0F, 0.0F, -2000.0F);
      RenderSystem.applyModelViewMatrix();
      RenderSystem.lineWidth(1.0F);
      fai $$6 = fai.b();
      fab $$7 = $$6.d();
      int $$8 = 160;
      int $$9 = this.Q.k() - 160 - 10;
      int $$10 = this.Q.l() - 320;
      RenderSystem.enableBlend();
      $$7.a(fal.b.h, fae.n);
      $$7.a((double)((float)$$9 - 176.0F), (double)((float)$$10 - 96.0F - 16.0F), 0.0).a(200, 0, 0, 0).e();
      $$7.a((double)((float)$$9 - 176.0F), (double)($$10 + 320), 0.0).a(200, 0, 0, 0).e();
      $$7.a((double)((float)$$9 + 176.0F), (double)($$10 + 320), 0.0).a(200, 0, 0, 0).e();
      $$7.a((double)((float)$$9 + 176.0F), (double)((float)$$10 - 96.0F - 16.0F), 0.0).a(200, 0, 0, 0).e();
      $$6.c();
      RenderSystem.disableBlend();
      double $$11 = 0.0;

      for (bmt $$12 : $$2) {
         int $$13 = aye.a($$12.a / 4.0) + 1;
         $$7.a(fal.b.g, fae.n);
         int $$14 = $$12.a();
         int $$15 = $$14 >> 16 & 0xFF;
         int $$16 = $$14 >> 8 & 0xFF;
         int $$17 = $$14 & 0xFF;
         $$7.a((double)$$9, (double)$$10, 0.0).a($$15, $$16, $$17, 255).e();

         for (int $$18 = $$13; $$18 >= 0; $$18--) {
            float $$19 = (float)(($$11 + $$12.a * (double)$$18 / (double)$$13) * (float) (Math.PI * 2) / 100.0);
            float $$20 = aye.a($$19) * 160.0F;
            float $$21 = aye.b($$19) * 160.0F * 0.5F;
            $$7.a((double)((float)$$9 + $$20), (double)((float)$$10 - $$21), 0.0).a($$15, $$16, $$17, 255).e();
         }

         $$6.c();
         $$7.a(fal.b.f, fae.n);

         for (int $$22 = $$13; $$22 >= 0; $$22--) {
            float $$23 = (float)(($$11 + $$12.a * (double)$$22 / (double)$$13) * (float) (Math.PI * 2) / 100.0);
            float $$24 = aye.a($$23) * 160.0F;
            float $$25 = aye.b($$23) * 160.0F * 0.5F;
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
      String $$27 = bmq.b($$3.d);
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
         bmt $$31 = $$2.get($$30);
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
      this.ba = false;
   }

   public boolean r() {
      return this.ba;
   }

   public void b(boolean $$0) {
      if (this.y == null) {
         boolean $$1 = this.U() && !this.aO.r();
         if ($$1) {
            this.a(new fmy(!$$0));
            this.ao.e();
         } else {
            this.a(new fmy(true));
         }
      }
   }

   private void d(boolean $$0) {
      if (!$$0) {
         this.w = 0;
      }

      if (this.w <= 0 && !this.s.fr()) {
         if ($$0 && this.v != null && this.v.c() == evx.a.b) {
            evv $$1 = (evv)this.v;
            ja $$2 = $$1.a();
            if (!this.r.a_($$2).i()) {
               jf $$3 = $$1.b();
               if (this.q.b($$2, $$3)) {
                  this.g.a($$2, $$3);
                  this.s.a(bqc.a);
               }
            }
         } else {
            this.q.b();
         }
      }
   }

   private boolean bn() {
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
         cua $$0 = this.s.b(bqc.a);
         if (!$$0.a(this.r.J())) {
            return false;
         } else {
            boolean $$1 = false;
            switch (this.v.c()) {
               case c:
                  this.q.a(this.s, ((evw)this.v).a());
                  break;
               case b:
                  evv $$2 = (evv)this.v;
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

                  this.s.gs();
            }

            this.s.a(bqc.a);
            return $$1;
         }
      }
   }

   private void bo() {
      if (!this.q.k()) {
         this.aR = 4;
         if (!this.s.B()) {
            if (this.v == null) {
               F.warn("Null returned as 'hitResult', this shouldn't happen!");
            }

            for (bqc $$0 : bqc.values()) {
               cua $$1 = this.s.b($$0);
               if (!$$1.a(this.r.J())) {
                  return;
               }

               if (this.v != null) {
                  switch (this.v.c()) {
                     case c:
                        evw $$2 = (evw)this.v;
                        bsd $$3 = $$2.a();
                        if (!this.r.C_().a($$3.dp())) {
                           return;
                        }

                        bqd $$4 = this.q.a(this.s, $$3, $$2, $$0);
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
                        evv $$5 = (evv)this.v;
                        int $$6 = $$1.H();
                        bqd $$7 = this.q.a(this.s, $$0, $$5);
                        if ($$7.a()) {
                           if ($$7.b()) {
                              this.s.a($$0);
                              if (!$$1.e() && ($$1.H() != $$6 || this.q.f())) {
                                 this.j.b.a($$0);
                              }
                           }

                           return;
                        }

                        if ($$7 == bqd.f) {
                           return;
                        }
                  }
               }

               if (!$$1.e()) {
                  bqd $$8 = this.q.a(this.s, $$0);
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

   public gtw s() {
      return this.ap;
   }

   public void t() {
      this.by++;
      if (this.r != null && !this.aS) {
         this.r.s().m();
      }

      if (this.aR > 0) {
         this.aR--;
      }

      this.bi.a("gui");
      this.bs.a();
      this.l.a(this.aS);
      this.bi.c();
      this.j.b(1.0F);
      this.aG.a(this.r, this.v);
      this.bi.a("gameMode");
      if (!this.aS && this.r != null) {
         this.q.c();
      }

      this.bi.b("textures");
      boolean $$0 = this.r == null || this.r.s().i();
      if ($$0) {
         this.N.e();
      }

      if (this.y != null || this.s == null) {
         if (this.y instanceof fmq $$1 && !this.s.fH()) {
            $$1.m();
         }
      } else if (this.s.ex() && !(this.y instanceof fmh)) {
         this.a(null);
      } else if (this.s.fH() && this.r != null) {
         this.a(new fmq());
      }

      if (this.y != null) {
         this.w = 10000;
      }

      if (this.y != null) {
         fnd.a(() -> this.y.e(), "Ticking screen", this.y.getClass().getCanonicalName());
      }

      if (!this.aP().d()) {
         this.l.l();
      }

      if (this.aX == null && this.y == null) {
         this.bi.b("Keybindings");
         this.bq();
         if (this.w > 0) {
            this.w--;
         }
      }

      if (this.r != null) {
         this.bi.b("gameRenderer");
         if (!this.aS) {
            this.j.e();
         }

         this.bi.b("levelRenderer");
         if (!this.aS) {
            this.f.o();
         }

         this.bi.b("level");
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
            if (!this.m.s && this.bp()) {
               wu $$2 = wu.c("tutorial.socialInteractions.title");
               wu $$3 = wu.a("tutorial.socialInteractions.description", gve.a("socialInteractions"));
               this.bh = new fjx(fjx.a.f, $$2, $$3, true);
               this.aG.a(this.bh, 160);
               this.m.s = true;
               this.m.av();
            }

            this.aG.d();

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

         this.bi.b("animateTick");
         if (!this.aS && $$0) {
            this.r.b(this.s.dt(), this.s.dv(), this.s.dz());
         }

         this.bi.b("particles");
         if (!this.aS && $$0) {
            this.g.b();
         }
      } else if (this.aP != null) {
         this.bi.b("pendingConnection");
         this.aP.b();
      }

      this.bi.b("keyboard");
      this.o.b();
      this.bi.c();
   }

   private boolean bp() {
      return !this.aQ || this.aO != null && this.aO.r();
   }

   private void bq() {
      while (this.m.O.g()) {
         fez $$0 = this.m.aA();
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
               this.s.fY().k = $$1;
            } else {
               foh.a(this, $$1, $$3, $$2);
            }
         }
      }

      while (this.m.M.g()) {
         if (!this.bp()) {
            this.s.a(J, true);
            this.br.c(J);
         } else {
            if (this.bh != null) {
               this.aG.a(this.bh);
               this.bh = null;
            }

            this.a(new fru());
         }
      }

      while (this.m.D.g()) {
         if (this.q.g()) {
            this.s.i();
         } else {
            this.aG.a();
            this.a(new fot(this.s));
         }
      }

      while (this.m.S.g()) {
         this.a(new fnn(this.s.cB.p()));
      }

      while (this.m.E.g()) {
         if (!this.s.N_()) {
            this.L().b(new ahf(ahf.a.g, ja.c, jf.a));
         }
      }

      while (this.m.F.g()) {
         if (!this.s.N_() && this.s.a(fnd.s())) {
            this.s.a(bqc.a);
         }
      }

      while (this.m.J.g()) {
         this.a("");
      }

      if (this.y == null && this.aX == null && this.m.L.g()) {
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
            $$4 |= this.bn();
         }

         while (this.m.G.g()) {
            this.bo();
         }

         while (this.m.I.g()) {
            this.bs();
         }
      }

      if (this.m.G.e() && this.aR == 0 && !this.s.fr()) {
         this.bo();
      }

      this.d(this.y == null && !$$4 && this.m.H.e() && this.n.h());
   }

   public guf u() {
      return this.aK;
   }

   public double v() {
      return this.bp;
   }

   public fyp w() {
      return this.aL;
   }

   public fsk x() {
      return new fsk(this, this.ac);
   }

   public void a(eqc.c $$0, atf $$1, alh $$2, boolean $$3) {
      this.y();
      this.W.set(null);
      Instant $$4 = Instant.now();

      try {
         $$0.a($$2.c().a(), $$2.d());
         ale $$5 = ale.a(this.au, this.p);
         $$5.f().a(this);
         dqz.a($$5, this);
         aud.a(false);
         this.aO = MinecraftServer.a((Function<Thread, gtk>)($$4x -> new gtk($$4x, this, $$0, $$1, $$2, $$5, $$0xx -> {
               aqx $$1xx = aqx.b($$0xx + 0);
               this.W.set($$1xx);
               return aqw.a($$1xx, this.bf::add);
            })));
         this.aQ = true;
         this.a(fzj.a());
         this.aN.a(gdh.c.a, $$0.f(), $$2.d().e());
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

      fmr $$9 = new fmr(this.W.get());
      this.a($$9);
      this.bi.a("waitForServer");

      for (; !this.aO.aj() || this.aX != null; this.bh()) {
         $$9.e();
         this.c(false);

         try {
            Thread.sleep(16L);
         } catch (InterruptedException var10) {
         }
      }

      this.bi.c();
      Duration $$10 = Duration.between($$4, Instant.now());
      SocketAddress $$11 = this.aO.ai().a();
      vp $$12 = vp.a($$11);
      $$12.a($$11.toString(), 0, new fyc($$12, this, null, null, $$3, $$10, $$0x -> {
      }, null));
      $$12.a(new air(this.X().c(), this.X().b()));
      this.aP = $$12;
   }

   public void a(fyd $$0, fnb.a $$1) {
      this.e(new fnb(() -> false, $$1));
      this.r = $$0;
      this.a($$0);
      if (!this.aQ) {
         ale $$2 = ale.a(this.au, this.p);
         $$2.f().a(this);
         dqz.a($$2, this);
         aud.a(false);
      }
   }

   public void y() {
      this.a(new fna(true), false);
   }

   public void b(fnd $$0) {
      this.a($$0, false);
   }

   public void a(fnd $$0, boolean $$1) {
      fye $$2 = this.L();
      if ($$2 != null) {
         this.bz();
         $$2.h();
         if (!$$1) {
            this.B();
         }
      }

      this.aH.b();
      if (this.bm.e()) {
         this.bm();
      }

      gtk $$3 = this.aO;
      this.aO = null;
      this.j.h();
      this.q = null;
      this.br.b();
      this.aY = true;

      try {
         this.e($$0);
         if (this.r != null) {
            if ($$3 != null) {
               this.bi.a("waitForServer");

               while (!$$3.H()) {
                  this.c(false);
               }

               this.bi.c();
            }

            this.l.i();
            this.aQ = false;
         }

         this.r = null;
         this.a(null);
         this.s = null;
      } finally {
         this.aY = false;
      }

      dqz.b();
   }

   public void B() {
      this.ai.i();
      this.bA();
   }

   public void c(fnd $$0) {
      fye $$1 = this.L();
      if ($$1 != null) {
         $$1.i();
      }

      if (this.bm.e()) {
         this.bm();
      }

      this.j.h();
      this.q = null;
      this.br.b();
      this.aY = true;

      try {
         this.e($$0);
         this.l.i();
         this.r = null;
         this.a(null);
         this.s = null;
      } finally {
         this.aY = false;
      }

      dqz.b();
   }

   private void e(fnd $$0) {
      this.bi.a("forcedTick");
      this.ao.f();
      this.t = null;
      this.aP = null;
      this.a($$0);
      this.c(false);
      this.bi.c();
   }

   public void d(fnd $$0) {
      this.bi.a("forcedTick");
      this.a($$0);
      this.c(false);
      this.bi.c();
   }

   private void a(@Nullable fyd $$0) {
      this.f.a($$0);
      this.g.a($$0);
      this.aJ.a($$0);
      this.d();
   }

   private UserProperties br() {
      return this.ax.join();
   }

   public boolean C() {
      return this.D() && this.m.ai().c();
   }

   public boolean D() {
      return this.E() && this.br().flag(UserFlag.OPTIONAL_TELEMETRY_AVAILABLE);
   }

   public boolean E() {
      return aa.aX ? false : this.br().flag(UserFlag.TELEMETRY_ENABLED);
   }

   public boolean F() {
      return this.ae && this.br().flag(UserFlag.SERVERS_ALLOWED) && this.H() == null && !this.I();
   }

   public boolean G() {
      return this.br().flag(UserFlag.REALMS_ALLOWED) && this.H() == null;
   }

   @Nullable
   public BanDetails H() {
      return (BanDetails)this.br().bannedScopes().get("MULTIPLAYER");
   }

   public boolean I() {
      ProfileResult $$0 = this.M.getNow(null);
      return $$0 != null && $$0.actions().contains(ProfileActionType.FORCED_NAME_CHANGE);
   }

   public boolean a(UUID $$0) {
      return this.J().a(false) ? this.aH.c($$0) : (this.s == null || !$$0.equals(this.s.cz())) && !$$0.equals(ac.e);
   }

   public ffn.a J() {
      if (this.m.m().c() == cmf.c) {
         return ffn.a.b;
      } else if (!this.af) {
         return ffn.a.c;
      } else {
         return !this.br().flag(UserFlag.CHAT_ALLOWED) ? ffn.a.d : ffn.a.a;
      }
   }

   public final boolean K() {
      return this.ad;
   }

   @Nullable
   public fye L() {
      return this.s == null ? null : this.s.cB;
   }

   public static boolean M() {
      return !E.m.Y;
   }

   public static boolean N() {
      return E.m.j().c().a() >= ffg.b.a();
   }

   public static boolean O() {
      return !E.j.a() && E.m.j().c().a() >= ffg.c.a();
   }

   public static boolean P() {
      return E.m.k().c();
   }

   private void bs() {
      if (this.v != null && this.v.c() != evx.a.a) {
         boolean $$0 = this.s.fZ().d;
         dpn $$1 = null;
         evx.a $$2 = this.v.c();
         cua $$6;
         if ($$2 == evx.a.b) {
            ja $$3 = ((evv)this.v).a();
            dsh $$4 = this.r.a_($$3);
            if ($$4.i()) {
               return;
            }

            dff $$5 = $$4.b();
            $$6 = $$5.a((dcg)this.r, $$3, $$4);
            if ($$6.e()) {
               return;
            }

            if ($$0 && fnd.s() && $$4.t()) {
               $$1 = this.r.c_($$3);
            }
         } else {
            if ($$2 != evx.a.c || !$$0) {
               return;
            }

            bsd $$7 = ((evw)this.v).a();
            $$6 = $$7.dC();
            if ($$6 == null) {
               return;
            }
         }

         if ($$6.e()) {
            String $$10 = "";
            if ($$2 == evx.a.b) {
               $$10 = lq.e.b(this.r.a_(((evv)this.v).a()).b()).toString();
            } else if ($$2 == evx.a.c) {
               $$10 = lq.f.b(((evw)this.v).a().ak()).toString();
            }

            F.warn("Picking on: [{}] {} gave null item", $$2, $$10);
         } else {
            cmg $$11 = this.s.fY();
            if ($$1 != null) {
               this.a($$6, $$1, this.r.H_());
            }

            int $$12 = $$11.c($$6);
            if ($$0) {
               $$11.b($$6);
               this.q.a(this.s.b(bqc.a), 36 + $$11.k);
            } else if ($$12 != -1) {
               if (cmg.d($$12)) {
                  $$11.k = $$12;
               } else {
                  this.q.a($$12);
               }
            }
         }
      }
   }

   private void a(cua $$0, dpn $$1, jx $$2) {
      tx $$3 = $$1.f($$2);
      $$1.a($$3);
      cry.a($$0, $$1.r(), $$3);
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

      this.bn.a($$0);
      return $$0;
   }

   public static void a(@Nullable ffn $$0, @Nullable gqq $$1, String $$2, @Nullable ffr $$3, o $$4) {
      ab $$5 = $$4.g();
      a($$5, $$0, $$1, $$2, $$3);
   }

   private static String a(double $$0) {
      return String.format(Locale.ROOT, "%.3fs", $$0);
   }

   private void a(p $$0) {
      $$0.a("JVM uptime", () -> a((double)ManagementFactory.getRuntimeMXBean().getUptime() / 1000.0));
      $$0.a("Wall uptime", () -> a((double)(System.currentTimeMillis() - this.bx) / 1000.0));
      $$0.a("High-res time", () -> a((double)ac.c() / 1000.0));
      $$0.a("Client ticks", () -> String.format(Locale.ROOT, "%d ticks / %.3fs", this.by, (double)this.by / 20.0));
   }

   private static ab a(ab $$0, @Nullable ffn $$1, @Nullable gqq $$2, String $$3, @Nullable ffr $$4) {
      $$0.a("Launched Version", () -> $$3);
      String $$5 = be();
      if ($$5 != null) {
         $$0.a("Launcher name", $$5);
      }

      $$0.a("Backend library", RenderSystem::getBackendDescription);
      $$0.a("Backend API", RenderSystem::getApiDescription);
      $$0.a("Window size", () -> $$1 != null ? $$1.Q.k() + "x" + $$1.Q.l() : "<not initialized>");
      $$0.a("GL Caps", RenderSystem::getCapsString);
      $$0.a("GL debug messages", () -> eyy.b() ? String.join("\n", eyy.a()) : "<disabled>");
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
         $$0.a("Resource Packs", () -> atf.a($$1.ac().f()));
      }

      if ($$2 != null) {
         $$0.a("Current Language", () -> $$2.a());
      }

      $$0.a("Locale", String.valueOf(Locale.getDefault()));
      $$0.a("CPU", eyz::b);
      return $$0;
   }

   public static ffn Q() {
      return E;
   }

   public CompletableFuture<Void> R() {
      return this.a(this::l).thenCompose($$0 -> (CompletionStage<Void>)$$0);
   }

   public void a(fzj $$0) {
      if (!this.bt.a($$0)) {
         this.bt = fzm.a($$0, this.aw);
      }
   }

   @Nullable
   public fyr S() {
      return x.a(this.L(), fye::w);
   }

   public boolean T() {
      return this.aQ;
   }

   public boolean U() {
      return this.aQ && this.aO != null;
   }

   @Nullable
   public gtk V() {
      return this.aO;
   }

   public boolean W() {
      gtk $$0 = this.V();
      return $$0 != null && !$$0.r();
   }

   public boolean b(UUID $$0) {
      return $$0.equals(this.X().b());
   }

   public fgb X() {
      return this.V;
   }

   public GameProfile Y() {
      ProfileResult $$0 = this.M.join();
      return $$0 != null ? $$0.profile() : new GameProfile(this.V.b(), this.V.c());
   }

   public Proxy Z() {
      return this.ab;
   }

   public gpj aa() {
      return this.N;
   }

   public atu ab() {
      return this.ag;
   }

   public atf ac() {
      return this.aj;
   }

   public ask ad() {
      return this.ah;
   }

   public gry ae() {
      return this.ai;
   }

   public Path af() {
      return this.L;
   }

   public gqq ag() {
      return this.ak;
   }

   public Function<akk, gpi> a(akk $$0) {
      return this.az.a($$0)::a;
   }

   public boolean ah() {
      return this.aS;
   }

   public gdr ai() {
      return this.as;
   }

   public gub aj() {
      return this.ao;
   }

   public avc ak() {
      avc $$0 = x.a(this.y, fnd::D);
      if ($$0 != null) {
         return $$0;
      } else if (this.s != null) {
         if (this.s.dP().af() == dcd.j) {
            return this.l.j().b() ? avd.d : avd.e;
         } else {
            jj<ddd> $$1 = this.s.dP().t(this.s.dp());
            if (!this.ap.c(avd.f) && (!this.s.bj() || !$$1.a(avt.Z))) {
               return this.s.dP().af() != dcd.i && this.s.fZ().d && this.s.fZ().c ? avd.b : $$1.a().o().orElse(avd.g);
            } else {
               return avd.f;
            }
         }
      } else {
         return avd.a;
      }
   }

   public MinecraftSessionService al() {
      return this.av;
   }

   public gqj am() {
      return this.ay;
   }

   @Nullable
   public bsd an() {
      return this.t;
   }

   public void a(bsd $$0) {
      this.t = $$0;
      this.j.a($$0);
   }

   public boolean b(bsd $$0) {
      return $$0.cg() || this.s != null && this.s.N_() && this.m.R.e() && $$0.ak() == bsj.by;
   }

   @Override
   protected Thread az() {
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

   public ger ao() {
      return this.aA;
   }

   public gje ap() {
      return this.T;
   }

   public gfw aq() {
      return this.aJ;
   }

   public gke ar() {
      return this.U;
   }

   public DataFixer as() {
      return this.O;
   }

   public float at() {
      return this.R.a;
   }

   public float au() {
      return this.R.b;
   }

   public fgq av() {
      return this.al;
   }

   public boolean aw() {
      return this.s != null && this.s.go() || this.m.V().c();
   }

   public fjw ax() {
      return this.aF;
   }

   public gve aA() {
      return this.aG;
   }

   public boolean aB() {
      return this.be;
   }

   public ffj aC() {
      return this.X;
   }

   public grp aD() {
      return this.az;
   }

   public gqh aE() {
      return this.aB;
   }

   public gqg aF() {
      return this.aC;
   }

   public gqf aG() {
      return this.aD;
   }

   public fha aH() {
      return this.aE;
   }

   @Override
   public void a(boolean $$0) {
      this.be = $$0;
   }

   public wu a(File $$0, int $$1, int $$2) {
      int $$3 = this.Q.k();
      int $$4 = this.Q.l();
      eys $$5 = new eyt($$1, $$2, true, a);
      float $$6 = this.s.dH();
      float $$7 = this.s.dF();
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

            this.s.O = this.s.dF();
            this.s.P = this.s.dH();
            $$5.a(true);
            this.j.a(1.0F, 0L);

            try {
               Thread.sleep(10L);
            } catch (InterruptedException var17) {
            }

            ffx.a($$0, "panorama_" + $$10 + ".png", $$5, $$0x -> {
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
         ByteBuffer $$5 = eyz.a($$1 * $$2 * 3);
         ffx $$6 = new ffx($$0, $$3, $$4, $$2);
         float $$7 = (float)$$3 / (float)$$1;
         float $$8 = (float)$$4 / (float)$$2;
         float $$9 = $$7 > $$8 ? $$7 : $$8;

         for (int $$10 = ($$4 - 1) / $$2 * $$2; $$10 >= 0; $$10 -= $$2) {
            for (int $$11 = 0; $$11 < $$3; $$11 += $$1) {
               RenderSystem.setShaderTexture(0, gph.e);
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
         eyz.a($$5);
         wu $$15 = wu.b($$14.getName()).a(n.t).a($$1x -> $$1x.a(new ws(ws.a.b, $$14.getAbsolutePath())));
         return wu.a("screenshot.success", $$15);
      } catch (Exception var15) {
         F.warn("Couldn't save screenshot", var15);
         return wu.a("screenshot.failure", var15.getMessage());
      }
   }

   public bmr aI() {
      return this.bi;
   }

   @Nullable
   public aqx aJ() {
      return this.W.get();
   }

   public gqk aK() {
      return this.ar;
   }

   @Nullable
   public fmx aL() {
      return this.aX;
   }

   public frs aM() {
      return this.aH;
   }

   public boolean aN() {
      return false;
   }

   public ezk aO() {
      return this.Q;
   }

   public fhu aP() {
      return this.l.k();
   }

   public ged aQ() {
      return this.S;
   }

   public void b(int $$0) {
      this.az.a($$0);
   }

   public fxe aR() {
      return this.aI;
   }

   public boolean aS() {
      return this.br().flag(UserFlag.PROFANITY_FILTER_ENABLED);
   }

   public void aT() {
      this.aH.a();
      this.w().a();
   }

   @Nullable
   public ayr aU() {
      return ayr.a(this.au.getServicesKeySet(), ServicesKeyType.PROFILE_KEY);
   }

   public boolean aV() {
      return !this.au.getServicesKeySet().keys(ServicesKeyType.PROFILE_KEY).isEmpty();
   }

   public ffk aW() {
      return this.Y;
   }

   public void a(ffk $$0) {
      this.Y = $$0;
   }

   public fff aX() {
      return this.br;
   }

   public fyx aY() {
      return this.bs;
   }

   public fzm aZ() {
      return this.bt;
   }

   public fcm ba() {
      return this.aM;
   }

   public gdh bb() {
      return this.aN;
   }

   public ffc bc() {
      return this.bu;
   }

   public evp bd() {
      return this.bv;
   }

   private float a(float $$0) {
      if (this.r != null) {
         bqo $$1 = this.r.s();
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
      d(wu.a("chat.disabled.profile", wu.d(ffn.E.m.J.h())).a(n.m)) {
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

   static record b(faw a, fsy.c b) {
   }
}
