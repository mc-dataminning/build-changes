import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class ddt extends ddk {
   private static final MapCodec<jj<ddg>> d = ddg.c.fieldOf("biome");
   public static final MapCodec<ddp.c<jj<ddg>>> b = ddp.c.a(d).fieldOf("biomes");
   private static final MapCodec<jj<ddu>> e = ddu.b.fieldOf("preset").withLifecycle(Lifecycle.stable());
   public static final MapCodec<ddt> c = Codec.mapEither(b, e).xmap(ddt::new, $$0 -> $$0.f);
   private final Either<ddp.c<jj<ddg>>, jj<ddu>> f;

   private ddt(Either<ddp.c<jj<ddg>>, jj<ddu>> $$0) {
      this.f = $$0;
   }

   public static ddt a(ddp.c<jj<ddg>> $$0) {
      return new ddt(Either.left($$0));
   }

   public static ddt a(jj<ddu> $$0) {
      return new ddt(Either.right($$0));
   }

   private ddp.c<jj<ddg>> d() {
      return (ddp.c<jj<ddg>>)this.f.map($$0 -> $$0, $$0 -> ((ddu)$$0.a()).a());
   }

   @Override
   protected Stream<jj<ddg>> b() {
      return this.d().a().stream().map(Pair::getSecond);
   }

   @Override
   protected MapCodec<? extends ddk> a() {
      return c;
   }

   public boolean a(akj<ddu> $$0) {
      Optional<jj<ddu>> $$1 = this.f.right();
      return $$1.isPresent() && $$1.get().a($$0);
   }

   @Override
   public jj<ddg> getNoiseBiome(int $$0, int $$1, int $$2, ddp.f $$3) {
      return this.a($$3.a($$0, $$1, $$2));
   }

   @azl
   public jj<ddg> a(ddp.h $$0) {
      return this.d().a($$0);
   }

   @Override
   public void a(List<String> $$0, ja $$1, ddp.f $$2) {
      int $$3 = ju.a($$1.u());
      int $$4 = ju.a($$1.v());
      int $$5 = ju.a($$1.w());
      ddp.h $$6 = $$2.a($$3, $$4, $$5);
      float $$7 = ddp.a($$6.d());
      float $$8 = ddp.a($$6.e());
      float $$9 = ddp.a($$6.b());
      float $$10 = ddp.a($$6.c());
      float $$11 = ddp.a($$6.g());
      double $$12 = (double)dyn.a($$11);
      ddw $$13 = new ddw();
      $$0.add(
         "Biome builder PV: "
            + ddw.a($$12)
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
