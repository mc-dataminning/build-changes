import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class csk extends csb {
   private static final MapCodec<ib<crx>> d = crx.c.fieldOf("biome");
   public static final MapCodec<csg.c<ib<crx>>> b = csg.c.a(d).fieldOf("biomes");
   private static final MapCodec<ib<csl>> e = csl.b.fieldOf("preset").withLifecycle(Lifecycle.stable());
   public static final Codec<csk> c = Codec.mapEither(b, e).xmap(csk::new, $$0 -> $$0.f).codec();
   private final Either<csg.c<ib<crx>>, ib<csl>> f;

   private csk(Either<csg.c<ib<crx>>, ib<csl>> $$0) {
      this.f = $$0;
   }

   public static csk a(csg.c<ib<crx>> $$0) {
      return new csk(Either.left($$0));
   }

   public static csk a(ib<csl> $$0) {
      return new csk(Either.right($$0));
   }

   private csg.c<ib<crx>> d() {
      return (csg.c<ib<crx>>)this.f.map($$0 -> $$0, $$0 -> ((csl)$$0.a()).a());
   }

   @Override
   protected Stream<ib<crx>> b() {
      return this.d().a().stream().map(Pair::getSecond);
   }

   @Override
   protected Codec<? extends csb> a() {
      return c;
   }

   public boolean a(afv<csl> $$0) {
      Optional<ib<csl>> $$1 = this.f.right();
      return $$1.isPresent() && $$1.get().a($$0);
   }

   @Override
   public ib<crx> getNoiseBiome(int $$0, int $$1, int $$2, csg.f $$3) {
      return this.a($$3.a($$0, $$1, $$2));
   }

   @aua
   public ib<crx> a(csg.h $$0) {
      return this.d().a($$0);
   }

   @Override
   public void a(List<String> $$0, ht $$1, csg.f $$2) {
      int $$3 = in.a($$1.u());
      int $$4 = in.a($$1.v());
      int $$5 = in.a($$1.w());
      csg.h $$6 = $$2.a($$3, $$4, $$5);
      float $$7 = csg.a($$6.d());
      float $$8 = csg.a($$6.e());
      float $$9 = csg.a($$6.b());
      float $$10 = csg.a($$6.c());
      float $$11 = csg.a($$6.g());
      double $$12 = (double)dlr.a($$11);
      csn $$13 = new csn();
      $$0.add(
         "Biome builder PV: "
            + csn.a($$12)
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
