import com.google.common.collect.Maps;
import java.util.Map;

public class clm extends cms implements cnw {
   private static final Map<cll, clm> a = Maps.newEnumMap(cll.class);
   private final cll b;

   public clm(cll $$0, cms.a $$1) {
      super($$1);
      this.b = $$0;
      a.put($$0, this);
   }

   @Override
   public bka a(cmx $$0, cfh $$1, bmk $$2, bjz $$3) {
      if ($$2 instanceof byt $$4 && $$4.bx() && !$$4.A() && $$4.w() != this.b) {
         $$4.dM().a($$1, $$4, arr.hi, ars.h, 1.0F, 1.0F);
         if (!$$1.dM().B) {
            $$4.b(this.b);
            $$0.h(1);
         }

         return bka.a($$1.dM().B);
      }

      return bka.d;
   }

   public cll d() {
      return this.b;
   }

   public static clm a(cll $$0) {
      return a.get($$0);
   }

   @Override
   public boolean a(cto $$0, did $$1, boolean $$2, cfh $$3) {
      if ($$1.a($$0x -> $$0x.a(this.d()), $$2)) {
         $$0.a(null, $$1.aB_(), arr.hi, ars.e, 1.0F, 1.0F);
         return true;
      } else {
         return false;
      }
   }
}
