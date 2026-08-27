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

public class ema extends gfb {
   static final aew a = new aew("icon/info");
   static final aew b = new aew("icon/new_realm");
   static final aew c = new aew("realm_status/expired");
   static final aew y = new aew("realm_status/expires_soon");
   static final aew z = new aew("realm_status/open");
   static final aew A = new aew("realm_status/closed");
   private static final aew B = new aew("icon/invite");
   private static final aew C = new aew("icon/news");
   static final Logger D = LogUtils.getLogger();
   private static final aew E = new aew("textures/gui/title/realms.png");
   private static final aew F = new aew("textures/gui/realms/no_realms.png");
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
   private static final int ak = 216;
   private static final int al = 36;
   private final CompletableFuture<elz.a> am = elz.a();
   @Nullable
   private epe.c an;
   private final Set<UUID> ao = new HashSet<>();
   private static boolean ap;
   private final RateLimiter aq;
   private final eyk ar;
   private esq as;
   private esq at;
   private esq au;
   private esq av;
   private esq aw;
   private ema.h ax;
   private enx ay;
   private volatile boolean az;
   @Nullable
   private volatile String aA;
   long aB;
   private final List<emv> aC = new ArrayList<>();
   private esq aD;
   private ema.f aE;
   private ema.f aF;
   private ema.e aG;
   @Nullable
   private evz aH;

   public ema(eyk $$0) {
      super(G);
      this.ar = $$0;
      this.aq = RateLimiter.create(0.016666668F);
   }

   @Override
   public void aH_() {
      this.ay = new enx(this.f);
      this.ax = this.d(new ema.h());
      tl $$0 = tl.c("mco.invites.title");
      this.aE = new ema.f($$0, B, $$1x -> this.f.a(new eoq(this, $$0)));
      tl $$1 = tl.c("mco.news");
      this.aF = new ema.f($$1, C, $$0x -> {
         if (this.aA != null) {
            exc.a(this.aA, this, true);
            if (this.aF.a() != 0) {
               epk.a $$1x = epk.b();
               $$1x.b = false;
               epk.b($$1x);
               this.aF.a(0);
            }
         }
      });
      this.aF.a(eua.a($$1));
      this.as = esq.a(N, $$0x -> a(this.J(), this)).a(100).a();
      this.av = esq.a(P, $$0x -> this.f(this.J())).a(100).a();
      this.au = esq.a(K, $$0x -> this.e(this.J())).a(100).a();
      this.aw = esq.a(O, $$0x -> this.g(this.J())).a(100).a();
      this.aD = esq.a(tl.c("mco.selectServer.purchase"), $$0x -> this.K()).b(100, 20).a();
      this.at = esq.a(tk.k, $$0x -> this.f.a(this.ar)).a(100).a();
      this.a(ema.e.a);
      this.F();
      this.am.thenAcceptAsync($$0x -> {
         eyk $$1x = $$0x.a(this.ar);
         if ($$1x == null) {
            this.an = this.a(this.f.aY());
         } else {
            this.f.a($$1x);
         }
      }, this.j);
   }

   @Override
   protected void b() {
      if (this.aH != null) {
         this.ax.a(this.g, this.h, this.aH.c(), this.h - this.aH.b());
         this.aH.a();
      }
   }

   private void a(ema.e $$0) {
      if (this.aG != $$0) {
         if (this.aH != null) {
            this.aH.a($$1 -> this.f($$1));
         }

         this.aH = this.b($$0);
         this.aG = $$0;
         this.aH.a($$1 -> {
            eso var10000 = this.d($$1);
         });
         this.b();
      }
   }

   private evz b(ema.e $$0) {
      evz $$1 = new evz(this);
      $$1.b(44);
      $$1.a(this.D());
      ewa $$2 = this.c($$0);
      $$2.a();
      $$1.a($$2.i() + 20);
      $$1.b($$2);
      switch ($$0) {
         case a:
            $$1.c(new etf(this.i, H));
            break;
         case b:
            $$1.c(this.E());
      }

      return $$1;
   }

   private ewa D() {
      int $$0 = 90;
      ewd $$1 = ewd.e().a(4);
      $$1.c().e();
      $$1.a(this.aE);
      $$1.a(this.aF);
      ewd $$2 = ewd.e();
      $$2.c().e();
      $$2.a(ewe.a(90));
      $$2.a(etd.a(128, 34, E, 128, 64), ewc::b);
      $$2.a(new evx(90, 44)).a($$1, ewc::c);
      return $$2;
   }

   private ewa c(ema.e $$0) {
      evy $$1 = new evy().c(4);
      evy.b $$2 = $$1.d(3);
      if ($$0 == ema.e.c) {
         $$2.a(this.as);
         $$2.a(this.av);
         $$2.a(this.au);
         $$2.a(this.aw);
      }

      $$2.a(this.aD);
      $$2.a(this.at);
      return $$1;
   }

   private ewd E() {
      ewd $$0 = ewd.d().a(10);
      $$0.c().b();
      $$0.a(etd.a(130, 64, F, 130, 64));
      etb $$1 = new etb(308, W, this.i, false);
      $$0.a($$1);
      return $$0;
   }

   void F() {
      emw $$0 = this.J();
      this.aD.i = this.aG != ema.e.a;
      this.as.i = this.a($$0);
      this.au.i = this.b($$0);
      this.aw.i = this.d($$0);
      this.av.i = this.c($$0);
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
      if (this.an != null) {
         this.an.b();
      }
   }

   public static void d() {
      eqv.O().aY().d.a();
   }

   public void e() {
      eqv.O().aY().c.a();
   }

   private epe.c a(env $$0) {
      epe.c $$1 = $$0.a.a();
      $$1.a($$0.c, $$0x -> {
         this.ay.a($$0x);
         this.a(this.ay.a() && this.aC.isEmpty() ? ema.e.b : ema.e.c);
         this.G();
         boolean $$1x = false;

         for (emw $$2 : this.ay) {
            if (this.j($$2)) {
               $$1x = true;
            }
         }

         if (!ap && $$1x) {
            ap = true;
            this.H();
         }
      });
      a(emf::c, $$0x -> {
         this.aC.clear();
         this.aC.addAll($$0x);
         if (!this.aC.isEmpty() && this.aG != ema.e.a) {
            this.a(ema.e.c);
            this.G();
         }
      });
      $$1.a($$0.d, $$0x -> {
         this.aE.a($$0x);
         this.aE.a($$0x == 0 ? X : Y);
         if ($$0x > 0 && this.aq.tryAcquire(1)) {
            this.f.aV().c(tl.a("mco.configure.world.invite.narration", $$0x));
         }
      });
      $$1.a($$0.e, $$0x -> this.az = $$0x);
      $$1.a($$0.f, $$1x -> {
         $$0.g.a($$1x);
         this.aA = $$0.g.b();
         this.aF.a($$0.g.a() ? Integer.MAX_VALUE : 0);
      });
      return $$1;
   }

   private static <T> void a(ema.i<T> $$0, Consumer<T> $$1) {
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

   private void G() {
      emw $$0 = this.J();
      this.ax.w();
      List<UUID> $$1 = new ArrayList<>();

      for (emv $$2 : this.aC) {
         this.a(this.ax, $$2);
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

      for (emw $$3 : this.ay) {
         ema.j $$4 = new ema.j($$3);
         this.ax.a($$4);
         if ($$0 != null && $$0.a == $$3.a) {
            this.ax.a((ema.d)$$4);
         }
      }

      this.F();
   }

   private void a(ema.h $$0, emv $$1) {
      if ($$1 instanceof emv.a $$2) {
         tl $$3 = $$2.d();
         int $$4 = this.i.b($$3, 216);
         int $$5 = arw.e($$4 + 7, 36) - 1;
         $$0.a(new ema.g($$3, $$5 + 2, $$2));

         for (int $$6 = 0; $$6 < $$5; $$6++) {
            $$0.a(new ema.c());
         }

         $$0.a(new ema.a($$2.a(this)));
      }
   }

   private void H() {
      new Thread(() -> {
         List<eng> $$0 = eme.a();
         emf $$1 = emf.a();
         emr $$2 = new emr();
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

      for (emw $$1 : this.ay) {
         if (this.j($$1)) {
            $$0.add($$1.a);
         }
      }

      return $$0;
   }

   private void e(@Nullable emw $$0) {
      if ($$0 != null) {
         String $$1 = aqu.a($$0.b, this.f.V().b(), $$0.k);
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
   private emw J() {
      ema.d $$0 = this.ax.f();
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
      this.ay.a($$0);
      this.ax.i().removeIf($$1 -> {
         emw $$2 = $$1.b();
         return $$2 != null && $$2.a == $$0.a;
      });
      this.ax.a(null);
      this.F();
   }

   void a(UUID $$0) {
      a($$1 -> {
         $$1.b(List.of($$0));
         return null;
      }, $$1 -> {
         this.aC.removeIf($$1x -> $$1x.b() && $$0.equals($$1x.c()));
         this.G();
      });
   }

   public void f() {
      this.ax.a(null);
   }

   @Override
   public tl g() {
      return (tl)(switch (this.aG) {
         case a -> tk.a(super.g(), H);
         case b -> tk.a(super.g(), W);
         case c -> super.g();
      });
   }

   @Override
   public void a(esf $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.az && this.aD.i) {
         eos.a($$0, this.aD);
      }

      switch (emf.a) {
         case b:
            this.a($$0, "STAGE!", -256);
            break;
         case c:
            this.a($$0, "LOCAL!", 8388479);
      }
   }

   private void K() {
      this.f.a(new eos(this, this.az));
   }

   public static void a(@Nullable emw $$0, eyk $$1) {
      if ($$0 != null) {
         eqv.O().a(new eom($$1, new epu($$1, $$0)));
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

   class a extends ema.d {
      private final esq c;

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
         this.c.b(ema.this.g / 2 - 75, $$2 + 4);
         this.c.a($$0, $$6, $$7, $$9);
      }

      @Override
      public tl a() {
         return this.c.m();
      }
   }

   static class b extends etc {
      private static final euc b = new euc(new aew("widget/cross_button"), new aew("widget/cross_button_highlighted"));

      protected b(esq.c $$0, tl $$1) {
         super(0, 0, 14, 14, b, $$0);
         this.a(eua.a($$1));
      }
   }

   class c extends ema.d {
      @Override
      public void a(esf $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
      }

      @Override
      public tl a() {
         return tl.h();
      }
   }

   abstract class d extends etm.a<ema.d> {
      @Nullable
      public emw b() {
         return null;
      }
   }

   static enum e {
      a,
      b,
      c;
   }

   static class f extends etu.b {
      private static final aew[] d = new aew[]{
         new aew("notification/1"),
         new aew("notification/2"),
         new aew("notification/3"),
         new aew("notification/4"),
         new aew("notification/5"),
         new aew("notification/more")
      };
      private static final int s = Integer.MAX_VALUE;
      private static final int t = 20;
      private static final int u = 14;
      private int v;

      public f(tl $$0, aew $$1, esq.c $$2) {
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

   class g extends ema.d {
      private static final int c = 40;
      private static final int d = -12303292;
      private final tl e;
      private final int f;
      private final List<eso> g = new ArrayList<>();
      @Nullable
      private final ema.b h;
      private final etk i;
      private final evy j;
      private final evx k;
      private int l = -1;

      public g(tl $$0, int $$1, emv $$2) {
         this.e = $$0;
         this.f = $$1;
         this.j = new evy();
         int $$3 = 7;
         this.j.a(etd.a(20, 20, ema.a), 0, 0, this.j.b().a(7, 7, 0, 0));
         this.j.a(ewe.a(40), 0, 0);
         this.k = this.j.a(new evx(0, 9 * 3 * ($$1 - 1)), 0, 1, this.j.b().c(7));
         this.i = this.k.a(new etk($$0, ema.this.i).b(true), this.k.b().b().d());
         this.j.a(ewe.a(40), 0, 2);
         if ($$2.b()) {
            this.h = this.j.a(new ema.b($$1x -> ema.this.a($$2.c()), tl.c("mco.notification.dismiss")), 0, 2, this.j.b().c().a(0, 7, 7, 0));
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
         $$0.b($$3 - 2, $$2 - 2, $$4, 36 * this.f - 2, -12303292);
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
         return this.e;
      }
   }

   class h extends gfa<ema.d> {
      public h() {
         super(ema.this.g, ema.this.h, 0, ema.this.h, 36);
      }

      public void a(@Nullable ema.d $$0) {
         super.a($$0);
         ema.this.F();
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

   interface i<T> {
      T request(emf var1) throws ens;
   }

   class j extends ema.d {
      private static final int c = 36;
      private final emw d;

      public j(emw $$0) {
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
            if (ema.this.i(this.d) && this.d.j) {
               tl $$13 = this.d.k ? ema.L : ema.J;
               int $$14 = $$2 + 11 + 5;
               $$0.a(ema.this.i, $$13, $$3 + 36 + 2, $$14 + 1, 15553363, false);
            } else {
               if (this.d.m == emw.c.b) {
                  int $$15 = 13413468;
                  int $$16 = ema.this.i.a(ema.M);
                  $$0.a(ema.this.i, ema.M, $$3 + 36 + 2, $$2 + 12, 13413468, false);
                  $$0.a(ema.this.i, this.d.c(), $$3 + 36 + 2 + $$16, $$2 + 12, 7105644, false);
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
         ema.this.f.ai().a(gch.a(apd.yu, 1.0F));
         ema.a(this.d, ema.this);
      }

      private void e() {
         ema.this.f.ai().a(gch.a(apd.yu, 1.0F));
         eoh $$0 = new eoh(this.d, ema.this);
         ema.this.f.a($$0);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         if (this.d.e == emw.b.c) {
            this.e();
         } else if (ema.this.a(this.d)) {
            if (ac.b() - ema.this.aB < 250L && this.aC_()) {
               this.d();
            }

            ema.this.aB = ac.b();
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

      private void a(esf $$0, int $$1, int $$2, int $$3, int $$4, aew $$5, Supplier<tl> $$6) {
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
