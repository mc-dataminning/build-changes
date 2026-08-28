import com.mojang.serialization.Codec;

public class edb extends ebl<edw> {
   public edb(Codec<edw> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ebn<edw> $$0) {
      ddc $$1 = $$0.b();
      ja $$2 = $$0.e();
      $$0.f();
      if (!$$1.u($$2)) {
         return false;
      } else {
         for (jf $$3 : jf.values()) {
            if ($$3 != jf.a && doe.a($$1, $$2.a($$3), $$3)) {
               $$1.a($$2, dfk.ff.o().a(doe.a($$3), Boolean.valueOf(true)), 2);
               return true;
            }
         }

         return false;
      }
   }
}
