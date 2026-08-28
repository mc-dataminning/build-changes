import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record asw(cpk b) {
   private static final Codec<asw> c = RecordCodecBuilder.create($$0 -> $$0.group(cpm.f.fieldOf("enabled").forGetter(asw::a)).apply($$0, asw::new));
   public static final ato<asw> a = ato.a("features", c);

   public cpk a() {
      return this.b;
   }
}
