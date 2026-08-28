import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class dgj extends dga {
   private static final MapCodec<jp<dfw>> d = dfw.c.fieldOf("biome");
   public static final MapCodec<dgf.c<jp<dfw>>> b = dgf.c.a(d).fieldOf("biomes");
   private static final MapCodec<jp<dgk>> e = dgk.b.fieldOf("preset").withLifecycle(Lifecycle.stable());
   public static final MapCodec<dgj> c = Codec.mapEither(b, e).xmap(dgj::new, $$0 -> $$0.f);
   private final Either<dgf.c<jp<dfw>>, jp<dgk>> f;

   private dgj(Either<dgf.c<jp<dfw>>, jp<dgk>> $$0) {
      this.f = $$0;
   }

   public static dgj a(dgf.c<jp<dfw>> $$0) {
      return new dgj(Either.left($$0));
   }

   public static dgj a(jp<dgk> $$0) {
      return new dgj(Either.right($$0));
   }

   private dgf.c<jp<dfw>> d() {
      return (dgf.c<jp<dfw>>)this.f.map($$0 -> $$0, $$0 -> ((dgk)$$0.a()).a());
   }

   @Override
   protected Stream<jp<dfw>> b() {
      return this.d().a().stream().map(Pair::getSecond);
   }

   @Override
   protected MapCodec<? extends dga> a() {
      return c;
   }

   public boolean a(alg<dgk> $$0) {
      Optional<jp<dgk>> $$1 = this.f.right();
      return $$1.isPresent() && $$1.get().a($$0);
   }

   @Override
   public jp<dfw> getNoiseBiome(int $$0, int $$1, int $$2, dgf.f $$3) {
      return this.a($$3.a($$0, $$1, $$2));
   }

   @bap
   public jp<dfw> a(dgf.h $$0) {
      return this.d().a($$0);
   }

   @Override
   public void a(List<String> $$0, jg $$1, dgf.f $$2) {
      int $$3 = ka.a($$1.u());
      int $$4 = ka.a($$1.v());
      int $$5 = ka.a($$1.w());
      dgf.h $$6 = $$2.a($$3, $$4, $$5);
      float $$7 = dgf.a($$6.d());
      float $$8 = dgf.a($$6.e());
      float $$9 = dgf.a($$6.b());
      float $$10 = dgf.a($$6.c());
      float $$11 = dgf.a($$6.g());
      double $$12 = (double)ebg.a($$11);
      dgm $$13 = new dgm();
      $$0.add(
         "Biome builder PV: "
            + dgm.a($$12)
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
