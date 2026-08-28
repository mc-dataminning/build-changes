import com.google.common.collect.Lists;
import com.google.common.util.concurrent.RateLimiter;
import com.mojang.authlib.yggdrasil.ProfileResult;
import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;

public class fll extends hrc {
   static final alr b = alr.b("icon/info");
   static final alr c = alr.b("icon/new_realm");
   static final alr C = alr.b("realm_status/expired");
   static final alr D = alr.b("realm_status/expires_soon");
   static final alr E = alr.b("realm_status/open");
   static final alr F = alr.b("realm_status/closed");
   private static final alr G = alr.b("icon/invite");
   private static final alr H = alr.b("icon/news");
   public static final alr a = alr.b("hud/heart/hardcore_full");
   static final Logger I = LogUtils.getLogger();
   private static final alr J = alr.b("textures/gui/title/realms.png");
   private static final alr K = alr.b("textures/gui/realms/no_realms.png");
   private static final xg L = xg.c("menu.online");
   private static final xg M = xg.c("mco.selectServer.loading");
   static final xg N = xg.c("mco.selectServer.uninitialized");
   static final xg O = xg.c("mco.selectServer.expiredList");
   private static final xg P = xg.c("mco.selectServer.expiredRenew");
   static final xg Q = xg.c("mco.selectServer.expiredTrial");
   private static final xg R = xg.c("mco.selectServer.play");
   private static final xg S = xg.c("mco.selectServer.leave");
   private static final xg T = xg.c("mco.selectServer.configure");
   static final xg U = xg.c("mco.selectServer.expired");
   static final xg V = xg.c("mco.selectServer.expires.soon");
   static final xg W = xg.c("mco.selectServer.expires.day");
   static final xg X = xg.c("mco.selectServer.open");
   static final xg Y = xg.c("mco.selectServer.closed");
   static final xg Z = xg.a("gui.narrate.button", N);
   private static final xg aa = xg.c("mco.selectServer.noRealms");
   private static final xg ab = xg.c("mco.invites.nopending");
   private static final xg ac = xg.c("mco.invites.pending");
   private static final xg ad = xg.c("mco.compatibility.incompatible.popup.title");
   private static final xg ae = xg.c("mco.compatibility.incompatible.releaseType.popup.message");
   private static final int af = 100;
   private static final int ag = 3;
   private static final int ah = 4;
   private static final int ai = 308;
   private static final int aj = 128;
   private static final int ak = 34;
   private static final int al = 128;
   private static final int am = 64;
   private static final int an = 5;
   private static final int ao = 44;
   private static final int ap = 11;
   private static final int aq = 40;
   private static final int ar = 20;
   private static final int as = 216;
   private static final int at = 36;
   private static final boolean au = !ac.b().g();
   private static boolean av = au;
   private final CompletableFuture<flk.a> aw = flk.a();
   @Nullable
   private foy.c ax;
   private final Set<UUID> ay = new HashSet<>();
   private static boolean az;
   private final RateLimiter aA;
   private final fzq aB;
   private fty aC;
   private fty aD;
   private fty aE;
   private fty aF;
   private fty aG;
   fll.j aH;
   fnr aI;
   List<fmr> aJ = List.of();
   fmu aK = new fmu();
   private volatile boolean aL;
   @Nullable
   private volatile String aM;
   long aN;
   final List<fmq> aO = new ArrayList<>();
   private fty aP;
   private fll.g aQ;
   private fll.g aR;
   private fll.f aS;
   @Nullable
   private fxm aT;

   public fll(fzq $$0) {
      super(L);
      this.aB = $$0;
      this.aA = RateLimiter.create(0.016666668F);
   }

   @Override
   public void aT_() {
      this.aI = new fnr(this.m);
      this.aH = new fll.j();
      xg $$0 = xg.c("mco.invites.title");
      this.aQ = new fll.g($$0, G, $$1x -> this.m.a(new fok(this, $$0)));
      xg $$1 = xg.c("mco.news");
      this.aR = new fll.g($$1, H, $$0x -> {
         String $$1x = this.aM;
         if ($$1x != null) {
            fyn.a(this, $$1x);
            if (this.aR.a() != 0) {
               fpe.a $$2 = fpe.b();
               $$2.b = false;
               fpe.b($$2);
               this.aR.a(0);
            }
         }
      });
      this.aR.a(fvj.a($$1));
      this.aC = fty.a(R, $$0x -> a(this.O(), this)).a(100).a();
      this.aF = fty.a(T, $$0x -> this.f(this.O())).a(100).a();
      this.aE = fty.a(P, $$0x -> this.e(this.O())).a(100).a();
      this.aG = fty.a(S, $$0x -> this.g(this.O())).a(100).a();
      this.aP = fty.a(xg.c("mco.selectServer.purchase"), $$0x -> this.P()).b(100, 20).a();
      this.aD = fty.a(xf.k, $$0x -> this.aQ_()).a(100).a();
      if (flq.a == flq.b.b) {
         this.c(fuf.a(xg.b("Snapshot"), xg.b("Release")).a(5, 5, 100, 20, xg.b("Realm"), ($$0x, $$1x) -> {
            av = $$1x;
            this.aJ = List.of();
            this.I();
         }));
      }

      this.a(fll.f.a);
      this.H();
      this.aw.thenAcceptAsync($$0x -> {
         fzq $$1x = $$0x.a(this.aB);
         if ($$1x == null) {
            this.ax = this.a(this.m.bb());
         } else {
            this.m.a($$1x);
         }
      }, this.r);
   }

   public static boolean b() {
      return au && av;
   }

   @Override
   protected void c() {
      if (this.aT != null) {
         this.aH.a(this.n, this.aT);
         this.aT.a();
      }
   }

   @Override
   public void aQ_() {
      this.m.a(this.aB);
   }

   private void E() {
      if (this.aI.a() && this.aJ.isEmpty() && this.aO.isEmpty()) {
         this.a(fll.f.b);
      } else {
         this.a(fll.f.c);
      }
   }

   private void a(fll.f $$0) {
      if (this.aS != $$0) {
         if (this.aT != null) {
            this.aT.a($$1 -> this.e($$1));
         }

         this.aT = this.b($$0);
         this.aS = $$0;
         this.aT.a($$1 -> {
            ftw var10000 = this.c($$1);
         });
         this.c();
      }
   }

   private fxm b(fll.f $$0) {
      fxm $$1 = new fxm(this);
      $$1.b(44);
      $$1.a(this.F());
      fxn $$2 = this.c($$0);
      $$2.a();
      $$1.a($$2.y() + 22);
      $$1.b($$2);
      switch ($$0) {
         case a:
            $$1.c(new fun(this.p, M));
            break;
         case b:
            $$1.c(this.G());
            break;
         case c:
            $$1.c(this.aH);
      }

      return $$1;
   }

   private fxn F() {
      int $$0 = 90;
      fxq $$1 = fxq.e().a(4);
      $$1.c().e();
      $$1.a(this.aQ);
      $$1.a(this.aR);
      fxq $$2 = fxq.e();
      $$2.c().e();
      $$2.a(fxr.a(90));
      $$2.a(ful.a(128, 34, J, 128, 64), fxp::b);
      $$2.a(new fxk(90, 44)).a($$1, fxp::c);
      return $$2;
   }

   private fxn c(fll.f $$0) {
      fxl $$1 = new fxl().c(4);
      fxl.b $$2 = $$1.d(3);
      if ($$0 == fll.f.c) {
         $$2.a(this.aC);
         $$2.a(this.aF);
         $$2.a(this.aE);
         $$2.a(this.aG);
      }

      $$2.a(this.aP);
      $$2.a(this.aD);
      return $$1;
   }

   private fxq G() {
      fxq $$0 = fxq.d().a(8);
      $$0.c().b();
      $$0.a(ful.a(130, 64, K, 130, 64));
      fuj $$1 = new fuj(308, aa, this.p, false, 4);
      $$0.a($$1);
      return $$0;
   }

   void H() {
      fmr $$0 = this.O();
      this.aP.j = this.aS != fll.f.a;
      this.aC.j = $$0 != null && this.a($$0);
      this.aE.j = $$0 != null && this.b($$0);
      this.aG.j = $$0 != null && this.d($$0);
      this.aF.j = $$0 != null && this.c($$0);
   }

   boolean a(fmr $$0) {
      boolean $$1 = !$$0.j && $$0.e == fmr.c.b;
      return $$1 && ($$0.d() || $$0.e() || i($$0));
   }

   private boolean b(fmr $$0) {
      return $$0.j && i($$0);
   }

   private boolean c(fmr $$0) {
      return i($$0) && $$0.e != fmr.c.c;
   }

   private boolean d(fmr $$0) {
      return !i($$0);
   }

   @Override
   public void e() {
      super.e();
      if (this.ax != null) {
         this.ax.b();
      }
   }

   public static void f() {
      fqq.Q().bb().d.a();
   }

   public static void g() {
      fqq.Q().bb().c.a();
   }

   private void I() {
      for (foy.e<?> $$0 : this.m.bb().a()) {
         $$0.a();
      }
   }

   private foy.c a(fnp $$0) {
      foy.c $$1 = $$0.a.a();
      $$1.a($$0.c, $$0x -> {
         this.aI.a($$0x.a());
         this.aJ = $$0x.b();
         this.L();
         boolean $$1x = false;

         for (fmr $$2 : this.aI) {
            if (this.j($$2)) {
               $$1x = true;
            }
         }

         if (!az && $$1x) {
            az = true;
            this.M();
         }
      });
      a(flq::e, $$0x -> {
         this.aO.clear();
         this.aO.addAll($$0x);

         for (fmq $$1x : $$0x) {
            if ($$1x instanceof fmq.a $$2) {
               fva $$3 = $$2.a(this, this::a);
               if ($$3 != null) {
                  this.m.a($$3);
                  this.a(List.of($$1x));
                  break;
               }
            }
         }

         if (!this.aO.isEmpty() && this.aS != fll.f.a) {
            this.L();
         }
      });
      $$1.a($$0.d, $$0x -> {
         this.aQ.a($$0x);
         this.aQ.a($$0x == 0 ? fvj.a(ab) : fvj.a(ac));
         if ($$0x > 0 && this.aA.tryAcquire(1)) {
            this.m.aY().c(xg.a("mco.configure.world.invite.narration", $$0x));
         }
      });
      $$1.a($$0.e, $$0x -> this.aL = $$0x);
      $$1.a($$0.g, $$0x -> this.aK = $$0x);
      $$1.a($$0.f, $$1x -> {
         $$0.h.a($$1x);
         this.aM = $$0.h.b();
         this.aR.a($$0.h.a() ? Integer.MAX_VALUE : 0);
      });
      return $$1;
   }

   void a(Collection<fmq> $$0) {
      List<UUID> $$1 = new ArrayList<>($$0.size());

      for (fmq $$2 : $$0) {
         if (!$$2.a() && !this.ay.contains($$2.c())) {
            $$1.add($$2.c());
         }
      }

      if (!$$1.isEmpty()) {
         a($$1x -> {
            $$1x.a($$1);
            return null;
         }, $$1x -> this.ay.addAll($$1));
      }
   }

   private static <T> void a(fll.k<T> $$0, Consumer<T> $$1) {
      fqq $$2 = fqq.Q();
      CompletableFuture.<T>supplyAsync(() -> {
         try {
            return $$0.request(flq.a($$2));
         } catch (fnm var3) {
            throw new RuntimeException(var3);
         }
      }).thenAcceptAsync($$1, $$2).exceptionally($$0x -> {
         I.error("Failed to execute call to Realms Service", $$0x);
         return null;
      });
   }

   private void L() {
      this.aH.a(this, this.O());
      this.E();
      this.H();
   }

   private void M() {
      new Thread(() -> {
         List<fna> $$0 = flp.a();
         flq $$1 = flq.a();
         fmm $$2 = new fmm();
         $$2.a = $$0;
         $$2.b = this.N();

         try {
            $$1.a($$2);
         } catch (Throwable var5) {
            I.warn("Could not send ping result to Realms: ", var5);
         }
      }).start();
   }

   private List<Long> N() {
      List<Long> $$0 = Lists.newArrayList();

      for (fmr $$1 : this.aI) {
         if (this.j($$1)) {
            $$0.add($$1.a);
         }
      }

      return $$0;
   }

   private void e(@Nullable fmr $$0) {
      if ($$0 != null) {
         String $$1 = ayt.a($$0.b, this.m.X().b(), $$0.k);
         this.m.p.a($$1);
         ag.n().a($$1);
      }
   }

   private void f(@Nullable fmr $$0) {
      if ($$0 != null && this.m.b($$0.g)) {
         this.m.a(new foa(this, $$0.a));
      }
   }

   private void g(@Nullable fmr $$0) {
      if ($$0 != null && !this.m.b($$0.g)) {
         xg $$1 = xg.c("mco.configure.world.leave.question.line1");
         this.m.a(fom.a(this, $$1, $$1x -> this.h($$0)));
      }
   }

   @Nullable
   private fmr O() {
      return this.aH.p() instanceof fll.l $$0 ? $$0.c() : null;
   }

   private void h(final fmr $$0) {
      (new Thread("Realms-leave-server") {
         @Override
         public void run() {
            try {
               flq $$0 = flq.a();
               $$0.d($$0.a);
               fll.this.m.execute(fll::g);
            } catch (fnm var2) {
               fll.I.error("Couldn't configure world", var2);
               fll.this.m.execute(() -> fll.this.m.a(new foe(var2, fll.this)));
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
         this.aO.removeIf($$1x -> $$1x.b() && $$0.equals($$1x.c()));
         this.L();
      });
   }

   public void h() {
      this.aH.a(null);
      g();
   }

   @Override
   public xg i() {
      return (xg)(switch (this.aS) {
         case a -> xf.a(super.i(), M);
         case b -> xf.a(super.i(), aa);
         case c -> super.i();
      });
   }

   @Override
   public void a(ftk $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (b()) {
         $$0.b(this.p, "Minecraft " + ac.b().c(), 2, this.o - 10, -1);
      }

      if (this.aL && this.aP.j) {
         fnv.a($$0, this.aP);
      }

      switch (flq.a) {
         case b:
            this.a($$0, "STAGE!", -256);
            break;
         case c:
            this.a($$0, "LOCAL!", 8388479);
      }
   }

   private void P() {
      this.m.a(new fnv(this, this.aL));
   }

   public static void a(@Nullable fmr $$0, fzq $$1) {
      a($$0, $$1, false);
   }

   public static void a(@Nullable fmr $$0, fzq $$1, boolean $$2) {
      if ($$0 != null) {
         if (!b() || $$2 || $$0.i()) {
            fqq.Q().a(new fog($$1, new fpn($$1, $$0)));
            return;
         }

         switch ($$0.w) {
            case f:
               fqq.Q().a(new fog($$1, new fpn($$1, $$0)));
               break;
            case a:
               a($$0, $$1, xg.c("mco.compatibility.unverifiable.title").b(-171), xg.c("mco.compatibility.unverifiable.message"), xf.j);
               break;
            case d:
               a(
                  $$0,
                  $$1,
                  xg.c("selectWorld.backupQuestion.downgrade").b(-2142128),
                  xg.a("mco.compatibility.downgrade.description", xg.b($$0.v).b(-171), xg.b(ac.b().c()).b(-171)),
                  xg.c("mco.compatibility.downgrade")
               );
               break;
            case e:
               b($$0, $$1);
               break;
            case b:
               fqq.Q()
                  .a(
                     new fva.a($$1, ad)
                        .a(xg.a("mco.compatibility.incompatible.series.popup.message", xg.b($$0.v).b(-171), xg.b(ac.b().c()).b(-171)))
                        .a(xf.k, fva::aQ_)
                        .a()
                  );
               break;
            case c:
               fqq.Q().a(new fva.a($$1, ad).a(ae).a(xf.k, fva::aQ_).a());
         }
      }
   }

   private static void a(fmr $$0, fzq $$1, xg $$2, xg $$3, xg $$4) {
      fqq.Q().a(new fva.a($$1, $$2).a($$3).a($$4, $$2x -> {
         fqq.Q().a(new fog($$1, new fpn($$1, $$0)));
         g();
      }).a(xf.e, fva::aQ_).a());
   }

   private static void b(fmr $$0, fzq $$1) {
      xg $$2 = xg.c("mco.compatibility.upgrade.title").b(-171);
      xg $$3 = xg.c("mco.compatibility.upgrade");
      xg $$4 = xg.b($$0.v).b(-171);
      xg $$5 = xg.b(ac.b().c()).b(-171);
      xg $$6 = i($$0) ? xg.a("mco.compatibility.upgrade.description", $$4, $$5) : xg.a("mco.compatibility.upgrade.friend.description", $$4, $$5);
      a($$0, $$1, $$2, $$6, $$3);
   }

   public static xg a(String $$0, boolean $$1) {
      return a($$0, $$1 ? -8355712 : -2142128);
   }

   public static xg a(String $$0, int $$1) {
      return (xg)(StringUtils.isBlank($$0) ? xf.a : xg.b($$0).b($$1));
   }

   public static xg a(int $$0, boolean $$1) {
      return (xg)($$1 ? xg.c("gameMode.hardcore").b(-65536) : dkg.a($$0).d());
   }

   static boolean i(fmr $$0) {
      return fqq.Q().b($$0.g);
   }

   private boolean j(fmr $$0) {
      return i($$0) && !$$0.j;
   }

   private void a(ftk $$0, String $$1, int $$2) {
      $$0.c().a();
      $$0.c().a((float)(this.n / 2 - 25), 20.0F, 0.0F);
      $$0.c().a(a.f.rotationDegrees(-20.0F));
      $$0.c().b(1.5F, 1.5F, 1.5F);
      $$0.b(this.p, $$1, 0, 0, $$2);
      $$0.c().b();
   }

   class a extends fll.e {
      private static final xg f = xg.c("mco.snapshot.start");
      private static final int g = 5;
      private final fvm h = new fvm();
      private final fmr i;

      public a(final fmr $$0) {
         this.i = $$0;
         this.h.a(fvj.a(xg.c("mco.snapshot.tooltip")));
      }

      @Override
      public void a(ftk $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(gry::H, fll.c, $$3 - 5, $$2 + $$5 / 2 - 10, 40, 20);
         int $$10 = $$2 + $$5 / 2 - 9 / 2;
         $$0.b(fll.this.p, f, $$3 + 40 - 2, $$10 - 5, 8388479);
         $$0.b(fll.this.p, xg.a("mco.snapshot.description", Objects.requireNonNullElse(this.i.c, "unknown server")), $$3 + 40 - 2, $$10 + 5, -8355712);
         this.h.a($$8, this.aO_(), new fyf($$3, $$2, $$4, $$5));
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         this.c();
         return true;
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         if (fya.a($$0)) {
            this.c();
            return false;
         } else {
            return super.a($$0, $$1, $$2);
         }
      }

      private void c() {
         fll.this.m.ak().a(hoi.a(awy.Bv, 1.0F));
         fll.this.m
            .a(
               new fva.a(fll.this, xg.c("mco.snapshot.createSnapshotPopup.title"))
                  .a(xg.c("mco.snapshot.createSnapshotPopup.text"))
                  .a(xg.c("mco.selectServer.create"), $$0 -> fll.this.m.a(new foc(fll.this, this.i, true)))
                  .a(xf.e, fva::aQ_)
                  .a()
            );
      }

      @Override
      public xg a() {
         return xg.a("gui.narrate.button", xf.a(f, xg.a("mco.snapshot.description", Objects.requireNonNullElse(this.i.c, "unknown server"))));
      }
   }

   class b extends fll.e {
      private final fty f;

      public b(final fty $$0) {
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
      public void a(ftk $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.f.c(fll.this.n / 2 - 75, $$2 + 4);
         this.f.a($$0, $$6, $$7, $$9);
      }

      @Override
      public void a(boolean $$0) {
         super.a($$0);
         this.f.a($$0);
      }

      @Override
      public xg a() {
         return this.f.B();
      }
   }

   static class c extends fuk {
      private static final fvl b = new fvl(alr.b("widget/cross_button"), alr.b("widget/cross_button_highlighted"));

      protected c(fty.c $$0, xg $$1) {
         super(0, 0, 14, 14, b, $$0);
         this.a(fvj.a($$1));
      }
   }

   class d extends fll.e {
      @Override
      public void a(ftk $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
      }

      @Override
      public xg a() {
         return xg.i();
      }
   }

   abstract class e extends fuu.a<fll.e> {
      protected static final int b = 10;
      private static final int a = 28;
      protected static final int c = 7;
      protected static final int d = 2;

      protected void a(fmr $$0, ftk $$1, int $$2, int $$3, int $$4, int $$5) {
         int $$6 = $$2 - 10 - 7;
         int $$7 = $$3 + 2;
         if ($$0.j) {
            this.a($$1, $$6, $$7, $$4, $$5, fll.C, () -> fll.U);
         } else if ($$0.e == fmr.c.a) {
            this.a($$1, $$6, $$7, $$4, $$5, fll.F, () -> fll.Y);
         } else if (fll.i($$0) && $$0.l < 7) {
            this.a($$1, $$6, $$7, $$4, $$5, fll.D, () -> {
               if ($$0.l <= 0) {
                  return fll.V;
               } else {
                  return (xg)($$0.l == 1 ? fll.W : xg.a("mco.selectServer.expires.days", $$0.l));
               }
            });
         } else if ($$0.e == fmr.c.b) {
            this.a($$1, $$6, $$7, $$4, $$5, fll.E, () -> fll.X);
         }
      }

      private void a(ftk $$0, int $$1, int $$2, int $$3, int $$4, alr $$5, Supplier<xg> $$6) {
         $$0.a(gry::H, $$5, $$1, $$2, 10, 28);
         if (fll.this.aH.a_((double)$$3, (double)$$4) && $$3 >= $$1 && $$3 <= $$1 + 10 && $$4 >= $$2 && $$4 <= $$2 + 28) {
            fll.this.d($$6.get());
         }
      }

      protected void a(ftk $$0, int $$1, int $$2, fmr $$3) {
         int $$4 = this.b($$2);
         int $$5 = this.a($$1);
         int $$6 = this.d($$5);
         if (!fll.i($$3)) {
            $$0.b(fll.this.p, $$3.f, $$4, this.d($$5), -8355712);
         } else if ($$3.j) {
            xg $$7 = $$3.k ? fll.Q : fll.O;
            $$0.b(fll.this.p, $$7, $$4, $$6, -2142128);
         }
      }

      protected void a(ftk $$0, @Nullable String $$1, int $$2, int $$3, int $$4, int $$5) {
         if ($$1 != null) {
            int $$6 = $$4 - $$2;
            if (fll.this.p.b($$1) > $$6) {
               String $$7 = fll.this.p.a($$1, $$6 - fll.this.p.b("... "));
               $$0.b(fll.this.p, $$7 + "...", $$2, $$3, $$5);
            } else {
               $$0.b(fll.this.p, $$1, $$2, $$3, $$5);
            }
         }
      }

      protected int a(int $$0, int $$1, xg $$2) {
         return $$0 + $$1 - fll.this.p.a($$2) - 20;
      }

      protected int b(int $$0, int $$1, xg $$2) {
         return $$0 + $$1 - fll.this.p.a($$2) - 20;
      }

      protected int a(fmr $$0, ftk $$1, int $$2, int $$3, int $$4) {
         boolean $$5 = $$0.n;
         int $$6 = $$0.o;
         int $$7 = $$2;
         if (dkg.c($$6)) {
            xg $$8 = fll.a($$6, $$5);
            $$7 = this.b($$2, $$3, $$8);
            $$1.b(fll.this.p, $$8, $$7, this.c($$4), -8355712);
         }

         if ($$5) {
            $$7 -= 10;
            $$1.a(gry::H, fll.a, $$7, this.c($$4), 8, 8);
         }

         return $$7;
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

   static class g extends fvd.b {
      private static final alr[] d = new alr[]{
         alr.b("notification/1"),
         alr.b("notification/2"),
         alr.b("notification/3"),
         alr.b("notification/4"),
         alr.b("notification/5"),
         alr.b("notification/more")
      };
      private static final int u = Integer.MAX_VALUE;
      private static final int v = 20;
      private static final int w = 14;
      private int x;

      public g(xg $$0, alr $$1, fty.c $$2) {
         super(20, 20, $$0, 14, 14, $$1, $$2, null);
      }

      int a() {
         return this.x;
      }

      public void a(int $$0) {
         this.x = $$0;
      }

      @Override
      public void b(ftk $$0, int $$1, int $$2, float $$3) {
         super.b($$0, $$1, $$2, $$3);
         if (this.j && this.x != 0) {
            this.a($$0);
         }
      }

      private void a(ftk $$0) {
         $$0.a(gry::H, d[Math.min(this.x, 6) - 1], this.F() + this.A() - 5, this.G() - 3, 8, 8);
      }
   }

   class h extends fll.e {
      private static final int f = 40;
      private static final int g = -12303292;
      private final xg h;
      private final int i;
      private final List<ftw> j = new ArrayList<>();
      @Nullable
      private final fll.c k;
      private final fus l;
      private final fxl m;
      private final fxk n;
      private int o = -1;

      public h(final xg $$0, final int $$1, final fmq $$2) {
         this.h = $$0;
         this.i = $$1;
         this.m = new fxl();
         int $$3 = 7;
         this.m.a(ful.a(20, 20, fll.b), 0, 0, this.m.b().a(7, 7, 0, 0));
         this.m.a(fxr.a(40), 0, 0);
         this.n = this.m.a(new fxk(0, 9 * 3 * ($$1 - 1)), 0, 1, this.m.b().c(7));
         this.l = this.n.a(new fus($$0, fll.this.p).b(true), this.n.b().b().d());
         this.m.a(fxr.a(40), 0, 2);
         if ($$2.b()) {
            this.k = this.m.a(new fll.c($$1x -> fll.this.a($$2.c()), xg.c("mco.notification.dismiss")), 0, 2, this.m.b().c().a(0, 7, 7, 0));
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
      public void b(ftk $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         super.b($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
         $$0.b($$3 - 2, $$2 - 2, $$4, 36 * this.i - 2, -12303292);
      }

      @Override
      public void a(ftk $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
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
      public xg a() {
         return this.h;
      }
   }

   class i extends fll.e {
      private final fmr f;
      private final fvm g = new fvm();

      public i(final fmr $$0) {
         this.f = $$0;
         if (!$$0.j) {
            this.g.a(fvj.a(xg.c("mco.snapshot.parent.tooltip")));
         }
      }

      @Override
      public void a(ftk $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = this.b($$3);
         int $$11 = this.a($$2);
         fpg.a($$0, $$3, $$2, 32, this.f.g);
         xg $$12 = fll.a(this.f.v, -8355712);
         int $$13 = this.a($$3, $$4, $$12);
         this.a($$0, this.f.b(), $$10, $$11, $$13, -8355712);
         if ($$12 != xf.a) {
            $$0.b(fll.this.p, $$12, $$13, $$11, -8355712);
         }

         int $$14 = $$3;
         if (!this.f.i()) {
            $$14 = this.a(this.f, $$0, $$3, $$4, $$11);
         }

         this.a($$0, this.f.a(), $$10, this.c($$11), $$14, -8355712);
         this.a($$0, $$2, $$3, this.f);
         this.a(this.f, $$0, $$3 + $$4, $$2, $$6, $$7);
         this.g.a($$8, this.aO_(), new fyf($$3, $$2, $$4, $$5));
      }

      @Override
      public xg a() {
         return xg.b(Objects.requireNonNullElse(this.f.c, "unknown server"));
      }
   }

   class j extends fuu<fll.e> {
      public j() {
         super(fqq.Q(), fll.this.n, fll.this.o, 0, 36);
      }

      public void a(@Nullable fll.e $$0) {
         super.a($$0);
         fll.this.H();
      }

      @Override
      public int a() {
         return 300;
      }

      void a(fll $$0, @Nullable fmr $$1) {
         this.s();

         for (fmq $$2 : fll.this.aO) {
            if ($$2 instanceof fmq.c $$3) {
               this.a($$3, $$0);
               fll.this.a(List.of($$2));
               break;
            }
         }

         this.a($$1);
      }

      private void a(@Nullable fmr $$0) {
         for (fmr $$1 : fll.this.aJ) {
            this.b(fll.this.new a($$1));
         }

         for (fmr $$2 : fll.this.aI) {
            fll.e $$3;
            if (fll.b() && !$$2.h()) {
               if ($$2.e == fmr.c.c) {
                  continue;
               }

               $$3 = fll.this.new i($$2);
            } else {
               $$3 = fll.this.new l($$2);
            }

            this.b($$3);
            if ($$0 != null && $$0.a == $$2.a) {
               this.a($$3);
            }
         }
      }

      private void a(fmq.c $$0, fll $$1) {
         xg $$2 = $$0.d();
         int $$3 = fll.this.p.b($$2, 216);
         int $$4 = azz.e($$3 + 7, 36) - 1;
         this.b(fll.this.new h($$2, $$4 + 2, $$0));

         for (int $$5 = 0; $$5 < $$4; $$5++) {
            this.b(fll.this.new d());
         }

         this.b(fll.this.new b($$0.a($$1)));
      }
   }

   interface k<T> {
      T request(flq var1) throws fnm;
   }

   class l extends fll.e {
      private static final xg f = xg.c("mco.onlinePlayers");
      private static final int g = 9;
      private static final int h = 36;
      private final fmr i;
      private final fvm j = new fvm();

      public l(final fmr $$0) {
         this.i = $$0;
         boolean $$1 = fll.i($$0);
         if (fll.b() && $$1 && $$0.h()) {
            this.j.a(fvj.a(xg.a("mco.snapshot.paired", $$0.u)));
         } else if (!$$1 && $$0.f()) {
            this.j.a(fvj.a(xg.a("mco.snapshot.friendsRealm.downgrade", $$0.v)));
         }
      }

      @Override
      public void a(ftk $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         if (this.i.e == fmr.c.c) {
            $$0.a(gry::H, fll.c, $$3 - 5, $$2 + $$5 / 2 - 10, 40, 20);
            int $$10 = $$2 + $$5 / 2 - 9 / 2;
            $$0.b(fll.this.p, fll.N, $$3 + 40 - 2, $$10, 8388479);
         } else {
            this.a(this.i, $$0, $$3 + 36, $$2, $$6, $$7);
            fpg.a($$0, $$3, $$2, 32, this.i.g);
            this.a($$0, $$2, $$3, $$4);
            this.b($$0, $$2, $$3, $$4);
            this.a($$0, $$2, $$3, this.i);
            boolean $$11 = this.a($$0, $$2, $$3, $$4, $$5, $$6, $$7);
            this.a(this.i, $$0, $$3 + $$4, $$2, $$6, $$7);
            if (!$$11) {
               this.j.a($$8, this.aO_(), new fyf($$3, $$2, $$4, $$5));
            }
         }
      }

      private void a(ftk $$0, int $$1, int $$2, int $$3) {
         int $$4 = this.b($$2);
         int $$5 = this.a($$1);
         xg $$6 = fll.a(this.i.v, this.i.d());
         int $$7 = this.a($$2, $$3, $$6);
         this.a($$0, this.i.b(), $$4, $$5, $$7, -1);
         if ($$6 != xf.a && !this.i.i()) {
            $$0.b(fll.this.p, $$6, $$7, $$5, -8355712);
         }
      }

      private void b(ftk $$0, int $$1, int $$2, int $$3) {
         int $$4 = this.b($$2);
         int $$5 = this.a($$1);
         int $$6 = this.c($$5);
         String $$7 = this.i.c();
         boolean $$8 = this.i.i();
         if ($$8 && $$7 != null) {
            xg $$9 = xg.b($$7).a(o.h);
            $$0.b(fll.this.p, xg.a("mco.selectServer.minigameName", $$9).b(-171), $$4, $$6, -1);
         } else {
            int $$10 = this.a(this.i, $$0, $$2, $$3, $$5);
            this.a($$0, this.i.a(), $$4, this.c($$5), $$10, -8355712);
         }
      }

      private boolean a(ftk $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6) {
         List<ProfileResult> $$7 = fll.this.aK.a(this.i.a);
         if (!$$7.isEmpty()) {
            int $$8 = $$2 + $$3 - 21;
            int $$9 = $$1 + $$4 - 9 - 2;
            int $$10 = $$8;

            for (int $$11 = 0; $$11 < $$7.size(); $$11++) {
               $$10 -= 9 + ($$11 == 0 ? 0 : 3);
               fux.a($$0, fqq.Q().an().b($$7.get($$11).profile()), $$10, $$9, 9);
            }

            if ($$5 >= $$10 && $$5 <= $$8 && $$6 >= $$9 && $$6 <= $$9 + 9) {
               $$0.a(fll.this.p, List.of(f), Optional.of(new gbz.a($$7)), $$5, $$6);
               return true;
            }
         }

         return false;
      }

      private void d() {
         fll.this.m.ak().a(hoi.a(awy.Bv, 1.0F));
         fll.a(this.i, fll.this);
      }

      private void e() {
         fll.this.m.ak().a(hoi.a(awy.Bv, 1.0F));
         foc $$0 = new foc(fll.this, this.i, this.i.h());
         fll.this.m.a($$0);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         if (this.i.e == fmr.c.c) {
            this.e();
         } else if (fll.this.a(this.i)) {
            if (ag.c() - fll.this.aN < 250L && this.aO_()) {
               this.d();
            }

            fll.this.aN = ag.c();
         }

         return true;
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         if (fya.a($$0)) {
            if (this.i.e == fmr.c.c) {
               this.e();
               return true;
            }

            if (fll.this.a(this.i)) {
               this.d();
               return true;
            }
         }

         return super.a($$0, $$1, $$2);
      }

      @Override
      public xg a() {
         return (xg)(this.i.e == fmr.c.c ? fll.Z : xg.a("narrator.select", Objects.requireNonNullElse(this.i.c, "unknown server")));
      }

      public fmr c() {
         return this.i;
      }
   }
}
