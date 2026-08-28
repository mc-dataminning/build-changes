import com.mojang.serialization.Codec;

public class egy extends efz<eip> {
   public egy(Codec<eip> $$0) {
      super($$0);
   }

   @Override
   public boolean a(egb<eip> $$0) {
      eip $$1 = $$0.f();
      azh $$2 = $$0.d();
      dhh $$3 = $$0.b();
      dyu $$4 = $$0.c();
      ji $$5 = $$0.e();

      for (eht $$6 : $$1.b) {
         if ($$2.i() < $$6.c) {
            return $$6.a($$3, $$4, $$2, $$5);
         }
      }

      return $$1.c.a().a($$3, $$4, $$2, $$5);
   }
}
