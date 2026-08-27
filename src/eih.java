import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import java.util.Map;

public class eih extends eje {
   public static final Codec<eih> a = Codec.unit(() -> eih.b);
   public static final eih b = new eih();
   private final Map<dby, dby> c = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(dca.m, dca.pr);
      $$0.put(dca.cn, dca.pr);
      $$0.put(dca.b, dca.pv);
      $$0.put(dca.eH, dca.pw);
      $$0.put(dca.eI, dca.pw);
      $$0.put(dca.cQ, dca.ps);
      $$0.put(dca.ni, dca.ps);
      $$0.put(dca.nk, dca.pD);
      $$0.put(dca.fj, dca.pA);
      $$0.put(dca.ng, dca.pA);
      $$0.put(dca.jI, dca.pu);
      $$0.put(dca.nw, dca.pu);
      $$0.put(dca.jE, dca.pE);
      $$0.put(dca.jD, dca.pE);
      $$0.put(dca.jK, dca.pz);
      $$0.put(dca.nu, dca.pz);
      $$0.put(dca.nK, dca.pB);
      $$0.put(dca.nI, dca.pB);
      $$0.put(dca.fP, dca.pt);
      $$0.put(dca.fQ, dca.pt);
      $$0.put(dca.eK, dca.py);
      $$0.put(dca.eJ, dca.px);
      $$0.put(dca.eW, dca.eX);
   });

   private eih() {
   }

   @Override
   public ejh.c a(cza $$0, ib $$1, ib $$2, ejh.c $$3, ejh.c $$4, ejd $$5) {
      dby $$6 = this.c.get($$4.b().b());
      if ($$6 == null) {
         return $$4;
      } else {
         doz $$7 = $$4.b();
         doz $$8 = $$6.n();
         if ($$7.b(djr.b)) {
            $$8 = $$8.a(djr.b, $$7.c(djr.b));
         }

         if ($$7.b(djr.c)) {
            $$8 = $$8.a(djr.c, $$7.c(djr.c));
         }

         if ($$7.b(dja.b)) {
            $$8 = $$8.a(dja.b, $$7.c(dja.b));
         }

         return new ejh.c($$4.a(), $$8, $$4.c());
      }
   }

   @Override
   protected ejg<?> a() {
      return ejg.l;
   }
}
