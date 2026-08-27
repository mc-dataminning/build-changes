import com.mojang.serialization.Codec;

public class dyb extends dyq {
   public static final Codec<dyb> a = dfe.b.fieldOf("block_state").xmap(dyb::new, $$0 -> $$0.b).codec();
   private final dfe b;

   public dyb(dfe $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(dfe $$0, arx $$1) {
      return $$0 == this.b;
   }

   @Override
   protected dyr<?> a() {
      return dyr.c;
   }
}
