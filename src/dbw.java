import com.mojang.serialization.MapCodec;

public class dbw extends dac {
   public static final MapCodec<dbw> a = b(dbw::new);
   private static final vu b = vu.c("container.crafting");

   @Override
   public MapCodec<? extends dbw> a() {
      return a;
   }

   protected dbw(dna.d $$0) {
      super($$0);
   }

   @Override
   protected bnd a(dnb $$0, cxb $$1, ib $$2, ciu $$3, epp $$4) {
      if ($$1.B) {
         return bnd.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(aui.an);
         return bnd.b;
      }
   }

   @Override
   protected bnh b(dnb $$0, cxb $$1, ib $$2) {
      return new bnn(($$2x, $$3, $$4) -> new cmh($$2x, $$3, cmb.a($$1, $$2)), b);
   }
}
