import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dgb extends dfi {
   public static final MapCodec<dgb> a = b(dgb::new);
   private static final wu b = wu.c("container.cartography_table");

   @Override
   public MapCodec<dgb> a() {
      return a;
   }

   protected dgb(dsk.d $$0) {
      super($$0);
   }

   @Override
   protected bqh a(dsl $$0, dcg $$1, ja $$2, cml $$3, ewd $$4) {
      if ($$1.B) {
         return bqh.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(avr.aw);
         return bqh.c;
      }
   }

   @Nullable
   @Override
   protected bql b(dsl $$0, dcg $$1, ja $$2) {
      return new bqr(($$2x, $$3, $$4) -> new cpp($$2x, $$3, cpu.a($$1, $$2)), b);
   }
}
