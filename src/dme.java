import com.mojang.serialization.Codec;

public class dme extends dko<dmz> {
   public dme(Codec<dmz> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dkq<dmz> $$0) {
      cng $$1 = $$0.b();
      gu $$2 = $$0.e();
      $$0.f();
      if (!$$1.t($$2)) {
         return false;
      } else {
         for (ha $$3 : ha.values()) {
            if ($$3 != ha.a && cyh.a($$1, $$2.a($$3), $$3)) {
               $$1.a($$2, cpo.ff.n().a(cyh.a($$3), Boolean.valueOf(true)), 2);
               return true;
            }
         }

         return false;
      }
   }
}
