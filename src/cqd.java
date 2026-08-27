import com.google.common.collect.Maps;
import java.util.Map;

public class cqd extends cre implements csi {
   private static final Map<cqc, cqd> a = Maps.newEnumMap(cqc.class);
   private final cqc b;

   public cqd(cqc $$0, cre.a $$1) {
      super($$1);
      this.b = $$0;
      a.put($$0, this);
   }

   @Override
   public boa a(crj $$0, cjt $$1, bqo $$2, bnz $$3) {
      if ($$2 instanceof ccz $$4 && $$4.bA() && !$$4.y() && $$4.u() != this.b) {
         $$4.dM().a($$1, $$4, aum.hH, aun.h, 1.0F, 1.0F);
         if (!$$1.dM().B) {
            $$4.b(this.b);
            $$0.g(1);
         }

         return boa.a($$1.dM().B);
      }

      return boa.d;
   }

   public cqc c() {
      return this.b;
   }

   public static cqd a(cqc $$0) {
      return a.get($$0);
   }

   @Override
   public boolean a(cyx $$0, dnp $$1, boolean $$2, cjt $$3) {
      if ($$1.a($$0x -> $$0x.a(this.c()), $$2)) {
         $$0.a(null, $$1.aA_(), aum.hH, aun.e, 1.0F, 1.0F);
         return true;
      } else {
         return false;
      }
   }
}
