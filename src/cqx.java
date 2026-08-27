import com.google.common.collect.Maps;
import java.util.Map;

public class cqx extends cry implements ctd {
   private static final Map<cqw, cqx> a = Maps.newEnumMap(cqw.class);
   private final cqw b;

   public cqx(cqw $$0, cry.a $$1) {
      super($$1);
      this.b = $$0;
      a.put($$0, this);
   }

   @Override
   public boq a(csd $$0, ckl $$1, bre $$2, bop $$3) {
      if ($$2 instanceof cdp $$4 && $$4.bB() && !$$4.y() && $$4.u() != this.b) {
         $$4.dN().a($$1, $$4, auz.hH, ava.h, 1.0F, 1.0F);
         if (!$$1.dN().B) {
            $$4.b(this.b);
            $$0.g(1);
         }

         return boq.a($$1.dN().B);
      }

      return boq.d;
   }

   public cqw c() {
      return this.b;
   }

   public static cqx a(cqw $$0) {
      return a.get($$0);
   }

   @Override
   public boolean a(czu $$0, don $$1, boolean $$2, ckl $$3) {
      if ($$1.a($$0x -> $$0x.a(this.c()), $$2)) {
         $$0.a(null, $$1.az_(), auz.hH, ava.e, 1.0F, 1.0F);
         return true;
      } else {
         return false;
      }
   }
}
