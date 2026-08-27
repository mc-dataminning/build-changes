import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class cyn extends cxy {
   public static final dcv a = ctg.aC;
   protected static final float b = 2.5F;
   private static final Map<ha, efb> c = Maps.newEnumMap(
      ImmutableMap.of(
         ha.c,
         cpn.a(5.5, 3.0, 11.0, 10.5, 13.0, 16.0),
         ha.d,
         cpn.a(5.5, 3.0, 0.0, 10.5, 13.0, 5.0),
         ha.e,
         cpn.a(11.0, 3.0, 5.5, 16.0, 13.0, 10.5),
         ha.f,
         cpn.a(0.0, 3.0, 5.5, 5.0, 13.0, 10.5)
      )
   );

   protected cyn(dca.d $$0, it $$1) {
      super($$0, $$1);
      this.k(this.C.b().a(a, ha.c));
   }

   @Override
   public String f() {
      return this.k().a();
   }

   @Override
   public efb a(dcb $$0, cls $$1, gu $$2, een $$3) {
      return h($$0);
   }

   public static efb h(dcb $$0) {
      return c.get($$0.c(a));
   }

   @Override
   public boolean a(dcb $$0, cmp $$1, gu $$2) {
      ha $$3 = $$0.c(a);
      gu $$4 = $$2.a($$3.g());
      dcb $$5 = $$1.a_($$4);
      return $$5.d($$1, $$4, $$3);
   }

   @Nullable
   @Override
   public dcb a(cih $$0) {
      dcb $$1 = this.n();
      cmp $$2 = $$0.q();
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
   public dcb a(dcb $$0, ha $$1, dcb $$2, cmn $$3, gu $$4, gu $$5) {
      return $$1.g() == $$0.c(a) && !$$0.a($$3, $$4) ? cpo.a.n() : $$0;
   }

   @Override
   public void a(dcb $$0, cmm $$1, gu $$2, apf $$3) {
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
   public dcb a(dcb $$0, cvz $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public dcb a(dcb $$0, cui $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dcc.a<cpn, dcb> $$0) {
      $$0.a(a);
   }
}
