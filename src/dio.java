import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;

public class dio extends djx {
   public static final MapCodec<dio> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               aku.a(mc.f).fieldOf("fruit").forGetter($$0x -> $$0x.e),
               aku.a(mc.f).fieldOf("stem").forGetter($$0x -> $$0x.f),
               aku.a(mc.K).fieldOf("seed").forGetter($$0x -> $$0x.g),
               t()
            )
            .apply($$0, dio::new)
   );
   public static final dxv<jn> b = dnl.aF;
   protected static final float c = 2.0F;
   private static final Map<jn, fbv> d = Maps.newEnumMap(
      ImmutableMap.of(
         jn.d,
         djn.a(6.0, 0.0, 6.0, 10.0, 10.0, 16.0),
         jn.e,
         djn.a(0.0, 0.0, 6.0, 10.0, 10.0, 10.0),
         jn.c,
         djn.a(6.0, 0.0, 0.0, 10.0, 10.0, 10.0),
         jn.f,
         djn.a(6.0, 0.0, 6.0, 16.0, 10.0, 10.0)
      )
   );
   private final aku<djn> e;
   private final aku<djn> f;
   private final aku<cwm> g;

   @Override
   public MapCodec<dio> a() {
      return a;
   }

   protected dio(aku<djn> $$0, aku<djn> $$1, aku<cwm> $$2, dwx.d $$3) {
      super($$3);
      this.l(this.F.b().b(b, jn.c));
      this.f = $$0;
      this.e = $$1;
      this.g = $$2;
   }

   @Override
   protected fbv a(dwy $$0, dfo $$1, ji $$2, fbg $$3) {
      return d.get($$0.c(b));
   }

   @Override
   protected dwy a(dwy $$0, dgm $$1, dgy $$2, ji $$3, jn $$4, ji $$5, dwy $$6, azh $$7) {
      if (!$$6.a(this.e) && $$4 == $$0.c(b)) {
         Optional<djn> $$8 = $$1.K_().e(mc.f).f(this.f);
         if ($$8.isPresent()) {
            return $$8.get().m().c(dro.c, Integer.valueOf(7));
         }
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean b(dwy $$0, dfo $$1, ji $$2) {
      return $$0.a(djp.cK);
   }

   @Override
   protected cwq a(dgm $$0, ji $$1, dwy $$2, boolean $$3) {
      return new cwq((dgi)DataFixUtils.orElse($$0.K_().e(mc.K).f(this.g), this));
   }

   @Override
   protected dwy a(dwy $$0, dqf $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dwy a(dwy $$0, dom $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dwz.a<djn, dwy> $$0) {
      $$0.a(b);
   }
}
