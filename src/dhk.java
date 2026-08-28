import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;

public class dhk extends dis {
   public static final MapCodec<dhk> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               alk.a(ma.f).fieldOf("fruit").forGetter($$0x -> $$0x.e),
               alk.a(ma.f).fieldOf("stem").forGetter($$0x -> $$0x.f),
               alk.a(ma.K).fieldOf("seed").forGetter($$0x -> $$0x.g),
               t()
            )
            .apply($$0, dhk::new)
   );
   public static final dwl<jm> b = dme.aF;
   protected static final float c = 2.0F;
   private static final Map<jm, fal> d = Maps.newEnumMap(
      ImmutableMap.of(
         jm.d,
         dij.a(6.0, 0.0, 6.0, 10.0, 10.0, 16.0),
         jm.e,
         dij.a(0.0, 0.0, 6.0, 10.0, 10.0, 10.0),
         jm.c,
         dij.a(6.0, 0.0, 0.0, 10.0, 10.0, 10.0),
         jm.f,
         dij.a(6.0, 0.0, 6.0, 16.0, 10.0, 10.0)
      )
   );
   private final alk<dij> e;
   private final alk<dij> f;
   private final alk<cwb> g;

   @Override
   public MapCodec<dhk> a() {
      return a;
   }

   protected dhk(alk<dij> $$0, alk<dij> $$1, alk<cwb> $$2, dvn.d $$3) {
      super($$3);
      this.l(this.F.b().b(b, jm.c));
      this.f = $$0;
      this.e = $$1;
      this.g = $$2;
   }

   @Override
   protected fal a(dvo $$0, dek $$1, jh $$2, ezw $$3) {
      return d.get($$0.c(b));
   }

   @Override
   protected dvo a(dvo $$0, dfi $$1, dfu $$2, jh $$3, jm $$4, jh $$5, dvo $$6, azv $$7) {
      if (!$$6.a(this.e) && $$4 == $$0.c(b)) {
         Optional<dij> $$8 = $$1.H_().e(ma.f).f(this.f);
         if ($$8.isPresent()) {
            return $$8.get().m().c(dqf.c, Integer.valueOf(7));
         }
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean b(dvo $$0, dek $$1, jh $$2) {
      return $$0.a(dil.cC);
   }

   @Override
   public cwf a(dfi $$0, jh $$1, dvo $$2) {
      return new cwf((dfe)DataFixUtils.orElse($$0.H_().e(ma.K).f(this.g), this));
   }

   @Override
   protected dvo a(dvo $$0, dow $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dvo a(dvo $$0, dnf $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dvp.a<dij, dvo> $$0) {
      $$0.a(b);
   }
}
