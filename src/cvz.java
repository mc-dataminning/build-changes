import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;

public class cvz extends cxh {
   public static final MapCodec<cvz> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ahg.a(ke.f).fieldOf("fruit").forGetter($$0x -> $$0x.e),
               ahg.a(ke.f).fieldOf("stem").forGetter($$0x -> $$0x.f),
               ahg.a(ke.F).fieldOf("seed").forGetter($$0x -> $$0x.g),
               u()
            )
            .apply($$0, cvz::new)
   );
   public static final dkj b = dat.aE;
   protected static final float c = 2.0F;
   private static final Map<ic, emv> d = Maps.newEnumMap(
      ImmutableMap.of(
         ic.d,
         cwy.a(6.0, 0.0, 6.0, 10.0, 10.0, 16.0),
         ic.e,
         cwy.a(0.0, 0.0, 6.0, 10.0, 10.0, 10.0),
         ic.c,
         cwy.a(6.0, 0.0, 0.0, 10.0, 10.0, 10.0),
         ic.f,
         cwy.a(6.0, 0.0, 6.0, 16.0, 10.0, 10.0)
      )
   );
   private final ahg<cwy> e;
   private final ahg<cwy> f;
   private final ahg<cnb> g;

   @Override
   public MapCodec<cvz> a() {
      return a;
   }

   protected cvz(ahg<cwy> $$0, ahg<cwy> $$1, ahg<cnb> $$2, djo.d $$3) {
      super($$3);
      this.k(this.E.b().a(b, ic.c));
      this.f = $$0;
      this.e = $$1;
      this.g = $$2;
   }

   @Override
   public emv a(djp $$0, ctd $$1, hx $$2, emh $$3) {
      return d.get($$0.c(b));
   }

   @Override
   public djp a(djp $$0, ic $$1, djp $$2, cty $$3, hx $$4, hx $$5) {
      if (!$$2.a(this.e) && $$1 == $$0.c(b)) {
         Optional<cwy> $$6 = $$3.I_().d(ke.f).d(this.f);
         if ($$6.isPresent()) {
            return $$6.get().o().b(det.c, Integer.valueOf(7));
         }
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean b(djp $$0, ctd $$1, hx $$2) {
      return $$0.a(cxa.cC);
   }

   @Override
   public cng a(cua $$0, hx $$1, djp $$2) {
      return new cng((ctw)DataFixUtils.orElse($$0.I_().d(ke.F).d(this.g), this));
   }

   @Override
   public djp a(djp $$0, ddk $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public djp a(djp $$0, dbu $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(djq.a<cwy, djp> $$0) {
      $$0.a(b);
   }
}
