import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record cwh(jq<awk> e, xi f, float g, int h) {
   public static final Codec<cwh> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               awk.b.fieldOf("sound_event").forGetter(cwh::b),
               xk.a.fieldOf("description").forGetter(cwh::c),
               ayt.o.fieldOf("length_in_seconds").forGetter(cwh::d),
               ayt.a(0, 15).fieldOf("comparator_output").forGetter(cwh::e)
            )
            .apply($$0, cwh::new)
   );
   public static final zg<wt, cwh> b = zg.a(awk.d, cwh::b, xk.b, cwh::c, ze.j, cwh::d, ze.h, cwh::e, cwh::new);
   public static final Codec<jq<cwh>> c = alf.a(lz.L);
   public static final zg<wt, jq<cwh>> d = ze.a(lz.L, b);
   private static final int i = 20;

   public int a() {
      return azk.f(this.g * 20.0F);
   }

   public boolean a(long $$0) {
      return $$0 >= (long)(this.a() + 20);
   }

   public static Optional<jq<cwh>> a(js.a $$0, cwb $$1) {
      cwg $$2 = $$1.a(ku.ab);
      return $$2 != null ? $$2.a().a($$0) : Optional.empty();
   }

   public jq<awk> b() {
      return this.e;
   }

   public xi c() {
      return this.f;
   }

   public float d() {
      return this.g;
   }

   public int e() {
      return this.h;
   }
}
