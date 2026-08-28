import com.mojang.serialization.Codec;

public class emc extends ekm<emy> {
   public emc(Codec<emy> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eko<emy> $$0) {
      dky $$1 = $$0.b();
      iw $$2 = $$0.e();
      $$0.f();
      if (!$$1.v($$2)) {
         return false;
      } else {
         for (jc $$3 : jc.values()) {
            if ($$3 != jc.a && dwr.a($$1, $$2.a($$3), $$3)) {
               $$1.a($$2, dng.fx.m().b(dwr.a($$3), Boolean.valueOf(true)), 2);
               return true;
            }
         }

         return false;
      }
   }
}
