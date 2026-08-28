import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;

public class dje extends dkn {
   public static final MapCodec<dje> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               alo.a(mb.f).fieldOf("fruit").forGetter($$0x -> $$0x.e),
               alo.a(mb.f).fieldOf("stem").forGetter($$0x -> $$0x.f),
               alo.a(mb.K).fieldOf("seed").forGetter($$0x -> $$0x.g),
               t()
            )
            .apply($$0, dje::new)
   );
   public static final dyl<jm> b = dob.aF;
   protected static final float c = 2.0F;
   private static final Map<jm, fcl> d = Maps.newEnumMap(
      ImmutableMap.of(
         jm.d,
         dkd.a(6.0, 0.0, 6.0, 10.0, 10.0, 16.0),
         jm.e,
         dkd.a(0.0, 0.0, 6.0, 10.0, 10.0, 10.0),
         jm.c,
         dkd.a(6.0, 0.0, 0.0, 10.0, 10.0, 10.0),
         jm.f,
         dkd.a(6.0, 0.0, 6.0, 16.0, 10.0, 10.0)
      )
   );
   private final alo<dkd> e;
   private final alo<dkd> f;
   private final alo<cxc> g;

   @Override
   public MapCodec<dje> a() {
      return a;
   }

   protected dje(alo<dkd> $$0, alo<dkd> $$1, alo<cxc> $$2, dxn.d $$3) {
      super($$3);
      this.l(this.F.b().b(b, jm.c));
      this.f = $$0;
      this.e = $$1;
      this.g = $$2;
   }

   @Override
   protected fcl a(dxo $$0, dge $$1, jh $$2, fbw $$3) {
      return d.get($$0.c(b));
   }

   @Override
   protected dxo a(dxo $$0, dhc $$1, dho $$2, jh $$3, jm $$4, jh $$5, dxo $$6, bac $$7) {
      if (!$$6.a(this.e) && $$4 == $$0.c(b)) {
         Optional<dkd> $$8 = $$1.K_().e(mb.f).f(this.f);
         if ($$8.isPresent()) {
            return $$8.get().m().c(dse.c, Integer.valueOf(7));
         }
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean b(dxo $$0, dge $$1, jh $$2) {
      return $$0.a(dkf.cK);
   }

   @Override
   protected cxg a(dhc $$0, jh $$1, dxo $$2) {
      return new cxg((dgy)DataFixUtils.orElse($$0.K_().e(mb.K).f(this.g), this));
   }

   @Override
   protected dxo a(dxo $$0, dqv $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dxo a(dxo $$0, dpc $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dxp.a<dkd, dxo> $$0) {
      $$0.a(b);
   }
}
