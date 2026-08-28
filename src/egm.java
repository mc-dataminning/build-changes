import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record egm(ehv b) implements efu {
   public static final Codec<egm> a = RecordCodecBuilder.create($$0 -> $$0.group(ehv.a.fieldOf("to_place").forGetter($$0x -> $$0x.b)).apply($$0, egm::new));

   public ehv a() {
      return this.b;
   }
}
