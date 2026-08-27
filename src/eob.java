import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record eob(float b, float c) implements env {
   public static final Codec<eob> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.FLOAT.fieldOf("chance").forGetter(eob::c), Codec.FLOAT.fieldOf("looting_multiplier").forGetter(eob::d)).apply($$0, eob::new)
   );

   @Override
   public enw b() {
      return enx.f;
   }

   @Override
   public Set<ene<?>> a() {
      return ImmutableSet.of(enh.d);
   }

   public boolean a(ekw $$0) {
      box $$1 = $$0.c(enh.d);
      int $$2 = 0;
      if ($$1 instanceof bpp) {
         $$2 = cux.h((bpp)$$1);
      }

      return $$0.b().i() < this.b + (float)$$2 * this.c;
   }

   public static env.a a(float $$0, float $$1) {
      return () -> new eob($$0, $$1);
   }

   public float c() {
      return this.b;
   }

   public float d() {
      return this.c;
   }
}
