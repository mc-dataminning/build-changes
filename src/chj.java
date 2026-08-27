import java.util.EnumSet;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public abstract class chj extends cgg {
   private static final aiy<Byte> e = ajc.a(chj.class, aja.a);
   protected int b;
   private chj.a bX = chj.a.a;

   protected chj(bqb<? extends chj> $$0, cyx $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(ajc.a $$0) {
      super.a($$0);
      $$0.a(e, (byte)0);
   }

   @Override
   public void a(tm $$0) {
      super.a($$0);
      this.b = $$0.h("SpellTicks");
   }

   @Override
   public void b(tm $$0) {
      super.b($$0);
      $$0.a("SpellTicks", this.b);
   }

   @Override
   public cgg.a r() {
      if (this.gx()) {
         return cgg.a.c;
      } else {
         return this.gE() ? cgg.a.g : cgg.a.a;
      }
   }

   public boolean gx() {
      return this.dM().B ? this.an.a(e) > 0 : this.b > 0;
   }

   public void a(chj.a $$0) {
      this.bX = $$0;
      this.an.a(e, (byte)$$0.h);
   }

   protected chj.a gy() {
      return !this.dM().B ? this.bX : chj.a.a(this.an.a(e));
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
         chj.a $$0 = this.gy();
         double $$1 = $$0.i[0];
         double $$2 = $$0.i[1];
         double $$3 = $$0.i[2];
         float $$4 = this.aX * (float) (Math.PI / 180.0) + axk.b((float)this.ah * 0.6662F) * 0.25F;
         float $$5 = axk.b($$4);
         float $$6 = axk.a($$4);
         double $$7 = 0.6 * (double)this.eb();
         double $$8 = 1.8 * (double)this.eb();
         this.dM().a(kl.v, this.dr() + (double)$$5 * $$7, this.dt() + $$8, this.dx() + (double)$$6 * $$7, $$1, $$2, $$3);
         this.dM().a(kl.v, this.dr() - (double)$$5 * $$7, this.dt() + $$8, this.dx() - (double)$$6 * $$7, $$1, $$2, $$3);
      }
   }

   protected int gz() {
      return this.b;
   }

   protected abstract aul gn();

   protected static enum a {
      a(0, 0.0, 0.0, 0.0),
      b(1, 0.7, 0.7, 0.8),
      c(2, 0.4, 0.3, 0.35),
      d(3, 0.7, 0.5, 0.2),
      e(4, 0.3, 0.3, 0.8),
      f(5, 0.1, 0.1, 0.2);

      private static final IntFunction<chj.a> g = awb.a($$0 -> $$0.h, values(), awb.a.a);
      final int h;
      final double[] i;

      private a(int $$0, double $$1, double $$2, double $$3) {
         this.h = $$0;
         this.i = new double[]{$$1, $$2, $$3};
      }

      public static chj.a a(int $$0) {
         return g.apply($$0);
      }
   }

   protected class b extends bxl {
      public b() {
         this.a(EnumSet.of(bxl.a.a, bxl.a.b));
      }

      @Override
      public boolean a() {
         return chj.this.gz() > 0;
      }

      @Override
      public void c() {
         super.c();
         chj.this.bQ.n();
      }

      @Override
      public void d() {
         super.d();
         chj.this.a(chj.a.a);
      }

      @Override
      public void e() {
         if (chj.this.p() != null) {
            chj.this.G().a(chj.this.p(), (float)chj.this.aa(), (float)chj.this.Z());
         }
      }
   }

   protected abstract class c extends bxl {
      protected int b;
      protected int c;

      @Override
      public boolean a() {
         bqo $$0 = chj.this.p();
         if ($$0 == null || !$$0.bA()) {
            return false;
         } else {
            return chj.this.gx() ? false : chj.this.ah >= this.c;
         }
      }

      @Override
      public boolean b() {
         bqo $$0 = chj.this.p();
         return $$0 != null && $$0.bA() && this.b > 0;
      }

      @Override
      public void c() {
         this.b = this.a(this.n());
         chj.this.b = this.h();
         this.c = chj.this.ah + this.i();
         aul $$0 = this.l();
         if ($$0 != null) {
            chj.this.a($$0, 1.0F, 1.0F);
         }

         chj.this.a(this.m());
      }

      @Override
      public void e() {
         this.b--;
         if (this.b == 0) {
            this.k();
            chj.this.a(chj.this.gn(), 1.0F, 1.0F);
         }
      }

      protected abstract void k();

      protected int n() {
         return 20;
      }

      protected abstract int h();

      protected abstract int i();

      @Nullable
      protected abstract aul l();

      protected abstract chj.a m();
   }
}
