import com.google.common.collect.Maps;
import java.util.Map;

public class csm extends cpn {
   private static final Map<cpn, cpn> c = Maps.newHashMap();
   public static final float a = 3.0F;
   protected static final efb b = cpn.a(5.0, 0.0, 5.0, 11.0, 6.0, 11.0);
   private final cpn d;

   public csm(cpn $$0, dca.d $$1) {
      super($$1);
      this.d = $$0;
      c.put($$0, this);
   }

   @Override
   public efb a(dcb $$0, cls $$1, gu $$2, een $$3) {
      return b;
   }

   @Override
   public cvs b_(dcb $$0) {
      return cvs.c;
   }

   @Override
   public bdx a(dcb $$0, cmm $$1, gu $$2, byo $$3, bdw $$4, eee $$5) {
      cfz $$6 = $$3.b($$4);
      cfu $$7 = $$6.d();
      dcb $$8 = ($$7 instanceof cds ? c.getOrDefault(((cds)$$7).e(), cpo.a) : cpo.a).n();
      boolean $$9 = $$8.a(cpo.a);
      boolean $$10 = this.g();
      if ($$9 != $$10) {
         if ($$10) {
            $$1.a($$2, $$8, 3);
            $$3.a(amr.ah);
            if (!$$3.fO().d) {
               $$6.h(1);
            }
         } else {
            cfz $$11 = new cfz(this.d);
            if ($$6.b()) {
               $$3.a($$4, $$11);
            } else if (!$$3.i($$11)) {
               $$3.a($$11, false);
            }

            $$1.a($$2, cpo.fR.n(), 3);
         }

         $$1.a($$3, dgl.c, $$2);
         return bdx.a($$1.B);
      } else {
         return bdx.b;
      }
   }

   @Override
   public cfz a(cls $$0, gu $$1, dcb $$2) {
      return this.g() ? super.a($$0, $$1, $$2) : new cfz(this.d);
   }

   private boolean g() {
      return this.d == cpo.a;
   }

   @Override
   public dcb a(dcb $$0, ha $$1, dcb $$2, cmn $$3, gu $$4, gu $$5) {
      return $$1 == ha.a && !$$0.a($$3, $$4) ? cpo.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public cpn a() {
      return this.d;
   }

   @Override
   public boolean a(dcb $$0, cls $$1, gu $$2, dxu $$3) {
      return false;
   }
}
