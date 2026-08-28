import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dsh(all e, String f) {
   public static final Codec<dsh> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(all.a.fieldOf("asset_id").forGetter(dsh::a), Codec.STRING.fieldOf("translation_key").forGetter(dsh::b)).apply($$0, dsh::new)
   );
   public static final zj<ww, dsh> b = zj.a(all.b, dsh::a, zh.m, dsh::b, dsh::new);
   public static final Codec<jq<dsh>> c = alh.a(ma.d, a);
   public static final zj<ww, jq<dsh>> d = zh.a(ma.d, b);

   public all a() {
      return this.e;
   }

   public String b() {
      return this.f;
   }
}
