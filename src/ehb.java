import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ehb(eik b) implements egj {
   public static final Codec<ehb> a = RecordCodecBuilder.create($$0 -> $$0.group(eik.a.fieldOf("to_place").forGetter($$0x -> $$0x.b)).apply($$0, ehb::new));

   public eik a() {
      return this.b;
   }
}
