import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public class eli extends emf {
   public static final MapCodec<eli> a = MapCodec.unit(() -> eli.b);
   public static final eli b = new eli();
   private final Map<dex, dex> c = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(dez.m, dez.pr);
      $$0.put(dez.cn, dez.pr);
      $$0.put(dez.b, dez.pv);
      $$0.put(dez.eH, dez.pw);
      $$0.put(dez.eI, dez.pw);
      $$0.put(dez.cQ, dez.ps);
      $$0.put(dez.ni, dez.ps);
      $$0.put(dez.nk, dez.pD);
      $$0.put(dez.fj, dez.pA);
      $$0.put(dez.ng, dez.pA);
      $$0.put(dez.jI, dez.pu);
      $$0.put(dez.nw, dez.pu);
      $$0.put(dez.jE, dez.pE);
      $$0.put(dez.jD, dez.pE);
      $$0.put(dez.jK, dez.pz);
      $$0.put(dez.nu, dez.pz);
      $$0.put(dez.nK, dez.pB);
      $$0.put(dez.nI, dez.pB);
      $$0.put(dez.fP, dez.pt);
      $$0.put(dez.fQ, dez.pt);
      $$0.put(dez.eK, dez.py);
      $$0.put(dez.eJ, dez.px);
      $$0.put(dez.eW, dez.eX);
   });

   private eli() {
   }

   @Override
   public emi.c a(dbz $$0, iz $$1, iz $$2, emi.c $$3, emi.c $$4, eme $$5) {
      dex $$6 = this.c.get($$4.b().b());
      if ($$6 == null) {
         return $$4;
      } else {
         dsa $$7 = $$4.b();
         dsa $$8 = $$6.o();
         if ($$7.b(dmr.b)) {
            $$8 = $$8.a(dmr.b, $$7.c(dmr.b));
         }

         if ($$7.b(dmr.c)) {
            $$8 = $$8.a(dmr.c, $$7.c(dmr.c));
         }

         if ($$7.b(dma.b)) {
            $$8 = $$8.a(dma.b, $$7.c(dma.b));
         }

         return new emi.c($$4.a(), $$8, $$4.c());
      }
   }

   @Override
   protected emh<?> a() {
      return emh.l;
   }
}
