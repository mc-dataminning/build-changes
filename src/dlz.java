import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class dlz extends dlq {
   private static final MapCodec<jg<dlm>> d = dlm.c.fieldOf("biome");
   public static final MapCodec<dlv.c<jg<dlm>>> b = dlv.c.a(d).fieldOf("biomes");
   private static final MapCodec<jg<dma>> e = dma.b.fieldOf("preset").withLifecycle(Lifecycle.stable());
   public static final MapCodec<dlz> c = Codec.mapEither(b, e).xmap(dlz::new, $$0 -> $$0.f);
   private final Either<dlv.c<jg<dlm>>, jg<dma>> f;

   private dlz(Either<dlv.c<jg<dlm>>, jg<dma>> $$0) {
      this.f = $$0;
   }

   public static dlz a(dlv.c<jg<dlm>> $$0) {
      return new dlz(Either.left($$0));
   }

   public static dlz a(jg<dma> $$0) {
      return new dlz(Either.right($$0));
   }

   private dlv.c<jg<dlm>> d() {
      return (dlv.c<jg<dlm>>)this.f.map($$0 -> $$0, $$0 -> ((dma)$$0.a()).a());
   }

   @Override
   protected Stream<jg<dlm>> b() {
      return this.d().a().stream().map(Pair::getSecond);
   }

   @Override
   protected MapCodec<? extends dlq> a() {
      return c;
   }

   public boolean a(alq<dma> $$0) {
      Optional<jg<dma>> $$1 = this.f.right();
      return $$1.isPresent() && $$1.get().a($$0);
   }

   @Override
   public jg<dlm> getNoiseBiome(int $$0, int $$1, int $$2, dlv.f $$3) {
      return this.a($$3.a($$0, $$1, $$2));
   }

   @bbi
   public jg<dlm> a(dlv.h $$0) {
      return this.d().a($$0);
   }

   @Override
   public void a(List<String> $$0, iw $$1, dlv.f $$2) {
      int $$3 = jr.a($$1.u());
      int $$4 = jr.a($$1.v());
      int $$5 = jr.a($$1.w());
      dlv.h $$6 = $$2.a($$3, $$4, $$5);
      float $$7 = dlv.a($$6.d());
      float $$8 = dlv.a($$6.e());
      float $$9 = dlv.a($$6.b());
      float $$10 = dlv.a($$6.c());
      float $$11 = dlv.a($$6.g());
      double $$12 = (double)ehw.a($$11);
      dmc $$13 = new dmc();
      $$0.add(
         "Biome builder PV: "
            + dmc.a($$12)
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
