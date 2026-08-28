import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dha extends dhm {
   protected static final ezq a = dhm.a(1.0, 0.0, 1.0, 15.0, 0.5, 15.0);
   protected static final ezq b = dhm.a(1.0, 0.0, 1.0, 15.0, 1.0, 15.0);
   protected static final eyr c = new eyr(0.0625, 0.0, 0.0625, 0.9375, 0.25, 0.9375);
   protected final dvh d;

   protected dha(dur.d $$0, dvh $$1) {
      super($$0.a($$1.g()));
      this.d = $$1;
   }

   @Override
   protected abstract MapCodec<? extends dha> a();

   @Override
   protected ezq a(dus $$0, ddo $$1, jf $$2, ezb $$3) {
      return this.h($$0) > 0 ? a : b;
   }

   protected int b() {
      return 20;
   }

   @Override
   public boolean a(dus $$0) {
      return true;
   }

   @Override
   protected dus a(dus $$0, jk $$1, dus $$2, dek $$3, jf $$4, jf $$5) {
      return $$1 == jk.a && !$$0.a($$3, $$4) ? dho.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dus $$0, dem $$1, jf $$2) {
      jf $$3 = $$2.e();
      return c($$1, $$3) || a($$1, $$3, jk.b);
   }

   @Override
   protected void a(dus $$0, arj $$1, jf $$2, azn $$3) {
      int $$4 = this.h($$0);
      if ($$4 > 0) {
         this.a(null, $$1, $$2, $$0, $$4);
      }
   }

   @Override
   protected void a(dus $$0, dej $$1, jf $$2, btr $$3) {
      if (!$$1.B) {
         int $$4 = this.h($$0);
         if ($$4 == 0) {
            this.a($$3, $$1, $$2, $$0, $$4);
         }
      }
   }

   private void a(@Nullable btr $$0, dej $$1, jf $$2, dus $$3, int $$4) {
      int $$5 = this.b($$1, $$2);
      boolean $$6 = $$4 > 0;
      boolean $$7 = $$5 > 0;
      if ($$4 != $$5) {
         dus $$8 = this.a($$3, $$5);
         $$1.a($$2, $$8, 2);
         this.a($$1, $$2);
         $$1.b($$2, $$3, $$8);
      }

      if (!$$7 && $$6) {
         $$1.a(null, $$2, this.d.l(), awh.e);
         $$1.a($$0, dzp.e, $$2);
      } else if ($$7 && !$$6) {
         $$1.a(null, $$2, this.d.m(), awh.e);
         $$1.a($$0, dzp.a, $$2);
      }

      if ($$7) {
         $$1.a(new jf($$2), this, this.b());
      }
   }

   @Override
   protected void a(dus $$0, dej $$1, jf $$2, dus $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         if (this.h($$0) > 0) {
            this.a($$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   protected void a(dej $$0, jf $$1) {
      $$0.a($$1, this);
      $$0.a($$1.e(), this);
   }

   @Override
   protected int a(dus $$0, ddo $$1, jf $$2, jk $$3) {
      return this.h($$0);
   }

   @Override
   protected int b(dus $$0, ddo $$1, jf $$2, jk $$3) {
      return $$3 == jk.b ? this.h($$0) : 0;
   }

   @Override
   protected boolean f_(dus $$0) {
      return true;
   }

   protected static int a(dej $$0, eyr $$1, Class<? extends btr> $$2) {
      return $$0.a($$2, $$1, btw.f.and($$0x -> !$$0x.r_())).size();
   }

   protected abstract int b(dej var1, jf var2);

   protected abstract int h(dus var1);

   protected abstract dus a(dus var1, int var2);
}
