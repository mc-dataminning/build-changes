import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record deh(ju<cxl> c) {
   public static final Codec<deh> a = RecordCodecBuilder.create($$0 -> $$0.group(kf.a(mb.K).fieldOf("items").forGetter(deh::a)).apply($$0, deh::new));
   public static final zt<xg, deh> b = zt.a(zr.c(mb.K), deh::a, deh::new);

   public boolean a(cxp $$0) {
      return $$0.a(this.c);
   }

   public ju<cxl> a() {
      return this.c;
   }
}
