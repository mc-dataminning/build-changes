import com.google.common.collect.Maps;
import java.util.Map;

public class cvm extends cwk implements cxs {
   private static final Map<cvl, cvm> a = Maps.newEnumMap(cvl.class);
   private final cvl b;

   public cvm(cvl $$0, cwk.a $$1) {
      super($$1);
      this.b = $$0;
      a.put($$0, this);
   }

   @Override
   public bsj a(cwo $$0, cow $$1, bvg $$2, bsi $$3) {
      if ($$2 instanceof cht $$4 && $$4.bL() && !$$4.x() && $$4.t() != this.b) {
         $$4.dV().a($$1, $$4, awa.ih, awb.h, 1.0F, 1.0F);
         if (!$$1.dV().C) {
            $$4.b(this.b);
            $$0.h(1);
         }

         return bsj.a;
      }

      return bsj.e;
   }

   public cvl b() {
      return this.b;
   }

   public static cvm a(cvl $$0) {
      return a.get($$0);
   }

   @Override
   public boolean a(dgh $$0, dvl $$1, boolean $$2, cow $$3) {
      if ($$1.a($$0x -> $$0x.a(this.b()), $$2)) {
         $$0.a(null, $$1.aA_(), awa.ih, awb.e, 1.0F, 1.0F);
         return true;
      } else {
         return false;
      }
   }
}
