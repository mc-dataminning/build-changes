import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dpx(akr e, String f) {
   public static final Codec<dpx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(akr.a.fieldOf("asset_id").forGetter(dpx::a), Codec.STRING.fieldOf("translation_key").forGetter(dpx::b)).apply($$0, dpx::new)
   );
   public static final yx<wk, dpx> b = yx.a(akr.b, dpx::a, yv.l, dpx::b, dpx::new);
   public static final Codec<jm<dpx>> c = akn.a(lu.d, a);
   public static final yx<wk, jm<dpx>> d = yv.a(lu.d, b);

   public akr a() {
      return this.e;
   }

   public String b() {
      return this.f;
   }
}
