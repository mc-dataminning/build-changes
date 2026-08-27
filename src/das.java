import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class das extends daj {
   private static final MapCodec<in<daf>> d = daf.c.fieldOf("biome");
   public static final MapCodec<dao.c<in<daf>>> b = dao.c.a(d).fieldOf("biomes");
   private static final MapCodec<in<dat>> e = dat.b.fieldOf("preset").withLifecycle(Lifecycle.stable());
   public static final Codec<das> c = Codec.mapEither(b, e).xmap(das::new, $$0 -> $$0.f).codec();
   private final Either<dao.c<in<daf>>, in<dat>> f;

   private das(Either<dao.c<in<daf>>, in<dat>> $$0) {
      this.f = $$0;
   }

   public static das a(dao.c<in<daf>> $$0) {
      return new das(Either.left($$0));
   }

   public static das a(in<dat> $$0) {
      return new das(Either.right($$0));
   }

   private dao.c<in<daf>> d() {
      return (dao.c<in<daf>>)this.f.map($$0 -> $$0, $$0 -> ((dat)$$0.a()).a());
   }

   @Override
   protected Stream<in<daf>> b() {
      return this.d().a().stream().map(Pair::getSecond);
   }

   @Override
   protected Codec<? extends daj> a() {
      return c;
   }

   public boolean a(aju<dat> $$0) {
      Optional<in<dat>> $$1 = this.f.right();
      return $$1.isPresent() && $$1.get().a($$0);
   }

   @Override
   public in<daf> getNoiseBiome(int $$0, int $$1, int $$2, dao.f $$3) {
      return this.a($$3.a($$0, $$1, $$2));
   }

   @ayp
   public in<daf> a(dao.h $$0) {
      return this.d().a($$0);
   }

   @Override
   public void a(List<String> $$0, id $$1, dao.f $$2) {
      int $$3 = iy.a($$1.u());
      int $$4 = iy.a($$1.v());
      int $$5 = iy.a($$1.w());
      dao.h $$6 = $$2.a($$3, $$4, $$5);
      float $$7 = dao.a($$6.d());
      float $$8 = dao.a($$6.e());
      float $$9 = dao.a($$6.b());
      float $$10 = dao.a($$6.c());
      float $$11 = dao.a($$6.g());
      double $$12 = (double)dvh.a($$11);
      dav $$13 = new dav();
      $$0.add(
         "Biome builder PV: "
            + dav.a($$12)
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
