import java.util.EnumSet;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public abstract class bzj extends byh {
   private static final adx<Byte> e = aea.a(bzj.class, adz.a);
   protected int b;
   private bzj.a bT = bzj.a.a;

   protected bzj(bik<? extends bzj> $$0, cpk $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(e, (byte)0);
   }

   @Override
   public void a(qs $$0) {
      super.a($$0);
      this.b = $$0.h("SpellTicks");
   }

   @Override
   public void b(qs $$0) {
      super.b($$0);
      $$0.a("SpellTicks", this.b);
   }

   @Override
   public byh.a p() {
      if (this.gj()) {
         return byh.a.c;
      } else {
         return this.gq() ? byh.a.g : byh.a.a;
      }
   }

   public boolean gj() {
      return this.dK().B ? this.an.b(e) > 0 : this.b > 0;
   }

   public void a(bzj.a $$0) {
      this.bT = $$0;
      this.an.b(e, (byte)$$0.h);
   }

   protected bzj.a gk() {
      return !this.dK().B ? this.bT : bzj.a.a(this.an.b(e));
   }

   @Override
   protected void V() {
      super.V();
      if (this.b > 0) {
         this.b--;
      }
   }

   @Override
   public void l() {
      super.l();
      if (this.dK().B && this.gj()) {
         bzj.a $$0 = this.gk();
         double $$1 = $$0.i[0];
         double $$2 = $$0.i[1];
         double $$3 = $$0.i[2];
         float $$4 = this.aU * (float) (Math.PI / 180.0) + aro.b((float)this.ah * 0.6662F) * 0.25F;
         float $$5 = aro.b($$4);
         float $$6 = aro.a($$4);
         this.dK().a(iw.v, this.dp() + (double)$$5 * 0.6, this.dr() + 1.8, this.dv() + (double)$$6 * 0.6, $$1, $$2, $$3);
         this.dK().a(iw.v, this.dp() - (double)$$5 * 0.6, this.dr() + 1.8, this.dv() - (double)$$6 * 0.6, $$1, $$2, $$3);
      }
   }

   protected int gl() {
      return this.b;
   }

   protected abstract aot fZ();

   protected static enum a {
      a(0, 0.0, 0.0, 0.0),
      b(1, 0.7, 0.7, 0.8),
      c(2, 0.4, 0.3, 0.35),
      d(3, 0.7, 0.5, 0.2),
      e(4, 0.3, 0.3, 0.8),
      f(5, 0.1, 0.1, 0.2);

      private static final IntFunction<bzj.a> g = aqi.a($$0 -> $$0.h, values(), aqi.a.a);
      final int h;
      final double[] i;

      private a(int $$0, double $$1, double $$2, double $$3) {
         this.h = $$0;
         this.i = new double[]{$$1, $$2, $$3};
      }

      public static bzj.a a(int $$0) {
         return g.apply($$0);
      }
   }

   protected class b extends bps {
      public b() {
         this.a(EnumSet.of(bps.a.a, bps.a.b));
      }

      @Override
      public boolean a() {
         return bzj.this.gl() > 0;
      }

      @Override
      public void c() {
         super.c();
         bzj.this.bN.n();
      }

      @Override
      public void d() {
         super.d();
         bzj.this.a(bzj.a.a);
      }

      @Override
      public void e() {
         if (bzj.this.j() != null) {
            bzj.this.D().a(bzj.this.j(), (float)bzj.this.X(), (float)bzj.this.W());
         }
      }
   }

   protected abstract class c extends bps {
      protected int b;
      protected int c;

      @Override
      public boolean a() {
         biw $$0 = bzj.this.j();
         if ($$0 == null || !$$0.bv()) {
            return false;
         } else {
            return bzj.this.gj() ? false : bzj.this.ah >= this.c;
         }
      }

      @Override
      public boolean b() {
         biw $$0 = bzj.this.j();
         return $$0 != null && $$0.bv() && this.b > 0;
      }

      @Override
      public void c() {
         this.b = this.a(this.n());
         bzj.this.b = this.h();
         this.c = bzj.this.ah + this.i();
         aot $$0 = this.l();
         if ($$0 != null) {
            bzj.this.a($$0, 1.0F, 1.0F);
         }

         bzj.this.a(this.m());
      }

      @Override
      public void e() {
         this.b--;
         if (this.b == 0) {
            this.k();
            bzj.this.a(bzj.this.fZ(), 1.0F, 1.0F);
         }
      }

      protected abstract void k();

      protected int n() {
         return 20;
      }

      protected abstract int h();

      protected abstract int i();

      @Nullable
      protected abstract aot l();

      protected abstract bzj.a m();
   }
}
