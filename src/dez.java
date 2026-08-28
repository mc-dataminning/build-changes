import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;

public class dez extends dgh {
   public static final MapCodec<dez> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               akq.a(lu.f).fieldOf("fruit").forGetter($$0x -> $$0x.e),
               akq.a(lu.f).fieldOf("stem").forGetter($$0x -> $$0x.f),
               akq.a(lu.K).fieldOf("seed").forGetter($$0x -> $$0x.g),
               u()
            )
            .apply($$0, dez::new)
   );
   public static final dtw b = dju.aE;
   protected static final float c = 2.0F;
   private static final Map<ji, ext> d = Maps.newEnumMap(
      ImmutableMap.of(
         ji.d,
         dfy.a(6.0, 0.0, 6.0, 10.0, 10.0, 16.0),
         ji.e,
         dfy.a(0.0, 0.0, 6.0, 10.0, 10.0, 10.0),
         ji.c,
         dfy.a(6.0, 0.0, 0.0, 10.0, 10.0, 10.0),
         ji.f,
         dfy.a(6.0, 0.0, 6.0, 16.0, 10.0, 10.0)
      )
   );
   private final akq<dfy> e;
   private final akq<dfy> f;
   private final akq<cul> g;

   @Override
   public MapCodec<dez> a() {
      return a;
   }

   protected dez(akq<dfy> $$0, akq<dfy> $$1, akq<cul> $$2, dtb.d $$3) {
      super($$3);
      this.k(this.E.b().a(b, ji.c));
      this.f = $$0;
      this.e = $$1;
      this.g = $$2;
   }

   @Override
   protected ext a(dtc $$0, dcc $$1, jd $$2, exf $$3) {
      return d.get($$0.c(b));
   }

   @Override
   protected dtc a(dtc $$0, ji $$1, dtc $$2, dcx $$3, jd $$4, jd $$5) {
      if (!$$2.a(this.e) && $$1 == $$0.c(b)) {
         Optional<dfy> $$6 = $$3.H_().d(lu.f).e(this.f);
         if ($$6.isPresent()) {
            return $$6.get().o().b(dnv.c, Integer.valueOf(7));
         }
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean b(dtc $$0, dcc $$1, jd $$2) {
      return $$0.a(dga.cC);
   }

   @Override
   public cuq a(dcz $$0, jd $$1, dtc $$2) {
      return new cuq((dcv)DataFixUtils.orElse($$0.H_().d(lu.K).e(this.g), this));
   }

   @Override
   protected dtc a(dtc $$0, dmm $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dtc a(dtc $$0, dkv $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dtd.a<dfy, dtc> $$0) {
      $$0.a(b);
   }
}
