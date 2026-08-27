import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class dcl extends dcc {
   private static final MapCodec<ix<dby>> d = dby.c.fieldOf("biome");
   public static final MapCodec<dch.c<ix<dby>>> b = dch.c.a(d).fieldOf("biomes");
   private static final MapCodec<ix<dcm>> e = dcm.b.fieldOf("preset").withLifecycle(Lifecycle.stable());
   public static final MapCodec<dcl> c = Codec.mapEither(b, e).xmap(dcl::new, $$0 -> $$0.f);
   private final Either<dch.c<ix<dby>>, ix<dcm>> f;

   private dcl(Either<dch.c<ix<dby>>, ix<dcm>> $$0) {
      this.f = $$0;
   }

   public static dcl a(dch.c<ix<dby>> $$0) {
      return new dcl(Either.left($$0));
   }

   public static dcl a(ix<dcm> $$0) {
      return new dcl(Either.right($$0));
   }

   private dch.c<ix<dby>> d() {
      return (dch.c<ix<dby>>)this.f.map($$0 -> $$0, $$0 -> ((dcm)$$0.a()).a());
   }

   @Override
   protected Stream<ix<dby>> b() {
      return this.d().a().stream().map(Pair::getSecond);
   }

   @Override
   protected MapCodec<? extends dcc> a() {
      return c;
   }

   public boolean a(akm<dcm> $$0) {
      Optional<ix<dcm>> $$1 = this.f.right();
      return $$1.isPresent() && $$1.get().a($$0);
   }

   @Override
   public ix<dby> getNoiseBiome(int $$0, int $$1, int $$2, dch.f $$3) {
      return this.a($$3.a($$0, $$1, $$2));
   }

   @azi
   public ix<dby> a(dch.h $$0) {
      return this.d().a($$0);
   }

   @Override
   public void a(List<String> $$0, io $$1, dch.f $$2) {
      int $$3 = ji.a($$1.u());
      int $$4 = ji.a($$1.v());
      int $$5 = ji.a($$1.w());
      dch.h $$6 = $$2.a($$3, $$4, $$5);
      float $$7 = dch.a($$6.d());
      float $$8 = dch.a($$6.e());
      float $$9 = dch.a($$6.b());
      float $$10 = dch.a($$6.c());
      float $$11 = dch.a($$6.g());
      double $$12 = (double)dxc.a($$11);
      dco $$13 = new dco();
      $$0.add(
         "Biome builder PV: "
            + dco.a($$12)
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
