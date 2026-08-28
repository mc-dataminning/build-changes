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

public class fma extends hro {
   static final alk b = alk.b("icon/info");
   static final alk c = alk.b("icon/new_realm");
   static final alk C = alk.b("realm_status/expired");
   static final alk D = alk.b("realm_status/expires_soon");
   static final alk E = alk.b("realm_status/open");
   static final alk F = alk.b("realm_status/closed");
   private static final alk G = alk.b("icon/invite");
   private static final alk H = alk.b("icon/news");
   public static final alk a = alk.b("hud/heart/hardcore_full");
   static final Logger I = LogUtils.getLogger();
   private static final alk J = alk.b("textures/gui/title/realms.png");
   private static final alk K = alk.b("textures/gui/realms/no_realms.png");
   private static final xc L = xc.c("menu.online");
   private static final xc M = xc.c("mco.selectServer.loading");
   static final xc N = xc.c("mco.selectServer.uninitialized");
   static final xc O = xc.c("mco.selectServer.expiredList");
   private static final xc P = xc.c("mco.selectServer.expiredRenew");
   static final xc Q = xc.c("mco.selectServer.expiredTrial");
   private static final xc R = xc.c("mco.selectServer.play");
   private static final xc S = xc.c("mco.selectServer.leave");
   private static final xc T = xc.c("mco.selectServer.configure");
   static final xc U = xc.c("mco.selectServer.expired");
   static final xc V = xc.c("mco.selectServer.expires.soon");
   static final xc W = xc.c("mco.selectServer.expires.day");
   static final xc X = xc.c("mco.selectServer.open");
   static final xc Y = xc.c("mco.selectServer.closed");
   static final xc Z = xc.a("gui.narrate.button", N);
   private static final xc aa = xc.c("mco.selectServer.noRealms");
   private static final xc ab = xc.c("mco.invites.nopending");
   private static final xc ac = xc.c("mco.invites.pending");
   private static final xc ad = xc.c("mco.compatibility.incompatible.popup.title");
   private static final xc ae = xc.c("mco.compatibility.incompatible.releaseType.popup.message");
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
   private final CompletableFuture<flz.a> aw = flz.a();
   @Nullable
   private fpn.c ax;
   private final Set<UUID> ay = new HashSet<>();
   private static boolean az;
   private final RateLimiter aA;
   private final gaf aB;
   private fun aC;
   private fun aD;
   private fun aE;
   private fun aF;
   private fun aG;
   fma.j aH;
   fog aI;
   List<fng> aJ = List.of();
   fnj aK = new fnj();
   private volatile boolean aL;
   @Nullable
   private volatile String aM;
   long aN;
   final List<fnf> aO = new ArrayList<>();
   private fun aP;
   private fma.g aQ;
   private fma.g aR;
   private fma.f aS;
   @Nullable
   private fyb aT;

   public fma(gaf $$0) {
      super(L);
      this.aB = $$0;
      this.aA = RateLimiter.create(0.016666668F);
   }

   @Override
   public void aS_() {
      this.aI = new fog(this.m);
      this.aH = new fma.j();
      xc $$0 = xc.c("mco.invites.title");
      this.aQ = new fma.g($$0, G, $$1x -> this.m.a(new fpa(this, $$0)));
      xc $$1 = xc.c("mco.news");
      this.aR = new fma.g($$1, H, $$0x -> {
         String $$1x = this.aM;
         if ($$1x != null) {
            fzc.a(this, $$1x);
            if (this.aR.a() != 0) {
               fpt.a $$2 = fpt.b();
               $$2.b = false;
               fpt.b($$2);
               this.aR.a(0);
            }
         }
      });
      this.aR.a(fvy.a($$1));
      this.aC = fun.a(R, $$0x -> a(this.O(), this)).a(100).a();
      this.aF = fun.a(T, $$0x -> this.f(this.O())).a(100).a();
      this.aE = fun.a(P, $$0x -> this.e(this.O())).a(100).a();
      this.aG = fun.a(S, $$0x -> this.g(this.O())).a(100).a();
      this.aP = fun.a(xc.c("mco.selectServer.purchase"), $$0x -> this.P()).b(100, 20).a();
      this.aD = fun.a(xb.k, $$0x -> this.aP_()).a(100).a();
      if (fmf.a == fmf.b.b) {
         this.c(fuu.a(xc.b("Snapshot"), xc.b("Release")).a(5, 5, 100, 20, xc.b("Realm"), ($$0x, $$1x) -> {
            av = $$1x;
            this.aJ = List.of();
            this.I();
         }));
      }

      this.a(fma.f.a);
      this.H();
      this.aw.thenAcceptAsync($$0x -> {
         gaf $$1x = $$0x.a(this.aB);
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
         this.a(fma.f.b);
      } else {
         this.a(fma.f.c);
      }
   }

   private void a(fma.f $$0) {
      if (this.aS != $$0) {
         if (this.aT != null) {
            this.aT.a($$1 -> this.e($$1));
         }

         this.aT = this.b($$0);
         this.aS = $$0;
         this.aT.a($$1 -> {
            ful var10000 = this.c($$1);
         });
         this.c();
      }
   }

   private fyb b(fma.f $$0) {
      fyb $$1 = new fyb(this);
      $$1.b(44);
      $$1.a(this.F());
      fyc $$2 = this.c($$0);
      $$2.a();
      $$1.a($$2.y() + 22);
      $$1.b($$2);
      switch ($$0) {
         case a:
            $$1.c(new fvc(this.p, M));
            break;
         case b:
            $$1.c(this.G());
            break;
         case c:
            $$1.c(this.aH);
      }

      return $$1;
   }

   private fyc F() {
      int $$0 = 90;
      fyf $$1 = fyf.e().a(4);
      $$1.c().e();
      $$1.a(this.aQ);
      $$1.a(this.aR);
      fyf $$2 = fyf.e();
      $$2.c().e();
      $$2.a(fyg.a(90));
      $$2.a(fva.a(128, 34, J, 128, 64), fye::b);
      $$2.a(new fxz(90, 44)).a($$1, fye::c);
      return $$2;
   }

   private fyc c(fma.f $$0) {
      fya $$1 = new fya().c(4);
      fya.b $$2 = $$1.d(3);
      if ($$0 == fma.f.c) {
         $$2.a(this.aC);
         $$2.a(this.aF);
         $$2.a(this.aE);
         $$2.a(this.aG);
      }

      $$2.a(this.aP);
      $$2.a(this.aD);
      return $$1;
   }

   private fyf G() {
      fyf $$0 = fyf.d().a(8);
      $$0.c().b();
      $$0.a(fva.a(130, 64, K, 130, 64));
      fuy $$1 = new fuy(308, aa, this.p, false, 4);
      $$0.a($$1);
      return $$0;
   }

   void H() {
      fng $$0 = this.O();
      this.aP.j = this.aS != fma.f.a;
      this.aC.j = $$0 != null && this.a($$0);
      this.aE.j = $$0 != null && this.b($$0);
      this.aG.j = $$0 != null && this.d($$0);
      this.aF.j = $$0 != null && this.c($$0);
   }

   boolean a(fng $$0) {
      boolean $$1 = !$$0.j && $$0.e == fng.c.b;
      return $$1 && ($$0.d() || $$0.e() || i($$0));
   }

   private boolean b(fng $$0) {
      return $$0.j && i($$0);
   }

   private boolean c(fng $$0) {
      return i($$0) && $$0.e != fng.c.c;
   }

   private boolean d(fng $$0) {
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
      frf.Q().bb().d.a();
   }

   public static void g() {
      frf.Q().bb().c.a();
   }

   private void I() {
      for (fpn.e<?> $$0 : this.m.bb().a()) {
         $$0.a();
      }
   }

   private fpn.c a(foe $$0) {
      fpn.c $$1 = $$0.a.a();
      $$1.a($$0.c, $$0x -> {
         this.aI.a($$0x.a());
         this.aJ = $$0x.b();
         this.L();
         boolean $$1x = false;

         for (fng $$2 : this.aI) {
            if (this.j($$2)) {
               $$1x = true;
            }
         }

         if (!az && $$1x) {
            az = true;
            this.M();
         }
      });
      a(fmf::e, $$0x -> {
         this.aO.clear();
         this.aO.addAll($$0x);

         for (fnf $$1x : $$0x) {
            if ($$1x instanceof fnf.a $$2) {
               fvp $$3 = $$2.a(this, this::a);
               if ($$3 != null) {
                  this.m.a($$3);
                  this.a(List.of($$1x));
                  break;
               }
            }
         }

         if (!this.aO.isEmpty() && this.aS != fma.f.a) {
            this.L();
         }
      });
      $$1.a($$0.d, $$0x -> {
         this.aQ.a($$0x);
         this.aQ.a($$0x == 0 ? fvy.a(ab) : fvy.a(ac));
         if ($$0x > 0 && this.aA.tryAcquire(1)) {
            this.m.aY().c(xc.a("mco.configure.world.invite.narration", $$0x));
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

   void a(Collection<fnf> $$0) {
      List<UUID> $$1 = new ArrayList<>($$0.size());

      for (fnf $$2 : $$0) {
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

   private static <T> void a(fma.k<T> $$0, Consumer<T> $$1) {
      frf $$2 = frf.Q();
      CompletableFuture.<T>supplyAsync(() -> {
         try {
            return $$0.request(fmf.a($$2));
         } catch (fob var3) {
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
         List<fnp> $$0 = fme.a();
         fmf $$1 = fmf.a();
         fnb $$2 = new fnb();
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

      for (fng $$1 : this.aI) {
         if (this.j($$1)) {
            $$0.add($$1.a);
         }
      }

      return $$0;
   }

   private void e(@Nullable fng $$0) {
      if ($$0 != null) {
         String $$1 = ayl.a($$0.b, this.m.X().b(), $$0.k);
         this.m.p.a($$1);
         ag.n().a($$1);
      }
   }

   private void f(@Nullable fng $$0) {
      if ($$0 != null && this.m.b($$0.g)) {
         this.m.a(new fop(this, $$0.a));
      }
   }

   private void g(@Nullable fng $$0) {
      if ($$0 != null && !this.m.b($$0.g)) {
         xc $$1 = xc.c("mco.configure.world.leave.question.line1");
         this.m.a(fpc.a(this, $$1, $$1x -> this.h($$0)));
      }
   }

   @Nullable
   private fng O() {
      return this.aH.p() instanceof fma.l $$0 ? $$0.c() : null;
   }

   private void h(final fng $$0) {
      (new Thread("Realms-leave-server") {
         @Override
         public void run() {
            try {
               fmf $$0 = fmf.a();
               $$0.d($$0.a);
               fma.this.m.execute(fma::g);
            } catch (fob var2) {
               fma.I.error("Couldn't configure world", var2);
               fma.this.m.execute(() -> fma.this.m.a(new fou(var2, fma.this)));
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
   public xc i() {
      return (xc)(switch (this.aS) {
         case a -> xb.a(super.i(), M);
         case b -> xb.a(super.i(), aa);
         case c -> super.i();
      });
   }

   @Override
   public void a(ftz $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (b()) {
         $$0.b(this.p, "Minecraft " + ac.b().c(), 2, this.o - 10, -1);
      }

      if (this.aL && this.aP.j) {
         fok.a($$0, this.aP);
      }

      switch (fmf.a) {
         case b:
            this.a($$0, "STAGE!", -256);
            break;
         case c:
            this.a($$0, "LOCAL!", 8388479);
      }
   }

   private void P() {
      this.m.a(new fok(this, this.aL));
   }

   public static void a(@Nullable fng $$0, gaf $$1) {
      a($$0, $$1, false);
   }

   public static void a(@Nullable fng $$0, gaf $$1, boolean $$2) {
      if ($$0 != null) {
         if (!b() || $$2 || $$0.i()) {
            frf.Q().a(new fow($$1, new fqc($$1, $$0)));
            return;
         }

         switch ($$0.w) {
            case f:
               frf.Q().a(new fow($$1, new fqc($$1, $$0)));
               break;
            case a:
               a($$0, $$1, xc.c("mco.compatibility.unverifiable.title").b(-171), xc.c("mco.compatibility.unverifiable.message"), xb.j);
               break;
            case d:
               a(
                  $$0,
                  $$1,
                  xc.c("selectWorld.backupQuestion.downgrade").b(-2142128),
                  xc.a("mco.compatibility.downgrade.description", xc.b($$0.v).b(-171), xc.b(ac.b().c()).b(-171)),
                  xc.c("mco.compatibility.downgrade")
               );
               break;
            case e:
               b($$0, $$1);
               break;
            case b:
               frf.Q()
                  .a(
                     new fvp.a($$1, ad)
                        .a(xc.a("mco.compatibility.incompatible.series.popup.message", xc.b($$0.v).b(-171), xc.b(ac.b().c()).b(-171)))
                        .a(xb.k, fvp::aP_)
                        .a()
                  );
               break;
            case c:
               frf.Q().a(new fvp.a($$1, ad).a(ae).a(xb.k, fvp::aP_).a());
         }
      }
   }

   private static void a(fng $$0, gaf $$1, xc $$2, xc $$3, xc $$4) {
      frf.Q().a(new fvp.a($$1, $$2).a($$3).a($$4, $$2x -> {
         frf.Q().a(new fow($$1, new fqc($$1, $$0)));
         g();
      }).a(xb.e, fvp::aP_).a());
   }

   private static void b(fng $$0, gaf $$1) {
      xc $$2 = xc.c("mco.compatibility.upgrade.title").b(-171);
      xc $$3 = xc.c("mco.compatibility.upgrade");
      xc $$4 = xc.b($$0.v).b(-171);
      xc $$5 = xc.b(ac.b().c()).b(-171);
      xc $$6 = i($$0) ? xc.a("mco.compatibility.upgrade.description", $$4, $$5) : xc.a("mco.compatibility.upgrade.friend.description", $$4, $$5);
      a($$0, $$1, $$2, $$6, $$3);
   }

   public static xc a(String $$0, boolean $$1) {
      return a($$0, $$1 ? -8355712 : -2142128);
   }

   public static xc a(String $$0, int $$1) {
      return (xc)(StringUtils.isBlank($$0) ? xb.a : xc.b($$0).b($$1));
   }

   public static xc a(int $$0, boolean $$1) {
      return (xc)($$1 ? xc.c("gameMode.hardcore").b(-65536) : djw.a($$0).d());
   }

   static boolean i(fng $$0) {
      return frf.Q().b($$0.g);
   }

   private boolean j(fng $$0) {
      return i($$0) && !$$0.j;
   }

   private void a(ftz $$0, String $$1, int $$2) {
      $$0.c().a();
      $$0.c().a((float)(this.n / 2 - 25), 20.0F, 0.0F);
      $$0.c().a(a.f.rotationDegrees(-20.0F));
      $$0.c().b(1.5F, 1.5F, 1.5F);
      $$0.b(this.p, $$1, 0, 0, $$2);
      $$0.c().b();
   }

   class a extends fma.e {
      private static final xc f = xc.c("mco.snapshot.start");
      private static final int g = 5;
      private final fwb h = new fwb();
      private final fng i;

      public a(final fng $$0) {
         this.i = $$0;
         this.h.a(fvy.a(xc.c("mco.snapshot.tooltip")));
      }

      @Override
      public void a(ftz $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(gsn::H, fma.c, $$3 - 5, $$2 + $$5 / 2 - 10, 40, 20);
         int $$10 = $$2 + $$5 / 2 - 9 / 2;
         $$0.b(fma.this.p, f, $$3 + 40 - 2, $$10 - 5, 8388479);
         $$0.b(fma.this.p, xc.a("mco.snapshot.description", Objects.requireNonNullElse(this.i.c, "unknown server")), $$3 + 40 - 2, $$10 + 5, -8355712);
         this.h.a($$8, this.aN_(), new fyu($$3, $$2, $$4, $$5));
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         this.c();
         return true;
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         if (fyp.a($$0)) {
            this.c();
            return false;
         } else {
            return super.a($$0, $$1, $$2);
         }
      }

      private void c() {
         fma.this.m.ak().a(hou.a(awr.Bv, 1.0F));
         fma.this.m
            .a(
               new fvp.a(fma.this, xc.c("mco.snapshot.createSnapshotPopup.title"))
                  .a(xc.c("mco.snapshot.createSnapshotPopup.text"))
                  .a(xc.c("mco.selectServer.create"), $$0 -> fma.this.m.a(new fos(fma.this, this.i, true)))
                  .a(xb.e, fvp::aP_)
                  .a()
            );
      }

      @Override
      public xc a() {
         return xc.a("gui.narrate.button", xb.a(f, xc.a("mco.snapshot.description", Objects.requireNonNullElse(this.i.c, "unknown server"))));
      }
   }

   class b extends fma.e {
      private final fun f;

      public b(final fun $$0) {
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
      public void a(ftz $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.f.c(fma.this.n / 2 - 75, $$2 + 4);
         this.f.a($$0, $$6, $$7, $$9);
      }

      @Override
      public void a(boolean $$0) {
         super.a($$0);
         this.f.a($$0);
      }

      @Override
      public xc a() {
         return this.f.B();
      }
   }

   static class c extends fuz {
      private static final fwa b = new fwa(alk.b("widget/cross_button"), alk.b("widget/cross_button_highlighted"));

      protected c(fun.c $$0, xc $$1) {
         super(0, 0, 14, 14, b, $$0);
         this.a(fvy.a($$1));
      }
   }

   class d extends fma.e {
      @Override
      public void a(ftz $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
      }

      @Override
      public xc a() {
         return xc.i();
      }
   }

   abstract class e extends fvj.a<fma.e> {
      protected static final int b = 10;
      private static final int a = 28;
      protected static final int c = 7;
      protected static final int d = 2;

      protected void a(fng $$0, ftz $$1, int $$2, int $$3, int $$4, int $$5) {
         int $$6 = $$2 - 10 - 7;
         int $$7 = $$3 + 2;
         if ($$0.j) {
            this.a($$1, $$6, $$7, $$4, $$5, fma.C, () -> fma.U);
         } else if ($$0.e == fng.c.a) {
            this.a($$1, $$6, $$7, $$4, $$5, fma.F, () -> fma.Y);
         } else if (fma.i($$0) && $$0.l < 7) {
            this.a($$1, $$6, $$7, $$4, $$5, fma.D, () -> {
               if ($$0.l <= 0) {
                  return fma.V;
               } else {
                  return (xc)($$0.l == 1 ? fma.W : xc.a("mco.selectServer.expires.days", $$0.l));
               }
            });
         } else if ($$0.e == fng.c.b) {
            this.a($$1, $$6, $$7, $$4, $$5, fma.E, () -> fma.X);
         }
      }

      private void a(ftz $$0, int $$1, int $$2, int $$3, int $$4, alk $$5, Supplier<xc> $$6) {
         $$0.a(gsn::H, $$5, $$1, $$2, 10, 28);
         if (fma.this.aH.a_((double)$$3, (double)$$4) && $$3 >= $$1 && $$3 <= $$1 + 10 && $$4 >= $$2 && $$4 <= $$2 + 28) {
            fma.this.d($$6.get());
         }
      }

      protected void a(ftz $$0, int $$1, int $$2, fng $$3) {
         int $$4 = this.b($$2);
         int $$5 = this.a($$1);
         int $$6 = this.d($$5);
         if (!fma.i($$3)) {
            $$0.b(fma.this.p, $$3.f, $$4, this.d($$5), -8355712);
         } else if ($$3.j) {
            xc $$7 = $$3.k ? fma.Q : fma.O;
            $$0.b(fma.this.p, $$7, $$4, $$6, -2142128);
         }
      }

      protected void a(ftz $$0, @Nullable String $$1, int $$2, int $$3, int $$4, int $$5) {
         if ($$1 != null) {
            int $$6 = $$4 - $$2;
            if (fma.this.p.b($$1) > $$6) {
               String $$7 = fma.this.p.a($$1, $$6 - fma.this.p.b("... "));
               $$0.b(fma.this.p, $$7 + "...", $$2, $$3, $$5);
            } else {
               $$0.b(fma.this.p, $$1, $$2, $$3, $$5);
            }
         }
      }

      protected int a(int $$0, int $$1, xc $$2) {
         return $$0 + $$1 - fma.this.p.a($$2) - 20;
      }

      protected int b(int $$0, int $$1, xc $$2) {
         return $$0 + $$1 - fma.this.p.a($$2) - 20;
      }

      protected int a(fng $$0, ftz $$1, int $$2, int $$3, int $$4) {
         boolean $$5 = $$0.n;
         int $$6 = $$0.o;
         int $$7 = $$2;
         if (djw.c($$6)) {
            xc $$8 = fma.a($$6, $$5);
            $$7 = this.b($$2, $$3, $$8);
            $$1.b(fma.this.p, $$8, $$7, this.c($$4), -8355712);
         }

         if ($$5) {
            $$7 -= 10;
            $$1.a(gsn::H, fma.a, $$7, this.c($$4), 8, 8);
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

   static class g extends fvs.b {
      private static final alk[] d = new alk[]{
         alk.b("notification/1"),
         alk.b("notification/2"),
         alk.b("notification/3"),
         alk.b("notification/4"),
         alk.b("notification/5"),
         alk.b("notification/more")
      };
      private static final int u = Integer.MAX_VALUE;
      private static final int v = 20;
      private static final int w = 14;
      private int x;

      public g(xc $$0, alk $$1, fun.c $$2) {
         super(20, 20, $$0, 14, 14, $$1, $$2, null);
      }

      int a() {
         return this.x;
      }

      public void a(int $$0) {
         this.x = $$0;
      }

      @Override
      public void b(ftz $$0, int $$1, int $$2, float $$3) {
         super.b($$0, $$1, $$2, $$3);
         if (this.j && this.x != 0) {
            this.a($$0);
         }
      }

      private void a(ftz $$0) {
         $$0.a(gsn::H, d[Math.min(this.x, 6) - 1], this.F() + this.A() - 5, this.G() - 3, 8, 8);
      }
   }

   class h extends fma.e {
      private static final int f = 40;
      private static final int g = -12303292;
      private final xc h;
      private final int i;
      private final List<ful> j = new ArrayList<>();
      @Nullable
      private final fma.c k;
      private final fvh l;
      private final fya m;
      private final fxz n;
      private int o = -1;

      public h(final xc $$0, final int $$1, final fnf $$2) {
         this.h = $$0;
         this.i = $$1;
         this.m = new fya();
         int $$3 = 7;
         this.m.a(fva.a(20, 20, fma.b), 0, 0, this.m.b().a(7, 7, 0, 0));
         this.m.a(fyg.a(40), 0, 0);
         this.n = this.m.a(new fxz(0, 9 * 3 * ($$1 - 1)), 0, 1, this.m.b().c(7));
         this.l = this.n.a(new fvh($$0, fma.this.p).b(true), this.n.b().b().d());
         this.m.a(fyg.a(40), 0, 2);
         if ($$2.b()) {
            this.k = this.m.a(new fma.c($$1x -> fma.this.a($$2.c()), xc.c("mco.notification.dismiss")), 0, 2, this.m.b().c().a(0, 7, 7, 0));
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
      public void b(ftz $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         super.b($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
         $$0.b($$3 - 2, $$2 - 2, $$4, 36 * this.i - 2, -12303292);
      }

      @Override
      public void a(ftz $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
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
      public xc a() {
         return this.h;
      }
   }

   class i extends fma.e {
      private final fng f;
      private final fwb g = new fwb();

      public i(final fng $$0) {
         this.f = $$0;
         if (!$$0.j) {
            this.g.a(fvy.a(xc.c("mco.snapshot.parent.tooltip")));
         }
      }

      @Override
      public void a(ftz $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = this.b($$3);
         int $$11 = this.a($$2);
         fpv.a($$0, $$3, $$2, 32, this.f.g);
         xc $$12 = fma.a(this.f.v, -8355712);
         int $$13 = this.a($$3, $$4, $$12);
         this.a($$0, this.f.b(), $$10, $$11, $$13, -8355712);
         if ($$12 != xb.a) {
            $$0.b(fma.this.p, $$12, $$13, $$11, -8355712);
         }

         int $$14 = $$3;
         if (!this.f.i()) {
            $$14 = this.a(this.f, $$0, $$3, $$4, $$11);
         }

         this.a($$0, this.f.a(), $$10, this.c($$11), $$14, -8355712);
         this.a($$0, $$2, $$3, this.f);
         this.a(this.f, $$0, $$3 + $$4, $$2, $$6, $$7);
         this.g.a($$8, this.aN_(), new fyu($$3, $$2, $$4, $$5));
      }

      @Override
      public xc a() {
         return xc.b(Objects.requireNonNullElse(this.f.c, "unknown server"));
      }
   }

   class j extends fvj<fma.e> {
      public j() {
         super(frf.Q(), fma.this.n, fma.this.o, 0, 36);
      }

      public void a(@Nullable fma.e $$0) {
         super.a($$0);
         fma.this.H();
      }

      @Override
      public int a() {
         return 300;
      }

      void a(fma $$0, @Nullable fng $$1) {
         this.s();

         for (fnf $$2 : fma.this.aO) {
            if ($$2 instanceof fnf.c $$3) {
               this.a($$3, $$0);
               fma.this.a(List.of($$2));
               break;
            }
         }

         this.a($$1);
      }

      private void a(@Nullable fng $$0) {
         for (fng $$1 : fma.this.aJ) {
            this.b(fma.this.new a($$1));
         }

         for (fng $$2 : fma.this.aI) {
            fma.e $$3;
            if (fma.b() && !$$2.h()) {
               if ($$2.e == fng.c.c) {
                  continue;
               }

               $$3 = fma.this.new i($$2);
            } else {
               $$3 = fma.this.new l($$2);
            }

            this.b($$3);
            if ($$0 != null && $$0.a == $$2.a) {
               this.a($$3);
            }
         }
      }

      private void a(fnf.c $$0, fma $$1) {
         xc $$2 = $$0.d();
         int $$3 = fma.this.p.b($$2, 216);
         int $$4 = azq.e($$3 + 7, 36) - 1;
         this.b(fma.this.new h($$2, $$4 + 2, $$0));

         for (int $$5 = 0; $$5 < $$4; $$5++) {
            this.b(fma.this.new d());
         }

         this.b(fma.this.new b($$0.a($$1)));
      }
   }

   interface k<T> {
      T request(fmf var1) throws fob;
   }

   class l extends fma.e {
      private static final xc f = xc.c("mco.onlinePlayers");
      private static final int g = 9;
      private static final int h = 36;
      private final fng i;
      private final fwb j = new fwb();

      public l(final fng $$0) {
         this.i = $$0;
         boolean $$1 = fma.i($$0);
         if (fma.b() && $$1 && $$0.h()) {
            this.j.a(fvy.a(xc.a("mco.snapshot.paired", $$0.u)));
         } else if (!$$1 && $$0.f()) {
            this.j.a(fvy.a(xc.a("mco.snapshot.friendsRealm.downgrade", $$0.v)));
         }
      }

      @Override
      public void a(ftz $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         if (this.i.e == fng.c.c) {
            $$0.a(gsn::H, fma.c, $$3 - 5, $$2 + $$5 / 2 - 10, 40, 20);
            int $$10 = $$2 + $$5 / 2 - 9 / 2;
            $$0.b(fma.this.p, fma.N, $$3 + 40 - 2, $$10, 8388479);
         } else {
            this.a(this.i, $$0, $$3 + 36, $$2, $$6, $$7);
            fpv.a($$0, $$3, $$2, 32, this.i.g);
            this.a($$0, $$2, $$3, $$4);
            this.b($$0, $$2, $$3, $$4);
            this.a($$0, $$2, $$3, this.i);
            boolean $$11 = this.a($$0, $$2, $$3, $$4, $$5, $$6, $$7);
            this.a(this.i, $$0, $$3 + $$4, $$2, $$6, $$7);
            if (!$$11) {
               this.j.a($$8, this.aN_(), new fyu($$3, $$2, $$4, $$5));
            }
         }
      }

      private void a(ftz $$0, int $$1, int $$2, int $$3) {
         int $$4 = this.b($$2);
         int $$5 = this.a($$1);
         xc $$6 = fma.a(this.i.v, this.i.d());
         int $$7 = this.a($$2, $$3, $$6);
         this.a($$0, this.i.b(), $$4, $$5, $$7, -1);
         if ($$6 != xb.a && !this.i.i()) {
            $$0.b(fma.this.p, $$6, $$7, $$5, -8355712);
         }
      }

      private void b(ftz $$0, int $$1, int $$2, int $$3) {
         int $$4 = this.b($$2);
         int $$5 = this.a($$1);
         int $$6 = this.c($$5);
         String $$7 = this.i.c();
         boolean $$8 = this.i.i();
         if ($$8 && $$7 != null) {
            xc $$9 = xc.b($$7).a(o.h);
            $$0.b(fma.this.p, xc.a("mco.selectServer.minigameName", $$9).b(-171), $$4, $$6, -1);
         } else {
            int $$10 = this.a(this.i, $$0, $$2, $$3, $$5);
            this.a($$0, this.i.a(), $$4, this.c($$5), $$10, -8355712);
         }
      }

      private boolean a(ftz $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6) {
         List<ProfileResult> $$7 = fma.this.aK.a(this.i.a);
         if (!$$7.isEmpty()) {
            int $$8 = $$2 + $$3 - 21;
            int $$9 = $$1 + $$4 - 9 - 2;
            int $$10 = $$8;

            for (int $$11 = 0; $$11 < $$7.size(); $$11++) {
               $$10 -= 9 + ($$11 == 0 ? 0 : 3);
               fvm.a($$0, frf.Q().an().b($$7.get($$11).profile()), $$10, $$9, 9);
            }

            if ($$5 >= $$10 && $$5 <= $$8 && $$6 >= $$9 && $$6 <= $$9 + 9) {
               $$0.a(fma.this.p, List.of(f), Optional.of(new gco.a($$7)), $$5, $$6);
               return true;
            }
         }

         return false;
      }

      private void d() {
         fma.this.m.ak().a(hou.a(awr.Bv, 1.0F));
         fma.a(this.i, fma.this);
      }

      private void e() {
         fma.this.m.ak().a(hou.a(awr.Bv, 1.0F));
         fos $$0 = new fos(fma.this, this.i, this.i.h());
         fma.this.m.a($$0);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         if (this.i.e == fng.c.c) {
            this.e();
         } else if (fma.this.a(this.i)) {
            if (ag.c() - fma.this.aN < 250L && this.aN_()) {
               this.d();
            }

            fma.this.aN = ag.c();
         }

         return true;
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         if (fyp.a($$0)) {
            if (this.i.e == fng.c.c) {
               this.e();
               return true;
            }

            if (fma.this.a(this.i)) {
               this.d();
               return true;
            }
         }

         return super.a($$0, $$1, $$2);
      }

      @Override
      public xc a() {
         return (xc)(this.i.e == fng.c.c ? fma.Z : xc.a("narrator.select", Objects.requireNonNullElse(this.i.c, "unknown server")));
      }

      public fng c() {
         return this.i;
      }
   }
}
