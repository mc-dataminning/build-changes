import com.mojang.serialization.MapCodec;

public class dgs extends dey {
   public static final MapCodec<dgs> a = b(dgs::new);
   private static final xo b = xo.c("container.crafting");

   @Override
   public MapCodec<? extends dgs> a() {
      return a;
   }

   protected dgs(dsa.d $$0) {
      super($$0);
   }

   @Override
   protected bqt a(dsb $$0, dbx $$1, iz $$2, cmw $$3, evm $$4) {
      if ($$1.B) {
         return bqt.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(awj.an);
         return bqt.c;
      }
   }

   @Override
   protected bqx b(dsb $$0, dbx $$1, iz $$2) {
      return new brd(($$2x, $$3, $$4) -> new cqk($$2x, $$3, cqe.a($$1, $$2)), b);
   }
}
