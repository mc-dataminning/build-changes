import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class dio extends dif {
   private static final MapCodec<jq<dib>> d = dib.c.fieldOf("biome");
   public static final MapCodec<dik.c<jq<dib>>> b = dik.c.a(d).fieldOf("biomes");
   private static final MapCodec<jq<dip>> e = dip.b.fieldOf("preset").withLifecycle(Lifecycle.stable());
   public static final MapCodec<dio> c = Codec.mapEither(b, e).xmap(dio::new, $$0 -> $$0.f);
   private final Either<dik.c<jq<dib>>, jq<dip>> f;

   private dio(Either<dik.c<jq<dib>>, jq<dip>> $$0) {
      this.f = $$0;
   }

   public static dio a(dik.c<jq<dib>> $$0) {
      return new dio(Either.left($$0));
   }

   public static dio a(jq<dip> $$0) {
      return new dio(Either.right($$0));
   }

   private dik.c<jq<dib>> d() {
      return (dik.c<jq<dib>>)this.f.map($$0 -> $$0, $$0 -> ((dip)$$0.a()).a());
   }

   @Override
   protected Stream<jq<dib>> b() {
      return this.d().a().stream().map(Pair::getSecond);
   }

   @Override
   protected MapCodec<? extends dif> a() {
      return c;
   }

   public boolean a(alo<dip> $$0) {
      Optional<jq<dip>> $$1 = this.f.right();
      return $$1.isPresent() && $$1.get().a($$0);
   }

   @Override
   public jq<dib> getNoiseBiome(int $$0, int $$1, int $$2, dik.f $$3) {
      return this.a($$3.a($$0, $$1, $$2));
   }

   @bbb
   public jq<dib> a(dik.h $$0) {
      return this.d().a($$0);
   }

   @Override
   public void a(List<String> $$0, jh $$1, dik.f $$2) {
      int $$3 = kb.a($$1.u());
      int $$4 = kb.a($$1.v());
      int $$5 = kb.a($$1.w());
      dik.h $$6 = $$2.a($$3, $$4, $$5);
      float $$7 = dik.a($$6.d());
      float $$8 = dik.a($$6.e());
      float $$9 = dik.a($$6.b());
      float $$10 = dik.a($$6.c());
      float $$11 = dik.a($$6.g());
      double $$12 = (double)edq.a($$11);
      dir $$13 = new dir();
      $$0.add(
         "Biome builder PV: "
            + dir.a($$12)
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
