import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import java.util.Map;

public class ecg extends edd {
   public static final Codec<ecg> a = Codec.unit(() -> ecg.b);
   public static final ecg b = new ecg();
   private final Map<cwq, cwq> c = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(cws.m, cws.pr);
      $$0.put(cws.cn, cws.pr);
      $$0.put(cws.b, cws.pv);
      $$0.put(cws.eH, cws.pw);
      $$0.put(cws.eI, cws.pw);
      $$0.put(cws.cQ, cws.ps);
      $$0.put(cws.ni, cws.ps);
      $$0.put(cws.nk, cws.pD);
      $$0.put(cws.fj, cws.pA);
      $$0.put(cws.ng, cws.pA);
      $$0.put(cws.jI, cws.pu);
      $$0.put(cws.nw, cws.pu);
      $$0.put(cws.jE, cws.pE);
      $$0.put(cws.jD, cws.pE);
      $$0.put(cws.jK, cws.pz);
      $$0.put(cws.nu, cws.pz);
      $$0.put(cws.nK, cws.pB);
      $$0.put(cws.nI, cws.pB);
      $$0.put(cws.fP, cws.pt);
      $$0.put(cws.fQ, cws.pt);
      $$0.put(cws.eK, cws.py);
      $$0.put(cws.eJ, cws.px);
      $$0.put(cws.eW, cws.eX);
   });

   private ecg() {
   }

   @Override
   public edg.c a(cts $$0, hx $$1, hx $$2, edg.c $$3, edg.c $$4, edc $$5) {
      cwq $$6 = this.c.get($$4.b().b());
      if ($$6 == null) {
         return $$4;
      } else {
         djh $$7 = $$4.b();
         djh $$8 = $$6.o();
         if ($$7.b(dej.b)) {
            $$8 = $$8.a(dej.b, $$7.c(dej.b));
         }

         if ($$7.b(dej.c)) {
            $$8 = $$8.a(dej.c, $$7.c(dej.c));
         }

         if ($$7.b(dds.b)) {
            $$8 = $$8.a(dds.b, $$7.c(dds.b));
         }

         return new edg.c($$4.a(), $$8, $$4.c());
      }
   }

   @Override
   protected edf<?> a() {
      return edf.l;
   }
}
