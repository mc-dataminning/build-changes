import java.util.EnumSet;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public abstract class cmf extends clc {
   private static final ako<Byte> b = aks.a(cmf.class, akq.a);
   protected int c;
   private cmf.a bY = cmf.a.a;

   protected cmf(bup<? extends cmf> $$0, dff $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(aks.a $$0) {
      super.a($$0);
      $$0.a(b, (byte)0);
   }

   @Override
   public void a(un $$0) {
      super.a($$0);
      this.c = $$0.h("SpellTicks");
   }

   @Override
   public void b(un $$0) {
      super.b($$0);
      $$0.a("SpellTicks", this.c);
   }

   @Override
   public clc.a q() {
      if (this.gF()) {
         return clc.a.c;
      } else {
         return this.gO() ? clc.a.g : clc.a.a;
      }
   }

   public boolean gF() {
      return this.dY().C ? this.am.a(b) > 0 : this.c > 0;
   }

   public void a(cmf.a $$0) {
      this.bY = $$0;
      this.am.a(b, (byte)$$0.h);
   }

   protected cmf.a gG() {
      return !this.dY().C ? this.bY : cmf.a.a(this.am.a(b));
   }

   @Override
   protected void ac() {
      super.ac();
      if (this.c > 0) {
         this.c--;
      }
   }

   @Override
   public void l() {
      super.l();
      if (this.dY().C && this.gF()) {
         cmf.a $$0 = this.gG();
         float $$1 = (float)$$0.i[0];
         float $$2 = (float)$$0.i[1];
         float $$3 = (float)$$0.i[2];
         float $$4 = this.aX * (float) (Math.PI / 180.0) + azn.b((float)this.ag * 0.6662F) * 0.25F;
         float $$5 = azn.b($$4);
         float $$6 = azn.a($$4);
         double $$7 = 0.6 * (double)this.em();
         double $$8 = 1.8 * (double)this.em();
         this.dY().a(ll.a(ls.u, $$1, $$2, $$3), this.dD() + (double)$$5 * $$7, this.dF() + $$8, this.dJ() + (double)$$6 * $$7, 0.0, 0.0, 0.0);
         this.dY().a(ll.a(ls.u, $$1, $$2, $$3), this.dD() - (double)$$5 * $$7, this.dF() + $$8, this.dJ() - (double)$$6 * $$7, 0.0, 0.0, 0.0);
      }
   }

   protected int gH() {
      return this.c;
   }

   protected abstract awn gv();

   protected static enum a {
      a(0, 0.0, 0.0, 0.0),
      b(1, 0.7, 0.7, 0.8),
      c(2, 0.4, 0.3, 0.35),
      d(3, 0.7, 0.5, 0.2),
      e(4, 0.3, 0.3, 0.8),
      f(5, 0.1, 0.1, 0.2);

      private static final IntFunction<cmf.a> g = aye.a($$0 -> $$0.h, values(), aye.a.a);
      final int h;
      final double[] i;

      private a(final int $$0, final double $$1, final double $$2, final double $$3) {
         this.h = $$0;
         this.i = new double[]{$$1, $$2, $$3};
      }

      public static cmf.a a(int $$0) {
         return g.apply($$0);
      }
   }

   protected class b extends ccc {
      public b() {
         this.a(EnumSet.of(ccc.a.a, ccc.a.b));
      }

      @Override
      public boolean b() {
         return cmf.this.gH() > 0;
      }

      @Override
      public void d() {
         super.d();
         cmf.this.bR.o();
      }

      @Override
      public void e() {
         super.e();
         cmf.this.a(cmf.a.a);
      }

      @Override
      public void a() {
         if (cmf.this.m() != null) {
            cmf.this.K().a(cmf.this.m(), (float)cmf.this.ae(), (float)cmf.this.ad());
         }
      }
   }

   protected abstract class c extends ccc {
      protected int b;
      protected int c;

      @Override
      public boolean b() {
         bve $$0 = cmf.this.m();
         if ($$0 == null || !$$0.bN()) {
            return false;
         } else {
            return cmf.this.gF() ? false : cmf.this.ag >= this.c;
         }
      }

      @Override
      public boolean c() {
         bve $$0 = cmf.this.m();
         return $$0 != null && $$0.bN() && this.b > 0;
      }

      @Override
      public void d() {
         this.b = this.a(this.n());
         cmf.this.c = this.h();
         this.c = cmf.this.ag + this.i();
         awn $$0 = this.l();
         if ($$0 != null) {
            cmf.this.a($$0, 1.0F, 1.0F);
         }

         cmf.this.a(this.m());
      }

      @Override
      public void a() {
         this.b--;
         if (this.b == 0) {
            this.k();
            cmf.this.a(cmf.this.gv(), 1.0F, 1.0F);
         }
      }

      protected abstract void k();

      protected int n() {
         return 20;
      }

      protected abstract int h();

      protected abstract int i();

      @Nullable
      protected abstract awn l();

      protected abstract cmf.a m();
   }
}
