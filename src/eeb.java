import com.mojang.serialization.Codec;

public class eeb extends edc<efs> {
   public eeb(Codec<efs> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ede<efs> $$0) {
      efs $$1 = $$0.f();
      azk $$2 = $$0.d();
      dep $$3 = $$0.b();
      dvx $$4 = $$0.c();
      je $$5 = $$0.e();

      for (eew $$6 : $$1.b) {
         if ($$2.i() < $$6.c) {
            return $$6.a($$3, $$4, $$2, $$5);
         }
      }

      return $$1.c.a().a($$3, $$4, $$2, $$5);
   }
}
