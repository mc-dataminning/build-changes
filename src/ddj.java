import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class ddj extends dda {
   private static final MapCodec<ji<dcw>> d = dcw.c.fieldOf("biome");
   public static final MapCodec<ddf.c<ji<dcw>>> b = ddf.c.a(d).fieldOf("biomes");
   private static final MapCodec<ji<ddk>> e = ddk.b.fieldOf("preset").withLifecycle(Lifecycle.stable());
   public static final MapCodec<ddj> c = Codec.mapEither(b, e).xmap(ddj::new, $$0 -> $$0.f);
   private final Either<ddf.c<ji<dcw>>, ji<ddk>> f;

   private ddj(Either<ddf.c<ji<dcw>>, ji<ddk>> $$0) {
      this.f = $$0;
   }

   public static ddj a(ddf.c<ji<dcw>> $$0) {
      return new ddj(Either.left($$0));
   }

   public static ddj a(ji<ddk> $$0) {
      return new ddj(Either.right($$0));
   }

   private ddf.c<ji<dcw>> d() {
      return (ddf.c<ji<dcw>>)this.f.map($$0 -> $$0, $$0 -> ((ddk)$$0.a()).a());
   }

   @Override
   protected Stream<ji<dcw>> b() {
      return this.d().a().stream().map(Pair::getSecond);
   }

   @Override
   protected MapCodec<? extends dda> a() {
      return c;
   }

   public boolean a(ald<ddk> $$0) {
      Optional<ji<ddk>> $$1 = this.f.right();
      return $$1.isPresent() && $$1.get().a($$0);
   }

   @Override
   public ji<dcw> getNoiseBiome(int $$0, int $$1, int $$2, ddf.f $$3) {
      return this.a($$3.a($$0, $$1, $$2));
   }

   @bac
   public ji<dcw> a(ddf.h $$0) {
      return this.d().a($$0);
   }

   @Override
   public void a(List<String> $$0, iz $$1, ddf.f $$2) {
      int $$3 = jt.a($$1.u());
      int $$4 = jt.a($$1.v());
      int $$5 = jt.a($$1.w());
      ddf.h $$6 = $$2.a($$3, $$4, $$5);
      float $$7 = ddf.a($$6.d());
      float $$8 = ddf.a($$6.e());
      float $$9 = ddf.a($$6.b());
      float $$10 = ddf.a($$6.c());
      float $$11 = ddf.a($$6.g());
      double $$12 = (double)dya.a($$11);
      ddm $$13 = new ddm();
      $$0.add(
         "Biome builder PV: "
            + ddm.a($$12)
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
