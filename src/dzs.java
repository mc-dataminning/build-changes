import com.mojang.serialization.Codec;

public class dzs extends dyu<ebl> {
   public dzs(Codec<ebl> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dyw<ebl> $$0) {
      ebl $$1 = $$0.f();
      ayd $$2 = $$0.d();
      im $$3 = $$0.e();
      dap $$4 = $$0.b();
      int $$5 = 0;
      im.a $$6 = new im.a();
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
