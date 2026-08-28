import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record exx(float b, dcd c, jq<dbw> g) implements exr {
   public static final MapCodec<exx> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.floatRange(0.0F, 1.0F).fieldOf("unenchanted_chance").forGetter(exx::c),
               dcd.b.fieldOf("enchanted_chance").forGetter(exx::d),
               dbw.c.fieldOf("enchantment").forGetter(exx::e)
            )
            .apply($$0, exx::new)
   );

   @Override
   public exs b() {
      return ext.e;
   }

   @Override
   public Set<ewz<?>> a() {
      return ImmutableSet.of(exc.d);
   }

   public boolean a(eug $$0) {
      bui $$1 = $$0.c(exc.d);
      int $$3 = $$1 instanceof bve $$2 ? dby.a(this.g, $$2) : 0;
      float $$4 = $$3 > 0 ? this.c.a($$3) : this.b;
      return $$0.b().i() < $$4;
   }

   public static exr.a a(js.a $$0, float $$1, float $$2) {
      js.b<dbw> $$3 = $$0.d(ma.aM);
      return () -> new exx($$1, new dcd.e($$1 + $$2, $$2), $$3.b(dcb.s));
   }

   public float c() {
      return this.b;
   }

   public dcd d() {
      return this.c;
   }

   public jq<dbw> e() {
      return this.g;
   }
}
