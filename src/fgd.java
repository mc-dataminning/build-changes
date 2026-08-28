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

public class fgd extends hky {
   static final aku b = aku.b("icon/info");
   static final aku c = aku.b("icon/new_realm");
   static final aku C = aku.b("realm_status/expired");
   static final aku D = aku.b("realm_status/expires_soon");
   static final aku E = aku.b("realm_status/open");
   static final aku F = aku.b("realm_status/closed");
   private static final aku G = aku.b("icon/invite");
   private static final aku H = aku.b("icon/news");
   public static final aku a = aku.b("hud/heart/hardcore_full");
   static final Logger I = LogUtils.getLogger();
   private static final aku J = aku.b("textures/gui/title/realms.png");
   private static final aku K = aku.b("textures/gui/realms/no_realms.png");
   private static final wo L = wo.c("menu.online");
   private static final wo M = wo.c("mco.selectServer.loading");
   static final wo N = wo.c("mco.selectServer.uninitialized");
   static final wo O = wo.c("mco.selectServer.expiredList");
   private static final wo P = wo.c("mco.selectServer.expiredRenew");
   static final wo Q = wo.c("mco.selectServer.expiredTrial");
   private static final wo R = wo.c("mco.selectServer.play");
   private static final wo S = wo.c("mco.selectServer.leave");
   private static final wo T = wo.c("mco.selectServer.configure");
   static final wo U = wo.c("mco.selectServer.expired");
   static final wo V = wo.c("mco.selectServer.expires.soon");
   static final wo W = wo.c("mco.selectServer.expires.day");
   static final wo X = wo.c("mco.selectServer.open");
   static final wo Y = wo.c("mco.selectServer.closed");
   static final wo Z = wo.a("gui.narrate.button", N);
   private static final wo aa = wo.c("mco.selectServer.noRealms");
   private static final wo ab = wo.c("mco.invites.nopending");
   private static final wo ac = wo.c("mco.invites.pending");
   private static final wo ad = wo.c("mco.compatibility.incompatible.popup.title");
   private static final wo ae = wo.c("mco.compatibility.incompatible.releaseType.popup.message");
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
   private final CompletableFuture<fgc.a> aw = fgc.a();
   @Nullable
   private fjp.c ax;
   private final Set<UUID> ay = new HashSet<>();
   private static boolean az;
   private final RateLimiter aA;
   private final fui aB;
   private fop aC;
   private fop aD;
   private fop aE;
   private fop aF;
   private fop aG;
   fgd.j aH;
   fij aI;
   List<fhj> aJ = List.of();
   fhm aK = new fhm();
   private volatile boolean aL;
   @Nullable
   private volatile String aM;
   long aN;
   final List<fhi> aO = new ArrayList<>();
   private fop aP;
   private fgd.g aQ;
   private fgd.g aR;
   private fgd.f aS;
   @Nullable
   private fse aT;

   public fgd(fui $$0) {
      super(L);
      this.aB = $$0;
      this.aA = RateLimiter.create(0.016666668F);
   }

   @Override
   public void aR_() {
      this.aI = new fij(this.m);
      this.aH = new fgd.j();
      wo $$0 = wo.c("mco.invites.title");
      this.aQ = new fgd.g($$0, G, $$1x -> this.m.a(new fjc(this, $$0)));
      wo $$1 = wo.c("mco.news");
      this.aR = new fgd.g($$1, H, $$0x -> {
         String $$1x = this.aM;
         if ($$1x != null) {
            ftf.a(this, $$1x);
            if (this.aR.a() != 0) {
               fjv.a $$2 = fjv.b();
               $$2.b = false;
               fjv.b($$2);
               this.aR.a(0);
            }
         }
      });
      this.aR.a(fqb.a($$1));
      this.aC = fop.a(R, $$0x -> a(this.O(), this)).a(100).a();
      this.aF = fop.a(T, $$0x -> this.f(this.O())).a(100).a();
      this.aE = fop.a(P, $$0x -> this.e(this.O())).a(100).a();
      this.aG = fop.a(S, $$0x -> this.g(this.O())).a(100).a();
      this.aP = fop.a(wo.c("mco.selectServer.purchase"), $$0x -> this.P()).b(100, 20).a();
      this.aD = fop.a(wn.k, $$0x -> this.aO_()).a(100).a();
      if (fgi.a == fgi.b.b) {
         this.c(fox.a(wo.b("Snapshot"), wo.b("Release")).a(5, 5, 100, 20, wo.b("Realm"), ($$0x, $$1x) -> {
            av = $$1x;
            this.aJ = List.of();
            this.I();
         }));
      }

      this.a(fgd.f.a);
      this.H();
      this.aw.thenAcceptAsync($$0x -> {
         fui $$1x = $$0x.a(this.aB);
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
         this.a(fgd.f.b);
      } else {
         this.a(fgd.f.c);
      }
   }

   private void a(fgd.f $$0) {
      if (this.aS != $$0) {
         if (this.aT != null) {
            this.aT.a($$1 -> this.e($$1));
         }

         this.aT = this.b($$0);
         this.aS = $$0;
         this.aT.a($$1 -> {
            fon var10000 = this.c($$1);
         });
         this.c();
      }
   }

   private fse b(fgd.f $$0) {
      fse $$1 = new fse(this);
      $$1.b(44);
      $$1.a(this.F());
      fsf $$2 = this.c($$0);
      $$2.a();
      $$1.a($$2.y() + 22);
      $$1.b($$2);
      switch ($$0) {
         case a:
            $$1.c(new fpf(this.p, M));
            break;
         case b:
            $$1.c(this.G());
            break;
         case c:
            $$1.c(this.aH);
      }

      return $$1;
   }

   private fsf F() {
      int $$0 = 90;
      fsi $$1 = fsi.e().a(4);
      $$1.c().e();
      $$1.a(this.aQ);
      $$1.a(this.aR);
      fsi $$2 = fsi.e();
      $$2.c().e();
      $$2.a(fsj.a(90));
      $$2.a(fpd.a(128, 34, J, 128, 64), fsh::b);
      $$2.a(new fsc(90, 44)).a($$1, fsh::c);
      return $$2;
   }

   private fsf c(fgd.f $$0) {
      fsd $$1 = new fsd().c(4);
      fsd.b $$2 = $$1.d(3);
      if ($$0 == fgd.f.c) {
         $$2.a(this.aC);
         $$2.a(this.aF);
         $$2.a(this.aE);
         $$2.a(this.aG);
      }

      $$2.a(this.aP);
      $$2.a(this.aD);
      return $$1;
   }

   private fsi G() {
      fsi $$0 = fsi.d().a(8);
      $$0.c().b();
      $$0.a(fpd.a(130, 64, K, 130, 64));
      fpb $$1 = new fpb(308, aa, this.p, false, 4);
      $$0.a($$1);
      return $$0;
   }

   void H() {
      fhj $$0 = this.O();
      this.aP.j = this.aS != fgd.f.a;
      this.aC.j = $$0 != null && this.a($$0);
      this.aE.j = $$0 != null && this.b($$0);
      this.aG.j = $$0 != null && this.d($$0);
      this.aF.j = $$0 != null && this.c($$0);
   }

   boolean a(fhj $$0) {
      boolean $$1 = !$$0.j && $$0.e == fhj.c.b;
      return $$1 && ($$0.d() || $$0.e() || i($$0));
   }

   private boolean b(fhj $$0) {
      return $$0.j && i($$0);
   }

   private boolean c(fhj $$0) {
      return i($$0) && $$0.e != fhj.c.c;
   }

   private boolean d(fhj $$0) {
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
      flh.Q().bb().d.a();
   }

   public static void g() {
      flh.Q().bb().c.a();
   }

   private void I() {
      for (fjp.e<?> $$0 : this.m.bb().a()) {
         $$0.a();
      }
   }

   private fjp.c a(fih $$0) {
      fjp.c $$1 = $$0.a.a();
      $$1.a($$0.c, $$0x -> {
         this.aI.a($$0x.a());
         this.aJ = $$0x.b();
         this.L();
         boolean $$1x = false;

         for (fhj $$2 : this.aI) {
            if (this.j($$2)) {
               $$1x = true;
            }
         }

         if (!az && $$1x) {
            az = true;
            this.M();
         }
      });
      a(fgi::d, $$0x -> {
         this.aO.clear();
         this.aO.addAll($$0x);

         for (fhi $$1x : $$0x) {
            if ($$1x instanceof fhi.a $$2) {
               fps $$3 = $$2.a(this, this::a);
               if ($$3 != null) {
                  this.m.a($$3);
                  this.a(List.of($$1x));
                  break;
               }
            }
         }

         if (!this.aO.isEmpty() && this.aS != fgd.f.a) {
            this.L();
         }
      });
      $$1.a($$0.d, $$0x -> {
         this.aQ.a($$0x);
         this.aQ.a($$0x == 0 ? fqb.a(ab) : fqb.a(ac));
         if ($$0x > 0 && this.aA.tryAcquire(1)) {
            this.m.aY().c(wo.a("mco.configure.world.invite.narration", $$0x));
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

   void a(Collection<fhi> $$0) {
      List<UUID> $$1 = new ArrayList<>($$0.size());

      for (fhi $$2 : $$0) {
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

   private static <T> void a(fgd.k<T> $$0, Consumer<T> $$1) {
      flh $$2 = flh.Q();
      CompletableFuture.<T>supplyAsync(() -> {
         try {
            return $$0.request(fgi.a($$2));
         } catch (fie var3) {
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
         List<fhs> $$0 = fgh.a();
         fgi $$1 = fgi.a();
         fhe $$2 = new fhe();
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

      for (fhj $$1 : this.aI) {
         if (this.j($$1)) {
            $$0.add($$1.a);
         }
      }

      return $$0;
   }

   private void e(@Nullable fhj $$0) {
      if ($$0 != null) {
         String $$1 = axu.a($$0.b, this.m.X().b(), $$0.k);
         this.m.p.a($$1);
         af.m().a($$1);
      }
   }

   private void f(@Nullable fhj $$0) {
      if ($$0 != null && this.m.b($$0.g)) {
         this.m.a(new fis(this, $$0.a));
      }
   }

   private void g(@Nullable fhj $$0) {
      if ($$0 != null && !this.m.b($$0.g)) {
         wo $$1 = wo.c("mco.configure.world.leave.question.line1");
         this.m.a(fje.a(this, $$1, $$1x -> this.h($$0)));
      }
   }

   @Nullable
   private fhj O() {
      return this.aH.p() instanceof fgd.l $$0 ? $$0.c() : null;
   }

   private void h(final fhj $$0) {
      (new Thread("Realms-leave-server") {
         @Override
         public void run() {
            try {
               fgi $$0 = fgi.a();
               $$0.d($$0.a);
               fgd.this.m.execute(fgd::g);
            } catch (fie var2) {
               fgd.I.error("Couldn't configure world", var2);
               fgd.this.m.execute(() -> fgd.this.m.a(new fiw(var2, fgd.this)));
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
   public wo i() {
      return (wo)(switch (this.aS) {
         case a -> wn.a(super.i(), M);
         case b -> wn.a(super.i(), aa);
         case c -> super.i();
      });
   }

   @Override
   public void a(fob $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (b()) {
         $$0.b(this.p, "Minecraft " + ab.b().c(), 2, this.o - 10, -1);
      }

      if (this.aL && this.aP.j) {
         fin.a($$0, this.aP);
      }

      switch (fgi.a) {
         case b:
            this.a($$0, "STAGE!", -256);
            break;
         case c:
            this.a($$0, "LOCAL!", 8388479);
      }
   }

   private void P() {
      this.m.a(new fin(this, this.aL));
   }

   public static void a(@Nullable fhj $$0, fui $$1) {
      a($$0, $$1, false);
   }

   public static void a(@Nullable fhj $$0, fui $$1, boolean $$2) {
      if ($$0 != null) {
         if (!b() || $$2 || $$0.i()) {
            flh.Q().a(new fiy($$1, new fke($$1, $$0)));
            return;
         }

         switch ($$0.w) {
            case f:
               flh.Q().a(new fiy($$1, new fke($$1, $$0)));
               break;
            case a:
               a($$0, $$1, wo.c("mco.compatibility.unverifiable.title").b(-171), wo.c("mco.compatibility.unverifiable.message"), wn.j);
               break;
            case d:
               a(
                  $$0,
                  $$1,
                  wo.c("selectWorld.backupQuestion.downgrade").b(-2142128),
                  wo.a("mco.compatibility.downgrade.description", wo.b($$0.v).b(-171), wo.b(ab.b().c()).b(-171)),
                  wo.c("mco.compatibility.downgrade")
               );
               break;
            case e:
               b($$0, $$1);
               break;
            case b:
               flh.Q()
                  .a(
                     new fps.a($$1, ad)
                        .a(wo.a("mco.compatibility.incompatible.series.popup.message", wo.b($$0.v).b(-171), wo.b(ab.b().c()).b(-171)))
                        .a(wn.k, fps::aO_)
                        .a()
                  );
               break;
            case c:
               flh.Q().a(new fps.a($$1, ad).a(ae).a(wn.k, fps::aO_).a());
         }
      }
   }

   private static void a(fhj $$0, fui $$1, wo $$2, wo $$3, wo $$4) {
      flh.Q().a(new fps.a($$1, $$2).a($$3).a($$4, $$2x -> {
         flh.Q().a(new fiy($$1, new fke($$1, $$0)));
         g();
      }).a(wn.e, fps::aO_).a());
   }

   private static void b(fhj $$0, fui $$1) {
      wo $$2 = wo.c("mco.compatibility.upgrade.title").b(-171);
      wo $$3 = wo.c("mco.compatibility.upgrade");
      wo $$4 = wo.b($$0.v).b(-171);
      wo $$5 = wo.b(ab.b().c()).b(-171);
      wo $$6 = i($$0) ? wo.a("mco.compatibility.upgrade.description", $$4, $$5) : wo.a("mco.compatibility.upgrade.friend.description", $$4, $$5);
      a($$0, $$1, $$2, $$6, $$3);
   }

   public static wo a(String $$0, boolean $$1) {
      return a($$0, $$1 ? -8355712 : -2142128);
   }

   public static wo a(String $$0, int $$1) {
      return (wo)(StringUtils.isBlank($$0) ? wn.a : wo.b($$0).b($$1));
   }

   public static wo a(int $$0, boolean $$1) {
      return (wo)($$1 ? wo.c("gameMode.hardcore").b(-65536) : dgd.a($$0).d());
   }

   static boolean i(fhj $$0) {
      return flh.Q().b($$0.g);
   }

   private boolean j(fhj $$0) {
      return i($$0) && !$$0.j;
   }

   private void a(fob $$0, String $$1, int $$2) {
      $$0.c().a();
      $$0.c().a((float)(this.n / 2 - 25), 20.0F, 0.0F);
      $$0.c().a(a.f.rotationDegrees(-20.0F));
      $$0.c().b(1.5F, 1.5F, 1.5F);
      $$0.b(this.p, $$1, 0, 0, $$2);
      $$0.c().b();
   }

   class a extends fgd.e {
      private static final wo f = wo.c("mco.snapshot.start");
      private static final int g = 5;
      private final fqe h = new fqe();
      private final fhj i;

      public a(final fhj $$0) {
         this.i = $$0;
         this.h.a(fqb.a(wo.c("mco.snapshot.tooltip")));
      }

      @Override
      public void a(fob $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(gmf::H, fgd.c, $$3 - 5, $$2 + $$5 / 2 - 10, 40, 20);
         int $$10 = $$2 + $$5 / 2 - 9 / 2;
         $$0.b(fgd.this.p, f, $$3 + 40 - 2, $$10 - 5, 8388479);
         $$0.b(fgd.this.p, wo.a("mco.snapshot.description", Objects.requireNonNullElse(this.i.c, "unknown server")), $$3 + 40 - 2, $$10 + 5, -8355712);
         this.h.a($$8, this.aM_(), new fsx($$3, $$2, $$4, $$5));
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         this.c();
         return true;
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         if (fss.a($$0)) {
            this.c();
            return true;
         } else {
            return super.a($$0, $$1, $$2);
         }
      }

      private void c() {
         fgd.this.m.ak().a(hie.a(avz.Bf, 1.0F));
         fgd.this.m
            .a(
               new fps.a(fgd.this, wo.c("mco.snapshot.createSnapshotPopup.title"))
                  .a(wo.c("mco.snapshot.createSnapshotPopup.text"))
                  .a(wo.c("mco.selectServer.create"), $$0 -> fgd.this.m.a(new fiu(fgd.this, this.i, true)))
                  .a(wn.e, fps::aO_)
                  .a()
            );
      }

      @Override
      public wo a() {
         return wo.a("gui.narrate.button", wn.a(f, wo.a("mco.snapshot.description", Objects.requireNonNullElse(this.i.c, "unknown server"))));
      }
   }

   class b extends fgd.e {
      private final fop f;

      public b(final fop $$0) {
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
      public void a(fob $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.f.c(fgd.this.n / 2 - 75, $$2 + 4);
         this.f.a($$0, $$6, $$7, $$9);
      }

      @Override
      public void a(boolean $$0) {
         super.a($$0);
         this.f.a($$0);
      }

      @Override
      public wo a() {
         return this.f.B();
      }
   }

   static class c extends fpc {
      private static final fqd b = new fqd(aku.b("widget/cross_button"), aku.b("widget/cross_button_highlighted"));

      protected c(fop.c $$0, wo $$1) {
         super(0, 0, 14, 14, b, $$0);
         this.a(fqb.a($$1));
      }
   }

   class d extends fgd.e {
      @Override
      public void a(fob $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
      }

      @Override
      public wo a() {
         return wo.i();
      }
   }

   abstract class e extends fpm.a<fgd.e> {
      protected static final int b = 10;
      private static final int a = 28;
      protected static final int c = 7;
      protected static final int d = 2;

      protected void a(fhj $$0, fob $$1, int $$2, int $$3, int $$4, int $$5) {
         int $$6 = $$2 - 10 - 7;
         int $$7 = $$3 + 2;
         if ($$0.j) {
            this.a($$1, $$6, $$7, $$4, $$5, fgd.C, () -> fgd.U);
         } else if ($$0.e == fhj.c.a) {
            this.a($$1, $$6, $$7, $$4, $$5, fgd.F, () -> fgd.Y);
         } else if (fgd.i($$0) && $$0.l < 7) {
            this.a($$1, $$6, $$7, $$4, $$5, fgd.D, () -> {
               if ($$0.l <= 0) {
                  return fgd.V;
               } else {
                  return (wo)($$0.l == 1 ? fgd.W : wo.a("mco.selectServer.expires.days", $$0.l));
               }
            });
         } else if ($$0.e == fhj.c.b) {
            this.a($$1, $$6, $$7, $$4, $$5, fgd.E, () -> fgd.X);
         }
      }

      private void a(fob $$0, int $$1, int $$2, int $$3, int $$4, aku $$5, Supplier<wo> $$6) {
         $$0.a(gmf::H, $$5, $$1, $$2, 10, 28);
         if (fgd.this.aH.a_((double)$$3, (double)$$4) && $$3 >= $$1 && $$3 <= $$1 + 10 && $$4 >= $$2 && $$4 <= $$2 + 28) {
            fgd.this.d($$6.get());
         }
      }

      protected void a(fob $$0, int $$1, int $$2, fhj $$3) {
         int $$4 = this.b($$2);
         int $$5 = this.a($$1);
         int $$6 = this.d($$5);
         if (!fgd.i($$3)) {
            $$0.b(fgd.this.p, $$3.f, $$4, this.d($$5), -8355712);
         } else if ($$3.j) {
            wo $$7 = $$3.k ? fgd.Q : fgd.O;
            $$0.b(fgd.this.p, $$7, $$4, $$6, -2142128);
         }
      }

      protected void a(fob $$0, @Nullable String $$1, int $$2, int $$3, int $$4, int $$5) {
         if ($$1 != null) {
            int $$6 = $$4 - $$2;
            if (fgd.this.p.b($$1) > $$6) {
               String $$7 = fgd.this.p.a($$1, $$6 - fgd.this.p.b("... "));
               $$0.b(fgd.this.p, $$7 + "...", $$2, $$3, $$5);
            } else {
               $$0.b(fgd.this.p, $$1, $$2, $$3, $$5);
            }
         }
      }

      protected int a(int $$0, int $$1, wo $$2) {
         return $$0 + $$1 - fgd.this.p.a($$2) - 20;
      }

      protected int b(int $$0, int $$1, wo $$2) {
         return $$0 + $$1 - fgd.this.p.a($$2) - 20;
      }

      protected int a(fhj $$0, fob $$1, int $$2, int $$3, int $$4) {
         boolean $$5 = $$0.n;
         int $$6 = $$0.o;
         int $$7 = $$2;
         if (dgd.c($$6)) {
            wo $$8 = fgd.a($$6, $$5);
            $$7 = this.b($$2, $$3, $$8);
            $$1.b(fgd.this.p, $$8, $$7, this.c($$4), -8355712);
         }

         if ($$5) {
            $$7 -= 10;
            $$1.a(gmf::H, fgd.a, $$7, this.c($$4), 8, 8);
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

   static class g extends fpv.b {
      private static final aku[] d = new aku[]{
         aku.b("notification/1"),
         aku.b("notification/2"),
         aku.b("notification/3"),
         aku.b("notification/4"),
         aku.b("notification/5"),
         aku.b("notification/more")
      };
      private static final int u = Integer.MAX_VALUE;
      private static final int v = 20;
      private static final int w = 14;
      private int x;

      public g(wo $$0, aku $$1, fop.c $$2) {
         super(20, 20, $$0, 14, 14, $$1, $$2, null);
      }

      int a() {
         return this.x;
      }

      public void a(int $$0) {
         this.x = $$0;
      }

      @Override
      public void b(fob $$0, int $$1, int $$2, float $$3) {
         super.b($$0, $$1, $$2, $$3);
         if (this.j && this.x != 0) {
            this.a($$0);
         }
      }

      private void a(fob $$0) {
         $$0.a(gmf::H, d[Math.min(this.x, 6) - 1], this.F() + this.A() - 5, this.G() - 3, 8, 8);
      }
   }

   class h extends fgd.e {
      private static final int f = 40;
      private static final int g = -12303292;
      private final wo h;
      private final int i;
      private final List<fon> j = new ArrayList<>();
      @Nullable
      private final fgd.c k;
      private final fpk l;
      private final fsd m;
      private final fsc n;
      private int o = -1;

      public h(final wo $$0, final int $$1, final fhi $$2) {
         this.h = $$0;
         this.i = $$1;
         this.m = new fsd();
         int $$3 = 7;
         this.m.a(fpd.a(20, 20, fgd.b), 0, 0, this.m.b().a(7, 7, 0, 0));
         this.m.a(fsj.a(40), 0, 0);
         this.n = this.m.a(new fsc(0, 9 * 3 * ($$1 - 1)), 0, 1, this.m.b().c(7));
         this.l = this.n.a(new fpk($$0, fgd.this.p).b(true), this.n.b().b().d());
         this.m.a(fsj.a(40), 0, 2);
         if ($$2.b()) {
            this.k = this.m.a(new fgd.c($$1x -> fgd.this.a($$2.c()), wo.c("mco.notification.dismiss")), 0, 2, this.m.b().c().a(0, 7, 7, 0));
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
      public void b(fob $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         super.b($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
         $$0.b($$3 - 2, $$2 - 2, $$4, 36 * this.i - 2, -12303292);
      }

      @Override
      public void a(fob $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
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
      public wo a() {
         return this.h;
      }
   }

   class i extends fgd.e {
      private final fhj f;
      private final fqe g = new fqe();

      public i(final fhj $$0) {
         this.f = $$0;
         if (!$$0.j) {
            this.g.a(fqb.a(wo.c("mco.snapshot.parent.tooltip")));
         }
      }

      @Override
      public void a(fob $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = this.b($$3);
         int $$11 = this.a($$2);
         fjx.a($$0, $$3, $$2, 32, this.f.g);
         wo $$12 = fgd.a(this.f.v, -8355712);
         int $$13 = this.a($$3, $$4, $$12);
         this.a($$0, this.f.b(), $$10, $$11, $$13, -8355712);
         if ($$12 != wn.a) {
            $$0.b(fgd.this.p, $$12, $$13, $$11, -8355712);
         }

         int $$14 = $$3;
         if (!this.f.i()) {
            $$14 = this.a(this.f, $$0, $$3, $$4, $$11);
         }

         this.a($$0, this.f.a(), $$10, this.c($$11), $$14, -8355712);
         this.a($$0, $$2, $$3, this.f);
         this.a(this.f, $$0, $$3 + $$4, $$2, $$6, $$7);
         this.g.a($$8, this.aM_(), new fsx($$3, $$2, $$4, $$5));
      }

      @Override
      public wo a() {
         return wo.b(Objects.requireNonNullElse(this.f.c, "unknown server"));
      }
   }

   class j extends fpm<fgd.e> {
      public j() {
         super(flh.Q(), fgd.this.n, fgd.this.o, 0, 36);
      }

      public void a(@Nullable fgd.e $$0) {
         super.a($$0);
         fgd.this.H();
      }

      @Override
      public int a() {
         return 300;
      }

      void a(fgd $$0, @Nullable fhj $$1) {
         this.s();

         for (fhi $$2 : fgd.this.aO) {
            if ($$2 instanceof fhi.c $$3) {
               this.a($$3, $$0);
               fgd.this.a(List.of($$2));
               break;
            }
         }

         this.a($$1);
      }

      private void a(@Nullable fhj $$0) {
         for (fhj $$1 : fgd.this.aJ) {
            this.b(fgd.this.new a($$1));
         }

         for (fhj $$2 : fgd.this.aI) {
            fgd.e $$3;
            if (fgd.b() && !$$2.h()) {
               if ($$2.e == fhj.c.c) {
                  continue;
               }

               $$3 = fgd.this.new i($$2);
            } else {
               $$3 = fgd.this.new l($$2);
            }

            this.b($$3);
            if ($$0 != null && $$0.a == $$2.a) {
               this.a($$3);
            }
         }
      }

      private void a(fhi.c $$0, fgd $$1) {
         wo $$2 = $$0.d();
         int $$3 = fgd.this.p.b($$2, 216);
         int $$4 = ayy.e($$3 + 7, 36) - 1;
         this.b(fgd.this.new h($$2, $$4 + 2, $$0));

         for (int $$5 = 0; $$5 < $$4; $$5++) {
            this.b(fgd.this.new d());
         }

         this.b(fgd.this.new b($$0.a($$1)));
      }
   }

   interface k<T> {
      T request(fgi var1) throws fie;
   }

   class l extends fgd.e {
      private static final wo f = wo.c("mco.onlinePlayers");
      private static final int g = 9;
      private static final int h = 36;
      private final fhj i;
      private final fqe j = new fqe();

      public l(final fhj $$0) {
         this.i = $$0;
         boolean $$1 = fgd.i($$0);
         if (fgd.b() && $$1 && $$0.h()) {
            this.j.a(fqb.a(wo.a("mco.snapshot.paired", $$0.u)));
         } else if (!$$1 && $$0.f()) {
            this.j.a(fqb.a(wo.a("mco.snapshot.friendsRealm.downgrade", $$0.v)));
         }
      }

      @Override
      public void a(fob $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         if (this.i.e == fhj.c.c) {
            $$0.a(gmf::H, fgd.c, $$3 - 5, $$2 + $$5 / 2 - 10, 40, 20);
            int $$10 = $$2 + $$5 / 2 - 9 / 2;
            $$0.b(fgd.this.p, fgd.N, $$3 + 40 - 2, $$10, 8388479);
         } else {
            this.a(this.i, $$0, $$3 + 36, $$2, $$6, $$7);
            fjx.a($$0, $$3, $$2, 32, this.i.g);
            this.a($$0, $$2, $$3, $$4);
            this.b($$0, $$2, $$3, $$4);
            this.a($$0, $$2, $$3, this.i);
            boolean $$11 = this.a($$0, $$2, $$3, $$4, $$5, $$6, $$7);
            this.a(this.i, $$0, $$3 + $$4, $$2, $$6, $$7);
            if (!$$11) {
               this.j.a($$8, this.aM_(), new fsx($$3, $$2, $$4, $$5));
            }
         }
      }

      private void a(fob $$0, int $$1, int $$2, int $$3) {
         int $$4 = this.b($$2);
         int $$5 = this.a($$1);
         wo $$6 = fgd.a(this.i.v, this.i.d());
         int $$7 = this.a($$2, $$3, $$6);
         this.a($$0, this.i.b(), $$4, $$5, $$7, -1);
         if ($$6 != wn.a && !this.i.i()) {
            $$0.b(fgd.this.p, $$6, $$7, $$5, -8355712);
         }
      }

      private void b(fob $$0, int $$1, int $$2, int $$3) {
         int $$4 = this.b($$2);
         int $$5 = this.a($$1);
         int $$6 = this.c($$5);
         String $$7 = this.i.c();
         boolean $$8 = this.i.i();
         if ($$8 && $$7 != null) {
            wo $$9 = wo.b($$7).a(n.h);
            $$0.b(fgd.this.p, wo.a("mco.selectServer.minigameName", $$9).b(-171), $$4, $$6, -1);
         } else {
            int $$10 = this.a(this.i, $$0, $$2, $$3, $$5);
            this.a($$0, this.i.a(), $$4, this.c($$5), $$10, -8355712);
         }
      }

      private boolean a(fob $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6) {
         List<ProfileResult> $$7 = fgd.this.aK.a(this.i.a);
         if (!$$7.isEmpty()) {
            int $$8 = $$2 + $$3 - 21;
            int $$9 = $$1 + $$4 - 9 - 2;
            int $$10 = $$8;

            for (int $$11 = 0; $$11 < $$7.size(); $$11++) {
               $$10 -= 9 + ($$11 == 0 ? 0 : 3);
               fpp.a($$0, flh.Q().an().b($$7.get($$11).profile()), $$10, $$9, 9);
            }

            if ($$5 >= $$10 && $$5 <= $$8 && $$6 >= $$9 && $$6 <= $$9 + 9) {
               $$0.a(fgd.this.p, List.of(f), Optional.of(new fwp.a($$7)), $$5, $$6);
               return true;
            }
         }

         return false;
      }

      private void d() {
         fgd.this.m.ak().a(hie.a(avz.Bf, 1.0F));
         fgd.a(this.i, fgd.this);
      }

      private void e() {
         fgd.this.m.ak().a(hie.a(avz.Bf, 1.0F));
         fiu $$0 = new fiu(fgd.this, this.i, this.i.h());
         fgd.this.m.a($$0);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         if (this.i.e == fhj.c.c) {
            this.e();
         } else if (fgd.this.a(this.i)) {
            if (af.c() - fgd.this.aN < 250L && this.aM_()) {
               this.d();
            }

            fgd.this.aN = af.c();
         }

         return true;
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         if (fss.a($$0)) {
            if (this.i.e == fhj.c.c) {
               this.e();
               return true;
            }

            if (fgd.this.a(this.i)) {
               this.d();
               return true;
            }
         }

         return super.a($$0, $$1, $$2);
      }

      @Override
      public wo a() {
         return (wo)(this.i.e == fhj.c.c ? fgd.Z : wo.a("narrator.select", Objects.requireNonNullElse(this.i.c, "unknown server")));
      }

      public fhj c() {
         return this.i;
      }
   }
}
