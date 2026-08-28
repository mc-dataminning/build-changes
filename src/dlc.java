import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class dlc extends dkt {
   private static final MapCodec<jf<dkp>> d = dkp.c.fieldOf("biome");
   public static final MapCodec<dky.c<jf<dkp>>> b = dky.c.a(d).fieldOf("biomes");
   private static final MapCodec<jf<dld>> e = dld.b.fieldOf("preset").withLifecycle(Lifecycle.stable());
   public static final MapCodec<dlc> c = Codec.mapEither(b, e).xmap(dlc::new, $$0 -> $$0.f);
   private final Either<dky.c<jf<dkp>>, jf<dld>> f;

   private dlc(Either<dky.c<jf<dkp>>, jf<dld>> $$0) {
      this.f = $$0;
   }

   public static dlc a(dky.c<jf<dkp>> $$0) {
      return new dlc(Either.left($$0));
   }

   public static dlc a(jf<dld> $$0) {
      return new dlc(Either.right($$0));
   }

   private dky.c<jf<dkp>> d() {
      return (dky.c<jf<dkp>>)this.f.map($$0 -> $$0, $$0 -> ((dld)$$0.a()).a());
   }

   @Override
   protected Stream<jf<dkp>> b() {
      return this.d().a().stream().map(Pair::getSecond);
   }

   @Override
   protected MapCodec<? extends dkt> a() {
      return c;
   }

   public boolean a(alf<dld> $$0) {
      Optional<jf<dld>> $$1 = this.f.right();
      return $$1.isPresent() && $$1.get().a($$0);
   }

   @Override
   public jf<dkp> getNoiseBiome(int $$0, int $$1, int $$2, dky.f $$3) {
      return this.a($$3.a($$0, $$1, $$2));
   }

   @bav
   public jf<dkp> a(dky.h $$0) {
      return this.d().a($$0);
   }

   @Override
   public void a(List<String> $$0, iv $$1, dky.f $$2) {
      int $$3 = jq.a($$1.u());
      int $$4 = jq.a($$1.v());
      int $$5 = jq.a($$1.w());
      dky.h $$6 = $$2.a($$3, $$4, $$5);
      float $$7 = dky.a($$6.d());
      float $$8 = dky.a($$6.e());
      float $$9 = dky.a($$6.b());
      float $$10 = dky.a($$6.c());
      float $$11 = dky.a($$6.g());
      double $$12 = (double)egz.a($$11);
      dlf $$13 = new dlf();
      $$0.add(
         "Biome builder PV: "
            + dlf.a($$12)
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
