import com.mojang.serialization.Codec;

public class efg extends edq<egb> {
   public efg(Codec<egb> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eds<egb> $$0) {
      dfd $$1 = $$0.b();
      je $$2 = $$0.e();
      $$0.f();
      if (!$$1.u($$2)) {
         return false;
      } else {
         for (jj $$3 : jj.values()) {
            if ($$3 != jj.a && dqg.a($$1, $$2.a($$3), $$3)) {
               $$1.a($$2, dhl.ff.o().b(dqg.a($$3), Boolean.valueOf(true)), 2);
               return true;
            }
         }

         return false;
      }
   }
}
