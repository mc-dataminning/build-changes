import com.mojang.serialization.Codec;

public class egw extends efx<ein> {
   public egw(Codec<ein> $$0) {
      super($$0);
   }

   @Override
   public boolean a(efz<ein> $$0) {
      ein $$1 = $$0.f();
      azh $$2 = $$0.d();
      dhf $$3 = $$0.b();
      dys $$4 = $$0.c();
      ji $$5 = $$0.e();

      for (ehr $$6 : $$1.b) {
         if ($$2.i() < $$6.c) {
            return $$6.a($$3, $$4, $$2, $$5);
         }
      }

      return $$1.c.a().a($$3, $$4, $$2, $$5);
   }
}
