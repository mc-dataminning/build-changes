import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dpv(akq e, String f) {
   public static final Codec<dpv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(akq.a.fieldOf("asset_id").forGetter(dpv::a), Codec.STRING.fieldOf("translation_key").forGetter(dpv::b)).apply($$0, dpv::new)
   );
   public static final yw<wj, dpv> b = yw.a(akq.b, dpv::a, yu.l, dpv::b, dpv::new);
   public static final Codec<jm<dpv>> c = akm.a(lu.d, a);
   public static final yw<wj, jm<dpv>> d = yu.a(lu.d, b);

   public akq a() {
      return this.e;
   }

   public String b() {
      return this.f;
   }
}
