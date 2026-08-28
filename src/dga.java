import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dga extends dfh {
   public static final MapCodec<dga> a = b(dga::new);
   private static final wu b = wu.c("container.cartography_table");

   @Override
   public MapCodec<dga> a() {
      return a;
   }

   protected dga(dsj.d $$0) {
      super($$0);
   }

   @Override
   protected bqg a(dsk $$0, dcf $$1, ja $$2, cmk $$3, ewb $$4) {
      if ($$1.B) {
         return bqg.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(avr.aw);
         return bqg.c;
      }
   }

   @Nullable
   @Override
   protected bqk b(dsk $$0, dcf $$1, ja $$2) {
      return new bqq(($$2x, $$3, $$4) -> new cpo($$2x, $$3, cpt.a($$1, $$2)), b);
   }
}
