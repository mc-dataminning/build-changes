import com.google.common.collect.Maps;
import java.util.Map;

public class cjq extends ckw implements cma {
   private static final Map<cjp, cjq> a = Maps.newEnumMap(cjp.class);
   private final cjp b;

   public cjq(cjp $$0, ckw.a $$1) {
      super($$1);
      this.b = $$0;
      a.put($$0, this);
   }

   @Override
   public biq a(clb $$0, cdm $$1, bky $$2, bip $$3) {
      if ($$2 instanceof bxf $$4 && $$4.bv() && !$$4.y() && $$4.t() != this.b) {
         $$4.dL().a($$1, $$4, aqn.gJ, aqo.h, 1.0F, 1.0F);
         if (!$$1.dL().B) {
            $$4.b(this.b);
            $$0.h(1);
         }

         return biq.a($$1.dL().B);
      }

      return biq.d;
   }

   public cjp d() {
      return this.b;
   }

   public static cjq a(cjp $$0) {
      return a.get($$0);
   }

   @Override
   public boolean a(crs $$0, dga $$1, boolean $$2, cdm $$3) {
      if ($$1.a($$0x -> $$0x.a(this.d()), $$2)) {
         $$0.a(null, $$1.p(), aqn.gJ, aqo.e, 1.0F, 1.0F);
         return true;
      } else {
         return false;
      }
   }
}
