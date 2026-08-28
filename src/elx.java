import com.mojang.serialization.Codec;

public class elx extends ekw<enp> {
   public elx(Codec<enp> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eky<enp> $$0) {
      dli $$1 = $$0.b();
      iw $$2 = $$0.e();
      enp $$3 = $$0.f();

      for (enj.a $$4 : $$3.b) {
         if ($$4.b.a($$1.a_($$2), $$0.d())) {
            $$1.a($$2, $$4.c, 2);
            break;
         }
      }

      return true;
   }
}
