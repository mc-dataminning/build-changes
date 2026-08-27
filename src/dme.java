import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dme(ajv e, String f) {
   public static final Codec<dme> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ajv.a.fieldOf("asset_id").forGetter(dme::a), Codec.STRING.fieldOf("translation_key").forGetter(dme::b)).apply($$0, dme::new)
   );
   public static final yg<vt, dme> b = yg.a(ajv.b, dme::a, ye.k, dme::b, dme::new);
   public static final Codec<in<dme>> c = ajr.a(ku.d, a);
   public static final yg<vt, in<dme>> d = ye.a(ku.d, b);

   public ajv a() {
      return this.e;
   }

   public String b() {
      return this.f;
   }
}
