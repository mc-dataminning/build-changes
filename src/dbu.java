import com.mojang.serialization.MapCodec;

public class dbu extends daa {
   public static final MapCodec<dbu> a = b(dbu::new);
   private static final vu b = vu.c("container.crafting");

   @Override
   public MapCodec<? extends dbu> a() {
      return a;
   }

   protected dbu(dmy.d $$0) {
      super($$0);
   }

   @Override
   protected bnc a(dmz $$0, cwz $$1, ib $$2, cis $$3, epn $$4) {
      if ($$1.B) {
         return bnc.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(aui.an);
         return bnc.b;
      }
   }

   @Override
   protected bng b(dmz $$0, cwz $$1, ib $$2) {
      return new bnm(($$2x, $$3, $$4) -> new cmf($$2x, $$3, clz.a($$1, $$2)), b);
   }
}
