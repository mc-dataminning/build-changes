import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class daj extends daa {
   private static final MapCodec<il<czw>> d = czw.c.fieldOf("biome");
   public static final MapCodec<daf.c<il<czw>>> b = daf.c.a(d).fieldOf("biomes");
   private static final MapCodec<il<dak>> e = dak.b.fieldOf("preset").withLifecycle(Lifecycle.stable());
   public static final Codec<daj> c = Codec.mapEither(b, e).xmap(daj::new, $$0 -> $$0.f).codec();
   private final Either<daf.c<il<czw>>, il<dak>> f;

   private daj(Either<daf.c<il<czw>>, il<dak>> $$0) {
      this.f = $$0;
   }

   public static daj a(daf.c<il<czw>> $$0) {
      return new daj(Either.left($$0));
   }

   public static daj a(il<dak> $$0) {
      return new daj(Either.right($$0));
   }

   private daf.c<il<czw>> d() {
      return (daf.c<il<czw>>)this.f.map($$0 -> $$0, $$0 -> ((dak)$$0.a()).a());
   }

   @Override
   protected Stream<il<czw>> b() {
      return this.d().a().stream().map(Pair::getSecond);
   }

   @Override
   protected Codec<? extends daa> a() {
      return c;
   }

   public boolean a(ajs<dak> $$0) {
      Optional<il<dak>> $$1 = this.f.right();
      return $$1.isPresent() && $$1.get().a($$0);
   }

   @Override
   public il<czw> getNoiseBiome(int $$0, int $$1, int $$2, daf.f $$3) {
      return this.a($$3.a($$0, $$1, $$2));
   }

   @ayn
   public il<czw> a(daf.h $$0) {
      return this.d().a($$0);
   }

   @Override
   public void a(List<String> $$0, ib $$1, daf.f $$2) {
      int $$3 = iw.a($$1.u());
      int $$4 = iw.a($$1.v());
      int $$5 = iw.a($$1.w());
      daf.h $$6 = $$2.a($$3, $$4, $$5);
      float $$7 = daf.a($$6.d());
      float $$8 = daf.a($$6.e());
      float $$9 = daf.a($$6.b());
      float $$10 = daf.a($$6.c());
      float $$11 = daf.a($$6.g());
      double $$12 = (double)duy.a($$11);
      dam $$13 = new dam();
      $$0.add(
         "Biome builder PV: "
            + dam.a($$12)
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
