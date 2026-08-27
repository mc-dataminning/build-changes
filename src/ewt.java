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

public class ewt extends grl {
   static final ajt a = new ajt("icon/info");
   static final ajt b = new ajt("icon/new_realm");
   static final ajt c = new ajt("realm_status/expired");
   static final ajt y = new ajt("realm_status/expires_soon");
   static final ajt z = new ajt("realm_status/open");
   static final ajt A = new ajt("realm_status/closed");
   private static final ajt B = new ajt("icon/invite");
   private static final ajt C = new ajt("icon/news");
   static final Logger D = LogUtils.getLogger();
   private static final ajt E = new ajt("textures/gui/title/realms.png");
   private static final ajt F = new ajt("textures/gui/realms/no_realms.png");
   private static final wg G = wg.c("menu.online");
   private static final wg H = wg.c("mco.selectServer.loading");
   static final wg I = wg.c("mco.selectServer.uninitialized");
   static final wg J = wg.c("mco.selectServer.expiredList");
   private static final wg K = wg.c("mco.selectServer.expiredRenew");
   static final wg L = wg.c("mco.selectServer.expiredTrial");
   private static final wg M = wg.c("mco.selectServer.play");
   private static final wg N = wg.c("mco.selectServer.leave");
   private static final wg O = wg.c("mco.selectServer.configure");
   static final wg P = wg.c("mco.selectServer.expired");
   static final wg Q = wg.c("mco.selectServer.expires.soon");
   static final wg R = wg.c("mco.selectServer.expires.day");
   static final wg S = wg.c("mco.selectServer.open");
   static final wg T = wg.c("mco.selectServer.closed");
   static final wg U = wg.a("gui.narrate.button", I);
   private static final wg V = wg.c("mco.selectServer.noRealms");
   private static final wg W = wg.c("mco.invites.nopending");
   private static final wg X = wg.c("mco.invites.pending");
   private static final int Y = 100;
   private static final int Z = 3;
   private static final int aa = 4;
   private static final int ab = 308;
   private static final int ac = 128;
   private static final int ad = 34;
   private static final int ae = 128;
   private static final int af = 64;
   private static final int ag = 5;
   private static final int ah = 44;
   private static final int ai = 11;
   private static final int aj = 40;
   private static final int ak = 20;
   private static final int al = 216;
   private static final int am = 36;
   private static final boolean an = !aa.b().g();
   private static boolean ao = an;
   private final CompletableFuture<ews.a> ap = ews.a();
   @Nullable
   private ezx.c aq;
   private final Set<UUID> ar = new HashSet<>();
   private static boolean as;
   private final RateLimiter at;
   private final fjo au;
   private fdp av;
   private fdp aw;
   private fdp ax;
   private fdp ay;
   private fdp az;
   ewt.j aA;
   private eyq aB;
   private List<exp> aC = List.of();
   private volatile boolean aD;
   @Nullable
   private volatile String aE;
   long aF;
   private final List<exo> aG = new ArrayList<>();
   private fdp aH;
   private ewt.g aI;
   private ewt.g aJ;
   private ewt.f aK;
   @Nullable
   private fhc aL;

   public ewt(fjo $$0) {
      super(G);
      this.au = $$0;
      this.at = RateLimiter.create(0.016666668F);
   }

   @Override
   public void aN_() {
      this.aB = new eyq(this.j);
      this.aA = new ewt.j();
      wg $$0 = wg.c("mco.invites.title");
      this.aI = new ewt.g($$0, B, $$1x -> this.j.a(new ezj(this, $$0)));
      wg $$1 = wg.c("mco.news");
      this.aJ = new ewt.g($$1, C, $$0x -> {
         String $$1x = this.aE;
         if ($$1x != null) {
            fif.a(this, $$1x);
            if (this.aJ.a() != 0) {
               fad.a $$2 = fad.b();
               $$2.b = false;
               fad.b($$2);
               this.aJ.a(0);
            }
         }
      });
      this.aJ.a(ffa.a($$1));
      this.av = fdp.a(M, $$0x -> a(this.M(), this)).a(100).a();
      this.ay = fdp.a(O, $$0x -> this.f(this.M())).a(100).a();
      this.ax = fdp.a(K, $$0x -> this.e(this.M())).a(100).a();
      this.az = fdp.a(N, $$0x -> this.g(this.M())).a(100).a();
      this.aH = fdp.a(wg.c("mco.selectServer.purchase"), $$0x -> this.N()).b(100, 20).a();
      this.aw = fdp.a(wf.k, $$0x -> this.d()).a(100).a();
      if (ewy.a == ewy.b.b) {
         this.c(fdw.a(wg.b("Snapshot"), wg.b("Release")).a(5, 5, 100, 20, wg.b("Realm"), ($$0x, $$1x) -> {
            ao = $$1x;
            this.aC = List.of();
            this.I();
         }));
      }

      this.a(ewt.f.a);
      this.F();
      this.ap.thenAcceptAsync($$0x -> {
         fjo $$1x = $$0x.a(this.au);
         if ($$1x == null) {
            this.aq = this.a(this.j.bb());
         } else {
            this.j.a($$1x);
         }
      }, this.n);
   }

   public static boolean b() {
      return an && ao;
   }

   @Override
   protected void c() {
      if (this.aL != null) {
         this.aA.a(this.k, this.aL);
         this.aL.a();
      }
   }

   @Override
   public void d() {
      this.j.a(this.au);
   }

   private void C() {
      if (this.aB.a() && this.aC.isEmpty() && this.aG.isEmpty()) {
         this.a(ewt.f.b);
      } else {
         this.a(ewt.f.c);
      }
   }

   private void a(ewt.f $$0) {
      if (this.aK != $$0) {
         if (this.aL != null) {
            this.aL.a($$1 -> this.e($$1));
         }

         this.aL = this.b($$0);
         this.aK = $$0;
         this.aL.a($$1 -> {
            fdn var10000 = this.c($$1);
         });
         this.c();
      }
   }

   private fhc b(ewt.f $$0) {
      fhc $$1 = new fhc(this);
      $$1.b(44);
      $$1.a(this.D());
      fhd $$2 = this.c($$0);
      $$2.a();
      $$1.a($$2.v() + 22);
      $$1.b($$2);
      switch ($$0) {
         case a:
            $$1.c(new fee(this.m, H));
            break;
         case b:
            $$1.c(this.E());
            break;
         case c:
            $$1.c(this.aA);
      }

      return $$1;
   }

   private fhd D() {
      int $$0 = 90;
      fhg $$1 = fhg.e().a(4);
      $$1.c().e();
      $$1.a(this.aI);
      $$1.a(this.aJ);
      fhg $$2 = fhg.e();
      $$2.c().e();
      $$2.a(fhh.a(90));
      $$2.a(fec.a(128, 34, E, 128, 64), fhf::b);
      $$2.a(new fha(90, 44)).a($$1, fhf::c);
      return $$2;
   }

   private fhd c(ewt.f $$0) {
      fhb $$1 = new fhb().c(4);
      fhb.b $$2 = $$1.d(3);
      if ($$0 == ewt.f.c) {
         $$2.a(this.av);
         $$2.a(this.ay);
         $$2.a(this.ax);
         $$2.a(this.az);
      }

      $$2.a(this.aH);
      $$2.a(this.aw);
      return $$1;
   }

   private fhg E() {
      fhg $$0 = fhg.d().a(8);
      $$0.c().b();
      $$0.a(fec.a(130, 64, F, 130, 64));
      fea $$1 = new fea(308, V, this.m, false, 4);
      $$0.a($$1);
      return $$0;
   }

   void F() {
      exp $$0 = this.M();
      this.aH.j = this.aK != ewt.f.a;
      this.av.j = $$0 != null && this.a($$0);
      this.ax.j = $$0 != null && this.b($$0);
      this.az.j = $$0 != null && this.d($$0);
      this.ay.j = $$0 != null && this.c($$0);
   }

   boolean a(exp $$0) {
      boolean $$1 = !$$0.j && $$0.e == exp.c.b;
      return $$1 && ($$0.d() || this.h($$0));
   }

   private boolean b(exp $$0) {
      return $$0.j && this.h($$0);
   }

   private boolean c(exp $$0) {
      return this.h($$0) && $$0.e != exp.c.c;
   }

   private boolean d(exp $$0) {
      return !this.h($$0);
   }

   @Override
   public void e() {
      super.e();
      if (this.aq != null) {
         this.aq.b();
      }
   }

   public static void f() {
      fbp.Q().bb().d.a();
   }

   public static void g() {
      fbp.Q().bb().c.a();
   }

   private void I() {
      for (ezx.e<?> $$0 : this.j.bb().a()) {
         $$0.a();
      }
   }

   private ezx.c a(eyo $$0) {
      ezx.c $$1 = $$0.a.a();
      $$1.a($$0.c, $$0x -> {
         this.aB.a($$0x.a());
         this.aC = $$0x.b();
         this.J();
         boolean $$1x = false;

         for (exp $$2 : this.aB) {
            if (this.i($$2)) {
               $$1x = true;
            }
         }

         if (!as && $$1x) {
            as = true;
            this.K();
         }
      });
      a(ewy::d, $$0x -> {
         this.aG.clear();
         this.aG.addAll($$0x);

         for (exo $$1x : $$0x) {
            if ($$1x instanceof exo.a $$2) {
               fer $$3 = $$2.a(this, this::a);
               if ($$3 != null) {
                  this.j.a($$3);
                  this.a(List.of($$1x));
                  break;
               }
            }
         }

         if (!this.aG.isEmpty() && this.aK != ewt.f.a) {
            this.J();
         }
      });
      $$1.a($$0.d, $$0x -> {
         this.aI.a($$0x);
         this.aI.a($$0x == 0 ? ffa.a(W) : ffa.a(X));
         if ($$0x > 0 && this.at.tryAcquire(1)) {
            this.j.aY().c(wg.a("mco.configure.world.invite.narration", $$0x));
         }
      });
      $$1.a($$0.e, $$0x -> this.aD = $$0x);
      $$1.a($$0.f, $$1x -> {
         $$0.g.a($$1x);
         this.aE = $$0.g.b();
         this.aJ.a($$0.g.a() ? Integer.MAX_VALUE : 0);
      });
      return $$1;
   }

   private void a(Collection<exo> $$0) {
      List<UUID> $$1 = new ArrayList<>($$0.size());

      for (exo $$2 : $$0) {
         if (!$$2.a() && !this.ar.contains($$2.c())) {
            $$1.add($$2.c());
         }
      }

      if (!$$1.isEmpty()) {
         a($$1x -> {
            $$1x.a($$1);
            return null;
         }, $$1x -> this.ar.addAll($$1));
      }
   }

   private static <T> void a(ewt.k<T> $$0, Consumer<T> $$1) {
      fbp $$2 = fbp.Q();
      CompletableFuture.<T>supplyAsync(() -> {
         try {
            return $$0.request(ewy.a($$2));
         } catch (eyl var3) {
            throw new RuntimeException(var3);
         }
      }).thenAcceptAsync($$1, $$2).exceptionally($$0x -> {
         D.error("Failed to execute call to Realms Service", $$0x);
         return null;
      });
   }

   private void J() {
      exp $$0 = this.M();
      this.aA.I();

      for (exo $$1 : this.aG) {
         if (this.a($$1)) {
            this.a(List.of($$1));
            break;
         }
      }

      for (exp $$2 : this.aC) {
         this.aA.a(new ewt.a($$2));
      }

      for (exp $$3 : this.aB) {
         ewt.e $$4;
         if (b() && !$$3.h()) {
            if ($$3.e == exp.c.c) {
               continue;
            }

            $$4 = new ewt.i($$3);
         } else {
            $$4 = new ewt.l($$3);
         }

         this.aA.a((ewt.e)$$4);
         if ($$0 != null && $$0.a == $$3.a) {
            this.aA.a($$4);
         }
      }

      this.C();
      this.F();
   }

   private boolean a(exo $$0) {
      if (!($$0 instanceof exo.c $$1)) {
         return false;
      } else {
         wg $$2 = $$1.d();
         int $$3 = this.m.b($$2, 216);
         int $$4 = axk.e($$3 + 7, 36) - 1;
         this.aA.a(new ewt.h($$2, $$4 + 2, $$1));

         for (int $$5 = 0; $$5 < $$4; $$5++) {
            this.aA.a(new ewt.d());
         }

         this.aA.a(new ewt.b($$1.a(this)));
         return true;
      }
   }

   private void K() {
      new Thread(() -> {
         List<exz> $$0 = ewx.a();
         ewy $$1 = ewy.a();
         exk $$2 = new exk();
         $$2.a = $$0;
         $$2.b = this.L();

         try {
            $$1.a($$2);
         } catch (Throwable var5) {
            D.warn("Could not send ping result to Realms: ", var5);
         }
      }).start();
   }

   private List<Long> L() {
      List<Long> $$0 = Lists.newArrayList();

      for (exp $$1 : this.aB) {
         if (this.i($$1)) {
            $$0.add($$1.a);
         }
      }

      return $$0;
   }

   private void e(@Nullable exp $$0) {
      if ($$0 != null) {
         String $$1 = awg.a($$0.b, this.j.X().b(), $$0.k);
         this.j.o.a($$1);
         ac.j().a($$1);
      }
   }

   private void f(@Nullable exp $$0) {
      if ($$0 != null && this.j.b($$0.g)) {
         this.j.a(new eyy(this, $$0.a));
      }
   }

   private void g(@Nullable exp $$0) {
      if ($$0 != null && !this.j.b($$0.g)) {
         wg $$1 = wg.c("mco.configure.world.leave.question.line1");
         wg $$2 = wg.c("mco.configure.world.leave.question.line2");
         this.j.a(new eze($$1x -> this.a($$1x, $$0), eze.a.b, $$1, $$2, true));
      }
   }

   @Nullable
   private exp M() {
      return this.aA.h() instanceof ewt.l $$0 ? $$0.c() : null;
   }

   private void a(boolean $$0, final exp $$1) {
      if ($$0) {
         (new Thread("Realms-leave-server") {
            @Override
            public void run() {
               try {
                  ewy $$0 = ewy.a();
                  $$0.d($$1.a);
                  ewt.this.j.execute(ewt::g);
               } catch (eyl var2) {
                  ewt.D.error("Couldn't configure world", var2);
                  ewt.this.j.execute(() -> ewt.this.j.a(new ezc(var2, ewt.this)));
               }
            }
         }).start();
      }

      this.j.a(this);
   }

   void a(UUID $$0) {
      a($$1 -> {
         $$1.b(List.of($$0));
         return null;
      }, $$1 -> {
         this.aG.removeIf($$1x -> $$1x.b() && $$0.equals($$1x.c()));
         this.J();
      });
   }

   public void h() {
      this.aA.a(null);
      g();
   }

   @Override
   public wg i() {
      return (wg)(switch (this.aK) {
         case a -> wf.a(super.i(), H);
         case b -> wf.a(super.i(), V);
         case c -> super.i();
      });
   }

   @Override
   public void a(fdc $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (b()) {
         $$0.b(this.m, "Minecraft " + aa.b().c(), 2, this.l - 10, -1);
      }

      if (this.aD && this.aH.j) {
         ezl.a($$0, this.aH);
      }

      switch (ewy.a) {
         case b:
            this.a($$0, "STAGE!", -256);
            break;
         case c:
            this.a($$0, "LOCAL!", 8388479);
      }
   }

   private void N() {
      this.j.a(new ezl(this, this.aD));
   }

   public static void a(@Nullable exp $$0, fjo $$1) {
      a($$0, $$1, false);
   }

   public static void a(@Nullable exp $$0, fjo $$1, boolean $$2) {
      if ($$0 != null) {
         if (!b() || $$2) {
            fbp.Q().a(new ezf($$1, new fao($$1, $$0)));
            return;
         }

         switch ($$0.u) {
            case e:
               fbp.Q().a(new ezf($$1, new fao($$1, $$0)));
               break;
            case a:
               a($$0, $$1, wg.c("mco.compatibility.unverifiable.title").b(-171), wg.c("mco.compatibility.unverifiable.message"), wf.j);
               break;
            case c:
               a(
                  $$0,
                  $$1,
                  wg.c("selectWorld.backupQuestion.downgrade").b(-2142128),
                  wg.a("mco.compatibility.downgrade.description", wg.b($$0.t).b(-171), wg.b(aa.b().c()).b(-171)),
                  wg.c("mco.compatibility.downgrade")
               );
               break;
            case d:
               a(
                  $$0,
                  $$1,
                  wg.c("mco.compatibility.upgrade.title").b(-171),
                  wg.a("mco.compatibility.upgrade.description", wg.b($$0.t).b(-171), wg.b(aa.b().c()).b(-171)),
                  wg.c("mco.compatibility.upgrade")
               );
         }
      }
   }

   private static void a(exp $$0, fjo $$1, wg $$2, wg $$3, wg $$4) {
      fbp.Q().a(new fig($$2x -> {
         fjo $$3x;
         if ($$2x) {
            $$3x = new ezf($$1, new fao($$1, $$0));
            g();
         } else {
            $$3x = $$1;
         }

         fbp.Q().a($$3x);
      }, $$2, $$3, $$4, wf.e));
   }

   public static wg a(String $$0, boolean $$1) {
      return a($$0, $$1 ? -8355712 : -2142128);
   }

   public static wg a(String $$0, int $$1) {
      return (wg)(StringUtils.isBlank($$0) ? wf.a : wg.a("mco.version", wg.b($$0).b($$1)));
   }

   boolean h(exp $$0) {
      return this.j.b($$0.g);
   }

   private boolean i(exp $$0) {
      return this.h($$0) && !$$0.j;
   }

   private void a(fdc $$0, String $$1, int $$2) {
      $$0.c().a();
      $$0.c().a((float)(this.k / 2 - 25), 20.0F, 0.0F);
      $$0.c().a(a.f.rotationDegrees(-20.0F));
      $$0.c().b(1.5F, 1.5F, 1.5F);
      $$0.a(this.m, $$1, 0, 0, $$2, false);
      $$0.c().b();
   }

   class a extends ewt.e {
      private static final wg c = wg.c("mco.snapshot.start");
      private static final int d = 5;
      private final ffd e = new ffd();
      private final exp f;

      public a(exp $$0) {
         this.f = $$0;
         this.e.a(ffa.a(wg.c("mco.snapshot.tooltip")));
      }

      @Override
      public void a(fdc $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(ewt.b, $$3 - 5, $$2 + $$5 / 2 - 10, 40, 20);
         int $$10 = $$2 + $$5 / 2 - 9 / 2;
         $$0.b(ewt.this.m, c, $$3 + 40 - 2, $$10 - 5, 8388479);
         $$0.b(ewt.this.m, wg.a("mco.snapshot.description", this.f.c), $$3 + 40 - 2, $$10 + 5, -8355712);
         this.e.a($$8, this.aJ_(), new fhv($$3, $$2, $$4, $$5));
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         this.c();
         return true;
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         if (fhq.a($$0)) {
            this.c();
            return true;
         } else {
            return super.a($$0, $$1, $$2);
         }
      }

      private void c() {
         ewt.this.j.ak().a(gor.a(aum.zV, 1.0F));
         ewt.this.j
            .a(
               new fer.a(ewt.this, wg.c("mco.snapshot.createSnapshotPopup.title"))
                  .a(wg.c("mco.snapshot.createSnapshotPopup.text"))
                  .a(wg.c("mco.selectServer.create"), $$0 -> ewt.this.j.a(new eza(ewt.this, this.f.a)))
                  .a(wf.e, fer::d)
                  .a()
            );
      }

      @Override
      public wg a() {
         return wg.a("gui.narrate.button", wf.a(c, wg.a("mco.snapshot.description", this.f.c)));
      }
   }

   class b extends ewt.e {
      private final fdp c;

      public b(fdp $$0) {
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
      public void a(fdc $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.c.c(ewt.this.k / 2 - 75, $$2 + 4);
         this.c.a($$0, $$6, $$7, $$9);
      }

      @Override
      public void a(boolean $$0) {
         super.a($$0);
         this.c.a($$0);
      }

      @Override
      public wg a() {
         return this.c.y();
      }
   }

   static class c extends feb {
      private static final ffc b = new ffc(new ajt("widget/cross_button"), new ajt("widget/cross_button_highlighted"));

      protected c(fdp.c $$0, wg $$1) {
         super(0, 0, 14, 14, b, $$0);
         this.a(ffa.a($$1));
      }
   }

   class d extends ewt.e {
      @Override
      public void a(fdc $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
      }

      @Override
      public wg a() {
         return wg.i();
      }
   }

   abstract class e extends fel.a<ewt.e> {
      private static final int a = 10;
      private static final int c = 28;
      private static final int d = 7;

      protected void a(exp $$0, fdc $$1, int $$2, int $$3, int $$4, int $$5) {
         int $$6 = $$2 - 10 - 7;
         int $$7 = $$3 + 2;
         if ($$0.j) {
            this.a($$1, $$6, $$7, $$4, $$5, ewt.c, () -> ewt.P);
         } else if ($$0.e == exp.c.a) {
            this.a($$1, $$6, $$7, $$4, $$5, ewt.A, () -> ewt.T);
         } else if (ewt.this.h($$0) && $$0.l < 7) {
            this.a($$1, $$6, $$7, $$4, $$5, ewt.y, () -> {
               if ($$0.l <= 0) {
                  return ewt.Q;
               } else {
                  return (wg)($$0.l == 1 ? ewt.R : wg.a("mco.selectServer.expires.days", $$0.l));
               }
            });
         } else if ($$0.e == exp.c.b) {
            this.a($$1, $$6, $$7, $$4, $$5, ewt.z, () -> ewt.S);
         }
      }

      private void a(fdc $$0, int $$1, int $$2, int $$3, int $$4, ajt $$5, Supplier<wg> $$6) {
         $$0.a($$5, $$1, $$2, 10, 28);
         if (ewt.this.aA.c((double)$$3, (double)$$4) && $$3 >= $$1 && $$3 <= $$1 + 10 && $$4 >= $$2 && $$4 <= $$2 + 28) {
            ewt.this.d($$6.get());
         }
      }

      protected void a(fdc $$0, int $$1, int $$2, exp $$3) {
         int $$4 = this.b($$2);
         int $$5 = this.a($$1);
         int $$6 = this.d($$5);
         if (!ewt.this.h($$3)) {
            $$0.a(ewt.this.m, $$3.f, $$4, this.d($$5), -8355712, false);
         } else if ($$3.j) {
            wg $$7 = $$3.k ? ewt.L : ewt.J;
            $$0.a(ewt.this.m, $$7, $$4, $$6, -2142128, false);
         }
      }

      protected void a(fdc $$0, String $$1, int $$2, int $$3, int $$4, int $$5) {
         int $$6 = $$4 - $$2;
         if (ewt.this.m.b($$1) > $$6) {
            String $$7 = ewt.this.m.a($$1, $$6 - ewt.this.m.b("... "));
            $$0.a(ewt.this.m, $$7 + "...", $$2, $$3, $$5, false);
         } else {
            $$0.a(ewt.this.m, $$1, $$2, $$3, $$5, false);
         }
      }

      protected int a(int $$0, int $$1, wg $$2) {
         return $$0 + $$1 - ewt.this.m.a($$2) - 20;
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

   static class g extends feu.b {
      private static final ajt[] d = new ajt[]{
         new ajt("notification/1"),
         new ajt("notification/2"),
         new ajt("notification/3"),
         new ajt("notification/4"),
         new ajt("notification/5"),
         new ajt("notification/more")
      };
      private static final int u = Integer.MAX_VALUE;
      private static final int v = 20;
      private static final int w = 14;
      private int x;

      public g(wg $$0, ajt $$1, fdp.c $$2) {
         super(20, 20, $$0, 14, 14, $$1, $$2, null);
      }

      int a() {
         return this.x;
      }

      public void a(int $$0) {
         this.x = $$0;
      }

      @Override
      public void b(fdc $$0, int $$1, int $$2, float $$3) {
         super.b($$0, $$1, $$2, $$3);
         if (this.j && this.x != 0) {
            this.a($$0);
         }
      }

      private void a(fdc $$0) {
         $$0.a(d[Math.min(this.x, 6) - 1], this.C() + this.x() - 5, this.D() - 3, 8, 8);
      }
   }

   class h extends ewt.e {
      private static final int c = 40;
      private static final int d = -12303292;
      private final wg e;
      private final int f;
      private final List<fdn> g = new ArrayList<>();
      @Nullable
      private final ewt.c h;
      private final fej i;
      private final fhb j;
      private final fha k;
      private int l = -1;

      public h(wg $$0, int $$1, exo $$2) {
         this.e = $$0;
         this.f = $$1;
         this.j = new fhb();
         int $$3 = 7;
         this.j.a(fec.a(20, 20, ewt.a), 0, 0, this.j.b().a(7, 7, 0, 0));
         this.j.a(fhh.a(40), 0, 0);
         this.k = this.j.a(new fha(0, 9 * 3 * ($$1 - 1)), 0, 1, this.j.b().c(7));
         this.i = this.k.a(new fej($$0, ewt.this.m).b(true), this.k.b().b().d());
         this.j.a(fhh.a(40), 0, 2);
         if ($$2.b()) {
            this.h = this.j.a(new ewt.c($$1x -> ewt.this.a($$2.c()), wg.c("mco.notification.dismiss")), 0, 2, this.j.b().c().a(0, 7, 7, 0));
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
      public void b(fdc $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         super.b($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
         $$0.b($$3 - 2, $$2 - 2, $$4, 36 * this.f - 2, -12303292);
      }

      @Override
      public void a(fdc $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
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
      public wg a() {
         return this.e;
      }
   }

   class i extends ewt.e {
      private final exp c;
      private final ffd d = new ffd();

      public i(exp $$0) {
         this.c = $$0;
         this.d.a(ffa.a(wg.c("mco.snapshot.parent.tooltip")));
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         return true;
      }

      @Override
      public void a(fdc $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = this.b($$3);
         int $$11 = this.a($$2);
         faf.a($$0, $$3, $$2, 32, this.c.g);
         wg $$12 = ewt.a(this.c.t, -8355712);
         int $$13 = this.a($$3, $$4, $$12);
         this.a($$0, this.c.b(), $$10, $$11, $$13, -8355712);
         if ($$12 != wf.a) {
            $$0.a(ewt.this.m, $$12, $$13, $$11, -8355712, false);
         }

         $$0.a(ewt.this.m, this.c.a(), $$10, this.c($$11), -8355712, false);
         this.a($$0, $$2, $$3, this.c);
         this.a(this.c, $$0, $$3 + $$4, $$2, $$6, $$7);
         this.d.a($$8, this.aJ_(), new fhv($$3, $$2, $$4, $$5));
      }

      @Override
      public wg a() {
         return wg.b(this.c.c);
      }
   }

   class j extends grk<ewt.e> {
      public j() {
         super(ewt.this.k, ewt.this.l, 0, 36);
      }

      public void a(@Nullable ewt.e $$0) {
         super.a($$0);
         ewt.this.F();
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
      T request(ewy var1) throws eyl;
   }

   class l extends ewt.e {
      private static final int c = 36;
      private final exp d;
      private final ffd e = new ffd();

      public l(exp $$0) {
         this.d = $$0;
         boolean $$1 = ewt.this.h($$0);
         if (ewt.b() && $$1 && $$0.h()) {
            this.e.a(ffa.a(wg.a("mco.snapshot.paired", $$0.s)));
         } else if (!$$1 && $$0.e()) {
            this.e.a(ffa.a(wg.a("mco.snapshot.friendsRealm.upgrade", $$0.f)));
         } else if (!$$1 && $$0.f()) {
            this.e.a(ffa.a(wg.a("mco.snapshot.friendsRealm.downgrade", $$0.t)));
         }
      }

      @Override
      public void a(fdc $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         if (this.d.e == exp.c.c) {
            $$0.a(ewt.b, $$3 - 5, $$2 + $$5 / 2 - 10, 40, 20);
            int $$10 = $$2 + $$5 / 2 - 9 / 2;
            $$0.b(ewt.this.m, ewt.I, $$3 + 40 - 2, $$10, 8388479);
         } else {
            faf.a($$0, $$3, $$2, 32, this.d.g);
            this.a($$0, $$2, $$3, $$4);
            this.a($$0, $$2, $$3);
            this.a($$0, $$2, $$3, this.d);
            this.a(this.d, $$0, $$3 + $$4, $$2, $$6, $$7);
            this.e.a($$8, this.aJ_(), new fhv($$3, $$2, $$4, $$5));
         }
      }

      private void a(fdc $$0, int $$1, int $$2, int $$3) {
         int $$4 = this.b($$2);
         int $$5 = this.a($$1);
         wg $$6 = ewt.a(this.d.t, this.d.d());
         int $$7 = this.a($$2, $$3, $$6);
         this.a($$0, this.d.b(), $$4, $$5, $$7, -1);
         if ($$6 != wf.a) {
            $$0.a(ewt.this.m, $$6, $$7, $$5, -8355712, false);
         }
      }

      private void a(fdc $$0, int $$1, int $$2) {
         int $$3 = this.b($$2);
         int $$4 = this.a($$1);
         int $$5 = this.c($$4);
         String $$6 = this.d.c();
         if (this.d.m == exp.d.b && $$6 != null) {
            wg $$7 = wg.b($$6).a(n.h);
            $$0.a(ewt.this.m, wg.a("mco.selectServer.minigameName", $$7).b(-171), $$3, $$5, -1, false);
         } else {
            $$0.a(ewt.this.m, this.d.a(), $$3, this.c($$4), -8355712, false);
         }
      }

      private void d() {
         ewt.this.j.ak().a(gor.a(aum.zV, 1.0F));
         ewt.a(this.d, ewt.this);
      }

      private void e() {
         ewt.this.j.ak().a(gor.a(aum.zV, 1.0F));
         eza $$0 = new eza(ewt.this, this.d);
         ewt.this.j.a($$0);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         if (this.d.e == exp.c.c) {
            this.e();
         } else if (ewt.this.a(this.d)) {
            if (ac.b() - ewt.this.aF < 250L && this.aJ_()) {
               this.d();
            }

            ewt.this.aF = ac.b();
         }

         return true;
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         if (fhq.a($$0)) {
            if (this.d.e == exp.c.c) {
               this.e();
               return true;
            }

            if (ewt.this.a(this.d)) {
               this.d();
               return true;
            }
         }

         return super.a($$0, $$1, $$2);
      }

      @Override
      public wg a() {
         return (wg)(this.d.e == exp.c.c ? ewt.U : wg.a("narrator.select", this.d.c));
      }

      public exp c() {
         return this.d;
      }
   }
}
