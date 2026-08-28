import com.google.common.collect.Maps;
import java.util.Map;

public class cxr extends cyo implements czu {
   private static final Map<cxq, cxr> a = Maps.newEnumMap(cxq.class);
   private final cxq b;

   public cxr(cxq $$0, cyo.a $$1) {
      super($$1);
      this.b = $$0;
      a.put($$0, this);
   }

   @Override
   public bty a(cys $$0, cqs $$1, bwz $$2, btx $$3) {
      if ($$2 instanceof cjm $$4 && $$4.bK() && !$$4.x() && $$4.t() != this.b) {
         $$4.dV().a($$1, $$4, awl.ih, awm.h, 1.0F, 1.0F);
         if (!$$1.dV().C) {
            $$4.b(this.b);
            $$0.h(1);
         }

         return bty.a;
      }

      return bty.e;
   }

   public cxq a() {
      return this.b;
   }

   public static cxr a(cxq $$0) {
      return a.get($$0);
   }

   @Override
   public boolean a(dip $$0, dyb $$1, boolean $$2, cqs $$3) {
      if ($$1.a($$0x -> $$0x.a(this.a()), $$2)) {
         $$0.a(null, $$1.aw_(), awl.ih, awm.e, 1.0F, 1.0F);
         return true;
      } else {
         return false;
      }
   }
}
