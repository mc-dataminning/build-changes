import com.google.common.collect.Maps;
import java.util.Map;

public class csi extends ctj implements cuq {
   private static final Map<csh, csi> a = Maps.newEnumMap(csh.class);
   private final csh b;

   public csi(csh $$0, ctj.a $$1) {
      super($$1);
      this.b = $$0;
      a.put($$0, this);
   }

   @Override
   public bpu a(cto $$0, clw $$1, bso $$2, bpt $$3) {
      if ($$2 instanceof cfa $$4 && $$4.bD() && !$$4.y() && $$4.u() != this.b) {
         $$4.dP().a($$1, $$4, avh.hM, avi.h, 1.0F, 1.0F);
         if (!$$1.dP().B) {
            $$4.b(this.b);
            $$0.h(1);
         }

         return bpu.a($$1.dP().B);
      }

      return bpu.d;
   }

   public csh c() {
      return this.b;
   }

   public static csi a(csh $$0) {
      return a.get($$0);
   }

   @Override
   public boolean a(dax $$0, dpq $$1, boolean $$2, clw $$3) {
      if ($$1.a($$0x -> $$0x.a(this.c()), $$2)) {
         $$0.a(null, $$1.az_(), avh.hM, avi.e, 1.0F, 1.0F);
         return true;
      } else {
         return false;
      }
   }
}
