import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class ctt extends czv {
   public static final dgj a = dfz.ba;
   public static final dga b = dfz.a;
   protected static final float c = 5.0F;
   protected static final eig d = csv.a(3.0, 0.0, 3.0, 13.0, 16.0, 13.0);
   private static final Map<Integer, eig> h = Maps.newHashMap(
      ImmutableMap.of(
         0,
         csv.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0),
         4,
         csv.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0),
         8,
         csv.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0),
         12,
         csv.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0)
      )
   );

   public ctt(dfi.d $$0, dgw $$1) {
      super($$0.a($$1.e()), $$1);
      this.k(this.C.b().a(a, Integer.valueOf(0)).a(b, Boolean.valueOf(false)).a(e, Boolean.valueOf(false)));
   }

   @Override
   public bgy a(dfj $$0, cpv $$1, gw $$2, cbu $$3, bgx $$4, ehj $$5) {
      if ($$1.c_($$2) instanceof ded $$6) {
         cjf $$7 = $$3.b($$4);
         if (this.a($$3, $$5, $$6, $$7)) {
            return bgy.d;
         }
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private boolean a(cbu $$0, ehj $$1, ded $$2, cjf $$3) {
      return !$$2.a($$2.a($$0), $$0) && $$3.d() instanceof cir && $$1.b().equals(hc.a);
   }

   @Override
   public boolean a(dfj $$0, cpy $$1, gw $$2) {
      return $$1.a_($$2.c()).a($$1, $$2.c(), hc.a, dax.b);
   }

   @Override
   public dfj a(cln $$0) {
      cpv $$1 = $$0.q();
      eam $$2 = $$1.b_($$0.a());
      gw $$3 = $$0.a().c();
      dfj $$4 = $$1.a_($$3);
      boolean $$5 = $$4.a(apt.az);
      hc $$6 = hc.a((double)$$0.i());
      boolean $$7 = !csv.a($$4.k($$1, $$3), hc.a) || $$0.h();
      if ($$5 && !$$0.h()) {
         if ($$4.b(dbs.a)) {
            hc $$8 = $$4.c(dbs.a);
            if ($$8.o().a($$6)) {
               $$7 = false;
            }
         } else if ($$4.b(a)) {
            Optional<hc> $$9 = dgp.a($$4.c(a));
            if ($$9.isPresent() && $$9.get().o().a($$6)) {
               $$7 = false;
            }
         }
      }

      int $$10 = !$$7 ? dgp.a($$6.g()) : dgp.a($$0.i() + 180.0F);
      return this.n().a(b, Boolean.valueOf($$7)).a(a, Integer.valueOf($$10)).a(e, Boolean.valueOf($$2.a() == ean.c));
   }

   @Override
   public eig a(dfj $$0, cpb $$1, gw $$2, ehs $$3) {
      eig $$4 = h.get($$0.c(a));
      return $$4 == null ? d : $$4;
   }

   @Override
   public eig b_(dfj $$0, cpb $$1, gw $$2) {
      return this.a($$0, $$1, $$2, ehs.a());
   }

   @Override
   public dfj a(dfj $$0, hc $$1, dfj $$2, cpw $$3, gw $$4, gw $$5) {
      return $$1 == hc.b && !this.a($$0, $$3, $$4) ? csw.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float g(dfj $$0) {
      return dgp.b($$0.c(a));
   }

   @Override
   public dfj a(dfj $$0, czh $$1) {
      return $$0.a(a, Integer.valueOf($$1.a($$0.c(a), 16)));
   }

   @Override
   public dfj a(dfj $$0, cxq $$1) {
      return $$0.a(a, Integer.valueOf($$1.a($$0.c(a), 16)));
   }

   @Override
   protected void a(dfk.a<csv, dfj> $$0) {
      $$0.a(a, b, e);
   }

   @Override
   public dcv a(gw $$0, dfj $$1) {
      return new ddr($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dcv> dcw<T> a(cpv $$0, dfj $$1, dcx<T> $$2) {
      return a($$2, dcx.i, ded::a);
   }
}
