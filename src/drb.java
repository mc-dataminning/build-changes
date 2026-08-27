import com.mojang.serialization.Codec;

public class drb extends dqa<dss> {
   public drb(Codec<dss> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dqc<dss> $$0) {
      csz $$1 = $$0.b();
      hx $$2 = $$0.e();
      dss $$3 = $$0.f();

      for (dsm.a $$4 : $$3.b) {
         if ($$4.b.a($$1.a_($$2), $$0.d())) {
            $$1.a($$2, $$4.c, 2);
            break;
         }
      }

      return true;
   }
}
