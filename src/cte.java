import com.google.common.collect.Maps;
import java.util.Map;

public class cte extends cuf implements cvm {
   private static final Map<ctd, cte> a = Maps.newEnumMap(ctd.class);
   private final ctd b;

   public cte(ctd $$0, cuf.a $$1) {
      super($$1);
      this.b = $$0;
      a.put($$0, this);
   }

   @Override
   public bqp a(cuk $$0, cms $$1, btk $$2, bqo $$3) {
      if ($$2 instanceof cfw $$4 && $$4.bD() && !$$4.y() && $$4.u() != this.b) {
         $$4.dP().a($$1, $$4, avw.hM, avx.h, 1.0F, 1.0F);
         if (!$$1.dP().B) {
            $$4.b(this.b);
            $$0.h(1);
         }

         return bqp.a($$1.dP().B);
      }

      return bqp.e;
   }

   public ctd c() {
      return this.b;
   }

   public static cte a(ctd $$0) {
      return a.get($$0);
   }

   @Override
   public boolean a(dbt $$0, dqm $$1, boolean $$2, cms $$3) {
      if ($$1.a($$0x -> $$0x.a(this.c()), $$2)) {
         $$0.a(null, $$1.aA_(), avw.hM, avx.e, 1.0F, 1.0F);
         return true;
      } else {
         return false;
      }
   }
}
