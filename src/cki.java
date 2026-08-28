import java.util.EnumSet;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public abstract class cki extends cjf {
   private static final akg<Byte> e = akk.a(cki.class, aki.a);
   protected int b;
   private cki.a bY = cki.a.a;

   protected cki(bsv<? extends cki> $$0, dbt $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(e, (byte)0);
   }

   @Override
   public void a(ur $$0) {
      super.a($$0);
      this.b = $$0.h("SpellTicks");
   }

   @Override
   public void b(ur $$0) {
      super.b($$0);
      $$0.a("SpellTicks", this.b);
   }

   @Override
   public cjf.a s() {
      if (this.gA()) {
         return cjf.a.c;
      } else {
         return this.gJ() ? cjf.a.g : cjf.a.a;
      }
   }

   public boolean gA() {
      return this.dP().B ? this.ao.a(e) > 0 : this.b > 0;
   }

   public void a(cki.a $$0) {
      this.bY = $$0;
      this.ao.a(e, (byte)$$0.h);
   }

   protected cki.a gB() {
      return !this.dP().B ? this.bY : cki.a.a(this.ao.a(e));
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
      if (this.dP().B && this.gA()) {
         cki.a $$0 = this.gB();
         float $$1 = (float)$$0.i[0];
         float $$2 = (float)$$0.i[1];
         float $$3 = (float)$$0.i[2];
         float $$4 = this.aY * (float) (Math.PI / 180.0) + ayu.b((float)this.ai * 0.6662F) * 0.25F;
         float $$5 = ayu.b($$4);
         float $$6 = ayu.a($$4);
         double $$7 = 0.6 * (double)this.ee();
         double $$8 = 1.8 * (double)this.ee();
         this.dP().a(lb.a(lj.u, $$1, $$2, $$3), this.du() + (double)$$5 * $$7, this.dw() + $$8, this.dA() + (double)$$6 * $$7, 0.0, 0.0, 0.0);
         this.dP().a(lb.a(lj.u, $$1, $$2, $$3), this.du() - (double)$$5 * $$7, this.dw() + $$8, this.dA() - (double)$$6 * $$7, 0.0, 0.0, 0.0);
      }
   }

   protected int gC() {
      return this.b;
   }

   protected abstract avv gq();

   protected static enum a {
      a(0, 0.0, 0.0, 0.0),
      b(1, 0.7, 0.7, 0.8),
      c(2, 0.4, 0.3, 0.35),
      d(3, 0.7, 0.5, 0.2),
      e(4, 0.3, 0.3, 0.8),
      f(5, 0.1, 0.1, 0.2);

      private static final IntFunction<cki.a> g = axl.a($$0 -> $$0.h, values(), axl.a.a);
      final int h;
      final double[] i;

      private a(final int $$0, final double $$1, final double $$2, final double $$3) {
         this.h = $$0;
         this.i = new double[]{$$1, $$2, $$3};
      }

      public static cki.a a(int $$0) {
         return g.apply($$0);
      }
   }

   protected class b extends cai {
      public b() {
         this.a(EnumSet.of(cai.a.a, cai.a.b));
      }

      @Override
      public boolean a() {
         return cki.this.gC() > 0;
      }

      @Override
      public void c() {
         super.c();
         cki.this.bR.n();
      }

      @Override
      public void d() {
         super.d();
         cki.this.a(cki.a.a);
      }

      @Override
      public void e() {
         if (cki.this.p() != null) {
            cki.this.G().a(cki.this.p(), (float)cki.this.ab(), (float)cki.this.aa());
         }
      }
   }

   protected abstract class c extends cai {
      protected int b;
      protected int c;

      @Override
      public boolean a() {
         btk $$0 = cki.this.p();
         if ($$0 == null || !$$0.bD()) {
            return false;
         } else {
            return cki.this.gA() ? false : cki.this.ai >= this.c;
         }
      }

      @Override
      public boolean b() {
         btk $$0 = cki.this.p();
         return $$0 != null && $$0.bD() && this.b > 0;
      }

      @Override
      public void c() {
         this.b = this.a(this.n());
         cki.this.b = this.h();
         this.c = cki.this.ai + this.i();
         avv $$0 = this.l();
         if ($$0 != null) {
            cki.this.a($$0, 1.0F, 1.0F);
         }

         cki.this.a(this.m());
      }

      @Override
      public void e() {
         this.b--;
         if (this.b == 0) {
            this.k();
            cki.this.a(cki.this.gq(), 1.0F, 1.0F);
         }
      }

      protected abstract void k();

      protected int n() {
         return 20;
      }

      protected abstract int h();

      protected abstract int i();

      @Nullable
      protected abstract avv l();

      protected abstract cki.a m();
   }
}
