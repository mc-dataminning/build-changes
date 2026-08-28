import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class dej extends dea {
   private static final MapCodec<jm<ddw>> d = ddw.c.fieldOf("biome");
   public static final MapCodec<def.c<jm<ddw>>> b = def.c.a(d).fieldOf("biomes");
   private static final MapCodec<jm<dek>> e = dek.b.fieldOf("preset").withLifecycle(Lifecycle.stable());
   public static final MapCodec<dej> c = Codec.mapEither(b, e).xmap(dej::new, $$0 -> $$0.f);
   private final Either<def.c<jm<ddw>>, jm<dek>> f;

   private dej(Either<def.c<jm<ddw>>, jm<dek>> $$0) {
      this.f = $$0;
   }

   public static dej a(def.c<jm<ddw>> $$0) {
      return new dej(Either.left($$0));
   }

   public static dej a(jm<dek> $$0) {
      return new dej(Either.right($$0));
   }

   private def.c<jm<ddw>> d() {
      return (def.c<jm<ddw>>)this.f.map($$0 -> $$0, $$0 -> ((dek)$$0.a()).a());
   }

   @Override
   protected Stream<jm<ddw>> b() {
      return this.d().a().stream().map(Pair::getSecond);
   }

   @Override
   protected MapCodec<? extends dea> a() {
      return c;
   }

   public boolean a(akq<dek> $$0) {
      Optional<jm<dek>> $$1 = this.f.right();
      return $$1.isPresent() && $$1.get().a($$0);
   }

   @Override
   public jm<ddw> getNoiseBiome(int $$0, int $$1, int $$2, def.f $$3) {
      return this.a($$3.a($$0, $$1, $$2));
   }

   @azt
   public jm<ddw> a(def.h $$0) {
      return this.d().a($$0);
   }

   @Override
   public void a(List<String> $$0, jd $$1, def.f $$2) {
      int $$3 = jx.a($$1.u());
      int $$4 = jx.a($$1.v());
      int $$5 = jx.a($$1.w());
      def.h $$6 = $$2.a($$3, $$4, $$5);
      float $$7 = def.a($$6.d());
      float $$8 = def.a($$6.e());
      float $$9 = def.a($$6.b());
      float $$10 = def.a($$6.c());
      float $$11 = def.a($$6.g());
      double $$12 = (double)dzf.a($$11);
      dem $$13 = new dem();
      $$0.add(
         "Biome builder PV: "
            + dem.a($$12)
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
