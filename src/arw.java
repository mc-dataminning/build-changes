import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record arw(cmy b) {
   private static final Codec<arw> c = RecordCodecBuilder.create($$0 -> $$0.group(cna.f.fieldOf("enabled").forGetter(arw::a)).apply($$0, arw::new));
   public static final aso<arw> a = aso.a("features", c);

   public cmy a() {
      return this.b;
   }
}
