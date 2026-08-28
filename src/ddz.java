import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ddz(ju<cxg> c) {
   public static final Codec<ddz> a = RecordCodecBuilder.create($$0 -> $$0.group(kf.a(mb.K).fieldOf("items").forGetter(ddz::a)).apply($$0, ddz::new));
   public static final zt<xg, ddz> b = zt.a(zr.c(mb.K), ddz::a, ddz::new);

   public boolean a(cxk $$0) {
      return $$0.a(this.c);
   }

   public ju<cxg> a() {
      return this.c;
   }
}
