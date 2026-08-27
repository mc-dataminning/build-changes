import com.mojang.serialization.Codec;

public class eba extends dzz<ecr> {
   public eba(Codec<ecr> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eab<ecr> $$0) {
      dbu $$1 = $$0.b();
      io $$2 = $$0.e();
      ecr $$3 = $$0.f();

      for (ecl.a $$4 : $$3.b) {
         if ($$4.b.a($$1.a_($$2), $$0.d())) {
            $$1.a($$2, $$4.c, 2);
            break;
         }
      }

      return true;
   }
}
