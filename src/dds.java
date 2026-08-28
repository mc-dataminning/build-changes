import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class dds extends ddj {
   private static final MapCodec<jj<ddf>> d = ddf.c.fieldOf("biome");
   public static final MapCodec<ddo.c<jj<ddf>>> b = ddo.c.a(d).fieldOf("biomes");
   private static final MapCodec<jj<ddt>> e = ddt.b.fieldOf("preset").withLifecycle(Lifecycle.stable());
   public static final MapCodec<dds> c = Codec.mapEither(b, e).xmap(dds::new, $$0 -> $$0.f);
   private final Either<ddo.c<jj<ddf>>, jj<ddt>> f;

   private dds(Either<ddo.c<jj<ddf>>, jj<ddt>> $$0) {
      this.f = $$0;
   }

   public static dds a(ddo.c<jj<ddf>> $$0) {
      return new dds(Either.left($$0));
   }

   public static dds a(jj<ddt> $$0) {
      return new dds(Either.right($$0));
   }

   private ddo.c<jj<ddf>> d() {
      return (ddo.c<jj<ddf>>)this.f.map($$0 -> $$0, $$0 -> ((ddt)$$0.a()).a());
   }

   @Override
   protected Stream<jj<ddf>> b() {
      return this.d().a().stream().map(Pair::getSecond);
   }

   @Override
   protected MapCodec<? extends ddj> a() {
      return c;
   }

   public boolean a(akj<ddt> $$0) {
      Optional<jj<ddt>> $$1 = this.f.right();
      return $$1.isPresent() && $$1.get().a($$0);
   }

   @Override
   public jj<ddf> getNoiseBiome(int $$0, int $$1, int $$2, ddo.f $$3) {
      return this.a($$3.a($$0, $$1, $$2));
   }

   @azl
   public jj<ddf> a(ddo.h $$0) {
      return this.d().a($$0);
   }

   @Override
   public void a(List<String> $$0, ja $$1, ddo.f $$2) {
      int $$3 = ju.a($$1.u());
      int $$4 = ju.a($$1.v());
      int $$5 = ju.a($$1.w());
      ddo.h $$6 = $$2.a($$3, $$4, $$5);
      float $$7 = ddo.a($$6.d());
      float $$8 = ddo.a($$6.e());
      float $$9 = ddo.a($$6.b());
      float $$10 = ddo.a($$6.c());
      float $$11 = ddo.a($$6.g());
      double $$12 = (double)dym.a($$11);
      ddv $$13 = new ddv();
      $$0.add(
         "Biome builder PV: "
            + ddv.a($$12)
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
