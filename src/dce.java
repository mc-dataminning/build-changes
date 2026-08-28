import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dce(ju<cwb> c) {
   public static final Codec<dce> a = RecordCodecBuilder.create($$0 -> $$0.group(kf.a(ma.K).fieldOf("items").forGetter(dce::a)).apply($$0, dce::new));
   public static final zj<ww, dce> b = zj.a(zh.c(ma.K), dce::a, dce::new);

   public boolean a(cwf $$0) {
      return $$0.a(this.c);
   }

   public ju<cwb> a() {
      return this.c;
   }
}
