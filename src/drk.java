import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record drk(dst b) implements dqs {
   public static final Codec<drk> a = RecordCodecBuilder.create($$0 -> $$0.group(dst.a.fieldOf("to_place").forGetter($$0x -> $$0x.b)).apply($$0, drk::new));

   public dst a() {
      return this.b;
   }
}
