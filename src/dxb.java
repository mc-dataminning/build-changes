import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dxb(alg e, String f) {
   public static final Codec<dxb> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(alg.a.fieldOf("asset_id").forGetter(dxb::a), Codec.STRING.fieldOf("translation_key").forGetter(dxb::b)).apply($$0, dxb::new)
   );
   public static final yw<wj, dxb> b = yw.a(alg.b, dxb::a, yu.p, dxb::b, dxb::new);
   public static final Codec<jf<dxb>> c = alc.a(mh.aF, a);
   public static final yw<wj, jf<dxb>> d = yu.a(mh.aF, b);

   public alg a() {
      return this.e;
   }

   public String b() {
      return this.f;
   }
}
