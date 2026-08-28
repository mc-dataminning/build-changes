import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class dgu extends dgl {
   private static final MapCodec<jq<dgh>> d = dgh.c.fieldOf("biome");
   public static final MapCodec<dgq.c<jq<dgh>>> b = dgq.c.a(d).fieldOf("biomes");
   private static final MapCodec<jq<dgv>> e = dgv.b.fieldOf("preset").withLifecycle(Lifecycle.stable());
   public static final MapCodec<dgu> c = Codec.mapEither(b, e).xmap(dgu::new, $$0 -> $$0.f);
   private final Either<dgq.c<jq<dgh>>, jq<dgv>> f;

   private dgu(Either<dgq.c<jq<dgh>>, jq<dgv>> $$0) {
      this.f = $$0;
   }

   public static dgu a(dgq.c<jq<dgh>> $$0) {
      return new dgu(Either.left($$0));
   }

   public static dgu a(jq<dgv> $$0) {
      return new dgu(Either.right($$0));
   }

   private dgq.c<jq<dgh>> d() {
      return (dgq.c<jq<dgh>>)this.f.map($$0 -> $$0, $$0 -> ((dgv)$$0.a()).a());
   }

   @Override
   protected Stream<jq<dgh>> b() {
      return this.d().a().stream().map(Pair::getSecond);
   }

   @Override
   protected MapCodec<? extends dgl> a() {
      return c;
   }

   public boolean a(alk<dgv> $$0) {
      Optional<jq<dgv>> $$1 = this.f.right();
      return $$1.isPresent() && $$1.get().a($$0);
   }

   @Override
   public jq<dgh> getNoiseBiome(int $$0, int $$1, int $$2, dgq.f $$3) {
      return this.a($$3.a($$0, $$1, $$2));
   }

   @bau
   public jq<dgh> a(dgq.h $$0) {
      return this.d().a($$0);
   }

   @Override
   public void a(List<String> $$0, jh $$1, dgq.f $$2) {
      int $$3 = kb.a($$1.u());
      int $$4 = kb.a($$1.v());
      int $$5 = kb.a($$1.w());
      dgq.h $$6 = $$2.a($$3, $$4, $$5);
      float $$7 = dgq.a($$6.d());
      float $$8 = dgq.a($$6.e());
      float $$9 = dgq.a($$6.b());
      float $$10 = dgq.a($$6.c());
      float $$11 = dgq.a($$6.g());
      double $$12 = (double)ebq.a($$11);
      dgx $$13 = new dgx();
      $$0.add(
         "Biome builder PV: "
            + dgx.a($$12)
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
