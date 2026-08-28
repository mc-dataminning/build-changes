import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record ezx(float b, ddx c, jq<ddq> g) implements ezr {
   public static final MapCodec<ezx> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.floatRange(0.0F, 1.0F).fieldOf("unenchanted_chance").forGetter(ezx::c),
               ddx.b.fieldOf("enchanted_chance").forGetter(ezx::d),
               ddq.c.fieldOf("enchantment").forGetter(ezx::e)
            )
            .apply($$0, ezx::new)
   );

   @Override
   public ezs b() {
      return ezt.e;
   }

   @Override
   public Set<bbd<?>> a() {
      return Set.of(ezc.d);
   }

   public boolean a(ewi $$0) {
      bvb $$1 = $$0.c(ezc.d);
      int $$3 = $$1 instanceof bvx $$2 ? dds.a(this.g, $$2) : 0;
      float $$4 = $$3 > 0 ? this.c.a($$3) : this.b;
      return $$0.b().i() < $$4;
   }

   public static ezr.a a(js.a $$0, float $$1, float $$2) {
      js.b<ddq> $$3 = $$0.d(mb.aO);
      return () -> new ezx($$1, new ddx.e($$1 + $$2, $$2), $$3.b(ddv.s));
   }

   public float c() {
      return this.b;
   }

   public ddx d() {
      return this.c;
   }

   public jq<ddq> e() {
      return this.g;
   }
}
