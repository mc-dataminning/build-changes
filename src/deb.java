import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;

public class deb extends dfj {
   public static final MapCodec<deb> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ale.a(lq.f).fieldOf("fruit").forGetter($$0x -> $$0x.e),
               ale.a(lq.f).fieldOf("stem").forGetter($$0x -> $$0x.f),
               ale.a(lq.G).fieldOf("seed").forGetter($$0x -> $$0x.g),
               u()
            )
            .apply($$0, deb::new)
   );
   public static final dsx b = diw.aE;
   protected static final float c = 2.0F;
   private static final Map<je, ewl> d = Maps.newEnumMap(
      ImmutableMap.of(
         je.d,
         dfa.a(6.0, 0.0, 6.0, 10.0, 10.0, 16.0),
         je.e,
         dfa.a(0.0, 0.0, 6.0, 10.0, 10.0, 10.0),
         je.c,
         dfa.a(6.0, 0.0, 0.0, 10.0, 10.0, 10.0),
         je.f,
         dfa.a(6.0, 0.0, 6.0, 16.0, 10.0, 10.0)
      )
   );
   private final ale<dfa> e;
   private final ale<dfa> f;
   private final ale<cul> g;

   @Override
   public MapCodec<deb> a() {
      return a;
   }

   protected deb(ale<dfa> $$0, ale<dfa> $$1, ale<cul> $$2, dsc.d $$3) {
      super($$3);
      this.k(this.E.b().a(b, je.c));
      this.f = $$0;
      this.e = $$1;
      this.g = $$2;
   }

   @Override
   protected ewl a(dsd $$0, dbf $$1, iz $$2, evx $$3) {
      return d.get($$0.c(b));
   }

   @Override
   protected dsd a(dsd $$0, je $$1, dsd $$2, dca $$3, iz $$4, iz $$5) {
      if (!$$2.a(this.e) && $$1 == $$0.c(b)) {
         Optional<dfa> $$6 = $$3.H_().d(lq.f).e(this.f);
         if ($$6.isPresent()) {
            return $$6.get().o().b(dmw.c, Integer.valueOf(7));
         }
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean b(dsd $$0, dbf $$1, iz $$2) {
      return $$0.a(dfc.cC);
   }

   @Override
   public cuq a(dcc $$0, iz $$1, dsd $$2) {
      return new cuq((dby)DataFixUtils.orElse($$0.H_().d(lq.G).e(this.g), this));
   }

   @Override
   protected dsd a(dsd $$0, dln $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dsd a(dsd $$0, djx $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dse.a<dfa, dsd> $$0) {
      $$0.a(b);
   }
}
