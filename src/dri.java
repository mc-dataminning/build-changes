import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dri(alc e, String f) {
   public static final Codec<dri> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(alc.a.fieldOf("asset_id").forGetter(dri::a), Codec.STRING.fieldOf("translation_key").forGetter(dri::b)).apply($$0, dri::new)
   );
   public static final zb<wo, dri> b = zb.a(alc.b, dri::a, yz.l, dri::b, dri::new);
   public static final Codec<jn<dri>> c = aky.a(lv.d, a);
   public static final zb<wo, jn<dri>> d = yz.a(lv.d, b);

   public alc a() {
      return this.e;
   }

   public String b() {
      return this.f;
   }
}
