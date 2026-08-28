import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public class enp extends eon {
   public static final MapCodec<enp> a = MapCodec.unit(() -> enp.b);
   public static final enp b = new enp();
   private final Map<dgv, dgv> c = ad.a(Maps.newHashMap(), $$0 -> {
      $$0.put(dgx.m, dgx.pr);
      $$0.put(dgx.cn, dgx.pr);
      $$0.put(dgx.b, dgx.pv);
      $$0.put(dgx.eH, dgx.pw);
      $$0.put(dgx.eI, dgx.pw);
      $$0.put(dgx.cQ, dgx.ps);
      $$0.put(dgx.ni, dgx.ps);
      $$0.put(dgx.nk, dgx.pD);
      $$0.put(dgx.fj, dgx.pA);
      $$0.put(dgx.ng, dgx.pA);
      $$0.put(dgx.jI, dgx.pu);
      $$0.put(dgx.nw, dgx.pu);
      $$0.put(dgx.jE, dgx.pE);
      $$0.put(dgx.jD, dgx.pE);
      $$0.put(dgx.jK, dgx.pz);
      $$0.put(dgx.nu, dgx.pz);
      $$0.put(dgx.nK, dgx.pB);
      $$0.put(dgx.nI, dgx.pB);
      $$0.put(dgx.fP, dgx.pt);
      $$0.put(dgx.fQ, dgx.pt);
      $$0.put(dgx.eK, dgx.py);
      $$0.put(dgx.eJ, dgx.px);
      $$0.put(dgx.eW, dgx.eX);
   });

   private enp() {
   }

   @Override
   public eoq.c a(ddv $$0, je $$1, je $$2, eoq.c $$3, eoq.c $$4, eom $$5) {
      dgv $$6 = this.c.get($$4.b().b());
      if ($$6 == null) {
         return $$4;
      } else {
         dua $$7 = $$4.b();
         dua $$8 = $$6.o();
         if ($$7.b(doq.b)) {
            $$8 = $$8.b(doq.b, $$7.c(doq.b));
         }

         if ($$7.b(doq.c)) {
            $$8 = $$8.b(doq.c, $$7.c(doq.c));
         }

         if ($$7.b(dnz.b)) {
            $$8 = $$8.b(dnz.b, $$7.c(dnz.b));
         }

         return new eoq.c($$4.a(), $$8, $$4.c());
      }
   }

   @Override
   protected eop<?> a() {
      return eop.l;
   }
}
