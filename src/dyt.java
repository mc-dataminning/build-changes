import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dyt extends dyv {
   public static final Codec<dyt> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dfj.b.fieldOf("block_state").forGetter($$0x -> $$0x.b), Codec.FLOAT.fieldOf("probability").forGetter($$0x -> $$0x.d))
            .apply($$0, dyt::new)
   );
   private final dfj b;
   private final float d;

   public dyt(dfj $$0, float $$1) {
      this.b = $$0;
      this.d = $$1;
   }

   @Override
   public boolean a(dfj $$0, asc $$1) {
      return $$0 == this.b && $$1.i() < this.d;
   }

   @Override
   protected dyw<?> a() {
      return dyw.f;
   }
}
