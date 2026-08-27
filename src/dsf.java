import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dsf(dto b) implements drn {
   public static final Codec<dsf> a = RecordCodecBuilder.create($$0 -> $$0.group(dto.a.fieldOf("to_place").forGetter($$0x -> $$0x.b)).apply($$0, dsf::new));

   public dto a() {
      return this.b;
   }
}
