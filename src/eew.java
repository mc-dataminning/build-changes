import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eew(egf b) implements eee {
   public static final Codec<eew> a = RecordCodecBuilder.create($$0 -> $$0.group(egf.a.fieldOf("to_place").forGetter($$0x -> $$0x.b)).apply($$0, eew::new));

   public egf a() {
      return this.b;
   }
}
