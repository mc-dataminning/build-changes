import com.mojang.serialization.MapCodec;

public class cwu extends cva {
   public static final MapCodec<cwu> a = b(cwu::new);
   private static final ur b = ur.c("container.crafting");

   @Override
   public MapCodec<? extends cwu> a() {
      return a;
   }

   protected cwu(dhh.d $$0) {
      super($$0);
   }

   @Override
   public bix a(dhi $$0, csa $$1, ht $$2, cdu $$3, biw $$4, ejq $$5) {
      if ($$1.B) {
         return bix.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(arb.an);
         return bix.b;
      }
   }

   @Override
   public bja b(dhi $$0, csa $$1, ht $$2) {
      return new bjf(($$2x, $$3, $$4) -> new chd($$2x, $$3, cgx.a($$1, $$2)), b);
   }
}
