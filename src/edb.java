import com.mojang.serialization.Codec;

public class edb extends eca<ees> {
   public edb(Codec<ees> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ecc<ees> $$0) {
      ddq $$1 = $$0.b();
      jd $$2 = $$0.e();
      ees $$3 = $$0.f();

      for (eem.a $$4 : $$3.b) {
         if ($$4.b.a($$1.a_($$2), $$0.d())) {
            $$1.a($$2, $$4.c, 2);
            break;
         }
      }

      return true;
   }
}
