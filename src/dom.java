import com.mojang.serialization.MapCodec;

public class dom extends dez {
   public static final MapCodec<dom> a = b(dom::new);

   @Override
   public MapCodec<dom> a() {
      return a;
   }

   public dom(dsb.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dsc $$0, dby $$1, iz $$2, bsu $$3) {
      evr $$4 = new evr(0.25, 0.05F, 0.25);
      if ($$3 instanceof btp $$5 && $$5.b(bse.K)) {
         $$4 = new evr(0.5, 0.25, 0.5);
      }

      $$3.a($$0, $$4);
   }
}
