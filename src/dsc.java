import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dsc(ali e, String f) {
   public static final Codec<dsc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ali.a.fieldOf("asset_id").forGetter(dsc::a), Codec.STRING.fieldOf("translation_key").forGetter(dsc::b)).apply($$0, dsc::new)
   );
   public static final zg<wt, dsc> b = zg.a(ali.b, dsc::a, ze.m, dsc::b, dsc::new);
   public static final Codec<jq<dsc>> c = ale.a(lz.d, a);
   public static final zg<wt, jq<dsc>> d = ze.a(lz.d, b);

   public ali a() {
      return this.e;
   }

   public String b() {
      return this.f;
   }
}
