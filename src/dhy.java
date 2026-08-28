import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class dhy extends dhp {
   private static final MapCodec<jr<dhl>> d = dhl.c.fieldOf("biome");
   public static final MapCodec<dhu.c<jr<dhl>>> b = dhu.c.a(d).fieldOf("biomes");
   private static final MapCodec<jr<dhz>> e = dhz.b.fieldOf("preset").withLifecycle(Lifecycle.stable());
   public static final MapCodec<dhy> c = Codec.mapEither(b, e).xmap(dhy::new, $$0 -> $$0.f);
   private final Either<dhu.c<jr<dhl>>, jr<dhz>> f;

   private dhy(Either<dhu.c<jr<dhl>>, jr<dhz>> $$0) {
      this.f = $$0;
   }

   public static dhy a(dhu.c<jr<dhl>> $$0) {
      return new dhy(Either.left($$0));
   }

   public static dhy a(jr<dhz> $$0) {
      return new dhy(Either.right($$0));
   }

   private dhu.c<jr<dhl>> d() {
      return (dhu.c<jr<dhl>>)this.f.map($$0 -> $$0, $$0 -> ((dhz)$$0.a()).a());
   }

   @Override
   protected Stream<jr<dhl>> b() {
      return this.d().a().stream().map(Pair::getSecond);
   }

   @Override
   protected MapCodec<? extends dhp> a() {
      return c;
   }

   public boolean a(aku<dhz> $$0) {
      Optional<jr<dhz>> $$1 = this.f.right();
      return $$1.isPresent() && $$1.get().a($$0);
   }

   @Override
   public jr<dhl> getNoiseBiome(int $$0, int $$1, int $$2, dhu.f $$3) {
      return this.a($$3.a($$0, $$1, $$2));
   }

   @bag
   public jr<dhl> a(dhu.h $$0) {
      return this.d().a($$0);
   }

   @Override
   public void a(List<String> $$0, ji $$1, dhu.f $$2) {
      int $$3 = kc.a($$1.u());
      int $$4 = kc.a($$1.v());
      int $$5 = kc.a($$1.w());
      dhu.h $$6 = $$2.a($$3, $$4, $$5);
      float $$7 = dhu.a($$6.d());
      float $$8 = dhu.a($$6.e());
      float $$9 = dhu.a($$6.b());
      float $$10 = dhu.a($$6.c());
      float $$11 = dhu.a($$6.g());
      double $$12 = (double)eda.a($$11);
      dib $$13 = new dib();
      $$0.add(
         "Biome builder PV: "
            + dib.a($$12)
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
