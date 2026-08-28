import com.mojang.serialization.Codec;

public class ekn extends ejm<eme> {
   public ekn(Codec<eme> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ejo<eme> $$0) {
      djz $$1 = $$0.b();
      iu $$2 = $$0.e();
      eme $$3 = $$0.f();

      for (ely.a $$4 : $$3.b) {
         if ($$4.b.a($$1.a_($$2), $$0.d())) {
            $$1.a($$2, $$4.c, 2);
            break;
         }
      }

      return true;
   }
}
