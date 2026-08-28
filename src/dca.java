import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dca(ju<cvx> c) {
   public static final Codec<dca> a = RecordCodecBuilder.create($$0 -> $$0.group(kf.a(lz.K).fieldOf("items").forGetter(dca::a)).apply($$0, dca::new));
   public static final zg<wt, dca> b = zg.a(ze.c(lz.K), dca::a, dca::new);

   public boolean a(cwb $$0) {
      return $$0.a(this.c);
   }

   public ju<cvx> a() {
      return this.c;
   }
}
