import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class dbq extends dbb {
   public static final dfy a = cwj.aC;
   protected static final float b = 2.5F;
   private static final Map<hc, eib> c = Maps.newEnumMap(
      ImmutableMap.of(
         hc.c,
         csq.a(5.5, 3.0, 11.0, 10.5, 13.0, 16.0),
         hc.d,
         csq.a(5.5, 3.0, 0.0, 10.5, 13.0, 5.0),
         hc.e,
         csq.a(11.0, 3.0, 5.5, 16.0, 13.0, 10.5),
         hc.f,
         csq.a(0.0, 3.0, 5.5, 5.0, 13.0, 10.5)
      )
   );

   protected dbq(dfd.d $$0, iv $$1) {
      super($$0, $$1);
      this.k(this.C.b().a(a, hc.c));
   }

   @Override
   public String f() {
      return this.k().a();
   }

   @Override
   public eib a(dfe $$0, cow $$1, gw $$2, ehn $$3) {
      return h($$0);
   }

   public static eib h(dfe $$0) {
      return c.get($$0.c(a));
   }

   @Override
   public boolean a(dfe $$0, cpt $$1, gw $$2) {
      hc $$3 = $$0.c(a);
      gw $$4 = $$2.a($$3.g());
      dfe $$5 = $$1.a_($$4);
      return $$5.d($$1, $$4, $$3);
   }

   @Nullable
   @Override
   public dfe a(cli $$0) {
      dfe $$1 = this.n();
      cpt $$2 = $$0.q();
      gw $$3 = $$0.a();
      hc[] $$4 = $$0.f();

      for (hc $$5 : $$4) {
         if ($$5.o().d()) {
            hc $$6 = $$5.g();
            $$1 = $$1.a(a, $$6);
            if ($$1.a($$2, $$3)) {
               return $$1;
            }
         }
      }

      return null;
   }

   @Override
   public dfe a(dfe $$0, hc $$1, dfe $$2, cpr $$3, gw $$4, gw $$5) {
      return $$1.g() == $$0.c(a) && !$$0.a($$3, $$4) ? csr.a.n() : $$0;
   }

   @Override
   public void a(dfe $$0, cpq $$1, gw $$2, arx $$3) {
      hc $$4 = $$0.c(a);
      double $$5 = (double)$$2.u() + 0.5;
      double $$6 = (double)$$2.v() + 0.7;
      double $$7 = (double)$$2.w() + 0.5;
      double $$8 = 0.22;
      double $$9 = 0.27;
      hc $$10 = $$4.g();
      $$1.a(ix.Z, $$5 + 0.27 * (double)$$10.j(), $$6 + 0.22, $$7 + 0.27 * (double)$$10.l(), 0.0, 0.0, 0.0);
      $$1.a(this.i, $$5 + 0.27 * (double)$$10.j(), $$6 + 0.22, $$7 + 0.27 * (double)$$10.l(), 0.0, 0.0, 0.0);
   }

   @Override
   public dfe a(dfe $$0, czc $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public dfe a(dfe $$0, cxl $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dff.a<csq, dfe> $$0) {
      $$0.a(a);
   }
}
