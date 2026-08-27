import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import java.util.Map;

public class ege extends ehb {
   public static final Codec<ege> a = Codec.unit(() -> ege.b);
   public static final ege b = new ege();
   private final Map<dac, dac> c = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(dae.m, dae.pr);
      $$0.put(dae.cn, dae.pr);
      $$0.put(dae.b, dae.pv);
      $$0.put(dae.eH, dae.pw);
      $$0.put(dae.eI, dae.pw);
      $$0.put(dae.cQ, dae.ps);
      $$0.put(dae.ni, dae.ps);
      $$0.put(dae.nk, dae.pD);
      $$0.put(dae.fj, dae.pA);
      $$0.put(dae.ng, dae.pA);
      $$0.put(dae.jI, dae.pu);
      $$0.put(dae.nw, dae.pu);
      $$0.put(dae.jE, dae.pE);
      $$0.put(dae.jD, dae.pE);
      $$0.put(dae.jK, dae.pz);
      $$0.put(dae.nu, dae.pz);
      $$0.put(dae.nK, dae.pB);
      $$0.put(dae.nI, dae.pB);
      $$0.put(dae.fP, dae.pt);
      $$0.put(dae.fQ, dae.pt);
      $$0.put(dae.eK, dae.py);
      $$0.put(dae.eJ, dae.px);
      $$0.put(dae.eW, dae.eX);
   });

   private ege() {
   }

   @Override
   public ehe.c a(cxe $$0, ib $$1, ib $$2, ehe.c $$3, ehe.c $$4, eha $$5) {
      dac $$6 = this.c.get($$4.b().b());
      if ($$6 == null) {
         return $$4;
      } else {
         dnb $$7 = $$4.b();
         dnb $$8 = $$6.o();
         if ($$7.b(dhv.b)) {
            $$8 = $$8.a(dhv.b, $$7.c(dhv.b));
         }

         if ($$7.b(dhv.c)) {
            $$8 = $$8.a(dhv.c, $$7.c(dhv.c));
         }

         if ($$7.b(dhe.b)) {
            $$8 = $$8.a(dhe.b, $$7.c(dhe.b));
         }

         return new ehe.c($$4.a(), $$8, $$4.c());
      }
   }

   @Override
   protected ehd<?> a() {
      return ehd.l;
   }
}
