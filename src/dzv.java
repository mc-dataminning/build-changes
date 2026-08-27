import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import java.util.Map;

public class dzv extends eas {
   public static final Codec<dzv> a = Codec.unit(() -> dzv.b);
   public static final dzv b = new dzv();
   private final Map<cut, cut> c = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(cuv.m, cuv.pr);
      $$0.put(cuv.cn, cuv.pr);
      $$0.put(cuv.b, cuv.pv);
      $$0.put(cuv.eH, cuv.pw);
      $$0.put(cuv.eI, cuv.pw);
      $$0.put(cuv.cQ, cuv.ps);
      $$0.put(cuv.ni, cuv.ps);
      $$0.put(cuv.nk, cuv.pD);
      $$0.put(cuv.fj, cuv.pA);
      $$0.put(cuv.ng, cuv.pA);
      $$0.put(cuv.jI, cuv.pu);
      $$0.put(cuv.nw, cuv.pu);
      $$0.put(cuv.jE, cuv.pE);
      $$0.put(cuv.jD, cuv.pE);
      $$0.put(cuv.jK, cuv.pz);
      $$0.put(cuv.nu, cuv.pz);
      $$0.put(cuv.nK, cuv.pB);
      $$0.put(cuv.nI, cuv.pB);
      $$0.put(cuv.fP, cuv.pt);
      $$0.put(cuv.fQ, cuv.pt);
      $$0.put(cuv.eK, cuv.py);
      $$0.put(cuv.eJ, cuv.px);
      $$0.put(cuv.eW, cuv.eX);
   });

   private dzv() {
   }

   @Override
   public eav.c a(crv $$0, ht $$1, ht $$2, eav.c $$3, eav.c $$4, ear $$5) {
      cut $$6 = this.c.get($$4.b().b());
      if ($$6 == null) {
         return $$4;
      } else {
         dgw $$7 = $$4.b();
         dgw $$8 = $$6.o();
         if ($$7.b(dcm.b)) {
            $$8 = $$8.a(dcm.b, $$7.c(dcm.b));
         }

         if ($$7.b(dcm.c)) {
            $$8 = $$8.a(dcm.c, $$7.c(dcm.c));
         }

         if ($$7.b(dbv.b)) {
            $$8 = $$8.a(dbv.b, $$7.c(dbv.b));
         }

         return new eav.c($$4.a(), $$8, $$4.c());
      }
   }

   @Override
   protected eau<?> a() {
      return eau.l;
   }
}
