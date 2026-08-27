import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;

public class czd extends dal {
   public static final MapCodec<czd> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ajg.a(kj.f).fieldOf("fruit").forGetter($$0x -> $$0x.e),
               ajg.a(kj.f).fieldOf("stem").forGetter($$0x -> $$0x.f),
               ajg.a(kj.F).fieldOf("seed").forGetter($$0x -> $$0x.g),
               u()
            )
            .apply($$0, czd::new)
   );
   public static final dnv b = ddx.aE;
   protected static final float c = 2.0F;
   private static final Map<ih, eqm> d = Maps.newEnumMap(
      ImmutableMap.of(
         ih.d,
         dac.a(6.0, 0.0, 6.0, 10.0, 10.0, 16.0),
         ih.e,
         dac.a(0.0, 0.0, 6.0, 10.0, 10.0, 10.0),
         ih.c,
         dac.a(6.0, 0.0, 0.0, 10.0, 10.0, 10.0),
         ih.f,
         dac.a(6.0, 0.0, 6.0, 16.0, 10.0, 10.0)
      )
   );
   private final ajg<dac> e;
   private final ajg<dac> f;
   private final ajg<cqh> g;

   @Override
   public MapCodec<czd> a() {
      return a;
   }

   protected czd(ajg<dac> $$0, ajg<dac> $$1, ajg<cqh> $$2, dna.d $$3) {
      super($$3);
      this.k(this.E.b().a(b, ih.c));
      this.f = $$0;
      this.e = $$1;
      this.g = $$2;
   }

   @Override
   protected eqm a(dnb $$0, cwh $$1, ib $$2, epy $$3) {
      return d.get($$0.c(b));
   }

   @Override
   protected dnb a(dnb $$0, ih $$1, dnb $$2, cxc $$3, ib $$4, ib $$5) {
      if (!$$2.a(this.e) && $$1 == $$0.c(b)) {
         Optional<dac> $$6 = $$3.H_().d(kj.f).e(this.f);
         if ($$6.isPresent()) {
            return $$6.get().o().b(dhx.c, Integer.valueOf(7));
         }
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean b(dnb $$0, cwh $$1, ib $$2) {
      return $$0.a(dae.cC);
   }

   @Override
   public cqm a(cxe $$0, ib $$1, dnb $$2) {
      return new cqm((cxa)DataFixUtils.orElse($$0.H_().d(kj.F).e(this.g), this));
   }

   @Override
   protected dnb a(dnb $$0, dgo $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dnb a(dnb $$0, dey $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dnc.a<dac, dnb> $$0) {
      $$0.a(b);
   }
}
