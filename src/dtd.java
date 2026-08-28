import com.mojang.serialization.MapCodec;

public class dtd extends dmm implements dmp {
   public static final MapCodec<dtd> a = b(dtd::new);

   @Override
   public MapCodec<dtd> a() {
      return a;
   }

   public dtd(ean.d $$0) {
      super($$0);
   }

   @Override
   public boolean a(djk $$0, iv $$1, eao $$2) {
      return $$0.a_($$1.e()).l();
   }

   @Override
   public boolean a(djh $$0, azv $$1, iv $$2, eao $$3) {
      return true;
   }

   @Override
   public void a(arq $$0, azv $$1, iv $$2, eao $$3) {
      $$0.b($$2.e(), dmo.tq.m());
   }

   @Override
   public iv a(iv $$0) {
      return $$0.e();
   }
}
