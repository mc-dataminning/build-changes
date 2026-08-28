import com.mojang.serialization.Codec;

public class ekz extends ejy<emq> {
   public ekz(Codec<emq> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eka<emq> $$0) {
      dkl $$1 = $$0.b();
      iv $$2 = $$0.e();
      emq $$3 = $$0.f();

      for (emk.a $$4 : $$3.b) {
         if ($$4.b.a($$1.a_($$2), $$0.d())) {
            $$1.a($$2, $$4.c, 2);
            break;
         }
      }

      return true;
   }
}
