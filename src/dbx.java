import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class dbx extends dbi {
   public static final dgf a = cwq.aC;
   protected static final float b = 2.5F;
   private static final Map<hc, eii> c = Maps.newEnumMap(
      ImmutableMap.of(
         hc.c,
         csx.a(5.5, 3.0, 11.0, 10.5, 13.0, 16.0),
         hc.d,
         csx.a(5.5, 3.0, 0.0, 10.5, 13.0, 5.0),
         hc.e,
         csx.a(11.0, 3.0, 5.5, 16.0, 13.0, 10.5),
         hc.f,
         csx.a(0.0, 3.0, 5.5, 5.0, 13.0, 10.5)
      )
   );

   protected dbx(dfk.d $$0, iv $$1) {
      super($$0, $$1);
      this.k(this.C.b().a(a, hc.c));
   }

   @Override
   public String f() {
      return this.k().a();
   }

   @Override
   public eii a(dfl $$0, cpd $$1, gw $$2, ehu $$3) {
      return h($$0);
   }

   public static eii h(dfl $$0) {
      return c.get($$0.c(a));
   }

   @Override
   public boolean a(dfl $$0, cqa $$1, gw $$2) {
      hc $$3 = $$0.c(a);
      gw $$4 = $$2.a($$3.g());
      dfl $$5 = $$1.a_($$4);
      return $$5.d($$1, $$4, $$3);
   }

   @Nullable
   @Override
   public dfl a(clp $$0) {
      dfl $$1 = this.n();
      cqa $$2 = $$0.q();
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
   public dfl a(dfl $$0, hc $$1, dfl $$2, cpy $$3, gw $$4, gw $$5) {
      return $$1.g() == $$0.c(a) && !$$0.a($$3, $$4) ? csy.a.n() : $$0;
   }

   @Override
   public void a(dfl $$0, cpx $$1, gw $$2, ase $$3) {
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
   public dfl a(dfl $$0, czj $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public dfl a(dfl $$0, cxs $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dfm.a<csx, dfl> $$0) {
      $$0.a(a);
   }
}
