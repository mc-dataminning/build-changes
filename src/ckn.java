import java.util.EnumSet;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public abstract class ckn extends cjk {
   private static final akk<Byte> e = ako.a(ckn.class, akm.a);
   protected int b;
   private ckn.a bY = ckn.a.a;

   protected ckn(bta<? extends ckn> $$0, dby $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(ako.a $$0) {
      super.a($$0);
      $$0.a(e, (byte)0);
   }

   @Override
   public void a(us $$0) {
      super.a($$0);
      this.b = $$0.h("SpellTicks");
   }

   @Override
   public void b(us $$0) {
      super.b($$0);
      $$0.a("SpellTicks", this.b);
   }

   @Override
   public cjk.a s() {
      if (this.gA()) {
         return cjk.a.c;
      } else {
         return this.gJ() ? cjk.a.g : cjk.a.a;
      }
   }

   public boolean gA() {
      return this.dP().B ? this.ao.a(e) > 0 : this.b > 0;
   }

   public void a(ckn.a $$0) {
      this.bY = $$0;
      this.ao.a(e, (byte)$$0.h);
   }

   protected ckn.a gB() {
      return !this.dP().B ? this.bY : ckn.a.a(this.ao.a(e));
   }

   @Override
   protected void Z() {
      super.Z();
      if (this.b > 0) {
         this.b--;
      }
   }

   @Override
   public void l() {
      super.l();
      if (this.dP().B && this.gA()) {
         ckn.a $$0 = this.gB();
         float $$1 = (float)$$0.i[0];
         float $$2 = (float)$$0.i[1];
         float $$3 = (float)$$0.i[2];
         float $$4 = this.aY * (float) (Math.PI / 180.0) + ayz.b((float)this.ai * 0.6662F) * 0.25F;
         float $$5 = ayz.b($$4);
         float $$6 = ayz.a($$4);
         double $$7 = 0.6 * (double)this.ee();
         double $$8 = 1.8 * (double)this.ee();
         this.dP().a(lb.a(li.u, $$1, $$2, $$3), this.du() + (double)$$5 * $$7, this.dw() + $$8, this.dA() + (double)$$6 * $$7, 0.0, 0.0, 0.0);
         this.dP().a(lb.a(li.u, $$1, $$2, $$3), this.du() - (double)$$5 * $$7, this.dw() + $$8, this.dA() - (double)$$6 * $$7, 0.0, 0.0, 0.0);
      }
   }

   protected int gC() {
      return this.b;
   }

   protected abstract avz gq();

   protected static enum a {
      a(0, 0.0, 0.0, 0.0),
      b(1, 0.7, 0.7, 0.8),
      c(2, 0.4, 0.3, 0.35),
      d(3, 0.7, 0.5, 0.2),
      e(4, 0.3, 0.3, 0.8),
      f(5, 0.1, 0.1, 0.2);

      private static final IntFunction<ckn.a> g = axp.a($$0 -> $$0.h, values(), axp.a.a);
      final int h;
      final double[] i;

      private a(final int $$0, final double $$1, final double $$2, final double $$3) {
         this.h = $$0;
         this.i = new double[]{$$1, $$2, $$3};
      }

      public static ckn.a a(int $$0) {
         return g.apply($$0);
      }
   }

   protected class b extends can {
      public b() {
         this.a(EnumSet.of(can.a.a, can.a.b));
      }

      @Override
      public boolean a() {
         return ckn.this.gC() > 0;
      }

      @Override
      public void c() {
         super.c();
         ckn.this.bR.n();
      }

      @Override
      public void d() {
         super.d();
         ckn.this.a(ckn.a.a);
      }

      @Override
      public void e() {
         if (ckn.this.p() != null) {
            ckn.this.G().a(ckn.this.p(), (float)ckn.this.ab(), (float)ckn.this.aa());
         }
      }
   }

   protected abstract class c extends can {
      protected int b;
      protected int c;

      @Override
      public boolean a() {
         btp $$0 = ckn.this.p();
         if ($$0 == null || !$$0.bD()) {
            return false;
         } else {
            return ckn.this.gA() ? false : ckn.this.ai >= this.c;
         }
      }

      @Override
      public boolean b() {
         btp $$0 = ckn.this.p();
         return $$0 != null && $$0.bD() && this.b > 0;
      }

      @Override
      public void c() {
         this.b = this.a(this.n());
         ckn.this.b = this.h();
         this.c = ckn.this.ai + this.i();
         avz $$0 = this.l();
         if ($$0 != null) {
            ckn.this.a($$0, 1.0F, 1.0F);
         }

         ckn.this.a(this.m());
      }

      @Override
      public void e() {
         this.b--;
         if (this.b == 0) {
            this.k();
            ckn.this.a(ckn.this.gq(), 1.0F, 1.0F);
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

      protected abstract ckn.a m();
   }
}
