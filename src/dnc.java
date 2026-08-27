import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dnc(akh e, String f) {
   public static final Codec<dnc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(akh.a.fieldOf("asset_id").forGetter(dnc::a), Codec.STRING.fieldOf("translation_key").forGetter(dnc::b)).apply($$0, dnc::new)
   );
   public static final ys<wf, dnc> b = ys.a(akh.b, dnc::a, yq.k, dnc::b, dnc::new);
   public static final Codec<iw<dnc>> c = akd.a(le.d, a);
   public static final ys<wf, iw<dnc>> d = yq.a(le.d, b);

   public akh a() {
      return this.e;
   }

   public String b() {
      return this.f;
   }
}
