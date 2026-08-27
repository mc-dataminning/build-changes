import com.mojang.serialization.Codec;

public class eeq extends eff {
   public static final Codec<eeq> a = dlj.b.fieldOf("block_state").xmap(eeq::new, $$0 -> $$0.b).codec();
   private final dlj b;

   public eeq(dlj $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(dlj $$0, awp $$1) {
      return $$0 == this.b;
   }

   @Override
   protected efg<?> a() {
      return efg.c;
   }
}
