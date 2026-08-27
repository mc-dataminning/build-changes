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

public class eqv extends gld {
   static final ahh a = new ahh("icon/info");
   static final ahh b = new ahh("icon/new_realm");
   static final ahh c = new ahh("realm_status/expired");
   static final ahh v = new ahh("realm_status/expires_soon");
   static final ahh w = new ahh("realm_status/open");
   static final ahh x = new ahh("realm_status/closed");
   private static final ahh y = new ahh("icon/invite");
   private static final ahh z = new ahh("icon/news");
   static final Logger A = LogUtils.getLogger();
   private static final ahh B = new ahh("textures/gui/title/realms.png");
   private static final ahh C = new ahh("textures/gui/realms/no_realms.png");
   private static final vg D = vg.c("menu.online");
   private static final vg E = vg.c("mco.selectServer.loading");
   static final vg F = vg.c("mco.selectServer.uninitialized");
   static final vg G = vg.c("mco.selectServer.expiredList");
   private static final vg H = vg.c("mco.selectServer.expiredRenew");
   static final vg I = vg.c("mco.selectServer.expiredTrial");
   private static final vg J = vg.c("mco.selectServer.play");
   private static final vg K = vg.c("mco.selectServer.leave");
   private static final vg L = vg.c("mco.selectServer.configure");
   static final vg M = vg.c("mco.selectServer.expired");
   static final vg N = vg.c("mco.selectServer.expires.soon");
   static final vg O = vg.c("mco.selectServer.expires.day");
   static final vg P = vg.c("mco.selectServer.open");
   static final vg Q = vg.c("mco.selectServer.closed");
   static final vg R = vg.a("gui.narrate.button", F);
   private static final vg S = vg.c("mco.selectServer.noRealms");
   private static final vg T = vg.c("mco.invites.nopending");
   private static final vg U = vg.c("mco.invites.pending");
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
   private final CompletableFuture<equ.a> am = equ.a();
   @Nullable
   private etz.c an;
   private final Set<UUID> ao = new HashSet<>();
   private static boolean ap;
   private final RateLimiter aq;
   private final fdm ar;
   private exr as;
   private exr at;
   private exr au;
   private exr av;
   private exr aw;
   eqv.j ax;
   private ess ay;
   private List<err> az = List.of();
   private volatile boolean aA;
   @Nullable
   private volatile String aB;
   long aC;
   private final List<erq> aD = new ArrayList<>();
   private exr aE;
   private eqv.g aF;
   private eqv.g aG;
   private eqv.f aH;
   @Nullable
   private fbb aI;

   public eqv(fdm $$0) {
      super(D);
      this.ar = $$0;
      this.aq = RateLimiter.create(0.016666668F);
   }

   @Override
   public void aP_() {
      this.ay = new ess(this.f);
      this.ax = new eqv.j();
      vg $$0 = vg.c("mco.invites.title");
      this.aF = new eqv.g($$0, y, $$1x -> this.f.a(new etl(this, $$0)));
      vg $$1 = vg.c("mco.news");
      this.aG = new eqv.g($$1, z, $$0x -> {
         String $$1x = this.aB;
         if ($$1x != null) {
            fce.a(this, $$1x);
            if (this.aG.a() != 0) {
               euf.a $$2 = euf.b();
               $$2.b = false;
               euf.b($$2);
               this.aG.a(0);
            }
         }
      });
      this.aG.a(ezc.a($$1));
      this.as = exr.a(J, $$0x -> a(this.O(), this)).a(100).a();
      this.av = exr.a(L, $$0x -> this.f(this.O())).a(100).a();
      this.au = exr.a(H, $$0x -> this.e(this.O())).a(100).a();
      this.aw = exr.a(K, $$0x -> this.g(this.O())).a(100).a();
      this.aE = exr.a(vg.c("mco.selectServer.purchase"), $$0x -> this.P()).b(100, 20).a();
      this.at = exr.a(vf.k, $$0x -> this.d()).a(100).a();
      if (era.a == era.b.b) {
         this.d(exy.a(vg.b("Snapshot"), vg.b("Release")).a(5, 5, 100, 20, vg.b("Realm"), ($$0x, $$1x) -> {
            al = $$1x;
            this.az = List.of();
            this.K();
         }));
      }

      this.a(eqv.f.a);
      this.J();
      this.am.thenAcceptAsync($$0x -> {
         fdm $$1x = $$0x.a(this.ar);
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

   @Override
   public void d() {
      this.f.a(this.ar);
   }

   private void E() {
      if (this.ay.a() && this.az.isEmpty() && this.aD.isEmpty()) {
         this.a(eqv.f.b);
      } else {
         this.a(eqv.f.c);
      }
   }

   private void a(eqv.f $$0) {
      if (this.aH != $$0) {
         if (this.aI != null) {
            this.aI.a($$1 -> this.f($$1));
         }

         this.aI = this.b($$0);
         this.aH = $$0;
         this.aI.a($$1 -> {
            exp var10000 = this.d($$1);
         });
         this.c();
      }
   }

   private fbb b(eqv.f $$0) {
      fbb $$1 = new fbb(this);
      $$1.b(44);
      $$1.a(this.H());
      fbc $$2 = this.c($$0);
      $$2.a();
      $$1.a($$2.u() + 22);
      $$1.b($$2);
      switch ($$0) {
         case a:
            $$1.c(new eyg(this.i, E));
            break;
         case b:
            $$1.c(this.I());
            break;
         case c:
            $$1.c(this.ax);
      }

      return $$1;
   }

   private fbc H() {
      int $$0 = 90;
      fbf $$1 = fbf.e().a(4);
      $$1.c().e();
      $$1.a(this.aF);
      $$1.a(this.aG);
      fbf $$2 = fbf.e();
      $$2.c().e();
      $$2.a(fbg.a(90));
      $$2.a(eye.a(128, 34, B, 128, 64), fbe::b);
      $$2.a(new faz(90, 44)).a($$1, fbe::c);
      return $$2;
   }

   private fbc c(eqv.f $$0) {
      fba $$1 = new fba().c(4);
      fba.b $$2 = $$1.d(3);
      if ($$0 == eqv.f.c) {
         $$2.a(this.as);
         $$2.a(this.av);
         $$2.a(this.au);
         $$2.a(this.aw);
      }

      $$2.a(this.aE);
      $$2.a(this.at);
      return $$1;
   }

   private fbf I() {
      fbf $$0 = fbf.d().a(10);
      $$0.c().b();
      $$0.a(eye.a(130, 64, C, 130, 64));
      eyc $$1 = new eyc(308, S, this.i, false);
      $$0.a($$1);
      return $$0;
   }

   void J() {
      err $$0 = this.O();
      this.aE.j = this.aH != eqv.f.a;
      this.as.j = $$0 != null && this.a($$0);
      this.au.j = $$0 != null && this.b($$0);
      this.aw.j = $$0 != null && this.d($$0);
      this.av.j = $$0 != null && this.c($$0);
   }

   boolean a(err $$0) {
      boolean $$1 = !$$0.j && $$0.e == err.c.b;
      return $$1 && ($$0.d() || this.h($$0));
   }

   private boolean b(err $$0) {
      return $$0.j && this.h($$0);
   }

   private boolean c(err $$0) {
      return this.h($$0) && $$0.e != err.c.c;
   }

   private boolean d(err $$0) {
      return !this.h($$0);
   }

   @Override
   public void e() {
      super.e();
      if (this.an != null) {
         this.an.b();
      }
   }

   public static void f() {
      evr.O().aZ().d.a();
   }

   public static void g() {
      evr.O().aZ().c.a();
   }

   private void K() {
      for (etz.e<?> $$0 : this.f.aZ().a()) {
         $$0.a();
      }
   }

   private etz.c a(esq $$0) {
      etz.c $$1 = $$0.a.a();
      $$1.a($$0.c, $$0x -> {
         this.ay.a($$0x.a());
         this.az = $$0x.b();
         this.L();
         boolean $$1x = false;

         for (err $$2 : this.ay) {
            if (this.i($$2)) {
               $$1x = true;
            }
         }

         if (!ap && $$1x) {
            ap = true;
            this.M();
         }
      });
      a(era::d, $$0x -> {
         this.aD.clear();
         this.aD.addAll($$0x);

         for (erq $$1x : $$0x) {
            if ($$1x instanceof erq.a $$2) {
               eyt $$3 = $$2.a(this, this::a);
               if ($$3 != null) {
                  this.f.a($$3);
                  this.a(List.of($$1x));
                  break;
               }
            }
         }

         if (!this.aD.isEmpty() && this.aH != eqv.f.a) {
            this.L();
         }
      });
      $$1.a($$0.d, $$0x -> {
         this.aF.a($$0x);
         this.aF.a($$0x == 0 ? ezc.a(T) : ezc.a(U));
         if ($$0x > 0 && this.aq.tryAcquire(1)) {
            this.f.aW().c(vg.a("mco.configure.world.invite.narration", $$0x));
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

   private void a(Collection<erq> $$0) {
      List<UUID> $$1 = new ArrayList<>($$0.size());

      for (erq $$2 : $$0) {
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

   private static <T> void a(eqv.k<T> $$0, Consumer<T> $$1) {
      evr $$2 = evr.O();
      CompletableFuture.<T>supplyAsync(() -> {
         try {
            return $$0.request(era.a($$2));
         } catch (esn var3) {
            throw new RuntimeException(var3);
         }
      }).thenAcceptAsync($$1, $$2).exceptionally($$0x -> {
         A.error("Failed to execute call to Realms Service", $$0x);
         return null;
      });
   }

   private void L() {
      err $$0 = this.O();
      this.ax.H();

      for (erq $$1 : this.aD) {
         if (this.a($$1)) {
            this.a(List.of($$1));
            break;
         }
      }

      for (err $$2 : this.az) {
         this.ax.a(new eqv.a($$2));
      }

      for (err $$3 : this.ay) {
         eqv.e $$4;
         if (b() && !$$3.h()) {
            if ($$3.e == err.c.c) {
               continue;
            }

            $$4 = new eqv.i($$3);
         } else {
            $$4 = new eqv.l($$3);
         }

         this.ax.a((eqv.e)$$4);
         if ($$0 != null && $$0.a == $$3.a) {
            this.ax.a($$4);
         }
      }

      this.E();
      this.J();
   }

   private boolean a(erq $$0) {
      if (!($$0 instanceof erq.c $$1)) {
         return false;
      } else {
         vg $$2 = $$1.d();
         int $$3 = this.i.b($$2, 216);
         int $$4 = aup.e($$3 + 7, 36) - 1;
         this.ax.a(new eqv.h($$2, $$4 + 2, $$1));

         for (int $$5 = 0; $$5 < $$4; $$5++) {
            this.ax.a(new eqv.d());
         }

         this.ax.a(new eqv.b($$1.a(this)));
         return true;
      }
   }

   private void M() {
      new Thread(() -> {
         List<esb> $$0 = eqz.a();
         era $$1 = era.a();
         erm $$2 = new erm();
         $$2.a = $$0;
         $$2.b = this.N();

         try {
            $$1.a($$2);
         } catch (Throwable var5) {
            A.warn("Could not send ping result to Realms: ", var5);
         }
      }).start();
   }

   private List<Long> N() {
      List<Long> $$0 = Lists.newArrayList();

      for (err $$1 : this.ay) {
         if (this.i($$1)) {
            $$0.add($$1.a);
         }
      }

      return $$0;
   }

   private void e(@Nullable err $$0) {
      if ($$0 != null) {
         String $$1 = atl.a($$0.b, this.f.V().b(), $$0.k);
         this.f.o.a($$1);
         ac.j().a($$1);
      }
   }

   private void f(@Nullable err $$0) {
      if ($$0 != null && this.f.b($$0.g)) {
         this.f.a(new eta(this, $$0.a));
      }
   }

   private void g(@Nullable err $$0) {
      if ($$0 != null && !this.f.b($$0.g)) {
         vg $$1 = vg.c("mco.configure.world.leave.question.line1");
         vg $$2 = vg.c("mco.configure.world.leave.question.line2");
         this.f.a(new etg($$1x -> this.a($$1x, $$0), etg.a.b, $$1, $$2, true));
      }
   }

   @Nullable
   private err O() {
      return this.ax.i() instanceof eqv.l $$0 ? $$0.c() : null;
   }

   private void a(boolean $$0, final err $$1) {
      if ($$0) {
         (new Thread("Realms-leave-server") {
            @Override
            public void run() {
               try {
                  era $$0 = era.a();
                  $$0.d($$1.a);
                  eqv.this.f.execute(eqv::g);
               } catch (esn var2) {
                  eqv.A.error("Couldn't configure world", var2);
                  eqv.this.f.execute(() -> eqv.this.f.a(new ete(var2, eqv.this)));
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
         this.L();
      });
   }

   public void h() {
      this.ax.a(null);
      g();
   }

   @Override
   public vg i() {
      return (vg)(switch (this.aH) {
         case a -> vf.a(super.i(), E);
         case b -> vf.a(super.i(), S);
         case c -> super.i();
      });
   }

   @Override
   public void a(exe $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (b()) {
         $$0.b(this.i, "Minecraft " + aa.b().c(), 2, this.h - 10, -1);
      }

      if (this.aA && this.aE.j) {
         etn.a($$0, this.aE);
      }

      switch (era.a) {
         case b:
            this.a($$0, "STAGE!", -256);
            break;
         case c:
            this.a($$0, "LOCAL!", 8388479);
      }
   }

   private void P() {
      this.f.a(new etn(this, this.aA));
   }

   public static void a(@Nullable err $$0, fdm $$1) {
      a($$0, $$1, false);
   }

   public static void a(@Nullable err $$0, fdm $$1, boolean $$2) {
      if ($$0 != null) {
         if (!b() || $$2) {
            evr.O().a(new eth($$1, new euq($$1, $$0)));
            return;
         }

         switch ($$0.u) {
            case e:
               evr.O().a(new eth($$1, new euq($$1, $$0)));
               break;
            case a:
               a($$0, $$1, vg.c("mco.compatibility.unverifiable.title").b(-171), vg.c("mco.compatibility.unverifiable.message"), vf.j);
               break;
            case c:
               a(
                  $$0,
                  $$1,
                  vg.c("selectWorld.backupQuestion.downgrade").b(-2142128),
                  vg.a("mco.compatibility.downgrade.description", vg.b($$0.t).b(-171), vg.b(aa.b().c()).b(-171)),
                  vg.c("mco.compatibility.downgrade")
               );
               break;
            case d:
               a(
                  $$0,
                  $$1,
                  vg.c("mco.compatibility.upgrade.title").b(-171),
                  vg.a("mco.compatibility.upgrade.description", vg.b($$0.t).b(-171), vg.b(aa.b().c()).b(-171)),
                  vg.c("mco.compatibility.upgrade")
               );
         }
      }
   }

   private static void a(err $$0, fdm $$1, vg $$2, vg $$3, vg $$4) {
      evr.O().a(new fcf($$2x -> {
         fdm $$3x;
         if ($$2x) {
            $$3x = new eth($$1, new euq($$1, $$0));
            g();
         } else {
            $$3x = $$1;
         }

         evr.O().a($$3x);
      }, $$2, $$3, $$4, vf.e));
   }

   public static vg a(String $$0, boolean $$1) {
      return a($$0, $$1 ? -8355712 : -2142128);
   }

   public static vg a(String $$0, int $$1) {
      return (vg)(StringUtils.isBlank($$0) ? vf.a : vg.a("mco.version", vg.b($$0).b($$1)));
   }

   boolean h(err $$0) {
      return this.f.b($$0.g);
   }

   private boolean i(err $$0) {
      return this.h($$0) && !$$0.j;
   }

   private void a(exe $$0, String $$1, int $$2) {
      $$0.c().a();
      $$0.c().a((float)(this.g / 2 - 25), 20.0F, 0.0F);
      $$0.c().a(a.f.rotationDegrees(-20.0F));
      $$0.c().b(1.5F, 1.5F, 1.5F);
      $$0.a(this.i, $$1, 0, 0, $$2, false);
      $$0.c().b();
   }

   class a extends eqv.e {
      private static final vg c = vg.c("mco.snapshot.start");
      private static final int d = 5;
      private final ezc e;
      private final err f;

      public a(err $$0) {
         this.f = $$0;
         this.e = ezc.a(vg.c("mco.snapshot.tooltip"));
      }

      @Override
      public void a(exe $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(eqv.b, $$3 - 5, $$2 + $$5 / 2 - 10, 40, 20);
         int $$10 = $$2 + $$5 / 2 - 9 / 2;
         $$0.b(eqv.this.i, c, $$3 + 40 - 2, $$10 - 5, 8388479);
         $$0.b(eqv.this.i, vg.a("mco.snapshot.description", this.f.c), $$3 + 40 - 2, $$10 + 5, -8355712);
         this.e.a($$8, this.aK_(), new fbu($$3, $$2, $$4, $$5));
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         this.c();
         return true;
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         if (fbp.a($$0)) {
            this.c();
            return true;
         } else {
            return super.a($$0, $$1, $$2);
         }
      }

      private void c() {
         eqv.this.f.ai().a(gij.a(art.zJ, 1.0F));
         eqv.this.f
            .a(
               new eyt.a(eqv.this, vg.c("mco.snapshot.createSnapshotPopup.title"))
                  .a(vg.c("mco.snapshot.createSnapshotPopup.text"))
                  .a(vg.c("mco.selectServer.create"), $$0 -> eqv.this.f.a(new etc(eqv.this, this.f.a)))
                  .a(vf.e, eyt::d)
                  .a()
            );
      }

      @Override
      public vg a() {
         return vg.a("gui.narrate.button", vf.a(c, vg.a("mco.snapshot.description", this.f.c)));
      }
   }

   class b extends eqv.e {
      private final exr c;

      public b(exr $$0) {
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
      public void a(exe $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.c.c(eqv.this.g / 2 - 75, $$2 + 4);
         this.c.a($$0, $$6, $$7, $$9);
      }

      @Override
      public void a(boolean $$0) {
         super.a($$0);
         this.c.a($$0);
      }

      @Override
      public vg a() {
         return this.c.x();
      }
   }

   static class c extends eyd {
      private static final eze b = new eze(new ahh("widget/cross_button"), new ahh("widget/cross_button_highlighted"));

      protected c(exr.c $$0, vg $$1) {
         super(0, 0, 14, 14, b, $$0);
         this.a(ezc.a($$1));
      }
   }

   class d extends eqv.e {
      @Override
      public void a(exe $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
      }

      @Override
      public vg a() {
         return vg.i();
      }
   }

   abstract class e extends eyn.a<eqv.e> {
      private static final int a = 10;
      private static final int c = 28;
      private static final int d = 7;

      protected void a(err $$0, exe $$1, int $$2, int $$3, int $$4, int $$5) {
         int $$6 = $$2 - 10 - 7;
         int $$7 = $$3 + 2;
         if ($$0.j) {
            this.a($$1, $$6, $$7, $$4, $$5, eqv.c, () -> eqv.M);
         } else if ($$0.e == err.c.a) {
            this.a($$1, $$6, $$7, $$4, $$5, eqv.x, () -> eqv.Q);
         } else if (eqv.this.h($$0) && $$0.l < 7) {
            this.a($$1, $$6, $$7, $$4, $$5, eqv.v, () -> {
               if ($$0.l <= 0) {
                  return eqv.N;
               } else {
                  return (vg)($$0.l == 1 ? eqv.O : vg.a("mco.selectServer.expires.days", $$0.l));
               }
            });
         } else if ($$0.e == err.c.b) {
            this.a($$1, $$6, $$7, $$4, $$5, eqv.w, () -> eqv.P);
         }
      }

      private void a(exe $$0, int $$1, int $$2, int $$3, int $$4, ahh $$5, Supplier<vg> $$6) {
         $$0.a($$5, $$1, $$2, 10, 28);
         if (eqv.this.ax.c((double)$$3, (double)$$4) && $$3 >= $$1 && $$3 <= $$1 + 10 && $$4 >= $$2 && $$4 <= $$2 + 28) {
            eqv.this.d($$6.get());
         }
      }

      protected void a(exe $$0, int $$1, int $$2, err $$3) {
         int $$4 = this.b($$2);
         int $$5 = this.a($$1);
         int $$6 = this.d($$5);
         if (!eqv.this.h($$3)) {
            $$0.a(eqv.this.i, $$3.f, $$4, this.d($$5), -8355712, false);
         } else if ($$3.j) {
            vg $$7 = $$3.k ? eqv.I : eqv.G;
            $$0.a(eqv.this.i, $$7, $$4, $$6, -2142128, false);
         }
      }

      protected void a(exe $$0, String $$1, int $$2, int $$3, int $$4, int $$5) {
         int $$6 = $$4 - $$2;
         if (eqv.this.i.b($$1) > $$6) {
            String $$7 = eqv.this.i.a($$1, $$6 - eqv.this.i.b("... "));
            $$0.a(eqv.this.i, $$7 + "...", $$2, $$3, $$5, false);
         } else {
            $$0.a(eqv.this.i, $$1, $$2, $$3, $$5, false);
         }
      }

      protected int a(int $$0, int $$1, vg $$2) {
         return $$0 + $$1 - eqv.this.i.a($$2) - 20;
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

   static class g extends eyw.b {
      private static final ahh[] d = new ahh[]{
         new ahh("notification/1"),
         new ahh("notification/2"),
         new ahh("notification/3"),
         new ahh("notification/4"),
         new ahh("notification/5"),
         new ahh("notification/more")
      };
      private static final int t = Integer.MAX_VALUE;
      private static final int u = 20;
      private static final int v = 14;
      private int w;

      public g(vg $$0, ahh $$1, exr.c $$2) {
         super(20, 20, $$0, 14, 14, $$1, $$2);
      }

      int a() {
         return this.w;
      }

      public void a(int $$0) {
         this.w = $$0;
      }

      @Override
      public void b(exe $$0, int $$1, int $$2, float $$3) {
         super.b($$0, $$1, $$2, $$3);
         if (this.j && this.w != 0) {
            this.a($$0);
         }
      }

      private void a(exe $$0) {
         $$0.a(d[Math.min(this.w, 6) - 1], this.B() + this.w() - 5, this.C() - 3, 8, 8);
      }
   }

   class h extends eqv.e {
      private static final int c = 40;
      private static final int d = -12303292;
      private final vg e;
      private final int f;
      private final List<exp> g = new ArrayList<>();
      @Nullable
      private final eqv.c h;
      private final eyl i;
      private final fba j;
      private final faz k;
      private int l = -1;

      public h(vg $$0, int $$1, erq $$2) {
         this.e = $$0;
         this.f = $$1;
         this.j = new fba();
         int $$3 = 7;
         this.j.a(eye.a(20, 20, eqv.a), 0, 0, this.j.b().a(7, 7, 0, 0));
         this.j.a(fbg.a(40), 0, 0);
         this.k = this.j.a(new faz(0, 9 * 3 * ($$1 - 1)), 0, 1, this.j.b().c(7));
         this.i = this.k.a(new eyl($$0, eqv.this.i).b(true), this.k.b().b().d());
         this.j.a(fbg.a(40), 0, 2);
         if ($$2.b()) {
            this.h = this.j.a(new eqv.c($$1x -> eqv.this.a($$2.c()), vg.c("mco.notification.dismiss")), 0, 2, this.j.b().c().a(0, 7, 7, 0));
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
      public void b(exe $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         super.b($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
         $$0.b($$3 - 2, $$2 - 2, $$4, 36 * this.f - 2, -12303292);
      }

      @Override
      public void a(exe $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
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
      public vg a() {
         return this.e;
      }
   }

   class i extends eqv.e {
      private final err c;
      private final ezc d;

      public i(err $$0) {
         this.c = $$0;
         this.d = ezc.a(vg.c("mco.snapshot.parent.tooltip"));
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         return true;
      }

      @Override
      public void a(exe $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = this.b($$3);
         int $$11 = this.a($$2);
         euh.a($$0, $$3, $$2, 32, this.c.g);
         vg $$12 = eqv.a(this.c.t, -8355712);
         int $$13 = this.a($$3, $$4, $$12);
         this.a($$0, this.c.b(), $$10, $$11, $$13, -8355712);
         if ($$12 != vf.a) {
            $$0.a(eqv.this.i, $$12, $$13, $$11, -8355712, false);
         }

         $$0.a(eqv.this.i, this.c.a(), $$10, this.c($$11), -8355712, false);
         this.a($$0, $$2, $$3, this.c);
         this.a(this.c, $$0, $$3 + $$4, $$2, $$6, $$7);
         this.d.a($$8, this.aK_(), new fbu($$3, $$2, $$4, $$5));
      }

      @Override
      public vg a() {
         return vg.b(this.c.c);
      }
   }

   class j extends glc<eqv.e> {
      public j() {
         super(eqv.this.g, eqv.this.h, 0, 36);
      }

      public void a(@Nullable eqv.e $$0) {
         super.a($$0);
         eqv.this.J();
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
      T request(era var1) throws esn;
   }

   class l extends eqv.e {
      private static final int c = 36;
      private final err d;
      @Nullable
      private final ezc e;

      public l(err $$0) {
         this.d = $$0;
         boolean $$1 = eqv.this.h($$0);
         if (eqv.b() && $$1 && $$0.h()) {
            this.e = ezc.a(vg.a("mco.snapshot.paired", $$0.s));
         } else if (!$$1 && $$0.e()) {
            this.e = ezc.a(vg.a("mco.snapshot.friendsRealm.upgrade", $$0.f));
         } else if (!$$1 && $$0.f()) {
            this.e = ezc.a(vg.a("mco.snapshot.friendsRealm.downgrade", $$0.t));
         } else {
            this.e = null;
         }
      }

      @Override
      public void a(exe $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         if (this.d.e == err.c.c) {
            $$0.a(eqv.b, $$3 - 5, $$2 + $$5 / 2 - 10, 40, 20);
            int $$10 = $$2 + $$5 / 2 - 9 / 2;
            $$0.b(eqv.this.i, eqv.F, $$3 + 40 - 2, $$10, 8388479);
         } else {
            euh.a($$0, $$3, $$2, 32, this.d.g);
            this.a($$0, $$2, $$3, $$4);
            this.a($$0, $$2, $$3);
            this.a($$0, $$2, $$3, this.d);
            this.a(this.d, $$0, $$3 + $$4, $$2, $$6, $$7);
            if (this.e != null) {
               this.e.a($$8, this.aK_(), new fbu($$3, $$2, $$4, $$5));
            }
         }
      }

      private void a(exe $$0, int $$1, int $$2, int $$3) {
         int $$4 = this.b($$2);
         int $$5 = this.a($$1);
         vg $$6 = eqv.a(this.d.t, this.d.d());
         int $$7 = this.a($$2, $$3, $$6);
         this.a($$0, this.d.b(), $$4, $$5, $$7, -1);
         if ($$6 != vf.a) {
            $$0.a(eqv.this.i, $$6, $$7, $$5, -8355712, false);
         }
      }

      private void a(exe $$0, int $$1, int $$2) {
         int $$3 = this.b($$2);
         int $$4 = this.a($$1);
         int $$5 = this.c($$4);
         if (this.d.m == err.d.b) {
            vg $$6 = vg.b(this.d.c()).a(n.h);
            $$0.a(eqv.this.i, vg.a("mco.selectServer.minigameName", $$6).b(-171), $$3, $$5, -1, false);
         } else {
            $$0.a(eqv.this.i, this.d.a(), $$3, this.c($$4), -8355712, false);
         }
      }

      private void d() {
         eqv.this.f.ai().a(gij.a(art.zJ, 1.0F));
         eqv.a(this.d, eqv.this);
      }

      private void e() {
         eqv.this.f.ai().a(gij.a(art.zJ, 1.0F));
         etc $$0 = new etc(eqv.this, this.d);
         eqv.this.f.a($$0);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         if (this.d.e == err.c.c) {
            this.e();
         } else if (eqv.this.a(this.d)) {
            if (ac.b() - eqv.this.aC < 250L && this.aK_()) {
               this.d();
            }

            eqv.this.aC = ac.b();
         }

         return true;
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         if (fbp.a($$0)) {
            if (this.d.e == err.c.c) {
               this.e();
               return true;
            }

            if (eqv.this.a(this.d)) {
               this.d();
               return true;
            }
         }

         return super.a($$0, $$1, $$2);
      }

      @Override
      public vg a() {
         return (vg)(this.d.e == err.c.c ? eqv.R : vg.a("narrator.select", this.d.c));
      }

      public err c() {
         return this.d;
      }
   }
}
