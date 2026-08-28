import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dhq(dhp e, wy f) {
   public static final Codec<dhq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dhp.b.forGetter(dhq::a), xa.a.fieldOf("description").forGetter(dhq::b)).apply($$0, dhq::new)
   );
   public static final yw<wj, dhq> b = yw.a(dhp.c, dhq::a, xa.b, dhq::b, dhq::new);
   public static final Codec<je<dhq>> c = alc.a(mg.bk, a);
   public static final yw<wj, je<dhq>> d = yu.a(mg.bk, b);

   public dhp a() {
      return this.e;
   }

   public wy b() {
      return this.f;
   }
}
