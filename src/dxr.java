import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dxr(ali e, String f) {
   public static final Codec<dxr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ali.a.fieldOf("asset_id").forGetter(dxr::a), Codec.STRING.fieldOf("translation_key").forGetter(dxr::b)).apply($$0, dxr::new)
   );
   public static final yy<wl, dxr> b = yy.a(ali.b, dxr::a, yw.p, dxr::b, dxr::new);
   public static final Codec<jf<dxr>> c = ale.a(mh.aF, a);
   public static final yy<wl, jf<dxr>> d = yw.a(mh.aF, b);

   public ali a() {
      return this.e;
   }

   public String b() {
      return this.f;
   }
}
