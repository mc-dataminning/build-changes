import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record erw(float b, float c) implements erq {
   public static final Codec<erw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.FLOAT.fieldOf("chance").forGetter(erw::c), Codec.FLOAT.fieldOf("looting_multiplier").forGetter(erw::d)).apply($$0, erw::new)
   );

   @Override
   public err b() {
      return ers.g;
   }

   @Override
   public Set<eqz<?>> a() {
      return ImmutableSet.of(erc.d);
   }

   public boolean a(eol $$0) {
      brh $$1 = $$0.c(erc.d);
      int $$2 = 0;
      if ($$1 instanceof bsa) {
         $$2 = cyh.h((bsa)$$1);
      }

      return $$0.b().i() < this.b + (float)$$2 * this.c;
   }

   public static erq.a a(float $$0, float $$1) {
      return () -> new erw($$0, $$1);
   }

   public float c() {
      return this.b;
   }

   public float d() {
      return this.c;
   }
}
