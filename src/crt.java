import com.google.common.collect.Maps;
import java.util.Map;

public class crt extends csu implements ctz {
   private static final Map<crs, crt> a = Maps.newEnumMap(crs.class);
   private final crs b;

   public crt(crs $$0, csu.a $$1) {
      super($$1);
      this.b = $$0;
      a.put($$0, this);
   }

   @Override
   public bpm a(csz $$0, clh $$1, bsa $$2, bpl $$3) {
      if ($$2 instanceof cel $$4 && $$4.bB() && !$$4.y() && $$4.u() != this.b) {
         $$4.dN().a($$1, $$4, avc.hH, avd.h, 1.0F, 1.0F);
         if (!$$1.dN().B) {
            $$4.b(this.b);
            $$0.h(1);
         }

         return bpm.a($$1.dN().B);
      }

      return bpm.d;
   }

   public crs c() {
      return this.b;
   }

   public static crt a(crs $$0) {
      return a.get($$0);
   }

   @Override
   public boolean a(dad $$0, dow $$1, boolean $$2, clh $$3) {
      if ($$1.a($$0x -> $$0x.a(this.c()), $$2)) {
         $$0.a(null, $$1.az_(), avc.hH, avd.e, 1.0F, 1.0F);
         return true;
      } else {
         return false;
      }
   }
}
