import com.mojang.serialization.Codec;

public class ehw extends egv<ejn> {
   public ehw(Codec<ejn> $$0) {
      super($$0);
   }

   @Override
   public boolean a(egx<ejn> $$0) {
      dif $$1 = $$0.b();
      jh $$2 = $$0.e();
      ejn $$3 = $$0.f();

      for (ejh.a $$4 : $$3.b) {
         if ($$4.b.a($$1.a_($$2), $$0.d())) {
            $$1.a($$2, $$4.c, 2);
            break;
         }
      }

      return true;
   }
}
