import com.mojang.serialization.MapCodec;

public class dgx extends dfc {
   public static final MapCodec<dgx> a = b(dgx::new);
   private static final xe b = xe.c("container.crafting");

   @Override
   public MapCodec<? extends dgx> a() {
      return a;
   }

   protected dgx(dtb.d $$0) {
      super($$0);
   }

   @Override
   protected bqa a(dtc $$0, dca $$1, ir $$2, cly $$3, ewq $$4) {
      if ($$1.C) {
         return bqa.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(avz.ao);
         return bqa.b;
      }
   }

   @Override
   protected bqe b(dtc $$0, dca $$1, ir $$2) {
      return new bqk(($$2x, $$3, $$4) -> new cpx($$2x, $$3, cpr.a($$1, $$2)), b);
   }
}
