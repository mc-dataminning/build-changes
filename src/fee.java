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

public class fee extends hee {
   static final alh a = alh.b("icon/info");
   static final alh b = alh.b("icon/new_realm");
   static final alh c = alh.b("realm_status/expired");
   static final alh B = alh.b("realm_status/expires_soon");
   static final alh C = alh.b("realm_status/open");
   static final alh D = alh.b("realm_status/closed");
   private static final alh E = alh.b("icon/invite");
   private static final alh F = alh.b("icon/news");
   static final Logger G = LogUtils.getLogger();
   private static final alh H = alh.b("textures/gui/title/realms.png");
   private static final alh I = alh.b("textures/gui/realms/no_realms.png");
   private static final xh J = xh.c("menu.online");
   private static final xh K = xh.c("mco.selectServer.loading");
   static final xh L = xh.c("mco.selectServer.uninitialized");
   static final xh M = xh.c("mco.selectServer.expiredList");
   private static final xh N = xh.c("mco.selectServer.expiredRenew");
   static final xh O = xh.c("mco.selectServer.expiredTrial");
   private static final xh P = xh.c("mco.selectServer.play");
   private static final xh Q = xh.c("mco.selectServer.leave");
   private static final xh R = xh.c("mco.selectServer.configure");
   static final xh S = xh.c("mco.selectServer.expired");
   static final xh T = xh.c("mco.selectServer.expires.soon");
   static final xh U = xh.c("mco.selectServer.expires.day");
   static final xh V = xh.c("mco.selectServer.open");
   static final xh W = xh.c("mco.selectServer.closed");
   static final xh X = xh.a("gui.narrate.button", L);
   private static final xh Y = xh.c("mco.selectServer.noRealms");
   private static final xh Z = xh.c("mco.invites.nopending");
   private static final xh aa = xh.c("mco.invites.pending");
   private static final xh ab = xh.c("mco.compatibility.incompatible.popup.title");
   private static final xh ac = xh.c("mco.compatibility.incompatible.releaseType.popup.message");
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
   private final CompletableFuture<fed.a> au = fed.a();
   @Nullable
   private fhg.c av;
   private final Set<UUID> aw = new HashSet<>();
   private static boolean ax;
   private final RateLimiter ay;
   private final fqs az;
   private fkz aA;
   private fkz aB;
   private fkz aC;
   private fkz aD;
   private fkz aE;
   fee.j aF;
   private ffz aG;
   private List<ffa> aH = List.of();
   ffd aI = new ffd();
   private volatile boolean aJ;
   @Nullable
   private volatile String aK;
   long aL;
   private final List<fez> aM = new ArrayList<>();
   private fkz aN;
   private fee.g aO;
   private fee.g aP;
   private fee.f aQ;
   @Nullable
   private fon aR;

   public fee(fqs $$0) {
      super(J);
      this.az = $$0;
      this.ay = RateLimiter.create(0.016666668F);
   }

   @Override
   public void aS_() {
      this.aG = new ffz(this.m);
      this.aF = new fee.j();
      xh $$0 = xh.c("mco.invites.title");
      this.aO = new fee.g($$0, E, $$1x -> this.m.a(new fgs(this, $$0)));
      xh $$1 = xh.c("mco.news");
      this.aP = new fee.g($$1, F, $$0x -> {
         String $$1x = this.aK;
         if ($$1x != null) {
            fpp.a(this, $$1x);
            if (this.aP.a() != 0) {
               fhm.a $$2 = fhm.b();
               $$2.b = false;
               fhm.b($$2);
               this.aP.a(0);
            }
         }
      });
      this.aP.a(fmk.a($$1));
      this.aA = fkz.a(P, $$0x -> a(this.N(), this)).a(100).a();
      this.aD = fkz.a(R, $$0x -> this.f(this.N())).a(100).a();
      this.aC = fkz.a(N, $$0x -> this.e(this.N())).a(100).a();
      this.aE = fkz.a(Q, $$0x -> this.g(this.N())).a(100).a();
      this.aN = fkz.a(xh.c("mco.selectServer.purchase"), $$0x -> this.O()).b(100, 20).a();
      this.aB = fkz.a(xg.k, $$0x -> this.d()).a(100).a();
      if (fej.a == fej.b.b) {
         this.c(flg.a(xh.b("Snapshot"), xh.b("Release")).a(5, 5, 100, 20, xh.b("Realm"), ($$0x, $$1x) -> {
            at = $$1x;
            this.aH = List.of();
            this.J();
         }));
      }

      this.a(fee.f.a);
      this.G();
      this.au.thenAcceptAsync($$0x -> {
         fqs $$1x = $$0x.a(this.az);
         if ($$1x == null) {
            this.av = this.a(this.m.bd());
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
         this.a(fee.f.b);
      } else {
         this.a(fee.f.c);
      }
   }

   private void a(fee.f $$0) {
      if (this.aQ != $$0) {
         if (this.aR != null) {
            this.aR.a($$1 -> this.e($$1));
         }

         this.aR = this.b($$0);
         this.aQ = $$0;
         this.aR.a($$1 -> {
            fkx var10000 = this.c($$1);
         });
         this.c();
      }
   }

   private fon b(fee.f $$0) {
      fon $$1 = new fon(this);
      $$1.b(44);
      $$1.a(this.E());
      foo $$2 = this.c($$0);
      $$2.a();
      $$1.a($$2.w() + 22);
      $$1.b($$2);
      switch ($$0) {
         case a:
            $$1.c(new flo(this.p, K));
            break;
         case b:
            $$1.c(this.F());
            break;
         case c:
            $$1.c(this.aF);
      }

      return $$1;
   }

   private foo E() {
      int $$0 = 90;
      fos $$1 = fos.e().a(4);
      $$1.c().e();
      $$1.a(this.aO);
      $$1.a(this.aP);
      fos $$2 = fos.e();
      $$2.c().e();
      $$2.a(fot.a(90));
      $$2.a(flm.a(128, 34, H, 128, 64), foq::b);
      $$2.a(new fol(90, 44)).a($$1, foq::c);
      return $$2;
   }

   private foo c(fee.f $$0) {
      fom $$1 = new fom().c(4);
      fom.b $$2 = $$1.d(3);
      if ($$0 == fee.f.c) {
         $$2.a(this.aA);
         $$2.a(this.aD);
         $$2.a(this.aC);
         $$2.a(this.aE);
      }

      $$2.a(this.aN);
      $$2.a(this.aB);
      return $$1;
   }

   private fos F() {
      fos $$0 = fos.d().a(8);
      $$0.c().b();
      $$0.a(flm.a(130, 64, I, 130, 64));
      flk $$1 = new flk(308, Y, this.p, false, 4);
      $$0.a($$1);
      return $$0;
   }

   void G() {
      ffa $$0 = this.N();
      this.aN.j = this.aQ != fee.f.a;
      this.aA.j = $$0 != null && this.a($$0);
      this.aC.j = $$0 != null && this.b($$0);
      this.aE.j = $$0 != null && this.d($$0);
      this.aD.j = $$0 != null && this.c($$0);
   }

   boolean a(ffa $$0) {
      boolean $$1 = !$$0.j && $$0.e == ffa.c.b;
      return $$1 && ($$0.d() || $$0.e() || i($$0));
   }

   private boolean b(ffa $$0) {
      return $$0.j && i($$0);
   }

   private boolean c(ffa $$0) {
      return i($$0) && $$0.e != ffa.c.c;
   }

   private boolean d(ffa $$0) {
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
      fja.Q().bd().d.a();
   }

   public static void g() {
      fja.Q().bd().c.a();
   }

   private void J() {
      for (fhg.e<?> $$0 : this.m.bd().a()) {
         $$0.a();
      }
   }

   private fhg.c a(ffx $$0) {
      fhg.c $$1 = $$0.a.a();
      $$1.a($$0.c, $$0x -> {
         this.aG.a($$0x.a());
         this.aH = $$0x.b();
         this.K();
         boolean $$1x = false;

         for (ffa $$2 : this.aG) {
            if (this.j($$2)) {
               $$1x = true;
            }
         }

         if (!ax && $$1x) {
            ax = true;
            this.L();
         }
      });
      a(fej::d, $$0x -> {
         this.aM.clear();
         this.aM.addAll($$0x);

         for (fez $$1x : $$0x) {
            if ($$1x instanceof fez.a $$2) {
               fmb $$3 = $$2.a(this, this::a);
               if ($$3 != null) {
                  this.m.a($$3);
                  this.a(List.of($$1x));
                  break;
               }
            }
         }

         if (!this.aM.isEmpty() && this.aQ != fee.f.a) {
            this.K();
         }
      });
      $$1.a($$0.d, $$0x -> {
         this.aO.a($$0x);
         this.aO.a($$0x == 0 ? fmk.a(Z) : fmk.a(aa));
         if ($$0x > 0 && this.ay.tryAcquire(1)) {
            this.m.ba().c(xh.a("mco.configure.world.invite.narration", $$0x));
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

   private void a(Collection<fez> $$0) {
      List<UUID> $$1 = new ArrayList<>($$0.size());

      for (fez $$2 : $$0) {
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

   private static <T> void a(fee.k<T> $$0, Consumer<T> $$1) {
      fja $$2 = fja.Q();
      CompletableFuture.<T>supplyAsync(() -> {
         try {
            return $$0.request(fej.a($$2));
         } catch (ffu var3) {
            throw new RuntimeException(var3);
         }
      }).thenAcceptAsync($$1, $$2).exceptionally($$0x -> {
         G.error("Failed to execute call to Realms Service", $$0x);
         return null;
      });
   }

   private void K() {
      ffa $$0 = this.N();
      this.aF.J();

      for (fez $$1 : this.aM) {
         if (this.a($$1)) {
            this.a(List.of($$1));
            break;
         }
      }

      for (ffa $$2 : this.aH) {
         this.aF.a(new fee.a($$2));
      }

      for (ffa $$3 : this.aG) {
         fee.e $$4;
         if (b() && !$$3.h()) {
            if ($$3.e == ffa.c.c) {
               continue;
            }

            $$4 = new fee.i($$3);
         } else {
            $$4 = new fee.l($$3);
         }

         this.aF.a((fee.e)$$4);
         if ($$0 != null && $$0.a == $$3.a) {
            this.aF.a($$4);
         }
      }

      this.D();
      this.G();
   }

   private boolean a(fez $$0) {
      if (!($$0 instanceof fez.c $$1)) {
         return false;
      } else {
         xh $$2 = $$1.d();
         int $$3 = this.p.b($$2, 216);
         int $$4 = azj.e($$3 + 7, 36) - 1;
         this.aF.a(new fee.h($$2, $$4 + 2, $$1));

         for (int $$5 = 0; $$5 < $$4; $$5++) {
            this.aF.a(new fee.d());
         }

         this.aF.a(new fee.b($$1.a(this)));
         return true;
      }
   }

   private void L() {
      new Thread(() -> {
         List<ffi> $$0 = fei.a();
         fej $$1 = fej.a();
         fev $$2 = new fev();
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

      for (ffa $$1 : this.aG) {
         if (this.j($$1)) {
            $$0.add($$1.a);
         }
      }

      return $$0;
   }

   private void e(@Nullable ffa $$0) {
      if ($$0 != null) {
         String $$1 = ayf.a($$0.b, this.m.X().b(), $$0.k);
         this.m.p.a($$1);
         ad.m().a($$1);
      }
   }

   private void f(@Nullable ffa $$0) {
      if ($$0 != null && this.m.b($$0.g)) {
         this.m.a(new fgi(this, $$0.a));
      }
   }

   private void g(@Nullable ffa $$0) {
      if ($$0 != null && !this.m.b($$0.g)) {
         xh $$1 = xh.c("mco.configure.world.leave.question.line1");
         this.m.a(fgu.a(this, $$1, $$1x -> this.h($$0)));
      }
   }

   @Nullable
   private ffa N() {
      return this.aF.h() instanceof fee.l $$0 ? $$0.c() : null;
   }

   private void h(final ffa $$0) {
      (new Thread("Realms-leave-server") {
         @Override
         public void run() {
            try {
               fej $$0 = fej.a();
               $$0.d($$0.a);
               fee.this.m.execute(fee::g);
            } catch (ffu var2) {
               fee.G.error("Couldn't configure world", var2);
               fee.this.m.execute(() -> fee.this.m.a(new fgm(var2, fee.this)));
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
   public xh i() {
      return (xh)(switch (this.aQ) {
         case a -> xg.a(super.i(), K);
         case b -> xg.a(super.i(), Y);
         case c -> super.i();
      });
   }

   @Override
   public void a(fkm $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (b()) {
         $$0.b(this.p, "Minecraft " + ab.b().c(), 2, this.o - 10, -1);
      }

      if (this.aJ && this.aN.j) {
         fgd.a($$0, this.aN);
      }

      switch (fej.a) {
         case b:
            this.a($$0, "STAGE!", -256);
            break;
         case c:
            this.a($$0, "LOCAL!", 8388479);
      }
   }

   private void O() {
      this.m.a(new fgd(this, this.aJ));
   }

   public static void a(@Nullable ffa $$0, fqs $$1) {
      a($$0, $$1, false);
   }

   public static void a(@Nullable ffa $$0, fqs $$1, boolean $$2) {
      if ($$0 != null) {
         if (!b() || $$2 || $$0.i()) {
            fja.Q().a(new fgo($$1, new fhx($$1, $$0)));
            return;
         }

         switch ($$0.u) {
            case f:
               fja.Q().a(new fgo($$1, new fhx($$1, $$0)));
               break;
            case a:
               a($$0, $$1, xh.c("mco.compatibility.unverifiable.title").b(-171), xh.c("mco.compatibility.unverifiable.message"), xg.j);
               break;
            case d:
               a(
                  $$0,
                  $$1,
                  xh.c("selectWorld.backupQuestion.downgrade").b(-2142128),
                  xh.a("mco.compatibility.downgrade.description", xh.b($$0.t).b(-171), xh.b(ab.b().c()).b(-171)),
                  xh.c("mco.compatibility.downgrade")
               );
               break;
            case e:
               b($$0, $$1);
               break;
            case b:
               fja.Q()
                  .a(
                     new fmb.a($$1, ab)
                        .a(xh.a("mco.compatibility.incompatible.series.popup.message", xh.b($$0.t).b(-171), xh.b(ab.b().c()).b(-171)))
                        .a(xg.k, fmb::d)
                        .a()
                  );
               break;
            case c:
               fja.Q().a(new fmb.a($$1, ab).a(ac).a(xg.k, fmb::d).a());
         }
      }
   }

   private static void a(ffa $$0, fqs $$1, xh $$2, xh $$3, xh $$4) {
      fja.Q().a(new fmb.a($$1, $$2).a($$3).a($$4, $$2x -> {
         fja.Q().a(new fgo($$1, new fhx($$1, $$0)));
         g();
      }).a(xg.e, fmb::d).a());
   }

   private static void b(ffa $$0, fqs $$1) {
      xh $$2 = xh.c("mco.compatibility.upgrade.title").b(-171);
      xh $$3 = xh.c("mco.compatibility.upgrade");
      xh $$4 = xh.b($$0.t).b(-171);
      xh $$5 = xh.b(ab.b().c()).b(-171);
      xh $$6 = i($$0) ? xh.a("mco.compatibility.upgrade.description", $$4, $$5) : xh.a("mco.compatibility.upgrade.friend.description", $$4, $$5);
      a($$0, $$1, $$2, $$6, $$3);
   }

   public static xh a(String $$0, boolean $$1) {
      return a($$0, $$1 ? -8355712 : -2142128);
   }

   public static xh a(String $$0, int $$1) {
      return (xh)(StringUtils.isBlank($$0) ? xg.a : xh.a("mco.version", xh.b($$0).b($$1)));
   }

   static boolean i(ffa $$0) {
      return fja.Q().b($$0.g);
   }

   private boolean j(ffa $$0) {
      return i($$0) && !$$0.j;
   }

   private void a(fkm $$0, String $$1, int $$2) {
      $$0.c().a();
      $$0.c().a((float)(this.n / 2 - 25), 20.0F, 0.0F);
      $$0.c().a(a.f.rotationDegrees(-20.0F));
      $$0.c().b(1.5F, 1.5F, 1.5F);
      $$0.a(this.p, $$1, 0, 0, $$2, false);
      $$0.c().b();
   }

   class a extends fee.e {
      private static final xh f = xh.c("mco.snapshot.start");
      private static final int g = 5;
      private final fmn h = new fmn();
      private final ffa i;

      public a(final ffa $$0) {
         this.i = $$0;
         this.h.a(fmk.a(xh.c("mco.snapshot.tooltip")));
      }

      @Override
      public void a(fkm $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(gig::B, fee.b, $$3 - 5, $$2 + $$5 / 2 - 10, 40, 20);
         int $$10 = $$2 + $$5 / 2 - 9 / 2;
         $$0.b(fee.this.p, f, $$3 + 40 - 2, $$10 - 5, 8388479);
         $$0.b(fee.this.p, xh.a("mco.snapshot.description", this.i.c), $$3 + 40 - 2, $$10 + 5, -8355712);
         this.h.a($$8, this.aN_(), new fph($$3, $$2, $$4, $$5));
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         this.c();
         return true;
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         if (fpc.a($$0)) {
            this.c();
            return true;
         } else {
            return super.a($$0, $$1, $$2);
         }
      }

      private void c() {
         fee.this.m.ak().a(hbk.a(awk.Av, 1.0F));
         fee.this.m
            .a(
               new fmb.a(fee.this, xh.c("mco.snapshot.createSnapshotPopup.title"))
                  .a(xh.c("mco.snapshot.createSnapshotPopup.text"))
                  .a(xh.c("mco.selectServer.create"), $$0 -> fee.this.m.a(new fgk(fee.this, this.i.a)))
                  .a(xg.e, fmb::d)
                  .a()
            );
      }

      @Override
      public xh a() {
         return xh.a("gui.narrate.button", xg.a(f, xh.a("mco.snapshot.description", this.i.c)));
      }
   }

   class b extends fee.e {
      private final fkz f;

      public b(final fkz $$0) {
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
      public void a(fkm $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.f.c(fee.this.n / 2 - 75, $$2 + 4);
         this.f.a($$0, $$6, $$7, $$9);
      }

      @Override
      public void a(boolean $$0) {
         super.a($$0);
         this.f.a($$0);
      }

      @Override
      public xh a() {
         return this.f.z();
      }
   }

   static class c extends fll {
      private static final fmm b = new fmm(alh.b("widget/cross_button"), alh.b("widget/cross_button_highlighted"));

      protected c(fkz.c $$0, xh $$1) {
         super(0, 0, 14, 14, b, $$0);
         this.a(fmk.a($$1));
      }
   }

   class d extends fee.e {
      @Override
      public void a(fkm $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
      }

      @Override
      public xh a() {
         return xh.i();
      }
   }

   abstract class e extends flv.a<fee.e> {
      protected static final int b = 10;
      private static final int a = 28;
      protected static final int c = 7;
      protected static final int d = 2;

      protected void a(ffa $$0, fkm $$1, int $$2, int $$3, int $$4, int $$5) {
         int $$6 = $$2 - 10 - 7;
         int $$7 = $$3 + 2;
         if ($$0.j) {
            this.a($$1, $$6, $$7, $$4, $$5, fee.c, () -> fee.S);
         } else if ($$0.e == ffa.c.a) {
            this.a($$1, $$6, $$7, $$4, $$5, fee.D, () -> fee.W);
         } else if (fee.i($$0) && $$0.l < 7) {
            this.a($$1, $$6, $$7, $$4, $$5, fee.B, () -> {
               if ($$0.l <= 0) {
                  return fee.T;
               } else {
                  return (xh)($$0.l == 1 ? fee.U : xh.a("mco.selectServer.expires.days", $$0.l));
               }
            });
         } else if ($$0.e == ffa.c.b) {
            this.a($$1, $$6, $$7, $$4, $$5, fee.C, () -> fee.V);
         }
      }

      private void a(fkm $$0, int $$1, int $$2, int $$3, int $$4, alh $$5, Supplier<xh> $$6) {
         $$0.a(gig::B, $$5, $$1, $$2, 10, 28);
         if (fee.this.aF.c((double)$$3, (double)$$4) && $$3 >= $$1 && $$3 <= $$1 + 10 && $$4 >= $$2 && $$4 <= $$2 + 28) {
            fee.this.d($$6.get());
         }
      }

      protected void a(fkm $$0, int $$1, int $$2, ffa $$3) {
         int $$4 = this.b($$2);
         int $$5 = this.a($$1);
         int $$6 = this.d($$5);
         if (!fee.i($$3)) {
            $$0.a(fee.this.p, $$3.f, $$4, this.d($$5), -8355712, false);
         } else if ($$3.j) {
            xh $$7 = $$3.k ? fee.O : fee.M;
            $$0.a(fee.this.p, $$7, $$4, $$6, -2142128, false);
         }
      }

      protected void a(fkm $$0, String $$1, int $$2, int $$3, int $$4, int $$5) {
         int $$6 = $$4 - $$2;
         if (fee.this.p.b($$1) > $$6) {
            String $$7 = fee.this.p.a($$1, $$6 - fee.this.p.b("... "));
            $$0.a(fee.this.p, $$7 + "...", $$2, $$3, $$5, false);
         } else {
            $$0.a(fee.this.p, $$1, $$2, $$3, $$5, false);
         }
      }

      protected int a(int $$0, int $$1, xh $$2) {
         return $$0 + $$1 - fee.this.p.a($$2) - 20;
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

   static class g extends fme.b {
      private static final alh[] d = new alh[]{
         alh.b("notification/1"),
         alh.b("notification/2"),
         alh.b("notification/3"),
         alh.b("notification/4"),
         alh.b("notification/5"),
         alh.b("notification/more")
      };
      private static final int u = Integer.MAX_VALUE;
      private static final int v = 20;
      private static final int w = 14;
      private int x;

      public g(xh $$0, alh $$1, fkz.c $$2) {
         super(20, 20, $$0, 14, 14, $$1, $$2, null);
      }

      int a() {
         return this.x;
      }

      public void a(int $$0) {
         this.x = $$0;
      }

      @Override
      public void b(fkm $$0, int $$1, int $$2, float $$3) {
         super.b($$0, $$1, $$2, $$3);
         if (this.j && this.x != 0) {
            this.a($$0);
         }
      }

      private void a(fkm $$0) {
         $$0.a(gig::B, d[Math.min(this.x, 6) - 1], this.D() + this.y() - 5, this.E() - 3, 8, 8);
      }
   }

   class h extends fee.e {
      private static final int f = 40;
      private static final int g = -12303292;
      private final xh h;
      private final int i;
      private final List<fkx> j = new ArrayList<>();
      @Nullable
      private final fee.c k;
      private final flt l;
      private final fom m;
      private final fol n;
      private int o = -1;

      public h(final xh $$0, final int $$1, final fez $$2) {
         this.h = $$0;
         this.i = $$1;
         this.m = new fom();
         int $$3 = 7;
         this.m.a(flm.a(20, 20, fee.a), 0, 0, this.m.b().a(7, 7, 0, 0));
         this.m.a(fot.a(40), 0, 0);
         this.n = this.m.a(new fol(0, 9 * 3 * ($$1 - 1)), 0, 1, this.m.b().c(7));
         this.l = this.n.a(new flt($$0, fee.this.p).b(true), this.n.b().b().d());
         this.m.a(fot.a(40), 0, 2);
         if ($$2.b()) {
            this.k = this.m.a(new fee.c($$1x -> fee.this.a($$2.c()), xh.c("mco.notification.dismiss")), 0, 2, this.m.b().c().a(0, 7, 7, 0));
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
      public void b(fkm $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         super.b($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
         $$0.b($$3 - 2, $$2 - 2, $$4, 36 * this.i - 2, -12303292);
      }

      @Override
      public void a(fkm $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
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
      public xh a() {
         return this.h;
      }
   }

   class i extends fee.e {
      private final ffa f;
      private final fmn g = new fmn();

      public i(final ffa $$0) {
         this.f = $$0;
         if (!$$0.j) {
            this.g.a(fmk.a(xh.c("mco.snapshot.parent.tooltip")));
         }
      }

      @Override
      public void a(fkm $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = this.b($$3);
         int $$11 = this.a($$2);
         fho.a($$0, $$3, $$2, 32, this.f.g);
         xh $$12 = fee.a(this.f.t, -8355712);
         int $$13 = this.a($$3, $$4, $$12);
         this.a($$0, this.f.b(), $$10, $$11, $$13, -8355712);
         if ($$12 != xg.a) {
            $$0.a(fee.this.p, $$12, $$13, $$11, -8355712, false);
         }

         $$0.a(fee.this.p, this.f.a(), $$10, this.c($$11), -8355712, false);
         this.a($$0, $$2, $$3, this.f);
         this.a(this.f, $$0, $$3 + $$4, $$2, $$6, $$7);
         this.g.a($$8, this.aN_(), new fph($$3, $$2, $$4, $$5));
      }

      @Override
      public xh a() {
         return xh.b(this.f.c);
      }
   }

   class j extends hed<fee.e> {
      public j() {
         super(fee.this.n, fee.this.o, 0, 36);
      }

      public void a(@Nullable fee.e $$0) {
         super.a($$0);
         fee.this.G();
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
      T request(fej var1) throws ffu;
   }

   class l extends fee.e {
      private static final xh f = xh.c("mco.onlinePlayers");
      private static final int g = 9;
      private static final int h = 36;
      private final ffa i;
      private final fmn j = new fmn();

      public l(final ffa $$0) {
         this.i = $$0;
         boolean $$1 = fee.i($$0);
         if (fee.b() && $$1 && $$0.h()) {
            this.j.a(fmk.a(xh.a("mco.snapshot.paired", $$0.s)));
         } else if (!$$1 && $$0.f()) {
            this.j.a(fmk.a(xh.a("mco.snapshot.friendsRealm.downgrade", $$0.t)));
         }
      }

      @Override
      public void a(fkm $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         if (this.i.e == ffa.c.c) {
            $$0.a(gig::B, fee.b, $$3 - 5, $$2 + $$5 / 2 - 10, 40, 20);
            int $$10 = $$2 + $$5 / 2 - 9 / 2;
            $$0.b(fee.this.p, fee.L, $$3 + 40 - 2, $$10, 8388479);
         } else {
            this.a(this.i, $$0, $$3 + 36, $$2, $$6, $$7);
            fho.a($$0, $$3, $$2, 32, this.i.g);
            this.a($$0, $$2, $$3, $$4);
            this.a($$0, $$2, $$3);
            this.a($$0, $$2, $$3, this.i);
            boolean $$11 = this.a($$0, $$2, $$3, $$4, $$5, $$6, $$7);
            this.a(this.i, $$0, $$3 + $$4, $$2, $$6, $$7);
            if (!$$11) {
               this.j.a($$8, this.aN_(), new fph($$3, $$2, $$4, $$5));
            }
         }
      }

      private void a(fkm $$0, int $$1, int $$2, int $$3) {
         int $$4 = this.b($$2);
         int $$5 = this.a($$1);
         xh $$6 = fee.a(this.i.t, this.i.d());
         int $$7 = this.a($$2, $$3, $$6);
         this.a($$0, this.i.b(), $$4, $$5, $$7, -1);
         if ($$6 != xg.a && !this.i.i()) {
            $$0.a(fee.this.p, $$6, $$7, $$5, -8355712, false);
         }
      }

      private void a(fkm $$0, int $$1, int $$2) {
         int $$3 = this.b($$2);
         int $$4 = this.a($$1);
         int $$5 = this.c($$4);
         String $$6 = this.i.c();
         if (this.i.i() && $$6 != null) {
            xh $$7 = xh.b($$6).a(n.h);
            $$0.a(fee.this.p, xh.a("mco.selectServer.minigameName", $$7).b(-171), $$3, $$5, -1, false);
         } else {
            $$0.a(fee.this.p, this.i.a(), $$3, this.c($$4), -8355712, false);
         }
      }

      private boolean a(fkm $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6) {
         List<ProfileResult> $$7 = fee.this.aI.a(this.i.a);
         if (!$$7.isEmpty()) {
            int $$8 = $$2 + $$3 - 21;
            int $$9 = $$1 + $$4 - 9 - 2;
            int $$10 = $$8;

            for (int $$11 = 0; $$11 < $$7.size(); $$11++) {
               $$10 -= 9 + ($$11 == 0 ? 0 : 3);
               fly.a($$0, fja.Q().an().b($$7.get($$11).profile()), $$10, $$9, 9);
            }

            if ($$5 >= $$10 && $$5 <= $$8 && $$6 >= $$9 && $$6 <= $$9 + 9) {
               $$0.a(fee.this.p, List.of(f), Optional.of(new fsy.a($$7)), $$5, $$6);
               return true;
            }
         }

         return false;
      }

      private void d() {
         fee.this.m.ak().a(hbk.a(awk.Av, 1.0F));
         fee.a(this.i, fee.this);
      }

      private void e() {
         fee.this.m.ak().a(hbk.a(awk.Av, 1.0F));
         fgk $$0 = new fgk(fee.this, this.i);
         fee.this.m.a($$0);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         if (this.i.e == ffa.c.c) {
            this.e();
         } else if (fee.this.a(this.i)) {
            if (ad.c() - fee.this.aL < 250L && this.aN_()) {
               this.d();
            }

            fee.this.aL = ad.c();
         }

         return true;
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         if (fpc.a($$0)) {
            if (this.i.e == ffa.c.c) {
               this.e();
               return true;
            }

            if (fee.this.a(this.i)) {
               this.d();
               return true;
            }
         }

         return super.a($$0, $$1, $$2);
      }

      @Override
      public xh a() {
         return (xh)(this.i.e == ffa.c.c ? fee.X : xh.a("narrator.select", this.i.c));
      }

      public ffa c() {
         return this.i;
      }
   }
}
