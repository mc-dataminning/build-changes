import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dft(ji<cyu> c) {
   public static final Codec<dft> a = RecordCodecBuilder.create($$0 -> $$0.group(jt.a(mg.K).fieldOf("items").forGetter(dft::a)).apply($$0, dft::new));
   public static final yw<wj, dft> b = yw.a(yu.c(mg.K), dft::a, dft::new);

   public boolean a(cyy $$0) {
      return $$0.a(this.c);
   }

   public ji<cyu> a() {
      return this.c;
   }
}
