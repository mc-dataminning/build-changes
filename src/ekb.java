import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record ekb(float b, float c) implements ejv {
   public static final Codec<ekb> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.FLOAT.fieldOf("chance").forGetter(ekb::c), Codec.FLOAT.fieldOf("looting_multiplier").forGetter(ekb::d)).apply($$0, ekb::new)
   );

   @Override
   public ejw b() {
      return ejx.f;
   }

   @Override
   public Set<eje<?>> a() {
      return ImmutableSet.of(ejh.d);
   }

   public boolean a(egw $$0) {
      blv $$1 = $$0.c(ejh.d);
      int $$2 = 0;
      if ($$1 instanceof bml) {
         $$2 = crl.h((bml)$$1);
      }

      return $$0.b().i() < this.b + (float)$$2 * this.c;
   }

   public static ejv.a a(float $$0, float $$1) {
      return () -> new ekb($$0, $$1);
   }

   public float c() {
      return this.b;
   }

   public float d() {
      return this.c;
   }
}
