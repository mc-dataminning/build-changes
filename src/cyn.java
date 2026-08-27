import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class cyn extends cye {
   private static final MapCodec<il<cya>> d = cya.c.fieldOf("biome");
   public static final MapCodec<cyj.c<il<cya>>> b = cyj.c.a(d).fieldOf("biomes");
   private static final MapCodec<il<cyo>> e = cyo.b.fieldOf("preset").withLifecycle(Lifecycle.stable());
   public static final Codec<cyn> c = Codec.mapEither(b, e).xmap(cyn::new, $$0 -> $$0.f).codec();
   private final Either<cyj.c<il<cya>>, il<cyo>> f;

   private cyn(Either<cyj.c<il<cya>>, il<cyo>> $$0) {
      this.f = $$0;
   }

   public static cyn a(cyj.c<il<cya>> $$0) {
      return new cyn(Either.left($$0));
   }

   public static cyn a(il<cyo> $$0) {
      return new cyn(Either.right($$0));
   }

   private cyj.c<il<cya>> d() {
      return (cyj.c<il<cya>>)this.f.map($$0 -> $$0, $$0 -> ((cyo)$$0.a()).a());
   }

   @Override
   protected Stream<il<cya>> b() {
      return this.d().a().stream().map(Pair::getSecond);
   }

   @Override
   protected Codec<? extends cye> a() {
      return c;
   }

   public boolean a(ajg<cyo> $$0) {
      Optional<il<cyo>> $$1 = this.f.right();
      return $$1.isPresent() && $$1.get().a($$0);
   }

   @Override
   public il<cya> getNoiseBiome(int $$0, int $$1, int $$2, cyj.f $$3) {
      return this.a($$3.a($$0, $$1, $$2));
   }

   @axz
   public il<cya> a(cyj.h $$0) {
      return this.d().a($$0);
   }

   @Override
   public void a(List<String> $$0, ib $$1, cyj.f $$2) {
      int $$3 = iw.a($$1.u());
      int $$4 = iw.a($$1.v());
      int $$5 = iw.a($$1.w());
      cyj.h $$6 = $$2.a($$3, $$4, $$5);
      float $$7 = cyj.a($$6.d());
      float $$8 = cyj.a($$6.e());
      float $$9 = cyj.a($$6.b());
      float $$10 = cyj.a($$6.c());
      float $$11 = cyj.a($$6.g());
      double $$12 = (double)dsv.a($$11);
      cyq $$13 = new cyq();
      $$0.add(
         "Biome builder PV: "
            + cyq.a($$12)
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
