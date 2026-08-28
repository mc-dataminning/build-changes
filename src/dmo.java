import com.mojang.serialization.MapCodec;

public class dmo extends dku {
   public static final MapCodec<dmo> a = b(dmo::new);
   private static final wv b = wv.c("container.crafting");

   @Override
   public MapCodec<? extends dmo> a() {
      return a;
   }

   protected dmo(dyl.d $$0) {
      super($$0);
   }

   @Override
   protected btq a(dym $$0, dhp $$1, jj $$2, cqi $$3, fcq $$4) {
      if (!$$1.C) {
         $$3.a($$0.c($$1, $$2));
         $$3.a(awu.an);
      }

      return btq.a;
   }

   @Override
   protected bts b(dym $$0, dhp $$1, jj $$2) {
      return new bty(($$2x, $$3, $$4) -> new cug($$2x, $$3, cua.a($$1, $$2)), b);
   }
}
