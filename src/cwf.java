import com.google.common.collect.Maps;
import java.util.Map;

public class cwf extends cxd implements cyk {
   private static final Map<cwe, cwf> a = Maps.newEnumMap(cwe.class);
   private final cwe b;

   public cwf(cwe $$0, cxd.a $$1) {
      super($$1);
      this.b = $$0;
      a.put($$0, this);
   }

   @Override
   public bsy a(cxh $$0, cpr $$1, bvy $$2, bsx $$3) {
      if ($$2 instanceof cin $$4 && $$4.bJ() && !$$4.x() && $$4.t() != this.b) {
         $$4.dU().a($$1, $$4, awa.ih, awb.h, 1.0F, 1.0F);
         if (!$$1.dU().C) {
            $$4.b(this.b);
            $$0.h(1);
         }

         return bsy.a;
      }

      return bsy.e;
   }

   public cwe b() {
      return this.b;
   }

   public static cwf a(cwe $$0) {
      return a.get($$0);
   }

   @Override
   public boolean a(dgz $$0, dwf $$1, boolean $$2, cpr $$3) {
      if ($$1.a($$0x -> $$0x.a(this.b()), $$2)) {
         $$0.a(null, $$1.aA_(), awa.ih, awb.e, 1.0F, 1.0F);
         return true;
      } else {
         return false;
      }
   }
}
