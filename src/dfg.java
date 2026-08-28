import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class dfg extends dex {
   private static final MapCodec<jn<det>> d = det.c.fieldOf("biome");
   public static final MapCodec<dfc.c<jn<det>>> b = dfc.c.a(d).fieldOf("biomes");
   private static final MapCodec<jn<dfh>> e = dfh.b.fieldOf("preset").withLifecycle(Lifecycle.stable());
   public static final MapCodec<dfg> c = Codec.mapEither(b, e).xmap(dfg::new, $$0 -> $$0.f);
   private final Either<dfc.c<jn<det>>, jn<dfh>> f;

   private dfg(Either<dfc.c<jn<det>>, jn<dfh>> $$0) {
      this.f = $$0;
   }

   public static dfg a(dfc.c<jn<det>> $$0) {
      return new dfg(Either.left($$0));
   }

   public static dfg a(jn<dfh> $$0) {
      return new dfg(Either.right($$0));
   }

   private dfc.c<jn<det>> d() {
      return (dfc.c<jn<det>>)this.f.map($$0 -> $$0, $$0 -> ((dfh)$$0.a()).a());
   }

   @Override
   protected Stream<jn<det>> b() {
      return this.d().a().stream().map(Pair::getSecond);
   }

   @Override
   protected MapCodec<? extends dex> a() {
      return c;
   }

   public boolean a(ala<dfh> $$0) {
      Optional<jn<dfh>> $$1 = this.f.right();
      return $$1.isPresent() && $$1.get().a($$0);
   }

   @Override
   public jn<det> getNoiseBiome(int $$0, int $$1, int $$2, dfc.f $$3) {
      return this.a($$3.a($$0, $$1, $$2));
   }

   @bai
   public jn<det> a(dfc.h $$0) {
      return this.d().a($$0);
   }

   @Override
   public void a(List<String> $$0, je $$1, dfc.f $$2) {
      int $$3 = jy.a($$1.u());
      int $$4 = jy.a($$1.v());
      int $$5 = jy.a($$1.w());
      dfc.h $$6 = $$2.a($$3, $$4, $$5);
      float $$7 = dfc.a($$6.d());
      float $$8 = dfc.a($$6.e());
      float $$9 = dfc.a($$6.b());
      float $$10 = dfc.a($$6.c());
      float $$11 = dfc.a($$6.g());
      double $$12 = (double)ead.a($$11);
      dfj $$13 = new dfj();
      $$0.add(
         "Biome builder PV: "
            + dfj.a($$12)
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
