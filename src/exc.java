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

public class exc extends gru {
   static final ajv a = new ajv("icon/info");
   static final ajv b = new ajv("icon/new_realm");
   static final ajv c = new ajv("realm_status/expired");
   static final ajv y = new ajv("realm_status/expires_soon");
   static final ajv z = new ajv("realm_status/open");
   static final ajv A = new ajv("realm_status/closed");
   private static final ajv B = new ajv("icon/invite");
   private static final ajv C = new ajv("icon/news");
   static final Logger D = LogUtils.getLogger();
   private static final ajv E = new ajv("textures/gui/title/realms.png");
   private static final ajv F = new ajv("textures/gui/realms/no_realms.png");
   private static final wi G = wi.c("menu.online");
   private static final wi H = wi.c("mco.selectServer.loading");
   static final wi I = wi.c("mco.selectServer.uninitialized");
   static final wi J = wi.c("mco.selectServer.expiredList");
   private static final wi K = wi.c("mco.selectServer.expiredRenew");
   static final wi L = wi.c("mco.selectServer.expiredTrial");
   private static final wi M = wi.c("mco.selectServer.play");
   private static final wi N = wi.c("mco.selectServer.leave");
   private static final wi O = wi.c("mco.selectServer.configure");
   static final wi P = wi.c("mco.selectServer.expired");
   static final wi Q = wi.c("mco.selectServer.expires.soon");
   static final wi R = wi.c("mco.selectServer.expires.day");
   static final wi S = wi.c("mco.selectServer.open");
   static final wi T = wi.c("mco.selectServer.closed");
   static final wi U = wi.a("gui.narrate.button", I);
   private static final wi V = wi.c("mco.selectServer.noRealms");
   private static final wi W = wi.c("mco.invites.nopending");
   private static final wi X = wi.c("mco.invites.pending");
   private static final int Y = 100;
   private static final int Z = 3;
   private static final int aa = 4;
   private static final int ab = 308;
   private static final int ac = 128;
   private static final int ad = 34;
   private static final int ae = 128;
   private static final int af = 64;
   private static final int ag = 5;
   private static final int ah = 44;
   private static final int ai = 11;
   private static final int aj = 40;
   private static final int ak = 20;
   private static final int al = 216;
   private static final int am = 36;
   private static final boolean an = !aa.b().g();
   private static boolean ao = an;
   private final CompletableFuture<exb.a> ap = exb.a();
   @Nullable
   private fag.c aq;
   private final Set<UUID> ar = new HashSet<>();
   private static boolean as;
   private final RateLimiter at;
   private final fjx au;
   private fdy av;
   private fdy aw;
   private fdy ax;
   private fdy ay;
   private fdy az;
   exc.j aA;
   private eyz aB;
   private List<exy> aC = List.of();
   private volatile boolean aD;
   @Nullable
   private volatile String aE;
   long aF;
   private final List<exx> aG = new ArrayList<>();
   private fdy aH;
   private exc.g aI;
   private exc.g aJ;
   private exc.f aK;
   @Nullable
   private fhl aL;

   public exc(fjx $$0) {
      super(G);
      this.au = $$0;
      this.at = RateLimiter.create(0.016666668F);
   }

   @Override
   public void aM_() {
      this.aB = new eyz(this.j);
      this.aA = new exc.j();
      wi $$0 = wi.c("mco.invites.title");
      this.aI = new exc.g($$0, B, $$1x -> this.j.a(new ezs(this, $$0)));
      wi $$1 = wi.c("mco.news");
      this.aJ = new exc.g($$1, C, $$0x -> {
         String $$1x = this.aE;
         if ($$1x != null) {
            fio.a(this, $$1x);
            if (this.aJ.a() != 0) {
               fam.a $$2 = fam.b();
               $$2.b = false;
               fam.b($$2);
               this.aJ.a(0);
            }
         }
      });
      this.aJ.a(ffj.a($$1));
      this.av = fdy.a(M, $$0x -> a(this.M(), this)).a(100).a();
      this.ay = fdy.a(O, $$0x -> this.f(this.M())).a(100).a();
      this.ax = fdy.a(K, $$0x -> this.e(this.M())).a(100).a();
      this.az = fdy.a(N, $$0x -> this.g(this.M())).a(100).a();
      this.aH = fdy.a(wi.c("mco.selectServer.purchase"), $$0x -> this.N()).b(100, 20).a();
      this.aw = fdy.a(wh.k, $$0x -> this.d()).a(100).a();
      if (exh.a == exh.b.b) {
         this.c(fef.a(wi.b("Snapshot"), wi.b("Release")).a(5, 5, 100, 20, wi.b("Realm"), ($$0x, $$1x) -> {
            ao = $$1x;
            this.aC = List.of();
            this.I();
         }));
      }

      this.a(exc.f.a);
      this.F();
      this.ap.thenAcceptAsync($$0x -> {
         fjx $$1x = $$0x.a(this.au);
         if ($$1x == null) {
            this.aq = this.a(this.j.bb());
         } else {
            this.j.a($$1x);
         }
      }, this.n);
   }

   public static boolean b() {
      return an && ao;
   }

   @Override
   protected void c() {
      if (this.aL != null) {
         this.aA.a(this.k, this.aL);
         this.aL.a();
      }
   }

   @Override
   public void d() {
      this.j.a(this.au);
   }

   private void C() {
      if (this.aB.a() && this.aC.isEmpty() && this.aG.isEmpty()) {
         this.a(exc.f.b);
      } else {
         this.a(exc.f.c);
      }
   }

   private void a(exc.f $$0) {
      if (this.aK != $$0) {
         if (this.aL != null) {
            this.aL.a($$1 -> this.e($$1));
         }

         this.aL = this.b($$0);
         this.aK = $$0;
         this.aL.a($$1 -> {
            fdw var10000 = this.c($$1);
         });
         this.c();
      }
   }

   private fhl b(exc.f $$0) {
      fhl $$1 = new fhl(this);
      $$1.b(44);
      $$1.a(this.D());
      fhm $$2 = this.c($$0);
      $$2.a();
      $$1.a($$2.v() + 22);
      $$1.b($$2);
      switch ($$0) {
         case a:
            $$1.c(new fen(this.m, H));
            break;
         case b:
            $$1.c(this.E());
            break;
         case c:
            $$1.c(this.aA);
      }

      return $$1;
   }

   private fhm D() {
      int $$0 = 90;
      fhp $$1 = fhp.e().a(4);
      $$1.c().e();
      $$1.a(this.aI);
      $$1.a(this.aJ);
      fhp $$2 = fhp.e();
      $$2.c().e();
      $$2.a(fhq.a(90));
      $$2.a(fel.a(128, 34, E, 128, 64), fho::b);
      $$2.a(new fhj(90, 44)).a($$1, fho::c);
      return $$2;
   }

   private fhm c(exc.f $$0) {
      fhk $$1 = new fhk().c(4);
      fhk.b $$2 = $$1.d(3);
      if ($$0 == exc.f.c) {
         $$2.a(this.av);
         $$2.a(this.ay);
         $$2.a(this.ax);
         $$2.a(this.az);
      }

      $$2.a(this.aH);
      $$2.a(this.aw);
      return $$1;
   }

   private fhp E() {
      fhp $$0 = fhp.d().a(8);
      $$0.c().b();
      $$0.a(fel.a(130, 64, F, 130, 64));
      fej $$1 = new fej(308, V, this.m, false, 4);
      $$0.a($$1);
      return $$0;
   }

   void F() {
      exy $$0 = this.M();
      this.aH.j = this.aK != exc.f.a;
      this.av.j = $$0 != null && this.a($$0);
      this.ax.j = $$0 != null && this.b($$0);
      this.az.j = $$0 != null && this.d($$0);
      this.ay.j = $$0 != null && this.c($$0);
   }

   boolean a(exy $$0) {
      boolean $$1 = !$$0.j && $$0.e == exy.c.b;
      return $$1 && ($$0.d() || this.h($$0));
   }

   private boolean b(exy $$0) {
      return $$0.j && this.h($$0);
   }

   private boolean c(exy $$0) {
      return this.h($$0) && $$0.e != exy.c.c;
   }

   private boolean d(exy $$0) {
      return !this.h($$0);
   }

   @Override
   public void e() {
      super.e();
      if (this.aq != null) {
         this.aq.b();
      }
   }

   public static void f() {
      fby.Q().bb().d.a();
   }

   public static void g() {
      fby.Q().bb().c.a();
   }

   private void I() {
      for (fag.e<?> $$0 : this.j.bb().a()) {
         $$0.a();
      }
   }

   private fag.c a(eyx $$0) {
      fag.c $$1 = $$0.a.a();
      $$1.a($$0.c, $$0x -> {
         this.aB.a($$0x.a());
         this.aC = $$0x.b();
         this.J();
         boolean $$1x = false;

         for (exy $$2 : this.aB) {
            if (this.i($$2)) {
               $$1x = true;
            }
         }

         if (!as && $$1x) {
            as = true;
            this.K();
         }
      });
      a(exh::d, $$0x -> {
         this.aG.clear();
         this.aG.addAll($$0x);

         for (exx $$1x : $$0x) {
            if ($$1x instanceof exx.a $$2) {
               ffa $$3 = $$2.a(this, this::a);
               if ($$3 != null) {
                  this.j.a($$3);
                  this.a(List.of($$1x));
                  break;
               }
            }
         }

         if (!this.aG.isEmpty() && this.aK != exc.f.a) {
            this.J();
         }
      });
      $$1.a($$0.d, $$0x -> {
         this.aI.a($$0x);
         this.aI.a($$0x == 0 ? ffj.a(W) : ffj.a(X));
         if ($$0x > 0 && this.at.tryAcquire(1)) {
            this.j.aY().c(wi.a("mco.configure.world.invite.narration", $$0x));
         }
      });
      $$1.a($$0.e, $$0x -> this.aD = $$0x);
      $$1.a($$0.f, $$1x -> {
         $$0.g.a($$1x);
         this.aE = $$0.g.b();
         this.aJ.a($$0.g.a() ? Integer.MAX_VALUE : 0);
      });
      return $$1;
   }

   private void a(Collection<exx> $$0) {
      List<UUID> $$1 = new ArrayList<>($$0.size());

      for (exx $$2 : $$0) {
         if (!$$2.a() && !this.ar.contains($$2.c())) {
            $$1.add($$2.c());
         }
      }

      if (!$$1.isEmpty()) {
         a($$1x -> {
            $$1x.a($$1);
            return null;
         }, $$1x -> this.ar.addAll($$1));
      }
   }

   private static <T> void a(exc.k<T> $$0, Consumer<T> $$1) {
      fby $$2 = fby.Q();
      CompletableFuture.<T>supplyAsync(() -> {
         try {
            return $$0.request(exh.a($$2));
         } catch (eyu var3) {
            throw new RuntimeException(var3);
         }
      }).thenAcceptAsync($$1, $$2).exceptionally($$0x -> {
         D.error("Failed to execute call to Realms Service", $$0x);
         return null;
      });
   }

   private void J() {
      exy $$0 = this.M();
      this.aA.I();

      for (exx $$1 : this.aG) {
         if (this.a($$1)) {
            this.a(List.of($$1));
            break;
         }
      }

      for (exy $$2 : this.aC) {
         this.aA.a(new exc.a($$2));
      }

      for (exy $$3 : this.aB) {
         exc.e $$4;
         if (b() && !$$3.h()) {
            if ($$3.e == exy.c.c) {
               continue;
            }

            $$4 = new exc.i($$3);
         } else {
            $$4 = new exc.l($$3);
         }

         this.aA.a((exc.e)$$4);
         if ($$0 != null && $$0.a == $$3.a) {
            this.aA.a($$4);
         }
      }

      this.C();
      this.F();
   }

   private boolean a(exx $$0) {
      if (!($$0 instanceof exx.c $$1)) {
         return false;
      } else {
         wi $$2 = $$1.d();
         int $$3 = this.m.b($$2, 216);
         int $$4 = axm.e($$3 + 7, 36) - 1;
         this.aA.a(new exc.h($$2, $$4 + 2, $$1));

         for (int $$5 = 0; $$5 < $$4; $$5++) {
            this.aA.a(new exc.d());
         }

         this.aA.a(new exc.b($$1.a(this)));
         return true;
      }
   }

   private void K() {
      new Thread(() -> {
         List<eyi> $$0 = exg.a();
         exh $$1 = exh.a();
         ext $$2 = new ext();
         $$2.a = $$0;
         $$2.b = this.L();

         try {
            $$1.a($$2);
         } catch (Throwable var5) {
            D.warn("Could not send ping result to Realms: ", var5);
         }
      }).start();
   }

   private List<Long> L() {
      List<Long> $$0 = Lists.newArrayList();

      for (exy $$1 : this.aB) {
         if (this.i($$1)) {
            $$0.add($$1.a);
         }
      }

      return $$0;
   }

   private void e(@Nullable exy $$0) {
      if ($$0 != null) {
         String $$1 = awi.a($$0.b, this.j.X().b(), $$0.k);
         this.j.o.a($$1);
         ac.j().a($$1);
      }
   }

   private void f(@Nullable exy $$0) {
      if ($$0 != null && this.j.b($$0.g)) {
         this.j.a(new ezh(this, $$0.a));
      }
   }

   private void g(@Nullable exy $$0) {
      if ($$0 != null && !this.j.b($$0.g)) {
         wi $$1 = wi.c("mco.configure.world.leave.question.line1");
         wi $$2 = wi.c("mco.configure.world.leave.question.line2");
         this.j.a(new ezn($$1x -> this.a($$1x, $$0), ezn.a.b, $$1, $$2, true));
      }
   }

   @Nullable
   private exy M() {
      return this.aA.h() instanceof exc.l $$0 ? $$0.c() : null;
   }

   private void a(boolean $$0, final exy $$1) {
      if ($$0) {
         (new Thread("Realms-leave-server") {
            @Override
            public void run() {
               try {
                  exh $$0 = exh.a();
                  $$0.d($$1.a);
                  exc.this.j.execute(exc::g);
               } catch (eyu var2) {
                  exc.D.error("Couldn't configure world", var2);
                  exc.this.j.execute(() -> exc.this.j.a(new ezl(var2, exc.this)));
               }
            }
         }).start();
      }

      this.j.a(this);
   }

   void a(UUID $$0) {
      a($$1 -> {
         $$1.b(List.of($$0));
         return null;
      }, $$1 -> {
         this.aG.removeIf($$1x -> $$1x.b() && $$0.equals($$1x.c()));
         this.J();
      });
   }

   public void h() {
      this.aA.a(null);
      g();
   }

   @Override
   public wi i() {
      return (wi)(switch (this.aK) {
         case a -> wh.a(super.i(), H);
         case b -> wh.a(super.i(), V);
         case c -> super.i();
      });
   }

   @Override
   public void a(fdl $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (b()) {
         $$0.b(this.m, "Minecraft " + aa.b().c(), 2, this.l - 10, -1);
      }

      if (this.aD && this.aH.j) {
         ezu.a($$0, this.aH);
      }

      switch (exh.a) {
         case b:
            this.a($$0, "STAGE!", -256);
            break;
         case c:
            this.a($$0, "LOCAL!", 8388479);
      }
   }

   private void N() {
      this.j.a(new ezu(this, this.aD));
   }

   public static void a(@Nullable exy $$0, fjx $$1) {
      a($$0, $$1, false);
   }

   public static void a(@Nullable exy $$0, fjx $$1, boolean $$2) {
      if ($$0 != null) {
         if (!b() || $$2) {
            fby.Q().a(new ezo($$1, new fax($$1, $$0)));
            return;
         }

         switch ($$0.u) {
            case e:
               fby.Q().a(new ezo($$1, new fax($$1, $$0)));
               break;
            case a:
               a($$0, $$1, wi.c("mco.compatibility.unverifiable.title").b(-171), wi.c("mco.compatibility.unverifiable.message"), wh.j);
               break;
            case c:
               a(
                  $$0,
                  $$1,
                  wi.c("selectWorld.backupQuestion.downgrade").b(-2142128),
                  wi.a("mco.compatibility.downgrade.description", wi.b($$0.t).b(-171), wi.b(aa.b().c()).b(-171)),
                  wi.c("mco.compatibility.downgrade")
               );
               break;
            case d:
               a(
                  $$0,
                  $$1,
                  wi.c("mco.compatibility.upgrade.title").b(-171),
                  wi.a("mco.compatibility.upgrade.description", wi.b($$0.t).b(-171), wi.b(aa.b().c()).b(-171)),
                  wi.c("mco.compatibility.upgrade")
               );
         }
      }
   }

   private static void a(exy $$0, fjx $$1, wi $$2, wi $$3, wi $$4) {
      fby.Q().a(new fip($$2x -> {
         fjx $$3x;
         if ($$2x) {
            $$3x = new ezo($$1, new fax($$1, $$0));
            g();
         } else {
            $$3x = $$1;
         }

         fby.Q().a($$3x);
      }, $$2, $$3, $$4, wh.e));
   }

   public static wi a(String $$0, boolean $$1) {
      return a($$0, $$1 ? -8355712 : -2142128);
   }

   public static wi a(String $$0, int $$1) {
      return (wi)(StringUtils.isBlank($$0) ? wh.a : wi.a("mco.version", wi.b($$0).b($$1)));
   }

   boolean h(exy $$0) {
      return this.j.b($$0.g);
   }

   private boolean i(exy $$0) {
      return this.h($$0) && !$$0.j;
   }

   private void a(fdl $$0, String $$1, int $$2) {
      $$0.c().a();
      $$0.c().a((float)(this.k / 2 - 25), 20.0F, 0.0F);
      $$0.c().a(a.f.rotationDegrees(-20.0F));
      $$0.c().b(1.5F, 1.5F, 1.5F);
      $$0.a(this.m, $$1, 0, 0, $$2, false);
      $$0.c().b();
   }

   class a extends exc.e {
      private static final wi c = wi.c("mco.snapshot.start");
      private static final int d = 5;
      private final ffm e = new ffm();
      private final exy f;

      public a(exy $$0) {
         this.f = $$0;
         this.e.a(ffj.a(wi.c("mco.snapshot.tooltip")));
      }

      @Override
      public void a(fdl $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(exc.b, $$3 - 5, $$2 + $$5 / 2 - 10, 40, 20);
         int $$10 = $$2 + $$5 / 2 - 9 / 2;
         $$0.b(exc.this.m, c, $$3 + 40 - 2, $$10 - 5, 8388479);
         $$0.b(exc.this.m, wi.a("mco.snapshot.description", this.f.c), $$3 + 40 - 2, $$10 + 5, -8355712);
         this.e.a($$8, this.aI_(), new fie($$3, $$2, $$4, $$5));
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         this.c();
         return true;
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         if (fhz.a($$0)) {
            this.c();
            return true;
         } else {
            return super.a($$0, $$1, $$2);
         }
      }

      private void c() {
         exc.this.j.ak().a(gpa.a(auo.zV, 1.0F));
         exc.this.j
            .a(
               new ffa.a(exc.this, wi.c("mco.snapshot.createSnapshotPopup.title"))
                  .a(wi.c("mco.snapshot.createSnapshotPopup.text"))
                  .a(wi.c("mco.selectServer.create"), $$0 -> exc.this.j.a(new ezj(exc.this, this.f.a)))
                  .a(wh.e, ffa::d)
                  .a()
            );
      }

      @Override
      public wi a() {
         return wi.a("gui.narrate.button", wh.a(c, wi.a("mco.snapshot.description", this.f.c)));
      }
   }

   class b extends exc.e {
      private final fdy c;

      public b(fdy $$0) {
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
      public void a(fdl $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.c.c(exc.this.k / 2 - 75, $$2 + 4);
         this.c.a($$0, $$6, $$7, $$9);
      }

      @Override
      public void a(boolean $$0) {
         super.a($$0);
         this.c.a($$0);
      }

      @Override
      public wi a() {
         return this.c.y();
      }
   }

   static class c extends fek {
      private static final ffl b = new ffl(new ajv("widget/cross_button"), new ajv("widget/cross_button_highlighted"));

      protected c(fdy.c $$0, wi $$1) {
         super(0, 0, 14, 14, b, $$0);
         this.a(ffj.a($$1));
      }
   }

   class d extends exc.e {
      @Override
      public void a(fdl $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
      }

      @Override
      public wi a() {
         return wi.i();
      }
   }

   abstract class e extends feu.a<exc.e> {
      private static final int a = 10;
      private static final int c = 28;
      private static final int d = 7;

      protected void a(exy $$0, fdl $$1, int $$2, int $$3, int $$4, int $$5) {
         int $$6 = $$2 - 10 - 7;
         int $$7 = $$3 + 2;
         if ($$0.j) {
            this.a($$1, $$6, $$7, $$4, $$5, exc.c, () -> exc.P);
         } else if ($$0.e == exy.c.a) {
            this.a($$1, $$6, $$7, $$4, $$5, exc.A, () -> exc.T);
         } else if (exc.this.h($$0) && $$0.l < 7) {
            this.a($$1, $$6, $$7, $$4, $$5, exc.y, () -> {
               if ($$0.l <= 0) {
                  return exc.Q;
               } else {
                  return (wi)($$0.l == 1 ? exc.R : wi.a("mco.selectServer.expires.days", $$0.l));
               }
            });
         } else if ($$0.e == exy.c.b) {
            this.a($$1, $$6, $$7, $$4, $$5, exc.z, () -> exc.S);
         }
      }

      private void a(fdl $$0, int $$1, int $$2, int $$3, int $$4, ajv $$5, Supplier<wi> $$6) {
         $$0.a($$5, $$1, $$2, 10, 28);
         if (exc.this.aA.c((double)$$3, (double)$$4) && $$3 >= $$1 && $$3 <= $$1 + 10 && $$4 >= $$2 && $$4 <= $$2 + 28) {
            exc.this.d($$6.get());
         }
      }

      protected void a(fdl $$0, int $$1, int $$2, exy $$3) {
         int $$4 = this.b($$2);
         int $$5 = this.a($$1);
         int $$6 = this.d($$5);
         if (!exc.this.h($$3)) {
            $$0.a(exc.this.m, $$3.f, $$4, this.d($$5), -8355712, false);
         } else if ($$3.j) {
            wi $$7 = $$3.k ? exc.L : exc.J;
            $$0.a(exc.this.m, $$7, $$4, $$6, -2142128, false);
         }
      }

      protected void a(fdl $$0, String $$1, int $$2, int $$3, int $$4, int $$5) {
         int $$6 = $$4 - $$2;
         if (exc.this.m.b($$1) > $$6) {
            String $$7 = exc.this.m.a($$1, $$6 - exc.this.m.b("... "));
            $$0.a(exc.this.m, $$7 + "...", $$2, $$3, $$5, false);
         } else {
            $$0.a(exc.this.m, $$1, $$2, $$3, $$5, false);
         }
      }

      protected int a(int $$0, int $$1, wi $$2) {
         return $$0 + $$1 - exc.this.m.a($$2) - 20;
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

   static class g extends ffd.b {
      private static final ajv[] d = new ajv[]{
         new ajv("notification/1"),
         new ajv("notification/2"),
         new ajv("notification/3"),
         new ajv("notification/4"),
         new ajv("notification/5"),
         new ajv("notification/more")
      };
      private static final int u = Integer.MAX_VALUE;
      private static final int v = 20;
      private static final int w = 14;
      private int x;

      public g(wi $$0, ajv $$1, fdy.c $$2) {
         super(20, 20, $$0, 14, 14, $$1, $$2, null);
      }

      int a() {
         return this.x;
      }

      public void a(int $$0) {
         this.x = $$0;
      }

      @Override
      public void b(fdl $$0, int $$1, int $$2, float $$3) {
         super.b($$0, $$1, $$2, $$3);
         if (this.j && this.x != 0) {
            this.a($$0);
         }
      }

      private void a(fdl $$0) {
         $$0.a(d[Math.min(this.x, 6) - 1], this.C() + this.x() - 5, this.D() - 3, 8, 8);
      }
   }

   class h extends exc.e {
      private static final int c = 40;
      private static final int d = -12303292;
      private final wi e;
      private final int f;
      private final List<fdw> g = new ArrayList<>();
      @Nullable
      private final exc.c h;
      private final fes i;
      private final fhk j;
      private final fhj k;
      private int l = -1;

      public h(wi $$0, int $$1, exx $$2) {
         this.e = $$0;
         this.f = $$1;
         this.j = new fhk();
         int $$3 = 7;
         this.j.a(fel.a(20, 20, exc.a), 0, 0, this.j.b().a(7, 7, 0, 0));
         this.j.a(fhq.a(40), 0, 0);
         this.k = this.j.a(new fhj(0, 9 * 3 * ($$1 - 1)), 0, 1, this.j.b().c(7));
         this.i = this.k.a(new fes($$0, exc.this.m).b(true), this.k.b().b().d());
         this.j.a(fhq.a(40), 0, 2);
         if ($$2.b()) {
            this.h = this.j.a(new exc.c($$1x -> exc.this.a($$2.c()), wi.c("mco.notification.dismiss")), 0, 2, this.j.b().c().a(0, 7, 7, 0));
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
      public void b(fdl $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         super.b($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
         $$0.b($$3 - 2, $$2 - 2, $$4, 36 * this.f - 2, -12303292);
      }

      @Override
      public void a(fdl $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
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
      public wi a() {
         return this.e;
      }
   }

   class i extends exc.e {
      private final exy c;
      private final ffm d = new ffm();

      public i(exy $$0) {
         this.c = $$0;
         this.d.a(ffj.a(wi.c("mco.snapshot.parent.tooltip")));
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         return true;
      }

      @Override
      public void a(fdl $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = this.b($$3);
         int $$11 = this.a($$2);
         fao.a($$0, $$3, $$2, 32, this.c.g);
         wi $$12 = exc.a(this.c.t, -8355712);
         int $$13 = this.a($$3, $$4, $$12);
         this.a($$0, this.c.b(), $$10, $$11, $$13, -8355712);
         if ($$12 != wh.a) {
            $$0.a(exc.this.m, $$12, $$13, $$11, -8355712, false);
         }

         $$0.a(exc.this.m, this.c.a(), $$10, this.c($$11), -8355712, false);
         this.a($$0, $$2, $$3, this.c);
         this.a(this.c, $$0, $$3 + $$4, $$2, $$6, $$7);
         this.d.a($$8, this.aI_(), new fie($$3, $$2, $$4, $$5));
      }

      @Override
      public wi a() {
         return wi.b(this.c.c);
      }
   }

   class j extends grt<exc.e> {
      public j() {
         super(exc.this.k, exc.this.l, 0, 36);
      }

      public void a(@Nullable exc.e $$0) {
         super.a($$0);
         exc.this.F();
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
      T request(exh var1) throws eyu;
   }

   class l extends exc.e {
      private static final int c = 36;
      private final exy d;
      private final ffm e = new ffm();

      public l(exy $$0) {
         this.d = $$0;
         boolean $$1 = exc.this.h($$0);
         if (exc.b() && $$1 && $$0.h()) {
            this.e.a(ffj.a(wi.a("mco.snapshot.paired", $$0.s)));
         } else if (!$$1 && $$0.e()) {
            this.e.a(ffj.a(wi.a("mco.snapshot.friendsRealm.upgrade", $$0.f)));
         } else if (!$$1 && $$0.f()) {
            this.e.a(ffj.a(wi.a("mco.snapshot.friendsRealm.downgrade", $$0.t)));
         }
      }

      @Override
      public void a(fdl $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         if (this.d.e == exy.c.c) {
            $$0.a(exc.b, $$3 - 5, $$2 + $$5 / 2 - 10, 40, 20);
            int $$10 = $$2 + $$5 / 2 - 9 / 2;
            $$0.b(exc.this.m, exc.I, $$3 + 40 - 2, $$10, 8388479);
         } else {
            fao.a($$0, $$3, $$2, 32, this.d.g);
            this.a($$0, $$2, $$3, $$4);
            this.a($$0, $$2, $$3);
            this.a($$0, $$2, $$3, this.d);
            this.a(this.d, $$0, $$3 + $$4, $$2, $$6, $$7);
            this.e.a($$8, this.aI_(), new fie($$3, $$2, $$4, $$5));
         }
      }

      private void a(fdl $$0, int $$1, int $$2, int $$3) {
         int $$4 = this.b($$2);
         int $$5 = this.a($$1);
         wi $$6 = exc.a(this.d.t, this.d.d());
         int $$7 = this.a($$2, $$3, $$6);
         this.a($$0, this.d.b(), $$4, $$5, $$7, -1);
         if ($$6 != wh.a) {
            $$0.a(exc.this.m, $$6, $$7, $$5, -8355712, false);
         }
      }

      private void a(fdl $$0, int $$1, int $$2) {
         int $$3 = this.b($$2);
         int $$4 = this.a($$1);
         int $$5 = this.c($$4);
         String $$6 = this.d.c();
         if (this.d.m == exy.d.b && $$6 != null) {
            wi $$7 = wi.b($$6).a(n.h);
            $$0.a(exc.this.m, wi.a("mco.selectServer.minigameName", $$7).b(-171), $$3, $$5, -1, false);
         } else {
            $$0.a(exc.this.m, this.d.a(), $$3, this.c($$4), -8355712, false);
         }
      }

      private void d() {
         exc.this.j.ak().a(gpa.a(auo.zV, 1.0F));
         exc.a(this.d, exc.this);
      }

      private void e() {
         exc.this.j.ak().a(gpa.a(auo.zV, 1.0F));
         ezj $$0 = new ezj(exc.this, this.d);
         exc.this.j.a($$0);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         if (this.d.e == exy.c.c) {
            this.e();
         } else if (exc.this.a(this.d)) {
            if (ac.b() - exc.this.aF < 250L && this.aI_()) {
               this.d();
            }

            exc.this.aF = ac.b();
         }

         return true;
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         if (fhz.a($$0)) {
            if (this.d.e == exy.c.c) {
               this.e();
               return true;
            }

            if (exc.this.a(this.d)) {
               this.d();
               return true;
            }
         }

         return super.a($$0, $$1, $$2);
      }

      @Override
      public wi a() {
         return (wi)(this.d.e == exy.c.c ? exc.U : wi.a("narrator.select", this.d.c));
      }

      public exy c() {
         return this.d;
      }
   }
}
