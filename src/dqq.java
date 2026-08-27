import com.mojang.serialization.Codec;

public class dqq extends dpj<dsf> {
   public dqq(Codec<dsf> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dpl<dsf> $$0) {
      dsf $$1 = $$0.f();
      csm $$2 = $$0.b();
      ht $$3 = $$0.e();
      dgw $$4 = $$1.a().a($$0.d(), $$3);
      if ($$4.a($$2, $$3)) {
         if ($$4.b() instanceof cxa) {
            if (!$$2.t($$3.c())) {
               return false;
            }

            cxa.a($$2, $$4, $$3, 2);
         } else {
            $$2.a($$3, $$4, 2);
         }

         return true;
      } else {
         return false;
      }
   }
}
