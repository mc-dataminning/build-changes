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

public class elq extends ger {
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
   private final CompletableFuture<elp.a> ak = elp.a();
   @Nullable
   private eou.c al;
   private final Set<UUID> am = new HashSet<>();
   private static boolean an;
   private final RateLimiter ao;
   private final eya ap;
   private esg aq;
   private esg ar;
   private esg as;
   private esg at;
   private esg au;
   private elq.g av;
   private boolean aw;
   private eno ax;
   private volatile int ay;
   int az;
   private volatile boolean aA;
   private volatile boolean aB;
   @Nullable
   private volatile String aC;
   long aD;
   private ReentrantLock aE = new ReentrantLock();
   private final List<eml> aF = new ArrayList<>();
   private esg aG;
   private elq.e aH;
   private elq.e aI;
   private elq.d aJ;
   @Nullable
   private evp aK;

   public elq(eya $$0) {
      super(G);
      this.ap = $$0;
      this.ao = RateLimiter.create(0.016666668F);
   }

   @Override
   public void aC_() {
      this.aE = new ReentrantLock();
      this.ax = new eno(this.f);
      this.av = this.d(new elq.g());
      tf $$0 = tf.c("mco.invites.title");
      this.aH = new elq.e($$0, B, $$1x -> this.f.a(new eog(this, $$0)));
      tf $$1 = tf.c("mco.news");
      this.aI = new elq.e($$1, C, $$0x -> {
         if (this.aC != null) {
            ews.a(this.aC, this, true);
            if (this.aB) {
               epa.a $$1x = epa.b();
               $$1x.b = false;
               this.aB = false;
               epa.b($$1x);
               this.E();
            }
         }
      });
      this.aI.a(etq.a($$1));
      this.aq = esg.a(N, $$0x -> this.a(this.I(), this)).a(100).a();
      this.at = esg.a(P, $$0x -> this.f(this.I())).a(100).a();
      this.as = esg.a(K, $$0x -> this.e(this.I())).a(100).a();
      this.au = esg.a(O, $$0x -> this.g(this.I())).a(100).a();
      this.aG = esg.a(tf.c("mco.selectServer.purchase"), $$0x -> this.J()).b(100, 20).a();
      this.ar = esg.a(te.k, $$0x -> this.f.a(this.ap)).a(100).a();
      this.a(elq.d.a);
      this.E();
      this.ak.thenAcceptAsync($$0x -> {
         eya $$1x = $$0x.a(this.ap);
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

   private void a(elq.d $$0) {
      if (this.aJ != $$0) {
         if (this.aK != null) {
            this.aK.a($$1 -> this.f($$1));
         }

         this.aK = this.b($$0);
         this.aJ = $$0;
         this.aK.a($$1 -> {
            ese var10000 = this.d($$1);
         });
         this.b();
      }
   }

   private evp b(elq.d $$0) {
      evp $$1 = new evp(this);
      $$1.b(44);
      $$1.a(this.C());
      evq $$2 = this.c($$0);
      $$2.a();
      $$1.a($$2.i() + 20);
      $$1.b($$2);
      switch ($$0) {
         case a:
            $$1.c(new esv(this.i, H));
            break;
         case b:
            $$1.c(this.D());
      }

      return $$1;
   }

   private evq C() {
      int $$0 = 90;
      evt $$1 = evt.e().a(4);
      $$1.c().e();
      $$1.a(this.aH);
      $$1.a(this.aI);
      evt $$2 = evt.e();
      $$2.c().e();
      $$2.a(evu.a(90));
      $$2.a(est.a(128, 34, E, 128, 64), evs::b);
      $$2.a(new evn(90, 44)).a($$1, evs::c);
      return $$2;
   }

   private evq c(elq.d $$0) {
      evo $$1 = new evo().c(4);
      evo.b $$2 = $$1.d(3);
      if ($$0 == elq.d.c) {
         $$2.a(this.aq);
         $$2.a(this.at);
         $$2.a(this.as);
         $$2.a(this.au);
      }

      $$2.a(this.aG);
      $$2.a(this.ar);
      return $$1;
   }

   private evt D() {
      evt $$0 = evt.d().a(10);
      $$0.c().b();
      $$0.a(est.a(130, 64, F, 130, 64));
      esr $$1 = new esr(308, W, this.i, false);
      $$0.a($$1);
      return $$0;
   }

   void E() {
      emm $$0 = this.I();
      this.aG.i = this.aw;
      this.aq.i = this.a($$0);
      this.as.i = this.b($$0);
      this.au.i = this.d($$0);
      this.at.i = this.c($$0);
      this.aH.a(this.ay);
      this.aH.a(this.ay == 0 ? X : Y);
      this.aI.a(this.aB ? Integer.MAX_VALUE : 0);
   }

   boolean a(@Nullable emm $$0) {
      return $$0 != null && !$$0.j && $$0.e == emm.b.b;
   }

   private boolean b(@Nullable emm $$0) {
      return $$0 != null && $$0.j && this.i($$0);
   }

   private boolean c(@Nullable emm $$0) {
      return $$0 != null && this.i($$0);
   }

   private boolean d(@Nullable emm $$0) {
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

   private eou.c a(enm $$0) {
      eou.c $$1 = $$0.a.a();
      $$1.a($$0.c, $$0x -> {
         this.ax.a($$0x);
         boolean $$1x = false;

         for (emm $$2 : this.ax) {
            if (this.j($$2)) {
               $$1x = true;
            }
         }

         this.aw = true;
         this.a(this.ax.a() ? elq.d.b : elq.d.c);
         this.F();
         if (!an && $$1x) {
            an = true;
            this.G();
         }
      });
      a(elv::c, $$0x -> {
         this.aF.clear();
         this.aF.addAll($$0x);
         this.F();
      });
      $$1.a($$0.e, $$0x -> {
         this.ay = $$0x;
         this.E();
         if (this.ay > 0 && this.ao.tryAcquire(1)) {
            this.f.aV().c(tf.a("mco.configure.world.invite.narration", this.ay));
         }
      });
      $$1.a($$0.f, $$0x -> this.aA = $$0x);
      $$1.a($$0.d, $$0x -> {
         for (emq $$1x : $$0x.a) {
            for (emm $$2 : this.ax) {
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
         this.E();
      });
      return $$1;
   }

   private static <T> void a(elq.h<T> $$0, Consumer<T> $$1) {
      eql $$2 = eql.O();
      CompletableFuture.<T>supplyAsync(() -> {
         try {
            return $$0.request(elv.a($$2));
         } catch (eni var3) {
            throw new RuntimeException(var3);
         }
      }).thenAcceptAsync($$1, $$2).exceptionally($$0x -> {
         D.error("Failed to execute call to Realms Service", $$0x);
         return null;
      });
   }

   private void F() {
      emm $$0 = this.I();
      this.av.w();
      List<UUID> $$1 = new ArrayList<>();

      for (eml $$2 : this.aF) {
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

      for (emm $$3 : this.ax) {
         elq.i $$4 = new elq.i($$3);
         this.av.a($$4);
         if ($$0 != null && $$0.a == $$3.a) {
            this.av.a((elq.c)$$4);
         }
      }

      this.E();
   }

   private void a(elq.g $$0, eml $$1) {
      if ($$1 instanceof eml.a $$2) {
         $$0.a(new elq.f($$2.d(), $$2));
         $$0.a(new elq.a($$2.a(this)));
      }
   }

   private void G() {
      new Thread(() -> {
         List<emw> $$0 = elu.a();
         elv $$1 = elv.a();
         emh $$2 = new emh();
         $$2.a = $$0;
         $$2.b = this.H();

         try {
            $$1.a($$2);
         } catch (Throwable var5) {
            D.warn("Could not send ping result to Realms: ", var5);
         }
      }).start();
   }

   private List<Long> H() {
      List<Long> $$0 = Lists.newArrayList();

      for (emm $$1 : this.ax) {
         if (this.j($$1)) {
            $$0.add($$1.a);
         }
      }

      return $$0;
   }

   private void e(@Nullable emm $$0) {
      if ($$0 != null) {
         String $$1 = aqn.a($$0.b, this.f.V().b(), $$0.k);
         this.f.o.a($$1);
         ac.i().a($$1);
      }
   }

   private void f(@Nullable emm $$0) {
      if ($$0 != null && this.f.b($$0.g)) {
         this.f.a(new enw(this, $$0.a));
      }
   }

   private void g(@Nullable emm $$0) {
      if ($$0 != null && !this.f.b($$0.g)) {
         tf $$1 = tf.c("mco.configure.world.leave.question.line1");
         tf $$2 = tf.c("mco.configure.world.leave.question.line2");
         this.f.a(new eoc($$1x -> this.a($$1x, $$0), eoc.a.b, $$1, $$2, true));
      }
   }

   @Nullable
   private emm I() {
      if (this.av == null) {
         return null;
      } else {
         elq.c $$0 = this.av.f();
         return $$0 != null ? $$0.b() : null;
      }
   }

   private void a(boolean $$0, final emm $$1) {
      if ($$0) {
         (new Thread("Realms-leave-server") {
            @Override
            public void run() {
               try {
                  elv $$0 = elv.a();
                  $$0.d($$1.a);
                  elq.this.f.execute(() -> elq.this.h($$1));
               } catch (eni var2) {
                  elq.D.error("Couldn't configure world", var2);
                  elq.this.f.execute(() -> elq.this.f.a(new eoa(var2, elq.this)));
               }
            }
         }).start();
      }

      this.f.a(this);
   }

   void h(emm $$0) {
      this.ax.a($$0);
      this.av.i().removeIf($$1 -> {
         emm $$2 = $$1.b();
         return $$2 != null && $$2.a == $$0.a;
      });
      this.av.a(null);
      this.E();
   }

   void a(UUID $$0) {
      a($$1 -> {
         $$1.b(List.of($$0));
         return null;
      }, $$1 -> {
         this.aF.removeIf($$1x -> $$1x.b() && $$0.equals($$1x.c()));
         this.F();
      });
   }

   public void d() {
      if (this.av != null) {
         this.av.a(null);
      }
   }

   @Override
   public tf e() {
      return (tf)(switch (this.aJ) {
         case a -> te.a(super.e(), H);
         case b -> te.a(super.e(), W);
         case c -> super.e();
      });
   }

   @Override
   public void a(erv $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.aA && this.aG.i) {
         eoi.a($$0, this.aG);
      }

      switch (elv.a) {
         case b:
            this.a($$0, "STAGE!", -256);
            break;
         case c:
            this.a($$0, "LOCAL!", 8388479);
      }
   }

   private void J() {
      this.f.a(new eoi(this, this.aA));
   }

   public void a(@Nullable emm $$0, eya $$1) {
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

         this.f.a(new eod($$1, new epk(this, $$1, $$0, this.aE)));
      }
   }

   boolean i(emm $$0) {
      return this.f.b($$0.g);
   }

   private boolean j(emm $$0) {
      return this.i($$0) && !$$0.j;
   }

   private void a(erv $$0, String $$1, int $$2) {
      $$0.c().a();
      $$0.c().a((float)(this.g / 2 - 25), 20.0F, 0.0F);
      $$0.c().a(a.f.rotationDegrees(-20.0F));
      $$0.c().b(1.5F, 1.5F, 1.5F);
      $$0.a(this.i, $$1, 0, 0, $$2, false);
      $$0.c().b();
   }

   public elq f() {
      elq $$0 = new elq(this.ap);
      $$0.b(this.f, this.g, this.h);
      return $$0;
   }

   class a extends elq.c {
      private final esg c;
      private final int d = elq.this.g / 2 - 75;

      public a(esg $$0) {
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
      public void a(erv $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.c.b(this.d, $$2 + 4);
         this.c.a($$0, $$6, $$7, $$9);
      }

      @Override
      public tf a() {
         return this.c.m();
      }
   }

   static class b extends ess {
      private static final ets b = new ets(new aer("widget/cross_button"), new aer("widget/cross_button_highlighted"));

      protected b(esg.c $$0, tf $$1) {
         super(0, 0, 14, 14, b, $$0);
         this.a(etq.a($$1));
      }
   }

   abstract class c extends etc.a<elq.c> {
      @Nullable
      public emm b() {
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

      public e(tf $$0, aer $$1, esg.c $$2) {
         super(20, 20, $$0, 14, 14, $$1, $$2);
      }

      public void a(int $$0) {
         this.v = $$0;
      }

      @Override
      public void b(erv $$0, int $$1, int $$2, float $$3) {
         super.b($$0, $$1, $$2, $$3);
         if (this.i && this.v != 0) {
            this.a($$0);
         }
      }

      private void a(erv $$0) {
         $$0.a(d[Math.min(this.v, 6) - 1], this.r() + this.l() - 5, this.t() - 3, 8, 8);
      }
   }

   class f extends elq.c {
      private static final int c = 40;
      private static final int d = 36;
      private static final int e = -12303292;
      private final tf f;
      private final List<ese> g = new ArrayList<>();
      @Nullable
      private final elq.b h;
      private final eta i;
      private final evo j;
      private final evn k;
      private int l = -1;

      public f(tf $$0, eml $$1) {
         this.f = $$0;
         this.j = new evo();
         int $$2 = 7;
         this.j.a(est.a(20, 20, elq.a), 0, 0, this.j.b().a(7, 7, 0, 0));
         this.j.a(evu.a(40), 0, 0);
         this.k = this.j.a(new evn(0, 9 * 3), 0, 1, this.j.b().c(7));
         this.i = this.k.a(new eta($$0, elq.this.i).b(true).k(3), this.k.b().b().d());
         this.j.a(evu.a(40), 0, 2);
         if ($$1.b()) {
            this.h = this.j.a(new elq.b($$1x -> elq.this.a($$1.c()), tf.c("mco.notification.dismiss")), 0, 2, this.j.b().c().a(0, 7, 7, 0));
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
      public void b(erv $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         super.b($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
         $$0.b($$3 - 2, $$2 - 2, $$4, 70, -12303292);
      }

      @Override
      public void a(erv $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
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

   class g extends geq<elq.c> {
      public g() {
         super(elq.this.g, elq.this.h, 0, elq.this.h, 36);
      }

      public void a(@Nullable elq.c $$0) {
         super.a($$0);
         elq.this.E();
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
      T request(elv var1) throws eni;
   }

   class i extends elq.c {
      private static final int c = 36;
      private final emm d;

      public i(emm $$0) {
         this.d = $$0;
      }

      @Override
      public void a(erv $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a(this.d, $$0, $$3, $$2, $$6, $$7);
      }

      private void d() {
         elq.this.f.ai().a(gbx.a(aow.yu, 1.0F));
         elq.this.a(this.d, elq.this);
      }

      private void e() {
         elq.this.f.ai().a(gbx.a(aow.yu, 1.0F));
         eny $$0 = new eny(this.d, elq.this);
         elq.this.f.a($$0);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         if (this.d.e == emm.b.c) {
            this.e();
         } else if (elq.this.a(this.d)) {
            if (ac.b() - elq.this.aD < 250L && this.aw_()) {
               this.d();
            }

            elq.this.aD = ac.b();
         }

         return true;
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         if (ewd.a($$0)) {
            if (this.d.e == emm.b.c) {
               this.e();
               return true;
            }

            if (elq.this.a(this.d)) {
               this.d();
               return true;
            }
         }

         return super.a($$0, $$1, $$2);
      }

      private void a(emm $$0, erv $$1, int $$2, int $$3, int $$4, int $$5) {
         this.b($$0, $$1, $$2 + 36, $$3, $$4, $$5);
      }

      private void b(emm $$0, erv $$1, int $$2, int $$3, int $$4, int $$5) {
         if ($$0.e == emm.b.c) {
            $$1.a(elq.b, $$2 + 10, $$3 + 6, 40, 20);
            float $$6 = 0.5F + (1.0F + arp.a((float)elq.this.az * 0.25F)) * 0.25F;
            int $$7 = 0xFF000000 | (int)(127.0F * $$6) << 16 | (int)(255.0F * $$6) << 8 | (int)(127.0F * $$6);
            $$1.a(elq.this.i, elq.I, $$2 + 10 + 40 + 75, $$3 + 12, $$7);
         } else {
            int $$8 = 225;
            int $$9 = 2;
            this.a($$0, $$1, $$2, $$3, $$4, $$5, 225, 2);
            if (!"0".equals($$0.r.a)) {
               String $$10 = n.h + $$0.r.a;
               $$1.a(elq.this.i, $$10, $$2 + 207 - elq.this.i.b($$10), $$3 + 3, -8355712, false);
               if ($$4 >= $$2 + 207 - elq.this.i.b($$10) && $$4 <= $$2 + 207 && $$5 >= $$3 + 1 && $$5 <= $$3 + 10 && $$5 < elq.this.h - 40 && $$5 > 32) {
                  elq.this.d(tf.b($$0.r.b));
               }
            }

            if (elq.this.i($$0) && $$0.j) {
               tf $$11 = $$0.k ? elq.L : elq.J;
               int $$12 = $$3 + 11 + 5;
               $$1.a(elq.this.i, $$11, $$2 + 2, $$12 + 1, 15553363, false);
            } else {
               if ($$0.m == emm.c.b) {
                  int $$13 = 13413468;
                  int $$14 = elq.this.i.a(elq.M);
                  $$1.a(elq.this.i, elq.M, $$2 + 2, $$3 + 12, 13413468, false);
                  $$1.a(elq.this.i, $$0.c(), $$2 + 2 + $$14, $$3 + 12, 7105644, false);
               } else {
                  $$1.a(elq.this.i, $$0.a(), $$2 + 2, $$3 + 12, 7105644, false);
               }

               if (!elq.this.i($$0)) {
                  $$1.a(elq.this.i, $$0.f, $$2 + 2, $$3 + 12 + 11, 5000268, false);
               }
            }

            $$1.a(elq.this.i, $$0.b(), $$2 + 2, $$3 + 1, -1, false);
            epc.a($$1, $$2 - 36, $$3, 32, $$0.g);
         }
      }

      private void a(emm $$0, erv $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7) {
         int $$8 = $$2 + $$6 + 22;
         if ($$0.j) {
            this.a($$1, $$8, $$3 + $$7, $$4, $$5, elq.c, () -> elq.Q);
         } else if ($$0.e == emm.b.a) {
            this.a($$1, $$8, $$3 + $$7, $$4, $$5, elq.A, () -> elq.U);
         } else if (elq.this.i($$0) && $$0.l < 7) {
            this.a($$1, $$8, $$3 + $$7, $$4, $$5, elq.y, () -> {
               if ($$0.l <= 0) {
                  return elq.R;
               } else {
                  return (tf)($$0.l == 1 ? elq.S : tf.a("mco.selectServer.expires.days", $$0.l));
               }
            });
         } else if ($$0.e == emm.b.b) {
            this.a($$1, $$8, $$3 + $$7, $$4, $$5, elq.z, () -> elq.T);
         }
      }

      private void a(erv $$0, int $$1, int $$2, int $$3, int $$4, aer $$5, Supplier<tf> $$6) {
         $$0.a($$5, $$1, $$2, 10, 28);
         if ($$3 >= $$1 && $$3 <= $$1 + 9 && $$4 >= $$2 && $$4 <= $$2 + 27 && $$4 < elq.this.h - 40 && $$4 > 32) {
            elq.this.d($$6.get());
         }
      }

      @Override
      public tf a() {
         return (tf)(this.d.e == emm.b.c ? elq.V : tf.a("narrator.select", this.d.c));
      }

      @Nullable
      @Override
      public emm b() {
         return this.d;
      }
   }
}
