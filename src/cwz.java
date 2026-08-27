import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class cwz extends cwq {
   private static final MapCodec<ij<cwm>> d = cwm.c.fieldOf("biome");
   public static final MapCodec<cwv.c<ij<cwm>>> b = cwv.c.a(d).fieldOf("biomes");
   private static final MapCodec<ij<cxa>> e = cxa.b.fieldOf("preset").withLifecycle(Lifecycle.stable());
   public static final Codec<cwz> c = Codec.mapEither(b, e).xmap(cwz::new, $$0 -> $$0.f).codec();
   private final Either<cwv.c<ij<cwm>>, ij<cxa>> f;

   private cwz(Either<cwv.c<ij<cwm>>, ij<cxa>> $$0) {
      this.f = $$0;
   }

   public static cwz a(cwv.c<ij<cwm>> $$0) {
      return new cwz(Either.left($$0));
   }

   public static cwz a(ij<cxa> $$0) {
      return new cwz(Either.right($$0));
   }

   private cwv.c<ij<cwm>> d() {
      return (cwv.c<ij<cwm>>)this.f.map($$0 -> $$0, $$0 -> ((cxa)$$0.a()).a());
   }

   @Override
   protected Stream<ij<cwm>> b() {
      return this.d().a().stream().map(Pair::getSecond);
   }

   @Override
   protected Codec<? extends cwq> a() {
      return c;
   }

   public boolean a(aix<cxa> $$0) {
      Optional<ij<cxa>> $$1 = this.f.right();
      return $$1.isPresent() && $$1.get().a($$0);
   }

   @Override
   public ij<cwm> getNoiseBiome(int $$0, int $$1, int $$2, cwv.f $$3) {
      return this.a($$3.a($$0, $$1, $$2));
   }

   @axl
   public ij<cwm> a(cwv.h $$0) {
      return this.d().a($$0);
   }

   @Override
   public void a(List<String> $$0, hz $$1, cwv.f $$2) {
      int $$3 = iu.a($$1.u());
      int $$4 = iu.a($$1.v());
      int $$5 = iu.a($$1.w());
      cwv.h $$6 = $$2.a($$3, $$4, $$5);
      float $$7 = cwv.a($$6.d());
      float $$8 = cwv.a($$6.e());
      float $$9 = cwv.a($$6.b());
      float $$10 = cwv.a($$6.c());
      float $$11 = cwv.a($$6.g());
      double $$12 = (double)dqv.a($$11);
      cxc $$13 = new cxc();
      $$0.add(
         "Biome builder PV: "
            + cxc.a($$12)
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
