import java.util.EnumSet;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public abstract class cnc extends clz {
   private static final ajx<Byte> a = akb.a(cnc.class, ajz.a);
   protected int b;
   private cnc.a bF = cnc.a.a;

   protected cnc(bvi<? extends cnc> $$0, dgz $$1) {
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
   public clz.a j() {
      if (this.gz()) {
         return clz.a.c;
      } else {
         return this.gI() ? clz.a.g : clz.a.a;
      }
   }

   public boolean gz() {
      return this.dU().C ? this.al.a(a) > 0 : this.b > 0;
   }

   public void a(cnc.a $$0) {
      this.bF = $$0;
      this.al.a(a, (byte)$$0.h);
   }

   protected cnc.a gA() {
      return !this.dU().C ? this.bF : cnc.a.a(this.al.a(a));
   }

   @Override
   protected void a(ard $$0) {
      super.a($$0);
      if (this.b > 0) {
         this.b--;
      }
   }

   @Override
   public void h() {
      super.h();
      if (this.dU().C && this.gz()) {
         cnc.a $$0 = this.gA();
         float $$1 = (float)$$0.i[0];
         float $$2 = (float)$$0.i[1];
         float $$3 = (float)$$0.i[2];
         float $$4 = this.aV * (float) (Math.PI / 180.0) + ayz.b((float)this.af * 0.6662F) * 0.25F;
         float $$5 = ayz.b($$4);
         float $$6 = ayz.a($$4);
         double $$7 = 0.6 * (double)this.ej();
         double $$8 = 1.8 * (double)this.ej();
         this.dU().a(lm.a(lt.u, $$1, $$2, $$3), this.dz() + (double)$$5 * $$7, this.dB() + $$8, this.dF() + (double)$$6 * $$7, 0.0, 0.0, 0.0);
         this.dU().a(lm.a(lt.u, $$1, $$2, $$3), this.dz() - (double)$$5 * $$7, this.dB() + $$8, this.dF() - (double)$$6 * $$7, 0.0, 0.0, 0.0);
      }
   }

   protected int gB() {
      return this.b;
   }

   protected abstract avz q();

   protected static enum a {
      a(0, 0.0, 0.0, 0.0),
      b(1, 0.7, 0.7, 0.8),
      c(2, 0.4, 0.3, 0.35),
      d(3, 0.7, 0.5, 0.2),
      e(4, 0.3, 0.3, 0.8),
      f(5, 0.1, 0.1, 0.2);

      private static final IntFunction<cnc.a> g = axq.a($$0 -> $$0.h, values(), axq.a.a);
      final int h;
      final double[] i;

      private a(final int $$0, final double $$1, final double $$2, final double $$3) {
         this.h = $$0;
         this.i = new double[]{$$1, $$2, $$3};
      }

      public static cnc.a a(int $$0) {
         return g.apply($$0);
      }
   }

   protected class b extends ccw {
      public b() {
         this.a(EnumSet.of(ccw.a.a, ccw.a.b));
      }

      @Override
      public boolean b() {
         return cnc.this.gB() > 0;
      }

      @Override
      public void d() {
         super.d();
         cnc.this.bB.m();
      }

      @Override
      public void e() {
         super.e();
         cnc.this.a(cnc.a.a);
      }

      @Override
      public void a() {
         if (cnc.this.f() != null) {
            cnc.this.J().a(cnc.this.f(), (float)cnc.this.ad(), (float)cnc.this.ac());
         }
      }
   }

   protected abstract class c extends ccw {
      protected int b;
      protected int c;

      @Override
      public boolean b() {
         bvy $$0 = cnc.this.f();
         if ($$0 == null || !$$0.bJ()) {
            return false;
         } else {
            return cnc.this.gz() ? false : cnc.this.af >= this.c;
         }
      }

      @Override
      public boolean c() {
         bvy $$0 = cnc.this.f();
         return $$0 != null && $$0.bJ() && this.b > 0;
      }

      @Override
      public void d() {
         this.b = this.a(this.n());
         cnc.this.b = this.h();
         this.c = cnc.this.af + this.i();
         avz $$0 = this.l();
         if ($$0 != null) {
            cnc.this.a($$0, 1.0F, 1.0F);
         }

         cnc.this.a(this.m());
      }

      @Override
      public void a() {
         this.b--;
         if (this.b == 0) {
            this.k();
            cnc.this.a(cnc.this.q(), 1.0F, 1.0F);
         }
      }

      protected abstract void k();

      protected int n() {
         return 20;
      }

      protected abstract int h();

      protected abstract int i();

      @Nullable
      protected abstract avz l();

      protected abstract cnc.a m();
   }
}
