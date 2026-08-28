import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public class elj extends emg {
   public static final MapCodec<elj> a = MapCodec.unit(() -> elj.b);
   public static final elj b = new elj();
   private final Map<dey, dey> c = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(dfa.m, dfa.pr);
      $$0.put(dfa.cn, dfa.pr);
      $$0.put(dfa.b, dfa.pv);
      $$0.put(dfa.eH, dfa.pw);
      $$0.put(dfa.eI, dfa.pw);
      $$0.put(dfa.cQ, dfa.ps);
      $$0.put(dfa.ni, dfa.ps);
      $$0.put(dfa.nk, dfa.pD);
      $$0.put(dfa.fj, dfa.pA);
      $$0.put(dfa.ng, dfa.pA);
      $$0.put(dfa.jI, dfa.pu);
      $$0.put(dfa.nw, dfa.pu);
      $$0.put(dfa.jE, dfa.pE);
      $$0.put(dfa.jD, dfa.pE);
      $$0.put(dfa.jK, dfa.pz);
      $$0.put(dfa.nu, dfa.pz);
      $$0.put(dfa.nK, dfa.pB);
      $$0.put(dfa.nI, dfa.pB);
      $$0.put(dfa.fP, dfa.pt);
      $$0.put(dfa.fQ, dfa.pt);
      $$0.put(dfa.eK, dfa.py);
      $$0.put(dfa.eJ, dfa.px);
      $$0.put(dfa.eW, dfa.eX);
   });

   private elj() {
   }

   @Override
   public emj.c a(dca $$0, iz $$1, iz $$2, emj.c $$3, emj.c $$4, emf $$5) {
      dey $$6 = this.c.get($$4.b().b());
      if ($$6 == null) {
         return $$4;
      } else {
         dsb $$7 = $$4.b();
         dsb $$8 = $$6.o();
         if ($$7.b(dms.b)) {
            $$8 = $$8.a(dms.b, $$7.c(dms.b));
         }

         if ($$7.b(dms.c)) {
            $$8 = $$8.a(dms.c, $$7.c(dms.c));
         }

         if ($$7.b(dmb.b)) {
            $$8 = $$8.a(dmb.b, $$7.c(dmb.b));
         }

         return new emj.c($$4.a(), $$8, $$4.c());
      }
   }

   @Override
   protected emi<?> a() {
      return emi.l;
   }
}
