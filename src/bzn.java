import java.util.EnumSet;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public abstract class bzn extends byl {
   private static final aec<Byte> e = aef.a(bzn.class, aee.a);
   protected int b;
   private bzn.a bT = bzn.a.a;

   protected bzn(bip<? extends bzn> $$0, cpq $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(e, (byte)0);
   }

   @Override
   public void a(qu $$0) {
      super.a($$0);
      this.b = $$0.h("SpellTicks");
   }

   @Override
   public void b(qu $$0) {
      super.b($$0);
      $$0.a("SpellTicks", this.b);
   }

   @Override
   public byl.a p() {
      if (this.gk()) {
         return byl.a.c;
      } else {
         return this.gr() ? byl.a.g : byl.a.a;
      }
   }

   public boolean gk() {
      return this.dK().B ? this.an.b(e) > 0 : this.b > 0;
   }

   public void a(bzn.a $$0) {
      this.bT = $$0;
      this.an.b(e, (byte)$$0.h);
   }

   protected bzn.a gl() {
      return !this.dK().B ? this.bT : bzn.a.a(this.an.b(e));
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
         bzn.a $$0 = this.gl();
         double $$1 = $$0.i[0];
         double $$2 = $$0.i[1];
         double $$3 = $$0.i[2];
         float $$4 = this.aU * (float) (Math.PI / 180.0) + ars.b((float)this.ah * 0.6662F) * 0.25F;
         float $$5 = ars.b($$4);
         float $$6 = ars.a($$4);
         this.dK().a(ix.v, this.dp() + (double)$$5 * 0.6, this.dr() + 1.8, this.dv() + (double)$$6 * 0.6, $$1, $$2, $$3);
         this.dK().a(ix.v, this.dp() - (double)$$5 * 0.6, this.dr() + 1.8, this.dv() - (double)$$6 * 0.6, $$1, $$2, $$3);
      }
   }

   protected int gm() {
      return this.b;
   }

   protected abstract aoy ga();

   protected static enum a {
      a(0, 0.0, 0.0, 0.0),
      b(1, 0.7, 0.7, 0.8),
      c(2, 0.4, 0.3, 0.35),
      d(3, 0.7, 0.5, 0.2),
      e(4, 0.3, 0.3, 0.8),
      f(5, 0.1, 0.1, 0.2);

      private static final IntFunction<bzn.a> g = aqn.a($$0 -> $$0.h, values(), aqn.a.a);
      final int h;
      final double[] i;

      private a(int $$0, double $$1, double $$2, double $$3) {
         this.h = $$0;
         this.i = new double[]{$$1, $$2, $$3};
      }

      public static bzn.a a(int $$0) {
         return g.apply($$0);
      }
   }

   protected class b extends bpw {
      public b() {
         this.a(EnumSet.of(bpw.a.a, bpw.a.b));
      }

      @Override
      public boolean a() {
         return bzn.this.gm() > 0;
      }

      @Override
      public void c() {
         super.c();
         bzn.this.bN.n();
      }

      @Override
      public void d() {
         super.d();
         bzn.this.a(bzn.a.a);
      }

      @Override
      public void e() {
         if (bzn.this.j() != null) {
            bzn.this.D().a(bzn.this.j(), (float)bzn.this.X(), (float)bzn.this.W());
         }
      }
   }

   protected abstract class c extends bpw {
      protected int b;
      protected int c;

      @Override
      public boolean a() {
         bjb $$0 = bzn.this.j();
         if ($$0 == null || !$$0.bv()) {
            return false;
         } else {
            return bzn.this.gk() ? false : bzn.this.ah >= this.c;
         }
      }

      @Override
      public boolean b() {
         bjb $$0 = bzn.this.j();
         return $$0 != null && $$0.bv() && this.b > 0;
      }

      @Override
      public void c() {
         this.b = this.a(this.n());
         bzn.this.b = this.h();
         this.c = bzn.this.ah + this.i();
         aoy $$0 = this.l();
         if ($$0 != null) {
            bzn.this.a($$0, 1.0F, 1.0F);
         }

         bzn.this.a(this.m());
      }

      @Override
      public void e() {
         this.b--;
         if (this.b == 0) {
            this.k();
            bzn.this.a(bzn.this.ga(), 1.0F, 1.0F);
         }
      }

      protected abstract void k();

      protected int n() {
         return 20;
      }

      protected abstract int h();

      protected abstract int i();

      @Nullable
      protected abstract aoy l();

      protected abstract bzn.a m();
   }
}
