import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record ezy(float b, ddy c, jq<ddr> g) implements ezs {
   public static final MapCodec<ezy> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.floatRange(0.0F, 1.0F).fieldOf("unenchanted_chance").forGetter(ezy::c),
               ddy.b.fieldOf("enchanted_chance").forGetter(ezy::d),
               ddr.c.fieldOf("enchantment").forGetter(ezy::e)
            )
            .apply($$0, ezy::new)
   );

   @Override
   public ezt b() {
      return ezu.e;
   }

   @Override
   public Set<eza<?>> a() {
      return ImmutableSet.of(ezd.d);
   }

   public boolean a(ewh $$0) {
      bvf $$1 = $$0.c(ezd.d);
      int $$3 = $$1 instanceof bwb $$2 ? ddt.a(this.g, $$2) : 0;
      float $$4 = $$3 > 0 ? this.c.a($$3) : this.b;
      return $$0.b().i() < $$4;
   }

   public static ezs.a a(js.a $$0, float $$1, float $$2) {
      js.b<ddr> $$3 = $$0.d(mb.aN);
      return () -> new ezy($$1, new ddy.e($$1 + $$2, $$2), $$3.b(ddw.s));
   }

   public float c() {
      return this.b;
   }

   public ddy d() {
      return this.c;
   }

   public jq<ddr> e() {
      return this.g;
   }
}
