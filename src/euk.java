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

public class euk extends gpb {
   static final ajh a = new ajh("icon/info");
   static final ajh b = new ajh("icon/new_realm");
   static final ajh c = new ajh("realm_status/expired");
   static final ajh v = new ajh("realm_status/expires_soon");
   static final ajh w = new ajh("realm_status/open");
   static final ajh x = new ajh("realm_status/closed");
   private static final ajh y = new ajh("icon/invite");
   private static final ajh z = new ajh("icon/news");
   static final Logger A = LogUtils.getLogger();
   private static final ajh B = new ajh("textures/gui/title/realms.png");
   private static final ajh C = new ajh("textures/gui/realms/no_realms.png");
   private static final vu D = vu.c("menu.online");
   private static final vu E = vu.c("mco.selectServer.loading");
   static final vu F = vu.c("mco.selectServer.uninitialized");
   static final vu G = vu.c("mco.selectServer.expiredList");
   private static final vu H = vu.c("mco.selectServer.expiredRenew");
   static final vu I = vu.c("mco.selectServer.expiredTrial");
   private static final vu J = vu.c("mco.selectServer.play");
   private static final vu K = vu.c("mco.selectServer.leave");
   private static final vu L = vu.c("mco.selectServer.configure");
   static final vu M = vu.c("mco.selectServer.expired");
   static final vu N = vu.c("mco.selectServer.expires.soon");
   static final vu O = vu.c("mco.selectServer.expires.day");
   static final vu P = vu.c("mco.selectServer.open");
   static final vu Q = vu.c("mco.selectServer.closed");
   static final vu R = vu.a("gui.narrate.button", F);
   private static final vu S = vu.c("mco.selectServer.noRealms");
   private static final vu T = vu.c("mco.invites.nopending");
   private static final vu U = vu.c("mco.invites.pending");
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
   private final CompletableFuture<euj.a> am = euj.a();
   @Nullable
   private exo.c an;
   private final Set<UUID> ao = new HashSet<>();
   private static boolean ap;
   private final RateLimiter aq;
   private final fhf ar;
   private fbg as;
   private fbg at;
   private fbg au;
   private fbg av;
   private fbg aw;
   euk.j ax;
   private ewh ay;
   private List<evg> az = List.of();
   private volatile boolean aA;
   @Nullable
   private volatile String aB;
   long aC;
   private final List<evf> aD = new ArrayList<>();
   private fbg aE;
   private euk.g aF;
   private euk.g aG;
   private euk.f aH;
   @Nullable
   private fet aI;

   public euk(fhf $$0) {
      super(D);
      this.ar = $$0;
      this.aq = RateLimiter.create(0.016666668F);
   }

   @Override
   public void aO_() {
      this.ay = new ewh(this.f);
      this.ax = new euk.j();
      vu $$0 = vu.c("mco.invites.title");
      this.aF = new euk.g($$0, y, $$1x -> this.f.a(new exa(this, $$0)));
      vu $$1 = vu.c("mco.news");
      this.aG = new euk.g($$1, z, $$0x -> {
         String $$1x = this.aB;
         if ($$1x != null) {
            ffw.a(this, $$1x);
            if (this.aG.a() != 0) {
               exu.a $$2 = exu.b();
               $$2.b = false;
               exu.b($$2);
               this.aG.a(0);
            }
         }
      });
      this.aG.a(fcr.a($$1));
      this.as = fbg.a(J, $$0x -> a(this.O(), this)).a(100).a();
      this.av = fbg.a(L, $$0x -> this.f(this.O())).a(100).a();
      this.au = fbg.a(H, $$0x -> this.e(this.O())).a(100).a();
      this.aw = fbg.a(K, $$0x -> this.g(this.O())).a(100).a();
      this.aE = fbg.a(vu.c("mco.selectServer.purchase"), $$0x -> this.P()).b(100, 20).a();
      this.at = fbg.a(vt.k, $$0x -> this.d()).a(100).a();
      if (eup.a == eup.b.b) {
         this.c(fbn.a(vu.b("Snapshot"), vu.b("Release")).a(5, 5, 100, 20, vu.b("Realm"), ($$0x, $$1x) -> {
            al = $$1x;
            this.az = List.of();
            this.K();
         }));
      }

      this.a(euk.f.a);
      this.J();
      this.am.thenAcceptAsync($$0x -> {
         fhf $$1x = $$0x.a(this.ar);
         if ($$1x == null) {
            this.an = this.a(this.f.bb());
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
         this.a(euk.f.b);
      } else {
         this.a(euk.f.c);
      }
   }

   private void a(euk.f $$0) {
      if (this.aH != $$0) {
         if (this.aI != null) {
            this.aI.a($$1 -> this.e($$1));
         }

         this.aI = this.b($$0);
         this.aH = $$0;
         this.aI.a($$1 -> {
            fbe var10000 = this.c($$1);
         });
         this.c();
      }
   }

   private fet b(euk.f $$0) {
      fet $$1 = new fet(this);
      $$1.b(44);
      $$1.a(this.H());
      feu $$2 = this.c($$0);
      $$2.a();
      $$1.a($$2.u() + 22);
      $$1.b($$2);
      switch ($$0) {
         case a:
            $$1.c(new fbv(this.i, E));
            break;
         case b:
            $$1.c(this.I());
            break;
         case c:
            $$1.c(this.ax);
      }

      return $$1;
   }

   private feu H() {
      int $$0 = 90;
      fex $$1 = fex.e().a(4);
      $$1.c().e();
      $$1.a(this.aF);
      $$1.a(this.aG);
      fex $$2 = fex.e();
      $$2.c().e();
      $$2.a(fey.a(90));
      $$2.a(fbt.a(128, 34, B, 128, 64), few::b);
      $$2.a(new fer(90, 44)).a($$1, few::c);
      return $$2;
   }

   private feu c(euk.f $$0) {
      fes $$1 = new fes().c(4);
      fes.b $$2 = $$1.d(3);
      if ($$0 == euk.f.c) {
         $$2.a(this.as);
         $$2.a(this.av);
         $$2.a(this.au);
         $$2.a(this.aw);
      }

      $$2.a(this.aE);
      $$2.a(this.at);
      return $$1;
   }

   private fex I() {
      fex $$0 = fex.d().a(10);
      $$0.c().b();
      $$0.a(fbt.a(130, 64, C, 130, 64));
      fbr $$1 = new fbr(308, S, this.i, false);
      $$0.a($$1);
      return $$0;
   }

   void J() {
      evg $$0 = this.O();
      this.aE.j = this.aH != euk.f.a;
      this.as.j = $$0 != null && this.a($$0);
      this.au.j = $$0 != null && this.b($$0);
      this.aw.j = $$0 != null && this.d($$0);
      this.av.j = $$0 != null && this.c($$0);
   }

   boolean a(evg $$0) {
      boolean $$1 = !$$0.j && $$0.e == evg.c.b;
      return $$1 && ($$0.d() || this.h($$0));
   }

   private boolean b(evg $$0) {
      return $$0.j && this.h($$0);
   }

   private boolean c(evg $$0) {
      return this.h($$0) && $$0.e != evg.c.c;
   }

   private boolean d(evg $$0) {
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
      ezg.Q().bb().d.a();
   }

   public static void g() {
      ezg.Q().bb().c.a();
   }

   private void K() {
      for (exo.e<?> $$0 : this.f.bb().a()) {
         $$0.a();
      }
   }

   private exo.c a(ewf $$0) {
      exo.c $$1 = $$0.a.a();
      $$1.a($$0.c, $$0x -> {
         this.ay.a($$0x.a());
         this.az = $$0x.b();
         this.L();
         boolean $$1x = false;

         for (evg $$2 : this.ay) {
            if (this.i($$2)) {
               $$1x = true;
            }
         }

         if (!ap && $$1x) {
            ap = true;
            this.M();
         }
      });
      a(eup::d, $$0x -> {
         this.aD.clear();
         this.aD.addAll($$0x);

         for (evf $$1x : $$0x) {
            if ($$1x instanceof evf.a $$2) {
               fci $$3 = $$2.a(this, this::a);
               if ($$3 != null) {
                  this.f.a($$3);
                  this.a(List.of($$1x));
                  break;
               }
            }
         }

         if (!this.aD.isEmpty() && this.aH != euk.f.a) {
            this.L();
         }
      });
      $$1.a($$0.d, $$0x -> {
         this.aF.a($$0x);
         this.aF.a($$0x == 0 ? fcr.a(T) : fcr.a(U));
         if ($$0x > 0 && this.aq.tryAcquire(1)) {
            this.f.aY().c(vu.a("mco.configure.world.invite.narration", $$0x));
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

   private void a(Collection<evf> $$0) {
      List<UUID> $$1 = new ArrayList<>($$0.size());

      for (evf $$2 : $$0) {
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

   private static <T> void a(euk.k<T> $$0, Consumer<T> $$1) {
      ezg $$2 = ezg.Q();
      CompletableFuture.<T>supplyAsync(() -> {
         try {
            return $$0.request(eup.a($$2));
         } catch (ewc var3) {
            throw new RuntimeException(var3);
         }
      }).thenAcceptAsync($$1, $$2).exceptionally($$0x -> {
         A.error("Failed to execute call to Realms Service", $$0x);
         return null;
      });
   }

   private void L() {
      evg $$0 = this.O();
      this.ax.H();

      for (evf $$1 : this.aD) {
         if (this.a($$1)) {
            this.a(List.of($$1));
            break;
         }
      }

      for (evg $$2 : this.az) {
         this.ax.a(new euk.a($$2));
      }

      for (evg $$3 : this.ay) {
         euk.e $$4;
         if (b() && !$$3.h()) {
            if ($$3.e == evg.c.c) {
               continue;
            }

            $$4 = new euk.i($$3);
         } else {
            $$4 = new euk.l($$3);
         }

         this.ax.a((euk.e)$$4);
         if ($$0 != null && $$0.a == $$3.a) {
            this.ax.a($$4);
         }
      }

      this.E();
      this.J();
   }

   private boolean a(evf $$0) {
      if (!($$0 instanceof evf.c $$1)) {
         return false;
      } else {
         vu $$2 = $$1.d();
         int $$3 = this.i.b($$2, 216);
         int $$4 = aww.e($$3 + 7, 36) - 1;
         this.ax.a(new euk.h($$2, $$4 + 2, $$1));

         for (int $$5 = 0; $$5 < $$4; $$5++) {
            this.ax.a(new euk.d());
         }

         this.ax.a(new euk.b($$1.a(this)));
         return true;
      }
   }

   private void M() {
      new Thread(() -> {
         List<evq> $$0 = euo.a();
         eup $$1 = eup.a();
         evb $$2 = new evb();
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

      for (evg $$1 : this.ay) {
         if (this.i($$1)) {
            $$0.add($$1.a);
         }
      }

      return $$0;
   }

   private void e(@Nullable evg $$0) {
      if ($$0 != null) {
         String $$1 = avs.a($$0.b, this.f.X().b(), $$0.k);
         this.f.o.a($$1);
         ac.j().a($$1);
      }
   }

   private void f(@Nullable evg $$0) {
      if ($$0 != null && this.f.b($$0.g)) {
         this.f.a(new ewp(this, $$0.a));
      }
   }

   private void g(@Nullable evg $$0) {
      if ($$0 != null && !this.f.b($$0.g)) {
         vu $$1 = vu.c("mco.configure.world.leave.question.line1");
         vu $$2 = vu.c("mco.configure.world.leave.question.line2");
         this.f.a(new ewv($$1x -> this.a($$1x, $$0), ewv.a.b, $$1, $$2, true));
      }
   }

   @Nullable
   private evg O() {
      return this.ax.i() instanceof euk.l $$0 ? $$0.c() : null;
   }

   private void a(boolean $$0, final evg $$1) {
      if ($$0) {
         (new Thread("Realms-leave-server") {
            @Override
            public void run() {
               try {
                  eup $$0 = eup.a();
                  $$0.d($$1.a);
                  euk.this.f.execute(euk::g);
               } catch (ewc var2) {
                  euk.A.error("Couldn't configure world", var2);
                  euk.this.f.execute(() -> euk.this.f.a(new ewt(var2, euk.this)));
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
   public vu i() {
      return (vu)(switch (this.aH) {
         case a -> vt.a(super.i(), E);
         case b -> vt.a(super.i(), S);
         case c -> super.i();
      });
   }

   @Override
   public void a(fat $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (b()) {
         $$0.b(this.i, "Minecraft " + aa.b().c(), 2, this.h - 10, -1);
      }

      if (this.aA && this.aE.j) {
         exc.a($$0, this.aE);
      }

      switch (eup.a) {
         case b:
            this.a($$0, "STAGE!", -256);
            break;
         case c:
            this.a($$0, "LOCAL!", 8388479);
      }
   }

   private void P() {
      this.f.a(new exc(this, this.aA));
   }

   public static void a(@Nullable evg $$0, fhf $$1) {
      a($$0, $$1, false);
   }

   public static void a(@Nullable evg $$0, fhf $$1, boolean $$2) {
      if ($$0 != null) {
         if (!b() || $$2) {
            ezg.Q().a(new eww($$1, new eyf($$1, $$0)));
            return;
         }

         switch ($$0.u) {
            case e:
               ezg.Q().a(new eww($$1, new eyf($$1, $$0)));
               break;
            case a:
               a($$0, $$1, vu.c("mco.compatibility.unverifiable.title").b(-171), vu.c("mco.compatibility.unverifiable.message"), vt.j);
               break;
            case c:
               a(
                  $$0,
                  $$1,
                  vu.c("selectWorld.backupQuestion.downgrade").b(-2142128),
                  vu.a("mco.compatibility.downgrade.description", vu.b($$0.t).b(-171), vu.b(aa.b().c()).b(-171)),
                  vu.c("mco.compatibility.downgrade")
               );
               break;
            case d:
               a(
                  $$0,
                  $$1,
                  vu.c("mco.compatibility.upgrade.title").b(-171),
                  vu.a("mco.compatibility.upgrade.description", vu.b($$0.t).b(-171), vu.b(aa.b().c()).b(-171)),
                  vu.c("mco.compatibility.upgrade")
               );
         }
      }
   }

   private static void a(evg $$0, fhf $$1, vu $$2, vu $$3, vu $$4) {
      ezg.Q().a(new ffx($$2x -> {
         fhf $$3x;
         if ($$2x) {
            $$3x = new eww($$1, new eyf($$1, $$0));
            g();
         } else {
            $$3x = $$1;
         }

         ezg.Q().a($$3x);
      }, $$2, $$3, $$4, vt.e));
   }

   public static vu a(String $$0, boolean $$1) {
      return a($$0, $$1 ? -8355712 : -2142128);
   }

   public static vu a(String $$0, int $$1) {
      return (vu)(StringUtils.isBlank($$0) ? vt.a : vu.a("mco.version", vu.b($$0).b($$1)));
   }

   boolean h(evg $$0) {
      return this.f.b($$0.g);
   }

   private boolean i(evg $$0) {
      return this.h($$0) && !$$0.j;
   }

   private void a(fat $$0, String $$1, int $$2) {
      $$0.c().a();
      $$0.c().a((float)(this.g / 2 - 25), 20.0F, 0.0F);
      $$0.c().a(a.f.rotationDegrees(-20.0F));
      $$0.c().b(1.5F, 1.5F, 1.5F);
      $$0.a(this.i, $$1, 0, 0, $$2, false);
      $$0.c().b();
   }

   class a extends euk.e {
      private static final vu c = vu.c("mco.snapshot.start");
      private static final int d = 5;
      private final fcu e = new fcu();
      private final evg f;

      public a(evg $$0) {
         this.f = $$0;
         this.e.a(fcr.a(vu.c("mco.snapshot.tooltip")));
      }

      @Override
      public void a(fat $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(euk.b, $$3 - 5, $$2 + $$5 / 2 - 10, 40, 20);
         int $$10 = $$2 + $$5 / 2 - 9 / 2;
         $$0.b(euk.this.i, c, $$3 + 40 - 2, $$10 - 5, 8388479);
         $$0.b(euk.this.i, vu.a("mco.snapshot.description", this.f.c), $$3 + 40 - 2, $$10 + 5, -8355712);
         this.e.a($$8, this.aJ_(), new ffm($$3, $$2, $$4, $$5));
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         this.c();
         return true;
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         if (ffh.a($$0)) {
            this.c();
            return true;
         } else {
            return super.a($$0, $$1, $$2);
         }
      }

      private void c() {
         euk.this.f.ak().a(gmh.a(aty.zN, 1.0F));
         euk.this.f
            .a(
               new fci.a(euk.this, vu.c("mco.snapshot.createSnapshotPopup.title"))
                  .a(vu.c("mco.snapshot.createSnapshotPopup.text"))
                  .a(vu.c("mco.selectServer.create"), $$0 -> euk.this.f.a(new ewr(euk.this, this.f.a)))
                  .a(vt.e, fci::d)
                  .a()
            );
      }

      @Override
      public vu a() {
         return vu.a("gui.narrate.button", vt.a(c, vu.a("mco.snapshot.description", this.f.c)));
      }
   }

   class b extends euk.e {
      private final fbg c;

      public b(fbg $$0) {
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
      public void a(fat $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.c.c(euk.this.g / 2 - 75, $$2 + 4);
         this.c.a($$0, $$6, $$7, $$9);
      }

      @Override
      public void a(boolean $$0) {
         super.a($$0);
         this.c.a($$0);
      }

      @Override
      public vu a() {
         return this.c.x();
      }
   }

   static class c extends fbs {
      private static final fct b = new fct(new ajh("widget/cross_button"), new ajh("widget/cross_button_highlighted"));

      protected c(fbg.c $$0, vu $$1) {
         super(0, 0, 14, 14, b, $$0);
         this.a(fcr.a($$1));
      }
   }

   class d extends euk.e {
      @Override
      public void a(fat $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
      }

      @Override
      public vu a() {
         return vu.i();
      }
   }

   abstract class e extends fcc.a<euk.e> {
      private static final int a = 10;
      private static final int c = 28;
      private static final int d = 7;

      protected void a(evg $$0, fat $$1, int $$2, int $$3, int $$4, int $$5) {
         int $$6 = $$2 - 10 - 7;
         int $$7 = $$3 + 2;
         if ($$0.j) {
            this.a($$1, $$6, $$7, $$4, $$5, euk.c, () -> euk.M);
         } else if ($$0.e == evg.c.a) {
            this.a($$1, $$6, $$7, $$4, $$5, euk.x, () -> euk.Q);
         } else if (euk.this.h($$0) && $$0.l < 7) {
            this.a($$1, $$6, $$7, $$4, $$5, euk.v, () -> {
               if ($$0.l <= 0) {
                  return euk.N;
               } else {
                  return (vu)($$0.l == 1 ? euk.O : vu.a("mco.selectServer.expires.days", $$0.l));
               }
            });
         } else if ($$0.e == evg.c.b) {
            this.a($$1, $$6, $$7, $$4, $$5, euk.w, () -> euk.P);
         }
      }

      private void a(fat $$0, int $$1, int $$2, int $$3, int $$4, ajh $$5, Supplier<vu> $$6) {
         $$0.a($$5, $$1, $$2, 10, 28);
         if (euk.this.ax.c((double)$$3, (double)$$4) && $$3 >= $$1 && $$3 <= $$1 + 10 && $$4 >= $$2 && $$4 <= $$2 + 28) {
            euk.this.d($$6.get());
         }
      }

      protected void a(fat $$0, int $$1, int $$2, evg $$3) {
         int $$4 = this.b($$2);
         int $$5 = this.a($$1);
         int $$6 = this.d($$5);
         if (!euk.this.h($$3)) {
            $$0.a(euk.this.i, $$3.f, $$4, this.d($$5), -8355712, false);
         } else if ($$3.j) {
            vu $$7 = $$3.k ? euk.I : euk.G;
            $$0.a(euk.this.i, $$7, $$4, $$6, -2142128, false);
         }
      }

      protected void a(fat $$0, String $$1, int $$2, int $$3, int $$4, int $$5) {
         int $$6 = $$4 - $$2;
         if (euk.this.i.b($$1) > $$6) {
            String $$7 = euk.this.i.a($$1, $$6 - euk.this.i.b("... "));
            $$0.a(euk.this.i, $$7 + "...", $$2, $$3, $$5, false);
         } else {
            $$0.a(euk.this.i, $$1, $$2, $$3, $$5, false);
         }
      }

      protected int a(int $$0, int $$1, vu $$2) {
         return $$0 + $$1 - euk.this.i.a($$2) - 20;
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

   static class g extends fcl.b {
      private static final ajh[] d = new ajh[]{
         new ajh("notification/1"),
         new ajh("notification/2"),
         new ajh("notification/3"),
         new ajh("notification/4"),
         new ajh("notification/5"),
         new ajh("notification/more")
      };
      private static final int t = Integer.MAX_VALUE;
      private static final int u = 20;
      private static final int v = 14;
      private int w;

      public g(vu $$0, ajh $$1, fbg.c $$2) {
         super(20, 20, $$0, 14, 14, $$1, $$2);
      }

      int a() {
         return this.w;
      }

      public void a(int $$0) {
         this.w = $$0;
      }

      @Override
      public void b(fat $$0, int $$1, int $$2, float $$3) {
         super.b($$0, $$1, $$2, $$3);
         if (this.j && this.w != 0) {
            this.a($$0);
         }
      }

      private void a(fat $$0) {
         $$0.a(d[Math.min(this.w, 6) - 1], this.B() + this.w() - 5, this.C() - 3, 8, 8);
      }
   }

   class h extends euk.e {
      private static final int c = 40;
      private static final int d = -12303292;
      private final vu e;
      private final int f;
      private final List<fbe> g = new ArrayList<>();
      @Nullable
      private final euk.c h;
      private final fca i;
      private final fes j;
      private final fer k;
      private int l = -1;

      public h(vu $$0, int $$1, evf $$2) {
         this.e = $$0;
         this.f = $$1;
         this.j = new fes();
         int $$3 = 7;
         this.j.a(fbt.a(20, 20, euk.a), 0, 0, this.j.b().a(7, 7, 0, 0));
         this.j.a(fey.a(40), 0, 0);
         this.k = this.j.a(new fer(0, 9 * 3 * ($$1 - 1)), 0, 1, this.j.b().c(7));
         this.i = this.k.a(new fca($$0, euk.this.i).b(true), this.k.b().b().d());
         this.j.a(fey.a(40), 0, 2);
         if ($$2.b()) {
            this.h = this.j.a(new euk.c($$1x -> euk.this.a($$2.c()), vu.c("mco.notification.dismiss")), 0, 2, this.j.b().c().a(0, 7, 7, 0));
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
      public void b(fat $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         super.b($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
         $$0.b($$3 - 2, $$2 - 2, $$4, 36 * this.f - 2, -12303292);
      }

      @Override
      public void a(fat $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
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
      public vu a() {
         return this.e;
      }
   }

   class i extends euk.e {
      private final evg c;
      private final fcu d = new fcu();

      public i(evg $$0) {
         this.c = $$0;
         this.d.a(fcr.a(vu.c("mco.snapshot.parent.tooltip")));
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         return true;
      }

      @Override
      public void a(fat $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = this.b($$3);
         int $$11 = this.a($$2);
         exw.a($$0, $$3, $$2, 32, this.c.g);
         vu $$12 = euk.a(this.c.t, -8355712);
         int $$13 = this.a($$3, $$4, $$12);
         this.a($$0, this.c.b(), $$10, $$11, $$13, -8355712);
         if ($$12 != vt.a) {
            $$0.a(euk.this.i, $$12, $$13, $$11, -8355712, false);
         }

         $$0.a(euk.this.i, this.c.a(), $$10, this.c($$11), -8355712, false);
         this.a($$0, $$2, $$3, this.c);
         this.a(this.c, $$0, $$3 + $$4, $$2, $$6, $$7);
         this.d.a($$8, this.aJ_(), new ffm($$3, $$2, $$4, $$5));
      }

      @Override
      public vu a() {
         return vu.b(this.c.c);
      }
   }

   class j extends gpa<euk.e> {
      public j() {
         super(euk.this.g, euk.this.h, 0, 36);
      }

      public void a(@Nullable euk.e $$0) {
         super.a($$0);
         euk.this.J();
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
      T request(eup var1) throws ewc;
   }

   class l extends euk.e {
      private static final int c = 36;
      private final evg d;
      private final fcu e = new fcu();

      public l(evg $$0) {
         this.d = $$0;
         boolean $$1 = euk.this.h($$0);
         if (euk.b() && $$1 && $$0.h()) {
            this.e.a(fcr.a(vu.a("mco.snapshot.paired", $$0.s)));
         } else if (!$$1 && $$0.e()) {
            this.e.a(fcr.a(vu.a("mco.snapshot.friendsRealm.upgrade", $$0.f)));
         } else if (!$$1 && $$0.f()) {
            this.e.a(fcr.a(vu.a("mco.snapshot.friendsRealm.downgrade", $$0.t)));
         }
      }

      @Override
      public void a(fat $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         if (this.d.e == evg.c.c) {
            $$0.a(euk.b, $$3 - 5, $$2 + $$5 / 2 - 10, 40, 20);
            int $$10 = $$2 + $$5 / 2 - 9 / 2;
            $$0.b(euk.this.i, euk.F, $$3 + 40 - 2, $$10, 8388479);
         } else {
            exw.a($$0, $$3, $$2, 32, this.d.g);
            this.a($$0, $$2, $$3, $$4);
            this.a($$0, $$2, $$3);
            this.a($$0, $$2, $$3, this.d);
            this.a(this.d, $$0, $$3 + $$4, $$2, $$6, $$7);
            this.e.a($$8, this.aJ_(), new ffm($$3, $$2, $$4, $$5));
         }
      }

      private void a(fat $$0, int $$1, int $$2, int $$3) {
         int $$4 = this.b($$2);
         int $$5 = this.a($$1);
         vu $$6 = euk.a(this.d.t, this.d.d());
         int $$7 = this.a($$2, $$3, $$6);
         this.a($$0, this.d.b(), $$4, $$5, $$7, -1);
         if ($$6 != vt.a) {
            $$0.a(euk.this.i, $$6, $$7, $$5, -8355712, false);
         }
      }

      private void a(fat $$0, int $$1, int $$2) {
         int $$3 = this.b($$2);
         int $$4 = this.a($$1);
         int $$5 = this.c($$4);
         String $$6 = this.d.c();
         if (this.d.m == evg.d.b && $$6 != null) {
            vu $$7 = vu.b($$6).a(n.h);
            $$0.a(euk.this.i, vu.a("mco.selectServer.minigameName", $$7).b(-171), $$3, $$5, -1, false);
         } else {
            $$0.a(euk.this.i, this.d.a(), $$3, this.c($$4), -8355712, false);
         }
      }

      private void d() {
         euk.this.f.ak().a(gmh.a(aty.zN, 1.0F));
         euk.a(this.d, euk.this);
      }

      private void e() {
         euk.this.f.ak().a(gmh.a(aty.zN, 1.0F));
         ewr $$0 = new ewr(euk.this, this.d);
         euk.this.f.a($$0);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         if (this.d.e == evg.c.c) {
            this.e();
         } else if (euk.this.a(this.d)) {
            if (ac.b() - euk.this.aC < 250L && this.aJ_()) {
               this.d();
            }

            euk.this.aC = ac.b();
         }

         return true;
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         if (ffh.a($$0)) {
            if (this.d.e == evg.c.c) {
               this.e();
               return true;
            }

            if (euk.this.a(this.d)) {
               this.d();
               return true;
            }
         }

         return super.a($$0, $$1, $$2);
      }

      @Override
      public vu a() {
         return (vu)(this.d.e == evg.c.c ? euk.R : vu.a("narrator.select", this.d.c));
      }

      public evg c() {
         return this.d;
      }
   }
}
