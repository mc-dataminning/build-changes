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

public class fgw extends hhs {
   static final alp b = alp.b("icon/info");
   static final alp c = alp.b("icon/new_realm");
   static final alp C = alp.b("realm_status/expired");
   static final alp D = alp.b("realm_status/expires_soon");
   static final alp E = alp.b("realm_status/open");
   static final alp F = alp.b("realm_status/closed");
   private static final alp G = alp.b("icon/invite");
   private static final alp H = alp.b("icon/news");
   public static final alp a = alp.b("hud/heart/hardcore_full");
   static final Logger I = LogUtils.getLogger();
   private static final alp J = alp.b("textures/gui/title/realms.png");
   private static final alp K = alp.b("textures/gui/realms/no_realms.png");
   private static final xk L = xk.c("menu.online");
   private static final xk M = xk.c("mco.selectServer.loading");
   static final xk N = xk.c("mco.selectServer.uninitialized");
   static final xk O = xk.c("mco.selectServer.expiredList");
   private static final xk P = xk.c("mco.selectServer.expiredRenew");
   static final xk Q = xk.c("mco.selectServer.expiredTrial");
   private static final xk R = xk.c("mco.selectServer.play");
   private static final xk S = xk.c("mco.selectServer.leave");
   private static final xk T = xk.c("mco.selectServer.configure");
   static final xk U = xk.c("mco.selectServer.expired");
   static final xk V = xk.c("mco.selectServer.expires.soon");
   static final xk W = xk.c("mco.selectServer.expires.day");
   static final xk X = xk.c("mco.selectServer.open");
   static final xk Y = xk.c("mco.selectServer.closed");
   static final xk Z = xk.a("gui.narrate.button", N);
   private static final xk aa = xk.c("mco.selectServer.noRealms");
   private static final xk ab = xk.c("mco.invites.nopending");
   private static final xk ac = xk.c("mco.invites.pending");
   private static final xk ad = xk.c("mco.compatibility.incompatible.popup.title");
   private static final xk ae = xk.c("mco.compatibility.incompatible.releaseType.popup.message");
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
   private final CompletableFuture<fgv.a> aw = fgv.a();
   @Nullable
   private fki.c ax;
   private final Set<UUID> ay = new HashSet<>();
   private static boolean az;
   private final RateLimiter aA;
   private final ftr aB;
   private fny aC;
   private fny aD;
   private fny aE;
   private fny aF;
   private fny aG;
   fgw.j aH;
   fjc aI;
   List<fic> aJ = List.of();
   fif aK = new fif();
   private volatile boolean aL;
   @Nullable
   private volatile String aM;
   long aN;
   final List<fib> aO = new ArrayList<>();
   private fny aP;
   private fgw.g aQ;
   private fgw.g aR;
   private fgw.f aS;
   @Nullable
   private frn aT;

   public fgw(ftr $$0) {
      super(L);
      this.aB = $$0;
      this.aA = RateLimiter.create(0.016666668F);
   }

   @Override
   public void aT_() {
      this.aI = new fjc(this.m);
      this.aH = new fgw.j();
      xk $$0 = xk.c("mco.invites.title");
      this.aQ = new fgw.g($$0, G, $$1x -> this.m.a(new fjv(this, $$0)));
      xk $$1 = xk.c("mco.news");
      this.aR = new fgw.g($$1, H, $$0x -> {
         String $$1x = this.aM;
         if ($$1x != null) {
            fso.a(this, $$1x);
            if (this.aR.a() != 0) {
               fko.a $$2 = fko.b();
               $$2.b = false;
               fko.b($$2);
               this.aR.a(0);
            }
         }
      });
      this.aR.a(fpk.a($$1));
      this.aC = fny.a(R, $$0x -> a(this.O(), this)).a(100).a();
      this.aF = fny.a(T, $$0x -> this.f(this.O())).a(100).a();
      this.aE = fny.a(P, $$0x -> this.e(this.O())).a(100).a();
      this.aG = fny.a(S, $$0x -> this.g(this.O())).a(100).a();
      this.aP = fny.a(xk.c("mco.selectServer.purchase"), $$0x -> this.P()).b(100, 20).a();
      this.aD = fny.a(xj.k, $$0x -> this.aP_()).a(100).a();
      if (fhb.a == fhb.b.b) {
         this.c(fof.a(xk.b("Snapshot"), xk.b("Release")).a(5, 5, 100, 20, xk.b("Realm"), ($$0x, $$1x) -> {
            av = $$1x;
            this.aJ = List.of();
            this.K();
         }));
      }

      this.a(fgw.f.a);
      this.J();
      this.aw.thenAcceptAsync($$0x -> {
         ftr $$1x = $$0x.a(this.aB);
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
         this.a(fgw.f.b);
      } else {
         this.a(fgw.f.c);
      }
   }

   private void a(fgw.f $$0) {
      if (this.aS != $$0) {
         if (this.aT != null) {
            this.aT.a($$1 -> this.e($$1));
         }

         this.aT = this.b($$0);
         this.aS = $$0;
         this.aT.a($$1 -> {
            fnw var10000 = this.c($$1);
         });
         this.c();
      }
   }

   private frn b(fgw.f $$0) {
      frn $$1 = new frn(this);
      $$1.b(44);
      $$1.a(this.F());
      fro $$2 = this.c($$0);
      $$2.a();
      $$1.a($$2.w() + 22);
      $$1.b($$2);
      switch ($$0) {
         case a:
            $$1.c(new fon(this.p, M));
            break;
         case b:
            $$1.c(this.G());
            break;
         case c:
            $$1.c(this.aH);
      }

      return $$1;
   }

   private fro F() {
      int $$0 = 90;
      frr $$1 = frr.e().a(4);
      $$1.c().e();
      $$1.a(this.aQ);
      $$1.a(this.aR);
      frr $$2 = frr.e();
      $$2.c().e();
      $$2.a(frs.a(90));
      $$2.a(fol.a(128, 34, J, 128, 64), frq::b);
      $$2.a(new frl(90, 44)).a($$1, frq::c);
      return $$2;
   }

   private fro c(fgw.f $$0) {
      frm $$1 = new frm().c(4);
      frm.b $$2 = $$1.d(3);
      if ($$0 == fgw.f.c) {
         $$2.a(this.aC);
         $$2.a(this.aF);
         $$2.a(this.aE);
         $$2.a(this.aG);
      }

      $$2.a(this.aP);
      $$2.a(this.aD);
      return $$1;
   }

   private frr G() {
      frr $$0 = frr.d().a(8);
      $$0.c().b();
      $$0.a(fol.a(130, 64, K, 130, 64));
      foj $$1 = new foj(308, aa, this.p, false, 4);
      $$0.a($$1);
      return $$0;
   }

   void J() {
      fic $$0 = this.O();
      this.aP.j = this.aS != fgw.f.a;
      this.aC.j = $$0 != null && this.a($$0);
      this.aE.j = $$0 != null && this.b($$0);
      this.aG.j = $$0 != null && this.d($$0);
      this.aF.j = $$0 != null && this.c($$0);
   }

   boolean a(fic $$0) {
      boolean $$1 = !$$0.j && $$0.e == fic.c.b;
      return $$1 && ($$0.d() || $$0.e() || i($$0));
   }

   private boolean b(fic $$0) {
      return $$0.j && i($$0);
   }

   private boolean c(fic $$0) {
      return i($$0) && $$0.e != fic.c.c;
   }

   private boolean d(fic $$0) {
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
      flz.Q().bc().d.a();
   }

   public static void g() {
      flz.Q().bc().c.a();
   }

   private void K() {
      for (fki.e<?> $$0 : this.m.bc().a()) {
         $$0.a();
      }
   }

   private fki.c a(fja $$0) {
      fki.c $$1 = $$0.a.a();
      $$1.a($$0.c, $$0x -> {
         this.aI.a($$0x.a());
         this.aJ = $$0x.b();
         this.L();
         boolean $$1x = false;

         for (fic $$2 : this.aI) {
            if (this.j($$2)) {
               $$1x = true;
            }
         }

         if (!az && $$1x) {
            az = true;
            this.M();
         }
      });
      a(fhb::d, $$0x -> {
         this.aO.clear();
         this.aO.addAll($$0x);

         for (fib $$1x : $$0x) {
            if ($$1x instanceof fib.a $$2) {
               fpb $$3 = $$2.a(this, this::a);
               if ($$3 != null) {
                  this.m.a($$3);
                  this.a(List.of($$1x));
                  break;
               }
            }
         }

         if (!this.aO.isEmpty() && this.aS != fgw.f.a) {
            this.L();
         }
      });
      $$1.a($$0.d, $$0x -> {
         this.aQ.a($$0x);
         this.aQ.a($$0x == 0 ? fpk.a(ab) : fpk.a(ac));
         if ($$0x > 0 && this.aA.tryAcquire(1)) {
            this.m.aZ().c(xk.a("mco.configure.world.invite.narration", $$0x));
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

   void a(Collection<fib> $$0) {
      List<UUID> $$1 = new ArrayList<>($$0.size());

      for (fib $$2 : $$0) {
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

   private static <T> void a(fgw.k<T> $$0, Consumer<T> $$1) {
      flz $$2 = flz.Q();
      CompletableFuture.<T>supplyAsync(() -> {
         try {
            return $$0.request(fhb.a($$2));
         } catch (fix var3) {
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
         List<fil> $$0 = fha.a();
         fhb $$1 = fhb.a();
         fhx $$2 = new fhx();
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

      for (fic $$1 : this.aI) {
         if (this.j($$1)) {
            $$0.add($$1.a);
         }
      }

      return $$0;
   }

   private void e(@Nullable fic $$0) {
      if ($$0 != null) {
         String $$1 = ayq.a($$0.b, this.m.X().b(), $$0.k);
         this.m.p.a($$1);
         ae.m().a($$1);
      }
   }

   private void f(@Nullable fic $$0) {
      if ($$0 != null && this.m.b($$0.g)) {
         this.m.a(new fjl(this, $$0.a));
      }
   }

   private void g(@Nullable fic $$0) {
      if ($$0 != null && !this.m.b($$0.g)) {
         xk $$1 = xk.c("mco.configure.world.leave.question.line1");
         this.m.a(fjx.a(this, $$1, $$1x -> this.h($$0)));
      }
   }

   @Nullable
   private fic O() {
      return this.aH.g() instanceof fgw.l $$0 ? $$0.c() : null;
   }

   private void h(final fic $$0) {
      (new Thread("Realms-leave-server") {
         @Override
         public void run() {
            try {
               fhb $$0 = fhb.a();
               $$0.d($$0.a);
               fgw.this.m.execute(fgw::g);
            } catch (fix var2) {
               fgw.I.error("Couldn't configure world", var2);
               fgw.this.m.execute(() -> fgw.this.m.a(new fjp(var2, fgw.this)));
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
   public xk i() {
      return (xk)(switch (this.aS) {
         case a -> xj.a(super.i(), M);
         case b -> xj.a(super.i(), aa);
         case c -> super.i();
      });
   }

   @Override
   public void a(fnl $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (b()) {
         $$0.b(this.p, "Minecraft " + ab.b().c(), 2, this.o - 10, -1);
      }

      if (this.aL && this.aP.j) {
         fjg.a($$0, this.aP);
      }

      switch (fhb.a) {
         case b:
            this.a($$0, "STAGE!", -256);
            break;
         case c:
            this.a($$0, "LOCAL!", 8388479);
      }
   }

   private void P() {
      this.m.a(new fjg(this, this.aL));
   }

   public static void a(@Nullable fic $$0, ftr $$1) {
      a($$0, $$1, false);
   }

   public static void a(@Nullable fic $$0, ftr $$1, boolean $$2) {
      if ($$0 != null) {
         if (!b() || $$2 || $$0.i()) {
            flz.Q().a(new fjr($$1, new fkx($$1, $$0)));
            return;
         }

         switch ($$0.w) {
            case f:
               flz.Q().a(new fjr($$1, new fkx($$1, $$0)));
               break;
            case a:
               a($$0, $$1, xk.c("mco.compatibility.unverifiable.title").b(-171), xk.c("mco.compatibility.unverifiable.message"), xj.j);
               break;
            case d:
               a(
                  $$0,
                  $$1,
                  xk.c("selectWorld.backupQuestion.downgrade").b(-2142128),
                  xk.a("mco.compatibility.downgrade.description", xk.b($$0.v).b(-171), xk.b(ab.b().c()).b(-171)),
                  xk.c("mco.compatibility.downgrade")
               );
               break;
            case e:
               b($$0, $$1);
               break;
            case b:
               flz.Q()
                  .a(
                     new fpb.a($$1, ad)
                        .a(xk.a("mco.compatibility.incompatible.series.popup.message", xk.b($$0.v).b(-171), xk.b(ab.b().c()).b(-171)))
                        .a(xj.k, fpb::aP_)
                        .a()
                  );
               break;
            case c:
               flz.Q().a(new fpb.a($$1, ad).a(ae).a(xj.k, fpb::aP_).a());
         }
      }
   }

   private static void a(fic $$0, ftr $$1, xk $$2, xk $$3, xk $$4) {
      flz.Q().a(new fpb.a($$1, $$2).a($$3).a($$4, $$2x -> {
         flz.Q().a(new fjr($$1, new fkx($$1, $$0)));
         g();
      }).a(xj.e, fpb::aP_).a());
   }

   private static void b(fic $$0, ftr $$1) {
      xk $$2 = xk.c("mco.compatibility.upgrade.title").b(-171);
      xk $$3 = xk.c("mco.compatibility.upgrade");
      xk $$4 = xk.b($$0.v).b(-171);
      xk $$5 = xk.b(ab.b().c()).b(-171);
      xk $$6 = i($$0) ? xk.a("mco.compatibility.upgrade.description", $$4, $$5) : xk.a("mco.compatibility.upgrade.friend.description", $$4, $$5);
      a($$0, $$1, $$2, $$6, $$3);
   }

   public static xk a(String $$0, boolean $$1) {
      return a($$0, $$1 ? -8355712 : -2142128);
   }

   public static xk a(String $$0, int $$1) {
      return (xk)(StringUtils.isBlank($$0) ? xj.a : xk.b($$0).b($$1));
   }

   public static xk a(int $$0, boolean $$1) {
      return (xk)($$1 ? xk.c("gameMode.hardcore").b(-65536) : dgw.a($$0).d());
   }

   static boolean i(fic $$0) {
      return flz.Q().b($$0.g);
   }

   private boolean j(fic $$0) {
      return i($$0) && !$$0.j;
   }

   private void a(fnl $$0, String $$1, int $$2) {
      $$0.c().a();
      $$0.c().a((float)(this.n / 2 - 25), 20.0F, 0.0F);
      $$0.c().a(a.f.rotationDegrees(-20.0F));
      $$0.c().b(1.5F, 1.5F, 1.5F);
      $$0.b(this.p, $$1, 0, 0, $$2);
      $$0.c().b();
   }

   class a extends fgw.e {
      private static final xk f = xk.c("mco.snapshot.start");
      private static final int g = 5;
      private final fpn h = new fpn();
      private final fic i;

      public a(final fic $$0) {
         this.i = $$0;
         this.h.a(fpk.a(xk.c("mco.snapshot.tooltip")));
      }

      @Override
      public void a(fnl $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(glq::H, fgw.c, $$3 - 5, $$2 + $$5 / 2 - 10, 40, 20);
         int $$10 = $$2 + $$5 / 2 - 9 / 2;
         $$0.b(fgw.this.p, f, $$3 + 40 - 2, $$10 - 5, 8388479);
         $$0.b(fgw.this.p, xk.a("mco.snapshot.description", Objects.requireNonNullElse(this.i.c, "unknown server")), $$3 + 40 - 2, $$10 + 5, -8355712);
         this.h.a($$8, this.aN_(), new fsg($$3, $$2, $$4, $$5));
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         this.c();
         return true;
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         if (fsb.a($$0)) {
            this.c();
            return true;
         } else {
            return super.a($$0, $$1, $$2);
         }
      }

      private void c() {
         fgw.this.m.ak().a(hey.a(awv.Bg, 1.0F));
         fgw.this.m
            .a(
               new fpb.a(fgw.this, xk.c("mco.snapshot.createSnapshotPopup.title"))
                  .a(xk.c("mco.snapshot.createSnapshotPopup.text"))
                  .a(xk.c("mco.selectServer.create"), $$0 -> fgw.this.m.a(new fjn(fgw.this, this.i, true)))
                  .a(xj.e, fpb::aP_)
                  .a()
            );
      }

      @Override
      public xk a() {
         return xk.a("gui.narrate.button", xj.a(f, xk.a("mco.snapshot.description", Objects.requireNonNullElse(this.i.c, "unknown server"))));
      }
   }

   class b extends fgw.e {
      private final fny f;

      public b(final fny $$0) {
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
      public void a(fnl $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.f.c(fgw.this.n / 2 - 75, $$2 + 4);
         this.f.a($$0, $$6, $$7, $$9);
      }

      @Override
      public void a(boolean $$0) {
         super.a($$0);
         this.f.a($$0);
      }

      @Override
      public xk a() {
         return this.f.z();
      }
   }

   static class c extends fok {
      private static final fpm b = new fpm(alp.b("widget/cross_button"), alp.b("widget/cross_button_highlighted"));

      protected c(fny.c $$0, xk $$1) {
         super(0, 0, 14, 14, b, $$0);
         this.a(fpk.a($$1));
      }
   }

   class d extends fgw.e {
      @Override
      public void a(fnl $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
      }

      @Override
      public xk a() {
         return xk.i();
      }
   }

   abstract class e extends fov.a<fgw.e> {
      protected static final int b = 10;
      private static final int a = 28;
      protected static final int c = 7;
      protected static final int d = 2;

      protected void a(fic $$0, fnl $$1, int $$2, int $$3, int $$4, int $$5) {
         int $$6 = $$2 - 10 - 7;
         int $$7 = $$3 + 2;
         if ($$0.j) {
            this.a($$1, $$6, $$7, $$4, $$5, fgw.C, () -> fgw.U);
         } else if ($$0.e == fic.c.a) {
            this.a($$1, $$6, $$7, $$4, $$5, fgw.F, () -> fgw.Y);
         } else if (fgw.i($$0) && $$0.l < 7) {
            this.a($$1, $$6, $$7, $$4, $$5, fgw.D, () -> {
               if ($$0.l <= 0) {
                  return fgw.V;
               } else {
                  return (xk)($$0.l == 1 ? fgw.W : xk.a("mco.selectServer.expires.days", $$0.l));
               }
            });
         } else if ($$0.e == fic.c.b) {
            this.a($$1, $$6, $$7, $$4, $$5, fgw.E, () -> fgw.X);
         }
      }

      private void a(fnl $$0, int $$1, int $$2, int $$3, int $$4, alp $$5, Supplier<xk> $$6) {
         $$0.a(glq::H, $$5, $$1, $$2, 10, 28);
         if (fgw.this.aH.c((double)$$3, (double)$$4) && $$3 >= $$1 && $$3 <= $$1 + 10 && $$4 >= $$2 && $$4 <= $$2 + 28) {
            fgw.this.d($$6.get());
         }
      }

      protected void a(fnl $$0, int $$1, int $$2, fic $$3) {
         int $$4 = this.b($$2);
         int $$5 = this.a($$1);
         int $$6 = this.d($$5);
         if (!fgw.i($$3)) {
            $$0.b(fgw.this.p, $$3.f, $$4, this.d($$5), -8355712);
         } else if ($$3.j) {
            xk $$7 = $$3.k ? fgw.Q : fgw.O;
            $$0.b(fgw.this.p, $$7, $$4, $$6, -2142128);
         }
      }

      protected void a(fnl $$0, @Nullable String $$1, int $$2, int $$3, int $$4, int $$5) {
         if ($$1 != null) {
            int $$6 = $$4 - $$2;
            if (fgw.this.p.b($$1) > $$6) {
               String $$7 = fgw.this.p.a($$1, $$6 - fgw.this.p.b("... "));
               $$0.b(fgw.this.p, $$7 + "...", $$2, $$3, $$5);
            } else {
               $$0.b(fgw.this.p, $$1, $$2, $$3, $$5);
            }
         }
      }

      protected int a(int $$0, int $$1, xk $$2) {
         return $$0 + $$1 - fgw.this.p.a($$2) - 20;
      }

      protected int b(int $$0, int $$1, xk $$2) {
         return $$0 + $$1 - fgw.this.p.a($$2) - 20;
      }

      protected int a(fic $$0, fnl $$1, int $$2, int $$3, int $$4) {
         boolean $$5 = $$0.n;
         int $$6 = $$0.o;
         int $$7 = $$2;
         if (dgw.c($$6)) {
            xk $$8 = fgw.a($$6, $$5);
            $$7 = this.b($$2, $$3, $$8);
            $$1.b(fgw.this.p, $$8, $$7, this.c($$4), -8355712);
         }

         if ($$5) {
            $$7 -= 10;
            $$1.a(glq::H, fgw.a, $$7, this.c($$4), 8, 8);
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

   static class g extends fpe.b {
      private static final alp[] d = new alp[]{
         alp.b("notification/1"),
         alp.b("notification/2"),
         alp.b("notification/3"),
         alp.b("notification/4"),
         alp.b("notification/5"),
         alp.b("notification/more")
      };
      private static final int u = Integer.MAX_VALUE;
      private static final int v = 20;
      private static final int w = 14;
      private int x;

      public g(xk $$0, alp $$1, fny.c $$2) {
         super(20, 20, $$0, 14, 14, $$1, $$2, null);
      }

      int a() {
         return this.x;
      }

      public void a(int $$0) {
         this.x = $$0;
      }

      @Override
      public void b(fnl $$0, int $$1, int $$2, float $$3) {
         super.b($$0, $$1, $$2, $$3);
         if (this.j && this.x != 0) {
            this.a($$0);
         }
      }

      private void a(fnl $$0) {
         $$0.a(glq::H, d[Math.min(this.x, 6) - 1], this.D() + this.y() - 5, this.E() - 3, 8, 8);
      }
   }

   class h extends fgw.e {
      private static final int f = 40;
      private static final int g = -12303292;
      private final xk h;
      private final int i;
      private final List<fnw> j = new ArrayList<>();
      @Nullable
      private final fgw.c k;
      private final fot l;
      private final frm m;
      private final frl n;
      private int o = -1;

      public h(final xk $$0, final int $$1, final fib $$2) {
         this.h = $$0;
         this.i = $$1;
         this.m = new frm();
         int $$3 = 7;
         this.m.a(fol.a(20, 20, fgw.b), 0, 0, this.m.b().a(7, 7, 0, 0));
         this.m.a(frs.a(40), 0, 0);
         this.n = this.m.a(new frl(0, 9 * 3 * ($$1 - 1)), 0, 1, this.m.b().c(7));
         this.l = this.n.a(new fot($$0, fgw.this.p).b(true), this.n.b().b().d());
         this.m.a(frs.a(40), 0, 2);
         if ($$2.b()) {
            this.k = this.m.a(new fgw.c($$1x -> fgw.this.a($$2.c()), xk.c("mco.notification.dismiss")), 0, 2, this.m.b().c().a(0, 7, 7, 0));
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
      public void b(fnl $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         super.b($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
         $$0.b($$3 - 2, $$2 - 2, $$4, 36 * this.i - 2, -12303292);
      }

      @Override
      public void a(fnl $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
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
      public xk a() {
         return this.h;
      }
   }

   class i extends fgw.e {
      private final fic f;
      private final fpn g = new fpn();

      public i(final fic $$0) {
         this.f = $$0;
         if (!$$0.j) {
            this.g.a(fpk.a(xk.c("mco.snapshot.parent.tooltip")));
         }
      }

      @Override
      public void a(fnl $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = this.b($$3);
         int $$11 = this.a($$2);
         fkq.a($$0, $$3, $$2, 32, this.f.g);
         xk $$12 = fgw.a(this.f.v, -8355712);
         int $$13 = this.a($$3, $$4, $$12);
         this.a($$0, this.f.b(), $$10, $$11, $$13, -8355712);
         if ($$12 != xj.a) {
            $$0.b(fgw.this.p, $$12, $$13, $$11, -8355712);
         }

         int $$14 = $$3;
         if (!this.f.i()) {
            $$14 = this.a(this.f, $$0, $$3, $$4, $$11);
         }

         this.a($$0, this.f.a(), $$10, this.c($$11), $$14, -8355712);
         this.a($$0, $$2, $$3, this.f);
         this.a(this.f, $$0, $$3 + $$4, $$2, $$6, $$7);
         this.g.a($$8, this.aN_(), new fsg($$3, $$2, $$4, $$5));
      }

      @Override
      public xk a() {
         return xk.b(Objects.requireNonNullElse(this.f.c, "unknown server"));
      }
   }

   class j extends fov<fgw.e> {
      public j() {
         super(flz.Q(), fgw.this.n, fgw.this.o, 0, 36);
      }

      public void a(@Nullable fgw.e $$0) {
         super.a($$0);
         fgw.this.J();
      }

      @Override
      public int a() {
         return 300;
      }

      void a(fgw $$0, @Nullable fic $$1) {
         this.j();

         for (fib $$2 : fgw.this.aO) {
            if ($$2 instanceof fib.c $$3) {
               this.a($$3, $$0);
               fgw.this.a(List.of($$2));
               break;
            }
         }

         this.a($$1);
      }

      private void a(@Nullable fic $$0) {
         for (fic $$1 : fgw.this.aJ) {
            this.b(fgw.this.new a($$1));
         }

         for (fic $$2 : fgw.this.aI) {
            fgw.e $$3;
            if (fgw.b() && !$$2.h()) {
               if ($$2.e == fic.c.c) {
                  continue;
               }

               $$3 = fgw.this.new i($$2);
            } else {
               $$3 = fgw.this.new l($$2);
            }

            this.b($$3);
            if ($$0 != null && $$0.a == $$2.a) {
               this.a($$3);
            }
         }
      }

      private void a(fib.c $$0, fgw $$1) {
         xk $$2 = $$0.d();
         int $$3 = fgw.this.p.b($$2, 216);
         int $$4 = azu.e($$3 + 7, 36) - 1;
         this.b(fgw.this.new h($$2, $$4 + 2, $$0));

         for (int $$5 = 0; $$5 < $$4; $$5++) {
            this.b(fgw.this.new d());
         }

         this.b(fgw.this.new b($$0.a($$1)));
      }
   }

   interface k<T> {
      T request(fhb var1) throws fix;
   }

   class l extends fgw.e {
      private static final xk f = xk.c("mco.onlinePlayers");
      private static final int g = 9;
      private static final int h = 36;
      private final fic i;
      private final fpn j = new fpn();

      public l(final fic $$0) {
         this.i = $$0;
         boolean $$1 = fgw.i($$0);
         if (fgw.b() && $$1 && $$0.h()) {
            this.j.a(fpk.a(xk.a("mco.snapshot.paired", $$0.u)));
         } else if (!$$1 && $$0.f()) {
            this.j.a(fpk.a(xk.a("mco.snapshot.friendsRealm.downgrade", $$0.v)));
         }
      }

      @Override
      public void a(fnl $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         if (this.i.e == fic.c.c) {
            $$0.a(glq::H, fgw.c, $$3 - 5, $$2 + $$5 / 2 - 10, 40, 20);
            int $$10 = $$2 + $$5 / 2 - 9 / 2;
            $$0.b(fgw.this.p, fgw.N, $$3 + 40 - 2, $$10, 8388479);
         } else {
            this.a(this.i, $$0, $$3 + 36, $$2, $$6, $$7);
            fkq.a($$0, $$3, $$2, 32, this.i.g);
            this.a($$0, $$2, $$3, $$4);
            this.b($$0, $$2, $$3, $$4);
            this.a($$0, $$2, $$3, this.i);
            boolean $$11 = this.a($$0, $$2, $$3, $$4, $$5, $$6, $$7);
            this.a(this.i, $$0, $$3 + $$4, $$2, $$6, $$7);
            if (!$$11) {
               this.j.a($$8, this.aN_(), new fsg($$3, $$2, $$4, $$5));
            }
         }
      }

      private void a(fnl $$0, int $$1, int $$2, int $$3) {
         int $$4 = this.b($$2);
         int $$5 = this.a($$1);
         xk $$6 = fgw.a(this.i.v, this.i.d());
         int $$7 = this.a($$2, $$3, $$6);
         this.a($$0, this.i.b(), $$4, $$5, $$7, -1);
         if ($$6 != xj.a && !this.i.i()) {
            $$0.b(fgw.this.p, $$6, $$7, $$5, -8355712);
         }
      }

      private void b(fnl $$0, int $$1, int $$2, int $$3) {
         int $$4 = this.b($$2);
         int $$5 = this.a($$1);
         int $$6 = this.c($$5);
         String $$7 = this.i.c();
         boolean $$8 = this.i.i();
         if ($$8 && $$7 != null) {
            xk $$9 = xk.b($$7).a(n.h);
            $$0.b(fgw.this.p, xk.a("mco.selectServer.minigameName", $$9).b(-171), $$4, $$6, -1);
         } else {
            int $$10 = this.a(this.i, $$0, $$2, $$3, $$5);
            this.a($$0, this.i.a(), $$4, this.c($$5), $$10, -8355712);
         }
      }

      private boolean a(fnl $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6) {
         List<ProfileResult> $$7 = fgw.this.aK.a(this.i.a);
         if (!$$7.isEmpty()) {
            int $$8 = $$2 + $$3 - 21;
            int $$9 = $$1 + $$4 - 9 - 2;
            int $$10 = $$8;

            for (int $$11 = 0; $$11 < $$7.size(); $$11++) {
               $$10 -= 9 + ($$11 == 0 ? 0 : 3);
               foy.a($$0, flz.Q().an().b($$7.get($$11).profile()), $$10, $$9, 9);
            }

            if ($$5 >= $$10 && $$5 <= $$8 && $$6 >= $$9 && $$6 <= $$9 + 9) {
               $$0.a(fgw.this.p, List.of(f), Optional.of(new fvy.a($$7)), $$5, $$6);
               return true;
            }
         }

         return false;
      }

      private void d() {
         fgw.this.m.ak().a(hey.a(awv.Bg, 1.0F));
         fgw.a(this.i, fgw.this);
      }

      private void e() {
         fgw.this.m.ak().a(hey.a(awv.Bg, 1.0F));
         fjn $$0 = new fjn(fgw.this, this.i, this.i.h());
         fgw.this.m.a($$0);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         if (this.i.e == fic.c.c) {
            this.e();
         } else if (fgw.this.a(this.i)) {
            if (ae.c() - fgw.this.aN < 250L && this.aN_()) {
               this.d();
            }

            fgw.this.aN = ae.c();
         }

         return true;
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         if (fsb.a($$0)) {
            if (this.i.e == fic.c.c) {
               this.e();
               return true;
            }

            if (fgw.this.a(this.i)) {
               this.d();
               return true;
            }
         }

         return super.a($$0, $$1, $$2);
      }

      @Override
      public xk a() {
         return (xk)(this.i.e == fic.c.c ? fgw.Z : xk.a("narrator.select", Objects.requireNonNullElse(this.i.c, "unknown server")));
      }

      public fic c() {
         return this.i;
      }
   }
}
