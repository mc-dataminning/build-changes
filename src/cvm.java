import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cvm extends cut {
   public static final MapCodec<cvm> a = b(cvm::new);
   private static final ur b = ur.c("container.cartography_table");

   @Override
   public MapCodec<cvm> a() {
      return a;
   }

   protected cvm(dgv.d $$0) {
      super($$0);
   }

   @Override
   public biq a(dgw $$0, crs $$1, ht $$2, cdm $$3, bip $$4, eje $$5) {
      if ($$1.B) {
         return biq.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(aqx.aw);
         return biq.b;
      }
   }

   @Nullable
   @Override
   public bit b(dgw $$0, crs $$1, ht $$2) {
      return new biy(($$2x, $$3, $$4) -> new cgk($$2x, $$3, cgp.a($$1, $$2)), b);
   }
}
