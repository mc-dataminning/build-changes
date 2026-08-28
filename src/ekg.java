import com.mojang.serialization.Codec;

public class ekg extends ekw<eni> {
   public ekg(Codec<eni> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eky<eni> $$0) {
      dli $$1 = $$0.b();
      iw $$2 = $$0.e();
      bai $$3 = $$0.d();
      if ($$1.v($$2) && $$1.a_($$2.e()).a(dnq.fY)) {
         dou.a($$1, $$2, $$3, 8);
         return true;
      } else {
         return false;
      }
   }
}
