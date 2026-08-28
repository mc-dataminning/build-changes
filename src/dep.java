import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dep(jw<cxu> c) {
   public static final Codec<dep> a = RecordCodecBuilder.create($$0 -> $$0.group(kh.a(me.K).fieldOf("items").forGetter(dep::a)).apply($$0, dep::new));
   public static final yt<wg, dep> b = yt.a(yr.c(me.K), dep::a, dep::new);

   public boolean a(cxy $$0) {
      return $$0.a(this.c);
   }

   public jw<cxu> a() {
      return this.c;
   }
}
