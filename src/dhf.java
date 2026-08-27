import com.mojang.serialization.MapCodec;

public class dhf extends dbu {
   public static final MapCodec<dhf> b = b(dhf::new);
   private static final vu c = vu.c("container.upgrade");

   @Override
   public MapCodec<dhf> a() {
      return b;
   }

   protected dhf(dmy.d $$0) {
      super($$0);
   }

   @Override
   protected bng b(dmz $$0, cwz $$1, ib $$2) {
      return new bnm(($$2x, $$3, $$4) -> new cnk($$2x, $$3, clz.a($$1, $$2)), c);
   }

   @Override
   protected bnc a(dmz $$0, cwz $$1, ib $$2, cis $$3, epn $$4) {
      if ($$1.B) {
         return bnc.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(aui.aF);
         return bnc.b;
      }
   }
}
