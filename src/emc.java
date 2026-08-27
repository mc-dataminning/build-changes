import com.google.common.collect.Lists;
import com.google.common.util.concurrent.RateLimiter;
import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class emc extends gfd {
   static final aey a = new aey("icon/info");
   static final aey b = new aey("icon/new_realm");
   static final aey c = new aey("realm_status/expired");
   static final aey y = new aey("realm_status/expires_soon");
   static final aey z = new aey("realm_status/open");
   static final aey A = new aey("realm_status/closed");
   private static final aey B = new aey("icon/invite");
   private static final aey C = new aey("icon/news");
   static final Logger D = LogUtils.getLogger();
   private static final aey E = new aey("textures/gui/title/realms.png");
   private static final aey F = new aey("textures/gui/realms/no_realms.png");
   private static final tn G = tn.c("menu.online");
   private static final tn H = tn.c("mco.selectServer.loading");
   static final tn I = tn.c("mco.selectServer.uninitialized").a(n.k);
   static final tn J = tn.c("mco.selectServer.expiredList");
   private static final tn K = tn.c("mco.selectServer.expiredRenew");
   static final tn L = tn.c("mco.selectServer.expiredTrial");
   static final tn M = tn.c("mco.selectServer.minigame").b(tm.u);
   private static final tn N = tn.c("mco.selectServer.play");
   private static final tn O = tn.c("mco.selectServer.leave");
   private static final tn P = tn.c("mco.selectServer.configure");
   static final tn Q = tn.c("mco.selectServer.expired");
   static final tn R = tn.c("mco.selectServer.expires.soon");
   static final tn S = tn.c("mco.selectServer.expires.day");
   static final tn T = tn.c("mco.selectServer.open");
   static final tn U = tn.c("mco.selectServer.closed");
   static final tn V = tn.a("gui.narrate.button", I);
   private static final tn W = tn.c("mco.selectServer.noRealms");
   private static final euc X = euc.a(tn.c("mco.invites.nopending"));
   private static final euc Y = euc.a(tn.c("mco.invites.pending"));
   private static final int Z = 100;
   private static final int aa = 3;
   private static final int ab = 4;
   private static final int ac = 308;
   private static final int ad = 128;
   private static final int ae = 34;
   private static final int af = 128;
   private static final int ag = 64;
   private static final int ah = 5;
   private static final int ai = 44;
   private static final int aj = 10;
   private final CompletableFuture<emb.a> ak = emb.a();
   @Nullable
   private epg.c al;
   private final Set<UUID> am = new HashSet<>();
   private static boolean an;
   private final RateLimiter ao;
   private final eym ap;
   private ess aq;
   private ess ar;
   private ess as;
   private ess at;
   private ess au;
   private emc.g av;
   private enz aw;
   private volatile boolean ax;
   @Nullable
   private volatile String ay;
   long az;
   private final List<emx> aA = new ArrayList<>();
   private ess aB;
   private emc.e aC;
   private emc.e aD;
   private emc.d aE;
   @Nullable
   private ewb aF;

   public emc(eym $$0) {
      super(G);
      this.ap = $$0;
      this.ao = RateLimiter.create(0.016666668F);
   }

   @Override
   public void aH_() {
      this.aw = new enz(this.f);
      this.av = this.d(new emc.g());
      tn $$0 = tn.c("mco.invites.title");
      this.aC = new emc.e($$0, B, $$1x -> this.f.a(new eos(this, $$0)));
      tn $$1 = tn.c("mco.news");
      this.aD = new emc.e($$1, C, $$0x -> {
         if (this.ay != null) {
            exe.a(this.ay, this, true);
            if (this.aD.a() != 0) {
               epm.a $$1x = epm.b();
               $$1x.b = false;
               epm.b($$1x);
               this.aD.a(0);
            }
         }
      });
      this.aD.a(euc.a($$1));
      this.aq = ess.a(N, $$0x -> a(this.J(), this)).a(100).a();
      this.at = ess.a(P, $$0x -> this.f(this.J())).a(100).a();
      this.as = ess.a(K, $$0x -> this.e(this.J())).a(100).a();
      this.au = ess.a(O, $$0x -> this.g(this.J())).a(100).a();
      this.aB = ess.a(tn.c("mco.selectServer.purchase"), $$0x -> this.K()).b(100, 20).a();
      this.ar = ess.a(tm.k, $$0x -> this.f.a(this.ap)).a(100).a();
      this.a(emc.d.a);
      this.F();
      this.ak.thenAcceptAsync($$0x -> {
         eym $$1x = $$0x.a(this.ap);
         if ($$1x == null) {
            this.al = this.a(this.f.aY());
         } else {
            this.f.a($$1x);
         }
      }, this.j);
   }

   @Override
   protected void b() {
      if (this.aF != null) {
         this.av.a(this.g, this.h, this.aF.c(), this.h - this.aF.b());
         this.aF.a();
      }
   }

   private void a(emc.d $$0) {
      if (this.aE != $$0) {
         if (this.aF != null) {
            this.aF.a($$1 -> this.f($$1));
         }

         this.aF = this.b($$0);
         this.aE = $$0;
         this.aF.a($$1 -> {
            esq var10000 = this.d($$1);
         });
         this.b();
      }
   }

   private ewb b(emc.d $$0) {
      ewb $$1 = new ewb(this);
      $$1.b(44);
      $$1.a(this.D());
      ewc $$2 = this.c($$0);
      $$2.a();
      $$1.a($$2.i() + 20);
      $$1.b($$2);
      switch ($$0) {
         case a:
            $$1.c(new eth(this.i, H));
            break;
         case b:
            $$1.c(this.E());
      }

      return $$1;
   }

   private ewc D() {
      int $$0 = 90;
      ewf $$1 = ewf.e().a(4);
      $$1.c().e();
      $$1.a(this.aC);
      $$1.a(this.aD);
      ewf $$2 = ewf.e();
      $$2.c().e();
      $$2.a(ewg.a(90));
      $$2.a(etf.a(128, 34, E, 128, 64), ewe::b);
      $$2.a(new evz(90, 44)).a($$1, ewe::c);
      return $$2;
   }

   private ewc c(emc.d $$0) {
      ewa $$1 = new ewa().c(4);
      ewa.b $$2 = $$1.d(3);
      if ($$0 == emc.d.c) {
         $$2.a(this.aq);
         $$2.a(this.at);
         $$2.a(this.as);
         $$2.a(this.au);
      }

      $$2.a(this.aB);
      $$2.a(this.ar);
      return $$1;
   }

   private ewf E() {
      ewf $$0 = ewf.d().a(10);
      $$0.c().b();
      $$0.a(etf.a(130, 64, F, 130, 64));
      etd $$1 = new etd(308, W, this.i, false);
      $$0.a($$1);
      return $$0;
   }

   void F() {
      emy $$0 = this.J();
      this.aB.i = this.aE != emc.d.a;
      this.aq.i = this.a($$0);
      this.as.i = this.b($$0);
      this.au.i = this.d($$0);
      this.at.i = this.c($$0);
   }

   boolean a(@Nullable emy $$0) {
      return $$0 != null && !$$0.j && $$0.e == emy.b.b;
   }

   private boolean b(@Nullable emy $$0) {
      return $$0 != null && $$0.j && this.i($$0);
   }

   private boolean c(@Nullable emy $$0) {
      return $$0 != null && this.i($$0);
   }

   private boolean d(@Nullable emy $$0) {
      return $$0 != null && !this.i($$0);
   }

   @Override
   public void c() {
      super.c();
      if (this.al != null) {
         this.al.b();
      }
   }

   public static void d() {
      eqx.O().aY().d.a();
   }

   public void e() {
      eqx.O().aY().c.a();
   }

   private epg.c a(enx $$0) {
      epg.c $$1 = $$0.a.a();
      $$1.a($$0.c, $$0x -> {
         this.aw.a($$0x);
         this.a(this.aw.a() && this.aA.isEmpty() ? emc.d.b : emc.d.c);
         this.G();
         boolean $$1x = false;

         for (emy $$2 : this.aw) {
            if (this.j($$2)) {
               $$1x = true;
            }
         }

         if (!an && $$1x) {
            an = true;
            this.H();
         }
      });
      a(emh::c, $$0x -> {
         this.aA.clear();
         this.aA.addAll($$0x);
         if (!this.aA.isEmpty() && this.aE != emc.d.a) {
            this.a(emc.d.c);
            this.G();
         }
      });
      $$1.a($$0.d, $$0x -> {
         this.aC.a($$0x);
         this.aC.a($$0x == 0 ? X : Y);
         if ($$0x > 0 && this.ao.tryAcquire(1)) {
            this.f.aV().c(tn.a("mco.configure.world.invite.narration", $$0x));
         }
      });
      $$1.a($$0.e, $$0x -> this.ax = $$0x);
      $$1.a($$0.f, $$1x -> {
         $$0.g.a($$1x);
         this.ay = $$0.g.b();
         this.aD.a($$0.g.a() ? Integer.MAX_VALUE : 0);
      });
      return $$1;
   }

   private static <T> void a(emc.h<T> $$0, Consumer<T> $$1) {
      eqx $$2 = eqx.O();
      CompletableFuture.<T>supplyAsync(() -> {
         try {
            return $$0.request(emh.a($$2));
         } catch (enu var3) {
            throw new RuntimeException(var3);
         }
      }).thenAcceptAsync($$1, $$2).exceptionally($$0x -> {
         D.error("Failed to execute call to Realms Service", $$0x);
         return null;
      });
   }

   private void G() {
      emy $$0 = this.J();
      this.av.w();
      List<UUID> $$1 = new ArrayList<>();

      for (emx $$2 : this.aA) {
         this.a(this.av, $$2);
         if (!$$2.a() && !this.am.contains($$2.c())) {
            $$1.add($$2.c());
         }
      }

      if (!$$1.isEmpty()) {
         a($$1x -> {
            $$1x.a($$1);
            return null;
         }, $$1x -> this.am.addAll($$1));
      }

      for (emy $$3 : this.aw) {
         emc.i $$4 = new emc.i($$3);
         this.av.a($$4);
         if ($$0 != null && $$0.a == $$3.a) {
            this.av.a((emc.c)$$4);
         }
      }

      this.F();
   }

   private void a(emc.g $$0, emx $$1) {
      if ($$1 instanceof emx.a $$2) {
         $$0.a(new emc.f($$2.d(), $$2));
         $$0.a(new emc.a($$2.a(this)));
      }
   }

   private void H() {
      new Thread(() -> {
         List<eni> $$0 = emg.a();
         emh $$1 = emh.a();
         emt $$2 = new emt();
         $$2.a = $$0;
         $$2.b = this.I();

         try {
            $$1.a($$2);
         } catch (Throwable var5) {
            D.warn("Could not send ping result to Realms: ", var5);
         }
      }).start();
   }

   private List<Long> I() {
      List<Long> $$0 = Lists.newArrayList();

      for (emy $$1 : this.aw) {
         if (this.j($$1)) {
            $$0.add($$1.a);
         }
      }

      return $$0;
   }

   private void e(@Nullable emy $$0) {
      if ($$0 != null) {
         String $$1 = aqw.a($$0.b, this.f.V().b(), $$0.k);
         this.f.o.a($$1);
         ac.i().a($$1);
      }
   }

   private void f(@Nullable emy $$0) {
      if ($$0 != null && this.f.b($$0.g)) {
         this.f.a(new eoh(this, $$0.a));
      }
   }

   private void g(@Nullable emy $$0) {
      if ($$0 != null && !this.f.b($$0.g)) {
         tn $$1 = tn.c("mco.configure.world.leave.question.line1");
         tn $$2 = tn.c("mco.configure.world.leave.question.line2");
         this.f.a(new eon($$1x -> this.a($$1x, $$0), eon.a.b, $$1, $$2, true));
      }
   }

   @Nullable
   private emy J() {
      emc.c $$0 = this.av.f();
      return $$0 != null ? $$0.b() : null;
   }

   private void a(boolean $$0, final emy $$1) {
      if ($$0) {
         (new Thread("Realms-leave-server") {
            @Override
            public void run() {
               try {
                  emh $$0 = emh.a();
                  $$0.d($$1.a);
                  emc.this.f.execute(() -> emc.this.h($$1));
               } catch (enu var2) {
                  emc.D.error("Couldn't configure world", var2);
                  emc.this.f.execute(() -> emc.this.f.a(new eol(var2, emc.this)));
               }
            }
         }).start();
      }

      this.f.a(this);
   }

   void h(emy $$0) {
      this.aw.a($$0);
      this.av.i().removeIf($$1 -> {
         emy $$2 = $$1.b();
         return $$2 != null && $$2.a == $$0.a;
      });
      this.av.a(null);
      this.F();
   }

   void a(UUID $$0) {
      a($$1 -> {
         $$1.b(List.of($$0));
         return null;
      }, $$1 -> {
         this.aA.removeIf($$1x -> $$1x.b() && $$0.equals($$1x.c()));
         this.G();
      });
   }

   public void f() {
      this.av.a(null);
   }

   @Override
   public tn g() {
      return (tn)(switch (this.aE) {
         case a -> tm.a(super.g(), H);
         case b -> tm.a(super.g(), W);
         case c -> super.g();
      });
   }

   @Override
   public void a(esh $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.ax && this.aB.i) {
         eou.a($$0, this.aB);
      }

      switch (emh.a) {
         case b:
            this.a($$0, "STAGE!", -256);
            break;
         case c:
            this.a($$0, "LOCAL!", 8388479);
      }
   }

   private void K() {
      this.f.a(new eou(this, this.ax));
   }

   public static void a(@Nullable emy $$0, eym $$1) {
      if ($$0 != null) {
         eqx.O().a(new eoo($$1, new epw($$1, $$0)));
      }
   }

   boolean i(emy $$0) {
      return this.f.b($$0.g);
   }

   private boolean j(emy $$0) {
      return this.i($$0) && !$$0.j;
   }

   private void a(esh $$0, String $$1, int $$2) {
      $$0.c().a();
      $$0.c().a((float)(this.g / 2 - 25), 20.0F, 0.0F);
      $$0.c().a(a.f.rotationDegrees(-20.0F));
      $$0.c().b(1.5F, 1.5F, 1.5F);
      $$0.a(this.i, $$1, 0, 0, $$2, false);
      $$0.c().b();
   }

   class a extends emc.c {
      private final ess c;

      public a(ess $$0) {
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
      public void a(esh $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.c.b(emc.this.g / 2 - 75, $$2 + 4);
         this.c.a($$0, $$6, $$7, $$9);
      }

      @Override
      public tn a() {
         return this.c.m();
      }
   }

   static class b extends ete {
      private static final eue b = new eue(new aey("widget/cross_button"), new aey("widget/cross_button_highlighted"));

      protected b(ess.c $$0, tn $$1) {
         super(0, 0, 14, 14, b, $$0);
         this.a(euc.a($$1));
      }
   }

   abstract class c extends eto.a<emc.c> {
      @Nullable
      public emy b() {
         return null;
      }
   }

   static enum d {
      a,
      b,
      c;
   }

   static class e extends etw.b {
      private static final aey[] d = new aey[]{
         new aey("notification/1"),
         new aey("notification/2"),
         new aey("notification/3"),
         new aey("notification/4"),
         new aey("notification/5"),
         new aey("notification/more")
      };
      private static final int s = Integer.MAX_VALUE;
      private static final int t = 20;
      private static final int u = 14;
      private int v;

      public e(tn $$0, aey $$1, ess.c $$2) {
         super(20, 20, $$0, 14, 14, $$1, $$2);
      }

      int a() {
         return this.v;
      }

      public void a(int $$0) {
         this.v = $$0;
      }

      @Override
      public void b(esh $$0, int $$1, int $$2, float $$3) {
         super.b($$0, $$1, $$2, $$3);
         if (this.i && this.v != 0) {
            this.a($$0);
         }
      }

      private void a(esh $$0) {
         $$0.a(d[Math.min(this.v, 6) - 1], this.r() + this.l() - 5, this.t() - 3, 8, 8);
      }
   }

   class f extends emc.c {
      private static final int c = 40;
      private static final int d = 36;
      private static final int e = -12303292;
      private final tn f;
      private final List<esq> g = new ArrayList<>();
      @Nullable
      private final emc.b h;
      private final etm i;
      private final ewa j;
      private final evz k;
      private int l = -1;

      public f(tn $$0, emx $$1) {
         this.f = $$0;
         this.j = new ewa();
         int $$2 = 7;
         this.j.a(etf.a(20, 20, emc.a), 0, 0, this.j.b().a(7, 7, 0, 0));
         this.j.a(ewg.a(40), 0, 0);
         this.k = this.j.a(new evz(0, 9 * 3), 0, 1, this.j.b().c(7));
         this.i = this.k.a(new etm($$0, emc.this.i).b(true).k(3), this.k.b().b().d());
         this.j.a(ewg.a(40), 0, 2);
         if ($$1.b()) {
            this.h = this.j.a(new emc.b($$1x -> emc.this.a($$1.c()), tn.c("mco.notification.dismiss")), 0, 2, this.j.b().c().a(0, 7, 7, 0));
         } else {
            this.h = null;
         }

         this.j.a(this.g::add);
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         return this.h != null && this.h.a($$0, $$1, $$2) ? true : super.a($$0, $$1, $$2);
      }

      private void a(int $$0) {
         if (this.l != $$0) {
            this.b($$0);
            this.l = $$0;
         }
      }

      private void b(int $$0) {
         int $$1 = $$0 - 80;
         this.k.b($$1);
         this.i.j($$1);
         this.j.a();
      }

      @Override
      public void b(esh $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         super.b($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
         $$0.b($$3 - 2, $$2 - 2, $$4, 70, -12303292);
      }

      @Override
      public void a(esh $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.j.b($$3, $$2);
         this.a($$4 - 4);
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
      public tn a() {
         return this.f;
      }
   }

   class g extends gfc<emc.c> {
      public g() {
         super(emc.this.g, emc.this.h, 0, emc.this.h, 36);
      }

      public void a(@Nullable emc.c $$0) {
         super.a($$0);
         emc.this.F();
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

   interface h<T> {
      T request(emh var1) throws enu;
   }

   class i extends emc.c {
      private static final int c = 36;
      private final emy d;

      public i(emy $$0) {
         this.d = $$0;
      }

      @Override
      public void a(esh $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         if (this.d.e == emy.b.c) {
            $$0.a(emc.b, $$3 + 36 + 10, $$2 + 6, 40, 20);
            int $$10 = $$3 + 36 + 10 + 40 + 10;
            $$0.b(emc.this.i, emc.I, $$10, $$2 + 12, -1);
         } else {
            int $$11 = 225;
            int $$12 = 2;
            this.a(this.d, $$0, $$3 + 36, $$2, $$6, $$7, 225, 2);
            if (emc.this.i(this.d) && this.d.j) {
               tn $$13 = this.d.k ? emc.L : emc.J;
               int $$14 = $$2 + 11 + 5;
               $$0.a(emc.this.i, $$13, $$3 + 36 + 2, $$14 + 1, 15553363, false);
            } else {
               if (this.d.m == emy.c.b) {
                  int $$15 = 13413468;
                  int $$16 = emc.this.i.a(emc.M);
                  $$0.a(emc.this.i, emc.M, $$3 + 36 + 2, $$2 + 12, 13413468, false);
                  $$0.a(emc.this.i, this.d.c(), $$3 + 36 + 2 + $$16, $$2 + 12, 7105644, false);
               } else {
                  $$0.a(emc.this.i, this.d.a(), $$3 + 36 + 2, $$2 + 12, 7105644, false);
               }

               if (!emc.this.i(this.d)) {
                  $$0.a(emc.this.i, this.d.f, $$3 + 36 + 2, $$2 + 12 + 11, 5000268, false);
               }
            }

            $$0.a(emc.this.i, this.d.b(), $$3 + 36 + 2, $$2 + 1, -1, false);
            epo.a($$0, $$3 + 36 - 36, $$2, 32, this.d.g);
         }
      }

      private void d() {
         emc.this.f.ai().a(gcj.a(apf.yu, 1.0F));
         emc.a(this.d, emc.this);
      }

      private void e() {
         emc.this.f.ai().a(gcj.a(apf.yu, 1.0F));
         eoj $$0 = new eoj(this.d, emc.this);
         emc.this.f.a($$0);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         if (this.d.e == emy.b.c) {
            this.e();
         } else if (emc.this.a(this.d)) {
            if (ac.b() - emc.this.az < 250L && this.aC_()) {
               this.d();
            }

            emc.this.az = ac.b();
         }

         return true;
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         if (ewp.a($$0)) {
            if (this.d.e == emy.b.c) {
               this.e();
               return true;
            }

            if (emc.this.a(this.d)) {
               this.d();
               return true;
            }
         }

         return super.a($$0, $$1, $$2);
      }

      private void a(emy $$0, esh $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7) {
         int $$8 = $$2 + $$6 + 22;
         if ($$0.j) {
            this.a($$1, $$8, $$3 + $$7, $$4, $$5, emc.c, () -> emc.Q);
         } else if ($$0.e == emy.b.a) {
            this.a($$1, $$8, $$3 + $$7, $$4, $$5, emc.A, () -> emc.U);
         } else if (emc.this.i($$0) && $$0.l < 7) {
            this.a($$1, $$8, $$3 + $$7, $$4, $$5, emc.y, () -> {
               if ($$0.l <= 0) {
                  return emc.R;
               } else {
                  return (tn)($$0.l == 1 ? emc.S : tn.a("mco.selectServer.expires.days", $$0.l));
               }
            });
         } else if ($$0.e == emy.b.b) {
            this.a($$1, $$8, $$3 + $$7, $$4, $$5, emc.z, () -> emc.T);
         }
      }

      private void a(esh $$0, int $$1, int $$2, int $$3, int $$4, aey $$5, Supplier<tn> $$6) {
         $$0.a($$5, $$1, $$2, 10, 28);
         if ($$3 >= $$1 && $$3 <= $$1 + 9 && $$4 >= $$2 && $$4 <= $$2 + 27 && $$4 < emc.this.h - 40 && $$4 > 32) {
            emc.this.d($$6.get());
         }
      }

      @Override
      public tn a() {
         return (tn)(this.d.e == emy.b.c ? emc.V : tn.a("narrator.select", this.d.c));
      }

      @Nullable
      @Override
      public emy b() {
         return this.d;
      }
   }
}
