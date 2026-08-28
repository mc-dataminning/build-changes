import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class dfu extends dfl {
   private static final MapCodec<jn<dfh>> d = dfh.c.fieldOf("biome");
   public static final MapCodec<dfq.c<jn<dfh>>> b = dfq.c.a(d).fieldOf("biomes");
   private static final MapCodec<jn<dfv>> e = dfv.b.fieldOf("preset").withLifecycle(Lifecycle.stable());
   public static final MapCodec<dfu> c = Codec.mapEither(b, e).xmap(dfu::new, $$0 -> $$0.f);
   private final Either<dfq.c<jn<dfh>>, jn<dfv>> f;

   private dfu(Either<dfq.c<jn<dfh>>, jn<dfv>> $$0) {
      this.f = $$0;
   }

   public static dfu a(dfq.c<jn<dfh>> $$0) {
      return new dfu(Either.left($$0));
   }

   public static dfu a(jn<dfv> $$0) {
      return new dfu(Either.right($$0));
   }

   private dfq.c<jn<dfh>> d() {
      return (dfq.c<jn<dfh>>)this.f.map($$0 -> $$0, $$0 -> ((dfv)$$0.a()).a());
   }

   @Override
   protected Stream<jn<dfh>> b() {
      return this.d().a().stream().map(Pair::getSecond);
   }

   @Override
   protected MapCodec<? extends dfl> a() {
      return c;
   }

   public boolean a(alb<dfv> $$0) {
      Optional<jn<dfv>> $$1 = this.f.right();
      return $$1.isPresent() && $$1.get().a($$0);
   }

   @Override
   public jn<dfh> getNoiseBiome(int $$0, int $$1, int $$2, dfq.f $$3) {
      return this.a($$3.a($$0, $$1, $$2));
   }

   @baj
   public jn<dfh> a(dfq.h $$0) {
      return this.d().a($$0);
   }

   @Override
   public void a(List<String> $$0, je $$1, dfq.f $$2) {
      int $$3 = jy.a($$1.u());
      int $$4 = jy.a($$1.v());
      int $$5 = jy.a($$1.w());
      dfq.h $$6 = $$2.a($$3, $$4, $$5);
      float $$7 = dfq.a($$6.d());
      float $$8 = dfq.a($$6.e());
      float $$9 = dfq.a($$6.b());
      float $$10 = dfq.a($$6.c());
      float $$11 = dfq.a($$6.g());
      double $$12 = (double)ear.a($$11);
      dfx $$13 = new dfx();
      $$0.add(
         "Biome builder PV: "
            + dfx.a($$12)
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
