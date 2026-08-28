import com.google.common.collect.Maps;
import java.util.Map;

public class cvd extends cwb implements cxj {
   private static final Map<cvc, cvd> a = Maps.newEnumMap(cvc.class);
   private final cvc b;

   public cvd(cvc $$0, cwb.a $$1) {
      super($$1);
      this.b = $$0;
      a.put($$0, this);
   }

   @Override
   public bsh a(cwf $$0, cor $$1, bve $$2, bsg $$3) {
      if ($$2 instanceof chr $$4 && $$4.bN() && !$$4.y() && $$4.t() != this.b) {
         $$4.dY().a($$1, $$4, awo.hN, awp.h, 1.0F, 1.0F);
         if (!$$1.dY().C) {
            $$4.b(this.b);
            $$0.h(1);
         }

         return bsh.a;
      }

      return bsh.e;
   }

   public cvc b() {
      return this.b;
   }

   public static cvd a(cvc $$0) {
      return a.get($$0);
   }

   @Override
   public boolean a(dff $$0, dud $$1, boolean $$2, cor $$3) {
      if ($$1.a($$0x -> $$0x.a(this.b()), $$2)) {
         $$0.a(null, $$1.aB_(), awo.hN, awp.e, 1.0F, 1.0F);
         return true;
      } else {
         return false;
      }
   }
}
