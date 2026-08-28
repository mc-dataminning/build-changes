import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dnh extends dkd {
   public static final MapCodec<dnh> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ma.e.q().fieldOf("potted").forGetter($$0x -> $$0x.e), t()).apply($$0, dnh::new)
   );
   private static final Map<dkd, dkd> d = Maps.newHashMap();
   public static final float b = 3.0F;
   protected static final fcl c = dkd.a(5.0, 0.0, 5.0, 11.0, 6.0, 11.0);
   private final dkd e;

   @Override
   public MapCodec<dnh> a() {
      return a;
   }

   public dnh(dkd $$0, dxn.d $$1) {
      super($$1);
      this.e = $$0;
      d.put($$0, this);
   }

   @Override
   protected fcl a(dxo $$0, dge $$1, jh $$2, fbw $$3) {
      return c;
   }

   @Override
   protected bta a(cxg $$0, dxo $$1, dgz $$2, jh $$3, cpo $$4, bsz $$5, fbn $$6) {
      dxo $$8 = ($$0.h() instanceof cvm $$7 ? d.getOrDefault($$7.d(), dkf.a) : dkf.a).m();
      if ($$8.l()) {
         return bta.f;
      } else if (!this.q()) {
         return bta.c;
      } else {
         $$2.a($$3, $$8, 3);
         $$2.a($$4, eck.c, $$3);
         $$4.a(axf.ah);
         $$0.a(1, $$4);
         return bta.a;
      }
   }

   @Override
   protected bta a(dxo $$0, dgz $$1, jh $$2, cpo $$3, fbn $$4) {
      if (this.q()) {
         return bta.c;
      } else {
         cxg $$5 = new cxg(this.e);
         if (!$$3.i($$5)) {
            $$3.a($$5, false);
         }

         $$1.a($$2, dkf.gm.m(), 3);
         $$1.a($$3, eck.c, $$2);
         return bta.a;
      }
   }

   @Override
   protected cxg a(dhc $$0, jh $$1, dxo $$2) {
      return this.q() ? super.a($$0, $$1, $$2) : new cxg(this.e);
   }

   private boolean q() {
      return this.e == dkf.a;
   }

   @Override
   protected dxo a(dxo $$0, dhc $$1, dho $$2, jh $$3, jm $$4, jh $$5, dxo $$6, bac $$7) {
      return $$4 == jm.a && !$$0.a($$1, $$3) ? dkf.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   public dkd b() {
      return this.e;
   }

   @Override
   protected boolean a(dxo $$0, euf $$1) {
      return false;
   }

   @Override
   protected boolean f(dxo $$0) {
      return $$0.a(dkf.ub) || $$0.a(dkf.uc);
   }

   @Override
   protected void b(dxo $$0, arx $$1, jh $$2, bac $$3) {
      if (this.f($$0) && $$1.G_().j()) {
         boolean $$4 = this.e == dkf.tZ;
         boolean $$5 = dly.a($$1);
         if ($$4 != $$5) {
            $$1.a($$2, this.o($$0), 3);
            dmx.a $$6 = dmx.a.a($$4);
            $$6.a($$1, $$2, $$3);
            $$1.a(null, $$2, $$6.c(), aww.e, 1.0F, 1.0F);
         }
      }

      super.b($$0, $$1, $$2, $$3);
   }

   public dxo o(dxo $$0) {
      if ($$0.a(dkf.ub)) {
         return dkf.uc.m();
      } else {
         return $$0.a(dkf.uc) ? dkf.ub.m() : $$0;
      }
   }
}
