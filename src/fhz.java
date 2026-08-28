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

public class fhz extends hne {
   static final ald b = ald.b("icon/info");
   static final ald c = ald.b("icon/new_realm");
   static final ald C = ald.b("realm_status/expired");
   static final ald D = ald.b("realm_status/expires_soon");
   static final ald E = ald.b("realm_status/open");
   static final ald F = ald.b("realm_status/closed");
   private static final ald G = ald.b("icon/invite");
   private static final ald H = ald.b("icon/news");
   public static final ald a = ald.b("hud/heart/hardcore_full");
   static final Logger I = LogUtils.getLogger();
   private static final ald J = ald.b("textures/gui/title/realms.png");
   private static final ald K = ald.b("textures/gui/realms/no_realms.png");
   private static final wv L = wv.c("menu.online");
   private static final wv M = wv.c("mco.selectServer.loading");
   static final wv N = wv.c("mco.selectServer.uninitialized");
   static final wv O = wv.c("mco.selectServer.expiredList");
   private static final wv P = wv.c("mco.selectServer.expiredRenew");
   static final wv Q = wv.c("mco.selectServer.expiredTrial");
   private static final wv R = wv.c("mco.selectServer.play");
   private static final wv S = wv.c("mco.selectServer.leave");
   private static final wv T = wv.c("mco.selectServer.configure");
   static final wv U = wv.c("mco.selectServer.expired");
   static final wv V = wv.c("mco.selectServer.expires.soon");
   static final wv W = wv.c("mco.selectServer.expires.day");
   static final wv X = wv.c("mco.selectServer.open");
   static final wv Y = wv.c("mco.selectServer.closed");
   static final wv Z = wv.a("gui.narrate.button", N);
   private static final wv aa = wv.c("mco.selectServer.noRealms");
   private static final wv ab = wv.c("mco.invites.nopending");
   private static final wv ac = wv.c("mco.invites.pending");
   private static final wv ad = wv.c("mco.compatibility.incompatible.popup.title");
   private static final wv ae = wv.c("mco.compatibility.incompatible.releaseType.popup.message");
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
   private final CompletableFuture<fhy.a> aw = fhy.a();
   @Nullable
   private fll.c ax;
   private final Set<UUID> ay = new HashSet<>();
   private static boolean az;
   private final RateLimiter aA;
   private final fwf aB;
   private fqn aC;
   private fqn aD;
   private fqn aE;
   private fqn aF;
   private fqn aG;
   fhz.j aH;
   fkf aI;
   List<fjf> aJ = List.of();
   fji aK = new fji();
   private volatile boolean aL;
   @Nullable
   private volatile String aM;
   long aN;
   final List<fje> aO = new ArrayList<>();
   private fqn aP;
   private fhz.g aQ;
   private fhz.g aR;
   private fhz.f aS;
   @Nullable
   private fub aT;

   public fhz(fwf $$0) {
      super(L);
      this.aB = $$0;
      this.aA = RateLimiter.create(0.016666668F);
   }

   @Override
   public void aN_() {
      this.aI = new fkf(this.m);
      this.aH = new fhz.j();
      wv $$0 = wv.c("mco.invites.title");
      this.aQ = new fhz.g($$0, G, $$1x -> this.m.a(new fky(this, $$0)));
      wv $$1 = wv.c("mco.news");
      this.aR = new fhz.g($$1, H, $$0x -> {
         String $$1x = this.aM;
         if ($$1x != null) {
            fvc.a(this, $$1x);
            if (this.aR.a() != 0) {
               flr.a $$2 = flr.b();
               $$2.b = false;
               flr.b($$2);
               this.aR.a(0);
            }
         }
      });
      this.aR.a(fry.a($$1));
      this.aC = fqn.a(R, $$0x -> a(this.O(), this)).a(100).a();
      this.aF = fqn.a(T, $$0x -> this.f(this.O())).a(100).a();
      this.aE = fqn.a(P, $$0x -> this.e(this.O())).a(100).a();
      this.aG = fqn.a(S, $$0x -> this.g(this.O())).a(100).a();
      this.aP = fqn.a(wv.c("mco.selectServer.purchase"), $$0x -> this.P()).b(100, 20).a();
      this.aD = fqn.a(wu.k, $$0x -> this.aK_()).a(100).a();
      if (fie.a == fie.b.b) {
         this.c(fqu.a(wv.b("Snapshot"), wv.b("Release")).a(5, 5, 100, 20, wv.b("Realm"), ($$0x, $$1x) -> {
            av = $$1x;
            this.aJ = List.of();
            this.I();
         }));
      }

      this.a(fhz.f.a);
      this.H();
      this.aw.thenAcceptAsync($$0x -> {
         fwf $$1x = $$0x.a(this.aB);
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
   public void aK_() {
      this.m.a(this.aB);
   }

   private void E() {
      if (this.aI.a() && this.aJ.isEmpty() && this.aO.isEmpty()) {
         this.a(fhz.f.b);
      } else {
         this.a(fhz.f.c);
      }
   }

   private void a(fhz.f $$0) {
      if (this.aS != $$0) {
         if (this.aT != null) {
            this.aT.a($$1 -> this.e($$1));
         }

         this.aT = this.b($$0);
         this.aS = $$0;
         this.aT.a($$1 -> {
            fql var10000 = this.c($$1);
         });
         this.c();
      }
   }

   private fub b(fhz.f $$0) {
      fub $$1 = new fub(this);
      $$1.b(44);
      $$1.a(this.F());
      fuc $$2 = this.c($$0);
      $$2.a();
      $$1.a($$2.y() + 22);
      $$1.b($$2);
      switch ($$0) {
         case a:
            $$1.c(new frc(this.p, M));
            break;
         case b:
            $$1.c(this.G());
            break;
         case c:
            $$1.c(this.aH);
      }

      return $$1;
   }

   private fuc F() {
      int $$0 = 90;
      fuf $$1 = fuf.e().a(4);
      $$1.c().e();
      $$1.a(this.aQ);
      $$1.a(this.aR);
      fuf $$2 = fuf.e();
      $$2.c().e();
      $$2.a(fug.a(90));
      $$2.a(fra.a(128, 34, J, 128, 64), fue::b);
      $$2.a(new ftz(90, 44)).a($$1, fue::c);
      return $$2;
   }

   private fuc c(fhz.f $$0) {
      fua $$1 = new fua().c(4);
      fua.b $$2 = $$1.d(3);
      if ($$0 == fhz.f.c) {
         $$2.a(this.aC);
         $$2.a(this.aF);
         $$2.a(this.aE);
         $$2.a(this.aG);
      }

      $$2.a(this.aP);
      $$2.a(this.aD);
      return $$1;
   }

   private fuf G() {
      fuf $$0 = fuf.d().a(8);
      $$0.c().b();
      $$0.a(fra.a(130, 64, K, 130, 64));
      fqy $$1 = new fqy(308, aa, this.p, false, 4);
      $$0.a($$1);
      return $$0;
   }

   void H() {
      fjf $$0 = this.O();
      this.aP.j = this.aS != fhz.f.a;
      this.aC.j = $$0 != null && this.a($$0);
      this.aE.j = $$0 != null && this.b($$0);
      this.aG.j = $$0 != null && this.d($$0);
      this.aF.j = $$0 != null && this.c($$0);
   }

   boolean a(fjf $$0) {
      boolean $$1 = !$$0.j && $$0.e == fjf.c.b;
      return $$1 && ($$0.d() || $$0.e() || i($$0));
   }

   private boolean b(fjf $$0) {
      return $$0.j && i($$0);
   }

   private boolean c(fjf $$0) {
      return i($$0) && $$0.e != fjf.c.c;
   }

   private boolean d(fjf $$0) {
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
      fnd.Q().bb().d.a();
   }

   public static void g() {
      fnd.Q().bb().c.a();
   }

   private void I() {
      for (fll.e<?> $$0 : this.m.bb().a()) {
         $$0.a();
      }
   }

   private fll.c a(fkd $$0) {
      fll.c $$1 = $$0.a.a();
      $$1.a($$0.c, $$0x -> {
         this.aI.a($$0x.a());
         this.aJ = $$0x.b();
         this.L();
         boolean $$1x = false;

         for (fjf $$2 : this.aI) {
            if (this.j($$2)) {
               $$1x = true;
            }
         }

         if (!az && $$1x) {
            az = true;
            this.M();
         }
      });
      a(fie::d, $$0x -> {
         this.aO.clear();
         this.aO.addAll($$0x);

         for (fje $$1x : $$0x) {
            if ($$1x instanceof fje.a $$2) {
               frp $$3 = $$2.a(this, this::a);
               if ($$3 != null) {
                  this.m.a($$3);
                  this.a(List.of($$1x));
                  break;
               }
            }
         }

         if (!this.aO.isEmpty() && this.aS != fhz.f.a) {
            this.L();
         }
      });
      $$1.a($$0.d, $$0x -> {
         this.aQ.a($$0x);
         this.aQ.a($$0x == 0 ? fry.a(ab) : fry.a(ac));
         if ($$0x > 0 && this.aA.tryAcquire(1)) {
            this.m.aY().c(wv.a("mco.configure.world.invite.narration", $$0x));
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

   void a(Collection<fje> $$0) {
      List<UUID> $$1 = new ArrayList<>($$0.size());

      for (fje $$2 : $$0) {
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

   private static <T> void a(fhz.k<T> $$0, Consumer<T> $$1) {
      fnd $$2 = fnd.Q();
      CompletableFuture.<T>supplyAsync(() -> {
         try {
            return $$0.request(fie.a($$2));
         } catch (fka var3) {
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
         List<fjo> $$0 = fid.a();
         fie $$1 = fie.a();
         fja $$2 = new fja();
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

      for (fjf $$1 : this.aI) {
         if (this.j($$1)) {
            $$0.add($$1.a);
         }
      }

      return $$0;
   }

   private void e(@Nullable fjf $$0) {
      if ($$0 != null) {
         String $$1 = ayf.a($$0.b, this.m.X().b(), $$0.k);
         this.m.p.a($$1);
         af.n().a($$1);
      }
   }

   private void f(@Nullable fjf $$0) {
      if ($$0 != null && this.m.b($$0.g)) {
         this.m.a(new fko(this, $$0.a));
      }
   }

   private void g(@Nullable fjf $$0) {
      if ($$0 != null && !this.m.b($$0.g)) {
         wv $$1 = wv.c("mco.configure.world.leave.question.line1");
         this.m.a(fla.a(this, $$1, $$1x -> this.h($$0)));
      }
   }

   @Nullable
   private fjf O() {
      return this.aH.p() instanceof fhz.l $$0 ? $$0.c() : null;
   }

   private void h(final fjf $$0) {
      (new Thread("Realms-leave-server") {
         @Override
         public void run() {
            try {
               fie $$0 = fie.a();
               $$0.d($$0.a);
               fhz.this.m.execute(fhz::g);
            } catch (fka var2) {
               fhz.I.error("Couldn't configure world", var2);
               fhz.this.m.execute(() -> fhz.this.m.a(new fks(var2, fhz.this)));
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
   public wv i() {
      return (wv)(switch (this.aS) {
         case a -> wu.a(super.i(), M);
         case b -> wu.a(super.i(), aa);
         case c -> super.i();
      });
   }

   @Override
   public void a(fpz $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (b()) {
         $$0.b(this.p, "Minecraft " + ab.b().c(), 2, this.o - 10, -1);
      }

      if (this.aL && this.aP.j) {
         fkj.a($$0, this.aP);
      }

      switch (fie.a) {
         case b:
            this.a($$0, "STAGE!", -256);
            break;
         case c:
            this.a($$0, "LOCAL!", 8388479);
      }
   }

   private void P() {
      this.m.a(new fkj(this, this.aL));
   }

   public static void a(@Nullable fjf $$0, fwf $$1) {
      a($$0, $$1, false);
   }

   public static void a(@Nullable fjf $$0, fwf $$1, boolean $$2) {
      if ($$0 != null) {
         if (!b() || $$2 || $$0.i()) {
            fnd.Q().a(new fku($$1, new fma($$1, $$0)));
            return;
         }

         switch ($$0.w) {
            case f:
               fnd.Q().a(new fku($$1, new fma($$1, $$0)));
               break;
            case a:
               a($$0, $$1, wv.c("mco.compatibility.unverifiable.title").b(-171), wv.c("mco.compatibility.unverifiable.message"), wu.j);
               break;
            case d:
               a(
                  $$0,
                  $$1,
                  wv.c("selectWorld.backupQuestion.downgrade").b(-2142128),
                  wv.a("mco.compatibility.downgrade.description", wv.b($$0.v).b(-171), wv.b(ab.b().c()).b(-171)),
                  wv.c("mco.compatibility.downgrade")
               );
               break;
            case e:
               b($$0, $$1);
               break;
            case b:
               fnd.Q()
                  .a(
                     new frp.a($$1, ad)
                        .a(wv.a("mco.compatibility.incompatible.series.popup.message", wv.b($$0.v).b(-171), wv.b(ab.b().c()).b(-171)))
                        .a(wu.k, frp::aK_)
                        .a()
                  );
               break;
            case c:
               fnd.Q().a(new frp.a($$1, ad).a(ae).a(wu.k, frp::aK_).a());
         }
      }
   }

   private static void a(fjf $$0, fwf $$1, wv $$2, wv $$3, wv $$4) {
      fnd.Q().a(new frp.a($$1, $$2).a($$3).a($$4, $$2x -> {
         fnd.Q().a(new fku($$1, new fma($$1, $$0)));
         g();
      }).a(wu.e, frp::aK_).a());
   }

   private static void b(fjf $$0, fwf $$1) {
      wv $$2 = wv.c("mco.compatibility.upgrade.title").b(-171);
      wv $$3 = wv.c("mco.compatibility.upgrade");
      wv $$4 = wv.b($$0.v).b(-171);
      wv $$5 = wv.b(ab.b().c()).b(-171);
      wv $$6 = i($$0) ? wv.a("mco.compatibility.upgrade.description", $$4, $$5) : wv.a("mco.compatibility.upgrade.friend.description", $$4, $$5);
      a($$0, $$1, $$2, $$6, $$3);
   }

   public static wv a(String $$0, boolean $$1) {
      return a($$0, $$1 ? -8355712 : -2142128);
   }

   public static wv a(String $$0, int $$1) {
      return (wv)(StringUtils.isBlank($$0) ? wu.a : wv.b($$0).b($$1));
   }

   public static wv a(int $$0, boolean $$1) {
      return (wv)($$1 ? wv.c("gameMode.hardcore").b(-65536) : dhm.a($$0).d());
   }

   static boolean i(fjf $$0) {
      return fnd.Q().b($$0.g);
   }

   private boolean j(fjf $$0) {
      return i($$0) && !$$0.j;
   }

   private void a(fpz $$0, String $$1, int $$2) {
      $$0.c().a();
      $$0.c().a((float)(this.n / 2 - 25), 20.0F, 0.0F);
      $$0.c().a(a.f.rotationDegrees(-20.0F));
      $$0.c().b(1.5F, 1.5F, 1.5F);
      $$0.b(this.p, $$1, 0, 0, $$2);
      $$0.c().b();
   }

   class a extends fhz.e {
      private static final wv f = wv.c("mco.snapshot.start");
      private static final int g = 5;
      private final fsb h = new fsb();
      private final fjf i;

      public a(final fjf $$0) {
         this.i = $$0;
         this.h.a(fry.a(wv.c("mco.snapshot.tooltip")));
      }

      @Override
      public void a(fpz $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(goi::H, fhz.c, $$3 - 5, $$2 + $$5 / 2 - 10, 40, 20);
         int $$10 = $$2 + $$5 / 2 - 9 / 2;
         $$0.b(fhz.this.p, f, $$3 + 40 - 2, $$10 - 5, 8388479);
         $$0.b(fhz.this.p, wv.a("mco.snapshot.description", Objects.requireNonNullElse(this.i.c, "unknown server")), $$3 + 40 - 2, $$10 + 5, -8355712);
         this.h.a($$8, this.aI_(), new fuu($$3, $$2, $$4, $$5));
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         this.c();
         return true;
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         if (fup.a($$0)) {
            this.c();
            return false;
         } else {
            return super.a($$0, $$1, $$2);
         }
      }

      private void c() {
         fhz.this.m.ak().a(hkk.a(awk.Bp, 1.0F));
         fhz.this.m
            .a(
               new frp.a(fhz.this, wv.c("mco.snapshot.createSnapshotPopup.title"))
                  .a(wv.c("mco.snapshot.createSnapshotPopup.text"))
                  .a(wv.c("mco.selectServer.create"), $$0 -> fhz.this.m.a(new fkq(fhz.this, this.i, true)))
                  .a(wu.e, frp::aK_)
                  .a()
            );
      }

      @Override
      public wv a() {
         return wv.a("gui.narrate.button", wu.a(f, wv.a("mco.snapshot.description", Objects.requireNonNullElse(this.i.c, "unknown server"))));
      }
   }

   class b extends fhz.e {
      private final fqn f;

      public b(final fqn $$0) {
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
      public void a(fpz $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.f.c(fhz.this.n / 2 - 75, $$2 + 4);
         this.f.a($$0, $$6, $$7, $$9);
      }

      @Override
      public void a(boolean $$0) {
         super.a($$0);
         this.f.a($$0);
      }

      @Override
      public wv a() {
         return this.f.B();
      }
   }

   static class c extends fqz {
      private static final fsa b = new fsa(ald.b("widget/cross_button"), ald.b("widget/cross_button_highlighted"));

      protected c(fqn.c $$0, wv $$1) {
         super(0, 0, 14, 14, b, $$0);
         this.a(fry.a($$1));
      }
   }

   class d extends fhz.e {
      @Override
      public void a(fpz $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
      }

      @Override
      public wv a() {
         return wv.i();
      }
   }

   abstract class e extends frj.a<fhz.e> {
      protected static final int b = 10;
      private static final int a = 28;
      protected static final int c = 7;
      protected static final int d = 2;

      protected void a(fjf $$0, fpz $$1, int $$2, int $$3, int $$4, int $$5) {
         int $$6 = $$2 - 10 - 7;
         int $$7 = $$3 + 2;
         if ($$0.j) {
            this.a($$1, $$6, $$7, $$4, $$5, fhz.C, () -> fhz.U);
         } else if ($$0.e == fjf.c.a) {
            this.a($$1, $$6, $$7, $$4, $$5, fhz.F, () -> fhz.Y);
         } else if (fhz.i($$0) && $$0.l < 7) {
            this.a($$1, $$6, $$7, $$4, $$5, fhz.D, () -> {
               if ($$0.l <= 0) {
                  return fhz.V;
               } else {
                  return (wv)($$0.l == 1 ? fhz.W : wv.a("mco.selectServer.expires.days", $$0.l));
               }
            });
         } else if ($$0.e == fjf.c.b) {
            this.a($$1, $$6, $$7, $$4, $$5, fhz.E, () -> fhz.X);
         }
      }

      private void a(fpz $$0, int $$1, int $$2, int $$3, int $$4, ald $$5, Supplier<wv> $$6) {
         $$0.a(goi::H, $$5, $$1, $$2, 10, 28);
         if (fhz.this.aH.a_((double)$$3, (double)$$4) && $$3 >= $$1 && $$3 <= $$1 + 10 && $$4 >= $$2 && $$4 <= $$2 + 28) {
            fhz.this.d($$6.get());
         }
      }

      protected void a(fpz $$0, int $$1, int $$2, fjf $$3) {
         int $$4 = this.b($$2);
         int $$5 = this.a($$1);
         int $$6 = this.d($$5);
         if (!fhz.i($$3)) {
            $$0.b(fhz.this.p, $$3.f, $$4, this.d($$5), -8355712);
         } else if ($$3.j) {
            wv $$7 = $$3.k ? fhz.Q : fhz.O;
            $$0.b(fhz.this.p, $$7, $$4, $$6, -2142128);
         }
      }

      protected void a(fpz $$0, @Nullable String $$1, int $$2, int $$3, int $$4, int $$5) {
         if ($$1 != null) {
            int $$6 = $$4 - $$2;
            if (fhz.this.p.b($$1) > $$6) {
               String $$7 = fhz.this.p.a($$1, $$6 - fhz.this.p.b("... "));
               $$0.b(fhz.this.p, $$7 + "...", $$2, $$3, $$5);
            } else {
               $$0.b(fhz.this.p, $$1, $$2, $$3, $$5);
            }
         }
      }

      protected int a(int $$0, int $$1, wv $$2) {
         return $$0 + $$1 - fhz.this.p.a($$2) - 20;
      }

      protected int b(int $$0, int $$1, wv $$2) {
         return $$0 + $$1 - fhz.this.p.a($$2) - 20;
      }

      protected int a(fjf $$0, fpz $$1, int $$2, int $$3, int $$4) {
         boolean $$5 = $$0.n;
         int $$6 = $$0.o;
         int $$7 = $$2;
         if (dhm.c($$6)) {
            wv $$8 = fhz.a($$6, $$5);
            $$7 = this.b($$2, $$3, $$8);
            $$1.b(fhz.this.p, $$8, $$7, this.c($$4), -8355712);
         }

         if ($$5) {
            $$7 -= 10;
            $$1.a(goi::H, fhz.a, $$7, this.c($$4), 8, 8);
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

   static class g extends frs.b {
      private static final ald[] d = new ald[]{
         ald.b("notification/1"),
         ald.b("notification/2"),
         ald.b("notification/3"),
         ald.b("notification/4"),
         ald.b("notification/5"),
         ald.b("notification/more")
      };
      private static final int u = Integer.MAX_VALUE;
      private static final int v = 20;
      private static final int w = 14;
      private int x;

      public g(wv $$0, ald $$1, fqn.c $$2) {
         super(20, 20, $$0, 14, 14, $$1, $$2, null);
      }

      int a() {
         return this.x;
      }

      public void a(int $$0) {
         this.x = $$0;
      }

      @Override
      public void b(fpz $$0, int $$1, int $$2, float $$3) {
         super.b($$0, $$1, $$2, $$3);
         if (this.j && this.x != 0) {
            this.a($$0);
         }
      }

      private void a(fpz $$0) {
         $$0.a(goi::H, d[Math.min(this.x, 6) - 1], this.F() + this.A() - 5, this.G() - 3, 8, 8);
      }
   }

   class h extends fhz.e {
      private static final int f = 40;
      private static final int g = -12303292;
      private final wv h;
      private final int i;
      private final List<fql> j = new ArrayList<>();
      @Nullable
      private final fhz.c k;
      private final frh l;
      private final fua m;
      private final ftz n;
      private int o = -1;

      public h(final wv $$0, final int $$1, final fje $$2) {
         this.h = $$0;
         this.i = $$1;
         this.m = new fua();
         int $$3 = 7;
         this.m.a(fra.a(20, 20, fhz.b), 0, 0, this.m.b().a(7, 7, 0, 0));
         this.m.a(fug.a(40), 0, 0);
         this.n = this.m.a(new ftz(0, 9 * 3 * ($$1 - 1)), 0, 1, this.m.b().c(7));
         this.l = this.n.a(new frh($$0, fhz.this.p).b(true), this.n.b().b().d());
         this.m.a(fug.a(40), 0, 2);
         if ($$2.b()) {
            this.k = this.m.a(new fhz.c($$1x -> fhz.this.a($$2.c()), wv.c("mco.notification.dismiss")), 0, 2, this.m.b().c().a(0, 7, 7, 0));
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
      public void b(fpz $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         super.b($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
         $$0.b($$3 - 2, $$2 - 2, $$4, 36 * this.i - 2, -12303292);
      }

      @Override
      public void a(fpz $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
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
      public wv a() {
         return this.h;
      }
   }

   class i extends fhz.e {
      private final fjf f;
      private final fsb g = new fsb();

      public i(final fjf $$0) {
         this.f = $$0;
         if (!$$0.j) {
            this.g.a(fry.a(wv.c("mco.snapshot.parent.tooltip")));
         }
      }

      @Override
      public void a(fpz $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = this.b($$3);
         int $$11 = this.a($$2);
         flt.a($$0, $$3, $$2, 32, this.f.g);
         wv $$12 = fhz.a(this.f.v, -8355712);
         int $$13 = this.a($$3, $$4, $$12);
         this.a($$0, this.f.b(), $$10, $$11, $$13, -8355712);
         if ($$12 != wu.a) {
            $$0.b(fhz.this.p, $$12, $$13, $$11, -8355712);
         }

         int $$14 = $$3;
         if (!this.f.i()) {
            $$14 = this.a(this.f, $$0, $$3, $$4, $$11);
         }

         this.a($$0, this.f.a(), $$10, this.c($$11), $$14, -8355712);
         this.a($$0, $$2, $$3, this.f);
         this.a(this.f, $$0, $$3 + $$4, $$2, $$6, $$7);
         this.g.a($$8, this.aI_(), new fuu($$3, $$2, $$4, $$5));
      }

      @Override
      public wv a() {
         return wv.b(Objects.requireNonNullElse(this.f.c, "unknown server"));
      }
   }

   class j extends frj<fhz.e> {
      public j() {
         super(fnd.Q(), fhz.this.n, fhz.this.o, 0, 36);
      }

      public void a(@Nullable fhz.e $$0) {
         super.a($$0);
         fhz.this.H();
      }

      @Override
      public int a() {
         return 300;
      }

      void a(fhz $$0, @Nullable fjf $$1) {
         this.s();

         for (fje $$2 : fhz.this.aO) {
            if ($$2 instanceof fje.c $$3) {
               this.a($$3, $$0);
               fhz.this.a(List.of($$2));
               break;
            }
         }

         this.a($$1);
      }

      private void a(@Nullable fjf $$0) {
         for (fjf $$1 : fhz.this.aJ) {
            this.b(fhz.this.new a($$1));
         }

         for (fjf $$2 : fhz.this.aI) {
            fhz.e $$3;
            if (fhz.b() && !$$2.h()) {
               if ($$2.e == fjf.c.c) {
                  continue;
               }

               $$3 = fhz.this.new i($$2);
            } else {
               $$3 = fhz.this.new l($$2);
            }

            this.b($$3);
            if ($$0 != null && $$0.a == $$2.a) {
               this.a($$3);
            }
         }
      }

      private void a(fje.c $$0, fhz $$1) {
         wv $$2 = $$0.d();
         int $$3 = fhz.this.p.b($$2, 216);
         int $$4 = azk.e($$3 + 7, 36) - 1;
         this.b(fhz.this.new h($$2, $$4 + 2, $$0));

         for (int $$5 = 0; $$5 < $$4; $$5++) {
            this.b(fhz.this.new d());
         }

         this.b(fhz.this.new b($$0.a($$1)));
      }
   }

   interface k<T> {
      T request(fie var1) throws fka;
   }

   class l extends fhz.e {
      private static final wv f = wv.c("mco.onlinePlayers");
      private static final int g = 9;
      private static final int h = 36;
      private final fjf i;
      private final fsb j = new fsb();

      public l(final fjf $$0) {
         this.i = $$0;
         boolean $$1 = fhz.i($$0);
         if (fhz.b() && $$1 && $$0.h()) {
            this.j.a(fry.a(wv.a("mco.snapshot.paired", $$0.u)));
         } else if (!$$1 && $$0.f()) {
            this.j.a(fry.a(wv.a("mco.snapshot.friendsRealm.downgrade", $$0.v)));
         }
      }

      @Override
      public void a(fpz $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         if (this.i.e == fjf.c.c) {
            $$0.a(goi::H, fhz.c, $$3 - 5, $$2 + $$5 / 2 - 10, 40, 20);
            int $$10 = $$2 + $$5 / 2 - 9 / 2;
            $$0.b(fhz.this.p, fhz.N, $$3 + 40 - 2, $$10, 8388479);
         } else {
            this.a(this.i, $$0, $$3 + 36, $$2, $$6, $$7);
            flt.a($$0, $$3, $$2, 32, this.i.g);
            this.a($$0, $$2, $$3, $$4);
            this.b($$0, $$2, $$3, $$4);
            this.a($$0, $$2, $$3, this.i);
            boolean $$11 = this.a($$0, $$2, $$3, $$4, $$5, $$6, $$7);
            this.a(this.i, $$0, $$3 + $$4, $$2, $$6, $$7);
            if (!$$11) {
               this.j.a($$8, this.aI_(), new fuu($$3, $$2, $$4, $$5));
            }
         }
      }

      private void a(fpz $$0, int $$1, int $$2, int $$3) {
         int $$4 = this.b($$2);
         int $$5 = this.a($$1);
         wv $$6 = fhz.a(this.i.v, this.i.d());
         int $$7 = this.a($$2, $$3, $$6);
         this.a($$0, this.i.b(), $$4, $$5, $$7, -1);
         if ($$6 != wu.a && !this.i.i()) {
            $$0.b(fhz.this.p, $$6, $$7, $$5, -8355712);
         }
      }

      private void b(fpz $$0, int $$1, int $$2, int $$3) {
         int $$4 = this.b($$2);
         int $$5 = this.a($$1);
         int $$6 = this.c($$5);
         String $$7 = this.i.c();
         boolean $$8 = this.i.i();
         if ($$8 && $$7 != null) {
            wv $$9 = wv.b($$7).a(n.h);
            $$0.b(fhz.this.p, wv.a("mco.selectServer.minigameName", $$9).b(-171), $$4, $$6, -1);
         } else {
            int $$10 = this.a(this.i, $$0, $$2, $$3, $$5);
            this.a($$0, this.i.a(), $$4, this.c($$5), $$10, -8355712);
         }
      }

      private boolean a(fpz $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6) {
         List<ProfileResult> $$7 = fhz.this.aK.a(this.i.a);
         if (!$$7.isEmpty()) {
            int $$8 = $$2 + $$3 - 21;
            int $$9 = $$1 + $$4 - 9 - 2;
            int $$10 = $$8;

            for (int $$11 = 0; $$11 < $$7.size(); $$11++) {
               $$10 -= 9 + ($$11 == 0 ? 0 : 3);
               frm.a($$0, fnd.Q().an().b($$7.get($$11).profile()), $$10, $$9, 9);
            }

            if ($$5 >= $$10 && $$5 <= $$8 && $$6 >= $$9 && $$6 <= $$9 + 9) {
               $$0.a(fhz.this.p, List.of(f), Optional.of(new fyo.a($$7)), $$5, $$6);
               return true;
            }
         }

         return false;
      }

      private void d() {
         fhz.this.m.ak().a(hkk.a(awk.Bp, 1.0F));
         fhz.a(this.i, fhz.this);
      }

      private void e() {
         fhz.this.m.ak().a(hkk.a(awk.Bp, 1.0F));
         fkq $$0 = new fkq(fhz.this, this.i, this.i.h());
         fhz.this.m.a($$0);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         if (this.i.e == fjf.c.c) {
            this.e();
         } else if (fhz.this.a(this.i)) {
            if (af.c() - fhz.this.aN < 250L && this.aI_()) {
               this.d();
            }

            fhz.this.aN = af.c();
         }

         return true;
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         if (fup.a($$0)) {
            if (this.i.e == fjf.c.c) {
               this.e();
               return true;
            }

            if (fhz.this.a(this.i)) {
               this.d();
               return true;
            }
         }

         return super.a($$0, $$1, $$2);
      }

      @Override
      public wv a() {
         return (wv)(this.i.e == fjf.c.c ? fhz.Z : wv.a("narrator.select", Objects.requireNonNullElse(this.i.c, "unknown server")));
      }

      public fjf c() {
         return this.i;
      }
   }
}
