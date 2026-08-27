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

public class eyi extends gtb {
   static final akh a = new akh("icon/info");
   static final akh b = new akh("icon/new_realm");
   static final akh c = new akh("realm_status/expired");
   static final akh B = new akh("realm_status/expires_soon");
   static final akh C = new akh("realm_status/open");
   static final akh D = new akh("realm_status/closed");
   private static final akh E = new akh("icon/invite");
   private static final akh F = new akh("icon/news");
   static final Logger G = LogUtils.getLogger();
   private static final akh H = new akh("textures/gui/title/realms.png");
   private static final akh I = new akh("textures/gui/realms/no_realms.png");
   private static final wu J = wu.c("menu.online");
   private static final wu K = wu.c("mco.selectServer.loading");
   static final wu L = wu.c("mco.selectServer.uninitialized");
   static final wu M = wu.c("mco.selectServer.expiredList");
   private static final wu N = wu.c("mco.selectServer.expiredRenew");
   static final wu O = wu.c("mco.selectServer.expiredTrial");
   private static final wu P = wu.c("mco.selectServer.play");
   private static final wu Q = wu.c("mco.selectServer.leave");
   private static final wu R = wu.c("mco.selectServer.configure");
   static final wu S = wu.c("mco.selectServer.expired");
   static final wu T = wu.c("mco.selectServer.expires.soon");
   static final wu U = wu.c("mco.selectServer.expires.day");
   static final wu V = wu.c("mco.selectServer.open");
   static final wu W = wu.c("mco.selectServer.closed");
   static final wu X = wu.a("gui.narrate.button", L);
   private static final wu Y = wu.c("mco.selectServer.noRealms");
   private static final wu Z = wu.c("mco.invites.nopending");
   private static final wu aa = wu.c("mco.invites.pending");
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
   private final CompletableFuture<eyh.a> as = eyh.a();
   @Nullable
   private fbm.c at;
   private final Set<UUID> au = new HashSet<>();
   private static boolean av;
   private final RateLimiter aw;
   private final fld ax;
   private ffe ay;
   private ffe az;
   private ffe aA;
   private ffe aB;
   private ffe aC;
   eyi.j aD;
   private faf aE;
   private List<eze> aF = List.of();
   private volatile boolean aG;
   @Nullable
   private volatile String aH;
   long aI;
   private final List<ezd> aJ = new ArrayList<>();
   private ffe aK;
   private eyi.g aL;
   private eyi.g aM;
   private eyi.f aN;
   @Nullable
   private fir aO;

   public eyi(fld $$0) {
      super(J);
      this.ax = $$0;
      this.aw = RateLimiter.create(0.016666668F);
   }

   @Override
   public void aM_() {
      this.aE = new faf(this.m);
      this.aD = new eyi.j();
      wu $$0 = wu.c("mco.invites.title");
      this.aL = new eyi.g($$0, E, $$1x -> this.m.a(new fay(this, $$0)));
      wu $$1 = wu.c("mco.news");
      this.aM = new eyi.g($$1, F, $$0x -> {
         String $$1x = this.aH;
         if ($$1x != null) {
            fju.a(this, $$1x);
            if (this.aM.a() != 0) {
               fbs.a $$2 = fbs.b();
               $$2.b = false;
               fbs.b($$2);
               this.aM.a(0);
            }
         }
      });
      this.aM.a(fgp.a($$1));
      this.ay = ffe.a(P, $$0x -> a(this.M(), this)).a(100).a();
      this.aB = ffe.a(R, $$0x -> this.f(this.M())).a(100).a();
      this.aA = ffe.a(N, $$0x -> this.e(this.M())).a(100).a();
      this.aC = ffe.a(Q, $$0x -> this.g(this.M())).a(100).a();
      this.aK = ffe.a(wu.c("mco.selectServer.purchase"), $$0x -> this.N()).b(100, 20).a();
      this.az = ffe.a(wt.k, $$0x -> this.d()).a(100).a();
      if (eyn.a == eyn.b.b) {
         this.c(ffl.a(wu.b("Snapshot"), wu.b("Release")).a(5, 5, 100, 20, wu.b("Realm"), ($$0x, $$1x) -> {
            ar = $$1x;
            this.aF = List.of();
            this.I();
         }));
      }

      this.a(eyi.f.a);
      this.F();
      this.as.thenAcceptAsync($$0x -> {
         fld $$1x = $$0x.a(this.ax);
         if ($$1x == null) {
            this.at = this.a(this.m.bc());
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

   private void C() {
      if (this.aE.a() && this.aF.isEmpty() && this.aJ.isEmpty()) {
         this.a(eyi.f.b);
      } else {
         this.a(eyi.f.c);
      }
   }

   private void a(eyi.f $$0) {
      if (this.aN != $$0) {
         if (this.aO != null) {
            this.aO.a($$1 -> this.e($$1));
         }

         this.aO = this.b($$0);
         this.aN = $$0;
         this.aO.a($$1 -> {
            ffc var10000 = this.c($$1);
         });
         this.c();
      }
   }

   private fir b(eyi.f $$0) {
      fir $$1 = new fir(this);
      $$1.b(44);
      $$1.a(this.D());
      fis $$2 = this.c($$0);
      $$2.a();
      $$1.a($$2.v() + 22);
      $$1.b($$2);
      switch ($$0) {
         case a:
            $$1.c(new fft(this.p, K));
            break;
         case b:
            $$1.c(this.E());
            break;
         case c:
            $$1.c(this.aD);
      }

      return $$1;
   }

   private fis D() {
      int $$0 = 90;
      fiv $$1 = fiv.e().a(4);
      $$1.c().e();
      $$1.a(this.aL);
      $$1.a(this.aM);
      fiv $$2 = fiv.e();
      $$2.c().e();
      $$2.a(fiw.a(90));
      $$2.a(ffr.a(128, 34, H, 128, 64), fiu::b);
      $$2.a(new fip(90, 44)).a($$1, fiu::c);
      return $$2;
   }

   private fis c(eyi.f $$0) {
      fiq $$1 = new fiq().c(4);
      fiq.b $$2 = $$1.d(3);
      if ($$0 == eyi.f.c) {
         $$2.a(this.ay);
         $$2.a(this.aB);
         $$2.a(this.aA);
         $$2.a(this.aC);
      }

      $$2.a(this.aK);
      $$2.a(this.az);
      return $$1;
   }

   private fiv E() {
      fiv $$0 = fiv.d().a(8);
      $$0.c().b();
      $$0.a(ffr.a(130, 64, I, 130, 64));
      ffp $$1 = new ffp(308, Y, this.p, false, 4);
      $$0.a($$1);
      return $$0;
   }

   void F() {
      eze $$0 = this.M();
      this.aK.j = this.aN != eyi.f.a;
      this.ay.j = $$0 != null && this.a($$0);
      this.aA.j = $$0 != null && this.b($$0);
      this.aC.j = $$0 != null && this.d($$0);
      this.aB.j = $$0 != null && this.c($$0);
   }

   boolean a(eze $$0) {
      boolean $$1 = !$$0.j && $$0.e == eze.c.b;
      return $$1 && ($$0.d() || this.h($$0));
   }

   private boolean b(eze $$0) {
      return $$0.j && this.h($$0);
   }

   private boolean c(eze $$0) {
      return this.h($$0) && $$0.e != eze.c.c;
   }

   private boolean d(eze $$0) {
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
      fde.Q().bc().d.a();
   }

   public static void g() {
      fde.Q().bc().c.a();
   }

   private void I() {
      for (fbm.e<?> $$0 : this.m.bc().a()) {
         $$0.a();
      }
   }

   private fbm.c a(fad $$0) {
      fbm.c $$1 = $$0.a.a();
      $$1.a($$0.c, $$0x -> {
         this.aE.a($$0x.a());
         this.aF = $$0x.b();
         this.J();
         boolean $$1x = false;

         for (eze $$2 : this.aE) {
            if (this.i($$2)) {
               $$1x = true;
            }
         }

         if (!av && $$1x) {
            av = true;
            this.K();
         }
      });
      a(eyn::d, $$0x -> {
         this.aJ.clear();
         this.aJ.addAll($$0x);

         for (ezd $$1x : $$0x) {
            if ($$1x instanceof ezd.a $$2) {
               fgg $$3 = $$2.a(this, this::a);
               if ($$3 != null) {
                  this.m.a($$3);
                  this.a(List.of($$1x));
                  break;
               }
            }
         }

         if (!this.aJ.isEmpty() && this.aN != eyi.f.a) {
            this.J();
         }
      });
      $$1.a($$0.d, $$0x -> {
         this.aL.a($$0x);
         this.aL.a($$0x == 0 ? fgp.a(Z) : fgp.a(aa));
         if ($$0x > 0 && this.aw.tryAcquire(1)) {
            this.m.aZ().c(wu.a("mco.configure.world.invite.narration", $$0x));
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

   private void a(Collection<ezd> $$0) {
      List<UUID> $$1 = new ArrayList<>($$0.size());

      for (ezd $$2 : $$0) {
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

   private static <T> void a(eyi.k<T> $$0, Consumer<T> $$1) {
      fde $$2 = fde.Q();
      CompletableFuture.<T>supplyAsync(() -> {
         try {
            return $$0.request(eyn.a($$2));
         } catch (faa var3) {
            throw new RuntimeException(var3);
         }
      }).thenAcceptAsync($$1, $$2).exceptionally($$0x -> {
         G.error("Failed to execute call to Realms Service", $$0x);
         return null;
      });
   }

   private void J() {
      eze $$0 = this.M();
      this.aD.I();

      for (ezd $$1 : this.aJ) {
         if (this.a($$1)) {
            this.a(List.of($$1));
            break;
         }
      }

      for (eze $$2 : this.aF) {
         this.aD.a(new eyi.a($$2));
      }

      for (eze $$3 : this.aE) {
         eyi.e $$4;
         if (b() && !$$3.h()) {
            if ($$3.e == eze.c.c) {
               continue;
            }

            $$4 = new eyi.i($$3);
         } else {
            $$4 = new eyi.l($$3);
         }

         this.aD.a((eyi.e)$$4);
         if ($$0 != null && $$0.a == $$3.a) {
            this.aD.a($$4);
         }
      }

      this.C();
      this.F();
   }

   private boolean a(ezd $$0) {
      if (!($$0 instanceof ezd.c $$1)) {
         return false;
      } else {
         wu $$2 = $$1.d();
         int $$3 = this.p.b($$2, 216);
         int $$4 = axz.e($$3 + 7, 36) - 1;
         this.aD.a(new eyi.h($$2, $$4 + 2, $$1));

         for (int $$5 = 0; $$5 < $$4; $$5++) {
            this.aD.a(new eyi.d());
         }

         this.aD.a(new eyi.b($$1.a(this)));
         return true;
      }
   }

   private void K() {
      new Thread(() -> {
         List<ezo> $$0 = eym.a();
         eyn $$1 = eyn.a();
         eyz $$2 = new eyz();
         $$2.a = $$0;
         $$2.b = this.L();

         try {
            $$1.a($$2);
         } catch (Throwable var5) {
            G.warn("Could not send ping result to Realms: ", var5);
         }
      }).start();
   }

   private List<Long> L() {
      List<Long> $$0 = Lists.newArrayList();

      for (eze $$1 : this.aE) {
         if (this.i($$1)) {
            $$0.add($$1.a);
         }
      }

      return $$0;
   }

   private void e(@Nullable eze $$0) {
      if ($$0 != null) {
         String $$1 = awv.a($$0.b, this.m.X().b(), $$0.k);
         this.m.o.a($$1);
         ac.j().a($$1);
      }
   }

   private void f(@Nullable eze $$0) {
      if ($$0 != null && this.m.b($$0.g)) {
         this.m.a(new fan(this, $$0.a));
      }
   }

   private void g(@Nullable eze $$0) {
      if ($$0 != null && !this.m.b($$0.g)) {
         wu $$1 = wu.c("mco.configure.world.leave.question.line1");
         wu $$2 = wu.c("mco.configure.world.leave.question.line2");
         this.m.a(new fat($$1x -> this.a($$1x, $$0), fat.a.b, $$1, $$2, true));
      }
   }

   @Nullable
   private eze M() {
      return this.aD.h() instanceof eyi.l $$0 ? $$0.c() : null;
   }

   private void a(boolean $$0, final eze $$1) {
      if ($$0) {
         (new Thread("Realms-leave-server") {
            @Override
            public void run() {
               try {
                  eyn $$0 = eyn.a();
                  $$0.d($$1.a);
                  eyi.this.m.execute(eyi::g);
               } catch (faa var2) {
                  eyi.G.error("Couldn't configure world", var2);
                  eyi.this.m.execute(() -> eyi.this.m.a(new far(var2, eyi.this)));
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
         this.J();
      });
   }

   public void h() {
      this.aD.a(null);
      g();
   }

   @Override
   public wu i() {
      return (wu)(switch (this.aN) {
         case a -> wt.a(super.i(), K);
         case b -> wt.a(super.i(), Y);
         case c -> super.i();
      });
   }

   @Override
   public void a(fer $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (b()) {
         $$0.b(this.p, "Minecraft " + aa.b().c(), 2, this.o - 10, -1);
      }

      if (this.aG && this.aK.j) {
         fba.a($$0, this.aK);
      }

      switch (eyn.a) {
         case b:
            this.a($$0, "STAGE!", -256);
            break;
         case c:
            this.a($$0, "LOCAL!", 8388479);
      }
   }

   private void N() {
      this.m.a(new fba(this, this.aG));
   }

   public static void a(@Nullable eze $$0, fld $$1) {
      a($$0, $$1, false);
   }

   public static void a(@Nullable eze $$0, fld $$1, boolean $$2) {
      if ($$0 != null) {
         if (!b() || $$2) {
            fde.Q().a(new fau($$1, new fcd($$1, $$0)));
            return;
         }

         switch ($$0.u) {
            case e:
               fde.Q().a(new fau($$1, new fcd($$1, $$0)));
               break;
            case a:
               a($$0, $$1, wu.c("mco.compatibility.unverifiable.title").b(-171), wu.c("mco.compatibility.unverifiable.message"), wt.j);
               break;
            case c:
               a(
                  $$0,
                  $$1,
                  wu.c("selectWorld.backupQuestion.downgrade").b(-2142128),
                  wu.a("mco.compatibility.downgrade.description", wu.b($$0.t).b(-171), wu.b(aa.b().c()).b(-171)),
                  wu.c("mco.compatibility.downgrade")
               );
               break;
            case d:
               a(
                  $$0,
                  $$1,
                  wu.c("mco.compatibility.upgrade.title").b(-171),
                  wu.a("mco.compatibility.upgrade.description", wu.b($$0.t).b(-171), wu.b(aa.b().c()).b(-171)),
                  wu.c("mco.compatibility.upgrade")
               );
         }
      }
   }

   private static void a(eze $$0, fld $$1, wu $$2, wu $$3, wu $$4) {
      fde.Q().a(new fjv($$2x -> {
         fld $$3x;
         if ($$2x) {
            $$3x = new fau($$1, new fcd($$1, $$0));
            g();
         } else {
            $$3x = $$1;
         }

         fde.Q().a($$3x);
      }, $$2, $$3, $$4, wt.e));
   }

   public static wu a(String $$0, boolean $$1) {
      return a($$0, $$1 ? -8355712 : -2142128);
   }

   public static wu a(String $$0, int $$1) {
      return (wu)(StringUtils.isBlank($$0) ? wt.a : wu.a("mco.version", wu.b($$0).b($$1)));
   }

   boolean h(eze $$0) {
      return this.m.b($$0.g);
   }

   private boolean i(eze $$0) {
      return this.h($$0) && !$$0.j;
   }

   private void a(fer $$0, String $$1, int $$2) {
      $$0.c().a();
      $$0.c().a((float)(this.n / 2 - 25), 20.0F, 0.0F);
      $$0.c().a(a.f.rotationDegrees(-20.0F));
      $$0.c().b(1.5F, 1.5F, 1.5F);
      $$0.a(this.p, $$1, 0, 0, $$2, false);
      $$0.c().b();
   }

   class a extends eyi.e {
      private static final wu c = wu.c("mco.snapshot.start");
      private static final int d = 5;
      private final fgs e = new fgs();
      private final eze f;

      public a(eze $$0) {
         this.f = $$0;
         this.e.a(fgp.a(wu.c("mco.snapshot.tooltip")));
      }

      @Override
      public void a(fer $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(eyi.b, $$3 - 5, $$2 + $$5 / 2 - 10, 40, 20);
         int $$10 = $$2 + $$5 / 2 - 9 / 2;
         $$0.b(eyi.this.p, c, $$3 + 40 - 2, $$10 - 5, 8388479);
         $$0.b(eyi.this.p, wu.a("mco.snapshot.description", this.f.c), $$3 + 40 - 2, $$10 + 5, -8355712);
         this.e.a($$8, this.aI_(), new fjk($$3, $$2, $$4, $$5));
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         this.c();
         return true;
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         if (fjf.a($$0)) {
            this.c();
            return true;
         } else {
            return super.a($$0, $$1, $$2);
         }
      }

      private void c() {
         eyi.this.m.ak().a(gqh.a(avc.Ad, 1.0F));
         eyi.this.m
            .a(
               new fgg.a(eyi.this, wu.c("mco.snapshot.createSnapshotPopup.title"))
                  .a(wu.c("mco.snapshot.createSnapshotPopup.text"))
                  .a(wu.c("mco.selectServer.create"), $$0 -> eyi.this.m.a(new fap(eyi.this, this.f.a)))
                  .a(wt.e, fgg::d)
                  .a()
            );
      }

      @Override
      public wu a() {
         return wu.a("gui.narrate.button", wt.a(c, wu.a("mco.snapshot.description", this.f.c)));
      }
   }

   class b extends eyi.e {
      private final ffe c;

      public b(ffe $$0) {
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
      public void a(fer $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.c.c(eyi.this.n / 2 - 75, $$2 + 4);
         this.c.a($$0, $$6, $$7, $$9);
      }

      @Override
      public void a(boolean $$0) {
         super.a($$0);
         this.c.a($$0);
      }

      @Override
      public wu a() {
         return this.c.y();
      }
   }

   static class c extends ffq {
      private static final fgr b = new fgr(new akh("widget/cross_button"), new akh("widget/cross_button_highlighted"));

      protected c(ffe.c $$0, wu $$1) {
         super(0, 0, 14, 14, b, $$0);
         this.a(fgp.a($$1));
      }
   }

   class d extends eyi.e {
      @Override
      public void a(fer $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
      }

      @Override
      public wu a() {
         return wu.i();
      }
   }

   abstract class e extends fga.a<eyi.e> {
      private static final int a = 10;
      private static final int c = 28;
      private static final int d = 7;

      protected void a(eze $$0, fer $$1, int $$2, int $$3, int $$4, int $$5) {
         int $$6 = $$2 - 10 - 7;
         int $$7 = $$3 + 2;
         if ($$0.j) {
            this.a($$1, $$6, $$7, $$4, $$5, eyi.c, () -> eyi.S);
         } else if ($$0.e == eze.c.a) {
            this.a($$1, $$6, $$7, $$4, $$5, eyi.D, () -> eyi.W);
         } else if (eyi.this.h($$0) && $$0.l < 7) {
            this.a($$1, $$6, $$7, $$4, $$5, eyi.B, () -> {
               if ($$0.l <= 0) {
                  return eyi.T;
               } else {
                  return (wu)($$0.l == 1 ? eyi.U : wu.a("mco.selectServer.expires.days", $$0.l));
               }
            });
         } else if ($$0.e == eze.c.b) {
            this.a($$1, $$6, $$7, $$4, $$5, eyi.C, () -> eyi.V);
         }
      }

      private void a(fer $$0, int $$1, int $$2, int $$3, int $$4, akh $$5, Supplier<wu> $$6) {
         $$0.a($$5, $$1, $$2, 10, 28);
         if (eyi.this.aD.c((double)$$3, (double)$$4) && $$3 >= $$1 && $$3 <= $$1 + 10 && $$4 >= $$2 && $$4 <= $$2 + 28) {
            eyi.this.d($$6.get());
         }
      }

      protected void a(fer $$0, int $$1, int $$2, eze $$3) {
         int $$4 = this.b($$2);
         int $$5 = this.a($$1);
         int $$6 = this.d($$5);
         if (!eyi.this.h($$3)) {
            $$0.a(eyi.this.p, $$3.f, $$4, this.d($$5), -8355712, false);
         } else if ($$3.j) {
            wu $$7 = $$3.k ? eyi.O : eyi.M;
            $$0.a(eyi.this.p, $$7, $$4, $$6, -2142128, false);
         }
      }

      protected void a(fer $$0, String $$1, int $$2, int $$3, int $$4, int $$5) {
         int $$6 = $$4 - $$2;
         if (eyi.this.p.b($$1) > $$6) {
            String $$7 = eyi.this.p.a($$1, $$6 - eyi.this.p.b("... "));
            $$0.a(eyi.this.p, $$7 + "...", $$2, $$3, $$5, false);
         } else {
            $$0.a(eyi.this.p, $$1, $$2, $$3, $$5, false);
         }
      }

      protected int a(int $$0, int $$1, wu $$2) {
         return $$0 + $$1 - eyi.this.p.a($$2) - 20;
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

   static class g extends fgj.b {
      private static final akh[] d = new akh[]{
         new akh("notification/1"),
         new akh("notification/2"),
         new akh("notification/3"),
         new akh("notification/4"),
         new akh("notification/5"),
         new akh("notification/more")
      };
      private static final int u = Integer.MAX_VALUE;
      private static final int v = 20;
      private static final int w = 14;
      private int x;

      public g(wu $$0, akh $$1, ffe.c $$2) {
         super(20, 20, $$0, 14, 14, $$1, $$2, null);
      }

      int a() {
         return this.x;
      }

      public void a(int $$0) {
         this.x = $$0;
      }

      @Override
      public void b(fer $$0, int $$1, int $$2, float $$3) {
         super.b($$0, $$1, $$2, $$3);
         if (this.j && this.x != 0) {
            this.a($$0);
         }
      }

      private void a(fer $$0) {
         $$0.a(d[Math.min(this.x, 6) - 1], this.C() + this.x() - 5, this.D() - 3, 8, 8);
      }
   }

   class h extends eyi.e {
      private static final int c = 40;
      private static final int d = -12303292;
      private final wu e;
      private final int f;
      private final List<ffc> g = new ArrayList<>();
      @Nullable
      private final eyi.c h;
      private final ffy i;
      private final fiq j;
      private final fip k;
      private int l = -1;

      public h(wu $$0, int $$1, ezd $$2) {
         this.e = $$0;
         this.f = $$1;
         this.j = new fiq();
         int $$3 = 7;
         this.j.a(ffr.a(20, 20, eyi.a), 0, 0, this.j.b().a(7, 7, 0, 0));
         this.j.a(fiw.a(40), 0, 0);
         this.k = this.j.a(new fip(0, 9 * 3 * ($$1 - 1)), 0, 1, this.j.b().c(7));
         this.i = this.k.a(new ffy($$0, eyi.this.p).b(true), this.k.b().b().d());
         this.j.a(fiw.a(40), 0, 2);
         if ($$2.b()) {
            this.h = this.j.a(new eyi.c($$1x -> eyi.this.a($$2.c()), wu.c("mco.notification.dismiss")), 0, 2, this.j.b().c().a(0, 7, 7, 0));
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
      public void b(fer $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         super.b($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
         $$0.b($$3 - 2, $$2 - 2, $$4, 36 * this.f - 2, -12303292);
      }

      @Override
      public void a(fer $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
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
      public wu a() {
         return this.e;
      }
   }

   class i extends eyi.e {
      private final eze c;
      private final fgs d = new fgs();

      public i(eze $$0) {
         this.c = $$0;
         if (!$$0.j) {
            this.d.a(fgp.a(wu.c("mco.snapshot.parent.tooltip")));
         }
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         return true;
      }

      @Override
      public void a(fer $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = this.b($$3);
         int $$11 = this.a($$2);
         fbu.a($$0, $$3, $$2, 32, this.c.g);
         wu $$12 = eyi.a(this.c.t, -8355712);
         int $$13 = this.a($$3, $$4, $$12);
         this.a($$0, this.c.b(), $$10, $$11, $$13, -8355712);
         if ($$12 != wt.a) {
            $$0.a(eyi.this.p, $$12, $$13, $$11, -8355712, false);
         }

         $$0.a(eyi.this.p, this.c.a(), $$10, this.c($$11), -8355712, false);
         this.a($$0, $$2, $$3, this.c);
         this.a(this.c, $$0, $$3 + $$4, $$2, $$6, $$7);
         this.d.a($$8, this.aI_(), new fjk($$3, $$2, $$4, $$5));
      }

      @Override
      public wu a() {
         return wu.b(this.c.c);
      }
   }

   class j extends gta<eyi.e> {
      public j() {
         super(eyi.this.n, eyi.this.o, 0, 36);
      }

      public void a(@Nullable eyi.e $$0) {
         super.a($$0);
         eyi.this.F();
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
      T request(eyn var1) throws faa;
   }

   class l extends eyi.e {
      private static final int c = 36;
      private final eze d;
      private final fgs e = new fgs();

      public l(eze $$0) {
         this.d = $$0;
         boolean $$1 = eyi.this.h($$0);
         if (eyi.b() && $$1 && $$0.h()) {
            this.e.a(fgp.a(wu.a("mco.snapshot.paired", $$0.s)));
         } else if (!$$1 && $$0.e()) {
            this.e.a(fgp.a(wu.a("mco.snapshot.friendsRealm.upgrade", $$0.f)));
         } else if (!$$1 && $$0.f()) {
            this.e.a(fgp.a(wu.a("mco.snapshot.friendsRealm.downgrade", $$0.t)));
         }
      }

      @Override
      public void a(fer $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         if (this.d.e == eze.c.c) {
            $$0.a(eyi.b, $$3 - 5, $$2 + $$5 / 2 - 10, 40, 20);
            int $$10 = $$2 + $$5 / 2 - 9 / 2;
            $$0.b(eyi.this.p, eyi.L, $$3 + 40 - 2, $$10, 8388479);
         } else {
            fbu.a($$0, $$3, $$2, 32, this.d.g);
            this.a($$0, $$2, $$3, $$4);
            this.a($$0, $$2, $$3);
            this.a($$0, $$2, $$3, this.d);
            this.a(this.d, $$0, $$3 + $$4, $$2, $$6, $$7);
            this.e.a($$8, this.aI_(), new fjk($$3, $$2, $$4, $$5));
         }
      }

      private void a(fer $$0, int $$1, int $$2, int $$3) {
         int $$4 = this.b($$2);
         int $$5 = this.a($$1);
         wu $$6 = eyi.a(this.d.t, this.d.d());
         int $$7 = this.a($$2, $$3, $$6);
         this.a($$0, this.d.b(), $$4, $$5, $$7, -1);
         if ($$6 != wt.a) {
            $$0.a(eyi.this.p, $$6, $$7, $$5, -8355712, false);
         }
      }

      private void a(fer $$0, int $$1, int $$2) {
         int $$3 = this.b($$2);
         int $$4 = this.a($$1);
         int $$5 = this.c($$4);
         String $$6 = this.d.c();
         if (this.d.m == eze.d.b && $$6 != null) {
            wu $$7 = wu.b($$6).a(n.h);
            $$0.a(eyi.this.p, wu.a("mco.selectServer.minigameName", $$7).b(-171), $$3, $$5, -1, false);
         } else {
            $$0.a(eyi.this.p, this.d.a(), $$3, this.c($$4), -8355712, false);
         }
      }

      private void d() {
         eyi.this.m.ak().a(gqh.a(avc.Ad, 1.0F));
         eyi.a(this.d, eyi.this);
      }

      private void e() {
         eyi.this.m.ak().a(gqh.a(avc.Ad, 1.0F));
         fap $$0 = new fap(eyi.this, this.d);
         eyi.this.m.a($$0);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         if (this.d.e == eze.c.c) {
            this.e();
         } else if (eyi.this.a(this.d)) {
            if (ac.b() - eyi.this.aI < 250L && this.aI_()) {
               this.d();
            }

            eyi.this.aI = ac.b();
         }

         return true;
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         if (fjf.a($$0)) {
            if (this.d.e == eze.c.c) {
               this.e();
               return true;
            }

            if (eyi.this.a(this.d)) {
               this.d();
               return true;
            }
         }

         return super.a($$0, $$1, $$2);
      }

      @Override
      public wu a() {
         return (wu)(this.d.e == eze.c.c ? eyi.X : wu.a("narrator.select", this.d.c));
      }

      public eze c() {
         return this.d;
      }
   }
}
