import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;

public class dei extends dfq {
   public static final MapCodec<dei> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               akj.a(lr.f).fieldOf("fruit").forGetter($$0x -> $$0x.e),
               akj.a(lr.f).fieldOf("stem").forGetter($$0x -> $$0x.f),
               akj.a(lr.K).fieldOf("seed").forGetter($$0x -> $$0x.g),
               u()
            )
            .apply($$0, dei::new)
   );
   public static final dte b = djd.aE;
   protected static final float c = 2.0F;
   private static final Map<jf, ewy> d = Maps.newEnumMap(
      ImmutableMap.of(
         jf.d,
         dfh.a(6.0, 0.0, 6.0, 10.0, 10.0, 16.0),
         jf.e,
         dfh.a(0.0, 0.0, 6.0, 10.0, 10.0, 10.0),
         jf.c,
         dfh.a(6.0, 0.0, 0.0, 10.0, 10.0, 10.0),
         jf.f,
         dfh.a(6.0, 0.0, 6.0, 16.0, 10.0, 10.0)
      )
   );
   private final akj<dfh> e;
   private final akj<dfh> f;
   private final akj<ctx> g;

   @Override
   public MapCodec<dei> a() {
      return a;
   }

   protected dei(akj<dfh> $$0, akj<dfh> $$1, akj<ctx> $$2, dsj.d $$3) {
      super($$3);
      this.k(this.E.b().a(b, jf.c));
      this.f = $$0;
      this.e = $$1;
      this.g = $$2;
   }

   @Override
   protected ewy a(dsk $$0, dbl $$1, ja $$2, ewk $$3) {
      return d.get($$0.c(b));
   }

   @Override
   protected dsk a(dsk $$0, jf $$1, dsk $$2, dcg $$3, ja $$4, ja $$5) {
      if (!$$2.a(this.e) && $$1 == $$0.c(b)) {
         Optional<dfh> $$6 = $$3.H_().d(lr.f).e(this.f);
         if ($$6.isPresent()) {
            return $$6.get().o().b(dnd.c, Integer.valueOf(7));
         }
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean b(dsk $$0, dbl $$1, ja $$2) {
      return $$0.a(dfj.cC);
   }

   @Override
   public cuc a(dci $$0, ja $$1, dsk $$2) {
      return new cuc((dce)DataFixUtils.orElse($$0.H_().d(lr.K).e(this.g), this));
   }

   @Override
   protected dsk a(dsk $$0, dlu $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dsk a(dsk $$0, dke $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dsl.a<dfh, dsk> $$0) {
      $$0.a(b);
   }
}
