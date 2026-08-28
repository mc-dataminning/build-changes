import java.util.EnumSet;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public abstract class cjx extends ciu {
   private static final ajp<Byte> e = ajt.a(cjx.class, ajr.a);
   protected int b;
   private cjx.a ca = cjx.a.a;

   protected cjx(bsj<? extends cjx> $$0, dcd $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(ajt.a $$0) {
      super.a($$0);
      $$0.a(e, (byte)0);
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      this.b = $$0.h("SpellTicks");
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      $$0.a("SpellTicks", this.b);
   }

   @Override
   public ciu.a s() {
      if (this.gx()) {
         return ciu.a.c;
      } else {
         return this.gG() ? ciu.a.g : ciu.a.a;
      }
   }

   public boolean gx() {
      return this.dP().B ? this.ao.a(e) > 0 : this.b > 0;
   }

   public void a(cjx.a $$0) {
      this.ca = $$0;
      this.ao.a(e, (byte)$$0.h);
   }

   protected cjx.a gy() {
      return !this.dP().B ? this.ca : cjx.a.a(this.ao.a(e));
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
      if (this.dP().B && this.gx()) {
         cjx.a $$0 = this.gy();
         float $$1 = (float)$$0.i[0];
         float $$2 = (float)$$0.i[1];
         float $$3 = (float)$$0.i[2];
         float $$4 = this.aY * (float) (Math.PI / 180.0) + aye.b((float)this.ai * 0.6662F) * 0.25F;
         float $$5 = aye.b($$4);
         float $$6 = aye.a($$4);
         double $$7 = 0.6 * (double)this.eb();
         double $$8 = 1.8 * (double)this.eb();
         this.dP().a(lc.a(lj.u, $$1, $$2, $$3), this.du() + (double)$$5 * $$7, this.dw() + $$8, this.dA() + (double)$$6 * $$7, 0.0, 0.0, 0.0);
         this.dP().a(lc.a(lj.u, $$1, $$2, $$3), this.du() - (double)$$5 * $$7, this.dw() + $$8, this.dA() - (double)$$6 * $$7, 0.0, 0.0, 0.0);
      }
   }

   protected int gz() {
      return this.b;
   }

   protected abstract ave gn();

   protected static enum a {
      a(0, 0.0, 0.0, 0.0),
      b(1, 0.7, 0.7, 0.8),
      c(2, 0.4, 0.3, 0.35),
      d(3, 0.7, 0.5, 0.2),
      e(4, 0.3, 0.3, 0.8),
      f(5, 0.1, 0.1, 0.2);

      private static final IntFunction<cjx.a> g = awu.a($$0 -> $$0.h, values(), awu.a.a);
      final int h;
      final double[] i;

      private a(final int $$0, final double $$1, final double $$2, final double $$3) {
         this.h = $$0;
         this.i = new double[]{$$1, $$2, $$3};
      }

      public static cjx.a a(int $$0) {
         return g.apply($$0);
      }
   }

   protected class b extends bzw {
      public b() {
         this.a(EnumSet.of(bzw.a.a, bzw.a.b));
      }

      @Override
      public boolean a() {
         return cjx.this.gz() > 0;
      }

      @Override
      public void c() {
         super.c();
         cjx.this.bT.n();
      }

      @Override
      public void d() {
         super.d();
         cjx.this.a(cjx.a.a);
      }

      @Override
      public void e() {
         if (cjx.this.p() != null) {
            cjx.this.G().a(cjx.this.p(), (float)cjx.this.ab(), (float)cjx.this.aa());
         }
      }
   }

   protected abstract class c extends bzw {
      protected int b;
      protected int c;

      @Override
      public boolean a() {
         bsy $$0 = cjx.this.p();
         if ($$0 == null || !$$0.bD()) {
            return false;
         } else {
            return cjx.this.gx() ? false : cjx.this.ai >= this.c;
         }
      }

      @Override
      public boolean b() {
         bsy $$0 = cjx.this.p();
         return $$0 != null && $$0.bD() && this.b > 0;
      }

      @Override
      public void c() {
         this.b = this.a(this.n());
         cjx.this.b = this.h();
         this.c = cjx.this.ai + this.i();
         ave $$0 = this.l();
         if ($$0 != null) {
            cjx.this.a($$0, 1.0F, 1.0F);
         }

         cjx.this.a(this.m());
      }

      @Override
      public void e() {
         this.b--;
         if (this.b == 0) {
            this.k();
            cjx.this.a(cjx.this.gn(), 1.0F, 1.0F);
         }
      }

      protected abstract void k();

      protected int n() {
         return 20;
      }

      protected abstract int h();

      protected abstract int i();

      @Nullable
      protected abstract ave l();

      protected abstract cjx.a m();
   }
}
