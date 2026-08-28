import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dwc(ale e, String f) {
   public static final Codec<dwc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ale.a.fieldOf("asset_id").forGetter(dwc::a), Codec.STRING.fieldOf("translation_key").forGetter(dwc::b)).apply($$0, dwc::new)
   );
   public static final yu<wh, dwc> b = yu.a(ale.b, dwc::a, ys.o, dwc::b, dwc::new);
   public static final Codec<je<dwc>> c = ala.a(mg.aF, a);
   public static final yu<wh, je<dwc>> d = ys.a(mg.aF, b);

   public ale a() {
      return this.e;
   }

   public String b() {
      return this.f;
   }
}
