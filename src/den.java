import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record den(deg d, deg e, jq<buc> f) implements deq {
   public static final MapCodec<den> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               deg.b.fieldOf("min_damage").forGetter(den::b), deg.b.fieldOf("max_damage").forGetter(den::c), buc.b.fieldOf("damage_type").forGetter(den::d)
            )
            .apply($$0, den::new)
   );

   @Override
   public void a(ash $$0, int $$1, ddy $$2, bvk $$3, fby $$4) {
      float $$5 = bae.b($$3.dZ(), this.d.a($$1), this.e.a($$1));
      $$3.a($$0, new bua(this.f, $$2.c()), $$5);
   }

   @Override
   public MapCodec<den> a() {
      return a;
   }

   public deg b() {
      return this.d;
   }

   public deg c() {
      return this.e;
   }

   public jq<buc> d() {
      return this.f;
   }
}
