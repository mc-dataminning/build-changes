import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dgt(jj<czu> c) {
   public static final Codec<dgt> a = RecordCodecBuilder.create($$0 -> $$0.group(ju.a(mh.K).fieldOf("items").forGetter(dgt::a)).apply($$0, dgt::new));
   public static final yy<wl, dgt> b = yy.a(yw.c(mh.K), dgt::a, dgt::new);

   public boolean a(czy $$0) {
      return $$0.a(this.c);
   }

   public jj<czu> a() {
      return this.c;
   }
}
