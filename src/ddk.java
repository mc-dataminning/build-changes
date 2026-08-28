import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class ddk extends ddb {
   private static final MapCodec<ji<dcx>> d = dcx.c.fieldOf("biome");
   public static final MapCodec<ddg.c<ji<dcx>>> b = ddg.c.a(d).fieldOf("biomes");
   private static final MapCodec<ji<ddl>> e = ddl.b.fieldOf("preset").withLifecycle(Lifecycle.stable());
   public static final MapCodec<ddk> c = Codec.mapEither(b, e).xmap(ddk::new, $$0 -> $$0.f);
   private final Either<ddg.c<ji<dcx>>, ji<ddl>> f;

   private ddk(Either<ddg.c<ji<dcx>>, ji<ddl>> $$0) {
      this.f = $$0;
   }

   public static ddk a(ddg.c<ji<dcx>> $$0) {
      return new ddk(Either.left($$0));
   }

   public static ddk a(ji<ddl> $$0) {
      return new ddk(Either.right($$0));
   }

   private ddg.c<ji<dcx>> d() {
      return (ddg.c<ji<dcx>>)this.f.map($$0 -> $$0, $$0 -> ((ddl)$$0.a()).a());
   }

   @Override
   protected Stream<ji<dcx>> b() {
      return this.d().a().stream().map(Pair::getSecond);
   }

   @Override
   protected MapCodec<? extends ddb> a() {
      return c;
   }

   public boolean a(ale<ddl> $$0) {
      Optional<ji<ddl>> $$1 = this.f.right();
      return $$1.isPresent() && $$1.get().a($$0);
   }

   @Override
   public ji<dcx> getNoiseBiome(int $$0, int $$1, int $$2, ddg.f $$3) {
      return this.a($$3.a($$0, $$1, $$2));
   }

   @bad
   public ji<dcx> a(ddg.h $$0) {
      return this.d().a($$0);
   }

   @Override
   public void a(List<String> $$0, iz $$1, ddg.f $$2) {
      int $$3 = jt.a($$1.u());
      int $$4 = jt.a($$1.v());
      int $$5 = jt.a($$1.w());
      ddg.h $$6 = $$2.a($$3, $$4, $$5);
      float $$7 = ddg.a($$6.d());
      float $$8 = ddg.a($$6.e());
      float $$9 = ddg.a($$6.b());
      float $$10 = ddg.a($$6.c());
      float $$11 = ddg.a($$6.g());
      double $$12 = (double)dyb.a($$11);
      ddn $$13 = new ddn();
      $$0.add(
         "Biome builder PV: "
            + ddn.a($$12)
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
