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

public class eqm extends gkp {
   static final ahg a = new ahg("icon/info");
   static final ahg b = new ahg("icon/new_realm");
   static final ahg c = new ahg("realm_status/expired");
   static final ahg v = new ahg("realm_status/expires_soon");
   static final ahg w = new ahg("realm_status/open");
   static final ahg x = new ahg("realm_status/closed");
   private static final ahg y = new ahg("icon/invite");
   private static final ahg z = new ahg("icon/news");
   static final Logger A = LogUtils.getLogger();
   private static final ahg B = new ahg("textures/gui/title/realms.png");
   private static final ahg C = new ahg("textures/gui/realms/no_realms.png");
   private static final vf D = vf.c("menu.online");
   private static final vf E = vf.c("mco.selectServer.loading");
   static final vf F = vf.c("mco.selectServer.uninitialized");
   static final vf G = vf.c("mco.selectServer.expiredList");
   private static final vf H = vf.c("mco.selectServer.expiredRenew");
   static final vf I = vf.c("mco.selectServer.expiredTrial");
   private static final vf J = vf.c("mco.selectServer.play");
   private static final vf K = vf.c("mco.selectServer.leave");
   private static final vf L = vf.c("mco.selectServer.configure");
   static final vf M = vf.c("mco.selectServer.expired");
   static final vf N = vf.c("mco.selectServer.expires.soon");
   static final vf O = vf.c("mco.selectServer.expires.day");
   static final vf P = vf.c("mco.selectServer.open");
   static final vf Q = vf.c("mco.selectServer.closed");
   static final vf R = vf.a("gui.narrate.button", F);
   private static final vf S = vf.c("mco.selectServer.noRealms");
   private static final vf T = vf.c("mco.invites.nopending");
   private static final vf U = vf.c("mco.invites.pending");
   private static final int V = 100;
   private static final int W = 3;
   private static final int X = 4;
   private static final int Y = 308;
   private static final int Z = 128;
   private static final int aa = 34;
   private static final int ab = 128;
   private static final int ac = 64;
   private static final int ad = 5;
   private static final int ae = 44;
   private static final int af = 11;
   private static final int ag = 40;
   private static final int ah = 20;
   private static final int ai = 216;
   private static final int aj = 36;
   private static final boolean ak = !aa.b().g();
   private static boolean al = ak;
   private final CompletableFuture<eql.a> am = eql.a();
   @Nullable
   private etq.c an;
   private final Set<UUID> ao = new HashSet<>();
   private static boolean ap;
   private final RateLimiter aq;
   private final fdb ar;
   private exg as;
   private exg at;
   private exg au;
   private exg av;
   private exg aw;
   eqm.j ax;
   private esj ay;
   private List<eri> az = List.of();
   private volatile boolean aA;
   @Nullable
   private volatile String aB;
   long aC;
   private final List<erh> aD = new ArrayList<>();
   private exg aE;
   private eqm.g aF;
   private eqm.g aG;
   private eqm.f aH;
   @Nullable
   private faq aI;

   public eqm(fdb $$0) {
      super(D);
      this.ar = $$0;
      this.aq = RateLimiter.create(0.016666668F);
   }

   @Override
   public void aN_() {
      this.ay = new esj(this.f);
      this.ax = new eqm.j();
      vf $$0 = vf.c("mco.invites.title");
      this.aF = new eqm.g($$0, y, $$1x -> this.f.a(new etc(this, $$0)));
      vf $$1 = vf.c("mco.news");
      this.aG = new eqm.g($$1, z, $$0x -> {
         String $$1x = this.aB;
         if ($$1x != null) {
            fbt.a(this, $$1x);
            if (this.aG.a() != 0) {
               etw.a $$2 = etw.b();
               $$2.b = false;
               etw.b($$2);
               this.aG.a(0);
            }
         }
      });
      this.aG.a(eyr.a($$1));
      this.as = exg.a(J, $$0x -> a(this.N(), this)).a(100).a();
      this.av = exg.a(L, $$0x -> this.f(this.N())).a(100).a();
      this.au = exg.a(H, $$0x -> this.e(this.N())).a(100).a();
      this.aw = exg.a(K, $$0x -> this.g(this.N())).a(100).a();
      this.aE = exg.a(vf.c("mco.selectServer.purchase"), $$0x -> this.O()).b(100, 20).a();
      this.at = exg.a(ve.k, $$0x -> this.f.a(this.ar)).a(100).a();
      if (eqr.a == eqr.b.b) {
         this.d(exn.a(vf.b("Snapshot"), vf.b("Release")).a(5, 5, 100, 20, vf.b("Realm"), ($$0x, $$1x) -> {
            al = $$1x;
            this.az = List.of();
            this.J();
         }));
      }

      this.a(eqm.f.a);
      this.I();
      this.am.thenAcceptAsync($$0x -> {
         fdb $$1x = $$0x.a(this.ar);
         if ($$1x == null) {
            this.an = this.a(this.f.aZ());
         } else {
            this.f.a($$1x);
         }
      }, this.j);
   }

   public static boolean b() {
      return ak && al;
   }

   @Override
   protected void c() {
      if (this.aI != null) {
         this.ax.b(this.g, this.h - this.aI.b() - this.aI.c());
         this.aI.a();
      }
   }

   private void D() {
      if (this.ay.a() && this.az.isEmpty() && this.aD.isEmpty()) {
         this.a(eqm.f.b);
      } else {
         this.a(eqm.f.c);
      }
   }

   private void a(eqm.f $$0) {
      if (this.aH != $$0) {
         if (this.aI != null) {
            this.aI.a($$1 -> this.f($$1));
         }

         this.aI = this.b($$0);
         this.aH = $$0;
         this.aI.a($$1 -> {
            exe var10000 = this.d($$1);
         });
         this.c();
      }
   }

   private faq b(eqm.f $$0) {
      faq $$1 = new faq(this);
      $$1.b(44);
      $$1.a(this.E());
      far $$2 = this.c($$0);
      $$2.a();
      $$1.a($$2.u() + 22);
      $$1.b($$2);
      switch ($$0) {
         case a:
            $$1.c(new exv(this.i, E));
            break;
         case b:
            $$1.c(this.H());
            break;
         case c:
            $$1.c(this.ax);
      }

      return $$1;
   }

   private far E() {
      int $$0 = 90;
      fau $$1 = fau.e().a(4);
      $$1.c().e();
      $$1.a(this.aF);
      $$1.a(this.aG);
      fau $$2 = fau.e();
      $$2.c().e();
      $$2.a(fav.a(90));
      $$2.a(ext.a(128, 34, B, 128, 64), fat::b);
      $$2.a(new fao(90, 44)).a($$1, fat::c);
      return $$2;
   }

   private far c(eqm.f $$0) {
      fap $$1 = new fap().c(4);
      fap.b $$2 = $$1.d(3);
      if ($$0 == eqm.f.c) {
         $$2.a(this.as);
         $$2.a(this.av);
         $$2.a(this.au);
         $$2.a(this.aw);
      }

      $$2.a(this.aE);
      $$2.a(this.at);
      return $$1;
   }

   private fau H() {
      fau $$0 = fau.d().a(10);
      $$0.c().b();
      $$0.a(ext.a(130, 64, C, 130, 64));
      exr $$1 = new exr(308, S, this.i, false);
      $$0.a($$1);
      return $$0;
   }

   void I() {
      eri $$0 = this.N();
      this.aE.j = this.aH != eqm.f.a;
      this.as.j = $$0 != null && this.a($$0);
      this.au.j = $$0 != null && this.b($$0);
      this.aw.j = $$0 != null && this.d($$0);
      this.av.j = $$0 != null && this.c($$0);
   }

   boolean a(eri $$0) {
      boolean $$1 = !$$0.j && $$0.e == eri.c.b;
      return $$1 && ($$0.d() || this.h($$0));
   }

   private boolean b(eri $$0) {
      return $$0.j && this.h($$0);
   }

   private boolean c(eri $$0) {
      return this.h($$0) && $$0.e != eri.c.c;
   }

   private boolean d(eri $$0) {
      return !this.h($$0);
   }

   @Override
   public void d() {
      super.d();
      if (this.an != null) {
         this.an.b();
      }
   }

   public static void e() {
      evi.O().aZ().d.a();
   }

   public static void f() {
      evi.O().aZ().c.a();
   }

   private void J() {
      for (etq.e<?> $$0 : this.f.aZ().a()) {
         $$0.a();
      }
   }

   private etq.c a(esh $$0) {
      etq.c $$1 = $$0.a.a();
      $$1.a($$0.c, $$0x -> {
         this.ay.a($$0x.a());
         this.az = $$0x.b();
         this.K();
         boolean $$1x = false;

         for (eri $$2 : this.ay) {
            if (this.i($$2)) {
               $$1x = true;
            }
         }

         if (!ap && $$1x) {
            ap = true;
            this.L();
         }
      });
      a(eqr::d, $$0x -> {
         this.aD.clear();
         this.aD.addAll($$0x);

         for (erh $$1x : $$0x) {
            if ($$1x instanceof erh.a $$2) {
               eyi $$3 = $$2.a(this, this::a);
               if ($$3 != null) {
                  this.f.a($$3);
                  this.a(List.of($$1x));
                  break;
               }
            }
         }

         if (!this.aD.isEmpty() && this.aH != eqm.f.a) {
            this.K();
         }
      });
      $$1.a($$0.d, $$0x -> {
         this.aF.a($$0x);
         this.aF.a($$0x == 0 ? eyr.a(T) : eyr.a(U));
         if ($$0x > 0 && this.aq.tryAcquire(1)) {
            this.f.aW().c(vf.a("mco.configure.world.invite.narration", $$0x));
         }
      });
      $$1.a($$0.e, $$0x -> this.aA = $$0x);
      $$1.a($$0.f, $$1x -> {
         $$0.g.a($$1x);
         this.aB = $$0.g.b();
         this.aG.a($$0.g.a() ? Integer.MAX_VALUE : 0);
      });
      return $$1;
   }

   private void a(Collection<erh> $$0) {
      List<UUID> $$1 = new ArrayList<>($$0.size());

      for (erh $$2 : $$0) {
         if (!$$2.a() && !this.ao.contains($$2.c())) {
            $$1.add($$2.c());
         }
      }

      if (!$$1.isEmpty()) {
         a($$1x -> {
            $$1x.a($$1);
            return null;
         }, $$1x -> this.ao.addAll($$1));
      }
   }

   private static <T> void a(eqm.k<T> $$0, Consumer<T> $$1) {
      evi $$2 = evi.O();
      CompletableFuture.<T>supplyAsync(() -> {
         try {
            return $$0.request(eqr.a($$2));
         } catch (ese var3) {
            throw new RuntimeException(var3);
         }
      }).thenAcceptAsync($$1, $$2).exceptionally($$0x -> {
         A.error("Failed to execute call to Realms Service", $$0x);
         return null;
      });
   }

   private void K() {
      eri $$0 = this.N();
      this.ax.H();

      for (erh $$1 : this.aD) {
         if (this.a($$1)) {
            this.a(List.of($$1));
            break;
         }
      }

      for (eri $$2 : this.az) {
         this.ax.a(new eqm.a($$2));
      }

      for (eri $$3 : this.ay) {
         eqm.e $$4;
         if (b() && !$$3.h()) {
            if ($$3.e == eri.c.c) {
               continue;
            }

            $$4 = new eqm.i($$3);
         } else {
            $$4 = new eqm.l($$3);
         }

         this.ax.a((eqm.e)$$4);
         if ($$0 != null && $$0.a == $$3.a) {
            this.ax.a($$4);
         }
      }

      this.D();
      this.I();
   }

   private boolean a(erh $$0) {
      if (!($$0 instanceof erh.c $$1)) {
         return false;
      } else {
         vf $$2 = $$1.d();
         int $$3 = this.i.b($$2, 216);
         int $$4 = auo.e($$3 + 7, 36) - 1;
         this.ax.a(new eqm.h($$2, $$4 + 2, $$1));

         for (int $$5 = 0; $$5 < $$4; $$5++) {
            this.ax.a(new eqm.d());
         }

         this.ax.a(new eqm.b($$1.a(this)));
         return true;
      }
   }

   private void L() {
      new Thread(() -> {
         List<ers> $$0 = eqq.a();
         eqr $$1 = eqr.a();
         erd $$2 = new erd();
         $$2.a = $$0;
         $$2.b = this.M();

         try {
            $$1.a($$2);
         } catch (Throwable var5) {
            A.warn("Could not send ping result to Realms: ", var5);
         }
      }).start();
   }

   private List<Long> M() {
      List<Long> $$0 = Lists.newArrayList();

      for (eri $$1 : this.ay) {
         if (this.i($$1)) {
            $$0.add($$1.a);
         }
      }

      return $$0;
   }

   private void e(@Nullable eri $$0) {
      if ($$0 != null) {
         String $$1 = atk.a($$0.b, this.f.V().b(), $$0.k);
         this.f.o.a($$1);
         ac.j().a($$1);
      }
   }

   private void f(@Nullable eri $$0) {
      if ($$0 != null && this.f.b($$0.g)) {
         this.f.a(new esr(this, $$0.a));
      }
   }

   private void g(@Nullable eri $$0) {
      if ($$0 != null && !this.f.b($$0.g)) {
         vf $$1 = vf.c("mco.configure.world.leave.question.line1");
         vf $$2 = vf.c("mco.configure.world.leave.question.line2");
         this.f.a(new esx($$1x -> this.a($$1x, $$0), esx.a.b, $$1, $$2, true));
      }
   }

   @Nullable
   private eri N() {
      return this.ax.i() instanceof eqm.l $$0 ? $$0.c() : null;
   }

   private void a(boolean $$0, final eri $$1) {
      if ($$0) {
         (new Thread("Realms-leave-server") {
            @Override
            public void run() {
               try {
                  eqr $$0 = eqr.a();
                  $$0.d($$1.a);
                  eqm.this.f.execute(eqm::f);
               } catch (ese var2) {
                  eqm.A.error("Couldn't configure world", var2);
                  eqm.this.f.execute(() -> eqm.this.f.a(new esv(var2, eqm.this)));
               }
            }
         }).start();
      }

      this.f.a(this);
   }

   void a(UUID $$0) {
      a($$1 -> {
         $$1.b(List.of($$0));
         return null;
      }, $$1 -> {
         this.aD.removeIf($$1x -> $$1x.b() && $$0.equals($$1x.c()));
         this.K();
      });
   }

   public void g() {
      this.ax.a(null);
      f();
   }

   @Override
   public vf h() {
      return (vf)(switch (this.aH) {
         case a -> ve.a(super.h(), E);
         case b -> ve.a(super.h(), S);
         case c -> super.h();
      });
   }

   @Override
   public void a(ewu $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (b()) {
         $$0.b(this.i, "Minecraft " + aa.b().c(), 2, this.h - 10, -1);
      }

      if (this.aA && this.aE.j) {
         ete.a($$0, this.aE);
      }

      switch (eqr.a) {
         case b:
            this.a($$0, "STAGE!", -256);
            break;
         case c:
            this.a($$0, "LOCAL!", 8388479);
      }
   }

   private void O() {
      this.f.a(new ete(this, this.aA));
   }

   public static void a(@Nullable eri $$0, fdb $$1) {
      a($$0, $$1, false);
   }

   public static void a(@Nullable eri $$0, fdb $$1, boolean $$2) {
      if ($$0 != null) {
         if (!b() || $$2) {
            evi.O().a(new esy($$1, new euh($$1, $$0)));
            return;
         }

         switch ($$0.u) {
            case e:
               evi.O().a(new esy($$1, new euh($$1, $$0)));
               break;
            case a:
               a($$0, $$1, vf.c("mco.compatibility.unverifiable.title").b(-171), vf.c("mco.compatibility.unverifiable.message"), ve.j);
               break;
            case c:
               a(
                  $$0,
                  $$1,
                  vf.c("selectWorld.backupQuestion.downgrade").b(-2142128),
                  vf.a("mco.compatibility.downgrade.description", vf.b($$0.t).b(-171), vf.b(aa.b().c()).b(-171)),
                  vf.c("mco.compatibility.downgrade")
               );
               break;
            case d:
               a(
                  $$0,
                  $$1,
                  vf.c("mco.compatibility.upgrade.title").b(-171),
                  vf.a("mco.compatibility.upgrade.description", vf.b($$0.t).b(-171), vf.b(aa.b().c()).b(-171)),
                  vf.c("mco.compatibility.upgrade")
               );
         }
      }
   }

   private static void a(eri $$0, fdb $$1, vf $$2, vf $$3, vf $$4) {
      evi.O().a(new fbu($$2x -> {
         fdb $$3x;
         if ($$2x) {
            $$3x = new esy($$1, new euh($$1, $$0));
            f();
         } else {
            $$3x = $$1;
         }

         evi.O().a($$3x);
      }, $$2, $$3, $$4, ve.e));
   }

   public static vf a(String $$0, boolean $$1) {
      return a($$0, $$1 ? -8355712 : -2142128);
   }

   public static vf a(String $$0, int $$1) {
      return (vf)(StringUtils.isBlank($$0) ? ve.a : vf.a("mco.version", vf.b($$0).b($$1)));
   }

   boolean h(eri $$0) {
      return this.f.b($$0.g);
   }

   private boolean i(eri $$0) {
      return this.h($$0) && !$$0.j;
   }

   private void a(ewu $$0, String $$1, int $$2) {
      $$0.c().a();
      $$0.c().a((float)(this.g / 2 - 25), 20.0F, 0.0F);
      $$0.c().a(a.f.rotationDegrees(-20.0F));
      $$0.c().b(1.5F, 1.5F, 1.5F);
      $$0.a(this.i, $$1, 0, 0, $$2, false);
      $$0.c().b();
   }

   class a extends eqm.e {
      private static final vf c = vf.c("mco.snapshot.start");
      private static final int d = 5;
      private final eyr e;
      private final eri f;

      public a(eri $$0) {
         this.f = $$0;
         this.e = eyr.a(vf.c("mco.snapshot.tooltip"));
      }

      @Override
      public void a(ewu $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(eqm.b, $$3 - 5, $$2 + $$5 / 2 - 10, 40, 20);
         int $$10 = $$2 + $$5 / 2 - 9 / 2;
         $$0.b(eqm.this.i, c, $$3 + 40 - 2, $$10 - 5, 8388479);
         $$0.b(eqm.this.i, vf.a("mco.snapshot.description", this.f.c), $$3 + 40 - 2, $$10 + 5, -8355712);
         this.e.a($$8, this.aI_(), new fbj($$3, $$2, $$4, $$5));
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         this.c();
         return true;
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         if (fbe.a($$0)) {
            this.c();
            return true;
         } else {
            return super.a($$0, $$1, $$2);
         }
      }

      private void c() {
         eqm.this.f.ai().a(ghv.a(ars.zu, 1.0F));
         eqm.this.f
            .a(
               new eyi.a(eqm.this, vf.c("mco.snapshot.createSnapshotPopup.title"))
                  .a(vf.c("mco.snapshot.createSnapshotPopup.text"))
                  .a(vf.c("mco.selectServer.create"), $$0 -> eqm.this.f.a(new est(eqm.this, this.f.a)))
                  .a(ve.e, eyi::aE_)
                  .a()
            );
      }

      @Override
      public vf a() {
         return vf.a("gui.narrate.button", ve.a(c, vf.a("mco.snapshot.description", this.f.c)));
      }
   }

   class b extends eqm.e {
      private final exg c;

      public b(exg $$0) {
         this.c = $$0;
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         this.c.a($$0, $$1, $$2);
         return true;
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         return this.c.a($$0, $$1, $$2) ? true : super.a($$0, $$1, $$2);
      }

      @Override
      public void a(ewu $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.c.c(eqm.this.g / 2 - 75, $$2 + 4);
         this.c.a($$0, $$6, $$7, $$9);
      }

      @Override
      public void a(boolean $$0) {
         super.a($$0);
         this.c.a($$0);
      }

      @Override
      public vf a() {
         return this.c.x();
      }
   }

   static class c extends exs {
      private static final eyt b = new eyt(new ahg("widget/cross_button"), new ahg("widget/cross_button_highlighted"));

      protected c(exg.c $$0, vf $$1) {
         super(0, 0, 14, 14, b, $$0);
         this.a(eyr.a($$1));
      }
   }

   class d extends eqm.e {
      @Override
      public void a(ewu $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
      }

      @Override
      public vf a() {
         return vf.i();
      }
   }

   abstract class e extends eyc.a<eqm.e> {
      private static final int a = 10;
      private static final int c = 28;
      private static final int d = 7;

      protected void a(eri $$0, ewu $$1, int $$2, int $$3, int $$4, int $$5) {
         int $$6 = $$2 - 10 - 7;
         int $$7 = $$3 + 2;
         if ($$0.j) {
            this.a($$1, $$6, $$7, $$4, $$5, eqm.c, () -> eqm.M);
         } else if ($$0.e == eri.c.a) {
            this.a($$1, $$6, $$7, $$4, $$5, eqm.x, () -> eqm.Q);
         } else if (eqm.this.h($$0) && $$0.l < 7) {
            this.a($$1, $$6, $$7, $$4, $$5, eqm.v, () -> {
               if ($$0.l <= 0) {
                  return eqm.N;
               } else {
                  return (vf)($$0.l == 1 ? eqm.O : vf.a("mco.selectServer.expires.days", $$0.l));
               }
            });
         } else if ($$0.e == eri.c.b) {
            this.a($$1, $$6, $$7, $$4, $$5, eqm.w, () -> eqm.P);
         }
      }

      private void a(ewu $$0, int $$1, int $$2, int $$3, int $$4, ahg $$5, Supplier<vf> $$6) {
         $$0.a($$5, $$1, $$2, 10, 28);
         if (eqm.this.ax.c((double)$$3, (double)$$4) && $$3 >= $$1 && $$3 <= $$1 + 10 && $$4 >= $$2 && $$4 <= $$2 + 28) {
            eqm.this.d($$6.get());
         }
      }

      protected void a(ewu $$0, int $$1, int $$2, eri $$3) {
         int $$4 = this.b($$2);
         int $$5 = this.a($$1);
         int $$6 = this.d($$5);
         if (!eqm.this.h($$3)) {
            $$0.a(eqm.this.i, $$3.f, $$4, this.d($$5), -8355712, false);
         } else if ($$3.j) {
            vf $$7 = $$3.k ? eqm.I : eqm.G;
            $$0.a(eqm.this.i, $$7, $$4, $$6, -2142128, false);
         }
      }

      protected void a(ewu $$0, String $$1, int $$2, int $$3, int $$4, int $$5) {
         int $$6 = $$4 - $$2;
         if (eqm.this.i.b($$1) > $$6) {
            String $$7 = eqm.this.i.a($$1, $$6 - eqm.this.i.b("... "));
            $$0.a(eqm.this.i, $$7 + "...", $$2, $$3, $$5, false);
         } else {
            $$0.a(eqm.this.i, $$1, $$2, $$3, $$5, false);
         }
      }

      protected int a(int $$0, int $$1, vf $$2) {
         return $$0 + $$1 - eqm.this.i.a($$2) - 20;
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

   static class g extends eyl.b {
      private static final ahg[] d = new ahg[]{
         new ahg("notification/1"),
         new ahg("notification/2"),
         new ahg("notification/3"),
         new ahg("notification/4"),
         new ahg("notification/5"),
         new ahg("notification/more")
      };
      private static final int t = Integer.MAX_VALUE;
      private static final int u = 20;
      private static final int v = 14;
      private int w;

      public g(vf $$0, ahg $$1, exg.c $$2) {
         super(20, 20, $$0, 14, 14, $$1, $$2);
      }

      int a() {
         return this.w;
      }

      public void a(int $$0) {
         this.w = $$0;
      }

      @Override
      public void b(ewu $$0, int $$1, int $$2, float $$3) {
         super.b($$0, $$1, $$2, $$3);
         if (this.j && this.w != 0) {
            this.a($$0);
         }
      }

      private void a(ewu $$0) {
         $$0.a(d[Math.min(this.w, 6) - 1], this.B() + this.w() - 5, this.C() - 3, 8, 8);
      }
   }

   class h extends eqm.e {
      private static final int c = 40;
      private static final int d = -12303292;
      private final vf e;
      private final int f;
      private final List<exe> g = new ArrayList<>();
      @Nullable
      private final eqm.c h;
      private final eya i;
      private final fap j;
      private final fao k;
      private int l = -1;

      public h(vf $$0, int $$1, erh $$2) {
         this.e = $$0;
         this.f = $$1;
         this.j = new fap();
         int $$3 = 7;
         this.j.a(ext.a(20, 20, eqm.a), 0, 0, this.j.b().a(7, 7, 0, 0));
         this.j.a(fav.a(40), 0, 0);
         this.k = this.j.a(new fao(0, 9 * 3 * ($$1 - 1)), 0, 1, this.j.b().c(7));
         this.i = this.k.a(new eya($$0, eqm.this.i).b(true), this.k.b().b().d());
         this.j.a(fav.a(40), 0, 2);
         if ($$2.b()) {
            this.h = this.j.a(new eqm.c($$1x -> eqm.this.a($$2.c()), vf.c("mco.notification.dismiss")), 0, 2, this.j.b().c().a(0, 7, 7, 0));
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
         this.i.c($$1);
         this.j.a();
      }

      @Override
      public void b(ewu $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         super.b($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
         $$0.b($$3 - 2, $$2 - 2, $$4, 36 * this.f - 2, -12303292);
      }

      @Override
      public void a(ewu $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.j.c($$3, $$2);
         this.e($$4 - 4);
         this.g.forEach($$4x -> $$4x.a($$0, $$6, $$7, $$9));
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         if (this.h != null) {
            this.h.a($$0, $$1, $$2);
         }

         return true;
      }

      @Override
      public vf a() {
         return this.e;
      }
   }

   class i extends eqm.e {
      private final eri c;
      private final eyr d;

      public i(eri $$0) {
         this.c = $$0;
         this.d = eyr.a(vf.c("mco.snapshot.parent.tooltip"));
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         return true;
      }

      @Override
      public void a(ewu $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = this.b($$3);
         int $$11 = this.a($$2);
         ety.a($$0, $$3, $$2, 32, this.c.g);
         vf $$12 = eqm.a(this.c.t, -8355712);
         int $$13 = this.a($$3, $$4, $$12);
         this.a($$0, this.c.b(), $$10, $$11, $$13, -8355712);
         if ($$12 != ve.a) {
            $$0.a(eqm.this.i, $$12, $$13, $$11, -8355712, false);
         }

         $$0.a(eqm.this.i, this.c.a(), $$10, this.c($$11), -8355712, false);
         this.a($$0, $$2, $$3, this.c);
         this.a(this.c, $$0, $$3 + $$4, $$2, $$6, $$7);
         this.d.a($$8, this.aI_(), new fbj($$3, $$2, $$4, $$5));
      }

      @Override
      public vf a() {
         return vf.b(this.c.c);
      }
   }

   class j extends gko<eqm.e> {
      public j() {
         super(eqm.this.g, eqm.this.h, 0, 36);
      }

      public void a(@Nullable eqm.e $$0) {
         super.a($$0);
         eqm.this.I();
      }

      @Override
      public int a() {
         return this.n() * 36;
      }

      @Override
      public int b() {
         return 300;
      }
   }

   interface k<T> {
      T request(eqr var1) throws ese;
   }

   class l extends eqm.e {
      private static final int c = 36;
      private final eri d;
      @Nullable
      private final eyr e;

      public l(eri $$0) {
         this.d = $$0;
         boolean $$1 = eqm.this.h($$0);
         if (eqm.b() && $$1 && $$0.h()) {
            this.e = eyr.a(vf.a("mco.snapshot.paired", $$0.s));
         } else if (!$$1 && $$0.e()) {
            this.e = eyr.a(vf.a("mco.snapshot.friendsRealm.upgrade", $$0.f));
         } else if (!$$1 && $$0.f()) {
            this.e = eyr.a(vf.a("mco.snapshot.friendsRealm.downgrade", $$0.t));
         } else {
            this.e = null;
         }
      }

      @Override
      public void a(ewu $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         if (this.d.e == eri.c.c) {
            $$0.a(eqm.b, $$3 - 5, $$2 + $$5 / 2 - 10, 40, 20);
            int $$10 = $$2 + $$5 / 2 - 9 / 2;
            $$0.b(eqm.this.i, eqm.F, $$3 + 40 - 2, $$10, 8388479);
         } else {
            ety.a($$0, $$3, $$2, 32, this.d.g);
            this.a($$0, $$2, $$3, $$4);
            this.a($$0, $$2, $$3);
            this.a($$0, $$2, $$3, this.d);
            this.a(this.d, $$0, $$3 + $$4, $$2, $$6, $$7);
            if (this.e != null) {
               this.e.a($$8, this.aI_(), new fbj($$3, $$2, $$4, $$5));
            }
         }
      }

      private void a(ewu $$0, int $$1, int $$2, int $$3) {
         int $$4 = this.b($$2);
         int $$5 = this.a($$1);
         vf $$6 = eqm.a(this.d.t, this.d.d());
         int $$7 = this.a($$2, $$3, $$6);
         this.a($$0, this.d.b(), $$4, $$5, $$7, -1);
         if ($$6 != ve.a) {
            $$0.a(eqm.this.i, $$6, $$7, $$5, -8355712, false);
         }
      }

      private void a(ewu $$0, int $$1, int $$2) {
         int $$3 = this.b($$2);
         int $$4 = this.a($$1);
         int $$5 = this.c($$4);
         if (this.d.m == eri.d.b) {
            vf $$6 = vf.b(this.d.c()).a(n.h);
            $$0.a(eqm.this.i, vf.a("mco.selectServer.minigameName", $$6).b(-171), $$3, $$5, -1, false);
         } else {
            $$0.a(eqm.this.i, this.d.a(), $$3, this.c($$4), -8355712, false);
         }
      }

      private void d() {
         eqm.this.f.ai().a(ghv.a(ars.zu, 1.0F));
         eqm.a(this.d, eqm.this);
      }

      private void e() {
         eqm.this.f.ai().a(ghv.a(ars.zu, 1.0F));
         est $$0 = new est(eqm.this, this.d);
         eqm.this.f.a($$0);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         if (this.d.e == eri.c.c) {
            this.e();
         } else if (eqm.this.a(this.d)) {
            if (ac.b() - eqm.this.aC < 250L && this.aI_()) {
               this.d();
            }

            eqm.this.aC = ac.b();
         }

         return true;
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         if (fbe.a($$0)) {
            if (this.d.e == eri.c.c) {
               this.e();
               return true;
            }

            if (eqm.this.a(this.d)) {
               this.d();
               return true;
            }
         }

         return super.a($$0, $$1, $$2);
      }

      @Override
      public vf a() {
         return (vf)(this.d.e == eri.c.c ? eqm.R : vf.a("narrator.select", this.d.c));
      }

      public eri c() {
         return this.d;
      }
   }
}
