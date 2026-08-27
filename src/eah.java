import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import java.util.Map;

public class eah extends ebe {
   public static final Codec<eah> a = Codec.unit(() -> eah.b);
   public static final eah b = new eah();
   private final Map<cva, cva> c = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(cvc.m, cvc.pr);
      $$0.put(cvc.cn, cvc.pr);
      $$0.put(cvc.b, cvc.pv);
      $$0.put(cvc.eH, cvc.pw);
      $$0.put(cvc.eI, cvc.pw);
      $$0.put(cvc.cQ, cvc.ps);
      $$0.put(cvc.ni, cvc.ps);
      $$0.put(cvc.nk, cvc.pD);
      $$0.put(cvc.fj, cvc.pA);
      $$0.put(cvc.ng, cvc.pA);
      $$0.put(cvc.jI, cvc.pu);
      $$0.put(cvc.nw, cvc.pu);
      $$0.put(cvc.jE, cvc.pE);
      $$0.put(cvc.jD, cvc.pE);
      $$0.put(cvc.jK, cvc.pz);
      $$0.put(cvc.nu, cvc.pz);
      $$0.put(cvc.nK, cvc.pB);
      $$0.put(cvc.nI, cvc.pB);
      $$0.put(cvc.fP, cvc.pt);
      $$0.put(cvc.fQ, cvc.pt);
      $$0.put(cvc.eK, cvc.py);
      $$0.put(cvc.eJ, cvc.px);
      $$0.put(cvc.eW, cvc.eX);
   });

   private eah() {
   }

   @Override
   public ebh.c a(csd $$0, ht $$1, ht $$2, ebh.c $$3, ebh.c $$4, ebd $$5) {
      cva $$6 = this.c.get($$4.b().b());
      if ($$6 == null) {
         return $$4;
      } else {
         dhi $$7 = $$4.b();
         dhi $$8 = $$6.o();
         if ($$7.b(dct.b)) {
            $$8 = $$8.a(dct.b, $$7.c(dct.b));
         }

         if ($$7.b(dct.c)) {
            $$8 = $$8.a(dct.c, $$7.c(dct.c));
         }

         if ($$7.b(dcc.b)) {
            $$8 = $$8.a(dcc.b, $$7.c(dcc.b));
         }

         return new ebh.c($$4.a(), $$8, $$4.c());
      }
   }

   @Override
   protected ebg<?> a() {
      return ebg.l;
   }
}
