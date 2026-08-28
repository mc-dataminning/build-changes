import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eeh(efq b) implements edp {
   public static final Codec<eeh> a = RecordCodecBuilder.create($$0 -> $$0.group(efq.a.fieldOf("to_place").forGetter($$0x -> $$0x.b)).apply($$0, eeh::new));

   public efq a() {
      return this.b;
   }
}
