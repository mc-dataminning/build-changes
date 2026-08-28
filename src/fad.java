import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record fad(float b, ddy c, jr<ddr> g) implements ezx {
   public static final MapCodec<fad> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.floatRange(0.0F, 1.0F).fieldOf("unenchanted_chance").forGetter(fad::c),
               ddy.b.fieldOf("enchanted_chance").forGetter(fad::d),
               ddr.c.fieldOf("enchantment").forGetter(fad::e)
            )
            .apply($$0, fad::new)
   );

   @Override
   public ezy b() {
      return ezz.e;
   }

   @Override
   public Set<bai<?>> a() {
      return Set.of(ezi.d);
   }

   public boolean a(ewo $$0) {
      bva $$1 = $$0.c(ezi.d);
      int $$3 = $$1 instanceof bvy $$2 ? ddt.a(this.g, $$2) : 0;
      float $$4 = $$3 > 0 ? this.c.a($$3) : this.b;
      return $$0.b().i() < $$4;
   }

   public static ezx.a a(jt.a $$0, float $$1, float $$2) {
      jt.b<ddr> $$3 = $$0.d(mc.aP);
      return () -> new fad($$1, new ddy.e($$1 + $$2, $$2), $$3.b(ddw.s));
   }

   public float c() {
      return this.b;
   }

   public ddy d() {
      return this.c;
   }

   public jr<ddr> e() {
      return this.g;
   }
}
