import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public class eod extends epb {
   public static final MapCodec<eod> a = MapCodec.unit(() -> eod.b);
   public static final eod b = new eod();
   private final Map<dhj, dhj> c = ad.a(Maps.newHashMap(), $$0 -> {
      $$0.put(dhl.m, dhl.pr);
      $$0.put(dhl.cn, dhl.pr);
      $$0.put(dhl.b, dhl.pv);
      $$0.put(dhl.eH, dhl.pw);
      $$0.put(dhl.eI, dhl.pw);
      $$0.put(dhl.cQ, dhl.ps);
      $$0.put(dhl.ni, dhl.ps);
      $$0.put(dhl.nk, dhl.pD);
      $$0.put(dhl.fj, dhl.pA);
      $$0.put(dhl.ng, dhl.pA);
      $$0.put(dhl.jI, dhl.pu);
      $$0.put(dhl.nw, dhl.pu);
      $$0.put(dhl.jE, dhl.pE);
      $$0.put(dhl.jD, dhl.pE);
      $$0.put(dhl.jK, dhl.pz);
      $$0.put(dhl.nu, dhl.pz);
      $$0.put(dhl.nK, dhl.pB);
      $$0.put(dhl.nI, dhl.pB);
      $$0.put(dhl.fP, dhl.pt);
      $$0.put(dhl.fQ, dhl.pt);
      $$0.put(dhl.eK, dhl.py);
      $$0.put(dhl.eJ, dhl.px);
      $$0.put(dhl.eW, dhl.eX);
   });

   private eod() {
   }

   @Override
   public epe.c a(dej $$0, je $$1, je $$2, epe.c $$3, epe.c $$4, epa $$5) {
      dhj $$6 = this.c.get($$4.b().b());
      if ($$6 == null) {
         return $$4;
      } else {
         duo $$7 = $$4.b();
         duo $$8 = $$6.o();
         if ($$7.b(dpe.b)) {
            $$8 = $$8.b(dpe.b, $$7.c(dpe.b));
         }

         if ($$7.b(dpe.c)) {
            $$8 = $$8.b(dpe.c, $$7.c(dpe.c));
         }

         if ($$7.b(don.b)) {
            $$8 = $$8.b(don.b, $$7.c(don.b));
         }

         return new epe.c($$4.a(), $$8, $$4.c());
      }
   }

   @Override
   protected epd<?> a() {
      return epd.l;
   }
}
