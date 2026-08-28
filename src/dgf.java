import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dgf(jj<czg> c) {
   public static final Codec<dgf> a = RecordCodecBuilder.create($$0 -> $$0.group(ju.a(mh.K).fieldOf("items").forGetter(dgf::a)).apply($$0, dgf::new));
   public static final yw<wj, dgf> b = yw.a(yu.c(mh.K), dgf::a, dgf::new);

   public boolean a(czk $$0) {
      return $$0.a(this.c);
   }

   public jj<czg> a() {
      return this.c;
   }
}
