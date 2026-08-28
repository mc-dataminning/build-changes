import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class djf extends diw {
   private static final MapCodec<js<dis>> d = dis.c.fieldOf("biome");
   public static final MapCodec<djb.c<js<dis>>> b = djb.c.a(d).fieldOf("biomes");
   private static final MapCodec<js<djg>> e = djg.b.fieldOf("preset").withLifecycle(Lifecycle.stable());
   public static final MapCodec<djf> c = Codec.mapEither(b, e).xmap(djf::new, $$0 -> $$0.f);
   private final Either<djb.c<js<dis>>, js<djg>> f;

   private djf(Either<djb.c<js<dis>>, js<djg>> $$0) {
      this.f = $$0;
   }

   public static djf a(djb.c<js<dis>> $$0) {
      return new djf(Either.left($$0));
   }

   public static djf a(js<djg> $$0) {
      return new djf(Either.right($$0));
   }

   private djb.c<js<dis>> d() {
      return (djb.c<js<dis>>)this.f.map($$0 -> $$0, $$0 -> ((djg)$$0.a()).a());
   }

   @Override
   protected Stream<js<dis>> b() {
      return this.d().a().stream().map(Pair::getSecond);
   }

   @Override
   protected MapCodec<? extends diw> a() {
      return c;
   }

   public boolean a(alc<djg> $$0) {
      Optional<js<djg>> $$1 = this.f.right();
      return $$1.isPresent() && $$1.get().a($$0);
   }

   @Override
   public js<dis> getNoiseBiome(int $$0, int $$1, int $$2, djb.f $$3) {
      return this.a($$3.a($$0, $$1, $$2));
   }

   @bar
   public js<dis> a(djb.h $$0) {
      return this.d().a($$0);
   }

   @Override
   public void a(List<String> $$0, jj $$1, djb.f $$2) {
      int $$3 = kd.a($$1.u());
      int $$4 = kd.a($$1.v());
      int $$5 = kd.a($$1.w());
      djb.h $$6 = $$2.a($$3, $$4, $$5);
      float $$7 = djb.a($$6.d());
      float $$8 = djb.a($$6.e());
      float $$9 = djb.a($$6.b());
      float $$10 = djb.a($$6.c());
      float $$11 = djb.a($$6.g());
      double $$12 = (double)ees.a($$11);
      dji $$13 = new dji();
      $$0.add(
         "Biome builder PV: "
            + dji.a($$12)
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
