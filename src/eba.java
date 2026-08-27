import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eba(ecj b) implements eai {
   public static final Codec<eba> a = RecordCodecBuilder.create($$0 -> $$0.group(ecj.a.fieldOf("to_place").forGetter($$0x -> $$0x.b)).apply($$0, eba::new));

   public ecj a() {
      return this.b;
   }
}
