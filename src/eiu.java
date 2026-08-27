import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.util.concurrent.RateLimiter;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class eiu extends gan {
   static final Logger a = LogUtils.getLogger();
   private static final acq b = new acq("realms", "textures/gui/realms/on_icon.png");
   private static final acq c = new acq("realms", "textures/gui/realms/off_icon.png");
   private static final acq G = new acq("realms", "textures/gui/realms/expired_icon.png");
   private static final acq H = new acq("realms", "textures/gui/realms/expires_soon_icon.png");
   static final acq I = new acq("realms", "textures/gui/realms/invitation_icons.png");
   static final acq J = new acq("realms", "textures/gui/realms/invite_icon.png");
   static final acq K = new acq("realms", "textures/gui/realms/world_icon.png");
   private static final acq L = new acq("realms", "textures/gui/title/realms.png");
   private static final acq M = new acq("realms", "textures/gui/realms/news_icon.png");
   private static final acq N = new acq("realms", "textures/gui/realms/popup.png");
   private static final acq O = new acq("realms", "textures/gui/realms/darken.png");
   static final acq P = new acq("realms", "textures/gui/realms/cross_icon.png");
   private static final acq Q = new acq("realms", "textures/gui/realms/trial_icon.png");
   static final acq R = new acq("minecraft", "textures/gui/info_icon.png");
   static final List<sw> S = ImmutableList.of(sw.c("mco.trial.message.line1"), sw.c("mco.trial.message.line2"));
   static final sw T = sw.c("mco.selectServer.uninitialized");
   static final sw U = sw.c("mco.selectServer.expiredList");
   private static final sw V = sw.c("mco.selectServer.expiredRenew");
   static final sw W = sw.c("mco.selectServer.expiredTrial");
   static final sw X = sw.c("mco.selectServer.minigame").b(sv.t);
   private static final sw Y = sw.c("mco.selectServer.popup");
   private static final sw Z = sw.c("mco.selectServer.play");
   private static final sw aa = sw.c("mco.selectServer.leave");
   private static final sw ab = sw.c("mco.selectServer.configure");
   private static final sw ac = sw.c("mco.selectServer.expired");
   private static final sw ad = sw.c("mco.selectServer.expires.soon");
   private static final sw ae = sw.c("mco.selectServer.expires.day");
   private static final sw af = sw.c("mco.selectServer.open");
   private static final sw ag = sw.c("mco.selectServer.closed");
   private static final sw ah = sw.c("mco.news");
   static final sw ai = sw.a("gui.narrate.button", T);
   static final sw aj = sv.a(S);
   private static final int ak = 100;
   private static final int al = 308;
   private static final int am = 204;
   private static final int an = 64;
   private static final int ao = 128;
   private static final int ap = 34;
   private static final int aq = 128;
   private static final int ar = 64;
   private static final int as = 5;
   private static final int at = 44;
   private static List<acq> au = ImmutableList.of();
   @Nullable
   private elx.c av;
   private eks aw;
   private final Set<UUID> ax = new HashSet<>();
   private static boolean ay;
   private static int az = -1;
   static volatile boolean aA;
   static volatile boolean aB;
   static volatile boolean aC;
   @Nullable
   static euq aD;
   private static boolean aE;
   private final RateLimiter aF;
   private boolean aG;
   final euq aH;
   eiu.h aI;
   private boolean aJ;
   private epi aK;
   private epi aL;
   private epi aM;
   private epi aN;
   private epi aO;
   private List<ejq> aP = ImmutableList.of();
   volatile int aQ;
   int aR;
   private boolean aS;
   boolean aT;
   private boolean aU;
   private volatile boolean aV;
   private volatile boolean aW;
   private volatile boolean aX;
   volatile boolean aY;
   @Nullable
   volatile String aZ;
   private int ba;
   private int bb;
   private boolean bc;
   private List<eit> bd;
   long be;
   private ReentrantLock bf = new ReentrantLock();
   private epz bg = epz.a;
   private final List<ejp> bh = new ArrayList<>();
   private epi bi;
   private eiu.g bj;
   private epi bk;
   private epi bl;
   private epi bm;
   private epi bn;

   public eiu(euq $$0) {
      super(enf.a);
      this.aH = $$0;
      this.aF = RateLimiter.create(0.016666668F);
   }

   private boolean B() {
      if (C() && this.aS) {
         if (this.aV && !this.aW) {
            return true;
         } else {
            for (ejq $$0 : this.aP) {
               if ($$0.g.equals(this.f.U().b())) {
                  return false;
               }
            }

            return true;
         }
      } else {
         return false;
      }
   }

   public boolean a() {
      if (!C() || !this.aS) {
         return false;
      } else {
         return this.aT ? true : this.aP.isEmpty();
      }
   }

   @Override
   public void b() {
      this.bd = Lists.newArrayList(
         new eit[]{new eit(new char[]{'3', '2', '1', '4', '5', '6'}, () -> ay = !ay), new eit(new char[]{'9', '8', '7', '1', '2', '3'}, () -> {
            if (eiz.a == eiz.b.b) {
               this.M();
            } else {
               this.K();
            }
         }), new eit(new char[]{'9', '8', '7', '4', '5', '6'}, () -> {
            if (eiz.a == eiz.b.c) {
               this.M();
            } else {
               this.L();
            }
         })}
      );
      if (aD != null) {
         this.f.a(aD);
      } else {
         this.bf = new ReentrantLock();
         if (aC && !C()) {
            this.J();
         }

         this.I();
         if (!this.aG) {
            this.f.d(false);
         }

         this.aX = false;
         this.aI = new eiu.h();
         if (az != -1) {
            this.aI.a((double)az);
         }

         this.e(this.aI);
         this.aJ = true;
         this.c(this.aI);
         this.d();
         this.e();
         this.c();
         this.a(null);
         this.bg = epz.a(this.i, Y, 100);
         ekr $$0 = this.f.aX().h;
         this.aY = $$0.a();
         this.aZ = $$0.b();
         if (this.aw == null) {
            this.aw = new eks(this.f);
         }

         if (this.av != null) {
            this.av.a();
         }
      }
   }

   private static boolean C() {
      return aB && aA;
   }

   public void c() {
      this.bj = this.d(new eiu.g());
      this.bk = this.d(new eiu.e());
      this.bi = this.d((epi)epi.a(sw.c("mco.selectServer.purchase"), $$0 -> this.aT = !this.aT).a(this.g - 90, 12, 80, 20).a());
   }

   public void d() {
      this.bl = this.e((epi)epi.a(sw.c("mco.selectServer.trial"), $$0 -> {
         if (this.aV && !this.aW) {
            ac.i().a("https://aka.ms/startjavarealmstrial");
            this.f.a(this.aH);
         }
      }).a(this.g / 2 + 52, this.R() + 137 - 20, 98, 20).a());
      this.bm = this.e(
         (epi)epi.a(sw.c("mco.selectServer.buy"), $$0 -> ac.i().a("https://aka.ms/BuyJavaRealms")).a(this.g / 2 + 52, this.R() + 160 - 20, 98, 20).a()
      );
      this.bn = this.e(new eiu.b());
   }

   public void e() {
      this.aK = epi.a(Z, $$0x -> this.a(this.O(), this)).a(100).a();
      this.aN = epi.a(ab, $$0x -> this.g(this.O())).a(100).a();
      this.aM = epi.a(V, $$0x -> this.f(this.O())).a(100).a();
      this.aO = epi.a(aa, $$0x -> this.h(this.O())).a(100).a();
      this.aL = epi.a(sv.k, $$0x -> {
         if (!this.aU) {
            this.f.a(this.aH);
         }
      }).a(100).a();
      esf $$0 = new esf();
      esf.b $$1 = $$0.d(1);
      esk $$2 = $$1.a(new esk(308, 20, esk.b.a), $$1.b().e(4));
      $$2.a(this.aK);
      $$2.a(this.aN);
      $$2.a(this.aM);
      esk $$3 = $$1.a(new esk(204, 20, esk.b.a), $$1.b().b());
      $$3.a(this.aO);
      $$3.a(this.aL);
      $$0.a($$1x -> {
         epf var10000 = this.d($$1x);
      });
      $$0.c();
      ese.a($$0, 0, this.h - 64, this.g, 64);
   }

   void a(@Nullable ejq $$0) {
      this.aL.r = true;
      if (C() && this.aS) {
         boolean $$1 = this.a() && this.aV && !this.aW;
         this.bl.s = $$1;
         this.bl.r = $$1;
         this.bm.s = this.a();
         this.bn.s = this.a();
         this.bk.r = true;
         this.bk.s = this.aZ != null;
         this.bj.r = true;
         this.bj.s = true;
         this.bi.r = !this.a();
         this.aK.s = !this.a();
         this.aM.s = !this.a();
         this.aO.s = !this.a();
         this.aN.s = !this.a();
         this.aL.s = !this.a();
         this.aK.r = this.b($$0);
         this.aM.r = this.c($$0);
         this.aO.r = this.e($$0);
         this.aN.r = this.d($$0);
      } else {
         a(new epf[]{this.aK, this.aM, this.aN, this.bl, this.bm, this.bn, this.bk, this.bj, this.bi, this.aO});
      }
   }

   private boolean D() {
      return (!this.a() || this.aT) && C() && this.aS;
   }

   boolean b(@Nullable ejq $$0) {
      return $$0 != null && !$$0.j && $$0.e == ejq.b.b;
   }

   private boolean c(@Nullable ejq $$0) {
      return $$0 != null && $$0.j && this.j($$0);
   }

   private boolean d(@Nullable ejq $$0) {
      return $$0 != null && this.j($$0);
   }

   private boolean e(@Nullable ejq $$0) {
      return $$0 != null && !this.j($$0);
   }

   @Override
   public void f() {
      super.f();
      if (this.bj != null) {
         this.bj.a();
      }

      this.aU = false;
      this.aR++;
      boolean $$0 = C();
      if (this.av == null && $$0) {
         this.av = this.a(this.f.aX());
      } else if (this.av != null && !$$0) {
         this.av = null;
      }

      if (this.av != null) {
         this.av.b();
      }

      if (this.a()) {
         this.bb++;
      }

      if (this.bi != null) {
         this.bi.s = this.D();
         this.bi.r = this.bi.s;
      }
   }

   private elx.c a(ekq $$0) {
      elx.c $$1 = $$0.a.a();
      $$1.a($$0.c, $$0x -> {
         List<ejq> $$1x = this.aw.a($$0x);
         boolean $$2 = false;

         for (ejq $$3 : $$1x) {
            if (this.k($$3)) {
               $$2 = true;
            }
         }

         this.aP = $$1x;
         this.aS = true;
         this.E();
         if (!aE && $$2) {
            aE = true;
            this.G();
         }
      });
      a(eiz::f, $$0x -> {
         this.bh.clear();
         this.bh.addAll($$0x);
         this.E();
      });
      $$1.a($$0.e, $$0x -> {
         this.aQ = $$0x;
         if (this.aQ > 0 && this.aF.tryAcquire(1)) {
            this.f.aU().c(sw.a("mco.configure.world.invite.narration", this.aQ));
         }
      });
      $$1.a($$0.f, $$0x -> {
         if (!this.aW) {
            if ($$0x != this.aV && this.a()) {
               this.aV = $$0x;
               this.aX = false;
            } else {
               this.aV = $$0x;
            }
         }
      });
      $$1.a($$0.d, $$0x -> {
         for (eju $$1x : $$0x.a) {
            for (ejq $$2 : this.aP) {
               if ($$2.a == $$1x.a) {
                  $$2.a($$1x);
                  break;
               }
            }
         }
      });
      $$1.a($$0.g, $$1x -> {
         $$0.h.a($$1x);
         this.aY = $$0.h.a();
         this.aZ = $$0.h.b();
         this.a(null);
      });
      return $$1;
   }

   private static <T> void a(eiu.i<T> $$0, Consumer<T> $$1) {
      enn $$2 = enn.N();
      CompletableFuture.<T>supplyAsync(() -> {
         try {
            return $$0.request(eiz.a($$2));
         } catch (ekm var3) {
            throw new RuntimeException(var3);
         }
      }).thenAcceptAsync($$1, $$2).exceptionally($$0x -> {
         a.error("Failed to execute call to Realms Service", $$0x);
         return null;
      });
   }

   private void E() {
      boolean $$0 = !this.aS;
      this.aI.v();
      List<UUID> $$1 = new ArrayList<>();

      for (ejp $$2 : this.bh) {
         this.a(this.aI, $$2);
         if (!$$2.a() && !this.ax.contains($$2.c())) {
            $$1.add($$2.c());
         }
      }

      if (!$$1.isEmpty()) {
         a($$1x -> {
            $$1x.a($$1);
            return null;
         }, $$1x -> this.ax.addAll($$1));
      }

      if (this.B()) {
         this.aI.a(new eiu.k());
      }

      eiu.d $$3 = null;
      ejq $$4 = this.O();

      for (ejq $$5 : this.aP) {
         eiu.j $$6 = new eiu.j($$5);
         this.aI.a($$6);
         if ($$4 != null && $$4.a == $$5.a) {
            $$3 = $$6;
         }
      }

      if ($$0) {
         this.a(null);
      } else {
         this.aI.a($$3);
      }
   }

   private void a(eiu.h $$0, ejp $$1) {
      if ($$1 instanceof ejp.a $$2) {
         $$0.a(new eiu.f($$2.d(), $$2));
         $$0.a(new eiu.a($$2.a(this)));
      }
   }

   void F() {
      if (this.av != null) {
         this.av.c();
      }
   }

   private void G() {
      new Thread(() -> {
         List<eka> $$0 = eiy.a();
         eiz $$1 = eiz.a();
         ejl $$2 = new ejl();
         $$2.a = $$0;
         $$2.b = this.H();

         try {
            $$1.a($$2);
         } catch (Throwable var5) {
            a.warn("Could not send ping result to Realms: ", var5);
         }
      }).start();
   }

   private List<Long> H() {
      List<Long> $$0 = Lists.newArrayList();

      for (ejq $$1 : this.aP) {
         if (this.k($$1)) {
            $$0.add($$1.a);
         }
      }

      return $$0;
   }

   public void a(boolean $$0) {
      this.aW = $$0;
   }

   private void f(@Nullable ejq $$0) {
      if ($$0 != null) {
         String $$1 = anx.a($$0.b, this.f.U().b(), $$0.k);
         this.f.o.a($$1);
         ac.i().a($$1);
      }
   }

   private void I() {
      if (!aC) {
         aC = true;
         (new Thread("MCO Compatability Checker #1") {
            @Override
            public void run() {
               eiz $$0 = eiz.a();

               try {
                  eiz.a $$1 = $$0.j();
                  if ($$1 != eiz.a.a) {
                     eiu.aD = new ekz(eiu.this.aH);
                     eiu.this.f.execute(() -> eiu.this.f.a(eiu.aD));
                     return;
                  }

                  eiu.this.J();
               } catch (ekm var3) {
                  eiu.aC = false;
                  eiu.a.error("Couldn't connect to realms", var3);
                  if (var3.a == 401) {
                     eiu.aD = new ele(sw.c("mco.error.invalid.session.title"), sw.c("mco.error.invalid.session.message"), eiu.this.aH);
                     eiu.this.f.execute(() -> eiu.this.f.a(eiu.aD));
                  } else {
                     eiu.this.f.execute(() -> eiu.this.f.a(new ele(var3, eiu.this.aH)));
                  }
               }
            }
         }).start();
      }
   }

   void J() {
      (new Thread("MCO Compatability Checker #1") {
         @Override
         public void run() {
            eiz $$0 = eiz.a();

            try {
               Boolean $$1 = $$0.h();
               if ($$1) {
                  eiu.a.info("Realms is available for this user");
                  eiu.aA = true;
               } else {
                  eiu.a.info("Realms is not available for this user");
                  eiu.aA = false;
                  eiu.this.f.execute(() -> eiu.this.f.a(new elj(eiu.this.aH)));
               }

               eiu.aB = true;
            } catch (ekm var3) {
               eiu.a.error("Couldn't connect to realms", var3);
               eiu.this.f.execute(() -> eiu.this.f.a(new ele(var3, eiu.this.aH)));
            }
         }
      }).start();
   }

   private void K() {
      if (eiz.a != eiz.b.b) {
         (new Thread("MCO Stage Availability Checker #1") {
            @Override
            public void run() {
               eiz $$0 = eiz.a();

               try {
                  Boolean $$1 = $$0.i();
                  if ($$1) {
                     eiz.b();
                     eiu.a.info("Switched to stage");
                     eiu.this.F();
                  }
               } catch (ekm var3) {
                  eiu.a.error("Couldn't connect to Realms: {}", var3.toString());
               }
            }
         }).start();
      }
   }

   private void L() {
      if (eiz.a != eiz.b.c) {
         (new Thread("MCO Local Availability Checker #1") {
            @Override
            public void run() {
               eiz $$0 = eiz.a();

               try {
                  Boolean $$1 = $$0.i();
                  if ($$1) {
                     eiz.d();
                     eiu.a.info("Switched to local");
                     eiu.this.F();
                  }
               } catch (ekm var3) {
                  eiu.a.error("Couldn't connect to Realms: {}", var3.toString());
               }
            }
         }).start();
      }
   }

   private void M() {
      eiz.c();
      this.F();
   }

   private void g(@Nullable ejq $$0) {
      if ($$0 != null && (this.f.U().b().equals($$0.g) || ay)) {
         this.N();
         this.f.a(new ela(this, $$0.a));
      }
   }

   private void h(@Nullable ejq $$0) {
      if ($$0 != null && !this.f.U().b().equals($$0.g)) {
         this.N();
         sw $$1 = sw.c("mco.configure.world.leave.question.line1");
         sw $$2 = sw.c("mco.configure.world.leave.question.line2");
         this.f.a(new elg($$1x -> this.a($$1x, $$0), elg.a.b, $$1, $$2, true));
      }
   }

   private void N() {
      az = (int)this.aI.l();
   }

   @Nullable
   private ejq O() {
      if (this.aI == null) {
         return null;
      } else {
         eiu.d $$0 = this.aI.f();
         return $$0 != null ? $$0.b() : null;
      }
   }

   private void a(boolean $$0, final ejq $$1) {
      if ($$0) {
         (new Thread("Realms-leave-server") {
            @Override
            public void run() {
               try {
                  eiz $$0 = eiz.a();
                  $$0.d($$1.a);
                  eiu.this.f.execute(() -> eiu.this.i($$1));
               } catch (ekm var2) {
                  eiu.a.error("Couldn't configure world");
                  eiu.this.f.execute(() -> eiu.this.f.a(new ele(var2, eiu.this)));
               }
            }
         }).start();
      }

      this.f.a(this);
   }

   void i(ejq $$0) {
      this.aP = this.aw.a($$0);
      this.aI.i().removeIf($$1 -> {
         ejq $$2 = $$1.b();
         return $$2 != null && $$2.a == $$0.a;
      });
      this.aI.a(null);
      this.a(null);
      this.aK.r = false;
   }

   void a(UUID $$0) {
      a($$1 -> {
         $$1.b(List.of($$0));
         return null;
      }, $$1 -> {
         this.bh.removeIf($$1x -> $$1x.b() && $$0.equals($$1x.c()));
         this.E();
      });
   }

   public void g() {
      if (this.aI != null) {
         this.aI.a(null);
      }
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if ($$0 == 256) {
         this.bd.forEach(eit::a);
         this.P();
         return true;
      } else {
         return super.a($$0, $$1, $$2);
      }
   }

   void P() {
      if (this.a() && this.aT) {
         this.aT = false;
      } else {
         this.f.a(this.aH);
      }
   }

   @Override
   public boolean a(char $$0, int $$1) {
      this.bd.forEach($$1x -> $$1x.a($$0));
      return true;
   }

   @Override
   public void a(eox $$0, int $$1, int $$2, float $$3) {
      this.a($$0);
      this.aI.a($$0, $$1, $$2, $$3);
      $$0.a(L, this.g / 2 - 64, 5, 0.0F, 0.0F, 128, 34, 128, 64);
      if (eiz.a == eiz.b.b) {
         this.d($$0);
      }

      if (eiz.a == eiz.b.c) {
         this.c($$0);
      }

      if (this.a()) {
         $$0.c().a();
         $$0.c().a(0.0F, 0.0F, 100.0F);
         this.c($$0, $$1, $$2, $$3);
         $$0.c().b();
      } else {
         if (this.aX) {
            this.a(null);
            if (!this.aJ) {
               this.e(this.aI);
               this.aJ = true;
            }

            this.aK.r = this.b(this.O());
         }

         this.aX = false;
      }

      super.a($$0, $$1, $$2, $$3);
      if (this.aV && !this.aW && this.a()) {
         int $$4 = 8;
         int $$5 = 8;
         int $$6 = 0;
         if ((ac.b() / 800L & 1L) == 1L) {
            $$6 = 8;
         }

         $$0.c().a();
         $$0.c().a(0.0F, 0.0F, 110.0F);
         $$0.a(Q, this.bl.p() + this.bl.k() - 8 - 4, this.bl.r() + this.bl.h() / 2 - 4, 0.0F, (float)$$6, 8, 8, 8, 16);
         $$0.c().b();
      }
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if (this.a($$0, $$1) && this.aT) {
         this.aT = false;
         this.aU = true;
         return true;
      } else {
         return super.a($$0, $$1, $$2);
      }
   }

   private boolean a(double $$0, double $$1) {
      int $$2 = this.Q();
      int $$3 = this.R();
      return $$0 < (double)($$2 - 5) || $$0 > (double)($$2 + 315) || $$1 < (double)($$3 - 5) || $$1 > (double)($$3 + 171);
   }

   private void c(eox $$0, int $$1, int $$2, float $$3) {
      int $$4 = this.Q();
      int $$5 = this.R();
      if (!this.aX) {
         this.ba = 0;
         this.bb = 0;
         this.bc = true;
         this.a(null);
         if (this.aJ) {
            this.f(this.aI);
            this.aJ = false;
         }

         this.f.aU().c(Y);
      }

      if (this.aS) {
         this.aX = true;
      }

      $$0.a(1.0F, 1.0F, 1.0F, 0.7F);
      RenderSystem.enableBlend();
      $$0.a(O, 0, 44, 0.0F, 0.0F, this.g, this.h - 44, 310, 166);
      RenderSystem.disableBlend();
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
      $$0.a(N, $$4, $$5, 0.0F, 0.0F, 310, 166, 310, 166);
      if (!au.isEmpty()) {
         $$0.a(au.get(this.ba), $$4 + 7, $$5 + 7, 0.0F, 0.0F, 195, 152, 195, 152);
         if (this.bb % 95 < 5) {
            if (!this.bc) {
               this.ba = (this.ba + 1) % au.size();
               this.bc = true;
            }
         } else {
            this.bc = false;
         }
      }

      this.bg.c($$0, this.g / 2 + 52, $$5 + 7, 10, 16777215);
      this.bl.a($$0, $$1, $$2, $$3);
      this.bm.a($$0, $$1, $$2, $$3);
      this.bn.a($$0, $$1, $$2, $$3);
   }

   int Q() {
      return (this.g - 310) / 2;
   }

   int R() {
      return this.h / 2 - 80;
   }

   public void a(@Nullable ejq $$0, euq $$1) {
      if ($$0 != null) {
         try {
            if (!this.bf.tryLock(1L, TimeUnit.SECONDS)) {
               return;
            }

            if (this.bf.getHoldCount() > 1) {
               return;
            }
         } catch (InterruptedException var4) {
            return;
         }

         this.aG = true;
         this.f.a(new elh($$1, new emn(this, $$1, $$0, this.bf)));
      }
   }

   boolean j(ejq $$0) {
      return $$0.g != null && $$0.g.equals(this.f.U().b());
   }

   private boolean k(ejq $$0) {
      return this.j($$0) && !$$0.j;
   }

   void a(eox $$0, int $$1, int $$2, int $$3, int $$4) {
      $$0.a(G, $$1, $$2, 0.0F, 0.0F, 10, 28, 10, 28);
      if ($$3 >= $$1 && $$3 <= $$1 + 9 && $$4 >= $$2 && $$4 <= $$2 + 27 && $$4 < this.h - 40 && $$4 > 32 && !this.a()) {
         this.d(ac);
      }
   }

   void a(eox $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
      if (this.aR % 20 < 10) {
         $$0.a(H, $$1, $$2, 0.0F, 0.0F, 10, 28, 20, 28);
      } else {
         $$0.a(H, $$1, $$2, 10.0F, 0.0F, 10, 28, 20, 28);
      }

      if ($$3 >= $$1 && $$3 <= $$1 + 9 && $$4 >= $$2 && $$4 <= $$2 + 27 && $$4 < this.h - 40 && $$4 > 32 && !this.a()) {
         if ($$5 <= 0) {
            this.d(ad);
         } else if ($$5 == 1) {
            this.d(ae);
         } else {
            this.d(sw.a("mco.selectServer.expires.days", $$5));
         }
      }
   }

   void b(eox $$0, int $$1, int $$2, int $$3, int $$4) {
      $$0.a(b, $$1, $$2, 0.0F, 0.0F, 10, 28, 10, 28);
      if ($$3 >= $$1 && $$3 <= $$1 + 9 && $$4 >= $$2 && $$4 <= $$2 + 27 && $$4 < this.h - 40 && $$4 > 32 && !this.a()) {
         this.d(af);
      }
   }

   void c(eox $$0, int $$1, int $$2, int $$3, int $$4) {
      $$0.a(c, $$1, $$2, 0.0F, 0.0F, 10, 28, 10, 28);
      if ($$3 >= $$1 && $$3 <= $$1 + 9 && $$4 >= $$2 && $$4 <= $$2 + 27 && $$4 < this.h - 40 && $$4 > 32 && !this.a()) {
         this.d(ag);
      }
   }

   void a(eox $$0, int $$1, int $$2, boolean $$3, int $$4, int $$5, boolean $$6, boolean $$7) {
      boolean $$8 = false;
      if ($$1 >= $$4 && $$1 <= $$4 + 20 && $$2 >= $$5 && $$2 <= $$5 + 20) {
         $$8 = true;
      }

      if (!$$7) {
         $$0.a(0.5F, 0.5F, 0.5F, 1.0F);
      }

      boolean $$9 = $$7 && $$6;
      float $$10 = $$9 ? 20.0F : 0.0F;
      $$0.a(M, $$4, $$5, $$10, 0.0F, 20, 20, 40, 20);
      if ($$8 && $$7) {
         this.d(ah);
      }

      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
      if ($$3 && $$7) {
         int $$11 = $$8 ? 0 : (int)(Math.max(0.0F, Math.max(apa.a((float)(10 + this.aR) * 0.57F), apa.b((float)this.aR * 0.35F))) * -6.0F);
         $$0.a(I, $$4 + 10, $$5 + 2 + $$11, 40.0F, 0.0F, 8, 8, 48, 16);
      }
   }

   private void c(eox $$0) {
      String $$1 = "LOCAL!";
      $$0.c().a();
      $$0.c().a((float)(this.g / 2 - 25), 20.0F, 0.0F);
      $$0.c().a(a.f.rotationDegrees(-20.0F));
      $$0.c().b(1.5F, 1.5F, 1.5F);
      $$0.a(this.i, "LOCAL!", 0, 0, 8388479, false);
      $$0.c().b();
   }

   private void d(eox $$0) {
      String $$1 = "STAGE!";
      $$0.c().a();
      $$0.c().a((float)(this.g / 2 - 25), 20.0F, 0.0F);
      $$0.c().a(a.f.rotationDegrees(-20.0F));
      $$0.c().b(1.5F, 1.5F, 1.5F);
      $$0.a(this.i, "STAGE!", 0, 0, -256, false);
      $$0.c().b();
   }

   public eiu h() {
      eiu $$0 = new eiu(this.aH);
      $$0.b(this.f, this.g, this.h);
      return $$0;
   }

   public static void a(akx $$0) {
      Collection<acq> $$1 = $$0.b("textures/gui/images", $$0x -> $$0x.a().endsWith(".png")).keySet();
      au = $$1.stream().filter($$0x -> $$0x.b().equals("realms")).toList();
   }

   class a extends eiu.d {
      private final epi c;
      private final int d = eiu.this.g / 2 - 75;

      public a(epi $$0) {
         this.c = $$0;
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         this.c.a($$0, $$1, $$2);
         return true;
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         return this.c.a($$0, $$1, $$2) ? true : super.a($$0, $$1, $$2);
      }

      @Override
      public void a(eox $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.c.b(this.d, $$2 + 4);
         this.c.a($$0, $$6, $$7, $$9);
      }

      @Override
      public sw a() {
         return this.c.l();
      }
   }

   class b extends eiu.c {
      public b() {
         super(eiu.this.Q() + 4, eiu.this.R() + 4, $$1 -> eiu.this.P(), sw.c("mco.selectServer.close"));
      }
   }

   static class c extends epi {
      protected c(epi.c $$0, sw $$1) {
         this(0, 0, $$0, $$1);
      }

      protected c(int $$0, int $$1, epi.c $$2, sw $$3) {
         super($$0, $$1, 14, 14, $$3, $$2, x);
         this.a(eqp.a($$3));
      }

      @Override
      public void b(eox $$0, int $$1, int $$2, float $$3) {
         float $$4 = this.n() ? 14.0F : 0.0F;
         $$0.a(eiu.P, this.p(), this.r(), 0.0F, $$4, 14, 14, 14, 28);
      }
   }

   abstract class d extends eqc.a<eiu.d> {
      @Nullable
      public ejq b() {
         return null;
      }
   }

   class e extends epi {
      private static final int b = 20;

      public e() {
         super(eiu.this.g - 115, 12, 20, 20, sw.c("mco.news"), $$1 -> {
            if (eiu.this.aZ != null) {
               etj.a(eiu.this.aZ, eiu.this, true);
               if (eiu.this.aY) {
                  emd.a $$2 = emd.b();
                  $$2.b = false;
                  eiu.this.aY = false;
                  emd.b($$2);
               }
            }
         }, x);
      }

      @Override
      public void b(eox $$0, int $$1, int $$2, float $$3) {
         eiu.this.a($$0, $$1, $$2, eiu.this.aY, this.p(), this.r(), this.n(), this.r);
      }
   }

   class f extends eiu.d {
      private static final int c = 40;
      private static final int d = 36;
      private static final int e = -12303292;
      private final sw f;
      private final List<epf> g = new ArrayList<>();
      @Nullable
      private final eiu.c h;
      private final eqa i;
      private final esf j;
      private final ese k;
      private int l = -1;

      public f(sw $$0, ejp $$1) {
         this.f = $$0;
         this.j = new esf();
         int $$2 = 7;
         this.j.a(new epu(20, 20, eiu.R), 0, 0, this.j.a().a(7, 7, 0, 0));
         this.j.a(esl.a(40), 0, 0);
         this.k = this.j.a(new ese(0, 9 * 3), 0, 1, this.j.a().c(7));
         this.i = this.k.a(new eqa($$0, eiu.this.i).b(true).j(3), this.k.a().b().d());
         this.j.a(esl.a(40), 0, 2);
         if ($$1.b()) {
            this.h = this.j.a(new eiu.c($$1x -> eiu.this.a($$1.c()), sw.c("mco.notification.dismiss")), 0, 2, this.j.a().c().a(0, 7, 7, 0));
         } else {
            this.h = null;
         }

         this.j.a(this.g::add);
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         return this.h != null && this.h.a($$0, $$1, $$2) ? true : super.a($$0, $$1, $$2);
      }

      private void a(int $$0) {
         if (this.l != $$0) {
            this.b($$0);
            this.l = $$0;
         }
      }

      private void b(int $$0) {
         int $$1 = $$0 - 80;
         this.k.b($$1);
         this.i.i($$1);
         this.j.c();
      }

      @Override
      public void b(eox $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         super.b($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
         $$0.b($$3 - 2, $$2 - 2, $$4, 70, -12303292);
      }

      @Override
      public void a(eox $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.j.b($$3, $$2);
         this.a($$4 - 4);
         this.g.forEach($$4x -> $$4x.a($$0, $$6, $$7, $$9));
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         if (this.h != null) {
            this.h.a($$0, $$1, $$2);
         }

         return true;
      }

      @Override
      public sw a() {
         return this.f;
      }
   }

   class g extends ept {
      private static final sw C = sw.c("mco.invites.title");
      private static final eqp D = eqp.a(sw.c("mco.invites.nopending"));
      private static final eqp E = eqp.a(sw.c("mco.invites.pending"));
      private static final int F = 18;
      private static final int G = 15;
      private static final int H = 10;
      private static final int I = 8;
      private static final int J = 8;
      private static final int K = 11;

      public g() {
         super(eiu.this.g / 2 + 64 + 10, 15, 18, 15, 0, 0, 15, eiu.J, 18, 30, $$1 -> eiu.this.f.a(new elk(eiu.this.aH, C)), C);
         this.a(D);
      }

      @Override
      public void a() {
         this.a(eiu.this.aQ == 0 ? D : E);
      }

      @Override
      public void b(eox $$0, int $$1, int $$2, float $$3) {
         super.b($$0, $$1, $$2, $$3);
         this.a($$0);
      }

      private void a(eox $$0) {
         boolean $$1 = this.r && eiu.this.aQ != 0;
         if ($$1) {
            int $$2 = (Math.min(eiu.this.aQ, 6) - 1) * 8;
            int $$3 = (int)(Math.max(0.0F, Math.max(apa.a((float)(10 + eiu.this.aR) * 0.57F), apa.b((float)eiu.this.aR * 0.35F))) * -6.0F);
            float $$4 = this.n() ? 8.0F : 0.0F;
            $$0.a(eiu.I, this.p() + 11, this.r() + $$3, (float)$$2, $$4, 8, 8, 48, 16);
         }
      }
   }

   class h extends gam<eiu.d> {
      public h() {
         super(eiu.this.g, eiu.this.h, 44, eiu.this.h - 64, 36);
      }

      public void a(@Nullable eiu.d $$0) {
         super.a($$0);
         if ($$0 != null) {
            eiu.this.a($$0.b());
         } else {
            eiu.this.a(null);
         }
      }

      @Override
      public int a() {
         return this.k() * 36;
      }

      @Override
      public int b() {
         return 300;
      }
   }

   interface i<T> {
      T request(eiz var1) throws ekm;
   }

   class j extends eiu.d {
      private static final int c = 36;
      private final ejq d;

      public j(ejq $$0) {
         this.d = $$0;
      }

      @Override
      public void a(eox $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a(this.d, $$0, $$3, $$2, $$6, $$7);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         if (this.d.e == ejq.b.c) {
            eiu.this.f.a(new elc(this.d, eiu.this));
         } else if (eiu.this.b(this.d)) {
            if (ac.b() - eiu.this.be < 250L && this.aB_()) {
               eiu.this.f.ah().a(fxt.a(amh.yo, 1.0F));
               eiu.this.a(this.d, eiu.this);
            }

            eiu.this.be = ac.b();
         }

         return true;
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         if (esu.a($$0) && eiu.this.b(this.d)) {
            eiu.this.f.ah().a(fxt.a(amh.yo, 1.0F));
            eiu.this.a(this.d, eiu.this);
            return true;
         } else {
            return super.a($$0, $$1, $$2);
         }
      }

      private void a(ejq $$0, eox $$1, int $$2, int $$3, int $$4, int $$5) {
         this.b($$0, $$1, $$2 + 36, $$3, $$4, $$5);
      }

      private void b(ejq $$0, eox $$1, int $$2, int $$3, int $$4, int $$5) {
         if ($$0.e == ejq.b.c) {
            $$1.a(eiu.K, $$2 + 10, $$3 + 6, 0.0F, 0.0F, 40, 20, 40, 20);
            float $$6 = 0.5F + (1.0F + apa.a((float)eiu.this.aR * 0.25F)) * 0.25F;
            int $$7 = 0xFF000000 | (int)(127.0F * $$6) << 16 | (int)(255.0F * $$6) << 8 | (int)(127.0F * $$6);
            $$1.a(eiu.this.i, eiu.T, $$2 + 10 + 40 + 75, $$3 + 12, $$7);
         } else {
            int $$8 = 225;
            int $$9 = 2;
            this.a($$0, $$1, $$2, $$3, $$4, $$5, 225, 2);
            if (!"0".equals($$0.r.a)) {
               String $$10 = n.h + $$0.r.a;
               $$1.a(eiu.this.i, $$10, $$2 + 207 - eiu.this.i.b($$10), $$3 + 3, 8421504, false);
               if ($$4 >= $$2 + 207 - eiu.this.i.b($$10)
                  && $$4 <= $$2 + 207
                  && $$5 >= $$3 + 1
                  && $$5 <= $$3 + 10
                  && $$5 < eiu.this.h - 40
                  && $$5 > 32
                  && !eiu.this.a()) {
                  eiu.this.d(sw.b($$0.r.b));
               }
            }

            if (eiu.this.j($$0) && $$0.j) {
               sw $$11 = $$0.k ? eiu.W : eiu.U;
               int $$12 = $$3 + 11 + 5;
               $$1.a(eiu.this.i, $$11, $$2 + 2, $$12 + 1, 15553363, false);
            } else {
               if ($$0.m == ejq.c.b) {
                  int $$13 = 13413468;
                  int $$14 = eiu.this.i.a(eiu.X);
                  $$1.a(eiu.this.i, eiu.X, $$2 + 2, $$3 + 12, 13413468, false);
                  $$1.a(eiu.this.i, $$0.c(), $$2 + 2 + $$14, $$3 + 12, 7105644, false);
               } else {
                  $$1.a(eiu.this.i, $$0.a(), $$2 + 2, $$3 + 12, 7105644, false);
               }

               if (!eiu.this.j($$0)) {
                  $$1.a(eiu.this.i, $$0.f, $$2 + 2, $$3 + 12 + 11, 5000268, false);
               }
            }

            $$1.a(eiu.this.i, $$0.b(), $$2 + 2, $$3 + 1, 16777215, false);
            emf.a($$1, $$2 - 36, $$3, 32, $$0.g);
         }
      }

      private void a(ejq $$0, eox $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7) {
         int $$8 = $$2 + $$6 + 22;
         if ($$0.j) {
            eiu.this.a($$1, $$8, $$3 + $$7, $$4, $$5);
         } else if ($$0.e == ejq.b.a) {
            eiu.this.c($$1, $$8, $$3 + $$7, $$4, $$5);
         } else if (eiu.this.j($$0) && $$0.l < 7) {
            eiu.this.a($$1, $$8, $$3 + $$7, $$4, $$5, $$0.l);
         } else if ($$0.e == ejq.b.b) {
            eiu.this.b($$1, $$8, $$3 + $$7, $$4, $$5);
         }
      }

      @Override
      public sw a() {
         return (sw)(this.d.e == ejq.b.c ? eiu.ai : sw.a("narrator.select", this.d.c));
      }

      @Nullable
      @Override
      public ejq b() {
         return this.d;
      }
   }

   class k extends eiu.d {
      @Override
      public void a(eox $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, $$1, $$3, $$2, $$6, $$7);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         eiu.this.aT = true;
         return true;
      }

      private void a(eox $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
         int $$6 = $$3 + 8;
         int $$7 = 0;
         boolean $$8 = false;
         if ($$2 <= $$4 && $$4 <= (int)eiu.this.aI.l() && $$3 <= $$5 && $$5 <= $$3 + 32) {
            $$8 = true;
         }

         int $$9 = 8388479;
         if ($$8 && !eiu.this.a()) {
            $$9 = 6077788;
         }

         for (sw $$10 : eiu.S) {
            $$0.a(eiu.this.i, $$10, eiu.this.g / 2, $$6 + $$7, $$9);
            $$7 += 10;
         }
      }

      @Override
      public sw a() {
         return eiu.aj;
      }
   }
}
