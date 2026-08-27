import java.util.EnumSet;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public abstract class cjo extends cil {
   private static final ajs<Byte> e = ajw.a(cjo.class, aju.a);
   protected int b;
   private cjo.a bY = cjo.a.a;

   protected cjo(bsc<? extends cjo> $$0, daz $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(ajw.a $$0) {
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
   public cil.a s() {
      if (this.gz()) {
         return cil.a.c;
      } else {
         return this.gI() ? cil.a.g : cil.a.a;
      }
   }

   public boolean gz() {
      return this.dP().B ? this.ao.a(e) > 0 : this.b > 0;
   }

   public void a(cjo.a $$0) {
      this.bY = $$0;
      this.ao.a(e, (byte)$$0.h);
   }

   protected cjo.a gA() {
      return !this.dP().B ? this.bY : cjo.a.a(this.ao.a(e));
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
         cjo.a $$0 = this.gA();
         float $$1 = (float)$$0.i[0];
         float $$2 = (float)$$0.i[1];
         float $$3 = (float)$$0.i[2];
         float $$4 = this.aY * (float) (Math.PI / 180.0) + ayf.b((float)this.ai * 0.6662F) * 0.25F;
         float $$5 = ayf.b($$4);
         float $$6 = ayf.a($$4);
         double $$7 = 0.6 * (double)this.ee();
         double $$8 = 1.8 * (double)this.ee();
         this.dP().a(kq.a(ky.u, $$1, $$2, $$3), this.du() + (double)$$5 * $$7, this.dw() + $$8, this.dA() + (double)$$6 * $$7, 0.0, 0.0, 0.0);
         this.dP().a(kq.a(ky.u, $$1, $$2, $$3), this.du() - (double)$$5 * $$7, this.dw() + $$8, this.dA() - (double)$$6 * $$7, 0.0, 0.0, 0.0);
      }
   }

   protected int gB() {
      return this.b;
   }

   protected abstract avh gp();

   protected static enum a {
      a(0, 0.0, 0.0, 0.0),
      b(1, 0.7, 0.7, 0.8),
      c(2, 0.4, 0.3, 0.35),
      d(3, 0.7, 0.5, 0.2),
      e(4, 0.3, 0.3, 0.8),
      f(5, 0.1, 0.1, 0.2);

      private static final IntFunction<cjo.a> g = aww.a($$0 -> $$0.h, values(), aww.a.a);
      final int h;
      final double[] i;

      private a(int $$0, double $$1, double $$2, double $$3) {
         this.h = $$0;
         this.i = new double[]{$$1, $$2, $$3};
      }

      public static cjo.a a(int $$0) {
         return g.apply($$0);
      }
   }

   protected class b extends bzo {
      public b() {
         this.a(EnumSet.of(bzo.a.a, bzo.a.b));
      }

      @Override
      public boolean a() {
         return cjo.this.gB() > 0;
      }

      @Override
      public void c() {
         super.c();
         cjo.this.bR.n();
      }

      @Override
      public void d() {
         super.d();
         cjo.this.a(cjo.a.a);
      }

      @Override
      public void e() {
         if (cjo.this.p() != null) {
            cjo.this.G().a(cjo.this.p(), (float)cjo.this.aa(), (float)cjo.this.Z());
         }
      }
   }

   protected abstract class c extends bzo {
      protected int b;
      protected int c;

      @Override
      public boolean a() {
         bsq $$0 = cjo.this.p();
         if ($$0 == null || !$$0.bD()) {
            return false;
         } else {
            return cjo.this.gz() ? false : cjo.this.ai >= this.c;
         }
      }

      @Override
      public boolean b() {
         bsq $$0 = cjo.this.p();
         return $$0 != null && $$0.bD() && this.b > 0;
      }

      @Override
      public void c() {
         this.b = this.a(this.n());
         cjo.this.b = this.h();
         this.c = cjo.this.ai + this.i();
         avh $$0 = this.l();
         if ($$0 != null) {
            cjo.this.a($$0, 1.0F, 1.0F);
         }

         cjo.this.a(this.m());
      }

      @Override
      public void e() {
         this.b--;
         if (this.b == 0) {
            this.k();
            cjo.this.a(cjo.this.gp(), 1.0F, 1.0F);
         }
      }

      protected abstract void k();

      protected int n() {
         return 20;
      }

      protected abstract int h();

      protected abstract int i();

      @Nullable
      protected abstract avh l();

      protected abstract cjo.a m();
   }
}
