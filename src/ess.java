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

public class ess extends gnd {
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
   private final CompletableFuture<esr.a> am = esr.a();
   @Nullable
   private evw.c an;
   private final Set<UUID> ao = new HashSet<>();
   private static boolean ap;
   private final RateLimiter aq;
   private final ffl ar;
   private ezo as;
   private ezo at;
   private ezo au;
   private ezo av;
   private ezo aw;
   ess.j ax;
   private eup ay;
   private List<eto> az = List.of();
   private volatile boolean aA;
   @Nullable
   private volatile String aB;
   long aC;
   private final List<etn> aD = new ArrayList<>();
   private ezo aE;
   private ess.g aF;
   private ess.g aG;
   private ess.f aH;
   @Nullable
   private fda aI;

   public ess(ffl $$0) {
      super(D);
      this.ar = $$0;
      this.aq = RateLimiter.create(0.016666668F);
   }

   @Override
   public void aQ_() {
      this.ay = new eup(this.f);
      this.ax = new ess.j();
      vq $$0 = vq.c("mco.invites.title");
      this.aF = new ess.g($$0, y, $$1x -> this.f.a(new evi(this, $$0)));
      vq $$1 = vq.c("mco.news");
      this.aG = new ess.g($$1, z, $$0x -> {
         String $$1x = this.aB;
         if ($$1x != null) {
            fed.a(this, $$1x);
            if (this.aG.a() != 0) {
               ewc.a $$2 = ewc.b();
               $$2.b = false;
               ewc.b($$2);
               this.aG.a(0);
            }
         }
      });
      this.aG.a(faz.a($$1));
      this.as = ezo.a(J, $$0x -> a(this.O(), this)).a(100).a();
      this.av = ezo.a(L, $$0x -> this.f(this.O())).a(100).a();
      this.au = ezo.a(H, $$0x -> this.e(this.O())).a(100).a();
      this.aw = ezo.a(K, $$0x -> this.g(this.O())).a(100).a();
      this.aE = ezo.a(vq.c("mco.selectServer.purchase"), $$0x -> this.P()).b(100, 20).a();
      this.at = ezo.a(vp.k, $$0x -> this.d()).a(100).a();
      if (esx.a == esx.b.b) {
         this.c(ezv.a(vq.b("Snapshot"), vq.b("Release")).a(5, 5, 100, 20, vq.b("Realm"), ($$0x, $$1x) -> {
            al = $$1x;
            this.az = List.of();
            this.K();
         }));
      }

      this.a(ess.f.a);
      this.J();
      this.am.thenAcceptAsync($$0x -> {
         ffl $$1x = $$0x.a(this.ar);
         if ($$1x == null) {
            this.an = this.a(this.f.ba());
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
         this.a(ess.f.b);
      } else {
         this.a(ess.f.c);
      }
   }

   private void a(ess.f $$0) {
      if (this.aH != $$0) {
         if (this.aI != null) {
            this.aI.a($$1 -> this.e($$1));
         }

         this.aI = this.b($$0);
         this.aH = $$0;
         this.aI.a($$1 -> {
            ezm var10000 = this.c($$1);
         });
         this.c();
      }
   }

   private fda b(ess.f $$0) {
      fda $$1 = new fda(this);
      $$1.b(44);
      $$1.a(this.H());
      fdb $$2 = this.c($$0);
      $$2.a();
      $$1.a($$2.u() + 22);
      $$1.b($$2);
      switch ($$0) {
         case a:
            $$1.c(new fad(this.i, E));
            break;
         case b:
            $$1.c(this.I());
            break;
         case c:
            $$1.c(this.ax);
      }

      return $$1;
   }

   private fdb H() {
      int $$0 = 90;
      fde $$1 = fde.e().a(4);
      $$1.c().e();
      $$1.a(this.aF);
      $$1.a(this.aG);
      fde $$2 = fde.e();
      $$2.c().e();
      $$2.a(fdf.a(90));
      $$2.a(fab.a(128, 34, B, 128, 64), fdd::b);
      $$2.a(new fcy(90, 44)).a($$1, fdd::c);
      return $$2;
   }

   private fdb c(ess.f $$0) {
      fcz $$1 = new fcz().c(4);
      fcz.b $$2 = $$1.d(3);
      if ($$0 == ess.f.c) {
         $$2.a(this.as);
         $$2.a(this.av);
         $$2.a(this.au);
         $$2.a(this.aw);
      }

      $$2.a(this.aE);
      $$2.a(this.at);
      return $$1;
   }

   private fde I() {
      fde $$0 = fde.d().a(10);
      $$0.c().b();
      $$0.a(fab.a(130, 64, C, 130, 64));
      ezz $$1 = new ezz(308, S, this.i, false);
      $$0.a($$1);
      return $$0;
   }

   void J() {
      eto $$0 = this.O();
      this.aE.j = this.aH != ess.f.a;
      this.as.j = $$0 != null && this.a($$0);
      this.au.j = $$0 != null && this.b($$0);
      this.aw.j = $$0 != null && this.d($$0);
      this.av.j = $$0 != null && this.c($$0);
   }

   boolean a(eto $$0) {
      boolean $$1 = !$$0.j && $$0.e == eto.c.b;
      return $$1 && ($$0.d() || this.h($$0));
   }

   private boolean b(eto $$0) {
      return $$0.j && this.h($$0);
   }

   private boolean c(eto $$0) {
      return this.h($$0) && $$0.e != eto.c.c;
   }

   private boolean d(eto $$0) {
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
      exo.P().ba().d.a();
   }

   public static void g() {
      exo.P().ba().c.a();
   }

   private void K() {
      for (evw.e<?> $$0 : this.f.ba().a()) {
         $$0.a();
      }
   }

   private evw.c a(eun $$0) {
      evw.c $$1 = $$0.a.a();
      $$1.a($$0.c, $$0x -> {
         this.ay.a($$0x.a());
         this.az = $$0x.b();
         this.L();
         boolean $$1x = false;

         for (eto $$2 : this.ay) {
            if (this.i($$2)) {
               $$1x = true;
            }
         }

         if (!ap && $$1x) {
            ap = true;
            this.M();
         }
      });
      a(esx::d, $$0x -> {
         this.aD.clear();
         this.aD.addAll($$0x);

         for (etn $$1x : $$0x) {
            if ($$1x instanceof etn.a $$2) {
               faq $$3 = $$2.a(this, this::a);
               if ($$3 != null) {
                  this.f.a($$3);
                  this.a(List.of($$1x));
                  break;
               }
            }
         }

         if (!this.aD.isEmpty() && this.aH != ess.f.a) {
            this.L();
         }
      });
      $$1.a($$0.d, $$0x -> {
         this.aF.a($$0x);
         this.aF.a($$0x == 0 ? faz.a(T) : faz.a(U));
         if ($$0x > 0 && this.aq.tryAcquire(1)) {
            this.f.aX().c(vq.a("mco.configure.world.invite.narration", $$0x));
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

   private void a(Collection<etn> $$0) {
      List<UUID> $$1 = new ArrayList<>($$0.size());

      for (etn $$2 : $$0) {
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

   private static <T> void a(ess.k<T> $$0, Consumer<T> $$1) {
      exo $$2 = exo.P();
      CompletableFuture.<T>supplyAsync(() -> {
         try {
            return $$0.request(esx.a($$2));
         } catch (euk var3) {
            throw new RuntimeException(var3);
         }
      }).thenAcceptAsync($$1, $$2).exceptionally($$0x -> {
         A.error("Failed to execute call to Realms Service", $$0x);
         return null;
      });
   }

   private void L() {
      eto $$0 = this.O();
      this.ax.H();

      for (etn $$1 : this.aD) {
         if (this.a($$1)) {
            this.a(List.of($$1));
            break;
         }
      }

      for (eto $$2 : this.az) {
         this.ax.a(new ess.a($$2));
      }

      for (eto $$3 : this.ay) {
         ess.e $$4;
         if (b() && !$$3.h()) {
            if ($$3.e == eto.c.c) {
               continue;
            }

            $$4 = new ess.i($$3);
         } else {
            $$4 = new ess.l($$3);
         }

         this.ax.a((ess.e)$$4);
         if ($$0 != null && $$0.a == $$3.a) {
            this.ax.a($$4);
         }
      }

      this.E();
      this.J();
   }

   private boolean a(etn $$0) {
      if (!($$0 instanceof etn.c $$1)) {
         return false;
      } else {
         vq $$2 = $$1.d();
         int $$3 = this.i.b($$2, 216);
         int $$4 = awi.e($$3 + 7, 36) - 1;
         this.ax.a(new ess.h($$2, $$4 + 2, $$1));

         for (int $$5 = 0; $$5 < $$4; $$5++) {
            this.ax.a(new ess.d());
         }

         this.ax.a(new ess.b($$1.a(this)));
         return true;
      }
   }

   private void M() {
      new Thread(() -> {
         List<ety> $$0 = esw.a();
         esx $$1 = esx.a();
         etj $$2 = new etj();
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

      for (eto $$1 : this.ay) {
         if (this.i($$1)) {
            $$0.add($$1.a);
         }
      }

      return $$0;
   }

   private void e(@Nullable eto $$0) {
      if ($$0 != null) {
         String $$1 = ave.a($$0.b, this.f.W().b(), $$0.k);
         this.f.o.a($$1);
         ac.j().a($$1);
      }
   }

   private void f(@Nullable eto $$0) {
      if ($$0 != null && this.f.b($$0.g)) {
         this.f.a(new eux(this, $$0.a));
      }
   }

   private void g(@Nullable eto $$0) {
      if ($$0 != null && !this.f.b($$0.g)) {
         vq $$1 = vq.c("mco.configure.world.leave.question.line1");
         vq $$2 = vq.c("mco.configure.world.leave.question.line2");
         this.f.a(new evd($$1x -> this.a($$1x, $$0), evd.a.b, $$1, $$2, true));
      }
   }

   @Nullable
   private eto O() {
      return this.ax.i() instanceof ess.l $$0 ? $$0.c() : null;
   }

   private void a(boolean $$0, final eto $$1) {
      if ($$0) {
         (new Thread("Realms-leave-server") {
            @Override
            public void run() {
               try {
                  esx $$0 = esx.a();
                  $$0.d($$1.a);
                  ess.this.f.execute(ess::g);
               } catch (euk var2) {
                  ess.A.error("Couldn't configure world", var2);
                  ess.this.f.execute(() -> ess.this.f.a(new evb(var2, ess.this)));
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
   public void a(ezb $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (b()) {
         $$0.b(this.i, "Minecraft " + aa.b().c(), 2, this.h - 10, -1);
      }

      if (this.aA && this.aE.j) {
         evk.a($$0, this.aE);
      }

      switch (esx.a) {
         case b:
            this.a($$0, "STAGE!", -256);
            break;
         case c:
            this.a($$0, "LOCAL!", 8388479);
      }
   }

   private void P() {
      this.f.a(new evk(this, this.aA));
   }

   public static void a(@Nullable eto $$0, ffl $$1) {
      a($$0, $$1, false);
   }

   public static void a(@Nullable eto $$0, ffl $$1, boolean $$2) {
      if ($$0 != null) {
         if (!b() || $$2) {
            exo.P().a(new eve($$1, new ewn($$1, $$0)));
            return;
         }

         switch ($$0.u) {
            case e:
               exo.P().a(new eve($$1, new ewn($$1, $$0)));
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

   private static void a(eto $$0, ffl $$1, vq $$2, vq $$3, vq $$4) {
      exo.P().a(new fee($$2x -> {
         ffl $$3x;
         if ($$2x) {
            $$3x = new eve($$1, new ewn($$1, $$0));
            g();
         } else {
            $$3x = $$1;
         }

         exo.P().a($$3x);
      }, $$2, $$3, $$4, vp.e));
   }

   public static vq a(String $$0, boolean $$1) {
      return a($$0, $$1 ? -8355712 : -2142128);
   }

   public static vq a(String $$0, int $$1) {
      return (vq)(StringUtils.isBlank($$0) ? vp.a : vq.a("mco.version", vq.b($$0).b($$1)));
   }

   boolean h(eto $$0) {
      return this.f.b($$0.g);
   }

   private boolean i(eto $$0) {
      return this.h($$0) && !$$0.j;
   }

   private void a(ezb $$0, String $$1, int $$2) {
      $$0.c().a();
      $$0.c().a((float)(this.g / 2 - 25), 20.0F, 0.0F);
      $$0.c().a(a.f.rotationDegrees(-20.0F));
      $$0.c().b(1.5F, 1.5F, 1.5F);
      $$0.a(this.i, $$1, 0, 0, $$2, false);
      $$0.c().b();
   }

   class a extends ess.e {
      private static final vq c = vq.c("mco.snapshot.start");
      private static final int d = 5;
      private final fbc e = new fbc();
      private final eto f;

      public a(eto $$0) {
         this.f = $$0;
         this.e.a(faz.a(vq.c("mco.snapshot.tooltip")));
      }

      @Override
      public void a(ezb $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(ess.b, $$3 - 5, $$2 + $$5 / 2 - 10, 40, 20);
         int $$10 = $$2 + $$5 / 2 - 9 / 2;
         $$0.b(ess.this.i, c, $$3 + 40 - 2, $$10 - 5, 8388479);
         $$0.b(ess.this.i, vq.a("mco.snapshot.description", this.f.c), $$3 + 40 - 2, $$10 + 5, -8355712);
         this.e.a($$8, this.aL_(), new fdt($$3, $$2, $$4, $$5));
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         this.c();
         return true;
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         if (fdo.a($$0)) {
            this.c();
            return true;
         } else {
            return super.a($$0, $$1, $$2);
         }
      }

      private void c() {
         ess.this.f.aj().a(gkj.a(atl.zK, 1.0F));
         ess.this.f
            .a(
               new faq.a(ess.this, vq.c("mco.snapshot.createSnapshotPopup.title"))
                  .a(vq.c("mco.snapshot.createSnapshotPopup.text"))
                  .a(vq.c("mco.selectServer.create"), $$0 -> ess.this.f.a(new euz(ess.this, this.f.a)))
                  .a(vp.e, faq::d)
                  .a()
            );
      }

      @Override
      public vq a() {
         return vq.a("gui.narrate.button", vp.a(c, vq.a("mco.snapshot.description", this.f.c)));
      }
   }

   class b extends ess.e {
      private final ezo c;

      public b(ezo $$0) {
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
      public void a(ezb $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.c.c(ess.this.g / 2 - 75, $$2 + 4);
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

   static class c extends faa {
      private static final fbb b = new fbb(new aiy("widget/cross_button"), new aiy("widget/cross_button_highlighted"));

      protected c(ezo.c $$0, vq $$1) {
         super(0, 0, 14, 14, b, $$0);
         this.a(faz.a($$1));
      }
   }

   class d extends ess.e {
      @Override
      public void a(ezb $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
      }

      @Override
      public vq a() {
         return vq.i();
      }
   }

   abstract class e extends fak.a<ess.e> {
      private static final int a = 10;
      private static final int c = 28;
      private static final int d = 7;

      protected void a(eto $$0, ezb $$1, int $$2, int $$3, int $$4, int $$5) {
         int $$6 = $$2 - 10 - 7;
         int $$7 = $$3 + 2;
         if ($$0.j) {
            this.a($$1, $$6, $$7, $$4, $$5, ess.c, () -> ess.M);
         } else if ($$0.e == eto.c.a) {
            this.a($$1, $$6, $$7, $$4, $$5, ess.x, () -> ess.Q);
         } else if (ess.this.h($$0) && $$0.l < 7) {
            this.a($$1, $$6, $$7, $$4, $$5, ess.v, () -> {
               if ($$0.l <= 0) {
                  return ess.N;
               } else {
                  return (vq)($$0.l == 1 ? ess.O : vq.a("mco.selectServer.expires.days", $$0.l));
               }
            });
         } else if ($$0.e == eto.c.b) {
            this.a($$1, $$6, $$7, $$4, $$5, ess.w, () -> ess.P);
         }
      }

      private void a(ezb $$0, int $$1, int $$2, int $$3, int $$4, aiy $$5, Supplier<vq> $$6) {
         $$0.a($$5, $$1, $$2, 10, 28);
         if (ess.this.ax.c((double)$$3, (double)$$4) && $$3 >= $$1 && $$3 <= $$1 + 10 && $$4 >= $$2 && $$4 <= $$2 + 28) {
            ess.this.d($$6.get());
         }
      }

      protected void a(ezb $$0, int $$1, int $$2, eto $$3) {
         int $$4 = this.b($$2);
         int $$5 = this.a($$1);
         int $$6 = this.d($$5);
         if (!ess.this.h($$3)) {
            $$0.a(ess.this.i, $$3.f, $$4, this.d($$5), -8355712, false);
         } else if ($$3.j) {
            vq $$7 = $$3.k ? ess.I : ess.G;
            $$0.a(ess.this.i, $$7, $$4, $$6, -2142128, false);
         }
      }

      protected void a(ezb $$0, String $$1, int $$2, int $$3, int $$4, int $$5) {
         int $$6 = $$4 - $$2;
         if (ess.this.i.b($$1) > $$6) {
            String $$7 = ess.this.i.a($$1, $$6 - ess.this.i.b("... "));
            $$0.a(ess.this.i, $$7 + "...", $$2, $$3, $$5, false);
         } else {
            $$0.a(ess.this.i, $$1, $$2, $$3, $$5, false);
         }
      }

      protected int a(int $$0, int $$1, vq $$2) {
         return $$0 + $$1 - ess.this.i.a($$2) - 20;
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

   static class g extends fat.b {
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

      public g(vq $$0, aiy $$1, ezo.c $$2) {
         super(20, 20, $$0, 14, 14, $$1, $$2);
      }

      int a() {
         return this.w;
      }

      public void a(int $$0) {
         this.w = $$0;
      }

      @Override
      public void b(ezb $$0, int $$1, int $$2, float $$3) {
         super.b($$0, $$1, $$2, $$3);
         if (this.j && this.w != 0) {
            this.a($$0);
         }
      }

      private void a(ezb $$0) {
         $$0.a(d[Math.min(this.w, 6) - 1], this.B() + this.w() - 5, this.C() - 3, 8, 8);
      }
   }

   class h extends ess.e {
      private static final int c = 40;
      private static final int d = -12303292;
      private final vq e;
      private final int f;
      private final List<ezm> g = new ArrayList<>();
      @Nullable
      private final ess.c h;
      private final fai i;
      private final fcz j;
      private final fcy k;
      private int l = -1;

      public h(vq $$0, int $$1, etn $$2) {
         this.e = $$0;
         this.f = $$1;
         this.j = new fcz();
         int $$3 = 7;
         this.j.a(fab.a(20, 20, ess.a), 0, 0, this.j.b().a(7, 7, 0, 0));
         this.j.a(fdf.a(40), 0, 0);
         this.k = this.j.a(new fcy(0, 9 * 3 * ($$1 - 1)), 0, 1, this.j.b().c(7));
         this.i = this.k.a(new fai($$0, ess.this.i).b(true), this.k.b().b().d());
         this.j.a(fdf.a(40), 0, 2);
         if ($$2.b()) {
            this.h = this.j.a(new ess.c($$1x -> ess.this.a($$2.c()), vq.c("mco.notification.dismiss")), 0, 2, this.j.b().c().a(0, 7, 7, 0));
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
      public void b(ezb $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         super.b($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
         $$0.b($$3 - 2, $$2 - 2, $$4, 36 * this.f - 2, -12303292);
      }

      @Override
      public void a(ezb $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
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

   class i extends ess.e {
      private final eto c;
      private final fbc d = new fbc();

      public i(eto $$0) {
         this.c = $$0;
         this.d.a(faz.a(vq.c("mco.snapshot.parent.tooltip")));
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         return true;
      }

      @Override
      public void a(ezb $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = this.b($$3);
         int $$11 = this.a($$2);
         ewe.a($$0, $$3, $$2, 32, this.c.g);
         vq $$12 = ess.a(this.c.t, -8355712);
         int $$13 = this.a($$3, $$4, $$12);
         this.a($$0, this.c.b(), $$10, $$11, $$13, -8355712);
         if ($$12 != vp.a) {
            $$0.a(ess.this.i, $$12, $$13, $$11, -8355712, false);
         }

         $$0.a(ess.this.i, this.c.a(), $$10, this.c($$11), -8355712, false);
         this.a($$0, $$2, $$3, this.c);
         this.a(this.c, $$0, $$3 + $$4, $$2, $$6, $$7);
         this.d.a($$8, this.aL_(), new fdt($$3, $$2, $$4, $$5));
      }

      @Override
      public vq a() {
         return vq.b(this.c.c);
      }
   }

   class j extends gnc<ess.e> {
      public j() {
         super(ess.this.g, ess.this.h, 0, 36);
      }

      public void a(@Nullable ess.e $$0) {
         super.a($$0);
         ess.this.J();
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
      T request(esx var1) throws euk;
   }

   class l extends ess.e {
      private static final int c = 36;
      private final eto d;
      private final fbc e = new fbc();

      public l(eto $$0) {
         this.d = $$0;
         boolean $$1 = ess.this.h($$0);
         if (ess.b() && $$1 && $$0.h()) {
            this.e.a(faz.a(vq.a("mco.snapshot.paired", $$0.s)));
         } else if (!$$1 && $$0.e()) {
            this.e.a(faz.a(vq.a("mco.snapshot.friendsRealm.upgrade", $$0.f)));
         } else if (!$$1 && $$0.f()) {
            this.e.a(faz.a(vq.a("mco.snapshot.friendsRealm.downgrade", $$0.t)));
         }
      }

      @Override
      public void a(ezb $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         if (this.d.e == eto.c.c) {
            $$0.a(ess.b, $$3 - 5, $$2 + $$5 / 2 - 10, 40, 20);
            int $$10 = $$2 + $$5 / 2 - 9 / 2;
            $$0.b(ess.this.i, ess.F, $$3 + 40 - 2, $$10, 8388479);
         } else {
            ewe.a($$0, $$3, $$2, 32, this.d.g);
            this.a($$0, $$2, $$3, $$4);
            this.a($$0, $$2, $$3);
            this.a($$0, $$2, $$3, this.d);
            this.a(this.d, $$0, $$3 + $$4, $$2, $$6, $$7);
            this.e.a($$8, this.aL_(), new fdt($$3, $$2, $$4, $$5));
         }
      }

      private void a(ezb $$0, int $$1, int $$2, int $$3) {
         int $$4 = this.b($$2);
         int $$5 = this.a($$1);
         vq $$6 = ess.a(this.d.t, this.d.d());
         int $$7 = this.a($$2, $$3, $$6);
         this.a($$0, this.d.b(), $$4, $$5, $$7, -1);
         if ($$6 != vp.a) {
            $$0.a(ess.this.i, $$6, $$7, $$5, -8355712, false);
         }
      }

      private void a(ezb $$0, int $$1, int $$2) {
         int $$3 = this.b($$2);
         int $$4 = this.a($$1);
         int $$5 = this.c($$4);
         String $$6 = this.d.c();
         if (this.d.m == eto.d.b && $$6 != null) {
            vq $$7 = vq.b($$6).a(n.h);
            $$0.a(ess.this.i, vq.a("mco.selectServer.minigameName", $$7).b(-171), $$3, $$5, -1, false);
         } else {
            $$0.a(ess.this.i, this.d.a(), $$3, this.c($$4), -8355712, false);
         }
      }

      private void d() {
         ess.this.f.aj().a(gkj.a(atl.zK, 1.0F));
         ess.a(this.d, ess.this);
      }

      private void e() {
         ess.this.f.aj().a(gkj.a(atl.zK, 1.0F));
         euz $$0 = new euz(ess.this, this.d);
         ess.this.f.a($$0);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         if (this.d.e == eto.c.c) {
            this.e();
         } else if (ess.this.a(this.d)) {
            if (ac.b() - ess.this.aC < 250L && this.aL_()) {
               this.d();
            }

            ess.this.aC = ac.b();
         }

         return true;
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         if (fdo.a($$0)) {
            if (this.d.e == eto.c.c) {
               this.e();
               return true;
            }

            if (ess.this.a(this.d)) {
               this.d();
               return true;
            }
         }

         return super.a($$0, $$1, $$2);
      }

      @Override
      public vq a() {
         return (vq)(this.d.e == eto.c.c ? ess.R : vq.a("narrator.select", this.d.c));
      }

      public eto c() {
         return this.d;
      }
   }
}
