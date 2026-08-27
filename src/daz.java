import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;

public class daz extends dch {
   public static final MapCodec<daz> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ajs.a(ks.f).fieldOf("fruit").forGetter($$0x -> $$0x.e),
               ajs.a(ks.f).fieldOf("stem").forGetter($$0x -> $$0x.f),
               ajs.a(ks.F).fieldOf("seed").forGetter($$0x -> $$0x.g),
               u()
            )
            .apply($$0, daz::new)
   );
   public static final dpt b = dft.aE;
   protected static final float c = 2.0F;
   private static final Map<ih, est> d = Maps.newEnumMap(
      ImmutableMap.of(
         ih.d,
         dby.a(6.0, 0.0, 6.0, 10.0, 10.0, 16.0),
         ih.e,
         dby.a(0.0, 0.0, 6.0, 10.0, 10.0, 10.0),
         ih.c,
         dby.a(6.0, 0.0, 0.0, 10.0, 10.0, 10.0),
         ih.f,
         dby.a(6.0, 0.0, 6.0, 16.0, 10.0, 10.0)
      )
   );
   private final ajs<dby> e;
   private final ajs<dby> f;
   private final ajs<cre> g;

   @Override
   public MapCodec<daz> a() {
      return a;
   }

   protected daz(ajs<dby> $$0, ajs<dby> $$1, ajs<cre> $$2, doy.d $$3) {
      super($$3);
      this.k(this.E.b().a(b, ih.c));
      this.f = $$0;
      this.e = $$1;
      this.g = $$2;
   }

   @Override
   protected est a(doz $$0, cyd $$1, ib $$2, esf $$3) {
      return d.get($$0.c(b));
   }

   @Override
   protected doz a(doz $$0, ih $$1, doz $$2, cyy $$3, ib $$4, ib $$5) {
      if (!$$2.a(this.e) && $$1 == $$0.c(b)) {
         Optional<dby> $$6 = $$3.H_().d(ks.f).e(this.f);
         if ($$6.isPresent()) {
            return $$6.get().n().b(djt.c, Integer.valueOf(7));
         }
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean b(doz $$0, cyd $$1, ib $$2) {
      return $$0.a(dca.cC);
   }

   @Override
   public crj a(cza $$0, ib $$1, doz $$2) {
      return new crj((cyw)DataFixUtils.orElse($$0.H_().d(ks.F).e(this.g), this));
   }

   @Override
   protected doz a(doz $$0, dik $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected doz a(doz $$0, dgu $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dpa.a<dby, doz> $$0) {
      $$0.a(b);
   }
}
