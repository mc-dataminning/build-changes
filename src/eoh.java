import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public class eoh extends epf {
   public static final MapCodec<eoh> a = MapCodec.unit(() -> eoh.b);
   public static final eoh b = new eoh();
   private final Map<dhm, dhm> c = ad.a(Maps.newHashMap(), $$0 -> {
      $$0.put(dho.m, dho.pr);
      $$0.put(dho.cn, dho.pr);
      $$0.put(dho.b, dho.pv);
      $$0.put(dho.eH, dho.pw);
      $$0.put(dho.eI, dho.pw);
      $$0.put(dho.cQ, dho.ps);
      $$0.put(dho.ni, dho.ps);
      $$0.put(dho.nk, dho.pD);
      $$0.put(dho.fj, dho.pA);
      $$0.put(dho.ng, dho.pA);
      $$0.put(dho.jI, dho.pu);
      $$0.put(dho.nw, dho.pu);
      $$0.put(dho.jE, dho.pE);
      $$0.put(dho.jD, dho.pE);
      $$0.put(dho.jK, dho.pz);
      $$0.put(dho.nu, dho.pz);
      $$0.put(dho.nK, dho.pB);
      $$0.put(dho.nI, dho.pB);
      $$0.put(dho.fP, dho.pt);
      $$0.put(dho.fQ, dho.pt);
      $$0.put(dho.eK, dho.py);
      $$0.put(dho.eJ, dho.px);
      $$0.put(dho.eW, dho.eX);
   });

   private eoh() {
   }

   @Override
   public epi.c a(dem $$0, jf $$1, jf $$2, epi.c $$3, epi.c $$4, epe $$5) {
      dhm $$6 = this.c.get($$4.b().b());
      if ($$6 == null) {
         return $$4;
      } else {
         dus $$7 = $$4.b();
         dus $$8 = $$6.n();
         if ($$7.b(dph.b)) {
            $$8 = $$8.b(dph.b, $$7.c(dph.b));
         }

         if ($$7.b(dph.c)) {
            $$8 = $$8.b(dph.c, $$7.c(dph.c));
         }

         if ($$7.b(doq.b)) {
            $$8 = $$8.b(doq.b, $$7.c(doq.b));
         }

         return new epi.c($$4.a(), $$8, $$4.c());
      }
   }

   @Override
   protected eph<?> a() {
      return eph.l;
   }
}
