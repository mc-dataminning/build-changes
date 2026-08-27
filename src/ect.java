import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ect(eec b) implements ecb {
   public static final Codec<ect> a = RecordCodecBuilder.create($$0 -> $$0.group(eec.a.fieldOf("to_place").forGetter($$0x -> $$0x.b)).apply($$0, ect::new));

   public eec a() {
      return this.b;
   }
}
