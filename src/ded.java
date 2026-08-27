import com.mojang.serialization.MapCodec;

public class ded extends cys {
   public static final MapCodec<ded> b = b(ded::new);
   private static final vg c = vg.c("container.upgrade");

   @Override
   public MapCodec<ded> a() {
      return b;
   }

   protected ded(djo.d $$0) {
      super($$0);
   }

   @Override
   public bkg b(djp $$0, ctx $$1, hx $$2) {
      return new bkm(($$2x, $$3, $$4) -> new ckf($$2x, $$3, ciu.a($$1, $$2)), c);
   }

   @Override
   public bkc a(djp $$0, ctx $$1, hx $$2, cfq $$3, ely $$4) {
      if ($$1.B) {
         return bkc.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(asd.aF);
         return bkc.b;
      }
   }
}
