import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record amf(cec b) {
   private static final Codec<amf> c = RecordCodecBuilder.create($$0 -> $$0.group(cee.e.fieldOf("enabled").forGetter(amf::a)).apply($$0, amf::new));
   public static final amv<amf> a = amv.a("features", c);

   public cec a() {
      return this.b;
   }
}
