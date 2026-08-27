import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class crm extends crd {
   private static final MapCodec<he<cqz>> d = cqz.c.fieldOf("biome");
   public static final MapCodec<cri.c<he<cqz>>> b = cri.c.a(d).fieldOf("biomes");
   private static final MapCodec<he<crn>> e = crn.b.fieldOf("preset").withLifecycle(Lifecycle.stable());
   public static final Codec<crm> c = Codec.mapEither(b, e).xmap(crm::new, $$0 -> $$0.f).codec();
   private final Either<cri.c<he<cqz>>, he<crn>> f;

   private crm(Either<cri.c<he<cqz>>, he<crn>> $$0) {
      this.f = $$0;
   }

   public static crm a(cri.c<he<cqz>> $$0) {
      return new crm(Either.left($$0));
   }

   public static crm a(he<crn> $$0) {
      return new crm(Either.right($$0));
   }

   private cri.c<he<cqz>> d() {
      return (cri.c<he<cqz>>)this.f.map($$0 -> $$0, $$0 -> ((crn)$$0.a()).a());
   }

   @Override
   protected Stream<he<cqz>> b() {
      return this.d().a().stream().map(Pair::getSecond);
   }

   @Override
   protected Codec<? extends crd> a() {
      return c;
   }

   public boolean a(aey<crn> $$0) {
      Optional<he<crn>> $$1 = this.f.right();
      return $$1.isPresent() && $$1.get().a($$0);
   }

   @Override
   public he<cqz> getNoiseBiome(int $$0, int $$1, int $$2, cri.f $$3) {
      return this.a($$3.a($$0, $$1, $$2));
   }

   @atd
   public he<cqz> a(cri.h $$0) {
      return this.d().a($$0);
   }

   @Override
   public void a(List<String> $$0, gw $$1, cri.f $$2) {
      int $$3 = hp.a($$1.u());
      int $$4 = hp.a($$1.v());
      int $$5 = hp.a($$1.w());
      cri.h $$6 = $$2.a($$3, $$4, $$5);
      float $$7 = cri.a($$6.d());
      float $$8 = cri.a($$6.e());
      float $$9 = cri.a($$6.b());
      float $$10 = cri.a($$6.c());
      float $$11 = cri.a($$6.g());
      double $$12 = (double)dkt.a($$11);
      crp $$13 = new crp();
      $$0.add(
         "Biome builder PV: "
            + crp.a($$12)
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
