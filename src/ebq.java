import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ebq(ecz b) implements eay {
   public static final Codec<ebq> a = RecordCodecBuilder.create($$0 -> $$0.group(ecz.a.fieldOf("to_place").forGetter($$0x -> $$0x.b)).apply($$0, ebq::new));

   public ecz a() {
      return this.b;
   }
}
