import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class dix extends dio {
   private static final MapCodec<jq<dik>> d = dik.c.fieldOf("biome");
   public static final MapCodec<dit.c<jq<dik>>> b = dit.c.a(d).fieldOf("biomes");
   private static final MapCodec<jq<diy>> e = diy.b.fieldOf("preset").withLifecycle(Lifecycle.stable());
   public static final MapCodec<dix> c = Codec.mapEither(b, e).xmap(dix::new, $$0 -> $$0.f);
   private final Either<dit.c<jq<dik>>, jq<diy>> f;

   private dix(Either<dit.c<jq<dik>>, jq<diy>> $$0) {
      this.f = $$0;
   }

   public static dix a(dit.c<jq<dik>> $$0) {
      return new dix(Either.left($$0));
   }

   public static dix a(jq<diy> $$0) {
      return new dix(Either.right($$0));
   }

   private dit.c<jq<dik>> d() {
      return (dit.c<jq<dik>>)this.f.map($$0 -> $$0, $$0 -> ((diy)$$0.a()).a());
   }

   @Override
   protected Stream<jq<dik>> b() {
      return this.d().a().stream().map(Pair::getSecond);
   }

   @Override
   protected MapCodec<? extends dio> a() {
      return c;
   }

   public boolean a(aly<diy> $$0) {
      Optional<jq<diy>> $$1 = this.f.right();
      return $$1.isPresent() && $$1.get().a($$0);
   }

   @Override
   public jq<dik> getNoiseBiome(int $$0, int $$1, int $$2, dit.f $$3) {
      return this.a($$3.a($$0, $$1, $$2));
   }

   @bbl
   public jq<dik> a(dit.h $$0) {
      return this.d().a($$0);
   }

   @Override
   public void a(List<String> $$0, jh $$1, dit.f $$2) {
      int $$3 = kb.a($$1.u());
      int $$4 = kb.a($$1.v());
      int $$5 = kb.a($$1.w());
      dit.h $$6 = $$2.a($$3, $$4, $$5);
      float $$7 = dit.a($$6.d());
      float $$8 = dit.a($$6.e());
      float $$9 = dit.a($$6.b());
      float $$10 = dit.a($$6.c());
      float $$11 = dit.a($$6.g());
      double $$12 = (double)edx.a($$11);
      dja $$13 = new dja();
      $$0.add(
         "Biome builder PV: "
            + dja.a($$12)
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
