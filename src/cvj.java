import com.google.common.collect.Maps;
import java.util.Map;

public class cvj extends csk {
   private static final Map<csk, csk> c = Maps.newHashMap();
   public static final float a = 3.0F;
   protected static final ehy b = csk.a(5.0, 0.0, 5.0, 11.0, 6.0, 11.0);
   private final csk d;

   public cvj(csk $$0, dex.d $$1) {
      super($$1);
      this.d = $$0;
      c.put($$0, this);
   }

   @Override
   public ehy a(dey $$0, coq $$1, gv $$2, ehk $$3) {
      return b;
   }

   @Override
   public cyp b_(dey $$0) {
      return cyp.c;
   }

   @Override
   public bgo a(dey $$0, cpk $$1, gv $$2, cbl $$3, bgn $$4, ehb $$5) {
      ciw $$6 = $$3.b($$4);
      cir $$7 = $$6.d();
      dey $$8 = ($$7 instanceof cgp ? c.getOrDefault(((cgp)$$7).e(), csl.a) : csl.a).n();
      boolean $$9 = $$8.a(csl.a);
      boolean $$10 = this.g();
      if ($$9 != $$10) {
         if ($$10) {
            $$1.a($$2, $$8, 3);
            $$3.a(ape.ah);
            if (!$$3.fR().d) {
               $$6.h(1);
            }
         } else {
            ciw $$11 = new ciw(this.d);
            if ($$6.b()) {
               $$3.a($$4, $$11);
            } else if (!$$3.i($$11)) {
               $$3.a($$11, false);
            }

            $$1.a($$2, csl.fR.n(), 3);
         }

         $$1.a($$3, dji.c, $$2);
         return bgo.a($$1.B);
      } else {
         return bgo.b;
      }
   }

   @Override
   public ciw a(coq $$0, gv $$1, dey $$2) {
      return this.g() ? super.a($$0, $$1, $$2) : new ciw(this.d);
   }

   private boolean g() {
      return this.d == csl.a;
   }

   @Override
   public dey a(dey $$0, hb $$1, dey $$2, cpl $$3, gv $$4, gv $$5) {
      return $$1 == hb.a && !$$0.a($$3, $$4) ? csl.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public csk a() {
      return this.d;
   }

   @Override
   public boolean a(dey $$0, coq $$1, gv $$2, ear $$3) {
      return false;
   }
}
