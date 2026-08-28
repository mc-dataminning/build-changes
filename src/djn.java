import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;

public class djn extends dkw {
   public static final MapCodec<djn> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               aly.a(mb.f).fieldOf("fruit").forGetter($$0x -> $$0x.e),
               aly.a(mb.f).fieldOf("stem").forGetter($$0x -> $$0x.f),
               aly.a(mb.K).fieldOf("seed").forGetter($$0x -> $$0x.g),
               t()
            )
            .apply($$0, djn::new)
   );
   public static final dys<jm> b = dok.aF;
   protected static final float c = 2.0F;
   private static final Map<jm, fcs> d = Maps.newEnumMap(
      ImmutableMap.of(
         jm.d,
         dkm.a(6.0, 0.0, 6.0, 10.0, 10.0, 16.0),
         jm.e,
         dkm.a(0.0, 0.0, 6.0, 10.0, 10.0, 10.0),
         jm.c,
         dkm.a(6.0, 0.0, 0.0, 10.0, 10.0, 10.0),
         jm.f,
         dkm.a(6.0, 0.0, 6.0, 16.0, 10.0, 10.0)
      )
   );
   private final aly<dkm> e;
   private final aly<dkm> f;
   private final aly<cxl> g;

   @Override
   public MapCodec<djn> a() {
      return a;
   }

   protected djn(aly<dkm> $$0, aly<dkm> $$1, aly<cxl> $$2, dxu.d $$3) {
      super($$3);
      this.l(this.F.b().b(b, jm.c));
      this.f = $$0;
      this.e = $$1;
      this.g = $$2;
   }

   @Override
   protected fcs a(dxv $$0, dgn $$1, jh $$2, fcd $$3) {
      return d.get($$0.c(b));
   }

   @Override
   protected dxv a(dxv $$0, dhl $$1, dhx $$2, jh $$3, jm $$4, jh $$5, dxv $$6, bam $$7) {
      if (!$$6.a(this.e) && $$4 == $$0.c(b)) {
         Optional<dkm> $$8 = $$1.K_().e(mb.f).f(this.f);
         if ($$8.isPresent()) {
            return $$8.get().m().c(dsl.c, Integer.valueOf(7));
         }
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean b(dxv $$0, dgn $$1, jh $$2) {
      return $$0.a(dko.cK);
   }

   @Override
   public cxp a(dhl $$0, jh $$1, dxv $$2) {
      return new cxp((dhh)DataFixUtils.orElse($$0.K_().e(mb.K).f(this.g), this));
   }

   @Override
   protected dxv a(dxv $$0, drc $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dxv a(dxv $$0, dpl $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dxw.a<dkm, dxv> $$0) {
      $$0.a(b);
   }
}
