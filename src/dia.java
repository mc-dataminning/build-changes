import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dia(dhz e, wy f) {
   public static final Codec<dia> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dhz.b.forGetter(dia::a), xa.a.fieldOf("description").forGetter(dia::b)).apply($$0, dia::new)
   );
   public static final yw<wj, dia> b = yw.a(dhz.c, dia::a, xa.b, dia::b, dia::new);
   public static final Codec<jf<dia>> c = alc.a(mh.bk, a);
   public static final yw<wj, jf<dia>> d = yu.a(mh.bk, b);

   public dhz a() {
      return this.e;
   }

   public wy b() {
      return this.f;
   }
}
