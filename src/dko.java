import com.mojang.serialization.MapCodec;

public class dko extends djs {
   public static final MapCodec<dko> a = b(dko::new);
   private static final wy b = wy.c("container.loom");

   @Override
   public MapCodec<dko> a() {
      return a;
   }

   protected dko(dsz.d $$0) {
      super($$0);
   }

   @Override
   protected bqq a(dta $$0, dcu $$1, jd $$2, cmv $$3, ews $$4) {
      if ($$1.B) {
         return bqq.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(avy.ax);
         return bqq.c;
      }
   }

   @Override
   protected bqu b(dta $$0, dcu $$1, jd $$2) {
      return new bra(($$2x, $$3, $$4) -> new cqy($$2x, $$3, cqe.a($$1, $$2)), b);
   }

   @Override
   public dta a(cyb $$0) {
      return this.o().a(aE, $$0.g().g());
   }

   @Override
   protected void a(dtb.a<dfw, dta> $$0) {
      $$0.a(aE);
   }
}
