import com.mojang.serialization.MapCodec;

public class dcf extends cwu {
   public static final MapCodec<dcf> b = b(dcf::new);
   private static final ur c = ur.c("container.upgrade");

   @Override
   public MapCodec<dcf> a() {
      return b;
   }

   protected dcf(dhh.d $$0) {
      super($$0);
   }

   @Override
   public bja b(dhi $$0, csa $$1, ht $$2) {
      return new bjf(($$2x, $$3, $$4) -> new cii($$2x, $$3, cgx.a($$1, $$2)), c);
   }

   @Override
   public bix a(dhi $$0, csa $$1, ht $$2, cdu $$3, biw $$4, ejq $$5) {
      if ($$1.B) {
         return bix.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(arb.aF);
         return bix.b;
      }
   }
}
