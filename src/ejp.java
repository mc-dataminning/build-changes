import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import java.util.Map;

public class ejp extends ekm {
   public static final Codec<ejp> a = Codec.unit(() -> ejp.b);
   public static final ejp b = new ejp();
   private final Map<dde, dde> c = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(ddg.m, ddg.pr);
      $$0.put(ddg.cn, ddg.pr);
      $$0.put(ddg.b, ddg.pv);
      $$0.put(ddg.eH, ddg.pw);
      $$0.put(ddg.eI, ddg.pw);
      $$0.put(ddg.cQ, ddg.ps);
      $$0.put(ddg.ni, ddg.ps);
      $$0.put(ddg.nk, ddg.pD);
      $$0.put(ddg.fj, ddg.pA);
      $$0.put(ddg.ng, ddg.pA);
      $$0.put(ddg.jI, ddg.pu);
      $$0.put(ddg.nw, ddg.pu);
      $$0.put(ddg.jE, ddg.pE);
      $$0.put(ddg.jD, ddg.pE);
      $$0.put(ddg.jK, ddg.pz);
      $$0.put(ddg.nu, ddg.pz);
      $$0.put(ddg.nK, ddg.pB);
      $$0.put(ddg.nI, ddg.pB);
      $$0.put(ddg.fP, ddg.pt);
      $$0.put(ddg.fQ, ddg.pt);
      $$0.put(ddg.eK, ddg.py);
      $$0.put(ddg.eJ, ddg.px);
      $$0.put(ddg.eW, ddg.eX);
   });

   private ejp() {
   }

   @Override
   public ekp.c a(dag $$0, in $$1, in $$2, ekp.c $$3, ekp.c $$4, ekl $$5) {
      dde $$6 = this.c.get($$4.b().b());
      if ($$6 == null) {
         return $$4;
      } else {
         dqh $$7 = $$4.b();
         dqh $$8 = $$6.n();
         if ($$7.b(dky.b)) {
            $$8 = $$8.a(dky.b, $$7.c(dky.b));
         }

         if ($$7.b(dky.c)) {
            $$8 = $$8.a(dky.c, $$7.c(dky.c));
         }

         if ($$7.b(dkh.b)) {
            $$8 = $$8.a(dkh.b, $$7.c(dkh.b));
         }

         return new ekp.c($$4.a(), $$8, $$4.c());
      }
   }

   @Override
   protected eko<?> a() {
      return eko.l;
   }
}
