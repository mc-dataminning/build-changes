import com.google.common.collect.Maps;
import java.util.Map;

public class cyj extends czg implements dam {
   private static final Map<cyi, cyj> a = Maps.newEnumMap(cyi.class);
   private final cyi b;

   public cyj(cyi $$0, czg.a $$1) {
      super($$1);
      this.b = $$0;
      a.put($$0, this);
   }

   @Override
   public bug a(czk $$0, crj $$1, bxj $$2, buf $$3) {
      if ($$2 instanceof cly $$4 && $$4.bI() && !$$4.x() && $$4.t() != this.b) {
         $$4.dU().a($$1, $$4, awn.ik, awo.h, 1.0F, 1.0F);
         if (!$$1.dU().C) {
            $$4.b(this.b);
            $$0.h(1);
         }

         return bug.a;
      }

      return bug.e;
   }

   public cyi a() {
      return this.b;
   }

   public static cyj a(cyi $$0) {
      return a.get($$0);
   }

   @Override
   public boolean a(djh $$0, dza $$1, boolean $$2, crj $$3) {
      if ($$1.a($$0x -> $$0x.a(this.a()), $$2)) {
         $$0.a(null, $$1.ax_(), awn.ik, awo.e, 1.0F, 1.0F);
         return true;
      } else {
         return false;
      }
   }
}
