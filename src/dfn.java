import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dfn(ji<cyo> c) {
   public static final Codec<dfn> a = RecordCodecBuilder.create($$0 -> $$0.group(jt.a(mg.K).fieldOf("items").forGetter(dfn::a)).apply($$0, dfn::new));
   public static final yu<wh, dfn> b = yu.a(ys.c(mg.K), dfn::a, dfn::new);

   public boolean a(cys $$0) {
      return $$0.a(this.c);
   }

   public ji<cyo> a() {
      return this.c;
   }
}
