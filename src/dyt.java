import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import java.util.Map;

public class dyt extends dzq {
   public static final Codec<dyt> a = Codec.unit(() -> dyt.b);
   public static final dyt b = new dyt();
   private final Map<cua, cua> c = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(cuc.m, cuc.pr);
      $$0.put(cuc.cn, cuc.pr);
      $$0.put(cuc.b, cuc.pv);
      $$0.put(cuc.eH, cuc.pw);
      $$0.put(cuc.eI, cuc.pw);
      $$0.put(cuc.cQ, cuc.ps);
      $$0.put(cuc.ni, cuc.ps);
      $$0.put(cuc.nk, cuc.pD);
      $$0.put(cuc.fj, cuc.pA);
      $$0.put(cuc.ng, cuc.pA);
      $$0.put(cuc.jI, cuc.pu);
      $$0.put(cuc.nw, cuc.pu);
      $$0.put(cuc.jE, cuc.pE);
      $$0.put(cuc.jD, cuc.pE);
      $$0.put(cuc.jK, cuc.pz);
      $$0.put(cuc.nu, cuc.pz);
      $$0.put(cuc.nK, cuc.pB);
      $$0.put(cuc.nI, cuc.pB);
      $$0.put(cuc.fP, cuc.pt);
      $$0.put(cuc.fQ, cuc.pt);
      $$0.put(cuc.eK, cuc.py);
      $$0.put(cuc.eJ, cuc.px);
      $$0.put(cuc.eW, cuc.eX);
   });

   private dyt() {
   }

   @Override
   public dzt.c a(crc $$0, ht $$1, ht $$2, dzt.c $$3, dzt.c $$4, dzp $$5) {
      cua $$6 = this.c.get($$4.b().b());
      if ($$6 == null) {
         return $$4;
      } else {
         dgb $$7 = $$4.b();
         dgb $$8 = $$6.o();
         if ($$7.b(dbs.b)) {
            $$8 = $$8.a(dbs.b, $$7.c(dbs.b));
         }

         if ($$7.b(dbs.c)) {
            $$8 = $$8.a(dbs.c, $$7.c(dbs.c));
         }

         if ($$7.b(dbb.b)) {
            $$8 = $$8.a(dbb.b, $$7.c(dbb.b));
         }

         return new dzt.c($$4.a(), $$8, $$4.c());
      }
   }

   @Override
   protected dzs<?> a() {
      return dzs.l;
   }
}
