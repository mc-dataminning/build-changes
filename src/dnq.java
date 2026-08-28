import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dnq extends dkm {
   public static final MapCodec<dnq> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ma.e.q().fieldOf("potted").forGetter($$0x -> $$0x.e), t()).apply($$0, dnq::new)
   );
   private static final Map<dkm, dkm> d = Maps.newHashMap();
   public static final float b = 3.0F;
   protected static final fcs c = dkm.a(5.0, 0.0, 5.0, 11.0, 6.0, 11.0);
   private final dkm e;

   @Override
   public MapCodec<dnq> a() {
      return a;
   }

   public dnq(dkm $$0, dxu.d $$1) {
      super($$1);
      this.e = $$0;
      d.put($$0, this);
   }

   @Override
   protected fcs a(dxv $$0, dgn $$1, jh $$2, fcd $$3) {
      return c;
   }

   @Override
   protected btj a(cxp $$0, dxv $$1, dhi $$2, jh $$3, cpx $$4, bti $$5, fbu $$6) {
      dxv $$8 = ($$0.h() instanceof cvv $$7 ? d.getOrDefault($$7.d(), dko.a) : dko.a).m();
      if ($$8.l()) {
         return btj.f;
      } else if (!this.q()) {
         return btj.c;
      } else {
         $$2.a($$3, $$8, 3);
         $$2.a($$4, ecr.c, $$3);
         $$4.a(axp.ah);
         $$0.a(1, $$4);
         return btj.a;
      }
   }

   @Override
   protected btj a(dxv $$0, dhi $$1, jh $$2, cpx $$3, fbu $$4) {
      if (this.q()) {
         return btj.c;
      } else {
         cxp $$5 = new cxp(this.e);
         if (!$$3.i($$5)) {
            $$3.a($$5, false);
         }

         $$1.a($$2, dko.gf.m(), 3);
         $$1.a($$3, ecr.c, $$2);
         return btj.a;
      }
   }

   @Override
   public cxp a(dhl $$0, jh $$1, dxv $$2) {
      return this.q() ? super.a($$0, $$1, $$2) : new cxp(this.e);
   }

   private boolean q() {
      return this.e == dko.a;
   }

   @Override
   protected dxv a(dxv $$0, dhl $$1, dhx $$2, jh $$3, jm $$4, jh $$5, dxv $$6, bam $$7) {
      return $$4 == jm.a && !$$0.a($$1, $$3) ? dko.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   public dkm b() {
      return this.e;
   }

   @Override
   protected boolean a(dxv $$0, eum $$1) {
      return false;
   }
}
