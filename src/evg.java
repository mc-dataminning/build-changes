import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record evg(float b, daj c, jm<dac> g) implements eva {
   public static final MapCodec<evg> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.floatRange(0.0F, 1.0F).fieldOf("unenchanted_chance").forGetter(evg::c),
               daj.b.fieldOf("enchanted_chance").forGetter(evg::d),
               dac.c.fieldOf("enchantment").forGetter(evg::e)
            )
            .apply($$0, evg::new)
   );

   @Override
   public evb b() {
      return evc.e;
   }

   @Override
   public Set<eui<?>> a() {
      return ImmutableSet.of(eul.d);
   }

   public boolean a(erp $$0) {
      bsr $$1 = $$0.c(eul.d);
      int $$3 = $$1 instanceof btn $$2 ? dae.a(this.g, $$2) : 0;
      float $$4 = $$3 > 0 ? this.c.a($$3) : this.b;
      return $$0.b().i() < $$4;
   }

   public static eva.a a(jo.a $$0, float $$1, float $$2) {
      jo.b<dac> $$3 = $$0.b(lu.aL);
      return () -> new evg($$1, new daj.e($$1 + $$2, $$2), $$3.b(dah.s));
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
