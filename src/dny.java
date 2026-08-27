import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dny(akn e, String f) {
   public static final Codec<dny> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(akn.a.fieldOf("asset_id").forGetter(dny::a), Codec.STRING.fieldOf("translation_key").forGetter(dny::b)).apply($$0, dny::new)
   );
   public static final yv<wi, dny> b = yv.a(akn.b, dny::a, yt.k, dny::b, dny::new);
   public static final Codec<ix<dny>> c = akj.a(lf.d, a);
   public static final yv<wi, ix<dny>> d = yt.a(lf.d, b);

   public akn a() {
      return this.e;
   }

   public String b() {
      return this.f;
   }
}
