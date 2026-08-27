import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import java.util.Map;

public class ejg extends ekd {
   public static final Codec<ejg> a = Codec.unit(() -> ejg.b);
   public static final ejg b = new ejg();
   private final Map<dcv, dcv> c = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(dcx.m, dcx.pr);
      $$0.put(dcx.cn, dcx.pr);
      $$0.put(dcx.b, dcx.pv);
      $$0.put(dcx.eH, dcx.pw);
      $$0.put(dcx.eI, dcx.pw);
      $$0.put(dcx.cQ, dcx.ps);
      $$0.put(dcx.ni, dcx.ps);
      $$0.put(dcx.nk, dcx.pD);
      $$0.put(dcx.fj, dcx.pA);
      $$0.put(dcx.ng, dcx.pA);
      $$0.put(dcx.jI, dcx.pu);
      $$0.put(dcx.nw, dcx.pu);
      $$0.put(dcx.jE, dcx.pE);
      $$0.put(dcx.jD, dcx.pE);
      $$0.put(dcx.jK, dcx.pz);
      $$0.put(dcx.nu, dcx.pz);
      $$0.put(dcx.nK, dcx.pB);
      $$0.put(dcx.nI, dcx.pB);
      $$0.put(dcx.fP, dcx.pt);
      $$0.put(dcx.fQ, dcx.pt);
      $$0.put(dcx.eK, dcx.py);
      $$0.put(dcx.eJ, dcx.px);
      $$0.put(dcx.eW, dcx.eX);
   });

   private ejg() {
   }

   @Override
   public ekg.c a(czx $$0, im $$1, im $$2, ekg.c $$3, ekg.c $$4, ekc $$5) {
      dcv $$6 = this.c.get($$4.b().b());
      if ($$6 == null) {
         return $$4;
      } else {
         dpy $$7 = $$4.b();
         dpy $$8 = $$6.n();
         if ($$7.b(dkp.b)) {
            $$8 = $$8.a(dkp.b, $$7.c(dkp.b));
         }

         if ($$7.b(dkp.c)) {
            $$8 = $$8.a(dkp.c, $$7.c(dkp.c));
         }

         if ($$7.b(djy.b)) {
            $$8 = $$8.a(djy.b, $$7.c(djy.b));
         }

         return new ekg.c($$4.a(), $$8, $$4.c());
      }
   }

   @Override
   protected ekf<?> a() {
      return ekf.l;
   }
}
