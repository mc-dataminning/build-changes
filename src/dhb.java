import com.mojang.serialization.MapCodec;

public class dhb extends dfh {
   public static final MapCodec<dhb> a = b(dhb::new);
   private static final wu b = wu.c("container.crafting");

   @Override
   public MapCodec<? extends dhb> a() {
      return a;
   }

   protected dhb(dsj.d $$0) {
      super($$0);
   }

   @Override
   protected bqg a(dsk $$0, dcf $$1, ja $$2, cmk $$3, ewb $$4) {
      if ($$1.B) {
         return bqg.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(avr.an);
         return bqg.c;
      }
   }

   @Override
   protected bqk b(dsk $$0, dcf $$1, ja $$2) {
      return new bqq(($$2x, $$3, $$4) -> new cpz($$2x, $$3, cpt.a($$1, $$2)), b);
   }
}
