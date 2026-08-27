import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record ekk(float b, float c) implements eke {
   public static final Codec<ekk> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.FLOAT.fieldOf("chance").forGetter(ekk::c), Codec.FLOAT.fieldOf("looting_multiplier").forGetter(ekk::d)).apply($$0, ekk::new)
   );

   @Override
   public ekf b() {
      return ekg.f;
   }

   @Override
   public Set<ejn<?>> a() {
      return ImmutableSet.of(ejq.d);
   }

   public boolean a(ehf $$0) {
      blw $$1 = $$0.c(ejq.d);
      int $$2 = 0;
      if ($$1 instanceof bmo) {
         $$2 = crt.h((bmo)$$1);
      }

      return $$0.b().i() < this.b + (float)$$2 * this.c;
   }

   public static eke.a a(float $$0, float $$1) {
      return () -> new ekk($$0, $$1);
   }

   public float c() {
      return this.b;
   }

   public float d() {
      return this.c;
   }
}
