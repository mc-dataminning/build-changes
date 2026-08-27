import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class cva extends cur {
   private static final MapCodec<ih<cun>> d = cun.c.fieldOf("biome");
   public static final MapCodec<cuw.c<ih<cun>>> b = cuw.c.a(d).fieldOf("biomes");
   private static final MapCodec<ih<cvb>> e = cvb.b.fieldOf("preset").withLifecycle(Lifecycle.stable());
   public static final Codec<cva> c = Codec.mapEither(b, e).xmap(cva::new, $$0 -> $$0.f).codec();
   private final Either<cuw.c<ih<cun>>, ih<cvb>> f;

   private cva(Either<cuw.c<ih<cun>>, ih<cvb>> $$0) {
      this.f = $$0;
   }

   public static cva a(cuw.c<ih<cun>> $$0) {
      return new cva(Either.left($$0));
   }

   public static cva a(ih<cvb> $$0) {
      return new cva(Either.right($$0));
   }

   private cuw.c<ih<cun>> d() {
      return (cuw.c<ih<cun>>)this.f.map($$0 -> $$0, $$0 -> ((cvb)$$0.a()).a());
   }

   @Override
   protected Stream<ih<cun>> b() {
      return this.d().a().stream().map(Pair::getSecond);
   }

   @Override
   protected Codec<? extends cur> a() {
      return c;
   }

   public boolean a(ahf<cvb> $$0) {
      Optional<ih<cvb>> $$1 = this.f.right();
      return $$1.isPresent() && $$1.get().a($$0);
   }

   @Override
   public ih<cun> getNoiseBiome(int $$0, int $$1, int $$2, cuw.f $$3) {
      return this.a($$3.a($$0, $$1, $$2));
   }

   @avs
   public ih<cun> a(cuw.h $$0) {
      return this.d().a($$0);
   }

   @Override
   public void a(List<String> $$0, hx $$1, cuw.f $$2) {
      int $$3 = is.a($$1.u());
      int $$4 = is.a($$1.v());
      int $$5 = is.a($$1.w());
      cuw.h $$6 = $$2.a($$3, $$4, $$5);
      float $$7 = cuw.a($$6.d());
      float $$8 = cuw.a($$6.e());
      float $$9 = cuw.a($$6.b());
      float $$10 = cuw.a($$6.c());
      float $$11 = cuw.a($$6.g());
      double $$12 = (double)dow.a($$11);
      cvd $$13 = new cvd();
      $$0.add(
         "Biome builder PV: "
            + cvd.a($$12)
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
