import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class dgp extends dgg {
   private static final MapCodec<jq<dgc>> d = dgc.c.fieldOf("biome");
   public static final MapCodec<dgl.c<jq<dgc>>> b = dgl.c.a(d).fieldOf("biomes");
   private static final MapCodec<jq<dgq>> e = dgq.b.fieldOf("preset").withLifecycle(Lifecycle.stable());
   public static final MapCodec<dgp> c = Codec.mapEither(b, e).xmap(dgp::new, $$0 -> $$0.f);
   private final Either<dgl.c<jq<dgc>>, jq<dgq>> f;

   private dgp(Either<dgl.c<jq<dgc>>, jq<dgq>> $$0) {
      this.f = $$0;
   }

   public static dgp a(dgl.c<jq<dgc>> $$0) {
      return new dgp(Either.left($$0));
   }

   public static dgp a(jq<dgq> $$0) {
      return new dgp(Either.right($$0));
   }

   private dgl.c<jq<dgc>> d() {
      return (dgl.c<jq<dgc>>)this.f.map($$0 -> $$0, $$0 -> ((dgq)$$0.a()).a());
   }

   @Override
   protected Stream<jq<dgc>> b() {
      return this.d().a().stream().map(Pair::getSecond);
   }

   @Override
   protected MapCodec<? extends dgg> a() {
      return c;
   }

   public boolean a(alh<dgq> $$0) {
      Optional<jq<dgq>> $$1 = this.f.right();
      return $$1.isPresent() && $$1.get().a($$0);
   }

   @Override
   public jq<dgc> getNoiseBiome(int $$0, int $$1, int $$2, dgl.f $$3) {
      return this.a($$3.a($$0, $$1, $$2));
   }

   @baq
   public jq<dgc> a(dgl.h $$0) {
      return this.d().a($$0);
   }

   @Override
   public void a(List<String> $$0, jh $$1, dgl.f $$2) {
      int $$3 = kb.a($$1.u());
      int $$4 = kb.a($$1.v());
      int $$5 = kb.a($$1.w());
      dgl.h $$6 = $$2.a($$3, $$4, $$5);
      float $$7 = dgl.a($$6.d());
      float $$8 = dgl.a($$6.e());
      float $$9 = dgl.a($$6.b());
      float $$10 = dgl.a($$6.c());
      float $$11 = dgl.a($$6.g());
      double $$12 = (double)ebm.a($$11);
      dgs $$13 = new dgs();
      $$0.add(
         "Biome builder PV: "
            + dgs.a($$12)
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
