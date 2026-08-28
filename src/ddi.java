import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class ddi extends dcz {
   private static final MapCodec<ji<dcv>> d = dcv.c.fieldOf("biome");
   public static final MapCodec<dde.c<ji<dcv>>> b = dde.c.a(d).fieldOf("biomes");
   private static final MapCodec<ji<ddj>> e = ddj.b.fieldOf("preset").withLifecycle(Lifecycle.stable());
   public static final MapCodec<ddi> c = Codec.mapEither(b, e).xmap(ddi::new, $$0 -> $$0.f);
   private final Either<dde.c<ji<dcv>>, ji<ddj>> f;

   private ddi(Either<dde.c<ji<dcv>>, ji<ddj>> $$0) {
      this.f = $$0;
   }

   public static ddi a(dde.c<ji<dcv>> $$0) {
      return new ddi(Either.left($$0));
   }

   public static ddi a(ji<ddj> $$0) {
      return new ddi(Either.right($$0));
   }

   private dde.c<ji<dcv>> d() {
      return (dde.c<ji<dcv>>)this.f.map($$0 -> $$0, $$0 -> ((ddj)$$0.a()).a());
   }

   @Override
   protected Stream<ji<dcv>> b() {
      return this.d().a().stream().map(Pair::getSecond);
   }

   @Override
   protected MapCodec<? extends dcz> a() {
      return c;
   }

   public boolean a(ald<ddj> $$0) {
      Optional<ji<ddj>> $$1 = this.f.right();
      return $$1.isPresent() && $$1.get().a($$0);
   }

   @Override
   public ji<dcv> getNoiseBiome(int $$0, int $$1, int $$2, dde.f $$3) {
      return this.a($$3.a($$0, $$1, $$2));
   }

   @bab
   public ji<dcv> a(dde.h $$0) {
      return this.d().a($$0);
   }

   @Override
   public void a(List<String> $$0, iz $$1, dde.f $$2) {
      int $$3 = jt.a($$1.u());
      int $$4 = jt.a($$1.v());
      int $$5 = jt.a($$1.w());
      dde.h $$6 = $$2.a($$3, $$4, $$5);
      float $$7 = dde.a($$6.d());
      float $$8 = dde.a($$6.e());
      float $$9 = dde.a($$6.b());
      float $$10 = dde.a($$6.c());
      float $$11 = dde.a($$6.g());
      double $$12 = (double)dxz.a($$11);
      ddl $$13 = new ddl();
      $$0.add(
         "Biome builder PV: "
            + ddl.a($$12)
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
