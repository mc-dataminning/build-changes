import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public class eos extends epq {
   public static final MapCodec<eos> a = MapCodec.unit(() -> eos.b);
   public static final eos b = new eos();
   private final Map<dhy, dhy> c = ad.a(Maps.newHashMap(), $$0 -> {
      $$0.put(dia.m, dia.pr);
      $$0.put(dia.cn, dia.pr);
      $$0.put(dia.b, dia.pv);
      $$0.put(dia.eH, dia.pw);
      $$0.put(dia.eI, dia.pw);
      $$0.put(dia.cQ, dia.ps);
      $$0.put(dia.ni, dia.ps);
      $$0.put(dia.nk, dia.pD);
      $$0.put(dia.fj, dia.pA);
      $$0.put(dia.ng, dia.pA);
      $$0.put(dia.jI, dia.pu);
      $$0.put(dia.nw, dia.pu);
      $$0.put(dia.jE, dia.pE);
      $$0.put(dia.jD, dia.pE);
      $$0.put(dia.jK, dia.pz);
      $$0.put(dia.nu, dia.pz);
      $$0.put(dia.nK, dia.pB);
      $$0.put(dia.nI, dia.pB);
      $$0.put(dia.fP, dia.pt);
      $$0.put(dia.fQ, dia.pt);
      $$0.put(dia.eK, dia.py);
      $$0.put(dia.eJ, dia.px);
      $$0.put(dia.eW, dia.eX);
   });

   private eos() {
   }

   @Override
   public ept.c a(dey $$0, jg $$1, jg $$2, ept.c $$3, ept.c $$4, epp $$5) {
      dhy $$6 = this.c.get($$4.b().b());
      if ($$6 == null) {
         return $$4;
      } else {
         dvd $$7 = $$4.b();
         dvd $$8 = $$6.m();
         if ($$7.b(dps.b)) {
            $$8 = $$8.b(dps.b, $$7.c(dps.b));
         }

         if ($$7.b(dps.c)) {
            $$8 = $$8.b(dps.c, $$7.c(dps.c));
         }

         if ($$7.b(dpb.b)) {
            $$8 = $$8.b(dpb.b, $$7.c(dpb.b));
         }

         return new ept.c($$4.a(), $$8, $$4.c());
      }
   }

   @Override
   protected eps<?> a() {
      return eps.l;
   }
}
