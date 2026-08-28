import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public class emq extends eno {
   public static final MapCodec<emq> a = MapCodec.unit(() -> emq.b);
   public static final emq b = new emq();
   private final Map<dfy, dfy> c = ad.a(Maps.newHashMap(), $$0 -> {
      $$0.put(dga.m, dga.pr);
      $$0.put(dga.cn, dga.pr);
      $$0.put(dga.b, dga.pv);
      $$0.put(dga.eH, dga.pw);
      $$0.put(dga.eI, dga.pw);
      $$0.put(dga.cQ, dga.ps);
      $$0.put(dga.ni, dga.ps);
      $$0.put(dga.nk, dga.pD);
      $$0.put(dga.fj, dga.pA);
      $$0.put(dga.ng, dga.pA);
      $$0.put(dga.jI, dga.pu);
      $$0.put(dga.nw, dga.pu);
      $$0.put(dga.jE, dga.pE);
      $$0.put(dga.jD, dga.pE);
      $$0.put(dga.jK, dga.pz);
      $$0.put(dga.nu, dga.pz);
      $$0.put(dga.nK, dga.pB);
      $$0.put(dga.nI, dga.pB);
      $$0.put(dga.fP, dga.pt);
      $$0.put(dga.fQ, dga.pt);
      $$0.put(dga.eK, dga.py);
      $$0.put(dga.eJ, dga.px);
      $$0.put(dga.eW, dga.eX);
   });

   private emq() {
   }

   @Override
   public enr.c a(dcz $$0, jd $$1, jd $$2, enr.c $$3, enr.c $$4, enn $$5) {
      dfy $$6 = this.c.get($$4.b().b());
      if ($$6 == null) {
         return $$4;
      } else {
         dtc $$7 = $$4.b();
         dtc $$8 = $$6.o();
         if ($$7.b(dnt.b)) {
            $$8 = $$8.a(dnt.b, $$7.c(dnt.b));
         }

         if ($$7.b(dnt.c)) {
            $$8 = $$8.a(dnt.c, $$7.c(dnt.c));
         }

         if ($$7.b(dnc.b)) {
            $$8 = $$8.a(dnc.b, $$7.c(dnc.b));
         }

         return new enr.c($$4.a(), $$8, $$4.c());
      }
   }

   @Override
   protected enq<?> a() {
      return enq.l;
   }
}
