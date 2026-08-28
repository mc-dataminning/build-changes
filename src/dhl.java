import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dhl(dhk e, wy f) {
   public static final Codec<dhl> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dhk.b.forGetter(dhl::a), xa.a.fieldOf("description").forGetter(dhl::b)).apply($$0, dhl::new)
   );
   public static final yw<wj, dhl> b = yw.a(dhk.c, dhl::a, xa.b, dhl::b, dhl::new);
   public static final Codec<je<dhl>> c = alc.a(mg.bj, a);
   public static final yw<wj, je<dhl>> d = yu.a(mg.bj, b);

   public dhk a() {
      return this.e;
   }

   public wy b() {
      return this.f;
   }
}
