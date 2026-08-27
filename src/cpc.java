import com.google.common.collect.Maps;
import java.util.Map;

public class cpc extends cqf implements crj {
   private static final Map<cpb, cpc> a = Maps.newEnumMap(cpb.class);
   private final cpb b;

   public cpc(cpb $$0, cqf.a $$1) {
      super($$1);
      this.b = $$0;
      a.put($$0, this);
   }

   @Override
   public bnc a(cqk $$0, cis $$1, bpo $$2, bnb $$3) {
      if ($$2 instanceof cbz $$4 && $$4.bA() && !$$4.y() && $$4.s() != this.b) {
         $$4.dM().a($$1, $$4, aty.hB, atz.h, 1.0F, 1.0F);
         if (!$$1.dM().B) {
            $$4.b(this.b);
            $$0.h(1);
         }

         return bnc.a($$1.dM().B);
      }

      return bnc.d;
   }

   public cpb c() {
      return this.b;
   }

   public static cpc a(cpb $$0) {
      return a.get($$0);
   }

   @Override
   public boolean a(cwz $$0, dlp $$1, boolean $$2, cis $$3) {
      if ($$1.a($$0x -> $$0x.a(this.c()), $$2)) {
         $$0.a(null, $$1.aC_(), aty.hB, atz.e, 1.0F, 1.0F);
         return true;
      } else {
         return false;
      }
   }
}
