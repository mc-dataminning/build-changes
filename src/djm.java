import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;

public class djm extends dkv {
   public static final MapCodec<djm> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               aly.a(mb.f).fieldOf("fruit").forGetter($$0x -> $$0x.e),
               aly.a(mb.f).fieldOf("stem").forGetter($$0x -> $$0x.f),
               aly.a(mb.K).fieldOf("seed").forGetter($$0x -> $$0x.g),
               t()
            )
            .apply($$0, djm::new)
   );
   public static final dyr<jm> b = doj.aF;
   protected static final float c = 2.0F;
   private static final Map<jm, fcr> d = Maps.newEnumMap(
      ImmutableMap.of(
         jm.d,
         dkl.a(6.0, 0.0, 6.0, 10.0, 10.0, 16.0),
         jm.e,
         dkl.a(0.0, 0.0, 6.0, 10.0, 10.0, 10.0),
         jm.c,
         dkl.a(6.0, 0.0, 0.0, 10.0, 10.0, 10.0),
         jm.f,
         dkl.a(6.0, 0.0, 6.0, 16.0, 10.0, 10.0)
      )
   );
   private final aly<dkl> e;
   private final aly<dkl> f;
   private final aly<cxk> g;

   @Override
   public MapCodec<djm> a() {
      return a;
   }

   protected djm(aly<dkl> $$0, aly<dkl> $$1, aly<cxk> $$2, dxt.d $$3) {
      super($$3);
      this.l(this.F.b().b(b, jm.c));
      this.f = $$0;
      this.e = $$1;
      this.g = $$2;
   }

   @Override
   protected fcr a(dxu $$0, dgm $$1, jh $$2, fcc $$3) {
      return d.get($$0.c(b));
   }

   @Override
   protected dxu a(dxu $$0, dhk $$1, dhw $$2, jh $$3, jm $$4, jh $$5, dxu $$6, bam $$7) {
      if (!$$6.a(this.e) && $$4 == $$0.c(b)) {
         Optional<dkl> $$8 = $$1.K_().e(mb.f).f(this.f);
         if ($$8.isPresent()) {
            return $$8.get().m().c(dsk.c, Integer.valueOf(7));
         }
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean b(dxu $$0, dgm $$1, jh $$2) {
      return $$0.a(dkn.cK);
   }

   @Override
   public cxo a(dhk $$0, jh $$1, dxu $$2) {
      return new cxo((dhg)DataFixUtils.orElse($$0.K_().e(mb.K).f(this.g), this));
   }

   @Override
   protected dxu a(dxu $$0, drb $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dxu a(dxu $$0, dpk $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dxv.a<dkl, dxu> $$0) {
      $$0.a(b);
   }
}
