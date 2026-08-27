import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ear(eca b) implements dzz {
   public static final Codec<ear> a = RecordCodecBuilder.create($$0 -> $$0.group(eca.a.fieldOf("to_place").forGetter($$0x -> $$0x.b)).apply($$0, ear::new));

   public eca a() {
      return this.b;
   }
}
