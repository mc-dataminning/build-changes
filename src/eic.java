import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record eic(float b, float c) implements ehw {
   public static final Codec<eic> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.FLOAT.fieldOf("chance").forGetter(eic::c), Codec.FLOAT.fieldOf("looting_multiplier").forGetter(eic::d)).apply($$0, eic::new)
   );

   @Override
   public ehx b() {
      return ehy.f;
   }

   @Override
   public Set<ehf<?>> a() {
      return ImmutableSet.of(ehi.d);
   }

   public boolean a(eex $$0) {
      bkq $$1 = $$0.c(ehi.d);
      int $$2 = 0;
      if ($$1 instanceof blg) {
         $$2 = cpw.h((blg)$$1);
      }

      return $$0.b().i() < this.b + (float)$$2 * this.c;
   }

   public static ehw.a a(float $$0, float $$1) {
      return () -> new eic($$0, $$1);
   }

   public float c() {
      return this.b;
   }

   public float d() {
      return this.c;
   }
}
