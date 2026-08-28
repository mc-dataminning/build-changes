import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dhx(dhw e, wy f) {
   public static final Codec<dhx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dhw.b.forGetter(dhx::a), xa.a.fieldOf("description").forGetter(dhx::b)).apply($$0, dhx::new)
   );
   public static final yw<wj, dhx> b = yw.a(dhw.c, dhx::a, xa.b, dhx::b, dhx::new);
   public static final Codec<jf<dhx>> c = alc.a(mh.bk, a);
   public static final yw<wj, jf<dhx>> d = yu.a(mh.bk, b);

   public dhw a() {
      return this.e;
   }

   public wy b() {
      return this.f;
   }
}
