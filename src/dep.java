import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dep extends dfb {
   protected static final ewm a = dfb.a(1.0, 0.0, 1.0, 15.0, 0.5, 15.0);
   protected static final ewm b = dfb.a(1.0, 0.0, 1.0, 15.0, 1.0, 15.0);
   protected static final evo c = new evo(0.0625, 0.0, 0.0625, 0.9375, 0.25, 0.9375);
   protected final dst d;

   protected dep(dsd.d $$0, dst $$1) {
      super($$0.a($$1.g()));
      this.d = $$1;
   }

   @Override
   protected abstract MapCodec<? extends dep> a();

   @Override
   protected ewm a(dse $$0, dbg $$1, iz $$2, evy $$3) {
      return this.g($$0) > 0 ? a : b;
   }

   protected int b() {
      return 20;
   }

   @Override
   public boolean a(dse $$0) {
      return true;
   }

   @Override
   protected dse a(dse $$0, je $$1, dse $$2, dcb $$3, iz $$4, iz $$5) {
      return $$1 == je.a && !$$0.a($$3, $$4) ? dfd.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dse $$0, dcd $$1, iz $$2) {
      iz $$3 = $$2.d();
      return c($$1, $$3) || a($$1, $$3, je.b);
   }

   @Override
   protected void a(dse $$0, arf $$1, iz $$2, azh $$3) {
      int $$4 = this.g($$0);
      if ($$4 > 0) {
         this.a(null, $$1, $$2, $$0, $$4);
      }
   }

   @Override
   protected void a(dse $$0, dca $$1, iz $$2, bsw $$3) {
      if (!$$1.B) {
         int $$4 = this.g($$0);
         if ($$4 == 0) {
            this.a($$3, $$1, $$2, $$0, $$4);
         }
      }
   }

   private void a(@Nullable bsw $$0, dca $$1, iz $$2, dse $$3, int $$4) {
      int $$5 = this.b($$1, $$2);
      boolean $$6 = $$4 > 0;
      boolean $$7 = $$5 > 0;
      if ($$4 != $$5) {
         dse $$8 = this.a($$3, $$5);
         $$1.a($$2, $$8, 2);
         this.a($$1, $$2);
         $$1.b($$2, $$3, $$8);
      }

      if (!$$7 && $$6) {
         $$1.a(null, $$2, this.d.l(), awb.e);
         $$1.a($$0, dwx.e, $$2);
      } else if ($$7 && !$$6) {
         $$1.a(null, $$2, this.d.m(), awb.e);
         $$1.a($$0, dwx.a, $$2);
      }

      if ($$7) {
         $$1.a(new iz($$2), this, this.b());
      }
   }

   @Override
   protected void a(dse $$0, dca $$1, iz $$2, dse $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         if (this.g($$0) > 0) {
            this.a($$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   protected void a(dca $$0, iz $$1) {
      $$0.a($$1, this);
      $$0.a($$1.d(), this);
   }

   @Override
   protected int a(dse $$0, dbg $$1, iz $$2, je $$3) {
      return this.g($$0);
   }

   @Override
   protected int b(dse $$0, dbg $$1, iz $$2, je $$3) {
      return $$3 == je.b ? this.g($$0) : 0;
   }

   @Override
   protected boolean e_(dse $$0) {
      return true;
   }

   protected static int a(dca $$0, evo $$1, Class<? extends bsw> $$2) {
      return $$0.a($$2, $$1, btb.f.and($$0x -> !$$0x.r_())).size();
   }

   protected abstract int b(dca var1, iz var2);

   protected abstract int g(dse var1);

   protected abstract dse a(dse var1, int var2);
}
