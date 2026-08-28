import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class dkx extends dko {
   private static final MapCodec<jf<dkk>> d = dkk.c.fieldOf("biome");
   public static final MapCodec<dkt.c<jf<dkk>>> b = dkt.c.a(d).fieldOf("biomes");
   private static final MapCodec<jf<dky>> e = dky.b.fieldOf("preset").withLifecycle(Lifecycle.stable());
   public static final MapCodec<dkx> c = Codec.mapEither(b, e).xmap(dkx::new, $$0 -> $$0.f);
   private final Either<dkt.c<jf<dkk>>, jf<dky>> f;

   private dkx(Either<dkt.c<jf<dkk>>, jf<dky>> $$0) {
      this.f = $$0;
   }

   public static dkx a(dkt.c<jf<dkk>> $$0) {
      return new dkx(Either.left($$0));
   }

   public static dkx a(jf<dky> $$0) {
      return new dkx(Either.right($$0));
   }

   private dkt.c<jf<dkk>> d() {
      return (dkt.c<jf<dkk>>)this.f.map($$0 -> $$0, $$0 -> ((dky)$$0.a()).a());
   }

   @Override
   protected Stream<jf<dkk>> b() {
      return this.d().a().stream().map(Pair::getSecond);
   }

   @Override
   protected MapCodec<? extends dko> a() {
      return c;
   }

   public boolean a(alf<dky> $$0) {
      Optional<jf<dky>> $$1 = this.f.right();
      return $$1.isPresent() && $$1.get().a($$0);
   }

   @Override
   public jf<dkk> getNoiseBiome(int $$0, int $$1, int $$2, dkt.f $$3) {
      return this.a($$3.a($$0, $$1, $$2));
   }

   @bav
   public jf<dkk> a(dkt.h $$0) {
      return this.d().a($$0);
   }

   @Override
   public void a(List<String> $$0, iv $$1, dkt.f $$2) {
      int $$3 = jq.a($$1.u());
      int $$4 = jq.a($$1.v());
      int $$5 = jq.a($$1.w());
      dkt.h $$6 = $$2.a($$3, $$4, $$5);
      float $$7 = dkt.a($$6.d());
      float $$8 = dkt.a($$6.e());
      float $$9 = dkt.a($$6.b());
      float $$10 = dkt.a($$6.c());
      float $$11 = dkt.a($$6.g());
      double $$12 = (double)egu.a($$11);
      dla $$13 = new dla();
      $$0.add(
         "Biome builder PV: "
            + dla.a($$12)
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
