import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class ctl extends ctc {
   private static final MapCodec<ib<csy>> d = csy.c.fieldOf("biome");
   public static final MapCodec<cth.c<ib<csy>>> b = cth.c.a(d).fieldOf("biomes");
   private static final MapCodec<ib<ctm>> e = ctm.b.fieldOf("preset").withLifecycle(Lifecycle.stable());
   public static final Codec<ctl> c = Codec.mapEither(b, e).xmap(ctl::new, $$0 -> $$0.f).codec();
   private final Either<cth.c<ib<csy>>, ib<ctm>> f;

   private ctl(Either<cth.c<ib<csy>>, ib<ctm>> $$0) {
      this.f = $$0;
   }

   public static ctl a(cth.c<ib<csy>> $$0) {
      return new ctl(Either.left($$0));
   }

   public static ctl a(ib<ctm> $$0) {
      return new ctl(Either.right($$0));
   }

   private cth.c<ib<csy>> d() {
      return (cth.c<ib<csy>>)this.f.map($$0 -> $$0, $$0 -> ((ctm)$$0.a()).a());
   }

   @Override
   protected Stream<ib<csy>> b() {
      return this.d().a().stream().map(Pair::getSecond);
   }

   @Override
   protected Codec<? extends ctc> a() {
      return c;
   }

   public boolean a(agh<ctm> $$0) {
      Optional<ib<ctm>> $$1 = this.f.right();
      return $$1.isPresent() && $$1.get().a($$0);
   }

   @Override
   public ib<csy> getNoiseBiome(int $$0, int $$1, int $$2, cth.f $$3) {
      return this.a($$3.a($$0, $$1, $$2));
   }

   @aup
   public ib<csy> a(cth.h $$0) {
      return this.d().a($$0);
   }

   @Override
   public void a(List<String> $$0, ht $$1, cth.f $$2) {
      int $$3 = in.a($$1.u());
      int $$4 = in.a($$1.v());
      int $$5 = in.a($$1.w());
      cth.h $$6 = $$2.a($$3, $$4, $$5);
      float $$7 = cth.a($$6.d());
      float $$8 = cth.a($$6.e());
      float $$9 = cth.a($$6.b());
      float $$10 = cth.a($$6.c());
      float $$11 = cth.a($$6.g());
      double $$12 = (double)dmy.a($$11);
      cto $$13 = new cto();
      $$0.add(
         "Biome builder PV: "
            + cto.a($$12)
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
