import java.util.EnumSet;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public abstract class clw extends ckt {
   private static final akk<Byte> b = ako.a(clw.class, akm.a);
   protected int c;
   private clw.a bY = clw.a.a;

   protected clw(bug<? extends clw> $$0, dev $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(ako.a $$0) {
      super.a($$0);
      $$0.a(b, (byte)0);
   }

   @Override
   public void a(uj $$0) {
      super.a($$0);
      this.c = $$0.h("SpellTicks");
   }

   @Override
   public void b(uj $$0) {
      super.b($$0);
      $$0.a("SpellTicks", this.c);
   }

   @Override
   public ckt.a q() {
      if (this.gF()) {
         return ckt.a.c;
      } else {
         return this.gO() ? ckt.a.g : ckt.a.a;
      }
   }

   public boolean gF() {
      return this.dX().C ? this.am.a(b) > 0 : this.c > 0;
   }

   public void a(clw.a $$0) {
      this.bY = $$0;
      this.am.a(b, (byte)$$0.h);
   }

   protected clw.a gG() {
      return !this.dX().C ? this.bY : clw.a.a(this.am.a(b));
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
      if (this.dX().C && this.gF()) {
         clw.a $$0 = this.gG();
         float $$1 = (float)$$0.i[0];
         float $$2 = (float)$$0.i[1];
         float $$3 = (float)$$0.i[2];
         float $$4 = this.aU * (float) (Math.PI / 180.0) + azj.b((float)this.ag * 0.6662F) * 0.25F;
         float $$5 = azj.b($$4);
         float $$6 = azj.a($$4);
         double $$7 = 0.6 * (double)this.el();
         double $$8 = 1.8 * (double)this.el();
         this.dX().a(lj.a(lq.u, $$1, $$2, $$3), this.dC() + (double)$$5 * $$7, this.dE() + $$8, this.dI() + (double)$$6 * $$7, 0.0, 0.0, 0.0);
         this.dX().a(lj.a(lq.u, $$1, $$2, $$3), this.dC() - (double)$$5 * $$7, this.dE() + $$8, this.dI() - (double)$$6 * $$7, 0.0, 0.0, 0.0);
      }
   }

   protected int gH() {
      return this.c;
   }

   protected abstract awj gv();

   protected static enum a {
      a(0, 0.0, 0.0, 0.0),
      b(1, 0.7, 0.7, 0.8),
      c(2, 0.4, 0.3, 0.35),
      d(3, 0.7, 0.5, 0.2),
      e(4, 0.3, 0.3, 0.8),
      f(5, 0.1, 0.1, 0.2);

      private static final IntFunction<clw.a> g = aya.a($$0 -> $$0.h, values(), aya.a.a);
      final int h;
      final double[] i;

      private a(final int $$0, final double $$1, final double $$2, final double $$3) {
         this.h = $$0;
         this.i = new double[]{$$1, $$2, $$3};
      }

      public static clw.a a(int $$0) {
         return g.apply($$0);
      }
   }

   protected class b extends cbt {
      public b() {
         this.a(EnumSet.of(cbt.a.a, cbt.a.b));
      }

      @Override
      public boolean b() {
         return clw.this.gH() > 0;
      }

      @Override
      public void d() {
         super.d();
         clw.this.bR.o();
      }

      @Override
      public void e() {
         super.e();
         clw.this.a(clw.a.a);
      }

      @Override
      public void a() {
         if (clw.this.m() != null) {
            clw.this.K().a(clw.this.m(), (float)clw.this.ae(), (float)clw.this.ad());
         }
      }
   }

   protected abstract class c extends cbt {
      protected int b;
      protected int c;

      @Override
      public boolean b() {
         buv $$0 = clw.this.m();
         if ($$0 == null || !$$0.bM()) {
            return false;
         } else {
            return clw.this.gF() ? false : clw.this.ag >= this.c;
         }
      }

      @Override
      public boolean c() {
         buv $$0 = clw.this.m();
         return $$0 != null && $$0.bM() && this.b > 0;
      }

      @Override
      public void d() {
         this.b = this.a(this.n());
         clw.this.c = this.h();
         this.c = clw.this.ag + this.i();
         awj $$0 = this.l();
         if ($$0 != null) {
            clw.this.a($$0, 1.0F, 1.0F);
         }

         clw.this.a(this.m());
      }

      @Override
      public void a() {
         this.b--;
         if (this.b == 0) {
            this.k();
            clw.this.a(clw.this.gv(), 1.0F, 1.0F);
         }
      }

      protected abstract void k();

      protected int n() {
         return 20;
      }

      protected abstract int h();

      protected abstract int i();

      @Nullable
      protected abstract awj l();

      protected abstract clw.a m();
   }
}
