import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ddh(jv<cwl> c) {
   public static final Codec<ddh> a = RecordCodecBuilder.create($$0 -> $$0.group(kg.a(mc.K).fieldOf("items").forGetter(ddh::a)).apply($$0, ddh::new));
   public static final ym<vz, ddh> b = ym.a(yk.c(mc.K), ddh::a, ddh::new);

   public boolean a(cwp $$0) {
      return $$0.a(this.c);
   }

   public jv<cwl> a() {
      return this.c;
   }
}
