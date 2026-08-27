import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public class ekl extends eli {
   public static final MapCodec<ekl> a = MapCodec.unit(() -> ekl.b);
   public static final ekl b = new ekl();
   private final Map<dea, dea> c = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(dec.m, dec.pr);
      $$0.put(dec.cn, dec.pr);
      $$0.put(dec.b, dec.pv);
      $$0.put(dec.eH, dec.pw);
      $$0.put(dec.eI, dec.pw);
      $$0.put(dec.cQ, dec.ps);
      $$0.put(dec.ni, dec.ps);
      $$0.put(dec.nk, dec.pD);
      $$0.put(dec.fj, dec.pA);
      $$0.put(dec.ng, dec.pA);
      $$0.put(dec.jI, dec.pu);
      $$0.put(dec.nw, dec.pu);
      $$0.put(dec.jE, dec.pE);
      $$0.put(dec.jD, dec.pE);
      $$0.put(dec.jK, dec.pz);
      $$0.put(dec.nu, dec.pz);
      $$0.put(dec.nK, dec.pB);
      $$0.put(dec.nI, dec.pB);
      $$0.put(dec.fP, dec.pt);
      $$0.put(dec.fQ, dec.pt);
      $$0.put(dec.eK, dec.py);
      $$0.put(dec.eJ, dec.px);
      $$0.put(dec.eW, dec.eX);
   });

   private ekl() {
   }

   @Override
   public ell.c a(dbc $$0, io $$1, io $$2, ell.c $$3, ell.c $$4, elh $$5) {
      dea $$6 = this.c.get($$4.b().b());
      if ($$6 == null) {
         return $$4;
      } else {
         drd $$7 = $$4.b();
         drd $$8 = $$6.n();
         if ($$7.b(dlu.b)) {
            $$8 = $$8.a(dlu.b, $$7.c(dlu.b));
         }

         if ($$7.b(dlu.c)) {
            $$8 = $$8.a(dlu.c, $$7.c(dlu.c));
         }

         if ($$7.b(dld.b)) {
            $$8 = $$8.a(dld.b, $$7.c(dld.b));
         }

         return new ell.c($$4.a(), $$8, $$4.c());
      }
   }

   @Override
   protected elk<?> a() {
      return elk.l;
   }
}
