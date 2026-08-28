import com.mojang.serialization.MapCodec;

public class dot extends djg {
   public static final MapCodec<dot> b = b(dot::new);
   private static final xe c = xe.c("container.upgrade");

   @Override
   public MapCodec<dot> a() {
      return b;
   }

   protected dot(dur.d $$0) {
      super($$0);
   }

   @Override
   protected bru b(dus $$0, dej $$1, jf $$2) {
      return new bsa(($$2x, $$3, $$4) -> new csz($$2x, $$3, crm.a($$1, $$2)), c);
   }

   @Override
   protected brs a(dus $$0, dej $$1, jf $$2, cnx $$3, eys $$4) {
      if (!$$1.B) {
         $$3.a($$0.b($$1, $$2));
         $$3.a(awq.aF);
      }

      return brs.a;
   }
}
