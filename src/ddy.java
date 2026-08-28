import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ddy(ju<cxc> c) {
   public static final Codec<ddy> a = RecordCodecBuilder.create($$0 -> $$0.group(kf.a(mb.K).fieldOf("items").forGetter(ddy::a)).apply($$0, ddy::new));
   public static final zi<wv, ddy> b = zi.a(zg.c(mb.K), ddy::a, ddy::new);

   public boolean a(cxg $$0) {
      return $$0.a(this.c);
   }

   public ju<cxc> a() {
      return this.c;
   }
}
