import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public class elq extends emn {
   public static final MapCodec<elq> a = MapCodec.unit(() -> elq.b);
   public static final elq b = new elq();
   private final Map<dff, dff> c = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(dfh.m, dfh.pr);
      $$0.put(dfh.cn, dfh.pr);
      $$0.put(dfh.b, dfh.pv);
      $$0.put(dfh.eH, dfh.pw);
      $$0.put(dfh.eI, dfh.pw);
      $$0.put(dfh.cQ, dfh.ps);
      $$0.put(dfh.ni, dfh.ps);
      $$0.put(dfh.nk, dfh.pD);
      $$0.put(dfh.fj, dfh.pA);
      $$0.put(dfh.ng, dfh.pA);
      $$0.put(dfh.jI, dfh.pu);
      $$0.put(dfh.nw, dfh.pu);
      $$0.put(dfh.jE, dfh.pE);
      $$0.put(dfh.jD, dfh.pE);
      $$0.put(dfh.jK, dfh.pz);
      $$0.put(dfh.nu, dfh.pz);
      $$0.put(dfh.nK, dfh.pB);
      $$0.put(dfh.nI, dfh.pB);
      $$0.put(dfh.fP, dfh.pt);
      $$0.put(dfh.fQ, dfh.pt);
      $$0.put(dfh.eK, dfh.py);
      $$0.put(dfh.eJ, dfh.px);
      $$0.put(dfh.eW, dfh.eX);
   });

   private elq() {
   }

   @Override
   public emq.c a(dcg $$0, ja $$1, ja $$2, emq.c $$3, emq.c $$4, emm $$5) {
      dff $$6 = this.c.get($$4.b().b());
      if ($$6 == null) {
         return $$4;
      } else {
         dsh $$7 = $$4.b();
         dsh $$8 = $$6.o();
         if ($$7.b(dmz.b)) {
            $$8 = $$8.a(dmz.b, $$7.c(dmz.b));
         }

         if ($$7.b(dmz.c)) {
            $$8 = $$8.a(dmz.c, $$7.c(dmz.c));
         }

         if ($$7.b(dmi.b)) {
            $$8 = $$8.a(dmi.b, $$7.c(dmi.b));
         }

         return new emq.c($$4.a(), $$8, $$4.c());
      }
   }

   @Override
   protected emp<?> a() {
      return emp.l;
   }
}
