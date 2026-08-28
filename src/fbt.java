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

public class fbt extends gwq {
   static final akr a = akr.b("icon/info");
   static final akr b = akr.b("icon/new_realm");
   static final akr c = akr.b("realm_status/expired");
   static final akr B = akr.b("realm_status/expires_soon");
   static final akr C = akr.b("realm_status/open");
   static final akr D = akr.b("realm_status/closed");
   private static final akr E = akr.b("icon/invite");
   private static final akr F = akr.b("icon/news");
   static final Logger G = LogUtils.getLogger();
   private static final akr H = akr.b("textures/gui/title/realms.png");
   private static final akr I = akr.b("textures/gui/realms/no_realms.png");
   private static final wz J = wz.c("menu.online");
   private static final wz K = wz.c("mco.selectServer.loading");
   static final wz L = wz.c("mco.selectServer.uninitialized");
   static final wz M = wz.c("mco.selectServer.expiredList");
   private static final wz N = wz.c("mco.selectServer.expiredRenew");
   static final wz O = wz.c("mco.selectServer.expiredTrial");
   private static final wz P = wz.c("mco.selectServer.play");
   private static final wz Q = wz.c("mco.selectServer.leave");
   private static final wz R = wz.c("mco.selectServer.configure");
   static final wz S = wz.c("mco.selectServer.expired");
   static final wz T = wz.c("mco.selectServer.expires.soon");
   static final wz U = wz.c("mco.selectServer.expires.day");
   static final wz V = wz.c("mco.selectServer.open");
   static final wz W = wz.c("mco.selectServer.closed");
   static final wz X = wz.a("gui.narrate.button", L);
   private static final wz Y = wz.c("mco.selectServer.noRealms");
   private static final wz Z = wz.c("mco.invites.nopending");
   private static final wz aa = wz.c("mco.invites.pending");
   private static final wz ab = wz.c("mco.compatibility.incompatible.popup.title");
   private static final wz ac = wz.c("mco.compatibility.incompatible.releaseType.popup.message");
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
   private final CompletableFuture<fbs.a> au = fbs.a();
   @Nullable
   private fev.c av;
   private final Set<UUID> aw = new HashSet<>();
   private static boolean ax;
   private final RateLimiter ay;
   private final fod az;
   private fim aA;
   private fim aB;
   private fim aC;
   private fim aD;
   private fim aE;
   fbt.j aF;
   private fdo aG;
   private List<fcp> aH = List.of();
   fcs aI = new fcs();
   private volatile boolean aJ;
   @Nullable
   private volatile String aK;
   long aL;
   private final List<fco> aM = new ArrayList<>();
   private fim aN;
   private fbt.g aO;
   private fbt.g aP;
   private fbt.f aQ;
   @Nullable
   private flz aR;

   public fbt(fod $$0) {
      super(J);
      this.az = $$0;
      this.ay = RateLimiter.create(0.016666668F);
   }

   @Override
   public void aT_() {
      this.aG = new fdo(this.l);
      this.aF = new fbt.j();
      wz $$0 = wz.c("mco.invites.title");
      this.aO = new fbt.g($$0, E, $$1x -> this.l.a(new feh(this, $$0)));
      wz $$1 = wz.c("mco.news");
      this.aP = new fbt.g($$1, F, $$0x -> {
         String $$1x = this.aK;
         if ($$1x != null) {
            fna.a(this, $$1x);
            if (this.aP.a() != 0) {
               ffb.a $$2 = ffb.b();
               $$2.b = false;
               ffb.b($$2);
               this.aP.a(0);
            }
         }
      });
      this.aP.a(fjx.a($$1));
      this.aA = fim.a(P, $$0x -> a(this.M(), this)).a(100).a();
      this.aD = fim.a(R, $$0x -> this.f(this.M())).a(100).a();
      this.aC = fim.a(N, $$0x -> this.e(this.M())).a(100).a();
      this.aE = fim.a(Q, $$0x -> this.g(this.M())).a(100).a();
      this.aN = fim.a(wz.c("mco.selectServer.purchase"), $$0x -> this.N()).b(100, 20).a();
      this.aB = fim.a(wy.k, $$0x -> this.d()).a(100).a();
      if (fby.a == fby.b.b) {
         this.c(fit.a(wz.b("Snapshot"), wz.b("Release")).a(5, 5, 100, 20, wz.b("Realm"), ($$0x, $$1x) -> {
            at = $$1x;
            this.aH = List.of();
            this.G();
         }));
      }

      this.a(fbt.f.a);
      this.F();
      this.au.thenAcceptAsync($$0x -> {
         fod $$1x = $$0x.a(this.az);
         if ($$1x == null) {
            this.av = this.a(this.l.aY());
         } else {
            this.l.a($$1x);
         }
      }, this.q);
   }

   public static boolean b() {
      return as && at;
   }

   @Override
   protected void c() {
      if (this.aR != null) {
         this.aF.a(this.m, this.aR);
         this.aR.a();
      }
   }

   @Override
   public void d() {
      this.l.a(this.az);
   }

   private void C() {
      if (this.aG.a() && this.aH.isEmpty() && this.aM.isEmpty()) {
         this.a(fbt.f.b);
      } else {
         this.a(fbt.f.c);
      }
   }

   private void a(fbt.f $$0) {
      if (this.aQ != $$0) {
         if (this.aR != null) {
            this.aR.a($$1 -> this.e($$1));
         }

         this.aR = this.b($$0);
         this.aQ = $$0;
         this.aR.a($$1 -> {
            fik var10000 = this.c($$1);
         });
         this.c();
      }
   }

   private flz b(fbt.f $$0) {
      flz $$1 = new flz(this);
      $$1.b(44);
      $$1.a(this.D());
      fma $$2 = this.c($$0);
      $$2.a();
      $$1.a($$2.w() + 22);
      $$1.b($$2);
      switch ($$0) {
         case a:
            $$1.c(new fjb(this.o, K));
            break;
         case b:
            $$1.c(this.E());
            break;
         case c:
            $$1.c(this.aF);
      }

      return $$1;
   }

   private fma D() {
      int $$0 = 90;
      fmd $$1 = fmd.e().a(4);
      $$1.c().e();
      $$1.a(this.aO);
      $$1.a(this.aP);
      fmd $$2 = fmd.e();
      $$2.c().e();
      $$2.a(fme.a(90));
      $$2.a(fiz.a(128, 34, H, 128, 64), fmc::b);
      $$2.a(new flx(90, 44)).a($$1, fmc::c);
      return $$2;
   }

   private fma c(fbt.f $$0) {
      fly $$1 = new fly().c(4);
      fly.b $$2 = $$1.d(3);
      if ($$0 == fbt.f.c) {
         $$2.a(this.aA);
         $$2.a(this.aD);
         $$2.a(this.aC);
         $$2.a(this.aE);
      }

      $$2.a(this.aN);
      $$2.a(this.aB);
      return $$1;
   }

   private fmd E() {
      fmd $$0 = fmd.d().a(8);
      $$0.c().b();
      $$0.a(fiz.a(130, 64, I, 130, 64));
      fix $$1 = new fix(308, Y, this.o, false, 4);
      $$0.a($$1);
      return $$0;
   }

   void F() {
      fcp $$0 = this.M();
      this.aN.j = this.aQ != fbt.f.a;
      this.aA.j = $$0 != null && this.a($$0);
      this.aC.j = $$0 != null && this.b($$0);
      this.aE.j = $$0 != null && this.d($$0);
      this.aD.j = $$0 != null && this.c($$0);
   }

   boolean a(fcp $$0) {
      boolean $$1 = !$$0.j && $$0.e == fcp.c.b;
      return $$1 && ($$0.d() || $$0.e() || i($$0));
   }

   private boolean b(fcp $$0) {
      return $$0.j && i($$0);
   }

   private boolean c(fcp $$0) {
      return i($$0) && $$0.e != fcp.c.c;
   }

   private boolean d(fcp $$0) {
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
      fgo.Q().aY().d.a();
   }

   public static void g() {
      fgo.Q().aY().c.a();
   }

   private void G() {
      for (fev.e<?> $$0 : this.l.aY().a()) {
         $$0.a();
      }
   }

   private fev.c a(fdm $$0) {
      fev.c $$1 = $$0.a.a();
      $$1.a($$0.c, $$0x -> {
         this.aG.a($$0x.a());
         this.aH = $$0x.b();
         this.J();
         boolean $$1x = false;

         for (fcp $$2 : this.aG) {
            if (this.j($$2)) {
               $$1x = true;
            }
         }

         if (!ax && $$1x) {
            ax = true;
            this.K();
         }
      });
      a(fby::d, $$0x -> {
         this.aM.clear();
         this.aM.addAll($$0x);

         for (fco $$1x : $$0x) {
            if ($$1x instanceof fco.a $$2) {
               fjo $$3 = $$2.a(this, this::a);
               if ($$3 != null) {
                  this.l.a($$3);
                  this.a(List.of($$1x));
                  break;
               }
            }
         }

         if (!this.aM.isEmpty() && this.aQ != fbt.f.a) {
            this.J();
         }
      });
      $$1.a($$0.d, $$0x -> {
         this.aO.a($$0x);
         this.aO.a($$0x == 0 ? fjx.a(Z) : fjx.a(aa));
         if ($$0x > 0 && this.ay.tryAcquire(1)) {
            this.l.aV().c(wz.a("mco.configure.world.invite.narration", $$0x));
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

   private void a(Collection<fco> $$0) {
      List<UUID> $$1 = new ArrayList<>($$0.size());

      for (fco $$2 : $$0) {
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

   private static <T> void a(fbt.k<T> $$0, Consumer<T> $$1) {
      fgo $$2 = fgo.Q();
      CompletableFuture.<T>supplyAsync(() -> {
         try {
            return $$0.request(fby.a($$2));
         } catch (fdj var3) {
            throw new RuntimeException(var3);
         }
      }).thenAcceptAsync($$1, $$2).exceptionally($$0x -> {
         G.error("Failed to execute call to Realms Service", $$0x);
         return null;
      });
   }

   private void J() {
      fcp $$0 = this.M();
      this.aF.J();

      for (fco $$1 : this.aM) {
         if (this.a($$1)) {
            this.a(List.of($$1));
            break;
         }
      }

      for (fcp $$2 : this.aH) {
         this.aF.a(new fbt.a($$2));
      }

      for (fcp $$3 : this.aG) {
         fbt.e $$4;
         if (b() && !$$3.h()) {
            if ($$3.e == fcp.c.c) {
               continue;
            }

            $$4 = new fbt.i($$3);
         } else {
            $$4 = new fbt.l($$3);
         }

         this.aF.a((fbt.e)$$4);
         if ($$0 != null && $$0.a == $$3.a) {
            this.aF.a($$4);
         }
      }

      this.C();
      this.F();
   }

   private boolean a(fco $$0) {
      if (!($$0 instanceof fco.c $$1)) {
         return false;
      } else {
         wz $$2 = $$1.d();
         int $$3 = this.o.b($$2, 216);
         int $$4 = ayo.e($$3 + 7, 36) - 1;
         this.aF.a(new fbt.h($$2, $$4 + 2, $$1));

         for (int $$5 = 0; $$5 < $$4; $$5++) {
            this.aF.a(new fbt.d());
         }

         this.aF.a(new fbt.b($$1.a(this)));
         return true;
      }
   }

   private void K() {
      new Thread(() -> {
         List<fcx> $$0 = fbx.a();
         fby $$1 = fby.a();
         fck $$2 = new fck();
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

      for (fcp $$1 : this.aG) {
         if (this.j($$1)) {
            $$0.add($$1.a);
         }
      }

      return $$0;
   }

   private void e(@Nullable fcp $$0) {
      if ($$0 != null) {
         String $$1 = axj.a($$0.b, this.l.X().b(), $$0.k);
         this.l.o.a($$1);
         ad.k().a($$1);
      }
   }

   private void f(@Nullable fcp $$0) {
      if ($$0 != null && this.l.b($$0.g)) {
         this.l.a(new fdx(this, $$0.a));
      }
   }

   private void g(@Nullable fcp $$0) {
      if ($$0 != null && !this.l.b($$0.g)) {
         wz $$1 = wz.c("mco.configure.world.leave.question.line1");
         this.l.a(fej.a(this, $$1, $$1x -> this.h($$0)));
      }
   }

   @Nullable
   private fcp M() {
      return this.aF.h() instanceof fbt.l $$0 ? $$0.c() : null;
   }

   private void h(final fcp $$0) {
      (new Thread("Realms-leave-server") {
         @Override
         public void run() {
            try {
               fby $$0 = fby.a();
               $$0.d($$0.a);
               fbt.this.l.execute(fbt::g);
            } catch (fdj var2) {
               fbt.G.error("Couldn't configure world", var2);
               fbt.this.l.execute(() -> fbt.this.l.a(new feb(var2, fbt.this)));
            }
         }
      }).start();
      this.l.a(this);
   }

   void a(UUID $$0) {
      a($$1 -> {
         $$1.b(List.of($$0));
         return null;
      }, $$1 -> {
         this.aM.removeIf($$1x -> $$1x.b() && $$0.equals($$1x.c()));
         this.J();
      });
   }

   public void h() {
      this.aF.a(null);
      g();
   }

   @Override
   public wz i() {
      return (wz)(switch (this.aQ) {
         case a -> wy.a(super.i(), K);
         case b -> wy.a(super.i(), Y);
         case c -> super.i();
      });
   }

   @Override
   public void a(fhz $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (b()) {
         $$0.b(this.o, "Minecraft " + ab.b().c(), 2, this.n - 10, -1);
      }

      if (this.aJ && this.aN.j) {
         fds.a($$0, this.aN);
      }

      switch (fby.a) {
         case b:
            this.a($$0, "STAGE!", -256);
            break;
         case c:
            this.a($$0, "LOCAL!", 8388479);
      }
   }

   private void N() {
      this.l.a(new fds(this, this.aJ));
   }

   public static void a(@Nullable fcp $$0, fod $$1) {
      a($$0, $$1, false);
   }

   public static void a(@Nullable fcp $$0, fod $$1, boolean $$2) {
      if ($$0 != null) {
         if (!b() || $$2 || $$0.i()) {
            fgo.Q().a(new fed($$1, new ffm($$1, $$0)));
            return;
         }

         switch ($$0.u) {
            case f:
               fgo.Q().a(new fed($$1, new ffm($$1, $$0)));
               break;
            case a:
               a($$0, $$1, wz.c("mco.compatibility.unverifiable.title").b(-171), wz.c("mco.compatibility.unverifiable.message"), wy.j);
               break;
            case d:
               a(
                  $$0,
                  $$1,
                  wz.c("selectWorld.backupQuestion.downgrade").b(-2142128),
                  wz.a("mco.compatibility.downgrade.description", wz.b($$0.t).b(-171), wz.b(ab.b().c()).b(-171)),
                  wz.c("mco.compatibility.downgrade")
               );
               break;
            case e:
               b($$0, $$1);
               break;
            case b:
               fgo.Q()
                  .a(
                     new fjo.a($$1, ab)
                        .a(wz.a("mco.compatibility.incompatible.series.popup.message", wz.b($$0.t).b(-171), wz.b(ab.b().c()).b(-171)))
                        .a(wy.k, fjo::d)
                        .a()
                  );
               break;
            case c:
               fgo.Q().a(new fjo.a($$1, ab).a(ac).a(wy.k, fjo::d).a());
         }
      }
   }

   private static void a(fcp $$0, fod $$1, wz $$2, wz $$3, wz $$4) {
      fgo.Q().a(new fjo.a($$1, $$2).a($$3).a($$4, $$2x -> {
         fgo.Q().a(new fed($$1, new ffm($$1, $$0)));
         g();
      }).a(wy.e, fjo::d).a());
   }

   private static void b(fcp $$0, fod $$1) {
      wz $$2 = wz.c("mco.compatibility.upgrade.title").b(-171);
      wz $$3 = wz.c("mco.compatibility.upgrade");
      wz $$4 = wz.b($$0.t).b(-171);
      wz $$5 = wz.b(ab.b().c()).b(-171);
      wz $$6 = i($$0) ? wz.a("mco.compatibility.upgrade.description", $$4, $$5) : wz.a("mco.compatibility.upgrade.friend.description", $$4, $$5);
      a($$0, $$1, $$2, $$6, $$3);
   }

   public static wz a(String $$0, boolean $$1) {
      return a($$0, $$1 ? -8355712 : -2142128);
   }

   public static wz a(String $$0, int $$1) {
      return (wz)(StringUtils.isBlank($$0) ? wy.a : wz.a("mco.version", wz.b($$0).b($$1)));
   }

   static boolean i(fcp $$0) {
      return fgo.Q().b($$0.g);
   }

   private boolean j(fcp $$0) {
      return i($$0) && !$$0.j;
   }

   private void a(fhz $$0, String $$1, int $$2) {
      $$0.c().a();
      $$0.c().a((float)(this.m / 2 - 25), 20.0F, 0.0F);
      $$0.c().a(a.f.rotationDegrees(-20.0F));
      $$0.c().b(1.5F, 1.5F, 1.5F);
      $$0.a(this.o, $$1, 0, 0, $$2, false);
      $$0.c().b();
   }

   class a extends fbt.e {
      private static final wz f = wz.c("mco.snapshot.start");
      private static final int g = 5;
      private final fka h = new fka();
      private final fcp i;

      public a(final fcp $$0) {
         this.i = $$0;
         this.h.a(fjx.a(wz.c("mco.snapshot.tooltip")));
      }

      @Override
      public void a(fhz $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(fbt.b, $$3 - 5, $$2 + $$5 / 2 - 10, 40, 20);
         int $$10 = $$2 + $$5 / 2 - 9 / 2;
         $$0.b(fbt.this.o, f, $$3 + 40 - 2, $$10 - 5, 8388479);
         $$0.b(fbt.this.o, wz.a("mco.snapshot.description", this.i.c), $$3 + 40 - 2, $$10 + 5, -8355712);
         this.h.a($$8, this.aO_(), new fms($$3, $$2, $$4, $$5));
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         this.c();
         return true;
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         if (fmn.a($$0)) {
            this.c();
            return true;
         } else {
            return super.a($$0, $$1, $$2);
         }
      }

      private void c() {
         fbt.this.l.aj().a(gtv.a(avp.Ar, 1.0F));
         fbt.this.l
            .a(
               new fjo.a(fbt.this, wz.c("mco.snapshot.createSnapshotPopup.title"))
                  .a(wz.c("mco.snapshot.createSnapshotPopup.text"))
                  .a(wz.c("mco.selectServer.create"), $$0 -> fbt.this.l.a(new fdz(fbt.this, this.i.a)))
                  .a(wy.e, fjo::d)
                  .a()
            );
      }

      @Override
      public wz a() {
         return wz.a("gui.narrate.button", wy.a(f, wz.a("mco.snapshot.description", this.i.c)));
      }
   }

   class b extends fbt.e {
      private final fim f;

      public b(final fim $$0) {
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
      public void a(fhz $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.f.c(fbt.this.m / 2 - 75, $$2 + 4);
         this.f.a($$0, $$6, $$7, $$9);
      }

      @Override
      public void a(boolean $$0) {
         super.a($$0);
         this.f.a($$0);
      }

      @Override
      public wz a() {
         return this.f.z();
      }
   }

   static class c extends fiy {
      private static final fjz b = new fjz(akr.b("widget/cross_button"), akr.b("widget/cross_button_highlighted"));

      protected c(fim.c $$0, wz $$1) {
         super(0, 0, 14, 14, b, $$0);
         this.a(fjx.a($$1));
      }
   }

   class d extends fbt.e {
      @Override
      public void a(fhz $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
      }

      @Override
      public wz a() {
         return wz.i();
      }
   }

   abstract class e extends fji.a<fbt.e> {
      protected static final int b = 10;
      private static final int a = 28;
      protected static final int c = 7;
      protected static final int d = 2;

      protected void a(fcp $$0, fhz $$1, int $$2, int $$3, int $$4, int $$5) {
         int $$6 = $$2 - 10 - 7;
         int $$7 = $$3 + 2;
         if ($$0.j) {
            this.a($$1, $$6, $$7, $$4, $$5, fbt.c, () -> fbt.S);
         } else if ($$0.e == fcp.c.a) {
            this.a($$1, $$6, $$7, $$4, $$5, fbt.D, () -> fbt.W);
         } else if (fbt.i($$0) && $$0.l < 7) {
            this.a($$1, $$6, $$7, $$4, $$5, fbt.B, () -> {
               if ($$0.l <= 0) {
                  return fbt.T;
               } else {
                  return (wz)($$0.l == 1 ? fbt.U : wz.a("mco.selectServer.expires.days", $$0.l));
               }
            });
         } else if ($$0.e == fcp.c.b) {
            this.a($$1, $$6, $$7, $$4, $$5, fbt.C, () -> fbt.V);
         }
      }

      private void a(fhz $$0, int $$1, int $$2, int $$3, int $$4, akr $$5, Supplier<wz> $$6) {
         $$0.a($$5, $$1, $$2, 10, 28);
         if (fbt.this.aF.c((double)$$3, (double)$$4) && $$3 >= $$1 && $$3 <= $$1 + 10 && $$4 >= $$2 && $$4 <= $$2 + 28) {
            fbt.this.d($$6.get());
         }
      }

      protected void a(fhz $$0, int $$1, int $$2, fcp $$3) {
         int $$4 = this.b($$2);
         int $$5 = this.a($$1);
         int $$6 = this.d($$5);
         if (!fbt.i($$3)) {
            $$0.a(fbt.this.o, $$3.f, $$4, this.d($$5), -8355712, false);
         } else if ($$3.j) {
            wz $$7 = $$3.k ? fbt.O : fbt.M;
            $$0.a(fbt.this.o, $$7, $$4, $$6, -2142128, false);
         }
      }

      protected void a(fhz $$0, String $$1, int $$2, int $$3, int $$4, int $$5) {
         int $$6 = $$4 - $$2;
         if (fbt.this.o.b($$1) > $$6) {
            String $$7 = fbt.this.o.a($$1, $$6 - fbt.this.o.b("... "));
            $$0.a(fbt.this.o, $$7 + "...", $$2, $$3, $$5, false);
         } else {
            $$0.a(fbt.this.o, $$1, $$2, $$3, $$5, false);
         }
      }

      protected int a(int $$0, int $$1, wz $$2) {
         return $$0 + $$1 - fbt.this.o.a($$2) - 20;
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

   static class g extends fjr.b {
      private static final akr[] d = new akr[]{
         akr.b("notification/1"),
         akr.b("notification/2"),
         akr.b("notification/3"),
         akr.b("notification/4"),
         akr.b("notification/5"),
         akr.b("notification/more")
      };
      private static final int u = Integer.MAX_VALUE;
      private static final int v = 20;
      private static final int w = 14;
      private int x;

      public g(wz $$0, akr $$1, fim.c $$2) {
         super(20, 20, $$0, 14, 14, $$1, $$2, null);
      }

      int a() {
         return this.x;
      }

      public void a(int $$0) {
         this.x = $$0;
      }

      @Override
      public void b(fhz $$0, int $$1, int $$2, float $$3) {
         super.b($$0, $$1, $$2, $$3);
         if (this.j && this.x != 0) {
            this.a($$0);
         }
      }

      private void a(fhz $$0) {
         $$0.a(d[Math.min(this.x, 6) - 1], this.D() + this.y() - 5, this.E() - 3, 8, 8);
      }
   }

   class h extends fbt.e {
      private static final int f = 40;
      private static final int g = -12303292;
      private final wz h;
      private final int i;
      private final List<fik> j = new ArrayList<>();
      @Nullable
      private final fbt.c k;
      private final fjg l;
      private final fly m;
      private final flx n;
      private int o = -1;

      public h(final wz $$0, final int $$1, final fco $$2) {
         this.h = $$0;
         this.i = $$1;
         this.m = new fly();
         int $$3 = 7;
         this.m.a(fiz.a(20, 20, fbt.a), 0, 0, this.m.b().a(7, 7, 0, 0));
         this.m.a(fme.a(40), 0, 0);
         this.n = this.m.a(new flx(0, 9 * 3 * ($$1 - 1)), 0, 1, this.m.b().c(7));
         this.l = this.n.a(new fjg($$0, fbt.this.o).b(true), this.n.b().b().d());
         this.m.a(fme.a(40), 0, 2);
         if ($$2.b()) {
            this.k = this.m.a(new fbt.c($$1x -> fbt.this.a($$2.c()), wz.c("mco.notification.dismiss")), 0, 2, this.m.b().c().a(0, 7, 7, 0));
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
      public void b(fhz $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         super.b($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
         $$0.b($$3 - 2, $$2 - 2, $$4, 36 * this.i - 2, -12303292);
      }

      @Override
      public void a(fhz $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
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
      public wz a() {
         return this.h;
      }
   }

   class i extends fbt.e {
      private final fcp f;
      private final fka g = new fka();

      public i(final fcp $$0) {
         this.f = $$0;
         if (!$$0.j) {
            this.g.a(fjx.a(wz.c("mco.snapshot.parent.tooltip")));
         }
      }

      @Override
      public void a(fhz $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = this.b($$3);
         int $$11 = this.a($$2);
         ffd.a($$0, $$3, $$2, 32, this.f.g);
         wz $$12 = fbt.a(this.f.t, -8355712);
         int $$13 = this.a($$3, $$4, $$12);
         this.a($$0, this.f.b(), $$10, $$11, $$13, -8355712);
         if ($$12 != wy.a) {
            $$0.a(fbt.this.o, $$12, $$13, $$11, -8355712, false);
         }

         $$0.a(fbt.this.o, this.f.a(), $$10, this.c($$11), -8355712, false);
         this.a($$0, $$2, $$3, this.f);
         this.a(this.f, $$0, $$3 + $$4, $$2, $$6, $$7);
         this.g.a($$8, this.aO_(), new fms($$3, $$2, $$4, $$5));
      }

      @Override
      public wz a() {
         return wz.b(this.f.c);
      }
   }

   class j extends gwp<fbt.e> {
      public j() {
         super(fbt.this.m, fbt.this.n, 0, 36);
      }

      public void a(@Nullable fbt.e $$0) {
         super.a($$0);
         fbt.this.F();
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
      T request(fby var1) throws fdj;
   }

   class l extends fbt.e {
      private static final wz f = wz.c("mco.onlinePlayers");
      private static final int g = 9;
      private static final int h = 36;
      private final fcp i;
      private final fka j = new fka();

      public l(final fcp $$0) {
         this.i = $$0;
         boolean $$1 = fbt.i($$0);
         if (fbt.b() && $$1 && $$0.h()) {
            this.j.a(fjx.a(wz.a("mco.snapshot.paired", $$0.s)));
         } else if (!$$1 && $$0.f()) {
            this.j.a(fjx.a(wz.a("mco.snapshot.friendsRealm.downgrade", $$0.t)));
         }
      }

      @Override
      public void a(fhz $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         if (this.i.e == fcp.c.c) {
            $$0.a(fbt.b, $$3 - 5, $$2 + $$5 / 2 - 10, 40, 20);
            int $$10 = $$2 + $$5 / 2 - 9 / 2;
            $$0.b(fbt.this.o, fbt.L, $$3 + 40 - 2, $$10, 8388479);
         } else {
            this.a(this.i, $$0, $$3 + 36, $$2, $$6, $$7);
            ffd.a($$0, $$3, $$2, 32, this.i.g);
            this.a($$0, $$2, $$3, $$4);
            this.a($$0, $$2, $$3);
            this.a($$0, $$2, $$3, this.i);
            boolean $$11 = this.a($$0, $$2, $$3, $$4, $$5, $$6, $$7);
            this.a(this.i, $$0, $$3 + $$4, $$2, $$6, $$7);
            if (!$$11) {
               this.j.a($$8, this.aO_(), new fms($$3, $$2, $$4, $$5));
            }
         }
      }

      private void a(fhz $$0, int $$1, int $$2, int $$3) {
         int $$4 = this.b($$2);
         int $$5 = this.a($$1);
         wz $$6 = fbt.a(this.i.t, this.i.d());
         int $$7 = this.a($$2, $$3, $$6);
         this.a($$0, this.i.b(), $$4, $$5, $$7, -1);
         if ($$6 != wy.a && !this.i.i()) {
            $$0.a(fbt.this.o, $$6, $$7, $$5, -8355712, false);
         }
      }

      private void a(fhz $$0, int $$1, int $$2) {
         int $$3 = this.b($$2);
         int $$4 = this.a($$1);
         int $$5 = this.c($$4);
         String $$6 = this.i.c();
         if (this.i.i() && $$6 != null) {
            wz $$7 = wz.b($$6).a(n.h);
            $$0.a(fbt.this.o, wz.a("mco.selectServer.minigameName", $$7).b(-171), $$3, $$5, -1, false);
         } else {
            $$0.a(fbt.this.o, this.i.a(), $$3, this.c($$4), -8355712, false);
         }
      }

      private boolean a(fhz $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6) {
         List<ProfileResult> $$7 = fbt.this.aI.a(this.i.a);
         if (!$$7.isEmpty()) {
            int $$8 = $$2 + $$3 - 21;
            int $$9 = $$1 + $$4 - 9 - 2;
            int $$10 = $$8;

            for (int $$11 = 0; $$11 < $$7.size(); $$11++) {
               $$10 -= 9 + ($$11 == 0 ? 0 : 3);
               fjl.a($$0, fgo.Q().am().b($$7.get($$11).profile()), $$10, $$9, 9);
            }

            if ($$5 >= $$10 && $$5 <= $$8 && $$6 >= $$9 && $$6 <= $$9 + 9) {
               $$0.a(fbt.this.o, List.of(f), Optional.of(new fqk.a($$7)), $$5, $$6);
               return true;
            }
         }

         return false;
      }

      private void d() {
         fbt.this.l.aj().a(gtv.a(avp.Ar, 1.0F));
         fbt.a(this.i, fbt.this);
      }

      private void e() {
         fbt.this.l.aj().a(gtv.a(avp.Ar, 1.0F));
         fdz $$0 = new fdz(fbt.this, this.i);
         fbt.this.l.a($$0);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         if (this.i.e == fcp.c.c) {
            this.e();
         } else if (fbt.this.a(this.i)) {
            if (ad.c() - fbt.this.aL < 250L && this.aO_()) {
               this.d();
            }

            fbt.this.aL = ad.c();
         }

         return true;
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         if (fmn.a($$0)) {
            if (this.i.e == fcp.c.c) {
               this.e();
               return true;
            }

            if (fbt.this.a(this.i)) {
               this.d();
               return true;
            }
         }

         return super.a($$0, $$1, $$2);
      }

      @Override
      public wz a() {
         return (wz)(this.i.e == fcp.c.c ? fbt.X : wz.a("narrator.select", this.i.c));
      }

      public fcp c() {
         return this.i;
      }
   }
}
