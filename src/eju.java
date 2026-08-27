import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record eju(float b, float c) implements ejo {
   public static final Codec<eju> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.FLOAT.fieldOf("chance").forGetter(eju::c), Codec.FLOAT.fieldOf("looting_multiplier").forGetter(eju::d)).apply($$0, eju::new)
   );

   @Override
   public ejp b() {
      return ejq.f;
   }

   @Override
   public Set<eix<?>> a() {
      return ImmutableSet.of(eja.d);
   }

   public boolean a(egp $$0) {
      blp $$1 = $$0.c(eja.d);
      int $$2 = 0;
      if ($$1 instanceof bmf) {
         $$2 = cre.h((bmf)$$1);
      }

      return $$0.b().i() < this.b + (float)$$2 * this.c;
   }

   public static ejo.a a(float $$0, float $$1) {
      return () -> new eju($$0, $$1);
   }

   public float c() {
      return this.b;
   }

   public float d() {
      return this.c;
   }
}
