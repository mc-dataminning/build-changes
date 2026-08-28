import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class dkl extends dkc {
   private static final MapCodec<je<djy>> d = djy.c.fieldOf("biome");
   public static final MapCodec<dkh.c<je<djy>>> b = dkh.c.a(d).fieldOf("biomes");
   private static final MapCodec<je<dkm>> e = dkm.b.fieldOf("preset").withLifecycle(Lifecycle.stable());
   public static final MapCodec<dkl> c = Codec.mapEither(b, e).xmap(dkl::new, $$0 -> $$0.f);
   private final Either<dkh.c<je<djy>>, je<dkm>> f;

   private dkl(Either<dkh.c<je<djy>>, je<dkm>> $$0) {
      this.f = $$0;
   }

   public static dkl a(dkh.c<je<djy>> $$0) {
      return new dkl(Either.left($$0));
   }

   public static dkl a(je<dkm> $$0) {
      return new dkl(Either.right($$0));
   }

   private dkh.c<je<djy>> d() {
      return (dkh.c<je<djy>>)this.f.map($$0 -> $$0, $$0 -> ((dkm)$$0.a()).a());
   }

   @Override
   protected Stream<je<djy>> b() {
      return this.d().a().stream().map(Pair::getSecond);
   }

   @Override
   protected MapCodec<? extends dkc> a() {
      return c;
   }

   public boolean a(alf<dkm> $$0) {
      Optional<je<dkm>> $$1 = this.f.right();
      return $$1.isPresent() && $$1.get().a($$0);
   }

   @Override
   public je<djy> getNoiseBiome(int $$0, int $$1, int $$2, dkh.f $$3) {
      return this.a($$3.a($$0, $$1, $$2));
   }

   @bav
   public je<djy> a(dkh.h $$0) {
      return this.d().a($$0);
   }

   @Override
   public void a(List<String> $$0, iu $$1, dkh.f $$2) {
      int $$3 = jp.a($$1.u());
      int $$4 = jp.a($$1.v());
      int $$5 = jp.a($$1.w());
      dkh.h $$6 = $$2.a($$3, $$4, $$5);
      float $$7 = dkh.a($$6.d());
      float $$8 = dkh.a($$6.e());
      float $$9 = dkh.a($$6.b());
      float $$10 = dkh.a($$6.c());
      float $$11 = dkh.a($$6.g());
      double $$12 = (double)egf.a($$11);
      dko $$13 = new dko();
      $$0.add(
         "Biome builder PV: "
            + dko.a($$12)
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
