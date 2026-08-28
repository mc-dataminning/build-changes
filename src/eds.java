import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eds(efb b) implements eda {
   public static final Codec<eds> a = RecordCodecBuilder.create($$0 -> $$0.group(efb.a.fieldOf("to_place").forGetter($$0x -> $$0x.b)).apply($$0, eds::new));

   public efb a() {
      return this.b;
   }
}
