import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dew extends dfi {
   protected static final exa a = dfi.a(1.0, 0.0, 1.0, 15.0, 0.5, 15.0);
   protected static final exa b = dfi.a(1.0, 0.0, 1.0, 15.0, 1.0, 15.0);
   protected static final ewc c = new ewc(0.0625, 0.0, 0.0625, 0.9375, 0.25, 0.9375);
   protected final dta d;

   protected dew(dsk.d $$0, dta $$1) {
      super($$0.a($$1.g()));
      this.d = $$1;
   }

   @Override
   protected abstract MapCodec<? extends dew> a();

   @Override
   protected exa a(dsl $$0, dbm $$1, ja $$2, ewm $$3) {
      return this.g($$0) > 0 ? a : b;
   }

   protected int b() {
      return 20;
   }

   @Override
   public boolean a(dsl $$0) {
      return true;
   }

   @Override
   protected dsl a(dsl $$0, jf $$1, dsl $$2, dch $$3, ja $$4, ja $$5) {
      return $$1 == jf.a && !$$0.a($$3, $$4) ? dfk.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dsl $$0, dcj $$1, ja $$2) {
      ja $$3 = $$2.d();
      return c($$1, $$3) || a($$1, $$3, jf.b);
   }

   @Override
   protected void a(dsl $$0, aqm $$1, ja $$2, ayo $$3) {
      int $$4 = this.g($$0);
      if ($$4 > 0) {
         this.a(null, $$1, $$2, $$0, $$4);
      }
   }

   @Override
   protected void a(dsl $$0, dcg $$1, ja $$2, bsh $$3) {
      if (!$$1.B) {
         int $$4 = this.g($$0);
         if ($$4 == 0) {
            this.a($$3, $$1, $$2, $$0, $$4);
         }
      }
   }

   private void a(@Nullable bsh $$0, dcg $$1, ja $$2, dsl $$3, int $$4) {
      int $$5 = this.b($$1, $$2);
      boolean $$6 = $$4 > 0;
      boolean $$7 = $$5 > 0;
      if ($$4 != $$5) {
         dsl $$8 = this.a($$3, $$5);
         $$1.a($$2, $$8, 2);
         this.a($$1, $$2);
         $$1.b($$2, $$3, $$8);
      }

      if (!$$7 && $$6) {
         $$1.a(null, $$2, this.d.l(), avi.e);
         $$1.a($$0, dxh.e, $$2);
      } else if ($$7 && !$$6) {
         $$1.a(null, $$2, this.d.m(), avi.e);
         $$1.a($$0, dxh.a, $$2);
      }

      if ($$7) {
         $$1.a(new ja($$2), this, this.b());
      }
   }

   @Override
   protected void a(dsl $$0, dcg $$1, ja $$2, dsl $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         if (this.g($$0) > 0) {
            this.a($$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   protected void a(dcg $$0, ja $$1) {
      $$0.a($$1, this);
      $$0.a($$1.d(), this);
   }

   @Override
   protected int a(dsl $$0, dbm $$1, ja $$2, jf $$3) {
      return this.g($$0);
   }

   @Override
   protected int b(dsl $$0, dbm $$1, ja $$2, jf $$3) {
      return $$3 == jf.b ? this.g($$0) : 0;
   }

   @Override
   protected boolean e_(dsl $$0) {
      return true;
   }

   protected static int a(dcg $$0, ewc $$1, Class<? extends bsh> $$2) {
      return $$0.a($$2, $$1, bsm.f.and($$0x -> !$$0x.r_())).size();
   }

   protected abstract int b(dcg var1, ja var2);

   protected abstract int g(dsl var1);

   protected abstract dsl a(dsl var1, int var2);
}
