import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class det extends dfk {
   public static final dtw a = dju.aE;
   public static final dtt b = dts.r;

   protected det(dtb.d $$0) {
      super($$0);
      this.k(this.E.b().a(a, ji.c).a(b, Boolean.valueOf(false)));
   }

   @Override
   protected abstract MapCodec<? extends det> a();

   @Override
   protected bqr a(dtc $$0, dcw $$1, jd $$2, cmx $$3, ewy $$4) {
      if ($$1.B) {
         return bqr.a;
      } else {
         this.a($$1, $$2, $$3);
         return bqr.c;
      }
   }

   protected abstract void a(dcw var1, jd var2, cmx var3);

   @Override
   public dtc a(cyd $$0) {
      return this.o().a(a, $$0.g().g());
   }

   @Override
   protected void a(dtc $$0, dcw $$1, jd $$2, dtc $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dqh $$5 = $$1.c_($$2);
         if ($$5 instanceof dpv) {
            if ($$1 instanceof aqu) {
               bqn.a($$1, $$2, (dpv)$$5);
               ((dpv)$$5).a((aqu)$$1, exc.b($$2));
            }

            super.a($$0, $$1, $$2, $$3, $$4);
            $$1.c($$2, this);
         } else {
            super.a($$0, $$1, $$2, $$3, $$4);
         }
      }
   }

   @Override
   protected boolean c_(dtc $$0) {
      return true;
   }

   @Override
   protected int a(dtc $$0, dcw $$1, jd $$2) {
      return cpu.a($$1.c_($$2));
   }

   @Override
   protected dmf a_(dtc $$0) {
      return dmf.c;
   }

   @Override
   protected dtc a(dtc $$0, dmm $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   protected dtc a(dtc $$0, dkv $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dtd.a<dfy, dtc> $$0) {
      $$0.a(a, b);
   }

   @Nullable
   protected static <T extends dqh> dqi<T> a(dcw $$0, dqj<T> $$1, dqj<? extends dpv> $$2) {
      return $$0.B ? null : a($$1, $$2, dpv::a);
   }
}
