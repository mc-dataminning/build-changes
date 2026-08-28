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

public class fhd extends hhw {
   static final alz b = alz.b("icon/info");
   static final alz c = alz.b("icon/new_realm");
   static final alz C = alz.b("realm_status/expired");
   static final alz D = alz.b("realm_status/expires_soon");
   static final alz E = alz.b("realm_status/open");
   static final alz F = alz.b("realm_status/closed");
   private static final alz G = alz.b("icon/invite");
   private static final alz H = alz.b("icon/news");
   public static final alz a = alz.b("hud/heart/hardcore_full");
   static final Logger I = LogUtils.getLogger();
   private static final alz J = alz.b("textures/gui/title/realms.png");
   private static final alz K = alz.b("textures/gui/realms/no_realms.png");
   private static final xv L = xv.c("menu.online");
   private static final xv M = xv.c("mco.selectServer.loading");
   static final xv N = xv.c("mco.selectServer.uninitialized");
   static final xv O = xv.c("mco.selectServer.expiredList");
   private static final xv P = xv.c("mco.selectServer.expiredRenew");
   static final xv Q = xv.c("mco.selectServer.expiredTrial");
   private static final xv R = xv.c("mco.selectServer.play");
   private static final xv S = xv.c("mco.selectServer.leave");
   private static final xv T = xv.c("mco.selectServer.configure");
   static final xv U = xv.c("mco.selectServer.expired");
   static final xv V = xv.c("mco.selectServer.expires.soon");
   static final xv W = xv.c("mco.selectServer.expires.day");
   static final xv X = xv.c("mco.selectServer.open");
   static final xv Y = xv.c("mco.selectServer.closed");
   static final xv Z = xv.a("gui.narrate.button", N);
   private static final xv aa = xv.c("mco.selectServer.noRealms");
   private static final xv ab = xv.c("mco.invites.nopending");
   private static final xv ac = xv.c("mco.invites.pending");
   private static final xv ad = xv.c("mco.compatibility.incompatible.popup.title");
   private static final xv ae = xv.c("mco.compatibility.incompatible.releaseType.popup.message");
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
   private final CompletableFuture<fhc.a> aw = fhc.a();
   @Nullable
   private fkp.c ax;
   private final Set<UUID> ay = new HashSet<>();
   private static boolean az;
   private final RateLimiter aA;
   private final fty aB;
   private fof aC;
   private fof aD;
   private fof aE;
   private fof aF;
   private fof aG;
   fhd.j aH;
   fjj aI;
   List<fij> aJ = List.of();
   fim aK = new fim();
   private volatile boolean aL;
   @Nullable
   private volatile String aM;
   long aN;
   final List<fii> aO = new ArrayList<>();
   private fof aP;
   private fhd.g aQ;
   private fhd.g aR;
   private fhd.f aS;
   @Nullable
   private fru aT;

   public fhd(fty $$0) {
      super(L);
      this.aB = $$0;
      this.aA = RateLimiter.create(0.016666668F);
   }

   @Override
   public void aT_() {
      this.aI = new fjj(this.m);
      this.aH = new fhd.j();
      xv $$0 = xv.c("mco.invites.title");
      this.aQ = new fhd.g($$0, G, $$1x -> this.m.a(new fkc(this, $$0)));
      xv $$1 = xv.c("mco.news");
      this.aR = new fhd.g($$1, H, $$0x -> {
         String $$1x = this.aM;
         if ($$1x != null) {
            fsv.a(this, $$1x);
            if (this.aR.a() != 0) {
               fkv.a $$2 = fkv.b();
               $$2.b = false;
               fkv.b($$2);
               this.aR.a(0);
            }
         }
      });
      this.aR.a(fpr.a($$1));
      this.aC = fof.a(R, $$0x -> a(this.O(), this)).a(100).a();
      this.aF = fof.a(T, $$0x -> this.f(this.O())).a(100).a();
      this.aE = fof.a(P, $$0x -> this.e(this.O())).a(100).a();
      this.aG = fof.a(S, $$0x -> this.g(this.O())).a(100).a();
      this.aP = fof.a(xv.c("mco.selectServer.purchase"), $$0x -> this.P()).b(100, 20).a();
      this.aD = fof.a(xu.k, $$0x -> this.aP_()).a(100).a();
      if (fhi.a == fhi.b.b) {
         this.c(fom.a(xv.b("Snapshot"), xv.b("Release")).a(5, 5, 100, 20, xv.b("Realm"), ($$0x, $$1x) -> {
            av = $$1x;
            this.aJ = List.of();
            this.K();
         }));
      }

      this.a(fhd.f.a);
      this.J();
      this.aw.thenAcceptAsync($$0x -> {
         fty $$1x = $$0x.a(this.aB);
         if ($$1x == null) {
            this.ax = this.a(this.m.bc());
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
         this.a(fhd.f.b);
      } else {
         this.a(fhd.f.c);
      }
   }

   private void a(fhd.f $$0) {
      if (this.aS != $$0) {
         if (this.aT != null) {
            this.aT.a($$1 -> this.e($$1));
         }

         this.aT = this.b($$0);
         this.aS = $$0;
         this.aT.a($$1 -> {
            fod var10000 = this.c($$1);
         });
         this.c();
      }
   }

   private fru b(fhd.f $$0) {
      fru $$1 = new fru(this);
      $$1.b(44);
      $$1.a(this.F());
      frv $$2 = this.c($$0);
      $$2.a();
      $$1.a($$2.w() + 22);
      $$1.b($$2);
      switch ($$0) {
         case a:
            $$1.c(new fov(this.p, M));
            break;
         case b:
            $$1.c(this.G());
            break;
         case c:
            $$1.c(this.aH);
      }

      return $$1;
   }

   private frv F() {
      int $$0 = 90;
      fry $$1 = fry.e().a(4);
      $$1.c().e();
      $$1.a(this.aQ);
      $$1.a(this.aR);
      fry $$2 = fry.e();
      $$2.c().e();
      $$2.a(frz.a(90));
      $$2.a(fot.a(128, 34, J, 128, 64), frx::b);
      $$2.a(new frs(90, 44)).a($$1, frx::c);
      return $$2;
   }

   private frv c(fhd.f $$0) {
      frt $$1 = new frt().c(4);
      frt.b $$2 = $$1.d(3);
      if ($$0 == fhd.f.c) {
         $$2.a(this.aC);
         $$2.a(this.aF);
         $$2.a(this.aE);
         $$2.a(this.aG);
      }

      $$2.a(this.aP);
      $$2.a(this.aD);
      return $$1;
   }

   private fry G() {
      fry $$0 = fry.d().a(8);
      $$0.c().b();
      $$0.a(fot.a(130, 64, K, 130, 64));
      foq $$1 = new foq(308, aa, this.p, false, 4);
      $$0.a($$1);
      return $$0;
   }

   void J() {
      fij $$0 = this.O();
      this.aP.j = this.aS != fhd.f.a;
      this.aC.j = $$0 != null && this.a($$0);
      this.aE.j = $$0 != null && this.b($$0);
      this.aG.j = $$0 != null && this.d($$0);
      this.aF.j = $$0 != null && this.c($$0);
   }

   boolean a(fij $$0) {
      boolean $$1 = !$$0.j && $$0.e == fij.c.b;
      return $$1 && ($$0.d() || $$0.e() || i($$0));
   }

   private boolean b(fij $$0) {
      return $$0.j && i($$0);
   }

   private boolean c(fij $$0) {
      return i($$0) && $$0.e != fij.c.c;
   }

   private boolean d(fij $$0) {
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
      fmg.Q().bc().d.a();
   }

   public static void g() {
      fmg.Q().bc().c.a();
   }

   private void K() {
      for (fkp.e<?> $$0 : this.m.bc().a()) {
         $$0.a();
      }
   }

   private fkp.c a(fjh $$0) {
      fkp.c $$1 = $$0.a.a();
      $$1.a($$0.c, $$0x -> {
         this.aI.a($$0x.a());
         this.aJ = $$0x.b();
         this.L();
         boolean $$1x = false;

         for (fij $$2 : this.aI) {
            if (this.j($$2)) {
               $$1x = true;
            }
         }

         if (!az && $$1x) {
            az = true;
            this.M();
         }
      });
      a(fhi::d, $$0x -> {
         this.aO.clear();
         this.aO.addAll($$0x);

         for (fii $$1x : $$0x) {
            if ($$1x instanceof fii.a $$2) {
               fpi $$3 = $$2.a(this, this::a);
               if ($$3 != null) {
                  this.m.a($$3);
                  this.a(List.of($$1x));
                  break;
               }
            }
         }

         if (!this.aO.isEmpty() && this.aS != fhd.f.a) {
            this.L();
         }
      });
      $$1.a($$0.d, $$0x -> {
         this.aQ.a($$0x);
         this.aQ.a($$0x == 0 ? fpr.a(ab) : fpr.a(ac));
         if ($$0x > 0 && this.aA.tryAcquire(1)) {
            this.m.aZ().c(xv.a("mco.configure.world.invite.narration", $$0x));
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

   void a(Collection<fii> $$0) {
      List<UUID> $$1 = new ArrayList<>($$0.size());

      for (fii $$2 : $$0) {
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

   private static <T> void a(fhd.k<T> $$0, Consumer<T> $$1) {
      fmg $$2 = fmg.Q();
      CompletableFuture.<T>supplyAsync(() -> {
         try {
            return $$0.request(fhi.a($$2));
         } catch (fje var3) {
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
      this.J();
   }

   private void M() {
      new Thread(() -> {
         List<fis> $$0 = fhh.a();
         fhi $$1 = fhi.a();
         fie $$2 = new fie();
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

      for (fij $$1 : this.aI) {
         if (this.j($$1)) {
            $$0.add($$1.a);
         }
      }

      return $$0;
   }

   private void e(@Nullable fij $$0) {
      if ($$0 != null) {
         String $$1 = aza.a($$0.b, this.m.X().b(), $$0.k);
         this.m.p.a($$1);
         ae.m().a($$1);
      }
   }

   private void f(@Nullable fij $$0) {
      if ($$0 != null && this.m.b($$0.g)) {
         this.m.a(new fjs(this, $$0.a));
      }
   }

   private void g(@Nullable fij $$0) {
      if ($$0 != null && !this.m.b($$0.g)) {
         xv $$1 = xv.c("mco.configure.world.leave.question.line1");
         this.m.a(fke.a(this, $$1, $$1x -> this.h($$0)));
      }
   }

   @Nullable
   private fij O() {
      return this.aH.g() instanceof fhd.l $$0 ? $$0.c() : null;
   }

   private void h(final fij $$0) {
      (new Thread("Realms-leave-server") {
         @Override
         public void run() {
            try {
               fhi $$0 = fhi.a();
               $$0.d($$0.a);
               fhd.this.m.execute(fhd::g);
            } catch (fje var2) {
               fhd.I.error("Couldn't configure world", var2);
               fhd.this.m.execute(() -> fhd.this.m.a(new fjw(var2, fhd.this)));
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
   public xv i() {
      return (xv)(switch (this.aS) {
         case a -> xu.a(super.i(), M);
         case b -> xu.a(super.i(), aa);
         case c -> super.i();
      });
   }

   @Override
   public void a(fns $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (b()) {
         $$0.b(this.p, "Minecraft " + ab.b().c(), 2, this.o - 10, -1);
      }

      if (this.aL && this.aP.j) {
         fjn.a($$0, this.aP);
      }

      switch (fhi.a) {
         case b:
            this.a($$0, "STAGE!", -256);
            break;
         case c:
            this.a($$0, "LOCAL!", 8388479);
      }
   }

   private void P() {
      this.m.a(new fjn(this, this.aL));
   }

   public static void a(@Nullable fij $$0, fty $$1) {
      a($$0, $$1, false);
   }

   public static void a(@Nullable fij $$0, fty $$1, boolean $$2) {
      if ($$0 != null) {
         if (!b() || $$2 || $$0.i()) {
            fmg.Q().a(new fjy($$1, new fle($$1, $$0)));
            return;
         }

         switch ($$0.w) {
            case f:
               fmg.Q().a(new fjy($$1, new fle($$1, $$0)));
               break;
            case a:
               a($$0, $$1, xv.c("mco.compatibility.unverifiable.title").b(-171), xv.c("mco.compatibility.unverifiable.message"), xu.j);
               break;
            case d:
               a(
                  $$0,
                  $$1,
                  xv.c("selectWorld.backupQuestion.downgrade").b(-2142128),
                  xv.a("mco.compatibility.downgrade.description", xv.b($$0.v).b(-171), xv.b(ab.b().c()).b(-171)),
                  xv.c("mco.compatibility.downgrade")
               );
               break;
            case e:
               b($$0, $$1);
               break;
            case b:
               fmg.Q()
                  .a(
                     new fpi.a($$1, ad)
                        .a(xv.a("mco.compatibility.incompatible.series.popup.message", xv.b($$0.v).b(-171), xv.b(ab.b().c()).b(-171)))
                        .a(xu.k, fpi::aP_)
                        .a()
                  );
               break;
            case c:
               fmg.Q().a(new fpi.a($$1, ad).a(ae).a(xu.k, fpi::aP_).a());
         }
      }
   }

   private static void a(fij $$0, fty $$1, xv $$2, xv $$3, xv $$4) {
      fmg.Q().a(new fpi.a($$1, $$2).a($$3).a($$4, $$2x -> {
         fmg.Q().a(new fjy($$1, new fle($$1, $$0)));
         g();
      }).a(xu.e, fpi::aP_).a());
   }

   private static void b(fij $$0, fty $$1) {
      xv $$2 = xv.c("mco.compatibility.upgrade.title").b(-171);
      xv $$3 = xv.c("mco.compatibility.upgrade");
      xv $$4 = xv.b($$0.v).b(-171);
      xv $$5 = xv.b(ab.b().c()).b(-171);
      xv $$6 = i($$0) ? xv.a("mco.compatibility.upgrade.description", $$4, $$5) : xv.a("mco.compatibility.upgrade.friend.description", $$4, $$5);
      a($$0, $$1, $$2, $$6, $$3);
   }

   public static xv a(String $$0, boolean $$1) {
      return a($$0, $$1 ? -8355712 : -2142128);
   }

   public static xv a(String $$0, int $$1) {
      return (xv)(StringUtils.isBlank($$0) ? xu.a : xv.b($$0).b($$1));
   }

   public static xv a(int $$0, boolean $$1) {
      return (xv)($$1 ? xv.c("gameMode.hardcore").b(-65536) : dhf.a($$0).d());
   }

   static boolean i(fij $$0) {
      return fmg.Q().b($$0.g);
   }

   private boolean j(fij $$0) {
      return i($$0) && !$$0.j;
   }

   private void a(fns $$0, String $$1, int $$2) {
      $$0.c().a();
      $$0.c().a((float)(this.n / 2 - 25), 20.0F, 0.0F);
      $$0.c().a(a.f.rotationDegrees(-20.0F));
      $$0.c().b(1.5F, 1.5F, 1.5F);
      $$0.a(this.p, $$1, 0, 0, $$2, false);
      $$0.c().b();
   }

   class a extends fhd.e {
      private static final xv f = xv.c("mco.snapshot.start");
      private static final int g = 5;
      private final fpu h = new fpu();
      private final fij i;

      public a(final fij $$0) {
         this.i = $$0;
         this.h.a(fpr.a(xv.c("mco.snapshot.tooltip")));
      }

      @Override
      public void a(fns $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(glv::C, fhd.c, $$3 - 5, $$2 + $$5 / 2 - 10, 40, 20);
         int $$10 = $$2 + $$5 / 2 - 9 / 2;
         $$0.b(fhd.this.p, f, $$3 + 40 - 2, $$10 - 5, 8388479);
         $$0.b(fhd.this.p, xv.a("mco.snapshot.description", Objects.requireNonNullElse(this.i.c, "unknown server")), $$3 + 40 - 2, $$10 + 5, -8355712);
         this.h.a($$8, this.aN_(), new fsn($$3, $$2, $$4, $$5));
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         this.c();
         return true;
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         if (fsi.a($$0)) {
            this.c();
            return true;
         } else {
            return super.a($$0, $$1, $$2);
         }
      }

      private void c() {
         fhd.this.m.ak().a(hfd.a(axf.AQ, 1.0F));
         fhd.this.m
            .a(
               new fpi.a(fhd.this, xv.c("mco.snapshot.createSnapshotPopup.title"))
                  .a(xv.c("mco.snapshot.createSnapshotPopup.text"))
                  .a(xv.c("mco.selectServer.create"), $$0 -> fhd.this.m.a(new fju(fhd.this, this.i, true)))
                  .a(xu.e, fpi::aP_)
                  .a()
            );
      }

      @Override
      public xv a() {
         return xv.a("gui.narrate.button", xu.a(f, xv.a("mco.snapshot.description", Objects.requireNonNullElse(this.i.c, "unknown server"))));
      }
   }

   class b extends fhd.e {
      private final fof f;

      public b(final fof $$0) {
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
      public void a(fns $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.f.c(fhd.this.n / 2 - 75, $$2 + 4);
         this.f.a($$0, $$6, $$7, $$9);
      }

      @Override
      public void a(boolean $$0) {
         super.a($$0);
         this.f.a($$0);
      }

      @Override
      public xv a() {
         return this.f.z();
      }
   }

   static class c extends fos {
      private static final fpt b = new fpt(alz.b("widget/cross_button"), alz.b("widget/cross_button_highlighted"));

      protected c(fof.c $$0, xv $$1) {
         super(0, 0, 14, 14, b, $$0);
         this.a(fpr.a($$1));
      }
   }

   class d extends fhd.e {
      @Override
      public void a(fns $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
      }

      @Override
      public xv a() {
         return xv.i();
      }
   }

   abstract class e extends fpc.a<fhd.e> {
      protected static final int b = 10;
      private static final int a = 28;
      protected static final int c = 7;
      protected static final int d = 2;

      protected void a(fij $$0, fns $$1, int $$2, int $$3, int $$4, int $$5) {
         int $$6 = $$2 - 10 - 7;
         int $$7 = $$3 + 2;
         if ($$0.j) {
            this.a($$1, $$6, $$7, $$4, $$5, fhd.C, () -> fhd.U);
         } else if ($$0.e == fij.c.a) {
            this.a($$1, $$6, $$7, $$4, $$5, fhd.F, () -> fhd.Y);
         } else if (fhd.i($$0) && $$0.l < 7) {
            this.a($$1, $$6, $$7, $$4, $$5, fhd.D, () -> {
               if ($$0.l <= 0) {
                  return fhd.V;
               } else {
                  return (xv)($$0.l == 1 ? fhd.W : xv.a("mco.selectServer.expires.days", $$0.l));
               }
            });
         } else if ($$0.e == fij.c.b) {
            this.a($$1, $$6, $$7, $$4, $$5, fhd.E, () -> fhd.X);
         }
      }

      private void a(fns $$0, int $$1, int $$2, int $$3, int $$4, alz $$5, Supplier<xv> $$6) {
         $$0.a(glv::C, $$5, $$1, $$2, 10, 28);
         if (fhd.this.aH.c((double)$$3, (double)$$4) && $$3 >= $$1 && $$3 <= $$1 + 10 && $$4 >= $$2 && $$4 <= $$2 + 28) {
            fhd.this.d($$6.get());
         }
      }

      protected void a(fns $$0, int $$1, int $$2, fij $$3) {
         int $$4 = this.b($$2);
         int $$5 = this.a($$1);
         int $$6 = this.d($$5);
         if (!fhd.i($$3)) {
            $$0.a(fhd.this.p, $$3.f, $$4, this.d($$5), -8355712, false);
         } else if ($$3.j) {
            xv $$7 = $$3.k ? fhd.Q : fhd.O;
            $$0.a(fhd.this.p, $$7, $$4, $$6, -2142128, false);
         }
      }

      protected void a(fns $$0, @Nullable String $$1, int $$2, int $$3, int $$4, int $$5) {
         if ($$1 != null) {
            int $$6 = $$4 - $$2;
            if (fhd.this.p.b($$1) > $$6) {
               String $$7 = fhd.this.p.a($$1, $$6 - fhd.this.p.b("... "));
               $$0.a(fhd.this.p, $$7 + "...", $$2, $$3, $$5, false);
            } else {
               $$0.a(fhd.this.p, $$1, $$2, $$3, $$5, false);
            }
         }
      }

      protected int a(int $$0, int $$1, xv $$2) {
         return $$0 + $$1 - fhd.this.p.a($$2) - 20;
      }

      protected int b(int $$0, int $$1, xv $$2) {
         return $$0 + $$1 - fhd.this.p.a($$2) - 20;
      }

      protected int a(fij $$0, fns $$1, int $$2, int $$3, int $$4) {
         boolean $$5 = $$0.n;
         int $$6 = $$0.o;
         int $$7 = $$2;
         if (dhf.c($$6)) {
            xv $$8 = fhd.a($$6, $$5);
            $$7 = this.b($$2, $$3, $$8);
            $$1.a(fhd.this.p, $$8, $$7, this.c($$4), -8355712, false);
         }

         if ($$5) {
            $$7 -= 10;
            $$1.a(glv::C, fhd.a, $$7, this.c($$4), 8, 8);
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

   static class g extends fpl.b {
      private static final alz[] d = new alz[]{
         alz.b("notification/1"),
         alz.b("notification/2"),
         alz.b("notification/3"),
         alz.b("notification/4"),
         alz.b("notification/5"),
         alz.b("notification/more")
      };
      private static final int u = Integer.MAX_VALUE;
      private static final int v = 20;
      private static final int w = 14;
      private int x;

      public g(xv $$0, alz $$1, fof.c $$2) {
         super(20, 20, $$0, 14, 14, $$1, $$2, null);
      }

      int a() {
         return this.x;
      }

      public void a(int $$0) {
         this.x = $$0;
      }

      @Override
      public void b(fns $$0, int $$1, int $$2, float $$3) {
         super.b($$0, $$1, $$2, $$3);
         if (this.j && this.x != 0) {
            this.a($$0);
         }
      }

      private void a(fns $$0) {
         $$0.a(glv::C, d[Math.min(this.x, 6) - 1], this.D() + this.y() - 5, this.E() - 3, 8, 8);
      }
   }

   class h extends fhd.e {
      private static final int f = 40;
      private static final int g = -12303292;
      private final xv h;
      private final int i;
      private final List<fod> j = new ArrayList<>();
      @Nullable
      private final fhd.c k;
      private final fpa l;
      private final frt m;
      private final frs n;
      private int o = -1;

      public h(final xv $$0, final int $$1, final fii $$2) {
         this.h = $$0;
         this.i = $$1;
         this.m = new frt();
         int $$3 = 7;
         this.m.a(fot.a(20, 20, fhd.b), 0, 0, this.m.b().a(7, 7, 0, 0));
         this.m.a(frz.a(40), 0, 0);
         this.n = this.m.a(new frs(0, 9 * 3 * ($$1 - 1)), 0, 1, this.m.b().c(7));
         this.l = this.n.a(new fpa($$0, fhd.this.p).b(true), this.n.b().b().d());
         this.m.a(frz.a(40), 0, 2);
         if ($$2.b()) {
            this.k = this.m.a(new fhd.c($$1x -> fhd.this.a($$2.c()), xv.c("mco.notification.dismiss")), 0, 2, this.m.b().c().a(0, 7, 7, 0));
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
      public void b(fns $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         super.b($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
         $$0.b($$3 - 2, $$2 - 2, $$4, 36 * this.i - 2, -12303292);
      }

      @Override
      public void a(fns $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
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
      public xv a() {
         return this.h;
      }
   }

   class i extends fhd.e {
      private final fij f;
      private final fpu g = new fpu();

      public i(final fij $$0) {
         this.f = $$0;
         if (!$$0.j) {
            this.g.a(fpr.a(xv.c("mco.snapshot.parent.tooltip")));
         }
      }

      @Override
      public void a(fns $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = this.b($$3);
         int $$11 = this.a($$2);
         fkx.a($$0, $$3, $$2, 32, this.f.g);
         xv $$12 = fhd.a(this.f.v, -8355712);
         int $$13 = this.a($$3, $$4, $$12);
         this.a($$0, this.f.b(), $$10, $$11, $$13, -8355712);
         if ($$12 != xu.a) {
            $$0.a(fhd.this.p, $$12, $$13, $$11, -8355712, false);
         }

         int $$14 = $$3;
         if (!this.f.i()) {
            $$14 = this.a(this.f, $$0, $$3, $$4, $$11);
         }

         this.a($$0, this.f.a(), $$10, this.c($$11), $$14, -8355712);
         this.a($$0, $$2, $$3, this.f);
         this.a(this.f, $$0, $$3 + $$4, $$2, $$6, $$7);
         this.g.a($$8, this.aN_(), new fsn($$3, $$2, $$4, $$5));
      }

      @Override
      public xv a() {
         return xv.b(Objects.requireNonNullElse(this.f.c, "unknown server"));
      }
   }

   class j extends fpc<fhd.e> {
      public j() {
         super(fmg.Q(), fhd.this.n, fhd.this.o, 0, 36);
      }

      public void a(@Nullable fhd.e $$0) {
         super.a($$0);
         fhd.this.J();
      }

      @Override
      public int a() {
         return 300;
      }

      void a(fhd $$0, @Nullable fij $$1) {
         this.j();

         for (fii $$2 : fhd.this.aO) {
            if ($$2 instanceof fii.c $$3) {
               this.a($$3, $$0);
               fhd.this.a(List.of($$2));
               break;
            }
         }

         this.a($$1);
      }

      private void a(@Nullable fij $$0) {
         for (fij $$1 : fhd.this.aJ) {
            this.b(fhd.this.new a($$1));
         }

         for (fij $$2 : fhd.this.aI) {
            fhd.e $$3;
            if (fhd.b() && !$$2.h()) {
               if ($$2.e == fij.c.c) {
                  continue;
               }

               $$3 = fhd.this.new i($$2);
            } else {
               $$3 = fhd.this.new l($$2);
            }

            this.b($$3);
            if ($$0 != null && $$0.a == $$2.a) {
               this.a($$3);
            }
         }
      }

      private void a(fii.c $$0, fhd $$1) {
         xv $$2 = $$0.d();
         int $$3 = fhd.this.p.b($$2, 216);
         int $$4 = bae.e($$3 + 7, 36) - 1;
         this.b(fhd.this.new h($$2, $$4 + 2, $$0));

         for (int $$5 = 0; $$5 < $$4; $$5++) {
            this.b(fhd.this.new d());
         }

         this.b(fhd.this.new b($$0.a($$1)));
      }
   }

   interface k<T> {
      T request(fhi var1) throws fje;
   }

   class l extends fhd.e {
      private static final xv f = xv.c("mco.onlinePlayers");
      private static final int g = 9;
      private static final int h = 36;
      private final fij i;
      private final fpu j = new fpu();

      public l(final fij $$0) {
         this.i = $$0;
         boolean $$1 = fhd.i($$0);
         if (fhd.b() && $$1 && $$0.h()) {
            this.j.a(fpr.a(xv.a("mco.snapshot.paired", $$0.u)));
         } else if (!$$1 && $$0.f()) {
            this.j.a(fpr.a(xv.a("mco.snapshot.friendsRealm.downgrade", $$0.v)));
         }
      }

      @Override
      public void a(fns $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         if (this.i.e == fij.c.c) {
            $$0.a(glv::C, fhd.c, $$3 - 5, $$2 + $$5 / 2 - 10, 40, 20);
            int $$10 = $$2 + $$5 / 2 - 9 / 2;
            $$0.b(fhd.this.p, fhd.N, $$3 + 40 - 2, $$10, 8388479);
         } else {
            this.a(this.i, $$0, $$3 + 36, $$2, $$6, $$7);
            fkx.a($$0, $$3, $$2, 32, this.i.g);
            this.a($$0, $$2, $$3, $$4);
            this.b($$0, $$2, $$3, $$4);
            this.a($$0, $$2, $$3, this.i);
            boolean $$11 = this.a($$0, $$2, $$3, $$4, $$5, $$6, $$7);
            this.a(this.i, $$0, $$3 + $$4, $$2, $$6, $$7);
            if (!$$11) {
               this.j.a($$8, this.aN_(), new fsn($$3, $$2, $$4, $$5));
            }
         }
      }

      private void a(fns $$0, int $$1, int $$2, int $$3) {
         int $$4 = this.b($$2);
         int $$5 = this.a($$1);
         xv $$6 = fhd.a(this.i.v, this.i.d());
         int $$7 = this.a($$2, $$3, $$6);
         this.a($$0, this.i.b(), $$4, $$5, $$7, -1);
         if ($$6 != xu.a && !this.i.i()) {
            $$0.a(fhd.this.p, $$6, $$7, $$5, -8355712, false);
         }
      }

      private void b(fns $$0, int $$1, int $$2, int $$3) {
         int $$4 = this.b($$2);
         int $$5 = this.a($$1);
         int $$6 = this.c($$5);
         String $$7 = this.i.c();
         boolean $$8 = this.i.i();
         if ($$8 && $$7 != null) {
            xv $$9 = xv.b($$7).a(n.h);
            $$0.a(fhd.this.p, xv.a("mco.selectServer.minigameName", $$9).b(-171), $$4, $$6, -1, false);
         } else {
            int $$10 = this.a(this.i, $$0, $$2, $$3, $$5);
            this.a($$0, this.i.a(), $$4, this.c($$5), $$10, -8355712);
         }
      }

      private boolean a(fns $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6) {
         List<ProfileResult> $$7 = fhd.this.aK.a(this.i.a);
         if (!$$7.isEmpty()) {
            int $$8 = $$2 + $$3 - 21;
            int $$9 = $$1 + $$4 - 9 - 2;
            int $$10 = $$8;

            for (int $$11 = 0; $$11 < $$7.size(); $$11++) {
               $$10 -= 9 + ($$11 == 0 ? 0 : 3);
               fpf.a($$0, fmg.Q().an().b($$7.get($$11).profile()), $$10, $$9, 9);
            }

            if ($$5 >= $$10 && $$5 <= $$8 && $$6 >= $$9 && $$6 <= $$9 + 9) {
               $$0.a(fhd.this.p, List.of(f), Optional.of(new fwf.a($$7)), $$5, $$6);
               return true;
            }
         }

         return false;
      }

      private void d() {
         fhd.this.m.ak().a(hfd.a(axf.AQ, 1.0F));
         fhd.a(this.i, fhd.this);
      }

      private void e() {
         fhd.this.m.ak().a(hfd.a(axf.AQ, 1.0F));
         fju $$0 = new fju(fhd.this, this.i, this.i.h());
         fhd.this.m.a($$0);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         if (this.i.e == fij.c.c) {
            this.e();
         } else if (fhd.this.a(this.i)) {
            if (ae.c() - fhd.this.aN < 250L && this.aN_()) {
               this.d();
            }

            fhd.this.aN = ae.c();
         }

         return true;
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         if (fsi.a($$0)) {
            if (this.i.e == fij.c.c) {
               this.e();
               return true;
            }

            if (fhd.this.a(this.i)) {
               this.d();
               return true;
            }
         }

         return super.a($$0, $$1, $$2);
      }

      @Override
      public xv a() {
         return (xv)(this.i.e == fij.c.c ? fhd.Z : xv.a("narrator.select", Objects.requireNonNullElse(this.i.c, "unknown server")));
      }

      public fij c() {
         return this.i;
      }
   }
}
