import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dnw(akm e, String f) {
   public static final Codec<dnw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(akm.a.fieldOf("asset_id").forGetter(dnw::a), Codec.STRING.fieldOf("translation_key").forGetter(dnw::b)).apply($$0, dnw::new)
   );
   public static final yv<wi, dnw> b = yv.a(akm.b, dnw::a, yt.k, dnw::b, dnw::new);
   public static final Codec<ix<dnw>> c = aki.a(lf.d, a);
   public static final yv<wi, ix<dnw>> d = yt.a(lf.d, b);

   public akm a() {
      return this.e;
   }

   public String b() {
      return this.f;
   }
}
