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

public class ezd extends gty {
   static final akm a = new akm("icon/info");
   static final akm b = new akm("icon/new_realm");
   static final akm c = new akm("realm_status/expired");
   static final akm B = new akm("realm_status/expires_soon");
   static final akm C = new akm("realm_status/open");
   static final akm D = new akm("realm_status/closed");
   private static final akm E = new akm("icon/invite");
   private static final akm F = new akm("icon/news");
   static final Logger G = LogUtils.getLogger();
   private static final akm H = new akm("textures/gui/title/realms.png");
   private static final akm I = new akm("textures/gui/realms/no_realms.png");
   private static final wx J = wx.c("menu.online");
   private static final wx K = wx.c("mco.selectServer.loading");
   static final wx L = wx.c("mco.selectServer.uninitialized");
   static final wx M = wx.c("mco.selectServer.expiredList");
   private static final wx N = wx.c("mco.selectServer.expiredRenew");
   static final wx O = wx.c("mco.selectServer.expiredTrial");
   private static final wx P = wx.c("mco.selectServer.play");
   private static final wx Q = wx.c("mco.selectServer.leave");
   private static final wx R = wx.c("mco.selectServer.configure");
   static final wx S = wx.c("mco.selectServer.expired");
   static final wx T = wx.c("mco.selectServer.expires.soon");
   static final wx U = wx.c("mco.selectServer.expires.day");
   static final wx V = wx.c("mco.selectServer.open");
   static final wx W = wx.c("mco.selectServer.closed");
   static final wx X = wx.a("gui.narrate.button", L);
   private static final wx Y = wx.c("mco.selectServer.noRealms");
   private static final wx Z = wx.c("mco.invites.nopending");
   private static final wx aa = wx.c("mco.invites.pending");
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
   private final CompletableFuture<ezc.a> as = ezc.a();
   @Nullable
   private fch.c at;
   private final Set<UUID> au = new HashSet<>();
   private static boolean av;
   private final RateLimiter aw;
   private final fly ax;
   private ffz ay;
   private ffz az;
   private ffz aA;
   private ffz aB;
   private ffz aC;
   ezd.j aD;
   private fba aE;
   private List<ezz> aF = List.of();
   private volatile boolean aG;
   @Nullable
   private volatile String aH;
   long aI;
   private final List<ezy> aJ = new ArrayList<>();
   private ffz aK;
   private ezd.g aL;
   private ezd.g aM;
   private ezd.f aN;
   @Nullable
   private fjm aO;

   public ezd(fly $$0) {
      super(J);
      this.ax = $$0;
      this.aw = RateLimiter.create(0.016666668F);
   }

   @Override
   public void aM_() {
      this.aE = new fba(this.m);
      this.aD = new ezd.j();
      wx $$0 = wx.c("mco.invites.title");
      this.aL = new ezd.g($$0, E, $$1x -> this.m.a(new fbt(this, $$0)));
      wx $$1 = wx.c("mco.news");
      this.aM = new ezd.g($$1, F, $$0x -> {
         String $$1x = this.aH;
         if ($$1x != null) {
            fkp.a(this, $$1x);
            if (this.aM.a() != 0) {
               fcn.a $$2 = fcn.b();
               $$2.b = false;
               fcn.b($$2);
               this.aM.a(0);
            }
         }
      });
      this.aM.a(fhk.a($$1));
      this.ay = ffz.a(P, $$0x -> a(this.M(), this)).a(100).a();
      this.aB = ffz.a(R, $$0x -> this.f(this.M())).a(100).a();
      this.aA = ffz.a(N, $$0x -> this.e(this.M())).a(100).a();
      this.aC = ffz.a(Q, $$0x -> this.g(this.M())).a(100).a();
      this.aK = ffz.a(wx.c("mco.selectServer.purchase"), $$0x -> this.N()).b(100, 20).a();
      this.az = ffz.a(ww.k, $$0x -> this.d()).a(100).a();
      if (ezi.a == ezi.b.b) {
         this.c(fgg.a(wx.b("Snapshot"), wx.b("Release")).a(5, 5, 100, 20, wx.b("Realm"), ($$0x, $$1x) -> {
            ar = $$1x;
            this.aF = List.of();
            this.I();
         }));
      }

      this.a(ezd.f.a);
      this.F();
      this.as.thenAcceptAsync($$0x -> {
         fly $$1x = $$0x.a(this.ax);
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
         this.a(ezd.f.b);
      } else {
         this.a(ezd.f.c);
      }
   }

   private void a(ezd.f $$0) {
      if (this.aN != $$0) {
         if (this.aO != null) {
            this.aO.a($$1 -> this.e($$1));
         }

         this.aO = this.b($$0);
         this.aN = $$0;
         this.aO.a($$1 -> {
            ffx var10000 = this.c($$1);
         });
         this.c();
      }
   }

   private fjm b(ezd.f $$0) {
      fjm $$1 = new fjm(this);
      $$1.b(44);
      $$1.a(this.D());
      fjn $$2 = this.c($$0);
      $$2.a();
      $$1.a($$2.v() + 22);
      $$1.b($$2);
      switch ($$0) {
         case a:
            $$1.c(new fgo(this.p, K));
            break;
         case b:
            $$1.c(this.E());
            break;
         case c:
            $$1.c(this.aD);
      }

      return $$1;
   }

   private fjn D() {
      int $$0 = 90;
      fjq $$1 = fjq.e().a(4);
      $$1.c().e();
      $$1.a(this.aL);
      $$1.a(this.aM);
      fjq $$2 = fjq.e();
      $$2.c().e();
      $$2.a(fjr.a(90));
      $$2.a(fgm.a(128, 34, H, 128, 64), fjp::b);
      $$2.a(new fjk(90, 44)).a($$1, fjp::c);
      return $$2;
   }

   private fjn c(ezd.f $$0) {
      fjl $$1 = new fjl().c(4);
      fjl.b $$2 = $$1.d(3);
      if ($$0 == ezd.f.c) {
         $$2.a(this.ay);
         $$2.a(this.aB);
         $$2.a(this.aA);
         $$2.a(this.aC);
      }

      $$2.a(this.aK);
      $$2.a(this.az);
      return $$1;
   }

   private fjq E() {
      fjq $$0 = fjq.d().a(8);
      $$0.c().b();
      $$0.a(fgm.a(130, 64, I, 130, 64));
      fgk $$1 = new fgk(308, Y, this.p, false, 4);
      $$0.a($$1);
      return $$0;
   }

   void F() {
      ezz $$0 = this.M();
      this.aK.j = this.aN != ezd.f.a;
      this.ay.j = $$0 != null && this.a($$0);
      this.aA.j = $$0 != null && this.b($$0);
      this.aC.j = $$0 != null && this.d($$0);
      this.aB.j = $$0 != null && this.c($$0);
   }

   boolean a(ezz $$0) {
      boolean $$1 = !$$0.j && $$0.e == ezz.c.b;
      return $$1 && ($$0.d() || this.h($$0));
   }

   private boolean b(ezz $$0) {
      return $$0.j && this.h($$0);
   }

   private boolean c(ezz $$0) {
      return this.h($$0) && $$0.e != ezz.c.c;
   }

   private boolean d(ezz $$0) {
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
      fdz.Q().bc().d.a();
   }

   public static void g() {
      fdz.Q().bc().c.a();
   }

   private void I() {
      for (fch.e<?> $$0 : this.m.bc().a()) {
         $$0.a();
      }
   }

   private fch.c a(fay $$0) {
      fch.c $$1 = $$0.a.a();
      $$1.a($$0.c, $$0x -> {
         this.aE.a($$0x.a());
         this.aF = $$0x.b();
         this.J();
         boolean $$1x = false;

         for (ezz $$2 : this.aE) {
            if (this.i($$2)) {
               $$1x = true;
            }
         }

         if (!av && $$1x) {
            av = true;
            this.K();
         }
      });
      a(ezi::d, $$0x -> {
         this.aJ.clear();
         this.aJ.addAll($$0x);

         for (ezy $$1x : $$0x) {
            if ($$1x instanceof ezy.a $$2) {
               fhb $$3 = $$2.a(this, this::a);
               if ($$3 != null) {
                  this.m.a($$3);
                  this.a(List.of($$1x));
                  break;
               }
            }
         }

         if (!this.aJ.isEmpty() && this.aN != ezd.f.a) {
            this.J();
         }
      });
      $$1.a($$0.d, $$0x -> {
         this.aL.a($$0x);
         this.aL.a($$0x == 0 ? fhk.a(Z) : fhk.a(aa));
         if ($$0x > 0 && this.aw.tryAcquire(1)) {
            this.m.aZ().c(wx.a("mco.configure.world.invite.narration", $$0x));
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

   private void a(Collection<ezy> $$0) {
      List<UUID> $$1 = new ArrayList<>($$0.size());

      for (ezy $$2 : $$0) {
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

   private static <T> void a(ezd.k<T> $$0, Consumer<T> $$1) {
      fdz $$2 = fdz.Q();
      CompletableFuture.<T>supplyAsync(() -> {
         try {
            return $$0.request(ezi.a($$2));
         } catch (fav var3) {
            throw new RuntimeException(var3);
         }
      }).thenAcceptAsync($$1, $$2).exceptionally($$0x -> {
         G.error("Failed to execute call to Realms Service", $$0x);
         return null;
      });
   }

   private void J() {
      ezz $$0 = this.M();
      this.aD.I();

      for (ezy $$1 : this.aJ) {
         if (this.a($$1)) {
            this.a(List.of($$1));
            break;
         }
      }

      for (ezz $$2 : this.aF) {
         this.aD.a(new ezd.a($$2));
      }

      for (ezz $$3 : this.aE) {
         ezd.e $$4;
         if (b() && !$$3.h()) {
            if ($$3.e == ezz.c.c) {
               continue;
            }

            $$4 = new ezd.i($$3);
         } else {
            $$4 = new ezd.l($$3);
         }

         this.aD.a((ezd.e)$$4);
         if ($$0 != null && $$0.a == $$3.a) {
            this.aD.a($$4);
         }
      }

      this.C();
      this.F();
   }

   private boolean a(ezy $$0) {
      if (!($$0 instanceof ezy.c $$1)) {
         return false;
      } else {
         wx $$2 = $$1.d();
         int $$3 = this.p.b($$2, 216);
         int $$4 = ayd.e($$3 + 7, 36) - 1;
         this.aD.a(new ezd.h($$2, $$4 + 2, $$1));

         for (int $$5 = 0; $$5 < $$4; $$5++) {
            this.aD.a(new ezd.d());
         }

         this.aD.a(new ezd.b($$1.a(this)));
         return true;
      }
   }

   private void K() {
      new Thread(() -> {
         List<faj> $$0 = ezh.a();
         ezi $$1 = ezi.a();
         ezu $$2 = new ezu();
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

      for (ezz $$1 : this.aE) {
         if (this.i($$1)) {
            $$0.add($$1.a);
         }
      }

      return $$0;
   }

   private void e(@Nullable ezz $$0) {
      if ($$0 != null) {
         String $$1 = axa.a($$0.b, this.m.X().b(), $$0.k);
         this.m.o.a($$1);
         ac.k().a($$1);
      }
   }

   private void f(@Nullable ezz $$0) {
      if ($$0 != null && this.m.b($$0.g)) {
         this.m.a(new fbi(this, $$0.a));
      }
   }

   private void g(@Nullable ezz $$0) {
      if ($$0 != null && !this.m.b($$0.g)) {
         wx $$1 = wx.c("mco.configure.world.leave.question.line1");
         wx $$2 = wx.c("mco.configure.world.leave.question.line2");
         this.m.a(new fbo($$1x -> this.a($$1x, $$0), fbo.a.b, $$1, $$2, true));
      }
   }

   @Nullable
   private ezz M() {
      return this.aD.h() instanceof ezd.l $$0 ? $$0.c() : null;
   }

   private void a(boolean $$0, final ezz $$1) {
      if ($$0) {
         (new Thread("Realms-leave-server") {
            @Override
            public void run() {
               try {
                  ezi $$0 = ezi.a();
                  $$0.d($$1.a);
                  ezd.this.m.execute(ezd::g);
               } catch (fav var2) {
                  ezd.G.error("Couldn't configure world", var2);
                  ezd.this.m.execute(() -> ezd.this.m.a(new fbm(var2, ezd.this)));
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
   public wx i() {
      return (wx)(switch (this.aN) {
         case a -> ww.a(super.i(), K);
         case b -> ww.a(super.i(), Y);
         case c -> super.i();
      });
   }

   @Override
   public void a(ffm $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (b()) {
         $$0.b(this.p, "Minecraft " + aa.b().c(), 2, this.o - 10, -1);
      }

      if (this.aG && this.aK.j) {
         fbv.a($$0, this.aK);
      }

      switch (ezi.a) {
         case b:
            this.a($$0, "STAGE!", -256);
            break;
         case c:
            this.a($$0, "LOCAL!", 8388479);
      }
   }

   private void N() {
      this.m.a(new fbv(this, this.aG));
   }

   public static void a(@Nullable ezz $$0, fly $$1) {
      a($$0, $$1, false);
   }

   public static void a(@Nullable ezz $$0, fly $$1, boolean $$2) {
      if ($$0 != null) {
         if (!b() || $$2) {
            fdz.Q().a(new fbp($$1, new fcy($$1, $$0)));
            return;
         }

         switch ($$0.u) {
            case e:
               fdz.Q().a(new fbp($$1, new fcy($$1, $$0)));
               break;
            case a:
               a($$0, $$1, wx.c("mco.compatibility.unverifiable.title").b(-171), wx.c("mco.compatibility.unverifiable.message"), ww.j);
               break;
            case c:
               a(
                  $$0,
                  $$1,
                  wx.c("selectWorld.backupQuestion.downgrade").b(-2142128),
                  wx.a("mco.compatibility.downgrade.description", wx.b($$0.t).b(-171), wx.b(aa.b().c()).b(-171)),
                  wx.c("mco.compatibility.downgrade")
               );
               break;
            case d:
               a(
                  $$0,
                  $$1,
                  wx.c("mco.compatibility.upgrade.title").b(-171),
                  wx.a("mco.compatibility.upgrade.description", wx.b($$0.t).b(-171), wx.b(aa.b().c()).b(-171)),
                  wx.c("mco.compatibility.upgrade")
               );
         }
      }
   }

   private static void a(ezz $$0, fly $$1, wx $$2, wx $$3, wx $$4) {
      fdz.Q().a(new fkq($$2x -> {
         fly $$3x;
         if ($$2x) {
            $$3x = new fbp($$1, new fcy($$1, $$0));
            g();
         } else {
            $$3x = $$1;
         }

         fdz.Q().a($$3x);
      }, $$2, $$3, $$4, ww.e));
   }

   public static wx a(String $$0, boolean $$1) {
      return a($$0, $$1 ? -8355712 : -2142128);
   }

   public static wx a(String $$0, int $$1) {
      return (wx)(StringUtils.isBlank($$0) ? ww.a : wx.a("mco.version", wx.b($$0).b($$1)));
   }

   boolean h(ezz $$0) {
      return this.m.b($$0.g);
   }

   private boolean i(ezz $$0) {
      return this.h($$0) && !$$0.j;
   }

   private void a(ffm $$0, String $$1, int $$2) {
      $$0.c().a();
      $$0.c().a((float)(this.n / 2 - 25), 20.0F, 0.0F);
      $$0.c().a(a.f.rotationDegrees(-20.0F));
      $$0.c().b(1.5F, 1.5F, 1.5F);
      $$0.a(this.p, $$1, 0, 0, $$2, false);
      $$0.c().b();
   }

   class a extends ezd.e {
      private static final wx c = wx.c("mco.snapshot.start");
      private static final int d = 5;
      private final fhn e = new fhn();
      private final ezz f;

      public a(ezz $$0) {
         this.f = $$0;
         this.e.a(fhk.a(wx.c("mco.snapshot.tooltip")));
      }

      @Override
      public void a(ffm $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(ezd.b, $$3 - 5, $$2 + $$5 / 2 - 10, 40, 20);
         int $$10 = $$2 + $$5 / 2 - 9 / 2;
         $$0.b(ezd.this.p, c, $$3 + 40 - 2, $$10 - 5, 8388479);
         $$0.b(ezd.this.p, wx.a("mco.snapshot.description", this.f.c), $$3 + 40 - 2, $$10 + 5, -8355712);
         this.e.a($$8, this.aI_(), new fkf($$3, $$2, $$4, $$5));
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         this.c();
         return true;
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         if (fka.a($$0)) {
            this.c();
            return true;
         } else {
            return super.a($$0, $$1, $$2);
         }
      }

      private void c() {
         ezd.this.m.ak().a(gre.a(avh.Ao, 1.0F));
         ezd.this.m
            .a(
               new fhb.a(ezd.this, wx.c("mco.snapshot.createSnapshotPopup.title"))
                  .a(wx.c("mco.snapshot.createSnapshotPopup.text"))
                  .a(wx.c("mco.selectServer.create"), $$0 -> ezd.this.m.a(new fbk(ezd.this, this.f.a)))
                  .a(ww.e, fhb::d)
                  .a()
            );
      }

      @Override
      public wx a() {
         return wx.a("gui.narrate.button", ww.a(c, wx.a("mco.snapshot.description", this.f.c)));
      }
   }

   class b extends ezd.e {
      private final ffz c;

      public b(ffz $$0) {
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
      public void a(ffm $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.c.c(ezd.this.n / 2 - 75, $$2 + 4);
         this.c.a($$0, $$6, $$7, $$9);
      }

      @Override
      public void a(boolean $$0) {
         super.a($$0);
         this.c.a($$0);
      }

      @Override
      public wx a() {
         return this.c.y();
      }
   }

   static class c extends fgl {
      private static final fhm b = new fhm(new akm("widget/cross_button"), new akm("widget/cross_button_highlighted"));

      protected c(ffz.c $$0, wx $$1) {
         super(0, 0, 14, 14, b, $$0);
         this.a(fhk.a($$1));
      }
   }

   class d extends ezd.e {
      @Override
      public void a(ffm $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
      }

      @Override
      public wx a() {
         return wx.i();
      }
   }

   abstract class e extends fgv.a<ezd.e> {
      private static final int a = 10;
      private static final int c = 28;
      private static final int d = 7;

      protected void a(ezz $$0, ffm $$1, int $$2, int $$3, int $$4, int $$5) {
         int $$6 = $$2 - 10 - 7;
         int $$7 = $$3 + 2;
         if ($$0.j) {
            this.a($$1, $$6, $$7, $$4, $$5, ezd.c, () -> ezd.S);
         } else if ($$0.e == ezz.c.a) {
            this.a($$1, $$6, $$7, $$4, $$5, ezd.D, () -> ezd.W);
         } else if (ezd.this.h($$0) && $$0.l < 7) {
            this.a($$1, $$6, $$7, $$4, $$5, ezd.B, () -> {
               if ($$0.l <= 0) {
                  return ezd.T;
               } else {
                  return (wx)($$0.l == 1 ? ezd.U : wx.a("mco.selectServer.expires.days", $$0.l));
               }
            });
         } else if ($$0.e == ezz.c.b) {
            this.a($$1, $$6, $$7, $$4, $$5, ezd.C, () -> ezd.V);
         }
      }

      private void a(ffm $$0, int $$1, int $$2, int $$3, int $$4, akm $$5, Supplier<wx> $$6) {
         $$0.a($$5, $$1, $$2, 10, 28);
         if (ezd.this.aD.c((double)$$3, (double)$$4) && $$3 >= $$1 && $$3 <= $$1 + 10 && $$4 >= $$2 && $$4 <= $$2 + 28) {
            ezd.this.d($$6.get());
         }
      }

      protected void a(ffm $$0, int $$1, int $$2, ezz $$3) {
         int $$4 = this.b($$2);
         int $$5 = this.a($$1);
         int $$6 = this.d($$5);
         if (!ezd.this.h($$3)) {
            $$0.a(ezd.this.p, $$3.f, $$4, this.d($$5), -8355712, false);
         } else if ($$3.j) {
            wx $$7 = $$3.k ? ezd.O : ezd.M;
            $$0.a(ezd.this.p, $$7, $$4, $$6, -2142128, false);
         }
      }

      protected void a(ffm $$0, String $$1, int $$2, int $$3, int $$4, int $$5) {
         int $$6 = $$4 - $$2;
         if (ezd.this.p.b($$1) > $$6) {
            String $$7 = ezd.this.p.a($$1, $$6 - ezd.this.p.b("... "));
            $$0.a(ezd.this.p, $$7 + "...", $$2, $$3, $$5, false);
         } else {
            $$0.a(ezd.this.p, $$1, $$2, $$3, $$5, false);
         }
      }

      protected int a(int $$0, int $$1, wx $$2) {
         return $$0 + $$1 - ezd.this.p.a($$2) - 20;
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

   static class g extends fhe.b {
      private static final akm[] d = new akm[]{
         new akm("notification/1"),
         new akm("notification/2"),
         new akm("notification/3"),
         new akm("notification/4"),
         new akm("notification/5"),
         new akm("notification/more")
      };
      private static final int u = Integer.MAX_VALUE;
      private static final int v = 20;
      private static final int w = 14;
      private int x;

      public g(wx $$0, akm $$1, ffz.c $$2) {
         super(20, 20, $$0, 14, 14, $$1, $$2, null);
      }

      int a() {
         return this.x;
      }

      public void a(int $$0) {
         this.x = $$0;
      }

      @Override
      public void b(ffm $$0, int $$1, int $$2, float $$3) {
         super.b($$0, $$1, $$2, $$3);
         if (this.j && this.x != 0) {
            this.a($$0);
         }
      }

      private void a(ffm $$0) {
         $$0.a(d[Math.min(this.x, 6) - 1], this.C() + this.x() - 5, this.D() - 3, 8, 8);
      }
   }

   class h extends ezd.e {
      private static final int c = 40;
      private static final int d = -12303292;
      private final wx e;
      private final int f;
      private final List<ffx> g = new ArrayList<>();
      @Nullable
      private final ezd.c h;
      private final fgt i;
      private final fjl j;
      private final fjk k;
      private int l = -1;

      public h(wx $$0, int $$1, ezy $$2) {
         this.e = $$0;
         this.f = $$1;
         this.j = new fjl();
         int $$3 = 7;
         this.j.a(fgm.a(20, 20, ezd.a), 0, 0, this.j.b().a(7, 7, 0, 0));
         this.j.a(fjr.a(40), 0, 0);
         this.k = this.j.a(new fjk(0, 9 * 3 * ($$1 - 1)), 0, 1, this.j.b().c(7));
         this.i = this.k.a(new fgt($$0, ezd.this.p).b(true), this.k.b().b().d());
         this.j.a(fjr.a(40), 0, 2);
         if ($$2.b()) {
            this.h = this.j.a(new ezd.c($$1x -> ezd.this.a($$2.c()), wx.c("mco.notification.dismiss")), 0, 2, this.j.b().c().a(0, 7, 7, 0));
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
      public void b(ffm $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         super.b($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
         $$0.b($$3 - 2, $$2 - 2, $$4, 36 * this.f - 2, -12303292);
      }

      @Override
      public void a(ffm $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
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
      public wx a() {
         return this.e;
      }
   }

   class i extends ezd.e {
      private final ezz c;
      private final fhn d = new fhn();

      public i(ezz $$0) {
         this.c = $$0;
         if (!$$0.j) {
            this.d.a(fhk.a(wx.c("mco.snapshot.parent.tooltip")));
         }
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         return true;
      }

      @Override
      public void a(ffm $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = this.b($$3);
         int $$11 = this.a($$2);
         fcp.a($$0, $$3, $$2, 32, this.c.g);
         wx $$12 = ezd.a(this.c.t, -8355712);
         int $$13 = this.a($$3, $$4, $$12);
         this.a($$0, this.c.b(), $$10, $$11, $$13, -8355712);
         if ($$12 != ww.a) {
            $$0.a(ezd.this.p, $$12, $$13, $$11, -8355712, false);
         }

         $$0.a(ezd.this.p, this.c.a(), $$10, this.c($$11), -8355712, false);
         this.a($$0, $$2, $$3, this.c);
         this.a(this.c, $$0, $$3 + $$4, $$2, $$6, $$7);
         this.d.a($$8, this.aI_(), new fkf($$3, $$2, $$4, $$5));
      }

      @Override
      public wx a() {
         return wx.b(this.c.c);
      }
   }

   class j extends gtx<ezd.e> {
      public j() {
         super(ezd.this.n, ezd.this.o, 0, 36);
      }

      public void a(@Nullable ezd.e $$0) {
         super.a($$0);
         ezd.this.F();
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
      T request(ezi var1) throws fav;
   }

   class l extends ezd.e {
      private static final int c = 36;
      private final ezz d;
      private final fhn e = new fhn();

      public l(ezz $$0) {
         this.d = $$0;
         boolean $$1 = ezd.this.h($$0);
         if (ezd.b() && $$1 && $$0.h()) {
            this.e.a(fhk.a(wx.a("mco.snapshot.paired", $$0.s)));
         } else if (!$$1 && $$0.e()) {
            this.e.a(fhk.a(wx.a("mco.snapshot.friendsRealm.upgrade", $$0.f)));
         } else if (!$$1 && $$0.f()) {
            this.e.a(fhk.a(wx.a("mco.snapshot.friendsRealm.downgrade", $$0.t)));
         }
      }

      @Override
      public void a(ffm $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         if (this.d.e == ezz.c.c) {
            $$0.a(ezd.b, $$3 - 5, $$2 + $$5 / 2 - 10, 40, 20);
            int $$10 = $$2 + $$5 / 2 - 9 / 2;
            $$0.b(ezd.this.p, ezd.L, $$3 + 40 - 2, $$10, 8388479);
         } else {
            fcp.a($$0, $$3, $$2, 32, this.d.g);
            this.a($$0, $$2, $$3, $$4);
            this.a($$0, $$2, $$3);
            this.a($$0, $$2, $$3, this.d);
            this.a(this.d, $$0, $$3 + $$4, $$2, $$6, $$7);
            this.e.a($$8, this.aI_(), new fkf($$3, $$2, $$4, $$5));
         }
      }

      private void a(ffm $$0, int $$1, int $$2, int $$3) {
         int $$4 = this.b($$2);
         int $$5 = this.a($$1);
         wx $$6 = ezd.a(this.d.t, this.d.d());
         int $$7 = this.a($$2, $$3, $$6);
         this.a($$0, this.d.b(), $$4, $$5, $$7, -1);
         if ($$6 != ww.a) {
            $$0.a(ezd.this.p, $$6, $$7, $$5, -8355712, false);
         }
      }

      private void a(ffm $$0, int $$1, int $$2) {
         int $$3 = this.b($$2);
         int $$4 = this.a($$1);
         int $$5 = this.c($$4);
         String $$6 = this.d.c();
         if (this.d.m == ezz.d.b && $$6 != null) {
            wx $$7 = wx.b($$6).a(n.h);
            $$0.a(ezd.this.p, wx.a("mco.selectServer.minigameName", $$7).b(-171), $$3, $$5, -1, false);
         } else {
            $$0.a(ezd.this.p, this.d.a(), $$3, this.c($$4), -8355712, false);
         }
      }

      private void d() {
         ezd.this.m.ak().a(gre.a(avh.Ao, 1.0F));
         ezd.a(this.d, ezd.this);
      }

      private void e() {
         ezd.this.m.ak().a(gre.a(avh.Ao, 1.0F));
         fbk $$0 = new fbk(ezd.this, this.d);
         ezd.this.m.a($$0);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         if (this.d.e == ezz.c.c) {
            this.e();
         } else if (ezd.this.a(this.d)) {
            if (ac.c() - ezd.this.aI < 250L && this.aI_()) {
               this.d();
            }

            ezd.this.aI = ac.c();
         }

         return true;
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         if (fka.a($$0)) {
            if (this.d.e == ezz.c.c) {
               this.e();
               return true;
            }

            if (ezd.this.a(this.d)) {
               this.d();
               return true;
            }
         }

         return super.a($$0, $$1, $$2);
      }

      @Override
      public wx a() {
         return (wx)(this.d.e == ezz.c.c ? ezd.X : wx.a("narrator.select", this.d.c));
      }

      public ezz c() {
         return this.d;
      }
   }
}
