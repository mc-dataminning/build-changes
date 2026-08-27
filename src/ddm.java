import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class ddm extends ddd {
   private static final MapCodec<ja<dcz>> d = dcz.c.fieldOf("biome");
   public static final MapCodec<ddi.c<ja<dcz>>> b = ddi.c.a(d).fieldOf("biomes");
   private static final MapCodec<ja<ddn>> e = ddn.b.fieldOf("preset").withLifecycle(Lifecycle.stable());
   public static final Codec<ddm> c = Codec.mapEither(b, e).xmap(ddm::new, $$0 -> $$0.f).codec();
   private final Either<ddi.c<ja<dcz>>, ja<ddn>> f;

   private ddm(Either<ddi.c<ja<dcz>>, ja<ddn>> $$0) {
      this.f = $$0;
   }

   public static ddm a(ddi.c<ja<dcz>> $$0) {
      return new ddm(Either.left($$0));
   }

   public static ddm a(ja<ddn> $$0) {
      return new ddm(Either.right($$0));
   }

   private ddi.c<ja<dcz>> d() {
      return (ddi.c<ja<dcz>>)this.f.map($$0 -> $$0, $$0 -> ((ddn)$$0.a()).a());
   }

   @Override
   protected Stream<ja<dcz>> b() {
      return this.d().a().stream().map(Pair::getSecond);
   }

   @Override
   protected Codec<? extends ddd> a() {
      return c;
   }

   public boolean a(aks<ddn> $$0) {
      Optional<ja<ddn>> $$1 = this.f.right();
      return $$1.isPresent() && $$1.get().a($$0);
   }

   @Override
   public ja<dcz> getNoiseBiome(int $$0, int $$1, int $$2, ddi.f $$3) {
      return this.a($$3.a($$0, $$1, $$2));
   }

   @azp
   public ja<dcz> a(ddi.h $$0) {
      return this.d().a($$0);
   }

   @Override
   public void a(List<String> $$0, ir $$1, ddi.f $$2) {
      int $$3 = jl.a($$1.u());
      int $$4 = jl.a($$1.v());
      int $$5 = jl.a($$1.w());
      ddi.h $$6 = $$2.a($$3, $$4, $$5);
      float $$7 = ddi.a($$6.d());
      float $$8 = ddi.a($$6.e());
      float $$9 = ddi.a($$6.b());
      float $$10 = ddi.a($$6.c());
      float $$11 = ddi.a($$6.g());
      double $$12 = (double)dzb.a($$11);
      ddp $$13 = new ddp();
      $$0.add(
         "Biome builder PV: "
            + ddp.a($$12)
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
