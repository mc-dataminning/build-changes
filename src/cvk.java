import com.google.common.collect.Maps;
import java.util.Map;

public class cvk extends csl {
   private static final Map<csl, csl> c = Maps.newHashMap();
   public static final float a = 3.0F;
   protected static final ehw b = csl.a(5.0, 0.0, 5.0, 11.0, 6.0, 11.0);
   private final csl d;

   public cvk(csl $$0, dey.d $$1) {
      super($$1);
      this.d = $$0;
      c.put($$0, this);
   }

   @Override
   public ehw a(dez $$0, cor $$1, gu $$2, ehi $$3) {
      return b;
   }

   @Override
   public cyq b_(dez $$0) {
      return cyq.c;
   }

   @Override
   public bgq a(dez $$0, cpl $$1, gu $$2, cbm $$3, bgp $$4, egz $$5) {
      cix $$6 = $$3.b($$4);
      cis $$7 = $$6.d();
      dez $$8 = ($$7 instanceof cgq ? c.getOrDefault(((cgq)$$7).e(), csm.a) : csm.a).n();
      boolean $$9 = $$8.a(csm.a);
      boolean $$10 = this.g();
      if ($$9 != $$10) {
         if ($$10) {
            $$1.a($$2, $$8, 3);
            $$3.a(apg.ah);
            if (!$$3.fR().d) {
               $$6.h(1);
            }
         } else {
            cix $$11 = new cix(this.d);
            if ($$6.b()) {
               $$3.a($$4, $$11);
            } else if (!$$3.i($$11)) {
               $$3.a($$11, false);
            }

            $$1.a($$2, csm.fR.n(), 3);
         }

         $$1.a($$3, djj.c, $$2);
         return bgq.a($$1.B);
      } else {
         return bgq.b;
      }
   }

   @Override
   public cix a(cor $$0, gu $$1, dez $$2) {
      return this.g() ? super.a($$0, $$1, $$2) : new cix(this.d);
   }

   private boolean g() {
      return this.d == csm.a;
   }

   @Override
   public dez a(dez $$0, ha $$1, dez $$2, cpm $$3, gu $$4, gu $$5) {
      return $$1 == ha.a && !$$0.a($$3, $$4) ? csm.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public csl a() {
      return this.d;
   }

   @Override
   public boolean a(dez $$0, cor $$1, gu $$2, eas $$3) {
      return false;
   }
}
