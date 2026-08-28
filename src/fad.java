import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record fad(float b, def c, jq<ddy> g) implements ezx {
   public static final MapCodec<fad> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.floatRange(0.0F, 1.0F).fieldOf("unenchanted_chance").forGetter(fad::c),
               def.b.fieldOf("enchanted_chance").forGetter(fad::d),
               ddy.c.fieldOf("enchantment").forGetter(fad::e)
            )
            .apply($$0, fad::new)
   );

   @Override
   public ezy b() {
      return ezz.e;
   }

   @Override
   public Set<bbn<?>> a() {
      return Set.of(ezi.d);
   }

   public boolean a(ewo $$0) {
      bvj $$1 = $$0.c(ezi.d);
      int $$3 = $$1 instanceof bwf $$2 ? dea.a(this.g, $$2) : 0;
      float $$4 = $$3 > 0 ? this.c.a($$3) : this.b;
      return $$0.b().i() < $$4;
   }

   public static ezx.a a(js.a $$0, float $$1, float $$2) {
      js.b<ddy> $$3 = $$0.d(mb.aO);
      return () -> new fad($$1, new def.e($$1 + $$2, $$2), $$3.b(ded.s));
   }

   public float c() {
      return this.b;
   }

   public def d() {
      return this.c;
   }

   public jq<ddy> e() {
      return this.g;
   }
}
