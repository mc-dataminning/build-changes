import com.mojang.serialization.Codec;

public class dwt extends dvs<dyk> {
   public dwt(Codec<dyk> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dvu<dyk> $$0) {
      cxw $$1 = $$0.b();
      ib $$2 = $$0.e();
      dyk $$3 = $$0.f();

      for (dye.a $$4 : $$3.b) {
         if ($$4.b.a($$1.a_($$2), $$0.d())) {
            $$1.a($$2, $$4.c, 2);
            break;
         }
      }

      return true;
   }
}
