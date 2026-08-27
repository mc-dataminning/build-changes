import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class dcj extends dca {
   private static final MapCodec<ix<dbw>> d = dbw.c.fieldOf("biome");
   public static final MapCodec<dcf.c<ix<dbw>>> b = dcf.c.a(d).fieldOf("biomes");
   private static final MapCodec<ix<dck>> e = dck.b.fieldOf("preset").withLifecycle(Lifecycle.stable());
   public static final MapCodec<dcj> c = Codec.mapEither(b, e).xmap(dcj::new, $$0 -> $$0.f);
   private final Either<dcf.c<ix<dbw>>, ix<dck>> f;

   private dcj(Either<dcf.c<ix<dbw>>, ix<dck>> $$0) {
      this.f = $$0;
   }

   public static dcj a(dcf.c<ix<dbw>> $$0) {
      return new dcj(Either.left($$0));
   }

   public static dcj a(ix<dck> $$0) {
      return new dcj(Either.right($$0));
   }

   private dcf.c<ix<dbw>> d() {
      return (dcf.c<ix<dbw>>)this.f.map($$0 -> $$0, $$0 -> ((dck)$$0.a()).a());
   }

   @Override
   protected Stream<ix<dbw>> b() {
      return this.d().a().stream().map(Pair::getSecond);
   }

   @Override
   protected MapCodec<? extends dca> a() {
      return c;
   }

   public boolean a(akl<dck> $$0) {
      Optional<ix<dck>> $$1 = this.f.right();
      return $$1.isPresent() && $$1.get().a($$0);
   }

   @Override
   public ix<dbw> getNoiseBiome(int $$0, int $$1, int $$2, dcf.f $$3) {
      return this.a($$3.a($$0, $$1, $$2));
   }

   @azg
   public ix<dbw> a(dcf.h $$0) {
      return this.d().a($$0);
   }

   @Override
   public void a(List<String> $$0, io $$1, dcf.f $$2) {
      int $$3 = ji.a($$1.u());
      int $$4 = ji.a($$1.v());
      int $$5 = ji.a($$1.w());
      dcf.h $$6 = $$2.a($$3, $$4, $$5);
      float $$7 = dcf.a($$6.d());
      float $$8 = dcf.a($$6.e());
      float $$9 = dcf.a($$6.b());
      float $$10 = dcf.a($$6.c());
      float $$11 = dcf.a($$6.g());
      double $$12 = (double)dxa.a($$11);
      dcm $$13 = new dcm();
      $$0.add(
         "Biome builder PV: "
            + dcm.a($$12)
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
