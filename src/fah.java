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

public class fah extends gve {
   static final ale a = new ale("icon/info");
   static final ale b = new ale("icon/new_realm");
   static final ale c = new ale("realm_status/expired");
   static final ale B = new ale("realm_status/expires_soon");
   static final ale C = new ale("realm_status/open");
   static final ale D = new ale("realm_status/closed");
   private static final ale E = new ale("icon/invite");
   private static final ale F = new ale("icon/news");
   static final Logger G = LogUtils.getLogger();
   private static final ale H = new ale("textures/gui/title/realms.png");
   private static final ale I = new ale("textures/gui/realms/no_realms.png");
   private static final xo J = xo.c("menu.online");
   private static final xo K = xo.c("mco.selectServer.loading");
   static final xo L = xo.c("mco.selectServer.uninitialized");
   static final xo M = xo.c("mco.selectServer.expiredList");
   private static final xo N = xo.c("mco.selectServer.expiredRenew");
   static final xo O = xo.c("mco.selectServer.expiredTrial");
   private static final xo P = xo.c("mco.selectServer.play");
   private static final xo Q = xo.c("mco.selectServer.leave");
   private static final xo R = xo.c("mco.selectServer.configure");
   static final xo S = xo.c("mco.selectServer.expired");
   static final xo T = xo.c("mco.selectServer.expires.soon");
   static final xo U = xo.c("mco.selectServer.expires.day");
   static final xo V = xo.c("mco.selectServer.open");
   static final xo W = xo.c("mco.selectServer.closed");
   static final xo X = xo.a("gui.narrate.button", L);
   private static final xo Y = xo.c("mco.selectServer.noRealms");
   private static final xo Z = xo.c("mco.invites.nopending");
   private static final xo aa = xo.c("mco.invites.pending");
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
   private final CompletableFuture<fag.a> as = fag.a();
   @Nullable
   private fdl.c at;
   private final Set<UUID> au = new HashSet<>();
   private static boolean av;
   private final RateLimiter aw;
   private final fnb ax;
   private fhc ay;
   private fhc az;
   private fhc aA;
   private fhc aB;
   private fhc aC;
   fah.j aD;
   private fce aE;
   private List<fbd> aF = List.of();
   private volatile boolean aG;
   @Nullable
   private volatile String aH;
   long aI;
   private final List<fbc> aJ = new ArrayList<>();
   private fhc aK;
   private fah.g aL;
   private fah.g aM;
   private fah.f aN;
   @Nullable
   private fkp aO;

   public fah(fnb $$0) {
      super(J);
      this.ax = $$0;
      this.aw = RateLimiter.create(0.016666668F);
   }

   @Override
   public void aM_() {
      this.aE = new fce(this.m);
      this.aD = new fah.j();
      xo $$0 = xo.c("mco.invites.title");
      this.aL = new fah.g($$0, E, $$1x -> this.m.a(new fcx(this, $$0)));
      xo $$1 = xo.c("mco.news");
      this.aM = new fah.g($$1, F, $$0x -> {
         String $$1x = this.aH;
         if ($$1x != null) {
            fls.a(this, $$1x);
            if (this.aM.a() != 0) {
               fdr.a $$2 = fdr.b();
               $$2.b = false;
               fdr.b($$2);
               this.aM.a(0);
            }
         }
      });
      this.aM.a(fin.a($$1));
      this.ay = fhc.a(P, $$0x -> a(this.N(), this)).a(100).a();
      this.aB = fhc.a(R, $$0x -> this.f(this.N())).a(100).a();
      this.aA = fhc.a(N, $$0x -> this.e(this.N())).a(100).a();
      this.aC = fhc.a(Q, $$0x -> this.g(this.N())).a(100).a();
      this.aK = fhc.a(xo.c("mco.selectServer.purchase"), $$0x -> this.O()).b(100, 20).a();
      this.az = fhc.a(xn.k, $$0x -> this.d()).a(100).a();
      if (fam.a == fam.b.b) {
         this.c(fhj.a(xo.b("Snapshot"), xo.b("Release")).a(5, 5, 100, 20, xo.b("Realm"), ($$0x, $$1x) -> {
            ar = $$1x;
            this.aF = List.of();
            this.J();
         }));
      }

      this.a(fah.f.a);
      this.I();
      this.as.thenAcceptAsync($$0x -> {
         fnb $$1x = $$0x.a(this.ax);
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

   private void D() {
      if (this.aE.a() && this.aF.isEmpty() && this.aJ.isEmpty()) {
         this.a(fah.f.b);
      } else {
         this.a(fah.f.c);
      }
   }

   private void a(fah.f $$0) {
      if (this.aN != $$0) {
         if (this.aO != null) {
            this.aO.a($$1 -> this.e($$1));
         }

         this.aO = this.b($$0);
         this.aN = $$0;
         this.aO.a($$1 -> {
            fha var10000 = this.c($$1);
         });
         this.c();
      }
   }

   private fkp b(fah.f $$0) {
      fkp $$1 = new fkp(this);
      $$1.b(44);
      $$1.a(this.E());
      fkq $$2 = this.c($$0);
      $$2.a();
      $$1.a($$2.v() + 22);
      $$1.b($$2);
      switch ($$0) {
         case a:
            $$1.c(new fhr(this.p, K));
            break;
         case b:
            $$1.c(this.F());
            break;
         case c:
            $$1.c(this.aD);
      }

      return $$1;
   }

   private fkq E() {
      int $$0 = 90;
      fkt $$1 = fkt.e().a(4);
      $$1.c().e();
      $$1.a(this.aL);
      $$1.a(this.aM);
      fkt $$2 = fkt.e();
      $$2.c().e();
      $$2.a(fku.a(90));
      $$2.a(fhp.a(128, 34, H, 128, 64), fks::b);
      $$2.a(new fkn(90, 44)).a($$1, fks::c);
      return $$2;
   }

   private fkq c(fah.f $$0) {
      fko $$1 = new fko().c(4);
      fko.b $$2 = $$1.d(3);
      if ($$0 == fah.f.c) {
         $$2.a(this.ay);
         $$2.a(this.aB);
         $$2.a(this.aA);
         $$2.a(this.aC);
      }

      $$2.a(this.aK);
      $$2.a(this.az);
      return $$1;
   }

   private fkt F() {
      fkt $$0 = fkt.d().a(8);
      $$0.c().b();
      $$0.a(fhp.a(130, 64, I, 130, 64));
      fhn $$1 = new fhn(308, Y, this.p, false, 4);
      $$0.a($$1);
      return $$0;
   }

   void I() {
      fbd $$0 = this.N();
      this.aK.j = this.aN != fah.f.a;
      this.ay.j = $$0 != null && this.a($$0);
      this.aA.j = $$0 != null && this.b($$0);
      this.aC.j = $$0 != null && this.d($$0);
      this.aB.j = $$0 != null && this.c($$0);
   }

   boolean a(fbd $$0) {
      boolean $$1 = !$$0.j && $$0.e == fbd.c.b;
      return $$1 && ($$0.d() || this.h($$0));
   }

   private boolean b(fbd $$0) {
      return $$0.j && this.h($$0);
   }

   private boolean c(fbd $$0) {
      return this.h($$0) && $$0.e != fbd.c.c;
   }

   private boolean d(fbd $$0) {
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
      ffd.Q().ba().d.a();
   }

   public static void g() {
      ffd.Q().ba().c.a();
   }

   private void J() {
      for (fdl.e<?> $$0 : this.m.ba().a()) {
         $$0.a();
      }
   }

   private fdl.c a(fcc $$0) {
      fdl.c $$1 = $$0.a.a();
      $$1.a($$0.c, $$0x -> {
         this.aE.a($$0x.a());
         this.aF = $$0x.b();
         this.K();
         boolean $$1x = false;

         for (fbd $$2 : this.aE) {
            if (this.i($$2)) {
               $$1x = true;
            }
         }

         if (!av && $$1x) {
            av = true;
            this.L();
         }
      });
      a(fam::d, $$0x -> {
         this.aJ.clear();
         this.aJ.addAll($$0x);

         for (fbc $$1x : $$0x) {
            if ($$1x instanceof fbc.a $$2) {
               fie $$3 = $$2.a(this, this::a);
               if ($$3 != null) {
                  this.m.a($$3);
                  this.a(List.of($$1x));
                  break;
               }
            }
         }

         if (!this.aJ.isEmpty() && this.aN != fah.f.a) {
            this.K();
         }
      });
      $$1.a($$0.d, $$0x -> {
         this.aL.a($$0x);
         this.aL.a($$0x == 0 ? fin.a(Z) : fin.a(aa));
         if ($$0x > 0 && this.aw.tryAcquire(1)) {
            this.m.aX().c(xo.a("mco.configure.world.invite.narration", $$0x));
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

   private void a(Collection<fbc> $$0) {
      List<UUID> $$1 = new ArrayList<>($$0.size());

      for (fbc $$2 : $$0) {
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

   private static <T> void a(fah.k<T> $$0, Consumer<T> $$1) {
      ffd $$2 = ffd.Q();
      CompletableFuture.<T>supplyAsync(() -> {
         try {
            return $$0.request(fam.a($$2));
         } catch (fbz var3) {
            throw new RuntimeException(var3);
         }
      }).thenAcceptAsync($$1, $$2).exceptionally($$0x -> {
         G.error("Failed to execute call to Realms Service", $$0x);
         return null;
      });
   }

   private void K() {
      fbd $$0 = this.N();
      this.aD.I();

      for (fbc $$1 : this.aJ) {
         if (this.a($$1)) {
            this.a(List.of($$1));
            break;
         }
      }

      for (fbd $$2 : this.aF) {
         this.aD.a(new fah.a($$2));
      }

      for (fbd $$3 : this.aE) {
         fah.e $$4;
         if (b() && !$$3.h()) {
            if ($$3.e == fbd.c.c) {
               continue;
            }

            $$4 = new fah.i($$3);
         } else {
            $$4 = new fah.l($$3);
         }

         this.aD.a((fah.e)$$4);
         if ($$0 != null && $$0.a == $$3.a) {
            this.aD.a($$4);
         }
      }

      this.D();
      this.I();
   }

   private boolean a(fbc $$0) {
      if (!($$0 instanceof fbc.c $$1)) {
         return false;
      } else {
         xo $$2 = $$1.d();
         int $$3 = this.p.b($$2, 216);
         int $$4 = ayx.e($$3 + 7, 36) - 1;
         this.aD.a(new fah.h($$2, $$4 + 2, $$1));

         for (int $$5 = 0; $$5 < $$4; $$5++) {
            this.aD.a(new fah.d());
         }

         this.aD.a(new fah.b($$1.a(this)));
         return true;
      }
   }

   private void L() {
      new Thread(() -> {
         List<fbn> $$0 = fal.a();
         fam $$1 = fam.a();
         fay $$2 = new fay();
         $$2.a = $$0;
         $$2.b = this.M();

         try {
            $$1.a($$2);
         } catch (Throwable var5) {
            G.warn("Could not send ping result to Realms: ", var5);
         }
      }).start();
   }

   private List<Long> M() {
      List<Long> $$0 = Lists.newArrayList();

      for (fbd $$1 : this.aE) {
         if (this.i($$1)) {
            $$0.add($$1.a);
         }
      }

      return $$0;
   }

   private void e(@Nullable fbd $$0) {
      if ($$0 != null) {
         String $$1 = axt.a($$0.b, this.m.X().b(), $$0.k);
         this.m.o.a($$1);
         ac.k().a($$1);
      }
   }

   private void f(@Nullable fbd $$0) {
      if ($$0 != null && this.m.b($$0.g)) {
         this.m.a(new fcm(this, $$0.a));
      }
   }

   private void g(@Nullable fbd $$0) {
      if ($$0 != null && !this.m.b($$0.g)) {
         xo $$1 = xo.c("mco.configure.world.leave.question.line1");
         xo $$2 = xo.c("mco.configure.world.leave.question.line2");
         this.m.a(new fcs($$1x -> this.a($$1x, $$0), fcs.a.b, $$1, $$2, true));
      }
   }

   @Nullable
   private fbd N() {
      return this.aD.h() instanceof fah.l $$0 ? $$0.c() : null;
   }

   private void a(boolean $$0, final fbd $$1) {
      if ($$0) {
         (new Thread("Realms-leave-server") {
            @Override
            public void run() {
               try {
                  fam $$0 = fam.a();
                  $$0.d($$1.a);
                  fah.this.m.execute(fah::g);
               } catch (fbz var2) {
                  fah.G.error("Couldn't configure world", var2);
                  fah.this.m.execute(() -> fah.this.m.a(new fcq(var2, fah.this)));
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
         this.K();
      });
   }

   public void h() {
      this.aD.a(null);
      g();
   }

   @Override
   public xo i() {
      return (xo)(switch (this.aN) {
         case a -> xn.a(super.i(), K);
         case b -> xn.a(super.i(), Y);
         case c -> super.i();
      });
   }

   @Override
   public void a(fgp $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (b()) {
         $$0.b(this.p, "Minecraft " + aa.b().c(), 2, this.o - 10, -1);
      }

      if (this.aG && this.aK.j) {
         fcz.a($$0, this.aK);
      }

      switch (fam.a) {
         case b:
            this.a($$0, "STAGE!", -256);
            break;
         case c:
            this.a($$0, "LOCAL!", 8388479);
      }
   }

   private void O() {
      this.m.a(new fcz(this, this.aG));
   }

   public static void a(@Nullable fbd $$0, fnb $$1) {
      a($$0, $$1, false);
   }

   public static void a(@Nullable fbd $$0, fnb $$1, boolean $$2) {
      if ($$0 != null) {
         if (!b() || $$2) {
            ffd.Q().a(new fct($$1, new fec($$1, $$0)));
            return;
         }

         switch ($$0.u) {
            case e:
               ffd.Q().a(new fct($$1, new fec($$1, $$0)));
               break;
            case a:
               a($$0, $$1, xo.c("mco.compatibility.unverifiable.title").b(-171), xo.c("mco.compatibility.unverifiable.message"), xn.j);
               break;
            case c:
               a(
                  $$0,
                  $$1,
                  xo.c("selectWorld.backupQuestion.downgrade").b(-2142128),
                  xo.a("mco.compatibility.downgrade.description", xo.b($$0.t).b(-171), xo.b(aa.b().c()).b(-171)),
                  xo.c("mco.compatibility.downgrade")
               );
               break;
            case d:
               a(
                  $$0,
                  $$1,
                  xo.c("mco.compatibility.upgrade.title").b(-171),
                  xo.a("mco.compatibility.upgrade.description", xo.b($$0.t).b(-171), xo.b(aa.b().c()).b(-171)),
                  xo.c("mco.compatibility.upgrade")
               );
         }
      }
   }

   private static void a(fbd $$0, fnb $$1, xo $$2, xo $$3, xo $$4) {
      ffd.Q().a(new flt($$2x -> {
         fnb $$3x;
         if ($$2x) {
            $$3x = new fct($$1, new fec($$1, $$0));
            g();
         } else {
            $$3x = $$1;
         }

         ffd.Q().a($$3x);
      }, $$2, $$3, $$4, xn.e));
   }

   public static xo a(String $$0, boolean $$1) {
      return a($$0, $$1 ? -8355712 : -2142128);
   }

   public static xo a(String $$0, int $$1) {
      return (xo)(StringUtils.isBlank($$0) ? xn.a : xo.a("mco.version", xo.b($$0).b($$1)));
   }

   boolean h(fbd $$0) {
      return this.m.b($$0.g);
   }

   private boolean i(fbd $$0) {
      return this.h($$0) && !$$0.j;
   }

   private void a(fgp $$0, String $$1, int $$2) {
      $$0.c().a();
      $$0.c().a((float)(this.n / 2 - 25), 20.0F, 0.0F);
      $$0.c().a(a.f.rotationDegrees(-20.0F));
      $$0.c().b(1.5F, 1.5F, 1.5F);
      $$0.a(this.p, $$1, 0, 0, $$2, false);
      $$0.c().b();
   }

   class a extends fah.e {
      private static final xo c = xo.c("mco.snapshot.start");
      private static final int d = 5;
      private final fiq e = new fiq();
      private final fbd f;

      public a(final fbd $$0) {
         this.f = $$0;
         this.e.a(fin.a(xo.c("mco.snapshot.tooltip")));
      }

      @Override
      public void a(fgp $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(fah.b, $$3 - 5, $$2 + $$5 / 2 - 10, 40, 20);
         int $$10 = $$2 + $$5 / 2 - 9 / 2;
         $$0.b(fah.this.p, c, $$3 + 40 - 2, $$10 - 5, 8388479);
         $$0.b(fah.this.p, xo.a("mco.snapshot.description", this.f.c), $$3 + 40 - 2, $$10 + 5, -8355712);
         this.e.a($$8, this.aI_(), new fli($$3, $$2, $$4, $$5));
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         this.c();
         return true;
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         if (fld.a($$0)) {
            this.c();
            return true;
         } else {
            return super.a($$0, $$1, $$2);
         }
      }

      private void c() {
         fah.this.m.aj().a(gsg.a(avz.Ao, 1.0F));
         fah.this.m
            .a(
               new fie.a(fah.this, xo.c("mco.snapshot.createSnapshotPopup.title"))
                  .a(xo.c("mco.snapshot.createSnapshotPopup.text"))
                  .a(xo.c("mco.selectServer.create"), $$0 -> fah.this.m.a(new fco(fah.this, this.f.a)))
                  .a(xn.e, fie::d)
                  .a()
            );
      }

      @Override
      public xo a() {
         return xo.a("gui.narrate.button", xn.a(c, xo.a("mco.snapshot.description", this.f.c)));
      }
   }

   class b extends fah.e {
      private final fhc c;

      public b(final fhc $$0) {
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
      public void a(fgp $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.c.c(fah.this.n / 2 - 75, $$2 + 4);
         this.c.a($$0, $$6, $$7, $$9);
      }

      @Override
      public void a(boolean $$0) {
         super.a($$0);
         this.c.a($$0);
      }

      @Override
      public xo a() {
         return this.c.y();
      }
   }

   static class c extends fho {
      private static final fip b = new fip(new ale("widget/cross_button"), new ale("widget/cross_button_highlighted"));

      protected c(fhc.c $$0, xo $$1) {
         super(0, 0, 14, 14, b, $$0);
         this.a(fin.a($$1));
      }
   }

   class d extends fah.e {
      @Override
      public void a(fgp $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
      }

      @Override
      public xo a() {
         return xo.i();
      }
   }

   abstract class e extends fhy.a<fah.e> {
      private static final int a = 10;
      private static final int c = 28;
      private static final int d = 7;

      protected void a(fbd $$0, fgp $$1, int $$2, int $$3, int $$4, int $$5) {
         int $$6 = $$2 - 10 - 7;
         int $$7 = $$3 + 2;
         if ($$0.j) {
            this.a($$1, $$6, $$7, $$4, $$5, fah.c, () -> fah.S);
         } else if ($$0.e == fbd.c.a) {
            this.a($$1, $$6, $$7, $$4, $$5, fah.D, () -> fah.W);
         } else if (fah.this.h($$0) && $$0.l < 7) {
            this.a($$1, $$6, $$7, $$4, $$5, fah.B, () -> {
               if ($$0.l <= 0) {
                  return fah.T;
               } else {
                  return (xo)($$0.l == 1 ? fah.U : xo.a("mco.selectServer.expires.days", $$0.l));
               }
            });
         } else if ($$0.e == fbd.c.b) {
            this.a($$1, $$6, $$7, $$4, $$5, fah.C, () -> fah.V);
         }
      }

      private void a(fgp $$0, int $$1, int $$2, int $$3, int $$4, ale $$5, Supplier<xo> $$6) {
         $$0.a($$5, $$1, $$2, 10, 28);
         if (fah.this.aD.c((double)$$3, (double)$$4) && $$3 >= $$1 && $$3 <= $$1 + 10 && $$4 >= $$2 && $$4 <= $$2 + 28) {
            fah.this.d($$6.get());
         }
      }

      protected void a(fgp $$0, int $$1, int $$2, fbd $$3) {
         int $$4 = this.b($$2);
         int $$5 = this.a($$1);
         int $$6 = this.d($$5);
         if (!fah.this.h($$3)) {
            $$0.a(fah.this.p, $$3.f, $$4, this.d($$5), -8355712, false);
         } else if ($$3.j) {
            xo $$7 = $$3.k ? fah.O : fah.M;
            $$0.a(fah.this.p, $$7, $$4, $$6, -2142128, false);
         }
      }

      protected void a(fgp $$0, String $$1, int $$2, int $$3, int $$4, int $$5) {
         int $$6 = $$4 - $$2;
         if (fah.this.p.b($$1) > $$6) {
            String $$7 = fah.this.p.a($$1, $$6 - fah.this.p.b("... "));
            $$0.a(fah.this.p, $$7 + "...", $$2, $$3, $$5, false);
         } else {
            $$0.a(fah.this.p, $$1, $$2, $$3, $$5, false);
         }
      }

      protected int a(int $$0, int $$1, xo $$2) {
         return $$0 + $$1 - fah.this.p.a($$2) - 20;
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

   static class g extends fih.b {
      private static final ale[] d = new ale[]{
         new ale("notification/1"),
         new ale("notification/2"),
         new ale("notification/3"),
         new ale("notification/4"),
         new ale("notification/5"),
         new ale("notification/more")
      };
      private static final int u = Integer.MAX_VALUE;
      private static final int v = 20;
      private static final int w = 14;
      private int x;

      public g(xo $$0, ale $$1, fhc.c $$2) {
         super(20, 20, $$0, 14, 14, $$1, $$2, null);
      }

      int a() {
         return this.x;
      }

      public void a(int $$0) {
         this.x = $$0;
      }

      @Override
      public void b(fgp $$0, int $$1, int $$2, float $$3) {
         super.b($$0, $$1, $$2, $$3);
         if (this.j && this.x != 0) {
            this.a($$0);
         }
      }

      private void a(fgp $$0) {
         $$0.a(d[Math.min(this.x, 6) - 1], this.C() + this.x() - 5, this.D() - 3, 8, 8);
      }
   }

   class h extends fah.e {
      private static final int c = 40;
      private static final int d = -12303292;
      private final xo e;
      private final int f;
      private final List<fha> g = new ArrayList<>();
      @Nullable
      private final fah.c h;
      private final fhw i;
      private final fko j;
      private final fkn k;
      private int l = -1;

      public h(final xo $$0, final int $$1, final fbc $$2) {
         this.e = $$0;
         this.f = $$1;
         this.j = new fko();
         int $$3 = 7;
         this.j.a(fhp.a(20, 20, fah.a), 0, 0, this.j.b().a(7, 7, 0, 0));
         this.j.a(fku.a(40), 0, 0);
         this.k = this.j.a(new fkn(0, 9 * 3 * ($$1 - 1)), 0, 1, this.j.b().c(7));
         this.i = this.k.a(new fhw($$0, fah.this.p).b(true), this.k.b().b().d());
         this.j.a(fku.a(40), 0, 2);
         if ($$2.b()) {
            this.h = this.j.a(new fah.c($$1x -> fah.this.a($$2.c()), xo.c("mco.notification.dismiss")), 0, 2, this.j.b().c().a(0, 7, 7, 0));
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
      public void b(fgp $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         super.b($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
         $$0.b($$3 - 2, $$2 - 2, $$4, 36 * this.f - 2, -12303292);
      }

      @Override
      public void a(fgp $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
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
      public xo a() {
         return this.e;
      }
   }

   class i extends fah.e {
      private final fbd c;
      private final fiq d = new fiq();

      public i(final fbd $$0) {
         this.c = $$0;
         if (!$$0.j) {
            this.d.a(fin.a(xo.c("mco.snapshot.parent.tooltip")));
         }
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         return true;
      }

      @Override
      public void a(fgp $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = this.b($$3);
         int $$11 = this.a($$2);
         fdt.a($$0, $$3, $$2, 32, this.c.g);
         xo $$12 = fah.a(this.c.t, -8355712);
         int $$13 = this.a($$3, $$4, $$12);
         this.a($$0, this.c.b(), $$10, $$11, $$13, -8355712);
         if ($$12 != xn.a) {
            $$0.a(fah.this.p, $$12, $$13, $$11, -8355712, false);
         }

         $$0.a(fah.this.p, this.c.a(), $$10, this.c($$11), -8355712, false);
         this.a($$0, $$2, $$3, this.c);
         this.a(this.c, $$0, $$3 + $$4, $$2, $$6, $$7);
         this.d.a($$8, this.aI_(), new fli($$3, $$2, $$4, $$5));
      }

      @Override
      public xo a() {
         return xo.b(this.c.c);
      }
   }

   class j extends gvd<fah.e> {
      public j() {
         super(fah.this.n, fah.this.o, 0, 36);
      }

      public void a(@Nullable fah.e $$0) {
         super.a($$0);
         fah.this.I();
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
      T request(fam var1) throws fbz;
   }

   class l extends fah.e {
      private static final int c = 36;
      private final fbd d;
      private final fiq e = new fiq();

      public l(final fbd $$0) {
         this.d = $$0;
         boolean $$1 = fah.this.h($$0);
         if (fah.b() && $$1 && $$0.h()) {
            this.e.a(fin.a(xo.a("mco.snapshot.paired", $$0.s)));
         } else if (!$$1 && $$0.e()) {
            this.e.a(fin.a(xo.a("mco.snapshot.friendsRealm.upgrade", $$0.f)));
         } else if (!$$1 && $$0.f()) {
            this.e.a(fin.a(xo.a("mco.snapshot.friendsRealm.downgrade", $$0.t)));
         }
      }

      @Override
      public void a(fgp $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         if (this.d.e == fbd.c.c) {
            $$0.a(fah.b, $$3 - 5, $$2 + $$5 / 2 - 10, 40, 20);
            int $$10 = $$2 + $$5 / 2 - 9 / 2;
            $$0.b(fah.this.p, fah.L, $$3 + 40 - 2, $$10, 8388479);
         } else {
            fdt.a($$0, $$3, $$2, 32, this.d.g);
            this.a($$0, $$2, $$3, $$4);
            this.a($$0, $$2, $$3);
            this.a($$0, $$2, $$3, this.d);
            this.a(this.d, $$0, $$3 + $$4, $$2, $$6, $$7);
            this.e.a($$8, this.aI_(), new fli($$3, $$2, $$4, $$5));
         }
      }

      private void a(fgp $$0, int $$1, int $$2, int $$3) {
         int $$4 = this.b($$2);
         int $$5 = this.a($$1);
         xo $$6 = fah.a(this.d.t, this.d.d());
         int $$7 = this.a($$2, $$3, $$6);
         this.a($$0, this.d.b(), $$4, $$5, $$7, -1);
         if ($$6 != xn.a) {
            $$0.a(fah.this.p, $$6, $$7, $$5, -8355712, false);
         }
      }

      private void a(fgp $$0, int $$1, int $$2) {
         int $$3 = this.b($$2);
         int $$4 = this.a($$1);
         int $$5 = this.c($$4);
         String $$6 = this.d.c();
         if (this.d.m == fbd.d.b && $$6 != null) {
            xo $$7 = xo.b($$6).a(n.h);
            $$0.a(fah.this.p, xo.a("mco.selectServer.minigameName", $$7).b(-171), $$3, $$5, -1, false);
         } else {
            $$0.a(fah.this.p, this.d.a(), $$3, this.c($$4), -8355712, false);
         }
      }

      private void d() {
         fah.this.m.aj().a(gsg.a(avz.Ao, 1.0F));
         fah.a(this.d, fah.this);
      }

      private void e() {
         fah.this.m.aj().a(gsg.a(avz.Ao, 1.0F));
         fco $$0 = new fco(fah.this, this.d);
         fah.this.m.a($$0);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         if (this.d.e == fbd.c.c) {
            this.e();
         } else if (fah.this.a(this.d)) {
            if (ac.c() - fah.this.aI < 250L && this.aI_()) {
               this.d();
            }

            fah.this.aI = ac.c();
         }

         return true;
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         if (fld.a($$0)) {
            if (this.d.e == fbd.c.c) {
               this.e();
               return true;
            }

            if (fah.this.a(this.d)) {
               this.d();
               return true;
            }
         }

         return super.a($$0, $$1, $$2);
      }

      @Override
      public xo a() {
         return (xo)(this.d.e == fbd.c.c ? fah.X : xo.a("narrator.select", this.d.c));
      }

      public fbd c() {
         return this.d;
      }
   }
}
