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

public class fbn extends gxb {
   static final akt a = new akt("icon/info");
   static final akt b = new akt("icon/new_realm");
   static final akt c = new akt("realm_status/expired");
   static final akt B = new akt("realm_status/expires_soon");
   static final akt C = new akt("realm_status/open");
   static final akt D = new akt("realm_status/closed");
   private static final akt E = new akt("icon/invite");
   private static final akt F = new akt("icon/news");
   static final Logger G = LogUtils.getLogger();
   private static final akt H = new akt("textures/gui/title/realms.png");
   private static final akt I = new akt("textures/gui/realms/no_realms.png");
   private static final xe J = xe.c("menu.online");
   private static final xe K = xe.c("mco.selectServer.loading");
   static final xe L = xe.c("mco.selectServer.uninitialized");
   static final xe M = xe.c("mco.selectServer.expiredList");
   private static final xe N = xe.c("mco.selectServer.expiredRenew");
   static final xe O = xe.c("mco.selectServer.expiredTrial");
   private static final xe P = xe.c("mco.selectServer.play");
   private static final xe Q = xe.c("mco.selectServer.leave");
   private static final xe R = xe.c("mco.selectServer.configure");
   static final xe S = xe.c("mco.selectServer.expired");
   static final xe T = xe.c("mco.selectServer.expires.soon");
   static final xe U = xe.c("mco.selectServer.expires.day");
   static final xe V = xe.c("mco.selectServer.open");
   static final xe W = xe.c("mco.selectServer.closed");
   static final xe X = xe.a("gui.narrate.button", L);
   private static final xe Y = xe.c("mco.selectServer.noRealms");
   private static final xe Z = xe.c("mco.invites.nopending");
   private static final xe aa = xe.c("mco.invites.pending");
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
   private static final boolean aq = !ab.b().g();
   private static boolean ar = aq;
   private final CompletableFuture<fbm.a> as = fbm.a();
   @Nullable
   private fer.c at;
   private final Set<UUID> au = new HashSet<>();
   private static boolean av;
   private final RateLimiter aw;
   private final fon ax;
   private fin ay;
   private fin az;
   private fin aA;
   private fin aB;
   private fin aC;
   fbn.j aD;
   private fdk aE;
   private List<fcj> aF = List.of();
   private volatile boolean aG;
   @Nullable
   private volatile String aH;
   long aI;
   private final List<fci> aJ = new ArrayList<>();
   private fin aK;
   private fbn.g aL;
   private fbn.g aM;
   private fbn.f aN;
   @Nullable
   private fma aO;

   public fbn(fon $$0) {
      super(J);
      this.ax = $$0;
      this.aw = RateLimiter.create(0.016666668F);
   }

   @Override
   public void aN_() {
      this.aE = new fdk(this.m);
      this.aD = new fbn.j();
      xe $$0 = xe.c("mco.invites.title");
      this.aL = new fbn.g($$0, E, $$1x -> this.m.a(new fed(this, $$0)));
      xe $$1 = xe.c("mco.news");
      this.aM = new fbn.g($$1, F, $$0x -> {
         String $$1x = this.aH;
         if ($$1x != null) {
            fnd.a(this, $$1x);
            if (this.aM.a() != 0) {
               fex.a $$2 = fex.b();
               $$2.b = false;
               fex.b($$2);
               this.aM.a(0);
            }
         }
      });
      this.aM.a(fjy.a($$1));
      this.ay = fin.a(P, $$0x -> a(this.M(), this)).a(100).a();
      this.aB = fin.a(R, $$0x -> this.f(this.M())).a(100).a();
      this.aA = fin.a(N, $$0x -> this.e(this.M())).a(100).a();
      this.aC = fin.a(Q, $$0x -> this.g(this.M())).a(100).a();
      this.aK = fin.a(xe.c("mco.selectServer.purchase"), $$0x -> this.N()).b(100, 20).a();
      this.az = fin.a(xd.k, $$0x -> this.d()).a(100).a();
      if (fbs.a == fbs.b.b) {
         this.c(fiu.a(xe.b("Snapshot"), xe.b("Release")).a(5, 5, 100, 20, xe.b("Realm"), ($$0x, $$1x) -> {
            ar = $$1x;
            this.aF = List.of();
            this.I();
         }));
      }

      this.a(fbn.f.a);
      this.F();
      this.as.thenAcceptAsync($$0x -> {
         fon $$1x = $$0x.a(this.ax);
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
         this.a(fbn.f.b);
      } else {
         this.a(fbn.f.c);
      }
   }

   private void a(fbn.f $$0) {
      if (this.aN != $$0) {
         if (this.aO != null) {
            this.aO.a($$1 -> this.e($$1));
         }

         this.aO = this.b($$0);
         this.aN = $$0;
         this.aO.a($$1 -> {
            fil var10000 = this.c($$1);
         });
         this.c();
      }
   }

   private fma b(fbn.f $$0) {
      fma $$1 = new fma(this);
      $$1.b(44);
      $$1.a(this.D());
      fmb $$2 = this.c($$0);
      $$2.a();
      $$1.a($$2.v() + 22);
      $$1.b($$2);
      switch ($$0) {
         case a:
            $$1.c(new fjc(this.p, K));
            break;
         case b:
            $$1.c(this.E());
            break;
         case c:
            $$1.c(this.aD);
      }

      return $$1;
   }

   private fmb D() {
      int $$0 = 90;
      fme $$1 = fme.e().a(4);
      $$1.c().e();
      $$1.a(this.aL);
      $$1.a(this.aM);
      fme $$2 = fme.e();
      $$2.c().e();
      $$2.a(fmf.a(90));
      $$2.a(fja.a(128, 34, H, 128, 64), fmd::b);
      $$2.a(new fly(90, 44)).a($$1, fmd::c);
      return $$2;
   }

   private fmb c(fbn.f $$0) {
      flz $$1 = new flz().c(4);
      flz.b $$2 = $$1.d(3);
      if ($$0 == fbn.f.c) {
         $$2.a(this.ay);
         $$2.a(this.aB);
         $$2.a(this.aA);
         $$2.a(this.aC);
      }

      $$2.a(this.aK);
      $$2.a(this.az);
      return $$1;
   }

   private fme E() {
      fme $$0 = fme.d().a(8);
      $$0.c().b();
      $$0.a(fja.a(130, 64, I, 130, 64));
      fiy $$1 = new fiy(308, Y, this.p, false, 4);
      $$0.a($$1);
      return $$0;
   }

   void F() {
      fcj $$0 = this.M();
      this.aK.j = this.aN != fbn.f.a;
      this.ay.j = $$0 != null && this.a($$0);
      this.aA.j = $$0 != null && this.b($$0);
      this.aC.j = $$0 != null && this.d($$0);
      this.aB.j = $$0 != null && this.c($$0);
   }

   boolean a(fcj $$0) {
      boolean $$1 = !$$0.j && $$0.e == fcj.c.b;
      return $$1 && ($$0.d() || this.h($$0));
   }

   private boolean b(fcj $$0) {
      return $$0.j && this.h($$0);
   }

   private boolean c(fcj $$0) {
      return this.h($$0) && $$0.e != fcj.c.c;
   }

   private boolean d(fcj $$0) {
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
      fgj.Q().bc().d.a();
   }

   public static void g() {
      fgj.Q().bc().c.a();
   }

   private void I() {
      for (fer.e<?> $$0 : this.m.bc().a()) {
         $$0.a();
      }
   }

   private fer.c a(fdi $$0) {
      fer.c $$1 = $$0.a.a();
      $$1.a($$0.c, $$0x -> {
         this.aE.a($$0x.a());
         this.aF = $$0x.b();
         this.J();
         boolean $$1x = false;

         for (fcj $$2 : this.aE) {
            if (this.i($$2)) {
               $$1x = true;
            }
         }

         if (!av && $$1x) {
            av = true;
            this.K();
         }
      });
      a(fbs::d, $$0x -> {
         this.aJ.clear();
         this.aJ.addAll($$0x);

         for (fci $$1x : $$0x) {
            if ($$1x instanceof fci.a $$2) {
               fjp $$3 = $$2.a(this, this::a);
               if ($$3 != null) {
                  this.m.a($$3);
                  this.a(List.of($$1x));
                  break;
               }
            }
         }

         if (!this.aJ.isEmpty() && this.aN != fbn.f.a) {
            this.J();
         }
      });
      $$1.a($$0.d, $$0x -> {
         this.aL.a($$0x);
         this.aL.a($$0x == 0 ? fjy.a(Z) : fjy.a(aa));
         if ($$0x > 0 && this.aw.tryAcquire(1)) {
            this.m.aZ().c(xe.a("mco.configure.world.invite.narration", $$0x));
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

   private void a(Collection<fci> $$0) {
      List<UUID> $$1 = new ArrayList<>($$0.size());

      for (fci $$2 : $$0) {
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

   private static <T> void a(fbn.k<T> $$0, Consumer<T> $$1) {
      fgj $$2 = fgj.Q();
      CompletableFuture.<T>supplyAsync(() -> {
         try {
            return $$0.request(fbs.a($$2));
         } catch (fdf var3) {
            throw new RuntimeException(var3);
         }
      }).thenAcceptAsync($$1, $$2).exceptionally($$0x -> {
         G.error("Failed to execute call to Realms Service", $$0x);
         return null;
      });
   }

   private void J() {
      fcj $$0 = this.M();
      this.aD.I();

      for (fci $$1 : this.aJ) {
         if (this.a($$1)) {
            this.a(List.of($$1));
            break;
         }
      }

      for (fcj $$2 : this.aF) {
         this.aD.a(new fbn.a($$2));
      }

      for (fcj $$3 : this.aE) {
         fbn.e $$4;
         if (b() && !$$3.h()) {
            if ($$3.e == fcj.c.c) {
               continue;
            }

            $$4 = new fbn.i($$3);
         } else {
            $$4 = new fbn.l($$3);
         }

         this.aD.a((fbn.e)$$4);
         if ($$0 != null && $$0.a == $$3.a) {
            this.aD.a($$4);
         }
      }

      this.C();
      this.F();
   }

   private boolean a(fci $$0) {
      if (!($$0 instanceof fci.c $$1)) {
         return false;
      } else {
         xe $$2 = $$1.d();
         int $$3 = this.p.b($$2, 216);
         int $$4 = aym.e($$3 + 7, 36) - 1;
         this.aD.a(new fbn.h($$2, $$4 + 2, $$1));

         for (int $$5 = 0; $$5 < $$4; $$5++) {
            this.aD.a(new fbn.d());
         }

         this.aD.a(new fbn.b($$1.a(this)));
         return true;
      }
   }

   private void K() {
      new Thread(() -> {
         List<fct> $$0 = fbr.a();
         fbs $$1 = fbs.a();
         fce $$2 = new fce();
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

      for (fcj $$1 : this.aE) {
         if (this.i($$1)) {
            $$0.add($$1.a);
         }
      }

      return $$0;
   }

   private void e(@Nullable fcj $$0) {
      if ($$0 != null) {
         String $$1 = axi.a($$0.b, this.m.X().b(), $$0.k);
         this.m.o.a($$1);
         ad.j().a($$1);
      }
   }

   private void f(@Nullable fcj $$0) {
      if ($$0 != null && this.m.b($$0.g)) {
         this.m.a(new fds(this, $$0.a));
      }
   }

   private void g(@Nullable fcj $$0) {
      if ($$0 != null && !this.m.b($$0.g)) {
         xe $$1 = xe.c("mco.configure.world.leave.question.line1");
         xe $$2 = xe.c("mco.configure.world.leave.question.line2");
         this.m.a(new fdy($$1x -> this.a($$1x, $$0), fdy.a.b, $$1, $$2, true));
      }
   }

   @Nullable
   private fcj M() {
      return this.aD.h() instanceof fbn.l $$0 ? $$0.c() : null;
   }

   private void a(boolean $$0, final fcj $$1) {
      if ($$0) {
         (new Thread("Realms-leave-server") {
            @Override
            public void run() {
               try {
                  fbs $$0 = fbs.a();
                  $$0.d($$1.a);
                  fbn.this.m.execute(fbn::g);
               } catch (fdf var2) {
                  fbn.G.error("Couldn't configure world", var2);
                  fbn.this.m.execute(() -> fbn.this.m.a(new fdw(var2, fbn.this)));
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
   public xe i() {
      return (xe)(switch (this.aN) {
         case a -> xd.a(super.i(), K);
         case b -> xd.a(super.i(), Y);
         case c -> super.i();
      });
   }

   @Override
   public void a(fia $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (b()) {
         $$0.b(this.p, "Minecraft " + ab.b().c(), 2, this.o - 10, -1);
      }

      if (this.aG && this.aK.j) {
         fef.a($$0, this.aK);
      }

      switch (fbs.a) {
         case b:
            this.a($$0, "STAGE!", -256);
            break;
         case c:
            this.a($$0, "LOCAL!", 8388479);
      }
   }

   private void N() {
      this.m.a(new fef(this, this.aG));
   }

   public static void a(@Nullable fcj $$0, fon $$1) {
      a($$0, $$1, false);
   }

   public static void a(@Nullable fcj $$0, fon $$1, boolean $$2) {
      if ($$0 != null) {
         if (!b() || $$2) {
            fgj.Q().a(new fdz($$1, new ffi($$1, $$0)));
            return;
         }

         switch ($$0.u) {
            case e:
               fgj.Q().a(new fdz($$1, new ffi($$1, $$0)));
               break;
            case a:
               a($$0, $$1, xe.c("mco.compatibility.unverifiable.title").b(-171), xe.c("mco.compatibility.unverifiable.message"), xd.j);
               break;
            case c:
               a(
                  $$0,
                  $$1,
                  xe.c("selectWorld.backupQuestion.downgrade").b(-2142128),
                  xe.a("mco.compatibility.downgrade.description", xe.b($$0.t).b(-171), xe.b(ab.b().c()).b(-171)),
                  xe.c("mco.compatibility.downgrade")
               );
               break;
            case d:
               a(
                  $$0,
                  $$1,
                  xe.c("mco.compatibility.upgrade.title").b(-171),
                  xe.a("mco.compatibility.upgrade.description", xe.b($$0.t).b(-171), xe.b(ab.b().c()).b(-171)),
                  xe.c("mco.compatibility.upgrade")
               );
         }
      }
   }

   private static void a(fcj $$0, fon $$1, xe $$2, xe $$3, xe $$4) {
      fgj.Q().a(new fne($$2x -> {
         fon $$3x;
         if ($$2x) {
            $$3x = new fdz($$1, new ffi($$1, $$0));
            g();
         } else {
            $$3x = $$1;
         }

         fgj.Q().a($$3x);
      }, $$2, $$3, $$4, xd.e));
   }

   public static xe a(String $$0, boolean $$1) {
      return a($$0, $$1 ? -8355712 : -2142128);
   }

   public static xe a(String $$0, int $$1) {
      return (xe)(StringUtils.isBlank($$0) ? xd.a : xe.a("mco.version", xe.b($$0).b($$1)));
   }

   boolean h(fcj $$0) {
      return this.m.b($$0.g);
   }

   private boolean i(fcj $$0) {
      return this.h($$0) && !$$0.j;
   }

   private void a(fia $$0, String $$1, int $$2) {
      $$0.c().a();
      $$0.c().a((float)(this.n / 2 - 25), 20.0F, 0.0F);
      $$0.c().a(a.f.rotationDegrees(-20.0F));
      $$0.c().b(1.5F, 1.5F, 1.5F);
      $$0.a(this.p, $$1, 0, 0, $$2, false);
      $$0.c().b();
   }

   class a extends fbn.e {
      private static final xe c = xe.c("mco.snapshot.start");
      private static final int d = 5;
      private final fkb e = new fkb();
      private final fcj f;

      public a(fcj $$0) {
         this.f = $$0;
         this.e.a(fjy.a(xe.c("mco.snapshot.tooltip")));
      }

      @Override
      public void a(fia $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(fbn.b, $$3 - 5, $$2 + $$5 / 2 - 10, 40, 20);
         int $$10 = $$2 + $$5 / 2 - 9 / 2;
         $$0.b(fbn.this.p, c, $$3 + 40 - 2, $$10 - 5, 8388479);
         $$0.b(fbn.this.p, xe.a("mco.snapshot.description", this.f.c), $$3 + 40 - 2, $$10 + 5, -8355712);
         this.e.a($$8, this.aI_(), new fmt($$3, $$2, $$4, $$5));
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         this.c();
         return true;
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         if (fmo.a($$0)) {
            this.c();
            return true;
         } else {
            return super.a($$0, $$1, $$2);
         }
      }

      private void c() {
         fbn.this.m.ak().a(guh.a(avo.AM, 1.0F));
         fbn.this.m
            .a(
               new fjp.a(fbn.this, xe.c("mco.snapshot.createSnapshotPopup.title"))
                  .a(xe.c("mco.snapshot.createSnapshotPopup.text"))
                  .a(xe.c("mco.selectServer.create"), $$0 -> fbn.this.m.a(new fdu(fbn.this, this.f.a)))
                  .a(xd.e, fjp::d)
                  .a()
            );
      }

      @Override
      public xe a() {
         return xe.a("gui.narrate.button", xd.a(c, xe.a("mco.snapshot.description", this.f.c)));
      }
   }

   class b extends fbn.e {
      private final fin c;

      public b(fin $$0) {
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
      public void a(fia $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.c.c(fbn.this.n / 2 - 75, $$2 + 4);
         this.c.a($$0, $$6, $$7, $$9);
      }

      @Override
      public void a(boolean $$0) {
         super.a($$0);
         this.c.a($$0);
      }

      @Override
      public xe a() {
         return this.c.y();
      }
   }

   static class c extends fiz {
      private static final fka b = new fka(new akt("widget/cross_button"), new akt("widget/cross_button_highlighted"));

      protected c(fin.c $$0, xe $$1) {
         super(0, 0, 14, 14, b, $$0);
         this.a(fjy.a($$1));
      }
   }

   class d extends fbn.e {
      @Override
      public void a(fia $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
      }

      @Override
      public xe a() {
         return xe.i();
      }
   }

   abstract class e extends fjj.a<fbn.e> {
      private static final int a = 10;
      private static final int c = 28;
      private static final int d = 7;

      protected void a(fcj $$0, fia $$1, int $$2, int $$3, int $$4, int $$5) {
         int $$6 = $$2 - 10 - 7;
         int $$7 = $$3 + 2;
         if ($$0.j) {
            this.a($$1, $$6, $$7, $$4, $$5, fbn.c, () -> fbn.S);
         } else if ($$0.e == fcj.c.a) {
            this.a($$1, $$6, $$7, $$4, $$5, fbn.D, () -> fbn.W);
         } else if (fbn.this.h($$0) && $$0.l < 7) {
            this.a($$1, $$6, $$7, $$4, $$5, fbn.B, () -> {
               if ($$0.l <= 0) {
                  return fbn.T;
               } else {
                  return (xe)($$0.l == 1 ? fbn.U : xe.a("mco.selectServer.expires.days", $$0.l));
               }
            });
         } else if ($$0.e == fcj.c.b) {
            this.a($$1, $$6, $$7, $$4, $$5, fbn.C, () -> fbn.V);
         }
      }

      private void a(fia $$0, int $$1, int $$2, int $$3, int $$4, akt $$5, Supplier<xe> $$6) {
         $$0.a($$5, $$1, $$2, 10, 28);
         if (fbn.this.aD.c((double)$$3, (double)$$4) && $$3 >= $$1 && $$3 <= $$1 + 10 && $$4 >= $$2 && $$4 <= $$2 + 28) {
            fbn.this.d($$6.get());
         }
      }

      protected void a(fia $$0, int $$1, int $$2, fcj $$3) {
         int $$4 = this.b($$2);
         int $$5 = this.a($$1);
         int $$6 = this.d($$5);
         if (!fbn.this.h($$3)) {
            $$0.a(fbn.this.p, $$3.f, $$4, this.d($$5), -8355712, false);
         } else if ($$3.j) {
            xe $$7 = $$3.k ? fbn.O : fbn.M;
            $$0.a(fbn.this.p, $$7, $$4, $$6, -2142128, false);
         }
      }

      protected void a(fia $$0, String $$1, int $$2, int $$3, int $$4, int $$5) {
         int $$6 = $$4 - $$2;
         if (fbn.this.p.b($$1) > $$6) {
            String $$7 = fbn.this.p.a($$1, $$6 - fbn.this.p.b("... "));
            $$0.a(fbn.this.p, $$7 + "...", $$2, $$3, $$5, false);
         } else {
            $$0.a(fbn.this.p, $$1, $$2, $$3, $$5, false);
         }
      }

      protected int a(int $$0, int $$1, xe $$2) {
         return $$0 + $$1 - fbn.this.p.a($$2) - 20;
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

   static class g extends fjs.b {
      private static final akt[] d = new akt[]{
         new akt("notification/1"),
         new akt("notification/2"),
         new akt("notification/3"),
         new akt("notification/4"),
         new akt("notification/5"),
         new akt("notification/more")
      };
      private static final int u = Integer.MAX_VALUE;
      private static final int v = 20;
      private static final int w = 14;
      private int x;

      public g(xe $$0, akt $$1, fin.c $$2) {
         super(20, 20, $$0, 14, 14, $$1, $$2, null);
      }

      int a() {
         return this.x;
      }

      public void a(int $$0) {
         this.x = $$0;
      }

      @Override
      public void b(fia $$0, int $$1, int $$2, float $$3) {
         super.b($$0, $$1, $$2, $$3);
         if (this.j && this.x != 0) {
            this.a($$0);
         }
      }

      private void a(fia $$0) {
         $$0.a(d[Math.min(this.x, 6) - 1], this.C() + this.x() - 5, this.D() - 3, 8, 8);
      }
   }

   class h extends fbn.e {
      private static final int c = 40;
      private static final int d = -12303292;
      private final xe e;
      private final int f;
      private final List<fil> g = new ArrayList<>();
      @Nullable
      private final fbn.c h;
      private final fjh i;
      private final flz j;
      private final fly k;
      private int l = -1;

      public h(xe $$0, int $$1, fci $$2) {
         this.e = $$0;
         this.f = $$1;
         this.j = new flz();
         int $$3 = 7;
         this.j.a(fja.a(20, 20, fbn.a), 0, 0, this.j.b().a(7, 7, 0, 0));
         this.j.a(fmf.a(40), 0, 0);
         this.k = this.j.a(new fly(0, 9 * 3 * ($$1 - 1)), 0, 1, this.j.b().c(7));
         this.i = this.k.a(new fjh($$0, fbn.this.p).b(true), this.k.b().b().d());
         this.j.a(fmf.a(40), 0, 2);
         if ($$2.b()) {
            this.h = this.j.a(new fbn.c($$1x -> fbn.this.a($$2.c()), xe.c("mco.notification.dismiss")), 0, 2, this.j.b().c().a(0, 7, 7, 0));
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
      public void b(fia $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         super.b($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
         $$0.b($$3 - 2, $$2 - 2, $$4, 36 * this.f - 2, -12303292);
      }

      @Override
      public void a(fia $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
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
      public xe a() {
         return this.e;
      }
   }

   class i extends fbn.e {
      private final fcj c;
      private final fkb d = new fkb();

      public i(fcj $$0) {
         this.c = $$0;
         if (!$$0.j) {
            this.d.a(fjy.a(xe.c("mco.snapshot.parent.tooltip")));
         }
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         return true;
      }

      @Override
      public void a(fia $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = this.b($$3);
         int $$11 = this.a($$2);
         fez.a($$0, $$3, $$2, 32, this.c.g);
         xe $$12 = fbn.a(this.c.t, -8355712);
         int $$13 = this.a($$3, $$4, $$12);
         this.a($$0, this.c.b(), $$10, $$11, $$13, -8355712);
         if ($$12 != xd.a) {
            $$0.a(fbn.this.p, $$12, $$13, $$11, -8355712, false);
         }

         $$0.a(fbn.this.p, this.c.a(), $$10, this.c($$11), -8355712, false);
         this.a($$0, $$2, $$3, this.c);
         this.a(this.c, $$0, $$3 + $$4, $$2, $$6, $$7);
         this.d.a($$8, this.aI_(), new fmt($$3, $$2, $$4, $$5));
      }

      @Override
      public xe a() {
         return xe.b(this.c.c);
      }
   }

   class j extends gxa<fbn.e> {
      public j() {
         super(fbn.this.n, fbn.this.o, 0, 36);
      }

      public void a(@Nullable fbn.e $$0) {
         super.a($$0);
         fbn.this.F();
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
      T request(fbs var1) throws fdf;
   }

   class l extends fbn.e {
      private static final int c = 36;
      private final fcj d;
      private final fkb e = new fkb();

      public l(fcj $$0) {
         this.d = $$0;
         boolean $$1 = fbn.this.h($$0);
         if (fbn.b() && $$1 && $$0.h()) {
            this.e.a(fjy.a(xe.a("mco.snapshot.paired", $$0.s)));
         } else if (!$$1 && $$0.e()) {
            this.e.a(fjy.a(xe.a("mco.snapshot.friendsRealm.upgrade", $$0.f)));
         } else if (!$$1 && $$0.f()) {
            this.e.a(fjy.a(xe.a("mco.snapshot.friendsRealm.downgrade", $$0.t)));
         }
      }

      @Override
      public void a(fia $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         if (this.d.e == fcj.c.c) {
            $$0.a(fbn.b, $$3 - 5, $$2 + $$5 / 2 - 10, 40, 20);
            int $$10 = $$2 + $$5 / 2 - 9 / 2;
            $$0.b(fbn.this.p, fbn.L, $$3 + 40 - 2, $$10, 8388479);
         } else {
            fez.a($$0, $$3, $$2, 32, this.d.g);
            this.a($$0, $$2, $$3, $$4);
            this.a($$0, $$2, $$3);
            this.a($$0, $$2, $$3, this.d);
            this.a(this.d, $$0, $$3 + $$4, $$2, $$6, $$7);
            this.e.a($$8, this.aI_(), new fmt($$3, $$2, $$4, $$5));
         }
      }

      private void a(fia $$0, int $$1, int $$2, int $$3) {
         int $$4 = this.b($$2);
         int $$5 = this.a($$1);
         xe $$6 = fbn.a(this.d.t, this.d.d());
         int $$7 = this.a($$2, $$3, $$6);
         this.a($$0, this.d.b(), $$4, $$5, $$7, -1);
         if ($$6 != xd.a) {
            $$0.a(fbn.this.p, $$6, $$7, $$5, -8355712, false);
         }
      }

      private void a(fia $$0, int $$1, int $$2) {
         int $$3 = this.b($$2);
         int $$4 = this.a($$1);
         int $$5 = this.c($$4);
         String $$6 = this.d.c();
         if (this.d.m == fcj.d.b && $$6 != null) {
            xe $$7 = xe.b($$6).a(n.h);
            $$0.a(fbn.this.p, xe.a("mco.selectServer.minigameName", $$7).b(-171), $$3, $$5, -1, false);
         } else {
            $$0.a(fbn.this.p, this.d.a(), $$3, this.c($$4), -8355712, false);
         }
      }

      private void d() {
         fbn.this.m.ak().a(guh.a(avo.AM, 1.0F));
         fbn.a(this.d, fbn.this);
      }

      private void e() {
         fbn.this.m.ak().a(guh.a(avo.AM, 1.0F));
         fdu $$0 = new fdu(fbn.this, this.d);
         fbn.this.m.a($$0);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         if (this.d.e == fcj.c.c) {
            this.e();
         } else if (fbn.this.a(this.d)) {
            if (ad.b() - fbn.this.aI < 250L && this.aI_()) {
               this.d();
            }

            fbn.this.aI = ad.b();
         }

         return true;
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         if (fmo.a($$0)) {
            if (this.d.e == fcj.c.c) {
               this.e();
               return true;
            }

            if (fbn.this.a(this.d)) {
               this.d();
               return true;
            }
         }

         return super.a($$0, $$1, $$2);
      }

      @Override
      public xe a() {
         return (xe)(this.d.e == fcj.c.c ? fbn.X : xe.a("narrator.select", this.d.c));
      }

      public fcj c() {
         return this.d;
      }
   }
}
