import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record egn(float b, float c) implements egh {
   public static final Codec<egn> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.FLOAT.fieldOf("chance").forGetter(egn::c), Codec.FLOAT.fieldOf("looting_multiplier").forGetter(egn::d)).apply($$0, egn::new)
   );

   @Override
   public egi b() {
      return egj.f;
   }

   @Override
   public Set<efq<?>> a() {
      return ImmutableSet.of(eft.d);
   }

   public boolean a(edi $$0) {
      bjt $$1 = $$0.c(eft.d);
      int $$2 = 0;
      if ($$1 instanceof bkj) {
         $$2 = cov.h((bkj)$$1);
      }

      return $$0.b().i() < this.b + (float)$$2 * this.c;
   }

   public static egh.a a(float $$0, float $$1) {
      return () -> new egn($$0, $$1);
   }

   public float c() {
      return this.b;
   }

   public float d() {
      return this.c;
   }
}
