import com.mojang.serialization.MapCodec;

public class dvc extends dvy implements dmp {
   public static final MapCodec<dvc> a = b(dvc::new);
   private static final ffr b = dmm.b(12.0, 0.0, 13.0);

   @Override
   public MapCodec<dvc> a() {
      return a;
   }

   protected dvc(ean.d $$0) {
      super($$0);
   }

   @Override
   protected ffr a(eao $$0, din $$1, iv $$2, ffc $$3) {
      return b;
   }

   @Override
   public boolean a(djk $$0, iv $$1, eao $$2) {
      return o($$2).m().a($$0, $$1) && $$0.v($$1.d());
   }

   @Override
   public boolean a(djh $$0, azv $$1, iv $$2, eao $$3) {
      return true;
   }

   @Override
   public void a(arq $$0, azv $$1, iv $$2, eao $$3) {
      dov.a($$0, o($$3).m(), $$2, 2);
   }

   private static dov o(eao $$0) {
      return (dov)($$0.a(dmo.bB) ? dmo.jk : dmo.jj);
   }
}
