import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eji extends ejk {
   public static final Codec<eji> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dpi.b.fieldOf("block_state").forGetter($$0x -> $$0x.b), Codec.FLOAT.fieldOf("probability").forGetter($$0x -> $$0x.d))
            .apply($$0, eji::new)
   );
   private final dpi b;
   private final float d;

   public eji(dpi $$0, float $$1) {
      this.b = $$0;
      this.d = $$1;
   }

   @Override
   public boolean a(dpi $$0, axt $$1) {
      return $$0 == this.b && $$1.i() < this.d;
   }

   @Override
   protected ejl<?> a() {
      return ejl.f;
   }
}
