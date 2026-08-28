import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class dln extends dle {
   private static final MapCodec<jf<dla>> d = dla.c.fieldOf("biome");
   public static final MapCodec<dlj.c<jf<dla>>> b = dlj.c.a(d).fieldOf("biomes");
   private static final MapCodec<jf<dlo>> e = dlo.b.fieldOf("preset").withLifecycle(Lifecycle.stable());
   public static final MapCodec<dln> c = Codec.mapEither(b, e).xmap(dln::new, $$0 -> $$0.f);
   private final Either<dlj.c<jf<dla>>, jf<dlo>> f;

   private dln(Either<dlj.c<jf<dla>>, jf<dlo>> $$0) {
      this.f = $$0;
   }

   public static dln a(dlj.c<jf<dla>> $$0) {
      return new dln(Either.left($$0));
   }

   public static dln a(jf<dlo> $$0) {
      return new dln(Either.right($$0));
   }

   private dlj.c<jf<dla>> d() {
      return (dlj.c<jf<dla>>)this.f.map($$0 -> $$0, $$0 -> ((dlo)$$0.a()).a());
   }

   @Override
   protected Stream<jf<dla>> b() {
      return this.d().a().stream().map(Pair::getSecond);
   }

   @Override
   protected MapCodec<? extends dle> a() {
      return c;
   }

   public boolean a(alh<dlo> $$0) {
      Optional<jf<dlo>> $$1 = this.f.right();
      return $$1.isPresent() && $$1.get().a($$0);
   }

   @Override
   public jf<dla> getNoiseBiome(int $$0, int $$1, int $$2, dlj.f $$3) {
      return this.a($$3.a($$0, $$1, $$2));
   }

   @bax
   public jf<dla> a(dlj.h $$0) {
      return this.d().a($$0);
   }

   @Override
   public void a(List<String> $$0, iv $$1, dlj.f $$2) {
      int $$3 = jq.a($$1.u());
      int $$4 = jq.a($$1.v());
      int $$5 = jq.a($$1.w());
      dlj.h $$6 = $$2.a($$3, $$4, $$5);
      float $$7 = dlj.a($$6.d());
      float $$8 = dlj.a($$6.e());
      float $$9 = dlj.a($$6.b());
      float $$10 = dlj.a($$6.c());
      float $$11 = dlj.a($$6.g());
      double $$12 = (double)ehk.a($$11);
      dlq $$13 = new dlq();
      $$0.add(
         "Biome builder PV: "
            + dlq.a($$12)
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
