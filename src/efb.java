import com.mojang.serialization.Codec;

public class efb extends edu<egq> {
   public efb(Codec<egq> $$0) {
      super($$0);
   }

   @Override
   public boolean a(edw<egq> $$0) {
      egq $$1 = $$0.f();
      dfg $$2 = $$0.b();
      jf $$3 = $$0.e();
      dus $$4 = $$1.a().a($$0.d(), $$3);
      if ($$4.a($$2, $$3)) {
         if ($$4.b() instanceof dju) {
            if (!$$2.u($$3.d())) {
               return false;
            }

            dju.a($$2, $$4, $$3, 2);
         } else {
            $$2.a($$3, $$4, 2);
         }

         return true;
      } else {
         return false;
      }
   }
}
