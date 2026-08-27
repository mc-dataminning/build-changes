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

public class env extends ghe {
   static final agg a = new agg("icon/info");
   static final agg b = new agg("icon/new_realm");
   static final agg c = new agg("realm_status/expired");
   static final agg v = new agg("realm_status/expires_soon");
   static final agg w = new agg("realm_status/open");
   static final agg x = new agg("realm_status/closed");
   private static final agg y = new agg("icon/invite");
   private static final agg z = new agg("icon/news");
   static final Logger A = LogUtils.getLogger();
   private static final agg B = new agg("textures/gui/title/realms.png");
   private static final agg C = new agg("textures/gui/realms/no_realms.png");
   private static final ur D = ur.c("menu.online");
   private static final ur E = ur.c("mco.selectServer.loading");
   static final ur F = ur.c("mco.selectServer.uninitialized");
   static final ur G = ur.c("mco.selectServer.expiredList");
   private static final ur H = ur.c("mco.selectServer.expiredRenew");
   static final ur I = ur.c("mco.selectServer.expiredTrial");
   private static final ur J = ur.c("mco.selectServer.play");
   private static final ur K = ur.c("mco.selectServer.leave");
   private static final ur L = ur.c("mco.selectServer.configure");
   static final ur M = ur.c("mco.selectServer.expired");
   static final ur N = ur.c("mco.selectServer.expires.soon");
   static final ur O = ur.c("mco.selectServer.expires.day");
   static final ur P = ur.c("mco.selectServer.open");
   static final ur Q = ur.c("mco.selectServer.closed");
   static final ur R = ur.a("gui.narrate.button", F);
   private static final ur S = ur.c("mco.selectServer.noRealms");
   private static final ur T = ur.c("mco.invites.nopending");
   private static final ur U = ur.c("mco.invites.pending");
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
   private final CompletableFuture<enu.a> am = enu.a();
   @Nullable
   private eqz.c an;
   private final Set<UUID> ao = new HashSet<>();
   private static boolean ap;
   private final RateLimiter aq;
   private final fah ar;
   private eum as;
   private eum at;
   private eum au;
   private eum av;
   private eum aw;
   env.j ax;
   private eps ay;
   private List<eor> az = List.of();
   private volatile boolean aA;
   @Nullable
   private volatile String aB;
   long aC;
   private final List<eoq> aD = new ArrayList<>();
   private eum aE;
   private env.g aF;
   private env.g aG;
   private env.f aH;
   @Nullable
   private exw aI;

   public env(fah $$0) {
      super(D);
      this.ar = $$0;
      this.aq = RateLimiter.create(0.016666668F);
   }

   @Override
   public void aO_() {
      this.ay = new eps(this.f);
      this.ax = this.d(new env.j());
      ur $$0 = ur.c("mco.invites.title");
      this.aF = new env.g($$0, y, $$1x -> this.f.a(new eql(this, $$0)));
      ur $$1 = ur.c("mco.news");
      this.aG = new env.g($$1, z, $$0x -> {
         String $$1x = this.aB;
         if ($$1x != null) {
            eyz.a(this, $$1x);
            if (this.aG.a() != 0) {
               erf.a $$2 = erf.b();
               $$2.b = false;
               erf.b($$2);
               this.aG.a(0);
            }
         }
      });
      this.aG.a(evx.a($$1));
      this.as = eum.a(J, $$0x -> a(this.K(), this)).a(100).a();
      this.av = eum.a(L, $$0x -> this.f(this.K())).a(100).a();
      this.au = eum.a(H, $$0x -> this.e(this.K())).a(100).a();
      this.aw = eum.a(K, $$0x -> this.g(this.K())).a(100).a();
      this.aE = eum.a(ur.c("mco.selectServer.purchase"), $$0x -> this.L()).b(100, 20).a();
      this.at = eum.a(uq.k, $$0x -> this.f.a(this.ar)).a(100).a();
      if (eoa.a == eoa.b.b) {
         this.d(eut.a(ur.b("Snapshot"), ur.b("Release")).a(5, 5, 100, 20, ur.b("Realm"), ($$0x, $$1x) -> {
            al = $$1x;
            this.az = List.of();
            this.G();
         }));
      }

      this.a(env.f.a);
      this.F();
      this.am.thenAcceptAsync($$0x -> {
         fah $$1x = $$0x.a(this.ar);
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
         this.ax.a(this.g, this.h, this.aI.c(), this.h - this.aI.b());
         this.aI.a();
      }
   }

   private void C() {
      if (this.ay.a() && this.az.isEmpty() && this.aD.isEmpty()) {
         this.a(env.f.b);
      } else {
         this.a(env.f.c);
      }
   }

   private void a(env.f $$0) {
      if (this.aH != $$0) {
         if (this.aI != null) {
            this.aI.a($$1 -> this.f($$1));
         }

         this.aI = this.b($$0);
         this.aH = $$0;
         this.aI.a($$1 -> {
            euk var10000 = this.d($$1);
         });
         this.c();
      }
   }

   private exw b(env.f $$0) {
      exw $$1 = new exw(this);
      $$1.b(44);
      $$1.a(this.D());
      exx $$2 = this.c($$0);
      $$2.a();
      $$1.a($$2.i() + 22);
      $$1.b($$2);
      switch ($$0) {
         case a:
            $$1.c(new evb(this.i, E));
            break;
         case b:
            $$1.c(this.E());
      }

      return $$1;
   }

   private exx D() {
      int $$0 = 90;
      eya $$1 = eya.e().a(4);
      $$1.c().e();
      $$1.a(this.aF);
      $$1.a(this.aG);
      eya $$2 = eya.e();
      $$2.c().e();
      $$2.a(eyb.a(90));
      $$2.a(euz.a(128, 34, B, 128, 64), exz::b);
      $$2.a(new exu(90, 44)).a($$1, exz::c);
      return $$2;
   }

   private exx c(env.f $$0) {
      exv $$1 = new exv().c(4);
      exv.b $$2 = $$1.d(3);
      if ($$0 == env.f.c) {
         $$2.a(this.as);
         $$2.a(this.av);
         $$2.a(this.au);
         $$2.a(this.aw);
      }

      $$2.a(this.aE);
      $$2.a(this.at);
      return $$1;
   }

   private eya E() {
      eya $$0 = eya.d().a(10);
      $$0.c().b();
      $$0.a(euz.a(130, 64, C, 130, 64));
      eux $$1 = new eux(308, S, this.i, false);
      $$0.a($$1);
      return $$0;
   }

   void F() {
      eor $$0 = this.K();
      this.aE.i = this.aH != env.f.a;
      this.as.i = $$0 != null && this.a($$0);
      this.au.i = $$0 != null && this.b($$0);
      this.aw.i = $$0 != null && this.d($$0);
      this.av.i = $$0 != null && this.c($$0);
   }

   boolean a(eor $$0) {
      boolean $$1 = !$$0.j && $$0.e == eor.c.b;
      return $$1 && ($$0.d() || this.i($$0));
   }

   private boolean b(eor $$0) {
      return $$0.j && this.i($$0);
   }

   private boolean c(eor $$0) {
      return this.i($$0);
   }

   private boolean d(eor $$0) {
      return !this.i($$0);
   }

   @Override
   public void d() {
      super.d();
      if (this.an != null) {
         this.an.b();
      }
   }

   public static void e() {
      esr.N().aX().d.a();
   }

   public static void f() {
      esr.N().aX().c.a();
   }

   private void G() {
      for (eqz.e<?> $$0 : this.f.aX().a()) {
         $$0.a();
      }
   }

   private eqz.c a(epq $$0) {
      eqz.c $$1 = $$0.a.a();
      $$1.a($$0.c, $$0x -> {
         this.ay.a($$0x.a());
         this.az = $$0x.b();
         this.H();
         boolean $$1x = false;

         for (eor $$2 : this.ay) {
            if (this.j($$2)) {
               $$1x = true;
            }
         }

         if (!ap && $$1x) {
            ap = true;
            this.I();
         }
      });
      a(eoa::d, $$0x -> {
         this.aD.clear();
         this.aD.addAll($$0x);

         for (eoq $$1x : $$0x) {
            if ($$1x instanceof eoq.a $$2) {
               evo $$3 = $$2.a(this, this::a);
               if ($$3 != null) {
                  this.f.a($$3);
                  this.a(List.of($$1x));
                  break;
               }
            }
         }

         if (!this.aD.isEmpty() && this.aH != env.f.a) {
            this.H();
         }
      });
      $$1.a($$0.d, $$0x -> {
         this.aF.a($$0x);
         this.aF.a($$0x == 0 ? evx.a(T) : evx.a(U));
         if ($$0x > 0 && this.aq.tryAcquire(1)) {
            this.f.aU().c(ur.a("mco.configure.world.invite.narration", $$0x));
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

   private void a(Collection<eoq> $$0) {
      List<UUID> $$1 = new ArrayList<>($$0.size());

      for (eoq $$2 : $$0) {
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

   private static <T> void a(env.k<T> $$0, Consumer<T> $$1) {
      esr $$2 = esr.N();
      CompletableFuture.<T>supplyAsync(() -> {
         try {
            return $$0.request(eoa.a($$2));
         } catch (epn var3) {
            throw new RuntimeException(var3);
         }
      }).thenAcceptAsync($$1, $$2).exceptionally($$0x -> {
         A.error("Failed to execute call to Realms Service", $$0x);
         return null;
      });
   }

   private void H() {
      eor $$0 = this.K();
      this.ax.v();

      for (eoq $$1 : this.aD) {
         if (this.a($$1)) {
            this.a(List.of($$1));
            break;
         }
      }

      for (eor $$2 : this.az) {
         this.ax.a(new env.a($$2));
      }

      for (eor $$3 : this.ay) {
         env.e $$4;
         if (b() && !$$3.h()) {
            if ($$3.e == eor.c.c) {
               continue;
            }

            $$4 = new env.i($$3);
         } else {
            $$4 = new env.l($$3);
         }

         this.ax.a((env.e)$$4);
         if ($$0 != null && $$0.a == $$3.a) {
            this.ax.a($$4);
         }
      }

      this.C();
      this.F();
   }

   private boolean a(eoq $$0) {
      if (!($$0 instanceof eoq.c $$1)) {
         return false;
      } else {
         ur $$2 = $$1.d();
         int $$3 = this.i.b($$2, 216);
         int $$4 = ati.e($$3 + 7, 36) - 1;
         this.ax.a(new env.h($$2, $$4 + 2, $$1));

         for (int $$5 = 0; $$5 < $$4; $$5++) {
            this.ax.a(new env.d());
         }

         this.ax.a(new env.b($$1.a(this)));
         return true;
      }
   }

   private void I() {
      new Thread(() -> {
         List<epb> $$0 = enz.a();
         eoa $$1 = eoa.a();
         eom $$2 = new eom();
         $$2.a = $$0;
         $$2.b = this.J();

         try {
            $$1.a($$2);
         } catch (Throwable var5) {
            A.warn("Could not send ping result to Realms: ", var5);
         }
      }).start();
   }

   private List<Long> J() {
      List<Long> $$0 = Lists.newArrayList();

      for (eor $$1 : this.ay) {
         if (this.j($$1)) {
            $$0.add($$1.a);
         }
      }

      return $$0;
   }

   private void e(@Nullable eor $$0) {
      if ($$0 != null) {
         String $$1 = asf.a($$0.b, this.f.U().b(), $$0.k);
         this.f.o.a($$1);
         ac.i().a($$1);
      }
   }

   private void f(@Nullable eor $$0) {
      if ($$0 != null && this.f.b($$0.g)) {
         this.f.a(new eqa(this, $$0.a));
      }
   }

   private void g(@Nullable eor $$0) {
      if ($$0 != null && !this.f.b($$0.g)) {
         ur $$1 = ur.c("mco.configure.world.leave.question.line1");
         ur $$2 = ur.c("mco.configure.world.leave.question.line2");
         this.f.a(new eqg($$1x -> this.a($$1x, $$0), eqg.a.b, $$1, $$2, true));
      }
   }

   @Nullable
   private eor K() {
      return this.ax.f() instanceof env.l $$0 ? $$0.c() : null;
   }

   private void a(boolean $$0, final eor $$1) {
      if ($$0) {
         (new Thread("Realms-leave-server") {
            @Override
            public void run() {
               try {
                  eoa $$0 = eoa.a();
                  $$0.d($$1.a);
                  env.this.f.execute(() -> env.this.h($$1));
               } catch (epn var2) {
                  env.A.error("Couldn't configure world", var2);
                  env.this.f.execute(() -> env.this.f.a(new eqe(var2, env.this)));
               }
            }
         }).start();
      }

      this.f.a(this);
   }

   void h(eor $$0) {
      this.ay.a($$0);
      this.ax.i().removeIf($$1 -> {
         if ($$1 instanceof env.l $$2) {
            eor $$3 = $$2.c();
            return $$3.a == $$0.a;
         } else {
            return false;
         }
      });
      this.ax.a(null);
      this.F();
   }

   void a(UUID $$0) {
      a($$1 -> {
         $$1.b(List.of($$0));
         return null;
      }, $$1 -> {
         this.aD.removeIf($$1x -> $$1x.b() && $$0.equals($$1x.c()));
         this.H();
      });
   }

   public void g() {
      this.ax.a(null);
      f();
   }

   @Override
   public ur h() {
      return (ur)(switch (this.aH) {
         case a -> uq.a(super.h(), E);
         case b -> uq.a(super.h(), S);
         case c -> super.h();
      });
   }

   @Override
   public void a(eub $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (b()) {
         $$0.b(this.i, "Minecraft " + aa.b().c(), 2, this.h - 10, -1);
      }

      if (this.aA && this.aE.i) {
         eqn.a($$0, this.aE);
      }

      switch (eoa.a) {
         case b:
            this.a($$0, "STAGE!", -256);
            break;
         case c:
            this.a($$0, "LOCAL!", 8388479);
      }
   }

   private void L() {
      this.f.a(new eqn(this, this.aA));
   }

   public static void a(@Nullable eor $$0, fah $$1) {
      a($$0, $$1, false);
   }

   public static void a(@Nullable eor $$0, fah $$1, boolean $$2) {
      if ($$0 != null) {
         if (!b() || $$2) {
            esr.N().a(new eqh($$1, new erq($$1, $$0)));
            return;
         }

         switch ($$0.u) {
            case e:
               esr.N().a(new eqh($$1, new erq($$1, $$0)));
               break;
            case a:
               a($$0, $$1, ur.c("mco.compatibility.unverifiable.title").b(-171), ur.c("mco.compatibility.unverifiable.message"), uq.j);
               break;
            case c:
               a(
                  $$0,
                  $$1,
                  ur.c("selectWorld.backupQuestion.downgrade").b(-2142128),
                  ur.a("mco.compatibility.downgrade.description", ur.b($$0.t).b(-171), ur.b(aa.b().c()).b(-171)),
                  ur.c("mco.compatibility.downgrade")
               );
               break;
            case d:
               a(
                  $$0,
                  $$1,
                  ur.c("mco.compatibility.upgrade.title").b(-171),
                  ur.a("mco.compatibility.upgrade.description", ur.b($$0.t).b(-171), ur.b(aa.b().c()).b(-171)),
                  ur.c("mco.compatibility.upgrade")
               );
         }
      }
   }

   private static void a(eor $$0, fah $$1, ur $$2, ur $$3, ur $$4) {
      esr.N().a(new eza($$2x -> {
         fah $$3x;
         if ($$2x) {
            $$3x = new eqh($$1, new erq($$1, $$0));
            f();
         } else {
            $$3x = $$1;
         }

         esr.N().a($$3x);
      }, $$2, $$3, $$4, uq.e));
   }

   public static ur a(String $$0, boolean $$1) {
      return a($$0, $$1 ? -8355712 : -2142128);
   }

   public static ur a(String $$0, int $$1) {
      return (ur)(StringUtils.isBlank($$0) ? uq.a : ur.a("mco.version", ur.b($$0).b($$1)));
   }

   boolean i(eor $$0) {
      return this.f.b($$0.g);
   }

   private boolean j(eor $$0) {
      return this.i($$0) && !$$0.j;
   }

   private void a(eub $$0, String $$1, int $$2) {
      $$0.c().a();
      $$0.c().a((float)(this.g / 2 - 25), 20.0F, 0.0F);
      $$0.c().a(a.f.rotationDegrees(-20.0F));
      $$0.c().b(1.5F, 1.5F, 1.5F);
      $$0.a(this.i, $$1, 0, 0, $$2, false);
      $$0.c().b();
   }

   class a extends env.e {
      private static final ur c = ur.c("mco.snapshot.start");
      private static final int d = 5;
      private final evx e;
      private final eor f;

      public a(eor $$0) {
         this.f = $$0;
         this.e = evx.a(ur.c("mco.snapshot.tooltip"));
      }

      @Override
      public void a(eub $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(env.b, $$3 - 5, $$2 + $$5 / 2 - 10, 40, 20);
         int $$10 = $$2 + $$5 / 2 - 9 / 2;
         $$0.b(env.this.i, c, $$3 + 40 - 2, $$10 - 5, 8388479);
         $$0.b(env.this.i, ur.a("mco.snapshot.description", this.f.c), $$3 + 40 - 2, $$10 + 5, -8355712);
         this.e.a($$8, this.aI_(), new eyp($$3, $$2, $$4, $$5));
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         this.c();
         return true;
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         if (eyk.a($$0)) {
            this.c();
            return true;
         } else {
            return super.a($$0, $$1, $$2);
         }
      }

      private void c() {
         env.this.f.ah().a(gek.a(aqn.yy, 1.0F));
         env.this.f
            .a(
               new evo.a(env.this, ur.c("mco.snapshot.createSnapshotPopup.title"))
                  .a(ur.c("mco.snapshot.createSnapshotPopup.text"))
                  .a(ur.c("mco.selectServer.create"), $$0 -> env.this.f.a(new eqc(env.this, this.f.a)))
                  .a(uq.e, evo::aE_)
                  .a()
            );
      }

      @Override
      public ur a() {
         return ur.a("gui.narrate.button", uq.a(c, ur.a("mco.snapshot.description", this.f.c)));
      }
   }

   class b extends env.e {
      private final eum c;

      public b(eum $$0) {
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
      public void a(eub $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.c.b(env.this.g / 2 - 75, $$2 + 4);
         this.c.a($$0, $$6, $$7, $$9);
      }

      @Override
      public ur a() {
         return this.c.l();
      }
   }

   static class c extends euy {
      private static final evz b = new evz(new agg("widget/cross_button"), new agg("widget/cross_button_highlighted"));

      protected c(eum.c $$0, ur $$1) {
         super(0, 0, 14, 14, b, $$0);
         this.a(evx.a($$1));
      }
   }

   class d extends env.e {
      @Override
      public void a(eub $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
      }

      @Override
      public ur a() {
         return ur.i();
      }
   }

   abstract class e extends evi.a<env.e> {
      private static final int a = 10;
      private static final int c = 28;
      private static final int d = 7;

      protected void a(eor $$0, eub $$1, int $$2, int $$3, int $$4, int $$5) {
         int $$6 = $$2 - 10 - 7;
         int $$7 = $$3 + 2;
         if ($$0.j) {
            this.a($$1, $$6, $$7, $$4, $$5, env.c, () -> env.M);
         } else if ($$0.e == eor.c.a) {
            this.a($$1, $$6, $$7, $$4, $$5, env.x, () -> env.Q);
         } else if (env.this.i($$0) && $$0.l < 7) {
            this.a($$1, $$6, $$7, $$4, $$5, env.v, () -> {
               if ($$0.l <= 0) {
                  return env.N;
               } else {
                  return (ur)($$0.l == 1 ? env.O : ur.a("mco.selectServer.expires.days", $$0.l));
               }
            });
         } else if ($$0.e == eor.c.b) {
            this.a($$1, $$6, $$7, $$4, $$5, env.w, () -> env.P);
         }
      }

      private void a(eub $$0, int $$1, int $$2, int $$3, int $$4, agg $$5, Supplier<ur> $$6) {
         $$0.a($$5, $$1, $$2, 10, 28);
         if (env.this.ax.a_((double)$$3, (double)$$4) && $$3 >= $$1 && $$3 <= $$1 + 10 && $$4 >= $$2 && $$4 <= $$2 + 28) {
            env.this.d($$6.get());
         }
      }

      protected void a(eub $$0, int $$1, int $$2, eor $$3) {
         int $$4 = this.b($$2);
         int $$5 = this.a($$1);
         int $$6 = this.d($$5);
         if (!env.this.i($$3)) {
            $$0.a(env.this.i, $$3.f, $$4, this.d($$5), -8355712, false);
         } else if ($$3.j) {
            ur $$7 = $$3.k ? env.I : env.G;
            $$0.a(env.this.i, $$7, $$4, $$6, -2142128, false);
         }
      }

      protected void a(eub $$0, String $$1, int $$2, int $$3, int $$4, int $$5) {
         int $$6 = $$4 - $$2;
         if (env.this.i.b($$1) > $$6) {
            String $$7 = env.this.i.a($$1, $$6 - env.this.i.b("... "));
            $$0.a(env.this.i, $$7 + "...", $$2, $$3, $$5, false);
         } else {
            $$0.a(env.this.i, $$1, $$2, $$3, $$5, false);
         }
      }

      protected int a(int $$0, int $$1, ur $$2) {
         return $$0 + $$1 - env.this.i.a($$2) - 20;
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

   static class g extends evr.b {
      private static final agg[] d = new agg[]{
         new agg("notification/1"),
         new agg("notification/2"),
         new agg("notification/3"),
         new agg("notification/4"),
         new agg("notification/5"),
         new agg("notification/more")
      };
      private static final int t = Integer.MAX_VALUE;
      private static final int u = 20;
      private static final int v = 14;
      private int w;

      public g(ur $$0, agg $$1, eum.c $$2) {
         super(20, 20, $$0, 14, 14, $$1, $$2);
      }

      int a() {
         return this.w;
      }

      public void a(int $$0) {
         this.w = $$0;
      }

      @Override
      public void b(eub $$0, int $$1, int $$2, float $$3) {
         super.b($$0, $$1, $$2, $$3);
         if (this.i && this.w != 0) {
            this.a($$0);
         }
      }

      private void a(eub $$0) {
         $$0.a(d[Math.min(this.w, 6) - 1], this.p() + this.k() - 5, this.r() - 3, 8, 8);
      }
   }

   class h extends env.e {
      private static final int c = 40;
      private static final int d = -12303292;
      private final ur e;
      private final int f;
      private final List<euk> g = new ArrayList<>();
      @Nullable
      private final env.c h;
      private final evg i;
      private final exv j;
      private final exu k;
      private int l = -1;

      public h(ur $$0, int $$1, eoq $$2) {
         this.e = $$0;
         this.f = $$1;
         this.j = new exv();
         int $$3 = 7;
         this.j.a(euz.a(20, 20, env.a), 0, 0, this.j.b().a(7, 7, 0, 0));
         this.j.a(eyb.a(40), 0, 0);
         this.k = this.j.a(new exu(0, 9 * 3 * ($$1 - 1)), 0, 1, this.j.b().c(7));
         this.i = this.k.a(new evg($$0, env.this.i).b(true), this.k.b().b().d());
         this.j.a(eyb.a(40), 0, 2);
         if ($$2.b()) {
            this.h = this.j.a(new env.c($$1x -> env.this.a($$2.c()), ur.c("mco.notification.dismiss")), 0, 2, this.j.b().c().a(0, 7, 7, 0));
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
         this.i.j($$1);
         this.j.a();
      }

      @Override
      public void b(eub $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         super.b($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
         $$0.b($$3 - 2, $$2 - 2, $$4, 36 * this.f - 2, -12303292);
      }

      @Override
      public void a(eub $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.j.b($$3, $$2);
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
      public ur a() {
         return this.e;
      }
   }

   class i extends env.e {
      private final eor c;
      private final evx d;

      public i(eor $$0) {
         this.c = $$0;
         this.d = evx.a(ur.c("mco.snapshot.parent.tooltip"));
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         return true;
      }

      @Override
      public void a(eub $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = this.b($$3);
         int $$11 = this.a($$2);
         erh.a($$0, $$3, $$2, 32, this.c.g);
         ur $$12 = env.a(this.c.t, -8355712);
         int $$13 = this.a($$3, $$4, $$12);
         this.a($$0, this.c.b(), $$10, $$11, $$13, -8355712);
         if ($$12 != uq.a) {
            $$0.a(env.this.i, $$12, $$13, $$11, -8355712, false);
         }

         $$0.a(env.this.i, this.c.a(), $$10, this.c($$11), -8355712, false);
         this.a($$0, $$2, $$3, this.c);
         this.a(this.c, $$0, $$3 + $$4, $$2, $$6, $$7);
         this.d.a($$8, this.aI_(), new eyp($$3, $$2, $$4, $$5));
      }

      @Override
      public ur a() {
         return ur.b(this.c.c);
      }
   }

   class j extends ghd<env.e> {
      public j() {
         super(env.this.g, env.this.h, 0, env.this.h, 36);
      }

      public void a(@Nullable env.e $$0) {
         super.a($$0);
         env.this.F();
      }

      @Override
      public int a() {
         return this.k() * 36;
      }

      @Override
      public int b() {
         return 300;
      }
   }

   interface k<T> {
      T request(eoa var1) throws epn;
   }

   class l extends env.e {
      private static final int c = 36;
      private final eor d;
      @Nullable
      private final evx e;

      public l(eor $$0) {
         this.d = $$0;
         boolean $$1 = env.this.i($$0);
         if (env.b() && $$1 && $$0.h()) {
            this.e = evx.a(ur.a("mco.snapshot.paired", $$0.s));
         } else if (env.b() && !$$1 && $$0.e()) {
            this.e = evx.a(ur.a("mco.snapshot.friendsRealm.upgrade", $$0.f));
         } else if (env.b() && !$$1 && $$0.f()) {
            this.e = evx.a(ur.a("mco.snapshot.friendsRealm.downgrade", $$0.t));
         } else {
            this.e = null;
         }
      }

      @Override
      public void a(eub $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         if (this.d.e == eor.c.c) {
            $$0.a(env.b, $$3 - 5, $$2 + $$5 / 2 - 10, 40, 20);
            int $$10 = $$2 + $$5 / 2 - 9 / 2;
            $$0.b(env.this.i, env.F, $$3 + 40 - 2, $$10, 8388479);
         } else {
            erh.a($$0, $$3, $$2, 32, this.d.g);
            this.a($$0, $$2, $$3, $$4);
            this.a($$0, $$2, $$3);
            this.a($$0, $$2, $$3, this.d);
            this.a(this.d, $$0, $$3 + $$4, $$2, $$6, $$7);
            if (this.e != null) {
               this.e.a($$8, this.aI_(), new eyp($$3, $$2, $$4, $$5));
            }
         }
      }

      private void a(eub $$0, int $$1, int $$2, int $$3) {
         int $$4 = this.b($$2);
         int $$5 = this.a($$1);
         ur $$6 = env.a(this.d.t, this.d.d());
         int $$7 = this.a($$2, $$3, $$6);
         this.a($$0, this.d.b(), $$4, $$5, $$7, -1);
         if ($$6 != uq.a) {
            $$0.a(env.this.i, $$6, $$7, $$5, -8355712, false);
         }
      }

      private void a(eub $$0, int $$1, int $$2) {
         int $$3 = this.b($$2);
         int $$4 = this.a($$1);
         int $$5 = this.c($$4);
         if (this.d.m == eor.d.b) {
            ur $$6 = ur.b(this.d.c()).a(n.h);
            $$0.a(env.this.i, ur.a("mco.selectServer.minigameName", $$6).b(-171), $$3, $$5, -1, false);
         } else {
            $$0.a(env.this.i, this.d.a(), $$3, this.c($$4), -8355712, false);
         }
      }

      private void e() {
         env.this.f.ah().a(gek.a(aqn.yy, 1.0F));
         env.a(this.d, env.this);
      }

      private void f() {
         env.this.f.ah().a(gek.a(aqn.yy, 1.0F));
         eqc $$0 = new eqc(env.this, this.d);
         env.this.f.a($$0);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         if (this.d.e == eor.c.c) {
            this.f();
         } else if (env.this.a(this.d)) {
            if (ac.b() - env.this.aC < 250L && this.aI_()) {
               this.e();
            }

            env.this.aC = ac.b();
         }

         return true;
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         if (eyk.a($$0)) {
            if (this.d.e == eor.c.c) {
               this.f();
               return true;
            }

            if (env.this.a(this.d)) {
               this.e();
               return true;
            }
         }

         return super.a($$0, $$1, $$2);
      }

      @Override
      public ur a() {
         return (ur)(this.d.e == eor.c.c ? env.R : ur.a("narrator.select", this.d.c));
      }

      public eor c() {
         return this.d;
      }
   }
}
