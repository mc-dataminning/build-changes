import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record cwl(jq<awn> e, xl f, float g, int h) {
   public static final Codec<cwl> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               awn.b.fieldOf("sound_event").forGetter(cwl::b),
               xn.a.fieldOf("description").forGetter(cwl::c),
               ayw.o.fieldOf("length_in_seconds").forGetter(cwl::d),
               ayw.a(0, 15).fieldOf("comparator_output").forGetter(cwl::e)
            )
            .apply($$0, cwl::new)
   );
   public static final zj<ww, cwl> b = zj.a(awn.d, cwl::b, xn.b, cwl::c, zh.j, cwl::d, zh.h, cwl::e, cwl::new);
   public static final Codec<jq<cwl>> c = ali.a(ma.L);
   public static final zj<ww, jq<cwl>> d = zh.a(ma.L, b);
   private static final int i = 20;

   public int a() {
      return azn.f(this.g * 20.0F);
   }

   public boolean a(long $$0) {
      return $$0 >= (long)(this.a() + 20);
   }

   public static Optional<jq<cwl>> a(js.a $$0, cwf $$1) {
      cwk $$2 = $$1.a(ku.ab);
      return $$2 != null ? $$2.a().a($$0) : Optional.empty();
   }

   public jq<awn> b() {
      return this.e;
   }

   public xl c() {
      return this.f;
   }

   public float d() {
      return this.g;
   }

   public int e() {
      return this.h;
   }
}
