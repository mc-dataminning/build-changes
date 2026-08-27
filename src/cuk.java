import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class cuk extends cub {
   private static final MapCodec<ie<ctx>> d = ctx.c.fieldOf("biome");
   public static final MapCodec<cug.c<ie<ctx>>> b = cug.c.a(d).fieldOf("biomes");
   private static final MapCodec<ie<cul>> e = cul.b.fieldOf("preset").withLifecycle(Lifecycle.stable());
   public static final Codec<cuk> c = Codec.mapEither(b, e).xmap(cuk::new, $$0 -> $$0.f).codec();
   private final Either<cug.c<ie<ctx>>, ie<cul>> f;

   private cuk(Either<cug.c<ie<ctx>>, ie<cul>> $$0) {
      this.f = $$0;
   }

   public static cuk a(cug.c<ie<ctx>> $$0) {
      return new cuk(Either.left($$0));
   }

   public static cuk a(ie<cul> $$0) {
      return new cuk(Either.right($$0));
   }

   private cug.c<ie<ctx>> d() {
      return (cug.c<ie<ctx>>)this.f.map($$0 -> $$0, $$0 -> ((cul)$$0.a()).a());
   }

   @Override
   protected Stream<ie<ctx>> b() {
      return this.d().a().stream().map(Pair::getSecond);
   }

   @Override
   protected Codec<? extends cub> a() {
      return c;
   }

   public boolean a(ags<cul> $$0) {
      Optional<ie<cul>> $$1 = this.f.right();
      return $$1.isPresent() && $$1.get().a($$0);
   }

   @Override
   public ie<ctx> getNoiseBiome(int $$0, int $$1, int $$2, cug.f $$3) {
      return this.a($$3.a($$0, $$1, $$2));
   }

   @avd
   public ie<ctx> a(cug.h $$0) {
      return this.d().a($$0);
   }

   @Override
   public void a(List<String> $$0, hv $$1, cug.f $$2) {
      int $$3 = iq.a($$1.u());
      int $$4 = iq.a($$1.v());
      int $$5 = iq.a($$1.w());
      cug.h $$6 = $$2.a($$3, $$4, $$5);
      float $$7 = cug.a($$6.d());
      float $$8 = cug.a($$6.e());
      float $$9 = cug.a($$6.b());
      float $$10 = cug.a($$6.c());
      float $$11 = cug.a($$6.g());
      double $$12 = (double)dof.a($$11);
      cun $$13 = new cun();
      $$0.add(
         "Biome builder PV: "
            + cun.a($$12)
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
