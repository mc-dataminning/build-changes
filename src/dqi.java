import com.mojang.serialization.Codec;

public class dqi extends dpj<drz> {
   public dqi(Codec<drz> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dpl<drz> $$0) {
      drz $$1 = $$0.f();
      ato $$2 = $$0.d();
      csm $$3 = $$0.b();
      dit $$4 = $$0.c();
      ht $$5 = $$0.e();

      for (drd $$6 : $$1.b) {
         if ($$2.i() < $$6.c) {
            return $$6.a($$3, $$4, $$2, $$5);
         }
      }

      return $$1.c.a().a($$3, $$4, $$2, $$5);
   }
}
