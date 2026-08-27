import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public class ekj extends elg {
   public static final MapCodec<ekj> a = MapCodec.unit(() -> ekj.b);
   public static final ekj b = new ekj();
   private final Map<ddy, ddy> c = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(dea.m, dea.pr);
      $$0.put(dea.cn, dea.pr);
      $$0.put(dea.b, dea.pv);
      $$0.put(dea.eH, dea.pw);
      $$0.put(dea.eI, dea.pw);
      $$0.put(dea.cQ, dea.ps);
      $$0.put(dea.ni, dea.ps);
      $$0.put(dea.nk, dea.pD);
      $$0.put(dea.fj, dea.pA);
      $$0.put(dea.ng, dea.pA);
      $$0.put(dea.jI, dea.pu);
      $$0.put(dea.nw, dea.pu);
      $$0.put(dea.jE, dea.pE);
      $$0.put(dea.jD, dea.pE);
      $$0.put(dea.jK, dea.pz);
      $$0.put(dea.nu, dea.pz);
      $$0.put(dea.nK, dea.pB);
      $$0.put(dea.nI, dea.pB);
      $$0.put(dea.fP, dea.pt);
      $$0.put(dea.fQ, dea.pt);
      $$0.put(dea.eK, dea.py);
      $$0.put(dea.eJ, dea.px);
      $$0.put(dea.eW, dea.eX);
   });

   private ekj() {
   }

   @Override
   public elj.c a(dba $$0, io $$1, io $$2, elj.c $$3, elj.c $$4, elf $$5) {
      ddy $$6 = this.c.get($$4.b().b());
      if ($$6 == null) {
         return $$4;
      } else {
         drb $$7 = $$4.b();
         drb $$8 = $$6.n();
         if ($$7.b(dls.b)) {
            $$8 = $$8.a(dls.b, $$7.c(dls.b));
         }

         if ($$7.b(dls.c)) {
            $$8 = $$8.a(dls.c, $$7.c(dls.c));
         }

         if ($$7.b(dlb.b)) {
            $$8 = $$8.a(dlb.b, $$7.c(dlb.b));
         }

         return new elj.c($$4.a(), $$8, $$4.c());
      }
   }

   @Override
   protected eli<?> a() {
      return eli.l;
   }
}
