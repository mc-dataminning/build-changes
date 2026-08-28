import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eea(efj b) implements edi {
   public static final Codec<eea> a = RecordCodecBuilder.create($$0 -> $$0.group(efj.a.fieldOf("to_place").forGetter($$0x -> $$0x.b)).apply($$0, eea::new));

   public efj a() {
      return this.b;
   }
}
