import com.google.common.collect.Maps;
import java.util.Map;

public class cns extends coy implements cqc {
   private static final Map<cnr, cns> a = Maps.newEnumMap(cnr.class);
   private final cnr b;

   public cns(cnr $$0, coy.a $$1) {
      super($$1);
      this.b = $$0;
      a.put($$0, this);
   }

   @Override
   public blw a(cpd $$0, chl $$1, boi $$2, blv $$3) {
      if ($$2 instanceof cat $$4 && $$4.bx() && !$$4.A() && $$4.w() != this.b) {
         $$4.dM().a($$1, $$4, atl.hy, atm.h, 1.0F, 1.0F);
         if (!$$1.dM().B) {
            $$4.b(this.b);
            $$0.h(1);
         }

         return blw.a($$1.dM().B);
      }

      return blw.d;
   }

   public cnr d() {
      return this.b;
   }

   public static cns a(cnr $$0) {
      return a.get($$0);
   }

   @Override
   public boolean a(cvr $$0, dkg $$1, boolean $$2, chl $$3) {
      if ($$1.a($$0x -> $$0x.a(this.d()), $$2)) {
         $$0.a(null, $$1.aE_(), atl.hy, atm.e, 1.0F, 1.0F);
         return true;
      } else {
         return false;
      }
   }
}
