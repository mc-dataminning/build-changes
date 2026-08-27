import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class dbg extends dax {
   private static final MapCodec<iv<dat>> d = dat.c.fieldOf("biome");
   public static final MapCodec<dbc.c<iv<dat>>> b = dbc.c.a(d).fieldOf("biomes");
   private static final MapCodec<iv<dbh>> e = dbh.b.fieldOf("preset").withLifecycle(Lifecycle.stable());
   public static final Codec<dbg> c = Codec.mapEither(b, e).xmap(dbg::new, $$0 -> $$0.f).codec();
   private final Either<dbc.c<iv<dat>>, iv<dbh>> f;

   private dbg(Either<dbc.c<iv<dat>>, iv<dbh>> $$0) {
      this.f = $$0;
   }

   public static dbg a(dbc.c<iv<dat>> $$0) {
      return new dbg(Either.left($$0));
   }

   public static dbg a(iv<dbh> $$0) {
      return new dbg(Either.right($$0));
   }

   private dbc.c<iv<dat>> d() {
      return (dbc.c<iv<dat>>)this.f.map($$0 -> $$0, $$0 -> ((dbh)$$0.a()).a());
   }

   @Override
   protected Stream<iv<dat>> b() {
      return this.d().a().stream().map(Pair::getSecond);
   }

   @Override
   protected Codec<? extends dax> a() {
      return c;
   }

   public boolean a(ake<dbh> $$0) {
      Optional<iv<dbh>> $$1 = this.f.right();
      return $$1.isPresent() && $$1.get().a($$0);
   }

   @Override
   public iv<dat> getNoiseBiome(int $$0, int $$1, int $$2, dbc.f $$3) {
      return this.a($$3.a($$0, $$1, $$2));
   }

   @ayz
   public iv<dat> a(dbc.h $$0) {
      return this.d().a($$0);
   }

   @Override
   public void a(List<String> $$0, im $$1, dbc.f $$2) {
      int $$3 = jg.a($$1.u());
      int $$4 = jg.a($$1.v());
      int $$5 = jg.a($$1.w());
      dbc.h $$6 = $$2.a($$3, $$4, $$5);
      float $$7 = dbc.a($$6.d());
      float $$8 = dbc.a($$6.e());
      float $$9 = dbc.a($$6.b());
      float $$10 = dbc.a($$6.c());
      float $$11 = dbc.a($$6.g());
      double $$12 = (double)dvx.a($$11);
      dbj $$13 = new dbj();
      $$0.add(
         "Biome builder PV: "
            + dbj.a($$12)
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
