import com.google.common.collect.Maps;
import java.util.Map;

public class clw extends cnb implements cof {
   private static final Map<clv, clw> a = Maps.newEnumMap(clv.class);
   private final clv b;

   public clw(clv $$0, cnb.a $$1) {
      super($$1);
      this.b = $$0;
      a.put($$0, this);
   }

   @Override
   public bkc a(cng $$0, cfq $$1, bmo $$2, bkb $$3) {
      if ($$2 instanceof byy $$4 && $$4.bx() && !$$4.A() && $$4.w() != this.b) {
         $$4.dL().a($$1, $$4, art.hx, aru.h, 1.0F, 1.0F);
         if (!$$1.dL().B) {
            $$4.b(this.b);
            $$0.h(1);
         }

         return bkc.a($$1.dL().B);
      }

      return bkc.d;
   }

   public clv d() {
      return this.b;
   }

   public static clw a(clv $$0) {
      return a.get($$0);
   }

   @Override
   public boolean a(ctx $$0, dim $$1, boolean $$2, cfq $$3) {
      if ($$1.a($$0x -> $$0x.a(this.d()), $$2)) {
         $$0.a(null, $$1.aE_(), art.hx, aru.e, 1.0F, 1.0F);
         return true;
      } else {
         return false;
      }
   }
}
