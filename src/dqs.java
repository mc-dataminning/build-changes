import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dqs(dsb b) implements dqa {
   public static final Codec<dqs> a = RecordCodecBuilder.create($$0 -> $$0.group(dsb.a.fieldOf("to_place").forGetter($$0x -> $$0x.b)).apply($$0, dqs::new));

   public dsb a() {
      return this.b;
   }
}
