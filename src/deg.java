import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;

public class deg extends dfo {
   public static final MapCodec<deg> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               akj.a(lr.f).fieldOf("fruit").forGetter($$0x -> $$0x.e),
               akj.a(lr.f).fieldOf("stem").forGetter($$0x -> $$0x.f),
               akj.a(lr.K).fieldOf("seed").forGetter($$0x -> $$0x.g),
               u()
            )
            .apply($$0, deg::new)
   );
   public static final dtb b = djb.aE;
   protected static final float c = 2.0F;
   private static final Map<jf, ews> d = Maps.newEnumMap(
      ImmutableMap.of(
         jf.d,
         dff.a(6.0, 0.0, 6.0, 10.0, 10.0, 16.0),
         jf.e,
         dff.a(0.0, 0.0, 6.0, 10.0, 10.0, 10.0),
         jf.c,
         dff.a(6.0, 0.0, 0.0, 10.0, 10.0, 10.0),
         jf.f,
         dff.a(6.0, 0.0, 6.0, 16.0, 10.0, 10.0)
      )
   );
   private final akj<dff> e;
   private final akj<dff> f;
   private final akj<ctv> g;

   @Override
   public MapCodec<deg> a() {
      return a;
   }

   protected deg(akj<dff> $$0, akj<dff> $$1, akj<ctv> $$2, dsg.d $$3) {
      super($$3);
      this.k(this.E.b().a(b, jf.c));
      this.f = $$0;
      this.e = $$1;
      this.g = $$2;
   }

   @Override
   protected ews a(dsh $$0, dbj $$1, ja $$2, ewe $$3) {
      return d.get($$0.c(b));
   }

   @Override
   protected dsh a(dsh $$0, jf $$1, dsh $$2, dce $$3, ja $$4, ja $$5) {
      if (!$$2.a(this.e) && $$1 == $$0.c(b)) {
         Optional<dff> $$6 = $$3.H_().d(lr.f).e(this.f);
         if ($$6.isPresent()) {
            return $$6.get().o().b(dnb.c, Integer.valueOf(7));
         }
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean b(dsh $$0, dbj $$1, ja $$2) {
      return $$0.a(dfh.cC);
   }

   @Override
   public cua a(dcg $$0, ja $$1, dsh $$2) {
      return new cua((dcc)DataFixUtils.orElse($$0.H_().d(lr.K).e(this.g), this));
   }

   @Override
   protected dsh a(dsh $$0, dls $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dsh a(dsh $$0, dkc $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dsi.a<dff, dsh> $$0) {
      $$0.a(b);
   }
}
