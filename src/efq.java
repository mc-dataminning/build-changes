import com.mojang.serialization.Codec;

public class efq extends eep<ehh> {
   public efq(Codec<ehh> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eer<ehh> $$0) {
      dgd $$1 = $$0.b();
      jh $$2 = $$0.e();
      ehh $$3 = $$0.f();

      for (ehb.a $$4 : $$3.b) {
         if ($$4.b.a($$1.a_($$2), $$0.d())) {
            $$1.a($$2, $$4.c, 2);
            break;
         }
      }

      return true;
   }
}
