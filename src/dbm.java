import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dbm extends dby {
   protected static final est a = dby.a(1.0, 0.0, 1.0, 15.0, 0.5, 15.0);
   protected static final est b = dby.a(1.0, 0.0, 1.0, 15.0, 1.0, 15.0);
   protected static final erv c = new erv(0.0625, 0.0, 0.0625, 0.9375, 0.25, 0.9375);
   protected final dpo d;

   protected dbm(doy.d $$0, dpo $$1) {
      super($$0.a($$1.g()));
      this.d = $$1;
   }

   @Override
   protected abstract MapCodec<? extends dbm> a();

   @Override
   protected est a(doz $$0, cyd $$1, ib $$2, esf $$3) {
      return this.g($$0) > 0 ? a : b;
   }

   protected int b() {
      return 20;
   }

   @Override
   public boolean a(doz $$0) {
      return true;
   }

   @Override
   protected doz a(doz $$0, ih $$1, doz $$2, cyy $$3, ib $$4, ib $$5) {
      return $$1 == ih.a && !$$0.a($$3, $$4) ? dca.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(doz $$0, cza $$1, ib $$2) {
      ib $$3 = $$2.d();
      return c($$1, $$3) || a($$1, $$3, ih.b);
   }

   @Override
   protected void a(doz $$0, aps $$1, ib $$2, axr $$3) {
      int $$4 = this.g($$0);
      if ($$4 > 0) {
         this.a(null, $$1, $$2, $$0, $$4);
      }
   }

   @Override
   protected void a(doz $$0, cyx $$1, ib $$2, bpv $$3) {
      if (!$$1.B) {
         int $$4 = this.g($$0);
         if ($$4 == 0) {
            this.a($$3, $$1, $$2, $$0, $$4);
         }
      }
   }

   private void a(@Nullable bpv $$0, cyx $$1, ib $$2, doz $$3, int $$4) {
      int $$5 = this.b($$1, $$2);
      boolean $$6 = $$4 > 0;
      boolean $$7 = $$5 > 0;
      if ($$4 != $$5) {
         doz $$8 = this.a($$3, $$5);
         $$1.a($$2, $$8, 2);
         this.a($$1, $$2);
         $$1.b($$2, $$3, $$8);
      }

      if (!$$7 && $$6) {
         $$1.a(null, $$2, this.d.l(), aun.e);
         $$1.a($$0, dts.e, $$2);
      } else if ($$7 && !$$6) {
         $$1.a(null, $$2, this.d.m(), aun.e);
         $$1.a($$0, dts.a, $$2);
      }

      if ($$7) {
         $$1.a(new ib($$2), this, this.b());
      }
   }

   @Override
   protected void a(doz $$0, cyx $$1, ib $$2, doz $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         if (this.g($$0) > 0) {
            this.a($$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   protected void a(cyx $$0, ib $$1) {
      $$0.a($$1, this);
      $$0.a($$1.d(), this);
   }

   @Override
   protected int a(doz $$0, cyd $$1, ib $$2, ih $$3) {
      return this.g($$0);
   }

   @Override
   protected int b(doz $$0, cyd $$1, ib $$2, ih $$3) {
      return $$3 == ih.b ? this.g($$0) : 0;
   }

   @Override
   protected boolean f_(doz $$0) {
      return true;
   }

   protected static int a(cyx $$0, erv $$1, Class<? extends bpv> $$2) {
      return $$0.a($$2, $$1, bqa.f.and($$0x -> !$$0x.r_())).size();
   }

   protected abstract int b(cyx var1, ib var2);

   protected abstract int g(doz var1);

   protected abstract doz a(doz var1, int var2);
}
