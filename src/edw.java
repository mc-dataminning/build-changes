import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record edw(eff b) implements ede {
   public static final Codec<edw> a = RecordCodecBuilder.create($$0 -> $$0.group(eff.a.fieldOf("to_place").forGetter($$0x -> $$0x.b)).apply($$0, edw::new));

   public eff a() {
      return this.b;
   }
}
