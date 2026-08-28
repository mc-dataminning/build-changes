import com.google.common.collect.Maps;
import java.util.Map;

public class cyx extends czu implements dba {
   private static final Map<cyw, cyx> a = Maps.newEnumMap(cyw.class);
   private final cyw b;

   public cyx(cyw $$0, czu.a $$1) {
      super($$1);
      this.b = $$0;
      a.put($$0, this);
   }

   @Override
   public bur a(czy $$0, crx $$1, bxu $$2, buq $$3) {
      if ($$2 instanceof cmg $$4 && $$4.bJ() && !$$4.x() && $$4.t() != this.b) {
         $$4.dV().a($$1, $$4, awp.ik, awq.h, 1.0F, 1.0F);
         if (!$$1.dV().C) {
            $$4.b(this.b);
            $$0.h(1);
         }

         return bur.a;
      }

      return bur.e;
   }

   public cyw a() {
      return this.b;
   }

   public static cyx a(cyw $$0) {
      return a.get($$0);
   }

   @Override
   public boolean a(djx $$0, dzq $$1, boolean $$2, crx $$3) {
      if ($$1.a($$0x -> $$0x.a(this.a()), $$2)) {
         $$0.a(null, $$1.aB_(), awp.ik, awq.e, 1.0F, 1.0F);
         return true;
      } else {
         return false;
      }
   }
}
