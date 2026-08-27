import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class czl extends cys {
   public static final MapCodec<czl> a = b(czl::new);
   private static final vq b = vq.c("container.cartography_table");

   @Override
   public MapCodec<czl> a() {
      return a;
   }

   protected czl(dli.d $$0) {
      super($$0);
   }

   @Override
   protected blw a(dlj $$0, cvr $$1, hz $$2, chl $$3, env $$4) {
      if ($$1.B) {
         return blw.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(atv.aw);
         return blw.b;
      }
   }

   @Nullable
   @Override
   protected bma b(dlj $$0, cvr $$1, hz $$2) {
      return new bmg(($$2x, $$3, $$4) -> new ckl($$2x, $$3, ckq.a($$1, $$2)), b);
   }
}
