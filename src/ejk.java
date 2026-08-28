import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ejk(ekt b) implements eis {
   public static final Codec<ejk> a = RecordCodecBuilder.create($$0 -> $$0.group(ekt.a.fieldOf("to_place").forGetter($$0x -> $$0x.b)).apply($$0, ejk::new));

   public ekt a() {
      return this.b;
   }
}
