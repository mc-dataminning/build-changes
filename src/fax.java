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

public class fax extends gvs {
   static final akk a = new akk("icon/info");
   static final akk b = new akk("icon/new_realm");
   static final akk c = new akk("realm_status/expired");
   static final akk A = new akk("realm_status/expires_soon");
   static final akk B = new akk("realm_status/open");
   static final akk C = new akk("realm_status/closed");
   private static final akk D = new akk("icon/invite");
   private static final akk E = new akk("icon/news");
   static final Logger F = LogUtils.getLogger();
   private static final akk G = new akk("textures/gui/title/realms.png");
   private static final akk H = new akk("textures/gui/realms/no_realms.png");
   private static final wu I = wu.c("menu.online");
   private static final wu J = wu.c("mco.selectServer.loading");
   static final wu K = wu.c("mco.selectServer.uninitialized");
   static final wu L = wu.c("mco.selectServer.expiredList");
   private static final wu M = wu.c("mco.selectServer.expiredRenew");
   static final wu N = wu.c("mco.selectServer.expiredTrial");
   private static final wu O = wu.c("mco.selectServer.play");
   private static final wu P = wu.c("mco.selectServer.leave");
   private static final wu Q = wu.c("mco.selectServer.configure");
   static final wu R = wu.c("mco.selectServer.expired");
   static final wu S = wu.c("mco.selectServer.expires.soon");
   static final wu T = wu.c("mco.selectServer.expires.day");
   static final wu U = wu.c("mco.selectServer.open");
   static final wu V = wu.c("mco.selectServer.closed");
   static final wu W = wu.a("gui.narrate.button", K);
   private static final wu X = wu.c("mco.selectServer.noRealms");
   private static final wu Y = wu.c("mco.invites.nopending");
   private static final wu Z = wu.c("mco.invites.pending");
   private static final wu aa = wu.c("mco.compatibility.incompatible.popup.title");
   private static final wu ab = wu.c("mco.compatibility.incompatible.releaseType.popup.message");
   private static final int ac = 100;
   private static final int ad = 3;
   private static final int ae = 4;
   private static final int af = 308;
   private static final int ag = 128;
   private static final int ah = 34;
   private static final int ai = 128;
   private static final int aj = 64;
   private static final int ak = 5;
   private static final int al = 44;
   private static final int am = 11;
   private static final int an = 40;
   private static final int ao = 20;
   private static final int ap = 216;
   private static final int aq = 36;
   private static final boolean ar = !aa.b().g();
   private static boolean as = ar;
   private final CompletableFuture<faw.a> at = faw.a();
   @Nullable
   private feb.c au;
   private final Set<UUID> av = new HashSet<>();
   private static boolean aw;
   private final RateLimiter ax;
   private final fnj ay;
   private fhs az;
   private fhs aA;
   private fhs aB;
   private fhs aC;
   private fhs aD;
   fax.j aE;
   private fcu aF;
   private List<fbt> aG = List.of();
   private volatile boolean aH;
   @Nullable
   private volatile String aI;
   long aJ;
   private final List<fbs> aK = new ArrayList<>();
   private fhs aL;
   private fax.g aM;
   private fax.g aN;
   private fax.f aO;
   @Nullable
   private flf aP;

   public fax(fnj $$0) {
      super(I);
      this.ay = $$0;
      this.ax = RateLimiter.create(0.016666668F);
   }

   @Override
   public void aP_() {
      this.aF = new fcu(this.l);
      this.aE = new fax.j();
      wu $$0 = wu.c("mco.invites.title");
      this.aM = new fax.g($$0, D, $$1x -> this.l.a(new fdn(this, $$0)));
      wu $$1 = wu.c("mco.news");
      this.aN = new fax.g($$1, E, $$0x -> {
         String $$1x = this.aI;
         if ($$1x != null) {
            fmg.a(this, $$1x);
            if (this.aN.a() != 0) {
               feh.a $$2 = feh.b();
               $$2.b = false;
               feh.b($$2);
               this.aN.a(0);
            }
         }
      });
      this.aN.a(fjd.a($$1));
      this.az = fhs.a(O, $$0x -> a(this.O(), this)).a(100).a();
      this.aC = fhs.a(Q, $$0x -> this.f(this.O())).a(100).a();
      this.aB = fhs.a(M, $$0x -> this.e(this.O())).a(100).a();
      this.aD = fhs.a(P, $$0x -> this.g(this.O())).a(100).a();
      this.aL = fhs.a(wu.c("mco.selectServer.purchase"), $$0x -> this.P()).b(100, 20).a();
      this.aA = fhs.a(wt.k, $$0x -> this.d()).a(100).a();
      if (fbc.a == fbc.b.b) {
         this.c(fhz.a(wu.b("Snapshot"), wu.b("Release")).a(5, 5, 100, 20, wu.b("Realm"), ($$0x, $$1x) -> {
            as = $$1x;
            this.aG = List.of();
            this.K();
         }));
      }

      this.a(fax.f.a);
      this.J();
      this.at.thenAcceptAsync($$0x -> {
         fnj $$1x = $$0x.a(this.ay);
         if ($$1x == null) {
            this.au = this.a(this.l.ba());
         } else {
            this.l.a($$1x);
         }
      }, this.p);
   }

   public static boolean b() {
      return ar && as;
   }

   @Override
   protected void c() {
      if (this.aP != null) {
         this.aE.a(this.m, this.aP);
         this.aP.a();
      }
   }

   @Override
   public void d() {
      this.l.a(this.ay);
   }

   private void E() {
      if (this.aF.a() && this.aG.isEmpty() && this.aK.isEmpty()) {
         this.a(fax.f.b);
      } else {
         this.a(fax.f.c);
      }
   }

   private void a(fax.f $$0) {
      if (this.aO != $$0) {
         if (this.aP != null) {
            this.aP.a($$1 -> this.e($$1));
         }

         this.aP = this.b($$0);
         this.aO = $$0;
         this.aP.a($$1 -> {
            fhq var10000 = this.c($$1);
         });
         this.c();
      }
   }

   private flf b(fax.f $$0) {
      flf $$1 = new flf(this);
      $$1.b(44);
      $$1.a(this.F());
      flg $$2 = this.c($$0);
      $$2.a();
      $$1.a($$2.w() + 22);
      $$1.b($$2);
      switch ($$0) {
         case a:
            $$1.c(new fih(this.o, J));
            break;
         case b:
            $$1.c(this.G());
            break;
         case c:
            $$1.c(this.aE);
      }

      return $$1;
   }

   private flg F() {
      int $$0 = 90;
      flj $$1 = flj.e().a(4);
      $$1.c().e();
      $$1.a(this.aM);
      $$1.a(this.aN);
      flj $$2 = flj.e();
      $$2.c().e();
      $$2.a(flk.a(90));
      $$2.a(fif.a(128, 34, G, 128, 64), fli::b);
      $$2.a(new fld(90, 44)).a($$1, fli::c);
      return $$2;
   }

   private flg c(fax.f $$0) {
      fle $$1 = new fle().c(4);
      fle.b $$2 = $$1.d(3);
      if ($$0 == fax.f.c) {
         $$2.a(this.az);
         $$2.a(this.aC);
         $$2.a(this.aB);
         $$2.a(this.aD);
      }

      $$2.a(this.aL);
      $$2.a(this.aA);
      return $$1;
   }

   private flj G() {
      flj $$0 = flj.d().a(8);
      $$0.c().b();
      $$0.a(fif.a(130, 64, H, 130, 64));
      fid $$1 = new fid(308, X, this.o, false, 4);
      $$0.a($$1);
      return $$0;
   }

   void J() {
      fbt $$0 = this.O();
      this.aL.j = this.aO != fax.f.a;
      this.az.j = $$0 != null && this.a($$0);
      this.aB.j = $$0 != null && this.b($$0);
      this.aD.j = $$0 != null && this.d($$0);
      this.aC.j = $$0 != null && this.c($$0);
   }

   boolean a(fbt $$0) {
      boolean $$1 = !$$0.j && $$0.e == fbt.c.b;
      return $$1 && ($$0.d() || this.i($$0));
   }

   private boolean b(fbt $$0) {
      return $$0.j && this.i($$0);
   }

   private boolean c(fbt $$0) {
      return this.i($$0) && $$0.e != fbt.c.c;
   }

   private boolean d(fbt $$0) {
      return !this.i($$0);
   }

   @Override
   public void e() {
      super.e();
      if (this.au != null) {
         this.au.b();
      }
   }

   public static void f() {
      fft.Q().ba().d.a();
   }

   public static void g() {
      fft.Q().ba().c.a();
   }

   private void K() {
      for (feb.e<?> $$0 : this.l.ba().a()) {
         $$0.a();
      }
   }

   private feb.c a(fcs $$0) {
      feb.c $$1 = $$0.a.a();
      $$1.a($$0.c, $$0x -> {
         this.aF.a($$0x.a());
         this.aG = $$0x.b();
         this.L();
         boolean $$1x = false;

         for (fbt $$2 : this.aF) {
            if (this.j($$2)) {
               $$1x = true;
            }
         }

         if (!aw && $$1x) {
            aw = true;
            this.M();
         }
      });
      a(fbc::d, $$0x -> {
         this.aK.clear();
         this.aK.addAll($$0x);

         for (fbs $$1x : $$0x) {
            if ($$1x instanceof fbs.a $$2) {
               fiu $$3 = $$2.a(this, this::a);
               if ($$3 != null) {
                  this.l.a($$3);
                  this.a(List.of($$1x));
                  break;
               }
            }
         }

         if (!this.aK.isEmpty() && this.aO != fax.f.a) {
            this.L();
         }
      });
      $$1.a($$0.d, $$0x -> {
         this.aM.a($$0x);
         this.aM.a($$0x == 0 ? fjd.a(Y) : fjd.a(Z));
         if ($$0x > 0 && this.ax.tryAcquire(1)) {
            this.l.aX().c(wu.a("mco.configure.world.invite.narration", $$0x));
         }
      });
      $$1.a($$0.e, $$0x -> this.aH = $$0x);
      $$1.a($$0.f, $$1x -> {
         $$0.g.a($$1x);
         this.aI = $$0.g.b();
         this.aN.a($$0.g.a() ? Integer.MAX_VALUE : 0);
      });
      return $$1;
   }

   private void a(Collection<fbs> $$0) {
      List<UUID> $$1 = new ArrayList<>($$0.size());

      for (fbs $$2 : $$0) {
         if (!$$2.a() && !this.av.contains($$2.c())) {
            $$1.add($$2.c());
         }
      }

      if (!$$1.isEmpty()) {
         a($$1x -> {
            $$1x.a($$1);
            return null;
         }, $$1x -> this.av.addAll($$1));
      }
   }

   private static <T> void a(fax.k<T> $$0, Consumer<T> $$1) {
      fft $$2 = fft.Q();
      CompletableFuture.<T>supplyAsync(() -> {
         try {
            return $$0.request(fbc.a($$2));
         } catch (fcp var3) {
            throw new RuntimeException(var3);
         }
      }).thenAcceptAsync($$1, $$2).exceptionally($$0x -> {
         F.error("Failed to execute call to Realms Service", $$0x);
         return null;
      });
   }

   private void L() {
      fbt $$0 = this.O();
      this.aE.J();

      for (fbs $$1 : this.aK) {
         if (this.a($$1)) {
            this.a(List.of($$1));
            break;
         }
      }

      for (fbt $$2 : this.aG) {
         this.aE.a(new fax.a($$2));
      }

      for (fbt $$3 : this.aF) {
         fax.e $$4;
         if (b() && !$$3.h()) {
            if ($$3.e == fbt.c.c) {
               continue;
            }

            $$4 = new fax.i($$3);
         } else {
            $$4 = new fax.l($$3);
         }

         this.aE.a((fax.e)$$4);
         if ($$0 != null && $$0.a == $$3.a) {
            this.aE.a($$4);
         }
      }

      this.E();
      this.J();
   }

   private boolean a(fbs $$0) {
      if (!($$0 instanceof fbs.c $$1)) {
         return false;
      } else {
         wu $$2 = $$1.d();
         int $$3 = this.o.b($$2, 216);
         int $$4 = ayg.e($$3 + 7, 36) - 1;
         this.aE.a(new fax.h($$2, $$4 + 2, $$1));

         for (int $$5 = 0; $$5 < $$4; $$5++) {
            this.aE.a(new fax.d());
         }

         this.aE.a(new fax.b($$1.a(this)));
         return true;
      }
   }

   private void M() {
      new Thread(() -> {
         List<fcd> $$0 = fbb.a();
         fbc $$1 = fbc.a();
         fbo $$2 = new fbo();
         $$2.a = $$0;
         $$2.b = this.N();

         try {
            $$1.a($$2);
         } catch (Throwable var5) {
            F.warn("Could not send ping result to Realms: ", var5);
         }
      }).start();
   }

   private List<Long> N() {
      List<Long> $$0 = Lists.newArrayList();

      for (fbt $$1 : this.aF) {
         if (this.j($$1)) {
            $$0.add($$1.a);
         }
      }

      return $$0;
   }

   private void e(@Nullable fbt $$0) {
      if ($$0 != null) {
         String $$1 = axb.a($$0.b, this.l.X().b(), $$0.k);
         this.l.o.a($$1);
         ac.k().a($$1);
      }
   }

   private void f(@Nullable fbt $$0) {
      if ($$0 != null && this.l.b($$0.g)) {
         this.l.a(new fdd(this, $$0.a));
      }
   }

   private void g(@Nullable fbt $$0) {
      if ($$0 != null && !this.l.b($$0.g)) {
         wu $$1 = wu.c("mco.configure.world.leave.question.line1");
         this.l.a(fdp.a(this, $$1, $$1x -> this.h($$0)));
      }
   }

   @Nullable
   private fbt O() {
      return this.aE.h() instanceof fax.l $$0 ? $$0.c() : null;
   }

   private void h(final fbt $$0) {
      (new Thread("Realms-leave-server") {
         @Override
         public void run() {
            try {
               fbc $$0 = fbc.a();
               $$0.d($$0.a);
               fax.this.l.execute(fax::g);
            } catch (fcp var2) {
               fax.F.error("Couldn't configure world", var2);
               fax.this.l.execute(() -> fax.this.l.a(new fdh(var2, fax.this)));
            }
         }
      }).start();
      this.l.a(this);
   }

   void a(UUID $$0) {
      a($$1 -> {
         $$1.b(List.of($$0));
         return null;
      }, $$1 -> {
         this.aK.removeIf($$1x -> $$1x.b() && $$0.equals($$1x.c()));
         this.L();
      });
   }

   public void h() {
      this.aE.a(null);
      g();
   }

   @Override
   public wu i() {
      return (wu)(switch (this.aO) {
         case a -> wt.a(super.i(), J);
         case b -> wt.a(super.i(), X);
         case c -> super.i();
      });
   }

   @Override
   public void a(fhf $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (b()) {
         $$0.b(this.o, "Minecraft " + aa.b().c(), 2, this.n - 10, -1);
      }

      if (this.aH && this.aL.j) {
         fcy.a($$0, this.aL);
      }

      switch (fbc.a) {
         case b:
            this.a($$0, "STAGE!", -256);
            break;
         case c:
            this.a($$0, "LOCAL!", 8388479);
      }
   }

   private void P() {
      this.l.a(new fcy(this, this.aH));
   }

   public static void a(@Nullable fbt $$0, fnj $$1) {
      a($$0, $$1, false);
   }

   public static void a(@Nullable fbt $$0, fnj $$1, boolean $$2) {
      if ($$0 != null) {
         if (!b() || $$2 || $$0.i()) {
            fft.Q().a(new fdj($$1, new fes($$1, $$0)));
            return;
         }

         switch ($$0.u) {
            case f:
               fft.Q().a(new fdj($$1, new fes($$1, $$0)));
               break;
            case a:
               a($$0, $$1, wu.c("mco.compatibility.unverifiable.title").b(-171), wu.c("mco.compatibility.unverifiable.message"), wt.j);
               break;
            case d:
               a(
                  $$0,
                  $$1,
                  wu.c("selectWorld.backupQuestion.downgrade").b(-2142128),
                  wu.a("mco.compatibility.downgrade.description", wu.b($$0.t).b(-171), wu.b(aa.b().c()).b(-171)),
                  wu.c("mco.compatibility.downgrade")
               );
               break;
            case e:
               a(
                  $$0,
                  $$1,
                  wu.c("mco.compatibility.upgrade.title").b(-171),
                  wu.a("mco.compatibility.upgrade.description", wu.b($$0.t).b(-171), wu.b(aa.b().c()).b(-171)),
                  wu.c("mco.compatibility.upgrade")
               );
               break;
            case b:
               fft.Q()
                  .a(
                     new fiu.a($$1, aa)
                        .a(wu.a("mco.compatibility.incompatible.series.popup.message", wu.b($$0.t).b(-171), wu.b(aa.b().c()).b(-171)))
                        .a(wt.k, fiu::d)
                        .a()
                  );
               break;
            case c:
               fft.Q().a(new fiu.a($$1, aa).a(ab).a(wt.k, fiu::d).a());
         }
      }
   }

   private static void a(fbt $$0, fnj $$1, wu $$2, wu $$3, wu $$4) {
      fft.Q().a(new fmh($$2x -> {
         fnj $$3x;
         if ($$2x) {
            $$3x = new fdj($$1, new fes($$1, $$0));
            g();
         } else {
            $$3x = $$1;
         }

         fft.Q().a($$3x);
      }, $$2, $$3, $$4, wt.e));
   }

   public static wu a(String $$0, boolean $$1) {
      return a($$0, $$1 ? -8355712 : -2142128);
   }

   public static wu a(String $$0, int $$1) {
      return (wu)(StringUtils.isBlank($$0) ? wt.a : wu.a("mco.version", wu.b($$0).b($$1)));
   }

   boolean i(fbt $$0) {
      return this.l.b($$0.g);
   }

   private boolean j(fbt $$0) {
      return this.i($$0) && !$$0.j;
   }

   private void a(fhf $$0, String $$1, int $$2) {
      $$0.c().a();
      $$0.c().a((float)(this.m / 2 - 25), 20.0F, 0.0F);
      $$0.c().a(a.f.rotationDegrees(-20.0F));
      $$0.c().b(1.5F, 1.5F, 1.5F);
      $$0.a(this.o, $$1, 0, 0, $$2, false);
      $$0.c().b();
   }

   class a extends fax.e {
      private static final wu c = wu.c("mco.snapshot.start");
      private static final int d = 5;
      private final fjg e = new fjg();
      private final fbt f;

      public a(final fbt $$0) {
         this.f = $$0;
         this.e.a(fjd.a(wu.c("mco.snapshot.tooltip")));
      }

      @Override
      public void a(fhf $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(fax.b, $$3 - 5, $$2 + $$5 / 2 - 10, 40, 20);
         int $$10 = $$2 + $$5 / 2 - 9 / 2;
         $$0.b(fax.this.o, c, $$3 + 40 - 2, $$10 - 5, 8388479);
         $$0.b(fax.this.o, wu.a("mco.snapshot.description", this.f.c), $$3 + 40 - 2, $$10 + 5, -8355712);
         this.e.a($$8, this.aK_(), new fly($$3, $$2, $$4, $$5));
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         this.c();
         return true;
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         if (flt.a($$0)) {
            this.c();
            return true;
         } else {
            return super.a($$0, $$1, $$2);
         }
      }

      private void c() {
         fax.this.l.aj().a(gsx.a(avh.Ar, 1.0F));
         fax.this.l
            .a(
               new fiu.a(fax.this, wu.c("mco.snapshot.createSnapshotPopup.title"))
                  .a(wu.c("mco.snapshot.createSnapshotPopup.text"))
                  .a(wu.c("mco.selectServer.create"), $$0 -> fax.this.l.a(new fdf(fax.this, this.f.a)))
                  .a(wt.e, fiu::d)
                  .a()
            );
      }

      @Override
      public wu a() {
         return wu.a("gui.narrate.button", wt.a(c, wu.a("mco.snapshot.description", this.f.c)));
      }
   }

   class b extends fax.e {
      private final fhs c;

      public b(final fhs $$0) {
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
      public void a(fhf $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.c.c(fax.this.m / 2 - 75, $$2 + 4);
         this.c.a($$0, $$6, $$7, $$9);
      }

      @Override
      public void a(boolean $$0) {
         super.a($$0);
         this.c.a($$0);
      }

      @Override
      public wu a() {
         return this.c.z();
      }
   }

   static class c extends fie {
      private static final fjf b = new fjf(new akk("widget/cross_button"), new akk("widget/cross_button_highlighted"));

      protected c(fhs.c $$0, wu $$1) {
         super(0, 0, 14, 14, b, $$0);
         this.a(fjd.a($$1));
      }
   }

   class d extends fax.e {
      @Override
      public void a(fhf $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
      }

      @Override
      public wu a() {
         return wu.i();
      }
   }

   abstract class e extends fio.a<fax.e> {
      private static final int a = 10;
      private static final int c = 28;
      private static final int d = 7;

      protected void a(fbt $$0, fhf $$1, int $$2, int $$3, int $$4, int $$5) {
         int $$6 = $$2 - 10 - 7;
         int $$7 = $$3 + 2;
         if ($$0.j) {
            this.a($$1, $$6, $$7, $$4, $$5, fax.c, () -> fax.R);
         } else if ($$0.e == fbt.c.a) {
            this.a($$1, $$6, $$7, $$4, $$5, fax.C, () -> fax.V);
         } else if (fax.this.i($$0) && $$0.l < 7) {
            this.a($$1, $$6, $$7, $$4, $$5, fax.A, () -> {
               if ($$0.l <= 0) {
                  return fax.S;
               } else {
                  return (wu)($$0.l == 1 ? fax.T : wu.a("mco.selectServer.expires.days", $$0.l));
               }
            });
         } else if ($$0.e == fbt.c.b) {
            this.a($$1, $$6, $$7, $$4, $$5, fax.B, () -> fax.U);
         }
      }

      private void a(fhf $$0, int $$1, int $$2, int $$3, int $$4, akk $$5, Supplier<wu> $$6) {
         $$0.a($$5, $$1, $$2, 10, 28);
         if (fax.this.aE.c((double)$$3, (double)$$4) && $$3 >= $$1 && $$3 <= $$1 + 10 && $$4 >= $$2 && $$4 <= $$2 + 28) {
            fax.this.d($$6.get());
         }
      }

      protected void a(fhf $$0, int $$1, int $$2, fbt $$3) {
         int $$4 = this.b($$2);
         int $$5 = this.a($$1);
         int $$6 = this.d($$5);
         if (!fax.this.i($$3)) {
            $$0.a(fax.this.o, $$3.f, $$4, this.d($$5), -8355712, false);
         } else if ($$3.j) {
            wu $$7 = $$3.k ? fax.N : fax.L;
            $$0.a(fax.this.o, $$7, $$4, $$6, -2142128, false);
         }
      }

      protected void a(fhf $$0, String $$1, int $$2, int $$3, int $$4, int $$5) {
         int $$6 = $$4 - $$2;
         if (fax.this.o.b($$1) > $$6) {
            String $$7 = fax.this.o.a($$1, $$6 - fax.this.o.b("... "));
            $$0.a(fax.this.o, $$7 + "...", $$2, $$3, $$5, false);
         } else {
            $$0.a(fax.this.o, $$1, $$2, $$3, $$5, false);
         }
      }

      protected int a(int $$0, int $$1, wu $$2) {
         return $$0 + $$1 - fax.this.o.a($$2) - 20;
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

   static class g extends fix.b {
      private static final akk[] d = new akk[]{
         new akk("notification/1"),
         new akk("notification/2"),
         new akk("notification/3"),
         new akk("notification/4"),
         new akk("notification/5"),
         new akk("notification/more")
      };
      private static final int u = Integer.MAX_VALUE;
      private static final int v = 20;
      private static final int w = 14;
      private int x;

      public g(wu $$0, akk $$1, fhs.c $$2) {
         super(20, 20, $$0, 14, 14, $$1, $$2, null);
      }

      int a() {
         return this.x;
      }

      public void a(int $$0) {
         this.x = $$0;
      }

      @Override
      public void b(fhf $$0, int $$1, int $$2, float $$3) {
         super.b($$0, $$1, $$2, $$3);
         if (this.j && this.x != 0) {
            this.a($$0);
         }
      }

      private void a(fhf $$0) {
         $$0.a(d[Math.min(this.x, 6) - 1], this.D() + this.y() - 5, this.E() - 3, 8, 8);
      }
   }

   class h extends fax.e {
      private static final int c = 40;
      private static final int d = -12303292;
      private final wu e;
      private final int f;
      private final List<fhq> g = new ArrayList<>();
      @Nullable
      private final fax.c h;
      private final fim i;
      private final fle j;
      private final fld k;
      private int l = -1;

      public h(final wu $$0, final int $$1, final fbs $$2) {
         this.e = $$0;
         this.f = $$1;
         this.j = new fle();
         int $$3 = 7;
         this.j.a(fif.a(20, 20, fax.a), 0, 0, this.j.b().a(7, 7, 0, 0));
         this.j.a(flk.a(40), 0, 0);
         this.k = this.j.a(new fld(0, 9 * 3 * ($$1 - 1)), 0, 1, this.j.b().c(7));
         this.i = this.k.a(new fim($$0, fax.this.o).b(true), this.k.b().b().d());
         this.j.a(flk.a(40), 0, 2);
         if ($$2.b()) {
            this.h = this.j.a(new fax.c($$1x -> fax.this.a($$2.c()), wu.c("mco.notification.dismiss")), 0, 2, this.j.b().c().a(0, 7, 7, 0));
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
      public void b(fhf $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         super.b($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
         $$0.b($$3 - 2, $$2 - 2, $$4, 36 * this.f - 2, -12303292);
      }

      @Override
      public void a(fhf $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
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

   class i extends fax.e {
      private final fbt c;
      private final fjg d = new fjg();

      public i(final fbt $$0) {
         this.c = $$0;
         if (!$$0.j) {
            this.d.a(fjd.a(wu.c("mco.snapshot.parent.tooltip")));
         }
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         return true;
      }

      @Override
      public void a(fhf $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = this.b($$3);
         int $$11 = this.a($$2);
         fej.a($$0, $$3, $$2, 32, this.c.g);
         wu $$12 = fax.a(this.c.t, -8355712);
         int $$13 = this.a($$3, $$4, $$12);
         this.a($$0, this.c.b(), $$10, $$11, $$13, -8355712);
         if ($$12 != wt.a) {
            $$0.a(fax.this.o, $$12, $$13, $$11, -8355712, false);
         }

         $$0.a(fax.this.o, this.c.a(), $$10, this.c($$11), -8355712, false);
         this.a($$0, $$2, $$3, this.c);
         this.a(this.c, $$0, $$3 + $$4, $$2, $$6, $$7);
         this.d.a($$8, this.aK_(), new fly($$3, $$2, $$4, $$5));
      }

      @Override
      public wu a() {
         return wu.b(this.c.c);
      }
   }

   class j extends gvr<fax.e> {
      public j() {
         super(fax.this.m, fax.this.n, 0, 36);
      }

      public void a(@Nullable fax.e $$0) {
         super.a($$0);
         fax.this.J();
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
      T request(fbc var1) throws fcp;
   }

   class l extends fax.e {
      private static final int c = 36;
      private final fbt d;
      private final fjg e = new fjg();

      public l(final fbt $$0) {
         this.d = $$0;
         boolean $$1 = fax.this.i($$0);
         if (fax.b() && $$1 && $$0.h()) {
            this.e.a(fjd.a(wu.a("mco.snapshot.paired", $$0.s)));
         } else if (!$$1 && $$0.e()) {
            this.e.a(fjd.a(wu.a("mco.snapshot.friendsRealm.upgrade", $$0.f)));
         } else if (!$$1 && $$0.f()) {
            this.e.a(fjd.a(wu.a("mco.snapshot.friendsRealm.downgrade", $$0.t)));
         }
      }

      @Override
      public void a(fhf $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         if (this.d.e == fbt.c.c) {
            $$0.a(fax.b, $$3 - 5, $$2 + $$5 / 2 - 10, 40, 20);
            int $$10 = $$2 + $$5 / 2 - 9 / 2;
            $$0.b(fax.this.o, fax.K, $$3 + 40 - 2, $$10, 8388479);
         } else {
            fej.a($$0, $$3, $$2, 32, this.d.g);
            this.a($$0, $$2, $$3, $$4);
            this.a($$0, $$2, $$3);
            this.a($$0, $$2, $$3, this.d);
            this.a(this.d, $$0, $$3 + $$4, $$2, $$6, $$7);
            this.e.a($$8, this.aK_(), new fly($$3, $$2, $$4, $$5));
         }
      }

      private void a(fhf $$0, int $$1, int $$2, int $$3) {
         int $$4 = this.b($$2);
         int $$5 = this.a($$1);
         wu $$6 = fax.a(this.d.t, this.d.d());
         int $$7 = this.a($$2, $$3, $$6);
         this.a($$0, this.d.b(), $$4, $$5, $$7, -1);
         if ($$6 != wt.a && !this.d.i()) {
            $$0.a(fax.this.o, $$6, $$7, $$5, -8355712, false);
         }
      }

      private void a(fhf $$0, int $$1, int $$2) {
         int $$3 = this.b($$2);
         int $$4 = this.a($$1);
         int $$5 = this.c($$4);
         String $$6 = this.d.c();
         if (this.d.i() && $$6 != null) {
            wu $$7 = wu.b($$6).a(n.h);
            $$0.a(fax.this.o, wu.a("mco.selectServer.minigameName", $$7).b(-171), $$3, $$5, -1, false);
         } else {
            $$0.a(fax.this.o, this.d.a(), $$3, this.c($$4), -8355712, false);
         }
      }

      private void d() {
         fax.this.l.aj().a(gsx.a(avh.Ar, 1.0F));
         fax.a(this.d, fax.this);
      }

      private void e() {
         fax.this.l.aj().a(gsx.a(avh.Ar, 1.0F));
         fdf $$0 = new fdf(fax.this, this.d);
         fax.this.l.a($$0);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         if (this.d.e == fbt.c.c) {
            this.e();
         } else if (fax.this.a(this.d)) {
            if (ac.c() - fax.this.aJ < 250L && this.aK_()) {
               this.d();
            }

            fax.this.aJ = ac.c();
         }

         return true;
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         if (flt.a($$0)) {
            if (this.d.e == fbt.c.c) {
               this.e();
               return true;
            }

            if (fax.this.a(this.d)) {
               this.d();
               return true;
            }
         }

         return super.a($$0, $$1, $$2);
      }

      @Override
      public wu a() {
         return (wu)(this.d.e == fbt.c.c ? fax.W : wu.a("narrator.select", this.d.c));
      }

      public fbt c() {
         return this.d;
      }
   }
}
