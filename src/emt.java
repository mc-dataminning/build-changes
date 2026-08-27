import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import java.util.Map;

public class emt extends enq {
   public static final Codec<emt> a = Codec.unit(() -> emt.b);
   public static final emt b = new emt();
   private final Map<dfc, dfc> c = ad.a(Maps.newHashMap(), $$0 -> {
      $$0.put(dfe.q, dfe.qC);
      $$0.put(dfe.cY, dfe.qC);
      $$0.put(dfe.b, dfe.qG);
      $$0.put(dfe.c, dfe.qG);
      $$0.put(dfe.fz, dfe.qH);
      $$0.put(dfe.fA, dfe.qH);
      $$0.put(dfe.dC, dfe.qD);
      $$0.put(dfe.og, dfe.qD);
      $$0.put(dfe.oi, dfe.qO);
      $$0.put(dfe.gb, dfe.qL);
      $$0.put(dfe.oe, dfe.qL);
      $$0.put(dfe.kC, dfe.qF);
      $$0.put(dfe.ou, dfe.qF);
      $$0.put(dfe.ky, dfe.qP);
      $$0.put(dfe.kx, dfe.qP);
      $$0.put(dfe.kE, dfe.qK);
      $$0.put(dfe.os, dfe.qK);
      $$0.put(dfe.oI, dfe.qM);
      $$0.put(dfe.oG, dfe.qM);
      $$0.put(dfe.gI, dfe.qE);
      $$0.put(dfe.gJ, dfe.qE);
      $$0.put(dfe.fC, dfe.qJ);
      $$0.put(dfe.fB, dfe.qI);
      $$0.put(dfe.fO, dfe.fP);
   });

   private emt() {
   }

   @Override
   public ent.c a(dcd $$0, ir $$1, ir $$2, ent.c $$3, ent.c $$4, enp $$5) {
      dfc $$6 = this.c.get($$4.b().b());
      if ($$6 == null) {
         return $$4;
      } else {
         dtc $$7 = $$4.b();
         dtc $$8 = $$6.n();
         if ($$7.b(dnk.b)) {
            $$8 = $$8.a(dnk.b, $$7.c(dnk.b));
         }

         if ($$7.b(dnk.c)) {
            $$8 = $$8.a(dnk.c, $$7.c(dnk.c));
         }

         if ($$7.b(dmt.b)) {
            $$8 = $$8.a(dmt.b, $$7.c(dmt.b));
         }

         return new ent.c($$4.a(), $$8, $$4.c());
      }
   }

   @Override
   protected ens<?> a() {
      return ens.l;
   }
}
