import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dpf(akk e, String f) {
   public static final Codec<dpf> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(akk.a.fieldOf("asset_id").forGetter(dpf::a), Codec.STRING.fieldOf("translation_key").forGetter(dpf::b)).apply($$0, dpf::new)
   );
   public static final ys<wf, dpf> b = ys.a(akk.b, dpf::a, yq.l, dpf::b, dpf::new);
   public static final Codec<jj<dpf>> c = akg.a(lr.d, a);
   public static final ys<wf, jj<dpf>> d = yq.a(lr.d, b);

   public akk a() {
      return this.e;
   }

   public String b() {
      return this.f;
   }
}
