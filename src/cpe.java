import com.google.common.collect.Maps;
import java.util.Map;

public class cpe extends cqh implements crl {
   private static final Map<cpd, cpe> a = Maps.newEnumMap(cpd.class);
   private final cpd b;

   public cpe(cpd $$0, cqh.a $$1) {
      super($$1);
      this.b = $$0;
      a.put($$0, this);
   }

   @Override
   public bnd a(cqm $$0, ciu $$1, bpp $$2, bnc $$3) {
      if ($$2 instanceof cca $$4 && $$4.bA() && !$$4.y() && $$4.s() != this.b) {
         $$4.dM().a($$1, $$4, aty.hF, atz.h, 1.0F, 1.0F);
         if (!$$1.dM().B) {
            $$4.b(this.b);
            $$0.h(1);
         }

         return bnd.a($$1.dM().B);
      }

      return bnd.d;
   }

   public cpd c() {
      return this.b;
   }

   public static cpe a(cpd $$0) {
      return a.get($$0);
   }

   @Override
   public boolean a(cxb $$0, dlr $$1, boolean $$2, ciu $$3) {
      if ($$1.a($$0x -> $$0x.a(this.c()), $$2)) {
         $$0.a(null, $$1.aC_(), aty.hF, atz.e, 1.0F, 1.0F);
         return true;
      } else {
         return false;
      }
   }
}
