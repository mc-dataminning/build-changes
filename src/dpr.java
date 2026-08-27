import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dpr(akt e, String f) {
   public static final Codec<dpr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(akt.a.fieldOf("asset_id").forGetter(dpr::a), Codec.STRING.fieldOf("translation_key").forGetter(dpr::b)).apply($$0, dpr::new)
   );
   public static final zc<wp, dpr> b = zc.a(akt.b, dpr::a, za.l, dpr::b, dpr::new);
   public static final Codec<ja<dpr>> c = akp.a(li.d, a);
   public static final zc<wp, ja<dpr>> d = za.a(li.d, b);

   public akt a() {
      return this.e;
   }

   public String b() {
      return this.f;
   }
}
