import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class ctd extends csu {
   private static final MapCodec<ib<csq>> d = csq.c.fieldOf("biome");
   public static final MapCodec<csz.c<ib<csq>>> b = csz.c.a(d).fieldOf("biomes");
   private static final MapCodec<ib<cte>> e = cte.b.fieldOf("preset").withLifecycle(Lifecycle.stable());
   public static final Codec<ctd> c = Codec.mapEither(b, e).xmap(ctd::new, $$0 -> $$0.f).codec();
   private final Either<csz.c<ib<csq>>, ib<cte>> f;

   private ctd(Either<csz.c<ib<csq>>, ib<cte>> $$0) {
      this.f = $$0;
   }

   public static ctd a(csz.c<ib<csq>> $$0) {
      return new ctd(Either.left($$0));
   }

   public static ctd a(ib<cte> $$0) {
      return new ctd(Either.right($$0));
   }

   private csz.c<ib<csq>> d() {
      return (csz.c<ib<csq>>)this.f.map($$0 -> $$0, $$0 -> ((cte)$$0.a()).a());
   }

   @Override
   protected Stream<ib<csq>> b() {
      return this.d().a().stream().map(Pair::getSecond);
   }

   @Override
   protected Codec<? extends csu> a() {
      return c;
   }

   public boolean a(agf<cte> $$0) {
      Optional<ib<cte>> $$1 = this.f.right();
      return $$1.isPresent() && $$1.get().a($$0);
   }

   @Override
   public ib<csq> getNoiseBiome(int $$0, int $$1, int $$2, csz.f $$3) {
      return this.a($$3.a($$0, $$1, $$2));
   }

   @auk
   public ib<csq> a(csz.h $$0) {
      return this.d().a($$0);
   }

   @Override
   public void a(List<String> $$0, ht $$1, csz.f $$2) {
      int $$3 = in.a($$1.u());
      int $$4 = in.a($$1.v());
      int $$5 = in.a($$1.w());
      csz.h $$6 = $$2.a($$3, $$4, $$5);
      float $$7 = csz.a($$6.d());
      float $$8 = csz.a($$6.e());
      float $$9 = csz.a($$6.b());
      float $$10 = csz.a($$6.c());
      float $$11 = csz.a($$6.g());
      double $$12 = (double)dmm.a($$11);
      ctg $$13 = new ctg();
      $$0.add(
         "Biome builder PV: "
            + ctg.a($$12)
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
