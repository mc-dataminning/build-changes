import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class dhx extends dho {
   private static final MapCodec<jr<dhk>> d = dhk.c.fieldOf("biome");
   public static final MapCodec<dht.c<jr<dhk>>> b = dht.c.a(d).fieldOf("biomes");
   private static final MapCodec<jr<dhy>> e = dhy.b.fieldOf("preset").withLifecycle(Lifecycle.stable());
   public static final MapCodec<dhx> c = Codec.mapEither(b, e).xmap(dhx::new, $$0 -> $$0.f);
   private final Either<dht.c<jr<dhk>>, jr<dhy>> f;

   private dhx(Either<dht.c<jr<dhk>>, jr<dhy>> $$0) {
      this.f = $$0;
   }

   public static dhx a(dht.c<jr<dhk>> $$0) {
      return new dhx(Either.left($$0));
   }

   public static dhx a(jr<dhy> $$0) {
      return new dhx(Either.right($$0));
   }

   private dht.c<jr<dhk>> d() {
      return (dht.c<jr<dhk>>)this.f.map($$0 -> $$0, $$0 -> ((dhy)$$0.a()).a());
   }

   @Override
   protected Stream<jr<dhk>> b() {
      return this.d().a().stream().map(Pair::getSecond);
   }

   @Override
   protected MapCodec<? extends dho> a() {
      return c;
   }

   public boolean a(aku<dhy> $$0) {
      Optional<jr<dhy>> $$1 = this.f.right();
      return $$1.isPresent() && $$1.get().a($$0);
   }

   @Override
   public jr<dhk> getNoiseBiome(int $$0, int $$1, int $$2, dht.f $$3) {
      return this.a($$3.a($$0, $$1, $$2));
   }

   @bag
   public jr<dhk> a(dht.h $$0) {
      return this.d().a($$0);
   }

   @Override
   public void a(List<String> $$0, ji $$1, dht.f $$2) {
      int $$3 = kc.a($$1.u());
      int $$4 = kc.a($$1.v());
      int $$5 = kc.a($$1.w());
      dht.h $$6 = $$2.a($$3, $$4, $$5);
      float $$7 = dht.a($$6.d());
      float $$8 = dht.a($$6.e());
      float $$9 = dht.a($$6.b());
      float $$10 = dht.a($$6.c());
      float $$11 = dht.a($$6.g());
      double $$12 = (double)ecz.a($$11);
      dia $$13 = new dia();
      $$0.add(
         "Biome builder PV: "
            + dia.a($$12)
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
