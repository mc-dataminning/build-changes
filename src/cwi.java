import com.google.common.collect.Maps;
import java.util.Map;

public class cwi extends cxg implements cyo {
   private static final Map<cwh, cwi> a = Maps.newEnumMap(cwh.class);
   private final cwh b;

   public cwi(cwh $$0, cxg.a $$1) {
      super($$1);
      this.b = $$0;
      a.put($$0, this);
   }

   @Override
   public bte a(cxk $$0, cps $$1, bwb $$2, btd $$3) {
      if ($$2 instanceof cio $$4 && $$4.bL() && !$$4.x() && $$4.t() != this.b) {
         $$4.dV().a($$1, $$4, axf.if, axg.h, 1.0F, 1.0F);
         if (!$$1.dV().C) {
            $$4.b(this.b);
            $$0.h(1);
         }

         return bte.a;
      }

      return bte.e;
   }

   public cwh b() {
      return this.b;
   }

   public static cwi a(cwh $$0) {
      return a.get($$0);
   }

   @Override
   public boolean a(dha $$0, dwc $$1, boolean $$2, cps $$3) {
      if ($$1.a($$0x -> $$0x.a(this.b()), $$2)) {
         $$0.a(null, $$1.aB_(), axf.if, axg.e, 1.0F, 1.0F);
         return true;
      } else {
         return false;
      }
   }
}
