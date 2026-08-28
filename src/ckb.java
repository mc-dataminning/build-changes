import java.util.EnumSet;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public abstract class ckb extends ciy {
   private static final ajp<Byte> e = ajt.a(ckb.class, ajr.a);
   protected int b;
   private ckb.a ca = ckb.a.a;

   protected ckb(bsn<? extends ckb> $$0, dcg $$1) {
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
   public ciy.a s() {
      if (this.gx()) {
         return ciy.a.c;
      } else {
         return this.gG() ? ciy.a.g : ciy.a.a;
      }
   }

   public boolean gx() {
      return this.dR().B ? this.ao.a(e) > 0 : this.b > 0;
   }

   public void a(ckb.a $$0) {
      this.ca = $$0;
      this.ao.a(e, (byte)$$0.h);
   }

   protected ckb.a gy() {
      return !this.dR().B ? this.ca : ckb.a.a(this.ao.a(e));
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
      if (this.dR().B && this.gx()) {
         ckb.a $$0 = this.gy();
         float $$1 = (float)$$0.i[0];
         float $$2 = (float)$$0.i[1];
         float $$3 = (float)$$0.i[2];
         float $$4 = this.aZ * (float) (Math.PI / 180.0) + ayg.b((float)this.ai * 0.6662F) * 0.25F;
         float $$5 = ayg.b($$4);
         float $$6 = ayg.a($$4);
         double $$7 = 0.6 * (double)this.ed();
         double $$8 = 1.8 * (double)this.ed();
         this.dR().a(lc.a(lj.u, $$1, $$2, $$3), this.dw() + (double)$$5 * $$7, this.dy() + $$8, this.dC() + (double)$$6 * $$7, 0.0, 0.0, 0.0);
         this.dR().a(lc.a(lj.u, $$1, $$2, $$3), this.dw() - (double)$$5 * $$7, this.dy() + $$8, this.dC() - (double)$$6 * $$7, 0.0, 0.0, 0.0);
      }
   }

   protected int gz() {
      return this.b;
   }

   protected abstract avg gn();

   protected static enum a {
      a(0, 0.0, 0.0, 0.0),
      b(1, 0.7, 0.7, 0.8),
      c(2, 0.4, 0.3, 0.35),
      d(3, 0.7, 0.5, 0.2),
      e(4, 0.3, 0.3, 0.8),
      f(5, 0.1, 0.1, 0.2);

      private static final IntFunction<ckb.a> g = aww.a($$0 -> $$0.h, values(), aww.a.a);
      final int h;
      final double[] i;

      private a(final int $$0, final double $$1, final double $$2, final double $$3) {
         this.h = $$0;
         this.i = new double[]{$$1, $$2, $$3};
      }

      public static ckb.a a(int $$0) {
         return g.apply($$0);
      }
   }

   protected class b extends caa {
      public b() {
         this.a(EnumSet.of(caa.a.a, caa.a.b));
      }

      @Override
      public boolean a() {
         return ckb.this.gz() > 0;
      }

      @Override
      public void c() {
         super.c();
         ckb.this.bT.n();
      }

      @Override
      public void d() {
         super.d();
         ckb.this.a(ckb.a.a);
      }

      @Override
      public void e() {
         if (ckb.this.p() != null) {
            ckb.this.F().a(ckb.this.p(), (float)ckb.this.ab(), (float)ckb.this.aa());
         }
      }
   }

   protected abstract class c extends caa {
      protected int b;
      protected int c;

      @Override
      public boolean a() {
         btc $$0 = ckb.this.p();
         if ($$0 == null || !$$0.bF()) {
            return false;
         } else {
            return ckb.this.gx() ? false : ckb.this.ai >= this.c;
         }
      }

      @Override
      public boolean b() {
         btc $$0 = ckb.this.p();
         return $$0 != null && $$0.bF() && this.b > 0;
      }

      @Override
      public void c() {
         this.b = this.a(this.n());
         ckb.this.b = this.h();
         this.c = ckb.this.ai + this.i();
         avg $$0 = this.l();
         if ($$0 != null) {
            ckb.this.a($$0, 1.0F, 1.0F);
         }

         ckb.this.a(this.m());
      }

      @Override
      public void e() {
         this.b--;
         if (this.b == 0) {
            this.k();
            ckb.this.a(ckb.this.gn(), 1.0F, 1.0F);
         }
      }

      protected abstract void k();

      protected int n() {
         return 20;
      }

      protected abstract int h();

      protected abstract int i();

      @Nullable
      protected abstract avg l();

      protected abstract ckb.a m();
   }
}
