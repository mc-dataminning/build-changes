import com.google.common.collect.Maps;
import java.util.Map;

public class cwn extends cxl implements cyt {
   private static final Map<cwm, cwn> a = Maps.newEnumMap(cwm.class);
   private final cwm b;

   public cwn(cwm $$0, cxl.a $$1) {
      super($$1);
      this.b = $$0;
      a.put($$0, this);
   }

   @Override
   public btj a(cxp $$0, cpx $$1, bwg $$2, bti $$3) {
      if ($$2 instanceof cit $$4 && $$4.bL() && !$$4.x() && $$4.t() != this.b) {
         $$4.dW().a($$1, $$4, axf.ig, axg.h, 1.0F, 1.0F);
         if (!$$1.dW().C) {
            $$4.b(this.b);
            $$0.h(1);
         }

         return btj.a;
      }

      return btj.e;
   }

   public cwm b() {
      return this.b;
   }

   public static cwn a(cwm $$0) {
      return a.get($$0);
   }

   @Override
   public boolean a(dhi $$0, dwk $$1, boolean $$2, cpx $$3) {
      if ($$1.a($$0x -> $$0x.a(this.b()), $$2)) {
         $$0.a(null, $$1.aB_(), axf.ig, axg.e, 1.0F, 1.0F);
         return true;
      } else {
         return false;
      }
   }
}
