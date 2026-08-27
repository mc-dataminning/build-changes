import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class cyl extends cyc {
   private static final MapCodec<il<cxy>> d = cxy.c.fieldOf("biome");
   public static final MapCodec<cyh.c<il<cxy>>> b = cyh.c.a(d).fieldOf("biomes");
   private static final MapCodec<il<cym>> e = cym.b.fieldOf("preset").withLifecycle(Lifecycle.stable());
   public static final Codec<cyl> c = Codec.mapEither(b, e).xmap(cyl::new, $$0 -> $$0.f).codec();
   private final Either<cyh.c<il<cxy>>, il<cym>> f;

   private cyl(Either<cyh.c<il<cxy>>, il<cym>> $$0) {
      this.f = $$0;
   }

   public static cyl a(cyh.c<il<cxy>> $$0) {
      return new cyl(Either.left($$0));
   }

   public static cyl a(il<cym> $$0) {
      return new cyl(Either.right($$0));
   }

   private cyh.c<il<cxy>> d() {
      return (cyh.c<il<cxy>>)this.f.map($$0 -> $$0, $$0 -> ((cym)$$0.a()).a());
   }

   @Override
   protected Stream<il<cxy>> b() {
      return this.d().a().stream().map(Pair::getSecond);
   }

   @Override
   protected Codec<? extends cyc> a() {
      return c;
   }

   public boolean a(ajg<cym> $$0) {
      Optional<il<cym>> $$1 = this.f.right();
      return $$1.isPresent() && $$1.get().a($$0);
   }

   @Override
   public il<cxy> getNoiseBiome(int $$0, int $$1, int $$2, cyh.f $$3) {
      return this.a($$3.a($$0, $$1, $$2));
   }

   @axz
   public il<cxy> a(cyh.h $$0) {
      return this.d().a($$0);
   }

   @Override
   public void a(List<String> $$0, ib $$1, cyh.f $$2) {
      int $$3 = iw.a($$1.u());
      int $$4 = iw.a($$1.v());
      int $$5 = iw.a($$1.w());
      cyh.h $$6 = $$2.a($$3, $$4, $$5);
      float $$7 = cyh.a($$6.d());
      float $$8 = cyh.a($$6.e());
      float $$9 = cyh.a($$6.b());
      float $$10 = cyh.a($$6.c());
      float $$11 = cyh.a($$6.g());
      double $$12 = (double)dst.a($$11);
      cyo $$13 = new cyo();
      $$0.add(
         "Biome builder PV: "
            + cyo.a($$12)
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
