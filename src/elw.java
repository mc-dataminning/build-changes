import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public class elw extends emt {
   public static final MapCodec<elw> a = MapCodec.unit(() -> elw.b);
   public static final elw b = new elw();
   private final Map<dfh, dfh> c = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(dfj.m, dfj.pr);
      $$0.put(dfj.cn, dfj.pr);
      $$0.put(dfj.b, dfj.pv);
      $$0.put(dfj.eH, dfj.pw);
      $$0.put(dfj.eI, dfj.pw);
      $$0.put(dfj.cQ, dfj.ps);
      $$0.put(dfj.ni, dfj.ps);
      $$0.put(dfj.nk, dfj.pD);
      $$0.put(dfj.fj, dfj.pA);
      $$0.put(dfj.ng, dfj.pA);
      $$0.put(dfj.jI, dfj.pu);
      $$0.put(dfj.nw, dfj.pu);
      $$0.put(dfj.jE, dfj.pE);
      $$0.put(dfj.jD, dfj.pE);
      $$0.put(dfj.jK, dfj.pz);
      $$0.put(dfj.nu, dfj.pz);
      $$0.put(dfj.nK, dfj.pB);
      $$0.put(dfj.nI, dfj.pB);
      $$0.put(dfj.fP, dfj.pt);
      $$0.put(dfj.fQ, dfj.pt);
      $$0.put(dfj.eK, dfj.py);
      $$0.put(dfj.eJ, dfj.px);
      $$0.put(dfj.eW, dfj.eX);
   });

   private elw() {
   }

   @Override
   public emw.c a(dci $$0, ja $$1, ja $$2, emw.c $$3, emw.c $$4, ems $$5) {
      dfh $$6 = this.c.get($$4.b().b());
      if ($$6 == null) {
         return $$4;
      } else {
         dsk $$7 = $$4.b();
         dsk $$8 = $$6.o();
         if ($$7.b(dnb.b)) {
            $$8 = $$8.a(dnb.b, $$7.c(dnb.b));
         }

         if ($$7.b(dnb.c)) {
            $$8 = $$8.a(dnb.c, $$7.c(dnb.c));
         }

         if ($$7.b(dmk.b)) {
            $$8 = $$8.a(dmk.b, $$7.c(dmk.b));
         }

         return new emw.c($$4.a(), $$8, $$4.c());
      }
   }

   @Override
   protected emv<?> a() {
      return emv.l;
   }
}
