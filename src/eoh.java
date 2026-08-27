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

public class eoh extends ghr {
   static final agi a = new agi("icon/info");
   static final agi b = new agi("icon/new_realm");
   static final agi c = new agi("realm_status/expired");
   static final agi v = new agi("realm_status/expires_soon");
   static final agi w = new agi("realm_status/open");
   static final agi x = new agi("realm_status/closed");
   private static final agi y = new agi("icon/invite");
   private static final agi z = new agi("icon/news");
   static final Logger A = LogUtils.getLogger();
   private static final agi B = new agi("textures/gui/title/realms.png");
   private static final agi C = new agi("textures/gui/realms/no_realms.png");
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
   private final CompletableFuture<eog.a> am = eog.a();
   @Nullable
   private erl.c an;
   private final Set<UUID> ao = new HashSet<>();
   private static boolean ap;
   private final RateLimiter aq;
   private final fau ar;
   private euz as;
   private euz at;
   private euz au;
   private euz av;
   private euz aw;
   eoh.j ax;
   private eqe ay;
   private List<epd> az = List.of();
   private volatile boolean aA;
   @Nullable
   private volatile String aB;
   long aC;
   private final List<epc> aD = new ArrayList<>();
   private euz aE;
   private eoh.g aF;
   private eoh.g aG;
   private eoh.f aH;
   @Nullable
   private eyj aI;

   public eoh(fau $$0) {
      super(D);
      this.ar = $$0;
      this.aq = RateLimiter.create(0.016666668F);
   }

   @Override
   public void aP_() {
      this.ay = new eqe(this.f);
      this.ax = this.d(new eoh.j());
      ur $$0 = ur.c("mco.invites.title");
      this.aF = new eoh.g($$0, y, $$1x -> this.f.a(new eqx(this, $$0)));
      ur $$1 = ur.c("mco.news");
      this.aG = new eoh.g($$1, z, $$0x -> {
         String $$1x = this.aB;
         if ($$1x != null) {
            ezm.a(this, $$1x);
            if (this.aG.a() != 0) {
               err.a $$2 = err.b();
               $$2.b = false;
               err.b($$2);
               this.aG.a(0);
            }
         }
      });
      this.aG.a(ewk.a($$1));
      this.as = euz.a(J, $$0x -> a(this.K(), this)).a(100).a();
      this.av = euz.a(L, $$0x -> this.f(this.K())).a(100).a();
      this.au = euz.a(H, $$0x -> this.e(this.K())).a(100).a();
      this.aw = euz.a(K, $$0x -> this.g(this.K())).a(100).a();
      this.aE = euz.a(ur.c("mco.selectServer.purchase"), $$0x -> this.L()).b(100, 20).a();
      this.at = euz.a(uq.k, $$0x -> this.f.a(this.ar)).a(100).a();
      if (eom.a == eom.b.b) {
         this.d(evg.a(ur.b("Snapshot"), ur.b("Release")).a(5, 5, 100, 20, ur.b("Realm"), ($$0x, $$1x) -> {
            al = $$1x;
            this.az = List.of();
            this.G();
         }));
      }

      this.a(eoh.f.a);
      this.F();
      this.am.thenAcceptAsync($$0x -> {
         fau $$1x = $$0x.a(this.ar);
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
         this.a(eoh.f.b);
      } else {
         this.a(eoh.f.c);
      }
   }

   private void a(eoh.f $$0) {
      if (this.aH != $$0) {
         if (this.aI != null) {
            this.aI.a($$1 -> this.f($$1));
         }

         this.aI = this.b($$0);
         this.aH = $$0;
         this.aI.a($$1 -> {
            eux var10000 = this.d($$1);
         });
         this.c();
      }
   }

   private eyj b(eoh.f $$0) {
      eyj $$1 = new eyj(this);
      $$1.b(44);
      $$1.a(this.D());
      eyk $$2 = this.c($$0);
      $$2.a();
      $$1.a($$2.i() + 22);
      $$1.b($$2);
      switch ($$0) {
         case a:
            $$1.c(new evo(this.i, E));
            break;
         case b:
            $$1.c(this.E());
      }

      return $$1;
   }

   private eyk D() {
      int $$0 = 90;
      eyn $$1 = eyn.e().a(4);
      $$1.c().e();
      $$1.a(this.aF);
      $$1.a(this.aG);
      eyn $$2 = eyn.e();
      $$2.c().e();
      $$2.a(eyo.a(90));
      $$2.a(evm.a(128, 34, B, 128, 64), eym::b);
      $$2.a(new eyh(90, 44)).a($$1, eym::c);
      return $$2;
   }

   private eyk c(eoh.f $$0) {
      eyi $$1 = new eyi().c(4);
      eyi.b $$2 = $$1.d(3);
      if ($$0 == eoh.f.c) {
         $$2.a(this.as);
         $$2.a(this.av);
         $$2.a(this.au);
         $$2.a(this.aw);
      }

      $$2.a(this.aE);
      $$2.a(this.at);
      return $$1;
   }

   private eyn E() {
      eyn $$0 = eyn.d().a(10);
      $$0.c().b();
      $$0.a(evm.a(130, 64, C, 130, 64));
      evk $$1 = new evk(308, S, this.i, false);
      $$0.a($$1);
      return $$0;
   }

   void F() {
      epd $$0 = this.K();
      this.aE.i = this.aH != eoh.f.a;
      this.as.i = $$0 != null && this.a($$0);
      this.au.i = $$0 != null && this.b($$0);
      this.aw.i = $$0 != null && this.d($$0);
      this.av.i = $$0 != null && this.c($$0);
   }

   boolean a(epd $$0) {
      boolean $$1 = !$$0.j && $$0.e == epd.c.b;
      return $$1 && ($$0.d() || this.h($$0));
   }

   private boolean b(epd $$0) {
      return $$0.j && this.h($$0);
   }

   private boolean c(epd $$0) {
      return this.h($$0) && $$0.e != epd.c.c;
   }

   private boolean d(epd $$0) {
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
      etd.N().aX().d.a();
   }

   public static void f() {
      etd.N().aX().c.a();
   }

   private void G() {
      for (erl.e<?> $$0 : this.f.aX().a()) {
         $$0.a();
      }
   }

   private erl.c a(eqc $$0) {
      erl.c $$1 = $$0.a.a();
      $$1.a($$0.c, $$0x -> {
         this.ay.a($$0x.a());
         this.az = $$0x.b();
         this.H();
         boolean $$1x = false;

         for (epd $$2 : this.ay) {
            if (this.i($$2)) {
               $$1x = true;
            }
         }

         if (!ap && $$1x) {
            ap = true;
            this.I();
         }
      });
      a(eom::d, $$0x -> {
         this.aD.clear();
         this.aD.addAll($$0x);

         for (epc $$1x : $$0x) {
            if ($$1x instanceof epc.a $$2) {
               ewb $$3 = $$2.a(this, this::a);
               if ($$3 != null) {
                  this.f.a($$3);
                  this.a(List.of($$1x));
                  break;
               }
            }
         }

         if (!this.aD.isEmpty() && this.aH != eoh.f.a) {
            this.H();
         }
      });
      $$1.a($$0.d, $$0x -> {
         this.aF.a($$0x);
         this.aF.a($$0x == 0 ? ewk.a(T) : ewk.a(U));
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

   private void a(Collection<epc> $$0) {
      List<UUID> $$1 = new ArrayList<>($$0.size());

      for (epc $$2 : $$0) {
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

   private static <T> void a(eoh.k<T> $$0, Consumer<T> $$1) {
      etd $$2 = etd.N();
      CompletableFuture.<T>supplyAsync(() -> {
         try {
            return $$0.request(eom.a($$2));
         } catch (epz var3) {
            throw new RuntimeException(var3);
         }
      }).thenAcceptAsync($$1, $$2).exceptionally($$0x -> {
         A.error("Failed to execute call to Realms Service", $$0x);
         return null;
      });
   }

   private void H() {
      epd $$0 = this.K();
      this.ax.v();

      for (epc $$1 : this.aD) {
         if (this.a($$1)) {
            this.a(List.of($$1));
            break;
         }
      }

      for (epd $$2 : this.az) {
         this.ax.a(new eoh.a($$2));
      }

      for (epd $$3 : this.ay) {
         eoh.e $$4;
         if (b() && !$$3.h()) {
            if ($$3.e == epd.c.c) {
               continue;
            }

            $$4 = new eoh.i($$3);
         } else {
            $$4 = new eoh.l($$3);
         }

         this.ax.a((eoh.e)$$4);
         if ($$0 != null && $$0.a == $$3.a) {
            this.ax.a($$4);
         }
      }

      this.C();
      this.F();
   }

   private boolean a(epc $$0) {
      if (!($$0 instanceof epc.c $$1)) {
         return false;
      } else {
         ur $$2 = $$1.d();
         int $$3 = this.i.b($$2, 216);
         int $$4 = atm.e($$3 + 7, 36) - 1;
         this.ax.a(new eoh.h($$2, $$4 + 2, $$1));

         for (int $$5 = 0; $$5 < $$4; $$5++) {
            this.ax.a(new eoh.d());
         }

         this.ax.a(new eoh.b($$1.a(this)));
         return true;
      }
   }

   private void I() {
      new Thread(() -> {
         List<epn> $$0 = eol.a();
         eom $$1 = eom.a();
         eoy $$2 = new eoy();
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

      for (epd $$1 : this.ay) {
         if (this.i($$1)) {
            $$0.add($$1.a);
         }
      }

      return $$0;
   }

   private void e(@Nullable epd $$0) {
      if ($$0 != null) {
         String $$1 = asj.a($$0.b, this.f.U().b(), $$0.k);
         this.f.o.a($$1);
         ac.i().a($$1);
      }
   }

   private void f(@Nullable epd $$0) {
      if ($$0 != null && this.f.b($$0.g)) {
         this.f.a(new eqm(this, $$0.a));
      }
   }

   private void g(@Nullable epd $$0) {
      if ($$0 != null && !this.f.b($$0.g)) {
         ur $$1 = ur.c("mco.configure.world.leave.question.line1");
         ur $$2 = ur.c("mco.configure.world.leave.question.line2");
         this.f.a(new eqs($$1x -> this.a($$1x, $$0), eqs.a.b, $$1, $$2, true));
      }
   }

   @Nullable
   private epd K() {
      return this.ax.f() instanceof eoh.l $$0 ? $$0.c() : null;
   }

   private void a(boolean $$0, final epd $$1) {
      if ($$0) {
         (new Thread("Realms-leave-server") {
            @Override
            public void run() {
               try {
                  eom $$0 = eom.a();
                  $$0.d($$1.a);
                  eoh.this.f.execute(eoh::f);
               } catch (epz var2) {
                  eoh.A.error("Couldn't configure world", var2);
                  eoh.this.f.execute(() -> eoh.this.f.a(new eqq(var2, eoh.this)));
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
   public void a(euo $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (b()) {
         $$0.b(this.i, "Minecraft " + aa.b().c(), 2, this.h - 10, -1);
      }

      if (this.aA && this.aE.i) {
         eqz.a($$0, this.aE);
      }

      switch (eom.a) {
         case b:
            this.a($$0, "STAGE!", -256);
            break;
         case c:
            this.a($$0, "LOCAL!", 8388479);
      }
   }

   private void L() {
      this.f.a(new eqz(this, this.aA));
   }

   public static void a(@Nullable epd $$0, fau $$1) {
      a($$0, $$1, false);
   }

   public static void a(@Nullable epd $$0, fau $$1, boolean $$2) {
      if ($$0 != null) {
         if (!b() || $$2) {
            etd.N().a(new eqt($$1, new esc($$1, $$0)));
            return;
         }

         switch ($$0.u) {
            case e:
               etd.N().a(new eqt($$1, new esc($$1, $$0)));
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

   private static void a(epd $$0, fau $$1, ur $$2, ur $$3, ur $$4) {
      etd.N().a(new ezn($$2x -> {
         fau $$3x;
         if ($$2x) {
            $$3x = new eqt($$1, new esc($$1, $$0));
            f();
         } else {
            $$3x = $$1;
         }

         etd.N().a($$3x);
      }, $$2, $$3, $$4, uq.e));
   }

   public static ur a(String $$0, boolean $$1) {
      return a($$0, $$1 ? -8355712 : -2142128);
   }

   public static ur a(String $$0, int $$1) {
      return (ur)(StringUtils.isBlank($$0) ? uq.a : ur.a("mco.version", ur.b($$0).b($$1)));
   }

   boolean h(epd $$0) {
      return this.f.b($$0.g);
   }

   private boolean i(epd $$0) {
      return this.h($$0) && !$$0.j;
   }

   private void a(euo $$0, String $$1, int $$2) {
      $$0.c().a();
      $$0.c().a((float)(this.g / 2 - 25), 20.0F, 0.0F);
      $$0.c().a(a.f.rotationDegrees(-20.0F));
      $$0.c().b(1.5F, 1.5F, 1.5F);
      $$0.a(this.i, $$1, 0, 0, $$2, false);
      $$0.c().b();
   }

   class a extends eoh.e {
      private static final ur c = ur.c("mco.snapshot.start");
      private static final int d = 5;
      private final ewk e;
      private final epd f;

      public a(epd $$0) {
         this.f = $$0;
         this.e = ewk.a(ur.c("mco.snapshot.tooltip"));
      }

      @Override
      public void a(euo $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(eoh.b, $$3 - 5, $$2 + $$5 / 2 - 10, 40, 20);
         int $$10 = $$2 + $$5 / 2 - 9 / 2;
         $$0.b(eoh.this.i, c, $$3 + 40 - 2, $$10 - 5, 8388479);
         $$0.b(eoh.this.i, ur.a("mco.snapshot.description", this.f.c), $$3 + 40 - 2, $$10 + 5, -8355712);
         this.e.a($$8, this.aJ_(), new ezc($$3, $$2, $$4, $$5));
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         this.c();
         return true;
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         if (eyx.a($$0)) {
            this.c();
            return true;
         } else {
            return super.a($$0, $$1, $$2);
         }
      }

      private void c() {
         eoh.this.f.ah().a(gex.a(aqr.yZ, 1.0F));
         eoh.this.f
            .a(
               new ewb.a(eoh.this, ur.c("mco.snapshot.createSnapshotPopup.title"))
                  .a(ur.c("mco.snapshot.createSnapshotPopup.text"))
                  .a(ur.c("mco.selectServer.create"), $$0 -> eoh.this.f.a(new eqo(eoh.this, this.f.a)))
                  .a(uq.e, ewb::aF_)
                  .a()
            );
      }

      @Override
      public ur a() {
         return ur.a("gui.narrate.button", uq.a(c, ur.a("mco.snapshot.description", this.f.c)));
      }
   }

   class b extends eoh.e {
      private final euz c;

      public b(euz $$0) {
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
      public void a(euo $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.c.b(eoh.this.g / 2 - 75, $$2 + 4);
         this.c.a($$0, $$6, $$7, $$9);
      }

      @Override
      public ur a() {
         return this.c.l();
      }
   }

   static class c extends evl {
      private static final ewm b = new ewm(new agi("widget/cross_button"), new agi("widget/cross_button_highlighted"));

      protected c(euz.c $$0, ur $$1) {
         super(0, 0, 14, 14, b, $$0);
         this.a(ewk.a($$1));
      }
   }

   class d extends eoh.e {
      @Override
      public void a(euo $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
      }

      @Override
      public ur a() {
         return ur.i();
      }
   }

   abstract class e extends evv.a<eoh.e> {
      private static final int a = 10;
      private static final int c = 28;
      private static final int d = 7;

      protected void a(epd $$0, euo $$1, int $$2, int $$3, int $$4, int $$5) {
         int $$6 = $$2 - 10 - 7;
         int $$7 = $$3 + 2;
         if ($$0.j) {
            this.a($$1, $$6, $$7, $$4, $$5, eoh.c, () -> eoh.M);
         } else if ($$0.e == epd.c.a) {
            this.a($$1, $$6, $$7, $$4, $$5, eoh.x, () -> eoh.Q);
         } else if (eoh.this.h($$0) && $$0.l < 7) {
            this.a($$1, $$6, $$7, $$4, $$5, eoh.v, () -> {
               if ($$0.l <= 0) {
                  return eoh.N;
               } else {
                  return (ur)($$0.l == 1 ? eoh.O : ur.a("mco.selectServer.expires.days", $$0.l));
               }
            });
         } else if ($$0.e == epd.c.b) {
            this.a($$1, $$6, $$7, $$4, $$5, eoh.w, () -> eoh.P);
         }
      }

      private void a(euo $$0, int $$1, int $$2, int $$3, int $$4, agi $$5, Supplier<ur> $$6) {
         $$0.a($$5, $$1, $$2, 10, 28);
         if (eoh.this.ax.a_((double)$$3, (double)$$4) && $$3 >= $$1 && $$3 <= $$1 + 10 && $$4 >= $$2 && $$4 <= $$2 + 28) {
            eoh.this.d($$6.get());
         }
      }

      protected void a(euo $$0, int $$1, int $$2, epd $$3) {
         int $$4 = this.b($$2);
         int $$5 = this.a($$1);
         int $$6 = this.d($$5);
         if (!eoh.this.h($$3)) {
            $$0.a(eoh.this.i, $$3.f, $$4, this.d($$5), -8355712, false);
         } else if ($$3.j) {
            ur $$7 = $$3.k ? eoh.I : eoh.G;
            $$0.a(eoh.this.i, $$7, $$4, $$6, -2142128, false);
         }
      }

      protected void a(euo $$0, String $$1, int $$2, int $$3, int $$4, int $$5) {
         int $$6 = $$4 - $$2;
         if (eoh.this.i.b($$1) > $$6) {
            String $$7 = eoh.this.i.a($$1, $$6 - eoh.this.i.b("... "));
            $$0.a(eoh.this.i, $$7 + "...", $$2, $$3, $$5, false);
         } else {
            $$0.a(eoh.this.i, $$1, $$2, $$3, $$5, false);
         }
      }

      protected int a(int $$0, int $$1, ur $$2) {
         return $$0 + $$1 - eoh.this.i.a($$2) - 20;
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

   static class g extends ewe.b {
      private static final agi[] d = new agi[]{
         new agi("notification/1"),
         new agi("notification/2"),
         new agi("notification/3"),
         new agi("notification/4"),
         new agi("notification/5"),
         new agi("notification/more")
      };
      private static final int t = Integer.MAX_VALUE;
      private static final int u = 20;
      private static final int v = 14;
      private int w;

      public g(ur $$0, agi $$1, euz.c $$2) {
         super(20, 20, $$0, 14, 14, $$1, $$2);
      }

      int a() {
         return this.w;
      }

      public void a(int $$0) {
         this.w = $$0;
      }

      @Override
      public void b(euo $$0, int $$1, int $$2, float $$3) {
         super.b($$0, $$1, $$2, $$3);
         if (this.i && this.w != 0) {
            this.a($$0);
         }
      }

      private void a(euo $$0) {
         $$0.a(d[Math.min(this.w, 6) - 1], this.p() + this.k() - 5, this.r() - 3, 8, 8);
      }
   }

   class h extends eoh.e {
      private static final int c = 40;
      private static final int d = -12303292;
      private final ur e;
      private final int f;
      private final List<eux> g = new ArrayList<>();
      @Nullable
      private final eoh.c h;
      private final evt i;
      private final eyi j;
      private final eyh k;
      private int l = -1;

      public h(ur $$0, int $$1, epc $$2) {
         this.e = $$0;
         this.f = $$1;
         this.j = new eyi();
         int $$3 = 7;
         this.j.a(evm.a(20, 20, eoh.a), 0, 0, this.j.b().a(7, 7, 0, 0));
         this.j.a(eyo.a(40), 0, 0);
         this.k = this.j.a(new eyh(0, 9 * 3 * ($$1 - 1)), 0, 1, this.j.b().c(7));
         this.i = this.k.a(new evt($$0, eoh.this.i).b(true), this.k.b().b().d());
         this.j.a(eyo.a(40), 0, 2);
         if ($$2.b()) {
            this.h = this.j.a(new eoh.c($$1x -> eoh.this.a($$2.c()), ur.c("mco.notification.dismiss")), 0, 2, this.j.b().c().a(0, 7, 7, 0));
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
      public void b(euo $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         super.b($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
         $$0.b($$3 - 2, $$2 - 2, $$4, 36 * this.f - 2, -12303292);
      }

      @Override
      public void a(euo $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
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

   class i extends eoh.e {
      private final epd c;
      private final ewk d;

      public i(epd $$0) {
         this.c = $$0;
         this.d = ewk.a(ur.c("mco.snapshot.parent.tooltip"));
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         return true;
      }

      @Override
      public void a(euo $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = this.b($$3);
         int $$11 = this.a($$2);
         ert.a($$0, $$3, $$2, 32, this.c.g);
         ur $$12 = eoh.a(this.c.t, -8355712);
         int $$13 = this.a($$3, $$4, $$12);
         this.a($$0, this.c.b(), $$10, $$11, $$13, -8355712);
         if ($$12 != uq.a) {
            $$0.a(eoh.this.i, $$12, $$13, $$11, -8355712, false);
         }

         $$0.a(eoh.this.i, this.c.a(), $$10, this.c($$11), -8355712, false);
         this.a($$0, $$2, $$3, this.c);
         this.a(this.c, $$0, $$3 + $$4, $$2, $$6, $$7);
         this.d.a($$8, this.aJ_(), new ezc($$3, $$2, $$4, $$5));
      }

      @Override
      public ur a() {
         return ur.b(this.c.c);
      }
   }

   class j extends ghq<eoh.e> {
      public j() {
         super(eoh.this.g, eoh.this.h, 0, eoh.this.h, 36);
      }

      public void a(@Nullable eoh.e $$0) {
         super.a($$0);
         eoh.this.F();
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
      T request(eom var1) throws epz;
   }

   class l extends eoh.e {
      private static final int c = 36;
      private final epd d;
      @Nullable
      private final ewk e;

      public l(epd $$0) {
         this.d = $$0;
         boolean $$1 = eoh.this.h($$0);
         if (eoh.b() && $$1 && $$0.h()) {
            this.e = ewk.a(ur.a("mco.snapshot.paired", $$0.s));
         } else if (!$$1 && $$0.e()) {
            this.e = ewk.a(ur.a("mco.snapshot.friendsRealm.upgrade", $$0.f));
         } else if (!$$1 && $$0.f()) {
            this.e = ewk.a(ur.a("mco.snapshot.friendsRealm.downgrade", $$0.t));
         } else {
            this.e = null;
         }
      }

      @Override
      public void a(euo $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         if (this.d.e == epd.c.c) {
            $$0.a(eoh.b, $$3 - 5, $$2 + $$5 / 2 - 10, 40, 20);
            int $$10 = $$2 + $$5 / 2 - 9 / 2;
            $$0.b(eoh.this.i, eoh.F, $$3 + 40 - 2, $$10, 8388479);
         } else {
            ert.a($$0, $$3, $$2, 32, this.d.g);
            this.a($$0, $$2, $$3, $$4);
            this.a($$0, $$2, $$3);
            this.a($$0, $$2, $$3, this.d);
            this.a(this.d, $$0, $$3 + $$4, $$2, $$6, $$7);
            if (this.e != null) {
               this.e.a($$8, this.aJ_(), new ezc($$3, $$2, $$4, $$5));
            }
         }
      }

      private void a(euo $$0, int $$1, int $$2, int $$3) {
         int $$4 = this.b($$2);
         int $$5 = this.a($$1);
         ur $$6 = eoh.a(this.d.t, this.d.d());
         int $$7 = this.a($$2, $$3, $$6);
         this.a($$0, this.d.b(), $$4, $$5, $$7, -1);
         if ($$6 != uq.a) {
            $$0.a(eoh.this.i, $$6, $$7, $$5, -8355712, false);
         }
      }

      private void a(euo $$0, int $$1, int $$2) {
         int $$3 = this.b($$2);
         int $$4 = this.a($$1);
         int $$5 = this.c($$4);
         if (this.d.m == epd.d.b) {
            ur $$6 = ur.b(this.d.c()).a(n.h);
            $$0.a(eoh.this.i, ur.a("mco.selectServer.minigameName", $$6).b(-171), $$3, $$5, -1, false);
         } else {
            $$0.a(eoh.this.i, this.d.a(), $$3, this.c($$4), -8355712, false);
         }
      }

      private void e() {
         eoh.this.f.ah().a(gex.a(aqr.yZ, 1.0F));
         eoh.a(this.d, eoh.this);
      }

      private void f() {
         eoh.this.f.ah().a(gex.a(aqr.yZ, 1.0F));
         eqo $$0 = new eqo(eoh.this, this.d);
         eoh.this.f.a($$0);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         if (this.d.e == epd.c.c) {
            this.f();
         } else if (eoh.this.a(this.d)) {
            if (ac.b() - eoh.this.aC < 250L && this.aJ_()) {
               this.e();
            }

            eoh.this.aC = ac.b();
         }

         return true;
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         if (eyx.a($$0)) {
            if (this.d.e == epd.c.c) {
               this.f();
               return true;
            }

            if (eoh.this.a(this.d)) {
               this.e();
               return true;
            }
         }

         return super.a($$0, $$1, $$2);
      }

      @Override
      public ur a() {
         return (ur)(this.d.e == epd.c.c ? eoh.R : ur.a("narrator.select", this.d.c));
      }

      public epd c() {
         return this.d;
      }
   }
}
