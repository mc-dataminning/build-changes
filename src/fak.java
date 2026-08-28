import com.google.common.collect.Lists;
import com.google.common.util.concurrent.RateLimiter;
import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;

public class fak extends gvh {
   static final alf a = new alf("icon/info");
   static final alf b = new alf("icon/new_realm");
   static final alf c = new alf("realm_status/expired");
   static final alf B = new alf("realm_status/expires_soon");
   static final alf C = new alf("realm_status/open");
   static final alf D = new alf("realm_status/closed");
   private static final alf E = new alf("icon/invite");
   private static final alf F = new alf("icon/news");
   static final Logger G = LogUtils.getLogger();
   private static final alf H = new alf("textures/gui/title/realms.png");
   private static final alf I = new alf("textures/gui/realms/no_realms.png");
   private static final xp J = xp.c("menu.online");
   private static final xp K = xp.c("mco.selectServer.loading");
   static final xp L = xp.c("mco.selectServer.uninitialized");
   static final xp M = xp.c("mco.selectServer.expiredList");
   private static final xp N = xp.c("mco.selectServer.expiredRenew");
   static final xp O = xp.c("mco.selectServer.expiredTrial");
   private static final xp P = xp.c("mco.selectServer.play");
   private static final xp Q = xp.c("mco.selectServer.leave");
   private static final xp R = xp.c("mco.selectServer.configure");
   static final xp S = xp.c("mco.selectServer.expired");
   static final xp T = xp.c("mco.selectServer.expires.soon");
   static final xp U = xp.c("mco.selectServer.expires.day");
   static final xp V = xp.c("mco.selectServer.open");
   static final xp W = xp.c("mco.selectServer.closed");
   static final xp X = xp.a("gui.narrate.button", L);
   private static final xp Y = xp.c("mco.selectServer.noRealms");
   private static final xp Z = xp.c("mco.invites.nopending");
   private static final xp aa = xp.c("mco.invites.pending");
   private static final int ab = 100;
   private static final int ac = 3;
   private static final int ad = 4;
   private static final int ae = 308;
   private static final int af = 128;
   private static final int ag = 34;
   private static final int ah = 128;
   private static final int ai = 64;
   private static final int aj = 5;
   private static final int ak = 44;
   private static final int al = 11;
   private static final int am = 40;
   private static final int an = 20;
   private static final int ao = 216;
   private static final int ap = 36;
   private static final boolean aq = !aa.b().g();
   private static boolean ar = aq;
   private final CompletableFuture<faj.a> as = faj.a();
   @Nullable
   private fdo.c at;
   private final Set<UUID> au = new HashSet<>();
   private static boolean av;
   private final RateLimiter aw;
   private final fne ax;
   private fhf ay;
   private fhf az;
   private fhf aA;
   private fhf aB;
   private fhf aC;
   fak.j aD;
   private fch aE;
   private List<fbg> aF = List.of();
   private volatile boolean aG;
   @Nullable
   private volatile String aH;
   long aI;
   private final List<fbf> aJ = new ArrayList<>();
   private fhf aK;
   private fak.g aL;
   private fak.g aM;
   private fak.f aN;
   @Nullable
   private fks aO;

   public fak(fne $$0) {
      super(J);
      this.ax = $$0;
      this.aw = RateLimiter.create(0.016666668F);
   }

   @Override
   public void aM_() {
      this.aE = new fch(this.m);
      this.aD = new fak.j();
      xp $$0 = xp.c("mco.invites.title");
      this.aL = new fak.g($$0, E, $$1x -> this.m.a(new fda(this, $$0)));
      xp $$1 = xp.c("mco.news");
      this.aM = new fak.g($$1, F, $$0x -> {
         String $$1x = this.aH;
         if ($$1x != null) {
            flv.a(this, $$1x);
            if (this.aM.a() != 0) {
               fdu.a $$2 = fdu.b();
               $$2.b = false;
               fdu.b($$2);
               this.aM.a(0);
            }
         }
      });
      this.aM.a(fiq.a($$1));
      this.ay = fhf.a(P, $$0x -> a(this.O(), this)).a(100).a();
      this.aB = fhf.a(R, $$0x -> this.f(this.O())).a(100).a();
      this.aA = fhf.a(N, $$0x -> this.e(this.O())).a(100).a();
      this.aC = fhf.a(Q, $$0x -> this.g(this.O())).a(100).a();
      this.aK = fhf.a(xp.c("mco.selectServer.purchase"), $$0x -> this.P()).b(100, 20).a();
      this.az = fhf.a(xo.k, $$0x -> this.d()).a(100).a();
      if (fap.a == fap.b.b) {
         this.c(fhm.a(xp.b("Snapshot"), xp.b("Release")).a(5, 5, 100, 20, xp.b("Realm"), ($$0x, $$1x) -> {
            ar = $$1x;
            this.aF = List.of();
            this.K();
         }));
      }

      this.a(fak.f.a);
      this.J();
      this.as.thenAcceptAsync($$0x -> {
         fne $$1x = $$0x.a(this.ax);
         if ($$1x == null) {
            this.at = this.a(this.m.ba());
         } else {
            this.m.a($$1x);
         }
      }, this.q);
   }

   public static boolean b() {
      return aq && ar;
   }

   @Override
   protected void c() {
      if (this.aO != null) {
         this.aD.a(this.n, this.aO);
         this.aO.a();
      }
   }

   @Override
   public void d() {
      this.m.a(this.ax);
   }

   private void E() {
      if (this.aE.a() && this.aF.isEmpty() && this.aJ.isEmpty()) {
         this.a(fak.f.b);
      } else {
         this.a(fak.f.c);
      }
   }

   private void a(fak.f $$0) {
      if (this.aN != $$0) {
         if (this.aO != null) {
            this.aO.a($$1 -> this.e($$1));
         }

         this.aO = this.b($$0);
         this.aN = $$0;
         this.aO.a($$1 -> {
            fhd var10000 = this.c($$1);
         });
         this.c();
      }
   }

   private fks b(fak.f $$0) {
      fks $$1 = new fks(this);
      $$1.b(44);
      $$1.a(this.F());
      fkt $$2 = this.c($$0);
      $$2.a();
      $$1.a($$2.v() + 22);
      $$1.b($$2);
      switch ($$0) {
         case a:
            $$1.c(new fhu(this.p, K));
            break;
         case b:
            $$1.c(this.I());
            break;
         case c:
            $$1.c(this.aD);
      }

      return $$1;
   }

   private fkt F() {
      int $$0 = 90;
      fkw $$1 = fkw.e().a(4);
      $$1.c().e();
      $$1.a(this.aL);
      $$1.a(this.aM);
      fkw $$2 = fkw.e();
      $$2.c().e();
      $$2.a(fkx.a(90));
      $$2.a(fhs.a(128, 34, H, 128, 64), fkv::b);
      $$2.a(new fkq(90, 44)).a($$1, fkv::c);
      return $$2;
   }

   private fkt c(fak.f $$0) {
      fkr $$1 = new fkr().c(4);
      fkr.b $$2 = $$1.d(3);
      if ($$0 == fak.f.c) {
         $$2.a(this.ay);
         $$2.a(this.aB);
         $$2.a(this.aA);
         $$2.a(this.aC);
      }

      $$2.a(this.aK);
      $$2.a(this.az);
      return $$1;
   }

   private fkw I() {
      fkw $$0 = fkw.d().a(8);
      $$0.c().b();
      $$0.a(fhs.a(130, 64, I, 130, 64));
      fhq $$1 = new fhq(308, Y, this.p, false, 4);
      $$0.a($$1);
      return $$0;
   }

   void J() {
      fbg $$0 = this.O();
      this.aK.j = this.aN != fak.f.a;
      this.ay.j = $$0 != null && this.a($$0);
      this.aA.j = $$0 != null && this.b($$0);
      this.aC.j = $$0 != null && this.d($$0);
      this.aB.j = $$0 != null && this.c($$0);
   }

   boolean a(fbg $$0) {
      boolean $$1 = !$$0.j && $$0.e == fbg.c.b;
      return $$1 && ($$0.d() || this.h($$0));
   }

   private boolean b(fbg $$0) {
      return $$0.j && this.h($$0);
   }

   private boolean c(fbg $$0) {
      return this.h($$0) && $$0.e != fbg.c.c;
   }

   private boolean d(fbg $$0) {
      return !this.h($$0);
   }

   @Override
   public void e() {
      super.e();
      if (this.at != null) {
         this.at.b();
      }
   }

   public static void f() {
      ffg.Q().ba().d.a();
   }

   public static void g() {
      ffg.Q().ba().c.a();
   }

   private void K() {
      for (fdo.e<?> $$0 : this.m.ba().a()) {
         $$0.a();
      }
   }

   private fdo.c a(fcf $$0) {
      fdo.c $$1 = $$0.a.a();
      $$1.a($$0.c, $$0x -> {
         this.aE.a($$0x.a());
         this.aF = $$0x.b();
         this.L();
         boolean $$1x = false;

         for (fbg $$2 : this.aE) {
            if (this.i($$2)) {
               $$1x = true;
            }
         }

         if (!av && $$1x) {
            av = true;
            this.M();
         }
      });
      a(fap::d, $$0x -> {
         this.aJ.clear();
         this.aJ.addAll($$0x);

         for (fbf $$1x : $$0x) {
            if ($$1x instanceof fbf.a $$2) {
               fih $$3 = $$2.a(this, this::a);
               if ($$3 != null) {
                  this.m.a($$3);
                  this.a(List.of($$1x));
                  break;
               }
            }
         }

         if (!this.aJ.isEmpty() && this.aN != fak.f.a) {
            this.L();
         }
      });
      $$1.a($$0.d, $$0x -> {
         this.aL.a($$0x);
         this.aL.a($$0x == 0 ? fiq.a(Z) : fiq.a(aa));
         if ($$0x > 0 && this.aw.tryAcquire(1)) {
            this.m.aX().c(xp.a("mco.configure.world.invite.narration", $$0x));
         }
      });
      $$1.a($$0.e, $$0x -> this.aG = $$0x);
      $$1.a($$0.f, $$1x -> {
         $$0.g.a($$1x);
         this.aH = $$0.g.b();
         this.aM.a($$0.g.a() ? Integer.MAX_VALUE : 0);
      });
      return $$1;
   }

   private void a(Collection<fbf> $$0) {
      List<UUID> $$1 = new ArrayList<>($$0.size());

      for (fbf $$2 : $$0) {
         if (!$$2.a() && !this.au.contains($$2.c())) {
            $$1.add($$2.c());
         }
      }

      if (!$$1.isEmpty()) {
         a($$1x -> {
            $$1x.a($$1);
            return null;
         }, $$1x -> this.au.addAll($$1));
      }
   }

   private static <T> void a(fak.k<T> $$0, Consumer<T> $$1) {
      ffg $$2 = ffg.Q();
      CompletableFuture.<T>supplyAsync(() -> {
         try {
            return $$0.request(fap.a($$2));
         } catch (fcc var3) {
            throw new RuntimeException(var3);
         }
      }).thenAcceptAsync($$1, $$2).exceptionally($$0x -> {
         G.error("Failed to execute call to Realms Service", $$0x);
         return null;
      });
   }

   private void L() {
      fbg $$0 = this.O();
      this.aD.I();

      for (fbf $$1 : this.aJ) {
         if (this.a($$1)) {
            this.a(List.of($$1));
            break;
         }
      }

      for (fbg $$2 : this.aF) {
         this.aD.a(new fak.a($$2));
      }

      for (fbg $$3 : this.aE) {
         fak.e $$4;
         if (b() && !$$3.h()) {
            if ($$3.e == fbg.c.c) {
               continue;
            }

            $$4 = new fak.i($$3);
         } else {
            $$4 = new fak.l($$3);
         }

         this.aD.a((fak.e)$$4);
         if ($$0 != null && $$0.a == $$3.a) {
            this.aD.a($$4);
         }
      }

      this.E();
      this.J();
   }

   private boolean a(fbf $$0) {
      if (!($$0 instanceof fbf.c $$1)) {
         return false;
      } else {
         xp $$2 = $$1.d();
         int $$3 = this.p.b($$2, 216);
         int $$4 = ayz.e($$3 + 7, 36) - 1;
         this.aD.a(new fak.h($$2, $$4 + 2, $$1));

         for (int $$5 = 0; $$5 < $$4; $$5++) {
            this.aD.a(new fak.d());
         }

         this.aD.a(new fak.b($$1.a(this)));
         return true;
      }
   }

   private void M() {
      new Thread(() -> {
         List<fbq> $$0 = fao.a();
         fap $$1 = fap.a();
         fbb $$2 = new fbb();
         $$2.a = $$0;
         $$2.b = this.N();

         try {
            $$1.a($$2);
         } catch (Throwable var5) {
            G.warn("Could not send ping result to Realms: ", var5);
         }
      }).start();
   }

   private List<Long> N() {
      List<Long> $$0 = Lists.newArrayList();

      for (fbg $$1 : this.aE) {
         if (this.i($$1)) {
            $$0.add($$1.a);
         }
      }

      return $$0;
   }

   private void e(@Nullable fbg $$0) {
      if ($$0 != null) {
         String $$1 = axu.a($$0.b, this.m.X().b(), $$0.k);
         this.m.o.a($$1);
         ac.k().a($$1);
      }
   }

   private void f(@Nullable fbg $$0) {
      if ($$0 != null && this.m.b($$0.g)) {
         this.m.a(new fcp(this, $$0.a));
      }
   }

   private void g(@Nullable fbg $$0) {
      if ($$0 != null && !this.m.b($$0.g)) {
         xp $$1 = xp.c("mco.configure.world.leave.question.line1");
         xp $$2 = xp.c("mco.configure.world.leave.question.line2");
         this.m.a(new fcv($$1x -> this.a($$1x, $$0), fcv.a.b, $$1, $$2, true));
      }
   }

   @Nullable
   private fbg O() {
      return this.aD.h() instanceof fak.l $$0 ? $$0.c() : null;
   }

   private void a(boolean $$0, final fbg $$1) {
      if ($$0) {
         (new Thread("Realms-leave-server") {
            @Override
            public void run() {
               try {
                  fap $$0 = fap.a();
                  $$0.d($$1.a);
                  fak.this.m.execute(fak::g);
               } catch (fcc var2) {
                  fak.G.error("Couldn't configure world", var2);
                  fak.this.m.execute(() -> fak.this.m.a(new fct(var2, fak.this)));
               }
            }
         }).start();
      }

      this.m.a(this);
   }

   void a(UUID $$0) {
      a($$1 -> {
         $$1.b(List.of($$0));
         return null;
      }, $$1 -> {
         this.aJ.removeIf($$1x -> $$1x.b() && $$0.equals($$1x.c()));
         this.L();
      });
   }

   public void h() {
      this.aD.a(null);
      g();
   }

   @Override
   public xp i() {
      return (xp)(switch (this.aN) {
         case a -> xo.a(super.i(), K);
         case b -> xo.a(super.i(), Y);
         case c -> super.i();
      });
   }

   @Override
   public void a(fgs $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (b()) {
         $$0.b(this.p, "Minecraft " + aa.b().c(), 2, this.o - 10, -1);
      }

      if (this.aG && this.aK.j) {
         fdc.a($$0, this.aK);
      }

      switch (fap.a) {
         case b:
            this.a($$0, "STAGE!", -256);
            break;
         case c:
            this.a($$0, "LOCAL!", 8388479);
      }
   }

   private void P() {
      this.m.a(new fdc(this, this.aG));
   }

   public static void a(@Nullable fbg $$0, fne $$1) {
      a($$0, $$1, false);
   }

   public static void a(@Nullable fbg $$0, fne $$1, boolean $$2) {
      if ($$0 != null) {
         if (!b() || $$2) {
            ffg.Q().a(new fcw($$1, new fef($$1, $$0)));
            return;
         }

         switch ($$0.u) {
            case e:
               ffg.Q().a(new fcw($$1, new fef($$1, $$0)));
               break;
            case a:
               a($$0, $$1, xp.c("mco.compatibility.unverifiable.title").b(-171), xp.c("mco.compatibility.unverifiable.message"), xo.j);
               break;
            case c:
               a(
                  $$0,
                  $$1,
                  xp.c("selectWorld.backupQuestion.downgrade").b(-2142128),
                  xp.a("mco.compatibility.downgrade.description", xp.b($$0.t).b(-171), xp.b(aa.b().c()).b(-171)),
                  xp.c("mco.compatibility.downgrade")
               );
               break;
            case d:
               a(
                  $$0,
                  $$1,
                  xp.c("mco.compatibility.upgrade.title").b(-171),
                  xp.a("mco.compatibility.upgrade.description", xp.b($$0.t).b(-171), xp.b(aa.b().c()).b(-171)),
                  xp.c("mco.compatibility.upgrade")
               );
         }
      }
   }

   private static void a(fbg $$0, fne $$1, xp $$2, xp $$3, xp $$4) {
      ffg.Q().a(new flw($$2x -> {
         fne $$3x;
         if ($$2x) {
            $$3x = new fcw($$1, new fef($$1, $$0));
            g();
         } else {
            $$3x = $$1;
         }

         ffg.Q().a($$3x);
      }, $$2, $$3, $$4, xo.e));
   }

   public static xp a(String $$0, boolean $$1) {
      return a($$0, $$1 ? -8355712 : -2142128);
   }

   public static xp a(String $$0, int $$1) {
      return (xp)(StringUtils.isBlank($$0) ? xo.a : xp.a("mco.version", xp.b($$0).b($$1)));
   }

   boolean h(fbg $$0) {
      return this.m.b($$0.g);
   }

   private boolean i(fbg $$0) {
      return this.h($$0) && !$$0.j;
   }

   private void a(fgs $$0, String $$1, int $$2) {
      $$0.c().a();
      $$0.c().a((float)(this.n / 2 - 25), 20.0F, 0.0F);
      $$0.c().a(a.f.rotationDegrees(-20.0F));
      $$0.c().b(1.5F, 1.5F, 1.5F);
      $$0.a(this.p, $$1, 0, 0, $$2, false);
      $$0.c().b();
   }

   class a extends fak.e {
      private static final xp c = xp.c("mco.snapshot.start");
      private static final int d = 5;
      private final fit e = new fit();
      private final fbg f;

      public a(final fbg $$0) {
         this.f = $$0;
         this.e.a(fiq.a(xp.c("mco.snapshot.tooltip")));
      }

      @Override
      public void a(fgs $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(fak.b, $$3 - 5, $$2 + $$5 / 2 - 10, 40, 20);
         int $$10 = $$2 + $$5 / 2 - 9 / 2;
         $$0.b(fak.this.p, c, $$3 + 40 - 2, $$10 - 5, 8388479);
         $$0.b(fak.this.p, xp.a("mco.snapshot.description", this.f.c), $$3 + 40 - 2, $$10 + 5, -8355712);
         this.e.a($$8, this.aH_(), new fll($$3, $$2, $$4, $$5));
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         this.c();
         return true;
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         if (flg.a($$0)) {
            this.c();
            return true;
         } else {
            return super.a($$0, $$1, $$2);
         }
      }

      private void c() {
         fak.this.m.aj().a(gsj.a(awa.Ao, 1.0F));
         fak.this.m
            .a(
               new fih.a(fak.this, xp.c("mco.snapshot.createSnapshotPopup.title"))
                  .a(xp.c("mco.snapshot.createSnapshotPopup.text"))
                  .a(xp.c("mco.selectServer.create"), $$0 -> fak.this.m.a(new fcr(fak.this, this.f.a)))
                  .a(xo.e, fih::d)
                  .a()
            );
      }

      @Override
      public xp a() {
         return xp.a("gui.narrate.button", xo.a(c, xp.a("mco.snapshot.description", this.f.c)));
      }
   }

   class b extends fak.e {
      private final fhf c;

      public b(final fhf $$0) {
         this.c = $$0;
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         this.c.a($$0, $$1, $$2);
         return super.a($$0, $$1, $$2);
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         return this.c.a($$0, $$1, $$2) ? true : super.a($$0, $$1, $$2);
      }

      @Override
      public void a(fgs $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.c.c(fak.this.n / 2 - 75, $$2 + 4);
         this.c.a($$0, $$6, $$7, $$9);
      }

      @Override
      public void a(boolean $$0) {
         super.a($$0);
         this.c.a($$0);
      }

      @Override
      public xp a() {
         return this.c.y();
      }
   }

   static class c extends fhr {
      private static final fis b = new fis(new alf("widget/cross_button"), new alf("widget/cross_button_highlighted"));

      protected c(fhf.c $$0, xp $$1) {
         super(0, 0, 14, 14, b, $$0);
         this.a(fiq.a($$1));
      }
   }

   class d extends fak.e {
      @Override
      public void a(fgs $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
      }

      @Override
      public xp a() {
         return xp.i();
      }
   }

   abstract class e extends fib.a<fak.e> {
      private static final int a = 10;
      private static final int c = 28;
      private static final int d = 7;

      protected void a(fbg $$0, fgs $$1, int $$2, int $$3, int $$4, int $$5) {
         int $$6 = $$2 - 10 - 7;
         int $$7 = $$3 + 2;
         if ($$0.j) {
            this.a($$1, $$6, $$7, $$4, $$5, fak.c, () -> fak.S);
         } else if ($$0.e == fbg.c.a) {
            this.a($$1, $$6, $$7, $$4, $$5, fak.D, () -> fak.W);
         } else if (fak.this.h($$0) && $$0.l < 7) {
            this.a($$1, $$6, $$7, $$4, $$5, fak.B, () -> {
               if ($$0.l <= 0) {
                  return fak.T;
               } else {
                  return (xp)($$0.l == 1 ? fak.U : xp.a("mco.selectServer.expires.days", $$0.l));
               }
            });
         } else if ($$0.e == fbg.c.b) {
            this.a($$1, $$6, $$7, $$4, $$5, fak.C, () -> fak.V);
         }
      }

      private void a(fgs $$0, int $$1, int $$2, int $$3, int $$4, alf $$5, Supplier<xp> $$6) {
         $$0.a($$5, $$1, $$2, 10, 28);
         if (fak.this.aD.c((double)$$3, (double)$$4) && $$3 >= $$1 && $$3 <= $$1 + 10 && $$4 >= $$2 && $$4 <= $$2 + 28) {
            fak.this.d($$6.get());
         }
      }

      protected void a(fgs $$0, int $$1, int $$2, fbg $$3) {
         int $$4 = this.b($$2);
         int $$5 = this.a($$1);
         int $$6 = this.d($$5);
         if (!fak.this.h($$3)) {
            $$0.a(fak.this.p, $$3.f, $$4, this.d($$5), -8355712, false);
         } else if ($$3.j) {
            xp $$7 = $$3.k ? fak.O : fak.M;
            $$0.a(fak.this.p, $$7, $$4, $$6, -2142128, false);
         }
      }

      protected void a(fgs $$0, String $$1, int $$2, int $$3, int $$4, int $$5) {
         int $$6 = $$4 - $$2;
         if (fak.this.p.b($$1) > $$6) {
            String $$7 = fak.this.p.a($$1, $$6 - fak.this.p.b("... "));
            $$0.a(fak.this.p, $$7 + "...", $$2, $$3, $$5, false);
         } else {
            $$0.a(fak.this.p, $$1, $$2, $$3, $$5, false);
         }
      }

      protected int a(int $$0, int $$1, xp $$2) {
         return $$0 + $$1 - fak.this.p.a($$2) - 20;
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

   static class g extends fik.b {
      private static final alf[] d = new alf[]{
         new alf("notification/1"),
         new alf("notification/2"),
         new alf("notification/3"),
         new alf("notification/4"),
         new alf("notification/5"),
         new alf("notification/more")
      };
      private static final int u = Integer.MAX_VALUE;
      private static final int v = 20;
      private static final int w = 14;
      private int x;

      public g(xp $$0, alf $$1, fhf.c $$2) {
         super(20, 20, $$0, 14, 14, $$1, $$2, null);
      }

      int a() {
         return this.x;
      }

      public void a(int $$0) {
         this.x = $$0;
      }

      @Override
      public void b(fgs $$0, int $$1, int $$2, float $$3) {
         super.b($$0, $$1, $$2, $$3);
         if (this.j && this.x != 0) {
            this.a($$0);
         }
      }

      private void a(fgs $$0) {
         $$0.a(d[Math.min(this.x, 6) - 1], this.C() + this.x() - 5, this.D() - 3, 8, 8);
      }
   }

   class h extends fak.e {
      private static final int c = 40;
      private static final int d = -12303292;
      private final xp e;
      private final int f;
      private final List<fhd> g = new ArrayList<>();
      @Nullable
      private final fak.c h;
      private final fhz i;
      private final fkr j;
      private final fkq k;
      private int l = -1;

      public h(final xp $$0, final int $$1, final fbf $$2) {
         this.e = $$0;
         this.f = $$1;
         this.j = new fkr();
         int $$3 = 7;
         this.j.a(fhs.a(20, 20, fak.a), 0, 0, this.j.b().a(7, 7, 0, 0));
         this.j.a(fkx.a(40), 0, 0);
         this.k = this.j.a(new fkq(0, 9 * 3 * ($$1 - 1)), 0, 1, this.j.b().c(7));
         this.i = this.k.a(new fhz($$0, fak.this.p).b(true), this.k.b().b().d());
         this.j.a(fkx.a(40), 0, 2);
         if ($$2.b()) {
            this.h = this.j.a(new fak.c($$1x -> fak.this.a($$2.c()), xp.c("mco.notification.dismiss")), 0, 2, this.j.b().c().a(0, 7, 7, 0));
         } else {
            this.h = null;
         }

         this.j.a(this.g::add);
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         return this.h != null && this.h.a($$0, $$1, $$2) ? true : super.a($$0, $$1, $$2);
      }

      private void e(int $$0) {
         if (this.l != $$0) {
            this.f($$0);
            this.l = $$0;
         }
      }

      private void f(int $$0) {
         int $$1 = $$0 - 80;
         this.k.b($$1);
         this.i.d($$1);
         this.j.a();
      }

      @Override
      public void b(fgs $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         super.b($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
         $$0.b($$3 - 2, $$2 - 2, $$4, 36 * this.f - 2, -12303292);
      }

      @Override
      public void a(fgs $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.j.c($$3, $$2);
         this.e($$4 - 4);
         this.g.forEach($$4x -> $$4x.a($$0, $$6, $$7, $$9));
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         if (this.h != null) {
            this.h.a($$0, $$1, $$2);
         }

         return super.a($$0, $$1, $$2);
      }

      @Override
      public xp a() {
         return this.e;
      }
   }

   class i extends fak.e {
      private final fbg c;
      private final fit d = new fit();

      public i(final fbg $$0) {
         this.c = $$0;
         if (!$$0.j) {
            this.d.a(fiq.a(xp.c("mco.snapshot.parent.tooltip")));
         }
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         return true;
      }

      @Override
      public void a(fgs $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = this.b($$3);
         int $$11 = this.a($$2);
         fdw.a($$0, $$3, $$2, 32, this.c.g);
         xp $$12 = fak.a(this.c.t, -8355712);
         int $$13 = this.a($$3, $$4, $$12);
         this.a($$0, this.c.b(), $$10, $$11, $$13, -8355712);
         if ($$12 != xo.a) {
            $$0.a(fak.this.p, $$12, $$13, $$11, -8355712, false);
         }

         $$0.a(fak.this.p, this.c.a(), $$10, this.c($$11), -8355712, false);
         this.a($$0, $$2, $$3, this.c);
         this.a(this.c, $$0, $$3 + $$4, $$2, $$6, $$7);
         this.d.a($$8, this.aH_(), new fll($$3, $$2, $$4, $$5));
      }

      @Override
      public xp a() {
         return xp.b(this.c.c);
      }
   }

   class j extends gvg<fak.e> {
      public j() {
         super(fak.this.n, fak.this.o, 0, 36);
      }

      public void a(@Nullable fak.e $$0) {
         super.a($$0);
         fak.this.J();
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
      T request(fap var1) throws fcc;
   }

   class l extends fak.e {
      private static final int c = 36;
      private final fbg d;
      private final fit e = new fit();

      public l(final fbg $$0) {
         this.d = $$0;
         boolean $$1 = fak.this.h($$0);
         if (fak.b() && $$1 && $$0.h()) {
            this.e.a(fiq.a(xp.a("mco.snapshot.paired", $$0.s)));
         } else if (!$$1 && $$0.e()) {
            this.e.a(fiq.a(xp.a("mco.snapshot.friendsRealm.upgrade", $$0.f)));
         } else if (!$$1 && $$0.f()) {
            this.e.a(fiq.a(xp.a("mco.snapshot.friendsRealm.downgrade", $$0.t)));
         }
      }

      @Override
      public void a(fgs $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         if (this.d.e == fbg.c.c) {
            $$0.a(fak.b, $$3 - 5, $$2 + $$5 / 2 - 10, 40, 20);
            int $$10 = $$2 + $$5 / 2 - 9 / 2;
            $$0.b(fak.this.p, fak.L, $$3 + 40 - 2, $$10, 8388479);
         } else {
            fdw.a($$0, $$3, $$2, 32, this.d.g);
            this.a($$0, $$2, $$3, $$4);
            this.a($$0, $$2, $$3);
            this.a($$0, $$2, $$3, this.d);
            this.a(this.d, $$0, $$3 + $$4, $$2, $$6, $$7);
            this.e.a($$8, this.aH_(), new fll($$3, $$2, $$4, $$5));
         }
      }

      private void a(fgs $$0, int $$1, int $$2, int $$3) {
         int $$4 = this.b($$2);
         int $$5 = this.a($$1);
         xp $$6 = fak.a(this.d.t, this.d.d());
         int $$7 = this.a($$2, $$3, $$6);
         this.a($$0, this.d.b(), $$4, $$5, $$7, -1);
         if ($$6 != xo.a) {
            $$0.a(fak.this.p, $$6, $$7, $$5, -8355712, false);
         }
      }

      private void a(fgs $$0, int $$1, int $$2) {
         int $$3 = this.b($$2);
         int $$4 = this.a($$1);
         int $$5 = this.c($$4);
         String $$6 = this.d.c();
         if (this.d.m == fbg.d.b && $$6 != null) {
            xp $$7 = xp.b($$6).a(n.h);
            $$0.a(fak.this.p, xp.a("mco.selectServer.minigameName", $$7).b(-171), $$3, $$5, -1, false);
         } else {
            $$0.a(fak.this.p, this.d.a(), $$3, this.c($$4), -8355712, false);
         }
      }

      private void d() {
         fak.this.m.aj().a(gsj.a(awa.Ao, 1.0F));
         fak.a(this.d, fak.this);
      }

      private void e() {
         fak.this.m.aj().a(gsj.a(awa.Ao, 1.0F));
         fcr $$0 = new fcr(fak.this, this.d);
         fak.this.m.a($$0);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         if (this.d.e == fbg.c.c) {
            this.e();
         } else if (fak.this.a(this.d)) {
            if (ac.c() - fak.this.aI < 250L && this.aH_()) {
               this.d();
            }

            fak.this.aI = ac.c();
         }

         return true;
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         if (flg.a($$0)) {
            if (this.d.e == fbg.c.c) {
               this.e();
               return true;
            }

            if (fak.this.a(this.d)) {
               this.d();
               return true;
            }
         }

         return super.a($$0, $$1, $$2);
      }

      @Override
      public xp a() {
         return (xp)(this.d.e == fbg.c.c ? fak.X : xp.a("narrator.select", this.d.c));
      }

      public fbg c() {
         return this.d;
      }
   }
}
