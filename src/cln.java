import java.util.EnumSet;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public abstract class cln extends ckk {
   private static final akh<Byte> b = akl.a(cln.class, akj.a);
   protected int c;
   private cln.a bY = cln.a.a;

   protected cln(bty<? extends cln> $$0, dej $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(akl.a $$0) {
      super.a($$0);
      $$0.a(b, (byte)0);
   }

   @Override
   public void a(ug $$0) {
      super.a($$0);
      this.c = $$0.h("SpellTicks");
   }

   @Override
   public void b(ug $$0) {
      super.b($$0);
      $$0.a("SpellTicks", this.c);
   }

   @Override
   public ckk.a q() {
      if (this.gy()) {
         return ckk.a.c;
      } else {
         return this.gH() ? ckk.a.g : ckk.a.a;
      }
   }

   public boolean gy() {
      return this.dS().B ? this.am.a(b) > 0 : this.c > 0;
   }

   public void a(cln.a $$0) {
      this.bY = $$0;
      this.am.a(b, (byte)$$0.h);
   }

   protected cln.a gz() {
      return !this.dS().B ? this.bY : cln.a.a(this.am.a(b));
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
      if (this.dS().B && this.gy()) {
         cln.a $$0 = this.gz();
         float $$1 = (float)$$0.i[0];
         float $$2 = (float)$$0.i[1];
         float $$3 = (float)$$0.i[2];
         float $$4 = this.aT * (float) (Math.PI / 180.0) + azf.b((float)this.ag * 0.6662F) * 0.25F;
         float $$5 = azf.b($$4);
         float $$6 = azf.a($$4);
         double $$7 = 0.6 * (double)this.eg();
         double $$8 = 1.8 * (double)this.eg();
         this.dS().a(lh.a(lo.u, $$1, $$2, $$3), this.dx() + (double)$$5 * $$7, this.dz() + $$8, this.dD() + (double)$$6 * $$7, 0.0, 0.0, 0.0);
         this.dS().a(lh.a(lo.u, $$1, $$2, $$3), this.dx() - (double)$$5 * $$7, this.dz() + $$8, this.dD() - (double)$$6 * $$7, 0.0, 0.0, 0.0);
      }
   }

   protected int gA() {
      return this.c;
   }

   protected abstract awf go();

   protected static enum a {
      a(0, 0.0, 0.0, 0.0),
      b(1, 0.7, 0.7, 0.8),
      c(2, 0.4, 0.3, 0.35),
      d(3, 0.7, 0.5, 0.2),
      e(4, 0.3, 0.3, 0.8),
      f(5, 0.1, 0.1, 0.2);

      private static final IntFunction<cln.a> g = axw.a($$0 -> $$0.h, values(), axw.a.a);
      final int h;
      final double[] i;

      private a(final int $$0, final double $$1, final double $$2, final double $$3) {
         this.h = $$0;
         this.i = new double[]{$$1, $$2, $$3};
      }

      public static cln.a a(int $$0) {
         return g.apply($$0);
      }
   }

   protected class b extends cbk {
      public b() {
         this.a(EnumSet.of(cbk.a.a, cbk.a.b));
      }

      @Override
      public boolean b() {
         return cln.this.gA() > 0;
      }

      @Override
      public void d() {
         super.d();
         cln.this.bR.o();
      }

      @Override
      public void e() {
         super.e();
         cln.this.a(cln.a.a);
      }

      @Override
      public void a() {
         if (cln.this.m() != null) {
            cln.this.K().a(cln.this.m(), (float)cln.this.ae(), (float)cln.this.ad());
         }
      }
   }

   protected abstract class c extends cbk {
      protected int b;
      protected int c;

      @Override
      public boolean b() {
         bun $$0 = cln.this.m();
         if ($$0 == null || !$$0.bI()) {
            return false;
         } else {
            return cln.this.gy() ? false : cln.this.ag >= this.c;
         }
      }

      @Override
      public boolean c() {
         bun $$0 = cln.this.m();
         return $$0 != null && $$0.bI() && this.b > 0;
      }

      @Override
      public void d() {
         this.b = this.a(this.n());
         cln.this.c = this.h();
         this.c = cln.this.ag + this.i();
         awf $$0 = this.l();
         if ($$0 != null) {
            cln.this.a($$0, 1.0F, 1.0F);
         }

         cln.this.a(this.m());
      }

      @Override
      public void a() {
         this.b--;
         if (this.b == 0) {
            this.k();
            cln.this.a(cln.this.go(), 1.0F, 1.0F);
         }
      }

      protected abstract void k();

      protected int n() {
         return 20;
      }

      protected abstract int h();

      protected abstract int i();

      @Nullable
      protected abstract awf l();

      protected abstract cln.a m();
   }
}
