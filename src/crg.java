import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class crg extends cqx {
   private static final MapCodec<he<cqt>> d = cqt.c.fieldOf("biome");
   public static final MapCodec<crc.c<he<cqt>>> b = crc.c.a(d).fieldOf("biomes");
   private static final MapCodec<he<crh>> e = crh.b.fieldOf("preset").withLifecycle(Lifecycle.stable());
   public static final Codec<crg> c = Codec.mapEither(b, e).xmap(crg::new, $$0 -> $$0.f).codec();
   private final Either<crc.c<he<cqt>>, he<crh>> f;

   private crg(Either<crc.c<he<cqt>>, he<crh>> $$0) {
      this.f = $$0;
   }

   public static crg a(crc.c<he<cqt>> $$0) {
      return new crg(Either.left($$0));
   }

   public static crg a(he<crh> $$0) {
      return new crg(Either.right($$0));
   }

   private crc.c<he<cqt>> d() {
      return (crc.c<he<cqt>>)this.f.map($$0 -> $$0, $$0 -> ((crh)$$0.a()).a());
   }

   @Override
   protected Stream<he<cqt>> b() {
      return this.d().a().stream().map(Pair::getSecond);
   }

   @Override
   protected Codec<? extends cqx> a() {
      return c;
   }

   public boolean a(aev<crh> $$0) {
      Optional<he<crh>> $$1 = this.f.right();
      return $$1.isPresent() && $$1.get().a($$0);
   }

   @Override
   public he<cqt> getNoiseBiome(int $$0, int $$1, int $$2, crc.f $$3) {
      return this.a($$3.a($$0, $$1, $$2));
   }

   @asy
   public he<cqt> a(crc.h $$0) {
      return this.d().a($$0);
   }

   @Override
   public void a(List<String> $$0, gw $$1, crc.f $$2) {
      int $$3 = hp.a($$1.u());
      int $$4 = hp.a($$1.v());
      int $$5 = hp.a($$1.w());
      crc.h $$6 = $$2.a($$3, $$4, $$5);
      float $$7 = crc.a($$6.d());
      float $$8 = crc.a($$6.e());
      float $$9 = crc.a($$6.b());
      float $$10 = crc.a($$6.c());
      float $$11 = crc.a($$6.g());
      double $$12 = (double)dkz.a($$11);
      crj $$13 = new crj();
      $$0.add(
         "Biome builder PV: "
            + crj.a($$12)
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
