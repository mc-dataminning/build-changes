import java.util.EnumSet;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public abstract class cix extends chu {
   private static final ajm<Byte> e = ajq.a(cix.class, ajo.a);
   protected int b;
   private cix.a bY = cix.a.a;

   protected cix(brn<? extends cix> $$0, dad $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(ajq.a $$0) {
      super.a($$0);
      $$0.a(e, (byte)0);
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.b = $$0.h("SpellTicks");
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("SpellTicks", this.b);
   }

   @Override
   public chu.a r() {
      if (this.gz()) {
         return chu.a.c;
      } else {
         return this.gG() ? chu.a.g : chu.a.a;
      }
   }

   public boolean gz() {
      return this.dN().B ? this.ao.a(e) > 0 : this.b > 0;
   }

   public void a(cix.a $$0) {
      this.bY = $$0;
      this.ao.a(e, (byte)$$0.h);
   }

   protected cix.a gA() {
      return !this.dN().B ? this.bY : cix.a.a(this.ao.a(e));
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
      if (this.dN().B && this.gz()) {
         cix.a $$0 = this.gA();
         float $$1 = (float)$$0.i[0];
         float $$2 = (float)$$0.i[1];
         float $$3 = (float)$$0.i[2];
         float $$4 = this.aZ * (float) (Math.PI / 180.0) + axz.b((float)this.ai * 0.6662F) * 0.25F;
         float $$5 = axz.b($$4);
         float $$6 = axz.a($$4);
         double $$7 = 0.6 * (double)this.ec();
         double $$8 = 1.8 * (double)this.ec();
         this.dN().a(kp.a(kx.u, $$1, $$2, $$3), this.ds() + (double)$$5 * $$7, this.du() + $$8, this.dy() + (double)$$6 * $$7, 0.0, 0.0, 0.0);
         this.dN().a(kp.a(kx.u, $$1, $$2, $$3), this.ds() - (double)$$5 * $$7, this.du() + $$8, this.dy() - (double)$$6 * $$7, 0.0, 0.0, 0.0);
      }
   }

   protected int gB() {
      return this.b;
   }

   protected abstract avb gp();

   protected static enum a {
      a(0, 0.0, 0.0, 0.0),
      b(1, 0.7, 0.7, 0.8),
      c(2, 0.4, 0.3, 0.35),
      d(3, 0.7, 0.5, 0.2),
      e(4, 0.3, 0.3, 0.8),
      f(5, 0.1, 0.1, 0.2);

      private static final IntFunction<cix.a> g = awq.a($$0 -> $$0.h, values(), awq.a.a);
      final int h;
      final double[] i;

      private a(int $$0, double $$1, double $$2, double $$3) {
         this.h = $$0;
         this.i = new double[]{$$1, $$2, $$3};
      }

      public static cix.a a(int $$0) {
         return g.apply($$0);
      }
   }

   protected class b extends byx {
      public b() {
         this.a(EnumSet.of(byx.a.a, byx.a.b));
      }

      @Override
      public boolean a() {
         return cix.this.gB() > 0;
      }

      @Override
      public void c() {
         super.c();
         cix.this.bR.n();
      }

      @Override
      public void d() {
         super.d();
         cix.this.a(cix.a.a);
      }

      @Override
      public void e() {
         if (cix.this.p() != null) {
            cix.this.G().a(cix.this.p(), (float)cix.this.aa(), (float)cix.this.Z());
         }
      }
   }

   protected abstract class c extends byx {
      protected int b;
      protected int c;

      @Override
      public boolean a() {
         bsa $$0 = cix.this.p();
         if ($$0 == null || !$$0.bB()) {
            return false;
         } else {
            return cix.this.gz() ? false : cix.this.ai >= this.c;
         }
      }

      @Override
      public boolean b() {
         bsa $$0 = cix.this.p();
         return $$0 != null && $$0.bB() && this.b > 0;
      }

      @Override
      public void c() {
         this.b = this.a(this.n());
         cix.this.b = this.h();
         this.c = cix.this.ai + this.i();
         avb $$0 = this.l();
         if ($$0 != null) {
            cix.this.a($$0, 1.0F, 1.0F);
         }

         cix.this.a(this.m());
      }

      @Override
      public void e() {
         this.b--;
         if (this.b == 0) {
            this.k();
            cix.this.a(cix.this.gp(), 1.0F, 1.0F);
         }
      }

      protected abstract void k();

      protected int n() {
         return 20;
      }

      protected abstract int h();

      protected abstract int i();

      @Nullable
      protected abstract avb l();

      protected abstract cix.a m();
   }
}
