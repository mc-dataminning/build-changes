import com.google.common.collect.Maps;
import java.util.Map;

public class cvu extends csv {
   private static final Map<csv, csv> c = Maps.newHashMap();
   public static final float a = 3.0F;
   protected static final eig b = csv.a(5.0, 0.0, 5.0, 11.0, 6.0, 11.0);
   private final csv d;

   public cvu(csv $$0, dfi.d $$1) {
      super($$1);
      this.d = $$0;
      c.put($$0, this);
   }

   @Override
   public eig a(dfj $$0, cpb $$1, gw $$2, ehs $$3) {
      return b;
   }

   @Override
   public cza b_(dfj $$0) {
      return cza.c;
   }

   @Override
   public bgy a(dfj $$0, cpv $$1, gw $$2, cbu $$3, bgx $$4, ehj $$5) {
      cjf $$6 = $$3.b($$4);
      cja $$7 = $$6.d();
      dfj $$8 = ($$7 instanceof cgy ? c.getOrDefault(((cgy)$$7).e(), csw.a) : csw.a).n();
      boolean $$9 = $$8.a(csw.a);
      boolean $$10 = this.g();
      if ($$9 != $$10) {
         if ($$10) {
            $$1.a($$2, $$8, 3);
            $$3.a(apn.ah);
            if (!$$3.fS().d) {
               $$6.h(1);
            }
         } else {
            cjf $$11 = new cjf(this.d);
            if ($$6.b()) {
               $$3.a($$4, $$11);
            } else if (!$$3.i($$11)) {
               $$3.a($$11, false);
            }

            $$1.a($$2, csw.fR.n(), 3);
         }

         $$1.a($$3, djt.c, $$2);
         return bgy.a($$1.B);
      } else {
         return bgy.b;
      }
   }

   @Override
   public cjf a(cpb $$0, gw $$1, dfj $$2) {
      return this.g() ? super.a($$0, $$1, $$2) : new cjf(this.d);
   }

   private boolean g() {
      return this.d == csw.a;
   }

   @Override
   public dfj a(dfj $$0, ha $$1, dfj $$2, cpw $$3, gw $$4, gw $$5) {
      return $$1 == ha.a && !$$0.a($$3, $$4) ? csw.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public csv a() {
      return this.d;
   }

   @Override
   public boolean a(dfj $$0, cpb $$1, gw $$2, ebc $$3) {
      return false;
   }
}
