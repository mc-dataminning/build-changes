import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;

public class dgz extends dih {
   public static final MapCodec<dgz> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               alg.a(ly.f).fieldOf("fruit").forGetter($$0x -> $$0x.e),
               alg.a(ly.f).fieldOf("stem").forGetter($$0x -> $$0x.f),
               alg.a(ly.K).fieldOf("seed").forGetter($$0x -> $$0x.g),
               t()
            )
            .apply($$0, dgz::new)
   );
   public static final dvx b = dlt.aF;
   protected static final float c = 2.0F;
   private static final Map<jl, fab> d = Maps.newEnumMap(
      ImmutableMap.of(
         jl.d,
         dhy.a(6.0, 0.0, 6.0, 10.0, 10.0, 16.0),
         jl.e,
         dhy.a(0.0, 0.0, 6.0, 10.0, 10.0, 10.0),
         jl.c,
         dhy.a(6.0, 0.0, 0.0, 10.0, 10.0, 10.0),
         jl.f,
         dhy.a(6.0, 0.0, 6.0, 16.0, 10.0, 10.0)
      )
   );
   private final alg<dhy> e;
   private final alg<dhy> f;
   private final alg<cvt> g;

   @Override
   public MapCodec<dgz> a() {
      return a;
   }

   protected dgz(alg<dhy> $$0, alg<dhy> $$1, alg<cvt> $$2, dvc.d $$3) {
      super($$3);
      this.l(this.F.b().b(b, jl.c));
      this.f = $$0;
      this.e = $$1;
      this.g = $$2;
   }

   @Override
   protected fab a(dvd $$0, dea $$1, jg $$2, ezm $$3) {
      return d.get($$0.c(b));
   }

   @Override
   protected dvd a(dvd $$0, jl $$1, dvd $$2, dew $$3, jg $$4, jg $$5) {
      if (!$$2.a(this.e) && $$1 == $$0.c(b)) {
         Optional<dhy> $$6 = $$3.H_().e(ly.f).f(this.f);
         if ($$6.isPresent()) {
            return $$6.get().m().c(dpu.c, Integer.valueOf(7));
         }
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean b(dvd $$0, dea $$1, jg $$2) {
      return $$0.a(dia.cC);
   }

   @Override
   public cvx a(dey $$0, jg $$1, dvd $$2) {
      return new cvx((deu)DataFixUtils.orElse($$0.H_().e(ly.K).f(this.g), this));
   }

   @Override
   protected dvd a(dvd $$0, dol $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dvd a(dvd $$0, dmu $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dve.a<dhy, dvd> $$0) {
      $$0.a(b);
   }
}
