import com.google.common.collect.Lists;
import com.google.common.util.concurrent.RateLimiter;
import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;

public class fae extends gvb {
   static final alb a = new alb("icon/info");
   static final alb b = new alb("icon/new_realm");
   static final alb c = new alb("realm_status/expired");
   static final alb B = new alb("realm_status/expires_soon");
   static final alb C = new alb("realm_status/open");
   static final alb D = new alb("realm_status/closed");
   private static final alb E = new alb("icon/invite");
   private static final alb F = new alb("icon/news");
   static final Logger G = LogUtils.getLogger();
   private static final alb H = new alb("textures/gui/title/realms.png");
   private static final alb I = new alb("textures/gui/realms/no_realms.png");
   private static final xl J = xl.c("menu.online");
   private static final xl K = xl.c("mco.selectServer.loading");
   static final xl L = xl.c("mco.selectServer.uninitialized");
   static final xl M = xl.c("mco.selectServer.expiredList");
   private static final xl N = xl.c("mco.selectServer.expiredRenew");
   static final xl O = xl.c("mco.selectServer.expiredTrial");
   private static final xl P = xl.c("mco.selectServer.play");
   private static final xl Q = xl.c("mco.selectServer.leave");
   private static final xl R = xl.c("mco.selectServer.configure");
   static final xl S = xl.c("mco.selectServer.expired");
   static final xl T = xl.c("mco.selectServer.expires.soon");
   static final xl U = xl.c("mco.selectServer.expires.day");
   static final xl V = xl.c("mco.selectServer.open");
   static final xl W = xl.c("mco.selectServer.closed");
   static final xl X = xl.a("gui.narrate.button", L);
   private static final xl Y = xl.c("mco.selectServer.noRealms");
   private static final xl Z = xl.c("mco.invites.nopending");
   private static final xl aa = xl.c("mco.invites.pending");
   private static final int ab = 100;
   private static final int ac = 3;
   private static final int ad = 4;
   private static final int ae = 308;
   private static final int af = 128;
   private static final int ag = 34;
   private static final int ah = 128;
   private static final int ai = 64;
   private static final int aj = 5;
   private static final int ak = 44;
   private static final int al = 11;
   private static final int am = 40;
   private static final int an = 20;
   private static final int ao = 216;
   private static final int ap = 36;
   private static final boolean aq = !aa.b().g();
   private static boolean ar = aq;
   private final CompletableFuture<fad.a> as = fad.a();
   @Nullable
   private fdi.c at;
   private final Set<UUID> au = new HashSet<>();
   private static boolean av;
   private final RateLimiter aw;
   private final fmy ax;
   private fgz ay;
   private fgz az;
   private fgz aA;
   private fgz aB;
   private fgz aC;
   fae.j aD;
   private fcb aE;
   private List<fba> aF = List.of();
   private volatile boolean aG;
   @Nullable
   private volatile String aH;
   long aI;
   private final List<faz> aJ = new ArrayList<>();
   private fgz aK;
   private fae.g aL;
   private fae.g aM;
   private fae.f aN;
   @Nullable
   private fkm aO;

   public fae(fmy $$0) {
      super(J);
      this.ax = $$0;
      this.aw = RateLimiter.create(0.016666668F);
   }

   @Override
   public void aN_() {
      this.aE = new fcb(this.m);
      this.aD = new fae.j();
      xl $$0 = xl.c("mco.invites.title");
      this.aL = new fae.g($$0, E, $$1x -> this.m.a(new fcu(this, $$0)));
      xl $$1 = xl.c("mco.news");
      this.aM = new fae.g($$1, F, $$0x -> {
         String $$1x = this.aH;
         if ($$1x != null) {
            flp.a(this, $$1x);
            if (this.aM.a() != 0) {
               fdo.a $$2 = fdo.b();
               $$2.b = false;
               fdo.b($$2);
               this.aM.a(0);
            }
         }
      });
      this.aM.a(fik.a($$1));
      this.ay = fgz.a(P, $$0x -> a(this.M(), this)).a(100).a();
      this.aB = fgz.a(R, $$0x -> this.f(this.M())).a(100).a();
      this.aA = fgz.a(N, $$0x -> this.e(this.M())).a(100).a();
      this.aC = fgz.a(Q, $$0x -> this.g(this.M())).a(100).a();
      this.aK = fgz.a(xl.c("mco.selectServer.purchase"), $$0x -> this.N()).b(100, 20).a();
      this.az = fgz.a(xk.k, $$0x -> this.d()).a(100).a();
      if (faj.a == faj.b.b) {
         this.c(fhg.a(xl.b("Snapshot"), xl.b("Release")).a(5, 5, 100, 20, xl.b("Realm"), ($$0x, $$1x) -> {
            ar = $$1x;
            this.aF = List.of();
            this.I();
         }));
      }

      this.a(fae.f.a);
      this.F();
      this.as.thenAcceptAsync($$0x -> {
         fmy $$1x = $$0x.a(this.ax);
         if ($$1x == null) {
            this.at = this.a(this.m.ba());
         } else {
            this.m.a($$1x);
         }
      }, this.q);
   }

   public static boolean b() {
      return aq && ar;
   }

   @Override
   protected void c() {
      if (this.aO != null) {
         this.aD.a(this.n, this.aO);
         this.aO.a();
      }
   }

   @Override
   public void d() {
      this.m.a(this.ax);
   }

   private void C() {
      if (this.aE.a() && this.aF.isEmpty() && this.aJ.isEmpty()) {
         this.a(fae.f.b);
      } else {
         this.a(fae.f.c);
      }
   }

   private void a(fae.f $$0) {
      if (this.aN != $$0) {
         if (this.aO != null) {
            this.aO.a($$1 -> this.e($$1));
         }

         this.aO = this.b($$0);
         this.aN = $$0;
         this.aO.a($$1 -> {
            fgx var10000 = this.c($$1);
         });
         this.c();
      }
   }

   private fkm b(fae.f $$0) {
      fkm $$1 = new fkm(this);
      $$1.b(44);
      $$1.a(this.D());
      fkn $$2 = this.c($$0);
      $$2.a();
      $$1.a($$2.v() + 22);
      $$1.b($$2);
      switch ($$0) {
         case a:
            $$1.c(new fho(this.p, K));
            break;
         case b:
            $$1.c(this.E());
            break;
         case c:
            $$1.c(this.aD);
      }

      return $$1;
   }

   private fkn D() {
      int $$0 = 90;
      fkq $$1 = fkq.e().a(4);
      $$1.c().e();
      $$1.a(this.aL);
      $$1.a(this.aM);
      fkq $$2 = fkq.e();
      $$2.c().e();
      $$2.a(fkr.a(90));
      $$2.a(fhm.a(128, 34, H, 128, 64), fkp::b);
      $$2.a(new fkk(90, 44)).a($$1, fkp::c);
      return $$2;
   }

   private fkn c(fae.f $$0) {
      fkl $$1 = new fkl().c(4);
      fkl.b $$2 = $$1.d(3);
      if ($$0 == fae.f.c) {
         $$2.a(this.ay);
         $$2.a(this.aB);
         $$2.a(this.aA);
         $$2.a(this.aC);
      }

      $$2.a(this.aK);
      $$2.a(this.az);
      return $$1;
   }

   private fkq E() {
      fkq $$0 = fkq.d().a(8);
      $$0.c().b();
      $$0.a(fhm.a(130, 64, I, 130, 64));
      fhk $$1 = new fhk(308, Y, this.p, false, 4);
      $$0.a($$1);
      return $$0;
   }

   void F() {
      fba $$0 = this.M();
      this.aK.j = this.aN != fae.f.a;
      this.ay.j = $$0 != null && this.a($$0);
      this.aA.j = $$0 != null && this.b($$0);
      this.aC.j = $$0 != null && this.d($$0);
      this.aB.j = $$0 != null && this.c($$0);
   }

   boolean a(fba $$0) {
      boolean $$1 = !$$0.j && $$0.e == fba.c.b;
      return $$1 && ($$0.d() || this.h($$0));
   }

   private boolean b(fba $$0) {
      return $$0.j && this.h($$0);
   }

   private boolean c(fba $$0) {
      return this.h($$0) && $$0.e != fba.c.c;
   }

   private boolean d(fba $$0) {
      return !this.h($$0);
   }

   @Override
   public void e() {
      super.e();
      if (this.at != null) {
         this.at.b();
      }
   }

   public static void f() {
      ffa.Q().ba().d.a();
   }

   public static void g() {
      ffa.Q().ba().c.a();
   }

   private void I() {
      for (fdi.e<?> $$0 : this.m.ba().a()) {
         $$0.a();
      }
   }

   private fdi.c a(fbz $$0) {
      fdi.c $$1 = $$0.a.a();
      $$1.a($$0.c, $$0x -> {
         this.aE.a($$0x.a());
         this.aF = $$0x.b();
         this.J();
         boolean $$1x = false;

         for (fba $$2 : this.aE) {
            if (this.i($$2)) {
               $$1x = true;
            }
         }

         if (!av && $$1x) {
            av = true;
            this.K();
         }
      });
      a(faj::d, $$0x -> {
         this.aJ.clear();
         this.aJ.addAll($$0x);

         for (faz $$1x : $$0x) {
            if ($$1x instanceof faz.a $$2) {
               fib $$3 = $$2.a(this, this::a);
               if ($$3 != null) {
                  this.m.a($$3);
                  this.a(List.of($$1x));
                  break;
               }
            }
         }

         if (!this.aJ.isEmpty() && this.aN != fae.f.a) {
            this.J();
         }
      });
      $$1.a($$0.d, $$0x -> {
         this.aL.a($$0x);
         this.aL.a($$0x == 0 ? fik.a(Z) : fik.a(aa));
         if ($$0x > 0 && this.aw.tryAcquire(1)) {
            this.m.aX().c(xl.a("mco.configure.world.invite.narration", $$0x));
         }
      });
      $$1.a($$0.e, $$0x -> this.aG = $$0x);
      $$1.a($$0.f, $$1x -> {
         $$0.g.a($$1x);
         this.aH = $$0.g.b();
         this.aM.a($$0.g.a() ? Integer.MAX_VALUE : 0);
      });
      return $$1;
   }

   private void a(Collection<faz> $$0) {
      List<UUID> $$1 = new ArrayList<>($$0.size());

      for (faz $$2 : $$0) {
         if (!$$2.a() && !this.au.contains($$2.c())) {
            $$1.add($$2.c());
         }
      }

      if (!$$1.isEmpty()) {
         a($$1x -> {
            $$1x.a($$1);
            return null;
         }, $$1x -> this.au.addAll($$1));
      }
   }

   private static <T> void a(fae.k<T> $$0, Consumer<T> $$1) {
      ffa $$2 = ffa.Q();
      CompletableFuture.<T>supplyAsync(() -> {
         try {
            return $$0.request(faj.a($$2));
         } catch (fbw var3) {
            throw new RuntimeException(var3);
         }
      }).thenAcceptAsync($$1, $$2).exceptionally($$0x -> {
         G.error("Failed to execute call to Realms Service", $$0x);
         return null;
      });
   }

   private void J() {
      fba $$0 = this.M();
      this.aD.I();

      for (faz $$1 : this.aJ) {
         if (this.a($$1)) {
            this.a(List.of($$1));
            break;
         }
      }

      for (fba $$2 : this.aF) {
         this.aD.a(new fae.a($$2));
      }

      for (fba $$3 : this.aE) {
         fae.e $$4;
         if (b() && !$$3.h()) {
            if ($$3.e == fba.c.c) {
               continue;
            }

            $$4 = new fae.i($$3);
         } else {
            $$4 = new fae.l($$3);
         }

         this.aD.a((fae.e)$$4);
         if ($$0 != null && $$0.a == $$3.a) {
            this.aD.a($$4);
         }
      }

      this.C();
      this.F();
   }

   private boolean a(faz $$0) {
      if (!($$0 instanceof faz.c $$1)) {
         return false;
      } else {
         xl $$2 = $$1.d();
         int $$3 = this.p.b($$2, 216);
         int $$4 = ayu.e($$3 + 7, 36) - 1;
         this.aD.a(new fae.h($$2, $$4 + 2, $$1));

         for (int $$5 = 0; $$5 < $$4; $$5++) {
            this.aD.a(new fae.d());
         }

         this.aD.a(new fae.b($$1.a(this)));
         return true;
      }
   }

   private void K() {
      new Thread(() -> {
         List<fbk> $$0 = fai.a();
         faj $$1 = faj.a();
         fav $$2 = new fav();
         $$2.a = $$0;
         $$2.b = this.L();

         try {
            $$1.a($$2);
         } catch (Throwable var5) {
            G.warn("Could not send ping result to Realms: ", var5);
         }
      }).start();
   }

   private List<Long> L() {
      List<Long> $$0 = Lists.newArrayList();

      for (fba $$1 : this.aE) {
         if (this.i($$1)) {
            $$0.add($$1.a);
         }
      }

      return $$0;
   }

   private void e(@Nullable fba $$0) {
      if ($$0 != null) {
         String $$1 = axq.a($$0.b, this.m.X().b(), $$0.k);
         this.m.o.a($$1);
         ac.k().a($$1);
      }
   }

   private void f(@Nullable fba $$0) {
      if ($$0 != null && this.m.b($$0.g)) {
         this.m.a(new fcj(this, $$0.a));
      }
   }

   private void g(@Nullable fba $$0) {
      if ($$0 != null && !this.m.b($$0.g)) {
         xl $$1 = xl.c("mco.configure.world.leave.question.line1");
         xl $$2 = xl.c("mco.configure.world.leave.question.line2");
         this.m.a(new fcp($$1x -> this.a($$1x, $$0), fcp.a.b, $$1, $$2, true));
      }
   }

   @Nullable
   private fba M() {
      return this.aD.h() instanceof fae.l $$0 ? $$0.c() : null;
   }

   private void a(boolean $$0, final fba $$1) {
      if ($$0) {
         (new Thread("Realms-leave-server") {
            @Override
            public void run() {
               try {
                  faj $$0 = faj.a();
                  $$0.d($$1.a);
                  fae.this.m.execute(fae::g);
               } catch (fbw var2) {
                  fae.G.error("Couldn't configure world", var2);
                  fae.this.m.execute(() -> fae.this.m.a(new fcn(var2, fae.this)));
               }
            }
         }).start();
      }

      this.m.a(this);
   }

   void a(UUID $$0) {
      a($$1 -> {
         $$1.b(List.of($$0));
         return null;
      }, $$1 -> {
         this.aJ.removeIf($$1x -> $$1x.b() && $$0.equals($$1x.c()));
         this.J();
      });
   }

   public void h() {
      this.aD.a(null);
      g();
   }

   @Override
   public xl i() {
      return (xl)(switch (this.aN) {
         case a -> xk.a(super.i(), K);
         case b -> xk.a(super.i(), Y);
         case c -> super.i();
      });
   }

   @Override
   public void a(fgm $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (b()) {
         $$0.b(this.p, "Minecraft " + aa.b().c(), 2, this.o - 10, -1);
      }

      if (this.aG && this.aK.j) {
         fcw.a($$0, this.aK);
      }

      switch (faj.a) {
         case b:
            this.a($$0, "STAGE!", -256);
            break;
         case c:
            this.a($$0, "LOCAL!", 8388479);
      }
   }

   private void N() {
      this.m.a(new fcw(this, this.aG));
   }

   public static void a(@Nullable fba $$0, fmy $$1) {
      a($$0, $$1, false);
   }

   public static void a(@Nullable fba $$0, fmy $$1, boolean $$2) {
      if ($$0 != null) {
         if (!b() || $$2) {
            ffa.Q().a(new fcq($$1, new fdz($$1, $$0)));
            return;
         }

         switch ($$0.u) {
            case e:
               ffa.Q().a(new fcq($$1, new fdz($$1, $$0)));
               break;
            case a:
               a($$0, $$1, xl.c("mco.compatibility.unverifiable.title").b(-171), xl.c("mco.compatibility.unverifiable.message"), xk.j);
               break;
            case c:
               a(
                  $$0,
                  $$1,
                  xl.c("selectWorld.backupQuestion.downgrade").b(-2142128),
                  xl.a("mco.compatibility.downgrade.description", xl.b($$0.t).b(-171), xl.b(aa.b().c()).b(-171)),
                  xl.c("mco.compatibility.downgrade")
               );
               break;
            case d:
               a(
                  $$0,
                  $$1,
                  xl.c("mco.compatibility.upgrade.title").b(-171),
                  xl.a("mco.compatibility.upgrade.description", xl.b($$0.t).b(-171), xl.b(aa.b().c()).b(-171)),
                  xl.c("mco.compatibility.upgrade")
               );
         }
      }
   }

   private static void a(fba $$0, fmy $$1, xl $$2, xl $$3, xl $$4) {
      ffa.Q().a(new flq($$2x -> {
         fmy $$3x;
         if ($$2x) {
            $$3x = new fcq($$1, new fdz($$1, $$0));
            g();
         } else {
            $$3x = $$1;
         }

         ffa.Q().a($$3x);
      }, $$2, $$3, $$4, xk.e));
   }

   public static xl a(String $$0, boolean $$1) {
      return a($$0, $$1 ? -8355712 : -2142128);
   }

   public static xl a(String $$0, int $$1) {
      return (xl)(StringUtils.isBlank($$0) ? xk.a : xl.a("mco.version", xl.b($$0).b($$1)));
   }

   boolean h(fba $$0) {
      return this.m.b($$0.g);
   }

   private boolean i(fba $$0) {
      return this.h($$0) && !$$0.j;
   }

   private void a(fgm $$0, String $$1, int $$2) {
      $$0.c().a();
      $$0.c().a((float)(this.n / 2 - 25), 20.0F, 0.0F);
      $$0.c().a(a.f.rotationDegrees(-20.0F));
      $$0.c().b(1.5F, 1.5F, 1.5F);
      $$0.a(this.p, $$1, 0, 0, $$2, false);
      $$0.c().b();
   }

   class a extends fae.e {
      private static final xl c = xl.c("mco.snapshot.start");
      private static final int d = 5;
      private final fin e = new fin();
      private final fba f;

      public a(final fba $$0) {
         this.f = $$0;
         this.e.a(fik.a(xl.c("mco.snapshot.tooltip")));
      }

      @Override
      public void a(fgm $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(fae.b, $$3 - 5, $$2 + $$5 / 2 - 10, 40, 20);
         int $$10 = $$2 + $$5 / 2 - 9 / 2;
         $$0.b(fae.this.p, c, $$3 + 40 - 2, $$10 - 5, 8388479);
         $$0.b(fae.this.p, xl.a("mco.snapshot.description", this.f.c), $$3 + 40 - 2, $$10 + 5, -8355712);
         this.e.a($$8, this.aJ_(), new flf($$3, $$2, $$4, $$5));
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         this.c();
         return true;
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         if (fla.a($$0)) {
            this.c();
            return true;
         } else {
            return super.a($$0, $$1, $$2);
         }
      }

      private void c() {
         fae.this.m.aj().a(gsd.a(avw.Ao, 1.0F));
         fae.this.m
            .a(
               new fib.a(fae.this, xl.c("mco.snapshot.createSnapshotPopup.title"))
                  .a(xl.c("mco.snapshot.createSnapshotPopup.text"))
                  .a(xl.c("mco.selectServer.create"), $$0 -> fae.this.m.a(new fcl(fae.this, this.f.a)))
                  .a(xk.e, fib::d)
                  .a()
            );
      }

      @Override
      public xl a() {
         return xl.a("gui.narrate.button", xk.a(c, xl.a("mco.snapshot.description", this.f.c)));
      }
   }

   class b extends fae.e {
      private final fgz c;

      public b(final fgz $$0) {
         this.c = $$0;
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         this.c.a($$0, $$1, $$2);
         return super.a($$0, $$1, $$2);
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         return this.c.a($$0, $$1, $$2) ? true : super.a($$0, $$1, $$2);
      }

      @Override
      public void a(fgm $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.c.c(fae.this.n / 2 - 75, $$2 + 4);
         this.c.a($$0, $$6, $$7, $$9);
      }

      @Override
      public void a(boolean $$0) {
         super.a($$0);
         this.c.a($$0);
      }

      @Override
      public xl a() {
         return this.c.y();
      }
   }

   static class c extends fhl {
      private static final fim b = new fim(new alb("widget/cross_button"), new alb("widget/cross_button_highlighted"));

      protected c(fgz.c $$0, xl $$1) {
         super(0, 0, 14, 14, b, $$0);
         this.a(fik.a($$1));
      }
   }

   class d extends fae.e {
      @Override
      public void a(fgm $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
      }

      @Override
      public xl a() {
         return xl.i();
      }
   }

   abstract class e extends fhv.a<fae.e> {
      private static final int a = 10;
      private static final int c = 28;
      private static final int d = 7;

      protected void a(fba $$0, fgm $$1, int $$2, int $$3, int $$4, int $$5) {
         int $$6 = $$2 - 10 - 7;
         int $$7 = $$3 + 2;
         if ($$0.j) {
            this.a($$1, $$6, $$7, $$4, $$5, fae.c, () -> fae.S);
         } else if ($$0.e == fba.c.a) {
            this.a($$1, $$6, $$7, $$4, $$5, fae.D, () -> fae.W);
         } else if (fae.this.h($$0) && $$0.l < 7) {
            this.a($$1, $$6, $$7, $$4, $$5, fae.B, () -> {
               if ($$0.l <= 0) {
                  return fae.T;
               } else {
                  return (xl)($$0.l == 1 ? fae.U : xl.a("mco.selectServer.expires.days", $$0.l));
               }
            });
         } else if ($$0.e == fba.c.b) {
            this.a($$1, $$6, $$7, $$4, $$5, fae.C, () -> fae.V);
         }
      }

      private void a(fgm $$0, int $$1, int $$2, int $$3, int $$4, alb $$5, Supplier<xl> $$6) {
         $$0.a($$5, $$1, $$2, 10, 28);
         if (fae.this.aD.c((double)$$3, (double)$$4) && $$3 >= $$1 && $$3 <= $$1 + 10 && $$4 >= $$2 && $$4 <= $$2 + 28) {
            fae.this.d($$6.get());
         }
      }

      protected void a(fgm $$0, int $$1, int $$2, fba $$3) {
         int $$4 = this.b($$2);
         int $$5 = this.a($$1);
         int $$6 = this.d($$5);
         if (!fae.this.h($$3)) {
            $$0.a(fae.this.p, $$3.f, $$4, this.d($$5), -8355712, false);
         } else if ($$3.j) {
            xl $$7 = $$3.k ? fae.O : fae.M;
            $$0.a(fae.this.p, $$7, $$4, $$6, -2142128, false);
         }
      }

      protected void a(fgm $$0, String $$1, int $$2, int $$3, int $$4, int $$5) {
         int $$6 = $$4 - $$2;
         if (fae.this.p.b($$1) > $$6) {
            String $$7 = fae.this.p.a($$1, $$6 - fae.this.p.b("... "));
            $$0.a(fae.this.p, $$7 + "...", $$2, $$3, $$5, false);
         } else {
            $$0.a(fae.this.p, $$1, $$2, $$3, $$5, false);
         }
      }

      protected int a(int $$0, int $$1, xl $$2) {
         return $$0 + $$1 - fae.this.p.a($$2) - 20;
      }

      protected int a(int $$0) {
         return $$0 + 1;
      }

      protected int b() {
         return 2 + 9;
      }

      protected int b(int $$0) {
         return $$0 + 36 + 2;
      }

      protected int c(int $$0) {
         return $$0 + this.b();
      }

      protected int d(int $$0) {
         return $$0 + this.b() * 2;
      }
   }

   static enum f {
      a,
      b,
      c;
   }

   static class g extends fie.b {
      private static final alb[] d = new alb[]{
         new alb("notification/1"),
         new alb("notification/2"),
         new alb("notification/3"),
         new alb("notification/4"),
         new alb("notification/5"),
         new alb("notification/more")
      };
      private static final int u = Integer.MAX_VALUE;
      private static final int v = 20;
      private static final int w = 14;
      private int x;

      public g(xl $$0, alb $$1, fgz.c $$2) {
         super(20, 20, $$0, 14, 14, $$1, $$2, null);
      }

      int a() {
         return this.x;
      }

      public void a(int $$0) {
         this.x = $$0;
      }

      @Override
      public void b(fgm $$0, int $$1, int $$2, float $$3) {
         super.b($$0, $$1, $$2, $$3);
         if (this.j && this.x != 0) {
            this.a($$0);
         }
      }

      private void a(fgm $$0) {
         $$0.a(d[Math.min(this.x, 6) - 1], this.C() + this.x() - 5, this.D() - 3, 8, 8);
      }
   }

   class h extends fae.e {
      private static final int c = 40;
      private static final int d = -12303292;
      private final xl e;
      private final int f;
      private final List<fgx> g = new ArrayList<>();
      @Nullable
      private final fae.c h;
      private final fht i;
      private final fkl j;
      private final fkk k;
      private int l = -1;

      public h(final xl $$0, final int $$1, final faz $$2) {
         this.e = $$0;
         this.f = $$1;
         this.j = new fkl();
         int $$3 = 7;
         this.j.a(fhm.a(20, 20, fae.a), 0, 0, this.j.b().a(7, 7, 0, 0));
         this.j.a(fkr.a(40), 0, 0);
         this.k = this.j.a(new fkk(0, 9 * 3 * ($$1 - 1)), 0, 1, this.j.b().c(7));
         this.i = this.k.a(new fht($$0, fae.this.p).b(true), this.k.b().b().d());
         this.j.a(fkr.a(40), 0, 2);
         if ($$2.b()) {
            this.h = this.j.a(new fae.c($$1x -> fae.this.a($$2.c()), xl.c("mco.notification.dismiss")), 0, 2, this.j.b().c().a(0, 7, 7, 0));
         } else {
            this.h = null;
         }

         this.j.a(this.g::add);
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         return this.h != null && this.h.a($$0, $$1, $$2) ? true : super.a($$0, $$1, $$2);
      }

      private void e(int $$0) {
         if (this.l != $$0) {
            this.f($$0);
            this.l = $$0;
         }
      }

      private void f(int $$0) {
         int $$1 = $$0 - 80;
         this.k.b($$1);
         this.i.d($$1);
         this.j.a();
      }

      @Override
      public void b(fgm $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         super.b($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
         $$0.b($$3 - 2, $$2 - 2, $$4, 36 * this.f - 2, -12303292);
      }

      @Override
      public void a(fgm $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.j.c($$3, $$2);
         this.e($$4 - 4);
         this.g.forEach($$4x -> $$4x.a($$0, $$6, $$7, $$9));
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         if (this.h != null) {
            this.h.a($$0, $$1, $$2);
         }

         return super.a($$0, $$1, $$2);
      }

      @Override
      public xl a() {
         return this.e;
      }
   }

   class i extends fae.e {
      private final fba c;
      private final fin d = new fin();

      public i(final fba $$0) {
         this.c = $$0;
         if (!$$0.j) {
            this.d.a(fik.a(xl.c("mco.snapshot.parent.tooltip")));
         }
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         return true;
      }

      @Override
      public void a(fgm $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = this.b($$3);
         int $$11 = this.a($$2);
         fdq.a($$0, $$3, $$2, 32, this.c.g);
         xl $$12 = fae.a(this.c.t, -8355712);
         int $$13 = this.a($$3, $$4, $$12);
         this.a($$0, this.c.b(), $$10, $$11, $$13, -8355712);
         if ($$12 != xk.a) {
            $$0.a(fae.this.p, $$12, $$13, $$11, -8355712, false);
         }

         $$0.a(fae.this.p, this.c.a(), $$10, this.c($$11), -8355712, false);
         this.a($$0, $$2, $$3, this.c);
         this.a(this.c, $$0, $$3 + $$4, $$2, $$6, $$7);
         this.d.a($$8, this.aJ_(), new flf($$3, $$2, $$4, $$5));
      }

      @Override
      public xl a() {
         return xl.b(this.c.c);
      }
   }

   class j extends gva<fae.e> {
      public j() {
         super(fae.this.n, fae.this.o, 0, 36);
      }

      public void a(@Nullable fae.e $$0) {
         super.a($$0);
         fae.this.F();
      }

      @Override
      public int a() {
         return this.l() * 36;
      }

      @Override
      public int b() {
         return 300;
      }
   }

   interface k<T> {
      T request(faj var1) throws fbw;
   }

   class l extends fae.e {
      private static final int c = 36;
      private final fba d;
      private final fin e = new fin();

      public l(final fba $$0) {
         this.d = $$0;
         boolean $$1 = fae.this.h($$0);
         if (fae.b() && $$1 && $$0.h()) {
            this.e.a(fik.a(xl.a("mco.snapshot.paired", $$0.s)));
         } else if (!$$1 && $$0.e()) {
            this.e.a(fik.a(xl.a("mco.snapshot.friendsRealm.upgrade", $$0.f)));
         } else if (!$$1 && $$0.f()) {
            this.e.a(fik.a(xl.a("mco.snapshot.friendsRealm.downgrade", $$0.t)));
         }
      }

      @Override
      public void a(fgm $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         if (this.d.e == fba.c.c) {
            $$0.a(fae.b, $$3 - 5, $$2 + $$5 / 2 - 10, 40, 20);
            int $$10 = $$2 + $$5 / 2 - 9 / 2;
            $$0.b(fae.this.p, fae.L, $$3 + 40 - 2, $$10, 8388479);
         } else {
            fdq.a($$0, $$3, $$2, 32, this.d.g);
            this.a($$0, $$2, $$3, $$4);
            this.a($$0, $$2, $$3);
            this.a($$0, $$2, $$3, this.d);
            this.a(this.d, $$0, $$3 + $$4, $$2, $$6, $$7);
            this.e.a($$8, this.aJ_(), new flf($$3, $$2, $$4, $$5));
         }
      }

      private void a(fgm $$0, int $$1, int $$2, int $$3) {
         int $$4 = this.b($$2);
         int $$5 = this.a($$1);
         xl $$6 = fae.a(this.d.t, this.d.d());
         int $$7 = this.a($$2, $$3, $$6);
         this.a($$0, this.d.b(), $$4, $$5, $$7, -1);
         if ($$6 != xk.a) {
            $$0.a(fae.this.p, $$6, $$7, $$5, -8355712, false);
         }
      }

      private void a(fgm $$0, int $$1, int $$2) {
         int $$3 = this.b($$2);
         int $$4 = this.a($$1);
         int $$5 = this.c($$4);
         String $$6 = this.d.c();
         if (this.d.m == fba.d.b && $$6 != null) {
            xl $$7 = xl.b($$6).a(n.h);
            $$0.a(fae.this.p, xl.a("mco.selectServer.minigameName", $$7).b(-171), $$3, $$5, -1, false);
         } else {
            $$0.a(fae.this.p, this.d.a(), $$3, this.c($$4), -8355712, false);
         }
      }

      private void d() {
         fae.this.m.aj().a(gsd.a(avw.Ao, 1.0F));
         fae.a(this.d, fae.this);
      }

      private void e() {
         fae.this.m.aj().a(gsd.a(avw.Ao, 1.0F));
         fcl $$0 = new fcl(fae.this, this.d);
         fae.this.m.a($$0);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         if (this.d.e == fba.c.c) {
            this.e();
         } else if (fae.this.a(this.d)) {
            if (ac.c() - fae.this.aI < 250L && this.aJ_()) {
               this.d();
            }

            fae.this.aI = ac.c();
         }

         return true;
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         if (fla.a($$0)) {
            if (this.d.e == fba.c.c) {
               this.e();
               return true;
            }

            if (fae.this.a(this.d)) {
               this.d();
               return true;
            }
         }

         return super.a($$0, $$1, $$2);
      }

      @Override
      public xl a() {
         return (xl)(this.d.e == fba.c.c ? fae.X : xl.a("narrator.select", this.d.c));
      }

      public fba c() {
         return this.d;
      }
   }
}
