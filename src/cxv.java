import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record cxv(jq<axe> e, xv f, float g, int h) {
   public static final Codec<cxv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               axe.b.fieldOf("sound_event").forGetter(cxv::b),
               xx.a.fieldOf("description").forGetter(cxv::c),
               azn.o.fieldOf("length_in_seconds").forGetter(cxv::d),
               azn.a(0, 15).fieldOf("comparator_output").forGetter(cxv::e)
            )
            .apply($$0, cxv::new)
   );
   public static final zt<xg, cxv> b = zt.a(axe.d, cxv::b, xx.b, cxv::c, zr.l, cxv::d, zr.h, cxv::e, cxv::new);
   public static final Codec<jq<cxv>> c = alw.a(mb.L);
   public static final zt<xg, jq<cxv>> d = zr.a(mb.L, b);
   private static final int i = 20;

   public int a() {
      return bae.f(this.g * 20.0F);
   }

   public boolean a(long $$0) {
      return $$0 >= (long)(this.a() + 20);
   }

   public static Optional<jq<cxv>> a(js.a $$0, cxp $$1) {
      cxu $$2 = $$1.a(ku.ab);
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
