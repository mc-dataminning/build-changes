import com.mojang.serialization.MapCodec;

public class dnd extends dhq {
   public static final MapCodec<dnd> b = b(dnd::new);
   private static final wy c = wy.c("container.upgrade");

   @Override
   public MapCodec<dnd> a() {
      return b;
   }

   protected dnd(dsz.d $$0) {
      super($$0);
   }

   @Override
   protected bqu b(dta $$0, dcu $$1, jd $$2) {
      return new bra(($$2x, $$3, $$4) -> new crr($$2x, $$3, cqe.a($$1, $$2)), c);
   }

   @Override
   protected bqq a(dta $$0, dcu $$1, jd $$2, cmv $$3, ews $$4) {
      if ($$1.B) {
         return bqq.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(avy.aF);
         return bqq.c;
      }
   }
}
