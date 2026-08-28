import com.mojang.serialization.MapCodec;

public class dhc extends dfi {
   public static final MapCodec<dhc> a = b(dhc::new);
   private static final wu b = wu.c("container.crafting");

   @Override
   public MapCodec<? extends dhc> a() {
      return a;
   }

   protected dhc(dsk.d $$0) {
      super($$0);
   }

   @Override
   protected bqh a(dsl $$0, dcg $$1, ja $$2, cml $$3, ewd $$4) {
      if ($$1.B) {
         return bqh.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(avr.an);
         return bqh.c;
      }
   }

   @Override
   protected bql b(dsl $$0, dcg $$1, ja $$2) {
      return new bqr(($$2x, $$3, $$4) -> new cqa($$2x, $$3, cpu.a($$1, $$2)), b);
   }
}
