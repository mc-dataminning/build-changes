import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;

public class dej extends dfr {
   public static final MapCodec<dej> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               akj.a(lr.f).fieldOf("fruit").forGetter($$0x -> $$0x.e),
               akj.a(lr.f).fieldOf("stem").forGetter($$0x -> $$0x.f),
               akj.a(lr.K).fieldOf("seed").forGetter($$0x -> $$0x.g),
               u()
            )
            .apply($$0, dej::new)
   );
   public static final dtf b = dje.aE;
   protected static final float c = 2.0F;
   private static final Map<jf, exa> d = Maps.newEnumMap(
      ImmutableMap.of(
         jf.d,
         dfi.a(6.0, 0.0, 6.0, 10.0, 10.0, 16.0),
         jf.e,
         dfi.a(0.0, 0.0, 6.0, 10.0, 10.0, 10.0),
         jf.c,
         dfi.a(6.0, 0.0, 0.0, 10.0, 10.0, 10.0),
         jf.f,
         dfi.a(6.0, 0.0, 6.0, 16.0, 10.0, 10.0)
      )
   );
   private final akj<dfi> e;
   private final akj<dfi> f;
   private final akj<cty> g;

   @Override
   public MapCodec<dej> a() {
      return a;
   }

   protected dej(akj<dfi> $$0, akj<dfi> $$1, akj<cty> $$2, dsk.d $$3) {
      super($$3);
      this.k(this.E.b().a(b, jf.c));
      this.f = $$0;
      this.e = $$1;
      this.g = $$2;
   }

   @Override
   protected exa a(dsl $$0, dbm $$1, ja $$2, ewm $$3) {
      return d.get($$0.c(b));
   }

   @Override
   protected dsl a(dsl $$0, jf $$1, dsl $$2, dch $$3, ja $$4, ja $$5) {
      if (!$$2.a(this.e) && $$1 == $$0.c(b)) {
         Optional<dfi> $$6 = $$3.H_().d(lr.f).e(this.f);
         if ($$6.isPresent()) {
            return $$6.get().o().b(dne.c, Integer.valueOf(7));
         }
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean b(dsl $$0, dbm $$1, ja $$2) {
      return $$0.a(dfk.cC);
   }

   @Override
   public cud a(dcj $$0, ja $$1, dsl $$2) {
      return new cud((dcf)DataFixUtils.orElse($$0.H_().d(lr.K).e(this.g), this));
   }

   @Override
   protected dsl a(dsl $$0, dlv $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dsl a(dsl $$0, dkf $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dsm.a<dfi, dsl> $$0) {
      $$0.a(b);
   }
}
