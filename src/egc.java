import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class egc implements efy {
   public static final Codec<egc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.intRange(0, dyo.c).fieldOf("height").forGetter($$0x -> $$0x.b), dus.a.fieldOf("state").forGetter($$0x -> $$0x.c))
            .apply($$0, egc::new)
   );
   public final int b;
   public final dus c;

   public egc(int $$0, dus $$1) {
      this.b = $$0;
      this.c = $$1;
   }
}
