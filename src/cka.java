import java.util.EnumSet;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public abstract class cka extends cix {
   private static final ajp<Byte> e = ajt.a(cka.class, ajr.a);
   protected int b;
   private cka.a ca = cka.a.a;

   protected cka(bsm<? extends cka> $$0, dcf $$1) {
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
   public cix.a s() {
      if (this.gy()) {
         return cix.a.c;
      } else {
         return this.gH() ? cix.a.g : cix.a.a;
      }
   }

   public boolean gy() {
      return this.dQ().B ? this.ao.a(e) > 0 : this.b > 0;
   }

   public void a(cka.a $$0) {
      this.ca = $$0;
      this.ao.a(e, (byte)$$0.h);
   }

   protected cka.a gz() {
      return !this.dQ().B ? this.ca : cka.a.a(this.ao.a(e));
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
      if (this.dQ().B && this.gy()) {
         cka.a $$0 = this.gz();
         float $$1 = (float)$$0.i[0];
         float $$2 = (float)$$0.i[1];
         float $$3 = (float)$$0.i[2];
         float $$4 = this.aY * (float) (Math.PI / 180.0) + ayg.b((float)this.ai * 0.6662F) * 0.25F;
         float $$5 = ayg.b($$4);
         float $$6 = ayg.a($$4);
         double $$7 = 0.6 * (double)this.ec();
         double $$8 = 1.8 * (double)this.ec();
         this.dQ().a(lc.a(lj.u, $$1, $$2, $$3), this.dv() + (double)$$5 * $$7, this.dx() + $$8, this.dB() + (double)$$6 * $$7, 0.0, 0.0, 0.0);
         this.dQ().a(lc.a(lj.u, $$1, $$2, $$3), this.dv() - (double)$$5 * $$7, this.dx() + $$8, this.dB() - (double)$$6 * $$7, 0.0, 0.0, 0.0);
      }
   }

   protected int gA() {
      return this.b;
   }

   protected abstract avg go();

   protected static enum a {
      a(0, 0.0, 0.0, 0.0),
      b(1, 0.7, 0.7, 0.8),
      c(2, 0.4, 0.3, 0.35),
      d(3, 0.7, 0.5, 0.2),
      e(4, 0.3, 0.3, 0.8),
      f(5, 0.1, 0.1, 0.2);

      private static final IntFunction<cka.a> g = aww.a($$0 -> $$0.h, values(), aww.a.a);
      final int h;
      final double[] i;

      private a(final int $$0, final double $$1, final double $$2, final double $$3) {
         this.h = $$0;
         this.i = new double[]{$$1, $$2, $$3};
      }

      public static cka.a a(int $$0) {
         return g.apply($$0);
      }
   }

   protected class b extends bzz {
      public b() {
         this.a(EnumSet.of(bzz.a.a, bzz.a.b));
      }

      @Override
      public boolean a() {
         return cka.this.gA() > 0;
      }

      @Override
      public void c() {
         super.c();
         cka.this.bT.n();
      }

      @Override
      public void d() {
         super.d();
         cka.this.a(cka.a.a);
      }

      @Override
      public void e() {
         if (cka.this.p() != null) {
            cka.this.G().a(cka.this.p(), (float)cka.this.ab(), (float)cka.this.aa());
         }
      }
   }

   protected abstract class c extends bzz {
      protected int b;
      protected int c;

      @Override
      public boolean a() {
         btb $$0 = cka.this.p();
         if ($$0 == null || !$$0.bE()) {
            return false;
         } else {
            return cka.this.gy() ? false : cka.this.ai >= this.c;
         }
      }

      @Override
      public boolean b() {
         btb $$0 = cka.this.p();
         return $$0 != null && $$0.bE() && this.b > 0;
      }

      @Override
      public void c() {
         this.b = this.a(this.n());
         cka.this.b = this.h();
         this.c = cka.this.ai + this.i();
         avg $$0 = this.l();
         if ($$0 != null) {
            cka.this.a($$0, 1.0F, 1.0F);
         }

         cka.this.a(this.m());
      }

      @Override
      public void e() {
         this.b--;
         if (this.b == 0) {
            this.k();
            cka.this.a(cka.this.go(), 1.0F, 1.0F);
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

      protected abstract cka.a m();
   }
}
