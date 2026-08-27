import com.mojang.serialization.Codec;

public class ect extends edi {
   public static final Codec<ect> a = djp.b.fieldOf("block_state").xmap(ect::new, $$0 -> $$0.b).codec();
   private final djp b;

   public ect(djp $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(djp $$0, auw $$1) {
      return $$0 == this.b;
   }

   @Override
   protected edj<?> a() {
      return edj.c;
   }
}
