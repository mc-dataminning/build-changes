import com.mojang.serialization.MapCodec;

public class dta extends dxa {
   public static final MapCodec<dta> a = b(dta::new);
   private static final fgw b = dno.b(12.0, 0.0, 3.0);

   @Override
   public MapCodec<dta> a() {
      return a;
   }

   public dta(ebp.d $$0) {
      super($$0);
   }

   @Override
   protected fgw a(ebq $$0, djn $$1, iw $$2, fgh $$3) {
      return b;
   }

   @Override
   protected boolean b(ebq $$0, djn $$1, iw $$2) {
      return $$0.a(axn.aO) || $$0.a(dnq.eo) || super.b($$0, $$1, $$2);
   }
}
