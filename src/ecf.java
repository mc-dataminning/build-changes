import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import java.util.Map;

public class ecf extends edc {
   public static final Codec<ecf> a = Codec.unit(() -> ecf.b);
   public static final ecf b = new ecf();
   private final Map<cwp, cwp> c = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(cwr.m, cwr.pr);
      $$0.put(cwr.cn, cwr.pr);
      $$0.put(cwr.b, cwr.pv);
      $$0.put(cwr.eH, cwr.pw);
      $$0.put(cwr.eI, cwr.pw);
      $$0.put(cwr.cQ, cwr.ps);
      $$0.put(cwr.ni, cwr.ps);
      $$0.put(cwr.nk, cwr.pD);
      $$0.put(cwr.fj, cwr.pA);
      $$0.put(cwr.ng, cwr.pA);
      $$0.put(cwr.jI, cwr.pu);
      $$0.put(cwr.nw, cwr.pu);
      $$0.put(cwr.jE, cwr.pE);
      $$0.put(cwr.jD, cwr.pE);
      $$0.put(cwr.jK, cwr.pz);
      $$0.put(cwr.nu, cwr.pz);
      $$0.put(cwr.nK, cwr.pB);
      $$0.put(cwr.nI, cwr.pB);
      $$0.put(cwr.fP, cwr.pt);
      $$0.put(cwr.fQ, cwr.pt);
      $$0.put(cwr.eK, cwr.py);
      $$0.put(cwr.eJ, cwr.px);
      $$0.put(cwr.eW, cwr.eX);
   });

   private ecf() {
   }

   @Override
   public edf.c a(ctr $$0, hx $$1, hx $$2, edf.c $$3, edf.c $$4, edb $$5) {
      cwp $$6 = this.c.get($$4.b().b());
      if ($$6 == null) {
         return $$4;
      } else {
         djg $$7 = $$4.b();
         djg $$8 = $$6.o();
         if ($$7.b(dei.b)) {
            $$8 = $$8.a(dei.b, $$7.c(dei.b));
         }

         if ($$7.b(dei.c)) {
            $$8 = $$8.a(dei.c, $$7.c(dei.c));
         }

         if ($$7.b(ddr.b)) {
            $$8 = $$8.a(ddr.b, $$7.c(ddr.b));
         }

         return new edf.c($$4.a(), $$8, $$4.c());
      }
   }

   @Override
   protected ede<?> a() {
      return ede.l;
   }
}
