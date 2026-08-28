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

public class fbn extends gwj {
   static final akq a = akq.b("icon/info");
   static final akq b = akq.b("icon/new_realm");
   static final akq c = akq.b("realm_status/expired");
   static final akq A = akq.b("realm_status/expires_soon");
   static final akq B = akq.b("realm_status/open");
   static final akq C = akq.b("realm_status/closed");
   private static final akq D = akq.b("icon/invite");
   private static final akq E = akq.b("icon/news");
   static final Logger F = LogUtils.getLogger();
   private static final akq G = akq.b("textures/gui/title/realms.png");
   private static final akq H = akq.b("textures/gui/realms/no_realms.png");
   private static final wy I = wy.c("menu.online");
   private static final wy J = wy.c("mco.selectServer.loading");
   static final wy K = wy.c("mco.selectServer.uninitialized");
   static final wy L = wy.c("mco.selectServer.expiredList");
   private static final wy M = wy.c("mco.selectServer.expiredRenew");
   static final wy N = wy.c("mco.selectServer.expiredTrial");
   private static final wy O = wy.c("mco.selectServer.play");
   private static final wy P = wy.c("mco.selectServer.leave");
   private static final wy Q = wy.c("mco.selectServer.configure");
   static final wy R = wy.c("mco.selectServer.expired");
   static final wy S = wy.c("mco.selectServer.expires.soon");
   static final wy T = wy.c("mco.selectServer.expires.day");
   static final wy U = wy.c("mco.selectServer.open");
   static final wy V = wy.c("mco.selectServer.closed");
   static final wy W = wy.a("gui.narrate.button", K);
   private static final wy X = wy.c("mco.selectServer.noRealms");
   private static final wy Y = wy.c("mco.invites.nopending");
   private static final wy Z = wy.c("mco.invites.pending");
   private static final wy aa = wy.c("mco.compatibility.incompatible.popup.title");
   private static final wy ab = wy.c("mco.compatibility.incompatible.releaseType.popup.message");
   private static final int ac = 100;
   private static final int ad = 3;
   private static final int ae = 4;
   private static final int af = 308;
   private static final int ag = 128;
   private static final int ah = 34;
   private static final int ai = 128;
   private static final int aj = 64;
   private static final int ak = 5;
   private static final int al = 44;
   private static final int am = 11;
   private static final int an = 40;
   private static final int ao = 20;
   private static final int ap = 216;
   private static final int aq = 36;
   private static final boolean ar = !ab.b().g();
   private static boolean as = ar;
   private final CompletableFuture<fbm.a> at = fbm.a();
   @Nullable
   private fep.c au;
   private final Set<UUID> av = new HashSet<>();
   private static boolean aw;
   private final RateLimiter ax;
   private final fnx ay;
   private fig az;
   private fig aA;
   private fig aB;
   private fig aC;
   private fig aD;
   fbn.j aE;
   private fdi aF;
   private List<fcj> aG = List.of();
   fcm aH = new fcm();
   private volatile boolean aI;
   @Nullable
   private volatile String aJ;
   long aK;
   private final List<fci> aL = new ArrayList<>();
   private fig aM;
   private fbn.g aN;
   private fbn.g aO;
   private fbn.f aP;
   @Nullable
   private flt aQ;

   public fbn(fnx $$0) {
      super(I);
      this.ay = $$0;
      this.ax = RateLimiter.create(0.016666668F);
   }

   @Override
   public void aP_() {
      this.aF = new fdi(this.l);
      this.aE = new fbn.j();
      wy $$0 = wy.c("mco.invites.title");
      this.aN = new fbn.g($$0, D, $$1x -> this.l.a(new feb(this, $$0)));
      wy $$1 = wy.c("mco.news");
      this.aO = new fbn.g($$1, E, $$0x -> {
         String $$1x = this.aJ;
         if ($$1x != null) {
            fmu.a(this, $$1x);
            if (this.aO.a() != 0) {
               fev.a $$2 = fev.b();
               $$2.b = false;
               fev.b($$2);
               this.aO.a(0);
            }
         }
      });
      this.aO.a(fjr.a($$1));
      this.az = fig.a(O, $$0x -> a(this.N(), this)).a(100).a();
      this.aC = fig.a(Q, $$0x -> this.f(this.N())).a(100).a();
      this.aB = fig.a(M, $$0x -> this.e(this.N())).a(100).a();
      this.aD = fig.a(P, $$0x -> this.g(this.N())).a(100).a();
      this.aM = fig.a(wy.c("mco.selectServer.purchase"), $$0x -> this.O()).b(100, 20).a();
      this.aA = fig.a(wx.k, $$0x -> this.d()).a(100).a();
      if (fbs.a == fbs.b.b) {
         this.c(fin.a(wy.b("Snapshot"), wy.b("Release")).a(5, 5, 100, 20, wy.b("Realm"), ($$0x, $$1x) -> {
            as = $$1x;
            this.aG = List.of();
            this.J();
         }));
      }

      this.a(fbn.f.a);
      this.G();
      this.at.thenAcceptAsync($$0x -> {
         fnx $$1x = $$0x.a(this.ay);
         if ($$1x == null) {
            this.au = this.a(this.l.aY());
         } else {
            this.l.a($$1x);
         }
      }, this.p);
   }

   public static boolean b() {
      return ar && as;
   }

   @Override
   protected void c() {
      if (this.aQ != null) {
         this.aE.a(this.m, this.aQ);
         this.aQ.a();
      }
   }

   @Override
   public void d() {
      this.l.a(this.ay);
   }

   private void D() {
      if (this.aF.a() && this.aG.isEmpty() && this.aL.isEmpty()) {
         this.a(fbn.f.b);
      } else {
         this.a(fbn.f.c);
      }
   }

   private void a(fbn.f $$0) {
      if (this.aP != $$0) {
         if (this.aQ != null) {
            this.aQ.a($$1 -> this.e($$1));
         }

         this.aQ = this.b($$0);
         this.aP = $$0;
         this.aQ.a($$1 -> {
            fie var10000 = this.c($$1);
         });
         this.c();
      }
   }

   private flt b(fbn.f $$0) {
      flt $$1 = new flt(this);
      $$1.b(44);
      $$1.a(this.E());
      flu $$2 = this.c($$0);
      $$2.a();
      $$1.a($$2.w() + 22);
      $$1.b($$2);
      switch ($$0) {
         case a:
            $$1.c(new fiv(this.o, J));
            break;
         case b:
            $$1.c(this.F());
            break;
         case c:
            $$1.c(this.aE);
      }

      return $$1;
   }

   private flu E() {
      int $$0 = 90;
      flx $$1 = flx.e().a(4);
      $$1.c().e();
      $$1.a(this.aN);
      $$1.a(this.aO);
      flx $$2 = flx.e();
      $$2.c().e();
      $$2.a(fly.a(90));
      $$2.a(fit.a(128, 34, G, 128, 64), flw::b);
      $$2.a(new flr(90, 44)).a($$1, flw::c);
      return $$2;
   }

   private flu c(fbn.f $$0) {
      fls $$1 = new fls().c(4);
      fls.b $$2 = $$1.d(3);
      if ($$0 == fbn.f.c) {
         $$2.a(this.az);
         $$2.a(this.aC);
         $$2.a(this.aB);
         $$2.a(this.aD);
      }

      $$2.a(this.aM);
      $$2.a(this.aA);
      return $$1;
   }

   private flx F() {
      flx $$0 = flx.d().a(8);
      $$0.c().b();
      $$0.a(fit.a(130, 64, H, 130, 64));
      fir $$1 = new fir(308, X, this.o, false, 4);
      $$0.a($$1);
      return $$0;
   }

   void G() {
      fcj $$0 = this.N();
      this.aM.j = this.aP != fbn.f.a;
      this.az.j = $$0 != null && this.a($$0);
      this.aB.j = $$0 != null && this.b($$0);
      this.aD.j = $$0 != null && this.d($$0);
      this.aC.j = $$0 != null && this.c($$0);
   }

   boolean a(fcj $$0) {
      boolean $$1 = !$$0.j && $$0.e == fcj.c.b;
      return $$1 && ($$0.d() || $$0.e() || i($$0));
   }

   private boolean b(fcj $$0) {
      return $$0.j && i($$0);
   }

   private boolean c(fcj $$0) {
      return i($$0) && $$0.e != fcj.c.c;
   }

   private boolean d(fcj $$0) {
      return !i($$0);
   }

   @Override
   public void e() {
      super.e();
      if (this.au != null) {
         this.au.b();
      }
   }

   public static void f() {
      fgi.Q().aY().d.a();
   }

   public static void g() {
      fgi.Q().aY().c.a();
   }

   private void J() {
      for (fep.e<?> $$0 : this.l.aY().a()) {
         $$0.a();
      }
   }

   private fep.c a(fdg $$0) {
      fep.c $$1 = $$0.a.a();
      $$1.a($$0.c, $$0x -> {
         this.aF.a($$0x.a());
         this.aG = $$0x.b();
         this.K();
         boolean $$1x = false;

         for (fcj $$2 : this.aF) {
            if (this.j($$2)) {
               $$1x = true;
            }
         }

         if (!aw && $$1x) {
            aw = true;
            this.L();
         }
      });
      a(fbs::d, $$0x -> {
         this.aL.clear();
         this.aL.addAll($$0x);

         for (fci $$1x : $$0x) {
            if ($$1x instanceof fci.a $$2) {
               fji $$3 = $$2.a(this, this::a);
               if ($$3 != null) {
                  this.l.a($$3);
                  this.a(List.of($$1x));
                  break;
               }
            }
         }

         if (!this.aL.isEmpty() && this.aP != fbn.f.a) {
            this.K();
         }
      });
      $$1.a($$0.d, $$0x -> {
         this.aN.a($$0x);
         this.aN.a($$0x == 0 ? fjr.a(Y) : fjr.a(Z));
         if ($$0x > 0 && this.ax.tryAcquire(1)) {
            this.l.aV().c(wy.a("mco.configure.world.invite.narration", $$0x));
         }
      });
      $$1.a($$0.e, $$0x -> this.aI = $$0x);
      $$1.a($$0.g, $$0x -> this.aH = $$0x);
      $$1.a($$0.f, $$1x -> {
         $$0.h.a($$1x);
         this.aJ = $$0.h.b();
         this.aO.a($$0.h.a() ? Integer.MAX_VALUE : 0);
      });
      return $$1;
   }

   private void a(Collection<fci> $$0) {
      List<UUID> $$1 = new ArrayList<>($$0.size());

      for (fci $$2 : $$0) {
         if (!$$2.a() && !this.av.contains($$2.c())) {
            $$1.add($$2.c());
         }
      }

      if (!$$1.isEmpty()) {
         a($$1x -> {
            $$1x.a($$1);
            return null;
         }, $$1x -> this.av.addAll($$1));
      }
   }

   private static <T> void a(fbn.k<T> $$0, Consumer<T> $$1) {
      fgi $$2 = fgi.Q();
      CompletableFuture.<T>supplyAsync(() -> {
         try {
            return $$0.request(fbs.a($$2));
         } catch (fdd var3) {
            throw new RuntimeException(var3);
         }
      }).thenAcceptAsync($$1, $$2).exceptionally($$0x -> {
         F.error("Failed to execute call to Realms Service", $$0x);
         return null;
      });
   }

   private void K() {
      fcj $$0 = this.N();
      this.aE.J();

      for (fci $$1 : this.aL) {
         if (this.a($$1)) {
            this.a(List.of($$1));
            break;
         }
      }

      for (fcj $$2 : this.aG) {
         this.aE.a(new fbn.a($$2));
      }

      for (fcj $$3 : this.aF) {
         fbn.e $$4;
         if (b() && !$$3.h()) {
            if ($$3.e == fcj.c.c) {
               continue;
            }

            $$4 = new fbn.i($$3);
         } else {
            $$4 = new fbn.l($$3);
         }

         this.aE.a((fbn.e)$$4);
         if ($$0 != null && $$0.a == $$3.a) {
            this.aE.a($$4);
         }
      }

      this.D();
      this.G();
   }

   private boolean a(fci $$0) {
      if (!($$0 instanceof fci.c $$1)) {
         return false;
      } else {
         wy $$2 = $$1.d();
         int $$3 = this.o.b($$2, 216);
         int $$4 = ayn.e($$3 + 7, 36) - 1;
         this.aE.a(new fbn.h($$2, $$4 + 2, $$1));

         for (int $$5 = 0; $$5 < $$4; $$5++) {
            this.aE.a(new fbn.d());
         }

         this.aE.a(new fbn.b($$1.a(this)));
         return true;
      }
   }

   private void L() {
      new Thread(() -> {
         List<fcr> $$0 = fbr.a();
         fbs $$1 = fbs.a();
         fce $$2 = new fce();
         $$2.a = $$0;
         $$2.b = this.M();

         try {
            $$1.a($$2);
         } catch (Throwable var5) {
            F.warn("Could not send ping result to Realms: ", var5);
         }
      }).start();
   }

   private List<Long> M() {
      List<Long> $$0 = Lists.newArrayList();

      for (fcj $$1 : this.aF) {
         if (this.j($$1)) {
            $$0.add($$1.a);
         }
      }

      return $$0;
   }

   private void e(@Nullable fcj $$0) {
      if ($$0 != null) {
         String $$1 = axi.a($$0.b, this.l.X().b(), $$0.k);
         this.l.o.a($$1);
         ad.k().a($$1);
      }
   }

   private void f(@Nullable fcj $$0) {
      if ($$0 != null && this.l.b($$0.g)) {
         this.l.a(new fdr(this, $$0.a));
      }
   }

   private void g(@Nullable fcj $$0) {
      if ($$0 != null && !this.l.b($$0.g)) {
         wy $$1 = wy.c("mco.configure.world.leave.question.line1");
         this.l.a(fed.a(this, $$1, $$1x -> this.h($$0)));
      }
   }

   @Nullable
   private fcj N() {
      return this.aE.h() instanceof fbn.l $$0 ? $$0.c() : null;
   }

   private void h(final fcj $$0) {
      (new Thread("Realms-leave-server") {
         @Override
         public void run() {
            try {
               fbs $$0 = fbs.a();
               $$0.d($$0.a);
               fbn.this.l.execute(fbn::g);
            } catch (fdd var2) {
               fbn.F.error("Couldn't configure world", var2);
               fbn.this.l.execute(() -> fbn.this.l.a(new fdv(var2, fbn.this)));
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
         this.aL.removeIf($$1x -> $$1x.b() && $$0.equals($$1x.c()));
         this.K();
      });
   }

   public void h() {
      this.aE.a(null);
      g();
   }

   @Override
   public wy i() {
      return (wy)(switch (this.aP) {
         case a -> wx.a(super.i(), J);
         case b -> wx.a(super.i(), X);
         case c -> super.i();
      });
   }

   @Override
   public void a(fht $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (b()) {
         $$0.b(this.o, "Minecraft " + ab.b().c(), 2, this.n - 10, -1);
      }

      if (this.aI && this.aM.j) {
         fdm.a($$0, this.aM);
      }

      switch (fbs.a) {
         case b:
            this.a($$0, "STAGE!", -256);
            break;
         case c:
            this.a($$0, "LOCAL!", 8388479);
      }
   }

   private void O() {
      this.l.a(new fdm(this, this.aI));
   }

   public static void a(@Nullable fcj $$0, fnx $$1) {
      a($$0, $$1, false);
   }

   public static void a(@Nullable fcj $$0, fnx $$1, boolean $$2) {
      if ($$0 != null) {
         if (!b() || $$2 || $$0.i()) {
            fgi.Q().a(new fdx($$1, new ffg($$1, $$0)));
            return;
         }

         switch ($$0.u) {
            case f:
               fgi.Q().a(new fdx($$1, new ffg($$1, $$0)));
               break;
            case a:
               a($$0, $$1, wy.c("mco.compatibility.unverifiable.title").b(-171), wy.c("mco.compatibility.unverifiable.message"), wx.j);
               break;
            case d:
               a(
                  $$0,
                  $$1,
                  wy.c("selectWorld.backupQuestion.downgrade").b(-2142128),
                  wy.a("mco.compatibility.downgrade.description", wy.b($$0.t).b(-171), wy.b(ab.b().c()).b(-171)),
                  wy.c("mco.compatibility.downgrade")
               );
               break;
            case e:
               b($$0, $$1);
               break;
            case b:
               fgi.Q()
                  .a(
                     new fji.a($$1, aa)
                        .a(wy.a("mco.compatibility.incompatible.series.popup.message", wy.b($$0.t).b(-171), wy.b(ab.b().c()).b(-171)))
                        .a(wx.k, fji::d)
                        .a()
                  );
               break;
            case c:
               fgi.Q().a(new fji.a($$1, aa).a(ab).a(wx.k, fji::d).a());
         }
      }
   }

   private static void a(fcj $$0, fnx $$1, wy $$2, wy $$3, wy $$4) {
      fgi.Q().a(new fji.a($$1, $$2).a($$3).a($$4, $$2x -> {
         fgi.Q().a(new fdx($$1, new ffg($$1, $$0)));
         g();
      }).a(wx.e, fji::d).a());
   }

   private static void b(fcj $$0, fnx $$1) {
      wy $$2 = wy.c("mco.compatibility.upgrade.title").b(-171);
      wy $$3 = wy.c("mco.compatibility.upgrade");
      wy $$4 = wy.b($$0.t).b(-171);
      wy $$5 = wy.b(ab.b().c()).b(-171);
      wy $$6 = i($$0) ? wy.a("mco.compatibility.upgrade.description", $$4, $$5) : wy.a("mco.compatibility.upgrade.friend.description", $$4, $$5);
      a($$0, $$1, $$2, $$6, $$3);
   }

   public static wy a(String $$0, boolean $$1) {
      return a($$0, $$1 ? -8355712 : -2142128);
   }

   public static wy a(String $$0, int $$1) {
      return (wy)(StringUtils.isBlank($$0) ? wx.a : wy.a("mco.version", wy.b($$0).b($$1)));
   }

   static boolean i(fcj $$0) {
      return fgi.Q().b($$0.g);
   }

   private boolean j(fcj $$0) {
      return i($$0) && !$$0.j;
   }

   private void a(fht $$0, String $$1, int $$2) {
      $$0.c().a();
      $$0.c().a((float)(this.m / 2 - 25), 20.0F, 0.0F);
      $$0.c().a(a.f.rotationDegrees(-20.0F));
      $$0.c().b(1.5F, 1.5F, 1.5F);
      $$0.a(this.o, $$1, 0, 0, $$2, false);
      $$0.c().b();
   }

   class a extends fbn.e {
      private static final wy f = wy.c("mco.snapshot.start");
      private static final int g = 5;
      private final fju h = new fju();
      private final fcj i;

      public a(final fcj $$0) {
         this.i = $$0;
         this.h.a(fjr.a(wy.c("mco.snapshot.tooltip")));
      }

      @Override
      public void a(fht $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(fbn.b, $$3 - 5, $$2 + $$5 / 2 - 10, 40, 20);
         int $$10 = $$2 + $$5 / 2 - 9 / 2;
         $$0.b(fbn.this.o, f, $$3 + 40 - 2, $$10 - 5, 8388479);
         $$0.b(fbn.this.o, wy.a("mco.snapshot.description", this.i.c), $$3 + 40 - 2, $$10 + 5, -8355712);
         this.h.a($$8, this.aK_(), new fmm($$3, $$2, $$4, $$5));
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         this.c();
         return true;
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         if (fmh.a($$0)) {
            this.c();
            return true;
         } else {
            return super.a($$0, $$1, $$2);
         }
      }

      private void c() {
         fbn.this.l.aj().a(gto.a(avo.Ar, 1.0F));
         fbn.this.l
            .a(
               new fji.a(fbn.this, wy.c("mco.snapshot.createSnapshotPopup.title"))
                  .a(wy.c("mco.snapshot.createSnapshotPopup.text"))
                  .a(wy.c("mco.selectServer.create"), $$0 -> fbn.this.l.a(new fdt(fbn.this, this.i.a)))
                  .a(wx.e, fji::d)
                  .a()
            );
      }

      @Override
      public wy a() {
         return wy.a("gui.narrate.button", wx.a(f, wy.a("mco.snapshot.description", this.i.c)));
      }
   }

   class b extends fbn.e {
      private final fig f;

      public b(final fig $$0) {
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
      public void a(fht $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.f.c(fbn.this.m / 2 - 75, $$2 + 4);
         this.f.a($$0, $$6, $$7, $$9);
      }

      @Override
      public void a(boolean $$0) {
         super.a($$0);
         this.f.a($$0);
      }

      @Override
      public wy a() {
         return this.f.z();
      }
   }

   static class c extends fis {
      private static final fjt b = new fjt(akq.b("widget/cross_button"), akq.b("widget/cross_button_highlighted"));

      protected c(fig.c $$0, wy $$1) {
         super(0, 0, 14, 14, b, $$0);
         this.a(fjr.a($$1));
      }
   }

   class d extends fbn.e {
      @Override
      public void a(fht $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
      }

      @Override
      public wy a() {
         return wy.i();
      }
   }

   abstract class e extends fjc.a<fbn.e> {
      protected static final int b = 10;
      private static final int a = 28;
      protected static final int c = 7;
      protected static final int d = 2;

      protected void a(fcj $$0, fht $$1, int $$2, int $$3, int $$4, int $$5) {
         int $$6 = $$2 - 10 - 7;
         int $$7 = $$3 + 2;
         if ($$0.j) {
            this.a($$1, $$6, $$7, $$4, $$5, fbn.c, () -> fbn.R);
         } else if ($$0.e == fcj.c.a) {
            this.a($$1, $$6, $$7, $$4, $$5, fbn.C, () -> fbn.V);
         } else if (fbn.i($$0) && $$0.l < 7) {
            this.a($$1, $$6, $$7, $$4, $$5, fbn.A, () -> {
               if ($$0.l <= 0) {
                  return fbn.S;
               } else {
                  return (wy)($$0.l == 1 ? fbn.T : wy.a("mco.selectServer.expires.days", $$0.l));
               }
            });
         } else if ($$0.e == fcj.c.b) {
            this.a($$1, $$6, $$7, $$4, $$5, fbn.B, () -> fbn.U);
         }
      }

      private void a(fht $$0, int $$1, int $$2, int $$3, int $$4, akq $$5, Supplier<wy> $$6) {
         $$0.a($$5, $$1, $$2, 10, 28);
         if (fbn.this.aE.c((double)$$3, (double)$$4) && $$3 >= $$1 && $$3 <= $$1 + 10 && $$4 >= $$2 && $$4 <= $$2 + 28) {
            fbn.this.d($$6.get());
         }
      }

      protected void a(fht $$0, int $$1, int $$2, fcj $$3) {
         int $$4 = this.b($$2);
         int $$5 = this.a($$1);
         int $$6 = this.d($$5);
         if (!fbn.i($$3)) {
            $$0.a(fbn.this.o, $$3.f, $$4, this.d($$5), -8355712, false);
         } else if ($$3.j) {
            wy $$7 = $$3.k ? fbn.N : fbn.L;
            $$0.a(fbn.this.o, $$7, $$4, $$6, -2142128, false);
         }
      }

      protected void a(fht $$0, String $$1, int $$2, int $$3, int $$4, int $$5) {
         int $$6 = $$4 - $$2;
         if (fbn.this.o.b($$1) > $$6) {
            String $$7 = fbn.this.o.a($$1, $$6 - fbn.this.o.b("... "));
            $$0.a(fbn.this.o, $$7 + "...", $$2, $$3, $$5, false);
         } else {
            $$0.a(fbn.this.o, $$1, $$2, $$3, $$5, false);
         }
      }

      protected int a(int $$0, int $$1, wy $$2) {
         return $$0 + $$1 - fbn.this.o.a($$2) - 20;
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

   static class g extends fjl.b {
      private static final akq[] d = new akq[]{
         akq.b("notification/1"),
         akq.b("notification/2"),
         akq.b("notification/3"),
         akq.b("notification/4"),
         akq.b("notification/5"),
         akq.b("notification/more")
      };
      private static final int u = Integer.MAX_VALUE;
      private static final int v = 20;
      private static final int w = 14;
      private int x;

      public g(wy $$0, akq $$1, fig.c $$2) {
         super(20, 20, $$0, 14, 14, $$1, $$2, null);
      }

      int a() {
         return this.x;
      }

      public void a(int $$0) {
         this.x = $$0;
      }

      @Override
      public void b(fht $$0, int $$1, int $$2, float $$3) {
         super.b($$0, $$1, $$2, $$3);
         if (this.j && this.x != 0) {
            this.a($$0);
         }
      }

      private void a(fht $$0) {
         $$0.a(d[Math.min(this.x, 6) - 1], this.D() + this.y() - 5, this.E() - 3, 8, 8);
      }
   }

   class h extends fbn.e {
      private static final int f = 40;
      private static final int g = -12303292;
      private final wy h;
      private final int i;
      private final List<fie> j = new ArrayList<>();
      @Nullable
      private final fbn.c k;
      private final fja l;
      private final fls m;
      private final flr n;
      private int o = -1;

      public h(final wy $$0, final int $$1, final fci $$2) {
         this.h = $$0;
         this.i = $$1;
         this.m = new fls();
         int $$3 = 7;
         this.m.a(fit.a(20, 20, fbn.a), 0, 0, this.m.b().a(7, 7, 0, 0));
         this.m.a(fly.a(40), 0, 0);
         this.n = this.m.a(new flr(0, 9 * 3 * ($$1 - 1)), 0, 1, this.m.b().c(7));
         this.l = this.n.a(new fja($$0, fbn.this.o).b(true), this.n.b().b().d());
         this.m.a(fly.a(40), 0, 2);
         if ($$2.b()) {
            this.k = this.m.a(new fbn.c($$1x -> fbn.this.a($$2.c()), wy.c("mco.notification.dismiss")), 0, 2, this.m.b().c().a(0, 7, 7, 0));
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
      public void b(fht $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         super.b($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
         $$0.b($$3 - 2, $$2 - 2, $$4, 36 * this.i - 2, -12303292);
      }

      @Override
      public void a(fht $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
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
      public wy a() {
         return this.h;
      }
   }

   class i extends fbn.e {
      private final fcj f;
      private final fju g = new fju();

      public i(final fcj $$0) {
         this.f = $$0;
         if (!$$0.j) {
            this.g.a(fjr.a(wy.c("mco.snapshot.parent.tooltip")));
         }
      }

      @Override
      public void a(fht $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = this.b($$3);
         int $$11 = this.a($$2);
         fex.a($$0, $$3, $$2, 32, this.f.g);
         wy $$12 = fbn.a(this.f.t, -8355712);
         int $$13 = this.a($$3, $$4, $$12);
         this.a($$0, this.f.b(), $$10, $$11, $$13, -8355712);
         if ($$12 != wx.a) {
            $$0.a(fbn.this.o, $$12, $$13, $$11, -8355712, false);
         }

         $$0.a(fbn.this.o, this.f.a(), $$10, this.c($$11), -8355712, false);
         this.a($$0, $$2, $$3, this.f);
         this.a(this.f, $$0, $$3 + $$4, $$2, $$6, $$7);
         this.g.a($$8, this.aK_(), new fmm($$3, $$2, $$4, $$5));
      }

      @Override
      public wy a() {
         return wy.b(this.f.c);
      }
   }

   class j extends gwi<fbn.e> {
      public j() {
         super(fbn.this.m, fbn.this.n, 0, 36);
      }

      public void a(@Nullable fbn.e $$0) {
         super.a($$0);
         fbn.this.G();
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
      T request(fbs var1) throws fdd;
   }

   class l extends fbn.e {
      private static final wy f = wy.c("mco.onlinePlayers");
      private static final int g = 9;
      private static final int h = 36;
      private final fcj i;
      private final fju j = new fju();

      public l(final fcj $$0) {
         this.i = $$0;
         boolean $$1 = fbn.i($$0);
         if (fbn.b() && $$1 && $$0.h()) {
            this.j.a(fjr.a(wy.a("mco.snapshot.paired", $$0.s)));
         } else if (!$$1 && $$0.f()) {
            this.j.a(fjr.a(wy.a("mco.snapshot.friendsRealm.downgrade", $$0.t)));
         }
      }

      @Override
      public void a(fht $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         if (this.i.e == fcj.c.c) {
            $$0.a(fbn.b, $$3 - 5, $$2 + $$5 / 2 - 10, 40, 20);
            int $$10 = $$2 + $$5 / 2 - 9 / 2;
            $$0.b(fbn.this.o, fbn.K, $$3 + 40 - 2, $$10, 8388479);
         } else {
            this.a(this.i, $$0, $$3 + 36, $$2, $$6, $$7);
            fex.a($$0, $$3, $$2, 32, this.i.g);
            this.a($$0, $$2, $$3, $$4);
            this.a($$0, $$2, $$3);
            this.a($$0, $$2, $$3, this.i);
            boolean $$11 = this.a($$0, $$2, $$3, $$4, $$5, $$6, $$7);
            this.a(this.i, $$0, $$3 + $$4, $$2, $$6, $$7);
            if (!$$11) {
               this.j.a($$8, this.aK_(), new fmm($$3, $$2, $$4, $$5));
            }
         }
      }

      private void a(fht $$0, int $$1, int $$2, int $$3) {
         int $$4 = this.b($$2);
         int $$5 = this.a($$1);
         wy $$6 = fbn.a(this.i.t, this.i.d());
         int $$7 = this.a($$2, $$3, $$6);
         this.a($$0, this.i.b(), $$4, $$5, $$7, -1);
         if ($$6 != wx.a && !this.i.i()) {
            $$0.a(fbn.this.o, $$6, $$7, $$5, -8355712, false);
         }
      }

      private void a(fht $$0, int $$1, int $$2) {
         int $$3 = this.b($$2);
         int $$4 = this.a($$1);
         int $$5 = this.c($$4);
         String $$6 = this.i.c();
         if (this.i.i() && $$6 != null) {
            wy $$7 = wy.b($$6).a(n.h);
            $$0.a(fbn.this.o, wy.a("mco.selectServer.minigameName", $$7).b(-171), $$3, $$5, -1, false);
         } else {
            $$0.a(fbn.this.o, this.i.a(), $$3, this.c($$4), -8355712, false);
         }
      }

      private boolean a(fht $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6) {
         List<ProfileResult> $$7 = fbn.this.aH.a(this.i.a);
         if (!$$7.isEmpty()) {
            int $$8 = $$2 + $$3 - 21;
            int $$9 = $$1 + $$4 - 9 - 2;
            int $$10 = $$8;

            for (int $$11 = 0; $$11 < $$7.size(); $$11++) {
               $$10 -= 9 + ($$11 == 0 ? 0 : 3);
               fjf.a($$0, fgi.Q().am().b($$7.get($$11).profile()), $$10, $$9, 9);
            }

            if ($$5 >= $$10 && $$5 <= $$8 && $$6 >= $$9 && $$6 <= $$9 + 9) {
               $$0.a(fbn.this.o, List.of(f), Optional.of(new fqe.a($$7)), $$5, $$6);
               return true;
            }
         }

         return false;
      }

      private void d() {
         fbn.this.l.aj().a(gto.a(avo.Ar, 1.0F));
         fbn.a(this.i, fbn.this);
      }

      private void e() {
         fbn.this.l.aj().a(gto.a(avo.Ar, 1.0F));
         fdt $$0 = new fdt(fbn.this, this.i);
         fbn.this.l.a($$0);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         if (this.i.e == fcj.c.c) {
            this.e();
         } else if (fbn.this.a(this.i)) {
            if (ad.c() - fbn.this.aK < 250L && this.aK_()) {
               this.d();
            }

            fbn.this.aK = ad.c();
         }

         return true;
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         if (fmh.a($$0)) {
            if (this.i.e == fcj.c.c) {
               this.e();
               return true;
            }

            if (fbn.this.a(this.i)) {
               this.d();
               return true;
            }
         }

         return super.a($$0, $$1, $$2);
      }

      @Override
      public wy a() {
         return (wy)(this.i.e == fcj.c.c ? fbn.W : wy.a("narrator.select", this.i.c));
      }

      public fcj c() {
         return this.i;
      }
   }
}
