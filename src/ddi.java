import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ddi(jv<cwm> c) {
   public static final Codec<ddi> a = RecordCodecBuilder.create($$0 -> $$0.group(kg.a(mc.K).fieldOf("items").forGetter(ddi::a)).apply($$0, ddi::new));
   public static final yn<wa, ddi> b = yn.a(yl.c(mc.K), ddi::a, ddi::new);

   public boolean a(cwq $$0) {
      return $$0.a(this.c);
   }

   public jv<cwm> a() {
      return this.c;
   }
}
