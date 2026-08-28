import java.util.EnumSet;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public abstract class cmg extends cld {
   private static final ajx<Byte> a = akb.a(cmg.class, ajz.a);
   protected int b;
   private cmg.a bY = cmg.a.a;

   protected cmg(buq<? extends cmg> $$0, dgg $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(akb.a $$0) {
      super.a($$0);
      $$0.a(a, (byte)0);
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      this.b = $$0.h("SpellTicks");
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      $$0.a("SpellTicks", this.b);
   }

   @Override
   public cld.a m() {
      if (this.gy()) {
         return cld.a.c;
      } else {
         return this.gH() ? cld.a.g : cld.a.a;
      }
   }

   public boolean gy() {
      return this.dW().C ? this.al.a(a) > 0 : this.b > 0;
   }

   public void a(cmg.a $$0) {
      this.bY = $$0;
      this.al.a(a, (byte)$$0.h);
   }

   protected cmg.a gz() {
      return !this.dW().C ? this.bY : cmg.a.a(this.al.a(a));
   }

   @Override
   protected void a(arc $$0) {
      super.a($$0);
      if (this.b > 0) {
         this.b--;
      }
   }

   @Override
   public void h() {
      super.h();
      if (this.dW().C && this.gy()) {
         cmg.a $$0 = this.gz();
         float $$1 = (float)$$0.i[0];
         float $$2 = (float)$$0.i[1];
         float $$3 = (float)$$0.i[2];
         float $$4 = this.aX * (float) (Math.PI / 180.0) + ayy.b((float)this.af * 0.6662F) * 0.25F;
         float $$5 = ayy.b($$4);
         float $$6 = ayy.a($$4);
         double $$7 = 0.6 * (double)this.ek();
         double $$8 = 1.8 * (double)this.ek();
         this.dW().a(lm.a(lt.u, $$1, $$2, $$3), this.dB() + (double)$$5 * $$7, this.dD() + $$8, this.dH() + (double)$$6 * $$7, 0.0, 0.0, 0.0);
         this.dW().a(lm.a(lt.u, $$1, $$2, $$3), this.dB() - (double)$$5 * $$7, this.dD() + $$8, this.dH() - (double)$$6 * $$7, 0.0, 0.0, 0.0);
      }
   }

   protected int gA() {
      return this.b;
   }

   protected abstract avy x();

   protected static enum a {
      a(0, 0.0, 0.0, 0.0),
      b(1, 0.7, 0.7, 0.8),
      c(2, 0.4, 0.3, 0.35),
      d(3, 0.7, 0.5, 0.2),
      e(4, 0.3, 0.3, 0.8),
      f(5, 0.1, 0.1, 0.2);

      private static final IntFunction<cmg.a> g = axp.a($$0 -> $$0.h, values(), axp.a.a);
      final int h;
      final double[] i;

      private a(final int $$0, final double $$1, final double $$2, final double $$3) {
         this.h = $$0;
         this.i = new double[]{$$1, $$2, $$3};
      }

      public static cmg.a a(int $$0) {
         return g.apply($$0);
      }
   }

   protected class b extends ccd {
      public b() {
         this.a(EnumSet.of(ccd.a.a, ccd.a.b));
      }

      @Override
      public boolean b() {
         return cmg.this.gA() > 0;
      }

      @Override
      public void d() {
         super.d();
         cmg.this.bR.m();
      }

      @Override
      public void e() {
         super.e();
         cmg.this.a(cmg.a.a);
      }

      @Override
      public void a() {
         if (cmg.this.O_() != null) {
            cmg.this.H().a(cmg.this.O_(), (float)cmg.this.ab(), (float)cmg.this.aa());
         }
      }
   }

   protected abstract class c extends ccd {
      protected int b;
      protected int c;

      @Override
      public boolean b() {
         bvf $$0 = cmg.this.O_();
         if ($$0 == null || !$$0.bL()) {
            return false;
         } else {
            return cmg.this.gy() ? false : cmg.this.af >= this.c;
         }
      }

      @Override
      public boolean c() {
         bvf $$0 = cmg.this.O_();
         return $$0 != null && $$0.bL() && this.b > 0;
      }

      @Override
      public void d() {
         this.b = this.a(this.n());
         cmg.this.b = this.h();
         this.c = cmg.this.af + this.i();
         avy $$0 = this.l();
         if ($$0 != null) {
            cmg.this.a($$0, 1.0F, 1.0F);
         }

         cmg.this.a(this.m());
      }

      @Override
      public void a() {
         this.b--;
         if (this.b == 0) {
            this.k();
            cmg.this.a(cmg.this.x(), 1.0F, 1.0F);
         }
      }

      protected abstract void k();

      protected int n() {
         return 20;
      }

      protected abstract int h();

      protected abstract int i();

      @Nullable
      protected abstract avy l();

      protected abstract cmg.a m();
   }
}
