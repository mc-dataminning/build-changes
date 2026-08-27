import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class cqw extends cqn {
   private static final MapCodec<he<cqj>> d = cqj.c.fieldOf("biome");
   public static final MapCodec<cqs.c<he<cqj>>> b = cqs.c.a(d).fieldOf("biomes");
   private static final MapCodec<he<cqx>> e = cqx.b.fieldOf("preset").withLifecycle(Lifecycle.stable());
   public static final Codec<cqw> c = Codec.mapEither(b, e).xmap(cqw::new, $$0 -> $$0.f).codec();
   private final Either<cqs.c<he<cqj>>, he<cqx>> f;

   private cqw(Either<cqs.c<he<cqj>>, he<cqx>> $$0) {
      this.f = $$0;
   }

   public static cqw a(cqs.c<he<cqj>> $$0) {
      return new cqw(Either.left($$0));
   }

   public static cqw a(he<cqx> $$0) {
      return new cqw(Either.right($$0));
   }

   private cqs.c<he<cqj>> d() {
      return (cqs.c<he<cqj>>)this.f.map($$0 -> $$0, $$0 -> ((cqx)$$0.a()).a());
   }

   @Override
   protected Stream<he<cqj>> b() {
      return this.d().a().stream().map(Pair::getSecond);
   }

   @Override
   protected Codec<? extends cqn> a() {
      return c;
   }

   public boolean a(aeq<cqx> $$0) {
      Optional<he<cqx>> $$1 = this.f.right();
      return $$1.isPresent() && $$1.get().a($$0);
   }

   @Override
   public he<cqj> getNoiseBiome(int $$0, int $$1, int $$2, cqs.f $$3) {
      return this.a($$3.a($$0, $$1, $$2));
   }

   @asq
   public he<cqj> a(cqs.h $$0) {
      return this.d().a($$0);
   }

   @Override
   public void a(List<String> $$0, gu $$1, cqs.f $$2) {
      int $$3 = hq.a($$1.u());
      int $$4 = hq.a($$1.v());
      int $$5 = hq.a($$1.w());
      cqs.h $$6 = $$2.a($$3, $$4, $$5);
      float $$7 = cqs.a($$6.d());
      float $$8 = cqs.a($$6.e());
      float $$9 = cqs.a($$6.b());
      float $$10 = cqs.a($$6.c());
      float $$11 = cqs.a($$6.g());
      double $$12 = (double)dkp.a($$11);
      cqz $$13 = new cqz();
      $$0.add(
         "Biome builder PV: "
            + cqz.a($$12)
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
