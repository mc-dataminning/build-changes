import com.mojang.serialization.MapCodec;

public class cys extends cwy {
   public static final MapCodec<cys> a = b(cys::new);
   private static final vg b = vg.c("container.crafting");

   @Override
   public MapCodec<? extends cys> a() {
      return a;
   }

   protected cys(djo.d $$0) {
      super($$0);
   }

   @Override
   public bkc a(djp $$0, ctx $$1, hx $$2, cfq $$3, ely $$4) {
      if ($$1.B) {
         return bkc.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(asd.an);
         return bkc.b;
      }
   }

   @Override
   public bkg b(djp $$0, ctx $$1, hx $$2) {
      return new bkm(($$2x, $$3, $$4) -> new cja($$2x, $$3, ciu.a($$1, $$2)), b);
   }
}
