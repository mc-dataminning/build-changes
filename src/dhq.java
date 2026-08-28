import com.mojang.serialization.MapCodec;

public class dhq extends dfw {
   public static final MapCodec<dhq> a = b(dhq::new);
   private static final wy b = wy.c("container.crafting");

   @Override
   public MapCodec<? extends dhq> a() {
      return a;
   }

   protected dhq(dsz.d $$0) {
      super($$0);
   }

   @Override
   protected bqq a(dta $$0, dcu $$1, jd $$2, cmv $$3, ews $$4) {
      if ($$1.B) {
         return bqq.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(avy.an);
         return bqq.c;
      }
   }

   @Override
   protected bqu b(dta $$0, dcu $$1, jd $$2) {
      return new bra(($$2x, $$3, $$4) -> new cqk($$2x, $$3, cqe.a($$1, $$2)), b);
   }
}
