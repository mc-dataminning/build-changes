import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;

public class dil extends dju {
   public static final MapCodec<dil> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               akt.a(mc.f).fieldOf("fruit").forGetter($$0x -> $$0x.e),
               akt.a(mc.f).fieldOf("stem").forGetter($$0x -> $$0x.f),
               akt.a(mc.K).fieldOf("seed").forGetter($$0x -> $$0x.g),
               t()
            )
            .apply($$0, dil::new)
   );
   public static final dxs<jn> b = dni.aF;
   protected static final float c = 2.0F;
   private static final Map<jn, fbs> d = Maps.newEnumMap(
      ImmutableMap.of(
         jn.d,
         djk.a(6.0, 0.0, 6.0, 10.0, 10.0, 16.0),
         jn.e,
         djk.a(0.0, 0.0, 6.0, 10.0, 10.0, 10.0),
         jn.c,
         djk.a(6.0, 0.0, 0.0, 10.0, 10.0, 10.0),
         jn.f,
         djk.a(6.0, 0.0, 6.0, 16.0, 10.0, 10.0)
      )
   );
   private final akt<djk> e;
   private final akt<djk> f;
   private final akt<cwj> g;

   @Override
   public MapCodec<dil> a() {
      return a;
   }

   protected dil(akt<djk> $$0, akt<djk> $$1, akt<cwj> $$2, dwu.d $$3) {
      super($$3);
      this.l(this.F.b().b(b, jn.c));
      this.f = $$0;
      this.e = $$1;
      this.g = $$2;
   }

   @Override
   protected fbs a(dwv $$0, dfl $$1, ji $$2, fbd $$3) {
      return d.get($$0.c(b));
   }

   @Override
   protected dwv a(dwv $$0, dgj $$1, dgv $$2, ji $$3, jn $$4, ji $$5, dwv $$6, azg $$7) {
      if (!$$6.a(this.e) && $$4 == $$0.c(b)) {
         Optional<djk> $$8 = $$1.K_().e(mc.f).f(this.f);
         if ($$8.isPresent()) {
            return $$8.get().m().c(drl.c, Integer.valueOf(7));
         }
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean b(dwv $$0, dfl $$1, ji $$2) {
      return $$0.a(djm.cK);
   }

   @Override
   protected cwn a(dgj $$0, ji $$1, dwv $$2, boolean $$3) {
      return new cwn((dgf)DataFixUtils.orElse($$0.K_().e(mc.K).f(this.g), this));
   }

   @Override
   protected dwv a(dwv $$0, dqc $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dwv a(dwv $$0, doj $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dww.a<djk, dwv> $$0) {
      $$0.a(b);
   }
}
