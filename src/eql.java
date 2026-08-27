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

public class eql extends gko {
   static final ahg a = new ahg("icon/info");
   static final ahg b = new ahg("icon/new_realm");
   static final ahg c = new ahg("realm_status/expired");
   static final ahg v = new ahg("realm_status/expires_soon");
   static final ahg w = new ahg("realm_status/open");
   static final ahg x = new ahg("realm_status/closed");
   private static final ahg y = new ahg("icon/invite");
   private static final ahg z = new ahg("icon/news");
   static final Logger A = LogUtils.getLogger();
   private static final ahg B = new ahg("textures/gui/title/realms.png");
   private static final ahg C = new ahg("textures/gui/realms/no_realms.png");
   private static final vf D = vf.c("menu.online");
   private static final vf E = vf.c("mco.selectServer.loading");
   static final vf F = vf.c("mco.selectServer.uninitialized");
   static final vf G = vf.c("mco.selectServer.expiredList");
   private static final vf H = vf.c("mco.selectServer.expiredRenew");
   static final vf I = vf.c("mco.selectServer.expiredTrial");
   private static final vf J = vf.c("mco.selectServer.play");
   private static final vf K = vf.c("mco.selectServer.leave");
   private static final vf L = vf.c("mco.selectServer.configure");
   static final vf M = vf.c("mco.selectServer.expired");
   static final vf N = vf.c("mco.selectServer.expires.soon");
   static final vf O = vf.c("mco.selectServer.expires.day");
   static final vf P = vf.c("mco.selectServer.open");
   static final vf Q = vf.c("mco.selectServer.closed");
   static final vf R = vf.a("gui.narrate.button", F);
   private static final vf S = vf.c("mco.selectServer.noRealms");
   private static final vf T = vf.c("mco.invites.nopending");
   private static final vf U = vf.c("mco.invites.pending");
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
   private final CompletableFuture<eqk.a> am = eqk.a();
   @Nullable
   private etp.c an;
   private final Set<UUID> ao = new HashSet<>();
   private static boolean ap;
   private final RateLimiter aq;
   private final fda ar;
   private exf as;
   private exf at;
   private exf au;
   private exf av;
   private exf aw;
   eql.j ax;
   private esi ay;
   private List<erh> az = List.of();
   private volatile boolean aA;
   @Nullable
   private volatile String aB;
   long aC;
   private final List<erg> aD = new ArrayList<>();
   private exf aE;
   private eql.g aF;
   private eql.g aG;
   private eql.f aH;
   @Nullable
   private fap aI;

   public eql(fda $$0) {
      super(D);
      this.ar = $$0;
      this.aq = RateLimiter.create(0.016666668F);
   }

   @Override
   public void aN_() {
      this.ay = new esi(this.f);
      this.ax = new eql.j();
      vf $$0 = vf.c("mco.invites.title");
      this.aF = new eql.g($$0, y, $$1x -> this.f.a(new etb(this, $$0)));
      vf $$1 = vf.c("mco.news");
      this.aG = new eql.g($$1, z, $$0x -> {
         String $$1x = this.aB;
         if ($$1x != null) {
            fbs.a(this, $$1x);
            if (this.aG.a() != 0) {
               etv.a $$2 = etv.b();
               $$2.b = false;
               etv.b($$2);
               this.aG.a(0);
            }
         }
      });
      this.aG.a(eyq.a($$1));
      this.as = exf.a(J, $$0x -> a(this.N(), this)).a(100).a();
      this.av = exf.a(L, $$0x -> this.f(this.N())).a(100).a();
      this.au = exf.a(H, $$0x -> this.e(this.N())).a(100).a();
      this.aw = exf.a(K, $$0x -> this.g(this.N())).a(100).a();
      this.aE = exf.a(vf.c("mco.selectServer.purchase"), $$0x -> this.O()).b(100, 20).a();
      this.at = exf.a(ve.k, $$0x -> this.f.a(this.ar)).a(100).a();
      if (eqq.a == eqq.b.b) {
         this.d(exm.a(vf.b("Snapshot"), vf.b("Release")).a(5, 5, 100, 20, vf.b("Realm"), ($$0x, $$1x) -> {
            al = $$1x;
            this.az = List.of();
            this.J();
         }));
      }

      this.a(eql.f.a);
      this.I();
      this.am.thenAcceptAsync($$0x -> {
         fda $$1x = $$0x.a(this.ar);
         if ($$1x == null) {
            this.an = this.a(this.f.aY());
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
         this.ax.b(this.g, this.h - this.aI.b() - this.aI.c());
         this.aI.a();
      }
   }

   private void D() {
      if (this.ay.a() && this.az.isEmpty() && this.aD.isEmpty()) {
         this.a(eql.f.b);
      } else {
         this.a(eql.f.c);
      }
   }

   private void a(eql.f $$0) {
      if (this.aH != $$0) {
         if (this.aI != null) {
            this.aI.a($$1 -> this.f($$1));
         }

         this.aI = this.b($$0);
         this.aH = $$0;
         this.aI.a($$1 -> {
            exd var10000 = this.d($$1);
         });
         this.c();
      }
   }

   private fap b(eql.f $$0) {
      fap $$1 = new fap(this);
      $$1.b(44);
      $$1.a(this.E());
      faq $$2 = this.c($$0);
      $$2.a();
      $$1.a($$2.u() + 22);
      $$1.b($$2);
      switch ($$0) {
         case a:
            $$1.c(new exu(this.i, E));
            break;
         case b:
            $$1.c(this.H());
            break;
         case c:
            $$1.c(this.ax);
      }

      return $$1;
   }

   private faq E() {
      int $$0 = 90;
      fat $$1 = fat.e().a(4);
      $$1.c().e();
      $$1.a(this.aF);
      $$1.a(this.aG);
      fat $$2 = fat.e();
      $$2.c().e();
      $$2.a(fau.a(90));
      $$2.a(exs.a(128, 34, B, 128, 64), fas::b);
      $$2.a(new fan(90, 44)).a($$1, fas::c);
      return $$2;
   }

   private faq c(eql.f $$0) {
      fao $$1 = new fao().c(4);
      fao.b $$2 = $$1.d(3);
      if ($$0 == eql.f.c) {
         $$2.a(this.as);
         $$2.a(this.av);
         $$2.a(this.au);
         $$2.a(this.aw);
      }

      $$2.a(this.aE);
      $$2.a(this.at);
      return $$1;
   }

   private fat H() {
      fat $$0 = fat.d().a(10);
      $$0.c().b();
      $$0.a(exs.a(130, 64, C, 130, 64));
      exq $$1 = new exq(308, S, this.i, false);
      $$0.a($$1);
      return $$0;
   }

   void I() {
      erh $$0 = this.N();
      this.aE.j = this.aH != eql.f.a;
      this.as.j = $$0 != null && this.a($$0);
      this.au.j = $$0 != null && this.b($$0);
      this.aw.j = $$0 != null && this.d($$0);
      this.av.j = $$0 != null && this.c($$0);
   }

   boolean a(erh $$0) {
      boolean $$1 = !$$0.j && $$0.e == erh.c.b;
      return $$1 && ($$0.d() || this.h($$0));
   }

   private boolean b(erh $$0) {
      return $$0.j && this.h($$0);
   }

   private boolean c(erh $$0) {
      return this.h($$0) && $$0.e != erh.c.c;
   }

   private boolean d(erh $$0) {
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
      evh.O().aY().d.a();
   }

   public static void f() {
      evh.O().aY().c.a();
   }

   private void J() {
      for (etp.e<?> $$0 : this.f.aY().a()) {
         $$0.a();
      }
   }

   private etp.c a(esg $$0) {
      etp.c $$1 = $$0.a.a();
      $$1.a($$0.c, $$0x -> {
         this.ay.a($$0x.a());
         this.az = $$0x.b();
         this.K();
         boolean $$1x = false;

         for (erh $$2 : this.ay) {
            if (this.i($$2)) {
               $$1x = true;
            }
         }

         if (!ap && $$1x) {
            ap = true;
            this.L();
         }
      });
      a(eqq::d, $$0x -> {
         this.aD.clear();
         this.aD.addAll($$0x);

         for (erg $$1x : $$0x) {
            if ($$1x instanceof erg.a $$2) {
               eyh $$3 = $$2.a(this, this::a);
               if ($$3 != null) {
                  this.f.a($$3);
                  this.a(List.of($$1x));
                  break;
               }
            }
         }

         if (!this.aD.isEmpty() && this.aH != eql.f.a) {
            this.K();
         }
      });
      $$1.a($$0.d, $$0x -> {
         this.aF.a($$0x);
         this.aF.a($$0x == 0 ? eyq.a(T) : eyq.a(U));
         if ($$0x > 0 && this.aq.tryAcquire(1)) {
            this.f.aV().c(vf.a("mco.configure.world.invite.narration", $$0x));
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

   private void a(Collection<erg> $$0) {
      List<UUID> $$1 = new ArrayList<>($$0.size());

      for (erg $$2 : $$0) {
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

   private static <T> void a(eql.k<T> $$0, Consumer<T> $$1) {
      evh $$2 = evh.O();
      CompletableFuture.<T>supplyAsync(() -> {
         try {
            return $$0.request(eqq.a($$2));
         } catch (esd var3) {
            throw new RuntimeException(var3);
         }
      }).thenAcceptAsync($$1, $$2).exceptionally($$0x -> {
         A.error("Failed to execute call to Realms Service", $$0x);
         return null;
      });
   }

   private void K() {
      erh $$0 = this.N();
      this.ax.H();

      for (erg $$1 : this.aD) {
         if (this.a($$1)) {
            this.a(List.of($$1));
            break;
         }
      }

      for (erh $$2 : this.az) {
         this.ax.a(new eql.a($$2));
      }

      for (erh $$3 : this.ay) {
         eql.e $$4;
         if (b() && !$$3.h()) {
            if ($$3.e == erh.c.c) {
               continue;
            }

            $$4 = new eql.i($$3);
         } else {
            $$4 = new eql.l($$3);
         }

         this.ax.a((eql.e)$$4);
         if ($$0 != null && $$0.a == $$3.a) {
            this.ax.a($$4);
         }
      }

      this.D();
      this.I();
   }

   private boolean a(erg $$0) {
      if (!($$0 instanceof erg.c $$1)) {
         return false;
      } else {
         vf $$2 = $$1.d();
         int $$3 = this.i.b($$2, 216);
         int $$4 = aun.e($$3 + 7, 36) - 1;
         this.ax.a(new eql.h($$2, $$4 + 2, $$1));

         for (int $$5 = 0; $$5 < $$4; $$5++) {
            this.ax.a(new eql.d());
         }

         this.ax.a(new eql.b($$1.a(this)));
         return true;
      }
   }

   private void L() {
      new Thread(() -> {
         List<err> $$0 = eqp.a();
         eqq $$1 = eqq.a();
         erc $$2 = new erc();
         $$2.a = $$0;
         $$2.b = this.M();

         try {
            $$1.a($$2);
         } catch (Throwable var5) {
            A.warn("Could not send ping result to Realms: ", var5);
         }
      }).start();
   }

   private List<Long> M() {
      List<Long> $$0 = Lists.newArrayList();

      for (erh $$1 : this.ay) {
         if (this.i($$1)) {
            $$0.add($$1.a);
         }
      }

      return $$0;
   }

   private void e(@Nullable erh $$0) {
      if ($$0 != null) {
         String $$1 = atj.a($$0.b, this.f.V().b(), $$0.k);
         this.f.o.a($$1);
         ac.j().a($$1);
      }
   }

   private void f(@Nullable erh $$0) {
      if ($$0 != null && this.f.b($$0.g)) {
         this.f.a(new esq(this, $$0.a));
      }
   }

   private void g(@Nullable erh $$0) {
      if ($$0 != null && !this.f.b($$0.g)) {
         vf $$1 = vf.c("mco.configure.world.leave.question.line1");
         vf $$2 = vf.c("mco.configure.world.leave.question.line2");
         this.f.a(new esw($$1x -> this.a($$1x, $$0), esw.a.b, $$1, $$2, true));
      }
   }

   @Nullable
   private erh N() {
      return this.ax.i() instanceof eql.l $$0 ? $$0.c() : null;
   }

   private void a(boolean $$0, final erh $$1) {
      if ($$0) {
         (new Thread("Realms-leave-server") {
            @Override
            public void run() {
               try {
                  eqq $$0 = eqq.a();
                  $$0.d($$1.a);
                  eql.this.f.execute(eql::f);
               } catch (esd var2) {
                  eql.A.error("Couldn't configure world", var2);
                  eql.this.f.execute(() -> eql.this.f.a(new esu(var2, eql.this)));
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
         this.K();
      });
   }

   public void g() {
      this.ax.a(null);
      f();
   }

   @Override
   public vf h() {
      return (vf)(switch (this.aH) {
         case a -> ve.a(super.h(), E);
         case b -> ve.a(super.h(), S);
         case c -> super.h();
      });
   }

   @Override
   public void a(ewt $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (b()) {
         $$0.b(this.i, "Minecraft " + aa.b().c(), 2, this.h - 10, -1);
      }

      if (this.aA && this.aE.j) {
         etd.a($$0, this.aE);
      }

      switch (eqq.a) {
         case b:
            this.a($$0, "STAGE!", -256);
            break;
         case c:
            this.a($$0, "LOCAL!", 8388479);
      }
   }

   private void O() {
      this.f.a(new etd(this, this.aA));
   }

   public static void a(@Nullable erh $$0, fda $$1) {
      a($$0, $$1, false);
   }

   public static void a(@Nullable erh $$0, fda $$1, boolean $$2) {
      if ($$0 != null) {
         if (!b() || $$2) {
            evh.O().a(new esx($$1, new eug($$1, $$0)));
            return;
         }

         switch ($$0.u) {
            case e:
               evh.O().a(new esx($$1, new eug($$1, $$0)));
               break;
            case a:
               a($$0, $$1, vf.c("mco.compatibility.unverifiable.title").b(-171), vf.c("mco.compatibility.unverifiable.message"), ve.j);
               break;
            case c:
               a(
                  $$0,
                  $$1,
                  vf.c("selectWorld.backupQuestion.downgrade").b(-2142128),
                  vf.a("mco.compatibility.downgrade.description", vf.b($$0.t).b(-171), vf.b(aa.b().c()).b(-171)),
                  vf.c("mco.compatibility.downgrade")
               );
               break;
            case d:
               a(
                  $$0,
                  $$1,
                  vf.c("mco.compatibility.upgrade.title").b(-171),
                  vf.a("mco.compatibility.upgrade.description", vf.b($$0.t).b(-171), vf.b(aa.b().c()).b(-171)),
                  vf.c("mco.compatibility.upgrade")
               );
         }
      }
   }

   private static void a(erh $$0, fda $$1, vf $$2, vf $$3, vf $$4) {
      evh.O().a(new fbt($$2x -> {
         fda $$3x;
         if ($$2x) {
            $$3x = new esx($$1, new eug($$1, $$0));
            f();
         } else {
            $$3x = $$1;
         }

         evh.O().a($$3x);
      }, $$2, $$3, $$4, ve.e));
   }

   public static vf a(String $$0, boolean $$1) {
      return a($$0, $$1 ? -8355712 : -2142128);
   }

   public static vf a(String $$0, int $$1) {
      return (vf)(StringUtils.isBlank($$0) ? ve.a : vf.a("mco.version", vf.b($$0).b($$1)));
   }

   boolean h(erh $$0) {
      return this.f.b($$0.g);
   }

   private boolean i(erh $$0) {
      return this.h($$0) && !$$0.j;
   }

   private void a(ewt $$0, String $$1, int $$2) {
      $$0.c().a();
      $$0.c().a((float)(this.g / 2 - 25), 20.0F, 0.0F);
      $$0.c().a(a.f.rotationDegrees(-20.0F));
      $$0.c().b(1.5F, 1.5F, 1.5F);
      $$0.a(this.i, $$1, 0, 0, $$2, false);
      $$0.c().b();
   }

   class a extends eql.e {
      private static final vf c = vf.c("mco.snapshot.start");
      private static final int d = 5;
      private final eyq e;
      private final erh f;

      public a(erh $$0) {
         this.f = $$0;
         this.e = eyq.a(vf.c("mco.snapshot.tooltip"));
      }

      @Override
      public void a(ewt $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(eql.b, $$3 - 5, $$2 + $$5 / 2 - 10, 40, 20);
         int $$10 = $$2 + $$5 / 2 - 9 / 2;
         $$0.b(eql.this.i, c, $$3 + 40 - 2, $$10 - 5, 8388479);
         $$0.b(eql.this.i, vf.a("mco.snapshot.description", this.f.c), $$3 + 40 - 2, $$10 + 5, -8355712);
         this.e.a($$8, this.aI_(), new fbi($$3, $$2, $$4, $$5));
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         this.c();
         return true;
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         if (fbd.a($$0)) {
            this.c();
            return true;
         } else {
            return super.a($$0, $$1, $$2);
         }
      }

      private void c() {
         eql.this.f.ai().a(ghu.a(arr.zu, 1.0F));
         eql.this.f
            .a(
               new eyh.a(eql.this, vf.c("mco.snapshot.createSnapshotPopup.title"))
                  .a(vf.c("mco.snapshot.createSnapshotPopup.text"))
                  .a(vf.c("mco.selectServer.create"), $$0 -> eql.this.f.a(new ess(eql.this, this.f.a)))
                  .a(ve.e, eyh::aE_)
                  .a()
            );
      }

      @Override
      public vf a() {
         return vf.a("gui.narrate.button", ve.a(c, vf.a("mco.snapshot.description", this.f.c)));
      }
   }

   class b extends eql.e {
      private final exf c;

      public b(exf $$0) {
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
      public void a(ewt $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.c.c(eql.this.g / 2 - 75, $$2 + 4);
         this.c.a($$0, $$6, $$7, $$9);
      }

      @Override
      public void a(boolean $$0) {
         super.a($$0);
         this.c.a($$0);
      }

      @Override
      public vf a() {
         return this.c.x();
      }
   }

   static class c extends exr {
      private static final eys b = new eys(new ahg("widget/cross_button"), new ahg("widget/cross_button_highlighted"));

      protected c(exf.c $$0, vf $$1) {
         super(0, 0, 14, 14, b, $$0);
         this.a(eyq.a($$1));
      }
   }

   class d extends eql.e {
      @Override
      public void a(ewt $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
      }

      @Override
      public vf a() {
         return vf.i();
      }
   }

   abstract class e extends eyb.a<eql.e> {
      private static final int a = 10;
      private static final int c = 28;
      private static final int d = 7;

      protected void a(erh $$0, ewt $$1, int $$2, int $$3, int $$4, int $$5) {
         int $$6 = $$2 - 10 - 7;
         int $$7 = $$3 + 2;
         if ($$0.j) {
            this.a($$1, $$6, $$7, $$4, $$5, eql.c, () -> eql.M);
         } else if ($$0.e == erh.c.a) {
            this.a($$1, $$6, $$7, $$4, $$5, eql.x, () -> eql.Q);
         } else if (eql.this.h($$0) && $$0.l < 7) {
            this.a($$1, $$6, $$7, $$4, $$5, eql.v, () -> {
               if ($$0.l <= 0) {
                  return eql.N;
               } else {
                  return (vf)($$0.l == 1 ? eql.O : vf.a("mco.selectServer.expires.days", $$0.l));
               }
            });
         } else if ($$0.e == erh.c.b) {
            this.a($$1, $$6, $$7, $$4, $$5, eql.w, () -> eql.P);
         }
      }

      private void a(ewt $$0, int $$1, int $$2, int $$3, int $$4, ahg $$5, Supplier<vf> $$6) {
         $$0.a($$5, $$1, $$2, 10, 28);
         if (eql.this.ax.c((double)$$3, (double)$$4) && $$3 >= $$1 && $$3 <= $$1 + 10 && $$4 >= $$2 && $$4 <= $$2 + 28) {
            eql.this.d($$6.get());
         }
      }

      protected void a(ewt $$0, int $$1, int $$2, erh $$3) {
         int $$4 = this.b($$2);
         int $$5 = this.a($$1);
         int $$6 = this.d($$5);
         if (!eql.this.h($$3)) {
            $$0.a(eql.this.i, $$3.f, $$4, this.d($$5), -8355712, false);
         } else if ($$3.j) {
            vf $$7 = $$3.k ? eql.I : eql.G;
            $$0.a(eql.this.i, $$7, $$4, $$6, -2142128, false);
         }
      }

      protected void a(ewt $$0, String $$1, int $$2, int $$3, int $$4, int $$5) {
         int $$6 = $$4 - $$2;
         if (eql.this.i.b($$1) > $$6) {
            String $$7 = eql.this.i.a($$1, $$6 - eql.this.i.b("... "));
            $$0.a(eql.this.i, $$7 + "...", $$2, $$3, $$5, false);
         } else {
            $$0.a(eql.this.i, $$1, $$2, $$3, $$5, false);
         }
      }

      protected int a(int $$0, int $$1, vf $$2) {
         return $$0 + $$1 - eql.this.i.a($$2) - 20;
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

   static class g extends eyk.b {
      private static final ahg[] d = new ahg[]{
         new ahg("notification/1"),
         new ahg("notification/2"),
         new ahg("notification/3"),
         new ahg("notification/4"),
         new ahg("notification/5"),
         new ahg("notification/more")
      };
      private static final int t = Integer.MAX_VALUE;
      private static final int u = 20;
      private static final int v = 14;
      private int w;

      public g(vf $$0, ahg $$1, exf.c $$2) {
         super(20, 20, $$0, 14, 14, $$1, $$2);
      }

      int a() {
         return this.w;
      }

      public void a(int $$0) {
         this.w = $$0;
      }

      @Override
      public void b(ewt $$0, int $$1, int $$2, float $$3) {
         super.b($$0, $$1, $$2, $$3);
         if (this.j && this.w != 0) {
            this.a($$0);
         }
      }

      private void a(ewt $$0) {
         $$0.a(d[Math.min(this.w, 6) - 1], this.B() + this.w() - 5, this.C() - 3, 8, 8);
      }
   }

   class h extends eql.e {
      private static final int c = 40;
      private static final int d = -12303292;
      private final vf e;
      private final int f;
      private final List<exd> g = new ArrayList<>();
      @Nullable
      private final eql.c h;
      private final exz i;
      private final fao j;
      private final fan k;
      private int l = -1;

      public h(vf $$0, int $$1, erg $$2) {
         this.e = $$0;
         this.f = $$1;
         this.j = new fao();
         int $$3 = 7;
         this.j.a(exs.a(20, 20, eql.a), 0, 0, this.j.b().a(7, 7, 0, 0));
         this.j.a(fau.a(40), 0, 0);
         this.k = this.j.a(new fan(0, 9 * 3 * ($$1 - 1)), 0, 1, this.j.b().c(7));
         this.i = this.k.a(new exz($$0, eql.this.i).b(true), this.k.b().b().d());
         this.j.a(fau.a(40), 0, 2);
         if ($$2.b()) {
            this.h = this.j.a(new eql.c($$1x -> eql.this.a($$2.c()), vf.c("mco.notification.dismiss")), 0, 2, this.j.b().c().a(0, 7, 7, 0));
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
         this.i.c($$1);
         this.j.a();
      }

      @Override
      public void b(ewt $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         super.b($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
         $$0.b($$3 - 2, $$2 - 2, $$4, 36 * this.f - 2, -12303292);
      }

      @Override
      public void a(ewt $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.j.c($$3, $$2);
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
      public vf a() {
         return this.e;
      }
   }

   class i extends eql.e {
      private final erh c;
      private final eyq d;

      public i(erh $$0) {
         this.c = $$0;
         this.d = eyq.a(vf.c("mco.snapshot.parent.tooltip"));
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         return true;
      }

      @Override
      public void a(ewt $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = this.b($$3);
         int $$11 = this.a($$2);
         etx.a($$0, $$3, $$2, 32, this.c.g);
         vf $$12 = eql.a(this.c.t, -8355712);
         int $$13 = this.a($$3, $$4, $$12);
         this.a($$0, this.c.b(), $$10, $$11, $$13, -8355712);
         if ($$12 != ve.a) {
            $$0.a(eql.this.i, $$12, $$13, $$11, -8355712, false);
         }

         $$0.a(eql.this.i, this.c.a(), $$10, this.c($$11), -8355712, false);
         this.a($$0, $$2, $$3, this.c);
         this.a(this.c, $$0, $$3 + $$4, $$2, $$6, $$7);
         this.d.a($$8, this.aI_(), new fbi($$3, $$2, $$4, $$5));
      }

      @Override
      public vf a() {
         return vf.b(this.c.c);
      }
   }

   class j extends gkn<eql.e> {
      public j() {
         super(eql.this.g, eql.this.h, 0, 36);
      }

      public void a(@Nullable eql.e $$0) {
         super.a($$0);
         eql.this.I();
      }

      @Override
      public int a() {
         return this.n() * 36;
      }

      @Override
      public int b() {
         return 300;
      }
   }

   interface k<T> {
      T request(eqq var1) throws esd;
   }

   class l extends eql.e {
      private static final int c = 36;
      private final erh d;
      @Nullable
      private final eyq e;

      public l(erh $$0) {
         this.d = $$0;
         boolean $$1 = eql.this.h($$0);
         if (eql.b() && $$1 && $$0.h()) {
            this.e = eyq.a(vf.a("mco.snapshot.paired", $$0.s));
         } else if (!$$1 && $$0.e()) {
            this.e = eyq.a(vf.a("mco.snapshot.friendsRealm.upgrade", $$0.f));
         } else if (!$$1 && $$0.f()) {
            this.e = eyq.a(vf.a("mco.snapshot.friendsRealm.downgrade", $$0.t));
         } else {
            this.e = null;
         }
      }

      @Override
      public void a(ewt $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         if (this.d.e == erh.c.c) {
            $$0.a(eql.b, $$3 - 5, $$2 + $$5 / 2 - 10, 40, 20);
            int $$10 = $$2 + $$5 / 2 - 9 / 2;
            $$0.b(eql.this.i, eql.F, $$3 + 40 - 2, $$10, 8388479);
         } else {
            etx.a($$0, $$3, $$2, 32, this.d.g);
            this.a($$0, $$2, $$3, $$4);
            this.a($$0, $$2, $$3);
            this.a($$0, $$2, $$3, this.d);
            this.a(this.d, $$0, $$3 + $$4, $$2, $$6, $$7);
            if (this.e != null) {
               this.e.a($$8, this.aI_(), new fbi($$3, $$2, $$4, $$5));
            }
         }
      }

      private void a(ewt $$0, int $$1, int $$2, int $$3) {
         int $$4 = this.b($$2);
         int $$5 = this.a($$1);
         vf $$6 = eql.a(this.d.t, this.d.d());
         int $$7 = this.a($$2, $$3, $$6);
         this.a($$0, this.d.b(), $$4, $$5, $$7, -1);
         if ($$6 != ve.a) {
            $$0.a(eql.this.i, $$6, $$7, $$5, -8355712, false);
         }
      }

      private void a(ewt $$0, int $$1, int $$2) {
         int $$3 = this.b($$2);
         int $$4 = this.a($$1);
         int $$5 = this.c($$4);
         if (this.d.m == erh.d.b) {
            vf $$6 = vf.b(this.d.c()).a(n.h);
            $$0.a(eql.this.i, vf.a("mco.selectServer.minigameName", $$6).b(-171), $$3, $$5, -1, false);
         } else {
            $$0.a(eql.this.i, this.d.a(), $$3, this.c($$4), -8355712, false);
         }
      }

      private void d() {
         eql.this.f.ai().a(ghu.a(arr.zu, 1.0F));
         eql.a(this.d, eql.this);
      }

      private void e() {
         eql.this.f.ai().a(ghu.a(arr.zu, 1.0F));
         ess $$0 = new ess(eql.this, this.d);
         eql.this.f.a($$0);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         if (this.d.e == erh.c.c) {
            this.e();
         } else if (eql.this.a(this.d)) {
            if (ac.b() - eql.this.aC < 250L && this.aI_()) {
               this.d();
            }

            eql.this.aC = ac.b();
         }

         return true;
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         if (fbd.a($$0)) {
            if (this.d.e == erh.c.c) {
               this.e();
               return true;
            }

            if (eql.this.a(this.d)) {
               this.d();
               return true;
            }
         }

         return super.a($$0, $$1, $$2);
      }

      @Override
      public vf a() {
         return (vf)(this.d.e == erh.c.c ? eql.R : vf.a("narrator.select", this.d.c));
      }

      public erh c() {
         return this.d;
      }
   }
}
