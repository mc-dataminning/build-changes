import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dbu(jt<cvt> c) {
   public static final Codec<dbu> a = RecordCodecBuilder.create($$0 -> $$0.group(ke.a(ly.K).fieldOf("items").forGetter(dbu::a)).apply($$0, dbu::new));
   public static final zf<ws, dbu> b = zf.a(zd.c(ly.K), dbu::a, dbu::new);

   public boolean a(cvx $$0) {
      return $$0.a(this.c);
   }

   public jt<cvt> a() {
      return this.c;
   }
}
