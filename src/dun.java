import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dun(alz e, String f) {
   public static final Codec<dun> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(alz.a.fieldOf("asset_id").forGetter(dun::a), Codec.STRING.fieldOf("translation_key").forGetter(dun::b)).apply($$0, dun::new)
   );
   public static final zt<xg, dun> b = zt.a(alz.b, dun::a, zr.o, dun::b, dun::new);
   public static final Codec<jq<dun>> c = alv.a(mb.d, a);
   public static final zt<xg, jq<dun>> d = zr.a(mb.d, b);

   public alz a() {
      return this.e;
   }

   public String b() {
      return this.f;
   }
}
