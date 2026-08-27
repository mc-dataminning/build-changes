import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record efv(float b, float c) implements efp {
   public static final Codec<efv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.FLOAT.fieldOf("chance").forGetter(efv::c), Codec.FLOAT.fieldOf("looting_multiplier").forGetter(efv::d)).apply($$0, efv::new)
   );

   @Override
   public efq b() {
      return efr.f;
   }

   @Override
   public Set<eey<?>> a() {
      return ImmutableSet.of(efb.d);
   }

   public boolean a(ecq $$0) {
      biq $$1 = $$0.c(efb.d);
      int $$2 = 0;
      if ($$1 instanceof bjg) {
         $$2 = cnq.h((bjg)$$1);
      }

      return $$0.b().i() < this.b + (float)$$2 * this.c;
   }

   public static efp.a a(float $$0, float $$1) {
      return () -> new efv($$0, $$1);
   }

   public float c() {
      return this.b;
   }

   public float d() {
      return this.c;
   }
}
