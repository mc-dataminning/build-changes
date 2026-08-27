import com.mojang.serialization.Codec;

public class dtb extends dsc<dus> {
   public dtb(Codec<dus> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dse<dus> $$0) {
      dus $$1 = $$0.f();
      auw $$2 = $$0.d();
      cus $$3 = $$0.b();
      dlm $$4 = $$0.c();
      hx $$5 = $$0.e();

      for (dtw $$6 : $$1.b) {
         if ($$2.i() < $$6.c) {
            return $$6.a($$3, $$4, $$2, $$5);
         }
      }

      return $$1.c.a().a($$3, $$4, $$2, $$5);
   }
}
