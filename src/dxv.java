import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import java.util.Map;

public class dxv extends dys {
   public static final Codec<dxv> a = Codec.unit(() -> dxv.b);
   public static final dxv b = new dxv();
   private final Map<ctc, ctc> c = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(cte.m, cte.pr);
      $$0.put(cte.cn, cte.pr);
      $$0.put(cte.b, cte.pv);
      $$0.put(cte.eH, cte.pw);
      $$0.put(cte.eI, cte.pw);
      $$0.put(cte.cQ, cte.ps);
      $$0.put(cte.ni, cte.ps);
      $$0.put(cte.nk, cte.pD);
      $$0.put(cte.fj, cte.pA);
      $$0.put(cte.ng, cte.pA);
      $$0.put(cte.jI, cte.pu);
      $$0.put(cte.nw, cte.pu);
      $$0.put(cte.jE, cte.pE);
      $$0.put(cte.jD, cte.pE);
      $$0.put(cte.jK, cte.pz);
      $$0.put(cte.nu, cte.pz);
      $$0.put(cte.nK, cte.pB);
      $$0.put(cte.nI, cte.pB);
      $$0.put(cte.fP, cte.pt);
      $$0.put(cte.fQ, cte.pt);
      $$0.put(cte.eK, cte.py);
      $$0.put(cte.eJ, cte.px);
      $$0.put(cte.eW, cte.eX);
   });

   private dxv() {
   }

   @Override
   public dyv.c a(cqe $$0, gw $$1, gw $$2, dyv.c $$3, dyv.c $$4, dyr $$5) {
      ctc $$6 = this.c.get($$4.b().b());
      if ($$6 == null) {
         return $$4;
      } else {
         dfd $$7 = $$4.b();
         dfd $$8 = $$6.o();
         if ($$7.b(dau.b)) {
            $$8 = $$8.a(dau.b, $$7.c(dau.b));
         }

         if ($$7.b(dau.c)) {
            $$8 = $$8.a(dau.c, $$7.c(dau.c));
         }

         if ($$7.b(dad.b)) {
            $$8 = $$8.a(dad.b, $$7.c(dad.b));
         }

         return new dyv.c($$4.a(), $$8, $$4.c());
      }
   }

   @Override
   protected dyu<?> a() {
      return dyu.l;
   }
}
