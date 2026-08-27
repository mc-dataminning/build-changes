import com.mojang.serialization.MapCodec;

public class dag extends cuu {
   public static final MapCodec<dag> b = b(dag::new);
   private static final tl c = tl.c("container.upgrade");

   @Override
   public MapCodec<dag> a() {
      return b;
   }

   protected dag(dfc.d $$0) {
      super($$0);
   }

   @Override
   public bhh b(dfd $$0, cqb $$1, gw $$2) {
      return new bhm(($$2x, $$3, $$4) -> new cgk($$2x, $$3, cfc.a($$1, $$2)), c);
   }

   @Override
   public bhe a(dfd $$0, cqb $$1, gw $$2, cca $$3, bhd $$4, ehd $$5) {
      if ($$1.B) {
         return bhe.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(apq.aF);
         return bhe.b;
      }
   }
}
