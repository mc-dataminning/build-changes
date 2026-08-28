import java.util.EnumSet;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public abstract class clk extends ckh {
   private static final akg<Byte> b = akk.a(clk.class, aki.a);
   protected int c;
   private clk.a bY = clk.a.a;

   protected clk(btv<? extends clk> $$0, deg $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(b, (byte)0);
   }

   @Override
   public void a(uf $$0) {
      super.a($$0);
      this.c = $$0.h("SpellTicks");
   }

   @Override
   public void b(uf $$0) {
      super.b($$0);
      $$0.a("SpellTicks", this.c);
   }

   @Override
   public ckh.a q() {
      if (this.gz()) {
         return ckh.a.c;
      } else {
         return this.gI() ? ckh.a.g : ckh.a.a;
      }
   }

   public boolean gz() {
      return this.dS().B ? this.am.a(b) > 0 : this.c > 0;
   }

   public void a(clk.a $$0) {
      this.bY = $$0;
      this.am.a(b, (byte)$$0.h);
   }

   protected clk.a gA() {
      return !this.dS().B ? this.bY : clk.a.a(this.am.a(b));
   }

   @Override
   protected void ad() {
      super.ad();
      if (this.c > 0) {
         this.c--;
      }
   }

   @Override
   public void l() {
      super.l();
      if (this.dS().B && this.gz()) {
         clk.a $$0 = this.gA();
         float $$1 = (float)$$0.i[0];
         float $$2 = (float)$$0.i[1];
         float $$3 = (float)$$0.i[2];
         float $$4 = this.aT * (float) (Math.PI / 180.0) + azd.b((float)this.ag * 0.6662F) * 0.25F;
         float $$5 = azd.b($$4);
         float $$6 = azd.a($$4);
         double $$7 = 0.6 * (double)this.ef();
         double $$8 = 1.8 * (double)this.ef();
         this.dS().a(lg.a(ln.u, $$1, $$2, $$3), this.dx() + (double)$$5 * $$7, this.dz() + $$8, this.dD() + (double)$$6 * $$7, 0.0, 0.0, 0.0);
         this.dS().a(lg.a(ln.u, $$1, $$2, $$3), this.dx() - (double)$$5 * $$7, this.dz() + $$8, this.dD() - (double)$$6 * $$7, 0.0, 0.0, 0.0);
      }
   }

   protected int gB() {
      return this.c;
   }

   protected abstract awd gp();

   protected static enum a {
      a(0, 0.0, 0.0, 0.0),
      b(1, 0.7, 0.7, 0.8),
      c(2, 0.4, 0.3, 0.35),
      d(3, 0.7, 0.5, 0.2),
      e(4, 0.3, 0.3, 0.8),
      f(5, 0.1, 0.1, 0.2);

      private static final IntFunction<clk.a> g = axu.a($$0 -> $$0.h, values(), axu.a.a);
      final int h;
      final double[] i;

      private a(final int $$0, final double $$1, final double $$2, final double $$3) {
         this.h = $$0;
         this.i = new double[]{$$1, $$2, $$3};
      }

      public static clk.a a(int $$0) {
         return g.apply($$0);
      }
   }

   protected class b extends cbh {
      public b() {
         this.a(EnumSet.of(cbh.a.a, cbh.a.b));
      }

      @Override
      public boolean b() {
         return clk.this.gB() > 0;
      }

      @Override
      public void d() {
         super.d();
         clk.this.bR.o();
      }

      @Override
      public void e() {
         super.e();
         clk.this.a(clk.a.a);
      }

      @Override
      public void a() {
         if (clk.this.m() != null) {
            clk.this.K().a(clk.this.m(), (float)clk.this.ag(), (float)clk.this.ae());
         }
      }
   }

   protected abstract class c extends cbh {
      protected int b;
      protected int c;

      @Override
      public boolean b() {
         buk $$0 = clk.this.m();
         if ($$0 == null || !$$0.bI()) {
            return false;
         } else {
            return clk.this.gz() ? false : clk.this.ag >= this.c;
         }
      }

      @Override
      public boolean c() {
         buk $$0 = clk.this.m();
         return $$0 != null && $$0.bI() && this.b > 0;
      }

      @Override
      public void d() {
         this.b = this.a(this.n());
         clk.this.c = this.h();
         this.c = clk.this.ag + this.i();
         awd $$0 = this.l();
         if ($$0 != null) {
            clk.this.a($$0, 1.0F, 1.0F);
         }

         clk.this.a(this.m());
      }

      @Override
      public void a() {
         this.b--;
         if (this.b == 0) {
            this.k();
            clk.this.a(clk.this.gp(), 1.0F, 1.0F);
         }
      }

      protected abstract void k();

      protected int n() {
         return 20;
      }

      protected abstract int h();

      protected abstract int i();

      @Nullable
      protected abstract awd l();

      protected abstract clk.a m();
   }
}
