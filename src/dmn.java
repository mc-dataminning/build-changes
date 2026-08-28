import com.mojang.serialization.MapCodec;

public class dmn extends dhb {
   public static final MapCodec<dmn> b = b(dmn::new);
   private static final wu c = wu.c("container.upgrade");

   @Override
   public MapCodec<dmn> a() {
      return b;
   }

   protected dmn(dsj.d $$0) {
      super($$0);
   }

   @Override
   protected bqk b(dsk $$0, dcf $$1, ja $$2) {
      return new bqq(($$2x, $$3, $$4) -> new crg($$2x, $$3, cpt.a($$1, $$2)), c);
   }

   @Override
   protected bqg a(dsk $$0, dcf $$1, ja $$2, cmk $$3, ewb $$4) {
      if ($$1.B) {
         return bqg.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(avr.aF);
         return bqg.c;
      }
   }
}
