import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dup(dvy b) implements dtx {
   public static final Codec<dup> a = RecordCodecBuilder.create($$0 -> $$0.group(dvy.a.fieldOf("to_place").forGetter($$0x -> $$0x.b)).apply($$0, dup::new));

   public dvy a() {
      return this.b;
   }
}
