import java.util.EnumSet;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public abstract class cjm extends cij {
   private static final ajr<Byte> e = ajv.a(cjm.class, ajt.a);
   protected int b;
   private cjm.a bY = cjm.a.a;

   protected cjm(bsa<? extends cjm> $$0, dax $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(ajv.a $$0) {
      super.a($$0);
      $$0.a(e, (byte)0);
   }

   @Override
   public void a(ud $$0) {
      super.a($$0);
      this.b = $$0.h("SpellTicks");
   }

   @Override
   public void b(ud $$0) {
      super.b($$0);
      $$0.a("SpellTicks", this.b);
   }

   @Override
   public cij.a s() {
      if (this.gz()) {
         return cij.a.c;
      } else {
         return this.gI() ? cij.a.g : cij.a.a;
      }
   }

   public boolean gz() {
      return this.dP().B ? this.ao.a(e) > 0 : this.b > 0;
   }

   public void a(cjm.a $$0) {
      this.bY = $$0;
      this.ao.a(e, (byte)$$0.h);
   }

   protected cjm.a gA() {
      return !this.dP().B ? this.bY : cjm.a.a(this.ao.a(e));
   }

   @Override
   protected void Y() {
      super.Y();
      if (this.b > 0) {
         this.b--;
      }
   }

   @Override
   public void l() {
      super.l();
      if (this.dP().B && this.gz()) {
         cjm.a $$0 = this.gA();
         float $$1 = (float)$$0.i[0];
         float $$2 = (float)$$0.i[1];
         float $$3 = (float)$$0.i[2];
         float $$4 = this.aZ * (float) (Math.PI / 180.0) + ayd.b((float)this.ai * 0.6662F) * 0.25F;
         float $$5 = ayd.b($$4);
         float $$6 = ayd.a($$4);
         double $$7 = 0.6 * (double)this.ee();
         double $$8 = 1.8 * (double)this.ee();
         this.dP().a(kq.a(ky.u, $$1, $$2, $$3), this.du() + (double)$$5 * $$7, this.dw() + $$8, this.dA() + (double)$$6 * $$7, 0.0, 0.0, 0.0);
         this.dP().a(kq.a(ky.u, $$1, $$2, $$3), this.du() - (double)$$5 * $$7, this.dw() + $$8, this.dA() - (double)$$6 * $$7, 0.0, 0.0, 0.0);
      }
   }

   protected int gB() {
      return this.b;
   }

   protected abstract avg gp();

   protected static enum a {
      a(0, 0.0, 0.0, 0.0),
      b(1, 0.7, 0.7, 0.8),
      c(2, 0.4, 0.3, 0.35),
      d(3, 0.7, 0.5, 0.2),
      e(4, 0.3, 0.3, 0.8),
      f(5, 0.1, 0.1, 0.2);

      private static final IntFunction<cjm.a> g = awv.a($$0 -> $$0.h, values(), awv.a.a);
      final int h;
      final double[] i;

      private a(int $$0, double $$1, double $$2, double $$3) {
         this.h = $$0;
         this.i = new double[]{$$1, $$2, $$3};
      }

      public static cjm.a a(int $$0) {
         return g.apply($$0);
      }
   }

   protected class b extends bzm {
      public b() {
         this.a(EnumSet.of(bzm.a.a, bzm.a.b));
      }

      @Override
      public boolean a() {
         return cjm.this.gB() > 0;
      }

      @Override
      public void c() {
         super.c();
         cjm.this.bR.n();
      }

      @Override
      public void d() {
         super.d();
         cjm.this.a(cjm.a.a);
      }

      @Override
      public void e() {
         if (cjm.this.p() != null) {
            cjm.this.G().a(cjm.this.p(), (float)cjm.this.aa(), (float)cjm.this.Z());
         }
      }
   }

   protected abstract class c extends bzm {
      protected int b;
      protected int c;

      @Override
      public boolean a() {
         bso $$0 = cjm.this.p();
         if ($$0 == null || !$$0.bD()) {
            return false;
         } else {
            return cjm.this.gz() ? false : cjm.this.ai >= this.c;
         }
      }

      @Override
      public boolean b() {
         bso $$0 = cjm.this.p();
         return $$0 != null && $$0.bD() && this.b > 0;
      }

      @Override
      public void c() {
         this.b = this.a(this.n());
         cjm.this.b = this.h();
         this.c = cjm.this.ai + this.i();
         avg $$0 = this.l();
         if ($$0 != null) {
            cjm.this.a($$0, 1.0F, 1.0F);
         }

         cjm.this.a(this.m());
      }

      @Override
      public void e() {
         this.b--;
         if (this.b == 0) {
            this.k();
            cjm.this.a(cjm.this.gp(), 1.0F, 1.0F);
         }
      }

      protected abstract void k();

      protected int n() {
         return 20;
      }

      protected abstract int h();

      protected abstract int i();

      @Nullable
      protected abstract avg l();

      protected abstract cjm.a m();
   }
}
