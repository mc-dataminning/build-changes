import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;

public class din extends djw {
   public static final MapCodec<din> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               akt.a(mc.f).fieldOf("fruit").forGetter($$0x -> $$0x.e),
               akt.a(mc.f).fieldOf("stem").forGetter($$0x -> $$0x.f),
               akt.a(mc.K).fieldOf("seed").forGetter($$0x -> $$0x.g),
               t()
            )
            .apply($$0, din::new)
   );
   public static final dxu<jn> b = dnk.aF;
   protected static final float c = 2.0F;
   private static final Map<jn, fbu> d = Maps.newEnumMap(
      ImmutableMap.of(
         jn.d,
         djm.a(6.0, 0.0, 6.0, 10.0, 10.0, 16.0),
         jn.e,
         djm.a(0.0, 0.0, 6.0, 10.0, 10.0, 10.0),
         jn.c,
         djm.a(6.0, 0.0, 0.0, 10.0, 10.0, 10.0),
         jn.f,
         djm.a(6.0, 0.0, 6.0, 16.0, 10.0, 10.0)
      )
   );
   private final akt<djm> e;
   private final akt<djm> f;
   private final akt<cwl> g;

   @Override
   public MapCodec<din> a() {
      return a;
   }

   protected din(akt<djm> $$0, akt<djm> $$1, akt<cwl> $$2, dww.d $$3) {
      super($$3);
      this.l(this.F.b().b(b, jn.c));
      this.f = $$0;
      this.e = $$1;
      this.g = $$2;
   }

   @Override
   protected fbu a(dwx $$0, dfn $$1, ji $$2, fbf $$3) {
      return d.get($$0.c(b));
   }

   @Override
   protected dwx a(dwx $$0, dgl $$1, dgx $$2, ji $$3, jn $$4, ji $$5, dwx $$6, azh $$7) {
      if (!$$6.a(this.e) && $$4 == $$0.c(b)) {
         Optional<djm> $$8 = $$1.K_().e(mc.f).f(this.f);
         if ($$8.isPresent()) {
            return $$8.get().m().c(drn.c, Integer.valueOf(7));
         }
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean b(dwx $$0, dfn $$1, ji $$2) {
      return $$0.a(djo.cK);
   }

   @Override
   protected cwp a(dgl $$0, ji $$1, dwx $$2, boolean $$3) {
      return new cwp((dgh)DataFixUtils.orElse($$0.K_().e(mc.K).f(this.g), this));
   }

   @Override
   protected dwx a(dwx $$0, dqe $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dwx a(dwx $$0, dol $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dwy.a<djm, dwx> $$0) {
      $$0.a(b);
   }
}
