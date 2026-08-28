import com.google.common.collect.Maps;
import java.util.Map;

public class csx extends cty implements cvf {
   private static final Map<csw, csx> a = Maps.newEnumMap(csw.class);
   private final csw b;

   public csx(csw $$0, cty.a $$1) {
      super($$1);
      this.b = $$0;
      a.put($$0, this);
   }

   @Override
   public bqh a(cud $$0, cml $$1, btc $$2, bqg $$3) {
      if ($$2 instanceof cfo $$4 && $$4.bF() && !$$4.x() && $$4.t() != this.b) {
         $$4.dR().a($$1, $$4, avh.hM, avi.h, 1.0F, 1.0F);
         if (!$$1.dR().B) {
            $$4.b(this.b);
            $$0.h(1);
         }

         return bqh.a($$1.dR().B);
      }

      return bqh.e;
   }

   public csw c() {
      return this.b;
   }

   public static csx a(csw $$0) {
      return a.get($$0);
   }

   @Override
   public boolean a(dcg $$0, drb $$1, boolean $$2, cml $$3) {
      if ($$1.a($$0x -> $$0x.a(this.c()), $$2)) {
         $$0.a(null, $$1.az_(), avh.hM, avi.e, 1.0F, 1.0F);
         return true;
      } else {
         return false;
      }
   }
}
