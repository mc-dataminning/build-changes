import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class dkq extends dkh {
   private static final MapCodec<je<dkd>> d = dkd.c.fieldOf("biome");
   public static final MapCodec<dkm.c<je<dkd>>> b = dkm.c.a(d).fieldOf("biomes");
   private static final MapCodec<je<dkr>> e = dkr.b.fieldOf("preset").withLifecycle(Lifecycle.stable());
   public static final MapCodec<dkq> c = Codec.mapEither(b, e).xmap(dkq::new, $$0 -> $$0.f);
   private final Either<dkm.c<je<dkd>>, je<dkr>> f;

   private dkq(Either<dkm.c<je<dkd>>, je<dkr>> $$0) {
      this.f = $$0;
   }

   public static dkq a(dkm.c<je<dkd>> $$0) {
      return new dkq(Either.left($$0));
   }

   public static dkq a(je<dkr> $$0) {
      return new dkq(Either.right($$0));
   }

   private dkm.c<je<dkd>> d() {
      return (dkm.c<je<dkd>>)this.f.map($$0 -> $$0, $$0 -> ((dkr)$$0.a()).a());
   }

   @Override
   protected Stream<je<dkd>> b() {
      return this.d().a().stream().map(Pair::getSecond);
   }

   @Override
   protected MapCodec<? extends dkh> a() {
      return c;
   }

   public boolean a(alf<dkr> $$0) {
      Optional<je<dkr>> $$1 = this.f.right();
      return $$1.isPresent() && $$1.get().a($$0);
   }

   @Override
   public je<dkd> getNoiseBiome(int $$0, int $$1, int $$2, dkm.f $$3) {
      return this.a($$3.a($$0, $$1, $$2));
   }

   @bav
   public je<dkd> a(dkm.h $$0) {
      return this.d().a($$0);
   }

   @Override
   public void a(List<String> $$0, iu $$1, dkm.f $$2) {
      int $$3 = jp.a($$1.u());
      int $$4 = jp.a($$1.v());
      int $$5 = jp.a($$1.w());
      dkm.h $$6 = $$2.a($$3, $$4, $$5);
      float $$7 = dkm.a($$6.d());
      float $$8 = dkm.a($$6.e());
      float $$9 = dkm.a($$6.b());
      float $$10 = dkm.a($$6.c());
      float $$11 = dkm.a($$6.g());
      double $$12 = (double)egn.a($$11);
      dkt $$13 = new dkt();
      $$0.add(
         "Biome builder PV: "
            + dkt.a($$12)
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
