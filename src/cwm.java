import com.mojang.serialization.MapCodec;

public class cwm extends cut {
   public static final MapCodec<cwm> a = b(cwm::new);
   private static final ur b = ur.c("container.crafting");

   @Override
   public MapCodec<? extends cwm> a() {
      return a;
   }

   protected cwm(dgv.d $$0) {
      super($$0);
   }

   @Override
   public biq a(dgw $$0, crs $$1, ht $$2, cdm $$3, bip $$4, eje $$5) {
      if ($$1.B) {
         return biq.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(aqx.an);
         return biq.b;
      }
   }

   @Override
   public bit b(dgw $$0, crs $$1, ht $$2) {
      return new biy(($$2x, $$3, $$4) -> new cgv($$2x, $$3, cgp.a($$1, $$2)), b);
   }
}
