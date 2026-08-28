import com.mojang.datafixers.DataFixUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;

public class djf extends dko {
   public static final MapCodec<djf> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               akt.a(mc.f).fieldOf("fruit").forGetter($$0x -> $$0x.d),
               akt.a(mc.f).fieldOf("stem").forGetter($$0x -> $$0x.e),
               akt.a(mc.K).fieldOf("seed").forGetter($$0x -> $$0x.f),
               t()
            )
            .apply($$0, djf::new)
   );
   public static final dyo<jn> b = dod.e;
   private static final Map<jn, fcr> c = fco.c(dke.a(4.0, 0.0, 10.0, 0.0, 10.0));
   private final akt<dke> d;
   private final akt<dke> e;
   private final akt<cxd> f;

   @Override
   public MapCodec<djf> a() {
      return a;
   }

   protected djf(akt<dke> $$0, akt<dke> $$1, akt<cxd> $$2, dxp.d $$3) {
      super($$3);
      this.l(this.B.b().b(b, jn.c));
      this.e = $$0;
      this.d = $$1;
      this.f = $$2;
   }

   @Override
   protected fcr a(dxq $$0, dgf $$1, ji $$2, fcc $$3) {
      return c.get($$0.c(b));
   }

   @Override
   protected dxq a(dxq $$0, dhc $$1, dho $$2, ji $$3, jn $$4, ji $$5, dxq $$6, azh $$7) {
      if (!$$6.a(this.d) && $$4 == $$0.c(b)) {
         Optional<dke> $$8 = $$1.F_().e(mc.f).f(this.e);
         if ($$8.isPresent()) {
            return $$8.get().m().c(dsg.c, Integer.valueOf(7));
         }
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean b(dxq $$0, dgf $$1, ji $$2) {
      return $$0.a(dkg.cK);
   }

   @Override
   protected cxh a(dhc $$0, ji $$1, dxq $$2, boolean $$3) {
      return new cxh((dgy)DataFixUtils.orElse($$0.F_().e(mc.K).f(this.f), this));
   }

   @Override
   protected dxq a(dxq $$0, dqw $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dxq a(dxq $$0, dpf $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dxr.a<dke, dxq> $$0) {
      $$0.a(b);
   }
}
