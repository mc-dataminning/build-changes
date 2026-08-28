import com.mojang.serialization.MapCodec;

public class dmo extends dhc {
   public static final MapCodec<dmo> b = b(dmo::new);
   private static final wu c = wu.c("container.upgrade");

   @Override
   public MapCodec<dmo> a() {
      return b;
   }

   protected dmo(dsk.d $$0) {
      super($$0);
   }

   @Override
   protected bql b(dsl $$0, dcg $$1, ja $$2) {
      return new bqr(($$2x, $$3, $$4) -> new crh($$2x, $$3, cpu.a($$1, $$2)), c);
   }

   @Override
   protected bqh a(dsl $$0, dcg $$1, ja $$2, cml $$3, ewd $$4) {
      if ($$1.B) {
         return bqh.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(avr.aF);
         return bqh.c;
      }
   }
}
