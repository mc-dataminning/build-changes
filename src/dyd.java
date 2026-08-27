import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import java.util.Map;

public class dyd extends dza {
   public static final Codec<dyd> a = Codec.unit(() -> dyd.b);
   public static final dyd b = new dyd();
   private final Map<csx, csx> c = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(csy.m, csy.pr);
      $$0.put(csy.cn, csy.pr);
      $$0.put(csy.b, csy.pv);
      $$0.put(csy.eI, csy.pw);
      $$0.put(csy.eJ, csy.pw);
      $$0.put(csy.cQ, csy.ps);
      $$0.put(csy.ni, csy.ps);
      $$0.put(csy.nk, csy.pD);
      $$0.put(csy.fj, csy.pA);
      $$0.put(csy.ng, csy.pA);
      $$0.put(csy.jI, csy.pu);
      $$0.put(csy.nw, csy.pu);
      $$0.put(csy.jE, csy.pE);
      $$0.put(csy.jD, csy.pE);
      $$0.put(csy.jK, csy.pz);
      $$0.put(csy.nu, csy.pz);
      $$0.put(csy.nK, csy.pB);
      $$0.put(csy.nI, csy.pB);
      $$0.put(csy.fP, csy.pt);
      $$0.put(csy.fQ, csy.pt);
      $$0.put(csy.eL, csy.py);
      $$0.put(csy.eK, csy.px);
      $$0.put(csy.eX, csy.eY);
   });

   private dyd() {
   }

   @Override
   public dzd.c a(cqa $$0, gw $$1, gw $$2, dzd.c $$3, dzd.c $$4, dyz $$5) {
      csx $$6 = this.c.get($$4.b().b());
      if ($$6 == null) {
         return $$4;
      } else {
         dfl $$7 = $$4.b();
         dfl $$8 = $$6.n();
         if ($$7.b(dar.a)) {
            $$8 = $$8.a(dar.a, $$7.c(dar.a));
         }

         if ($$7.b(dar.b)) {
            $$8 = $$8.a(dar.b, $$7.c(dar.b));
         }

         if ($$7.b(daa.a)) {
            $$8 = $$8.a(daa.a, $$7.c(daa.a));
         }

         return new dzd.c($$4.a(), $$8, $$4.c());
      }
   }

   @Override
   protected dzc<?> a() {
      return dzc.l;
   }
}
