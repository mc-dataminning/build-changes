import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record fae(float b, deg c, jq<ddz> g) implements ezy {
   public static final MapCodec<fae> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.floatRange(0.0F, 1.0F).fieldOf("unenchanted_chance").forGetter(fae::c),
               deg.b.fieldOf("enchanted_chance").forGetter(fae::d),
               ddz.c.fieldOf("enchantment").forGetter(fae::e)
            )
            .apply($$0, fae::new)
   );

   @Override
   public ezz b() {
      return faa.e;
   }

   @Override
   public Set<bbn<?>> a() {
      return Set.of(ezj.d);
   }

   public boolean a(ewp $$0) {
      bvk $$1 = $$0.c(ezj.d);
      int $$3 = $$1 instanceof bwg $$2 ? deb.a(this.g, $$2) : 0;
      float $$4 = $$3 > 0 ? this.c.a($$3) : this.b;
      return $$0.b().i() < $$4;
   }

   public static ezy.a a(js.a $$0, float $$1, float $$2) {
      js.b<ddz> $$3 = $$0.d(mb.aO);
      return () -> new fae($$1, new deg.e($$1 + $$2, $$2), $$3.b(dee.s));
   }

   public float c() {
      return this.b;
   }

   public deg d() {
      return this.c;
   }

   public jq<ddz> e() {
      return this.g;
   }
}
