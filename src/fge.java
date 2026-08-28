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

public class fge extends hld {
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
   private final CompletableFuture<fgd.a> aw = fgd.a();
   @Nullable
   private fjq.c ax;
   private final Set<UUID> ay = new HashSet<>();
   private static boolean az;
   private final RateLimiter aA;
   private final fuk aB;
   private fos aC;
   private fos aD;
   private fos aE;
   private fos aF;
   private fos aG;
   fge.j aH;
   fik aI;
   List<fhk> aJ = List.of();
   fhn aK = new fhn();
   private volatile boolean aL;
   @Nullable
   private volatile String aM;
   long aN;
   final List<fhj> aO = new ArrayList<>();
   private fos aP;
   private fge.g aQ;
   private fge.g aR;
   private fge.f aS;
   @Nullable
   private fsg aT;

   public fge(fuk $$0) {
      super(L);
      this.aB = $$0;
      this.aA = RateLimiter.create(0.016666668F);
   }

   @Override
   public void aR_() {
      this.aI = new fik(this.m);
      this.aH = new fge.j();
      wp $$0 = wp.c("mco.invites.title");
      this.aQ = new fge.g($$0, G, $$1x -> this.m.a(new fjd(this, $$0)));
      wp $$1 = wp.c("mco.news");
      this.aR = new fge.g($$1, H, $$0x -> {
         String $$1x = this.aM;
         if ($$1x != null) {
            fth.a(this, $$1x);
            if (this.aR.a() != 0) {
               fjw.a $$2 = fjw.b();
               $$2.b = false;
               fjw.b($$2);
               this.aR.a(0);
            }
         }
      });
      this.aR.a(fqd.a($$1));
      this.aC = fos.a(R, $$0x -> a(this.O(), this)).a(100).a();
      this.aF = fos.a(T, $$0x -> this.f(this.O())).a(100).a();
      this.aE = fos.a(P, $$0x -> this.e(this.O())).a(100).a();
      this.aG = fos.a(S, $$0x -> this.g(this.O())).a(100).a();
      this.aP = fos.a(wp.c("mco.selectServer.purchase"), $$0x -> this.P()).b(100, 20).a();
      this.aD = fos.a(wo.k, $$0x -> this.aO_()).a(100).a();
      if (fgj.a == fgj.b.b) {
         this.c(foz.a(wp.b("Snapshot"), wp.b("Release")).a(5, 5, 100, 20, wp.b("Realm"), ($$0x, $$1x) -> {
            av = $$1x;
            this.aJ = List.of();
            this.I();
         }));
      }

      this.a(fge.f.a);
      this.H();
      this.aw.thenAcceptAsync($$0x -> {
         fuk $$1x = $$0x.a(this.aB);
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
         this.a(fge.f.b);
      } else {
         this.a(fge.f.c);
      }
   }

   private void a(fge.f $$0) {
      if (this.aS != $$0) {
         if (this.aT != null) {
            this.aT.a($$1 -> this.e($$1));
         }

         this.aT = this.b($$0);
         this.aS = $$0;
         this.aT.a($$1 -> {
            fop var10000 = this.c($$1);
         });
         this.c();
      }
   }

   private fsg b(fge.f $$0) {
      fsg $$1 = new fsg(this);
      $$1.b(44);
      $$1.a(this.F());
      fsh $$2 = this.c($$0);
      $$2.a();
      $$1.a($$2.y() + 22);
      $$1.b($$2);
      switch ($$0) {
         case a:
            $$1.c(new fph(this.p, M));
            break;
         case b:
            $$1.c(this.G());
            break;
         case c:
            $$1.c(this.aH);
      }

      return $$1;
   }

   private fsh F() {
      int $$0 = 90;
      fsk $$1 = fsk.e().a(4);
      $$1.c().e();
      $$1.a(this.aQ);
      $$1.a(this.aR);
      fsk $$2 = fsk.e();
      $$2.c().e();
      $$2.a(fsl.a(90));
      $$2.a(fpf.a(128, 34, J, 128, 64), fsj::b);
      $$2.a(new fse(90, 44)).a($$1, fsj::c);
      return $$2;
   }

   private fsh c(fge.f $$0) {
      fsf $$1 = new fsf().c(4);
      fsf.b $$2 = $$1.d(3);
      if ($$0 == fge.f.c) {
         $$2.a(this.aC);
         $$2.a(this.aF);
         $$2.a(this.aE);
         $$2.a(this.aG);
      }

      $$2.a(this.aP);
      $$2.a(this.aD);
      return $$1;
   }

   private fsk G() {
      fsk $$0 = fsk.d().a(8);
      $$0.c().b();
      $$0.a(fpf.a(130, 64, K, 130, 64));
      fpd $$1 = new fpd(308, aa, this.p, false, 4);
      $$0.a($$1);
      return $$0;
   }

   void H() {
      fhk $$0 = this.O();
      this.aP.j = this.aS != fge.f.a;
      this.aC.j = $$0 != null && this.a($$0);
      this.aE.j = $$0 != null && this.b($$0);
      this.aG.j = $$0 != null && this.d($$0);
      this.aF.j = $$0 != null && this.c($$0);
   }

   boolean a(fhk $$0) {
      boolean $$1 = !$$0.j && $$0.e == fhk.c.b;
      return $$1 && ($$0.d() || $$0.e() || i($$0));
   }

   private boolean b(fhk $$0) {
      return $$0.j && i($$0);
   }

   private boolean c(fhk $$0) {
      return i($$0) && $$0.e != fhk.c.c;
   }

   private boolean d(fhk $$0) {
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
      fli.Q().bb().d.a();
   }

   public static void g() {
      fli.Q().bb().c.a();
   }

   private void I() {
      for (fjq.e<?> $$0 : this.m.bb().a()) {
         $$0.a();
      }
   }

   private fjq.c a(fii $$0) {
      fjq.c $$1 = $$0.a.a();
      $$1.a($$0.c, $$0x -> {
         this.aI.a($$0x.a());
         this.aJ = $$0x.b();
         this.L();
         boolean $$1x = false;

         for (fhk $$2 : this.aI) {
            if (this.j($$2)) {
               $$1x = true;
            }
         }

         if (!az && $$1x) {
            az = true;
            this.M();
         }
      });
      a(fgj::d, $$0x -> {
         this.aO.clear();
         this.aO.addAll($$0x);

         for (fhj $$1x : $$0x) {
            if ($$1x instanceof fhj.a $$2) {
               fpu $$3 = $$2.a(this, this::a);
               if ($$3 != null) {
                  this.m.a($$3);
                  this.a(List.of($$1x));
                  break;
               }
            }
         }

         if (!this.aO.isEmpty() && this.aS != fge.f.a) {
            this.L();
         }
      });
      $$1.a($$0.d, $$0x -> {
         this.aQ.a($$0x);
         this.aQ.a($$0x == 0 ? fqd.a(ab) : fqd.a(ac));
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

   void a(Collection<fhj> $$0) {
      List<UUID> $$1 = new ArrayList<>($$0.size());

      for (fhj $$2 : $$0) {
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

   private static <T> void a(fge.k<T> $$0, Consumer<T> $$1) {
      fli $$2 = fli.Q();
      CompletableFuture.<T>supplyAsync(() -> {
         try {
            return $$0.request(fgj.a($$2));
         } catch (fif var3) {
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
         List<fht> $$0 = fgi.a();
         fgj $$1 = fgj.a();
         fhf $$2 = new fhf();
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

      for (fhk $$1 : this.aI) {
         if (this.j($$1)) {
            $$0.add($$1.a);
         }
      }

      return $$0;
   }

   private void e(@Nullable fhk $$0) {
      if ($$0 != null) {
         String $$1 = axv.a($$0.b, this.m.X().b(), $$0.k);
         this.m.p.a($$1);
         af.m().a($$1);
      }
   }

   private void f(@Nullable fhk $$0) {
      if ($$0 != null && this.m.b($$0.g)) {
         this.m.a(new fit(this, $$0.a));
      }
   }

   private void g(@Nullable fhk $$0) {
      if ($$0 != null && !this.m.b($$0.g)) {
         wp $$1 = wp.c("mco.configure.world.leave.question.line1");
         this.m.a(fjf.a(this, $$1, $$1x -> this.h($$0)));
      }
   }

   @Nullable
   private fhk O() {
      return this.aH.p() instanceof fge.l $$0 ? $$0.c() : null;
   }

   private void h(final fhk $$0) {
      (new Thread("Realms-leave-server") {
         @Override
         public void run() {
            try {
               fgj $$0 = fgj.a();
               $$0.d($$0.a);
               fge.this.m.execute(fge::g);
            } catch (fif var2) {
               fge.I.error("Couldn't configure world", var2);
               fge.this.m.execute(() -> fge.this.m.a(new fix(var2, fge.this)));
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
   public void a(fod $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (b()) {
         $$0.b(this.p, "Minecraft " + ab.b().c(), 2, this.o - 10, -1);
      }

      if (this.aL && this.aP.j) {
         fio.a($$0, this.aP);
      }

      switch (fgj.a) {
         case b:
            this.a($$0, "STAGE!", -256);
            break;
         case c:
            this.a($$0, "LOCAL!", 8388479);
      }
   }

   private void P() {
      this.m.a(new fio(this, this.aL));
   }

   public static void a(@Nullable fhk $$0, fuk $$1) {
      a($$0, $$1, false);
   }

   public static void a(@Nullable fhk $$0, fuk $$1, boolean $$2) {
      if ($$0 != null) {
         if (!b() || $$2 || $$0.i()) {
            fli.Q().a(new fiz($$1, new fkf($$1, $$0)));
            return;
         }

         switch ($$0.w) {
            case f:
               fli.Q().a(new fiz($$1, new fkf($$1, $$0)));
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
               fli.Q()
                  .a(
                     new fpu.a($$1, ad)
                        .a(wp.a("mco.compatibility.incompatible.series.popup.message", wp.b($$0.v).b(-171), wp.b(ab.b().c()).b(-171)))
                        .a(wo.k, fpu::aO_)
                        .a()
                  );
               break;
            case c:
               fli.Q().a(new fpu.a($$1, ad).a(ae).a(wo.k, fpu::aO_).a());
         }
      }
   }

   private static void a(fhk $$0, fuk $$1, wp $$2, wp $$3, wp $$4) {
      fli.Q().a(new fpu.a($$1, $$2).a($$3).a($$4, $$2x -> {
         fli.Q().a(new fiz($$1, new fkf($$1, $$0)));
         g();
      }).a(wo.e, fpu::aO_).a());
   }

   private static void b(fhk $$0, fuk $$1) {
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
      return (wp)($$1 ? wp.c("gameMode.hardcore").b(-65536) : dge.a($$0).d());
   }

   static boolean i(fhk $$0) {
      return fli.Q().b($$0.g);
   }

   private boolean j(fhk $$0) {
      return i($$0) && !$$0.j;
   }

   private void a(fod $$0, String $$1, int $$2) {
      $$0.c().a();
      $$0.c().a((float)(this.n / 2 - 25), 20.0F, 0.0F);
      $$0.c().a(a.f.rotationDegrees(-20.0F));
      $$0.c().b(1.5F, 1.5F, 1.5F);
      $$0.b(this.p, $$1, 0, 0, $$2);
      $$0.c().b();
   }

   class a extends fge.e {
      private static final wp f = wp.c("mco.snapshot.start");
      private static final int g = 5;
      private final fqg h = new fqg();
      private final fhk i;

      public a(final fhk $$0) {
         this.i = $$0;
         this.h.a(fqd.a(wp.c("mco.snapshot.tooltip")));
      }

      @Override
      public void a(fod $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(gmh::H, fge.c, $$3 - 5, $$2 + $$5 / 2 - 10, 40, 20);
         int $$10 = $$2 + $$5 / 2 - 9 / 2;
         $$0.b(fge.this.p, f, $$3 + 40 - 2, $$10 - 5, 8388479);
         $$0.b(fge.this.p, wp.a("mco.snapshot.description", Objects.requireNonNullElse(this.i.c, "unknown server")), $$3 + 40 - 2, $$10 + 5, -8355712);
         this.h.a($$8, this.aM_(), new fsz($$3, $$2, $$4, $$5));
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         this.c();
         return true;
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         if (fsu.a($$0)) {
            this.c();
            return false;
         } else {
            return super.a($$0, $$1, $$2);
         }
      }

      private void c() {
         fge.this.m.ak().a(hij.a(awa.Bf, 1.0F));
         fge.this.m
            .a(
               new fpu.a(fge.this, wp.c("mco.snapshot.createSnapshotPopup.title"))
                  .a(wp.c("mco.snapshot.createSnapshotPopup.text"))
                  .a(wp.c("mco.selectServer.create"), $$0 -> fge.this.m.a(new fiv(fge.this, this.i, true)))
                  .a(wo.e, fpu::aO_)
                  .a()
            );
      }

      @Override
      public wp a() {
         return wp.a("gui.narrate.button", wo.a(f, wp.a("mco.snapshot.description", Objects.requireNonNullElse(this.i.c, "unknown server"))));
      }
   }

   class b extends fge.e {
      private final fos f;

      public b(final fos $$0) {
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
      public void a(fod $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.f.c(fge.this.n / 2 - 75, $$2 + 4);
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

   static class c extends fpe {
      private static final fqf b = new fqf(akv.b("widget/cross_button"), akv.b("widget/cross_button_highlighted"));

      protected c(fos.c $$0, wp $$1) {
         super(0, 0, 14, 14, b, $$0);
         this.a(fqd.a($$1));
      }
   }

   class d extends fge.e {
      @Override
      public void a(fod $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
      }

      @Override
      public wp a() {
         return wp.i();
      }
   }

   abstract class e extends fpo.a<fge.e> {
      protected static final int b = 10;
      private static final int a = 28;
      protected static final int c = 7;
      protected static final int d = 2;

      protected void a(fhk $$0, fod $$1, int $$2, int $$3, int $$4, int $$5) {
         int $$6 = $$2 - 10 - 7;
         int $$7 = $$3 + 2;
         if ($$0.j) {
            this.a($$1, $$6, $$7, $$4, $$5, fge.C, () -> fge.U);
         } else if ($$0.e == fhk.c.a) {
            this.a($$1, $$6, $$7, $$4, $$5, fge.F, () -> fge.Y);
         } else if (fge.i($$0) && $$0.l < 7) {
            this.a($$1, $$6, $$7, $$4, $$5, fge.D, () -> {
               if ($$0.l <= 0) {
                  return fge.V;
               } else {
                  return (wp)($$0.l == 1 ? fge.W : wp.a("mco.selectServer.expires.days", $$0.l));
               }
            });
         } else if ($$0.e == fhk.c.b) {
            this.a($$1, $$6, $$7, $$4, $$5, fge.E, () -> fge.X);
         }
      }

      private void a(fod $$0, int $$1, int $$2, int $$3, int $$4, akv $$5, Supplier<wp> $$6) {
         $$0.a(gmh::H, $$5, $$1, $$2, 10, 28);
         if (fge.this.aH.a_((double)$$3, (double)$$4) && $$3 >= $$1 && $$3 <= $$1 + 10 && $$4 >= $$2 && $$4 <= $$2 + 28) {
            fge.this.d($$6.get());
         }
      }

      protected void a(fod $$0, int $$1, int $$2, fhk $$3) {
         int $$4 = this.b($$2);
         int $$5 = this.a($$1);
         int $$6 = this.d($$5);
         if (!fge.i($$3)) {
            $$0.b(fge.this.p, $$3.f, $$4, this.d($$5), -8355712);
         } else if ($$3.j) {
            wp $$7 = $$3.k ? fge.Q : fge.O;
            $$0.b(fge.this.p, $$7, $$4, $$6, -2142128);
         }
      }

      protected void a(fod $$0, @Nullable String $$1, int $$2, int $$3, int $$4, int $$5) {
         if ($$1 != null) {
            int $$6 = $$4 - $$2;
            if (fge.this.p.b($$1) > $$6) {
               String $$7 = fge.this.p.a($$1, $$6 - fge.this.p.b("... "));
               $$0.b(fge.this.p, $$7 + "...", $$2, $$3, $$5);
            } else {
               $$0.b(fge.this.p, $$1, $$2, $$3, $$5);
            }
         }
      }

      protected int a(int $$0, int $$1, wp $$2) {
         return $$0 + $$1 - fge.this.p.a($$2) - 20;
      }

      protected int b(int $$0, int $$1, wp $$2) {
         return $$0 + $$1 - fge.this.p.a($$2) - 20;
      }

      protected int a(fhk $$0, fod $$1, int $$2, int $$3, int $$4) {
         boolean $$5 = $$0.n;
         int $$6 = $$0.o;
         int $$7 = $$2;
         if (dge.c($$6)) {
            wp $$8 = fge.a($$6, $$5);
            $$7 = this.b($$2, $$3, $$8);
            $$1.b(fge.this.p, $$8, $$7, this.c($$4), -8355712);
         }

         if ($$5) {
            $$7 -= 10;
            $$1.a(gmh::H, fge.a, $$7, this.c($$4), 8, 8);
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

   static class g extends fpx.b {
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

      public g(wp $$0, akv $$1, fos.c $$2) {
         super(20, 20, $$0, 14, 14, $$1, $$2, null);
      }

      int a() {
         return this.x;
      }

      public void a(int $$0) {
         this.x = $$0;
      }

      @Override
      public void b(fod $$0, int $$1, int $$2, float $$3) {
         super.b($$0, $$1, $$2, $$3);
         if (this.j && this.x != 0) {
            this.a($$0);
         }
      }

      private void a(fod $$0) {
         $$0.a(gmh::H, d[Math.min(this.x, 6) - 1], this.F() + this.A() - 5, this.G() - 3, 8, 8);
      }
   }

   class h extends fge.e {
      private static final int f = 40;
      private static final int g = -12303292;
      private final wp h;
      private final int i;
      private final List<fop> j = new ArrayList<>();
      @Nullable
      private final fge.c k;
      private final fpm l;
      private final fsf m;
      private final fse n;
      private int o = -1;

      public h(final wp $$0, final int $$1, final fhj $$2) {
         this.h = $$0;
         this.i = $$1;
         this.m = new fsf();
         int $$3 = 7;
         this.m.a(fpf.a(20, 20, fge.b), 0, 0, this.m.b().a(7, 7, 0, 0));
         this.m.a(fsl.a(40), 0, 0);
         this.n = this.m.a(new fse(0, 9 * 3 * ($$1 - 1)), 0, 1, this.m.b().c(7));
         this.l = this.n.a(new fpm($$0, fge.this.p).b(true), this.n.b().b().d());
         this.m.a(fsl.a(40), 0, 2);
         if ($$2.b()) {
            this.k = this.m.a(new fge.c($$1x -> fge.this.a($$2.c()), wp.c("mco.notification.dismiss")), 0, 2, this.m.b().c().a(0, 7, 7, 0));
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
      public void b(fod $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         super.b($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
         $$0.b($$3 - 2, $$2 - 2, $$4, 36 * this.i - 2, -12303292);
      }

      @Override
      public void a(fod $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
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

   class i extends fge.e {
      private final fhk f;
      private final fqg g = new fqg();

      public i(final fhk $$0) {
         this.f = $$0;
         if (!$$0.j) {
            this.g.a(fqd.a(wp.c("mco.snapshot.parent.tooltip")));
         }
      }

      @Override
      public void a(fod $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = this.b($$3);
         int $$11 = this.a($$2);
         fjy.a($$0, $$3, $$2, 32, this.f.g);
         wp $$12 = fge.a(this.f.v, -8355712);
         int $$13 = this.a($$3, $$4, $$12);
         this.a($$0, this.f.b(), $$10, $$11, $$13, -8355712);
         if ($$12 != wo.a) {
            $$0.b(fge.this.p, $$12, $$13, $$11, -8355712);
         }

         int $$14 = $$3;
         if (!this.f.i()) {
            $$14 = this.a(this.f, $$0, $$3, $$4, $$11);
         }

         this.a($$0, this.f.a(), $$10, this.c($$11), $$14, -8355712);
         this.a($$0, $$2, $$3, this.f);
         this.a(this.f, $$0, $$3 + $$4, $$2, $$6, $$7);
         this.g.a($$8, this.aM_(), new fsz($$3, $$2, $$4, $$5));
      }

      @Override
      public wp a() {
         return wp.b(Objects.requireNonNullElse(this.f.c, "unknown server"));
      }
   }

   class j extends fpo<fge.e> {
      public j() {
         super(fli.Q(), fge.this.n, fge.this.o, 0, 36);
      }

      public void a(@Nullable fge.e $$0) {
         super.a($$0);
         fge.this.H();
      }

      @Override
      public int a() {
         return 300;
      }

      void a(fge $$0, @Nullable fhk $$1) {
         this.s();

         for (fhj $$2 : fge.this.aO) {
            if ($$2 instanceof fhj.c $$3) {
               this.a($$3, $$0);
               fge.this.a(List.of($$2));
               break;
            }
         }

         this.a($$1);
      }

      private void a(@Nullable fhk $$0) {
         for (fhk $$1 : fge.this.aJ) {
            this.b(fge.this.new a($$1));
         }

         for (fhk $$2 : fge.this.aI) {
            fge.e $$3;
            if (fge.b() && !$$2.h()) {
               if ($$2.e == fhk.c.c) {
                  continue;
               }

               $$3 = fge.this.new i($$2);
            } else {
               $$3 = fge.this.new l($$2);
            }

            this.b($$3);
            if ($$0 != null && $$0.a == $$2.a) {
               this.a($$3);
            }
         }
      }

      private void a(fhj.c $$0, fge $$1) {
         wp $$2 = $$0.d();
         int $$3 = fge.this.p.b($$2, 216);
         int $$4 = ayz.e($$3 + 7, 36) - 1;
         this.b(fge.this.new h($$2, $$4 + 2, $$0));

         for (int $$5 = 0; $$5 < $$4; $$5++) {
            this.b(fge.this.new d());
         }

         this.b(fge.this.new b($$0.a($$1)));
      }
   }

   interface k<T> {
      T request(fgj var1) throws fif;
   }

   class l extends fge.e {
      private static final wp f = wp.c("mco.onlinePlayers");
      private static final int g = 9;
      private static final int h = 36;
      private final fhk i;
      private final fqg j = new fqg();

      public l(final fhk $$0) {
         this.i = $$0;
         boolean $$1 = fge.i($$0);
         if (fge.b() && $$1 && $$0.h()) {
            this.j.a(fqd.a(wp.a("mco.snapshot.paired", $$0.u)));
         } else if (!$$1 && $$0.f()) {
            this.j.a(fqd.a(wp.a("mco.snapshot.friendsRealm.downgrade", $$0.v)));
         }
      }

      @Override
      public void a(fod $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         if (this.i.e == fhk.c.c) {
            $$0.a(gmh::H, fge.c, $$3 - 5, $$2 + $$5 / 2 - 10, 40, 20);
            int $$10 = $$2 + $$5 / 2 - 9 / 2;
            $$0.b(fge.this.p, fge.N, $$3 + 40 - 2, $$10, 8388479);
         } else {
            this.a(this.i, $$0, $$3 + 36, $$2, $$6, $$7);
            fjy.a($$0, $$3, $$2, 32, this.i.g);
            this.a($$0, $$2, $$3, $$4);
            this.b($$0, $$2, $$3, $$4);
            this.a($$0, $$2, $$3, this.i);
            boolean $$11 = this.a($$0, $$2, $$3, $$4, $$5, $$6, $$7);
            this.a(this.i, $$0, $$3 + $$4, $$2, $$6, $$7);
            if (!$$11) {
               this.j.a($$8, this.aM_(), new fsz($$3, $$2, $$4, $$5));
            }
         }
      }

      private void a(fod $$0, int $$1, int $$2, int $$3) {
         int $$4 = this.b($$2);
         int $$5 = this.a($$1);
         wp $$6 = fge.a(this.i.v, this.i.d());
         int $$7 = this.a($$2, $$3, $$6);
         this.a($$0, this.i.b(), $$4, $$5, $$7, -1);
         if ($$6 != wo.a && !this.i.i()) {
            $$0.b(fge.this.p, $$6, $$7, $$5, -8355712);
         }
      }

      private void b(fod $$0, int $$1, int $$2, int $$3) {
         int $$4 = this.b($$2);
         int $$5 = this.a($$1);
         int $$6 = this.c($$5);
         String $$7 = this.i.c();
         boolean $$8 = this.i.i();
         if ($$8 && $$7 != null) {
            wp $$9 = wp.b($$7).a(n.h);
            $$0.b(fge.this.p, wp.a("mco.selectServer.minigameName", $$9).b(-171), $$4, $$6, -1);
         } else {
            int $$10 = this.a(this.i, $$0, $$2, $$3, $$5);
            this.a($$0, this.i.a(), $$4, this.c($$5), $$10, -8355712);
         }
      }

      private boolean a(fod $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6) {
         List<ProfileResult> $$7 = fge.this.aK.a(this.i.a);
         if (!$$7.isEmpty()) {
            int $$8 = $$2 + $$3 - 21;
            int $$9 = $$1 + $$4 - 9 - 2;
            int $$10 = $$8;

            for (int $$11 = 0; $$11 < $$7.size(); $$11++) {
               $$10 -= 9 + ($$11 == 0 ? 0 : 3);
               fpr.a($$0, fli.Q().an().b($$7.get($$11).profile()), $$10, $$9, 9);
            }

            if ($$5 >= $$10 && $$5 <= $$8 && $$6 >= $$9 && $$6 <= $$9 + 9) {
               $$0.a(fge.this.p, List.of(f), Optional.of(new fwr.a($$7)), $$5, $$6);
               return true;
            }
         }

         return false;
      }

      private void d() {
         fge.this.m.ak().a(hij.a(awa.Bf, 1.0F));
         fge.a(this.i, fge.this);
      }

      private void e() {
         fge.this.m.ak().a(hij.a(awa.Bf, 1.0F));
         fiv $$0 = new fiv(fge.this, this.i, this.i.h());
         fge.this.m.a($$0);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         if (this.i.e == fhk.c.c) {
            this.e();
         } else if (fge.this.a(this.i)) {
            if (af.c() - fge.this.aN < 250L && this.aM_()) {
               this.d();
            }

            fge.this.aN = af.c();
         }

         return true;
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         if (fsu.a($$0)) {
            if (this.i.e == fhk.c.c) {
               this.e();
               return true;
            }

            if (fge.this.a(this.i)) {
               this.d();
               return true;
            }
         }

         return super.a($$0, $$1, $$2);
      }

      @Override
      public wp a() {
         return (wp)(this.i.e == fhk.c.c ? fge.Z : wp.a("narrator.select", Objects.requireNonNullElse(this.i.c, "unknown server")));
      }

      public fhk c() {
         return this.i;
      }
   }
}
