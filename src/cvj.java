import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class cvj extends cva {
   private static final MapCodec<ih<cuw>> d = cuw.c.fieldOf("biome");
   public static final MapCodec<cvf.c<ih<cuw>>> b = cvf.c.a(d).fieldOf("biomes");
   private static final MapCodec<ih<cvk>> e = cvk.b.fieldOf("preset").withLifecycle(Lifecycle.stable());
   public static final Codec<cvj> c = Codec.mapEither(b, e).xmap(cvj::new, $$0 -> $$0.f).codec();
   private final Either<cvf.c<ih<cuw>>, ih<cvk>> f;

   private cvj(Either<cvf.c<ih<cuw>>, ih<cvk>> $$0) {
      this.f = $$0;
   }

   public static cvj a(cvf.c<ih<cuw>> $$0) {
      return new cvj(Either.left($$0));
   }

   public static cvj a(ih<cvk> $$0) {
      return new cvj(Either.right($$0));
   }

   private cvf.c<ih<cuw>> d() {
      return (cvf.c<ih<cuw>>)this.f.map($$0 -> $$0, $$0 -> ((cvk)$$0.a()).a());
   }

   @Override
   protected Stream<ih<cuw>> b() {
      return this.d().a().stream().map(Pair::getSecond);
   }

   @Override
   protected Codec<? extends cva> a() {
      return c;
   }

   public boolean a(ahg<cvk> $$0) {
      Optional<ih<cvk>> $$1 = this.f.right();
      return $$1.isPresent() && $$1.get().a($$0);
   }

   @Override
   public ih<cuw> getNoiseBiome(int $$0, int $$1, int $$2, cvf.f $$3) {
      return this.a($$3.a($$0, $$1, $$2));
   }

   @avu
   public ih<cuw> a(cvf.h $$0) {
      return this.d().a($$0);
   }

   @Override
   public void a(List<String> $$0, hx $$1, cvf.f $$2) {
      int $$3 = is.a($$1.u());
      int $$4 = is.a($$1.v());
      int $$5 = is.a($$1.w());
      cvf.h $$6 = $$2.a($$3, $$4, $$5);
      float $$7 = cvf.a($$6.d());
      float $$8 = cvf.a($$6.e());
      float $$9 = cvf.a($$6.b());
      float $$10 = cvf.a($$6.c());
      float $$11 = cvf.a($$6.g());
      double $$12 = (double)dpf.a($$11);
      cvm $$13 = new cvm();
      $$0.add(
         "Biome builder PV: "
            + cvm.a($$12)
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
