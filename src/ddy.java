import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;

public class ddy extends dfg {
   public static final MapCodec<ddy> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ald.a(lq.f).fieldOf("fruit").forGetter($$0x -> $$0x.e),
               ald.a(lq.f).fieldOf("stem").forGetter($$0x -> $$0x.f),
               ald.a(lq.G).fieldOf("seed").forGetter($$0x -> $$0x.g),
               u()
            )
            .apply($$0, ddy::new)
   );
   public static final dsu b = dit.aE;
   protected static final float c = 2.0F;
   private static final Map<je, ewi> d = Maps.newEnumMap(
      ImmutableMap.of(
         je.d,
         dex.a(6.0, 0.0, 6.0, 10.0, 10.0, 16.0),
         je.e,
         dex.a(0.0, 0.0, 6.0, 10.0, 10.0, 10.0),
         je.c,
         dex.a(6.0, 0.0, 0.0, 10.0, 10.0, 10.0),
         je.f,
         dex.a(6.0, 0.0, 6.0, 16.0, 10.0, 10.0)
      )
   );
   private final ald<dex> e;
   private final ald<dex> f;
   private final ald<cui> g;

   @Override
   public MapCodec<ddy> a() {
      return a;
   }

   protected ddy(ald<dex> $$0, ald<dex> $$1, ald<cui> $$2, drz.d $$3) {
      super($$3);
      this.k(this.E.b().a(b, je.c));
      this.f = $$0;
      this.e = $$1;
      this.g = $$2;
   }

   @Override
   protected ewi a(dsa $$0, dbc $$1, iz $$2, evu $$3) {
      return d.get($$0.c(b));
   }

   @Override
   protected dsa a(dsa $$0, je $$1, dsa $$2, dbx $$3, iz $$4, iz $$5) {
      if (!$$2.a(this.e) && $$1 == $$0.c(b)) {
         Optional<dex> $$6 = $$3.H_().d(lq.f).e(this.f);
         if ($$6.isPresent()) {
            return $$6.get().o().b(dmt.c, Integer.valueOf(7));
         }
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean b(dsa $$0, dbc $$1, iz $$2) {
      return $$0.a(dez.cC);
   }

   @Override
   public cun a(dbz $$0, iz $$1, dsa $$2) {
      return new cun((dbv)DataFixUtils.orElse($$0.H_().d(lq.G).e(this.g), this));
   }

   @Override
   protected dsa a(dsa $$0, dlk $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dsa a(dsa $$0, dju $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dsb.a<dex, dsa> $$0) {
      $$0.a(b);
   }
}
