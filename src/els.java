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
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class els extends ged {
   static final aep a = new aep("icon/info");
   static final aep b = new aep("icon/new_realm");
   private static final aep c = new aep("realm_status/expired");
   private static final aep y = new aep("realm_status/expires_soon");
   private static final aep z = new aep("realm_status/open");
   private static final aep A = new aep("realm_status/closed");
   private static final aep B = new aep("icon/invite");
   private static final aep C = new aep("icon/news");
   static final Logger D = LogUtils.getLogger();
   private static final aep E = new aep("textures/gui/title/realms.png");
   private static final aep F = new aep("textures/gui/realms/no_realms.png");
   private static final te G = te.c("menu.online");
   private static final te H = te.c("mco.selectServer.loading");
   static final te I = te.c("mco.selectServer.uninitialized");
   static final te J = te.c("mco.selectServer.expiredList");
   private static final te K = te.c("mco.selectServer.expiredRenew");
   static final te L = te.c("mco.selectServer.expiredTrial");
   static final te M = te.c("mco.selectServer.minigame").b(td.u);
   private static final te N = te.c("mco.selectServer.play");
   private static final te O = te.c("mco.selectServer.leave");
   private static final te P = te.c("mco.selectServer.configure");
   private static final te Q = te.c("mco.selectServer.expired");
   private static final te R = te.c("mco.selectServer.expires.soon");
   private static final te S = te.c("mco.selectServer.expires.day");
   private static final te T = te.c("mco.selectServer.open");
   private static final te U = te.c("mco.selectServer.closed");
   static final te V = te.a("gui.narrate.button", I);
   private static final te W = te.c("mco.selectServer.noRealms");
   private static final etr X = etr.a(te.c("mco.invites.nopending"));
   private static final etr Y = etr.a(te.c("mco.invites.pending"));
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
   private final CompletableFuture<elr.a> ak = elr.a();
   @Nullable
   private eow.c al;
   private final Set<UUID> am = new HashSet<>();
   private static boolean an;
   private final RateLimiter ao;
   private final exv ap;
   private esi aq;
   private esi ar;
   private esi as;
   private esi at;
   private esi au;
   private els.g av;
   private boolean aw;
   private enq ax;
   private volatile int ay;
   int az;
   private volatile boolean aA;
   private volatile boolean aB;
   @Nullable
   private volatile String aC;
   long aD;
   private ReentrantLock aE = new ReentrantLock();
   private final List<emn> aF = new ArrayList<>();
   private esi aG;
   private els.e aH;
   private els.e aI;
   private els.d aJ;
   @Nullable
   private evk aK;

   public els(exv $$0) {
      super(G);
      this.ap = $$0;
      this.ao = RateLimiter.create(0.016666668F);
   }

   @Override
   public void aE_() {
      this.aE = new ReentrantLock();
      this.ax = new enq(this.f);
      this.av = this.d(new els.g());
      te $$0 = te.c("mco.invites.title");
      this.aH = new els.e($$0, B, $$1x -> this.f.a(new eoi(this, $$0)));
      te $$1 = te.c("mco.news");
      this.aI = new els.e($$1, C, $$0x -> {
         if (this.aC != null) {
            ewn.a(this.aC, this, true);
            if (this.aB) {
               epc.a $$1x = epc.b();
               $$1x.b = false;
               this.aB = false;
               epc.b($$1x);
               this.D();
            }
         }
      });
      this.aI.a(etr.a($$1));
      this.aq = esi.a(N, $$0x -> this.a(this.H(), this)).a(100).a();
      this.at = esi.a(P, $$0x -> this.f(this.H())).a(100).a();
      this.as = esi.a(K, $$0x -> this.e(this.H())).a(100).a();
      this.au = esi.a(O, $$0x -> this.g(this.H())).a(100).a();
      this.aG = esi.a(te.c("mco.selectServer.purchase"), $$0x -> this.I()).b(100, 20).a();
      this.ar = esi.a(td.k, $$0x -> this.f.a(this.ap)).a(100).a();
      this.a(els.d.a);
      this.D();
      this.ak.thenAcceptAsync($$0x -> {
         exv $$1x = $$0x.a(this.ap);
         if ($$1x == null) {
            this.al = this.a(this.f.aX());
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

   private void a(els.d $$0) {
      if (this.aJ != $$0) {
         if (this.aK != null) {
            this.aK.a($$1 -> this.f($$1));
         }

         this.aK = this.b($$0);
         this.aJ = $$0;
         this.aK.a($$1 -> {
            esg var10000 = this.d($$1);
         });
         this.b();
      }
   }

   private evk b(els.d $$0) {
      evk $$1 = new evk(this);
      $$1.b(44);
      $$1.a(this.B());
      evl $$2 = this.c($$0);
      $$2.a();
      $$1.a($$2.h() + 20);
      $$1.b($$2);
      switch ($$0) {
         case a:
            $$1.c(new esx(this.i, H));
            break;
         case b:
            $$1.c(this.C());
      }

      return $$1;
   }

   private evl B() {
      int $$0 = 90;
      evo $$1 = evo.e().a(4);
      $$1.c().e();
      $$1.a(this.aH);
      $$1.a(this.aI);
      evo $$2 = evo.e();
      $$2.c().e();
      $$2.a(evp.a(90));
      $$2.a(esv.a(128, 34, E, 128, 64), evn::b);
      $$2.a(new evi(90, 44)).a($$1, evn::c);
      return $$2;
   }

   private evl c(els.d $$0) {
      evj $$1 = new evj().c(4);
      evj.b $$2 = $$1.d(3);
      if ($$0 == els.d.c) {
         $$2.a(this.aq);
         $$2.a(this.at);
         $$2.a(this.as);
         $$2.a(this.au);
      }

      $$2.a(this.aG);
      $$2.a(this.ar);
      return $$1;
   }

   private evo C() {
      evo $$0 = evo.d().a(10);
      $$0.c().b();
      $$0.a(esv.a(130, 64, F, 130, 64));
      est $$1 = new est(308, W, this.i, false);
      $$0.a($$1);
      this.a($$1);
      return $$0;
   }

   void D() {
      emo $$0 = this.H();
      this.aG.i = this.aw;
      this.aq.i = this.a($$0);
      this.as.i = this.b($$0);
      this.au.i = this.d($$0);
      this.at.i = this.c($$0);
      this.aH.a(this.ay);
      this.aH.a(this.ay == 0 ? X : Y);
      this.aI.a(this.aB ? Integer.MAX_VALUE : 0);
   }

   boolean a(@Nullable emo $$0) {
      return $$0 != null && !$$0.j && $$0.e == emo.b.b;
   }

   private boolean b(@Nullable emo $$0) {
      return $$0 != null && $$0.j && this.i($$0);
   }

   private boolean c(@Nullable emo $$0) {
      return $$0 != null && this.i($$0);
   }

   private boolean d(@Nullable emo $$0) {
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

   private eow.c a(eno $$0) {
      eow.c $$1 = $$0.a.a();
      $$1.a($$0.c, $$0x -> {
         this.ax.a($$0x);
         boolean $$1x = false;

         for (emo $$2 : this.ax) {
            if (this.j($$2)) {
               $$1x = true;
            }
         }

         this.aw = true;
         this.a(this.ax.a() ? els.d.b : els.d.c);
         this.E();
         if (!an && $$1x) {
            an = true;
            this.F();
         }
      });
      a(elx::c, $$0x -> {
         this.aF.clear();
         this.aF.addAll($$0x);
         this.E();
      });
      $$1.a($$0.e, $$0x -> {
         this.ay = $$0x;
         this.D();
         if (this.ay > 0 && this.ao.tryAcquire(1)) {
            this.f.aU().c(te.a("mco.configure.world.invite.narration", this.ay));
         }
      });
      $$1.a($$0.f, $$0x -> this.aA = $$0x);
      $$1.a($$0.d, $$0x -> {
         for (ems $$1x : $$0x.a) {
            for (emo $$2 : this.ax) {
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

   private static <T> void a(els.h<T> $$0, Consumer<T> $$1) {
      eqn $$2 = eqn.N();
      CompletableFuture.<T>supplyAsync(() -> {
         try {
            return $$0.request(elx.a($$2));
         } catch (enk var3) {
            throw new RuntimeException(var3);
         }
      }).thenAcceptAsync($$1, $$2).exceptionally($$0x -> {
         D.error("Failed to execute call to Realms Service", $$0x);
         return null;
      });
   }

   private void E() {
      emo $$0 = this.H();
      this.av.v();
      List<UUID> $$1 = new ArrayList<>();

      for (emn $$2 : this.aF) {
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

      for (emo $$3 : this.ax) {
         els.i $$4 = new els.i($$3);
         this.av.a($$4);
         if ($$0 != null && $$0.a == $$3.a) {
            this.av.a((els.c)$$4);
         }
      }

      this.D();
   }

   private void a(els.g $$0, emn $$1) {
      if ($$1 instanceof emn.a $$2) {
         $$0.a(new els.f($$2.d(), $$2));
         $$0.a(new els.a($$2.a(this)));
      }
   }

   private void F() {
      new Thread(() -> {
         List<emy> $$0 = elw.a();
         elx $$1 = elx.a();
         emj $$2 = new emj();
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

      for (emo $$1 : this.ax) {
         if (this.j($$1)) {
            $$0.add($$1.a);
         }
      }

      return $$0;
   }

   private void e(@Nullable emo $$0) {
      if ($$0 != null) {
         String $$1 = aql.a($$0.b, this.f.U().b(), $$0.k);
         this.f.o.a($$1);
         ac.i().a($$1);
      }
   }

   private void f(@Nullable emo $$0) {
      if ($$0 != null && this.f.b($$0.g)) {
         this.f.a(new eny(this, $$0.a));
      }
   }

   private void g(@Nullable emo $$0) {
      if ($$0 != null && !this.f.b($$0.g)) {
         te $$1 = te.c("mco.configure.world.leave.question.line1");
         te $$2 = te.c("mco.configure.world.leave.question.line2");
         this.f.a(new eoe($$1x -> this.a($$1x, $$0), eoe.a.b, $$1, $$2, true));
      }
   }

   @Nullable
   private emo H() {
      if (this.av == null) {
         return null;
      } else {
         els.c $$0 = this.av.f();
         return $$0 != null ? $$0.b() : null;
      }
   }

   private void a(boolean $$0, final emo $$1) {
      if ($$0) {
         (new Thread("Realms-leave-server") {
            @Override
            public void run() {
               try {
                  elx $$0 = elx.a();
                  $$0.d($$1.a);
                  els.this.f.execute(() -> els.this.h($$1));
               } catch (enk var2) {
                  els.D.error("Couldn't configure world", var2);
                  els.this.f.execute(() -> els.this.f.a(new eoc(var2, els.this)));
               }
            }
         }).start();
      }

      this.f.a(this);
   }

   void h(emo $$0) {
      this.ax.a($$0);
      this.av.i().removeIf($$1 -> {
         emo $$2 = $$1.b();
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
   public te e() {
      return (te)(this.aJ == els.d.a ? td.a(super.e(), H) : super.e());
   }

   @Override
   public void a(erx $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.aA && this.aG.i) {
         eok.a($$0, this.aG);
      }

      switch (elx.a) {
         case b:
            this.a($$0, "STAGE!", -256);
            break;
         case c:
            this.a($$0, "LOCAL!", 8388479);
      }
   }

   private void I() {
      this.f.a(new eok(this, this.aA));
   }

   public void a(@Nullable emo $$0, exv $$1) {
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

         this.f.a(new eof($$1, new epm(this, $$1, $$0, this.aE)));
      }
   }

   boolean i(emo $$0) {
      return this.f.b($$0.g);
   }

   private boolean j(emo $$0) {
      return this.i($$0) && !$$0.j;
   }

   void a(erx $$0, int $$1, int $$2, int $$3, int $$4) {
      $$0.a(c, $$1, $$2, 10, 28);
      if ($$3 >= $$1 && $$3 <= $$1 + 9 && $$4 >= $$2 && $$4 <= $$2 + 27 && $$4 < this.h - 40 && $$4 > 32) {
         this.d(Q);
      }
   }

   void a(erx $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
      $$0.a(y, $$1, $$2, 10, 28);
      if ($$3 >= $$1 && $$3 <= $$1 + 9 && $$4 >= $$2 && $$4 <= $$2 + 27 && $$4 < this.h - 40 && $$4 > 32) {
         if ($$5 <= 0) {
            this.d(R);
         } else if ($$5 == 1) {
            this.d(S);
         } else {
            this.d(te.a("mco.selectServer.expires.days", $$5));
         }
      }
   }

   void b(erx $$0, int $$1, int $$2, int $$3, int $$4) {
      $$0.a(z, $$1, $$2, 10, 28);
      if ($$3 >= $$1 && $$3 <= $$1 + 9 && $$4 >= $$2 && $$4 <= $$2 + 27 && $$4 < this.h - 40 && $$4 > 32) {
         this.d(T);
      }
   }

   void c(erx $$0, int $$1, int $$2, int $$3, int $$4) {
      $$0.a(A, $$1, $$2, 10, 28);
      if ($$3 >= $$1 && $$3 <= $$1 + 9 && $$4 >= $$2 && $$4 <= $$2 + 27 && $$4 < this.h - 40 && $$4 > 32) {
         this.d(U);
      }
   }

   private void a(erx $$0, String $$1, int $$2) {
      $$0.c().a();
      $$0.c().a((float)(this.g / 2 - 25), 20.0F, 0.0F);
      $$0.c().a(a.f.rotationDegrees(-20.0F));
      $$0.c().b(1.5F, 1.5F, 1.5F);
      $$0.a(this.i, $$1, 0, 0, $$2, false);
      $$0.c().b();
   }

   public els f() {
      els $$0 = new els(this.ap);
      $$0.b(this.f, this.g, this.h);
      return $$0;
   }

   class a extends els.c {
      private final esi c;
      private final int d = els.this.g / 2 - 75;

      public a(esi $$0) {
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
      public void a(erx $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.c.b(this.d, $$2 + 4);
         this.c.a($$0, $$6, $$7, $$9);
      }

      @Override
      public te a() {
         return this.c.l();
      }
   }

   static class b extends esu {
      private static final ett b = new ett(new aep("widget/cross_button"), new aep("widget/cross_button_highlighted"));

      protected b(esi.c $$0, te $$1) {
         super(0, 0, 14, 14, b, $$0);
         this.a(etr.a($$1));
      }
   }

   abstract class c extends ete.a<els.c> {
      @Nullable
      public emo b() {
         return null;
      }
   }

   static enum d {
      a,
      b,
      c;
   }

   static class e extends etl.b {
      private static final aep[] d = new aep[]{
         new aep("notification/1"),
         new aep("notification/2"),
         new aep("notification/3"),
         new aep("notification/4"),
         new aep("notification/5"),
         new aep("notification/more")
      };
      private static final int s = Integer.MAX_VALUE;
      private static final int t = 20;
      private static final int u = 14;
      private int v;

      public e(te $$0, aep $$1, esi.c $$2) {
         super(20, 20, $$0, 14, 14, $$1, $$2);
      }

      public void a(int $$0) {
         this.v = $$0;
      }

      @Override
      public void b(erx $$0, int $$1, int $$2, float $$3) {
         super.b($$0, $$1, $$2, $$3);
         if (this.i && this.v != 0) {
            this.a($$0);
         }
      }

      private void a(erx $$0) {
         $$0.a(d[Math.min(this.v, 6) - 1], this.p() + this.k() - 5, this.r() - 3, 8, 8);
      }
   }

   class f extends els.c {
      private static final int c = 40;
      private static final int d = 36;
      private static final int e = -12303292;
      private final te f;
      private final List<esg> g = new ArrayList<>();
      @Nullable
      private final els.b h;
      private final etc i;
      private final evj j;
      private final evi k;
      private int l = -1;

      public f(te $$0, emn $$1) {
         this.f = $$0;
         this.j = new evj();
         int $$2 = 7;
         this.j.a(esv.a(20, 20, els.a), 0, 0, this.j.b().a(7, 7, 0, 0));
         this.j.a(evp.a(40), 0, 0);
         this.k = this.j.a(new evi(0, 9 * 3), 0, 1, this.j.b().c(7));
         this.i = this.k.a(new etc($$0, els.this.i).b(true).j(3), this.k.b().b().d());
         this.j.a(evp.a(40), 0, 2);
         if ($$1.b()) {
            this.h = this.j.a(new els.b($$1x -> els.this.a($$1.c()), te.c("mco.notification.dismiss")), 0, 2, this.j.b().c().a(0, 7, 7, 0));
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
      public void b(erx $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         super.b($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
         $$0.b($$3 - 2, $$2 - 2, $$4, 70, -12303292);
      }

      @Override
      public void a(erx $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
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
      public te a() {
         return this.f;
      }
   }

   class g extends gec<els.c> {
      public g() {
         super(els.this.g, els.this.h, 0, els.this.h, 36);
      }

      public void a(@Nullable els.c $$0) {
         super.a($$0);
         els.this.D();
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
      T request(elx var1) throws enk;
   }

   class i extends els.c {
      private static final int c = 36;
      private final emo d;

      public i(emo $$0) {
         this.d = $$0;
      }

      @Override
      public void a(erx $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a(this.d, $$0, $$3, $$2, $$6, $$7);
      }

      private void d() {
         els.this.f.ah().a(gbj.a(aou.yp, 1.0F));
         els.this.a(this.d, els.this);
      }

      private void e() {
         els.this.f.ah().a(gbj.a(aou.yp, 1.0F));
         eoa $$0 = new eoa(this.d, els.this);
         els.this.f.a($$0);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         if (this.d.e == emo.b.c) {
            this.e();
         } else if (els.this.a(this.d)) {
            if (ac.b() - els.this.aD < 250L && this.ax_()) {
               this.d();
            }

            els.this.aD = ac.b();
         }

         return true;
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         if (evy.a($$0)) {
            if (this.d.e == emo.b.c) {
               this.e();
               return true;
            }

            if (els.this.a(this.d)) {
               this.d();
               return true;
            }
         }

         return super.a($$0, $$1, $$2);
      }

      private void a(emo $$0, erx $$1, int $$2, int $$3, int $$4, int $$5) {
         this.b($$0, $$1, $$2 + 36, $$3, $$4, $$5);
      }

      private void b(emo $$0, erx $$1, int $$2, int $$3, int $$4, int $$5) {
         if ($$0.e == emo.b.c) {
            $$1.a(els.b, $$2 + 10, $$3 + 6, 40, 20);
            float $$6 = 0.5F + (1.0F + aro.a((float)els.this.az * 0.25F)) * 0.25F;
            int $$7 = 0xFF000000 | (int)(127.0F * $$6) << 16 | (int)(255.0F * $$6) << 8 | (int)(127.0F * $$6);
            $$1.a(els.this.i, els.I, $$2 + 10 + 40 + 75, $$3 + 12, $$7);
         } else {
            int $$8 = 225;
            int $$9 = 2;
            this.a($$0, $$1, $$2, $$3, $$4, $$5, 225, 2);
            if (!"0".equals($$0.r.a)) {
               String $$10 = n.h + $$0.r.a;
               $$1.a(els.this.i, $$10, $$2 + 207 - els.this.i.b($$10), $$3 + 3, -8355712, false);
               if ($$4 >= $$2 + 207 - els.this.i.b($$10) && $$4 <= $$2 + 207 && $$5 >= $$3 + 1 && $$5 <= $$3 + 10 && $$5 < els.this.h - 40 && $$5 > 32) {
                  els.this.d(te.b($$0.r.b));
               }
            }

            if (els.this.i($$0) && $$0.j) {
               te $$11 = $$0.k ? els.L : els.J;
               int $$12 = $$3 + 11 + 5;
               $$1.a(els.this.i, $$11, $$2 + 2, $$12 + 1, 15553363, false);
            } else {
               if ($$0.m == emo.c.b) {
                  int $$13 = 13413468;
                  int $$14 = els.this.i.a(els.M);
                  $$1.a(els.this.i, els.M, $$2 + 2, $$3 + 12, 13413468, false);
                  $$1.a(els.this.i, $$0.c(), $$2 + 2 + $$14, $$3 + 12, 7105644, false);
               } else {
                  $$1.a(els.this.i, $$0.a(), $$2 + 2, $$3 + 12, 7105644, false);
               }

               if (!els.this.i($$0)) {
                  $$1.a(els.this.i, $$0.f, $$2 + 2, $$3 + 12 + 11, 5000268, false);
               }
            }

            $$1.a(els.this.i, $$0.b(), $$2 + 2, $$3 + 1, -1, false);
            epe.a($$1, $$2 - 36, $$3, 32, $$0.g);
         }
      }

      private void a(emo $$0, erx $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7) {
         int $$8 = $$2 + $$6 + 22;
         if ($$0.j) {
            els.this.a($$1, $$8, $$3 + $$7, $$4, $$5);
         } else if ($$0.e == emo.b.a) {
            els.this.c($$1, $$8, $$3 + $$7, $$4, $$5);
         } else if (els.this.i($$0) && $$0.l < 7) {
            els.this.a($$1, $$8, $$3 + $$7, $$4, $$5, $$0.l);
         } else if ($$0.e == emo.b.b) {
            els.this.b($$1, $$8, $$3 + $$7, $$4, $$5);
         }
      }

      @Override
      public te a() {
         return (te)(this.d.e == emo.b.c ? els.V : te.a("narrator.select", this.d.c));
      }

      @Nullable
      @Override
      public emo b() {
         return this.d;
      }
   }
}
