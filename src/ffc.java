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

public class ffc extends hfq {
   static final alj a = alj.b("icon/info");
   static final alj b = alj.b("icon/new_realm");
   static final alj c = alj.b("realm_status/expired");
   static final alj B = alj.b("realm_status/expires_soon");
   static final alj C = alj.b("realm_status/open");
   static final alj D = alj.b("realm_status/closed");
   private static final alj E = alj.b("icon/invite");
   private static final alj F = alj.b("icon/news");
   static final Logger G = LogUtils.getLogger();
   private static final alj H = alj.b("textures/gui/title/realms.png");
   private static final alj I = alj.b("textures/gui/realms/no_realms.png");
   private static final xj J = xj.c("menu.online");
   private static final xj K = xj.c("mco.selectServer.loading");
   static final xj L = xj.c("mco.selectServer.uninitialized");
   static final xj M = xj.c("mco.selectServer.expiredList");
   private static final xj N = xj.c("mco.selectServer.expiredRenew");
   static final xj O = xj.c("mco.selectServer.expiredTrial");
   private static final xj P = xj.c("mco.selectServer.play");
   private static final xj Q = xj.c("mco.selectServer.leave");
   private static final xj R = xj.c("mco.selectServer.configure");
   static final xj S = xj.c("mco.selectServer.expired");
   static final xj T = xj.c("mco.selectServer.expires.soon");
   static final xj U = xj.c("mco.selectServer.expires.day");
   static final xj V = xj.c("mco.selectServer.open");
   static final xj W = xj.c("mco.selectServer.closed");
   static final xj X = xj.a("gui.narrate.button", L);
   private static final xj Y = xj.c("mco.selectServer.noRealms");
   private static final xj Z = xj.c("mco.invites.nopending");
   private static final xj aa = xj.c("mco.invites.pending");
   private static final xj ab = xj.c("mco.compatibility.incompatible.popup.title");
   private static final xj ac = xj.c("mco.compatibility.incompatible.releaseType.popup.message");
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
   private final CompletableFuture<ffb.a> au = ffb.a();
   @Nullable
   private fin.c av;
   private final Set<UUID> aw = new HashSet<>();
   private static boolean ax;
   private final RateLimiter ay;
   private final frw az;
   private fmd aA;
   private fmd aB;
   private fmd aC;
   private fmd aD;
   private fmd aE;
   ffc.j aF;
   private fhh aG;
   private List<fgi> aH = List.of();
   fgl aI = new fgl();
   private volatile boolean aJ;
   @Nullable
   private volatile String aK;
   long aL;
   private final List<fgh> aM = new ArrayList<>();
   private fmd aN;
   private ffc.g aO;
   private ffc.g aP;
   private ffc.f aQ;
   @Nullable
   private fps aR;

   public ffc(frw $$0) {
      super(J);
      this.az = $$0;
      this.ay = RateLimiter.create(0.016666668F);
   }

   @Override
   public void aR_() {
      this.aG = new fhh(this.m);
      this.aF = new ffc.j();
      xj $$0 = xj.c("mco.invites.title");
      this.aO = new ffc.g($$0, E, $$1x -> this.m.a(new fia(this, $$0)));
      xj $$1 = xj.c("mco.news");
      this.aP = new ffc.g($$1, F, $$0x -> {
         String $$1x = this.aK;
         if ($$1x != null) {
            fqt.a(this, $$1x);
            if (this.aP.a() != 0) {
               fit.a $$2 = fit.b();
               $$2.b = false;
               fit.b($$2);
               this.aP.a(0);
            }
         }
      });
      this.aP.a(fno.a($$1));
      this.aA = fmd.a(P, $$0x -> a(this.P(), this)).a(100).a();
      this.aD = fmd.a(R, $$0x -> this.f(this.P())).a(100).a();
      this.aC = fmd.a(N, $$0x -> this.e(this.P())).a(100).a();
      this.aE = fmd.a(Q, $$0x -> this.g(this.P())).a(100).a();
      this.aN = fmd.a(xj.c("mco.selectServer.purchase"), $$0x -> this.Q()).b(100, 20).a();
      this.aB = fmd.a(xi.k, $$0x -> this.aO_()).a(100).a();
      if (ffh.a == ffh.b.b) {
         this.c(fmk.a(xj.b("Snapshot"), xj.b("Release")).a(5, 5, 100, 20, xj.b("Realm"), ($$0x, $$1x) -> {
            at = $$1x;
            this.aH = List.of();
            this.L();
         }));
      }

      this.a(ffc.f.a);
      this.K();
      this.au.thenAcceptAsync($$0x -> {
         frw $$1x = $$0x.a(this.az);
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
   public void aO_() {
      this.m.a(this.az);
   }

   private void F() {
      if (this.aG.a() && this.aH.isEmpty() && this.aM.isEmpty()) {
         this.a(ffc.f.b);
      } else {
         this.a(ffc.f.c);
      }
   }

   private void a(ffc.f $$0) {
      if (this.aQ != $$0) {
         if (this.aR != null) {
            this.aR.a($$1 -> this.e($$1));
         }

         this.aR = this.b($$0);
         this.aQ = $$0;
         this.aR.a($$1 -> {
            fmb var10000 = this.c($$1);
         });
         this.c();
      }
   }

   private fps b(ffc.f $$0) {
      fps $$1 = new fps(this);
      $$1.b(44);
      $$1.a(this.G());
      fpt $$2 = this.c($$0);
      $$2.a();
      $$1.a($$2.w() + 22);
      $$1.b($$2);
      switch ($$0) {
         case a:
            $$1.c(new fms(this.p, K));
            break;
         case b:
            $$1.c(this.J());
            break;
         case c:
            $$1.c(this.aF);
      }

      return $$1;
   }

   private fpt G() {
      int $$0 = 90;
      fpw $$1 = fpw.e().a(4);
      $$1.c().e();
      $$1.a(this.aO);
      $$1.a(this.aP);
      fpw $$2 = fpw.e();
      $$2.c().e();
      $$2.a(fpx.a(90));
      $$2.a(fmq.a(128, 34, H, 128, 64), fpv::b);
      $$2.a(new fpq(90, 44)).a($$1, fpv::c);
      return $$2;
   }

   private fpt c(ffc.f $$0) {
      fpr $$1 = new fpr().c(4);
      fpr.b $$2 = $$1.d(3);
      if ($$0 == ffc.f.c) {
         $$2.a(this.aA);
         $$2.a(this.aD);
         $$2.a(this.aC);
         $$2.a(this.aE);
      }

      $$2.a(this.aN);
      $$2.a(this.aB);
      return $$1;
   }

   private fpw J() {
      fpw $$0 = fpw.d().a(8);
      $$0.c().b();
      $$0.a(fmq.a(130, 64, I, 130, 64));
      fmo $$1 = new fmo(308, Y, this.p, false, 4);
      $$0.a($$1);
      return $$0;
   }

   void K() {
      fgi $$0 = this.P();
      this.aN.j = this.aQ != ffc.f.a;
      this.aA.j = $$0 != null && this.a($$0);
      this.aC.j = $$0 != null && this.b($$0);
      this.aE.j = $$0 != null && this.d($$0);
      this.aD.j = $$0 != null && this.c($$0);
   }

   boolean a(fgi $$0) {
      boolean $$1 = !$$0.j && $$0.e == fgi.c.b;
      return $$1 && ($$0.d() || $$0.e() || i($$0));
   }

   private boolean b(fgi $$0) {
      return $$0.j && i($$0);
   }

   private boolean c(fgi $$0) {
      return i($$0) && $$0.e != fgi.c.c;
   }

   private boolean d(fgi $$0) {
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
      fke.Q().bc().d.a();
   }

   public static void g() {
      fke.Q().bc().c.a();
   }

   private void L() {
      for (fin.e<?> $$0 : this.m.bc().a()) {
         $$0.a();
      }
   }

   private fin.c a(fhf $$0) {
      fin.c $$1 = $$0.a.a();
      $$1.a($$0.c, $$0x -> {
         this.aG.a($$0x.a());
         this.aH = $$0x.b();
         this.M();
         boolean $$1x = false;

         for (fgi $$2 : this.aG) {
            if (this.j($$2)) {
               $$1x = true;
            }
         }

         if (!ax && $$1x) {
            ax = true;
            this.N();
         }
      });
      a(ffh::d, $$0x -> {
         this.aM.clear();
         this.aM.addAll($$0x);

         for (fgh $$1x : $$0x) {
            if ($$1x instanceof fgh.a $$2) {
               fnf $$3 = $$2.a(this, this::a);
               if ($$3 != null) {
                  this.m.a($$3);
                  this.a(List.of($$1x));
                  break;
               }
            }
         }

         if (!this.aM.isEmpty() && this.aQ != ffc.f.a) {
            this.M();
         }
      });
      $$1.a($$0.d, $$0x -> {
         this.aO.a($$0x);
         this.aO.a($$0x == 0 ? fno.a(Z) : fno.a(aa));
         if ($$0x > 0 && this.ay.tryAcquire(1)) {
            this.m.aZ().c(xj.a("mco.configure.world.invite.narration", $$0x));
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

   private void a(Collection<fgh> $$0) {
      List<UUID> $$1 = new ArrayList<>($$0.size());

      for (fgh $$2 : $$0) {
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

   private static <T> void a(ffc.k<T> $$0, Consumer<T> $$1) {
      fke $$2 = fke.Q();
      CompletableFuture.<T>supplyAsync(() -> {
         try {
            return $$0.request(ffh.a($$2));
         } catch (fhc var3) {
            throw new RuntimeException(var3);
         }
      }).thenAcceptAsync($$1, $$2).exceptionally($$0x -> {
         G.error("Failed to execute call to Realms Service", $$0x);
         return null;
      });
   }

   private void M() {
      fgi $$0 = this.P();
      this.aF.J();

      for (fgh $$1 : this.aM) {
         if (this.a($$1)) {
            this.a(List.of($$1));
            break;
         }
      }

      for (fgi $$2 : this.aH) {
         this.aF.a(new ffc.a($$2));
      }

      for (fgi $$3 : this.aG) {
         ffc.e $$4;
         if (b() && !$$3.h()) {
            if ($$3.e == fgi.c.c) {
               continue;
            }

            $$4 = new ffc.i($$3);
         } else {
            $$4 = new ffc.l($$3);
         }

         this.aF.a((ffc.e)$$4);
         if ($$0 != null && $$0.a == $$3.a) {
            this.aF.a($$4);
         }
      }

      this.F();
      this.K();
   }

   private boolean a(fgh $$0) {
      if (!($$0 instanceof fgh.c $$1)) {
         return false;
      } else {
         xj $$2 = $$1.d();
         int $$3 = this.p.b($$2, 216);
         int $$4 = azm.e($$3 + 7, 36) - 1;
         this.aF.a(new ffc.h($$2, $$4 + 2, $$1));

         for (int $$5 = 0; $$5 < $$4; $$5++) {
            this.aF.a(new ffc.d());
         }

         this.aF.a(new ffc.b($$1.a(this)));
         return true;
      }
   }

   private void N() {
      new Thread(() -> {
         List<fgq> $$0 = ffg.a();
         ffh $$1 = ffh.a();
         fgd $$2 = new fgd();
         $$2.a = $$0;
         $$2.b = this.O();

         try {
            $$1.a($$2);
         } catch (Throwable var5) {
            G.warn("Could not send ping result to Realms: ", var5);
         }
      }).start();
   }

   private List<Long> O() {
      List<Long> $$0 = Lists.newArrayList();

      for (fgi $$1 : this.aG) {
         if (this.j($$1)) {
            $$0.add($$1.a);
         }
      }

      return $$0;
   }

   private void e(@Nullable fgi $$0) {
      if ($$0 != null) {
         String $$1 = ayi.a($$0.b, this.m.X().b(), $$0.k);
         this.m.p.a($$1);
         ae.m().a($$1);
      }
   }

   private void f(@Nullable fgi $$0) {
      if ($$0 != null && this.m.b($$0.g)) {
         this.m.a(new fhq(this, $$0.a));
      }
   }

   private void g(@Nullable fgi $$0) {
      if ($$0 != null && !this.m.b($$0.g)) {
         xj $$1 = xj.c("mco.configure.world.leave.question.line1");
         this.m.a(fic.a(this, $$1, $$1x -> this.h($$0)));
      }
   }

   @Nullable
   private fgi P() {
      return this.aF.h() instanceof ffc.l $$0 ? $$0.c() : null;
   }

   private void h(final fgi $$0) {
      (new Thread("Realms-leave-server") {
         @Override
         public void run() {
            try {
               ffh $$0 = ffh.a();
               $$0.d($$0.a);
               ffc.this.m.execute(ffc::g);
            } catch (fhc var2) {
               ffc.G.error("Couldn't configure world", var2);
               ffc.this.m.execute(() -> ffc.this.m.a(new fhu(var2, ffc.this)));
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
         this.M();
      });
   }

   public void h() {
      this.aF.a(null);
      g();
   }

   @Override
   public xj i() {
      return (xj)(switch (this.aQ) {
         case a -> xi.a(super.i(), K);
         case b -> xi.a(super.i(), Y);
         case c -> super.i();
      });
   }

   @Override
   public void a(flq $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (b()) {
         $$0.b(this.p, "Minecraft " + ab.b().c(), 2, this.o - 10, -1);
      }

      if (this.aJ && this.aN.j) {
         fhl.a($$0, this.aN);
      }

      switch (ffh.a) {
         case b:
            this.a($$0, "STAGE!", -256);
            break;
         case c:
            this.a($$0, "LOCAL!", 8388479);
      }
   }

   private void Q() {
      this.m.a(new fhl(this, this.aJ));
   }

   public static void a(@Nullable fgi $$0, frw $$1) {
      a($$0, $$1, false);
   }

   public static void a(@Nullable fgi $$0, frw $$1, boolean $$2) {
      if ($$0 != null) {
         if (!b() || $$2 || $$0.i()) {
            fke.Q().a(new fhw($$1, new fjc($$1, $$0)));
            return;
         }

         switch ($$0.u) {
            case f:
               fke.Q().a(new fhw($$1, new fjc($$1, $$0)));
               break;
            case a:
               a($$0, $$1, xj.c("mco.compatibility.unverifiable.title").b(-171), xj.c("mco.compatibility.unverifiable.message"), xi.j);
               break;
            case d:
               a(
                  $$0,
                  $$1,
                  xj.c("selectWorld.backupQuestion.downgrade").b(-2142128),
                  xj.a("mco.compatibility.downgrade.description", xj.b($$0.t).b(-171), xj.b(ab.b().c()).b(-171)),
                  xj.c("mco.compatibility.downgrade")
               );
               break;
            case e:
               b($$0, $$1);
               break;
            case b:
               fke.Q()
                  .a(
                     new fnf.a($$1, ab)
                        .a(xj.a("mco.compatibility.incompatible.series.popup.message", xj.b($$0.t).b(-171), xj.b(ab.b().c()).b(-171)))
                        .a(xi.k, fnf::aO_)
                        .a()
                  );
               break;
            case c:
               fke.Q().a(new fnf.a($$1, ab).a(ac).a(xi.k, fnf::aO_).a());
         }
      }
   }

   private static void a(fgi $$0, frw $$1, xj $$2, xj $$3, xj $$4) {
      fke.Q().a(new fnf.a($$1, $$2).a($$3).a($$4, $$2x -> {
         fke.Q().a(new fhw($$1, new fjc($$1, $$0)));
         g();
      }).a(xi.e, fnf::aO_).a());
   }

   private static void b(fgi $$0, frw $$1) {
      xj $$2 = xj.c("mco.compatibility.upgrade.title").b(-171);
      xj $$3 = xj.c("mco.compatibility.upgrade");
      xj $$4 = xj.b($$0.t).b(-171);
      xj $$5 = xj.b(ab.b().c()).b(-171);
      xj $$6 = i($$0) ? xj.a("mco.compatibility.upgrade.description", $$4, $$5) : xj.a("mco.compatibility.upgrade.friend.description", $$4, $$5);
      a($$0, $$1, $$2, $$6, $$3);
   }

   public static xj a(String $$0, boolean $$1) {
      return a($$0, $$1 ? -8355712 : -2142128);
   }

   public static xj a(String $$0, int $$1) {
      return (xj)(StringUtils.isBlank($$0) ? xi.a : xj.b($$0).b($$1));
   }

   static boolean i(fgi $$0) {
      return fke.Q().b($$0.g);
   }

   private boolean j(fgi $$0) {
      return i($$0) && !$$0.j;
   }

   private void a(flq $$0, String $$1, int $$2) {
      $$0.c().a();
      $$0.c().a((float)(this.n / 2 - 25), 20.0F, 0.0F);
      $$0.c().a(a.f.rotationDegrees(-20.0F));
      $$0.c().b(1.5F, 1.5F, 1.5F);
      $$0.a(this.p, $$1, 0, 0, $$2, false);
      $$0.c().b();
   }

   class a extends ffc.e {
      private static final xj f = xj.c("mco.snapshot.start");
      private static final int g = 5;
      private final fnr h = new fnr();
      private final fgi i;

      public a(final fgi $$0) {
         this.i = $$0;
         this.h.a(fno.a(xj.c("mco.snapshot.tooltip")));
      }

      @Override
      public void a(flq $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(gjq::B, ffc.b, $$3 - 5, $$2 + $$5 / 2 - 10, 40, 20);
         int $$10 = $$2 + $$5 / 2 - 9 / 2;
         $$0.b(ffc.this.p, f, $$3 + 40 - 2, $$10 - 5, 8388479);
         $$0.b(ffc.this.p, xj.a("mco.snapshot.description", this.i.c), $$3 + 40 - 2, $$10 + 5, -8355712);
         this.h.a($$8, this.aL_(), new fql($$3, $$2, $$4, $$5));
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         this.c();
         return true;
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         if (fqg.a($$0)) {
            this.c();
            return true;
         } else {
            return super.a($$0, $$1, $$2);
         }
      }

      private void c() {
         ffc.this.m.ak().a(hcw.a(awn.Av, 1.0F));
         ffc.this.m
            .a(
               new fnf.a(ffc.this, xj.c("mco.snapshot.createSnapshotPopup.title"))
                  .a(xj.c("mco.snapshot.createSnapshotPopup.text"))
                  .a(xj.c("mco.selectServer.create"), $$0 -> ffc.this.m.a(new fhs(ffc.this, this.i, true)))
                  .a(xi.e, fnf::aO_)
                  .a()
            );
      }

      @Override
      public xj a() {
         return xj.a("gui.narrate.button", xi.a(f, xj.a("mco.snapshot.description", this.i.c)));
      }
   }

   class b extends ffc.e {
      private final fmd f;

      public b(final fmd $$0) {
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
      public void a(flq $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.f.c(ffc.this.n / 2 - 75, $$2 + 4);
         this.f.a($$0, $$6, $$7, $$9);
      }

      @Override
      public void a(boolean $$0) {
         super.a($$0);
         this.f.a($$0);
      }

      @Override
      public xj a() {
         return this.f.z();
      }
   }

   static class c extends fmp {
      private static final fnq b = new fnq(alj.b("widget/cross_button"), alj.b("widget/cross_button_highlighted"));

      protected c(fmd.c $$0, xj $$1) {
         super(0, 0, 14, 14, b, $$0);
         this.a(fno.a($$1));
      }
   }

   class d extends ffc.e {
      @Override
      public void a(flq $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
      }

      @Override
      public xj a() {
         return xj.i();
      }
   }

   abstract class e extends fmz.a<ffc.e> {
      protected static final int b = 10;
      private static final int a = 28;
      protected static final int c = 7;
      protected static final int d = 2;

      protected void a(fgi $$0, flq $$1, int $$2, int $$3, int $$4, int $$5) {
         int $$6 = $$2 - 10 - 7;
         int $$7 = $$3 + 2;
         if ($$0.j) {
            this.a($$1, $$6, $$7, $$4, $$5, ffc.c, () -> ffc.S);
         } else if ($$0.e == fgi.c.a) {
            this.a($$1, $$6, $$7, $$4, $$5, ffc.D, () -> ffc.W);
         } else if (ffc.i($$0) && $$0.l < 7) {
            this.a($$1, $$6, $$7, $$4, $$5, ffc.B, () -> {
               if ($$0.l <= 0) {
                  return ffc.T;
               } else {
                  return (xj)($$0.l == 1 ? ffc.U : xj.a("mco.selectServer.expires.days", $$0.l));
               }
            });
         } else if ($$0.e == fgi.c.b) {
            this.a($$1, $$6, $$7, $$4, $$5, ffc.C, () -> ffc.V);
         }
      }

      private void a(flq $$0, int $$1, int $$2, int $$3, int $$4, alj $$5, Supplier<xj> $$6) {
         $$0.a(gjq::B, $$5, $$1, $$2, 10, 28);
         if (ffc.this.aF.c((double)$$3, (double)$$4) && $$3 >= $$1 && $$3 <= $$1 + 10 && $$4 >= $$2 && $$4 <= $$2 + 28) {
            ffc.this.d($$6.get());
         }
      }

      protected void a(flq $$0, int $$1, int $$2, fgi $$3) {
         int $$4 = this.b($$2);
         int $$5 = this.a($$1);
         int $$6 = this.d($$5);
         if (!ffc.i($$3)) {
            $$0.a(ffc.this.p, $$3.f, $$4, this.d($$5), -8355712, false);
         } else if ($$3.j) {
            xj $$7 = $$3.k ? ffc.O : ffc.M;
            $$0.a(ffc.this.p, $$7, $$4, $$6, -2142128, false);
         }
      }

      protected void a(flq $$0, String $$1, int $$2, int $$3, int $$4, int $$5) {
         int $$6 = $$4 - $$2;
         if (ffc.this.p.b($$1) > $$6) {
            String $$7 = ffc.this.p.a($$1, $$6 - ffc.this.p.b("... "));
            $$0.a(ffc.this.p, $$7 + "...", $$2, $$3, $$5, false);
         } else {
            $$0.a(ffc.this.p, $$1, $$2, $$3, $$5, false);
         }
      }

      protected int a(int $$0, int $$1, xj $$2) {
         return $$0 + $$1 - ffc.this.p.a($$2) - 20;
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

   static class g extends fni.b {
      private static final alj[] d = new alj[]{
         alj.b("notification/1"),
         alj.b("notification/2"),
         alj.b("notification/3"),
         alj.b("notification/4"),
         alj.b("notification/5"),
         alj.b("notification/more")
      };
      private static final int u = Integer.MAX_VALUE;
      private static final int v = 20;
      private static final int w = 14;
      private int x;

      public g(xj $$0, alj $$1, fmd.c $$2) {
         super(20, 20, $$0, 14, 14, $$1, $$2, null);
      }

      int a() {
         return this.x;
      }

      public void a(int $$0) {
         this.x = $$0;
      }

      @Override
      public void b(flq $$0, int $$1, int $$2, float $$3) {
         super.b($$0, $$1, $$2, $$3);
         if (this.j && this.x != 0) {
            this.a($$0);
         }
      }

      private void a(flq $$0) {
         $$0.a(gjq::B, d[Math.min(this.x, 6) - 1], this.D() + this.y() - 5, this.E() - 3, 8, 8);
      }
   }

   class h extends ffc.e {
      private static final int f = 40;
      private static final int g = -12303292;
      private final xj h;
      private final int i;
      private final List<fmb> j = new ArrayList<>();
      @Nullable
      private final ffc.c k;
      private final fmx l;
      private final fpr m;
      private final fpq n;
      private int o = -1;

      public h(final xj $$0, final int $$1, final fgh $$2) {
         this.h = $$0;
         this.i = $$1;
         this.m = new fpr();
         int $$3 = 7;
         this.m.a(fmq.a(20, 20, ffc.a), 0, 0, this.m.b().a(7, 7, 0, 0));
         this.m.a(fpx.a(40), 0, 0);
         this.n = this.m.a(new fpq(0, 9 * 3 * ($$1 - 1)), 0, 1, this.m.b().c(7));
         this.l = this.n.a(new fmx($$0, ffc.this.p).b(true), this.n.b().b().d());
         this.m.a(fpx.a(40), 0, 2);
         if ($$2.b()) {
            this.k = this.m.a(new ffc.c($$1x -> ffc.this.a($$2.c()), xj.c("mco.notification.dismiss")), 0, 2, this.m.b().c().a(0, 7, 7, 0));
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
      public void b(flq $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         super.b($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
         $$0.b($$3 - 2, $$2 - 2, $$4, 36 * this.i - 2, -12303292);
      }

      @Override
      public void a(flq $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
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
      public xj a() {
         return this.h;
      }
   }

   class i extends ffc.e {
      private final fgi f;
      private final fnr g = new fnr();

      public i(final fgi $$0) {
         this.f = $$0;
         if (!$$0.j) {
            this.g.a(fno.a(xj.c("mco.snapshot.parent.tooltip")));
         }
      }

      @Override
      public void a(flq $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = this.b($$3);
         int $$11 = this.a($$2);
         fiv.a($$0, $$3, $$2, 32, this.f.g);
         xj $$12 = ffc.a(this.f.t, -8355712);
         int $$13 = this.a($$3, $$4, $$12);
         this.a($$0, this.f.b(), $$10, $$11, $$13, -8355712);
         if ($$12 != xi.a) {
            $$0.a(ffc.this.p, $$12, $$13, $$11, -8355712, false);
         }

         $$0.a(ffc.this.p, this.f.a(), $$10, this.c($$11), -8355712, false);
         this.a($$0, $$2, $$3, this.f);
         this.a(this.f, $$0, $$3 + $$4, $$2, $$6, $$7);
         this.g.a($$8, this.aL_(), new fql($$3, $$2, $$4, $$5));
      }

      @Override
      public xj a() {
         return xj.b(this.f.c);
      }
   }

   class j extends hfp<ffc.e> {
      public j() {
         super(ffc.this.n, ffc.this.o, 0, 36);
      }

      public void a(@Nullable ffc.e $$0) {
         super.a($$0);
         ffc.this.K();
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
      T request(ffh var1) throws fhc;
   }

   class l extends ffc.e {
      private static final xj f = xj.c("mco.onlinePlayers");
      private static final int g = 9;
      private static final int h = 36;
      private final fgi i;
      private final fnr j = new fnr();

      public l(final fgi $$0) {
         this.i = $$0;
         boolean $$1 = ffc.i($$0);
         if (ffc.b() && $$1 && $$0.h()) {
            this.j.a(fno.a(xj.a("mco.snapshot.paired", $$0.s)));
         } else if (!$$1 && $$0.f()) {
            this.j.a(fno.a(xj.a("mco.snapshot.friendsRealm.downgrade", $$0.t)));
         }
      }

      @Override
      public void a(flq $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         if (this.i.e == fgi.c.c) {
            $$0.a(gjq::B, ffc.b, $$3 - 5, $$2 + $$5 / 2 - 10, 40, 20);
            int $$10 = $$2 + $$5 / 2 - 9 / 2;
            $$0.b(ffc.this.p, ffc.L, $$3 + 40 - 2, $$10, 8388479);
         } else {
            this.a(this.i, $$0, $$3 + 36, $$2, $$6, $$7);
            fiv.a($$0, $$3, $$2, 32, this.i.g);
            this.a($$0, $$2, $$3, $$4);
            this.a($$0, $$2, $$3);
            this.a($$0, $$2, $$3, this.i);
            boolean $$11 = this.a($$0, $$2, $$3, $$4, $$5, $$6, $$7);
            this.a(this.i, $$0, $$3 + $$4, $$2, $$6, $$7);
            if (!$$11) {
               this.j.a($$8, this.aL_(), new fql($$3, $$2, $$4, $$5));
            }
         }
      }

      private void a(flq $$0, int $$1, int $$2, int $$3) {
         int $$4 = this.b($$2);
         int $$5 = this.a($$1);
         xj $$6 = ffc.a(this.i.t, this.i.d());
         int $$7 = this.a($$2, $$3, $$6);
         this.a($$0, this.i.b(), $$4, $$5, $$7, -1);
         if ($$6 != xi.a && !this.i.i()) {
            $$0.a(ffc.this.p, $$6, $$7, $$5, -8355712, false);
         }
      }

      private void a(flq $$0, int $$1, int $$2) {
         int $$3 = this.b($$2);
         int $$4 = this.a($$1);
         int $$5 = this.c($$4);
         String $$6 = this.i.c();
         if (this.i.i() && $$6 != null) {
            xj $$7 = xj.b($$6).a(n.h);
            $$0.a(ffc.this.p, xj.a("mco.selectServer.minigameName", $$7).b(-171), $$3, $$5, -1, false);
         } else {
            $$0.a(ffc.this.p, this.i.a(), $$3, this.c($$4), -8355712, false);
         }
      }

      private boolean a(flq $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6) {
         List<ProfileResult> $$7 = ffc.this.aI.a(this.i.a);
         if (!$$7.isEmpty()) {
            int $$8 = $$2 + $$3 - 21;
            int $$9 = $$1 + $$4 - 9 - 2;
            int $$10 = $$8;

            for (int $$11 = 0; $$11 < $$7.size(); $$11++) {
               $$10 -= 9 + ($$11 == 0 ? 0 : 3);
               fnc.a($$0, fke.Q().an().b($$7.get($$11).profile()), $$10, $$9, 9);
            }

            if ($$5 >= $$10 && $$5 <= $$8 && $$6 >= $$9 && $$6 <= $$9 + 9) {
               $$0.a(ffc.this.p, List.of(f), Optional.of(new fud.a($$7)), $$5, $$6);
               return true;
            }
         }

         return false;
      }

      private void d() {
         ffc.this.m.ak().a(hcw.a(awn.Av, 1.0F));
         ffc.a(this.i, ffc.this);
      }

      private void e() {
         ffc.this.m.ak().a(hcw.a(awn.Av, 1.0F));
         fhs $$0 = new fhs(ffc.this, this.i, this.i.h());
         ffc.this.m.a($$0);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         if (this.i.e == fgi.c.c) {
            this.e();
         } else if (ffc.this.a(this.i)) {
            if (ae.c() - ffc.this.aL < 250L && this.aL_()) {
               this.d();
            }

            ffc.this.aL = ae.c();
         }

         return true;
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         if (fqg.a($$0)) {
            if (this.i.e == fgi.c.c) {
               this.e();
               return true;
            }

            if (ffc.this.a(this.i)) {
               this.d();
               return true;
            }
         }

         return super.a($$0, $$1, $$2);
      }

      @Override
      public xj a() {
         return (xj)(this.i.e == fgi.c.c ? ffc.X : xj.a("narrator.select", this.i.c));
      }

      public fgi c() {
         return this.i;
      }
   }
}
