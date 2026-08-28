import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record duf(alz e, String f) {
   public static final Codec<duf> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(alz.a.fieldOf("asset_id").forGetter(duf::a), Codec.STRING.fieldOf("translation_key").forGetter(duf::b)).apply($$0, duf::new)
   );
   public static final zt<xg, duf> b = zt.a(alz.b, duf::a, zr.o, duf::b, duf::new);
   public static final Codec<jq<duf>> c = alv.a(mb.d, a);
   public static final zt<xg, jq<duf>> d = zr.a(mb.d, b);

   public alz a() {
      return this.e;
   }

   public String b() {
      return this.f;
   }
}
