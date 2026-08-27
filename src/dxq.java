import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import java.util.Map;

public class dxq extends dyn {
   public static final Codec<dxq> a = Codec.unit(() -> dxq.b);
   public static final dxq b = new dxq();
   private final Map<csk, csk> c = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(csl.m, csl.pr);
      $$0.put(csl.cn, csl.pr);
      $$0.put(csl.b, csl.pv);
      $$0.put(csl.eI, csl.pw);
      $$0.put(csl.eJ, csl.pw);
      $$0.put(csl.cQ, csl.ps);
      $$0.put(csl.ni, csl.ps);
      $$0.put(csl.nk, csl.pD);
      $$0.put(csl.fj, csl.pA);
      $$0.put(csl.ng, csl.pA);
      $$0.put(csl.jI, csl.pu);
      $$0.put(csl.nw, csl.pu);
      $$0.put(csl.jE, csl.pE);
      $$0.put(csl.jD, csl.pE);
      $$0.put(csl.jK, csl.pz);
      $$0.put(csl.nu, csl.pz);
      $$0.put(csl.nK, csl.pB);
      $$0.put(csl.nI, csl.pB);
      $$0.put(csl.fP, csl.pt);
      $$0.put(csl.fQ, csl.pt);
      $$0.put(csl.eL, csl.py);
      $$0.put(csl.eK, csl.px);
      $$0.put(csl.eX, csl.eY);
   });

   private dxq() {
   }

   @Override
   public dyq.c a(cpn $$0, gv $$1, gv $$2, dyq.c $$3, dyq.c $$4, dym $$5) {
      csk $$6 = this.c.get($$4.b().b());
      if ($$6 == null) {
         return $$4;
      } else {
         dey $$7 = $$4.b();
         dey $$8 = $$6.n();
         if ($$7.b(dae.a)) {
            $$8 = $$8.a(dae.a, $$7.c(dae.a));
         }

         if ($$7.b(dae.b)) {
            $$8 = $$8.a(dae.b, $$7.c(dae.b));
         }

         if ($$7.b(czn.a)) {
            $$8 = $$8.a(czn.a, $$7.c(czn.a));
         }

         return new dyq.c($$4.a(), $$8, $$4.c());
      }
   }

   @Override
   protected dyp<?> a() {
      return dyp.l;
   }
}
