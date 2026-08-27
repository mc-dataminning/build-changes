import com.mojang.serialization.Codec;

public class duy extends dvn {
   public static final Codec<duy> a = dcb.b.fieldOf("block_state").xmap(duy::new, $$0 -> $$0.b).codec();
   private final dcb b;

   public duy(dcb $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(dcb $$0, apf $$1) {
      return $$0 == this.b;
   }

   @Override
   protected dvo<?> a() {
      return dvo.c;
   }
}
