import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;

public class dim extends djv {
   public static final MapCodec<dim> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               aku.a(mc.f).fieldOf("fruit").forGetter($$0x -> $$0x.e),
               aku.a(mc.f).fieldOf("stem").forGetter($$0x -> $$0x.f),
               aku.a(mc.K).fieldOf("seed").forGetter($$0x -> $$0x.g),
               t()
            )
            .apply($$0, dim::new)
   );
   public static final dxt<jn> b = dnj.aF;
   protected static final float c = 2.0F;
   private static final Map<jn, fbt> d = Maps.newEnumMap(
      ImmutableMap.of(
         jn.d,
         djl.a(6.0, 0.0, 6.0, 10.0, 10.0, 16.0),
         jn.e,
         djl.a(0.0, 0.0, 6.0, 10.0, 10.0, 10.0),
         jn.c,
         djl.a(6.0, 0.0, 0.0, 10.0, 10.0, 10.0),
         jn.f,
         djl.a(6.0, 0.0, 6.0, 16.0, 10.0, 10.0)
      )
   );
   private final aku<djl> e;
   private final aku<djl> f;
   private final aku<cwk> g;

   @Override
   public MapCodec<dim> a() {
      return a;
   }

   protected dim(aku<djl> $$0, aku<djl> $$1, aku<cwk> $$2, dwv.d $$3) {
      super($$3);
      this.l(this.F.b().b(b, jn.c));
      this.f = $$0;
      this.e = $$1;
      this.g = $$2;
   }

   @Override
   protected fbt a(dww $$0, dfm $$1, ji $$2, fbe $$3) {
      return d.get($$0.c(b));
   }

   @Override
   protected dww a(dww $$0, dgk $$1, dgw $$2, ji $$3, jn $$4, ji $$5, dww $$6, azh $$7) {
      if (!$$6.a(this.e) && $$4 == $$0.c(b)) {
         Optional<djl> $$8 = $$1.K_().e(mc.f).f(this.f);
         if ($$8.isPresent()) {
            return $$8.get().m().c(drm.c, Integer.valueOf(7));
         }
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean b(dww $$0, dfm $$1, ji $$2) {
      return $$0.a(djn.cK);
   }

   @Override
   protected cwo a(dgk $$0, ji $$1, dww $$2, boolean $$3) {
      return new cwo((dgg)DataFixUtils.orElse($$0.K_().e(mc.K).f(this.g), this));
   }

   @Override
   protected dww a(dww $$0, dqd $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dww a(dww $$0, dok $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dwx.a<djl, dww> $$0) {
      $$0.a(b);
   }
}
