import com.mojang.serialization.MapCodec;

public class dpg extends dfc {
   public static final MapCodec<dpg> a = b(dpg::new);

   @Override
   public MapCodec<dpg> a() {
      return a;
   }

   public dpg(dtb.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dtc $$0, dca $$1, ir $$2, brv $$3) {
      $$3.a($$0, new ewu(0.25, 0.05F, 0.25));
   }
}
