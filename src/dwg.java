import com.mojang.serialization.MapCodec;

public class dwg extends dvy {
   public static final MapCodec<dwg> a = b(dwg::new);
   private static final ffr b = dmm.b(14.0, 0.0, 1.5);

   @Override
   public MapCodec<dwg> a() {
      return a;
   }

   protected dwg(ean.d $$0) {
      super($$0);
   }

   @Override
   protected void a(eao $$0, djh $$1, iv $$2, bwi $$3, bxb $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$1 instanceof arq && $$3 instanceof ctu) {
         $$1.a(new iv($$2), true, $$3);
      }
   }

   @Override
   protected ffr a(eao $$0, din $$1, iv $$2, ffc $$3) {
      return b;
   }

   @Override
   protected boolean b(eao $$0, din $$1, iv $$2) {
      ewv $$3 = $$1.b_($$2);
      ewv $$4 = $$1.b_($$2.d());
      return ($$3.a() == eww.c || $$0.b() instanceof dqp) && $$4.a() == eww.a;
   }
}
