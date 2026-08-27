import com.mojang.serialization.MapCodec;

public class dlt extends dch {
   public static final MapCodec<dlt> a = b(dlt::new);

   @Override
   public MapCodec<dlt> a() {
      return a;
   }

   public dlt(dph.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dpi $$0, czg $$1, id $$2, bqa $$3) {
      $$3.a($$0, new esj(0.25, 0.05F, 0.25));
   }
}
