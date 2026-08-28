import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;

public class dec extends dfk {
   public static final MapCodec<dec> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ale.a(lq.f).fieldOf("fruit").forGetter($$0x -> $$0x.e),
               ale.a(lq.f).fieldOf("stem").forGetter($$0x -> $$0x.f),
               ale.a(lq.G).fieldOf("seed").forGetter($$0x -> $$0x.g),
               u()
            )
            .apply($$0, dec::new)
   );
   public static final dsy b = dix.aE;
   protected static final float c = 2.0F;
   private static final Map<je, ewm> d = Maps.newEnumMap(
      ImmutableMap.of(
         je.d,
         dfb.a(6.0, 0.0, 6.0, 10.0, 10.0, 16.0),
         je.e,
         dfb.a(0.0, 0.0, 6.0, 10.0, 10.0, 10.0),
         je.c,
         dfb.a(6.0, 0.0, 0.0, 10.0, 10.0, 10.0),
         je.f,
         dfb.a(6.0, 0.0, 6.0, 16.0, 10.0, 10.0)
      )
   );
   private final ale<dfb> e;
   private final ale<dfb> f;
   private final ale<cum> g;

   @Override
   public MapCodec<dec> a() {
      return a;
   }

   protected dec(ale<dfb> $$0, ale<dfb> $$1, ale<cum> $$2, dsd.d $$3) {
      super($$3);
      this.k(this.E.b().a(b, je.c));
      this.f = $$0;
      this.e = $$1;
      this.g = $$2;
   }

   @Override
   protected ewm a(dse $$0, dbg $$1, iz $$2, evy $$3) {
      return d.get($$0.c(b));
   }

   @Override
   protected dse a(dse $$0, je $$1, dse $$2, dcb $$3, iz $$4, iz $$5) {
      if (!$$2.a(this.e) && $$1 == $$0.c(b)) {
         Optional<dfb> $$6 = $$3.H_().d(lq.f).e(this.f);
         if ($$6.isPresent()) {
            return $$6.get().o().b(dmx.c, Integer.valueOf(7));
         }
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean b(dse $$0, dbg $$1, iz $$2) {
      return $$0.a(dfd.cC);
   }

   @Override
   public cur a(dcd $$0, iz $$1, dse $$2) {
      return new cur((dbz)DataFixUtils.orElse($$0.H_().d(lq.G).e(this.g), this));
   }

   @Override
   protected dse a(dse $$0, dlo $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dse a(dse $$0, djy $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dsf.a<dfb, dse> $$0) {
      $$0.a(b);
   }
}
