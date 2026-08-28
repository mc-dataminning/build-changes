import com.google.common.collect.Maps;
import java.util.Map;

public class ctj extends cuk implements cvr {
   private static final Map<cti, ctj> a = Maps.newEnumMap(cti.class);
   private final cti b;

   public ctj(cti $$0, cuk.a $$1) {
      super($$1);
      this.b = $$0;
      a.put($$0, this);
   }

   @Override
   public bqu a(cup $$0, cmx $$1, btp $$2, bqt $$3) {
      if ($$2 instanceof cgb $$4 && $$4.bD() && !$$4.y() && $$4.u() != this.b) {
         $$4.dP().a($$1, $$4, awa.hM, awb.h, 1.0F, 1.0F);
         if (!$$1.dP().B) {
            $$4.b(this.b);
            $$0.h(1);
         }

         return bqu.a($$1.dP().B);
      }

      return bqu.e;
   }

   public cti c() {
      return this.b;
   }

   public static ctj a(cti $$0) {
      return a.get($$0);
   }

   @Override
   public boolean a(dby $$0, dqr $$1, boolean $$2, cmx $$3) {
      if ($$1.a($$0x -> $$0x.a(this.c()), $$2)) {
         $$0.a(null, $$1.ay_(), awa.hM, awb.e, 1.0F, 1.0F);
         return true;
      } else {
         return false;
      }
   }
}
