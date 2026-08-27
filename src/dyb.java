import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import java.util.Map;

public class dyb extends dyy {
   public static final Codec<dyb> a = Codec.unit(() -> dyb.b);
   public static final dyb b = new dyb();
   private final Map<csv, csv> c = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(csw.m, csw.pr);
      $$0.put(csw.cn, csw.pr);
      $$0.put(csw.b, csw.pv);
      $$0.put(csw.eI, csw.pw);
      $$0.put(csw.eJ, csw.pw);
      $$0.put(csw.cQ, csw.ps);
      $$0.put(csw.ni, csw.ps);
      $$0.put(csw.nk, csw.pD);
      $$0.put(csw.fj, csw.pA);
      $$0.put(csw.ng, csw.pA);
      $$0.put(csw.jI, csw.pu);
      $$0.put(csw.nw, csw.pu);
      $$0.put(csw.jE, csw.pE);
      $$0.put(csw.jD, csw.pE);
      $$0.put(csw.jK, csw.pz);
      $$0.put(csw.nu, csw.pz);
      $$0.put(csw.nK, csw.pB);
      $$0.put(csw.nI, csw.pB);
      $$0.put(csw.fP, csw.pt);
      $$0.put(csw.fQ, csw.pt);
      $$0.put(csw.eL, csw.py);
      $$0.put(csw.eK, csw.px);
      $$0.put(csw.eX, csw.eY);
   });

   private dyb() {
   }

   @Override
   public dzb.c a(cpy $$0, gw $$1, gw $$2, dzb.c $$3, dzb.c $$4, dyx $$5) {
      csv $$6 = this.c.get($$4.b().b());
      if ($$6 == null) {
         return $$4;
      } else {
         dfj $$7 = $$4.b();
         dfj $$8 = $$6.n();
         if ($$7.b(dap.a)) {
            $$8 = $$8.a(dap.a, $$7.c(dap.a));
         }

         if ($$7.b(dap.b)) {
            $$8 = $$8.a(dap.b, $$7.c(dap.b));
         }

         if ($$7.b(czy.a)) {
            $$8 = $$8.a(czy.a, $$7.c(czy.a));
         }

         return new dzb.c($$4.a(), $$8, $$4.c());
      }
   }

   @Override
   protected dza<?> a() {
      return dza.l;
   }
}
