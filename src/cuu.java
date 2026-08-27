import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class cuu extends cul {
   private static final MapCodec<ih<cuh>> d = cuh.c.fieldOf("biome");
   public static final MapCodec<cuq.c<ih<cuh>>> b = cuq.c.a(d).fieldOf("biomes");
   private static final MapCodec<ih<cuv>> e = cuv.b.fieldOf("preset").withLifecycle(Lifecycle.stable());
   public static final Codec<cuu> c = Codec.mapEither(b, e).xmap(cuu::new, $$0 -> $$0.f).codec();
   private final Either<cuq.c<ih<cuh>>, ih<cuv>> f;

   private cuu(Either<cuq.c<ih<cuh>>, ih<cuv>> $$0) {
      this.f = $$0;
   }

   public static cuu a(cuq.c<ih<cuh>> $$0) {
      return new cuu(Either.left($$0));
   }

   public static cuu a(ih<cuv> $$0) {
      return new cuu(Either.right($$0));
   }

   private cuq.c<ih<cuh>> d() {
      return (cuq.c<ih<cuh>>)this.f.map($$0 -> $$0, $$0 -> ((cuv)$$0.a()).a());
   }

   @Override
   protected Stream<ih<cuh>> b() {
      return this.d().a().stream().map(Pair::getSecond);
   }

   @Override
   protected Codec<? extends cul> a() {
      return c;
   }

   public boolean a(ahc<cuv> $$0) {
      Optional<ih<cuv>> $$1 = this.f.right();
      return $$1.isPresent() && $$1.get().a($$0);
   }

   @Override
   public ih<cuh> getNoiseBiome(int $$0, int $$1, int $$2, cuq.f $$3) {
      return this.a($$3.a($$0, $$1, $$2));
   }

   @avn
   public ih<cuh> a(cuq.h $$0) {
      return this.d().a($$0);
   }

   @Override
   public void a(List<String> $$0, hx $$1, cuq.f $$2) {
      int $$3 = is.a($$1.u());
      int $$4 = is.a($$1.v());
      int $$5 = is.a($$1.w());
      cuq.h $$6 = $$2.a($$3, $$4, $$5);
      float $$7 = cuq.a($$6.d());
      float $$8 = cuq.a($$6.e());
      float $$9 = cuq.a($$6.b());
      float $$10 = cuq.a($$6.c());
      float $$11 = cuq.a($$6.g());
      double $$12 = (double)doq.a($$11);
      cux $$13 = new cux();
      $$0.add(
         "Biome builder PV: "
            + cux.a($$12)
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
