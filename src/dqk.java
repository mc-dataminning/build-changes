import com.mojang.serialization.Codec;

public class dqk extends dpj<dsb> {
   public dqk(Codec<dsb> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dpl<dsb> $$0) {
      csm $$1 = $$0.b();
      ht $$2 = $$0.e();
      dsb $$3 = $$0.f();

      for (drv.a $$4 : $$3.b) {
         if ($$4.b.a($$1.a_($$2), $$0.d())) {
            $$1.a($$2, $$4.c, 2);
            break;
         }
      }

      return true;
   }
}
