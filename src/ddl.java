import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class ddl extends ddc {
   private static final MapCodec<ji<dcy>> d = dcy.c.fieldOf("biome");
   public static final MapCodec<ddh.c<ji<dcy>>> b = ddh.c.a(d).fieldOf("biomes");
   private static final MapCodec<ji<ddm>> e = ddm.b.fieldOf("preset").withLifecycle(Lifecycle.stable());
   public static final MapCodec<ddl> c = Codec.mapEither(b, e).xmap(ddl::new, $$0 -> $$0.f);
   private final Either<ddh.c<ji<dcy>>, ji<ddm>> f;

   private ddl(Either<ddh.c<ji<dcy>>, ji<ddm>> $$0) {
      this.f = $$0;
   }

   public static ddl a(ddh.c<ji<dcy>> $$0) {
      return new ddl(Either.left($$0));
   }

   public static ddl a(ji<ddm> $$0) {
      return new ddl(Either.right($$0));
   }

   private ddh.c<ji<dcy>> d() {
      return (ddh.c<ji<dcy>>)this.f.map($$0 -> $$0, $$0 -> ((ddm)$$0.a()).a());
   }

   @Override
   protected Stream<ji<dcy>> b() {
      return this.d().a().stream().map(Pair::getSecond);
   }

   @Override
   protected MapCodec<? extends ddc> a() {
      return c;
   }

   public boolean a(ale<ddm> $$0) {
      Optional<ji<ddm>> $$1 = this.f.right();
      return $$1.isPresent() && $$1.get().a($$0);
   }

   @Override
   public ji<dcy> getNoiseBiome(int $$0, int $$1, int $$2, ddh.f $$3) {
      return this.a($$3.a($$0, $$1, $$2));
   }

   @bad
   public ji<dcy> a(ddh.h $$0) {
      return this.d().a($$0);
   }

   @Override
   public void a(List<String> $$0, iz $$1, ddh.f $$2) {
      int $$3 = jt.a($$1.u());
      int $$4 = jt.a($$1.v());
      int $$5 = jt.a($$1.w());
      ddh.h $$6 = $$2.a($$3, $$4, $$5);
      float $$7 = ddh.a($$6.d());
      float $$8 = ddh.a($$6.e());
      float $$9 = ddh.a($$6.b());
      float $$10 = ddh.a($$6.c());
      float $$11 = ddh.a($$6.g());
      double $$12 = (double)dyc.a($$11);
      ddo $$13 = new ddo();
      $$0.add(
         "Biome builder PV: "
            + ddo.a($$12)
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
