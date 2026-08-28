import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dhf(dhe e, ww f) {
   public static final Codec<dhf> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dhe.b.forGetter(dhf::a), wy.a.fieldOf("description").forGetter(dhf::b)).apply($$0, dhf::new)
   );
   public static final yu<wh, dhf> b = yu.a(dhe.c, dhf::a, wy.b, dhf::b, dhf::new);
   public static final Codec<je<dhf>> c = ala.a(mg.bi, a);
   public static final yu<wh, je<dhf>> d = ys.a(mg.bi, b);

   public dhe a() {
      return this.e;
   }

   public ww b() {
      return this.f;
   }
}
