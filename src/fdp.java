import com.google.common.collect.Lists;
import com.google.common.util.concurrent.RateLimiter;
import com.mojang.authlib.yggdrasil.ProfileResult;
import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;

public class fdp extends hdk {
   static final alc a = alc.b("icon/info");
   static final alc b = alc.b("icon/new_realm");
   static final alc c = alc.b("realm_status/expired");
   static final alc B = alc.b("realm_status/expires_soon");
   static final alc C = alc.b("realm_status/open");
   static final alc D = alc.b("realm_status/closed");
   private static final alc E = alc.b("icon/invite");
   private static final alc F = alc.b("icon/news");
   static final Logger G = LogUtils.getLogger();
   private static final alc H = alc.b("textures/gui/title/realms.png");
   private static final alc I = alc.b("textures/gui/realms/no_realms.png");
   private static final xd J = xd.c("menu.online");
   private static final xd K = xd.c("mco.selectServer.loading");
   static final xd L = xd.c("mco.selectServer.uninitialized");
   static final xd M = xd.c("mco.selectServer.expiredList");
   private static final xd N = xd.c("mco.selectServer.expiredRenew");
   static final xd O = xd.c("mco.selectServer.expiredTrial");
   private static final xd P = xd.c("mco.selectServer.play");
   private static final xd Q = xd.c("mco.selectServer.leave");
   private static final xd R = xd.c("mco.selectServer.configure");
   static final xd S = xd.c("mco.selectServer.expired");
   static final xd T = xd.c("mco.selectServer.expires.soon");
   static final xd U = xd.c("mco.selectServer.expires.day");
   static final xd V = xd.c("mco.selectServer.open");
   static final xd W = xd.c("mco.selectServer.closed");
   static final xd X = xd.a("gui.narrate.button", L);
   private static final xd Y = xd.c("mco.selectServer.noRealms");
   private static final xd Z = xd.c("mco.invites.nopending");
   private static final xd aa = xd.c("mco.invites.pending");
   private static final xd ab = xd.c("mco.compatibility.incompatible.popup.title");
   private static final xd ac = xd.c("mco.compatibility.incompatible.releaseType.popup.message");
   private static final int ad = 100;
   private static final int ae = 3;
   private static final int af = 4;
   private static final int ag = 308;
   private static final int ah = 128;
   private static final int ai = 34;
   private static final int aj = 128;
   private static final int ak = 64;
   private static final int al = 5;
   private static final int am = 44;
   private static final int an = 11;
   private static final int ao = 40;
   private static final int ap = 20;
   private static final int aq = 216;
   private static final int ar = 36;
   private static final boolean as = !ab.b().g();
   private static boolean at = as;
   private final CompletableFuture<fdo.a> au = fdo.a();
   @Nullable
   private fgr.c av;
   private final Set<UUID> aw = new HashSet<>();
   private static boolean ax;
   private final RateLimiter ay;
   private final fqd az;
   private fkk aA;
   private fkk aB;
   private fkk aC;
   private fkk aD;
   private fkk aE;
   fdp.j aF;
   private ffk aG;
   private List<fel> aH = List.of();
   feo aI = new feo();
   private volatile boolean aJ;
   @Nullable
   private volatile String aK;
   long aL;
   private final List<fek> aM = new ArrayList<>();
   private fkk aN;
   private fdp.g aO;
   private fdp.g aP;
   private fdp.f aQ;
   @Nullable
   private fny aR;

   public fdp(fqd $$0) {
      super(J);
      this.az = $$0;
      this.ay = RateLimiter.create(0.016666668F);
   }

   @Override
   public void aR_() {
      this.aG = new ffk(this.m);
      this.aF = new fdp.j();
      xd $$0 = xd.c("mco.invites.title");
      this.aO = new fdp.g($$0, E, $$1x -> this.m.a(new fgd(this, $$0)));
      xd $$1 = xd.c("mco.news");
      this.aP = new fdp.g($$1, F, $$0x -> {
         String $$1x = this.aK;
         if ($$1x != null) {
            fpa.a(this, $$1x);
            if (this.aP.a() != 0) {
               fgx.a $$2 = fgx.b();
               $$2.b = false;
               fgx.b($$2);
               this.aP.a(0);
            }
         }
      });
      this.aP.a(flv.a($$1));
      this.aA = fkk.a(P, $$0x -> a(this.N(), this)).a(100).a();
      this.aD = fkk.a(R, $$0x -> this.f(this.N())).a(100).a();
      this.aC = fkk.a(N, $$0x -> this.e(this.N())).a(100).a();
      this.aE = fkk.a(Q, $$0x -> this.g(this.N())).a(100).a();
      this.aN = fkk.a(xd.c("mco.selectServer.purchase"), $$0x -> this.O()).b(100, 20).a();
      this.aB = fkk.a(xc.k, $$0x -> this.d()).a(100).a();
      if (fdu.a == fdu.b.b) {
         this.c(fkr.a(xd.b("Snapshot"), xd.b("Release")).a(5, 5, 100, 20, xd.b("Realm"), ($$0x, $$1x) -> {
            at = $$1x;
            this.aH = List.of();
            this.J();
         }));
      }

      this.a(fdp.f.a);
      this.G();
      this.au.thenAcceptAsync($$0x -> {
         fqd $$1x = $$0x.a(this.az);
         if ($$1x == null) {
            this.av = this.a(this.m.bc());
         } else {
            this.m.a($$1x);
         }
      }, this.r);
   }

   public static boolean b() {
      return as && at;
   }

   @Override
   protected void c() {
      if (this.aR != null) {
         this.aF.a(this.n, this.aR);
         this.aR.a();
      }
   }

   @Override
   public void d() {
      this.m.a(this.az);
   }

   private void D() {
      if (this.aG.a() && this.aH.isEmpty() && this.aM.isEmpty()) {
         this.a(fdp.f.b);
      } else {
         this.a(fdp.f.c);
      }
   }

   private void a(fdp.f $$0) {
      if (this.aQ != $$0) {
         if (this.aR != null) {
            this.aR.a($$1 -> this.e($$1));
         }

         this.aR = this.b($$0);
         this.aQ = $$0;
         this.aR.a($$1 -> {
            fki var10000 = this.c($$1);
         });
         this.c();
      }
   }

   private fny b(fdp.f $$0) {
      fny $$1 = new fny(this);
      $$1.b(44);
      $$1.a(this.E());
      fnz $$2 = this.c($$0);
      $$2.a();
      $$1.a($$2.w() + 22);
      $$1.b($$2);
      switch ($$0) {
         case a:
            $$1.c(new fkz(this.p, K));
            break;
         case b:
            $$1.c(this.F());
            break;
         case c:
            $$1.c(this.aF);
      }

      return $$1;
   }

   private fnz E() {
      int $$0 = 90;
      foc $$1 = foc.e().a(4);
      $$1.c().e();
      $$1.a(this.aO);
      $$1.a(this.aP);
      foc $$2 = foc.e();
      $$2.c().e();
      $$2.a(fod.a(90));
      $$2.a(fkx.a(128, 34, H, 128, 64), fob::b);
      $$2.a(new fnw(90, 44)).a($$1, fob::c);
      return $$2;
   }

   private fnz c(fdp.f $$0) {
      fnx $$1 = new fnx().c(4);
      fnx.b $$2 = $$1.d(3);
      if ($$0 == fdp.f.c) {
         $$2.a(this.aA);
         $$2.a(this.aD);
         $$2.a(this.aC);
         $$2.a(this.aE);
      }

      $$2.a(this.aN);
      $$2.a(this.aB);
      return $$1;
   }

   private foc F() {
      foc $$0 = foc.d().a(8);
      $$0.c().b();
      $$0.a(fkx.a(130, 64, I, 130, 64));
      fkv $$1 = new fkv(308, Y, this.p, false, 4);
      $$0.a($$1);
      return $$0;
   }

   void G() {
      fel $$0 = this.N();
      this.aN.j = this.aQ != fdp.f.a;
      this.aA.j = $$0 != null && this.a($$0);
      this.aC.j = $$0 != null && this.b($$0);
      this.aE.j = $$0 != null && this.d($$0);
      this.aD.j = $$0 != null && this.c($$0);
   }

   boolean a(fel $$0) {
      boolean $$1 = !$$0.j && $$0.e == fel.c.b;
      return $$1 && ($$0.d() || $$0.e() || i($$0));
   }

   private boolean b(fel $$0) {
      return $$0.j && i($$0);
   }

   private boolean c(fel $$0) {
      return i($$0) && $$0.e != fel.c.c;
   }

   private boolean d(fel $$0) {
      return !i($$0);
   }

   @Override
   public void e() {
      super.e();
      if (this.av != null) {
         this.av.b();
      }
   }

   public static void f() {
      fil.Q().bc().d.a();
   }

   public static void g() {
      fil.Q().bc().c.a();
   }

   private void J() {
      for (fgr.e<?> $$0 : this.m.bc().a()) {
         $$0.a();
      }
   }

   private fgr.c a(ffi $$0) {
      fgr.c $$1 = $$0.a.a();
      $$1.a($$0.c, $$0x -> {
         this.aG.a($$0x.a());
         this.aH = $$0x.b();
         this.K();
         boolean $$1x = false;

         for (fel $$2 : this.aG) {
            if (this.j($$2)) {
               $$1x = true;
            }
         }

         if (!ax && $$1x) {
            ax = true;
            this.L();
         }
      });
      a(fdu::d, $$0x -> {
         this.aM.clear();
         this.aM.addAll($$0x);

         for (fek $$1x : $$0x) {
            if ($$1x instanceof fek.a $$2) {
               flm $$3 = $$2.a(this, this::a);
               if ($$3 != null) {
                  this.m.a($$3);
                  this.a(List.of($$1x));
                  break;
               }
            }
         }

         if (!this.aM.isEmpty() && this.aQ != fdp.f.a) {
            this.K();
         }
      });
      $$1.a($$0.d, $$0x -> {
         this.aO.a($$0x);
         this.aO.a($$0x == 0 ? flv.a(Z) : flv.a(aa));
         if ($$0x > 0 && this.ay.tryAcquire(1)) {
            this.m.aZ().c(xd.a("mco.configure.world.invite.narration", $$0x));
         }
      });
      $$1.a($$0.e, $$0x -> this.aJ = $$0x);
      $$1.a($$0.g, $$0x -> this.aI = $$0x);
      $$1.a($$0.f, $$1x -> {
         $$0.h.a($$1x);
         this.aK = $$0.h.b();
         this.aP.a($$0.h.a() ? Integer.MAX_VALUE : 0);
      });
      return $$1;
   }

   private void a(Collection<fek> $$0) {
      List<UUID> $$1 = new ArrayList<>($$0.size());

      for (fek $$2 : $$0) {
         if (!$$2.a() && !this.aw.contains($$2.c())) {
            $$1.add($$2.c());
         }
      }

      if (!$$1.isEmpty()) {
         a($$1x -> {
            $$1x.a($$1);
            return null;
         }, $$1x -> this.aw.addAll($$1));
      }
   }

   private static <T> void a(fdp.k<T> $$0, Consumer<T> $$1) {
      fil $$2 = fil.Q();
      CompletableFuture.<T>supplyAsync(() -> {
         try {
            return $$0.request(fdu.a($$2));
         } catch (fff var3) {
            throw new RuntimeException(var3);
         }
      }).thenAcceptAsync($$1, $$2).exceptionally($$0x -> {
         G.error("Failed to execute call to Realms Service", $$0x);
         return null;
      });
   }

   private void K() {
      fel $$0 = this.N();
      this.aF.J();

      for (fek $$1 : this.aM) {
         if (this.a($$1)) {
            this.a(List.of($$1));
            break;
         }
      }

      for (fel $$2 : this.aH) {
         this.aF.a(new fdp.a($$2));
      }

      for (fel $$3 : this.aG) {
         fdp.e $$4;
         if (b() && !$$3.h()) {
            if ($$3.e == fel.c.c) {
               continue;
            }

            $$4 = new fdp.i($$3);
         } else {
            $$4 = new fdp.l($$3);
         }

         this.aF.a((fdp.e)$$4);
         if ($$0 != null && $$0.a == $$3.a) {
            this.aF.a($$4);
         }
      }

      this.D();
      this.G();
   }

   private boolean a(fek $$0) {
      if (!($$0 instanceof fek.c $$1)) {
         return false;
      } else {
         xd $$2 = $$1.d();
         int $$3 = this.p.b($$2, 216);
         int $$4 = azd.e($$3 + 7, 36) - 1;
         this.aF.a(new fdp.h($$2, $$4 + 2, $$1));

         for (int $$5 = 0; $$5 < $$4; $$5++) {
            this.aF.a(new fdp.d());
         }

         this.aF.a(new fdp.b($$1.a(this)));
         return true;
      }
   }

   private void L() {
      new Thread(() -> {
         List<fet> $$0 = fdt.a();
         fdu $$1 = fdu.a();
         feg $$2 = new feg();
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

      for (fel $$1 : this.aG) {
         if (this.j($$1)) {
            $$0.add($$1.a);
         }
      }

      return $$0;
   }

   private void e(@Nullable fel $$0) {
      if ($$0 != null) {
         String $$1 = axz.a($$0.b, this.m.X().b(), $$0.k);
         this.m.p.a($$1);
         ad.m().a($$1);
      }
   }

   private void f(@Nullable fel $$0) {
      if ($$0 != null && this.m.b($$0.g)) {
         this.m.a(new fft(this, $$0.a));
      }
   }

   private void g(@Nullable fel $$0) {
      if ($$0 != null && !this.m.b($$0.g)) {
         xd $$1 = xd.c("mco.configure.world.leave.question.line1");
         this.m.a(fgf.a(this, $$1, $$1x -> this.h($$0)));
      }
   }

   @Nullable
   private fel N() {
      return this.aF.h() instanceof fdp.l $$0 ? $$0.c() : null;
   }

   private void h(final fel $$0) {
      (new Thread("Realms-leave-server") {
         @Override
         public void run() {
            try {
               fdu $$0 = fdu.a();
               $$0.d($$0.a);
               fdp.this.m.execute(fdp::g);
            } catch (fff var2) {
               fdp.G.error("Couldn't configure world", var2);
               fdp.this.m.execute(() -> fdp.this.m.a(new ffx(var2, fdp.this)));
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
         this.aM.removeIf($$1x -> $$1x.b() && $$0.equals($$1x.c()));
         this.K();
      });
   }

   public void h() {
      this.aF.a(null);
      g();
   }

   @Override
   public xd i() {
      return (xd)(switch (this.aQ) {
         case a -> xc.a(super.i(), K);
         case b -> xc.a(super.i(), Y);
         case c -> super.i();
      });
   }

   @Override
   public void a(fjx $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (b()) {
         $$0.b(this.p, "Minecraft " + ab.b().c(), 2, this.o - 10, -1);
      }

      if (this.aJ && this.aN.j) {
         ffo.a($$0, this.aN);
      }

      switch (fdu.a) {
         case b:
            this.a($$0, "STAGE!", -256);
            break;
         case c:
            this.a($$0, "LOCAL!", 8388479);
      }
   }

   private void O() {
      this.m.a(new ffo(this, this.aJ));
   }

   public static void a(@Nullable fel $$0, fqd $$1) {
      a($$0, $$1, false);
   }

   public static void a(@Nullable fel $$0, fqd $$1, boolean $$2) {
      if ($$0 != null) {
         if (!b() || $$2 || $$0.i()) {
            fil.Q().a(new ffz($$1, new fhi($$1, $$0)));
            return;
         }

         switch ($$0.u) {
            case f:
               fil.Q().a(new ffz($$1, new fhi($$1, $$0)));
               break;
            case a:
               a($$0, $$1, xd.c("mco.compatibility.unverifiable.title").b(-171), xd.c("mco.compatibility.unverifiable.message"), xc.j);
               break;
            case d:
               a(
                  $$0,
                  $$1,
                  xd.c("selectWorld.backupQuestion.downgrade").b(-2142128),
                  xd.a("mco.compatibility.downgrade.description", xd.b($$0.t).b(-171), xd.b(ab.b().c()).b(-171)),
                  xd.c("mco.compatibility.downgrade")
               );
               break;
            case e:
               b($$0, $$1);
               break;
            case b:
               fil.Q()
                  .a(
                     new flm.a($$1, ab)
                        .a(xd.a("mco.compatibility.incompatible.series.popup.message", xd.b($$0.t).b(-171), xd.b(ab.b().c()).b(-171)))
                        .a(xc.k, flm::d)
                        .a()
                  );
               break;
            case c:
               fil.Q().a(new flm.a($$1, ab).a(ac).a(xc.k, flm::d).a());
         }
      }
   }

   private static void a(fel $$0, fqd $$1, xd $$2, xd $$3, xd $$4) {
      fil.Q().a(new flm.a($$1, $$2).a($$3).a($$4, $$2x -> {
         fil.Q().a(new ffz($$1, new fhi($$1, $$0)));
         g();
      }).a(xc.e, flm::d).a());
   }

   private static void b(fel $$0, fqd $$1) {
      xd $$2 = xd.c("mco.compatibility.upgrade.title").b(-171);
      xd $$3 = xd.c("mco.compatibility.upgrade");
      xd $$4 = xd.b($$0.t).b(-171);
      xd $$5 = xd.b(ab.b().c()).b(-171);
      xd $$6 = i($$0) ? xd.a("mco.compatibility.upgrade.description", $$4, $$5) : xd.a("mco.compatibility.upgrade.friend.description", $$4, $$5);
      a($$0, $$1, $$2, $$6, $$3);
   }

   public static xd a(String $$0, boolean $$1) {
      return a($$0, $$1 ? -8355712 : -2142128);
   }

   public static xd a(String $$0, int $$1) {
      return (xd)(StringUtils.isBlank($$0) ? xc.a : xd.a("mco.version", xd.b($$0).b($$1)));
   }

   static boolean i(fel $$0) {
      return fil.Q().b($$0.g);
   }

   private boolean j(fel $$0) {
      return i($$0) && !$$0.j;
   }

   private void a(fjx $$0, String $$1, int $$2) {
      $$0.c().a();
      $$0.c().a((float)(this.n / 2 - 25), 20.0F, 0.0F);
      $$0.c().a(a.f.rotationDegrees(-20.0F));
      $$0.c().b(1.5F, 1.5F, 1.5F);
      $$0.a(this.p, $$1, 0, 0, $$2, false);
      $$0.c().b();
   }

   class a extends fdp.e {
      private static final xd f = xd.c("mco.snapshot.start");
      private static final int g = 5;
      private final fly h = new fly();
      private final fel i;

      public a(final fel $$0) {
         this.i = $$0;
         this.h.a(flv.a(xd.c("mco.snapshot.tooltip")));
      }

      @Override
      public void a(fjx $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(ghq::B, fdp.b, $$3 - 5, $$2 + $$5 / 2 - 10, 40, 20);
         int $$10 = $$2 + $$5 / 2 - 9 / 2;
         $$0.b(fdp.this.p, f, $$3 + 40 - 2, $$10 - 5, 8388479);
         $$0.b(fdp.this.p, xd.a("mco.snapshot.description", this.i.c), $$3 + 40 - 2, $$10 + 5, -8355712);
         this.h.a($$8, this.aM_(), new fos($$3, $$2, $$4, $$5));
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         this.c();
         return true;
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         if (fom.a($$0)) {
            this.c();
            return true;
         } else {
            return super.a($$0, $$1, $$2);
         }
      }

      private void c() {
         fdp.this.m.ak().a(haq.a(awe.Ax, 1.0F));
         fdp.this.m
            .a(
               new flm.a(fdp.this, xd.c("mco.snapshot.createSnapshotPopup.title"))
                  .a(xd.c("mco.snapshot.createSnapshotPopup.text"))
                  .a(xd.c("mco.selectServer.create"), $$0 -> fdp.this.m.a(new ffv(fdp.this, this.i.a)))
                  .a(xc.e, flm::d)
                  .a()
            );
      }

      @Override
      public xd a() {
         return xd.a("gui.narrate.button", xc.a(f, xd.a("mco.snapshot.description", this.i.c)));
      }
   }

   class b extends fdp.e {
      private final fkk f;

      public b(final fkk $$0) {
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
      public void a(fjx $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.f.c(fdp.this.n / 2 - 75, $$2 + 4);
         this.f.a($$0, $$6, $$7, $$9);
      }

      @Override
      public void a(boolean $$0) {
         super.a($$0);
         this.f.a($$0);
      }

      @Override
      public xd a() {
         return this.f.z();
      }
   }

   static class c extends fkw {
      private static final flx b = new flx(alc.b("widget/cross_button"), alc.b("widget/cross_button_highlighted"));

      protected c(fkk.c $$0, xd $$1) {
         super(0, 0, 14, 14, b, $$0);
         this.a(flv.a($$1));
      }
   }

   class d extends fdp.e {
      @Override
      public void a(fjx $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
      }

      @Override
      public xd a() {
         return xd.i();
      }
   }

   abstract class e extends flg.a<fdp.e> {
      protected static final int b = 10;
      private static final int a = 28;
      protected static final int c = 7;
      protected static final int d = 2;

      protected void a(fel $$0, fjx $$1, int $$2, int $$3, int $$4, int $$5) {
         int $$6 = $$2 - 10 - 7;
         int $$7 = $$3 + 2;
         if ($$0.j) {
            this.a($$1, $$6, $$7, $$4, $$5, fdp.c, () -> fdp.S);
         } else if ($$0.e == fel.c.a) {
            this.a($$1, $$6, $$7, $$4, $$5, fdp.D, () -> fdp.W);
         } else if (fdp.i($$0) && $$0.l < 7) {
            this.a($$1, $$6, $$7, $$4, $$5, fdp.B, () -> {
               if ($$0.l <= 0) {
                  return fdp.T;
               } else {
                  return (xd)($$0.l == 1 ? fdp.U : xd.a("mco.selectServer.expires.days", $$0.l));
               }
            });
         } else if ($$0.e == fel.c.b) {
            this.a($$1, $$6, $$7, $$4, $$5, fdp.C, () -> fdp.V);
         }
      }

      private void a(fjx $$0, int $$1, int $$2, int $$3, int $$4, alc $$5, Supplier<xd> $$6) {
         $$0.a(ghq::B, $$5, $$1, $$2, 10, 28);
         if (fdp.this.aF.c((double)$$3, (double)$$4) && $$3 >= $$1 && $$3 <= $$1 + 10 && $$4 >= $$2 && $$4 <= $$2 + 28) {
            fdp.this.d($$6.get());
         }
      }

      protected void a(fjx $$0, int $$1, int $$2, fel $$3) {
         int $$4 = this.b($$2);
         int $$5 = this.a($$1);
         int $$6 = this.d($$5);
         if (!fdp.i($$3)) {
            $$0.a(fdp.this.p, $$3.f, $$4, this.d($$5), -8355712, false);
         } else if ($$3.j) {
            xd $$7 = $$3.k ? fdp.O : fdp.M;
            $$0.a(fdp.this.p, $$7, $$4, $$6, -2142128, false);
         }
      }

      protected void a(fjx $$0, String $$1, int $$2, int $$3, int $$4, int $$5) {
         int $$6 = $$4 - $$2;
         if (fdp.this.p.b($$1) > $$6) {
            String $$7 = fdp.this.p.a($$1, $$6 - fdp.this.p.b("... "));
            $$0.a(fdp.this.p, $$7 + "...", $$2, $$3, $$5, false);
         } else {
            $$0.a(fdp.this.p, $$1, $$2, $$3, $$5, false);
         }
      }

      protected int a(int $$0, int $$1, xd $$2) {
         return $$0 + $$1 - fdp.this.p.a($$2) - 20;
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

   static class g extends flp.b {
      private static final alc[] d = new alc[]{
         alc.b("notification/1"),
         alc.b("notification/2"),
         alc.b("notification/3"),
         alc.b("notification/4"),
         alc.b("notification/5"),
         alc.b("notification/more")
      };
      private static final int u = Integer.MAX_VALUE;
      private static final int v = 20;
      private static final int w = 14;
      private int x;

      public g(xd $$0, alc $$1, fkk.c $$2) {
         super(20, 20, $$0, 14, 14, $$1, $$2, null);
      }

      int a() {
         return this.x;
      }

      public void a(int $$0) {
         this.x = $$0;
      }

      @Override
      public void b(fjx $$0, int $$1, int $$2, float $$3) {
         super.b($$0, $$1, $$2, $$3);
         if (this.j && this.x != 0) {
            this.a($$0);
         }
      }

      private void a(fjx $$0) {
         $$0.a(ghq::B, d[Math.min(this.x, 6) - 1], this.D() + this.y() - 5, this.E() - 3, 8, 8);
      }
   }

   class h extends fdp.e {
      private static final int f = 40;
      private static final int g = -12303292;
      private final xd h;
      private final int i;
      private final List<fki> j = new ArrayList<>();
      @Nullable
      private final fdp.c k;
      private final fle l;
      private final fnx m;
      private final fnw n;
      private int o = -1;

      public h(final xd $$0, final int $$1, final fek $$2) {
         this.h = $$0;
         this.i = $$1;
         this.m = new fnx();
         int $$3 = 7;
         this.m.a(fkx.a(20, 20, fdp.a), 0, 0, this.m.b().a(7, 7, 0, 0));
         this.m.a(fod.a(40), 0, 0);
         this.n = this.m.a(new fnw(0, 9 * 3 * ($$1 - 1)), 0, 1, this.m.b().c(7));
         this.l = this.n.a(new fle($$0, fdp.this.p).b(true), this.n.b().b().d());
         this.m.a(fod.a(40), 0, 2);
         if ($$2.b()) {
            this.k = this.m.a(new fdp.c($$1x -> fdp.this.a($$2.c()), xd.c("mco.notification.dismiss")), 0, 2, this.m.b().c().a(0, 7, 7, 0));
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
      public void b(fjx $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         super.b($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
         $$0.b($$3 - 2, $$2 - 2, $$4, 36 * this.i - 2, -12303292);
      }

      @Override
      public void a(fjx $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
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
      public xd a() {
         return this.h;
      }
   }

   class i extends fdp.e {
      private final fel f;
      private final fly g = new fly();

      public i(final fel $$0) {
         this.f = $$0;
         if (!$$0.j) {
            this.g.a(flv.a(xd.c("mco.snapshot.parent.tooltip")));
         }
      }

      @Override
      public void a(fjx $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = this.b($$3);
         int $$11 = this.a($$2);
         fgz.a($$0, $$3, $$2, 32, this.f.g);
         xd $$12 = fdp.a(this.f.t, -8355712);
         int $$13 = this.a($$3, $$4, $$12);
         this.a($$0, this.f.b(), $$10, $$11, $$13, -8355712);
         if ($$12 != xc.a) {
            $$0.a(fdp.this.p, $$12, $$13, $$11, -8355712, false);
         }

         $$0.a(fdp.this.p, this.f.a(), $$10, this.c($$11), -8355712, false);
         this.a($$0, $$2, $$3, this.f);
         this.a(this.f, $$0, $$3 + $$4, $$2, $$6, $$7);
         this.g.a($$8, this.aM_(), new fos($$3, $$2, $$4, $$5));
      }

      @Override
      public xd a() {
         return xd.b(this.f.c);
      }
   }

   class j extends hdj<fdp.e> {
      public j() {
         super(fdp.this.n, fdp.this.o, 0, 36);
      }

      public void a(@Nullable fdp.e $$0) {
         super.a($$0);
         fdp.this.G();
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
      T request(fdu var1) throws fff;
   }

   class l extends fdp.e {
      private static final xd f = xd.c("mco.onlinePlayers");
      private static final int g = 9;
      private static final int h = 36;
      private final fel i;
      private final fly j = new fly();

      public l(final fel $$0) {
         this.i = $$0;
         boolean $$1 = fdp.i($$0);
         if (fdp.b() && $$1 && $$0.h()) {
            this.j.a(flv.a(xd.a("mco.snapshot.paired", $$0.s)));
         } else if (!$$1 && $$0.f()) {
            this.j.a(flv.a(xd.a("mco.snapshot.friendsRealm.downgrade", $$0.t)));
         }
      }

      @Override
      public void a(fjx $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         if (this.i.e == fel.c.c) {
            $$0.a(ghq::B, fdp.b, $$3 - 5, $$2 + $$5 / 2 - 10, 40, 20);
            int $$10 = $$2 + $$5 / 2 - 9 / 2;
            $$0.b(fdp.this.p, fdp.L, $$3 + 40 - 2, $$10, 8388479);
         } else {
            this.a(this.i, $$0, $$3 + 36, $$2, $$6, $$7);
            fgz.a($$0, $$3, $$2, 32, this.i.g);
            this.a($$0, $$2, $$3, $$4);
            this.a($$0, $$2, $$3);
            this.a($$0, $$2, $$3, this.i);
            boolean $$11 = this.a($$0, $$2, $$3, $$4, $$5, $$6, $$7);
            this.a(this.i, $$0, $$3 + $$4, $$2, $$6, $$7);
            if (!$$11) {
               this.j.a($$8, this.aM_(), new fos($$3, $$2, $$4, $$5));
            }
         }
      }

      private void a(fjx $$0, int $$1, int $$2, int $$3) {
         int $$4 = this.b($$2);
         int $$5 = this.a($$1);
         xd $$6 = fdp.a(this.i.t, this.i.d());
         int $$7 = this.a($$2, $$3, $$6);
         this.a($$0, this.i.b(), $$4, $$5, $$7, -1);
         if ($$6 != xc.a && !this.i.i()) {
            $$0.a(fdp.this.p, $$6, $$7, $$5, -8355712, false);
         }
      }

      private void a(fjx $$0, int $$1, int $$2) {
         int $$3 = this.b($$2);
         int $$4 = this.a($$1);
         int $$5 = this.c($$4);
         String $$6 = this.i.c();
         if (this.i.i() && $$6 != null) {
            xd $$7 = xd.b($$6).a(n.h);
            $$0.a(fdp.this.p, xd.a("mco.selectServer.minigameName", $$7).b(-171), $$3, $$5, -1, false);
         } else {
            $$0.a(fdp.this.p, this.i.a(), $$3, this.c($$4), -8355712, false);
         }
      }

      private boolean a(fjx $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6) {
         List<ProfileResult> $$7 = fdp.this.aI.a(this.i.a);
         if (!$$7.isEmpty()) {
            int $$8 = $$2 + $$3 - 21;
            int $$9 = $$1 + $$4 - 9 - 2;
            int $$10 = $$8;

            for (int $$11 = 0; $$11 < $$7.size(); $$11++) {
               $$10 -= 9 + ($$11 == 0 ? 0 : 3);
               flj.a($$0, fil.Q().an().b($$7.get($$11).profile()), $$10, $$9, 9);
            }

            if ($$5 >= $$10 && $$5 <= $$8 && $$6 >= $$9 && $$6 <= $$9 + 9) {
               $$0.a(fdp.this.p, List.of(f), Optional.of(new fsj.a($$7)), $$5, $$6);
               return true;
            }
         }

         return false;
      }

      private void d() {
         fdp.this.m.ak().a(haq.a(awe.Ax, 1.0F));
         fdp.a(this.i, fdp.this);
      }

      private void e() {
         fdp.this.m.ak().a(haq.a(awe.Ax, 1.0F));
         ffv $$0 = new ffv(fdp.this, this.i);
         fdp.this.m.a($$0);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         if (this.i.e == fel.c.c) {
            this.e();
         } else if (fdp.this.a(this.i)) {
            if (ad.c() - fdp.this.aL < 250L && this.aM_()) {
               this.d();
            }

            fdp.this.aL = ad.c();
         }

         return true;
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         if (fom.a($$0)) {
            if (this.i.e == fel.c.c) {
               this.e();
               return true;
            }

            if (fdp.this.a(this.i)) {
               this.d();
               return true;
            }
         }

         return super.a($$0, $$1, $$2);
      }

      @Override
      public xd a() {
         return (xd)(this.i.e == fel.c.c ? fdp.X : xd.a("narrator.select", this.i.c));
      }

      public fel c() {
         return this.i;
      }
   }
}
