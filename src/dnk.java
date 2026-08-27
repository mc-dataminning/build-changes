import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dnk(dot b) implements dms {
   public static final Codec<dnk> a = RecordCodecBuilder.create($$0 -> $$0.group(dot.a.fieldOf("to_place").forGetter($$0x -> $$0x.b)).apply($$0, dnk::new));

   public dot a() {
      return this.b;
   }
}
