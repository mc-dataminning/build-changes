import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dum(alz e, String f) {
   public static final Codec<dum> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(alz.a.fieldOf("asset_id").forGetter(dum::a), Codec.STRING.fieldOf("translation_key").forGetter(dum::b)).apply($$0, dum::new)
   );
   public static final zt<xg, dum> b = zt.a(alz.b, dum::a, zr.o, dum::b, dum::new);
   public static final Codec<jq<dum>> c = alv.a(mb.d, a);
   public static final zt<xg, jq<dum>> d = zr.a(mb.d, b);

   public alz a() {
      return this.e;
   }

   public String b() {
      return this.f;
   }
}
