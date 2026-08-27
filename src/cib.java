import java.util.EnumSet;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public abstract class cib extends cgy {
   private static final ajk<Byte> e = ajo.a(cib.class, ajm.a);
   protected int b;
   private cib.a bY = cib.a.a;

   protected cib(bqr<? extends cib> $$0, czu $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(ajo.a $$0) {
      super.a($$0);
      $$0.a(e, (byte)0);
   }

   @Override
   public void a(ty $$0) {
      super.a($$0);
      this.b = $$0.h("SpellTicks");
   }

   @Override
   public void b(ty $$0) {
      super.b($$0);
      $$0.a("SpellTicks", this.b);
   }

   @Override
   public cgy.a r() {
      if (this.gz()) {
         return cgy.a.c;
      } else {
         return this.gG() ? cgy.a.g : cgy.a.a;
      }
   }

   public boolean gz() {
      return this.dN().B ? this.ao.a(e) > 0 : this.b > 0;
   }

   public void a(cib.a $$0) {
      this.bY = $$0;
      this.ao.a(e, (byte)$$0.h);
   }

   protected cib.a gA() {
      return !this.dN().B ? this.bY : cib.a.a(this.ao.a(e));
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
         cib.a $$0 = this.gA();
         float $$1 = (float)$$0.i[0];
         float $$2 = (float)$$0.i[1];
         float $$3 = (float)$$0.i[2];
         float $$4 = this.aZ * (float) (Math.PI / 180.0) + axw.b((float)this.ai * 0.6662F) * 0.25F;
         float $$5 = axw.b($$4);
         float $$6 = axw.a($$4);
         double $$7 = 0.6 * (double)this.ec();
         double $$8 = 1.8 * (double)this.ec();
         this.dN().a(ko.a(kw.u, $$1, $$2, $$3), this.ds() + (double)$$5 * $$7, this.du() + $$8, this.dy() + (double)$$6 * $$7, 0.0, 0.0, 0.0);
         this.dN().a(ko.a(kw.u, $$1, $$2, $$3), this.ds() - (double)$$5 * $$7, this.du() + $$8, this.dy() - (double)$$6 * $$7, 0.0, 0.0, 0.0);
      }
   }

   protected int gB() {
      return this.b;
   }

   protected abstract auy gp();

   protected static enum a {
      a(0, 0.0, 0.0, 0.0),
      b(1, 0.7, 0.7, 0.8),
      c(2, 0.4, 0.3, 0.35),
      d(3, 0.7, 0.5, 0.2),
      e(4, 0.3, 0.3, 0.8),
      f(5, 0.1, 0.1, 0.2);

      private static final IntFunction<cib.a> g = awn.a($$0 -> $$0.h, values(), awn.a.a);
      final int h;
      final double[] i;

      private a(int $$0, double $$1, double $$2, double $$3) {
         this.h = $$0;
         this.i = new double[]{$$1, $$2, $$3};
      }

      public static cib.a a(int $$0) {
         return g.apply($$0);
      }
   }

   protected class b extends byb {
      public b() {
         this.a(EnumSet.of(byb.a.a, byb.a.b));
      }

      @Override
      public boolean a() {
         return cib.this.gB() > 0;
      }

      @Override
      public void c() {
         super.c();
         cib.this.bR.n();
      }

      @Override
      public void d() {
         super.d();
         cib.this.a(cib.a.a);
      }

      @Override
      public void e() {
         if (cib.this.p() != null) {
            cib.this.G().a(cib.this.p(), (float)cib.this.aa(), (float)cib.this.Z());
         }
      }
   }

   protected abstract class c extends byb {
      protected int b;
      protected int c;

      @Override
      public boolean a() {
         bre $$0 = cib.this.p();
         if ($$0 == null || !$$0.bB()) {
            return false;
         } else {
            return cib.this.gz() ? false : cib.this.ai >= this.c;
         }
      }

      @Override
      public boolean b() {
         bre $$0 = cib.this.p();
         return $$0 != null && $$0.bB() && this.b > 0;
      }

      @Override
      public void c() {
         this.b = this.a(this.n());
         cib.this.b = this.h();
         this.c = cib.this.ai + this.i();
         auy $$0 = this.l();
         if ($$0 != null) {
            cib.this.a($$0, 1.0F, 1.0F);
         }

         cib.this.a(this.m());
      }

      @Override
      public void e() {
         this.b--;
         if (this.b == 0) {
            this.k();
            cib.this.a(cib.this.gp(), 1.0F, 1.0F);
         }
      }

      protected abstract void k();

      protected int n() {
         return 20;
      }

      protected abstract int h();

      protected abstract int i();

      @Nullable
      protected abstract auy l();

      protected abstract cib.a m();
   }
}
