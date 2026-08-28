import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class dip extends dig {
   private static final MapCodec<jq<dic>> d = dic.c.fieldOf("biome");
   public static final MapCodec<dil.c<jq<dic>>> b = dil.c.a(d).fieldOf("biomes");
   private static final MapCodec<jq<diq>> e = diq.b.fieldOf("preset").withLifecycle(Lifecycle.stable());
   public static final MapCodec<dip> c = Codec.mapEither(b, e).xmap(dip::new, $$0 -> $$0.f);
   private final Either<dil.c<jq<dic>>, jq<diq>> f;

   private dip(Either<dil.c<jq<dic>>, jq<diq>> $$0) {
      this.f = $$0;
   }

   public static dip a(dil.c<jq<dic>> $$0) {
      return new dip(Either.left($$0));
   }

   public static dip a(jq<diq> $$0) {
      return new dip(Either.right($$0));
   }

   private dil.c<jq<dic>> d() {
      return (dil.c<jq<dic>>)this.f.map($$0 -> $$0, $$0 -> ((diq)$$0.a()).a());
   }

   @Override
   protected Stream<jq<dic>> b() {
      return this.d().a().stream().map(Pair::getSecond);
   }

   @Override
   protected MapCodec<? extends dig> a() {
      return c;
   }

   public boolean a(aly<diq> $$0) {
      Optional<jq<diq>> $$1 = this.f.right();
      return $$1.isPresent() && $$1.get().a($$0);
   }

   @Override
   public jq<dic> getNoiseBiome(int $$0, int $$1, int $$2, dil.f $$3) {
      return this.a($$3.a($$0, $$1, $$2));
   }

   @bbl
   public jq<dic> a(dil.h $$0) {
      return this.d().a($$0);
   }

   @Override
   public void a(List<String> $$0, jh $$1, dil.f $$2) {
      int $$3 = kb.a($$1.u());
      int $$4 = kb.a($$1.v());
      int $$5 = kb.a($$1.w());
      dil.h $$6 = $$2.a($$3, $$4, $$5);
      float $$7 = dil.a($$6.d());
      float $$8 = dil.a($$6.e());
      float $$9 = dil.a($$6.b());
      float $$10 = dil.a($$6.c());
      float $$11 = dil.a($$6.g());
      double $$12 = (double)edp.a($$11);
      dis $$13 = new dis();
      $$0.add(
         "Biome builder PV: "
            + dis.a($$12)
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
