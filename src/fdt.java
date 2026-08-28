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

public class fdt extends hdp {
   static final ale a = ale.b("icon/info");
   static final ale b = ale.b("icon/new_realm");
   static final ale c = ale.b("realm_status/expired");
   static final ale B = ale.b("realm_status/expires_soon");
   static final ale C = ale.b("realm_status/open");
   static final ale D = ale.b("realm_status/closed");
   private static final ale E = ale.b("icon/invite");
   private static final ale F = ale.b("icon/news");
   static final Logger G = LogUtils.getLogger();
   private static final ale H = ale.b("textures/gui/title/realms.png");
   private static final ale I = ale.b("textures/gui/realms/no_realms.png");
   private static final xe J = xe.c("menu.online");
   private static final xe K = xe.c("mco.selectServer.loading");
   static final xe L = xe.c("mco.selectServer.uninitialized");
   static final xe M = xe.c("mco.selectServer.expiredList");
   private static final xe N = xe.c("mco.selectServer.expiredRenew");
   static final xe O = xe.c("mco.selectServer.expiredTrial");
   private static final xe P = xe.c("mco.selectServer.play");
   private static final xe Q = xe.c("mco.selectServer.leave");
   private static final xe R = xe.c("mco.selectServer.configure");
   static final xe S = xe.c("mco.selectServer.expired");
   static final xe T = xe.c("mco.selectServer.expires.soon");
   static final xe U = xe.c("mco.selectServer.expires.day");
   static final xe V = xe.c("mco.selectServer.open");
   static final xe W = xe.c("mco.selectServer.closed");
   static final xe X = xe.a("gui.narrate.button", L);
   private static final xe Y = xe.c("mco.selectServer.noRealms");
   private static final xe Z = xe.c("mco.invites.nopending");
   private static final xe aa = xe.c("mco.invites.pending");
   private static final xe ab = xe.c("mco.compatibility.incompatible.popup.title");
   private static final xe ac = xe.c("mco.compatibility.incompatible.releaseType.popup.message");
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
   private final CompletableFuture<fds.a> au = fds.a();
   @Nullable
   private fgv.c av;
   private final Set<UUID> aw = new HashSet<>();
   private static boolean ax;
   private final RateLimiter ay;
   private final fqh az;
   private fko aA;
   private fko aB;
   private fko aC;
   private fko aD;
   private fko aE;
   fdt.j aF;
   private ffo aG;
   private List<fep> aH = List.of();
   fes aI = new fes();
   private volatile boolean aJ;
   @Nullable
   private volatile String aK;
   long aL;
   private final List<feo> aM = new ArrayList<>();
   private fko aN;
   private fdt.g aO;
   private fdt.g aP;
   private fdt.f aQ;
   @Nullable
   private foc aR;

   public fdt(fqh $$0) {
      super(J);
      this.az = $$0;
      this.ay = RateLimiter.create(0.016666668F);
   }

   @Override
   public void aS_() {
      this.aG = new ffo(this.m);
      this.aF = new fdt.j();
      xe $$0 = xe.c("mco.invites.title");
      this.aO = new fdt.g($$0, E, $$1x -> this.m.a(new fgh(this, $$0)));
      xe $$1 = xe.c("mco.news");
      this.aP = new fdt.g($$1, F, $$0x -> {
         String $$1x = this.aK;
         if ($$1x != null) {
            fpe.a(this, $$1x);
            if (this.aP.a() != 0) {
               fhb.a $$2 = fhb.b();
               $$2.b = false;
               fhb.b($$2);
               this.aP.a(0);
            }
         }
      });
      this.aP.a(flz.a($$1));
      this.aA = fko.a(P, $$0x -> a(this.N(), this)).a(100).a();
      this.aD = fko.a(R, $$0x -> this.f(this.N())).a(100).a();
      this.aC = fko.a(N, $$0x -> this.e(this.N())).a(100).a();
      this.aE = fko.a(Q, $$0x -> this.g(this.N())).a(100).a();
      this.aN = fko.a(xe.c("mco.selectServer.purchase"), $$0x -> this.O()).b(100, 20).a();
      this.aB = fko.a(xd.k, $$0x -> this.d()).a(100).a();
      if (fdy.a == fdy.b.b) {
         this.c(fkv.a(xe.b("Snapshot"), xe.b("Release")).a(5, 5, 100, 20, xe.b("Realm"), ($$0x, $$1x) -> {
            at = $$1x;
            this.aH = List.of();
            this.J();
         }));
      }

      this.a(fdt.f.a);
      this.G();
      this.au.thenAcceptAsync($$0x -> {
         fqh $$1x = $$0x.a(this.az);
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
         this.a(fdt.f.b);
      } else {
         this.a(fdt.f.c);
      }
   }

   private void a(fdt.f $$0) {
      if (this.aQ != $$0) {
         if (this.aR != null) {
            this.aR.a($$1 -> this.e($$1));
         }

         this.aR = this.b($$0);
         this.aQ = $$0;
         this.aR.a($$1 -> {
            fkm var10000 = this.c($$1);
         });
         this.c();
      }
   }

   private foc b(fdt.f $$0) {
      foc $$1 = new foc(this);
      $$1.b(44);
      $$1.a(this.E());
      fod $$2 = this.c($$0);
      $$2.a();
      $$1.a($$2.w() + 22);
      $$1.b($$2);
      switch ($$0) {
         case a:
            $$1.c(new fld(this.p, K));
            break;
         case b:
            $$1.c(this.F());
            break;
         case c:
            $$1.c(this.aF);
      }

      return $$1;
   }

   private fod E() {
      int $$0 = 90;
      fog $$1 = fog.e().a(4);
      $$1.c().e();
      $$1.a(this.aO);
      $$1.a(this.aP);
      fog $$2 = fog.e();
      $$2.c().e();
      $$2.a(foh.a(90));
      $$2.a(flb.a(128, 34, H, 128, 64), fof::b);
      $$2.a(new foa(90, 44)).a($$1, fof::c);
      return $$2;
   }

   private fod c(fdt.f $$0) {
      fob $$1 = new fob().c(4);
      fob.b $$2 = $$1.d(3);
      if ($$0 == fdt.f.c) {
         $$2.a(this.aA);
         $$2.a(this.aD);
         $$2.a(this.aC);
         $$2.a(this.aE);
      }

      $$2.a(this.aN);
      $$2.a(this.aB);
      return $$1;
   }

   private fog F() {
      fog $$0 = fog.d().a(8);
      $$0.c().b();
      $$0.a(flb.a(130, 64, I, 130, 64));
      fkz $$1 = new fkz(308, Y, this.p, false, 4);
      $$0.a($$1);
      return $$0;
   }

   void G() {
      fep $$0 = this.N();
      this.aN.j = this.aQ != fdt.f.a;
      this.aA.j = $$0 != null && this.a($$0);
      this.aC.j = $$0 != null && this.b($$0);
      this.aE.j = $$0 != null && this.d($$0);
      this.aD.j = $$0 != null && this.c($$0);
   }

   boolean a(fep $$0) {
      boolean $$1 = !$$0.j && $$0.e == fep.c.b;
      return $$1 && ($$0.d() || $$0.e() || i($$0));
   }

   private boolean b(fep $$0) {
      return $$0.j && i($$0);
   }

   private boolean c(fep $$0) {
      return i($$0) && $$0.e != fep.c.c;
   }

   private boolean d(fep $$0) {
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
      fip.Q().bc().d.a();
   }

   public static void g() {
      fip.Q().bc().c.a();
   }

   private void J() {
      for (fgv.e<?> $$0 : this.m.bc().a()) {
         $$0.a();
      }
   }

   private fgv.c a(ffm $$0) {
      fgv.c $$1 = $$0.a.a();
      $$1.a($$0.c, $$0x -> {
         this.aG.a($$0x.a());
         this.aH = $$0x.b();
         this.K();
         boolean $$1x = false;

         for (fep $$2 : this.aG) {
            if (this.j($$2)) {
               $$1x = true;
            }
         }

         if (!ax && $$1x) {
            ax = true;
            this.L();
         }
      });
      a(fdy::d, $$0x -> {
         this.aM.clear();
         this.aM.addAll($$0x);

         for (feo $$1x : $$0x) {
            if ($$1x instanceof feo.a $$2) {
               flq $$3 = $$2.a(this, this::a);
               if ($$3 != null) {
                  this.m.a($$3);
                  this.a(List.of($$1x));
                  break;
               }
            }
         }

         if (!this.aM.isEmpty() && this.aQ != fdt.f.a) {
            this.K();
         }
      });
      $$1.a($$0.d, $$0x -> {
         this.aO.a($$0x);
         this.aO.a($$0x == 0 ? flz.a(Z) : flz.a(aa));
         if ($$0x > 0 && this.ay.tryAcquire(1)) {
            this.m.aZ().c(xe.a("mco.configure.world.invite.narration", $$0x));
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

   private void a(Collection<feo> $$0) {
      List<UUID> $$1 = new ArrayList<>($$0.size());

      for (feo $$2 : $$0) {
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

   private static <T> void a(fdt.k<T> $$0, Consumer<T> $$1) {
      fip $$2 = fip.Q();
      CompletableFuture.<T>supplyAsync(() -> {
         try {
            return $$0.request(fdy.a($$2));
         } catch (ffj var3) {
            throw new RuntimeException(var3);
         }
      }).thenAcceptAsync($$1, $$2).exceptionally($$0x -> {
         G.error("Failed to execute call to Realms Service", $$0x);
         return null;
      });
   }

   private void K() {
      fep $$0 = this.N();
      this.aF.J();

      for (feo $$1 : this.aM) {
         if (this.a($$1)) {
            this.a(List.of($$1));
            break;
         }
      }

      for (fep $$2 : this.aH) {
         this.aF.a(new fdt.a($$2));
      }

      for (fep $$3 : this.aG) {
         fdt.e $$4;
         if (b() && !$$3.h()) {
            if ($$3.e == fep.c.c) {
               continue;
            }

            $$4 = new fdt.i($$3);
         } else {
            $$4 = new fdt.l($$3);
         }

         this.aF.a((fdt.e)$$4);
         if ($$0 != null && $$0.a == $$3.a) {
            this.aF.a($$4);
         }
      }

      this.D();
      this.G();
   }

   private boolean a(feo $$0) {
      if (!($$0 instanceof feo.c $$1)) {
         return false;
      } else {
         xe $$2 = $$1.d();
         int $$3 = this.p.b($$2, 216);
         int $$4 = azf.e($$3 + 7, 36) - 1;
         this.aF.a(new fdt.h($$2, $$4 + 2, $$1));

         for (int $$5 = 0; $$5 < $$4; $$5++) {
            this.aF.a(new fdt.d());
         }

         this.aF.a(new fdt.b($$1.a(this)));
         return true;
      }
   }

   private void L() {
      new Thread(() -> {
         List<fex> $$0 = fdx.a();
         fdy $$1 = fdy.a();
         fek $$2 = new fek();
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

      for (fep $$1 : this.aG) {
         if (this.j($$1)) {
            $$0.add($$1.a);
         }
      }

      return $$0;
   }

   private void e(@Nullable fep $$0) {
      if ($$0 != null) {
         String $$1 = ayb.a($$0.b, this.m.X().b(), $$0.k);
         this.m.p.a($$1);
         ad.m().a($$1);
      }
   }

   private void f(@Nullable fep $$0) {
      if ($$0 != null && this.m.b($$0.g)) {
         this.m.a(new ffx(this, $$0.a));
      }
   }

   private void g(@Nullable fep $$0) {
      if ($$0 != null && !this.m.b($$0.g)) {
         xe $$1 = xe.c("mco.configure.world.leave.question.line1");
         this.m.a(fgj.a(this, $$1, $$1x -> this.h($$0)));
      }
   }

   @Nullable
   private fep N() {
      return this.aF.h() instanceof fdt.l $$0 ? $$0.c() : null;
   }

   private void h(final fep $$0) {
      (new Thread("Realms-leave-server") {
         @Override
         public void run() {
            try {
               fdy $$0 = fdy.a();
               $$0.d($$0.a);
               fdt.this.m.execute(fdt::g);
            } catch (ffj var2) {
               fdt.G.error("Couldn't configure world", var2);
               fdt.this.m.execute(() -> fdt.this.m.a(new fgb(var2, fdt.this)));
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
   public xe i() {
      return (xe)(switch (this.aQ) {
         case a -> xd.a(super.i(), K);
         case b -> xd.a(super.i(), Y);
         case c -> super.i();
      });
   }

   @Override
   public void a(fkb $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (b()) {
         $$0.b(this.p, "Minecraft " + ab.b().c(), 2, this.o - 10, -1);
      }

      if (this.aJ && this.aN.j) {
         ffs.a($$0, this.aN);
      }

      switch (fdy.a) {
         case b:
            this.a($$0, "STAGE!", -256);
            break;
         case c:
            this.a($$0, "LOCAL!", 8388479);
      }
   }

   private void O() {
      this.m.a(new ffs(this, this.aJ));
   }

   public static void a(@Nullable fep $$0, fqh $$1) {
      a($$0, $$1, false);
   }

   public static void a(@Nullable fep $$0, fqh $$1, boolean $$2) {
      if ($$0 != null) {
         if (!b() || $$2 || $$0.i()) {
            fip.Q().a(new fgd($$1, new fhm($$1, $$0)));
            return;
         }

         switch ($$0.u) {
            case f:
               fip.Q().a(new fgd($$1, new fhm($$1, $$0)));
               break;
            case a:
               a($$0, $$1, xe.c("mco.compatibility.unverifiable.title").b(-171), xe.c("mco.compatibility.unverifiable.message"), xd.j);
               break;
            case d:
               a(
                  $$0,
                  $$1,
                  xe.c("selectWorld.backupQuestion.downgrade").b(-2142128),
                  xe.a("mco.compatibility.downgrade.description", xe.b($$0.t).b(-171), xe.b(ab.b().c()).b(-171)),
                  xe.c("mco.compatibility.downgrade")
               );
               break;
            case e:
               b($$0, $$1);
               break;
            case b:
               fip.Q()
                  .a(
                     new flq.a($$1, ab)
                        .a(xe.a("mco.compatibility.incompatible.series.popup.message", xe.b($$0.t).b(-171), xe.b(ab.b().c()).b(-171)))
                        .a(xd.k, flq::d)
                        .a()
                  );
               break;
            case c:
               fip.Q().a(new flq.a($$1, ab).a(ac).a(xd.k, flq::d).a());
         }
      }
   }

   private static void a(fep $$0, fqh $$1, xe $$2, xe $$3, xe $$4) {
      fip.Q().a(new flq.a($$1, $$2).a($$3).a($$4, $$2x -> {
         fip.Q().a(new fgd($$1, new fhm($$1, $$0)));
         g();
      }).a(xd.e, flq::d).a());
   }

   private static void b(fep $$0, fqh $$1) {
      xe $$2 = xe.c("mco.compatibility.upgrade.title").b(-171);
      xe $$3 = xe.c("mco.compatibility.upgrade");
      xe $$4 = xe.b($$0.t).b(-171);
      xe $$5 = xe.b(ab.b().c()).b(-171);
      xe $$6 = i($$0) ? xe.a("mco.compatibility.upgrade.description", $$4, $$5) : xe.a("mco.compatibility.upgrade.friend.description", $$4, $$5);
      a($$0, $$1, $$2, $$6, $$3);
   }

   public static xe a(String $$0, boolean $$1) {
      return a($$0, $$1 ? -8355712 : -2142128);
   }

   public static xe a(String $$0, int $$1) {
      return (xe)(StringUtils.isBlank($$0) ? xd.a : xe.a("mco.version", xe.b($$0).b($$1)));
   }

   static boolean i(fep $$0) {
      return fip.Q().b($$0.g);
   }

   private boolean j(fep $$0) {
      return i($$0) && !$$0.j;
   }

   private void a(fkb $$0, String $$1, int $$2) {
      $$0.c().a();
      $$0.c().a((float)(this.n / 2 - 25), 20.0F, 0.0F);
      $$0.c().a(a.f.rotationDegrees(-20.0F));
      $$0.c().b(1.5F, 1.5F, 1.5F);
      $$0.a(this.p, $$1, 0, 0, $$2, false);
      $$0.c().b();
   }

   class a extends fdt.e {
      private static final xe f = xe.c("mco.snapshot.start");
      private static final int g = 5;
      private final fmc h = new fmc();
      private final fep i;

      public a(final fep $$0) {
         this.i = $$0;
         this.h.a(flz.a(xe.c("mco.snapshot.tooltip")));
      }

      @Override
      public void a(fkb $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(ghv::B, fdt.b, $$3 - 5, $$2 + $$5 / 2 - 10, 40, 20);
         int $$10 = $$2 + $$5 / 2 - 9 / 2;
         $$0.b(fdt.this.p, f, $$3 + 40 - 2, $$10 - 5, 8388479);
         $$0.b(fdt.this.p, xe.a("mco.snapshot.description", this.i.c), $$3 + 40 - 2, $$10 + 5, -8355712);
         this.h.a($$8, this.aN_(), new fow($$3, $$2, $$4, $$5));
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         this.c();
         return true;
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         if (foq.a($$0)) {
            this.c();
            return true;
         } else {
            return super.a($$0, $$1, $$2);
         }
      }

      private void c() {
         fdt.this.m.ak().a(hav.a(awg.Ax, 1.0F));
         fdt.this.m
            .a(
               new flq.a(fdt.this, xe.c("mco.snapshot.createSnapshotPopup.title"))
                  .a(xe.c("mco.snapshot.createSnapshotPopup.text"))
                  .a(xe.c("mco.selectServer.create"), $$0 -> fdt.this.m.a(new ffz(fdt.this, this.i.a)))
                  .a(xd.e, flq::d)
                  .a()
            );
      }

      @Override
      public xe a() {
         return xe.a("gui.narrate.button", xd.a(f, xe.a("mco.snapshot.description", this.i.c)));
      }
   }

   class b extends fdt.e {
      private final fko f;

      public b(final fko $$0) {
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
      public void a(fkb $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.f.c(fdt.this.n / 2 - 75, $$2 + 4);
         this.f.a($$0, $$6, $$7, $$9);
      }

      @Override
      public void a(boolean $$0) {
         super.a($$0);
         this.f.a($$0);
      }

      @Override
      public xe a() {
         return this.f.z();
      }
   }

   static class c extends fla {
      private static final fmb b = new fmb(ale.b("widget/cross_button"), ale.b("widget/cross_button_highlighted"));

      protected c(fko.c $$0, xe $$1) {
         super(0, 0, 14, 14, b, $$0);
         this.a(flz.a($$1));
      }
   }

   class d extends fdt.e {
      @Override
      public void a(fkb $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
      }

      @Override
      public xe a() {
         return xe.i();
      }
   }

   abstract class e extends flk.a<fdt.e> {
      protected static final int b = 10;
      private static final int a = 28;
      protected static final int c = 7;
      protected static final int d = 2;

      protected void a(fep $$0, fkb $$1, int $$2, int $$3, int $$4, int $$5) {
         int $$6 = $$2 - 10 - 7;
         int $$7 = $$3 + 2;
         if ($$0.j) {
            this.a($$1, $$6, $$7, $$4, $$5, fdt.c, () -> fdt.S);
         } else if ($$0.e == fep.c.a) {
            this.a($$1, $$6, $$7, $$4, $$5, fdt.D, () -> fdt.W);
         } else if (fdt.i($$0) && $$0.l < 7) {
            this.a($$1, $$6, $$7, $$4, $$5, fdt.B, () -> {
               if ($$0.l <= 0) {
                  return fdt.T;
               } else {
                  return (xe)($$0.l == 1 ? fdt.U : xe.a("mco.selectServer.expires.days", $$0.l));
               }
            });
         } else if ($$0.e == fep.c.b) {
            this.a($$1, $$6, $$7, $$4, $$5, fdt.C, () -> fdt.V);
         }
      }

      private void a(fkb $$0, int $$1, int $$2, int $$3, int $$4, ale $$5, Supplier<xe> $$6) {
         $$0.a(ghv::B, $$5, $$1, $$2, 10, 28);
         if (fdt.this.aF.c((double)$$3, (double)$$4) && $$3 >= $$1 && $$3 <= $$1 + 10 && $$4 >= $$2 && $$4 <= $$2 + 28) {
            fdt.this.d($$6.get());
         }
      }

      protected void a(fkb $$0, int $$1, int $$2, fep $$3) {
         int $$4 = this.b($$2);
         int $$5 = this.a($$1);
         int $$6 = this.d($$5);
         if (!fdt.i($$3)) {
            $$0.a(fdt.this.p, $$3.f, $$4, this.d($$5), -8355712, false);
         } else if ($$3.j) {
            xe $$7 = $$3.k ? fdt.O : fdt.M;
            $$0.a(fdt.this.p, $$7, $$4, $$6, -2142128, false);
         }
      }

      protected void a(fkb $$0, String $$1, int $$2, int $$3, int $$4, int $$5) {
         int $$6 = $$4 - $$2;
         if (fdt.this.p.b($$1) > $$6) {
            String $$7 = fdt.this.p.a($$1, $$6 - fdt.this.p.b("... "));
            $$0.a(fdt.this.p, $$7 + "...", $$2, $$3, $$5, false);
         } else {
            $$0.a(fdt.this.p, $$1, $$2, $$3, $$5, false);
         }
      }

      protected int a(int $$0, int $$1, xe $$2) {
         return $$0 + $$1 - fdt.this.p.a($$2) - 20;
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

   static class g extends flt.b {
      private static final ale[] d = new ale[]{
         ale.b("notification/1"),
         ale.b("notification/2"),
         ale.b("notification/3"),
         ale.b("notification/4"),
         ale.b("notification/5"),
         ale.b("notification/more")
      };
      private static final int u = Integer.MAX_VALUE;
      private static final int v = 20;
      private static final int w = 14;
      private int x;

      public g(xe $$0, ale $$1, fko.c $$2) {
         super(20, 20, $$0, 14, 14, $$1, $$2, null);
      }

      int a() {
         return this.x;
      }

      public void a(int $$0) {
         this.x = $$0;
      }

      @Override
      public void b(fkb $$0, int $$1, int $$2, float $$3) {
         super.b($$0, $$1, $$2, $$3);
         if (this.j && this.x != 0) {
            this.a($$0);
         }
      }

      private void a(fkb $$0) {
         $$0.a(ghv::B, d[Math.min(this.x, 6) - 1], this.D() + this.y() - 5, this.E() - 3, 8, 8);
      }
   }

   class h extends fdt.e {
      private static final int f = 40;
      private static final int g = -12303292;
      private final xe h;
      private final int i;
      private final List<fkm> j = new ArrayList<>();
      @Nullable
      private final fdt.c k;
      private final fli l;
      private final fob m;
      private final foa n;
      private int o = -1;

      public h(final xe $$0, final int $$1, final feo $$2) {
         this.h = $$0;
         this.i = $$1;
         this.m = new fob();
         int $$3 = 7;
         this.m.a(flb.a(20, 20, fdt.a), 0, 0, this.m.b().a(7, 7, 0, 0));
         this.m.a(foh.a(40), 0, 0);
         this.n = this.m.a(new foa(0, 9 * 3 * ($$1 - 1)), 0, 1, this.m.b().c(7));
         this.l = this.n.a(new fli($$0, fdt.this.p).b(true), this.n.b().b().d());
         this.m.a(foh.a(40), 0, 2);
         if ($$2.b()) {
            this.k = this.m.a(new fdt.c($$1x -> fdt.this.a($$2.c()), xe.c("mco.notification.dismiss")), 0, 2, this.m.b().c().a(0, 7, 7, 0));
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
      public void b(fkb $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         super.b($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
         $$0.b($$3 - 2, $$2 - 2, $$4, 36 * this.i - 2, -12303292);
      }

      @Override
      public void a(fkb $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
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
      public xe a() {
         return this.h;
      }
   }

   class i extends fdt.e {
      private final fep f;
      private final fmc g = new fmc();

      public i(final fep $$0) {
         this.f = $$0;
         if (!$$0.j) {
            this.g.a(flz.a(xe.c("mco.snapshot.parent.tooltip")));
         }
      }

      @Override
      public void a(fkb $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = this.b($$3);
         int $$11 = this.a($$2);
         fhd.a($$0, $$3, $$2, 32, this.f.g);
         xe $$12 = fdt.a(this.f.t, -8355712);
         int $$13 = this.a($$3, $$4, $$12);
         this.a($$0, this.f.b(), $$10, $$11, $$13, -8355712);
         if ($$12 != xd.a) {
            $$0.a(fdt.this.p, $$12, $$13, $$11, -8355712, false);
         }

         $$0.a(fdt.this.p, this.f.a(), $$10, this.c($$11), -8355712, false);
         this.a($$0, $$2, $$3, this.f);
         this.a(this.f, $$0, $$3 + $$4, $$2, $$6, $$7);
         this.g.a($$8, this.aN_(), new fow($$3, $$2, $$4, $$5));
      }

      @Override
      public xe a() {
         return xe.b(this.f.c);
      }
   }

   class j extends hdo<fdt.e> {
      public j() {
         super(fdt.this.n, fdt.this.o, 0, 36);
      }

      public void a(@Nullable fdt.e $$0) {
         super.a($$0);
         fdt.this.G();
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
      T request(fdy var1) throws ffj;
   }

   class l extends fdt.e {
      private static final xe f = xe.c("mco.onlinePlayers");
      private static final int g = 9;
      private static final int h = 36;
      private final fep i;
      private final fmc j = new fmc();

      public l(final fep $$0) {
         this.i = $$0;
         boolean $$1 = fdt.i($$0);
         if (fdt.b() && $$1 && $$0.h()) {
            this.j.a(flz.a(xe.a("mco.snapshot.paired", $$0.s)));
         } else if (!$$1 && $$0.f()) {
            this.j.a(flz.a(xe.a("mco.snapshot.friendsRealm.downgrade", $$0.t)));
         }
      }

      @Override
      public void a(fkb $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         if (this.i.e == fep.c.c) {
            $$0.a(ghv::B, fdt.b, $$3 - 5, $$2 + $$5 / 2 - 10, 40, 20);
            int $$10 = $$2 + $$5 / 2 - 9 / 2;
            $$0.b(fdt.this.p, fdt.L, $$3 + 40 - 2, $$10, 8388479);
         } else {
            this.a(this.i, $$0, $$3 + 36, $$2, $$6, $$7);
            fhd.a($$0, $$3, $$2, 32, this.i.g);
            this.a($$0, $$2, $$3, $$4);
            this.a($$0, $$2, $$3);
            this.a($$0, $$2, $$3, this.i);
            boolean $$11 = this.a($$0, $$2, $$3, $$4, $$5, $$6, $$7);
            this.a(this.i, $$0, $$3 + $$4, $$2, $$6, $$7);
            if (!$$11) {
               this.j.a($$8, this.aN_(), new fow($$3, $$2, $$4, $$5));
            }
         }
      }

      private void a(fkb $$0, int $$1, int $$2, int $$3) {
         int $$4 = this.b($$2);
         int $$5 = this.a($$1);
         xe $$6 = fdt.a(this.i.t, this.i.d());
         int $$7 = this.a($$2, $$3, $$6);
         this.a($$0, this.i.b(), $$4, $$5, $$7, -1);
         if ($$6 != xd.a && !this.i.i()) {
            $$0.a(fdt.this.p, $$6, $$7, $$5, -8355712, false);
         }
      }

      private void a(fkb $$0, int $$1, int $$2) {
         int $$3 = this.b($$2);
         int $$4 = this.a($$1);
         int $$5 = this.c($$4);
         String $$6 = this.i.c();
         if (this.i.i() && $$6 != null) {
            xe $$7 = xe.b($$6).a(n.h);
            $$0.a(fdt.this.p, xe.a("mco.selectServer.minigameName", $$7).b(-171), $$3, $$5, -1, false);
         } else {
            $$0.a(fdt.this.p, this.i.a(), $$3, this.c($$4), -8355712, false);
         }
      }

      private boolean a(fkb $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6) {
         List<ProfileResult> $$7 = fdt.this.aI.a(this.i.a);
         if (!$$7.isEmpty()) {
            int $$8 = $$2 + $$3 - 21;
            int $$9 = $$1 + $$4 - 9 - 2;
            int $$10 = $$8;

            for (int $$11 = 0; $$11 < $$7.size(); $$11++) {
               $$10 -= 9 + ($$11 == 0 ? 0 : 3);
               fln.a($$0, fip.Q().an().b($$7.get($$11).profile()), $$10, $$9, 9);
            }

            if ($$5 >= $$10 && $$5 <= $$8 && $$6 >= $$9 && $$6 <= $$9 + 9) {
               $$0.a(fdt.this.p, List.of(f), Optional.of(new fsn.a($$7)), $$5, $$6);
               return true;
            }
         }

         return false;
      }

      private void d() {
         fdt.this.m.ak().a(hav.a(awg.Ax, 1.0F));
         fdt.a(this.i, fdt.this);
      }

      private void e() {
         fdt.this.m.ak().a(hav.a(awg.Ax, 1.0F));
         ffz $$0 = new ffz(fdt.this, this.i);
         fdt.this.m.a($$0);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         if (this.i.e == fep.c.c) {
            this.e();
         } else if (fdt.this.a(this.i)) {
            if (ad.c() - fdt.this.aL < 250L && this.aN_()) {
               this.d();
            }

            fdt.this.aL = ad.c();
         }

         return true;
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         if (foq.a($$0)) {
            if (this.i.e == fep.c.c) {
               this.e();
               return true;
            }

            if (fdt.this.a(this.i)) {
               this.d();
               return true;
            }
         }

         return super.a($$0, $$1, $$2);
      }

      @Override
      public xe a() {
         return (xe)(this.i.e == fep.c.c ? fdt.X : xe.a("narrator.select", this.i.c));
      }

      public fep c() {
         return this.i;
      }
   }
}
