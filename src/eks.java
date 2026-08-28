import com.mojang.serialization.Codec;

public class eks extends ejt<emj> {
   public eks(Codec<emj> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ejv<emj> $$0) {
      emj $$1 = $$0.f();
      azv $$2 = $$0.d();
      dkg $$3 = $$0.b();
      ecm $$4 = $$0.c();
      iv $$5 = $$0.e();

      for (eln $$6 : $$1.b) {
         if ($$2.i() < $$6.c) {
            return $$6.a($$3, $$4, $$2, $$5);
         }
      }

      return $$1.c.a().a($$3, $$4, $$2, $$5);
   }
}
