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

public class esl extends gmw {
   static final aiy a = new aiy("icon/info");
   static final aiy b = new aiy("icon/new_realm");
   static final aiy c = new aiy("realm_status/expired");
   static final aiy v = new aiy("realm_status/expires_soon");
   static final aiy w = new aiy("realm_status/open");
   static final aiy x = new aiy("realm_status/closed");
   private static final aiy y = new aiy("icon/invite");
   private static final aiy z = new aiy("icon/news");
   static final Logger A = LogUtils.getLogger();
   private static final aiy B = new aiy("textures/gui/title/realms.png");
   private static final aiy C = new aiy("textures/gui/realms/no_realms.png");
   private static final vq D = vq.c("menu.online");
   private static final vq E = vq.c("mco.selectServer.loading");
   static final vq F = vq.c("mco.selectServer.uninitialized");
   static final vq G = vq.c("mco.selectServer.expiredList");
   private static final vq H = vq.c("mco.selectServer.expiredRenew");
   static final vq I = vq.c("mco.selectServer.expiredTrial");
   private static final vq J = vq.c("mco.selectServer.play");
   private static final vq K = vq.c("mco.selectServer.leave");
   private static final vq L = vq.c("mco.selectServer.configure");
   static final vq M = vq.c("mco.selectServer.expired");
   static final vq N = vq.c("mco.selectServer.expires.soon");
   static final vq O = vq.c("mco.selectServer.expires.day");
   static final vq P = vq.c("mco.selectServer.open");
   static final vq Q = vq.c("mco.selectServer.closed");
   static final vq R = vq.a("gui.narrate.button", F);
   private static final vq S = vq.c("mco.selectServer.noRealms");
   private static final vq T = vq.c("mco.invites.nopending");
   private static final vq U = vq.c("mco.invites.pending");
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
   private final CompletableFuture<esk.a> am = esk.a();
   @Nullable
   private evp.c an;
   private final Set<UUID> ao = new HashSet<>();
   private static boolean ap;
   private final RateLimiter aq;
   private final ffe ar;
   private ezh as;
   private ezh at;
   private ezh au;
   private ezh av;
   private ezh aw;
   esl.j ax;
   private eui ay;
   private List<eth> az = List.of();
   private volatile boolean aA;
   @Nullable
   private volatile String aB;
   long aC;
   private final List<etg> aD = new ArrayList<>();
   private ezh aE;
   private esl.g aF;
   private esl.g aG;
   private esl.f aH;
   @Nullable
   private fct aI;

   public esl(ffe $$0) {
      super(D);
      this.ar = $$0;
      this.aq = RateLimiter.create(0.016666668F);
   }

   @Override
   public void aQ_() {
      this.ay = new eui(this.f);
      this.ax = new esl.j();
      vq $$0 = vq.c("mco.invites.title");
      this.aF = new esl.g($$0, y, $$1x -> this.f.a(new evb(this, $$0)));
      vq $$1 = vq.c("mco.news");
      this.aG = new esl.g($$1, z, $$0x -> {
         String $$1x = this.aB;
         if ($$1x != null) {
            fdw.a(this, $$1x);
            if (this.aG.a() != 0) {
               evv.a $$2 = evv.b();
               $$2.b = false;
               evv.b($$2);
               this.aG.a(0);
            }
         }
      });
      this.aG.a(fas.a($$1));
      this.as = ezh.a(J, $$0x -> a(this.O(), this)).a(100).a();
      this.av = ezh.a(L, $$0x -> this.f(this.O())).a(100).a();
      this.au = ezh.a(H, $$0x -> this.e(this.O())).a(100).a();
      this.aw = ezh.a(K, $$0x -> this.g(this.O())).a(100).a();
      this.aE = ezh.a(vq.c("mco.selectServer.purchase"), $$0x -> this.P()).b(100, 20).a();
      this.at = ezh.a(vp.k, $$0x -> this.d()).a(100).a();
      if (esq.a == esq.b.b) {
         this.d(ezo.a(vq.b("Snapshot"), vq.b("Release")).a(5, 5, 100, 20, vq.b("Realm"), ($$0x, $$1x) -> {
            al = $$1x;
            this.az = List.of();
            this.K();
         }));
      }

      this.a(esl.f.a);
      this.J();
      this.am.thenAcceptAsync($$0x -> {
         ffe $$1x = $$0x.a(this.ar);
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
         this.a(esl.f.b);
      } else {
         this.a(esl.f.c);
      }
   }

   private void a(esl.f $$0) {
      if (this.aH != $$0) {
         if (this.aI != null) {
            this.aI.a($$1 -> this.f($$1));
         }

         this.aI = this.b($$0);
         this.aH = $$0;
         this.aI.a($$1 -> {
            ezf var10000 = this.d($$1);
         });
         this.c();
      }
   }

   private fct b(esl.f $$0) {
      fct $$1 = new fct(this);
      $$1.b(44);
      $$1.a(this.H());
      fcu $$2 = this.c($$0);
      $$2.a();
      $$1.a($$2.u() + 22);
      $$1.b($$2);
      switch ($$0) {
         case a:
            $$1.c(new ezw(this.i, E));
            break;
         case b:
            $$1.c(this.I());
            break;
         case c:
            $$1.c(this.ax);
      }

      return $$1;
   }

   private fcu H() {
      int $$0 = 90;
      fcx $$1 = fcx.e().a(4);
      $$1.c().e();
      $$1.a(this.aF);
      $$1.a(this.aG);
      fcx $$2 = fcx.e();
      $$2.c().e();
      $$2.a(fcy.a(90));
      $$2.a(ezu.a(128, 34, B, 128, 64), fcw::b);
      $$2.a(new fcr(90, 44)).a($$1, fcw::c);
      return $$2;
   }

   private fcu c(esl.f $$0) {
      fcs $$1 = new fcs().c(4);
      fcs.b $$2 = $$1.d(3);
      if ($$0 == esl.f.c) {
         $$2.a(this.as);
         $$2.a(this.av);
         $$2.a(this.au);
         $$2.a(this.aw);
      }

      $$2.a(this.aE);
      $$2.a(this.at);
      return $$1;
   }

   private fcx I() {
      fcx $$0 = fcx.d().a(10);
      $$0.c().b();
      $$0.a(ezu.a(130, 64, C, 130, 64));
      ezs $$1 = new ezs(308, S, this.i, false);
      $$0.a($$1);
      return $$0;
   }

   void J() {
      eth $$0 = this.O();
      this.aE.j = this.aH != esl.f.a;
      this.as.j = $$0 != null && this.a($$0);
      this.au.j = $$0 != null && this.b($$0);
      this.aw.j = $$0 != null && this.d($$0);
      this.av.j = $$0 != null && this.c($$0);
   }

   boolean a(eth $$0) {
      boolean $$1 = !$$0.j && $$0.e == eth.c.b;
      return $$1 && ($$0.d() || this.h($$0));
   }

   private boolean b(eth $$0) {
      return $$0.j && this.h($$0);
   }

   private boolean c(eth $$0) {
      return this.h($$0) && $$0.e != eth.c.c;
   }

   private boolean d(eth $$0) {
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
      exh.O().aZ().d.a();
   }

   public static void g() {
      exh.O().aZ().c.a();
   }

   private void K() {
      for (evp.e<?> $$0 : this.f.aZ().a()) {
         $$0.a();
      }
   }

   private evp.c a(eug $$0) {
      evp.c $$1 = $$0.a.a();
      $$1.a($$0.c, $$0x -> {
         this.ay.a($$0x.a());
         this.az = $$0x.b();
         this.L();
         boolean $$1x = false;

         for (eth $$2 : this.ay) {
            if (this.i($$2)) {
               $$1x = true;
            }
         }

         if (!ap && $$1x) {
            ap = true;
            this.M();
         }
      });
      a(esq::d, $$0x -> {
         this.aD.clear();
         this.aD.addAll($$0x);

         for (etg $$1x : $$0x) {
            if ($$1x instanceof etg.a $$2) {
               faj $$3 = $$2.a(this, this::a);
               if ($$3 != null) {
                  this.f.a($$3);
                  this.a(List.of($$1x));
                  break;
               }
            }
         }

         if (!this.aD.isEmpty() && this.aH != esl.f.a) {
            this.L();
         }
      });
      $$1.a($$0.d, $$0x -> {
         this.aF.a($$0x);
         this.aF.a($$0x == 0 ? fas.a(T) : fas.a(U));
         if ($$0x > 0 && this.aq.tryAcquire(1)) {
            this.f.aW().c(vq.a("mco.configure.world.invite.narration", $$0x));
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

   private void a(Collection<etg> $$0) {
      List<UUID> $$1 = new ArrayList<>($$0.size());

      for (etg $$2 : $$0) {
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

   private static <T> void a(esl.k<T> $$0, Consumer<T> $$1) {
      exh $$2 = exh.O();
      CompletableFuture.<T>supplyAsync(() -> {
         try {
            return $$0.request(esq.a($$2));
         } catch (eud var3) {
            throw new RuntimeException(var3);
         }
      }).thenAcceptAsync($$1, $$2).exceptionally($$0x -> {
         A.error("Failed to execute call to Realms Service", $$0x);
         return null;
      });
   }

   private void L() {
      eth $$0 = this.O();
      this.ax.H();

      for (etg $$1 : this.aD) {
         if (this.a($$1)) {
            this.a(List.of($$1));
            break;
         }
      }

      for (eth $$2 : this.az) {
         this.ax.a(new esl.a($$2));
      }

      for (eth $$3 : this.ay) {
         esl.e $$4;
         if (b() && !$$3.h()) {
            if ($$3.e == eth.c.c) {
               continue;
            }

            $$4 = new esl.i($$3);
         } else {
            $$4 = new esl.l($$3);
         }

         this.ax.a((esl.e)$$4);
         if ($$0 != null && $$0.a == $$3.a) {
            this.ax.a($$4);
         }
      }

      this.E();
      this.J();
   }

   private boolean a(etg $$0) {
      if (!($$0 instanceof etg.c $$1)) {
         return false;
      } else {
         vq $$2 = $$1.d();
         int $$3 = this.i.b($$2, 216);
         int $$4 = awh.e($$3 + 7, 36) - 1;
         this.ax.a(new esl.h($$2, $$4 + 2, $$1));

         for (int $$5 = 0; $$5 < $$4; $$5++) {
            this.ax.a(new esl.d());
         }

         this.ax.a(new esl.b($$1.a(this)));
         return true;
      }
   }

   private void M() {
      new Thread(() -> {
         List<etr> $$0 = esp.a();
         esq $$1 = esq.a();
         etc $$2 = new etc();
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

      for (eth $$1 : this.ay) {
         if (this.i($$1)) {
            $$0.add($$1.a);
         }
      }

      return $$0;
   }

   private void e(@Nullable eth $$0) {
      if ($$0 != null) {
         String $$1 = avd.a($$0.b, this.f.V().b(), $$0.k);
         this.f.o.a($$1);
         ac.j().a($$1);
      }
   }

   private void f(@Nullable eth $$0) {
      if ($$0 != null && this.f.b($$0.g)) {
         this.f.a(new euq(this, $$0.a));
      }
   }

   private void g(@Nullable eth $$0) {
      if ($$0 != null && !this.f.b($$0.g)) {
         vq $$1 = vq.c("mco.configure.world.leave.question.line1");
         vq $$2 = vq.c("mco.configure.world.leave.question.line2");
         this.f.a(new euw($$1x -> this.a($$1x, $$0), euw.a.b, $$1, $$2, true));
      }
   }

   @Nullable
   private eth O() {
      return this.ax.i() instanceof esl.l $$0 ? $$0.c() : null;
   }

   private void a(boolean $$0, final eth $$1) {
      if ($$0) {
         (new Thread("Realms-leave-server") {
            @Override
            public void run() {
               try {
                  esq $$0 = esq.a();
                  $$0.d($$1.a);
                  esl.this.f.execute(esl::g);
               } catch (eud var2) {
                  esl.A.error("Couldn't configure world", var2);
                  esl.this.f.execute(() -> esl.this.f.a(new euu(var2, esl.this)));
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
   public vq i() {
      return (vq)(switch (this.aH) {
         case a -> vp.a(super.i(), E);
         case b -> vp.a(super.i(), S);
         case c -> super.i();
      });
   }

   @Override
   public void a(eyu $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (b()) {
         $$0.b(this.i, "Minecraft " + aa.b().c(), 2, this.h - 10, -1);
      }

      if (this.aA && this.aE.j) {
         evd.a($$0, this.aE);
      }

      switch (esq.a) {
         case b:
            this.a($$0, "STAGE!", -256);
            break;
         case c:
            this.a($$0, "LOCAL!", 8388479);
      }
   }

   private void P() {
      this.f.a(new evd(this, this.aA));
   }

   public static void a(@Nullable eth $$0, ffe $$1) {
      a($$0, $$1, false);
   }

   public static void a(@Nullable eth $$0, ffe $$1, boolean $$2) {
      if ($$0 != null) {
         if (!b() || $$2) {
            exh.O().a(new eux($$1, new ewg($$1, $$0)));
            return;
         }

         switch ($$0.u) {
            case e:
               exh.O().a(new eux($$1, new ewg($$1, $$0)));
               break;
            case a:
               a($$0, $$1, vq.c("mco.compatibility.unverifiable.title").b(-171), vq.c("mco.compatibility.unverifiable.message"), vp.j);
               break;
            case c:
               a(
                  $$0,
                  $$1,
                  vq.c("selectWorld.backupQuestion.downgrade").b(-2142128),
                  vq.a("mco.compatibility.downgrade.description", vq.b($$0.t).b(-171), vq.b(aa.b().c()).b(-171)),
                  vq.c("mco.compatibility.downgrade")
               );
               break;
            case d:
               a(
                  $$0,
                  $$1,
                  vq.c("mco.compatibility.upgrade.title").b(-171),
                  vq.a("mco.compatibility.upgrade.description", vq.b($$0.t).b(-171), vq.b(aa.b().c()).b(-171)),
                  vq.c("mco.compatibility.upgrade")
               );
         }
      }
   }

   private static void a(eth $$0, ffe $$1, vq $$2, vq $$3, vq $$4) {
      exh.O().a(new fdx($$2x -> {
         ffe $$3x;
         if ($$2x) {
            $$3x = new eux($$1, new ewg($$1, $$0));
            g();
         } else {
            $$3x = $$1;
         }

         exh.O().a($$3x);
      }, $$2, $$3, $$4, vp.e));
   }

   public static vq a(String $$0, boolean $$1) {
      return a($$0, $$1 ? -8355712 : -2142128);
   }

   public static vq a(String $$0, int $$1) {
      return (vq)(StringUtils.isBlank($$0) ? vp.a : vq.a("mco.version", vq.b($$0).b($$1)));
   }

   boolean h(eth $$0) {
      return this.f.b($$0.g);
   }

   private boolean i(eth $$0) {
      return this.h($$0) && !$$0.j;
   }

   private void a(eyu $$0, String $$1, int $$2) {
      $$0.c().a();
      $$0.c().a((float)(this.g / 2 - 25), 20.0F, 0.0F);
      $$0.c().a(a.f.rotationDegrees(-20.0F));
      $$0.c().b(1.5F, 1.5F, 1.5F);
      $$0.a(this.i, $$1, 0, 0, $$2, false);
      $$0.c().b();
   }

   class a extends esl.e {
      private static final vq c = vq.c("mco.snapshot.start");
      private static final int d = 5;
      private final fav e = new fav();
      private final eth f;

      public a(eth $$0) {
         this.f = $$0;
         this.e.a(fas.a(vq.c("mco.snapshot.tooltip")));
      }

      @Override
      public void a(eyu $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(esl.b, $$3 - 5, $$2 + $$5 / 2 - 10, 40, 20);
         int $$10 = $$2 + $$5 / 2 - 9 / 2;
         $$0.b(esl.this.i, c, $$3 + 40 - 2, $$10 - 5, 8388479);
         $$0.b(esl.this.i, vq.a("mco.snapshot.description", this.f.c), $$3 + 40 - 2, $$10 + 5, -8355712);
         this.e.a($$8, this.aL_(), new fdm($$3, $$2, $$4, $$5));
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         this.c();
         return true;
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         if (fdh.a($$0)) {
            this.c();
            return true;
         } else {
            return super.a($$0, $$1, $$2);
         }
      }

      private void c() {
         esl.this.f.ai().a(gkc.a(atk.zJ, 1.0F));
         esl.this.f
            .a(
               new faj.a(esl.this, vq.c("mco.snapshot.createSnapshotPopup.title"))
                  .a(vq.c("mco.snapshot.createSnapshotPopup.text"))
                  .a(vq.c("mco.selectServer.create"), $$0 -> esl.this.f.a(new eus(esl.this, this.f.a)))
                  .a(vp.e, faj::d)
                  .a()
            );
      }

      @Override
      public vq a() {
         return vq.a("gui.narrate.button", vp.a(c, vq.a("mco.snapshot.description", this.f.c)));
      }
   }

   class b extends esl.e {
      private final ezh c;

      public b(ezh $$0) {
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
      public void a(eyu $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.c.c(esl.this.g / 2 - 75, $$2 + 4);
         this.c.a($$0, $$6, $$7, $$9);
      }

      @Override
      public void a(boolean $$0) {
         super.a($$0);
         this.c.a($$0);
      }

      @Override
      public vq a() {
         return this.c.x();
      }
   }

   static class c extends ezt {
      private static final fau b = new fau(new aiy("widget/cross_button"), new aiy("widget/cross_button_highlighted"));

      protected c(ezh.c $$0, vq $$1) {
         super(0, 0, 14, 14, b, $$0);
         this.a(fas.a($$1));
      }
   }

   class d extends esl.e {
      @Override
      public void a(eyu $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
      }

      @Override
      public vq a() {
         return vq.i();
      }
   }

   abstract class e extends fad.a<esl.e> {
      private static final int a = 10;
      private static final int c = 28;
      private static final int d = 7;

      protected void a(eth $$0, eyu $$1, int $$2, int $$3, int $$4, int $$5) {
         int $$6 = $$2 - 10 - 7;
         int $$7 = $$3 + 2;
         if ($$0.j) {
            this.a($$1, $$6, $$7, $$4, $$5, esl.c, () -> esl.M);
         } else if ($$0.e == eth.c.a) {
            this.a($$1, $$6, $$7, $$4, $$5, esl.x, () -> esl.Q);
         } else if (esl.this.h($$0) && $$0.l < 7) {
            this.a($$1, $$6, $$7, $$4, $$5, esl.v, () -> {
               if ($$0.l <= 0) {
                  return esl.N;
               } else {
                  return (vq)($$0.l == 1 ? esl.O : vq.a("mco.selectServer.expires.days", $$0.l));
               }
            });
         } else if ($$0.e == eth.c.b) {
            this.a($$1, $$6, $$7, $$4, $$5, esl.w, () -> esl.P);
         }
      }

      private void a(eyu $$0, int $$1, int $$2, int $$3, int $$4, aiy $$5, Supplier<vq> $$6) {
         $$0.a($$5, $$1, $$2, 10, 28);
         if (esl.this.ax.c((double)$$3, (double)$$4) && $$3 >= $$1 && $$3 <= $$1 + 10 && $$4 >= $$2 && $$4 <= $$2 + 28) {
            esl.this.d($$6.get());
         }
      }

      protected void a(eyu $$0, int $$1, int $$2, eth $$3) {
         int $$4 = this.b($$2);
         int $$5 = this.a($$1);
         int $$6 = this.d($$5);
         if (!esl.this.h($$3)) {
            $$0.a(esl.this.i, $$3.f, $$4, this.d($$5), -8355712, false);
         } else if ($$3.j) {
            vq $$7 = $$3.k ? esl.I : esl.G;
            $$0.a(esl.this.i, $$7, $$4, $$6, -2142128, false);
         }
      }

      protected void a(eyu $$0, String $$1, int $$2, int $$3, int $$4, int $$5) {
         int $$6 = $$4 - $$2;
         if (esl.this.i.b($$1) > $$6) {
            String $$7 = esl.this.i.a($$1, $$6 - esl.this.i.b("... "));
            $$0.a(esl.this.i, $$7 + "...", $$2, $$3, $$5, false);
         } else {
            $$0.a(esl.this.i, $$1, $$2, $$3, $$5, false);
         }
      }

      protected int a(int $$0, int $$1, vq $$2) {
         return $$0 + $$1 - esl.this.i.a($$2) - 20;
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

   static class g extends fam.b {
      private static final aiy[] d = new aiy[]{
         new aiy("notification/1"),
         new aiy("notification/2"),
         new aiy("notification/3"),
         new aiy("notification/4"),
         new aiy("notification/5"),
         new aiy("notification/more")
      };
      private static final int t = Integer.MAX_VALUE;
      private static final int u = 20;
      private static final int v = 14;
      private int w;

      public g(vq $$0, aiy $$1, ezh.c $$2) {
         super(20, 20, $$0, 14, 14, $$1, $$2);
      }

      int a() {
         return this.w;
      }

      public void a(int $$0) {
         this.w = $$0;
      }

      @Override
      public void b(eyu $$0, int $$1, int $$2, float $$3) {
         super.b($$0, $$1, $$2, $$3);
         if (this.j && this.w != 0) {
            this.a($$0);
         }
      }

      private void a(eyu $$0) {
         $$0.a(d[Math.min(this.w, 6) - 1], this.B() + this.w() - 5, this.C() - 3, 8, 8);
      }
   }

   class h extends esl.e {
      private static final int c = 40;
      private static final int d = -12303292;
      private final vq e;
      private final int f;
      private final List<ezf> g = new ArrayList<>();
      @Nullable
      private final esl.c h;
      private final fab i;
      private final fcs j;
      private final fcr k;
      private int l = -1;

      public h(vq $$0, int $$1, etg $$2) {
         this.e = $$0;
         this.f = $$1;
         this.j = new fcs();
         int $$3 = 7;
         this.j.a(ezu.a(20, 20, esl.a), 0, 0, this.j.b().a(7, 7, 0, 0));
         this.j.a(fcy.a(40), 0, 0);
         this.k = this.j.a(new fcr(0, 9 * 3 * ($$1 - 1)), 0, 1, this.j.b().c(7));
         this.i = this.k.a(new fab($$0, esl.this.i).b(true), this.k.b().b().d());
         this.j.a(fcy.a(40), 0, 2);
         if ($$2.b()) {
            this.h = this.j.a(new esl.c($$1x -> esl.this.a($$2.c()), vq.c("mco.notification.dismiss")), 0, 2, this.j.b().c().a(0, 7, 7, 0));
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
      public void b(eyu $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         super.b($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
         $$0.b($$3 - 2, $$2 - 2, $$4, 36 * this.f - 2, -12303292);
      }

      @Override
      public void a(eyu $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
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
      public vq a() {
         return this.e;
      }
   }

   class i extends esl.e {
      private final eth c;
      private final fav d = new fav();

      public i(eth $$0) {
         this.c = $$0;
         this.d.a(fas.a(vq.c("mco.snapshot.parent.tooltip")));
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         return true;
      }

      @Override
      public void a(eyu $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = this.b($$3);
         int $$11 = this.a($$2);
         evx.a($$0, $$3, $$2, 32, this.c.g);
         vq $$12 = esl.a(this.c.t, -8355712);
         int $$13 = this.a($$3, $$4, $$12);
         this.a($$0, this.c.b(), $$10, $$11, $$13, -8355712);
         if ($$12 != vp.a) {
            $$0.a(esl.this.i, $$12, $$13, $$11, -8355712, false);
         }

         $$0.a(esl.this.i, this.c.a(), $$10, this.c($$11), -8355712, false);
         this.a($$0, $$2, $$3, this.c);
         this.a(this.c, $$0, $$3 + $$4, $$2, $$6, $$7);
         this.d.a($$8, this.aL_(), new fdm($$3, $$2, $$4, $$5));
      }

      @Override
      public vq a() {
         return vq.b(this.c.c);
      }
   }

   class j extends gmv<esl.e> {
      public j() {
         super(esl.this.g, esl.this.h, 0, 36);
      }

      public void a(@Nullable esl.e $$0) {
         super.a($$0);
         esl.this.J();
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
      T request(esq var1) throws eud;
   }

   class l extends esl.e {
      private static final int c = 36;
      private final eth d;
      private final fav e = new fav();

      public l(eth $$0) {
         this.d = $$0;
         boolean $$1 = esl.this.h($$0);
         if (esl.b() && $$1 && $$0.h()) {
            this.e.a(fas.a(vq.a("mco.snapshot.paired", $$0.s)));
         } else if (!$$1 && $$0.e()) {
            this.e.a(fas.a(vq.a("mco.snapshot.friendsRealm.upgrade", $$0.f)));
         } else if (!$$1 && $$0.f()) {
            this.e.a(fas.a(vq.a("mco.snapshot.friendsRealm.downgrade", $$0.t)));
         }
      }

      @Override
      public void a(eyu $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         if (this.d.e == eth.c.c) {
            $$0.a(esl.b, $$3 - 5, $$2 + $$5 / 2 - 10, 40, 20);
            int $$10 = $$2 + $$5 / 2 - 9 / 2;
            $$0.b(esl.this.i, esl.F, $$3 + 40 - 2, $$10, 8388479);
         } else {
            evx.a($$0, $$3, $$2, 32, this.d.g);
            this.a($$0, $$2, $$3, $$4);
            this.a($$0, $$2, $$3);
            this.a($$0, $$2, $$3, this.d);
            this.a(this.d, $$0, $$3 + $$4, $$2, $$6, $$7);
            this.e.a($$8, this.aL_(), new fdm($$3, $$2, $$4, $$5));
         }
      }

      private void a(eyu $$0, int $$1, int $$2, int $$3) {
         int $$4 = this.b($$2);
         int $$5 = this.a($$1);
         vq $$6 = esl.a(this.d.t, this.d.d());
         int $$7 = this.a($$2, $$3, $$6);
         this.a($$0, this.d.b(), $$4, $$5, $$7, -1);
         if ($$6 != vp.a) {
            $$0.a(esl.this.i, $$6, $$7, $$5, -8355712, false);
         }
      }

      private void a(eyu $$0, int $$1, int $$2) {
         int $$3 = this.b($$2);
         int $$4 = this.a($$1);
         int $$5 = this.c($$4);
         if (this.d.m == eth.d.b) {
            vq $$6 = vq.b(this.d.c()).a(n.h);
            $$0.a(esl.this.i, vq.a("mco.selectServer.minigameName", $$6).b(-171), $$3, $$5, -1, false);
         } else {
            $$0.a(esl.this.i, this.d.a(), $$3, this.c($$4), -8355712, false);
         }
      }

      private void d() {
         esl.this.f.ai().a(gkc.a(atk.zJ, 1.0F));
         esl.a(this.d, esl.this);
      }

      private void e() {
         esl.this.f.ai().a(gkc.a(atk.zJ, 1.0F));
         eus $$0 = new eus(esl.this, this.d);
         esl.this.f.a($$0);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         if (this.d.e == eth.c.c) {
            this.e();
         } else if (esl.this.a(this.d)) {
            if (ac.b() - esl.this.aC < 250L && this.aL_()) {
               this.d();
            }

            esl.this.aC = ac.b();
         }

         return true;
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         if (fdh.a($$0)) {
            if (this.d.e == eth.c.c) {
               this.e();
               return true;
            }

            if (esl.this.a(this.d)) {
               this.d();
               return true;
            }
         }

         return super.a($$0, $$1, $$2);
      }

      @Override
      public vq a() {
         return (vq)(this.d.e == eth.c.c ? esl.R : vq.a("narrator.select", this.d.c));
      }

      public eth c() {
         return this.d;
      }
   }
}
