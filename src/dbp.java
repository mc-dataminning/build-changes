import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class dbp extends dbg {
   private static final MapCodec<iw<dbc>> d = dbc.c.fieldOf("biome");
   public static final MapCodec<dbl.c<iw<dbc>>> b = dbl.c.a(d).fieldOf("biomes");
   private static final MapCodec<iw<dbq>> e = dbq.b.fieldOf("preset").withLifecycle(Lifecycle.stable());
   public static final Codec<dbp> c = Codec.mapEither(b, e).xmap(dbp::new, $$0 -> $$0.f).codec();
   private final Either<dbl.c<iw<dbc>>, iw<dbq>> f;

   private dbp(Either<dbl.c<iw<dbc>>, iw<dbq>> $$0) {
      this.f = $$0;
   }

   public static dbp a(dbl.c<iw<dbc>> $$0) {
      return new dbp(Either.left($$0));
   }

   public static dbp a(iw<dbq> $$0) {
      return new dbp(Either.right($$0));
   }

   private dbl.c<iw<dbc>> d() {
      return (dbl.c<iw<dbc>>)this.f.map($$0 -> $$0, $$0 -> ((dbq)$$0.a()).a());
   }

   @Override
   protected Stream<iw<dbc>> b() {
      return this.d().a().stream().map(Pair::getSecond);
   }

   @Override
   protected Codec<? extends dbg> a() {
      return c;
   }

   public boolean a(akg<dbq> $$0) {
      Optional<iw<dbq>> $$1 = this.f.right();
      return $$1.isPresent() && $$1.get().a($$0);
   }

   @Override
   public iw<dbc> getNoiseBiome(int $$0, int $$1, int $$2, dbl.f $$3) {
      return this.a($$3.a($$0, $$1, $$2));
   }

   @azc
   public iw<dbc> a(dbl.h $$0) {
      return this.d().a($$0);
   }

   @Override
   public void a(List<String> $$0, in $$1, dbl.f $$2) {
      int $$3 = jh.a($$1.u());
      int $$4 = jh.a($$1.v());
      int $$5 = jh.a($$1.w());
      dbl.h $$6 = $$2.a($$3, $$4, $$5);
      float $$7 = dbl.a($$6.d());
      float $$8 = dbl.a($$6.e());
      float $$9 = dbl.a($$6.b());
      float $$10 = dbl.a($$6.c());
      float $$11 = dbl.a($$6.g());
      double $$12 = (double)dwg.a($$11);
      dbs $$13 = new dbs();
      $$0.add(
         "Biome builder PV: "
            + dbs.a($$12)
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
