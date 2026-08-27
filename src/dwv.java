import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dwv(dye b) implements dwd {
   public static final Codec<dwv> a = RecordCodecBuilder.create($$0 -> $$0.group(dye.a.fieldOf("to_place").forGetter($$0x -> $$0x.b)).apply($$0, dwv::new));

   public dye a() {
      return this.b;
   }
}
