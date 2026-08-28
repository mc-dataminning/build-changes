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

public class fly extends hrm {
   static final ali b = ali.b("icon/info");
   static final ali c = ali.b("icon/new_realm");
   static final ali C = ali.b("realm_status/expired");
   static final ali D = ali.b("realm_status/expires_soon");
   static final ali E = ali.b("realm_status/open");
   static final ali F = ali.b("realm_status/closed");
   private static final ali G = ali.b("icon/invite");
   private static final ali H = ali.b("icon/news");
   public static final ali a = ali.b("hud/heart/hardcore_full");
   static final Logger I = LogUtils.getLogger();
   private static final ali J = ali.b("textures/gui/title/realms.png");
   private static final ali K = ali.b("textures/gui/realms/no_realms.png");
   private static final xa L = xa.c("menu.online");
   private static final xa M = xa.c("mco.selectServer.loading");
   static final xa N = xa.c("mco.selectServer.uninitialized");
   static final xa O = xa.c("mco.selectServer.expiredList");
   private static final xa P = xa.c("mco.selectServer.expiredRenew");
   static final xa Q = xa.c("mco.selectServer.expiredTrial");
   private static final xa R = xa.c("mco.selectServer.play");
   private static final xa S = xa.c("mco.selectServer.leave");
   private static final xa T = xa.c("mco.selectServer.configure");
   static final xa U = xa.c("mco.selectServer.expired");
   static final xa V = xa.c("mco.selectServer.expires.soon");
   static final xa W = xa.c("mco.selectServer.expires.day");
   static final xa X = xa.c("mco.selectServer.open");
   static final xa Y = xa.c("mco.selectServer.closed");
   static final xa Z = xa.a("gui.narrate.button", N);
   private static final xa aa = xa.c("mco.selectServer.noRealms");
   private static final xa ab = xa.c("mco.invites.nopending");
   private static final xa ac = xa.c("mco.invites.pending");
   private static final xa ad = xa.c("mco.compatibility.incompatible.popup.title");
   private static final xa ae = xa.c("mco.compatibility.incompatible.releaseType.popup.message");
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
   private final CompletableFuture<flx.a> aw = flx.a();
   @Nullable
   private fpl.c ax;
   private final Set<UUID> ay = new HashSet<>();
   private static boolean az;
   private final RateLimiter aA;
   private final gad aB;
   private ful aC;
   private ful aD;
   private ful aE;
   private ful aF;
   private ful aG;
   fly.j aH;
   foe aI;
   List<fne> aJ = List.of();
   fnh aK = new fnh();
   private volatile boolean aL;
   @Nullable
   private volatile String aM;
   long aN;
   final List<fnd> aO = new ArrayList<>();
   private ful aP;
   private fly.g aQ;
   private fly.g aR;
   private fly.f aS;
   @Nullable
   private fxz aT;

   public fly(gad $$0) {
      super(L);
      this.aB = $$0;
      this.aA = RateLimiter.create(0.016666668F);
   }

   @Override
   public void aS_() {
      this.aI = new foe(this.m);
      this.aH = new fly.j();
      xa $$0 = xa.c("mco.invites.title");
      this.aQ = new fly.g($$0, G, $$1x -> this.m.a(new foy(this, $$0)));
      xa $$1 = xa.c("mco.news");
      this.aR = new fly.g($$1, H, $$0x -> {
         String $$1x = this.aM;
         if ($$1x != null) {
            fza.a(this, $$1x);
            if (this.aR.a() != 0) {
               fpr.a $$2 = fpr.b();
               $$2.b = false;
               fpr.b($$2);
               this.aR.a(0);
            }
         }
      });
      this.aR.a(fvw.a($$1));
      this.aC = ful.a(R, $$0x -> a(this.O(), this)).a(100).a();
      this.aF = ful.a(T, $$0x -> this.f(this.O())).a(100).a();
      this.aE = ful.a(P, $$0x -> this.e(this.O())).a(100).a();
      this.aG = ful.a(S, $$0x -> this.g(this.O())).a(100).a();
      this.aP = ful.a(xa.c("mco.selectServer.purchase"), $$0x -> this.P()).b(100, 20).a();
      this.aD = ful.a(wz.k, $$0x -> this.aP_()).a(100).a();
      if (fmd.a == fmd.b.b) {
         this.c(fus.a(xa.b("Snapshot"), xa.b("Release")).a(5, 5, 100, 20, xa.b("Realm"), ($$0x, $$1x) -> {
            av = $$1x;
            this.aJ = List.of();
            this.I();
         }));
      }

      this.a(fly.f.a);
      this.H();
      this.aw.thenAcceptAsync($$0x -> {
         gad $$1x = $$0x.a(this.aB);
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
   public void aP_() {
      this.m.a(this.aB);
   }

   private void E() {
      if (this.aI.a() && this.aJ.isEmpty() && this.aO.isEmpty()) {
         this.a(fly.f.b);
      } else {
         this.a(fly.f.c);
      }
   }

   private void a(fly.f $$0) {
      if (this.aS != $$0) {
         if (this.aT != null) {
            this.aT.a($$1 -> this.e($$1));
         }

         this.aT = this.b($$0);
         this.aS = $$0;
         this.aT.a($$1 -> {
            fuj var10000 = this.c($$1);
         });
         this.c();
      }
   }

   private fxz b(fly.f $$0) {
      fxz $$1 = new fxz(this);
      $$1.b(44);
      $$1.a(this.F());
      fya $$2 = this.c($$0);
      $$2.a();
      $$1.a($$2.y() + 22);
      $$1.b($$2);
      switch ($$0) {
         case a:
            $$1.c(new fva(this.p, M));
            break;
         case b:
            $$1.c(this.G());
            break;
         case c:
            $$1.c(this.aH);
      }

      return $$1;
   }

   private fya F() {
      int $$0 = 90;
      fyd $$1 = fyd.e().a(4);
      $$1.c().e();
      $$1.a(this.aQ);
      $$1.a(this.aR);
      fyd $$2 = fyd.e();
      $$2.c().e();
      $$2.a(fye.a(90));
      $$2.a(fuy.a(128, 34, J, 128, 64), fyc::b);
      $$2.a(new fxx(90, 44)).a($$1, fyc::c);
      return $$2;
   }

   private fya c(fly.f $$0) {
      fxy $$1 = new fxy().c(4);
      fxy.b $$2 = $$1.d(3);
      if ($$0 == fly.f.c) {
         $$2.a(this.aC);
         $$2.a(this.aF);
         $$2.a(this.aE);
         $$2.a(this.aG);
      }

      $$2.a(this.aP);
      $$2.a(this.aD);
      return $$1;
   }

   private fyd G() {
      fyd $$0 = fyd.d().a(8);
      $$0.c().b();
      $$0.a(fuy.a(130, 64, K, 130, 64));
      fuw $$1 = new fuw(308, aa, this.p, false, 4);
      $$0.a($$1);
      return $$0;
   }

   void H() {
      fne $$0 = this.O();
      this.aP.j = this.aS != fly.f.a;
      this.aC.j = $$0 != null && this.a($$0);
      this.aE.j = $$0 != null && this.b($$0);
      this.aG.j = $$0 != null && this.d($$0);
      this.aF.j = $$0 != null && this.c($$0);
   }

   boolean a(fne $$0) {
      boolean $$1 = !$$0.j && $$0.e == fne.c.b;
      return $$1 && ($$0.d() || $$0.e() || i($$0));
   }

   private boolean b(fne $$0) {
      return $$0.j && i($$0);
   }

   private boolean c(fne $$0) {
      return i($$0) && $$0.e != fne.c.c;
   }

   private boolean d(fne $$0) {
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
      frd.Q().bb().d.a();
   }

   public static void g() {
      frd.Q().bb().c.a();
   }

   private void I() {
      for (fpl.e<?> $$0 : this.m.bb().a()) {
         $$0.a();
      }
   }

   private fpl.c a(foc $$0) {
      fpl.c $$1 = $$0.a.a();
      $$1.a($$0.c, $$0x -> {
         this.aI.a($$0x.a());
         this.aJ = $$0x.b();
         this.L();
         boolean $$1x = false;

         for (fne $$2 : this.aI) {
            if (this.j($$2)) {
               $$1x = true;
            }
         }

         if (!az && $$1x) {
            az = true;
            this.M();
         }
      });
      a(fmd::e, $$0x -> {
         this.aO.clear();
         this.aO.addAll($$0x);

         for (fnd $$1x : $$0x) {
            if ($$1x instanceof fnd.a $$2) {
               fvn $$3 = $$2.a(this, this::a);
               if ($$3 != null) {
                  this.m.a($$3);
                  this.a(List.of($$1x));
                  break;
               }
            }
         }

         if (!this.aO.isEmpty() && this.aS != fly.f.a) {
            this.L();
         }
      });
      $$1.a($$0.d, $$0x -> {
         this.aQ.a($$0x);
         this.aQ.a($$0x == 0 ? fvw.a(ab) : fvw.a(ac));
         if ($$0x > 0 && this.aA.tryAcquire(1)) {
            this.m.aY().c(xa.a("mco.configure.world.invite.narration", $$0x));
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

   void a(Collection<fnd> $$0) {
      List<UUID> $$1 = new ArrayList<>($$0.size());

      for (fnd $$2 : $$0) {
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

   private static <T> void a(fly.k<T> $$0, Consumer<T> $$1) {
      frd $$2 = frd.Q();
      CompletableFuture.<T>supplyAsync(() -> {
         try {
            return $$0.request(fmd.a($$2));
         } catch (fnz var3) {
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
         List<fnn> $$0 = fmc.a();
         fmd $$1 = fmd.a();
         fmz $$2 = new fmz();
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

      for (fne $$1 : this.aI) {
         if (this.j($$1)) {
            $$0.add($$1.a);
         }
      }

      return $$0;
   }

   private void e(@Nullable fne $$0) {
      if ($$0 != null) {
         String $$1 = ayj.a($$0.b, this.m.X().b(), $$0.k);
         this.m.p.a($$1);
         ag.n().a($$1);
      }
   }

   private void f(@Nullable fne $$0) {
      if ($$0 != null && this.m.b($$0.g)) {
         this.m.a(new fon(this, $$0.a));
      }
   }

   private void g(@Nullable fne $$0) {
      if ($$0 != null && !this.m.b($$0.g)) {
         xa $$1 = xa.c("mco.configure.world.leave.question.line1");
         this.m.a(fpa.a(this, $$1, $$1x -> this.h($$0)));
      }
   }

   @Nullable
   private fne O() {
      return this.aH.p() instanceof fly.l $$0 ? $$0.c() : null;
   }

   private void h(final fne $$0) {
      (new Thread("Realms-leave-server") {
         @Override
         public void run() {
            try {
               fmd $$0 = fmd.a();
               $$0.d($$0.a);
               fly.this.m.execute(fly::g);
            } catch (fnz var2) {
               fly.I.error("Couldn't configure world", var2);
               fly.this.m.execute(() -> fly.this.m.a(new fos(var2, fly.this)));
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
   public xa i() {
      return (xa)(switch (this.aS) {
         case a -> wz.a(super.i(), M);
         case b -> wz.a(super.i(), aa);
         case c -> super.i();
      });
   }

   @Override
   public void a(ftx $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (b()) {
         $$0.b(this.p, "Minecraft " + ac.b().c(), 2, this.o - 10, -1);
      }

      if (this.aL && this.aP.j) {
         foi.a($$0, this.aP);
      }

      switch (fmd.a) {
         case b:
            this.a($$0, "STAGE!", -256);
            break;
         case c:
            this.a($$0, "LOCAL!", 8388479);
      }
   }

   private void P() {
      this.m.a(new foi(this, this.aL));
   }

   public static void a(@Nullable fne $$0, gad $$1) {
      a($$0, $$1, false);
   }

   public static void a(@Nullable fne $$0, gad $$1, boolean $$2) {
      if ($$0 != null) {
         if (!b() || $$2 || $$0.i()) {
            frd.Q().a(new fou($$1, new fqa($$1, $$0)));
            return;
         }

         switch ($$0.w) {
            case f:
               frd.Q().a(new fou($$1, new fqa($$1, $$0)));
               break;
            case a:
               a($$0, $$1, xa.c("mco.compatibility.unverifiable.title").b(-171), xa.c("mco.compatibility.unverifiable.message"), wz.j);
               break;
            case d:
               a(
                  $$0,
                  $$1,
                  xa.c("selectWorld.backupQuestion.downgrade").b(-2142128),
                  xa.a("mco.compatibility.downgrade.description", xa.b($$0.v).b(-171), xa.b(ac.b().c()).b(-171)),
                  xa.c("mco.compatibility.downgrade")
               );
               break;
            case e:
               b($$0, $$1);
               break;
            case b:
               frd.Q()
                  .a(
                     new fvn.a($$1, ad)
                        .a(xa.a("mco.compatibility.incompatible.series.popup.message", xa.b($$0.v).b(-171), xa.b(ac.b().c()).b(-171)))
                        .a(wz.k, fvn::aP_)
                        .a()
                  );
               break;
            case c:
               frd.Q().a(new fvn.a($$1, ad).a(ae).a(wz.k, fvn::aP_).a());
         }
      }
   }

   private static void a(fne $$0, gad $$1, xa $$2, xa $$3, xa $$4) {
      frd.Q().a(new fvn.a($$1, $$2).a($$3).a($$4, $$2x -> {
         frd.Q().a(new fou($$1, new fqa($$1, $$0)));
         g();
      }).a(wz.e, fvn::aP_).a());
   }

   private static void b(fne $$0, gad $$1) {
      xa $$2 = xa.c("mco.compatibility.upgrade.title").b(-171);
      xa $$3 = xa.c("mco.compatibility.upgrade");
      xa $$4 = xa.b($$0.v).b(-171);
      xa $$5 = xa.b(ac.b().c()).b(-171);
      xa $$6 = i($$0) ? xa.a("mco.compatibility.upgrade.description", $$4, $$5) : xa.a("mco.compatibility.upgrade.friend.description", $$4, $$5);
      a($$0, $$1, $$2, $$6, $$3);
   }

   public static xa a(String $$0, boolean $$1) {
      return a($$0, $$1 ? -8355712 : -2142128);
   }

   public static xa a(String $$0, int $$1) {
      return (xa)(StringUtils.isBlank($$0) ? wz.a : xa.b($$0).b($$1));
   }

   public static xa a(int $$0, boolean $$1) {
      return (xa)($$1 ? xa.c("gameMode.hardcore").b(-65536) : dju.a($$0).d());
   }

   static boolean i(fne $$0) {
      return frd.Q().b($$0.g);
   }

   private boolean j(fne $$0) {
      return i($$0) && !$$0.j;
   }

   private void a(ftx $$0, String $$1, int $$2) {
      $$0.c().a();
      $$0.c().a((float)(this.n / 2 - 25), 20.0F, 0.0F);
      $$0.c().a(a.f.rotationDegrees(-20.0F));
      $$0.c().b(1.5F, 1.5F, 1.5F);
      $$0.b(this.p, $$1, 0, 0, $$2);
      $$0.c().b();
   }

   class a extends fly.e {
      private static final xa f = xa.c("mco.snapshot.start");
      private static final int g = 5;
      private final fvz h = new fvz();
      private final fne i;

      public a(final fne $$0) {
         this.i = $$0;
         this.h.a(fvw.a(xa.c("mco.snapshot.tooltip")));
      }

      @Override
      public void a(ftx $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(gsl::H, fly.c, $$3 - 5, $$2 + $$5 / 2 - 10, 40, 20);
         int $$10 = $$2 + $$5 / 2 - 9 / 2;
         $$0.b(fly.this.p, f, $$3 + 40 - 2, $$10 - 5, 8388479);
         $$0.b(fly.this.p, xa.a("mco.snapshot.description", Objects.requireNonNullElse(this.i.c, "unknown server")), $$3 + 40 - 2, $$10 + 5, -8355712);
         this.h.a($$8, this.aN_(), new fys($$3, $$2, $$4, $$5));
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         this.c();
         return true;
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         if (fyn.a($$0)) {
            this.c();
            return false;
         } else {
            return super.a($$0, $$1, $$2);
         }
      }

      private void c() {
         fly.this.m.ak().a(hos.a(awp.Bv, 1.0F));
         fly.this.m
            .a(
               new fvn.a(fly.this, xa.c("mco.snapshot.createSnapshotPopup.title"))
                  .a(xa.c("mco.snapshot.createSnapshotPopup.text"))
                  .a(xa.c("mco.selectServer.create"), $$0 -> fly.this.m.a(new fop(fly.this, this.i, true)))
                  .a(wz.e, fvn::aP_)
                  .a()
            );
      }

      @Override
      public xa a() {
         return xa.a("gui.narrate.button", wz.a(f, xa.a("mco.snapshot.description", Objects.requireNonNullElse(this.i.c, "unknown server"))));
      }
   }

   class b extends fly.e {
      private final ful f;

      public b(final ful $$0) {
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
      public void a(ftx $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.f.c(fly.this.n / 2 - 75, $$2 + 4);
         this.f.a($$0, $$6, $$7, $$9);
      }

      @Override
      public void a(boolean $$0) {
         super.a($$0);
         this.f.a($$0);
      }

      @Override
      public xa a() {
         return this.f.B();
      }
   }

   static class c extends fux {
      private static final fvy b = new fvy(ali.b("widget/cross_button"), ali.b("widget/cross_button_highlighted"));

      protected c(ful.c $$0, xa $$1) {
         super(0, 0, 14, 14, b, $$0);
         this.a(fvw.a($$1));
      }
   }

   class d extends fly.e {
      @Override
      public void a(ftx $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
      }

      @Override
      public xa a() {
         return xa.i();
      }
   }

   abstract class e extends fvh.a<fly.e> {
      protected static final int b = 10;
      private static final int a = 28;
      protected static final int c = 7;
      protected static final int d = 2;

      protected void a(fne $$0, ftx $$1, int $$2, int $$3, int $$4, int $$5) {
         int $$6 = $$2 - 10 - 7;
         int $$7 = $$3 + 2;
         if ($$0.j) {
            this.a($$1, $$6, $$7, $$4, $$5, fly.C, () -> fly.U);
         } else if ($$0.e == fne.c.a) {
            this.a($$1, $$6, $$7, $$4, $$5, fly.F, () -> fly.Y);
         } else if (fly.i($$0) && $$0.l < 7) {
            this.a($$1, $$6, $$7, $$4, $$5, fly.D, () -> {
               if ($$0.l <= 0) {
                  return fly.V;
               } else {
                  return (xa)($$0.l == 1 ? fly.W : xa.a("mco.selectServer.expires.days", $$0.l));
               }
            });
         } else if ($$0.e == fne.c.b) {
            this.a($$1, $$6, $$7, $$4, $$5, fly.E, () -> fly.X);
         }
      }

      private void a(ftx $$0, int $$1, int $$2, int $$3, int $$4, ali $$5, Supplier<xa> $$6) {
         $$0.a(gsl::H, $$5, $$1, $$2, 10, 28);
         if (fly.this.aH.a_((double)$$3, (double)$$4) && $$3 >= $$1 && $$3 <= $$1 + 10 && $$4 >= $$2 && $$4 <= $$2 + 28) {
            fly.this.d($$6.get());
         }
      }

      protected void a(ftx $$0, int $$1, int $$2, fne $$3) {
         int $$4 = this.b($$2);
         int $$5 = this.a($$1);
         int $$6 = this.d($$5);
         if (!fly.i($$3)) {
            $$0.b(fly.this.p, $$3.f, $$4, this.d($$5), -8355712);
         } else if ($$3.j) {
            xa $$7 = $$3.k ? fly.Q : fly.O;
            $$0.b(fly.this.p, $$7, $$4, $$6, -2142128);
         }
      }

      protected void a(ftx $$0, @Nullable String $$1, int $$2, int $$3, int $$4, int $$5) {
         if ($$1 != null) {
            int $$6 = $$4 - $$2;
            if (fly.this.p.b($$1) > $$6) {
               String $$7 = fly.this.p.a($$1, $$6 - fly.this.p.b("... "));
               $$0.b(fly.this.p, $$7 + "...", $$2, $$3, $$5);
            } else {
               $$0.b(fly.this.p, $$1, $$2, $$3, $$5);
            }
         }
      }

      protected int a(int $$0, int $$1, xa $$2) {
         return $$0 + $$1 - fly.this.p.a($$2) - 20;
      }

      protected int b(int $$0, int $$1, xa $$2) {
         return $$0 + $$1 - fly.this.p.a($$2) - 20;
      }

      protected int a(fne $$0, ftx $$1, int $$2, int $$3, int $$4) {
         boolean $$5 = $$0.n;
         int $$6 = $$0.o;
         int $$7 = $$2;
         if (dju.c($$6)) {
            xa $$8 = fly.a($$6, $$5);
            $$7 = this.b($$2, $$3, $$8);
            $$1.b(fly.this.p, $$8, $$7, this.c($$4), -8355712);
         }

         if ($$5) {
            $$7 -= 10;
            $$1.a(gsl::H, fly.a, $$7, this.c($$4), 8, 8);
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

   static class g extends fvq.b {
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

      public g(xa $$0, ali $$1, ful.c $$2) {
         super(20, 20, $$0, 14, 14, $$1, $$2, null);
      }

      int a() {
         return this.x;
      }

      public void a(int $$0) {
         this.x = $$0;
      }

      @Override
      public void b(ftx $$0, int $$1, int $$2, float $$3) {
         super.b($$0, $$1, $$2, $$3);
         if (this.j && this.x != 0) {
            this.a($$0);
         }
      }

      private void a(ftx $$0) {
         $$0.a(gsl::H, d[Math.min(this.x, 6) - 1], this.F() + this.A() - 5, this.G() - 3, 8, 8);
      }
   }

   class h extends fly.e {
      private static final int f = 40;
      private static final int g = -12303292;
      private final xa h;
      private final int i;
      private final List<fuj> j = new ArrayList<>();
      @Nullable
      private final fly.c k;
      private final fvf l;
      private final fxy m;
      private final fxx n;
      private int o = -1;

      public h(final xa $$0, final int $$1, final fnd $$2) {
         this.h = $$0;
         this.i = $$1;
         this.m = new fxy();
         int $$3 = 7;
         this.m.a(fuy.a(20, 20, fly.b), 0, 0, this.m.b().a(7, 7, 0, 0));
         this.m.a(fye.a(40), 0, 0);
         this.n = this.m.a(new fxx(0, 9 * 3 * ($$1 - 1)), 0, 1, this.m.b().c(7));
         this.l = this.n.a(new fvf($$0, fly.this.p).b(true), this.n.b().b().d());
         this.m.a(fye.a(40), 0, 2);
         if ($$2.b()) {
            this.k = this.m.a(new fly.c($$1x -> fly.this.a($$2.c()), xa.c("mco.notification.dismiss")), 0, 2, this.m.b().c().a(0, 7, 7, 0));
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
      public void b(ftx $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         super.b($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
         $$0.b($$3 - 2, $$2 - 2, $$4, 36 * this.i - 2, -12303292);
      }

      @Override
      public void a(ftx $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
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
      public xa a() {
         return this.h;
      }
   }

   class i extends fly.e {
      private final fne f;
      private final fvz g = new fvz();

      public i(final fne $$0) {
         this.f = $$0;
         if (!$$0.j) {
            this.g.a(fvw.a(xa.c("mco.snapshot.parent.tooltip")));
         }
      }

      @Override
      public void a(ftx $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = this.b($$3);
         int $$11 = this.a($$2);
         fpt.a($$0, $$3, $$2, 32, this.f.g);
         xa $$12 = fly.a(this.f.v, -8355712);
         int $$13 = this.a($$3, $$4, $$12);
         this.a($$0, this.f.b(), $$10, $$11, $$13, -8355712);
         if ($$12 != wz.a) {
            $$0.b(fly.this.p, $$12, $$13, $$11, -8355712);
         }

         int $$14 = $$3;
         if (!this.f.i()) {
            $$14 = this.a(this.f, $$0, $$3, $$4, $$11);
         }

         this.a($$0, this.f.a(), $$10, this.c($$11), $$14, -8355712);
         this.a($$0, $$2, $$3, this.f);
         this.a(this.f, $$0, $$3 + $$4, $$2, $$6, $$7);
         this.g.a($$8, this.aN_(), new fys($$3, $$2, $$4, $$5));
      }

      @Override
      public xa a() {
         return xa.b(Objects.requireNonNullElse(this.f.c, "unknown server"));
      }
   }

   class j extends fvh<fly.e> {
      public j() {
         super(frd.Q(), fly.this.n, fly.this.o, 0, 36);
      }

      public void a(@Nullable fly.e $$0) {
         super.a($$0);
         fly.this.H();
      }

      @Override
      public int a() {
         return 300;
      }

      void a(fly $$0, @Nullable fne $$1) {
         this.s();

         for (fnd $$2 : fly.this.aO) {
            if ($$2 instanceof fnd.c $$3) {
               this.a($$3, $$0);
               fly.this.a(List.of($$2));
               break;
            }
         }

         this.a($$1);
      }

      private void a(@Nullable fne $$0) {
         for (fne $$1 : fly.this.aJ) {
            this.b(fly.this.new a($$1));
         }

         for (fne $$2 : fly.this.aI) {
            fly.e $$3;
            if (fly.b() && !$$2.h()) {
               if ($$2.e == fne.c.c) {
                  continue;
               }

               $$3 = fly.this.new i($$2);
            } else {
               $$3 = fly.this.new l($$2);
            }

            this.b($$3);
            if ($$0 != null && $$0.a == $$2.a) {
               this.a($$3);
            }
         }
      }

      private void a(fnd.c $$0, fly $$1) {
         xa $$2 = $$0.d();
         int $$3 = fly.this.p.b($$2, 216);
         int $$4 = azo.e($$3 + 7, 36) - 1;
         this.b(fly.this.new h($$2, $$4 + 2, $$0));

         for (int $$5 = 0; $$5 < $$4; $$5++) {
            this.b(fly.this.new d());
         }

         this.b(fly.this.new b($$0.a($$1)));
      }
   }

   interface k<T> {
      T request(fmd var1) throws fnz;
   }

   class l extends fly.e {
      private static final xa f = xa.c("mco.onlinePlayers");
      private static final int g = 9;
      private static final int h = 36;
      private final fne i;
      private final fvz j = new fvz();

      public l(final fne $$0) {
         this.i = $$0;
         boolean $$1 = fly.i($$0);
         if (fly.b() && $$1 && $$0.h()) {
            this.j.a(fvw.a(xa.a("mco.snapshot.paired", $$0.u)));
         } else if (!$$1 && $$0.f()) {
            this.j.a(fvw.a(xa.a("mco.snapshot.friendsRealm.downgrade", $$0.v)));
         }
      }

      @Override
      public void a(ftx $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         if (this.i.e == fne.c.c) {
            $$0.a(gsl::H, fly.c, $$3 - 5, $$2 + $$5 / 2 - 10, 40, 20);
            int $$10 = $$2 + $$5 / 2 - 9 / 2;
            $$0.b(fly.this.p, fly.N, $$3 + 40 - 2, $$10, 8388479);
         } else {
            this.a(this.i, $$0, $$3 + 36, $$2, $$6, $$7);
            fpt.a($$0, $$3, $$2, 32, this.i.g);
            this.a($$0, $$2, $$3, $$4);
            this.b($$0, $$2, $$3, $$4);
            this.a($$0, $$2, $$3, this.i);
            boolean $$11 = this.a($$0, $$2, $$3, $$4, $$5, $$6, $$7);
            this.a(this.i, $$0, $$3 + $$4, $$2, $$6, $$7);
            if (!$$11) {
               this.j.a($$8, this.aN_(), new fys($$3, $$2, $$4, $$5));
            }
         }
      }

      private void a(ftx $$0, int $$1, int $$2, int $$3) {
         int $$4 = this.b($$2);
         int $$5 = this.a($$1);
         xa $$6 = fly.a(this.i.v, this.i.d());
         int $$7 = this.a($$2, $$3, $$6);
         this.a($$0, this.i.b(), $$4, $$5, $$7, -1);
         if ($$6 != wz.a && !this.i.i()) {
            $$0.b(fly.this.p, $$6, $$7, $$5, -8355712);
         }
      }

      private void b(ftx $$0, int $$1, int $$2, int $$3) {
         int $$4 = this.b($$2);
         int $$5 = this.a($$1);
         int $$6 = this.c($$5);
         String $$7 = this.i.c();
         boolean $$8 = this.i.i();
         if ($$8 && $$7 != null) {
            xa $$9 = xa.b($$7).a(o.h);
            $$0.b(fly.this.p, xa.a("mco.selectServer.minigameName", $$9).b(-171), $$4, $$6, -1);
         } else {
            int $$10 = this.a(this.i, $$0, $$2, $$3, $$5);
            this.a($$0, this.i.a(), $$4, this.c($$5), $$10, -8355712);
         }
      }

      private boolean a(ftx $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6) {
         List<ProfileResult> $$7 = fly.this.aK.a(this.i.a);
         if (!$$7.isEmpty()) {
            int $$8 = $$2 + $$3 - 21;
            int $$9 = $$1 + $$4 - 9 - 2;
            int $$10 = $$8;

            for (int $$11 = 0; $$11 < $$7.size(); $$11++) {
               $$10 -= 9 + ($$11 == 0 ? 0 : 3);
               fvk.a($$0, frd.Q().an().b($$7.get($$11).profile()), $$10, $$9, 9);
            }

            if ($$5 >= $$10 && $$5 <= $$8 && $$6 >= $$9 && $$6 <= $$9 + 9) {
               $$0.a(fly.this.p, List.of(f), Optional.of(new gcm.a($$7)), $$5, $$6);
               return true;
            }
         }

         return false;
      }

      private void d() {
         fly.this.m.ak().a(hos.a(awp.Bv, 1.0F));
         fly.a(this.i, fly.this);
      }

      private void e() {
         fly.this.m.ak().a(hos.a(awp.Bv, 1.0F));
         fop $$0 = new fop(fly.this, this.i, this.i.h());
         fly.this.m.a($$0);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         if (this.i.e == fne.c.c) {
            this.e();
         } else if (fly.this.a(this.i)) {
            if (ag.c() - fly.this.aN < 250L && this.aN_()) {
               this.d();
            }

            fly.this.aN = ag.c();
         }

         return true;
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         if (fyn.a($$0)) {
            if (this.i.e == fne.c.c) {
               this.e();
               return true;
            }

            if (fly.this.a(this.i)) {
               this.d();
               return true;
            }
         }

         return super.a($$0, $$1, $$2);
      }

      @Override
      public xa a() {
         return (xa)(this.i.e == fne.c.c ? fly.Z : xa.a("narrator.select", Objects.requireNonNullElse(this.i.c, "unknown server")));
      }

      public fne c() {
         return this.i;
      }
   }
}
