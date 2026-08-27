import java.util.EnumSet;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public abstract class bzl extends byj {
   private static final adz<Byte> e = aec.a(bzl.class, aeb.a);
   protected int b;
   private bzl.a bT = bzl.a.a;

   protected bzl(bim<? extends bzl> $$0, cpm $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(e, (byte)0);
   }

   @Override
   public void a(qr $$0) {
      super.a($$0);
      this.b = $$0.h("SpellTicks");
   }

   @Override
   public void b(qr $$0) {
      super.b($$0);
      $$0.a("SpellTicks", this.b);
   }

   @Override
   public byj.a p() {
      if (this.gj()) {
         return byj.a.c;
      } else {
         return this.gq() ? byj.a.g : byj.a.a;
      }
   }

   public boolean gj() {
      return this.dK().B ? this.an.b(e) > 0 : this.b > 0;
   }

   public void a(bzl.a $$0) {
      this.bT = $$0;
      this.an.b(e, (byte)$$0.h);
   }

   protected bzl.a gk() {
      return !this.dK().B ? this.bT : bzl.a.a(this.an.b(e));
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
         bzl.a $$0 = this.gk();
         double $$1 = $$0.i[0];
         double $$2 = $$0.i[1];
         double $$3 = $$0.i[2];
         float $$4 = this.aU * (float) (Math.PI / 180.0) + arp.b((float)this.ah * 0.6662F) * 0.25F;
         float $$5 = arp.b($$4);
         float $$6 = arp.a($$4);
         this.dK().a(iv.v, this.dp() + (double)$$5 * 0.6, this.dr() + 1.8, this.dv() + (double)$$6 * 0.6, $$1, $$2, $$3);
         this.dK().a(iv.v, this.dp() - (double)$$5 * 0.6, this.dr() + 1.8, this.dv() - (double)$$6 * 0.6, $$1, $$2, $$3);
      }
   }

   protected int gl() {
      return this.b;
   }

   protected abstract aov fZ();

   protected static enum a {
      a(0, 0.0, 0.0, 0.0),
      b(1, 0.7, 0.7, 0.8),
      c(2, 0.4, 0.3, 0.35),
      d(3, 0.7, 0.5, 0.2),
      e(4, 0.3, 0.3, 0.8),
      f(5, 0.1, 0.1, 0.2);

      private static final IntFunction<bzl.a> g = aqk.a($$0 -> $$0.h, values(), aqk.a.a);
      final int h;
      final double[] i;

      private a(int $$0, double $$1, double $$2, double $$3) {
         this.h = $$0;
         this.i = new double[]{$$1, $$2, $$3};
      }

      public static bzl.a a(int $$0) {
         return g.apply($$0);
      }
   }

   protected class b extends bpu {
      public b() {
         this.a(EnumSet.of(bpu.a.a, bpu.a.b));
      }

      @Override
      public boolean a() {
         return bzl.this.gl() > 0;
      }

      @Override
      public void c() {
         super.c();
         bzl.this.bN.n();
      }

      @Override
      public void d() {
         super.d();
         bzl.this.a(bzl.a.a);
      }

      @Override
      public void e() {
         if (bzl.this.j() != null) {
            bzl.this.D().a(bzl.this.j(), (float)bzl.this.X(), (float)bzl.this.W());
         }
      }
   }

   protected abstract class c extends bpu {
      protected int b;
      protected int c;

      @Override
      public boolean a() {
         biy $$0 = bzl.this.j();
         if ($$0 == null || !$$0.bv()) {
            return false;
         } else {
            return bzl.this.gj() ? false : bzl.this.ah >= this.c;
         }
      }

      @Override
      public boolean b() {
         biy $$0 = bzl.this.j();
         return $$0 != null && $$0.bv() && this.b > 0;
      }

      @Override
      public void c() {
         this.b = this.a(this.n());
         bzl.this.b = this.h();
         this.c = bzl.this.ah + this.i();
         aov $$0 = this.l();
         if ($$0 != null) {
            bzl.this.a($$0, 1.0F, 1.0F);
         }

         bzl.this.a(this.m());
      }

      @Override
      public void e() {
         this.b--;
         if (this.b == 0) {
            this.k();
            bzl.this.a(bzl.this.fZ(), 1.0F, 1.0F);
         }
      }

      protected abstract void k();

      protected int n() {
         return 20;
      }

      protected abstract int h();

      protected abstract int i();

      @Nullable
      protected abstract aov l();

      protected abstract bzl.a m();
   }
}
