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

public class fjb extends hol {
   static final ale b = ale.b("icon/info");
   static final ale c = ale.b("icon/new_realm");
   static final ale C = ale.b("realm_status/expired");
   static final ale D = ale.b("realm_status/expires_soon");
   static final ale E = ale.b("realm_status/open");
   static final ale F = ale.b("realm_status/closed");
   private static final ale G = ale.b("icon/invite");
   private static final ale H = ale.b("icon/news");
   public static final ale a = ale.b("hud/heart/hardcore_full");
   static final Logger I = LogUtils.getLogger();
   private static final ale J = ale.b("textures/gui/title/realms.png");
   private static final ale K = ale.b("textures/gui/realms/no_realms.png");
   private static final ww L = ww.c("menu.online");
   private static final ww M = ww.c("mco.selectServer.loading");
   static final ww N = ww.c("mco.selectServer.uninitialized");
   static final ww O = ww.c("mco.selectServer.expiredList");
   private static final ww P = ww.c("mco.selectServer.expiredRenew");
   static final ww Q = ww.c("mco.selectServer.expiredTrial");
   private static final ww R = ww.c("mco.selectServer.play");
   private static final ww S = ww.c("mco.selectServer.leave");
   private static final ww T = ww.c("mco.selectServer.configure");
   static final ww U = ww.c("mco.selectServer.expired");
   static final ww V = ww.c("mco.selectServer.expires.soon");
   static final ww W = ww.c("mco.selectServer.expires.day");
   static final ww X = ww.c("mco.selectServer.open");
   static final ww Y = ww.c("mco.selectServer.closed");
   static final ww Z = ww.a("gui.narrate.button", N);
   private static final ww aa = ww.c("mco.selectServer.noRealms");
   private static final ww ab = ww.c("mco.invites.nopending");
   private static final ww ac = ww.c("mco.invites.pending");
   private static final ww ad = ww.c("mco.compatibility.incompatible.popup.title");
   private static final ww ae = ww.c("mco.compatibility.incompatible.releaseType.popup.message");
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
   private static final boolean au = !ab.b().g();
   private static boolean av = au;
   private final CompletableFuture<fja.a> aw = fja.a();
   @Nullable
   private fmn.c ax;
   private final Set<UUID> ay = new HashSet<>();
   private static boolean az;
   private final RateLimiter aA;
   private final fxi aB;
   private frq aC;
   private frq aD;
   private frq aE;
   private frq aF;
   private frq aG;
   fjb.j aH;
   flh aI;
   List<fkh> aJ = List.of();
   fkk aK = new fkk();
   private volatile boolean aL;
   @Nullable
   private volatile String aM;
   long aN;
   final List<fkg> aO = new ArrayList<>();
   private frq aP;
   private fjb.g aQ;
   private fjb.g aR;
   private fjb.f aS;
   @Nullable
   private fve aT;

   public fjb(fxi $$0) {
      super(L);
      this.aB = $$0;
      this.aA = RateLimiter.create(0.016666668F);
   }

   @Override
   public void aN_() {
      this.aI = new flh(this.m);
      this.aH = new fjb.j();
      ww $$0 = ww.c("mco.invites.title");
      this.aQ = new fjb.g($$0, G, $$1x -> this.m.a(new fma(this, $$0)));
      ww $$1 = ww.c("mco.news");
      this.aR = new fjb.g($$1, H, $$0x -> {
         String $$1x = this.aM;
         if ($$1x != null) {
            fwf.a(this, $$1x);
            if (this.aR.a() != 0) {
               fmt.a $$2 = fmt.b();
               $$2.b = false;
               fmt.b($$2);
               this.aR.a(0);
            }
         }
      });
      this.aR.a(ftb.a($$1));
      this.aC = frq.a(R, $$0x -> a(this.O(), this)).a(100).a();
      this.aF = frq.a(T, $$0x -> this.f(this.O())).a(100).a();
      this.aE = frq.a(P, $$0x -> this.e(this.O())).a(100).a();
      this.aG = frq.a(S, $$0x -> this.g(this.O())).a(100).a();
      this.aP = frq.a(ww.c("mco.selectServer.purchase"), $$0x -> this.P()).b(100, 20).a();
      this.aD = frq.a(wv.k, $$0x -> this.aK_()).a(100).a();
      if (fjg.a == fjg.b.b) {
         this.c(frx.a(ww.b("Snapshot"), ww.b("Release")).a(5, 5, 100, 20, ww.b("Realm"), ($$0x, $$1x) -> {
            av = $$1x;
            this.aJ = List.of();
            this.I();
         }));
      }

      this.a(fjb.f.a);
      this.H();
      this.aw.thenAcceptAsync($$0x -> {
         fxi $$1x = $$0x.a(this.aB);
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
   public void aK_() {
      this.m.a(this.aB);
   }

   private void E() {
      if (this.aI.a() && this.aJ.isEmpty() && this.aO.isEmpty()) {
         this.a(fjb.f.b);
      } else {
         this.a(fjb.f.c);
      }
   }

   private void a(fjb.f $$0) {
      if (this.aS != $$0) {
         if (this.aT != null) {
            this.aT.a($$1 -> this.e($$1));
         }

         this.aT = this.b($$0);
         this.aS = $$0;
         this.aT.a($$1 -> {
            fro var10000 = this.c($$1);
         });
         this.c();
      }
   }

   private fve b(fjb.f $$0) {
      fve $$1 = new fve(this);
      $$1.b(44);
      $$1.a(this.F());
      fvf $$2 = this.c($$0);
      $$2.a();
      $$1.a($$2.y() + 22);
      $$1.b($$2);
      switch ($$0) {
         case a:
            $$1.c(new fsf(this.p, M));
            break;
         case b:
            $$1.c(this.G());
            break;
         case c:
            $$1.c(this.aH);
      }

      return $$1;
   }

   private fvf F() {
      int $$0 = 90;
      fvi $$1 = fvi.e().a(4);
      $$1.c().e();
      $$1.a(this.aQ);
      $$1.a(this.aR);
      fvi $$2 = fvi.e();
      $$2.c().e();
      $$2.a(fvj.a(90));
      $$2.a(fsd.a(128, 34, J, 128, 64), fvh::b);
      $$2.a(new fvc(90, 44)).a($$1, fvh::c);
      return $$2;
   }

   private fvf c(fjb.f $$0) {
      fvd $$1 = new fvd().c(4);
      fvd.b $$2 = $$1.d(3);
      if ($$0 == fjb.f.c) {
         $$2.a(this.aC);
         $$2.a(this.aF);
         $$2.a(this.aE);
         $$2.a(this.aG);
      }

      $$2.a(this.aP);
      $$2.a(this.aD);
      return $$1;
   }

   private fvi G() {
      fvi $$0 = fvi.d().a(8);
      $$0.c().b();
      $$0.a(fsd.a(130, 64, K, 130, 64));
      fsb $$1 = new fsb(308, aa, this.p, false, 4);
      $$0.a($$1);
      return $$0;
   }

   void H() {
      fkh $$0 = this.O();
      this.aP.j = this.aS != fjb.f.a;
      this.aC.j = $$0 != null && this.a($$0);
      this.aE.j = $$0 != null && this.b($$0);
      this.aG.j = $$0 != null && this.d($$0);
      this.aF.j = $$0 != null && this.c($$0);
   }

   boolean a(fkh $$0) {
      boolean $$1 = !$$0.j && $$0.e == fkh.c.b;
      return $$1 && ($$0.d() || $$0.e() || i($$0));
   }

   private boolean b(fkh $$0) {
      return $$0.j && i($$0);
   }

   private boolean c(fkh $$0) {
      return i($$0) && $$0.e != fkh.c.c;
   }

   private boolean d(fkh $$0) {
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
      fof.Q().bb().d.a();
   }

   public static void g() {
      fof.Q().bb().c.a();
   }

   private void I() {
      for (fmn.e<?> $$0 : this.m.bb().a()) {
         $$0.a();
      }
   }

   private fmn.c a(flf $$0) {
      fmn.c $$1 = $$0.a.a();
      $$1.a($$0.c, $$0x -> {
         this.aI.a($$0x.a());
         this.aJ = $$0x.b();
         this.L();
         boolean $$1x = false;

         for (fkh $$2 : this.aI) {
            if (this.j($$2)) {
               $$1x = true;
            }
         }

         if (!az && $$1x) {
            az = true;
            this.M();
         }
      });
      a(fjg::d, $$0x -> {
         this.aO.clear();
         this.aO.addAll($$0x);

         for (fkg $$1x : $$0x) {
            if ($$1x instanceof fkg.a $$2) {
               fss $$3 = $$2.a(this, this::a);
               if ($$3 != null) {
                  this.m.a($$3);
                  this.a(List.of($$1x));
                  break;
               }
            }
         }

         if (!this.aO.isEmpty() && this.aS != fjb.f.a) {
            this.L();
         }
      });
      $$1.a($$0.d, $$0x -> {
         this.aQ.a($$0x);
         this.aQ.a($$0x == 0 ? ftb.a(ab) : ftb.a(ac));
         if ($$0x > 0 && this.aA.tryAcquire(1)) {
            this.m.aY().c(ww.a("mco.configure.world.invite.narration", $$0x));
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

   void a(Collection<fkg> $$0) {
      List<UUID> $$1 = new ArrayList<>($$0.size());

      for (fkg $$2 : $$0) {
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

   private static <T> void a(fjb.k<T> $$0, Consumer<T> $$1) {
      fof $$2 = fof.Q();
      CompletableFuture.<T>supplyAsync(() -> {
         try {
            return $$0.request(fjg.a($$2));
         } catch (flc var3) {
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
         List<fkq> $$0 = fjf.a();
         fjg $$1 = fjg.a();
         fkc $$2 = new fkc();
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

      for (fkh $$1 : this.aI) {
         if (this.j($$1)) {
            $$0.add($$1.a);
         }
      }

      return $$0;
   }

   private void e(@Nullable fkh $$0) {
      if ($$0 != null) {
         String $$1 = ayf.a($$0.b, this.m.X().b(), $$0.k);
         this.m.p.a($$1);
         af.n().a($$1);
      }
   }

   private void f(@Nullable fkh $$0) {
      if ($$0 != null && this.m.b($$0.g)) {
         this.m.a(new flq(this, $$0.a));
      }
   }

   private void g(@Nullable fkh $$0) {
      if ($$0 != null && !this.m.b($$0.g)) {
         ww $$1 = ww.c("mco.configure.world.leave.question.line1");
         this.m.a(fmc.a(this, $$1, $$1x -> this.h($$0)));
      }
   }

   @Nullable
   private fkh O() {
      return this.aH.p() instanceof fjb.l $$0 ? $$0.c() : null;
   }

   private void h(final fkh $$0) {
      (new Thread("Realms-leave-server") {
         @Override
         public void run() {
            try {
               fjg $$0 = fjg.a();
               $$0.d($$0.a);
               fjb.this.m.execute(fjb::g);
            } catch (flc var2) {
               fjb.I.error("Couldn't configure world", var2);
               fjb.this.m.execute(() -> fjb.this.m.a(new flu(var2, fjb.this)));
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
   public ww i() {
      return (ww)(switch (this.aS) {
         case a -> wv.a(super.i(), M);
         case b -> wv.a(super.i(), aa);
         case c -> super.i();
      });
   }

   @Override
   public void a(frc $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (b()) {
         $$0.b(this.p, "Minecraft " + ab.b().c(), 2, this.o - 10, -1);
      }

      if (this.aL && this.aP.j) {
         fll.a($$0, this.aP);
      }

      switch (fjg.a) {
         case b:
            this.a($$0, "STAGE!", -256);
            break;
         case c:
            this.a($$0, "LOCAL!", 8388479);
      }
   }

   private void P() {
      this.m.a(new fll(this, this.aL));
   }

   public static void a(@Nullable fkh $$0, fxi $$1) {
      a($$0, $$1, false);
   }

   public static void a(@Nullable fkh $$0, fxi $$1, boolean $$2) {
      if ($$0 != null) {
         if (!b() || $$2 || $$0.i()) {
            fof.Q().a(new flw($$1, new fnc($$1, $$0)));
            return;
         }

         switch ($$0.w) {
            case f:
               fof.Q().a(new flw($$1, new fnc($$1, $$0)));
               break;
            case a:
               a($$0, $$1, ww.c("mco.compatibility.unverifiable.title").b(-171), ww.c("mco.compatibility.unverifiable.message"), wv.j);
               break;
            case d:
               a(
                  $$0,
                  $$1,
                  ww.c("selectWorld.backupQuestion.downgrade").b(-2142128),
                  ww.a("mco.compatibility.downgrade.description", ww.b($$0.v).b(-171), ww.b(ab.b().c()).b(-171)),
                  ww.c("mco.compatibility.downgrade")
               );
               break;
            case e:
               b($$0, $$1);
               break;
            case b:
               fof.Q()
                  .a(
                     new fss.a($$1, ad)
                        .a(ww.a("mco.compatibility.incompatible.series.popup.message", ww.b($$0.v).b(-171), ww.b(ab.b().c()).b(-171)))
                        .a(wv.k, fss::aK_)
                        .a()
                  );
               break;
            case c:
               fof.Q().a(new fss.a($$1, ad).a(ae).a(wv.k, fss::aK_).a());
         }
      }
   }

   private static void a(fkh $$0, fxi $$1, ww $$2, ww $$3, ww $$4) {
      fof.Q().a(new fss.a($$1, $$2).a($$3).a($$4, $$2x -> {
         fof.Q().a(new flw($$1, new fnc($$1, $$0)));
         g();
      }).a(wv.e, fss::aK_).a());
   }

   private static void b(fkh $$0, fxi $$1) {
      ww $$2 = ww.c("mco.compatibility.upgrade.title").b(-171);
      ww $$3 = ww.c("mco.compatibility.upgrade");
      ww $$4 = ww.b($$0.v).b(-171);
      ww $$5 = ww.b(ab.b().c()).b(-171);
      ww $$6 = i($$0) ? ww.a("mco.compatibility.upgrade.description", $$4, $$5) : ww.a("mco.compatibility.upgrade.friend.description", $$4, $$5);
      a($$0, $$1, $$2, $$6, $$3);
   }

   public static ww a(String $$0, boolean $$1) {
      return a($$0, $$1 ? -8355712 : -2142128);
   }

   public static ww a(String $$0, int $$1) {
      return (ww)(StringUtils.isBlank($$0) ? wv.a : ww.b($$0).b($$1));
   }

   public static ww a(int $$0, boolean $$1) {
      return (ww)($$1 ? ww.c("gameMode.hardcore").b(-65536) : dim.a($$0).d());
   }

   static boolean i(fkh $$0) {
      return fof.Q().b($$0.g);
   }

   private boolean j(fkh $$0) {
      return i($$0) && !$$0.j;
   }

   private void a(frc $$0, String $$1, int $$2) {
      $$0.c().a();
      $$0.c().a((float)(this.n / 2 - 25), 20.0F, 0.0F);
      $$0.c().a(a.f.rotationDegrees(-20.0F));
      $$0.c().b(1.5F, 1.5F, 1.5F);
      $$0.b(this.p, $$1, 0, 0, $$2);
      $$0.c().b();
   }

   class a extends fjb.e {
      private static final ww f = ww.c("mco.snapshot.start");
      private static final int g = 5;
      private final fte h = new fte();
      private final fkh i;

      public a(final fkh $$0) {
         this.i = $$0;
         this.h.a(ftb.a(ww.c("mco.snapshot.tooltip")));
      }

      @Override
      public void a(frc $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(gpn::H, fjb.c, $$3 - 5, $$2 + $$5 / 2 - 10, 40, 20);
         int $$10 = $$2 + $$5 / 2 - 9 / 2;
         $$0.b(fjb.this.p, f, $$3 + 40 - 2, $$10 - 5, 8388479);
         $$0.b(fjb.this.p, ww.a("mco.snapshot.description", Objects.requireNonNullElse(this.i.c, "unknown server")), $$3 + 40 - 2, $$10 + 5, -8355712);
         this.h.a($$8, this.aI_(), new fvx($$3, $$2, $$4, $$5));
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         this.c();
         return true;
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         if (fvs.a($$0)) {
            this.c();
            return false;
         } else {
            return super.a($$0, $$1, $$2);
         }
      }

      private void c() {
         fjb.this.m.ak().a(hlr.a(awl.Bp, 1.0F));
         fjb.this.m
            .a(
               new fss.a(fjb.this, ww.c("mco.snapshot.createSnapshotPopup.title"))
                  .a(ww.c("mco.snapshot.createSnapshotPopup.text"))
                  .a(ww.c("mco.selectServer.create"), $$0 -> fjb.this.m.a(new fls(fjb.this, this.i, true)))
                  .a(wv.e, fss::aK_)
                  .a()
            );
      }

      @Override
      public ww a() {
         return ww.a("gui.narrate.button", wv.a(f, ww.a("mco.snapshot.description", Objects.requireNonNullElse(this.i.c, "unknown server"))));
      }
   }

   class b extends fjb.e {
      private final frq f;

      public b(final frq $$0) {
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
      public void a(frc $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.f.c(fjb.this.n / 2 - 75, $$2 + 4);
         this.f.a($$0, $$6, $$7, $$9);
      }

      @Override
      public void a(boolean $$0) {
         super.a($$0);
         this.f.a($$0);
      }

      @Override
      public ww a() {
         return this.f.B();
      }
   }

   static class c extends fsc {
      private static final ftd b = new ftd(ale.b("widget/cross_button"), ale.b("widget/cross_button_highlighted"));

      protected c(frq.c $$0, ww $$1) {
         super(0, 0, 14, 14, b, $$0);
         this.a(ftb.a($$1));
      }
   }

   class d extends fjb.e {
      @Override
      public void a(frc $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
      }

      @Override
      public ww a() {
         return ww.i();
      }
   }

   abstract class e extends fsm.a<fjb.e> {
      protected static final int b = 10;
      private static final int a = 28;
      protected static final int c = 7;
      protected static final int d = 2;

      protected void a(fkh $$0, frc $$1, int $$2, int $$3, int $$4, int $$5) {
         int $$6 = $$2 - 10 - 7;
         int $$7 = $$3 + 2;
         if ($$0.j) {
            this.a($$1, $$6, $$7, $$4, $$5, fjb.C, () -> fjb.U);
         } else if ($$0.e == fkh.c.a) {
            this.a($$1, $$6, $$7, $$4, $$5, fjb.F, () -> fjb.Y);
         } else if (fjb.i($$0) && $$0.l < 7) {
            this.a($$1, $$6, $$7, $$4, $$5, fjb.D, () -> {
               if ($$0.l <= 0) {
                  return fjb.V;
               } else {
                  return (ww)($$0.l == 1 ? fjb.W : ww.a("mco.selectServer.expires.days", $$0.l));
               }
            });
         } else if ($$0.e == fkh.c.b) {
            this.a($$1, $$6, $$7, $$4, $$5, fjb.E, () -> fjb.X);
         }
      }

      private void a(frc $$0, int $$1, int $$2, int $$3, int $$4, ale $$5, Supplier<ww> $$6) {
         $$0.a(gpn::H, $$5, $$1, $$2, 10, 28);
         if (fjb.this.aH.a_((double)$$3, (double)$$4) && $$3 >= $$1 && $$3 <= $$1 + 10 && $$4 >= $$2 && $$4 <= $$2 + 28) {
            fjb.this.d($$6.get());
         }
      }

      protected void a(frc $$0, int $$1, int $$2, fkh $$3) {
         int $$4 = this.b($$2);
         int $$5 = this.a($$1);
         int $$6 = this.d($$5);
         if (!fjb.i($$3)) {
            $$0.b(fjb.this.p, $$3.f, $$4, this.d($$5), -8355712);
         } else if ($$3.j) {
            ww $$7 = $$3.k ? fjb.Q : fjb.O;
            $$0.b(fjb.this.p, $$7, $$4, $$6, -2142128);
         }
      }

      protected void a(frc $$0, @Nullable String $$1, int $$2, int $$3, int $$4, int $$5) {
         if ($$1 != null) {
            int $$6 = $$4 - $$2;
            if (fjb.this.p.b($$1) > $$6) {
               String $$7 = fjb.this.p.a($$1, $$6 - fjb.this.p.b("... "));
               $$0.b(fjb.this.p, $$7 + "...", $$2, $$3, $$5);
            } else {
               $$0.b(fjb.this.p, $$1, $$2, $$3, $$5);
            }
         }
      }

      protected int a(int $$0, int $$1, ww $$2) {
         return $$0 + $$1 - fjb.this.p.a($$2) - 20;
      }

      protected int b(int $$0, int $$1, ww $$2) {
         return $$0 + $$1 - fjb.this.p.a($$2) - 20;
      }

      protected int a(fkh $$0, frc $$1, int $$2, int $$3, int $$4) {
         boolean $$5 = $$0.n;
         int $$6 = $$0.o;
         int $$7 = $$2;
         if (dim.c($$6)) {
            ww $$8 = fjb.a($$6, $$5);
            $$7 = this.b($$2, $$3, $$8);
            $$1.b(fjb.this.p, $$8, $$7, this.c($$4), -8355712);
         }

         if ($$5) {
            $$7 -= 10;
            $$1.a(gpn::H, fjb.a, $$7, this.c($$4), 8, 8);
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

   static class g extends fsv.b {
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

      public g(ww $$0, ale $$1, frq.c $$2) {
         super(20, 20, $$0, 14, 14, $$1, $$2, null);
      }

      int a() {
         return this.x;
      }

      public void a(int $$0) {
         this.x = $$0;
      }

      @Override
      public void b(frc $$0, int $$1, int $$2, float $$3) {
         super.b($$0, $$1, $$2, $$3);
         if (this.j && this.x != 0) {
            this.a($$0);
         }
      }

      private void a(frc $$0) {
         $$0.a(gpn::H, d[Math.min(this.x, 6) - 1], this.F() + this.A() - 5, this.G() - 3, 8, 8);
      }
   }

   class h extends fjb.e {
      private static final int f = 40;
      private static final int g = -12303292;
      private final ww h;
      private final int i;
      private final List<fro> j = new ArrayList<>();
      @Nullable
      private final fjb.c k;
      private final fsk l;
      private final fvd m;
      private final fvc n;
      private int o = -1;

      public h(final ww $$0, final int $$1, final fkg $$2) {
         this.h = $$0;
         this.i = $$1;
         this.m = new fvd();
         int $$3 = 7;
         this.m.a(fsd.a(20, 20, fjb.b), 0, 0, this.m.b().a(7, 7, 0, 0));
         this.m.a(fvj.a(40), 0, 0);
         this.n = this.m.a(new fvc(0, 9 * 3 * ($$1 - 1)), 0, 1, this.m.b().c(7));
         this.l = this.n.a(new fsk($$0, fjb.this.p).b(true), this.n.b().b().d());
         this.m.a(fvj.a(40), 0, 2);
         if ($$2.b()) {
            this.k = this.m.a(new fjb.c($$1x -> fjb.this.a($$2.c()), ww.c("mco.notification.dismiss")), 0, 2, this.m.b().c().a(0, 7, 7, 0));
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
      public void b(frc $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         super.b($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
         $$0.b($$3 - 2, $$2 - 2, $$4, 36 * this.i - 2, -12303292);
      }

      @Override
      public void a(frc $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
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
      public ww a() {
         return this.h;
      }
   }

   class i extends fjb.e {
      private final fkh f;
      private final fte g = new fte();

      public i(final fkh $$0) {
         this.f = $$0;
         if (!$$0.j) {
            this.g.a(ftb.a(ww.c("mco.snapshot.parent.tooltip")));
         }
      }

      @Override
      public void a(frc $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = this.b($$3);
         int $$11 = this.a($$2);
         fmv.a($$0, $$3, $$2, 32, this.f.g);
         ww $$12 = fjb.a(this.f.v, -8355712);
         int $$13 = this.a($$3, $$4, $$12);
         this.a($$0, this.f.b(), $$10, $$11, $$13, -8355712);
         if ($$12 != wv.a) {
            $$0.b(fjb.this.p, $$12, $$13, $$11, -8355712);
         }

         int $$14 = $$3;
         if (!this.f.i()) {
            $$14 = this.a(this.f, $$0, $$3, $$4, $$11);
         }

         this.a($$0, this.f.a(), $$10, this.c($$11), $$14, -8355712);
         this.a($$0, $$2, $$3, this.f);
         this.a(this.f, $$0, $$3 + $$4, $$2, $$6, $$7);
         this.g.a($$8, this.aI_(), new fvx($$3, $$2, $$4, $$5));
      }

      @Override
      public ww a() {
         return ww.b(Objects.requireNonNullElse(this.f.c, "unknown server"));
      }
   }

   class j extends fsm<fjb.e> {
      public j() {
         super(fof.Q(), fjb.this.n, fjb.this.o, 0, 36);
      }

      public void a(@Nullable fjb.e $$0) {
         super.a($$0);
         fjb.this.H();
      }

      @Override
      public int a() {
         return 300;
      }

      void a(fjb $$0, @Nullable fkh $$1) {
         this.s();

         for (fkg $$2 : fjb.this.aO) {
            if ($$2 instanceof fkg.c $$3) {
               this.a($$3, $$0);
               fjb.this.a(List.of($$2));
               break;
            }
         }

         this.a($$1);
      }

      private void a(@Nullable fkh $$0) {
         for (fkh $$1 : fjb.this.aJ) {
            this.b(fjb.this.new a($$1));
         }

         for (fkh $$2 : fjb.this.aI) {
            fjb.e $$3;
            if (fjb.b() && !$$2.h()) {
               if ($$2.e == fkh.c.c) {
                  continue;
               }

               $$3 = fjb.this.new i($$2);
            } else {
               $$3 = fjb.this.new l($$2);
            }

            this.b($$3);
            if ($$0 != null && $$0.a == $$2.a) {
               this.a($$3);
            }
         }
      }

      private void a(fkg.c $$0, fjb $$1) {
         ww $$2 = $$0.d();
         int $$3 = fjb.this.p.b($$2, 216);
         int $$4 = azk.e($$3 + 7, 36) - 1;
         this.b(fjb.this.new h($$2, $$4 + 2, $$0));

         for (int $$5 = 0; $$5 < $$4; $$5++) {
            this.b(fjb.this.new d());
         }

         this.b(fjb.this.new b($$0.a($$1)));
      }
   }

   interface k<T> {
      T request(fjg var1) throws flc;
   }

   class l extends fjb.e {
      private static final ww f = ww.c("mco.onlinePlayers");
      private static final int g = 9;
      private static final int h = 36;
      private final fkh i;
      private final fte j = new fte();

      public l(final fkh $$0) {
         this.i = $$0;
         boolean $$1 = fjb.i($$0);
         if (fjb.b() && $$1 && $$0.h()) {
            this.j.a(ftb.a(ww.a("mco.snapshot.paired", $$0.u)));
         } else if (!$$1 && $$0.f()) {
            this.j.a(ftb.a(ww.a("mco.snapshot.friendsRealm.downgrade", $$0.v)));
         }
      }

      @Override
      public void a(frc $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         if (this.i.e == fkh.c.c) {
            $$0.a(gpn::H, fjb.c, $$3 - 5, $$2 + $$5 / 2 - 10, 40, 20);
            int $$10 = $$2 + $$5 / 2 - 9 / 2;
            $$0.b(fjb.this.p, fjb.N, $$3 + 40 - 2, $$10, 8388479);
         } else {
            this.a(this.i, $$0, $$3 + 36, $$2, $$6, $$7);
            fmv.a($$0, $$3, $$2, 32, this.i.g);
            this.a($$0, $$2, $$3, $$4);
            this.b($$0, $$2, $$3, $$4);
            this.a($$0, $$2, $$3, this.i);
            boolean $$11 = this.a($$0, $$2, $$3, $$4, $$5, $$6, $$7);
            this.a(this.i, $$0, $$3 + $$4, $$2, $$6, $$7);
            if (!$$11) {
               this.j.a($$8, this.aI_(), new fvx($$3, $$2, $$4, $$5));
            }
         }
      }

      private void a(frc $$0, int $$1, int $$2, int $$3) {
         int $$4 = this.b($$2);
         int $$5 = this.a($$1);
         ww $$6 = fjb.a(this.i.v, this.i.d());
         int $$7 = this.a($$2, $$3, $$6);
         this.a($$0, this.i.b(), $$4, $$5, $$7, -1);
         if ($$6 != wv.a && !this.i.i()) {
            $$0.b(fjb.this.p, $$6, $$7, $$5, -8355712);
         }
      }

      private void b(frc $$0, int $$1, int $$2, int $$3) {
         int $$4 = this.b($$2);
         int $$5 = this.a($$1);
         int $$6 = this.c($$5);
         String $$7 = this.i.c();
         boolean $$8 = this.i.i();
         if ($$8 && $$7 != null) {
            ww $$9 = ww.b($$7).a(n.h);
            $$0.b(fjb.this.p, ww.a("mco.selectServer.minigameName", $$9).b(-171), $$4, $$6, -1);
         } else {
            int $$10 = this.a(this.i, $$0, $$2, $$3, $$5);
            this.a($$0, this.i.a(), $$4, this.c($$5), $$10, -8355712);
         }
      }

      private boolean a(frc $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6) {
         List<ProfileResult> $$7 = fjb.this.aK.a(this.i.a);
         if (!$$7.isEmpty()) {
            int $$8 = $$2 + $$3 - 21;
            int $$9 = $$1 + $$4 - 9 - 2;
            int $$10 = $$8;

            for (int $$11 = 0; $$11 < $$7.size(); $$11++) {
               $$10 -= 9 + ($$11 == 0 ? 0 : 3);
               fsp.a($$0, fof.Q().an().b($$7.get($$11).profile()), $$10, $$9, 9);
            }

            if ($$5 >= $$10 && $$5 <= $$8 && $$6 >= $$9 && $$6 <= $$9 + 9) {
               $$0.a(fjb.this.p, List.of(f), Optional.of(new fzr.a($$7)), $$5, $$6);
               return true;
            }
         }

         return false;
      }

      private void d() {
         fjb.this.m.ak().a(hlr.a(awl.Bp, 1.0F));
         fjb.a(this.i, fjb.this);
      }

      private void e() {
         fjb.this.m.ak().a(hlr.a(awl.Bp, 1.0F));
         fls $$0 = new fls(fjb.this, this.i, this.i.h());
         fjb.this.m.a($$0);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         if (this.i.e == fkh.c.c) {
            this.e();
         } else if (fjb.this.a(this.i)) {
            if (af.c() - fjb.this.aN < 250L && this.aI_()) {
               this.d();
            }

            fjb.this.aN = af.c();
         }

         return true;
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         if (fvs.a($$0)) {
            if (this.i.e == fkh.c.c) {
               this.e();
               return true;
            }

            if (fjb.this.a(this.i)) {
               this.d();
               return true;
            }
         }

         return super.a($$0, $$1, $$2);
      }

      @Override
      public ww a() {
         return (ww)(this.i.e == fkh.c.c ? fjb.Z : ww.a("narrator.select", Objects.requireNonNullElse(this.i.c, "unknown server")));
      }

      public fkh c() {
         return this.i;
      }
   }
}
