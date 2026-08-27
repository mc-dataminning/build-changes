import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import java.util.Map;

public class efg extends egd {
   public static final Codec<efg> a = Codec.unit(() -> efg.b);
   public static final efg b = new efg();
   private final Map<czf, czf> c = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(czh.m, czh.pr);
      $$0.put(czh.cn, czh.pr);
      $$0.put(czh.b, czh.pv);
      $$0.put(czh.eH, czh.pw);
      $$0.put(czh.eI, czh.pw);
      $$0.put(czh.cQ, czh.ps);
      $$0.put(czh.ni, czh.ps);
      $$0.put(czh.nk, czh.pD);
      $$0.put(czh.fj, czh.pA);
      $$0.put(czh.ng, czh.pA);
      $$0.put(czh.jI, czh.pu);
      $$0.put(czh.nw, czh.pu);
      $$0.put(czh.jE, czh.pE);
      $$0.put(czh.jD, czh.pE);
      $$0.put(czh.jK, czh.pz);
      $$0.put(czh.nu, czh.pz);
      $$0.put(czh.nK, czh.pB);
      $$0.put(czh.nI, czh.pB);
      $$0.put(czh.fP, czh.pt);
      $$0.put(czh.fQ, czh.pt);
      $$0.put(czh.eK, czh.py);
      $$0.put(czh.eJ, czh.px);
      $$0.put(czh.eW, czh.eX);
   });

   private efg() {
   }

   @Override
   public egg.c a(cwh $$0, ib $$1, ib $$2, egg.c $$3, egg.c $$4, egc $$5) {
      czf $$6 = this.c.get($$4.b().b());
      if ($$6 == null) {
         return $$4;
      } else {
         dme $$7 = $$4.b();
         dme $$8 = $$6.o();
         if ($$7.b(dgy.b)) {
            $$8 = $$8.a(dgy.b, $$7.c(dgy.b));
         }

         if ($$7.b(dgy.c)) {
            $$8 = $$8.a(dgy.c, $$7.c(dgy.c));
         }

         if ($$7.b(dgh.b)) {
            $$8 = $$8.a(dgh.b, $$7.c(dgh.b));
         }

         return new egg.c($$4.a(), $$8, $$4.c());
      }
   }

   @Override
   protected egf<?> a() {
      return egf.l;
   }
}
