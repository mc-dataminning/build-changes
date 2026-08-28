import com.google.common.collect.Lists;
import com.google.common.util.concurrent.RateLimiter;
import com.mojang.authlib.yggdrasil.ProfileResult;
import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;

public class fev extends hff {
   static final all a = all.b("icon/info");
   static final all b = all.b("icon/new_realm");
   static final all c = all.b("realm_status/expired");
   static final all B = all.b("realm_status/expires_soon");
   static final all C = all.b("realm_status/open");
   static final all D = all.b("realm_status/closed");
   private static final all E = all.b("icon/invite");
   private static final all F = all.b("icon/news");
   static final Logger G = LogUtils.getLogger();
   private static final all H = all.b("textures/gui/title/realms.png");
   private static final all I = all.b("textures/gui/realms/no_realms.png");
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
   private static final xl ab = xl.c("mco.compatibility.incompatible.popup.title");
   private static final xl ac = xl.c("mco.compatibility.incompatible.releaseType.popup.message");
   private static final int ad = 100;
   private static final int ae = 3;
   private static final int af = 4;
   private static final int ag = 308;
   private static final int ah = 128;
   private static final int ai = 34;
   private static final int aj = 128;
   private static final int ak = 64;
   private static final int al = 5;
   private static final int am = 44;
   private static final int an = 11;
   private static final int ao = 40;
   private static final int ap = 20;
   private static final int aq = 216;
   private static final int ar = 36;
   private static final boolean as = !ab.b().g();
   private static boolean at = as;
   private final CompletableFuture<feu.a> au = feu.a();
   @Nullable
   private fig.c av;
   private final Set<UUID> aw = new HashSet<>();
   private static boolean ax;
   private final RateLimiter ay;
   private final frp az;
   private flw aA;
   private flw aB;
   private flw aC;
   private flw aD;
   private flw aE;
   fev.j aF;
   private fha aG;
   private List<fgb> aH = List.of();
   fge aI = new fge();
   private volatile boolean aJ;
   @Nullable
   private volatile String aK;
   long aL;
   private final List<fga> aM = new ArrayList<>();
   private flw aN;
   private fev.g aO;
   private fev.g aP;
   private fev.f aQ;
   @Nullable
   private fpl aR;

   public fev(frp $$0) {
      super(J);
      this.az = $$0;
      this.ay = RateLimiter.create(0.016666668F);
   }

   @Override
   public void aS_() {
      this.aG = new fha(this.m);
      this.aF = new fev.j();
      xl $$0 = xl.c("mco.invites.title");
      this.aO = new fev.g($$0, E, $$1x -> this.m.a(new fht(this, $$0)));
      xl $$1 = xl.c("mco.news");
      this.aP = new fev.g($$1, F, $$0x -> {
         String $$1x = this.aK;
         if ($$1x != null) {
            fqm.a(this, $$1x);
            if (this.aP.a() != 0) {
               fim.a $$2 = fim.b();
               $$2.b = false;
               fim.b($$2);
               this.aP.a(0);
            }
         }
      });
      this.aP.a(fnh.a($$1));
      this.aA = flw.a(P, $$0x -> a(this.N(), this)).a(100).a();
      this.aD = flw.a(R, $$0x -> this.f(this.N())).a(100).a();
      this.aC = flw.a(N, $$0x -> this.e(this.N())).a(100).a();
      this.aE = flw.a(Q, $$0x -> this.g(this.N())).a(100).a();
      this.aN = flw.a(xl.c("mco.selectServer.purchase"), $$0x -> this.O()).b(100, 20).a();
      this.aB = flw.a(xk.k, $$0x -> this.aP_()).a(100).a();
      if (ffa.a == ffa.b.b) {
         this.c(fmd.a(xl.b("Snapshot"), xl.b("Release")).a(5, 5, 100, 20, xl.b("Realm"), ($$0x, $$1x) -> {
            at = $$1x;
            this.aH = List.of();
            this.J();
         }));
      }

      this.a(fev.f.a);
      this.G();
      this.au.thenAcceptAsync($$0x -> {
         frp $$1x = $$0x.a(this.az);
         if ($$1x == null) {
            this.av = this.a(this.m.bc());
         } else {
            this.m.a($$1x);
         }
      }, this.r);
   }

   public static boolean b() {
      return as && at;
   }

   @Override
   protected void c() {
      if (this.aR != null) {
         this.aF.a(this.n, this.aR);
         this.aR.a();
      }
   }

   @Override
   public void aP_() {
      this.m.a(this.az);
   }

   private void D() {
      if (this.aG.a() && this.aH.isEmpty() && this.aM.isEmpty()) {
         this.a(fev.f.b);
      } else {
         this.a(fev.f.c);
      }
   }

   private void a(fev.f $$0) {
      if (this.aQ != $$0) {
         if (this.aR != null) {
            this.aR.a($$1 -> this.e($$1));
         }

         this.aR = this.b($$0);
         this.aQ = $$0;
         this.aR.a($$1 -> {
            flu var10000 = this.c($$1);
         });
         this.c();
      }
   }

   private fpl b(fev.f $$0) {
      fpl $$1 = new fpl(this);
      $$1.b(44);
      $$1.a(this.E());
      fpm $$2 = this.c($$0);
      $$2.a();
      $$1.a($$2.w() + 22);
      $$1.b($$2);
      switch ($$0) {
         case a:
            $$1.c(new fml(this.p, K));
            break;
         case b:
            $$1.c(this.F());
            break;
         case c:
            $$1.c(this.aF);
      }

      return $$1;
   }

   private fpm E() {
      int $$0 = 90;
      fpp $$1 = fpp.e().a(4);
      $$1.c().e();
      $$1.a(this.aO);
      $$1.a(this.aP);
      fpp $$2 = fpp.e();
      $$2.c().e();
      $$2.a(fpq.a(90));
      $$2.a(fmj.a(128, 34, H, 128, 64), fpo::b);
      $$2.a(new fpj(90, 44)).a($$1, fpo::c);
      return $$2;
   }

   private fpm c(fev.f $$0) {
      fpk $$1 = new fpk().c(4);
      fpk.b $$2 = $$1.d(3);
      if ($$0 == fev.f.c) {
         $$2.a(this.aA);
         $$2.a(this.aD);
         $$2.a(this.aC);
         $$2.a(this.aE);
      }

      $$2.a(this.aN);
      $$2.a(this.aB);
      return $$1;
   }

   private fpp F() {
      fpp $$0 = fpp.d().a(8);
      $$0.c().b();
      $$0.a(fmj.a(130, 64, I, 130, 64));
      fmh $$1 = new fmh(308, Y, this.p, false, 4);
      $$0.a($$1);
      return $$0;
   }

   void G() {
      fgb $$0 = this.N();
      this.aN.j = this.aQ != fev.f.a;
      this.aA.j = $$0 != null && this.a($$0);
      this.aC.j = $$0 != null && this.b($$0);
      this.aE.j = $$0 != null && this.d($$0);
      this.aD.j = $$0 != null && this.c($$0);
   }

   boolean a(fgb $$0) {
      boolean $$1 = !$$0.j && $$0.e == fgb.c.b;
      return $$1 && ($$0.d() || $$0.e() || i($$0));
   }

   private boolean b(fgb $$0) {
      return $$0.j && i($$0);
   }

   private boolean c(fgb $$0) {
      return i($$0) && $$0.e != fgb.c.c;
   }

   private boolean d(fgb $$0) {
      return !i($$0);
   }

   @Override
   public void e() {
      super.e();
      if (this.av != null) {
         this.av.b();
      }
   }

   public static void f() {
      fjx.Q().bc().d.a();
   }

   public static void g() {
      fjx.Q().bc().c.a();
   }

   private void J() {
      for (fig.e<?> $$0 : this.m.bc().a()) {
         $$0.a();
      }
   }

   private fig.c a(fgy $$0) {
      fig.c $$1 = $$0.a.a();
      $$1.a($$0.c, $$0x -> {
         this.aG.a($$0x.a());
         this.aH = $$0x.b();
         this.K();
         boolean $$1x = false;

         for (fgb $$2 : this.aG) {
            if (this.j($$2)) {
               $$1x = true;
            }
         }

         if (!ax && $$1x) {
            ax = true;
            this.L();
         }
      });
      a(ffa::d, $$0x -> {
         this.aM.clear();
         this.aM.addAll($$0x);

         for (fga $$1x : $$0x) {
            if ($$1x instanceof fga.a $$2) {
               fmy $$3 = $$2.a(this, this::a);
               if ($$3 != null) {
                  this.m.a($$3);
                  this.a(List.of($$1x));
                  break;
               }
            }
         }

         if (!this.aM.isEmpty() && this.aQ != fev.f.a) {
            this.K();
         }
      });
      $$1.a($$0.d, $$0x -> {
         this.aO.a($$0x);
         this.aO.a($$0x == 0 ? fnh.a(Z) : fnh.a(aa));
         if ($$0x > 0 && this.ay.tryAcquire(1)) {
            this.m.aZ().c(xl.a("mco.configure.world.invite.narration", $$0x));
         }
      });
      $$1.a($$0.e, $$0x -> this.aJ = $$0x);
      $$1.a($$0.g, $$0x -> this.aI = $$0x);
      $$1.a($$0.f, $$1x -> {
         $$0.h.a($$1x);
         this.aK = $$0.h.b();
         this.aP.a($$0.h.a() ? Integer.MAX_VALUE : 0);
      });
      return $$1;
   }

   private void a(Collection<fga> $$0) {
      List<UUID> $$1 = new ArrayList<>($$0.size());

      for (fga $$2 : $$0) {
         if (!$$2.a() && !this.aw.contains($$2.c())) {
            $$1.add($$2.c());
         }
      }

      if (!$$1.isEmpty()) {
         a($$1x -> {
            $$1x.a($$1);
            return null;
         }, $$1x -> this.aw.addAll($$1));
      }
   }

   private static <T> void a(fev.k<T> $$0, Consumer<T> $$1) {
      fjx $$2 = fjx.Q();
      CompletableFuture.<T>supplyAsync(() -> {
         try {
            return $$0.request(ffa.a($$2));
         } catch (fgv var3) {
            throw new RuntimeException(var3);
         }
      }).thenAcceptAsync($$1, $$2).exceptionally($$0x -> {
         G.error("Failed to execute call to Realms Service", $$0x);
         return null;
      });
   }

   private void K() {
      fgb $$0 = this.N();
      this.aF.J();

      for (fga $$1 : this.aM) {
         if (this.a($$1)) {
            this.a(List.of($$1));
            break;
         }
      }

      for (fgb $$2 : this.aH) {
         this.aF.a(new fev.a($$2));
      }

      for (fgb $$3 : this.aG) {
         fev.e $$4;
         if (b() && !$$3.h()) {
            if ($$3.e == fgb.c.c) {
               continue;
            }

            $$4 = new fev.i($$3);
         } else {
            $$4 = new fev.l($$3);
         }

         this.aF.a((fev.e)$$4);
         if ($$0 != null && $$0.a == $$3.a) {
            this.aF.a($$4);
         }
      }

      this.D();
      this.G();
   }

   private boolean a(fga $$0) {
      if (!($$0 instanceof fga.c $$1)) {
         return false;
      } else {
         xl $$2 = $$1.d();
         int $$3 = this.p.b($$2, 216);
         int $$4 = azn.e($$3 + 7, 36) - 1;
         this.aF.a(new fev.h($$2, $$4 + 2, $$1));

         for (int $$5 = 0; $$5 < $$4; $$5++) {
            this.aF.a(new fev.d());
         }

         this.aF.a(new fev.b($$1.a(this)));
         return true;
      }
   }

   private void L() {
      new Thread(() -> {
         List<fgj> $$0 = fez.a();
         ffa $$1 = ffa.a();
         ffw $$2 = new ffw();
         $$2.a = $$0;
         $$2.b = this.M();

         try {
            $$1.a($$2);
         } catch (Throwable var5) {
            G.warn("Could not send ping result to Realms: ", var5);
         }
      }).start();
   }

   private List<Long> M() {
      List<Long> $$0 = Lists.newArrayList();

      for (fgb $$1 : this.aG) {
         if (this.j($$1)) {
            $$0.add($$1.a);
         }
      }

      return $$0;
   }

   private void e(@Nullable fgb $$0) {
      if ($$0 != null) {
         String $$1 = ayj.a($$0.b, this.m.X().b(), $$0.k);
         this.m.p.a($$1);
         ae.m().a($$1);
      }
   }

   private void f(@Nullable fgb $$0) {
      if ($$0 != null && this.m.b($$0.g)) {
         this.m.a(new fhj(this, $$0.a));
      }
   }

   private void g(@Nullable fgb $$0) {
      if ($$0 != null && !this.m.b($$0.g)) {
         xl $$1 = xl.c("mco.configure.world.leave.question.line1");
         this.m.a(fhv.a(this, $$1, $$1x -> this.h($$0)));
      }
   }

   @Nullable
   private fgb N() {
      return this.aF.h() instanceof fev.l $$0 ? $$0.c() : null;
   }

   private void h(final fgb $$0) {
      (new Thread("Realms-leave-server") {
         @Override
         public void run() {
            try {
               ffa $$0 = ffa.a();
               $$0.d($$0.a);
               fev.this.m.execute(fev::g);
            } catch (fgv var2) {
               fev.G.error("Couldn't configure world", var2);
               fev.this.m.execute(() -> fev.this.m.a(new fhn(var2, fev.this)));
            }
         }
      }).start();
      this.m.a(this);
   }

   void a(UUID $$0) {
      a($$1 -> {
         $$1.b(List.of($$0));
         return null;
      }, $$1 -> {
         this.aM.removeIf($$1x -> $$1x.b() && $$0.equals($$1x.c()));
         this.K();
      });
   }

   public void h() {
      this.aF.a(null);
      g();
   }

   @Override
   public xl i() {
      return (xl)(switch (this.aQ) {
         case a -> xk.a(super.i(), K);
         case b -> xk.a(super.i(), Y);
         case c -> super.i();
      });
   }

   @Override
   public void a(flj $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (b()) {
         $$0.b(this.p, "Minecraft " + ab.b().c(), 2, this.o - 10, -1);
      }

      if (this.aJ && this.aN.j) {
         fhe.a($$0, this.aN);
      }

      switch (ffa.a) {
         case b:
            this.a($$0, "STAGE!", -256);
            break;
         case c:
            this.a($$0, "LOCAL!", 8388479);
      }
   }

   private void O() {
      this.m.a(new fhe(this, this.aJ));
   }

   public static void a(@Nullable fgb $$0, frp $$1) {
      a($$0, $$1, false);
   }

   public static void a(@Nullable fgb $$0, frp $$1, boolean $$2) {
      if ($$0 != null) {
         if (!b() || $$2 || $$0.i()) {
            fjx.Q().a(new fhp($$1, new fiv($$1, $$0)));
            return;
         }

         switch ($$0.u) {
            case f:
               fjx.Q().a(new fhp($$1, new fiv($$1, $$0)));
               break;
            case a:
               a($$0, $$1, xl.c("mco.compatibility.unverifiable.title").b(-171), xl.c("mco.compatibility.unverifiable.message"), xk.j);
               break;
            case d:
               a(
                  $$0,
                  $$1,
                  xl.c("selectWorld.backupQuestion.downgrade").b(-2142128),
                  xl.a("mco.compatibility.downgrade.description", xl.b($$0.t).b(-171), xl.b(ab.b().c()).b(-171)),
                  xl.c("mco.compatibility.downgrade")
               );
               break;
            case e:
               b($$0, $$1);
               break;
            case b:
               fjx.Q()
                  .a(
                     new fmy.a($$1, ab)
                        .a(xl.a("mco.compatibility.incompatible.series.popup.message", xl.b($$0.t).b(-171), xl.b(ab.b().c()).b(-171)))
                        .a(xk.k, fmy::aP_)
                        .a()
                  );
               break;
            case c:
               fjx.Q().a(new fmy.a($$1, ab).a(ac).a(xk.k, fmy::aP_).a());
         }
      }
   }

   private static void a(fgb $$0, frp $$1, xl $$2, xl $$3, xl $$4) {
      fjx.Q().a(new fmy.a($$1, $$2).a($$3).a($$4, $$2x -> {
         fjx.Q().a(new fhp($$1, new fiv($$1, $$0)));
         g();
      }).a(xk.e, fmy::aP_).a());
   }

   private static void b(fgb $$0, frp $$1) {
      xl $$2 = xl.c("mco.compatibility.upgrade.title").b(-171);
      xl $$3 = xl.c("mco.compatibility.upgrade");
      xl $$4 = xl.b($$0.t).b(-171);
      xl $$5 = xl.b(ab.b().c()).b(-171);
      xl $$6 = i($$0) ? xl.a("mco.compatibility.upgrade.description", $$4, $$5) : xl.a("mco.compatibility.upgrade.friend.description", $$4, $$5);
      a($$0, $$1, $$2, $$6, $$3);
   }

   public static xl a(String $$0, boolean $$1) {
      return a($$0, $$1 ? -8355712 : -2142128);
   }

   public static xl a(String $$0, int $$1) {
      return (xl)(StringUtils.isBlank($$0) ? xk.a : xl.a("mco.version", xl.b($$0).b($$1)));
   }

   static boolean i(fgb $$0) {
      return fjx.Q().b($$0.g);
   }

   private boolean j(fgb $$0) {
      return i($$0) && !$$0.j;
   }

   private void a(flj $$0, String $$1, int $$2) {
      $$0.c().a();
      $$0.c().a((float)(this.n / 2 - 25), 20.0F, 0.0F);
      $$0.c().a(a.f.rotationDegrees(-20.0F));
      $$0.c().b(1.5F, 1.5F, 1.5F);
      $$0.a(this.p, $$1, 0, 0, $$2, false);
      $$0.c().b();
   }

   class a extends fev.e {
      private static final xl f = xl.c("mco.snapshot.start");
      private static final int g = 5;
      private final fnk h = new fnk();
      private final fgb i;

      public a(final fgb $$0) {
         this.i = $$0;
         this.h.a(fnh.a(xl.c("mco.snapshot.tooltip")));
      }

      @Override
      public void a(flj $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(gjh::B, fev.b, $$3 - 5, $$2 + $$5 / 2 - 10, 40, 20);
         int $$10 = $$2 + $$5 / 2 - 9 / 2;
         $$0.b(fev.this.p, f, $$3 + 40 - 2, $$10 - 5, 8388479);
         $$0.b(fev.this.p, xl.a("mco.snapshot.description", this.i.c), $$3 + 40 - 2, $$10 + 5, -8355712);
         this.h.a($$8, this.aM_(), new fqe($$3, $$2, $$4, $$5));
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         this.c();
         return true;
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         if (fpz.a($$0)) {
            this.c();
            return true;
         } else {
            return super.a($$0, $$1, $$2);
         }
      }

      private void c() {
         fev.this.m.ak().a(hcl.a(awo.Av, 1.0F));
         fev.this.m
            .a(
               new fmy.a(fev.this, xl.c("mco.snapshot.createSnapshotPopup.title"))
                  .a(xl.c("mco.snapshot.createSnapshotPopup.text"))
                  .a(xl.c("mco.selectServer.create"), $$0 -> fev.this.m.a(new fhl(fev.this, this.i, true)))
                  .a(xk.e, fmy::aP_)
                  .a()
            );
      }

      @Override
      public xl a() {
         return xl.a("gui.narrate.button", xk.a(f, xl.a("mco.snapshot.description", this.i.c)));
      }
   }

   class b extends fev.e {
      private final flw f;

      public b(final flw $$0) {
         this.f = $$0;
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         this.f.a($$0, $$1, $$2);
         return super.a($$0, $$1, $$2);
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         return this.f.a($$0, $$1, $$2) ? true : super.a($$0, $$1, $$2);
      }

      @Override
      public void a(flj $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.f.c(fev.this.n / 2 - 75, $$2 + 4);
         this.f.a($$0, $$6, $$7, $$9);
      }

      @Override
      public void a(boolean $$0) {
         super.a($$0);
         this.f.a($$0);
      }

      @Override
      public xl a() {
         return this.f.z();
      }
   }

   static class c extends fmi {
      private static final fnj b = new fnj(all.b("widget/cross_button"), all.b("widget/cross_button_highlighted"));

      protected c(flw.c $$0, xl $$1) {
         super(0, 0, 14, 14, b, $$0);
         this.a(fnh.a($$1));
      }
   }

   class d extends fev.e {
      @Override
      public void a(flj $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
      }

      @Override
      public xl a() {
         return xl.i();
      }
   }

   abstract class e extends fms.a<fev.e> {
      protected static final int b = 10;
      private static final int a = 28;
      protected static final int c = 7;
      protected static final int d = 2;

      protected void a(fgb $$0, flj $$1, int $$2, int $$3, int $$4, int $$5) {
         int $$6 = $$2 - 10 - 7;
         int $$7 = $$3 + 2;
         if ($$0.j) {
            this.a($$1, $$6, $$7, $$4, $$5, fev.c, () -> fev.S);
         } else if ($$0.e == fgb.c.a) {
            this.a($$1, $$6, $$7, $$4, $$5, fev.D, () -> fev.W);
         } else if (fev.i($$0) && $$0.l < 7) {
            this.a($$1, $$6, $$7, $$4, $$5, fev.B, () -> {
               if ($$0.l <= 0) {
                  return fev.T;
               } else {
                  return (xl)($$0.l == 1 ? fev.U : xl.a("mco.selectServer.expires.days", $$0.l));
               }
            });
         } else if ($$0.e == fgb.c.b) {
            this.a($$1, $$6, $$7, $$4, $$5, fev.C, () -> fev.V);
         }
      }

      private void a(flj $$0, int $$1, int $$2, int $$3, int $$4, all $$5, Supplier<xl> $$6) {
         $$0.a(gjh::B, $$5, $$1, $$2, 10, 28);
         if (fev.this.aF.c((double)$$3, (double)$$4) && $$3 >= $$1 && $$3 <= $$1 + 10 && $$4 >= $$2 && $$4 <= $$2 + 28) {
            fev.this.d($$6.get());
         }
      }

      protected void a(flj $$0, int $$1, int $$2, fgb $$3) {
         int $$4 = this.b($$2);
         int $$5 = this.a($$1);
         int $$6 = this.d($$5);
         if (!fev.i($$3)) {
            $$0.a(fev.this.p, $$3.f, $$4, this.d($$5), -8355712, false);
         } else if ($$3.j) {
            xl $$7 = $$3.k ? fev.O : fev.M;
            $$0.a(fev.this.p, $$7, $$4, $$6, -2142128, false);
         }
      }

      protected void a(flj $$0, String $$1, int $$2, int $$3, int $$4, int $$5) {
         int $$6 = $$4 - $$2;
         if (fev.this.p.b($$1) > $$6) {
            String $$7 = fev.this.p.a($$1, $$6 - fev.this.p.b("... "));
            $$0.a(fev.this.p, $$7 + "...", $$2, $$3, $$5, false);
         } else {
            $$0.a(fev.this.p, $$1, $$2, $$3, $$5, false);
         }
      }

      protected int a(int $$0, int $$1, xl $$2) {
         return $$0 + $$1 - fev.this.p.a($$2) - 20;
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

   static class g extends fnb.b {
      private static final all[] d = new all[]{
         all.b("notification/1"),
         all.b("notification/2"),
         all.b("notification/3"),
         all.b("notification/4"),
         all.b("notification/5"),
         all.b("notification/more")
      };
      private static final int u = Integer.MAX_VALUE;
      private static final int v = 20;
      private static final int w = 14;
      private int x;

      public g(xl $$0, all $$1, flw.c $$2) {
         super(20, 20, $$0, 14, 14, $$1, $$2, null);
      }

      int a() {
         return this.x;
      }

      public void a(int $$0) {
         this.x = $$0;
      }

      @Override
      public void b(flj $$0, int $$1, int $$2, float $$3) {
         super.b($$0, $$1, $$2, $$3);
         if (this.j && this.x != 0) {
            this.a($$0);
         }
      }

      private void a(flj $$0) {
         $$0.a(gjh::B, d[Math.min(this.x, 6) - 1], this.D() + this.y() - 5, this.E() - 3, 8, 8);
      }
   }

   class h extends fev.e {
      private static final int f = 40;
      private static final int g = -12303292;
      private final xl h;
      private final int i;
      private final List<flu> j = new ArrayList<>();
      @Nullable
      private final fev.c k;
      private final fmq l;
      private final fpk m;
      private final fpj n;
      private int o = -1;

      public h(final xl $$0, final int $$1, final fga $$2) {
         this.h = $$0;
         this.i = $$1;
         this.m = new fpk();
         int $$3 = 7;
         this.m.a(fmj.a(20, 20, fev.a), 0, 0, this.m.b().a(7, 7, 0, 0));
         this.m.a(fpq.a(40), 0, 0);
         this.n = this.m.a(new fpj(0, 9 * 3 * ($$1 - 1)), 0, 1, this.m.b().c(7));
         this.l = this.n.a(new fmq($$0, fev.this.p).b(true), this.n.b().b().d());
         this.m.a(fpq.a(40), 0, 2);
         if ($$2.b()) {
            this.k = this.m.a(new fev.c($$1x -> fev.this.a($$2.c()), xl.c("mco.notification.dismiss")), 0, 2, this.m.b().c().a(0, 7, 7, 0));
         } else {
            this.k = null;
         }

         this.m.a(this.j::add);
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         return this.k != null && this.k.a($$0, $$1, $$2) ? true : super.a($$0, $$1, $$2);
      }

      private void e(int $$0) {
         if (this.o != $$0) {
            this.f($$0);
            this.o = $$0;
         }
      }

      private void f(int $$0) {
         int $$1 = $$0 - 80;
         this.n.b($$1);
         this.l.d($$1);
         this.m.a();
      }

      @Override
      public void b(flj $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         super.b($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
         $$0.b($$3 - 2, $$2 - 2, $$4, 36 * this.i - 2, -12303292);
      }

      @Override
      public void a(flj $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.m.c($$3, $$2);
         this.e($$4 - 4);
         this.j.forEach($$4x -> $$4x.a($$0, $$6, $$7, $$9));
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         if (this.k != null) {
            this.k.a($$0, $$1, $$2);
         }

         return super.a($$0, $$1, $$2);
      }

      @Override
      public xl a() {
         return this.h;
      }
   }

   class i extends fev.e {
      private final fgb f;
      private final fnk g = new fnk();

      public i(final fgb $$0) {
         this.f = $$0;
         if (!$$0.j) {
            this.g.a(fnh.a(xl.c("mco.snapshot.parent.tooltip")));
         }
      }

      @Override
      public void a(flj $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = this.b($$3);
         int $$11 = this.a($$2);
         fio.a($$0, $$3, $$2, 32, this.f.g);
         xl $$12 = fev.a(this.f.t, -8355712);
         int $$13 = this.a($$3, $$4, $$12);
         this.a($$0, this.f.b(), $$10, $$11, $$13, -8355712);
         if ($$12 != xk.a) {
            $$0.a(fev.this.p, $$12, $$13, $$11, -8355712, false);
         }

         $$0.a(fev.this.p, this.f.a(), $$10, this.c($$11), -8355712, false);
         this.a($$0, $$2, $$3, this.f);
         this.a(this.f, $$0, $$3 + $$4, $$2, $$6, $$7);
         this.g.a($$8, this.aM_(), new fqe($$3, $$2, $$4, $$5));
      }

      @Override
      public xl a() {
         return xl.b(this.f.c);
      }
   }

   class j extends hfe<fev.e> {
      public j() {
         super(fev.this.n, fev.this.o, 0, 36);
      }

      public void a(@Nullable fev.e $$0) {
         super.a($$0);
         fev.this.G();
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
      T request(ffa var1) throws fgv;
   }

   class l extends fev.e {
      private static final xl f = xl.c("mco.onlinePlayers");
      private static final int g = 9;
      private static final int h = 36;
      private final fgb i;
      private final fnk j = new fnk();

      public l(final fgb $$0) {
         this.i = $$0;
         boolean $$1 = fev.i($$0);
         if (fev.b() && $$1 && $$0.h()) {
            this.j.a(fnh.a(xl.a("mco.snapshot.paired", $$0.s)));
         } else if (!$$1 && $$0.f()) {
            this.j.a(fnh.a(xl.a("mco.snapshot.friendsRealm.downgrade", $$0.t)));
         }
      }

      @Override
      public void a(flj $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         if (this.i.e == fgb.c.c) {
            $$0.a(gjh::B, fev.b, $$3 - 5, $$2 + $$5 / 2 - 10, 40, 20);
            int $$10 = $$2 + $$5 / 2 - 9 / 2;
            $$0.b(fev.this.p, fev.L, $$3 + 40 - 2, $$10, 8388479);
         } else {
            this.a(this.i, $$0, $$3 + 36, $$2, $$6, $$7);
            fio.a($$0, $$3, $$2, 32, this.i.g);
            this.a($$0, $$2, $$3, $$4);
            this.a($$0, $$2, $$3);
            this.a($$0, $$2, $$3, this.i);
            boolean $$11 = this.a($$0, $$2, $$3, $$4, $$5, $$6, $$7);
            this.a(this.i, $$0, $$3 + $$4, $$2, $$6, $$7);
            if (!$$11) {
               this.j.a($$8, this.aM_(), new fqe($$3, $$2, $$4, $$5));
            }
         }
      }

      private void a(flj $$0, int $$1, int $$2, int $$3) {
         int $$4 = this.b($$2);
         int $$5 = this.a($$1);
         xl $$6 = fev.a(this.i.t, this.i.d());
         int $$7 = this.a($$2, $$3, $$6);
         this.a($$0, this.i.b(), $$4, $$5, $$7, -1);
         if ($$6 != xk.a && !this.i.i()) {
            $$0.a(fev.this.p, $$6, $$7, $$5, -8355712, false);
         }
      }

      private void a(flj $$0, int $$1, int $$2) {
         int $$3 = this.b($$2);
         int $$4 = this.a($$1);
         int $$5 = this.c($$4);
         String $$6 = this.i.c();
         if (this.i.i() && $$6 != null) {
            xl $$7 = xl.b($$6).a(n.h);
            $$0.a(fev.this.p, xl.a("mco.selectServer.minigameName", $$7).b(-171), $$3, $$5, -1, false);
         } else {
            $$0.a(fev.this.p, this.i.a(), $$3, this.c($$4), -8355712, false);
         }
      }

      private boolean a(flj $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6) {
         List<ProfileResult> $$7 = fev.this.aI.a(this.i.a);
         if (!$$7.isEmpty()) {
            int $$8 = $$2 + $$3 - 21;
            int $$9 = $$1 + $$4 - 9 - 2;
            int $$10 = $$8;

            for (int $$11 = 0; $$11 < $$7.size(); $$11++) {
               $$10 -= 9 + ($$11 == 0 ? 0 : 3);
               fmv.a($$0, fjx.Q().an().b($$7.get($$11).profile()), $$10, $$9, 9);
            }

            if ($$5 >= $$10 && $$5 <= $$8 && $$6 >= $$9 && $$6 <= $$9 + 9) {
               $$0.a(fev.this.p, List.of(f), Optional.of(new ftv.a($$7)), $$5, $$6);
               return true;
            }
         }

         return false;
      }

      private void d() {
         fev.this.m.ak().a(hcl.a(awo.Av, 1.0F));
         fev.a(this.i, fev.this);
      }

      private void e() {
         fev.this.m.ak().a(hcl.a(awo.Av, 1.0F));
         fhl $$0 = new fhl(fev.this, this.i, this.i.h());
         fev.this.m.a($$0);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         if (this.i.e == fgb.c.c) {
            this.e();
         } else if (fev.this.a(this.i)) {
            if (ae.c() - fev.this.aL < 250L && this.aM_()) {
               this.d();
            }

            fev.this.aL = ae.c();
         }

         return true;
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         if (fpz.a($$0)) {
            if (this.i.e == fgb.c.c) {
               this.e();
               return true;
            }

            if (fev.this.a(this.i)) {
               this.d();
               return true;
            }
         }

         return super.a($$0, $$1, $$2);
      }

      @Override
      public xl a() {
         return (xl)(this.i.e == fgb.c.c ? fev.X : xl.a("narrator.select", this.i.c));
      }

      public fgb c() {
         return this.i;
      }
   }
}
