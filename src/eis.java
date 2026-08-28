import com.mojang.serialization.Codec;

public class eis extends ehr<ekj> {
   public eis(Codec<ekj> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eht<ekj> $$0) {
      dio $$1 = $$0.b();
      jj $$2 = $$0.e();
      ekj $$3 = $$0.f();

      for (ekd.a $$4 : $$3.b) {
         if ($$4.b.a($$1.a_($$2), $$0.d())) {
            $$1.a($$2, $$4.c, 2);
            break;
         }
      }

      return true;
   }
}
