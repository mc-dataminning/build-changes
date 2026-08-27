import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ecv(eee b) implements ecd {
   public static final Codec<ecv> a = RecordCodecBuilder.create($$0 -> $$0.group(eee.a.fieldOf("to_place").forGetter($$0x -> $$0x.b)).apply($$0, ecv::new));

   public eee a() {
      return this.b;
   }
}
