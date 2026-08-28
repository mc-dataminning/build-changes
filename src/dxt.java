import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dxt(alk e, String f) {
   public static final Codec<dxt> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(alk.a.fieldOf("asset_id").forGetter(dxt::a), Codec.STRING.fieldOf("translation_key").forGetter(dxt::b)).apply($$0, dxt::new)
   );
   public static final za<wn, dxt> b = za.a(alk.b, dxt::a, yy.p, dxt::b, dxt::new);
   public static final Codec<jg<dxt>> c = alg.a(mi.aF, a);
   public static final za<wn, jg<dxt>> d = yy.a(mi.aF, b);

   public alk a() {
      return this.e;
   }

   public String b() {
      return this.f;
   }
}
