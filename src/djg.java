import com.mojang.serialization.MapCodec;

public class djg extends dhm {
   public static final MapCodec<djg> a = b(djg::new);
   private static final xe b = xe.c("container.crafting");

   @Override
   public MapCodec<? extends djg> a() {
      return a;
   }

   protected djg(dur.d $$0) {
      super($$0);
   }

   @Override
   protected brs a(dus $$0, dej $$1, jf $$2, cnx $$3, eys $$4) {
      if (!$$1.B) {
         $$3.a($$0.b($$1, $$2));
         $$3.a(awq.an);
      }

      return brs.a;
   }

   @Override
   protected bru b(dus $$0, dej $$1, jf $$2) {
      return new bsa(($$2x, $$3, $$4) -> new crs($$2x, $$3, crm.a($$1, $$2)), b);
   }
}
