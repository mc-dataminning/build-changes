import com.mojang.serialization.MapCodec;

public class doz extends dne {
   public static final MapCodec<doz> a = b(doz::new);
   private static final xc b = xc.c("container.crafting");

   @Override
   public MapCodec<? extends doz> a() {
      return a;
   }

   protected doz(ebf.d $$0) {
      super($$0);
   }

   @Override
   protected but a(ebg $$0, djz $$1, iw $$2, crz $$3, ffo $$4) {
      if (!$$1.C) {
         $$3.a($$0.b($$1, $$2));
         $$3.a(axb.an);
      }

      return but.a;
   }

   @Override
   protected buv b(ebg $$0, djz $$1, iw $$2) {
      return new bvb(($$2x, $$3, $$4) -> new cwl($$2x, $$3, cwf.a($$1, $$2)), b);
   }
}
