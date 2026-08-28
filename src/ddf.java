import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ddf(jv<cwj> c) {
   public static final Codec<ddf> a = RecordCodecBuilder.create($$0 -> $$0.group(kg.a(mc.K).fieldOf("items").forGetter(ddf::a)).apply($$0, ddf::new));
   public static final ym<vz, ddf> b = ym.a(yk.c(mc.K), ddf::a, ddf::new);

   public boolean a(cwn $$0) {
      return $$0.a(this.c);
   }

   public jv<cwj> a() {
      return this.c;
   }
}
