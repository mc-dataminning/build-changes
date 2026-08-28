import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dgz(dgs d, dgs e, jf<bvk> f) implements dhc {
   public static final MapCodec<dgz> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               dgs.b.fieldOf("min_damage").forGetter(dgz::b), dgs.b.fieldOf("max_damage").forGetter(dgz::c), bvk.b.fieldOf("damage_type").forGetter(dgz::d)
            )
            .apply($$0, dgz::new)
   );

   @Override
   public void a(ars $$0, int $$1, dgk $$2, bwt $$3, ffq $$4) {
      float $$5 = azo.b($$3.dY(), this.d.a($$1), this.e.a($$1));
      $$3.a($$0, new bvi(this.f, $$2.c()), $$5);
   }

   @Override
   public MapCodec<dgz> a() {
      return a;
   }

   public dgs b() {
      return this.d;
   }

   public dgs c() {
      return this.e;
   }

   public jf<bvk> d() {
      return this.f;
   }
}
