import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import java.util.Map;

public class dxs extends dyp {
   public static final Codec<dxs> a = Codec.unit(() -> dxs.b);
   public static final dxs b = new dxs();
   private final Map<csm, csm> c = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(csn.m, csn.pr);
      $$0.put(csn.cn, csn.pr);
      $$0.put(csn.b, csn.pv);
      $$0.put(csn.eI, csn.pw);
      $$0.put(csn.eJ, csn.pw);
      $$0.put(csn.cQ, csn.ps);
      $$0.put(csn.ni, csn.ps);
      $$0.put(csn.nk, csn.pD);
      $$0.put(csn.fj, csn.pA);
      $$0.put(csn.ng, csn.pA);
      $$0.put(csn.jI, csn.pu);
      $$0.put(csn.nw, csn.pu);
      $$0.put(csn.jE, csn.pE);
      $$0.put(csn.jD, csn.pE);
      $$0.put(csn.jK, csn.pz);
      $$0.put(csn.nu, csn.pz);
      $$0.put(csn.nK, csn.pB);
      $$0.put(csn.nI, csn.pB);
      $$0.put(csn.fP, csn.pt);
      $$0.put(csn.fQ, csn.pt);
      $$0.put(csn.eL, csn.py);
      $$0.put(csn.eK, csn.px);
      $$0.put(csn.eX, csn.eY);
   });

   private dxs() {
   }

   @Override
   public dys.c a(cpp $$0, gu $$1, gu $$2, dys.c $$3, dys.c $$4, dyo $$5) {
      csm $$6 = this.c.get($$4.b().b());
      if ($$6 == null) {
         return $$4;
      } else {
         dfa $$7 = $$4.b();
         dfa $$8 = $$6.n();
         if ($$7.b(dag.a)) {
            $$8 = $$8.a(dag.a, $$7.c(dag.a));
         }

         if ($$7.b(dag.b)) {
            $$8 = $$8.a(dag.b, $$7.c(dag.b));
         }

         if ($$7.b(czp.a)) {
            $$8 = $$8.a(czp.a, $$7.c(czp.a));
         }

         return new dys.c($$4.a(), $$8, $$4.c());
      }
   }

   @Override
   protected dyr<?> a() {
      return dyr.l;
   }
}
