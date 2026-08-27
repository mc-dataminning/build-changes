import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dqh(drq b) implements dpp {
   public static final Codec<dqh> a = RecordCodecBuilder.create($$0 -> $$0.group(drq.a.fieldOf("to_place").forGetter($$0x -> $$0x.b)).apply($$0, dqh::new));

   public drq a() {
      return this.b;
   }
}
