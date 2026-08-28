import com.mojang.serialization.MapCodec;

public class dme extends dgs {
   public static final MapCodec<dme> b = b(dme::new);
   private static final xo c = xo.c("container.upgrade");

   @Override
   public MapCodec<dme> a() {
      return b;
   }

   protected dme(dsa.d $$0) {
      super($$0);
   }

   @Override
   protected bqx b(dsb $$0, dbx $$1, iz $$2) {
      return new brd(($$2x, $$3, $$4) -> new crr($$2x, $$3, cqe.a($$1, $$2)), c);
   }

   @Override
   protected bqt a(dsb $$0, dbx $$1, iz $$2, cmw $$3, evm $$4) {
      if ($$1.B) {
         return bqt.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(awj.aF);
         return bqt.c;
      }
   }
}
