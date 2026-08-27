import com.google.common.collect.Maps;
import java.util.Map;

public class chm extends cis implements cjw {
   private static final Map<chl, chm> a = Maps.newEnumMap(chl.class);
   private final chl b;

   public chm(chl $$0, cis.a $$1) {
      super($$1);
      this.b = $$0;
      a.put($$0, this);
   }

   @Override
   public bgq a(cix $$0, cbm $$1, biy $$2, bgp $$3) {
      if ($$2 instanceof bvf $$4 && $$4.bv() && !$$4.t() && $$4.q() != this.b) {
         $$4.dK().a($$1, $$4, aow.gF, aox.h, 1.0F, 1.0F);
         if (!$$1.dK().B) {
            $$4.b(this.b);
            $$0.h(1);
         }

         return bgq.a($$1.dK().B);
      }

      return bgq.d;
   }

   public chl d() {
      return this.b;
   }

   public static chm a(chl $$0) {
      return a.get($$0);
   }

   @Override
   public boolean a(cpl $$0, ddt $$1, boolean $$2, cbm $$3) {
      if ($$1.a($$0x -> $$0x.a(this.d()), $$2)) {
         $$0.a(null, $$1.p(), aow.gF, aox.e, 1.0F, 1.0F);
         return true;
      } else {
         return false;
      }
   }
}
