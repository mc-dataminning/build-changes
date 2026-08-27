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

public class epo extends gjl {
   static final agt a = new agt("icon/info");
   static final agt b = new agt("icon/new_realm");
   static final agt c = new agt("realm_status/expired");
   static final agt v = new agt("realm_status/expires_soon");
   static final agt w = new agt("realm_status/open");
   static final agt x = new agt("realm_status/closed");
   private static final agt y = new agt("icon/invite");
   private static final agt z = new agt("icon/news");
   static final Logger A = LogUtils.getLogger();
   private static final agt B = new agt("textures/gui/title/realms.png");
   private static final agt C = new agt("textures/gui/realms/no_realms.png");
   private static final vb D = vb.c("menu.online");
   private static final vb E = vb.c("mco.selectServer.loading");
   static final vb F = vb.c("mco.selectServer.uninitialized");
   static final vb G = vb.c("mco.selectServer.expiredList");
   private static final vb H = vb.c("mco.selectServer.expiredRenew");
   static final vb I = vb.c("mco.selectServer.expiredTrial");
   private static final vb J = vb.c("mco.selectServer.play");
   private static final vb K = vb.c("mco.selectServer.leave");
   private static final vb L = vb.c("mco.selectServer.configure");
   static final vb M = vb.c("mco.selectServer.expired");
   static final vb N = vb.c("mco.selectServer.expires.soon");
   static final vb O = vb.c("mco.selectServer.expires.day");
   static final vb P = vb.c("mco.selectServer.open");
   static final vb Q = vb.c("mco.selectServer.closed");
   static final vb R = vb.a("gui.narrate.button", F);
   private static final vb S = vb.c("mco.selectServer.noRealms");
   private static final vb T = vb.c("mco.invites.nopending");
   private static final vb U = vb.c("mco.invites.pending");
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
   private final CompletableFuture<epn.a> am = epn.a();
   @Nullable
   private ess.c an;
   private final Set<UUID> ao = new HashSet<>();
   private static boolean ap;
   private final RateLimiter aq;
   private final fcc ar;
   private ewh as;
   private ewh at;
   private ewh au;
   private ewh av;
   private ewh aw;
   epo.j ax;
   private erl ay;
   private List<eqk> az = List.of();
   private volatile boolean aA;
   @Nullable
   private volatile String aB;
   long aC;
   private final List<eqj> aD = new ArrayList<>();
   private ewh aE;
   private epo.g aF;
   private epo.g aG;
   private epo.f aH;
   @Nullable
   private ezr aI;

   public epo(fcc $$0) {
      super(D);
      this.ar = $$0;
      this.aq = RateLimiter.create(0.016666668F);
   }

   @Override
   public void aP_() {
      this.ay = new erl(this.f);
      this.ax = this.d(new epo.j());
      vb $$0 = vb.c("mco.invites.title");
      this.aF = new epo.g($$0, y, $$1x -> this.f.a(new ese(this, $$0)));
      vb $$1 = vb.c("mco.news");
      this.aG = new epo.g($$1, z, $$0x -> {
         String $$1x = this.aB;
         if ($$1x != null) {
            fau.a(this, $$1x);
            if (this.aG.a() != 0) {
               esy.a $$2 = esy.b();
               $$2.b = false;
               esy.b($$2);
               this.aG.a(0);
            }
         }
      });
      this.aG.a(exs.a($$1));
      this.as = ewh.a(J, $$0x -> a(this.K(), this)).a(100).a();
      this.av = ewh.a(L, $$0x -> this.f(this.K())).a(100).a();
      this.au = ewh.a(H, $$0x -> this.e(this.K())).a(100).a();
      this.aw = ewh.a(K, $$0x -> this.g(this.K())).a(100).a();
      this.aE = ewh.a(vb.c("mco.selectServer.purchase"), $$0x -> this.L()).b(100, 20).a();
      this.at = ewh.a(va.k, $$0x -> this.f.a(this.ar)).a(100).a();
      if (ept.a == ept.b.b) {
         this.d(ewo.a(vb.b("Snapshot"), vb.b("Release")).a(5, 5, 100, 20, vb.b("Realm"), ($$0x, $$1x) -> {
            al = $$1x;
            this.az = List.of();
            this.G();
         }));
      }

      this.a(epo.f.a);
      this.F();
      this.am.thenAcceptAsync($$0x -> {
         fcc $$1x = $$0x.a(this.ar);
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
         this.a(epo.f.b);
      } else {
         this.a(epo.f.c);
      }
   }

   private void a(epo.f $$0) {
      if (this.aH != $$0) {
         if (this.aI != null) {
            this.aI.a($$1 -> this.f($$1));
         }

         this.aI = this.b($$0);
         this.aH = $$0;
         this.aI.a($$1 -> {
            ewf var10000 = this.d($$1);
         });
         this.c();
      }
   }

   private ezr b(epo.f $$0) {
      ezr $$1 = new ezr(this);
      $$1.b(44);
      $$1.a(this.D());
      ezs $$2 = this.c($$0);
      $$2.a();
      $$1.a($$2.i() + 22);
      $$1.b($$2);
      switch ($$0) {
         case a:
            $$1.c(new eww(this.i, E));
            break;
         case b:
            $$1.c(this.E());
      }

      return $$1;
   }

   private ezs D() {
      int $$0 = 90;
      ezv $$1 = ezv.e().a(4);
      $$1.c().e();
      $$1.a(this.aF);
      $$1.a(this.aG);
      ezv $$2 = ezv.e();
      $$2.c().e();
      $$2.a(ezw.a(90));
      $$2.a(ewu.a(128, 34, B, 128, 64), ezu::b);
      $$2.a(new ezp(90, 44)).a($$1, ezu::c);
      return $$2;
   }

   private ezs c(epo.f $$0) {
      ezq $$1 = new ezq().c(4);
      ezq.b $$2 = $$1.d(3);
      if ($$0 == epo.f.c) {
         $$2.a(this.as);
         $$2.a(this.av);
         $$2.a(this.au);
         $$2.a(this.aw);
      }

      $$2.a(this.aE);
      $$2.a(this.at);
      return $$1;
   }

   private ezv E() {
      ezv $$0 = ezv.d().a(10);
      $$0.c().b();
      $$0.a(ewu.a(130, 64, C, 130, 64));
      ews $$1 = new ews(308, S, this.i, false);
      $$0.a($$1);
      return $$0;
   }

   void F() {
      eqk $$0 = this.K();
      this.aE.i = this.aH != epo.f.a;
      this.as.i = $$0 != null && this.a($$0);
      this.au.i = $$0 != null && this.b($$0);
      this.aw.i = $$0 != null && this.d($$0);
      this.av.i = $$0 != null && this.c($$0);
   }

   boolean a(eqk $$0) {
      boolean $$1 = !$$0.j && $$0.e == eqk.c.b;
      return $$1 && ($$0.d() || this.h($$0));
   }

   private boolean b(eqk $$0) {
      return $$0.j && this.h($$0);
   }

   private boolean c(eqk $$0) {
      return this.h($$0) && $$0.e != eqk.c.c;
   }

   private boolean d(eqk $$0) {
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
      euk.N().aX().d.a();
   }

   public static void f() {
      euk.N().aX().c.a();
   }

   private void G() {
      for (ess.e<?> $$0 : this.f.aX().a()) {
         $$0.a();
      }
   }

   private ess.c a(erj $$0) {
      ess.c $$1 = $$0.a.a();
      $$1.a($$0.c, $$0x -> {
         this.ay.a($$0x.a());
         this.az = $$0x.b();
         this.H();
         boolean $$1x = false;

         for (eqk $$2 : this.ay) {
            if (this.i($$2)) {
               $$1x = true;
            }
         }

         if (!ap && $$1x) {
            ap = true;
            this.I();
         }
      });
      a(ept::d, $$0x -> {
         this.aD.clear();
         this.aD.addAll($$0x);

         for (eqj $$1x : $$0x) {
            if ($$1x instanceof eqj.a $$2) {
               exj $$3 = $$2.a(this, this::a);
               if ($$3 != null) {
                  this.f.a($$3);
                  this.a(List.of($$1x));
                  break;
               }
            }
         }

         if (!this.aD.isEmpty() && this.aH != epo.f.a) {
            this.H();
         }
      });
      $$1.a($$0.d, $$0x -> {
         this.aF.a($$0x);
         this.aF.a($$0x == 0 ? exs.a(T) : exs.a(U));
         if ($$0x > 0 && this.aq.tryAcquire(1)) {
            this.f.aU().c(vb.a("mco.configure.world.invite.narration", $$0x));
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

   private void a(Collection<eqj> $$0) {
      List<UUID> $$1 = new ArrayList<>($$0.size());

      for (eqj $$2 : $$0) {
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

   private static <T> void a(epo.k<T> $$0, Consumer<T> $$1) {
      euk $$2 = euk.N();
      CompletableFuture.<T>supplyAsync(() -> {
         try {
            return $$0.request(ept.a($$2));
         } catch (erg var3) {
            throw new RuntimeException(var3);
         }
      }).thenAcceptAsync($$1, $$2).exceptionally($$0x -> {
         A.error("Failed to execute call to Realms Service", $$0x);
         return null;
      });
   }

   private void H() {
      eqk $$0 = this.K();
      this.ax.v();

      for (eqj $$1 : this.aD) {
         if (this.a($$1)) {
            this.a(List.of($$1));
            break;
         }
      }

      for (eqk $$2 : this.az) {
         this.ax.a(new epo.a($$2));
      }

      for (eqk $$3 : this.ay) {
         epo.e $$4;
         if (b() && !$$3.h()) {
            if ($$3.e == eqk.c.c) {
               continue;
            }

            $$4 = new epo.i($$3);
         } else {
            $$4 = new epo.l($$3);
         }

         this.ax.a((epo.e)$$4);
         if ($$0 != null && $$0.a == $$3.a) {
            this.ax.a($$4);
         }
      }

      this.C();
      this.F();
   }

   private boolean a(eqj $$0) {
      if (!($$0 instanceof eqj.c $$1)) {
         return false;
      } else {
         vb $$2 = $$1.d();
         int $$3 = this.i.b($$2, 216);
         int $$4 = aty.e($$3 + 7, 36) - 1;
         this.ax.a(new epo.h($$2, $$4 + 2, $$1));

         for (int $$5 = 0; $$5 < $$4; $$5++) {
            this.ax.a(new epo.d());
         }

         this.ax.a(new epo.b($$1.a(this)));
         return true;
      }
   }

   private void I() {
      new Thread(() -> {
         List<equ> $$0 = eps.a();
         ept $$1 = ept.a();
         eqf $$2 = new eqf();
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

      for (eqk $$1 : this.ay) {
         if (this.i($$1)) {
            $$0.add($$1.a);
         }
      }

      return $$0;
   }

   private void e(@Nullable eqk $$0) {
      if ($$0 != null) {
         String $$1 = asu.a($$0.b, this.f.U().b(), $$0.k);
         this.f.o.a($$1);
         ac.i().a($$1);
      }
   }

   private void f(@Nullable eqk $$0) {
      if ($$0 != null && this.f.b($$0.g)) {
         this.f.a(new ert(this, $$0.a));
      }
   }

   private void g(@Nullable eqk $$0) {
      if ($$0 != null && !this.f.b($$0.g)) {
         vb $$1 = vb.c("mco.configure.world.leave.question.line1");
         vb $$2 = vb.c("mco.configure.world.leave.question.line2");
         this.f.a(new erz($$1x -> this.a($$1x, $$0), erz.a.b, $$1, $$2, true));
      }
   }

   @Nullable
   private eqk K() {
      return this.ax.f() instanceof epo.l $$0 ? $$0.c() : null;
   }

   private void a(boolean $$0, final eqk $$1) {
      if ($$0) {
         (new Thread("Realms-leave-server") {
            @Override
            public void run() {
               try {
                  ept $$0 = ept.a();
                  $$0.d($$1.a);
                  epo.this.f.execute(epo::f);
               } catch (erg var2) {
                  epo.A.error("Couldn't configure world", var2);
                  epo.this.f.execute(() -> epo.this.f.a(new erx(var2, epo.this)));
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
   public vb h() {
      return (vb)(switch (this.aH) {
         case a -> va.a(super.h(), E);
         case b -> va.a(super.h(), S);
         case c -> super.h();
      });
   }

   @Override
   public void a(evw $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (b()) {
         $$0.b(this.i, "Minecraft " + aa.b().c(), 2, this.h - 10, -1);
      }

      if (this.aA && this.aE.i) {
         esg.a($$0, this.aE);
      }

      switch (ept.a) {
         case b:
            this.a($$0, "STAGE!", -256);
            break;
         case c:
            this.a($$0, "LOCAL!", 8388479);
      }
   }

   private void L() {
      this.f.a(new esg(this, this.aA));
   }

   public static void a(@Nullable eqk $$0, fcc $$1) {
      a($$0, $$1, false);
   }

   public static void a(@Nullable eqk $$0, fcc $$1, boolean $$2) {
      if ($$0 != null) {
         if (!b() || $$2) {
            euk.N().a(new esa($$1, new etj($$1, $$0)));
            return;
         }

         switch ($$0.u) {
            case e:
               euk.N().a(new esa($$1, new etj($$1, $$0)));
               break;
            case a:
               a($$0, $$1, vb.c("mco.compatibility.unverifiable.title").b(-171), vb.c("mco.compatibility.unverifiable.message"), va.j);
               break;
            case c:
               a(
                  $$0,
                  $$1,
                  vb.c("selectWorld.backupQuestion.downgrade").b(-2142128),
                  vb.a("mco.compatibility.downgrade.description", vb.b($$0.t).b(-171), vb.b(aa.b().c()).b(-171)),
                  vb.c("mco.compatibility.downgrade")
               );
               break;
            case d:
               a(
                  $$0,
                  $$1,
                  vb.c("mco.compatibility.upgrade.title").b(-171),
                  vb.a("mco.compatibility.upgrade.description", vb.b($$0.t).b(-171), vb.b(aa.b().c()).b(-171)),
                  vb.c("mco.compatibility.upgrade")
               );
         }
      }
   }

   private static void a(eqk $$0, fcc $$1, vb $$2, vb $$3, vb $$4) {
      euk.N().a(new fav($$2x -> {
         fcc $$3x;
         if ($$2x) {
            $$3x = new esa($$1, new etj($$1, $$0));
            f();
         } else {
            $$3x = $$1;
         }

         euk.N().a($$3x);
      }, $$2, $$3, $$4, va.e));
   }

   public static vb a(String $$0, boolean $$1) {
      return a($$0, $$1 ? -8355712 : -2142128);
   }

   public static vb a(String $$0, int $$1) {
      return (vb)(StringUtils.isBlank($$0) ? va.a : vb.a("mco.version", vb.b($$0).b($$1)));
   }

   boolean h(eqk $$0) {
      return this.f.b($$0.g);
   }

   private boolean i(eqk $$0) {
      return this.h($$0) && !$$0.j;
   }

   private void a(evw $$0, String $$1, int $$2) {
      $$0.c().a();
      $$0.c().a((float)(this.g / 2 - 25), 20.0F, 0.0F);
      $$0.c().a(a.f.rotationDegrees(-20.0F));
      $$0.c().b(1.5F, 1.5F, 1.5F);
      $$0.a(this.i, $$1, 0, 0, $$2, false);
      $$0.c().b();
   }

   class a extends epo.e {
      private static final vb c = vb.c("mco.snapshot.start");
      private static final int d = 5;
      private final exs e;
      private final eqk f;

      public a(eqk $$0) {
         this.f = $$0;
         this.e = exs.a(vb.c("mco.snapshot.tooltip"));
      }

      @Override
      public void a(evw $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(epo.b, $$3 - 5, $$2 + $$5 / 2 - 10, 40, 20);
         int $$10 = $$2 + $$5 / 2 - 9 / 2;
         $$0.b(epo.this.i, c, $$3 + 40 - 2, $$10 - 5, 8388479);
         $$0.b(epo.this.i, vb.a("mco.snapshot.description", this.f.c), $$3 + 40 - 2, $$10 + 5, -8355712);
         this.e.a($$8, this.aJ_(), new fak($$3, $$2, $$4, $$5));
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         this.c();
         return true;
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         if (faf.a($$0)) {
            this.c();
            return true;
         } else {
            return super.a($$0, $$1, $$2);
         }
      }

      private void c() {
         epo.this.f.ah().a(ggr.a(arc.zu, 1.0F));
         epo.this.f
            .a(
               new exj.a(epo.this, vb.c("mco.snapshot.createSnapshotPopup.title"))
                  .a(vb.c("mco.snapshot.createSnapshotPopup.text"))
                  .a(vb.c("mco.selectServer.create"), $$0 -> epo.this.f.a(new erv(epo.this, this.f.a)))
                  .a(va.e, exj::aF_)
                  .a()
            );
      }

      @Override
      public vb a() {
         return vb.a("gui.narrate.button", va.a(c, vb.a("mco.snapshot.description", this.f.c)));
      }
   }

   class b extends epo.e {
      private final ewh c;

      public b(ewh $$0) {
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
      public void a(evw $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.c.b(epo.this.g / 2 - 75, $$2 + 4);
         this.c.a($$0, $$6, $$7, $$9);
      }

      @Override
      public void a(boolean $$0) {
         super.a($$0);
         this.c.a($$0);
      }

      @Override
      public vb a() {
         return this.c.l();
      }
   }

   static class c extends ewt {
      private static final exu b = new exu(new agt("widget/cross_button"), new agt("widget/cross_button_highlighted"));

      protected c(ewh.c $$0, vb $$1) {
         super(0, 0, 14, 14, b, $$0);
         this.a(exs.a($$1));
      }
   }

   class d extends epo.e {
      @Override
      public void a(evw $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
      }

      @Override
      public vb a() {
         return vb.i();
      }
   }

   abstract class e extends exd.a<epo.e> {
      private static final int a = 10;
      private static final int c = 28;
      private static final int d = 7;

      protected void a(eqk $$0, evw $$1, int $$2, int $$3, int $$4, int $$5) {
         int $$6 = $$2 - 10 - 7;
         int $$7 = $$3 + 2;
         if ($$0.j) {
            this.a($$1, $$6, $$7, $$4, $$5, epo.c, () -> epo.M);
         } else if ($$0.e == eqk.c.a) {
            this.a($$1, $$6, $$7, $$4, $$5, epo.x, () -> epo.Q);
         } else if (epo.this.h($$0) && $$0.l < 7) {
            this.a($$1, $$6, $$7, $$4, $$5, epo.v, () -> {
               if ($$0.l <= 0) {
                  return epo.N;
               } else {
                  return (vb)($$0.l == 1 ? epo.O : vb.a("mco.selectServer.expires.days", $$0.l));
               }
            });
         } else if ($$0.e == eqk.c.b) {
            this.a($$1, $$6, $$7, $$4, $$5, epo.w, () -> epo.P);
         }
      }

      private void a(evw $$0, int $$1, int $$2, int $$3, int $$4, agt $$5, Supplier<vb> $$6) {
         $$0.a($$5, $$1, $$2, 10, 28);
         if (epo.this.ax.a_((double)$$3, (double)$$4) && $$3 >= $$1 && $$3 <= $$1 + 10 && $$4 >= $$2 && $$4 <= $$2 + 28) {
            epo.this.d($$6.get());
         }
      }

      protected void a(evw $$0, int $$1, int $$2, eqk $$3) {
         int $$4 = this.b($$2);
         int $$5 = this.a($$1);
         int $$6 = this.d($$5);
         if (!epo.this.h($$3)) {
            $$0.a(epo.this.i, $$3.f, $$4, this.d($$5), -8355712, false);
         } else if ($$3.j) {
            vb $$7 = $$3.k ? epo.I : epo.G;
            $$0.a(epo.this.i, $$7, $$4, $$6, -2142128, false);
         }
      }

      protected void a(evw $$0, String $$1, int $$2, int $$3, int $$4, int $$5) {
         int $$6 = $$4 - $$2;
         if (epo.this.i.b($$1) > $$6) {
            String $$7 = epo.this.i.a($$1, $$6 - epo.this.i.b("... "));
            $$0.a(epo.this.i, $$7 + "...", $$2, $$3, $$5, false);
         } else {
            $$0.a(epo.this.i, $$1, $$2, $$3, $$5, false);
         }
      }

      protected int a(int $$0, int $$1, vb $$2) {
         return $$0 + $$1 - epo.this.i.a($$2) - 20;
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

   static class g extends exm.b {
      private static final agt[] d = new agt[]{
         new agt("notification/1"),
         new agt("notification/2"),
         new agt("notification/3"),
         new agt("notification/4"),
         new agt("notification/5"),
         new agt("notification/more")
      };
      private static final int t = Integer.MAX_VALUE;
      private static final int u = 20;
      private static final int v = 14;
      private int w;

      public g(vb $$0, agt $$1, ewh.c $$2) {
         super(20, 20, $$0, 14, 14, $$1, $$2);
      }

      int a() {
         return this.w;
      }

      public void a(int $$0) {
         this.w = $$0;
      }

      @Override
      public void b(evw $$0, int $$1, int $$2, float $$3) {
         super.b($$0, $$1, $$2, $$3);
         if (this.i && this.w != 0) {
            this.a($$0);
         }
      }

      private void a(evw $$0) {
         $$0.a(d[Math.min(this.w, 6) - 1], this.p() + this.k() - 5, this.r() - 3, 8, 8);
      }
   }

   class h extends epo.e {
      private static final int c = 40;
      private static final int d = -12303292;
      private final vb e;
      private final int f;
      private final List<ewf> g = new ArrayList<>();
      @Nullable
      private final epo.c h;
      private final exb i;
      private final ezq j;
      private final ezp k;
      private int l = -1;

      public h(vb $$0, int $$1, eqj $$2) {
         this.e = $$0;
         this.f = $$1;
         this.j = new ezq();
         int $$3 = 7;
         this.j.a(ewu.a(20, 20, epo.a), 0, 0, this.j.b().a(7, 7, 0, 0));
         this.j.a(ezw.a(40), 0, 0);
         this.k = this.j.a(new ezp(0, 9 * 3 * ($$1 - 1)), 0, 1, this.j.b().c(7));
         this.i = this.k.a(new exb($$0, epo.this.i).b(true), this.k.b().b().d());
         this.j.a(ezw.a(40), 0, 2);
         if ($$2.b()) {
            this.h = this.j.a(new epo.c($$1x -> epo.this.a($$2.c()), vb.c("mco.notification.dismiss")), 0, 2, this.j.b().c().a(0, 7, 7, 0));
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
      public void b(evw $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         super.b($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
         $$0.b($$3 - 2, $$2 - 2, $$4, 36 * this.f - 2, -12303292);
      }

      @Override
      public void a(evw $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
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
      public vb a() {
         return this.e;
      }
   }

   class i extends epo.e {
      private final eqk c;
      private final exs d;

      public i(eqk $$0) {
         this.c = $$0;
         this.d = exs.a(vb.c("mco.snapshot.parent.tooltip"));
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         return true;
      }

      @Override
      public void a(evw $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = this.b($$3);
         int $$11 = this.a($$2);
         eta.a($$0, $$3, $$2, 32, this.c.g);
         vb $$12 = epo.a(this.c.t, -8355712);
         int $$13 = this.a($$3, $$4, $$12);
         this.a($$0, this.c.b(), $$10, $$11, $$13, -8355712);
         if ($$12 != va.a) {
            $$0.a(epo.this.i, $$12, $$13, $$11, -8355712, false);
         }

         $$0.a(epo.this.i, this.c.a(), $$10, this.c($$11), -8355712, false);
         this.a($$0, $$2, $$3, this.c);
         this.a(this.c, $$0, $$3 + $$4, $$2, $$6, $$7);
         this.d.a($$8, this.aJ_(), new fak($$3, $$2, $$4, $$5));
      }

      @Override
      public vb a() {
         return vb.b(this.c.c);
      }
   }

   class j extends gjk<epo.e> {
      public j() {
         super(epo.this.g, epo.this.h, 0, epo.this.h, 36);
      }

      public void a(@Nullable epo.e $$0) {
         super.a($$0);
         epo.this.F();
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
      T request(ept var1) throws erg;
   }

   class l extends epo.e {
      private static final int c = 36;
      private final eqk d;
      @Nullable
      private final exs e;

      public l(eqk $$0) {
         this.d = $$0;
         boolean $$1 = epo.this.h($$0);
         if (epo.b() && $$1 && $$0.h()) {
            this.e = exs.a(vb.a("mco.snapshot.paired", $$0.s));
         } else if (!$$1 && $$0.e()) {
            this.e = exs.a(vb.a("mco.snapshot.friendsRealm.upgrade", $$0.f));
         } else if (!$$1 && $$0.f()) {
            this.e = exs.a(vb.a("mco.snapshot.friendsRealm.downgrade", $$0.t));
         } else {
            this.e = null;
         }
      }

      @Override
      public void a(evw $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         if (this.d.e == eqk.c.c) {
            $$0.a(epo.b, $$3 - 5, $$2 + $$5 / 2 - 10, 40, 20);
            int $$10 = $$2 + $$5 / 2 - 9 / 2;
            $$0.b(epo.this.i, epo.F, $$3 + 40 - 2, $$10, 8388479);
         } else {
            eta.a($$0, $$3, $$2, 32, this.d.g);
            this.a($$0, $$2, $$3, $$4);
            this.a($$0, $$2, $$3);
            this.a($$0, $$2, $$3, this.d);
            this.a(this.d, $$0, $$3 + $$4, $$2, $$6, $$7);
            if (this.e != null) {
               this.e.a($$8, this.aJ_(), new fak($$3, $$2, $$4, $$5));
            }
         }
      }

      private void a(evw $$0, int $$1, int $$2, int $$3) {
         int $$4 = this.b($$2);
         int $$5 = this.a($$1);
         vb $$6 = epo.a(this.d.t, this.d.d());
         int $$7 = this.a($$2, $$3, $$6);
         this.a($$0, this.d.b(), $$4, $$5, $$7, -1);
         if ($$6 != va.a) {
            $$0.a(epo.this.i, $$6, $$7, $$5, -8355712, false);
         }
      }

      private void a(evw $$0, int $$1, int $$2) {
         int $$3 = this.b($$2);
         int $$4 = this.a($$1);
         int $$5 = this.c($$4);
         if (this.d.m == eqk.d.b) {
            vb $$6 = vb.b(this.d.c()).a(n.h);
            $$0.a(epo.this.i, vb.a("mco.selectServer.minigameName", $$6).b(-171), $$3, $$5, -1, false);
         } else {
            $$0.a(epo.this.i, this.d.a(), $$3, this.c($$4), -8355712, false);
         }
      }

      private void e() {
         epo.this.f.ah().a(ggr.a(arc.zu, 1.0F));
         epo.a(this.d, epo.this);
      }

      private void f() {
         epo.this.f.ah().a(ggr.a(arc.zu, 1.0F));
         erv $$0 = new erv(epo.this, this.d);
         epo.this.f.a($$0);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         if (this.d.e == eqk.c.c) {
            this.f();
         } else if (epo.this.a(this.d)) {
            if (ac.b() - epo.this.aC < 250L && this.aJ_()) {
               this.e();
            }

            epo.this.aC = ac.b();
         }

         return true;
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         if (faf.a($$0)) {
            if (this.d.e == eqk.c.c) {
               this.f();
               return true;
            }

            if (epo.this.a(this.d)) {
               this.e();
               return true;
            }
         }

         return super.a($$0, $$1, $$2);
      }

      @Override
      public vb a() {
         return (vb)(this.d.e == eqk.c.c ? epo.R : vb.a("narrator.select", this.d.c));
      }

      public eqk c() {
         return this.d;
      }
   }
}
