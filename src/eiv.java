import com.mojang.serialization.Codec;

public class eiv extends ejk {
   public static final Codec<eiv> a = dpi.b.fieldOf("block_state").xmap(eiv::new, $$0 -> $$0.b).codec();
   private final dpi b;

   public eiv(dpi $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(dpi $$0, axt $$1) {
      return $$0 == this.b;
   }

   @Override
   protected ejl<?> a() {
      return ejl.c;
   }
}
