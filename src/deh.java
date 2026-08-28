import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class deh extends ddy {
   private static final MapCodec<jm<ddu>> d = ddu.c.fieldOf("biome");
   public static final MapCodec<ded.c<jm<ddu>>> b = ded.c.a(d).fieldOf("biomes");
   private static final MapCodec<jm<dei>> e = dei.b.fieldOf("preset").withLifecycle(Lifecycle.stable());
   public static final MapCodec<deh> c = Codec.mapEither(b, e).xmap(deh::new, $$0 -> $$0.f);
   private final Either<ded.c<jm<ddu>>, jm<dei>> f;

   private deh(Either<ded.c<jm<ddu>>, jm<dei>> $$0) {
      this.f = $$0;
   }

   public static deh a(ded.c<jm<ddu>> $$0) {
      return new deh(Either.left($$0));
   }

   public static deh a(jm<dei> $$0) {
      return new deh(Either.right($$0));
   }

   private ded.c<jm<ddu>> d() {
      return (ded.c<jm<ddu>>)this.f.map($$0 -> $$0, $$0 -> ((dei)$$0.a()).a());
   }

   @Override
   protected Stream<jm<ddu>> b() {
      return this.d().a().stream().map(Pair::getSecond);
   }

   @Override
   protected MapCodec<? extends ddy> a() {
      return c;
   }

   public boolean a(akp<dei> $$0) {
      Optional<jm<dei>> $$1 = this.f.right();
      return $$1.isPresent() && $$1.get().a($$0);
   }

   @Override
   public jm<ddu> getNoiseBiome(int $$0, int $$1, int $$2, ded.f $$3) {
      return this.a($$3.a($$0, $$1, $$2));
   }

   @azs
   public jm<ddu> a(ded.h $$0) {
      return this.d().a($$0);
   }

   @Override
   public void a(List<String> $$0, jd $$1, ded.f $$2) {
      int $$3 = jx.a($$1.u());
      int $$4 = jx.a($$1.v());
      int $$5 = jx.a($$1.w());
      ded.h $$6 = $$2.a($$3, $$4, $$5);
      float $$7 = ded.a($$6.d());
      float $$8 = ded.a($$6.e());
      float $$9 = ded.a($$6.b());
      float $$10 = ded.a($$6.c());
      float $$11 = ded.a($$6.g());
      double $$12 = (double)dzc.a($$11);
      dek $$13 = new dek();
      $$0.add(
         "Biome builder PV: "
            + dek.a($$12)
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
