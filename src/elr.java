import com.google.common.collect.Lists;
import com.google.common.util.concurrent.RateLimiter;
import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Consumer;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class elr extends gei {
   static final aer a = new aer("icon/info");
   static final aer b = new aer("icon/new_realm");
   static final aer c = new aer("realm_status/expired");
   static final aer y = new aer("realm_status/expires_soon");
   static final aer z = new aer("realm_status/open");
   static final aer A = new aer("realm_status/closed");
   private static final aer B = new aer("icon/invite");
   private static final aer C = new aer("icon/news");
   static final Logger D = LogUtils.getLogger();
   private static final aer E = new aer("textures/gui/title/realms.png");
   private static final aer F = new aer("textures/gui/realms/no_realms.png");
   private static final tf G = tf.c("menu.online");
   private static final tf H = tf.c("mco.selectServer.loading");
   static final tf I = tf.c("mco.selectServer.uninitialized");
   static final tf J = tf.c("mco.selectServer.expiredList");
   private static final tf K = tf.c("mco.selectServer.expiredRenew");
   static final tf L = tf.c("mco.selectServer.expiredTrial");
   static final tf M = tf.c("mco.selectServer.minigame").b(te.u);
   private static final tf N = tf.c("mco.selectServer.play");
   private static final tf O = tf.c("mco.selectServer.leave");
   private static final tf P = tf.c("mco.selectServer.configure");
   static final tf Q = tf.c("mco.selectServer.expired");
   static final tf R = tf.c("mco.selectServer.expires.soon");
   static final tf S = tf.c("mco.selectServer.expires.day");
   static final tf T = tf.c("mco.selectServer.open");
   static final tf U = tf.c("mco.selectServer.closed");
   static final tf V = tf.a("gui.narrate.button", I);
   private static final tf W = tf.c("mco.selectServer.noRealms");
   private static final etq X = etq.a(tf.c("mco.invites.nopending"));
   private static final etq Y = etq.a(tf.c("mco.invites.pending"));
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
   private final CompletableFuture<elq.a> ak = elq.a();
   @Nullable
   private eov.c al;
   private final Set<UUID> am = new HashSet<>();
   private static boolean an;
   private final RateLimiter ao;
   private final exz ap;
   private esh aq;
   private esh ar;
   private esh as;
   private esh at;
   private esh au;
   private elr.g av;
   private boolean aw;
   private enp ax;
   private volatile int ay;
   int az;
   private volatile boolean aA;
   private volatile boolean aB;
   @Nullable
   private volatile String aC;
   long aD;
   private ReentrantLock aE = new ReentrantLock();
   private final List<emm> aF = new ArrayList<>();
   private esh aG;
   private elr.e aH;
   private elr.e aI;
   private elr.d aJ;
   @Nullable
   private evo aK;

   public elr(exz $$0) {
      super(G);
      this.ap = $$0;
      this.ao = RateLimiter.create(0.016666668F);
   }

   @Override
   public void aE_() {
      this.aE = new ReentrantLock();
      this.ax = new enp(this.f);
      this.av = this.d(new elr.g());
      tf $$0 = tf.c("mco.invites.title");
      this.aH = new elr.e($$0, B, $$1x -> this.f.a(new eoh(this, $$0)));
      tf $$1 = tf.c("mco.news");
      this.aI = new elr.e($$1, C, $$0x -> {
         if (this.aC != null) {
            ewr.a(this.aC, this, true);
            if (this.aB) {
               epb.a $$1x = epb.b();
               $$1x.b = false;
               this.aB = false;
               epb.b($$1x);
               this.D();
            }
         }
      });
      this.aI.a(etq.a($$1));
      this.aq = esh.a(N, $$0x -> this.a(this.H(), this)).a(100).a();
      this.at = esh.a(P, $$0x -> this.f(this.H())).a(100).a();
      this.as = esh.a(K, $$0x -> this.e(this.H())).a(100).a();
      this.au = esh.a(O, $$0x -> this.g(this.H())).a(100).a();
      this.aG = esh.a(tf.c("mco.selectServer.purchase"), $$0x -> this.I()).b(100, 20).a();
      this.ar = esh.a(te.k, $$0x -> this.f.a(this.ap)).a(100).a();
      this.a(elr.d.a);
      this.D();
      this.ak.thenAcceptAsync($$0x -> {
         exz $$1x = $$0x.a(this.ap);
         if ($$1x == null) {
            this.al = this.a(this.f.aY());
         } else {
            this.f.a($$1x);
         }
      }, this.j);
   }

   @Override
   protected void b() {
      if (this.aK != null) {
         this.av.a(this.g, this.h, this.aK.c(), this.h - this.aK.b());
         this.aK.a();
      }
   }

   private void a(elr.d $$0) {
      if (this.aJ != $$0) {
         if (this.aK != null) {
            this.aK.a($$1 -> this.f($$1));
         }

         this.aK = this.b($$0);
         this.aJ = $$0;
         this.aK.a($$1 -> {
            esf var10000 = this.d($$1);
         });
         this.b();
      }
   }

   private evo b(elr.d $$0) {
      evo $$1 = new evo(this);
      $$1.b(44);
      $$1.a(this.B());
      evp $$2 = this.c($$0);
      $$2.a();
      $$1.a($$2.h() + 20);
      $$1.b($$2);
      switch ($$0) {
         case a:
            $$1.c(new esw(this.i, H));
            break;
         case b:
            $$1.c(this.C());
      }

      return $$1;
   }

   private evp B() {
      int $$0 = 90;
      evs $$1 = evs.e().a(4);
      $$1.c().e();
      $$1.a(this.aH);
      $$1.a(this.aI);
      evs $$2 = evs.e();
      $$2.c().e();
      $$2.a(evt.a(90));
      $$2.a(esu.a(128, 34, E, 128, 64), evr::b);
      $$2.a(new evm(90, 44)).a($$1, evr::c);
      return $$2;
   }

   private evp c(elr.d $$0) {
      evn $$1 = new evn().c(4);
      evn.b $$2 = $$1.d(3);
      if ($$0 == elr.d.c) {
         $$2.a(this.aq);
         $$2.a(this.at);
         $$2.a(this.as);
         $$2.a(this.au);
      }

      $$2.a(this.aG);
      $$2.a(this.ar);
      return $$1;
   }

   private evs C() {
      evs $$0 = evs.d().a(10);
      $$0.c().b();
      $$0.a(esu.a(130, 64, F, 130, 64));
      ess $$1 = new ess(308, W, this.i, false);
      $$0.a($$1);
      this.a($$1);
      return $$0;
   }

   void D() {
      emn $$0 = this.H();
      this.aG.i = this.aw;
      this.aq.i = this.a($$0);
      this.as.i = this.b($$0);
      this.au.i = this.d($$0);
      this.at.i = this.c($$0);
      this.aH.a(this.ay);
      this.aH.a(this.ay == 0 ? X : Y);
      this.aI.a(this.aB ? Integer.MAX_VALUE : 0);
   }

   boolean a(@Nullable emn $$0) {
      return $$0 != null && !$$0.j && $$0.e == emn.b.b;
   }

   private boolean b(@Nullable emn $$0) {
      return $$0 != null && $$0.j && this.i($$0);
   }

   private boolean c(@Nullable emn $$0) {
      return $$0 != null && this.i($$0);
   }

   private boolean d(@Nullable emn $$0) {
      return $$0 != null && !this.i($$0);
   }

   @Override
   public void c() {
      super.c();
      this.az++;
      if (this.al != null) {
         this.al.b();
      }
   }

   private eov.c a(enn $$0) {
      eov.c $$1 = $$0.a.a();
      $$1.a($$0.c, $$0x -> {
         this.ax.a($$0x);
         boolean $$1x = false;

         for (emn $$2 : this.ax) {
            if (this.j($$2)) {
               $$1x = true;
            }
         }

         this.aw = true;
         this.a(this.ax.a() ? elr.d.b : elr.d.c);
         this.E();
         if (!an && $$1x) {
            an = true;
            this.F();
         }
      });
      a(elw::c, $$0x -> {
         this.aF.clear();
         this.aF.addAll($$0x);
         this.E();
      });
      $$1.a($$0.e, $$0x -> {
         this.ay = $$0x;
         this.D();
         if (this.ay > 0 && this.ao.tryAcquire(1)) {
            this.f.aV().c(tf.a("mco.configure.world.invite.narration", this.ay));
         }
      });
      $$1.a($$0.f, $$0x -> this.aA = $$0x);
      $$1.a($$0.d, $$0x -> {
         for (emr $$1x : $$0x.a) {
            for (emn $$2 : this.ax) {
               if ($$2.a == $$1x.a) {
                  $$2.a($$1x);
                  break;
               }
            }
         }
      });
      $$1.a($$0.g, $$1x -> {
         $$0.h.a($$1x);
         this.aB = $$0.h.a();
         this.aC = $$0.h.b();
         this.D();
      });
      return $$1;
   }

   private static <T> void a(elr.h<T> $$0, Consumer<T> $$1) {
      eqm $$2 = eqm.O();
      CompletableFuture.<T>supplyAsync(() -> {
         try {
            return $$0.request(elw.a($$2));
         } catch (enj var3) {
            throw new RuntimeException(var3);
         }
      }).thenAcceptAsync($$1, $$2).exceptionally($$0x -> {
         D.error("Failed to execute call to Realms Service", $$0x);
         return null;
      });
   }

   private void E() {
      emn $$0 = this.H();
      this.av.v();
      List<UUID> $$1 = new ArrayList<>();

      for (emm $$2 : this.aF) {
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

      for (emn $$3 : this.ax) {
         elr.i $$4 = new elr.i($$3);
         this.av.a($$4);
         if ($$0 != null && $$0.a == $$3.a) {
            this.av.a((elr.c)$$4);
         }
      }

      this.D();
   }

   private void a(elr.g $$0, emm $$1) {
      if ($$1 instanceof emm.a $$2) {
         $$0.a(new elr.f($$2.d(), $$2));
         $$0.a(new elr.a($$2.a(this)));
      }
   }

   private void F() {
      new Thread(() -> {
         List<emx> $$0 = elv.a();
         elw $$1 = elw.a();
         emi $$2 = new emi();
         $$2.a = $$0;
         $$2.b = this.G();

         try {
            $$1.a($$2);
         } catch (Throwable var5) {
            D.warn("Could not send ping result to Realms: ", var5);
         }
      }).start();
   }

   private List<Long> G() {
      List<Long> $$0 = Lists.newArrayList();

      for (emn $$1 : this.ax) {
         if (this.j($$1)) {
            $$0.add($$1.a);
         }
      }

      return $$0;
   }

   private void e(@Nullable emn $$0) {
      if ($$0 != null) {
         String $$1 = aqn.a($$0.b, this.f.V().b(), $$0.k);
         this.f.o.a($$1);
         ac.i().a($$1);
      }
   }

   private void f(@Nullable emn $$0) {
      if ($$0 != null && this.f.b($$0.g)) {
         this.f.a(new enx(this, $$0.a));
      }
   }

   private void g(@Nullable emn $$0) {
      if ($$0 != null && !this.f.b($$0.g)) {
         tf $$1 = tf.c("mco.configure.world.leave.question.line1");
         tf $$2 = tf.c("mco.configure.world.leave.question.line2");
         this.f.a(new eod($$1x -> this.a($$1x, $$0), eod.a.b, $$1, $$2, true));
      }
   }

   @Nullable
   private emn H() {
      if (this.av == null) {
         return null;
      } else {
         elr.c $$0 = this.av.f();
         return $$0 != null ? $$0.b() : null;
      }
   }

   private void a(boolean $$0, final emn $$1) {
      if ($$0) {
         (new Thread("Realms-leave-server") {
            @Override
            public void run() {
               try {
                  elw $$0 = elw.a();
                  $$0.d($$1.a);
                  elr.this.f.execute(() -> elr.this.h($$1));
               } catch (enj var2) {
                  elr.D.error("Couldn't configure world", var2);
                  elr.this.f.execute(() -> elr.this.f.a(new eob(var2, elr.this)));
               }
            }
         }).start();
      }

      this.f.a(this);
   }

   void h(emn $$0) {
      this.ax.a($$0);
      this.av.i().removeIf($$1 -> {
         emn $$2 = $$1.b();
         return $$2 != null && $$2.a == $$0.a;
      });
      this.av.a(null);
      this.D();
   }

   void a(UUID $$0) {
      a($$1 -> {
         $$1.b(List.of($$0));
         return null;
      }, $$1 -> {
         this.aF.removeIf($$1x -> $$1x.b() && $$0.equals($$1x.c()));
         this.E();
      });
   }

   public void d() {
      if (this.av != null) {
         this.av.a(null);
      }
   }

   @Override
   public tf e() {
      return (tf)(this.aJ == elr.d.a ? te.a(super.e(), H) : super.e());
   }

   @Override
   public void a(erw $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.aA && this.aG.i) {
         eoj.a($$0, this.aG);
      }

      switch (elw.a) {
         case b:
            this.a($$0, "STAGE!", -256);
            break;
         case c:
            this.a($$0, "LOCAL!", 8388479);
      }
   }

   private void I() {
      this.f.a(new eoj(this, this.aA));
   }

   public void a(@Nullable emn $$0, exz $$1) {
      if ($$0 != null) {
         try {
            if (!this.aE.tryLock(1L, TimeUnit.SECONDS)) {
               return;
            }

            if (this.aE.getHoldCount() > 1) {
               return;
            }
         } catch (InterruptedException var4) {
            return;
         }

         this.f.a(new eoe($$1, new epl(this, $$1, $$0, this.aE)));
      }
   }

   boolean i(emn $$0) {
      return this.f.b($$0.g);
   }

   private boolean j(emn $$0) {
      return this.i($$0) && !$$0.j;
   }

   private void a(erw $$0, String $$1, int $$2) {
      $$0.c().a();
      $$0.c().a((float)(this.g / 2 - 25), 20.0F, 0.0F);
      $$0.c().a(a.f.rotationDegrees(-20.0F));
      $$0.c().b(1.5F, 1.5F, 1.5F);
      $$0.a(this.i, $$1, 0, 0, $$2, false);
      $$0.c().b();
   }

   public elr f() {
      elr $$0 = new elr(this.ap);
      $$0.b(this.f, this.g, this.h);
      return $$0;
   }

   class a extends elr.c {
      private final esh c;
      private final int d = elr.this.g / 2 - 75;

      public a(esh $$0) {
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
      public void a(erw $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.c.b(this.d, $$2 + 4);
         this.c.a($$0, $$6, $$7, $$9);
      }

      @Override
      public tf a() {
         return this.c.l();
      }
   }

   static class b extends est {
      private static final ets b = new ets(new aer("widget/cross_button"), new aer("widget/cross_button_highlighted"));

      protected b(esh.c $$0, tf $$1) {
         super(0, 0, 14, 14, b, $$0);
         this.a(etq.a($$1));
      }
   }

   abstract class c extends etd.a<elr.c> {
      @Nullable
      public emn b() {
         return null;
      }
   }

   static enum d {
      a,
      b,
      c;
   }

   static class e extends etk.b {
      private static final aer[] d = new aer[]{
         new aer("notification/1"),
         new aer("notification/2"),
         new aer("notification/3"),
         new aer("notification/4"),
         new aer("notification/5"),
         new aer("notification/more")
      };
      private static final int s = Integer.MAX_VALUE;
      private static final int t = 20;
      private static final int u = 14;
      private int v;

      public e(tf $$0, aer $$1, esh.c $$2) {
         super(20, 20, $$0, 14, 14, $$1, $$2);
      }

      public void a(int $$0) {
         this.v = $$0;
      }

      @Override
      public void b(erw $$0, int $$1, int $$2, float $$3) {
         super.b($$0, $$1, $$2, $$3);
         if (this.i && this.v != 0) {
            this.a($$0);
         }
      }

      private void a(erw $$0) {
         $$0.a(d[Math.min(this.v, 6) - 1], this.p() + this.k() - 5, this.r() - 3, 8, 8);
      }
   }

   class f extends elr.c {
      private static final int c = 40;
      private static final int d = 36;
      private static final int e = -12303292;
      private final tf f;
      private final List<esf> g = new ArrayList<>();
      @Nullable
      private final elr.b h;
      private final etb i;
      private final evn j;
      private final evm k;
      private int l = -1;

      public f(tf $$0, emm $$1) {
         this.f = $$0;
         this.j = new evn();
         int $$2 = 7;
         this.j.a(esu.a(20, 20, elr.a), 0, 0, this.j.b().a(7, 7, 0, 0));
         this.j.a(evt.a(40), 0, 0);
         this.k = this.j.a(new evm(0, 9 * 3), 0, 1, this.j.b().c(7));
         this.i = this.k.a(new etb($$0, elr.this.i).b(true).j(3), this.k.b().b().d());
         this.j.a(evt.a(40), 0, 2);
         if ($$1.b()) {
            this.h = this.j.a(new elr.b($$1x -> elr.this.a($$1.c()), tf.c("mco.notification.dismiss")), 0, 2, this.j.b().c().a(0, 7, 7, 0));
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
         this.i.i($$1);
         this.j.a();
      }

      @Override
      public void b(erw $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         super.b($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
         $$0.b($$3 - 2, $$2 - 2, $$4, 70, -12303292);
      }

      @Override
      public void a(erw $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
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
      public tf a() {
         return this.f;
      }
   }

   class g extends geh<elr.c> {
      public g() {
         super(elr.this.g, elr.this.h, 0, elr.this.h, 36);
      }

      public void a(@Nullable elr.c $$0) {
         super.a($$0);
         elr.this.D();
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
      T request(elw var1) throws enj;
   }

   class i extends elr.c {
      private static final int c = 36;
      private final emn d;

      public i(emn $$0) {
         this.d = $$0;
      }

      @Override
      public void a(erw $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a(this.d, $$0, $$3, $$2, $$6, $$7);
      }

      private void d() {
         elr.this.f.ai().a(gbo.a(aow.yp, 1.0F));
         elr.this.a(this.d, elr.this);
      }

      private void e() {
         elr.this.f.ai().a(gbo.a(aow.yp, 1.0F));
         enz $$0 = new enz(this.d, elr.this);
         elr.this.f.a($$0);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         if (this.d.e == emn.b.c) {
            this.e();
         } else if (elr.this.a(this.d)) {
            if (ac.b() - elr.this.aD < 250L && this.ax_()) {
               this.d();
            }

            elr.this.aD = ac.b();
         }

         return true;
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         if (ewc.a($$0)) {
            if (this.d.e == emn.b.c) {
               this.e();
               return true;
            }

            if (elr.this.a(this.d)) {
               this.d();
               return true;
            }
         }

         return super.a($$0, $$1, $$2);
      }

      private void a(emn $$0, erw $$1, int $$2, int $$3, int $$4, int $$5) {
         this.b($$0, $$1, $$2 + 36, $$3, $$4, $$5);
      }

      private void b(emn $$0, erw $$1, int $$2, int $$3, int $$4, int $$5) {
         if ($$0.e == emn.b.c) {
            $$1.a(elr.b, $$2 + 10, $$3 + 6, 40, 20);
            float $$6 = 0.5F + (1.0F + arp.a((float)elr.this.az * 0.25F)) * 0.25F;
            int $$7 = 0xFF000000 | (int)(127.0F * $$6) << 16 | (int)(255.0F * $$6) << 8 | (int)(127.0F * $$6);
            $$1.a(elr.this.i, elr.I, $$2 + 10 + 40 + 75, $$3 + 12, $$7);
         } else {
            int $$8 = 225;
            int $$9 = 2;
            this.a($$0, $$1, $$2, $$3, $$4, $$5, 225, 2);
            if (!"0".equals($$0.r.a)) {
               String $$10 = n.h + $$0.r.a;
               $$1.a(elr.this.i, $$10, $$2 + 207 - elr.this.i.b($$10), $$3 + 3, -8355712, false);
               if ($$4 >= $$2 + 207 - elr.this.i.b($$10) && $$4 <= $$2 + 207 && $$5 >= $$3 + 1 && $$5 <= $$3 + 10 && $$5 < elr.this.h - 40 && $$5 > 32) {
                  elr.this.d(tf.b($$0.r.b));
               }
            }

            if (elr.this.i($$0) && $$0.j) {
               tf $$11 = $$0.k ? elr.L : elr.J;
               int $$12 = $$3 + 11 + 5;
               $$1.a(elr.this.i, $$11, $$2 + 2, $$12 + 1, 15553363, false);
            } else {
               if ($$0.m == emn.c.b) {
                  int $$13 = 13413468;
                  int $$14 = elr.this.i.a(elr.M);
                  $$1.a(elr.this.i, elr.M, $$2 + 2, $$3 + 12, 13413468, false);
                  $$1.a(elr.this.i, $$0.c(), $$2 + 2 + $$14, $$3 + 12, 7105644, false);
               } else {
                  $$1.a(elr.this.i, $$0.a(), $$2 + 2, $$3 + 12, 7105644, false);
               }

               if (!elr.this.i($$0)) {
                  $$1.a(elr.this.i, $$0.f, $$2 + 2, $$3 + 12 + 11, 5000268, false);
               }
            }

            $$1.a(elr.this.i, $$0.b(), $$2 + 2, $$3 + 1, -1, false);
            epd.a($$1, $$2 - 36, $$3, 32, $$0.g);
         }
      }

      private void a(emn $$0, erw $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7) {
         int $$8 = $$2 + $$6 + 22;
         if ($$0.j) {
            this.a($$1, $$8, $$3 + $$7, $$4, $$5, elr.c, () -> elr.Q);
         } else if ($$0.e == emn.b.a) {
            this.a($$1, $$8, $$3 + $$7, $$4, $$5, elr.A, () -> elr.U);
         } else if (elr.this.i($$0) && $$0.l < 7) {
            this.a($$1, $$8, $$3 + $$7, $$4, $$5, elr.y, () -> {
               if ($$0.l <= 0) {
                  return elr.R;
               } else {
                  return (tf)($$0.l == 1 ? elr.S : tf.a("mco.selectServer.expires.days", $$0.l));
               }
            });
         } else if ($$0.e == emn.b.b) {
            this.a($$1, $$8, $$3 + $$7, $$4, $$5, elr.z, () -> elr.T);
         }
      }

      private void a(erw $$0, int $$1, int $$2, int $$3, int $$4, aer $$5, Supplier<tf> $$6) {
         $$0.a($$5, $$1, $$2, 10, 28);
         if ($$3 >= $$1 && $$3 <= $$1 + 9 && $$4 >= $$2 && $$4 <= $$2 + 27 && $$4 < elr.this.h - 40 && $$4 > 32) {
            elr.this.d($$6.get());
         }
      }

      @Override
      public tf a() {
         return (tf)(this.d.e == emn.b.c ? elr.V : tf.a("narrator.select", this.d.c));
      }

      @Nullable
      @Override
      public emn b() {
         return this.d;
      }
   }
}
