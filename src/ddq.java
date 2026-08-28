import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class ddq extends ddh {
   private static final MapCodec<jj<ddd>> d = ddd.c.fieldOf("biome");
   public static final MapCodec<ddm.c<jj<ddd>>> b = ddm.c.a(d).fieldOf("biomes");
   private static final MapCodec<jj<ddr>> e = ddr.b.fieldOf("preset").withLifecycle(Lifecycle.stable());
   public static final MapCodec<ddq> c = Codec.mapEither(b, e).xmap(ddq::new, $$0 -> $$0.f);
   private final Either<ddm.c<jj<ddd>>, jj<ddr>> f;

   private ddq(Either<ddm.c<jj<ddd>>, jj<ddr>> $$0) {
      this.f = $$0;
   }

   public static ddq a(ddm.c<jj<ddd>> $$0) {
      return new ddq(Either.left($$0));
   }

   public static ddq a(jj<ddr> $$0) {
      return new ddq(Either.right($$0));
   }

   private ddm.c<jj<ddd>> d() {
      return (ddm.c<jj<ddd>>)this.f.map($$0 -> $$0, $$0 -> ((ddr)$$0.a()).a());
   }

   @Override
   protected Stream<jj<ddd>> b() {
      return this.d().a().stream().map(Pair::getSecond);
   }

   @Override
   protected MapCodec<? extends ddh> a() {
      return c;
   }

   public boolean a(akj<ddr> $$0) {
      Optional<jj<ddr>> $$1 = this.f.right();
      return $$1.isPresent() && $$1.get().a($$0);
   }

   @Override
   public jj<ddd> getNoiseBiome(int $$0, int $$1, int $$2, ddm.f $$3) {
      return this.a($$3.a($$0, $$1, $$2));
   }

   @azi
   public jj<ddd> a(ddm.h $$0) {
      return this.d().a($$0);
   }

   @Override
   public void a(List<String> $$0, ja $$1, ddm.f $$2) {
      int $$3 = ju.a($$1.u());
      int $$4 = ju.a($$1.v());
      int $$5 = ju.a($$1.w());
      ddm.h $$6 = $$2.a($$3, $$4, $$5);
      float $$7 = ddm.a($$6.d());
      float $$8 = ddm.a($$6.e());
      float $$9 = ddm.a($$6.b());
      float $$10 = ddm.a($$6.c());
      float $$11 = ddm.a($$6.g());
      double $$12 = (double)dyg.a($$11);
      ddt $$13 = new ddt();
      $$0.add(
         "Biome builder PV: "
            + ddt.a($$12)
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
