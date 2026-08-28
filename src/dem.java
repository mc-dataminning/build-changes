import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dem(def d, def e, jq<bub> f) implements dep {
   public static final MapCodec<dem> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               def.b.fieldOf("min_damage").forGetter(dem::b), def.b.fieldOf("max_damage").forGetter(dem::c), bub.b.fieldOf("damage_type").forGetter(dem::d)
            )
            .apply($$0, dem::new)
   );

   @Override
   public void a(ash $$0, int $$1, ddx $$2, bvj $$3, fbx $$4) {
      float $$5 = bae.b($$3.dZ(), this.d.a($$1), this.e.a($$1));
      $$3.a($$0, new btz(this.f, $$2.c()), $$5);
   }

   @Override
   public MapCodec<dem> a() {
      return a;
   }

   public def b() {
      return this.d;
   }

   public def c() {
      return this.e;
   }

   public jq<bub> d() {
      return this.f;
   }
}
