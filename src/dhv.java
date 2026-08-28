import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class dhv extends dhm {
   private static final MapCodec<jr<dhi>> d = dhi.c.fieldOf("biome");
   public static final MapCodec<dhr.c<jr<dhi>>> b = dhr.c.a(d).fieldOf("biomes");
   private static final MapCodec<jr<dhw>> e = dhw.b.fieldOf("preset").withLifecycle(Lifecycle.stable());
   public static final MapCodec<dhv> c = Codec.mapEither(b, e).xmap(dhv::new, $$0 -> $$0.f);
   private final Either<dhr.c<jr<dhi>>, jr<dhw>> f;

   private dhv(Either<dhr.c<jr<dhi>>, jr<dhw>> $$0) {
      this.f = $$0;
   }

   public static dhv a(dhr.c<jr<dhi>> $$0) {
      return new dhv(Either.left($$0));
   }

   public static dhv a(jr<dhw> $$0) {
      return new dhv(Either.right($$0));
   }

   private dhr.c<jr<dhi>> d() {
      return (dhr.c<jr<dhi>>)this.f.map($$0 -> $$0, $$0 -> ((dhw)$$0.a()).a());
   }

   @Override
   protected Stream<jr<dhi>> b() {
      return this.d().a().stream().map(Pair::getSecond);
   }

   @Override
   protected MapCodec<? extends dhm> a() {
      return c;
   }

   public boolean a(akt<dhw> $$0) {
      Optional<jr<dhw>> $$1 = this.f.right();
      return $$1.isPresent() && $$1.get().a($$0);
   }

   @Override
   public jr<dhi> getNoiseBiome(int $$0, int $$1, int $$2, dhr.f $$3) {
      return this.a($$3.a($$0, $$1, $$2));
   }

   @baf
   public jr<dhi> a(dhr.h $$0) {
      return this.d().a($$0);
   }

   @Override
   public void a(List<String> $$0, ji $$1, dhr.f $$2) {
      int $$3 = kc.a($$1.u());
      int $$4 = kc.a($$1.v());
      int $$5 = kc.a($$1.w());
      dhr.h $$6 = $$2.a($$3, $$4, $$5);
      float $$7 = dhr.a($$6.d());
      float $$8 = dhr.a($$6.e());
      float $$9 = dhr.a($$6.b());
      float $$10 = dhr.a($$6.c());
      float $$11 = dhr.a($$6.g());
      double $$12 = (double)ecx.a($$11);
      dhy $$13 = new dhy();
      $$0.add(
         "Biome builder PV: "
            + dhy.a($$12)
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
