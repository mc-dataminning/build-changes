import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;

public class ddz extends dfh {
   public static final MapCodec<ddz> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ald.a(lq.f).fieldOf("fruit").forGetter($$0x -> $$0x.e),
               ald.a(lq.f).fieldOf("stem").forGetter($$0x -> $$0x.f),
               ald.a(lq.G).fieldOf("seed").forGetter($$0x -> $$0x.g),
               u()
            )
            .apply($$0, ddz::new)
   );
   public static final dsv b = diu.aE;
   protected static final float c = 2.0F;
   private static final Map<je, ewj> d = Maps.newEnumMap(
      ImmutableMap.of(
         je.d,
         dey.a(6.0, 0.0, 6.0, 10.0, 10.0, 16.0),
         je.e,
         dey.a(0.0, 0.0, 6.0, 10.0, 10.0, 10.0),
         je.c,
         dey.a(6.0, 0.0, 0.0, 10.0, 10.0, 10.0),
         je.f,
         dey.a(6.0, 0.0, 6.0, 16.0, 10.0, 10.0)
      )
   );
   private final ald<dey> e;
   private final ald<dey> f;
   private final ald<cuj> g;

   @Override
   public MapCodec<ddz> a() {
      return a;
   }

   protected ddz(ald<dey> $$0, ald<dey> $$1, ald<cuj> $$2, dsa.d $$3) {
      super($$3);
      this.k(this.E.b().a(b, je.c));
      this.f = $$0;
      this.e = $$1;
      this.g = $$2;
   }

   @Override
   protected ewj a(dsb $$0, dbd $$1, iz $$2, evv $$3) {
      return d.get($$0.c(b));
   }

   @Override
   protected dsb a(dsb $$0, je $$1, dsb $$2, dby $$3, iz $$4, iz $$5) {
      if (!$$2.a(this.e) && $$1 == $$0.c(b)) {
         Optional<dey> $$6 = $$3.H_().d(lq.f).e(this.f);
         if ($$6.isPresent()) {
            return $$6.get().o().b(dmu.c, Integer.valueOf(7));
         }
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean b(dsb $$0, dbd $$1, iz $$2) {
      return $$0.a(dfa.cC);
   }

   @Override
   public cuo a(dca $$0, iz $$1, dsb $$2) {
      return new cuo((dbw)DataFixUtils.orElse($$0.H_().d(lq.G).e(this.g), this));
   }

   @Override
   protected dsb a(dsb $$0, dll $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dsb a(dsb $$0, djv $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dsc.a<dey, dsb> $$0) {
      $$0.a(b);
   }
}
