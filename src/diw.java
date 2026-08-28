import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class diw extends din {
   private static final MapCodec<jq<dij>> d = dij.c.fieldOf("biome");
   public static final MapCodec<dis.c<jq<dij>>> b = dis.c.a(d).fieldOf("biomes");
   private static final MapCodec<jq<dix>> e = dix.b.fieldOf("preset").withLifecycle(Lifecycle.stable());
   public static final MapCodec<diw> c = Codec.mapEither(b, e).xmap(diw::new, $$0 -> $$0.f);
   private final Either<dis.c<jq<dij>>, jq<dix>> f;

   private diw(Either<dis.c<jq<dij>>, jq<dix>> $$0) {
      this.f = $$0;
   }

   public static diw a(dis.c<jq<dij>> $$0) {
      return new diw(Either.left($$0));
   }

   public static diw a(jq<dix> $$0) {
      return new diw(Either.right($$0));
   }

   private dis.c<jq<dij>> d() {
      return (dis.c<jq<dij>>)this.f.map($$0 -> $$0, $$0 -> ((dix)$$0.a()).a());
   }

   @Override
   protected Stream<jq<dij>> b() {
      return this.d().a().stream().map(Pair::getSecond);
   }

   @Override
   protected MapCodec<? extends din> a() {
      return c;
   }

   public boolean a(aly<dix> $$0) {
      Optional<jq<dix>> $$1 = this.f.right();
      return $$1.isPresent() && $$1.get().a($$0);
   }

   @Override
   public jq<dij> getNoiseBiome(int $$0, int $$1, int $$2, dis.f $$3) {
      return this.a($$3.a($$0, $$1, $$2));
   }

   @bbl
   public jq<dij> a(dis.h $$0) {
      return this.d().a($$0);
   }

   @Override
   public void a(List<String> $$0, jh $$1, dis.f $$2) {
      int $$3 = kb.a($$1.u());
      int $$4 = kb.a($$1.v());
      int $$5 = kb.a($$1.w());
      dis.h $$6 = $$2.a($$3, $$4, $$5);
      float $$7 = dis.a($$6.d());
      float $$8 = dis.a($$6.e());
      float $$9 = dis.a($$6.b());
      float $$10 = dis.a($$6.c());
      float $$11 = dis.a($$6.g());
      double $$12 = (double)edw.a($$11);
      diz $$13 = new diz();
      $$0.add(
         "Biome builder PV: "
            + diz.a($$12)
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
