import java.util.EnumSet;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public abstract class cmy extends clv {
   private static final aks<Byte> a = akw.a(cmy.class, aku.a);
   protected int b;
   private cmy.a bZ = cmy.a.a;

   protected cmy(bvi<? extends cmy> $$0, dgz $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(akw.a $$0) {
      super.a($$0);
      $$0.a(a, (byte)0);
   }

   @Override
   public void a(um $$0) {
      super.a($$0);
      this.b = $$0.h("SpellTicks");
   }

   @Override
   public void b(um $$0) {
      super.b($$0);
      $$0.a("SpellTicks", this.b);
   }

   @Override
   public clv.a m() {
      if (this.gx()) {
         return clv.a.c;
      } else {
         return this.gG() ? clv.a.g : clv.a.a;
      }
   }

   public boolean gx() {
      return this.dW().C ? this.al.a(a) > 0 : this.b > 0;
   }

   public void a(cmy.a $$0) {
      this.bZ = $$0;
      this.al.a(a, (byte)$$0.h);
   }

   protected cmy.a gy() {
      return !this.dW().C ? this.bZ : cmy.a.a(this.al.a(a));
   }

   @Override
   protected void a(arx $$0) {
      super.a($$0);
      if (this.b > 0) {
         this.b--;
      }
   }

   @Override
   public void h() {
      super.h();
      if (this.dW().C && this.gx()) {
         cmy.a $$0 = this.gy();
         float $$1 = (float)$$0.i[0];
         float $$2 = (float)$$0.i[1];
         float $$3 = (float)$$0.i[2];
         float $$4 = this.aX * (float) (Math.PI / 180.0) + azu.b((float)this.af * 0.6662F) * 0.25F;
         float $$5 = azu.b($$4);
         float $$6 = azu.a($$4);
         double $$7 = 0.6 * (double)this.ek();
         double $$8 = 1.8 * (double)this.ek();
         this.dW().a(ll.a(ls.u, $$1, $$2, $$3), this.dB() + (double)$$5 * $$7, this.dD() + $$8, this.dH() + (double)$$6 * $$7, 0.0, 0.0, 0.0);
         this.dW().a(ll.a(ls.u, $$1, $$2, $$3), this.dB() - (double)$$5 * $$7, this.dD() + $$8, this.dH() - (double)$$6 * $$7, 0.0, 0.0, 0.0);
      }
   }

   protected int gz() {
      return this.b;
   }

   protected abstract awu x();

   protected static enum a {
      a(0, 0.0, 0.0, 0.0),
      b(1, 0.7, 0.7, 0.8),
      c(2, 0.4, 0.3, 0.35),
      d(3, 0.7, 0.5, 0.2),
      e(4, 0.3, 0.3, 0.8),
      f(5, 0.1, 0.1, 0.2);

      private static final IntFunction<cmy.a> g = ayl.a($$0 -> $$0.h, values(), ayl.a.a);
      final int h;
      final double[] i;

      private a(final int $$0, final double $$1, final double $$2, final double $$3) {
         this.h = $$0;
         this.i = new double[]{$$1, $$2, $$3};
      }

      public static cmy.a a(int $$0) {
         return g.apply($$0);
      }
   }

   protected class b extends ccv {
      public b() {
         this.a(EnumSet.of(ccv.a.a, ccv.a.b));
      }

      @Override
      public boolean b() {
         return cmy.this.gz() > 0;
      }

      @Override
      public void d() {
         super.d();
         cmy.this.bS.o();
      }

      @Override
      public void e() {
         super.e();
         cmy.this.a(cmy.a.a);
      }

      @Override
      public void a() {
         if (cmy.this.O_() != null) {
            cmy.this.H().a(cmy.this.O_(), (float)cmy.this.aa(), (float)cmy.this.Z());
         }
      }
   }

   protected abstract class c extends ccv {
      protected int b;
      protected int c;

      @Override
      public boolean b() {
         bvx $$0 = cmy.this.O_();
         if ($$0 == null || !$$0.bL()) {
            return false;
         } else {
            return cmy.this.gx() ? false : cmy.this.af >= this.c;
         }
      }

      @Override
      public boolean c() {
         bvx $$0 = cmy.this.O_();
         return $$0 != null && $$0.bL() && this.b > 0;
      }

      @Override
      public void d() {
         this.b = this.a(this.n());
         cmy.this.b = this.h();
         this.c = cmy.this.af + this.i();
         awu $$0 = this.l();
         if ($$0 != null) {
            cmy.this.a($$0, 1.0F, 1.0F);
         }

         cmy.this.a(this.m());
      }

      @Override
      public void a() {
         this.b--;
         if (this.b == 0) {
            this.k();
            cmy.this.a(cmy.this.x(), 1.0F, 1.0F);
         }
      }

      protected abstract void k();

      protected int n() {
         return 20;
      }

      protected abstract int h();

      protected abstract int i();

      @Nullable
      protected abstract awu l();

      protected abstract cmy.a m();
   }
}
