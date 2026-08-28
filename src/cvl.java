import com.google.common.collect.Maps;
import java.util.Map;

public class cvl extends cwj implements cxr {
   private static final Map<cvk, cvl> a = Maps.newEnumMap(cvk.class);
   private final cvk b;

   public cvl(cvk $$0, cwj.a $$1) {
      super($$1);
      this.b = $$0;
      a.put($$0, this);
   }

   @Override
   public bsi a(cwn $$0, cov $$1, bvf $$2, bsh $$3) {
      if ($$2 instanceof chs $$4 && $$4.bL() && !$$4.x() && $$4.t() != this.b) {
         $$4.dW().a($$1, $$4, avz.ih, awa.h, 1.0F, 1.0F);
         if (!$$1.dW().C) {
            $$4.b(this.b);
            $$0.h(1);
         }

         return bsi.a;
      }

      return bsi.e;
   }

   public cvk b() {
      return this.b;
   }

   public static cvl a(cvk $$0) {
      return a.get($$0);
   }

   @Override
   public boolean a(dgg $$0, dvk $$1, boolean $$2, cov $$3) {
      if ($$1.a($$0x -> $$0x.a(this.b()), $$2)) {
         $$0.a(null, $$1.aA_(), avz.ih, awa.e, 1.0F, 1.0F);
         return true;
      } else {
         return false;
      }
   }
}
