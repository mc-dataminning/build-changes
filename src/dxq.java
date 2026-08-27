import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dxq(dyz b) implements dwy {
   public static final Codec<dxq> a = RecordCodecBuilder.create($$0 -> $$0.group(dyz.a.fieldOf("to_place").forGetter($$0x -> $$0x.b)).apply($$0, dxq::new));

   public dyz a() {
      return this.b;
   }
}
