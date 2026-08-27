import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dsr(dua b) implements drz {
   public static final Codec<dsr> a = RecordCodecBuilder.create($$0 -> $$0.group(dua.a.fieldOf("to_place").forGetter($$0x -> $$0x.b)).apply($$0, dsr::new));

   public dua a() {
      return this.b;
   }
}
