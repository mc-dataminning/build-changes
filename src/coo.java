import java.util.EnumSet;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public abstract class coo extends cnk {
   private static final akj<Byte> a = akn.a(coo.class, akl.a);
   protected int b;
   private coo.a bG = coo.a.a;

   protected coo(bwo<? extends coo> $$0, dja $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(a, (byte)0);
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.b = $$0.h("SpellTicks");
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("SpellTicks", this.b);
   }

   @Override
   public cnk.a j() {
      if (this.gy()) {
         return cnk.a.c;
      } else {
         return this.gH() ? cnk.a.g : cnk.a.a;
      }
   }

   public boolean gy() {
      return this.dV().C ? this.al.a(a) > 0 : this.b > 0;
   }

   public void a(coo.a $$0) {
      this.bG = $$0;
      this.al.a(a, (byte)$$0.h);
   }

   protected coo.a gz() {
      return !this.dV().C ? this.bG : coo.a.a(this.al.a(a));
   }

   @Override
   protected void a(arq $$0) {
      super.a($$0);
      if (this.b > 0) {
         this.b--;
      }
   }

   @Override
   public void h() {
      super.h();
      if (this.dV().C && this.gy()) {
         coo.a $$0 = this.gz();
         float $$1 = (float)$$0.i[0];
         float $$2 = (float)$$0.i[1];
         float $$3 = (float)$$0.i[2];
         float $$4 = this.aV * (float) (Math.PI / 180.0) + azm.b((float)this.af * 0.6662F) * 0.25F;
         float $$5 = azm.b($$4);
         float $$6 = azm.a($$4);
         double $$7 = 0.6 * (double)this.el();
         double $$8 = 1.8 * (double)this.el();
         this.dV().a(lq.a(lx.u, $$1, $$2, $$3), this.dA() + (double)$$5 * $$7, this.dC() + $$8, this.dG() + (double)$$6 * $$7, 0.0, 0.0, 0.0);
         this.dV().a(lq.a(lx.u, $$1, $$2, $$3), this.dA() - (double)$$5 * $$7, this.dC() + $$8, this.dG() - (double)$$6 * $$7, 0.0, 0.0, 0.0);
      }
   }

   protected int gA() {
      return this.b;
   }

   protected abstract awm q();

   protected static enum a {
      a(0, 0.0, 0.0, 0.0),
      b(1, 0.7, 0.7, 0.8),
      c(2, 0.4, 0.3, 0.35),
      d(3, 0.7, 0.5, 0.2),
      e(4, 0.3, 0.3, 0.8),
      f(5, 0.1, 0.1, 0.2);

      private static final IntFunction<coo.a> g = ayc.a($$0 -> $$0.h, values(), ayc.a.a);
      final int h;
      final double[] i;

      private a(final int $$0, final double $$1, final double $$2, final double $$3) {
         this.h = $$0;
         this.i = new double[]{$$1, $$2, $$3};
      }

      public static coo.a a(int $$0) {
         return g.apply($$0);
      }
   }

   protected class b extends cea {
      public b() {
         this.a(EnumSet.of(cea.a.a, cea.a.b));
      }

      @Override
      public boolean b() {
         return coo.this.gA() > 0;
      }

      @Override
      public void d() {
         super.d();
         coo.this.bC.m();
      }

      @Override
      public void e() {
         super.e();
         coo.this.a(coo.a.a);
      }

      @Override
      public void a() {
         if (coo.this.f() != null) {
            coo.this.J().a(coo.this.f(), (float)coo.this.ad(), (float)coo.this.ac());
         }
      }
   }

   protected abstract class c extends cea {
      protected int b;
      protected int c;

      @Override
      public boolean b() {
         bxe $$0 = coo.this.f();
         if ($$0 == null || !$$0.bK()) {
            return false;
         } else {
            return coo.this.gy() ? false : coo.this.af >= this.c;
         }
      }

      @Override
      public boolean c() {
         bxe $$0 = coo.this.f();
         return $$0 != null && $$0.bK() && this.b > 0;
      }

      @Override
      public void d() {
         this.b = this.a(this.n());
         coo.this.b = this.h();
         this.c = coo.this.af + this.i();
         awm $$0 = this.l();
         if ($$0 != null) {
            coo.this.a($$0, 1.0F, 1.0F);
         }

         coo.this.a(this.m());
      }

      @Override
      public void a() {
         this.b--;
         if (this.b == 0) {
            this.k();
            coo.this.a(coo.this.q(), 1.0F, 1.0F);
         }
      }

      protected abstract void k();

      protected int n() {
         return 20;
      }

      protected abstract int h();

      protected abstract int i();

      @Nullable
      protected abstract awm l();

      protected abstract coo.a m();
   }
}
