import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class cqv extends cqm {
   private static final MapCodec<hf<cqi>> d = cqi.c.fieldOf("biome");
   public static final MapCodec<cqr.c<hf<cqi>>> b = cqr.c.a(d).fieldOf("biomes");
   private static final MapCodec<hf<cqw>> e = cqw.b.fieldOf("preset").withLifecycle(Lifecycle.stable());
   public static final Codec<cqv> c = Codec.mapEither(b, e).xmap(cqv::new, $$0 -> $$0.f).codec();
   private final Either<cqr.c<hf<cqi>>, hf<cqw>> f;

   private cqv(Either<cqr.c<hf<cqi>>, hf<cqw>> $$0) {
      this.f = $$0;
   }

   public static cqv a(cqr.c<hf<cqi>> $$0) {
      return new cqv(Either.left($$0));
   }

   public static cqv a(hf<cqw> $$0) {
      return new cqv(Either.right($$0));
   }

   private cqr.c<hf<cqi>> d() {
      return (cqr.c<hf<cqi>>)this.f.map($$0 -> $$0, $$0 -> ((cqw)$$0.a()).a());
   }

   @Override
   protected Stream<hf<cqi>> b() {
      return this.d().a().stream().map(Pair::getSecond);
   }

   @Override
   protected Codec<? extends cqm> a() {
      return c;
   }

   public boolean a(aeo<cqw> $$0) {
      Optional<hf<cqw>> $$1 = this.f.right();
      return $$1.isPresent() && $$1.get().a($$0);
   }

   @Override
   public hf<cqi> getNoiseBiome(int $$0, int $$1, int $$2, cqr.f $$3) {
      return this.a($$3.a($$0, $$1, $$2));
   }

   @aso
   public hf<cqi> a(cqr.h $$0) {
      return this.d().a($$0);
   }

   @Override
   public void a(List<String> $$0, gv $$1, cqr.f $$2) {
      int $$3 = hr.a($$1.u());
      int $$4 = hr.a($$1.v());
      int $$5 = hr.a($$1.w());
      cqr.h $$6 = $$2.a($$3, $$4, $$5);
      float $$7 = cqr.a($$6.d());
      float $$8 = cqr.a($$6.e());
      float $$9 = cqr.a($$6.b());
      float $$10 = cqr.a($$6.c());
      float $$11 = cqr.a($$6.g());
      double $$12 = (double)dko.a($$11);
      cqy $$13 = new cqy();
      $$0.add(
         "Biome builder PV: "
            + cqy.a($$12)
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
