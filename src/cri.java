import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class cri extends cqz {
   private static final MapCodec<hg<cqv>> d = cqv.c.fieldOf("biome");
   public static final MapCodec<cre.c<hg<cqv>>> b = cre.c.a(d).fieldOf("biomes");
   private static final MapCodec<hg<crj>> e = crj.b.fieldOf("preset").withLifecycle(Lifecycle.stable());
   public static final Codec<cri> c = Codec.mapEither(b, e).xmap(cri::new, $$0 -> $$0.f).codec();
   private final Either<cre.c<hg<cqv>>, hg<crj>> f;

   private cri(Either<cre.c<hg<cqv>>, hg<crj>> $$0) {
      this.f = $$0;
   }

   public static cri a(cre.c<hg<cqv>> $$0) {
      return new cri(Either.left($$0));
   }

   public static cri a(hg<crj> $$0) {
      return new cri(Either.right($$0));
   }

   private cre.c<hg<cqv>> d() {
      return (cre.c<hg<cqv>>)this.f.map($$0 -> $$0, $$0 -> ((crj)$$0.a()).a());
   }

   @Override
   protected Stream<hg<cqv>> b() {
      return this.d().a().stream().map(Pair::getSecond);
   }

   @Override
   protected Codec<? extends cqz> a() {
      return c;
   }

   public boolean a(aex<crj> $$0) {
      Optional<hg<crj>> $$1 = this.f.right();
      return $$1.isPresent() && $$1.get().a($$0);
   }

   @Override
   public hg<cqv> getNoiseBiome(int $$0, int $$1, int $$2, cre.f $$3) {
      return this.a($$3.a($$0, $$1, $$2));
   }

   @ata
   public hg<cqv> a(cre.h $$0) {
      return this.d().a($$0);
   }

   @Override
   public void a(List<String> $$0, gw $$1, cre.f $$2) {
      int $$3 = hs.a($$1.u());
      int $$4 = hs.a($$1.v());
      int $$5 = hs.a($$1.w());
      cre.h $$6 = $$2.a($$3, $$4, $$5);
      float $$7 = cre.a($$6.d());
      float $$8 = cre.a($$6.e());
      float $$9 = cre.a($$6.b());
      float $$10 = cre.a($$6.c());
      float $$11 = cre.a($$6.g());
      double $$12 = (double)dlb.a($$11);
      crl $$13 = new crl();
      $$0.add(
         "Biome builder PV: "
            + crl.a($$12)
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
