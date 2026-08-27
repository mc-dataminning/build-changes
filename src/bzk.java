import java.util.EnumSet;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public abstract class bzk extends byi {
   private static final adz<Byte> e = aec.a(bzk.class, aeb.a);
   protected int b;
   private bzk.a bT = bzk.a.a;

   protected bzk(bim<? extends bzk> $$0, cpl $$1) {
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
   public byi.a p() {
      if (this.gk()) {
         return byi.a.c;
      } else {
         return this.gr() ? byi.a.g : byi.a.a;
      }
   }

   public boolean gk() {
      return this.dK().B ? this.an.b(e) > 0 : this.b > 0;
   }

   public void a(bzk.a $$0) {
      this.bT = $$0;
      this.an.b(e, (byte)$$0.h);
   }

   protected bzk.a gl() {
      return !this.dK().B ? this.bT : bzk.a.a(this.an.b(e));
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
      if (this.dK().B && this.gk()) {
         bzk.a $$0 = this.gl();
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

   protected int gm() {
      return this.b;
   }

   protected abstract aov ga();

   protected static enum a {
      a(0, 0.0, 0.0, 0.0),
      b(1, 0.7, 0.7, 0.8),
      c(2, 0.4, 0.3, 0.35),
      d(3, 0.7, 0.5, 0.2),
      e(4, 0.3, 0.3, 0.8),
      f(5, 0.1, 0.1, 0.2);

      private static final IntFunction<bzk.a> g = aqk.a($$0 -> $$0.h, values(), aqk.a.a);
      final int h;
      final double[] i;

      private a(int $$0, double $$1, double $$2, double $$3) {
         this.h = $$0;
         this.i = new double[]{$$1, $$2, $$3};
      }

      public static bzk.a a(int $$0) {
         return g.apply($$0);
      }
   }

   protected class b extends bpt {
      public b() {
         this.a(EnumSet.of(bpt.a.a, bpt.a.b));
      }

      @Override
      public boolean a() {
         return bzk.this.gm() > 0;
      }

      @Override
      public void c() {
         super.c();
         bzk.this.bN.n();
      }

      @Override
      public void d() {
         super.d();
         bzk.this.a(bzk.a.a);
      }

      @Override
      public void e() {
         if (bzk.this.j() != null) {
            bzk.this.D().a(bzk.this.j(), (float)bzk.this.X(), (float)bzk.this.W());
         }
      }
   }

   protected abstract class c extends bpt {
      protected int b;
      protected int c;

      @Override
      public boolean a() {
         biy $$0 = bzk.this.j();
         if ($$0 == null || !$$0.bv()) {
            return false;
         } else {
            return bzk.this.gk() ? false : bzk.this.ah >= this.c;
         }
      }

      @Override
      public boolean b() {
         biy $$0 = bzk.this.j();
         return $$0 != null && $$0.bv() && this.b > 0;
      }

      @Override
      public void c() {
         this.b = this.a(this.n());
         bzk.this.b = this.h();
         this.c = bzk.this.ah + this.i();
         aov $$0 = this.l();
         if ($$0 != null) {
            bzk.this.a($$0, 1.0F, 1.0F);
         }

         bzk.this.a(this.m());
      }

      @Override
      public void e() {
         this.b--;
         if (this.b == 0) {
            this.k();
            bzk.this.a(bzk.this.ga(), 1.0F, 1.0F);
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

      protected abstract bzk.a m();
   }
}
