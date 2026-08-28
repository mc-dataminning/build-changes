import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record drw(alh e, String f) {
   public static final Codec<drw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(alh.a.fieldOf("asset_id").forGetter(drw::a), Codec.STRING.fieldOf("translation_key").forGetter(drw::b)).apply($$0, drw::new)
   );
   public static final zf<ws, drw> b = zf.a(alh.b, drw::a, zd.m, drw::b, drw::new);
   public static final Codec<jp<drw>> c = ald.a(ly.d, a);
   public static final zf<ws, jp<drw>> d = zd.a(ly.d, b);

   public alh a() {
      return this.e;
   }

   public String b() {
      return this.f;
   }
}
