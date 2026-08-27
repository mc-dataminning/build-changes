import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;

public class cvq extends cwy {
   public static final MapCodec<cvq> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ahf.a(ke.f).fieldOf("fruit").forGetter($$0x -> $$0x.e),
               ahf.a(ke.f).fieldOf("stem").forGetter($$0x -> $$0x.f),
               ahf.a(ke.F).fieldOf("seed").forGetter($$0x -> $$0x.g),
               u()
            )
            .apply($$0, cvq::new)
   );
   public static final dka b = dak.aE;
   protected static final float c = 2.0F;
   private static final Map<ic, eml> d = Maps.newEnumMap(
      ImmutableMap.of(
         ic.d,
         cwp.a(6.0, 0.0, 6.0, 10.0, 10.0, 16.0),
         ic.e,
         cwp.a(0.0, 0.0, 6.0, 10.0, 10.0, 10.0),
         ic.c,
         cwp.a(6.0, 0.0, 0.0, 10.0, 10.0, 10.0),
         ic.f,
         cwp.a(6.0, 0.0, 6.0, 16.0, 10.0, 10.0)
      )
   );
   private final ahf<cwp> e;
   private final ahf<cwp> f;
   private final ahf<cms> g;

   @Override
   public MapCodec<cvq> a() {
      return a;
   }

   protected cvq(ahf<cwp> $$0, ahf<cwp> $$1, ahf<cms> $$2, djf.d $$3) {
      super($$3);
      this.k(this.E.b().a(b, ic.c));
      this.f = $$0;
      this.e = $$1;
      this.g = $$2;
   }

   @Override
   public eml a(djg $$0, csu $$1, hx $$2, elx $$3) {
      return d.get($$0.c(b));
   }

   @Override
   public djg a(djg $$0, ic $$1, djg $$2, ctp $$3, hx $$4, hx $$5) {
      if (!$$2.a(this.e) && $$1 == $$0.c(b)) {
         Optional<cwp> $$6 = $$3.I_().d(ke.f).d(this.f);
         if ($$6.isPresent()) {
            return $$6.get().o().b(dek.c, Integer.valueOf(7));
         }
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean b(djg $$0, csu $$1, hx $$2) {
      return $$0.a(cwr.cC);
   }

   @Override
   public cmx a(ctr $$0, hx $$1, djg $$2) {
      return new cmx((ctn)DataFixUtils.orElse($$0.I_().d(ke.F).d(this.g), this));
   }

   @Override
   public djg a(djg $$0, ddb $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public djg a(djg $$0, dbl $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(djh.a<cwp, djg> $$0) {
      $$0.a(b);
   }
}
