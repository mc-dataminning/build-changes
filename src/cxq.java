import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class cxq extends cxh {
   private static final MapCodec<il<cxd>> d = cxd.c.fieldOf("biome");
   public static final MapCodec<cxm.c<il<cxd>>> b = cxm.c.a(d).fieldOf("biomes");
   private static final MapCodec<il<cxr>> e = cxr.b.fieldOf("preset").withLifecycle(Lifecycle.stable());
   public static final Codec<cxq> c = Codec.mapEither(b, e).xmap(cxq::new, $$0 -> $$0.f).codec();
   private final Either<cxm.c<il<cxd>>, il<cxr>> f;

   private cxq(Either<cxm.c<il<cxd>>, il<cxr>> $$0) {
      this.f = $$0;
   }

   public static cxq a(cxm.c<il<cxd>> $$0) {
      return new cxq(Either.left($$0));
   }

   public static cxq a(il<cxr> $$0) {
      return new cxq(Either.right($$0));
   }

   private cxm.c<il<cxd>> d() {
      return (cxm.c<il<cxd>>)this.f.map($$0 -> $$0, $$0 -> ((cxr)$$0.a()).a());
   }

   @Override
   protected Stream<il<cxd>> b() {
      return this.d().a().stream().map(Pair::getSecond);
   }

   @Override
   protected Codec<? extends cxh> a() {
      return c;
   }

   public boolean a(ajb<cxr> $$0) {
      Optional<il<cxr>> $$1 = this.f.right();
      return $$1.isPresent() && $$1.get().a($$0);
   }

   @Override
   public il<cxd> getNoiseBiome(int $$0, int $$1, int $$2, cxm.f $$3) {
      return this.a($$3.a($$0, $$1, $$2));
   }

   @axp
   public il<cxd> a(cxm.h $$0) {
      return this.d().a($$0);
   }

   @Override
   public void a(List<String> $$0, ib $$1, cxm.f $$2) {
      int $$3 = iw.a($$1.u());
      int $$4 = iw.a($$1.v());
      int $$5 = iw.a($$1.w());
      cxm.h $$6 = $$2.a($$3, $$4, $$5);
      float $$7 = cxm.a($$6.d());
      float $$8 = cxm.a($$6.e());
      float $$9 = cxm.a($$6.b());
      float $$10 = cxm.a($$6.c());
      float $$11 = cxm.a($$6.g());
      double $$12 = (double)drx.a($$11);
      cxt $$13 = new cxt();
      $$0.add(
         "Biome builder PV: "
            + cxt.a($$12)
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
