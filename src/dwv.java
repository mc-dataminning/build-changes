import com.mojang.serialization.MapCodec;

public class dwv extends dmr {
   public static final MapCodec<dwv> a = b(dwv::new);

   @Override
   public MapCodec<dwv> a() {
      return a;
   }

   public dwv(eas.d $$0) {
      super($$0);
   }

   @Override
   protected void a(eat $$0, djm $$1, iv $$2, bwi $$3, bxb $$4) {
      ffc $$5 = new ffc(0.25, 0.05F, 0.25);
      if ($$3 instanceof bxj $$6 && $$6.b(bvo.K)) {
         $$5 = new ffc(0.5, 0.25, 0.5);
      }

      $$3.a($$0, $$5);
   }
}
