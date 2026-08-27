import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class cqx extends cqo {
   private static final MapCodec<he<cqk>> d = cqk.c.fieldOf("biome");
   public static final MapCodec<cqt.c<he<cqk>>> b = cqt.c.a(d).fieldOf("biomes");
   private static final MapCodec<he<cqy>> e = cqy.b.fieldOf("preset").withLifecycle(Lifecycle.stable());
   public static final Codec<cqx> c = Codec.mapEither(b, e).xmap(cqx::new, $$0 -> $$0.f).codec();
   private final Either<cqt.c<he<cqk>>, he<cqy>> f;

   private cqx(Either<cqt.c<he<cqk>>, he<cqy>> $$0) {
      this.f = $$0;
   }

   public static cqx a(cqt.c<he<cqk>> $$0) {
      return new cqx(Either.left($$0));
   }

   public static cqx a(he<cqy> $$0) {
      return new cqx(Either.right($$0));
   }

   private cqt.c<he<cqk>> d() {
      return (cqt.c<he<cqk>>)this.f.map($$0 -> $$0, $$0 -> ((cqy)$$0.a()).a());
   }

   @Override
   protected Stream<he<cqk>> b() {
      return this.d().a().stream().map(Pair::getSecond);
   }

   @Override
   protected Codec<? extends cqo> a() {
      return c;
   }

   public boolean a(aeq<cqy> $$0) {
      Optional<he<cqy>> $$1 = this.f.right();
      return $$1.isPresent() && $$1.get().a($$0);
   }

   @Override
   public he<cqk> getNoiseBiome(int $$0, int $$1, int $$2, cqt.f $$3) {
      return this.a($$3.a($$0, $$1, $$2));
   }

   @asq
   public he<cqk> a(cqt.h $$0) {
      return this.d().a($$0);
   }

   @Override
   public void a(List<String> $$0, gu $$1, cqt.f $$2) {
      int $$3 = hq.a($$1.u());
      int $$4 = hq.a($$1.v());
      int $$5 = hq.a($$1.w());
      cqt.h $$6 = $$2.a($$3, $$4, $$5);
      float $$7 = cqt.a($$6.d());
      float $$8 = cqt.a($$6.e());
      float $$9 = cqt.a($$6.b());
      float $$10 = cqt.a($$6.c());
      float $$11 = cqt.a($$6.g());
      double $$12 = (double)dkq.a($$11);
      cra $$13 = new cra();
      $$0.add(
         "Biome builder PV: "
            + cra.a($$12)
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
