import com.google.common.collect.Maps;
import java.util.Map;

public class csw extends ctx implements cve {
   private static final Map<csv, csw> a = Maps.newEnumMap(csv.class);
   private final csv b;

   public csw(csv $$0, ctx.a $$1) {
      super($$1);
      this.b = $$0;
      a.put($$0, this);
   }

   @Override
   public bqg a(cuc $$0, cmk $$1, btb $$2, bqf $$3) {
      if ($$2 instanceof cfn $$4 && $$4.bE() && !$$4.y() && $$4.u() != this.b) {
         $$4.dQ().a($$1, $$4, avh.hM, avi.h, 1.0F, 1.0F);
         if (!$$1.dQ().B) {
            $$4.b(this.b);
            $$0.h(1);
         }

         return bqg.a($$1.dQ().B);
      }

      return bqg.e;
   }

   public csv c() {
      return this.b;
   }

   public static csw a(csv $$0) {
      return a.get($$0);
   }

   @Override
   public boolean a(dcf $$0, dra $$1, boolean $$2, cmk $$3) {
      if ($$1.a($$0x -> $$0x.a(this.c()), $$2)) {
         $$0.a(null, $$1.az_(), avh.hM, avi.e, 1.0F, 1.0F);
         return true;
      } else {
         return false;
      }
   }
}
