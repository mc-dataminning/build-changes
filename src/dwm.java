import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dwm(alg e, String f) {
   public static final Codec<dwm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(alg.a.fieldOf("asset_id").forGetter(dwm::a), Codec.STRING.fieldOf("translation_key").forGetter(dwm::b)).apply($$0, dwm::new)
   );
   public static final yw<wj, dwm> b = yw.a(alg.b, dwm::a, yu.o, dwm::b, dwm::new);
   public static final Codec<je<dwm>> c = alc.a(mg.aF, a);
   public static final yw<wj, je<dwm>> d = yu.a(mg.aF, b);

   public alg a() {
      return this.e;
   }

   public String b() {
      return this.f;
   }
}
