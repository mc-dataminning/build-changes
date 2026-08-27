import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cvt extends cva {
   public static final MapCodec<cvt> a = b(cvt::new);
   private static final ur b = ur.c("container.cartography_table");

   @Override
   public MapCodec<cvt> a() {
      return a;
   }

   protected cvt(dhh.d $$0) {
      super($$0);
   }

   @Override
   public bix a(dhi $$0, csa $$1, ht $$2, cdu $$3, biw $$4, ejq $$5) {
      if ($$1.B) {
         return bix.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(arb.aw);
         return bix.b;
      }
   }

   @Nullable
   @Override
   public bja b(dhi $$0, csa $$1, ht $$2) {
      return new bjf(($$2x, $$3, $$4) -> new cgs($$2x, $$3, cgx.a($$1, $$2)), b);
   }
}
