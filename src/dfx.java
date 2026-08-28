import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class dfx extends dfo {
   private static final MapCodec<jo<dfk>> d = dfk.c.fieldOf("biome");
   public static final MapCodec<dft.c<jo<dfk>>> b = dft.c.a(d).fieldOf("biomes");
   private static final MapCodec<jo<dfy>> e = dfy.b.fieldOf("preset").withLifecycle(Lifecycle.stable());
   public static final MapCodec<dfx> c = Codec.mapEither(b, e).xmap(dfx::new, $$0 -> $$0.f);
   private final Either<dft.c<jo<dfk>>, jo<dfy>> f;

   private dfx(Either<dft.c<jo<dfk>>, jo<dfy>> $$0) {
      this.f = $$0;
   }

   public static dfx a(dft.c<jo<dfk>> $$0) {
      return new dfx(Either.left($$0));
   }

   public static dfx a(jo<dfy> $$0) {
      return new dfx(Either.right($$0));
   }

   private dft.c<jo<dfk>> d() {
      return (dft.c<jo<dfk>>)this.f.map($$0 -> $$0, $$0 -> ((dfy)$$0.a()).a());
   }

   @Override
   protected Stream<jo<dfk>> b() {
      return this.d().a().stream().map(Pair::getSecond);
   }

   @Override
   protected MapCodec<? extends dfo> a() {
      return c;
   }

   public boolean a(ald<dfy> $$0) {
      Optional<jo<dfy>> $$1 = this.f.right();
      return $$1.isPresent() && $$1.get().a($$0);
   }

   @Override
   public jo<dfk> getNoiseBiome(int $$0, int $$1, int $$2, dft.f $$3) {
      return this.a($$3.a($$0, $$1, $$2));
   }

   @bal
   public jo<dfk> a(dft.h $$0) {
      return this.d().a($$0);
   }

   @Override
   public void a(List<String> $$0, jf $$1, dft.f $$2) {
      int $$3 = jz.a($$1.u());
      int $$4 = jz.a($$1.v());
      int $$5 = jz.a($$1.w());
      dft.h $$6 = $$2.a($$3, $$4, $$5);
      float $$7 = dft.a($$6.d());
      float $$8 = dft.a($$6.e());
      float $$9 = dft.a($$6.b());
      float $$10 = dft.a($$6.c());
      float $$11 = dft.a($$6.g());
      double $$12 = (double)eav.a($$11);
      dga $$13 = new dga();
      $$0.add(
         "Biome builder PV: "
            + dga.a($$12)
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
