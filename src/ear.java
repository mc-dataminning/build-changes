import com.mojang.serialization.Codec;

public class ear extends ebg {
   public static final Codec<ear> a = dhn.b.fieldOf("block_state").xmap(ear::new, $$0 -> $$0.b).codec();
   private final dhn b;

   public ear(dhn $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(dhn $$0, atw $$1) {
      return $$0 == this.b;
   }

   @Override
   protected ebh<?> a() {
      return ebh.c;
   }
}
