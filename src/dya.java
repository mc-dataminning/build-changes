import com.mojang.serialization.Codec;

public class dya extends dyp {
   public static final Codec<dya> a = dfd.b.fieldOf("block_state").xmap(dya::new, $$0 -> $$0.b).codec();
   private final dfd b;

   public dya(dfd $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(dfd $$0, ash $$1) {
      return $$0 == this.b;
   }

   @Override
   protected dyq<?> a() {
      return dyq.c;
   }
}
