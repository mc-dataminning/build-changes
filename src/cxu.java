import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record cxu(jq<axe> e, xv f, float g, int h) {
   public static final Codec<cxu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               axe.b.fieldOf("sound_event").forGetter(cxu::b),
               xx.a.fieldOf("description").forGetter(cxu::c),
               azn.o.fieldOf("length_in_seconds").forGetter(cxu::d),
               azn.a(0, 15).fieldOf("comparator_output").forGetter(cxu::e)
            )
            .apply($$0, cxu::new)
   );
   public static final zt<xg, cxu> b = zt.a(axe.d, cxu::b, xx.b, cxu::c, zr.l, cxu::d, zr.h, cxu::e, cxu::new);
   public static final Codec<jq<cxu>> c = alw.a(mb.L);
   public static final zt<xg, jq<cxu>> d = zr.a(mb.L, b);
   private static final int i = 20;

   public int a() {
      return bae.f(this.g * 20.0F);
   }

   public boolean a(long $$0) {
      return $$0 >= (long)(this.a() + 20);
   }

   public static Optional<jq<cxu>> a(js.a $$0, cxo $$1) {
      cxt $$2 = $$1.a(ku.ab);
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
