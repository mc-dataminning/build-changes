import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class cvb extends cus {
   private static final MapCodec<ih<cuo>> d = cuo.c.fieldOf("biome");
   public static final MapCodec<cux.c<ih<cuo>>> b = cux.c.a(d).fieldOf("biomes");
   private static final MapCodec<ih<cvc>> e = cvc.b.fieldOf("preset").withLifecycle(Lifecycle.stable());
   public static final Codec<cvb> c = Codec.mapEither(b, e).xmap(cvb::new, $$0 -> $$0.f).codec();
   private final Either<cux.c<ih<cuo>>, ih<cvc>> f;

   private cvb(Either<cux.c<ih<cuo>>, ih<cvc>> $$0) {
      this.f = $$0;
   }

   public static cvb a(cux.c<ih<cuo>> $$0) {
      return new cvb(Either.left($$0));
   }

   public static cvb a(ih<cvc> $$0) {
      return new cvb(Either.right($$0));
   }

   private cux.c<ih<cuo>> d() {
      return (cux.c<ih<cuo>>)this.f.map($$0 -> $$0, $$0 -> ((cvc)$$0.a()).a());
   }

   @Override
   protected Stream<ih<cuo>> b() {
      return this.d().a().stream().map(Pair::getSecond);
   }

   @Override
   protected Codec<? extends cus> a() {
      return c;
   }

   public boolean a(ahf<cvc> $$0) {
      Optional<ih<cvc>> $$1 = this.f.right();
      return $$1.isPresent() && $$1.get().a($$0);
   }

   @Override
   public ih<cuo> getNoiseBiome(int $$0, int $$1, int $$2, cux.f $$3) {
      return this.a($$3.a($$0, $$1, $$2));
   }

   @avt
   public ih<cuo> a(cux.h $$0) {
      return this.d().a($$0);
   }

   @Override
   public void a(List<String> $$0, hx $$1, cux.f $$2) {
      int $$3 = is.a($$1.u());
      int $$4 = is.a($$1.v());
      int $$5 = is.a($$1.w());
      cux.h $$6 = $$2.a($$3, $$4, $$5);
      float $$7 = cux.a($$6.d());
      float $$8 = cux.a($$6.e());
      float $$9 = cux.a($$6.b());
      float $$10 = cux.a($$6.c());
      float $$11 = cux.a($$6.g());
      double $$12 = (double)dox.a($$11);
      cve $$13 = new cve();
      $$0.add(
         "Biome builder PV: "
            + cve.a($$12)
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
