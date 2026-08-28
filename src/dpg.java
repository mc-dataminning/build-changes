import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dpg(akk e, String f) {
   public static final Codec<dpg> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(akk.a.fieldOf("asset_id").forGetter(dpg::a), Codec.STRING.fieldOf("translation_key").forGetter(dpg::b)).apply($$0, dpg::new)
   );
   public static final ys<wf, dpg> b = ys.a(akk.b, dpg::a, yq.l, dpg::b, dpg::new);
   public static final Codec<jj<dpg>> c = akg.a(lr.d, a);
   public static final ys<wf, jj<dpg>> d = yq.a(lr.d, b);

   public akk a() {
      return this.e;
   }

   public String b() {
      return this.f;
   }
}
