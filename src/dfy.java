import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dfy(ji<cyz> c) {
   public static final Codec<dfy> a = RecordCodecBuilder.create($$0 -> $$0.group(jt.a(mg.K).fieldOf("items").forGetter(dfy::a)).apply($$0, dfy::new));
   public static final yw<wj, dfy> b = yw.a(yu.c(mg.K), dfy::a, dfy::new);

   public boolean a(czd $$0) {
      return $$0.a(this.c);
   }

   public ji<cyz> a() {
      return this.c;
   }
}
