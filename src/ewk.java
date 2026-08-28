import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record ewk(float b, dbd c, jn<daw> g) implements ewe {
   public static final MapCodec<ewk> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.floatRange(0.0F, 1.0F).fieldOf("unenchanted_chance").forGetter(ewk::c),
               dbd.b.fieldOf("enchanted_chance").forGetter(ewk::d),
               daw.c.fieldOf("enchantment").forGetter(ewk::e)
            )
            .apply($$0, ewk::new)
   );

   @Override
   public ewf b() {
      return ewg.e;
   }

   @Override
   public Set<evm<?>> a() {
      return ImmutableSet.of(evp.d);
   }

   public boolean a(est $$0) {
      btj $$1 = $$0.c(evp.d);
      int $$3 = $$1 instanceof buf $$2 ? day.a(this.g, $$2) : 0;
      float $$4 = $$3 > 0 ? this.c.a($$3) : this.b;
      return $$0.b().i() < $$4;
   }

   public static ewe.a a(jp.a $$0, float $$1, float $$2) {
      jp.b<daw> $$3 = $$0.b(lv.aL);
      return () -> new ewk($$1, new dbd.e($$1 + $$2, $$2), $$3.b(dbb.s));
   }

   public float c() {
      return this.b;
   }

   public dbd d() {
      return this.c;
   }

   public jn<daw> e() {
      return this.g;
   }
}
