import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dgi(jj<czj> c) {
   public static final Codec<dgi> a = RecordCodecBuilder.create($$0 -> $$0.group(ju.a(mh.K).fieldOf("items").forGetter(dgi::a)).apply($$0, dgi::new));
   public static final yw<wj, dgi> b = yw.a(yu.c(mh.K), dgi::a, dgi::new);

   public boolean a(czn $$0) {
      return $$0.a(this.c);
   }

   public jj<czj> a() {
      return this.c;
   }
}
