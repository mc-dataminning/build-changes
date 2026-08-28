import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dwu(alg e, String f) {
   public static final Codec<dwu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(alg.a.fieldOf("asset_id").forGetter(dwu::a), Codec.STRING.fieldOf("translation_key").forGetter(dwu::b)).apply($$0, dwu::new)
   );
   public static final yw<wj, dwu> b = yw.a(alg.b, dwu::a, yu.o, dwu::b, dwu::new);
   public static final Codec<je<dwu>> c = alc.a(mg.aF, a);
   public static final yw<wj, je<dwu>> d = yu.a(mg.aF, b);

   public alg a() {
      return this.e;
   }

   public String b() {
      return this.f;
   }
}
