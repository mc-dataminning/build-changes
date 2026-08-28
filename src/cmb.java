import java.util.EnumSet;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public abstract class cmb extends cky {
   private static final akl<Byte> b = akp.a(cmb.class, akn.a);
   protected int c;
   private cmb.a bY = cmb.a.a;

   protected cmb(bul<? extends cmb> $$0, dfb $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(akp.a $$0) {
      super.a($$0);
      $$0.a(b, (byte)0);
   }

   @Override
   public void a(uk $$0) {
      super.a($$0);
      this.c = $$0.h("SpellTicks");
   }

   @Override
   public void b(uk $$0) {
      super.b($$0);
      $$0.a("SpellTicks", this.c);
   }

   @Override
   public cky.a q() {
      if (this.gE()) {
         return cky.a.c;
      } else {
         return this.gN() ? cky.a.g : cky.a.a;
      }
   }

   public boolean gE() {
      return this.dX().C ? this.am.a(b) > 0 : this.c > 0;
   }

   public void a(cmb.a $$0) {
      this.bY = $$0;
      this.am.a(b, (byte)$$0.h);
   }

   protected cmb.a gF() {
      return !this.dX().C ? this.bY : cmb.a.a(this.am.a(b));
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
      if (this.dX().C && this.gE()) {
         cmb.a $$0 = this.gF();
         float $$1 = (float)$$0.i[0];
         float $$2 = (float)$$0.i[1];
         float $$3 = (float)$$0.i[2];
         float $$4 = this.aX * (float) (Math.PI / 180.0) + azk.b((float)this.ag * 0.6662F) * 0.25F;
         float $$5 = azk.b($$4);
         float $$6 = azk.a($$4);
         double $$7 = 0.6 * (double)this.el();
         double $$8 = 1.8 * (double)this.el();
         this.dX().a(lk.a(lr.u, $$1, $$2, $$3), this.dC() + (double)$$5 * $$7, this.dE() + $$8, this.dI() + (double)$$6 * $$7, 0.0, 0.0, 0.0);
         this.dX().a(lk.a(lr.u, $$1, $$2, $$3), this.dC() - (double)$$5 * $$7, this.dE() + $$8, this.dI() - (double)$$6 * $$7, 0.0, 0.0, 0.0);
      }
   }

   protected int gG() {
      return this.c;
   }

   protected abstract awk gu();

   protected static enum a {
      a(0, 0.0, 0.0, 0.0),
      b(1, 0.7, 0.7, 0.8),
      c(2, 0.4, 0.3, 0.35),
      d(3, 0.7, 0.5, 0.2),
      e(4, 0.3, 0.3, 0.8),
      f(5, 0.1, 0.1, 0.2);

      private static final IntFunction<cmb.a> g = ayb.a($$0 -> $$0.h, values(), ayb.a.a);
      final int h;
      final double[] i;

      private a(final int $$0, final double $$1, final double $$2, final double $$3) {
         this.h = $$0;
         this.i = new double[]{$$1, $$2, $$3};
      }

      public static cmb.a a(int $$0) {
         return g.apply($$0);
      }
   }

   protected class b extends cby {
      public b() {
         this.a(EnumSet.of(cby.a.a, cby.a.b));
      }

      @Override
      public boolean b() {
         return cmb.this.gG() > 0;
      }

      @Override
      public void d() {
         super.d();
         cmb.this.bR.o();
      }

      @Override
      public void e() {
         super.e();
         cmb.this.a(cmb.a.a);
      }

      @Override
      public void a() {
         if (cmb.this.m() != null) {
            cmb.this.K().a(cmb.this.m(), (float)cmb.this.ae(), (float)cmb.this.ad());
         }
      }
   }

   protected abstract class c extends cby {
      protected int b;
      protected int c;

      @Override
      public boolean b() {
         bva $$0 = cmb.this.m();
         if ($$0 == null || !$$0.bM()) {
            return false;
         } else {
            return cmb.this.gE() ? false : cmb.this.ag >= this.c;
         }
      }

      @Override
      public boolean c() {
         bva $$0 = cmb.this.m();
         return $$0 != null && $$0.bM() && this.b > 0;
      }

      @Override
      public void d() {
         this.b = this.a(this.n());
         cmb.this.c = this.h();
         this.c = cmb.this.ag + this.i();
         awk $$0 = this.l();
         if ($$0 != null) {
            cmb.this.a($$0, 1.0F, 1.0F);
         }

         cmb.this.a(this.m());
      }

      @Override
      public void a() {
         this.b--;
         if (this.b == 0) {
            this.k();
            cmb.this.a(cmb.this.gu(), 1.0F, 1.0F);
         }
      }

      protected abstract void k();

      protected int n() {
         return 20;
      }

      protected abstract int h();

      protected abstract int i();

      @Nullable
      protected abstract awk l();

      protected abstract cmb.a m();
   }
}
