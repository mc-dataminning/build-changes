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

public class fjn extends hpb {
   static final alg b = alg.b("icon/info");
   static final alg c = alg.b("icon/new_realm");
   static final alg C = alg.b("realm_status/expired");
   static final alg D = alg.b("realm_status/expires_soon");
   static final alg E = alg.b("realm_status/open");
   static final alg F = alg.b("realm_status/closed");
   private static final alg G = alg.b("icon/invite");
   private static final alg H = alg.b("icon/news");
   public static final alg a = alg.b("hud/heart/hardcore_full");
   static final Logger I = LogUtils.getLogger();
   private static final alg J = alg.b("textures/gui/title/realms.png");
   private static final alg K = alg.b("textures/gui/realms/no_realms.png");
   private static final wy L = wy.c("menu.online");
   private static final wy M = wy.c("mco.selectServer.loading");
   static final wy N = wy.c("mco.selectServer.uninitialized");
   static final wy O = wy.c("mco.selectServer.expiredList");
   private static final wy P = wy.c("mco.selectServer.expiredRenew");
   static final wy Q = wy.c("mco.selectServer.expiredTrial");
   private static final wy R = wy.c("mco.selectServer.play");
   private static final wy S = wy.c("mco.selectServer.leave");
   private static final wy T = wy.c("mco.selectServer.configure");
   static final wy U = wy.c("mco.selectServer.expired");
   static final wy V = wy.c("mco.selectServer.expires.soon");
   static final wy W = wy.c("mco.selectServer.expires.day");
   static final wy X = wy.c("mco.selectServer.open");
   static final wy Y = wy.c("mco.selectServer.closed");
   static final wy Z = wy.a("gui.narrate.button", N);
   private static final wy aa = wy.c("mco.selectServer.noRealms");
   private static final wy ab = wy.c("mco.invites.nopending");
   private static final wy ac = wy.c("mco.invites.pending");
   private static final wy ad = wy.c("mco.compatibility.incompatible.popup.title");
   private static final wy ae = wy.c("mco.compatibility.incompatible.releaseType.popup.message");
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
   private final CompletableFuture<fjm.a> aw = fjm.a();
   @Nullable
   private fmz.c ax;
   private final Set<UUID> ay = new HashSet<>();
   private static boolean az;
   private final RateLimiter aA;
   private final fxu aB;
   private fsc aC;
   private fsc aD;
   private fsc aE;
   private fsc aF;
   private fsc aG;
   fjn.j aH;
   flt aI;
   List<fkt> aJ = List.of();
   fkw aK = new fkw();
   private volatile boolean aL;
   @Nullable
   private volatile String aM;
   long aN;
   final List<fks> aO = new ArrayList<>();
   private fsc aP;
   private fjn.g aQ;
   private fjn.g aR;
   private fjn.f aS;
   @Nullable
   private fvq aT;

   public fjn(fxu $$0) {
      super(L);
      this.aB = $$0;
      this.aA = RateLimiter.create(0.016666668F);
   }

   @Override
   public void aN_() {
      this.aI = new flt(this.m);
      this.aH = new fjn.j();
      wy $$0 = wy.c("mco.invites.title");
      this.aQ = new fjn.g($$0, G, $$1x -> this.m.a(new fmm(this, $$0)));
      wy $$1 = wy.c("mco.news");
      this.aR = new fjn.g($$1, H, $$0x -> {
         String $$1x = this.aM;
         if ($$1x != null) {
            fwr.a(this, $$1x);
            if (this.aR.a() != 0) {
               fnf.a $$2 = fnf.b();
               $$2.b = false;
               fnf.b($$2);
               this.aR.a(0);
            }
         }
      });
      this.aR.a(ftn.a($$1));
      this.aC = fsc.a(R, $$0x -> a(this.O(), this)).a(100).a();
      this.aF = fsc.a(T, $$0x -> this.f(this.O())).a(100).a();
      this.aE = fsc.a(P, $$0x -> this.e(this.O())).a(100).a();
      this.aG = fsc.a(S, $$0x -> this.g(this.O())).a(100).a();
      this.aP = fsc.a(wy.c("mco.selectServer.purchase"), $$0x -> this.P()).b(100, 20).a();
      this.aD = fsc.a(wx.k, $$0x -> this.aK_()).a(100).a();
      if (fjs.a == fjs.b.b) {
         this.c(fsj.a(wy.b("Snapshot"), wy.b("Release")).a(5, 5, 100, 20, wy.b("Realm"), ($$0x, $$1x) -> {
            av = $$1x;
            this.aJ = List.of();
            this.I();
         }));
      }

      this.a(fjn.f.a);
      this.H();
      this.aw.thenAcceptAsync($$0x -> {
         fxu $$1x = $$0x.a(this.aB);
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
         this.a(fjn.f.b);
      } else {
         this.a(fjn.f.c);
      }
   }

   private void a(fjn.f $$0) {
      if (this.aS != $$0) {
         if (this.aT != null) {
            this.aT.a($$1 -> this.e($$1));
         }

         this.aT = this.b($$0);
         this.aS = $$0;
         this.aT.a($$1 -> {
            fsa var10000 = this.c($$1);
         });
         this.c();
      }
   }

   private fvq b(fjn.f $$0) {
      fvq $$1 = new fvq(this);
      $$1.b(44);
      $$1.a(this.F());
      fvr $$2 = this.c($$0);
      $$2.a();
      $$1.a($$2.y() + 22);
      $$1.b($$2);
      switch ($$0) {
         case a:
            $$1.c(new fsr(this.p, M));
            break;
         case b:
            $$1.c(this.G());
            break;
         case c:
            $$1.c(this.aH);
      }

      return $$1;
   }

   private fvr F() {
      int $$0 = 90;
      fvu $$1 = fvu.e().a(4);
      $$1.c().e();
      $$1.a(this.aQ);
      $$1.a(this.aR);
      fvu $$2 = fvu.e();
      $$2.c().e();
      $$2.a(fvv.a(90));
      $$2.a(fsp.a(128, 34, J, 128, 64), fvt::b);
      $$2.a(new fvo(90, 44)).a($$1, fvt::c);
      return $$2;
   }

   private fvr c(fjn.f $$0) {
      fvp $$1 = new fvp().c(4);
      fvp.b $$2 = $$1.d(3);
      if ($$0 == fjn.f.c) {
         $$2.a(this.aC);
         $$2.a(this.aF);
         $$2.a(this.aE);
         $$2.a(this.aG);
      }

      $$2.a(this.aP);
      $$2.a(this.aD);
      return $$1;
   }

   private fvu G() {
      fvu $$0 = fvu.d().a(8);
      $$0.c().b();
      $$0.a(fsp.a(130, 64, K, 130, 64));
      fsn $$1 = new fsn(308, aa, this.p, false, 4);
      $$0.a($$1);
      return $$0;
   }

   void H() {
      fkt $$0 = this.O();
      this.aP.j = this.aS != fjn.f.a;
      this.aC.j = $$0 != null && this.a($$0);
      this.aE.j = $$0 != null && this.b($$0);
      this.aG.j = $$0 != null && this.d($$0);
      this.aF.j = $$0 != null && this.c($$0);
   }

   boolean a(fkt $$0) {
      boolean $$1 = !$$0.j && $$0.e == fkt.c.b;
      return $$1 && ($$0.d() || $$0.e() || i($$0));
   }

   private boolean b(fkt $$0) {
      return $$0.j && i($$0);
   }

   private boolean c(fkt $$0) {
      return i($$0) && $$0.e != fkt.c.c;
   }

   private boolean d(fkt $$0) {
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
      fos.Q().bb().d.a();
   }

   public static void g() {
      fos.Q().bb().c.a();
   }

   private void I() {
      for (fmz.e<?> $$0 : this.m.bb().a()) {
         $$0.a();
      }
   }

   private fmz.c a(flr $$0) {
      fmz.c $$1 = $$0.a.a();
      $$1.a($$0.c, $$0x -> {
         this.aI.a($$0x.a());
         this.aJ = $$0x.b();
         this.L();
         boolean $$1x = false;

         for (fkt $$2 : this.aI) {
            if (this.j($$2)) {
               $$1x = true;
            }
         }

         if (!az && $$1x) {
            az = true;
            this.M();
         }
      });
      a(fjs::d, $$0x -> {
         this.aO.clear();
         this.aO.addAll($$0x);

         for (fks $$1x : $$0x) {
            if ($$1x instanceof fks.a $$2) {
               fte $$3 = $$2.a(this, this::a);
               if ($$3 != null) {
                  this.m.a($$3);
                  this.a(List.of($$1x));
                  break;
               }
            }
         }

         if (!this.aO.isEmpty() && this.aS != fjn.f.a) {
            this.L();
         }
      });
      $$1.a($$0.d, $$0x -> {
         this.aQ.a($$0x);
         this.aQ.a($$0x == 0 ? ftn.a(ab) : ftn.a(ac));
         if ($$0x > 0 && this.aA.tryAcquire(1)) {
            this.m.aY().c(wy.a("mco.configure.world.invite.narration", $$0x));
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

   void a(Collection<fks> $$0) {
      List<UUID> $$1 = new ArrayList<>($$0.size());

      for (fks $$2 : $$0) {
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

   private static <T> void a(fjn.k<T> $$0, Consumer<T> $$1) {
      fos $$2 = fos.Q();
      CompletableFuture.<T>supplyAsync(() -> {
         try {
            return $$0.request(fjs.a($$2));
         } catch (flo var3) {
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
         List<flc> $$0 = fjr.a();
         fjs $$1 = fjs.a();
         fko $$2 = new fko();
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

      for (fkt $$1 : this.aI) {
         if (this.j($$1)) {
            $$0.add($$1.a);
         }
      }

      return $$0;
   }

   private void e(@Nullable fkt $$0) {
      if ($$0 != null) {
         String $$1 = ayh.a($$0.b, this.m.X().b(), $$0.k);
         this.m.p.a($$1);
         af.n().a($$1);
      }
   }

   private void f(@Nullable fkt $$0) {
      if ($$0 != null && this.m.b($$0.g)) {
         this.m.a(new fmc(this, $$0.a));
      }
   }

   private void g(@Nullable fkt $$0) {
      if ($$0 != null && !this.m.b($$0.g)) {
         wy $$1 = wy.c("mco.configure.world.leave.question.line1");
         this.m.a(fmo.a(this, $$1, $$1x -> this.h($$0)));
      }
   }

   @Nullable
   private fkt O() {
      return this.aH.p() instanceof fjn.l $$0 ? $$0.c() : null;
   }

   private void h(final fkt $$0) {
      (new Thread("Realms-leave-server") {
         @Override
         public void run() {
            try {
               fjs $$0 = fjs.a();
               $$0.d($$0.a);
               fjn.this.m.execute(fjn::g);
            } catch (flo var2) {
               fjn.I.error("Couldn't configure world", var2);
               fjn.this.m.execute(() -> fjn.this.m.a(new fmg(var2, fjn.this)));
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
   public wy i() {
      return (wy)(switch (this.aS) {
         case a -> wx.a(super.i(), M);
         case b -> wx.a(super.i(), aa);
         case c -> super.i();
      });
   }

   @Override
   public void a(fro $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (b()) {
         $$0.b(this.p, "Minecraft " + ab.b().c(), 2, this.o - 10, -1);
      }

      if (this.aL && this.aP.j) {
         flx.a($$0, this.aP);
      }

      switch (fjs.a) {
         case b:
            this.a($$0, "STAGE!", -256);
            break;
         case c:
            this.a($$0, "LOCAL!", 8388479);
      }
   }

   private void P() {
      this.m.a(new flx(this, this.aL));
   }

   public static void a(@Nullable fkt $$0, fxu $$1) {
      a($$0, $$1, false);
   }

   public static void a(@Nullable fkt $$0, fxu $$1, boolean $$2) {
      if ($$0 != null) {
         if (!b() || $$2 || $$0.i()) {
            fos.Q().a(new fmi($$1, new fno($$1, $$0)));
            return;
         }

         switch ($$0.w) {
            case f:
               fos.Q().a(new fmi($$1, new fno($$1, $$0)));
               break;
            case a:
               a($$0, $$1, wy.c("mco.compatibility.unverifiable.title").b(-171), wy.c("mco.compatibility.unverifiable.message"), wx.j);
               break;
            case d:
               a(
                  $$0,
                  $$1,
                  wy.c("selectWorld.backupQuestion.downgrade").b(-2142128),
                  wy.a("mco.compatibility.downgrade.description", wy.b($$0.v).b(-171), wy.b(ab.b().c()).b(-171)),
                  wy.c("mco.compatibility.downgrade")
               );
               break;
            case e:
               b($$0, $$1);
               break;
            case b:
               fos.Q()
                  .a(
                     new fte.a($$1, ad)
                        .a(wy.a("mco.compatibility.incompatible.series.popup.message", wy.b($$0.v).b(-171), wy.b(ab.b().c()).b(-171)))
                        .a(wx.k, fte::aK_)
                        .a()
                  );
               break;
            case c:
               fos.Q().a(new fte.a($$1, ad).a(ae).a(wx.k, fte::aK_).a());
         }
      }
   }

   private static void a(fkt $$0, fxu $$1, wy $$2, wy $$3, wy $$4) {
      fos.Q().a(new fte.a($$1, $$2).a($$3).a($$4, $$2x -> {
         fos.Q().a(new fmi($$1, new fno($$1, $$0)));
         g();
      }).a(wx.e, fte::aK_).a());
   }

   private static void b(fkt $$0, fxu $$1) {
      wy $$2 = wy.c("mco.compatibility.upgrade.title").b(-171);
      wy $$3 = wy.c("mco.compatibility.upgrade");
      wy $$4 = wy.b($$0.v).b(-171);
      wy $$5 = wy.b(ab.b().c()).b(-171);
      wy $$6 = i($$0) ? wy.a("mco.compatibility.upgrade.description", $$4, $$5) : wy.a("mco.compatibility.upgrade.friend.description", $$4, $$5);
      a($$0, $$1, $$2, $$6, $$3);
   }

   public static wy a(String $$0, boolean $$1) {
      return a($$0, $$1 ? -8355712 : -2142128);
   }

   public static wy a(String $$0, int $$1) {
      return (wy)(StringUtils.isBlank($$0) ? wx.a : wy.b($$0).b($$1));
   }

   public static wy a(int $$0, boolean $$1) {
      return (wy)($$1 ? wy.c("gameMode.hardcore").b(-65536) : dis.a($$0).d());
   }

   static boolean i(fkt $$0) {
      return fos.Q().b($$0.g);
   }

   private boolean j(fkt $$0) {
      return i($$0) && !$$0.j;
   }

   private void a(fro $$0, String $$1, int $$2) {
      $$0.c().a();
      $$0.c().a((float)(this.n / 2 - 25), 20.0F, 0.0F);
      $$0.c().a(a.f.rotationDegrees(-20.0F));
      $$0.c().b(1.5F, 1.5F, 1.5F);
      $$0.b(this.p, $$1, 0, 0, $$2);
      $$0.c().b();
   }

   class a extends fjn.e {
      private static final wy f = wy.c("mco.snapshot.start");
      private static final int g = 5;
      private final ftq h = new ftq();
      private final fkt i;

      public a(final fkt $$0) {
         this.i = $$0;
         this.h.a(ftn.a(wy.c("mco.snapshot.tooltip")));
      }

      @Override
      public void a(fro $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(gqc::H, fjn.c, $$3 - 5, $$2 + $$5 / 2 - 10, 40, 20);
         int $$10 = $$2 + $$5 / 2 - 9 / 2;
         $$0.b(fjn.this.p, f, $$3 + 40 - 2, $$10 - 5, 8388479);
         $$0.b(fjn.this.p, wy.a("mco.snapshot.description", Objects.requireNonNullElse(this.i.c, "unknown server")), $$3 + 40 - 2, $$10 + 5, -8355712);
         this.h.a($$8, this.aI_(), new fwj($$3, $$2, $$4, $$5));
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         this.c();
         return true;
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         if (fwe.a($$0)) {
            this.c();
            return false;
         } else {
            return super.a($$0, $$1, $$2);
         }
      }

      private void c() {
         fjn.this.m.ak().a(hmh.a(awn.Bs, 1.0F));
         fjn.this.m
            .a(
               new fte.a(fjn.this, wy.c("mco.snapshot.createSnapshotPopup.title"))
                  .a(wy.c("mco.snapshot.createSnapshotPopup.text"))
                  .a(wy.c("mco.selectServer.create"), $$0 -> fjn.this.m.a(new fme(fjn.this, this.i, true)))
                  .a(wx.e, fte::aK_)
                  .a()
            );
      }

      @Override
      public wy a() {
         return wy.a("gui.narrate.button", wx.a(f, wy.a("mco.snapshot.description", Objects.requireNonNullElse(this.i.c, "unknown server"))));
      }
   }

   class b extends fjn.e {
      private final fsc f;

      public b(final fsc $$0) {
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
      public void a(fro $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.f.c(fjn.this.n / 2 - 75, $$2 + 4);
         this.f.a($$0, $$6, $$7, $$9);
      }

      @Override
      public void a(boolean $$0) {
         super.a($$0);
         this.f.a($$0);
      }

      @Override
      public wy a() {
         return this.f.B();
      }
   }

   static class c extends fso {
      private static final ftp b = new ftp(alg.b("widget/cross_button"), alg.b("widget/cross_button_highlighted"));

      protected c(fsc.c $$0, wy $$1) {
         super(0, 0, 14, 14, b, $$0);
         this.a(ftn.a($$1));
      }
   }

   class d extends fjn.e {
      @Override
      public void a(fro $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
      }

      @Override
      public wy a() {
         return wy.i();
      }
   }

   abstract class e extends fsy.a<fjn.e> {
      protected static final int b = 10;
      private static final int a = 28;
      protected static final int c = 7;
      protected static final int d = 2;

      protected void a(fkt $$0, fro $$1, int $$2, int $$3, int $$4, int $$5) {
         int $$6 = $$2 - 10 - 7;
         int $$7 = $$3 + 2;
         if ($$0.j) {
            this.a($$1, $$6, $$7, $$4, $$5, fjn.C, () -> fjn.U);
         } else if ($$0.e == fkt.c.a) {
            this.a($$1, $$6, $$7, $$4, $$5, fjn.F, () -> fjn.Y);
         } else if (fjn.i($$0) && $$0.l < 7) {
            this.a($$1, $$6, $$7, $$4, $$5, fjn.D, () -> {
               if ($$0.l <= 0) {
                  return fjn.V;
               } else {
                  return (wy)($$0.l == 1 ? fjn.W : wy.a("mco.selectServer.expires.days", $$0.l));
               }
            });
         } else if ($$0.e == fkt.c.b) {
            this.a($$1, $$6, $$7, $$4, $$5, fjn.E, () -> fjn.X);
         }
      }

      private void a(fro $$0, int $$1, int $$2, int $$3, int $$4, alg $$5, Supplier<wy> $$6) {
         $$0.a(gqc::H, $$5, $$1, $$2, 10, 28);
         if (fjn.this.aH.a_((double)$$3, (double)$$4) && $$3 >= $$1 && $$3 <= $$1 + 10 && $$4 >= $$2 && $$4 <= $$2 + 28) {
            fjn.this.d($$6.get());
         }
      }

      protected void a(fro $$0, int $$1, int $$2, fkt $$3) {
         int $$4 = this.b($$2);
         int $$5 = this.a($$1);
         int $$6 = this.d($$5);
         if (!fjn.i($$3)) {
            $$0.b(fjn.this.p, $$3.f, $$4, this.d($$5), -8355712);
         } else if ($$3.j) {
            wy $$7 = $$3.k ? fjn.Q : fjn.O;
            $$0.b(fjn.this.p, $$7, $$4, $$6, -2142128);
         }
      }

      protected void a(fro $$0, @Nullable String $$1, int $$2, int $$3, int $$4, int $$5) {
         if ($$1 != null) {
            int $$6 = $$4 - $$2;
            if (fjn.this.p.b($$1) > $$6) {
               String $$7 = fjn.this.p.a($$1, $$6 - fjn.this.p.b("... "));
               $$0.b(fjn.this.p, $$7 + "...", $$2, $$3, $$5);
            } else {
               $$0.b(fjn.this.p, $$1, $$2, $$3, $$5);
            }
         }
      }

      protected int a(int $$0, int $$1, wy $$2) {
         return $$0 + $$1 - fjn.this.p.a($$2) - 20;
      }

      protected int b(int $$0, int $$1, wy $$2) {
         return $$0 + $$1 - fjn.this.p.a($$2) - 20;
      }

      protected int a(fkt $$0, fro $$1, int $$2, int $$3, int $$4) {
         boolean $$5 = $$0.n;
         int $$6 = $$0.o;
         int $$7 = $$2;
         if (dis.c($$6)) {
            wy $$8 = fjn.a($$6, $$5);
            $$7 = this.b($$2, $$3, $$8);
            $$1.b(fjn.this.p, $$8, $$7, this.c($$4), -8355712);
         }

         if ($$5) {
            $$7 -= 10;
            $$1.a(gqc::H, fjn.a, $$7, this.c($$4), 8, 8);
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

   static class g extends fth.b {
      private static final alg[] d = new alg[]{
         alg.b("notification/1"),
         alg.b("notification/2"),
         alg.b("notification/3"),
         alg.b("notification/4"),
         alg.b("notification/5"),
         alg.b("notification/more")
      };
      private static final int u = Integer.MAX_VALUE;
      private static final int v = 20;
      private static final int w = 14;
      private int x;

      public g(wy $$0, alg $$1, fsc.c $$2) {
         super(20, 20, $$0, 14, 14, $$1, $$2, null);
      }

      int a() {
         return this.x;
      }

      public void a(int $$0) {
         this.x = $$0;
      }

      @Override
      public void b(fro $$0, int $$1, int $$2, float $$3) {
         super.b($$0, $$1, $$2, $$3);
         if (this.j && this.x != 0) {
            this.a($$0);
         }
      }

      private void a(fro $$0) {
         $$0.a(gqc::H, d[Math.min(this.x, 6) - 1], this.F() + this.A() - 5, this.G() - 3, 8, 8);
      }
   }

   class h extends fjn.e {
      private static final int f = 40;
      private static final int g = -12303292;
      private final wy h;
      private final int i;
      private final List<fsa> j = new ArrayList<>();
      @Nullable
      private final fjn.c k;
      private final fsw l;
      private final fvp m;
      private final fvo n;
      private int o = -1;

      public h(final wy $$0, final int $$1, final fks $$2) {
         this.h = $$0;
         this.i = $$1;
         this.m = new fvp();
         int $$3 = 7;
         this.m.a(fsp.a(20, 20, fjn.b), 0, 0, this.m.b().a(7, 7, 0, 0));
         this.m.a(fvv.a(40), 0, 0);
         this.n = this.m.a(new fvo(0, 9 * 3 * ($$1 - 1)), 0, 1, this.m.b().c(7));
         this.l = this.n.a(new fsw($$0, fjn.this.p).b(true), this.n.b().b().d());
         this.m.a(fvv.a(40), 0, 2);
         if ($$2.b()) {
            this.k = this.m.a(new fjn.c($$1x -> fjn.this.a($$2.c()), wy.c("mco.notification.dismiss")), 0, 2, this.m.b().c().a(0, 7, 7, 0));
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
      public void b(fro $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         super.b($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
         $$0.b($$3 - 2, $$2 - 2, $$4, 36 * this.i - 2, -12303292);
      }

      @Override
      public void a(fro $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
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
      public wy a() {
         return this.h;
      }
   }

   class i extends fjn.e {
      private final fkt f;
      private final ftq g = new ftq();

      public i(final fkt $$0) {
         this.f = $$0;
         if (!$$0.j) {
            this.g.a(ftn.a(wy.c("mco.snapshot.parent.tooltip")));
         }
      }

      @Override
      public void a(fro $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = this.b($$3);
         int $$11 = this.a($$2);
         fnh.a($$0, $$3, $$2, 32, this.f.g);
         wy $$12 = fjn.a(this.f.v, -8355712);
         int $$13 = this.a($$3, $$4, $$12);
         this.a($$0, this.f.b(), $$10, $$11, $$13, -8355712);
         if ($$12 != wx.a) {
            $$0.b(fjn.this.p, $$12, $$13, $$11, -8355712);
         }

         int $$14 = $$3;
         if (!this.f.i()) {
            $$14 = this.a(this.f, $$0, $$3, $$4, $$11);
         }

         this.a($$0, this.f.a(), $$10, this.c($$11), $$14, -8355712);
         this.a($$0, $$2, $$3, this.f);
         this.a(this.f, $$0, $$3 + $$4, $$2, $$6, $$7);
         this.g.a($$8, this.aI_(), new fwj($$3, $$2, $$4, $$5));
      }

      @Override
      public wy a() {
         return wy.b(Objects.requireNonNullElse(this.f.c, "unknown server"));
      }
   }

   class j extends fsy<fjn.e> {
      public j() {
         super(fos.Q(), fjn.this.n, fjn.this.o, 0, 36);
      }

      public void a(@Nullable fjn.e $$0) {
         super.a($$0);
         fjn.this.H();
      }

      @Override
      public int a() {
         return 300;
      }

      void a(fjn $$0, @Nullable fkt $$1) {
         this.s();

         for (fks $$2 : fjn.this.aO) {
            if ($$2 instanceof fks.c $$3) {
               this.a($$3, $$0);
               fjn.this.a(List.of($$2));
               break;
            }
         }

         this.a($$1);
      }

      private void a(@Nullable fkt $$0) {
         for (fkt $$1 : fjn.this.aJ) {
            this.b(fjn.this.new a($$1));
         }

         for (fkt $$2 : fjn.this.aI) {
            fjn.e $$3;
            if (fjn.b() && !$$2.h()) {
               if ($$2.e == fkt.c.c) {
                  continue;
               }

               $$3 = fjn.this.new i($$2);
            } else {
               $$3 = fjn.this.new l($$2);
            }

            this.b($$3);
            if ($$0 != null && $$0.a == $$2.a) {
               this.a($$3);
            }
         }
      }

      private void a(fks.c $$0, fjn $$1) {
         wy $$2 = $$0.d();
         int $$3 = fjn.this.p.b($$2, 216);
         int $$4 = azm.e($$3 + 7, 36) - 1;
         this.b(fjn.this.new h($$2, $$4 + 2, $$0));

         for (int $$5 = 0; $$5 < $$4; $$5++) {
            this.b(fjn.this.new d());
         }

         this.b(fjn.this.new b($$0.a($$1)));
      }
   }

   interface k<T> {
      T request(fjs var1) throws flo;
   }

   class l extends fjn.e {
      private static final wy f = wy.c("mco.onlinePlayers");
      private static final int g = 9;
      private static final int h = 36;
      private final fkt i;
      private final ftq j = new ftq();

      public l(final fkt $$0) {
         this.i = $$0;
         boolean $$1 = fjn.i($$0);
         if (fjn.b() && $$1 && $$0.h()) {
            this.j.a(ftn.a(wy.a("mco.snapshot.paired", $$0.u)));
         } else if (!$$1 && $$0.f()) {
            this.j.a(ftn.a(wy.a("mco.snapshot.friendsRealm.downgrade", $$0.v)));
         }
      }

      @Override
      public void a(fro $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         if (this.i.e == fkt.c.c) {
            $$0.a(gqc::H, fjn.c, $$3 - 5, $$2 + $$5 / 2 - 10, 40, 20);
            int $$10 = $$2 + $$5 / 2 - 9 / 2;
            $$0.b(fjn.this.p, fjn.N, $$3 + 40 - 2, $$10, 8388479);
         } else {
            this.a(this.i, $$0, $$3 + 36, $$2, $$6, $$7);
            fnh.a($$0, $$3, $$2, 32, this.i.g);
            this.a($$0, $$2, $$3, $$4);
            this.b($$0, $$2, $$3, $$4);
            this.a($$0, $$2, $$3, this.i);
            boolean $$11 = this.a($$0, $$2, $$3, $$4, $$5, $$6, $$7);
            this.a(this.i, $$0, $$3 + $$4, $$2, $$6, $$7);
            if (!$$11) {
               this.j.a($$8, this.aI_(), new fwj($$3, $$2, $$4, $$5));
            }
         }
      }

      private void a(fro $$0, int $$1, int $$2, int $$3) {
         int $$4 = this.b($$2);
         int $$5 = this.a($$1);
         wy $$6 = fjn.a(this.i.v, this.i.d());
         int $$7 = this.a($$2, $$3, $$6);
         this.a($$0, this.i.b(), $$4, $$5, $$7, -1);
         if ($$6 != wx.a && !this.i.i()) {
            $$0.b(fjn.this.p, $$6, $$7, $$5, -8355712);
         }
      }

      private void b(fro $$0, int $$1, int $$2, int $$3) {
         int $$4 = this.b($$2);
         int $$5 = this.a($$1);
         int $$6 = this.c($$5);
         String $$7 = this.i.c();
         boolean $$8 = this.i.i();
         if ($$8 && $$7 != null) {
            wy $$9 = wy.b($$7).a(n.h);
            $$0.b(fjn.this.p, wy.a("mco.selectServer.minigameName", $$9).b(-171), $$4, $$6, -1);
         } else {
            int $$10 = this.a(this.i, $$0, $$2, $$3, $$5);
            this.a($$0, this.i.a(), $$4, this.c($$5), $$10, -8355712);
         }
      }

      private boolean a(fro $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6) {
         List<ProfileResult> $$7 = fjn.this.aK.a(this.i.a);
         if (!$$7.isEmpty()) {
            int $$8 = $$2 + $$3 - 21;
            int $$9 = $$1 + $$4 - 9 - 2;
            int $$10 = $$8;

            for (int $$11 = 0; $$11 < $$7.size(); $$11++) {
               $$10 -= 9 + ($$11 == 0 ? 0 : 3);
               ftb.a($$0, fos.Q().an().b($$7.get($$11).profile()), $$10, $$9, 9);
            }

            if ($$5 >= $$10 && $$5 <= $$8 && $$6 >= $$9 && $$6 <= $$9 + 9) {
               $$0.a(fjn.this.p, List.of(f), Optional.of(new gad.a($$7)), $$5, $$6);
               return true;
            }
         }

         return false;
      }

      private void d() {
         fjn.this.m.ak().a(hmh.a(awn.Bs, 1.0F));
         fjn.a(this.i, fjn.this);
      }

      private void e() {
         fjn.this.m.ak().a(hmh.a(awn.Bs, 1.0F));
         fme $$0 = new fme(fjn.this, this.i, this.i.h());
         fjn.this.m.a($$0);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         if (this.i.e == fkt.c.c) {
            this.e();
         } else if (fjn.this.a(this.i)) {
            if (af.c() - fjn.this.aN < 250L && this.aI_()) {
               this.d();
            }

            fjn.this.aN = af.c();
         }

         return true;
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         if (fwe.a($$0)) {
            if (this.i.e == fkt.c.c) {
               this.e();
               return true;
            }

            if (fjn.this.a(this.i)) {
               this.d();
               return true;
            }
         }

         return super.a($$0, $$1, $$2);
      }

      @Override
      public wy a() {
         return (wy)(this.i.e == fkt.c.c ? fjn.Z : wy.a("narrator.select", Objects.requireNonNullElse(this.i.c, "unknown server")));
      }

      public fkt c() {
         return this.i;
      }
   }
}
