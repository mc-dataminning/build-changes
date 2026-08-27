import com.mojang.serialization.Codec;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class byw extends byc implements bnm<byw.g> {
   public static final double bU = 0.6;
   public static final double bV = 0.8;
   public static final double bX = 1.0;
   public static final double bY = 2.2;
   public static final double bZ = 1.4;
   private static final agn<Integer> cc = agq.a(byw.class, agp.b);
   private static final ahh cd = new ahh("killer_bunny");
   public static final int ca = 8;
   public static final int cb = 8;
   private static final int ce = 40;
   private int cf;
   private int cg;
   private boolean ch;
   private int ci;
   int cj;

   public byw(bmc<? extends byw> $$0, ctx $$1) {
      super($$0, $$1);
      this.bN = new byw.c(this);
      this.bM = new byw.d(this);
      this.i(0.0);
   }

   @Override
   protected void B() {
      this.bP.a(1, new bte(this));
      this.bP.a(1, new bsz(this, this.dL()));
      this.bP.a(1, new byw.e(this, 2.2));
      this.bP.a(2, new bsw(this, 0.8));
      this.bP.a(3, new bus(this, 1.0, cqh.a(cnj.ub, cnj.ug, cxa.bR), false));
      this.bP.a(4, new byw.a<>(this, cfq.class, 8.0F, 2.2, 2.2));
      this.bP.a(4, new byw.a<>(this, bzf.class, 10.0F, 2.2, 2.2));
      this.bP.a(4, new byw.a<>(this, ccw.class, 4.0F, 2.2, 2.2));
      this.bP.a(5, new byw.f(this));
      this.bP.a(6, new bux(this, 0.6));
      this.bP.a(11, new bts(this, cfq.class, 10.0F));
   }

   @Override
   protected float eZ() {
      float $$0 = 0.3F;
      if (this.P || this.bM.b() && this.bM.e() > this.ds() + 0.5) {
         $$0 = 0.5F;
      }

      efo $$1 = this.bO.j();
      if ($$1 != null && !$$1.c()) {
         emc $$2 = $$1.a(this);
         if ($$2.d > this.ds() + 0.5) {
            $$0 = 0.5F;
         }
      }

      if (this.bM.c() <= 0.6) {
         $$0 = 0.2F;
      }

      return $$0 + this.fa();
   }

   @Override
   protected void fb() {
      super.fb();
      double $$0 = this.bM.c();
      if ($$0 > 0.0) {
         double $$1 = this.do().i();
         if ($$1 < 0.01) {
            this.a(0.1F, new emc(0.0, 0.0, 1.0));
         }
      }

      if (!this.dL().B) {
         this.dL().a(this, (byte)1);
      }
   }

   public float D(float $$0) {
      return this.cg == 0 ? 0.0F : ((float)this.cf + $$0) / (float)this.cg;
   }

   public void i(double $$0) {
      this.N().a($$0);
      this.bM.a(this.bM.d(), this.bM.e(), this.bM.f(), $$0);
   }

   @Override
   public void r(boolean $$0) {
      super.r($$0);
      if ($$0) {
         this.a(this.A(), this.eW(), ((this.ag.i() - this.ag.i()) * 0.2F + 1.0F) * 0.8F);
      }
   }

   @Override
   public void u() {
      this.r(true);
      this.cg = 10;
      this.cf = 0;
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(cc, byw.g.a.j);
   }

   @Override
   public void aa() {
      if (this.ci > 0) {
         this.ci--;
      }

      if (this.cj > 0) {
         this.cj = this.cj - this.ag.a(3);
         if (this.cj < 0) {
            this.cj = 0;
         }
      }

      if (this.aC()) {
         if (!this.ch) {
            this.r(false);
            this.go();
         }

         if (this.gf() == byw.g.g && this.ci == 0) {
            bmo $$0 = this.q();
            if ($$0 != null && this.f((blw)$$0) < 16.0) {
               this.c($$0.dq(), $$0.dw());
               this.bM.a($$0.dq(), $$0.ds(), $$0.dw(), this.bM.c());
               this.u();
               this.ch = true;
            }
         }

         byw.c $$1 = (byw.c)this.bN;
         if (!$$1.c()) {
            if (this.bM.b() && this.ci == 0) {
               efo $$2 = this.bO.j();
               emc $$3 = new emc(this.bM.d(), this.bM.e(), this.bM.f());
               if ($$2 != null && !$$2.c()) {
                  $$3 = $$2.a(this);
               }

               this.c($$3.c, $$3.e);
               this.u();
            }
         } else if (!$$1.d()) {
            this.gl();
         }
      }

      this.ch = this.aC();
   }

   @Override
   public boolean bl() {
      return false;
   }

   private void c(double $$0, double $$1) {
      this.r((float)(aup.d($$1 - this.dw(), $$0 - this.dq()) * 180.0F / (float)Math.PI) - 90.0F);
   }

   private void gl() {
      ((byw.c)this.bN).a(true);
   }

   private void gm() {
      ((byw.c)this.bN).a(false);
   }

   private void gn() {
      if (this.bM.c() < 2.2) {
         this.ci = 10;
      } else {
         this.ci = 1;
      }
   }

   private void go() {
      this.gn();
      this.gm();
   }

   @Override
   public void d_() {
      super.d_();
      if (this.cf != this.cg) {
         this.cf++;
      } else if (this.cg != 0) {
         this.cf = 0;
         this.cg = 0;
         this.r(false);
      }
   }

   public static bnt.a w() {
      return bmq.C().a(bnu.n, 3.0).a(bnu.o, 0.3F);
   }

   @Override
   public void b(so $$0) {
      super.b($$0);
      $$0.a("RabbitType", this.gf().j);
      $$0.a("MoreCarrotTicks", this.cj);
   }

   @Override
   public void a(so $$0) {
      super.a($$0);
      this.a(byw.g.a($$0.h("RabbitType")));
      this.cj = $$0.h("MoreCarrotTicks");
   }

   protected ars A() {
      return art.ut;
   }

   @Override
   protected ars y() {
      return art.up;
   }

   @Override
   protected ars d(bkv $$0) {
      return art.us;
   }

   @Override
   protected ars n_() {
      return art.ur;
   }

   @Override
   public boolean B(blw $$0) {
      if (this.gf() == byw.g.g) {
         this.a(art.uq, 1.0F, (this.ag.i() - this.ag.i()) * 0.2F + 1.0F);
         return $$0.a(this.dM().b((bmo)this), 8.0F);
      } else {
         return $$0.a(this.dM().b((bmo)this), 3.0F);
      }
   }

   @Override
   public aru db() {
      return this.gf() == byw.g.g ? aru.f : aru.g;
   }

   private static boolean l(cng $$0) {
      return $$0.a(cnj.ub) || $$0.a(cnj.ug) || $$0.a(cxa.bR.j());
   }

   @Nullable
   public byw b(ane $$0, blr $$1) {
      byw $$2 = bmc.aE.a((ctx)$$0);
      if ($$2 != null) {
         byw.g $$3;
         $$3 = a($$0, this.dl());
         label16:
         if (this.ag.a(20) != 0) {
            if ($$1 instanceof byw $$4 && this.ag.h()) {
               $$3 = $$4.gf();
               break label16;
            }

            $$3 = this.gf();
         }

         $$2.a($$3);
      }

      return $$2;
   }

   @Override
   public boolean m(cng $$0) {
      return l($$0);
   }

   public byw.g gf() {
      return byw.g.a(this.an.b(cc));
   }

   public void a(byw.g $$0) {
      if ($$0 == byw.g.g) {
         this.f(bnu.a).a(8.0);
         this.bP.a(4, new btu(this, 1.4, true));
         this.bQ.a(1, new bvc(this).a());
         this.bQ.a(2, new bvd<>(this, cfq.class, true));
         this.bQ.a(2, new bvd<>(this, bzf.class, true));
         if (!this.ae()) {
            this.b(vg.c(ac.a("entity", cd)));
         }
      }

      this.an.b(cc, $$0.j);
   }

   @Nullable
   @Override
   public bnh a(cum $$0, bka $$1, bms $$2, @Nullable bnh $$3, @Nullable so $$4) {
      byw.g $$5 = a($$0, this.dl());
      if ($$3 instanceof byw.b) {
         $$5 = ((byw.b)$$3).a;
      } else {
         $$3 = new byw.b($$5);
      }

      this.a($$5);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   private static byw.g a(cty $$0, hx $$1) {
      ih<cuw> $$2 = $$0.t($$1);
      int $$3 = $$0.F_().a(100);
      if ($$2.a(ash.al)) {
         return $$3 < 80 ? byw.g.b : byw.g.d;
      } else if ($$2.a(ash.ak)) {
         return byw.g.e;
      } else {
         return $$3 < 50 ? byw.g.a : ($$3 < 90 ? byw.g.f : byw.g.c);
      }
   }

   public static boolean c(bmc<byw> $$0, cty $$1, bms $$2, hx $$3, auw $$4) {
      return $$1.a_($$3.d()).a(asi.bV) && a((cta)$$1, $$3);
   }

   boolean gp() {
      return this.cj <= 0;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 1) {
         this.bm();
         this.cg = 10;
         this.cf = 0;
      } else {
         super.b($$0);
      }
   }

   @Override
   public emc cJ() {
      return new emc(0.0, (double)(0.6F * this.cI()), (double)(this.dg() * 0.4F));
   }

   static class a<T extends bmo> extends bsr<T> {
      private final byw i;

      public a(byw $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4);
         this.i = $$0;
      }

      @Override
      public boolean a() {
         return this.i.gf() != byw.g.g && super.a();
      }
   }

   public static class b extends blr.a {
      public final byw.g a;

      public b(byw.g $$0) {
         super(1.0F);
         this.a = $$0;
      }
   }

   public static class c extends bsl {
      private final byw b;
      private boolean c;

      public c(byw $$0) {
         super($$0);
         this.b = $$0;
      }

      public boolean c() {
         return this.a;
      }

      public boolean d() {
         return this.c;
      }

      public void a(boolean $$0) {
         this.c = $$0;
      }

      @Override
      public void b() {
         if (this.a) {
            this.b.u();
            this.a = false;
         }
      }
   }

   static class d extends bsn {
      private final byw l;
      private double m;

      public d(byw $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.l.aC() && !this.l.bj && !((byw.c)this.l.bN).c()) {
            this.l.i(0.0);
         } else if (this.b()) {
            this.l.i(this.m);
         }

         super.a();
      }

      @Override
      public void a(double $$0, double $$1, double $$2, double $$3) {
         if (this.l.aZ()) {
            $$3 = 1.5;
         }

         super.a($$0, $$1, $$2, $$3);
         if ($$3 > 0.0) {
            this.m = $$3;
         }
      }
   }

   static class e extends bud {
      private final byw h;

      public e(byw $$0, double $$1) {
         super($$0, $$1);
         this.h = $$0;
      }

      @Override
      public void e() {
         super.e();
         this.h.i(this.c);
      }
   }

   static class f extends btx {
      private final byw g;
      private boolean h;
      private boolean i;

      public f(byw $$0) {
         super($$0, 0.7F, 16);
         this.g = $$0;
      }

      @Override
      public boolean a() {
         if (this.c <= 0) {
            if (!this.g.dL().Z().b(ctt.c)) {
               return false;
            }

            this.i = false;
            this.h = this.g.gp();
         }

         return super.a();
      }

      @Override
      public boolean b() {
         return this.i && super.b();
      }

      @Override
      public void e() {
         super.e();
         this.g.I().a((double)this.e.u() + 0.5, (double)(this.e.v() + 1), (double)this.e.w() + 0.5, 10.0F, (float)this.g.ab());
         if (this.m()) {
            ctx $$0 = this.g.dL();
            hx $$1 = this.e.c();
            djp $$2 = $$0.a_($$1);
            cwy $$3 = $$2.b();
            if (this.i && $$3 instanceof cxq) {
               int $$4 = $$2.c(cxq.f);
               if ($$4 == 0) {
                  $$0.a($$1, cxa.a.o(), 2);
                  $$0.a($$1, true, this.g);
               } else {
                  $$0.a($$1, $$2.a(cxq.f, Integer.valueOf($$4 - 1)), 2);
                  $$0.a(dnz.c, $$1, dnz.a.a(this.g));
                  $$0.c(2001, $$1, cwy.i($$2));
               }

               this.g.cj = 40;
            }

            this.i = false;
            this.c = 10;
         }
      }

      @Override
      protected boolean a(cua $$0, hx $$1) {
         djp $$2 = $$0.a_($$1);
         if ($$2.a(cxa.cC) && this.h && !this.i) {
            $$2 = $$0.a_($$1.c());
            if ($$2.b() instanceof cxq && ((cxq)$$2.b()).h($$2)) {
               this.i = true;
               return true;
            }
         }

         return false;
      }
   }

   public static enum g implements avl {
      a(0, "brown"),
      b(1, "white"),
      c(2, "black"),
      d(3, "white_splotched"),
      e(4, "gold"),
      f(5, "salt"),
      g(99, "evil");

      private static final IntFunction<byw.g> i = ath.a(byw.g::a, values(), a);
      public static final Codec<byw.g> h = avl.a(byw.g::values);
      final int j;
      private final String k;

      private g(int $$0, String $$1) {
         this.j = $$0;
         this.k = $$1;
      }

      @Override
      public String c() {
         return this.k;
      }

      public int a() {
         return this.j;
      }

      public static byw.g a(int $$0) {
         return i.apply($$0);
      }
   }
}
