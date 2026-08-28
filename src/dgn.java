import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;

public class dgn extends dhv {
   public static final MapCodec<dgn> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ald.a(lw.f).fieldOf("fruit").forGetter($$0x -> $$0x.e),
               ald.a(lw.f).fieldOf("stem").forGetter($$0x -> $$0x.f),
               ald.a(lw.K).fieldOf("seed").forGetter($$0x -> $$0x.g),
               t()
            )
            .apply($$0, dgn::new)
   );
   public static final dvm b = dli.aF;
   protected static final float c = 2.0F;
   private static final Map<jk, ezq> d = Maps.newEnumMap(
      ImmutableMap.of(
         jk.d,
         dhm.a(6.0, 0.0, 6.0, 10.0, 10.0, 16.0),
         jk.e,
         dhm.a(0.0, 0.0, 6.0, 10.0, 10.0, 10.0),
         jk.c,
         dhm.a(6.0, 0.0, 0.0, 10.0, 10.0, 10.0),
         jk.f,
         dhm.a(6.0, 0.0, 6.0, 16.0, 10.0, 10.0)
      )
   );
   private final ald<dhm> e;
   private final ald<dhm> f;
   private final ald<cvn> g;

   @Override
   public MapCodec<dgn> a() {
      return a;
   }

   protected dgn(ald<dhm> $$0, ald<dhm> $$1, ald<cvn> $$2, dur.d $$3) {
      super($$3);
      this.l(this.F.b().b(b, jk.c));
      this.f = $$0;
      this.e = $$1;
      this.g = $$2;
   }

   @Override
   protected ezq a(dus $$0, ddo $$1, jf $$2, ezb $$3) {
      return d.get($$0.c(b));
   }

   @Override
   protected dus a(dus $$0, jk $$1, dus $$2, dek $$3, jf $$4, jf $$5) {
      if (!$$2.a(this.e) && $$1 == $$0.c(b)) {
         Optional<dhm> $$6 = $$3.G_().e(lw.f).f(this.f);
         if ($$6.isPresent()) {
            return $$6.get().n().c(dpj.c, Integer.valueOf(7));
         }
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean b(dus $$0, ddo $$1, jf $$2) {
      return $$0.a(dho.cC);
   }

   @Override
   public cvs a(dem $$0, jf $$1, dus $$2) {
      return new cvs((dei)DataFixUtils.orElse($$0.G_().e(lw.K).f(this.g), this));
   }

   @Override
   protected dus a(dus $$0, doa $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dus a(dus $$0, dmj $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dut.a<dhm, dus> $$0) {
      $$0.a(b);
   }
}
