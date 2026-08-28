import com.mojang.serialization.MapCodec;

public class dnu extends dma {
   public static final MapCodec<dnu> a = b(dnu::new);
   private static final wy b = wy.c("container.crafting");

   @Override
   public MapCodec<? extends dnu> a() {
      return a;
   }

   protected dnu(dzy.d $$0) {
      super($$0);
   }

   @Override
   protected bub a(dzz $$0, div $$1, iu $$2, cqy $$3, fee $$4) {
      if (!$$1.C) {
         $$3.a($$0.b($$1, $$2));
         $$3.a(awx.an);
      }

      return bub.a;
   }

   @Override
   protected bud b(dzz $$0, div $$1, iu $$2) {
      return new buj(($$2x, $$3, $$4) -> new cvj($$2x, $$3, cvd.a($$1, $$2)), b);
   }
}
