import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class ctq extends cth {
   private static final MapCodec<ig<ctd>> d = ctd.c.fieldOf("biome");
   public static final MapCodec<ctm.c<ig<ctd>>> b = ctm.c.a(d).fieldOf("biomes");
   private static final MapCodec<ig<ctr>> e = ctr.b.fieldOf("preset").withLifecycle(Lifecycle.stable());
   public static final Codec<ctq> c = Codec.mapEither(b, e).xmap(ctq::new, $$0 -> $$0.f).codec();
   private final Either<ctm.c<ig<ctd>>, ig<ctr>> f;

   private ctq(Either<ctm.c<ig<ctd>>, ig<ctr>> $$0) {
      this.f = $$0;
   }

   public static ctq a(ctm.c<ig<ctd>> $$0) {
      return new ctq(Either.left($$0));
   }

   public static ctq a(ig<ctr> $$0) {
      return new ctq(Either.right($$0));
   }

   private ctm.c<ig<ctd>> d() {
      return (ctm.c<ig<ctd>>)this.f.map($$0 -> $$0, $$0 -> ((ctr)$$0.a()).a());
   }

   @Override
   protected Stream<ig<ctd>> b() {
      return this.d().a().stream().map(Pair::getSecond);
   }

   @Override
   protected Codec<? extends cth> a() {
      return c;
   }

   public boolean a(agl<ctr> $$0) {
      Optional<ig<ctr>> $$1 = this.f.right();
      return $$1.isPresent() && $$1.get().a($$0);
   }

   @Override
   public ig<ctd> getNoiseBiome(int $$0, int $$1, int $$2, ctm.f $$3) {
      return this.a($$3.a($$0, $$1, $$2));
   }

   @aut
   public ig<ctd> a(ctm.h $$0) {
      return this.d().a($$0);
   }

   @Override
   public void a(List<String> $$0, hx $$1, ctm.f $$2) {
      int $$3 = ir.a($$1.u());
      int $$4 = ir.a($$1.v());
      int $$5 = ir.a($$1.w());
      ctm.h $$6 = $$2.a($$3, $$4, $$5);
      float $$7 = ctm.a($$6.d());
      float $$8 = ctm.a($$6.e());
      float $$9 = ctm.a($$6.b());
      float $$10 = ctm.a($$6.c());
      float $$11 = ctm.a($$6.g());
      double $$12 = (double)dnd.a($$11);
      ctt $$13 = new ctt();
      $$0.add(
         "Biome builder PV: "
            + ctt.a($$12)
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
