import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dxg(alg e, String f) {
   public static final Codec<dxg> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(alg.a.fieldOf("asset_id").forGetter(dxg::a), Codec.STRING.fieldOf("translation_key").forGetter(dxg::b)).apply($$0, dxg::new)
   );
   public static final yw<wj, dxg> b = yw.a(alg.b, dxg::a, yu.p, dxg::b, dxg::new);
   public static final Codec<jf<dxg>> c = alc.a(mh.aF, a);
   public static final yw<wj, jf<dxg>> d = yu.a(mh.aF, b);

   public alg a() {
      return this.e;
   }

   public String b() {
      return this.f;
   }
}
