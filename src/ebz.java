import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ebz(edi b) implements ebh {
   public static final Codec<ebz> a = RecordCodecBuilder.create($$0 -> $$0.group(edi.a.fieldOf("to_place").forGetter($$0x -> $$0x.b)).apply($$0, ebz::new));

   public edi a() {
      return this.b;
   }
}
