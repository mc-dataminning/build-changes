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

public class eqe extends gkc {
   static final ahd a = new ahd("icon/info");
   static final ahd b = new ahd("icon/new_realm");
   static final ahd c = new ahd("realm_status/expired");
   static final ahd v = new ahd("realm_status/expires_soon");
   static final ahd w = new ahd("realm_status/open");
   static final ahd x = new ahd("realm_status/closed");
   private static final ahd y = new ahd("icon/invite");
   private static final ahd z = new ahd("icon/news");
   static final Logger A = LogUtils.getLogger();
   private static final ahd B = new ahd("textures/gui/title/realms.png");
   private static final ahd C = new ahd("textures/gui/realms/no_realms.png");
   private static final vd D = vd.c("menu.online");
   private static final vd E = vd.c("mco.selectServer.loading");
   static final vd F = vd.c("mco.selectServer.uninitialized");
   static final vd G = vd.c("mco.selectServer.expiredList");
   private static final vd H = vd.c("mco.selectServer.expiredRenew");
   static final vd I = vd.c("mco.selectServer.expiredTrial");
   private static final vd J = vd.c("mco.selectServer.play");
   private static final vd K = vd.c("mco.selectServer.leave");
   private static final vd L = vd.c("mco.selectServer.configure");
   static final vd M = vd.c("mco.selectServer.expired");
   static final vd N = vd.c("mco.selectServer.expires.soon");
   static final vd O = vd.c("mco.selectServer.expires.day");
   static final vd P = vd.c("mco.selectServer.open");
   static final vd Q = vd.c("mco.selectServer.closed");
   static final vd R = vd.a("gui.narrate.button", F);
   private static final vd S = vd.c("mco.selectServer.noRealms");
   private static final vd T = vd.c("mco.invites.nopending");
   private static final vd U = vd.c("mco.invites.pending");
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
   private final CompletableFuture<eqd.a> am = eqd.a();
   @Nullable
   private eti.c an;
   private final Set<UUID> ao = new HashSet<>();
   private static boolean ap;
   private final RateLimiter aq;
   private final fct ar;
   private ewy as;
   private ewy at;
   private ewy au;
   private ewy av;
   private ewy aw;
   eqe.j ax;
   private esb ay;
   private List<era> az = List.of();
   private volatile boolean aA;
   @Nullable
   private volatile String aB;
   long aC;
   private final List<eqz> aD = new ArrayList<>();
   private ewy aE;
   private eqe.g aF;
   private eqe.g aG;
   private eqe.f aH;
   @Nullable
   private fai aI;

   public eqe(fct $$0) {
      super(D);
      this.ar = $$0;
      this.aq = RateLimiter.create(0.016666668F);
   }

   @Override
   public void aN_() {
      this.ay = new esb(this.f);
      this.ax = new eqe.j();
      vd $$0 = vd.c("mco.invites.title");
      this.aF = new eqe.g($$0, y, $$1x -> this.f.a(new esu(this, $$0)));
      vd $$1 = vd.c("mco.news");
      this.aG = new eqe.g($$1, z, $$0x -> {
         String $$1x = this.aB;
         if ($$1x != null) {
            fbl.a(this, $$1x);
            if (this.aG.a() != 0) {
               eto.a $$2 = eto.b();
               $$2.b = false;
               eto.b($$2);
               this.aG.a(0);
            }
         }
      });
      this.aG.a(eyj.a($$1));
      this.as = ewy.a(J, $$0x -> a(this.M(), this)).a(100).a();
      this.av = ewy.a(L, $$0x -> this.f(this.M())).a(100).a();
      this.au = ewy.a(H, $$0x -> this.e(this.M())).a(100).a();
      this.aw = ewy.a(K, $$0x -> this.g(this.M())).a(100).a();
      this.aE = ewy.a(vd.c("mco.selectServer.purchase"), $$0x -> this.N()).b(100, 20).a();
      this.at = ewy.a(vc.k, $$0x -> this.f.a(this.ar)).a(100).a();
      if (eqj.a == eqj.b.b) {
         this.d(exf.a(vd.b("Snapshot"), vd.b("Release")).a(5, 5, 100, 20, vd.b("Realm"), ($$0x, $$1x) -> {
            al = $$1x;
            this.az = List.of();
            this.I();
         }));
      }

      this.a(eqe.f.a);
      this.H();
      this.am.thenAcceptAsync($$0x -> {
         fct $$1x = $$0x.a(this.ar);
         if ($$1x == null) {
            this.an = this.a(this.f.aX());
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

   private void C() {
      if (this.ay.a() && this.az.isEmpty() && this.aD.isEmpty()) {
         this.a(eqe.f.b);
      } else {
         this.a(eqe.f.c);
      }
   }

   private void a(eqe.f $$0) {
      if (this.aH != $$0) {
         if (this.aI != null) {
            this.aI.a($$1 -> this.f($$1));
         }

         this.aI = this.b($$0);
         this.aH = $$0;
         this.aI.a($$1 -> {
            eww var10000 = this.d($$1);
         });
         this.c();
      }
   }

   private fai b(eqe.f $$0) {
      fai $$1 = new fai(this);
      $$1.b(44);
      $$1.a(this.D());
      faj $$2 = this.c($$0);
      $$2.a();
      $$1.a($$2.u() + 22);
      $$1.b($$2);
      switch ($$0) {
         case a:
            $$1.c(new exn(this.i, E));
            break;
         case b:
            $$1.c(this.E());
            break;
         case c:
            $$1.c(this.ax);
      }

      return $$1;
   }

   private faj D() {
      int $$0 = 90;
      fam $$1 = fam.e().a(4);
      $$1.c().e();
      $$1.a(this.aF);
      $$1.a(this.aG);
      fam $$2 = fam.e();
      $$2.c().e();
      $$2.a(fan.a(90));
      $$2.a(exl.a(128, 34, B, 128, 64), fal::b);
      $$2.a(new fag(90, 44)).a($$1, fal::c);
      return $$2;
   }

   private faj c(eqe.f $$0) {
      fah $$1 = new fah().c(4);
      fah.b $$2 = $$1.d(3);
      if ($$0 == eqe.f.c) {
         $$2.a(this.as);
         $$2.a(this.av);
         $$2.a(this.au);
         $$2.a(this.aw);
      }

      $$2.a(this.aE);
      $$2.a(this.at);
      return $$1;
   }

   private fam E() {
      fam $$0 = fam.d().a(10);
      $$0.c().b();
      $$0.a(exl.a(130, 64, C, 130, 64));
      exj $$1 = new exj(308, S, this.i, false);
      $$0.a($$1);
      return $$0;
   }

   void H() {
      era $$0 = this.M();
      this.aE.j = this.aH != eqe.f.a;
      this.as.j = $$0 != null && this.a($$0);
      this.au.j = $$0 != null && this.b($$0);
      this.aw.j = $$0 != null && this.d($$0);
      this.av.j = $$0 != null && this.c($$0);
   }

   boolean a(era $$0) {
      boolean $$1 = !$$0.j && $$0.e == era.c.b;
      return $$1 && ($$0.d() || this.h($$0));
   }

   private boolean b(era $$0) {
      return $$0.j && this.h($$0);
   }

   private boolean c(era $$0) {
      return this.h($$0) && $$0.e != era.c.c;
   }

   private boolean d(era $$0) {
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
      eva.N().aX().d.a();
   }

   public static void f() {
      eva.N().aX().c.a();
   }

   private void I() {
      for (eti.e<?> $$0 : this.f.aX().a()) {
         $$0.a();
      }
   }

   private eti.c a(erz $$0) {
      eti.c $$1 = $$0.a.a();
      $$1.a($$0.c, $$0x -> {
         this.ay.a($$0x.a());
         this.az = $$0x.b();
         this.J();
         boolean $$1x = false;

         for (era $$2 : this.ay) {
            if (this.i($$2)) {
               $$1x = true;
            }
         }

         if (!ap && $$1x) {
            ap = true;
            this.K();
         }
      });
      a(eqj::d, $$0x -> {
         this.aD.clear();
         this.aD.addAll($$0x);

         for (eqz $$1x : $$0x) {
            if ($$1x instanceof eqz.a $$2) {
               eya $$3 = $$2.a(this, this::a);
               if ($$3 != null) {
                  this.f.a($$3);
                  this.a(List.of($$1x));
                  break;
               }
            }
         }

         if (!this.aD.isEmpty() && this.aH != eqe.f.a) {
            this.J();
         }
      });
      $$1.a($$0.d, $$0x -> {
         this.aF.a($$0x);
         this.aF.a($$0x == 0 ? eyj.a(T) : eyj.a(U));
         if ($$0x > 0 && this.aq.tryAcquire(1)) {
            this.f.aU().c(vd.a("mco.configure.world.invite.narration", $$0x));
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

   private void a(Collection<eqz> $$0) {
      List<UUID> $$1 = new ArrayList<>($$0.size());

      for (eqz $$2 : $$0) {
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

   private static <T> void a(eqe.k<T> $$0, Consumer<T> $$1) {
      eva $$2 = eva.N();
      CompletableFuture.<T>supplyAsync(() -> {
         try {
            return $$0.request(eqj.a($$2));
         } catch (erw var3) {
            throw new RuntimeException(var3);
         }
      }).thenAcceptAsync($$1, $$2).exceptionally($$0x -> {
         A.error("Failed to execute call to Realms Service", $$0x);
         return null;
      });
   }

   private void J() {
      era $$0 = this.M();
      this.ax.H();

      for (eqz $$1 : this.aD) {
         if (this.a($$1)) {
            this.a(List.of($$1));
            break;
         }
      }

      for (era $$2 : this.az) {
         this.ax.a(new eqe.a($$2));
      }

      for (era $$3 : this.ay) {
         eqe.e $$4;
         if (b() && !$$3.h()) {
            if ($$3.e == era.c.c) {
               continue;
            }

            $$4 = new eqe.i($$3);
         } else {
            $$4 = new eqe.l($$3);
         }

         this.ax.a((eqe.e)$$4);
         if ($$0 != null && $$0.a == $$3.a) {
            this.ax.a($$4);
         }
      }

      this.C();
      this.H();
   }

   private boolean a(eqz $$0) {
      if (!($$0 instanceof eqz.c $$1)) {
         return false;
      } else {
         vd $$2 = $$1.d();
         int $$3 = this.i.b($$2, 216);
         int $$4 = aui.e($$3 + 7, 36) - 1;
         this.ax.a(new eqe.h($$2, $$4 + 2, $$1));

         for (int $$5 = 0; $$5 < $$4; $$5++) {
            this.ax.a(new eqe.d());
         }

         this.ax.a(new eqe.b($$1.a(this)));
         return true;
      }
   }

   private void K() {
      new Thread(() -> {
         List<erk> $$0 = eqi.a();
         eqj $$1 = eqj.a();
         eqv $$2 = new eqv();
         $$2.a = $$0;
         $$2.b = this.L();

         try {
            $$1.a($$2);
         } catch (Throwable var5) {
            A.warn("Could not send ping result to Realms: ", var5);
         }
      }).start();
   }

   private List<Long> L() {
      List<Long> $$0 = Lists.newArrayList();

      for (era $$1 : this.ay) {
         if (this.i($$1)) {
            $$0.add($$1.a);
         }
      }

      return $$0;
   }

   private void e(@Nullable era $$0) {
      if ($$0 != null) {
         String $$1 = ate.a($$0.b, this.f.U().b(), $$0.k);
         this.f.o.a($$1);
         ac.i().a($$1);
      }
   }

   private void f(@Nullable era $$0) {
      if ($$0 != null && this.f.b($$0.g)) {
         this.f.a(new esj(this, $$0.a));
      }
   }

   private void g(@Nullable era $$0) {
      if ($$0 != null && !this.f.b($$0.g)) {
         vd $$1 = vd.c("mco.configure.world.leave.question.line1");
         vd $$2 = vd.c("mco.configure.world.leave.question.line2");
         this.f.a(new esp($$1x -> this.a($$1x, $$0), esp.a.b, $$1, $$2, true));
      }
   }

   @Nullable
   private era M() {
      return this.ax.i() instanceof eqe.l $$0 ? $$0.c() : null;
   }

   private void a(boolean $$0, final era $$1) {
      if ($$0) {
         (new Thread("Realms-leave-server") {
            @Override
            public void run() {
               try {
                  eqj $$0 = eqj.a();
                  $$0.d($$1.a);
                  eqe.this.f.execute(eqe::f);
               } catch (erw var2) {
                  eqe.A.error("Couldn't configure world", var2);
                  eqe.this.f.execute(() -> eqe.this.f.a(new esn(var2, eqe.this)));
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
         this.J();
      });
   }

   public void g() {
      this.ax.a(null);
      f();
   }

   @Override
   public vd h() {
      return (vd)(switch (this.aH) {
         case a -> vc.a(super.h(), E);
         case b -> vc.a(super.h(), S);
         case c -> super.h();
      });
   }

   @Override
   public void a(ewm $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (b()) {
         $$0.b(this.i, "Minecraft " + aa.b().c(), 2, this.h - 10, -1);
      }

      if (this.aA && this.aE.j) {
         esw.a($$0, this.aE);
      }

      switch (eqj.a) {
         case b:
            this.a($$0, "STAGE!", -256);
            break;
         case c:
            this.a($$0, "LOCAL!", 8388479);
      }
   }

   private void N() {
      this.f.a(new esw(this, this.aA));
   }

   public static void a(@Nullable era $$0, fct $$1) {
      a($$0, $$1, false);
   }

   public static void a(@Nullable era $$0, fct $$1, boolean $$2) {
      if ($$0 != null) {
         if (!b() || $$2) {
            eva.N().a(new esq($$1, new etz($$1, $$0)));
            return;
         }

         switch ($$0.u) {
            case e:
               eva.N().a(new esq($$1, new etz($$1, $$0)));
               break;
            case a:
               a($$0, $$1, vd.c("mco.compatibility.unverifiable.title").b(-171), vd.c("mco.compatibility.unverifiable.message"), vc.j);
               break;
            case c:
               a(
                  $$0,
                  $$1,
                  vd.c("selectWorld.backupQuestion.downgrade").b(-2142128),
                  vd.a("mco.compatibility.downgrade.description", vd.b($$0.t).b(-171), vd.b(aa.b().c()).b(-171)),
                  vd.c("mco.compatibility.downgrade")
               );
               break;
            case d:
               a(
                  $$0,
                  $$1,
                  vd.c("mco.compatibility.upgrade.title").b(-171),
                  vd.a("mco.compatibility.upgrade.description", vd.b($$0.t).b(-171), vd.b(aa.b().c()).b(-171)),
                  vd.c("mco.compatibility.upgrade")
               );
         }
      }
   }

   private static void a(era $$0, fct $$1, vd $$2, vd $$3, vd $$4) {
      eva.N().a(new fbm($$2x -> {
         fct $$3x;
         if ($$2x) {
            $$3x = new esq($$1, new etz($$1, $$0));
            f();
         } else {
            $$3x = $$1;
         }

         eva.N().a($$3x);
      }, $$2, $$3, $$4, vc.e));
   }

   public static vd a(String $$0, boolean $$1) {
      return a($$0, $$1 ? -8355712 : -2142128);
   }

   public static vd a(String $$0, int $$1) {
      return (vd)(StringUtils.isBlank($$0) ? vc.a : vd.a("mco.version", vd.b($$0).b($$1)));
   }

   boolean h(era $$0) {
      return this.f.b($$0.g);
   }

   private boolean i(era $$0) {
      return this.h($$0) && !$$0.j;
   }

   private void a(ewm $$0, String $$1, int $$2) {
      $$0.c().a();
      $$0.c().a((float)(this.g / 2 - 25), 20.0F, 0.0F);
      $$0.c().a(a.f.rotationDegrees(-20.0F));
      $$0.c().b(1.5F, 1.5F, 1.5F);
      $$0.a(this.i, $$1, 0, 0, $$2, false);
      $$0.c().b();
   }

   class a extends eqe.e {
      private static final vd c = vd.c("mco.snapshot.start");
      private static final int d = 5;
      private final eyj e;
      private final era f;

      public a(era $$0) {
         this.f = $$0;
         this.e = eyj.a(vd.c("mco.snapshot.tooltip"));
      }

      @Override
      public void a(ewm $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(eqe.b, $$3 - 5, $$2 + $$5 / 2 - 10, 40, 20);
         int $$10 = $$2 + $$5 / 2 - 9 / 2;
         $$0.b(eqe.this.i, c, $$3 + 40 - 2, $$10 - 5, 8388479);
         $$0.b(eqe.this.i, vd.a("mco.snapshot.description", this.f.c), $$3 + 40 - 2, $$10 + 5, -8355712);
         this.e.a($$8, this.aI_(), new fbb($$3, $$2, $$4, $$5));
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         this.c();
         return true;
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         if (faw.a($$0)) {
            this.c();
            return true;
         } else {
            return super.a($$0, $$1, $$2);
         }
      }

      private void c() {
         eqe.this.f.ah().a(ghi.a(arm.zu, 1.0F));
         eqe.this.f
            .a(
               new eya.a(eqe.this, vd.c("mco.snapshot.createSnapshotPopup.title"))
                  .a(vd.c("mco.snapshot.createSnapshotPopup.text"))
                  .a(vd.c("mco.selectServer.create"), $$0 -> eqe.this.f.a(new esl(eqe.this, this.f.a)))
                  .a(vc.e, eya::aE_)
                  .a()
            );
      }

      @Override
      public vd a() {
         return vd.a("gui.narrate.button", vc.a(c, vd.a("mco.snapshot.description", this.f.c)));
      }
   }

   class b extends eqe.e {
      private final ewy c;

      public b(ewy $$0) {
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
      public void a(ewm $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.c.c(eqe.this.g / 2 - 75, $$2 + 4);
         this.c.a($$0, $$6, $$7, $$9);
      }

      @Override
      public void a(boolean $$0) {
         super.a($$0);
         this.c.a($$0);
      }

      @Override
      public vd a() {
         return this.c.x();
      }
   }

   static class c extends exk {
      private static final eyl b = new eyl(new ahd("widget/cross_button"), new ahd("widget/cross_button_highlighted"));

      protected c(ewy.c $$0, vd $$1) {
         super(0, 0, 14, 14, b, $$0);
         this.a(eyj.a($$1));
      }
   }

   class d extends eqe.e {
      @Override
      public void a(ewm $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
      }

      @Override
      public vd a() {
         return vd.i();
      }
   }

   abstract class e extends exu.a<eqe.e> {
      private static final int a = 10;
      private static final int c = 28;
      private static final int d = 7;

      protected void a(era $$0, ewm $$1, int $$2, int $$3, int $$4, int $$5) {
         int $$6 = $$2 - 10 - 7;
         int $$7 = $$3 + 2;
         if ($$0.j) {
            this.a($$1, $$6, $$7, $$4, $$5, eqe.c, () -> eqe.M);
         } else if ($$0.e == era.c.a) {
            this.a($$1, $$6, $$7, $$4, $$5, eqe.x, () -> eqe.Q);
         } else if (eqe.this.h($$0) && $$0.l < 7) {
            this.a($$1, $$6, $$7, $$4, $$5, eqe.v, () -> {
               if ($$0.l <= 0) {
                  return eqe.N;
               } else {
                  return (vd)($$0.l == 1 ? eqe.O : vd.a("mco.selectServer.expires.days", $$0.l));
               }
            });
         } else if ($$0.e == era.c.b) {
            this.a($$1, $$6, $$7, $$4, $$5, eqe.w, () -> eqe.P);
         }
      }

      private void a(ewm $$0, int $$1, int $$2, int $$3, int $$4, ahd $$5, Supplier<vd> $$6) {
         $$0.a($$5, $$1, $$2, 10, 28);
         if (eqe.this.ax.c((double)$$3, (double)$$4) && $$3 >= $$1 && $$3 <= $$1 + 10 && $$4 >= $$2 && $$4 <= $$2 + 28) {
            eqe.this.d($$6.get());
         }
      }

      protected void a(ewm $$0, int $$1, int $$2, era $$3) {
         int $$4 = this.b($$2);
         int $$5 = this.a($$1);
         int $$6 = this.d($$5);
         if (!eqe.this.h($$3)) {
            $$0.a(eqe.this.i, $$3.f, $$4, this.d($$5), -8355712, false);
         } else if ($$3.j) {
            vd $$7 = $$3.k ? eqe.I : eqe.G;
            $$0.a(eqe.this.i, $$7, $$4, $$6, -2142128, false);
         }
      }

      protected void a(ewm $$0, String $$1, int $$2, int $$3, int $$4, int $$5) {
         int $$6 = $$4 - $$2;
         if (eqe.this.i.b($$1) > $$6) {
            String $$7 = eqe.this.i.a($$1, $$6 - eqe.this.i.b("... "));
            $$0.a(eqe.this.i, $$7 + "...", $$2, $$3, $$5, false);
         } else {
            $$0.a(eqe.this.i, $$1, $$2, $$3, $$5, false);
         }
      }

      protected int a(int $$0, int $$1, vd $$2) {
         return $$0 + $$1 - eqe.this.i.a($$2) - 20;
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

   static class g extends eyd.b {
      private static final ahd[] d = new ahd[]{
         new ahd("notification/1"),
         new ahd("notification/2"),
         new ahd("notification/3"),
         new ahd("notification/4"),
         new ahd("notification/5"),
         new ahd("notification/more")
      };
      private static final int t = Integer.MAX_VALUE;
      private static final int u = 20;
      private static final int v = 14;
      private int w;

      public g(vd $$0, ahd $$1, ewy.c $$2) {
         super(20, 20, $$0, 14, 14, $$1, $$2);
      }

      int a() {
         return this.w;
      }

      public void a(int $$0) {
         this.w = $$0;
      }

      @Override
      public void b(ewm $$0, int $$1, int $$2, float $$3) {
         super.b($$0, $$1, $$2, $$3);
         if (this.j && this.w != 0) {
            this.a($$0);
         }
      }

      private void a(ewm $$0) {
         $$0.a(d[Math.min(this.w, 6) - 1], this.B() + this.w() - 5, this.C() - 3, 8, 8);
      }
   }

   class h extends eqe.e {
      private static final int c = 40;
      private static final int d = -12303292;
      private final vd e;
      private final int f;
      private final List<eww> g = new ArrayList<>();
      @Nullable
      private final eqe.c h;
      private final exs i;
      private final fah j;
      private final fag k;
      private int l = -1;

      public h(vd $$0, int $$1, eqz $$2) {
         this.e = $$0;
         this.f = $$1;
         this.j = new fah();
         int $$3 = 7;
         this.j.a(exl.a(20, 20, eqe.a), 0, 0, this.j.b().a(7, 7, 0, 0));
         this.j.a(fan.a(40), 0, 0);
         this.k = this.j.a(new fag(0, 9 * 3 * ($$1 - 1)), 0, 1, this.j.b().c(7));
         this.i = this.k.a(new exs($$0, eqe.this.i).b(true), this.k.b().b().d());
         this.j.a(fan.a(40), 0, 2);
         if ($$2.b()) {
            this.h = this.j.a(new eqe.c($$1x -> eqe.this.a($$2.c()), vd.c("mco.notification.dismiss")), 0, 2, this.j.b().c().a(0, 7, 7, 0));
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
      public void b(ewm $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         super.b($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
         $$0.b($$3 - 2, $$2 - 2, $$4, 36 * this.f - 2, -12303292);
      }

      @Override
      public void a(ewm $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
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
      public vd a() {
         return this.e;
      }
   }

   class i extends eqe.e {
      private final era c;
      private final eyj d;

      public i(era $$0) {
         this.c = $$0;
         this.d = eyj.a(vd.c("mco.snapshot.parent.tooltip"));
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         return true;
      }

      @Override
      public void a(ewm $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = this.b($$3);
         int $$11 = this.a($$2);
         etq.a($$0, $$3, $$2, 32, this.c.g);
         vd $$12 = eqe.a(this.c.t, -8355712);
         int $$13 = this.a($$3, $$4, $$12);
         this.a($$0, this.c.b(), $$10, $$11, $$13, -8355712);
         if ($$12 != vc.a) {
            $$0.a(eqe.this.i, $$12, $$13, $$11, -8355712, false);
         }

         $$0.a(eqe.this.i, this.c.a(), $$10, this.c($$11), -8355712, false);
         this.a($$0, $$2, $$3, this.c);
         this.a(this.c, $$0, $$3 + $$4, $$2, $$6, $$7);
         this.d.a($$8, this.aI_(), new fbb($$3, $$2, $$4, $$5));
      }

      @Override
      public vd a() {
         return vd.b(this.c.c);
      }
   }

   class j extends gkb<eqe.e> {
      public j() {
         super(eqe.this.g, eqe.this.h, 0, 36);
      }

      public void a(@Nullable eqe.e $$0) {
         super.a($$0);
         eqe.this.H();
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
      T request(eqj var1) throws erw;
   }

   class l extends eqe.e {
      private static final int c = 36;
      private final era d;
      @Nullable
      private final eyj e;

      public l(era $$0) {
         this.d = $$0;
         boolean $$1 = eqe.this.h($$0);
         if (eqe.b() && $$1 && $$0.h()) {
            this.e = eyj.a(vd.a("mco.snapshot.paired", $$0.s));
         } else if (!$$1 && $$0.e()) {
            this.e = eyj.a(vd.a("mco.snapshot.friendsRealm.upgrade", $$0.f));
         } else if (!$$1 && $$0.f()) {
            this.e = eyj.a(vd.a("mco.snapshot.friendsRealm.downgrade", $$0.t));
         } else {
            this.e = null;
         }
      }

      @Override
      public void a(ewm $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         if (this.d.e == era.c.c) {
            $$0.a(eqe.b, $$3 - 5, $$2 + $$5 / 2 - 10, 40, 20);
            int $$10 = $$2 + $$5 / 2 - 9 / 2;
            $$0.b(eqe.this.i, eqe.F, $$3 + 40 - 2, $$10, 8388479);
         } else {
            etq.a($$0, $$3, $$2, 32, this.d.g);
            this.a($$0, $$2, $$3, $$4);
            this.a($$0, $$2, $$3);
            this.a($$0, $$2, $$3, this.d);
            this.a(this.d, $$0, $$3 + $$4, $$2, $$6, $$7);
            if (this.e != null) {
               this.e.a($$8, this.aI_(), new fbb($$3, $$2, $$4, $$5));
            }
         }
      }

      private void a(ewm $$0, int $$1, int $$2, int $$3) {
         int $$4 = this.b($$2);
         int $$5 = this.a($$1);
         vd $$6 = eqe.a(this.d.t, this.d.d());
         int $$7 = this.a($$2, $$3, $$6);
         this.a($$0, this.d.b(), $$4, $$5, $$7, -1);
         if ($$6 != vc.a) {
            $$0.a(eqe.this.i, $$6, $$7, $$5, -8355712, false);
         }
      }

      private void a(ewm $$0, int $$1, int $$2) {
         int $$3 = this.b($$2);
         int $$4 = this.a($$1);
         int $$5 = this.c($$4);
         if (this.d.m == era.d.b) {
            vd $$6 = vd.b(this.d.c()).a(n.h);
            $$0.a(eqe.this.i, vd.a("mco.selectServer.minigameName", $$6).b(-171), $$3, $$5, -1, false);
         } else {
            $$0.a(eqe.this.i, this.d.a(), $$3, this.c($$4), -8355712, false);
         }
      }

      private void d() {
         eqe.this.f.ah().a(ghi.a(arm.zu, 1.0F));
         eqe.a(this.d, eqe.this);
      }

      private void e() {
         eqe.this.f.ah().a(ghi.a(arm.zu, 1.0F));
         esl $$0 = new esl(eqe.this, this.d);
         eqe.this.f.a($$0);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         if (this.d.e == era.c.c) {
            this.e();
         } else if (eqe.this.a(this.d)) {
            if (ac.b() - eqe.this.aC < 250L && this.aI_()) {
               this.d();
            }

            eqe.this.aC = ac.b();
         }

         return true;
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         if (faw.a($$0)) {
            if (this.d.e == era.c.c) {
               this.e();
               return true;
            }

            if (eqe.this.a(this.d)) {
               this.d();
               return true;
            }
         }

         return super.a($$0, $$1, $$2);
      }

      @Override
      public vd a() {
         return (vd)(this.d.e == era.c.c ? eqe.R : vd.a("narrator.select", this.d.c));
      }

      public era c() {
         return this.d;
      }
   }
}
