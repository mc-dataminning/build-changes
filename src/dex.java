import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;

public class dex extends dgf {
   public static final MapCodec<dex> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               akp.a(lu.f).fieldOf("fruit").forGetter($$0x -> $$0x.e),
               akp.a(lu.f).fieldOf("stem").forGetter($$0x -> $$0x.f),
               akp.a(lu.K).fieldOf("seed").forGetter($$0x -> $$0x.g),
               u()
            )
            .apply($$0, dex::new)
   );
   public static final dtu b = djs.aE;
   protected static final float c = 2.0F;
   private static final Map<ji, exp> d = Maps.newEnumMap(
      ImmutableMap.of(
         ji.d,
         dfw.a(6.0, 0.0, 6.0, 10.0, 10.0, 16.0),
         ji.e,
         dfw.a(0.0, 0.0, 6.0, 10.0, 10.0, 10.0),
         ji.c,
         dfw.a(6.0, 0.0, 0.0, 10.0, 10.0, 10.0),
         ji.f,
         dfw.a(6.0, 0.0, 6.0, 16.0, 10.0, 10.0)
      )
   );
   private final akp<dfw> e;
   private final akp<dfw> f;
   private final akp<cuj> g;

   @Override
   public MapCodec<dex> a() {
      return a;
   }

   protected dex(akp<dfw> $$0, akp<dfw> $$1, akp<cuj> $$2, dsz.d $$3) {
      super($$3);
      this.k(this.E.b().a(b, ji.c));
      this.f = $$0;
      this.e = $$1;
      this.g = $$2;
   }

   @Override
   protected exp a(dta $$0, dca $$1, jd $$2, exb $$3) {
      return d.get($$0.c(b));
   }

   @Override
   protected dta a(dta $$0, ji $$1, dta $$2, dcv $$3, jd $$4, jd $$5) {
      if (!$$2.a(this.e) && $$1 == $$0.c(b)) {
         Optional<dfw> $$6 = $$3.H_().d(lu.f).e(this.f);
         if ($$6.isPresent()) {
            return $$6.get().o().b(dnt.c, Integer.valueOf(7));
         }
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean b(dta $$0, dca $$1, jd $$2) {
      return $$0.a(dfy.cC);
   }

   @Override
   public cuo a(dcx $$0, jd $$1, dta $$2) {
      return new cuo((dct)DataFixUtils.orElse($$0.H_().d(lu.K).e(this.g), this));
   }

   @Override
   protected dta a(dta $$0, dmk $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dta a(dta $$0, dkt $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dtb.a<dfw, dta> $$0) {
      $$0.a(b);
   }
}
