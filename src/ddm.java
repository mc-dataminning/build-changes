import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class ddm extends ddd {
   private static final MapCodec<ji<dcz>> d = dcz.c.fieldOf("biome");
   public static final MapCodec<ddi.c<ji<dcz>>> b = ddi.c.a(d).fieldOf("biomes");
   private static final MapCodec<ji<ddn>> e = ddn.b.fieldOf("preset").withLifecycle(Lifecycle.stable());
   public static final MapCodec<ddm> c = Codec.mapEither(b, e).xmap(ddm::new, $$0 -> $$0.f);
   private final Either<ddi.c<ji<dcz>>, ji<ddn>> f;

   private ddm(Either<ddi.c<ji<dcz>>, ji<ddn>> $$0) {
      this.f = $$0;
   }

   public static ddm a(ddi.c<ji<dcz>> $$0) {
      return new ddm(Either.left($$0));
   }

   public static ddm a(ji<ddn> $$0) {
      return new ddm(Either.right($$0));
   }

   private ddi.c<ji<dcz>> d() {
      return (ddi.c<ji<dcz>>)this.f.map($$0 -> $$0, $$0 -> ((ddn)$$0.a()).a());
   }

   @Override
   protected Stream<ji<dcz>> b() {
      return this.d().a().stream().map(Pair::getSecond);
   }

   @Override
   protected MapCodec<? extends ddd> a() {
      return c;
   }

   public boolean a(ale<ddn> $$0) {
      Optional<ji<ddn>> $$1 = this.f.right();
      return $$1.isPresent() && $$1.get().a($$0);
   }

   @Override
   public ji<dcz> getNoiseBiome(int $$0, int $$1, int $$2, ddi.f $$3) {
      return this.a($$3.a($$0, $$1, $$2));
   }

   @bad
   public ji<dcz> a(ddi.h $$0) {
      return this.d().a($$0);
   }

   @Override
   public void a(List<String> $$0, iz $$1, ddi.f $$2) {
      int $$3 = jt.a($$1.u());
      int $$4 = jt.a($$1.v());
      int $$5 = jt.a($$1.w());
      ddi.h $$6 = $$2.a($$3, $$4, $$5);
      float $$7 = ddi.a($$6.d());
      float $$8 = ddi.a($$6.e());
      float $$9 = ddi.a($$6.b());
      float $$10 = ddi.a($$6.c());
      float $$11 = ddi.a($$6.g());
      double $$12 = (double)dyd.a($$11);
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
