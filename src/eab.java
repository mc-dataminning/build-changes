import com.mojang.serialization.Codec;

public class eab extends dzd<ebu> {
   public eab(Codec<ebu> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dzf<ebu> $$0) {
      ebu $$1 = $$0.f();
      ayg $$2 = $$0.d();
      in $$3 = $$0.e();
      day $$4 = $$0.b();
      int $$5 = 0;
      in.a $$6 = new in.a();
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
