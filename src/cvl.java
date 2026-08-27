import com.google.common.collect.Maps;
import java.util.Map;

public class cvl extends csm {
   private static final Map<csm, csm> c = Maps.newHashMap();
   public static final float a = 3.0F;
   protected static final ehx b = csm.a(5.0, 0.0, 5.0, 11.0, 6.0, 11.0);
   private final csm d;

   public cvl(csm $$0, dez.d $$1) {
      super($$1);
      this.d = $$0;
      c.put($$0, this);
   }

   @Override
   public ehx a(dfa $$0, cos $$1, gu $$2, ehj $$3) {
      return b;
   }

   @Override
   public cyr b_(dfa $$0) {
      return cyr.c;
   }

   @Override
   public bgq a(dfa $$0, cpm $$1, gu $$2, cbn $$3, bgp $$4, eha $$5) {
      ciy $$6 = $$3.b($$4);
      cit $$7 = $$6.d();
      dfa $$8 = ($$7 instanceof cgr ? c.getOrDefault(((cgr)$$7).e(), csn.a) : csn.a).n();
      boolean $$9 = $$8.a(csn.a);
      boolean $$10 = this.g();
      if ($$9 != $$10) {
         if ($$10) {
            $$1.a($$2, $$8, 3);
            $$3.a(apg.ah);
            if (!$$3.fR().d) {
               $$6.h(1);
            }
         } else {
            ciy $$11 = new ciy(this.d);
            if ($$6.b()) {
               $$3.a($$4, $$11);
            } else if (!$$3.i($$11)) {
               $$3.a($$11, false);
            }

            $$1.a($$2, csn.fR.n(), 3);
         }

         $$1.a($$3, djk.c, $$2);
         return bgq.a($$1.B);
      } else {
         return bgq.b;
      }
   }

   @Override
   public ciy a(cos $$0, gu $$1, dfa $$2) {
      return this.g() ? super.a($$0, $$1, $$2) : new ciy(this.d);
   }

   private boolean g() {
      return this.d == csn.a;
   }

   @Override
   public dfa a(dfa $$0, ha $$1, dfa $$2, cpn $$3, gu $$4, gu $$5) {
      return $$1 == ha.a && !$$0.a($$3, $$4) ? csn.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public csm a() {
      return this.d;
   }

   @Override
   public boolean a(dfa $$0, cos $$1, gu $$2, eat $$3) {
      return false;
   }
}
