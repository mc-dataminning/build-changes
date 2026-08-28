import com.mojang.serialization.MapCodec;

public class dhs extends dfy {
   public static final MapCodec<dhs> a = b(dhs::new);
   private static final wz b = wz.c("container.crafting");

   @Override
   public MapCodec<? extends dhs> a() {
      return a;
   }

   protected dhs(dtb.d $$0) {
      super($$0);
   }

   @Override
   protected bqr a(dtc $$0, dcw $$1, jd $$2, cmx $$3, ewy $$4) {
      if ($$1.B) {
         return bqr.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(avz.an);
         return bqr.c;
      }
   }

   @Override
   protected bqv b(dtc $$0, dcw $$1, jd $$2) {
      return new brb(($$2x, $$3, $$4) -> new cqm($$2x, $$3, cqg.a($$1, $$2)), b);
   }
}
