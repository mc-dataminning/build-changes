import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ddg(jv<cwk> c) {
   public static final Codec<ddg> a = RecordCodecBuilder.create($$0 -> $$0.group(kg.a(mc.K).fieldOf("items").forGetter(ddg::a)).apply($$0, ddg::new));
   public static final yn<wa, ddg> b = yn.a(yl.c(mc.K), ddg::a, ddg::new);

   public boolean a(cwo $$0) {
      return $$0.a(this.c);
   }

   public jv<cwk> a() {
      return this.c;
   }
}
