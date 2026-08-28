import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dso(alj e, String f) {
   public static final Codec<dso> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(alj.a.fieldOf("asset_id").forGetter(dso::a), Codec.STRING.fieldOf("translation_key").forGetter(dso::b)).apply($$0, dso::new)
   );
   public static final zh<wu, dso> b = zh.a(alj.b, dso::a, zf.n, dso::b, dso::new);
   public static final Codec<jq<dso>> c = alf.a(ma.d, a);
   public static final zh<wu, jq<dso>> d = zf.a(ma.d, b);

   public alj a() {
      return this.e;
   }

   public String b() {
      return this.f;
   }
}
