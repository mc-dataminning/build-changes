import com.mojang.serialization.MapCodec;

public class dmw extends dgx {
   public static final MapCodec<dmw> b = b(dmw::new);
   private static final xe c = xe.c("container.upgrade");

   @Override
   public MapCodec<dmw> a() {
      return b;
   }

   protected dmw(dtb.d $$0) {
      super($$0);
   }

   @Override
   protected bqe b(dtc $$0, dca $$1, ir $$2) {
      return new bqk(($$2x, $$3, $$4) -> new crh($$2x, $$3, cpr.a($$1, $$2)), c);
   }

   @Override
   protected bqa a(dtc $$0, dca $$1, ir $$2, cly $$3, ewq $$4) {
      if ($$1.C) {
         return bqa.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(avz.aG);
         return bqa.b;
      }
   }
}
