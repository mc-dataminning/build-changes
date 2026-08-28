import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dpd(akk e, String f) {
   public static final Codec<dpd> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(akk.a.fieldOf("asset_id").forGetter(dpd::a), Codec.STRING.fieldOf("translation_key").forGetter(dpd::b)).apply($$0, dpd::new)
   );
   public static final ys<wf, dpd> b = ys.a(akk.b, dpd::a, yq.l, dpd::b, dpd::new);
   public static final Codec<jj<dpd>> c = akg.a(lr.d, a);
   public static final ys<wf, jj<dpd>> d = yq.a(lr.d, b);

   public akk a() {
      return this.e;
   }

   public String b() {
      return this.f;
   }
}
