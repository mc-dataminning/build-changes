import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ehh(eiq b) implements egp {
   public static final Codec<ehh> a = RecordCodecBuilder.create($$0 -> $$0.group(eiq.a.fieldOf("to_place").forGetter($$0x -> $$0x.b)).apply($$0, ehh::new));

   public eiq a() {
      return this.b;
   }
}
