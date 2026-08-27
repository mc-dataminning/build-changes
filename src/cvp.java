import com.google.common.collect.Maps;
import java.util.Map;

public class cvp extends csq {
   private static final Map<csq, csq> c = Maps.newHashMap();
   public static final float a = 3.0F;
   protected static final eib b = csq.a(5.0, 0.0, 5.0, 11.0, 6.0, 11.0);
   private final csq d;

   public cvp(csq $$0, dfd.d $$1) {
      super($$1);
      this.d = $$0;
      c.put($$0, this);
   }

   @Override
   public eib a(dfe $$0, cow $$1, gw $$2, ehn $$3) {
      return b;
   }

   @Override
   public cyv b_(dfe $$0) {
      return cyv.c;
   }

   @Override
   public bgt a(dfe $$0, cpq $$1, gw $$2, cbp $$3, bgs $$4, ehe $$5) {
      cja $$6 = $$3.b($$4);
      civ $$7 = $$6.d();
      dfe $$8 = ($$7 instanceof cgt ? c.getOrDefault(((cgt)$$7).e(), csr.a) : csr.a).n();
      boolean $$9 = $$8.a(csr.a);
      boolean $$10 = this.g();
      if ($$9 != $$10) {
         if ($$10) {
            $$1.a($$2, $$8, 3);
            $$3.a(apj.ah);
            if (!$$3.fR().d) {
               $$6.h(1);
            }
         } else {
            cja $$11 = new cja(this.d);
            if ($$6.b()) {
               $$3.a($$4, $$11);
            } else if (!$$3.i($$11)) {
               $$3.a($$11, false);
            }

            $$1.a($$2, csr.fR.n(), 3);
         }

         $$1.a($$3, djo.c, $$2);
         return bgt.a($$1.B);
      } else {
         return bgt.b;
      }
   }

   @Override
   public cja a(cow $$0, gw $$1, dfe $$2) {
      return this.g() ? super.a($$0, $$1, $$2) : new cja(this.d);
   }

   private boolean g() {
      return this.d == csr.a;
   }

   @Override
   public dfe a(dfe $$0, hc $$1, dfe $$2, cpr $$3, gw $$4, gw $$5) {
      return $$1 == hc.a && !$$0.a($$3, $$4) ? csr.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public csq a() {
      return this.d;
   }

   @Override
   public boolean a(dfe $$0, cow $$1, gw $$2, eax $$3) {
      return false;
   }
}
