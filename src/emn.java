import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public class emn extends enk {
   public static final MapCodec<emn> a = MapCodec.unit(() -> emn.b);
   public static final emn b = new emn();
   private final Map<dfw, dfw> c = ad.a(Maps.newHashMap(), $$0 -> {
      $$0.put(dfy.m, dfy.pr);
      $$0.put(dfy.cn, dfy.pr);
      $$0.put(dfy.b, dfy.pv);
      $$0.put(dfy.eH, dfy.pw);
      $$0.put(dfy.eI, dfy.pw);
      $$0.put(dfy.cQ, dfy.ps);
      $$0.put(dfy.ni, dfy.ps);
      $$0.put(dfy.nk, dfy.pD);
      $$0.put(dfy.fj, dfy.pA);
      $$0.put(dfy.ng, dfy.pA);
      $$0.put(dfy.jI, dfy.pu);
      $$0.put(dfy.nw, dfy.pu);
      $$0.put(dfy.jE, dfy.pE);
      $$0.put(dfy.jD, dfy.pE);
      $$0.put(dfy.jK, dfy.pz);
      $$0.put(dfy.nu, dfy.pz);
      $$0.put(dfy.nK, dfy.pB);
      $$0.put(dfy.nI, dfy.pB);
      $$0.put(dfy.fP, dfy.pt);
      $$0.put(dfy.fQ, dfy.pt);
      $$0.put(dfy.eK, dfy.py);
      $$0.put(dfy.eJ, dfy.px);
      $$0.put(dfy.eW, dfy.eX);
   });

   private emn() {
   }

   @Override
   public enn.c a(dcx $$0, jd $$1, jd $$2, enn.c $$3, enn.c $$4, enj $$5) {
      dfw $$6 = this.c.get($$4.b().b());
      if ($$6 == null) {
         return $$4;
      } else {
         dta $$7 = $$4.b();
         dta $$8 = $$6.o();
         if ($$7.b(dnr.b)) {
            $$8 = $$8.a(dnr.b, $$7.c(dnr.b));
         }

         if ($$7.b(dnr.c)) {
            $$8 = $$8.a(dnr.c, $$7.c(dnr.c));
         }

         if ($$7.b(dna.b)) {
            $$8 = $$8.a(dna.b, $$7.c(dna.b));
         }

         return new enn.c($$4.a(), $$8, $$4.c());
      }
   }

   @Override
   protected enm<?> a() {
      return enm.l;
   }
}
