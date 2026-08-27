import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dym(dzv b) implements dxu {
   public static final Codec<dym> a = RecordCodecBuilder.create($$0 -> $$0.group(dzv.a.fieldOf("to_place").forGetter($$0x -> $$0x.b)).apply($$0, dym::new));

   public dzv a() {
      return this.b;
   }
}
