import com.mojang.serialization.Codec;

public class drq extends dqa<dsl> {
   public drq(Codec<dsl> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dqc<dsl> $$0) {
      csz $$1 = $$0.b();
      hx $$2 = $$0.e();
      $$0.f();
      if (!$$1.t($$2)) {
         return false;
      } else {
         for (ib $$3 : ib.values()) {
            if ($$3 != ib.a && ddy.a($$1, $$2.a($$3), $$3)) {
               $$1.a($$2, cvh.ff.o().a(ddy.a($$3), Boolean.valueOf(true)), 2);
               return true;
            }
         }

         return false;
      }
   }
}
