import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record deg(ju<cxk> c) {
   public static final Codec<deg> a = RecordCodecBuilder.create($$0 -> $$0.group(kf.a(mb.K).fieldOf("items").forGetter(deg::a)).apply($$0, deg::new));
   public static final zt<xg, deg> b = zt.a(zr.c(mb.K), deg::a, deg::new);

   public boolean a(cxo $$0) {
      return $$0.a(this.c);
   }

   public ju<cxk> a() {
      return this.c;
   }
}
