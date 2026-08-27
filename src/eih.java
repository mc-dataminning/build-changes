import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record eih(float b, float c) implements eib {
   public static final Codec<eih> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.FLOAT.fieldOf("chance").forGetter(eih::c), Codec.FLOAT.fieldOf("looting_multiplier").forGetter(eih::d)).apply($$0, eih::new)
   );

   @Override
   public eic b() {
      return eid.f;
   }

   @Override
   public Set<ehk<?>> a() {
      return ImmutableSet.of(ehn.d);
   }

   public boolean a(efc $$0) {
      bkv $$1 = $$0.c(ehn.d);
      int $$2 = 0;
      if ($$1 instanceof bll) {
         $$2 = cqb.h((bll)$$1);
      }

      return $$0.b().i() < this.b + (float)$$2 * this.c;
   }

   public static eib.a a(float $$0, float $$1) {
      return () -> new eih($$0, $$1);
   }

   public float c() {
      return this.b;
   }

   public float d() {
      return this.c;
   }
}
