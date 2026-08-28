import com.mojang.serialization.Codec;

public class ehx extends egw<ejo> {
   public ehx(Codec<ejo> $$0) {
      super($$0);
   }

   @Override
   public boolean a(egy<ejo> $$0) {
      dig $$1 = $$0.b();
      jh $$2 = $$0.e();
      ejo $$3 = $$0.f();

      for (eji.a $$4 : $$3.b) {
         if ($$4.b.a($$1.a_($$2), $$0.d())) {
            $$1.a($$2, $$4.c, 2);
            break;
         }
      }

      return true;
   }
}
