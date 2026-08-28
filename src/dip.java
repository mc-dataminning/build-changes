import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class dip extends dig {
   private static final MapCodec<jr<dic>> d = dic.c.fieldOf("biome");
   public static final MapCodec<dil.c<jr<dic>>> b = dil.c.a(d).fieldOf("biomes");
   private static final MapCodec<jr<diq>> e = diq.b.fieldOf("preset").withLifecycle(Lifecycle.stable());
   public static final MapCodec<dip> c = Codec.mapEither(b, e).xmap(dip::new, $$0 -> $$0.f);
   private final Either<dil.c<jr<dic>>, jr<diq>> f;

   private dip(Either<dil.c<jr<dic>>, jr<diq>> $$0) {
      this.f = $$0;
   }

   public static dip a(dil.c<jr<dic>> $$0) {
      return new dip(Either.left($$0));
   }

   public static dip a(jr<diq> $$0) {
      return new dip(Either.right($$0));
   }

   private dil.c<jr<dic>> d() {
      return (dil.c<jr<dic>>)this.f.map($$0 -> $$0, $$0 -> ((diq)$$0.a()).a());
   }

   @Override
   protected Stream<jr<dic>> b() {
      return this.d().a().stream().map(Pair::getSecond);
   }

   @Override
   protected MapCodec<? extends dig> a() {
      return c;
   }

   public boolean a(akt<diq> $$0) {
      Optional<jr<diq>> $$1 = this.f.right();
      return $$1.isPresent() && $$1.get().a($$0);
   }

   @Override
   public jr<dic> getNoiseBiome(int $$0, int $$1, int $$2, dil.f $$3) {
      return this.a($$3.a($$0, $$1, $$2));
   }

   @bag
   public jr<dic> a(dil.h $$0) {
      return this.d().a($$0);
   }

   @Override
   public void a(List<String> $$0, ji $$1, dil.f $$2) {
      int $$3 = kc.a($$1.u());
      int $$4 = kc.a($$1.v());
      int $$5 = kc.a($$1.w());
      dil.h $$6 = $$2.a($$3, $$4, $$5);
      float $$7 = dil.a($$6.d());
      float $$8 = dil.a($$6.e());
      float $$9 = dil.a($$6.b());
      float $$10 = dil.a($$6.c());
      float $$11 = dil.a($$6.g());
      double $$12 = (double)edv.a($$11);
      dis $$13 = new dis();
      $$0.add(
         "Biome builder PV: "
            + dis.a($$12)
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
