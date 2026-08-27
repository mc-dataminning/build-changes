import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class cnx extends cno {
   private static final MapCodec<he<cnk>> d = cnk.c.fieldOf("biome");
   public static final MapCodec<cnt.c<he<cnk>>> b = cnt.c.a(d).fieldOf("biomes");
   private static final MapCodec<he<cny>> e = cny.b.fieldOf("preset").withLifecycle(Lifecycle.stable());
   public static final Codec<cnx> c = Codec.mapEither(b, e).xmap(cnx::new, $$0 -> $$0.f).codec();
   private final Either<cnt.c<he<cnk>>, he<cny>> f;

   private cnx(Either<cnt.c<he<cnk>>, he<cny>> $$0) {
      this.f = $$0;
   }

   public static cnx a(cnt.c<he<cnk>> $$0) {
      return new cnx(Either.left($$0));
   }

   public static cnx a(he<cny> $$0) {
      return new cnx(Either.right($$0));
   }

   private cnt.c<he<cnk>> d() {
      return (cnt.c<he<cnk>>)this.f.map($$0 -> $$0, $$0 -> ((cny)$$0.a()).a());
   }

   @Override
   protected Stream<he<cnk>> b() {
      return this.d().a().stream().map(Pair::getSecond);
   }

   @Override
   protected Codec<? extends cno> a() {
      return c;
   }

   public boolean a(acp<cny> $$0) {
      Optional<he<cny>> $$1 = this.f.right();
      return $$1.isPresent() && $$1.get().a($$0);
   }

   @Override
   public he<cnk> getNoiseBiome(int $$0, int $$1, int $$2, cnt.f $$3) {
      return this.a($$3.a($$0, $$1, $$2));
   }

   @aqa
   public he<cnk> a(cnt.h $$0) {
      return this.d().a($$0);
   }

   @Override
   public void a(List<String> $$0, gu $$1, cnt.f $$2) {
      int $$3 = hq.a($$1.u());
      int $$4 = hq.a($$1.v());
      int $$5 = hq.a($$1.w());
      cnt.h $$6 = $$2.a($$3, $$4, $$5);
      float $$7 = cnt.a($$6.d());
      float $$8 = cnt.a($$6.e());
      float $$9 = cnt.a($$6.b());
      float $$10 = cnt.a($$6.c());
      float $$11 = cnt.a($$6.g());
      double $$12 = (double)dhr.a($$11);
      coa $$13 = new coa();
      $$0.add(
         "Biome builder PV: "
            + coa.a($$12)
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
