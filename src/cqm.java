import com.google.common.collect.Maps;
import java.util.Map;

public class cqm extends crn implements csr {
   private static final Map<cql, cqm> a = Maps.newEnumMap(cql.class);
   private final cql b;

   public cqm(cql $$0, crn.a $$1) {
      super($$1);
      this.b = $$0;
      a.put($$0, this);
   }

   @Override
   public bof a(crs $$0, cka $$1, bqt $$2, boe $$3) {
      if ($$2 instanceof cde $$4 && $$4.bA() && !$$4.y() && $$4.u() != this.b) {
         $$4.dM().a($$1, $$4, auo.hH, aup.h, 1.0F, 1.0F);
         if (!$$1.dM().B) {
            $$4.b(this.b);
            $$0.g(1);
         }

         return bof.a($$1.dM().B);
      }

      return bof.d;
   }

   public cql c() {
      return this.b;
   }

   public static cqm a(cql $$0) {
      return a.get($$0);
   }

   @Override
   public boolean a(czg $$0, dny $$1, boolean $$2, cka $$3) {
      if ($$1.a($$0x -> $$0x.a(this.c()), $$2)) {
         $$0.a(null, $$1.az_(), auo.hH, aup.e, 1.0F, 1.0F);
         return true;
      } else {
         return false;
      }
   }
}
