import com.mojang.serialization.MapCodec;

public class duu extends doz {
   public static final MapCodec<duu> b = b(duu::new);
   private static final xc c = xc.c("container.upgrade");

   @Override
   public MapCodec<duu> a() {
      return b;
   }

   protected duu(ebf.d $$0) {
      super($$0);
   }

   @Override
   protected buv b(ebg $$0, djz $$1, iw $$2) {
      return new bvb(($$2x, $$3, $$4) -> new cxs($$2x, $$3, cwf.a($$1, $$2)), c);
   }

   @Override
   protected but a(ebg $$0, djz $$1, iw $$2, crz $$3, ffo $$4) {
      if (!$$1.C) {
         $$3.a($$0.b($$1, $$2));
         $$3.a(axb.aF);
      }

      return but.a;
   }
}
