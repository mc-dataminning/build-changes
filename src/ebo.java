import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import java.util.Map;

public class ebo extends ecl {
   public static final Codec<ebo> a = Codec.unit(() -> ebo.b);
   public static final ebo b = new ebo();
   private final Map<cvz, cvz> c = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(cwb.m, cwb.pr);
      $$0.put(cwb.cn, cwb.pr);
      $$0.put(cwb.b, cwb.pv);
      $$0.put(cwb.eH, cwb.pw);
      $$0.put(cwb.eI, cwb.pw);
      $$0.put(cwb.cQ, cwb.ps);
      $$0.put(cwb.ni, cwb.ps);
      $$0.put(cwb.nk, cwb.pD);
      $$0.put(cwb.fj, cwb.pA);
      $$0.put(cwb.ng, cwb.pA);
      $$0.put(cwb.jI, cwb.pu);
      $$0.put(cwb.nw, cwb.pu);
      $$0.put(cwb.jE, cwb.pE);
      $$0.put(cwb.jD, cwb.pE);
      $$0.put(cwb.jK, cwb.pz);
      $$0.put(cwb.nu, cwb.pz);
      $$0.put(cwb.nK, cwb.pB);
      $$0.put(cwb.nI, cwb.pB);
      $$0.put(cwb.fP, cwb.pt);
      $$0.put(cwb.fQ, cwb.pt);
      $$0.put(cwb.eK, cwb.py);
      $$0.put(cwb.eJ, cwb.px);
      $$0.put(cwb.eW, cwb.eX);
   });

   private ebo() {
   }

   @Override
   public eco.c a(ctb $$0, hv $$1, hv $$2, eco.c $$3, eco.c $$4, eck $$5) {
      cvz $$6 = this.c.get($$4.b().b());
      if ($$6 == null) {
         return $$4;
      } else {
         dip $$7 = $$4.b();
         dip $$8 = $$6.o();
         if ($$7.b(dds.b)) {
            $$8 = $$8.a(dds.b, $$7.c(dds.b));
         }

         if ($$7.b(dds.c)) {
            $$8 = $$8.a(dds.c, $$7.c(dds.c));
         }

         if ($$7.b(ddb.b)) {
            $$8 = $$8.a(ddb.b, $$7.c(ddb.b));
         }

         return new eco.c($$4.a(), $$8, $$4.c());
      }
   }

   @Override
   protected ecn<?> a() {
      return ecn.l;
   }
}
