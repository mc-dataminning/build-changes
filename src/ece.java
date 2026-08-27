import com.mojang.serialization.Codec;

public class ece extends ect {
   public static final Codec<ece> a = dja.b.fieldOf("block_state").xmap(ece::new, $$0 -> $$0.b).codec();
   private final dja b;

   public ece(dja $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(dja $$0, aup $$1) {
      return $$0 == this.b;
   }

   @Override
   protected ecu<?> a() {
      return ecu.c;
   }
}
