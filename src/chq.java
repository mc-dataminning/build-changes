import java.util.EnumSet;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public abstract class chq extends cgn {
   private static final aja<Byte> e = aje.a(chq.class, ajc.a);
   protected int b;
   private chq.a bX = chq.a.a;

   protected chq(bqg<? extends chq> $$0, czg $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(aje.a $$0) {
      super.a($$0);
      $$0.a(e, (byte)0);
   }

   @Override
   public void a(to $$0) {
      super.a($$0);
      this.b = $$0.h("SpellTicks");
   }

   @Override
   public void b(to $$0) {
      super.b($$0);
      $$0.a("SpellTicks", this.b);
   }

   @Override
   public cgn.a r() {
      if (this.gx()) {
         return cgn.a.c;
      } else {
         return this.gE() ? cgn.a.g : cgn.a.a;
      }
   }

   public boolean gx() {
      return this.dM().B ? this.an.a(e) > 0 : this.b > 0;
   }

   public void a(chq.a $$0) {
      this.bX = $$0;
      this.an.a(e, (byte)$$0.h);
   }

   protected chq.a gy() {
      return !this.dM().B ? this.bX : chq.a.a(this.an.a(e));
   }

   @Override
   protected void Y() {
      super.Y();
      if (this.b > 0) {
         this.b--;
      }
   }

   @Override
   public void l() {
      super.l();
      if (this.dM().B && this.gx()) {
         chq.a $$0 = this.gy();
         double $$1 = $$0.i[0];
         double $$2 = $$0.i[1];
         double $$3 = $$0.i[2];
         float $$4 = this.aX * (float) (Math.PI / 180.0) + axm.b((float)this.ah * 0.6662F) * 0.25F;
         float $$5 = axm.b($$4);
         float $$6 = axm.a($$4);
         double $$7 = 0.6 * (double)this.eb();
         double $$8 = 1.8 * (double)this.eb();
         this.dM().a(kn.v, this.dr() + (double)$$5 * $$7, this.dt() + $$8, this.dx() + (double)$$6 * $$7, $$1, $$2, $$3);
         this.dM().a(kn.v, this.dr() - (double)$$5 * $$7, this.dt() + $$8, this.dx() - (double)$$6 * $$7, $$1, $$2, $$3);
      }
   }

   protected int gz() {
      return this.b;
   }

   protected abstract aun gn();

   protected static enum a {
      a(0, 0.0, 0.0, 0.0),
      b(1, 0.7, 0.7, 0.8),
      c(2, 0.4, 0.3, 0.35),
      d(3, 0.7, 0.5, 0.2),
      e(4, 0.3, 0.3, 0.8),
      f(5, 0.1, 0.1, 0.2);

      private static final IntFunction<chq.a> g = awd.a($$0 -> $$0.h, values(), awd.a.a);
      final int h;
      final double[] i;

      private a(int $$0, double $$1, double $$2, double $$3) {
         this.h = $$0;
         this.i = new double[]{$$1, $$2, $$3};
      }

      public static chq.a a(int $$0) {
         return g.apply($$0);
      }
   }

   protected class b extends bxq {
      public b() {
         this.a(EnumSet.of(bxq.a.a, bxq.a.b));
      }

      @Override
      public boolean a() {
         return chq.this.gz() > 0;
      }

      @Override
      public void c() {
         super.c();
         chq.this.bQ.n();
      }

      @Override
      public void d() {
         super.d();
         chq.this.a(chq.a.a);
      }

      @Override
      public void e() {
         if (chq.this.p() != null) {
            chq.this.G().a(chq.this.p(), (float)chq.this.aa(), (float)chq.this.Z());
         }
      }
   }

   protected abstract class c extends bxq {
      protected int b;
      protected int c;

      @Override
      public boolean a() {
         bqt $$0 = chq.this.p();
         if ($$0 == null || !$$0.bA()) {
            return false;
         } else {
            return chq.this.gx() ? false : chq.this.ah >= this.c;
         }
      }

      @Override
      public boolean b() {
         bqt $$0 = chq.this.p();
         return $$0 != null && $$0.bA() && this.b > 0;
      }

      @Override
      public void c() {
         this.b = this.a(this.n());
         chq.this.b = this.h();
         this.c = chq.this.ah + this.i();
         aun $$0 = this.l();
         if ($$0 != null) {
            chq.this.a($$0, 1.0F, 1.0F);
         }

         chq.this.a(this.m());
      }

      @Override
      public void e() {
         this.b--;
         if (this.b == 0) {
            this.k();
            chq.this.a(chq.this.gn(), 1.0F, 1.0F);
         }
      }

      protected abstract void k();

      protected int n() {
         return 20;
      }

      protected abstract int h();

      protected abstract int i();

      @Nullable
      protected abstract aun l();

      protected abstract chq.a m();
   }
}
