import com.mojang.serialization.Codec;

public class eiq extends ehr<ekh> {
   public eiq(Codec<ekh> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eht<ekh> $$0) {
      ekh $$1 = $$0.f();
      azs $$2 = $$0.d();
      dio $$3 = $$0.b();
      eak $$4 = $$0.c();
      jj $$5 = $$0.e();

      for (ejl $$6 : $$1.b) {
         if ($$2.i() < $$6.c) {
            return $$6.a($$3, $$4, $$2, $$5);
         }
      }

      return $$1.c.a().a($$3, $$4, $$2, $$5);
   }
}
