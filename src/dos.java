import com.mojang.serialization.Codec;

public class dos extends dnr<dqj> {
   public dos(Codec<dqj> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dnt<dqj> $$0) {
      cqk $$1 = $$0.b();
      gw $$2 = $$0.e();
      dqj $$3 = $$0.f();

      for (dqd.a $$4 : $$3.b) {
         if ($$4.b.a($$1.a_($$2), $$0.d())) {
            $$1.a($$2, $$4.c, 2);
            break;
         }
      }

      return true;
   }
}
