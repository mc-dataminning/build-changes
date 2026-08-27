import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record emh(float b, float c) implements emb {
   public static final Codec<emh> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.FLOAT.fieldOf("chance").forGetter(emh::c), Codec.FLOAT.fieldOf("looting_multiplier").forGetter(emh::d)).apply($$0, emh::new)
   );

   @Override
   public emc b() {
      return emd.f;
   }

   @Override
   public Set<elk<?>> a() {
      return ImmutableSet.of(eln.d);
   }

   public boolean a(ejc $$0) {
      bnq $$1 = $$0.c(eln.d);
      int $$2 = 0;
      if ($$1 instanceof boi) {
         $$2 = ctn.h((boi)$$1);
      }

      return $$0.b().i() < this.b + (float)$$2 * this.c;
   }

   public static emb.a a(float $$0, float $$1) {
      return () -> new emh($$0, $$1);
   }

   public float c() {
      return this.b;
   }

   public float d() {
      return this.c;
   }
}
