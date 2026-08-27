import com.mojang.serialization.Codec;

public class dur extends dts<dwi> {
   public dur(Codec<dwi> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dtu<dwi> $$0) {
      dwi $$1 = $$0.f();
      awo $$2 = $$0.d();
      cwi $$3 = $$0.b();
      dnc $$4 = $$0.c();
      hz $$5 = $$0.e();

      for (dvm $$6 : $$1.b) {
         if ($$2.i() < $$6.c) {
            return $$6.a($$3, $$4, $$2, $$5);
         }
      }

      return $$1.c.a().a($$3, $$4, $$2, $$5);
   }
}
