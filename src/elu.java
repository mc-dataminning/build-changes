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
import org.slf4j.Logger;

public class elu extends gex {
   static final aez a = new aez("icon/info");
   static final aez b = new aez("icon/new_realm");
   static final aez c = new aez("realm_status/expired");
   static final aez y = new aez("realm_status/expires_soon");
   static final aez z = new aez("realm_status/open");
   static final aez A = new aez("realm_status/closed");
   private static final aez B = new aez("icon/invite");
   private static final aez C = new aez("icon/news");
   static final Logger D = LogUtils.getLogger();
   private static final aez E = new aez("textures/gui/title/realms.png");
   private static final aez F = new aez("textures/gui/realms/no_realms.png");
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
   private static final etv X = etv.a(tl.c("mco.invites.nopending"));
   private static final etv Y = etv.a(tl.c("mco.invites.pending"));
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
   private final CompletableFuture<elt.a> am = elt.a();
   @Nullable
   private eoy.c an;
   private final Set<UUID> ao = new HashSet<>();
   private static boolean ap;
   private final RateLimiter aq;
   private final eye ar;
   private esk as;
   private esk at;
   private esk au;
   private esk av;
   private esk aw;
   private elu.h ax;
   private enr ay;
   private volatile boolean az;
   @Nullable
   private volatile String aA;
   long aB;
   private final List<emp> aC = new ArrayList<>();
   private esk aD;
   private elu.f aE;
   private elu.f aF;
   private elu.e aG;
   @Nullable
   private evu aH;

   public elu(eye $$0) {
      super(G);
      this.ar = $$0;
      this.aq = RateLimiter.create(0.016666668F);
   }

   @Override
   public void aH_() {
      this.ay = new enr(this.f);
      this.ax = this.d(new elu.h());
      tl $$0 = tl.c("mco.invites.title");
      this.aE = new elu.f($$0, B, $$1x -> this.f.a(new eok(this, $$0)));
      tl $$1 = tl.c("mco.news");
      this.aF = new elu.f($$1, C, $$0x -> {
         if (this.aA != null) {
            ewx.a(this.aA, this, true);
            if (this.aF.a() != 0) {
               epe.a $$1x = epe.b();
               $$1x.b = false;
               epe.b($$1x);
               this.aF.a(0);
            }
         }
      });
      this.aF.a(etv.a($$1));
      this.as = esk.a(N, $$0x -> a(this.J(), this)).a(100).a();
      this.av = esk.a(P, $$0x -> this.f(this.J())).a(100).a();
      this.au = esk.a(K, $$0x -> this.e(this.J())).a(100).a();
      this.aw = esk.a(O, $$0x -> this.g(this.J())).a(100).a();
      this.aD = esk.a(tl.c("mco.selectServer.purchase"), $$0x -> this.K()).b(100, 20).a();
      this.at = esk.a(tk.k, $$0x -> this.f.a(this.ar)).a(100).a();
      this.a(elu.e.a);
      this.F();
      this.am.thenAcceptAsync($$0x -> {
         eye $$1x = $$0x.a(this.ar);
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

   private void a(elu.e $$0) {
      if (this.aG != $$0) {
         if (this.aH != null) {
            this.aH.a($$1 -> this.f($$1));
         }

         this.aH = this.b($$0);
         this.aG = $$0;
         this.aH.a($$1 -> {
            esi var10000 = this.d($$1);
         });
         this.b();
      }
   }

   private evu b(elu.e $$0) {
      evu $$1 = new evu(this);
      $$1.b(44);
      $$1.a(this.D());
      evv $$2 = this.c($$0);
      $$2.a();
      $$1.a($$2.i() + 20);
      $$1.b($$2);
      switch ($$0) {
         case a:
            $$1.c(new esz(this.i, H));
            break;
         case b:
            $$1.c(this.E());
      }

      return $$1;
   }

   private evv D() {
      int $$0 = 90;
      evy $$1 = evy.e().a(4);
      $$1.c().e();
      $$1.a(this.aE);
      $$1.a(this.aF);
      evy $$2 = evy.e();
      $$2.c().e();
      $$2.a(evz.a(90));
      $$2.a(esx.a(128, 34, E, 128, 64), evx::b);
      $$2.a(new evs(90, 44)).a($$1, evx::c);
      return $$2;
   }

   private evv c(elu.e $$0) {
      evt $$1 = new evt().c(4);
      evt.b $$2 = $$1.d(3);
      if ($$0 == elu.e.c) {
         $$2.a(this.as);
         $$2.a(this.av);
         $$2.a(this.au);
         $$2.a(this.aw);
      }

      $$2.a(this.aD);
      $$2.a(this.at);
      return $$1;
   }

   private evy E() {
      evy $$0 = evy.d().a(10);
      $$0.c().b();
      $$0.a(esx.a(130, 64, F, 130, 64));
      esv $$1 = new esv(308, W, this.i, false);
      $$0.a($$1);
      return $$0;
   }

   void F() {
      emq $$0 = this.J();
      this.aD.i = this.aG != elu.e.a;
      this.as.i = this.a($$0);
      this.au.i = this.b($$0);
      this.aw.i = this.d($$0);
      this.av.i = this.c($$0);
   }

   boolean a(@Nullable emq $$0) {
      return $$0 != null && !$$0.j && $$0.e == emq.b.b;
   }

   private boolean b(@Nullable emq $$0) {
      return $$0 != null && $$0.j && this.i($$0);
   }

   private boolean c(@Nullable emq $$0) {
      return $$0 != null && this.i($$0);
   }

   private boolean d(@Nullable emq $$0) {
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
      eqp.O().aY().d.a();
   }

   public void e() {
      eqp.O().aY().c.a();
   }

   private eoy.c a(enp $$0) {
      eoy.c $$1 = $$0.a.a();
      $$1.a($$0.c, $$0x -> {
         this.ay.a($$0x);
         this.a(this.ay.a() && this.aC.isEmpty() ? elu.e.b : elu.e.c);
         this.G();
         boolean $$1x = false;

         for (emq $$2 : this.ay) {
            if (this.j($$2)) {
               $$1x = true;
            }
         }

         if (!ap && $$1x) {
            ap = true;
            this.H();
         }
      });
      a(elz::c, $$0x -> {
         this.aC.clear();
         this.aC.addAll($$0x);

         for (emp $$1x : $$0x) {
            if ($$1x instanceof emp.a $$2) {
               etm $$3 = $$2.a(this, this::a);
               if ($$3 != null) {
                  this.f.a($$3);
                  this.a(List.of($$1x));
                  break;
               }
            }
         }

         if (!this.aC.isEmpty() && this.aG != elu.e.a) {
            this.a(elu.e.c);
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

   private void a(Collection<emp> $$0) {
      List<UUID> $$1 = new ArrayList<>($$0.size());

      for (emp $$2 : $$0) {
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

   private static <T> void a(elu.i<T> $$0, Consumer<T> $$1) {
      eqp $$2 = eqp.O();
      CompletableFuture.<T>supplyAsync(() -> {
         try {
            return $$0.request(elz.a($$2));
         } catch (enm var3) {
            throw new RuntimeException(var3);
         }
      }).thenAcceptAsync($$1, $$2).exceptionally($$0x -> {
         D.error("Failed to execute call to Realms Service", $$0x);
         return null;
      });
   }

   private void G() {
      emq $$0 = this.J();
      this.ax.w();

      for (emp $$1 : this.aC) {
         if (this.a($$1)) {
            this.a(List.of($$1));
            break;
         }
      }

      for (emq $$2 : this.ay) {
         elu.j $$3 = new elu.j($$2);
         this.ax.a($$3);
         if ($$0 != null && $$0.a == $$2.a) {
            this.ax.a((elu.d)$$3);
         }
      }

      this.F();
   }

   private boolean a(emp $$0) {
      if (!($$0 instanceof emp.c $$1)) {
         return false;
      } else {
         tl $$2 = $$1.d();
         int $$3 = this.i.b($$2, 216);
         int $$4 = asb.e($$3 + 7, 36) - 1;
         this.ax.a(new elu.g($$2, $$4 + 2, $$1));

         for (int $$5 = 0; $$5 < $$4; $$5++) {
            this.ax.a(new elu.c());
         }

         this.ax.a(new elu.a($$1.a(this)));
         return true;
      }
   }

   private void H() {
      new Thread(() -> {
         List<ena> $$0 = ely.a();
         elz $$1 = elz.a();
         eml $$2 = new eml();
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

      for (emq $$1 : this.ay) {
         if (this.j($$1)) {
            $$0.add($$1.a);
         }
      }

      return $$0;
   }

   private void e(@Nullable emq $$0) {
      if ($$0 != null) {
         String $$1 = aqy.a($$0.b, this.f.V().b(), $$0.k);
         this.f.o.a($$1);
         ac.i().a($$1);
      }
   }

   private void f(@Nullable emq $$0) {
      if ($$0 != null && this.f.b($$0.g)) {
         this.f.a(new enz(this, $$0.a));
      }
   }

   private void g(@Nullable emq $$0) {
      if ($$0 != null && !this.f.b($$0.g)) {
         tl $$1 = tl.c("mco.configure.world.leave.question.line1");
         tl $$2 = tl.c("mco.configure.world.leave.question.line2");
         this.f.a(new eof($$1x -> this.a($$1x, $$0), eof.a.b, $$1, $$2, true));
      }
   }

   @Nullable
   private emq J() {
      elu.d $$0 = this.ax.f();
      return $$0 != null ? $$0.b() : null;
   }

   private void a(boolean $$0, final emq $$1) {
      if ($$0) {
         (new Thread("Realms-leave-server") {
            @Override
            public void run() {
               try {
                  elz $$0 = elz.a();
                  $$0.d($$1.a);
                  elu.this.f.execute(() -> elu.this.h($$1));
               } catch (enm var2) {
                  elu.D.error("Couldn't configure world", var2);
                  elu.this.f.execute(() -> elu.this.f.a(new eod(var2, elu.this)));
               }
            }
         }).start();
      }

      this.f.a(this);
   }

   void h(emq $$0) {
      this.ay.a($$0);
      this.ax.i().removeIf($$1 -> {
         emq $$2 = $$1.b();
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
   public void a(erz $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.az && this.aD.i) {
         eom.a($$0, this.aD);
      }

      switch (elz.a) {
         case b:
            this.a($$0, "STAGE!", -256);
            break;
         case c:
            this.a($$0, "LOCAL!", 8388479);
      }
   }

   private void K() {
      this.f.a(new eom(this, this.az));
   }

   public static void a(@Nullable emq $$0, eye $$1) {
      if ($$0 != null) {
         eqp.O().a(new eog($$1, new epo($$1, $$0)));
      }
   }

   boolean i(emq $$0) {
      return this.f.b($$0.g);
   }

   private boolean j(emq $$0) {
      return this.i($$0) && !$$0.j;
   }

   private void a(erz $$0, String $$1, int $$2) {
      $$0.c().a();
      $$0.c().a((float)(this.g / 2 - 25), 20.0F, 0.0F);
      $$0.c().a(a.f.rotationDegrees(-20.0F));
      $$0.c().b(1.5F, 1.5F, 1.5F);
      $$0.a(this.i, $$1, 0, 0, $$2, false);
      $$0.c().b();
   }

   class a extends elu.d {
      private final esk c;

      public a(esk $$0) {
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
      public void a(erz $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.c.b(elu.this.g / 2 - 75, $$2 + 4);
         this.c.a($$0, $$6, $$7, $$9);
      }

      @Override
      public tl a() {
         return this.c.m();
      }
   }

   static class b extends esw {
      private static final etx b = new etx(new aez("widget/cross_button"), new aez("widget/cross_button_highlighted"));

      protected b(esk.c $$0, tl $$1) {
         super(0, 0, 14, 14, b, $$0);
         this.a(etv.a($$1));
      }
   }

   class c extends elu.d {
      @Override
      public void a(erz $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
      }

      @Override
      public tl a() {
         return tl.i();
      }
   }

   abstract class d extends etg.a<elu.d> {
      @Nullable
      public emq b() {
         return null;
      }
   }

   static enum e {
      a,
      b,
      c;
   }

   static class f extends etp.b {
      private static final aez[] d = new aez[]{
         new aez("notification/1"),
         new aez("notification/2"),
         new aez("notification/3"),
         new aez("notification/4"),
         new aez("notification/5"),
         new aez("notification/more")
      };
      private static final int s = Integer.MAX_VALUE;
      private static final int t = 20;
      private static final int u = 14;
      private int v;

      public f(tl $$0, aez $$1, esk.c $$2) {
         super(20, 20, $$0, 14, 14, $$1, $$2);
      }

      int a() {
         return this.v;
      }

      public void a(int $$0) {
         this.v = $$0;
      }

      @Override
      public void b(erz $$0, int $$1, int $$2, float $$3) {
         super.b($$0, $$1, $$2, $$3);
         if (this.i && this.v != 0) {
            this.a($$0);
         }
      }

      private void a(erz $$0) {
         $$0.a(d[Math.min(this.v, 6) - 1], this.r() + this.l() - 5, this.t() - 3, 8, 8);
      }
   }

   class g extends elu.d {
      private static final int c = 40;
      private static final int d = -12303292;
      private final tl e;
      private final int f;
      private final List<esi> g = new ArrayList<>();
      @Nullable
      private final elu.b h;
      private final ete i;
      private final evt j;
      private final evs k;
      private int l = -1;

      public g(tl $$0, int $$1, emp $$2) {
         this.e = $$0;
         this.f = $$1;
         this.j = new evt();
         int $$3 = 7;
         this.j.a(esx.a(20, 20, elu.a), 0, 0, this.j.b().a(7, 7, 0, 0));
         this.j.a(evz.a(40), 0, 0);
         this.k = this.j.a(new evs(0, 9 * 3 * ($$1 - 1)), 0, 1, this.j.b().c(7));
         this.i = this.k.a(new ete($$0, elu.this.i).b(true), this.k.b().b().d());
         this.j.a(evz.a(40), 0, 2);
         if ($$2.b()) {
            this.h = this.j.a(new elu.b($$1x -> elu.this.a($$2.c()), tl.c("mco.notification.dismiss")), 0, 2, this.j.b().c().a(0, 7, 7, 0));
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
      public void b(erz $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         super.b($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
         $$0.b($$3 - 2, $$2 - 2, $$4, 36 * this.f - 2, -12303292);
      }

      @Override
      public void a(erz $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
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

   class h extends gew<elu.d> {
      public h() {
         super(elu.this.g, elu.this.h, 0, elu.this.h, 36);
      }

      public void a(@Nullable elu.d $$0) {
         super.a($$0);
         elu.this.F();
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
      T request(elz var1) throws enm;
   }

   class j extends elu.d {
      private static final int c = 36;
      private final emq d;

      public j(emq $$0) {
         this.d = $$0;
      }

      @Override
      public void a(erz $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         if (this.d.e == emq.b.c) {
            $$0.a(elu.b, $$3 + 36 + 10, $$2 + 6, 40, 20);
            int $$10 = $$3 + 36 + 10 + 40 + 10;
            $$0.b(elu.this.i, elu.I, $$10, $$2 + 12, -1);
         } else {
            int $$11 = 225;
            int $$12 = 2;
            this.a(this.d, $$0, $$3 + 36, $$2, $$6, $$7, 225, 2);
            if (elu.this.i(this.d) && this.d.j) {
               tl $$13 = this.d.k ? elu.L : elu.J;
               int $$14 = $$2 + 11 + 5;
               $$0.a(elu.this.i, $$13, $$3 + 36 + 2, $$14 + 1, 15553363, false);
            } else {
               if (this.d.m == emq.c.b) {
                  int $$15 = 13413468;
                  int $$16 = elu.this.i.a(elu.M);
                  $$0.a(elu.this.i, elu.M, $$3 + 36 + 2, $$2 + 12, 13413468, false);
                  $$0.a(elu.this.i, this.d.c(), $$3 + 36 + 2 + $$16, $$2 + 12, 7105644, false);
               } else {
                  $$0.a(elu.this.i, this.d.a(), $$3 + 36 + 2, $$2 + 12, 7105644, false);
               }

               if (!elu.this.i(this.d)) {
                  $$0.a(elu.this.i, this.d.f, $$3 + 36 + 2, $$2 + 12 + 11, 5000268, false);
               }
            }

            $$0.a(elu.this.i, this.d.b(), $$3 + 36 + 2, $$2 + 1, -1, false);
            epg.a($$0, $$3 + 36 - 36, $$2, 32, this.d.g);
         }
      }

      private void d() {
         elu.this.f.ai().a(gcd.a(apg.yu, 1.0F));
         elu.a(this.d, elu.this);
      }

      private void e() {
         elu.this.f.ai().a(gcd.a(apg.yu, 1.0F));
         eob $$0 = new eob(this.d, elu.this);
         elu.this.f.a($$0);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         if (this.d.e == emq.b.c) {
            this.e();
         } else if (elu.this.a(this.d)) {
            if (ac.b() - elu.this.aB < 250L && this.aC_()) {
               this.d();
            }

            elu.this.aB = ac.b();
         }

         return true;
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         if (ewi.a($$0)) {
            if (this.d.e == emq.b.c) {
               this.e();
               return true;
            }

            if (elu.this.a(this.d)) {
               this.d();
               return true;
            }
         }

         return super.a($$0, $$1, $$2);
      }

      private void a(emq $$0, erz $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7) {
         int $$8 = $$2 + $$6 + 22;
         if ($$0.j) {
            this.a($$1, $$8, $$3 + $$7, $$4, $$5, elu.c, () -> elu.Q);
         } else if ($$0.e == emq.b.a) {
            this.a($$1, $$8, $$3 + $$7, $$4, $$5, elu.A, () -> elu.U);
         } else if (elu.this.i($$0) && $$0.l < 7) {
            this.a($$1, $$8, $$3 + $$7, $$4, $$5, elu.y, () -> {
               if ($$0.l <= 0) {
                  return elu.R;
               } else {
                  return (tl)($$0.l == 1 ? elu.S : tl.a("mco.selectServer.expires.days", $$0.l));
               }
            });
         } else if ($$0.e == emq.b.b) {
            this.a($$1, $$8, $$3 + $$7, $$4, $$5, elu.z, () -> elu.T);
         }
      }

      private void a(erz $$0, int $$1, int $$2, int $$3, int $$4, aez $$5, Supplier<tl> $$6) {
         $$0.a($$5, $$1, $$2, 10, 28);
         if ($$3 >= $$1 && $$3 <= $$1 + 9 && $$4 >= $$2 && $$4 <= $$2 + 27 && $$4 < elu.this.h - 40 && $$4 > 32) {
            elu.this.d($$6.get());
         }
      }

      @Override
      public tl a() {
         return (tl)(this.d.e == emq.b.c ? elu.V : tl.a("narrator.select", this.d.c));
      }

      @Nullable
      @Override
      public emq b() {
         return this.d;
      }
   }
}
