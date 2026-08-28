import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dnj extends dke {
   public static final MapCodec<dnj> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(mb.e.q().fieldOf("potted").forGetter($$0x -> $$0x.d), t()).apply($$0, dnj::new)
   );
   private static final Map<dke, dke> b = Maps.newHashMap();
   private static final fcr c = dke.b(6.0, 0.0, 6.0);
   private final dke d;

   @Override
   public MapCodec<dnj> a() {
      return a;
   }

   public dnj(dke $$0, dxp.d $$1) {
      super($$1);
      this.d = $$0;
      b.put($$0, this);
   }

   @Override
   protected fcr a(dxq $$0, dgf $$1, ji $$2, fcc $$3) {
      return c;
   }

   @Override
   protected bsy a(cxh $$0, dxq $$1, dgz $$2, ji $$3, cpr $$4, bsx $$5, fbt $$6) {
      dxq $$8 = ($$0.h() instanceof cvo $$7 ? b.getOrDefault($$7.d(), dkg.a) : dkg.a).m();
      if ($$8.l()) {
         return bsy.f;
      } else if (!this.q()) {
         return bsy.c;
      } else {
         $$2.a($$3, $$8, 3);
         $$2.a($$4, ecp.c, $$3);
         $$4.a(awk.ah);
         $$0.a(1, $$4);
         return bsy.a;
      }
   }

   @Override
   protected bsy a(dxq $$0, dgz $$1, ji $$2, cpr $$3, fbt $$4) {
      if (this.q()) {
         return bsy.c;
      } else {
         cxh $$5 = new cxh(this.d);
         if (!$$3.i($$5)) {
            $$3.a($$5, false);
         }

         $$1.a($$2, dkg.gm.m(), 3);
         $$1.a($$3, ecp.c, $$2);
         return bsy.a;
      }
   }

   @Override
   protected cxh a(dhc $$0, ji $$1, dxq $$2, boolean $$3) {
      return this.q() ? super.a($$0, $$1, $$2, $$3) : new cxh(this.d);
   }

   private boolean q() {
      return this.d == dkg.a;
   }

   @Override
   protected dxq a(dxq $$0, dhc $$1, dho $$2, ji $$3, jn $$4, ji $$5, dxq $$6, azh $$7) {
      return $$4 == jn.a && !$$0.a($$1, $$3) ? dkg.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   public dke b() {
      return this.d;
   }

   @Override
   protected boolean a(dxq $$0, eul $$1) {
      return false;
   }

   @Override
   protected boolean f(dxq $$0) {
      return $$0.a(dkg.ud) || $$0.a(dkg.ue);
   }

   @Override
   protected void b(dxq $$0, ard $$1, ji $$2, azh $$3) {
      if (this.f($$0) && $$1.B_().j()) {
         boolean $$4 = this.d == dkg.ub;
         boolean $$5 = dlz.a($$1);
         if ($$4 != $$5) {
            $$1.a($$2, this.o($$0), 3);
            dmy.a $$6 = dmy.a.a($$4).c();
            $$6.a($$1, $$2, $$3);
            $$1.a(null, $$2, $$6.e(), awb.e, 1.0F, 1.0F);
         }
      }

      super.b($$0, $$1, $$2, $$3);
   }

   public dxq o(dxq $$0) {
      if ($$0.a(dkg.ud)) {
         return dkg.ue.m();
      } else {
         return $$0.a(dkg.ue) ? dkg.ud.m() : $$0;
      }
   }
}
