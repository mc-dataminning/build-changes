import com.google.common.collect.Lists;
import com.google.common.util.concurrent.RateLimiter;
import com.mojang.authlib.yggdrasil.ProfileResult;
import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;

public class fgg extends hlf {
   static final akv b = akv.b("icon/info");
   static final akv c = akv.b("icon/new_realm");
   static final akv C = akv.b("realm_status/expired");
   static final akv D = akv.b("realm_status/expires_soon");
   static final akv E = akv.b("realm_status/open");
   static final akv F = akv.b("realm_status/closed");
   private static final akv G = akv.b("icon/invite");
   private static final akv H = akv.b("icon/news");
   public static final akv a = akv.b("hud/heart/hardcore_full");
   static final Logger I = LogUtils.getLogger();
   private static final akv J = akv.b("textures/gui/title/realms.png");
   private static final akv K = akv.b("textures/gui/realms/no_realms.png");
   private static final wp L = wp.c("menu.online");
   private static final wp M = wp.c("mco.selectServer.loading");
   static final wp N = wp.c("mco.selectServer.uninitialized");
   static final wp O = wp.c("mco.selectServer.expiredList");
   private static final wp P = wp.c("mco.selectServer.expiredRenew");
   static final wp Q = wp.c("mco.selectServer.expiredTrial");
   private static final wp R = wp.c("mco.selectServer.play");
   private static final wp S = wp.c("mco.selectServer.leave");
   private static final wp T = wp.c("mco.selectServer.configure");
   static final wp U = wp.c("mco.selectServer.expired");
   static final wp V = wp.c("mco.selectServer.expires.soon");
   static final wp W = wp.c("mco.selectServer.expires.day");
   static final wp X = wp.c("mco.selectServer.open");
   static final wp Y = wp.c("mco.selectServer.closed");
   static final wp Z = wp.a("gui.narrate.button", N);
   private static final wp aa = wp.c("mco.selectServer.noRealms");
   private static final wp ab = wp.c("mco.invites.nopending");
   private static final wp ac = wp.c("mco.invites.pending");
   private static final wp ad = wp.c("mco.compatibility.incompatible.popup.title");
   private static final wp ae = wp.c("mco.compatibility.incompatible.releaseType.popup.message");
   private static final int af = 100;
   private static final int ag = 3;
   private static final int ah = 4;
   private static final int ai = 308;
   private static final int aj = 128;
   private static final int ak = 34;
   private static final int al = 128;
   private static final int am = 64;
   private static final int an = 5;
   private static final int ao = 44;
   private static final int ap = 11;
   private static final int aq = 40;
   private static final int ar = 20;
   private static final int as = 216;
   private static final int at = 36;
   private static final boolean au = !ab.b().g();
   private static boolean av = au;
   private final CompletableFuture<fgf.a> aw = fgf.a();
   @Nullable
   private fjs.c ax;
   private final Set<UUID> ay = new HashSet<>();
   private static boolean az;
   private final RateLimiter aA;
   private final fum aB;
   private fou aC;
   private fou aD;
   private fou aE;
   private fou aF;
   private fou aG;
   fgg.j aH;
   fim aI;
   List<fhm> aJ = List.of();
   fhp aK = new fhp();
   private volatile boolean aL;
   @Nullable
   private volatile String aM;
   long aN;
   final List<fhl> aO = new ArrayList<>();
   private fou aP;
   private fgg.g aQ;
   private fgg.g aR;
   private fgg.f aS;
   @Nullable
   private fsi aT;

   public fgg(fum $$0) {
      super(L);
      this.aB = $$0;
      this.aA = RateLimiter.create(0.016666668F);
   }

   @Override
   public void aR_() {
      this.aI = new fim(this.m);
      this.aH = new fgg.j();
      wp $$0 = wp.c("mco.invites.title");
      this.aQ = new fgg.g($$0, G, $$1x -> this.m.a(new fjf(this, $$0)));
      wp $$1 = wp.c("mco.news");
      this.aR = new fgg.g($$1, H, $$0x -> {
         String $$1x = this.aM;
         if ($$1x != null) {
            ftj.a(this, $$1x);
            if (this.aR.a() != 0) {
               fjy.a $$2 = fjy.b();
               $$2.b = false;
               fjy.b($$2);
               this.aR.a(0);
            }
         }
      });
      this.aR.a(fqf.a($$1));
      this.aC = fou.a(R, $$0x -> a(this.O(), this)).a(100).a();
      this.aF = fou.a(T, $$0x -> this.f(this.O())).a(100).a();
      this.aE = fou.a(P, $$0x -> this.e(this.O())).a(100).a();
      this.aG = fou.a(S, $$0x -> this.g(this.O())).a(100).a();
      this.aP = fou.a(wp.c("mco.selectServer.purchase"), $$0x -> this.P()).b(100, 20).a();
      this.aD = fou.a(wo.k, $$0x -> this.aO_()).a(100).a();
      if (fgl.a == fgl.b.b) {
         this.c(fpb.a(wp.b("Snapshot"), wp.b("Release")).a(5, 5, 100, 20, wp.b("Realm"), ($$0x, $$1x) -> {
            av = $$1x;
            this.aJ = List.of();
            this.I();
         }));
      }

      this.a(fgg.f.a);
      this.H();
      this.aw.thenAcceptAsync($$0x -> {
         fum $$1x = $$0x.a(this.aB);
         if ($$1x == null) {
            this.ax = this.a(this.m.bb());
         } else {
            this.m.a($$1x);
         }
      }, this.r);
   }

   public static boolean b() {
      return au && av;
   }

   @Override
   protected void c() {
      if (this.aT != null) {
         this.aH.a(this.n, this.aT);
         this.aT.a();
      }
   }

   @Override
   public void aO_() {
      this.m.a(this.aB);
   }

   private void E() {
      if (this.aI.a() && this.aJ.isEmpty() && this.aO.isEmpty()) {
         this.a(fgg.f.b);
      } else {
         this.a(fgg.f.c);
      }
   }

   private void a(fgg.f $$0) {
      if (this.aS != $$0) {
         if (this.aT != null) {
            this.aT.a($$1 -> this.e($$1));
         }

         this.aT = this.b($$0);
         this.aS = $$0;
         this.aT.a($$1 -> {
            fos var10000 = this.c($$1);
         });
         this.c();
      }
   }

   private fsi b(fgg.f $$0) {
      fsi $$1 = new fsi(this);
      $$1.b(44);
      $$1.a(this.F());
      fsj $$2 = this.c($$0);
      $$2.a();
      $$1.a($$2.y() + 22);
      $$1.b($$2);
      switch ($$0) {
         case a:
            $$1.c(new fpj(this.p, M));
            break;
         case b:
            $$1.c(this.G());
            break;
         case c:
            $$1.c(this.aH);
      }

      return $$1;
   }

   private fsj F() {
      int $$0 = 90;
      fsm $$1 = fsm.e().a(4);
      $$1.c().e();
      $$1.a(this.aQ);
      $$1.a(this.aR);
      fsm $$2 = fsm.e();
      $$2.c().e();
      $$2.a(fsn.a(90));
      $$2.a(fph.a(128, 34, J, 128, 64), fsl::b);
      $$2.a(new fsg(90, 44)).a($$1, fsl::c);
      return $$2;
   }

   private fsj c(fgg.f $$0) {
      fsh $$1 = new fsh().c(4);
      fsh.b $$2 = $$1.d(3);
      if ($$0 == fgg.f.c) {
         $$2.a(this.aC);
         $$2.a(this.aF);
         $$2.a(this.aE);
         $$2.a(this.aG);
      }

      $$2.a(this.aP);
      $$2.a(this.aD);
      return $$1;
   }

   private fsm G() {
      fsm $$0 = fsm.d().a(8);
      $$0.c().b();
      $$0.a(fph.a(130, 64, K, 130, 64));
      fpf $$1 = new fpf(308, aa, this.p, false, 4);
      $$0.a($$1);
      return $$0;
   }

   void H() {
      fhm $$0 = this.O();
      this.aP.j = this.aS != fgg.f.a;
      this.aC.j = $$0 != null && this.a($$0);
      this.aE.j = $$0 != null && this.b($$0);
      this.aG.j = $$0 != null && this.d($$0);
      this.aF.j = $$0 != null && this.c($$0);
   }

   boolean a(fhm $$0) {
      boolean $$1 = !$$0.j && $$0.e == fhm.c.b;
      return $$1 && ($$0.d() || $$0.e() || i($$0));
   }

   private boolean b(fhm $$0) {
      return $$0.j && i($$0);
   }

   private boolean c(fhm $$0) {
      return i($$0) && $$0.e != fhm.c.c;
   }

   private boolean d(fhm $$0) {
      return !i($$0);
   }

   @Override
   public void e() {
      super.e();
      if (this.ax != null) {
         this.ax.b();
      }
   }

   public static void f() {
      flk.Q().bb().d.a();
   }

   public static void g() {
      flk.Q().bb().c.a();
   }

   private void I() {
      for (fjs.e<?> $$0 : this.m.bb().a()) {
         $$0.a();
      }
   }

   private fjs.c a(fik $$0) {
      fjs.c $$1 = $$0.a.a();
      $$1.a($$0.c, $$0x -> {
         this.aI.a($$0x.a());
         this.aJ = $$0x.b();
         this.L();
         boolean $$1x = false;

         for (fhm $$2 : this.aI) {
            if (this.j($$2)) {
               $$1x = true;
            }
         }

         if (!az && $$1x) {
            az = true;
            this.M();
         }
      });
      a(fgl::d, $$0x -> {
         this.aO.clear();
         this.aO.addAll($$0x);

         for (fhl $$1x : $$0x) {
            if ($$1x instanceof fhl.a $$2) {
               fpw $$3 = $$2.a(this, this::a);
               if ($$3 != null) {
                  this.m.a($$3);
                  this.a(List.of($$1x));
                  break;
               }
            }
         }

         if (!this.aO.isEmpty() && this.aS != fgg.f.a) {
            this.L();
         }
      });
      $$1.a($$0.d, $$0x -> {
         this.aQ.a($$0x);
         this.aQ.a($$0x == 0 ? fqf.a(ab) : fqf.a(ac));
         if ($$0x > 0 && this.aA.tryAcquire(1)) {
            this.m.aY().c(wp.a("mco.configure.world.invite.narration", $$0x));
         }
      });
      $$1.a($$0.e, $$0x -> this.aL = $$0x);
      $$1.a($$0.g, $$0x -> this.aK = $$0x);
      $$1.a($$0.f, $$1x -> {
         $$0.h.a($$1x);
         this.aM = $$0.h.b();
         this.aR.a($$0.h.a() ? Integer.MAX_VALUE : 0);
      });
      return $$1;
   }

   void a(Collection<fhl> $$0) {
      List<UUID> $$1 = new ArrayList<>($$0.size());

      for (fhl $$2 : $$0) {
         if (!$$2.a() && !this.ay.contains($$2.c())) {
            $$1.add($$2.c());
         }
      }

      if (!$$1.isEmpty()) {
         a($$1x -> {
            $$1x.a($$1);
            return null;
         }, $$1x -> this.ay.addAll($$1));
      }
   }

   private static <T> void a(fgg.k<T> $$0, Consumer<T> $$1) {
      flk $$2 = flk.Q();
      CompletableFuture.<T>supplyAsync(() -> {
         try {
            return $$0.request(fgl.a($$2));
         } catch (fih var3) {
            throw new RuntimeException(var3);
         }
      }).thenAcceptAsync($$1, $$2).exceptionally($$0x -> {
         I.error("Failed to execute call to Realms Service", $$0x);
         return null;
      });
   }

   private void L() {
      this.aH.a(this, this.O());
      this.E();
      this.H();
   }

   private void M() {
      new Thread(() -> {
         List<fhv> $$0 = fgk.a();
         fgl $$1 = fgl.a();
         fhh $$2 = new fhh();
         $$2.a = $$0;
         $$2.b = this.N();

         try {
            $$1.a($$2);
         } catch (Throwable var5) {
            I.warn("Could not send ping result to Realms: ", var5);
         }
      }).start();
   }

   private List<Long> N() {
      List<Long> $$0 = Lists.newArrayList();

      for (fhm $$1 : this.aI) {
         if (this.j($$1)) {
            $$0.add($$1.a);
         }
      }

      return $$0;
   }

   private void e(@Nullable fhm $$0) {
      if ($$0 != null) {
         String $$1 = axv.a($$0.b, this.m.X().b(), $$0.k);
         this.m.p.a($$1);
         af.n().a($$1);
      }
   }

   private void f(@Nullable fhm $$0) {
      if ($$0 != null && this.m.b($$0.g)) {
         this.m.a(new fiv(this, $$0.a));
      }
   }

   private void g(@Nullable fhm $$0) {
      if ($$0 != null && !this.m.b($$0.g)) {
         wp $$1 = wp.c("mco.configure.world.leave.question.line1");
         this.m.a(fjh.a(this, $$1, $$1x -> this.h($$0)));
      }
   }

   @Nullable
   private fhm O() {
      return this.aH.p() instanceof fgg.l $$0 ? $$0.c() : null;
   }

   private void h(final fhm $$0) {
      (new Thread("Realms-leave-server") {
         @Override
         public void run() {
            try {
               fgl $$0 = fgl.a();
               $$0.d($$0.a);
               fgg.this.m.execute(fgg::g);
            } catch (fih var2) {
               fgg.I.error("Couldn't configure world", var2);
               fgg.this.m.execute(() -> fgg.this.m.a(new fiz(var2, fgg.this)));
            }
         }
      }).start();
      this.m.a(this);
   }

   void a(UUID $$0) {
      a($$1 -> {
         $$1.b(List.of($$0));
         return null;
      }, $$1 -> {
         this.aO.removeIf($$1x -> $$1x.b() && $$0.equals($$1x.c()));
         this.L();
      });
   }

   public void h() {
      this.aH.a(null);
      g();
   }

   @Override
   public wp i() {
      return (wp)(switch (this.aS) {
         case a -> wo.a(super.i(), M);
         case b -> wo.a(super.i(), aa);
         case c -> super.i();
      });
   }

   @Override
   public void a(fof $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (b()) {
         $$0.b(this.p, "Minecraft " + ab.b().c(), 2, this.o - 10, -1);
      }

      if (this.aL && this.aP.j) {
         fiq.a($$0, this.aP);
      }

      switch (fgl.a) {
         case b:
            this.a($$0, "STAGE!", -256);
            break;
         case c:
            this.a($$0, "LOCAL!", 8388479);
      }
   }

   private void P() {
      this.m.a(new fiq(this, this.aL));
   }

   public static void a(@Nullable fhm $$0, fum $$1) {
      a($$0, $$1, false);
   }

   public static void a(@Nullable fhm $$0, fum $$1, boolean $$2) {
      if ($$0 != null) {
         if (!b() || $$2 || $$0.i()) {
            flk.Q().a(new fjb($$1, new fkh($$1, $$0)));
            return;
         }

         switch ($$0.w) {
            case f:
               flk.Q().a(new fjb($$1, new fkh($$1, $$0)));
               break;
            case a:
               a($$0, $$1, wp.c("mco.compatibility.unverifiable.title").b(-171), wp.c("mco.compatibility.unverifiable.message"), wo.j);
               break;
            case d:
               a(
                  $$0,
                  $$1,
                  wp.c("selectWorld.backupQuestion.downgrade").b(-2142128),
                  wp.a("mco.compatibility.downgrade.description", wp.b($$0.v).b(-171), wp.b(ab.b().c()).b(-171)),
                  wp.c("mco.compatibility.downgrade")
               );
               break;
            case e:
               b($$0, $$1);
               break;
            case b:
               flk.Q()
                  .a(
                     new fpw.a($$1, ad)
                        .a(wp.a("mco.compatibility.incompatible.series.popup.message", wp.b($$0.v).b(-171), wp.b(ab.b().c()).b(-171)))
                        .a(wo.k, fpw::aO_)
                        .a()
                  );
               break;
            case c:
               flk.Q().a(new fpw.a($$1, ad).a(ae).a(wo.k, fpw::aO_).a());
         }
      }
   }

   private static void a(fhm $$0, fum $$1, wp $$2, wp $$3, wp $$4) {
      flk.Q().a(new fpw.a($$1, $$2).a($$3).a($$4, $$2x -> {
         flk.Q().a(new fjb($$1, new fkh($$1, $$0)));
         g();
      }).a(wo.e, fpw::aO_).a());
   }

   private static void b(fhm $$0, fum $$1) {
      wp $$2 = wp.c("mco.compatibility.upgrade.title").b(-171);
      wp $$3 = wp.c("mco.compatibility.upgrade");
      wp $$4 = wp.b($$0.v).b(-171);
      wp $$5 = wp.b(ab.b().c()).b(-171);
      wp $$6 = i($$0) ? wp.a("mco.compatibility.upgrade.description", $$4, $$5) : wp.a("mco.compatibility.upgrade.friend.description", $$4, $$5);
      a($$0, $$1, $$2, $$6, $$3);
   }

   public static wp a(String $$0, boolean $$1) {
      return a($$0, $$1 ? -8355712 : -2142128);
   }

   public static wp a(String $$0, int $$1) {
      return (wp)(StringUtils.isBlank($$0) ? wo.a : wp.b($$0).b($$1));
   }

   public static wp a(int $$0, boolean $$1) {
      return (wp)($$1 ? wp.c("gameMode.hardcore").b(-65536) : dgg.a($$0).d());
   }

   static boolean i(fhm $$0) {
      return flk.Q().b($$0.g);
   }

   private boolean j(fhm $$0) {
      return i($$0) && !$$0.j;
   }

   private void a(fof $$0, String $$1, int $$2) {
      $$0.c().a();
      $$0.c().a((float)(this.n / 2 - 25), 20.0F, 0.0F);
      $$0.c().a(a.f.rotationDegrees(-20.0F));
      $$0.c().b(1.5F, 1.5F, 1.5F);
      $$0.b(this.p, $$1, 0, 0, $$2);
      $$0.c().b();
   }

   class a extends fgg.e {
      private static final wp f = wp.c("mco.snapshot.start");
      private static final int g = 5;
      private final fqi h = new fqi();
      private final fhm i;

      public a(final fhm $$0) {
         this.i = $$0;
         this.h.a(fqf.a(wp.c("mco.snapshot.tooltip")));
      }

      @Override
      public void a(fof $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(gmj::H, fgg.c, $$3 - 5, $$2 + $$5 / 2 - 10, 40, 20);
         int $$10 = $$2 + $$5 / 2 - 9 / 2;
         $$0.b(fgg.this.p, f, $$3 + 40 - 2, $$10 - 5, 8388479);
         $$0.b(fgg.this.p, wp.a("mco.snapshot.description", Objects.requireNonNullElse(this.i.c, "unknown server")), $$3 + 40 - 2, $$10 + 5, -8355712);
         this.h.a($$8, this.aM_(), new ftb($$3, $$2, $$4, $$5));
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         this.c();
         return true;
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         if (fsw.a($$0)) {
            this.c();
            return false;
         } else {
            return super.a($$0, $$1, $$2);
         }
      }

      private void c() {
         fgg.this.m.ak().a(hil.a(awa.Bf, 1.0F));
         fgg.this.m
            .a(
               new fpw.a(fgg.this, wp.c("mco.snapshot.createSnapshotPopup.title"))
                  .a(wp.c("mco.snapshot.createSnapshotPopup.text"))
                  .a(wp.c("mco.selectServer.create"), $$0 -> fgg.this.m.a(new fix(fgg.this, this.i, true)))
                  .a(wo.e, fpw::aO_)
                  .a()
            );
      }

      @Override
      public wp a() {
         return wp.a("gui.narrate.button", wo.a(f, wp.a("mco.snapshot.description", Objects.requireNonNullElse(this.i.c, "unknown server"))));
      }
   }

   class b extends fgg.e {
      private final fou f;

      public b(final fou $$0) {
         this.f = $$0;
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         this.f.a($$0, $$1, $$2);
         return super.a($$0, $$1, $$2);
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         return this.f.a($$0, $$1, $$2) ? true : super.a($$0, $$1, $$2);
      }

      @Override
      public void a(fof $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.f.c(fgg.this.n / 2 - 75, $$2 + 4);
         this.f.a($$0, $$6, $$7, $$9);
      }

      @Override
      public void a(boolean $$0) {
         super.a($$0);
         this.f.a($$0);
      }

      @Override
      public wp a() {
         return this.f.B();
      }
   }

   static class c extends fpg {
      private static final fqh b = new fqh(akv.b("widget/cross_button"), akv.b("widget/cross_button_highlighted"));

      protected c(fou.c $$0, wp $$1) {
         super(0, 0, 14, 14, b, $$0);
         this.a(fqf.a($$1));
      }
   }

   class d extends fgg.e {
      @Override
      public void a(fof $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
      }

      @Override
      public wp a() {
         return wp.i();
      }
   }

   abstract class e extends fpq.a<fgg.e> {
      protected static final int b = 10;
      private static final int a = 28;
      protected static final int c = 7;
      protected static final int d = 2;

      protected void a(fhm $$0, fof $$1, int $$2, int $$3, int $$4, int $$5) {
         int $$6 = $$2 - 10 - 7;
         int $$7 = $$3 + 2;
         if ($$0.j) {
            this.a($$1, $$6, $$7, $$4, $$5, fgg.C, () -> fgg.U);
         } else if ($$0.e == fhm.c.a) {
            this.a($$1, $$6, $$7, $$4, $$5, fgg.F, () -> fgg.Y);
         } else if (fgg.i($$0) && $$0.l < 7) {
            this.a($$1, $$6, $$7, $$4, $$5, fgg.D, () -> {
               if ($$0.l <= 0) {
                  return fgg.V;
               } else {
                  return (wp)($$0.l == 1 ? fgg.W : wp.a("mco.selectServer.expires.days", $$0.l));
               }
            });
         } else if ($$0.e == fhm.c.b) {
            this.a($$1, $$6, $$7, $$4, $$5, fgg.E, () -> fgg.X);
         }
      }

      private void a(fof $$0, int $$1, int $$2, int $$3, int $$4, akv $$5, Supplier<wp> $$6) {
         $$0.a(gmj::H, $$5, $$1, $$2, 10, 28);
         if (fgg.this.aH.a_((double)$$3, (double)$$4) && $$3 >= $$1 && $$3 <= $$1 + 10 && $$4 >= $$2 && $$4 <= $$2 + 28) {
            fgg.this.d($$6.get());
         }
      }

      protected void a(fof $$0, int $$1, int $$2, fhm $$3) {
         int $$4 = this.b($$2);
         int $$5 = this.a($$1);
         int $$6 = this.d($$5);
         if (!fgg.i($$3)) {
            $$0.b(fgg.this.p, $$3.f, $$4, this.d($$5), -8355712);
         } else if ($$3.j) {
            wp $$7 = $$3.k ? fgg.Q : fgg.O;
            $$0.b(fgg.this.p, $$7, $$4, $$6, -2142128);
         }
      }

      protected void a(fof $$0, @Nullable String $$1, int $$2, int $$3, int $$4, int $$5) {
         if ($$1 != null) {
            int $$6 = $$4 - $$2;
            if (fgg.this.p.b($$1) > $$6) {
               String $$7 = fgg.this.p.a($$1, $$6 - fgg.this.p.b("... "));
               $$0.b(fgg.this.p, $$7 + "...", $$2, $$3, $$5);
            } else {
               $$0.b(fgg.this.p, $$1, $$2, $$3, $$5);
            }
         }
      }

      protected int a(int $$0, int $$1, wp $$2) {
         return $$0 + $$1 - fgg.this.p.a($$2) - 20;
      }

      protected int b(int $$0, int $$1, wp $$2) {
         return $$0 + $$1 - fgg.this.p.a($$2) - 20;
      }

      protected int a(fhm $$0, fof $$1, int $$2, int $$3, int $$4) {
         boolean $$5 = $$0.n;
         int $$6 = $$0.o;
         int $$7 = $$2;
         if (dgg.c($$6)) {
            wp $$8 = fgg.a($$6, $$5);
            $$7 = this.b($$2, $$3, $$8);
            $$1.b(fgg.this.p, $$8, $$7, this.c($$4), -8355712);
         }

         if ($$5) {
            $$7 -= 10;
            $$1.a(gmj::H, fgg.a, $$7, this.c($$4), 8, 8);
         }

         return $$7;
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

   static class g extends fpz.b {
      private static final akv[] d = new akv[]{
         akv.b("notification/1"),
         akv.b("notification/2"),
         akv.b("notification/3"),
         akv.b("notification/4"),
         akv.b("notification/5"),
         akv.b("notification/more")
      };
      private static final int u = Integer.MAX_VALUE;
      private static final int v = 20;
      private static final int w = 14;
      private int x;

      public g(wp $$0, akv $$1, fou.c $$2) {
         super(20, 20, $$0, 14, 14, $$1, $$2, null);
      }

      int a() {
         return this.x;
      }

      public void a(int $$0) {
         this.x = $$0;
      }

      @Override
      public void b(fof $$0, int $$1, int $$2, float $$3) {
         super.b($$0, $$1, $$2, $$3);
         if (this.j && this.x != 0) {
            this.a($$0);
         }
      }

      private void a(fof $$0) {
         $$0.a(gmj::H, d[Math.min(this.x, 6) - 1], this.F() + this.A() - 5, this.G() - 3, 8, 8);
      }
   }

   class h extends fgg.e {
      private static final int f = 40;
      private static final int g = -12303292;
      private final wp h;
      private final int i;
      private final List<fos> j = new ArrayList<>();
      @Nullable
      private final fgg.c k;
      private final fpo l;
      private final fsh m;
      private final fsg n;
      private int o = -1;

      public h(final wp $$0, final int $$1, final fhl $$2) {
         this.h = $$0;
         this.i = $$1;
         this.m = new fsh();
         int $$3 = 7;
         this.m.a(fph.a(20, 20, fgg.b), 0, 0, this.m.b().a(7, 7, 0, 0));
         this.m.a(fsn.a(40), 0, 0);
         this.n = this.m.a(new fsg(0, 9 * 3 * ($$1 - 1)), 0, 1, this.m.b().c(7));
         this.l = this.n.a(new fpo($$0, fgg.this.p).b(true), this.n.b().b().d());
         this.m.a(fsn.a(40), 0, 2);
         if ($$2.b()) {
            this.k = this.m.a(new fgg.c($$1x -> fgg.this.a($$2.c()), wp.c("mco.notification.dismiss")), 0, 2, this.m.b().c().a(0, 7, 7, 0));
         } else {
            this.k = null;
         }

         this.m.a(this.j::add);
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         return this.k != null && this.k.a($$0, $$1, $$2) ? true : super.a($$0, $$1, $$2);
      }

      private void e(int $$0) {
         if (this.o != $$0) {
            this.f($$0);
            this.o = $$0;
         }
      }

      private void f(int $$0) {
         int $$1 = $$0 - 80;
         this.n.b($$1);
         this.l.d($$1);
         this.m.a();
      }

      @Override
      public void b(fof $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         super.b($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
         $$0.b($$3 - 2, $$2 - 2, $$4, 36 * this.i - 2, -12303292);
      }

      @Override
      public void a(fof $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.m.c($$3, $$2);
         this.e($$4 - 4);
         this.j.forEach($$4x -> $$4x.a($$0, $$6, $$7, $$9));
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         if (this.k != null) {
            this.k.a($$0, $$1, $$2);
         }

         return super.a($$0, $$1, $$2);
      }

      @Override
      public wp a() {
         return this.h;
      }
   }

   class i extends fgg.e {
      private final fhm f;
      private final fqi g = new fqi();

      public i(final fhm $$0) {
         this.f = $$0;
         if (!$$0.j) {
            this.g.a(fqf.a(wp.c("mco.snapshot.parent.tooltip")));
         }
      }

      @Override
      public void a(fof $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = this.b($$3);
         int $$11 = this.a($$2);
         fka.a($$0, $$3, $$2, 32, this.f.g);
         wp $$12 = fgg.a(this.f.v, -8355712);
         int $$13 = this.a($$3, $$4, $$12);
         this.a($$0, this.f.b(), $$10, $$11, $$13, -8355712);
         if ($$12 != wo.a) {
            $$0.b(fgg.this.p, $$12, $$13, $$11, -8355712);
         }

         int $$14 = $$3;
         if (!this.f.i()) {
            $$14 = this.a(this.f, $$0, $$3, $$4, $$11);
         }

         this.a($$0, this.f.a(), $$10, this.c($$11), $$14, -8355712);
         this.a($$0, $$2, $$3, this.f);
         this.a(this.f, $$0, $$3 + $$4, $$2, $$6, $$7);
         this.g.a($$8, this.aM_(), new ftb($$3, $$2, $$4, $$5));
      }

      @Override
      public wp a() {
         return wp.b(Objects.requireNonNullElse(this.f.c, "unknown server"));
      }
   }

   class j extends fpq<fgg.e> {
      public j() {
         super(flk.Q(), fgg.this.n, fgg.this.o, 0, 36);
      }

      public void a(@Nullable fgg.e $$0) {
         super.a($$0);
         fgg.this.H();
      }

      @Override
      public int a() {
         return 300;
      }

      void a(fgg $$0, @Nullable fhm $$1) {
         this.s();

         for (fhl $$2 : fgg.this.aO) {
            if ($$2 instanceof fhl.c $$3) {
               this.a($$3, $$0);
               fgg.this.a(List.of($$2));
               break;
            }
         }

         this.a($$1);
      }

      private void a(@Nullable fhm $$0) {
         for (fhm $$1 : fgg.this.aJ) {
            this.b(fgg.this.new a($$1));
         }

         for (fhm $$2 : fgg.this.aI) {
            fgg.e $$3;
            if (fgg.b() && !$$2.h()) {
               if ($$2.e == fhm.c.c) {
                  continue;
               }

               $$3 = fgg.this.new i($$2);
            } else {
               $$3 = fgg.this.new l($$2);
            }

            this.b($$3);
            if ($$0 != null && $$0.a == $$2.a) {
               this.a($$3);
            }
         }
      }

      private void a(fhl.c $$0, fgg $$1) {
         wp $$2 = $$0.d();
         int $$3 = fgg.this.p.b($$2, 216);
         int $$4 = ayz.e($$3 + 7, 36) - 1;
         this.b(fgg.this.new h($$2, $$4 + 2, $$0));

         for (int $$5 = 0; $$5 < $$4; $$5++) {
            this.b(fgg.this.new d());
         }

         this.b(fgg.this.new b($$0.a($$1)));
      }
   }

   interface k<T> {
      T request(fgl var1) throws fih;
   }

   class l extends fgg.e {
      private static final wp f = wp.c("mco.onlinePlayers");
      private static final int g = 9;
      private static final int h = 36;
      private final fhm i;
      private final fqi j = new fqi();

      public l(final fhm $$0) {
         this.i = $$0;
         boolean $$1 = fgg.i($$0);
         if (fgg.b() && $$1 && $$0.h()) {
            this.j.a(fqf.a(wp.a("mco.snapshot.paired", $$0.u)));
         } else if (!$$1 && $$0.f()) {
            this.j.a(fqf.a(wp.a("mco.snapshot.friendsRealm.downgrade", $$0.v)));
         }
      }

      @Override
      public void a(fof $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         if (this.i.e == fhm.c.c) {
            $$0.a(gmj::H, fgg.c, $$3 - 5, $$2 + $$5 / 2 - 10, 40, 20);
            int $$10 = $$2 + $$5 / 2 - 9 / 2;
            $$0.b(fgg.this.p, fgg.N, $$3 + 40 - 2, $$10, 8388479);
         } else {
            this.a(this.i, $$0, $$3 + 36, $$2, $$6, $$7);
            fka.a($$0, $$3, $$2, 32, this.i.g);
            this.a($$0, $$2, $$3, $$4);
            this.b($$0, $$2, $$3, $$4);
            this.a($$0, $$2, $$3, this.i);
            boolean $$11 = this.a($$0, $$2, $$3, $$4, $$5, $$6, $$7);
            this.a(this.i, $$0, $$3 + $$4, $$2, $$6, $$7);
            if (!$$11) {
               this.j.a($$8, this.aM_(), new ftb($$3, $$2, $$4, $$5));
            }
         }
      }

      private void a(fof $$0, int $$1, int $$2, int $$3) {
         int $$4 = this.b($$2);
         int $$5 = this.a($$1);
         wp $$6 = fgg.a(this.i.v, this.i.d());
         int $$7 = this.a($$2, $$3, $$6);
         this.a($$0, this.i.b(), $$4, $$5, $$7, -1);
         if ($$6 != wo.a && !this.i.i()) {
            $$0.b(fgg.this.p, $$6, $$7, $$5, -8355712);
         }
      }

      private void b(fof $$0, int $$1, int $$2, int $$3) {
         int $$4 = this.b($$2);
         int $$5 = this.a($$1);
         int $$6 = this.c($$5);
         String $$7 = this.i.c();
         boolean $$8 = this.i.i();
         if ($$8 && $$7 != null) {
            wp $$9 = wp.b($$7).a(n.h);
            $$0.b(fgg.this.p, wp.a("mco.selectServer.minigameName", $$9).b(-171), $$4, $$6, -1);
         } else {
            int $$10 = this.a(this.i, $$0, $$2, $$3, $$5);
            this.a($$0, this.i.a(), $$4, this.c($$5), $$10, -8355712);
         }
      }

      private boolean a(fof $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6) {
         List<ProfileResult> $$7 = fgg.this.aK.a(this.i.a);
         if (!$$7.isEmpty()) {
            int $$8 = $$2 + $$3 - 21;
            int $$9 = $$1 + $$4 - 9 - 2;
            int $$10 = $$8;

            for (int $$11 = 0; $$11 < $$7.size(); $$11++) {
               $$10 -= 9 + ($$11 == 0 ? 0 : 3);
               fpt.a($$0, flk.Q().an().b($$7.get($$11).profile()), $$10, $$9, 9);
            }

            if ($$5 >= $$10 && $$5 <= $$8 && $$6 >= $$9 && $$6 <= $$9 + 9) {
               $$0.a(fgg.this.p, List.of(f), Optional.of(new fwt.a($$7)), $$5, $$6);
               return true;
            }
         }

         return false;
      }

      private void d() {
         fgg.this.m.ak().a(hil.a(awa.Bf, 1.0F));
         fgg.a(this.i, fgg.this);
      }

      private void e() {
         fgg.this.m.ak().a(hil.a(awa.Bf, 1.0F));
         fix $$0 = new fix(fgg.this, this.i, this.i.h());
         fgg.this.m.a($$0);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         if (this.i.e == fhm.c.c) {
            this.e();
         } else if (fgg.this.a(this.i)) {
            if (af.c() - fgg.this.aN < 250L && this.aM_()) {
               this.d();
            }

            fgg.this.aN = af.c();
         }

         return true;
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         if (fsw.a($$0)) {
            if (this.i.e == fhm.c.c) {
               this.e();
               return true;
            }

            if (fgg.this.a(this.i)) {
               this.d();
               return true;
            }
         }

         return super.a($$0, $$1, $$2);
      }

      @Override
      public wp a() {
         return (wp)(this.i.e == fhm.c.c ? fgg.Z : wp.a("narrator.select", Objects.requireNonNullElse(this.i.c, "unknown server")));
      }

      public fhm c() {
         return this.i;
      }
   }
}
