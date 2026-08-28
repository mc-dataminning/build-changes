import com.mojang.serialization.Codec;

public class egv extends efx<eio> {
   public egv(Codec<eio> $$0) {
      super($$0);
   }

   @Override
   public boolean a(efz<eio> $$0) {
      eio $$1 = $$0.f();
      azh $$2 = $$0.d();
      ji $$3 = $$0.e();
      dhf $$4 = $$0.b();
      int $$5 = 0;
      ji.a $$6 = new ji.a();
      int $$7 = $$1.b() + 1;
      int $$8 = $$1.c() + 1;

      for (int $$9 = 0; $$9 < $$1.a(); $$9++) {
         $$6.a($$3, $$2.a($$7) - $$2.a($$7), $$2.a($$8) - $$2.a($$8), $$2.a($$7) - $$2.a($$7));
         if ($$1.d().a().a($$4, $$0.c(), $$2, $$6)) {
            $$5++;
         }
      }

      return $$5 > 0;
   }
}
