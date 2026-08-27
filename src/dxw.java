import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import java.util.Map;

public class dxw extends dyt {
   public static final Codec<dxw> a = Codec.unit(() -> dxw.b);
   public static final dxw b = new dxw();
   private final Map<csq, csq> c = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(csr.m, csr.pr);
      $$0.put(csr.cn, csr.pr);
      $$0.put(csr.b, csr.pv);
      $$0.put(csr.eI, csr.pw);
      $$0.put(csr.eJ, csr.pw);
      $$0.put(csr.cQ, csr.ps);
      $$0.put(csr.ni, csr.ps);
      $$0.put(csr.nk, csr.pD);
      $$0.put(csr.fj, csr.pA);
      $$0.put(csr.ng, csr.pA);
      $$0.put(csr.jI, csr.pu);
      $$0.put(csr.nw, csr.pu);
      $$0.put(csr.jE, csr.pE);
      $$0.put(csr.jD, csr.pE);
      $$0.put(csr.jK, csr.pz);
      $$0.put(csr.nu, csr.pz);
      $$0.put(csr.nK, csr.pB);
      $$0.put(csr.nI, csr.pB);
      $$0.put(csr.fP, csr.pt);
      $$0.put(csr.fQ, csr.pt);
      $$0.put(csr.eL, csr.py);
      $$0.put(csr.eK, csr.px);
      $$0.put(csr.eX, csr.eY);
   });

   private dxw() {
   }

   @Override
   public dyw.c a(cpt $$0, gw $$1, gw $$2, dyw.c $$3, dyw.c $$4, dys $$5) {
      csq $$6 = this.c.get($$4.b().b());
      if ($$6 == null) {
         return $$4;
      } else {
         dfe $$7 = $$4.b();
         dfe $$8 = $$6.n();
         if ($$7.b(dak.a)) {
            $$8 = $$8.a(dak.a, $$7.c(dak.a));
         }

         if ($$7.b(dak.b)) {
            $$8 = $$8.a(dak.b, $$7.c(dak.b));
         }

         if ($$7.b(czt.a)) {
            $$8 = $$8.a(czt.a, $$7.c(czt.a));
         }

         return new dyw.c($$4.a(), $$8, $$4.c());
      }
   }

   @Override
   protected dyv<?> a() {
      return dyv.l;
   }
}
