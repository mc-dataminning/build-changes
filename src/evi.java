import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record evi(float b, daj c, jm<dac> g) implements evc {
   public static final MapCodec<evi> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.floatRange(0.0F, 1.0F).fieldOf("unenchanted_chance").forGetter(evi::c),
               daj.b.fieldOf("enchanted_chance").forGetter(evi::d),
               dac.c.fieldOf("enchantment").forGetter(evi::e)
            )
            .apply($$0, evi::new)
   );

   @Override
   public evd b() {
      return eve.e;
   }

   @Override
   public Set<euk<?>> a() {
      return ImmutableSet.of(eun.d);
   }

   public boolean a(err $$0) {
      bsr $$1 = $$0.c(eun.d);
      int $$3 = $$1 instanceof btn $$2 ? dae.a(this.g, $$2) : 0;
      float $$4 = $$3 > 0 ? this.c.a($$3) : this.b;
      return $$0.b().i() < $$4;
   }

   public static evc.a a(jo.a $$0, float $$1, float $$2) {
      jo.b<dac> $$3 = $$0.b(lu.aL);
      return () -> new evi($$1, new daj.e($$1 + $$2, $$2), $$3.b(dah.s));
   }

   public float c() {
      return this.b;
   }

   public daj d() {
      return this.c;
   }

   public jm<dac> e() {
      return this.g;
   }
}
