import com.google.common.collect.Maps;
import java.util.Map;

public class cth extends cui implements cvp {
   private static final Map<ctg, cth> a = Maps.newEnumMap(ctg.class);
   private final ctg b;

   public cth(ctg $$0, cui.a $$1) {
      super($$1);
      this.b = $$0;
      a.put($$0, this);
   }

   @Override
   public bqs a(cun $$0, cmv $$1, btn $$2, bqr $$3) {
      if ($$2 instanceof cfz $$4 && $$4.bD() && !$$4.y() && $$4.u() != this.b) {
         $$4.dP().a($$1, $$4, avz.hM, awa.h, 1.0F, 1.0F);
         if (!$$1.dP().B) {
            $$4.b(this.b);
            $$0.h(1);
         }

         return bqs.a($$1.dP().B);
      }

      return bqs.e;
   }

   public ctg c() {
      return this.b;
   }

   public static cth a(ctg $$0) {
      return a.get($$0);
   }

   @Override
   public boolean a(dbw $$0, dqp $$1, boolean $$2, cmv $$3) {
      if ($$1.a($$0x -> $$0x.a(this.c()), $$2)) {
         $$0.a(null, $$1.az_(), avz.hM, awa.e, 1.0F, 1.0F);
         return true;
      } else {
         return false;
      }
   }
}
