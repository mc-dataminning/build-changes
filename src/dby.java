import com.mojang.serialization.MapCodec;

public class dby extends cwm {
   public static final MapCodec<dby> b = b(dby::new);
   private static final ur c = ur.c("container.upgrade");

   @Override
   public MapCodec<dby> a() {
      return b;
   }

   protected dby(dgv.d $$0) {
      super($$0);
   }

   @Override
   public bit b(dgw $$0, crs $$1, ht $$2) {
      return new biy(($$2x, $$3, $$4) -> new cia($$2x, $$3, cgp.a($$1, $$2)), c);
   }

   @Override
   public biq a(dgw $$0, crs $$1, ht $$2, cdm $$3, bip $$4, eje $$5) {
      if ($$1.B) {
         return biq.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(aqx.aF);
         return biq.b;
      }
   }
}
