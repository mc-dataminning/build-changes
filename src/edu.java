import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record edu(efd b) implements edc {
   public static final Codec<edu> a = RecordCodecBuilder.create($$0 -> $$0.group(efd.a.fieldOf("to_place").forGetter($$0x -> $$0x.b)).apply($$0, edu::new));

   public efd a() {
      return this.b;
   }
}
