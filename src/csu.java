import com.google.common.collect.Maps;
import java.util.Map;

public class csu extends ctv implements cvc {
   private static final Map<cst, csu> a = Maps.newEnumMap(cst.class);
   private final cst b;

   public csu(cst $$0, ctv.a $$1) {
      super($$1);
      this.b = $$0;
      a.put($$0, this);
   }

   @Override
   public bqd a(cua $$0, cmh $$1, bsy $$2, bqc $$3) {
      if ($$2 instanceof cfk $$4 && $$4.bD() && !$$4.y() && $$4.u() != this.b) {
         $$4.dP().a($$1, $$4, avf.hM, avg.h, 1.0F, 1.0F);
         if (!$$1.dP().B) {
            $$4.b(this.b);
            $$0.h(1);
         }

         return bqd.a($$1.dP().B);
      }

      return bqd.e;
   }

   public cst c() {
      return this.b;
   }

   public static csu a(cst $$0) {
      return a.get($$0);
   }

   @Override
   public boolean a(dcd $$0, dqx $$1, boolean $$2, cmh $$3) {
      if ($$1.a($$0x -> $$0x.a(this.c()), $$2)) {
         $$0.a(null, $$1.az_(), avf.hM, avg.e, 1.0F, 1.0F);
         return true;
      } else {
         return false;
      }
   }
}
