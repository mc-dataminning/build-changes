import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eeg(efp b) implements edo {
   public static final Codec<eeg> a = RecordCodecBuilder.create($$0 -> $$0.group(efp.a.fieldOf("to_place").forGetter($$0x -> $$0x.b)).apply($$0, eeg::new));

   public efp a() {
      return this.b;
   }
}
