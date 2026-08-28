import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dgz extends dhq {
   public static final dwd a = dlz.aF;
   public static final dwa b = dvz.r;

   protected dgz(dvi.d $$0) {
      super($$0);
      this.l(this.F.b().b(a, jm.c).b(b, Boolean.valueOf(false)));
   }

   @Override
   protected abstract MapCodec<? extends dgz> a();

   @Override
   protected bsd a(dvj $$0, dfb $$1, jh $$2, com $$3, ezj $$4) {
      if (!$$1.C) {
         this.a($$1, $$2, $$3);
      }

      return bsd.a;
   }

   protected abstract void a(dfb var1, jh var2, com var3);

   @Override
   public dvj a(czs $$0) {
      return this.m().b(a, $$0.g().g());
   }

   @Override
   protected void a(dvj $$0, dfb $$1, jh $$2, dvj $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dsm $$5 = $$1.c_($$2);
         if ($$5 instanceof dsa) {
            if ($$1 instanceof arn) {
               brz.a($$1, $$2, (dsa)$$5);
               ((dsa)$$5).a((arn)$$1, ezn.b($$2));
            }

            super.a($$0, $$1, $$2, $$3, $$4);
            $$1.c($$2, this);
         } else {
            super.a($$0, $$1, $$2, $$3, $$4);
         }
      }
   }

   @Override
   protected boolean c_(dvj $$0) {
      return true;
   }

   @Override
   protected int a(dvj $$0, dfb $$1, jh $$2) {
      return cro.a($$1.c_($$2));
   }

   @Override
   protected dok a_(dvj $$0) {
      return dok.c;
   }

   @Override
   protected dvj a(dvj $$0, dor $$1) {
      return $$0.b(a, $$1.a($$0.c(a)));
   }

   @Override
   protected dvj a(dvj $$0, dna $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dvk.a<die, dvj> $$0) {
      $$0.a(a, b);
   }

   @Nullable
   protected static <T extends dsm> dsn<T> a(dfb $$0, dso<T> $$1, dso<? extends dsa> $$2) {
      return $$0.C ? null : a($$1, $$2, dsa::a);
   }
}
