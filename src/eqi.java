import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record eqi(float b, float c) implements eqc {
   public static final Codec<eqi> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.FLOAT.fieldOf("chance").forGetter(eqi::c), Codec.FLOAT.fieldOf("looting_multiplier").forGetter(eqi::d)).apply($$0, eqi::new)
   );

   @Override
   public eqd b() {
      return eqe.f;
   }

   @Override
   public Set<epl<?>> a() {
      return ImmutableSet.of(epo.d);
   }

   public boolean a(enb $$0) {
      bpv $$1 = $$0.c(epo.d);
      int $$2 = 0;
      if ($$1 instanceof bqo) {
         $$2 = cwr.h((bqo)$$1);
      }

      return $$0.b().i() < this.b + (float)$$2 * this.c;
   }

   public static eqc.a a(float $$0, float $$1) {
      return () -> new eqi($$0, $$1);
   }

   public float c() {
      return this.b;
   }

   public float d() {
      return this.c;
   }
}
