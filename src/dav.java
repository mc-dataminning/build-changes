import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dav extends dac {
   public static final MapCodec<dav> a = b(dav::new);
   private static final vu b = vu.c("container.cartography_table");

   @Override
   public MapCodec<dav> a() {
      return a;
   }

   protected dav(dna.d $$0) {
      super($$0);
   }

   @Override
   protected bnd a(dnb $$0, cxb $$1, ib $$2, ciu $$3, epp $$4) {
      if ($$1.B) {
         return bnd.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(aui.aw);
         return bnd.b;
      }
   }

   @Nullable
   @Override
   protected bnh b(dnb $$0, cxb $$1, ib $$2) {
      return new bnn(($$2x, $$3, $$4) -> new clw($$2x, $$3, cmb.a($$1, $$2)), b);
   }
}
