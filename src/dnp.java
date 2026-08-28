import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dnp extends dkl {
   public static final MapCodec<dnp> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ma.e.q().fieldOf("potted").forGetter($$0x -> $$0x.e), t()).apply($$0, dnp::new)
   );
   private static final Map<dkl, dkl> d = Maps.newHashMap();
   public static final float b = 3.0F;
   protected static final fcr c = dkl.a(5.0, 0.0, 5.0, 11.0, 6.0, 11.0);
   private final dkl e;

   @Override
   public MapCodec<dnp> a() {
      return a;
   }

   public dnp(dkl $$0, dxt.d $$1) {
      super($$1);
      this.e = $$0;
      d.put($$0, this);
   }

   @Override
   protected fcr a(dxu $$0, dgm $$1, jh $$2, fcc $$3) {
      return c;
   }

   @Override
   protected bti a(cxo $$0, dxu $$1, dhh $$2, jh $$3, cpw $$4, bth $$5, fbt $$6) {
      dxu $$8 = ($$0.h() instanceof cvu $$7 ? d.getOrDefault($$7.d(), dkn.a) : dkn.a).m();
      if ($$8.l()) {
         return bti.f;
      } else if (!this.q()) {
         return bti.c;
      } else {
         $$2.a($$3, $$8, 3);
         $$2.a($$4, ecq.c, $$3);
         $$4.a(axp.ah);
         $$0.a(1, $$4);
         return bti.a;
      }
   }

   @Override
   protected bti a(dxu $$0, dhh $$1, jh $$2, cpw $$3, fbt $$4) {
      if (this.q()) {
         return bti.c;
      } else {
         cxo $$5 = new cxo(this.e);
         if (!$$3.i($$5)) {
            $$3.a($$5, false);
         }

         $$1.a($$2, dkn.gf.m(), 3);
         $$1.a($$3, ecq.c, $$2);
         return bti.a;
      }
   }

   @Override
   public cxo a(dhk $$0, jh $$1, dxu $$2) {
      return this.q() ? super.a($$0, $$1, $$2) : new cxo(this.e);
   }

   private boolean q() {
      return this.e == dkn.a;
   }

   @Override
   protected dxu a(dxu $$0, dhk $$1, dhw $$2, jh $$3, jm $$4, jh $$5, dxu $$6, bam $$7) {
      return $$4 == jm.a && !$$0.a($$1, $$3) ? dkn.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   public dkl b() {
      return this.e;
   }

   @Override
   protected boolean a(dxu $$0, eul $$1) {
      return false;
   }
}
