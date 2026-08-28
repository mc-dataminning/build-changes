import com.mojang.serialization.Codec;

public class eju extends eit<ell> {
   public eju(Codec<ell> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eiv<ell> $$0) {
      djo $$1 = $$0.b();
      iu $$2 = $$0.e();
      ell $$3 = $$0.f();

      for (elf.a $$4 : $$3.b) {
         if ($$4.b.a($$1.a_($$2), $$0.d())) {
            $$1.a($$2, $$4.c, 2);
            break;
         }
      }

      return true;
   }
}
