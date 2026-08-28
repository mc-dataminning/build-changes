import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class dkf extends djw {
   private static final MapCodec<je<djs>> d = djs.c.fieldOf("biome");
   public static final MapCodec<dkb.c<je<djs>>> b = dkb.c.a(d).fieldOf("biomes");
   private static final MapCodec<je<dkg>> e = dkg.b.fieldOf("preset").withLifecycle(Lifecycle.stable());
   public static final MapCodec<dkf> c = Codec.mapEither(b, e).xmap(dkf::new, $$0 -> $$0.f);
   private final Either<dkb.c<je<djs>>, je<dkg>> f;

   private dkf(Either<dkb.c<je<djs>>, je<dkg>> $$0) {
      this.f = $$0;
   }

   public static dkf a(dkb.c<je<djs>> $$0) {
      return new dkf(Either.left($$0));
   }

   public static dkf a(je<dkg> $$0) {
      return new dkf(Either.right($$0));
   }

   private dkb.c<je<djs>> d() {
      return (dkb.c<je<djs>>)this.f.map($$0 -> $$0, $$0 -> ((dkg)$$0.a()).a());
   }

   @Override
   protected Stream<je<djs>> b() {
      return this.d().a().stream().map(Pair::getSecond);
   }

   @Override
   protected MapCodec<? extends djw> a() {
      return c;
   }

   public boolean a(ald<dkg> $$0) {
      Optional<je<dkg>> $$1 = this.f.right();
      return $$1.isPresent() && $$1.get().a($$0);
   }

   @Override
   public je<djs> getNoiseBiome(int $$0, int $$1, int $$2, dkb.f $$3) {
      return this.a($$3.a($$0, $$1, $$2));
   }

   @bat
   public je<djs> a(dkb.h $$0) {
      return this.d().a($$0);
   }

   @Override
   public void a(List<String> $$0, iu $$1, dkb.f $$2) {
      int $$3 = jp.a($$1.u());
      int $$4 = jp.a($$1.v());
      int $$5 = jp.a($$1.w());
      dkb.h $$6 = $$2.a($$3, $$4, $$5);
      float $$7 = dkb.a($$6.d());
      float $$8 = dkb.a($$6.e());
      float $$9 = dkb.a($$6.b());
      float $$10 = dkb.a($$6.c());
      float $$11 = dkb.a($$6.g());
      double $$12 = (double)efu.a($$11);
      dki $$13 = new dki();
      $$0.add(
         "Biome builder PV: "
            + dki.a($$12)
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
