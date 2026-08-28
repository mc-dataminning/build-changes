import com.mojang.serialization.MapCodec;

public class ems extends enh {
   public static final MapCodec<ems> a = dta.b.fieldOf("block_state").xmap(ems::new, $$0 -> $$0.b);
   private final dta b;

   public ems(dta $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(dta $$0, ayv $$1) {
      return $$0 == this.b;
   }

   @Override
   protected eni<?> a() {
      return eni.c;
   }
}
