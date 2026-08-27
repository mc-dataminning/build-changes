import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import java.util.Map;

public class ebz extends ecw {
   public static final Codec<ebz> a = Codec.unit(() -> ebz.b);
   public static final ebz b = new ebz();
   private final Map<cwj, cwj> c = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(cwl.m, cwl.pr);
      $$0.put(cwl.cn, cwl.pr);
      $$0.put(cwl.b, cwl.pv);
      $$0.put(cwl.eH, cwl.pw);
      $$0.put(cwl.eI, cwl.pw);
      $$0.put(cwl.cQ, cwl.ps);
      $$0.put(cwl.ni, cwl.ps);
      $$0.put(cwl.nk, cwl.pD);
      $$0.put(cwl.fj, cwl.pA);
      $$0.put(cwl.ng, cwl.pA);
      $$0.put(cwl.jI, cwl.pu);
      $$0.put(cwl.nw, cwl.pu);
      $$0.put(cwl.jE, cwl.pE);
      $$0.put(cwl.jD, cwl.pE);
      $$0.put(cwl.jK, cwl.pz);
      $$0.put(cwl.nu, cwl.pz);
      $$0.put(cwl.nK, cwl.pB);
      $$0.put(cwl.nI, cwl.pB);
      $$0.put(cwl.fP, cwl.pt);
      $$0.put(cwl.fQ, cwl.pt);
      $$0.put(cwl.eK, cwl.py);
      $$0.put(cwl.eJ, cwl.px);
      $$0.put(cwl.eW, cwl.eX);
   });

   private ebz() {
   }

   @Override
   public ecz.c a(ctl $$0, hx $$1, hx $$2, ecz.c $$3, ecz.c $$4, ecv $$5) {
      cwj $$6 = this.c.get($$4.b().b());
      if ($$6 == null) {
         return $$4;
      } else {
         dja $$7 = $$4.b();
         dja $$8 = $$6.o();
         if ($$7.b(dec.b)) {
            $$8 = $$8.a(dec.b, $$7.c(dec.b));
         }

         if ($$7.b(dec.c)) {
            $$8 = $$8.a(dec.c, $$7.c(dec.c));
         }

         if ($$7.b(ddl.b)) {
            $$8 = $$8.a(ddl.b, $$7.c(ddl.b));
         }

         return new ecz.c($$4.a(), $$8, $$4.c());
      }
   }

   @Override
   protected ecy<?> a() {
      return ecy.l;
   }
}
