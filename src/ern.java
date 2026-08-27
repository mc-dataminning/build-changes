import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record ern(float b, float c) implements erh {
   public static final Codec<ern> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.FLOAT.fieldOf("chance").forGetter(ern::c), Codec.FLOAT.fieldOf("looting_multiplier").forGetter(ern::d)).apply($$0, ern::new)
   );

   @Override
   public eri b() {
      return erj.f;
   }

   @Override
   public Set<eqq<?>> a() {
      return ImmutableSet.of(eqt.d);
   }

   public boolean a(eoa $$0) {
      bql $$1 = $$0.c(eqt.d);
      int $$2 = 0;
      if ($$1 instanceof bre) {
         $$2 = cxo.h((bre)$$1);
      }

      return $$0.b().i() < this.b + (float)$$2 * this.c;
   }

   public static erh.a a(float $$0, float $$1) {
      return () -> new ern($$0, $$1);
   }

   public float c() {
      return this.b;
   }

   public float d() {
      return this.c;
   }
}
