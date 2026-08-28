import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public class epc extends eqa {
   public static final MapCodec<epc> a = MapCodec.unit(() -> epc.b);
   public static final epc b = new epc();
   private final Map<dij, dij> c = ae.a(Maps.newHashMap(), $$0 -> {
      $$0.put(dil.m, dil.pr);
      $$0.put(dil.cn, dil.pr);
      $$0.put(dil.b, dil.pv);
      $$0.put(dil.eH, dil.pw);
      $$0.put(dil.eI, dil.pw);
      $$0.put(dil.cQ, dil.ps);
      $$0.put(dil.ni, dil.ps);
      $$0.put(dil.nk, dil.pD);
      $$0.put(dil.fj, dil.pA);
      $$0.put(dil.ng, dil.pA);
      $$0.put(dil.jI, dil.pu);
      $$0.put(dil.nw, dil.pu);
      $$0.put(dil.jE, dil.pE);
      $$0.put(dil.jD, dil.pE);
      $$0.put(dil.jK, dil.pz);
      $$0.put(dil.nu, dil.pz);
      $$0.put(dil.nK, dil.pB);
      $$0.put(dil.nI, dil.pB);
      $$0.put(dil.fP, dil.pt);
      $$0.put(dil.fQ, dil.pt);
      $$0.put(dil.eK, dil.py);
      $$0.put(dil.eJ, dil.px);
      $$0.put(dil.eW, dil.eX);
   });

   private epc() {
   }

   @Override
   public eqd.c a(dfi $$0, jh $$1, jh $$2, eqd.c $$3, eqd.c $$4, epz $$5) {
      dij $$6 = this.c.get($$4.b().b());
      if ($$6 == null) {
         return $$4;
      } else {
         dvo $$7 = $$4.b();
         dvo $$8 = $$6.m();
         if ($$7.b(dqd.b)) {
            $$8 = $$8.b(dqd.b, $$7.c(dqd.b));
         }

         if ($$7.b(dqd.c)) {
            $$8 = $$8.b(dqd.c, $$7.c(dqd.c));
         }

         if ($$7.b(dpm.b)) {
            $$8 = $$8.b(dpm.b, $$7.c(dpm.b));
         }

         return new eqd.c($$4.a(), $$8, $$4.c());
      }
   }

   @Override
   protected eqc<?> a() {
      return eqc.l;
   }
}
