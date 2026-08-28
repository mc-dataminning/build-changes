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

public class fem extends hep {
   static final ali a = ali.b("icon/info");
   static final ali b = ali.b("icon/new_realm");
   static final ali c = ali.b("realm_status/expired");
   static final ali B = ali.b("realm_status/expires_soon");
   static final ali C = ali.b("realm_status/open");
   static final ali D = ali.b("realm_status/closed");
   private static final ali E = ali.b("icon/invite");
   private static final ali F = ali.b("icon/news");
   static final Logger G = LogUtils.getLogger();
   private static final ali H = ali.b("textures/gui/title/realms.png");
   private static final ali I = ali.b("textures/gui/realms/no_realms.png");
   private static final xi J = xi.c("menu.online");
   private static final xi K = xi.c("mco.selectServer.loading");
   static final xi L = xi.c("mco.selectServer.uninitialized");
   static final xi M = xi.c("mco.selectServer.expiredList");
   private static final xi N = xi.c("mco.selectServer.expiredRenew");
   static final xi O = xi.c("mco.selectServer.expiredTrial");
   private static final xi P = xi.c("mco.selectServer.play");
   private static final xi Q = xi.c("mco.selectServer.leave");
   private static final xi R = xi.c("mco.selectServer.configure");
   static final xi S = xi.c("mco.selectServer.expired");
   static final xi T = xi.c("mco.selectServer.expires.soon");
   static final xi U = xi.c("mco.selectServer.expires.day");
   static final xi V = xi.c("mco.selectServer.open");
   static final xi W = xi.c("mco.selectServer.closed");
   static final xi X = xi.a("gui.narrate.button", L);
   private static final xi Y = xi.c("mco.selectServer.noRealms");
   private static final xi Z = xi.c("mco.invites.nopending");
   private static final xi aa = xi.c("mco.invites.pending");
   private static final xi ab = xi.c("mco.compatibility.incompatible.popup.title");
   private static final xi ac = xi.c("mco.compatibility.incompatible.releaseType.popup.message");
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
   private final CompletableFuture<fel.a> au = fel.a();
   @Nullable
   private fho.c av;
   private final Set<UUID> aw = new HashSet<>();
   private static boolean ax;
   private final RateLimiter ay;
   private final fra az;
   private flh aA;
   private flh aB;
   private flh aC;
   private flh aD;
   private flh aE;
   fem.j aF;
   private fgh aG;
   private List<ffi> aH = List.of();
   ffl aI = new ffl();
   private volatile boolean aJ;
   @Nullable
   private volatile String aK;
   long aL;
   private final List<ffh> aM = new ArrayList<>();
   private flh aN;
   private fem.g aO;
   private fem.g aP;
   private fem.f aQ;
   @Nullable
   private fow aR;

   public fem(fra $$0) {
      super(J);
      this.az = $$0;
      this.ay = RateLimiter.create(0.016666668F);
   }

   @Override
   public void aR_() {
      this.aG = new fgh(this.m);
      this.aF = new fem.j();
      xi $$0 = xi.c("mco.invites.title");
      this.aO = new fem.g($$0, E, $$1x -> this.m.a(new fha(this, $$0)));
      xi $$1 = xi.c("mco.news");
      this.aP = new fem.g($$1, F, $$0x -> {
         String $$1x = this.aK;
         if ($$1x != null) {
            fpx.a(this, $$1x);
            if (this.aP.a() != 0) {
               fhu.a $$2 = fhu.b();
               $$2.b = false;
               fhu.b($$2);
               this.aP.a(0);
            }
         }
      });
      this.aP.a(fms.a($$1));
      this.aA = flh.a(P, $$0x -> a(this.N(), this)).a(100).a();
      this.aD = flh.a(R, $$0x -> this.f(this.N())).a(100).a();
      this.aC = flh.a(N, $$0x -> this.e(this.N())).a(100).a();
      this.aE = flh.a(Q, $$0x -> this.g(this.N())).a(100).a();
      this.aN = flh.a(xi.c("mco.selectServer.purchase"), $$0x -> this.O()).b(100, 20).a();
      this.aB = flh.a(xh.k, $$0x -> this.d()).a(100).a();
      if (fer.a == fer.b.b) {
         this.c(flo.a(xi.b("Snapshot"), xi.b("Release")).a(5, 5, 100, 20, xi.b("Realm"), ($$0x, $$1x) -> {
            at = $$1x;
            this.aH = List.of();
            this.J();
         }));
      }

      this.a(fem.f.a);
      this.G();
      this.au.thenAcceptAsync($$0x -> {
         fra $$1x = $$0x.a(this.az);
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
   public void d() {
      this.m.a(this.az);
   }

   private void D() {
      if (this.aG.a() && this.aH.isEmpty() && this.aM.isEmpty()) {
         this.a(fem.f.b);
      } else {
         this.a(fem.f.c);
      }
   }

   private void a(fem.f $$0) {
      if (this.aQ != $$0) {
         if (this.aR != null) {
            this.aR.a($$1 -> this.e($$1));
         }

         this.aR = this.b($$0);
         this.aQ = $$0;
         this.aR.a($$1 -> {
            flf var10000 = this.c($$1);
         });
         this.c();
      }
   }

   private fow b(fem.f $$0) {
      fow $$1 = new fow(this);
      $$1.b(44);
      $$1.a(this.E());
      fox $$2 = this.c($$0);
      $$2.a();
      $$1.a($$2.w() + 22);
      $$1.b($$2);
      switch ($$0) {
         case a:
            $$1.c(new flw(this.p, K));
            break;
         case b:
            $$1.c(this.F());
            break;
         case c:
            $$1.c(this.aF);
      }

      return $$1;
   }

   private fox E() {
      int $$0 = 90;
      fpa $$1 = fpa.e().a(4);
      $$1.c().e();
      $$1.a(this.aO);
      $$1.a(this.aP);
      fpa $$2 = fpa.e();
      $$2.c().e();
      $$2.a(fpb.a(90));
      $$2.a(flu.a(128, 34, H, 128, 64), foz::b);
      $$2.a(new fou(90, 44)).a($$1, foz::c);
      return $$2;
   }

   private fox c(fem.f $$0) {
      fov $$1 = new fov().c(4);
      fov.b $$2 = $$1.d(3);
      if ($$0 == fem.f.c) {
         $$2.a(this.aA);
         $$2.a(this.aD);
         $$2.a(this.aC);
         $$2.a(this.aE);
      }

      $$2.a(this.aN);
      $$2.a(this.aB);
      return $$1;
   }

   private fpa F() {
      fpa $$0 = fpa.d().a(8);
      $$0.c().b();
      $$0.a(flu.a(130, 64, I, 130, 64));
      fls $$1 = new fls(308, Y, this.p, false, 4);
      $$0.a($$1);
      return $$0;
   }

   void G() {
      ffi $$0 = this.N();
      this.aN.j = this.aQ != fem.f.a;
      this.aA.j = $$0 != null && this.a($$0);
      this.aC.j = $$0 != null && this.b($$0);
      this.aE.j = $$0 != null && this.d($$0);
      this.aD.j = $$0 != null && this.c($$0);
   }

   boolean a(ffi $$0) {
      boolean $$1 = !$$0.j && $$0.e == ffi.c.b;
      return $$1 && ($$0.d() || $$0.e() || i($$0));
   }

   private boolean b(ffi $$0) {
      return $$0.j && i($$0);
   }

   private boolean c(ffi $$0) {
      return i($$0) && $$0.e != ffi.c.c;
   }

   private boolean d(ffi $$0) {
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
      fji.Q().bc().d.a();
   }

   public static void g() {
      fji.Q().bc().c.a();
   }

   private void J() {
      for (fho.e<?> $$0 : this.m.bc().a()) {
         $$0.a();
      }
   }

   private fho.c a(fgf $$0) {
      fho.c $$1 = $$0.a.a();
      $$1.a($$0.c, $$0x -> {
         this.aG.a($$0x.a());
         this.aH = $$0x.b();
         this.K();
         boolean $$1x = false;

         for (ffi $$2 : this.aG) {
            if (this.j($$2)) {
               $$1x = true;
            }
         }

         if (!ax && $$1x) {
            ax = true;
            this.L();
         }
      });
      a(fer::d, $$0x -> {
         this.aM.clear();
         this.aM.addAll($$0x);

         for (ffh $$1x : $$0x) {
            if ($$1x instanceof ffh.a $$2) {
               fmj $$3 = $$2.a(this, this::a);
               if ($$3 != null) {
                  this.m.a($$3);
                  this.a(List.of($$1x));
                  break;
               }
            }
         }

         if (!this.aM.isEmpty() && this.aQ != fem.f.a) {
            this.K();
         }
      });
      $$1.a($$0.d, $$0x -> {
         this.aO.a($$0x);
         this.aO.a($$0x == 0 ? fms.a(Z) : fms.a(aa));
         if ($$0x > 0 && this.ay.tryAcquire(1)) {
            this.m.aZ().c(xi.a("mco.configure.world.invite.narration", $$0x));
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

   private void a(Collection<ffh> $$0) {
      List<UUID> $$1 = new ArrayList<>($$0.size());

      for (ffh $$2 : $$0) {
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

   private static <T> void a(fem.k<T> $$0, Consumer<T> $$1) {
      fji $$2 = fji.Q();
      CompletableFuture.<T>supplyAsync(() -> {
         try {
            return $$0.request(fer.a($$2));
         } catch (fgc var3) {
            throw new RuntimeException(var3);
         }
      }).thenAcceptAsync($$1, $$2).exceptionally($$0x -> {
         G.error("Failed to execute call to Realms Service", $$0x);
         return null;
      });
   }

   private void K() {
      ffi $$0 = this.N();
      this.aF.J();

      for (ffh $$1 : this.aM) {
         if (this.a($$1)) {
            this.a(List.of($$1));
            break;
         }
      }

      for (ffi $$2 : this.aH) {
         this.aF.a(new fem.a($$2));
      }

      for (ffi $$3 : this.aG) {
         fem.e $$4;
         if (b() && !$$3.h()) {
            if ($$3.e == ffi.c.c) {
               continue;
            }

            $$4 = new fem.i($$3);
         } else {
            $$4 = new fem.l($$3);
         }

         this.aF.a((fem.e)$$4);
         if ($$0 != null && $$0.a == $$3.a) {
            this.aF.a($$4);
         }
      }

      this.D();
      this.G();
   }

   private boolean a(ffh $$0) {
      if (!($$0 instanceof ffh.c $$1)) {
         return false;
      } else {
         xi $$2 = $$1.d();
         int $$3 = this.p.b($$2, 216);
         int $$4 = azk.e($$3 + 7, 36) - 1;
         this.aF.a(new fem.h($$2, $$4 + 2, $$1));

         for (int $$5 = 0; $$5 < $$4; $$5++) {
            this.aF.a(new fem.d());
         }

         this.aF.a(new fem.b($$1.a(this)));
         return true;
      }
   }

   private void L() {
      new Thread(() -> {
         List<ffq> $$0 = feq.a();
         fer $$1 = fer.a();
         ffd $$2 = new ffd();
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

      for (ffi $$1 : this.aG) {
         if (this.j($$1)) {
            $$0.add($$1.a);
         }
      }

      return $$0;
   }

   private void e(@Nullable ffi $$0) {
      if ($$0 != null) {
         String $$1 = ayg.a($$0.b, this.m.X().b(), $$0.k);
         this.m.p.a($$1);
         ae.m().a($$1);
      }
   }

   private void f(@Nullable ffi $$0) {
      if ($$0 != null && this.m.b($$0.g)) {
         this.m.a(new fgq(this, $$0.a));
      }
   }

   private void g(@Nullable ffi $$0) {
      if ($$0 != null && !this.m.b($$0.g)) {
         xi $$1 = xi.c("mco.configure.world.leave.question.line1");
         this.m.a(fhc.a(this, $$1, $$1x -> this.h($$0)));
      }
   }

   @Nullable
   private ffi N() {
      return this.aF.h() instanceof fem.l $$0 ? $$0.c() : null;
   }

   private void h(final ffi $$0) {
      (new Thread("Realms-leave-server") {
         @Override
         public void run() {
            try {
               fer $$0 = fer.a();
               $$0.d($$0.a);
               fem.this.m.execute(fem::g);
            } catch (fgc var2) {
               fem.G.error("Couldn't configure world", var2);
               fem.this.m.execute(() -> fem.this.m.a(new fgu(var2, fem.this)));
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
   public xi i() {
      return (xi)(switch (this.aQ) {
         case a -> xh.a(super.i(), K);
         case b -> xh.a(super.i(), Y);
         case c -> super.i();
      });
   }

   @Override
   public void a(fku $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (b()) {
         $$0.b(this.p, "Minecraft " + ab.b().c(), 2, this.o - 10, -1);
      }

      if (this.aJ && this.aN.j) {
         fgl.a($$0, this.aN);
      }

      switch (fer.a) {
         case b:
            this.a($$0, "STAGE!", -256);
            break;
         case c:
            this.a($$0, "LOCAL!", 8388479);
      }
   }

   private void O() {
      this.m.a(new fgl(this, this.aJ));
   }

   public static void a(@Nullable ffi $$0, fra $$1) {
      a($$0, $$1, false);
   }

   public static void a(@Nullable ffi $$0, fra $$1, boolean $$2) {
      if ($$0 != null) {
         if (!b() || $$2 || $$0.i()) {
            fji.Q().a(new fgw($$1, new fif($$1, $$0)));
            return;
         }

         switch ($$0.u) {
            case f:
               fji.Q().a(new fgw($$1, new fif($$1, $$0)));
               break;
            case a:
               a($$0, $$1, xi.c("mco.compatibility.unverifiable.title").b(-171), xi.c("mco.compatibility.unverifiable.message"), xh.j);
               break;
            case d:
               a(
                  $$0,
                  $$1,
                  xi.c("selectWorld.backupQuestion.downgrade").b(-2142128),
                  xi.a("mco.compatibility.downgrade.description", xi.b($$0.t).b(-171), xi.b(ab.b().c()).b(-171)),
                  xi.c("mco.compatibility.downgrade")
               );
               break;
            case e:
               b($$0, $$1);
               break;
            case b:
               fji.Q()
                  .a(
                     new fmj.a($$1, ab)
                        .a(xi.a("mco.compatibility.incompatible.series.popup.message", xi.b($$0.t).b(-171), xi.b(ab.b().c()).b(-171)))
                        .a(xh.k, fmj::d)
                        .a()
                  );
               break;
            case c:
               fji.Q().a(new fmj.a($$1, ab).a(ac).a(xh.k, fmj::d).a());
         }
      }
   }

   private static void a(ffi $$0, fra $$1, xi $$2, xi $$3, xi $$4) {
      fji.Q().a(new fmj.a($$1, $$2).a($$3).a($$4, $$2x -> {
         fji.Q().a(new fgw($$1, new fif($$1, $$0)));
         g();
      }).a(xh.e, fmj::d).a());
   }

   private static void b(ffi $$0, fra $$1) {
      xi $$2 = xi.c("mco.compatibility.upgrade.title").b(-171);
      xi $$3 = xi.c("mco.compatibility.upgrade");
      xi $$4 = xi.b($$0.t).b(-171);
      xi $$5 = xi.b(ab.b().c()).b(-171);
      xi $$6 = i($$0) ? xi.a("mco.compatibility.upgrade.description", $$4, $$5) : xi.a("mco.compatibility.upgrade.friend.description", $$4, $$5);
      a($$0, $$1, $$2, $$6, $$3);
   }

   public static xi a(String $$0, boolean $$1) {
      return a($$0, $$1 ? -8355712 : -2142128);
   }

   public static xi a(String $$0, int $$1) {
      return (xi)(StringUtils.isBlank($$0) ? xh.a : xi.a("mco.version", xi.b($$0).b($$1)));
   }

   static boolean i(ffi $$0) {
      return fji.Q().b($$0.g);
   }

   private boolean j(ffi $$0) {
      return i($$0) && !$$0.j;
   }

   private void a(fku $$0, String $$1, int $$2) {
      $$0.c().a();
      $$0.c().a((float)(this.n / 2 - 25), 20.0F, 0.0F);
      $$0.c().a(a.f.rotationDegrees(-20.0F));
      $$0.c().b(1.5F, 1.5F, 1.5F);
      $$0.a(this.p, $$1, 0, 0, $$2, false);
      $$0.c().b();
   }

   class a extends fem.e {
      private static final xi f = xi.c("mco.snapshot.start");
      private static final int g = 5;
      private final fmv h = new fmv();
      private final ffi i;

      public a(final ffi $$0) {
         this.i = $$0;
         this.h.a(fms.a(xi.c("mco.snapshot.tooltip")));
      }

      @Override
      public void a(fku $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(gir::B, fem.b, $$3 - 5, $$2 + $$5 / 2 - 10, 40, 20);
         int $$10 = $$2 + $$5 / 2 - 9 / 2;
         $$0.b(fem.this.p, f, $$3 + 40 - 2, $$10 - 5, 8388479);
         $$0.b(fem.this.p, xi.a("mco.snapshot.description", this.i.c), $$3 + 40 - 2, $$10 + 5, -8355712);
         this.h.a($$8, this.aM_(), new fpp($$3, $$2, $$4, $$5));
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         this.c();
         return true;
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         if (fpk.a($$0)) {
            this.c();
            return true;
         } else {
            return super.a($$0, $$1, $$2);
         }
      }

      private void c() {
         fem.this.m.ak().a(hbv.a(awl.Av, 1.0F));
         fem.this.m
            .a(
               new fmj.a(fem.this, xi.c("mco.snapshot.createSnapshotPopup.title"))
                  .a(xi.c("mco.snapshot.createSnapshotPopup.text"))
                  .a(xi.c("mco.selectServer.create"), $$0 -> fem.this.m.a(new fgs(fem.this, this.i.a)))
                  .a(xh.e, fmj::d)
                  .a()
            );
      }

      @Override
      public xi a() {
         return xi.a("gui.narrate.button", xh.a(f, xi.a("mco.snapshot.description", this.i.c)));
      }
   }

   class b extends fem.e {
      private final flh f;

      public b(final flh $$0) {
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
      public void a(fku $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.f.c(fem.this.n / 2 - 75, $$2 + 4);
         this.f.a($$0, $$6, $$7, $$9);
      }

      @Override
      public void a(boolean $$0) {
         super.a($$0);
         this.f.a($$0);
      }

      @Override
      public xi a() {
         return this.f.z();
      }
   }

   static class c extends flt {
      private static final fmu b = new fmu(ali.b("widget/cross_button"), ali.b("widget/cross_button_highlighted"));

      protected c(flh.c $$0, xi $$1) {
         super(0, 0, 14, 14, b, $$0);
         this.a(fms.a($$1));
      }
   }

   class d extends fem.e {
      @Override
      public void a(fku $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
      }

      @Override
      public xi a() {
         return xi.i();
      }
   }

   abstract class e extends fmd.a<fem.e> {
      protected static final int b = 10;
      private static final int a = 28;
      protected static final int c = 7;
      protected static final int d = 2;

      protected void a(ffi $$0, fku $$1, int $$2, int $$3, int $$4, int $$5) {
         int $$6 = $$2 - 10 - 7;
         int $$7 = $$3 + 2;
         if ($$0.j) {
            this.a($$1, $$6, $$7, $$4, $$5, fem.c, () -> fem.S);
         } else if ($$0.e == ffi.c.a) {
            this.a($$1, $$6, $$7, $$4, $$5, fem.D, () -> fem.W);
         } else if (fem.i($$0) && $$0.l < 7) {
            this.a($$1, $$6, $$7, $$4, $$5, fem.B, () -> {
               if ($$0.l <= 0) {
                  return fem.T;
               } else {
                  return (xi)($$0.l == 1 ? fem.U : xi.a("mco.selectServer.expires.days", $$0.l));
               }
            });
         } else if ($$0.e == ffi.c.b) {
            this.a($$1, $$6, $$7, $$4, $$5, fem.C, () -> fem.V);
         }
      }

      private void a(fku $$0, int $$1, int $$2, int $$3, int $$4, ali $$5, Supplier<xi> $$6) {
         $$0.a(gir::B, $$5, $$1, $$2, 10, 28);
         if (fem.this.aF.c((double)$$3, (double)$$4) && $$3 >= $$1 && $$3 <= $$1 + 10 && $$4 >= $$2 && $$4 <= $$2 + 28) {
            fem.this.d($$6.get());
         }
      }

      protected void a(fku $$0, int $$1, int $$2, ffi $$3) {
         int $$4 = this.b($$2);
         int $$5 = this.a($$1);
         int $$6 = this.d($$5);
         if (!fem.i($$3)) {
            $$0.a(fem.this.p, $$3.f, $$4, this.d($$5), -8355712, false);
         } else if ($$3.j) {
            xi $$7 = $$3.k ? fem.O : fem.M;
            $$0.a(fem.this.p, $$7, $$4, $$6, -2142128, false);
         }
      }

      protected void a(fku $$0, String $$1, int $$2, int $$3, int $$4, int $$5) {
         int $$6 = $$4 - $$2;
         if (fem.this.p.b($$1) > $$6) {
            String $$7 = fem.this.p.a($$1, $$6 - fem.this.p.b("... "));
            $$0.a(fem.this.p, $$7 + "...", $$2, $$3, $$5, false);
         } else {
            $$0.a(fem.this.p, $$1, $$2, $$3, $$5, false);
         }
      }

      protected int a(int $$0, int $$1, xi $$2) {
         return $$0 + $$1 - fem.this.p.a($$2) - 20;
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

   static class g extends fmm.b {
      private static final ali[] d = new ali[]{
         ali.b("notification/1"),
         ali.b("notification/2"),
         ali.b("notification/3"),
         ali.b("notification/4"),
         ali.b("notification/5"),
         ali.b("notification/more")
      };
      private static final int u = Integer.MAX_VALUE;
      private static final int v = 20;
      private static final int w = 14;
      private int x;

      public g(xi $$0, ali $$1, flh.c $$2) {
         super(20, 20, $$0, 14, 14, $$1, $$2, null);
      }

      int a() {
         return this.x;
      }

      public void a(int $$0) {
         this.x = $$0;
      }

      @Override
      public void b(fku $$0, int $$1, int $$2, float $$3) {
         super.b($$0, $$1, $$2, $$3);
         if (this.j && this.x != 0) {
            this.a($$0);
         }
      }

      private void a(fku $$0) {
         $$0.a(gir::B, d[Math.min(this.x, 6) - 1], this.D() + this.y() - 5, this.E() - 3, 8, 8);
      }
   }

   class h extends fem.e {
      private static final int f = 40;
      private static final int g = -12303292;
      private final xi h;
      private final int i;
      private final List<flf> j = new ArrayList<>();
      @Nullable
      private final fem.c k;
      private final fmb l;
      private final fov m;
      private final fou n;
      private int o = -1;

      public h(final xi $$0, final int $$1, final ffh $$2) {
         this.h = $$0;
         this.i = $$1;
         this.m = new fov();
         int $$3 = 7;
         this.m.a(flu.a(20, 20, fem.a), 0, 0, this.m.b().a(7, 7, 0, 0));
         this.m.a(fpb.a(40), 0, 0);
         this.n = this.m.a(new fou(0, 9 * 3 * ($$1 - 1)), 0, 1, this.m.b().c(7));
         this.l = this.n.a(new fmb($$0, fem.this.p).b(true), this.n.b().b().d());
         this.m.a(fpb.a(40), 0, 2);
         if ($$2.b()) {
            this.k = this.m.a(new fem.c($$1x -> fem.this.a($$2.c()), xi.c("mco.notification.dismiss")), 0, 2, this.m.b().c().a(0, 7, 7, 0));
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
      public void b(fku $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         super.b($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
         $$0.b($$3 - 2, $$2 - 2, $$4, 36 * this.i - 2, -12303292);
      }

      @Override
      public void a(fku $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
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
      public xi a() {
         return this.h;
      }
   }

   class i extends fem.e {
      private final ffi f;
      private final fmv g = new fmv();

      public i(final ffi $$0) {
         this.f = $$0;
         if (!$$0.j) {
            this.g.a(fms.a(xi.c("mco.snapshot.parent.tooltip")));
         }
      }

      @Override
      public void a(fku $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = this.b($$3);
         int $$11 = this.a($$2);
         fhw.a($$0, $$3, $$2, 32, this.f.g);
         xi $$12 = fem.a(this.f.t, -8355712);
         int $$13 = this.a($$3, $$4, $$12);
         this.a($$0, this.f.b(), $$10, $$11, $$13, -8355712);
         if ($$12 != xh.a) {
            $$0.a(fem.this.p, $$12, $$13, $$11, -8355712, false);
         }

         $$0.a(fem.this.p, this.f.a(), $$10, this.c($$11), -8355712, false);
         this.a($$0, $$2, $$3, this.f);
         this.a(this.f, $$0, $$3 + $$4, $$2, $$6, $$7);
         this.g.a($$8, this.aM_(), new fpp($$3, $$2, $$4, $$5));
      }

      @Override
      public xi a() {
         return xi.b(this.f.c);
      }
   }

   class j extends heo<fem.e> {
      public j() {
         super(fem.this.n, fem.this.o, 0, 36);
      }

      public void a(@Nullable fem.e $$0) {
         super.a($$0);
         fem.this.G();
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
      T request(fer var1) throws fgc;
   }

   class l extends fem.e {
      private static final xi f = xi.c("mco.onlinePlayers");
      private static final int g = 9;
      private static final int h = 36;
      private final ffi i;
      private final fmv j = new fmv();

      public l(final ffi $$0) {
         this.i = $$0;
         boolean $$1 = fem.i($$0);
         if (fem.b() && $$1 && $$0.h()) {
            this.j.a(fms.a(xi.a("mco.snapshot.paired", $$0.s)));
         } else if (!$$1 && $$0.f()) {
            this.j.a(fms.a(xi.a("mco.snapshot.friendsRealm.downgrade", $$0.t)));
         }
      }

      @Override
      public void a(fku $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         if (this.i.e == ffi.c.c) {
            $$0.a(gir::B, fem.b, $$3 - 5, $$2 + $$5 / 2 - 10, 40, 20);
            int $$10 = $$2 + $$5 / 2 - 9 / 2;
            $$0.b(fem.this.p, fem.L, $$3 + 40 - 2, $$10, 8388479);
         } else {
            this.a(this.i, $$0, $$3 + 36, $$2, $$6, $$7);
            fhw.a($$0, $$3, $$2, 32, this.i.g);
            this.a($$0, $$2, $$3, $$4);
            this.a($$0, $$2, $$3);
            this.a($$0, $$2, $$3, this.i);
            boolean $$11 = this.a($$0, $$2, $$3, $$4, $$5, $$6, $$7);
            this.a(this.i, $$0, $$3 + $$4, $$2, $$6, $$7);
            if (!$$11) {
               this.j.a($$8, this.aM_(), new fpp($$3, $$2, $$4, $$5));
            }
         }
      }

      private void a(fku $$0, int $$1, int $$2, int $$3) {
         int $$4 = this.b($$2);
         int $$5 = this.a($$1);
         xi $$6 = fem.a(this.i.t, this.i.d());
         int $$7 = this.a($$2, $$3, $$6);
         this.a($$0, this.i.b(), $$4, $$5, $$7, -1);
         if ($$6 != xh.a && !this.i.i()) {
            $$0.a(fem.this.p, $$6, $$7, $$5, -8355712, false);
         }
      }

      private void a(fku $$0, int $$1, int $$2) {
         int $$3 = this.b($$2);
         int $$4 = this.a($$1);
         int $$5 = this.c($$4);
         String $$6 = this.i.c();
         if (this.i.i() && $$6 != null) {
            xi $$7 = xi.b($$6).a(n.h);
            $$0.a(fem.this.p, xi.a("mco.selectServer.minigameName", $$7).b(-171), $$3, $$5, -1, false);
         } else {
            $$0.a(fem.this.p, this.i.a(), $$3, this.c($$4), -8355712, false);
         }
      }

      private boolean a(fku $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6) {
         List<ProfileResult> $$7 = fem.this.aI.a(this.i.a);
         if (!$$7.isEmpty()) {
            int $$8 = $$2 + $$3 - 21;
            int $$9 = $$1 + $$4 - 9 - 2;
            int $$10 = $$8;

            for (int $$11 = 0; $$11 < $$7.size(); $$11++) {
               $$10 -= 9 + ($$11 == 0 ? 0 : 3);
               fmg.a($$0, fji.Q().an().b($$7.get($$11).profile()), $$10, $$9, 9);
            }

            if ($$5 >= $$10 && $$5 <= $$8 && $$6 >= $$9 && $$6 <= $$9 + 9) {
               $$0.a(fem.this.p, List.of(f), Optional.of(new ftg.a($$7)), $$5, $$6);
               return true;
            }
         }

         return false;
      }

      private void d() {
         fem.this.m.ak().a(hbv.a(awl.Av, 1.0F));
         fem.a(this.i, fem.this);
      }

      private void e() {
         fem.this.m.ak().a(hbv.a(awl.Av, 1.0F));
         fgs $$0 = new fgs(fem.this, this.i);
         fem.this.m.a($$0);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         if (this.i.e == ffi.c.c) {
            this.e();
         } else if (fem.this.a(this.i)) {
            if (ae.c() - fem.this.aL < 250L && this.aM_()) {
               this.d();
            }

            fem.this.aL = ae.c();
         }

         return true;
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         if (fpk.a($$0)) {
            if (this.i.e == ffi.c.c) {
               this.e();
               return true;
            }

            if (fem.this.a(this.i)) {
               this.d();
               return true;
            }
         }

         return super.a($$0, $$1, $$2);
      }

      @Override
      public xi a() {
         return (xi)(this.i.e == ffi.c.c ? fem.X : xi.a("narrator.select", this.i.c));
      }

      public ffi c() {
         return this.i;
      }
   }
}
