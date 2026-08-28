import com.google.common.collect.Maps;
import java.util.Map;

public class cym extends czj implements dap {
   private static final Map<cyl, cym> a = Maps.newEnumMap(cyl.class);
   private final cyl b;

   public cym(cyl $$0, czj.a $$1) {
      super($$1);
      this.b = $$0;
      a.put($$0, this);
   }

   @Override
   public bug a(czn $$0, crm $$1, bxj $$2, buf $$3) {
      if ($$2 instanceof clv $$4 && $$4.bI() && !$$4.x() && $$4.t() != this.b) {
         $$4.dU().a($$1, $$4, awn.ik, awo.h, 1.0F, 1.0F);
         if (!$$1.dU().C) {
            $$4.b(this.b);
            $$0.h(1);
         }

         return bug.a;
      }

      return bug.e;
   }

   public cyl a() {
      return this.b;
   }

   public static cym a(cyl $$0) {
      return a.get($$0);
   }

   @Override
   public boolean a(djm $$0, dzf $$1, boolean $$2, crm $$3) {
      if ($$1.a($$0x -> $$0x.a(this.a()), $$2)) {
         $$0.a(null, $$1.ax_(), awn.ik, awo.e, 1.0F, 1.0F);
         return true;
      } else {
         return false;
      }
   }
}
