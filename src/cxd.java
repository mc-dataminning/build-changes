import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class cxd extends cwu {
   private static final MapCodec<ij<cwq>> d = cwq.c.fieldOf("biome");
   public static final MapCodec<cwz.c<ij<cwq>>> b = cwz.c.a(d).fieldOf("biomes");
   private static final MapCodec<ij<cxe>> e = cxe.b.fieldOf("preset").withLifecycle(Lifecycle.stable());
   public static final Codec<cxd> c = Codec.mapEither(b, e).xmap(cxd::new, $$0 -> $$0.f).codec();
   private final Either<cwz.c<ij<cwq>>, ij<cxe>> f;

   private cxd(Either<cwz.c<ij<cwq>>, ij<cxe>> $$0) {
      this.f = $$0;
   }

   public static cxd a(cwz.c<ij<cwq>> $$0) {
      return new cxd(Either.left($$0));
   }

   public static cxd a(ij<cxe> $$0) {
      return new cxd(Either.right($$0));
   }

   private cwz.c<ij<cwq>> d() {
      return (cwz.c<ij<cwq>>)this.f.map($$0 -> $$0, $$0 -> ((cxe)$$0.a()).a());
   }

   @Override
   protected Stream<ij<cwq>> b() {
      return this.d().a().stream().map(Pair::getSecond);
   }

   @Override
   protected Codec<? extends cwu> a() {
      return c;
   }

   public boolean a(aix<cxe> $$0) {
      Optional<ij<cxe>> $$1 = this.f.right();
      return $$1.isPresent() && $$1.get().a($$0);
   }

   @Override
   public ij<cwq> getNoiseBiome(int $$0, int $$1, int $$2, cwz.f $$3) {
      return this.a($$3.a($$0, $$1, $$2));
   }

   @axl
   public ij<cwq> a(cwz.h $$0) {
      return this.d().a($$0);
   }

   @Override
   public void a(List<String> $$0, hz $$1, cwz.f $$2) {
      int $$3 = iu.a($$1.u());
      int $$4 = iu.a($$1.v());
      int $$5 = iu.a($$1.w());
      cwz.h $$6 = $$2.a($$3, $$4, $$5);
      float $$7 = cwz.a($$6.d());
      float $$8 = cwz.a($$6.e());
      float $$9 = cwz.a($$6.b());
      float $$10 = cwz.a($$6.c());
      float $$11 = cwz.a($$6.g());
      double $$12 = (double)drc.a($$11);
      cxg $$13 = new cxg();
      $$0.add(
         "Biome builder PV: "
            + cxg.a($$12)
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
