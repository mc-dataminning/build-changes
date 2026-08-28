import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dfy extends dff {
   public static final MapCodec<dfy> a = b(dfy::new);
   private static final wu b = wu.c("container.cartography_table");

   @Override
   public MapCodec<dfy> a() {
      return a;
   }

   protected dfy(dsg.d $$0) {
      super($$0);
   }

   @Override
   protected bqd a(dsh $$0, dcd $$1, ja $$2, cmh $$3, evv $$4) {
      if ($$1.B) {
         return bqd.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(avp.aw);
         return bqd.c;
      }
   }

   @Nullable
   @Override
   protected bqh b(dsh $$0, dcd $$1, ja $$2) {
      return new bqn(($$2x, $$3, $$4) -> new cpl($$2x, $$3, cpq.a($$1, $$2)), b);
   }
}
