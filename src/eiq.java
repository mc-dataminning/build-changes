import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import java.util.Map;

public class eiq extends ejn {
   public static final Codec<eiq> a = Codec.unit(() -> eiq.b);
   public static final eiq b = new eiq();
   private final Map<dch, dch> c = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(dcj.m, dcj.pr);
      $$0.put(dcj.cn, dcj.pr);
      $$0.put(dcj.b, dcj.pv);
      $$0.put(dcj.eH, dcj.pw);
      $$0.put(dcj.eI, dcj.pw);
      $$0.put(dcj.cQ, dcj.ps);
      $$0.put(dcj.ni, dcj.ps);
      $$0.put(dcj.nk, dcj.pD);
      $$0.put(dcj.fj, dcj.pA);
      $$0.put(dcj.ng, dcj.pA);
      $$0.put(dcj.jI, dcj.pu);
      $$0.put(dcj.nw, dcj.pu);
      $$0.put(dcj.jE, dcj.pE);
      $$0.put(dcj.jD, dcj.pE);
      $$0.put(dcj.jK, dcj.pz);
      $$0.put(dcj.nu, dcj.pz);
      $$0.put(dcj.nK, dcj.pB);
      $$0.put(dcj.nI, dcj.pB);
      $$0.put(dcj.fP, dcj.pt);
      $$0.put(dcj.fQ, dcj.pt);
      $$0.put(dcj.eK, dcj.py);
      $$0.put(dcj.eJ, dcj.px);
      $$0.put(dcj.eW, dcj.eX);
   });

   private eiq() {
   }

   @Override
   public ejq.c a(czj $$0, id $$1, id $$2, ejq.c $$3, ejq.c $$4, ejm $$5) {
      dch $$6 = this.c.get($$4.b().b());
      if ($$6 == null) {
         return $$4;
      } else {
         dpi $$7 = $$4.b();
         dpi $$8 = $$6.n();
         if ($$7.b(dka.b)) {
            $$8 = $$8.a(dka.b, $$7.c(dka.b));
         }

         if ($$7.b(dka.c)) {
            $$8 = $$8.a(dka.c, $$7.c(dka.c));
         }

         if ($$7.b(djj.b)) {
            $$8 = $$8.a(djj.b, $$7.c(djj.b));
         }

         return new ejq.c($$4.a(), $$8, $$4.c());
      }
   }

   @Override
   protected ejp<?> a() {
      return ejp.l;
   }
}
