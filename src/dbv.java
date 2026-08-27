import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class dbv extends dbg {
   public static final dgd a = cwo.aC;
   protected static final float b = 2.5F;
   private static final Map<ha, eig> c = Maps.newEnumMap(
      ImmutableMap.of(
         ha.c,
         csv.a(5.5, 3.0, 11.0, 10.5, 13.0, 16.0),
         ha.d,
         csv.a(5.5, 3.0, 0.0, 10.5, 13.0, 5.0),
         ha.e,
         csv.a(11.0, 3.0, 5.5, 16.0, 13.0, 10.5),
         ha.f,
         csv.a(0.0, 3.0, 5.5, 5.0, 13.0, 10.5)
      )
   );

   protected dbv(dfi.d $$0, it $$1) {
      super($$0, $$1);
      this.k(this.C.b().a(a, ha.c));
   }

   @Override
   public String f() {
      return this.k().a();
   }

   @Override
   public eig a(dfj $$0, cpb $$1, gw $$2, ehs $$3) {
      return h($$0);
   }

   public static eig h(dfj $$0) {
      return c.get($$0.c(a));
   }

   @Override
   public boolean a(dfj $$0, cpy $$1, gw $$2) {
      ha $$3 = $$0.c(a);
      gw $$4 = $$2.a($$3.g());
      dfj $$5 = $$1.a_($$4);
      return $$5.d($$1, $$4, $$3);
   }

   @Nullable
   @Override
   public dfj a(cln $$0) {
      dfj $$1 = this.n();
      cpy $$2 = $$0.q();
      gw $$3 = $$0.a();
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
   public dfj a(dfj $$0, ha $$1, dfj $$2, cpw $$3, gw $$4, gw $$5) {
      return $$1.g() == $$0.c(a) && !$$0.a($$3, $$4) ? csw.a.n() : $$0;
   }

   @Override
   public void a(dfj $$0, cpv $$1, gw $$2, asc $$3) {
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
   public dfj a(dfj $$0, czh $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public dfj a(dfj $$0, cxq $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dfk.a<csv, dfj> $$0) {
      $$0.a(a);
   }
}
