import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record edv(efe b) implements edd {
   public static final Codec<edv> a = RecordCodecBuilder.create($$0 -> $$0.group(efe.a.fieldOf("to_place").forGetter($$0x -> $$0x.b)).apply($$0, edv::new));

   public efe a() {
      return this.b;
   }
}
