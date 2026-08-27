import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record duy(dwh b) implements dug {
   public static final Codec<duy> a = RecordCodecBuilder.create($$0 -> $$0.group(dwh.a.fieldOf("to_place").forGetter($$0x -> $$0x.b)).apply($$0, duy::new));

   public dwh a() {
      return this.b;
   }
}
