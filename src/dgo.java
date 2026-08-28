import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dgo(dgh d, dgh e, jf<buz> f) implements dgr {
   public static final MapCodec<dgo> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               dgh.b.fieldOf("min_damage").forGetter(dgo::b), dgh.b.fieldOf("max_damage").forGetter(dgo::c), buz.b.fieldOf("damage_type").forGetter(dgo::d)
            )
            .apply($$0, dgo::new)
   );

   @Override
   public void a(arq $$0, int $$1, dfz $$2, bwi $$3, ffc $$4) {
      float $$5 = azm.b($$3.dX(), this.d.a($$1), this.e.a($$1));
      $$3.a($$0, new bux(this.f, $$2.c()), $$5);
   }

   @Override
   public MapCodec<dgo> a() {
      return a;
   }

   public dgh b() {
      return this.d;
   }

   public dgh c() {
      return this.e;
   }

   public jf<buz> d() {
      return this.f;
   }
}
