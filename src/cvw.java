import com.google.common.collect.Maps;
import java.util.Map;

public class cvw extends csx {
   private static final Map<csx, csx> c = Maps.newHashMap();
   public static final float a = 3.0F;
   protected static final eii b = csx.a(5.0, 0.0, 5.0, 11.0, 6.0, 11.0);
   private final csx d;

   public cvw(csx $$0, dfk.d $$1) {
      super($$1);
      this.d = $$0;
      c.put($$0, this);
   }

   @Override
   public eii a(dfl $$0, cpd $$1, gw $$2, ehu $$3) {
      return b;
   }

   @Override
   public czc b_(dfl $$0) {
      return czc.c;
   }

   @Override
   public bha a(dfl $$0, cpx $$1, gw $$2, cbw $$3, bgz $$4, ehl $$5) {
      cjh $$6 = $$3.b($$4);
      cjc $$7 = $$6.d();
      dfl $$8 = ($$7 instanceof cha ? c.getOrDefault(((cha)$$7).e(), csy.a) : csy.a).n();
      boolean $$9 = $$8.a(csy.a);
      boolean $$10 = this.g();
      if ($$9 != $$10) {
         if ($$10) {
            $$1.a($$2, $$8, 3);
            $$3.a(app.ah);
            if (!$$3.fS().d) {
               $$6.h(1);
            }
         } else {
            cjh $$11 = new cjh(this.d);
            if ($$6.b()) {
               $$3.a($$4, $$11);
            } else if (!$$3.i($$11)) {
               $$3.a($$11, false);
            }

            $$1.a($$2, csy.fR.n(), 3);
         }

         $$1.a($$3, djv.c, $$2);
         return bha.a($$1.B);
      } else {
         return bha.b;
      }
   }

   @Override
   public cjh a(cpd $$0, gw $$1, dfl $$2) {
      return this.g() ? super.a($$0, $$1, $$2) : new cjh(this.d);
   }

   private boolean g() {
      return this.d == csy.a;
   }

   @Override
   public dfl a(dfl $$0, hc $$1, dfl $$2, cpy $$3, gw $$4, gw $$5) {
      return $$1 == hc.a && !$$0.a($$3, $$4) ? csy.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public csx a() {
      return this.d;
   }

   @Override
   public boolean a(dfl $$0, cpd $$1, gw $$2, ebe $$3) {
      return false;
   }
}
