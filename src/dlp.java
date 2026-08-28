import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class dlp extends dlg {
   private static final MapCodec<jg<dlc>> d = dlc.c.fieldOf("biome");
   public static final MapCodec<dll.c<jg<dlc>>> b = dll.c.a(d).fieldOf("biomes");
   private static final MapCodec<jg<dlq>> e = dlq.b.fieldOf("preset").withLifecycle(Lifecycle.stable());
   public static final MapCodec<dlp> c = Codec.mapEither(b, e).xmap(dlp::new, $$0 -> $$0.f);
   private final Either<dll.c<jg<dlc>>, jg<dlq>> f;

   private dlp(Either<dll.c<jg<dlc>>, jg<dlq>> $$0) {
      this.f = $$0;
   }

   public static dlp a(dll.c<jg<dlc>> $$0) {
      return new dlp(Either.left($$0));
   }

   public static dlp a(jg<dlq> $$0) {
      return new dlp(Either.right($$0));
   }

   private dll.c<jg<dlc>> d() {
      return (dll.c<jg<dlc>>)this.f.map($$0 -> $$0, $$0 -> ((dlq)$$0.a()).a());
   }

   @Override
   protected Stream<jg<dlc>> b() {
      return this.d().a().stream().map(Pair::getSecond);
   }

   @Override
   protected MapCodec<? extends dlg> a() {
      return c;
   }

   public boolean a(alj<dlq> $$0) {
      Optional<jg<dlq>> $$1 = this.f.right();
      return $$1.isPresent() && $$1.get().a($$0);
   }

   @Override
   public jg<dlc> getNoiseBiome(int $$0, int $$1, int $$2, dll.f $$3) {
      return this.a($$3.a($$0, $$1, $$2));
   }

   @baz
   public jg<dlc> a(dll.h $$0) {
      return this.d().a($$0);
   }

   @Override
   public void a(List<String> $$0, iw $$1, dll.f $$2) {
      int $$3 = jr.a($$1.u());
      int $$4 = jr.a($$1.v());
      int $$5 = jr.a($$1.w());
      dll.h $$6 = $$2.a($$3, $$4, $$5);
      float $$7 = dll.a($$6.d());
      float $$8 = dll.a($$6.e());
      float $$9 = dll.a($$6.b());
      float $$10 = dll.a($$6.c());
      float $$11 = dll.a($$6.g());
      double $$12 = (double)ehm.a($$11);
      dls $$13 = new dls();
      $$0.add(
         "Biome builder PV: "
            + dls.a($$12)
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
