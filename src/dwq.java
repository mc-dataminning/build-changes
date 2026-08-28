import com.mojang.serialization.MapCodec;

public class dwq extends dmm {
   public static final MapCodec<dwq> a = b(dwq::new);

   @Override
   public MapCodec<dwq> a() {
      return a;
   }

   public dwq(ean.d $$0) {
      super($$0);
   }

   @Override
   protected void a(eao $$0, djh $$1, iv $$2, bwi $$3, bxb $$4) {
      fex $$5 = new fex(0.25, 0.05F, 0.25);
      if ($$3 instanceof bxj $$6 && $$6.b(bvo.K)) {
         $$5 = new fex(0.5, 0.25, 0.5);
      }

      $$3.a($$0, $$5);
   }
}
