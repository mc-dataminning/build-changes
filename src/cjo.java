import java.util.EnumSet;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public abstract class cjo extends cij {
   private static final ajy<Byte> e = akc.a(cjo.class, aka.a);
   protected int b;
   private cjo.a ch = cjo.a.a;

   protected cjo(bsb<? extends cjo> $$0, dca $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(akc.a $$0) {
      super.a($$0);
      $$0.a(e, (byte)0);
   }

   @Override
   public void a(uk $$0) {
      super.a($$0);
      this.b = $$0.h("SpellTicks");
   }

   @Override
   public void b(uk $$0) {
      super.b($$0);
      $$0.a("SpellTicks", this.b);
   }

   @Override
   public cij.a r() {
      if (this.gI()) {
         return cij.a.c;
      } else {
         return this.gP() ? cij.a.g : cij.a.a;
      }
   }

   public boolean gI() {
      return this.dU().C ? this.as.a(e) > 0 : this.b > 0;
   }

   public void a(cjo.a $$0) {
      this.ch = $$0;
      this.as.a(e, (byte)$$0.h);
   }

   protected cjo.a gJ() {
      return !this.dU().C ? this.ch : cjo.a.a(this.as.a(e));
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
      if (this.dU().C && this.gI()) {
         cjo.a $$0 = this.gJ();
         float $$1 = (float)$$0.i[0];
         float $$2 = (float)$$0.i[1];
         float $$3 = (float)$$0.i[2];
         float $$4 = this.bj * (float) (Math.PI / 180.0) + aym.b((float)this.am * 0.6662F) * 0.25F;
         float $$5 = aym.b($$4);
         float $$6 = aym.a($$4);
         double $$7 = 0.6 * (double)this.em();
         double $$8 = 1.8 * (double)this.em();
         this.dU().a(kt.a(lb.u, $$1, $$2, $$3), this.dz() + (double)$$5 * $$7, this.dB() + $$8, this.dF() + (double)$$6 * $$7, 0.0, 0.0, 0.0);
         this.dU().a(kt.a(lb.u, $$1, $$2, $$3), this.dz() - (double)$$5 * $$7, this.dB() + $$8, this.dF() - (double)$$6 * $$7, 0.0, 0.0, 0.0);
      }
   }

   protected int gK() {
      return this.b;
   }

   protected abstract avn gy();

   protected static enum a {
      a(0, 0.0, 0.0, 0.0),
      b(1, 0.7, 0.7, 0.8),
      c(2, 0.4, 0.3, 0.35),
      d(3, 0.7, 0.5, 0.2),
      e(4, 0.3, 0.3, 0.8),
      f(5, 0.1, 0.1, 0.2);

      private static final IntFunction<cjo.a> g = axd.a($$0 -> $$0.h, values(), axd.a.a);
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

   protected class b extends bzl {
      public b() {
         this.a(EnumSet.of(bzl.a.a, bzl.a.b));
      }

      @Override
      public boolean a() {
         return cjo.this.gK() > 0;
      }

      @Override
      public void c() {
         super.c();
         cjo.this.ca.n();
      }

      @Override
      public void d() {
         super.d();
         cjo.this.a(cjo.a.a);
      }

      @Override
      public void e() {
         if (cjo.this.p() != null) {
            cjo.this.F().a(cjo.this.p(), (float)cjo.this.aa(), (float)cjo.this.Z());
         }
      }
   }

   protected abstract class c extends bzl {
      protected int b;
      protected int c;

      @Override
      public boolean a() {
         bso $$0 = cjo.this.p();
         if ($$0 == null || !$$0.bI()) {
            return false;
         } else {
            return cjo.this.gI() ? false : cjo.this.am >= this.c;
         }
      }

      @Override
      public boolean b() {
         bso $$0 = cjo.this.p();
         return $$0 != null && $$0.bI() && this.b > 0;
      }

      @Override
      public void c() {
         this.b = this.a(this.n());
         cjo.this.b = this.h();
         this.c = cjo.this.am + this.i();
         avn $$0 = this.l();
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
            cjo.this.a(cjo.this.gy(), 1.0F, 1.0F);
         }
      }

      protected abstract void k();

      protected int n() {
         return 20;
      }

      protected abstract int h();

      protected abstract int i();

      @Nullable
      protected abstract avn l();

      protected abstract cjo.a m();
   }
}
