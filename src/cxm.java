import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record cxm(jq<awu> e, xk f, float g, int h) {
   public static final Codec<cxm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               awu.b.fieldOf("sound_event").forGetter(cxm::b),
               xm.a.fieldOf("description").forGetter(cxm::c),
               azd.o.fieldOf("length_in_seconds").forGetter(cxm::d),
               azd.a(0, 15).fieldOf("comparator_output").forGetter(cxm::e)
            )
            .apply($$0, cxm::new)
   );
   public static final zi<wv, cxm> b = zi.a(awu.d, cxm::b, xm.b, cxm::c, zg.l, cxm::d, zg.h, cxm::e, cxm::new);
   public static final Codec<jq<cxm>> c = alm.a(mb.L);
   public static final zi<wv, jq<cxm>> d = zg.a(mb.L, b);
   private static final int i = 20;

   public int a() {
      return azu.f(this.g * 20.0F);
   }

   public boolean a(long $$0) {
      return $$0 >= (long)(this.a() + 20);
   }

   public static Optional<jq<cxm>> a(js.a $$0, cxg $$1) {
      cxl $$2 = $$1.a(ku.ab);
      return $$2 != null ? $$2.a().a($$0) : Optional.empty();
   }

   public jq<awu> b() {
      return this.e;
   }

   public xk c() {
      return this.f;
   }

   public float d() {
      return this.g;
   }

   public int e() {
      return this.h;
   }
}
