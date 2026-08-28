import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dev extends dfh {
   protected static final ewy a = dfh.a(1.0, 0.0, 1.0, 15.0, 0.5, 15.0);
   protected static final ewy b = dfh.a(1.0, 0.0, 1.0, 15.0, 1.0, 15.0);
   protected static final ewa c = new ewa(0.0625, 0.0, 0.0625, 0.9375, 0.25, 0.9375);
   protected final dsz d;

   protected dev(dsj.d $$0, dsz $$1) {
      super($$0.a($$1.g()));
      this.d = $$1;
   }

   @Override
   protected abstract MapCodec<? extends dev> a();

   @Override
   protected ewy a(dsk $$0, dbl $$1, ja $$2, ewk $$3) {
      return this.g($$0) > 0 ? a : b;
   }

   protected int b() {
      return 20;
   }

   @Override
   public boolean a(dsk $$0) {
      return true;
   }

   @Override
   protected dsk a(dsk $$0, jf $$1, dsk $$2, dcg $$3, ja $$4, ja $$5) {
      return $$1 == jf.a && !$$0.a($$3, $$4) ? dfj.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dsk $$0, dci $$1, ja $$2) {
      ja $$3 = $$2.d();
      return c($$1, $$3) || a($$1, $$3, jf.b);
   }

   @Override
   protected void a(dsk $$0, aqm $$1, ja $$2, ayo $$3) {
      int $$4 = this.g($$0);
      if ($$4 > 0) {
         this.a(null, $$1, $$2, $$0, $$4);
      }
   }

   @Override
   protected void a(dsk $$0, dcf $$1, ja $$2, bsg $$3) {
      if (!$$1.B) {
         int $$4 = this.g($$0);
         if ($$4 == 0) {
            this.a($$3, $$1, $$2, $$0, $$4);
         }
      }
   }

   private void a(@Nullable bsg $$0, dcf $$1, ja $$2, dsk $$3, int $$4) {
      int $$5 = this.b($$1, $$2);
      boolean $$6 = $$4 > 0;
      boolean $$7 = $$5 > 0;
      if ($$4 != $$5) {
         dsk $$8 = this.a($$3, $$5);
         $$1.a($$2, $$8, 2);
         this.a($$1, $$2);
         $$1.b($$2, $$3, $$8);
      }

      if (!$$7 && $$6) {
         $$1.a(null, $$2, this.d.l(), avi.e);
         $$1.a($$0, dxg.e, $$2);
      } else if ($$7 && !$$6) {
         $$1.a(null, $$2, this.d.m(), avi.e);
         $$1.a($$0, dxg.a, $$2);
      }

      if ($$7) {
         $$1.a(new ja($$2), this, this.b());
      }
   }

   @Override
   protected void a(dsk $$0, dcf $$1, ja $$2, dsk $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         if (this.g($$0) > 0) {
            this.a($$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   protected void a(dcf $$0, ja $$1) {
      $$0.a($$1, this);
      $$0.a($$1.d(), this);
   }

   @Override
   protected int a(dsk $$0, dbl $$1, ja $$2, jf $$3) {
      return this.g($$0);
   }

   @Override
   protected int b(dsk $$0, dbl $$1, ja $$2, jf $$3) {
      return $$3 == jf.b ? this.g($$0) : 0;
   }

   @Override
   protected boolean e_(dsk $$0) {
      return true;
   }

   protected static int a(dcf $$0, ewa $$1, Class<? extends bsg> $$2) {
      return $$0.a($$2, $$1, bsl.f.and($$0x -> !$$0x.r_())).size();
   }

   protected abstract int b(dcf var1, ja var2);

   protected abstract int g(dsk var1);

   protected abstract dsk a(dsk var1, int var2);
}
