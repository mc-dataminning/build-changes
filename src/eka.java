import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record eka(float b, float c) implements eju {
   public static final Codec<eka> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.FLOAT.fieldOf("chance").forGetter(eka::c), Codec.FLOAT.fieldOf("looting_multiplier").forGetter(eka::d)).apply($$0, eka::new)
   );

   @Override
   public ejv b() {
      return ejw.f;
   }

   @Override
   public Set<ejd<?>> a() {
      return ImmutableSet.of(ejg.d);
   }

   public boolean a(egv $$0) {
      blu $$1 = $$0.c(ejg.d);
      int $$2 = 0;
      if ($$1 instanceof bmk) {
         $$2 = crk.h((bmk)$$1);
      }

      return $$0.b().i() < this.b + (float)$$2 * this.c;
   }

   public static eju.a a(float $$0, float $$1) {
      return () -> new eka($$0, $$1);
   }

   public float c() {
      return this.b;
   }

   public float d() {
      return this.c;
   }
}
