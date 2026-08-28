import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;

public class dhr extends diz {
   public static final MapCodec<dhr> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ali.a(ma.f).fieldOf("fruit").forGetter($$0x -> $$0x.e),
               ali.a(ma.f).fieldOf("stem").forGetter($$0x -> $$0x.f),
               ali.a(ma.K).fieldOf("seed").forGetter($$0x -> $$0x.g),
               t()
            )
            .apply($$0, dhr::new)
   );
   public static final dws<jm> b = dml.aF;
   protected static final float c = 2.0F;
   private static final Map<jm, fas> d = Maps.newEnumMap(
      ImmutableMap.of(
         jm.d,
         diq.a(6.0, 0.0, 6.0, 10.0, 10.0, 16.0),
         jm.e,
         diq.a(0.0, 0.0, 6.0, 10.0, 10.0, 10.0),
         jm.c,
         diq.a(6.0, 0.0, 0.0, 10.0, 10.0, 10.0),
         jm.f,
         diq.a(6.0, 0.0, 6.0, 16.0, 10.0, 10.0)
      )
   );
   private final ali<diq> e;
   private final ali<diq> f;
   private final ali<cwi> g;

   @Override
   public MapCodec<dhr> a() {
      return a;
   }

   protected dhr(ali<diq> $$0, ali<diq> $$1, ali<cwi> $$2, dvu.d $$3) {
      super($$3);
      this.l(this.F.b().b(b, jm.c));
      this.f = $$0;
      this.e = $$1;
      this.g = $$2;
   }

   @Override
   protected fas a(dvv $$0, der $$1, jh $$2, fad $$3) {
      return d.get($$0.c(b));
   }

   @Override
   protected dvv a(dvv $$0, dfp $$1, dgb $$2, jh $$3, jm $$4, jh $$5, dvv $$6, azu $$7) {
      if (!$$6.a(this.e) && $$4 == $$0.c(b)) {
         Optional<diq> $$8 = $$1.J_().e(ma.f).f(this.f);
         if ($$8.isPresent()) {
            return $$8.get().m().c(dqm.c, Integer.valueOf(7));
         }
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean b(dvv $$0, der $$1, jh $$2) {
      return $$0.a(dis.cC);
   }

   @Override
   public cwm a(dfp $$0, jh $$1, dvv $$2) {
      return new cwm((dfl)DataFixUtils.orElse($$0.J_().e(ma.K).f(this.g), this));
   }

   @Override
   protected dvv a(dvv $$0, dpd $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dvv a(dvv $$0, dnm $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dvw.a<diq, dvv> $$0) {
      $$0.a(b);
   }
}
