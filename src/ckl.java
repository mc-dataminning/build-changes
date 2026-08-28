import java.util.EnumSet;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public abstract class ckl extends cji {
   private static final akj<Byte> e = akn.a(ckl.class, akl.a);
   protected int b;
   private ckl.a bY = ckl.a.a;

   protected ckl(bsy<? extends ckl> $$0, dbw $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(akn.a $$0) {
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
   public cji.a s() {
      if (this.gA()) {
         return cji.a.c;
      } else {
         return this.gJ() ? cji.a.g : cji.a.a;
      }
   }

   public boolean gA() {
      return this.dP().B ? this.ao.a(e) > 0 : this.b > 0;
   }

   public void a(ckl.a $$0) {
      this.bY = $$0;
      this.ao.a(e, (byte)$$0.h);
   }

   protected ckl.a gB() {
      return !this.dP().B ? this.bY : ckl.a.a(this.ao.a(e));
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
         ckl.a $$0 = this.gB();
         float $$1 = (float)$$0.i[0];
         float $$2 = (float)$$0.i[1];
         float $$3 = (float)$$0.i[2];
         float $$4 = this.aY * (float) (Math.PI / 180.0) + ayx.b((float)this.ai * 0.6662F) * 0.25F;
         float $$5 = ayx.b($$4);
         float $$6 = ayx.a($$4);
         double $$7 = 0.6 * (double)this.ee();
         double $$8 = 1.8 * (double)this.ee();
         this.dP().a(lb.a(li.u, $$1, $$2, $$3), this.du() + (double)$$5 * $$7, this.dw() + $$8, this.dA() + (double)$$6 * $$7, 0.0, 0.0, 0.0);
         this.dP().a(lb.a(li.u, $$1, $$2, $$3), this.du() - (double)$$5 * $$7, this.dw() + $$8, this.dA() - (double)$$6 * $$7, 0.0, 0.0, 0.0);
      }
   }

   protected int gC() {
      return this.b;
   }

   protected abstract avy gq();

   protected static enum a {
      a(0, 0.0, 0.0, 0.0),
      b(1, 0.7, 0.7, 0.8),
      c(2, 0.4, 0.3, 0.35),
      d(3, 0.7, 0.5, 0.2),
      e(4, 0.3, 0.3, 0.8),
      f(5, 0.1, 0.1, 0.2);

      private static final IntFunction<ckl.a> g = axo.a($$0 -> $$0.h, values(), axo.a.a);
      final int h;
      final double[] i;

      private a(final int $$0, final double $$1, final double $$2, final double $$3) {
         this.h = $$0;
         this.i = new double[]{$$1, $$2, $$3};
      }

      public static ckl.a a(int $$0) {
         return g.apply($$0);
      }
   }

   protected class b extends cal {
      public b() {
         this.a(EnumSet.of(cal.a.a, cal.a.b));
      }

      @Override
      public boolean a() {
         return ckl.this.gC() > 0;
      }

      @Override
      public void c() {
         super.c();
         ckl.this.bR.n();
      }

      @Override
      public void d() {
         super.d();
         ckl.this.a(ckl.a.a);
      }

      @Override
      public void e() {
         if (ckl.this.p() != null) {
            ckl.this.G().a(ckl.this.p(), (float)ckl.this.ab(), (float)ckl.this.aa());
         }
      }
   }

   protected abstract class c extends cal {
      protected int b;
      protected int c;

      @Override
      public boolean a() {
         btn $$0 = ckl.this.p();
         if ($$0 == null || !$$0.bD()) {
            return false;
         } else {
            return ckl.this.gA() ? false : ckl.this.ai >= this.c;
         }
      }

      @Override
      public boolean b() {
         btn $$0 = ckl.this.p();
         return $$0 != null && $$0.bD() && this.b > 0;
      }

      @Override
      public void c() {
         this.b = this.a(this.n());
         ckl.this.b = this.h();
         this.c = ckl.this.ai + this.i();
         avy $$0 = this.l();
         if ($$0 != null) {
            ckl.this.a($$0, 1.0F, 1.0F);
         }

         ckl.this.a(this.m());
      }

      @Override
      public void e() {
         this.b--;
         if (this.b == 0) {
            this.k();
            ckl.this.a(ckl.this.gq(), 1.0F, 1.0F);
         }
      }

      protected abstract void k();

      protected int n() {
         return 20;
      }

      protected abstract int h();

      protected abstract int i();

      @Nullable
      protected abstract avy l();

      protected abstract ckl.a m();
   }
}
