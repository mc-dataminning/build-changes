import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dfo extends dfi implements dfn {
   public static final MapCodec<dfo> a = b(dfo::new);

   @Override
   public MapCodec<dfo> a() {
      return a;
   }

   public dfo(dsz.d $$0) {
      super($$0);
   }

   @Override
   public ctg b() {
      return ctg.a;
   }

   @Override
   public dqf a(jd $$0, dta $$1) {
      return new dqa($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dqf> dqg<T> a(dcu $$0, dta $$1, dqh<T> $$2) {
      return a($$2, dqh.o, dqa::a);
   }

   @Override
   protected bqq a(dta $$0, dcu $$1, jd $$2, cmv $$3, ews $$4) {
      if ($$1.B) {
         return bqq.a;
      } else {
         if ($$1.c_($$2) instanceof dqa $$5) {
            $$3.a($$5);
            $$3.a(avy.ab);
         }

         return bqq.c;
      }
   }

   @Override
   protected dmd a_(dta $$0) {
      return dmd.c;
   }
}
