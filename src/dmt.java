import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dmt(akf e, String f) {
   public static final Codec<dmt> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(akf.a.fieldOf("asset_id").forGetter(dmt::a), Codec.STRING.fieldOf("translation_key").forGetter(dmt::b)).apply($$0, dmt::new)
   );
   public static final yq<wd, dmt> b = yq.a(akf.b, dmt::a, yo.k, dmt::b, dmt::new);
   public static final Codec<iv<dmt>> c = akb.a(ld.d, a);
   public static final yq<wd, iv<dmt>> d = yo.a(ld.d, b);

   public akf a() {
      return this.e;
   }

   public String b() {
      return this.f;
   }
}
