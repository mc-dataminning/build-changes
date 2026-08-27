import java.util.EnumSet;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public abstract class ccj extends cbh {
   private static final afz<Byte> e = agc.a(ccj.class, agb.a);
   protected int b;
   private ccj.a bT = ccj.a.a;

   protected ccj(blj<? extends ccj> $$0, csy $$1) {
      super($$0, $$1);
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(e, (byte)0);
   }

   @Override
   public void a(sj $$0) {
      super.a($$0);
      this.b = $$0.h("SpellTicks");
   }

   @Override
   public void b(sj $$0) {
      super.b($$0);
      $$0.a("SpellTicks", this.b);
   }

   @Override
   public cbh.a u() {
      if (this.go()) {
         return cbh.a.c;
      } else {
         return this.gv() ? cbh.a.g : cbh.a.a;
      }
   }

   public boolean go() {
      return this.dM().B ? this.an.b(e) > 0 : this.b > 0;
   }

   public void a(ccj.a $$0) {
      this.bT = $$0;
      this.an.b(e, (byte)$$0.h);
   }

   protected ccj.a gp() {
      return !this.dM().B ? this.bT : ccj.a.a(this.an.b(e));
   }

   @Override
   protected void Z() {
      super.Z();
      if (this.b > 0) {
         this.b--;
      }
   }

   @Override
   public void l() {
      super.l();
      if (this.dM().B && this.go()) {
         ccj.a $$0 = this.gp();
         double $$1 = $$0.i[0];
         double $$2 = $$0.i[1];
         double $$3 = $$0.i[2];
         float $$4 = this.aU * (float) (Math.PI / 180.0) + aty.b((float)this.ah * 0.6662F) * 0.25F;
         float $$5 = aty.b($$4);
         float $$6 = aty.a($$4);
         this.dM().a(jv.v, this.dr() + (double)$$5 * 0.6, this.dt() + 1.8, this.dx() + (double)$$6 * 0.6, $$1, $$2, $$3);
         this.dM().a(jv.v, this.dr() - (double)$$5 * 0.6, this.dt() + 1.8, this.dx() - (double)$$6 * 0.6, $$1, $$2, $$3);
      }
   }

   protected int gq() {
      return this.b;
   }

   protected abstract arb ge();

   protected static enum a {
      a(0, 0.0, 0.0, 0.0),
      b(1, 0.7, 0.7, 0.8),
      c(2, 0.4, 0.3, 0.35),
      d(3, 0.7, 0.5, 0.2),
      e(4, 0.3, 0.3, 0.8),
      f(5, 0.1, 0.1, 0.2);

      private static final IntFunction<ccj.a> g = asq.a($$0 -> $$0.h, values(), asq.a.a);
      final int h;
      final double[] i;

      private a(int $$0, double $$1, double $$2, double $$3) {
         this.h = $$0;
         this.i = new double[]{$$1, $$2, $$3};
      }

      public static ccj.a a(int $$0) {
         return g.apply($$0);
      }
   }

   protected class b extends bsr {
      public b() {
         this.a(EnumSet.of(bsr.a.a, bsr.a.b));
      }

      @Override
      public boolean a() {
         return ccj.this.gq() > 0;
      }

      @Override
      public void c() {
         super.c();
         ccj.this.bN.n();
      }

      @Override
      public void d() {
         super.d();
         ccj.this.a(ccj.a.a);
      }

      @Override
      public void e() {
         if (ccj.this.q() != null) {
            ccj.this.I().a(ccj.this.q(), (float)ccj.this.ab(), (float)ccj.this.aa());
         }
      }
   }

   protected abstract class c extends bsr {
      protected int b;
      protected int c;

      @Override
      public boolean a() {
         blv $$0 = ccj.this.q();
         if ($$0 == null || !$$0.bx()) {
            return false;
         } else {
            return ccj.this.go() ? false : ccj.this.ah >= this.c;
         }
      }

      @Override
      public boolean b() {
         blv $$0 = ccj.this.q();
         return $$0 != null && $$0.bx() && this.b > 0;
      }

      @Override
      public void c() {
         this.b = this.a(this.n());
         ccj.this.b = this.h();
         this.c = ccj.this.ah + this.i();
         arb $$0 = this.l();
         if ($$0 != null) {
            ccj.this.a($$0, 1.0F, 1.0F);
         }

         ccj.this.a(this.m());
      }

      @Override
      public void e() {
         this.b--;
         if (this.b == 0) {
            this.k();
            ccj.this.a(ccj.this.ge(), 1.0F, 1.0F);
         }
      }

      protected abstract void k();

      protected int n() {
         return 20;
      }

      protected abstract int h();

      protected abstract int i();

      @Nullable
      protected abstract arb l();

      protected abstract ccj.a m();
   }
}
