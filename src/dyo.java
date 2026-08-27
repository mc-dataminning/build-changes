import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dyo(dzx b) implements dxw {
   public static final Codec<dyo> a = RecordCodecBuilder.create($$0 -> $$0.group(dzx.a.fieldOf("to_place").forGetter($$0x -> $$0x.b)).apply($$0, dyo::new));

   public dzx a() {
      return this.b;
   }
}
