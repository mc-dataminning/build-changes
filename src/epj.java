import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public class epj extends eqh {
   public static final MapCodec<epj> a = MapCodec.unit(() -> epj.b);
   public static final epj b = new epj();
   private final Map<diq, diq> c = ae.a(Maps.newHashMap(), $$0 -> {
      $$0.put(dis.m, dis.pr);
      $$0.put(dis.cn, dis.pr);
      $$0.put(dis.b, dis.pv);
      $$0.put(dis.eH, dis.pw);
      $$0.put(dis.eI, dis.pw);
      $$0.put(dis.cQ, dis.ps);
      $$0.put(dis.ni, dis.ps);
      $$0.put(dis.nk, dis.pD);
      $$0.put(dis.fj, dis.pA);
      $$0.put(dis.ng, dis.pA);
      $$0.put(dis.jI, dis.pu);
      $$0.put(dis.nw, dis.pu);
      $$0.put(dis.jE, dis.pE);
      $$0.put(dis.jD, dis.pE);
      $$0.put(dis.jK, dis.pz);
      $$0.put(dis.nu, dis.pz);
      $$0.put(dis.nK, dis.pB);
      $$0.put(dis.nI, dis.pB);
      $$0.put(dis.fP, dis.pt);
      $$0.put(dis.fQ, dis.pt);
      $$0.put(dis.eK, dis.py);
      $$0.put(dis.eJ, dis.px);
      $$0.put(dis.eW, dis.eX);
   });

   private epj() {
   }

   @Override
   public eqk.c a(dfp $$0, jh $$1, jh $$2, eqk.c $$3, eqk.c $$4, eqg $$5) {
      diq $$6 = this.c.get($$4.b().b());
      if ($$6 == null) {
         return $$4;
      } else {
         dvv $$7 = $$4.b();
         dvv $$8 = $$6.m();
         if ($$7.b(dqk.b)) {
            $$8 = $$8.b(dqk.b, $$7.c(dqk.b));
         }

         if ($$7.b(dqk.c)) {
            $$8 = $$8.b(dqk.c, $$7.c(dqk.c));
         }

         if ($$7.b(dpt.b)) {
            $$8 = $$8.b(dpt.b, $$7.c(dpt.b));
         }

         return new eqk.c($$4.a(), $$8, $$4.c());
      }
   }

   @Override
   protected eqj<?> a() {
      return eqj.l;
   }
}
