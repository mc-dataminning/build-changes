import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public class elm extends emj {
   public static final MapCodec<elm> a = MapCodec.unit(() -> elm.b);
   public static final elm b = new elm();
   private final Map<dfb, dfb> c = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(dfd.m, dfd.pr);
      $$0.put(dfd.cn, dfd.pr);
      $$0.put(dfd.b, dfd.pv);
      $$0.put(dfd.eH, dfd.pw);
      $$0.put(dfd.eI, dfd.pw);
      $$0.put(dfd.cQ, dfd.ps);
      $$0.put(dfd.ni, dfd.ps);
      $$0.put(dfd.nk, dfd.pD);
      $$0.put(dfd.fj, dfd.pA);
      $$0.put(dfd.ng, dfd.pA);
      $$0.put(dfd.jI, dfd.pu);
      $$0.put(dfd.nw, dfd.pu);
      $$0.put(dfd.jE, dfd.pE);
      $$0.put(dfd.jD, dfd.pE);
      $$0.put(dfd.jK, dfd.pz);
      $$0.put(dfd.nu, dfd.pz);
      $$0.put(dfd.nK, dfd.pB);
      $$0.put(dfd.nI, dfd.pB);
      $$0.put(dfd.fP, dfd.pt);
      $$0.put(dfd.fQ, dfd.pt);
      $$0.put(dfd.eK, dfd.py);
      $$0.put(dfd.eJ, dfd.px);
      $$0.put(dfd.eW, dfd.eX);
   });

   private elm() {
   }

   @Override
   public emm.c a(dcd $$0, iz $$1, iz $$2, emm.c $$3, emm.c $$4, emi $$5) {
      dfb $$6 = this.c.get($$4.b().b());
      if ($$6 == null) {
         return $$4;
      } else {
         dse $$7 = $$4.b();
         dse $$8 = $$6.o();
         if ($$7.b(dmv.b)) {
            $$8 = $$8.a(dmv.b, $$7.c(dmv.b));
         }

         if ($$7.b(dmv.c)) {
            $$8 = $$8.a(dmv.c, $$7.c(dmv.c));
         }

         if ($$7.b(dme.b)) {
            $$8 = $$8.a(dme.b, $$7.c(dme.b));
         }

         return new emm.c($$4.a(), $$8, $$4.c());
      }
   }

   @Override
   protected eml<?> a() {
      return eml.l;
   }
}
