import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class ddf extends dcw {
   private static final MapCodec<ji<dcs>> d = dcs.c.fieldOf("biome");
   public static final MapCodec<ddb.c<ji<dcs>>> b = ddb.c.a(d).fieldOf("biomes");
   private static final MapCodec<ji<ddg>> e = ddg.b.fieldOf("preset").withLifecycle(Lifecycle.stable());
   public static final MapCodec<ddf> c = Codec.mapEither(b, e).xmap(ddf::new, $$0 -> $$0.f);
   private final Either<ddb.c<ji<dcs>>, ji<ddg>> f;

   private ddf(Either<ddb.c<ji<dcs>>, ji<ddg>> $$0) {
      this.f = $$0;
   }

   public static ddf a(ddb.c<ji<dcs>> $$0) {
      return new ddf(Either.left($$0));
   }

   public static ddf a(ji<ddg> $$0) {
      return new ddf(Either.right($$0));
   }

   private ddb.c<ji<dcs>> d() {
      return (ddb.c<ji<dcs>>)this.f.map($$0 -> $$0, $$0 -> ((ddg)$$0.a()).a());
   }

   @Override
   protected Stream<ji<dcs>> b() {
      return this.d().a().stream().map(Pair::getSecond);
   }

   @Override
   protected MapCodec<? extends dcw> a() {
      return c;
   }

   public boolean a(ala<ddg> $$0) {
      Optional<ji<ddg>> $$1 = this.f.right();
      return $$1.isPresent() && $$1.get().a($$0);
   }

   @Override
   public ji<dcs> getNoiseBiome(int $$0, int $$1, int $$2, ddb.f $$3) {
      return this.a($$3.a($$0, $$1, $$2));
   }

   @azy
   public ji<dcs> a(ddb.h $$0) {
      return this.d().a($$0);
   }

   @Override
   public void a(List<String> $$0, iz $$1, ddb.f $$2) {
      int $$3 = jt.a($$1.u());
      int $$4 = jt.a($$1.v());
      int $$5 = jt.a($$1.w());
      ddb.h $$6 = $$2.a($$3, $$4, $$5);
      float $$7 = ddb.a($$6.d());
      float $$8 = ddb.a($$6.e());
      float $$9 = ddb.a($$6.b());
      float $$10 = ddb.a($$6.c());
      float $$11 = ddb.a($$6.g());
      double $$12 = (double)dxw.a($$11);
      ddi $$13 = new ddi();
      $$0.add(
         "Biome builder PV: "
            + ddi.a($$12)
            + " C: "
            + $$13.b((double)$$7)
            + " E: "
            + $$13.c((double)$$8)
            + " T: "
            + $$13.d((double)$$9)
            + " H: "
            + $$13.e((double)$$10)
      );
   }
}
