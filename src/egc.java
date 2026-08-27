import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import java.util.Map;

public class egc extends egz {
   public static final Codec<egc> a = Codec.unit(() -> egc.b);
   public static final egc b = new egc();
   private final Map<daa, daa> c = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(dac.m, dac.pr);
      $$0.put(dac.cn, dac.pr);
      $$0.put(dac.b, dac.pv);
      $$0.put(dac.eH, dac.pw);
      $$0.put(dac.eI, dac.pw);
      $$0.put(dac.cQ, dac.ps);
      $$0.put(dac.ni, dac.ps);
      $$0.put(dac.nk, dac.pD);
      $$0.put(dac.fj, dac.pA);
      $$0.put(dac.ng, dac.pA);
      $$0.put(dac.jI, dac.pu);
      $$0.put(dac.nw, dac.pu);
      $$0.put(dac.jE, dac.pE);
      $$0.put(dac.jD, dac.pE);
      $$0.put(dac.jK, dac.pz);
      $$0.put(dac.nu, dac.pz);
      $$0.put(dac.nK, dac.pB);
      $$0.put(dac.nI, dac.pB);
      $$0.put(dac.fP, dac.pt);
      $$0.put(dac.fQ, dac.pt);
      $$0.put(dac.eK, dac.py);
      $$0.put(dac.eJ, dac.px);
      $$0.put(dac.eW, dac.eX);
   });

   private egc() {
   }

   @Override
   public ehc.c a(cxc $$0, ib $$1, ib $$2, ehc.c $$3, ehc.c $$4, egy $$5) {
      daa $$6 = this.c.get($$4.b().b());
      if ($$6 == null) {
         return $$4;
      } else {
         dmz $$7 = $$4.b();
         dmz $$8 = $$6.o();
         if ($$7.b(dht.b)) {
            $$8 = $$8.a(dht.b, $$7.c(dht.b));
         }

         if ($$7.b(dht.c)) {
            $$8 = $$8.a(dht.c, $$7.c(dht.c));
         }

         if ($$7.b(dhc.b)) {
            $$8 = $$8.a(dhc.b, $$7.c(dhc.b));
         }

         return new ehc.c($$4.a(), $$8, $$4.c());
      }
   }

   @Override
   protected ehb<?> a() {
      return ehb.l;
   }
}
