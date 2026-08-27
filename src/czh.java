import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class czh extends cyo {
   public static final MapCodec<czh> a = b(czh::new);
   private static final vq b = vq.c("container.cartography_table");

   @Override
   public MapCodec<czh> a() {
      return a;
   }

   protected czh(dle.d $$0) {
      super($$0);
   }

   @Override
   protected blu a(dlf $$0, cvn $$1, hz $$2, chh $$3, eno $$4) {
      if ($$1.B) {
         return blu.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(atu.aw);
         return blu.b;
      }
   }

   @Nullable
   @Override
   protected bly b(dlf $$0, cvn $$1, hz $$2) {
      return new bme(($$2x, $$3, $$4) -> new ckh($$2x, $$3, ckm.a($$1, $$2)), b);
   }
}
