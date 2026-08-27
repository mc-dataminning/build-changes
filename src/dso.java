import com.mojang.serialization.Codec;

public class dso extends drn<duf> {
   public dso(Codec<duf> $$0) {
      super($$0);
   }

   @Override
   public boolean a(drp<duf> $$0) {
      cud $$1 = $$0.b();
      hx $$2 = $$0.e();
      duf $$3 = $$0.f();

      for (dtz.a $$4 : $$3.b) {
         if ($$4.b.a($$1.a_($$2), $$0.d())) {
            $$1.a($$2, $$4.c, 2);
            break;
         }
      }

      return true;
   }
}
