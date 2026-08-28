import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record ezg(float b, ddg c, jr<dcz> g) implements eza {
   public static final MapCodec<ezg> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.floatRange(0.0F, 1.0F).fieldOf("unenchanted_chance").forGetter(ezg::c),
               ddg.b.fieldOf("enchanted_chance").forGetter(ezg::d),
               dcz.c.fieldOf("enchantment").forGetter(ezg::e)
            )
            .apply($$0, ezg::new)
   );

   @Override
   public ezb b() {
      return ezc.e;
   }

   @Override
   public Set<bai<?>> a() {
      return Set.of(eyl.d);
   }

   public boolean a(evr $$0) {
      bul $$1 = $$0.c(eyl.d);
      int $$3 = $$1 instanceof bvh $$2 ? ddb.a(this.g, $$2) : 0;
      float $$4 = $$3 > 0 ? this.c.a($$3) : this.b;
      return $$0.b().i() < $$4;
   }

   public static eza.a a(jt.a $$0, float $$1, float $$2) {
      jt.b<dcz> $$3 = $$0.d(mc.aO);
      return () -> new ezg($$1, new ddg.e($$1 + $$2, $$2), $$3.b(dde.s));
   }

   public float c() {
      return this.b;
   }

   public ddg d() {
      return this.c;
   }

   public jr<dcz> e() {
      return this.g;
   }
}
