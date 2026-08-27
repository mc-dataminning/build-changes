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

public class ema extends gfb {
   static final aex a = new aex("icon/info");
   static final aex b = new aex("icon/new_realm");
   static final aex c = new aex("realm_status/expired");
   static final aex y = new aex("realm_status/expires_soon");
   static final aex z = new aex("realm_status/open");
   static final aex A = new aex("realm_status/closed");
   private static final aex B = new aex("icon/invite");
   private static final aex C = new aex("icon/news");
   static final Logger D = LogUtils.getLogger();
   private static final aex E = new aex("textures/gui/title/realms.png");
   private static final aex F = new aex("textures/gui/realms/no_realms.png");
   private static final tl G = tl.c("menu.online");
   private static final tl H = tl.c("mco.selectServer.loading");
   static final tl I = tl.c("mco.selectServer.uninitialized").a(n.k);
   static final tl J = tl.c("mco.selectServer.expiredList");
   private static final tl K = tl.c("mco.selectServer.expiredRenew");
   static final tl L = tl.c("mco.selectServer.expiredTrial");
   static final tl M = tl.c("mco.selectServer.minigame").b(tk.u);
   private static final tl N = tl.c("mco.selectServer.play");
   private static final tl O = tl.c("mco.selectServer.leave");
   private static final tl P = tl.c("mco.selectServer.configure");
   static final tl Q = tl.c("mco.selectServer.expired");
   static final tl R = tl.c("mco.selectServer.expires.soon");
   static final tl S = tl.c("mco.selectServer.expires.day");
   static final tl T = tl.c("mco.selectServer.open");
   static final tl U = tl.c("mco.selectServer.closed");
   static final tl V = tl.a("gui.narrate.button", I);
   private static final tl W = tl.c("mco.selectServer.noRealms");
   private static final eua X = eua.a(tl.c("mco.invites.nopending"));
   private static final eua Y = eua.a(tl.c("mco.invites.pending"));
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
   private final CompletableFuture<elz.a> ak = elz.a();
   @Nullable
   private epe.c al;
   private final Set<UUID> am = new HashSet<>();
   private static boolean an;
   private final RateLimiter ao;
   private final eyk ap;
   private esq aq;
   private esq ar;
   private esq as;
   private esq at;
   private esq au;
   private ema.g av;
   private enx aw;
   private volatile boolean ax;
   @Nullable
   private volatile String ay;
   long az;
   private ReentrantLock aA = new ReentrantLock();
   private final List<emv> aB = new ArrayList<>();
   private esq aC;
   private ema.e aD;
   private ema.e aE;
   private ema.d aF;
   @Nullable
   private evz aG;

   public ema(eyk $$0) {
      super(G);
      this.ap = $$0;
      this.ao = RateLimiter.create(0.016666668F);
   }

   @Override
   public void aI_() {
      this.aA = new ReentrantLock();
      this.aw = new enx(this.f);
      this.av = this.d(new ema.g());
      tl $$0 = tl.c("mco.invites.title");
      this.aD = new ema.e($$0, B, $$1x -> this.f.a(new eoq(this, $$0)));
      tl $$1 = tl.c("mco.news");
      this.aE = new ema.e($$1, C, $$0x -> {
         if (this.ay != null) {
            exc.a(this.ay, this, true);
            if (this.aE.a() != 0) {
               epk.a $$1x = epk.b();
               $$1x.b = false;
               epk.b($$1x);
               this.aE.a(0);
            }
         }
      });
      this.aE.a(eua.a($$1));
      this.aq = esq.a(N, $$0x -> this.a(this.I(), this)).a(100).a();
      this.at = esq.a(P, $$0x -> this.f(this.I())).a(100).a();
      this.as = esq.a(K, $$0x -> this.e(this.I())).a(100).a();
      this.au = esq.a(O, $$0x -> this.g(this.I())).a(100).a();
      this.aC = esq.a(tl.c("mco.selectServer.purchase"), $$0x -> this.J()).b(100, 20).a();
      this.ar = esq.a(tk.k, $$0x -> this.f.a(this.ap)).a(100).a();
      this.a(ema.d.a);
      this.E();
      this.ak.thenAcceptAsync($$0x -> {
         eyk $$1x = $$0x.a(this.ap);
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

   private void a(ema.d $$0) {
      if (this.aF != $$0) {
         if (this.aG != null) {
            this.aG.a($$1 -> this.f($$1));
         }

         this.aG = this.b($$0);
         this.aF = $$0;
         this.aG.a($$1 -> {
            eso var10000 = this.d($$1);
         });
         this.b();
      }
   }

   private evz b(ema.d $$0) {
      evz $$1 = new evz(this);
      $$1.b(44);
      $$1.a(this.C());
      ewa $$2 = this.c($$0);
      $$2.a();
      $$1.a($$2.i() + 20);
      $$1.b($$2);
      switch ($$0) {
         case a:
            $$1.c(new etf(this.i, H));
            break;
         case b:
            $$1.c(this.D());
      }

      return $$1;
   }

   private ewa C() {
      int $$0 = 90;
      ewd $$1 = ewd.e().a(4);
      $$1.c().e();
      $$1.a(this.aD);
      $$1.a(this.aE);
      ewd $$2 = ewd.e();
      $$2.c().e();
      $$2.a(ewe.a(90));
      $$2.a(etd.a(128, 34, E, 128, 64), ewc::b);
      $$2.a(new evx(90, 44)).a($$1, ewc::c);
      return $$2;
   }

   private ewa c(ema.d $$0) {
      evy $$1 = new evy().c(4);
      evy.b $$2 = $$1.d(3);
      if ($$0 == ema.d.c) {
         $$2.a(this.aq);
         $$2.a(this.at);
         $$2.a(this.as);
         $$2.a(this.au);
      }

      $$2.a(this.aC);
      $$2.a(this.ar);
      return $$1;
   }

   private ewd D() {
      ewd $$0 = ewd.d().a(10);
      $$0.c().b();
      $$0.a(etd.a(130, 64, F, 130, 64));
      etb $$1 = new etb(308, W, this.i, false);
      $$0.a($$1);
      return $$0;
   }

   void E() {
      emw $$0 = this.I();
      this.aC.i = this.aF != ema.d.a;
      this.aq.i = this.a($$0);
      this.as.i = this.b($$0);
      this.au.i = this.d($$0);
      this.at.i = this.c($$0);
   }

   boolean a(@Nullable emw $$0) {
      return $$0 != null && !$$0.j && $$0.e == emw.b.b;
   }

   private boolean b(@Nullable emw $$0) {
      return $$0 != null && $$0.j && this.i($$0);
   }

   private boolean c(@Nullable emw $$0) {
      return $$0 != null && this.i($$0);
   }

   private boolean d(@Nullable emw $$0) {
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
      eqv.O().aY().e.a();
   }

   public void e() {
      eqv.O().aY().c.a();
   }

   private epe.c a(env $$0) {
      epe.c $$1 = $$0.a.a();
      $$1.a($$0.c, $$0x -> {
         this.aw.a($$0x);
         boolean $$1x = false;

         for (emw $$2 : this.aw) {
            if (this.j($$2)) {
               $$1x = true;
            }
         }

         this.a(this.aw.a() ? ema.d.b : ema.d.c);
         this.F();
         if (!an && $$1x) {
            an = true;
            this.G();
         }
      });
      a(emf::c, $$0x -> {
         this.aB.clear();
         this.aB.addAll($$0x);
         this.F();
      });
      $$1.a($$0.e, $$0x -> {
         this.aD.a($$0x);
         this.aD.a($$0x == 0 ? X : Y);
         if ($$0x > 0 && this.ao.tryAcquire(1)) {
            this.f.aV().c(tl.a("mco.configure.world.invite.narration", $$0x));
         }
      });
      $$1.a($$0.f, $$0x -> this.ax = $$0x);
      $$1.a($$0.d, $$0x -> {
         for (ena $$1x : $$0x.a) {
            for (emw $$2 : this.aw) {
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

   private static <T> void a(ema.h<T> $$0, Consumer<T> $$1) {
      eqv $$2 = eqv.O();
      CompletableFuture.<T>supplyAsync(() -> {
         try {
            return $$0.request(emf.a($$2));
         } catch (ens var3) {
            throw new RuntimeException(var3);
         }
      }).thenAcceptAsync($$1, $$2).exceptionally($$0x -> {
         D.error("Failed to execute call to Realms Service", $$0x);
         return null;
      });
   }

   private void F() {
      emw $$0 = this.I();
      this.av.w();
      List<UUID> $$1 = new ArrayList<>();

      for (emv $$2 : this.aB) {
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

      for (emw $$3 : this.aw) {
         ema.i $$4 = new ema.i($$3);
         this.av.a($$4);
         if ($$0 != null && $$0.a == $$3.a) {
            this.av.a((ema.c)$$4);
         }
      }

      this.E();
   }

   private void a(ema.g $$0, emv $$1) {
      if ($$1 instanceof emv.a $$2) {
         $$0.a(new ema.f($$2.d(), $$2));
         $$0.a(new ema.a($$2.a(this)));
      }
   }

   private void G() {
      new Thread(() -> {
         List<eng> $$0 = eme.a();
         emf $$1 = emf.a();
         emr $$2 = new emr();
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

      for (emw $$1 : this.aw) {
         if (this.j($$1)) {
            $$0.add($$1.a);
         }
      }

      return $$0;
   }

   private void e(@Nullable emw $$0) {
      if ($$0 != null) {
         String $$1 = aqv.a($$0.b, this.f.V().b(), $$0.k);
         this.f.o.a($$1);
         ac.i().a($$1);
      }
   }

   private void f(@Nullable emw $$0) {
      if ($$0 != null && this.f.b($$0.g)) {
         this.f.a(new eof(this, $$0.a));
      }
   }

   private void g(@Nullable emw $$0) {
      if ($$0 != null && !this.f.b($$0.g)) {
         tl $$1 = tl.c("mco.configure.world.leave.question.line1");
         tl $$2 = tl.c("mco.configure.world.leave.question.line2");
         this.f.a(new eol($$1x -> this.a($$1x, $$0), eol.a.b, $$1, $$2, true));
      }
   }

   @Nullable
   private emw I() {
      ema.c $$0 = this.av.f();
      return $$0 != null ? $$0.b() : null;
   }

   private void a(boolean $$0, final emw $$1) {
      if ($$0) {
         (new Thread("Realms-leave-server") {
            @Override
            public void run() {
               try {
                  emf $$0 = emf.a();
                  $$0.d($$1.a);
                  ema.this.f.execute(() -> ema.this.h($$1));
               } catch (ens var2) {
                  ema.D.error("Couldn't configure world", var2);
                  ema.this.f.execute(() -> ema.this.f.a(new eoj(var2, ema.this)));
               }
            }
         }).start();
      }

      this.f.a(this);
   }

   void h(emw $$0) {
      this.aw.a($$0);
      this.av.i().removeIf($$1 -> {
         emw $$2 = $$1.b();
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
   public tl g() {
      return (tl)(switch (this.aF) {
         case a -> tk.a(super.g(), H);
         case b -> tk.a(super.g(), W);
         case c -> super.g();
      });
   }

   @Override
   public void a(esf $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.ax && this.aC.i) {
         eos.a($$0, this.aC);
      }

      switch (emf.a) {
         case b:
            this.a($$0, "STAGE!", -256);
            break;
         case c:
            this.a($$0, "LOCAL!", 8388479);
      }
   }

   private void J() {
      this.f.a(new eos(this, this.ax));
   }

   public void a(@Nullable emw $$0, eyk $$1) {
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

         this.f.a(new eom($$1, new epu(this, $$1, $$0, this.aA)));
      }
   }

   boolean i(emw $$0) {
      return this.f.b($$0.g);
   }

   private boolean j(emw $$0) {
      return this.i($$0) && !$$0.j;
   }

   private void a(esf $$0, String $$1, int $$2) {
      $$0.c().a();
      $$0.c().a((float)(this.g / 2 - 25), 20.0F, 0.0F);
      $$0.c().a(a.f.rotationDegrees(-20.0F));
      $$0.c().b(1.5F, 1.5F, 1.5F);
      $$0.a(this.i, $$1, 0, 0, $$2, false);
      $$0.c().b();
   }

   public ema h() {
      ema $$0 = new ema(this.ap);
      $$0.b(this.f, this.g, this.h);
      return $$0;
   }

   class a extends ema.c {
      private final esq c;
      private final int d = ema.this.g / 2 - 75;

      public a(esq $$0) {
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
      public void a(esf $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.c.b(this.d, $$2 + 4);
         this.c.a($$0, $$6, $$7, $$9);
      }

      @Override
      public tl a() {
         return this.c.m();
      }
   }

   static class b extends etc {
      private static final euc b = new euc(new aex("widget/cross_button"), new aex("widget/cross_button_highlighted"));

      protected b(esq.c $$0, tl $$1) {
         super(0, 0, 14, 14, b, $$0);
         this.a(eua.a($$1));
      }
   }

   abstract class c extends etm.a<ema.c> {
      @Nullable
      public emw b() {
         return null;
      }
   }

   static enum d {
      a,
      b,
      c;
   }

   static class e extends etu.b {
      private static final aex[] d = new aex[]{
         new aex("notification/1"),
         new aex("notification/2"),
         new aex("notification/3"),
         new aex("notification/4"),
         new aex("notification/5"),
         new aex("notification/more")
      };
      private static final int s = Integer.MAX_VALUE;
      private static final int t = 20;
      private static final int u = 14;
      private int v;

      public e(tl $$0, aex $$1, esq.c $$2) {
         super(20, 20, $$0, 14, 14, $$1, $$2);
      }

      int a() {
         return this.v;
      }

      public void a(int $$0) {
         this.v = $$0;
      }

      @Override
      public void b(esf $$0, int $$1, int $$2, float $$3) {
         super.b($$0, $$1, $$2, $$3);
         if (this.i && this.v != 0) {
            this.a($$0);
         }
      }

      private void a(esf $$0) {
         $$0.a(d[Math.min(this.v, 6) - 1], this.r() + this.l() - 5, this.t() - 3, 8, 8);
      }
   }

   class f extends ema.c {
      private static final int c = 40;
      private static final int d = 36;
      private static final int e = -12303292;
      private final tl f;
      private final List<eso> g = new ArrayList<>();
      @Nullable
      private final ema.b h;
      private final etk i;
      private final evy j;
      private final evx k;
      private int l = -1;

      public f(tl $$0, emv $$1) {
         this.f = $$0;
         this.j = new evy();
         int $$2 = 7;
         this.j.a(etd.a(20, 20, ema.a), 0, 0, this.j.b().a(7, 7, 0, 0));
         this.j.a(ewe.a(40), 0, 0);
         this.k = this.j.a(new evx(0, 9 * 3), 0, 1, this.j.b().c(7));
         this.i = this.k.a(new etk($$0, ema.this.i).b(true).k(3), this.k.b().b().d());
         this.j.a(ewe.a(40), 0, 2);
         if ($$1.b()) {
            this.h = this.j.a(new ema.b($$1x -> ema.this.a($$1.c()), tl.c("mco.notification.dismiss")), 0, 2, this.j.b().c().a(0, 7, 7, 0));
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
      public void b(esf $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         super.b($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
         $$0.b($$3 - 2, $$2 - 2, $$4, 70, -12303292);
      }

      @Override
      public void a(esf $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
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
      public tl a() {
         return this.f;
      }
   }

   class g extends gfa<ema.c> {
      public g() {
         super(ema.this.g, ema.this.h, 0, ema.this.h, 36);
      }

      public void a(@Nullable ema.c $$0) {
         super.a($$0);
         ema.this.E();
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
      T request(emf var1) throws ens;
   }

   class i extends ema.c {
      private static final int c = 36;
      private final emw d;

      public i(emw $$0) {
         this.d = $$0;
      }

      @Override
      public void a(esf $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         if (this.d.e == emw.b.c) {
            $$0.a(ema.b, $$3 + 36 + 10, $$2 + 6, 40, 20);
            int $$10 = $$3 + 36 + 10 + 40 + 10;
            $$0.b(ema.this.i, ema.I, $$10, $$2 + 12, -1);
         } else {
            int $$11 = 225;
            int $$12 = 2;
            this.a(this.d, $$0, $$3 + 36, $$2, $$6, $$7, 225, 2);
            if (!"0".equals(this.d.r.a)) {
               String $$13 = n.h + this.d.r.a;
               $$0.a(ema.this.i, $$13, $$3 + 36 + 207 - ema.this.i.b($$13), $$2 + 3, -8355712, false);
               if ($$6 >= $$3 + 36 + 207 - ema.this.i.b($$13)
                  && $$6 <= $$3 + 36 + 207
                  && $$7 >= $$2 + 1
                  && $$7 <= $$2 + 10
                  && $$7 < ema.this.h - 40
                  && $$7 > 32) {
                  ema.this.d(tl.b(this.d.r.b));
               }
            }

            if (ema.this.i(this.d) && this.d.j) {
               tl $$14 = this.d.k ? ema.L : ema.J;
               int $$15 = $$2 + 11 + 5;
               $$0.a(ema.this.i, $$14, $$3 + 36 + 2, $$15 + 1, 15553363, false);
            } else {
               if (this.d.m == emw.c.b) {
                  int $$16 = 13413468;
                  int $$17 = ema.this.i.a(ema.M);
                  $$0.a(ema.this.i, ema.M, $$3 + 36 + 2, $$2 + 12, 13413468, false);
                  $$0.a(ema.this.i, this.d.c(), $$3 + 36 + 2 + $$17, $$2 + 12, 7105644, false);
               } else {
                  $$0.a(ema.this.i, this.d.a(), $$3 + 36 + 2, $$2 + 12, 7105644, false);
               }

               if (!ema.this.i(this.d)) {
                  $$0.a(ema.this.i, this.d.f, $$3 + 36 + 2, $$2 + 12 + 11, 5000268, false);
               }
            }

            $$0.a(ema.this.i, this.d.b(), $$3 + 36 + 2, $$2 + 1, -1, false);
            epm.a($$0, $$3 + 36 - 36, $$2, 32, this.d.g);
         }
      }

      private void d() {
         ema.this.f.ai().a(gch.a(ape.yu, 1.0F));
         ema.this.a(this.d, ema.this);
      }

      private void e() {
         ema.this.f.ai().a(gch.a(ape.yu, 1.0F));
         eoh $$0 = new eoh(this.d, ema.this);
         ema.this.f.a($$0);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         if (this.d.e == emw.b.c) {
            this.e();
         } else if (ema.this.a(this.d)) {
            if (ac.b() - ema.this.az < 250L && this.aD_()) {
               this.d();
            }

            ema.this.az = ac.b();
         }

         return true;
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         if (ewn.a($$0)) {
            if (this.d.e == emw.b.c) {
               this.e();
               return true;
            }

            if (ema.this.a(this.d)) {
               this.d();
               return true;
            }
         }

         return super.a($$0, $$1, $$2);
      }

      private void a(emw $$0, esf $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7) {
         int $$8 = $$2 + $$6 + 22;
         if ($$0.j) {
            this.a($$1, $$8, $$3 + $$7, $$4, $$5, ema.c, () -> ema.Q);
         } else if ($$0.e == emw.b.a) {
            this.a($$1, $$8, $$3 + $$7, $$4, $$5, ema.A, () -> ema.U);
         } else if (ema.this.i($$0) && $$0.l < 7) {
            this.a($$1, $$8, $$3 + $$7, $$4, $$5, ema.y, () -> {
               if ($$0.l <= 0) {
                  return ema.R;
               } else {
                  return (tl)($$0.l == 1 ? ema.S : tl.a("mco.selectServer.expires.days", $$0.l));
               }
            });
         } else if ($$0.e == emw.b.b) {
            this.a($$1, $$8, $$3 + $$7, $$4, $$5, ema.z, () -> ema.T);
         }
      }

      private void a(esf $$0, int $$1, int $$2, int $$3, int $$4, aex $$5, Supplier<tl> $$6) {
         $$0.a($$5, $$1, $$2, 10, 28);
         if ($$3 >= $$1 && $$3 <= $$1 + 9 && $$4 >= $$2 && $$4 <= $$2 + 27 && $$4 < ema.this.h - 40 && $$4 > 32) {
            ema.this.d($$6.get());
         }
      }

      @Override
      public tl a() {
         return (tl)(this.d.e == emw.b.c ? ema.V : tl.a("narrator.select", this.d.c));
      }

      @Nullable
      @Override
      public emw b() {
         return this.d;
      }
   }
}
