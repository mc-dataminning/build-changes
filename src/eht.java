import com.mojang.serialization.Codec;

public class eht extends egu<ejk> {
   public eht(Codec<ejk> $$0) {
      super($$0);
   }

   @Override
   public boolean a(egw<ejk> $$0) {
      ejk $$1 = $$0.f();
      azh $$2 = $$0.d();
      dhy $$3 = $$0.b();
      dzn $$4 = $$0.c();
      ji $$5 = $$0.e();

      for (eio $$6 : $$1.b) {
         if ($$2.i() < $$6.c) {
            return $$6.a($$3, $$4, $$2, $$5);
         }
      }

      return $$1.c.a().a($$3, $$4, $$2, $$5);
   }
}
