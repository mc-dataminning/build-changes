import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class det extends dff {
   protected static final ews a = dff.a(1.0, 0.0, 1.0, 15.0, 0.5, 15.0);
   protected static final ews b = dff.a(1.0, 0.0, 1.0, 15.0, 1.0, 15.0);
   protected static final evu c = new evu(0.0625, 0.0, 0.0625, 0.9375, 0.25, 0.9375);
   protected final dsw d;

   protected det(dsg.d $$0, dsw $$1) {
      super($$0.a($$1.g()));
      this.d = $$1;
   }

   @Override
   protected abstract MapCodec<? extends det> a();

   @Override
   protected ews a(dsh $$0, dbj $$1, ja $$2, ewe $$3) {
      return this.g($$0) > 0 ? a : b;
   }

   protected int b() {
      return 20;
   }

   @Override
   public boolean a(dsh $$0) {
      return true;
   }

   @Override
   protected dsh a(dsh $$0, jf $$1, dsh $$2, dce $$3, ja $$4, ja $$5) {
      return $$1 == jf.a && !$$0.a($$3, $$4) ? dfh.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dsh $$0, dcg $$1, ja $$2) {
      ja $$3 = $$2.d();
      return c($$1, $$3) || a($$1, $$3, jf.b);
   }

   @Override
   protected void a(dsh $$0, aqk $$1, ja $$2, aym $$3) {
      int $$4 = this.g($$0);
      if ($$4 > 0) {
         this.a(null, $$1, $$2, $$0, $$4);
      }
   }

   @Override
   protected void a(dsh $$0, dcd $$1, ja $$2, bsd $$3) {
      if (!$$1.B) {
         int $$4 = this.g($$0);
         if ($$4 == 0) {
            this.a($$3, $$1, $$2, $$0, $$4);
         }
      }
   }

   private void a(@Nullable bsd $$0, dcd $$1, ja $$2, dsh $$3, int $$4) {
      int $$5 = this.b($$1, $$2);
      boolean $$6 = $$4 > 0;
      boolean $$7 = $$5 > 0;
      if ($$4 != $$5) {
         dsh $$8 = this.a($$3, $$5);
         $$1.a($$2, $$8, 2);
         this.a($$1, $$2);
         $$1.b($$2, $$3, $$8);
      }

      if (!$$7 && $$6) {
         $$1.a(null, $$2, this.d.l(), avg.e);
         $$1.a($$0, dxa.e, $$2);
      } else if ($$7 && !$$6) {
         $$1.a(null, $$2, this.d.m(), avg.e);
         $$1.a($$0, dxa.a, $$2);
      }

      if ($$7) {
         $$1.a(new ja($$2), this, this.b());
      }
   }

   @Override
   protected void a(dsh $$0, dcd $$1, ja $$2, dsh $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         if (this.g($$0) > 0) {
            this.a($$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   protected void a(dcd $$0, ja $$1) {
      $$0.a($$1, this);
      $$0.a($$1.d(), this);
   }

   @Override
   protected int a(dsh $$0, dbj $$1, ja $$2, jf $$3) {
      return this.g($$0);
   }

   @Override
   protected int b(dsh $$0, dbj $$1, ja $$2, jf $$3) {
      return $$3 == jf.b ? this.g($$0) : 0;
   }

   @Override
   protected boolean e_(dsh $$0) {
      return true;
   }

   protected static int a(dcd $$0, evu $$1, Class<? extends bsd> $$2) {
      return $$0.a($$2, $$1, bsi.f.and($$0x -> !$$0x.r_())).size();
   }

   protected abstract int b(dcd var1, ja var2);

   protected abstract int g(dsh var1);

   protected abstract dsh a(dsh var1, int var2);
}
