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

public class elv extends gew {
   static final aeu a = new aeu("icon/info");
   static final aeu b = new aeu("icon/new_realm");
   static final aeu c = new aeu("realm_status/expired");
   static final aeu y = new aeu("realm_status/expires_soon");
   static final aeu z = new aeu("realm_status/open");
   static final aeu A = new aeu("realm_status/closed");
   private static final aeu B = new aeu("icon/invite");
   private static final aeu C = new aeu("icon/news");
   static final Logger D = LogUtils.getLogger();
   private static final aeu E = new aeu("textures/gui/title/realms.png");
   private static final aeu F = new aeu("textures/gui/realms/no_realms.png");
   private static final ti G = ti.c("menu.online");
   private static final ti H = ti.c("mco.selectServer.loading");
   static final ti I = ti.c("mco.selectServer.uninitialized").a(n.k);
   static final ti J = ti.c("mco.selectServer.expiredList");
   private static final ti K = ti.c("mco.selectServer.expiredRenew");
   static final ti L = ti.c("mco.selectServer.expiredTrial");
   static final ti M = ti.c("mco.selectServer.minigame").b(th.u);
   private static final ti N = ti.c("mco.selectServer.play");
   private static final ti O = ti.c("mco.selectServer.leave");
   private static final ti P = ti.c("mco.selectServer.configure");
   static final ti Q = ti.c("mco.selectServer.expired");
   static final ti R = ti.c("mco.selectServer.expires.soon");
   static final ti S = ti.c("mco.selectServer.expires.day");
   static final ti T = ti.c("mco.selectServer.open");
   static final ti U = ti.c("mco.selectServer.closed");
   static final ti V = ti.a("gui.narrate.button", I);
   private static final ti W = ti.c("mco.selectServer.noRealms");
   private static final etv X = etv.a(ti.c("mco.invites.nopending"));
   private static final etv Y = etv.a(ti.c("mco.invites.pending"));
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
   private final CompletableFuture<elu.a> ak = elu.a();
   @Nullable
   private eoz.c al;
   private final Set<UUID> am = new HashSet<>();
   private static boolean an;
   private final RateLimiter ao;
   private final eyf ap;
   private esl aq;
   private esl ar;
   private esl as;
   private esl at;
   private esl au;
   private elv.g av;
   private ens aw;
   private volatile boolean ax;
   @Nullable
   private volatile String ay;
   long az;
   private ReentrantLock aA = new ReentrantLock();
   private final List<emq> aB = new ArrayList<>();
   private esl aC;
   private elv.e aD;
   private elv.e aE;
   private elv.d aF;
   @Nullable
   private evu aG;

   public elv(eyf $$0) {
      super(G);
      this.ap = $$0;
      this.ao = RateLimiter.create(0.016666668F);
   }

   @Override
   public void aD_() {
      this.aA = new ReentrantLock();
      this.aw = new ens(this.f);
      this.av = this.d(new elv.g());
      ti $$0 = ti.c("mco.invites.title");
      this.aD = new elv.e($$0, B, $$1x -> this.f.a(new eol(this, $$0)));
      ti $$1 = ti.c("mco.news");
      this.aE = new elv.e($$1, C, $$0x -> {
         if (this.ay != null) {
            ewx.a(this.ay, this, true);
            if (this.aE.a() != 0) {
               epf.a $$1x = epf.b();
               $$1x.b = false;
               epf.b($$1x);
               this.aE.a(0);
            }
         }
      });
      this.aE.a(etv.a($$1));
      this.aq = esl.a(N, $$0x -> this.a(this.I(), this)).a(100).a();
      this.at = esl.a(P, $$0x -> this.f(this.I())).a(100).a();
      this.as = esl.a(K, $$0x -> this.e(this.I())).a(100).a();
      this.au = esl.a(O, $$0x -> this.g(this.I())).a(100).a();
      this.aC = esl.a(ti.c("mco.selectServer.purchase"), $$0x -> this.J()).b(100, 20).a();
      this.ar = esl.a(th.k, $$0x -> this.f.a(this.ap)).a(100).a();
      this.a(elv.d.a);
      this.E();
      this.ak.thenAcceptAsync($$0x -> {
         eyf $$1x = $$0x.a(this.ap);
         if ($$1x == null) {
            this.al = this.a(this.f.aY());
         } else {
            this.f.a($$1x);
         }
      }, this.j);
   }

   @Override
   protected void b() {
      if (this.aG != null) {
         this.av.a(this.g, this.h, this.aG.c(), this.h - this.aG.b());
         this.aG.a();
      }
   }

   private void a(elv.d $$0) {
      if (this.aF != $$0) {
         if (this.aG != null) {
            this.aG.a($$1 -> this.f($$1));
         }

         this.aG = this.b($$0);
         this.aF = $$0;
         this.aG.a($$1 -> {
            esj var10000 = this.d($$1);
         });
         this.b();
      }
   }

   private evu b(elv.d $$0) {
      evu $$1 = new evu(this);
      $$1.b(44);
      $$1.a(this.C());
      evv $$2 = this.c($$0);
      $$2.a();
      $$1.a($$2.i() + 20);
      $$1.b($$2);
      switch ($$0) {
         case a:
            $$1.c(new eta(this.i, H));
            break;
         case b:
            $$1.c(this.D());
      }

      return $$1;
   }

   private evv C() {
      int $$0 = 90;
      evy $$1 = evy.e().a(4);
      $$1.c().e();
      $$1.a(this.aD);
      $$1.a(this.aE);
      evy $$2 = evy.e();
      $$2.c().e();
      $$2.a(evz.a(90));
      $$2.a(esy.a(128, 34, E, 128, 64), evx::b);
      $$2.a(new evs(90, 44)).a($$1, evx::c);
      return $$2;
   }

   private evv c(elv.d $$0) {
      evt $$1 = new evt().c(4);
      evt.b $$2 = $$1.d(3);
      if ($$0 == elv.d.c) {
         $$2.a(this.aq);
         $$2.a(this.at);
         $$2.a(this.as);
         $$2.a(this.au);
      }

      $$2.a(this.aC);
      $$2.a(this.ar);
      return $$1;
   }

   private evy D() {
      evy $$0 = evy.d().a(10);
      $$0.c().b();
      $$0.a(esy.a(130, 64, F, 130, 64));
      esw $$1 = new esw(308, W, this.i, false);
      $$0.a($$1);
      return $$0;
   }

   void E() {
      emr $$0 = this.I();
      this.aC.i = this.aF != elv.d.a;
      this.aq.i = this.a($$0);
      this.as.i = this.b($$0);
      this.au.i = this.d($$0);
      this.at.i = this.c($$0);
   }

   boolean a(@Nullable emr $$0) {
      return $$0 != null && !$$0.j && $$0.e == emr.b.b;
   }

   private boolean b(@Nullable emr $$0) {
      return $$0 != null && $$0.j && this.i($$0);
   }

   private boolean c(@Nullable emr $$0) {
      return $$0 != null && this.i($$0);
   }

   private boolean d(@Nullable emr $$0) {
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
      eqq.O().aY().e.a();
   }

   public void e() {
      eqq.O().aY().c.a();
   }

   private eoz.c a(enq $$0) {
      eoz.c $$1 = $$0.a.a();
      $$1.a($$0.c, $$0x -> {
         this.aw.a($$0x);
         boolean $$1x = false;

         for (emr $$2 : this.aw) {
            if (this.j($$2)) {
               $$1x = true;
            }
         }

         this.a(this.aw.a() ? elv.d.b : elv.d.c);
         this.F();
         if (!an && $$1x) {
            an = true;
            this.G();
         }
      });
      a(ema::c, $$0x -> {
         this.aB.clear();
         this.aB.addAll($$0x);
         this.F();
      });
      $$1.a($$0.e, $$0x -> {
         this.aD.a($$0x);
         this.aD.a($$0x == 0 ? X : Y);
         if ($$0x > 0 && this.ao.tryAcquire(1)) {
            this.f.aV().c(ti.a("mco.configure.world.invite.narration", $$0x));
         }
      });
      $$1.a($$0.f, $$0x -> this.ax = $$0x);
      $$1.a($$0.d, $$0x -> {
         for (emv $$1x : $$0x.a) {
            for (emr $$2 : this.aw) {
               if ($$2.a == $$1x.a) {
                  $$2.a($$1x);
                  break;
               }
            }
         }
      });
      $$1.a($$0.g, $$1x -> {
         $$0.h.a($$1x);
         this.ay = $$0.h.b();
         this.aE.a($$0.h.a() ? Integer.MAX_VALUE : 0);
      });
      return $$1;
   }

   private static <T> void a(elv.h<T> $$0, Consumer<T> $$1) {
      eqq $$2 = eqq.O();
      CompletableFuture.<T>supplyAsync(() -> {
         try {
            return $$0.request(ema.a($$2));
         } catch (enn var3) {
            throw new RuntimeException(var3);
         }
      }).thenAcceptAsync($$1, $$2).exceptionally($$0x -> {
         D.error("Failed to execute call to Realms Service", $$0x);
         return null;
      });
   }

   private void F() {
      emr $$0 = this.I();
      this.av.w();
      List<UUID> $$1 = new ArrayList<>();

      for (emq $$2 : this.aB) {
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

      for (emr $$3 : this.aw) {
         elv.i $$4 = new elv.i($$3);
         this.av.a($$4);
         if ($$0 != null && $$0.a == $$3.a) {
            this.av.a((elv.c)$$4);
         }
      }

      this.E();
   }

   private void a(elv.g $$0, emq $$1) {
      if ($$1 instanceof emq.a $$2) {
         $$0.a(new elv.f($$2.d(), $$2));
         $$0.a(new elv.a($$2.a(this)));
      }
   }

   private void G() {
      new Thread(() -> {
         List<enb> $$0 = elz.a();
         ema $$1 = ema.a();
         emm $$2 = new emm();
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

      for (emr $$1 : this.aw) {
         if (this.j($$1)) {
            $$0.add($$1.a);
         }
      }

      return $$0;
   }

   private void e(@Nullable emr $$0) {
      if ($$0 != null) {
         String $$1 = aqq.a($$0.b, this.f.V().b(), $$0.k);
         this.f.o.a($$1);
         ac.i().a($$1);
      }
   }

   private void f(@Nullable emr $$0) {
      if ($$0 != null && this.f.b($$0.g)) {
         this.f.a(new eoa(this, $$0.a));
      }
   }

   private void g(@Nullable emr $$0) {
      if ($$0 != null && !this.f.b($$0.g)) {
         ti $$1 = ti.c("mco.configure.world.leave.question.line1");
         ti $$2 = ti.c("mco.configure.world.leave.question.line2");
         this.f.a(new eog($$1x -> this.a($$1x, $$0), eog.a.b, $$1, $$2, true));
      }
   }

   @Nullable
   private emr I() {
      elv.c $$0 = this.av.f();
      return $$0 != null ? $$0.b() : null;
   }

   private void a(boolean $$0, final emr $$1) {
      if ($$0) {
         (new Thread("Realms-leave-server") {
            @Override
            public void run() {
               try {
                  ema $$0 = ema.a();
                  $$0.d($$1.a);
                  elv.this.f.execute(() -> elv.this.h($$1));
               } catch (enn var2) {
                  elv.D.error("Couldn't configure world", var2);
                  elv.this.f.execute(() -> elv.this.f.a(new eoe(var2, elv.this)));
               }
            }
         }).start();
      }

      this.f.a(this);
   }

   void h(emr $$0) {
      this.aw.a($$0);
      this.av.i().removeIf($$1 -> {
         emr $$2 = $$1.b();
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
         this.aB.removeIf($$1x -> $$1x.b() && $$0.equals($$1x.c()));
         this.F();
      });
   }

   public void f() {
      this.av.a(null);
   }

   @Override
   public ti g() {
      return (ti)(switch (this.aF) {
         case a -> th.a(super.g(), H);
         case b -> th.a(super.g(), W);
         case c -> super.g();
      });
   }

   @Override
   public void a(esa $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.ax && this.aC.i) {
         eon.a($$0, this.aC);
      }

      switch (ema.a) {
         case b:
            this.a($$0, "STAGE!", -256);
            break;
         case c:
            this.a($$0, "LOCAL!", 8388479);
      }
   }

   private void J() {
      this.f.a(new eon(this, this.ax));
   }

   public void a(@Nullable emr $$0, eyf $$1) {
      if ($$0 != null) {
         try {
            if (!this.aA.tryLock(1L, TimeUnit.SECONDS)) {
               return;
            }

            if (this.aA.getHoldCount() > 1) {
               return;
            }
         } catch (InterruptedException var4) {
            return;
         }

         this.f.a(new eoh($$1, new epp(this, $$1, $$0, this.aA)));
      }
   }

   boolean i(emr $$0) {
      return this.f.b($$0.g);
   }

   private boolean j(emr $$0) {
      return this.i($$0) && !$$0.j;
   }

   private void a(esa $$0, String $$1, int $$2) {
      $$0.c().a();
      $$0.c().a((float)(this.g / 2 - 25), 20.0F, 0.0F);
      $$0.c().a(a.f.rotationDegrees(-20.0F));
      $$0.c().b(1.5F, 1.5F, 1.5F);
      $$0.a(this.i, $$1, 0, 0, $$2, false);
      $$0.c().b();
   }

   public elv h() {
      elv $$0 = new elv(this.ap);
      $$0.b(this.f, this.g, this.h);
      return $$0;
   }

   class a extends elv.c {
      private final esl c;
      private final int d = elv.this.g / 2 - 75;

      public a(esl $$0) {
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
      public void a(esa $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.c.b(this.d, $$2 + 4);
         this.c.a($$0, $$6, $$7, $$9);
      }

      @Override
      public ti a() {
         return this.c.m();
      }
   }

   static class b extends esx {
      private static final etx b = new etx(new aeu("widget/cross_button"), new aeu("widget/cross_button_highlighted"));

      protected b(esl.c $$0, ti $$1) {
         super(0, 0, 14, 14, b, $$0);
         this.a(etv.a($$1));
      }
   }

   abstract class c extends eth.a<elv.c> {
      @Nullable
      public emr b() {
         return null;
      }
   }

   static enum d {
      a,
      b,
      c;
   }

   static class e extends etp.b {
      private static final aeu[] d = new aeu[]{
         new aeu("notification/1"),
         new aeu("notification/2"),
         new aeu("notification/3"),
         new aeu("notification/4"),
         new aeu("notification/5"),
         new aeu("notification/more")
      };
      private static final int s = Integer.MAX_VALUE;
      private static final int t = 20;
      private static final int u = 14;
      private int v;

      public e(ti $$0, aeu $$1, esl.c $$2) {
         super(20, 20, $$0, 14, 14, $$1, $$2);
      }

      int a() {
         return this.v;
      }

      public void a(int $$0) {
         this.v = $$0;
      }

      @Override
      public void b(esa $$0, int $$1, int $$2, float $$3) {
         super.b($$0, $$1, $$2, $$3);
         if (this.i && this.v != 0) {
            this.a($$0);
         }
      }

      private void a(esa $$0) {
         $$0.a(d[Math.min(this.v, 6) - 1], this.r() + this.l() - 5, this.t() - 3, 8, 8);
      }
   }

   class f extends elv.c {
      private static final int c = 40;
      private static final int d = 36;
      private static final int e = -12303292;
      private final ti f;
      private final List<esj> g = new ArrayList<>();
      @Nullable
      private final elv.b h;
      private final etf i;
      private final evt j;
      private final evs k;
      private int l = -1;

      public f(ti $$0, emq $$1) {
         this.f = $$0;
         this.j = new evt();
         int $$2 = 7;
         this.j.a(esy.a(20, 20, elv.a), 0, 0, this.j.b().a(7, 7, 0, 0));
         this.j.a(evz.a(40), 0, 0);
         this.k = this.j.a(new evs(0, 9 * 3), 0, 1, this.j.b().c(7));
         this.i = this.k.a(new etf($$0, elv.this.i).b(true).k(3), this.k.b().b().d());
         this.j.a(evz.a(40), 0, 2);
         if ($$1.b()) {
            this.h = this.j.a(new elv.b($$1x -> elv.this.a($$1.c()), ti.c("mco.notification.dismiss")), 0, 2, this.j.b().c().a(0, 7, 7, 0));
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
      public void b(esa $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         super.b($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
         $$0.b($$3 - 2, $$2 - 2, $$4, 70, -12303292);
      }

      @Override
      public void a(esa $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
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
      public ti a() {
         return this.f;
      }
   }

   class g extends gev<elv.c> {
      public g() {
         super(elv.this.g, elv.this.h, 0, elv.this.h, 36);
      }

      public void a(@Nullable elv.c $$0) {
         super.a($$0);
         elv.this.E();
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
      T request(ema var1) throws enn;
   }

   class i extends elv.c {
      private static final int c = 36;
      private final emr d;

      public i(emr $$0) {
         this.d = $$0;
      }

      @Override
      public void a(esa $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         if (this.d.e == emr.b.c) {
            $$0.a(elv.b, $$3 + 36 + 10, $$2 + 6, 40, 20);
            int $$10 = $$3 + 36 + 10 + 40 + 10;
            $$0.b(elv.this.i, elv.I, $$10, $$2 + 12, -1);
         } else {
            int $$11 = 225;
            int $$12 = 2;
            this.a(this.d, $$0, $$3 + 36, $$2, $$6, $$7, 225, 2);
            if (!"0".equals(this.d.r.a)) {
               String $$13 = n.h + this.d.r.a;
               $$0.a(elv.this.i, $$13, $$3 + 36 + 207 - elv.this.i.b($$13), $$2 + 3, -8355712, false);
               if ($$6 >= $$3 + 36 + 207 - elv.this.i.b($$13)
                  && $$6 <= $$3 + 36 + 207
                  && $$7 >= $$2 + 1
                  && $$7 <= $$2 + 10
                  && $$7 < elv.this.h - 40
                  && $$7 > 32) {
                  elv.this.d(ti.b(this.d.r.b));
               }
            }

            if (elv.this.i(this.d) && this.d.j) {
               ti $$14 = this.d.k ? elv.L : elv.J;
               int $$15 = $$2 + 11 + 5;
               $$0.a(elv.this.i, $$14, $$3 + 36 + 2, $$15 + 1, 15553363, false);
            } else {
               if (this.d.m == emr.c.b) {
                  int $$16 = 13413468;
                  int $$17 = elv.this.i.a(elv.M);
                  $$0.a(elv.this.i, elv.M, $$3 + 36 + 2, $$2 + 12, 13413468, false);
                  $$0.a(elv.this.i, this.d.c(), $$3 + 36 + 2 + $$17, $$2 + 12, 7105644, false);
               } else {
                  $$0.a(elv.this.i, this.d.a(), $$3 + 36 + 2, $$2 + 12, 7105644, false);
               }

               if (!elv.this.i(this.d)) {
                  $$0.a(elv.this.i, this.d.f, $$3 + 36 + 2, $$2 + 12 + 11, 5000268, false);
               }
            }

            $$0.a(elv.this.i, this.d.b(), $$3 + 36 + 2, $$2 + 1, -1, false);
            eph.a($$0, $$3 + 36 - 36, $$2, 32, this.d.g);
         }
      }

      private void d() {
         elv.this.f.ai().a(gcc.a(aoz.yu, 1.0F));
         elv.this.a(this.d, elv.this);
      }

      private void e() {
         elv.this.f.ai().a(gcc.a(aoz.yu, 1.0F));
         eoc $$0 = new eoc(this.d, elv.this);
         elv.this.f.a($$0);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         if (this.d.e == emr.b.c) {
            this.e();
         } else if (elv.this.a(this.d)) {
            if (ac.b() - elv.this.az < 250L && this.ay_()) {
               this.d();
            }

            elv.this.az = ac.b();
         }

         return true;
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         if (ewi.a($$0)) {
            if (this.d.e == emr.b.c) {
               this.e();
               return true;
            }

            if (elv.this.a(this.d)) {
               this.d();
               return true;
            }
         }

         return super.a($$0, $$1, $$2);
      }

      private void a(emr $$0, esa $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7) {
         int $$8 = $$2 + $$6 + 22;
         if ($$0.j) {
            this.a($$1, $$8, $$3 + $$7, $$4, $$5, elv.c, () -> elv.Q);
         } else if ($$0.e == emr.b.a) {
            this.a($$1, $$8, $$3 + $$7, $$4, $$5, elv.A, () -> elv.U);
         } else if (elv.this.i($$0) && $$0.l < 7) {
            this.a($$1, $$8, $$3 + $$7, $$4, $$5, elv.y, () -> {
               if ($$0.l <= 0) {
                  return elv.R;
               } else {
                  return (ti)($$0.l == 1 ? elv.S : ti.a("mco.selectServer.expires.days", $$0.l));
               }
            });
         } else if ($$0.e == emr.b.b) {
            this.a($$1, $$8, $$3 + $$7, $$4, $$5, elv.z, () -> elv.T);
         }
      }

      private void a(esa $$0, int $$1, int $$2, int $$3, int $$4, aeu $$5, Supplier<ti> $$6) {
         $$0.a($$5, $$1, $$2, 10, 28);
         if ($$3 >= $$1 && $$3 <= $$1 + 9 && $$4 >= $$2 && $$4 <= $$2 + 27 && $$4 < elv.this.h - 40 && $$4 > 32) {
            elv.this.d($$6.get());
         }
      }

      @Override
      public ti a() {
         return (ti)(this.d.e == emr.b.c ? elv.V : ti.a("narrator.select", this.d.c));
      }

      @Nullable
      @Override
      public emr b() {
         return this.d;
      }
   }
}
