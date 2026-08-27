import com.mojang.serialization.MapCodec;

public class cuu extends ctc {
   public static final MapCodec<cuu> a = b(cuu::new);
   private static final tl b = tl.c("container.crafting");

   @Override
   public MapCodec<? extends cuu> a() {
      return a;
   }

   protected cuu(dfc.d $$0) {
      super($$0);
   }

   @Override
   public bhe a(dfd $$0, cqb $$1, gw $$2, cca $$3, bhd $$4, ehd $$5) {
      if ($$1.B) {
         return bhe.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(apq.an);
         return bhe.b;
      }
   }

   @Override
   public bhh b(dfd $$0, cqb $$1, gw $$2) {
      return new bhm(($$2x, $$3, $$4) -> new cfg($$2x, $$3, cfc.a($$1, $$2)), b);
   }
}
