import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dnz extends dne {
   public static final MapCodec<dnz> a = b(dnz::new);
   private static final xc b = xc.c("container.cartography_table");

   @Override
   public MapCodec<dnz> a() {
      return a;
   }

   protected dnz(ebf.d $$0) {
      super($$0);
   }

   @Override
   protected but a(ebg $$0, djz $$1, iw $$2, crz $$3, ffo $$4) {
      if (!$$1.C) {
         $$3.a($$0.b($$1, $$2));
         $$3.a(axb.aw);
      }

      return but.a;
   }

   @Nullable
   @Override
   protected buv b(ebg $$0, djz $$1, iw $$2) {
      return new bvb(($$2x, $$3, $$4) -> new cwa($$2x, $$3, cwf.a($$1, $$2)), b);
   }
}
