import com.google.common.collect.Maps;
import java.util.Map;

public class cwm extends cxk implements cys {
   private static final Map<cwl, cwm> a = Maps.newEnumMap(cwl.class);
   private final cwl b;

   public cwm(cwl $$0, cxk.a $$1) {
      super($$1);
      this.b = $$0;
      a.put($$0, this);
   }

   @Override
   public bti a(cxo $$0, cpw $$1, bwf $$2, bth $$3) {
      if ($$2 instanceof cis $$4 && $$4.bL() && !$$4.x() && $$4.t() != this.b) {
         $$4.dV().a($$1, $$4, axf.ig, axg.h, 1.0F, 1.0F);
         if (!$$1.dV().C) {
            $$4.b(this.b);
            $$0.h(1);
         }

         return bti.a;
      }

      return bti.e;
   }

   public cwl b() {
      return this.b;
   }

   public static cwm a(cwl $$0) {
      return a.get($$0);
   }

   @Override
   public boolean a(dhh $$0, dwj $$1, boolean $$2, cpw $$3) {
      if ($$1.a($$0x -> $$0x.a(this.b()), $$2)) {
         $$0.a(null, $$1.aB_(), axf.ig, axg.e, 1.0F, 1.0F);
         return true;
      } else {
         return false;
      }
   }
}
