import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class dhw extends dhn {
   private static final MapCodec<jr<dhj>> d = dhj.c.fieldOf("biome");
   public static final MapCodec<dhs.c<jr<dhj>>> b = dhs.c.a(d).fieldOf("biomes");
   private static final MapCodec<jr<dhx>> e = dhx.b.fieldOf("preset").withLifecycle(Lifecycle.stable());
   public static final MapCodec<dhw> c = Codec.mapEither(b, e).xmap(dhw::new, $$0 -> $$0.f);
   private final Either<dhs.c<jr<dhj>>, jr<dhx>> f;

   private dhw(Either<dhs.c<jr<dhj>>, jr<dhx>> $$0) {
      this.f = $$0;
   }

   public static dhw a(dhs.c<jr<dhj>> $$0) {
      return new dhw(Either.left($$0));
   }

   public static dhw a(jr<dhx> $$0) {
      return new dhw(Either.right($$0));
   }

   private dhs.c<jr<dhj>> d() {
      return (dhs.c<jr<dhj>>)this.f.map($$0 -> $$0, $$0 -> ((dhx)$$0.a()).a());
   }

   @Override
   protected Stream<jr<dhj>> b() {
      return this.d().a().stream().map(Pair::getSecond);
   }

   @Override
   protected MapCodec<? extends dhn> a() {
      return c;
   }

   public boolean a(aku<dhx> $$0) {
      Optional<jr<dhx>> $$1 = this.f.right();
      return $$1.isPresent() && $$1.get().a($$0);
   }

   @Override
   public jr<dhj> getNoiseBiome(int $$0, int $$1, int $$2, dhs.f $$3) {
      return this.a($$3.a($$0, $$1, $$2));
   }

   @bag
   public jr<dhj> a(dhs.h $$0) {
      return this.d().a($$0);
   }

   @Override
   public void a(List<String> $$0, ji $$1, dhs.f $$2) {
      int $$3 = kc.a($$1.u());
      int $$4 = kc.a($$1.v());
      int $$5 = kc.a($$1.w());
      dhs.h $$6 = $$2.a($$3, $$4, $$5);
      float $$7 = dhs.a($$6.d());
      float $$8 = dhs.a($$6.e());
      float $$9 = dhs.a($$6.b());
      float $$10 = dhs.a($$6.c());
      float $$11 = dhs.a($$6.g());
      double $$12 = (double)ecy.a($$11);
      dhz $$13 = new dhz();
      $$0.add(
         "Biome builder PV: "
            + dhz.a($$12)
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
