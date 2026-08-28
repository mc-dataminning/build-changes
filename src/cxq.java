import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record cxq(jq<axe> e, xv f, float g, int h) {
   public static final Codec<cxq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               axe.b.fieldOf("sound_event").forGetter(cxq::b),
               xx.a.fieldOf("description").forGetter(cxq::c),
               azn.o.fieldOf("length_in_seconds").forGetter(cxq::d),
               azn.a(0, 15).fieldOf("comparator_output").forGetter(cxq::e)
            )
            .apply($$0, cxq::new)
   );
   public static final zt<xg, cxq> b = zt.a(axe.d, cxq::b, xx.b, cxq::c, zr.l, cxq::d, zr.h, cxq::e, cxq::new);
   public static final Codec<jq<cxq>> c = alw.a(mb.L);
   public static final zt<xg, jq<cxq>> d = zr.a(mb.L, b);
   private static final int i = 20;

   public int a() {
      return bae.f(this.g * 20.0F);
   }

   public boolean a(long $$0) {
      return $$0 >= (long)(this.a() + 20);
   }

   public static Optional<jq<cxq>> a(js.a $$0, cxk $$1) {
      cxp $$2 = $$1.a(ku.ab);
      return $$2 != null ? $$2.a().a($$0) : Optional.empty();
   }

   public jq<axe> b() {
      return this.e;
   }

   public xv c() {
      return this.f;
   }

   public float d() {
      return this.g;
   }

   public int e() {
      return this.h;
   }
}
