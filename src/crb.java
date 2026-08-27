import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class crb extends cqs {
   private static final MapCodec<hg<cqo>> d = cqo.c.fieldOf("biome");
   public static final MapCodec<cqx.c<hg<cqo>>> b = cqx.c.a(d).fieldOf("biomes");
   private static final MapCodec<hg<crc>> e = crc.b.fieldOf("preset").withLifecycle(Lifecycle.stable());
   public static final Codec<crb> c = Codec.mapEither(b, e).xmap(crb::new, $$0 -> $$0.f).codec();
   private final Either<cqx.c<hg<cqo>>, hg<crc>> f;

   private crb(Either<cqx.c<hg<cqo>>, hg<crc>> $$0) {
      this.f = $$0;
   }

   public static crb a(cqx.c<hg<cqo>> $$0) {
      return new crb(Either.left($$0));
   }

   public static crb a(hg<crc> $$0) {
      return new crb(Either.right($$0));
   }

   private cqx.c<hg<cqo>> d() {
      return (cqx.c<hg<cqo>>)this.f.map($$0 -> $$0, $$0 -> ((crc)$$0.a()).a());
   }

   @Override
   protected Stream<hg<cqo>> b() {
      return this.d().a().stream().map(Pair::getSecond);
   }

   @Override
   protected Codec<? extends cqs> a() {
      return c;
   }

   public boolean a(aet<crc> $$0) {
      Optional<hg<crc>> $$1 = this.f.right();
      return $$1.isPresent() && $$1.get().a($$0);
   }

   @Override
   public hg<cqo> getNoiseBiome(int $$0, int $$1, int $$2, cqx.f $$3) {
      return this.a($$3.a($$0, $$1, $$2));
   }

   @ast
   public hg<cqo> a(cqx.h $$0) {
      return this.d().a($$0);
   }

   @Override
   public void a(List<String> $$0, gw $$1, cqx.f $$2) {
      int $$3 = hs.a($$1.u());
      int $$4 = hs.a($$1.v());
      int $$5 = hs.a($$1.w());
      cqx.h $$6 = $$2.a($$3, $$4, $$5);
      float $$7 = cqx.a($$6.d());
      float $$8 = cqx.a($$6.e());
      float $$9 = cqx.a($$6.b());
      float $$10 = cqx.a($$6.c());
      float $$11 = cqx.a($$6.g());
      double $$12 = (double)dku.a($$11);
      cre $$13 = new cre();
      $$0.add(
         "Biome builder PV: "
            + cre.a($$12)
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
