import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cxr extends cwy {
   public static final MapCodec<cxr> a = b(cxr::new);
   private static final vg b = vg.c("container.cartography_table");

   @Override
   public MapCodec<cxr> a() {
      return a;
   }

   protected cxr(djo.d $$0) {
      super($$0);
   }

   @Override
   public bkc a(djp $$0, ctx $$1, hx $$2, cfq $$3, ely $$4) {
      if ($$1.B) {
         return bkc.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(asd.aw);
         return bkc.b;
      }
   }

   @Nullable
   @Override
   public bkg b(djp $$0, ctx $$1, hx $$2) {
      return new bkm(($$2x, $$3, $$4) -> new cip($$2x, $$3, ciu.a($$1, $$2)), b);
   }
}
