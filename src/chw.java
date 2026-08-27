import com.google.common.collect.Maps;
import java.util.Map;

public class chw extends cjc implements ckg {
   private static final Map<chv, chw> a = Maps.newEnumMap(chv.class);
   private final chv b;

   public chw(chv $$0, cjc.a $$1) {
      super($$1);
      this.b = $$0;
      a.put($$0, this);
   }

   @Override
   public bha a(cjh $$0, cbw $$1, bji $$2, bgz $$3) {
      if ($$2 instanceof bvp $$4 && $$4.bv() && !$$4.y() && $$4.t() != this.b) {
         $$4.dL().a($$1, $$4, apf.gF, apg.h, 1.0F, 1.0F);
         if (!$$1.dL().B) {
            $$4.b(this.b);
            $$0.h(1);
         }

         return bha.a($$1.dL().B);
      }

      return bha.d;
   }

   public chv d() {
      return this.b;
   }

   public static chw a(chv $$0) {
      return a.get($$0);
   }

   @Override
   public boolean a(cpx $$0, def $$1, boolean $$2, cbw $$3) {
      if ($$1.a($$0x -> $$0x.a(this.d()), $$2)) {
         $$0.a(null, $$1.p(), apf.gF, apg.e, 1.0F, 1.0F);
         return true;
      } else {
         return false;
      }
   }
}
