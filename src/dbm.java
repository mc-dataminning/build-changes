import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class dbm extends dax {
   public static final dfu a = cwf.aC;
   protected static final float b = 2.5F;
   private static final Map<ha, ehx> c = Maps.newEnumMap(
      ImmutableMap.of(
         ha.c,
         csm.a(5.5, 3.0, 11.0, 10.5, 13.0, 16.0),
         ha.d,
         csm.a(5.5, 3.0, 0.0, 10.5, 13.0, 5.0),
         ha.e,
         csm.a(11.0, 3.0, 5.5, 16.0, 13.0, 10.5),
         ha.f,
         csm.a(0.0, 3.0, 5.5, 5.0, 13.0, 10.5)
      )
   );

   protected dbm(dez.d $$0, it $$1) {
      super($$0, $$1);
      this.k(this.C.b().a(a, ha.c));
   }

   @Override
   public String f() {
      return this.k().a();
   }

   @Override
   public ehx a(dfa $$0, cos $$1, gu $$2, ehj $$3) {
      return h($$0);
   }

   public static ehx h(dfa $$0) {
      return c.get($$0.c(a));
   }

   @Override
   public boolean a(dfa $$0, cpp $$1, gu $$2) {
      ha $$3 = $$0.c(a);
      gu $$4 = $$2.a($$3.g());
      dfa $$5 = $$1.a_($$4);
      return $$5.d($$1, $$4, $$3);
   }

   @Nullable
   @Override
   public dfa a(clg $$0) {
      dfa $$1 = this.n();
      cpp $$2 = $$0.q();
      gu $$3 = $$0.a();
      ha[] $$4 = $$0.f();

      for (ha $$5 : $$4) {
         if ($$5.o().d()) {
            ha $$6 = $$5.g();
            $$1 = $$1.a(a, $$6);
            if ($$1.a($$2, $$3)) {
               return $$1;
            }
         }
      }

      return null;
   }

   @Override
   public dfa a(dfa $$0, ha $$1, dfa $$2, cpn $$3, gu $$4, gu $$5) {
      return $$1.g() == $$0.c(a) && !$$0.a($$3, $$4) ? csn.a.n() : $$0;
   }

   @Override
   public void a(dfa $$0, cpm $$1, gu $$2, aru $$3) {
      ha $$4 = $$0.c(a);
      double $$5 = (double)$$2.u() + 0.5;
      double $$6 = (double)$$2.v() + 0.7;
      double $$7 = (double)$$2.w() + 0.5;
      double $$8 = 0.22;
      double $$9 = 0.27;
      ha $$10 = $$4.g();
      $$1.a(iv.Z, $$5 + 0.27 * (double)$$10.j(), $$6 + 0.22, $$7 + 0.27 * (double)$$10.l(), 0.0, 0.0, 0.0);
      $$1.a(this.i, $$5 + 0.27 * (double)$$10.j(), $$6 + 0.22, $$7 + 0.27 * (double)$$10.l(), 0.0, 0.0, 0.0);
   }

   @Override
   public dfa a(dfa $$0, cyy $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public dfa a(dfa $$0, cxh $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dfb.a<csm, dfa> $$0) {
      $$0.a(a);
   }
}
