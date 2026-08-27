import com.mojang.serialization.MapCodec;

public class dhh extends dbw {
   public static final MapCodec<dhh> b = b(dhh::new);
   private static final vu c = vu.c("container.upgrade");

   @Override
   public MapCodec<dhh> a() {
      return b;
   }

   protected dhh(dna.d $$0) {
      super($$0);
   }

   @Override
   protected bnh b(dnb $$0, cxb $$1, ib $$2) {
      return new bnn(($$2x, $$3, $$4) -> new cnm($$2x, $$3, cmb.a($$1, $$2)), c);
   }

   @Override
   protected bnd a(dnb $$0, cxb $$1, ib $$2, ciu $$3, epp $$4) {
      if ($$1.B) {
         return bnd.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(aui.aF);
         return bnd.b;
      }
   }
}
