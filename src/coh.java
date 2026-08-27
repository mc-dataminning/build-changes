import com.google.common.collect.Maps;
import java.util.Map;

public class coh extends cpl implements cqp {
   private static final Map<cog, coh> a = Maps.newEnumMap(cog.class);
   private final cog b;

   public coh(cog $$0, cpl.a $$1) {
      super($$1);
      this.b = $$0;
      a.put($$0, this);
   }

   @Override
   public bml a(cpq $$0, cia $$1, box $$2, bmk $$3) {
      if ($$2 instanceof cbi $$4 && $$4.bx() && !$$4.A() && $$4.w() != this.b) {
         $$4.dJ().a($$1, $$4, atp.hy, atq.h, 1.0F, 1.0F);
         if (!$$1.dJ().B) {
            $$4.b(this.b);
            $$0.h(1);
         }

         return bml.a($$1.dJ().B);
      }

      return bml.d;
   }

   public cog c() {
      return this.b;
   }

   public static coh a(cog $$0) {
      return a.get($$0);
   }

   @Override
   public boolean a(cwe $$0, dku $$1, boolean $$2, cia $$3) {
      if ($$1.a($$0x -> $$0x.a(this.c()), $$2)) {
         $$0.a(null, $$1.aD_(), atp.hy, atq.e, 1.0F, 1.0F);
         return true;
      } else {
         return false;
      }
   }
}
