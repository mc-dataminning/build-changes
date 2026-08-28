import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record egq(ehz b) implements efy {
   public static final Codec<egq> a = RecordCodecBuilder.create($$0 -> $$0.group(ehz.a.fieldOf("to_place").forGetter($$0x -> $$0x.b)).apply($$0, egq::new));

   public ehz a() {
      return this.b;
   }
}
