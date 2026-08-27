import com.mojang.serialization.MapCodec;

public class dam extends cys {
   public static final MapCodec<dam> a = b(dam::new);
   private static final vq b = vq.c("container.crafting");

   @Override
   public MapCodec<? extends dam> a() {
      return a;
   }

   protected dam(dli.d $$0) {
      super($$0);
   }

   @Override
   protected blw a(dlj $$0, cvr $$1, hz $$2, chl $$3, env $$4) {
      if ($$1.B) {
         return blw.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(atv.an);
         return blw.b;
      }
   }

   @Override
   protected bma b(dlj $$0, cvr $$1, hz $$2) {
      return new bmg(($$2x, $$3, $$4) -> new ckw($$2x, $$3, ckq.a($$1, $$2)), b);
   }
}
