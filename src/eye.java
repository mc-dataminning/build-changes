import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record eye(float b, dck c, jq<dcd> g) implements exy {
   public static final MapCodec<eye> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.floatRange(0.0F, 1.0F).fieldOf("unenchanted_chance").forGetter(eye::c),
               dck.b.fieldOf("enchanted_chance").forGetter(eye::d),
               dcd.c.fieldOf("enchantment").forGetter(eye::e)
            )
            .apply($$0, eye::new)
   );

   @Override
   public exz b() {
      return eya.e;
   }

   @Override
   public Set<exg<?>> a() {
      return ImmutableSet.of(exj.d);
   }

   public boolean a(eun $$0) {
      bul $$1 = $$0.c(exj.d);
      int $$3 = $$1 instanceof bvh $$2 ? dcf.a(this.g, $$2) : 0;
      float $$4 = $$3 > 0 ? this.c.a($$3) : this.b;
      return $$0.b().i() < $$4;
   }

   public static exy.a a(js.a $$0, float $$1, float $$2) {
      js.b<dcd> $$3 = $$0.d(ma.aM);
      return () -> new eye($$1, new dck.e($$1 + $$2, $$2), $$3.b(dci.s));
   }

   public float c() {
      return this.b;
   }

   public dck d() {
      return this.c;
   }

   public jq<dcd> e() {
      return this.g;
   }
}
