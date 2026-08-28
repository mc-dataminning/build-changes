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

public class fai extends gvf {
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
   private final CompletableFuture<fah.a> as = fah.a();
   @Nullable
   private fdm.c at;
   private final Set<UUID> au = new HashSet<>();
   private static boolean av;
   private final RateLimiter aw;
   private final fnc ax;
   private fhd ay;
   private fhd az;
   private fhd aA;
   private fhd aB;
   private fhd aC;
   fai.j aD;
   private fcf aE;
   private List<fbe> aF = List.of();
   private volatile boolean aG;
   @Nullable
   private volatile String aH;
   long aI;
   private final List<fbd> aJ = new ArrayList<>();
   private fhd aK;
   private fai.g aL;
   private fai.g aM;
   private fai.f aN;
   @Nullable
   private fkq aO;

   public fai(fnc $$0) {
      super(J);
      this.ax = $$0;
      this.aw = RateLimiter.create(0.016666668F);
   }

   @Override
   public void aM_() {
      this.aE = new fcf(this.m);
      this.aD = new fai.j();
      xo $$0 = xo.c("mco.invites.title");
      this.aL = new fai.g($$0, E, $$1x -> this.m.a(new fcy(this, $$0)));
      xo $$1 = xo.c("mco.news");
      this.aM = new fai.g($$1, F, $$0x -> {
         String $$1x = this.aH;
         if ($$1x != null) {
            flt.a(this, $$1x);
            if (this.aM.a() != 0) {
               fds.a $$2 = fds.b();
               $$2.b = false;
               fds.b($$2);
               this.aM.a(0);
            }
         }
      });
      this.aM.a(fio.a($$1));
      this.ay = fhd.a(P, $$0x -> a(this.O(), this)).a(100).a();
      this.aB = fhd.a(R, $$0x -> this.f(this.O())).a(100).a();
      this.aA = fhd.a(N, $$0x -> this.e(this.O())).a(100).a();
      this.aC = fhd.a(Q, $$0x -> this.g(this.O())).a(100).a();
      this.aK = fhd.a(xo.c("mco.selectServer.purchase"), $$0x -> this.P()).b(100, 20).a();
      this.az = fhd.a(xn.k, $$0x -> this.d()).a(100).a();
      if (fan.a == fan.b.b) {
         this.c(fhk.a(xo.b("Snapshot"), xo.b("Release")).a(5, 5, 100, 20, xo.b("Realm"), ($$0x, $$1x) -> {
            ar = $$1x;
            this.aF = List.of();
            this.K();
         }));
      }

      this.a(fai.f.a);
      this.J();
      this.as.thenAcceptAsync($$0x -> {
         fnc $$1x = $$0x.a(this.ax);
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

   private void E() {
      if (this.aE.a() && this.aF.isEmpty() && this.aJ.isEmpty()) {
         this.a(fai.f.b);
      } else {
         this.a(fai.f.c);
      }
   }

   private void a(fai.f $$0) {
      if (this.aN != $$0) {
         if (this.aO != null) {
            this.aO.a($$1 -> this.e($$1));
         }

         this.aO = this.b($$0);
         this.aN = $$0;
         this.aO.a($$1 -> {
            fhb var10000 = this.c($$1);
         });
         this.c();
      }
   }

   private fkq b(fai.f $$0) {
      fkq $$1 = new fkq(this);
      $$1.b(44);
      $$1.a(this.F());
      fkr $$2 = this.c($$0);
      $$2.a();
      $$1.a($$2.v() + 22);
      $$1.b($$2);
      switch ($$0) {
         case a:
            $$1.c(new fhs(this.p, K));
            break;
         case b:
            $$1.c(this.I());
            break;
         case c:
            $$1.c(this.aD);
      }

      return $$1;
   }

   private fkr F() {
      int $$0 = 90;
      fku $$1 = fku.e().a(4);
      $$1.c().e();
      $$1.a(this.aL);
      $$1.a(this.aM);
      fku $$2 = fku.e();
      $$2.c().e();
      $$2.a(fkv.a(90));
      $$2.a(fhq.a(128, 34, H, 128, 64), fkt::b);
      $$2.a(new fko(90, 44)).a($$1, fkt::c);
      return $$2;
   }

   private fkr c(fai.f $$0) {
      fkp $$1 = new fkp().c(4);
      fkp.b $$2 = $$1.d(3);
      if ($$0 == fai.f.c) {
         $$2.a(this.ay);
         $$2.a(this.aB);
         $$2.a(this.aA);
         $$2.a(this.aC);
      }

      $$2.a(this.aK);
      $$2.a(this.az);
      return $$1;
   }

   private fku I() {
      fku $$0 = fku.d().a(8);
      $$0.c().b();
      $$0.a(fhq.a(130, 64, I, 130, 64));
      fho $$1 = new fho(308, Y, this.p, false, 4);
      $$0.a($$1);
      return $$0;
   }

   void J() {
      fbe $$0 = this.O();
      this.aK.j = this.aN != fai.f.a;
      this.ay.j = $$0 != null && this.a($$0);
      this.aA.j = $$0 != null && this.b($$0);
      this.aC.j = $$0 != null && this.d($$0);
      this.aB.j = $$0 != null && this.c($$0);
   }

   boolean a(fbe $$0) {
      boolean $$1 = !$$0.j && $$0.e == fbe.c.b;
      return $$1 && ($$0.d() || this.h($$0));
   }

   private boolean b(fbe $$0) {
      return $$0.j && this.h($$0);
   }

   private boolean c(fbe $$0) {
      return this.h($$0) && $$0.e != fbe.c.c;
   }

   private boolean d(fbe $$0) {
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
      ffe.Q().ba().d.a();
   }

   public static void g() {
      ffe.Q().ba().c.a();
   }

   private void K() {
      for (fdm.e<?> $$0 : this.m.ba().a()) {
         $$0.a();
      }
   }

   private fdm.c a(fcd $$0) {
      fdm.c $$1 = $$0.a.a();
      $$1.a($$0.c, $$0x -> {
         this.aE.a($$0x.a());
         this.aF = $$0x.b();
         this.L();
         boolean $$1x = false;

         for (fbe $$2 : this.aE) {
            if (this.i($$2)) {
               $$1x = true;
            }
         }

         if (!av && $$1x) {
            av = true;
            this.M();
         }
      });
      a(fan::d, $$0x -> {
         this.aJ.clear();
         this.aJ.addAll($$0x);

         for (fbd $$1x : $$0x) {
            if ($$1x instanceof fbd.a $$2) {
               fif $$3 = $$2.a(this, this::a);
               if ($$3 != null) {
                  this.m.a($$3);
                  this.a(List.of($$1x));
                  break;
               }
            }
         }

         if (!this.aJ.isEmpty() && this.aN != fai.f.a) {
            this.L();
         }
      });
      $$1.a($$0.d, $$0x -> {
         this.aL.a($$0x);
         this.aL.a($$0x == 0 ? fio.a(Z) : fio.a(aa));
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

   private void a(Collection<fbd> $$0) {
      List<UUID> $$1 = new ArrayList<>($$0.size());

      for (fbd $$2 : $$0) {
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

   private static <T> void a(fai.k<T> $$0, Consumer<T> $$1) {
      ffe $$2 = ffe.Q();
      CompletableFuture.<T>supplyAsync(() -> {
         try {
            return $$0.request(fan.a($$2));
         } catch (fca var3) {
            throw new RuntimeException(var3);
         }
      }).thenAcceptAsync($$1, $$2).exceptionally($$0x -> {
         G.error("Failed to execute call to Realms Service", $$0x);
         return null;
      });
   }

   private void L() {
      fbe $$0 = this.O();
      this.aD.I();

      for (fbd $$1 : this.aJ) {
         if (this.a($$1)) {
            this.a(List.of($$1));
            break;
         }
      }

      for (fbe $$2 : this.aF) {
         this.aD.a(new fai.a($$2));
      }

      for (fbe $$3 : this.aE) {
         fai.e $$4;
         if (b() && !$$3.h()) {
            if ($$3.e == fbe.c.c) {
               continue;
            }

            $$4 = new fai.i($$3);
         } else {
            $$4 = new fai.l($$3);
         }

         this.aD.a((fai.e)$$4);
         if ($$0 != null && $$0.a == $$3.a) {
            this.aD.a($$4);
         }
      }

      this.E();
      this.J();
   }

   private boolean a(fbd $$0) {
      if (!($$0 instanceof fbd.c $$1)) {
         return false;
      } else {
         xo $$2 = $$1.d();
         int $$3 = this.p.b($$2, 216);
         int $$4 = ayy.e($$3 + 7, 36) - 1;
         this.aD.a(new fai.h($$2, $$4 + 2, $$1));

         for (int $$5 = 0; $$5 < $$4; $$5++) {
            this.aD.a(new fai.d());
         }

         this.aD.a(new fai.b($$1.a(this)));
         return true;
      }
   }

   private void M() {
      new Thread(() -> {
         List<fbo> $$0 = fam.a();
         fan $$1 = fan.a();
         faz $$2 = new faz();
         $$2.a = $$0;
         $$2.b = this.N();

         try {
            $$1.a($$2);
         } catch (Throwable var5) {
            G.warn("Could not send ping result to Realms: ", var5);
         }
      }).start();
   }

   private List<Long> N() {
      List<Long> $$0 = Lists.newArrayList();

      for (fbe $$1 : this.aE) {
         if (this.i($$1)) {
            $$0.add($$1.a);
         }
      }

      return $$0;
   }

   private void e(@Nullable fbe $$0) {
      if ($$0 != null) {
         String $$1 = axt.a($$0.b, this.m.X().b(), $$0.k);
         this.m.o.a($$1);
         ac.k().a($$1);
      }
   }

   private void f(@Nullable fbe $$0) {
      if ($$0 != null && this.m.b($$0.g)) {
         this.m.a(new fcn(this, $$0.a));
      }
   }

   private void g(@Nullable fbe $$0) {
      if ($$0 != null && !this.m.b($$0.g)) {
         xo $$1 = xo.c("mco.configure.world.leave.question.line1");
         xo $$2 = xo.c("mco.configure.world.leave.question.line2");
         this.m.a(new fct($$1x -> this.a($$1x, $$0), fct.a.b, $$1, $$2, true));
      }
   }

   @Nullable
   private fbe O() {
      return this.aD.h() instanceof fai.l $$0 ? $$0.c() : null;
   }

   private void a(boolean $$0, final fbe $$1) {
      if ($$0) {
         (new Thread("Realms-leave-server") {
            @Override
            public void run() {
               try {
                  fan $$0 = fan.a();
                  $$0.d($$1.a);
                  fai.this.m.execute(fai::g);
               } catch (fca var2) {
                  fai.G.error("Couldn't configure world", var2);
                  fai.this.m.execute(() -> fai.this.m.a(new fcr(var2, fai.this)));
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
         this.L();
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
   public void a(fgq $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (b()) {
         $$0.b(this.p, "Minecraft " + aa.b().c(), 2, this.o - 10, -1);
      }

      if (this.aG && this.aK.j) {
         fda.a($$0, this.aK);
      }

      switch (fan.a) {
         case b:
            this.a($$0, "STAGE!", -256);
            break;
         case c:
            this.a($$0, "LOCAL!", 8388479);
      }
   }

   private void P() {
      this.m.a(new fda(this, this.aG));
   }

   public static void a(@Nullable fbe $$0, fnc $$1) {
      a($$0, $$1, false);
   }

   public static void a(@Nullable fbe $$0, fnc $$1, boolean $$2) {
      if ($$0 != null) {
         if (!b() || $$2) {
            ffe.Q().a(new fcu($$1, new fed($$1, $$0)));
            return;
         }

         switch ($$0.u) {
            case e:
               ffe.Q().a(new fcu($$1, new fed($$1, $$0)));
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

   private static void a(fbe $$0, fnc $$1, xo $$2, xo $$3, xo $$4) {
      ffe.Q().a(new flu($$2x -> {
         fnc $$3x;
         if ($$2x) {
            $$3x = new fcu($$1, new fed($$1, $$0));
            g();
         } else {
            $$3x = $$1;
         }

         ffe.Q().a($$3x);
      }, $$2, $$3, $$4, xn.e));
   }

   public static xo a(String $$0, boolean $$1) {
      return a($$0, $$1 ? -8355712 : -2142128);
   }

   public static xo a(String $$0, int $$1) {
      return (xo)(StringUtils.isBlank($$0) ? xn.a : xo.a("mco.version", xo.b($$0).b($$1)));
   }

   boolean h(fbe $$0) {
      return this.m.b($$0.g);
   }

   private boolean i(fbe $$0) {
      return this.h($$0) && !$$0.j;
   }

   private void a(fgq $$0, String $$1, int $$2) {
      $$0.c().a();
      $$0.c().a((float)(this.n / 2 - 25), 20.0F, 0.0F);
      $$0.c().a(a.f.rotationDegrees(-20.0F));
      $$0.c().b(1.5F, 1.5F, 1.5F);
      $$0.a(this.p, $$1, 0, 0, $$2, false);
      $$0.c().b();
   }

   class a extends fai.e {
      private static final xo c = xo.c("mco.snapshot.start");
      private static final int d = 5;
      private final fir e = new fir();
      private final fbe f;

      public a(final fbe $$0) {
         this.f = $$0;
         this.e.a(fio.a(xo.c("mco.snapshot.tooltip")));
      }

      @Override
      public void a(fgq $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(fai.b, $$3 - 5, $$2 + $$5 / 2 - 10, 40, 20);
         int $$10 = $$2 + $$5 / 2 - 9 / 2;
         $$0.b(fai.this.p, c, $$3 + 40 - 2, $$10 - 5, 8388479);
         $$0.b(fai.this.p, xo.a("mco.snapshot.description", this.f.c), $$3 + 40 - 2, $$10 + 5, -8355712);
         this.e.a($$8, this.aH_(), new flj($$3, $$2, $$4, $$5));
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         this.c();
         return true;
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         if (fle.a($$0)) {
            this.c();
            return true;
         } else {
            return super.a($$0, $$1, $$2);
         }
      }

      private void c() {
         fai.this.m.aj().a(gsh.a(avz.Ao, 1.0F));
         fai.this.m
            .a(
               new fif.a(fai.this, xo.c("mco.snapshot.createSnapshotPopup.title"))
                  .a(xo.c("mco.snapshot.createSnapshotPopup.text"))
                  .a(xo.c("mco.selectServer.create"), $$0 -> fai.this.m.a(new fcp(fai.this, this.f.a)))
                  .a(xn.e, fif::d)
                  .a()
            );
      }

      @Override
      public xo a() {
         return xo.a("gui.narrate.button", xn.a(c, xo.a("mco.snapshot.description", this.f.c)));
      }
   }

   class b extends fai.e {
      private final fhd c;

      public b(final fhd $$0) {
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
      public void a(fgq $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.c.c(fai.this.n / 2 - 75, $$2 + 4);
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

   static class c extends fhp {
      private static final fiq b = new fiq(new ale("widget/cross_button"), new ale("widget/cross_button_highlighted"));

      protected c(fhd.c $$0, xo $$1) {
         super(0, 0, 14, 14, b, $$0);
         this.a(fio.a($$1));
      }
   }

   class d extends fai.e {
      @Override
      public void a(fgq $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
      }

      @Override
      public xo a() {
         return xo.i();
      }
   }

   abstract class e extends fhz.a<fai.e> {
      private static final int a = 10;
      private static final int c = 28;
      private static final int d = 7;

      protected void a(fbe $$0, fgq $$1, int $$2, int $$3, int $$4, int $$5) {
         int $$6 = $$2 - 10 - 7;
         int $$7 = $$3 + 2;
         if ($$0.j) {
            this.a($$1, $$6, $$7, $$4, $$5, fai.c, () -> fai.S);
         } else if ($$0.e == fbe.c.a) {
            this.a($$1, $$6, $$7, $$4, $$5, fai.D, () -> fai.W);
         } else if (fai.this.h($$0) && $$0.l < 7) {
            this.a($$1, $$6, $$7, $$4, $$5, fai.B, () -> {
               if ($$0.l <= 0) {
                  return fai.T;
               } else {
                  return (xo)($$0.l == 1 ? fai.U : xo.a("mco.selectServer.expires.days", $$0.l));
               }
            });
         } else if ($$0.e == fbe.c.b) {
            this.a($$1, $$6, $$7, $$4, $$5, fai.C, () -> fai.V);
         }
      }

      private void a(fgq $$0, int $$1, int $$2, int $$3, int $$4, ale $$5, Supplier<xo> $$6) {
         $$0.a($$5, $$1, $$2, 10, 28);
         if (fai.this.aD.c((double)$$3, (double)$$4) && $$3 >= $$1 && $$3 <= $$1 + 10 && $$4 >= $$2 && $$4 <= $$2 + 28) {
            fai.this.d($$6.get());
         }
      }

      protected void a(fgq $$0, int $$1, int $$2, fbe $$3) {
         int $$4 = this.b($$2);
         int $$5 = this.a($$1);
         int $$6 = this.d($$5);
         if (!fai.this.h($$3)) {
            $$0.a(fai.this.p, $$3.f, $$4, this.d($$5), -8355712, false);
         } else if ($$3.j) {
            xo $$7 = $$3.k ? fai.O : fai.M;
            $$0.a(fai.this.p, $$7, $$4, $$6, -2142128, false);
         }
      }

      protected void a(fgq $$0, String $$1, int $$2, int $$3, int $$4, int $$5) {
         int $$6 = $$4 - $$2;
         if (fai.this.p.b($$1) > $$6) {
            String $$7 = fai.this.p.a($$1, $$6 - fai.this.p.b("... "));
            $$0.a(fai.this.p, $$7 + "...", $$2, $$3, $$5, false);
         } else {
            $$0.a(fai.this.p, $$1, $$2, $$3, $$5, false);
         }
      }

      protected int a(int $$0, int $$1, xo $$2) {
         return $$0 + $$1 - fai.this.p.a($$2) - 20;
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

   static class g extends fii.b {
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

      public g(xo $$0, ale $$1, fhd.c $$2) {
         super(20, 20, $$0, 14, 14, $$1, $$2, null);
      }

      int a() {
         return this.x;
      }

      public void a(int $$0) {
         this.x = $$0;
      }

      @Override
      public void b(fgq $$0, int $$1, int $$2, float $$3) {
         super.b($$0, $$1, $$2, $$3);
         if (this.j && this.x != 0) {
            this.a($$0);
         }
      }

      private void a(fgq $$0) {
         $$0.a(d[Math.min(this.x, 6) - 1], this.C() + this.x() - 5, this.D() - 3, 8, 8);
      }
   }

   class h extends fai.e {
      private static final int c = 40;
      private static final int d = -12303292;
      private final xo e;
      private final int f;
      private final List<fhb> g = new ArrayList<>();
      @Nullable
      private final fai.c h;
      private final fhx i;
      private final fkp j;
      private final fko k;
      private int l = -1;

      public h(final xo $$0, final int $$1, final fbd $$2) {
         this.e = $$0;
         this.f = $$1;
         this.j = new fkp();
         int $$3 = 7;
         this.j.a(fhq.a(20, 20, fai.a), 0, 0, this.j.b().a(7, 7, 0, 0));
         this.j.a(fkv.a(40), 0, 0);
         this.k = this.j.a(new fko(0, 9 * 3 * ($$1 - 1)), 0, 1, this.j.b().c(7));
         this.i = this.k.a(new fhx($$0, fai.this.p).b(true), this.k.b().b().d());
         this.j.a(fkv.a(40), 0, 2);
         if ($$2.b()) {
            this.h = this.j.a(new fai.c($$1x -> fai.this.a($$2.c()), xo.c("mco.notification.dismiss")), 0, 2, this.j.b().c().a(0, 7, 7, 0));
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
      public void b(fgq $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         super.b($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
         $$0.b($$3 - 2, $$2 - 2, $$4, 36 * this.f - 2, -12303292);
      }

      @Override
      public void a(fgq $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
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

   class i extends fai.e {
      private final fbe c;
      private final fir d = new fir();

      public i(final fbe $$0) {
         this.c = $$0;
         if (!$$0.j) {
            this.d.a(fio.a(xo.c("mco.snapshot.parent.tooltip")));
         }
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         return true;
      }

      @Override
      public void a(fgq $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = this.b($$3);
         int $$11 = this.a($$2);
         fdu.a($$0, $$3, $$2, 32, this.c.g);
         xo $$12 = fai.a(this.c.t, -8355712);
         int $$13 = this.a($$3, $$4, $$12);
         this.a($$0, this.c.b(), $$10, $$11, $$13, -8355712);
         if ($$12 != xn.a) {
            $$0.a(fai.this.p, $$12, $$13, $$11, -8355712, false);
         }

         $$0.a(fai.this.p, this.c.a(), $$10, this.c($$11), -8355712, false);
         this.a($$0, $$2, $$3, this.c);
         this.a(this.c, $$0, $$3 + $$4, $$2, $$6, $$7);
         this.d.a($$8, this.aH_(), new flj($$3, $$2, $$4, $$5));
      }

      @Override
      public xo a() {
         return xo.b(this.c.c);
      }
   }

   class j extends gve<fai.e> {
      public j() {
         super(fai.this.n, fai.this.o, 0, 36);
      }

      public void a(@Nullable fai.e $$0) {
         super.a($$0);
         fai.this.J();
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
      T request(fan var1) throws fca;
   }

   class l extends fai.e {
      private static final int c = 36;
      private final fbe d;
      private final fir e = new fir();

      public l(final fbe $$0) {
         this.d = $$0;
         boolean $$1 = fai.this.h($$0);
         if (fai.b() && $$1 && $$0.h()) {
            this.e.a(fio.a(xo.a("mco.snapshot.paired", $$0.s)));
         } else if (!$$1 && $$0.e()) {
            this.e.a(fio.a(xo.a("mco.snapshot.friendsRealm.upgrade", $$0.f)));
         } else if (!$$1 && $$0.f()) {
            this.e.a(fio.a(xo.a("mco.snapshot.friendsRealm.downgrade", $$0.t)));
         }
      }

      @Override
      public void a(fgq $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         if (this.d.e == fbe.c.c) {
            $$0.a(fai.b, $$3 - 5, $$2 + $$5 / 2 - 10, 40, 20);
            int $$10 = $$2 + $$5 / 2 - 9 / 2;
            $$0.b(fai.this.p, fai.L, $$3 + 40 - 2, $$10, 8388479);
         } else {
            fdu.a($$0, $$3, $$2, 32, this.d.g);
            this.a($$0, $$2, $$3, $$4);
            this.a($$0, $$2, $$3);
            this.a($$0, $$2, $$3, this.d);
            this.a(this.d, $$0, $$3 + $$4, $$2, $$6, $$7);
            this.e.a($$8, this.aH_(), new flj($$3, $$2, $$4, $$5));
         }
      }

      private void a(fgq $$0, int $$1, int $$2, int $$3) {
         int $$4 = this.b($$2);
         int $$5 = this.a($$1);
         xo $$6 = fai.a(this.d.t, this.d.d());
         int $$7 = this.a($$2, $$3, $$6);
         this.a($$0, this.d.b(), $$4, $$5, $$7, -1);
         if ($$6 != xn.a) {
            $$0.a(fai.this.p, $$6, $$7, $$5, -8355712, false);
         }
      }

      private void a(fgq $$0, int $$1, int $$2) {
         int $$3 = this.b($$2);
         int $$4 = this.a($$1);
         int $$5 = this.c($$4);
         String $$6 = this.d.c();
         if (this.d.m == fbe.d.b && $$6 != null) {
            xo $$7 = xo.b($$6).a(n.h);
            $$0.a(fai.this.p, xo.a("mco.selectServer.minigameName", $$7).b(-171), $$3, $$5, -1, false);
         } else {
            $$0.a(fai.this.p, this.d.a(), $$3, this.c($$4), -8355712, false);
         }
      }

      private void d() {
         fai.this.m.aj().a(gsh.a(avz.Ao, 1.0F));
         fai.a(this.d, fai.this);
      }

      private void e() {
         fai.this.m.aj().a(gsh.a(avz.Ao, 1.0F));
         fcp $$0 = new fcp(fai.this, this.d);
         fai.this.m.a($$0);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         if (this.d.e == fbe.c.c) {
            this.e();
         } else if (fai.this.a(this.d)) {
            if (ac.c() - fai.this.aI < 250L && this.aH_()) {
               this.d();
            }

            fai.this.aI = ac.c();
         }

         return true;
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         if (fle.a($$0)) {
            if (this.d.e == fbe.c.c) {
               this.e();
               return true;
            }

            if (fai.this.a(this.d)) {
               this.d();
               return true;
            }
         }

         return super.a($$0, $$1, $$2);
      }

      @Override
      public xo a() {
         return (xo)(this.d.e == fbe.c.c ? fai.X : xo.a("narrator.select", this.d.c));
      }

      public fbe c() {
         return this.d;
      }
   }
}
