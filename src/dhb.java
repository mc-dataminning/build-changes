import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class dhb extends dgs {
   private static final MapCodec<jq<dgo>> d = dgo.c.fieldOf("biome");
   public static final MapCodec<dgx.c<jq<dgo>>> b = dgx.c.a(d).fieldOf("biomes");
   private static final MapCodec<jq<dhc>> e = dhc.b.fieldOf("preset").withLifecycle(Lifecycle.stable());
   public static final MapCodec<dhb> c = Codec.mapEither(b, e).xmap(dhb::new, $$0 -> $$0.f);
   private final Either<dgx.c<jq<dgo>>, jq<dhc>> f;

   private dhb(Either<dgx.c<jq<dgo>>, jq<dhc>> $$0) {
      this.f = $$0;
   }

   public static dhb a(dgx.c<jq<dgo>> $$0) {
      return new dhb(Either.left($$0));
   }

   public static dhb a(jq<dhc> $$0) {
      return new dhb(Either.right($$0));
   }

   private dgx.c<jq<dgo>> d() {
      return (dgx.c<jq<dgo>>)this.f.map($$0 -> $$0, $$0 -> ((dhc)$$0.a()).a());
   }

   @Override
   protected Stream<jq<dgo>> b() {
      return this.d().a().stream().map(Pair::getSecond);
   }

   @Override
   protected MapCodec<? extends dgs> a() {
      return c;
   }

   public boolean a(ali<dhc> $$0) {
      Optional<jq<dhc>> $$1 = this.f.right();
      return $$1.isPresent() && $$1.get().a($$0);
   }

   @Override
   public jq<dgo> getNoiseBiome(int $$0, int $$1, int $$2, dgx.f $$3) {
      return this.a($$3.a($$0, $$1, $$2));
   }

   @bat
   public jq<dgo> a(dgx.h $$0) {
      return this.d().a($$0);
   }

   @Override
   public void a(List<String> $$0, jh $$1, dgx.f $$2) {
      int $$3 = kb.a($$1.u());
      int $$4 = kb.a($$1.v());
      int $$5 = kb.a($$1.w());
      dgx.h $$6 = $$2.a($$3, $$4, $$5);
      float $$7 = dgx.a($$6.d());
      float $$8 = dgx.a($$6.e());
      float $$9 = dgx.a($$6.b());
      float $$10 = dgx.a($$6.c());
      float $$11 = dgx.a($$6.g());
      double $$12 = (double)ebx.a($$11);
      dhe $$13 = new dhe();
      $$0.add(
         "Biome builder PV: "
            + dhe.a($$12)
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
