import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record def(ddy d, ddy e, jq<btx> f) implements dei {
   public static final MapCodec<def> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ddy.b.fieldOf("min_damage").forGetter(def::b), ddy.b.fieldOf("max_damage").forGetter(def::c), btx.b.fieldOf("damage_type").forGetter(def::d)
            )
            .apply($$0, def::new)
   );

   @Override
   public void a(ash $$0, int $$1, ddq $$2, bvf $$3, fbs $$4) {
      float $$5 = bae.b($$3.dY(), this.d.a($$1), this.e.a($$1));
      $$3.a($$0, new btv(this.f, $$2.c()), $$5);
   }

   @Override
   public MapCodec<def> a() {
      return a;
   }

   public ddy b() {
      return this.d;
   }

   public ddy c() {
      return this.e;
   }

   public jq<btx> d() {
      return this.f;
   }
}
